public class com.wiyun.engine.afcanim.SPXSprite extends com.wiyun.engine.afcanim.AFCSprite {
	 /* .source "SPXSprite.java" */
	 /* # direct methods */
	 protected com.wiyun.engine.afcanim.SPXSprite ( ) {
		 /* .locals 0 */
		 /* .param p1, "pointer" # I */
		 /* .prologue */
		 /* .line 27 */
		 /* invoke-direct {p0, p1}, Lcom/wiyun/engine/afcanim/AFCSprite;-><init>(I)V */
		 /* .line 28 */
		 return;
	 } // .end method
	 protected com.wiyun.engine.afcanim.SPXSprite ( ) {
		 /* .locals 0 */
		 /* .param p1, "spxResId" # I */
		 /* .param p2, "tex" # Lcom/wiyun/engine/opengl/Texture2D; */
		 /* .param p3, "actionIndex" # I */
		 /* .prologue */
		 /* .line 76 */
		 /* invoke-direct {p0}, Lcom/wiyun/engine/afcanim/AFCSprite;-><init>()V */
		 /* .line 77 */
		 /* invoke-direct {p0, p1, p2, p3}, Lcom/wiyun/engine/afcanim/SPXSprite;->nativeInit(ILcom/wiyun/engine/opengl/Texture2D;I)V */
		 /* .line 78 */
		 return;
	 } // .end method
	 protected com.wiyun.engine.afcanim.SPXSprite ( ) {
		 /* .locals 0 */
		 /* .param p1, "spxPath" # Ljava/lang/String; */
		 /* .param p2, "isFile" # Z */
		 /* .param p3, "tex" # Lcom/wiyun/engine/opengl/Texture2D; */
		 /* .param p4, "actionIndex" # I */
		 /* .prologue */
		 /* .line 80 */
		 /* invoke-direct {p0}, Lcom/wiyun/engine/afcanim/AFCSprite;-><init>()V */
		 /* .line 81 */
		 /* invoke-direct {p0, p1, p2, p3, p4}, Lcom/wiyun/engine/afcanim/SPXSprite;->nativeInit(Ljava/lang/String;ZLcom/wiyun/engine/opengl/Texture2D;I)V */
		 /* .line 82 */
		 return;
	 } // .end method
	 public static com.wiyun.engine.afcanim.SPXSprite from ( Integer p0 ) {
		 /* .locals 1 */
		 /* .param p0, "pointer" # I */
		 /* .prologue */
		 /* .line 23 */
		 /* if-nez p0, :cond_0 */
		 int v0 = 0; // const/4 v0, 0x0
	 } // :goto_0
} // :cond_0
/* new-instance v0, Lcom/wiyun/engine/afcanim/SPXSprite; */
/* invoke-direct {v0, p0}, Lcom/wiyun/engine/afcanim/SPXSprite;-><init>(I)V */
} // .end method
public static com.wiyun.engine.nodes.Node from ( Integer p0 ) { //bridge//synthethic
/* .locals 1 */
/* .prologue */
/* .line 1 */
com.wiyun.engine.afcanim.SPXSprite .from ( p0 );
} // .end method
public static com.wiyun.engine.afcanim.SPXSprite make ( Integer p0, com.wiyun.engine.opengl.Texture2D p1, Integer p2 ) {
/* .locals 1 */
/* .param p0, "spxResId" # I */
/* .param p1, "tex" # Lcom/wiyun/engine/opengl/Texture2D; */
/* .param p2, "actionIndex" # I */
/* .prologue */
/* .line 48 */
/* new-instance v0, Lcom/wiyun/engine/afcanim/SPXSprite; */
/* invoke-direct {v0, p0, p1, p2}, Lcom/wiyun/engine/afcanim/SPXSprite;-><init>(ILcom/wiyun/engine/opengl/Texture2D;I)V */
} // .end method
public static com.wiyun.engine.afcanim.SPXSprite make ( java.lang.String p0, Boolean p1, com.wiyun.engine.opengl.Texture2D p2, Integer p3 ) {
/* .locals 1 */
/* .param p0, "spxPath" # Ljava/lang/String; */
/* .param p1, "isFile" # Z */
/* .param p2, "tex" # Lcom/wiyun/engine/opengl/Texture2D; */
/* .param p3, "actionIndex" # I */
/* .prologue */
/* .line 73 */
/* new-instance v0, Lcom/wiyun/engine/afcanim/SPXSprite; */
/* invoke-direct {v0, p0, p1, p2, p3}, Lcom/wiyun/engine/afcanim/SPXSprite;-><init>(Ljava/lang/String;ZLcom/wiyun/engine/opengl/Texture2D;I)V */
} // .end method
private native void nativeInit ( Integer p0, com.wiyun.engine.opengl.Texture2D p1, Integer p2 ) {
} // .end method
private native void nativeInit ( java.lang.String p0, Boolean p1, com.wiyun.engine.opengl.Texture2D p2, Integer p3 ) {
} // .end method
