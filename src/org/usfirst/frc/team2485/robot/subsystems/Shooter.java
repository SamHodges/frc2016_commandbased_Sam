package org.usfirst.frc.team2485.robot.subsystems;

import org.usfirst.frc.team2485.robot.RobotMap;

import edu.wpi.first.wpilibj.command.Subsystem;

public class Shooter extends Subsystem {
	
	@Override
	protected void initDefaultCommand() {
		// TODO Auto-generated method stub

	}

	public void SetPWM(double pwm) {
		RobotMap.speedControllerShooter.set(pwm);
	}

	public double GetRate() {
		return RobotMap.encoderShooter.getRate();

	}

}
