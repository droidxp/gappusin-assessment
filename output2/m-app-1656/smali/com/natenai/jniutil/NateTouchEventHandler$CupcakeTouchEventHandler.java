class com.natenai.jniutil.NateTouchEventHandler$CupcakeTouchEventHandler extends com.natenai.jniutil.NateTouchEventHandler {
	 /* .source "NateTouchEventHandler.java" */
	 /* # annotations */
	 /* .annotation system Ldalvik/annotation/EnclosingClass; */
	 /* value = Lcom/natenai/jniutil/NateTouchEventHandler; */
} // .end annotation
/* .annotation system Ldalvik/annotation/InnerClass; */
/* accessFlags = 0xa */
/* name = "CupcakeTouchEventHandler" */
} // .end annotation
/* # static fields */
private static Boolean mIsPressed;
private static Float mX;
private static Float mY;
/* # direct methods */
static com.natenai.jniutil.NateTouchEventHandler$CupcakeTouchEventHandler ( ) {
/* .locals 1 */
/* .prologue */
int v0 = 0; // const/4 v0, 0x0
/* .line 46 */
/* .line 47 */
/* .line 48 */
int v0 = 0; // const/4 v0, 0x0
com.natenai.jniutil.NateTouchEventHandler$CupcakeTouchEventHandler.mIsPressed = (v0!= 0);
/* .line 45 */
return;
} // .end method
private com.natenai.jniutil.NateTouchEventHandler$CupcakeTouchEventHandler ( ) {
/* .locals 0 */
/* .prologue */
/* .line 45 */
/* invoke-direct {p0}, Lcom/natenai/jniutil/NateTouchEventHandler;-><init>()V */
return;
} // .end method
 com.natenai.jniutil.NateTouchEventHandler$CupcakeTouchEventHandler ( ) { //synthethic
/* .locals 0 */
/* .prologue */
/* .line 45 */
/* invoke-direct {p0}, Lcom/natenai/jniutil/NateTouchEventHandler$CupcakeTouchEventHandler;-><init>()V */
return;
} // .end method
/* # virtual methods */
public Boolean onTouchEvent ( android.view.MotionEvent p0 ) {
/* .locals 8 */
/* .param p1, "event" # Landroid/view/MotionEvent; */
/* .prologue */
int v5 = 1; // const/4 v5, 0x1
/* .line 54 */
int v1 = 0; // const/4 v1, 0x0
/* .line 55 */
/* .local v1, "type":I */
v2 = (( android.view.MotionEvent ) p1 ).getX ( ); // invoke-virtual {p1}, Landroid/view/MotionEvent;->getX()F
/* .local v2, "x":F */
v3 = (( android.view.MotionEvent ) p1 ).getY ( ); // invoke-virtual {p1}, Landroid/view/MotionEvent;->getY()F
/* .line 56 */
/* .local v3, "y":F */
v0 = (( android.view.MotionEvent ) p1 ).getAction ( ); // invoke-virtual {p1}, Landroid/view/MotionEvent;->getAction()I
/* .line 57 */
/* .local v0, "action":I */
/* packed-switch v0, :pswitch_data_0 */
/* .line 64 */
} // :goto_0
/* if-nez v1, :cond_1 */
/* .line 66 */
/* sget-boolean v4, Lcom/natenai/jniutil/NateTouchEventHandler$CupcakeTouchEventHandler;->mIsPressed:Z */
if ( v4 != null) { // if-eqz v4, :cond_0
/* .line 70 */
v4 = this.mTouchListener;
/* .line 73 */
} // :cond_0
v4 = this.mTouchListener;
/* .line 94 */
} // :goto_1
/* .line 95 */
/* .line 96 */
int v4 = 3; // const/4 v4, 0x3
/* if-eq v1, v4, :cond_4 */
/* move v4, v5 */
} // :goto_2
com.natenai.jniutil.NateTouchEventHandler$CupcakeTouchEventHandler.mIsPressed = (v4!= 0);
/* .line 98 */
/* .line 58 */
/* :pswitch_0 */
int v1 = 1; // const/4 v1, 0x1
/* .line 59 */
/* :pswitch_1 */
int v1 = 3; // const/4 v1, 0x3
/* .line 60 */
/* :pswitch_2 */
int v1 = 3; // const/4 v1, 0x3
/* .line 61 */
/* :pswitch_3 */
int v1 = 1; // const/4 v1, 0x1
/* .line 75 */
} // :cond_1
/* if-ne v1, v5, :cond_3 */
/* .line 77 */
/* sget-boolean v4, Lcom/natenai/jniutil/NateTouchEventHandler$CupcakeTouchEventHandler;->mIsPressed:Z */
if ( v4 != null) { // if-eqz v4, :cond_2
/* .line 79 */
v4 = this.mTouchListener;
/* .line 85 */
} // :cond_2
v4 = this.mTouchListener;
/* .line 86 */
v4 = this.mTouchListener;
/* .line 91 */
} // :cond_3
v4 = this.mTouchListener;
/* .line 96 */
} // :cond_4
int v4 = 0; // const/4 v4, 0x0
/* .line 57 */
/* nop */
/* :pswitch_data_0 */
/* .packed-switch 0x1 */
/* :pswitch_1 */
/* :pswitch_0 */
/* :pswitch_2 */
/* :pswitch_3 */
} // .end packed-switch
} // .end method
