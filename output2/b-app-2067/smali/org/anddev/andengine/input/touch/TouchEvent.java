public class org.anddev.andengine.input.touch.TouchEvent {
	 /* # static fields */
	 public static final Integer ACTION_CANCEL;
	 public static final Integer ACTION_DOWN;
	 public static final Integer ACTION_MOVE;
	 public static final Integer ACTION_OUTSIDE;
	 public static final Integer ACTION_UP;
	 private static final org.anddev.andengine.input.touch.TouchEvent$TouchEventPool TOUCHEVENT_POOL;
	 /* # instance fields */
	 protected Integer mAction;
	 protected android.view.MotionEvent mMotionEvent;
	 protected Integer mPointerID;
	 protected Float mX;
	 protected Float mY;
	 /* # direct methods */
	 static org.anddev.andengine.input.touch.TouchEvent ( ) {
		 /* .locals 2 */
		 /* new-instance v0, Lorg/anddev/andengine/input/touch/TouchEvent$TouchEventPool; */
		 int v1 = 0; // const/4 v1, 0x0
		 /* invoke-direct {v0, v1}, Lorg/anddev/andengine/input/touch/TouchEvent$TouchEventPool;-><init>(Lorg/anddev/andengine/input/touch/TouchEvent$TouchEventPool;)V */
		 return;
	 } // .end method
	 public org.anddev.andengine.input.touch.TouchEvent ( ) {
		 /* .locals 0 */
		 /* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
		 return;
	 } // .end method
	 public static org.anddev.andengine.input.touch.TouchEvent obtain ( Float p0, Float p1, Integer p2, Integer p3, android.view.MotionEvent p4 ) {
		 /* .locals 6 */
		 v0 = org.anddev.andengine.input.touch.TouchEvent.TOUCHEVENT_POOL;
		 (( org.anddev.andengine.input.touch.TouchEvent$TouchEventPool ) v0 ).obtainPoolItem ( ); // invoke-virtual {v0}, Lorg/anddev/andengine/input/touch/TouchEvent$TouchEventPool;->obtainPoolItem()Ljava/lang/Object;
		 /* check-cast v0, Lorg/anddev/andengine/input/touch/TouchEvent; */
		 /* move v1, p0 */
		 /* move v2, p1 */
		 /* move v3, p2 */
		 /* move v4, p3 */
		 /* move-object v5, p4 */
		 /* invoke-direct/range {v0 ..v5}, Lorg/anddev/andengine/input/touch/TouchEvent;->set(FFIILandroid/view/MotionEvent;)V */
	 } // .end method
	 public static void recycle ( org.anddev.andengine.input.touch.TouchEvent p0 ) {
		 /* .locals 1 */
		 v0 = org.anddev.andengine.input.touch.TouchEvent.TOUCHEVENT_POOL;
		 (( org.anddev.andengine.input.touch.TouchEvent$TouchEventPool ) v0 ).recyclePoolItem ( p0 ); // invoke-virtual {v0, p0}, Lorg/anddev/andengine/input/touch/TouchEvent$TouchEventPool;->recyclePoolItem(Ljava/lang/Object;)V
		 return;
	 } // .end method
	 private void set ( Float p0, Float p1, Integer p2, Integer p3, android.view.MotionEvent p4 ) {
		 /* .locals 0 */
		 /* iput p1, p0, Lorg/anddev/andengine/input/touch/TouchEvent;->mX:F */
		 /* iput p2, p0, Lorg/anddev/andengine/input/touch/TouchEvent;->mY:F */
		 /* iput p3, p0, Lorg/anddev/andengine/input/touch/TouchEvent;->mAction:I */
		 /* iput p4, p0, Lorg/anddev/andengine/input/touch/TouchEvent;->mPointerID:I */
		 this.mMotionEvent = p5;
		 return;
	 } // .end method
	 /* # virtual methods */
	 public Integer getAction ( ) {
		 /* .locals 1 */
		 /* iget v0, p0, Lorg/anddev/andengine/input/touch/TouchEvent;->mAction:I */
	 } // .end method
	 public android.view.MotionEvent getMotionEvent ( ) {
		 /* .locals 1 */
		 v0 = this.mMotionEvent;
	 } // .end method
	 public Integer getPointerID ( ) {
		 /* .locals 1 */
		 /* iget v0, p0, Lorg/anddev/andengine/input/touch/TouchEvent;->mPointerID:I */
	 } // .end method
	 public Float getX ( ) {
		 /* .locals 1 */
		 /* iget v0, p0, Lorg/anddev/andengine/input/touch/TouchEvent;->mX:F */
	 } // .end method
	 public Float getY ( ) {
		 /* .locals 1 */
		 /* iget v0, p0, Lorg/anddev/andengine/input/touch/TouchEvent;->mY:F */
	 } // .end method
	 public Boolean isActionCancel ( ) {
		 /* .locals 2 */
		 /* iget v0, p0, Lorg/anddev/andengine/input/touch/TouchEvent;->mAction:I */
		 int v1 = 3; // const/4 v1, 0x3
		 /* if-ne v0, v1, :cond_0 */
		 int v0 = 1; // const/4 v0, 0x1
	 } // :goto_0
} // :cond_0
int v0 = 0; // const/4 v0, 0x0
} // .end method
public Boolean isActionDown ( ) {
/* .locals 1 */
/* iget v0, p0, Lorg/anddev/andengine/input/touch/TouchEvent;->mAction:I */
/* if-nez v0, :cond_0 */
int v0 = 1; // const/4 v0, 0x1
} // :goto_0
} // :cond_0
int v0 = 0; // const/4 v0, 0x0
} // .end method
public Boolean isActionMove ( ) {
/* .locals 2 */
/* iget v0, p0, Lorg/anddev/andengine/input/touch/TouchEvent;->mAction:I */
int v1 = 2; // const/4 v1, 0x2
/* if-ne v0, v1, :cond_0 */
int v0 = 1; // const/4 v0, 0x1
} // :goto_0
} // :cond_0
int v0 = 0; // const/4 v0, 0x0
} // .end method
public Boolean isActionOutside ( ) {
/* .locals 2 */
/* iget v0, p0, Lorg/anddev/andengine/input/touch/TouchEvent;->mAction:I */
int v1 = 4; // const/4 v1, 0x4
/* if-ne v0, v1, :cond_0 */
int v0 = 1; // const/4 v0, 0x1
} // :goto_0
} // :cond_0
int v0 = 0; // const/4 v0, 0x0
} // .end method
public Boolean isActionUp ( ) {
/* .locals 2 */
int v1 = 1; // const/4 v1, 0x1
/* iget v0, p0, Lorg/anddev/andengine/input/touch/TouchEvent;->mAction:I */
/* if-ne v0, v1, :cond_0 */
/* move v0, v1 */
} // :goto_0
} // :cond_0
int v0 = 0; // const/4 v0, 0x0
} // .end method
public void offset ( Float p0, Float p1 ) {
/* .locals 1 */
/* iget v0, p0, Lorg/anddev/andengine/input/touch/TouchEvent;->mX:F */
/* add-float/2addr v0, p1 */
/* iput v0, p0, Lorg/anddev/andengine/input/touch/TouchEvent;->mX:F */
/* iget v0, p0, Lorg/anddev/andengine/input/touch/TouchEvent;->mY:F */
/* add-float/2addr v0, p2 */
/* iput v0, p0, Lorg/anddev/andengine/input/touch/TouchEvent;->mY:F */
return;
} // .end method
public void recycle ( ) {
/* .locals 1 */
v0 = org.anddev.andengine.input.touch.TouchEvent.TOUCHEVENT_POOL;
(( org.anddev.andengine.input.touch.TouchEvent$TouchEventPool ) v0 ).recyclePoolItem ( p0 ); // invoke-virtual {v0, p0}, Lorg/anddev/andengine/input/touch/TouchEvent$TouchEventPool;->recyclePoolItem(Ljava/lang/Object;)V
return;
} // .end method
public void set ( Float p0, Float p1 ) {
/* .locals 0 */
/* iput p1, p0, Lorg/anddev/andengine/input/touch/TouchEvent;->mX:F */
/* iput p2, p0, Lorg/anddev/andengine/input/touch/TouchEvent;->mY:F */
return;
} // .end method
