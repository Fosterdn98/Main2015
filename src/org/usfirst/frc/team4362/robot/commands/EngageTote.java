package org.usfirst.frc.team4362.robot.commands;

import edu.wpi.first.wpilibj.Solenoid;
import edu.wpi.first.wpilibj.command.Command;

/**
 *
 */
public class EngageTote extends CommandBase {
	static Solenoid LargeUp; /*!< Creates new Solenoid shifter. */
	static Solenoid LargeDown; /*!< Creates new Solenoid shifter. */
    public EngageTote() {
        // Use requires() here to declare subsystem dependencies
        // eg. requires(chassis);
    	LargeUp = new Solenoid(0);/*!< Gets an instance of upShifter from OI.java. */
    	LargeDown = new Solenoid(1); /*!< Gets an instance of downShifter from OI.java. */
    }

    // Called just before this Command runs the first time
    protected void initialize() {
    	this.execute();
    }

    // Called repeatedly when this Command is scheduled to run
    protected void execute() {
    	LargeUp.set(false);
    	LargeDown.set(true);
    }

    // Make this return true when this Command no longer needs to run execute()
    protected boolean isFinished() {
        return false;
    }

    // Called once after isFinished returns true
    protected void end() {
    }

    // Called when another command which requires one or more of the same
    // subsystems is scheduled to run
    protected void interrupted() {
    }
}
