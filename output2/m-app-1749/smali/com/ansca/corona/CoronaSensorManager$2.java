class com.ansca.corona.CoronaSensorManager$2 implements java.lang.Runnable {
	 /* .source "CoronaSensorManager.java" */
	 /* # interfaces */
	 /* # annotations */
	 /* .annotation system Ldalvik/annotation/EnclosingMethod; */
	 /* value = Lcom/ansca/corona/CoronaSensorManager;->stopType(I)V */
} // .end annotation
/* .annotation system Ldalvik/annotation/InnerClass; */
/* accessFlags = 0x0 */
/* name = null */
} // .end annotation
/* # instance fields */
final com.ansca.corona.CoronaSensorManager this$0; //synthetic
final Integer val$eventType; //synthetic
/* # direct methods */
 com.ansca.corona.CoronaSensorManager$2 ( ) {
/* .locals 0 */
/* .prologue */
/* .line 766 */
this.this$0 = p1;
/* iput p2, p0, Lcom/ansca/corona/CoronaSensorManager$2;->val$eventType:I */
/* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
return;
} // .end method
/* # virtual methods */
public void run ( ) {
/* .locals 3 */
/* .prologue */
int v2 = 0; // const/4 v2, 0x0
/* .line 769 */
/* iget v0, p0, Lcom/ansca/corona/CoronaSensorManager$2;->val$eventType:I */
/* packed-switch v0, :pswitch_data_0 */
/* .line 797 */
} // :cond_0
} // :goto_0
/* :pswitch_0 */
return;
/* .line 778 */
/* :pswitch_1 */
v0 = this.this$0;
com.ansca.corona.CoronaSensorManager .access$000 ( v0 );
(( com.ansca.corona.CoronaSensorManager$AccelerometerMonitor ) v0 ).stop ( ); // invoke-virtual {v0}, Lcom/ansca/corona/CoronaSensorManager$AccelerometerMonitor;->stop()V
/* .line 781 */
/* :pswitch_2 */
v0 = this.this$0;
com.ansca.corona.CoronaSensorManager .access$100 ( v0 );
(( com.ansca.corona.CoronaSensorManager$GyroscopeMonitor ) v0 ).stop ( ); // invoke-virtual {v0}, Lcom/ansca/corona/CoronaSensorManager$GyroscopeMonitor;->stop()V
/* .line 784 */
/* :pswitch_3 */
v0 = this.this$0;
com.ansca.corona.CoronaSensorManager .access$400 ( v0 );
if ( v0 != null) { // if-eqz v0, :cond_0
/* .line 785 */
v0 = this.this$0;
com.ansca.corona.CoronaSensorManager .access$300 ( v0 );
v1 = this.this$0;
com.ansca.corona.CoronaSensorManager .access$400 ( v1 );
(( android.hardware.SensorManager ) v0 ).unregisterListener ( v1 ); // invoke-virtual {v0, v1}, Landroid/hardware/SensorManager;->unregisterListener(Landroid/hardware/SensorEventListener;)V
/* .line 786 */
v0 = this.this$0;
com.ansca.corona.CoronaSensorManager .access$402 ( v0,v2 );
/* .line 787 */
v0 = this.this$0;
/* const/high16 v1, -0x40800000 # -1.0f */
com.ansca.corona.CoronaSensorManager .access$502 ( v0,v1 );
/* .line 791 */
/* :pswitch_4 */
v0 = this.this$0;
com.ansca.corona.CoronaSensorManager .access$600 ( v0 );
if ( v0 != null) { // if-eqz v0, :cond_0
/* .line 792 */
v0 = this.this$0;
com.ansca.corona.CoronaSensorManager .access$900 ( v0 );
v1 = this.this$0;
com.ansca.corona.CoronaSensorManager .access$600 ( v1 );
(( android.location.LocationManager ) v0 ).removeUpdates ( v1 ); // invoke-virtual {v0, v1}, Landroid/location/LocationManager;->removeUpdates(Landroid/location/LocationListener;)V
/* .line 793 */
v0 = this.this$0;
com.ansca.corona.CoronaSensorManager .access$602 ( v0,v2 );
/* .line 769 */
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
