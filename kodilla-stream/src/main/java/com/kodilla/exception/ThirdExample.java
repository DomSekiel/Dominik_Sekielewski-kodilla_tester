package com.kodilla.exception;

public class ThirdExample {
    public static void main(String[] args) throws AirportNotFoundException {
        AirportRepository airportRepository = new AirportRepository();
        //boolean isViennaInUse = false;
        try {
            boolean isViennaInUse = airportRepository.isAirportInUse("Vienna");
            //isViennaInUse = airportRepository.isAirportInUse("Vienna");
            System.out.println("Vienna status: "  + isViennaInUse);
        }   catch(AirportNotFoundException e){
            //e.printStackTrace();
            System.out.println("Sorry, this airport cannot be served by our airlines.");
        }
        System.out.println("Thank You for using Kodilla Airlines");
    }
}
