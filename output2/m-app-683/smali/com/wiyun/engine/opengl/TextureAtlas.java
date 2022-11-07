public class com.wiyun.engine.opengl.TextureAtlas extends com.wiyun.engine.BaseWYObject {
	 /* .source "TextureAtlas.java" */
	 /* # static fields */
	 public static final Integer DEFAULT_CAPACITY;
	 /* # direct methods */
	 protected com.wiyun.engine.opengl.TextureAtlas ( ) {
		 /* .locals 0 */
		 /* .prologue */
		 /* .line 82 */
		 /* invoke-direct {p0}, Lcom/wiyun/engine/BaseWYObject;-><init>()V */
		 /* .line 83 */
		 return;
	 } // .end method
	 protected com.wiyun.engine.opengl.TextureAtlas ( ) {
		 /* .locals 0 */
		 /* .param p1, "pointer" # I */
		 /* .prologue */
		 /* .line 95 */
		 /* invoke-direct {p0, p1}, Lcom/wiyun/engine/BaseWYObject;-><init>(I)V */
		 /* .line 96 */
		 return;
	 } // .end method
	 protected com.wiyun.engine.opengl.TextureAtlas ( ) {
		 /* .locals 1 */
		 /* .param p1, "tex" # Lcom/wiyun/engine/opengl/Texture2D; */
		 /* .param p2, "capacity" # I */
		 /* .prologue */
		 /* .line 78 */
		 /* invoke-direct {p0}, Lcom/wiyun/engine/BaseWYObject;-><init>()V */
		 /* .line 79 */
		 v0 = 		 /* invoke-direct {p0, p1, p2}, Lcom/wiyun/engine/opengl/TextureAtlas;->nativeNew(Lcom/wiyun/engine/opengl/Texture2D;I)I */
		 /* iput v0, p0, Lcom/wiyun/engine/opengl/TextureAtlas;->mPointer:I */
		 /* .line 80 */
		 return;
	 } // .end method
	 public static com.wiyun.engine.opengl.TextureAtlas from ( Integer p0 ) {
		 /* .locals 1 */
		 /* .param p0, "pointer" # I */
		 /* .prologue */
		 /* .line 91 */
		 /* if-nez p0, :cond_0 */
		 int v0 = 0; // const/4 v0, 0x0
	 } // :goto_0
} // :cond_0
/* new-instance v0, Lcom/wiyun/engine/opengl/TextureAtlas; */
/* invoke-direct {v0, p0}, Lcom/wiyun/engine/opengl/TextureAtlas;-><init>(I)V */
} // .end method
public static com.wiyun.engine.opengl.TextureAtlas make ( com.wiyun.engine.opengl.Texture2D p0 ) {
/* .locals 2 */
/* .param p0, "tex" # Lcom/wiyun/engine/opengl/Texture2D; */
/* .prologue */
/* .line 69 */
/* new-instance v0, Lcom/wiyun/engine/opengl/TextureAtlas; */
/* const/16 v1, 0x1d */
/* invoke-direct {v0, p0, v1}, Lcom/wiyun/engine/opengl/TextureAtlas;-><init>(Lcom/wiyun/engine/opengl/Texture2D;I)V */
} // .end method
private native void nativeGetColor ( com.wiyun.engine.types.WYColor4B p0 ) {
} // .end method
private native Integer nativeGetTexture ( ) {
} // .end method
private native Integer nativeNew ( com.wiyun.engine.opengl.Texture2D p0, Integer p1 ) {
} // .end method
/* # virtual methods */
public native Integer appendQuad ( com.wiyun.engine.types.WYQuad2D p0, com.wiyun.engine.types.WYQuad3D p1 ) {
} // .end method
public native void copyTo ( Integer p0, com.wiyun.engine.opengl.TextureAtlas p1 ) {
} // .end method
public native void copyTo ( Integer p0, com.wiyun.engine.types.WYQuad2D p1, com.wiyun.engine.types.WYQuad3D p2 ) {
} // .end method
public native void draw ( ) {
} // .end method
public native void draw ( Integer p0 ) {
} // .end method
public native void drawOne ( Integer p0 ) {
} // .end method
public native Integer getCapacity ( ) {
} // .end method
public com.wiyun.engine.types.WYColor4B getColor ( ) {
/* .locals 1 */
/* .prologue */
/* .line 239 */
/* new-instance v0, Lcom/wiyun/engine/types/WYColor4B; */
/* invoke-direct {v0}, Lcom/wiyun/engine/types/WYColor4B;-><init>()V */
/* .line 240 */
/* .local v0, "color":Lcom/wiyun/engine/types/WYColor4B; */
/* invoke-direct {p0, v0}, Lcom/wiyun/engine/opengl/TextureAtlas;->nativeGetColor(Lcom/wiyun/engine/types/WYColor4B;)V */
/* .line 241 */
} // .end method
public native Float getHeight ( ) {
} // .end method
public native Float getHeightScale ( ) {
} // .end method
public native Integer getNextAvailableIndex ( ) {
} // .end method
public native Integer getPixelHeight ( ) {
} // .end method
public native Integer getPixelWidth ( ) {
} // .end method
public com.wiyun.engine.opengl.Texture2D getTexture ( ) {
/* .locals 2 */
/* .prologue */
/* .line 42 */
/* new-instance v0, Lcom/wiyun/engine/opengl/Texture2D; */
v1 = /* invoke-direct {p0}, Lcom/wiyun/engine/opengl/TextureAtlas;->nativeGetTexture()I */
/* invoke-direct {v0, v1}, Lcom/wiyun/engine/opengl/Texture2D;-><init>(I)V */
} // .end method
public native Integer getTotalQuads ( ) {
} // .end method
public native Float getWidth ( ) {
} // .end method
public native Float getWidthScale ( ) {
} // .end method
public native void insertQuad ( com.wiyun.engine.types.WYQuad2D p0, com.wiyun.engine.types.WYQuad3D p1, Integer p2 ) {
} // .end method
public native Boolean isWithColorArray ( ) {
} // .end method
public native void removeAllQuads ( ) {
} // .end method
public native void removeQuad ( Integer p0 ) {
} // .end method
public native void removeQuads ( Integer p0, Integer p1 ) {
} // .end method
public native void resizeCapacity ( Integer p0 ) {
} // .end method
public native void setAlpha ( Integer p0 ) {
} // .end method
public native void setColor ( com.wiyun.engine.types.WYColor4B p0 ) {
} // .end method
public native void setTexture ( com.wiyun.engine.opengl.Texture2D p0 ) {
} // .end method
public java.lang.String toString ( ) {
/* .locals 4 */
/* .prologue */
/* .line 102 */
final String v0 = "<%s = %08X | getTotalQuads = %d>"; // const-string v0, "<%s = %08X | getTotalQuads = %d>"
int v1 = 3; // const/4 v1, 0x3
/* new-array v1, v1, [Ljava/lang/Object; */
int v2 = 0; // const/4 v2, 0x0
/* const-class v3, Lcom/wiyun/engine/opengl/TextureAtlas; */
/* aput-object v3, v1, v2 */
int v2 = 1; // const/4 v2, 0x1
/* aput-object p0, v1, v2 */
int v2 = 2; // const/4 v2, 0x2
v3 = (( com.wiyun.engine.opengl.TextureAtlas ) p0 ).getTotalQuads ( ); // invoke-virtual {p0}, Lcom/wiyun/engine/opengl/TextureAtlas;->getTotalQuads()I
java.lang.Integer .valueOf ( v3 );
/* aput-object v3, v1, v2 */
java.lang.String .format ( v0,v1 );
} // .end method
public native void updateColor ( com.wiyun.engine.types.WYColor4B p0, Integer p1 ) {
} // .end method
public native void updateQuad ( com.wiyun.engine.types.WYQuad2D p0, com.wiyun.engine.types.WYQuad3D p1, Integer p2 ) {
} // .end method
