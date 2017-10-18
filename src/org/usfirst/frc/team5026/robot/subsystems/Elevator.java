package src.org.usfirst.frc.team5026.robot.subsystems;

import edu.wpi.first.wpilibj.Spark;
import edu.wpi.first.wpilibj.command.Subsystem;

/**
 *
 */
public class Elevator extends Subsystem {
	// Put methods for controlling this subsystem
	// here. Call these from Commands.
	Spark leftMotor;
	Spark rightMotor;
	public Elevator(Spark leftMotor, Spark rightMotor) {
		this.leftMotor = leftMotor;
		this.rightMotor = rightMotor;
	}
	public void lift(double power) {
		//Always sets power positive
		leftMotor.set(Math.abs(power));
		rightMotor.set(Math.abs(power));
	}
	public void lower(double power) {
		//Always sets power negative
		leftMotor.set(-Math.abs(power));
		rightMotor.set(-Math.abs(power));
	}
	public void stop() {
		leftMotor.set(0);
		rightMotor.set(0);
	}

	public void initDefaultCommand() {
		// Set the default command for a subsystem here.
		// setDefaultCommand(new MySpecialCommand());
	}
}
