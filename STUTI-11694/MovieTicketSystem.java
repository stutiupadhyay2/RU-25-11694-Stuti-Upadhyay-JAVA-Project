import java.util.*;

public class MovieTicketSystem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Movie movie = new Movie("Spider Man: Brand New Day", "7:00 PM");
        Booking booking = new Booking(5, 5);
            System.out.println("* Movie Ticket Booking system *");

            System.out.println("1. View Movie");
            System.out.println("2. Display Seats");
            System.out.println("3. Book Seat");
            System.out.println("4. View Total Cost");
            System.out.println("5. Exit");

            System.out.print("Enter your choice: ");
      
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
    void displayMovie(){
        System.out.println("Movie Name: " + movieName);
        System.out.println("Show Time: " + showTime);
    }
 
}

// Seat Class
class Seat {
    String type;
    double price;
    boolean isBooked;

     Seat(String type, double price) {
        this.type = type;
        this.price = price;
        this.isBooked = false;
    }
}

// Booking Class
class Booking{
       Seat[][] seats;
    double totalCost = 0;

    Booking(int rows, int cols) {

        seats = new Seat[rows][cols];

        for(int i = 0; i < rows; i++) {

            for(int j = 0; j < cols; j++) {

                if(i < 2) {

                    seats[i][j] = new Seat("Premium", 250);
                }
                else {

                    seats[i][j] = new Seat("Regular", 150);
                }
            }
        }
    }

    void  displaySeats(){
        System.out.println("\nSeat Layout:");

        for(int i = 0; i < seats.length; i++) {
            for(int j = 0; j < seats[i].length; j++) {
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

} 
    


