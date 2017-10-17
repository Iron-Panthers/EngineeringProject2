package src.org.usfirst.frc.team5026.robot.subsystems;

import edu.wpi.first.wpilibj.Spark;
import edu.wpi.first.wpilibj.command.Subsystem;

/**
 *
 */
public class Intake extends Subsystem {
	// Put methods for controlling this subsystem
	// here. Call these from Commands.
	Spark leftMotor;
	Spark rightMotor;
	public Intake(Spark leftMotor, Spark rightMotor) {
		this.leftMotor = leftMotor;
		this.rightMotor = rightMotor;
	}
	public void intake(double power) {
		leftMotor.set(Math.abs(power));
		rightMotor.set(Math.abs(power));
	}

	public void initDefaultCommand() {
		// Set the default command for a subsystem here.
		// setDefaultCommand(new MySpecialCommand());
	}
}
