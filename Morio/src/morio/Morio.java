/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package morio;

import java.awt.Graphics;
import java.awt.event.KeyEvent;
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
 Player player;
 Event event;
 KeyControl keycontrol;
 CollisionCheck cc;
 Power flower;
 @Override
    public void init(){
        setSize(1000,700);
        setFocusable(true);
        john = new BufferedImage[30];
        event = new Event();
        cc = new CollisionCheck();
        
       
     try {
         john[0] = ImageIO.read(Morio.class.getResource("img/rainbo2.jpg"));
         john[1] = ImageIO.read(Morio.class.getResource("img/Rinbau.png"));
         john[2] = ImageIO.read(Morio.class.getResource("img/moriar.png"));
         john[3] = ImageIO.read(Morio.class.getResource("img/morial.png"));
         john[4] = ImageIO.read(Morio.class.getResource("img/flower.jpg"));
     } catch (IOException ex) {
         Logger.getLogger(Morio.class.getName()).log(Level.SEVERE, null, ex);
     }
     bob = new ArrayList<platform>();
     player = new Player(john[2],500 , 500);
    bob.add(new platform(john[1],500,580));
    bob.add(new platform(john[1],250,250));
       bob.add(new platform(john[1],300,400));
    keycontrol = new KeyControl(KeyEvent.VK_W,KeyEvent.VK_A,KeyEvent.VK_D,KeyEvent.VK_SPACE,player,event);
    this.addKeyListener(keycontrol);
    this.event.addObserver(player);
    flower =new Power(john[4],500,200,1);
    }
 @Override
 public void paint(Graphics g){
    g.drawImage(john[0],0,0 ,this);
    for(int i=0; i< bob.size();i++){
        bob.get(i).draw(g,this);
        cc.pp(player,bob.get(i) );
    }
    player.draw(g, this);
    flower.draw(g, this);

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
