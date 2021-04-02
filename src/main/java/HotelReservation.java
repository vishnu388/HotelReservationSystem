import java.util.ArrayList;
import java.util.List;

public class HotelReservation {
    List<Hotel> hotelList = new ArrayList<>();

    public boolean addHotel(String name, Double rates) {
        Hotel hotel = new Hotel(name, rates);
        hotelList.add(hotel);
        return !hotelList.isEmpty();

    }
}
