/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package shootinggame;

import java.awt.Graphics;
import java.awt.event.ActionEvent;
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
    @Override
    public void init(){
        setSize(500,500);
        setFocusable(true);
        pics = new BufferedImage[10];
        try{
            pics[0]=ImageIO.read(Shootinggame.class.getResource("images/hi.jpng"));
        } catch (IOException ex) {
            Logger.getLogger(Shootinggame.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    @Override
    public void paint(Graphics g){
        
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
