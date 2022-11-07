public class com.jumptap.adtag.utils.JtAccelerator implements android.hardware.SensorEventListener {
	 /* .source "JtAccelerator.java" */
	 /* # interfaces */
	 /* # instance fields */
	 private android.hardware.Sensor accSensor;
	 android.content.Context context;
	 Boolean isAccelStarted;
	 private Long lastUpdate;
	 private android.hardware.SensorManager sensorManager;
	 Integer updateFrequency;
	 android.webkit.WebView webView;
	 /* # direct methods */
	 public com.jumptap.adtag.utils.JtAccelerator ( ) {
		 /* .locals 2 */
		 /* .param p1, "context" # Landroid/content/Context; */
		 /* .param p2, "webView" # Landroid/webkit/WebView; */
		 /* .prologue */
		 /* .line 39 */
		 /* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
		 /* .line 28 */
		 int v0 = -1; // const/4 v0, -0x1
		 /* iput v0, p0, Lcom/jumptap/adtag/utils/JtAccelerator;->updateFrequency:I */
		 /* .line 30 */
		 /* const-wide/16 v0, -0x1 */
		 /* iput-wide v0, p0, Lcom/jumptap/adtag/utils/JtAccelerator;->lastUpdate:J */
		 /* .line 33 */
		 int v0 = 0; // const/4 v0, 0x0
		 /* iput-boolean v0, p0, Lcom/jumptap/adtag/utils/JtAccelerator;->isAccelStarted:Z */
		 /* .line 36 */
		 int v0 = 0; // const/4 v0, 0x0
		 this.accSensor = v0;
		 /* .line 40 */
		 this.context = p1;
		 /* .line 41 */
		 this.webView = p2;
		 /* .line 42 */
		 final String v0 = "sensor"; // const-string v0, "sensor"
		 (( android.content.Context ) p1 ).getSystemService ( v0 ); // invoke-virtual {p1, v0}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;
		 /* check-cast v0, Landroid/hardware/SensorManager; */
		 this.sensorManager = v0;
		 /* .line 43 */
		 return;
	 } // .end method
	 /* # virtual methods */
	 public void onAccuracyChanged ( android.hardware.Sensor p0, Integer p1 ) {
		 /* .locals 0 */
		 /* .param p1, "sensor" # Landroid/hardware/Sensor; */
		 /* .param p2, "accuracy" # I */
		 /* .prologue */
		 /* .line 102 */
		 return;
	 } // .end method
	 public void onSensorChanged ( android.hardware.SensorEvent p0 ) {
		 /* .locals 11 */
		 /* .param p1, "event" # Landroid/hardware/SensorEvent; */
		 /* .prologue */
		 int v10 = 1; // const/4 v10, 0x1
		 /* .line 82 */
		 if ( p1 != null) { // if-eqz p1, :cond_0
			 v6 = this.sensor;
			 v6 = 			 (( android.hardware.Sensor ) v6 ).getType ( ); // invoke-virtual {v6}, Landroid/hardware/Sensor;->getType()I
			 /* if-ne v6, v10, :cond_0 */
			 v6 = this.values;
			 /* array-length v6, v6 */
			 int v7 = 3; // const/4 v7, 0x3
			 /* if-ge v6, v7, :cond_1 */
			 /* .line 98 */
		 } // :cond_0
	 } // :goto_0
	 return;
	 /* .line 85 */
} // :cond_1
java.lang.System .currentTimeMillis ( );
/* move-result-wide v0 */
/* .line 87 */
/* .local v0, "curTime":J */
/* iget-wide v6, p0, Lcom/jumptap/adtag/utils/JtAccelerator;->lastUpdate:J */
/* const-wide/16 v8, -0x1 */
/* cmp-long v6, v6, v8 */
if ( v6 != null) { // if-eqz v6, :cond_2
	 /* iget-wide v6, p0, Lcom/jumptap/adtag/utils/JtAccelerator;->lastUpdate:J */
	 /* sub-long v6, v0, v6 */
	 /* iget v8, p0, Lcom/jumptap/adtag/utils/JtAccelerator;->updateFrequency:I */
	 /* int-to-long v8, v8 */
	 /* cmp-long v6, v6, v8 */
	 /* if-lez v6, :cond_0 */
	 /* .line 89 */
} // :cond_2
/* iput-wide v0, p0, Lcom/jumptap/adtag/utils/JtAccelerator;->lastUpdate:J */
/* .line 91 */
v2 = this.values;
/* .line 92 */
/* .local v2, "values":[F */
int v6 = 0; // const/4 v6, 0x0
/* aget v3, v2, v6 */
/* .line 93 */
/* .local v3, "x":F */
/* aget v4, v2, v10 */
/* .line 94 */
/* .local v4, "y":F */
int v6 = 2; // const/4 v6, 0x2
/* aget v5, v2, v6 */
/* .line 95 */
/* .local v5, "z":F */
v6 = this.webView;
/* new-instance v7, Ljava/lang/StringBuilder; */
/* invoke-direct {v7}, Ljava/lang/StringBuilder;-><init>()V */
final String v8 = "javascript:gotAccel("; // const-string v8, "javascript:gotAccel("
(( java.lang.StringBuilder ) v7 ).append ( v8 ); // invoke-virtual {v7, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v7 ).append ( v3 ); // invoke-virtual {v7, v3}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;
final String v8 = ", "; // const-string v8, ", "
(( java.lang.StringBuilder ) v7 ).append ( v8 ); // invoke-virtual {v7, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v7 ).append ( v4 ); // invoke-virtual {v7, v4}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;
final String v8 = ","; // const-string v8, ","
(( java.lang.StringBuilder ) v7 ).append ( v8 ); // invoke-virtual {v7, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v7 ).append ( v5 ); // invoke-virtual {v7, v5}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;
final String v8 = " )"; // const-string v8, " )"
(( java.lang.StringBuilder ) v7 ).append ( v8 ); // invoke-virtual {v7, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v7 ).toString ( ); // invoke-virtual {v7}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
(( android.webkit.WebView ) v6 ).loadUrl ( v7 ); // invoke-virtual {v6, v7}, Landroid/webkit/WebView;->loadUrl(Ljava/lang/String;)V
} // .end method
public void start ( Integer p0 ) {
/* .locals 4 */
/* .param p1, "time" # I */
/* .prologue */
int v3 = 1; // const/4 v3, 0x1
/* .line 51 */
/* iput p1, p0, Lcom/jumptap/adtag/utils/JtAccelerator;->updateFrequency:I */
/* .line 52 */
/* iget-boolean v1, p0, Lcom/jumptap/adtag/utils/JtAccelerator;->isAccelStarted:Z */
/* if-nez v1, :cond_1 */
/* .line 55 */
v1 = this.sensorManager;
(( android.hardware.SensorManager ) v1 ).getSensorList ( v3 ); // invoke-virtual {v1, v3}, Landroid/hardware/SensorManager;->getSensorList(I)Ljava/util/List;
/* .line 56 */
v1 = /* .local v0, "sensors":Ljava/util/List;, "Ljava/util/List<Landroid/hardware/Sensor;>;" */
/* if-lez v1, :cond_0 */
/* .line 58 */
int v1 = 0; // const/4 v1, 0x0
/* check-cast v1, Landroid/hardware/Sensor; */
this.accSensor = v1;
/* .line 62 */
} // :cond_0
v1 = this.sensorManager;
v2 = this.accSensor;
(( android.hardware.SensorManager ) v1 ).registerListener ( p0, v2, v3 ); // invoke-virtual {v1, p0, v2, v3}, Landroid/hardware/SensorManager;->registerListener(Landroid/hardware/SensorEventListener;Landroid/hardware/Sensor;I)Z
/* .line 66 */
} // .end local v0 # "sensors":Ljava/util/List;, "Ljava/util/List<Landroid/hardware/Sensor;>;"
} // :cond_1
return;
} // .end method
public void stop ( ) {
/* .locals 1 */
/* .prologue */
/* .line 74 */
/* iget-boolean v0, p0, Lcom/jumptap/adtag/utils/JtAccelerator;->isAccelStarted:Z */
if ( v0 != null) { // if-eqz v0, :cond_0
/* .line 75 */
v0 = this.sensorManager;
(( android.hardware.SensorManager ) v0 ).unregisterListener ( p0 ); // invoke-virtual {v0, p0}, Landroid/hardware/SensorManager;->unregisterListener(Landroid/hardware/SensorEventListener;)V
/* .line 77 */
} // :cond_0
int v0 = 0; // const/4 v0, 0x0
/* iput-boolean v0, p0, Lcom/jumptap/adtag/utils/JtAccelerator;->isAccelStarted:Z */
/* .line 78 */
return;
} // .end method
