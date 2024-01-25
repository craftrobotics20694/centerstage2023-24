package org.firstinspires.ftc.teamcode.drive.opmode.visionCenterStage;
// lowkey this above my head for tonight
// the red text is terrifying but I swear it'll resolve mostly once I'm done.
import static org.firstinspires.ftc.robotcore.external.BlocksOpModeCompanion.hardwareMap;

import org.firstinspires.ftc.robotcore.external.hardware.camera.WebcamName;
import org.opencv.core.Mat;
import org.openftc.easyopencv.OpenCvCamera;
import org.openftc.easyopencv.OpenCvCameraFactory;
import org.openftc.easyopencv.OpenCvPipeline;
import org.openftc.easyopencv.OpenCvCamera.AsyncCameraOpenListener;
import org.openftc.easyopencv.OpenCvCamera.AsyncCameraCloseListener;
import org.openftc.easyopencv.OpenCvWebcam;
import org.openftc.easyopencv.OpenCvCameraRotation;

/* public class cameraPipeline
{
    int cameraMonitorViewId = hardwareMap.appContext.getResources().getIdentifier("cameraMonitorViewId", "id", hardwareMap.appContext.getPackageName());
    // You're gonna have to check Vuforia for the details once hardware is installed :/ Also wtf happened to hardwareMap?
    // Use camera.pauseViewport(); to turn live viewport on and off.
    // ONLY TURN LIVE VIEWPORT ON FOR DEBUG. UNDER ABSOLUTELY NO CIRCUMSTANCES SHOULD IT BE ON DURING COMPETITION!!!!
    WebcamName webcamName = hardwareMap.get(WebcamName.class, "NAME_OF_CAMERA_IN_CONFIG_FILE");
    //Need to come back to this and get exact names
    OpenCvCamera camera = OpenCvCameraFactory.getInstance().createWebcam(webcamName, cameraMonitorViewId);

       void openCameraDeviceAsync(OpenCvCamera.AsyncCameraOpenListener cameraOpenListener)
    {

        public void onOpened();
        {
            camera.startStreaming(1280, 720, OpenCvCameraRotation.UPRIGHT);
            // gotta input camera resolution once we get that info
            // Usually this is where you'll want to start streaming from the camera
        }

        public void onError(int errorCode)
        {
            /*
             * This will be called if the camera could not be opened
             */
     /*   }});
    {class actualPipeline extends OpenCvPipeline;

        { camera.setPipeline(actualPipeline);
        //Sets the camera pipeline to this one!!!
        {
        public Mat processFrame(Mat input)
        { // Image processing goes here, just not there yet.
            //OPEN CV IS TERRIFYING
        }

        public int getLatestResults()
        {
            return lastResult;
            // Call this to get latest results <OBJECT_TYPE_HERE> results = pipeline.getLatestResults()

        }


}}}}*/
