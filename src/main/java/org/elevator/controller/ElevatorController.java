package org.elevator.controller;

import org.elevator.common.FloorCall;
import org.elevator.service.ElevatorSvc;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.apache.log4j.Logger;



@Controller
@RequestMapping("/elevator")
public class ElevatorController {

    static Logger log = Logger.getLogger(ElevatorController.class.getName());
    @Autowired
    private ElevatorSvc elevatorSvc;

    @RequestMapping(value = "/requestoutsideElevator/{elevatorId}/goto/{floorNo}", method = RequestMethod.PUT)
    public void gotoFloor(@PathVariable int elevatorId, @PathVariable int floorNo) {
        log.info("FloorNo:" + floorNo + " ElevatorId " + elevatorId);
        elevatorSvc.gotoFloor(floorNo, elevatorId);
    }


    @RequestMapping(value = "/requestInsideElevator/{elevatorId}/{floor}", method = RequestMethod.GET)
    public void requestInsideElevator(@NotNull @PathVariable Integer elevatorId,@NotNull @PathVariable Integer floor) {
        log.info("Elevator Event " + "Inside Elevator "+elevatorId+ " to floor "+ floor);
        elevatorSvc.gotoInsideFloor(floorNo, elevatorId);
    }


    @RequestMapping(value = "/{elevatorId}/status", method = RequestMethod.GET)
    public
    @ResponseBody
    FloorCall status(@PathVariable int elevatorId) {
        return elevatorSvc.status(elevatorId);
    }

    @RequestMapping(value = "/{elevatorId}/stop", method = RequestMethod.PUT)
    public void stop(@PathVariable int elevatorId) {
        elevatorSvc.stop(elevatorId);
    }

    @RequestMapping(value = "/elevator", method = RequestMethod.GET)
    public String printWelcome() {
        return "index";
    }
}
