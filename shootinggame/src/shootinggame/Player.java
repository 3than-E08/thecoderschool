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
public class Player extends GameObject{
    int health,score,x,y;
    BufferedImage img;
    public Player(BufferedImage img,int x,int y){
        super(img,x,y);
        this.img = img;
        this.x = x;
        this.y=y;
        health = 1;
        score = 0;
    }
    
    @Override
    public void draw(Graphics g, ImageObserver obs){
        g.drawImage(img, x, y, obs);
    }
    
}
