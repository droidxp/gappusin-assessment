class com.jumptap.adtag.utils.JtLocation$1 implements android.location.LocationListener {
	 /* .source "JtLocation.java" */
	 /* # interfaces */
	 /* # annotations */
	 /* .annotation system Ldalvik/annotation/EnclosingMethod; */
	 /* value = Lcom/jumptap/adtag/utils/JtLocation;->createLocationListeners()V */
} // .end annotation
/* .annotation system Ldalvik/annotation/InnerClass; */
/* accessFlags = 0x0 */
/* name = null */
} // .end annotation
/* # instance fields */
final com.jumptap.adtag.utils.JtLocation this$0; //synthetic
/* # direct methods */
 com.jumptap.adtag.utils.JtLocation$1 ( ) {
/* .locals 0 */
/* .prologue */
/* .line 93 */
this.this$0 = p1;
/* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
return;
} // .end method
/* # virtual methods */
public void onLocationChanged ( android.location.Location p0 ) {
/* .locals 2 */
/* .param p1, "location" # Landroid/location/Location; */
/* .prologue */
/* .line 102 */
com.jumptap.adtag.utils.JtLocation .access$000 ( p1 );
/* .line 103 */
v0 = (( android.location.Location ) p1 ).getAccuracy ( ); // invoke-virtual {p1}, Landroid/location/Location;->getAccuracy()F
/* const/high16 v1, 0x447a0000 # 1000.0f */
/* cmpl-float v0, v0, v1 */
/* if-lez v0, :cond_0 */
v0 = (( android.location.Location ) p1 ).hasAccuracy ( ); // invoke-virtual {p1}, Landroid/location/Location;->hasAccuracy()Z
if ( v0 != null) { // if-eqz v0, :cond_0
	 /* .line 105 */
	 com.jumptap.adtag.utils.JtLocation .access$100 ( );
	 (( android.location.LocationManager ) v0 ).removeUpdates ( p0 ); // invoke-virtual {v0, p0}, Landroid/location/LocationManager;->removeUpdates(Landroid/location/LocationListener;)V
	 /* .line 106 */
} // :cond_0
return;
} // .end method
public void onProviderDisabled ( java.lang.String p0 ) {
/* .locals 0 */
/* .param p1, "provider" # Ljava/lang/String; */
/* .prologue */
/* .line 100 */
return;
} // .end method
public void onProviderEnabled ( java.lang.String p0 ) {
/* .locals 0 */
/* .param p1, "provider" # Ljava/lang/String; */
/* .prologue */
/* .line 98 */
return;
} // .end method
public void onStatusChanged ( java.lang.String p0, Integer p1, android.os.Bundle p2 ) {
/* .locals 0 */
/* .param p1, "provider" # Ljava/lang/String; */
/* .param p2, "status" # I */
/* .param p3, "extras" # Landroid/os/Bundle; */
/* .prologue */
/* .line 96 */
return;
} // .end method
