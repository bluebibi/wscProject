package koreatech.cse.controller;

import org.springframework.http.HttpStatus;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Created by User on 2015-11-25.
 */
@org.springframework.web.bind.annotation.RestController
public class RestController {
    @Transactional
    @RequestMapping(value="/temperature/{sensorId}", method= RequestMethod.GET,
            produces = "application/json")
    public ResponseEntity<Temperature> temperature(@PathVariable("sensorId") String sensorId) {


        Temperature temperature = temperatureMapper.findOneBySensorId(sensorId);
        if (temperature == null) {
            System.out.println("Temperature sensor with id (" + sensorId + ") is not found");
            return new ResponseEntity<Temperature>(HttpStatus.NOT_FOUND);
        }
        return new ResponseEntity<Temperature>(temperature, HttpStatus.OK);
    }

    private String getAAAA() {
        // 소스 A에서 채집한 정보를 리턴
    }

    private String getBBBB() {
        // 소스 B에서 채집한 정보를 리턴
    }
}
