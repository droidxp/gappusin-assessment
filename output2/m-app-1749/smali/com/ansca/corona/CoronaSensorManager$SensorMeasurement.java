class com.ansca.corona.CoronaSensorManager$SensorMeasurement {
	 /* .source "CoronaSensorManager.java" */
	 /* # annotations */
	 /* .annotation system Ldalvik/annotation/EnclosingClass; */
	 /* value = Lcom/ansca/corona/CoronaSensorManager; */
} // .end annotation
/* .annotation system Ldalvik/annotation/InnerClass; */
/* accessFlags = 0x2 */
/* name = "SensorMeasurement" */
} // .end annotation
/* # instance fields */
public Integer accuracy;
public android.hardware.Sensor sensor;
final com.ansca.corona.CoronaSensorManager this$0; //synthetic
public Long timestamp;
public values;
/* # direct methods */
public com.ansca.corona.CoronaSensorManager$SensorMeasurement ( ) {
/* .locals 3 */
/* .prologue */
int v2 = 0; // const/4 v2, 0x0
/* .line 194 */
this.this$0 = p1;
/* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
/* .line 195 */
int v0 = 0; // const/4 v0, 0x0
/* iput v0, p0, Lcom/ansca/corona/CoronaSensorManager$SensorMeasurement;->accuracy:I */
/* .line 196 */
this.sensor = v2;
/* .line 197 */
/* const-wide/16 v0, 0x0 */
/* iput-wide v0, p0, Lcom/ansca/corona/CoronaSensorManager$SensorMeasurement;->timestamp:J */
/* .line 198 */
this.values = v2;
/* .line 199 */
return;
} // .end method
/* # virtual methods */
public void copyFrom ( android.hardware.SensorEvent p0 ) {
/* .locals 3 */
/* .param p1, "event" # Landroid/hardware/SensorEvent; */
/* .prologue */
/* .line 202 */
/* if-nez p1, :cond_1 */
/* .line 216 */
} // :cond_0
return;
/* .line 206 */
} // :cond_1
/* iget v1, p1, Landroid/hardware/SensorEvent;->accuracy:I */
/* iput v1, p0, Lcom/ansca/corona/CoronaSensorManager$SensorMeasurement;->accuracy:I */
/* .line 207 */
v1 = this.sensor;
this.sensor = v1;
/* .line 208 */
/* iget-wide v1, p1, Landroid/hardware/SensorEvent;->timestamp:J */
/* iput-wide v1, p0, Lcom/ansca/corona/CoronaSensorManager$SensorMeasurement;->timestamp:J */
/* .line 210 */
v1 = this.values;
/* if-nez v1, :cond_2 */
/* .line 211 */
v1 = this.values;
/* array-length v1, v1 */
/* new-array v1, v1, [F */
this.values = v1;
/* .line 213 */
} // :cond_2
int v0 = 0; // const/4 v0, 0x0
/* .local v0, "index":I */
} // :goto_0
v1 = this.values;
/* array-length v1, v1 */
/* if-ge v0, v1, :cond_0 */
v1 = this.values;
/* array-length v1, v1 */
/* if-ge v0, v1, :cond_0 */
/* .line 214 */
v1 = this.values;
v2 = this.values;
/* aget v2, v2, v0 */
/* aput v2, v1, v0 */
/* .line 213 */
/* add-int/lit8 v0, v0, 0x1 */
} // .end method
