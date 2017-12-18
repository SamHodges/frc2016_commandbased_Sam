package org.usfirst.frc.team2485.robot;

import org.usfirst.frc.team2485.robot.subsystems.BoulderStager;
import org.usfirst.frc.team2485.robot.subsystems.DriveTrain;
import org.usfirst.frc.team2485.robot.subsystems.Shooter;
import org.usfirst.frc.team2485.util.SpeedControllerWrapper;

import com.kauailabs.navx.frc.AHRS;

import edu.wpi.first.wpilibj.Encoder;
import edu.wpi.first.wpilibj.Solenoid;
import edu.wpi.first.wpilibj.VictorSP;

/**
 * The RobotMap is a mapping from the ports sensors and actuators are wired into
 * to a variable name. This provides flexibility changing wiring, makes checking
 * the wiring easier and significantly reduces the number of magic numbers
 * floating around.
 */
public class RobotMap {
	public static AHRS ahrs;
	public static double ROBOT_WIDTH = 27;
	
	//set motors
	public static VictorSP lDriveMotor1;
	public static VictorSP lDriveMotor2;
	public static VictorSP lDriveMotor3;
	public static VictorSP rDriveMotor1;
	public static VictorSP rDriveMotor2;
	public static VictorSP rDriveMotor3;
	public static VictorSP speedControllerShooter;
	public static Encoder encoderShooter;
	public static Solenoid solenoid1;
	public static Solenoid solenoid2;
	
	
	
	public static final int speedControllerPortShooter = 0;
	public static final int encoderShooterPortA = 6;
	public static final int encoderShooterPortB = 7;
	
	
	
	public static final int lDriveMotorPort1 = 2;
	public static final int lDriveMotorPort2 = 3;
	public static final int lDriveMotorPort3 = 4;
	public static final int rDriveMotorPort1 = 5;
	public static final int rDriveMotorPort2 = 6;
	public static final int rDriveMotorPort3 = 7;
	
	public static final int solenoid1Port = 6;
	public static final int solenoid2Port = 7;
	
	public static SpeedControllerWrapper leftDriveMotor;
	public static SpeedControllerWrapper rightDriveMotor;
	
	public static DriveTrain driveTrain;
	public static Shooter shooter;
	public static BoulderStager boulderStager;
	
	public static void init(){
		lDriveMotor1 = new VictorSP(lDriveMotorPort1);
		lDriveMotor2 = new VictorSP(lDriveMotorPort2);
		lDriveMotor3 = new VictorSP(lDriveMotorPort3);
		rDriveMotor1 = new VictorSP(rDriveMotorPort1);
		rDriveMotor2 = new VictorSP(rDriveMotorPort2);
		rDriveMotor3 = new VictorSP(rDriveMotorPort3);
		
		speedControllerShooter = new VictorSP(speedControllerPortShooter);
		encoderShooter = new Encoder(encoderShooterPortA, encoderShooterPortB);
		
		//one side must be inverted for motors
		leftDriveMotor = new SpeedControllerWrapper(lDriveMotor1, lDriveMotor2, lDriveMotor3);
		rightDriveMotor = new SpeedControllerWrapper(rDriveMotor1, rDriveMotor2, rDriveMotor3);
		leftDriveMotor.setInverted(true);
		
		driveTrain = new DriveTrain(); 
		shooter = new Shooter();
		boulderStager = new BoulderStager();
	}
	
	
	
	


	// For example to map the left and right motors, you could define the
	// following variables to use with your drivetrain subsystem.
	// public static int leftMotor = 1;
	// public static int rightMotor = 2;

	// If you are using multiple modules, make sure to define both the port
	// number and the module. For example you with a rangefinder:
	// public static int rangefinderPort = 1;
	// public static int rangefinderModule = 1;
}
