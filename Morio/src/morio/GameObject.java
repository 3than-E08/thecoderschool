/*
 * To change this license header, choose License Headers in Project Properties. 
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Morio;

import java.awt.Graphics;
import java.awt.image.BufferedImage;
import java.awt.image.ImageObserver;

/**
 *
 * @author theCoderSchool SF
 */
public class GameObject {
    BufferedImage img;
    int x, y , width, height;
    public GameObject(BufferedImage img , int x , int y){
        this.img = img;
        this.x = x;
        this.y = y;
        this.width = img.getWidth();
        this.height = img.getHeight();
    }
    public void draw(Graphics g, ImageObserver obs){
        g.drawImage(img, x, y, obs);
    }
   
    
    
}
