package org.usfirst.frc.team4362.robot;

import org.usfirst.frc.team4362.robotFunctions.Drive;
import org.usfirst.frc.team4362.robotHardware.Roborio;
import edu.wpi.first.wpilibj.IterativeRobot;
//testchangedeletethis
/**
 * Robot extends the IterativeRobot class.
 *
 * This class will be laid out such that each function will only contain the execution method for classes in the robotFunctions and
 * robotHardware packages.The objective here is to make our program more modular, improve ease to debug, and minimize req. resources.
 *
 * To Do List -- add code as necessary for the function of the robot.
 * 
 * robotInit() -- provide for initialization at robot power-on.
 *
 * init() functions -- each of the following functions is called once at robot power-on:
 * 
 *  - Drive.init()   -- initializes all resources necessary for driving.
 *  - Roborio.init() -- initializes all resources necessary for RoboRio manangement and monitoring.
 *
 * auton() functions -- each of these functions is called iteratively during autonomous mode at a frequency of 50 times per second.
 *  
 *  - Drive.auton()   -- executes the desired driving actions in autonomous mode.
 *  - Roborio.auton() -- manages and monitors the RoboRio in autonomous mode.
 *   
 * telop() functions -- each of these functions is called iteratively during teleoperated mode at a frequency of 50 times per second.
 * 
 *  - Drive.teleop()   -- executes the desired driving actions in teleop mode.
 *  - Roborio.teleop() -- manages and monitors the RoboRio in teleop mode.
 *  
 * test() functions -- each of these functions is called iteratively during test mode at a frequency of 50 times per second.
 * 
 *  - Drive.test()   -- provides programmers with useful diagnostic information about Drive.
 *  - Roborio.test() -- manages and monitors the RoboRio in test mode.
 *
 */

public class Robot extends IterativeRobot {
	Drive Drive = new Drive();
    Roborio Roborio = new Roborio();
    
    /**
     * This function is run when the robot is first started up and should be used for any initialization code.
     */
    public void robotInit() {
    	Drive.init();
    	Roborio.init();
    }

    /**
     * This function is called periodically during autonomous.
     */
    public void autonomousPeriodic() {
    	Drive.auton();
    	Roborio.auton();
    }

    /**
     * This function is called periodically during operator control.
     */
    public void teleopPeriodic() {
    	Drive.teleop();
    	Roborio.teleop();
    }
    
    /**
     * This function is called periodically during test mode.
     */
    public void testPeriodic() {
    	Drive.test();
    	Roborio.test();
    }
    
}
