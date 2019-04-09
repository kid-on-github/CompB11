import java.awt.Canvas;
import java.awt.Graphics;
import javax.swing.JFrame;

public class Try extends Canvas {
    public static void main(String[] args) {
        JFrame frame = new JFrame("My Drawing");
        Canvas canvas = new Try();
        canvas.setSize(400, 400);
        frame.add(canvas);
        frame.pack();
        frame.setVisible(true);
    }

    public void paint(Graphics g) {
		g.drawLine(0, 0, 200, 200);
    }
}