package module5.HW;

import java.util.ArrayList;
import java.util.List;

public class Controller {
    private API[] apis = new API[3];

    public Controller() {
        BookingComAPI bookingComAPI = new BookingComAPI();
        apis[0] = bookingComAPI;
        GoogleAPI googleAPI = new GoogleAPI();
        apis[1] = googleAPI;
        TripAdvisorAPI tripAdvisorAPI = new TripAdvisorAPI();
        apis[2] = tripAdvisorAPI;

    }

//    public Controller(API[] apis) {
//        this.apis = apis;
//    }

    Room[] requestRooms(int price, int persons, String city, String hotel) {

        BookingComAPI bookingComAPI = new BookingComAPI();
        GoogleAPI googleAPI = new GoogleAPI();
        TripAdvisorAPI tripAdvisorAPI = new TripAdvisorAPI();

        Room[] resBookingCom = bookingComAPI.findRooms(price, persons, city, hotel);
        Room[] resGoogle = googleAPI.findRooms(price, persons, city, hotel);
        Room[] resTripAdvisor = tripAdvisorAPI.findRooms(price, persons, city, hotel);

        int length = resBookingCom.length + resGoogle.length + resTripAdvisor.length;
        Room[] arrayRooms = new Room[length];

        //List < Room > result = new ArrayList<>();

       //for (Room count : result) {
        //   result.add(count);
       //}
         return arrayRooms;
        //return result.toArray(new Room[result.size()]);
    }


    Room save(Room room) {
        DAOHardImpl daoHard = new DAOHardImpl();
        return daoHard.save(room);
    }



    Room[] check(API api1, API api2) {
        // api1.findRooms(0, 0, null, null); option 1

        /*int price = 100;
        int persons = 2;
        String city = "Kiev";
        String hotel = "Holiday";

        Room[] res1 = api1.findRooms(price, persons, city, hotel);
        Room[] res2 = api2.findRooms(price, persons, city, hotel);*/

        //api1.getAll();
        //api2.getAll();


        //logic (!!!) KEY moment

        return null;


    }

}
