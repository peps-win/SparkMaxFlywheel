public class IO {
  
  public static XboxController driverXbox = new XboxController(0);

  JoystickButton flywheelSpin = new JoystickButton(driverXbox, 1);
	
	public IO() {
	flywheelSpin.onTrue(RobotCommands.startFlywheel);
	}
}
