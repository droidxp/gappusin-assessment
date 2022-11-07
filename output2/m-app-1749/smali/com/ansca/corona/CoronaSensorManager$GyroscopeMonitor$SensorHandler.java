class com.ansca.corona.CoronaSensorManager$GyroscopeMonitor$SensorHandler implements android.hardware.SensorEventListener {
	 /* .source "CoronaSensorManager.java" */
	 /* # interfaces */
	 /* # annotations */
	 /* .annotation system Ldalvik/annotation/EnclosingClass; */
	 /* value = Lcom/ansca/corona/CoronaSensorManager$GyroscopeMonitor; */
} // .end annotation
/* .annotation system Ldalvik/annotation/InnerClass; */
/* accessFlags = 0x2 */
/* name = "SensorHandler" */
} // .end annotation
/* # instance fields */
final com.ansca.corona.CoronaSensorManager$GyroscopeMonitor this$1; //synthetic
/* # direct methods */
private com.ansca.corona.CoronaSensorManager$GyroscopeMonitor$SensorHandler ( ) {
/* .locals 0 */
/* .prologue */
/* .line 626 */
this.this$1 = p1;
/* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
return;
} // .end method
 com.ansca.corona.CoronaSensorManager$GyroscopeMonitor$SensorHandler ( ) { //synthethic
/* .locals 0 */
/* .param p1, "x0" # Lcom/ansca/corona/CoronaSensorManager$GyroscopeMonitor; */
/* .param p2, "x1" # Lcom/ansca/corona/CoronaSensorManager$1; */
/* .prologue */
/* .line 626 */
/* invoke-direct {p0, p1}, Lcom/ansca/corona/CoronaSensorManager$GyroscopeMonitor$SensorHandler;-><init>(Lcom/ansca/corona/CoronaSensorManager$GyroscopeMonitor;)V */
return;
} // .end method
/* # virtual methods */
public void onAccuracyChanged ( android.hardware.Sensor p0, Integer p1 ) {
/* .locals 0 */
/* .param p1, "sensor" # Landroid/hardware/Sensor; */
/* .param p2, "accuracy" # I */
/* .prologue */
/* .line 647 */
return;
} // .end method
public void onSensorChanged ( android.hardware.SensorEvent p0 ) {
/* .locals 2 */
/* .param p1, "event" # Landroid/hardware/SensorEvent; */
/* .prologue */
int v1 = 1; // const/4 v1, 0x1
/* .line 629 */
/* if-nez p1, :cond_0 */
/* .line 645 */
} // :goto_0
return;
/* .line 635 */
} // :cond_0
v0 = this.this$1;
v0 = com.ansca.corona.CoronaSensorManager$GyroscopeMonitor .access$1900 ( v0 );
/* if-nez v0, :cond_1 */
/* .line 636 */
v0 = this.this$1;
com.ansca.corona.CoronaSensorManager$GyroscopeMonitor .access$1902 ( v0,v1 );
/* .line 643 */
} // :cond_1
v0 = this.this$1;
com.ansca.corona.CoronaSensorManager$GyroscopeMonitor .access$2000 ( v0 );
(( com.ansca.corona.CoronaSensorManager$SensorMeasurement ) v0 ).copyFrom ( p1 ); // invoke-virtual {v0, p1}, Lcom/ansca/corona/CoronaSensorManager$SensorMeasurement;->copyFrom(Landroid/hardware/SensorEvent;)V
/* .line 644 */
v0 = this.this$1;
com.ansca.corona.CoronaSensorManager$GyroscopeMonitor .access$2102 ( v0,v1 );
} // .end method
