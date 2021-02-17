package javatest;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;
import static javatest.Javatest.createFrame;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

/**
 *
 * @author MZ
 */
public class TikTakToe {
    static JFrame fenster = createFrame();
    static int loc1 = 250;
    static int loc2 = 100;
    static int spieler1g;
    static int spieler2g;
    static JLabel player1;
    static JLabel player2;
    static int actualplayer;
    
    static JButton button1 = new JButton();
    static JButton button2 = new JButton();
    static JButton button3 = new JButton();
    static JButton button4 = new JButton();
    static JButton button5 = new JButton();
    static JButton button6 = new JButton();
    static JButton button7 = new JButton();
    static JButton button8 = new JButton();
    static JButton button9 = new JButton();
    
    static int button1allg;
    static int button2allg;
    static int button3allg;
    static int button4allg;
    static int button5allg;
    static int button6allg;
    static int button7allg;
    static int button8allg;
    static int button9allg;
    
    public static void startTikTakToe(String spieler1, String spieler2, int spieler1guess, int spieler2guess) {
        spieler1g = spieler1guess;
        spieler2g = spieler2guess;
        JLabel beg = new JLabel();
        beg.setText("Es beginnt der Spieler:");
        beg.setSize(200, 20);
        beg.setLocation(350, 20);
        player1 = spieler(spieler1);
        fenster.add(player1);
        player2 = spieler(spieler2);
        fenster.add(player2);
        fenster.setTitle("TikTakToe");
        fenster.setVisible(true);
        fenster.add(beg);
        firstTurn();
        buttons();
        //fenster.add();
    }
    public static JLabel spieler (String spieler1string) {
        JLabel spieler1 = new JLabel();
        spieler1.setSize(200, 20);
        spieler1.setText(spieler1string);
        spieler1.setLocation(350, 40);
        return spieler1;
    }
    public static void buttons () {
        for(int i=0;i<=9;i++) {
            switch(i) {
                case 1:
                    button1.setLocation(loc1, loc2);
                    button1.setSize(80, 80);
                    fenster.add(button1);
                            button1.addActionListener(new ActionListener(){
                                public void actionPerformed(ActionEvent ae) {
                                    button1allg = actualplayer;
                                    buttonClick(button1);
                                    nextTurn();
                                }}); 
                            break;  
                case 2:
                    loc1 += 100;
                    button2.setLocation(loc1, loc2);
                    button2.setSize(80, 80);
                    fenster.add(button2);
                            button2.addActionListener(new ActionListener(){
                                public void actionPerformed(ActionEvent ae) {
                                    button2allg = actualplayer;
                                    buttonClick(button2);
                                    nextTurn();
                                }});
                            break;  
                case 3:
                    loc1 += 100;
                    button3.setLocation(loc1, loc2);
                    button3.setSize(80, 80);
                    fenster.add(button3);
                            button3.addActionListener(new ActionListener(){
                                public void actionPerformed(ActionEvent ae) {
                                    button3allg = actualplayer;
                                    buttonClick(button3);
                                    nextTurn();
                                }}); 
                            break;  
                case 4:
                    loc1 = 250;
                    loc2 += 100;
                    button4.setLocation(loc1, loc2);
                    button4.setSize(80, 80);
                    fenster.add(button4);
                            button4.addActionListener(new ActionListener(){
                                public void actionPerformed(ActionEvent ae) {
                                    button4allg = actualplayer;
                                    buttonClick(button4);
                                    nextTurn();
                                }}); 
                            break;  
                case 5:
                    loc1 += 100;
                    button5.setLocation(loc1, loc2);
                    button5.setSize(80, 80);
                    fenster.add(button5);
                            button5.addActionListener(new ActionListener(){
                                public void actionPerformed(ActionEvent ae) {
                                    button5allg = actualplayer;
                                    buttonClick(button5);
                                    nextTurn();
                                }}); 
                            break;  
                case 6:
                    loc1 += 100;
                    button6.setLocation(loc1, loc2);
                    button6.setSize(80, 80);
                    fenster.add(button6);
                            button6.addActionListener(new ActionListener(){
                                public void actionPerformed(ActionEvent ae) {
                                    button6allg = actualplayer;
                                    buttonClick(button6);
                                    nextTurn();
                                }}); 
                            break;  
                case 7:
                    loc2 +=100;
                    loc1 = 250;
                    button7.setLocation(loc1, loc2);
                    button7.setSize(80, 80);
                    fenster.add(button7);
                            button7.addActionListener(new ActionListener(){
                                public void actionPerformed(ActionEvent ae) {
                                    button7allg = actualplayer;
                                    buttonClick(button7);
                                    nextTurn();
                                }}); 
                            break;  
                case 8:
                    loc1 += 100;
                    button8.setLocation(loc1, loc2);
                    button8.setSize(80, 80);
                    fenster.add(button8);
                            button8.addActionListener(new ActionListener(){
                                public void actionPerformed(ActionEvent ae) {
                                    button8allg = actualplayer;
                                    buttonClick(button8);
                                    nextTurn();
                                }}); 
                            break;  
                case 9:
                    loc1 +=100;
                    button9.setLocation(loc1, loc2);
                    button9.setSize(80, 80);
                    fenster.add(button9);
                            button9.addActionListener(new ActionListener(){
                                public void actionPerformed(ActionEvent ae) {
                                    button9allg = actualplayer;
                                    buttonClick(button9);
                                    nextTurn();
                                }}); 
                            break;  
            }
        }
    }
    public static void firstTurn() {
        Random random = new Random();
        int number = random.nextInt(100);
        if (number - spieler1g < number - spieler2g) {
            player2.setVisible(false);
            actualplayer = 1;
        } else {
            player1.setVisible(false);
            actualplayer = 2;
        }
    }
    public static void nextTurn() {
        if (actualplayer == 1) {
            player2.setVisible(true);
            player1.setVisible(false);
            actualplayer = 2;
        } else {
            player1.setVisible(true);
            player2.setVisible(false);
            actualplayer = 1;
        }
    }
    public static void buttonClick(JButton button) {
        if (actualplayer == 1) {
            button.setText("X");
        } else {
            button.setText("O");
        }
        button.setEnabled(false);
        alleAusgeben();
        checkWin();
    }
    public static void checkWin () {
        if (button1allg == actualplayer && button2allg == actualplayer && button3allg == actualplayer) {
               gewonnen();
        } else 
            if(button1allg == actualplayer && button4allg == actualplayer && button7allg == actualplayer) {
               gewonnen();
        } else 
            if (button1allg == actualplayer && button5allg == actualplayer && button9allg == actualplayer) {
               gewonnen(); 
        } else
            if (button2allg == actualplayer && button5allg == actualplayer && button8allg == actualplayer) {
               gewonnen();     
        } else
            if (button3allg == actualplayer && button6allg == actualplayer && button9allg == actualplayer) {
               gewonnen();         
        } else 
            if (button3allg == actualplayer && button5allg == actualplayer && button7allg == actualplayer) {
               gewonnen();
        } else
            if (button4allg == actualplayer && button5allg == actualplayer && button6allg == actualplayer) {
               gewonnen();
        } else
            if (button7allg == actualplayer && button8allg == actualplayer && button9allg == actualplayer) {
                gewonnen();
            }
    }
    public static void alleAusgeben() {
        System.out.println("button1"+button1allg);
        System.out.println("button2"+button2allg);
        System.out.println("button3"+button3allg);
        System.out.println("button4"+button4allg);
        System.out.println("button5"+button5allg);
        System.out.println("button6"+button6allg);
        System.out.println("button7"+button7allg);
        System.out.println("button8"+button8allg);
        System.out.println("button9"+button9allg);
    }
    public static void gewonnen () {
        fenster.setTitle("Gewonnen hat " + actualplayer);
        fenster.setEnabled(false);
        JFrame resetFrame = new JFrame();
        JButton resetbutton = new JButton(); 
        resetFrame.setSize(300, 200);
        resetFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        resetFrame.setResizable(false);
        resetbutton.setText("Reset");
        resetFrame.add(resetbutton);
        resetFrame.setVisible(true);
        resetbutton.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent ae) {
                fenster.setEnabled(true);
                fenster.setTitle("TikTakToe");
                reset();
                resetFrame.setVisible(false);
            }});
    }
    public static void reset () {
        button1.setEnabled(true);
        button2.setEnabled(true);
        button3.setEnabled(true);
        button4.setEnabled(true);
        button5.setEnabled(true);
        button6.setEnabled(true);
        button7.setEnabled(true);
        button8.setEnabled(true);
        button9.setEnabled(true);
        button1.setText("");
        button2.setText("");
        button3.setText("");
        button4.setText("");
        button5.setText("");
        button6.setText("");
        button7.setText("");
        button8.setText("");
        button9.setText("");
        button1allg = 0;
        button2allg = 0;
        button3allg = 0;
        button4allg = 0;
        button5allg = 0;
        button6allg = 0;
        button7allg = 0;
        button8allg = 0;
        button9allg = 0;
    }
}
