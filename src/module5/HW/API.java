package module5.HW;

import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

import static java.util.Calendar.DAY_OF_MONTH;

public interface API {

    int ONE_DAY_SHIFT = 1;

    static Date getDateWithShift(int amount) {
        Calendar cal = new GregorianCalendar();
        cal.add(DAY_OF_MONTH, amount);
        return cal.getTime();
    }

    Room[] findRooms(int price, int persons, String city, String hotel);

    //Room[] getAll();
}
