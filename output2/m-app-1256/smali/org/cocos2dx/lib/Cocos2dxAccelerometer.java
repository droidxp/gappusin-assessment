public class org.cocos2dx.lib.Cocos2dxAccelerometer implements android.hardware.SensorEventListener {
	 /* .source "Cocos2dxAccelerometer.java" */
	 /* # interfaces */
	 /* # static fields */
	 private static final java.lang.String TAG;
	 /* # instance fields */
	 private final android.hardware.Sensor mAccelerometer;
	 private final android.content.Context mContext;
	 private final Integer mNaturalOrientation;
	 private final android.hardware.SensorManager mSensorManager;
	 /* # direct methods */
	 static org.cocos2dx.lib.Cocos2dxAccelerometer ( ) {
		 /* .locals 1 */
		 /* .prologue */
		 /* .line 43 */
		 /* const-class v0, Lorg/cocos2dx/lib/Cocos2dxAccelerometer; */
		 (( java.lang.Class ) v0 ).getSimpleName ( ); // invoke-virtual {v0}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;
		 return;
	 } // .end method
	 public org.cocos2dx.lib.Cocos2dxAccelerometer ( ) {
		 /* .locals 3 */
		 /* .param p1, "pContext" # Landroid/content/Context; */
		 /* .prologue */
		 /* .line 58 */
		 /* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
		 /* .line 59 */
		 this.mContext = p1;
		 /* .line 61 */
		 v1 = this.mContext;
		 final String v2 = "sensor"; // const-string v2, "sensor"
		 (( android.content.Context ) v1 ).getSystemService ( v2 ); // invoke-virtual {v1, v2}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;
		 /* check-cast v1, Landroid/hardware/SensorManager; */
		 this.mSensorManager = v1;
		 /* .line 62 */
		 v1 = this.mSensorManager;
		 int v2 = 1; // const/4 v2, 0x1
		 (( android.hardware.SensorManager ) v1 ).getDefaultSensor ( v2 ); // invoke-virtual {v1, v2}, Landroid/hardware/SensorManager;->getDefaultSensor(I)Landroid/hardware/Sensor;
		 this.mAccelerometer = v1;
		 /* .line 64 */
		 v1 = this.mContext;
		 final String v2 = "window"; // const-string v2, "window"
		 (( android.content.Context ) v1 ).getSystemService ( v2 ); // invoke-virtual {v1, v2}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;
		 /* check-cast v1, Landroid/view/WindowManager; */
		 /* .line 65 */
		 /* .local v0, "display":Landroid/view/Display; */
		 v1 = 		 (( android.view.Display ) v0 ).getOrientation ( ); // invoke-virtual {v0}, Landroid/view/Display;->getOrientation()I
		 /* iput v1, p0, Lorg/cocos2dx/lib/Cocos2dxAccelerometer;->mNaturalOrientation:I */
		 /* .line 66 */
		 return;
	 } // .end method
	 private static native void onSensorChanged ( Float p0, Float p1, Float p2, Long p3 ) {
	 } // .end method
	 /* # virtual methods */
	 public void disable ( ) {
		 /* .locals 1 */
		 /* .prologue */
		 /* .line 87 */
		 v0 = this.mSensorManager;
		 (( android.hardware.SensorManager ) v0 ).unregisterListener ( p0 ); // invoke-virtual {v0, p0}, Landroid/hardware/SensorManager;->unregisterListener(Landroid/hardware/SensorEventListener;)V
		 /* .line 88 */
		 return;
	 } // .end method
	 public void enable ( ) {
		 /* .locals 3 */
		 /* .prologue */
		 /* .line 73 */
		 v0 = this.mSensorManager;
		 v1 = this.mAccelerometer;
		 int v2 = 1; // const/4 v2, 0x1
		 (( android.hardware.SensorManager ) v0 ).registerListener ( p0, v1, v2 ); // invoke-virtual {v0, p0, v1, v2}, Landroid/hardware/SensorManager;->registerListener(Landroid/hardware/SensorEventListener;Landroid/hardware/Sensor;I)Z
		 /* .line 74 */
		 return;
	 } // .end method
	 public void onAccuracyChanged ( android.hardware.Sensor p0, Integer p1 ) {
		 /* .locals 0 */
		 /* .param p1, "pSensor" # Landroid/hardware/Sensor; */
		 /* .param p2, "pAccuracy" # I */
		 /* .prologue */
		 /* .line 131 */
		 return;
	 } // .end method
	 public void onSensorChanged ( android.hardware.SensorEvent p0 ) {
		 /* .locals 9 */
		 /* .param p1, "pSensorEvent" # Landroid/hardware/SensorEvent; */
		 /* .prologue */
		 int v8 = 2; // const/4 v8, 0x2
		 int v7 = 1; // const/4 v7, 0x1
		 /* .line 96 */
		 v5 = this.sensor;
		 v5 = 		 (( android.hardware.Sensor ) v5 ).getType ( ); // invoke-virtual {v5}, Landroid/hardware/Sensor;->getType()I
		 /* if-eq v5, v7, :cond_0 */
		 /* .line 127 */
	 } // :goto_0
	 return;
	 /* .line 100 */
} // :cond_0
v5 = this.values;
int v6 = 0; // const/4 v6, 0x0
/* aget v2, v5, v6 */
/* .line 101 */
/* .local v2, "x":F */
v5 = this.values;
/* aget v3, v5, v7 */
/* .line 102 */
/* .local v3, "y":F */
v5 = this.values;
/* aget v4, v5, v8 */
/* .line 109 */
/* .local v4, "z":F */
v5 = this.mContext;
(( android.content.Context ) v5 ).getResources ( ); // invoke-virtual {v5}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;
(( android.content.res.Resources ) v5 ).getConfiguration ( ); // invoke-virtual {v5}, Landroid/content/res/Resources;->getConfiguration()Landroid/content/res/Configuration;
/* iget v0, v5, Landroid/content/res/Configuration;->orientation:I */
/* .line 111 */
/* .local v0, "orientation":I */
/* if-ne v0, v8, :cond_2 */
/* iget v5, p0, Lorg/cocos2dx/lib/Cocos2dxAccelerometer;->mNaturalOrientation:I */
if ( v5 != null) { // if-eqz v5, :cond_2
	 /* .line 112 */
	 /* move v1, v2 */
	 /* .line 113 */
	 /* .local v1, "tmp":F */
	 /* neg-float v2, v3 */
	 /* .line 114 */
	 /* move v3, v1 */
	 /* .line 121 */
} // .end local v1 # "tmp":F
} // :cond_1
} // :goto_1
/* iget-wide v5, p1, Landroid/hardware/SensorEvent;->timestamp:J */
org.cocos2dx.lib.Cocos2dxAccelerometer .onSensorChanged ( v2,v3,v4,v5,v6 );
/* .line 115 */
} // :cond_2
/* if-ne v0, v7, :cond_1 */
/* iget v5, p0, Lorg/cocos2dx/lib/Cocos2dxAccelerometer;->mNaturalOrientation:I */
if ( v5 != null) { // if-eqz v5, :cond_1
/* .line 116 */
/* move v1, v2 */
/* .line 117 */
/* .restart local v1 # "tmp":F */
/* move v2, v3 */
/* .line 118 */
/* neg-float v3, v1 */
} // .end method
public void setInterval ( Float p0 ) {
/* .locals 3 */
/* .param p1, "interval" # F */
/* .prologue */
/* .line 78 */
/* const/16 v1, 0xb */
/* if-ge v0, v1, :cond_0 */
/* .line 79 */
v0 = this.mSensorManager;
v1 = this.mAccelerometer;
int v2 = 1; // const/4 v2, 0x1
(( android.hardware.SensorManager ) v0 ).registerListener ( p0, v1, v2 ); // invoke-virtual {v0, p0, v1, v2}, Landroid/hardware/SensorManager;->registerListener(Landroid/hardware/SensorEventListener;Landroid/hardware/Sensor;I)Z
/* .line 84 */
} // :goto_0
return;
/* .line 82 */
} // :cond_0
v0 = this.mSensorManager;
v1 = this.mAccelerometer;
/* const v2, 0x47c35000 # 100000.0f */
/* mul-float/2addr v2, p1 */
/* float-to-int v2, v2 */
(( android.hardware.SensorManager ) v0 ).registerListener ( p0, v1, v2 ); // invoke-virtual {v0, p0, v1, v2}, Landroid/hardware/SensorManager;->registerListener(Landroid/hardware/SensorEventListener;Landroid/hardware/Sensor;I)Z
} // .end method
