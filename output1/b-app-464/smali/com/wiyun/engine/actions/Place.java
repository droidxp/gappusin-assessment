public class com.wiyun.engine.actions.Place extends com.wiyun.engine.actions.InstantAction {
	 /* # direct methods */
	 private com.wiyun.engine.actions.Place ( ) {
		 /* .locals 0 */
		 /* invoke-direct {p0}, Lcom/wiyun/engine/actions/InstantAction;-><init>()V */
		 /* invoke-direct {p0, p1, p2}, Lcom/wiyun/engine/actions/Place;->nativeInit(FF)V */
		 return;
	 } // .end method
	 private com.wiyun.engine.actions.Place ( ) {
		 /* .locals 0 */
		 /* invoke-direct {p0, p1}, Lcom/wiyun/engine/actions/InstantAction;-><init>(I)V */
		 return;
	 } // .end method
	 private com.wiyun.engine.actions.Place c ( ) {
		 /* .locals 2 */
		 /* new-instance v0, Lcom/wiyun/engine/actions/Place; */
		 v1 = 		 (( com.wiyun.engine.actions.Place ) p0 ).nativeCopy ( ); // invoke-virtual {p0}, Lcom/wiyun/engine/actions/Place;->nativeCopy()I
		 /* invoke-direct {v0, v1}, Lcom/wiyun/engine/actions/Place;-><init>(I)V */
	 } // .end method
	 public static com.wiyun.engine.actions.Action from ( Integer p0 ) { //bridge//synthethic
		 /* .locals 1 */
		 com.wiyun.engine.actions.Place .from ( p0 );
	 } // .end method
	 public static com.wiyun.engine.actions.Place from ( Integer p0 ) {
		 /* .locals 1 */
		 /* if-nez p0, :cond_0 */
		 int v0 = 0; // const/4 v0, 0x0
	 } // :goto_0
} // :cond_0
/* new-instance v0, Lcom/wiyun/engine/actions/Place; */
/* invoke-direct {v0, p0}, Lcom/wiyun/engine/actions/Place;-><init>(I)V */
} // .end method
public static com.wiyun.engine.actions.Place make ( Float p0, Float p1 ) {
/* .locals 1 */
/* new-instance v0, Lcom/wiyun/engine/actions/Place; */
/* invoke-direct {v0, p0, p1}, Lcom/wiyun/engine/actions/Place;-><init>(FF)V */
} // .end method
private native void nativeInit ( Float p0, Float p1 ) {
} // .end method
/* # virtual methods */
public final com.wiyun.engine.actions.InstantAction a ( ) {
/* .locals 2 */
/* new-instance v0, Ljava/lang/UnsupportedOperationException; */
final String v1 = "Place doesn\'t have reverse action"; // const-string v1, "Place doesn\'t have reverse action"
/* invoke-direct {v0, v1}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V */
/* throw v0 */
} // .end method
public final com.wiyun.engine.actions.InstantAction b ( ) { //synthethic
/* .locals 1 */
/* invoke-direct {p0}, Lcom/wiyun/engine/actions/Place;->c()Lcom/wiyun/engine/actions/Place; */
} // .end method
public java.lang.Object copy ( ) { //synthethic
/* .locals 1 */
/* invoke-direct {p0}, Lcom/wiyun/engine/actions/Place;->c()Lcom/wiyun/engine/actions/Place; */
} // .end method
