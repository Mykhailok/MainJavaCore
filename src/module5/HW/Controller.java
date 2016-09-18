package module5.HW;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Controller {
    private API[] apis = new API[3];
    private List < Room > result = new ArrayList<>();
    private List < Room > resultcheck1 = new ArrayList<>();
    private List < Room > resultcheck2 = new ArrayList<>();
    private List < Room > resultcheck = new ArrayList<>();
    public Controller() {
        BookingComAPI bookingComAPI = new BookingComAPI();
        apis[0] = bookingComAPI;
        GoogleAPI googleAPI = new GoogleAPI();
        apis[1] = googleAPI;
        TripAdvisorAPI tripAdvisorAPI = new TripAdvisorAPI();
        apis[2] = tripAdvisorAPI;

    }

    @Override
    public String toString() {
        return "Controller{"+
                "result=" + result +
                '}';
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

        //int length = resBookingCom.length + resGoogle.length + resTripAdvisor.length;
        //Room[] arrayRooms = new Room[length];



            for (Room count : resBookingCom) {
                result.add(count);
                save(count);
            }

            for (Room count : resGoogle) {
                result.add(count);
                save(count);
            }

            for (Room count : resTripAdvisor) {
                result.add(count);
                save(count);
            }

       //return arrayRooms;

        return result.toArray(new Room[result.size()]);
    }


    Room save(Room room) {
        DAOHardImpl daoHard = new DAOHardImpl();
        return daoHard.save(room);
    }



    Room[] check(API api1, API api2) {
        Room[] res1 = api1.findRooms(500,2, "Hayat", "Kyiv");
        Room[] res2 = api2.findRooms(500,2, "Hayat", "Kyiv");

            for (Room count : res1) {
                resultcheck1.add(count);
                //System.out.println(resultcheck1);
                }

            for (Room count : res2) {
                if (!resultcheck2.equals(resultcheck1)){
                    resultcheck2.add(count);
                    System.out.println(resultcheck2);
                }

            }


        return resultcheck.toArray(new Room[resultcheck.size()]);


    }

}
