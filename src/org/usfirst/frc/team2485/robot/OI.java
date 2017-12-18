package org.usfirst.frc.team2485.robot;

import org.usfirst.frc.team2485.robot.commandGroups.ShakeBoulderStager;
import org.usfirst.frc.team2485.robot.commands.SetQuickTurn;
import org.usfirst.frc.team2485.robot.commands.StartShooter;
import org.usfirst.frc.team2485.robot.commands.StopShooter;

import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.buttons.Button;
import edu.wpi.first.wpilibj.buttons.JoystickButton;
import edu.wpi.first.wpilibj.networktables.NetworkTablesJNI;


/**
 * This class is the glue that binds the controls on the physical operator
 * interface to the commands and command groups that allow control of the robot.
 */
public class OI {
	public static void init(){
		driver = new Joystick(0);
		new JoystickButton(driver, XBOX_BTN_RBUMPER).whenPressed(new SetQuickTurn(true));
		new JoystickButton(driver, XBOX_BTN_RBUMPER).whenReleased(new SetQuickTurn(false));
		new JoystickButton(driver, XBOX_BTN_A).whenPressed(new StartShooter());
		new JoystickButton(driver, XBOX_BTN_B).whenPressed(new StopShooter());
		new JoystickButton(driver, XBOX_BTN_X).whenPressed(new ShakeBoulderStager());
		
	}
	
	public static Joystick driver;
	
	public static final int XBOX_BTN_A = 1;
	public static final int XBOX_BTN_B = 2;
	public static final int XBOX_BTN_X = 3;
	public static final int XBOX_BTN_Y = 4;
	public static final int XBOX_BTN_LBUMPER = 5;
	public static final int XBOX_BTN_RBUMPER = 6;
	public static final int XBOX_BTN_BACK = 7;
	public static final int XBOX_BTN_START = 8;
	public static final int XBOX_BTN_L_AXIS = 9;

	public static final int XBOX_AXIS_LX = 0;
	public static final int XBOX_AXIS_LY = 1;
	public static final int XBOX_AXIS_LTRIGGER = 2;
	public static final int XBOX_AXIS_RTRIGGER = 3;
	public static final int XBOX_AXIS_RX = 4;
	public static final int XBOX_AXIS_RY = 5;

}
