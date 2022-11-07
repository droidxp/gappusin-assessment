public class com.wiyun.engine.nodes.ScrollableLayer extends com.wiyun.engine.nodes.ColorLayer {
	 /* .source "ScrollableLayer.java" */
	 /* # annotations */
	 /* .annotation system Ldalvik/annotation/MemberClasses; */
	 /* value = { */
	 /* Lcom/wiyun/engine/nodes/ScrollableLayer$IScrollableLayerCallback; */
	 /* } */
} // .end annotation
/* # direct methods */
protected com.wiyun.engine.nodes.ScrollableLayer ( ) {
	 /* .locals 1 */
	 /* .prologue */
	 int v0 = 0; // const/4 v0, 0x0
	 /* .line 87 */
	 /* invoke-direct {p0}, Lcom/wiyun/engine/nodes/ColorLayer;-><init>()V */
	 /* .line 88 */
	 com.wiyun.engine.types.WYColor4B .make ( v0,v0,v0,v0 );
	 /* invoke-direct {p0, v0}, Lcom/wiyun/engine/nodes/ScrollableLayer;->nativeInit(Lcom/wiyun/engine/types/WYColor4B;)V */
	 /* .line 89 */
	 return;
} // .end method
protected com.wiyun.engine.nodes.ScrollableLayer ( ) {
	 /* .locals 0 */
	 /* .param p1, "pointer" # I */
	 /* .prologue */
	 /* .line 96 */
	 /* invoke-direct {p0, p1}, Lcom/wiyun/engine/nodes/ColorLayer;-><init>(I)V */
	 /* .line 97 */
	 return;
} // .end method
protected com.wiyun.engine.nodes.ScrollableLayer ( ) {
	 /* .locals 0 */
	 /* .param p1, "color" # Lcom/wiyun/engine/types/WYColor4B; */
	 /* .prologue */
	 /* .line 91 */
	 /* invoke-direct {p0}, Lcom/wiyun/engine/nodes/ColorLayer;-><init>()V */
	 /* .line 92 */
	 /* invoke-direct {p0, p1}, Lcom/wiyun/engine/nodes/ScrollableLayer;->nativeInit(Lcom/wiyun/engine/types/WYColor4B;)V */
	 /* .line 93 */
	 return;
} // .end method
public static com.wiyun.engine.nodes.ColorLayer from ( Integer p0 ) { //bridge//synthethic
	 /* .locals 1 */
	 /* .prologue */
	 /* .line 1 */
	 com.wiyun.engine.nodes.ScrollableLayer .from ( p0 );
} // .end method
public static com.wiyun.engine.nodes.ScrollableLayer from ( Integer p0 ) {
	 /* .locals 1 */
	 /* .param p0, "pointer" # I */
	 /* .prologue */
	 /* .line 84 */
	 /* if-nez p0, :cond_0 */
	 int v0 = 0; // const/4 v0, 0x0
} // :goto_0
} // :cond_0
/* new-instance v0, Lcom/wiyun/engine/nodes/ScrollableLayer; */
/* invoke-direct {v0, p0}, Lcom/wiyun/engine/nodes/ScrollableLayer;-><init>(I)V */
} // .end method
public static com.wiyun.engine.nodes.ColorLayer make ( ) { //bridge//synthethic
/* .locals 1 */
/* .prologue */
/* .line 1 */
com.wiyun.engine.nodes.ScrollableLayer .make ( );
} // .end method
public static com.wiyun.engine.nodes.ColorLayer make ( com.wiyun.engine.types.WYColor4B p0 ) { //bridge//synthethic
/* .locals 1 */
/* .prologue */
/* .line 1 */
com.wiyun.engine.nodes.ScrollableLayer .make ( p0 );
} // .end method
public static com.wiyun.engine.nodes.ScrollableLayer make ( ) {
/* .locals 1 */
/* .prologue */
/* .line 64 */
/* new-instance v0, Lcom/wiyun/engine/nodes/ScrollableLayer; */
/* invoke-direct {v0}, Lcom/wiyun/engine/nodes/ScrollableLayer;-><init>()V */
} // .end method
public static com.wiyun.engine.nodes.ScrollableLayer make ( com.wiyun.engine.types.WYColor4B p0 ) {
/* .locals 1 */
/* .param p0, "color" # Lcom/wiyun/engine/types/WYColor4B; */
/* .prologue */
/* .line 74 */
/* new-instance v0, Lcom/wiyun/engine/nodes/ScrollableLayer; */
/* invoke-direct {v0, p0}, Lcom/wiyun/engine/nodes/ScrollableLayer;-><init>(Lcom/wiyun/engine/types/WYColor4B;)V */
} // .end method
private native void nativeGetScrollExtent ( com.wiyun.engine.types.WYSize p0 ) {
} // .end method
private native void nativeInit ( com.wiyun.engine.types.WYColor4B p0 ) {
} // .end method
/* # virtual methods */
public void addScrollableChild ( com.wiyun.engine.nodes.Node p0 ) {
/* .locals 2 */
/* .param p1, "child" # Lcom/wiyun/engine/nodes/Node; */
/* .prologue */
/* .line 148 */
int v0 = 0; // const/4 v0, 0x0
int v1 = -1; // const/4 v1, -0x1
(( com.wiyun.engine.nodes.ScrollableLayer ) p0 ).addScrollableChild ( p1, v0, v1 ); // invoke-virtual {p0, p1, v0, v1}, Lcom/wiyun/engine/nodes/ScrollableLayer;->addScrollableChild(Lcom/wiyun/engine/nodes/Node;II)V
/* .line 149 */
return;
} // .end method
public void addScrollableChild ( com.wiyun.engine.nodes.Node p0, Integer p1 ) {
/* .locals 1 */
/* .param p1, "child" # Lcom/wiyun/engine/nodes/Node; */
/* .param p2, "z" # I */
/* .prologue */
/* .line 158 */
int v0 = -1; // const/4 v0, -0x1
(( com.wiyun.engine.nodes.ScrollableLayer ) p0 ).addScrollableChild ( p1, p2, v0 ); // invoke-virtual {p0, p1, p2, v0}, Lcom/wiyun/engine/nodes/ScrollableLayer;->addScrollableChild(Lcom/wiyun/engine/nodes/Node;II)V
/* .line 159 */
return;
} // .end method
public native void addScrollableChild ( com.wiyun.engine.nodes.Node p0, Integer p1, Integer p2 ) {
} // .end method
protected void doNativeInit ( ) {
/* .locals 0 */
/* .prologue */
/* .line 103 */
return;
} // .end method
public native Float getBottomMargin ( ) {
} // .end method
public native Float getLeftMargin ( ) {
} // .end method
public native Float getOffsetX ( ) {
} // .end method
public native Float getOffsetY ( ) {
} // .end method
public native Float getRightMargin ( ) {
} // .end method
public com.wiyun.engine.types.WYSize getScrollExtent ( ) {
/* .locals 1 */
/* .prologue */
/* .line 218 */
com.wiyun.engine.types.WYSize .makeZero ( );
/* .line 219 */
/* .local v0, "s":Lcom/wiyun/engine/types/WYSize; */
/* invoke-direct {p0, v0}, Lcom/wiyun/engine/nodes/ScrollableLayer;->nativeGetScrollExtent(Lcom/wiyun/engine/types/WYSize;)V */
/* .line 220 */
} // .end method
public native Integer getScrollableChildByTag ( Integer p0 ) {
} // .end method
public native Float getThumbFadeOutTime ( ) {
} // .end method
public native Float getTopMargin ( ) {
} // .end method
public native Boolean isAtXEnd ( ) {
} // .end method
public native Boolean isAtYEnd ( ) {
} // .end method
public native Boolean isHorizontal ( ) {
} // .end method
public native Boolean isVertical ( ) {
} // .end method
public native void removeAllScrollableChildrenLocked ( Boolean p0 ) {
} // .end method
public native void removeScrollableChild ( com.wiyun.engine.nodes.Node p0, Boolean p1 ) {
} // .end method
public native void removeScrollableChildByTag ( Integer p0, Boolean p1 ) {
} // .end method
public native void setBottomMargin ( Float p0 ) {
} // .end method
public native void setCallback ( com.wiyun.engine.nodes.ScrollableLayer$IScrollableLayerCallback p0 ) {
} // .end method
public native void setHorizontal ( Boolean p0 ) {
} // .end method
public native void setHorizontalThumb ( com.wiyun.engine.nodes.Node p0 ) {
} // .end method
public native void setLeftMargin ( Float p0 ) {
} // .end method
public native void setOffsetX ( Float p0 ) {
} // .end method
public native void setOffsetY ( Float p0 ) {
} // .end method
public native void setRightMargin ( Float p0 ) {
} // .end method
public native void setThumbFadeOutTime ( Float p0 ) {
} // .end method
public native void setTopMargin ( Float p0 ) {
} // .end method
public native void setVertical ( Boolean p0 ) {
} // .end method
public native void setVerticalThumb ( com.wiyun.engine.nodes.Node p0 ) {
} // .end method
