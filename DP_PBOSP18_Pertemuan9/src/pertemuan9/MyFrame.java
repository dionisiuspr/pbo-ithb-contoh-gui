/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pertemuan9;

import java.awt.Dimension;
import java.awt.HeadlessException;
import javax.swing.JComponent;
import javax.swing.JFrame;

/**
 *
 * @author UX430UN
 */
public class MyFrame extends JFrame {

    public MyFrame(){
        initComponents();
    }

    private void initComponents() {
        //Create and set up the window.
        this.setTitle("Beeper");
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setLocation(500, 600);

        //Create and set up the content pane.
        JComponent newContentPane = new Beeper();
        newContentPane.setSize(new Dimension(200, 80));
        newContentPane.setLocation(0, 0);
        this.add(newContentPane);

        //Display the window.
        this.pack();
    }

    public static void main(String[] args) {
        new MyFrame().setVisible(true);
    }

}


