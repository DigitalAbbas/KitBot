package frc.robot.commands;
import edu.wpi.first.wpilibj2.command.Command;
import frc.robot.subsystems.Launcher;


public class LaunchNote extends Command {
    Launcher launcher;
    public class LaunchNote extends Command {
        Launcher launcher;
      
        public LaunchNote(PWMLauncher launcher) {
          m_launcher = launcher;
          addRequirements(m_launcher);
        }
        @Override
        public void initialize() {
            // Set the wheels to launching speed
            m_launcher.setLaunchWheel(kLauncherSpeed);
            m_launcher.setFeedWheel(kLaunchFeederSpeed);
        }

        // Called every time the scheduler runs while the command is scheduled.
        @Override
        public void execute() {
            // There is nothing we need this command to do on each iteration. You could remove this method
            // and the default blank method
            // of the base class will run.
        }

        // Returns true when the command should end.
        @Override
        public boolean isFinished() {
            // Always return false so the command never ends on it's own. In this project we use the
            // scheduler to end the command when the button is released.
            return false;
        }

        // Called once the command ends or is interrupted.
        @Override
        public void end(boolean interrupted) {
            // Stop the wheels when the command ends.
            m_launcher.stop();
        }
    }
}
