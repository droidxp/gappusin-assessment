public class com.wiyun.engine.actions.OrbitCamera extends com.wiyun.engine.actions.CameraAction {
	 /* # direct methods */
	 private com.wiyun.engine.actions.OrbitCamera ( ) {
		 /* .locals 0 */
		 /* invoke-direct {p0}, Lcom/wiyun/engine/actions/CameraAction;-><init>()V */
		 /* invoke-direct/range {p0 ..p7}, Lcom/wiyun/engine/actions/OrbitCamera;->nativeInit(FFFFFFF)V */
		 return;
	 } // .end method
	 private com.wiyun.engine.actions.OrbitCamera ( ) {
		 /* .locals 0 */
		 /* invoke-direct {p0, p1}, Lcom/wiyun/engine/actions/CameraAction;-><init>(I)V */
		 return;
	 } // .end method
	 public static com.wiyun.engine.actions.Action from ( Integer p0 ) { //bridge//synthethic
		 /* .locals 1 */
		 com.wiyun.engine.actions.OrbitCamera .from ( p0 );
	 } // .end method
	 public static com.wiyun.engine.actions.OrbitCamera from ( Integer p0 ) {
		 /* .locals 1 */
		 /* if-nez p0, :cond_0 */
		 int v0 = 0; // const/4 v0, 0x0
	 } // :goto_0
} // :cond_0
/* new-instance v0, Lcom/wiyun/engine/actions/OrbitCamera; */
/* invoke-direct {v0, p0}, Lcom/wiyun/engine/actions/OrbitCamera;-><init>(I)V */
} // .end method
public static com.wiyun.engine.actions.OrbitCamera make ( Float p0, Float p1, Float p2, Float p3, Float p4, Float p5, Float p6 ) {
/* .locals 8 */
/* new-instance v0, Lcom/wiyun/engine/actions/OrbitCamera; */
/* move v1, p0 */
/* move v2, p1 */
/* move v3, p2 */
/* move v4, p3 */
/* move v5, p4 */
/* move v6, p5 */
/* move v7, p6 */
/* invoke-direct/range {v0 ..v7}, Lcom/wiyun/engine/actions/OrbitCamera;-><init>(FFFFFFF)V */
} // .end method
private native void nativeInit ( Float p0, Float p1, Float p2, Float p3, Float p4, Float p5, Float p6 ) {
} // .end method
/* # virtual methods */
public com.wiyun.engine.actions.IntervalAction copy ( ) {
/* .locals 2 */
/* new-instance v0, Lcom/wiyun/engine/actions/OrbitCamera; */
v1 = (( com.wiyun.engine.actions.OrbitCamera ) p0 ).nativeCopy ( ); // invoke-virtual {p0}, Lcom/wiyun/engine/actions/OrbitCamera;->nativeCopy()I
/* invoke-direct {v0, v1}, Lcom/wiyun/engine/actions/OrbitCamera;-><init>(I)V */
} // .end method
public java.lang.Object copy ( ) { //bridge//synthethic
/* .locals 1 */
(( com.wiyun.engine.actions.OrbitCamera ) p0 ).copy ( ); // invoke-virtual {p0}, Lcom/wiyun/engine/actions/OrbitCamera;->copy()Lcom/wiyun/engine/actions/IntervalAction;
} // .end method
