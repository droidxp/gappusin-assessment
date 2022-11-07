public class org.anddev.andengine.opengl.view.RenderSurfaceView$Renderer implements org.anddev.andengine.opengl.view.GLSurfaceView$Renderer {
	 /* # interfaces */
	 /* # instance fields */
	 private final org.anddev.andengine.engine.Engine mEngine;
	 /* # direct methods */
	 public org.anddev.andengine.opengl.view.RenderSurfaceView$Renderer ( ) {
		 /* .locals 0 */
		 /* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
		 this.mEngine = p1;
		 return;
	 } // .end method
	 static org.anddev.andengine.engine.Engine access$0 ( org.anddev.andengine.opengl.view.RenderSurfaceView$Renderer p0 ) { //synthethic
		 /* .locals 1 */
		 v0 = this.mEngine;
	 } // .end method
	 /* # virtual methods */
	 public void onDrawFrame ( javax.microedition.khronos.opengles.GL10 p0 ) {
		 /* .locals 2 */
		 try { // :try_start_0
			 v0 = this.mEngine;
			 (( org.anddev.andengine.engine.Engine ) v0 ).onDrawFrame ( p1 ); // invoke-virtual {v0, p1}, Lorg/anddev/andengine/engine/Engine;->onDrawFrame(Ljavax/microedition/khronos/opengles/GL10;)V
			 /* :try_end_0 */
			 /* .catch Ljava/lang/InterruptedException; {:try_start_0 ..:try_end_0} :catch_0 */
		 } // :goto_0
		 return;
		 /* :catch_0 */
		 /* move-exception v0 */
		 final String v1 = "GLThread interrupted!"; // const-string v1, "GLThread interrupted!"
		 org.anddev.andengine.util.Debug .e ( v1,v0 );
	 } // .end method
	 public void onSurfaceChanged ( javax.microedition.khronos.opengles.GL10 p0, Integer p1, Integer p2 ) {
		 /* .locals 3 */
		 int v2 = 0; // const/4 v2, 0x0
		 /* new-instance v0, Ljava/lang/StringBuilder; */
		 final String v1 = "onSurfaceChanged: pWidth="; // const-string v1, "onSurfaceChanged: pWidth="
		 /* invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V */
		 (( java.lang.StringBuilder ) v0 ).append ( p2 ); // invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;
		 final String v1 = " pHeight="; // const-string v1, " pHeight="
		 (( java.lang.StringBuilder ) v0 ).append ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
		 (( java.lang.StringBuilder ) v0 ).append ( p3 ); // invoke-virtual {v0, p3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;
		 (( java.lang.StringBuilder ) v0 ).toString ( ); // invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
		 org.anddev.andengine.util.Debug .d ( v0 );
		 v0 = this.mEngine;
		 (( org.anddev.andengine.engine.Engine ) v0 ).setSurfaceSize ( p2, p3 ); // invoke-virtual {v0, p2, p3}, Lorg/anddev/andengine/engine/Engine;->setSurfaceSize(II)V
		 return;
	 } // .end method
	 public void onSurfaceCreated ( javax.microedition.khronos.opengles.GL10 p0, javax.microedition.khronos.egl.EGLConfig p1 ) {
		 /* .locals 1 */
		 final String v0 = "onSurfaceCreated"; // const-string v0, "onSurfaceCreated"
		 org.anddev.andengine.util.Debug .d ( v0 );
		 org.anddev.andengine.opengl.util.GLHelper .reset ( p1 );
		 org.anddev.andengine.opengl.util.GLHelper .setPerspectiveCorrectionHintFastest ( p1 );
		 org.anddev.andengine.opengl.util.GLHelper .setShadeModelFlat ( p1 );
		 org.anddev.andengine.opengl.util.GLHelper .disableLightning ( p1 );
		 org.anddev.andengine.opengl.util.GLHelper .disableDither ( p1 );
		 org.anddev.andengine.opengl.util.GLHelper .disableDepthTest ( p1 );
		 org.anddev.andengine.opengl.util.GLHelper .disableMultisample ( p1 );
		 org.anddev.andengine.opengl.util.GLHelper .enableBlend ( p1 );
		 org.anddev.andengine.opengl.util.GLHelper .enableTextures ( p1 );
		 org.anddev.andengine.opengl.util.GLHelper .enableTexCoordArray ( p1 );
		 org.anddev.andengine.opengl.util.GLHelper .enableVertexArray ( p1 );
		 org.anddev.andengine.opengl.util.GLHelper .enableCulling ( p1 );
		 /* const/16 v0, 0x901 */
		 /* const/16 v0, 0x405 */
		 v0 = this.mEngine;
		 (( org.anddev.andengine.engine.Engine ) v0 ).getEngineOptions ( ); // invoke-virtual {v0}, Lorg/anddev/andengine/engine/Engine;->getEngineOptions()Lorg/anddev/andengine/engine/options/EngineOptions;
		 (( org.anddev.andengine.engine.options.EngineOptions ) v0 ).getRenderOptions ( ); // invoke-virtual {v0}, Lorg/anddev/andengine/engine/options/EngineOptions;->getRenderOptions()Lorg/anddev/andengine/engine/options/RenderOptions;
		 org.anddev.andengine.opengl.util.GLHelper .enableExtensions ( p1,v0 );
		 return;
	 } // .end method
