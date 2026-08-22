package com.example.pixelgame;

public class Game implements Runnable {

    // Store the game thread
    private Thread gameThread;

    // Control whether the game loop is running
    private boolean running;

    // Store the game panel
    private GamePanel gamePanel;

    public Game(GamePanel gamePanel) {

        // Use the GamePanel created in Main
        this.gamePanel = gamePanel;

        System.out.println("[GAME] Game created");
    }

    // Start the game loop
    public void start() {

        // Set the game state to running
        running = true;

        // Create the game thread
        gameThread = new Thread(this);

        System.out.println("[GAME] Game thread created");

        // Start the game thread
        gameThread.start();

        System.out.println("[GAME] Game thread started");
    }

    @Override
    public void run() {

        System.out.println("[GAME] Game loop started");

        // Keep running the game loop while the game is running
        while (running) {

            // Update the game logic
            gamePanel.update();

            // Request the game panel to redraw
            gamePanel.repaint();

            try {

                // Wait approximately 16 milliseconds
                // This gives us roughly 60 updates per second
                Thread.sleep(16);

            } catch (InterruptedException e) {

                // Print the error if the game thread is interrupted
                e.printStackTrace();
            }
        }

        System.out.println("[GAME] Game loop stopped");
    }
}