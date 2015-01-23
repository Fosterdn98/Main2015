package org.usfirst.frc.team4362.robot.commands;

import org.usfirst.frc.team4362.robot.RobotMap;

import edu.wpi.first.wpilibj.DriverStation;
import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.Solenoid;
import edu.wpi.first.wpilibj.buttons.Button;
import edu.wpi.first.wpilibj.buttons.JoystickButton;

/**
 * Drive extends the CommandBase class.
 *
 * This class will be laid out such that each function can be called as a command.
 *
 * To Do List -- add code as necessary for the function of the robot. Move shifting to it's own file.
 * 
 * Drive() -- essentially a init for this command. Checks what is required and inits the joysticks.
 *
 * initialize() -- initializes driving resources.
 * execute() -- gets shifter trigger and driving axis positions and sets tankdrive and shifter to those values.
 * isFinished() -- returns if driving is finished.
 * end() -- called once if isFinished returns true.
 * interrupted() -- called if drive's subsystems are required by another command.
 */

public class Drive extends CommandBase {
	private Joystick leftStick,rightStick; /*!< Creates new Joystick leftStick and rightStick. */
	private Button leftTrigger, rightTrigger; /*!< Creates new Button leftTrigger and rightTrigger. */
	
	private DriverStation ds; /*!< Creates new DriverStation ds. */
    public Drive() {
    	requires(chassis); /*!< Checks if chassis exists, and does not run if it is missing. */
    	leftStick = new Joystick(RobotMap.C_LEFTSTICK); /*!< Creates a new Joystick [leftStick]. */
    	rightStick = new Joystick(RobotMap.C_RIGHTSTICK); /*!< Creates a new Joystick [rightStick]. */
    	leftTrigger = new JoystickButton(leftStick,RobotMap.C_TRIGGER); /*!< Creates a new trigger button [leftTrigger]. */
    	rightTrigger = new JoystickButton(rightStick,RobotMap.C_TRIGGER); /*!< Creates a new trigger button [rightTrigger]. */
    	
    	ds = DriverStation.getInstance(); /*!< Gets an instance of the ds from the DriverStation. */
    }
   
    protected void initialize() {
    	chassis.tankDrive(0, 0); /*!< Sets the speed to zero when initialized. */
    }

    protected void execute() {
    	leftTrigger.whenPressed(ShiftUp);
    	rightTrigger.whenPressed(ShiftDown);
    	double left = leftStick.getRawAxis(RobotMap.C_LEFTAXIS); /*!< Sets left to the current position of the left joystick's axis # C_LEFTAXIS. */
    	double right = rightStick.getRawAxis(RobotMap.C_RIGHTAXIS); /*!< Sets right to the current position of the right joystick's axis # C_RIGHTAXIS. */
    	chassis.tankDrive(left, right); /*!< Sets the values of the chassis.tankDrive to the current joystick values. */
    }

    protected boolean isFinished() { 
    	return !ds.isOperatorControl(); /*!< This returns true if the robot is not in teleop mode. */
    }

    protected void end() {
    	/*!< This code runs once if isFinished() returns true. */
    }

    protected void interrupted() {
    	/*!< This code is called if another command tries to use the subsystem chassis while this class is active. */
    }
}
