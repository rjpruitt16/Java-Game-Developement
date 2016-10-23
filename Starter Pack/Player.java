package com.tutorial.game;

import java.awt.Color;
import java.awt.Graphics;
import java.util.Random;

public class Player extends GameObject {	
	
	public Player(int x, int y, ID id) {
		super(x, y, id);
		
		velX = 5;
		velY = 5;
	
	}
	
	public void tick() {
		x += velX;
		y += velY;
		
		if(y <= 0 || y>= Game.HEIGHT-32) velY *= -1;
		if(x <= 0 || x>= Game.WIDTH-20) velX *= -1;

	}
	
	public void render(Graphics g) {
		if (id == ID.Player){
		g.setColor(Color.WHITE);
		g.fillRect(x, y, 32, 32);
		}
		if (id == ID.FastBird){
				g.setColor(Color.YELLOW);
				g.fillRect(x, y, 16, 16);
				}
		if (id == ID.BigBird){
			g.setColor(Color.CYAN);
			g.fillRect(x, y, 44, 44);
			}
			
			
		}
	}
