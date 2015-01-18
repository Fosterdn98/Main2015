package org.usfirst.frc.team4362.robot.subsystems;

import edu.wpi.first.wpilibj.Talon;
import edu.wpi.first.wpilibj.command.Subsystem;
import org.usfirst.frc.team4362.robot.RobotMap;
/**
 *
 */
public class Chassis extends Subsystem {
    
    // Put methods for controlling this subsystem
    // here. Call these from Commands.
	private Talon leftFront;
	private Talon leftBack;
	private Talon rightFront;
	private Talon rightBack;
	public Chassis(){
	leftFront = new Talon(RobotMap.C_LEFTFRONT);
	leftBack = new Talon(RobotMap.C_LEFTBACK);
	rightFront = new Talon(RobotMap.C_RIGHTFRONT);
	rightBack = new Talon(RobotMap.C_RIGHTBACK);
	}
	public void initDefaultCommand() {
        // Set the default command for a subsystem here.
        //setDefaultCommand(new MySpecialCommand());
    }
    public void tankDrive(double left, double right){
    	leftFront.set(left);
    	leftBack.set(left);
    	rightFront.set(right);
    	rightBack.set(right);
    	
    }
}

