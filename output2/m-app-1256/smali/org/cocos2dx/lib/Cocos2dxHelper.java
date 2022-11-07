public class org.cocos2dx.lib.Cocos2dxHelper {
	 /* .source "Cocos2dxHelper.java" */
	 /* # annotations */
	 /* .annotation system Ldalvik/annotation/MemberClasses; */
	 /* value = { */
	 /* Lorg/cocos2dx/lib/Cocos2dxHelper$Cocos2dxHelperListener; */
	 /* } */
} // .end annotation
/* # static fields */
private static Boolean sAccelerometerEnabled;
private static android.content.res.AssetManager sAssetManager;
private static org.cocos2dx.lib.Cocos2dxMusic sCocos2dMusic;
private static org.cocos2dx.lib.Cocos2dxSound sCocos2dSound;
private static org.cocos2dx.lib.Cocos2dxAccelerometer sCocos2dxAccelerometer;
private static org.cocos2dx.lib.Cocos2dxHelper$Cocos2dxHelperListener sCocos2dxHelperListener;
private static java.lang.String sPackageName;
/* # direct methods */
public org.cocos2dx.lib.Cocos2dxHelper ( ) {
	 /* .locals 0 */
	 /* .prologue */
	 /* .line 35 */
	 /* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
	 return;
} // .end method
static void access$0 ( Object[] p0 ) { //synthethic
	 /* .locals 0 */
	 /* .prologue */
	 /* .line 89 */
	 org.cocos2dx.lib.Cocos2dxHelper .nativeSetEditTextDialogResult ( p0 );
	 return;
} // .end method
public static void disableAccelerometer ( ) {
	 /* .locals 1 */
	 /* .prologue */
	 /* .line 118 */
	 int v0 = 0; // const/4 v0, 0x0
	 org.cocos2dx.lib.Cocos2dxHelper.sAccelerometerEnabled = (v0!= 0);
	 /* .line 119 */
	 v0 = org.cocos2dx.lib.Cocos2dxHelper.sCocos2dxAccelerometer;
	 (( org.cocos2dx.lib.Cocos2dxAccelerometer ) v0 ).disable ( ); // invoke-virtual {v0}, Lorg/cocos2dx/lib/Cocos2dxAccelerometer;->disable()V
	 /* .line 120 */
	 return;
} // .end method
public static void enableAccelerometer ( ) {
	 /* .locals 1 */
	 /* .prologue */
	 /* .line 108 */
	 int v0 = 1; // const/4 v0, 0x1
	 org.cocos2dx.lib.Cocos2dxHelper.sAccelerometerEnabled = (v0!= 0);
	 /* .line 109 */
	 v0 = org.cocos2dx.lib.Cocos2dxHelper.sCocos2dxAccelerometer;
	 (( org.cocos2dx.lib.Cocos2dxAccelerometer ) v0 ).enable ( ); // invoke-virtual {v0}, Lorg/cocos2dx/lib/Cocos2dxAccelerometer;->enable()V
	 /* .line 110 */
	 return;
} // .end method
public static void end ( ) {
	 /* .locals 1 */
	 /* .prologue */
	 /* .line 203 */
	 v0 = org.cocos2dx.lib.Cocos2dxHelper.sCocos2dMusic;
	 (( org.cocos2dx.lib.Cocos2dxMusic ) v0 ).end ( ); // invoke-virtual {v0}, Lorg/cocos2dx/lib/Cocos2dxMusic;->end()V
	 /* .line 204 */
	 v0 = org.cocos2dx.lib.Cocos2dxHelper.sCocos2dSound;
	 (( org.cocos2dx.lib.Cocos2dxSound ) v0 ).end ( ); // invoke-virtual {v0}, Lorg/cocos2dx/lib/Cocos2dxSound;->end()V
	 /* .line 205 */
	 return;
} // .end method
private static java.lang.String getAbsolutePathOnExternalStorage ( android.content.pm.ApplicationInfo p0, java.lang.String p1 ) {
	 /* .locals 2 */
	 /* .param p0, "pApplicationInfo" # Landroid/content/pm/ApplicationInfo; */
	 /* .param p1, "pPath" # Ljava/lang/String; */
	 /* .prologue */
	 /* .line 247 */
	 /* new-instance v0, Ljava/lang/StringBuilder; */
	 /* invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V */
	 android.os.Environment .getExternalStorageDirectory ( );
	 (( java.lang.StringBuilder ) v0 ).append ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;
	 final String v1 = "/Android/data/"; // const-string v1, "/Android/data/"
	 (( java.lang.StringBuilder ) v0 ).append ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
	 v1 = this.packageName;
	 (( java.lang.StringBuilder ) v0 ).append ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
	 final String v1 = "/files/"; // const-string v1, "/files/"
	 (( java.lang.StringBuilder ) v0 ).append ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
	 (( java.lang.StringBuilder ) v0 ).append ( p1 ); // invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
	 (( java.lang.StringBuilder ) v0 ).toString ( ); // invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
} // .end method
public static android.content.res.AssetManager getAssetManager ( ) {
	 /* .locals 1 */
	 /* .prologue */
	 /* .line 104 */
	 v0 = org.cocos2dx.lib.Cocos2dxHelper.sAssetManager;
} // .end method
public static Float getBackgroundMusicVolume ( ) {
	 /* .locals 1 */
	 /* .prologue */
	 /* .line 151 */
	 v0 = org.cocos2dx.lib.Cocos2dxHelper.sCocos2dMusic;
	 v0 = 	 (( org.cocos2dx.lib.Cocos2dxMusic ) v0 ).getBackgroundVolume ( ); // invoke-virtual {v0}, Lorg/cocos2dx/lib/Cocos2dxMusic;->getBackgroundVolume()F
} // .end method
public static java.lang.String getCocos2dxPackageName ( ) {
	 /* .locals 1 */
	 /* .prologue */
	 /* .line 92 */
	 v0 = org.cocos2dx.lib.Cocos2dxHelper.sPackageName;
} // .end method
public static java.lang.String getCurrentLanguage ( ) {
	 /* .locals 1 */
	 /* .prologue */
	 /* .line 96 */
	 java.util.Locale .getDefault ( );
	 (( java.util.Locale ) v0 ).getLanguage ( ); // invoke-virtual {v0}, Ljava/util/Locale;->getLanguage()Ljava/lang/String;
} // .end method
public static java.lang.String getDeviceModel ( ) {
	 /* .locals 1 */
	 /* .prologue */
	 /* .line 100 */
	 v0 = android.os.Build.MODEL;
} // .end method
public static Float getEffectsVolume ( ) {
	 /* .locals 1 */
	 /* .prologue */
	 /* .line 179 */
	 v0 = org.cocos2dx.lib.Cocos2dxHelper.sCocos2dSound;
	 v0 = 	 (( org.cocos2dx.lib.Cocos2dxSound ) v0 ).getEffectsVolume ( ); // invoke-virtual {v0}, Lorg/cocos2dx/lib/Cocos2dxSound;->getEffectsVolume()F
} // .end method
public static void init ( android.content.Context p0, org.cocos2dx.lib.Cocos2dxHelper$Cocos2dxHelperListener p1 ) {
	 /* .locals 2 */
	 /* .param p0, "pContext" # Landroid/content/Context; */
	 /* .param p1, "pCocos2dxHelperListener" # Lorg/cocos2dx/lib/Cocos2dxHelper$Cocos2dxHelperListener; */
	 /* .prologue */
	 /* .line 58 */
	 (( android.content.Context ) p0 ).getApplicationInfo ( ); // invoke-virtual {p0}, Landroid/content/Context;->getApplicationInfo()Landroid/content/pm/ApplicationInfo;
	 /* .line 60 */
	 /* .local v0, "applicationInfo":Landroid/content/pm/ApplicationInfo; */
	 /* .line 62 */
	 v1 = this.packageName;
	 /* .line 63 */
	 v1 = this.sourceDir;
	 org.cocos2dx.lib.Cocos2dxHelper .nativeSetApkPath ( v1 );
	 /* .line 64 */
	 final String v1 = "assets/"; // const-string v1, "assets/"
	 org.cocos2dx.lib.Cocos2dxHelper .getAbsolutePathOnExternalStorage ( v0,v1 );
	 org.cocos2dx.lib.Cocos2dxHelper .nativeSetExternalAssetPath ( v1 );
	 /* .line 66 */
	 /* new-instance v1, Lorg/cocos2dx/lib/Cocos2dxAccelerometer; */
	 /* invoke-direct {v1, p0}, Lorg/cocos2dx/lib/Cocos2dxAccelerometer;-><init>(Landroid/content/Context;)V */
	 /* .line 67 */
	 /* new-instance v1, Lorg/cocos2dx/lib/Cocos2dxMusic; */
	 /* invoke-direct {v1, p0}, Lorg/cocos2dx/lib/Cocos2dxMusic;-><init>(Landroid/content/Context;)V */
	 /* .line 68 */
	 /* new-instance v1, Lorg/cocos2dx/lib/Cocos2dxSound; */
	 /* invoke-direct {v1, p0}, Lorg/cocos2dx/lib/Cocos2dxSound;-><init>(Landroid/content/Context;)V */
	 /* .line 69 */
	 (( android.content.Context ) p0 ).getAssets ( ); // invoke-virtual {p0}, Landroid/content/Context;->getAssets()Landroid/content/res/AssetManager;
	 /* .line 70 */
	 org.cocos2dx.lib.Cocos2dxBitmap .setContext ( p0 );
	 /* .line 71 */
	 return;
} // .end method
public static Boolean isBackgroundMusicPlaying ( ) {
	 /* .locals 1 */
	 /* .prologue */
	 /* .line 147 */
	 v0 = org.cocos2dx.lib.Cocos2dxHelper.sCocos2dMusic;
	 v0 = 	 (( org.cocos2dx.lib.Cocos2dxMusic ) v0 ).isBackgroundMusicPlaying ( ); // invoke-virtual {v0}, Lorg/cocos2dx/lib/Cocos2dxMusic;->isBackgroundMusicPlaying()Z
} // .end method
private static native void nativeSetApkPath ( java.lang.String p0 ) {
} // .end method
private static native void nativeSetEditTextDialogResult ( Object[] p0 ) {
} // .end method
private static native void nativeSetExternalAssetPath ( java.lang.String p0 ) {
} // .end method
public static void onPause ( ) {
	 /* .locals 1 */
	 /* .prologue */
	 /* .line 214 */
	 /* sget-boolean v0, Lorg/cocos2dx/lib/Cocos2dxHelper;->sAccelerometerEnabled:Z */
	 if ( v0 != null) { // if-eqz v0, :cond_0
		 /* .line 215 */
		 v0 = org.cocos2dx.lib.Cocos2dxHelper.sCocos2dxAccelerometer;
		 (( org.cocos2dx.lib.Cocos2dxAccelerometer ) v0 ).disable ( ); // invoke-virtual {v0}, Lorg/cocos2dx/lib/Cocos2dxAccelerometer;->disable()V
		 /* .line 217 */
	 } // :cond_0
	 return;
} // .end method
public static void onResume ( ) {
	 /* .locals 1 */
	 /* .prologue */
	 /* .line 208 */
	 /* sget-boolean v0, Lorg/cocos2dx/lib/Cocos2dxHelper;->sAccelerometerEnabled:Z */
	 if ( v0 != null) { // if-eqz v0, :cond_0
		 /* .line 209 */
		 v0 = org.cocos2dx.lib.Cocos2dxHelper.sCocos2dxAccelerometer;
		 (( org.cocos2dx.lib.Cocos2dxAccelerometer ) v0 ).enable ( ); // invoke-virtual {v0}, Lorg/cocos2dx/lib/Cocos2dxAccelerometer;->enable()V
		 /* .line 211 */
	 } // :cond_0
	 return;
} // .end method
public static void pauseAllEffects ( ) {
	 /* .locals 1 */
	 /* .prologue */
	 /* .line 191 */
	 v0 = org.cocos2dx.lib.Cocos2dxHelper.sCocos2dSound;
	 (( org.cocos2dx.lib.Cocos2dxSound ) v0 ).pauseAllEffects ( ); // invoke-virtual {v0}, Lorg/cocos2dx/lib/Cocos2dxSound;->pauseAllEffects()V
	 /* .line 192 */
	 return;
} // .end method
public static void pauseBackgroundMusic ( ) {
	 /* .locals 1 */
	 /* .prologue */
	 /* .line 135 */
	 v0 = org.cocos2dx.lib.Cocos2dxHelper.sCocos2dMusic;
	 (( org.cocos2dx.lib.Cocos2dxMusic ) v0 ).pauseBackgroundMusic ( ); // invoke-virtual {v0}, Lorg/cocos2dx/lib/Cocos2dxMusic;->pauseBackgroundMusic()V
	 /* .line 136 */
	 return;
} // .end method
public static void pauseEffect ( Integer p0 ) {
	 /* .locals 1 */
	 /* .param p0, "soundId" # I */
	 /* .prologue */
	 /* .line 171 */
	 v0 = org.cocos2dx.lib.Cocos2dxHelper.sCocos2dSound;
	 (( org.cocos2dx.lib.Cocos2dxSound ) v0 ).pauseEffect ( p0 ); // invoke-virtual {v0, p0}, Lorg/cocos2dx/lib/Cocos2dxSound;->pauseEffect(I)V
	 /* .line 172 */
	 return;
} // .end method
public static void playBackgroundMusic ( java.lang.String p0, Boolean p1 ) {
	 /* .locals 1 */
	 /* .param p0, "pPath" # Ljava/lang/String; */
	 /* .param p1, "isLoop" # Z */
	 /* .prologue */
	 /* .line 127 */
	 v0 = org.cocos2dx.lib.Cocos2dxHelper.sCocos2dMusic;
	 (( org.cocos2dx.lib.Cocos2dxMusic ) v0 ).playBackgroundMusic ( p0, p1 ); // invoke-virtual {v0, p0, p1}, Lorg/cocos2dx/lib/Cocos2dxMusic;->playBackgroundMusic(Ljava/lang/String;Z)V
	 /* .line 128 */
	 return;
} // .end method
public static Integer playEffect ( java.lang.String p0, Boolean p1 ) {
	 /* .locals 1 */
	 /* .param p0, "path" # Ljava/lang/String; */
	 /* .param p1, "isLoop" # Z */
	 /* .prologue */
	 /* .line 163 */
	 v0 = org.cocos2dx.lib.Cocos2dxHelper.sCocos2dSound;
	 v0 = 	 (( org.cocos2dx.lib.Cocos2dxSound ) v0 ).playEffect ( p0, p1 ); // invoke-virtual {v0, p0, p1}, Lorg/cocos2dx/lib/Cocos2dxSound;->playEffect(Ljava/lang/String;Z)I
} // .end method
public static void preloadBackgroundMusic ( java.lang.String p0 ) {
	 /* .locals 1 */
	 /* .param p0, "pPath" # Ljava/lang/String; */
	 /* .prologue */
	 /* .line 123 */
	 v0 = org.cocos2dx.lib.Cocos2dxHelper.sCocos2dMusic;
	 (( org.cocos2dx.lib.Cocos2dxMusic ) v0 ).preloadBackgroundMusic ( p0 ); // invoke-virtual {v0, p0}, Lorg/cocos2dx/lib/Cocos2dxMusic;->preloadBackgroundMusic(Ljava/lang/String;)V
	 /* .line 124 */
	 return;
} // .end method
public static void preloadEffect ( java.lang.String p0 ) {
	 /* .locals 1 */
	 /* .param p0, "path" # Ljava/lang/String; */
	 /* .prologue */
	 /* .line 159 */
	 v0 = org.cocos2dx.lib.Cocos2dxHelper.sCocos2dSound;
	 (( org.cocos2dx.lib.Cocos2dxSound ) v0 ).preloadEffect ( p0 ); // invoke-virtual {v0, p0}, Lorg/cocos2dx/lib/Cocos2dxSound;->preloadEffect(Ljava/lang/String;)I
	 /* .line 160 */
	 return;
} // .end method
public static void resumeAllEffects ( ) {
	 /* .locals 1 */
	 /* .prologue */
	 /* .line 195 */
	 v0 = org.cocos2dx.lib.Cocos2dxHelper.sCocos2dSound;
	 (( org.cocos2dx.lib.Cocos2dxSound ) v0 ).resumeAllEffects ( ); // invoke-virtual {v0}, Lorg/cocos2dx/lib/Cocos2dxSound;->resumeAllEffects()V
	 /* .line 196 */
	 return;
} // .end method
public static void resumeBackgroundMusic ( ) {
	 /* .locals 1 */
	 /* .prologue */
	 /* .line 131 */
	 v0 = org.cocos2dx.lib.Cocos2dxHelper.sCocos2dMusic;
	 (( org.cocos2dx.lib.Cocos2dxMusic ) v0 ).resumeBackgroundMusic ( ); // invoke-virtual {v0}, Lorg/cocos2dx/lib/Cocos2dxMusic;->resumeBackgroundMusic()V
	 /* .line 132 */
	 return;
} // .end method
public static void resumeEffect ( Integer p0 ) {
	 /* .locals 1 */
	 /* .param p0, "soundId" # I */
	 /* .prologue */
	 /* .line 167 */
	 v0 = org.cocos2dx.lib.Cocos2dxHelper.sCocos2dSound;
	 (( org.cocos2dx.lib.Cocos2dxSound ) v0 ).resumeEffect ( p0 ); // invoke-virtual {v0, p0}, Lorg/cocos2dx/lib/Cocos2dxSound;->resumeEffect(I)V
	 /* .line 168 */
	 return;
} // .end method
public static void rewindBackgroundMusic ( ) {
	 /* .locals 1 */
	 /* .prologue */
	 /* .line 143 */
	 v0 = org.cocos2dx.lib.Cocos2dxHelper.sCocos2dMusic;
	 (( org.cocos2dx.lib.Cocos2dxMusic ) v0 ).rewindBackgroundMusic ( ); // invoke-virtual {v0}, Lorg/cocos2dx/lib/Cocos2dxMusic;->rewindBackgroundMusic()V
	 /* .line 144 */
	 return;
} // .end method
public static void setAccelerometerInterval ( Float p0 ) {
	 /* .locals 1 */
	 /* .param p0, "interval" # F */
	 /* .prologue */
	 /* .line 114 */
	 v0 = org.cocos2dx.lib.Cocos2dxHelper.sCocos2dxAccelerometer;
	 (( org.cocos2dx.lib.Cocos2dxAccelerometer ) v0 ).setInterval ( p0 ); // invoke-virtual {v0, p0}, Lorg/cocos2dx/lib/Cocos2dxAccelerometer;->setInterval(F)V
	 /* .line 115 */
	 return;
} // .end method
public static void setBackgroundMusicVolume ( Float p0 ) {
	 /* .locals 1 */
	 /* .param p0, "volume" # F */
	 /* .prologue */
	 /* .line 155 */
	 v0 = org.cocos2dx.lib.Cocos2dxHelper.sCocos2dMusic;
	 (( org.cocos2dx.lib.Cocos2dxMusic ) v0 ).setBackgroundVolume ( p0 ); // invoke-virtual {v0, p0}, Lorg/cocos2dx/lib/Cocos2dxMusic;->setBackgroundVolume(F)V
	 /* .line 156 */
	 return;
} // .end method
public static void setEditTextDialogResult ( java.lang.String p0 ) {
	 /* .locals 3 */
	 /* .param p0, "pResult" # Ljava/lang/String; */
	 /* .prologue */
	 /* .line 233 */
	 try { // :try_start_0
		 final String v1 = "UTF8"; // const-string v1, "UTF8"
		 (( java.lang.String ) p0 ).getBytes ( v1 ); // invoke-virtual {p0, v1}, Ljava/lang/String;->getBytes(Ljava/lang/String;)[B
		 /* .line 235 */
		 /* .local v0, "bytesUTF8":[B */
		 v1 = org.cocos2dx.lib.Cocos2dxHelper.sCocos2dxHelperListener;
		 /* new-instance v2, Lorg/cocos2dx/lib/Cocos2dxHelper$1; */
		 /* invoke-direct {v2, v0}, Lorg/cocos2dx/lib/Cocos2dxHelper$1;-><init>([B)V */
		 /* :try_end_0 */
		 /* .catch Ljava/io/UnsupportedEncodingException; {:try_start_0 ..:try_end_0} :catch_0 */
		 /* .line 244 */
	 } // .end local v0 # "bytesUTF8":[B
} // :goto_0
return;
/* .line 241 */
/* :catch_0 */
/* move-exception v1 */
} // .end method
public static void setEffectsVolume ( Float p0 ) {
/* .locals 1 */
/* .param p0, "volume" # F */
/* .prologue */
/* .line 183 */
v0 = org.cocos2dx.lib.Cocos2dxHelper.sCocos2dSound;
(( org.cocos2dx.lib.Cocos2dxSound ) v0 ).setEffectsVolume ( p0 ); // invoke-virtual {v0, p0}, Lorg/cocos2dx/lib/Cocos2dxSound;->setEffectsVolume(F)V
/* .line 184 */
return;
} // .end method
private static void showDialog ( java.lang.String p0, java.lang.String p1 ) {
/* .locals 1 */
/* .param p0, "pTitle" # Ljava/lang/String; */
/* .param p1, "pMessage" # Ljava/lang/String; */
/* .prologue */
/* .line 224 */
v0 = org.cocos2dx.lib.Cocos2dxHelper.sCocos2dxHelperListener;
/* .line 225 */
return;
} // .end method
private static void showEditTextDialog ( java.lang.String p0, java.lang.String p1, Integer p2, Integer p3, Integer p4, Integer p5 ) {
/* .locals 7 */
/* .param p0, "pTitle" # Ljava/lang/String; */
/* .param p1, "pMessage" # Ljava/lang/String; */
/* .param p2, "pInputMode" # I */
/* .param p3, "pInputFlag" # I */
/* .param p4, "pReturnType" # I */
/* .param p5, "pMaxLength" # I */
/* .prologue */
/* .line 228 */
v0 = org.cocos2dx.lib.Cocos2dxHelper.sCocos2dxHelperListener;
/* move-object v1, p0 */
/* move-object v2, p1 */
/* move v3, p2 */
/* move v4, p3 */
/* move v5, p4 */
/* move v6, p5 */
/* invoke-interface/range {v0 ..v6}, Lorg/cocos2dx/lib/Cocos2dxHelper$Cocos2dxHelperListener;->showEditTextDialog(Ljava/lang/String;Ljava/lang/String;IIII)V */
/* .line 229 */
return;
} // .end method
public static void stopAllEffects ( ) {
/* .locals 1 */
/* .prologue */
/* .line 199 */
v0 = org.cocos2dx.lib.Cocos2dxHelper.sCocos2dSound;
(( org.cocos2dx.lib.Cocos2dxSound ) v0 ).stopAllEffects ( ); // invoke-virtual {v0}, Lorg/cocos2dx/lib/Cocos2dxSound;->stopAllEffects()V
/* .line 200 */
return;
} // .end method
public static void stopBackgroundMusic ( ) {
/* .locals 1 */
/* .prologue */
/* .line 139 */
v0 = org.cocos2dx.lib.Cocos2dxHelper.sCocos2dMusic;
(( org.cocos2dx.lib.Cocos2dxMusic ) v0 ).stopBackgroundMusic ( ); // invoke-virtual {v0}, Lorg/cocos2dx/lib/Cocos2dxMusic;->stopBackgroundMusic()V
/* .line 140 */
return;
} // .end method
public static void stopEffect ( Integer p0 ) {
/* .locals 1 */
/* .param p0, "soundId" # I */
/* .prologue */
/* .line 175 */
v0 = org.cocos2dx.lib.Cocos2dxHelper.sCocos2dSound;
(( org.cocos2dx.lib.Cocos2dxSound ) v0 ).stopEffect ( p0 ); // invoke-virtual {v0, p0}, Lorg/cocos2dx/lib/Cocos2dxSound;->stopEffect(I)V
/* .line 176 */
return;
} // .end method
public static void terminateProcess ( ) {
/* .locals 1 */
/* .prologue */
/* .line 220 */
v0 = android.os.Process .myPid ( );
android.os.Process .killProcess ( v0 );
/* .line 221 */
return;
} // .end method
public static void unloadEffect ( java.lang.String p0 ) {
/* .locals 1 */
/* .param p0, "path" # Ljava/lang/String; */
/* .prologue */
/* .line 187 */
v0 = org.cocos2dx.lib.Cocos2dxHelper.sCocos2dSound;
(( org.cocos2dx.lib.Cocos2dxSound ) v0 ).unloadEffect ( p0 ); // invoke-virtual {v0, p0}, Lorg/cocos2dx/lib/Cocos2dxSound;->unloadEffect(Ljava/lang/String;)V
/* .line 188 */
return;
} // .end method
