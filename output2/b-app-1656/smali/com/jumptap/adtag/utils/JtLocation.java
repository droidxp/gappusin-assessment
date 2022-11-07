public class com.jumptap.adtag.utils.JtLocation {
	 /* .source "JtLocation.java" */
	 /* # static fields */
	 private static android.location.Location currentLocation;
	 private static com.jumptap.adtag.utils.JtLocation jtLocationInstance;
	 private static android.location.LocationManager locationManager;
	 /* # instance fields */
	 private android.location.LocationListener listenerCoarse;
	 /* # direct methods */
	 static com.jumptap.adtag.utils.JtLocation ( ) {
		 /* .locals 1 */
		 /* .prologue */
		 int v0 = 0; // const/4 v0, 0x0
		 /* .line 15 */
		 /* .line 17 */
		 /* .line 19 */
		 return;
	 } // .end method
	 private com.jumptap.adtag.utils.JtLocation ( ) {
		 /* .locals 1 */
		 /* .prologue */
		 /* .line 23 */
		 /* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
		 /* .line 20 */
		 int v0 = 0; // const/4 v0, 0x0
		 this.listenerCoarse = v0;
		 /* .line 25 */
		 return;
	 } // .end method
	 static void access$000 ( android.location.Location p0 ) { //synthethic
		 /* .locals 0 */
		 /* .param p0, "x0" # Landroid/location/Location; */
		 /* .prologue */
		 /* .line 13 */
		 com.jumptap.adtag.utils.JtLocation .setCurrentLocation ( p0 );
		 return;
	 } // .end method
	 static android.location.LocationManager access$100 ( ) { //synthethic
		 /* .locals 1 */
		 /* .prologue */
		 /* .line 13 */
		 v0 = com.jumptap.adtag.utils.JtLocation.locationManager;
	 } // .end method
	 private void createLocationListeners ( ) {
		 /* .locals 1 */
		 /* .prologue */
		 /* .line 93 */
		 /* new-instance v0, Lcom/jumptap/adtag/utils/JtLocation$1; */
		 /* invoke-direct {v0, p0}, Lcom/jumptap/adtag/utils/JtLocation$1;-><init>(Lcom/jumptap/adtag/utils/JtLocation;)V */
		 this.listenerCoarse = v0;
		 /* .line 109 */
		 return;
	 } // .end method
	 public static android.location.Location getCurrentLocation ( ) {
		 /* .locals 1 */
		 /* .prologue */
		 /* .line 116 */
		 v0 = com.jumptap.adtag.utils.JtLocation.currentLocation;
	 } // .end method
	 protected static com.jumptap.adtag.utils.JtLocation getInstance ( ) {
		 /* .locals 1 */
		 /* .prologue */
		 /* .line 29 */
		 v0 = com.jumptap.adtag.utils.JtLocation.jtLocationInstance;
		 /* if-nez v0, :cond_0 */
		 /* .line 30 */
		 /* new-instance v0, Lcom/jumptap/adtag/utils/JtLocation; */
		 /* invoke-direct {v0}, Lcom/jumptap/adtag/utils/JtLocation;-><init>()V */
		 /* .line 33 */
	 } // :cond_0
	 v0 = com.jumptap.adtag.utils.JtLocation.jtLocationInstance;
} // .end method
public static void init ( android.content.Context p0 ) {
	 /* .locals 1 */
	 /* .param p0, "context" # Landroid/content/Context; */
	 /* .prologue */
	 /* .line 37 */
	 v0 = com.jumptap.adtag.utils.JtLocation.locationManager;
	 /* if-nez v0, :cond_0 */
	 /* .line 38 */
	 com.jumptap.adtag.utils.JtLocation .getInstance ( );
	 /* invoke-direct {v0, p0}, Lcom/jumptap/adtag/utils/JtLocation;->registerLocationListeners(Landroid/content/Context;)V */
	 /* .line 40 */
} // :cond_0
return;
} // .end method
private void registerLocationListeners ( android.content.Context p0 ) {
/* .locals 9 */
/* .param p1, "context" # Landroid/content/Context; */
/* .prologue */
/* .line 46 */
try { // :try_start_0
	 final String v0 = "android.permission.ACCESS_COARSE_LOCATION"; // const-string v0, "android.permission.ACCESS_COARSE_LOCATION"
	 v7 = 	 (( android.content.Context ) p1 ).checkCallingOrSelfPermission ( v0 ); // invoke-virtual {p1, v0}, Landroid/content/Context;->checkCallingOrSelfPermission(Ljava/lang/String;)I
	 /* .line 48 */
	 /* .local v7, "isCoarseLocationPermissionGranted":I */
	 /* if-nez v7, :cond_1 */
	 /* .line 52 */
	 final String v0 = "location"; // const-string v0, "location"
	 (( android.content.Context ) p1 ).getSystemService ( v0 ); // invoke-virtual {p1, v0}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;
	 /* check-cast v0, Landroid/location/LocationManager; */
	 /* .line 57 */
	 v0 = com.jumptap.adtag.utils.JtLocation.locationManager;
	 final String v1 = "network"; // const-string v1, "network"
	 (( android.location.LocationManager ) v0 ).getLastKnownLocation ( v1 ); // invoke-virtual {v0, v1}, Landroid/location/LocationManager;->getLastKnownLocation(Ljava/lang/String;)Landroid/location/Location;
	 com.jumptap.adtag.utils.JtLocation .setCurrentLocation ( v0 );
	 /* .line 59 */
	 v0 = this.listenerCoarse;
	 /* if-nez v0, :cond_0 */
	 /* .line 60 */
	 /* invoke-direct {p0}, Lcom/jumptap/adtag/utils/JtLocation;->createLocationListeners()V */
	 /* .line 65 */
} // :cond_0
v0 = com.jumptap.adtag.utils.JtLocation.locationManager;
final String v1 = "network"; // const-string v1, "network"
/* const-wide/16 v2, 0x1f4 */
/* const/high16 v4, 0x447a0000 # 1000.0f */
v5 = this.listenerCoarse;
/* invoke-virtual/range {v0 ..v5}, Landroid/location/LocationManager;->requestLocationUpdates(Ljava/lang/String;JFLandroid/location/LocationListener;)V */
/* .line 86 */
} // .end local v7 # "isCoarseLocationPermissionGranted":I
} // :goto_0
return;
/* .line 70 */
/* .restart local v7 # "isCoarseLocationPermissionGranted":I */
} // :cond_1
final String v0 = "JtAd"; // const-string v0, "JtAd"
final String v1 = "Requires ACCESS_COARSE_LOCATION permission"; // const-string v1, "Requires ACCESS_COARSE_LOCATION permission"
android.util.Log .e ( v0,v1 );
/* :try_end_0 */
/* .catch Ljava/lang/SecurityException; {:try_start_0 ..:try_end_0} :catch_0 */
/* .catch Ljava/lang/IllegalArgumentException; {:try_start_0 ..:try_end_0} :catch_1 */
/* .line 73 */
} // .end local v7 # "isCoarseLocationPermissionGranted":I
/* :catch_0 */
/* move-exception v8 */
/* .line 74 */
/* .local v8, "secExp":Ljava/lang/SecurityException; */
final String v0 = "JtAd"; // const-string v0, "JtAd"
final String v1 = "Requires ACCESS_COARSE_LOCATION permission"; // const-string v1, "Requires ACCESS_COARSE_LOCATION permission"
android.util.Log .e ( v0,v1 );
/* .line 77 */
} // .end local v8 # "secExp":Ljava/lang/SecurityException;
/* :catch_1 */
/* move-exception v6 */
/* .line 80 */
/* .local v6, "illArg":Ljava/lang/IllegalArgumentException; */
final String v0 = "sdk"; // const-string v0, "sdk"
v1 = android.os.Build.MODEL;
v0 = (( java.lang.String ) v0 ).equals ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
if ( v0 != null) { // if-eqz v0, :cond_2
/* .line 81 */
final String v0 = "JtAd"; // const-string v0, "JtAd"
final String v1 = "Emulator is not sending location updates."; // const-string v1, "Emulator is not sending location updates."
android.util.Log .e ( v0,v1 );
/* .line 83 */
} // :cond_2
/* throw v6 */
} // .end method
private static void setCurrentLocation ( android.location.Location p0 ) {
/* .locals 0 */
/* .param p0, "currentLocation" # Landroid/location/Location; */
/* .prologue */
/* .line 112 */
/* .line 113 */
return;
} // .end method
