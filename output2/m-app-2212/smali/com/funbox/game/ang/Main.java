public class com.funbox.game.ang.Main extends android.app.Activity {
	 /* .source "Main.java" */
	 /* # annotations */
	 /* .annotation system Ldalvik/annotation/MemberClasses; */
	 /* value = { */
	 /* Lcom/funbox/game/ang/Main$LearnGestureListener; */
	 /* } */
} // .end annotation
/* # instance fields */
private final java.lang.String PREFS_NAME;
public com.admob.android.ads.AdView mAdBottom;
public com.admob.android.ads.AdView mAdMiddle;
private android.widget.ProgressBar mBar;
public com.funbox.game.ang.GameSound mGameSound;
public com.funbox.game.ang.GameView mGameView;
private android.view.GestureDetector mGestureDetector;
private java.lang.Thread mJob;
private Boolean mJobRun;
private android.media.MediaPlayer mMusicMP;
private java.util.Random mRand;
private Boolean mResumeFromPause;
private java.util.HashMap mSoundMap;
/* .annotation system Ldalvik/annotation/Signature; */
/* value = { */
/* "Ljava/util/HashMap", */
/* "<", */
/* "Ljava/lang/Integer;", */
/* "Ljava/lang/Integer;", */
/* ">;" */
/* } */
} // .end annotation
} // .end field
private android.media.SoundPool mSoundPool;
private android.view.Window window;
/* # direct methods */
public com.funbox.game.ang.Main ( ) {
/* .locals 2 */
/* .prologue */
int v1 = 0; // const/4 v1, 0x0
/* .line 40 */
/* invoke-direct {p0}, Landroid/app/Activity;-><init>()V */
/* .line 41 */
v0 = com.funbox.game.ang.GMenu.PREFS_NAME;
this.PREFS_NAME = v0;
/* .line 44 */
this.mGestureDetector = v1;
/* .line 45 */
this.mMusicMP = v1;
/* .line 58 */
/* new-instance v0, Ljava/util/Random; */
/* invoke-direct {v0}, Ljava/util/Random;-><init>()V */
this.mRand = v0;
/* .line 40 */
return;
} // .end method
private void freeSP ( ) {
/* .locals 2 */
/* .prologue */
int v1 = 0; // const/4 v1, 0x0
/* .line 381 */
v0 = this.mSoundPool;
if ( v0 != null) { // if-eqz v0, :cond_0
/* .line 382 */
v0 = this.mSoundPool;
(( android.media.SoundPool ) v0 ).release ( ); // invoke-virtual {v0}, Landroid/media/SoundPool;->release()V
/* .line 383 */
this.mSoundPool = v1;
/* .line 386 */
} // :cond_0
v0 = this.mSoundMap;
if ( v0 != null) { // if-eqz v0, :cond_1
/* .line 387 */
v0 = this.mSoundMap;
(( java.util.HashMap ) v0 ).clear ( ); // invoke-virtual {v0}, Ljava/util/HashMap;->clear()V
/* .line 388 */
this.mSoundMap = v1;
/* .line 390 */
} // :cond_1
return;
} // .end method
private void initSP ( ) {
/* .locals 6 */
/* .prologue */
/* .line 336 */
/* new-instance v2, Landroid/media/SoundPool; */
/* const/16 v3, 0x1e */
int v4 = 3; // const/4 v4, 0x3
/* const/16 v5, 0x64 */
/* invoke-direct {v2, v3, v4, v5}, Landroid/media/SoundPool;-><init>(III)V */
this.mSoundPool = v2;
/* .line 339 */
/* new-instance v2, Ljava/util/HashMap; */
/* invoke-direct {v2}, Ljava/util/HashMap;-><init>()V */
this.mSoundMap = v2;
/* .line 347 */
v2 = this.mGameSound;
(( java.lang.Object ) v2 ).getClass ( ); // invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;
int v0 = 2; // const/4 v0, 0x2
/* .local v0, "i":I */
} // :goto_0
v2 = this.mGameSound;
(( java.lang.Object ) v2 ).getClass ( ); // invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;
/* const/16 v2, 0xb */
/* if-lt v0, v2, :cond_0 */
/* .line 351 */
return;
/* .line 348 */
} // :cond_0
v2 = this.mSoundPool;
(( com.funbox.game.ang.Main ) p0 ).getBaseContext ( ); // invoke-virtual {p0}, Lcom/funbox/game/ang/Main;->getBaseContext()Landroid/content/Context;
v4 = this.mGameSound;
v4 = (( com.funbox.game.ang.GameSound ) v4 ).getSoundResIdByType ( v0 ); // invoke-virtual {v4, v0}, Lcom/funbox/game/ang/GameSound;->getSoundResIdByType(I)I
int v5 = 0; // const/4 v5, 0x0
v1 = (( android.media.SoundPool ) v2 ).load ( v3, v4, v5 ); // invoke-virtual {v2, v3, v4, v5}, Landroid/media/SoundPool;->load(Landroid/content/Context;II)I
/* .line 349 */
/* .local v1, "sId":I */
v2 = this.mSoundMap;
java.lang.Integer .valueOf ( v0 );
java.lang.Integer .valueOf ( v1 );
(( java.util.HashMap ) v2 ).put ( v3, v4 ); // invoke-virtual {v2, v3, v4}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
/* .line 347 */
/* add-int/lit8 v0, v0, 0x1 */
} // .end method
private void mySleep ( Long p0 ) {
/* .locals 1 */
/* .param p1, "n" # J */
/* .prologue */
/* .line 435 */
try { // :try_start_0
java.lang.Thread .sleep ( p1,p2 );
/* :try_end_0 */
/* .catch Ljava/lang/Exception; {:try_start_0 ..:try_end_0} :catch_0 */
/* .line 439 */
} // :goto_0
return;
/* .line 436 */
/* :catch_0 */
/* move-exception v0 */
} // .end method
private void stopMusic ( ) {
/* .locals 1 */
/* .prologue */
/* .line 411 */
v0 = this.mMusicMP;
if ( v0 != null) { // if-eqz v0, :cond_1
/* .line 412 */
v0 = this.mMusicMP;
v0 = (( android.media.MediaPlayer ) v0 ).isPlaying ( ); // invoke-virtual {v0}, Landroid/media/MediaPlayer;->isPlaying()Z
if ( v0 != null) { // if-eqz v0, :cond_0
/* .line 413 */
v0 = this.mMusicMP;
(( android.media.MediaPlayer ) v0 ).stop ( ); // invoke-virtual {v0}, Landroid/media/MediaPlayer;->stop()V
/* .line 416 */
} // :cond_0
v0 = this.mMusicMP;
(( android.media.MediaPlayer ) v0 ).release ( ); // invoke-virtual {v0}, Landroid/media/MediaPlayer;->release()V
/* .line 417 */
int v0 = 0; // const/4 v0, 0x0
this.mMusicMP = v0;
/* .line 419 */
} // :cond_1
return;
} // .end method
/* # virtual methods */
public void doGameOver ( ) {
/* .locals 0 */
/* .prologue */
/* .line 313 */
return;
} // .end method
public void doShowMenu ( Boolean p0, Integer p1, Integer p2, Integer p3 ) {
/* .locals 4 */
/* .param p1, "gamePause" # Z */
/* .param p2, "gameLife" # I */
/* .param p3, "gameScore" # I */
/* .param p4, "gameLevel" # I */
/* .prologue */
final String v3 = "Main"; // const-string v3, "Main"
/* .line 316 */
final String v1 = "Main"; // const-string v1, "Main"
/* new-instance v1, Ljava/lang/StringBuilder; */
final String v2 = "doShowMenu(),gamePause="; // const-string v2, "doShowMenu(),gamePause="
/* invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V */
if ( p1 != null) { // if-eqz p1, :cond_0
final String v2 = "TRUE"; // const-string v2, "TRUE"
} // :goto_0
(( java.lang.StringBuilder ) v1 ).append ( v2 ); // invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v1 ).toString ( ); // invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
android.util.Log .v ( v3,v1 );
/* .line 318 */
/* new-instance v0, Landroid/content/Intent; */
/* invoke-direct {v0}, Landroid/content/Intent;-><init>()V */
/* .line 319 */
/* .local v0, "itMenu":Landroid/content/Intent; */
/* const-class v1, Lcom/funbox/game/ang/GMenu; */
(( android.content.Intent ) v0 ).setClass ( p0, v1 ); // invoke-virtual {v0, p0, v1}, Landroid/content/Intent;->setClass(Landroid/content/Context;Ljava/lang/Class;)Landroid/content/Intent;
/* .line 321 */
final String v1 = "gamePause"; // const-string v1, "gamePause"
(( android.content.Intent ) v0 ).putExtra ( v1, p1 ); // invoke-virtual {v0, v1, p1}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Z)Landroid/content/Intent;
/* .line 322 */
final String v1 = "gameLife"; // const-string v1, "gameLife"
(( android.content.Intent ) v0 ).putExtra ( v1, p2 ); // invoke-virtual {v0, v1, p2}, Landroid/content/Intent;->putExtra(Ljava/lang/String;I)Landroid/content/Intent;
/* .line 323 */
final String v1 = "gameScore"; // const-string v1, "gameScore"
(( android.content.Intent ) v0 ).putExtra ( v1, p3 ); // invoke-virtual {v0, v1, p3}, Landroid/content/Intent;->putExtra(Ljava/lang/String;I)Landroid/content/Intent;
/* .line 324 */
final String v1 = "gameLevel"; // const-string v1, "gameLevel"
(( android.content.Intent ) v0 ).putExtra ( v1, p4 ); // invoke-virtual {v0, v1, p4}, Landroid/content/Intent;->putExtra(Ljava/lang/String;I)Landroid/content/Intent;
/* .line 326 */
final String v1 = "Main"; // const-string v1, "Main"
/* new-instance v1, Ljava/lang/StringBuilder; */
final String v2 = "doShowMenu(), gameLife="; // const-string v2, "doShowMenu(), gameLife="
/* invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V */
java.lang.Integer .toString ( p2 );
(( java.lang.StringBuilder ) v1 ).append ( v2 ); // invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
final String v2 = ", level="; // const-string v2, ", level="
(( java.lang.StringBuilder ) v1 ).append ( v2 ); // invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
java.lang.Integer .toString ( p4 );
(( java.lang.StringBuilder ) v1 ).append ( v2 ); // invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
/* .line 327 */
final String v2 = ", mScore="; // const-string v2, ", mScore="
(( java.lang.StringBuilder ) v1 ).append ( v2 ); // invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
java.lang.Integer .toString ( p3 );
(( java.lang.StringBuilder ) v1 ).append ( v2 ); // invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v1 ).toString ( ); // invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
/* .line 326 */
android.util.Log .v ( v3,v1 );
/* .line 329 */
(( com.funbox.game.ang.Main ) p0 ).startActivity ( v0 ); // invoke-virtual {p0, v0}, Lcom/funbox/game/ang/Main;->startActivity(Landroid/content/Intent;)V
/* .line 330 */
return;
/* .line 316 */
} // .end local v0 # "itMenu":Landroid/content/Intent;
} // :cond_0
final String v2 = "FALSE"; // const-string v2, "FALSE"
} // .end method
public void exitJob ( ) {
/* .locals 2 */
/* .prologue */
/* .line 137 */
int v0 = 1; // const/4 v0, 0x1
/* .line 139 */
/* .local v0, "bResult":Z */
int v1 = 0; // const/4 v1, 0x0
/* iput-boolean v1, p0, Lcom/funbox/game/ang/Main;->mJobRun:Z */
/* .line 141 */
v1 = this.mJob;
if ( v1 != null) { // if-eqz v1, :cond_1
/* .line 142 */
} // :cond_0
} // :goto_0
/* if-nez v0, :cond_2 */
/* .line 153 */
} // :cond_1
return;
/* .line 144 */
} // :cond_2
try { // :try_start_0
v1 = this.mJob;
if ( v1 != null) { // if-eqz v1, :cond_0
/* .line 145 */
v1 = this.mJob;
(( java.lang.Thread ) v1 ).join ( ); // invoke-virtual {v1}, Ljava/lang/Thread;->join()V
/* :try_end_0 */
/* .catch Ljava/lang/InterruptedException; {:try_start_0 ..:try_end_0} :catch_0 */
/* .line 146 */
int v0 = 0; // const/4 v0, 0x0
/* .line 148 */
/* :catch_0 */
/* move-exception v1 */
} // .end method
public void exitMain ( ) {
/* .locals 5 */
/* .prologue */
int v4 = 0; // const/4 v4, 0x0
final String v2 = "Main"; // const-string v2, "Main"
/* .line 202 */
v0 = this.mGameView;
v0 = this.mGameField;
(( com.funbox.game.ang.GameField ) v0 ).getStatus ( ); // invoke-virtual {v0}, Lcom/funbox/game/ang/GameField;->getStatus()Lcom/funbox/game/ang/GameField$GAME_STATUS;
v1 = com.funbox.game.ang.GameField$GAME_STATUS.GS_GAMEOVER;
/* if-ne v0, v1, :cond_0 */
/* .line 203 */
final String v0 = "Main"; // const-string v0, "Main"
final String v0 = "exitMain(): GameOver, Activity finish()"; // const-string v0, "exitMain(): GameOver, Activity finish()"
android.util.Log .v ( v2,v0 );
/* .line 204 */
v0 = this.mGameView;
(( com.funbox.game.ang.GameView ) v0 ).exitGame ( ); // invoke-virtual {v0}, Lcom/funbox/game/ang/GameView;->exitGame()V
/* .line 206 */
int v0 = 0; // const/4 v0, 0x0
/* .line 207 */
v1 = this.mGameView;
v1 = this.mGameField;
v1 = (( com.funbox.game.ang.GameField ) v1 ).getLife ( ); // invoke-virtual {v1}, Lcom/funbox/game/ang/GameField;->getLife()I
/* .line 208 */
v2 = this.mGameView;
v2 = this.mGameField;
v2 = (( com.funbox.game.ang.GameField ) v2 ).getScore ( ); // invoke-virtual {v2}, Lcom/funbox/game/ang/GameField;->getScore()I
/* .line 209 */
v3 = this.mGameView;
v3 = this.mGameField;
v3 = (( com.funbox.game.ang.GameField ) v3 ).getLevel ( ); // invoke-virtual {v3}, Lcom/funbox/game/ang/GameField;->getLevel()I
/* .line 206 */
(( com.funbox.game.ang.Main ) p0 ).doShowMenu ( v0, v1, v2, v3 ); // invoke-virtual {p0, v0, v1, v2, v3}, Lcom/funbox/game/ang/Main;->doShowMenu(ZIII)V
/* .line 222 */
} // :goto_0
(( com.funbox.game.ang.Main ) p0 ).exitJob ( ); // invoke-virtual {p0}, Lcom/funbox/game/ang/Main;->exitJob()V
/* .line 225 */
/* invoke-direct {p0}, Lcom/funbox/game/ang/Main;->stopMusic()V */
/* .line 229 */
/* invoke-direct {p0}, Lcom/funbox/game/ang/Main;->freeSP()V */
/* .line 231 */
this.mRand = v4;
/* .line 234 */
this.mMusicMP = v4;
/* .line 236 */
(( com.funbox.game.ang.Main ) p0 ).finish ( ); // invoke-virtual {p0}, Lcom/funbox/game/ang/Main;->finish()V
/* .line 237 */
return;
/* .line 212 */
} // :cond_0
final String v0 = "Main"; // const-string v0, "Main"
final String v0 = "exitMain(): GamePause: show Menu"; // const-string v0, "exitMain(): GamePause: show Menu"
android.util.Log .v ( v2,v0 );
/* .line 213 */
v0 = this.mGameView;
(( com.funbox.game.ang.GameView ) v0 ).exitGame ( ); // invoke-virtual {v0}, Lcom/funbox/game/ang/GameView;->exitGame()V
/* .line 215 */
int v0 = 1; // const/4 v0, 0x1
/* .line 216 */
v1 = this.mGameView;
v1 = this.mGameField;
v1 = (( com.funbox.game.ang.GameField ) v1 ).getLife ( ); // invoke-virtual {v1}, Lcom/funbox/game/ang/GameField;->getLife()I
/* .line 217 */
v2 = this.mGameView;
v2 = this.mGameField;
v2 = (( com.funbox.game.ang.GameField ) v2 ).getScore ( ); // invoke-virtual {v2}, Lcom/funbox/game/ang/GameField;->getScore()I
/* .line 218 */
v3 = this.mGameView;
v3 = this.mGameField;
v3 = (( com.funbox.game.ang.GameField ) v3 ).getLevel ( ); // invoke-virtual {v3}, Lcom/funbox/game/ang/GameField;->getLevel()I
/* .line 215 */
(( com.funbox.game.ang.Main ) p0 ).doShowMenu ( v0, v1, v2, v3 ); // invoke-virtual {p0, v0, v1, v2, v3}, Lcom/funbox/game/ang/Main;->doShowMenu(ZIII)V
} // .end method
public void onCreate ( android.os.Bundle p0 ) {
/* .locals 11 */
/* .param p1, "savedInstanceState" # Landroid/os/Bundle; */
/* .prologue */
/* const/16 v7, 0x400 */
int v9 = 0; // const/4 v9, 0x0
int v8 = 1; // const/4 v8, 0x1
final String v10 = "Main"; // const-string v10, "Main"
/* .line 69 */
/* invoke-super {p0, p1}, Landroid/app/Activity;->onCreate(Landroid/os/Bundle;)V */
/* .line 72 */
(( com.funbox.game.ang.Main ) p0 ).requestWindowFeature ( v8 ); // invoke-virtual {p0, v8}, Lcom/funbox/game/ang/Main;->requestWindowFeature(I)Z
/* .line 73 */
(( com.funbox.game.ang.Main ) p0 ).getWindow ( ); // invoke-virtual {p0}, Lcom/funbox/game/ang/Main;->getWindow()Landroid/view/Window;
this.window = v6;
/* .line 74 */
v6 = this.window;
(( android.view.Window ) v6 ).setFlags ( v7, v7 ); // invoke-virtual {v6, v7, v7}, Landroid/view/Window;->setFlags(II)V
/* .line 79 */
/* const v6, 0x7f030003 */
(( com.funbox.game.ang.Main ) p0 ).setContentView ( v6 ); // invoke-virtual {p0, v6}, Lcom/funbox/game/ang/Main;->setContentView(I)V
/* .line 80 */
/* const v6, 0x7f06000a */
(( com.funbox.game.ang.Main ) p0 ).findViewById ( v6 ); // invoke-virtual {p0, v6}, Lcom/funbox/game/ang/Main;->findViewById(I)Landroid/view/View;
/* check-cast v6, Lcom/funbox/game/ang/GameView; */
this.mGameView = v6;
/* .line 81 */
v6 = this.mGameView;
(( com.funbox.game.ang.GameView ) v6 ).setActivity ( p0 ); // invoke-virtual {v6, p0}, Lcom/funbox/game/ang/GameView;->setActivity(Landroid/app/Activity;)V
/* .line 82 */
/* const v6, 0x7f06000b */
(( com.funbox.game.ang.Main ) p0 ).findViewById ( v6 ); // invoke-virtual {p0, v6}, Lcom/funbox/game/ang/Main;->findViewById(I)Landroid/view/View;
/* check-cast v6, Lcom/admob/android/ads/AdView; */
this.mAdMiddle = v6;
/* .line 83 */
/* const v6, 0x7f06000c */
(( com.funbox.game.ang.Main ) p0 ).findViewById ( v6 ); // invoke-virtual {p0, v6}, Lcom/funbox/game/ang/Main;->findViewById(I)Landroid/view/View;
/* check-cast v6, Lcom/admob/android/ads/AdView; */
this.mAdBottom = v6;
/* .line 88 */
/* new-instance v6, Lcom/funbox/game/ang/GameSound; */
/* invoke-direct {v6, v9, v8, v8}, Lcom/funbox/game/ang/GameSound;-><init>(ZZZ)V */
this.mGameSound = v6;
/* .line 90 */
v6 = this.PREFS_NAME;
(( com.funbox.game.ang.Main ) p0 ).getSharedPreferences ( v6, v9 ); // invoke-virtual {p0, v6, v9}, Lcom/funbox/game/ang/Main;->getSharedPreferences(Ljava/lang/String;I)Landroid/content/SharedPreferences;
/* .line 91 */
/* .local v5, "settings":Landroid/content/SharedPreferences; */
v6 = this.mGameSound;
v7 = final String v7 = "isMusic"; // const-string v7, "isMusic"
/* iput-boolean v7, v6, Lcom/funbox/game/ang/GameSound;->mMusicOn:Z */
/* .line 92 */
v6 = this.mGameSound;
v7 = final String v7 = "isSound"; // const-string v7, "isSound"
/* iput-boolean v7, v6, Lcom/funbox/game/ang/GameSound;->mSoundOn:Z */
/* .line 93 */
v6 = this.mGameSound;
v7 = final String v7 = "isVibrate"; // const-string v7, "isVibrate"
/* iput-boolean v7, v6, Lcom/funbox/game/ang/GameSound;->mVibrateOn:Z */
/* .line 95 */
final String v6 = "Main"; // const-string v6, "Main"
/* new-instance v6, Ljava/lang/StringBuilder; */
final String v7 = "onCreate(), mSoundOn="; // const-string v7, "onCreate(), mSoundOn="
/* invoke-direct {v6, v7}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V */
v7 = this.mGameSound;
/* iget-boolean v7, v7, Lcom/funbox/game/ang/GameSound;->mSoundOn:Z */
if ( v7 != null) { // if-eqz v7, :cond_1
final String v7 = "TRUE"; // const-string v7, "TRUE"
} // :goto_0
(( java.lang.StringBuilder ) v6 ).append ( v7 ); // invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v6 ).toString ( ); // invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
android.util.Log .v ( v10,v6 );
/* .line 97 */
/* invoke-direct {p0}, Lcom/funbox/game/ang/Main;->initSP()V */
/* .line 100 */
(( com.funbox.game.ang.Main ) p0 ).getIntent ( ); // invoke-virtual {p0}, Lcom/funbox/game/ang/Main;->getIntent()Landroid/content/Intent;
(( android.content.Intent ) v6 ).getExtras ( ); // invoke-virtual {v6}, Landroid/content/Intent;->getExtras()Landroid/os/Bundle;
/* .line 101 */
/* .local v0, "b":Landroid/os/Bundle; */
if ( v0 != null) { // if-eqz v0, :cond_2
/* .line 102 */
final String v6 = "Main"; // const-string v6, "Main"
final String v6 = "onCreate(), b != null"; // const-string v6, "onCreate(), b != null"
android.util.Log .v ( v10,v6 );
/* .line 104 */
final String v6 = "gamePause"; // const-string v6, "gamePause"
v3 = (( android.os.Bundle ) v0 ).getBoolean ( v6, v9 ); // invoke-virtual {v0, v6, v9}, Landroid/os/Bundle;->getBoolean(Ljava/lang/String;Z)Z
/* .line 105 */
/* .local v3, "gamePause":Z */
if ( v3 != null) { // if-eqz v3, :cond_0
/* .line 106 */
final String v6 = "Main"; // const-string v6, "Main"
final String v6 = "onCreate(), b != null, gamePause=true"; // const-string v6, "onCreate(), b != null, gamePause=true"
android.util.Log .v ( v10,v6 );
/* .line 108 */
final String v6 = "gameLife"; // const-string v6, "gameLife"
v2 = (( android.os.Bundle ) v0 ).getInt ( v6, v9 ); // invoke-virtual {v0, v6, v9}, Landroid/os/Bundle;->getInt(Ljava/lang/String;I)I
/* .line 109 */
/* .local v2, "gameLife":I */
final String v6 = "gameLevel"; // const-string v6, "gameLevel"
v1 = (( android.os.Bundle ) v0 ).getInt ( v6, v8 ); // invoke-virtual {v0, v6, v8}, Landroid/os/Bundle;->getInt(Ljava/lang/String;I)I
/* .line 110 */
/* .local v1, "gameLevel":I */
final String v6 = "gameScore"; // const-string v6, "gameScore"
v4 = (( android.os.Bundle ) v0 ).getInt ( v6, v9 ); // invoke-virtual {v0, v6, v9}, Landroid/os/Bundle;->getInt(Ljava/lang/String;I)I
/* .line 113 */
/* .local v4, "gameScore":I */
final String v6 = "Main"; // const-string v6, "Main"
/* new-instance v6, Ljava/lang/StringBuilder; */
final String v7 = "onCreate(), gameLife="; // const-string v7, "onCreate(), gameLife="
/* invoke-direct {v6, v7}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V */
java.lang.Integer .toString ( v2 );
(( java.lang.StringBuilder ) v6 ).append ( v7 ); // invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
final String v7 = ", level="; // const-string v7, ", level="
(( java.lang.StringBuilder ) v6 ).append ( v7 ); // invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
java.lang.Integer .toString ( v1 );
(( java.lang.StringBuilder ) v6 ).append ( v7 ); // invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v6 ).toString ( ); // invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
android.util.Log .v ( v10,v6 );
/* .line 115 */
v6 = this.mGameView;
v6 = this.mGameField;
(( com.funbox.game.ang.GameField ) v6 ).restoreData ( v2, v4, v1 ); // invoke-virtual {v6, v2, v4, v1}, Lcom/funbox/game/ang/GameField;->restoreData(III)V
/* .line 123 */
} // .end local v1 # "gameLevel":I
} // .end local v2 # "gameLife":I
} // .end local v3 # "gamePause":Z
} // .end local v4 # "gameScore":I
} // :cond_0
} // :goto_1
/* new-instance v6, Landroid/view/GestureDetector; */
/* new-instance v7, Lcom/funbox/game/ang/Main$LearnGestureListener; */
/* invoke-direct {v7, p0}, Lcom/funbox/game/ang/Main$LearnGestureListener;-><init>(Lcom/funbox/game/ang/Main;)V */
/* invoke-direct {v6, p0, v7}, Landroid/view/GestureDetector;-><init>(Landroid/content/Context;Landroid/view/GestureDetector$OnGestureListener;)V */
this.mGestureDetector = v6;
/* .line 124 */
/* iput-boolean v9, p0, Lcom/funbox/game/ang/Main;->mResumeFromPause:Z */
/* .line 126 */
final String v6 = "Main"; // const-string v6, "Main"
final String v6 = "onCreate()...finished"; // const-string v6, "onCreate()...finished"
android.util.Log .v ( v10,v6 );
/* .line 129 */
(( com.funbox.game.ang.Main ) p0 ).playMusic ( ); // invoke-virtual {p0}, Lcom/funbox/game/ang/Main;->playMusic()V
/* .line 134 */
return;
/* .line 95 */
} // .end local v0 # "b":Landroid/os/Bundle;
} // :cond_1
final String v7 = "FALSE"; // const-string v7, "FALSE"
/* goto/16 :goto_0 */
/* .line 120 */
/* .restart local v0 # "b":Landroid/os/Bundle; */
} // :cond_2
final String v6 = "Main"; // const-string v6, "Main"
final String v6 = "onCreate(), b = null"; // const-string v6, "onCreate(), b = null"
android.util.Log .v ( v10,v6 );
} // .end method
public Boolean onKeyDown ( Integer p0, android.view.KeyEvent p1 ) {
/* .locals 1 */
/* .param p1, "keyCode" # I */
/* .param p2, "event" # Landroid/view/KeyEvent; */
/* .prologue */
/* .line 187 */
int v0 = 4; // const/4 v0, 0x4
/* if-ne p1, v0, :cond_0 */
/* .line 188 */
(( com.funbox.game.ang.Main ) p0 ).exitMain ( ); // invoke-virtual {p0}, Lcom/funbox/game/ang/Main;->exitMain()V
/* .line 190 */
int v0 = 1; // const/4 v0, 0x1
/* .line 192 */
} // :goto_0
} // :cond_0
v0 = /* invoke-super {p0, p1, p2}, Landroid/app/Activity;->onKeyDown(ILandroid/view/KeyEvent;)Z */
} // .end method
protected void onPause ( ) {
/* .locals 2 */
/* .prologue */
/* .line 157 */
/* invoke-super {p0}, Landroid/app/Activity;->onPause()V */
/* .line 159 */
v0 = this.mGameView;
(( com.funbox.game.ang.GameView ) v0 ).exitGame ( ); // invoke-virtual {v0}, Lcom/funbox/game/ang/GameView;->exitGame()V
/* .line 160 */
/* invoke-direct {p0}, Lcom/funbox/game/ang/Main;->stopMusic()V */
/* .line 162 */
int v0 = 1; // const/4 v0, 0x1
/* iput-boolean v0, p0, Lcom/funbox/game/ang/Main;->mResumeFromPause:Z */
/* .line 163 */
final String v0 = "Main"; // const-string v0, "Main"
final String v1 = "onPause()...call"; // const-string v1, "onPause()...call"
android.util.Log .v ( v0,v1 );
/* .line 164 */
return;
} // .end method
protected void onResume ( ) {
/* .locals 2 */
/* .prologue */
/* .line 167 */
final String v0 = "Main"; // const-string v0, "Main"
final String v1 = "onResume()...call"; // const-string v1, "onResume()...call"
android.util.Log .v ( v0,v1 );
/* .line 168 */
/* invoke-super {p0}, Landroid/app/Activity;->onResume()V */
/* .line 170 */
/* iget-boolean v0, p0, Lcom/funbox/game/ang/Main;->mResumeFromPause:Z */
if ( v0 != null) { // if-eqz v0, :cond_0
/* .line 171 */
(( com.funbox.game.ang.Main ) p0 ).exitMain ( ); // invoke-virtual {p0}, Lcom/funbox/game/ang/Main;->exitMain()V
/* .line 173 */
} // :cond_0
return;
} // .end method
public void onSaveInstanceState ( android.os.Bundle p0 ) {
/* .locals 0 */
/* .param p1, "outState" # Landroid/os/Bundle; */
/* .prologue */
/* .line 183 */
return;
} // .end method
protected void onStop ( ) {
/* .locals 2 */
/* .prologue */
/* .line 176 */
/* invoke-super {p0}, Landroid/app/Activity;->onStop()V */
/* .line 177 */
final String v0 = "Main"; // const-string v0, "Main"
final String v1 = "onStop()...call"; // const-string v1, "onStop()...call"
android.util.Log .v ( v0,v1 );
/* .line 178 */
return;
} // .end method
public Boolean onTouchEvent ( android.view.MotionEvent p0 ) {
/* .locals 1 */
/* .param p1, "event" # Landroid/view/MotionEvent; */
/* .prologue */
/* .line 197 */
/* invoke-super {p0, p1}, Landroid/app/Activity;->onTouchEvent(Landroid/view/MotionEvent;)Z */
/* .line 198 */
v0 = this.mGestureDetector;
v0 = (( android.view.GestureDetector ) v0 ).onTouchEvent ( p1 ); // invoke-virtual {v0, p1}, Landroid/view/GestureDetector;->onTouchEvent(Landroid/view/MotionEvent;)Z
} // .end method
public void playMusic ( ) {
/* .locals 5 */
/* .prologue */
int v4 = 1; // const/4 v4, 0x1
/* .line 393 */
final String v1 = "Main"; // const-string v1, "Main"
/* new-instance v2, Ljava/lang/StringBuilder; */
final String v3 = "playMusic()....mMusicOn="; // const-string v3, "playMusic()....mMusicOn="
/* invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V */
v3 = this.mGameSound;
/* iget-boolean v3, v3, Lcom/funbox/game/ang/GameSound;->mMusicOn:Z */
if ( v3 != null) { // if-eqz v3, :cond_0
final String v3 = "TRUE"; // const-string v3, "TRUE"
} // :goto_0
(( java.lang.StringBuilder ) v2 ).append ( v3 ); // invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v2 ).toString ( ); // invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
android.util.Log .v ( v1,v2 );
/* .line 395 */
v1 = this.mGameSound;
/* iget-boolean v1, v1, Lcom/funbox/game/ang/GameSound;->mMusicOn:Z */
/* if-nez v1, :cond_1 */
/* .line 408 */
} // :goto_1
return;
/* .line 393 */
} // :cond_0
final String v3 = "FALSE"; // const-string v3, "FALSE"
/* .line 398 */
} // :cond_1
/* invoke-direct {p0}, Lcom/funbox/game/ang/Main;->stopMusic()V */
/* .line 400 */
v1 = this.mMusicMP;
/* if-nez v1, :cond_2 */
/* .line 401 */
v1 = this.mGameSound;
v2 = this.mGameSound;
(( java.lang.Object ) v2 ).getClass ( ); // invoke-virtual {v2}, Ljava/lang/Object;->getClass()Ljava/lang/Class;
v0 = (( com.funbox.game.ang.GameSound ) v1 ).getSoundResIdByType ( v4 ); // invoke-virtual {v1, v4}, Lcom/funbox/game/ang/GameSound;->getSoundResIdByType(I)I
/* .line 402 */
/* .local v0, "resId":I */
(( com.funbox.game.ang.Main ) p0 ).getBaseContext ( ); // invoke-virtual {p0}, Lcom/funbox/game/ang/Main;->getBaseContext()Landroid/content/Context;
android.media.MediaPlayer .create ( v1,v0 );
this.mMusicMP = v1;
/* .line 406 */
} // .end local v0 # "resId":I
} // :cond_2
v1 = this.mMusicMP;
(( android.media.MediaPlayer ) v1 ).start ( ); // invoke-virtual {v1}, Landroid/media/MediaPlayer;->start()V
/* .line 407 */
v1 = this.mMusicMP;
(( android.media.MediaPlayer ) v1 ).setLooping ( v4 ); // invoke-virtual {v1, v4}, Landroid/media/MediaPlayer;->setLooping(Z)V
} // .end method
public void playSP ( Integer p0 ) {
/* .locals 9 */
/* .param p1, "soundId" # I */
/* .prologue */
int v8 = 7; // const/4 v8, 0x7
int v6 = 3; // const/4 v6, 0x3
int v5 = 2; // const/4 v5, 0x2
int v4 = 0; // const/4 v4, 0x0
/* .line 354 */
v0 = this.mGameSound;
/* iget-boolean v0, v0, Lcom/funbox/game/ang/GameSound;->mSoundOn:Z */
/* if-nez v0, :cond_1 */
/* .line 378 */
} // :cond_0
} // :goto_0
return;
/* .line 357 */
} // :cond_1
v0 = this.mGameSound;
(( java.lang.Object ) v0 ).getClass ( ); // invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;
/* if-lt p1, v5, :cond_0 */
/* .line 358 */
v0 = this.mGameSound;
(( java.lang.Object ) v0 ).getClass ( ); // invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;
/* const/16 v0, 0xb */
/* if-ge p1, v0, :cond_0 */
/* .line 361 */
/* const/high16 v2, 0x40000000 # 2.0f */
/* .line 362 */
/* .local v2, "vol":F */
v0 = this.mSoundMap;
java.lang.Integer .valueOf ( p1 );
(( java.util.HashMap ) v0 ).get ( v3 ); // invoke-virtual {v0, v3}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;
/* check-cast v0, Ljava/lang/Integer; */
v1 = (( java.lang.Integer ) v0 ).intValue ( ); // invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I
/* .line 363 */
/* .local v1, "resId":I */
v0 = this.mGameSound;
(( java.lang.Object ) v0 ).getClass ( ); // invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;
int v0 = 4; // const/4 v0, 0x4
/* if-ne p1, v0, :cond_2 */
/* .line 364 */
v0 = this.mRand;
v7 = (( java.util.Random ) v0 ).nextInt ( v6 ); // invoke-virtual {v0, v6}, Ljava/util/Random;->nextInt(I)I
/* .line 365 */
/* .local v7, "rd":I */
int v0 = 1; // const/4 v0, 0x1
/* if-ne v7, v0, :cond_4 */
/* .line 366 */
v0 = this.mSoundMap;
v3 = this.mGameSound;
(( java.lang.Object ) v3 ).getClass ( ); // invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;
int v3 = 5; // const/4 v3, 0x5
java.lang.Integer .valueOf ( v3 );
(( java.util.HashMap ) v0 ).get ( v3 ); // invoke-virtual {v0, v3}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;
/* check-cast v0, Ljava/lang/Integer; */
v1 = (( java.lang.Integer ) v0 ).intValue ( ); // invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I
/* .line 374 */
} // .end local v7 # "rd":I
} // :cond_2
} // :goto_1
v0 = this.mGameSound;
(( java.lang.Object ) v0 ).getClass ( ); // invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;
/* if-ne p1, v8, :cond_3 */
/* .line 375 */
/* const/high16 v2, 0x3f800000 # 1.0f */
/* .line 377 */
} // :cond_3
v0 = this.mSoundPool;
/* const/high16 v6, 0x3f800000 # 1.0f */
/* move v3, v2 */
/* move v5, v4 */
/* invoke-virtual/range {v0 ..v6}, Landroid/media/SoundPool;->play(IFFIIF)I */
/* .line 367 */
/* .restart local v7 # "rd":I */
} // :cond_4
/* if-ne v7, v5, :cond_5 */
/* .line 368 */
v0 = this.mSoundMap;
v3 = this.mGameSound;
(( java.lang.Object ) v3 ).getClass ( ); // invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;
int v3 = 6; // const/4 v3, 0x6
java.lang.Integer .valueOf ( v3 );
(( java.util.HashMap ) v0 ).get ( v3 ); // invoke-virtual {v0, v3}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;
/* check-cast v0, Ljava/lang/Integer; */
v1 = (( java.lang.Integer ) v0 ).intValue ( ); // invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I
/* .line 369 */
} // :cond_5
/* if-ne v7, v6, :cond_2 */
/* .line 370 */
v0 = this.mSoundMap;
v3 = this.mGameSound;
(( java.lang.Object ) v3 ).getClass ( ); // invoke-virtual {v3}, Ljava/lang/Object;->getClass()Ljava/lang/Class;
java.lang.Integer .valueOf ( v8 );
(( java.util.HashMap ) v0 ).get ( v3 ); // invoke-virtual {v0, v3}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;
/* check-cast v0, Ljava/lang/Integer; */
v1 = (( java.lang.Integer ) v0 ).intValue ( ); // invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I
} // .end method
public void playVibrate ( ) {
/* .locals 3 */
/* .prologue */
/* .line 422 */
v1 = this.mGameSound;
/* iget-boolean v1, v1, Lcom/funbox/game/ang/GameSound;->mVibrateOn:Z */
/* if-nez v1, :cond_0 */
/* .line 431 */
} // :goto_0
return;
/* .line 426 */
} // :cond_0
try { // :try_start_0
final String v1 = "vibrator"; // const-string v1, "vibrator"
(( com.funbox.game.ang.Main ) p0 ).getSystemService ( v1 ); // invoke-virtual {p0, v1}, Lcom/funbox/game/ang/Main;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;
/* check-cast v0, Landroid/os/Vibrator; */
/* .line 427 */
/* .local v0, "vibrator":Landroid/os/Vibrator; */
int v1 = 4; // const/4 v1, 0x4
/* new-array v1, v1, [J */
/* fill-array-data v1, :array_0 */
int v2 = -1; // const/4 v2, -0x1
(( android.os.Vibrator ) v0 ).vibrate ( v1, v2 ); // invoke-virtual {v0, v1, v2}, Landroid/os/Vibrator;->vibrate([JI)V
/* :try_end_0 */
/* .catch Ljava/lang/Exception; {:try_start_0 ..:try_end_0} :catch_0 */
/* .line 428 */
} // .end local v0 # "vibrator":Landroid/os/Vibrator;
/* :catch_0 */
/* move-exception v1 */
/* .line 427 */
/* :array_0 */
/* .array-data 8 */
/* 0xa */
/* 0x1e */
/* 0x14 */
/* 0xa */
} // .end array-data
} // .end method
public void showAds ( Boolean p0 ) {
/* .locals 3 */
/* .param p1, "b" # Z */
/* .prologue */
/* const/16 v2, 0x8 */
int v1 = 0; // const/4 v1, 0x0
/* .line 442 */
if ( p1 != null) { // if-eqz p1, :cond_0
/* .line 443 */
v0 = this.mAdMiddle;
(( com.admob.android.ads.AdView ) v0 ).setVisibility ( v1 ); // invoke-virtual {v0, v1}, Lcom/admob/android/ads/AdView;->setVisibility(I)V
/* .line 444 */
v0 = this.mAdBottom;
(( com.admob.android.ads.AdView ) v0 ).setVisibility ( v2 ); // invoke-virtual {v0, v2}, Lcom/admob/android/ads/AdView;->setVisibility(I)V
/* .line 449 */
} // :goto_0
return;
/* .line 446 */
} // :cond_0
v0 = this.mAdMiddle;
(( com.admob.android.ads.AdView ) v0 ).setVisibility ( v2 ); // invoke-virtual {v0, v2}, Lcom/admob/android/ads/AdView;->setVisibility(I)V
/* .line 447 */
v0 = this.mAdBottom;
(( com.admob.android.ads.AdView ) v0 ).setVisibility ( v1 ); // invoke-virtual {v0, v1}, Lcom/admob/android/ads/AdView;->setVisibility(I)V
} // .end method
