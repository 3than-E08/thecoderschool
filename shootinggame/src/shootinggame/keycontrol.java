/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package shootinggame;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.Observable;

/**
 *
 * @author theCoderSchool SF
 */
public class keycontrol extends Observable implements KeyListener{
        private int up, down, left,right,shoot;
        private Player hunter;
        private Event e;
   
    public keycontrol(int up, int down, int right, int left,int shoot, Player hunter, Event e){
        this.up = up;
        this.down=down;
        this.right=right;
        this.left=left;
        this.shoot=shoot;
        this.hunter=hunter;
        this.e=e;
        
    }
        @Override
        public void keyTyped(KeyEvent e) {
      
    }

    @Override
    public void keyPressed(KeyEvent e) {
        int keynum = e.getKeyCode();
      if(keynum == up){
          hunter.up = true;
                  }
       else if(keynum == down){
          hunter.down = true;
       }
          else if(keynum == right){
          hunter.right = true;
      
      } 
          else if(keynum == left){
          hunter.left = true;
          }
          else if(keynum == shoot){
          hunter.shoot = true;
          }
    }

    @Override
    public void keyReleased(KeyEvent e) {
        int keynum = e.getKeyCode();
      if(keynum == up){
          hunter.up = false;
                  }
       else if(keynum == down){
          hunter.down = false;
       }
          else if(keynum == right){
          hunter.right = false;
      
      } 
          else if(keynum == left){
          hunter.left = false;
          }
          else if(keynum == shoot){
          hunter.shoot = false;
          }
      
    }
    
}
