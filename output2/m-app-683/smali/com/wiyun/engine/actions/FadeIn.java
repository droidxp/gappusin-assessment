public class com.wiyun.engine.actions.FadeIn extends com.wiyun.engine.actions.IntervalAction {
	 /* .source "FadeIn.java" */
	 /* # direct methods */
	 protected com.wiyun.engine.actions.FadeIn ( ) {
		 /* .locals 0 */
		 /* .param p1, "duration" # F */
		 /* .param p2, "includeChildren" # Z */
		 /* .prologue */
		 /* .line 47 */
		 /* invoke-direct {p0}, Lcom/wiyun/engine/actions/IntervalAction;-><init>()V */
		 /* .line 48 */
		 /* invoke-direct {p0, p1, p2}, Lcom/wiyun/engine/actions/FadeIn;->nativeInit(FZ)V */
		 /* .line 49 */
		 return;
	 } // .end method
	 protected com.wiyun.engine.actions.FadeIn ( ) {
		 /* .locals 0 */
		 /* .param p1, "pointer" # I */
		 /* .prologue */
		 /* .line 56 */
		 /* invoke-direct {p0, p1}, Lcom/wiyun/engine/actions/IntervalAction;-><init>(I)V */
		 /* .line 57 */
		 return;
	 } // .end method
	 public static com.wiyun.engine.actions.Action from ( Integer p0 ) { //bridge//synthethic
		 /* .locals 1 */
		 /* .prologue */
		 /* .line 1 */
		 com.wiyun.engine.actions.FadeIn .from ( p0 );
	 } // .end method
	 public static com.wiyun.engine.actions.FadeIn from ( Integer p0 ) {
		 /* .locals 1 */
		 /* .param p0, "pointer" # I */
		 /* .prologue */
		 /* .line 52 */
		 /* if-nez p0, :cond_0 */
		 int v0 = 0; // const/4 v0, 0x0
	 } // :goto_0
} // :cond_0
/* new-instance v0, Lcom/wiyun/engine/actions/FadeIn; */
/* invoke-direct {v0, p0}, Lcom/wiyun/engine/actions/FadeIn;-><init>(I)V */
} // .end method
public static com.wiyun.engine.actions.FadeIn make ( Float p0 ) {
/* .locals 2 */
/* .param p0, "duration" # F */
/* .prologue */
/* .line 25 */
/* new-instance v0, Lcom/wiyun/engine/actions/FadeIn; */
int v1 = 0; // const/4 v1, 0x0
/* invoke-direct {v0, p0, v1}, Lcom/wiyun/engine/actions/FadeIn;-><init>(FZ)V */
} // .end method
public static com.wiyun.engine.actions.FadeIn make ( Float p0, Boolean p1 ) {
/* .locals 1 */
/* .param p0, "duration" # F */
/* .param p1, "includeChildren" # Z */
/* .prologue */
/* .line 44 */
/* new-instance v0, Lcom/wiyun/engine/actions/FadeIn; */
/* invoke-direct {v0, p0, p1}, Lcom/wiyun/engine/actions/FadeIn;-><init>(FZ)V */
} // .end method
private native void nativeInit ( Float p0, Boolean p1 ) {
} // .end method
/* # virtual methods */
public com.wiyun.engine.actions.IntervalAction copy ( ) {
/* .locals 2 */
/* .prologue */
/* .line 63 */
/* new-instance v0, Lcom/wiyun/engine/actions/FadeIn; */
v1 = (( com.wiyun.engine.actions.FadeIn ) p0 ).nativeCopy ( ); // invoke-virtual {p0}, Lcom/wiyun/engine/actions/FadeIn;->nativeCopy()I
/* invoke-direct {v0, v1}, Lcom/wiyun/engine/actions/FadeIn;-><init>(I)V */
} // .end method
public java.lang.Object copy ( ) { //bridge//synthethic
/* .locals 1 */
/* .prologue */
/* .line 1 */
(( com.wiyun.engine.actions.FadeIn ) p0 ).copy ( ); // invoke-virtual {p0}, Lcom/wiyun/engine/actions/FadeIn;->copy()Lcom/wiyun/engine/actions/IntervalAction;
} // .end method
public com.wiyun.engine.actions.IntervalAction reverse ( ) {
/* .locals 2 */
/* .prologue */
/* .line 68 */
/* new-instance v0, Lcom/wiyun/engine/actions/FadeOut; */
v1 = (( com.wiyun.engine.actions.FadeIn ) p0 ).nativeReverse ( ); // invoke-virtual {p0}, Lcom/wiyun/engine/actions/FadeIn;->nativeReverse()I
/* invoke-direct {v0, v1}, Lcom/wiyun/engine/actions/FadeOut;-><init>(I)V */
} // .end method
