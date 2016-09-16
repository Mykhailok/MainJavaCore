package module5.HW;

public class DAOHardImpl implements DAO {
    //

    @Override
    public Room save(Room room) {
     Room saveRoom = new Room (room.getId(),room.getPrice(), room.getPersons(), room.getDateAvailableFrom(),
             room.getHotelName(), room.getCityName());
        System.out.println("Saving Room to DB" + room);
        return saveRoom;
    }

    @Override
    public boolean delete(Room room) {
//        Room deleteRoom = new Room (room.getId(),room.getPrice(), room.getPersons(), room.getDateAvailableFrom(),
//                room.getHotelName(), room.getCityName());
        System.out.println("Deleting from DB" + room);
        return false;
    }

    @Override
    public Room update(Room room) {
        //Rooms - id = 101, price = 400, persons = 2, city = Kiev, hotel = HolidayInn - saved in DB


        System.out.println("Updating Room to DB" + room);
        //id = 101, price = 600, persons = 2, city = Minks, hotel = HolidayInn - saved in DB
        return null;
    }

    @Override
    public Room findById(long id) {
        System.out.println("Finding by id.." + id);
        return null;
    }

//    @Override
//    public Room[] getAll() {
//        return new Room[0];
//    }
}
