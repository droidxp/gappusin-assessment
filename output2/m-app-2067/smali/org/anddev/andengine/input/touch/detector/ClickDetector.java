public class org.anddev.andengine.input.touch.detector.ClickDetector extends org.anddev.andengine.input.touch.detector.BaseDetector {
	 /* # static fields */
	 private static final Long TRIGGER_CLICK_MAXIMUM_MILLISECONDS_DEFAULT;
	 /* # instance fields */
	 private final org.anddev.andengine.input.touch.detector.ClickDetector$IClickDetectorListener mClickDetectorListener;
	 private Long mDownTimeMilliseconds;
	 private Long mTriggerClickMaximumMilliseconds;
	 /* # direct methods */
	 public org.anddev.andengine.input.touch.detector.ClickDetector ( ) {
		 /* .locals 2 */
		 /* invoke-direct {p0}, Lorg/anddev/andengine/input/touch/detector/BaseDetector;-><init>()V */
		 /* const-wide/high16 v0, -0x8000000000000000L */
		 /* iput-wide v0, p0, Lorg/anddev/andengine/input/touch/detector/ClickDetector;->mDownTimeMilliseconds:J */
		 /* iput-wide p1, p0, Lorg/anddev/andengine/input/touch/detector/ClickDetector;->mTriggerClickMaximumMilliseconds:J */
		 this.mClickDetectorListener = p3;
		 return;
	 } // .end method
	 public org.anddev.andengine.input.touch.detector.ClickDetector ( ) {
		 /* .locals 2 */
		 /* const-wide/16 v0, 0xc8 */
		 /* invoke-direct {p0, v0, v1, p1}, Lorg/anddev/andengine/input/touch/detector/ClickDetector;-><init>(JLorg/anddev/andengine/input/touch/detector/ClickDetector$IClickDetectorListener;)V */
		 return;
	 } // .end method
	 /* # virtual methods */
	 public Long getTriggerClickMaximumMilliseconds ( ) {
		 /* .locals 2 */
		 /* iget-wide v0, p0, Lorg/anddev/andengine/input/touch/detector/ClickDetector;->mTriggerClickMaximumMilliseconds:J */
		 /* return-wide v0 */
	 } // .end method
	 public Boolean onManagedTouchEvent ( org.anddev.andengine.input.touch.TouchEvent p0 ) {
		 /* .locals 5 */
		 int v4 = 1; // const/4 v4, 0x1
		 v0 = 		 (( org.anddev.andengine.input.touch.TouchEvent ) p1 ).getAction ( ); // invoke-virtual {p1}, Lorg/anddev/andengine/input/touch/TouchEvent;->getAction()I
		 /* packed-switch v0, :pswitch_data_0 */
		 /* :pswitch_0 */
		 int v0 = 0; // const/4 v0, 0x0
	 } // :goto_0
	 /* :pswitch_1 */
	 (( org.anddev.andengine.input.touch.TouchEvent ) p1 ).getMotionEvent ( ); // invoke-virtual {p1}, Lorg/anddev/andengine/input/touch/TouchEvent;->getMotionEvent()Landroid/view/MotionEvent;
	 (( android.view.MotionEvent ) v0 ).getDownTime ( ); // invoke-virtual {v0}, Landroid/view/MotionEvent;->getDownTime()J
	 /* move-result-wide v0 */
	 /* iput-wide v0, p0, Lorg/anddev/andengine/input/touch/detector/ClickDetector;->mDownTimeMilliseconds:J */
	 /* move v0, v4 */
	 /* :pswitch_2 */
	 (( org.anddev.andengine.input.touch.TouchEvent ) p1 ).getMotionEvent ( ); // invoke-virtual {p1}, Lorg/anddev/andengine/input/touch/TouchEvent;->getMotionEvent()Landroid/view/MotionEvent;
	 (( android.view.MotionEvent ) v0 ).getEventTime ( ); // invoke-virtual {v0}, Landroid/view/MotionEvent;->getEventTime()J
	 /* move-result-wide v0 */
	 /* iget-wide v2, p0, Lorg/anddev/andengine/input/touch/detector/ClickDetector;->mDownTimeMilliseconds:J */
	 /* sub-long/2addr v0, v2 */
	 /* iget-wide v2, p0, Lorg/anddev/andengine/input/touch/detector/ClickDetector;->mTriggerClickMaximumMilliseconds:J */
	 /* cmp-long v0, v0, v2 */
	 /* if-gtz v0, :cond_0 */
	 /* const-wide/high16 v0, -0x8000000000000000L */
	 /* iput-wide v0, p0, Lorg/anddev/andengine/input/touch/detector/ClickDetector;->mDownTimeMilliseconds:J */
	 v0 = this.mClickDetectorListener;
} // :cond_0
/* move v0, v4 */
/* :pswitch_data_0 */
/* .packed-switch 0x0 */
/* :pswitch_1 */
/* :pswitch_2 */
/* :pswitch_0 */
/* :pswitch_2 */
} // .end packed-switch
} // .end method
public void setTriggerClickMaximumMilliseconds ( Long p0 ) {
/* .locals 0 */
/* iput-wide p1, p0, Lorg/anddev/andengine/input/touch/detector/ClickDetector;->mTriggerClickMaximumMilliseconds:J */
return;
} // .end method
