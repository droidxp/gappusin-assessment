public class com.wiyun.engine.actions.ToggleVisibility extends com.wiyun.engine.actions.InstantAction {
	 /* # direct methods */
	 protected com.wiyun.engine.actions.ToggleVisibility ( ) {
		 /* .locals 0 */
		 /* invoke-direct {p0}, Lcom/wiyun/engine/actions/InstantAction;-><init>()V */
		 /* invoke-direct {p0}, Lcom/wiyun/engine/actions/ToggleVisibility;->nativeInit()V */
		 return;
	 } // .end method
	 private com.wiyun.engine.actions.ToggleVisibility ( ) {
		 /* .locals 0 */
		 /* invoke-direct {p0, p1}, Lcom/wiyun/engine/actions/InstantAction;-><init>(I)V */
		 return;
	 } // .end method
	 public static com.wiyun.engine.actions.Action from ( Integer p0 ) { //bridge//synthethic
		 /* .locals 1 */
		 com.wiyun.engine.actions.ToggleVisibility .from ( p0 );
	 } // .end method
	 public static com.wiyun.engine.actions.ToggleVisibility from ( Integer p0 ) {
		 /* .locals 1 */
		 /* if-nez p0, :cond_0 */
		 int v0 = 0; // const/4 v0, 0x0
	 } // :goto_0
} // :cond_0
/* new-instance v0, Lcom/wiyun/engine/actions/ToggleVisibility; */
/* invoke-direct {v0, p0}, Lcom/wiyun/engine/actions/ToggleVisibility;-><init>(I)V */
} // .end method
public static com.wiyun.engine.actions.ToggleVisibility make ( ) {
/* .locals 1 */
/* new-instance v0, Lcom/wiyun/engine/actions/ToggleVisibility; */
/* invoke-direct {v0}, Lcom/wiyun/engine/actions/ToggleVisibility;-><init>()V */
} // .end method
private native void nativeInit ( ) {
} // .end method
/* # virtual methods */
public final com.wiyun.engine.actions.InstantAction a ( ) {
/* .locals 2 */
/* new-instance v0, Lcom/wiyun/engine/actions/ToggleVisibility; */
v1 = (( com.wiyun.engine.actions.ToggleVisibility ) p0 ).nativeReverse ( ); // invoke-virtual {p0}, Lcom/wiyun/engine/actions/ToggleVisibility;->nativeReverse()I
/* invoke-direct {v0, v1}, Lcom/wiyun/engine/actions/ToggleVisibility;-><init>(I)V */
} // .end method
public final com.wiyun.engine.actions.InstantAction b ( ) {
/* .locals 2 */
/* new-instance v0, Lcom/wiyun/engine/actions/ToggleVisibility; */
v1 = (( com.wiyun.engine.actions.ToggleVisibility ) p0 ).nativeCopy ( ); // invoke-virtual {p0}, Lcom/wiyun/engine/actions/ToggleVisibility;->nativeCopy()I
/* invoke-direct {v0, v1}, Lcom/wiyun/engine/actions/ToggleVisibility;-><init>(I)V */
} // .end method
public java.lang.Object copy ( ) { //synthethic
/* .locals 1 */
(( com.wiyun.engine.actions.ToggleVisibility ) p0 ).b ( ); // invoke-virtual {p0}, Lcom/wiyun/engine/actions/ToggleVisibility;->b()Lcom/wiyun/engine/actions/InstantAction;
} // .end method
