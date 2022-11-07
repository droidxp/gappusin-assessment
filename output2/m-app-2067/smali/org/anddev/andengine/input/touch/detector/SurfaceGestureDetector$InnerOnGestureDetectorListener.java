class org.anddev.andengine.input.touch.detector.SurfaceGestureDetector$InnerOnGestureDetectorListener extends android.view.GestureDetector$SimpleOnGestureListener {
	 /* # instance fields */
	 private final Float mSwipeMinDistance;
	 final org.anddev.andengine.input.touch.detector.SurfaceGestureDetector this$0; //synthetic
	 /* # direct methods */
	 public org.anddev.andengine.input.touch.detector.SurfaceGestureDetector$InnerOnGestureDetectorListener ( ) {
		 /* .locals 0 */
		 this.this$0 = p1;
		 /* invoke-direct {p0}, Landroid/view/GestureDetector$SimpleOnGestureListener;-><init>()V */
		 /* iput p2, p0, Lorg/anddev/andengine/input/touch/detector/SurfaceGestureDetector$InnerOnGestureDetectorListener;->mSwipeMinDistance:F */
		 return;
	 } // .end method
	 /* # virtual methods */
	 public Boolean onDoubleTap ( android.view.MotionEvent p0 ) {
		 /* .locals 1 */
		 v0 = this.this$0;
		 v0 = 		 (( org.anddev.andengine.input.touch.detector.SurfaceGestureDetector ) v0 ).onDoubleTap ( ); // invoke-virtual {v0}, Lorg/anddev/andengine/input/touch/detector/SurfaceGestureDetector;->onDoubleTap()Z
	 } // .end method
	 public Boolean onFling ( android.view.MotionEvent p0, android.view.MotionEvent p1, Float p2, Float p3 ) {
		 /* .locals 4 */
		 int v3 = 0; // const/4 v3, 0x0
		 /* iget v0, p0, Lorg/anddev/andengine/input/touch/detector/SurfaceGestureDetector$InnerOnGestureDetectorListener;->mSwipeMinDistance:F */
		 v1 = 		 java.lang.Math .abs ( p3 );
		 v2 = 		 java.lang.Math .abs ( p4 );
		 /* cmpl-float v1, v1, v2 */
		 /* if-lez v1, :cond_0 */
		 int v1 = 1; // const/4 v1, 0x1
	 } // :goto_0
	 if ( v1 != null) { // if-eqz v1, :cond_2
		 v1 = 		 (( android.view.MotionEvent ) p1 ).getX ( ); // invoke-virtual {p1}, Landroid/view/MotionEvent;->getX()F
		 v2 = 		 (( android.view.MotionEvent ) p2 ).getX ( ); // invoke-virtual {p2}, Landroid/view/MotionEvent;->getX()F
		 /* sub-float/2addr v1, v2 */
		 /* cmpl-float v1, v1, v0 */
		 /* if-lez v1, :cond_1 */
		 v0 = this.this$0;
		 v0 = 		 (( org.anddev.andengine.input.touch.detector.SurfaceGestureDetector ) v0 ).onSwipeLeft ( ); // invoke-virtual {v0}, Lorg/anddev/andengine/input/touch/detector/SurfaceGestureDetector;->onSwipeLeft()Z
	 } // :goto_1
} // :cond_0
/* move v1, v3 */
} // :cond_1
v1 = (( android.view.MotionEvent ) p2 ).getX ( ); // invoke-virtual {p2}, Landroid/view/MotionEvent;->getX()F
v2 = (( android.view.MotionEvent ) p1 ).getX ( ); // invoke-virtual {p1}, Landroid/view/MotionEvent;->getX()F
/* sub-float/2addr v1, v2 */
/* cmpl-float v0, v1, v0 */
/* if-lez v0, :cond_4 */
v0 = this.this$0;
v0 = (( org.anddev.andengine.input.touch.detector.SurfaceGestureDetector ) v0 ).onSwipeRight ( ); // invoke-virtual {v0}, Lorg/anddev/andengine/input/touch/detector/SurfaceGestureDetector;->onSwipeRight()Z
} // :cond_2
v1 = (( android.view.MotionEvent ) p1 ).getY ( ); // invoke-virtual {p1}, Landroid/view/MotionEvent;->getY()F
v2 = (( android.view.MotionEvent ) p2 ).getY ( ); // invoke-virtual {p2}, Landroid/view/MotionEvent;->getY()F
/* sub-float/2addr v1, v2 */
/* cmpl-float v1, v1, v0 */
/* if-lez v1, :cond_3 */
v0 = this.this$0;
v0 = (( org.anddev.andengine.input.touch.detector.SurfaceGestureDetector ) v0 ).onSwipeUp ( ); // invoke-virtual {v0}, Lorg/anddev/andengine/input/touch/detector/SurfaceGestureDetector;->onSwipeUp()Z
} // :cond_3
v1 = (( android.view.MotionEvent ) p2 ).getY ( ); // invoke-virtual {p2}, Landroid/view/MotionEvent;->getY()F
v2 = (( android.view.MotionEvent ) p1 ).getY ( ); // invoke-virtual {p1}, Landroid/view/MotionEvent;->getY()F
/* sub-float/2addr v1, v2 */
/* cmpl-float v0, v1, v0 */
/* if-lez v0, :cond_4 */
v0 = this.this$0;
v0 = (( org.anddev.andengine.input.touch.detector.SurfaceGestureDetector ) v0 ).onSwipeDown ( ); // invoke-virtual {v0}, Lorg/anddev/andengine/input/touch/detector/SurfaceGestureDetector;->onSwipeDown()Z
} // :cond_4
/* move v0, v3 */
} // .end method
public Boolean onSingleTapConfirmed ( android.view.MotionEvent p0 ) {
/* .locals 1 */
v0 = this.this$0;
v0 = (( org.anddev.andengine.input.touch.detector.SurfaceGestureDetector ) v0 ).onSingleTap ( ); // invoke-virtual {v0}, Lorg/anddev/andengine/input/touch/detector/SurfaceGestureDetector;->onSingleTap()Z
} // .end method
