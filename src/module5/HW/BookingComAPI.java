package module5.HW;

import java.util.ArrayList;
import java.util.List;

public class BookingComAPI implements API {

    private Room[] rooms = new Room[5];


    public BookingComAPI() {
        Room room1 = new Room(1, 500, 2, API.getDateWithShift(ONE_DAY_SHIFT), "Hayat", "Kyiv");
        rooms[0] = room1;
        Room room2 = new Room(2, 1000, 1, API.getDateWithShift(ONE_DAY_SHIFT), "Lybid", "Kyiv");
        rooms[1] = room2;
        Room room3 = new Room(3, 1500, 2, API.getDateWithShift(ONE_DAY_SHIFT), "Hayat", "Kyiv");
        rooms[2] = room3;
        Room room4 = new Room(4, 2000, 1, API.getDateWithShift(ONE_DAY_SHIFT), "Hayat", "Kyiv");
        rooms[3] = room4;
        Room room5 = new Room(5, 2500, 3, API.getDateWithShift(ONE_DAY_SHIFT), "Odessa", "Odessa");
        rooms[4] = room5;

    }

    @Override
    public Room[] findRooms(int price, int persons, String city, String hotel) {

//        if (rooms.equals(findRooms(0,0,null,null))){
//            return rooms;
//        }

        Room toSearch = new Room(-1, price, persons, null, city, hotel);

        List < Room > result = new ArrayList<>();

        if (toSearch.getPrice()==0 && toSearch.getPersons() == 0 && !"null".equals(toSearch.getHotelName()) && !"null".equals(toSearch.getCityName())){
            System.out.println("All nulls" + rooms.length);
            return rooms;

        }
            for (Room room : rooms) {

                if (room.equals(toSearch) ) {
                    result.add(room);
                }
            }
            return result.toArray(new Room[result.size()]);

        }

}

//    @Override
//    public Room[] getAll() {
//        return new Room[0];
//    }
//}
