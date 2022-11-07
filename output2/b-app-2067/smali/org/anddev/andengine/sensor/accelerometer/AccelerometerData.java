public class org.anddev.andengine.sensor.accelerometer.AccelerometerData extends org.anddev.andengine.sensor.BaseSensorData {
	 /* # static fields */
	 private static final org.anddev.andengine.sensor.accelerometer.AccelerometerData$IAxisSwap AXISSWAPS;
	 /* # direct methods */
	 static org.anddev.andengine.sensor.accelerometer.AccelerometerData ( ) {
		 /* .locals 3 */
		 int v0 = 4; // const/4 v0, 0x4
		 /* new-array v0, v0, [Lorg/anddev/andengine/sensor/accelerometer/AccelerometerData$IAxisSwap; */
		 int v1 = 0; // const/4 v1, 0x0
		 /* new-instance v2, Lorg/anddev/andengine/sensor/accelerometer/AccelerometerData$1; */
		 /* invoke-direct {v2}, Lorg/anddev/andengine/sensor/accelerometer/AccelerometerData$1;-><init>()V */
		 /* aput-object v2, v0, v1 */
		 v0 = org.anddev.andengine.sensor.accelerometer.AccelerometerData.AXISSWAPS;
		 int v1 = 1; // const/4 v1, 0x1
		 /* new-instance v2, Lorg/anddev/andengine/sensor/accelerometer/AccelerometerData$2; */
		 /* invoke-direct {v2}, Lorg/anddev/andengine/sensor/accelerometer/AccelerometerData$2;-><init>()V */
		 /* aput-object v2, v0, v1 */
		 v0 = org.anddev.andengine.sensor.accelerometer.AccelerometerData.AXISSWAPS;
		 int v1 = 2; // const/4 v1, 0x2
		 /* new-instance v2, Lorg/anddev/andengine/sensor/accelerometer/AccelerometerData$3; */
		 /* invoke-direct {v2}, Lorg/anddev/andengine/sensor/accelerometer/AccelerometerData$3;-><init>()V */
		 /* aput-object v2, v0, v1 */
		 v0 = org.anddev.andengine.sensor.accelerometer.AccelerometerData.AXISSWAPS;
		 int v1 = 3; // const/4 v1, 0x3
		 /* new-instance v2, Lorg/anddev/andengine/sensor/accelerometer/AccelerometerData$4; */
		 /* invoke-direct {v2}, Lorg/anddev/andengine/sensor/accelerometer/AccelerometerData$4;-><init>()V */
		 /* aput-object v2, v0, v1 */
		 return;
	 } // .end method
	 public org.anddev.andengine.sensor.accelerometer.AccelerometerData ( ) {
		 /* .locals 1 */
		 int v0 = 3; // const/4 v0, 0x3
		 /* invoke-direct {p0, v0, p1}, Lorg/anddev/andengine/sensor/BaseSensorData;-><init>(II)V */
		 return;
	 } // .end method
	 /* # virtual methods */
	 public Float getX ( ) {
		 /* .locals 2 */
		 v0 = this.mValues;
		 int v1 = 0; // const/4 v1, 0x0
		 /* aget v0, v0, v1 */
	 } // .end method
	 public Float getY ( ) {
		 /* .locals 2 */
		 v0 = this.mValues;
		 int v1 = 1; // const/4 v1, 0x1
		 /* aget v0, v0, v1 */
	 } // .end method
	 public Float getZ ( ) {
		 /* .locals 2 */
		 v0 = this.mValues;
		 int v1 = 2; // const/4 v1, 0x2
		 /* aget v0, v0, v1 */
	 } // .end method
	 public void setValues ( Float[] p0 ) {
		 /* .locals 2 */
		 /* invoke-super {p0, p1}, Lorg/anddev/andengine/sensor/BaseSensorData;->setValues([F)V */
		 v0 = org.anddev.andengine.sensor.accelerometer.AccelerometerData.AXISSWAPS;
		 /* iget v1, p0, Lorg/anddev/andengine/sensor/accelerometer/AccelerometerData;->mDisplayRotation:I */
		 /* aget-object v0, v0, v1 */
		 v1 = this.mValues;
		 return;
	 } // .end method
	 public void setX ( Float p0 ) {
		 /* .locals 2 */
		 v0 = this.mValues;
		 int v1 = 0; // const/4 v1, 0x0
		 /* aput p1, v0, v1 */
		 return;
	 } // .end method
	 public void setY ( Float p0 ) {
		 /* .locals 2 */
		 v0 = this.mValues;
		 int v1 = 1; // const/4 v1, 0x1
		 /* aput p1, v0, v1 */
		 return;
	 } // .end method
	 public void setZ ( Float p0 ) {
		 /* .locals 2 */
		 v0 = this.mValues;
		 int v1 = 2; // const/4 v1, 0x2
		 /* aput p1, v0, v1 */
		 return;
	 } // .end method
	 public java.lang.String toString ( ) {
		 /* .locals 2 */
		 /* new-instance v0, Ljava/lang/StringBuilder; */
		 final String v1 = "Accelerometer: "; // const-string v1, "Accelerometer: "
		 /* invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V */
		 v1 = this.mValues;
		 java.util.Arrays .toString ( v1 );
		 (( java.lang.StringBuilder ) v0 ).append ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
		 (( java.lang.StringBuilder ) v0 ).toString ( ); // invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
	 } // .end method
