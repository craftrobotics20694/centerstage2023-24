package org.firstinspires.ftc.teamcode.drive.opmode.autonomous.CenterStage;

import com.acmerobotics.dashboard.config.Config;
import com.acmerobotics.roadrunner.geometry.Pose2d;
import com.qualcomm.robotcore.eventloop.opmode.Autonomous;
import com.qualcomm.robotcore.eventloop.opmode.LinearOpMode;

import org.firstinspires.ftc.teamcode.drive.SampleMecanumDrive;
import org.firstinspires.ftc.teamcode.trajectorysequence.TrajectorySequence;

@Autonomous(name = "EDUCATION", group = "comp")
@Config
public class AutoV1 extends LinearOpMode {

    //pivate stuff abject calling
    private final Pose2d StartLF = new Pose2d(0,0,Math.toRadians(90));
//    private final Pose2d PurpPos = new Pose2d(10,0,Math.toRadians(90));
private Pose2d startPose = new Pose2d(0,0,Math.toRadians(0));
    private Pose2d PoseTwo = new Pose2d(10,40,Math.toRadians(180));
    private Pose2d PoseThree = new Pose2d(10,40,Math.toRadians(-90));
    private Pose2d endPose = new Pose2d(40,20,Math.toRadians(270));

    SampleMecanumDrive drive;
    private final double travelSpeed = 45.0, travelAccel = 30.0;

    @Override
    public void runOpMode() throws InterruptedException {
        drive = new SampleMecanumDrive(hardwareMap);
        drive.setPoseEstimate(startPose);
        TrajectorySequence move1 = drive.trajectorySequenceBuilder(startPose)
                .lineToSplineHeading(PoseTwo)
                .build();

        drive.followTrajectorySequence(move1);

        TrajectorySequence move3 = drive.trajectorySequenceBuilder(drive.getPoseEstimate())
                .lineToSplineHeading(PoseThree)
                .build();
        drive.followTrajectorySequence(move3);
        TrajectorySequence endmove = drive.trajectorySequenceBuilder(drive.getPoseEstimate())
                .lineToSplineHeading(endPose)
                .build();
        drive.followTrajectorySequence(endmove);
    }
}
