
package org.usfirst.frc.team4362.robot;

import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.Solenoid;
import edu.wpi.first.wpilibj.buttons.Button;
import edu.wpi.first.wpilibj.buttons.JoystickButton;

/**
 * This class is the glue that binds the controls on the physical operator
 * interface to the commands and command groups that allow control of the robot.
 */

/**
 * This class will be laid out such that all controllers and buttons can be accessed from a central point.
 *
 * To Do List -- add code as necessary for the function of the robot.
 * 
 * Adds buttons and triggers in a seperate file that is called only when necessary instead of being constantly checked, like axis. Add upShifter and downShifter code.
 * 
 * To create a button or trigger:
 * Joystick stick = new Joystick(port);
 * Button button = new JoystickButton(stick, buttonNumber);
 */

public class OI {
	private Joystick leftStick, rightStick; /*!< Creates new Joystick leftStick and rightStick. */
	private Solenoid downShifter; /*!< Creates new Solenoid shifter for shifting down. */
	private Solenoid upShifter; /*!< Creates new Solenoid shifter for shifter up. */
	public OI(){
	leftStick = new Joystick(RobotMap.C_LEFTSTICK); /*!< Sets leftStick to a new Joystick on USB port C_LEFTSTICK. */
	rightStick = new Joystick(RobotMap.C_RIGHTSTICK); /*!< Sets rightStick to a new Joystick on USB port C_RIGHTSTICK. */
	downShifter = new Solenoid(RobotMap.C_SHIFTERLOW); /*!< Sets low shifter to a new Solenoid on CAN address C_SHIFTERLOW. */
	upShifter = new Solenoid(RobotMap.C_SHIFTERHIGH); /*!< Sets high shifter to a new Solenoid on CAN address C_SHIFTERHIGH. */
	}
	Button leftTrigger = new JoystickButton(leftStick, RobotMap.C_TRIGGER); /*!< Sets leftTrigger to a new JoystickButton on button number C_LEFTTRIGGER. */
	Button rightTrigger = new JoystickButton(rightStick, RobotMap.C_TRIGGER); /*!< Sets rightTrigger to a new JoystickButton on button number C_RIGHTTRIGGER. */
	
	public Joystick getLeftStick(){
		return leftStick; /*!< This function returns the left joystick's initialization. */
	}
	public Joystick getRightStick(){
		return rightStick; /*!< This function returns the right joystick's initialization. */
	}
	public Button getLeftTigger(){
		return leftTrigger; /*!< This function returns the left trigger's initialization. */
	}
	public Button getRightTrigger(){
		return rightTrigger; /*!< This function returns the right trigger's initialization. */
	}
	public Solenoid getShifterUp(){
		return upShifter; /*!< This function returns the up shifter solenoid's initialization. */
	}
	public Solenoid getShifterDown(){
		return downShifter; /*!< This function returns the down shifter solenoid's initialization. */
	}
	
}



