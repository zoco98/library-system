package com.oop.project;

import java.util.Scanner;

import com.oop.project.service.LibraryService;

/**
 * Add books
 * Issue books
 * Return books
 * Search books
 * Show available books
 * Handle invalid operations
 * @author Sriparna
 */
public class LibraryApp {
	private static LibraryService libService = new LibraryService();
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter choice: ");
        String choice = sc.nextLine();
		switch(choice) {
		//SuryaTamashi, Koushik Majumdar
			case "add" : 
				System.out.println("Enter book name: ");
		        String bookName = sc.nextLine();
				System.out.println("Enter author: ");
		        String author = sc.nextLine();
				libService.addbook(bookName,author);
				break;
			case "Issue":
				break;
			case "Return":
				break;
			case "Search":
				System.out.println("Enter book name: ");
		        String bName = sc.nextLine();
				if(libService.checkBookAvl(bName)!=false) {
					System.out.println("Book Available");
				}else {
					System.out.println("Book not Available");
			    }
				break;
			case "Show":
				break;
			default : System.out.println("Thank you for attending my library");
		}
		
		
		
		
        
		
		
		
		
	}
}
