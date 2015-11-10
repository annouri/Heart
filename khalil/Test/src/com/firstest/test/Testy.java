package com.firstest.test;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Testy {

	public static WebDriver wd;
	public static void main(String[] args) throws IOException {

		wd = new FirefoxDriver();
		wd.get("http://www.ncbi.nlm.nih.gov/pubmed/?term=e+sant%C3%A9");
		WebElement str = wd.findElement(By.tagName("body"));
		System.out.println(str.getText());

		PrintWriter pw = new PrintWriter(new FileWriter(
				"C:\\Users\\kindysoft\\Desktop\\out.xml"));

		BufferedWriter out = new BufferedWriter(pw);
		out.write(str.getText());
		while (wd.findElement(By.xpath("//*[@class='active page_link next']")) != null) {

			wd.findElement(By.xpath("//*[@class='active page_link next']")).click();
			String s = wd.findElement(By.tagName("body")).getText();
			System.out.println(s);
			out.write("\n" + s);
		}

		out.close();
	}
}