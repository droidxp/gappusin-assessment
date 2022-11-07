class com.ansca.corona.CoronaSensorManager$CoronaLocationListener implements android.location.LocationListener {
	 /* .source "CoronaSensorManager.java" */
	 /* # interfaces */
	 /* # annotations */
	 /* .annotation system Ldalvik/annotation/EnclosingClass; */
	 /* value = Lcom/ansca/corona/CoronaSensorManager; */
} // .end annotation
/* .annotation system Ldalvik/annotation/InnerClass; */
/* accessFlags = 0x2 */
/* name = "CoronaLocationListener" */
} // .end annotation
/* # instance fields */
private Boolean fHasReceivedData;
private Boolean fSupportsGps;
private Boolean fSupportsNetwork;
final com.ansca.corona.CoronaSensorManager this$0; //synthetic
/* # direct methods */
private com.ansca.corona.CoronaSensorManager$CoronaLocationListener ( ) {
/* .locals 1 */
/* .prologue */
int v0 = 0; // const/4 v0, 0x0
/* .line 708 */
this.this$0 = p1;
/* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
/* .line 709 */
/* iput-boolean v0, p0, Lcom/ansca/corona/CoronaSensorManager$CoronaLocationListener;->fHasReceivedData:Z */
/* .line 710 */
/* iput-boolean v0, p0, Lcom/ansca/corona/CoronaSensorManager$CoronaLocationListener;->fSupportsGps:Z */
/* .line 711 */
/* iput-boolean v0, p0, Lcom/ansca/corona/CoronaSensorManager$CoronaLocationListener;->fSupportsNetwork:Z */
return;
} // .end method
 com.ansca.corona.CoronaSensorManager$CoronaLocationListener ( ) { //synthethic
/* .locals 0 */
/* .param p1, "x0" # Lcom/ansca/corona/CoronaSensorManager; */
/* .param p2, "x1" # Lcom/ansca/corona/CoronaSensorManager$1; */
/* .prologue */
/* .line 708 */
/* invoke-direct {p0, p1}, Lcom/ansca/corona/CoronaSensorManager$CoronaLocationListener;-><init>(Lcom/ansca/corona/CoronaSensorManager;)V */
return;
} // .end method
/* # virtual methods */
public void onLocationChanged ( android.location.Location p0 ) {
/* .locals 18 */
/* .param p1, "location" # Landroid/location/Location; */
/* .prologue */
/* .line 737 */
/* invoke-virtual/range {p1 ..p1}, Landroid/location/Location;->getProvider()Ljava/lang/String; */
final String v2 = "gps"; // const-string v2, "gps"
v1 = (( java.lang.String ) v1 ).equals ( v2 ); // invoke-virtual {v1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
/* if-nez v1, :cond_0 */
/* .line 738 */
/* move-object/from16 v0, p0 */
/* iget-boolean v1, v0, Lcom/ansca/corona/CoronaSensorManager$CoronaLocationListener;->fHasReceivedData:Z */
if ( v1 != null) { // if-eqz v1, :cond_0
	 /* move-object/from16 v0, p0 */
	 /* iget-boolean v1, v0, Lcom/ansca/corona/CoronaSensorManager$CoronaLocationListener;->fSupportsGps:Z */
	 if ( v1 != null) { // if-eqz v1, :cond_0
		 /* move-object/from16 v0, p0 */
		 v1 = this.this$0;
		 com.ansca.corona.CoronaSensorManager .access$900 ( v1 );
		 final String v2 = "gps"; // const-string v2, "gps"
		 v1 = 		 (( android.location.LocationManager ) v1 ).isProviderEnabled ( v2 ); // invoke-virtual {v1, v2}, Landroid/location/LocationManager;->isProviderEnabled(Ljava/lang/String;)Z
		 if ( v1 != null) { // if-eqz v1, :cond_0
			 /* .line 753 */
		 } // :goto_0
		 return;
		 /* .line 742 */
	 } // :cond_0
	 int v1 = 1; // const/4 v1, 0x1
	 /* move-object/from16 v0, p0 */
	 /* iput-boolean v1, v0, Lcom/ansca/corona/CoronaSensorManager$CoronaLocationListener;->fHasReceivedData:Z */
	 /* .line 745 */
	 com.ansca.corona.Controller .getEventManager ( );
	 /* invoke-virtual/range {p1 ..p1}, Landroid/location/Location;->getLatitude()D */
	 /* move-result-wide v2 */
	 /* invoke-virtual/range {p1 ..p1}, Landroid/location/Location;->getLongitude()D */
	 /* move-result-wide v4 */
	 /* invoke-virtual/range {p1 ..p1}, Landroid/location/Location;->getAltitude()D */
	 /* move-result-wide v6 */
	 v8 = 	 /* invoke-virtual/range {p1 ..p1}, Landroid/location/Location;->getAccuracy()F */
	 /* float-to-double v8, v8 */
	 v10 = 	 /* invoke-virtual/range {p1 ..p1}, Landroid/location/Location;->getSpeed()F */
	 /* float-to-double v10, v10 */
	 v12 = 	 /* invoke-virtual/range {p1 ..p1}, Landroid/location/Location;->getBearing()F */
	 /* float-to-double v12, v12 */
	 /* invoke-virtual/range {p1 ..p1}, Landroid/location/Location;->getTime()J */
	 /* move-result-wide v14 */
	 /* long-to-double v14, v14 */
	 /* const-wide v16, 0x408f400000000000L # 1000.0 */
	 /* div-double v14, v14, v16 */
	 /* invoke-virtual/range {v1 ..v15}, Lcom/ansca/corona/events/EventManager;->locationEvent(DDDDDDD)V */
} // .end method
public void onProviderDisabled ( java.lang.String p0 ) {
	 /* .locals 0 */
	 /* .param p1, "provider" # Ljava/lang/String; */
	 /* .prologue */
	 /* .line 731 */
	 return;
} // .end method
public void onProviderEnabled ( java.lang.String p0 ) {
	 /* .locals 0 */
	 /* .param p1, "provider" # Ljava/lang/String; */
	 /* .prologue */
	 /* .line 727 */
	 return;
} // .end method
public void onStatusChanged ( java.lang.String p0, Integer p1, android.os.Bundle p2 ) {
	 /* .locals 0 */
	 /* .param p1, "provider" # Ljava/lang/String; */
	 /* .param p2, "status" # I */
	 /* .param p3, "extra" # Landroid/os/Bundle; */
	 /* .prologue */
	 /* .line 723 */
	 return;
} // .end method
public void setSupportsGps ( ) {
	 /* .locals 1 */
	 /* .prologue */
	 /* .line 714 */
	 int v0 = 1; // const/4 v0, 0x1
	 /* iput-boolean v0, p0, Lcom/ansca/corona/CoronaSensorManager$CoronaLocationListener;->fSupportsGps:Z */
	 /* .line 715 */
	 return;
} // .end method
public void setSupportsNetwork ( ) {
	 /* .locals 1 */
	 /* .prologue */
	 /* .line 718 */
	 int v0 = 1; // const/4 v0, 0x1
	 /* iput-boolean v0, p0, Lcom/ansca/corona/CoronaSensorManager$CoronaLocationListener;->fSupportsNetwork:Z */
	 /* .line 719 */
	 return;
} // .end method
