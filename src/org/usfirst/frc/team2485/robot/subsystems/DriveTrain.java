package org.usfirst.frc.team2485.robot.subsystems;

import org.usfirst.frc.team2485.robot.RobotMap;
import org.usfirst.frc.team2485.robot.commands.DriveWithControllers;

import edu.wpi.first.wpilibj.command.Subsystem;

public class DriveTrain extends Subsystem{
	private boolean quickTurn;

	public void setQuickTurn(boolean quickTurn){
		this.quickTurn = quickTurn;
	}

	public DriveTrain(){
	}

	public void setLeftRight(double leftpwm, double rightpwm){
		RobotMap.leftDriveMotor.set(leftpwm);
		RobotMap.rightDriveMotor.set(rightpwm);
	}

	public void warLordsDrive(double y, double x){
		double leftpwm;
		double rightpwm;
		if (quickTurn){
			 leftpwm = x;
			 rightpwm = -x;
		}
		else{
			 leftpwm = y*(1+x);
			 rightpwm = y*(1-x);
			if (Math.abs(leftpwm) > 1){
				rightpwm = rightpwm/Math.abs(leftpwm);
				leftpwm = leftpwm / Math.abs(leftpwm);
			}
			if (Math.abs(rightpwm) > 1){
				leftpwm = leftpwm / Math.abs(rightpwm);
				rightpwm = rightpwm/Math.abs(rightpwm);
			}
		}
		setLeftRight(leftpwm, rightpwm);

	}

	@Override
	protected void initDefaultCommand() {
		setDefaultCommand(new DriveWithControllers());

	}

}
