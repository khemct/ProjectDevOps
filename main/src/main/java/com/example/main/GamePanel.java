package com.example.main;

import inputs.KeyBoardInputs;

import javax.swing.*;
import java.awt.*;

public class GamePanel extends JPanel {
    public GamePanel(){
        addKeyListener(new KeyBoardInputs());

    }

    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        g.fill3DRect(100,100,100,100,true);

    }
}
