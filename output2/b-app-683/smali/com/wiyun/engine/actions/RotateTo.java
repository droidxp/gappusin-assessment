public class com.wiyun.engine.actions.RotateTo extends com.wiyun.engine.actions.IntervalAction {
	 /* .source "RotateTo.java" */
	 /* # direct methods */
	 protected com.wiyun.engine.actions.RotateTo ( ) {
		 /* .locals 0 */
		 /* .param p1, "duration" # F */
		 /* .param p2, "startAngle" # F */
		 /* .param p3, "endAngle" # F */
		 /* .prologue */
		 /* .line 31 */
		 /* invoke-direct {p0}, Lcom/wiyun/engine/actions/IntervalAction;-><init>()V */
		 /* .line 32 */
		 /* invoke-direct {p0, p1, p2, p3}, Lcom/wiyun/engine/actions/RotateTo;->nativeInit(FFF)V */
		 /* .line 33 */
		 return;
	 } // .end method
	 protected com.wiyun.engine.actions.RotateTo ( ) {
		 /* .locals 0 */
		 /* .param p1, "pointer" # I */
		 /* .prologue */
		 /* .line 40 */
		 /* invoke-direct {p0, p1}, Lcom/wiyun/engine/actions/IntervalAction;-><init>(I)V */
		 /* .line 41 */
		 return;
	 } // .end method
	 public static com.wiyun.engine.actions.Action from ( Integer p0 ) { //bridge//synthethic
		 /* .locals 1 */
		 /* .prologue */
		 /* .line 1 */
		 com.wiyun.engine.actions.RotateTo .from ( p0 );
	 } // .end method
	 public static com.wiyun.engine.actions.RotateTo from ( Integer p0 ) {
		 /* .locals 1 */
		 /* .param p0, "pointer" # I */
		 /* .prologue */
		 /* .line 36 */
		 /* if-nez p0, :cond_0 */
		 int v0 = 0; // const/4 v0, 0x0
	 } // :goto_0
} // :cond_0
/* new-instance v0, Lcom/wiyun/engine/actions/RotateTo; */
/* invoke-direct {v0, p0}, Lcom/wiyun/engine/actions/RotateTo;-><init>(I)V */
} // .end method
public static com.wiyun.engine.actions.RotateTo make ( Float p0, Float p1, Float p2 ) {
/* .locals 1 */
/* .param p0, "duration" # F */
/* .param p1, "startAngle" # F */
/* .param p2, "endAngle" # F */
/* .prologue */
/* .line 28 */
/* new-instance v0, Lcom/wiyun/engine/actions/RotateTo; */
/* invoke-direct {v0, p0, p1, p2}, Lcom/wiyun/engine/actions/RotateTo;-><init>(FFF)V */
} // .end method
private native void nativeInit ( Float p0, Float p1, Float p2 ) {
} // .end method
/* # virtual methods */
public com.wiyun.engine.actions.IntervalAction copy ( ) {
/* .locals 2 */
/* .prologue */
/* .line 47 */
/* new-instance v0, Lcom/wiyun/engine/actions/RotateTo; */
v1 = (( com.wiyun.engine.actions.RotateTo ) p0 ).nativeCopy ( ); // invoke-virtual {p0}, Lcom/wiyun/engine/actions/RotateTo;->nativeCopy()I
/* invoke-direct {v0, v1}, Lcom/wiyun/engine/actions/RotateTo;-><init>(I)V */
} // .end method
public java.lang.Object copy ( ) { //bridge//synthethic
/* .locals 1 */
/* .prologue */
/* .line 1 */
(( com.wiyun.engine.actions.RotateTo ) p0 ).copy ( ); // invoke-virtual {p0}, Lcom/wiyun/engine/actions/RotateTo;->copy()Lcom/wiyun/engine/actions/IntervalAction;
} // .end method
public com.wiyun.engine.actions.IntervalAction reverse ( ) {
/* .locals 2 */
/* .prologue */
/* .line 52 */
/* new-instance v0, Lcom/wiyun/engine/actions/RotateTo; */
v1 = (( com.wiyun.engine.actions.RotateTo ) p0 ).nativeReverse ( ); // invoke-virtual {p0}, Lcom/wiyun/engine/actions/RotateTo;->nativeReverse()I
/* invoke-direct {v0, v1}, Lcom/wiyun/engine/actions/RotateTo;-><init>(I)V */
} // .end method
