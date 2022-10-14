package week4;

import javax.swing.*;

import java.awt.*;
import java.awt.event.*;

public class HomeWork4 {
    public static void main(String[] args) {
        MyFrame f =new MyFrame();
    }
}

class MyFrame extends JFrame{
    JPanel number = new JPanel();
    JPanel simbol = new JPanel();
    JTextArea text = new JTextArea(3,10);
    Font font = new Font("Segoe Script", Font.BOLD, 20);
    String simbolString="";

    MyFrame(){
        text.setFont(font);

        JButton[] numbers = { new JButton("7"), new JButton("8"), new JButton("9"), new JButton("4"), new JButton("5"), new JButton("6"), new JButton("1"), new JButton("2"), new JButton("3"), new JButton("0"), new JButton("."), new JButton("=")}; 
        JButton[] simbols = { new JButton("*"), new JButton("-"), new JButton("+"), new JButton("/")};

        


        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setTitle("Hello World");
        setBounds(100, 100, 400, 400);
        this.getContentPane().setBackground(Color.BLACK);
        setVisible(true);
        
        number.setLayout(new GridLayout(4,3));
        simbol.setLayout(new GridLayout(4,1));
        

        for(JButton x: numbers){
            x.addActionListener(new ActionListener(){
                @Override
                public void actionPerformed(ActionEvent e) {
                    // TODO Auto-generated method stub
                    if(!e.getActionCommand().equals("=")){
                        text.setText(text.getText()+e.getActionCommand());
                    }else{
                        try{
                            String[] parts = text.getText().split("\\"+simbolString);
                            double firstNum = Double.parseDouble(parts[0]);
                            double secondNum = Double.parseDouble(parts[1]);
                            text.setText("");
                            
                            if(simbolString.equals("+")){

                                text.setText("="+(firstNum+secondNum));
                            }else if(simbolString.equals("-")){

                                text.setText("="+(firstNum-secondNum));
                            }else if(simbolString.equals("*")){

                                text.setText("="+(firstNum*secondNum));
                            }else if(simbolString.equals("/")){

                                text.setText("="+(firstNum/secondNum));
                            }

                        }catch(Exception exp){
                            System.out.println(exp.getMessage());
                        }
                        
                    }
                }
            });

            number.add(x);
        }

        for(JButton x: simbols){
            
            x.addActionListener(new ActionListener(){
                @Override
                public void actionPerformed(ActionEvent e) {
                    // TODO Auto-generated method stub
                    simbolString=e.getActionCommand();
                    text.setText(text.getText()+e.getActionCommand());
                    System.out.println(e.getActionCommand());
                }
            });

            simbol.add(x);
        }
        this.add(number);
        this.add(simbol, BorderLayout.EAST);
        this.add(text, BorderLayout.NORTH);
    }
}

