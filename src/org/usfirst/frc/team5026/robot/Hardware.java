package src.org.usfirst.frc.team5026.robot;

import edu.wpi.first.wpilibj.Spark;

public class Hardware {
	//Driving Motors
	public Spark leftMotor;
	public Spark rightMotor;
	
	//Pulling Motors
	public Spark leftElevatorMotor;
	public Spark rightElevatorMotor;
	
	//Inverted
		//Driving Motors
		boolean leftMotorInverted = false;
		boolean rightMotorInverted = false;
		//Pulling Motors
		boolean leftElevatorMotorInverted = false;
		boolean rightElevatorMotorInverted = false;
	
	public Hardware() {
		//Driving Motors
		leftMotor = new Spark(0);
		rightMotor = new Spark(1);
		
		//Pulling Motors
		leftElevatorMotor = new Spark(2);
		rightElevatorMotor = new Spark(3);
		
		//Inverted
		leftMotor.setInverted(leftMotorInverted);
		rightMotor.setInverted(rightMotorInverted);
		leftElevatorMotor.setInverted(leftElevatorMotorInverted);
		rightElevatorMotor.setInverted(rightElevatorMotorInverted);
	}
}
