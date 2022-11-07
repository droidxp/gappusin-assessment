public abstract class com.nvidia.devtech.NvActivity extends android.app.Activity implements android.hardware.SensorEventListener {
	 /* .source "NvActivity.java" */
	 /* # interfaces */
	 /* # static fields */
	 protected static final Integer MULTI_DATA_STRIDE;
	 protected static final Integer MULTI_MAX_INPUTS;
	 /* # instance fields */
	 protected android.os.Handler handler;
	 protected Integer mSensorDelay;
	 protected android.hardware.SensorManager mSensorManager;
	 protected multiData;
	 protected Boolean wantsAccelerometer;
	 protected Boolean wantsMultitouch;
	 /* # direct methods */
	 public com.nvidia.devtech.NvActivity ( ) {
		 /* .locals 2 */
		 /* .prologue */
		 int v1 = 0; // const/4 v1, 0x0
		 /* .line 44 */
		 /* invoke-direct {p0}, Landroid/app/Activity;-><init>()V */
		 /* .line 48 */
		 int v0 = 0; // const/4 v0, 0x0
		 this.handler = v0;
		 /* .line 50 */
		 /* iput-boolean v1, p0, Lcom/nvidia/devtech/NvActivity;->wantsMultitouch:Z */
		 /* .line 56 */
		 /* iput-boolean v1, p0, Lcom/nvidia/devtech/NvActivity;->wantsAccelerometer:Z */
		 /* .line 58 */
		 int v0 = 1; // const/4 v0, 0x1
		 /* iput v0, p0, Lcom/nvidia/devtech/NvActivity;->mSensorDelay:I */
		 /* .line 44 */
		 return;
	 } // .end method
	 /* # virtual methods */
	 public abstract void cleanup ( ) {
	 } // .end method
	 public java.lang.String getLastErrorMsg ( ) {
		 /* .locals 1 */
		 /* .prologue */
		 /* .line 70 */
		 final String v0 = "Application encountered an error."; // const-string v0, "Application encountered an error."
	 } // .end method
	 public abstract Boolean init ( ) {
	 } // .end method
	 public abstract Boolean inputEvent ( Integer p0, Float p1, Float p2, android.view.MotionEvent p3 ) {
	 } // .end method
	 public abstract Boolean keyEvent ( Integer p0, Integer p1, android.view.KeyEvent p2 ) {
	 } // .end method
	 public Boolean multitouchEvent ( Integer p0, Integer p1, Float[] p2, Integer p3, android.view.MotionEvent p4 ) {
		 /* .locals 1 */
		 /* .param p1, "action" # I */
		 /* .param p2, "numInputs" # I */
		 /* .param p3, "data" # [F */
		 /* .param p4, "dataStride" # I */
		 /* .param p5, "event" # Landroid/view/MotionEvent; */
		 /* .prologue */
		 /* .line 106 */
		 int v0 = 1; // const/4 v0, 0x1
	 } // .end method
	 public native void nvAcquireTimeExtension ( ) {
	 } // .end method
	 public native Long nvGetSystemTime ( ) {
	 } // .end method
	 public void onAccuracyChanged ( android.hardware.Sensor p0, Integer p1 ) {
		 /* .locals 0 */
		 /* .param p1, "sensor" # Landroid/hardware/Sensor; */
		 /* .param p2, "accuracy" # I */
		 /* .prologue */
		 /* .line 272 */
		 return;
	 } // .end method
	 public void onCreate ( android.os.Bundle p0 ) {
		 /* .locals 1 */
		 /* .param p1, "savedInstanceState" # Landroid/os/Bundle; */
		 /* .prologue */
		 /* .line 184 */
		 /* invoke-super {p0, p1}, Landroid/app/Activity;->onCreate(Landroid/os/Bundle;)V */
		 /* .line 185 */
		 /* new-instance v0, Landroid/os/Handler; */
		 /* invoke-direct {v0}, Landroid/os/Handler;-><init>()V */
		 this.handler = v0;
		 /* .line 186 */
		 /* const/16 v0, 0x32 */
		 /* new-array v0, v0, [F */
		 this.multiData = v0;
		 /* .line 187 */
		 /* iget-boolean v0, p0, Lcom/nvidia/devtech/NvActivity;->wantsAccelerometer:Z */
		 if ( v0 != null) { // if-eqz v0, :cond_0
			 v0 = this.mSensorManager;
			 /* if-nez v0, :cond_0 */
			 /* .line 188 */
			 final String v0 = "sensor"; // const-string v0, "sensor"
			 (( com.nvidia.devtech.NvActivity ) p0 ).getSystemService ( v0 ); // invoke-virtual {p0, v0}, Lcom/nvidia/devtech/NvActivity;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;
			 /* check-cast v0, Landroid/hardware/SensorManager; */
			 this.mSensorManager = v0;
			 /* .line 190 */
		 } // :cond_0
		 com.nvidia.devtech.NvUtil .getInstance ( );
		 (( com.nvidia.devtech.NvUtil ) v0 ).setActivity ( p0 ); // invoke-virtual {v0, p0}, Lcom/nvidia/devtech/NvUtil;->setActivity(Landroid/app/Activity;)V
		 /* .line 191 */
		 com.nvidia.devtech.NvAPKFileHelper .getInstance ( );
		 (( com.nvidia.devtech.NvAPKFileHelper ) v0 ).setContext ( p0 ); // invoke-virtual {v0, p0}, Lcom/nvidia/devtech/NvAPKFileHelper;->setContext(Landroid/content/Context;)V
		 /* .line 192 */
		 (( com.nvidia.devtech.NvActivity ) p0 ).systemInit ( ); // invoke-virtual {p0}, Lcom/nvidia/devtech/NvActivity;->systemInit()Z
		 /* .line 193 */
		 return;
	 } // .end method
	 public void onDestroy ( ) {
		 /* .locals 1 */
		 /* .prologue */
		 /* .line 216 */
		 /* invoke-super {p0}, Landroid/app/Activity;->onDestroy()V */
		 /* .line 217 */
		 int v0 = 0; // const/4 v0, 0x0
		 this.multiData = v0;
		 /* .line 218 */
		 (( com.nvidia.devtech.NvActivity ) p0 ).systemCleanup ( ); // invoke-virtual {p0}, Lcom/nvidia/devtech/NvActivity;->systemCleanup()V
		 /* .line 219 */
		 return;
	 } // .end method
	 public Boolean onKeyDown ( Integer p0, android.view.KeyEvent p1 ) {
		 /* .locals 3 */
		 /* .param p1, "keyCode" # I */
		 /* .param p2, "event" # Landroid/view/KeyEvent; */
		 /* .prologue */
		 /* .line 255 */
		 v0 = 		 /* invoke-super {p0, p1, p2}, Landroid/app/Activity;->onKeyDown(ILandroid/view/KeyEvent;)Z */
		 /* .line 256 */
		 /* .local v0, "ret":Z */
		 /* if-nez v0, :cond_0 */
		 /* .line 257 */
		 v1 = 		 (( android.view.KeyEvent ) p2 ).getAction ( ); // invoke-virtual {p2}, Landroid/view/KeyEvent;->getAction()I
		 v2 = 		 (( android.view.KeyEvent ) p2 ).getUnicodeChar ( ); // invoke-virtual {p2}, Landroid/view/KeyEvent;->getUnicodeChar()I
		 v0 = 		 (( com.nvidia.devtech.NvActivity ) p0 ).keyEvent ( v1, v2, p2 ); // invoke-virtual {p0, v1, v2, p2}, Lcom/nvidia/devtech/NvActivity;->keyEvent(IILandroid/view/KeyEvent;)Z
		 /* .line 258 */
	 } // :cond_0
} // .end method
public Boolean onKeyUp ( Integer p0, android.view.KeyEvent p1 ) {
	 /* .locals 3 */
	 /* .param p1, "keyCode" # I */
	 /* .param p2, "event" # Landroid/view/KeyEvent; */
	 /* .prologue */
	 /* .line 264 */
	 v0 = 	 /* invoke-super {p0, p1, p2}, Landroid/app/Activity;->onKeyUp(ILandroid/view/KeyEvent;)Z */
	 /* .line 265 */
	 /* .local v0, "ret":Z */
	 /* if-nez v0, :cond_0 */
	 /* .line 266 */
	 v1 = 	 (( android.view.KeyEvent ) p2 ).getAction ( ); // invoke-virtual {p2}, Landroid/view/KeyEvent;->getAction()I
	 v2 = 	 (( android.view.KeyEvent ) p2 ).getUnicodeChar ( ); // invoke-virtual {p2}, Landroid/view/KeyEvent;->getUnicodeChar()I
	 v0 = 	 (( com.nvidia.devtech.NvActivity ) p0 ).keyEvent ( v1, v2, p2 ); // invoke-virtual {p0, v1, v2, p2}, Lcom/nvidia/devtech/NvActivity;->keyEvent(IILandroid/view/KeyEvent;)Z
	 /* .line 267 */
} // :cond_0
} // .end method
protected void onResume ( ) {
/* .locals 3 */
/* .prologue */
/* .line 198 */
/* invoke-super {p0}, Landroid/app/Activity;->onResume()V */
/* .line 199 */
v0 = this.mSensorManager;
if ( v0 != null) { // if-eqz v0, :cond_0
	 /* .line 200 */
	 v0 = this.mSensorManager;
	 /* .line 202 */
	 v1 = this.mSensorManager;
	 int v2 = 1; // const/4 v2, 0x1
	 (( android.hardware.SensorManager ) v1 ).getDefaultSensor ( v2 ); // invoke-virtual {v1, v2}, Landroid/hardware/SensorManager;->getDefaultSensor(I)Landroid/hardware/Sensor;
	 /* .line 203 */
	 /* iget v2, p0, Lcom/nvidia/devtech/NvActivity;->mSensorDelay:I */
	 /* .line 200 */
	 (( android.hardware.SensorManager ) v0 ).registerListener ( p0, v1, v2 ); // invoke-virtual {v0, p0, v1, v2}, Landroid/hardware/SensorManager;->registerListener(Landroid/hardware/SensorEventListener;Landroid/hardware/Sensor;I)Z
	 /* .line 204 */
} // :cond_0
return;
} // .end method
public void onSensorChanged ( android.hardware.SensorEvent p0 ) {
/* .locals 5 */
/* .param p1, "event" # Landroid/hardware/SensorEvent; */
/* .prologue */
int v3 = 1; // const/4 v3, 0x1
/* .line 276 */
v0 = this.sensor;
v0 = (( android.hardware.Sensor ) v0 ).getType ( ); // invoke-virtual {v0}, Landroid/hardware/Sensor;->getType()I
/* if-ne v0, v3, :cond_0 */
/* .line 277 */
v0 = this.sensor;
v0 = (( android.hardware.Sensor ) v0 ).getType ( ); // invoke-virtual {v0}, Landroid/hardware/Sensor;->getType()I
v1 = this.values;
int v2 = 0; // const/4 v2, 0x0
/* aget v1, v1, v2 */
v2 = this.values;
/* aget v2, v2, v3 */
v3 = this.values;
int v4 = 2; // const/4 v4, 0x2
/* aget v3, v3, v4 */
(( com.nvidia.devtech.NvActivity ) p0 ).sensorEvent ( v0, v1, v2, v3 ); // invoke-virtual {p0, v0, v1, v2, v3}, Lcom/nvidia/devtech/NvActivity;->sensorEvent(IFFF)Z
/* .line 278 */
} // :cond_0
return;
} // .end method
protected void onStop ( ) {
/* .locals 1 */
/* .prologue */
/* .line 208 */
v0 = this.mSensorManager;
if ( v0 != null) { // if-eqz v0, :cond_0
/* .line 209 */
v0 = this.mSensorManager;
(( android.hardware.SensorManager ) v0 ).unregisterListener ( p0 ); // invoke-virtual {v0, p0}, Landroid/hardware/SensorManager;->unregisterListener(Landroid/hardware/SensorEventListener;)V
/* .line 210 */
} // :cond_0
/* invoke-super {p0}, Landroid/app/Activity;->onStop()V */
/* .line 211 */
return;
} // .end method
public Boolean onTouchEvent ( android.view.MotionEvent p0 ) {
/* .locals 9 */
/* .param p1, "event" # Landroid/view/MotionEvent; */
/* .prologue */
/* .line 224 */
v8 = /* invoke-super {p0, p1}, Landroid/app/Activity;->onTouchEvent(Landroid/view/MotionEvent;)Z */
/* .line 225 */
/* .local v8, "ret":Z */
/* if-nez v8, :cond_0 */
/* .line 227 */
/* iget-boolean v0, p0, Lcom/nvidia/devtech/NvActivity;->wantsMultitouch:Z */
if ( v0 != null) { // if-eqz v0, :cond_2
/* .line 230 */
v2 = (( android.view.MotionEvent ) p1 ).getPointerCount ( ); // invoke-virtual {p1}, Landroid/view/MotionEvent;->getPointerCount()I
/* .line 231 */
/* .local v2, "numEvents":I */
int v6 = 0; // const/4 v6, 0x0
/* .local v6, "i":I */
} // :goto_0
/* if-lt v6, v2, :cond_1 */
/* .line 242 */
v1 = (( android.view.MotionEvent ) p1 ).getAction ( ); // invoke-virtual {p1}, Landroid/view/MotionEvent;->getAction()I
v3 = this.multiData;
int v4 = 5; // const/4 v4, 0x5
/* move-object v0, p0 */
/* move-object v5, p1 */
v8 = /* invoke-virtual/range {v0 ..v5}, Lcom/nvidia/devtech/NvActivity;->multitouchEvent(II[FILandroid/view/MotionEvent;)Z */
/* .line 249 */
} // .end local v2 # "numEvents":I
} // .end local v6 # "i":I
} // :cond_0
} // :goto_1
/* .line 233 */
/* .restart local v2 # "numEvents":I */
/* .restart local v6 # "i":I */
} // :cond_1
/* mul-int/lit8 v7, v6, 0x5 */
/* .line 236 */
/* .local v7, "j":I */
v0 = this.multiData;
/* add-int/lit8 v1, v7, 0x0 */
v3 = (( android.view.MotionEvent ) p1 ).getX ( v6 ); // invoke-virtual {p1, v6}, Landroid/view/MotionEvent;->getX(I)F
/* aput v3, v0, v1 */
/* .line 237 */
v0 = this.multiData;
/* add-int/lit8 v1, v7, 0x1 */
v3 = (( android.view.MotionEvent ) p1 ).getY ( v6 ); // invoke-virtual {p1, v6}, Landroid/view/MotionEvent;->getY(I)F
/* aput v3, v0, v1 */
/* .line 238 */
v0 = this.multiData;
/* add-int/lit8 v1, v7, 0x2 */
v3 = (( android.view.MotionEvent ) p1 ).getPointerId ( v6 ); // invoke-virtual {p1, v6}, Landroid/view/MotionEvent;->getPointerId(I)I
/* int-to-float v3, v3 */
/* aput v3, v0, v1 */
/* .line 239 */
v0 = this.multiData;
/* add-int/lit8 v1, v7, 0x3 */
v3 = (( android.view.MotionEvent ) p1 ).getSize ( v6 ); // invoke-virtual {p1, v6}, Landroid/view/MotionEvent;->getSize(I)F
/* aput v3, v0, v1 */
/* .line 240 */
v0 = this.multiData;
/* add-int/lit8 v1, v7, 0x4 */
v3 = (( android.view.MotionEvent ) p1 ).getPressure ( v6 ); // invoke-virtual {p1, v6}, Landroid/view/MotionEvent;->getPressure(I)F
/* aput v3, v0, v1 */
/* .line 231 */
/* add-int/lit8 v6, v6, 0x1 */
/* .line 246 */
} // .end local v2 # "numEvents":I
} // .end local v6 # "i":I
} // .end local v7 # "j":I
} // :cond_2
v0 = (( android.view.MotionEvent ) p1 ).getAction ( ); // invoke-virtual {p1}, Landroid/view/MotionEvent;->getAction()I
v1 = (( android.view.MotionEvent ) p1 ).getX ( ); // invoke-virtual {p1}, Landroid/view/MotionEvent;->getX()F
v3 = (( android.view.MotionEvent ) p1 ).getY ( ); // invoke-virtual {p1}, Landroid/view/MotionEvent;->getY()F
v8 = (( com.nvidia.devtech.NvActivity ) p0 ).inputEvent ( v0, v1, v3, p1 ); // invoke-virtual {p0, v0, v1, v3, p1}, Lcom/nvidia/devtech/NvActivity;->inputEvent(IFFLandroid/view/MotionEvent;)Z
} // .end method
public Boolean sensorEvent ( Integer p0, Float p1, Float p2, Float p3 ) {
/* .locals 1 */
/* .param p1, "sensorType" # I */
/* .param p2, "values0" # F */
/* .param p3, "values1" # F */
/* .param p4, "values2" # F */
/* .prologue */
/* .line 135 */
int v0 = 1; // const/4 v0, 0x1
} // .end method
protected void systemCleanup ( ) {
/* .locals 0 */
/* .prologue */
/* .line 168 */
(( com.nvidia.devtech.NvActivity ) p0 ).cleanup ( ); // invoke-virtual {p0}, Lcom/nvidia/devtech/NvActivity;->cleanup()V
/* .line 169 */
return;
} // .end method
protected Boolean systemInit ( ) {
/* .locals 1 */
/* .prologue */
/* .line 154 */
v0 = (( com.nvidia.devtech.NvActivity ) p0 ).init ( ); // invoke-virtual {p0}, Lcom/nvidia/devtech/NvActivity;->init()Z
} // .end method
