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
public class HealthPack extends GameObject{
    int x,y,timer;

    public HealthPack(BufferedImage img, int x, int y) {
        super(img, x, y);
        this.x=x;
        this.y=y;
        timer=100;
        
    }
    
    @Override
    public void draw(Graphics g, ImageObserver obs){
       timer--;
        if(timer==0){
            Shootinggame.healthpack.remove(this);
        }
        else{
        g.drawImage(img,x,y,obs);
    }
    }
    
}
