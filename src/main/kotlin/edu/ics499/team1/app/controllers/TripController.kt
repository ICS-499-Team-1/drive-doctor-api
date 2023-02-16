//package edu.ics499.team1.app.controllers
//
//import edu.ics499.team1.app.domains.requests.Trip
//import edu.ics499.team1.app.services.TripService
//import org.springframework.http.HttpStatus
//import org.springframework.web.bind.annotation.*
//
//// TODO: Exception Handlers
//// TODO: Should getTotalMileage have specific start/end dates?
//
///**
// * [getTrips] Returns a collection of all trips associated with a specific userID
// * [addTrip] Adds a trip to the specific user's trip collection
// * [setMileage] Sets the mileage for a specific trip
// * [getTotalMileage] gets the totalMileage driven by a specific user
// */
//@RestController
//@RequestMapping("api/{userId}/trips") // TODO: is this a logical mapping? or is api/trips better?
//class TripController(private val service: TripService) {
//
//    @GetMapping
//    fun getTrips(): Collection<Trip> = service.getTrips()
//
//    @PostMapping
//    @ResponseStatus(HttpStatus.CREATED)
//    fun addTrip(@RequestBody trip: Trip) {
//        // service.addTrip(trip)
//    }
//
//    @PatchMapping
//    fun setMileage(@RequestBody trip: Trip) {
//        // service.setMileage(trip)
//    }
//
//    @GetMapping
//    fun getTotalMileage() {
//        // service.getTotalMileage()
//    }
//
//}