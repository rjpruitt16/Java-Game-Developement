package com.tutorial.game;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Rectangle;

public class Projectile extends GameObject {
	private Handler handler;
	private int gravity;
	private int force;
	Graphics g;

	public Projectile(int x, int y, ID id, Handler handler) {
		super(x, y, id);
		this.handler = handler;
		velX = 0;
		velY = 0;
		
	}


	@Override
	public void tick() {
		// TODO Auto-generated method stub
		x += velX;
		y += velY;
		
		x = Game.clamp(x, 0, Game.WIDTH-40);
		y = Game.clamp(y, 0, Game.HEIGHT-65);
		
		
	}

	@Override
	public void render(Graphics g) {
		// TODO Auto-generated method stub
		g.setColor(Color.green);
		g.fillRect(this.getX(), this.getY(), 20, 20);
	}
	

	@Override
	public Rectangle getBounds() {
		// TODO Auto-generated method stub
		return new Rectangle(x, y, 20, 20);
	}
	
	public void setGravity(int g) {
		this.gravity = g;
	}
	
	public void setForce(int f) {
		this.force = f;
	}


	public void fire() {
	
	}
	

}
