package org.usfirst.frc.team2485.robot.commandGroups;

import org.usfirst.frc.team2485.robot.commands.SetPosition;
import org.usfirst.frc.team2485.robot.subsystems.BoulderStager.StagerPosition;

import edu.wpi.first.wpilibj.command.CommandGroup;
import edu.wpi.first.wpilibj.command.TimedCommand;

public class ShakeBoulderStager extends CommandGroup{
	public ShakeBoulderStager(){
		addSequential(new SetPosition(StagerPosition.SHOOTING));
		addSequential(new TimedCommand(0.3));
		addSequential(new SetPosition(StagerPosition.INTAKE));
		addSequential(new TimedCommand(0.3));
		addSequential(new SetPosition(StagerPosition.NEUTRAL));
	}

}
