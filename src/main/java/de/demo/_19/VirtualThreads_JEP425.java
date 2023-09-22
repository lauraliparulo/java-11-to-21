package de.demo._19;

import java.time.Duration;
import java.util.concurrent.Executors;

public class VirtualThreads_JEP425 {
	
	public static void main(String[] args) {
		System.out.println("start");
		
		try (var executor = Executors.newVirtualThreadPerTaskExecutor()) {  //faster with few real threads
//			try (var executor = Executors.newCachedThreadPool()) {		
			for(int i=0; i<10_000; i++) {
				final int pos=i;
				
				executor.submit(() -> {
					
					Thread.sleep(Duration.ofSeconds(1));
					return pos;
					
				} );
			}
		}
		
		System.out.println("end");
	}

}
