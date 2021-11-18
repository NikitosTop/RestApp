package com.example.demo;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.server.ResponseStatusException;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

@RestController
public class getFlightInfoController {

    private static final List<FlightInfo> flightInfoList;

    static {
        flightInfoList = new ArrayList<>();
        flightInfoList.add(new FlightInfo("Kiev", "Kharkov", "D80"));
        flightInfoList.add(new FlightInfo("La", "San-Francisco", "DP21"));
        flightInfoList.add(new FlightInfo("New-York", "Boston", "SV78"));
    }

    @GetMapping("flights/{id}")
    public FlightInfo getFlightInfo(@PathVariable int id) {
        if (id >= flightInfoList.size()) {
            throw new FlightNotFoundException("Flight not found for id =" + id);
        }else{
            return flightInfoList.get(id);
        }
    }

}

@ResponseStatus(code = HttpStatus.BAD_REQUEST)
class FlightNotFoundException extends RuntimeException {

    public FlightNotFoundException(String cause) {
        super(cause);
    }
}