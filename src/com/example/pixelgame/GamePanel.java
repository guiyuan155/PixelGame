package com.example.pixelgame;

import javax.swing.JPanel;
import java.awt.Color;
import java.awt.Graphics;

public class GamePanel extends JPanel {

    // Declare the keyboard handler
    private KeyHandler keyHandler;

    // Declare the player
    private Player player;

    public GamePanel() {

        // Create the keyboard handler
        keyHandler = new KeyHandler();

        // Add the keyboard listener
        // This allows GamePanel to receive keyboard events
        addKeyListener(keyHandler);

        // Allow GamePanel to receive keyboard focus
        setFocusable(true);

        // Create the player
        // Initial position: x = 100, y = 80
        player = new Player(100, 80);

        // Request keyboard focus
        // requestFocusInWindow();

        // Set the background color
        setBackground(Color.BLACK);

//        System.out.println("[GAME_PANEL] GamePanel created");
    }

    // Update the game logic
    public void update() {

//        System.out.println("[GAME_PANEL] Updating game");

        // Update the player
        player.update(keyHandler);
    }

    // Draw the game
    @Override
    protected void paintComponent(Graphics g) {

        // Clear the previous frame
        super.paintComponent(g);

//        System.out.println("[GAME_PANEL] Drawing game");

        // Draw the player
        player.draw(g);
    }
}