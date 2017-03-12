package testService;

import LocationService.Inputfault;
import org.junit.Test;
import wsProducer.LocationServiceImpl;

/*
 * Created by Jochem Kuus on 12-3-2017.
 */
public class negTestInvalLeng {
    // testing with a postcode of an invalid length
    @Test(expected = Inputfault.class)
    public void classCrashLen() throws Inputfault {
        LocationServiceImpl lSI = new LocationServiceImpl();

        lSI.locationService("3731X");
    }
}
