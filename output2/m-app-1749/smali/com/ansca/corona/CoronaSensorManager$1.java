class com.ansca.corona.CoronaSensorManager$1 implements java.lang.Runnable {
	 /* .source "CoronaSensorManager.java" */
	 /* # interfaces */
	 /* # annotations */
	 /* .annotation system Ldalvik/annotation/EnclosingMethod; */
	 /* value = Lcom/ansca/corona/CoronaSensorManager;->startType(I)V */
} // .end annotation
/* .annotation system Ldalvik/annotation/InnerClass; */
/* accessFlags = 0x0 */
/* name = null */
} // .end annotation
/* # instance fields */
final com.ansca.corona.CoronaSensorManager this$0; //synthetic
final Integer val$eventType; //synthetic
/* # direct methods */
 com.ansca.corona.CoronaSensorManager$1 ( ) {
/* .locals 0 */
/* .prologue */
/* .line 80 */
this.this$0 = p1;
/* iput p2, p0, Lcom/ansca/corona/CoronaSensorManager$1;->val$eventType:I */
/* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
return;
} // .end method
/* # virtual methods */
public void run ( ) {
/* .locals 14 */
/* .prologue */
/* const-wide/16 v2, 0x3e8 */
/* .line 83 */
/* iget v0, p0, Lcom/ansca/corona/CoronaSensorManager$1;->val$eventType:I */
/* packed-switch v0, :pswitch_data_0 */
/* .line 182 */
} // :cond_0
} // :goto_0
/* :pswitch_0 */
return;
/* .line 94 */
/* :pswitch_1 */
v0 = this.this$0;
com.ansca.corona.CoronaSensorManager .access$000 ( v0 );
(( com.ansca.corona.CoronaSensorManager$AccelerometerMonitor ) v0 ).start ( ); // invoke-virtual {v0}, Lcom/ansca/corona/CoronaSensorManager$AccelerometerMonitor;->start()V
/* .line 98 */
/* :pswitch_2 */
v0 = this.this$0;
com.ansca.corona.CoronaSensorManager .access$100 ( v0 );
(( com.ansca.corona.CoronaSensorManager$GyroscopeMonitor ) v0 ).start ( ); // invoke-virtual {v0}, Lcom/ansca/corona/CoronaSensorManager$GyroscopeMonitor;->start()V
/* .line 104 */
/* :pswitch_3 */
v0 = this.this$0;
v1 = this.this$0;
com.ansca.corona.CoronaSensorManager .access$300 ( v1 );
int v2 = 3; // const/4 v2, 0x3
(( android.hardware.SensorManager ) v1 ).getDefaultSensor ( v2 ); // invoke-virtual {v1, v2}, Landroid/hardware/SensorManager;->getDefaultSensor(I)Landroid/hardware/Sensor;
com.ansca.corona.CoronaSensorManager .access$202 ( v0,v1 );
/* .line 105 */
v0 = this.this$0;
/* new-instance v1, Lcom/ansca/corona/CoronaSensorManager$1$1; */
/* invoke-direct {v1, p0}, Lcom/ansca/corona/CoronaSensorManager$1$1;-><init>(Lcom/ansca/corona/CoronaSensorManager$1;)V */
com.ansca.corona.CoronaSensorManager .access$402 ( v0,v1 );
/* .line 142 */
v0 = this.this$0;
com.ansca.corona.CoronaSensorManager .access$300 ( v0 );
v1 = this.this$0;
com.ansca.corona.CoronaSensorManager .access$400 ( v1 );
v2 = this.this$0;
com.ansca.corona.CoronaSensorManager .access$200 ( v2 );
int v3 = 2; // const/4 v3, 0x2
(( android.hardware.SensorManager ) v0 ).registerListener ( v1, v2, v3 ); // invoke-virtual {v0, v1, v2, v3}, Landroid/hardware/SensorManager;->registerListener(Landroid/hardware/SensorEventListener;Landroid/hardware/Sensor;I)Z
/* .line 147 */
/* :pswitch_4 */
com.ansca.corona.Controller .getActivity ( );
/* .line 148 */
/* .local v6, "activity":Lcom/ansca/corona/CoronaActivity; */
(( com.ansca.corona.CoronaActivity ) v6 ).getPackageManager ( ); // invoke-virtual {v6}, Lcom/ansca/corona/CoronaActivity;->getPackageManager()Landroid/content/pm/PackageManager;
/* .line 149 */
/* .local v13, "packageManager":Landroid/content/pm/PackageManager; */
final String v0 = "android.hardware.location.gps"; // const-string v0, "android.hardware.location.gps"
v7 = (( android.content.pm.PackageManager ) v13 ).hasSystemFeature ( v0 ); // invoke-virtual {v13, v0}, Landroid/content/pm/PackageManager;->hasSystemFeature(Ljava/lang/String;)Z
/* .line 150 */
/* .local v7, "hasGps":Z */
final String v0 = "android.hardware.location.network"; // const-string v0, "android.hardware.location.network"
v8 = (( android.content.pm.PackageManager ) v13 ).hasSystemFeature ( v0 ); // invoke-virtual {v13, v0}, Landroid/content/pm/PackageManager;->hasSystemFeature(Ljava/lang/String;)Z
/* .line 151 */
/* .local v8, "hasNetworkLocater":Z */
/* if-nez v7, :cond_1 */
/* if-nez v8, :cond_1 */
/* .line 152 */
final String v0 = "Corona"; // const-string v0, "Corona"
final String v1 = "Unable to set up location listener.This device is incapable of providing location data."; // const-string v1, "Unable to set up location listener.This device is incapable of providing location data."
android.util.Log .v ( v0,v1 );
/* .line 157 */
} // :cond_1
/* const-wide/16 v11, 0x3e8 */
/* .line 158 */
/* .local v11, "minTime":J */
int v9 = 0; // const/4 v9, 0x0
/* .line 159 */
/* .local v9, "isLocationListenerEnabled":Z */
v0 = this.this$0;
/* new-instance v1, Lcom/ansca/corona/CoronaSensorManager$CoronaLocationListener; */
v4 = this.this$0;
int v5 = 0; // const/4 v5, 0x0
/* invoke-direct {v1, v4, v5}, Lcom/ansca/corona/CoronaSensorManager$CoronaLocationListener;-><init>(Lcom/ansca/corona/CoronaSensorManager;Lcom/ansca/corona/CoronaSensorManager$1;)V */
com.ansca.corona.CoronaSensorManager .access$602 ( v0,v1 );
/* .line 160 */
if ( v7 != null) { // if-eqz v7, :cond_2
final String v0 = "android.permission.ACCESS_FINE_LOCATION"; // const-string v0, "android.permission.ACCESS_FINE_LOCATION"
v0 = (( com.ansca.corona.CoronaActivity ) v6 ).checkCallingOrSelfPermission ( v0 ); // invoke-virtual {v6, v0}, Lcom/ansca/corona/CoronaActivity;->checkCallingOrSelfPermission(Ljava/lang/String;)I
/* if-nez v0, :cond_2 */
/* .line 162 */
v0 = this.this$0;
com.ansca.corona.CoronaSensorManager .access$600 ( v0 );
(( com.ansca.corona.CoronaSensorManager$CoronaLocationListener ) v0 ).setSupportsGps ( ); // invoke-virtual {v0}, Lcom/ansca/corona/CoronaSensorManager$CoronaLocationListener;->setSupportsGps()V
/* .line 163 */
v0 = this.this$0;
com.ansca.corona.CoronaSensorManager .access$900 ( v0 );
final String v1 = "gps"; // const-string v1, "gps"
v4 = this.this$0;
com.ansca.corona.CoronaSensorManager .access$800 ( v4 );
/* move-result-wide v4 */
/* double-to-float v4, v4 */
v5 = this.this$0;
com.ansca.corona.CoronaSensorManager .access$600 ( v5 );
/* invoke-virtual/range {v0 ..v5}, Landroid/location/LocationManager;->requestLocationUpdates(Ljava/lang/String;JFLandroid/location/LocationListener;)V */
/* .line 165 */
int v9 = 1; // const/4 v9, 0x1
/* .line 167 */
} // :cond_2
if ( v8 != null) { // if-eqz v8, :cond_3
final String v0 = "android.permission.ACCESS_COARSE_LOCATION"; // const-string v0, "android.permission.ACCESS_COARSE_LOCATION"
v0 = (( com.ansca.corona.CoronaActivity ) v6 ).checkCallingOrSelfPermission ( v0 ); // invoke-virtual {v6, v0}, Lcom/ansca/corona/CoronaActivity;->checkCallingOrSelfPermission(Ljava/lang/String;)I
/* if-nez v0, :cond_3 */
/* .line 169 */
v0 = this.this$0;
com.ansca.corona.CoronaSensorManager .access$600 ( v0 );
(( com.ansca.corona.CoronaSensorManager$CoronaLocationListener ) v0 ).setSupportsNetwork ( ); // invoke-virtual {v0}, Lcom/ansca/corona/CoronaSensorManager$CoronaLocationListener;->setSupportsNetwork()V
/* .line 170 */
v0 = this.this$0;
com.ansca.corona.CoronaSensorManager .access$900 ( v0 );
final String v1 = "network"; // const-string v1, "network"
v4 = this.this$0;
com.ansca.corona.CoronaSensorManager .access$800 ( v4 );
/* move-result-wide v4 */
/* double-to-float v4, v4 */
v5 = this.this$0;
com.ansca.corona.CoronaSensorManager .access$600 ( v5 );
/* invoke-virtual/range {v0 ..v5}, Landroid/location/LocationManager;->requestLocationUpdates(Ljava/lang/String;JFLandroid/location/LocationListener;)V */
/* .line 172 */
int v9 = 1; // const/4 v9, 0x1
/* .line 174 */
} // :cond_3
/* if-nez v9, :cond_0 */
/* .line 175 */
final String v10 = "This application does not have permission to read your current location."; // const-string v10, "This application does not have permission to read your current location."
/* .line 176 */
/* .local v10, "message":Ljava/lang/String; */
final String v0 = "Corona"; // const-string v0, "Corona"
/* new-instance v1, Ljava/lang/StringBuilder; */
/* invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V */
final String v2 = "Warning: "; // const-string v2, "Warning: "
(( java.lang.StringBuilder ) v1 ).append ( v2 ); // invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v1 ).append ( v10 ); // invoke-virtual {v1, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v1 ).toString ( ); // invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
android.util.Log .v ( v0,v1 );
/* .line 177 */
com.ansca.corona.Controller .getController ( );
final String v1 = "Corona"; // const-string v1, "Corona"
int v2 = 1; // const/4 v2, 0x1
/* new-array v2, v2, [Ljava/lang/String; */
int v3 = 0; // const/4 v3, 0x0
final String v4 = "OK"; // const-string v4, "OK"
/* aput-object v4, v2, v3 */
(( com.ansca.corona.Controller ) v0 ).showNativeAlert ( v1, v10, v2 ); // invoke-virtual {v0, v1, v10, v2}, Lcom/ansca/corona/Controller;->showNativeAlert(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;)V
/* goto/16 :goto_0 */
/* .line 83 */
/* :pswitch_data_0 */
/* .packed-switch 0x0 */
/* :pswitch_0 */
/* :pswitch_1 */
/* :pswitch_2 */
/* :pswitch_4 */
/* :pswitch_3 */
/* :pswitch_0 */
} // .end packed-switch
} // .end method
