public class com.wiyun.engine.actions.ease.EaseExponentialIn extends com.wiyun.engine.actions.ease.EaseAction {
	 /* # direct methods */
	 protected com.wiyun.engine.actions.ease.EaseExponentialIn ( ) {
		 /* .locals 1 */
		 /* invoke-direct {p0}, Lcom/wiyun/engine/actions/ease/EaseAction;-><init>()V */
		 int v0 = 0; // const/4 v0, 0x0
		 /* invoke-direct {p0, v0}, Lcom/wiyun/engine/actions/ease/EaseExponentialIn;->nativeInit(Lcom/wiyun/engine/actions/IntervalAction;)V */
		 return;
	 } // .end method
	 protected com.wiyun.engine.actions.ease.EaseExponentialIn ( ) {
		 /* .locals 0 */
		 /* invoke-direct {p0, p1}, Lcom/wiyun/engine/actions/ease/EaseAction;-><init>(I)V */
		 return;
	 } // .end method
	 private com.wiyun.engine.actions.ease.EaseExponentialIn ( ) {
		 /* .locals 0 */
		 /* invoke-direct {p0}, Lcom/wiyun/engine/actions/ease/EaseAction;-><init>()V */
		 /* invoke-direct {p0, p1}, Lcom/wiyun/engine/actions/ease/EaseExponentialIn;->nativeInit(Lcom/wiyun/engine/actions/IntervalAction;)V */
		 return;
	 } // .end method
	 public static com.wiyun.engine.actions.Action from ( Integer p0 ) { //bridge//synthethic
		 /* .locals 1 */
		 com.wiyun.engine.actions.ease.EaseExponentialIn .from ( p0 );
	 } // .end method
	 public static com.wiyun.engine.actions.ease.EaseExponentialIn from ( Integer p0 ) {
		 /* .locals 1 */
		 /* if-nez p0, :cond_0 */
		 int v0 = 0; // const/4 v0, 0x0
	 } // :goto_0
} // :cond_0
/* new-instance v0, Lcom/wiyun/engine/actions/ease/EaseExponentialIn; */
/* invoke-direct {v0, p0}, Lcom/wiyun/engine/actions/ease/EaseExponentialIn;-><init>(I)V */
} // .end method
public static com.wiyun.engine.actions.ease.EaseExponentialIn make ( ) {
/* .locals 1 */
/* new-instance v0, Lcom/wiyun/engine/actions/ease/EaseExponentialIn; */
/* invoke-direct {v0}, Lcom/wiyun/engine/actions/ease/EaseExponentialIn;-><init>()V */
} // .end method
public static com.wiyun.engine.actions.ease.EaseExponentialIn make ( com.wiyun.engine.actions.IntervalAction p0 ) {
/* .locals 1 */
/* new-instance v0, Lcom/wiyun/engine/actions/ease/EaseExponentialIn; */
/* invoke-direct {v0, p0}, Lcom/wiyun/engine/actions/ease/EaseExponentialIn;-><init>(Lcom/wiyun/engine/actions/IntervalAction;)V */
} // .end method
private native void nativeInit ( com.wiyun.engine.actions.IntervalAction p0 ) {
} // .end method
/* # virtual methods */
public final com.wiyun.engine.actions.ease.EaseAction a ( ) {
/* .locals 2 */
/* new-instance v0, Lcom/wiyun/engine/actions/ease/EaseExponentialIn; */
v1 = (( com.wiyun.engine.actions.ease.EaseExponentialIn ) p0 ).nativeCopy ( ); // invoke-virtual {p0}, Lcom/wiyun/engine/actions/ease/EaseExponentialIn;->nativeCopy()I
/* invoke-direct {v0, v1}, Lcom/wiyun/engine/actions/ease/EaseExponentialIn;-><init>(I)V */
} // .end method
public final com.wiyun.engine.actions.ease.EaseAction b ( ) {
/* .locals 2 */
/* new-instance v0, Lcom/wiyun/engine/actions/ease/EaseExponentialOut; */
v1 = (( com.wiyun.engine.actions.ease.EaseExponentialIn ) p0 ).nativeReverse ( ); // invoke-virtual {p0}, Lcom/wiyun/engine/actions/ease/EaseExponentialIn;->nativeReverse()I
/* invoke-direct {v0, v1}, Lcom/wiyun/engine/actions/ease/EaseExponentialOut;-><init>(I)V */
} // .end method
public java.lang.Object copy ( ) { //synthethic
/* .locals 1 */
(( com.wiyun.engine.actions.ease.EaseExponentialIn ) p0 ).a ( ); // invoke-virtual {p0}, Lcom/wiyun/engine/actions/ease/EaseExponentialIn;->a()Lcom/wiyun/engine/actions/ease/EaseAction;
} // .end method
