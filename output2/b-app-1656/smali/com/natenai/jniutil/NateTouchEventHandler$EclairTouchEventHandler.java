class com.natenai.jniutil.NateTouchEventHandler$EclairTouchEventHandler extends com.natenai.jniutil.NateTouchEventHandler {
	 /* .source "NateTouchEventHandler.java" */
	 /* # annotations */
	 /* .annotation system Ldalvik/annotation/EnclosingClass; */
	 /* value = Lcom/natenai/jniutil/NateTouchEventHandler; */
} // .end annotation
/* .annotation system Ldalvik/annotation/InnerClass; */
/* accessFlags = 0xa */
/* name = "EclairTouchEventHandler" */
} // .end annotation
/* .annotation system Ldalvik/annotation/MemberClasses; */
/* value = { */
/* Lcom/natenai/jniutil/NateTouchEventHandler$EclairTouchEventHandler$TouchPoint; */
/* } */
} // .end annotation
/* # instance fields */
public final Integer MAX_TOUCHES;
public final com.natenai.jniutil.NateTouchEventHandler$EclairTouchEventHandler$TouchPoint mPoints;
/* # direct methods */
public com.natenai.jniutil.NateTouchEventHandler$EclairTouchEventHandler ( ) {
/* .locals 4 */
/* .prologue */
/* const/16 v3, 0xc */
/* .line 122 */
/* invoke-direct {p0}, Lcom/natenai/jniutil/NateTouchEventHandler;-><init>()V */
/* .line 119 */
/* iput v3, p0, Lcom/natenai/jniutil/NateTouchEventHandler$EclairTouchEventHandler;->MAX_TOUCHES:I */
/* .line 120 */
/* new-array v1, v3, [Lcom/natenai/jniutil/NateTouchEventHandler$EclairTouchEventHandler$TouchPoint; */
this.mPoints = v1;
/* .line 123 */
int v0 = 0; // const/4 v0, 0x0
/* .local v0, "i":I */
} // :goto_0
/* if-lt v0, v3, :cond_0 */
/* .line 125 */
return;
/* .line 124 */
} // :cond_0
v1 = this.mPoints;
/* new-instance v2, Lcom/natenai/jniutil/NateTouchEventHandler$EclairTouchEventHandler$TouchPoint; */
/* invoke-direct {v2, p0}, Lcom/natenai/jniutil/NateTouchEventHandler$EclairTouchEventHandler$TouchPoint;-><init>(Lcom/natenai/jniutil/NateTouchEventHandler$EclairTouchEventHandler;)V */
/* aput-object v2, v1, v0 */
/* .line 123 */
/* add-int/lit8 v0, v0, 0x1 */
} // .end method
/* # virtual methods */
public Boolean onTouchEvent ( android.view.MotionEvent p0 ) {
/* .locals 10 */
/* .param p1, "event" # Landroid/view/MotionEvent; */
/* .prologue */
int v7 = 1; // const/4 v7, 0x1
/* .line 131 */
int v1 = 0; // const/4 v1, 0x0
/* .local v1, "i":I */
} // :goto_0
v6 = (( android.view.MotionEvent ) p1 ).getPointerCount ( ); // invoke-virtual {p1}, Landroid/view/MotionEvent;->getPointerCount()I
/* if-lt v1, v6, :cond_0 */
/* .line 184 */
/* .line 132 */
} // :cond_0
v4 = (( android.view.MotionEvent ) p1 ).getX ( v1 ); // invoke-virtual {p1, v1}, Landroid/view/MotionEvent;->getX(I)F
/* .local v4, "x":F */
v5 = (( android.view.MotionEvent ) p1 ).getY ( v1 ); // invoke-virtual {p1, v1}, Landroid/view/MotionEvent;->getY(I)F
/* .line 134 */
/* .local v5, "y":F */
v2 = (( android.view.MotionEvent ) p1 ).getPointerId ( v1 ); // invoke-virtual {p1, v1}, Landroid/view/MotionEvent;->getPointerId(I)I
/* .line 135 */
/* .local v2, "pid":I */
int v3 = 0; // const/4 v3, 0x0
/* .line 137 */
/* .local v3, "type":I */
v6 = (( android.view.MotionEvent ) p1 ).getAction ( ); // invoke-virtual {p1}, Landroid/view/MotionEvent;->getAction()I
/* and-int/lit16 v0, v6, 0xff */
/* .line 139 */
/* .local v0, "action":I */
/* packed-switch v0, :pswitch_data_0 */
/* .line 149 */
} // :goto_1
/* :pswitch_0 */
/* if-nez v3, :cond_2 */
/* .line 151 */
v6 = this.mPoints;
/* aget-object v6, v6, v2 */
/* iget-boolean v6, v6, Lcom/natenai/jniutil/NateTouchEventHandler$EclairTouchEventHandler$TouchPoint;->isPressed:Z */
if ( v6 != null) { // if-eqz v6, :cond_1
/* .line 155 */
v6 = this.mTouchListener;
v8 = this.mPoints;
/* aget-object v8, v8, v2 */
/* iget v8, v8, Lcom/natenai/jniutil/NateTouchEventHandler$EclairTouchEventHandler$TouchPoint;->x:F */
v9 = this.mPoints;
/* aget-object v9, v9, v2 */
/* iget v9, v9, Lcom/natenai/jniutil/NateTouchEventHandler$EclairTouchEventHandler$TouchPoint;->y:F */
/* .line 158 */
} // :cond_1
v6 = this.mTouchListener;
/* .line 179 */
} // :goto_2
v6 = this.mPoints;
/* aget-object v6, v6, v2 */
/* iput v4, v6, Lcom/natenai/jniutil/NateTouchEventHandler$EclairTouchEventHandler$TouchPoint;->x:F */
/* .line 180 */
v6 = this.mPoints;
/* aget-object v6, v6, v2 */
/* iput v5, v6, Lcom/natenai/jniutil/NateTouchEventHandler$EclairTouchEventHandler$TouchPoint;->y:F */
/* .line 181 */
v6 = this.mPoints;
/* aget-object v8, v6, v2 */
int v6 = 3; // const/4 v6, 0x3
/* if-eq v3, v6, :cond_5 */
/* move v6, v7 */
} // :goto_3
/* iput-boolean v6, v8, Lcom/natenai/jniutil/NateTouchEventHandler$EclairTouchEventHandler$TouchPoint;->isPressed:Z */
/* .line 131 */
/* add-int/lit8 v1, v1, 0x1 */
/* .line 141 */
/* :pswitch_1 */
int v3 = 1; // const/4 v3, 0x1
/* .line 142 */
/* :pswitch_2 */
int v3 = 3; // const/4 v3, 0x3
/* .line 143 */
/* :pswitch_3 */
int v3 = 3; // const/4 v3, 0x3
/* .line 144 */
/* :pswitch_4 */
int v3 = 1; // const/4 v3, 0x1
/* .line 146 */
/* :pswitch_5 */
int v3 = 3; // const/4 v3, 0x3
/* .line 160 */
} // :cond_2
/* if-ne v3, v7, :cond_4 */
/* .line 162 */
v6 = this.mPoints;
/* aget-object v6, v6, v2 */
/* iget-boolean v6, v6, Lcom/natenai/jniutil/NateTouchEventHandler$EclairTouchEventHandler$TouchPoint;->isPressed:Z */
if ( v6 != null) { // if-eqz v6, :cond_3
/* .line 164 */
v6 = this.mTouchListener;
v8 = this.mPoints;
/* aget-object v8, v8, v2 */
/* iget v8, v8, Lcom/natenai/jniutil/NateTouchEventHandler$EclairTouchEventHandler$TouchPoint;->x:F */
v9 = this.mPoints;
/* aget-object v9, v9, v2 */
/* iget v9, v9, Lcom/natenai/jniutil/NateTouchEventHandler$EclairTouchEventHandler$TouchPoint;->y:F */
/* .line 170 */
} // :cond_3
v6 = this.mTouchListener;
v8 = this.mPoints;
/* aget-object v8, v8, v2 */
/* iget v8, v8, Lcom/natenai/jniutil/NateTouchEventHandler$EclairTouchEventHandler$TouchPoint;->x:F */
v9 = this.mPoints;
/* aget-object v9, v9, v2 */
/* iget v9, v9, Lcom/natenai/jniutil/NateTouchEventHandler$EclairTouchEventHandler$TouchPoint;->y:F */
/* .line 171 */
v6 = this.mTouchListener;
/* .line 176 */
} // :cond_4
v6 = this.mTouchListener;
v8 = this.mPoints;
/* aget-object v8, v8, v2 */
/* iget v8, v8, Lcom/natenai/jniutil/NateTouchEventHandler$EclairTouchEventHandler$TouchPoint;->x:F */
v9 = this.mPoints;
/* aget-object v9, v9, v2 */
/* iget v9, v9, Lcom/natenai/jniutil/NateTouchEventHandler$EclairTouchEventHandler$TouchPoint;->y:F */
/* .line 181 */
} // :cond_5
int v6 = 0; // const/4 v6, 0x0
/* .line 139 */
/* nop */
/* :pswitch_data_0 */
/* .packed-switch 0x1 */
/* :pswitch_2 */
/* :pswitch_1 */
/* :pswitch_3 */
/* :pswitch_4 */
/* :pswitch_0 */
/* :pswitch_5 */
} // .end packed-switch
} // .end method
