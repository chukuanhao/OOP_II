package week5;


import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.io.IOException;
import java.io.File;
import javax.swing.ImageIcon; 

public class HomeWork5 {
    public static void main(String[] args) {
        Myframe mf = new Myframe();
    }
}

class Myframe extends JFrame
{   
    private JPanel contentPane;
    private int numOfPhoto=0;
    private JLabel jl, jtext;

    public Myframe(){

        contentPane=new JPanel();
        contentPane.setLayout(new BorderLayout());
        
        JButton btn1 = new JButton("last");
        JButton btn2 = new JButton("next");
        ImageIcon[] Icons  = {new ImageIcon("./image/1.jpg"),new ImageIcon("./image/2.jpg"),new ImageIcon("./image/3.jpg")};
        String[] iconsName = {"1.jpg","2.jpg","3.jpg"};
        jl=new JLabel(Icons[0]);
        jtext=new JLabel(iconsName[0]);
        contentPane.add(btn1, BorderLayout.WEST);
        contentPane.add(jl, BorderLayout.CENTER);
        contentPane.add(btn2, BorderLayout.EAST);   
        contentPane.add(jtext, BorderLayout.NORTH);

        btn1.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                // TODO Auto-generated method stub
                if(numOfPhoto>0){
                    numOfPhoto -= 1;
                    System.out.println(numOfPhoto);
                    jl.setIcon(Icons[numOfPhoto]);
                    jtext.setText(iconsName[numOfPhoto]);
                }else{
                    JOptionPane.showMessageDialog(getContentPane(), "its already first one!");
                }
            }
        });
        
        btn2.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                // TODO Auto-generated method stub
                if(numOfPhoto<Icons.length-1){
                    numOfPhoto += 1;
                    System.out.println(numOfPhoto);
                    jl.setIcon(Icons[numOfPhoto]);
                    jtext.setText(iconsName[numOfPhoto]);
                }else{
                    JOptionPane.showMessageDialog(getContentPane(), "its already last one!");
                }
            }
        });
        //ImageIcon img = new ImageIcon("D:\\Java\\week5\\test.png\\test.png");
        
        

        this.setContentPane(contentPane);

        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setTitle("Photo");
        this.setBounds(100,100,600,400);
        this.setVisible(true);

        
    }


}
