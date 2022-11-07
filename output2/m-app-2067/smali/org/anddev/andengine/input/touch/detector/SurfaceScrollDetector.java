public class org.anddev.andengine.input.touch.detector.SurfaceScrollDetector extends org.anddev.andengine.input.touch.detector.ScrollDetector {
	 /* # direct methods */
	 public org.anddev.andengine.input.touch.detector.SurfaceScrollDetector ( ) {
		 /* .locals 0 */
		 /* invoke-direct {p0, p1, p2}, Lorg/anddev/andengine/input/touch/detector/ScrollDetector;-><init>(FLorg/anddev/andengine/input/touch/detector/ScrollDetector$IScrollDetectorListener;)V */
		 return;
	 } // .end method
	 public org.anddev.andengine.input.touch.detector.SurfaceScrollDetector ( ) {
		 /* .locals 0 */
		 /* invoke-direct {p0, p1}, Lorg/anddev/andengine/input/touch/detector/ScrollDetector;-><init>(Lorg/anddev/andengine/input/touch/detector/ScrollDetector$IScrollDetectorListener;)V */
		 return;
	 } // .end method
	 /* # virtual methods */
	 protected Float getX ( org.anddev.andengine.input.touch.TouchEvent p0 ) {
		 /* .locals 1 */
		 (( org.anddev.andengine.input.touch.TouchEvent ) p1 ).getMotionEvent ( ); // invoke-virtual {p1}, Lorg/anddev/andengine/input/touch/TouchEvent;->getMotionEvent()Landroid/view/MotionEvent;
		 v0 = 		 (( android.view.MotionEvent ) v0 ).getX ( ); // invoke-virtual {v0}, Landroid/view/MotionEvent;->getX()F
	 } // .end method
	 protected Float getY ( org.anddev.andengine.input.touch.TouchEvent p0 ) {
		 /* .locals 1 */
		 (( org.anddev.andengine.input.touch.TouchEvent ) p1 ).getMotionEvent ( ); // invoke-virtual {p1}, Lorg/anddev/andengine/input/touch/TouchEvent;->getMotionEvent()Landroid/view/MotionEvent;
		 v0 = 		 (( android.view.MotionEvent ) v0 ).getY ( ); // invoke-virtual {v0}, Landroid/view/MotionEvent;->getY()F
	 } // .end method
