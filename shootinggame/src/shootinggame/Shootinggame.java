/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package shootinggame;

import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.KeyEvent;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.imageio.ImageIO;

import javax.swing.JApplet;

/**
 *
 * @author theCoderSchool SF
 */
public class Shootinggame extends JApplet implements Runnable  {

    /**
     * @param args the command line arguments
     */
    Thread thread;
    Player hunter;
    BufferedImage[] pics;
    Event e;
    keycontrol key;
    
    @Override
    public void init(){
        setSize(2000,950);
        setFocusable(true);
        pics = new BufferedImage[10];
        try{
            pics[0]=ImageIO.read(Shootinggame.class.getResource("images/hi.jpng.jpg"));
            pics[1]=ImageIO.read(Shootinggame.class.getResource("images/wizard.png"));
        } catch (IOException ex) {
            Logger.getLogger(Shootinggame.class.getName()).log(Level.SEVERE, null, ex);
        }
        hunter = new Player(pics[1],1000,450);
        e = new Event();
        key = new keycontrol(KeyEvent.VK_W,KeyEvent.VK_S,KeyEvent.VK_D,KeyEvent.VK_A,KeyEvent.VK_SPACE,hunter,e);
        this.addKeyListener(key);
        this.e.addObserver(hunter);
    }
    @Override
    public void paint(Graphics g){
        g.drawImage(pics[0], 0, 0, this);
        g.drawImage(pics[0], 1000, 0, this);
        hunter.draw(g, this);
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

  
    
}
