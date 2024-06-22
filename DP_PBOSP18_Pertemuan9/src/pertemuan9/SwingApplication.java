/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pertemuan9;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;

/**
 *
 * @author UX430UN
 */
public class SwingApplication implements ActionListener {

    JButton button = new JButton("I'm a Swing button!");

    public SwingApplication() {
        button.addActionListener(this);

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        button.setText("test");
    }

}
