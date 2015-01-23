
package org.usfirst.frc.team4362.robot.commands;

import edu.wpi.first.wpilibj.command.Command;
import org.usfirst.frc.team4362.robot.Robot;

/**
 * This is an example of how commands should be made. Not used in code except as a placeholder.
 */
public class ExampleCommand extends Command {

    public ExampleCommand() {
        requires(Robot.exampleSubsystem); /*!< Checks if Robot.exampleSubsystem exists, and does not run if it is missing. */
    }

    protected void initialize() {
    	/*!< Code here is ran when ExampleCommand.initialize() is called. */
    }

    protected void execute() {
    	/*!< Code here is ran when ExampleCommand.execute() is called. */
    }

    protected boolean isFinished() {
        return false; /*!< Returns true when execute will no longer be called. */
    }

    protected void end() {
    	/*!< Code here is ran once after ExampleCommand.isFinished() returns true. */
    }

    protected void interrupted() {
    	/*!< This code is called if another command tries to use the subsystem Robot.exampleSubsystem while this class is active. */
    }
}
