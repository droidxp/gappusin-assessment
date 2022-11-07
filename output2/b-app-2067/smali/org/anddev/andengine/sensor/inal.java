public class inal extends java.lang.Enum {
	 /* # static fields */
	 private static final org.anddev.andengine.sensor.SensorDelay ENUM$VALUES; //synthetic
	 public static final org.anddev.andengine.sensor.SensorDelay FASTEST;
	 public static final org.anddev.andengine.sensor.SensorDelay GAME;
	 public static final org.anddev.andengine.sensor.SensorDelay NORMAL;
	 public static final org.anddev.andengine.sensor.SensorDelay UI;
	 /* # instance fields */
	 private final Integer mDelay;
	 /* # direct methods */
	 static inal ( ) {
		 /* .locals 6 */
		 int v5 = 3; // const/4 v5, 0x3
		 int v4 = 2; // const/4 v4, 0x2
		 int v3 = 1; // const/4 v3, 0x1
		 int v2 = 0; // const/4 v2, 0x0
		 /* new-instance v0, Lorg/anddev/andengine/sensor/SensorDelay; */
		 final String v1 = "NORMAL"; // const-string v1, "NORMAL"
		 /* invoke-direct {v0, v1, v2, v5}, Lorg/anddev/andengine/sensor/SensorDelay;-><init>(Ljava/lang/String;II)V */
		 /* new-instance v0, Lorg/anddev/andengine/sensor/SensorDelay; */
		 final String v1 = "UI"; // const-string v1, "UI"
		 /* invoke-direct {v0, v1, v3, v4}, Lorg/anddev/andengine/sensor/SensorDelay;-><init>(Ljava/lang/String;II)V */
		 /* new-instance v0, Lorg/anddev/andengine/sensor/SensorDelay; */
		 final String v1 = "GAME"; // const-string v1, "GAME"
		 /* invoke-direct {v0, v1, v4, v3}, Lorg/anddev/andengine/sensor/SensorDelay;-><init>(Ljava/lang/String;II)V */
		 /* new-instance v0, Lorg/anddev/andengine/sensor/SensorDelay; */
		 final String v1 = "FASTEST"; // const-string v1, "FASTEST"
		 /* invoke-direct {v0, v1, v5, v2}, Lorg/anddev/andengine/sensor/SensorDelay;-><init>(Ljava/lang/String;II)V */
		 int v0 = 4; // const/4 v0, 0x4
		 /* new-array v0, v0, [Lorg/anddev/andengine/sensor/SensorDelay; */
		 v1 = org.anddev.andengine.sensor.SensorDelay.NORMAL;
		 /* aput-object v1, v0, v2 */
		 v1 = org.anddev.andengine.sensor.SensorDelay.UI;
		 /* aput-object v1, v0, v3 */
		 v1 = org.anddev.andengine.sensor.SensorDelay.GAME;
		 /* aput-object v1, v0, v4 */
		 v1 = org.anddev.andengine.sensor.SensorDelay.FASTEST;
		 /* aput-object v1, v0, v5 */
		 return;
	 } // .end method
	 private inal ( ) {
		 /* .locals 0 */
		 /* invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V */
		 /* iput p3, p0, Lorg/anddev/andengine/sensor/SensorDelay;->mDelay:I */
		 return;
	 } // .end method
	 public static org.anddev.andengine.sensor.SensorDelay valueOf ( java.lang.String p0 ) {
		 /* .locals 1 */
		 /* const-class v0, Lorg/anddev/andengine/sensor/SensorDelay; */
		 java.lang.Enum .valueOf ( v0,p0 );
		 /* check-cast p0, Lorg/anddev/andengine/sensor/SensorDelay; */
	 } // .end method
	 public static org.anddev.andengine.sensor.SensorDelay values ( ) {
		 /* .locals 4 */
		 int v3 = 0; // const/4 v3, 0x0
		 v0 = org.anddev.andengine.sensor.SensorDelay.ENUM$VALUES;
		 /* array-length v1, v0 */
		 /* new-array v2, v1, [Lorg/anddev/andengine/sensor/SensorDelay; */
		 java.lang.System .arraycopy ( v0,v3,v2,v3,v1 );
	 } // .end method
	 /* # virtual methods */
	 public final Integer getDelay ( ) {
		 /* .locals 1 */
		 /* iget v0, p0, Lorg/anddev/andengine/sensor/SensorDelay;->mDelay:I */
	 } // .end method
