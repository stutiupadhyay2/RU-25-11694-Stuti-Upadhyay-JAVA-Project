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
Seat[][] seats = new Seat[5][5]; // 5 rows and 5 columns of seats
    for(int i=0; i<5; i++){
        for(int j=0; j<5; j++){
            if(i<2){
                seats[i][j] = new Seat("Premium", 15.0);
            } else {
                seats[i][j] = new Seat("Regular", 10.0);
            }
        }
    }

    
    

    

    
