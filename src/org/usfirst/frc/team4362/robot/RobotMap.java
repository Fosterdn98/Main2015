package org.usfirst.frc.team4362.robot;

/**
 * The RobotMap is a mapping from the ports sensors and actuators are wired into
 * to a variable name. This provides flexibility changing wiring, makes checking
 * the wiring easier and significantly reduces the number of magic numbers
 * floating around.
 */
public class RobotMap {
    // For example to map the left and right motors, you could define the
    // following variables to use with your drivetrain subsystem.
    // public static int leftMotor = 1;
    // public static int rightMotor = 2;
    
    // If you are using multiple modules, make sure to define both the port
    // number and the module. For example you with a rangefinder:
    // public static int rangefinderPort = 1;
    // public static int rangefinderModule = 1;
	//Tallon controllers
	public static final int C_LEFTFRONT = 2; 
	public static final int C_LEFTBACK = 4; 
	public static final int C_RIGHTFRONT = 1;
	public static final int C_RIGHTBACK = 3;
	//solinoid port number for shifter
	public static final int C_SHIFTERDOWN = 2;
	public static final int C_SHIFTERUP = 1;
	//the compressor port number
	public static final int C_COMPRESSORPORT = 1;
}
