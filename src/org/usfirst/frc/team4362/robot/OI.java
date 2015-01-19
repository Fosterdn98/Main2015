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
	private Joystick leftStick, rightStick;
	private Solenoid shifter;
	public OI(){
	leftStick = new Joystick(0);
	rightStick = new Joystick(1);
	shifter = new Solenoid(RobotMap.C_SHIFTER);
	
	}
	Button leftTrigger = new JoystickButton(leftStick, 1);
	Button rightTrigger = new JoystickButton(rightStick, 1);
	
	public Joystick getLeftStick(){
		return leftStick;
	}
	public Joystick getRightStick(){
		return rightStick;
	}
	public Button getLeftTigger(){
		return leftTrigger;
	}
	public Button getRightTrigger(){
		return rightTrigger;
	}
	public Solenoid getShifter(){
		return shifter;
	}
	
}


