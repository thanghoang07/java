package demo2;

import javax.vecmath.*;
import java.awt.*;
import java.awt.event.*;
import javax.media.j3d.*;
import com.sun.j3d.utils.universe.*;
import com.sun.j3d.utils.geometry.*;
import java.applet.*;
import com.sun.j3d.utils.applet.MainFrame;
import com.sun.j3d.utils.picking.PickTool;
import com.sun.j3d.utils.picking.behaviors.*;

public class Ex2 extends Applet implements PickingCallback {
  public static void main(String[] args) {
    new MainFrame(new Ex2(), 640, 480);
  }

  Geometry cubeGeometry;
  Point3d[][] ctrlPts = new Point3d[4][4];
  TransformGroup[][] tgPts = new TransformGroup[4][4];
  BezierSurface surface;
  
  public void init() {
    // create canvas
    GraphicsConfiguration gc = SimpleUniverse.getPreferredConfiguration();
    Canvas3D cv = new Canvas3D(gc);
    setLayout(new BorderLayout());
    add(cv, BorderLayout.CENTER);
    BranchGroup bg = createSceneGraph(cv);
    bg.compile();
    SimpleUniverse su = new SimpleUniverse(cv);
    su.getViewingPlatform().setNominalViewingTransform();
    su.addBranchGraph(bg);
  }

  private BranchGroup createSceneGraph(Canvas3D cv) {
    BranchGroup root = new BranchGroup();
    TransformGroup spin = new TransformGroup();
    spin.setCapability(TransformGroup.ALLOW_TRANSFORM_WRITE);
    root.addChild(spin);
    // surface
    for (int i = 0; i < 4; i++) {
      for (int j = 0; j < 4; j++) {
        ctrlPts[i][j] = new Point3d(2-i, 3*(Math.random()-0.5), j-2);
      }
    }
    surface = new BezierSurface(ctrlPts);
    surface.setCapability(Shape3D.ALLOW_GEOMETRY_WRITE);
    Appearance ap = new Appearance();
    ap.setMaterial(new Material());
    surface.setAppearance(ap);
    Transform3D tr = new Transform3D();
    tr.setScale(0.25);
    TransformGroup tg = new TransformGroup(tr);
    spin.addChild(tg);
    tg.addChild(surface);
    // show control points
    cubeGeometry = cube();
    for (int i = 0; i < 4; i++) {
      for (int j = 0; j < 4; j++) {
        tg.addChild(tgPts[i][j] = createDot(ctrlPts[i][j]));
      }
    }
    BoundingSphere bounds = new BoundingSphere();    
    // translation
    PickTranslateBehavior translator = new PickTranslateBehavior(root, cv,
      bounds, PickTool.GEOMETRY);
    translator.setupCallback(this);
    root.addChild(translator);
    // zoom
    PickZoomBehavior zoom = new PickZoomBehavior(root, cv, bounds,
      PickTool.GEOMETRY);
    zoom.setupCallback(this);
    root.addChild(zoom);
    // background and lights
    Background background = new Background(1f, 1f, 1f);
    background.setApplicationBounds(bounds);
    root.addChild(background);
    AmbientLight light = new AmbientLight(true, new Color3f(Color.red));
    light.setInfluencingBounds(bounds);
    root.addChild(light);
    PointLight ptlight = new PointLight(new Color3f(Color.lightGray),
    new Point3f(1f,1f,1f), new Point3f(1f,0f,0f));
    ptlight.setInfluencingBounds(bounds);
    root.addChild(ptlight);
    return root;
  }
  
  public void transformChanged(int type, TransformGroup tg) {
    if (type == PickingCallback.TRANSLATE || type == PickingCallback.ZOOM) {
      Transform3D tx = new Transform3D();
      tg.getTransform(tx);
      Vector3d v = new Vector3d();
      tx.get(v);
      System.out.println(v.x + "," + v.y + "," + v.z);
      changeSurface();
    }
  }
  
  private void changeSurface() {
    Transform3D tx = new Transform3D();
    Vector3d v = new Vector3d();
    for (int i = 0; i < 4; i++) {
      for (int j = 0; j < 4; j++) {
        tgPts[i][j].getTransform(tx);
        tx.get(v);
        ctrlPts[i][j].set(v);
      }
    }
    surface.setPoints(ctrlPts);
  }
  
  private TransformGroup createDot(Point3d pt) {
    // transform
    Transform3D trans = new Transform3D();
    trans.setTranslation(new Vector3d(pt));
    TransformGroup spin = new TransformGroup(trans);
    spin.setCapability(TransformGroup.ALLOW_TRANSFORM_WRITE);
    spin.setCapability(TransformGroup.ALLOW_TRANSFORM_READ);
    spin.setCapability(TransformGroup.ENABLE_PICK_REPORTING);
    // visual objects
    Appearance ap = new Appearance();
    ap.setColoringAttributes(new ColoringAttributes(0f, 0f, 0f, 
      ColoringAttributes.FASTEST));
    Shape3D shape = new Shape3D(cubeGeometry, ap);
    PickTool.setCapabilities(shape, PickTool.INTERSECT_FULL);
    spin.addChild(shape);
    return spin;
  }
  
  private Geometry cube() {
    IndexedQuadArray qa = new IndexedQuadArray(8, GeometryArray.COORDINATES, 24);
    float r = 0.05f;
    qa.setCoordinate(0, new Point3f(-r,-r,-r));
    qa.setCoordinate(1, new Point3f(-r,-r,r));
    qa.setCoordinate(2, new Point3f(r,-r,r));
    qa.setCoordinate(3, new Point3f(r,-r,-r));
    qa.setCoordinate(4, new Point3f(-r,r,-r));
    qa.setCoordinate(5, new Point3f(-r,r,r));
    qa.setCoordinate(6, new Point3f(r,r,r));
    qa.setCoordinate(7, new Point3f(r,r,-r));
    int[] idx = {0,3,2,1,
    0,1,5,4, 1,2,6,5, 2,3,7,6, 3,0,4,7,
    4,5,6,7};
    qa.setCoordinateIndices(0, idx);
    return qa;
  }
}
