public abstract class org.anddev.andengine.ui.activity.BaseGameActivity extends org.anddev.andengine.ui.activity.BaseActivity implements org.anddev.andengine.ui.IGameInterface {
	 /* # interfaces */
	 /* # static fields */
	 private static $SWITCH_TABLE$org$anddev$andengine$engine$options$EngineOptions$ScreenOrientation; //synthetic
	 /* # instance fields */
	 protected org.anddev.andengine.engine.Engine mEngine;
	 private Boolean mGameLoaded;
	 protected Boolean mHasWindowFocused;
	 private Boolean mPaused;
	 protected org.anddev.andengine.opengl.view.RenderSurfaceView mRenderSurfaceView;
	 private android.os.PowerManager$WakeLock mWakeLock;
	 /* # direct methods */
	 static $SWITCH_TABLE$org$anddev$andengine$engine$options$EngineOptions$ScreenOrientation ( ) { //synthethic
		 /* .locals 3 */
		 v0 = org.anddev.andengine.ui.activity.BaseGameActivity.$SWITCH_TABLE$org$anddev$andengine$engine$options$EngineOptions$ScreenOrientation;
		 if ( v0 != null) { // if-eqz v0, :cond_0
		 } // :goto_0
	 } // :cond_0
	 org.anddev.andengine.engine.options.EngineOptions$ScreenOrientation .values ( );
	 /* array-length v0, v0 */
	 /* new-array v0, v0, [I */
	 try { // :try_start_0
		 v1 = org.anddev.andengine.engine.options.EngineOptions$ScreenOrientation.LANDSCAPE;
		 v1 = 		 (( org.anddev.andengine.engine.options.EngineOptions$ScreenOrientation ) v1 ).ordinal ( ); // invoke-virtual {v1}, Lorg/anddev/andengine/engine/options/EngineOptions$ScreenOrientation;->ordinal()I
		 int v2 = 1; // const/4 v2, 0x1
		 /* aput v2, v0, v1 */
		 /* :try_end_0 */
		 /* .catch Ljava/lang/NoSuchFieldError; {:try_start_0 ..:try_end_0} :catch_1 */
	 } // :goto_1
	 try { // :try_start_1
		 v1 = org.anddev.andengine.engine.options.EngineOptions$ScreenOrientation.PORTRAIT;
		 v1 = 		 (( org.anddev.andengine.engine.options.EngineOptions$ScreenOrientation ) v1 ).ordinal ( ); // invoke-virtual {v1}, Lorg/anddev/andengine/engine/options/EngineOptions$ScreenOrientation;->ordinal()I
		 int v2 = 2; // const/4 v2, 0x2
		 /* aput v2, v0, v1 */
		 /* :try_end_1 */
		 /* .catch Ljava/lang/NoSuchFieldError; {:try_start_1 ..:try_end_1} :catch_0 */
	 } // :goto_2
	 /* :catch_0 */
	 /* move-exception v1 */
	 /* :catch_1 */
	 /* move-exception v1 */
} // .end method
public org.anddev.andengine.ui.activity.BaseGameActivity ( ) {
	 /* .locals 0 */
	 /* invoke-direct {p0}, Lorg/anddev/andengine/ui/activity/BaseActivity;-><init>()V */
	 return;
} // .end method
private void acquireWakeLock ( org.anddev.andengine.engine.options.WakeLockOptions p0 ) {
	 /* .locals 3 */
	 v0 = org.anddev.andengine.engine.options.WakeLockOptions.SCREEN_ON;
	 /* if-ne p1, v0, :cond_0 */
	 org.anddev.andengine.util.ActivityUtils .keepScreenOn ( p0 );
} // :goto_0
return;
} // :cond_0
final String v0 = "power"; // const-string v0, "power"
(( org.anddev.andengine.ui.activity.BaseGameActivity ) p0 ).getSystemService ( v0 ); // invoke-virtual {p0, v0}, Lorg/anddev/andengine/ui/activity/BaseGameActivity;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;
/* check-cast v0, Landroid/os/PowerManager; */
v1 = (( org.anddev.andengine.engine.options.WakeLockOptions ) p1 ).getFlag ( ); // invoke-virtual {p1}, Lorg/anddev/andengine/engine/options/WakeLockOptions;->getFlag()I
/* const/high16 v2, 0x20000000 */
/* or-int/2addr v1, v2 */
final String v2 = "AndEngine"; // const-string v2, "AndEngine"
(( android.os.PowerManager ) v0 ).newWakeLock ( v1, v2 ); // invoke-virtual {v0, v1, v2}, Landroid/os/PowerManager;->newWakeLock(ILjava/lang/String;)Landroid/os/PowerManager$WakeLock;
this.mWakeLock = v0;
try { // :try_start_0
v0 = this.mWakeLock;
(( android.os.PowerManager$WakeLock ) v0 ).acquire ( ); // invoke-virtual {v0}, Landroid/os/PowerManager$WakeLock;->acquire()V
/* :try_end_0 */
/* .catch Ljava/lang/SecurityException; {:try_start_0 ..:try_end_0} :catch_0 */
/* :catch_0 */
/* move-exception v0 */
final String v1 = "You have to add\n\t<uses-permission android:name=\"android.permission.WAKE_LOCK\"/>\nto your AndroidManifest.xml !"; // const-string v1, "You have to add\n\t<uses-permission android:name=\"android.permission.WAKE_LOCK\"/>\nto your AndroidManifest.xml !"
org.anddev.andengine.util.Debug .e ( v1,v0 );
} // .end method
private void applyEngineOptions ( org.anddev.andengine.engine.options.EngineOptions p0 ) {
/* .locals 2 */
v0 = (( org.anddev.andengine.engine.options.EngineOptions ) p1 ).isFullscreen ( ); // invoke-virtual {p1}, Lorg/anddev/andengine/engine/options/EngineOptions;->isFullscreen()Z
if ( v0 != null) { // if-eqz v0, :cond_0
	 org.anddev.andengine.util.ActivityUtils .requestFullscreen ( p0 );
} // :cond_0
v0 = (( org.anddev.andengine.engine.options.EngineOptions ) p1 ).needsMusic ( ); // invoke-virtual {p1}, Lorg/anddev/andengine/engine/options/EngineOptions;->needsMusic()Z
/* if-nez v0, :cond_1 */
v0 = (( org.anddev.andengine.engine.options.EngineOptions ) p1 ).needsSound ( ); // invoke-virtual {p1}, Lorg/anddev/andengine/engine/options/EngineOptions;->needsSound()Z
if ( v0 != null) { // if-eqz v0, :cond_2
} // :cond_1
int v0 = 3; // const/4 v0, 0x3
(( org.anddev.andengine.ui.activity.BaseGameActivity ) p0 ).setVolumeControlStream ( v0 ); // invoke-virtual {p0, v0}, Lorg/anddev/andengine/ui/activity/BaseGameActivity;->setVolumeControlStream(I)V
} // :cond_2
org.anddev.andengine.ui.activity.BaseGameActivity .$SWITCH_TABLE$org$anddev$andengine$engine$options$EngineOptions$ScreenOrientation ( );
(( org.anddev.andengine.engine.options.EngineOptions ) p1 ).getScreenOrientation ( ); // invoke-virtual {p1}, Lorg/anddev/andengine/engine/options/EngineOptions;->getScreenOrientation()Lorg/anddev/andengine/engine/options/EngineOptions$ScreenOrientation;
v1 = (( org.anddev.andengine.engine.options.EngineOptions$ScreenOrientation ) v1 ).ordinal ( ); // invoke-virtual {v1}, Lorg/anddev/andengine/engine/options/EngineOptions$ScreenOrientation;->ordinal()I
/* aget v0, v0, v1 */
/* packed-switch v0, :pswitch_data_0 */
} // :goto_0
return;
/* :pswitch_0 */
int v0 = 0; // const/4 v0, 0x0
(( org.anddev.andengine.ui.activity.BaseGameActivity ) p0 ).setRequestedOrientation ( v0 ); // invoke-virtual {p0, v0}, Lorg/anddev/andengine/ui/activity/BaseGameActivity;->setRequestedOrientation(I)V
/* :pswitch_1 */
int v0 = 1; // const/4 v0, 0x1
(( org.anddev.andengine.ui.activity.BaseGameActivity ) p0 ).setRequestedOrientation ( v0 ); // invoke-virtual {p0, v0}, Lorg/anddev/andengine/ui/activity/BaseGameActivity;->setRequestedOrientation(I)V
/* nop */
/* :pswitch_data_0 */
/* .packed-switch 0x1 */
/* :pswitch_0 */
/* :pswitch_1 */
} // .end packed-switch
} // .end method
private void doPause ( ) {
/* .locals 1 */
int v0 = 1; // const/4 v0, 0x1
/* iput-boolean v0, p0, Lorg/anddev/andengine/ui/activity/BaseGameActivity;->mPaused:Z */
/* invoke-direct {p0}, Lorg/anddev/andengine/ui/activity/BaseGameActivity;->releaseWakeLock()V */
v0 = this.mEngine;
(( org.anddev.andengine.engine.Engine ) v0 ).onPause ( ); // invoke-virtual {v0}, Lorg/anddev/andengine/engine/Engine;->onPause()V
v0 = this.mEngine;
(( org.anddev.andengine.engine.Engine ) v0 ).stop ( ); // invoke-virtual {v0}, Lorg/anddev/andengine/engine/Engine;->stop()V
v0 = this.mRenderSurfaceView;
(( org.anddev.andengine.opengl.view.RenderSurfaceView ) v0 ).onPause ( ); // invoke-virtual {v0}, Lorg/anddev/andengine/opengl/view/RenderSurfaceView;->onPause()V
(( org.anddev.andengine.ui.activity.BaseGameActivity ) p0 ).onPauseGame ( ); // invoke-virtual {p0}, Lorg/anddev/andengine/ui/activity/BaseGameActivity;->onPauseGame()V
return;
} // .end method
private void doResume ( ) {
/* .locals 2 */
/* iget-boolean v0, p0, Lorg/anddev/andengine/ui/activity/BaseGameActivity;->mGameLoaded:Z */
/* if-nez v0, :cond_0 */
(( org.anddev.andengine.ui.activity.BaseGameActivity ) p0 ).onLoadResources ( ); // invoke-virtual {p0}, Lorg/anddev/andengine/ui/activity/BaseGameActivity;->onLoadResources()V
(( org.anddev.andengine.ui.activity.BaseGameActivity ) p0 ).onLoadScene ( ); // invoke-virtual {p0}, Lorg/anddev/andengine/ui/activity/BaseGameActivity;->onLoadScene()Lorg/anddev/andengine/entity/scene/Scene;
v1 = this.mEngine;
(( org.anddev.andengine.engine.Engine ) v1 ).onLoadComplete ( v0 ); // invoke-virtual {v1, v0}, Lorg/anddev/andengine/engine/Engine;->onLoadComplete(Lorg/anddev/andengine/entity/scene/Scene;)V
(( org.anddev.andengine.ui.activity.BaseGameActivity ) p0 ).onLoadComplete ( ); // invoke-virtual {p0}, Lorg/anddev/andengine/ui/activity/BaseGameActivity;->onLoadComplete()V
int v0 = 1; // const/4 v0, 0x1
/* iput-boolean v0, p0, Lorg/anddev/andengine/ui/activity/BaseGameActivity;->mGameLoaded:Z */
} // :cond_0
int v0 = 0; // const/4 v0, 0x0
/* iput-boolean v0, p0, Lorg/anddev/andengine/ui/activity/BaseGameActivity;->mPaused:Z */
v0 = this.mEngine;
(( org.anddev.andengine.engine.Engine ) v0 ).getEngineOptions ( ); // invoke-virtual {v0}, Lorg/anddev/andengine/engine/Engine;->getEngineOptions()Lorg/anddev/andengine/engine/options/EngineOptions;
(( org.anddev.andengine.engine.options.EngineOptions ) v0 ).getWakeLockOptions ( ); // invoke-virtual {v0}, Lorg/anddev/andengine/engine/options/EngineOptions;->getWakeLockOptions()Lorg/anddev/andengine/engine/options/WakeLockOptions;
/* invoke-direct {p0, v0}, Lorg/anddev/andengine/ui/activity/BaseGameActivity;->acquireWakeLock(Lorg/anddev/andengine/engine/options/WakeLockOptions;)V */
v0 = this.mEngine;
(( org.anddev.andengine.engine.Engine ) v0 ).onResume ( ); // invoke-virtual {v0}, Lorg/anddev/andengine/engine/Engine;->onResume()V
v0 = this.mRenderSurfaceView;
(( org.anddev.andengine.opengl.view.RenderSurfaceView ) v0 ).onResume ( ); // invoke-virtual {v0}, Lorg/anddev/andengine/opengl/view/RenderSurfaceView;->onResume()V
v0 = this.mEngine;
(( org.anddev.andengine.engine.Engine ) v0 ).start ( ); // invoke-virtual {v0}, Lorg/anddev/andengine/engine/Engine;->start()V
(( org.anddev.andengine.ui.activity.BaseGameActivity ) p0 ).onResumeGame ( ); // invoke-virtual {p0}, Lorg/anddev/andengine/ui/activity/BaseGameActivity;->onResumeGame()V
return;
} // .end method
private void releaseWakeLock ( ) {
/* .locals 1 */
v0 = this.mWakeLock;
if ( v0 != null) { // if-eqz v0, :cond_0
v0 = this.mWakeLock;
v0 = (( android.os.PowerManager$WakeLock ) v0 ).isHeld ( ); // invoke-virtual {v0}, Landroid/os/PowerManager$WakeLock;->isHeld()Z
if ( v0 != null) { // if-eqz v0, :cond_0
v0 = this.mWakeLock;
(( android.os.PowerManager$WakeLock ) v0 ).release ( ); // invoke-virtual {v0}, Landroid/os/PowerManager$WakeLock;->release()V
} // :cond_0
return;
} // .end method
/* # virtual methods */
protected android.widget.FrameLayout$LayoutParams createSurfaceViewLayoutParams ( ) {
/* .locals 2 */
int v1 = -1; // const/4 v1, -0x1
/* new-instance v0, Landroid/widget/FrameLayout$LayoutParams; */
/* invoke-direct {v0, v1, v1}, Landroid/widget/FrameLayout$LayoutParams;-><init>(II)V */
/* const/16 v1, 0x11 */
/* iput v1, v0, Landroid/widget/FrameLayout$LayoutParams;->gravity:I */
} // .end method
protected Boolean disableAccelerometerSensor ( ) {
/* .locals 1 */
v0 = this.mEngine;
v0 = (( org.anddev.andengine.engine.Engine ) v0 ).disableAccelerometerSensor ( p0 ); // invoke-virtual {v0, p0}, Lorg/anddev/andengine/engine/Engine;->disableAccelerometerSensor(Landroid/content/Context;)Z
} // .end method
protected void disableLocationSensor ( ) {
/* .locals 1 */
v0 = this.mEngine;
(( org.anddev.andengine.engine.Engine ) v0 ).disableLocationSensor ( p0 ); // invoke-virtual {v0, p0}, Lorg/anddev/andengine/engine/Engine;->disableLocationSensor(Landroid/content/Context;)V
return;
} // .end method
protected Boolean disableOrientationSensor ( ) {
/* .locals 1 */
v0 = this.mEngine;
v0 = (( org.anddev.andengine.engine.Engine ) v0 ).disableOrientationSensor ( p0 ); // invoke-virtual {v0, p0}, Lorg/anddev/andengine/engine/Engine;->disableOrientationSensor(Landroid/content/Context;)Z
} // .end method
protected Boolean enableAccelerometerSensor ( org.anddev.andengine.sensor.accelerometer.IAccelerometerListener p0 ) {
/* .locals 1 */
v0 = this.mEngine;
v0 = (( org.anddev.andengine.engine.Engine ) v0 ).enableAccelerometerSensor ( p0, p1 ); // invoke-virtual {v0, p0, p1}, Lorg/anddev/andengine/engine/Engine;->enableAccelerometerSensor(Landroid/content/Context;Lorg/anddev/andengine/sensor/accelerometer/IAccelerometerListener;)Z
} // .end method
protected Boolean enableAccelerometerSensor ( org.anddev.andengine.sensor.accelerometer.IAccelerometerListener p0, org.anddev.andengine.sensor.accelerometer.AccelerometerSensorOptions p1 ) {
/* .locals 1 */
v0 = this.mEngine;
v0 = (( org.anddev.andengine.engine.Engine ) v0 ).enableAccelerometerSensor ( p0, p1, p2 ); // invoke-virtual {v0, p0, p1, p2}, Lorg/anddev/andengine/engine/Engine;->enableAccelerometerSensor(Landroid/content/Context;Lorg/anddev/andengine/sensor/accelerometer/IAccelerometerListener;Lorg/anddev/andengine/sensor/accelerometer/AccelerometerSensorOptions;)Z
} // .end method
protected void enableLocationSensor ( org.anddev.andengine.sensor.location.ILocationListener p0, org.anddev.andengine.sensor.location.LocationSensorOptions p1 ) {
/* .locals 1 */
v0 = this.mEngine;
(( org.anddev.andengine.engine.Engine ) v0 ).enableLocationSensor ( p0, p1, p2 ); // invoke-virtual {v0, p0, p1, p2}, Lorg/anddev/andengine/engine/Engine;->enableLocationSensor(Landroid/content/Context;Lorg/anddev/andengine/sensor/location/ILocationListener;Lorg/anddev/andengine/sensor/location/LocationSensorOptions;)V
return;
} // .end method
protected Boolean enableOrientationSensor ( org.anddev.andengine.sensor.orientation.IOrientationListener p0 ) {
/* .locals 1 */
v0 = this.mEngine;
v0 = (( org.anddev.andengine.engine.Engine ) v0 ).enableOrientationSensor ( p0, p1 ); // invoke-virtual {v0, p0, p1}, Lorg/anddev/andengine/engine/Engine;->enableOrientationSensor(Landroid/content/Context;Lorg/anddev/andengine/sensor/orientation/IOrientationListener;)Z
} // .end method
protected Boolean enableOrientationSensor ( org.anddev.andengine.sensor.orientation.IOrientationListener p0, org.anddev.andengine.sensor.orientation.OrientationSensorOptions p1 ) {
/* .locals 1 */
v0 = this.mEngine;
v0 = (( org.anddev.andengine.engine.Engine ) v0 ).enableOrientationSensor ( p0, p1, p2 ); // invoke-virtual {v0, p0, p1, p2}, Lorg/anddev/andengine/engine/Engine;->enableOrientationSensor(Landroid/content/Context;Lorg/anddev/andengine/sensor/orientation/IOrientationListener;Lorg/anddev/andengine/sensor/orientation/OrientationSensorOptions;)Z
} // .end method
protected void enableVibrator ( ) {
/* .locals 1 */
v0 = this.mEngine;
(( org.anddev.andengine.engine.Engine ) v0 ).enableVibrator ( p0 ); // invoke-virtual {v0, p0}, Lorg/anddev/andengine/engine/Engine;->enableVibrator(Landroid/content/Context;)Z
return;
} // .end method
public org.anddev.andengine.engine.Engine getEngine ( ) {
/* .locals 1 */
v0 = this.mEngine;
} // .end method
public org.anddev.andengine.audio.music.MusicManager getMusicManager ( ) {
/* .locals 1 */
v0 = this.mEngine;
(( org.anddev.andengine.engine.Engine ) v0 ).getMusicManager ( ); // invoke-virtual {v0}, Lorg/anddev/andengine/engine/Engine;->getMusicManager()Lorg/anddev/andengine/audio/music/MusicManager;
} // .end method
public org.anddev.andengine.audio.sound.SoundManager getSoundManager ( ) {
/* .locals 1 */
v0 = this.mEngine;
(( org.anddev.andengine.engine.Engine ) v0 ).getSoundManager ( ); // invoke-virtual {v0}, Lorg/anddev/andengine/engine/Engine;->getSoundManager()Lorg/anddev/andengine/audio/sound/SoundManager;
} // .end method
protected void onCreate ( android.os.Bundle p0 ) {
/* .locals 1 */
/* invoke-super {p0, p1}, Lorg/anddev/andengine/ui/activity/BaseActivity;->onCreate(Landroid/os/Bundle;)V */
int v0 = 1; // const/4 v0, 0x1
/* iput-boolean v0, p0, Lorg/anddev/andengine/ui/activity/BaseGameActivity;->mPaused:Z */
(( org.anddev.andengine.ui.activity.BaseGameActivity ) p0 ).onLoadEngine ( ); // invoke-virtual {p0}, Lorg/anddev/andengine/ui/activity/BaseGameActivity;->onLoadEngine()Lorg/anddev/andengine/engine/Engine;
this.mEngine = v0;
v0 = this.mEngine;
(( org.anddev.andengine.engine.Engine ) v0 ).getEngineOptions ( ); // invoke-virtual {v0}, Lorg/anddev/andengine/engine/Engine;->getEngineOptions()Lorg/anddev/andengine/engine/options/EngineOptions;
/* invoke-direct {p0, v0}, Lorg/anddev/andengine/ui/activity/BaseGameActivity;->applyEngineOptions(Lorg/anddev/andengine/engine/options/EngineOptions;)V */
(( org.anddev.andengine.ui.activity.BaseGameActivity ) p0 ).onSetContentView ( ); // invoke-virtual {p0}, Lorg/anddev/andengine/ui/activity/BaseGameActivity;->onSetContentView()V
return;
} // .end method
protected void onDestroy ( ) {
/* .locals 1 */
/* invoke-super {p0}, Lorg/anddev/andengine/ui/activity/BaseActivity;->onDestroy()V */
v0 = this.mEngine;
(( org.anddev.andengine.engine.Engine ) v0 ).interruptUpdateThread ( ); // invoke-virtual {v0}, Lorg/anddev/andengine/engine/Engine;->interruptUpdateThread()V
(( org.anddev.andengine.ui.activity.BaseGameActivity ) p0 ).onUnloadResources ( ); // invoke-virtual {p0}, Lorg/anddev/andengine/ui/activity/BaseGameActivity;->onUnloadResources()V
return;
} // .end method
protected void onPause ( ) {
/* .locals 1 */
/* invoke-super {p0}, Lorg/anddev/andengine/ui/activity/BaseActivity;->onPause()V */
/* iget-boolean v0, p0, Lorg/anddev/andengine/ui/activity/BaseGameActivity;->mPaused:Z */
/* if-nez v0, :cond_0 */
/* invoke-direct {p0}, Lorg/anddev/andengine/ui/activity/BaseGameActivity;->doPause()V */
} // :cond_0
return;
} // .end method
public void onPauseGame ( ) {
/* .locals 0 */
return;
} // .end method
protected void onResume ( ) {
/* .locals 1 */
/* invoke-super {p0}, Lorg/anddev/andengine/ui/activity/BaseActivity;->onResume()V */
/* iget-boolean v0, p0, Lorg/anddev/andengine/ui/activity/BaseGameActivity;->mPaused:Z */
if ( v0 != null) { // if-eqz v0, :cond_0
/* iget-boolean v0, p0, Lorg/anddev/andengine/ui/activity/BaseGameActivity;->mHasWindowFocused:Z */
if ( v0 != null) { // if-eqz v0, :cond_0
/* invoke-direct {p0}, Lorg/anddev/andengine/ui/activity/BaseGameActivity;->doResume()V */
} // :cond_0
return;
} // .end method
public void onResumeGame ( ) {
/* .locals 0 */
return;
} // .end method
protected void onSetContentView ( ) {
/* .locals 2 */
/* new-instance v0, Lorg/anddev/andengine/opengl/view/RenderSurfaceView; */
/* invoke-direct {v0, p0}, Lorg/anddev/andengine/opengl/view/RenderSurfaceView;-><init>(Landroid/content/Context;)V */
this.mRenderSurfaceView = v0;
v0 = this.mRenderSurfaceView;
int v1 = 0; // const/4 v1, 0x0
(( org.anddev.andengine.opengl.view.RenderSurfaceView ) v0 ).setEGLConfigChooser ( v1 ); // invoke-virtual {v0, v1}, Lorg/anddev/andengine/opengl/view/RenderSurfaceView;->setEGLConfigChooser(Z)V
v0 = this.mRenderSurfaceView;
v1 = this.mEngine;
(( org.anddev.andengine.opengl.view.RenderSurfaceView ) v0 ).setRenderer ( v1 ); // invoke-virtual {v0, v1}, Lorg/anddev/andengine/opengl/view/RenderSurfaceView;->setRenderer(Lorg/anddev/andengine/engine/Engine;)V
v0 = this.mRenderSurfaceView;
(( org.anddev.andengine.ui.activity.BaseGameActivity ) p0 ).createSurfaceViewLayoutParams ( ); // invoke-virtual {p0}, Lorg/anddev/andengine/ui/activity/BaseGameActivity;->createSurfaceViewLayoutParams()Landroid/widget/FrameLayout$LayoutParams;
(( org.anddev.andengine.ui.activity.BaseGameActivity ) p0 ).setContentView ( v0, v1 ); // invoke-virtual {p0, v0, v1}, Lorg/anddev/andengine/ui/activity/BaseGameActivity;->setContentView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V
return;
} // .end method
public void onUnloadResources ( ) {
/* .locals 1 */
v0 = this.mEngine;
(( org.anddev.andengine.engine.Engine ) v0 ).getEngineOptions ( ); // invoke-virtual {v0}, Lorg/anddev/andengine/engine/Engine;->getEngineOptions()Lorg/anddev/andengine/engine/options/EngineOptions;
v0 = (( org.anddev.andengine.engine.options.EngineOptions ) v0 ).needsMusic ( ); // invoke-virtual {v0}, Lorg/anddev/andengine/engine/options/EngineOptions;->needsMusic()Z
if ( v0 != null) { // if-eqz v0, :cond_0
(( org.anddev.andengine.ui.activity.BaseGameActivity ) p0 ).getMusicManager ( ); // invoke-virtual {p0}, Lorg/anddev/andengine/ui/activity/BaseGameActivity;->getMusicManager()Lorg/anddev/andengine/audio/music/MusicManager;
(( org.anddev.andengine.audio.music.MusicManager ) v0 ).releaseAll ( ); // invoke-virtual {v0}, Lorg/anddev/andengine/audio/music/MusicManager;->releaseAll()V
} // :cond_0
v0 = this.mEngine;
(( org.anddev.andengine.engine.Engine ) v0 ).getEngineOptions ( ); // invoke-virtual {v0}, Lorg/anddev/andengine/engine/Engine;->getEngineOptions()Lorg/anddev/andengine/engine/options/EngineOptions;
v0 = (( org.anddev.andengine.engine.options.EngineOptions ) v0 ).needsSound ( ); // invoke-virtual {v0}, Lorg/anddev/andengine/engine/options/EngineOptions;->needsSound()Z
if ( v0 != null) { // if-eqz v0, :cond_1
(( org.anddev.andengine.ui.activity.BaseGameActivity ) p0 ).getSoundManager ( ); // invoke-virtual {p0}, Lorg/anddev/andengine/ui/activity/BaseGameActivity;->getSoundManager()Lorg/anddev/andengine/audio/sound/SoundManager;
(( org.anddev.andengine.audio.sound.SoundManager ) v0 ).releaseAll ( ); // invoke-virtual {v0}, Lorg/anddev/andengine/audio/sound/SoundManager;->releaseAll()V
} // :cond_1
return;
} // .end method
public void onWindowFocusChanged ( Boolean p0 ) {
/* .locals 1 */
/* invoke-super {p0, p1}, Lorg/anddev/andengine/ui/activity/BaseActivity;->onWindowFocusChanged(Z)V */
if ( p1 != null) { // if-eqz p1, :cond_1
/* iget-boolean v0, p0, Lorg/anddev/andengine/ui/activity/BaseGameActivity;->mPaused:Z */
if ( v0 != null) { // if-eqz v0, :cond_0
/* invoke-direct {p0}, Lorg/anddev/andengine/ui/activity/BaseGameActivity;->doResume()V */
} // :cond_0
int v0 = 1; // const/4 v0, 0x1
/* iput-boolean v0, p0, Lorg/anddev/andengine/ui/activity/BaseGameActivity;->mHasWindowFocused:Z */
} // :goto_0
return;
} // :cond_1
/* iget-boolean v0, p0, Lorg/anddev/andengine/ui/activity/BaseGameActivity;->mPaused:Z */
/* if-nez v0, :cond_2 */
/* invoke-direct {p0}, Lorg/anddev/andengine/ui/activity/BaseGameActivity;->doPause()V */
} // :cond_2
int v0 = 0; // const/4 v0, 0x0
/* iput-boolean v0, p0, Lorg/anddev/andengine/ui/activity/BaseGameActivity;->mHasWindowFocused:Z */
} // .end method
public void runOnUpdateThread ( java.lang.Runnable p0 ) {
/* .locals 1 */
v0 = this.mEngine;
(( org.anddev.andengine.engine.Engine ) v0 ).runOnUpdateThread ( p1 ); // invoke-virtual {v0, p1}, Lorg/anddev/andengine/engine/Engine;->runOnUpdateThread(Ljava/lang/Runnable;)V
return;
} // .end method
