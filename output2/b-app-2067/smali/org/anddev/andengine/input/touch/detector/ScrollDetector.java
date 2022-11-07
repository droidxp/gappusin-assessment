public class org.anddev.andengine.input.touch.detector.ScrollDetector extends org.anddev.andengine.input.touch.detector.BaseDetector {
	 /* # static fields */
	 private static final Float TRIGGER_SCROLL_MINIMUM_DISTANCE_DEFAULT;
	 /* # instance fields */
	 private Float mLastX;
	 private Float mLastY;
	 private final org.anddev.andengine.input.touch.detector.ScrollDetector$IScrollDetectorListener mScrollDetectorListener;
	 private Float mTriggerScrollMinimumDistance;
	 private Boolean mTriggered;
	 /* # direct methods */
	 public org.anddev.andengine.input.touch.detector.ScrollDetector ( ) {
		 /* .locals 0 */
		 /* invoke-direct {p0}, Lorg/anddev/andengine/input/touch/detector/BaseDetector;-><init>()V */
		 /* iput p1, p0, Lorg/anddev/andengine/input/touch/detector/ScrollDetector;->mTriggerScrollMinimumDistance:F */
		 this.mScrollDetectorListener = p2;
		 return;
	 } // .end method
	 public org.anddev.andengine.input.touch.detector.ScrollDetector ( ) {
		 /* .locals 1 */
		 /* const/high16 v0, 0x41200000 # 10.0f */
		 /* invoke-direct {p0, v0, p1}, Lorg/anddev/andengine/input/touch/detector/ScrollDetector;-><init>(FLorg/anddev/andengine/input/touch/detector/ScrollDetector$IScrollDetectorListener;)V */
		 return;
	 } // .end method
	 /* # virtual methods */
	 public Float getTriggerScrollMinimumDistance ( ) {
		 /* .locals 1 */
		 /* iget v0, p0, Lorg/anddev/andengine/input/touch/detector/ScrollDetector;->mTriggerScrollMinimumDistance:F */
	 } // .end method
	 protected Float getX ( org.anddev.andengine.input.touch.TouchEvent p0 ) {
		 /* .locals 1 */
		 v0 = 		 (( org.anddev.andengine.input.touch.TouchEvent ) p1 ).getX ( ); // invoke-virtual {p1}, Lorg/anddev/andengine/input/touch/TouchEvent;->getX()F
	 } // .end method
	 protected Float getY ( org.anddev.andengine.input.touch.TouchEvent p0 ) {
		 /* .locals 1 */
		 v0 = 		 (( org.anddev.andengine.input.touch.TouchEvent ) p1 ).getY ( ); // invoke-virtual {p1}, Lorg/anddev/andengine/input/touch/TouchEvent;->getY()F
	 } // .end method
	 public Boolean onManagedTouchEvent ( org.anddev.andengine.input.touch.TouchEvent p0 ) {
		 /* .locals 7 */
		 int v3 = 0; // const/4 v3, 0x0
		 int v6 = 1; // const/4 v6, 0x1
		 v0 = 		 (( org.anddev.andengine.input.touch.detector.ScrollDetector ) p0 ).getX ( p1 ); // invoke-virtual {p0, p1}, Lorg/anddev/andengine/input/touch/detector/ScrollDetector;->getX(Lorg/anddev/andengine/input/touch/TouchEvent;)F
		 v1 = 		 (( org.anddev.andengine.input.touch.detector.ScrollDetector ) p0 ).getY ( p1 ); // invoke-virtual {p0, p1}, Lorg/anddev/andengine/input/touch/detector/ScrollDetector;->getY(Lorg/anddev/andengine/input/touch/TouchEvent;)F
		 v2 = 		 (( org.anddev.andengine.input.touch.TouchEvent ) p1 ).getAction ( ); // invoke-virtual {p1}, Lorg/anddev/andengine/input/touch/TouchEvent;->getAction()I
		 /* packed-switch v2, :pswitch_data_0 */
		 /* move v0, v3 */
	 } // :goto_0
	 /* :pswitch_0 */
	 /* iput v0, p0, Lorg/anddev/andengine/input/touch/detector/ScrollDetector;->mLastX:F */
	 /* iput v1, p0, Lorg/anddev/andengine/input/touch/detector/ScrollDetector;->mLastY:F */
	 /* iput-boolean v3, p0, Lorg/anddev/andengine/input/touch/detector/ScrollDetector;->mTriggered:Z */
	 /* move v0, v6 */
	 /* :pswitch_1 */
	 /* iget v2, p0, Lorg/anddev/andengine/input/touch/detector/ScrollDetector;->mLastX:F */
	 /* sub-float v2, v0, v2 */
	 /* iget v3, p0, Lorg/anddev/andengine/input/touch/detector/ScrollDetector;->mLastY:F */
	 /* sub-float v3, v1, v3 */
	 /* iget v4, p0, Lorg/anddev/andengine/input/touch/detector/ScrollDetector;->mTriggerScrollMinimumDistance:F */
	 /* iget-boolean v5, p0, Lorg/anddev/andengine/input/touch/detector/ScrollDetector;->mTriggered:Z */
	 /* if-nez v5, :cond_0 */
	 v5 = 	 java.lang.Math .abs ( v2 );
	 /* cmpl-float v5, v5, v4 */
	 /* if-gtz v5, :cond_0 */
	 v5 = 	 java.lang.Math .abs ( v3 );
	 /* cmpl-float v4, v5, v4 */
	 /* if-lez v4, :cond_1 */
} // :cond_0
v4 = this.mScrollDetectorListener;
/* iput v0, p0, Lorg/anddev/andengine/input/touch/detector/ScrollDetector;->mLastX:F */
/* iput v1, p0, Lorg/anddev/andengine/input/touch/detector/ScrollDetector;->mLastY:F */
/* iput-boolean v6, p0, Lorg/anddev/andengine/input/touch/detector/ScrollDetector;->mTriggered:Z */
} // :cond_1
/* move v0, v6 */
/* :pswitch_data_0 */
/* .packed-switch 0x0 */
/* :pswitch_0 */
/* :pswitch_1 */
/* :pswitch_1 */
/* :pswitch_1 */
} // .end packed-switch
} // .end method
public void setTriggerScrollMinimumDistance ( Float p0 ) {
/* .locals 0 */
/* iput p1, p0, Lorg/anddev/andengine/input/touch/detector/ScrollDetector;->mTriggerScrollMinimumDistance:F */
return;
} // .end method
