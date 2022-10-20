package com.tetris;

import javax.swing.*;
import java.awt.*;

public class App extends JFrame {
    private JLabel statusbar;

    public App(){
        initUi();
    }

    private void initUi(){
        statusbar = new JLabel(" 0");
        add(statusbar, BorderLayout.SOUTH);

        var board = new Board(this);
        add(board);
        board.start();

        setTitle("Tetris");
        setSize(200, 400);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
    }

    JLabel getStatusbar(){
        return statusbar;
    }

    public static void main(String[] args) {
        EventQueue.invokeLater(() -> {
            var game = new App();
            game.setVisible(true);
        });
    }
}
