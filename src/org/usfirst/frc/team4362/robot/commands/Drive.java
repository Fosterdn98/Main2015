package org.usfirst.frc.team4362.robot.commands;

import edu.wpi.first.wpilibj.DriverStation;
import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.Solenoid;
import edu.wpi.first.wpilibj.buttons.Button;

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
	private Joystick leftStick,rightStick;
	private Button leftTrigger, rightTrigger;
	private Solenoid shifter;
	private DriverStation m_ds;
    public Drive() {
        // Use requires() here to declare subsystem dependencies
        // eg. requires(chassis);
    	requires(chassis);
    	leftStick = oi.getLeftStick();
    	rightStick = oi.getRightStick();
    	leftTrigger = oi.getLeftTigger();
    	rightTrigger = oi.getRightTrigger();
    	shifter = oi.getShifter();
    	m_ds = DriverStation.getInstance();
    }

    // Called just before this Command runs the first time
    protected void initialize() {
    	chassis.tankDrive(0, 0);
    }

    // Called repeatedly when this Command is scheduled to run
    protected void execute() {
    	if(leftTrigger.get()){
    		shifter.set(true);
    	}
    	if(rightTrigger.get()){
    		shifter.set(false);
    	}
    	double left = leftStick.getRawAxis(1);
    	double right = rightStick.getRawAxis(1);
    	chassis.tankDrive(left, right);
    }

    // Make this return true when this Command no longer needs to run execute()
    protected boolean isFinished() {
    	return !m_ds.isOperatorControl();
    }

    // Called once after isFinished returns true
    protected void end() {
    }

    // Called when another command which requires one or more of the same
    // subsystems is scheduled to run
    protected void interrupted() {
    }
}
