package org.usfirst.frc.team86.robot;

import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.Victor;
import edu.wpi.first.wpilibj.buttons.Button;
//import edu.wpi.first.wpilibj.RobotDrive;


public class IOclass {
	
	// INSTANTIATIONS
	public static Drive drive;
	public static Joystick mainJoystick;
	public static Victor firstMotor;
	public static Victor secondMotor;
	public static Victor kickerMotor;
	public static Victor kickerMotor1;
	public static Button kickButton;
	public static Button kickbackButton;
	public static Button[] buttons = new Button[1];
	public static Kicker kicker;
	
	public static void init(){
		
		drive = new Drive(firstMotor, secondMotor);
		
		firstMotor = new Victor(0);
		secondMotor = new Victor(1);
		kickerMotor = new Victor(2);
		kickerMotor1 = new Victor(3);
		
		mainJoystick = new Joystick(0);
		
		firstMotor.setInverted(false);
		secondMotor.setInverted(false);
		kickerMotor.setInverted(false);
		kickerMotor1.setInverted(false);
		
		kicker = new Kicker();
		
		buttons[0] = kickButton;
		buttons[1] = kickbackButton;	
	}
	
	
}
