package cis232.classlab;
import java.util.Scanner;
import java.util.StringTokenizer;


public class Main {

	public static void main(String[] args) {
		// Parse the query string of a URL to list keys and values of the parameters
		// Example 1
		// http://www.google.com/?key1=value1&key2=value2
		//
		// Query String found!
		// Key: key1 Value: value1
		// Key: key2 Value: value2
		//
		// Example 2
		// http://www.google.com
		//
		// Query String not found!
		//
		// Example 3
		// http://facebook.com/?profile=123
		//
		// Query String found!
		// Key: profile Value:123
		
		System.out.println("What is the url?");
		Scanner keyboard = new Scanner(System.in);
		String url = keyboard.nextLine();
		StringTokenizer mainTokens = new StringTokenizer(url, "?");
		if(mainTokens.countTokens() == 2){
			System.out.println("Query String found!");
			//Skip first token
			mainTokens.nextToken();
			StringTokenizer queryTokens = new StringTokenizer(mainTokens.nextToken(), "&");
			while(queryTokens.hasMoreTokens()){
				StringTokenizer keyValTokens = new StringTokenizer(queryTokens.nextToken(), "=");
				System.out.printf("Key:%s\tValue:%s%n", keyValTokens.nextToken(), keyValTokens.nextToken());
			}
		}else{
			System.out.println("Query String not found!");
		}

	}

}
