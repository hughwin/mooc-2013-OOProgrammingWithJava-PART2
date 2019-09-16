/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package movingfigure;

import java.awt.Graphics;
import java.util.ArrayList;

/**
 *
 * @author Hugh
 */
public class CompoundFigure extends Figure {

    private final ArrayList<Figure> shapes;

    public CompoundFigure(int x, int y) {
        super(x, y);
        this.shapes = new ArrayList<Figure>();
    }

    public CompoundFigure() {
        super(0, 0);
        this.shapes = new ArrayList<Figure>();
    }

    public void add(Figure f) {
        shapes.add(f);
    }

    @Override
    public void move(int x, int y) {
        for (Figure f : shapes) {
            f.move(x, y);
        }
    }

    @Override
    public void draw(Graphics graphics) {
        for (Figure f : shapes) {
            f.draw(graphics);
        }
    }

}
