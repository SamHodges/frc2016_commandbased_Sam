package org.usfirst.frc.team2485.robot.commands;

import org.usfirst.frc.team2485.robot.RobotMap;

import edu.wpi.first.wpilibj.command.InstantCommand;

public class SetQuickTurn extends InstantCommand{
	public SetQuickTurn(boolean quickTurn){
		requires(RobotMap.driveTrain);
		this.quickTurn  = quickTurn;
	}
	
	public boolean quickTurn;
	
	@Override
	protected void initialize() {
		RobotMap.driveTrain.setQuickTurn(quickTurn);
	}
	
	

	

}
