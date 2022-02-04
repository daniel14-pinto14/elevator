package org.elevator.service.impl;

import org.elevator.business.ElevatorPubSingleton;
import org.elevator.common.FloorCall;
import org.elevator.service.ElevatorSvc;
import org.springframework.stereotype.Component;


@Component
public class ElevatorSvcImpl implements ElevatorSvc {

    public void gotoFloor(int floorNo, int elevatorId) {
        ElevatorPubSingleton.elevatorPub.gotoFloor(floorNo, elevatorId);
    }

    public void gotoInsideFloor(int floorNo, int elevatorId) {
        ElevatorPubSingleton.elevatorPub.gotoInsideFloor(floorNo, elevatorId);
    }

    public void stop(int elevatorId){
        ElevatorPubSingleton.elevatorPub.stop(elevatorId);
    }

    public FloorCall status(int elevatorId) {
        return ElevatorPubSingleton.elevatorPub.status(elevatorId);
    }
}
