package org.usfirst.frc.team4362.robotFunctions;

import edu.wpi.first.wpilibj.Compressor;
import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.RobotDrive;
import edu.wpi.first.wpilibj.Solenoid;
import edu.wpi.first.wpilibj.Talon;
import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;

/**
 * This class will contain the relevant code to driving in each of the four functions. Objectives are to execute 
 * autonomous mode, provide drivers with complete control over driving, and provide programmers useful testing information.
 *
 * To Do List -- Verify this code is working, has not been tested yet.
 * 
 * init() -- provide resources necessary for driving.
 *
 * auton() -- executes the desired driving actions in autonomous.
 * 
 * teleop() -- executes the driver's input.
 * 
 * testperiodic() -- provide programmers with useful diagnostic information.
 */
public class Drive {

		
		private RobotDrive tankChassis; /*!< Main Robot Drive Setup */

		
		Talon leftFront; /*!< Create left front Talon. */
		Talon leftBack; /*!< Create left back Talon. */
		Talon rightFront; /*!< Create right front Talon. */
		Talon rightBack; /*!< Create right back Talon. */

		boolean LEFTHIGHLOW = false; /*!< Boolean representing the left joystick throttle button. */
		boolean RIGHTHIGHLOW = false; /*!< Boolean representing the right joystick throttle button. */
		boolean SHIFTHIGHLOW = false; /*!< Boolean that stores the selected gear. FALSE = Low Gear, TRUE = High Gear. */

		Solenoid shifterLeft; /*!< Create the left gearbox's shifter solenoid. */
		Solenoid shifterRight; /*!< Create the right gearbox's shifter solenoid. */

		private Compressor compressor; /*!< Create the compressor. */

		private Joystick leftStick; /*!< Create the left joystick. */
		private Joystick rightStick; /*!< Create the right joystick. */

		int SHIFTERLEFT = 2; /*!< Set the Left shifter's solenoid port #. */
		int SHIFTERRIGHT = 3; /*!< Set the Right shifter's solenoid port #. */
		int COMPRESSORPORT = 1; /*!< Set the Compressor's port #. */
		int LEFTSTICKPORT = 1; /*!< Set the left joystick port #. */
		int RIGHTSTICKPORT = 2; /*!< Set the right joystick port #. */
		int LEFTFRONT = 1; /*!< Set left front Talon port #. */
		int LEFTBACK = 2; /*!< Set left back Talon port #. */
		int RIGHTFRONT = 3; /*!< Set right front Talon port #. */
		int RIGHTBACK = 4; /*!< Set right back Talon port #. */

		int LEFTJOYSTICKMOVE = 2; /*!< Set left joystick's forward axis #. */
		int RIGHTJOYSTICKMOVE = 2; /*!< Set right joystick's forward axis #. */
		int GEARSWITCHBUTTON = 5; /*!< Set the right and left joystick's gear switch button #. */
		double LEFTMOVE; /*!< Create left motor's speed #. */
		double RIGHTMOVE; /*!< Create right motor's speed #. */
		/**
	     * This function is run every time Drive.init() is called and should be used for any initialization code.
	     */
		public void init() {
			
			leftFront = new Talon(LEFTFRONT); /*!< Setup left front Talon. */
			leftBack = new Talon(LEFTBACK); /*!< Setup left back Talon. */
			rightFront = new Talon(RIGHTFRONT); /*!< Setup right front Talon. */
			rightBack = new Talon(RIGHTBACK); /*!< Setup right back Talon. */

			tankChassis = new RobotDrive(leftFront, leftBack, rightFront, rightBack); /*!< Create the RobotDrive with set Talons. */

			shifterLeft = new Solenoid(SHIFTERLEFT); /*!< Create left shifter solenoid with set port #. */
			shifterRight = new Solenoid(SHIFTERRIGHT); /*!< Create right shifter solenoid with set port #. */

			compressor = new Compressor(COMPRESSORPORT); /*!< Create the Compressor with set port #. */
			compressor.start(); /*!< Starts the Compressor. */

			leftStick = new Joystick(LEFTSTICKPORT); /*!< Create the left Joystick with set port #. */
			rightStick = new Joystick(RIGHTSTICKPORT); /*!< Create the right Joystick with set port #. */
		}
		/**
	     * This function is run every time Drive.auton() is called and executes the desired driving actions in autonomous.
	     */
		public void auton() {

		}
		/**
		 * This function is run every time Drive.teleop() is called and executes the driver's input.
		 */
		public void teleop() {
			LEFTMOVE = leftStick.getRawAxis(LEFTJOYSTICKMOVE); /*!< Get left Joystick's current axis position. */
			RIGHTMOVE = rightStick.getRawAxis(RIGHTJOYSTICKMOVE); /*!< Get right Joystick's current axis position. */
			LEFTHIGHLOW = leftStick.getRawButton(GEARSWITCHBUTTON); /*!< Get left Joystick's current gear switch button state. */
			RIGHTHIGHLOW = rightStick.getRawButton(GEARSWITCHBUTTON); /*!< Get left Joystick's current gear switch button state. */

			if (LEFTHIGHLOW) { /*!< Checks state of left gear switch button and runs contained code if true.  */
				SHIFTHIGHLOW = true; /*!< Sets gear switch to TRUE (High Gear).  */
			}
			if (RIGHTHIGHLOW) { /*!< Checks state of right gear switch button and runs contained code if true.  */
				SHIFTHIGHLOW = false; /*!< Sets gear switch to FALSE (Low Gear).  */
			}

			if (SHIFTHIGHLOW) { /*!< Checks state of the gear switching boolean and runs contained code if TRUE (High Gear).  */
				shifterLeft.set(true); /*!< Sets left gear switcher to TRUE (High Gear).  */
				shifterRight.set(true); /*!< Sets right gear switcher to TRUE (High Gear).  */
			} else { /*!< Checks state of the gear switching boolean and runs contained code if NOT TRUE aka FALSE (Low Gear).  */
				shifterLeft.set(false); /*!< Sets left gear switcher to FALSE (Low Gear).  */
				shifterRight.set(false); /*!< Sets right gear switcher to FALSE (Low Gear).  */
			}

			SmartDashboard.putBoolean("High Gear", SHIFTHIGHLOW); /*!< Outputs value of gear switching boolean to SmartDashboard.  */

			// makes the robot drive based off of left and right joystick value 
			tankChassis.tankDrive(LEFTMOVE, RIGHTMOVE); /*!< Sets the TankDrive speed values to their matching joystick values.  */
		}
		/**
		 * This function is run every time Drive.test() is called and provides programmers with useful diagnostic information.
		 */
		  public void test() {
		 
		  }
	}