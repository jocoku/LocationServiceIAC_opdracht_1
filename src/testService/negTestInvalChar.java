package testService;

import LocationService.Inputfault;
import org.junit.Test;
import wsProducer.LocationServiceImpl;

/*
 * Created by Jochem Kuus on 12-3-2017.
 */
public class negTestInvalChar {
    // testing with a postcode that is incorrect
    @Test(expected = Inputfault.class)
    public void classCrashInvalidChar() throws Inputfault {
        LocationServiceImpl lSI = new LocationServiceImpl();

        lSI.locationService("3731@X"); // this postcode has a @ which is an illegal character
    }
}
