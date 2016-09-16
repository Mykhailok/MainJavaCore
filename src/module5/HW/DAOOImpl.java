package module5.HW;

public class DAOOImpl implements DAO {
    @Override
    public Room save(Room room) {
        Room saveRoom = new Room (room.getId(),room.getPrice(), room.getPersons(), room.getDateAvailableFrom(),
                room.getHotelName(), room.getCityName());
        System.out.println("Saving Room to DB" + room);
        return saveRoom;
    }

    @Override
    public boolean delete(Room room) {
        System.out.println("Deleting from DB" + room);
        return false;
    }

    @Override
    public Room update(Room room) {
        System.out.println("Updating Room to DB" + room);
        return null;
    }

    @Override
    public Room findById(long id) {
        //Room room = new Room(id, 0, null, null);
        //System.out.println("" + );
        //return
        System.out.println("Finding by id.." + id);
        return null;
    }

//    @Override
//    public Room[] getAll() {
//        return new Room[0];
//    }
}
