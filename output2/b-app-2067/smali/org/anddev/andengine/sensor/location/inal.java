public class inal extends java.lang.Enum {
	 /* # static fields */
	 public static final org.anddev.andengine.sensor.location.LocationProviderStatus AVAILABLE;
	 private static final org.anddev.andengine.sensor.location.LocationProviderStatus ENUM$VALUES; //synthetic
	 public static final org.anddev.andengine.sensor.location.LocationProviderStatus OUT_OF_SERVICE;
	 public static final org.anddev.andengine.sensor.location.LocationProviderStatus TEMPORARILY_UNAVAILABLE;
	 /* # direct methods */
	 static inal ( ) {
		 /* .locals 5 */
		 int v4 = 2; // const/4 v4, 0x2
		 int v3 = 1; // const/4 v3, 0x1
		 int v2 = 0; // const/4 v2, 0x0
		 /* new-instance v0, Lorg/anddev/andengine/sensor/location/LocationProviderStatus; */
		 final String v1 = "AVAILABLE"; // const-string v1, "AVAILABLE"
		 /* invoke-direct {v0, v1, v2}, Lorg/anddev/andengine/sensor/location/LocationProviderStatus;-><init>(Ljava/lang/String;I)V */
		 /* new-instance v0, Lorg/anddev/andengine/sensor/location/LocationProviderStatus; */
		 final String v1 = "OUT_OF_SERVICE"; // const-string v1, "OUT_OF_SERVICE"
		 /* invoke-direct {v0, v1, v3}, Lorg/anddev/andengine/sensor/location/LocationProviderStatus;-><init>(Ljava/lang/String;I)V */
		 /* new-instance v0, Lorg/anddev/andengine/sensor/location/LocationProviderStatus; */
		 final String v1 = "TEMPORARILY_UNAVAILABLE"; // const-string v1, "TEMPORARILY_UNAVAILABLE"
		 /* invoke-direct {v0, v1, v4}, Lorg/anddev/andengine/sensor/location/LocationProviderStatus;-><init>(Ljava/lang/String;I)V */
		 int v0 = 3; // const/4 v0, 0x3
		 /* new-array v0, v0, [Lorg/anddev/andengine/sensor/location/LocationProviderStatus; */
		 v1 = org.anddev.andengine.sensor.location.LocationProviderStatus.AVAILABLE;
		 /* aput-object v1, v0, v2 */
		 v1 = org.anddev.andengine.sensor.location.LocationProviderStatus.OUT_OF_SERVICE;
		 /* aput-object v1, v0, v3 */
		 v1 = org.anddev.andengine.sensor.location.LocationProviderStatus.TEMPORARILY_UNAVAILABLE;
		 /* aput-object v1, v0, v4 */
		 return;
	 } // .end method
	 private inal ( ) {
		 /* .locals 0 */
		 /* invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V */
		 return;
	 } // .end method
	 public static org.anddev.andengine.sensor.location.LocationProviderStatus valueOf ( java.lang.String p0 ) {
		 /* .locals 1 */
		 /* const-class v0, Lorg/anddev/andengine/sensor/location/LocationProviderStatus; */
		 java.lang.Enum .valueOf ( v0,p0 );
		 /* check-cast p0, Lorg/anddev/andengine/sensor/location/LocationProviderStatus; */
	 } // .end method
	 public static org.anddev.andengine.sensor.location.LocationProviderStatus values ( ) {
		 /* .locals 4 */
		 int v3 = 0; // const/4 v3, 0x0
		 v0 = org.anddev.andengine.sensor.location.LocationProviderStatus.ENUM$VALUES;
		 /* array-length v1, v0 */
		 /* new-array v2, v1, [Lorg/anddev/andengine/sensor/location/LocationProviderStatus; */
		 java.lang.System .arraycopy ( v0,v3,v2,v3,v1 );
	 } // .end method
