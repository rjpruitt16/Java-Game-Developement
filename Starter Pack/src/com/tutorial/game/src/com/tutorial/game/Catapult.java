package com.tutorial.game;

import java.awt.Graphics;
import java.awt.Rectangle;
import java.util.LinkedList;

public class Catapult extends GameObject {
	LinkedList birds;
	MouseInputs mouse;
	Handler handler;
	
	public Catapult(int x, int y, ID id, Handler handler) {
		super(x, y, ID.Catapult);
		this.birds = new LinkedList();
		this.mouse = mouse;
		this.handler = handler;
	}
	
	@Override
	public void tick() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void render(Graphics g) {
		// TODO Auto-generated method stub
		g.fillRect(x, y, 20, 60);
	}

	@Override
	public Rectangle getBounds() {
		// TODO Auto-generated method stub
		return new Rectangle(x, y, 32, 32);
	}

}
