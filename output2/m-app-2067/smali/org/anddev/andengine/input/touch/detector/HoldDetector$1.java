class org.anddev.andengine.input.touch.detector.HoldDetector$1 implements org.anddev.andengine.engine.handler.timer.ITimerCallback {
	 /* # interfaces */
	 /* # instance fields */
	 final org.anddev.andengine.input.touch.detector.HoldDetector this$0; //synthetic
	 /* # direct methods */
	 org.anddev.andengine.input.touch.detector.HoldDetector$1 ( ) {
		 /* .locals 0 */
		 this.this$0 = p1;
		 /* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
		 return;
	 } // .end method
	 /* # virtual methods */
	 public void onTimePassed ( org.anddev.andengine.engine.handler.timer.TimerHandler p0 ) {
		 /* .locals 1 */
		 v0 = this.this$0;
		 (( org.anddev.andengine.input.touch.detector.HoldDetector ) v0 ).fireListener ( ); // invoke-virtual {v0}, Lorg/anddev/andengine/input/touch/detector/HoldDetector;->fireListener()V
		 return;
	 } // .end method
