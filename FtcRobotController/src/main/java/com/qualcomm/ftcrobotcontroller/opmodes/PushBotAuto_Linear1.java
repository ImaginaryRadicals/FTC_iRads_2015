package com.qualcomm.ftcrobotcontroller.opmodes;

import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;
import com.qualcomm.robotcore.hardware.DcMotor;
import com.qualcomm.robotcore.hardware.DcMotorController;

/*
 * An example linear op mode where the pushbot
 * will drive to the ramp using sleep()
 * and a for loop.
 */
public class PushBotAuto_Linear1 extends LinearOpMode {
    DcMotor leftMotor;
    DcMotor rightMotor;
    DcMotor leftArm;

    @Override
    public void runOpMode() throws InterruptedException {
        leftMotor = hardwareMap.dcMotor.get("left_drive");
        rightMotor = hardwareMap.dcMotor.get("right_drive");
        leftArm = hardwareMap.dcMotor.get("left_arm");
        rightMotor.setDirection(DcMotor.Direction.REVERSE);
        leftMotor.setMode(DcMotorController.RunMode.RUN_USING_ENCODERS);
        rightMotor.setMode(DcMotorController.RunMode.RUN_USING_ENCODERS);
        sleep(10500);
        waitForStart();

        leftArm.setPower(0.5);//Raise Arm so it doesn't hit the ground
        sleep(500);
        leftArm.setPower(0.03); //Keep arm from falling and hitting ground

        //   for(int i=0; i<4; i++) {
        leftMotor.setPower(1.0);   //Go Straight
        rightMotor.setPower(1.0);

        sleep(2900);


        leftMotor.setPower(0.5);   //Go Right 90 Degrees
        rightMotor.setPower(-0.5);
        sleep(1800);

        leftMotor.setPower(1.0);   //Go Straight
        rightMotor.setPower(1.0);

        sleep(3000);


        leftMotor.setPower(0.5);   //Go Right 55 Degrees
        rightMotor.setPower(-0.5);
        sleep(900);

        leftMotor.setPower(1.0);   //Go Straight
        rightMotor.setPower(1.0);

        sleep(1000);

        leftMotor.setPower(.2);
        rightMotor.setPower(.2);

        sleep(12000);
     //   }

        leftMotor.setPowerFloat();
        rightMotor.setPowerFloat();

    }
}
