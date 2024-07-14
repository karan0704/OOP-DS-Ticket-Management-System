package collection;

import controller.TicketController;

public class ServiceTicketManagementSystem {
	public static void main(String[] args) {
		TicketController ticketController = new TicketController();
		ticketController.displayMenu();
	}
}
