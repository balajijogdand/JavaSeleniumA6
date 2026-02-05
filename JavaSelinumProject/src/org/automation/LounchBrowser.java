package org.automation;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LounchBrowser {
	public static void main(String[] args) {
		
		// target the url.
	    WebDriver Driver = new ChromeDriver();
     	Driver.get("https://www.fossil.com/en-in/watches/mens-watches/");
	
	    // target the title.
		System.out.println("Zhomato");
		String title = Driver.getTitle();
		System.out.println("Title : "+ title);
		
		// target the url.
		String url = Driver.getCurrentUrl();
		System.out.println("URL : "+url);
		
		String sourcecode = Driver.getPageSource();
		System.out.println(sourcecode);
	}

}
