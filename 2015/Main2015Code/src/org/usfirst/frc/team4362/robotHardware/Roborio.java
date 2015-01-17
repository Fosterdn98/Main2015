<<<<<<< HEAD
/**
 * 
 */
=======
>>>>>>> origin/Josh
package org.usfirst.frc.team4362.robotHardware;

import edu.wpi.first.wpilibj.DriverStation;
import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;

/**
<<<<<<< HEAD
 * @author Joshua Arking
 *
 */
/** Objectives and formatting - 
 *  This class will contain the relevant code to monitor and control the RoboRio in each of the four main functions. Objective is to
 *  provide a class for easily interfacing and controlling the RoboRio, especially on the CAN bus.
 */ 
/** To do list - 
 *  Check WPIlib documents to see if there's more values that could possibly be useful. 
 */ 
public class Roborio {
	public void auton() {
	   
	}
	public void teleop() {
		boolean attached = DriverStation.getInstance().isDSAttached(); //Is the DS communicating with the robot?
		boolean sysActive = DriverStation.getInstance().isSysActive(); //Are the FPGA outputs (such as PWM) active
		boolean brownedOut = DriverStation.getInstance().isBrownedOut(); //Is the roboRIO brownout protection active?
=======
 * This class will contain the relevant code to monitor and control the RoboRio in each of the four main functions. Objective is to
 * provide a class for easily interfacing and controlling the RoboRio, especially on the CAN bus.
 *
 * To Do List -- Check WPIlib documents to see if there's more values that could possibly be useful.
 * 
 * init() -- provide resources necessary for managing the RoboRio.
 *
 * auton() -- performs the necessary RoboRio operations in autonomous mode.
 * 
 * teleop() -- performs the necessary RoboRio operations in teleoperated mode.
 * 
 * test() -- provide programmers with useful diagnostic information.
 * 
 * accel() -- provides information from the built in accelerometer.
 * 
 * usbcam() -- provides information from attached USB webcam(s).
 * 
 * relay() -- manages I/O with relays.
 *  
 * servo() -- manages I/O with servos.
 * 
 * solenoid() -- manages I/O with solenoids.
 */

public class Roborio {
	boolean attached;
	boolean sysActive;
	boolean brownedOut;
	/**
     * This function is run every time Roborio.init() is called and should be used for any initialization code.
     */
	public void init() {
	
	}
	/**
     * This function is run every time Roborio.auton() is called and performs the necessary RoboRio operations in autonomous mode.
     */
	public void auton() {
	   
	}
	/**
	 * This function is run every time Roborio.teleop() is called and performs the necessary RoboRio operations in teleoperated mode.
	 */
	public void teleop() {
		attached = DriverStation.getInstance().isDSAttached(); //Is the DS communicating with the robot?
		sysActive = DriverStation.getInstance().isSysActive(); //Are the FPGA outputs (such as PWM) active
		brownedOut = DriverStation.getInstance().isBrownedOut(); //Is the roboRIO brownout protection active?
>>>>>>> origin/Josh
		SmartDashboard.putBoolean("DS-Rr Comms", attached); //Outputs whether DS (driver station) is connected to Rr (RoboRio).
		SmartDashboard.putBoolean("PWM Status", sysActive); //Outputs whether the FPGA outputs are active (Includes PWM's)
		SmartDashboard.putBoolean("RoboRio Brownout", brownedOut); //Outputs whether the RoboRio is browned out.
	}
<<<<<<< HEAD
	public void init() {
		   
	}
	public void testperiodic() {
=======
	/**
	 * This function is run every time Roborio.test() is called and provides programmers with useful diagnostic information.
	 */
	public void test() {
		   
	}
	/**
	 * This function is run every time Roborio.accel() is called and provides information from the built in accelerometer.
	 */
	public void accel() {
		   
	}
	/**
	 * This function is run every time Roborio.usbcam() is called and provides information from attached USB webcam(s).
	 */
	public void usbcam() {
		   
	}
	/**
	 * This function is run every time Roborio.relay() is called and manages I/O with relays.
	 */
	public void relay() {
		   
	}
	/**
	 * This function is run every time Roborio.servo() is called and manages I/O with servos.
	 */
	public void servo() {
		   
	}
	/**
	 * This function is run every time Roborio.solenoid() is called and manages I/O with solenoids.
	 */
	public void solenoid() {
>>>>>>> origin/Josh
		   
	}
}
