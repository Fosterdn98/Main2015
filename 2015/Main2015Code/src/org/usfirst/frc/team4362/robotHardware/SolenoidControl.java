package org.usfirst.frc.team4362.robotHardware;
import edu.wpi.first.wpilibj.Solenoid
public class SolenoidControl {

//solenoid
Solenoid extend; //extend the pickup arm
Solenoid retract; //retract the pickup arm
Solenoid extend2; //extend the shooter piston
Solenoid retract2; //retract the shooter piston
int extendPort = 1; //Solenoid extend Breakout port
int retractPort = 2; //Solenoid retract Breakout port
extend = new Solenoid(extendPort);
retract = new Solenoid(retractPort);
extend2 = new Solenoid(extendPort2);
retract2 = new Solenoid(retractPort2);
}
