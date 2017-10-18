package org.usfirst.frc.team5026.robot;

import edu.wpi.first.wpilibj.Spark;

public class Hardware {
	//Elevator Motors
	public Spark leftElevatorMotor;
	public Spark rightElevatorMotor;
	
	public Hardware() {
		//Elevator Motors
		leftElevatorMotor = new Spark(Constants.leftMotorPort);
		rightElevatorMotor = new Spark(Constants.rightMotorPort);
		
		//Inverted
		leftElevatorMotor.setInverted(Constants.leftMotorInverted);
		rightElevatorMotor.setInverted(Constants.rightMotorInverted);
	}
}
