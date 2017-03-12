package testService;

import LocationService.Inputfault;
import LocationService.Response;
import org.junit.Test;
import wsProducer.LocationServiceImpl;

import java.math.BigDecimal;

import static org.junit.Assert.assertEquals;

/*
 * Created by Jochem Kuus on 12-3-2017.
 */
public class posTest {
    // test in which the result will be correct, postcode found and lat/long are matching
    @Test
    public void classWorks() throws Inputfault {
        LocationServiceImpl lSI = new LocationServiceImpl();

        Response result = lSI.locationService("3731XC");
        BigDecimal resultLat = result.getLatitude();
        BigDecimal resultLng = result.getLongitude();

        assertEquals(resultLat.doubleValue(), 52.1113981, 4);
        assertEquals(resultLng.doubleValue(), 5.1796013, 4);
    }
}
