package org.usfirst.frc.team2485.robot.commands;

import org.usfirst.frc.team2485.robot.RobotMap;


import edu.wpi.first.wpilibj.command.InstantCommand;

public class StopShooter extends InstantCommand{
	public StopShooter(){
		requires(RobotMap.shooter);
	}
	
	public void initialize(){
		RobotMap.shooter.SetPWM(0);
	}

}
