/*package org.firstinspires.ftc.teamcode.drive.opmode.autonomous.CenterStage;

import com.acmerobotics.dashboard.config.Config;
import com.acmerobotics.roadrunner.geometry.Pose2d;
import com.qualcomm.robotcore.eventloop.opmode.Autonomous;
import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;

import org.firstinspires.ftc.teamcode.drive.SampleMecanumDrive;
import org.firstinspires.ftc.teamcode.trajectorysequence.TrajectorySequence;

@Config
@Autonomous (name="yooooo", group="comp")
public class Workshop extends LinearOpMode {

    private Pose2d startpose = new Pose2d(0,0,Math.toRadians(202));
    private Pose2d endpose = new Pose2d(0,10,Math.toRadians(10));

    SampleMecanumDrive drive;
    @Override
    public void runOpMode() throws InterruptedException {

        drive = new SampleMecanumDrive(hardwareMap);

        for (int i = 0 ; i< 5 ; i++) {
            d;
        }

    }
    public void upRight(SampleMecanumDrive _drive){
        TrajectorySequence move =_drive.trajectorySequenceBuilder()
    }

}
*/