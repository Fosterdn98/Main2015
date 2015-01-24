/**
 * 
 */
package org.usfirst.frc.team4362.robotHardware;
import edu.wpi.first.wpilibj.Compressor
private Compressor compressor;
int compressorPort1 = 1; //Pressure Switch Digital I/O port
int compressorPort2 = 1; //Compressor Relay port
compressor = new Compressor(compressorPort1,compressorPort2);
compressor.start();
/**
 * @author Johnny
 *
 */
public class Pneumatics {

}
