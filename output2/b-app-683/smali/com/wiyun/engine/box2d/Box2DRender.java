public class com.wiyun.engine.box2d.Box2DRender extends com.wiyun.engine.BaseWYObject {
	 /* .source "Box2DRender.java" */
	 /* # direct methods */
	 protected com.wiyun.engine.box2d.Box2DRender ( ) {
		 /* .locals 0 */
		 /* .prologue */
		 /* .line 26 */
		 /* invoke-direct {p0}, Lcom/wiyun/engine/BaseWYObject;-><init>()V */
		 /* .line 27 */
		 /* invoke-direct {p0}, Lcom/wiyun/engine/box2d/Box2DRender;->nativeInit()V */
		 /* .line 28 */
		 return;
	 } // .end method
	 protected com.wiyun.engine.box2d.Box2DRender ( ) {
		 /* .locals 0 */
		 /* .param p1, "pointer" # I */
		 /* .prologue */
		 /* .line 31 */
		 /* invoke-direct {p0, p1}, Lcom/wiyun/engine/BaseWYObject;-><init>(I)V */
		 /* .line 32 */
		 return;
	 } // .end method
	 public static com.wiyun.engine.box2d.Box2DRender from ( Integer p0 ) {
		 /* .locals 1 */
		 /* .param p0, "pointer" # I */
		 /* .prologue */
		 /* .line 23 */
		 /* if-nez p0, :cond_0 */
		 int v0 = 0; // const/4 v0, 0x0
	 } // :goto_0
} // :cond_0
/* new-instance v0, Lcom/wiyun/engine/box2d/Box2DRender; */
/* invoke-direct {v0, p0}, Lcom/wiyun/engine/box2d/Box2DRender;-><init>(I)V */
} // .end method
public static com.wiyun.engine.box2d.Box2DRender make ( ) {
/* .locals 1 */
/* .prologue */
/* .line 19 */
/* new-instance v0, Lcom/wiyun/engine/box2d/Box2DRender; */
/* invoke-direct {v0}, Lcom/wiyun/engine/box2d/Box2DRender;-><init>()V */
} // .end method
private native void nativeInit ( ) {
} // .end method
/* # virtual methods */
public native void bindTexture ( com.wiyun.engine.box2d.dynamics.Fixture p0, com.wiyun.engine.opengl.Texture2D p1 ) {
} // .end method
public native void bindTexture ( com.wiyun.engine.box2d.dynamics.Fixture p0, com.wiyun.engine.opengl.Texture2D p1, com.wiyun.engine.types.WYRect p2 ) {
} // .end method
