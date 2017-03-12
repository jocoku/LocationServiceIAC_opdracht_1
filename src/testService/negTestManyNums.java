package testService;

import LocationService.Inputfault;
import org.junit.Test;
import wsProducer.LocationServiceImpl;

/*
 * Created by Jochem Kuus on 12-3-2017.
 */
public class negTestManyNums {

    // testing with a postcode that is incorrect
    @Test(expected = Inputfault.class)
    public void classCrashMoreNums() throws Inputfault {
        LocationServiceImpl lSI = new LocationServiceImpl();

        lSI.locationService("37317X"); // this postcode has 5 numbers and 1 letter instead of 4 numbers and 2 letters
    }
}
