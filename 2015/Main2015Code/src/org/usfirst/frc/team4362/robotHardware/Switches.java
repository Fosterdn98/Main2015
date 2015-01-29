package org.usfirst.frc.team4362.robotHardware;

public class Switches {
DigitalInput Switch;
Switch = new DigitalInput(6)
SmartDashboard.putBoolean("switch", Switch.get());
}
