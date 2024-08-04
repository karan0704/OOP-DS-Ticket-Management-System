package controller;

public class Menu
{
    public void displayMenu() {
        while (true) {
            System.out.println("Welcome to Ticket Management Service");
            System.out.println("\nSelect an option:");
            System.out.println("1. Create a new ticket");//Done
            System.out.println("2. View all tickets");//Done
            System.out.println("3. Search for a ticket");
            System.out.println("4. Change ticket status");
            System.out.println("5. Delete a ticket");
            System.out.println("6. Exit");

            int choice = getChoice();
}
