public class com.wiyun.engine.actions.SkewBy extends com.wiyun.engine.actions.IntervalAction {
	 /* .source "SkewBy.java" */
	 /* # direct methods */
	 protected com.wiyun.engine.actions.SkewBy ( ) {
		 /* .locals 0 */
		 /* .param p1, "duration" # F */
		 /* .param p2, "skewX" # F */
		 /* .param p3, "skewY" # F */
		 /* .prologue */
		 /* .line 33 */
		 /* invoke-direct {p0}, Lcom/wiyun/engine/actions/IntervalAction;-><init>()V */
		 /* .line 34 */
		 /* invoke-direct {p0, p1, p2, p3}, Lcom/wiyun/engine/actions/SkewBy;->nativeInit(FFF)V */
		 /* .line 35 */
		 return;
	 } // .end method
	 protected com.wiyun.engine.actions.SkewBy ( ) {
		 /* .locals 0 */
		 /* .param p1, "pointer" # I */
		 /* .prologue */
		 /* .line 44 */
		 /* invoke-direct {p0, p1}, Lcom/wiyun/engine/actions/IntervalAction;-><init>(I)V */
		 /* .line 45 */
		 return;
	 } // .end method
	 public static com.wiyun.engine.actions.Action from ( Integer p0 ) { //bridge//synthethic
		 /* .locals 1 */
		 /* .prologue */
		 /* .line 1 */
		 com.wiyun.engine.actions.SkewBy .from ( p0 );
	 } // .end method
	 public static com.wiyun.engine.actions.SkewBy from ( Integer p0 ) {
		 /* .locals 1 */
		 /* .param p0, "pointer" # I */
		 /* .prologue */
		 /* .line 40 */
		 /* if-nez p0, :cond_0 */
		 int v0 = 0; // const/4 v0, 0x0
	 } // :goto_0
} // :cond_0
/* new-instance v0, Lcom/wiyun/engine/actions/SkewBy; */
/* invoke-direct {v0, p0}, Lcom/wiyun/engine/actions/SkewBy;-><init>(I)V */
} // .end method
public static com.wiyun.engine.actions.SkewBy make ( Float p0, Float p1, Float p2 ) {
/* .locals 1 */
/* .param p0, "duration" # F */
/* .param p1, "skewX" # F */
/* .param p2, "skewY" # F */
/* .prologue */
/* .line 30 */
/* new-instance v0, Lcom/wiyun/engine/actions/SkewBy; */
/* invoke-direct {v0, p0, p1, p2}, Lcom/wiyun/engine/actions/SkewBy;-><init>(FFF)V */
} // .end method
private native void nativeInit ( Float p0, Float p1, Float p2 ) {
} // .end method
/* # virtual methods */
public com.wiyun.engine.actions.IntervalAction copy ( ) {
/* .locals 2 */
/* .prologue */
/* .line 49 */
/* new-instance v0, Lcom/wiyun/engine/actions/SkewBy; */
v1 = (( com.wiyun.engine.actions.SkewBy ) p0 ).nativeCopy ( ); // invoke-virtual {p0}, Lcom/wiyun/engine/actions/SkewBy;->nativeCopy()I
/* invoke-direct {v0, v1}, Lcom/wiyun/engine/actions/SkewBy;-><init>(I)V */
} // .end method
public java.lang.Object copy ( ) { //bridge//synthethic
/* .locals 1 */
/* .prologue */
/* .line 1 */
(( com.wiyun.engine.actions.SkewBy ) p0 ).copy ( ); // invoke-virtual {p0}, Lcom/wiyun/engine/actions/SkewBy;->copy()Lcom/wiyun/engine/actions/IntervalAction;
} // .end method
public com.wiyun.engine.actions.IntervalAction reverse ( ) {
/* .locals 2 */
/* .prologue */
/* .line 54 */
/* new-instance v0, Lcom/wiyun/engine/actions/SkewBy; */
v1 = (( com.wiyun.engine.actions.SkewBy ) p0 ).nativeReverse ( ); // invoke-virtual {p0}, Lcom/wiyun/engine/actions/SkewBy;->nativeReverse()I
/* invoke-direct {v0, v1}, Lcom/wiyun/engine/actions/SkewBy;-><init>(I)V */
} // .end method
