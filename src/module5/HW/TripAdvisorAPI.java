package module5.HW;

public class TripAdvisorAPI implements API {

    private Room[] rooms = new Room[5];

    public TripAdvisorAPI() {

        Room room1 = new Room(1, 500, 1, API.getDateWithShift(ONE_DAY_SHIFT), "Hayat", "Kyiv");
        rooms[0] = room1;
        Room room2 = new Room(2, 1000, 1, API.getDateWithShift(ONE_DAY_SHIFT), "Lybid", "Kyiv");
        rooms[1] = room2;
        Room room3 = new Room(3, 1600, 4, API.getDateWithShift(ONE_DAY_SHIFT), "Hayat", "Kyiv");
        rooms[2] = room3;
        Room room4 = new Room(4, 2100, 1, API.getDateWithShift(ONE_DAY_SHIFT), "Hayat", "Kyiv");
        rooms[3] = room4;
        Room room5 = new Room(5, 2500, 2, API.getDateWithShift(ONE_DAY_SHIFT), "Odessa", "Odessa");
        rooms[4] = room5;

    }

    @Override
    public Room[] findRooms(int price, int persons, String city, String hotel) {
        return new Room[5];
    }

//    @Override
//    public Room[] getAll() {
//        return new Room[5];
//    }
}
