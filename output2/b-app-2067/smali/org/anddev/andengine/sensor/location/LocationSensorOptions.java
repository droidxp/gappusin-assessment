public class org.anddev.andengine.sensor.location.LocationSensorOptions extends android.location.Criteria {
	 /* # static fields */
	 private static final Long MINIMUMTRIGGERDISTANCE_DEFAULT;
	 private static final Long MINIMUMTRIGGERTIME_DEFAULT;
	 /* # instance fields */
	 private Boolean mEnabledOnly;
	 private Long mMinimumTriggerDistance;
	 private Long mMinimumTriggerTime;
	 /* # direct methods */
	 public org.anddev.andengine.sensor.location.LocationSensorOptions ( ) {
		 /* .locals 2 */
		 /* invoke-direct {p0}, Landroid/location/Criteria;-><init>()V */
		 int v0 = 1; // const/4 v0, 0x1
		 /* iput-boolean v0, p0, Lorg/anddev/andengine/sensor/location/LocationSensorOptions;->mEnabledOnly:Z */
		 /* const-wide/16 v0, 0x3e8 */
		 /* iput-wide v0, p0, Lorg/anddev/andengine/sensor/location/LocationSensorOptions;->mMinimumTriggerTime:J */
		 /* const-wide/16 v0, 0xa */
		 /* iput-wide v0, p0, Lorg/anddev/andengine/sensor/location/LocationSensorOptions;->mMinimumTriggerDistance:J */
		 return;
	 } // .end method
	 public org.anddev.andengine.sensor.location.LocationSensorOptions ( ) {
		 /* .locals 2 */
		 /* invoke-direct {p0}, Landroid/location/Criteria;-><init>()V */
		 int v0 = 1; // const/4 v0, 0x1
		 /* iput-boolean v0, p0, Lorg/anddev/andengine/sensor/location/LocationSensorOptions;->mEnabledOnly:Z */
		 /* const-wide/16 v0, 0x3e8 */
		 /* iput-wide v0, p0, Lorg/anddev/andengine/sensor/location/LocationSensorOptions;->mMinimumTriggerTime:J */
		 /* const-wide/16 v0, 0xa */
		 /* iput-wide v0, p0, Lorg/anddev/andengine/sensor/location/LocationSensorOptions;->mMinimumTriggerDistance:J */
		 /* iput-boolean p7, p0, Lorg/anddev/andengine/sensor/location/LocationSensorOptions;->mEnabledOnly:Z */
		 /* iput-wide p8, p0, Lorg/anddev/andengine/sensor/location/LocationSensorOptions;->mMinimumTriggerTime:J */
		 /* iput-wide p10, p0, Lorg/anddev/andengine/sensor/location/LocationSensorOptions;->mMinimumTriggerDistance:J */
		 (( org.anddev.andengine.sensor.location.LocationSensorOptions ) p0 ).setAccuracy ( p1 ); // invoke-virtual {p0, p1}, Lorg/anddev/andengine/sensor/location/LocationSensorOptions;->setAccuracy(I)V
		 (( org.anddev.andengine.sensor.location.LocationSensorOptions ) p0 ).setAltitudeRequired ( p2 ); // invoke-virtual {p0, p2}, Lorg/anddev/andengine/sensor/location/LocationSensorOptions;->setAltitudeRequired(Z)V
		 (( org.anddev.andengine.sensor.location.LocationSensorOptions ) p0 ).setBearingRequired ( p3 ); // invoke-virtual {p0, p3}, Lorg/anddev/andengine/sensor/location/LocationSensorOptions;->setBearingRequired(Z)V
		 (( org.anddev.andengine.sensor.location.LocationSensorOptions ) p0 ).setCostAllowed ( p4 ); // invoke-virtual {p0, p4}, Lorg/anddev/andengine/sensor/location/LocationSensorOptions;->setCostAllowed(Z)V
		 (( org.anddev.andengine.sensor.location.LocationSensorOptions ) p0 ).setPowerRequirement ( p5 ); // invoke-virtual {p0, p5}, Lorg/anddev/andengine/sensor/location/LocationSensorOptions;->setPowerRequirement(I)V
		 (( org.anddev.andengine.sensor.location.LocationSensorOptions ) p0 ).setSpeedRequired ( p6 ); // invoke-virtual {p0, p6}, Lorg/anddev/andengine/sensor/location/LocationSensorOptions;->setSpeedRequired(Z)V
		 return;
	 } // .end method
	 /* # virtual methods */
	 public Long getMinimumTriggerDistance ( ) {
		 /* .locals 2 */
		 /* iget-wide v0, p0, Lorg/anddev/andengine/sensor/location/LocationSensorOptions;->mMinimumTriggerDistance:J */
		 /* return-wide v0 */
	 } // .end method
	 public Long getMinimumTriggerTime ( ) {
		 /* .locals 2 */
		 /* iget-wide v0, p0, Lorg/anddev/andengine/sensor/location/LocationSensorOptions;->mMinimumTriggerTime:J */
		 /* return-wide v0 */
	 } // .end method
	 public Boolean isEnabledOnly ( ) {
		 /* .locals 1 */
		 /* iget-boolean v0, p0, Lorg/anddev/andengine/sensor/location/LocationSensorOptions;->mEnabledOnly:Z */
	 } // .end method
	 public void setEnabledOnly ( Boolean p0 ) {
		 /* .locals 0 */
		 /* iput-boolean p1, p0, Lorg/anddev/andengine/sensor/location/LocationSensorOptions;->mEnabledOnly:Z */
		 return;
	 } // .end method
	 public void setMinimumTriggerDistance ( Long p0 ) {
		 /* .locals 0 */
		 /* iput-wide p1, p0, Lorg/anddev/andengine/sensor/location/LocationSensorOptions;->mMinimumTriggerDistance:J */
		 return;
	 } // .end method
	 public void setMinimumTriggerTime ( Long p0 ) {
		 /* .locals 0 */
		 /* iput-wide p1, p0, Lorg/anddev/andengine/sensor/location/LocationSensorOptions;->mMinimumTriggerTime:J */
		 return;
	 } // .end method
