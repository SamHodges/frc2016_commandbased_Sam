package org.usfirst.frc.team2485.robot.commands;

import org.usfirst.frc.team2485.robot.RobotMap;
import org.usfirst.frc.team2485.util.ConstantsIO;

import edu.wpi.first.wpilibj.command.InstantCommand;

public class StartShooter extends InstantCommand{
	public StartShooter(){
		requires(RobotMap.shooter);
	}
	
	public void initialize(){
		RobotMap.shooter.SetPWM(ConstantsIO.kShooterPower);
	}

}
