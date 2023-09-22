package de.demo._17;

import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class HTTP2_ex {
	
	public static void main(String[] args) throws URISyntaxException, IOException, InterruptedException {
		
		var uri = new URI("https://www.oracle.com/index.html");
		
		var httpClient = HttpClient.newHttpClient();
		
		var request = HttpRequest.newBuilder(uri).GET().build();
		
		var asString = HttpResponse.BodyHandlers.ofString();
		
		var response = httpClient.send(request, asString);
		
		System.out.println(response.statusCode());
		System.out.println(response.body().substring(1,1000));
		System.out.println(response.headers().map());
		
	}

}
