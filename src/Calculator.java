import javax.swing.*;
import java.awt.*;
import java.awt.event.*;


public class Calculator {
    JFrame f;
    JPanel p;
    JTextField txt;
    String s0, s1, s2;
    Operations operations = new Operations();

    //numbers
    JButton b0;
    JButton b1;
    JButton b2;
    JButton b3;
    JButton b4;
    JButton b5;
    JButton b6;
    JButton b7;
    JButton b8;
    JButton b9;
    JButton point;
    //operations
    JButton ba;
    JButton bs;
    JButton bd;
    JButton bm;
    JButton beq;
    JButton bc;


    Calculator() {
        f = new JFrame("Calc");


        //panel and its paramteres
        p = new JPanel();
        p.setBounds(20, 125, 250, 300);


        //text field and paramteres
        txt = new JTextField();
        txt.setBounds(20, 25, 250, 50);

        //buttons

        //numbers buttons
        createButton("0", b0, 155, 315);
        createButton("1", b1, 95, 135);
        createButton("2", b2, 155, 135);
        createButton("3", b3, 215, 135);
        createButton("4", b4, 95, 195);
        createButton("5", b5, 155, 195);
        createButton("6", b6, 215, 195);
        createButton("7", b7, 95, 255);
        createButton("8", b8, 155, 255);
        createButton("9", b9, 215, 255);
        //operations button
        createButton("+", ba, 35, 135);
        createButton("-", bs, 35, 195);
        createButton("/", bd, 35, 255);
        createButton("x", bm, 35, 315);
        createButton("=", beq, 375, 100);
        createButton("C", bc, 215, 315);
        createButton(".", point, 95, 315);


        //frame
        f.add(txt); f.add(p);
        f.setLayout(null);
        f.setSize(300, 500);
        f.setVisible(true);
        f.setResizable(false);
    }



    public void createButton(String s, JButton button, int x, int y) {
            button = new JButton(s);
            button.addActionListener(operations);
            button.setBounds(x, y, 50, 50);
            f.add(button);
        }


    public class Operations implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {
            

        }

    }


    public static void main(String[] args) {
        new Calculator();
    }
}
