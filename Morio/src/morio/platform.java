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
 * @author default
 */
public class platform extends GameObject{
    int x,y;
    BufferedImage img;
    public platform(BufferedImage img,int x,int y){
        super(img,x,y);
        this.img= img;
        this.x=x;
        this.y=y;
   
}
    

public void draw(Graphics g,ImageObserver obs){
g.drawImage(img, x, y, obs);
}
}