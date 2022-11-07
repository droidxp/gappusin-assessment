public class com.wiyun.engine.dialog.Dialog extends com.wiyun.engine.nodes.ColorLayer {
	 /* .source "Dialog.java" */
	 /* # direct methods */
	 protected com.wiyun.engine.dialog.Dialog ( ) {
		 /* .locals 0 */
		 /* .prologue */
		 /* .line 23 */
		 /* invoke-direct {p0}, Lcom/wiyun/engine/nodes/ColorLayer;-><init>()V */
		 /* .line 24 */
		 /* invoke-direct {p0}, Lcom/wiyun/engine/dialog/Dialog;->nativeInit()V */
		 /* .line 25 */
		 return;
	 } // .end method
	 protected com.wiyun.engine.dialog.Dialog ( ) {
		 /* .locals 0 */
		 /* .param p1, "pointer" # I */
		 /* .prologue */
		 /* .line 30 */
		 /* invoke-direct {p0, p1}, Lcom/wiyun/engine/nodes/ColorLayer;-><init>(I)V */
		 /* .line 31 */
		 return;
	 } // .end method
	 public static com.wiyun.engine.dialog.Dialog from ( Integer p0 ) {
		 /* .locals 1 */
		 /* .param p0, "pointer" # I */
		 /* .prologue */
		 /* .line 20 */
		 /* if-nez p0, :cond_0 */
		 int v0 = 0; // const/4 v0, 0x0
	 } // :goto_0
} // :cond_0
/* new-instance v0, Lcom/wiyun/engine/dialog/Dialog; */
/* invoke-direct {v0, p0}, Lcom/wiyun/engine/dialog/Dialog;-><init>(I)V */
} // .end method
public static com.wiyun.engine.nodes.ColorLayer from ( Integer p0 ) { //bridge//synthethic
/* .locals 1 */
/* .prologue */
/* .line 1 */
com.wiyun.engine.dialog.Dialog .from ( p0 );
} // .end method
public static com.wiyun.engine.dialog.Dialog make ( ) {
/* .locals 1 */
/* .prologue */
/* .line 16 */
/* new-instance v0, Lcom/wiyun/engine/dialog/Dialog; */
/* invoke-direct {v0}, Lcom/wiyun/engine/dialog/Dialog;-><init>()V */
} // .end method
public static com.wiyun.engine.nodes.ColorLayer make ( ) { //bridge//synthethic
/* .locals 1 */
/* .prologue */
/* .line 1 */
com.wiyun.engine.dialog.Dialog .make ( );
} // .end method
private native void nativeAddButton ( com.wiyun.engine.nodes.Node p0, com.wiyun.engine.nodes.Node p1, com.wiyun.engine.utils.TargetSelector p2 ) {
} // .end method
private native Integer nativeAddTwoColumnsButton ( com.wiyun.engine.nodes.Node p0, com.wiyun.engine.nodes.Node p1, com.wiyun.engine.utils.TargetSelector p2, com.wiyun.engine.nodes.Node p3, com.wiyun.engine.nodes.Node p4, com.wiyun.engine.utils.TargetSelector p5 ) {
} // .end method
private native void nativeCreate ( ) {
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
public com.wiyun.engine.dialog.Dialog addButton ( com.wiyun.engine.nodes.Node p0, com.wiyun.engine.nodes.Node p1, com.wiyun.engine.utils.TargetSelector p2 ) {
/* .locals 0 */
/* .param p1, "button" # Lcom/wiyun/engine/nodes/Node; */
/* .param p2, "label" # Lcom/wiyun/engine/nodes/Node; */
/* .param p3, "sel" # Lcom/wiyun/engine/utils/TargetSelector; */
/* .prologue */
/* .line 218 */
/* invoke-direct {p0, p1, p2, p3}, Lcom/wiyun/engine/dialog/Dialog;->nativeAddButton(Lcom/wiyun/engine/nodes/Node;Lcom/wiyun/engine/nodes/Node;Lcom/wiyun/engine/utils/TargetSelector;)V */
/* .line 219 */
} // .end method
public com.wiyun.engine.dialog.Dialog addTwoColumnsButton ( com.wiyun.engine.nodes.Node p0, com.wiyun.engine.nodes.Node p1, com.wiyun.engine.utils.TargetSelector p2, com.wiyun.engine.nodes.Node p3, com.wiyun.engine.nodes.Node p4, com.wiyun.engine.utils.TargetSelector p5 ) {
/* .locals 1 */
/* .param p1, "button1" # Lcom/wiyun/engine/nodes/Node; */
/* .param p2, "label1" # Lcom/wiyun/engine/nodes/Node; */
/* .param p3, "sel1" # Lcom/wiyun/engine/utils/TargetSelector; */
/* .param p4, "button2" # Lcom/wiyun/engine/nodes/Node; */
/* .param p5, "label2" # Lcom/wiyun/engine/nodes/Node; */
/* .param p6, "sel2" # Lcom/wiyun/engine/utils/TargetSelector; */
/* .prologue */
/* .line 246 */
v0 = /* invoke-direct/range {p0 ..p6}, Lcom/wiyun/engine/dialog/Dialog;->nativeAddTwoColumnsButton(Lcom/wiyun/engine/nodes/Node;Lcom/wiyun/engine/nodes/Node;Lcom/wiyun/engine/utils/TargetSelector;Lcom/wiyun/engine/nodes/Node;Lcom/wiyun/engine/nodes/Node;Lcom/wiyun/engine/utils/TargetSelector;)I */
com.wiyun.engine.dialog.Dialog .from ( v0 );
} // .end method
public com.wiyun.engine.dialog.Dialog create ( ) {
/* .locals 0 */
/* .prologue */
/* .line 45 */
/* invoke-direct {p0}, Lcom/wiyun/engine/dialog/Dialog;->nativeCreate()V */
/* .line 46 */
} // .end method
public native void dismiss ( Boolean p0 ) {
} // .end method
public native Integer getBackground ( ) {
} // .end method
public com.wiyun.engine.dialog.Dialog setBackKeyEquivalentButtonIndex ( Integer p0 ) {
/* .locals 0 */
/* .param p1, "index" # I */
/* .prologue */
/* .line 287 */
/* invoke-direct {p0, p1}, Lcom/wiyun/engine/dialog/Dialog;->nativeSetBackKeyEquivalentButtonIndex(I)V */
/* .line 288 */
} // .end method
public com.wiyun.engine.dialog.Dialog setBackground ( com.wiyun.engine.nodes.Node p0 ) {
/* .locals 0 */
/* .param p1, "bg" # Lcom/wiyun/engine/nodes/Node; */
/* .prologue */
/* .line 112 */
/* invoke-direct {p0, p1}, Lcom/wiyun/engine/dialog/Dialog;->nativeSetBackground(Lcom/wiyun/engine/nodes/Node;)V */
/* .line 113 */
} // .end method
public com.wiyun.engine.dialog.Dialog setBackgroundPadding ( Float p0, Float p1, Float p2, Float p3 ) {
/* .locals 0 */
/* .param p1, "left" # F */
/* .param p2, "top" # F */
/* .param p3, "right" # F */
/* .param p4, "bottom" # F */
/* .prologue */
/* .line 152 */
/* invoke-direct {p0, p1, p2, p3, p4}, Lcom/wiyun/engine/dialog/Dialog;->nativeSetBackgroundPadding(FFFF)V */
/* .line 153 */
} // .end method
public com.wiyun.engine.dialog.Dialog setContent ( com.wiyun.engine.nodes.Node p0 ) {
/* .locals 0 */
/* .param p1, "content" # Lcom/wiyun/engine/nodes/Node; */
/* .prologue */
/* .line 194 */
/* invoke-direct {p0, p1}, Lcom/wiyun/engine/dialog/Dialog;->nativeSetContent(Lcom/wiyun/engine/nodes/Node;)V */
/* .line 195 */
} // .end method
public com.wiyun.engine.dialog.Dialog setTitle ( com.wiyun.engine.nodes.Node p0 ) {
/* .locals 0 */
/* .param p1, "title" # Lcom/wiyun/engine/nodes/Node; */
/* .prologue */
/* .line 174 */
/* invoke-direct {p0, p1}, Lcom/wiyun/engine/dialog/Dialog;->nativeSetTitle(Lcom/wiyun/engine/nodes/Node;)V */
/* .line 175 */
} // .end method
public com.wiyun.engine.dialog.Dialog setTransition ( com.wiyun.engine.dialog.DialogTransition p0 ) {
/* .locals 0 */
/* .param p1, "t" # Lcom/wiyun/engine/dialog/DialogTransition; */
/* .prologue */
/* .line 265 */
/* invoke-direct {p0, p1}, Lcom/wiyun/engine/dialog/Dialog;->nativeSetTransition(Lcom/wiyun/engine/dialog/DialogTransition;)V */
/* .line 266 */
} // .end method
public com.wiyun.engine.dialog.Dialog show ( Boolean p0 ) {
/* .locals 0 */
/* .param p1, "withAnimation" # Z */
/* .prologue */
/* .line 67 */
/* invoke-direct {p0, p1}, Lcom/wiyun/engine/dialog/Dialog;->nativeShow(Z)V */
/* .line 68 */
} // .end method
