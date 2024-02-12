package frc.robot.subsystems;

import edu.wpi.first.wpilibj2.command.SubsystemBase;
import edu.wpi.first.wpilibj.drive.DifferentialDrive;

import com.revrobotics.CANSparkMax;
import com.revrobotics.CANSparkMaxLowLevel.MotorType;


public class Drivetrain extends SubsystemBase {
    private final CANSparkMax frontLeftMotor, rearLeftMotor, frontRightMotor, rearRightMotor;
    private final DifferentialDrive driveTrain;
    public Drivetrain() {
        frontLeftMotor = new CANSparkMax(1, MotorType.kBrushless);
        rearLeftMotor = new CANSparkMax(2, MotorType.kBrushless);
        frontRightMotor = new CANSparkMax(3, MotorType.kBrushless);
        rearRightMotor = new CANSparkMax(4, MotorType.kBrushless);

        frontLeftMotor.setSmartCurrentLimit(60);
        rearLeftMotor.setSmartCurrentLimit(60);
        frontRightMotor.setSmartCurrentLimit(60);
        rearRightMotor.setSmartCurrentLimit(60);

        rearLeftMotor.follow(frontLeftMotor); rearRightMotor.follow(frontRightMotor);

        frontLeftMotor.setInverted(true);

        driveTrain = new DifferentialDrive(frontLeftMotor, frontRightMotor);
    }

    /**
     * Drives the robot using arcade drive
     * @param velocity The velocity of the robot
     * @param rotation The rotation of the robot
     */
    public void drive(double velocity, double rotation) {
        driveTrain.arcadeDrive(velocity, rotation);
    }

    @Override
    public void periodic() {}
}
