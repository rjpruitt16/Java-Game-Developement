package com.tutorial.game;

import java.awt.Point;
import java.awt.event.KeyEvent;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;

public class MouseInputs implements MouseListener, MouseMotionListener {
    private Handler handler;
    private Catapult cat;
    private Projectile current_proj;
    private Point top;
    private boolean pressed = false;
    private int x;
    private int y;
	private MouseEvent e;
    
    public MouseInputs(Handler handler, Catapult cat) {
    	this.handler = handler;
    	this.cat = cat;
    	this.top = cat.getTop();
    	this.current_proj = cat.getCurrentProj();
    }
    
	@Override
	public void mouseClicked(MouseEvent e) {
		// TODO Auto-generated method stub
	
	}
	
	public  MouseMotionListener moveListener = new MouseMotionListener() {
		@Override
		public void mouseDragged(MouseEvent e) {
			current_proj.setX(e.getX());
			current_proj.setY(e.getY());
		}
		@Override
		public void mouseMoved(MouseEvent e) {
			current_proj.setX(e.getX());
			current_proj.setY(e.getY());
		}
	};

	@Override
	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub
		pressed = false;
		int cordy = e.getY();
		int cordx = e.getX();
		int gravity = (int)(cat.getTop().getY()) - cordy;
		int force = (int)(cat.getTop().getX()) - cordy;
		cat.fire(gravity, force);
	}

	@Override
	public void mousePressed(MouseEvent e) {
		// TODO Auto-generated method stub
		pressed = true;
		this.e = e; 
		int xcord = e.getX(); 
		int ycord = e.getY();
		System.out.println("x:" +xcord+ " y:" + ycord);
		
	}
	
	public void tick() { 
		if (pressed) {
		  this.current_proj.setX(this.e.getX());
		  this.current_proj.setY(this.e.getY());;
		}
	}

	@Override
	public void mouseEntered(MouseEvent e) {
		// TODO Auto-generated method stub
	}

	@Override
	public void mouseExited(MouseEvent e) {
		// TODO Auto-generated method stub
	}
	
	public int getX() {
		// TODO Auto-generated method stub
		return this.x;
	}
	
	public int getY() {
		// TODO Auto-generated method stub
		return this.y;
	}

	@Override
	public void mouseDragged(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseMoved(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}
	
	
}
