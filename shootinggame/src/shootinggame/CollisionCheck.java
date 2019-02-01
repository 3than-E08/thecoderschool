/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package shootinggame;

import java.awt.Rectangle;

/**
 *
 * @author theCoderSchool SF
 */
public class CollisionCheck {
    Rectangle a;
    Rectangle b;
    
    public CollisionCheck(){}
    
    public void hitbox(Enemies c,Player d){
        a =  new Rectangle(c.x,c.y,c.width-1,c.height-1);
        b =  new Rectangle(d.x,d.y,d.width-1,d.height-1);
        if(a.intersects(b)){
            d.health--;
            c.alive=false;
            Shootinggame.enemies.remove(c);
        }
        
    }
            public void bullet(Enemies c, Projectile d) {
                a= new Rectangle (c.x,c.y,c.width-1,c.height-1);
                b=new Rectangle (d.x,d.y,d.width-1,d.height-1);
                if(a.intersects(b)) {
                    d.alive=false;
                    c.alive=false;
                    if( (int)(Math.random()*5) == 3){
                        Shootinggame.healthpack.add(new HealthPack(Shootinggame.pics[11],c.x,c.y));
                    }
                    Shootinggame.enemies.remove(c);
                    Shootinggame.projectiles.remove(d);
                }
            }
    
    
    
}
