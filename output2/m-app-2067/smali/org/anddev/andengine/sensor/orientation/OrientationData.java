public class org.anddev.andengine.sensor.orientation.OrientationData extends org.anddev.andengine.sensor.BaseSensorData {
	 /* # instance fields */
	 private final mAccelerometerValues;
	 private Integer mMagneticFieldAccuracy;
	 private final mMagneticFieldValues;
	 private final mRotationMatrix;
	 /* # direct methods */
	 public org.anddev.andengine.sensor.orientation.OrientationData ( ) {
		 /* .locals 2 */
		 int v1 = 3; // const/4 v1, 0x3
		 /* invoke-direct {p0, v1, p1}, Lorg/anddev/andengine/sensor/BaseSensorData;-><init>(II)V */
		 /* new-array v0, v1, [F */
		 this.mAccelerometerValues = v0;
		 /* new-array v0, v1, [F */
		 this.mMagneticFieldValues = v0;
		 /* const/16 v0, 0x10 */
		 /* new-array v0, v0, [F */
		 this.mRotationMatrix = v0;
		 return;
	 } // .end method
	 private void updateOrientation ( ) {
		 /* .locals 4 */
		 v0 = this.mRotationMatrix;
		 int v1 = 0; // const/4 v1, 0x0
		 v2 = this.mAccelerometerValues;
		 v3 = this.mMagneticFieldValues;
		 android.hardware.SensorManager .getRotationMatrix ( v0,v1,v2,v3 );
		 /* iget v0, p0, Lorg/anddev/andengine/sensor/orientation/OrientationData;->mDisplayRotation:I */
		 /* packed-switch v0, :pswitch_data_0 */
	 } // :goto_0
	 /* :pswitch_0 */
	 v0 = this.mValues;
	 v1 = this.mRotationMatrix;
	 android.hardware.SensorManager .getOrientation ( v1,v0 );
	 /* array-length v1, v0 */
	 int v2 = 1; // const/4 v2, 0x1
	 /* sub-int/2addr v1, v2 */
} // :goto_1
/* if-gez v1, :cond_0 */
return;
/* :pswitch_1 */
v0 = this.mRotationMatrix;
int v1 = 2; // const/4 v1, 0x2
/* const/16 v2, 0x81 */
v3 = this.mRotationMatrix;
android.hardware.SensorManager .remapCoordinateSystem ( v0,v1,v2,v3 );
} // :cond_0
/* aget v2, v0, v1 */
/* const v3, 0x42652ee0 */
/* mul-float/2addr v2, v3 */
/* aput v2, v0, v1 */
/* add-int/lit8 v1, v1, -0x1 */
/* :pswitch_data_0 */
/* .packed-switch 0x0 */
/* :pswitch_0 */
/* :pswitch_1 */
} // .end packed-switch
} // .end method
/* # virtual methods */
public Integer getAccelerometerAccuracy ( ) {
/* .locals 1 */
v0 = (( org.anddev.andengine.sensor.orientation.OrientationData ) p0 ).getAccuracy ( ); // invoke-virtual {p0}, Lorg/anddev/andengine/sensor/orientation/OrientationData;->getAccuracy()I
} // .end method
public Integer getMagneticFieldAccuracy ( ) {
/* .locals 1 */
/* iget v0, p0, Lorg/anddev/andengine/sensor/orientation/OrientationData;->mMagneticFieldAccuracy:I */
} // .end method
public Float getPitch ( ) {
/* .locals 2 */
v0 = this.mValues;
int v1 = 1; // const/4 v1, 0x1
/* aget v0, v0, v1 */
} // .end method
public Float getRoll ( ) {
/* .locals 2 */
v0 = this.mValues;
int v1 = 2; // const/4 v1, 0x2
/* aget v0, v0, v1 */
} // .end method
public Float getYaw ( ) {
/* .locals 2 */
v0 = this.mValues;
int v1 = 0; // const/4 v1, 0x0
/* aget v0, v0, v1 */
} // .end method
public void setAccelerometerAccuracy ( Integer p0 ) {
/* .locals 0 */
/* invoke-super {p0, p1}, Lorg/anddev/andengine/sensor/BaseSensorData;->setAccuracy(I)V */
return;
} // .end method
public void setAccelerometerValues ( Float[] p0 ) {
/* .locals 3 */
int v2 = 0; // const/4 v2, 0x0
v0 = this.mAccelerometerValues;
/* array-length v1, p1 */
java.lang.System .arraycopy ( p1,v2,v0,v2,v1 );
/* invoke-direct {p0}, Lorg/anddev/andengine/sensor/orientation/OrientationData;->updateOrientation()V */
return;
} // .end method
public void setAccuracy ( Integer p0 ) {
/* .locals 0 */
/* invoke-super {p0, p1}, Lorg/anddev/andengine/sensor/BaseSensorData;->setAccuracy(I)V */
return;
} // .end method
public void setMagneticFieldAccuracy ( Integer p0 ) {
/* .locals 0 */
/* iput p1, p0, Lorg/anddev/andengine/sensor/orientation/OrientationData;->mMagneticFieldAccuracy:I */
return;
} // .end method
public void setMagneticFieldValues ( Float[] p0 ) {
/* .locals 3 */
int v2 = 0; // const/4 v2, 0x0
v0 = this.mMagneticFieldValues;
/* array-length v1, p1 */
java.lang.System .arraycopy ( p1,v2,v0,v2,v1 );
/* invoke-direct {p0}, Lorg/anddev/andengine/sensor/orientation/OrientationData;->updateOrientation()V */
return;
} // .end method
public void setValues ( Float[] p0 ) {
/* .locals 0 */
/* invoke-super {p0, p1}, Lorg/anddev/andengine/sensor/BaseSensorData;->setValues([F)V */
return;
} // .end method
public java.lang.String toString ( ) {
/* .locals 2 */
/* new-instance v0, Ljava/lang/StringBuilder; */
final String v1 = "Orientation: "; // const-string v1, "Orientation: "
/* invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V */
v1 = this.mValues;
java.util.Arrays .toString ( v1 );
(( java.lang.StringBuilder ) v0 ).append ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v0 ).toString ( ); // invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
} // .end method
