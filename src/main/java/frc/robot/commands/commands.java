
public class RobotCommands {
	public static final Command startFlywheel = new InstantCommand(()-> Robot.SparkFlexFlywheel.setShooterVelocity(Constants.FlywheelShooterConstants.velocityRPM),Robot.shooterSubsystem;
	public static final Command stopFlywheel = new InstantCommand(()-> Robot.SparkFlexFlywheel.setShooterVelocity(0),Robot.shooterSubsystem;
}
