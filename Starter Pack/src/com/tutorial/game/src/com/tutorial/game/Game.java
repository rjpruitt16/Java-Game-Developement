package com.tutorial.game;

import java.awt.Canvas;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.image.BufferStrategy;
import java.util.ArrayList;
import java.util.Random;

public class Game extends Canvas implements Runnable {
	/**
	 * 
	 */
	private static final long serialVersionUID = -7728264178317937023L;	
	public static final int WIDTH = 900, HEIGHT = WIDTH / 12 * 9;
	
	private Thread thread;
	private boolean running = false;
	
	private Random r;
	private Handler handler;
	private HUD hud;
	private Spawn spawner;
	
	public Game() {
		handler = new Handler();
		hud = new HUD();
		this.addKeyListener(new KeyInput(handler));
		this.addMouseListener(new MouseInputs(handler));
		spawner = new Spawn(handler, hud);

		new Window(WIDTH, HEIGHT, "Let's Build a Game", this);
				
		handler.addObject(new Projectile(WIDTH-32, HEIGHT-200, ID.Projectile, handler));
		handler.addObject(new Player(WIDTH-32, HEIGHT-32, ID.Player2, handler, hud));
		handler.addObject(new Catapult((int)(WIDTH*.2), (int)(HEIGHT*.4), ID.Catapult, handler));
	}

	public synchronized void start() {
		thread = new Thread(this);
		thread.start();
		running = true;
	}
	
	public synchronized void stop() {
		try{
			thread.join();
			running = false;
		}catch(Exception e){
			e.printStackTrace();
		}
	}
	
	public void run() {
		long lastTime = System.nanoTime();
        final double amountOfTicks = 60.0;
        double ns = 1000000000 / amountOfTicks;
        double delta = 0;
        int updates = 0;
        int frames = 0;
        long timer = System.currentTimeMillis();

        while(running){
            long now = System.nanoTime();
            delta += (now - lastTime) / ns;
            lastTime = now;
            if(delta >= 1){
                tick();
                updates++;
                delta--;
            }
            render();
            frames++;

            if(System.currentTimeMillis() - timer > 1000){
                timer += 1000;
                //System.out.println(updates + " Ticks, Fps " + frames);
                updates = 0;
                frames = 0;
            }

        }
        stop();
    }
	
	public void tick() {
		handler.tick();
		hud.tick();	
		spawner.tick();	
	}
	
	public void render() {
		BufferStrategy bs = this.getBufferStrategy();
		
		if(bs == null) {
			this.createBufferStrategy(3);
			return;
		}
		
		Graphics g = bs.getDrawGraphics();
		
		g.setColor(Color.black);
		g.fillRect(0, 0, WIDTH, HEIGHT);
		
		handler.render(g);
		//changed draw to render, intialized the variable and called it in the main function 
		hud.render(g);
		//called HUD to render display on game screen
		
		g.dispose();
		bs.show();
	}
	
	public static int clamp(int var, int min, int max) {
		if (var > max) {
			return max;
		} else if (var < min) {
			return min;
		} else {
			return var;
		}
		
	}
	
	public static void main (String arg[]) {
		new Game();
	}

}
