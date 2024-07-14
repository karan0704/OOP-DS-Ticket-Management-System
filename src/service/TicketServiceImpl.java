/**
 * 
 */
package service;

import model.Ticket;
import model.TicketStatus;

public class TicketServiceImpl implements TicketService {
	
    private Ticket[] tickets = new Ticket[100];
    private int ticketCount = 0;

    @Override
    public void createTicket(Ticket ticket) {
        tickets[ticketCount++] = ticket;
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
