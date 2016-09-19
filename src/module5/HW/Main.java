package module5.HW;

public class Main {
    public static void main(String[] args) {
        //create apis array
        //BookingComAPI bookingComAPI = new BookingComAPI();
        //bookingComAPI.findRooms(500,2,"Hayat", "Kyiv");
        //bookingComAPI.findRooms(0,0,null, null);
        //System.out.println("All good " + bookingComAPI);
        Controller controller = new Controller();

        controller.requestRooms(500,2,"Hayat", "Kyiv");
        controller.requestRooms(1600,4,"Hayat", "Kyiv");
        controller.requestRooms(2500,2,"Hayat", "Kyiv");
        System.out.println(controller.toString());


        Room[] res =  controller.check(new BookingComAPI(),new GoogleAPI());
        if (res.length != 0){
            System.out.println(res.length);
            System.out.println(controller.toString());
        }



        Room[] res2 =  controller.check(new BookingComAPI(),new TripAdvisorAPI());
        if (res2.length != 0){
            System.out.println(res2.length);
            System.out.println(controller.toString());
        }


        Room[] res3 =  controller.check(new GoogleAPI(),new TripAdvisorAPI());
        if (res3.length != 0){
            System.out.println(res3.length);
            System.out.println(controller.toString());
        }






    }
}
