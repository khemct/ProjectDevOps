package inputs;

import com.example.main.GamePanel;

import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;

public class MouseInputs implements MouseListener, MouseMotionListener {

    private GamePanel gamePanel;
    public MouseInputs(GamePanel gamePanel){
        this.gamePanel = gamePanel;

    }

    @Override
    public void mouseClicked(MouseEvent e) {
        System.out.println("Click");
    }

    @Override
    public void mousePressed(MouseEvent e) {
        System.out.println("Press");

    }

    @Override
    public void mouseReleased(MouseEvent e) {
        System.out.println("Release");

    }

    @Override
    public void mouseEntered(MouseEvent e) {
        System.out.println("Enter");

    }

    @Override
    public void mouseExited(MouseEvent e) {
        System.out.println("Exit");

    }

    @Override
    public void mouseDragged(MouseEvent e) {
        System.out.println("Drag");

    }

    @Override
    public void mouseMoved(MouseEvent e) {
        System.out.println("Move");
        gamePanel.setRectPos(e.getX(),e.getY());

    }
}
