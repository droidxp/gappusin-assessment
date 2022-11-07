public class com.wiyun.engine.actions.Place extends com.wiyun.engine.actions.InstantAction {
	 /* .source "Place.java" */
	 /* # direct methods */
	 protected com.wiyun.engine.actions.Place ( ) {
		 /* .locals 0 */
		 /* .param p1, "x" # F */
		 /* .param p2, "y" # F */
		 /* .prologue */
		 /* .line 31 */
		 /* invoke-direct {p0}, Lcom/wiyun/engine/actions/InstantAction;-><init>()V */
		 /* .line 32 */
		 /* invoke-direct {p0, p1, p2}, Lcom/wiyun/engine/actions/Place;->nativeInit(FF)V */
		 /* .line 33 */
		 return;
	 } // .end method
	 protected com.wiyun.engine.actions.Place ( ) {
		 /* .locals 0 */
		 /* .param p1, "pointer" # I */
		 /* .prologue */
		 /* .line 46 */
		 /* invoke-direct {p0, p1}, Lcom/wiyun/engine/actions/InstantAction;-><init>(I)V */
		 /* .line 47 */
		 return;
	 } // .end method
	 public static com.wiyun.engine.actions.Action from ( Integer p0 ) { //bridge//synthethic
		 /* .locals 1 */
		 /* .prologue */
		 /* .line 1 */
		 com.wiyun.engine.actions.Place .from ( p0 );
	 } // .end method
	 public static com.wiyun.engine.actions.Place from ( Integer p0 ) {
		 /* .locals 1 */
		 /* .param p0, "pointer" # I */
		 /* .prologue */
		 /* .line 42 */
		 /* if-nez p0, :cond_0 */
		 int v0 = 0; // const/4 v0, 0x0
	 } // :goto_0
} // :cond_0
/* new-instance v0, Lcom/wiyun/engine/actions/Place; */
/* invoke-direct {v0, p0}, Lcom/wiyun/engine/actions/Place;-><init>(I)V */
} // .end method
public static com.wiyun.engine.actions.Place make ( Float p0, Float p1 ) {
/* .locals 1 */
/* .param p0, "x" # F */
/* .param p1, "y" # F */
/* .prologue */
/* .line 28 */
/* new-instance v0, Lcom/wiyun/engine/actions/Place; */
/* invoke-direct {v0, p0, p1}, Lcom/wiyun/engine/actions/Place;-><init>(FF)V */
} // .end method
private native void nativeInit ( Float p0, Float p1 ) {
} // .end method
/* # virtual methods */
public com.wiyun.engine.actions.InstantAction copy ( ) { //bridge//synthethic
/* .locals 1 */
/* .prologue */
/* .line 1 */
(( com.wiyun.engine.actions.Place ) p0 ).copy ( ); // invoke-virtual {p0}, Lcom/wiyun/engine/actions/Place;->copy()Lcom/wiyun/engine/actions/Place;
} // .end method
public com.wiyun.engine.actions.Place copy ( ) {
/* .locals 2 */
/* .prologue */
/* .line 53 */
/* new-instance v0, Lcom/wiyun/engine/actions/Place; */
v1 = (( com.wiyun.engine.actions.Place ) p0 ).nativeCopy ( ); // invoke-virtual {p0}, Lcom/wiyun/engine/actions/Place;->nativeCopy()I
/* invoke-direct {v0, v1}, Lcom/wiyun/engine/actions/Place;-><init>(I)V */
} // .end method
public java.lang.Object copy ( ) { //bridge//synthethic
/* .locals 1 */
/* .prologue */
/* .line 1 */
(( com.wiyun.engine.actions.Place ) p0 ).copy ( ); // invoke-virtual {p0}, Lcom/wiyun/engine/actions/Place;->copy()Lcom/wiyun/engine/actions/Place;
} // .end method
public com.wiyun.engine.actions.InstantAction reverse ( ) {
/* .locals 2 */
/* .prologue */
/* .line 58 */
/* new-instance v0, Ljava/lang/UnsupportedOperationException; */
final String v1 = "Place doesn\'t have reverse action"; // const-string v1, "Place doesn\'t have reverse action"
/* invoke-direct {v0, v1}, Ljava/lang/UnsupportedOperationException;-><init>(Ljava/lang/String;)V */
/* throw v0 */
} // .end method
