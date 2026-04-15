import java.util.*;

// Movie Class
class Movie {
     String movieName;
     String showTime;

    public Movie(String movieName, String showTime) {
        this.movieName = movieName;
        this.showTime = showTime;
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
class Booking 
    Seat[][] seats;
    double totalCost;
    
    

    

    
