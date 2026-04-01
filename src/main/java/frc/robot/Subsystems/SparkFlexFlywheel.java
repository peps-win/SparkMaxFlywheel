package frc.robot.Subsystems;

import com.revrobotics.spark.FeedbackSensor;
import com.revrobotics.spark.SparkFlex;
import com.revrobotics.spark.SparkLowLevel.MotorType;
import com.revrobotics.spark.config.ClosedLoopConfig;
import com.revrobotics.spark.config.SparkBaseConfig.IdleMode;
import com.revrobotics.spark.config.SparkFlexConfig;

import edu.wpi.first.wpilibj2.command.SubsystemBase;
import frc.robot.Constants;

public class SparkFlexFlywheel extends SubsystemBase {
    
    private final SparkFlex flywheelMotor = new SparkFlex(Constants.FlywheelShooterConstants.MOTORID, MotorType.kBrushless);

    public SparkFlexFlywheel()
    {
        SparkFlexConfig flywheelConfig = new SparkFlexConfig();

        flywheelConfig.idleMode(IdleMode.kCoast);
        flywheelConfig.voltageCompensation(Constants.FlywheelShooterConstants.FLYWHEEL_VOLTAGE);
        flywheelConfig.smartCurrentLimit(Constants.FlywheelShooterConstants.FLYWHEEL_CURRENT_LIMIT);

        flywheelConfig.closedLoop
            .feedbackSensor(FeedbackSensor.kPrimaryEncoder);
            .pid(Constants.FlywheelShooterConstants.kP, Constants.FlywheelShooterConstants.kI, Constants.FlywheelShooterConstants.kD);
            .outputRange(-1, 1);
            
        ClosedLoopConfig flywheelClosedLoopConfig = flywheelConfig.closedLoop;
        flywheelClosedLoopConfig.apply(flywheelClosedLoopConfig);
    }
            
    public static void setShooterVelocity(double velocityRPM) {
        flywheelMotor.getClosedLoopController().setSetpoint(velocityRPM)
    }
}