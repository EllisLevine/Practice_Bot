package org.usfirst.frc.team86.robot;

import edu.wpi.first.wpilibj.RobotDrive;
import edu.wpi.first.wpilibj.Victor;

public class Drive {
	
	public SetValDrive drivee;
	
	public Drive(Victor leftMotor, Victor rightMotor) {
		drivee = SetValDrive.ARCADE_DRIVE;
	}

	
}
