/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package morio;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.Observable;

/**
 *
 * @author theCoderSchool SF
 */
public class KeyControl extends Observable implements KeyListener{
     int up, down, left,right,shoot;
        Player player;
        Event e;
   
    public KeyControl(int up, int down, int right, int left,int shoot, Player player, Event e){
        this.up = up;
        this.down=down;
        this.right=right;
        this.left=left;
        this.shoot=shoot;
        this.player=player;
        this.e=e;
        
    }
        public void keyTyped(KeyEvent e) {
      
    }

    @Override
    public void keyPressed(KeyEvent o) {
        int keynum = o.getKeyCode();
      if(keynum == up){
          player.direction= 1;
 
      }
       else if(keynum == down){
          player.direction = 2;
       }
          else if(keynum == right){
          player.right = true;
      
      } 
          else if(keynum == left){
          player.left = true;
          }
          else if(keynum == shoot){
          player.shoot = true;
          }
        e.setValue(o);
    }

    @Override
    public void keyReleased(KeyEvent o) {
        int keynum = o.getKeyCode();
      if(keynum == up){
          player.up = false;
                  }
       else if(keynum == down){
          player.down = false;
       }
          else if(keynum == right){
          player.right = false;
      
      } 
          else if(keynum == left){
          player.left = false;
          }
          else if(keynum == shoot){
          player.shoot = false;
          }
      e.setValue(o);
    }
}
