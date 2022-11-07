public class com.wiyun.engine.afcanim.ArcticSprite extends com.wiyun.engine.afcanim.AFCSprite {
	 /* .source "ArcticSprite.java" */
	 /* # direct methods */
	 protected com.wiyun.engine.afcanim.ArcticSprite ( ) {
		 /* .locals 0 */
		 /* .param p1, "pointer" # I */
		 /* .prologue */
		 /* .line 28 */
		 /* invoke-direct {p0, p1}, Lcom/wiyun/engine/afcanim/AFCSprite;-><init>(I)V */
		 /* .line 29 */
		 return;
	 } // .end method
	 protected com.wiyun.engine.afcanim.ArcticSprite ( ) {
		 /* .locals 0 */
		 /* .param p1, "asResId" # I */
		 /* .param p2, "animIndex" # I */
		 /* .param p3, "tex" # [Lcom/wiyun/engine/opengl/Texture2D; */
		 /* .prologue */
		 /* .line 74 */
		 /* invoke-direct {p0}, Lcom/wiyun/engine/afcanim/AFCSprite;-><init>()V */
		 /* .line 75 */
		 /* invoke-direct {p0, p1, p2, p3}, Lcom/wiyun/engine/afcanim/ArcticSprite;->nativeInit(II[Lcom/wiyun/engine/opengl/Texture2D;)V */
		 /* .line 76 */
		 return;
	 } // .end method
	 protected com.wiyun.engine.afcanim.ArcticSprite ( ) {
		 /* .locals 0 */
		 /* .param p1, "path" # Ljava/lang/String; */
		 /* .param p2, "isFile" # Z */
		 /* .param p3, "animIndex" # I */
		 /* .param p4, "tex" # [Lcom/wiyun/engine/opengl/Texture2D; */
		 /* .prologue */
		 /* .line 78 */
		 /* invoke-direct {p0}, Lcom/wiyun/engine/afcanim/AFCSprite;-><init>()V */
		 /* .line 79 */
		 /* invoke-direct {p0, p1, p2, p3, p4}, Lcom/wiyun/engine/afcanim/ArcticSprite;->nativeInit(Ljava/lang/String;ZI[Lcom/wiyun/engine/opengl/Texture2D;)V */
		 /* .line 80 */
		 return;
	 } // .end method
	 public static com.wiyun.engine.afcanim.ArcticSprite from ( Integer p0 ) {
		 /* .locals 1 */
		 /* .param p0, "pointer" # I */
		 /* .prologue */
		 /* .line 24 */
		 /* if-nez p0, :cond_0 */
		 int v0 = 0; // const/4 v0, 0x0
	 } // :goto_0
} // :cond_0
/* new-instance v0, Lcom/wiyun/engine/afcanim/ArcticSprite; */
/* invoke-direct {v0, p0}, Lcom/wiyun/engine/afcanim/ArcticSprite;-><init>(I)V */
} // .end method
public static com.wiyun.engine.nodes.Node from ( Integer p0 ) { //bridge//synthethic
/* .locals 1 */
/* .prologue */
/* .line 1 */
com.wiyun.engine.afcanim.ArcticSprite .from ( p0 );
} // .end method
public static com.wiyun.engine.afcanim.ArcticSprite make ( Integer p0, Integer p1, com.wiyun.engine.opengl.Texture2D...p2 ) {
/* .locals 1 */
/* .param p0, "asResId" # I */
/* .param p1, "animIndex" # I */
/* .param p2, "tex" # [Lcom/wiyun/engine/opengl/Texture2D; */
/* .prologue */
/* .line 48 */
/* new-instance v0, Lcom/wiyun/engine/afcanim/ArcticSprite; */
/* invoke-direct {v0, p0, p1, p2}, Lcom/wiyun/engine/afcanim/ArcticSprite;-><init>(II[Lcom/wiyun/engine/opengl/Texture2D;)V */
} // .end method
public static com.wiyun.engine.afcanim.ArcticSprite make ( java.lang.String p0, Boolean p1, Integer p2, com.wiyun.engine.opengl.Texture2D...p3 ) {
/* .locals 1 */
/* .param p0, "path" # Ljava/lang/String; */
/* .param p1, "isFile" # Z */
/* .param p2, "animIndex" # I */
/* .param p3, "tex" # [Lcom/wiyun/engine/opengl/Texture2D; */
/* .prologue */
/* .line 71 */
/* new-instance v0, Lcom/wiyun/engine/afcanim/ArcticSprite; */
/* invoke-direct {v0, p0, p1, p2, p3}, Lcom/wiyun/engine/afcanim/ArcticSprite;-><init>(Ljava/lang/String;ZI[Lcom/wiyun/engine/opengl/Texture2D;)V */
} // .end method
private native void nativeInit ( Integer p0, Integer p1, com.wiyun.engine.opengl.Texture2D[] p2 ) {
} // .end method
private native void nativeInit ( java.lang.String p0, Boolean p1, Integer p2, com.wiyun.engine.opengl.Texture2D[] p3 ) {
} // .end method
