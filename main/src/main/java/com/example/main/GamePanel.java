package com.example.main;

import inputs.KeyBoardInputs;
import inputs.MouseInputs;

import javax.swing.*;
import java.awt.*;

public class GamePanel extends JPanel {

    private MouseInputs mouseInputs;
    private int xDelta=0,yDelta=0;

    public GamePanel(){
        mouseInputs = new MouseInputs();
        addKeyListener(new KeyBoardInputs(this));
        addMouseListener(mouseInputs);
        addMouseMotionListener(mouseInputs);

    }

    public void changeXDelta(int value){
        this.xDelta += value;
        repaint();
    }

    public void changeYDelta(int value){
        this.yDelta += value;
        repaint();
    }


    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        g.fill3DRect(100+xDelta,100+yDelta,100,100,true);

    }
}
