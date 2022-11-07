public class com.wiyun.engine.events.Accelerometer implements android.hardware.SensorEventListener {
	 /* .source "Accelerometer.java" */
	 /* # interfaces */
	 /* # static fields */
	 private static com.wiyun.engine.events.Accelerometer sInstance;
	 /* # instance fields */
	 private android.hardware.Sensor mAccelerometer;
	 private android.hardware.SensorManager mSM;
	 private Boolean mSensorRegistered;
	 /* # direct methods */
	 private com.wiyun.engine.events.Accelerometer ( ) {
		 /* .locals 2 */
		 /* .prologue */
		 /* .line 35 */
		 /* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
		 /* .line 37 */
		 android.os.Looper .getMainLooper ( );
		 android.os.Looper .myLooper ( );
		 /* if-eq v0, v1, :cond_0 */
		 /* .line 38 */
		 android.os.Looper .prepare ( );
		 /* .line 41 */
	 } // :cond_0
	 com.wiyun.engine.nodes.Director .getInstance ( );
	 (( com.wiyun.engine.nodes.Director ) v0 ).getContext ( ); // invoke-virtual {v0}, Lcom/wiyun/engine/nodes/Director;->getContext()Landroid/content/Context;
	 final String v1 = "sensor"; // const-string v1, "sensor"
	 (( android.content.Context ) v0 ).getSystemService ( v1 ); // invoke-virtual {v0, v1}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;
	 /* check-cast v0, Landroid/hardware/SensorManager; */
	 this.mSM = v0;
	 /* .line 44 */
	 v0 = this.mSM;
	 if ( v0 != null) { // if-eqz v0, :cond_1
		 /* .line 45 */
		 v0 = this.mSM;
		 int v1 = 1; // const/4 v1, 0x1
		 (( android.hardware.SensorManager ) v0 ).getDefaultSensor ( v1 ); // invoke-virtual {v0, v1}, Landroid/hardware/SensorManager;->getDefaultSensor(I)Landroid/hardware/Sensor;
		 this.mAccelerometer = v0;
		 /* .line 48 */
	 } // :goto_0
	 return;
	 /* .line 47 */
} // :cond_1
int v0 = 0; // const/4 v0, 0x0
this.mAccelerometer = v0;
} // .end method
public static com.wiyun.engine.events.Accelerometer getInstance ( ) {
/* .locals 1 */
/* .prologue */
/* .line 30 */
v0 = com.wiyun.engine.events.Accelerometer.sInstance;
/* if-nez v0, :cond_0 */
/* .line 31 */
/* new-instance v0, Lcom/wiyun/engine/events/Accelerometer; */
/* invoke-direct {v0}, Lcom/wiyun/engine/events/Accelerometer;-><init>()V */
/* .line 32 */
} // :cond_0
v0 = com.wiyun.engine.events.Accelerometer.sInstance;
} // .end method
private native Boolean hasAccelHandlers ( ) {
} // .end method
/* # virtual methods */
public native void accelerometerChanged ( Float p0, Float p1, Float p2 ) {
} // .end method
void checkAccelHandlers ( ) {
/* .locals 3 */
/* .prologue */
/* .line 53 */
v0 = /* invoke-direct {p0}, Lcom/wiyun/engine/events/Accelerometer;->hasAccelHandlers()Z */
if ( v0 != null) { // if-eqz v0, :cond_1
/* .line 54 */
/* iget-boolean v0, p0, Lcom/wiyun/engine/events/Accelerometer;->mSensorRegistered:Z */
/* if-nez v0, :cond_0 */
/* .line 55 */
v0 = this.mSM;
v1 = this.mAccelerometer;
com.wiyun.engine.nodes.Director .getInstance ( );
v2 = (( com.wiyun.engine.nodes.Director ) v2 ).getAccelerometerDelay ( ); // invoke-virtual {v2}, Lcom/wiyun/engine/nodes/Director;->getAccelerometerDelay()I
v0 = (( android.hardware.SensorManager ) v0 ).registerListener ( p0, v1, v2 ); // invoke-virtual {v0, p0, v1, v2}, Landroid/hardware/SensorManager;->registerListener(Landroid/hardware/SensorEventListener;Landroid/hardware/Sensor;I)Z
/* iput-boolean v0, p0, Lcom/wiyun/engine/events/Accelerometer;->mSensorRegistered:Z */
/* .line 62 */
} // :cond_0
} // :goto_0
return;
/* .line 57 */
} // :cond_1
/* iget-boolean v0, p0, Lcom/wiyun/engine/events/Accelerometer;->mSensorRegistered:Z */
if ( v0 != null) { // if-eqz v0, :cond_0
/* .line 58 */
v0 = this.mSM;
(( android.hardware.SensorManager ) v0 ).unregisterListener ( p0 ); // invoke-virtual {v0, p0}, Landroid/hardware/SensorManager;->unregisterListener(Landroid/hardware/SensorEventListener;)V
/* .line 59 */
int v0 = 0; // const/4 v0, 0x0
/* iput-boolean v0, p0, Lcom/wiyun/engine/events/Accelerometer;->mSensorRegistered:Z */
} // .end method
public void onAccuracyChanged ( android.hardware.Sensor p0, Integer p1 ) {
/* .locals 0 */
/* .param p1, "sensor" # Landroid/hardware/Sensor; */
/* .param p2, "accuracy" # I */
/* .prologue */
/* .line 75 */
return;
} // .end method
public void onSensorChanged ( android.hardware.SensorEvent p0 ) {
/* .locals 5 */
/* .param p1, "event" # Landroid/hardware/SensorEvent; */
/* .prologue */
int v2 = 1; // const/4 v2, 0x1
/* const v4, 0x411cf5c3 # 9.81f */
/* .line 78 */
v0 = this.sensor;
v0 = (( android.hardware.Sensor ) v0 ).getType ( ); // invoke-virtual {v0}, Landroid/hardware/Sensor;->getType()I
/* if-ne v0, v2, :cond_0 */
/* .line 79 */
v0 = this.values;
int v1 = 0; // const/4 v1, 0x0
/* aget v0, v0, v1 */
/* neg-float v0, v0 */
/* div-float/2addr v0, v4 */
v1 = this.values;
/* aget v1, v1, v2 */
/* neg-float v1, v1 */
/* div-float/2addr v1, v4 */
v2 = this.values;
int v3 = 2; // const/4 v3, 0x2
/* aget v2, v2, v3 */
/* neg-float v2, v2 */
/* div-float/2addr v2, v4 */
(( com.wiyun.engine.events.Accelerometer ) p0 ).accelerometerChanged ( v0, v1, v2 ); // invoke-virtual {p0, v0, v1, v2}, Lcom/wiyun/engine/events/Accelerometer;->accelerometerChanged(FFF)V
/* .line 81 */
} // :cond_0
return;
} // .end method
public void updateAccelerometerDelay ( ) {
/* .locals 3 */
/* .prologue */
/* .line 65 */
/* iget-boolean v0, p0, Lcom/wiyun/engine/events/Accelerometer;->mSensorRegistered:Z */
if ( v0 != null) { // if-eqz v0, :cond_0
/* .line 66 */
v0 = this.mSM;
(( android.hardware.SensorManager ) v0 ).unregisterListener ( p0 ); // invoke-virtual {v0, p0}, Landroid/hardware/SensorManager;->unregisterListener(Landroid/hardware/SensorEventListener;)V
/* .line 67 */
v0 = this.mSM;
v1 = this.mAccelerometer;
com.wiyun.engine.nodes.Director .getInstance ( );
v2 = (( com.wiyun.engine.nodes.Director ) v2 ).getAccelerometerDelay ( ); // invoke-virtual {v2}, Lcom/wiyun/engine/nodes/Director;->getAccelerometerDelay()I
v0 = (( android.hardware.SensorManager ) v0 ).registerListener ( p0, v1, v2 ); // invoke-virtual {v0, p0, v1, v2}, Landroid/hardware/SensorManager;->registerListener(Landroid/hardware/SensorEventListener;Landroid/hardware/Sensor;I)Z
/* iput-boolean v0, p0, Lcom/wiyun/engine/events/Accelerometer;->mSensorRegistered:Z */
/* .line 69 */
} // :cond_0
return;
} // .end method
