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
    int h;
    
    public Enemies(BufferedImage img, int x, int y) {
        super(img, x, y);
        alive=true;
        health=3; 
        this.x=x;
        this.y=y;
        this.img=img;
        h=10;
        
        
    }
       @Override
    public void draw(Graphics g, ImageObserver obs){
        if(alive){
            if(this.x>1500){
                h=-10;
            }
            else if(this.x<0){
            h=10;
            }
        this.x+=h;
        g.drawImage(img, x, y, obs);
            }


        }
    }
    

