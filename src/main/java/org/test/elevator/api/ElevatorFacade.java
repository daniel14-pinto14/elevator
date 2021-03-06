package org.test.elevator.api;


public interface ElevatorFacade {
	
	/**
	 * Moves an Elevator up one Floor.
	 */
	void moveUpOneFloor();

	/**
	 * Moves an Elevator down one Floor.
	 */
	void moveDownOneFloor();
	
	/**
	 * Locks the elevator breaks, to prevent it from moving.
	 */
	void lockBreaks();
	
	/**
	 * Unlocks the elevator breaks allowing it to move again.
	 */
	void unlockBreaks();
	
}
