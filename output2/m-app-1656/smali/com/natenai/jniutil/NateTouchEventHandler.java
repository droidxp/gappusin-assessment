public abstract class com.natenai.jniutil.NateTouchEventHandler {
	 /* .source "NateTouchEventHandler.java" */
	 /* # annotations */
	 /* .annotation system Ldalvik/annotation/MemberClasses; */
	 /* value = { */
	 /* Lcom/natenai/jniutil/NateTouchEventHandler$CupcakeTouchEventHandler;, */
	 /* Lcom/natenai/jniutil/NateTouchEventHandler$EclairTouchEventHandler;, */
	 /* Lcom/natenai/jniutil/NateTouchEventHandler$OnTouchEventListener; */
	 /* } */
} // .end annotation
/* # static fields */
public static final Integer TOUCHES_BEGAN;
public static final Integer TOUCHES_ENDED;
public static final Integer TOUCHES_MOVED;
public static final Integer TOUCHES_STATIONARY;
/* # instance fields */
com.natenai.jniutil.NateTouchEventHandler$OnTouchEventListener mTouchListener;
/* # direct methods */
public com.natenai.jniutil.NateTouchEventHandler ( ) {
	 /* .locals 0 */
	 /* .prologue */
	 /* .line 7 */
	 /* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
	 return;
} // .end method
public static com.natenai.jniutil.NateTouchEventHandler newInstance ( com.natenai.jniutil.NateTouchEventHandler$OnTouchEventListener p0 ) {
	 /* .locals 5 */
	 /* .param p0, "touchListener" # Lcom/natenai/jniutil/NateTouchEventHandler$OnTouchEventListener; */
	 /* .prologue */
	 /* .line 18 */
	 v2 = android.os.Build$VERSION.SDK;
	 v1 = 	 java.lang.Integer .parseInt ( v2 );
	 /* .line 20 */
	 /* .local v1, "sdkVersion":I */
	 int v0 = 0; // const/4 v0, 0x0
	 /* .line 21 */
	 /* .local v0, "handler":Lcom/natenai/jniutil/NateTouchEventHandler; */
	 int v2 = 5; // const/4 v2, 0x5
	 /* if-ge v1, v2, :cond_0 */
	 /* .line 22 */
	 /* new-instance v0, Lcom/natenai/jniutil/NateTouchEventHandler$CupcakeTouchEventHandler; */
} // .end local v0 # "handler":Lcom/natenai/jniutil/NateTouchEventHandler;
int v2 = 0; // const/4 v2, 0x0
/* invoke-direct {v0, v2}, Lcom/natenai/jniutil/NateTouchEventHandler$CupcakeTouchEventHandler;-><init>(Lcom/natenai/jniutil/NateTouchEventHandler$CupcakeTouchEventHandler;)V */
/* .line 27 */
/* .restart local v0 # "handler":Lcom/natenai/jniutil/NateTouchEventHandler; */
} // :goto_0
this.mTouchListener = p0;
/* .line 29 */
final String v2 = "NateTouchEventHandler"; // const-string v2, "NateTouchEventHandler"
/* new-instance v3, Ljava/lang/StringBuilder; */
final String v4 = "Created new "; // const-string v4, "Created new "
/* invoke-direct {v3, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V */
(( java.lang.Object ) v0 ).getClass ( ); // invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;
(( java.lang.StringBuilder ) v3 ).append ( v4 ); // invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v3 ).toString ( ); // invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
android.util.Log .d ( v2,v3 );
/* .line 31 */
/* .line 24 */
} // :cond_0
/* new-instance v0, Lcom/natenai/jniutil/NateTouchEventHandler$EclairTouchEventHandler; */
} // .end local v0 # "handler":Lcom/natenai/jniutil/NateTouchEventHandler;
/* invoke-direct {v0}, Lcom/natenai/jniutil/NateTouchEventHandler$EclairTouchEventHandler;-><init>()V */
/* .restart local v0 # "handler":Lcom/natenai/jniutil/NateTouchEventHandler; */
} // .end method
/* # virtual methods */
public abstract Boolean onTouchEvent ( android.view.MotionEvent p0 ) {
} // .end method
