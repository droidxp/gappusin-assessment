public class org.cocos2dx.lib.Cocos2dxActivity extends android.app.Activity {
	 /* .source "Cocos2dxActivity.java" */
	 /* # static fields */
	 private static final Integer HANDLER_SHOW_DIALOG;
	 private static org.cocos2dx.lib.Cocos2dxAccelerometer accelerometer;
	 private static Boolean accelerometerEnabled;
	 private static org.cocos2dx.lib.Cocos2dxMusic backgroundMusicPlayer;
	 private static android.os.Handler handler;
	 private static java.lang.String packageName;
	 private static org.cocos2dx.lib.Cocos2dxSoundMP soundPlayer;
	 /* # direct methods */
	 static org.cocos2dx.lib.Cocos2dxActivity ( ) {
		 /* .locals 1 */
		 /* .prologue */
		 /* .line 44 */
		 int v0 = 0; // const/4 v0, 0x0
		 org.cocos2dx.lib.Cocos2dxActivity.accelerometerEnabled = (v0!= 0);
		 /* .line 40 */
		 return;
	 } // .end method
	 public org.cocos2dx.lib.Cocos2dxActivity ( ) {
		 /* .locals 0 */
		 /* .prologue */
		 /* .line 40 */
		 /* invoke-direct {p0}, Landroid/app/Activity;-><init>()V */
		 return;
	 } // .end method
	 static void access$0 ( org.cocos2dx.lib.Cocos2dxActivity p0, java.lang.String p1, java.lang.String p2 ) { //synthethic
		 /* .locals 0 */
		 /* .prologue */
		 /* .line 229 */
		 /* invoke-direct {p0, p1, p2}, Lorg/cocos2dx/lib/Cocos2dxActivity;->showDialog(Ljava/lang/String;Ljava/lang/String;)V */
		 return;
	 } // .end method
	 public static void disableAccelerometer ( ) {
		 /* .locals 1 */
		 /* .prologue */
		 /* .line 97 */
		 int v0 = 0; // const/4 v0, 0x0
		 org.cocos2dx.lib.Cocos2dxActivity.accelerometerEnabled = (v0!= 0);
		 /* .line 98 */
		 v0 = org.cocos2dx.lib.Cocos2dxActivity.accelerometer;
		 (( org.cocos2dx.lib.Cocos2dxAccelerometer ) v0 ).disable ( ); // invoke-virtual {v0}, Lorg/cocos2dx/lib/Cocos2dxAccelerometer;->disable()V
		 /* .line 99 */
		 return;
	 } // .end method
	 public static void enableAccelerometer ( ) {
		 /* .locals 1 */
		 /* .prologue */
		 /* .line 92 */
		 int v0 = 1; // const/4 v0, 0x1
		 org.cocos2dx.lib.Cocos2dxActivity.accelerometerEnabled = (v0!= 0);
		 /* .line 93 */
		 v0 = org.cocos2dx.lib.Cocos2dxActivity.accelerometer;
		 (( org.cocos2dx.lib.Cocos2dxAccelerometer ) v0 ).enable ( ); // invoke-virtual {v0}, Lorg/cocos2dx/lib/Cocos2dxAccelerometer;->enable()V
		 /* .line 94 */
		 return;
	 } // .end method
	 public static void end ( ) {
		 /* .locals 1 */
		 /* .prologue */
		 /* .line 182 */
		 v0 = org.cocos2dx.lib.Cocos2dxActivity.backgroundMusicPlayer;
		 (( org.cocos2dx.lib.Cocos2dxMusic ) v0 ).end ( ); // invoke-virtual {v0}, Lorg/cocos2dx/lib/Cocos2dxMusic;->end()V
		 /* .line 183 */
		 v0 = org.cocos2dx.lib.Cocos2dxActivity.soundPlayer;
		 (( org.cocos2dx.lib.Cocos2dxSoundMP ) v0 ).end ( ); // invoke-virtual {v0}, Lorg/cocos2dx/lib/Cocos2dxSoundMP;->end()V
		 /* .line 184 */
		 return;
	 } // .end method
	 public static Float getBackgroundMusicVolume ( ) {
		 /* .locals 1 */
		 /* .prologue */
		 /* .line 130 */
		 v0 = org.cocos2dx.lib.Cocos2dxActivity.backgroundMusicPlayer;
		 v0 = 		 (( org.cocos2dx.lib.Cocos2dxMusic ) v0 ).getBackgroundVolume ( ); // invoke-virtual {v0}, Lorg/cocos2dx/lib/Cocos2dxMusic;->getBackgroundVolume()F
	 } // .end method
	 public static java.lang.String getCocos2dxPackageName ( ) {
		 /* .locals 1 */
		 /* .prologue */
		 /* .line 187 */
		 v0 = org.cocos2dx.lib.Cocos2dxActivity.packageName;
	 } // .end method
	 public static java.lang.String getCurrentLanguage ( ) {
		 /* .locals 2 */
		 /* .prologue */
		 /* .line 79 */
		 java.util.Locale .getDefault ( );
		 (( java.util.Locale ) v1 ).getLanguage ( ); // invoke-virtual {v1}, Ljava/util/Locale;->getLanguage()Ljava/lang/String;
		 /* .line 80 */
		 /* .local v0, "languageName":Ljava/lang/String; */
	 } // .end method
	 public static Float getEffectsVolume ( ) {
		 /* .locals 1 */
		 /* .prologue */
		 /* .line 154 */
		 v0 = org.cocos2dx.lib.Cocos2dxActivity.soundPlayer;
		 v0 = 		 (( org.cocos2dx.lib.Cocos2dxSoundMP ) v0 ).getEffectsVolume ( ); // invoke-virtual {v0}, Lorg/cocos2dx/lib/Cocos2dxSoundMP;->getEffectsVolume()F
	 } // .end method
	 public static Boolean isBackgroundMusicPlaying ( ) {
		 /* .locals 1 */
		 /* .prologue */
		 /* .line 126 */
		 v0 = org.cocos2dx.lib.Cocos2dxActivity.backgroundMusicPlayer;
		 v0 = 		 (( org.cocos2dx.lib.Cocos2dxMusic ) v0 ).isBackgroundMusicPlaying ( ); // invoke-virtual {v0}, Lorg/cocos2dx/lib/Cocos2dxMusic;->isBackgroundMusicPlaying()Z
	 } // .end method
	 private static native void nativeSetPaths ( java.lang.String p0 ) {
	 } // .end method
	 public static void pauseAllEffects ( ) {
		 /* .locals 1 */
		 /* .prologue */
		 /* .line 174 */
		 v0 = org.cocos2dx.lib.Cocos2dxActivity.soundPlayer;
		 (( org.cocos2dx.lib.Cocos2dxSoundMP ) v0 ).pauseAllEffects ( ); // invoke-virtual {v0}, Lorg/cocos2dx/lib/Cocos2dxSoundMP;->pauseAllEffects()V
		 /* .line 175 */
		 return;
	 } // .end method
	 public static void pauseBackgroundMusic ( ) {
		 /* .locals 1 */
		 /* .prologue */
		 /* .line 114 */
		 v0 = org.cocos2dx.lib.Cocos2dxActivity.backgroundMusicPlayer;
		 (( org.cocos2dx.lib.Cocos2dxMusic ) v0 ).pauseBackgroundMusic ( ); // invoke-virtual {v0}, Lorg/cocos2dx/lib/Cocos2dxMusic;->pauseBackgroundMusic()V
		 /* .line 115 */
		 return;
	 } // .end method
	 public static void pauseEffect ( Integer p0 ) {
		 /* .locals 1 */
		 /* .param p0, "soundId" # I */
		 /* .prologue */
		 /* .line 146 */
		 v0 = org.cocos2dx.lib.Cocos2dxActivity.soundPlayer;
		 (( org.cocos2dx.lib.Cocos2dxSoundMP ) v0 ).pauseEffect ( p0 ); // invoke-virtual {v0, p0}, Lorg/cocos2dx/lib/Cocos2dxSoundMP;->pauseEffect(I)V
		 /* .line 147 */
		 return;
	 } // .end method
	 public static void playBackgroundMusic ( java.lang.String p0, Boolean p1 ) {
		 /* .locals 1 */
		 /* .param p0, "path" # Ljava/lang/String; */
		 /* .param p1, "isLoop" # Z */
		 /* .prologue */
		 /* .line 106 */
		 v0 = org.cocos2dx.lib.Cocos2dxActivity.backgroundMusicPlayer;
		 (( org.cocos2dx.lib.Cocos2dxMusic ) v0 ).playBackgroundMusic ( p0, p1 ); // invoke-virtual {v0, p0, p1}, Lorg/cocos2dx/lib/Cocos2dxMusic;->playBackgroundMusic(Ljava/lang/String;Z)V
		 /* .line 107 */
		 return;
	 } // .end method
	 public static Integer playEffect ( java.lang.String p0, Boolean p1 ) {
		 /* .locals 1 */
		 /* .param p0, "path" # Ljava/lang/String; */
		 /* .param p1, "isLoop" # Z */
		 /* .prologue */
		 /* .line 138 */
		 v0 = org.cocos2dx.lib.Cocos2dxActivity.soundPlayer;
		 v0 = 		 (( org.cocos2dx.lib.Cocos2dxSoundMP ) v0 ).playEffect ( p0, p1 ); // invoke-virtual {v0, p0, p1}, Lorg/cocos2dx/lib/Cocos2dxSoundMP;->playEffect(Ljava/lang/String;Z)I
	 } // .end method
	 public static void preloadBackgroundMusic ( java.lang.String p0 ) {
		 /* .locals 1 */
		 /* .param p0, "path" # Ljava/lang/String; */
		 /* .prologue */
		 /* .line 102 */
		 v0 = org.cocos2dx.lib.Cocos2dxActivity.backgroundMusicPlayer;
		 (( org.cocos2dx.lib.Cocos2dxMusic ) v0 ).preloadBackgroundMusic ( p0 ); // invoke-virtual {v0, p0}, Lorg/cocos2dx/lib/Cocos2dxMusic;->preloadBackgroundMusic(Ljava/lang/String;)V
		 /* .line 103 */
		 return;
	 } // .end method
	 public static void preloadEffect ( java.lang.String p0 ) {
		 /* .locals 1 */
		 /* .param p0, "path" # Ljava/lang/String; */
		 /* .prologue */
		 /* .line 162 */
		 v0 = org.cocos2dx.lib.Cocos2dxActivity.soundPlayer;
		 (( org.cocos2dx.lib.Cocos2dxSoundMP ) v0 ).preloadEffect ( p0 ); // invoke-virtual {v0, p0}, Lorg/cocos2dx/lib/Cocos2dxSoundMP;->preloadEffect(Ljava/lang/String;)I
		 /* .line 163 */
		 return;
	 } // .end method
	 public static void resumeAllEffects ( ) {
		 /* .locals 1 */
		 /* .prologue */
		 /* .line 178 */
		 v0 = org.cocos2dx.lib.Cocos2dxActivity.soundPlayer;
		 (( org.cocos2dx.lib.Cocos2dxSoundMP ) v0 ).resumeAllEffects ( ); // invoke-virtual {v0}, Lorg/cocos2dx/lib/Cocos2dxSoundMP;->resumeAllEffects()V
		 /* .line 179 */
		 return;
	 } // .end method
	 public static void resumeBackgroundMusic ( ) {
		 /* .locals 1 */
		 /* .prologue */
		 /* .line 118 */
		 v0 = org.cocos2dx.lib.Cocos2dxActivity.backgroundMusicPlayer;
		 (( org.cocos2dx.lib.Cocos2dxMusic ) v0 ).resumeBackgroundMusic ( ); // invoke-virtual {v0}, Lorg/cocos2dx/lib/Cocos2dxMusic;->resumeBackgroundMusic()V
		 /* .line 119 */
		 return;
	 } // .end method
	 public static void resumeEffect ( Integer p0 ) {
		 /* .locals 1 */
		 /* .param p0, "soundId" # I */
		 /* .prologue */
		 /* .line 150 */
		 v0 = org.cocos2dx.lib.Cocos2dxActivity.soundPlayer;
		 (( org.cocos2dx.lib.Cocos2dxSoundMP ) v0 ).resumeEffect ( p0 ); // invoke-virtual {v0, p0}, Lorg/cocos2dx/lib/Cocos2dxSoundMP;->resumeEffect(I)V
		 /* .line 151 */
		 return;
	 } // .end method
	 public static void rewindBackgroundMusic ( ) {
		 /* .locals 1 */
		 /* .prologue */
		 /* .line 122 */
		 v0 = org.cocos2dx.lib.Cocos2dxActivity.backgroundMusicPlayer;
		 (( org.cocos2dx.lib.Cocos2dxMusic ) v0 ).rewindBackgroundMusic ( ); // invoke-virtual {v0}, Lorg/cocos2dx/lib/Cocos2dxMusic;->rewindBackgroundMusic()V
		 /* .line 123 */
		 return;
	 } // .end method
	 public static void setBackgroundMusicVolume ( Float p0 ) {
		 /* .locals 1 */
		 /* .param p0, "volume" # F */
		 /* .prologue */
		 /* .line 134 */
		 v0 = org.cocos2dx.lib.Cocos2dxActivity.backgroundMusicPlayer;
		 (( org.cocos2dx.lib.Cocos2dxMusic ) v0 ).setBackgroundVolume ( p0 ); // invoke-virtual {v0, p0}, Lorg/cocos2dx/lib/Cocos2dxMusic;->setBackgroundVolume(F)V
		 /* .line 135 */
		 return;
	 } // .end method
	 public static void setEffectsVolume ( Float p0 ) {
		 /* .locals 1 */
		 /* .param p0, "volume" # F */
		 /* .prologue */
		 /* .line 158 */
		 v0 = org.cocos2dx.lib.Cocos2dxActivity.soundPlayer;
		 (( org.cocos2dx.lib.Cocos2dxSoundMP ) v0 ).setEffectsVolume ( p0 ); // invoke-virtual {v0, p0}, Lorg/cocos2dx/lib/Cocos2dxSoundMP;->setEffectsVolume(F)V
		 /* .line 159 */
		 return;
	 } // .end method
	 private void showDialog ( java.lang.String p0, java.lang.String p1 ) {
		 /* .locals 4 */
		 /* .param p1, "title" # Ljava/lang/String; */
		 /* .param p2, "message" # Ljava/lang/String; */
		 /* .prologue */
		 /* .line 230 */
		 /* new-instance v1, Landroid/app/AlertDialog$Builder; */
		 /* invoke-direct {v1, p0}, Landroid/app/AlertDialog$Builder;-><init>(Landroid/content/Context;)V */
		 /* .line 231 */
		 (( android.app.AlertDialog$Builder ) v1 ).setTitle ( p1 ); // invoke-virtual {v1, p1}, Landroid/app/AlertDialog$Builder;->setTitle(Ljava/lang/CharSequence;)Landroid/app/AlertDialog$Builder;
		 /* .line 232 */
		 (( android.app.AlertDialog$Builder ) v1 ).setMessage ( p2 ); // invoke-virtual {v1, p2}, Landroid/app/AlertDialog$Builder;->setMessage(Ljava/lang/CharSequence;)Landroid/app/AlertDialog$Builder;
		 /* .line 233 */
		 final String v2 = "Ok"; // const-string v2, "Ok"
		 /* .line 234 */
		 /* new-instance v3, Lorg/cocos2dx/lib/Cocos2dxActivity$2; */
		 /* invoke-direct {v3, p0}, Lorg/cocos2dx/lib/Cocos2dxActivity$2;-><init>(Lorg/cocos2dx/lib/Cocos2dxActivity;)V */
		 /* .line 233 */
		 (( android.app.AlertDialog$Builder ) v1 ).setPositiveButton ( v2, v3 ); // invoke-virtual {v1, v2, v3}, Landroid/app/AlertDialog$Builder;->setPositiveButton(Ljava/lang/CharSequence;Landroid/content/DialogInterface$OnClickListener;)Landroid/app/AlertDialog$Builder;
		 /* .line 239 */
		 (( android.app.AlertDialog$Builder ) v1 ).create ( ); // invoke-virtual {v1}, Landroid/app/AlertDialog$Builder;->create()Landroid/app/AlertDialog;
		 /* .line 241 */
		 /* .local v0, "dialog":Landroid/app/Dialog; */
		 (( android.app.Dialog ) v0 ).show ( ); // invoke-virtual {v0}, Landroid/app/Dialog;->show()V
		 /* .line 242 */
		 return;
	 } // .end method
	 public static void showMessageBox ( java.lang.String p0, java.lang.String p1 ) {
		 /* .locals 2 */
		 /* .param p0, "title" # Ljava/lang/String; */
		 /* .param p1, "message" # Ljava/lang/String; */
		 /* .prologue */
		 /* .line 84 */
		 /* new-instance v0, Landroid/os/Message; */
		 /* invoke-direct {v0}, Landroid/os/Message;-><init>()V */
		 /* .line 85 */
		 /* .local v0, "msg":Landroid/os/Message; */
		 int v1 = 1; // const/4 v1, 0x1
		 /* iput v1, v0, Landroid/os/Message;->what:I */
		 /* .line 86 */
		 /* new-instance v1, Lorg/cocos2dx/lib/DialogMessage; */
		 /* invoke-direct {v1, p0, p1}, Lorg/cocos2dx/lib/DialogMessage;-><init>(Ljava/lang/String;Ljava/lang/String;)V */
		 this.obj = v1;
		 /* .line 88 */
		 v1 = org.cocos2dx.lib.Cocos2dxActivity.handler;
		 (( android.os.Handler ) v1 ).sendMessage ( v0 ); // invoke-virtual {v1, v0}, Landroid/os/Handler;->sendMessage(Landroid/os/Message;)Z
		 /* .line 89 */
		 return;
	 } // .end method
	 public static void stopAllEffects ( ) {
		 /* .locals 1 */
		 /* .prologue */
		 /* .line 170 */
		 v0 = org.cocos2dx.lib.Cocos2dxActivity.soundPlayer;
		 (( org.cocos2dx.lib.Cocos2dxSoundMP ) v0 ).stopAllEffects ( ); // invoke-virtual {v0}, Lorg/cocos2dx/lib/Cocos2dxSoundMP;->stopAllEffects()V
		 /* .line 171 */
		 return;
	 } // .end method
	 public static void stopBackgroundMusic ( ) {
		 /* .locals 1 */
		 /* .prologue */
		 /* .line 110 */
		 v0 = org.cocos2dx.lib.Cocos2dxActivity.backgroundMusicPlayer;
		 (( org.cocos2dx.lib.Cocos2dxMusic ) v0 ).stopBackgroundMusic ( ); // invoke-virtual {v0}, Lorg/cocos2dx/lib/Cocos2dxMusic;->stopBackgroundMusic()V
		 /* .line 111 */
		 return;
	 } // .end method
	 public static void stopEffect ( Integer p0 ) {
		 /* .locals 1 */
		 /* .param p0, "soundId" # I */
		 /* .prologue */
		 /* .line 142 */
		 v0 = org.cocos2dx.lib.Cocos2dxActivity.soundPlayer;
		 (( org.cocos2dx.lib.Cocos2dxSoundMP ) v0 ).stopEffect ( p0 ); // invoke-virtual {v0, p0}, Lorg/cocos2dx/lib/Cocos2dxSoundMP;->stopEffect(I)V
		 /* .line 143 */
		 return;
	 } // .end method
	 public static void terminateProcess ( ) {
		 /* .locals 1 */
		 /* .prologue */
		 /* .line 191 */
		 v0 = 		 android.os.Process .myPid ( );
		 android.os.Process .killProcess ( v0 );
		 /* .line 192 */
		 return;
	 } // .end method
	 public static void unloadEffect ( java.lang.String p0 ) {
		 /* .locals 1 */
		 /* .param p0, "path" # Ljava/lang/String; */
		 /* .prologue */
		 /* .line 166 */
		 v0 = org.cocos2dx.lib.Cocos2dxActivity.soundPlayer;
		 (( org.cocos2dx.lib.Cocos2dxSoundMP ) v0 ).unloadEffect ( p0 ); // invoke-virtual {v0, p0}, Lorg/cocos2dx/lib/Cocos2dxSoundMP;->unloadEffect(Ljava/lang/String;)V
		 /* .line 167 */
		 return;
	 } // .end method
	 /* # virtual methods */
	 protected void onCreate ( android.os.Bundle p0 ) {
		 /* .locals 2 */
		 /* .param p1, "savedInstanceState" # Landroid/os/Bundle; */
		 /* .prologue */
		 /* .line 53 */
		 /* invoke-super {p0, p1}, Landroid/app/Activity;->onCreate(Landroid/os/Bundle;)V */
		 /* .line 56 */
		 /* new-instance v0, Landroid/util/DisplayMetrics; */
		 /* invoke-direct {v0}, Landroid/util/DisplayMetrics;-><init>()V */
		 /* .line 57 */
		 /* .local v0, "dm":Landroid/util/DisplayMetrics; */
		 (( org.cocos2dx.lib.Cocos2dxActivity ) p0 ).getWindowManager ( ); // invoke-virtual {p0}, Lorg/cocos2dx/lib/Cocos2dxActivity;->getWindowManager()Landroid/view/WindowManager;
		 (( android.view.Display ) v1 ).getMetrics ( v0 ); // invoke-virtual {v1, v0}, Landroid/view/Display;->getMetrics(Landroid/util/DisplayMetrics;)V
		 /* .line 58 */
		 /* new-instance v1, Lorg/cocos2dx/lib/Cocos2dxAccelerometer; */
		 /* invoke-direct {v1, p0}, Lorg/cocos2dx/lib/Cocos2dxAccelerometer;-><init>(Landroid/content/Context;)V */
		 /* .line 61 */
		 /* new-instance v1, Lorg/cocos2dx/lib/Cocos2dxMusic; */
		 /* invoke-direct {v1, p0}, Lorg/cocos2dx/lib/Cocos2dxMusic;-><init>(Landroid/content/Context;)V */
		 /* .line 62 */
		 /* new-instance v1, Lorg/cocos2dx/lib/Cocos2dxSoundMP; */
		 /* invoke-direct {v1, p0}, Lorg/cocos2dx/lib/Cocos2dxSoundMP;-><init>(Landroid/content/Context;)V */
		 /* .line 65 */
		 org.cocos2dx.lib.Cocos2dxBitmap .setContext ( p0 );
		 /* .line 67 */
		 /* new-instance v1, Lorg/cocos2dx/lib/Cocos2dxActivity$1; */
		 /* invoke-direct {v1, p0}, Lorg/cocos2dx/lib/Cocos2dxActivity$1;-><init>(Lorg/cocos2dx/lib/Cocos2dxActivity;)V */
		 /* .line 76 */
		 return;
	 } // .end method
	 protected void onPause ( ) {
		 /* .locals 1 */
		 /* .prologue */
		 /* .line 204 */
		 /* invoke-super {p0}, Landroid/app/Activity;->onPause()V */
		 /* .line 205 */
		 /* sget-boolean v0, Lorg/cocos2dx/lib/Cocos2dxActivity;->accelerometerEnabled:Z */
		 if ( v0 != null) { // if-eqz v0, :cond_0
			 /* .line 206 */
			 v0 = org.cocos2dx.lib.Cocos2dxActivity.accelerometer;
			 (( org.cocos2dx.lib.Cocos2dxAccelerometer ) v0 ).disable ( ); // invoke-virtual {v0}, Lorg/cocos2dx/lib/Cocos2dxAccelerometer;->disable()V
			 /* .line 208 */
		 } // :cond_0
		 return;
	 } // .end method
	 protected void onResume ( ) {
		 /* .locals 1 */
		 /* .prologue */
		 /* .line 196 */
		 /* invoke-super {p0}, Landroid/app/Activity;->onResume()V */
		 /* .line 197 */
		 /* sget-boolean v0, Lorg/cocos2dx/lib/Cocos2dxActivity;->accelerometerEnabled:Z */
		 if ( v0 != null) { // if-eqz v0, :cond_0
			 /* .line 198 */
			 v0 = org.cocos2dx.lib.Cocos2dxActivity.accelerometer;
			 (( org.cocos2dx.lib.Cocos2dxAccelerometer ) v0 ).enable ( ); // invoke-virtual {v0}, Lorg/cocos2dx/lib/Cocos2dxAccelerometer;->enable()V
			 /* .line 200 */
		 } // :cond_0
		 return;
	 } // .end method
	 protected void setPackageName ( java.lang.String p0 ) {
		 /* .locals 6 */
		 /* .param p1, "packageName" # Ljava/lang/String; */
		 /* .prologue */
		 /* .line 211 */
		 /* .line 213 */
		 final String v0 = ""; // const-string v0, ""
		 /* .line 214 */
		 /* .local v0, "apkFilePath":Ljava/lang/String; */
		 int v1 = 0; // const/4 v1, 0x0
		 /* .line 215 */
		 /* .local v1, "appInfo":Landroid/content/pm/ApplicationInfo; */
		 (( org.cocos2dx.lib.Cocos2dxActivity ) p0 ).getApplication ( ); // invoke-virtual {p0}, Lorg/cocos2dx/lib/Cocos2dxActivity;->getApplication()Landroid/app/Application;
		 (( android.app.Application ) v4 ).getPackageManager ( ); // invoke-virtual {v4}, Landroid/app/Application;->getPackageManager()Landroid/content/pm/PackageManager;
		 /* .line 217 */
		 /* .local v3, "packMgmr":Landroid/content/pm/PackageManager; */
		 int v4 = 0; // const/4 v4, 0x0
		 try { // :try_start_0
			 (( android.content.pm.PackageManager ) v3 ).getApplicationInfo ( p1, v4 ); // invoke-virtual {v3, p1, v4}, Landroid/content/pm/PackageManager;->getApplicationInfo(Ljava/lang/String;I)Landroid/content/pm/ApplicationInfo;
			 /* :try_end_0 */
			 /* .catch Landroid/content/pm/PackageManager$NameNotFoundException; {:try_start_0 ..:try_end_0} :catch_0 */
			 /* .line 222 */
			 v0 = this.sourceDir;
			 /* .line 223 */
			 final String v4 = "apk path"; // const-string v4, "apk path"
			 android.util.Log .w ( v4,v0 );
			 /* .line 226 */
			 org.cocos2dx.lib.Cocos2dxActivity .nativeSetPaths ( v0 );
			 /* .line 227 */
			 return;
			 /* .line 218 */
			 /* :catch_0 */
			 /* move-exception v2 */
			 /* .line 219 */
			 /* .local v2, "e":Landroid/content/pm/PackageManager$NameNotFoundException; */
			 (( android.content.pm.PackageManager$NameNotFoundException ) v2 ).printStackTrace ( ); // invoke-virtual {v2}, Landroid/content/pm/PackageManager$NameNotFoundException;->printStackTrace()V
			 /* .line 220 */
			 /* new-instance v4, Ljava/lang/RuntimeException; */
			 final String v5 = "Unable to locate assets, aborting..."; // const-string v5, "Unable to locate assets, aborting..."
			 /* invoke-direct {v4, v5}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V */
			 /* throw v4 */
		 } // .end method
