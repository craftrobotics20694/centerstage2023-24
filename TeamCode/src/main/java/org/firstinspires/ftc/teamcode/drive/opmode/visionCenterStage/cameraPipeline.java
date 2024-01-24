package org.firstinspires.ftc.teamcode.drive.opmode.visionCenterStage;
// lowkey this above my head for tonight
// the red text is terrifying but I swear it'll resolve mostly once I'm done.
import static org.firstinspires.ftc.robotcore.external.BlocksOpModeCompanion.hardwareMap;
import org.opencv.core.Core;
import org.opencv.core.Mat;
import org.opencv.core.MatOfRect;
import org.opencv.core.Point;
import org.opencv.core.Rect;
import org.opencv.core.Scalar;
import org.opencv.imgcodecs.Imgcodecs;
import org.opencv.objdetect.CascadeClassifier;
import org.openftc.easyopencv.OpenCvPipeline;

public class cameraPipeline
{
    int cameraMonitorViewId = hardwareMap.appContext.getResources().getIdentifier("cameraMonitorViewId", "id", hardwareMap.appContext.getPackageName());
    // You're gonna have to check Vuforia for the details once hardware is installed :/ Also wtf happened to hardwareMap?
    // Use camera.pauseViewport(); to turn live viewport on and off.
    // ONLY TURN LIVE VIEWPORT ON FOR DEBUG. UNDER ABSOLUTELY NO CIRCUMSTANCES SHOULD IT BE ON DURING COMPETITION!!!!
    WebcamName webcamName = hardwareMap.get(WebcamName.class, "NAME_OF_CAMERA_IN_CONFIG_FILE");
    //Need to come back to this and get exact names
    OpenCvCamera camera = OpenCvCameraFactory.getInstance().createWebcam(webcamName, cameraMonitorViewId);

        camera.openCameraDeviceAsync(new OpenCvCamera.AsyncCameraOpenListener()
    {
        @Override
        public void onOpened();
        { camera.setViewportRenderer(OpenCvCamera.ViewportRenderer.GPU_ACCELERATED);
            //Accelerates GPU to live viewport, irrelevant if viewport is paused
            camera.startStreaming(1920, 1080, OpenCvCameraRotation.UPRIGHT);
            // gotta input camera resolution once we get that info
            // Usually this is where you'll want to start streaming from the camera
        }
        @Override
        public void onError(int errorCode);
        {
            /*
             * This will be called if the camera could not be opened
             */
        }
    });
class actualPipeline extends OpenCvPipeline
    camera.setPipeline(actualPipeline);
        //Sets the camera pipeline to this one!!!
        { @Override
        public Mat processFrame(Mat input)
        { // Image processing goes here, just not there yet.
            //OPEN CV IS TERRIFYING
        }

        public int getLatestResults()
        {
            return lastResult;
        }
        // Call this to get latest results <OBJECT_TYPE_HERE> results = pipeline.getLatestResults()

}}
