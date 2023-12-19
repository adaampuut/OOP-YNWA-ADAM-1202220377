public class Bioskop {
    
    // TO DO: Create Private Attributes of rows and assign rows to 5
    private static final int Rows = 5;

    // TO DO: Create Private Attributes of seats per rows and assign seats per rows to 10
    private static final int Seats_Per_Rows = 10;

    // TO DO: Create 2 dimensional array to store seat reservation status
    private int[][] seats = new int [5][10];
    // TO DO:  Add a constructor to initialize multiple chairs
    public Bioskop() {
       seats[0][2] = 1;
       seats[5][1] = 1;
       seats[7][3] = 1;
    }
    //  TO DO: Add a method to display the seat layout
    public void displaySeating() {
        System.out.println("Selamat Datang di Bioskop EAD!");
        System.out.println("\nBooking Tiket Bioskop:");
    }
    //  TO DO: Add a method to reserve seats
    public void bookSeat(int row, int seat) {
        
    }
}