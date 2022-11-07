public class com.wiyun.engine.actions.ScaleBy extends com.wiyun.engine.actions.IntervalAction {
	 /* .source "ScaleBy.java" */
	 /* # direct methods */
	 protected com.wiyun.engine.actions.ScaleBy ( ) {
		 /* .locals 0 */
		 /* .param p1, "duration" # F */
		 /* .param p2, "scale" # F */
		 /* .prologue */
		 /* .line 55 */
		 /* invoke-direct {p0, p1, p2, p2}, Lcom/wiyun/engine/actions/ScaleBy;-><init>(FFF)V */
		 /* .line 56 */
		 return;
	 } // .end method
	 protected com.wiyun.engine.actions.ScaleBy ( ) {
		 /* .locals 0 */
		 /* .param p1, "duration" # F */
		 /* .param p2, "scaleX" # F */
		 /* .param p3, "scaleY" # F */
		 /* .prologue */
		 /* .line 58 */
		 /* invoke-direct {p0}, Lcom/wiyun/engine/actions/IntervalAction;-><init>()V */
		 /* .line 59 */
		 /* invoke-direct {p0, p1, p2, p3}, Lcom/wiyun/engine/actions/ScaleBy;->nativeInit(FFF)V */
		 /* .line 60 */
		 return;
	 } // .end method
	 protected com.wiyun.engine.actions.ScaleBy ( ) {
		 /* .locals 0 */
		 /* .param p1, "pointer" # I */
		 /* .prologue */
		 /* .line 67 */
		 /* invoke-direct {p0, p1}, Lcom/wiyun/engine/actions/IntervalAction;-><init>(I)V */
		 /* .line 68 */
		 return;
	 } // .end method
	 public static com.wiyun.engine.actions.Action from ( Integer p0 ) { //bridge//synthethic
		 /* .locals 1 */
		 /* .prologue */
		 /* .line 1 */
		 com.wiyun.engine.actions.ScaleBy .from ( p0 );
	 } // .end method
	 public static com.wiyun.engine.actions.ScaleBy from ( Integer p0 ) {
		 /* .locals 1 */
		 /* .param p0, "pointer" # I */
		 /* .prologue */
		 /* .line 63 */
		 /* if-nez p0, :cond_0 */
		 int v0 = 0; // const/4 v0, 0x0
	 } // :goto_0
} // :cond_0
/* new-instance v0, Lcom/wiyun/engine/actions/ScaleBy; */
/* invoke-direct {v0, p0}, Lcom/wiyun/engine/actions/ScaleBy;-><init>(I)V */
} // .end method
public static com.wiyun.engine.actions.ScaleBy make ( Float p0, Float p1 ) {
/* .locals 1 */
/* .param p0, "duration" # F */
/* .param p1, "scale" # F */
/* .prologue */
/* .line 30 */
/* new-instance v0, Lcom/wiyun/engine/actions/ScaleBy; */
/* invoke-direct {v0, p0, p1, p1}, Lcom/wiyun/engine/actions/ScaleBy;-><init>(FFF)V */
} // .end method
public static com.wiyun.engine.actions.ScaleBy make ( Float p0, Float p1, Float p2 ) {
/* .locals 1 */
/* .param p0, "duration" # F */
/* .param p1, "scaleX" # F */
/* .param p2, "scaleY" # F */
/* .prologue */
/* .line 51 */
/* new-instance v0, Lcom/wiyun/engine/actions/ScaleBy; */
/* invoke-direct {v0, p0, p1, p2}, Lcom/wiyun/engine/actions/ScaleBy;-><init>(FFF)V */
} // .end method
private native void nativeInit ( Float p0, Float p1, Float p2 ) {
} // .end method
/* # virtual methods */
public com.wiyun.engine.actions.IntervalAction copy ( ) {
/* .locals 2 */
/* .prologue */
/* .line 74 */
/* new-instance v0, Lcom/wiyun/engine/actions/ScaleBy; */
v1 = (( com.wiyun.engine.actions.ScaleBy ) p0 ).nativeCopy ( ); // invoke-virtual {p0}, Lcom/wiyun/engine/actions/ScaleBy;->nativeCopy()I
/* invoke-direct {v0, v1}, Lcom/wiyun/engine/actions/ScaleBy;-><init>(I)V */
} // .end method
public java.lang.Object copy ( ) { //bridge//synthethic
/* .locals 1 */
/* .prologue */
/* .line 1 */
(( com.wiyun.engine.actions.ScaleBy ) p0 ).copy ( ); // invoke-virtual {p0}, Lcom/wiyun/engine/actions/ScaleBy;->copy()Lcom/wiyun/engine/actions/IntervalAction;
} // .end method
public com.wiyun.engine.actions.IntervalAction reverse ( ) {
/* .locals 2 */
/* .prologue */
/* .line 79 */
/* new-instance v0, Lcom/wiyun/engine/actions/ScaleBy; */
v1 = (( com.wiyun.engine.actions.ScaleBy ) p0 ).nativeReverse ( ); // invoke-virtual {p0}, Lcom/wiyun/engine/actions/ScaleBy;->nativeReverse()I
/* invoke-direct {v0, v1}, Lcom/wiyun/engine/actions/ScaleBy;-><init>(I)V */
} // .end method
