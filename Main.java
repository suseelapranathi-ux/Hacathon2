import java.util.Scanner;

class MovieTicket {
    private String movieName;
    private double ticketPrice;
    private int numberOfTickets;

    // Parameterized constructor
    public MovieTicket(String movieName, double ticketPrice, int numberOfTickets) {
        this.movieName = movieName;
        this.ticketPrice = ticketPrice;
        this.numberOfTickets = numberOfTickets;
    }

    // Calculate total ticket amount
    public double calculateTotal() {
        return ticketPrice * numberOfTickets;
    }

    // Calculate discount
    public double calculateDiscount() {
        if (numberOfTickets >= 5) {
            return calculateTotal() * 0.10;
        }
        return 0.00;
    }

    // Calculate final amount
    public double calculateFinalAmount() {
        return calculateTotal() - calculateDiscount();
    }

    // Display booking bill
    public void displayBill() {
        System.out.println("\n----- Cinema Ticket Booking Bill -----");
        System.out.println("Movie Name      : " + movieName);
        System.out.printf("Ticket Price    : %.2f%n", ticketPrice);
        System.out.println("Number of Tickets: " + numberOfTickets);
        System.out.printf("Total Amount    : %.2f%n", calculateTotal());
        System.out.printf("Discount        : %.2f%n", calculateDiscount());
        System.out.printf("Final Amount    : %.2f%n", calculateFinalAmount());
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Read input values
        System.out.print("Enter movie name: ");
        String movieName = sc.nextLine();

        System.out.print("Enter ticket price: ");
        double ticketPrice = sc.nextDouble();

        System.out.print("Enter number of tickets: ");
        int numberOfTickets = sc.nextInt();

        // Create MovieTicket object
        MovieTicket ticket = new MovieTicket(
            movieName, ticketPrice, numberOfTickets
        );

        // Display complete booking bill
        ticket.displayBill();

        sc.close();
    }
}
