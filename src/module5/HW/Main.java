package module5.HW;

public class Main {
    public static void main(String[] args) {
        //create apis array
        BookingComAPI bookingComAPI = new BookingComAPI();
        bookingComAPI.findRooms(500,2,"Hayat", "Kyiv");
        //bookingComAPI.findRooms(0,0,null, null);

        System.out.println("All good " + bookingComAPI);

    }
}
