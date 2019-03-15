/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package morio;

import java.awt.Graphics;
import java.awt.image.BufferedImage;
import java.awt.image.ImageObserver;

/**
 *
 * @author theCoderSchool SF
 */
public class Player extends GameObject{
    int x,y,health,direction;
    BufferedImage pics;
    
    public Player(BufferedImage img, int x, int y) {
        super(img, x, y);
        this.x=x;
        this.y=y;
        this.pics=img;
    }
    
    public void draw (Graphics g,ImageObserver obs){
        
        g.drawImage(pics, x, y, obs);
                
                
        
    }
    
}
