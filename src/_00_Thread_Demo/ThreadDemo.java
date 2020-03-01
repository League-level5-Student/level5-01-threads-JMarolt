package _00_Thread_Demo;


import java.awt.Color;

import org.jointheleague.graphical.robot.Robot;

public class ThreadDemo {
	public static void main(String[] args) {
			Robot timmy = new Robot(400, 700);
			Robot tammy = new Robot(800, 700);
			Robot sammy = new Robot(1200, 700);
			ThreadDemo d = new ThreadDemo();
			
			timmy.setSpeed(10);
			tammy.setSpeed(10);
			sammy.setSpeed(10);
			
			timmy.move(400);
			tammy.move(400);
			sammy.move(400);
			
			timmy.moveTo(400, 700);
			tammy.moveTo(800, 700);
			sammy.moveTo(1200, 700);
			
			Thread r1 = new Thread(()->timmy.move(400));
			Thread r2 = new Thread(()->{tammy.move(400);
			tammy.turn(-1080);
			tammy.turn(-1080);
			tammy.turn(-1080);
			tammy.turn(-1080);
			tammy.turn(-1080);
			tammy.turn(-1080);
			tammy.turn(-1080);
			tammy.turn(-1080);
			tammy.turn(-1080);
			tammy.turn(-1080);
			tammy.turn(-1080);
			});
			Thread r3 = new Thread(()->{sammy.move(400);
			sammy.setSpeed(100);
			sammy.turn(-1080);
			sammy.turn(-1080);
			sammy.turn(-1080);
			sammy.turn(-1080);
			sammy.turn(-1080);
			sammy.setPenColor(Color.red);
			sammy.setPenColor(Color.orange);
			sammy.setPenColor(Color.yellow);
			sammy.setPenColor(Color.green);
			sammy.setPenColor(Color.blue);
			sammy.setPenColor(Color.magenta);
			sammy.setPenColor(Color.red);
			sammy.setPenColor(Color.orange);
			sammy.setPenColor(Color.yellow);
			sammy.setPenColor(Color.green);
			sammy.setPenColor(Color.blue);
			sammy.setPenColor(Color.magenta);
			sammy.setPenColor(Color.red);
			sammy.setPenColor(Color.orange);
			sammy.setPenColor(Color.yellow);
			sammy.setPenColor(Color.green);
			sammy.setPenColor(Color.blue);
			sammy.setPenColor(Color.magenta);});
			
			//Thread r4 = new Thread(()->d.getClass());
			//r4.
			
			r1.start();
			r2.start();
			r3.start();
			tammy.turn(-1080);
			tammy.turn(-1080);
			tammy.turn(-1080);
			tammy.turn(-1080);
			tammy.turn(-10880);
			tammy.turn(10800);
			tammy.turn(-1080);
			tammy.turn(-1080);
			tammy.turn(-1080);
			tammy.turn(-1080);
			tammy.turn(-1080);
			sammy.setSpeed(100);
			sammy.penDown();
			sammy.setPenColor(Color.red);
			sammy.setPenColor(Color.orange);
			sammy.setPenColor(Color.yellow);
			sammy.setPenColor(Color.green);
			sammy.setPenColor(Color.blue);
			sammy.setPenColor(Color.magenta);
			sammy.setPenColor(Color.red);
			sammy.setPenColor(Color.orange);
			sammy.setPenColor(Color.yellow);
			sammy.setPenColor(Color.green);
			sammy.setPenColor(Color.blue);
			sammy.setPenColor(Color.magenta);
			sammy.setPenColor(Color.red);
			sammy.setPenColor(Color.orange);
			sammy.setPenColor(Color.yellow);
			sammy.setPenColor(Color.green);
			sammy.setPenColor(Color.blue);
			sammy.setPenColor(Color.magenta);
			sammy.turn(10800);
			sammy.turn(-1080);
			sammy.turn(-1080);
			sammy.turn(-1080);
			sammy.turn(-1080);
			sammy.turn(-1080);
			sammy.turn(-1080);
			sammy.move(-450);
	}
}
