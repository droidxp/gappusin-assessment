public abstract class com.tgb.bg.jevcyxq.refurbished.TGBBaseSplash extends org.anddev.andengine.ui.activity.BaseGameActivity {
	 /* # instance fields */
	 public com.tgb.bg.jevcyxq.refurbished.b a;
	 public org.anddev.andengine.opengl.texture.atlas.bitmap.BitmapTextureAtlas b;
	 private org.anddev.andengine.engine.camera.Camera c;
	 private org.anddev.andengine.opengl.texture.atlas.bitmap.source.IBitmapTextureAtlasSource d;
	 private org.anddev.andengine.opengl.texture.region.TextureRegion e;
	 /* # direct methods */
	 public com.tgb.bg.jevcyxq.refurbished.TGBBaseSplash ( ) {
		 /* .locals 0 */
		 /* invoke-direct {p0}, Lorg/anddev/andengine/ui/activity/BaseGameActivity;-><init>()V */
		 return;
	 } // .end method
	 /* # virtual methods */
	 protected abstract java.lang.Class a ( ) {
	 } // .end method
	 protected abstract org.anddev.andengine.engine.options.EngineOptions$ScreenOrientation b ( ) {
	 } // .end method
	 protected Float c ( ) {
		 /* .locals 1 */
		 /* const/high16 v0, 0x3f800000 # 1.0f */
	 } // .end method
	 protected abstract org.anddev.andengine.opengl.texture.atlas.bitmap.source.IBitmapTextureAtlasSource d ( ) {
	 } // .end method
	 public void onLoadComplete ( ) {
		 /* .locals 0 */
		 return;
	 } // .end method
	 public org.anddev.andengine.engine.Engine onLoadEngine ( ) {
		 /* .locals 7 */
		 int v5 = 0; // const/4 v5, 0x0
		 (( com.tgb.bg.jevcyxq.refurbished.TGBBaseSplash ) p0 ).d ( ); // invoke-virtual {p0}, Lcom/tgb/bg/jevcyxq/refurbished/TGBBaseSplash;->d()Lorg/anddev/andengine/opengl/texture/atlas/bitmap/source/IBitmapTextureAtlasSource;
		 this.d = v0;
		 v0 = 		 v0 = this.d;
		 v1 = 		 v1 = this.d;
		 /* new-instance v2, Lorg/anddev/andengine/engine/camera/Camera; */
		 /* int-to-float v3, v0 */
		 /* int-to-float v4, v1 */
		 /* invoke-direct {v2, v5, v5, v3, v4}, Lorg/anddev/andengine/engine/camera/Camera;-><init>(FFFF)V */
		 this.c = v2;
		 /* new-instance v2, Lorg/anddev/andengine/engine/Engine; */
		 /* new-instance v3, Lorg/anddev/andengine/engine/options/EngineOptions; */
		 int v4 = 1; // const/4 v4, 0x1
		 (( com.tgb.bg.jevcyxq.refurbished.TGBBaseSplash ) p0 ).b ( ); // invoke-virtual {p0}, Lcom/tgb/bg/jevcyxq/refurbished/TGBBaseSplash;->b()Lorg/anddev/andengine/engine/options/EngineOptions$ScreenOrientation;
		 /* new-instance v6, Lorg/anddev/andengine/engine/options/resolutionpolicy/RatioResolutionPolicy; */
		 /* int-to-float v0, v0 */
		 /* int-to-float v1, v1 */
		 /* invoke-direct {v6, v0, v1}, Lorg/anddev/andengine/engine/options/resolutionpolicy/RatioResolutionPolicy;-><init>(FF)V */
		 v0 = this.c;
		 /* invoke-direct {v3, v4, v5, v6, v0}, Lorg/anddev/andengine/engine/options/EngineOptions;-><init>(ZLorg/anddev/andengine/engine/options/EngineOptions$ScreenOrientation;Lorg/anddev/andengine/engine/options/resolutionpolicy/IResolutionPolicy;Lorg/anddev/andengine/engine/camera/Camera;)V */
		 /* invoke-direct {v2, v3}, Lorg/anddev/andengine/engine/Engine;-><init>(Lorg/anddev/andengine/engine/options/EngineOptions;)V */
	 } // .end method
	 public void onLoadResources ( ) {
		 /* .locals 4 */
		 int v3 = 0; // const/4 v3, 0x0
		 v0 = org.anddev.andengine.opengl.texture.atlas.bitmap.BitmapTextureAtlas$BitmapTextureFormat.RGBA_8888;
		 v1 = this.d;
		 v2 = org.anddev.andengine.opengl.texture.TextureOptions.BILINEAR_PREMULTIPLYALPHA;
		 org.anddev.andengine.opengl.texture.atlas.bitmap.BitmapTextureAtlasFactory .createForTextureAtlasSourceSize ( v0,v1,v2 );
		 this.b = v0;
		 v0 = this.b;
		 v1 = this.d;
		 org.anddev.andengine.opengl.texture.atlas.bitmap.BitmapTextureAtlasTextureRegionFactory .createFromSource ( v0,v1,v3,v3 );
		 this.e = v0;
		 (( com.tgb.bg.jevcyxq.refurbished.TGBBaseSplash ) p0 ).getEngine ( ); // invoke-virtual {p0}, Lcom/tgb/bg/jevcyxq/refurbished/TGBBaseSplash;->getEngine()Lorg/anddev/andengine/engine/Engine;
		 (( org.anddev.andengine.engine.Engine ) v0 ).getTextureManager ( ); // invoke-virtual {v0}, Lorg/anddev/andengine/engine/Engine;->getTextureManager()Lorg/anddev/andengine/opengl/texture/TextureManager;
		 v1 = this.b;
		 (( org.anddev.andengine.opengl.texture.TextureManager ) v0 ).loadTexture ( v1 ); // invoke-virtual {v0, v1}, Lorg/anddev/andengine/opengl/texture/TextureManager;->loadTexture(Lorg/anddev/andengine/opengl/texture/ITexture;)Z
		 return;
	 } // .end method
	 public org.anddev.andengine.entity.scene.Scene onLoadScene ( ) {
		 /* .locals 4 */
		 /* new-instance v0, Lcom/tgb/bg/jevcyxq/refurbished/b; */
		 v1 = this.c;
		 v2 = this.e;
		 v3 = 		 (( com.tgb.bg.jevcyxq.refurbished.TGBBaseSplash ) p0 ).c ( ); // invoke-virtual {p0}, Lcom/tgb/bg/jevcyxq/refurbished/TGBBaseSplash;->c()F
		 /* invoke-direct {v0, v1, v2, v3}, Lcom/tgb/bg/jevcyxq/refurbished/b;-><init>(Lorg/anddev/andengine/engine/camera/Camera;Lorg/anddev/andengine/opengl/texture/region/TextureRegion;F)V */
		 this.a = v0;
		 v0 = this.a;
		 /* new-instance v1, Lorg/anddev/andengine/engine/handler/timer/TimerHandler; */
		 /* const/high16 v2, 0x40400000 # 3.0f */
		 /* new-instance v3, Lcom/tgb/bg/jevcyxq/refurbished/m; */
		 /* invoke-direct {v3, p0}, Lcom/tgb/bg/jevcyxq/refurbished/m;-><init>(Lcom/tgb/bg/jevcyxq/refurbished/TGBBaseSplash;)V */
		 /* invoke-direct {v1, v2, v3}, Lorg/anddev/andengine/engine/handler/timer/TimerHandler;-><init>(FLorg/anddev/andengine/engine/handler/timer/ITimerCallback;)V */
		 (( com.tgb.bg.jevcyxq.refurbished.b ) v0 ).registerUpdateHandler ( v1 ); // invoke-virtual {v0, v1}, Lcom/tgb/bg/jevcyxq/refurbished/b;->registerUpdateHandler(Lorg/anddev/andengine/engine/handler/IUpdateHandler;)V
		 v0 = this.a;
	 } // .end method
