public class org.anddev.andengine.engine.Engine implements android.hardware.SensorEventListener implements android.location.LocationListener implements android.view.View$OnTouchListener implements org.anddev.andengine.input.touch.controller.ITouchController$ITouchEventCallback implements org.anddev.andengine.util.constants.TimeConstants {
	 /* # interfaces */
	 /* # static fields */
	 private static final org.anddev.andengine.sensor.SensorDelay SENSORDELAY_DEFAULT;
	 private static final Integer UPDATEHANDLERS_CAPACITY_DEFAULT;
	 /* # instance fields */
	 private org.anddev.andengine.sensor.accelerometer.AccelerometerData mAccelerometerData;
	 private org.anddev.andengine.sensor.accelerometer.IAccelerometerListener mAccelerometerListener;
	 private final org.anddev.andengine.opengl.buffer.BufferObjectManager mBufferObjectManager;
	 protected final org.anddev.andengine.engine.camera.Camera mCamera;
	 private final org.anddev.andengine.engine.options.EngineOptions mEngineOptions;
	 private final org.anddev.andengine.opengl.font.FontManager mFontManager;
	 private Boolean mIsMethodTracing;
	 private Long mLastTick;
	 private android.location.Location mLocation;
	 private org.anddev.andengine.sensor.location.ILocationListener mLocationListener;
	 private org.anddev.andengine.audio.music.MusicManager mMusicManager;
	 private org.anddev.andengine.sensor.orientation.OrientationData mOrientationData;
	 private org.anddev.andengine.sensor.orientation.IOrientationListener mOrientationListener;
	 private Boolean mRunning;
	 protected org.anddev.andengine.entity.scene.Scene mScene;
	 private Float mSecondsElapsedTotal;
	 private org.anddev.andengine.audio.sound.SoundManager mSoundManager;
	 protected Integer mSurfaceHeight;
	 protected Integer mSurfaceWidth;
	 private final org.anddev.andengine.opengl.texture.TextureManager mTextureManager;
	 private final org.anddev.andengine.engine.Engine$State mThreadLocker;
	 private org.anddev.andengine.input.touch.controller.ITouchController mTouchController;
	 private final org.anddev.andengine.engine.handler.UpdateHandlerList mUpdateHandlers;
	 private final org.anddev.andengine.engine.Engine$UpdateThread mUpdateThread;
	 private final org.anddev.andengine.engine.handler.runnable.RunnableHandler mUpdateThreadRunnableHandler;
	 private android.os.Vibrator mVibrator;
	 /* # direct methods */
	 static org.anddev.andengine.engine.Engine ( ) {
		 /* .locals 1 */
		 v0 = org.anddev.andengine.sensor.SensorDelay.GAME;
		 return;
	 } // .end method
	 public org.anddev.andengine.engine.Engine ( ) {
		 /* .locals 3 */
		 int v2 = 1; // const/4 v2, 0x1
		 /* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
		 int v0 = 0; // const/4 v0, 0x0
		 /* iput-boolean v0, p0, Lorg/anddev/andengine/engine/Engine;->mRunning:Z */
		 /* const-wide/16 v0, -0x1 */
		 /* iput-wide v0, p0, Lorg/anddev/andengine/engine/Engine;->mLastTick:J */
		 int v0 = 0; // const/4 v0, 0x0
		 /* iput v0, p0, Lorg/anddev/andengine/engine/Engine;->mSecondsElapsedTotal:F */
		 /* new-instance v0, Lorg/anddev/andengine/engine/Engine$State; */
		 int v1 = 0; // const/4 v1, 0x0
		 /* invoke-direct {v0, v1}, Lorg/anddev/andengine/engine/Engine$State;-><init>(Lorg/anddev/andengine/engine/Engine$State;)V */
		 this.mThreadLocker = v0;
		 /* new-instance v0, Lorg/anddev/andengine/engine/Engine$UpdateThread; */
		 /* invoke-direct {v0, p0}, Lorg/anddev/andengine/engine/Engine$UpdateThread;-><init>(Lorg/anddev/andengine/engine/Engine;)V */
		 this.mUpdateThread = v0;
		 /* new-instance v0, Lorg/anddev/andengine/engine/handler/runnable/RunnableHandler; */
		 /* invoke-direct {v0}, Lorg/anddev/andengine/engine/handler/runnable/RunnableHandler;-><init>()V */
		 this.mUpdateThreadRunnableHandler = v0;
		 /* new-instance v0, Lorg/anddev/andengine/opengl/texture/TextureManager; */
		 /* invoke-direct {v0}, Lorg/anddev/andengine/opengl/texture/TextureManager;-><init>()V */
		 this.mTextureManager = v0;
		 /* new-instance v0, Lorg/anddev/andengine/opengl/buffer/BufferObjectManager; */
		 /* invoke-direct {v0}, Lorg/anddev/andengine/opengl/buffer/BufferObjectManager;-><init>()V */
		 this.mBufferObjectManager = v0;
		 /* new-instance v0, Lorg/anddev/andengine/opengl/font/FontManager; */
		 /* invoke-direct {v0}, Lorg/anddev/andengine/opengl/font/FontManager;-><init>()V */
		 this.mFontManager = v0;
		 /* new-instance v0, Lorg/anddev/andengine/engine/handler/UpdateHandlerList; */
		 /* const/16 v1, 0x20 */
		 /* invoke-direct {v0, v1}, Lorg/anddev/andengine/engine/handler/UpdateHandlerList;-><init>(I)V */
		 this.mUpdateHandlers = v0;
		 /* iput v2, p0, Lorg/anddev/andengine/engine/Engine;->mSurfaceWidth:I */
		 /* iput v2, p0, Lorg/anddev/andengine/engine/Engine;->mSurfaceHeight:I */
		 org.anddev.andengine.opengl.texture.atlas.bitmap.BitmapTextureAtlasTextureRegionFactory .reset ( );
		 org.anddev.andengine.audio.sound.SoundFactory .reset ( );
		 org.anddev.andengine.audio.music.MusicFactory .reset ( );
		 org.anddev.andengine.opengl.font.FontFactory .reset ( );
		 v0 = this.mBufferObjectManager;
		 org.anddev.andengine.opengl.buffer.BufferObjectManager .setActiveInstance ( v0 );
		 this.mEngineOptions = p1;
		 /* new-instance v0, Lorg/anddev/andengine/input/touch/controller/SingleTouchControler; */
		 /* invoke-direct {v0}, Lorg/anddev/andengine/input/touch/controller/SingleTouchControler;-><init>()V */
		 (( org.anddev.andengine.engine.Engine ) p0 ).setTouchController ( v0 ); // invoke-virtual {p0, v0}, Lorg/anddev/andengine/engine/Engine;->setTouchController(Lorg/anddev/andengine/input/touch/controller/ITouchController;)V
		 (( org.anddev.andengine.engine.options.EngineOptions ) p1 ).getCamera ( ); // invoke-virtual {p1}, Lorg/anddev/andengine/engine/options/EngineOptions;->getCamera()Lorg/anddev/andengine/engine/camera/Camera;
		 this.mCamera = v0;
		 v0 = this.mEngineOptions;
		 v0 = 		 (( org.anddev.andengine.engine.options.EngineOptions ) v0 ).needsSound ( ); // invoke-virtual {v0}, Lorg/anddev/andengine/engine/options/EngineOptions;->needsSound()Z
		 if ( v0 != null) { // if-eqz v0, :cond_0
			 /* new-instance v0, Lorg/anddev/andengine/audio/sound/SoundManager; */
			 /* invoke-direct {v0}, Lorg/anddev/andengine/audio/sound/SoundManager;-><init>()V */
			 this.mSoundManager = v0;
		 } // :cond_0
		 v0 = this.mEngineOptions;
		 v0 = 		 (( org.anddev.andengine.engine.options.EngineOptions ) v0 ).needsMusic ( ); // invoke-virtual {v0}, Lorg/anddev/andengine/engine/options/EngineOptions;->needsMusic()Z
		 if ( v0 != null) { // if-eqz v0, :cond_1
			 /* new-instance v0, Lorg/anddev/andengine/audio/music/MusicManager; */
			 /* invoke-direct {v0}, Lorg/anddev/andengine/audio/music/MusicManager;-><init>()V */
			 this.mMusicManager = v0;
		 } // :cond_1
		 v0 = this.mUpdateThread;
		 (( org.anddev.andengine.engine.Engine$UpdateThread ) v0 ).start ( ); // invoke-virtual {v0}, Lorg/anddev/andengine/engine/Engine$UpdateThread;->start()V
		 return;
	 } // .end method
	 static org.anddev.andengine.engine.options.EngineOptions access$0 ( org.anddev.andengine.engine.Engine p0 ) { //synthethic
		 /* .locals 1 */
		 v0 = this.mEngineOptions;
	 } // .end method
	 private Long getNanosecondsElapsed ( ) {
		 /* .locals 4 */
		 java.lang.System .nanoTime ( );
		 /* move-result-wide v0 */
		 /* iget-wide v2, p0, Lorg/anddev/andengine/engine/Engine;->mLastTick:J */
		 (( org.anddev.andengine.engine.Engine ) p0 ).calculateNanosecondsElapsed ( v0, v1, v2, v3 ); // invoke-virtual {p0, v0, v1, v2, v3}, Lorg/anddev/andengine/engine/Engine;->calculateNanosecondsElapsed(JJ)J
		 /* move-result-wide v0 */
		 /* return-wide v0 */
	 } // .end method
	 private Boolean isSensorSupported ( android.hardware.SensorManager p0, Integer p1 ) {
		 /* .locals 1 */
		 v0 = 		 (( android.hardware.SensorManager ) p1 ).getSensorList ( p2 ); // invoke-virtual {p1, p2}, Landroid/hardware/SensorManager;->getSensorList(I)Ljava/util/List;
		 /* if-lez v0, :cond_0 */
		 int v0 = 1; // const/4 v0, 0x1
	 } // :goto_0
} // :cond_0
int v0 = 0; // const/4 v0, 0x0
} // .end method
private void registerSelfAsSensorListener ( android.hardware.SensorManager p0, Integer p1, org.anddev.andengine.sensor.SensorDelay p2 ) {
/* .locals 2 */
(( android.hardware.SensorManager ) p1 ).getSensorList ( p2 ); // invoke-virtual {p1, p2}, Landroid/hardware/SensorManager;->getSensorList(I)Ljava/util/List;
int v1 = 0; // const/4 v1, 0x0
/* check-cast v0, Landroid/hardware/Sensor; */
v1 = (( org.anddev.andengine.sensor.SensorDelay ) p3 ).getDelay ( ); // invoke-virtual {p3}, Lorg/anddev/andengine/sensor/SensorDelay;->getDelay()I
(( android.hardware.SensorManager ) p1 ).registerListener ( p0, v0, v1 ); // invoke-virtual {p1, p0, v0, v1}, Landroid/hardware/SensorManager;->registerListener(Landroid/hardware/SensorEventListener;Landroid/hardware/Sensor;I)Z
return;
} // .end method
private void unregisterSelfAsSensorListener ( android.hardware.SensorManager p0, Integer p1 ) {
/* .locals 2 */
(( android.hardware.SensorManager ) p1 ).getSensorList ( p2 ); // invoke-virtual {p1, p2}, Landroid/hardware/SensorManager;->getSensorList(I)Ljava/util/List;
int v1 = 0; // const/4 v1, 0x0
/* check-cast v0, Landroid/hardware/Sensor; */
(( android.hardware.SensorManager ) p1 ).unregisterListener ( p0, v0 ); // invoke-virtual {p1, p0, v0}, Landroid/hardware/SensorManager;->unregisterListener(Landroid/hardware/SensorEventListener;Landroid/hardware/Sensor;)V
return;
} // .end method
private void yieldDraw ( ) {
/* .locals 1 */
v0 = this.mThreadLocker;
(( org.anddev.andengine.engine.Engine$State ) v0 ).notifyCanDraw ( ); // invoke-virtual {v0}, Lorg/anddev/andengine/engine/Engine$State;->notifyCanDraw()V
(( org.anddev.andengine.engine.Engine$State ) v0 ).waitUntilCanUpdate ( ); // invoke-virtual {v0}, Lorg/anddev/andengine/engine/Engine$State;->waitUntilCanUpdate()V
return;
} // .end method
/* # virtual methods */
protected Long calculateNanosecondsElapsed ( Long p0, Long p1 ) {
/* .locals 2 */
/* sub-long v0, p1, p3 */
/* return-wide v0 */
} // .end method
public void clearUpdateHandlers ( ) {
/* .locals 1 */
v0 = this.mUpdateHandlers;
(( org.anddev.andengine.engine.handler.UpdateHandlerList ) v0 ).clear ( ); // invoke-virtual {v0}, Lorg/anddev/andengine/engine/handler/UpdateHandlerList;->clear()V
return;
} // .end method
protected void convertSurfaceToSceneTouchEvent ( org.anddev.andengine.engine.camera.Camera p0, org.anddev.andengine.input.touch.TouchEvent p1 ) {
/* .locals 2 */
/* iget v0, p0, Lorg/anddev/andengine/engine/Engine;->mSurfaceWidth:I */
/* iget v1, p0, Lorg/anddev/andengine/engine/Engine;->mSurfaceHeight:I */
(( org.anddev.andengine.engine.camera.Camera ) p1 ).convertSurfaceToSceneTouchEvent ( p2, v0, v1 ); // invoke-virtual {p1, p2, v0, v1}, Lorg/anddev/andengine/engine/camera/Camera;->convertSurfaceToSceneTouchEvent(Lorg/anddev/andengine/input/touch/TouchEvent;II)V
return;
} // .end method
public Boolean disableAccelerometerSensor ( android.content.Context p0 ) {
/* .locals 3 */
int v2 = 1; // const/4 v2, 0x1
final String v0 = "sensor"; // const-string v0, "sensor"
(( android.content.Context ) p1 ).getSystemService ( v0 ); // invoke-virtual {p1, v0}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;
/* check-cast v0, Landroid/hardware/SensorManager; */
v1 = /* invoke-direct {p0, v0, v2}, Lorg/anddev/andengine/engine/Engine;->isSensorSupported(Landroid/hardware/SensorManager;I)Z */
if ( v1 != null) { // if-eqz v1, :cond_0
	 /* invoke-direct {p0, v0, v2}, Lorg/anddev/andengine/engine/Engine;->unregisterSelfAsSensorListener(Landroid/hardware/SensorManager;I)V */
	 /* move v0, v2 */
} // :goto_0
} // :cond_0
int v0 = 0; // const/4 v0, 0x0
} // .end method
public void disableLocationSensor ( android.content.Context p0 ) {
/* .locals 1 */
final String v0 = "location"; // const-string v0, "location"
(( android.content.Context ) p1 ).getSystemService ( v0 ); // invoke-virtual {p1, v0}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;
/* check-cast v0, Landroid/location/LocationManager; */
(( android.location.LocationManager ) v0 ).removeUpdates ( p0 ); // invoke-virtual {v0, p0}, Landroid/location/LocationManager;->removeUpdates(Landroid/location/LocationListener;)V
return;
} // .end method
public Boolean disableOrientationSensor ( android.content.Context p0 ) {
/* .locals 4 */
int v3 = 2; // const/4 v3, 0x2
int v2 = 1; // const/4 v2, 0x1
final String v0 = "sensor"; // const-string v0, "sensor"
(( android.content.Context ) p1 ).getSystemService ( v0 ); // invoke-virtual {p1, v0}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;
/* check-cast v0, Landroid/hardware/SensorManager; */
v1 = /* invoke-direct {p0, v0, v2}, Lorg/anddev/andengine/engine/Engine;->isSensorSupported(Landroid/hardware/SensorManager;I)Z */
if ( v1 != null) { // if-eqz v1, :cond_0
v1 = /* invoke-direct {p0, v0, v3}, Lorg/anddev/andengine/engine/Engine;->isSensorSupported(Landroid/hardware/SensorManager;I)Z */
if ( v1 != null) { // if-eqz v1, :cond_0
	 /* invoke-direct {p0, v0, v2}, Lorg/anddev/andengine/engine/Engine;->unregisterSelfAsSensorListener(Landroid/hardware/SensorManager;I)V */
	 /* invoke-direct {p0, v0, v3}, Lorg/anddev/andengine/engine/Engine;->unregisterSelfAsSensorListener(Landroid/hardware/SensorManager;I)V */
	 /* move v0, v2 */
} // :goto_0
} // :cond_0
int v0 = 0; // const/4 v0, 0x0
} // .end method
public Boolean enableAccelerometerSensor ( android.content.Context p0, org.anddev.andengine.sensor.accelerometer.IAccelerometerListener p1 ) {
/* .locals 2 */
/* new-instance v0, Lorg/anddev/andengine/sensor/accelerometer/AccelerometerSensorOptions; */
v1 = org.anddev.andengine.engine.Engine.SENSORDELAY_DEFAULT;
/* invoke-direct {v0, v1}, Lorg/anddev/andengine/sensor/accelerometer/AccelerometerSensorOptions;-><init>(Lorg/anddev/andengine/sensor/SensorDelay;)V */
v0 = (( org.anddev.andengine.engine.Engine ) p0 ).enableAccelerometerSensor ( p1, p2, v0 ); // invoke-virtual {p0, p1, p2, v0}, Lorg/anddev/andengine/engine/Engine;->enableAccelerometerSensor(Landroid/content/Context;Lorg/anddev/andengine/sensor/accelerometer/IAccelerometerListener;Lorg/anddev/andengine/sensor/accelerometer/AccelerometerSensorOptions;)Z
} // .end method
public Boolean enableAccelerometerSensor ( android.content.Context p0, org.anddev.andengine.sensor.accelerometer.IAccelerometerListener p1, org.anddev.andengine.sensor.accelerometer.AccelerometerSensorOptions p2 ) {
/* .locals 4 */
int v3 = 1; // const/4 v3, 0x1
final String v0 = "sensor"; // const-string v0, "sensor"
(( android.content.Context ) p1 ).getSystemService ( v0 ); // invoke-virtual {p1, v0}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;
/* check-cast v0, Landroid/hardware/SensorManager; */
v1 = /* invoke-direct {p0, v0, v3}, Lorg/anddev/andengine/engine/Engine;->isSensorSupported(Landroid/hardware/SensorManager;I)Z */
if ( v1 != null) { // if-eqz v1, :cond_1
this.mAccelerometerListener = p2;
v1 = this.mAccelerometerData;
/* if-nez v1, :cond_0 */
final String v1 = "window"; // const-string v1, "window"
(( android.content.Context ) p1 ).getSystemService ( v1 ); // invoke-virtual {p1, v1}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;
/* check-cast v1, Landroid/view/WindowManager; */
v1 = (( android.view.Display ) v1 ).getOrientation ( ); // invoke-virtual {v1}, Landroid/view/Display;->getOrientation()I
/* new-instance v2, Lorg/anddev/andengine/sensor/accelerometer/AccelerometerData; */
/* invoke-direct {v2, v1}, Lorg/anddev/andengine/sensor/accelerometer/AccelerometerData;-><init>(I)V */
this.mAccelerometerData = v2;
} // :cond_0
(( org.anddev.andengine.sensor.accelerometer.AccelerometerSensorOptions ) p3 ).getSensorDelay ( ); // invoke-virtual {p3}, Lorg/anddev/andengine/sensor/accelerometer/AccelerometerSensorOptions;->getSensorDelay()Lorg/anddev/andengine/sensor/SensorDelay;
/* invoke-direct {p0, v0, v3, v1}, Lorg/anddev/andengine/engine/Engine;->registerSelfAsSensorListener(Landroid/hardware/SensorManager;ILorg/anddev/andengine/sensor/SensorDelay;)V */
/* move v0, v3 */
} // :goto_0
} // :cond_1
int v0 = 0; // const/4 v0, 0x0
} // .end method
public void enableLocationSensor ( android.content.Context p0, org.anddev.andengine.sensor.location.ILocationListener p1, org.anddev.andengine.sensor.location.LocationSensorOptions p2 ) {
/* .locals 6 */
this.mLocationListener = p2;
final String v0 = "location"; // const-string v0, "location"
(( android.content.Context ) p1 ).getSystemService ( v0 ); // invoke-virtual {p1, v0}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;
/* check-cast v0, Landroid/location/LocationManager; */
v1 = (( org.anddev.andengine.sensor.location.LocationSensorOptions ) p3 ).isEnabledOnly ( ); // invoke-virtual {p3}, Lorg/anddev/andengine/sensor/location/LocationSensorOptions;->isEnabledOnly()Z
(( android.location.LocationManager ) v0 ).getBestProvider ( p3, v1 ); // invoke-virtual {v0, p3, v1}, Landroid/location/LocationManager;->getBestProvider(Landroid/location/Criteria;Z)Ljava/lang/String;
(( org.anddev.andengine.sensor.location.LocationSensorOptions ) p3 ).getMinimumTriggerTime ( ); // invoke-virtual {p3}, Lorg/anddev/andengine/sensor/location/LocationSensorOptions;->getMinimumTriggerTime()J
/* move-result-wide v2 */
(( org.anddev.andengine.sensor.location.LocationSensorOptions ) p3 ).getMinimumTriggerDistance ( ); // invoke-virtual {p3}, Lorg/anddev/andengine/sensor/location/LocationSensorOptions;->getMinimumTriggerDistance()J
/* move-result-wide v4 */
/* long-to-float v4, v4 */
/* move-object v5, p0 */
/* invoke-virtual/range {v0 ..v5}, Landroid/location/LocationManager;->requestLocationUpdates(Ljava/lang/String;JFLandroid/location/LocationListener;)V */
(( android.location.LocationManager ) v0 ).getLastKnownLocation ( v1 ); // invoke-virtual {v0, v1}, Landroid/location/LocationManager;->getLastKnownLocation(Ljava/lang/String;)Landroid/location/Location;
(( org.anddev.andengine.engine.Engine ) p0 ).onLocationChanged ( v0 ); // invoke-virtual {p0, v0}, Lorg/anddev/andengine/engine/Engine;->onLocationChanged(Landroid/location/Location;)V
return;
} // .end method
public Boolean enableOrientationSensor ( android.content.Context p0, org.anddev.andengine.sensor.orientation.IOrientationListener p1 ) {
/* .locals 2 */
/* new-instance v0, Lorg/anddev/andengine/sensor/orientation/OrientationSensorOptions; */
v1 = org.anddev.andengine.engine.Engine.SENSORDELAY_DEFAULT;
/* invoke-direct {v0, v1}, Lorg/anddev/andengine/sensor/orientation/OrientationSensorOptions;-><init>(Lorg/anddev/andengine/sensor/SensorDelay;)V */
v0 = (( org.anddev.andengine.engine.Engine ) p0 ).enableOrientationSensor ( p1, p2, v0 ); // invoke-virtual {p0, p1, p2, v0}, Lorg/anddev/andengine/engine/Engine;->enableOrientationSensor(Landroid/content/Context;Lorg/anddev/andengine/sensor/orientation/IOrientationListener;Lorg/anddev/andengine/sensor/orientation/OrientationSensorOptions;)Z
} // .end method
public Boolean enableOrientationSensor ( android.content.Context p0, org.anddev.andengine.sensor.orientation.IOrientationListener p1, org.anddev.andengine.sensor.orientation.OrientationSensorOptions p2 ) {
/* .locals 5 */
int v4 = 2; // const/4 v4, 0x2
int v3 = 1; // const/4 v3, 0x1
final String v0 = "sensor"; // const-string v0, "sensor"
(( android.content.Context ) p1 ).getSystemService ( v0 ); // invoke-virtual {p1, v0}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;
/* check-cast v0, Landroid/hardware/SensorManager; */
v1 = /* invoke-direct {p0, v0, v3}, Lorg/anddev/andengine/engine/Engine;->isSensorSupported(Landroid/hardware/SensorManager;I)Z */
if ( v1 != null) { // if-eqz v1, :cond_1
v1 = /* invoke-direct {p0, v0, v4}, Lorg/anddev/andengine/engine/Engine;->isSensorSupported(Landroid/hardware/SensorManager;I)Z */
if ( v1 != null) { // if-eqz v1, :cond_1
this.mOrientationListener = p2;
v1 = this.mOrientationData;
/* if-nez v1, :cond_0 */
final String v1 = "window"; // const-string v1, "window"
(( android.content.Context ) p1 ).getSystemService ( v1 ); // invoke-virtual {p1, v1}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;
/* check-cast v1, Landroid/view/WindowManager; */
v1 = (( android.view.Display ) v1 ).getOrientation ( ); // invoke-virtual {v1}, Landroid/view/Display;->getOrientation()I
/* new-instance v2, Lorg/anddev/andengine/sensor/orientation/OrientationData; */
/* invoke-direct {v2, v1}, Lorg/anddev/andengine/sensor/orientation/OrientationData;-><init>(I)V */
this.mOrientationData = v2;
} // :cond_0
(( org.anddev.andengine.sensor.orientation.OrientationSensorOptions ) p3 ).getSensorDelay ( ); // invoke-virtual {p3}, Lorg/anddev/andengine/sensor/orientation/OrientationSensorOptions;->getSensorDelay()Lorg/anddev/andengine/sensor/SensorDelay;
/* invoke-direct {p0, v0, v3, v1}, Lorg/anddev/andengine/engine/Engine;->registerSelfAsSensorListener(Landroid/hardware/SensorManager;ILorg/anddev/andengine/sensor/SensorDelay;)V */
(( org.anddev.andengine.sensor.orientation.OrientationSensorOptions ) p3 ).getSensorDelay ( ); // invoke-virtual {p3}, Lorg/anddev/andengine/sensor/orientation/OrientationSensorOptions;->getSensorDelay()Lorg/anddev/andengine/sensor/SensorDelay;
/* invoke-direct {p0, v0, v4, v1}, Lorg/anddev/andengine/engine/Engine;->registerSelfAsSensorListener(Landroid/hardware/SensorManager;ILorg/anddev/andengine/sensor/SensorDelay;)V */
/* move v0, v3 */
} // :goto_0
} // :cond_1
int v0 = 0; // const/4 v0, 0x0
} // .end method
public Boolean enableVibrator ( android.content.Context p0 ) {
/* .locals 1 */
final String v0 = "vibrator"; // const-string v0, "vibrator"
(( android.content.Context ) p1 ).getSystemService ( v0 ); // invoke-virtual {p1, v0}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;
/* check-cast v0, Landroid/os/Vibrator; */
this.mVibrator = v0;
v0 = this.mVibrator;
if ( v0 != null) { // if-eqz v0, :cond_0
int v0 = 1; // const/4 v0, 0x1
} // :goto_0
} // :cond_0
int v0 = 0; // const/4 v0, 0x0
} // .end method
public org.anddev.andengine.sensor.accelerometer.AccelerometerData getAccelerometerData ( ) {
/* .locals 1 */
v0 = this.mAccelerometerData;
} // .end method
public org.anddev.andengine.engine.camera.Camera getCamera ( ) {
/* .locals 1 */
v0 = this.mCamera;
} // .end method
protected org.anddev.andengine.engine.camera.Camera getCameraFromSurfaceTouchEvent ( org.anddev.andengine.input.touch.TouchEvent p0 ) {
/* .locals 1 */
(( org.anddev.andengine.engine.Engine ) p0 ).getCamera ( ); // invoke-virtual {p0}, Lorg/anddev/andengine/engine/Engine;->getCamera()Lorg/anddev/andengine/engine/camera/Camera;
} // .end method
public org.anddev.andengine.engine.options.EngineOptions getEngineOptions ( ) {
/* .locals 1 */
v0 = this.mEngineOptions;
} // .end method
public org.anddev.andengine.opengl.font.FontManager getFontManager ( ) {
/* .locals 1 */
v0 = this.mFontManager;
} // .end method
public org.anddev.andengine.audio.music.MusicManager getMusicManager ( ) {
/* .locals 2 */
v0 = this.mMusicManager;
if ( v0 != null) { // if-eqz v0, :cond_0
v0 = this.mMusicManager;
} // :cond_0
/* new-instance v0, Ljava/lang/IllegalStateException; */
final String v1 = "To enable the MusicManager, check the EngineOptions!"; // const-string v1, "To enable the MusicManager, check the EngineOptions!"
/* invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V */
/* throw v0 */
} // .end method
public org.anddev.andengine.sensor.orientation.OrientationData getOrientationData ( ) {
/* .locals 1 */
v0 = this.mOrientationData;
} // .end method
public org.anddev.andengine.entity.scene.Scene getScene ( ) {
/* .locals 1 */
v0 = this.mScene;
} // .end method
protected org.anddev.andengine.entity.scene.Scene getSceneFromSurfaceTouchEvent ( org.anddev.andengine.input.touch.TouchEvent p0 ) {
/* .locals 1 */
v0 = this.mScene;
} // .end method
public Float getSecondsElapsedTotal ( ) {
/* .locals 1 */
/* iget v0, p0, Lorg/anddev/andengine/engine/Engine;->mSecondsElapsedTotal:F */
} // .end method
public org.anddev.andengine.audio.sound.SoundManager getSoundManager ( ) {
/* .locals 2 */
v0 = this.mSoundManager;
if ( v0 != null) { // if-eqz v0, :cond_0
v0 = this.mSoundManager;
} // :cond_0
/* new-instance v0, Ljava/lang/IllegalStateException; */
final String v1 = "To enable the SoundManager, check the EngineOptions!"; // const-string v1, "To enable the SoundManager, check the EngineOptions!"
/* invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V */
/* throw v0 */
} // .end method
public Integer getSurfaceHeight ( ) {
/* .locals 1 */
/* iget v0, p0, Lorg/anddev/andengine/engine/Engine;->mSurfaceHeight:I */
} // .end method
public Integer getSurfaceWidth ( ) {
/* .locals 1 */
/* iget v0, p0, Lorg/anddev/andengine/engine/Engine;->mSurfaceWidth:I */
} // .end method
public org.anddev.andengine.opengl.texture.TextureManager getTextureManager ( ) {
/* .locals 1 */
v0 = this.mTextureManager;
} // .end method
public org.anddev.andengine.input.touch.controller.ITouchController getTouchController ( ) {
/* .locals 1 */
v0 = this.mTouchController;
} // .end method
public void interruptUpdateThread ( ) {
/* .locals 1 */
v0 = this.mUpdateThread;
(( org.anddev.andengine.engine.Engine$UpdateThread ) v0 ).interrupt ( ); // invoke-virtual {v0}, Lorg/anddev/andengine/engine/Engine$UpdateThread;->interrupt()V
return;
} // .end method
public Boolean isMethodTracing ( ) {
/* .locals 1 */
/* iget-boolean v0, p0, Lorg/anddev/andengine/engine/Engine;->mIsMethodTracing:Z */
} // .end method
public Boolean isRunning ( ) {
/* .locals 1 */
/* iget-boolean v0, p0, Lorg/anddev/andengine/engine/Engine;->mRunning:Z */
} // .end method
public void onAccuracyChanged ( android.hardware.Sensor p0, Integer p1 ) {
/* .locals 2 */
/* iget-boolean v0, p0, Lorg/anddev/andengine/engine/Engine;->mRunning:Z */
if ( v0 != null) { // if-eqz v0, :cond_0
v0 = (( android.hardware.Sensor ) p1 ).getType ( ); // invoke-virtual {p1}, Landroid/hardware/Sensor;->getType()I
/* packed-switch v0, :pswitch_data_0 */
} // :cond_0
} // :goto_0
return;
/* :pswitch_0 */
v0 = this.mAccelerometerData;
if ( v0 != null) { // if-eqz v0, :cond_1
v0 = this.mAccelerometerData;
(( org.anddev.andengine.sensor.accelerometer.AccelerometerData ) v0 ).setAccuracy ( p2 ); // invoke-virtual {v0, p2}, Lorg/anddev/andengine/sensor/accelerometer/AccelerometerData;->setAccuracy(I)V
v0 = this.mAccelerometerListener;
v1 = this.mAccelerometerData;
} // :cond_1
v0 = this.mOrientationData;
if ( v0 != null) { // if-eqz v0, :cond_0
v0 = this.mOrientationData;
(( org.anddev.andengine.sensor.orientation.OrientationData ) v0 ).setAccelerometerAccuracy ( p2 ); // invoke-virtual {v0, p2}, Lorg/anddev/andengine/sensor/orientation/OrientationData;->setAccelerometerAccuracy(I)V
v0 = this.mOrientationListener;
v1 = this.mOrientationData;
/* :pswitch_1 */
v0 = this.mOrientationData;
(( org.anddev.andengine.sensor.orientation.OrientationData ) v0 ).setMagneticFieldAccuracy ( p2 ); // invoke-virtual {v0, p2}, Lorg/anddev/andengine/sensor/orientation/OrientationData;->setMagneticFieldAccuracy(I)V
v0 = this.mOrientationListener;
v1 = this.mOrientationData;
/* nop */
/* :pswitch_data_0 */
/* .packed-switch 0x1 */
/* :pswitch_0 */
/* :pswitch_1 */
} // .end packed-switch
} // .end method
public void onDrawFrame ( javax.microedition.khronos.opengles.GL10 p0 ) {
/* .locals 4 */
v2 = this.mThreadLocker;
(( org.anddev.andengine.engine.Engine$State ) v2 ).waitUntilCanDraw ( ); // invoke-virtual {v2}, Lorg/anddev/andengine/engine/Engine$State;->waitUntilCanDraw()V
v1 = this.mTextureManager;
(( org.anddev.andengine.opengl.texture.TextureManager ) v1 ).updateTextures ( p1 ); // invoke-virtual {v1, p1}, Lorg/anddev/andengine/opengl/texture/TextureManager;->updateTextures(Ljavax/microedition/khronos/opengles/GL10;)V
v1 = this.mFontManager;
(( org.anddev.andengine.opengl.font.FontManager ) v1 ).updateFonts ( p1 ); // invoke-virtual {v1, p1}, Lorg/anddev/andengine/opengl/font/FontManager;->updateFonts(Ljavax/microedition/khronos/opengles/GL10;)V
/* sget-boolean v1, Lorg/anddev/andengine/opengl/util/GLHelper;->EXTENSIONS_VERTEXBUFFEROBJECTS:Z */
if ( v1 != null) { // if-eqz v1, :cond_0
v3 = this.mBufferObjectManager;
/* move-object v0, p1 */
/* check-cast v0, Ljavax/microedition/khronos/opengles/GL11; */
/* move-object v1, v0 */
(( org.anddev.andengine.opengl.buffer.BufferObjectManager ) v3 ).updateBufferObjects ( v1 ); // invoke-virtual {v3, v1}, Lorg/anddev/andengine/opengl/buffer/BufferObjectManager;->updateBufferObjects(Ljavax/microedition/khronos/opengles/GL11;)V
} // :cond_0
(( org.anddev.andengine.engine.Engine ) p0 ).onDrawScene ( p1 ); // invoke-virtual {p0, p1}, Lorg/anddev/andengine/engine/Engine;->onDrawScene(Ljavax/microedition/khronos/opengles/GL10;)V
(( org.anddev.andengine.engine.Engine$State ) v2 ).notifyCanUpdate ( ); // invoke-virtual {v2}, Lorg/anddev/andengine/engine/Engine$State;->notifyCanUpdate()V
return;
} // .end method
protected void onDrawScene ( javax.microedition.khronos.opengles.GL10 p0 ) {
/* .locals 2 */
(( org.anddev.andengine.engine.Engine ) p0 ).getCamera ( ); // invoke-virtual {p0}, Lorg/anddev/andengine/engine/Engine;->getCamera()Lorg/anddev/andengine/engine/camera/Camera;
v1 = this.mScene;
(( org.anddev.andengine.entity.scene.Scene ) v1 ).onDraw ( p1, v0 ); // invoke-virtual {v1, p1, v0}, Lorg/anddev/andengine/entity/scene/Scene;->onDraw(Ljavax/microedition/khronos/opengles/GL10;Lorg/anddev/andengine/engine/camera/Camera;)V
(( org.anddev.andengine.engine.camera.Camera ) v0 ).onDrawHUD ( p1 ); // invoke-virtual {v0, p1}, Lorg/anddev/andengine/engine/camera/Camera;->onDrawHUD(Ljavax/microedition/khronos/opengles/GL10;)V
return;
} // .end method
public void onLoadComplete ( org.anddev.andengine.entity.scene.Scene p0 ) {
/* .locals 0 */
(( org.anddev.andengine.engine.Engine ) p0 ).setScene ( p1 ); // invoke-virtual {p0, p1}, Lorg/anddev/andengine/engine/Engine;->setScene(Lorg/anddev/andengine/entity/scene/Scene;)V
return;
} // .end method
public void onLocationChanged ( android.location.Location p0 ) {
/* .locals 1 */
v0 = this.mLocation;
/* if-nez v0, :cond_0 */
this.mLocation = p1;
} // :goto_0
return;
} // :cond_0
/* if-nez p1, :cond_1 */
v0 = this.mLocationListener;
} // :cond_1
this.mLocation = p1;
v0 = this.mLocationListener;
} // .end method
public void onPause ( ) {
/* .locals 0 */
return;
} // .end method
public void onProviderDisabled ( java.lang.String p0 ) {
/* .locals 1 */
v0 = this.mLocationListener;
return;
} // .end method
public void onProviderEnabled ( java.lang.String p0 ) {
/* .locals 1 */
v0 = this.mLocationListener;
return;
} // .end method
public void onResume ( ) {
/* .locals 1 */
v0 = this.mTextureManager;
(( org.anddev.andengine.opengl.texture.TextureManager ) v0 ).reloadTextures ( ); // invoke-virtual {v0}, Lorg/anddev/andengine/opengl/texture/TextureManager;->reloadTextures()V
v0 = this.mFontManager;
(( org.anddev.andengine.opengl.font.FontManager ) v0 ).reloadFonts ( ); // invoke-virtual {v0}, Lorg/anddev/andengine/opengl/font/FontManager;->reloadFonts()V
v0 = this.mBufferObjectManager;
org.anddev.andengine.opengl.buffer.BufferObjectManager .setActiveInstance ( v0 );
v0 = this.mBufferObjectManager;
(( org.anddev.andengine.opengl.buffer.BufferObjectManager ) v0 ).reloadBufferObjects ( ); // invoke-virtual {v0}, Lorg/anddev/andengine/opengl/buffer/BufferObjectManager;->reloadBufferObjects()V
return;
} // .end method
public void onSensorChanged ( android.hardware.SensorEvent p0 ) {
/* .locals 2 */
/* iget-boolean v0, p0, Lorg/anddev/andengine/engine/Engine;->mRunning:Z */
if ( v0 != null) { // if-eqz v0, :cond_0
v0 = this.sensor;
v0 = (( android.hardware.Sensor ) v0 ).getType ( ); // invoke-virtual {v0}, Landroid/hardware/Sensor;->getType()I
/* packed-switch v0, :pswitch_data_0 */
} // :cond_0
} // :goto_0
return;
/* :pswitch_0 */
v0 = this.mAccelerometerData;
if ( v0 != null) { // if-eqz v0, :cond_1
v0 = this.mAccelerometerData;
v1 = this.values;
(( org.anddev.andengine.sensor.accelerometer.AccelerometerData ) v0 ).setValues ( v1 ); // invoke-virtual {v0, v1}, Lorg/anddev/andengine/sensor/accelerometer/AccelerometerData;->setValues([F)V
v0 = this.mAccelerometerListener;
v1 = this.mAccelerometerData;
} // :cond_1
v0 = this.mOrientationData;
if ( v0 != null) { // if-eqz v0, :cond_0
v0 = this.mOrientationData;
v1 = this.values;
(( org.anddev.andengine.sensor.orientation.OrientationData ) v0 ).setAccelerometerValues ( v1 ); // invoke-virtual {v0, v1}, Lorg/anddev/andengine/sensor/orientation/OrientationData;->setAccelerometerValues([F)V
v0 = this.mOrientationListener;
v1 = this.mOrientationData;
/* :pswitch_1 */
v0 = this.mOrientationData;
v1 = this.values;
(( org.anddev.andengine.sensor.orientation.OrientationData ) v0 ).setMagneticFieldValues ( v1 ); // invoke-virtual {v0, v1}, Lorg/anddev/andengine/sensor/orientation/OrientationData;->setMagneticFieldValues([F)V
v0 = this.mOrientationListener;
v1 = this.mOrientationData;
/* nop */
/* :pswitch_data_0 */
/* .packed-switch 0x1 */
/* :pswitch_0 */
/* :pswitch_1 */
} // .end packed-switch
} // .end method
public void onStatusChanged ( java.lang.String p0, Integer p1, android.os.Bundle p2 ) {
/* .locals 2 */
/* packed-switch p2, :pswitch_data_0 */
} // :goto_0
return;
/* :pswitch_0 */
v0 = this.mLocationListener;
v1 = org.anddev.andengine.sensor.location.LocationProviderStatus.AVAILABLE;
/* :pswitch_1 */
v0 = this.mLocationListener;
v1 = org.anddev.andengine.sensor.location.LocationProviderStatus.OUT_OF_SERVICE;
/* :pswitch_2 */
v0 = this.mLocationListener;
v1 = org.anddev.andengine.sensor.location.LocationProviderStatus.TEMPORARILY_UNAVAILABLE;
/* :pswitch_data_0 */
/* .packed-switch 0x0 */
/* :pswitch_1 */
/* :pswitch_2 */
/* :pswitch_0 */
} // .end packed-switch
} // .end method
void onTickUpdate ( ) {
/* .locals 2 */
/* iget-boolean v0, p0, Lorg/anddev/andengine/engine/Engine;->mRunning:Z */
if ( v0 != null) { // if-eqz v0, :cond_0
/* invoke-direct {p0}, Lorg/anddev/andengine/engine/Engine;->getNanosecondsElapsed()J */
/* move-result-wide v0 */
(( org.anddev.andengine.engine.Engine ) p0 ).onUpdate ( v0, v1 ); // invoke-virtual {p0, v0, v1}, Lorg/anddev/andengine/engine/Engine;->onUpdate(J)V
/* invoke-direct {p0}, Lorg/anddev/andengine/engine/Engine;->yieldDraw()V */
} // :goto_0
return;
} // :cond_0
/* invoke-direct {p0}, Lorg/anddev/andengine/engine/Engine;->yieldDraw()V */
/* const-wide/16 v0, 0x10 */
java.lang.Thread .sleep ( v0,v1 );
} // .end method
public Boolean onTouch ( android.view.View p0, android.view.MotionEvent p1 ) {
/* .locals 3 */
/* iget-boolean v0, p0, Lorg/anddev/andengine/engine/Engine;->mRunning:Z */
if ( v0 != null) { // if-eqz v0, :cond_0
v0 = v0 = this.mTouchController;
/* const-wide/16 v1, 0x14 */
try { // :try_start_0
java.lang.Thread .sleep ( v1,v2 );
/* :try_end_0 */
/* .catch Ljava/lang/InterruptedException; {:try_start_0 ..:try_end_0} :catch_0 */
} // :goto_0
/* :catch_0 */
/* move-exception v1 */
org.anddev.andengine.util.Debug .e ( v1 );
} // :cond_0
int v0 = 0; // const/4 v0, 0x0
} // .end method
public Boolean onTouchEvent ( org.anddev.andengine.input.touch.TouchEvent p0 ) {
/* .locals 2 */
(( org.anddev.andengine.engine.Engine ) p0 ).getSceneFromSurfaceTouchEvent ( p1 ); // invoke-virtual {p0, p1}, Lorg/anddev/andengine/engine/Engine;->getSceneFromSurfaceTouchEvent(Lorg/anddev/andengine/input/touch/TouchEvent;)Lorg/anddev/andengine/entity/scene/Scene;
(( org.anddev.andengine.engine.Engine ) p0 ).getCameraFromSurfaceTouchEvent ( p1 ); // invoke-virtual {p0, p1}, Lorg/anddev/andengine/engine/Engine;->getCameraFromSurfaceTouchEvent(Lorg/anddev/andengine/input/touch/TouchEvent;)Lorg/anddev/andengine/engine/camera/Camera;
(( org.anddev.andengine.engine.Engine ) p0 ).convertSurfaceToSceneTouchEvent ( v1, p1 ); // invoke-virtual {p0, v1, p1}, Lorg/anddev/andengine/engine/Engine;->convertSurfaceToSceneTouchEvent(Lorg/anddev/andengine/engine/camera/Camera;Lorg/anddev/andengine/input/touch/TouchEvent;)V
v1 = (( org.anddev.andengine.engine.Engine ) p0 ).onTouchHUD ( v1, p1 ); // invoke-virtual {p0, v1, p1}, Lorg/anddev/andengine/engine/Engine;->onTouchHUD(Lorg/anddev/andengine/engine/camera/Camera;Lorg/anddev/andengine/input/touch/TouchEvent;)Z
if ( v1 != null) { // if-eqz v1, :cond_0
int v0 = 1; // const/4 v0, 0x1
} // :goto_0
} // :cond_0
v0 = (( org.anddev.andengine.engine.Engine ) p0 ).onTouchScene ( v0, p1 ); // invoke-virtual {p0, v0, p1}, Lorg/anddev/andengine/engine/Engine;->onTouchScene(Lorg/anddev/andengine/entity/scene/Scene;Lorg/anddev/andengine/input/touch/TouchEvent;)Z
} // .end method
protected Boolean onTouchHUD ( org.anddev.andengine.engine.camera.Camera p0, org.anddev.andengine.input.touch.TouchEvent p1 ) {
/* .locals 1 */
v0 = (( org.anddev.andengine.engine.camera.Camera ) p1 ).hasHUD ( ); // invoke-virtual {p1}, Lorg/anddev/andengine/engine/camera/Camera;->hasHUD()Z
if ( v0 != null) { // if-eqz v0, :cond_0
(( org.anddev.andengine.engine.camera.Camera ) p1 ).getHUD ( ); // invoke-virtual {p1}, Lorg/anddev/andengine/engine/camera/Camera;->getHUD()Lorg/anddev/andengine/engine/camera/hud/HUD;
v0 = (( org.anddev.andengine.engine.camera.hud.HUD ) v0 ).onSceneTouchEvent ( p2 ); // invoke-virtual {v0, p2}, Lorg/anddev/andengine/engine/camera/hud/HUD;->onSceneTouchEvent(Lorg/anddev/andengine/input/touch/TouchEvent;)Z
} // :goto_0
} // :cond_0
int v0 = 0; // const/4 v0, 0x0
} // .end method
protected Boolean onTouchScene ( org.anddev.andengine.entity.scene.Scene p0, org.anddev.andengine.input.touch.TouchEvent p1 ) {
/* .locals 1 */
if ( p1 != null) { // if-eqz p1, :cond_0
v0 = (( org.anddev.andengine.entity.scene.Scene ) p1 ).onSceneTouchEvent ( p2 ); // invoke-virtual {p1, p2}, Lorg/anddev/andengine/entity/scene/Scene;->onSceneTouchEvent(Lorg/anddev/andengine/input/touch/TouchEvent;)Z
} // :goto_0
} // :cond_0
int v0 = 0; // const/4 v0, 0x0
} // .end method
protected void onUpdate ( Long p0 ) {
/* .locals 3 */
/* long-to-float v0, p1 */
/* const v1, 0x4e6e6b28 # 1.0E9f */
/* div-float/2addr v0, v1 */
/* iget v1, p0, Lorg/anddev/andengine/engine/Engine;->mSecondsElapsedTotal:F */
/* add-float/2addr v1, v0 */
/* iput v1, p0, Lorg/anddev/andengine/engine/Engine;->mSecondsElapsedTotal:F */
/* iget-wide v1, p0, Lorg/anddev/andengine/engine/Engine;->mLastTick:J */
/* add-long/2addr v1, p1 */
/* iput-wide v1, p0, Lorg/anddev/andengine/engine/Engine;->mLastTick:J */
v1 = this.mTouchController;
(( org.anddev.andengine.engine.Engine ) p0 ).updateUpdateHandlers ( v0 ); // invoke-virtual {p0, v0}, Lorg/anddev/andengine/engine/Engine;->updateUpdateHandlers(F)V
(( org.anddev.andengine.engine.Engine ) p0 ).onUpdateScene ( v0 ); // invoke-virtual {p0, v0}, Lorg/anddev/andengine/engine/Engine;->onUpdateScene(F)V
return;
} // .end method
protected void onUpdateCameraSurface ( ) {
/* .locals 4 */
int v3 = 0; // const/4 v3, 0x0
v0 = this.mCamera;
/* iget v1, p0, Lorg/anddev/andengine/engine/Engine;->mSurfaceWidth:I */
/* iget v2, p0, Lorg/anddev/andengine/engine/Engine;->mSurfaceHeight:I */
(( org.anddev.andengine.engine.camera.Camera ) v0 ).setSurfaceSize ( v3, v3, v1, v2 ); // invoke-virtual {v0, v3, v3, v1, v2}, Lorg/anddev/andengine/engine/camera/Camera;->setSurfaceSize(IIII)V
return;
} // .end method
protected void onUpdateScene ( Float p0 ) {
/* .locals 1 */
v0 = this.mScene;
if ( v0 != null) { // if-eqz v0, :cond_0
v0 = this.mScene;
(( org.anddev.andengine.entity.scene.Scene ) v0 ).onUpdate ( p1 ); // invoke-virtual {v0, p1}, Lorg/anddev/andengine/entity/scene/Scene;->onUpdate(F)V
} // :cond_0
return;
} // .end method
public void registerUpdateHandler ( org.anddev.andengine.engine.handler.IUpdateHandler p0 ) {
/* .locals 1 */
v0 = this.mUpdateHandlers;
(( org.anddev.andengine.engine.handler.UpdateHandlerList ) v0 ).add ( p1 ); // invoke-virtual {v0, p1}, Lorg/anddev/andengine/engine/handler/UpdateHandlerList;->add(Ljava/lang/Object;)Z
return;
} // .end method
public void runOnUpdateThread ( java.lang.Runnable p0 ) {
/* .locals 1 */
v0 = this.mUpdateThreadRunnableHandler;
(( org.anddev.andengine.engine.handler.runnable.RunnableHandler ) v0 ).postRunnable ( p1 ); // invoke-virtual {v0, p1}, Lorg/anddev/andengine/engine/handler/runnable/RunnableHandler;->postRunnable(Ljava/lang/Runnable;)V
return;
} // .end method
public void setScene ( org.anddev.andengine.entity.scene.Scene p0 ) {
/* .locals 0 */
this.mScene = p1;
return;
} // .end method
public void setSurfaceSize ( Integer p0, Integer p1 ) {
/* .locals 0 */
/* iput p1, p0, Lorg/anddev/andengine/engine/Engine;->mSurfaceWidth:I */
/* iput p2, p0, Lorg/anddev/andengine/engine/Engine;->mSurfaceHeight:I */
(( org.anddev.andengine.engine.Engine ) p0 ).onUpdateCameraSurface ( ); // invoke-virtual {p0}, Lorg/anddev/andengine/engine/Engine;->onUpdateCameraSurface()V
return;
} // .end method
public void setTouchController ( org.anddev.andengine.input.touch.controller.ITouchController p0 ) {
/* .locals 2 */
this.mTouchController = p1;
v0 = this.mTouchController;
v1 = this.mEngineOptions;
(( org.anddev.andengine.engine.options.EngineOptions ) v1 ).getTouchOptions ( ); // invoke-virtual {v1}, Lorg/anddev/andengine/engine/options/EngineOptions;->getTouchOptions()Lorg/anddev/andengine/engine/options/TouchOptions;
v0 = this.mTouchController;
return;
} // .end method
public synchronized void start ( ) {
/* .locals 2 */
/* monitor-enter p0 */
try { // :try_start_0
/* iget-boolean v0, p0, Lorg/anddev/andengine/engine/Engine;->mRunning:Z */
/* if-nez v0, :cond_0 */
java.lang.System .nanoTime ( );
/* move-result-wide v0 */
/* iput-wide v0, p0, Lorg/anddev/andengine/engine/Engine;->mLastTick:J */
int v0 = 1; // const/4 v0, 0x1
/* iput-boolean v0, p0, Lorg/anddev/andengine/engine/Engine;->mRunning:Z */
/* :try_end_0 */
/* .catchall {:try_start_0 ..:try_end_0} :catchall_0 */
} // :cond_0
/* monitor-exit p0 */
return;
/* :catchall_0 */
/* move-exception v0 */
/* monitor-exit p0 */
/* throw v0 */
} // .end method
public void startMethodTracing ( java.lang.String p0 ) {
/* .locals 1 */
/* iget-boolean v0, p0, Lorg/anddev/andengine/engine/Engine;->mIsMethodTracing:Z */
/* if-nez v0, :cond_0 */
int v0 = 1; // const/4 v0, 0x1
/* iput-boolean v0, p0, Lorg/anddev/andengine/engine/Engine;->mIsMethodTracing:Z */
android.os.Debug .startMethodTracing ( p1 );
} // :cond_0
return;
} // .end method
public synchronized void stop ( ) {
/* .locals 1 */
/* monitor-enter p0 */
try { // :try_start_0
/* iget-boolean v0, p0, Lorg/anddev/andengine/engine/Engine;->mRunning:Z */
if ( v0 != null) { // if-eqz v0, :cond_0
int v0 = 0; // const/4 v0, 0x0
/* iput-boolean v0, p0, Lorg/anddev/andengine/engine/Engine;->mRunning:Z */
/* :try_end_0 */
/* .catchall {:try_start_0 ..:try_end_0} :catchall_0 */
} // :cond_0
/* monitor-exit p0 */
return;
/* :catchall_0 */
/* move-exception v0 */
/* monitor-exit p0 */
/* throw v0 */
} // .end method
public void stopMethodTracing ( ) {
/* .locals 1 */
/* iget-boolean v0, p0, Lorg/anddev/andengine/engine/Engine;->mIsMethodTracing:Z */
if ( v0 != null) { // if-eqz v0, :cond_0
android.os.Debug .stopMethodTracing ( );
int v0 = 0; // const/4 v0, 0x0
/* iput-boolean v0, p0, Lorg/anddev/andengine/engine/Engine;->mIsMethodTracing:Z */
} // :cond_0
return;
} // .end method
public void unregisterUpdateHandler ( org.anddev.andengine.engine.handler.IUpdateHandler p0 ) {
/* .locals 1 */
v0 = this.mUpdateHandlers;
(( org.anddev.andengine.engine.handler.UpdateHandlerList ) v0 ).remove ( p1 ); // invoke-virtual {v0, p1}, Lorg/anddev/andengine/engine/handler/UpdateHandlerList;->remove(Ljava/lang/Object;)Z
return;
} // .end method
protected void updateUpdateHandlers ( Float p0 ) {
/* .locals 1 */
v0 = this.mUpdateThreadRunnableHandler;
(( org.anddev.andengine.engine.handler.runnable.RunnableHandler ) v0 ).onUpdate ( p1 ); // invoke-virtual {v0, p1}, Lorg/anddev/andengine/engine/handler/runnable/RunnableHandler;->onUpdate(F)V
v0 = this.mUpdateHandlers;
(( org.anddev.andengine.engine.handler.UpdateHandlerList ) v0 ).onUpdate ( p1 ); // invoke-virtual {v0, p1}, Lorg/anddev/andengine/engine/handler/UpdateHandlerList;->onUpdate(F)V
(( org.anddev.andengine.engine.Engine ) p0 ).getCamera ( ); // invoke-virtual {p0}, Lorg/anddev/andengine/engine/Engine;->getCamera()Lorg/anddev/andengine/engine/camera/Camera;
(( org.anddev.andengine.engine.camera.Camera ) v0 ).onUpdate ( p1 ); // invoke-virtual {v0, p1}, Lorg/anddev/andengine/engine/camera/Camera;->onUpdate(F)V
return;
} // .end method
public void vibrate ( Long p0 ) {
/* .locals 2 */
v0 = this.mVibrator;
if ( v0 != null) { // if-eqz v0, :cond_0
v0 = this.mVibrator;
(( android.os.Vibrator ) v0 ).vibrate ( p1, p2 ); // invoke-virtual {v0, p1, p2}, Landroid/os/Vibrator;->vibrate(J)V
return;
} // :cond_0
/* new-instance v0, Ljava/lang/IllegalStateException; */
final String v1 = "You need to enable the Vibrator before you can use it!"; // const-string v1, "You need to enable the Vibrator before you can use it!"
/* invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V */
/* throw v0 */
} // .end method
public void vibrate ( Long[] p0, Integer p1 ) {
/* .locals 2 */
v0 = this.mVibrator;
if ( v0 != null) { // if-eqz v0, :cond_0
v0 = this.mVibrator;
(( android.os.Vibrator ) v0 ).vibrate ( p1, p2 ); // invoke-virtual {v0, p1, p2}, Landroid/os/Vibrator;->vibrate([JI)V
return;
} // :cond_0
/* new-instance v0, Ljava/lang/IllegalStateException; */
final String v1 = "You need to enable the Vibrator before you can use it!"; // const-string v1, "You need to enable the Vibrator before you can use it!"
/* invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V */
/* throw v0 */
} // .end method
