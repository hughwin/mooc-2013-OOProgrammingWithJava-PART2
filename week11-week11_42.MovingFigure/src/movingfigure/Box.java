/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package movingfigure;

import java.awt.Graphics;


/**
 *
 * @author Hugh
 */
public class Box extends Figure {

    private final int width;
    private final int height;

    public Box(int x, int y, int width, int height) {
        super(x, y);
        this.height = height;
        this.width = width;
        
    }

    @Override
    public void draw(Graphics graphics) {
           graphics.fillRect(this.getX(), this.getY(), width, height);

    }
    
    
    
    
}
