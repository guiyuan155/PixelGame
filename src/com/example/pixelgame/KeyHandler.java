package com.example.pixelgame;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class KeyHandler implements KeyListener {

    // Store the current state of each movement key
    public boolean up;
    public boolean down;
    public boolean left;
    public boolean right;

    @Override
    public void keyPressed(KeyEvent e) {

        // Get the key code
        int keyCode = e.getKeyCode();

        System.out.println("[KEY] Key pressed: " + keyCode);

        switch (keyCode) {

            case KeyEvent.VK_W:
                up = true;
                System.out.println("[KEY] W -> up = true");
                break;

            case KeyEvent.VK_S:
                down = true;
                System.out.println("[KEY] S -> down = true");
                break;

            case KeyEvent.VK_A:
                left = true;
                System.out.println("[KEY] A -> left = true");
                break;

            case KeyEvent.VK_D:
                right = true;
                System.out.println("[KEY] D -> right = true");
                break;
        }
    }

    @Override
    public void keyReleased(KeyEvent e) {

        // Get the key code
        int keyCode = e.getKeyCode();

        System.out.println("[KEY] Key released: " + keyCode);

        switch (keyCode) {

            case KeyEvent.VK_W:
                up = false;
                System.out.println("[KEY] W -> up = false");
                break;

            case KeyEvent.VK_S:
                down = false;
                System.out.println("[KEY] S -> down = false");
                break;

            case KeyEvent.VK_A:
                left = false;
                System.out.println("[KEY] A -> left = false");
                break;

            case KeyEvent.VK_D:
                right = false;
                System.out.println("[KEY] D -> right = false");
                break;
        }
    }

    @Override
    public void keyTyped(KeyEvent e) {

        // Not used for movement
    }
}