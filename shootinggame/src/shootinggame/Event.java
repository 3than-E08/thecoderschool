/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package shootinggame;

import java.awt.event.KeyEvent;
import java.util.Observable;

/**
 *
 * @author theCoderSchool SF
 */
public class Event extends Observable{
    Object event;
    public Event(){
        
    }
    public void setValue(KeyEvent e){
        event = e;
        setChanged();
        notifyObservers(event);
    }
}
