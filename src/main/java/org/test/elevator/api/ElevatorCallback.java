package org.test.elevator.api;


public interface ElevatorCallback {

	/**
	 * Notifies that an elevator arrived on a specific floor.
	 *  
	 * @param floor
	 */
	public void elevatorArrived(int floor);
}
