class com.ansca.corona.CoronaSensorManager$AccelerometerMonitor extends com.ansca.corona.CoronaSensorManager$SensorMonitor {
	 /* .source "CoronaSensorManager.java" */
	 /* # annotations */
	 /* .annotation system Ldalvik/annotation/EnclosingClass; */
	 /* value = Lcom/ansca/corona/CoronaSensorManager; */
} // .end annotation
/* .annotation system Ldalvik/annotation/InnerClass; */
/* accessFlags = 0x2 */
/* name = "AccelerometerMonitor" */
} // .end annotation
/* .annotation system Ldalvik/annotation/MemberClasses; */
/* value = { */
/* Lcom/ansca/corona/CoronaSensorManager$AccelerometerMonitor$TimerHandler;, */
/* Lcom/ansca/corona/CoronaSensorManager$AccelerometerMonitor$SensorHandler; */
/* } */
} // .end annotation
/* # instance fields */
private Boolean fHasReceivedMeasurement;
private Boolean fHasReceivedSample;
private Boolean fHasSkippedFirstMeasurement;
private Long fLastSampleTimestamp;
private com.ansca.corona.CoronaSensorManager$SensorMeasurement fLastSensorMeasurement;
final com.ansca.corona.CoronaSensorManager this$0; //synthetic
/* # direct methods */
public com.ansca.corona.CoronaSensorManager$AccelerometerMonitor ( ) {
/* .locals 4 */
/* .prologue */
int v3 = 0; // const/4 v3, 0x0
int v2 = 0; // const/4 v2, 0x0
/* .line 458 */
this.this$0 = p1;
/* .line 459 */
/* invoke-direct {p0, p1}, Lcom/ansca/corona/CoronaSensorManager$SensorMonitor;-><init>(Lcom/ansca/corona/CoronaSensorManager;)V */
/* .line 462 */
/* new-instance v0, Lcom/ansca/corona/CoronaSensorManager$SensorMeasurement; */
/* invoke-direct {v0, p1}, Lcom/ansca/corona/CoronaSensorManager$SensorMeasurement;-><init>(Lcom/ansca/corona/CoronaSensorManager;)V */
this.fLastSensorMeasurement = v0;
/* .line 463 */
v0 = this.fLastSensorMeasurement;
int v1 = 3; // const/4 v1, 0x3
/* new-array v1, v1, [F */
/* fill-array-data v1, :array_0 */
this.values = v1;
/* .line 464 */
/* iput-boolean v2, p0, Lcom/ansca/corona/CoronaSensorManager$AccelerometerMonitor;->fHasSkippedFirstMeasurement:Z */
/* .line 465 */
/* iput-boolean v2, p0, Lcom/ansca/corona/CoronaSensorManager$AccelerometerMonitor;->fHasReceivedMeasurement:Z */
/* .line 466 */
/* iput-boolean v2, p0, Lcom/ansca/corona/CoronaSensorManager$AccelerometerMonitor;->fHasReceivedSample:Z */
/* .line 467 */
/* const-wide/16 v0, 0x0 */
/* iput-wide v0, p0, Lcom/ansca/corona/CoronaSensorManager$AccelerometerMonitor;->fLastSampleTimestamp:J */
/* .line 470 */
/* new-instance v0, Lcom/ansca/corona/CoronaSensorManager$AccelerometerMonitor$SensorHandler; */
/* invoke-direct {v0, p0, v3}, Lcom/ansca/corona/CoronaSensorManager$AccelerometerMonitor$SensorHandler;-><init>(Lcom/ansca/corona/CoronaSensorManager$AccelerometerMonitor;Lcom/ansca/corona/CoronaSensorManager$1;)V */
(( com.ansca.corona.CoronaSensorManager$AccelerometerMonitor ) p0 ).setSensorListener ( v0 ); // invoke-virtual {p0, v0}, Lcom/ansca/corona/CoronaSensorManager$AccelerometerMonitor;->setSensorListener(Landroid/hardware/SensorEventListener;)V
/* .line 471 */
/* new-instance v0, Lcom/ansca/corona/CoronaSensorManager$AccelerometerMonitor$TimerHandler; */
/* invoke-direct {v0, p0, v3}, Lcom/ansca/corona/CoronaSensorManager$AccelerometerMonitor$TimerHandler;-><init>(Lcom/ansca/corona/CoronaSensorManager$AccelerometerMonitor;Lcom/ansca/corona/CoronaSensorManager$1;)V */
(( com.ansca.corona.CoronaSensorManager$AccelerometerMonitor ) p0 ).setTimerListener ( v0 ); // invoke-virtual {p0, v0}, Lcom/ansca/corona/CoronaSensorManager$AccelerometerMonitor;->setTimerListener(Lcom/ansca/corona/MessageBasedTimer$Listener;)V
/* .line 472 */
return;
/* .line 463 */
/* nop */
/* :array_0 */
/* .array-data 4 */
/* 0x0 */
/* 0x0 */
/* 0x0 */
} // .end array-data
} // .end method
static Boolean access$1200 ( com.ansca.corona.CoronaSensorManager$AccelerometerMonitor p0 ) { //synthethic
/* .locals 1 */
/* .param p0, "x0" # Lcom/ansca/corona/CoronaSensorManager$AccelerometerMonitor; */
/* .prologue */
/* .line 437 */
/* iget-boolean v0, p0, Lcom/ansca/corona/CoronaSensorManager$AccelerometerMonitor;->fHasSkippedFirstMeasurement:Z */
} // .end method
static Boolean access$1202 ( com.ansca.corona.CoronaSensorManager$AccelerometerMonitor p0, Boolean p1 ) { //synthethic
/* .locals 0 */
/* .param p0, "x0" # Lcom/ansca/corona/CoronaSensorManager$AccelerometerMonitor; */
/* .param p1, "x1" # Z */
/* .prologue */
/* .line 437 */
/* iput-boolean p1, p0, Lcom/ansca/corona/CoronaSensorManager$AccelerometerMonitor;->fHasSkippedFirstMeasurement:Z */
} // .end method
static com.ansca.corona.CoronaSensorManager$SensorMeasurement access$1300 ( com.ansca.corona.CoronaSensorManager$AccelerometerMonitor p0 ) { //synthethic
/* .locals 1 */
/* .param p0, "x0" # Lcom/ansca/corona/CoronaSensorManager$AccelerometerMonitor; */
/* .prologue */
/* .line 437 */
v0 = this.fLastSensorMeasurement;
} // .end method
static Boolean access$1400 ( com.ansca.corona.CoronaSensorManager$AccelerometerMonitor p0 ) { //synthethic
/* .locals 1 */
/* .param p0, "x0" # Lcom/ansca/corona/CoronaSensorManager$AccelerometerMonitor; */
/* .prologue */
/* .line 437 */
/* iget-boolean v0, p0, Lcom/ansca/corona/CoronaSensorManager$AccelerometerMonitor;->fHasReceivedMeasurement:Z */
} // .end method
static Boolean access$1402 ( com.ansca.corona.CoronaSensorManager$AccelerometerMonitor p0, Boolean p1 ) { //synthethic
/* .locals 0 */
/* .param p0, "x0" # Lcom/ansca/corona/CoronaSensorManager$AccelerometerMonitor; */
/* .param p1, "x1" # Z */
/* .prologue */
/* .line 437 */
/* iput-boolean p1, p0, Lcom/ansca/corona/CoronaSensorManager$AccelerometerMonitor;->fHasReceivedMeasurement:Z */
} // .end method
static Boolean access$1500 ( com.ansca.corona.CoronaSensorManager$AccelerometerMonitor p0 ) { //synthethic
/* .locals 1 */
/* .param p0, "x0" # Lcom/ansca/corona/CoronaSensorManager$AccelerometerMonitor; */
/* .prologue */
/* .line 437 */
/* iget-boolean v0, p0, Lcom/ansca/corona/CoronaSensorManager$AccelerometerMonitor;->fHasReceivedSample:Z */
} // .end method
static Boolean access$1502 ( com.ansca.corona.CoronaSensorManager$AccelerometerMonitor p0, Boolean p1 ) { //synthethic
/* .locals 0 */
/* .param p0, "x0" # Lcom/ansca/corona/CoronaSensorManager$AccelerometerMonitor; */
/* .param p1, "x1" # Z */
/* .prologue */
/* .line 437 */
/* iput-boolean p1, p0, Lcom/ansca/corona/CoronaSensorManager$AccelerometerMonitor;->fHasReceivedSample:Z */
} // .end method
static Long access$1600 ( com.ansca.corona.CoronaSensorManager$AccelerometerMonitor p0 ) { //synthethic
/* .locals 2 */
/* .param p0, "x0" # Lcom/ansca/corona/CoronaSensorManager$AccelerometerMonitor; */
/* .prologue */
/* .line 437 */
/* iget-wide v0, p0, Lcom/ansca/corona/CoronaSensorManager$AccelerometerMonitor;->fLastSampleTimestamp:J */
/* return-wide v0 */
} // .end method
static Long access$1602 ( com.ansca.corona.CoronaSensorManager$AccelerometerMonitor p0, Long p1 ) { //synthethic
/* .locals 0 */
/* .param p0, "x0" # Lcom/ansca/corona/CoronaSensorManager$AccelerometerMonitor; */
/* .param p1, "x1" # J */
/* .prologue */
/* .line 437 */
/* iput-wide p1, p0, Lcom/ansca/corona/CoronaSensorManager$AccelerometerMonitor;->fLastSampleTimestamp:J */
/* return-wide p1 */
} // .end method
/* # virtual methods */
public Integer getSensorType ( ) {
/* .locals 1 */
/* .prologue */
/* .line 479 */
int v0 = 1; // const/4 v0, 0x1
} // .end method
protected void onStarting ( ) {
/* .locals 1 */
/* .prologue */
int v0 = 0; // const/4 v0, 0x0
/* .line 484 */
/* iput-boolean v0, p0, Lcom/ansca/corona/CoronaSensorManager$AccelerometerMonitor;->fHasSkippedFirstMeasurement:Z */
/* .line 485 */
/* iput-boolean v0, p0, Lcom/ansca/corona/CoronaSensorManager$AccelerometerMonitor;->fHasReceivedMeasurement:Z */
/* .line 486 */
/* iput-boolean v0, p0, Lcom/ansca/corona/CoronaSensorManager$AccelerometerMonitor;->fHasReceivedSample:Z */
/* .line 487 */
return;
} // .end method
