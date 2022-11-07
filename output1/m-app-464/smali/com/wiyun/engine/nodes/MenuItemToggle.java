public class com.wiyun.engine.nodes.MenuItemToggle extends com.wiyun.engine.nodes.MenuItem implements com.wiyun.engine.nodes.Node$IColorable {
	 /* # interfaces */
	 /* # direct methods */
	 private com.wiyun.engine.nodes.MenuItemToggle ( ) {
		 /* .locals 0 */
		 /* invoke-direct {p0, p1}, Lcom/wiyun/engine/nodes/MenuItem;-><init>(I)V */
		 return;
	 } // .end method
	 private com.wiyun.engine.nodes.MenuItemToggle ( ) {
		 /* .locals 0 */
		 /* invoke-direct {p0}, Lcom/wiyun/engine/nodes/MenuItem;-><init>()V */
		 /* invoke-direct {p0, p1, p2, p3}, Lcom/wiyun/engine/nodes/MenuItemToggle;->nativeInit(Lcom/wiyun/engine/utils/TargetSelector;Lcom/wiyun/engine/utils/TargetSelector;[Lcom/wiyun/engine/nodes/MenuItem;)V */
		 return;
	 } // .end method
	 public static com.wiyun.engine.nodes.MenuItemToggle from ( Integer p0 ) {
		 /* .locals 1 */
		 /* if-nez p0, :cond_0 */
		 int v0 = 0; // const/4 v0, 0x0
	 } // :goto_0
} // :cond_0
/* new-instance v0, Lcom/wiyun/engine/nodes/MenuItemToggle; */
/* invoke-direct {v0, p0}, Lcom/wiyun/engine/nodes/MenuItemToggle;-><init>(I)V */
} // .end method
public static com.wiyun.engine.nodes.Node from ( Integer p0 ) { //bridge//synthethic
/* .locals 1 */
com.wiyun.engine.nodes.MenuItemToggle .from ( p0 );
} // .end method
public static com.wiyun.engine.nodes.MenuItemToggle make ( com.wiyun.engine.utils.TargetSelector p0, com.wiyun.engine.utils.TargetSelector p1, com.wiyun.engine.nodes.MenuItem...p2 ) {
/* .locals 1 */
/* new-instance v0, Lcom/wiyun/engine/nodes/MenuItemToggle; */
/* invoke-direct {v0, p0, p1, p2}, Lcom/wiyun/engine/nodes/MenuItemToggle;-><init>(Lcom/wiyun/engine/utils/TargetSelector;Lcom/wiyun/engine/utils/TargetSelector;[Lcom/wiyun/engine/nodes/MenuItem;)V */
} // .end method
private native void nativeAutoReleaseItems ( ) {
} // .end method
private native void nativeGetColor ( com.wiyun.engine.types.WYColor3B p0 ) {
} // .end method
private native void nativeInit ( com.wiyun.engine.utils.TargetSelector p0, com.wiyun.engine.utils.TargetSelector p1, com.wiyun.engine.nodes.MenuItem...p2 ) {
} // .end method
private native void nativeSetColor ( Integer p0, Integer p1, Integer p2 ) {
} // .end method
/* # virtual methods */
public com.wiyun.engine.nodes.Node autoRelease ( Boolean p0 ) {
/* .locals 0 */
/* invoke-super {p0, p1}, Lcom/wiyun/engine/nodes/MenuItem;->autoRelease(Z)Lcom/wiyun/engine/nodes/Node; */
if ( p1 != null) { // if-eqz p1, :cond_0
	 /* invoke-direct {p0}, Lcom/wiyun/engine/nodes/MenuItemToggle;->nativeAutoReleaseItems()V */
} // :cond_0
} // .end method
public native Integer getAlpha ( ) {
} // .end method
public com.wiyun.engine.types.WYColor3B getColor ( ) {
/* .locals 1 */
/* new-instance v0, Lcom/wiyun/engine/types/WYColor3B; */
/* invoke-direct {v0}, Lcom/wiyun/engine/types/WYColor3B;-><init>()V */
/* invoke-direct {p0, v0}, Lcom/wiyun/engine/nodes/MenuItemToggle;->nativeGetColor(Lcom/wiyun/engine/types/WYColor3B;)V */
} // .end method
public native void setAlpha ( Integer p0 ) {
} // .end method
public void setColor ( com.wiyun.engine.types.WYColor3B p0 ) {
/* .locals 3 */
/* iget v0, p1, Lcom/wiyun/engine/types/WYColor3B;->r:I */
/* iget v1, p1, Lcom/wiyun/engine/types/WYColor3B;->g:I */
/* iget v2, p1, Lcom/wiyun/engine/types/WYColor3B;->b:I */
/* invoke-direct {p0, v0, v1, v2}, Lcom/wiyun/engine/nodes/MenuItemToggle;->nativeSetColor(III)V */
return;
} // .end method
