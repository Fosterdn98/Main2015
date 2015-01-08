package org.usfirst.frc.team4362.robotHardware;

import edu.wpi.first.wpilibj.DriverStation;
import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;

/**
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
 */

public class Roborio {
	/**
     * This function is run every time Roborio.auton() is called and performs the necessary RoboRio operations in autonomous mode.
     */
	public void auton() {
	   
	}
	/**
	 * This function is run every time Roborio.teleop() is called and performs the necessary RoboRio operations in teleoperated mode.
	 */
	public void teleop() {
		boolean attached = DriverStation.getInstance().isDSAttached(); //Is the DS communicating with the robot?
		boolean sysActive = DriverStation.getInstance().isSysActive(); //Are the FPGA outputs (such as PWM) active
		boolean brownedOut = DriverStation.getInstance().isBrownedOut(); //Is the roboRIO brownout protection active?
		SmartDashboard.putBoolean("DS-Rr Comms", attached); //Outputs whether DS (driver station) is connected to Rr (RoboRio).
		SmartDashboard.putBoolean("PWM Status", sysActive); //Outputs whether the FPGA outputs are active (Includes PWM's)
		SmartDashboard.putBoolean("RoboRio Brownout", brownedOut); //Outputs whether the RoboRio is browned out.
	}
	/**
     * This function is run every time Roborio.init() is called and should be used for any initialization code.
     */
	public void init() {
		   
	}
	/**
	 * This function is run every time Roborio.test() is called and provides programmers with useful diagnostic information.
	 */
	public void test() {
		   
	}
}
