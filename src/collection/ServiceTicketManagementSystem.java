package collection;

import controller.TicketController;
import controller.TicketMenu;
import repository.TicketRepository;
import service.TicketService;
import service.TicketServiceImpl;

import java.util.Scanner;

public class ServiceTicketManagementSystem {
    public static void main(String[] args) {

        TicketRepository repository = new TicketRepository();
        TicketService service = new TicketServiceImpl(repository);
        TicketController ticketController = new TicketController(service);
        TicketMenu ticketMenu = new TicketMenu(ticketController);

        ticketMenu.displayMenu();
    }
}
