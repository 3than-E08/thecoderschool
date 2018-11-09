/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package shootinggame;

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
    int health,score,x,y;
    boolean up,down,left,right,shoot,alive;
    BufferedImage img;
    public Player(BufferedImage img,int x,int y){
        super(img,x,y);
        this.img = img;
        this.x = x;
        this.y=y;
        health = 1;
        score = 0;
        up=false;
        down=false;
        left=false;
        right=false;
        shoot=false;
        alive = true;
    }
    
    @Override
    public void draw(Graphics g, ImageObserver obs){
        if(alive){
        g.drawImage(img, x, y, obs);
        }
    }

    @Override
    public void update(Observable o, Object arg) {
      if(alive){
          if(up){
              y-=10;
          }
              else if(down){
              y+=10;
          }
              else if(right){
              x+=10;
          }
              else if(left){
              x-=10;
          }
      }
    }
    
}
