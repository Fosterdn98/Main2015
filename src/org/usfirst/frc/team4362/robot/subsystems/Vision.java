
package org.usfirst.frc.team4362.robot.subsystems;

import org.usfirst.frc.team4362.robot.RobotMap;

import edu.wpi.first.wpilibj.command.Subsystem;
import edu.wpi.first.wpilibj.CameraServer;
import edu.wpi.first.wpilibj.Timer;


public class Vision extends Subsystem {
	
	CameraServer server;
	
	public void pushCam1(){ 
		server = CameraServer.getInstance();
        server.setQuality(RobotMap.C_QUALITY);
        server.startAutomaticCapture(RobotMap.C_CAM1);
    }
	
	public void pushCam2(){ 
		server = CameraServer.getInstance();
        server.setQuality(RobotMap.C_QUALITY);
        server.startAutomaticCapture(RobotMap.C_CAM2);
    }
	
	public void processCam1(){
		if(server.isAutoCaptureStarted() != true){
			
		}
		
    }
	
	public void processCam2(){ 
		if(server.isAutoCaptureStarted() != true){
			
		}
    }
	
	public void fiveWait(){ 
		Timer.delay(0.005);
    }

    public void initDefaultCommand() {
    	/*!< This code sets the default command ran when this subsystem is called. */
        setDefaultCommand(null);
    }
}

