package demo2;

import java.net.URL;
import java.awt.*;
import java.awt.event.*;
import java.awt.image.*;
import com.sun.j3d.utils.universe.*;
import javax.media.j3d.*;
import javax.vecmath.*;
import java.io.*;
import javax.imageio.*;
import com.sun.j3d.utils.behaviors.mouse.*;
import com.sun.j3d.utils.geometry.*;
import java.applet.*;
import com.sun.j3d.utils.applet.MainFrame;

public class Ex6 extends Applet {
  public static void main(String[] args) {
    new MainFrame(new Ex6(), 640, 480);
  }

  public void init() {
    // create canvas
    GraphicsConfiguration gc = SimpleUniverse.getPreferredConfiguration();
    Canvas3D cv = new Canvas3D(gc);
    setLayout(new BorderLayout());
    add(cv, BorderLayout.CENTER);
    SimpleUniverse su = new SimpleUniverse(cv);
    AudioDevice audioDev = su.getViewer().createAudioDevice();
    BranchGroup bg = createSceneGraph();
    bg.compile();
    su.getViewingPlatform().setNominalViewingTransform();    
    su.addBranchGraph(bg);
  }
  
  public BranchGroup createSceneGraph() {
    // root
    BranchGroup root = new BranchGroup();
    TransformGroup spin = new TransformGroup();
    spin.setCapability(TransformGroup.ALLOW_TRANSFORM_WRITE);
    root.addChild(spin);
    // visual object
    Transform3D tr = new Transform3D();
    tr.rotX(-Math.PI/2);
    tr.setScale(0.25);
    TransformGroup tg = new TransformGroup(tr);
    spin.addChild(tg);
    Cone cone = new Cone();
    tg.addChild(cone);
    // rotation interpolator
    Alpha alpha = new Alpha(-1, 10000);
    RotationInterpolator rotator = new RotationInterpolator(alpha, spin);
    BoundingSphere bounds = new BoundingSphere();
    bounds.setRadius(10);
    rotator.setSchedulingBounds(bounds);
    spin.addChild(rotator);
    // sound
    ConeSound sound = new ConeSound();
    URL url = this.getClass().getClassLoader().getResource("images/bird.au");
    MediaContainer mc = new MediaContainer(url);
    sound.setSoundData(mc);
    sound.setLoop(Sound.INFINITE_LOOPS);
    sound.setInitialGain(1f);
    sound.setEnable(true);
    float[] distances = {1f, 20f};
    float[] gains = {1f, 0.001f};
    sound.setDistanceGain(distances, gains);
    BoundingSphere soundBounds =
    new BoundingSphere(new Point3d(0.0,0.0,0.0), 100.0);
    sound.setSchedulingBounds(soundBounds);
    tg.addChild(sound);
    //light
    AmbientLight light = new AmbientLight(true, new Color3f(Color.blue));
    light.setInfluencingBounds(bounds);
    root.addChild(light);
    PointLight ptlight = new PointLight(new Color3f(Color.white), 
      new Point3f(0f,0f,2f), new Point3f(1f,0.3f,0f));
    ptlight.setInfluencingBounds(bounds);
    root.addChild(ptlight);
    //background
    url = getClass().getClassLoader().getResource("images/bg.jpg");
    BufferedImage bi = null;
    try {
      bi = ImageIO.read(url);
    } catch (IOException ex) {
      ex.printStackTrace();
    }
    ImageComponent2D image = new ImageComponent2D(ImageComponent2D.FORMAT_RGB, bi);
    Background background = new Background(image);
    background.setApplicationBounds(bounds);
    root.addChild(background);
    return root;
  }
}
