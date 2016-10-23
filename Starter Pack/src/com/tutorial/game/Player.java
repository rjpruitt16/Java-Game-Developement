package com.tutorial.game;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.Rectangle;
import java.util.Random;


public class Player extends GameObject {
   Random r = new Random();
   Handler handler;
   
	public Player(int x, int y, ID id, Handler handler) {
		super(x, y, id);
		velX = 0;
		velY = 0;
		
		this.handler = handler;
	}
	
	public Rectangle getBounds() {
		return new Rectangle(x, y, 32, 32);
	}
	
	private void collision() {
		for (int i = 0; i<handler.object.size(); i++) {
			GameObject temp = handler.object.get(i);
			
			if (temp.id == ID.Projectile) {
				if (getBounds().intersects(temp.getBounds())) {
					HUD.HEALTH -= 2;
				}
				
			}
		}
	}
	
	public void tick() {
		x += velX;
		y += velY;
		
		x = Game.clamp(x, Game.WIDTH - (int)(Game.WIDTH*.2), Game.WIDTH-40);
		y = Game.clamp(y, 0, Game.HEIGHT-65);
		
		collision();
	}
	
	public void render(Graphics g) {
		if(id==ID.Player) g.setColor(Color.white);
		else if( id== ID.Player2) g.setColor(Color.red);
		g.fillRect(x, y, 20, 20);
	}
}
