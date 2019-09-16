/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package drawing.ui;

import java.awt.Component;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

/**
 *
 * @author Hugh
 */
public class KeyboardListener implements KeyListener {
    
    private Avatar avatar;
    private Component component;

    public KeyboardListener(Avatar avatar, Component component) {
        this.avatar = avatar;
        this.component = component;
    }

    @Override
    public void keyPressed(KeyEvent e) {
        if (e.getKeyCode() == KeyEvent.VK_LEFT) {
            avatar.move(-5, 0);
        } else if (e.getKeyCode() == KeyEvent.VK_RIGHT) {
            avatar.move(5, 0);
        }
                component.repaint();
    }


    @Override
    public void keyTyped(KeyEvent e) {
    }


    @Override
    public void keyReleased(KeyEvent e) {
    }
}
