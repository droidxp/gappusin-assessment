public class com.wiyun.engine.nodes.Slider extends com.wiyun.engine.nodes.Node {
	 /* .source "Slider.java" */
	 /* # annotations */
	 /* .annotation system Ldalvik/annotation/MemberClasses; */
	 /* value = { */
	 /* Lcom/wiyun/engine/nodes/Slider$ISliderCallback; */
	 /* } */
} // .end annotation
/* # direct methods */
protected com.wiyun.engine.nodes.Slider ( ) {
	 /* .locals 0 */
	 /* .param p1, "pointer" # I */
	 /* .prologue */
	 /* .line 68 */
	 /* invoke-direct {p0, p1}, Lcom/wiyun/engine/nodes/Node;-><init>(I)V */
	 /* .line 69 */
	 return;
} // .end method
protected com.wiyun.engine.nodes.Slider ( ) {
	 /* .locals 0 */
	 /* .param p1, "bg" # Lcom/wiyun/engine/nodes/Sprite; */
	 /* .param p2, "bar" # Lcom/wiyun/engine/nodes/Sprite; */
	 /* .param p3, "thumb" # Lcom/wiyun/engine/nodes/Sprite; */
	 /* .param p4, "vertical" # Z */
	 /* .prologue */
	 /* .line 63 */
	 /* invoke-direct {p0}, Lcom/wiyun/engine/nodes/Node;-><init>()V */
	 /* .line 64 */
	 /* invoke-direct {p0, p1, p2, p3, p4}, Lcom/wiyun/engine/nodes/Slider;->nativeInit(Lcom/wiyun/engine/nodes/Sprite;Lcom/wiyun/engine/nodes/Sprite;Lcom/wiyun/engine/nodes/Sprite;Z)V */
	 /* .line 65 */
	 return;
} // .end method
public static com.wiyun.engine.nodes.Node from ( Integer p0 ) { //bridge//synthethic
	 /* .locals 1 */
	 /* .prologue */
	 /* .line 1 */
	 com.wiyun.engine.nodes.Slider .from ( p0 );
} // .end method
public static com.wiyun.engine.nodes.Slider from ( Integer p0 ) {
	 /* .locals 1 */
	 /* .param p0, "pointer" # I */
	 /* .prologue */
	 /* .line 21 */
	 /* if-nez p0, :cond_0 */
	 int v0 = 0; // const/4 v0, 0x0
} // :goto_0
} // :cond_0
/* new-instance v0, Lcom/wiyun/engine/nodes/Slider; */
/* invoke-direct {v0, p0}, Lcom/wiyun/engine/nodes/Slider;-><init>(I)V */
} // .end method
public static com.wiyun.engine.nodes.Slider make ( com.wiyun.engine.nodes.Sprite p0, com.wiyun.engine.nodes.Sprite p1, com.wiyun.engine.nodes.Sprite p2 ) {
/* .locals 1 */
/* .param p0, "bg" # Lcom/wiyun/engine/nodes/Sprite; */
/* .param p1, "bar" # Lcom/wiyun/engine/nodes/Sprite; */
/* .param p2, "thumb" # Lcom/wiyun/engine/nodes/Sprite; */
/* .prologue */
/* .line 35 */
int v0 = 0; // const/4 v0, 0x0
com.wiyun.engine.nodes.Slider .make ( p0,p1,p2,v0 );
} // .end method
public static com.wiyun.engine.nodes.Slider make ( com.wiyun.engine.nodes.Sprite p0, com.wiyun.engine.nodes.Sprite p1, com.wiyun.engine.nodes.Sprite p2, Boolean p3 ) {
/* .locals 1 */
/* .param p0, "bg" # Lcom/wiyun/engine/nodes/Sprite; */
/* .param p1, "bar" # Lcom/wiyun/engine/nodes/Sprite; */
/* .param p2, "thumb" # Lcom/wiyun/engine/nodes/Sprite; */
/* .param p3, "vertical" # Z */
/* .prologue */
/* .line 50 */
/* new-instance v0, Lcom/wiyun/engine/nodes/Slider; */
/* invoke-direct {v0, p0, p1, p2, p3}, Lcom/wiyun/engine/nodes/Slider;-><init>(Lcom/wiyun/engine/nodes/Sprite;Lcom/wiyun/engine/nodes/Sprite;Lcom/wiyun/engine/nodes/Sprite;Z)V */
} // .end method
private native void nativeInit ( com.wiyun.engine.nodes.Sprite p0, com.wiyun.engine.nodes.Sprite p1, com.wiyun.engine.nodes.Sprite p2, Boolean p3 ) {
} // .end method
/* # virtual methods */
protected void doNativeInit ( ) {
/* .locals 0 */
/* .prologue */
/* .line 73 */
return;
} // .end method
public native Float getMax ( ) {
} // .end method
public native Float getMin ( ) {
} // .end method
public native Float getValue ( ) {
} // .end method
public native Boolean isShowFullBar ( ) {
} // .end method
public native Boolean isVertical ( ) {
} // .end method
public native void setCallback ( com.wiyun.engine.nodes.Slider$ISliderCallback p0 ) {
} // .end method
public native void setMax ( Float p0 ) {
} // .end method
public native void setMin ( Float p0 ) {
} // .end method
public native void setShowFullBar ( Boolean p0 ) {
} // .end method
public native void setValue ( Float p0 ) {
} // .end method
