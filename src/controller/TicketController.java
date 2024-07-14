package controller;

import java.util.InputMismatchException;
import java.util.Scanner;

import model.Ticket;
import service.TicketService;
import service.TicketServiceImpl;

public class TicketController {
	private final Scanner scanner = new Scanner(System.in);
	private final TicketService ticketService = new TicketServiceImpl();

	public void displayMenu() {
		while (true) {
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

			case 3:
				System.out.println("Exiting...");
				return;

			case 2:
				viewAllTickets();
				break;
			default:
				System.out.println("Invalid choice. Please try again.");
			}
		}
	}

	private int getChoice() {
		try {
			System.out.print("Enter your choice: ");
			return scanner.nextInt();
		} catch (InputMismatchException e) {
			scanner.nextLine();
		}

		return 0;
	}

	private void viewAllTickets() {
		System.out.println("\nView Tickets:");
		System.out.println("1. Sorted by Ticket ID");
		System.out.println("2. Sorted by Customer Name");
		int viewChoice = getChoice();

		Ticket[] tickets = ticketService.getAllTickets();
		switch (viewChoice) {
		case 1:
			// Sort tickets by Ticket ID
			for (int i = 0; i < tickets.length - 1; i++) {
				for (int j = i + 1; j < tickets.length; j++) {
					if (tickets[i].getTicketID() > tickets[j].getTicketID()) {
						Ticket temp = tickets[i];
						tickets[i] = tickets[j];
						tickets[j] = temp;
					}
				}

			}
			break;
		case 2:
			// Sort tickets by Customer Name
			for (int i = 0; i < tickets.length - 1; i++) {
				for (int j = i + 1; j < tickets.length; j++) {
					if (tickets[i].getCustomerName().compareToIgnoreCase(tickets[j].getCustomerName()) > 0) {
						Ticket temp = tickets[i];
						tickets[i] = tickets[j];
						tickets[j] = temp;
					}
				}
			}
			break;
		default:
			System.out.println("Invalid choice. Returning to main menu.");
			return;
		}

		for (

		Ticket ticket : tickets) {
			System.out.println(ticket);
		}

	}

	private void createTicket() {
		scanner.nextLine(); // Consume newline
		System.out.print("Enter Customer Name: ");
		String customerName = scanner.nextLine();
		System.out.print("Enter Ticket Title: ");
		String ticketTitle = scanner.nextLine();
		System.out.print("Enter Ticket Issue: ");
		String ticketDescription = scanner.nextLine();

		Ticket ticket = ticketService.createTicket(customerName, ticketTitle, ticketDescription);
		if (ticket != null) {
			System.out.println("Ticket created successfully: \n" + ticket);
		}
	}

}
