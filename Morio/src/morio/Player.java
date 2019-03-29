/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package morio;

import java.awt.Graphics;
import java.awt.image.BufferedImage;
import java.awt.image.ImageObserver;
import java.util.Observable;
import java.util.Observer;

/**
 *
 * @author theCoderSchool SF
 */
public class Player extends GameObject implements Observer{
    int x,y,health,direction;
    double garvity;
    Boolean shoot;
    BufferedImage pics;
    Boolean butt;
    
    public Player(BufferedImage img, int x, int y) {
        super(img, x, y);
        this.x=x;
        this.y=y;
        this.pics=img;
        direction =0;
        shoot = false;
        garvity=0;
        butt=false;
    }
    
    @Override
    public void draw (Graphics g,ImageObserver obs){
        garvity+=0.5;
        if(y>= 598 || butt ){
            garvity=0;
          if (direction ==1){
           garvity-=11;
        }
        }
        
        y+=garvity;
        g.drawImage(pics, x, y, obs);
                
                
        
    }

    @Override
    public void update(Observable o, Object arg) {



         if (direction ==3){
            x-=11;
            pics= Morio.john[3];
            if(x<=0){
                x+=11;
            }
        }
         else if (direction ==4){
            x+=11;
            pics=Morio.john[2];
            if(x>=917){
                x-=11;
            }
        }
     
        
    }
    
}
