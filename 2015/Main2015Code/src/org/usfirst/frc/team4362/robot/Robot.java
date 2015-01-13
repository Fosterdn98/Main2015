/**
 * 
 */
package org.usfirst.frc.team4362.robotFunctions;

import edu.wpi.first.wpilibj.Compressor;
import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.RobotDrive;
import edu.wpi.first.wpilibj.Solenoid;
import edu.wpi.first.wpilibj.Talon;
import edu.wpi.first.wpilibj.TalonSRX;
import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;

import org.usfirst.frc.team4362.robotHardware.Talonsrx.*;
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
	/*
	 * C_ = constant varibles were the number will never change while code is runing
	 * V_ = Unconstant variables were the number will change while the code is running
	 * all variables are all caps so that they are easier to see
	 * init of robot element variable names are java standard when nameing comes into place
	 */

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
		boolean V_LEFTHIGHLOW = false;
		boolean V_RIGHTHIGHLOW = false;
		public static boolean V_SHIFTHIGHLOW = false;

		// gear box high low sols.
		Solenoid shifter;

		// comprs. setup
		private Compressor compressor;

		// controller setup
		private Joystick leftStick;
		private Joystick rightStick;

		// public static vars.
		int C_SHIFTER = 2;
		int C_COMPRESSORPORT = 1;
		int C_LEFTSTICKPORT = 1;
		int C_RIGHTSTICKPORT = 2;
		int C_LEFTFRONT = 1;
		int C_LEFTBACK = 2;
		int C_RIGHTFRONT = 3;
		int C_RIGHTBACK = 4;

		// Joystick vars
		int C_LEFTJOYSTICKMOVE = 2;
		int C_RIGHTJOYSTICKMOVE = 2;
		int C_GEARSWITCHBUTTON = 5;
		double V_LEFTMOVE;
		double V_RIGHTMOVE;

		/*
		 * (non-Javadoc)
		 * 
		 * @see edu.wpi.first.wpilibj.IterativeRobot#robotInit()
		 */
		public void init() {
			// Tallon inti
			leftFront = new Talon(C_LEFTFRONT);
			leftBack = new Talon(C_LEFTBACK);
			rightFront = new Talon(C_RIGHTFRONT);
			rightBack = new Talon(C_RIGHTBACK);

			/*
			 * robot tank drive function setup (left front, left rear, right front,
			 * right rear
			 */
			tankChassis = new RobotDrive(leftFront, leftBack, rightFront, rightBack);

			// robot sols. init
			shifter = new Solenoid(C_SHIFTER);

			// comprs. inti
			compressor = new Compressor(C_COMPRESSORPORT);
			compressor.start();

			// joy. init
			leftStick = new Joystick(C_LEFTSTICKPORT);
			rightStick = new Joystick(C_RIGHTSTICKPORT);
		}

		/**
		 * This function is called periodically during autonomous
		 */
		public void auton() {
			//!robot drives forward at fill speed for given time
			for(int i; i>100; i++){
				tankChassis.drive(100,0);
			}
			tankChassis.drive(0,0);

		}

		/**
		 * This function is called periodically during operator control
		 */
		public void teleop() {
			V_LEFTMOVE = leftStick.getRawAxis(C_LEFTJOYSTICKMOVE);
			V_RIGHTMOVE = rightStick.getRawAxis(C_RIGHTJOYSTICKMOVE);
			V_LEFTHIGHLOW = leftStick.getRawButton(C_GEARSWITCHBUTTON);
			V_RIGHTHIGHLOW = rightStick.getRawButton(C_GEARSWITCHBUTTON);

			// reads button to set gear shift boolean to true or false
			if (V_LEFTHIGHLOW) {
				shifter.set(true);
			}
			if (V_RIGHTHIGHLOW) {
				shifter.set(false);
			}


			// write gear to smarth dashboard
			//SmartDashboard.putBoolean("High Gear", SHIFTHIGHLOW);

			// makes the robot drive based off of left and right joystick value
			tankChassis.tankDrive(V_LEFTMOVE, V_RIGHTMOVE);
		}

		/**
		 * This function is called periodically during test mode
		 */
		
		  public void testperiodic() {
		 
		  }
	}