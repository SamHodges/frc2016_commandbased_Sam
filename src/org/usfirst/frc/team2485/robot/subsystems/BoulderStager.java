package org.usfirst.frc.team2485.robot.subsystems;

import org.usfirst.frc.team2485.robot.RobotMap;

import edu.wpi.first.wpilibj.Solenoid;
import edu.wpi.first.wpilibj.command.Subsystem;

public class BoulderStager extends Subsystem{
	private StagerPosition position;
	private Solenoid solenoid1, solenoid2;
	@Override
	protected void initDefaultCommand() {
		// TODO Auto-generated method stub
		solenoid1 = RobotMap.solenoid1;
		solenoid2 = RobotMap.solenoid2;

		setPosition(StagerPosition.NEUTRAL);
	}

	
	public enum StagerPosition{
		INTAKE, NEUTRAL, SHOOTING;
	}
		public void setPosition(StagerPosition position) {
		
		this.position = position;

		switch (position) {

		case INTAKE:
			RobotMap.solenoid1.set(false);
			RobotMap.solenoid2.set(true);
			break;

		case SHOOTING:
			RobotMap.solenoid1.set(true);
			RobotMap.solenoid2.set(false);
			break;

		case NEUTRAL:
			RobotMap.solenoid1.set(false);
			RobotMap.solenoid2.set(false);
			break;

		}

}
}
