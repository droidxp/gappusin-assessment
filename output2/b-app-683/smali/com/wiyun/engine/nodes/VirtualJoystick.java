public class com.wiyun.engine.nodes.VirtualJoystick extends com.wiyun.engine.nodes.Node {
	 /* .source "VirtualJoystick.java" */
	 /* # annotations */
	 /* .annotation system Ldalvik/annotation/MemberClasses; */
	 /* value = { */
	 /* Lcom/wiyun/engine/nodes/VirtualJoystick$IVirtualJoystickCallback; */
	 /* } */
} // .end annotation
/* # static fields */
public static final Integer VJD_CENTER;
public static final Integer VJD_EAST;
public static final Integer VJD_NORTH;
public static final Integer VJD_NORTH_EAST;
public static final Integer VJD_NORTH_WEST;
public static final Integer VJD_SOUTH;
public static final Integer VJD_SOUTH_EAST;
public static final Integer VJD_SOUTH_WEST;
public static final Integer VJD_WEST;
public static final Integer VJS_FIVE_DIRECTIONS;
public static final Integer VJS_FULL_DIRECTIONS;
public static final Integer VJS_NINE_DIRECTIONS;
/* # direct methods */
protected com.wiyun.engine.nodes.VirtualJoystick ( ) {
	 /* .locals 0 */
	 /* .param p1, "pointer" # I */
	 /* .prologue */
	 /* .line 78 */
	 /* invoke-direct {p0, p1}, Lcom/wiyun/engine/nodes/Node;-><init>(I)V */
	 /* .line 79 */
	 return;
} // .end method
protected com.wiyun.engine.nodes.VirtualJoystick ( ) {
	 /* .locals 0 */
	 /* .param p1, "bg" # Lcom/wiyun/engine/nodes/Node; */
	 /* .param p2, "rocker" # Lcom/wiyun/engine/nodes/Node; */
	 /* .prologue */
	 /* .line 81 */
	 /* invoke-direct {p0}, Lcom/wiyun/engine/nodes/Node;-><init>()V */
	 /* .line 82 */
	 /* invoke-direct {p0, p1, p2}, Lcom/wiyun/engine/nodes/VirtualJoystick;->nativeInit(Lcom/wiyun/engine/nodes/Node;Lcom/wiyun/engine/nodes/Node;)V */
	 /* .line 83 */
	 return;
} // .end method
public static com.wiyun.engine.nodes.Node from ( Integer p0 ) { //bridge//synthethic
	 /* .locals 1 */
	 /* .prologue */
	 /* .line 1 */
	 com.wiyun.engine.nodes.VirtualJoystick .from ( p0 );
} // .end method
public static com.wiyun.engine.nodes.VirtualJoystick from ( Integer p0 ) {
	 /* .locals 1 */
	 /* .param p0, "pointer" # I */
	 /* .prologue */
	 /* .line 74 */
	 /* if-nez p0, :cond_0 */
	 int v0 = 0; // const/4 v0, 0x0
} // :goto_0
} // :cond_0
/* new-instance v0, Lcom/wiyun/engine/nodes/VirtualJoystick; */
/* invoke-direct {v0, p0}, Lcom/wiyun/engine/nodes/VirtualJoystick;-><init>(I)V */
} // .end method
public static com.wiyun.engine.nodes.VirtualJoystick make ( com.wiyun.engine.nodes.Node p0, com.wiyun.engine.nodes.Node p1 ) {
/* .locals 1 */
/* .param p0, "bg" # Lcom/wiyun/engine/nodes/Node; */
/* .param p1, "rocker" # Lcom/wiyun/engine/nodes/Node; */
/* .prologue */
/* .line 70 */
/* new-instance v0, Lcom/wiyun/engine/nodes/VirtualJoystick; */
/* invoke-direct {v0, p0, p1}, Lcom/wiyun/engine/nodes/VirtualJoystick;-><init>(Lcom/wiyun/engine/nodes/Node;Lcom/wiyun/engine/nodes/Node;)V */
} // .end method
private native void nativeInit ( com.wiyun.engine.nodes.Node p0, com.wiyun.engine.nodes.Node p1 ) {
} // .end method
/* # virtual methods */
protected void doNativeInit ( ) {
/* .locals 0 */
/* .prologue */
/* .line 89 */
return;
} // .end method
public native Integer getEventStyle ( ) {
} // .end method
public native Boolean isAutoReset ( ) {
} // .end method
public native void setAutoReset ( Boolean p0 ) {
} // .end method
public native void setCallback ( com.wiyun.engine.nodes.VirtualJoystick$IVirtualJoystickCallback p0 ) {
} // .end method
public native void setEventStyle ( Integer p0 ) {
} // .end method
