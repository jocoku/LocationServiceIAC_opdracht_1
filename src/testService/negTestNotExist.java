package testService;

import LocationService.Inputfault;
import org.junit.Test;
import wsProducer.LocationServiceImpl;

/*
 * Created by Jochem Kuus on 12-3-2017.
 */
public class negTestNotExist {
    // testing with a postcode that doesn't exist
    @Test(expected = Inputfault.class)
    public void classCrashNoLoc() throws Inputfault {
        LocationServiceImpl lSI = new LocationServiceImpl();

        lSI.locationService("5555RR");
    }
}
