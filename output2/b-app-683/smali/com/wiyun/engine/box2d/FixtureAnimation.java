public class com.wiyun.engine.box2d.FixtureAnimation extends com.wiyun.engine.BaseWYObject {
	 /* .source "FixtureAnimation.java" */
	 /* # annotations */
	 /* .annotation system Ldalvik/annotation/MemberClasses; */
	 /* value = { */
	 /* Lcom/wiyun/engine/box2d/FixtureAnimation$Callback; */
	 /* } */
} // .end annotation
/* # direct methods */
protected com.wiyun.engine.box2d.FixtureAnimation ( ) {
	 /* .locals 3 */
	 /* .param p1, "duration" # F */
	 /* .param p2, "resIds" # [I */
	 /* .prologue */
	 /* .line 51 */
	 /* invoke-direct {p0}, Lcom/wiyun/engine/BaseWYObject;-><init>()V */
	 /* .line 52 */
	 /* invoke-direct {p0}, Lcom/wiyun/engine/box2d/FixtureAnimation;->nativeInit()V */
	 /* .line 54 */
	 /* array-length v2, p2 */
	 int v1 = 0; // const/4 v1, 0x0
} // :goto_0
/* if-lt v1, v2, :cond_0 */
/* .line 57 */
return;
/* .line 54 */
} // :cond_0
/* aget v0, p2, v1 */
/* .line 55 */
/* .local v0, "id":I */
(( com.wiyun.engine.box2d.FixtureAnimation ) p0 ).addFrame ( p1, v0 ); // invoke-virtual {p0, p1, v0}, Lcom/wiyun/engine/box2d/FixtureAnimation;->addFrame(FI)V
/* .line 54 */
/* add-int/lit8 v1, v1, 0x1 */
} // .end method
protected com.wiyun.engine.box2d.FixtureAnimation ( ) {
/* .locals 0 */
/* .param p1, "pointer" # I */
/* .prologue */
/* .line 62 */
/* invoke-direct {p0, p1}, Lcom/wiyun/engine/BaseWYObject;-><init>(I)V */
/* .line 63 */
return;
} // .end method
public static com.wiyun.engine.box2d.FixtureAnimation from ( Integer p0 ) {
/* .locals 1 */
/* .param p0, "pointer" # I */
/* .prologue */
/* .line 42 */
/* if-nez p0, :cond_0 */
int v0 = 0; // const/4 v0, 0x0
} // :goto_0
} // :cond_0
/* new-instance v0, Lcom/wiyun/engine/box2d/FixtureAnimation; */
/* invoke-direct {v0, p0}, Lcom/wiyun/engine/box2d/FixtureAnimation;-><init>(I)V */
} // .end method
public static com.wiyun.engine.box2d.FixtureAnimation make ( Float p0, Integer...p1 ) {
/* .locals 1 */
/* .param p0, "duration" # F */
/* .param p1, "resIds" # [I */
/* .prologue */
/* .line 38 */
/* new-instance v0, Lcom/wiyun/engine/box2d/FixtureAnimation; */
/* invoke-direct {v0, p0, p1}, Lcom/wiyun/engine/box2d/FixtureAnimation;-><init>(F[I)V */
} // .end method
private native void nativeAddFrame ( Float p0, com.wiyun.engine.opengl.Texture2D p1 ) {
} // .end method
private native void nativeInit ( ) {
} // .end method
/* # virtual methods */
public void addFrame ( Float p0, Integer p1 ) {
/* .locals 2 */
/* .param p1, "duration" # F */
/* .param p2, "resId" # I */
/* .prologue */
/* .line 72 */
com.wiyun.engine.opengl.Texture2D .makePNG ( p2 );
(( com.wiyun.engine.opengl.Texture2D ) v1 ).autoRelease ( ); // invoke-virtual {v1}, Lcom/wiyun/engine/opengl/Texture2D;->autoRelease()Lcom/wiyun/engine/BaseWYObject;
/* check-cast v0, Lcom/wiyun/engine/opengl/Texture2D; */
/* .line 73 */
/* .local v0, "tex":Lcom/wiyun/engine/opengl/Texture2D; */
/* invoke-direct {p0, p1, v0}, Lcom/wiyun/engine/box2d/FixtureAnimation;->nativeAddFrame(FLcom/wiyun/engine/opengl/Texture2D;)V */
/* .line 74 */
return;
} // .end method
public native Float getDuration ( ) {
} // .end method
public native Boolean isLoop ( ) {
} // .end method
public native void setCallback ( com.wiyun.engine.box2d.FixtureAnimation$Callback p0 ) {
} // .end method
public native void setDuration ( Float p0 ) {
} // .end method
public native void setLoop ( Boolean p0 ) {
} // .end method
public native void start ( com.wiyun.engine.box2d.dynamics.Fixture p0 ) {
} // .end method
public native void stop ( ) {
} // .end method
