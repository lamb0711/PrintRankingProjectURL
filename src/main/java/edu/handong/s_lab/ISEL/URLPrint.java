package edu.handong.s_lab.ISEL;

import java.net.MalformedURLException;
import java.net.URL;

public class URLPrint {
	private static URL url;

	private void getURL() {
		URLData u = new URLData();
		String ar = "https://api.github.com/search/repositories?q=language:java&sort=stars&order=desc";
		u.setAddress(ar);
		
		try {
			url = new URL(u.address);
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
