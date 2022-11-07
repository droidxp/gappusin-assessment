public class com.wiyun.engine.afcanim.SPX3Sprite extends com.wiyun.engine.afcanim.AFCSprite {
	 /* .source "SPX3Sprite.java" */
	 /* # direct methods */
	 protected com.wiyun.engine.afcanim.SPX3Sprite ( ) {
		 /* .locals 0 */
		 /* .param p1, "pointer" # I */
		 /* .prologue */
		 /* .line 98 */
		 /* invoke-direct {p0, p1}, Lcom/wiyun/engine/afcanim/AFCSprite;-><init>(I)V */
		 /* .line 99 */
		 return;
	 } // .end method
	 protected com.wiyun.engine.afcanim.SPX3Sprite ( ) {
		 /* .locals 0 */
		 /* .param p1, "spxResId" # I */
		 /* .param p2, "animIndex" # I */
		 /* .param p3, "tex" # [Lcom/wiyun/engine/opengl/Texture2D; */
		 /* .prologue */
		 /* .line 89 */
		 /* invoke-direct {p0}, Lcom/wiyun/engine/afcanim/AFCSprite;-><init>()V */
		 /* .line 90 */
		 /* invoke-direct {p0, p1, p2, p3}, Lcom/wiyun/engine/afcanim/SPX3Sprite;->nativeInit(II[Lcom/wiyun/engine/opengl/Texture2D;)V */
		 /* .line 91 */
		 return;
	 } // .end method
	 protected com.wiyun.engine.afcanim.SPX3Sprite ( ) {
		 /* .locals 0 */
		 /* .param p1, "spxPath" # Ljava/lang/String; */
		 /* .param p2, "isFile" # Z */
		 /* .param p3, "animIndex" # I */
		 /* .param p4, "tex" # [Lcom/wiyun/engine/opengl/Texture2D; */
		 /* .prologue */
		 /* .line 93 */
		 /* invoke-direct {p0}, Lcom/wiyun/engine/afcanim/AFCSprite;-><init>()V */
		 /* .line 94 */
		 /* invoke-direct {p0, p1, p2, p3, p4}, Lcom/wiyun/engine/afcanim/SPX3Sprite;->nativeInit(Ljava/lang/String;ZI[Lcom/wiyun/engine/opengl/Texture2D;)V */
		 /* .line 95 */
		 return;
	 } // .end method
	 public static com.wiyun.engine.afcanim.SPX3Sprite from ( Integer p0 ) {
		 /* .locals 1 */
		 /* .param p0, "pointer" # I */
		 /* .prologue */
		 /* .line 86 */
		 /* if-nez p0, :cond_0 */
		 int v0 = 0; // const/4 v0, 0x0
	 } // :goto_0
} // :cond_0
/* new-instance v0, Lcom/wiyun/engine/afcanim/SPX3Sprite; */
/* invoke-direct {v0, p0}, Lcom/wiyun/engine/afcanim/SPX3Sprite;-><init>(I)V */
} // .end method
public static com.wiyun.engine.nodes.Node from ( Integer p0 ) { //bridge//synthethic
/* .locals 1 */
/* .prologue */
/* .line 1 */
com.wiyun.engine.afcanim.SPX3Sprite .from ( p0 );
} // .end method
public static com.wiyun.engine.afcanim.SPX3Sprite make ( Integer p0, Integer p1, com.wiyun.engine.opengl.Texture2D...p2 ) {
/* .locals 1 */
/* .param p0, "spxResId" # I */
/* .param p1, "animIndex" # I */
/* .param p2, "tex" # [Lcom/wiyun/engine/opengl/Texture2D; */
/* .prologue */
/* .line 56 */
/* new-instance v0, Lcom/wiyun/engine/afcanim/SPX3Sprite; */
/* invoke-direct {v0, p0, p1, p2}, Lcom/wiyun/engine/afcanim/SPX3Sprite;-><init>(II[Lcom/wiyun/engine/opengl/Texture2D;)V */
} // .end method
public static com.wiyun.engine.afcanim.SPX3Sprite make ( java.lang.String p0, Boolean p1, Integer p2, com.wiyun.engine.opengl.Texture2D...p3 ) {
/* .locals 1 */
/* .param p0, "spxPath" # Ljava/lang/String; */
/* .param p1, "isFile" # Z */
/* .param p2, "animIndex" # I */
/* .param p3, "tex" # [Lcom/wiyun/engine/opengl/Texture2D; */
/* .prologue */
/* .line 82 */
/* new-instance v0, Lcom/wiyun/engine/afcanim/SPX3Sprite; */
/* invoke-direct {v0, p0, p1, p2, p3}, Lcom/wiyun/engine/afcanim/SPX3Sprite;-><init>(Ljava/lang/String;ZI[Lcom/wiyun/engine/opengl/Texture2D;)V */
} // .end method
private native void nativeInit ( Integer p0, Integer p1, com.wiyun.engine.opengl.Texture2D[] p2 ) {
} // .end method
private native void nativeInit ( java.lang.String p0, Boolean p1, Integer p2, com.wiyun.engine.opengl.Texture2D[] p3 ) {
} // .end method
