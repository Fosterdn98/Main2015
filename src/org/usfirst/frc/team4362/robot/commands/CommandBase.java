package org.usfirst.frc.team4362.robot.commands;

import edu.wpi.first.wpilibj.command.Command;

import org.usfirst.frc.team4362.robot.OI;
import org.usfirst.frc.team4362.robot.subsystems.Chassis;
/**
 * This class will be laid out such that all controllers and buttons can be accessed from a central point.
 *
 * To Do List -- add code as necessary for the function of the robot.
 * 
 * Defines non-commands (includes subsystems) in a file, so that during the rest of the program they can be referenced. Checks what each files requires and creates an 
 * instance of each file that can be accessed publicly.
 */
public abstract class CommandBase extends Command {
	public static OI oi;
	public static Chassis chassis;
	
    public CommandBase() {
        // Use requires() here to declare subsystem dependencies
        // eg. requires(chassis);
    	super();
    }

   
    public static void  init() {
    	oi = new OI();
    	chassis = new Chassis();
    	
    }

    public CommandBase(String name){
    	super(name);
    }
    
}
