package _03_Threaded_Reverse_Greeting;

import java.util.ArrayList;

public class ThreadedReverseGreeting {
  //Write a program that creates a thread (Thread 1) that creates another thread (Thread 2); 
  //Thread 2 creates Thread 3; and so on, up to Thread 50. 
  //Each thread should print "Hello from Thread <num>!", 
  //but you should structure your program such that the threads print their greetings in reverse order.
	
	/* HINT: You will most likely need to do this with recursion */
	
	ArrayList<Thread> threads = new ArrayList<Thread>();
	
	public static void main(String[] args) {
		ThreadedReverseGreeting t = new ThreadedReverseGreeting();
		t.threaded(50);
	}
	
	public int threaded(int n) {
		if(n > 0) {
			threads.add(new Thread(()-> {System.out.println("Hello from Thread" + " " + threads.size());}));
			threads.get(threads.size() - 1).start();
			n = n-1;
		}	
		return n;
	}
	
}
