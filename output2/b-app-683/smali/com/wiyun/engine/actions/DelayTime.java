public class com.wiyun.engine.actions.DelayTime extends com.wiyun.engine.actions.IntervalAction {
	 /* .source "DelayTime.java" */
	 /* # direct methods */
	 protected com.wiyun.engine.actions.DelayTime ( ) {
		 /* .locals 0 */
		 /* .param p1, "duration" # F */
		 /* .prologue */
		 /* .line 39 */
		 /* invoke-direct {p0}, Lcom/wiyun/engine/actions/IntervalAction;-><init>()V */
		 /* .line 40 */
		 /* invoke-direct {p0, p1}, Lcom/wiyun/engine/actions/DelayTime;->nativeInit(F)V */
		 /* .line 41 */
		 return;
	 } // .end method
	 protected com.wiyun.engine.actions.DelayTime ( ) {
		 /* .locals 0 */
		 /* .param p1, "pointer" # I */
		 /* .prologue */
		 /* .line 34 */
		 /* invoke-direct {p0, p1}, Lcom/wiyun/engine/actions/IntervalAction;-><init>(I)V */
		 /* .line 35 */
		 return;
	 } // .end method
	 public static com.wiyun.engine.actions.Action from ( Integer p0 ) { //bridge//synthethic
		 /* .locals 1 */
		 /* .prologue */
		 /* .line 1 */
		 com.wiyun.engine.actions.DelayTime .from ( p0 );
	 } // .end method
	 public static com.wiyun.engine.actions.DelayTime from ( Integer p0 ) {
		 /* .locals 1 */
		 /* .param p0, "pointer" # I */
		 /* .prologue */
		 /* .line 30 */
		 /* if-nez p0, :cond_0 */
		 int v0 = 0; // const/4 v0, 0x0
	 } // :goto_0
} // :cond_0
/* new-instance v0, Lcom/wiyun/engine/actions/DelayTime; */
/* invoke-direct {v0, p0}, Lcom/wiyun/engine/actions/DelayTime;-><init>(I)V */
} // .end method
public static com.wiyun.engine.actions.DelayTime make ( Float p0 ) {
/* .locals 1 */
/* .param p0, "duration" # F */
/* .prologue */
/* .line 26 */
/* new-instance v0, Lcom/wiyun/engine/actions/DelayTime; */
/* invoke-direct {v0, p0}, Lcom/wiyun/engine/actions/DelayTime;-><init>(F)V */
} // .end method
private native void nativeInit ( Float p0 ) {
} // .end method
/* # virtual methods */
public com.wiyun.engine.actions.IntervalAction copy ( ) {
/* .locals 2 */
/* .prologue */
/* .line 49 */
/* new-instance v0, Lcom/wiyun/engine/actions/DelayTime; */
v1 = (( com.wiyun.engine.actions.DelayTime ) p0 ).nativeCopy ( ); // invoke-virtual {p0}, Lcom/wiyun/engine/actions/DelayTime;->nativeCopy()I
/* invoke-direct {v0, v1}, Lcom/wiyun/engine/actions/DelayTime;-><init>(I)V */
} // .end method
public java.lang.Object copy ( ) { //bridge//synthethic
/* .locals 1 */
/* .prologue */
/* .line 1 */
(( com.wiyun.engine.actions.DelayTime ) p0 ).copy ( ); // invoke-virtual {p0}, Lcom/wiyun/engine/actions/DelayTime;->copy()Lcom/wiyun/engine/actions/IntervalAction;
} // .end method
public com.wiyun.engine.actions.IntervalAction reverse ( ) {
/* .locals 2 */
/* .prologue */
/* .line 54 */
/* new-instance v0, Lcom/wiyun/engine/actions/DelayTime; */
v1 = (( com.wiyun.engine.actions.DelayTime ) p0 ).nativeReverse ( ); // invoke-virtual {p0}, Lcom/wiyun/engine/actions/DelayTime;->nativeReverse()I
/* invoke-direct {v0, v1}, Lcom/wiyun/engine/actions/DelayTime;-><init>(I)V */
} // .end method
public void update ( Float p0 ) {
/* .locals 0 */
/* .param p1, "duration" # F */
/* .prologue */
/* .line 45 */
return;
} // .end method
