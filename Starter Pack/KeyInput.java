package com.tutorial.game;

import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;

public class KeyInput extends KeyAdapter {

	private Handler handler;
	
	public KeyInput(Handler handler){
		this.handler=handler;
	}
	public void keyPressed(KeyEvent e){
		int key= e.getKeyCode();
		
		for(int i=0; i<handler.object.size(); i++){
			GameObject tempObject= handler.object.get(i);
		
		   if(tempObject.getID()==ID.Player){
			   if (key ==KeyEvent.VK_W) tempObject.setVelY(-5);
			   if (key==KeyEvent.VK_S) tempObject.setVelY(5);
			   if (key==KeyEvent.VK_D) tempObject.setVelX( 5);
			   if (key==KeyEvent.VK_A) tempObject.setVelX(-5);
		   }
		
		  if(tempObject.getID()==ID.FastBird){
			  if (key==KeyEvent.VK_U) tempObject.setVelY(-9);
			  if (key==KeyEvent.VK_J) tempObject.setVelY(9);
			  if (key==KeyEvent.VK_K) tempObject.setVelX(9);
			  if (key==KeyEvent.VK_H) tempObject.setVelX(-9);
		  }
		  if(tempObject.getID()==ID.BigBird){
			  if (key==KeyEvent.VK_UP) tempObject.setVelY(-2);
			  if (key==KeyEvent.VK_DOWN) tempObject.setVelY(2);
			  if (key==KeyEvent.VK_RIGHT) tempObject.setVelX(2);
			  if (key==KeyEvent.VK_LEFT) tempObject.setVelX(-2);
		  }
	    }
	}

    public void keyReleased(KeyEvent e) {
    	int key= e.getKeyCode();
        	   
        for(int i=0; i<handler.object.size(); i++) {
       	  GameObject tempObject= handler.object.get(i);
       		
       	  if(tempObject.getID()==ID.Player){
       	      if(key==KeyEvent.VK_W) tempObject.setVelY(0);
       		  if(key==KeyEvent.VK_S) tempObject.setVelY(0);
       		  if(key==KeyEvent.VK_D) tempObject.setVelX(0);
       		  if(key==KeyEvent.VK_A) tempObject.setVelX(0);
       	}
       	if(tempObject.getID()==ID.BigBird){
       		if(key==KeyEvent.VK_UP) tempObject.setVelY(0);
       		if(key==KeyEvent.VK_DOWN) tempObject.setVelY(0);
       		if(key==KeyEvent.VK_RIGHT) tempObject.setVelX(0);
       		if(key==KeyEvent.VK_LEFT) tempObject.setVelX(0);
       	}
    	if(tempObject.getID()==ID.FastBird){
       		if(key==KeyEvent.VK_UP) tempObject.setVelY(0);
       		if(key==KeyEvent.VK_DOWN) tempObject.setVelY(0);
       		if(key==KeyEvent.VK_RIGHT) tempObject.setVelX(0);
       		if(key==KeyEvent.VK_LEFT) tempObject.setVelX(0);
       	}	
    	
      }    	   
    }
}
