/**
 * 
 */
package org.usfirst.frc.team4362.robotFunctions;

import edu.wpi.first.wpilibj.Compressor;
import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.RobotDrive;
import edu.wpi.first.wpilibj.Solenoid;
import edu.wpi.first.wpilibj.Talon;
import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;

/**
 * @author Dustin Newman (Original)
 * @author Joshua Arking (Integration)
 */
/** Objectives and formatting - 
 *  This class will contain the relevant code to driving in each of the four functions. Objectives are to execute 
 *  autonomous mode, provide drivers with complete control over driving, and provide programmers useful testing information.
 */ 
/** To do list - 
 *  Verify this code is working, has not been tested yet.
 */ 
public class Drive {

		// main robot drive setup
		private RobotDrive tankChassis;

		// Talon set up
		Talon leftFront;
		Talon leftBack;
		Talon rightFront;
		Talon rightBack;

		// Count vars.
		int count;

		/*
		 * LEFTHIGHLOW && RIGHTHIGHLOW are the button booleans for the left and
		 * right joystick SHIFTHIGHLOW false = low gear ; true = highgear
		 */
		boolean LEFTHIGHLOW = false;
		boolean RIGHTHIGHLOW = false;
		boolean SHIFTHIGHLOW = false;

		// gear box high low sols.
		Solenoid shifterLeft;
		Solenoid shifterRight;

		// comprs. setup
		private Compressor compressor;

		// controller setup
		private Joystick leftStick;
		private Joystick rightStick;

		// public static vars.
		int SHIFTERLEFT = 2;
		int SHIFTERRIGHT = 3;
		int COMPRESSORPORT = 1;
		int LEFTSTICKPORT = 1;
		int RIGHTSTICKPORT = 2;
		int LEFTFRONT = 1;
		int LEFTBACK = 2;
		int RIGHTFRONT = 3;
		int RIGHTBACK = 4;

		// Joystick vars
		int LEFTJOYSTICKMOVE = 2;
		int RIGHTJOYSTICKMOVE = 2;
		int GEARSWITCHBUTTON = 5;
		double LEFTMOVE;
		double RIGHTMOVE;

		/*
		 * (non-Javadoc)
		 * 
		 * @see edu.wpi.first.wpilibj.IterativeRobot#robotInit()
		 */
		public void init() {
			// Tallon inti
			leftFront = new Talon(LEFTFRONT);
			leftBack = new Talon(LEFTBACK);
			rightFront = new Talon(RIGHTFRONT);
			rightBack = new Talon(RIGHTBACK);

			/*
			 * robot tank drive function setup (left front, left rear, right front,
			 * right rear
			 */
			tankChassis = new RobotDrive(leftFront, leftBack, rightFront, rightBack);

			// robot sols. init
			shifterLeft = new Solenoid(SHIFTERLEFT);
			shifterRight = new Solenoid(SHIFTERRIGHT);

			// comprs. inti
			compressor = new Compressor(COMPRESSORPORT);
			compressor.start();

			// joy. init
			leftStick = new Joystick(LEFTSTICKPORT);
			rightStick = new Joystick(RIGHTSTICKPORT);
		}

		/**
		 * This function is called periodically during autonomous
		 */
		public void auton() {

		}

		/**
		 * This function is called periodically during operator control
		 */
		public void teleop() {
			LEFTMOVE = leftStick.getRawAxis(LEFTJOYSTICKMOVE);
			RIGHTMOVE = rightStick.getRawAxis(RIGHTJOYSTICKMOVE);
			LEFTHIGHLOW = leftStick.getRawButton(GEARSWITCHBUTTON);
			RIGHTHIGHLOW = rightStick.getRawButton(GEARSWITCHBUTTON);

			// reads button to set gear shift boolean to true or false
			if (LEFTHIGHLOW) {
				SHIFTHIGHLOW = true;
			}
			if (RIGHTHIGHLOW) {
				SHIFTHIGHLOW = false;
			}

			// sets gear shifter on or off
			if (SHIFTHIGHLOW) {
				shifterLeft.set(true);
				shifterRight.set(true);
			} else {
				shifterLeft.set(false);
				shifterRight.set(false);
			}

			// write gear to smarth dashboard
			SmartDashboard.putBoolean("High Gear", SHIFTHIGHLOW);

			// makes the robot drive based off of left and right joystick value
			tankChassis.tankDrive(LEFTMOVE, RIGHTMOVE);
		}

		/**
		 * This function is called periodically during test mode
		 */
		
		  public void testperiodic() {
		 
		  }
	}