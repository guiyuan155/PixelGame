package com.example.pixelgame;

import java.awt.Color;
import java.awt.Graphics;

public class Player {

    // Player position
    private int x;
    private int y;

    // Player movement speed
    private int speed = 3;

    public Player(int x, int y) {

        // Set the initial player position
        this.x = x;
        this.y = y;

        System.out.println("[PLAYER] Created at x=" + x + ", y=" + y);
    }

    // Update the player's position
    public void update(KeyHandler keyHandler) {

        // Move up
        if (keyHandler.up) {
            y -= speed;

            System.out.println("[PLAYER] Moving UP: x=" + x + ", y=" + y);
        }

        // Move down
        if (keyHandler.down) {
            y += speed;

            System.out.println("[PLAYER] Moving DOWN: x=" + x + ", y=" + y);
        }

        // Move left
        if (keyHandler.left) {
            x -= speed;

            System.out.println("[PLAYER] Moving LEFT: x=" + x + ", y=" + y);
        }

        // Move right
        if (keyHandler.right) {
            x += speed;

            System.out.println("[PLAYER] Moving RIGHT: x=" + x + ", y=" + y);
        }
    }

    // Draw the player
    public void draw(Graphics g) {

        // Set the player's color
        g.setColor(Color.WHITE);

        // Draw the player
        g.fillOval(x, y, 10, 10);
    }
}