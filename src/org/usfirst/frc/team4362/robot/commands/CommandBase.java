package org.usfirst.frc.team4362.robot.commands;

import edu.wpi.first.wpilibj.command.Command;

import org.usfirst.frc.team4362.robot.OI;
import org.usfirst.frc.team4362.robot.subsystems.Chassis;
/**
 *
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
