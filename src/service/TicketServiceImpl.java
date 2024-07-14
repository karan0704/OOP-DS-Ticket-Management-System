/**
 * 
 */
package service;

import model.Ticket;
import model.TicketStatus;
import util.RandomSixDigitNumber;

public class TicketServiceImpl implements TicketService {
	
    private static final int MAX_TICKETS = 100;
	private Ticket[] tickets = new Ticket[MAX_TICKETS];
    private int ticketCount = 0;
    private int currentTicketId = 1;

    public Ticket createTicket(String customerName, String ticketTitle, String ticketDescription) {
        if (ticketCount < MAX_TICKETS) {
            Ticket ticket = new Ticket(currentTicketId++, customerName, RandomSixDigitNumber.getSixDigitNumber(), ticketTitle, ticketDescription);
            tickets[ticketCount++] = ticket;
            return ticket;
        } else {
            System.out.println("Maximum ticket limit reached.");
            return null;
        }
    }

    @Override
    public Ticket[] getAllTickets() {
        return tickets;
    }

    @Override
    public Ticket[] getAllTicketsSortedById() {
		return tickets;
        
    }

    @Override
    public Ticket[] getAllTicketsSortedByCustomerName() {
		return tickets;
    }

    @Override
    public Ticket searchTicketByTitle(String title) {
		return null;
    }

    @Override
    public Ticket searchTicketByID(int id) {
        // Search and return ticket by ID
    }

    @Override
    public void changeTicketStatus(int ticketID, TicketStatus newStatus) {
        // Change ticket status
    }

    @Override
    public boolean deleteTicketBySixDigitNumber(int sixDigitNumber) {
        // Delete ticket by six-digit number
    }
}
