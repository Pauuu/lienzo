package ProyectoLienzo;

import java.awt.*;

/**
 *
 * @author pau
 */
public class Bola extends Canvas {

    Color colorin;
    int posX;
    int posY;
    Lienzo lienzo;

    public Bola(Lienzo l, int x, int y, Color c) {
        
        this.lienzo = l;
        this.colorin = c;
        this.posX = x;
        this.posY = y;
    }

    @Override
    public void paint(Graphics g) {
        
        Graphics2D g2d = (Graphics2D) g; // cast the graphics context

        g2d.setColor(colorin);
        g2d.fillOval(posX, posY, 90, 90);
    }
}