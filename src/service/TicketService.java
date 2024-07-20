package service;

import model.Ticket;
import model.TicketStatus;

public interface TicketService {

    Ticket createTicket(String customerName, String ticketTitle, String ticketDescription);

    Ticket[] getAllTickets();

    Ticket[] getTicketsByCustomerName(String customerName);

    Ticket[] getAllTicketsSortedById();

    Ticket[] getAllTicketsSortedByCustomerName();

    Ticket searchTicketByTitle(String title);

    Ticket searchTicketByID(int id);

    void changeTicketStatus(int ticketID, TicketStatus newStatus);

    boolean deleteTicketBySixDigitNumber(int sixDigitNumber);

}
