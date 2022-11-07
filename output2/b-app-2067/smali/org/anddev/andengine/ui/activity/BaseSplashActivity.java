public abstract class org.anddev.andengine.ui.activity.BaseSplashActivity extends org.anddev.andengine.ui.activity.BaseGameActivity {
	 /* # instance fields */
	 private org.anddev.andengine.engine.camera.Camera mCamera;
	 private org.anddev.andengine.opengl.texture.region.TextureRegion mLoadingScreenTextureRegion;
	 private org.anddev.andengine.opengl.texture.atlas.bitmap.source.IBitmapTextureAtlasSource mSplashTextureAtlasSource;
	 /* # direct methods */
	 public org.anddev.andengine.ui.activity.BaseSplashActivity ( ) {
		 /* .locals 0 */
		 /* invoke-direct {p0}, Lorg/anddev/andengine/ui/activity/BaseGameActivity;-><init>()V */
		 return;
	 } // .end method
	 /* # virtual methods */
	 protected abstract java.lang.Class getFollowUpActivity ( ) {
	 } // .end method
	 protected abstract org.anddev.andengine.engine.options.EngineOptions$ScreenOrientation getScreenOrientation ( ) {
	 } // .end method
	 protected org.anddev.andengine.engine.camera.Camera getSplashCamera ( Integer p0, Integer p1 ) {
		 /* .locals 4 */
		 int v3 = 0; // const/4 v3, 0x0
		 /* new-instance v0, Lorg/anddev/andengine/engine/camera/Camera; */
		 /* int-to-float v1, p1 */
		 /* int-to-float v2, p2 */
		 /* invoke-direct {v0, v3, v3, v1, v2}, Lorg/anddev/andengine/engine/camera/Camera;-><init>(FFFF)V */
	 } // .end method
	 protected abstract Float getSplashDuration ( ) {
	 } // .end method
	 protected org.anddev.andengine.engine.options.resolutionpolicy.IResolutionPolicy getSplashResolutionPolicy ( Integer p0, Integer p1 ) {
		 /* .locals 3 */
		 /* new-instance v0, Lorg/anddev/andengine/engine/options/resolutionpolicy/RatioResolutionPolicy; */
		 /* int-to-float v1, p1 */
		 /* int-to-float v2, p2 */
		 /* invoke-direct {v0, v1, v2}, Lorg/anddev/andengine/engine/options/resolutionpolicy/RatioResolutionPolicy;-><init>(FF)V */
	 } // .end method
	 protected Float getSplashScaleFrom ( ) {
		 /* .locals 1 */
		 /* const/high16 v0, 0x3f800000 # 1.0f */
	 } // .end method
	 protected Float getSplashScaleTo ( ) {
		 /* .locals 1 */
		 /* const/high16 v0, 0x3f800000 # 1.0f */
	 } // .end method
	 protected abstract org.anddev.andengine.opengl.texture.atlas.bitmap.source.IBitmapTextureAtlasSource onGetSplashTextureAtlasSource ( ) {
	 } // .end method
	 public void onLoadComplete ( ) {
		 /* .locals 0 */
		 return;
	 } // .end method
	 public org.anddev.andengine.engine.Engine onLoadEngine ( ) {
		 /* .locals 6 */
		 (( org.anddev.andengine.ui.activity.BaseSplashActivity ) p0 ).onGetSplashTextureAtlasSource ( ); // invoke-virtual {p0}, Lorg/anddev/andengine/ui/activity/BaseSplashActivity;->onGetSplashTextureAtlasSource()Lorg/anddev/andengine/opengl/texture/atlas/bitmap/source/IBitmapTextureAtlasSource;
		 this.mSplashTextureAtlasSource = v0;
		 v0 = 		 v0 = this.mSplashTextureAtlasSource;
		 v1 = 		 v1 = this.mSplashTextureAtlasSource;
		 (( org.anddev.andengine.ui.activity.BaseSplashActivity ) p0 ).getSplashCamera ( v0, v1 ); // invoke-virtual {p0, v0, v1}, Lorg/anddev/andengine/ui/activity/BaseSplashActivity;->getSplashCamera(II)Lorg/anddev/andengine/engine/camera/Camera;
		 this.mCamera = v2;
		 /* new-instance v2, Lorg/anddev/andengine/engine/Engine; */
		 /* new-instance v3, Lorg/anddev/andengine/engine/options/EngineOptions; */
		 int v4 = 1; // const/4 v4, 0x1
		 (( org.anddev.andengine.ui.activity.BaseSplashActivity ) p0 ).getScreenOrientation ( ); // invoke-virtual {p0}, Lorg/anddev/andengine/ui/activity/BaseSplashActivity;->getScreenOrientation()Lorg/anddev/andengine/engine/options/EngineOptions$ScreenOrientation;
		 (( org.anddev.andengine.ui.activity.BaseSplashActivity ) p0 ).getSplashResolutionPolicy ( v0, v1 ); // invoke-virtual {p0, v0, v1}, Lorg/anddev/andengine/ui/activity/BaseSplashActivity;->getSplashResolutionPolicy(II)Lorg/anddev/andengine/engine/options/resolutionpolicy/IResolutionPolicy;
		 v1 = this.mCamera;
		 /* invoke-direct {v3, v4, v5, v0, v1}, Lorg/anddev/andengine/engine/options/EngineOptions;-><init>(ZLorg/anddev/andengine/engine/options/EngineOptions$ScreenOrientation;Lorg/anddev/andengine/engine/options/resolutionpolicy/IResolutionPolicy;Lorg/anddev/andengine/engine/camera/Camera;)V */
		 /* invoke-direct {v2, v3}, Lorg/anddev/andengine/engine/Engine;-><init>(Lorg/anddev/andengine/engine/options/EngineOptions;)V */
	 } // .end method
	 public void onLoadResources ( ) {
		 /* .locals 4 */
		 int v3 = 0; // const/4 v3, 0x0
		 v0 = org.anddev.andengine.opengl.texture.atlas.bitmap.BitmapTextureAtlas$BitmapTextureFormat.RGBA_8888;
		 v1 = this.mSplashTextureAtlasSource;
		 v2 = org.anddev.andengine.opengl.texture.TextureOptions.BILINEAR_PREMULTIPLYALPHA;
		 org.anddev.andengine.opengl.texture.atlas.bitmap.BitmapTextureAtlasFactory .createForTextureAtlasSourceSize ( v0,v1,v2 );
		 v1 = this.mSplashTextureAtlasSource;
		 org.anddev.andengine.opengl.texture.atlas.bitmap.BitmapTextureAtlasTextureRegionFactory .createFromSource ( v0,v1,v3,v3 );
		 this.mLoadingScreenTextureRegion = v1;
		 (( org.anddev.andengine.ui.activity.BaseSplashActivity ) p0 ).getEngine ( ); // invoke-virtual {p0}, Lorg/anddev/andengine/ui/activity/BaseSplashActivity;->getEngine()Lorg/anddev/andengine/engine/Engine;
		 (( org.anddev.andengine.engine.Engine ) v1 ).getTextureManager ( ); // invoke-virtual {v1}, Lorg/anddev/andengine/engine/Engine;->getTextureManager()Lorg/anddev/andengine/opengl/texture/TextureManager;
		 (( org.anddev.andengine.opengl.texture.TextureManager ) v1 ).loadTexture ( v0 ); // invoke-virtual {v1, v0}, Lorg/anddev/andengine/opengl/texture/TextureManager;->loadTexture(Lorg/anddev/andengine/opengl/texture/ITexture;)Z
		 return;
	 } // .end method
	 public org.anddev.andengine.entity.scene.Scene onLoadScene ( ) {
		 /* .locals 6 */
		 v3 = 		 (( org.anddev.andengine.ui.activity.BaseSplashActivity ) p0 ).getSplashDuration ( ); // invoke-virtual {p0}, Lorg/anddev/andengine/ui/activity/BaseSplashActivity;->getSplashDuration()F
		 /* new-instance v0, Lorg/anddev/andengine/entity/scene/SplashScene; */
		 v1 = this.mCamera;
		 v2 = this.mLoadingScreenTextureRegion;
		 v4 = 		 (( org.anddev.andengine.ui.activity.BaseSplashActivity ) p0 ).getSplashScaleFrom ( ); // invoke-virtual {p0}, Lorg/anddev/andengine/ui/activity/BaseSplashActivity;->getSplashScaleFrom()F
		 v5 = 		 (( org.anddev.andengine.ui.activity.BaseSplashActivity ) p0 ).getSplashScaleTo ( ); // invoke-virtual {p0}, Lorg/anddev/andengine/ui/activity/BaseSplashActivity;->getSplashScaleTo()F
		 /* invoke-direct/range {v0 ..v5}, Lorg/anddev/andengine/entity/scene/SplashScene;-><init>(Lorg/anddev/andengine/engine/camera/Camera;Lorg/anddev/andengine/opengl/texture/region/TextureRegion;FFF)V */
		 /* new-instance v1, Lorg/anddev/andengine/engine/handler/timer/TimerHandler; */
		 /* new-instance v2, Lorg/anddev/andengine/ui/activity/BaseSplashActivity$1; */
		 /* invoke-direct {v2, p0}, Lorg/anddev/andengine/ui/activity/BaseSplashActivity$1;-><init>(Lorg/anddev/andengine/ui/activity/BaseSplashActivity;)V */
		 /* invoke-direct {v1, v3, v2}, Lorg/anddev/andengine/engine/handler/timer/TimerHandler;-><init>(FLorg/anddev/andengine/engine/handler/timer/ITimerCallback;)V */
		 (( org.anddev.andengine.entity.scene.SplashScene ) v0 ).registerUpdateHandler ( v1 ); // invoke-virtual {v0, v1}, Lorg/anddev/andengine/entity/scene/SplashScene;->registerUpdateHandler(Lorg/anddev/andengine/engine/handler/IUpdateHandler;)V
	 } // .end method
