public class com.wiyun.engine.actions.ease.EaseInOut extends com.wiyun.engine.actions.ease.EaseRateAction {
	 /* # direct methods */
	 private com.wiyun.engine.actions.ease.EaseInOut ( ) {
		 /* .locals 1 */
		 /* invoke-direct {p0}, Lcom/wiyun/engine/actions/ease/EaseRateAction;-><init>()V */
		 int v0 = 0; // const/4 v0, 0x0
		 /* invoke-direct {p0, v0, p1}, Lcom/wiyun/engine/actions/ease/EaseInOut;->nativeInit(Lcom/wiyun/engine/actions/IntervalAction;F)V */
		 return;
	 } // .end method
	 private com.wiyun.engine.actions.ease.EaseInOut ( ) {
		 /* .locals 0 */
		 /* invoke-direct {p0, p1}, Lcom/wiyun/engine/actions/ease/EaseRateAction;-><init>(I)V */
		 return;
	 } // .end method
	 private com.wiyun.engine.actions.ease.EaseInOut ( ) {
		 /* .locals 0 */
		 /* invoke-direct {p0}, Lcom/wiyun/engine/actions/ease/EaseRateAction;-><init>()V */
		 /* invoke-direct {p0, p1, p2}, Lcom/wiyun/engine/actions/ease/EaseInOut;->nativeInit(Lcom/wiyun/engine/actions/IntervalAction;F)V */
		 return;
	 } // .end method
	 public static com.wiyun.engine.actions.Action from ( Integer p0 ) { //bridge//synthethic
		 /* .locals 1 */
		 com.wiyun.engine.actions.ease.EaseInOut .from ( p0 );
	 } // .end method
	 public static com.wiyun.engine.actions.ease.EaseInOut from ( Integer p0 ) {
		 /* .locals 1 */
		 /* if-nez p0, :cond_0 */
		 int v0 = 0; // const/4 v0, 0x0
	 } // :goto_0
} // :cond_0
/* new-instance v0, Lcom/wiyun/engine/actions/ease/EaseInOut; */
/* invoke-direct {v0, p0}, Lcom/wiyun/engine/actions/ease/EaseInOut;-><init>(I)V */
} // .end method
public static com.wiyun.engine.actions.ease.EaseInOut make ( Float p0 ) {
/* .locals 1 */
/* new-instance v0, Lcom/wiyun/engine/actions/ease/EaseInOut; */
/* invoke-direct {v0, p0}, Lcom/wiyun/engine/actions/ease/EaseInOut;-><init>(F)V */
} // .end method
public static com.wiyun.engine.actions.ease.EaseInOut make ( com.wiyun.engine.actions.IntervalAction p0, Float p1 ) {
/* .locals 1 */
/* new-instance v0, Lcom/wiyun/engine/actions/ease/EaseInOut; */
/* invoke-direct {v0, p0, p1}, Lcom/wiyun/engine/actions/ease/EaseInOut;-><init>(Lcom/wiyun/engine/actions/IntervalAction;F)V */
} // .end method
private native void nativeInit ( com.wiyun.engine.actions.IntervalAction p0, Float p1 ) {
} // .end method
/* # virtual methods */
public final com.wiyun.engine.actions.ease.EaseAction a ( ) {
/* .locals 2 */
/* new-instance v0, Lcom/wiyun/engine/actions/ease/EaseInOut; */
v1 = (( com.wiyun.engine.actions.ease.EaseInOut ) p0 ).nativeCopy ( ); // invoke-virtual {p0}, Lcom/wiyun/engine/actions/ease/EaseInOut;->nativeCopy()I
/* invoke-direct {v0, v1}, Lcom/wiyun/engine/actions/ease/EaseInOut;-><init>(I)V */
} // .end method
public final com.wiyun.engine.actions.ease.EaseAction b ( ) {
/* .locals 2 */
/* new-instance v0, Lcom/wiyun/engine/actions/ease/EaseInOut; */
v1 = (( com.wiyun.engine.actions.ease.EaseInOut ) p0 ).nativeReverse ( ); // invoke-virtual {p0}, Lcom/wiyun/engine/actions/ease/EaseInOut;->nativeReverse()I
/* invoke-direct {v0, v1}, Lcom/wiyun/engine/actions/ease/EaseInOut;-><init>(I)V */
} // .end method
public java.lang.Object copy ( ) { //synthethic
/* .locals 1 */
(( com.wiyun.engine.actions.ease.EaseInOut ) p0 ).a ( ); // invoke-virtual {p0}, Lcom/wiyun/engine/actions/ease/EaseInOut;->a()Lcom/wiyun/engine/actions/ease/EaseAction;
} // .end method
