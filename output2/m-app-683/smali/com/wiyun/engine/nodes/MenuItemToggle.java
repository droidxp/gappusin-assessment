public class com.wiyun.engine.nodes.MenuItemToggle extends com.wiyun.engine.nodes.MenuItem implements com.wiyun.engine.nodes.Node$IColorable {
	 /* .source "MenuItemToggle.java" */
	 /* # interfaces */
	 /* # direct methods */
	 protected com.wiyun.engine.nodes.MenuItemToggle ( ) {
		 /* .locals 0 */
		 /* .param p1, "pointer" # I */
		 /* .prologue */
		 /* .line 46 */
		 /* invoke-direct {p0, p1}, Lcom/wiyun/engine/nodes/MenuItem;-><init>(I)V */
		 /* .line 47 */
		 return;
	 } // .end method
	 protected com.wiyun.engine.nodes.MenuItemToggle ( ) {
		 /* .locals 0 */
		 /* .param p1, "downSelector" # Lcom/wiyun/engine/utils/TargetSelector; */
		 /* .param p2, "upSelector" # Lcom/wiyun/engine/utils/TargetSelector; */
		 /* .param p3, "items" # [Lcom/wiyun/engine/nodes/MenuItem; */
		 /* .prologue */
		 /* .line 31 */
		 /* invoke-direct {p0}, Lcom/wiyun/engine/nodes/MenuItem;-><init>()V */
		 /* .line 32 */
		 /* invoke-direct {p0, p1, p2, p3}, Lcom/wiyun/engine/nodes/MenuItemToggle;->nativeInit(Lcom/wiyun/engine/utils/TargetSelector;Lcom/wiyun/engine/utils/TargetSelector;[Lcom/wiyun/engine/nodes/MenuItem;)V */
		 /* .line 33 */
		 return;
	 } // .end method
	 public static com.wiyun.engine.nodes.MenuItemToggle from ( Integer p0 ) {
		 /* .locals 1 */
		 /* .param p0, "pointer" # I */
		 /* .prologue */
		 /* .line 42 */
		 /* if-nez p0, :cond_0 */
		 int v0 = 0; // const/4 v0, 0x0
	 } // :goto_0
} // :cond_0
/* new-instance v0, Lcom/wiyun/engine/nodes/MenuItemToggle; */
/* invoke-direct {v0, p0}, Lcom/wiyun/engine/nodes/MenuItemToggle;-><init>(I)V */
} // .end method
public static com.wiyun.engine.nodes.Node from ( Integer p0 ) { //bridge//synthethic
/* .locals 1 */
/* .prologue */
/* .line 1 */
com.wiyun.engine.nodes.MenuItemToggle .from ( p0 );
} // .end method
public static com.wiyun.engine.nodes.MenuItemToggle make ( com.wiyun.engine.utils.TargetSelector p0, com.wiyun.engine.utils.TargetSelector p1, com.wiyun.engine.nodes.MenuItem...p2 ) {
/* .locals 1 */
/* .param p0, "downSelector" # Lcom/wiyun/engine/utils/TargetSelector; */
/* .param p1, "upSelector" # Lcom/wiyun/engine/utils/TargetSelector; */
/* .param p2, "items" # [Lcom/wiyun/engine/nodes/MenuItem; */
/* .prologue */
/* .line 21 */
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
/* .param p1, "includeChildren" # Z */
/* .prologue */
/* .line 85 */
/* invoke-super {p0, p1}, Lcom/wiyun/engine/nodes/MenuItem;->autoRelease(Z)Lcom/wiyun/engine/nodes/Node; */
/* .line 86 */
if ( p1 != null) { // if-eqz p1, :cond_0
	 /* .line 87 */
	 /* invoke-direct {p0}, Lcom/wiyun/engine/nodes/MenuItemToggle;->nativeAutoReleaseItems()V */
	 /* .line 88 */
} // :cond_0
} // .end method
public native Integer getAlpha ( ) {
} // .end method
public com.wiyun.engine.types.WYColor3B getColor ( ) {
/* .locals 1 */
/* .prologue */
/* .line 70 */
/* new-instance v0, Lcom/wiyun/engine/types/WYColor3B; */
/* invoke-direct {v0}, Lcom/wiyun/engine/types/WYColor3B;-><init>()V */
/* .line 71 */
/* .local v0, "color":Lcom/wiyun/engine/types/WYColor3B; */
/* invoke-direct {p0, v0}, Lcom/wiyun/engine/nodes/MenuItemToggle;->nativeGetColor(Lcom/wiyun/engine/types/WYColor3B;)V */
/* .line 72 */
} // .end method
public native Integer getSelectedIndex ( ) {
} // .end method
public native void setAlpha ( Integer p0 ) {
} // .end method
public void setColor ( com.wiyun.engine.types.WYColor3B p0 ) {
/* .locals 3 */
/* .param p1, "color" # Lcom/wiyun/engine/types/WYColor3B; */
/* .prologue */
/* .line 78 */
/* iget v0, p1, Lcom/wiyun/engine/types/WYColor3B;->r:I */
/* iget v1, p1, Lcom/wiyun/engine/types/WYColor3B;->g:I */
/* iget v2, p1, Lcom/wiyun/engine/types/WYColor3B;->b:I */
/* invoke-direct {p0, v0, v1, v2}, Lcom/wiyun/engine/nodes/MenuItemToggle;->nativeSetColor(III)V */
/* .line 79 */
return;
} // .end method
public native void setSelectedIndex ( Integer p0 ) {
} // .end method
