package org.usfirst.frc.team4362.robotHardware;

/**
 * This class will contain the relevant code to control and monitor the Power Distribution Panel in each of the four main functions.
 * Objective is to provide a class for easily interfacing and controlling the Power Distribution Panel, especially using the CAN bus
 * to monitor voltages and output voltages to the smartdashboard using the Driverstation.java class.
 *
 * To Do List -- Add voltage monitoring and output voltages to Driverstation.java. We might also add code to analyze voltages, 
 * cross-reference them with past measurements, and use the resulting information to determine battery percentages and give drivers 
 * warnings.
 * 
 * init() -- provide resources necessary for managing the Powerpanel.
 *
 * auton() -- performs the necessary Power operations in autonomous mode.
 * 
 * teleop() --  executes the necessary Power output in teleoperated mode.
 * 
 * test() -- provide programmers with useful diagnostic information.
 */

public class Powerpanel {
	/**
     * This function is run every time Powerpanel.auton() is called and performs the necessary Power operations in 
     * autonomous mode.
     */
	public void auton() {
		   
	}
	/**
	 * This function is run every time Powerpanel.teleop() is called and executes the necessary Power output in 
	 * teleoperated mode.
	 */
	public void teleop() {
		
	}
	/**
     * This function is run every time Powerpanel.init() is called and should be used for any initialization code.
     */
	public void init() {
		   
	}
	/**
	 * This function is run every time Powerpanel.test() is called and provides programmers with useful diagnostic 
	 * information.
	 */
	public void test() {
		   
	}
}
