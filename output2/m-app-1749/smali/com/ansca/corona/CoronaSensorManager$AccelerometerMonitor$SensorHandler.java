class com.ansca.corona.CoronaSensorManager$AccelerometerMonitor$SensorHandler implements android.hardware.SensorEventListener {
	 /* .source "CoronaSensorManager.java" */
	 /* # interfaces */
	 /* # annotations */
	 /* .annotation system Ldalvik/annotation/EnclosingClass; */
	 /* value = Lcom/ansca/corona/CoronaSensorManager$AccelerometerMonitor; */
} // .end annotation
/* .annotation system Ldalvik/annotation/InnerClass; */
/* accessFlags = 0x2 */
/* name = "SensorHandler" */
} // .end annotation
/* # instance fields */
final com.ansca.corona.CoronaSensorManager$AccelerometerMonitor this$1; //synthetic
/* # direct methods */
private com.ansca.corona.CoronaSensorManager$AccelerometerMonitor$SensorHandler ( ) {
/* .locals 0 */
/* .prologue */
/* .line 490 */
this.this$1 = p1;
/* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
return;
} // .end method
 com.ansca.corona.CoronaSensorManager$AccelerometerMonitor$SensorHandler ( ) { //synthethic
/* .locals 0 */
/* .param p1, "x0" # Lcom/ansca/corona/CoronaSensorManager$AccelerometerMonitor; */
/* .param p2, "x1" # Lcom/ansca/corona/CoronaSensorManager$1; */
/* .prologue */
/* .line 490 */
/* invoke-direct {p0, p1}, Lcom/ansca/corona/CoronaSensorManager$AccelerometerMonitor$SensorHandler;-><init>(Lcom/ansca/corona/CoronaSensorManager$AccelerometerMonitor;)V */
return;
} // .end method
/* # virtual methods */
public void onAccuracyChanged ( android.hardware.Sensor p0, Integer p1 ) {
/* .locals 0 */
/* .param p1, "sensor" # Landroid/hardware/Sensor; */
/* .param p2, "accuracy" # I */
/* .prologue */
/* .line 511 */
return;
} // .end method
public void onSensorChanged ( android.hardware.SensorEvent p0 ) {
/* .locals 2 */
/* .param p1, "event" # Landroid/hardware/SensorEvent; */
/* .prologue */
int v1 = 1; // const/4 v1, 0x1
/* .line 493 */
/* if-nez p1, :cond_0 */
/* .line 509 */
} // :goto_0
return;
/* .line 499 */
} // :cond_0
v0 = this.this$1;
v0 = com.ansca.corona.CoronaSensorManager$AccelerometerMonitor .access$1200 ( v0 );
/* if-nez v0, :cond_1 */
/* .line 500 */
v0 = this.this$1;
com.ansca.corona.CoronaSensorManager$AccelerometerMonitor .access$1202 ( v0,v1 );
/* .line 507 */
} // :cond_1
v0 = this.this$1;
com.ansca.corona.CoronaSensorManager$AccelerometerMonitor .access$1300 ( v0 );
(( com.ansca.corona.CoronaSensorManager$SensorMeasurement ) v0 ).copyFrom ( p1 ); // invoke-virtual {v0, p1}, Lcom/ansca/corona/CoronaSensorManager$SensorMeasurement;->copyFrom(Landroid/hardware/SensorEvent;)V
/* .line 508 */
v0 = this.this$1;
com.ansca.corona.CoronaSensorManager$AccelerometerMonitor .access$1402 ( v0,v1 );
} // .end method
