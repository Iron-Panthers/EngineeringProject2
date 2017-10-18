package org.usfirst.frc.team5026.robot.subsystems;

import edu.wpi.first.wpilibj.Spark;
import edu.wpi.first.wpilibj.command.Subsystem;

/**
 *
 */
public class Lift extends Subsystem {

    // Put methods for controlling this subsystem
    // here. Call these from Commands.
	Spark leftMotor;
	Spark rightMotor;
	
	public Lift (Spark leftMotor, Spark rightMotor) {
		this.leftMotor = leftMotor;
		this.rightMotor = rightMotor;
	}
	
	public void up(double rate) {
		leftMotor.set(rate);
		rightMotor.set(rate);
	}

	public void down(double rate) {
		leftMotor.set(-rate);
		rightMotor.set(-rate);
	}
	
	public void stop() {
		leftMotor.set(0);
		rightMotor.set(0);
	}
    public void initDefaultCommand() {
        // Set the default command for a subsystem here.
        //setDefaultCommand(new MySpecialCommand());
    }
}

