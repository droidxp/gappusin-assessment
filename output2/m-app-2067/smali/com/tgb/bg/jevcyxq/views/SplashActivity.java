public class com.tgb.bg.jevcyxq.views.SplashActivity extends com.tgb.bg.jevcyxq.refurbished.TGBBaseSplash {
	 /* # direct methods */
	 public com.tgb.bg.jevcyxq.views.SplashActivity ( ) {
		 /* .locals 0 */
		 /* invoke-direct {p0}, Lcom/tgb/bg/jevcyxq/refurbished/TGBBaseSplash;-><init>()V */
		 return;
	 } // .end method
	 /* # virtual methods */
	 protected final java.lang.Class a ( ) {
		 /* .locals 1 */
		 /* const-class v0, Lcom/tgb/bg/jevcyxq/views/TGBMainMenu; */
	 } // .end method
	 protected final org.anddev.andengine.engine.options.EngineOptions$ScreenOrientation b ( ) {
		 /* .locals 1 */
		 v0 = org.anddev.andengine.engine.options.EngineOptions$ScreenOrientation.LANDSCAPE;
	 } // .end method
	 protected final Float c ( ) {
		 /* .locals 1 */
		 int v0 = 0; // const/4 v0, 0x0
	 } // .end method
	 protected final org.anddev.andengine.opengl.texture.atlas.bitmap.source.IBitmapTextureAtlasSource d ( ) {
		 /* .locals 2 */
		 /* new-instance v0, Lorg/anddev/andengine/opengl/texture/atlas/bitmap/source/AssetBitmapTextureAtlasSource; */
		 final String v1 = "gfx/splash.png"; // const-string v1, "gfx/splash.png"
		 /* invoke-direct {v0, p0, v1}, Lorg/anddev/andengine/opengl/texture/atlas/bitmap/source/AssetBitmapTextureAtlasSource;-><init>(Landroid/content/Context;Ljava/lang/String;)V */
	 } // .end method
	 protected void onDestroy ( ) {
		 /* .locals 2 */
		 try { // :try_start_0
			 (( com.tgb.bg.jevcyxq.views.SplashActivity ) p0 ).getEngine ( ); // invoke-virtual {p0}, Lcom/tgb/bg/jevcyxq/views/SplashActivity;->getEngine()Lorg/anddev/andengine/engine/Engine;
			 (( org.anddev.andengine.engine.Engine ) v0 ).getTextureManager ( ); // invoke-virtual {v0}, Lorg/anddev/andengine/engine/Engine;->getTextureManager()Lorg/anddev/andengine/opengl/texture/TextureManager;
			 v1 = this.b;
			 (( org.anddev.andengine.opengl.texture.TextureManager ) v0 ).unloadTexture ( v1 ); // invoke-virtual {v0, v1}, Lorg/anddev/andengine/opengl/texture/TextureManager;->unloadTexture(Lorg/anddev/andengine/opengl/texture/ITexture;)Z
			 v0 = this.a;
			 v0 = this.a;
			 (( com.tgb.bg.jevcyxq.refurbished.k ) v0 ).detachSelf ( ); // invoke-virtual {v0}, Lcom/tgb/bg/jevcyxq/refurbished/k;->detachSelf()Z
			 v0 = 			 (( com.tgb.bg.jevcyxq.views.SplashActivity ) p0 ).getTaskId ( ); // invoke-virtual {p0}, Lcom/tgb/bg/jevcyxq/views/SplashActivity;->getTaskId()I
			 android.os.Process .killProcess ( v0 );
			 /* :try_end_0 */
			 /* .catch Ljava/lang/Exception; {:try_start_0 ..:try_end_0} :catch_0 */
		 } // :goto_0
		 /* invoke-super {p0}, Lcom/tgb/bg/jevcyxq/refurbished/TGBBaseSplash;->onDestroy()V */
		 return;
		 /* :catch_0 */
		 /* move-exception v0 */
	 } // .end method
