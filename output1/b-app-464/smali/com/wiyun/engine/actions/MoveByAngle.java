public class com.wiyun.engine.actions.MoveByAngle extends com.wiyun.engine.actions.IntervalAction {
	 /* # direct methods */
	 private com.wiyun.engine.actions.MoveByAngle ( ) {
		 /* .locals 0 */
		 /* invoke-direct {p0}, Lcom/wiyun/engine/actions/IntervalAction;-><init>()V */
		 /* invoke-direct {p0, p1, p2, p3}, Lcom/wiyun/engine/actions/MoveByAngle;->nativeInit(FII)V */
		 return;
	 } // .end method
	 private com.wiyun.engine.actions.MoveByAngle ( ) {
		 /* .locals 0 */
		 /* invoke-direct {p0, p1}, Lcom/wiyun/engine/actions/IntervalAction;-><init>(I)V */
		 return;
	 } // .end method
	 public static com.wiyun.engine.actions.Action from ( Integer p0 ) { //bridge//synthethic
		 /* .locals 1 */
		 com.wiyun.engine.actions.MoveByAngle .from ( p0 );
	 } // .end method
	 public static com.wiyun.engine.actions.MoveByAngle from ( Integer p0 ) {
		 /* .locals 1 */
		 /* if-nez p0, :cond_0 */
		 int v0 = 0; // const/4 v0, 0x0
	 } // :goto_0
} // :cond_0
/* new-instance v0, Lcom/wiyun/engine/actions/MoveByAngle; */
/* invoke-direct {v0, p0}, Lcom/wiyun/engine/actions/MoveByAngle;-><init>(I)V */
} // .end method
public static com.wiyun.engine.actions.MoveByAngle make ( Float p0, Integer p1, Integer p2 ) {
/* .locals 1 */
/* new-instance v0, Lcom/wiyun/engine/actions/MoveByAngle; */
/* invoke-direct {v0, p0, p1, p2}, Lcom/wiyun/engine/actions/MoveByAngle;-><init>(FII)V */
} // .end method
private native void nativeInit ( Float p0, Integer p1, Integer p2 ) {
} // .end method
/* # virtual methods */
public com.wiyun.engine.actions.IntervalAction copy ( ) {
/* .locals 2 */
/* new-instance v0, Lcom/wiyun/engine/actions/MoveByAngle; */
v1 = (( com.wiyun.engine.actions.MoveByAngle ) p0 ).nativeCopy ( ); // invoke-virtual {p0}, Lcom/wiyun/engine/actions/MoveByAngle;->nativeCopy()I
/* invoke-direct {v0, v1}, Lcom/wiyun/engine/actions/MoveByAngle;-><init>(I)V */
} // .end method
public java.lang.Object copy ( ) { //bridge//synthethic
/* .locals 1 */
(( com.wiyun.engine.actions.MoveByAngle ) p0 ).copy ( ); // invoke-virtual {p0}, Lcom/wiyun/engine/actions/MoveByAngle;->copy()Lcom/wiyun/engine/actions/IntervalAction;
} // .end method
public com.wiyun.engine.actions.IntervalAction reverse ( ) {
/* .locals 2 */
/* new-instance v0, Lcom/wiyun/engine/actions/MoveByAngle; */
v1 = (( com.wiyun.engine.actions.MoveByAngle ) p0 ).nativeReverse ( ); // invoke-virtual {p0}, Lcom/wiyun/engine/actions/MoveByAngle;->nativeReverse()I
/* invoke-direct {v0, v1}, Lcom/wiyun/engine/actions/MoveByAngle;-><init>(I)V */
} // .end method
