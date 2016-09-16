package module5.HW;

import java.util.ArrayList;
import java.util.List;

public class GoogleAPI implements API {

    private Room[] rooms = new Room[5];

    public GoogleAPI() {

        Room room1 = new Room(1, 500, 2, API.getDateWithShift(ONE_DAY_SHIFT), "Hayat", "Kyiv");
        rooms[0] = room1;
        Room room2 = new Room(2, 1000, 3, API.getDateWithShift(ONE_DAY_SHIFT), "Lybid", "Kyiv");
        rooms[1] = room2;
        Room room3 = new Room(3, 1700, 2, API.getDateWithShift(ONE_DAY_SHIFT), "Hayat", "Kyiv");
        rooms[2] = room3;
        Room room4 = new Room(4, 2200, 1, API.getDateWithShift(ONE_DAY_SHIFT), "Hayat", "Kyiv");
        rooms[3] = room4;
        Room room5 = new Room(5, 2500, 4, API.getDateWithShift(ONE_DAY_SHIFT), "Odessa", "Odessa");
        rooms[4] = room5;

    }

    @Override
    public Room[] findRooms(int price, int persons, String city, String hotel) {
        Room toSearch = new Room(-1, price, persons, null, city, hotel);
        List < Room > result = new ArrayList<>();
        for (Room room : rooms) {
            if (room.equals(toSearch) && (room.getPrice() != 0) && (room.getPersons() != 0)
                    && (!"null".equals(room.getCityName()) && (!"null".equals(room.getHotelName()))) ) {
                result.add(room);
            }
            else {
                return rooms;
            }
        }
        return result.toArray(new Room[result.size()]);
    }

//    @Override
//    public Room[] getAll() {
//        return new Room[0];
//    }


}
