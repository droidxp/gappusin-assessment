public class com.wiyun.engine.tmx.TMXTileMap extends com.wiyun.engine.nodes.Node {
	 /* # static fields */
	 public static final Integer ORIENTATION_HEXAGONAL;
	 public static final Integer ORIENTATION_ISOMETRIC;
	 public static final Integer ORIENTATION_ORTHOGONAL;
	 /* # direct methods */
	 protected com.wiyun.engine.tmx.TMXTileMap ( ) {
		 /* .locals 0 */
		 /* invoke-direct {p0, p1}, Lcom/wiyun/engine/nodes/Node;-><init>(I)V */
		 return;
	 } // .end method
	 protected com.wiyun.engine.tmx.TMXTileMap ( ) {
		 /* .locals 0 */
		 /* invoke-direct {p0}, Lcom/wiyun/engine/nodes/Node;-><init>()V */
		 /* invoke-direct {p0, p1, p2}, Lcom/wiyun/engine/tmx/TMXTileMap;->nativeInit(I[Lcom/wiyun/engine/opengl/Texture2D;)V */
		 return;
	 } // .end method
	 protected com.wiyun.engine.tmx.TMXTileMap ( ) {
		 /* .locals 0 */
		 /* invoke-direct {p0}, Lcom/wiyun/engine/nodes/Node;-><init>()V */
		 /* invoke-direct {p0, p1, p2, p3}, Lcom/wiyun/engine/tmx/TMXTileMap;->nativeInit(Ljava/lang/String;Z[Lcom/wiyun/engine/opengl/Texture2D;)V */
		 return;
	 } // .end method
	 public static com.wiyun.engine.nodes.Node from ( Integer p0 ) { //bridge//synthethic
		 /* .locals 1 */
		 com.wiyun.engine.tmx.TMXTileMap .from ( p0 );
	 } // .end method
	 public static com.wiyun.engine.tmx.TMXTileMap from ( Integer p0 ) {
		 /* .locals 1 */
		 /* if-nez p0, :cond_0 */
		 int v0 = 0; // const/4 v0, 0x0
	 } // :goto_0
} // :cond_0
/* new-instance v0, Lcom/wiyun/engine/tmx/TMXTileMap; */
/* invoke-direct {v0, p0}, Lcom/wiyun/engine/tmx/TMXTileMap;-><init>(I)V */
} // .end method
public static com.wiyun.engine.tmx.TMXTileMap make ( Integer p0, com.wiyun.engine.opengl.Texture2D...p1 ) {
/* .locals 1 */
/* new-instance v0, Lcom/wiyun/engine/tmx/TMXTileMap; */
/* invoke-direct {v0, p0, p1}, Lcom/wiyun/engine/tmx/TMXTileMap;-><init>(I[Lcom/wiyun/engine/opengl/Texture2D;)V */
} // .end method
public static com.wiyun.engine.tmx.TMXTileMap make ( java.lang.String p0, Boolean p1, com.wiyun.engine.opengl.Texture2D...p2 ) {
/* .locals 1 */
/* new-instance v0, Lcom/wiyun/engine/tmx/TMXTileMap; */
/* invoke-direct {v0, p0, p1, p2}, Lcom/wiyun/engine/tmx/TMXTileMap;-><init>(Ljava/lang/String;Z[Lcom/wiyun/engine/opengl/Texture2D;)V */
} // .end method
private native void nativeGetColor ( com.wiyun.engine.types.WYColor3B p0 ) {
} // .end method
private native Integer nativeGetObjectGroup ( java.lang.String p0 ) {
} // .end method
private native Integer nativeGetTMXLayer ( java.lang.String p0 ) {
} // .end method
private native Integer nativeGetTMXLayerAt ( Integer p0 ) {
} // .end method
private native void nativeInit ( Integer p0, com.wiyun.engine.opengl.Texture2D...p1 ) {
} // .end method
private native void nativeInit ( java.lang.String p0, Boolean p1, com.wiyun.engine.opengl.Texture2D...p2 ) {
} // .end method
private native void nativeNodeToTMXSpace ( com.wiyun.engine.types.WYPoint p0, com.wiyun.engine.types.WYPoint p1 ) {
} // .end method
private native void nativeSetColor ( Integer p0, Integer p1, Integer p2 ) {
} // .end method
private native void nativeTMXToNodeSpace ( com.wiyun.engine.types.WYPoint p0, com.wiyun.engine.types.WYPoint p1 ) {
} // .end method
/* # virtual methods */
protected void doNativeInit ( ) {
/* .locals 0 */
return;
} // .end method
public native Integer getAlpha ( ) {
} // .end method
public com.wiyun.engine.types.WYColor3B getColor ( ) {
/* .locals 1 */
/* new-instance v0, Lcom/wiyun/engine/types/WYColor3B; */
/* invoke-direct {v0}, Lcom/wiyun/engine/types/WYColor3B;-><init>()V */
/* invoke-direct {p0, v0}, Lcom/wiyun/engine/tmx/TMXTileMap;->nativeGetColor(Lcom/wiyun/engine/types/WYColor3B;)V */
} // .end method
public native Integer getMapHeight ( ) {
} // .end method
public native Integer getMapWidth ( ) {
} // .end method
public com.wiyun.engine.tmx.TMXObjectGroup getObjectGroup ( java.lang.String p0 ) {
/* .locals 1 */
v0 = /* invoke-direct {p0, p1}, Lcom/wiyun/engine/tmx/TMXTileMap;->nativeGetObjectGroup(Ljava/lang/String;)I */
com.wiyun.engine.tmx.TMXObjectGroup .from ( v0 );
} // .end method
public native Integer getOrientation ( ) {
} // .end method
public native java.lang.String getProperty ( java.lang.String p0 ) {
} // .end method
public com.wiyun.engine.tmx.TMXLayer getTMXLayer ( java.lang.String p0 ) {
/* .locals 2 */
/* new-instance v0, Lcom/wiyun/engine/tmx/TMXLayer; */
v1 = /* invoke-direct {p0, p1}, Lcom/wiyun/engine/tmx/TMXTileMap;->nativeGetTMXLayer(Ljava/lang/String;)I */
/* invoke-direct {v0, v1}, Lcom/wiyun/engine/tmx/TMXLayer;-><init>(I)V */
} // .end method
public com.wiyun.engine.tmx.TMXLayer getTMXLayerAt ( Integer p0 ) {
/* .locals 2 */
/* new-instance v0, Lcom/wiyun/engine/tmx/TMXLayer; */
v1 = /* invoke-direct {p0, p1}, Lcom/wiyun/engine/tmx/TMXTileMap;->nativeGetTMXLayerAt(I)I */
/* invoke-direct {v0, v1}, Lcom/wiyun/engine/tmx/TMXLayer;-><init>(I)V */
} // .end method
public native Float getTileHeight ( ) {
} // .end method
public native java.lang.String getTileProperties ( Integer p0, java.lang.String p1 ) {
} // .end method
public native Float getTileWidth ( ) {
} // .end method
public com.wiyun.engine.types.WYPoint nodeToTMXSpace ( com.wiyun.engine.types.WYPoint p0 ) {
/* .locals 1 */
com.wiyun.engine.types.WYPoint .makeZero ( );
/* invoke-direct {p0, p1, v0}, Lcom/wiyun/engine/tmx/TMXTileMap;->nativeNodeToTMXSpace(Lcom/wiyun/engine/types/WYPoint;Lcom/wiyun/engine/types/WYPoint;)V */
} // .end method
public native void setAlpha ( Integer p0 ) {
} // .end method
public void setColor ( com.wiyun.engine.types.WYColor3B p0 ) {
/* .locals 3 */
/* iget v0, p1, Lcom/wiyun/engine/types/WYColor3B;->r:I */
/* iget v1, p1, Lcom/wiyun/engine/types/WYColor3B;->g:I */
/* iget v2, p1, Lcom/wiyun/engine/types/WYColor3B;->b:I */
/* invoke-direct {p0, v0, v1, v2}, Lcom/wiyun/engine/tmx/TMXTileMap;->nativeSetColor(III)V */
return;
} // .end method
public native void setDebugDrawObjects ( Boolean p0 ) {
} // .end method
public com.wiyun.engine.types.WYPoint tmxToNodeSpace ( com.wiyun.engine.types.WYPoint p0 ) {
/* .locals 1 */
com.wiyun.engine.types.WYPoint .makeZero ( );
/* invoke-direct {p0, p1, v0}, Lcom/wiyun/engine/tmx/TMXTileMap;->nativeTMXToNodeSpace(Lcom/wiyun/engine/types/WYPoint;Lcom/wiyun/engine/types/WYPoint;)V */
} // .end method
