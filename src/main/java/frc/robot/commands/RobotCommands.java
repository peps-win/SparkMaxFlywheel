package frc.robot.commands;

import edu.wpi.first.wpilibj2.command.Command;
import edu.wpi.first.wpilibj2.command.InstantCommand;
import frc.robot.Constants;
import frc.robot.Robot;

public class RobotCommands {
	public static final Command startFlywheel = new InstantCommand(()-> Robot.SparkFlexFlywheel.setShooterVelocity(Constants.FlywheelShooterConstants.velocityRPM),Robot.sparkflexflywheel);
	public static final Command stopFlywheel = new InstantCommand(()-> Robot.SparkFlexFlywheel.setShooterVelocity(0),Robot.sparkflexflywheel);
}
