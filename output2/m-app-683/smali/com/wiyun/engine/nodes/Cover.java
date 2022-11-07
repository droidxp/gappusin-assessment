public class com.wiyun.engine.nodes.Cover extends com.wiyun.engine.BaseWYObject {
	 /* .source "Cover.java" */
	 /* # direct methods */
	 protected com.wiyun.engine.nodes.Cover ( ) {
		 /* .locals 0 */
		 /* .prologue */
		 /* .line 12 */
		 /* invoke-direct {p0}, Lcom/wiyun/engine/BaseWYObject;-><init>()V */
		 /* .line 13 */
		 return;
	 } // .end method
	 protected com.wiyun.engine.nodes.Cover ( ) {
		 /* .locals 0 */
		 /* .param p1, "pointer" # I */
		 /* .prologue */
		 /* .line 16 */
		 /* invoke-direct {p0, p1}, Lcom/wiyun/engine/BaseWYObject;-><init>(I)V */
		 /* .line 17 */
		 return;
	 } // .end method
	 protected com.wiyun.engine.nodes.Cover ( ) {
		 /* .locals 0 */
		 /* .param p1, "tex" # Lcom/wiyun/engine/opengl/Texture2D; */
		 /* .prologue */
		 /* .line 24 */
		 /* invoke-direct {p0}, Lcom/wiyun/engine/BaseWYObject;-><init>()V */
		 /* .line 25 */
		 /* invoke-direct {p0, p1}, Lcom/wiyun/engine/nodes/Cover;->nativeInit(Lcom/wiyun/engine/opengl/Texture2D;)V */
		 /* .line 26 */
		 return;
	 } // .end method
	 public static com.wiyun.engine.nodes.Cover from ( Integer p0 ) {
		 /* .locals 1 */
		 /* .param p0, "pointer" # I */
		 /* .prologue */
		 /* .line 158 */
		 /* if-nez p0, :cond_0 */
		 int v0 = 0; // const/4 v0, 0x0
	 } // :goto_0
} // :cond_0
/* new-instance v0, Lcom/wiyun/engine/nodes/Cover; */
/* invoke-direct {v0, p0}, Lcom/wiyun/engine/nodes/Cover;-><init>(I)V */
} // .end method
private native Integer getPositionX ( ) {
} // .end method
private native Integer getPositionY ( ) {
} // .end method
private native Integer getPositionZ ( ) {
} // .end method
public static com.wiyun.engine.nodes.Cover make ( com.wiyun.engine.opengl.Texture2D p0 ) {
/* .locals 1 */
/* .param p0, "tex" # Lcom/wiyun/engine/opengl/Texture2D; */
/* .prologue */
/* .line 149 */
/* new-instance v0, Lcom/wiyun/engine/nodes/Cover; */
/* invoke-direct {v0, p0}, Lcom/wiyun/engine/nodes/Cover;-><init>(Lcom/wiyun/engine/opengl/Texture2D;)V */
} // .end method
private native Integer nativeGetNext ( ) {
} // .end method
private native Integer nativeGetPrev ( ) {
} // .end method
private native Integer nativeGetTexture ( ) {
} // .end method
private native void nativeInit ( com.wiyun.engine.opengl.Texture2D p0 ) {
} // .end method
/* # virtual methods */
public com.wiyun.engine.nodes.Cover GetNext ( ) {
/* .locals 2 */
/* .prologue */
/* .line 97 */
v0 = /* invoke-direct {p0}, Lcom/wiyun/engine/nodes/Cover;->nativeGetNext()I */
/* .line 98 */
/* .local v0, "pointer":I */
if ( v0 != null) { // if-eqz v0, :cond_0
	 /* .line 99 */
	 com.wiyun.engine.nodes.Cover .from ( v0 );
	 /* .line 101 */
} // :goto_0
} // :cond_0
int v1 = 0; // const/4 v1, 0x0
} // .end method
public native Boolean getAutoUpdate ( ) {
} // .end method
public com.wiyun.engine.types.WYVertex3D getPosition ( ) {
/* .locals 3 */
/* .prologue */
/* .line 46 */
v0 = /* invoke-direct {p0}, Lcom/wiyun/engine/nodes/Cover;->getPositionX()I */
/* int-to-float v0, v0 */
v1 = /* invoke-direct {p0}, Lcom/wiyun/engine/nodes/Cover;->getPositionY()I */
/* int-to-float v1, v1 */
v2 = /* invoke-direct {p0}, Lcom/wiyun/engine/nodes/Cover;->getPositionZ()I */
/* int-to-float v2, v2 */
com.wiyun.engine.types.WYVertex3D .make ( v0,v1,v2 );
} // .end method
public com.wiyun.engine.nodes.Cover getPrev ( ) {
/* .locals 2 */
/* .prologue */
/* .line 117 */
v0 = /* invoke-direct {p0}, Lcom/wiyun/engine/nodes/Cover;->nativeGetPrev()I */
/* .line 118 */
/* .local v0, "pointer":I */
if ( v0 != null) { // if-eqz v0, :cond_0
/* .line 119 */
com.wiyun.engine.nodes.Cover .from ( v0 );
/* .line 121 */
} // :goto_0
} // :cond_0
int v1 = 0; // const/4 v1, 0x0
} // .end method
public native Float getRotateY ( ) {
} // .end method
public native Float getScale ( ) {
} // .end method
public com.wiyun.engine.opengl.Texture2D getTexture ( ) {
/* .locals 1 */
/* .prologue */
/* .line 80 */
v0 = /* invoke-direct {p0}, Lcom/wiyun/engine/nodes/Cover;->nativeGetTexture()I */
com.wiyun.engine.opengl.Texture2D .from ( v0 );
} // .end method
public native void setAutoUpdate ( Boolean p0 ) {
} // .end method
public native void setNext ( com.wiyun.engine.nodes.Cover p0 ) {
} // .end method
public native void setPosition ( Float p0, Float p1 ) {
} // .end method
public native void setPrev ( com.wiyun.engine.nodes.Cover p0 ) {
} // .end method
public native void setRotateY ( Float p0 ) {
} // .end method
public native void setScale ( Float p0 ) {
} // .end method
public native void setTexture ( com.wiyun.engine.opengl.Texture2D p0 ) {
} // .end method
