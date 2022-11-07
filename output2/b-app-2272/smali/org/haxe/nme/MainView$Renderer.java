class org.haxe.nme.MainView$Renderer implements android.opengl.GLSurfaceView$Renderer {
	 /* .source "MainView.java" */
	 /* # interfaces */
	 /* # annotations */
	 /* .annotation system Ldalvik/annotation/EnclosingClass; */
	 /* value = Lorg/haxe/nme/MainView; */
} // .end annotation
/* .annotation system Ldalvik/annotation/InnerClass; */
/* accessFlags = 0xa */
/* name = "Renderer" */
} // .end annotation
/* # instance fields */
org.haxe.nme.MainView mMainView;
/* # direct methods */
public org.haxe.nme.MainView$Renderer ( ) {
/* .locals 0 */
/* .param p1, "inView" # Lorg/haxe/nme/MainView; */
/* .prologue */
/* .line 354 */
/* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
this.mMainView = p1;
return;
} // .end method
/* # virtual methods */
public void onDrawFrame ( javax.microedition.khronos.opengles.GL10 p0 ) {
/* .locals 2 */
/* .param p1, "gl" # Ljavax/microedition/khronos/opengles/GL10; */
/* .prologue */
/* .line 358 */
v0 = this.mMainView;
v1 = org.haxe.nme.NME .onRender ( );
(( org.haxe.nme.MainView ) v0 ).HandleResult ( v1 ); // invoke-virtual {v0, v1}, Lorg/haxe/nme/MainView;->HandleResult(I)V
/* .line 359 */
org.haxe.nme.Sound .checkSoundCompletion ( );
/* .line 361 */
return;
} // .end method
public void onSurfaceChanged ( javax.microedition.khronos.opengles.GL10 p0, Integer p1, Integer p2 ) {
/* .locals 2 */
/* .param p1, "gl" # Ljavax/microedition/khronos/opengles/GL10; */
/* .param p2, "width" # I */
/* .param p3, "height" # I */
/* .prologue */
/* .line 365 */
v0 = this.mMainView;
v1 = org.haxe.nme.NME .onResize ( p2,p3 );
(( org.haxe.nme.MainView ) v0 ).HandleResult ( v1 ); // invoke-virtual {v0, v1}, Lorg/haxe/nme/MainView;->HandleResult(I)V
/* .line 366 */
return;
} // .end method
public void onSurfaceCreated ( javax.microedition.khronos.opengles.GL10 p0, javax.microedition.khronos.egl.EGLConfig p1 ) {
/* .locals 0 */
/* .param p1, "gl" # Ljavax/microedition/khronos/opengles/GL10; */
/* .param p2, "config" # Ljavax/microedition/khronos/egl/EGLConfig; */
/* .prologue */
/* .line 370 */
return;
} // .end method
