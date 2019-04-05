/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package morio;
import java.awt.Rectangle;


/**
 *
 * @author theCoderSchool SF
 */
public class CollisionCheck {
    Rectangle a;
    Rectangle b;
    Rectangle c;
    Rectangle d;
    Rectangle e;
    
public CollisionCheck(){}

public void pp(Player player,platform pp){
    e = new Rectangle(pp.x,pp.y,pp.width-1,pp.height-1);//platform hitbox
    a = new Rectangle(player.x,player.y,player.width-1,1);//top hitbox  
    b = new Rectangle(player.x,player.y+2,1,player.height-2);//left hitbox
    c = new Rectangle(player.x +player.width-2,player.y+2,1,player.height-2);//right hitbox
    d = new Rectangle(player.x, player.y+player.height-2,player.width-1,1);//bottom
    if(e.intersects(d)){
        player.garvity =0;
        player.butt=true;
       // System.out.println("1");
    }
    else if (e.intersects(a)){
        player.garvity*=-1;
        
    }
    else if(e.intersects(b)){
        player.x+=11;
    }
    else if(e.intersects(c)){
        player.x-=11;
    }

}

public void Fp(Power flower,Player player){
    a=new Rectangle(flower.x,flower.y,flower.width-1,flower.height-1);
    b=new Rectangle(player.x,player.y,player.width-1,player.height-1);
    if(flower.type ==1 && a.intersects(b)){
        Morio.power.remove(flower);
        player.shoot = true;
        
    }
}

}
