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
import java.util.ArrayList;
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
    static BufferedImage[] pics;
    Event e;
    int timer;
    keycontrol key;
    static ArrayList<Enemies> enemies;
   CollisionCheck cc;
   static ArrayList<Projectile> projectiles;
   static ArrayList<HealthPack> healthpack;
    @Override
    public void init(){
        setSize(2000,950);
   
        setFocusable(true);
        pics = new BufferedImage[100];
        try{
            pics[0]=ImageIO.read(Shootinggame.class.getResource("images/hi.jpng.jpg"));
            pics[1]=ImageIO.read(Shootinggame.class.getResource("images/wizardu.png"));
            pics[2]=ImageIO.read(Shootinggame.class.getResource("images/gob.png"));
            pics[3]=ImageIO.read(Shootinggame.class.getResource("images/wall.png"));
            pics[4]=ImageIO.read(Shootinggame.class.getResource("images/wizardl.png"));
            pics[5]=ImageIO.read(Shootinggame.class.getResource("images/wizardd.png"));
            pics[6]=ImageIO.read(Shootinggame.class.getResource("images/wizardr.png"));
            pics[7]=ImageIO.read(Shootinggame.class.getResource("images/fireballu.png"));
            pics[8]=ImageIO.read(Shootinggame.class.getResource("images/fireballd.png"));
            pics[9]=ImageIO.read(Shootinggame.class.getResource("images/fireballl.png"));
            pics[10]=ImageIO.read(Shootinggame.class.getResource("images/fireballR.png"));
            pics[11]=ImageIO.read(Shootinggame.class.getResource("images/healthpack.png"));
            pics[12]=ImageIO.read(Shootinggame.class.getResource("images/Heart.png"));
        } catch (IOException ex) {
            Logger.getLogger(Shootinggame.class.getName()).log(Level.SEVERE, null, ex);
        }
        hunter = new Player(pics[1],1000,450);
        e = new Event();
        key = new keycontrol(KeyEvent.VK_W,KeyEvent.VK_S,KeyEvent.VK_D,KeyEvent.VK_A,KeyEvent.VK_SPACE,hunter,e);
        this.addKeyListener(key);
        this.e.addObserver(hunter);
        enemies= new ArrayList <Enemies> ();
        healthpack= new ArrayList <HealthPack> ();
        enemies.add(new Enemies(pics[2],0,(int)(Math.random()*800)));
        cc = new CollisionCheck();
        projectiles= new ArrayList <Projectile>();
        timer = 0;
    }
    @Override
    public void paint(Graphics g){
        timer ++;
        g.drawImage(pics[0], 0, 0, this);
        g.drawImage(pics[0], 1000, 0, this);
        int heartx=1600;
        for(int i = 0;i< hunter.health;i++){
            g.drawImage(pics[12],heartx,20,this);
            heartx-=62;
            
        }
        hunter.draw(g, this);
        if(timer ==100){
            enemies.add(new Enemies(pics[2],0,(int)(Math.random()*800)));
            timer=0;
        }
        g.drawImage(pics[3], 1600, 0, this);
        for(int i=0; i < enemies.size();i++){
        enemies.get(i).draw(g,this); 
    }
        for(int i=0; i < healthpack.size();i++){
        healthpack.get(i).draw(g,this); 
    }
        for(int i=0; i < enemies.size(); i++){
            cc.hitbox(enemies.get(i), hunter);
            for(int  o =0;o< projectiles.size();o++){
            cc.bullet(enemies.get(i),projectiles.get(o));
                break;
            }
            break;
        }
        for(int i=0; i< healthpack.size();i++){
            cc.heal(healthpack.get(i),hunter);
        }
        for(int i = 0; i<projectiles.size();i++){
            projectiles.get(i).draw(g, this);
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
