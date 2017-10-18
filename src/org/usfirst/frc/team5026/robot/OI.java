
package org.usfirst.frc.team5026.robot;

import org.usfirst.frc.team5026.robot.commands.DownCommand;
import org.usfirst.frc.team5026.robot.commands.UpCommand;

import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.buttons.Button;
import edu.wpi.first.wpilibj.buttons.JoystickButton;

/**
 * This class is the glue that binds the controls on the physical operator
 * interface to the commands and command groups that allow control of the robot.
 */
public class OI {
	
	public Joystick stick;
	public Button button1;
	public Button button2;
	
	public OI() {
		stick = new Joystick(1);
		button1 = new JoystickButton(stick, 1);
		button2 = new JoystickButton(stick, 2);
	}
	
	public void mapButtons() {
		button1.whileHeld(new UpCommand(Robot.liftRate));
		button2.whileHeld(new DownCommand(Robot.liftRate));
	}
	
}
