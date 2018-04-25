package edu.handong.s_lab.ISEL;

import java.net.MalformedURLException;
import java.net.URL;

public class URLPrint {
	private static URL url;

	private void getURL() {
		URLData u = new URLData();
		u.address = "https://api.github.com/search/repositories?q=language:java&sort=stars&order=desc";
		try {
			url = new URL(u.address);
		} catch (MalformedURLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public static void main(String[] args) {
		URLPrint p = new URLPrint();
		p.getURL();

	}

}
