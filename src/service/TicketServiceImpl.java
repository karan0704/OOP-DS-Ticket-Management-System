/**
 * 
 */
package service;

import model.Ticket;
import model.TicketStatus;
import util.RandomSixDigitNumber;

public class TicketServiceImpl implements TicketService {

	private static final int MAX_TICKETS = 100;
	private Ticket[] ticketsArrayObject = new Ticket[MAX_TICKETS];
	private int countInTicketArray = 0;
	private int currentTicketId = 1;

	public Ticket createTicket(String customerName, String ticketTitle, String ticketDescription) {
		if (countInTicketArray < MAX_TICKETS) {
			Ticket ticket = new Ticket(currentTicketId++, customerName, RandomSixDigitNumber.getSixDigitNumber(),
					ticketTitle, ticketDescription);
			ticketsArrayObject[countInTicketArray++] = ticket;
			return ticket;
		} else {
			System.out.println("Maximum ticket limit reached.");
			return null;
		}
	}

	@Override
	public Ticket[] getAllTickets() {
		Ticket[] result = new Ticket[countInTicketArray];
		System.arraycopy(ticketsArrayObject, 0, result, 0, countInTicketArray);
		return result;
	}

	@Override
	public Ticket[] getAllTicketsSortedById() {
		return ticketsArrayObject;

	}

	@Override
	public Ticket[] getAllTicketsSortedByCustomerName() {
		return ticketsArrayObject;
	}

	@Override
	public Ticket searchTicketByTitle(String title) {
		return null;
	}

	@Override
	public Ticket searchTicketByID(int id) {
		return null;
		// Search and return ticket by ID
	}

	@Override
	public void changeTicketStatus(int ticketID, TicketStatus newStatus) {
		// Change ticket status
	}

	@Override
	public boolean deleteTicketBySixDigitNumber(int sixDigitNumber) {
		for (int i = 0; i < countInTicketArray; i++) {
            if (ticketsArrayObject[i] != null && ticketsArrayObject[i].getSixDigitTicketNumber() == sixDigitNumber) {
                ticketsArrayObject[i] = ticketsArrayObject[--countInTicketArray];
                ticketsArrayObject[countInTicketArray] = null;
                return true;
            }
        }
        return false;
	}

	 @Override
	    public Ticket[] getTicketsByCustomerName(String customerName) {
	        Ticket[] result = new Ticket[countInTicketArray];
	        int index = 0;
	        for (int i = 0; i < countInTicketArray; i++) {
	            if (ticketsArrayObject[i].getCustomerName().equalsIgnoreCase(customerName)) {
	                result[index++] = ticketsArrayObject[i];
	            }
	        }
	        Ticket[] finalResult = new Ticket[index];
	        System.arraycopy(result, 0, finalResult, 0, index);
	        return finalResult;
	    }
}
