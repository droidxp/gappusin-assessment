class com.ansca.corona.CoronaSensorManager$GyroscopeMonitor extends com.ansca.corona.CoronaSensorManager$SensorMonitor {
	 /* .source "CoronaSensorManager.java" */
	 /* # annotations */
	 /* .annotation system Ldalvik/annotation/EnclosingClass; */
	 /* value = Lcom/ansca/corona/CoronaSensorManager; */
} // .end annotation
/* .annotation system Ldalvik/annotation/InnerClass; */
/* accessFlags = 0x2 */
/* name = "GyroscopeMonitor" */
} // .end annotation
/* .annotation system Ldalvik/annotation/MemberClasses; */
/* value = { */
/* Lcom/ansca/corona/CoronaSensorManager$GyroscopeMonitor$TimerHandler;, */
/* Lcom/ansca/corona/CoronaSensorManager$GyroscopeMonitor$SensorHandler; */
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
public com.ansca.corona.CoronaSensorManager$GyroscopeMonitor ( ) {
/* .locals 4 */
/* .prologue */
int v3 = 0; // const/4 v3, 0x0
int v2 = 0; // const/4 v2, 0x0
/* .line 594 */
this.this$0 = p1;
/* .line 595 */
/* invoke-direct {p0, p1}, Lcom/ansca/corona/CoronaSensorManager$SensorMonitor;-><init>(Lcom/ansca/corona/CoronaSensorManager;)V */
/* .line 598 */
/* new-instance v0, Lcom/ansca/corona/CoronaSensorManager$SensorMeasurement; */
/* invoke-direct {v0, p1}, Lcom/ansca/corona/CoronaSensorManager$SensorMeasurement;-><init>(Lcom/ansca/corona/CoronaSensorManager;)V */
this.fLastSensorMeasurement = v0;
/* .line 599 */
v0 = this.fLastSensorMeasurement;
int v1 = 3; // const/4 v1, 0x3
/* new-array v1, v1, [F */
/* fill-array-data v1, :array_0 */
this.values = v1;
/* .line 600 */
/* iput-boolean v2, p0, Lcom/ansca/corona/CoronaSensorManager$GyroscopeMonitor;->fHasSkippedFirstMeasurement:Z */
/* .line 601 */
/* iput-boolean v2, p0, Lcom/ansca/corona/CoronaSensorManager$GyroscopeMonitor;->fHasReceivedMeasurement:Z */
/* .line 602 */
/* iput-boolean v2, p0, Lcom/ansca/corona/CoronaSensorManager$GyroscopeMonitor;->fHasReceivedSample:Z */
/* .line 603 */
/* const-wide/16 v0, 0x0 */
/* iput-wide v0, p0, Lcom/ansca/corona/CoronaSensorManager$GyroscopeMonitor;->fLastSampleTimestamp:J */
/* .line 606 */
/* new-instance v0, Lcom/ansca/corona/CoronaSensorManager$GyroscopeMonitor$SensorHandler; */
/* invoke-direct {v0, p0, v3}, Lcom/ansca/corona/CoronaSensorManager$GyroscopeMonitor$SensorHandler;-><init>(Lcom/ansca/corona/CoronaSensorManager$GyroscopeMonitor;Lcom/ansca/corona/CoronaSensorManager$1;)V */
(( com.ansca.corona.CoronaSensorManager$GyroscopeMonitor ) p0 ).setSensorListener ( v0 ); // invoke-virtual {p0, v0}, Lcom/ansca/corona/CoronaSensorManager$GyroscopeMonitor;->setSensorListener(Landroid/hardware/SensorEventListener;)V
/* .line 607 */
/* new-instance v0, Lcom/ansca/corona/CoronaSensorManager$GyroscopeMonitor$TimerHandler; */
/* invoke-direct {v0, p0, v3}, Lcom/ansca/corona/CoronaSensorManager$GyroscopeMonitor$TimerHandler;-><init>(Lcom/ansca/corona/CoronaSensorManager$GyroscopeMonitor;Lcom/ansca/corona/CoronaSensorManager$1;)V */
(( com.ansca.corona.CoronaSensorManager$GyroscopeMonitor ) p0 ).setTimerListener ( v0 ); // invoke-virtual {p0, v0}, Lcom/ansca/corona/CoronaSensorManager$GyroscopeMonitor;->setTimerListener(Lcom/ansca/corona/MessageBasedTimer$Listener;)V
/* .line 608 */
return;
/* .line 599 */
/* nop */
/* :array_0 */
/* .array-data 4 */
/* 0x0 */
/* 0x0 */
/* 0x0 */
} // .end array-data
} // .end method
static Boolean access$1900 ( com.ansca.corona.CoronaSensorManager$GyroscopeMonitor p0 ) { //synthethic
/* .locals 1 */
/* .param p0, "x0" # Lcom/ansca/corona/CoronaSensorManager$GyroscopeMonitor; */
/* .prologue */
/* .line 573 */
/* iget-boolean v0, p0, Lcom/ansca/corona/CoronaSensorManager$GyroscopeMonitor;->fHasSkippedFirstMeasurement:Z */
} // .end method
static Boolean access$1902 ( com.ansca.corona.CoronaSensorManager$GyroscopeMonitor p0, Boolean p1 ) { //synthethic
/* .locals 0 */
/* .param p0, "x0" # Lcom/ansca/corona/CoronaSensorManager$GyroscopeMonitor; */
/* .param p1, "x1" # Z */
/* .prologue */
/* .line 573 */
/* iput-boolean p1, p0, Lcom/ansca/corona/CoronaSensorManager$GyroscopeMonitor;->fHasSkippedFirstMeasurement:Z */
} // .end method
static com.ansca.corona.CoronaSensorManager$SensorMeasurement access$2000 ( com.ansca.corona.CoronaSensorManager$GyroscopeMonitor p0 ) { //synthethic
/* .locals 1 */
/* .param p0, "x0" # Lcom/ansca/corona/CoronaSensorManager$GyroscopeMonitor; */
/* .prologue */
/* .line 573 */
v0 = this.fLastSensorMeasurement;
} // .end method
static Boolean access$2100 ( com.ansca.corona.CoronaSensorManager$GyroscopeMonitor p0 ) { //synthethic
/* .locals 1 */
/* .param p0, "x0" # Lcom/ansca/corona/CoronaSensorManager$GyroscopeMonitor; */
/* .prologue */
/* .line 573 */
/* iget-boolean v0, p0, Lcom/ansca/corona/CoronaSensorManager$GyroscopeMonitor;->fHasReceivedMeasurement:Z */
} // .end method
static Boolean access$2102 ( com.ansca.corona.CoronaSensorManager$GyroscopeMonitor p0, Boolean p1 ) { //synthethic
/* .locals 0 */
/* .param p0, "x0" # Lcom/ansca/corona/CoronaSensorManager$GyroscopeMonitor; */
/* .param p1, "x1" # Z */
/* .prologue */
/* .line 573 */
/* iput-boolean p1, p0, Lcom/ansca/corona/CoronaSensorManager$GyroscopeMonitor;->fHasReceivedMeasurement:Z */
} // .end method
static Boolean access$2200 ( com.ansca.corona.CoronaSensorManager$GyroscopeMonitor p0 ) { //synthethic
/* .locals 1 */
/* .param p0, "x0" # Lcom/ansca/corona/CoronaSensorManager$GyroscopeMonitor; */
/* .prologue */
/* .line 573 */
/* iget-boolean v0, p0, Lcom/ansca/corona/CoronaSensorManager$GyroscopeMonitor;->fHasReceivedSample:Z */
} // .end method
static Boolean access$2202 ( com.ansca.corona.CoronaSensorManager$GyroscopeMonitor p0, Boolean p1 ) { //synthethic
/* .locals 0 */
/* .param p0, "x0" # Lcom/ansca/corona/CoronaSensorManager$GyroscopeMonitor; */
/* .param p1, "x1" # Z */
/* .prologue */
/* .line 573 */
/* iput-boolean p1, p0, Lcom/ansca/corona/CoronaSensorManager$GyroscopeMonitor;->fHasReceivedSample:Z */
} // .end method
static Long access$2300 ( com.ansca.corona.CoronaSensorManager$GyroscopeMonitor p0 ) { //synthethic
/* .locals 2 */
/* .param p0, "x0" # Lcom/ansca/corona/CoronaSensorManager$GyroscopeMonitor; */
/* .prologue */
/* .line 573 */
/* iget-wide v0, p0, Lcom/ansca/corona/CoronaSensorManager$GyroscopeMonitor;->fLastSampleTimestamp:J */
/* return-wide v0 */
} // .end method
static Long access$2302 ( com.ansca.corona.CoronaSensorManager$GyroscopeMonitor p0, Long p1 ) { //synthethic
/* .locals 0 */
/* .param p0, "x0" # Lcom/ansca/corona/CoronaSensorManager$GyroscopeMonitor; */
/* .param p1, "x1" # J */
/* .prologue */
/* .line 573 */
/* iput-wide p1, p0, Lcom/ansca/corona/CoronaSensorManager$GyroscopeMonitor;->fLastSampleTimestamp:J */
/* return-wide p1 */
} // .end method
/* # virtual methods */
public Integer getSensorType ( ) {
/* .locals 1 */
/* .prologue */
/* .line 615 */
int v0 = 4; // const/4 v0, 0x4
} // .end method
protected void onStarting ( ) {
/* .locals 1 */
/* .prologue */
int v0 = 0; // const/4 v0, 0x0
/* .line 620 */
/* iput-boolean v0, p0, Lcom/ansca/corona/CoronaSensorManager$GyroscopeMonitor;->fHasSkippedFirstMeasurement:Z */
/* .line 621 */
/* iput-boolean v0, p0, Lcom/ansca/corona/CoronaSensorManager$GyroscopeMonitor;->fHasReceivedMeasurement:Z */
/* .line 622 */
/* iput-boolean v0, p0, Lcom/ansca/corona/CoronaSensorManager$GyroscopeMonitor;->fHasReceivedSample:Z */
/* .line 623 */
return;
} // .end method
