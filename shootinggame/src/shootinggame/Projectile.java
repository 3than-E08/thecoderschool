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
 * @author theCoderSchool SF
 */
public class Projectile extends GameObject{
    boolean alive;
  int direction, x, y;
  BufferedImage img;
    public Projectile(BufferedImage img, int x, int y,int direction) {
        super(img, x, y);
        this.direction = direction;
        this.x = x;
        this.y = y;
        this.img = img;
        alive= true;
    }
    @Override
    public void draw(Graphics g, ImageObserver obs){
        if(alive){
            if(this.x>1500 || this.x <0 || this.y <0 || this.y > 950){
                alive = false;
            }
            if(direction  == 1){
                y-=50;
            }
            else if(direction  == 2){
                y+=50;            
                        }
            else if(direction  == 3){
            x-=50;
            }
            else if(direction  == 4){
            x+=50;
                    }
  
        g.drawImage(img, x, y, obs);
        }
    
}
}
