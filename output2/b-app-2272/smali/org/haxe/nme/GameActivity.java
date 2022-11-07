public class org.haxe.nme.GameActivity extends android.app.Activity implements android.hardware.SensorEventListener {
	 /* .source "GameActivity.java" */
	 /* # interfaces */
	 /* # static fields */
	 private static final Integer DEVICE_ORIENTATION_FACE_DOWN;
	 private static final Integer DEVICE_ORIENTATION_FACE_UP;
	 private static final Integer DEVICE_ORIENTATION_LANDSCAPE_LEFT;
	 private static final Integer DEVICE_ORIENTATION_LANDSCAPE_RIGHT;
	 private static final Integer DEVICE_ORIENTATION_PORTRAIT;
	 private static final Integer DEVICE_ORIENTATION_PORTRAIT_UPSIDE_DOWN;
	 private static final Integer DEVICE_ORIENTATION_UNKNOWN;
	 private static final Integer DEVICE_ROTATION_0;
	 private static final Integer DEVICE_ROTATION_180;
	 private static final Integer DEVICE_ROTATION_270;
	 private static final Integer DEVICE_ROTATION_90;
	 private static final java.lang.String GLOBAL_PREF_FILE;
	 private static accelData;
	 static org.haxe.nme.GameActivity activity;
	 private static Integer bufferedDisplayOrientation;
	 private static Integer bufferedNormalOrientation;
	 private static inclinationMatrix;
	 static android.content.res.AssetManager mAssets;
	 static android.content.Context mContext;
	 static java.util.HashMap mLoadedClasses;
	 /* .annotation system Ldalvik/annotation/Signature; */
	 /* value = { */
	 /* "Ljava/util/HashMap", */
	 /* "<", */
	 /* "Ljava/lang/String;", */
	 /* "Ljava/lang/Class;", */
	 /* ">;" */
	 /* } */
} // .end annotation
} // .end field
private static magnetData;
static android.util.DisplayMetrics metrics;
private static orientData;
private static rotationMatrix;
static android.hardware.SensorManager sensorManager;
/* # instance fields */
private org.haxe.nme.Sound _sound;
public android.os.Handler mHandler;
org.haxe.nme.MainView mView;
/* # direct methods */
static org.haxe.nme.GameActivity ( ) {
/* .locals 4 */
/* .prologue */
/* const/16 v3, 0x10 */
int v2 = -1; // const/4 v2, -0x1
int v1 = 3; // const/4 v1, 0x3
/* .line 55 */
/* new-instance v0, Ljava/util/HashMap; */
/* invoke-direct {v0}, Ljava/util/HashMap;-><init>()V */
/* .line 61 */
/* new-array v0, v1, [F */
/* .line 62 */
/* .line 63 */
/* .line 64 */
/* new-array v0, v3, [F */
/* .line 65 */
/* new-array v0, v1, [F */
/* .line 66 */
/* new-array v0, v1, [F */
/* .line 67 */
/* new-array v0, v3, [F */
return;
} // .end method
public org.haxe.nme.GameActivity ( ) {
/* .locals 0 */
/* .prologue */
/* .line 36 */
/* invoke-direct {p0}, Landroid/app/Activity;-><init>()V */
return;
} // .end method
public static java.lang.String CapabilitiesGetLanguage ( ) {
/* .locals 1 */
/* .prologue */
/* .line 139 */
java.util.Locale .getDefault ( );
(( java.util.Locale ) v0 ).getLanguage ( ); // invoke-virtual {v0}, Ljava/util/Locale;->getLanguage()Ljava/lang/String;
} // .end method
public static Double CapabilitiesGetPixelAspectRatio ( ) {
/* .locals 2 */
/* .prologue */
/* .line 116 */
v0 = org.haxe.nme.GameActivity.metrics;
/* iget v0, v0, Landroid/util/DisplayMetrics;->xdpi:F */
v1 = org.haxe.nme.GameActivity.metrics;
/* iget v1, v1, Landroid/util/DisplayMetrics;->ydpi:F */
/* div-float/2addr v0, v1 */
/* float-to-double v0, v0 */
/* return-wide v0 */
} // .end method
public static Double CapabilitiesGetScreenDPI ( ) {
/* .locals 2 */
/* .prologue */
/* .line 122 */
v0 = org.haxe.nme.GameActivity.metrics;
/* iget v0, v0, Landroid/util/DisplayMetrics;->xdpi:F */
/* float-to-double v0, v0 */
/* return-wide v0 */
} // .end method
public static Double CapabilitiesGetScreenResolutionX ( ) {
/* .locals 2 */
/* .prologue */
/* .line 128 */
v0 = org.haxe.nme.GameActivity.metrics;
/* iget v0, v0, Landroid/util/DisplayMetrics;->widthPixels:I */
/* int-to-double v0, v0 */
/* return-wide v0 */
} // .end method
public static Double CapabilitiesGetScreenResolutionY ( ) {
/* .locals 2 */
/* .prologue */
/* .line 134 */
v0 = org.haxe.nme.GameActivity.metrics;
/* iget v0, v0, Landroid/util/DisplayMetrics;->heightPixels:I */
/* int-to-double v0, v0 */
/* return-wide v0 */
} // .end method
public static void clearUserPreference ( java.lang.String p0 ) {
/* .locals 5 */
/* .param p0, "inId" # Ljava/lang/String; */
/* .prologue */
/* .line 145 */
v2 = org.haxe.nme.GameActivity.activity;
final String v3 = "nmeAppPrefs"; // const-string v3, "nmeAppPrefs"
int v4 = 0; // const/4 v4, 0x0
(( org.haxe.nme.GameActivity ) v2 ).getSharedPreferences ( v3, v4 ); // invoke-virtual {v2, v3, v4}, Lorg/haxe/nme/GameActivity;->getSharedPreferences(Ljava/lang/String;I)Landroid/content/SharedPreferences;
/* .line 146 */
/* .local v1, "prefs":Landroid/content/SharedPreferences; */
/* .line 147 */
/* .local v0, "prefEditor":Landroid/content/SharedPreferences$Editor; */
final String v2 = ""; // const-string v2, ""
/* .line 148 */
/* .line 149 */
return;
} // .end method
public static android.content.Context getContext ( ) {
/* .locals 1 */
/* .prologue */
/* .line 183 */
v0 = org.haxe.nme.GameActivity.mContext;
} // .end method
public static org.haxe.nme.GameActivity getInstance ( ) {
/* .locals 1 */
/* .prologue */
/* .line 188 */
v0 = org.haxe.nme.GameActivity.activity;
} // .end method
public static org.haxe.nme.MainView getMainView ( ) {
/* .locals 1 */
/* .prologue */
/* .line 193 */
v0 = org.haxe.nme.GameActivity.activity;
v0 = this.mView;
} // .end method
public static getResource ( java.lang.String p0 ) {
/* .locals 8 */
/* .param p0, "inResource" # Ljava/lang/String; */
/* .prologue */
/* .line 206 */
try { // :try_start_0
	 v5 = org.haxe.nme.GameActivity.mAssets;
	 int v6 = 3; // const/4 v6, 0x3
	 (( android.content.res.AssetManager ) v5 ).open ( p0, v6 ); // invoke-virtual {v5, p0, v6}, Landroid/content/res/AssetManager;->open(Ljava/lang/String;I)Ljava/io/InputStream;
	 /* .line 207 */
	 /* .local v1, "inputStream":Ljava/io/InputStream; */
	 v5 = 	 (( java.io.InputStream ) v1 ).available ( ); // invoke-virtual {v1}, Ljava/io/InputStream;->available()I
	 /* int-to-long v2, v5 */
	 /* .line 208 */
	 /* .local v2, "length":J */
	 /* long-to-int v5, v2 */
	 /* new-array v4, v5, [B */
	 /* .line 209 */
	 /* .local v4, "result":[B */
	 (( java.io.InputStream ) v1 ).read ( v4 ); // invoke-virtual {v1, v4}, Ljava/io/InputStream;->read([B)I
	 /* .line 210 */
	 (( java.io.InputStream ) v1 ).close ( ); // invoke-virtual {v1}, Ljava/io/InputStream;->close()V
	 /* :try_end_0 */
	 /* .catch Ljava/io/IOException; {:try_start_0 ..:try_end_0} :catch_0 */
	 /* .line 218 */
} // .end local v1 # "inputStream":Ljava/io/InputStream;
} // .end local v2 # "length":J
} // .end local v4 # "result":[B
} // :goto_0
/* .line 213 */
/* :catch_0 */
/* move-exception v0 */
/* .line 215 */
/* .local v0, "e":Ljava/io/IOException; */
final String v5 = "GameActivity"; // const-string v5, "GameActivity"
/* new-instance v6, Ljava/lang/StringBuilder; */
/* invoke-direct {v6}, Ljava/lang/StringBuilder;-><init>()V */
final String v7 = "getResource:"; // const-string v7, "getResource:"
(( java.lang.StringBuilder ) v6 ).append ( v7 ); // invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.io.IOException ) v0 ).toString ( ); // invoke-virtual {v0}, Ljava/io/IOException;->toString()Ljava/lang/String;
(( java.lang.StringBuilder ) v6 ).append ( v7 ); // invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v6 ).toString ( ); // invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
android.util.Log .e ( v5,v6 );
/* .line 218 */
int v4 = 0; // const/4 v4, 0x0
} // .end method
public static Integer getResourceID ( java.lang.String p0 ) {
/* .locals 1 */
/* .param p0, "inFilename" # Ljava/lang/String; */
/* .prologue */
/* .line 224 */
final String v0 = "snd/alienaatack.mp3"; // const-string v0, "snd/alienaatack.mp3"
v0 = (( java.lang.String ) p0 ).equals ( v0 ); // invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
if ( v0 != null) { // if-eqz v0, :cond_0
/* const/high16 v0, 0x7f030000 */
/* .line 243 */
} // :goto_0
/* .line 225 */
} // :cond_0
final String v0 = "snd/alientankborn.mp3"; // const-string v0, "snd/alientankborn.mp3"
v0 = (( java.lang.String ) p0 ).equals ( v0 ); // invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
if ( v0 != null) { // if-eqz v0, :cond_1
/* const v0, 0x7f030002 */
/* .line 226 */
} // :cond_1
final String v0 = "snd/planebornufo.mp3"; // const-string v0, "snd/planebornufo.mp3"
v0 = (( java.lang.String ) p0 ).equals ( v0 ); // invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
if ( v0 != null) { // if-eqz v0, :cond_2
/* const v0, 0x7f030007 */
/* .line 227 */
} // :cond_2
final String v0 = "snd/planebornzombie.mp3"; // const-string v0, "snd/planebornzombie.mp3"
v0 = (( java.lang.String ) p0 ).equals ( v0 ); // invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
if ( v0 != null) { // if-eqz v0, :cond_3
/* const v0, 0x7f030009 */
/* .line 228 */
} // :cond_3
final String v0 = "snd/ufoborn.mp3"; // const-string v0, "snd/ufoborn.mp3"
v0 = (( java.lang.String ) p0 ).equals ( v0 ); // invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
if ( v0 != null) { // if-eqz v0, :cond_4
/* const v0, 0x7f03000c */
/* .line 229 */
} // :cond_4
final String v0 = "snd/zombieborn.mp3"; // const-string v0, "snd/zombieborn.mp3"
v0 = (( java.lang.String ) p0 ).equals ( v0 ); // invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
if ( v0 != null) { // if-eqz v0, :cond_5
/* const v0, 0x7f030010 */
/* .line 230 */
} // :cond_5
final String v0 = "snd/zombies.mp3"; // const-string v0, "snd/zombies.mp3"
v0 = (( java.lang.String ) p0 ).equals ( v0 ); // invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
if ( v0 != null) { // if-eqz v0, :cond_6
/* const v0, 0x7f030012 */
/* .line 231 */
} // :cond_6
final String v0 = "snd/zombie_attack.mp3"; // const-string v0, "snd/zombie_attack.mp3"
v0 = (( java.lang.String ) p0 ).equals ( v0 ); // invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
if ( v0 != null) { // if-eqz v0, :cond_7
/* const v0, 0x7f03000e */
/* .line 232 */
} // :cond_7
final String v0 = "snd/zomietankborn.mp3"; // const-string v0, "snd/zomietankborn.mp3"
v0 = (( java.lang.String ) p0 ).equals ( v0 ); // invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
if ( v0 != null) { // if-eqz v0, :cond_8
/* const v0, 0x7f030013 */
/* .line 234 */
} // :cond_8
final String v0 = "snd/alienaatack.ogg"; // const-string v0, "snd/alienaatack.ogg"
v0 = (( java.lang.String ) p0 ).equals ( v0 ); // invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
if ( v0 != null) { // if-eqz v0, :cond_9
/* const v0, 0x7f030001 */
/* .line 235 */
} // :cond_9
final String v0 = "snd/alientankborn.ogg"; // const-string v0, "snd/alientankborn.ogg"
v0 = (( java.lang.String ) p0 ).equals ( v0 ); // invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
if ( v0 != null) { // if-eqz v0, :cond_a
/* const v0, 0x7f030003 */
/* .line 236 */
} // :cond_a
final String v0 = "snd/planebornufo.ogg"; // const-string v0, "snd/planebornufo.ogg"
v0 = (( java.lang.String ) p0 ).equals ( v0 ); // invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
if ( v0 != null) { // if-eqz v0, :cond_b
/* const v0, 0x7f030008 */
/* goto/16 :goto_0 */
/* .line 237 */
} // :cond_b
final String v0 = "snd/planebornzombie.ogg"; // const-string v0, "snd/planebornzombie.ogg"
v0 = (( java.lang.String ) p0 ).equals ( v0 ); // invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
if ( v0 != null) { // if-eqz v0, :cond_c
/* const v0, 0x7f03000a */
/* goto/16 :goto_0 */
/* .line 238 */
} // :cond_c
final String v0 = "snd/ufoborn.ogg"; // const-string v0, "snd/ufoborn.ogg"
v0 = (( java.lang.String ) p0 ).equals ( v0 ); // invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
if ( v0 != null) { // if-eqz v0, :cond_d
/* const v0, 0x7f03000d */
/* goto/16 :goto_0 */
/* .line 239 */
} // :cond_d
final String v0 = "snd/zombieborn.ogg"; // const-string v0, "snd/zombieborn.ogg"
v0 = (( java.lang.String ) p0 ).equals ( v0 ); // invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
if ( v0 != null) { // if-eqz v0, :cond_e
/* const v0, 0x7f030011 */
/* goto/16 :goto_0 */
/* .line 240 */
} // :cond_e
final String v0 = "snd/zombie_attack.ogg"; // const-string v0, "snd/zombie_attack.ogg"
v0 = (( java.lang.String ) p0 ).equals ( v0 ); // invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
if ( v0 != null) { // if-eqz v0, :cond_f
/* const v0, 0x7f03000f */
/* goto/16 :goto_0 */
/* .line 241 */
} // :cond_f
final String v0 = "snd/zomietankborn.ogg"; // const-string v0, "snd/zomietankborn.ogg"
v0 = (( java.lang.String ) p0 ).equals ( v0 ); // invoke-virtual {p0, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
if ( v0 != null) { // if-eqz v0, :cond_10
/* const v0, 0x7f030014 */
/* goto/16 :goto_0 */
/* .line 243 */
} // :cond_10
int v0 = -1; // const/4 v0, -0x1
/* goto/16 :goto_0 */
} // .end method
public static java.lang.String getSpecialDir ( Integer p0 ) {
/* .locals 4 */
/* .param p0, "inWhich" # I */
/* .prologue */
/* .line 249 */
final String v1 = "GameActivity"; // const-string v1, "GameActivity"
/* new-instance v2, Ljava/lang/StringBuilder; */
/* invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V */
final String v3 = "Get special Dir "; // const-string v3, "Get special Dir "
(( java.lang.StringBuilder ) v2 ).append ( v3 ); // invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v2 ).append ( p0 ); // invoke-virtual {v2, p0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v2 ).toString ( ); // invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
android.util.Log .v ( v1,v2 );
/* .line 250 */
int v0 = 0; // const/4 v0, 0x0
/* .line 252 */
/* .local v0, "path":Ljava/io/File; */
/* packed-switch p0, :pswitch_data_0 */
/* .line 274 */
} // :goto_0
/* if-nez v0, :cond_0 */
final String v1 = ""; // const-string v1, ""
} // :goto_1
/* .line 255 */
/* :pswitch_0 */
v1 = org.haxe.nme.GameActivity.mContext;
(( android.content.Context ) v1 ).getPackageCodePath ( ); // invoke-virtual {v1}, Landroid/content/Context;->getPackageCodePath()Ljava/lang/String;
/* .line 258 */
/* :pswitch_1 */
v1 = org.haxe.nme.GameActivity.mContext;
(( android.content.Context ) v1 ).getFilesDir ( ); // invoke-virtual {v1}, Landroid/content/Context;->getFilesDir()Ljava/io/File;
/* .line 259 */
/* .line 262 */
/* :pswitch_2 */
android.os.Environment .getDataDirectory ( );
/* .line 263 */
/* .line 266 */
/* :pswitch_3 */
android.os.Environment .getExternalStorageDirectory ( );
/* .line 267 */
/* .line 270 */
/* :pswitch_4 */
v1 = org.haxe.nme.GameActivity.mContext;
v2 = android.os.Environment.DIRECTORY_DOWNLOADS;
(( android.content.Context ) v1 ).getExternalFilesDir ( v2 ); // invoke-virtual {v1, v2}, Landroid/content/Context;->getExternalFilesDir(Ljava/lang/String;)Ljava/io/File;
/* .line 274 */
} // :cond_0
(( java.io.File ) v0 ).getAbsolutePath ( ); // invoke-virtual {v0}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;
/* .line 252 */
/* nop */
/* :pswitch_data_0 */
/* .packed-switch 0x0 */
/* :pswitch_0 */
/* :pswitch_1 */
/* :pswitch_2 */
/* :pswitch_3 */
/* :pswitch_4 */
} // .end packed-switch
} // .end method
public static java.lang.String getUserPreference ( java.lang.String p0 ) {
/* .locals 4 */
/* .param p0, "inId" # Ljava/lang/String; */
/* .prologue */
/* .line 280 */
v1 = org.haxe.nme.GameActivity.activity;
final String v2 = "nmeAppPrefs"; // const-string v2, "nmeAppPrefs"
int v3 = 0; // const/4 v3, 0x0
(( org.haxe.nme.GameActivity ) v1 ).getSharedPreferences ( v2, v3 ); // invoke-virtual {v1, v2, v3}, Lorg/haxe/nme/GameActivity;->getSharedPreferences(Ljava/lang/String;I)Landroid/content/SharedPreferences;
/* .line 281 */
/* .local v0, "prefs":Landroid/content/SharedPreferences; */
final String v1 = ""; // const-string v1, ""
} // .end method
public static void launchBrowser ( java.lang.String p0 ) {
/* .locals 4 */
/* .param p0, "inURL" # Ljava/lang/String; */
/* .prologue */
/* .line 287 */
/* new-instance v2, Landroid/content/Intent; */
final String v3 = "android.intent.action.VIEW"; // const-string v3, "android.intent.action.VIEW"
/* invoke-direct {v2, v3}, Landroid/content/Intent;-><init>(Ljava/lang/String;)V */
android.net.Uri .parse ( p0 );
(( android.content.Intent ) v2 ).setData ( v3 ); // invoke-virtual {v2, v3}, Landroid/content/Intent;->setData(Landroid/net/Uri;)Landroid/content/Intent;
/* .line 291 */
/* .local v0, "browserIntent":Landroid/content/Intent; */
try { // :try_start_0
v2 = org.haxe.nme.GameActivity.activity;
(( org.haxe.nme.GameActivity ) v2 ).startActivity ( v0 ); // invoke-virtual {v2, v0}, Lorg/haxe/nme/GameActivity;->startActivity(Landroid/content/Intent;)V
/* :try_end_0 */
/* .catch Ljava/lang/Exception; {:try_start_0 ..:try_end_0} :catch_0 */
/* .line 298 */
} // :goto_0
return;
/* .line 293 */
/* :catch_0 */
/* move-exception v1 */
/* .line 295 */
/* .local v1, "e":Ljava/lang/Exception; */
final String v2 = "GameActivity"; // const-string v2, "GameActivity"
(( java.lang.Exception ) v1 ).toString ( ); // invoke-virtual {v1}, Ljava/lang/Exception;->toString()Ljava/lang/String;
android.util.Log .e ( v2,v3 );
} // .end method
private void loadNewSensorData ( android.hardware.SensorEvent p0 ) {
/* .locals 5 */
/* .param p1, "event" # Landroid/hardware/SensorEvent; */
/* .prologue */
int v4 = 2; // const/4 v4, 0x2
int v3 = 1; // const/4 v3, 0x1
/* .line 303 */
v1 = this.sensor;
v0 = (( android.hardware.Sensor ) v1 ).getType ( ); // invoke-virtual {v1}, Landroid/hardware/Sensor;->getType()I
/* .line 305 */
/* .local v0, "type":I */
/* if-ne v0, v3, :cond_0 */
/* .line 307 */
v1 = this.values;
(( ) v1 ).clone ( ); // invoke-virtual {v1}, [F->clone()Ljava/lang/Object;
/* check-cast v1, [F */
/* .line 308 */
v1 = org.haxe.nme.GameActivity.accelData;
int v2 = 0; // const/4 v2, 0x0
/* aget v1, v1, v2 */
/* neg-float v1, v1 */
v2 = org.haxe.nme.GameActivity.accelData;
/* aget v2, v2, v3 */
/* neg-float v2, v2 */
v3 = org.haxe.nme.GameActivity.accelData;
/* aget v3, v3, v4 */
org.haxe.nme.NME .onAccelerate ( v1,v2,v3 );
/* .line 311 */
} // :cond_0
/* if-ne v0, v4, :cond_1 */
/* .line 313 */
v1 = this.values;
(( ) v1 ).clone ( ); // invoke-virtual {v1}, [F->clone()Ljava/lang/Object;
/* check-cast v1, [F */
/* .line 316 */
} // :cond_1
return;
} // .end method
public static void popView ( ) {
/* .locals 2 */
/* .prologue */
/* .line 368 */
v0 = org.haxe.nme.GameActivity.activity;
v1 = org.haxe.nme.GameActivity.activity;
v1 = this.mView;
(( org.haxe.nme.GameActivity ) v0 ).setContentView ( v1 ); // invoke-virtual {v0, v1}, Lorg/haxe/nme/GameActivity;->setContentView(Landroid/view/View;)V
/* .line 369 */
v0 = org.haxe.nme.GameActivity.activity;
(( org.haxe.nme.GameActivity ) v0 ).doResume ( ); // invoke-virtual {v0}, Lorg/haxe/nme/GameActivity;->doResume()V
/* .line 370 */
return;
} // .end method
public static void postUICallback ( Long p0 ) {
/* .locals 2 */
/* .param p0, "inHandle" # J */
/* .prologue */
/* .line 375 */
v0 = org.haxe.nme.GameActivity.activity;
v0 = this.mHandler;
/* new-instance v1, Lorg/haxe/nme/GameActivity$1; */
/* invoke-direct {v1, p0, p1}, Lorg/haxe/nme/GameActivity$1;-><init>(J)V */
(( android.os.Handler ) v0 ).post ( v1 ); // invoke-virtual {v0, v1}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z
/* .line 382 */
return;
} // .end method
private Integer prepareDeviceOrientation ( ) {
/* .locals 7 */
/* .prologue */
int v6 = 4; // const/4 v6, 0x4
int v5 = 1; // const/4 v5, 0x1
int v4 = 0; // const/4 v4, 0x0
/* .line 387 */
(( org.haxe.nme.GameActivity ) p0 ).getWindow ( ); // invoke-virtual {p0}, Lorg/haxe/nme/GameActivity;->getWindow()Landroid/view/Window;
(( android.view.Window ) v3 ).getWindowManager ( ); // invoke-virtual {v3}, Landroid/view/Window;->getWindowManager()Landroid/view/WindowManager;
v1 = (( android.view.Display ) v3 ).getOrientation ( ); // invoke-virtual {v3}, Landroid/view/Display;->getOrientation()I
/* .line 389 */
/* .local v1, "rawOrientation":I */
/* if-eq v1, v3, :cond_0 */
/* .line 391 */
/* .line 394 */
} // :cond_0
(( org.haxe.nme.GameActivity ) p0 ).getResources ( ); // invoke-virtual {p0}, Lorg/haxe/nme/GameActivity;->getResources()Landroid/content/res/Resources;
(( android.content.res.Resources ) v3 ).getConfiguration ( ); // invoke-virtual {v3}, Landroid/content/res/Resources;->getConfiguration()Landroid/content/res/Configuration;
/* iget v2, v3, Landroid/content/res/Configuration;->orientation:I */
/* .line 395 */
/* .local v2, "screenOrientation":I */
int v0 = 0; // const/4 v0, 0x0
/* .line 397 */
/* .local v0, "deviceOrientation":I */
/* if-gez v3, :cond_1 */
/* .line 399 */
/* packed-switch v2, :pswitch_data_0 */
/* .line 438 */
/* .line 442 */
} // :cond_1
} // :goto_0
/* packed-switch v2, :pswitch_data_1 */
/* .line 481 */
int v0 = 0; // const/4 v0, 0x0
/* .line 484 */
} // :goto_1
/* .line 402 */
/* :pswitch_0 */
/* packed-switch v3, :pswitch_data_2 */
/* .line 415 */
/* .line 406 */
/* :pswitch_1 */
/* .line 411 */
/* :pswitch_2 */
/* .line 420 */
/* :pswitch_3 */
/* packed-switch v3, :pswitch_data_3 */
/* .line 433 */
/* .line 424 */
/* :pswitch_4 */
/* .line 429 */
/* :pswitch_5 */
/* .line 445 */
/* :pswitch_6 */
/* packed-switch v3, :pswitch_data_4 */
/* .line 458 */
int v0 = 0; // const/4 v0, 0x0
/* .line 460 */
/* .line 449 */
/* :pswitch_7 */
int v0 = 4; // const/4 v0, 0x4
/* .line 450 */
/* .line 454 */
/* :pswitch_8 */
int v0 = 3; // const/4 v0, 0x3
/* .line 455 */
/* .line 463 */
/* :pswitch_9 */
/* packed-switch v3, :pswitch_data_5 */
/* .line 476 */
int v0 = 0; // const/4 v0, 0x0
/* .line 478 */
/* .line 467 */
/* :pswitch_a */
int v0 = 1; // const/4 v0, 0x1
/* .line 468 */
/* .line 472 */
/* :pswitch_b */
int v0 = 2; // const/4 v0, 0x2
/* .line 473 */
/* .line 399 */
/* :pswitch_data_0 */
/* .packed-switch 0x1 */
/* :pswitch_3 */
/* :pswitch_0 */
} // .end packed-switch
/* .line 442 */
/* :pswitch_data_1 */
/* .packed-switch 0x1 */
/* :pswitch_9 */
/* :pswitch_6 */
} // .end packed-switch
/* .line 402 */
/* :pswitch_data_2 */
/* .packed-switch 0x0 */
/* :pswitch_1 */
/* :pswitch_2 */
/* :pswitch_1 */
/* :pswitch_2 */
} // .end packed-switch
/* .line 420 */
/* :pswitch_data_3 */
/* .packed-switch 0x0 */
/* :pswitch_4 */
/* :pswitch_5 */
/* :pswitch_4 */
/* :pswitch_5 */
} // .end packed-switch
/* .line 445 */
/* :pswitch_data_4 */
/* .packed-switch 0x0 */
/* :pswitch_7 */
/* :pswitch_8 */
/* :pswitch_8 */
/* :pswitch_7 */
} // .end packed-switch
/* .line 463 */
/* :pswitch_data_5 */
/* .packed-switch 0x0 */
/* :pswitch_a */
/* :pswitch_a */
/* :pswitch_b */
/* :pswitch_b */
} // .end packed-switch
} // .end method
public static void pushView ( android.view.View p0 ) {
/* .locals 1 */
/* .param p0, "inView" # Landroid/view/View; */
/* .prologue */
/* .line 490 */
v0 = org.haxe.nme.GameActivity.activity;
(( org.haxe.nme.GameActivity ) v0 ).doPause ( ); // invoke-virtual {v0}, Lorg/haxe/nme/GameActivity;->doPause()V
/* .line 491 */
v0 = org.haxe.nme.GameActivity.activity;
(( org.haxe.nme.GameActivity ) v0 ).setContentView ( p0 ); // invoke-virtual {v0, p0}, Lorg/haxe/nme/GameActivity;->setContentView(Landroid/view/View;)V
/* .line 492 */
return;
} // .end method
public static void setUserPreference ( java.lang.String p0, java.lang.String p1 ) {
/* .locals 5 */
/* .param p0, "inId" # Ljava/lang/String; */
/* .param p1, "inPreference" # Ljava/lang/String; */
/* .prologue */
/* .line 497 */
v2 = org.haxe.nme.GameActivity.activity;
final String v3 = "nmeAppPrefs"; // const-string v3, "nmeAppPrefs"
int v4 = 0; // const/4 v4, 0x0
(( org.haxe.nme.GameActivity ) v2 ).getSharedPreferences ( v3, v4 ); // invoke-virtual {v2, v3, v4}, Lorg/haxe/nme/GameActivity;->getSharedPreferences(Ljava/lang/String;I)Landroid/content/SharedPreferences;
/* .line 498 */
/* .local v1, "prefs":Landroid/content/SharedPreferences; */
/* .line 499 */
/* .local v0, "prefEditor":Landroid/content/SharedPreferences$Editor; */
/* .line 500 */
/* .line 501 */
return;
} // .end method
public static void showKeyboard ( Boolean p0 ) {
/* .locals 4 */
/* .param p0, "show" # Z */
/* .prologue */
int v3 = 0; // const/4 v3, 0x0
/* .line 506 */
v1 = org.haxe.nme.GameActivity.activity;
final String v2 = "input_method"; // const-string v2, "input_method"
(( org.haxe.nme.GameActivity ) v1 ).getSystemService ( v2 ); // invoke-virtual {v1, v2}, Lorg/haxe/nme/GameActivity;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;
/* check-cast v0, Landroid/view/inputmethod/InputMethodManager; */
/* .line 507 */
/* .local v0, "mgr":Landroid/view/inputmethod/InputMethodManager; */
v1 = org.haxe.nme.GameActivity.activity;
v1 = this.mView;
(( org.haxe.nme.MainView ) v1 ).getWindowToken ( ); // invoke-virtual {v1}, Lorg/haxe/nme/MainView;->getWindowToken()Landroid/os/IBinder;
(( android.view.inputmethod.InputMethodManager ) v0 ).hideSoftInputFromWindow ( v1, v3 ); // invoke-virtual {v0, v1, v3}, Landroid/view/inputmethod/InputMethodManager;->hideSoftInputFromWindow(Landroid/os/IBinder;I)Z
/* .line 509 */
if ( p0 != null) { // if-eqz p0, :cond_0
/* .line 511 */
int v1 = 2; // const/4 v1, 0x2
(( android.view.inputmethod.InputMethodManager ) v0 ).toggleSoftInput ( v1, v3 ); // invoke-virtual {v0, v1, v3}, Landroid/view/inputmethod/InputMethodManager;->toggleSoftInput(II)V
/* .line 516 */
} // :cond_0
return;
} // .end method
public static void vibrate ( Integer p0, Integer p1 ) {
/* .locals 7 */
/* .param p0, "period" # I */
/* .param p1, "duration" # I */
/* .prologue */
/* .line 521 */
v5 = org.haxe.nme.GameActivity.activity;
final String v6 = "vibrator"; // const-string v6, "vibrator"
(( org.haxe.nme.GameActivity ) v5 ).getSystemService ( v6 ); // invoke-virtual {v5, v6}, Lorg/haxe/nme/GameActivity;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;
/* check-cast v4, Landroid/os/Vibrator; */
/* .line 523 */
/* .local v4, "v":Landroid/os/Vibrator; */
/* if-nez p0, :cond_0 */
/* .line 525 */
/* int-to-long v5, p1 */
(( android.os.Vibrator ) v4 ).vibrate ( v5, v6 ); // invoke-virtual {v4, v5, v6}, Landroid/os/Vibrator;->vibrate(J)V
/* .line 540 */
} // :goto_0
return;
/* .line 529 */
} // :cond_0
/* div-int/lit8 v5, p0, 0x2 */
/* int-to-double v5, v5 */
java.lang.Math .ceil ( v5,v6 );
/* move-result-wide v5 */
/* double-to-int v3, v5 */
/* .line 530 */
/* .local v3, "periodMS":I */
/* div-int v5, p1, p0 */
/* mul-int/lit8 v5, v5, 0x2 */
/* int-to-double v5, v5 */
java.lang.Math .ceil ( v5,v6 );
/* move-result-wide v5 */
/* double-to-int v0, v5 */
/* .line 531 */
/* .local v0, "count":I */
/* new-array v2, v0, [J */
/* .line 533 */
/* .local v2, "pattern":[J */
int v1 = 0; // const/4 v1, 0x0
/* .local v1, "i":I */
} // :goto_1
/* if-ge v1, v0, :cond_1 */
/* .line 535 */
/* int-to-long v5, v3 */
/* aput-wide v5, v2, v1 */
/* .line 533 */
/* add-int/lit8 v1, v1, 0x1 */
/* .line 538 */
} // :cond_1
int v5 = -1; // const/4 v5, -0x1
(( android.os.Vibrator ) v4 ).vibrate ( v2, v5 ); // invoke-virtual {v4, v2, v5}, Landroid/os/Vibrator;->vibrate([JI)V
} // .end method
/* # virtual methods */
public void doPause ( ) {
/* .locals 2 */
/* .prologue */
/* .line 154 */
v0 = this._sound;
(( org.haxe.nme.Sound ) v0 ).doPause ( ); // invoke-virtual {v0}, Lorg/haxe/nme/Sound;->doPause()V
/* .line 156 */
v0 = this.mView;
int v1 = 2; // const/4 v1, 0x2
(( org.haxe.nme.MainView ) v0 ).sendActivity ( v1 ); // invoke-virtual {v0, v1}, Lorg/haxe/nme/MainView;->sendActivity(I)V
/* .line 157 */
v0 = this.mView;
(( org.haxe.nme.MainView ) v0 ).onPause ( ); // invoke-virtual {v0}, Lorg/haxe/nme/MainView;->onPause()V
/* .line 159 */
v0 = org.haxe.nme.GameActivity.sensorManager;
if ( v0 != null) { // if-eqz v0, :cond_0
/* .line 161 */
v0 = org.haxe.nme.GameActivity.sensorManager;
(( android.hardware.SensorManager ) v0 ).unregisterListener ( p0 ); // invoke-virtual {v0, p0}, Landroid/hardware/SensorManager;->unregisterListener(Landroid/hardware/SensorEventListener;)V
/* .line 163 */
} // :cond_0
return;
} // .end method
public void doResume ( ) {
/* .locals 4 */
/* .prologue */
(( com.agame.ZombiesVSAliens.MainActivity ) p0 ).getApplicationContext ( ); // invoke-virtual {p0}, Lcom/agame/ZombiesVSAliens/MainActivity;->getApplicationContext()Landroid/content/Context;
com.umeng.analytics.MobclickAgent .onPause ( v0 );
int v3 = 1; // const/4 v3, 0x1
/* .line 167 */
v0 = this.mView;
(( org.haxe.nme.MainView ) v0 ).onResume ( ); // invoke-virtual {v0}, Lorg/haxe/nme/MainView;->onResume()V
/* .line 169 */
v0 = this._sound;
(( org.haxe.nme.Sound ) v0 ).doResume ( ); // invoke-virtual {v0}, Lorg/haxe/nme/Sound;->doResume()V
/* .line 171 */
v0 = this.mView;
(( org.haxe.nme.MainView ) v0 ).sendActivity ( v3 ); // invoke-virtual {v0, v3}, Lorg/haxe/nme/MainView;->sendActivity(I)V
/* .line 173 */
v0 = org.haxe.nme.GameActivity.sensorManager;
if ( v0 != null) { // if-eqz v0, :cond_0
/* .line 175 */
v0 = org.haxe.nme.GameActivity.sensorManager;
v1 = org.haxe.nme.GameActivity.sensorManager;
(( android.hardware.SensorManager ) v1 ).getDefaultSensor ( v3 ); // invoke-virtual {v1, v3}, Landroid/hardware/SensorManager;->getDefaultSensor(I)Landroid/hardware/Sensor;
(( android.hardware.SensorManager ) v0 ).registerListener ( p0, v1, v3 ); // invoke-virtual {v0, p0, v1, v3}, Landroid/hardware/SensorManager;->registerListener(Landroid/hardware/SensorEventListener;Landroid/hardware/Sensor;I)Z
/* .line 176 */
v0 = org.haxe.nme.GameActivity.sensorManager;
v1 = org.haxe.nme.GameActivity.sensorManager;
int v2 = 2; // const/4 v2, 0x2
(( android.hardware.SensorManager ) v1 ).getDefaultSensor ( v2 ); // invoke-virtual {v1, v2}, Landroid/hardware/SensorManager;->getDefaultSensor(I)Landroid/hardware/Sensor;
(( android.hardware.SensorManager ) v0 ).registerListener ( p0, v1, v3 ); // invoke-virtual {v0, p0, v1, v3}, Landroid/hardware/SensorManager;->registerListener(Landroid/hardware/SensorEventListener;Landroid/hardware/Sensor;I)Z
/* .line 178 */
} // :cond_0
return;
} // .end method
public void onAccuracyChanged ( android.hardware.Sensor p0, Integer p1 ) {
/* .locals 0 */
/* .param p1, "sensor" # Landroid/hardware/Sensor; */
/* .param p2, "accuracy" # I */
/* .prologue */
/* .line 322 */
return;
} // .end method
protected void onCreate ( android.os.Bundle p0 ) {
/* .locals 4 */
/* .param p1, "state" # Landroid/os/Bundle; */
/* .prologue */
/* const/16 v2, 0x400 */
int v3 = 1; // const/4 v3, 0x1
/* .line 72 */
/* invoke-super {p0, p1}, Landroid/app/Activity;->onCreate(Landroid/os/Bundle;)V */
com.games.a .a ( p0 );
/* .line 74 */
/* .line 75 */
/* .line 76 */
/* new-instance v0, Landroid/os/Handler; */
/* invoke-direct {v0}, Landroid/os/Handler;-><init>()V */
this.mHandler = v0;
/* .line 77 */
(( org.haxe.nme.GameActivity ) p0 ).getAssets ( ); // invoke-virtual {p0}, Lorg/haxe/nme/GameActivity;->getAssets()Landroid/content/res/AssetManager;
/* .line 79 */
/* new-instance v0, Lorg/haxe/nme/Sound; */
(( org.haxe.nme.GameActivity ) p0 ).getApplication ( ); // invoke-virtual {p0}, Lorg/haxe/nme/GameActivity;->getApplication()Landroid/app/Application;
/* invoke-direct {v0, v1}, Lorg/haxe/nme/Sound;-><init>(Landroid/content/Context;)V */
this._sound = v0;
/* .line 82 */
(( org.haxe.nme.GameActivity ) p0 ).requestWindowFeature ( v3 ); // invoke-virtual {p0, v3}, Lorg/haxe/nme/GameActivity;->requestWindowFeature(I)Z
/* .line 83 */
(( org.haxe.nme.GameActivity ) p0 ).getWindow ( ); // invoke-virtual {p0}, Lorg/haxe/nme/GameActivity;->getWindow()Landroid/view/Window;
(( android.view.Window ) v0 ).setFlags ( v2, v2 ); // invoke-virtual {v0, v2, v2}, Landroid/view/Window;->setFlags(II)V
/* .line 85 */
/* new-instance v0, Landroid/util/DisplayMetrics; */
/* invoke-direct {v0}, Landroid/util/DisplayMetrics;-><init>()V */
/* .line 86 */
(( org.haxe.nme.GameActivity ) p0 ).getWindowManager ( ); // invoke-virtual {p0}, Lorg/haxe/nme/GameActivity;->getWindowManager()Landroid/view/WindowManager;
v1 = org.haxe.nme.GameActivity.metrics;
(( android.view.Display ) v0 ).getMetrics ( v1 ); // invoke-virtual {v0, v1}, Landroid/view/Display;->getMetrics(Landroid/util/DisplayMetrics;)V
/* .line 91 */
final String v0 = "std"; // const-string v0, "std"
java.lang.System .loadLibrary ( v0 );
/* .line 92 */
final String v0 = "regexp"; // const-string v0, "regexp"
java.lang.System .loadLibrary ( v0 );
/* .line 93 */
final String v0 = "zlib"; // const-string v0, "zlib"
java.lang.System .loadLibrary ( v0 );
/* .line 94 */
final String v0 = "nme"; // const-string v0, "nme"
java.lang.System .loadLibrary ( v0 );
/* .line 95 */
final String v0 = "std"; // const-string v0, "std"
java.lang.System .loadLibrary ( v0 );
/* .line 96 */
final String v0 = "regexp"; // const-string v0, "regexp"
java.lang.System .loadLibrary ( v0 );
/* .line 97 */
final String v0 = "zlib"; // const-string v0, "zlib"
java.lang.System .loadLibrary ( v0 );
/* .line 98 */
final String v0 = "nme"; // const-string v0, "nme"
java.lang.System .loadLibrary ( v0 );
/* .line 99 */
final String v0 = "ApplicationMain"; // const-string v0, "ApplicationMain"
org.haxe.HXCPP .run ( v0 );
/* .line 101 */
/* new-instance v0, Lorg/haxe/nme/MainView; */
(( org.haxe.nme.GameActivity ) p0 ).getApplication ( ); // invoke-virtual {p0}, Lorg/haxe/nme/GameActivity;->getApplication()Landroid/app/Application;
/* invoke-direct {v0, v1, p0}, Lorg/haxe/nme/MainView;-><init>(Landroid/content/Context;Landroid/app/Activity;)V */
this.mView = v0;
/* .line 102 */
v0 = this.mView;
(( org.haxe.nme.GameActivity ) p0 ).setContentView ( v0 ); // invoke-virtual {p0, v0}, Lorg/haxe/nme/GameActivity;->setContentView(Landroid/view/View;)V
/* .line 104 */
v0 = org.haxe.nme.GameActivity.activity;
final String v1 = "sensor"; // const-string v1, "sensor"
(( org.haxe.nme.GameActivity ) v0 ).getSystemService ( v1 ); // invoke-virtual {v0, v1}, Lorg/haxe/nme/GameActivity;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;
/* check-cast v0, Landroid/hardware/SensorManager; */
/* .line 106 */
v0 = org.haxe.nme.GameActivity.sensorManager;
if ( v0 != null) { // if-eqz v0, :cond_0
/* .line 108 */
v0 = org.haxe.nme.GameActivity.sensorManager;
v1 = org.haxe.nme.GameActivity.sensorManager;
(( android.hardware.SensorManager ) v1 ).getDefaultSensor ( v3 ); // invoke-virtual {v1, v3}, Landroid/hardware/SensorManager;->getDefaultSensor(I)Landroid/hardware/Sensor;
(( android.hardware.SensorManager ) v0 ).registerListener ( p0, v1, v3 ); // invoke-virtual {v0, p0, v1, v3}, Landroid/hardware/SensorManager;->registerListener(Landroid/hardware/SensorEventListener;Landroid/hardware/Sensor;I)Z
/* .line 109 */
v0 = org.haxe.nme.GameActivity.sensorManager;
v1 = org.haxe.nme.GameActivity.sensorManager;
int v2 = 2; // const/4 v2, 0x2
(( android.hardware.SensorManager ) v1 ).getDefaultSensor ( v2 ); // invoke-virtual {v1, v2}, Landroid/hardware/SensorManager;->getDefaultSensor(I)Landroid/hardware/Sensor;
(( android.hardware.SensorManager ) v0 ).registerListener ( p0, v1, v3 ); // invoke-virtual {v0, p0, v1, v3}, Landroid/hardware/SensorManager;->registerListener(Landroid/hardware/SensorEventListener;Landroid/hardware/Sensor;I)Z
/* .line 111 */
} // :cond_0
return;
} // .end method
protected void onDestroy ( ) {
/* .locals 2 */
/* .prologue */
/* .line 328 */
v0 = this.mView;
int v1 = 3; // const/4 v1, 0x3
(( org.haxe.nme.MainView ) v0 ).sendActivity ( v1 ); // invoke-virtual {v0, v1}, Lorg/haxe/nme/MainView;->sendActivity(I)V
/* .line 329 */
int v0 = 0; // const/4 v0, 0x0
/* .line 330 */
/* invoke-super {p0}, Landroid/app/Activity;->onDestroy()V */
/* .line 331 */
return;
} // .end method
protected void onPause ( ) {
/* .locals 1 */
/* .prologue */
(( org.haxe.nme.GameActivity ) p0 ).getApplicationContext ( ); // invoke-virtual {p0}, Lorg/haxe/nme/GameActivity;->getApplicationContext()Landroid/content/Context;
com.umeng.analytics.MobclickAgent .onPause ( v0 );
/* .line 336 */
/* invoke-super {p0}, Landroid/app/Activity;->onPause()V */
/* .line 337 */
(( org.haxe.nme.GameActivity ) p0 ).doPause ( ); // invoke-virtual {p0}, Lorg/haxe/nme/GameActivity;->doPause()V
/* .line 338 */
return;
} // .end method
protected void onResume ( ) {
/* .locals 1 */
/* .prologue */
(( org.haxe.nme.GameActivity ) p0 ).getApplicationContext ( ); // invoke-virtual {p0}, Lorg/haxe/nme/GameActivity;->getApplicationContext()Landroid/content/Context;
com.umeng.analytics.MobclickAgent .onResume ( v0 );
/* .line 343 */
/* invoke-super {p0}, Landroid/app/Activity;->onResume()V */
/* .line 344 */
(( org.haxe.nme.GameActivity ) p0 ).doResume ( ); // invoke-virtual {p0}, Lorg/haxe/nme/GameActivity;->doResume()V
/* .line 345 */
return;
} // .end method
public void onSensorChanged ( android.hardware.SensorEvent p0 ) {
/* .locals 5 */
/* .param p1, "event" # Landroid/hardware/SensorEvent; */
/* .prologue */
/* .line 349 */
/* invoke-direct {p0, p1}, Lorg/haxe/nme/GameActivity;->loadNewSensorData(Landroid/hardware/SensorEvent;)V */
/* .line 351 */
v1 = org.haxe.nme.GameActivity.accelData;
if ( v1 != null) { // if-eqz v1, :cond_0
v1 = org.haxe.nme.GameActivity.magnetData;
if ( v1 != null) { // if-eqz v1, :cond_0
/* .line 353 */
v1 = org.haxe.nme.GameActivity.rotationMatrix;
v2 = org.haxe.nme.GameActivity.inclinationMatrix;
v3 = org.haxe.nme.GameActivity.accelData;
v4 = org.haxe.nme.GameActivity.magnetData;
v0 = android.hardware.SensorManager .getRotationMatrix ( v1,v2,v3,v4 );
/* .line 354 */
/* .local v0, "foundRotationMatrix":Z */
if ( v0 != null) { // if-eqz v0, :cond_0
/* .line 356 */
v1 = org.haxe.nme.GameActivity.rotationMatrix;
v2 = org.haxe.nme.GameActivity.orientData;
android.hardware.SensorManager .getOrientation ( v1,v2 );
/* .line 357 */
v1 = org.haxe.nme.GameActivity.orientData;
int v2 = 0; // const/4 v2, 0x0
/* aget v1, v1, v2 */
v2 = org.haxe.nme.GameActivity.orientData;
int v3 = 1; // const/4 v3, 0x1
/* aget v2, v2, v3 */
v3 = org.haxe.nme.GameActivity.orientData;
int v4 = 2; // const/4 v4, 0x2
/* aget v3, v3, v4 */
org.haxe.nme.NME .onOrientationUpdate ( v1,v2,v3 );
/* .line 361 */
} // .end local v0 # "foundRotationMatrix":Z
} // :cond_0
v1 = /* invoke-direct {p0}, Lorg/haxe/nme/GameActivity;->prepareDeviceOrientation()I */
org.haxe.nme.NME .onDeviceOrientationUpdate ( v1 );
/* .line 362 */
org.haxe.nme.NME .onNormalOrientationFound ( v1 );
/* .line 363 */
return;
} // .end method
public void queueRunnable ( java.lang.Runnable p0 ) {
/* .locals 2 */
/* .param p1, "runnable" # Ljava/lang/Runnable; */
/* .prologue */
/* .line 198 */
final String v0 = "GameActivity"; // const-string v0, "GameActivity"
final String v1 = "queueing..."; // const-string v1, "queueing..."
android.util.Log .e ( v0,v1 );
/* .line 199 */
return;
} // .end method
