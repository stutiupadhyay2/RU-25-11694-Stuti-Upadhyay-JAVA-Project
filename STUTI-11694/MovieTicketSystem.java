import java.util.Scanner;

public class MovieTicketSystem {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Movie movie = new Movie("Spider Man:Brand New Day", "7:00 PM");

        Booking booking = new Booking(4, 4);

        System.out.println("Movie Ticket Booking System");
        System.out.println("----------------------------");
        System.out.println("Movie Name : " + movie.getMovieName());
        System.out.println("Show Time  : " + movie.getShowTime());

        booking.displaySeats();

        System.out.print("\nHow many seats do you want to book? ");
        int n = sc.nextInt();

        String selectedSeats = "";

        for (int i = 0; i < n; i++) {

    boolean booked = false;

    while (!booked) {

        System.out.print("\nEnter Row (0-3): ");
        int row = sc.nextInt();

        System.out.print("Enter Column (0-3): ");
        int col = sc.nextInt();

        booked = booking.bookSeat(row, col);

        if (booked) {
            selectedSeats += "(" + row + "," + col + ") ";
        } else {
            System.out.println("Please choose another seat.");
        }
    }
}

        booking.displaySeats();

        System.out.println("\nBooking Confirmation");
        System.out.println("---------------------");
        System.out.println("Movie : " + movie.getMovieName());
        System.out.println("Selected Seats : " + selectedSeats);
        System.out.println("Total Cost : " + booking.getTotalCost());
        System.out.println("Booking Confirmed!");

        sc.close();
    }
}
// Movie Class
class Movie {
     String movieName;
     String showTime;

    Movie(String movieName, String showTime) {
        this.movieName = movieName;
        this.showTime = showTime;
    }
    String getMovieName(){
        return movieName;
    }
    String getShowTime(){
        return showTime;
    }
}

// Seat Class
class Seat {
    String type;
    double price;
    boolean isBooked;

     public Seat(String type, double price) {
        this.type = type;
        this.price = price;
        this.isBooked = false;
    }
}
// Booking Class
class Booking{
       Seat[][] seats;
    double totalCost = 0;

    public Booking(int rows, int cols) {
        seats = new Seat[rows][cols];
          for(int i=0;i<rows;i++) {
            for(int j=0;j<cols;j++) {
                if(i < 2) {
                    seats[i][j] = new Seat("Premium", 500);
                }
                else {
                    seats[i][j] = new Seat("Regular", 250);
                }
            }
        }
    }
//to display seat layout
    public void  displaySeats(){
        System.out.println("\nSeat Layout:");
         for(int i=0;i<seats.length;i++) {
            for(int j=0;j<seats[i].length;j++) {
                if(seats[i][j].isBooked == true) {
                    System.out.print("X ");
                }
                else {
                   System.out.print("O ");
                }
            }
            System.out.println();
        }
    }
//to book a seat
public boolean bookSeat(int row, int col) {

        if (row < 0 || row >= seats.length ||
            col < 0 || col >= seats[0].length) {
              System.out.println("Invalid Seat!");
            return false;
        }
        if (seats[row][col].isBooked) {
            System.out.println("Seat already booked!");
            return false;
        }
        seats[row][col].isBooked = true;
        totalCost += seats[row][col].price;
        System.out.println("Seat Booked Successfully!");
        return true;
    }
    public double getTotalCost() {
        return totalCost;
    }
}

    

