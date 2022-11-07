class com.wiyun.engine.nodes.f {
	 /* .source "_A.java" */
	 /* # static fields */
	 private static android.content.Context a;
	 private static java.lang.ref.WeakReference b;
	 /* .annotation system Ldalvik/annotation/Signature; */
	 /* value = { */
	 /* "Ljava/lang/ref/WeakReference", */
	 /* "<", */
	 /* "Landroid/app/Activity;", */
	 /* ">;" */
	 /* } */
} // .end annotation
} // .end field
private static java.lang.String c;
private static java.lang.String d;
private static android.location.Location e;
private static java.lang.String f;
private static java.lang.String g;
private static java.lang.String h;
private static Integer i;
private static java.lang.String j;
private static java.lang.String k;
private static java.lang.String l;
private static java.lang.String m;
private static java.lang.String n;
private static java.lang.String o;
private static java.lang.String p;
private static Integer q;
private static Integer r;
private static Integer s;
private static Integer t;
private static Integer u;
/* # direct methods */
static com.wiyun.engine.nodes.f ( ) {
/* .locals 1 */
/* .prologue */
/* .line 1004 */
int v0 = -1; // const/4 v0, -0x1
/* .line 1009 */
final String v0 = ""; // const-string v0, ""
/* .line 1014 */
final String v0 = ""; // const-string v0, ""
/* .line 1019 */
final String v0 = ""; // const-string v0, ""
/* .line 925 */
return;
} // .end method
 com.wiyun.engine.nodes.f ( ) {
/* .locals 0 */
/* .prologue */
/* .line 925 */
/* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
return;
} // .end method
private static void A ( ) {
/* .locals 3 */
/* .prologue */
/* .line 1271 */
v0 = com.wiyun.engine.nodes.f.f;
/* if-nez v0, :cond_0 */
/* .line 1273 */
int v1 = 1; // const/4 v1, 0x1
/* if-ne v0, v1, :cond_1 */
/* .line 1274 */
final String v0 = "000000000000000"; // const-string v0, "000000000000000"
/* .line 1298 */
} // :cond_0
} // :goto_0
return;
/* .line 1277 */
} // :cond_1
v0 = com.wiyun.engine.nodes.f.a;
/* .line 1278 */
if ( v0 != null) { // if-eqz v0, :cond_0
/* .line 1279 */
final String v1 = "android.permission.READ_PHONE_STATE"; // const-string v1, "android.permission.READ_PHONE_STATE"
v1 = (( android.content.Context ) v0 ).checkCallingOrSelfPermission ( v1 ); // invoke-virtual {v0, v1}, Landroid/content/Context;->checkCallingOrSelfPermission(Ljava/lang/String;)I
int v2 = -1; // const/4 v2, -0x1
/* if-eq v1, v2, :cond_0 */
/* .line 1282 */
final String v1 = "phone"; // const-string v1, "phone"
(( android.content.Context ) v0 ).getSystemService ( v1 ); // invoke-virtual {v0, v1}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;
/* check-cast v0, Landroid/telephony/TelephonyManager; */
/* .line 1284 */
if ( v0 != null) { // if-eqz v0, :cond_2
/* .line 1285 */
(( android.telephony.TelephonyManager ) v0 ).getDeviceId ( ); // invoke-virtual {v0}, Landroid/telephony/TelephonyManager;->getDeviceId()Ljava/lang/String;
/* .line 1288 */
v0 = com.wiyun.engine.nodes.f.f;
v0 = com.wiyun.engine.nodes.f .a ( v0 );
/* if-nez v0, :cond_0 */
/* .line 1289 */
com.wiyun.engine.nodes.f .i ( );
/* .line 1293 */
} // :cond_2
com.wiyun.engine.nodes.f .i ( );
} // .end method
private static void B ( ) {
/* .locals 3 */
/* .prologue */
/* .line 1301 */
v0 = com.wiyun.engine.nodes.f.g;
v0 = android.text.TextUtils .isEmpty ( v0 );
if ( v0 != null) { // if-eqz v0, :cond_0
/* .line 1303 */
v0 = com.wiyun.engine.nodes.f.a;
/* .line 1304 */
if ( v0 != null) { // if-eqz v0, :cond_0
/* .line 1305 */
final String v1 = "android.permission.READ_PHONE_STATE"; // const-string v1, "android.permission.READ_PHONE_STATE"
v1 = (( android.content.Context ) v0 ).checkCallingOrSelfPermission ( v1 ); // invoke-virtual {v0, v1}, Landroid/content/Context;->checkCallingOrSelfPermission(Ljava/lang/String;)I
int v2 = -1; // const/4 v2, -0x1
/* if-eq v1, v2, :cond_0 */
/* .line 1308 */
final String v1 = "phone"; // const-string v1, "phone"
(( android.content.Context ) v0 ).getSystemService ( v1 ); // invoke-virtual {v0, v1}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;
/* check-cast v0, Landroid/telephony/TelephonyManager; */
/* .line 1310 */
if ( v0 != null) { // if-eqz v0, :cond_0
	 /* .line 1311 */
	 (( android.telephony.TelephonyManager ) v0 ).getDeviceId ( ); // invoke-virtual {v0}, Landroid/telephony/TelephonyManager;->getDeviceId()Ljava/lang/String;
	 /* .line 1315 */
} // :cond_0
return;
} // .end method
private static void C ( ) {
/* .locals 4 */
/* .prologue */
/* .line 1332 */
v0 = com.wiyun.engine.nodes.f.h;
v0 = android.text.TextUtils .isEmpty ( v0 );
if ( v0 != null) { // if-eqz v0, :cond_1
	 /* .line 1334 */
	 v0 = com.wiyun.engine.nodes.f.a;
	 /* .line 1337 */
	 /* new-instance v1, Ljava/lang/StringBuilder; */
	 /* invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V */
	 /* .line 1338 */
	 v2 = com.wiyun.engine.nodes.f.g;
	 (( java.lang.StringBuilder ) v1 ).append ( v2 ); // invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
	 /* .line 1341 */
	 (( android.content.Context ) v0 ).getContentResolver ( ); // invoke-virtual {v0}, Landroid/content/Context;->getContentResolver()Landroid/content/ContentResolver;
	 final String v3 = "android_id"; // const-string v3, "android_id"
	 android.provider.Settings$Secure .getString ( v2,v3 );
	 /* .line 1342 */
	 (( java.lang.StringBuilder ) v1 ).append ( v2 ); // invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
	 /* .line 1345 */
	 (( android.content.Context ) v0 ).getResources ( ); // invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;
	 (( android.content.res.Resources ) v2 ).getDisplayMetrics ( ); // invoke-virtual {v2}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;
	 /* .line 1346 */
	 /* iget v2, v2, Landroid/util/DisplayMetrics;->density:F */
	 (( java.lang.StringBuilder ) v1 ).append ( v2 ); // invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;
	 /* .line 1349 */
	 com.wiyun.engine.nodes.f .m ( );
	 final String v3 = "android.permission.ACCESS_WIFI_STATE"; // const-string v3, "android.permission.ACCESS_WIFI_STATE"
	 v2 = 	 (( android.content.Context ) v2 ).checkCallingOrSelfPermission ( v3 ); // invoke-virtual {v2, v3}, Landroid/content/Context;->checkCallingOrSelfPermission(Ljava/lang/String;)I
	 /* if-nez v2, :cond_2 */
	 /* .line 1351 */
	 try { // :try_start_0
		 final String v2 = "wifi"; // const-string v2, "wifi"
		 (( android.content.Context ) v0 ).getSystemService ( v2 ); // invoke-virtual {v0, v2}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;
		 /* check-cast v0, Landroid/net/wifi/WifiManager; */
		 /* .line 1352 */
		 if ( v0 != null) { // if-eqz v0, :cond_0
			 /* .line 1353 */
			 (( android.net.wifi.WifiManager ) v0 ).getConnectionInfo ( ); // invoke-virtual {v0}, Landroid/net/wifi/WifiManager;->getConnectionInfo()Landroid/net/wifi/WifiInfo;
			 /* .line 1354 */
			 if ( v0 != null) { // if-eqz v0, :cond_0
				 /* .line 1355 */
				 (( android.net.wifi.WifiInfo ) v0 ).getMacAddress ( ); // invoke-virtual {v0}, Landroid/net/wifi/WifiInfo;->getMacAddress()Ljava/lang/String;
				 (( java.lang.StringBuilder ) v1 ).append ( v0 ); // invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
				 /* :try_end_0 */
				 /* .catch Ljava/lang/Throwable; {:try_start_0 ..:try_end_0} :catch_0 */
				 /* .line 1365 */
			 } // :cond_0
		 } // :goto_0
		 (( java.lang.StringBuilder ) v1 ).toString ( ); // invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
		 com.wiyun.engine.nodes._U .md5 ( v0 );
		 /* .line 1367 */
	 } // :cond_1
	 return;
	 /* .line 1357 */
	 /* :catch_0 */
	 /* move-exception v0 */
	 /* .line 1358 */
	 final String v0 = "00:00:00:00:00:00"; // const-string v0, "00:00:00:00:00:00"
	 (( java.lang.StringBuilder ) v1 ).append ( v0 ); // invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
	 /* .line 1361 */
} // :cond_2
final String v0 = "00:00:00:00:00:00"; // const-string v0, "00:00:00:00:00:00"
(( java.lang.StringBuilder ) v1 ).append ( v0 ); // invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
} // .end method
private static Boolean D ( ) {
/* .locals 3 */
/* .prologue */
int v1 = 0; // const/4 v1, 0x0
/* .line 1371 */
v0 = com.wiyun.engine.nodes.f.a;
/* .line 1372 */
/* if-nez v0, :cond_0 */
/* move v0, v1 */
/* .line 1379 */
} // :goto_0
/* .line 1375 */
} // :cond_0
final String v2 = "sensor"; // const-string v2, "sensor"
(( android.content.Context ) v0 ).getSystemService ( v2 ); // invoke-virtual {v0, v2}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;
/* check-cast v0, Landroid/hardware/SensorManager; */
/* .line 1376 */
/* if-nez v0, :cond_1 */
/* move v0, v1 */
/* .line 1377 */
/* .line 1379 */
} // :cond_1
int v2 = 2; // const/4 v2, 0x2
(( android.hardware.SensorManager ) v0 ).getDefaultSensor ( v2 ); // invoke-virtual {v0, v2}, Landroid/hardware/SensorManager;->getDefaultSensor(I)Landroid/hardware/Sensor;
if ( v0 != null) { // if-eqz v0, :cond_2
int v0 = 1; // const/4 v0, 0x1
} // :cond_2
/* move v0, v1 */
} // .end method
private static void E ( ) {
/* .locals 6 */
/* .prologue */
int v0 = 0; // const/4 v0, 0x0
/* .line 1384 */
int v2 = -1; // const/4 v2, -0x1
/* if-ne v1, v2, :cond_3 */
/* .line 1385 */
v1 = com.wiyun.engine.nodes.f.g;
/* .line 1386 */
v2 = android.os.Build.FINGERPRINT;
final String v3 = "generic"; // const-string v3, "generic"
v2 = (( java.lang.String ) v2 ).startsWith ( v3 ); // invoke-virtual {v2, v3}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z
/* .line 1387 */
final String v3 = "sdk"; // const-string v3, "sdk"
v4 = android.os.Build.MODEL;
v3 = (( java.lang.String ) v3 ).equalsIgnoreCase ( v4 ); // invoke-virtual {v3, v4}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z
/* .line 1388 */
v4 = com.wiyun.engine.nodes.f .D ( );
/* .line 1392 */
v5 = android.text.TextUtils .isEmpty ( v1 );
/* if-nez v5, :cond_5 */
v1 = com.wiyun.engine.nodes.f .a ( v1 );
if ( v1 != null) { // if-eqz v1, :cond_5
/* .line 1393 */
/* const/16 v1, 0x1e */
/* .line 1394 */
} // :goto_0
/* if-nez v2, :cond_0 */
/* .line 1395 */
/* add-int/lit8 v1, v1, 0x1e */
/* .line 1396 */
} // :cond_0
/* if-nez v3, :cond_1 */
/* .line 1397 */
/* add-int/lit8 v1, v1, 0x14 */
/* .line 1398 */
} // :cond_1
if ( v4 != null) { // if-eqz v4, :cond_2
/* .line 1399 */
/* add-int/lit8 v1, v1, 0x32 */
/* .line 1402 */
} // :cond_2
/* const/16 v2, 0x32 */
/* if-lt v1, v2, :cond_4 */
} // :goto_1
/* .line 1404 */
} // :cond_3
return;
/* .line 1402 */
} // :cond_4
int v0 = 1; // const/4 v0, 0x1
} // :cond_5
/* move v1, v0 */
} // .end method
private static void F ( ) {
/* .locals 3 */
/* .prologue */
/* .line 1410 */
v1 = com.wiyun.engine.nodes.f.j;
v1 = android.text.TextUtils .isEmpty ( v1 );
if ( v1 != null) { // if-eqz v1, :cond_0
/* .line 1411 */
v1 = com.wiyun.engine.nodes.f.a;
/* if-nez v1, :cond_1 */
/* .line 1412 */
final String v1 = ""; // const-string v1, ""
/* .line 1418 */
/* .local v0, "config":Landroid/content/res/Configuration; */
} // :cond_0
} // :goto_0
return;
/* .line 1414 */
} // .end local v0 # "config":Landroid/content/res/Configuration;
} // :cond_1
v1 = com.wiyun.engine.nodes.f.a;
(( android.content.Context ) v1 ).getResources ( ); // invoke-virtual {v1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;
(( android.content.res.Resources ) v1 ).getConfiguration ( ); // invoke-virtual {v1}, Landroid/content/res/Resources;->getConfiguration()Landroid/content/res/Configuration;
/* .line 1415 */
/* .restart local v0 # "config":Landroid/content/res/Configuration; */
/* iget v1, v0, Landroid/content/res/Configuration;->mcc:I */
/* mul-int/lit8 v1, v1, 0x64 */
/* iget v2, v0, Landroid/content/res/Configuration;->mnc:I */
/* add-int/2addr v1, v2 */
java.lang.String .valueOf ( v1 );
} // .end method
public static Integer a ( ) {
/* .locals 1 */
/* .prologue */
/* .line 1058 */
} // .end method
static void a ( android.content.Context p0 ) {
/* .locals 1 */
/* .param p0, "context" # Landroid/content/Context; */
/* .prologue */
/* .line 1150 */
v0 = com.wiyun.engine.nodes.f.a;
/* if-nez v0, :cond_1 */
/* .line 1151 */
(( android.content.Context ) p0 ).getApplicationContext ( ); // invoke-virtual {p0}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;
/* .line 1152 */
/* instance-of v0, p0, Landroid/app/Activity; */
if ( v0 != null) { // if-eqz v0, :cond_0
/* .line 1153 */
/* new-instance v0, Ljava/lang/ref/WeakReference; */
/* check-cast p0, Landroid/app/Activity; */
} // .end local p0 # "context":Landroid/content/Context;
/* invoke-direct {v0, p0}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V */
/* .line 1154 */
} // :cond_0
com.wiyun.engine.nodes.f .w ( );
/* .line 1155 */
com.wiyun.engine.nodes.f .y ( );
/* .line 1156 */
com.wiyun.engine.nodes.f .z ( );
/* .line 1157 */
com.wiyun.engine.nodes.f .F ( );
/* .line 1158 */
com.wiyun.engine.nodes.f .B ( );
/* .line 1159 */
com.wiyun.engine.nodes.f .E ( );
/* .line 1160 */
com.wiyun.engine.nodes.f .C ( );
/* .line 1161 */
com.wiyun.engine.nodes.f .A ( );
/* .line 1162 */
com.wiyun.engine.nodes.f .x ( );
/* .line 1163 */
com.wiyun.engine.nodes.f .r ( );
/* .line 1164 */
com.wiyun.engine.nodes.f .t ( );
/* .line 1165 */
com.wiyun.engine.nodes.f .v ( );
/* .line 1166 */
com.wiyun.engine.nodes.f .u ( );
/* .line 1168 */
} // :cond_1
return;
} // .end method
private static Boolean a ( java.lang.String p0 ) {
/* .locals 5 */
/* .param p0, "s" # Ljava/lang/String; */
/* .prologue */
int v2 = 0; // const/4 v2, 0x0
/* .line 1318 */
/* if-nez p0, :cond_1 */
/* .line 1328 */
} // :cond_0
} // :goto_0
/* .line 1321 */
} // :cond_1
v1 = (( java.lang.String ) p0 ).length ( ); // invoke-virtual {p0}, Ljava/lang/String;->length()I
/* .line 1322 */
/* .local v1, "length":I */
int v0 = 0; // const/4 v0, 0x0
/* .local v0, "i":I */
} // :goto_1
/* if-ge v0, v1, :cond_0 */
/* .line 1323 */
v3 = (( java.lang.String ) p0 ).charAt ( v0 ); // invoke-virtual {p0, v0}, Ljava/lang/String;->charAt(I)C
/* const/16 v4, 0x30 */
/* if-eq v3, v4, :cond_2 */
/* .line 1324 */
int v2 = 1; // const/4 v2, 0x1
/* .line 1322 */
} // :cond_2
/* add-int/lit8 v0, v0, 0x1 */
} // .end method
public static Integer b ( ) {
/* .locals 1 */
/* .prologue */
/* .line 1062 */
} // .end method
public static Integer c ( ) {
/* .locals 1 */
/* .prologue */
/* .line 1066 */
} // .end method
public static java.lang.String d ( ) {
/* .locals 1 */
/* .prologue */
/* .line 1070 */
v0 = com.wiyun.engine.nodes.f.m;
} // .end method
public static java.lang.String e ( ) {
/* .locals 1 */
/* .prologue */
/* .line 1074 */
v0 = com.wiyun.engine.nodes.f.n;
} // .end method
public static Integer f ( ) {
/* .locals 1 */
/* .prologue */
/* .line 1078 */
} // .end method
public static java.lang.String g ( ) {
/* .locals 1 */
/* .prologue */
/* .line 1086 */
v0 = com.wiyun.engine.nodes.f.d;
} // .end method
public static java.lang.String h ( ) {
/* .locals 1 */
/* .prologue */
/* .line 1106 */
v0 = com.wiyun.engine.nodes.f.f;
} // .end method
static java.lang.String i ( ) {
/* .locals 1 */
/* .prologue */
/* .line 1110 */
v0 = com.wiyun.engine.nodes.f.h;
} // .end method
public static Integer j ( ) {
/* .locals 1 */
/* .prologue */
/* .line 1130 */
} // .end method
public static java.lang.String k ( ) {
/* .locals 1 */
/* .prologue */
/* .line 1138 */
v0 = com.wiyun.engine.nodes.f.o;
} // .end method
public static java.lang.String l ( ) {
/* .locals 1 */
/* .prologue */
/* .line 1142 */
v0 = com.wiyun.engine.nodes.f.p;
} // .end method
public static android.content.Context m ( ) {
/* .locals 1 */
/* .prologue */
/* .line 1146 */
v0 = com.wiyun.engine.nodes.f.a;
} // .end method
static android.app.Activity n ( ) {
/* .locals 1 */
/* .prologue */
/* .line 1171 */
v0 = com.wiyun.engine.nodes.f.b;
/* if-nez v0, :cond_0 */
int v0 = 0; // const/4 v0, 0x0
} // :goto_0
} // :cond_0
v0 = com.wiyun.engine.nodes.f.b;
(( java.lang.ref.WeakReference ) v0 ).get ( ); // invoke-virtual {v0}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;
/* check-cast v0, Landroid/app/Activity; */
} // .end method
public static Double o ( ) {
/* .locals 6 */
/* .prologue */
/* const-wide/16 v0, 0x0 */
/* .line 1438 */
v2 = com.wiyun.engine.nodes.f.e;
/* if-nez v2, :cond_1 */
} // :cond_0
} // :goto_0
/* return-wide v0 */
} // :cond_1
v2 = com.wiyun.engine.nodes.f.e;
(( android.location.Location ) v2 ).getLatitude ( ); // invoke-virtual {v2}, Landroid/location/Location;->getLatitude()D
/* move-result-wide v2 */
/* const-wide v4, 0x3f0a36e2e0000000L # 4.999999873689376E-5 */
/* cmpg-double v2, v2, v4 */
/* if-ltz v2, :cond_0 */
v0 = com.wiyun.engine.nodes.f.e;
(( android.location.Location ) v0 ).getLatitude ( ); // invoke-virtual {v0}, Landroid/location/Location;->getLatitude()D
/* move-result-wide v0 */
} // .end method
public static Double p ( ) {
/* .locals 6 */
/* .prologue */
/* const-wide/16 v0, 0x0 */
/* .line 1447 */
v2 = com.wiyun.engine.nodes.f.e;
/* if-nez v2, :cond_1 */
} // :cond_0
} // :goto_0
/* return-wide v0 */
} // :cond_1
v2 = com.wiyun.engine.nodes.f.e;
(( android.location.Location ) v2 ).getLongitude ( ); // invoke-virtual {v2}, Landroid/location/Location;->getLongitude()D
/* move-result-wide v2 */
/* const-wide v4, 0x3f0a36e2e0000000L # 4.999999873689376E-5 */
/* cmpg-double v2, v2, v4 */
/* if-ltz v2, :cond_0 */
v0 = com.wiyun.engine.nodes.f.e;
(( android.location.Location ) v0 ).getLongitude ( ); // invoke-virtual {v0}, Landroid/location/Location;->getLongitude()D
/* move-result-wide v0 */
} // .end method
public static java.lang.String q ( ) {
/* .locals 1 */
/* .prologue */
/* .line 1451 */
v0 = com.wiyun.engine.nodes.f.c;
} // .end method
static void r ( ) {
/* .locals 7 */
/* .prologue */
int v4 = 1; // const/4 v4, 0x1
int v5 = 0; // const/4 v5, 0x0
/* .line 1455 */
v0 = com.wiyun.engine.nodes.f.a;
/* .line 1456 */
/* .local v0, "context":Landroid/content/Context; */
if ( v0 != null) { // if-eqz v0, :cond_1
/* .line 1457 */
(( android.content.Context ) v0 ).getPackageManager ( ); // invoke-virtual {v0}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;
/* .line 1458 */
/* .local v3, "pm":Landroid/content/pm/PackageManager; */
int v2 = 0; // const/4 v2, 0x0
/* .line 1460 */
/* .local v2, "lephone":Z */
try { // :try_start_0
final String v6 = "com.lenovo.appstore"; // const-string v6, "com.lenovo.appstore"
(( android.content.pm.PackageManager ) v3 ).getPackageGids ( v6 ); // invoke-virtual {v3, v6}, Landroid/content/pm/PackageManager;->getPackageGids(Ljava/lang/String;)[I
/* :try_end_0 */
/* .catch Landroid/content/pm/PackageManager$NameNotFoundException; {:try_start_0 ..:try_end_0} :catch_1 */
if ( v6 != null) { // if-eqz v6, :cond_2
/* move v2, v4 */
/* .line 1463 */
} // :goto_0
/* if-nez v2, :cond_0 */
/* .line 1465 */
try { // :try_start_1
final String v6 = "com.lenovo.leos.appstore"; // const-string v6, "com.lenovo.leos.appstore"
(( android.content.pm.PackageManager ) v3 ).getPackageGids ( v6 ); // invoke-virtual {v3, v6}, Landroid/content/pm/PackageManager;->getPackageGids(Ljava/lang/String;)[I
/* :try_end_1 */
/* .catch Landroid/content/pm/PackageManager$NameNotFoundException; {:try_start_1 ..:try_end_1} :catch_0 */
if ( v6 != null) { // if-eqz v6, :cond_3
/* move v2, v4 */
/* .line 1470 */
} // :cond_0
} // :goto_1
if ( v2 != null) { // if-eqz v2, :cond_5
/* .line 1471 */
final String v4 = "lenovo"; // const-string v4, "lenovo"
/* .line 1472 */
(( android.content.Context ) v0 ).getResources ( ); // invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;
(( android.content.res.Resources ) v4 ).getDisplayMetrics ( ); // invoke-virtual {v4}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;
/* .line 1473 */
/* .local v1, "dm":Landroid/util/DisplayMetrics; */
/* iget v4, v1, Landroid/util/DisplayMetrics;->heightPixels:I */
/* const/16 v5, 0x320 */
/* if-le v4, v5, :cond_4 */
/* .line 1474 */
final String v4 = "lepad"; // const-string v4, "lepad"
/* .line 1482 */
} // .end local v1 # "dm":Landroid/util/DisplayMetrics;
} // .end local v2 # "lephone":Z
} // .end local v3 # "pm":Landroid/content/pm/PackageManager;
} // :cond_1
} // :goto_2
return;
/* .restart local v2 # "lephone":Z */
/* .restart local v3 # "pm":Landroid/content/pm/PackageManager; */
} // :cond_2
/* move v2, v5 */
/* .line 1460 */
} // :cond_3
/* move v2, v5 */
/* .line 1465 */
/* .line 1476 */
/* .restart local v1 # "dm":Landroid/util/DisplayMetrics; */
} // :cond_4
final String v4 = "lephone"; // const-string v4, "lephone"
/* .line 1478 */
} // .end local v1 # "dm":Landroid/util/DisplayMetrics;
} // :cond_5
v4 = android.os.Build.BRAND;
/* .line 1479 */
v4 = android.os.Build.MODEL;
/* .line 1466 */
/* :catch_0 */
/* move-exception v4 */
/* .line 1461 */
/* :catch_1 */
/* move-exception v6 */
} // .end method
static Boolean s ( ) {
/* .locals 3 */
/* .prologue */
int v1 = 0; // const/4 v1, 0x0
/* .line 1485 */
com.wiyun.engine.nodes.f .m ( );
final String v2 = "android.permission.ACCESS_WIFI_STATE"; // const-string v2, "android.permission.ACCESS_WIFI_STATE"
v0 = (( android.content.Context ) v0 ).checkCallingOrSelfPermission ( v2 ); // invoke-virtual {v0, v2}, Landroid/content/Context;->checkCallingOrSelfPermission(Ljava/lang/String;)I
/* if-nez v0, :cond_2 */
/* .line 1487 */
try { // :try_start_0
v0 = com.wiyun.engine.nodes.f.a;
final String v2 = "wifi"; // const-string v2, "wifi"
(( android.content.Context ) v0 ).getSystemService ( v2 ); // invoke-virtual {v0, v2}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;
/* check-cast v0, Landroid/net/wifi/WifiManager; */
/* .line 1488 */
if ( v0 != null) { // if-eqz v0, :cond_1
/* .line 1489 */
(( android.net.wifi.WifiManager ) v0 ).getConnectionInfo ( ); // invoke-virtual {v0}, Landroid/net/wifi/WifiManager;->getConnectionInfo()Landroid/net/wifi/WifiInfo;
/* .line 1490 */
if ( v0 != null) { // if-eqz v0, :cond_0
(( android.net.wifi.WifiInfo ) v0 ).getSupplicantState ( ); // invoke-virtual {v0}, Landroid/net/wifi/WifiInfo;->getSupplicantState()Landroid/net/wifi/SupplicantState;
v2 = android.net.wifi.SupplicantState.COMPLETED;
/* :try_end_0 */
/* .catch Ljava/lang/Throwable; {:try_start_0 ..:try_end_0} :catch_0 */
/* if-ne v0, v2, :cond_0 */
int v0 = 1; // const/4 v0, 0x1
/* .line 1498 */
} // :goto_0
} // :cond_0
/* move v0, v1 */
/* .line 1490 */
} // :cond_1
/* move v0, v1 */
/* .line 1492 */
/* .line 1494 */
/* :catch_0 */
/* move-exception v0 */
/* move v0, v1 */
/* .line 1495 */
} // :cond_2
/* move v0, v1 */
/* .line 1498 */
} // .end method
static void t ( ) {
/* .locals 3 */
/* .prologue */
int v1 = 2; // const/4 v1, 0x2
/* .line 1505 */
v0 = com.wiyun.engine.nodes.f .s ( );
if ( v0 != null) { // if-eqz v0, :cond_0
/* .line 1506 */
int v0 = 4; // const/4 v0, 0x4
/* .line 1521 */
} // :goto_0
/* .line 1522 */
return;
/* .line 1508 */
} // :cond_0
v0 = com.wiyun.engine.nodes.f.a;
final String v2 = "phone"; // const-string v2, "phone"
(( android.content.Context ) v0 ).getSystemService ( v2 ); // invoke-virtual {v0, v2}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;
/* check-cast v0, Landroid/telephony/TelephonyManager; */
/* .line 1509 */
/* if-nez v0, :cond_1 */
/* .line 1510 */
int v0 = 0; // const/4 v0, 0x0
/* .line 1512 */
} // :cond_1
v0 = (( android.telephony.TelephonyManager ) v0 ).getNetworkType ( ); // invoke-virtual {v0}, Landroid/telephony/TelephonyManager;->getNetworkType()I
/* .line 1513 */
int v2 = 1; // const/4 v2, 0x1
/* if-eq v0, v2, :cond_2 */
/* if-eq v0, v1, :cond_2 */
/* .line 1514 */
/* if-nez v0, :cond_3 */
} // :cond_2
/* move v0, v1 */
/* .line 1515 */
/* .line 1517 */
} // :cond_3
int v0 = 3; // const/4 v0, 0x3
} // .end method
private static void u ( ) {
/* .locals 4 */
/* .prologue */
/* .line 1175 */
v2 = com.wiyun.engine.nodes.f.a;
/* if-nez v2, :cond_1 */
/* .line 1187 */
/* .local v0, "dm":Landroid/util/DisplayMetrics; */
} // :cond_0
} // :goto_0
return;
/* .line 1178 */
} // .end local v0 # "dm":Landroid/util/DisplayMetrics;
} // :cond_1
v2 = com.wiyun.engine.nodes.f.a;
(( android.content.Context ) v2 ).getResources ( ); // invoke-virtual {v2}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;
(( android.content.res.Resources ) v2 ).getDisplayMetrics ( ); // invoke-virtual {v2}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;
/* .line 1179 */
/* .restart local v0 # "dm":Landroid/util/DisplayMetrics; */
/* iget v2, v0, Landroid/util/DisplayMetrics;->widthPixels:I */
/* .line 1180 */
/* iget v2, v0, Landroid/util/DisplayMetrics;->heightPixels:I */
/* .line 1181 */
/* iget v2, v0, Landroid/util/DisplayMetrics;->densityDpi:I */
/* .line 1182 */
/* if-le v2, v3, :cond_0 */
/* .line 1183 */
/* .line 1184 */
/* .local v1, "tmp":I */
/* .line 1185 */
} // .end method
private static void v ( ) {
/* .locals 2 */
/* .prologue */
/* .line 1190 */
java.util.Locale .getDefault ( );
/* .line 1191 */
/* .local v0, "locale":Ljava/util/Locale; */
(( java.util.Locale ) v0 ).getLanguage ( ); // invoke-virtual {v0}, Ljava/util/Locale;->getLanguage()Ljava/lang/String;
/* .line 1192 */
(( java.util.Locale ) v0 ).getCountry ( ); // invoke-virtual {v0}, Ljava/util/Locale;->getCountry()Ljava/lang/String;
/* .line 1193 */
return;
} // .end method
private static void w ( ) {
/* .locals 4 */
/* .prologue */
/* .line 1197 */
try { // :try_start_0
/* const-class v2, Landroid/os/Build$VERSION; */
final String v3 = "SDK_INT"; // const-string v3, "SDK_INT"
(( java.lang.Class ) v2 ).getField ( v3 ); // invoke-virtual {v2, v3}, Ljava/lang/Class;->getField(Ljava/lang/String;)Ljava/lang/reflect/Field;
/* .line 1198 */
/* .local v1, "f":Ljava/lang/reflect/Field; */
int v2 = 0; // const/4 v2, 0x0
v2 = (( java.lang.reflect.Field ) v1 ).getInt ( v2 ); // invoke-virtual {v1, v2}, Ljava/lang/reflect/Field;->getInt(Ljava/lang/Object;)I
/* :try_end_0 */
/* .catch Ljava/lang/Exception; {:try_start_0 ..:try_end_0} :catch_0 */
/* .line 1202 */
} // :goto_0
return;
/* .line 1199 */
/* :catch_0 */
/* move-exception v0 */
/* .line 1200 */
/* .local v0, "e":Ljava/lang/Exception; */
int v2 = 3; // const/4 v2, 0x3
} // .end method
private static void x ( ) {
/* .locals 1 */
/* .prologue */
/* .line 1211 */
v0 = com.wiyun.engine.nodes.f.a;
if ( v0 != null) { // if-eqz v0, :cond_0
/* .line 1212 */
v0 = com.wiyun.engine.nodes.f.a;
(( android.content.Context ) v0 ).getPackageName ( ); // invoke-virtual {v0}, Landroid/content/Context;->getPackageName()Ljava/lang/String;
/* .line 1213 */
} // :cond_0
return;
} // .end method
private static void y ( ) {
/* .locals 4 */
/* .prologue */
/* .line 1216 */
v0 = com.wiyun.engine.nodes.f.l;
v0 = android.text.TextUtils .isEmpty ( v0 );
if ( v0 != null) { // if-eqz v0, :cond_0
/* .line 1218 */
v0 = com.wiyun.engine.nodes.f.a;
/* .line 1219 */
if ( v0 != null) { // if-eqz v0, :cond_0
/* .line 1220 */
final String v1 = "android.permission.READ_PHONE_STATE"; // const-string v1, "android.permission.READ_PHONE_STATE"
v1 = (( android.content.Context ) v0 ).checkCallingOrSelfPermission ( v1 ); // invoke-virtual {v0, v1}, Landroid/content/Context;->checkCallingOrSelfPermission(Ljava/lang/String;)I
int v2 = -1; // const/4 v2, -0x1
/* if-eq v1, v2, :cond_0 */
/* .line 1222 */
final String v1 = "phone"; // const-string v1, "phone"
(( android.content.Context ) v0 ).getSystemService ( v1 ); // invoke-virtual {v0, v1}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;
/* check-cast v0, Landroid/telephony/TelephonyManager; */
/* .line 1223 */
/* if-nez v0, :cond_1 */
int v0 = 0; // const/4 v0, 0x0
/* .line 1224 */
} // :goto_0
v1 = android.text.TextUtils .isEmpty ( v0 );
/* if-nez v1, :cond_0 */
/* .line 1225 */
com.wiyun.engine.nodes._U .c ( v0 );
/* .line 1226 */
int v0 = 0; // const/4 v0, 0x0
} // :goto_1
/* array-length v2, v1 */
/* if-lt v0, v2, :cond_2 */
/* .line 1234 */
com.wiyun.engine.nodes._U .base64 ( v1 );
/* .line 1238 */
} // :cond_0
return;
/* .line 1223 */
} // :cond_1
(( android.telephony.TelephonyManager ) v0 ).getLine1Number ( ); // invoke-virtual {v0}, Landroid/telephony/TelephonyManager;->getLine1Number()Ljava/lang/String;
/* .line 1227 */
} // :cond_2
/* aget-byte v2, v1, v0 */
/* shr-int/lit8 v2, v2, 0x4 */
/* and-int/lit8 v2, v2, 0xf */
/* .line 1228 */
/* aget-byte v3, v1, v0 */
/* and-int/lit8 v3, v3, 0xf */
/* .line 1229 */
/* shl-int/lit8 v3, v3, 0x4 */
/* or-int/2addr v2, v3 */
/* .line 1230 */
/* xor-int/lit16 v2, v2, 0xff */
/* .line 1231 */
/* and-int/lit16 v2, v2, 0xff */
/* int-to-byte v2, v2 */
/* aput-byte v2, v1, v0 */
/* .line 1226 */
/* add-int/lit8 v0, v0, 0x1 */
} // .end method
private static void z ( ) {
/* .locals 2 */
/* .prologue */
/* .line 1241 */
v0 = com.wiyun.engine.nodes.f.a;
/* .line 1242 */
v1 = com.wiyun.engine.nodes.f.k;
v1 = android.text.TextUtils .isEmpty ( v1 );
if ( v1 != null) { // if-eqz v1, :cond_0
/* .line 1243 */
if ( v0 != null) { // if-eqz v0, :cond_0
/* .line 1244 */
final String v1 = "android.permission.READ_PHONE_STATE"; // const-string v1, "android.permission.READ_PHONE_STATE"
v1 = (( android.content.Context ) v0 ).checkCallingOrSelfPermission ( v1 ); // invoke-virtual {v0, v1}, Landroid/content/Context;->checkCallingOrSelfPermission(Ljava/lang/String;)I
/* if-nez v1, :cond_0 */
/* .line 1246 */
final String v1 = "phone"; // const-string v1, "phone"
(( android.content.Context ) v0 ).getSystemService ( v1 ); // invoke-virtual {v0, v1}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;
/* check-cast v0, Landroid/telephony/TelephonyManager; */
/* .line 1247 */
if ( v0 != null) { // if-eqz v0, :cond_0
/* .line 1248 */
(( android.telephony.TelephonyManager ) v0 ).getNetworkOperatorName ( ); // invoke-virtual {v0}, Landroid/telephony/TelephonyManager;->getNetworkOperatorName()Ljava/lang/String;
/* .line 1252 */
} // :cond_0
return;
} // .end method
