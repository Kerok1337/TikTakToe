
package javatest;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import static javatest.TikTakToe.*;
import javax.swing.*;

/**
 *
 * @author MZ
 */
public class Javatest {
    static JFrame fenster = createFrame();
    static JTextField textfeld1 = createTextfeld1();
    static JTextField textfeld2 = createTextfeld2();
    static JTextField textfeld3 = createTextfeld3();
    static JTextField textfeld4 = createTextfeld4();
    
    public static void main(String[] args) {
        JButton button1 = createButton1();
        JLabel label1 = createLabel1();
        JLabel label2 = createLabel2();
        JLabel label3 = createLabel3();
        fenster.add(button1);
        fenster.add(label1);
        fenster.add(textfeld1);
        fenster.add(label2);
        fenster.add(textfeld2);
        fenster.add(label3);
        fenster.add(textfeld3);
        fenster.add(textfeld4);
        fenster.repaint();
    }

    public static JFrame createFrame() {
        JFrame fenster = new JFrame();
        fenster.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        fenster.setVisible(true);
        fenster.setSize(800, 500);
        fenster.setLocation(350, 200);
        fenster.setResizable(false);
        fenster.setTitle("Test");
        fenster.setLayout(null);
        return fenster;
    }
    public static JButton createButton1() {
        JButton button1 = new JButton();
        button1.setSize(100, 30);
        button1.setText("Start");
        button1.setLocation(350, 250);
        button1.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent ae) {
                buttonClick();
            }
        });
        return button1;
    }
    public static JLabel createLabel1() {
        JLabel label1 = new JLabel();
        label1.setSize(400, 200);
        label1.setText("Willkommen bei Tik-Tak-Toe");
        label1.setLocation(250, 50);
        label1.setFont(new Font("Serif", Font.PLAIN, 24));
        return label1;
    }
    public static JLabel createLabel2() {
        JLabel label2 = new JLabel();
        label2.setSize(500, 100);
        label2.setText("Spieler 1");
        label2.setLocation(150, 270);
        label2.setFont(new Font("Serif", Font.PLAIN, 16));
        return label2;
    }
    public static JTextField createTextfeld1() {
        JTextField textfeld1 = new JTextField();
        textfeld1.setSize(200, 20);
        textfeld1.setLocation(150, 340);
        return textfeld1;
    }
    public static JLabel createLabel3() {
        JLabel label2 = new JLabel();
        label2.setSize(500, 100);
        label2.setText("Spieler 2");
        label2.setLocation(450, 270);
        label2.setFont(new Font("Serif", Font.PLAIN, 16));
        return label2;
    }
    public static JTextField createTextfeld2() {
        JTextField textfeld1 = new JTextField();
        textfeld1.setSize(200, 20);
        textfeld1.setLocation(450, 340);
        return textfeld1;
    }
    public static JTextField createTextfeld3() {
        JTextField textfeld1 = new JTextField();
        textfeld1.setSize(200, 20);
        textfeld1.setLocation(150, 400);
        return textfeld1;
    }
    public static JTextField createTextfeld4() {
        JTextField textfeld1 = new JTextField();
        textfeld1.setSize(200, 20);
        textfeld1.setLocation(450, 400);
        return textfeld1;
    }
    public static void buttonClick() {
        String spieler1 = textfeld1.getText();
        String spieler2 = textfeld2.getText();
        int spieler1guess = Integer.parseInt(textfeld3.getText());
        int spieler2guess = Integer.parseInt(textfeld4.getText());
        fenster.setVisible(false);
        startTikTakToe(spieler1, spieler2, spieler1guess, spieler2guess);
    }
}
