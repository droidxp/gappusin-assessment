public class com.wiyun.engine.nodes.SpriteFrame extends com.wiyun.engine.nodes.Frame {
	 /* .source "SpriteFrame.java" */
	 /* # direct methods */
	 protected com.wiyun.engine.nodes.SpriteFrame ( ) {
		 /* .locals 0 */
		 /* .param p1, "duration" # F */
		 /* .param p2, "tex" # Lcom/wiyun/engine/opengl/Texture2D; */
		 /* .param p3, "rect" # Lcom/wiyun/engine/types/WYRect; */
		 /* .param p4, "offset" # Lcom/wiyun/engine/types/WYPoint; */
		 /* .param p5, "originalSize" # Lcom/wiyun/engine/types/WYSize; */
		 /* .param p6, "rotated" # Z */
		 /* .prologue */
		 /* .line 84 */
		 /* invoke-direct {p0}, Lcom/wiyun/engine/nodes/Frame;-><init>()V */
		 /* .line 85 */
		 /* invoke-direct/range {p0 ..p6}, Lcom/wiyun/engine/nodes/SpriteFrame;->nativeInit(FLcom/wiyun/engine/opengl/Texture2D;Lcom/wiyun/engine/types/WYRect;Lcom/wiyun/engine/types/WYPoint;Lcom/wiyun/engine/types/WYSize;Z)V */
		 /* .line 86 */
		 return;
	 } // .end method
	 protected com.wiyun.engine.nodes.SpriteFrame ( ) {
		 /* .locals 0 */
		 /* .param p1, "pointer" # I */
		 /* .prologue */
		 /* .line 89 */
		 /* invoke-direct {p0, p1}, Lcom/wiyun/engine/nodes/Frame;-><init>(I)V */
		 /* .line 90 */
		 return;
	 } // .end method
	 public static com.wiyun.engine.nodes.SpriteFrame from ( Integer p0 ) {
		 /* .locals 1 */
		 /* .param p0, "pointer" # I */
		 /* .prologue */
		 /* .line 81 */
		 /* if-nez p0, :cond_0 */
		 int v0 = 0; // const/4 v0, 0x0
	 } // :goto_0
} // :cond_0
/* new-instance v0, Lcom/wiyun/engine/nodes/SpriteFrame; */
/* invoke-direct {v0, p0}, Lcom/wiyun/engine/nodes/SpriteFrame;-><init>(I)V */
} // .end method
public static com.wiyun.engine.nodes.SpriteFrame make ( Float p0, com.wiyun.engine.opengl.Texture2D p1 ) {
/* .locals 4 */
/* .param p0, "duration" # F */
/* .param p1, "tex" # Lcom/wiyun/engine/opengl/Texture2D; */
/* .prologue */
int v3 = 0; // const/4 v3, 0x0
/* .line 35 */
v1 = (( com.wiyun.engine.opengl.Texture2D ) p1 ).getWidth ( ); // invoke-virtual {p1}, Lcom/wiyun/engine/opengl/Texture2D;->getWidth()F
v2 = (( com.wiyun.engine.opengl.Texture2D ) p1 ).getHeight ( ); // invoke-virtual {p1}, Lcom/wiyun/engine/opengl/Texture2D;->getHeight()F
com.wiyun.engine.types.WYRect .make ( v3,v3,v1,v2 );
/* .line 36 */
/* .local v0, "rect":Lcom/wiyun/engine/types/WYRect; */
com.wiyun.engine.nodes.SpriteFrame .make ( p0,p1,v0 );
} // .end method
public static com.wiyun.engine.nodes.SpriteFrame make ( Float p0, com.wiyun.engine.opengl.Texture2D p1, com.wiyun.engine.types.WYRect p2 ) {
/* .locals 2 */
/* .param p0, "duration" # F */
/* .param p1, "tex" # Lcom/wiyun/engine/opengl/Texture2D; */
/* .param p2, "rect" # Lcom/wiyun/engine/types/WYRect; */
/* .prologue */
/* .line 48 */
com.wiyun.engine.types.WYPoint .makeZero ( );
v1 = this.size;
com.wiyun.engine.nodes.SpriteFrame .make ( p0,p1,p2,v0,v1 );
} // .end method
public static com.wiyun.engine.nodes.SpriteFrame make ( Float p0, com.wiyun.engine.opengl.Texture2D p1, com.wiyun.engine.types.WYRect p2, com.wiyun.engine.types.WYPoint p3, com.wiyun.engine.types.WYSize p4 ) {
/* .locals 7 */
/* .param p0, "duration" # F */
/* .param p1, "tex" # Lcom/wiyun/engine/opengl/Texture2D; */
/* .param p2, "rect" # Lcom/wiyun/engine/types/WYRect; */
/* .param p3, "offset" # Lcom/wiyun/engine/types/WYPoint; */
/* .param p4, "originalSize" # Lcom/wiyun/engine/types/WYSize; */
/* .prologue */
/* .line 62 */
/* new-instance v0, Lcom/wiyun/engine/nodes/SpriteFrame; */
int v6 = 0; // const/4 v6, 0x0
/* move v1, p0 */
/* move-object v2, p1 */
/* move-object v3, p2 */
/* move-object v4, p3 */
/* move-object v5, p4 */
/* invoke-direct/range {v0 ..v6}, Lcom/wiyun/engine/nodes/SpriteFrame;-><init>(FLcom/wiyun/engine/opengl/Texture2D;Lcom/wiyun/engine/types/WYRect;Lcom/wiyun/engine/types/WYPoint;Lcom/wiyun/engine/types/WYSize;Z)V */
} // .end method
public static com.wiyun.engine.nodes.SpriteFrame make ( Float p0, com.wiyun.engine.opengl.Texture2D p1, com.wiyun.engine.types.WYRect p2, com.wiyun.engine.types.WYPoint p3, com.wiyun.engine.types.WYSize p4, Boolean p5 ) {
/* .locals 7 */
/* .param p0, "duration" # F */
/* .param p1, "tex" # Lcom/wiyun/engine/opengl/Texture2D; */
/* .param p2, "rect" # Lcom/wiyun/engine/types/WYRect; */
/* .param p3, "offset" # Lcom/wiyun/engine/types/WYPoint; */
/* .param p4, "originalSize" # Lcom/wiyun/engine/types/WYSize; */
/* .param p5, "rotated" # Z */
/* .prologue */
/* .line 77 */
/* new-instance v0, Lcom/wiyun/engine/nodes/SpriteFrame; */
/* move v1, p0 */
/* move-object v2, p1 */
/* move-object v3, p2 */
/* move-object v4, p3 */
/* move-object v5, p4 */
/* move v6, p5 */
/* invoke-direct/range {v0 ..v6}, Lcom/wiyun/engine/nodes/SpriteFrame;-><init>(FLcom/wiyun/engine/opengl/Texture2D;Lcom/wiyun/engine/types/WYRect;Lcom/wiyun/engine/types/WYPoint;Lcom/wiyun/engine/types/WYSize;Z)V */
} // .end method
public static com.wiyun.engine.nodes.SpriteFrame make ( Float p0, com.wiyun.engine.types.WYRect p1 ) {
/* .locals 1 */
/* .param p0, "duration" # F */
/* .param p1, "rect" # Lcom/wiyun/engine/types/WYRect; */
/* .prologue */
/* .line 24 */
int v0 = 0; // const/4 v0, 0x0
com.wiyun.engine.nodes.SpriteFrame .make ( p0,v0,p1 );
} // .end method
private native void nativeGetOffset ( com.wiyun.engine.types.WYPoint p0 ) {
} // .end method
private native void nativeGetOriginalSize ( com.wiyun.engine.types.WYPoint p0 ) {
} // .end method
private native void nativeGetRect ( com.wiyun.engine.types.WYRect p0 ) {
} // .end method
private native void nativeGetSourceColorRect ( com.wiyun.engine.types.WYRect p0 ) {
} // .end method
private native Integer nativeGetTexture ( ) {
} // .end method
private native void nativeInit ( Float p0, com.wiyun.engine.opengl.Texture2D p1, com.wiyun.engine.types.WYRect p2, com.wiyun.engine.types.WYPoint p3, com.wiyun.engine.types.WYSize p4, Boolean p5 ) {
} // .end method
/* # virtual methods */
public com.wiyun.engine.types.WYPoint getOffset ( ) {
/* .locals 1 */
/* .prologue */
/* .line 117 */
com.wiyun.engine.types.WYPoint .makeZero ( );
/* .line 118 */
/* .local v0, "offset":Lcom/wiyun/engine/types/WYPoint; */
/* invoke-direct {p0, v0}, Lcom/wiyun/engine/nodes/SpriteFrame;->nativeGetOffset(Lcom/wiyun/engine/types/WYPoint;)V */
/* .line 119 */
} // .end method
public com.wiyun.engine.types.WYPoint getOriginalSize ( ) {
/* .locals 1 */
/* .prologue */
/* .line 125 */
com.wiyun.engine.types.WYPoint .makeZero ( );
/* .line 126 */
/* .local v0, "size":Lcom/wiyun/engine/types/WYPoint; */
/* invoke-direct {p0, v0}, Lcom/wiyun/engine/nodes/SpriteFrame;->nativeGetOriginalSize(Lcom/wiyun/engine/types/WYPoint;)V */
/* .line 127 */
} // .end method
public com.wiyun.engine.types.WYRect getRect ( ) {
/* .locals 1 */
/* .prologue */
/* .line 101 */
com.wiyun.engine.types.WYRect .makeZero ( );
/* .line 102 */
/* .local v0, "rect":Lcom/wiyun/engine/types/WYRect; */
/* invoke-direct {p0, v0}, Lcom/wiyun/engine/nodes/SpriteFrame;->nativeGetRect(Lcom/wiyun/engine/types/WYRect;)V */
/* .line 103 */
} // .end method
public com.wiyun.engine.types.WYRect getSourceColorRect ( ) {
/* .locals 1 */
/* .prologue */
/* .line 109 */
com.wiyun.engine.types.WYRect .makeZero ( );
/* .line 110 */
/* .local v0, "rect":Lcom/wiyun/engine/types/WYRect; */
/* invoke-direct {p0, v0}, Lcom/wiyun/engine/nodes/SpriteFrame;->nativeGetSourceColorRect(Lcom/wiyun/engine/types/WYRect;)V */
/* .line 111 */
} // .end method
public com.wiyun.engine.opengl.Texture2D getTexture ( ) {
/* .locals 1 */
/* .prologue */
/* .line 95 */
v0 = /* invoke-direct {p0}, Lcom/wiyun/engine/nodes/SpriteFrame;->nativeGetTexture()I */
com.wiyun.engine.opengl.Texture2D .from ( v0 );
} // .end method
public native Boolean isRotated ( ) {
} // .end method
public native void setRotated ( Boolean p0 ) {
} // .end method
public native void setTexture ( com.wiyun.engine.opengl.Texture2D p0 ) {
} // .end method
