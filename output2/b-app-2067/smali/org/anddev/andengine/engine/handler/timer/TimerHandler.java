public class org.anddev.andengine.engine.handler.timer.TimerHandler implements org.anddev.andengine.engine.handler.IUpdateHandler {
	 /* # interfaces */
	 /* # instance fields */
	 private Boolean mAutoReset;
	 protected final org.anddev.andengine.engine.handler.timer.ITimerCallback mTimerCallback;
	 private Boolean mTimerCallbackTriggered;
	 private Float mTimerSeconds;
	 private Float mTimerSecondsElapsed;
	 /* # direct methods */
	 public org.anddev.andengine.engine.handler.timer.TimerHandler ( ) {
		 /* .locals 1 */
		 int v0 = 0; // const/4 v0, 0x0
		 /* invoke-direct {p0, p1, v0, p2}, Lorg/anddev/andengine/engine/handler/timer/TimerHandler;-><init>(FZLorg/anddev/andengine/engine/handler/timer/ITimerCallback;)V */
		 return;
	 } // .end method
	 public org.anddev.andengine.engine.handler.timer.TimerHandler ( ) {
		 /* .locals 0 */
		 /* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
		 /* iput p1, p0, Lorg/anddev/andengine/engine/handler/timer/TimerHandler;->mTimerSeconds:F */
		 /* iput-boolean p2, p0, Lorg/anddev/andengine/engine/handler/timer/TimerHandler;->mAutoReset:Z */
		 this.mTimerCallback = p3;
		 return;
	 } // .end method
	 /* # virtual methods */
	 public Float getTimerSeconds ( ) {
		 /* .locals 1 */
		 /* iget v0, p0, Lorg/anddev/andengine/engine/handler/timer/TimerHandler;->mTimerSeconds:F */
	 } // .end method
	 public Float getTimerSecondsElapsed ( ) {
		 /* .locals 1 */
		 /* iget v0, p0, Lorg/anddev/andengine/engine/handler/timer/TimerHandler;->mTimerSecondsElapsed:F */
	 } // .end method
	 public Boolean isAutoReset ( ) {
		 /* .locals 1 */
		 /* iget-boolean v0, p0, Lorg/anddev/andengine/engine/handler/timer/TimerHandler;->mAutoReset:Z */
	 } // .end method
	 public Boolean isTimerCallbackTriggered ( ) {
		 /* .locals 1 */
		 /* iget-boolean v0, p0, Lorg/anddev/andengine/engine/handler/timer/TimerHandler;->mTimerCallbackTriggered:Z */
	 } // .end method
	 public void onUpdate ( Float p0 ) {
		 /* .locals 2 */
		 /* iget-boolean v0, p0, Lorg/anddev/andengine/engine/handler/timer/TimerHandler;->mAutoReset:Z */
		 if ( v0 != null) { // if-eqz v0, :cond_2
			 /* iget v0, p0, Lorg/anddev/andengine/engine/handler/timer/TimerHandler;->mTimerSecondsElapsed:F */
			 /* add-float/2addr v0, p1 */
			 /* iput v0, p0, Lorg/anddev/andengine/engine/handler/timer/TimerHandler;->mTimerSecondsElapsed:F */
		 } // :goto_0
		 /* iget v0, p0, Lorg/anddev/andengine/engine/handler/timer/TimerHandler;->mTimerSecondsElapsed:F */
		 /* iget v1, p0, Lorg/anddev/andengine/engine/handler/timer/TimerHandler;->mTimerSeconds:F */
		 /* cmpl-float v0, v0, v1 */
		 /* if-gez v0, :cond_1 */
	 } // :cond_0
} // :goto_1
return;
} // :cond_1
/* iget v0, p0, Lorg/anddev/andengine/engine/handler/timer/TimerHandler;->mTimerSecondsElapsed:F */
/* iget v1, p0, Lorg/anddev/andengine/engine/handler/timer/TimerHandler;->mTimerSeconds:F */
/* sub-float/2addr v0, v1 */
/* iput v0, p0, Lorg/anddev/andengine/engine/handler/timer/TimerHandler;->mTimerSecondsElapsed:F */
v0 = this.mTimerCallback;
} // :cond_2
/* iget-boolean v0, p0, Lorg/anddev/andengine/engine/handler/timer/TimerHandler;->mTimerCallbackTriggered:Z */
/* if-nez v0, :cond_0 */
/* iget v0, p0, Lorg/anddev/andengine/engine/handler/timer/TimerHandler;->mTimerSecondsElapsed:F */
/* add-float/2addr v0, p1 */
/* iput v0, p0, Lorg/anddev/andengine/engine/handler/timer/TimerHandler;->mTimerSecondsElapsed:F */
/* iget v0, p0, Lorg/anddev/andengine/engine/handler/timer/TimerHandler;->mTimerSecondsElapsed:F */
/* iget v1, p0, Lorg/anddev/andengine/engine/handler/timer/TimerHandler;->mTimerSeconds:F */
/* cmpl-float v0, v0, v1 */
/* if-ltz v0, :cond_0 */
int v0 = 1; // const/4 v0, 0x1
/* iput-boolean v0, p0, Lorg/anddev/andengine/engine/handler/timer/TimerHandler;->mTimerCallbackTriggered:Z */
v0 = this.mTimerCallback;
} // .end method
public void reset ( ) {
/* .locals 1 */
int v0 = 0; // const/4 v0, 0x0
/* iput-boolean v0, p0, Lorg/anddev/andengine/engine/handler/timer/TimerHandler;->mTimerCallbackTriggered:Z */
int v0 = 0; // const/4 v0, 0x0
/* iput v0, p0, Lorg/anddev/andengine/engine/handler/timer/TimerHandler;->mTimerSecondsElapsed:F */
return;
} // .end method
public void setAutoReset ( Boolean p0 ) {
/* .locals 0 */
/* iput-boolean p1, p0, Lorg/anddev/andengine/engine/handler/timer/TimerHandler;->mAutoReset:Z */
return;
} // .end method
public void setTimerCallbackTriggered ( Boolean p0 ) {
/* .locals 0 */
/* iput-boolean p1, p0, Lorg/anddev/andengine/engine/handler/timer/TimerHandler;->mTimerCallbackTriggered:Z */
return;
} // .end method
public void setTimerSeconds ( Float p0 ) {
/* .locals 0 */
/* iput p1, p0, Lorg/anddev/andengine/engine/handler/timer/TimerHandler;->mTimerSeconds:F */
return;
} // .end method
