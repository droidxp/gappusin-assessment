public class com.wiyun.engine.nodes.Sprite extends com.wiyun.engine.nodes.TextureNode implements com.wiyun.engine.nodes.Node$IFrames {
	 /* .source "Sprite.java" */
	 /* # interfaces */
	 /* # direct methods */
	 protected com.wiyun.engine.nodes.Sprite ( ) {
		 /* .locals 0 */
		 /* .param p1, "pointer" # I */
		 /* .prologue */
		 /* .line 74 */
		 /* invoke-direct {p0, p1}, Lcom/wiyun/engine/nodes/TextureNode;-><init>(I)V */
		 /* .line 75 */
		 return;
	 } // .end method
	 protected com.wiyun.engine.nodes.Sprite ( ) {
		 /* .locals 0 */
		 /* .param p1, "tex" # Lcom/wiyun/engine/opengl/Texture2D; */
		 /* .prologue */
		 /* .line 48 */
		 /* invoke-direct {p0}, Lcom/wiyun/engine/nodes/TextureNode;-><init>()V */
		 /* .line 49 */
		 /* invoke-direct {p0, p1}, Lcom/wiyun/engine/nodes/Sprite;->nativeInit(Lcom/wiyun/engine/opengl/Texture2D;)V */
		 /* .line 50 */
		 return;
	 } // .end method
	 protected com.wiyun.engine.nodes.Sprite ( ) {
		 /* .locals 0 */
		 /* .param p1, "tex" # Lcom/wiyun/engine/opengl/Texture2D; */
		 /* .param p2, "texRect" # Lcom/wiyun/engine/types/WYRect; */
		 /* .prologue */
		 /* .line 58 */
		 /* invoke-direct {p0}, Lcom/wiyun/engine/nodes/TextureNode;-><init>()V */
		 /* .line 59 */
		 /* invoke-direct {p0, p1}, Lcom/wiyun/engine/nodes/Sprite;->nativeInit(Lcom/wiyun/engine/opengl/Texture2D;)V */
		 /* .line 60 */
		 (( com.wiyun.engine.nodes.Sprite ) p0 ).setTextureRect ( p2 ); // invoke-virtual {p0, p2}, Lcom/wiyun/engine/nodes/Sprite;->setTextureRect(Lcom/wiyun/engine/types/WYRect;)V
		 /* .line 61 */
		 return;
	 } // .end method
	 public static com.wiyun.engine.nodes.Sprite from ( Integer p0 ) {
		 /* .locals 1 */
		 /* .param p0, "pointer" # I */
		 /* .prologue */
		 /* .line 70 */
		 /* if-nez p0, :cond_0 */
		 int v0 = 0; // const/4 v0, 0x0
	 } // :goto_0
} // :cond_0
/* new-instance v0, Lcom/wiyun/engine/nodes/Sprite; */
/* invoke-direct {v0, p0}, Lcom/wiyun/engine/nodes/Sprite;-><init>(I)V */
} // .end method
public static com.wiyun.engine.nodes.TextureNode from ( Integer p0 ) { //bridge//synthethic
/* .locals 1 */
/* .prologue */
/* .line 1 */
com.wiyun.engine.nodes.Sprite .from ( p0 );
} // .end method
public static com.wiyun.engine.nodes.Sprite make ( Integer p0 ) {
/* .locals 2 */
/* .param p0, "resId" # I */
/* .prologue */
/* .line 19 */
/* new-instance v1, Lcom/wiyun/engine/nodes/Sprite; */
com.wiyun.engine.opengl.Texture2D .makePNG ( p0 );
(( com.wiyun.engine.opengl.Texture2D ) v0 ).autoRelease ( ); // invoke-virtual {v0}, Lcom/wiyun/engine/opengl/Texture2D;->autoRelease()Lcom/wiyun/engine/BaseWYObject;
/* check-cast v0, Lcom/wiyun/engine/opengl/Texture2D; */
/* invoke-direct {v1, v0}, Lcom/wiyun/engine/nodes/Sprite;-><init>(Lcom/wiyun/engine/opengl/Texture2D;)V */
} // .end method
public static com.wiyun.engine.nodes.Sprite make ( com.wiyun.engine.opengl.Texture2D p0 ) {
/* .locals 1 */
/* .param p0, "tex" # Lcom/wiyun/engine/opengl/Texture2D; */
/* .prologue */
/* .line 29 */
/* new-instance v0, Lcom/wiyun/engine/nodes/Sprite; */
/* invoke-direct {v0, p0}, Lcom/wiyun/engine/nodes/Sprite;-><init>(Lcom/wiyun/engine/opengl/Texture2D;)V */
} // .end method
public static com.wiyun.engine.nodes.Sprite make ( com.wiyun.engine.opengl.Texture2D p0, com.wiyun.engine.types.WYRect p1 ) {
/* .locals 1 */
/* .param p0, "tex" # Lcom/wiyun/engine/opengl/Texture2D; */
/* .param p1, "texRect" # Lcom/wiyun/engine/types/WYRect; */
/* .prologue */
/* .line 40 */
/* new-instance v0, Lcom/wiyun/engine/nodes/Sprite; */
/* invoke-direct {v0, p0, p1}, Lcom/wiyun/engine/nodes/Sprite;-><init>(Lcom/wiyun/engine/opengl/Texture2D;Lcom/wiyun/engine/types/WYRect;)V */
} // .end method
private native void nativeInit ( com.wiyun.engine.opengl.Texture2D p0 ) {
} // .end method
/* # virtual methods */
protected void doNativeInit ( ) {
/* .locals 0 */
/* .prologue */
/* .line 79 */
return;
} // .end method
