
package org.usfirst.frc.team4362.robot;

import org.usfirst.frc.team4362.robotFunctions.Drive;
import org.usfirst.frc.team4362.robotHardware.Roborio;
import edu.wpi.first.wpilibj.IterativeRobot;

/**
 * The VM is configured to automatically run this class, and to call the
 * functions corresponding to each mode, as described in the IterativeRobot
 * documentation. If you change the name of this class or the package after
 * creating this project, you must also update the manifest file in the resource
 * directory.
 */
/** Objectives and formatting - 
 *  This class will be laid out such that each function will only contain the execution method for classes in the robotFunctions and
 *  robotHardware packages. The objective here is to make our program more modular, improve ease to debug, and minimize req resources.
 */ 
public class Robot extends IterativeRobot {
    /**
     * This function is run when the robot is first started up and should be
     * used for any initialization code.
     */
    Drive Drive = new Drive();
    Roborio Roborio = new Roborio();
    public void robotInit() {
    	Drive.init();
    	Roborio.init();
    }

    /**
     * This function is called periodically during autonomous
     */
    public void autonomousPeriodic() {
    	Drive.auton();
    	Roborio.auton();
    }

    /**
     * This function is called periodically during operator control
     */
    public void teleopPeriodic() {
    	Drive.teleop();
    	Roborio.teleop();
    }
    
    /**
     * This function is called periodically during test mode
     */
    public void testPeriodic() {
    	Drive.testperiodic();
    	Roborio.testperiodic();
    }
    
}
