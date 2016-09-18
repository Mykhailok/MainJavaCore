package module5.HW;

public class Main {
    public static void main(String[] args) {
        //create apis array
        //BookingComAPI bookingComAPI = new BookingComAPI();
        //bookingComAPI.findRooms(500,2,"Hayat", "Kyiv");
        //bookingComAPI.findRooms(0,0,null, null);
        //System.out.println("All good " + bookingComAPI);
        Controller controller = new Controller();

        //controller.requestRooms(500,2,"Hayat", "Kyiv");
        //System.out.println(controller.toString());
        Room[] res =  controller.check(new BookingComAPI(),new GoogleAPI());
        System.out.println(res.toString());






    }
}
