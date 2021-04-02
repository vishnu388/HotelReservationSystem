import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class HotelReservationTest {
    HotelReservation hotelReservation = new HotelReservation();

    @Test
    public void givenHotel_WhenAdded_ShouldReturn_TRUE() {
        boolean result = hotelReservation.addHotel("Hyatt", 950.00) &&
                hotelReservation.addHotel("Lemon Tree", 1200.00) &&
                hotelReservation.addHotel("Ginger", 1500.00);
        Assertions.assertTrue(result);
    }

    @Test
    public void givenBookingDate_ShouldReturn_CheapestHotel() {
        SimpleDateFormat df = new SimpleDateFormat("ddMMMMyyyy");
        String inputDateString[] = {"10Sep2020", "11Sep2020"};

        Date inputDate[] = null;
        try {
            inputDate = new Date[]{df.parse(inputDateString[0]), df.parse(inputDateString[1])};
        } catch (ParseException e) {
            System.out.println("Invalid Formate");
            if (!df.format(inputDateString).equals(inputDate)) {
                System.out.println("Invalid Date!!");
            } else
                System.out.println("Valid Date");
        }
        boolean result = hotelReservation.addHotel("Hyatt", 950.00) &&
                hotelReservation.addHotel("Lemon Tree", 1200.00) &&
                hotelReservation.addHotel("Ginger", 1500.00);
        if (result)
            Assertions.assertEquals("Hyatt", hotelReservation.findCheapestHotel(inputDate));
    }

    @Test
    public void givenWeekDayAndWeekendRatesForHotels_WhenAdded_ShouldReturn_TRUE() {
        boolean result = hotelReservation.addHotelRates("Hyatt", 950.00, 1200.00) &&
                hotelReservation.addHotelRates("Lemon Tree", 1200.00, 1350.00) &&
                hotelReservation.addHotelRates("Ginger", 1500.00, 1800.00);
        Assertions.assertTrue(result);
    }
}
