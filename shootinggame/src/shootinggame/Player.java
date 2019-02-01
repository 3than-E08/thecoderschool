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
    int health,score,x,y, dir;
    boolean up,down,left,right,shoot,alive;
    BufferedImage img;
    public Player(BufferedImage img,int x,int y){
        super(img,x,y);
        this.img = img;
        this.x = x;
        this.y=y;
        health = 5;
        score = 0;
        up=false;
        down=false;
        left=false;
        right=false;
        shoot=false;
        alive = true;
        dir = 1;
    }
    
    @Override
    public void draw(Graphics g, ImageObserver obs){
        if(alive){
        if(health>0){
        g.drawImage(img, x, y, obs);
        }
        else{
            alive= false;
        }
        }
    }

    @Override
    public void update(Observable o, Object arg) {
      if(alive){
          if(up){
              img = Shootinggame.pics[1];
              y-=25;
              dir=1;
          }
              else if(down){
              y+=25;
              dir=2;
              img = Shootinggame.pics[5];
          }
              else if(right){
              x+=25;
              dir=4;
              img = Shootinggame.pics[6];
          }
              else if(left){
              x-=25;
              dir=3;
              img = Shootinggame.pics[4];
          }
              else if(shoot){
                  BufferedImage fireball = img ;
                  if(dir == 1){
                   fireball=Shootinggame.pics[7];
                   Shootinggame.projectiles.add(new Projectile(fireball,x+70,y+30,dir));
                  }
                  else if(dir == 2){
                   fireball=Shootinggame.pics[8];
                    Shootinggame.projectiles.add(new Projectile(fireball,x+100,y+100,dir));
                  }
                  else if(dir == 3){
                   fireball=Shootinggame.pics[9];
                   Shootinggame.projectiles.add(new Projectile(fireball,x,y+100,dir));
                  }
                 else{
                   fireball=Shootinggame.pics[10];
                   Shootinggame.projectiles.add(new Projectile(fireball,x+90,y+70,dir));
                  }
                  
                 
              }
      }
    }
    
}
