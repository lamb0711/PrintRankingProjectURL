package edu.handong.s_lab.ISEL;

import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;

public class URLPrint {
	private static URL url;
	public ArrayList<String> eachAddress;
	public HttpURLConnection code;

	private void getURL() {
		String address = "https://api.github.com/search/repositories?q=language:java&sort=stars&order=desc";
		
		try {
			url = new URL(address);
			eachAddress = new ArrayList<String>();
			
			
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
