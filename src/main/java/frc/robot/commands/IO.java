package frc.robot.commands;

import edu.wpi.first.wpilibj.XboxController;
import edu.wpi.first.wpilibj2.command.button.JoystickButton;

public class IO {
  
  public static XboxController driverXbox = new XboxController(0);

  JoystickButton flywheelSpin = new JoystickButton(driverXbox, 1);
	
	public IO() {
	flywheelSpin.onTrue(RobotCommands.startFlywheel);
	}
}
