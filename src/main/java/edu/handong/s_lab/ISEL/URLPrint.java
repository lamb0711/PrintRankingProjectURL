package edu.handong.s_lab.ISEL;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;

public class URLPrint {
	private static URL url;//URL address
	public ArrayList<String> eachAddress;
	public HttpURLConnection code;//connection with wep
	public BufferedReader br;//read URL code line

	private void getURL() throws IOException {
		String address = "https://api.github.com/search/repositories?q=language:java&sort=stars&order=desc";
		
		try {
			url = new URL(address);//make URL object
			eachAddress = new ArrayList<String>();
			code = (HttpURLConnection)url.openConnection();//connection with this address
			//code.setRequestMethod("GET");
			
			br = new BufferedReader(new InputStreamReader(code.getInputStream()));
			
			String line;
			while((line = br.readLine()) != null) {
				
			}
		} catch (MalformedURLException e) {
			e.printStackTrace();
		}
		//System.out.println(url);
	}
	
	private void printEachURL() {
		
	}
	
	public static void main(String[] args) {
		URLPrint p = new URLPrint();
		p.getURL();
		p.printEachURL();
	}

}
