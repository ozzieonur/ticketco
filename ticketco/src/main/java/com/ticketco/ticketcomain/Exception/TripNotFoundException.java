package com.ticketco.ticketcomain.Exception;

public class TripNotFoundException extends Throwable {
    private static final String TRIP_NOT_FOUND = "─░stenilen sefer bulunamad─▒.";

    public TripNotFoundException(){
        super(TRIP_NOT_FOUND);
    }
}
