package com.tutorial.game;

import java.awt.Color;
import java.awt.Graphics;

public class HUD {

	public static int HEALTH = 100;
	
	private int score = 0;
	private int level = 1;
	
	public void tick() {
		
	}
	
	public void draw(Graphics g)
	{
      int maxHealth = 100;
	  float healthScale = HEALTH / maxHealth;
	  g.setColor(Color.red);
	  g.fillRect(15, 15, 200, 30); //draws healthbar outline

	  g.setColor(Color.green);
	  int healthBarX = 15;
      float healthBarWidth = 200;
	  int healthBarY = 15;
	  int healthBarHeight = 30;
	  g.fillRect(15, 15, HEALTH*2, 30); //draws health
	}
	

}
