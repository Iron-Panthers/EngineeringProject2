package src.org.usfirst.frc.team5026.robot;

import edu.wpi.first.wpilibj.Spark;

public class Hardware {
	//Elevator Motors
	public Spark leftElevatorMotor;
	public Spark rightElevatorMotor;
	
	public Hardware() {
		//Elevator Motors
		leftElevatorMotor = new Spark(Robot.constants.leftMotorPort);
		rightElevatorMotor = new Spark(Robot.constants.rightMotorPort);
		
		//Inverted
		leftElevatorMotor.setInverted(Robot.constants.leftMotorInverted);
		rightElevatorMotor.setInverted(Robot.constants.rightMotorInverted);
	}
}
