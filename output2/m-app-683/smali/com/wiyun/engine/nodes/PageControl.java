public class com.wiyun.engine.nodes.PageControl extends com.wiyun.engine.nodes.Node {
	 /* .source "PageControl.java" */
	 /* # annotations */
	 /* .annotation system Ldalvik/annotation/MemberClasses; */
	 /* value = { */
	 /* Lcom/wiyun/engine/nodes/PageControl$IPageControlCallback; */
	 /* } */
} // .end annotation
/* # direct methods */
protected com.wiyun.engine.nodes.PageControl ( ) {
	 /* .locals 0 */
	 /* .prologue */
	 /* .line 72 */
	 /* invoke-direct {p0}, Lcom/wiyun/engine/nodes/Node;-><init>()V */
	 /* .line 73 */
	 /* invoke-direct {p0}, Lcom/wiyun/engine/nodes/PageControl;->nativeInit()V */
	 /* .line 74 */
	 return;
} // .end method
protected com.wiyun.engine.nodes.PageControl ( ) {
	 /* .locals 0 */
	 /* .param p1, "pointer" # I */
	 /* .prologue */
	 /* .line 81 */
	 /* invoke-direct {p0, p1}, Lcom/wiyun/engine/nodes/Node;-><init>(I)V */
	 /* .line 82 */
	 return;
} // .end method
public static com.wiyun.engine.nodes.Node from ( Integer p0 ) { //bridge//synthethic
	 /* .locals 1 */
	 /* .prologue */
	 /* .line 1 */
	 com.wiyun.engine.nodes.PageControl .from ( p0 );
} // .end method
public static com.wiyun.engine.nodes.PageControl from ( Integer p0 ) {
	 /* .locals 1 */
	 /* .param p0, "pointer" # I */
	 /* .prologue */
	 /* .line 69 */
	 /* if-nez p0, :cond_0 */
	 int v0 = 0; // const/4 v0, 0x0
} // :goto_0
} // :cond_0
/* new-instance v0, Lcom/wiyun/engine/nodes/PageControl; */
/* invoke-direct {v0, p0}, Lcom/wiyun/engine/nodes/PageControl;-><init>(I)V */
} // .end method
public static com.wiyun.engine.nodes.PageControl make ( ) {
/* .locals 1 */
/* .prologue */
/* .line 65 */
/* new-instance v0, Lcom/wiyun/engine/nodes/PageControl; */
/* invoke-direct {v0}, Lcom/wiyun/engine/nodes/PageControl;-><init>()V */
} // .end method
private native void nativeInit ( ) {
} // .end method
/* # virtual methods */
public native void addPage ( com.wiyun.engine.nodes.Node p0 ) {
} // .end method
public native void addPageAt ( com.wiyun.engine.nodes.Node p0, Integer p1 ) {
} // .end method
protected void doNativeInit ( ) {
/* .locals 0 */
/* .prologue */
/* .line 78 */
return;
} // .end method
public native Float getCenterX ( ) {
} // .end method
public native Float getCenterY ( ) {
} // .end method
public native Integer getPageCount ( ) {
} // .end method
public native Integer getPageIndicatorPointer ( ) {
} // .end method
public native Float getPageSpacing ( ) {
} // .end method
public native void gotoPage ( Integer p0 ) {
} // .end method
public native void gotoPage ( Integer p0, Float p1 ) {
} // .end method
public native Boolean isVertical ( ) {
} // .end method
public native void removeAllPages ( ) {
} // .end method
public native void removePage ( com.wiyun.engine.nodes.Node p0 ) {
} // .end method
public native void removePageAt ( Integer p0 ) {
} // .end method
public native void setCallback ( com.wiyun.engine.nodes.PageControl$IPageControlCallback p0 ) {
} // .end method
public native void setCenterX ( Float p0 ) {
} // .end method
public native void setCenterY ( Float p0 ) {
} // .end method
public native void setInitialPage ( Integer p0 ) {
} // .end method
public native void setPageIndicator ( com.wiyun.engine.nodes.PageIndicator p0 ) {
} // .end method
public native void setPageSpacing ( Float p0 ) {
} // .end method
public native void setVertical ( Boolean p0 ) {
} // .end method
