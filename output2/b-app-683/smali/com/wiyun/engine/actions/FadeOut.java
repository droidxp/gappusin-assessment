public class com.wiyun.engine.actions.FadeOut extends com.wiyun.engine.actions.IntervalAction {
	 /* .source "FadeOut.java" */
	 /* # direct methods */
	 protected com.wiyun.engine.actions.FadeOut ( ) {
		 /* .locals 0 */
		 /* .param p1, "duration" # F */
		 /* .param p2, "includeChildren" # Z */
		 /* .prologue */
		 /* .line 48 */
		 /* invoke-direct {p0}, Lcom/wiyun/engine/actions/IntervalAction;-><init>()V */
		 /* .line 49 */
		 /* invoke-direct {p0, p1, p2}, Lcom/wiyun/engine/actions/FadeOut;->nativeInit(FZ)V */
		 /* .line 50 */
		 return;
	 } // .end method
	 protected com.wiyun.engine.actions.FadeOut ( ) {
		 /* .locals 0 */
		 /* .param p1, "pointer" # I */
		 /* .prologue */
		 /* .line 57 */
		 /* invoke-direct {p0, p1}, Lcom/wiyun/engine/actions/IntervalAction;-><init>(I)V */
		 /* .line 58 */
		 return;
	 } // .end method
	 public static com.wiyun.engine.actions.Action from ( Integer p0 ) { //bridge//synthethic
		 /* .locals 1 */
		 /* .prologue */
		 /* .line 1 */
		 com.wiyun.engine.actions.FadeOut .from ( p0 );
	 } // .end method
	 public static com.wiyun.engine.actions.FadeOut from ( Integer p0 ) {
		 /* .locals 1 */
		 /* .param p0, "pointer" # I */
		 /* .prologue */
		 /* .line 53 */
		 /* if-nez p0, :cond_0 */
		 int v0 = 0; // const/4 v0, 0x0
	 } // :goto_0
} // :cond_0
/* new-instance v0, Lcom/wiyun/engine/actions/FadeOut; */
/* invoke-direct {v0, p0}, Lcom/wiyun/engine/actions/FadeOut;-><init>(I)V */
} // .end method
public static com.wiyun.engine.actions.FadeOut make ( Float p0 ) {
/* .locals 2 */
/* .param p0, "duration" # F */
/* .prologue */
/* .line 26 */
/* new-instance v0, Lcom/wiyun/engine/actions/FadeOut; */
int v1 = 0; // const/4 v1, 0x0
/* invoke-direct {v0, p0, v1}, Lcom/wiyun/engine/actions/FadeOut;-><init>(FZ)V */
} // .end method
public static com.wiyun.engine.actions.FadeOut make ( Float p0, Boolean p1 ) {
/* .locals 1 */
/* .param p0, "duration" # F */
/* .param p1, "includeChildren" # Z */
/* .prologue */
/* .line 45 */
/* new-instance v0, Lcom/wiyun/engine/actions/FadeOut; */
/* invoke-direct {v0, p0, p1}, Lcom/wiyun/engine/actions/FadeOut;-><init>(FZ)V */
} // .end method
private native void nativeInit ( Float p0, Boolean p1 ) {
} // .end method
/* # virtual methods */
public com.wiyun.engine.actions.IntervalAction copy ( ) {
/* .locals 2 */
/* .prologue */
/* .line 64 */
/* new-instance v0, Lcom/wiyun/engine/actions/FadeOut; */
v1 = (( com.wiyun.engine.actions.FadeOut ) p0 ).nativeCopy ( ); // invoke-virtual {p0}, Lcom/wiyun/engine/actions/FadeOut;->nativeCopy()I
/* invoke-direct {v0, v1}, Lcom/wiyun/engine/actions/FadeOut;-><init>(I)V */
} // .end method
public java.lang.Object copy ( ) { //bridge//synthethic
/* .locals 1 */
/* .prologue */
/* .line 1 */
(( com.wiyun.engine.actions.FadeOut ) p0 ).copy ( ); // invoke-virtual {p0}, Lcom/wiyun/engine/actions/FadeOut;->copy()Lcom/wiyun/engine/actions/IntervalAction;
} // .end method
public com.wiyun.engine.actions.IntervalAction reverse ( ) {
/* .locals 2 */
/* .prologue */
/* .line 69 */
/* new-instance v0, Lcom/wiyun/engine/actions/FadeIn; */
v1 = (( com.wiyun.engine.actions.FadeOut ) p0 ).nativeReverse ( ); // invoke-virtual {p0}, Lcom/wiyun/engine/actions/FadeOut;->nativeReverse()I
/* invoke-direct {v0, v1}, Lcom/wiyun/engine/actions/FadeIn;-><init>(I)V */
} // .end method
