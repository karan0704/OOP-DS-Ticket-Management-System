package repository;

import model.Ticket;

public class TicketRepository {
    private static final int MAX_TICKETS = 100;
    private final Ticket[] ticketsArrayObject = new Ticket[MAX_TICKETS];
    private int countInTicketArray = 0;
    private int currentTicketId = 1;
}
