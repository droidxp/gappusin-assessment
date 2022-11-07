public class com.wiyun.engine.dialog.Dialog extends com.wiyun.engine.nodes.ColorLayer {
	 /* # direct methods */
	 protected com.wiyun.engine.dialog.Dialog ( ) {
		 /* .locals 0 */
		 /* invoke-direct {p0}, Lcom/wiyun/engine/nodes/ColorLayer;-><init>()V */
		 /* invoke-direct {p0}, Lcom/wiyun/engine/dialog/Dialog;->nativeInit()V */
		 return;
	 } // .end method
	 private com.wiyun.engine.dialog.Dialog ( ) {
		 /* .locals 0 */
		 /* invoke-direct {p0, p1}, Lcom/wiyun/engine/nodes/ColorLayer;-><init>(I)V */
		 return;
	 } // .end method
	 public static com.wiyun.engine.dialog.Dialog from ( Integer p0 ) {
		 /* .locals 1 */
		 /* if-nez p0, :cond_0 */
		 int v0 = 0; // const/4 v0, 0x0
	 } // :goto_0
} // :cond_0
/* new-instance v0, Lcom/wiyun/engine/dialog/Dialog; */
/* invoke-direct {v0, p0}, Lcom/wiyun/engine/dialog/Dialog;-><init>(I)V */
} // .end method
public static com.wiyun.engine.nodes.ColorLayer from ( Integer p0 ) { //bridge//synthethic
/* .locals 1 */
com.wiyun.engine.dialog.Dialog .from ( p0 );
} // .end method
public static com.wiyun.engine.dialog.Dialog make ( ) {
/* .locals 1 */
/* new-instance v0, Lcom/wiyun/engine/dialog/Dialog; */
/* invoke-direct {v0}, Lcom/wiyun/engine/dialog/Dialog;-><init>()V */
} // .end method
public static com.wiyun.engine.nodes.ColorLayer make ( ) { //bridge//synthethic
/* .locals 1 */
com.wiyun.engine.dialog.Dialog .make ( );
} // .end method
private native void nativeAddButton ( com.wiyun.engine.nodes.Node p0, com.wiyun.engine.nodes.Node p1, com.wiyun.engine.utils.TargetSelector p2 ) {
} // .end method
private native Integer nativeAddTwoColumnsButton ( com.wiyun.engine.nodes.Node p0, com.wiyun.engine.nodes.Node p1, com.wiyun.engine.utils.TargetSelector p2, com.wiyun.engine.nodes.Node p3, com.wiyun.engine.nodes.Node p4, com.wiyun.engine.utils.TargetSelector p5 ) {
} // .end method
private native void nativeInit ( ) {
} // .end method
private native void nativeSetBackKeyEquivalentButtonIndex ( Integer p0 ) {
} // .end method
private native void nativeSetBackground ( com.wiyun.engine.nodes.Node p0 ) {
} // .end method
private native void nativeSetBackgroundPadding ( Float p0, Float p1, Float p2, Float p3 ) {
} // .end method
private native void nativeSetContent ( com.wiyun.engine.nodes.Node p0 ) {
} // .end method
private native void nativeSetTitle ( com.wiyun.engine.nodes.Node p0 ) {
} // .end method
private native void nativeSetTransition ( com.wiyun.engine.dialog.DialogTransition p0 ) {
} // .end method
private native void nativeShow ( Boolean p0 ) {
} // .end method
/* # virtual methods */
public final com.wiyun.engine.dialog.Dialog a ( Float p0, Float p1, Float p2, Float p3 ) {
/* .locals 0 */
/* invoke-direct {p0, p1, p2, p3, p4}, Lcom/wiyun/engine/dialog/Dialog;->nativeSetBackgroundPadding(FFFF)V */
} // .end method
public final com.wiyun.engine.dialog.Dialog a ( Integer p0 ) {
/* .locals 1 */
int v0 = 1; // const/4 v0, 0x1
/* invoke-direct {p0, v0}, Lcom/wiyun/engine/dialog/Dialog;->nativeSetBackKeyEquivalentButtonIndex(I)V */
} // .end method
public final com.wiyun.engine.dialog.Dialog a ( com.wiyun.engine.dialog.DialogTransition p0 ) {
/* .locals 0 */
/* invoke-direct {p0, p1}, Lcom/wiyun/engine/dialog/Dialog;->nativeSetTransition(Lcom/wiyun/engine/dialog/DialogTransition;)V */
} // .end method
public final com.wiyun.engine.dialog.Dialog a ( com.wiyun.engine.nodes.Node p0 ) {
/* .locals 0 */
/* invoke-direct {p0, p1}, Lcom/wiyun/engine/dialog/Dialog;->nativeSetBackground(Lcom/wiyun/engine/nodes/Node;)V */
} // .end method
public final com.wiyun.engine.dialog.Dialog a ( com.wiyun.engine.nodes.Node p0, com.wiyun.engine.nodes.Node p1, com.wiyun.engine.utils.TargetSelector p2 ) {
/* .locals 1 */
int v0 = 0; // const/4 v0, 0x0
/* invoke-direct {p0, p1, p2, v0}, Lcom/wiyun/engine/dialog/Dialog;->nativeAddButton(Lcom/wiyun/engine/nodes/Node;Lcom/wiyun/engine/nodes/Node;Lcom/wiyun/engine/utils/TargetSelector;)V */
} // .end method
public final com.wiyun.engine.dialog.Dialog a ( com.wiyun.engine.nodes.Node p0, com.wiyun.engine.nodes.Node p1, com.wiyun.engine.utils.TargetSelector p2, com.wiyun.engine.nodes.Node p3, com.wiyun.engine.nodes.Node p4, com.wiyun.engine.utils.TargetSelector p5 ) {
/* .locals 1 */
v0 = /* invoke-direct/range {p0 ..p6}, Lcom/wiyun/engine/dialog/Dialog;->nativeAddTwoColumnsButton(Lcom/wiyun/engine/nodes/Node;Lcom/wiyun/engine/nodes/Node;Lcom/wiyun/engine/utils/TargetSelector;Lcom/wiyun/engine/nodes/Node;Lcom/wiyun/engine/nodes/Node;Lcom/wiyun/engine/utils/TargetSelector;)I */
com.wiyun.engine.dialog.Dialog .from ( v0 );
} // .end method
public final com.wiyun.engine.dialog.Dialog a ( Boolean p0 ) {
/* .locals 1 */
int v0 = 1; // const/4 v0, 0x1
/* invoke-direct {p0, v0}, Lcom/wiyun/engine/dialog/Dialog;->nativeShow(Z)V */
} // .end method
public final com.wiyun.engine.dialog.Dialog b ( com.wiyun.engine.nodes.Node p0 ) {
/* .locals 0 */
/* invoke-direct {p0, p1}, Lcom/wiyun/engine/dialog/Dialog;->nativeSetTitle(Lcom/wiyun/engine/nodes/Node;)V */
} // .end method
public final com.wiyun.engine.dialog.Dialog c ( com.wiyun.engine.nodes.Node p0 ) {
/* .locals 0 */
/* invoke-direct {p0, p1}, Lcom/wiyun/engine/dialog/Dialog;->nativeSetContent(Lcom/wiyun/engine/nodes/Node;)V */
} // .end method
