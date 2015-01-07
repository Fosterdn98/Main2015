/**
 * 
 */
package org.usfirst.frc.team4362.robotHardware;

import edu.wpi.first.wpilibj.DriverStation;
import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;

/**
 * @author Joshua Arking
 *
 */
public class Roborio {
	public void auton() {
	   
	}
	public void teleop() {
		boolean attached = DriverStation.getInstance().isDSAttached(); //Is the DS communicating with the robot?
		boolean sysActive = DriverStation.getInstance().isSysActive(); //Are the FPGA outputs (such as PWM) active
		boolean brownedOut = DriverStation.getInstance().isBrownedOut(); //Is the roboRIO brownout protection active?
		SmartDashboard.putBoolean("DS-Rr Comms", attached); //Outputs whether DS (driver station) is connected to Rr (RoboRio).
		SmartDashboard.putBoolean("PWM Status", sysActive); //Outputs whether the FPGA outputs are active (Includes PWM's)
		SmartDashboard.putBoolean("RoboRio Brownout", brownedOut); //Outputs whether the RoboRio is browned out.
	}
	public void init() {
		   
	}
	public void testperiodic() {
		   
	}
}
