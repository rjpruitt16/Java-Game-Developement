package com.tutorial.game;

import java.awt.Color;
import java.awt.Graphics;

public class HUD {

	public int HEALTH = 100;
	
	private int score = 100;
	private int level = 1;
	private int levelCap = 1000;
	
	public void tick() {
		HEALTH = Game.clamp(HEALTH, 0, 100);
		if (getScore() % levelCap == 0) {
			incLevel();
		}
	}
	
	public void render(Graphics g)
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
	  
	  g.setColor(Color.white);
	  g.drawString("Score " + score, 15, 64);
	  g.drawString("Level " + level, 15, 80);
	 }	 
	public int getScore(){
		return this.score;
	}
	public void setScore(int score){
		this.score = score;
	}
	
	public void incLevel(){
		this.level++;
	}

	public int getLevel() {
		// TODO Auto-generated method stub
		return this.level;
	}

	

	

}
