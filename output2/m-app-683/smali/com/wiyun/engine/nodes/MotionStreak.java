public class com.wiyun.engine.nodes.MotionStreak extends com.wiyun.engine.nodes.Node implements com.wiyun.engine.nodes.Node$IBlendableTextureOwner {
	 /* .source "MotionStreak.java" */
	 /* # interfaces */
	 /* # static fields */
	 public static final Integer STYLE_BLADE;
	 public static final Integer STYLE_LINE;
	 public static final Integer STYLE_SPOT;
	 public static final Integer STYLE_STRIP;
	 /* # direct methods */
	 protected com.wiyun.engine.nodes.MotionStreak ( ) {
		 /* .locals 0 */
		 /* .param p1, "fade" # F */
		 /* .param p2, "tex" # Lcom/wiyun/engine/opengl/Texture2D; */
		 /* .param p3, "color" # Lcom/wiyun/engine/types/WYColor4B; */
		 /* .param p4, "style" # I */
		 /* .prologue */
		 /* .line 66 */
		 /* invoke-direct {p0}, Lcom/wiyun/engine/nodes/Node;-><init>()V */
		 /* .line 67 */
		 /* invoke-direct {p0, p1, p2, p3, p4}, Lcom/wiyun/engine/nodes/MotionStreak;->nativeInit(FLcom/wiyun/engine/opengl/Texture2D;Lcom/wiyun/engine/types/WYColor4B;I)V */
		 /* .line 68 */
		 return;
	 } // .end method
	 protected com.wiyun.engine.nodes.MotionStreak ( ) {
		 /* .locals 0 */
		 /* .param p1, "pointer" # I */
		 /* .prologue */
		 /* .line 81 */
		 /* invoke-direct {p0, p1}, Lcom/wiyun/engine/nodes/Node;-><init>(I)V */
		 /* .line 82 */
		 return;
	 } // .end method
	 public static com.wiyun.engine.nodes.MotionStreak from ( Integer p0 ) {
		 /* .locals 1 */
		 /* .param p0, "pointer" # I */
		 /* .prologue */
		 /* .line 77 */
		 /* if-nez p0, :cond_0 */
		 int v0 = 0; // const/4 v0, 0x0
	 } // :goto_0
} // :cond_0
/* new-instance v0, Lcom/wiyun/engine/nodes/MotionStreak; */
/* invoke-direct {v0, p0}, Lcom/wiyun/engine/nodes/MotionStreak;-><init>(I)V */
} // .end method
public static com.wiyun.engine.nodes.Node from ( Integer p0 ) { //bridge//synthethic
/* .locals 1 */
/* .prologue */
/* .line 1 */
com.wiyun.engine.nodes.MotionStreak .from ( p0 );
} // .end method
private native Integer getBlendFuncDst ( ) {
} // .end method
private native Integer getBlendFuncSrc ( ) {
} // .end method
public static com.wiyun.engine.nodes.MotionStreak make ( Float p0, com.wiyun.engine.opengl.Texture2D p1, com.wiyun.engine.types.WYColor4B p2 ) {
/* .locals 1 */
/* .param p0, "fade" # F */
/* .param p1, "tex" # Lcom/wiyun/engine/opengl/Texture2D; */
/* .param p2, "color" # Lcom/wiyun/engine/types/WYColor4B; */
/* .prologue */
/* .line 46 */
int v0 = 0; // const/4 v0, 0x0
com.wiyun.engine.nodes.MotionStreak .make ( p0,p1,p2,v0 );
} // .end method
public static com.wiyun.engine.nodes.MotionStreak make ( Float p0, com.wiyun.engine.opengl.Texture2D p1, com.wiyun.engine.types.WYColor4B p2, Integer p3 ) {
/* .locals 1 */
/* .param p0, "fade" # F */
/* .param p1, "tex" # Lcom/wiyun/engine/opengl/Texture2D; */
/* .param p2, "color" # Lcom/wiyun/engine/types/WYColor4B; */
/* .param p3, "style" # I */
/* .prologue */
/* .line 58 */
/* new-instance v0, Lcom/wiyun/engine/nodes/MotionStreak; */
/* invoke-direct {v0, p0, p1, p2, p3}, Lcom/wiyun/engine/nodes/MotionStreak;-><init>(FLcom/wiyun/engine/opengl/Texture2D;Lcom/wiyun/engine/types/WYColor4B;I)V */
} // .end method
private native void nativeGetCurrentLocation ( com.wiyun.engine.types.WYPoint p0 ) {
} // .end method
private native void nativeGetLastLocation ( com.wiyun.engine.types.WYPoint p0 ) {
} // .end method
private native Integer nativeGetTexture ( ) {
} // .end method
private native void nativeInit ( Float p0, com.wiyun.engine.opengl.Texture2D p1, com.wiyun.engine.types.WYColor4B p2, Integer p3 ) {
} // .end method
private native void setBlendFunc ( Integer p0, Integer p1 ) {
} // .end method
/* # virtual methods */
public void addPoint ( Float p0, Float p1 ) {
/* .locals 1 */
/* .param p1, "x" # F */
/* .param p2, "y" # F */
/* .prologue */
/* .line 147 */
int v0 = 0; // const/4 v0, 0x0
(( com.wiyun.engine.nodes.MotionStreak ) p0 ).addPoint ( p1, p2, v0 ); // invoke-virtual {p0, p1, p2, v0}, Lcom/wiyun/engine/nodes/MotionStreak;->addPoint(FFZ)V
/* .line 148 */
return;
} // .end method
public native void addPoint ( Float p0, Float p1, Boolean p2 ) {
} // .end method
protected void doNativeInit ( ) {
/* .locals 0 */
/* .prologue */
/* .line 88 */
return;
} // .end method
public com.wiyun.engine.types.WYBlendFunc getBlendFunc ( ) {
/* .locals 3 */
/* .prologue */
/* .line 124 */
/* new-instance v0, Lcom/wiyun/engine/types/WYBlendFunc; */
v1 = /* invoke-direct {p0}, Lcom/wiyun/engine/nodes/MotionStreak;->getBlendFuncSrc()I */
v2 = /* invoke-direct {p0}, Lcom/wiyun/engine/nodes/MotionStreak;->getBlendFuncDst()I */
/* invoke-direct {v0, v1, v2}, Lcom/wiyun/engine/types/WYBlendFunc;-><init>(II)V */
} // .end method
public com.wiyun.engine.types.WYPoint getCurrentLocation ( ) {
/* .locals 1 */
/* .prologue */
/* .line 109 */
com.wiyun.engine.types.WYPoint .makeZero ( );
/* .line 110 */
/* .local v0, "p":Lcom/wiyun/engine/types/WYPoint; */
/* invoke-direct {p0, v0}, Lcom/wiyun/engine/nodes/MotionStreak;->nativeGetCurrentLocation(Lcom/wiyun/engine/types/WYPoint;)V */
/* .line 111 */
} // .end method
public com.wiyun.engine.types.WYPoint getLastLocation ( ) {
/* .locals 1 */
/* .prologue */
/* .line 96 */
com.wiyun.engine.types.WYPoint .makeZero ( );
/* .line 97 */
/* .local v0, "p":Lcom/wiyun/engine/types/WYPoint; */
/* invoke-direct {p0, v0}, Lcom/wiyun/engine/nodes/MotionStreak;->nativeGetLastLocation(Lcom/wiyun/engine/types/WYPoint;)V */
/* .line 98 */
} // .end method
public native Integer getRibbon ( ) {
} // .end method
public native Float getSegmentThreshold ( ) {
} // .end method
public native Integer getStyle ( ) {
} // .end method
public com.wiyun.engine.opengl.Texture2D getTexture ( ) {
/* .locals 1 */
/* .prologue */
/* .line 117 */
v0 = /* invoke-direct {p0}, Lcom/wiyun/engine/nodes/MotionStreak;->nativeGetTexture()I */
com.wiyun.engine.opengl.Texture2D .from ( v0 );
} // .end method
public native Boolean isPaused ( ) {
} // .end method
public native void reset ( ) {
} // .end method
public void setBlendFunc ( com.wiyun.engine.types.WYBlendFunc p0 ) {
/* .locals 2 */
/* .param p1, "blendFunc" # Lcom/wiyun/engine/types/WYBlendFunc; */
/* .prologue */
/* .line 131 */
/* iget v0, p1, Lcom/wiyun/engine/types/WYBlendFunc;->src:I */
/* iget v1, p1, Lcom/wiyun/engine/types/WYBlendFunc;->dst:I */
/* invoke-direct {p0, v0, v1}, Lcom/wiyun/engine/nodes/MotionStreak;->setBlendFunc(II)V */
/* .line 132 */
return;
} // .end method
public native void setPaused ( Boolean p0 ) {
} // .end method
public native void setSegmentThreshold ( Float p0 ) {
} // .end method
public native void setTexture ( com.wiyun.engine.opengl.Texture2D p0 ) {
} // .end method
