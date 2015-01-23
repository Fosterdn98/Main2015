
package org.usfirst.frc.team4362.robot.subsystems;

import edu.wpi.first.wpilibj.command.Subsystem;

/**
 * This is an example of how subsystems should be made. Not used in code except as a placeholder.
 */
public class ExampleSubsystem extends Subsystem {
    
	public void exampleCommand(Boolean arguement){ /*!< This command is an example of making a command to control a subsystem. */
		if(arguement){ /*!< For example, this code checks if boolean arguement is true, then continues if it is. */
		}
    }

    public void initDefaultCommand() {
    	/*!< This code sets the default command ran when this subsystem is called. */
        setDefaultCommand(null);
    }
}

