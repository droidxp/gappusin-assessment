public class org.anddev.andengine.input.touch.controller.SingleTouchControler extends org.anddev.andengine.input.touch.controller.BaseTouchController {
	 /* # direct methods */
	 public org.anddev.andengine.input.touch.controller.SingleTouchControler ( ) {
		 /* .locals 0 */
		 /* invoke-direct {p0}, Lorg/anddev/andengine/input/touch/controller/BaseTouchController;-><init>()V */
		 return;
	 } // .end method
	 /* # virtual methods */
	 public Boolean onHandleMotionEvent ( android.view.MotionEvent p0 ) {
		 /* .locals 6 */
		 v1 = 		 (( android.view.MotionEvent ) p1 ).getX ( ); // invoke-virtual {p1}, Landroid/view/MotionEvent;->getX()F
		 v2 = 		 (( android.view.MotionEvent ) p1 ).getY ( ); // invoke-virtual {p1}, Landroid/view/MotionEvent;->getY()F
		 v3 = 		 (( android.view.MotionEvent ) p1 ).getAction ( ); // invoke-virtual {p1}, Landroid/view/MotionEvent;->getAction()I
		 int v4 = 0; // const/4 v4, 0x0
		 /* move-object v0, p0 */
		 /* move-object v5, p1 */
		 v0 = 		 /* invoke-virtual/range {v0 ..v5}, Lorg/anddev/andengine/input/touch/controller/SingleTouchControler;->fireTouchEvent(FFIILandroid/view/MotionEvent;)Z */
	 } // .end method
