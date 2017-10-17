package src.org.usfirst.frc.team5026.robot;

import edu.wpi.first.wpilibj.Spark;

public class Hardware {
	//Pulling Motors
	public Spark leftElevatorMotor;
	public Spark rightElevatorMotor;
	
	//Inverted
	boolean leftElevatorMotorInverted = false;
	boolean rightElevatorMotorInverted = false;
	
	public Hardware() {
		//Pulling Motors
		leftElevatorMotor = new Spark(Robot.constants.leftMotorPort);
		rightElevatorMotor = new Spark(Robot.constants.rightMotorPort);
		
		//Inverted
		leftElevatorMotor.setInverted(leftElevatorMotorInverted);
		rightElevatorMotor.setInverted(rightElevatorMotorInverted);
	}
}
