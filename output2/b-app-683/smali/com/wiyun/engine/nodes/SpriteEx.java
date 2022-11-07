public class com.wiyun.engine.nodes.SpriteEx extends com.wiyun.engine.nodes.TextureNode {
	 /* .source "SpriteEx.java" */
	 /* # direct methods */
	 protected com.wiyun.engine.nodes.SpriteEx ( ) {
		 /* .locals 0 */
		 /* .prologue */
		 /* .line 12 */
		 /* invoke-direct {p0}, Lcom/wiyun/engine/nodes/TextureNode;-><init>()V */
		 /* .line 13 */
		 return;
	 } // .end method
	 protected com.wiyun.engine.nodes.SpriteEx ( ) {
		 /* .locals 0 */
		 /* .param p1, "pointer" # I */
		 /* .prologue */
		 /* .line 16 */
		 /* invoke-direct {p0, p1}, Lcom/wiyun/engine/nodes/TextureNode;-><init>(I)V */
		 /* .line 17 */
		 return;
	 } // .end method
	 protected com.wiyun.engine.nodes.SpriteEx ( ) {
		 /* .locals 0 */
		 /* .param p1, "batchnode" # Lcom/wiyun/engine/nodes/SpriteBatchNode; */
		 /* .param p2, "rect" # Lcom/wiyun/engine/types/WYRect; */
		 /* .param p3, "zOrder" # I */
		 /* .prologue */
		 /* .line 45 */
		 /* invoke-direct {p0}, Lcom/wiyun/engine/nodes/TextureNode;-><init>()V */
		 /* .line 46 */
		 /* invoke-direct {p0, p1, p2, p3}, Lcom/wiyun/engine/nodes/SpriteEx;->nativeInit(Lcom/wiyun/engine/nodes/SpriteBatchNode;Lcom/wiyun/engine/types/WYRect;I)V */
		 /* .line 47 */
		 return;
	 } // .end method
	 protected com.wiyun.engine.nodes.SpriteEx ( ) {
		 /* .locals 0 */
		 /* .param p1, "tex" # Lcom/wiyun/engine/opengl/Texture2D; */
		 /* .prologue */
		 /* .line 24 */
		 /* invoke-direct {p0}, Lcom/wiyun/engine/nodes/TextureNode;-><init>()V */
		 /* .line 25 */
		 /* invoke-direct {p0, p1}, Lcom/wiyun/engine/nodes/SpriteEx;->nativeInit(Lcom/wiyun/engine/opengl/Texture2D;)V */
		 /* .line 26 */
		 return;
	 } // .end method
	 protected com.wiyun.engine.nodes.SpriteEx ( ) {
		 /* .locals 0 */
		 /* .param p1, "tex" # Lcom/wiyun/engine/opengl/Texture2D; */
		 /* .param p2, "rect" # Lcom/wiyun/engine/types/WYRect; */
		 /* .prologue */
		 /* .line 34 */
		 /* invoke-direct {p0}, Lcom/wiyun/engine/nodes/TextureNode;-><init>()V */
		 /* .line 35 */
		 /* invoke-direct {p0, p1, p2}, Lcom/wiyun/engine/nodes/SpriteEx;->nativeInit(Lcom/wiyun/engine/opengl/Texture2D;Lcom/wiyun/engine/types/WYRect;)V */
		 /* .line 36 */
		 return;
	 } // .end method
	 public static com.wiyun.engine.nodes.SpriteEx from ( Integer p0 ) {
		 /* .locals 1 */
		 /* .param p0, "pointer" # I */
		 /* .prologue */
		 /* .line 103 */
		 /* if-nez p0, :cond_0 */
		 int v0 = 0; // const/4 v0, 0x0
	 } // :goto_0
} // :cond_0
/* new-instance v0, Lcom/wiyun/engine/nodes/SpriteEx; */
/* invoke-direct {v0, p0}, Lcom/wiyun/engine/nodes/SpriteEx;-><init>(I)V */
} // .end method
public static com.wiyun.engine.nodes.TextureNode from ( Integer p0 ) { //bridge//synthethic
/* .locals 1 */
/* .prologue */
/* .line 1 */
com.wiyun.engine.nodes.SpriteEx .from ( p0 );
} // .end method
public static com.wiyun.engine.nodes.SpriteEx make ( Integer p0 ) {
/* .locals 2 */
/* .param p0, "resId" # I */
/* .prologue */
/* .line 55 */
/* new-instance v1, Lcom/wiyun/engine/nodes/SpriteEx; */
com.wiyun.engine.opengl.Texture2D .makePNG ( p0 );
(( com.wiyun.engine.opengl.Texture2D ) v0 ).autoRelease ( ); // invoke-virtual {v0}, Lcom/wiyun/engine/opengl/Texture2D;->autoRelease()Lcom/wiyun/engine/BaseWYObject;
/* check-cast v0, Lcom/wiyun/engine/opengl/Texture2D; */
/* invoke-direct {v1, v0}, Lcom/wiyun/engine/nodes/SpriteEx;-><init>(Lcom/wiyun/engine/opengl/Texture2D;)V */
} // .end method
public static com.wiyun.engine.nodes.SpriteEx make ( com.wiyun.engine.nodes.SpriteBatchNode p0, com.wiyun.engine.types.WYRect p1 ) {
/* .locals 2 */
/* .param p0, "batchnode" # Lcom/wiyun/engine/nodes/SpriteBatchNode; */
/* .param p1, "rect" # Lcom/wiyun/engine/types/WYRect; */
/* .prologue */
/* .line 87 */
/* new-instance v0, Lcom/wiyun/engine/nodes/SpriteEx; */
int v1 = 0; // const/4 v1, 0x0
/* invoke-direct {v0, p0, p1, v1}, Lcom/wiyun/engine/nodes/SpriteEx;-><init>(Lcom/wiyun/engine/nodes/SpriteBatchNode;Lcom/wiyun/engine/types/WYRect;I)V */
} // .end method
public static com.wiyun.engine.nodes.SpriteEx make ( com.wiyun.engine.nodes.SpriteBatchNode p0, com.wiyun.engine.types.WYRect p1, Integer p2 ) {
/* .locals 1 */
/* .param p0, "batchnode" # Lcom/wiyun/engine/nodes/SpriteBatchNode; */
/* .param p1, "rect" # Lcom/wiyun/engine/types/WYRect; */
/* .param p2, "zOrder" # I */
/* .prologue */
/* .line 99 */
/* new-instance v0, Lcom/wiyun/engine/nodes/SpriteEx; */
/* invoke-direct {v0, p0, p1, p2}, Lcom/wiyun/engine/nodes/SpriteEx;-><init>(Lcom/wiyun/engine/nodes/SpriteBatchNode;Lcom/wiyun/engine/types/WYRect;I)V */
} // .end method
public static com.wiyun.engine.nodes.SpriteEx make ( com.wiyun.engine.opengl.Texture2D p0 ) {
/* .locals 1 */
/* .param p0, "tex" # Lcom/wiyun/engine/opengl/Texture2D; */
/* .prologue */
/* .line 65 */
/* new-instance v0, Lcom/wiyun/engine/nodes/SpriteEx; */
/* invoke-direct {v0, p0}, Lcom/wiyun/engine/nodes/SpriteEx;-><init>(Lcom/wiyun/engine/opengl/Texture2D;)V */
} // .end method
public static com.wiyun.engine.nodes.SpriteEx make ( com.wiyun.engine.opengl.Texture2D p0, com.wiyun.engine.types.WYRect p1 ) {
/* .locals 1 */
/* .param p0, "tex" # Lcom/wiyun/engine/opengl/Texture2D; */
/* .param p1, "rect" # Lcom/wiyun/engine/types/WYRect; */
/* .prologue */
/* .line 76 */
/* new-instance v0, Lcom/wiyun/engine/nodes/SpriteEx; */
/* invoke-direct {v0, p0, p1}, Lcom/wiyun/engine/nodes/SpriteEx;-><init>(Lcom/wiyun/engine/opengl/Texture2D;Lcom/wiyun/engine/types/WYRect;)V */
} // .end method
private native void nativeInit ( com.wiyun.engine.nodes.SpriteBatchNode p0, com.wiyun.engine.types.WYRect p1, Integer p2 ) {
} // .end method
private native void nativeInit ( com.wiyun.engine.opengl.Texture2D p0 ) {
} // .end method
private native void nativeInit ( com.wiyun.engine.opengl.Texture2D p0, com.wiyun.engine.types.WYRect p1 ) {
} // .end method
/* # virtual methods */
protected void doNativeInit ( ) {
/* .locals 0 */
/* .prologue */
/* .line 108 */
return;
} // .end method
