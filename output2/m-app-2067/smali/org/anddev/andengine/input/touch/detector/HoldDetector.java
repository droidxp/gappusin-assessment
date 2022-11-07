public class org.anddev.andengine.input.touch.detector.HoldDetector extends org.anddev.andengine.input.touch.detector.BaseDetector implements org.anddev.andengine.engine.handler.IUpdateHandler {
	 /* # interfaces */
	 /* # static fields */
	 private static final Float TIME_BETWEEN_UPDATES_DEFAULT;
	 private static final Float TRIGGER_HOLD_MAXIMUM_DISTANCE_DEFAULT;
	 private static final Long TRIGGER_HOLD_MINIMUM_MILLISECONDS_DEFAULT;
	 /* # instance fields */
	 private Long mDownTimeMilliseconds;
	 private Float mDownX;
	 private Float mDownY;
	 private final org.anddev.andengine.input.touch.detector.HoldDetector$IHoldDetectorListener mHoldDetectorListener;
	 private Float mHoldX;
	 private Float mHoldY;
	 private Boolean mMaximumDistanceExceeded;
	 private final org.anddev.andengine.engine.handler.timer.TimerHandler mTimerHandler;
	 private Float mTriggerHoldMaximumDistance;
	 private Long mTriggerHoldMinimumMilliseconds;
	 private Boolean mTriggerOnHold;
	 private Boolean mTriggerOnHoldFinished;
	 /* # direct methods */
	 public org.anddev.andengine.input.touch.detector.HoldDetector ( ) {
		 /* .locals 3 */
		 int v2 = 0; // const/4 v2, 0x0
		 /* invoke-direct {p0}, Lorg/anddev/andengine/input/touch/detector/BaseDetector;-><init>()V */
		 /* const-wide/high16 v0, -0x8000000000000000L */
		 /* iput-wide v0, p0, Lorg/anddev/andengine/input/touch/detector/HoldDetector;->mDownTimeMilliseconds:J */
		 /* iput-boolean v2, p0, Lorg/anddev/andengine/input/touch/detector/HoldDetector;->mMaximumDistanceExceeded:Z */
		 /* iput-boolean v2, p0, Lorg/anddev/andengine/input/touch/detector/HoldDetector;->mTriggerOnHold:Z */
		 /* iput-boolean v2, p0, Lorg/anddev/andengine/input/touch/detector/HoldDetector;->mTriggerOnHoldFinished:Z */
		 /* iput-wide p1, p0, Lorg/anddev/andengine/input/touch/detector/HoldDetector;->mTriggerHoldMinimumMilliseconds:J */
		 /* iput p3, p0, Lorg/anddev/andengine/input/touch/detector/HoldDetector;->mTriggerHoldMaximumDistance:F */
		 this.mHoldDetectorListener = p5;
		 /* new-instance v0, Lorg/anddev/andengine/engine/handler/timer/TimerHandler; */
		 int v1 = 1; // const/4 v1, 0x1
		 /* new-instance v2, Lorg/anddev/andengine/input/touch/detector/HoldDetector$1; */
		 /* invoke-direct {v2, p0}, Lorg/anddev/andengine/input/touch/detector/HoldDetector$1;-><init>(Lorg/anddev/andengine/input/touch/detector/HoldDetector;)V */
		 /* invoke-direct {v0, p4, v1, v2}, Lorg/anddev/andengine/engine/handler/timer/TimerHandler;-><init>(FZLorg/anddev/andengine/engine/handler/timer/ITimerCallback;)V */
		 this.mTimerHandler = v0;
		 return;
	 } // .end method
	 public org.anddev.andengine.input.touch.detector.HoldDetector ( ) {
		 /* .locals 6 */
		 /* const-wide/16 v1, 0xc8 */
		 /* const/high16 v3, 0x41200000 # 10.0f */
		 /* const v4, 0x3dcccccd # 0.1f */
		 /* move-object v0, p0 */
		 /* move-object v5, p1 */
		 /* invoke-direct/range {v0 ..v5}, Lorg/anddev/andengine/input/touch/detector/HoldDetector;-><init>(JFFLorg/anddev/andengine/input/touch/detector/HoldDetector$IHoldDetectorListener;)V */
		 return;
	 } // .end method
	 /* # virtual methods */
	 protected void fireListener ( ) {
		 /* .locals 7 */
		 int v6 = 0; // const/4 v6, 0x0
		 /* iget-boolean v0, p0, Lorg/anddev/andengine/input/touch/detector/HoldDetector;->mTriggerOnHoldFinished:Z */
		 if ( v0 != null) { // if-eqz v0, :cond_1
			 v0 = this.mHoldDetectorListener;
			 android.os.SystemClock .uptimeMillis ( );
			 /* move-result-wide v1 */
			 /* iget-wide v3, p0, Lorg/anddev/andengine/input/touch/detector/HoldDetector;->mDownTimeMilliseconds:J */
			 /* sub-long v2, v1, v3 */
			 /* iget v4, p0, Lorg/anddev/andengine/input/touch/detector/HoldDetector;->mHoldX:F */
			 /* iget v5, p0, Lorg/anddev/andengine/input/touch/detector/HoldDetector;->mHoldY:F */
			 /* move-object v1, p0 */
			 /* invoke-interface/range {v0 ..v5}, Lorg/anddev/andengine/input/touch/detector/HoldDetector$IHoldDetectorListener;->onHoldFinished(Lorg/anddev/andengine/input/touch/detector/HoldDetector;JFF)V */
			 /* iput-boolean v6, p0, Lorg/anddev/andengine/input/touch/detector/HoldDetector;->mTriggerOnHoldFinished:Z */
			 /* iput-boolean v6, p0, Lorg/anddev/andengine/input/touch/detector/HoldDetector;->mTriggerOnHold:Z */
		 } // :cond_0
	 } // :goto_0
	 return;
} // :cond_1
/* iget-boolean v0, p0, Lorg/anddev/andengine/input/touch/detector/HoldDetector;->mTriggerOnHold:Z */
if ( v0 != null) { // if-eqz v0, :cond_0
	 v0 = this.mHoldDetectorListener;
	 android.os.SystemClock .uptimeMillis ( );
	 /* move-result-wide v1 */
	 /* iget-wide v3, p0, Lorg/anddev/andengine/input/touch/detector/HoldDetector;->mDownTimeMilliseconds:J */
	 /* sub-long v2, v1, v3 */
	 /* iget v4, p0, Lorg/anddev/andengine/input/touch/detector/HoldDetector;->mHoldX:F */
	 /* iget v5, p0, Lorg/anddev/andengine/input/touch/detector/HoldDetector;->mHoldY:F */
	 /* move-object v1, p0 */
	 /* invoke-interface/range {v0 ..v5}, Lorg/anddev/andengine/input/touch/detector/HoldDetector$IHoldDetectorListener;->onHold(Lorg/anddev/andengine/input/touch/detector/HoldDetector;JFF)V */
} // .end method
public Float getTriggerHoldMaximumDistance ( ) {
	 /* .locals 1 */
	 /* iget v0, p0, Lorg/anddev/andengine/input/touch/detector/HoldDetector;->mTriggerHoldMaximumDistance:F */
} // .end method
public Long getTriggerHoldMinimumMilliseconds ( ) {
	 /* .locals 2 */
	 /* iget-wide v0, p0, Lorg/anddev/andengine/input/touch/detector/HoldDetector;->mTriggerHoldMinimumMilliseconds:J */
	 /* return-wide v0 */
} // .end method
public Boolean isHolding ( ) {
	 /* .locals 1 */
	 /* iget-boolean v0, p0, Lorg/anddev/andengine/input/touch/detector/HoldDetector;->mTriggerOnHold:Z */
} // .end method
public Boolean onManagedTouchEvent ( org.anddev.andengine.input.touch.TouchEvent p0 ) {
	 /* .locals 8 */
	 int v7 = 0; // const/4 v7, 0x0
	 int v6 = 1; // const/4 v6, 0x1
	 (( org.anddev.andengine.input.touch.TouchEvent ) p1 ).getMotionEvent ( ); // invoke-virtual {p1}, Lorg/anddev/andengine/input/touch/TouchEvent;->getMotionEvent()Landroid/view/MotionEvent;
	 v1 = 	 (( org.anddev.andengine.input.touch.TouchEvent ) p1 ).getX ( ); // invoke-virtual {p1}, Lorg/anddev/andengine/input/touch/TouchEvent;->getX()F
	 /* iput v1, p0, Lorg/anddev/andengine/input/touch/detector/HoldDetector;->mHoldX:F */
	 v1 = 	 (( org.anddev.andengine.input.touch.TouchEvent ) p1 ).getY ( ); // invoke-virtual {p1}, Lorg/anddev/andengine/input/touch/TouchEvent;->getY()F
	 /* iput v1, p0, Lorg/anddev/andengine/input/touch/detector/HoldDetector;->mHoldY:F */
	 v1 = 	 (( org.anddev.andengine.input.touch.TouchEvent ) p1 ).getAction ( ); // invoke-virtual {p1}, Lorg/anddev/andengine/input/touch/TouchEvent;->getAction()I
	 /* packed-switch v1, :pswitch_data_0 */
	 /* move v0, v7 */
} // :goto_0
/* :pswitch_0 */
(( android.view.MotionEvent ) v0 ).getDownTime ( ); // invoke-virtual {v0}, Landroid/view/MotionEvent;->getDownTime()J
/* move-result-wide v1 */
/* iput-wide v1, p0, Lorg/anddev/andengine/input/touch/detector/HoldDetector;->mDownTimeMilliseconds:J */
v1 = (( android.view.MotionEvent ) v0 ).getX ( ); // invoke-virtual {v0}, Landroid/view/MotionEvent;->getX()F
/* iput v1, p0, Lorg/anddev/andengine/input/touch/detector/HoldDetector;->mDownX:F */
v0 = (( android.view.MotionEvent ) v0 ).getY ( ); // invoke-virtual {v0}, Landroid/view/MotionEvent;->getY()F
/* iput v0, p0, Lorg/anddev/andengine/input/touch/detector/HoldDetector;->mDownY:F */
/* iput-boolean v7, p0, Lorg/anddev/andengine/input/touch/detector/HoldDetector;->mMaximumDistanceExceeded:Z */
/* move v0, v6 */
/* :pswitch_1 */
(( android.view.MotionEvent ) v0 ).getEventTime ( ); // invoke-virtual {v0}, Landroid/view/MotionEvent;->getEventTime()J
/* move-result-wide v1 */
/* iget v3, p0, Lorg/anddev/andengine/input/touch/detector/HoldDetector;->mTriggerHoldMaximumDistance:F */
/* iget-boolean v4, p0, Lorg/anddev/andengine/input/touch/detector/HoldDetector;->mMaximumDistanceExceeded:Z */
/* if-nez v4, :cond_2 */
/* iget v4, p0, Lorg/anddev/andengine/input/touch/detector/HoldDetector;->mDownX:F */
v5 = (( android.view.MotionEvent ) v0 ).getX ( ); // invoke-virtual {v0}, Landroid/view/MotionEvent;->getX()F
/* sub-float/2addr v4, v5 */
v4 = java.lang.Math .abs ( v4 );
/* cmpl-float v4, v4, v3 */
/* if-gtz v4, :cond_2 */
/* iget v4, p0, Lorg/anddev/andengine/input/touch/detector/HoldDetector;->mDownY:F */
v0 = (( android.view.MotionEvent ) v0 ).getY ( ); // invoke-virtual {v0}, Landroid/view/MotionEvent;->getY()F
/* sub-float v0, v4, v0 */
v0 = java.lang.Math .abs ( v0 );
/* cmpl-float v0, v0, v3 */
/* if-gtz v0, :cond_2 */
/* move v0, v7 */
} // :goto_1
/* iput-boolean v0, p0, Lorg/anddev/andengine/input/touch/detector/HoldDetector;->mMaximumDistanceExceeded:Z */
/* iget-boolean v0, p0, Lorg/anddev/andengine/input/touch/detector/HoldDetector;->mTriggerOnHold:Z */
/* if-nez v0, :cond_0 */
/* iget-boolean v0, p0, Lorg/anddev/andengine/input/touch/detector/HoldDetector;->mMaximumDistanceExceeded:Z */
/* if-nez v0, :cond_1 */
} // :cond_0
/* iget-wide v3, p0, Lorg/anddev/andengine/input/touch/detector/HoldDetector;->mDownTimeMilliseconds:J */
/* sub-long v0, v1, v3 */
/* iget-wide v2, p0, Lorg/anddev/andengine/input/touch/detector/HoldDetector;->mTriggerHoldMinimumMilliseconds:J */
/* cmp-long v0, v0, v2 */
/* if-ltz v0, :cond_1 */
/* iput-boolean v6, p0, Lorg/anddev/andengine/input/touch/detector/HoldDetector;->mTriggerOnHold:Z */
} // :cond_1
/* move v0, v6 */
} // :cond_2
/* move v0, v6 */
/* :pswitch_2 */
(( android.view.MotionEvent ) v0 ).getEventTime ( ); // invoke-virtual {v0}, Landroid/view/MotionEvent;->getEventTime()J
/* move-result-wide v1 */
/* iget v3, p0, Lorg/anddev/andengine/input/touch/detector/HoldDetector;->mTriggerHoldMaximumDistance:F */
/* iget-boolean v4, p0, Lorg/anddev/andengine/input/touch/detector/HoldDetector;->mMaximumDistanceExceeded:Z */
/* if-nez v4, :cond_5 */
/* iget v4, p0, Lorg/anddev/andengine/input/touch/detector/HoldDetector;->mDownX:F */
v5 = (( android.view.MotionEvent ) v0 ).getX ( ); // invoke-virtual {v0}, Landroid/view/MotionEvent;->getX()F
/* sub-float/2addr v4, v5 */
v4 = java.lang.Math .abs ( v4 );
/* cmpl-float v4, v4, v3 */
/* if-gtz v4, :cond_5 */
/* iget v4, p0, Lorg/anddev/andengine/input/touch/detector/HoldDetector;->mDownY:F */
v0 = (( android.view.MotionEvent ) v0 ).getY ( ); // invoke-virtual {v0}, Landroid/view/MotionEvent;->getY()F
/* sub-float v0, v4, v0 */
v0 = java.lang.Math .abs ( v0 );
/* cmpl-float v0, v0, v3 */
/* if-gtz v0, :cond_5 */
/* move v0, v7 */
} // :goto_2
/* iput-boolean v0, p0, Lorg/anddev/andengine/input/touch/detector/HoldDetector;->mMaximumDistanceExceeded:Z */
/* iget-boolean v0, p0, Lorg/anddev/andengine/input/touch/detector/HoldDetector;->mTriggerOnHold:Z */
/* if-nez v0, :cond_3 */
/* iget-boolean v0, p0, Lorg/anddev/andengine/input/touch/detector/HoldDetector;->mMaximumDistanceExceeded:Z */
/* if-nez v0, :cond_4 */
} // :cond_3
/* iget-wide v3, p0, Lorg/anddev/andengine/input/touch/detector/HoldDetector;->mDownTimeMilliseconds:J */
/* sub-long v0, v1, v3 */
/* iget-wide v2, p0, Lorg/anddev/andengine/input/touch/detector/HoldDetector;->mTriggerHoldMinimumMilliseconds:J */
/* cmp-long v0, v0, v2 */
/* if-ltz v0, :cond_4 */
/* iput-boolean v6, p0, Lorg/anddev/andengine/input/touch/detector/HoldDetector;->mTriggerOnHoldFinished:Z */
} // :cond_4
/* move v0, v6 */
/* goto/16 :goto_0 */
} // :cond_5
/* move v0, v6 */
/* :pswitch_data_0 */
/* .packed-switch 0x0 */
/* :pswitch_0 */
/* :pswitch_2 */
/* :pswitch_1 */
/* :pswitch_2 */
} // .end packed-switch
} // .end method
public void onUpdate ( Float p0 ) {
/* .locals 1 */
v0 = this.mTimerHandler;
(( org.anddev.andengine.engine.handler.timer.TimerHandler ) v0 ).onUpdate ( p1 ); // invoke-virtual {v0, p1}, Lorg/anddev/andengine/engine/handler/timer/TimerHandler;->onUpdate(F)V
return;
} // .end method
public void reset ( ) {
/* .locals 1 */
v0 = this.mTimerHandler;
(( org.anddev.andengine.engine.handler.timer.TimerHandler ) v0 ).reset ( ); // invoke-virtual {v0}, Lorg/anddev/andengine/engine/handler/timer/TimerHandler;->reset()V
return;
} // .end method
public void setTriggerHoldMaximumDistance ( Float p0 ) {
/* .locals 0 */
/* iput p1, p0, Lorg/anddev/andengine/input/touch/detector/HoldDetector;->mTriggerHoldMaximumDistance:F */
return;
} // .end method
public void setTriggerHoldMinimumMilliseconds ( Long p0 ) {
/* .locals 0 */
/* iput-wide p1, p0, Lorg/anddev/andengine/input/touch/detector/HoldDetector;->mTriggerHoldMinimumMilliseconds:J */
return;
} // .end method
