/*----------------------------------------------------------------------------*/
/* Copyright (c) 2018-2019 FIRST. All Rights Reserved.                        */
/* Open Source Software - may be modified and shared by FRC teams. The code   */
/* must be accompanied by the FIRST BSD license file in the root directory of */
/* the project.                                                               */
/*----------------------------------------------------------------------------*/

package frc.robot.subsystems;

import com.ctre.phoenix.motorcontrol.can.WPI_TalonSRX;

import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.SpeedControllerGroup;
import edu.wpi.first.wpilibj.drive.DifferentialDrive;
import edu.wpi.first.wpilibj2.command.SubsystemBase;


public class DriveSubsystem extends SubsystemBase {
  

  private WPI_TalonSRX leftTalon1 = new WPI_TalonSRX(1);
  private WPI_TalonSRX leftTalon2 = new WPI_TalonSRX(2);
  private WPI_TalonSRX leftTalon3 = new WPI_TalonSRX(3);
  private WPI_TalonSRX rightTalon1 = new WPI_TalonSRX(4);
  private WPI_TalonSRX rightTalon2 = new WPI_TalonSRX(5);
  private WPI_TalonSRX rightTalon3 = new WPI_TalonSRX(6);

  private SpeedControllerGroup leftMotors = new SpeedControllerGroup(leftTalon1, leftTalon2, leftTalon3); 
  private SpeedControllerGroup rightMotors = new SpeedControllerGroup(rightTalon1, rightTalon2, rightTalon3);

  private DifferentialDrive robotDrive = new DifferentialDrive(leftMotors, rightMotors);


  private double insanityFactor = 0.5;
  private boolean isArcadeDrive = true;

  //this is assigning the talon 1 to leftTalon1.



    //^this is allowing us to control the left motors all at once rather than having individual lines of code.
  



    insanityFactor = 1;

  
  /**
   * Creates a new ExampleSubsystem.
   */
  public DriveSubsystem() {
    


  }

  @Override
  public void periodic() {
    // This method will be called once per scheduler run
  }
}
/*
-my code is going to get an input from the joystick.
-i need to code for arcade drive.
-i need to code for tank drive
-i am going to let the driver switch between them using a toggle button on smart dashboard.
-
My subsystem code is going to drive my wheels back and forth.  
-code for 6 talons
-differential drive objects





*/
