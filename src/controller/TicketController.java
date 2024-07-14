package controller;

import java.util.InputMismatchException;
import java.util.Scanner;

import service.TicketService;
import service.TicketServiceImpl;

public class TicketController {
	private final Scanner scanner = new Scanner(System.in);
	private final TicketService ticketService = new TicketServiceImpl();
	
	
	void displayMenu() {
		while(true) {
			System.out.println("Wlecome to Ticket Management Service");
			System.out.println("\nSelect an option:");
			System.out.println("1. Create a new ticket");
            System.out.println("2. View all tickets");
            System.out.println("3. Search for a ticket");
            System.out.println("4. Change ticket status");
            System.out.println("5. Delete a ticket");
            System.out.println("6. Exit");

            
            int choice = getChoice();

            switch (choice) {
                case 1:
                    createTicket();
                    break;
                
                case 2:
                    System.out.println("Exiting...");
                    return;
                default:
                    System.out.println("Invalid choice. Please try again.");
		}
	}
}

	private int getChoice() {
		try {
			System.out.print("Enter your choice: ");
            return scanner.nextInt();			
		}catch (InputMismatchException e) {
			System.out.println("Invalid input. Please enter a number.");
            scanner.nextLine();
		}
		
		return 0;
	}

	private void createTicket() {
		// TODO Auto-generated method stub
		
	}
