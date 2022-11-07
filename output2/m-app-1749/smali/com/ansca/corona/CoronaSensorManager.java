class com.ansca.corona.CoronaSensorManager {
	 /* .source "CoronaSensorManager.java" */
	 /* # annotations */
	 /* .annotation system Ldalvik/annotation/MemberClasses; */
	 /* value = { */
	 /* Lcom/ansca/corona/CoronaSensorManager$CoronaLocationListener;, */
	 /* Lcom/ansca/corona/CoronaSensorManager$GyroscopeMonitor;, */
	 /* Lcom/ansca/corona/CoronaSensorManager$AccelerometerMonitor;, */
	 /* Lcom/ansca/corona/CoronaSensorManager$SensorMonitor;, */
	 /* Lcom/ansca/corona/CoronaSensorManager$SensorMeasurement; */
	 /* } */
} // .end annotation
/* # instance fields */
private com.ansca.corona.CoronaSensorManager$AccelerometerMonitor myAccelerometerMonitor;
private myActiveSensors;
private com.ansca.corona.CoronaSensorManager$GyroscopeMonitor myGyroscopeMonitor;
private Float myLastHeading;
private com.ansca.corona.CoronaSensorManager$CoronaLocationListener myLocationListener;
private android.location.LocationManager myLocationManager;
private Double myLocationThreshold;
private android.hardware.Sensor myOrientationSensor;
private android.hardware.SensorEventListener myOrientationSensorListener;
private android.hardware.SensorManager mySensorManager;
/* # direct methods */
 com.ansca.corona.CoronaSensorManager ( ) {
	 /* .locals 2 */
	 /* .prologue */
	 /* .line 36 */
	 /* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
	 /* .line 19 */
	 int v0 = 6; // const/4 v0, 0x6
	 /* new-array v0, v0, [Z */
	 this.myActiveSensors = v0;
	 /* .line 30 */
	 /* const-wide/16 v0, 0x0 */
	 /* iput-wide v0, p0, Lcom/ansca/corona/CoronaSensorManager;->myLocationThreshold:D */
	 /* .line 31 */
	 /* const/high16 v0, -0x40800000 # -1.0f */
	 /* iput v0, p0, Lcom/ansca/corona/CoronaSensorManager;->myLastHeading:F */
	 /* .line 37 */
	 return;
} // .end method
static com.ansca.corona.CoronaSensorManager$AccelerometerMonitor access$000 ( com.ansca.corona.CoronaSensorManager p0 ) { //synthethic
	 /* .locals 1 */
	 /* .param p0, "x0" # Lcom/ansca/corona/CoronaSensorManager; */
	 /* .prologue */
	 /* .line 15 */
	 v0 = this.myAccelerometerMonitor;
} // .end method
static com.ansca.corona.CoronaSensorManager$GyroscopeMonitor access$100 ( com.ansca.corona.CoronaSensorManager p0 ) { //synthethic
	 /* .locals 1 */
	 /* .param p0, "x0" # Lcom/ansca/corona/CoronaSensorManager; */
	 /* .prologue */
	 /* .line 15 */
	 v0 = this.myGyroscopeMonitor;
} // .end method
static android.hardware.Sensor access$200 ( com.ansca.corona.CoronaSensorManager p0 ) { //synthethic
	 /* .locals 1 */
	 /* .param p0, "x0" # Lcom/ansca/corona/CoronaSensorManager; */
	 /* .prologue */
	 /* .line 15 */
	 v0 = this.myOrientationSensor;
} // .end method
static android.hardware.Sensor access$202 ( com.ansca.corona.CoronaSensorManager p0, android.hardware.Sensor p1 ) { //synthethic
	 /* .locals 0 */
	 /* .param p0, "x0" # Lcom/ansca/corona/CoronaSensorManager; */
	 /* .param p1, "x1" # Landroid/hardware/Sensor; */
	 /* .prologue */
	 /* .line 15 */
	 this.myOrientationSensor = p1;
} // .end method
static android.hardware.SensorManager access$300 ( com.ansca.corona.CoronaSensorManager p0 ) { //synthethic
	 /* .locals 1 */
	 /* .param p0, "x0" # Lcom/ansca/corona/CoronaSensorManager; */
	 /* .prologue */
	 /* .line 15 */
	 v0 = this.mySensorManager;
} // .end method
static android.hardware.SensorEventListener access$400 ( com.ansca.corona.CoronaSensorManager p0 ) { //synthethic
	 /* .locals 1 */
	 /* .param p0, "x0" # Lcom/ansca/corona/CoronaSensorManager; */
	 /* .prologue */
	 /* .line 15 */
	 v0 = this.myOrientationSensorListener;
} // .end method
static android.hardware.SensorEventListener access$402 ( com.ansca.corona.CoronaSensorManager p0, android.hardware.SensorEventListener p1 ) { //synthethic
	 /* .locals 0 */
	 /* .param p0, "x0" # Lcom/ansca/corona/CoronaSensorManager; */
	 /* .param p1, "x1" # Landroid/hardware/SensorEventListener; */
	 /* .prologue */
	 /* .line 15 */
	 this.myOrientationSensorListener = p1;
} // .end method
static Float access$500 ( com.ansca.corona.CoronaSensorManager p0 ) { //synthethic
	 /* .locals 1 */
	 /* .param p0, "x0" # Lcom/ansca/corona/CoronaSensorManager; */
	 /* .prologue */
	 /* .line 15 */
	 /* iget v0, p0, Lcom/ansca/corona/CoronaSensorManager;->myLastHeading:F */
} // .end method
static Float access$502 ( com.ansca.corona.CoronaSensorManager p0, Float p1 ) { //synthethic
	 /* .locals 0 */
	 /* .param p0, "x0" # Lcom/ansca/corona/CoronaSensorManager; */
	 /* .param p1, "x1" # F */
	 /* .prologue */
	 /* .line 15 */
	 /* iput p1, p0, Lcom/ansca/corona/CoronaSensorManager;->myLastHeading:F */
} // .end method
static com.ansca.corona.CoronaSensorManager$CoronaLocationListener access$600 ( com.ansca.corona.CoronaSensorManager p0 ) { //synthethic
	 /* .locals 1 */
	 /* .param p0, "x0" # Lcom/ansca/corona/CoronaSensorManager; */
	 /* .prologue */
	 /* .line 15 */
	 v0 = this.myLocationListener;
} // .end method
static com.ansca.corona.CoronaSensorManager$CoronaLocationListener access$602 ( com.ansca.corona.CoronaSensorManager p0, com.ansca.corona.CoronaSensorManager$CoronaLocationListener p1 ) { //synthethic
	 /* .locals 0 */
	 /* .param p0, "x0" # Lcom/ansca/corona/CoronaSensorManager; */
	 /* .param p1, "x1" # Lcom/ansca/corona/CoronaSensorManager$CoronaLocationListener; */
	 /* .prologue */
	 /* .line 15 */
	 this.myLocationListener = p1;
} // .end method
static Double access$800 ( com.ansca.corona.CoronaSensorManager p0 ) { //synthethic
	 /* .locals 2 */
	 /* .param p0, "x0" # Lcom/ansca/corona/CoronaSensorManager; */
	 /* .prologue */
	 /* .line 15 */
	 /* iget-wide v0, p0, Lcom/ansca/corona/CoronaSensorManager;->myLocationThreshold:D */
	 /* return-wide v0 */
} // .end method
static android.location.LocationManager access$900 ( com.ansca.corona.CoronaSensorManager p0 ) { //synthethic
	 /* .locals 1 */
	 /* .param p0, "x0" # Lcom/ansca/corona/CoronaSensorManager; */
	 /* .prologue */
	 /* .line 15 */
	 v0 = this.myLocationManager;
} // .end method
public static Integer compareSensorTimestamps ( Long p0, Long p1 ) {
	 /* .locals 6 */
	 /* .param p0, "x" # J */
	 /* .param p2, "y" # J */
	 /* .prologue */
	 /* const-wide/16 v4, 0x0 */
	 /* .line 945 */
	 /* const-wide/high16 v2, -0x8000000000000000L */
	 /* cmp-long v2, p2, v2 */
	 /* if-nez v2, :cond_0 */
	 /* .line 946 */
	 /* const-wide/16 v2, 0x1 */
	 /* add-long/2addr p2, v2 */
	 /* .line 950 */
} // :cond_0
/* sub-long v0, p0, p2 */
/* .line 951 */
/* .local v0, "deltaTime":J */
/* cmp-long v2, v0, v4 */
/* if-gez v2, :cond_1 */
/* .line 952 */
int v2 = -1; // const/4 v2, -0x1
/* .line 957 */
} // :goto_0
/* .line 954 */
} // :cond_1
/* cmp-long v2, v0, v4 */
/* if-nez v2, :cond_2 */
/* .line 955 */
int v2 = 0; // const/4 v2, 0x0
/* .line 957 */
} // :cond_2
int v2 = 1; // const/4 v2, 0x1
} // .end method
private void startType ( Integer p0 ) {
/* .locals 2 */
/* .param p1, "eventType" # I */
/* .prologue */
/* .line 76 */
v0 = this.mySensorManager;
if ( v0 != null) { // if-eqz v0, :cond_0
v0 = com.ansca.corona.Controller .isValid ( );
/* if-nez v0, :cond_1 */
/* .line 184 */
} // :cond_0
} // :goto_0
return;
/* .line 80 */
} // :cond_1
com.ansca.corona.Controller .getActivity ( );
(( com.ansca.corona.CoronaActivity ) v0 ).getHandler ( ); // invoke-virtual {v0}, Lcom/ansca/corona/CoronaActivity;->getHandler()Landroid/os/Handler;
/* new-instance v1, Lcom/ansca/corona/CoronaSensorManager$1; */
/* invoke-direct {v1, p0, p1}, Lcom/ansca/corona/CoronaSensorManager$1;-><init>(Lcom/ansca/corona/CoronaSensorManager;I)V */
(( android.os.Handler ) v0 ).post ( v1 ); // invoke-virtual {v0, v1}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z
} // .end method
private void stopType ( Integer p0 ) {
/* .locals 2 */
/* .param p1, "eventType" # I */
/* .prologue */
/* .line 762 */
v0 = com.ansca.corona.Controller .isValid ( );
/* if-nez v0, :cond_0 */
/* .line 799 */
} // :goto_0
return;
/* .line 766 */
} // :cond_0
com.ansca.corona.Controller .getActivity ( );
(( com.ansca.corona.CoronaActivity ) v0 ).getHandler ( ); // invoke-virtual {v0}, Lcom/ansca/corona/CoronaActivity;->getHandler()Landroid/os/Handler;
/* new-instance v1, Lcom/ansca/corona/CoronaSensorManager$2; */
/* invoke-direct {v1, p0, p1}, Lcom/ansca/corona/CoronaSensorManager$2;-><init>(Lcom/ansca/corona/CoronaSensorManager;I)V */
(( android.os.Handler ) v0 ).post ( v1 ); // invoke-virtual {v0, v1}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z
} // .end method
public static Long subtractSensorTimestamps ( Long p0, Long p1 ) {
/* .locals 2 */
/* .param p0, "x" # J */
/* .param p2, "y" # J */
/* .prologue */
/* .line 968 */
/* const-wide/high16 v0, -0x8000000000000000L */
/* cmp-long v0, p2, v0 */
/* if-nez v0, :cond_0 */
/* .line 969 */
/* const-wide/16 v0, 0x1 */
/* add-long/2addr p2, v0 */
/* .line 973 */
} // :cond_0
/* sub-long v0, p0, p2 */
/* return-wide v0 */
} // .end method
/* # virtual methods */
public Boolean hasAccelerometer ( ) {
/* .locals 3 */
/* .prologue */
int v1 = 1; // const/4 v1, 0x1
/* .line 873 */
int v0 = 0; // const/4 v0, 0x0
/* .line 875 */
/* .local v0, "hasSensor":Z */
v2 = this.mySensorManager;
if ( v2 != null) { // if-eqz v2, :cond_0
/* .line 877 */
v2 = this.mySensorManager;
v2 = (( android.hardware.SensorManager ) v2 ).getSensorList ( v1 ); // invoke-virtual {v2, v1}, Landroid/hardware/SensorManager;->getSensorList(I)Ljava/util/List;
/* if-lez v2, :cond_1 */
/* move v0, v1 */
/* .line 879 */
} // :cond_0
} // :goto_0
/* .line 877 */
} // :cond_1
int v0 = 0; // const/4 v0, 0x0
} // .end method
public Boolean hasGyroscope ( ) {
/* .locals 3 */
/* .prologue */
/* .line 888 */
int v0 = 0; // const/4 v0, 0x0
/* .line 890 */
/* .local v0, "hasSensor":Z */
v1 = this.mySensorManager;
if ( v1 != null) { // if-eqz v1, :cond_0
/* .line 892 */
v1 = this.mySensorManager;
int v2 = 4; // const/4 v2, 0x4
v1 = (( android.hardware.SensorManager ) v1 ).getSensorList ( v2 ); // invoke-virtual {v1, v2}, Landroid/hardware/SensorManager;->getSensorList(I)Ljava/util/List;
/* if-lez v1, :cond_1 */
int v0 = 1; // const/4 v0, 0x1
/* .line 894 */
} // :cond_0
} // :goto_0
/* .line 892 */
} // :cond_1
int v0 = 0; // const/4 v0, 0x0
} // .end method
public void init ( ) {
/* .locals 3 */
/* .prologue */
/* .line 43 */
v1 = com.ansca.corona.Controller .isValid ( );
/* if-nez v1, :cond_1 */
/* .line 54 */
} // :cond_0
return;
/* .line 47 */
} // :cond_1
com.ansca.corona.Controller .getActivity ( );
final String v2 = "sensor"; // const-string v2, "sensor"
(( com.ansca.corona.CoronaActivity ) v1 ).getSystemService ( v2 ); // invoke-virtual {v1, v2}, Lcom/ansca/corona/CoronaActivity;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;
/* check-cast v1, Landroid/hardware/SensorManager; */
this.mySensorManager = v1;
/* .line 48 */
com.ansca.corona.Controller .getActivity ( );
final String v2 = "location"; // const-string v2, "location"
(( com.ansca.corona.CoronaActivity ) v1 ).getSystemService ( v2 ); // invoke-virtual {v1, v2}, Lcom/ansca/corona/CoronaActivity;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;
/* check-cast v1, Landroid/location/LocationManager; */
this.myLocationManager = v1;
/* .line 49 */
/* new-instance v1, Lcom/ansca/corona/CoronaSensorManager$AccelerometerMonitor; */
/* invoke-direct {v1, p0}, Lcom/ansca/corona/CoronaSensorManager$AccelerometerMonitor;-><init>(Lcom/ansca/corona/CoronaSensorManager;)V */
this.myAccelerometerMonitor = v1;
/* .line 50 */
/* new-instance v1, Lcom/ansca/corona/CoronaSensorManager$GyroscopeMonitor; */
/* invoke-direct {v1, p0}, Lcom/ansca/corona/CoronaSensorManager$GyroscopeMonitor;-><init>(Lcom/ansca/corona/CoronaSensorManager;)V */
this.myGyroscopeMonitor = v1;
/* .line 52 */
int v0 = 0; // const/4 v0, 0x0
/* .local v0, "i":I */
} // :goto_0
v1 = this.myActiveSensors;
/* array-length v1, v1 */
/* if-ge v0, v1, :cond_0 */
/* .line 53 */
v1 = this.myActiveSensors;
int v2 = 0; // const/4 v2, 0x0
/* aput-boolean v2, v1, v0 */
/* .line 52 */
/* add-int/lit8 v0, v0, 0x1 */
} // .end method
public Boolean isActive ( Integer p0 ) {
/* .locals 1 */
/* .param p1, "eventType" # I */
/* .prologue */
/* .line 809 */
v0 = this.myActiveSensors;
/* aget-boolean v0, v0, p1 */
} // .end method
public void pause ( ) {
/* .locals 2 */
/* .prologue */
/* .line 901 */
int v0 = 0; // const/4 v0, 0x0
/* .local v0, "i":I */
} // :goto_0
int v1 = 6; // const/4 v1, 0x6
/* if-ge v0, v1, :cond_0 */
/* .line 902 */
/* invoke-direct {p0, v0}, Lcom/ansca/corona/CoronaSensorManager;->stopType(I)V */
/* .line 901 */
/* add-int/lit8 v0, v0, 0x1 */
/* .line 904 */
} // :cond_0
return;
} // .end method
public void resume ( ) {
/* .locals 2 */
/* .prologue */
/* .line 910 */
int v0 = 0; // const/4 v0, 0x0
/* .local v0, "i":I */
} // :goto_0
int v1 = 6; // const/4 v1, 0x6
/* if-ge v0, v1, :cond_1 */
/* .line 911 */
v1 = this.myActiveSensors;
/* aget-boolean v1, v1, v0 */
if ( v1 != null) { // if-eqz v1, :cond_0
/* .line 912 */
/* invoke-direct {p0, v0}, Lcom/ansca/corona/CoronaSensorManager;->startType(I)V */
/* .line 910 */
} // :cond_0
/* add-int/lit8 v0, v0, 0x1 */
/* .line 914 */
} // :cond_1
return;
} // .end method
public void setAccelerometerInterval ( Integer p0 ) {
/* .locals 1 */
/* .param p1, "frequency" # I */
/* .prologue */
/* .line 855 */
v0 = this.myAccelerometerMonitor;
(( com.ansca.corona.CoronaSensorManager$AccelerometerMonitor ) v0 ).setIntervalInHertz ( p1 ); // invoke-virtual {v0, p1}, Lcom/ansca/corona/CoronaSensorManager$AccelerometerMonitor;->setIntervalInHertz(I)V
/* .line 856 */
return;
} // .end method
public void setEventNotification ( Integer p0, Boolean p1 ) {
/* .locals 0 */
/* .param p1, "eventType" # I */
/* .param p2, "enable" # Z */
/* .prologue */
/* .line 63 */
if ( p2 != null) { // if-eqz p2, :cond_0
/* .line 64 */
(( com.ansca.corona.CoronaSensorManager ) p0 ).start ( p1 ); // invoke-virtual {p0, p1}, Lcom/ansca/corona/CoronaSensorManager;->start(I)V
/* .line 67 */
} // :goto_0
return;
/* .line 66 */
} // :cond_0
(( com.ansca.corona.CoronaSensorManager ) p0 ).stop ( p1 ); // invoke-virtual {p0, p1}, Lcom/ansca/corona/CoronaSensorManager;->stop(I)V
} // .end method
public void setGyroscopeInterval ( Integer p0 ) {
/* .locals 1 */
/* .param p1, "frequency" # I */
/* .prologue */
/* .line 864 */
v0 = this.myGyroscopeMonitor;
(( com.ansca.corona.CoronaSensorManager$GyroscopeMonitor ) v0 ).setIntervalInHertz ( p1 ); // invoke-virtual {v0, p1}, Lcom/ansca/corona/CoronaSensorManager$GyroscopeMonitor;->setIntervalInHertz(I)V
/* .line 865 */
return;
} // .end method
public void setLocationAccuracy ( Double p0 ) {
/* .locals 0 */
/* .param p1, "meters" # D */
/* .prologue */
/* .line 923 */
return;
} // .end method
public void setLocationThreshold ( Double p0 ) {
/* .locals 0 */
/* .param p1, "meters" # D */
/* .prologue */
/* .line 931 */
/* iput-wide p1, p0, Lcom/ansca/corona/CoronaSensorManager;->myLocationThreshold:D */
/* .line 932 */
return;
} // .end method
public void start ( Integer p0 ) {
/* .locals 2 */
/* .param p1, "eventType" # I */
/* .prologue */
int v1 = 1; // const/4 v1, 0x1
/* .line 818 */
v0 = this.myActiveSensors;
/* aget-boolean v0, v0, p1 */
/* if-ne v0, v1, :cond_0 */
/* .line 824 */
} // :goto_0
return;
/* .line 821 */
} // :cond_0
/* invoke-direct {p0, p1}, Lcom/ansca/corona/CoronaSensorManager;->startType(I)V */
/* .line 823 */
v0 = this.myActiveSensors;
/* aput-boolean v1, v0, p1 */
} // .end method
public void stop ( ) {
/* .locals 2 */
/* .prologue */
/* .line 844 */
int v0 = 0; // const/4 v0, 0x0
/* .local v0, "i":I */
} // :goto_0
int v1 = 6; // const/4 v1, 0x6
/* if-ge v0, v1, :cond_0 */
/* .line 845 */
(( com.ansca.corona.CoronaSensorManager ) p0 ).stop ( v0 ); // invoke-virtual {p0, v0}, Lcom/ansca/corona/CoronaSensorManager;->stop(I)V
/* .line 844 */
/* add-int/lit8 v0, v0, 0x1 */
/* .line 847 */
} // :cond_0
return;
} // .end method
public void stop ( Integer p0 ) {
/* .locals 2 */
/* .param p1, "eventType" # I */
/* .prologue */
/* .line 832 */
v0 = this.myActiveSensors;
/* aget-boolean v0, v0, p1 */
/* if-nez v0, :cond_0 */
/* .line 838 */
} // :goto_0
return;
/* .line 835 */
} // :cond_0
/* invoke-direct {p0, p1}, Lcom/ansca/corona/CoronaSensorManager;->stopType(I)V */
/* .line 837 */
v0 = this.myActiveSensors;
int v1 = 0; // const/4 v1, 0x0
/* aput-boolean v1, v0, p1 */
} // .end method
