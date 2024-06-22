/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mouselistener;

import java.awt.Color;
import java.awt.Dimension;
import javax.swing.BorderFactory;
import javax.swing.JLabel;

/**
 *
 * @author UX430UN
 */
public class BlankArea extends JLabel {

    Dimension minSize = new Dimension(100, 50);

    public BlankArea(Color color) {
        setBackground(color);
        setOpaque(true);
        setBorder(BorderFactory.createLineBorder(Color.black));
    }

    @Override
    public Dimension getMinimumSize() {
        return minSize;
    }

    @Override
    public Dimension getPreferredSize() {
        return minSize;
    }
}
