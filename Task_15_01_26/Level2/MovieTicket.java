package Task_15_01_26.Level2;

public class MovieTicket {

    private String movieName;
    private int seatNumber;
    private double price;
    private boolean isBooked;

    public MovieTicket(String movieName) {
        this.movieName = movieName;
        this.isBooked = false;
    }

    public String getMovieName() {
        return movieName;
    }

    public int getSeatNumber() {
        return seatNumber;
    }

    public double getPrice() {
        return price;
    }

    public boolean isBooked() {
        return isBooked;
    }

    public void bookTicket(int seatNumber, double price) {
        if (!isBooked) {
            this.seatNumber = seatNumber;
            this.price = price;
            this.isBooked = true;
            System.out.println("Ticket booked successfully!");
        } else {
            System.out.println("Ticket already booked.");
        }
    }

    public void displayTicketDetails() {
        if (isBooked) {
            System.out.println("Movie Name : " + movieName);
            System.out.println("Seat No    : " + seatNumber);
            System.out.println("Price      : ₹" + price);
        } else {
            System.out.println("No ticket booked yet.");
        }
    }
}
