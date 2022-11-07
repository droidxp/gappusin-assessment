public class com.wiyun.engine.actions.Show extends com.wiyun.engine.actions.InstantAction {
	 /* .source "Show.java" */
	 /* # direct methods */
	 protected com.wiyun.engine.actions.Show ( ) {
		 /* .locals 0 */
		 /* .prologue */
		 /* .line 12 */
		 /* invoke-direct {p0}, Lcom/wiyun/engine/actions/InstantAction;-><init>()V */
		 /* .line 13 */
		 /* invoke-direct {p0}, Lcom/wiyun/engine/actions/Show;->nativeInit()V */
		 /* .line 14 */
		 return;
	 } // .end method
	 protected com.wiyun.engine.actions.Show ( ) {
		 /* .locals 0 */
		 /* .param p1, "pointer" # I */
		 /* .prologue */
		 /* .line 21 */
		 /* invoke-direct {p0, p1}, Lcom/wiyun/engine/actions/InstantAction;-><init>(I)V */
		 /* .line 22 */
		 return;
	 } // .end method
	 public static com.wiyun.engine.actions.Action from ( Integer p0 ) { //bridge//synthethic
		 /* .locals 1 */
		 /* .prologue */
		 /* .line 1 */
		 com.wiyun.engine.actions.Show .from ( p0 );
	 } // .end method
	 public static com.wiyun.engine.actions.Show from ( Integer p0 ) {
		 /* .locals 1 */
		 /* .param p0, "pointer" # I */
		 /* .prologue */
		 /* .line 17 */
		 /* if-nez p0, :cond_0 */
		 int v0 = 0; // const/4 v0, 0x0
	 } // :goto_0
} // :cond_0
/* new-instance v0, Lcom/wiyun/engine/actions/Show; */
/* invoke-direct {v0, p0}, Lcom/wiyun/engine/actions/Show;-><init>(I)V */
} // .end method
public static com.wiyun.engine.actions.Show make ( ) {
/* .locals 1 */
/* .prologue */
/* .line 27 */
/* new-instance v0, Lcom/wiyun/engine/actions/Show; */
/* invoke-direct {v0}, Lcom/wiyun/engine/actions/Show;-><init>()V */
} // .end method
private native void nativeInit ( ) {
} // .end method
/* # virtual methods */
public com.wiyun.engine.actions.InstantAction copy ( ) {
/* .locals 2 */
/* .prologue */
/* .line 32 */
/* new-instance v0, Lcom/wiyun/engine/actions/Show; */
v1 = (( com.wiyun.engine.actions.Show ) p0 ).nativeCopy ( ); // invoke-virtual {p0}, Lcom/wiyun/engine/actions/Show;->nativeCopy()I
/* invoke-direct {v0, v1}, Lcom/wiyun/engine/actions/Show;-><init>(I)V */
} // .end method
public java.lang.Object copy ( ) { //bridge//synthethic
/* .locals 1 */
/* .prologue */
/* .line 1 */
(( com.wiyun.engine.actions.Show ) p0 ).copy ( ); // invoke-virtual {p0}, Lcom/wiyun/engine/actions/Show;->copy()Lcom/wiyun/engine/actions/InstantAction;
} // .end method
public com.wiyun.engine.actions.InstantAction reverse ( ) {
/* .locals 2 */
/* .prologue */
/* .line 37 */
/* new-instance v0, Lcom/wiyun/engine/actions/Hide; */
v1 = (( com.wiyun.engine.actions.Show ) p0 ).nativeReverse ( ); // invoke-virtual {p0}, Lcom/wiyun/engine/actions/Show;->nativeReverse()I
/* invoke-direct {v0, v1}, Lcom/wiyun/engine/actions/Hide;-><init>(I)V */
} // .end method
