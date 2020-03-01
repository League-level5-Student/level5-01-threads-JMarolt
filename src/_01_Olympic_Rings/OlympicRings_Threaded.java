package _01_Olympic_Rings;

import java.awt.Color;

import org.jointheleague.graphical.robot.Robot;

public class OlympicRings_Threaded {
	// Make A Program that uses Threads and robots to draw the Olympic rings. One robot should draw one ring simultaneously with the other 4 robots.
	public static void main(String[] args) {
		Robot one = new Robot(100,100);
		Robot two = new Robot(300,100);
		Robot three = new Robot(500,100);
		Robot four = new Robot(200,300);
		Robot five = new Robot(400,300);
		Thread t1 = new Thread(()->{one.penDown();
		one.setPenColor(Color.blue);
		one.setSpeed(10);
		for(int i = 0; i < 360; i ++) {
		one.move(2);
		one.turn(1);}
		one.hide();});
		Thread t2 = new Thread(()->{two.penDown();
		two.setPenColor(Color.black);
		two.setSpeed(10);
		for(int i = 0; i < 360; i ++) {
		two.move(2);
		two.turn(1);}
		two.hide();});
		Thread t3 = new Thread(()->{three.penDown();
		three.setPenColor(Color.red);
		three.setSpeed(10);
		for(int i = 0; i < 360; i ++) {
		three.move(2);
		three.turn(1);}
		three.hide();});
		Thread t4 = new Thread(()->{four.penDown();
		four.setPenColor(Color.yellow);
		four.setSpeed(10);
		for(int i = 0; i < 360; i ++) {
		four.move(2);
		four.turn(1);}
		four.hide();});
		Thread t5 = new Thread(()->{five.penDown();
		five.setPenColor(Color.green);
		five.setSpeed(10);
		for(int i = 0; i < 360; i ++) {five.move(2);
		five.turn(1);}
		five.hide();});
		t1.start();
		t2.start();
		t3.start();
		t4.start();
		t5.start();
	}
	
}

