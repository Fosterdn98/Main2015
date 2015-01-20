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
 * Adds buttons and triggers in a seperate file that is called only when necessary instead of being constantly checked, like axis.
 * 
 * To create a button or trigger:
 * Joystick stick = new Joystick(port);
 * Button button = new JoystickButton(stick, buttonNumber);
 */

public class OI {
	private Joystick leftStick, rightStick; /*!< Creates new Joystick leftStick and rightStick. */
	private Solenoid shifter; /*!< Creates new Solenoid shifter. */
	public OI(){
	leftStick = new Joystick(RobotMap.C_LEFTSTICK); /*!< Sets leftStick to a new Joystick on USB port C_LEFTSTICK. */
	rightStick = new Joystick(RobotMap.C_RIGHTSTICK); /*!< Sets rightStick to a new Joystick on USB port C_RIGHTSTICK. */
	shifter = new Solenoid(RobotMap.C_SHIFTER); /*!< Sets shifter to a new Solenoid on CAN address C_SHIFTER. */
	
	}
	Button leftTrigger = new JoystickButton(leftStick, RobotMap.C_LEFTTRIGGER); /*!< Sets leftTrigger to a new JoystickButton on button number C_LEFTTRIGGER. */
	Button rightTrigger = new JoystickButton(rightStick, RobotMap.C_RIGHTTRIGGER); /*!< Sets rightTrigger to a new JoystickButton on button number C_RIGHTTRIGGER. */
	
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
	public Solenoid getShifter(){
		return shifter; /*!< This function returns the shifter solenoid's initialization. */
	}
	
}


