/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package gamecaro;

import java.io.*;
import javax.swing.*;
import javax.swing.event.*;
import java.awt.*;
import java.awt.event.*;
import java.net.*;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Client {
    public static JFrame f ;
    JButton[][] bt ;
    static boolean flat = false ;//Kiem tra button click
    boolean winner;
    //module thoi gian
    Timer thoigian ;//Tao doi tuong dem thoi gian
    Integer second,minute ;
    JLabel demthoigian;
    //module chat va label
    JTextArea textout,textin ;
    JButton send ;
    JScrollPane jscroll1,jscroll2 ;
    JLabel label1,label2,label3 ;
    //module ban co
    JPanel p;
    int xx,yy,x,y;
    int [][]matran;//danh dau vi tri doi thu danh
    int [][]matrandanh;//danh dau vi tri minh danh
    //Client Socket
    Socket socket ;
    OutputStream os ;//....
    InputStream is ;//......
    ObjectOutputStream oos ;//.........
    ObjectInputStream ios ;//.......
    //menu bar
    MenuBar menubar ;
    /////
    public Client(){
        f = new JFrame();
        f.setTitle("Client - Gà Tây");
        f.setSize(700, 500);
        x=10;y=10;
        f.getContentPane().setLayout(null);
        f.getContentPane().setBackground(Color.BLACK);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setVisible(true);
        f.setResizable(false);
        //
        matran = new int[x][y];//ma tran ban co
        matrandanh = new int[x][y];//ma tran danh dau vi tri danh
        menubar = new MenuBar();
        p = new JPanel();
        p.setBounds(10, 30, 400, 400);
        p.setLayout(new GridLayout(x,y));
        f.add(p);
        //module chat(MDC)
        send = new JButton("GỬI");
        send.setBounds(625,360 , 60, 49);
        send.setBackground(Color.WHITE);
        textin = new JTextArea();//chat in
        textout = new JTextArea();//
        f.add(send);
        jscroll1 = new JScrollPane();
        jscroll2 = new JScrollPane();
        jscroll2.setBounds(420, 200, 265, 150);
        textout.setLineWrap(true);
        textout.setEnabled(true);
        f.getContentPane().add(jscroll2);
        jscroll2.setViewportView(textout);
        //MDC--scroll to bottom
        jscroll2.getVerticalScrollBar().addAdjustmentListener(new AdjustmentListener(){
            @Override
            public void adjustmentValueChanged(AdjustmentEvent e) {
                e.getAdjustable().setValue(e.getAdjustable().getMaximum());
            }          
        });
        //MDC--textin
        f.getContentPane().add(jscroll1);
        jscroll1.setViewportView(textin);
        jscroll1.setBounds(420, 360, 200, 50);
        textin.setLineWrap(true);
        //
        textin.addKeyListener(new KeyListener(){

            @Override
            public void keyTyped(KeyEvent e) {
                //throw new UnsupportedOperationException("Not supported yet.");
            }

            @Override
            public void keyPressed(KeyEvent e) {
                if(e.getKeyCode()==10){
                    send.doClick();
                }
            }

            @Override
            public void keyReleased(KeyEvent e) {
                if(e.getKeyCode()==10){
                    textin.setText("");
                }
            }
            
        });
        //MDC-textin &textout
        send.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try{
                    if(textin.getText().equals("")==false){
                    oos.writeObject("chat,"+textin.getText());
                    textout.append("Tôi:"+textin.getText()+'\n');
                    }
                }catch(IOException ex){
                    ex.printStackTrace();
                    System.out.println("Loi1");
                }
                textin.setText("");
            }
        });
        //MDC-Hien thi thoi gian game
        demthoigian = new JLabel("Thời Gian:");
        demthoigian.setFont(new Font("TimesRoman",Font.ITALIC,16));
        demthoigian.setForeground(Color.GREEN);
        f.add(demthoigian);
        demthoigian.setBounds(430, 120, 300, 50);
        second =0;
        minute =0;
        thoigian = new Timer(1000,new ActionListener(){

            @Override
            public void actionPerformed(ActionEvent e) {
                String temp = minute.toString();
                String temp1 = second.toString();
                if(temp.length()==1){
                    temp = "0"+temp;
                }
                if(temp1.length()==1){
                    temp1="0"+temp1;
                }
                if(second ==59){
                    demthoigian.setText("Thời Gian:"+temp+":"+temp1);
                    minute ++;
                    second=0;
                }else{
                    demthoigian.setText("Thời Gian:"+temp+":"+temp1);
                    second++;
                }
                
            }
            
        });
        //
        label1 = new JLabel("PHẦN MỀM CHƠI GAME");
        label2 = new JLabel("CỜ CARO VÀ CHAT");
        label3 = new JLabel("Nhóm:CHICKEN_ET02");
        label1.setBounds(430, 40, 300, 50);
        label2.setBounds(450, 65, 300, 50);
        label3.setBounds(430, 90, 300, 50);
        label1.setFont(new Font("TimesRoman",Font.BOLD,20));
        label1.setForeground(Color.red);
        label2.setFont(new Font("TimesRoman",Font.BOLD,20));
        label2.setForeground(Color.red);
        label3.setFont(new Font("TimesRoman",Font.ITALIC,16));
        label3.setForeground(Color.GREEN);
        f.add(label1);
        f.add(label2);
        f.add(label3);
        //menu bar game
        f.setMenuBar(menubar);//tao menubar cho frame
        Menu game = new Menu("Game");
        menubar.add(game);
        Menu help = new Menu("Help");
        menubar.add(help);
        MenuItem helpItem = new MenuItem("Help");
        help.add(helpItem);
        MenuItem about = new MenuItem("About ..");
        help.add(about);
        help.addSeparator();
        MenuItem newItem = new MenuItem("New Game");
        game.add(newItem);
        MenuItem exit = new MenuItem("Exit");
        game.add(exit);
        game.addSeparator();
        newItem.addActionListener(new ActionListener(){

            @Override
            public void actionPerformed(ActionEvent e) {
                newgame();
                try{
                    oos.writeObject("newgame,123");
                }catch(IOException ie){
                    //
                }
            }
            
        });
        exit.addActionListener(new ActionListener(){

            @Override
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }           
        });
        ///Game Caro
        bt=new JButton[x][y];
        for (int i=0;i<x;i++){
            for(int j=0;j<y;j++){
                final int a=i,b=j;
                bt[a][b]= new JButton();//o ban co
                bt[a][b].setBackground(Color.ORANGE);
                bt[a][b].addActionListener(new ActionListener(){

                    @Override
                    public void actionPerformed(ActionEvent e) {
                        flat = true ;//server da click
                        thoigian.start();
                        matrandanh[a][b]=1;
                        bt[a][b].setEnabled(false);
                        if(Server.flat)//new ben server click
                            setEnableButton(true);
                        else 
                            setEnableButton(false);
                        bt[a][b].setIcon(new ImageIcon("E:\\STUDY\\Java\\cocaro\\src\\caro\\x1.png"));
                        try{
                            oos.writeObject("caro,"+a+","+b);
                        }catch(IOException ie){
                            ie.printStackTrace();
                        }
                    }
                    
                });
                p.add(bt[a][b]);
            }
        }
        ///main
        initMatran();
        try{
            socket = new Socket("localhost",1234);
            System.out.println("Da ket noi toi server!");
            os=socket.getOutputStream();
            is=socket.getInputStream();
            oos= new ObjectOutputStream(os);
            ios= new ObjectInputStream(is);
            while(true){
                String stream = ios.readObject().toString();
                String[] data = stream.split(",");
                if(data[0].equals("chat")){
                    textout.append("Khach:"+data[1]+'\n');
                }else if(data[0].equals("caro")){
                    thoigian.start();
                    caro(data[1],data[2]);
                    if(winner==false)
                        setEnableButton(true);
                }else if(data[0].equals("newgame")){
                    newgame();
                    second =0;
                    minute =0;
                    //thoigian.start();
                }else if(data[0].equals("checkwin")){
                    thoigian.stop();
                }
            }
        }catch(Exception ie){
            //ie.printStackTrace();
        }finally{
            try {
                socket.close();
            } catch (IOException ex) {
                Logger.getLogger(Client.class.getName()).log(Level.SEVERE, null, ex);
            }
        }      
    }
    public void caro(String x,String y){
        xx=Integer.parseInt(x);
        yy=Integer.parseInt(y);
        //danh dau vi tri danh
        matran[xx][yy]=1;
        matrandanh[xx][yy]=1;
        bt[xx][yy].setEnabled(false);
        bt[xx][yy].setIcon(new ImageIcon("E:\\STUDY\\Java\\cocaro\\src\\caro\\o1.png"));
        //Kiem tra thang hay chua
        System.out.println("CheckH:"+checkHang());
        System.out.println("CheckC:"+checkCot());
        System.out.println("CheckCp:"+checkCheoPhai());
        System.out.println("CheckCt:"+checkCheoTrai());
        winner = (checkHang()==1||checkCot()==1||checkCheoPhai()==1||checkCheoTrai()==1);
        if(checkHang()==1||checkCot()==1||checkCheoPhai()==1||checkCheoTrai()==1){
            setEnableButton(false);
            thoigian.stop();
            try {
                oos.writeObject("checkwin,123");
            } catch (IOException ex) {
                //
            }
            Object[]options={"Dong y","Huy bo"};
            int m=JOptionPane.showConfirmDialog(f,"Ban da thua.Ban co muon choi lai khong?","Thong bao",JOptionPane.YES_NO_OPTION);
            if (m==JOptionPane.YES_OPTION){
                second =0;
                minute =0;
                setVisiblePanel(p);
                newgame();
                try{
                    oos.writeObject("newgame,123");
                }catch(IOException ie){
                    //
                }
            }else if(m==JOptionPane.NO_OPTION){
                thoigian.stop();
            }
        }
    }
    public void newgame(){
        for(int i=0;i<x;i++)
            for(int j=0;j<y;j++){
                bt[i][j].setIcon(null);
                matran[i][j]=0;
                matrandanh[i][j]=0;
            } 
            setEnableButton(true);
            second =0;
            minute =0;
            thoigian.stop();
    }
    public void setEnableButton(boolean b){
        for (int i=0;i<x;i++)
            for (int j=0;j<y;j++){
                if (matrandanh[i][j]==0)
		bt[i][j].setEnabled(b);
	}
    }
    public void setVisiblePanel(JPanel pHienthi){
	f.add(pHienthi);
	pHienthi.setVisible(true);
	pHienthi.updateUI();//......
    }
    public void initMatran(){
	for (int i=0;i<x;i++)
            for (int j=0;j<y;j++){
		matran[i][j]=0;
	}
    }
    ///thuat toan tinh thang thua
    public int checkHang(){
	int win=0,hang=0,n=0,k=0;
	boolean check=false;
	for (int i=0;i<x;i++){
            for (int j=0;j<y;j++){
		if (check){
                    if (matran[i][j]==1){
			hang++;
			if (hang>4){
                            win=1;
                            break;
			}
			continue;
                    }else {
			check=false;
			hang=0;
                    }
		}
		if (matran[i][j]==1){
                    check=true;
                    hang++;
		}else{
                    check = false ;
                }
            }
            hang=0;
	}
	return win;
    }
    public int checkCot(){
        int win=0,cot=0;
	boolean check=false;
	for (int j=0;j<y;j++){
            for (int i=0;i<x;i++){
		if (check){
                    if (matran[i][j]==1){
			cot++;
			if (cot>4){
                            win=1;
                            break;
			}
			continue;
                    }else {
                    check=false;
                    cot=0;
                    }
		}
		if (matran[i][j]==1){
                    check=true;
                    cot++;
		}else{
                    check = false ;
                }
            }
            cot=0;
	}
	return win;
    }
    public int checkCheoPhai(){
	int win=0,cheop=0,n=0,k=0;
	boolean check=false;
	for (int i=x-1;i>=0;i--){
            for (int j=0;j<y;j++){                            
		if (check){
                    if (matran[n-j][j]==1){
                        cheop++;
                        if(cheop>4){
                            win=1;
                            break;
			}
			continue;
                    }else {
                    check=false;
                    cheop=0;
                    }
		}
		if (matran[i][j]==1){
                    n=i+j;
                    check=true;
                    cheop++;
		}else{
                    check = false ;
                }
            }
            cheop =0;
            check = false ;
        }
        return win;
    }
    public int checkCheoTrai(){
	int win=0,cheot=0,n=0;
	boolean check=false;
	for (int i=0;i<x;i++){
            for (int j=y-1;j>=0;j--){
		if (check){
                    if (matran[n-j-2*cheot][j]==1){
			cheot++;
                        System.out.print("+"+j);
                            if (cheot>4){
                            win=1;
                            break;
			}
			continue;
                    }else {
			check=false;
			cheot=0;
                    }
		}
		if (matran[i][j]==1){
                    n=i+j;
                    check=true;
                    cheot++;
		}else{
                    check = false ;
                }
            }
            n=0;
            cheot = 0 ;
            check = false ;
        }
	return win;
    }
   
    public static void main(String[] args) {
        // TODO code application logic here
        new Client();
    }
}