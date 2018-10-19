/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package shootinggame;

/**
 *
 * @author theCoderSchool SF
 */
public class Player {
    int health,score,x,y;
    
    public Player(int x,int y){
        this.x = x;
        this.y=y;
        health = 1;
        score = 0;
    }
    
}
