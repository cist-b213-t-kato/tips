package utils;

public class Stopwatch {
	public static void stopwatch(Runnable runnable){
		long t = System.currentTimeMillis();
		
		runnable.run();
		
		t = System.currentTimeMillis() - t;
		System.out.println(t+"msec");
	}
}
