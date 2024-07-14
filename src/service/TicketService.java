/**
 * 
 */
package service;

import model.Ticket;
import model.TicketStatus;

public interface TicketService {

	void createTicket(Ticket ticket);
   
	Ticket[] getAllTickets();
 
	Ticket[] getAllTicketsSortedById();
   
	Ticket[] getAllTicketsSortedByCustomerName();
  
	Ticket searchTicketByTitle(String title);
   
	Ticket searchTicketByID(int id);
   
	void changeTicketStatus(int ticketID, TicketStatus newStatus);

}
