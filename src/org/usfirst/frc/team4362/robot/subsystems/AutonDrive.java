package org.usfirst.frc.team4362.robot.subsystems;

import org.usfirst.frc.team4362.robot.RobotMap;

import edu.wpi.first.wpilibj.CANTalon;
import edu.wpi.first.wpilibj.Encoder;
import edu.wpi.first.wpilibj.command.Subsystem;

/**
 *
 */
public class AutonDrive extends Subsystem {
	private CANTalon leftFront; /*!< Creates Talon leftFront. */
	private CANTalon leftBack; /*!< Creates Talon leftBack. */
	private CANTalon rightFront; /*!< Creates Talon rightFront. */
	private CANTalon rightBack; /*!< Creates Talon rightBack. */
	Encoder leftEncoder, rightEncoder;
	public AutonDrive(){
	leftFront = new CANTalon(RobotMap.C_LEFTFRONT); /*!< Sets leftFront to a new Talon on PWM port RobotMap.C_LEFTFRONT. Needs to be changed to use TalonSRX's. */
	leftBack = new CANTalon(RobotMap.C_LEFTBACK); /*!< Sets leftBack to a new Talon on PWM port RobotMap.C_LEFTBACK. Needs to be changed to use TalonSRX's. */
	rightFront = new CANTalon(RobotMap.C_RIGHTFRONT); /*!< Sets rightFront to a new Talon on PWM port RobotMap.C_RIGHTFRONT. Needs to be changed to use TalonSRX's. */
	rightBack = new CANTalon(RobotMap.C_RIGHTBACK); /*!< Sets rightBack to a new Talon on PWM port RobotMap.C_RIGHTBACK. Needs to be changed to use TalonSRX's. */
	leftEncoder = new Encoder(0,1,true);
	rightEncoder = new Encoder(2,3,false);
	leftEncoder.setDistancePerPulse(RobotMap.DistancePerPulse);
	rightEncoder.setDistancePerPulse(RobotMap.DistancePerPulse);
	}
	public void initDefaultCommand() {
        // Set the default command for a subsystem here.
    	setDefaultCommand(null);
    	
    }
    public void AutonDrive(double speed, double move){
    	if(leftEncoder.getDistance() != move && rightEncoder.getDistance() != move ){
    		leftFront.set(speed); /*!< Sets the leftFront Talon to the value of arguement left. */
        	leftBack.set(speed); /*!< Sets the leftBack Talon to the value of arguement left. */
        	rightFront.set(speed); /*!< Sets the rightFront Talon to the value of arguement right. */
        	rightBack.set(speed); /*!< Sets the rightBack Talon to the value of arguement right. */
    	}
    	
    	
    }
}

