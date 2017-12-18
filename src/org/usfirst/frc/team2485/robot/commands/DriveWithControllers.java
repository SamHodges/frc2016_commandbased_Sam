package org.usfirst.frc.team2485.robot.commands;

import org.usfirst.frc.team2485.robot.OI;
import org.usfirst.frc.team2485.robot.RobotMap;
import org.usfirst.frc.team2485.util.ThresholdHandler;

import edu.wpi.first.wpilibj.command.Command;

public class DriveWithControllers extends Command{
	public DriveWithControllers(){
		requires(RobotMap.driveTrain); 
	}
	
	public static double threshold = 0.15;

	@Override
	protected void execute() {
	
		double y = -OI.driver.getRawAxis(OI.XBOX_AXIS_LY);
		double x = OI.driver.getRawAxis(OI.XBOX_AXIS_RX);
		
		y = ThresholdHandler.deadbandAndScale(y, threshold, 0, 1);
		x = ThresholdHandler.deadbandAndScale(x, threshold, 0, 1);
		
		RobotMap.driveTrain.warLordsDrive(y, x);
	}
	
	@Override
	protected boolean isFinished() {
		
		return false;
	}
	

}
