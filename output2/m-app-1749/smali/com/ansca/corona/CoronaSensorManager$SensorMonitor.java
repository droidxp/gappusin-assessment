abstract class com.ansca.corona.CoronaSensorManager$SensorMonitor {
	 /* .source "CoronaSensorManager.java" */
	 /* # annotations */
	 /* .annotation system Ldalvik/annotation/EnclosingClass; */
	 /* value = Lcom/ansca/corona/CoronaSensorManager; */
} // .end annotation
/* .annotation system Ldalvik/annotation/InnerClass; */
/* accessFlags = 0x402 */
/* name = "SensorMonitor" */
} // .end annotation
/* # instance fields */
private Boolean fIsRunning;
private android.hardware.SensorEventListener fSensorListener;
private com.ansca.corona.MessageBasedTimer fTimer;
final com.ansca.corona.CoronaSensorManager this$0; //synthetic
/* # direct methods */
public com.ansca.corona.CoronaSensorManager$SensorMonitor ( ) {
/* .locals 1 */
/* .prologue */
/* .line 235 */
this.this$0 = p1;
/* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
/* .line 237 */
int v0 = 0; // const/4 v0, 0x0
this.fSensorListener = v0;
/* .line 238 */
/* new-instance v0, Lcom/ansca/corona/MessageBasedTimer; */
/* invoke-direct {v0}, Lcom/ansca/corona/MessageBasedTimer;-><init>()V */
this.fTimer = v0;
/* .line 239 */
int v0 = 0; // const/4 v0, 0x0
/* iput-boolean v0, p0, Lcom/ansca/corona/CoronaSensorManager$SensorMonitor;->fIsRunning:Z */
/* .line 242 */
/* const/16 v0, 0xa */
(( com.ansca.corona.CoronaSensorManager$SensorMonitor ) p0 ).setIntervalInHertz ( v0 ); // invoke-virtual {p0, v0}, Lcom/ansca/corona/CoronaSensorManager$SensorMonitor;->setIntervalInHertz(I)V
/* .line 243 */
return;
} // .end method
private Integer getSensorDelay ( ) {
/* .locals 5 */
/* .prologue */
/* .line 419 */
v3 = this.fTimer;
(( com.ansca.corona.MessageBasedTimer ) v3 ).getInterval ( ); // invoke-virtual {v3}, Lcom/ansca/corona/MessageBasedTimer;->getInterval()Lcom/ansca/corona/TimeSpan;
(( com.ansca.corona.TimeSpan ) v3 ).getTotalMilliseconds ( ); // invoke-virtual {v3}, Lcom/ansca/corona/TimeSpan;->getTotalMilliseconds()J
/* move-result-wide v1 */
/* .line 420 */
/* .local v1, "intervalInMilliseconds":J */
/* const-wide/16 v3, 0xc8 */
/* cmp-long v3, v1, v3 */
/* if-ltz v3, :cond_0 */
/* .line 421 */
int v0 = 3; // const/4 v0, 0x3
/* .line 432 */
/* .local v0, "delayType":I */
} // :goto_0
/* .line 423 */
} // .end local v0 # "delayType":I
} // :cond_0
/* const-wide/16 v3, 0x3c */
/* cmp-long v3, v1, v3 */
/* if-ltz v3, :cond_1 */
/* .line 424 */
int v0 = 2; // const/4 v0, 0x2
/* .restart local v0 # "delayType":I */
/* .line 426 */
} // .end local v0 # "delayType":I
} // :cond_1
/* const-wide/16 v3, 0x14 */
/* cmp-long v3, v1, v3 */
/* if-ltz v3, :cond_2 */
/* .line 427 */
int v0 = 1; // const/4 v0, 0x1
/* .restart local v0 # "delayType":I */
/* .line 430 */
} // .end local v0 # "delayType":I
} // :cond_2
int v0 = 0; // const/4 v0, 0x0
/* .restart local v0 # "delayType":I */
} // .end method
/* # virtual methods */
public com.ansca.corona.TimeSpan getInterval ( ) {
/* .locals 1 */
/* .prologue */
/* .line 330 */
v0 = this.fTimer;
(( com.ansca.corona.MessageBasedTimer ) v0 ).getInterval ( ); // invoke-virtual {v0}, Lcom/ansca/corona/MessageBasedTimer;->getInterval()Lcom/ansca/corona/TimeSpan;
} // .end method
public Integer getIntervalInHertz ( ) {
/* .locals 4 */
/* .prologue */
/* .line 322 */
/* const-wide/16 v0, 0x3e8 */
v2 = this.fTimer;
(( com.ansca.corona.MessageBasedTimer ) v2 ).getInterval ( ); // invoke-virtual {v2}, Lcom/ansca/corona/MessageBasedTimer;->getInterval()Lcom/ansca/corona/TimeSpan;
(( com.ansca.corona.TimeSpan ) v2 ).getTotalMilliseconds ( ); // invoke-virtual {v2}, Lcom/ansca/corona/TimeSpan;->getTotalMilliseconds()J
/* move-result-wide v2 */
/* div-long/2addr v0, v2 */
/* long-to-int v0, v0 */
} // .end method
public abstract Integer getSensorType ( ) {
} // .end method
public Boolean isRunning ( ) {
/* .locals 1 */
/* .prologue */
/* .line 344 */
/* iget-boolean v0, p0, Lcom/ansca/corona/CoronaSensorManager$SensorMonitor;->fIsRunning:Z */
} // .end method
protected void onStarting ( ) {
/* .locals 0 */
/* .prologue */
/* .line 405 */
return;
} // .end method
protected void onStopped ( ) {
/* .locals 0 */
/* .prologue */
/* .line 408 */
return;
} // .end method
public void setIntervalInHertz ( Integer p0 ) {
/* .locals 4 */
/* .param p1, "value" # I */
/* .prologue */
/* .line 295 */
/* const/16 v2, 0x3e8 */
/* div-int/2addr v2, p1 */
/* int-to-long v2, v2 */
com.ansca.corona.TimeSpan .fromMilliseconds ( v2,v3 );
/* .line 298 */
/* .local v0, "interval":Lcom/ansca/corona/TimeSpan; */
v2 = this.fTimer;
(( com.ansca.corona.MessageBasedTimer ) v2 ).getInterval ( ); // invoke-virtual {v2}, Lcom/ansca/corona/MessageBasedTimer;->getInterval()Lcom/ansca/corona/TimeSpan;
v2 = (( com.ansca.corona.TimeSpan ) v2 ).equals ( v0 ); // invoke-virtual {v2, v0}, Lcom/ansca/corona/TimeSpan;->equals(Lcom/ansca/corona/TimeSpan;)Z
if ( v2 != null) { // if-eqz v2, :cond_1
/* .line 315 */
} // :cond_0
} // :goto_0
return;
/* .line 303 */
} // :cond_1
v1 = (( com.ansca.corona.CoronaSensorManager$SensorMonitor ) p0 ).isRunning ( ); // invoke-virtual {p0}, Lcom/ansca/corona/CoronaSensorManager$SensorMonitor;->isRunning()Z
/* .line 304 */
/* .local v1, "wasRunning":Z */
if ( v1 != null) { // if-eqz v1, :cond_2
/* .line 305 */
(( com.ansca.corona.CoronaSensorManager$SensorMonitor ) p0 ).stop ( ); // invoke-virtual {p0}, Lcom/ansca/corona/CoronaSensorManager$SensorMonitor;->stop()V
/* .line 309 */
} // :cond_2
v2 = this.fTimer;
(( com.ansca.corona.MessageBasedTimer ) v2 ).setInterval ( v0 ); // invoke-virtual {v2, v0}, Lcom/ansca/corona/MessageBasedTimer;->setInterval(Lcom/ansca/corona/TimeSpan;)V
/* .line 312 */
if ( v1 != null) { // if-eqz v1, :cond_0
/* .line 313 */
(( com.ansca.corona.CoronaSensorManager$SensorMonitor ) p0 ).start ( ); // invoke-virtual {p0}, Lcom/ansca/corona/CoronaSensorManager$SensorMonitor;->start()V
} // .end method
protected void setSensorListener ( android.hardware.SensorEventListener p0 ) {
/* .locals 2 */
/* .param p1, "listener" # Landroid/hardware/SensorEventListener; */
/* .prologue */
/* .line 252 */
/* if-nez p1, :cond_0 */
/* .line 253 */
/* new-instance v1, Ljava/lang/NullPointerException; */
/* invoke-direct {v1}, Ljava/lang/NullPointerException;-><init>()V */
/* throw v1 */
/* .line 257 */
} // :cond_0
v1 = this.fSensorListener;
/* if-ne p1, v1, :cond_2 */
/* .line 274 */
} // :cond_1
} // :goto_0
return;
/* .line 262 */
} // :cond_2
v0 = (( com.ansca.corona.CoronaSensorManager$SensorMonitor ) p0 ).isRunning ( ); // invoke-virtual {p0}, Lcom/ansca/corona/CoronaSensorManager$SensorMonitor;->isRunning()Z
/* .line 263 */
/* .local v0, "wasRunning":Z */
if ( v0 != null) { // if-eqz v0, :cond_3
/* .line 264 */
(( com.ansca.corona.CoronaSensorManager$SensorMonitor ) p0 ).stop ( ); // invoke-virtual {p0}, Lcom/ansca/corona/CoronaSensorManager$SensorMonitor;->stop()V
/* .line 268 */
} // :cond_3
this.fSensorListener = p1;
/* .line 271 */
if ( v0 != null) { // if-eqz v0, :cond_1
/* .line 272 */
(( com.ansca.corona.CoronaSensorManager$SensorMonitor ) p0 ).start ( ); // invoke-virtual {p0}, Lcom/ansca/corona/CoronaSensorManager$SensorMonitor;->start()V
} // .end method
protected void setTimerListener ( com.ansca.corona.MessageBasedTimer$Listener p0 ) {
/* .locals 1 */
/* .param p1, "listener" # Lcom/ansca/corona/MessageBasedTimer$Listener; */
/* .prologue */
/* .line 285 */
v0 = this.fTimer;
(( com.ansca.corona.MessageBasedTimer ) v0 ).setListener ( p1 ); // invoke-virtual {v0, p1}, Lcom/ansca/corona/MessageBasedTimer;->setListener(Lcom/ansca/corona/MessageBasedTimer$Listener;)V
/* .line 286 */
return;
} // .end method
public void start ( ) {
/* .locals 6 */
/* .prologue */
/* .line 350 */
v4 = (( com.ansca.corona.CoronaSensorManager$SensorMonitor ) p0 ).isRunning ( ); // invoke-virtual {p0}, Lcom/ansca/corona/CoronaSensorManager$SensorMonitor;->isRunning()Z
if ( v4 != null) { // if-eqz v4, :cond_1
/* .line 380 */
} // :cond_0
} // :goto_0
return;
/* .line 357 */
} // :cond_1
try { // :try_start_0
(( com.ansca.corona.CoronaSensorManager$SensorMonitor ) p0 ).onStarting ( ); // invoke-virtual {p0}, Lcom/ansca/corona/CoronaSensorManager$SensorMonitor;->onStarting()V
/* .line 361 */
com.ansca.corona.CoronaEnvironment .getApplicationContext ( );
final String v5 = "sensor"; // const-string v5, "sensor"
(( android.content.Context ) v4 ).getSystemService ( v5 ); // invoke-virtual {v4, v5}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;
/* check-cast v3, Landroid/hardware/SensorManager; */
/* .line 363 */
/* .local v3, "sensorManager":Landroid/hardware/SensorManager; */
v4 = (( com.ansca.corona.CoronaSensorManager$SensorMonitor ) p0 ).getSensorType ( ); // invoke-virtual {p0}, Lcom/ansca/corona/CoronaSensorManager$SensorMonitor;->getSensorType()I
(( android.hardware.SensorManager ) v3 ).getDefaultSensor ( v4 ); // invoke-virtual {v3, v4}, Landroid/hardware/SensorManager;->getDefaultSensor(I)Landroid/hardware/Sensor;
/* .line 364 */
/* .local v2, "sensor":Landroid/hardware/Sensor; */
v4 = this.fSensorListener;
v5 = /* invoke-direct {p0}, Lcom/ansca/corona/CoronaSensorManager$SensorMonitor;->getSensorDelay()I */
(( android.hardware.SensorManager ) v3 ).registerListener ( v4, v2, v5 ); // invoke-virtual {v3, v4, v2, v5}, Landroid/hardware/SensorManager;->registerListener(Landroid/hardware/SensorEventListener;Landroid/hardware/Sensor;I)Z
/* .line 365 */
int v4 = 1; // const/4 v4, 0x1
/* iput-boolean v4, p0, Lcom/ansca/corona/CoronaSensorManager$SensorMonitor;->fIsRunning:Z */
/* .line 369 */
v4 = this.fTimer;
(( com.ansca.corona.MessageBasedTimer ) v4 ).getListener ( ); // invoke-virtual {v4}, Lcom/ansca/corona/MessageBasedTimer;->getListener()Lcom/ansca/corona/MessageBasedTimer$Listener;
if ( v4 != null) { // if-eqz v4, :cond_0
/* .line 370 */
com.ansca.corona.Controller .getActivity ( );
/* .line 371 */
/* .local v0, "activity":Lcom/ansca/corona/CoronaActivity; */
if ( v0 != null) { // if-eqz v0, :cond_2
/* .line 372 */
v4 = this.fTimer;
(( com.ansca.corona.CoronaActivity ) v0 ).getHandler ( ); // invoke-virtual {v0}, Lcom/ansca/corona/CoronaActivity;->getHandler()Landroid/os/Handler;
(( com.ansca.corona.MessageBasedTimer ) v4 ).setHandler ( v5 ); // invoke-virtual {v4, v5}, Lcom/ansca/corona/MessageBasedTimer;->setHandler(Landroid/os/Handler;)V
/* .line 374 */
} // :cond_2
v4 = this.fTimer;
(( com.ansca.corona.MessageBasedTimer ) v4 ).start ( ); // invoke-virtual {v4}, Lcom/ansca/corona/MessageBasedTimer;->start()V
/* :try_end_0 */
/* .catch Ljava/lang/Exception; {:try_start_0 ..:try_end_0} :catch_0 */
/* .line 377 */
} // .end local v0 # "activity":Lcom/ansca/corona/CoronaActivity;
} // .end local v2 # "sensor":Landroid/hardware/Sensor;
} // .end local v3 # "sensorManager":Landroid/hardware/SensorManager;
/* :catch_0 */
/* move-exception v1 */
/* .line 378 */
/* .local v1, "ex":Ljava/lang/Exception; */
(( java.lang.Exception ) v1 ).printStackTrace ( ); // invoke-virtual {v1}, Ljava/lang/Exception;->printStackTrace()V
} // .end method
public void stop ( ) {
/* .locals 4 */
/* .prologue */
/* .line 385 */
v2 = (( com.ansca.corona.CoronaSensorManager$SensorMonitor ) p0 ).isRunning ( ); // invoke-virtual {p0}, Lcom/ansca/corona/CoronaSensorManager$SensorMonitor;->isRunning()Z
/* if-nez v2, :cond_0 */
/* .line 402 */
} // :goto_0
return;
/* .line 392 */
} // :cond_0
try { // :try_start_0
com.ansca.corona.CoronaEnvironment .getApplicationContext ( );
final String v3 = "sensor"; // const-string v3, "sensor"
(( android.content.Context ) v2 ).getSystemService ( v3 ); // invoke-virtual {v2, v3}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;
/* check-cast v1, Landroid/hardware/SensorManager; */
/* .line 394 */
/* .local v1, "sensorManager":Landroid/hardware/SensorManager; */
v2 = this.fSensorListener;
(( android.hardware.SensorManager ) v1 ).unregisterListener ( v2 ); // invoke-virtual {v1, v2}, Landroid/hardware/SensorManager;->unregisterListener(Landroid/hardware/SensorEventListener;)V
/* .line 395 */
v2 = this.fTimer;
(( com.ansca.corona.MessageBasedTimer ) v2 ).stop ( ); // invoke-virtual {v2}, Lcom/ansca/corona/MessageBasedTimer;->stop()V
/* .line 396 */
int v2 = 0; // const/4 v2, 0x0
/* iput-boolean v2, p0, Lcom/ansca/corona/CoronaSensorManager$SensorMonitor;->fIsRunning:Z */
/* .line 397 */
(( com.ansca.corona.CoronaSensorManager$SensorMonitor ) p0 ).onStopped ( ); // invoke-virtual {p0}, Lcom/ansca/corona/CoronaSensorManager$SensorMonitor;->onStopped()V
/* :try_end_0 */
/* .catch Ljava/lang/Exception; {:try_start_0 ..:try_end_0} :catch_0 */
/* .line 399 */
} // .end local v1 # "sensorManager":Landroid/hardware/SensorManager;
/* :catch_0 */
/* move-exception v0 */
/* .line 400 */
/* .local v0, "ex":Ljava/lang/Exception; */
(( java.lang.Exception ) v0 ).printStackTrace ( ); // invoke-virtual {v0}, Ljava/lang/Exception;->printStackTrace()V
} // .end method
