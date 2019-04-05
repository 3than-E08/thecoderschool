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
public class Power extends GameObject {
    int x,y,type;
    BufferedImage img;
   public Power  (BufferedImage img,int x,int y,int type){
       super(img,x,y);
       this.x=x;
       this.y=y;
       this.img=img;
       this.type=type;
       
   }
    @Override
    public void draw(Graphics g, ImageObserver obs){
        g.drawImage(img, x, y, obs);
    }
   

}
