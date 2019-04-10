package OnTap;

import java.applet.Applet;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
 
public class Demo extends Applet implements ActionListener{
 
    private static final long serialVersionUID = 1L;
    private JButton btEclipse = new JButton("Oval");
    private JButton btRectangle = new JButton("Rectangle");
    private int mode = 0;
     
    @Override
    public void init(){
        initComponent(); // khởi tạo các components
        btEclipse.addActionListener(this); // nạp sự kiện cho nút btEclipse
        btRectangle.addActionListener(this);
    }
 
    // khởi tạo các components
    public void initComponent(){
        this.setLayout(new FlowLayout()); // đặt layout cho applet
        this.setSize(300, 200); // đặt kích thước cho applet
        this.add(btEclipse); // thêm nút btEclipse lên Applet
        this.add(btRectangle); // thêm nút btRectangle lên Applet
        this.setVisible(true); // hiển thị các component trên applet
    }
     
    @Override
    public void actionPerformed(ActionEvent ae ){
        if(ae.getSource() == btEclipse){ // nếu ấn nút btEclipse
            mode = 1;
        }
        if(ae.getSource() == btRectangle){ // nếu ấn nút btRectangle
            mode = 2;
        }
         
        repaint(); // vẽ lại toàn bộ các hiển thị trên applet (hàm này sẽ tự động gọi cả hàm paint(Graphics ) )
         
    }
     
    @Override
    public void paint(Graphics g){
        super.paint(g); // gọi lại hàm paint của lớp cha nhằm vẽ lại các component
        g.setColor(Color.BLUE); // đặt màu cho nét vẽ
        if(mode == 2){
            g.drawRect(20, 50, 70, 80); // vẽ hình chữ nhật
            showStatus("Hình Chữ nhật"); // hiển thị thông tin lên thanh trạng thái
        }
         
        if(mode == 1){
            g.drawOval(50, 50, 40, 80); // vẽ hình oval
            showStatus("Hình Oval"); // hiển thị thông tin lên thanh trạng thái
        }
    }
}