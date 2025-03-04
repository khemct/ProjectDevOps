package com.example.main;

import javax.swing.*;
import java.awt.*;

public class GamePanel extends JPanel {
    public GamePanel(){

    }

    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        g.fill3DRect(100,100,100,100,true);

    }
}
