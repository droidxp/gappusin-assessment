public class com.wiyun.engine.actions.ToggleVisibility extends com.wiyun.engine.actions.InstantAction {
	 /* .source "ToggleVisibility.java" */
	 /* # direct methods */
	 protected com.wiyun.engine.actions.ToggleVisibility ( ) {
		 /* .locals 0 */
		 /* .prologue */
		 /* .line 23 */
		 /* invoke-direct {p0}, Lcom/wiyun/engine/actions/InstantAction;-><init>()V */
		 /* .line 24 */
		 /* invoke-direct {p0}, Lcom/wiyun/engine/actions/ToggleVisibility;->nativeInit()V */
		 /* .line 25 */
		 return;
	 } // .end method
	 protected com.wiyun.engine.actions.ToggleVisibility ( ) {
		 /* .locals 0 */
		 /* .param p1, "pointer" # I */
		 /* .prologue */
		 /* .line 20 */
		 /* invoke-direct {p0, p1}, Lcom/wiyun/engine/actions/InstantAction;-><init>(I)V */
		 /* .line 21 */
		 return;
	 } // .end method
	 public static com.wiyun.engine.actions.Action from ( Integer p0 ) { //bridge//synthethic
		 /* .locals 1 */
		 /* .prologue */
		 /* .line 1 */
		 com.wiyun.engine.actions.ToggleVisibility .from ( p0 );
	 } // .end method
	 public static com.wiyun.engine.actions.ToggleVisibility from ( Integer p0 ) {
		 /* .locals 1 */
		 /* .param p0, "pointer" # I */
		 /* .prologue */
		 /* .line 16 */
		 /* if-nez p0, :cond_0 */
		 int v0 = 0; // const/4 v0, 0x0
	 } // :goto_0
} // :cond_0
/* new-instance v0, Lcom/wiyun/engine/actions/ToggleVisibility; */
/* invoke-direct {v0, p0}, Lcom/wiyun/engine/actions/ToggleVisibility;-><init>(I)V */
} // .end method
public static com.wiyun.engine.actions.ToggleVisibility make ( ) {
/* .locals 1 */
/* .prologue */
/* .line 12 */
/* new-instance v0, Lcom/wiyun/engine/actions/ToggleVisibility; */
/* invoke-direct {v0}, Lcom/wiyun/engine/actions/ToggleVisibility;-><init>()V */
} // .end method
private native void nativeInit ( ) {
} // .end method
/* # virtual methods */
public com.wiyun.engine.actions.InstantAction copy ( ) {
/* .locals 2 */
/* .prologue */
/* .line 31 */
/* new-instance v0, Lcom/wiyun/engine/actions/ToggleVisibility; */
v1 = (( com.wiyun.engine.actions.ToggleVisibility ) p0 ).nativeCopy ( ); // invoke-virtual {p0}, Lcom/wiyun/engine/actions/ToggleVisibility;->nativeCopy()I
/* invoke-direct {v0, v1}, Lcom/wiyun/engine/actions/ToggleVisibility;-><init>(I)V */
} // .end method
public java.lang.Object copy ( ) { //bridge//synthethic
/* .locals 1 */
/* .prologue */
/* .line 1 */
(( com.wiyun.engine.actions.ToggleVisibility ) p0 ).copy ( ); // invoke-virtual {p0}, Lcom/wiyun/engine/actions/ToggleVisibility;->copy()Lcom/wiyun/engine/actions/InstantAction;
} // .end method
public com.wiyun.engine.actions.InstantAction reverse ( ) {
/* .locals 2 */
/* .prologue */
/* .line 36 */
/* new-instance v0, Lcom/wiyun/engine/actions/ToggleVisibility; */
v1 = (( com.wiyun.engine.actions.ToggleVisibility ) p0 ).nativeReverse ( ); // invoke-virtual {p0}, Lcom/wiyun/engine/actions/ToggleVisibility;->nativeReverse()I
/* invoke-direct {v0, v1}, Lcom/wiyun/engine/actions/ToggleVisibility;-><init>(I)V */
} // .end method
