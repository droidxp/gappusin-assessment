class com.ansca.corona.CoronaSensorManager$1$1 implements android.hardware.SensorEventListener {
	 /* .source "CoronaSensorManager.java" */
	 /* # interfaces */
	 /* # annotations */
	 /* .annotation system Ldalvik/annotation/EnclosingMethod; */
	 /* value = Lcom/ansca/corona/CoronaSensorManager$1;->run()V */
} // .end annotation
/* .annotation system Ldalvik/annotation/InnerClass; */
/* accessFlags = 0x0 */
/* name = null */
} // .end annotation
/* # instance fields */
final com.ansca.corona.CoronaSensorManager$1 this$1; //synthetic
/* # direct methods */
 com.ansca.corona.CoronaSensorManager$1$1 ( ) {
/* .locals 0 */
/* .prologue */
/* .line 105 */
this.this$1 = p1;
/* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
return;
} // .end method
/* # virtual methods */
public void onAccuracyChanged ( android.hardware.Sensor p0, Integer p1 ) {
/* .locals 0 */
/* .param p1, "arg0" # Landroid/hardware/Sensor; */
/* .param p2, "arg1" # I */
/* .prologue */
/* .line 139 */
return;
} // .end method
public void onSensorChanged ( android.hardware.SensorEvent p0 ) {
/* .locals 3 */
/* .param p1, "event" # Landroid/hardware/SensorEvent; */
/* .prologue */
/* .line 107 */
/* monitor-enter p0 */
/* .line 110 */
try { // :try_start_0
	 v1 = 	 com.ansca.corona.Controller .isValid ( );
	 /* if-nez v1, :cond_0 */
	 /* .line 111 */
	 /* monitor-exit p0 */
	 /* .line 136 */
} // :goto_0
return;
/* .line 119 */
} // :cond_0
v1 = this.values;
int v2 = 0; // const/4 v2, 0x0
/* aget v0, v1, v2 */
/* .line 123 */
/* .local v0, "currentHeading":F */
com.ansca.corona.Controller .getController ( );
v1 = (( com.ansca.corona.Controller ) v1 ).isNaturalOrientationPortrait ( ); // invoke-virtual {v1}, Lcom/ansca/corona/Controller;->isNaturalOrientationPortrait()Z
/* if-nez v1, :cond_1 */
/* .line 124 */
/* const/high16 v1, 0x42b40000 # 90.0f */
/* sub-float/2addr v0, v1 */
/* .line 125 */
int v1 = 0; // const/4 v1, 0x0
/* cmpg-float v1, v0, v1 */
/* if-gez v1, :cond_1 */
/* .line 126 */
/* const/high16 v1, 0x43b40000 # 360.0f */
/* add-float/2addr v0, v1 */
/* .line 131 */
} // :cond_1
v1 = this.this$1;
v1 = this.this$0;
v1 = com.ansca.corona.CoronaSensorManager .access$500 ( v1 );
/* cmpl-float v1, v1, v0 */
if ( v1 != null) { // if-eqz v1, :cond_2
/* .line 132 */
v1 = this.this$1;
v1 = this.this$0;
com.ansca.corona.CoronaSensorManager .access$502 ( v1,v0 );
/* .line 133 */
com.ansca.corona.Controller .getEventManager ( );
v2 = this.this$1;
v2 = this.this$0;
v2 = com.ansca.corona.CoronaSensorManager .access$500 ( v2 );
(( com.ansca.corona.events.EventManager ) v1 ).headingEvent ( v2 ); // invoke-virtual {v1, v2}, Lcom/ansca/corona/events/EventManager;->headingEvent(F)V
/* .line 135 */
} // :cond_2
/* monitor-exit p0 */
} // .end local v0 # "currentHeading":F
/* :catchall_0 */
/* move-exception v1 */
/* monitor-exit p0 */
/* :try_end_0 */
/* .catchall {:try_start_0 ..:try_end_0} :catchall_0 */
/* throw v1 */
} // .end method
