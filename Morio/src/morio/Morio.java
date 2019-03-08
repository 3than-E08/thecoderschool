/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package morio;

import java.awt.Graphics;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;
import javax.swing.JApplet;

/**
 *
 * @author default
 */
public class Morio extends JApplet implements Runnable{
 Thread thread;
 static BufferedImage[] john;
 ArrayList<platform> bob;
 @Override
    public void init(){
        setSize(1000,700);
        setFocusable(true);
        john = new BufferedImage[30];
       
     try {
         john[0] = ImageIO.read(Morio.class.getResource("img/f.png.png"));
         john[1] = ImageIO.read(Morio.class.getResource("pic/Rinbau.png"));
     } catch (IOException ex) {
         Logger.getLogger(Morio.class.getName()).log(Level.SEVERE, null, ex);
     }
     bob = new ArrayList<platform>();
    // bob.add(new platform(john[1],500,350));
    }
 @Override
 public void paint(Graphics g){
    g.drawImage(john[0],0,0 ,this);
    for(int i=0; i< bob.size();i++){
        bob.get(i).draw(g,this);
    }

}
   
    
    
    
 @Override
        public void run() {
      Thread game = Thread.currentThread();
      while(thread==game){
          repaint();
          try{
              Thread.sleep(25);
          } catch(InterruptedException e){
              break;
          }
      }
    }
    
    @Override
    public void start(){
        thread = new Thread(this);
        thread.setPriority(Thread.MIN_PRIORITY);
        thread.start();
        
    }
    
    @Override
    public void stop(){
        
    }
    
}
