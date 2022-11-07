public class org.anddev.andengine.sensor.BaseSensorData {
	 /* # instance fields */
	 protected Integer mAccuracy;
	 protected Integer mDisplayRotation;
	 protected final mValues;
	 /* # direct methods */
	 public org.anddev.andengine.sensor.BaseSensorData ( ) {
		 /* .locals 1 */
		 /* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
		 /* new-array v0, p1, [F */
		 this.mValues = v0;
		 /* iput p2, p0, Lorg/anddev/andengine/sensor/BaseSensorData;->mDisplayRotation:I */
		 return;
	 } // .end method
	 /* # virtual methods */
	 public Integer getAccuracy ( ) {
		 /* .locals 1 */
		 /* iget v0, p0, Lorg/anddev/andengine/sensor/BaseSensorData;->mAccuracy:I */
	 } // .end method
	 public getValues ( ) {
		 /* .locals 1 */
		 v0 = this.mValues;
	 } // .end method
	 public void setAccuracy ( Integer p0 ) {
		 /* .locals 0 */
		 /* iput p1, p0, Lorg/anddev/andengine/sensor/BaseSensorData;->mAccuracy:I */
		 return;
	 } // .end method
	 public void setValues ( Float[] p0 ) {
		 /* .locals 3 */
		 int v2 = 0; // const/4 v2, 0x0
		 v0 = this.mValues;
		 /* array-length v1, p1 */
		 java.lang.System .arraycopy ( p1,v2,v0,v2,v1 );
		 return;
	 } // .end method
	 public java.lang.String toString ( ) {
		 /* .locals 2 */
		 /* new-instance v0, Ljava/lang/StringBuilder; */
		 final String v1 = "Values: "; // const-string v1, "Values: "
		 /* invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V */
		 v1 = this.mValues;
		 java.util.Arrays .toString ( v1 );
		 (( java.lang.StringBuilder ) v0 ).append ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
		 (( java.lang.StringBuilder ) v0 ).toString ( ); // invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
	 } // .end method
