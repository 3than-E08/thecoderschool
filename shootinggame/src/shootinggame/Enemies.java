/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package shootinggame;

import java.awt.Graphics;
import java.awt.image.BufferedImage;
import java.awt.image.ImageObserver;

/**
 *
 * @author default
 */
public class Enemies extends GameObject {
    BufferedImage img;
    int health,x,y;
    boolean alive;
    public Enemies(BufferedImage img, int x, int y) {
        super(img, x, y);
        alive=true;
        health=3; 
        this.x=x;
        this.y=y;
        this.img=img;
        
    }
       @Override
    public void draw(Graphics g, ImageObserver obs){
        if(alive){
        g.drawImage(img, x, y, obs);
        }
    }
    
}
