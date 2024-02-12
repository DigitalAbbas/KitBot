package frc.robot.subsystems;

import edu.wpi.first.wpilibj2.command.SubsystemBase;

import com.revrobotics.CANSparkMax;
import com.revrobotics.CANSparkMaxLowLevel.MotorType;

public class Launcher extends SubsystemBase{
    private final CANSparkMax launchWheel, feedWheel;
    public Launcher(){
        launchWheel = new CANSparkMax(5, MotorType.kBrushless);
        feedWheel = new CANSparkMax(6, MotorType.kBrushless);
    }
    public void setLaunchWheel(double speed){
        launchWheel.set(speed);
    }
    public void setFeedWheel(double speed){
        feedWheel.set(speed);
    }
    public void stop(){
        launchWheel.set(0);
        feedWheel.set(0);
    }
}
