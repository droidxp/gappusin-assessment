public class com.natenai.jniutil.NateGameJNIUtilLib {
	 /* .source "NateGameJNIUtilLib.java" */
	 /* # static fields */
	 public static final Integer BITMAP_FORMAT_ALPHA_8;
	 public static final Integer BITMAP_FORMAT_ARGB_4444;
	 public static final Integer BITMAP_FORMAT_ARGB_8888;
	 public static final Integer BITMAP_FORMAT_RGB_565;
	 public static Boolean DebugPref;
	 public static Boolean DebugSound;
	 public static Boolean DebugTouchEvent;
	 public static java.lang.String DocFilePath;
	 public static Boolean DrawFillScreen;
	 public static Boolean DrawFromTop2Bottom;
	 public static javax.microedition.khronos.opengles.GL10 MainGL;
	 public static final Integer NATIVE_EVENT_ON_BACK_BTN;
	 public static final Integer NATIVE_EVENT_ON_PAUSE;
	 public static final Integer NATIVE_EVENT_ON_RESUME;
	 public static final Integer NATIVE_EVENT_ON_TERMINATE;
	 public static final java.lang.String PREFS_NAME;
	 public static Integer ScreenHeight;
	 public static Boolean ScreenInfoIsReady;
	 public static Integer ScreenWidth;
	 public static Float SoundPoolMaxPitchRate;
	 public static Float SoundPoolMaxVolume;
	 public static Integer VirtualScreenHeight;
	 public static Integer VirtualScreenWidth;
	 public static java.util.ArrayList mActiveSoundLoopList;
	 /* .annotation system Ldalvik/annotation/Signature; */
	 /* value = { */
	 /* "Ljava/util/ArrayList", */
	 /* "<", */
	 /* "Ljava/lang/Integer;", */
	 /* ">;" */
	 /* } */
} // .end annotation
} // .end field
private static android.graphics.BitmapFactory$Options mBitmapOptions;
private static com.natenai.jniutil.NateBaseActivity mMainActivity;
private static android.content.SharedPreferences mSettings;
public static java.util.ArrayList mSoundLoadedList;
/* .annotation system Ldalvik/annotation/Signature; */
/* value = { */
/* "Ljava/util/ArrayList", */
/* "<", */
/* "Ljava/lang/Integer;", */
/* ">;" */
/* } */
} // .end annotation
} // .end field
public static android.media.SoundPool mSoundPool;
static Integer prevTextureHeight;
static Integer prevTextureWidth;
/* # direct methods */
static com.natenai.jniutil.NateGameJNIUtilLib ( ) {
/* .locals 4 */
/* .prologue */
/* const/16 v3, 0x1e0 */
/* const/16 v2, 0x140 */
int v1 = 0; // const/4 v1, 0x0
/* .line 30 */
com.natenai.jniutil.NateGameJNIUtilLib.DebugSound = (v1!= 0);
/* .line 31 */
com.natenai.jniutil.NateGameJNIUtilLib.DebugPref = (v1!= 0);
/* .line 32 */
com.natenai.jniutil.NateGameJNIUtilLib.DebugTouchEvent = (v1!= 0);
/* .line 50 */
final String v0 = ""; // const-string v0, ""
/* .line 52 */
com.natenai.jniutil.NateGameJNIUtilLib.ScreenInfoIsReady = (v1!= 0);
/* .line 54 */
com.natenai.jniutil.NateGameJNIUtilLib.DrawFillScreen = (v1!= 0);
/* .line 55 */
com.natenai.jniutil.NateGameJNIUtilLib.DrawFromTop2Bottom = (v1!= 0);
/* .line 57 */
/* .line 58 */
/* .line 60 */
/* .line 61 */
/* .line 64 */
final String v0 = "nategame"; // const-string v0, "nategame"
java.lang.System .loadLibrary ( v0 );
/* .line 212 */
/* .line 213 */
/* .line 216 */
/* new-instance v0, Landroid/graphics/BitmapFactory$Options; */
/* invoke-direct {v0}, Landroid/graphics/BitmapFactory$Options;-><init>()V */
/* .line 367 */
int v0 = 0; // const/4 v0, 0x0
/* .line 368 */
/* new-instance v0, Ljava/util/ArrayList; */
/* invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V */
/* .line 369 */
/* new-instance v0, Ljava/util/ArrayList; */
/* invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V */
/* .line 447 */
/* const/high16 v0, 0x3fc00000 # 1.5f */
/* .line 448 */
/* const v0, 0x3f7d70a4 # 0.99f */
/* .line 28 */
return;
} // .end method
public com.natenai.jniutil.NateGameJNIUtilLib ( ) {
/* .locals 0 */
/* .prologue */
/* .line 28 */
/* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
return;
} // .end method
public static com.natenai.jniutil.NateBaseActivity GetMainActivity ( ) {
/* .locals 1 */
/* .prologue */
/* .line 104 */
v0 = com.natenai.jniutil.NateGameJNIUtilLib.mMainActivity;
} // .end method
public static void SetMainActivity ( com.natenai.jniutil.NateBaseActivity p0 ) {
/* .locals 7 */
/* .param p0, "activity" # Lcom/natenai/jniutil/NateBaseActivity; */
/* .prologue */
/* .line 108 */
/* .line 110 */
com.natenai.jniutil.NateGameJNIUtilLib .SetupDocDir ( );
/* .line 112 */
final String v4 = "Settings"; // const-string v4, "Settings"
int v5 = 0; // const/4 v5, 0x0
(( com.natenai.jniutil.NateBaseActivity ) p0 ).getSharedPreferences ( v4, v5 ); // invoke-virtual {p0, v4, v5}, Lcom/natenai/jniutil/NateBaseActivity;->getSharedPreferences(Ljava/lang/String;I)Landroid/content/SharedPreferences;
/* .line 114 */
/* new-instance v0, Landroid/util/DisplayMetrics; */
/* invoke-direct {v0}, Landroid/util/DisplayMetrics;-><init>()V */
/* .line 115 */
/* .local v0, "dm":Landroid/util/DisplayMetrics; */
v4 = com.natenai.jniutil.NateGameJNIUtilLib.mMainActivity;
(( com.natenai.jniutil.NateBaseActivity ) v4 ).getWindowManager ( ); // invoke-virtual {v4}, Lcom/natenai/jniutil/NateBaseActivity;->getWindowManager()Landroid/view/WindowManager;
(( android.view.Display ) v4 ).getMetrics ( v0 ); // invoke-virtual {v4, v0}, Landroid/view/Display;->getMetrics(Landroid/util/DisplayMetrics;)V
/* .line 116 */
/* iget v4, v0, Landroid/util/DisplayMetrics;->widthPixels:I */
/* .line 117 */
/* iget v4, v0, Landroid/util/DisplayMetrics;->heightPixels:I */
/* .line 120 */
/* iget v4, v0, Landroid/util/DisplayMetrics;->widthPixels:I */
/* int-to-float v4, v4 */
/* iget v5, v0, Landroid/util/DisplayMetrics;->xdpi:F */
/* div-float v2, v4, v5 */
/* .line 121 */
/* .local v2, "screenInchesX":F */
/* iget v4, v0, Landroid/util/DisplayMetrics;->heightPixels:I */
/* int-to-float v4, v4 */
/* iget v5, v0, Landroid/util/DisplayMetrics;->ydpi:F */
/* div-float v3, v4, v5 */
/* .line 122 */
/* .local v3, "screenInchesY":F */
/* mul-float v4, v2, v2 */
/* mul-float v5, v3, v3 */
/* add-float/2addr v4, v5 */
/* float-to-double v4, v4 */
java.lang.Math .sqrt ( v4,v5 );
/* move-result-wide v4 */
/* double-to-float v1, v4 */
/* .line 123 */
/* .local v1, "screenInches":F */
v4 = com.natenai.jniutil.NateBaseActivity.natenaiAppName;
/* new-instance v5, Ljava/lang/StringBuilder; */
final String v6 = "Display DPI: w="; // const-string v6, "Display DPI: w="
/* invoke-direct {v5, v6}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V */
(( java.lang.StringBuilder ) v5 ).append ( v6 ); // invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;
final String v6 = ", h="; // const-string v6, ", h="
(( java.lang.StringBuilder ) v5 ).append ( v6 ); // invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v5 ).append ( v6 ); // invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;
final String v6 = ", xdpi="; // const-string v6, ", xdpi="
(( java.lang.StringBuilder ) v5 ).append ( v6 ); // invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
/* iget v6, v0, Landroid/util/DisplayMetrics;->xdpi:F */
(( java.lang.StringBuilder ) v5 ).append ( v6 ); // invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;
final String v6 = " ,ydpi="; // const-string v6, " ,ydpi="
(( java.lang.StringBuilder ) v5 ).append ( v6 ); // invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
/* iget v6, v0, Landroid/util/DisplayMetrics;->ydpi:F */
(( java.lang.StringBuilder ) v5 ).append ( v6 ); // invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;
final String v6 = " -> "; // const-string v6, " -> "
(( java.lang.StringBuilder ) v5 ).append ( v6 ); // invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v5 ).append ( v1 ); // invoke-virtual {v5, v1}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;
final String v6 = " inches"; // const-string v6, " inches"
(( java.lang.StringBuilder ) v5 ).append ( v6 ); // invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v5 ).toString ( ); // invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
android.util.Log .d ( v4,v5 );
/* .line 125 */
/* .line 126 */
/* .line 137 */
/* sget-boolean v4, Lcom/natenai/jniutil/NateGameJNIUtilLib;->DrawFromTop2Bottom:Z */
if ( v4 != null) { // if-eqz v4, :cond_0
/* .line 138 */
v4 = com.natenai.jniutil.NateBaseActivity.natenaiAppName;
final String v5 = "WARNING: DrawFromTop2Bottom = true is not working with clipping and touches!"; // const-string v5, "WARNING: DrawFromTop2Bottom = true is not working with clipping and touches!"
android.util.Log .d ( v4,v5 );
/* .line 140 */
} // :cond_0
int v4 = 1; // const/4 v4, 0x1
com.natenai.jniutil.NateGameJNIUtilLib.ScreenInfoIsReady = (v4!= 0);
/* .line 141 */
return;
} // .end method
private static void SetupDocDir ( ) {
/* .locals 7 */
/* .prologue */
/* .line 69 */
v5 = com.natenai.jniutil.NateGameJNIUtilLib.DocFilePath;
v5 = (( java.lang.String ) v5 ).length ( ); // invoke-virtual {v5}, Ljava/lang/String;->length()I
/* if-lez v5, :cond_1 */
/* .line 102 */
/* .local v2, "mExternalStorageWriteable":Z */
/* .local v4, "state":Ljava/lang/String; */
} // :cond_0
} // :goto_0
return;
/* .line 72 */
} // .end local v2 # "mExternalStorageWriteable":Z
} // .end local v4 # "state":Ljava/lang/String;
} // :cond_1
int v1 = 0; // const/4 v1, 0x0
/* .line 73 */
/* .local v1, "mExternalStorageAvailable":Z */
int v2 = 0; // const/4 v2, 0x0
/* .line 74 */
/* .restart local v2 # "mExternalStorageWriteable":Z */
android.os.Environment .getExternalStorageState ( );
/* .line 76 */
/* .restart local v4 # "state":Ljava/lang/String; */
final String v5 = "mounted"; // const-string v5, "mounted"
v5 = (( java.lang.String ) v5 ).equals ( v4 ); // invoke-virtual {v5, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
if ( v5 != null) { // if-eqz v5, :cond_2
/* .line 78 */
int v2 = 1; // const/4 v2, 0x1
/* move v1, v2 */
/* .line 89 */
} // .end local v1 # "mExternalStorageAvailable":Z
} // :goto_1
if ( v1 != null) { // if-eqz v1, :cond_0
if ( v2 != null) { // if-eqz v2, :cond_0
/* .line 91 */
android.os.Environment .getExternalStorageDirectory ( );
/* .line 92 */
/* .local v0, "fdir":Ljava/io/File; */
/* new-instance v5, Ljava/lang/StringBuilder; */
(( java.io.File ) v0 ).getAbsolutePath ( ); // invoke-virtual {v0}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;
java.lang.String .valueOf ( v6 );
/* invoke-direct {v5, v6}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V */
final String v6 = "/Android/data/"; // const-string v6, "/Android/data/"
(( java.lang.StringBuilder ) v5 ).append ( v6 ); // invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
v6 = com.natenai.jniutil.NateGameJNIUtilLib.mMainActivity;
(( com.natenai.jniutil.NateBaseActivity ) v6 ).getPackageName ( ); // invoke-virtual {v6}, Lcom/natenai/jniutil/NateBaseActivity;->getPackageName()Ljava/lang/String;
(( java.lang.StringBuilder ) v5 ).append ( v6 ); // invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
final String v6 = "/files"; // const-string v6, "/files"
(( java.lang.StringBuilder ) v5 ).append ( v6 ); // invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v5 ).toString ( ); // invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
/* .line 93 */
/* new-instance v3, Ljava/io/File; */
/* new-instance v5, Ljava/lang/StringBuilder; */
v6 = com.natenai.jniutil.NateGameJNIUtilLib.DocFilePath;
java.lang.String .valueOf ( v6 );
/* invoke-direct {v5, v6}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V */
final String v6 = "/"; // const-string v6, "/"
(( java.lang.StringBuilder ) v5 ).append ( v6 ); // invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v5 ).toString ( ); // invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
/* invoke-direct {v3, v5}, Ljava/io/File;-><init>(Ljava/lang/String;)V */
/* .line 95 */
/* .local v3, "newDir":Ljava/io/File; */
try { // :try_start_0
(( java.io.File ) v3 ).mkdirs ( ); // invoke-virtual {v3}, Ljava/io/File;->mkdirs()Z
/* :try_end_0 */
/* .catch Ljava/lang/Exception; {:try_start_0 ..:try_end_0} :catch_0 */
/* .line 96 */
/* :catch_0 */
/* move-exception v5 */
/* .line 79 */
} // .end local v0 # "fdir":Ljava/io/File;
} // .end local v3 # "newDir":Ljava/io/File;
/* .restart local v1 # "mExternalStorageAvailable":Z */
} // :cond_2
final String v5 = "mounted_ro"; // const-string v5, "mounted_ro"
v5 = (( java.lang.String ) v5 ).equals ( v4 ); // invoke-virtual {v5, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
if ( v5 != null) { // if-eqz v5, :cond_3
/* .line 81 */
int v1 = 1; // const/4 v1, 0x1
/* .line 82 */
int v2 = 0; // const/4 v2, 0x0
/* .line 86 */
} // :cond_3
int v2 = 0; // const/4 v2, 0x0
/* move v1, v2 */
/* .local v1, "mExternalStorageAvailable":I */
} // .end method
static java.lang.String changeExtension ( java.lang.String p0, java.lang.String p1 ) {
/* .locals 3 */
/* .param p0, "originalName" # Ljava/lang/String; */
/* .param p1, "newExtension" # Ljava/lang/String; */
/* .prologue */
/* .line 414 */
final String v1 = "."; // const-string v1, "."
v0 = (( java.lang.String ) p0 ).lastIndexOf ( v1 ); // invoke-virtual {p0, v1}, Ljava/lang/String;->lastIndexOf(Ljava/lang/String;)I
/* .line 415 */
/* .local v0, "lastDot":I */
int v1 = -1; // const/4 v1, -0x1
/* if-eq v0, v1, :cond_0 */
/* .line 416 */
/* new-instance v1, Ljava/lang/StringBuilder; */
int v2 = 0; // const/4 v2, 0x0
(( java.lang.String ) p0 ).substring ( v2, v0 ); // invoke-virtual {p0, v2, v0}, Ljava/lang/String;->substring(II)Ljava/lang/String;
java.lang.String .valueOf ( v2 );
/* invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V */
(( java.lang.StringBuilder ) v1 ).append ( p1 ); // invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v1 ).toString ( ); // invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
/* .line 418 */
} // :goto_0
} // :cond_0
/* new-instance v1, Ljava/lang/StringBuilder; */
java.lang.String .valueOf ( p0 );
/* invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V */
(( java.lang.StringBuilder ) v1 ).append ( p1 ); // invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v1 ).toString ( ); // invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
} // .end method
public static Integer get_debug_value ( java.lang.String p0 ) {
/* .locals 1 */
/* .param p0, "debugValue" # Ljava/lang/String; */
/* .prologue */
/* .line 159 */
final String v0 = "width_test"; // const-string v0, "width_test"
v0 = (( java.lang.String ) p0 ).equalsIgnoreCase ( v0 ); // invoke-virtual {p0, v0}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z
if ( v0 != null) { // if-eqz v0, :cond_0
/* .line 160 */
/* const/16 v0, 0x1e0 */
/* .line 168 */
} // :goto_0
/* .line 162 */
} // :cond_0
final String v0 = "height_test"; // const-string v0, "height_test"
v0 = (( java.lang.String ) p0 ).equalsIgnoreCase ( v0 ); // invoke-virtual {p0, v0}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z
if ( v0 != null) { // if-eqz v0, :cond_1
/* .line 163 */
/* const/16 v0, 0x140 */
/* .line 165 */
} // :cond_1
final String v0 = "fov"; // const-string v0, "fov"
v0 = (( java.lang.String ) p0 ).equalsIgnoreCase ( v0 ); // invoke-virtual {p0, v0}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z
if ( v0 != null) { // if-eqz v0, :cond_2
/* .line 166 */
/* const/16 v0, 0x3f */
/* .line 168 */
} // :cond_2
int v0 = 0; // const/4 v0, 0x0
} // .end method
public static java.lang.String get_doc_dir ( ) {
/* .locals 1 */
/* .prologue */
/* .line 549 */
v0 = com.natenai.jniutil.NateGameJNIUtilLib.DocFilePath;
} // .end method
public static Integer get_prev_texture_height ( ) {
/* .locals 1 */
/* .prologue */
/* .line 363 */
} // .end method
public static Integer get_prev_texture_width ( ) {
/* .locals 1 */
/* .prologue */
/* .line 362 */
} // .end method
public static Integer is_ready_to_show_interstitial_ad ( ) {
/* .locals 1 */
/* .prologue */
/* .line 202 */
com.natenai.jniutil.NateAdsManager .getInstance ( );
v0 = (( com.natenai.jniutil.NateAdsManager ) v0 ).isReadyToShowInterstitialAd ( ); // invoke-virtual {v0}, Lcom/natenai/jniutil/NateAdsManager;->isReadyToShowInterstitialAd()Z
if ( v0 != null) { // if-eqz v0, :cond_0
int v0 = 1; // const/4 v0, 0x1
} // :goto_0
} // :cond_0
int v0 = 0; // const/4 v0, 0x0
} // .end method
public static Integer load_texture ( java.lang.String p0, Integer p1 ) {
/* .locals 28 */
/* .param p0, "fname" # Ljava/lang/String; */
/* .param p1, "format" # I */
/* .prologue */
/* .line 219 */
final String v24 = "load_texture"; // const-string v24, "load_texture"
/* move-object/from16 v0, v24 */
/* move-object/from16 v1, p0 */
android.util.Log .v ( v0,v1 );
/* .line 221 */
int v13 = 0; // const/4 v13, 0x0
/* .line 224 */
/* .local v13, "isCompressedFormat":Z */
final String v24 = ".pvr"; // const-string v24, ".pvr"
/* move-object/from16 v0, p0 */
/* move-object/from16 v1, v24 */
v24 = (( java.lang.String ) v0 ).endsWith ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/String;->endsWith(Ljava/lang/String;)Z
if ( v24 != null) { // if-eqz v24, :cond_0
/* .line 226 */
int v13 = 1; // const/4 v13, 0x1
/* .line 227 */
final String v24 = ".png"; // const-string v24, ".png"
/* move-object/from16 v0, p0 */
/* move-object/from16 v1, v24 */
com.natenai.jniutil.NateGameJNIUtilLib .changeExtension ( v0,v1 );
/* .line 229 */
final String v24 = "env.png"; // const-string v24, "env.png"
/* move-object/from16 v0, p0 */
/* move-object/from16 v1, v24 */
v24 = (( java.lang.String ) v0 ).equals ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
if ( v24 != null) { // if-eqz v24, :cond_7
/* .line 230 */
/* const/16 p1, 0x0 */
/* .line 235 */
} // :cond_0
} // :goto_0
v24 = com.natenai.jniutil.NateGameJNIUtilLib.mMainActivity;
/* invoke-virtual/range {v24 ..v24}, Lcom/natenai/jniutil/NateBaseActivity;->getAssets()Landroid/content/res/AssetManager; */
/* .line 237 */
/* .local v4, "am":Landroid/content/res/AssetManager; */
/* const/16 v24, 0x1 */
/* move/from16 v0, v24 */
/* new-array v0, v0, [I */
/* move-object/from16 v22, v0 */
/* .line 238 */
/* .local v22, "textures":[I */
/* const/16 v20, 0x0 */
/* .line 240 */
/* .local v20, "textureID":I */
/* move-object/from16 v12, p0 */
/* .line 241 */
/* .local v12, "hdFilename":Ljava/lang/String; */
/* move-object/from16 v10, p0 */
/* .line 242 */
/* .local v10, "filenameTry1":Ljava/lang/String; */
/* move-object/from16 v11, p0 */
/* .line 243 */
/* .local v11, "filenameTry2":Ljava/lang/String; */
/* move/from16 v0, v24 */
/* move/from16 v1, v25 */
/* if-ge v0, v1, :cond_8 */
/* .line 244 */
/* .local v16, "lowestSide":I */
} // :goto_1
/* const/16 v24, 0x140 */
/* move/from16 v0, v16 */
/* move/from16 v1, v24 */
/* if-le v0, v1, :cond_9 */
/* const/16 v18, 0x1 */
/* .line 245 */
/* .local v18, "shouldLoadHDImage":Z */
} // :goto_2
int v14 = 0; // const/4 v14, 0x0
/* .line 248 */
/* .local v14, "isHDImage":Z */
final String v24 = "."; // const-string v24, "."
/* move-object/from16 v0, p0 */
/* move-object/from16 v1, v24 */
v15 = (( java.lang.String ) v0 ).lastIndexOf ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/String;->lastIndexOf(Ljava/lang/String;)I
/* .line 249 */
/* .local v15, "lastDot":I */
/* const/16 v24, -0x1 */
/* move/from16 v0, v24 */
/* if-eq v15, v0, :cond_1 */
/* .line 250 */
/* const/16 v24, 0x0 */
/* move-object/from16 v0, p0 */
/* move/from16 v1, v24 */
(( java.lang.String ) v0 ).substring ( v1, v15 ); // invoke-virtual {v0, v1, v15}, Ljava/lang/String;->substring(II)Ljava/lang/String;
/* .line 251 */
/* .local v9, "filenamePart":Ljava/lang/String; */
/* move-object/from16 v0, p0 */
(( java.lang.String ) v0 ).substring ( v15 ); // invoke-virtual {v0, v15}, Ljava/lang/String;->substring(I)Ljava/lang/String;
/* .line 252 */
/* .local v8, "extPart":Ljava/lang/String; */
/* new-instance v24, Ljava/lang/StringBuilder; */
java.lang.String .valueOf ( v9 );
/* invoke-direct/range {v24 ..v25}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V */
final String v25 = "@2x"; // const-string v25, "@2x"
/* invoke-virtual/range {v24 ..v25}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder; */
/* move-object/from16 v0, v24 */
(( java.lang.StringBuilder ) v0 ).append ( v8 ); // invoke-virtual {v0, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
/* invoke-virtual/range {v24 ..v24}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String; */
/* .line 255 */
} // .end local v8 # "extPart":Ljava/lang/String;
} // .end local v9 # "filenamePart":Ljava/lang/String;
} // :cond_1
if ( v18 != null) { // if-eqz v18, :cond_a
/* .line 256 */
/* move-object v10, v12 */
/* .line 260 */
} // :goto_3
/* const/16 v19, 0x0 */
/* .line 264 */
/* .local v19, "stream":Ljava/io/InputStream; */
try { // :try_start_0
(( android.content.res.AssetManager ) v4 ).open ( v10 ); // invoke-virtual {v4, v10}, Landroid/content/res/AssetManager;->open(Ljava/lang/String;)Ljava/io/InputStream;
/* .line 265 */
final String v24 = "@2x"; // const-string v24, "@2x"
/* move-object/from16 v0, v24 */
(( java.lang.String ) v10 ).contains ( v0 ); // invoke-virtual {v10, v0}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z
/* :try_end_0 */
v14 = /* .catch Ljava/lang/Exception; {:try_start_0 ..:try_end_0} :catch_0 */
/* .line 273 */
} // :goto_4
/* if-nez v19, :cond_2 */
/* .line 276 */
try { // :try_start_1
(( android.content.res.AssetManager ) v4 ).open ( v11 ); // invoke-virtual {v4, v11}, Landroid/content/res/AssetManager;->open(Ljava/lang/String;)Ljava/io/InputStream;
/* .line 277 */
final String v24 = "@2x"; // const-string v24, "@2x"
/* move-object/from16 v0, v24 */
(( java.lang.String ) v11 ).contains ( v0 ); // invoke-virtual {v11, v0}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z
/* :try_end_1 */
v14 = /* .catch Ljava/lang/Exception; {:try_start_1 ..:try_end_1} :catch_1 */
/* .line 286 */
} // :cond_2
int v5 = 0; // const/4 v5, 0x0
/* .line 288 */
/* .local v5, "bitmap":Landroid/graphics/Bitmap; */
try { // :try_start_2
v24 = com.natenai.jniutil.NateGameJNIUtilLib.mBitmapOptions;
/* const/16 v25, 0x0 */
/* move/from16 v0, v25 */
/* move-object/from16 v1, v24 */
/* iput-boolean v0, v1, Landroid/graphics/BitmapFactory$Options;->inScaled:Z */
/* .line 290 */
/* const/16 v24, 0x1 */
/* move/from16 v0, p1 */
/* move/from16 v1, v24 */
/* if-ne v0, v1, :cond_b */
/* .line 291 */
v24 = com.natenai.jniutil.NateGameJNIUtilLib.mBitmapOptions;
v25 = android.graphics.Bitmap$Config.ARGB_4444;
/* move-object/from16 v0, v25 */
/* move-object/from16 v1, v24 */
this.inPreferredConfig = v0;
/* .line 309 */
} // :goto_5
/* const/16 v24, 0x0 */
v25 = com.natenai.jniutil.NateGameJNIUtilLib.mBitmapOptions;
/* move-object/from16 v0, v19 */
/* move-object/from16 v1, v24 */
/* move-object/from16 v2, v25 */
android.graphics.BitmapFactory .decodeStream ( v0,v1,v2 );
/* .line 311 */
v24 = (( android.graphics.Bitmap ) v5 ).getWidth ( ); // invoke-virtual {v5}, Landroid/graphics/Bitmap;->getWidth()I
/* .line 312 */
v24 = (( android.graphics.Bitmap ) v5 ).getHeight ( ); // invoke-virtual {v5}, Landroid/graphics/Bitmap;->getHeight()I
/* .line 314 */
/* const/16 v25, 0x200 */
/* move/from16 v0, v24 */
/* move/from16 v1, v25 */
/* if-le v0, v1, :cond_3 */
/* const/16 v25, 0x200 */
/* move/from16 v0, v24 */
/* move/from16 v1, v25 */
/* if-le v0, v1, :cond_3 */
/* .line 315 */
int v14 = 1; // const/4 v14, 0x1
/* .line 317 */
} // :cond_3
if ( v14 != null) { // if-eqz v14, :cond_f
/* const/16 v24, 0x140 */
/* move/from16 v0, v16 */
/* move/from16 v1, v24 */
/* if-gt v0, v1, :cond_f */
/* const/16 v17, 0x1 */
/* .line 320 */
/* .local v17, "needToReduceSize":Z */
} // :goto_6
if ( v17 != null) { // if-eqz v17, :cond_4
/* .line 322 */
/* div-int/lit8 v24, v24, 0x2 */
/* .line 323 */
/* div-int/lit8 v24, v24, 0x2 */
/* .line 326 */
/* const/16 v26, 0x1 */
/* move/from16 v0, v24 */
/* move/from16 v1, v25 */
/* move/from16 v2, v26 */
android.graphics.Bitmap .createScaledBitmap ( v5,v0,v1,v2 );
/* .line 327 */
/* .local v23, "tmpBitmap":Landroid/graphics/Bitmap; */
(( android.graphics.Bitmap ) v5 ).recycle ( ); // invoke-virtual {v5}, Landroid/graphics/Bitmap;->recycle()V
/* .line 328 */
/* move-object/from16 v5, v23 */
/* .line 331 */
} // .end local v23 # "tmpBitmap":Landroid/graphics/Bitmap;
} // :cond_4
v24 = com.natenai.jniutil.NateGameJNIUtilLib.MainGL;
/* const/16 v25, 0x1 */
/* const/16 v26, 0x0 */
/* move-object/from16 v0, v24 */
/* move/from16 v1, v25 */
/* move-object/from16 v2, v22 */
/* move/from16 v3, v26 */
/* .line 332 */
/* const/16 v24, 0x0 */
/* aget v20, v22, v24 */
/* .line 333 */
v24 = com.natenai.jniutil.NateGameJNIUtilLib.MainGL;
/* const/16 v25, 0xde1 */
/* move-object/from16 v0, v24 */
/* move/from16 v1, v25 */
/* move/from16 v2, v20 */
/* .line 336 */
v24 = com.natenai.jniutil.NateGameJNIUtilLib.MainGL;
/* const/16 v25, 0xde1 */
/* const/16 v26, 0x2800 */
/* const v27, 0x46180400 # 9729.0f */
/* invoke-interface/range {v24 ..v27}, Ljavax/microedition/khronos/opengles/GL10;->glTexParameterf(IIF)V */
/* .line 337 */
v24 = com.natenai.jniutil.NateGameJNIUtilLib.MainGL;
/* const/16 v25, 0xde1 */
/* const/16 v26, 0x2801 */
/* const v27, 0x46180400 # 9729.0f */
/* invoke-interface/range {v24 ..v27}, Ljavax/microedition/khronos/opengles/GL10;->glTexParameterf(IIF)V */
/* .line 339 */
/* const/16 v24, 0xde1 */
/* const/16 v25, 0x0 */
/* const/16 v26, 0x0 */
/* move/from16 v0, v24 */
/* move/from16 v1, v25 */
/* move/from16 v2, v26 */
android.opengl.GLUtils .texImage2D ( v0,v1,v5,v2 );
/* :try_end_2 */
/* .catch Ljava/lang/Exception; {:try_start_2 ..:try_end_2} :catch_2 */
/* .catchall {:try_start_2 ..:try_end_2} :catchall_0 */
/* .line 349 */
if ( v19 != null) { // if-eqz v19, :cond_5
/* .line 350 */
try { // :try_start_3
/* invoke-virtual/range {v19 ..v19}, Ljava/io/InputStream;->close()V */
/* :try_end_3 */
/* .catch Ljava/lang/Exception; {:try_start_3 ..:try_end_3} :catch_5 */
/* .line 356 */
} // .end local v17 # "needToReduceSize":Z
} // :cond_5
} // :goto_7
if ( v5 != null) { // if-eqz v5, :cond_6
/* .line 357 */
(( android.graphics.Bitmap ) v5 ).recycle ( ); // invoke-virtual {v5}, Landroid/graphics/Bitmap;->recycle()V
} // :cond_6
/* move/from16 v21, v20 */
/* .line 359 */
} // .end local v5 # "bitmap":Landroid/graphics/Bitmap;
} // .end local v20 # "textureID":I
/* .local v21, "textureID":I */
} // :goto_8
/* .line 232 */
} // .end local v4 # "am":Landroid/content/res/AssetManager;
} // .end local v10 # "filenameTry1":Ljava/lang/String;
} // .end local v11 # "filenameTry2":Ljava/lang/String;
} // .end local v12 # "hdFilename":Ljava/lang/String;
} // .end local v14 # "isHDImage":Z
} // .end local v15 # "lastDot":I
} // .end local v16 # "lowestSide":I
} // .end local v18 # "shouldLoadHDImage":Z
} // .end local v19 # "stream":Ljava/io/InputStream;
} // .end local v21 # "textureID":I
} // .end local v22 # "textures":[I
} // :cond_7
/* const/16 p1, 0x1 */
/* goto/16 :goto_0 */
/* .line 243 */
/* .restart local v4 # "am":Landroid/content/res/AssetManager; */
/* .restart local v10 # "filenameTry1":Ljava/lang/String; */
/* .restart local v11 # "filenameTry2":Ljava/lang/String; */
/* .restart local v12 # "hdFilename":Ljava/lang/String; */
/* .restart local v20 # "textureID":I */
/* .restart local v22 # "textures":[I */
} // :cond_8
/* goto/16 :goto_1 */
/* .line 244 */
/* .restart local v16 # "lowestSide":I */
} // :cond_9
/* const/16 v18, 0x0 */
/* goto/16 :goto_2 */
/* .line 258 */
/* .restart local v14 # "isHDImage":Z */
/* .restart local v15 # "lastDot":I */
/* .restart local v18 # "shouldLoadHDImage":Z */
} // :cond_a
/* move-object v11, v12 */
/* goto/16 :goto_3 */
/* .line 267 */
/* .restart local v19 # "stream":Ljava/io/InputStream; */
/* :catch_0 */
/* move-exception v6 */
/* .line 269 */
/* .local v6, "ex":Ljava/lang/Exception; */
final String v24 = "load_texture"; // const-string v24, "load_texture"
/* new-instance v25, Ljava/lang/StringBuilder; */
final String v26 = "open stream of (\'"; // const-string v26, "open stream of (\'"
/* invoke-direct/range {v25 ..v26}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V */
/* move-object/from16 v0, v25 */
(( java.lang.StringBuilder ) v0 ).append ( v10 ); // invoke-virtual {v0, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
final String v26 = "\') FAIL"; // const-string v26, "\') FAIL"
/* invoke-virtual/range {v25 ..v26}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder; */
/* invoke-virtual/range {v25 ..v25}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String; */
/* invoke-static/range {v24 ..v25}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I */
/* goto/16 :goto_4 */
/* .line 279 */
} // .end local v6 # "ex":Ljava/lang/Exception;
/* :catch_1 */
/* move-exception v7 */
/* .line 281 */
/* .local v7, "ex2":Ljava/lang/Exception; */
final String v24 = "load_texture"; // const-string v24, "load_texture"
/* new-instance v25, Ljava/lang/StringBuilder; */
final String v26 = "open stream of (\'"; // const-string v26, "open stream of (\'"
/* invoke-direct/range {v25 ..v26}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V */
/* move-object/from16 v0, v25 */
(( java.lang.StringBuilder ) v0 ).append ( v11 ); // invoke-virtual {v0, v11}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
final String v26 = "\') FAIL"; // const-string v26, "\') FAIL"
/* invoke-virtual/range {v25 ..v26}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder; */
/* invoke-virtual/range {v25 ..v25}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String; */
/* invoke-static/range {v24 ..v25}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I */
/* move/from16 v21, v20 */
/* .line 282 */
} // .end local v20 # "textureID":I
/* .restart local v21 # "textureID":I */
/* .line 292 */
} // .end local v7 # "ex2":Ljava/lang/Exception;
} // .end local v21 # "textureID":I
/* .restart local v5 # "bitmap":Landroid/graphics/Bitmap; */
/* .restart local v20 # "textureID":I */
} // :cond_b
/* const/16 v24, 0x2 */
/* move/from16 v0, p1 */
/* move/from16 v1, v24 */
/* if-ne v0, v1, :cond_c */
/* .line 293 */
try { // :try_start_4
v24 = com.natenai.jniutil.NateGameJNIUtilLib.mBitmapOptions;
v25 = android.graphics.Bitmap$Config.RGB_565;
/* move-object/from16 v0, v25 */
/* move-object/from16 v1, v24 */
this.inPreferredConfig = v0;
/* :try_end_4 */
/* .catch Ljava/lang/Exception; {:try_start_4 ..:try_end_4} :catch_2 */
/* .catchall {:try_start_4 ..:try_end_4} :catchall_0 */
/* goto/16 :goto_5 */
/* .line 341 */
/* :catch_2 */
/* move-exception v6 */
/* .line 342 */
/* .restart local v6 # "ex":Ljava/lang/Exception; */
try { // :try_start_5
v24 = com.natenai.jniutil.NateGameJNIUtilLib.MainGL;
/* const/16 v25, 0xde1 */
/* const/16 v26, 0x0 */
/* invoke-interface/range {v24 ..v26}, Ljavax/microedition/khronos/opengles/GL10;->glBindTexture(II)V */
/* .line 343 */
v24 = com.natenai.jniutil.NateGameJNIUtilLib.MainGL;
/* const/16 v25, 0x1 */
/* const/16 v26, 0x0 */
/* move-object/from16 v0, v24 */
/* move/from16 v1, v25 */
/* move-object/from16 v2, v22 */
/* move/from16 v3, v26 */
/* .line 344 */
final String v24 = "load_texture"; // const-string v24, "load_texture"
/* new-instance v25, Ljava/lang/StringBuilder; */
final String v26 = "open(\'"; // const-string v26, "open(\'"
/* invoke-direct/range {v25 ..v26}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V */
/* move-object/from16 v0, v25 */
/* move-object/from16 v1, p0 */
(( java.lang.StringBuilder ) v0 ).append ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
final String v26 = "\') FAIL"; // const-string v26, "\') FAIL"
/* invoke-virtual/range {v25 ..v26}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder; */
/* invoke-virtual/range {v25 ..v25}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String; */
/* invoke-static/range {v24 ..v25}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I */
/* :try_end_5 */
/* .catchall {:try_start_5 ..:try_end_5} :catchall_0 */
/* .line 349 */
if ( v19 != null) { // if-eqz v19, :cond_5
/* .line 350 */
try { // :try_start_6
/* invoke-virtual/range {v19 ..v19}, Ljava/io/InputStream;->close()V */
/* :try_end_6 */
/* .catch Ljava/lang/Exception; {:try_start_6 ..:try_end_6} :catch_3 */
/* goto/16 :goto_7 */
/* .line 351 */
/* :catch_3 */
/* move-exception v6 */
/* .line 352 */
final String v24 = "load_texture"; // const-string v24, "load_texture"
/* new-instance v25, Ljava/lang/StringBuilder; */
final String v26 = "stream.close(\'"; // const-string v26, "stream.close(\'"
/* invoke-direct/range {v25 ..v26}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V */
/* move-object/from16 v0, v25 */
/* move-object/from16 v1, p0 */
(( java.lang.StringBuilder ) v0 ).append ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
final String v26 = "\') FAIL"; // const-string v26, "\') FAIL"
/* invoke-virtual/range {v25 ..v26}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder; */
/* invoke-virtual/range {v25 ..v25}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String; */
/* invoke-static/range {v24 ..v25}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I */
/* goto/16 :goto_7 */
/* .line 294 */
} // .end local v6 # "ex":Ljava/lang/Exception;
} // :cond_c
/* const/16 v24, 0x3 */
/* move/from16 v0, p1 */
/* move/from16 v1, v24 */
/* if-ne v0, v1, :cond_e */
/* .line 295 */
try { // :try_start_7
v24 = com.natenai.jniutil.NateGameJNIUtilLib.mBitmapOptions;
v25 = android.graphics.Bitmap$Config.ALPHA_8;
/* move-object/from16 v0, v25 */
/* move-object/from16 v1, v24 */
this.inPreferredConfig = v0;
/* :try_end_7 */
/* .catch Ljava/lang/Exception; {:try_start_7 ..:try_end_7} :catch_2 */
/* .catchall {:try_start_7 ..:try_end_7} :catchall_0 */
/* goto/16 :goto_5 */
/* .line 347 */
/* :catchall_0 */
/* move-exception v24 */
/* .line 349 */
if ( v19 != null) { // if-eqz v19, :cond_d
/* .line 350 */
try { // :try_start_8
/* invoke-virtual/range {v19 ..v19}, Ljava/io/InputStream;->close()V */
/* :try_end_8 */
/* .catch Ljava/lang/Exception; {:try_start_8 ..:try_end_8} :catch_4 */
/* .line 354 */
} // :cond_d
} // :goto_9
/* throw v24 */
/* .line 297 */
} // :cond_e
try { // :try_start_9
v24 = com.natenai.jniutil.NateGameJNIUtilLib.mBitmapOptions;
v25 = android.graphics.Bitmap$Config.ARGB_8888;
/* move-object/from16 v0, v25 */
/* move-object/from16 v1, v24 */
this.inPreferredConfig = v0;
/* :try_end_9 */
/* .catch Ljava/lang/Exception; {:try_start_9 ..:try_end_9} :catch_2 */
/* .catchall {:try_start_9 ..:try_end_9} :catchall_0 */
/* goto/16 :goto_5 */
/* .line 317 */
} // :cond_f
/* const/16 v17, 0x0 */
/* goto/16 :goto_6 */
/* .line 351 */
/* :catch_4 */
/* move-exception v6 */
/* .line 352 */
/* .restart local v6 # "ex":Ljava/lang/Exception; */
final String v25 = "load_texture"; // const-string v25, "load_texture"
/* new-instance v26, Ljava/lang/StringBuilder; */
final String v27 = "stream.close(\'"; // const-string v27, "stream.close(\'"
/* invoke-direct/range {v26 ..v27}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V */
/* move-object/from16 v0, v26 */
/* move-object/from16 v1, p0 */
(( java.lang.StringBuilder ) v0 ).append ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
final String v27 = "\') FAIL"; // const-string v27, "\') FAIL"
/* invoke-virtual/range {v26 ..v27}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder; */
/* invoke-virtual/range {v26 ..v26}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String; */
/* invoke-static/range {v25 ..v26}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I */
/* .line 351 */
} // .end local v6 # "ex":Ljava/lang/Exception;
/* .restart local v17 # "needToReduceSize":Z */
/* :catch_5 */
/* move-exception v6 */
/* .line 352 */
/* .restart local v6 # "ex":Ljava/lang/Exception; */
final String v24 = "load_texture"; // const-string v24, "load_texture"
/* new-instance v25, Ljava/lang/StringBuilder; */
final String v26 = "stream.close(\'"; // const-string v26, "stream.close(\'"
/* invoke-direct/range {v25 ..v26}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V */
/* move-object/from16 v0, v25 */
/* move-object/from16 v1, p0 */
(( java.lang.StringBuilder ) v0 ).append ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
final String v26 = "\') FAIL"; // const-string v26, "\') FAIL"
/* invoke-virtual/range {v25 ..v26}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder; */
/* invoke-virtual/range {v25 ..v25}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String; */
/* invoke-static/range {v24 ..v25}, Landroid/util/Log;->e(Ljava/lang/String;Ljava/lang/String;)I */
/* goto/16 :goto_7 */
} // .end method
public static native void nativeDraw ( ) {
} // .end method
public static native void nativeInit ( Integer p0, Integer p1, Integer p2, Integer p3, Boolean p4, Boolean p5 ) {
} // .end method
public static native void nativeKeyUpEvent ( Integer p0 ) {
} // .end method
public static native void nativeNotifyEvent ( Integer p0 ) {
} // .end method
public static native void nativeResize ( Integer p0, Integer p1, Integer p2, Integer p3, Boolean p4, Boolean p5 ) {
} // .end method
public static native void nativeSetAdViewSize ( Integer p0, Integer p1 ) {
} // .end method
public static native void nativeTouchEvent ( Integer p0, Float p1, Float p2, Float p3, Float p4 ) {
} // .end method
public static void open_url ( java.lang.String p0 ) {
/* .locals 2 */
/* .param p0, "url" # Ljava/lang/String; */
/* .prologue */
/* .line 185 */
/* new-instance v0, Landroid/content/Intent; */
final String v1 = "android.intent.action.VIEW"; // const-string v1, "android.intent.action.VIEW"
/* invoke-direct {v0, v1}, Landroid/content/Intent;-><init>(Ljava/lang/String;)V */
/* .line 186 */
/* .local v0, "intent":Landroid/content/Intent; */
android.net.Uri .parse ( p0 );
(( android.content.Intent ) v0 ).setData ( v1 ); // invoke-virtual {v0, v1}, Landroid/content/Intent;->setData(Landroid/net/Uri;)Landroid/content/Intent;
/* .line 187 */
v1 = com.natenai.jniutil.NateGameJNIUtilLib.mMainActivity;
(( com.natenai.jniutil.NateBaseActivity ) v1 ).startActivity ( v0 ); // invoke-virtual {v1, v0}, Lcom/natenai/jniutil/NateBaseActivity;->startActivity(Landroid/content/Intent;)V
/* .line 188 */
return;
} // .end method
public static Boolean pref_get_boolean ( java.lang.String p0 ) {
/* .locals 2 */
/* .param p0, "key" # Ljava/lang/String; */
/* .prologue */
/* .line 560 */
v0 = com.natenai.jniutil.NateGameJNIUtilLib.mSettings;
v0 = int v1 = 0; // const/4 v1, 0x0
} // .end method
public static Double pref_get_double ( java.lang.String p0 ) {
/* .locals 3 */
/* .param p0, "key" # Ljava/lang/String; */
/* .prologue */
/* .line 570 */
v1 = com.natenai.jniutil.NateGameJNIUtilLib.mSettings;
final String v2 = "0"; // const-string v2, "0"
/* .line 571 */
/* .local v0, "strDouble":Ljava/lang/String; */
java.lang.Double .parseDouble ( v0 );
/* move-result-wide v1 */
/* return-wide v1 */
} // .end method
public static Float pref_get_float ( java.lang.String p0 ) {
/* .locals 2 */
/* .param p0, "key" # Ljava/lang/String; */
/* .prologue */
/* .line 565 */
v0 = com.natenai.jniutil.NateGameJNIUtilLib.mSettings;
v0 = int v1 = 0; // const/4 v1, 0x0
} // .end method
public static Integer pref_get_int ( java.lang.String p0 ) {
/* .locals 2 */
/* .param p0, "key" # Ljava/lang/String; */
/* .prologue */
/* .line 576 */
v0 = com.natenai.jniutil.NateGameJNIUtilLib.mSettings;
v0 = int v1 = 0; // const/4 v1, 0x0
} // .end method
public static Long pref_get_long ( java.lang.String p0 ) {
/* .locals 3 */
/* .param p0, "key" # Ljava/lang/String; */
/* .prologue */
/* .line 581 */
v0 = com.natenai.jniutil.NateGameJNIUtilLib.mSettings;
/* const-wide/16 v1, 0x0 */
/* move-result-wide v0 */
/* return-wide v0 */
} // .end method
public static java.lang.String pref_get_string ( java.lang.String p0 ) {
/* .locals 3 */
/* .param p0, "key" # Ljava/lang/String; */
/* .prologue */
/* .line 586 */
/* sget-boolean v0, Lcom/natenai/jniutil/NateGameJNIUtilLib;->DebugPref:Z */
if ( v0 != null) { // if-eqz v0, :cond_0
/* .line 587 */
v0 = com.natenai.jniutil.NateBaseActivity.natenaiAppName;
/* new-instance v1, Ljava/lang/StringBuilder; */
final String v2 = "pref_get_string:"; // const-string v2, "pref_get_string:"
/* invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V */
(( java.lang.StringBuilder ) v1 ).append ( p0 ); // invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v1 ).toString ( ); // invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
android.util.Log .d ( v0,v1 );
/* .line 589 */
} // :cond_0
v0 = com.natenai.jniutil.NateGameJNIUtilLib.mSettings;
final String v1 = ""; // const-string v1, ""
} // .end method
public static Boolean pref_has_key ( java.lang.String p0 ) {
/* .locals 1 */
/* .param p0, "key" # Ljava/lang/String; */
/* .prologue */
/* .line 554 */
v0 = v0 = com.natenai.jniutil.NateGameJNIUtilLib.mSettings;
} // .end method
public static void pref_set_boolean ( java.lang.String p0, Boolean p1 ) {
/* .locals 4 */
/* .param p0, "key" # Ljava/lang/String; */
/* .param p1, "value" # Z */
/* .prologue */
/* .line 595 */
/* sget-boolean v1, Lcom/natenai/jniutil/NateGameJNIUtilLib;->DebugPref:Z */
if ( v1 != null) { // if-eqz v1, :cond_0
/* .line 596 */
v1 = com.natenai.jniutil.NateBaseActivity.natenaiAppName;
/* new-instance v2, Ljava/lang/StringBuilder; */
final String v3 = "pref_set_boolean:"; // const-string v3, "pref_set_boolean:"
/* invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V */
(( java.lang.StringBuilder ) v2 ).append ( p0 ); // invoke-virtual {v2, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
final String v3 = ", "; // const-string v3, ", "
(( java.lang.StringBuilder ) v2 ).append ( v3 ); // invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v2 ).append ( p1 ); // invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v2 ).toString ( ); // invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
android.util.Log .d ( v1,v2 );
/* .line 600 */
} // :cond_0
v1 = com.natenai.jniutil.NateGameJNIUtilLib.mSettings;
/* .line 601 */
/* .local v0, "editor":Landroid/content/SharedPreferences$Editor; */
/* .line 604 */
/* .line 605 */
return;
} // .end method
public static void pref_set_double ( java.lang.String p0, Double p1 ) {
/* .locals 4 */
/* .param p0, "key" # Ljava/lang/String; */
/* .param p1, "value" # D */
/* .prologue */
/* .line 619 */
/* sget-boolean v1, Lcom/natenai/jniutil/NateGameJNIUtilLib;->DebugPref:Z */
if ( v1 != null) { // if-eqz v1, :cond_0
/* .line 620 */
v1 = com.natenai.jniutil.NateBaseActivity.natenaiAppName;
/* new-instance v2, Ljava/lang/StringBuilder; */
final String v3 = "pref_set_double:"; // const-string v3, "pref_set_double:"
/* invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V */
(( java.lang.StringBuilder ) v2 ).append ( p0 ); // invoke-virtual {v2, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
final String v3 = ", "; // const-string v3, ", "
(( java.lang.StringBuilder ) v2 ).append ( v3 ); // invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v2 ).append ( p1, p2 ); // invoke-virtual {v2, p1, p2}, Ljava/lang/StringBuilder;->append(D)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v2 ).toString ( ); // invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
android.util.Log .d ( v1,v2 );
/* .line 622 */
} // :cond_0
v1 = com.natenai.jniutil.NateGameJNIUtilLib.mSettings;
/* .line 623 */
/* .local v0, "editor":Landroid/content/SharedPreferences$Editor; */
java.lang.Double .toString ( p1,p2 );
/* .line 624 */
/* .line 625 */
return;
} // .end method
public static void pref_set_float ( java.lang.String p0, Float p1 ) {
/* .locals 4 */
/* .param p0, "key" # Ljava/lang/String; */
/* .param p1, "value" # F */
/* .prologue */
/* .line 609 */
/* sget-boolean v1, Lcom/natenai/jniutil/NateGameJNIUtilLib;->DebugPref:Z */
if ( v1 != null) { // if-eqz v1, :cond_0
/* .line 610 */
v1 = com.natenai.jniutil.NateBaseActivity.natenaiAppName;
/* new-instance v2, Ljava/lang/StringBuilder; */
final String v3 = "pref_set_float:"; // const-string v3, "pref_set_float:"
/* invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V */
(( java.lang.StringBuilder ) v2 ).append ( p0 ); // invoke-virtual {v2, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
final String v3 = ", "; // const-string v3, ", "
(( java.lang.StringBuilder ) v2 ).append ( v3 ); // invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v2 ).append ( p1 ); // invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v2 ).toString ( ); // invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
android.util.Log .d ( v1,v2 );
/* .line 612 */
} // :cond_0
v1 = com.natenai.jniutil.NateGameJNIUtilLib.mSettings;
/* .line 613 */
/* .local v0, "editor":Landroid/content/SharedPreferences$Editor; */
/* .line 614 */
/* .line 615 */
return;
} // .end method
public static void pref_set_int ( java.lang.String p0, Integer p1 ) {
/* .locals 4 */
/* .param p0, "key" # Ljava/lang/String; */
/* .param p1, "value" # I */
/* .prologue */
/* .line 629 */
/* sget-boolean v1, Lcom/natenai/jniutil/NateGameJNIUtilLib;->DebugPref:Z */
if ( v1 != null) { // if-eqz v1, :cond_0
/* .line 630 */
v1 = com.natenai.jniutil.NateBaseActivity.natenaiAppName;
/* new-instance v2, Ljava/lang/StringBuilder; */
final String v3 = "pref_set_int:"; // const-string v3, "pref_set_int:"
/* invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V */
(( java.lang.StringBuilder ) v2 ).append ( p0 ); // invoke-virtual {v2, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
final String v3 = ", "; // const-string v3, ", "
(( java.lang.StringBuilder ) v2 ).append ( v3 ); // invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v2 ).append ( p1 ); // invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v2 ).toString ( ); // invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
android.util.Log .d ( v1,v2 );
/* .line 632 */
} // :cond_0
v1 = com.natenai.jniutil.NateGameJNIUtilLib.mSettings;
/* .line 633 */
/* .local v0, "editor":Landroid/content/SharedPreferences$Editor; */
/* .line 634 */
/* .line 635 */
return;
} // .end method
public static void pref_set_long ( java.lang.String p0, Long p1 ) {
/* .locals 4 */
/* .param p0, "key" # Ljava/lang/String; */
/* .param p1, "value" # J */
/* .prologue */
/* .line 639 */
/* sget-boolean v1, Lcom/natenai/jniutil/NateGameJNIUtilLib;->DebugPref:Z */
if ( v1 != null) { // if-eqz v1, :cond_0
/* .line 640 */
v1 = com.natenai.jniutil.NateBaseActivity.natenaiAppName;
/* new-instance v2, Ljava/lang/StringBuilder; */
final String v3 = "pref_set_long:"; // const-string v3, "pref_set_long:"
/* invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V */
(( java.lang.StringBuilder ) v2 ).append ( p0 ); // invoke-virtual {v2, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
final String v3 = ", "; // const-string v3, ", "
(( java.lang.StringBuilder ) v2 ).append ( v3 ); // invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v2 ).append ( p1, p2 ); // invoke-virtual {v2, p1, p2}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v2 ).toString ( ); // invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
android.util.Log .d ( v1,v2 );
/* .line 642 */
} // :cond_0
v1 = com.natenai.jniutil.NateGameJNIUtilLib.mSettings;
/* .line 643 */
/* .local v0, "editor":Landroid/content/SharedPreferences$Editor; */
/* .line 644 */
/* .line 645 */
return;
} // .end method
public static void pref_set_string ( java.lang.String p0, java.lang.String p1 ) {
/* .locals 4 */
/* .param p0, "key" # Ljava/lang/String; */
/* .param p1, "value" # Ljava/lang/String; */
/* .prologue */
/* .line 649 */
/* sget-boolean v1, Lcom/natenai/jniutil/NateGameJNIUtilLib;->DebugPref:Z */
if ( v1 != null) { // if-eqz v1, :cond_0
/* .line 650 */
v1 = com.natenai.jniutil.NateBaseActivity.natenaiAppName;
/* new-instance v2, Ljava/lang/StringBuilder; */
final String v3 = "pref_set_string:"; // const-string v3, "pref_set_string:"
/* invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V */
(( java.lang.StringBuilder ) v2 ).append ( p0 ); // invoke-virtual {v2, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
final String v3 = ", "; // const-string v3, ", "
(( java.lang.StringBuilder ) v2 ).append ( v3 ); // invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v2 ).append ( p1 ); // invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v2 ).toString ( ); // invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
android.util.Log .d ( v1,v2 );
/* .line 652 */
} // :cond_0
v1 = com.natenai.jniutil.NateGameJNIUtilLib.mSettings;
/* .line 653 */
/* .local v0, "editor":Landroid/content/SharedPreferences$Editor; */
/* .line 654 */
/* .line 655 */
return;
} // .end method
public static void set_ad_view_visibility ( Boolean p0 ) {
/* .locals 1 */
/* .param p0, "visible" # Z */
/* .prologue */
/* .line 197 */
com.natenai.jniutil.NateAdsManager .getInstance ( );
(( com.natenai.jniutil.NateAdsManager ) v0 ).setBannerAdVisibled ( p0 ); // invoke-virtual {v0, p0}, Lcom/natenai/jniutil/NateAdsManager;->setBannerAdVisibled(Z)V
/* .line 198 */
return;
} // .end method
public static void show_interstitial_ad ( ) {
/* .locals 1 */
/* .prologue */
/* .line 207 */
com.natenai.jniutil.NateAdsManager .getInstance ( );
(( com.natenai.jniutil.NateAdsManager ) v0 ).showInterstitialAd ( ); // invoke-virtual {v0}, Lcom/natenai/jniutil/NateAdsManager;->showInterstitialAd()V
/* .line 208 */
return;
} // .end method
public static void show_more_apps ( ) {
/* .locals 1 */
/* .prologue */
/* .line 192 */
final String v0 = "market://search?q=pub%3A%22Natenai%20Ariyatrakool%22"; // const-string v0, "market://search?q=pub%3A%22Natenai%20Ariyatrakool%22"
com.natenai.jniutil.NateGameJNIUtilLib .open_url ( v0 );
/* .line 193 */
return;
} // .end method
public static void snd_finalize ( ) {
/* .locals 1 */
/* .prologue */
/* .line 384 */
v0 = com.natenai.jniutil.NateGameJNIUtilLib.mSoundPool;
if ( v0 != null) { // if-eqz v0, :cond_0
/* .line 390 */
v0 = com.natenai.jniutil.NateGameJNIUtilLib.mSoundPool;
(( android.media.SoundPool ) v0 ).release ( ); // invoke-virtual {v0}, Landroid/media/SoundPool;->release()V
/* .line 391 */
int v0 = 0; // const/4 v0, 0x0
/* .line 393 */
} // :cond_0
return;
} // .end method
public static void snd_init ( ) {
/* .locals 4 */
/* .prologue */
int v3 = 3; // const/4 v3, 0x3
int v2 = 0; // const/4 v2, 0x0
/* .line 373 */
v0 = com.natenai.jniutil.NateGameJNIUtilLib.mSoundPool;
/* if-nez v0, :cond_0 */
/* .line 375 */
v0 = com.natenai.jniutil.NateBaseActivity.natenaiAppName;
final String v1 = "Horse"; // const-string v1, "Horse"
v0 = (( java.lang.String ) v0 ).contains ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z
if ( v0 != null) { // if-eqz v0, :cond_1
/* .line 376 */
/* new-instance v0, Landroid/media/SoundPool; */
int v1 = 5; // const/4 v1, 0x5
/* invoke-direct {v0, v1, v3, v2}, Landroid/media/SoundPool;-><init>(III)V */
/* .line 380 */
} // :cond_0
} // :goto_0
return;
/* .line 378 */
} // :cond_1
/* new-instance v0, Landroid/media/SoundPool; */
int v1 = 4; // const/4 v1, 0x4
/* invoke-direct {v0, v1, v3, v2}, Landroid/media/SoundPool;-><init>(III)V */
} // .end method
public static Integer snd_load ( java.lang.String p0 ) {
/* .locals 10 */
/* .param p0, "fname" # Ljava/lang/String; */
/* .prologue */
int v9 = 1; // const/4 v9, 0x1
/* .line 424 */
int v7 = 3; // const/4 v7, 0x3
/* new-array v6, v7, [Ljava/lang/String; */
int v7 = 0; // const/4 v7, 0x0
final String v8 = ".mp3"; // const-string v8, ".mp3"
/* aput-object v8, v6, v7 */
final String v7 = ".ogg"; // const-string v7, ".ogg"
/* aput-object v7, v6, v9 */
int v7 = 2; // const/4 v7, 0x2
final String v8 = ".wav"; // const-string v8, ".wav"
/* aput-object v8, v6, v7 */
/* .line 426 */
/* .local v6, "supportedSoundExt":[Ljava/lang/String; */
int v4 = -1; // const/4 v4, -0x1
/* .line 427 */
/* .local v4, "soundID":I */
v7 = com.natenai.jniutil.NateGameJNIUtilLib.mMainActivity;
(( com.natenai.jniutil.NateBaseActivity ) v7 ).getAssets ( ); // invoke-virtual {v7}, Lcom/natenai/jniutil/NateBaseActivity;->getAssets()Landroid/content/res/AssetManager;
/* .line 428 */
/* .local v1, "am":Landroid/content/res/AssetManager; */
int v3 = 0; // const/4 v3, 0x0
/* .local v3, "i":I */
} // :goto_0
/* array-length v7, v6 */
/* if-lt v3, v7, :cond_0 */
/* move v5, v4 */
/* .line 444 */
} // .end local v4 # "soundID":I
/* .local v5, "soundID":I */
} // :goto_1
/* .line 431 */
} // .end local v5 # "soundID":I
/* .restart local v4 # "soundID":I */
} // :cond_0
try { // :try_start_0
/* aget-object v7, v6, v3 */
com.natenai.jniutil.NateGameJNIUtilLib .changeExtension ( p0,v7 );
/* .line 433 */
(( android.content.res.AssetManager ) v1 ).openFd ( p0 ); // invoke-virtual {v1, p0}, Landroid/content/res/AssetManager;->openFd(Ljava/lang/String;)Landroid/content/res/AssetFileDescriptor;
/* .line 434 */
/* .local v0, "afd":Landroid/content/res/AssetFileDescriptor; */
v7 = com.natenai.jniutil.NateGameJNIUtilLib.mSoundPool;
int v8 = 1; // const/4 v8, 0x1
v4 = (( android.media.SoundPool ) v7 ).load ( v0, v8 ); // invoke-virtual {v7, v0, v8}, Landroid/media/SoundPool;->load(Landroid/content/res/AssetFileDescriptor;I)I
/* .line 435 */
v7 = com.natenai.jniutil.NateBaseActivity.natenaiAppName;
/* new-instance v8, Ljava/lang/StringBuilder; */
final String v9 = "snd_load() soundID = "; // const-string v9, "snd_load() soundID = "
/* invoke-direct {v8, v9}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V */
(( java.lang.StringBuilder ) v8 ).append ( v4 ); // invoke-virtual {v8, v4}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;
final String v9 = ", file: "; // const-string v9, ", file: "
(( java.lang.StringBuilder ) v8 ).append ( v9 ); // invoke-virtual {v8, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v8 ).append ( p0 ); // invoke-virtual {v8, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v8 ).toString ( ); // invoke-virtual {v8}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
android.util.Log .d ( v7,v8 );
/* .line 436 */
v7 = com.natenai.jniutil.NateGameJNIUtilLib.mSoundLoadedList;
/* new-instance v8, Ljava/lang/Integer; */
/* invoke-direct {v8, v4}, Ljava/lang/Integer;-><init>(I)V */
(( java.util.ArrayList ) v7 ).add ( v8 ); // invoke-virtual {v7, v8}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z
/* :try_end_0 */
/* .catch Ljava/lang/Exception; {:try_start_0 ..:try_end_0} :catch_0 */
/* move v5, v4 */
/* .line 437 */
} // .end local v4 # "soundID":I
/* .restart local v5 # "soundID":I */
/* .line 438 */
} // .end local v0 # "afd":Landroid/content/res/AssetFileDescriptor;
} // .end local v5 # "soundID":I
/* .restart local v4 # "soundID":I */
/* :catch_0 */
/* move-exception v2 */
/* .line 439 */
/* .local v2, "e":Ljava/lang/Exception; */
int v4 = -1; // const/4 v4, -0x1
/* .line 440 */
v7 = com.natenai.jniutil.NateBaseActivity.natenaiAppName;
/* new-instance v8, Ljava/lang/StringBuilder; */
final String v9 = "snd_load() "; // const-string v9, "snd_load() "
/* invoke-direct {v8, v9}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V */
(( java.lang.StringBuilder ) v8 ).append ( p0 ); // invoke-virtual {v8, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
final String v9 = " FAIL !"; // const-string v9, " FAIL !"
(( java.lang.StringBuilder ) v8 ).append ( v9 ); // invoke-virtual {v8, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v8 ).toString ( ); // invoke-virtual {v8}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
android.util.Log .e ( v7,v8 );
/* .line 428 */
/* add-int/lit8 v3, v3, 0x1 */
} // .end method
public static void snd_pause ( Integer p0 ) {
/* .locals 3 */
/* .param p0, "streamID" # I */
/* .prologue */
/* .line 492 */
/* sget-boolean v0, Lcom/natenai/jniutil/NateGameJNIUtilLib;->DebugSound:Z */
if ( v0 != null) { // if-eqz v0, :cond_0
/* .line 493 */
v0 = com.natenai.jniutil.NateBaseActivity.natenaiAppName;
/* new-instance v1, Ljava/lang/StringBuilder; */
final String v2 = "snd_pause() streamID = "; // const-string v2, "snd_pause() streamID = "
/* invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V */
(( java.lang.StringBuilder ) v1 ).append ( p0 ); // invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v1 ).toString ( ); // invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
android.util.Log .d ( v0,v1 );
/* .line 494 */
} // :cond_0
v0 = com.natenai.jniutil.NateGameJNIUtilLib.mSoundPool;
(( android.media.SoundPool ) v0 ).pause ( p0 ); // invoke-virtual {v0, p0}, Landroid/media/SoundPool;->pause(I)V
/* .line 495 */
return;
} // .end method
public static void snd_pause_all ( ) {
/* .locals 3 */
/* .prologue */
/* .line 399 */
v2 = com.natenai.jniutil.NateGameJNIUtilLib.mActiveSoundLoopList;
v1 = (( java.util.ArrayList ) v2 ).size ( ); // invoke-virtual {v2}, Ljava/util/ArrayList;->size()I
/* .line 400 */
/* .local v1, "loopCount":I */
int v0 = 0; // const/4 v0, 0x0
/* .local v0, "i":I */
} // :goto_0
/* if-lt v0, v1, :cond_0 */
/* .line 402 */
return;
/* .line 401 */
} // :cond_0
v2 = com.natenai.jniutil.NateGameJNIUtilLib.mActiveSoundLoopList;
(( java.util.ArrayList ) v2 ).get ( v0 ); // invoke-virtual {v2, v0}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;
/* check-cast v2, Ljava/lang/Integer; */
v2 = (( java.lang.Integer ) v2 ).intValue ( ); // invoke-virtual {v2}, Ljava/lang/Integer;->intValue()I
com.natenai.jniutil.NateGameJNIUtilLib .snd_pause ( v2 );
/* .line 400 */
/* add-int/lit8 v0, v0, 0x1 */
} // .end method
public static Integer snd_play ( Integer p0, Float p1, Float p2, Integer p3, Integer p4, Float p5 ) {
/* .locals 9 */
/* .param p0, "soundID" # I */
/* .param p1, "leftVolume" # F */
/* .param p2, "rightVolume" # F */
/* .param p3, "priority" # I */
/* .param p4, "loop" # I */
/* .param p5, "rate" # F */
/* .prologue */
/* .line 452 */
int v8 = 0; // const/4 v8, 0x0
/* .line 454 */
/* .local v8, "streamID":I */
try { // :try_start_0
/* cmpl-float v0, p5, v0 */
/* if-lez v0, :cond_0 */
/* .line 455 */
/* .line 457 */
} // :cond_0
/* cmpl-float v0, p1, v0 */
/* if-ltz v0, :cond_1 */
/* .line 458 */
/* .line 460 */
} // :cond_1
/* cmpl-float v0, p2, v0 */
/* if-ltz v0, :cond_2 */
/* .line 461 */
/* .line 463 */
} // :cond_2
v0 = com.natenai.jniutil.NateGameJNIUtilLib.mSoundPool;
/* move v1, p0 */
/* move v2, p1 */
/* move v3, p2 */
/* move v4, p3 */
/* move v5, p4 */
/* move v6, p5 */
v8 = /* invoke-virtual/range {v0 ..v6}, Landroid/media/SoundPool;->play(IFFIIF)I */
/* .line 465 */
if ( p4 != null) { // if-eqz p4, :cond_3
/* .line 466 */
v0 = com.natenai.jniutil.NateGameJNIUtilLib.mActiveSoundLoopList;
/* new-instance v1, Ljava/lang/Integer; */
/* invoke-direct {v1, v8}, Ljava/lang/Integer;-><init>(I)V */
(( java.util.ArrayList ) v0 ).add ( v1 ); // invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z
/* .line 468 */
} // :cond_3
/* sget-boolean v0, Lcom/natenai/jniutil/NateGameJNIUtilLib;->DebugSound:Z */
if ( v0 != null) { // if-eqz v0, :cond_4
/* .line 469 */
v0 = com.natenai.jniutil.NateBaseActivity.natenaiAppName;
/* new-instance v1, Ljava/lang/StringBuilder; */
final String v2 = "snd_play() soundID = "; // const-string v2, "snd_play() soundID = "
/* invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V */
(( java.lang.StringBuilder ) v1 ).append ( p0 ); // invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;
final String v2 = ", streamID = "; // const-string v2, ", streamID = "
(( java.lang.StringBuilder ) v1 ).append ( v2 ); // invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v1 ).append ( v8 ); // invoke-virtual {v1, v8}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v1 ).toString ( ); // invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
android.util.Log .d ( v0,v1 );
/* :try_end_0 */
/* .catch Ljava/lang/Exception; {:try_start_0 ..:try_end_0} :catch_0 */
/* .line 476 */
} // :cond_4
} // :goto_0
/* .line 470 */
/* :catch_0 */
/* move-exception v7 */
/* .line 472 */
/* .local v7, "ex":Ljava/lang/Exception; */
int v8 = 0; // const/4 v8, 0x0
/* .line 473 */
/* sget-boolean v0, Lcom/natenai/jniutil/NateGameJNIUtilLib;->DebugSound:Z */
if ( v0 != null) { // if-eqz v0, :cond_4
/* .line 474 */
v0 = com.natenai.jniutil.NateBaseActivity.natenaiAppName;
/* new-instance v1, Ljava/lang/StringBuilder; */
final String v2 = "snd_play() FAIL soundID = "; // const-string v2, "snd_play() FAIL soundID = "
/* invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V */
(( java.lang.StringBuilder ) v1 ).append ( p0 ); // invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v1 ).toString ( ); // invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
android.util.Log .e ( v0,v1 );
} // .end method
public static void snd_resume ( Integer p0 ) {
/* .locals 3 */
/* .param p0, "streamID" # I */
/* .prologue */
/* .line 499 */
/* sget-boolean v0, Lcom/natenai/jniutil/NateGameJNIUtilLib;->DebugSound:Z */
if ( v0 != null) { // if-eqz v0, :cond_0
/* .line 500 */
v0 = com.natenai.jniutil.NateBaseActivity.natenaiAppName;
/* new-instance v1, Ljava/lang/StringBuilder; */
final String v2 = "snd_resume() streamID = "; // const-string v2, "snd_resume() streamID = "
/* invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V */
(( java.lang.StringBuilder ) v1 ).append ( p0 ); // invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v1 ).toString ( ); // invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
android.util.Log .d ( v0,v1 );
/* .line 501 */
} // :cond_0
v0 = com.natenai.jniutil.NateGameJNIUtilLib.mSoundPool;
(( android.media.SoundPool ) v0 ).resume ( p0 ); // invoke-virtual {v0, p0}, Landroid/media/SoundPool;->resume(I)V
/* .line 502 */
return;
} // .end method
public static void snd_resume_all ( ) {
/* .locals 3 */
/* .prologue */
/* .line 408 */
v2 = com.natenai.jniutil.NateGameJNIUtilLib.mActiveSoundLoopList;
v1 = (( java.util.ArrayList ) v2 ).size ( ); // invoke-virtual {v2}, Ljava/util/ArrayList;->size()I
/* .line 409 */
/* .local v1, "loopCount":I */
int v0 = 0; // const/4 v0, 0x0
/* .local v0, "i":I */
} // :goto_0
/* if-lt v0, v1, :cond_0 */
/* .line 411 */
return;
/* .line 410 */
} // :cond_0
v2 = com.natenai.jniutil.NateGameJNIUtilLib.mActiveSoundLoopList;
(( java.util.ArrayList ) v2 ).get ( v0 ); // invoke-virtual {v2, v0}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;
/* check-cast v2, Ljava/lang/Integer; */
v2 = (( java.lang.Integer ) v2 ).intValue ( ); // invoke-virtual {v2}, Ljava/lang/Integer;->intValue()I
com.natenai.jniutil.NateGameJNIUtilLib .snd_resume ( v2 );
/* .line 409 */
/* add-int/lit8 v0, v0, 0x1 */
} // .end method
public static void snd_set_loop ( Integer p0, Integer p1 ) {
/* .locals 3 */
/* .param p0, "streamID" # I */
/* .param p1, "loop" # I */
/* .prologue */
/* .line 506 */
/* sget-boolean v0, Lcom/natenai/jniutil/NateGameJNIUtilLib;->DebugSound:Z */
if ( v0 != null) { // if-eqz v0, :cond_0
/* .line 507 */
v0 = com.natenai.jniutil.NateBaseActivity.natenaiAppName;
/* new-instance v1, Ljava/lang/StringBuilder; */
final String v2 = "snd_set_loop() streamID = "; // const-string v2, "snd_set_loop() streamID = "
/* invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V */
(( java.lang.StringBuilder ) v1 ).append ( p0 ); // invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v1 ).toString ( ); // invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
android.util.Log .d ( v0,v1 );
/* .line 508 */
} // :cond_0
v0 = com.natenai.jniutil.NateGameJNIUtilLib.mSoundPool;
(( android.media.SoundPool ) v0 ).setLoop ( p0, p1 ); // invoke-virtual {v0, p0, p1}, Landroid/media/SoundPool;->setLoop(II)V
/* .line 510 */
if ( p1 != null) { // if-eqz p1, :cond_1
/* .line 511 */
v0 = com.natenai.jniutil.NateGameJNIUtilLib.mActiveSoundLoopList;
/* new-instance v1, Ljava/lang/Integer; */
/* invoke-direct {v1, p0}, Ljava/lang/Integer;-><init>(I)V */
(( java.util.ArrayList ) v0 ).add ( v1 ); // invoke-virtual {v0, v1}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z
/* .line 514 */
} // :goto_0
return;
/* .line 513 */
} // :cond_1
v0 = com.natenai.jniutil.NateGameJNIUtilLib.mActiveSoundLoopList;
/* new-instance v1, Ljava/lang/Integer; */
/* invoke-direct {v1, p0}, Ljava/lang/Integer;-><init>(I)V */
(( java.util.ArrayList ) v0 ).remove ( v1 ); // invoke-virtual {v0, v1}, Ljava/util/ArrayList;->remove(Ljava/lang/Object;)Z
} // .end method
public static void snd_set_rate ( Integer p0, Float p1 ) {
/* .locals 1 */
/* .param p0, "streamID" # I */
/* .param p1, "rate" # F */
/* .prologue */
/* .line 518 */
/* cmpl-float v0, p1, v0 */
/* if-lez v0, :cond_0 */
/* .line 519 */
/* .line 522 */
} // :cond_0
v0 = com.natenai.jniutil.NateGameJNIUtilLib.mSoundPool;
(( android.media.SoundPool ) v0 ).setRate ( p0, p1 ); // invoke-virtual {v0, p0, p1}, Landroid/media/SoundPool;->setRate(IF)V
/* .line 523 */
return;
} // .end method
public static void snd_set_volume ( Integer p0, Float p1, Float p2 ) {
/* .locals 1 */
/* .param p0, "streamID" # I */
/* .param p1, "leftVolume" # F */
/* .param p2, "rightVolume" # F */
/* .prologue */
/* .line 527 */
/* cmpl-float v0, p1, v0 */
/* if-ltz v0, :cond_0 */
/* .line 528 */
/* .line 530 */
} // :cond_0
/* cmpl-float v0, p2, v0 */
/* if-ltz v0, :cond_1 */
/* .line 531 */
/* .line 534 */
} // :cond_1
v0 = com.natenai.jniutil.NateGameJNIUtilLib.mSoundPool;
(( android.media.SoundPool ) v0 ).setVolume ( p0, p1, p2 ); // invoke-virtual {v0, p0, p1, p2}, Landroid/media/SoundPool;->setVolume(IFF)V
/* .line 535 */
return;
} // .end method
public static void snd_stop ( Integer p0 ) {
/* .locals 3 */
/* .param p0, "streamID" # I */
/* .prologue */
/* .line 481 */
/* sget-boolean v0, Lcom/natenai/jniutil/NateGameJNIUtilLib;->DebugSound:Z */
if ( v0 != null) { // if-eqz v0, :cond_0
/* .line 482 */
v0 = com.natenai.jniutil.NateBaseActivity.natenaiAppName;
/* new-instance v1, Ljava/lang/StringBuilder; */
final String v2 = "snd_stop() streamID = "; // const-string v2, "snd_stop() streamID = "
/* invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V */
(( java.lang.StringBuilder ) v1 ).append ( p0 ); // invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v1 ).toString ( ); // invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
android.util.Log .d ( v0,v1 );
/* .line 485 */
} // :cond_0
v0 = com.natenai.jniutil.NateGameJNIUtilLib.mSoundPool;
(( android.media.SoundPool ) v0 ).stop ( p0 ); // invoke-virtual {v0, p0}, Landroid/media/SoundPool;->stop(I)V
/* .line 487 */
v0 = com.natenai.jniutil.NateGameJNIUtilLib.mActiveSoundLoopList;
/* new-instance v1, Ljava/lang/Integer; */
/* invoke-direct {v1, p0}, Ljava/lang/Integer;-><init>(I)V */
(( java.util.ArrayList ) v0 ).remove ( v1 ); // invoke-virtual {v0, v1}, Ljava/util/ArrayList;->remove(Ljava/lang/Object;)Z
/* .line 488 */
return;
} // .end method
public static void snd_unload ( Integer p0 ) {
/* .locals 3 */
/* .param p0, "soundID" # I */
/* .prologue */
/* .line 539 */
/* sget-boolean v0, Lcom/natenai/jniutil/NateGameJNIUtilLib;->DebugSound:Z */
if ( v0 != null) { // if-eqz v0, :cond_0
/* .line 540 */
v0 = com.natenai.jniutil.NateBaseActivity.natenaiAppName;
/* new-instance v1, Ljava/lang/StringBuilder; */
final String v2 = "snd_unload() soundID = "; // const-string v2, "snd_unload() soundID = "
/* invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V */
(( java.lang.StringBuilder ) v1 ).append ( p0 ); // invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v1 ).toString ( ); // invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
android.util.Log .d ( v0,v1 );
/* .line 541 */
} // :cond_0
v0 = com.natenai.jniutil.NateGameJNIUtilLib.mSoundPool;
(( android.media.SoundPool ) v0 ).unload ( p0 ); // invoke-virtual {v0, p0}, Landroid/media/SoundPool;->unload(I)Z
/* .line 542 */
v0 = com.natenai.jniutil.NateGameJNIUtilLib.mSoundLoadedList;
/* new-instance v1, Ljava/lang/Integer; */
/* invoke-direct {v1, p0}, Ljava/lang/Integer;-><init>(I)V */
(( java.util.ArrayList ) v0 ).remove ( v1 ); // invoke-virtual {v0, v1}, Ljava/util/ArrayList;->remove(Ljava/lang/Object;)Z
/* .line 543 */
return;
} // .end method
public static void terminate_android_app ( ) {
/* .locals 1 */
/* .prologue */
/* .line 173 */
v0 = com.natenai.jniutil.NateGameJNIUtilLib.mMainActivity;
(( com.natenai.jniutil.NateBaseActivity ) v0 ).finish ( ); // invoke-virtual {v0}, Lcom/natenai/jniutil/NateBaseActivity;->finish()V
/* .line 174 */
return;
} // .end method
public static void vibrate_device ( ) {
/* .locals 3 */
/* .prologue */
/* .line 178 */
v1 = com.natenai.jniutil.NateGameJNIUtilLib.mMainActivity;
final String v2 = "vibrator"; // const-string v2, "vibrator"
(( com.natenai.jniutil.NateBaseActivity ) v1 ).getSystemService ( v2 ); // invoke-virtual {v1, v2}, Lcom/natenai/jniutil/NateBaseActivity;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;
/* check-cast v0, Landroid/os/Vibrator; */
/* .line 181 */
/* .local v0, "v":Landroid/os/Vibrator; */
/* const-wide/16 v1, 0x12c */
(( android.os.Vibrator ) v0 ).vibrate ( v1, v2 ); // invoke-virtual {v0, v1, v2}, Landroid/os/Vibrator;->vibrate(J)V
/* .line 182 */
return;
} // .end method
