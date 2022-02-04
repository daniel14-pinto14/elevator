#Elevator Simulator

The maven project is a Spring MVC and REST application with Angular.js as the front-end engine.

##REST API

``BuildingController`` has REST API related to the elevator call made from each floor
1. ``PUT /building/up/{floorNo}``: Used to call a lift to go up from the floor with number as ``floorNo``
2. ``PUT /building/down/{floorNo}``: Used to call a lift to go down from the floor with number as ``floorNo``

## API Endpoints for RequestInsider & Requestoutside for elevator.

``ElevatorController`` has REST API related to the elevator call made from the inside of the elevator
1. ``PUT /elevator/{elevatorId}/goto/{floorNo}``: called when a person inside the elevator press a button to goto a floor
2. ``GET /elevator/{elevatorId}/status``: To get the status of the elevator identified by the ``elevatorId``
3. ``PUT /elevator/{elevatorId}/stop``: To stop the elevator identified by the ``elevatorId``
4. ``GET /elevator``: To get the template ``index.jsp`` to see the status of the elevators

##3rd Party API
I have also exposed a API to be given to the hardward company identified by ``BuildingSvc`` and ``ElevatorSvc``.

##Test Cases
I have created a class to test the elevator simulation in ``SimulatorTest``. 
Also to test REST API I have used the POSTMAN script checkin with the code ``ELEVATOR_REST_API_TEST.json``.

