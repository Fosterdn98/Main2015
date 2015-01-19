
package org.usfirst.frc.team4362.robot;

import edu.wpi.first.wpilibj.Compressor;
import edu.wpi.first.wpilibj.IterativeRobot;
import edu.wpi.first.wpilibj.command.Command;
import edu.wpi.first.wpilibj.command.Scheduler;
import edu.wpi.first.wpilibj.livewindow.LiveWindow;

import org.usfirst.frc.team4362.robot.commands.Drive;
import org.usfirst.frc.team4362.robot.commands.ExampleCommand;
import org.usfirst.frc.team4362.robot.subsystems.ExampleSubsystem;

/**
 * Robot extends the IterativeRobot class.
 *
 * This class will be laid out such that each init function will schedule the correct commands for use in periodic functions.
 *
 * To Do List -- add code as necessary for the function of the robot.
 * 
 * robotInit() -- provide for initialization of commands and OI at robot startup.
 *
 * init() functions -- each of the following functions is called during it's respective game period:
 * 
 *  - autonomousInit()   -- schedules commands to be called during autonomousPeriodic().
 *  - teleopInit() -- schedules commands to be called during teleopPeriodic().
 *  - disabledInit() -- schedules commands to be called during disabledPeriodic().
 *
 * periodic() functions -- runs the scheduled commands defined in the init functions.
 *  
 *  - autonomousPeriodic()   -- runs the commands previously scheduled during autonomousInit.
 *  - teleopPeriodic() -- runs the commands previously scheduled during teleopInit.
 *  - disabledPeriodic() -- runs the commands previously scheduled during disabledInit.
 *   
 */
public class Robot extends IterativeRobot {

	public static final ExampleSubsystem exampleSubsystem = new ExampleSubsystem();
	public static OI oi;
	public static Compressor compressor;
    Command autonomousCommand;
    private Command drive;

    /**
     * This function is run when the robot is first started up and should be
     * used for any initialization code.
     */
    public void robotInit() {
		oi = new OI();
        // instantiate the command used for the autonomous period
		compressor = new Compressor(RobotMap.C_COMPRESSORPORT);
		compressor.start();
        autonomousCommand = new ExampleCommand();
        drive = new Drive();
    }
	
	public void disabledPeriodic() {
		Scheduler.getInstance().run();
	}

    public void autonomousInit() {
        // schedule the autonomous command (example)
        if (autonomousCommand != null) autonomousCommand.start();
    }

    /**
     * This function is called periodically during autonomous
     */
    public void autonomousPeriodic() {
        Scheduler.getInstance().run();
    }

    public void teleopInit() {
		// This makes sure that the autonomous stops running when
        // teleop starts running. If you want the autonomous to 
        // continue until interrupted by another command, remove
        // this line or comment it out.
        if (autonomousCommand != null) autonomousCommand.cancel();
    	drive.start();
    }

    /**
     * This function is called when the disabled button is hit.
     * You can use it to reset subsystems before shutting down.
     */
    public void disabledInit(){
    	drive.cancel();
    }

    /**
     * This function is called periodically during operator control
     */
    public void teleopPeriodic() {
        Scheduler.getInstance().run();
    	 
    }
    
    /**
     * This function is called periodically during test mode
     */
    public void testPeriodic() {
        LiveWindow.run();
    }
}
