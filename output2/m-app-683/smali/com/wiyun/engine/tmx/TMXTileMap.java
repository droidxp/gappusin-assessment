public class com.wiyun.engine.tmx.TMXTileMap extends com.wiyun.engine.nodes.Node {
	 /* .source "TMXTileMap.java" */
	 /* # static fields */
	 public static final Integer ORIENTATION_HEXAGONAL;
	 public static final Integer ORIENTATION_ISOMETRIC;
	 public static final Integer ORIENTATION_ORTHOGONAL;
	 /* # direct methods */
	 protected com.wiyun.engine.tmx.TMXTileMap ( ) {
		 /* .locals 0 */
		 /* .param p1, "pointer" # I */
		 /* .prologue */
		 /* .line 82 */
		 /* invoke-direct {p0, p1}, Lcom/wiyun/engine/nodes/Node;-><init>(I)V */
		 /* .line 83 */
		 return;
	 } // .end method
	 protected com.wiyun.engine.tmx.TMXTileMap ( ) {
		 /* .locals 0 */
		 /* .param p1, "resId" # I */
		 /* .param p2, "tex" # [Lcom/wiyun/engine/opengl/Texture2D; */
		 /* .prologue */
		 /* .line 63 */
		 /* invoke-direct {p0}, Lcom/wiyun/engine/nodes/Node;-><init>()V */
		 /* .line 64 */
		 /* invoke-direct {p0, p1, p2}, Lcom/wiyun/engine/tmx/TMXTileMap;->nativeInit(I[Lcom/wiyun/engine/opengl/Texture2D;)V */
		 /* .line 65 */
		 return;
	 } // .end method
	 protected com.wiyun.engine.tmx.TMXTileMap ( ) {
		 /* .locals 0 */
		 /* .param p1, "path" # Ljava/lang/String; */
		 /* .param p2, "isFile" # Z */
		 /* .param p3, "tex" # [Lcom/wiyun/engine/opengl/Texture2D; */
		 /* .prologue */
		 /* .line 67 */
		 /* invoke-direct {p0}, Lcom/wiyun/engine/nodes/Node;-><init>()V */
		 /* .line 68 */
		 /* invoke-direct {p0, p1, p2, p3}, Lcom/wiyun/engine/tmx/TMXTileMap;->nativeInit(Ljava/lang/String;Z[Lcom/wiyun/engine/opengl/Texture2D;)V */
		 /* .line 69 */
		 return;
	 } // .end method
	 public static com.wiyun.engine.nodes.Node from ( Integer p0 ) { //bridge//synthethic
		 /* .locals 1 */
		 /* .prologue */
		 /* .line 1 */
		 com.wiyun.engine.tmx.TMXTileMap .from ( p0 );
	 } // .end method
	 public static com.wiyun.engine.tmx.TMXTileMap from ( Integer p0 ) {
		 /* .locals 1 */
		 /* .param p0, "pointer" # I */
		 /* .prologue */
		 /* .line 78 */
		 /* if-nez p0, :cond_0 */
		 int v0 = 0; // const/4 v0, 0x0
	 } // :goto_0
} // :cond_0
/* new-instance v0, Lcom/wiyun/engine/tmx/TMXTileMap; */
/* invoke-direct {v0, p0}, Lcom/wiyun/engine/tmx/TMXTileMap;-><init>(I)V */
} // .end method
public static com.wiyun.engine.tmx.TMXTileMap make ( Integer p0, com.wiyun.engine.opengl.Texture2D...p1 ) {
/* .locals 1 */
/* .param p0, "resId" # I */
/* .param p1, "tex" # [Lcom/wiyun/engine/opengl/Texture2D; */
/* .prologue */
/* .line 38 */
/* new-instance v0, Lcom/wiyun/engine/tmx/TMXTileMap; */
/* invoke-direct {v0, p0, p1}, Lcom/wiyun/engine/tmx/TMXTileMap;-><init>(I[Lcom/wiyun/engine/opengl/Texture2D;)V */
} // .end method
public static com.wiyun.engine.tmx.TMXTileMap make ( java.lang.String p0, Boolean p1, com.wiyun.engine.opengl.Texture2D...p2 ) {
/* .locals 1 */
/* .param p0, "path" # Ljava/lang/String; */
/* .param p1, "isFile" # Z */
/* .param p2, "tex" # [Lcom/wiyun/engine/opengl/Texture2D; */
/* .prologue */
/* .line 60 */
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
/* .prologue */
/* .line 87 */
return;
} // .end method
public native Integer getAlpha ( ) {
} // .end method
public com.wiyun.engine.types.WYColor3B getColor ( ) {
/* .locals 1 */
/* .prologue */
/* .line 212 */
/* new-instance v0, Lcom/wiyun/engine/types/WYColor3B; */
/* invoke-direct {v0}, Lcom/wiyun/engine/types/WYColor3B;-><init>()V */
/* .line 213 */
/* .local v0, "color":Lcom/wiyun/engine/types/WYColor3B; */
/* invoke-direct {p0, v0}, Lcom/wiyun/engine/tmx/TMXTileMap;->nativeGetColor(Lcom/wiyun/engine/types/WYColor3B;)V */
/* .line 214 */
} // .end method
public native Integer getMapHeight ( ) {
} // .end method
public native Integer getMapWidth ( ) {
} // .end method
public com.wiyun.engine.tmx.TMXObjectGroup getObjectGroup ( java.lang.String p0 ) {
/* .locals 1 */
/* .param p1, "name" # Ljava/lang/String; */
/* .prologue */
/* .line 123 */
v0 = /* invoke-direct {p0, p1}, Lcom/wiyun/engine/tmx/TMXTileMap;->nativeGetObjectGroup(Ljava/lang/String;)I */
com.wiyun.engine.tmx.TMXObjectGroup .from ( v0 );
} // .end method
public native Integer getOrientation ( ) {
} // .end method
public native java.lang.String getProperty ( java.lang.String p0 ) {
} // .end method
public com.wiyun.engine.tmx.TMXLayer getTMXLayer ( java.lang.String p0 ) {
/* .locals 2 */
/* .param p1, "name" # Ljava/lang/String; */
/* .prologue */
/* .line 99 */
/* new-instance v0, Lcom/wiyun/engine/tmx/TMXLayer; */
v1 = /* invoke-direct {p0, p1}, Lcom/wiyun/engine/tmx/TMXTileMap;->nativeGetTMXLayer(Ljava/lang/String;)I */
/* invoke-direct {v0, v1}, Lcom/wiyun/engine/tmx/TMXLayer;-><init>(I)V */
} // .end method
public com.wiyun.engine.tmx.TMXLayer getTMXLayerAt ( Integer p0 ) {
/* .locals 2 */
/* .param p1, "index" # I */
/* .prologue */
/* .line 111 */
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
/* .param p1, "p" # Lcom/wiyun/engine/types/WYPoint; */
/* .prologue */
/* .line 179 */
com.wiyun.engine.types.WYPoint .makeZero ( );
/* .line 180 */
/* .local v0, "out":Lcom/wiyun/engine/types/WYPoint; */
/* invoke-direct {p0, p1, v0}, Lcom/wiyun/engine/tmx/TMXTileMap;->nativeNodeToTMXSpace(Lcom/wiyun/engine/types/WYPoint;Lcom/wiyun/engine/types/WYPoint;)V */
/* .line 181 */
} // .end method
public native void setAlpha ( Integer p0 ) {
} // .end method
public void setColor ( com.wiyun.engine.types.WYColor3B p0 ) {
/* .locals 3 */
/* .param p1, "color" # Lcom/wiyun/engine/types/WYColor3B; */
/* .prologue */
/* .line 220 */
/* iget v0, p1, Lcom/wiyun/engine/types/WYColor3B;->r:I */
/* iget v1, p1, Lcom/wiyun/engine/types/WYColor3B;->g:I */
/* iget v2, p1, Lcom/wiyun/engine/types/WYColor3B;->b:I */
/* invoke-direct {p0, v0, v1, v2}, Lcom/wiyun/engine/tmx/TMXTileMap;->nativeSetColor(III)V */
/* .line 221 */
return;
} // .end method
public native void setDebugDrawObjects ( Boolean p0 ) {
} // .end method
public com.wiyun.engine.types.WYPoint tmxToNodeSpace ( com.wiyun.engine.types.WYPoint p0 ) {
/* .locals 1 */
/* .param p1, "p" # Lcom/wiyun/engine/types/WYPoint; */
/* .prologue */
/* .line 200 */
com.wiyun.engine.types.WYPoint .makeZero ( );
/* .line 201 */
/* .local v0, "out":Lcom/wiyun/engine/types/WYPoint; */
/* invoke-direct {p0, p1, v0}, Lcom/wiyun/engine/tmx/TMXTileMap;->nativeTMXToNodeSpace(Lcom/wiyun/engine/types/WYPoint;Lcom/wiyun/engine/types/WYPoint;)V */
/* .line 202 */
} // .end method
