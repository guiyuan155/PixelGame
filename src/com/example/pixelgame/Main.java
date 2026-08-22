package com.example.pixelgame;

import javax.swing.*;

public class Main {

    public static void main(String[] args) {

        System.out.println("[MAIN] Game starting...");

        // Create the game window
        JFrame window = new JFrame("PixelGame");
        System.out.println("[MAIN] JFrame created");

        // Create the game panel
        GamePanel gamePanel = new GamePanel();
        System.out.println("[MAIN] GamePanel created");

        // Close the window and stop the game
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        System.out.println("[MAIN] Close operation set");

        // Prevent the window from being resized
        window.setResizable(false);
        System.out.println("[MAIN] Window resizing disabled");

        // Add GamePanel to the window
        window.add(gamePanel);
        System.out.println("[MAIN] GamePanel added to window");

        // Set the window size
        window.setSize(1150, 750);
        System.out.println("[MAIN] Window size set: 1150 x 750");

        // Center the window on the screen
        window.setLocationRelativeTo(null);
        System.out.println("[MAIN] Window centered");

        // Show the window
        window.setVisible(true);
        System.out.println("[MAIN] Window visible");

        // Request keyboard focus for GamePanel
        gamePanel.requestFocusInWindow();
        System.out.println("[MAIN] Requested keyboard focus");

        // Create and start the game
        Game game = new Game(gamePanel);
        System.out.println("[MAIN] Game created");

        game.start();
        System.out.println("[MAIN] Game started");
    }
}