package testReceivePacket;

public enum HeaderType {	// enumeration of udp packet header types for easy access and error prevention
// add data type/size required to here???
	
	// system header types
	systemConfirmation,
	
	// drive header types
	driveAll, driveRight, driveLeft, drive1, drive2, drive3, drive4, drive5, drive6,
	
	// arm header types
	armTurretCommand, armShoulderCommand, armElbowCommand, armWristFlapCommand, armWristRotateCommand, armGripperCommand, 
	armRotatorCommand, armShoulderFeedback, armShoulderCurrent, armElbowFeedback, armElbowCurrent, armWristFlapFeedback,
	armWristRotateFeedback, armGripperCurrent,
	
	// gimbal header types
	gimbal,
	
	// camera header types
	camera,
	
	// battery header types
	battery,
	
	// imu header types
	imu,
	
	// misc header types
	misc
}