package org.elevator.service;

import org.elevator.common.FloorCall;


public interface ElevatorSvc {
    void gotoFloor(int floorNo, int elevatorId);
    void gotoInsideFloor(int floorNo, int elevatorId);
    void stop(int elevatorId);

    FloorCall status(int elevatorId);
}
