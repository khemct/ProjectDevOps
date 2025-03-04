package inputs;

import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;

public class MouseInputs implements MouseListener, MouseMotionListener {

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

    }
}
