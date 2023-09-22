package de.demo._18;

import java.net.InetSocketAddress;
import java.nio.file.Path;

import com.sun.net.httpserver.SimpleFileServer.OutputLevel;
import com.sun.net.httpserver.SimpleFileServer;

public class SimpleWebServer_JEP408 {

	
	public static void main(String[] args) {
		
		InetSocketAddress address = new InetSocketAddress(7777);
		Path path = Path.of("/home/laura/tmp/");
		
		OutputLevel verbosity = OutputLevel.VERBOSE;
		
		var server = SimpleFileServer.createFileServer(address,path,verbosity);
		
		server.start();
		
		System.out.println("Simple Server is running!");
		
	}
}
