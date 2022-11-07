public abstract class org.anddev.andengine.input.touch.detector.SurfaceGestureDetector extends org.anddev.andengine.input.touch.detector.BaseDetector {
	 /* # static fields */
	 private static final Float SWIPE_MIN_DISTANCE_DEFAULT;
	 /* # instance fields */
	 private final android.view.GestureDetector mGestureDetector;
	 /* # direct methods */
	 public org.anddev.andengine.input.touch.detector.SurfaceGestureDetector ( ) {
		 /* .locals 1 */
		 /* const/high16 v0, 0x42f00000 # 120.0f */
		 /* invoke-direct {p0, v0}, Lorg/anddev/andengine/input/touch/detector/SurfaceGestureDetector;-><init>(F)V */
		 return;
	 } // .end method
	 public org.anddev.andengine.input.touch.detector.SurfaceGestureDetector ( ) {
		 /* .locals 2 */
		 /* invoke-direct {p0}, Lorg/anddev/andengine/input/touch/detector/BaseDetector;-><init>()V */
		 /* new-instance v0, Landroid/view/GestureDetector; */
		 /* new-instance v1, Lorg/anddev/andengine/input/touch/detector/SurfaceGestureDetector$InnerOnGestureDetectorListener; */
		 /* invoke-direct {v1, p0, p1}, Lorg/anddev/andengine/input/touch/detector/SurfaceGestureDetector$InnerOnGestureDetectorListener;-><init>(Lorg/anddev/andengine/input/touch/detector/SurfaceGestureDetector;F)V */
		 /* invoke-direct {v0, v1}, Landroid/view/GestureDetector;-><init>(Landroid/view/GestureDetector$OnGestureListener;)V */
		 this.mGestureDetector = v0;
		 return;
	 } // .end method
	 /* # virtual methods */
	 protected abstract Boolean onDoubleTap ( ) {
	 } // .end method
	 public Boolean onManagedTouchEvent ( org.anddev.andengine.input.touch.TouchEvent p0 ) {
		 /* .locals 2 */
		 v0 = this.mGestureDetector;
		 (( org.anddev.andengine.input.touch.TouchEvent ) p1 ).getMotionEvent ( ); // invoke-virtual {p1}, Lorg/anddev/andengine/input/touch/TouchEvent;->getMotionEvent()Landroid/view/MotionEvent;
		 v0 = 		 (( android.view.GestureDetector ) v0 ).onTouchEvent ( v1 ); // invoke-virtual {v0, v1}, Landroid/view/GestureDetector;->onTouchEvent(Landroid/view/MotionEvent;)Z
	 } // .end method
	 protected abstract Boolean onSingleTap ( ) {
	 } // .end method
	 protected abstract Boolean onSwipeDown ( ) {
	 } // .end method
	 protected abstract Boolean onSwipeLeft ( ) {
	 } // .end method
	 protected abstract Boolean onSwipeRight ( ) {
	 } // .end method
	 protected abstract Boolean onSwipeUp ( ) {
	 } // .end method
