package org.usfirst.frc.team2485.robot.commands;

import org.usfirst.frc.team2485.robot.RobotMap;
import org.usfirst.frc.team2485.robot.subsystems.BoulderStager.StagerPosition;
import org.usfirst.frc.team2485.util.ConstantsIO;

import edu.wpi.first.wpilibj.command.InstantCommand;

public class SetPosition extends InstantCommand{
	public SetPosition(StagerPosition position){
		this.position = position;
		requires(RobotMap.boulderStager);
	}
	StagerPosition position;
	
	public void initialize(){
		RobotMap.boulderStager.setPosition(position);
	}

}
