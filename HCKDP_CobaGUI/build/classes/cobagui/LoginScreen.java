/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cobagui;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

/**
 *
 * @author hanschristian
 */
public class LoginScreen {
    
    public LoginScreen() {
        JFrame frame = new JFrame();
        frame.setSize(500, 700);
        frame.setLocationRelativeTo(null);

        //Component: Button
        JButton button, button1, button2, button3, button4;
        button = new JButton("left");
        button1 = new JButton("right");
        button2 = new JButton("top");
        button3 = new JButton("bottom");
        button4 = new JButton("center");
        JButton button5 = new JButton("blabla");
        
        JLabel label4 = new JLabel();
        button4.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println(button1.getText());
            }
        });
                
        // Border Layout
        frame.add(button, BorderLayout.WEST);
        frame.add(button1, BorderLayout.EAST);
        frame.add(button2, BorderLayout.NORTH);
        frame.add(button3, BorderLayout.SOUTH);
        frame.add(button4, BorderLayout.CENTER);
        
        frame.setVisible(true);
        
        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                frame.dispose();
            }
        });
    }
}
