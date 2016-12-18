
package org.usfirst.frc.team86.robot;

import edu.wpi.first.wpilibj.IterativeRobot;
import edu.wpi.first.wpilibj.RobotDrive;
import edu.wpi.first.wpilibj.Timer;
import edu.wpi.first.wpilibj.smartdashboard.SendableChooser;
import edu.wpi.first.wpilibj.smartdashboard.SmartDashboard;

/*
 *     E L L I S  L E V I N E
 * 		      Team 86
 * 
 *  Practice Robot. Not yet tested.
 */

/*
 * Arcade Drive styled robot with two kickers.
 *  One in front and one in back all controlled
 *  with one Joystick.
 * 
 */
public class Robot extends IterativeRobot {
	RobotDrive drive = new RobotDrive(0,1);
	Tele teledo = new Tele();
   
	/*
	 * Controlled by Joystick in Arcade Drive mode.
	 */
    public void robotInit() {
    	Tele.start();    
    }
	
    /*
     * Drives for 15 seconds.
     * This is up for changing later, coundnt think of anything
     * else for it to do.
     */
    public void autonomousInit() {
    	while(isAutonomous() && isEnabled()){
    		drive.drive(3, 0);
    		Timer.delay(15);
    		drive.drive(0, 0);
    	}
    		
    }
    
    /**
     * This function is called periodically during test mode
     */
    public void testPeriodic() {
    
    }
    
}
