package wsProducer;

import LocationService.*;
import com.google.maps.GeoApiContext;
import com.google.maps.GeocodingApi;
import com.google.maps.model.GeocodingResult;

import javax.jws.WebService;
import java.math.BigDecimal;

/*
 * Created by Jochem Kuus on 9-3-2017.
 */

@WebService(endpointInterface = "LocationService.WSInterface")
public class LocationServiceImpl implements WSInterface {

    public Response locationService(String request) throws Inputfault {
        ObjectFactory factory = new ObjectFactory();
        Response response = factory.createResponse();

        String postcode = request;

        if (checkPostcodeSyntax(postcode) == true) {

            if (postcode.length() == 6) {
                try {
                    GeoApiContext context = new GeoApiContext().setApiKey("AIzaSyDGMW8VDfx3d8OhBxAT_LNuOrfHXFUPyo4"); // CHANGE THIS
                    GeocodingResult[] results = GeocodingApi.geocode(context, postcode).await();

                    if (results.length > 0) {
                        BigDecimal lat = BigDecimal.valueOf(results[0].geometry.location.lat);
                        BigDecimal lng = BigDecimal.valueOf(results[0].geometry.location.lng);
                        response.setLatitude(lat);
                        response.setLongitude(lng);
                        System.out.println(results[0]);
                    } else {
                        Fault x = factory.createFault();
                        x.setErrorCode((short) 404);
                        x.setMessage("Invalid number of responses: " + results.length);
                        Inputfault error = new Inputfault("Error encountered", x);
                        throw error;
                    }

                } catch (Exception e) {
                    Fault x = factory.createFault();
                    x.setErrorCode((short) 500);
                    x.setMessage("No coordinates found for: " + postcode);
                    Inputfault error = new Inputfault("Error encountered", x);
                    throw error;
                }
            } else {
                Fault x = factory.createFault();
                x.setErrorCode((short) 666);
                x.setMessage("Invalid postcode length: " + postcode.length() + postcode);
                Inputfault error = new Inputfault("Error encountered", x);
                throw error;
            }
        } else {
            Fault x = factory.createFault();
            x.setErrorCode((short) 300);
            x.setMessage("Invalid postcode makeup: " + postcode);
            Inputfault error = new Inputfault("Error encountered", x);
            throw error;
        }

        return response;
    }

    private boolean checkPostcodeSyntax(String postcode) {
        return postcode.matches("[1-9][0-9]{3}[A-Z]{2}");
    }
}


