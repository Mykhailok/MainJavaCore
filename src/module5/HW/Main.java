package module5.HW;

public class Main {
    public static void main(String[] args) {

        Controller controller = new Controller();

        System.out.println("Finding request rooms...");
        controller.requestRooms(500,2,"Hayat", "Kyiv");
        controller.requestRooms(1600,4,"Hayat", "Kyiv");
        controller.requestRooms(2500,2,"Hayat", "Kyiv");
        System.out.println(controller.toString());

        System.out.println("Checking APIs...");
        Room[] res =  controller.check(new BookingComAPI(),new GoogleAPI());
        if (res.length != 0){
            System.out.println("Found "+res.length + " room(s)");
            System.out.println(controller.toString());
        }

        Room[] res2 =  controller.check(new BookingComAPI(),new TripAdvisorAPI());
        if (res2.length != 0){
            System.out.println("Found "+res2.length + " room(s)");
            System.out.println(controller.toString());
        }

        Room[] res3 =  controller.check(new GoogleAPI(),new TripAdvisorAPI());
        if (res3.length != 0){
            System.out.println("Found "+res3.length + " room(s)");
            System.out.println(controller.toString());
        }

    }
}
