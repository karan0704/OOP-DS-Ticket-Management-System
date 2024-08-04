package collection;

import controller.TicketController;
import repository.TicketRepository;
import service.TicketService;
import service.TicketServiceImpl;

public class ServiceTicketManagementSystem {
    public static void main(String[] args) {
        TicketRepository repository = new TicketRepository();
        TicketService service = new TicketServiceImpl(repository);
        TicketController ticketController = new TicketController(service);

        ticketController.displayMenu();
    }
}
