package com.tutorial.game;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Point;
import java.awt.Rectangle;
import java.util.LinkedList;

public class Catapult extends GameObject {
	private LinkedList<Projectile> birds;
	private Projectile current_proj;
	private boolean is_loaded = false;
	private int length;
	private int width;
	private Handler handler;
	
	
	public Catapult(int x, int y, ID id, Handler handler, int length, int height) {
		super(x, y, ID.Catapult);
		this.birds = new LinkedList<Projectile>();
		this.length = length;
		this.current_proj = new Projectile(32, 32, ID.Projectile, handler);
		this.handler = handler;
		this.handler.object.add(this.current_proj);		
	}
	
	public void load() {
	  if (!is_loaded) {   
	    if (this.current_proj.getX() < getTop().getX()) this.current_proj.setVelX(1);
	    if (this.current_proj.getX() > getTop().getX()) this.current_proj.setVelX(-1);
	    if (this.current_proj.getY() < getTop().getY()) this.current_proj.setVelY(-1);
	    if (this.current_proj.getX() < getTop().getY()) this.current_proj.setVelY(1);
	  } 
	}
	
	public void fire(int gravity, int force) {
		current_proj.setGravity(gravity);
		current_proj.setForce(force);
		current_proj.fire();
	}

	public Point getTop() {
		return new Point(this.getX(), this.getY()); 
		
	}
	
	@Override
	public void tick() {
		// TODO Auto-generated method stub
		if (getBounds().intersects(current_proj.getBounds())){
			is_loaded = true;
			this.current_proj.setVelX(0);
			this.current_proj.setVelY(0);
		}
		load();
	}

	@Override
	public void render(Graphics g) {
		// TODO Auto-generated method stub
		g.setColor(Color.blue);
		g.fillRect(x, y, 20, 60);
	}

	@Override
	public Rectangle getBounds() {
		// TODO Auto-generated method stub
		return new Rectangle(x, y, 20, 60);
	}
	
	public int getLength() {
		return this.length;
	}
	
	public int getWidth() {
		return this.width;
	}
	
	public Projectile getCurrentProj() {
	    return this.current_proj;	
	}

}
