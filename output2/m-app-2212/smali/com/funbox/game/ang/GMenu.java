public class com.funbox.game.ang.GMenu extends android.app.Activity {
	 /* .source "GMenu.java" */
	 /* # static fields */
	 public static java.lang.String PREFS_NAME;
	 /* # instance fields */
	 private final Integer REQUEST_CODE;
	 private Integer mGameSaveLevel;
	 private Integer mGameSaveLife;
	 private Boolean mGameSavePause;
	 private Integer mGameSaveScore;
	 private Boolean mIsMusic;
	 private Boolean mIsSound;
	 private Boolean mIsVibrate;
	 private android.media.MediaPlayer mMusicMP;
	 private android.media.MediaPlayer mSoundMP;
	 private android.view.Window window;
	 /* # direct methods */
	 static com.funbox.game.ang.GMenu ( ) {
		 /* .locals 1 */
		 /* .prologue */
		 /* .line 26 */
		 final String v0 = "com.funbox.game.AngryPoke"; // const-string v0, "com.funbox.game.AngryPoke"
		 /* .line 24 */
		 return;
	 } // .end method
	 public com.funbox.game.ang.GMenu ( ) {
		 /* .locals 1 */
		 /* .prologue */
		 /* .line 24 */
		 /* invoke-direct {p0}, Landroid/app/Activity;-><init>()V */
		 /* .line 25 */
		 int v0 = 2; // const/4 v0, 0x2
		 /* iput v0, p0, Lcom/funbox/game/ang/GMenu;->REQUEST_CODE:I */
		 /* .line 24 */
		 return;
	 } // .end method
	 private void FreeMenuSound ( ) {
		 /* .locals 1 */
		 /* .prologue */
		 /* .line 381 */
		 v0 = this.mSoundMP;
		 if ( v0 != null) { // if-eqz v0, :cond_1
			 /* .line 382 */
			 v0 = this.mSoundMP;
			 v0 = 			 (( android.media.MediaPlayer ) v0 ).isPlaying ( ); // invoke-virtual {v0}, Landroid/media/MediaPlayer;->isPlaying()Z
			 if ( v0 != null) { // if-eqz v0, :cond_0
				 /* .line 383 */
				 v0 = this.mSoundMP;
				 (( android.media.MediaPlayer ) v0 ).stop ( ); // invoke-virtual {v0}, Landroid/media/MediaPlayer;->stop()V
				 /* .line 385 */
			 } // :cond_0
			 v0 = this.mSoundMP;
			 (( android.media.MediaPlayer ) v0 ).release ( ); // invoke-virtual {v0}, Landroid/media/MediaPlayer;->release()V
			 /* .line 387 */
		 } // :cond_1
		 return;
	 } // .end method
	 static void access$0 ( com.funbox.game.ang.GMenu p0 ) { //synthethic
		 /* .locals 0 */
		 /* .prologue */
		 /* .line 370 */
		 /* invoke-direct {p0}, Lcom/funbox/game/ang/GMenu;->playMenuSound()V */
		 return;
	 } // .end method
	 static void access$1 ( com.funbox.game.ang.GMenu p0 ) { //synthethic
		 /* .locals 0 */
		 /* .prologue */
		 /* .line 358 */
		 /* invoke-direct {p0}, Lcom/funbox/game/ang/GMenu;->stopMusic()V */
		 return;
	 } // .end method
	 static Boolean access$2 ( com.funbox.game.ang.GMenu p0 ) { //synthethic
		 /* .locals 1 */
		 /* .prologue */
		 /* .line 29 */
		 /* iget-boolean v0, p0, Lcom/funbox/game/ang/GMenu;->mGameSavePause:Z */
	 } // .end method
	 static Integer access$3 ( com.funbox.game.ang.GMenu p0 ) { //synthethic
		 /* .locals 1 */
		 /* .prologue */
		 /* .line 30 */
		 /* iget v0, p0, Lcom/funbox/game/ang/GMenu;->mGameSaveLife:I */
	 } // .end method
	 static Integer access$4 ( com.funbox.game.ang.GMenu p0 ) { //synthethic
		 /* .locals 1 */
		 /* .prologue */
		 /* .line 31 */
		 /* iget v0, p0, Lcom/funbox/game/ang/GMenu;->mGameSaveScore:I */
	 } // .end method
	 static Integer access$5 ( com.funbox.game.ang.GMenu p0 ) { //synthethic
		 /* .locals 1 */
		 /* .prologue */
		 /* .line 32 */
		 /* iget v0, p0, Lcom/funbox/game/ang/GMenu;->mGameSaveLevel:I */
	 } // .end method
	 static void access$6 ( com.funbox.game.ang.GMenu p0 ) { //synthethic
		 /* .locals 0 */
		 /* .prologue */
		 /* .line 267 */
		 /* invoke-direct {p0}, Lcom/funbox/game/ang/GMenu;->exitApp()V */
		 return;
	 } // .end method
	 private void exitApp ( ) {
		 /* .locals 2 */
		 /* .prologue */
		 /* .line 268 */
		 (( com.funbox.game.ang.GMenu ) p0 ).saveGameParam ( ); // invoke-virtual {p0}, Lcom/funbox/game/ang/GMenu;->saveGameParam()V
		 /* .line 270 */
		 /* invoke-direct {p0}, Lcom/funbox/game/ang/GMenu;->stopMusic()V */
		 /* .line 271 */
		 /* invoke-direct {p0}, Lcom/funbox/game/ang/GMenu;->FreeMenuSound()V */
		 /* .line 272 */
		 (( com.funbox.game.ang.GMenu ) p0 ).finish ( ); // invoke-virtual {p0}, Lcom/funbox/game/ang/GMenu;->finish()V
		 /* .line 273 */
		 /* new-instance v0, Landroid/content/Intent; */
		 /* const-class v1, Lcom/funbox/game/promote/AdSplash; */
		 /* invoke-direct {v0, p0, v1}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V */
		 (( com.funbox.game.ang.GMenu ) p0 ).startActivity ( v0 ); // invoke-virtual {p0, v0}, Lcom/funbox/game/ang/GMenu;->startActivity(Landroid/content/Intent;)V
		 /* .line 275 */
		 return;
	 } // .end method
	 private void handleMenuClick ( ) {
		 /* .locals 8 */
		 /* .prologue */
		 /* const v7, 0x7f060012 */
		 /* .line 161 */
		 /* const v6, 0x7f06000d */
		 (( com.funbox.game.ang.GMenu ) p0 ).findViewById ( v6 ); // invoke-virtual {p0, v6}, Lcom/funbox/game/ang/GMenu;->findViewById(I)Landroid/view/View;
		 /* check-cast v3, Landroid/widget/ImageView; */
		 /* .line 162 */
		 /* .local v3, "btnNewGame":Landroid/widget/ImageView; */
		 /* new-instance v6, Lcom/funbox/game/ang/GMenu$1; */
		 /* invoke-direct {v6, p0}, Lcom/funbox/game/ang/GMenu$1;-><init>(Lcom/funbox/game/ang/GMenu;)V */
		 (( android.widget.ImageView ) v3 ).setOnClickListener ( v6 ); // invoke-virtual {v3, v6}, Landroid/widget/ImageView;->setOnClickListener(Landroid/view/View$OnClickListener;)V
		 /* .line 178 */
		 /* const v6, 0x7f06000e */
		 (( com.funbox.game.ang.GMenu ) p0 ).findViewById ( v6 ); // invoke-virtual {p0, v6}, Lcom/funbox/game/ang/GMenu;->findViewById(I)Landroid/view/View;
		 /* check-cast v5, Landroid/widget/ImageView; */
		 /* .line 179 */
		 /* .local v5, "btnResume":Landroid/widget/ImageView; */
		 /* new-instance v6, Lcom/funbox/game/ang/GMenu$2; */
		 /* invoke-direct {v6, p0}, Lcom/funbox/game/ang/GMenu$2;-><init>(Lcom/funbox/game/ang/GMenu;)V */
		 (( android.widget.ImageView ) v5 ).setOnClickListener ( v6 ); // invoke-virtual {v5, v6}, Landroid/widget/ImageView;->setOnClickListener(Landroid/view/View$OnClickListener;)V
		 /* .line 210 */
		 /* const v6, 0x7f06000f */
		 (( com.funbox.game.ang.GMenu ) p0 ).findViewById ( v6 ); // invoke-virtual {p0, v6}, Lcom/funbox/game/ang/GMenu;->findViewById(I)Landroid/view/View;
		 /* check-cast v4, Landroid/widget/ImageView; */
		 /* .line 211 */
		 /* .local v4, "btnOption":Landroid/widget/ImageView; */
		 /* new-instance v6, Lcom/funbox/game/ang/GMenu$3; */
		 /* invoke-direct {v6, p0}, Lcom/funbox/game/ang/GMenu$3;-><init>(Lcom/funbox/game/ang/GMenu;)V */
		 (( android.widget.ImageView ) v4 ).setOnClickListener ( v6 ); // invoke-virtual {v4, v6}, Landroid/widget/ImageView;->setOnClickListener(Landroid/view/View$OnClickListener;)V
		 /* .line 220 */
		 /* const v6, 0x7f060010 */
		 (( com.funbox.game.ang.GMenu ) p0 ).findViewById ( v6 ); // invoke-virtual {p0, v6}, Lcom/funbox/game/ang/GMenu;->findViewById(I)Landroid/view/View;
		 /* check-cast v1, Landroid/widget/ImageView; */
		 /* .line 221 */
		 /* .local v1, "btnHighScore":Landroid/widget/ImageView; */
		 /* new-instance v6, Lcom/funbox/game/ang/GMenu$4; */
		 /* invoke-direct {v6, p0}, Lcom/funbox/game/ang/GMenu$4;-><init>(Lcom/funbox/game/ang/GMenu;)V */
		 (( android.widget.ImageView ) v1 ).setOnClickListener ( v6 ); // invoke-virtual {v1, v6}, Landroid/widget/ImageView;->setOnClickListener(Landroid/view/View$OnClickListener;)V
		 /* .line 236 */
		 (( com.funbox.game.ang.GMenu ) p0 ).findViewById ( v7 ); // invoke-virtual {p0, v7}, Lcom/funbox/game/ang/GMenu;->findViewById(I)Landroid/view/View;
		 /* check-cast v0, Landroid/widget/ImageView; */
		 /* .line 237 */
		 /* .local v0, "btnExit":Landroid/widget/ImageView; */
		 /* new-instance v6, Lcom/funbox/game/ang/GMenu$5; */
		 /* invoke-direct {v6, p0}, Lcom/funbox/game/ang/GMenu$5;-><init>(Lcom/funbox/game/ang/GMenu;)V */
		 (( android.widget.ImageView ) v0 ).setOnClickListener ( v6 ); // invoke-virtual {v0, v6}, Landroid/widget/ImageView;->setOnClickListener(Landroid/view/View$OnClickListener;)V
		 /* .line 246 */
		 /* const v6, 0x7f060011 */
		 (( com.funbox.game.ang.GMenu ) p0 ).findViewById ( v6 ); // invoke-virtual {p0, v6}, Lcom/funbox/game/ang/GMenu;->findViewById(I)Landroid/view/View;
		 /* check-cast v2, Landroid/widget/ImageView; */
		 /* .line 247 */
		 /* .local v2, "btnMoreGame":Landroid/widget/ImageView; */
		 /* new-instance v6, Lcom/funbox/game/ang/GMenu$6; */
		 /* invoke-direct {v6, p0}, Lcom/funbox/game/ang/GMenu$6;-><init>(Lcom/funbox/game/ang/GMenu;)V */
		 (( android.widget.ImageView ) v2 ).setOnClickListener ( v6 ); // invoke-virtual {v2, v6}, Landroid/widget/ImageView;->setOnClickListener(Landroid/view/View$OnClickListener;)V
		 /* .line 256 */
		 (( com.funbox.game.ang.GMenu ) p0 ).findViewById ( v7 ); // invoke-virtual {p0, v7}, Lcom/funbox/game/ang/GMenu;->findViewById(I)Landroid/view/View;
	 } // .end local v0 # "btnExit":Landroid/widget/ImageView;
	 /* check-cast v0, Landroid/widget/ImageView; */
	 /* .line 257 */
	 /* .restart local v0 # "btnExit":Landroid/widget/ImageView; */
	 /* new-instance v6, Lcom/funbox/game/ang/GMenu$7; */
	 /* invoke-direct {v6, p0}, Lcom/funbox/game/ang/GMenu$7;-><init>(Lcom/funbox/game/ang/GMenu;)V */
	 (( android.widget.ImageView ) v0 ).setOnClickListener ( v6 ); // invoke-virtual {v0, v6}, Landroid/widget/ImageView;->setOnClickListener(Landroid/view/View$OnClickListener;)V
	 /* .line 265 */
	 return;
} // .end method
private void pauseMusic ( ) {
	 /* .locals 1 */
	 /* .prologue */
	 /* .line 390 */
	 v0 = this.mMusicMP;
	 if ( v0 != null) { // if-eqz v0, :cond_0
		 /* .line 391 */
		 v0 = this.mMusicMP;
		 (( android.media.MediaPlayer ) v0 ).pause ( ); // invoke-virtual {v0}, Landroid/media/MediaPlayer;->pause()V
		 /* .line 392 */
	 } // :cond_0
	 return;
} // .end method
private void playMenuSound ( ) {
	 /* .locals 2 */
	 /* .prologue */
	 /* .line 371 */
	 v0 = this.mSoundMP;
	 /* if-nez v0, :cond_0 */
	 /* .line 372 */
	 (( com.funbox.game.ang.GMenu ) p0 ).getBaseContext ( ); // invoke-virtual {p0}, Lcom/funbox/game/ang/GMenu;->getBaseContext()Landroid/content/Context;
	 /* const v1, 0x7f040002 */
	 android.media.MediaPlayer .create ( v0,v1 );
	 this.mSoundMP = v0;
	 /* .line 374 */
} // :cond_0
v0 = this.mSoundMP;
v0 = (( android.media.MediaPlayer ) v0 ).isPlaying ( ); // invoke-virtual {v0}, Landroid/media/MediaPlayer;->isPlaying()Z
if ( v0 != null) { // if-eqz v0, :cond_1
	 /* .line 375 */
	 v0 = this.mSoundMP;
	 (( android.media.MediaPlayer ) v0 ).stop ( ); // invoke-virtual {v0}, Landroid/media/MediaPlayer;->stop()V
	 /* .line 377 */
} // :cond_1
v0 = this.mSoundMP;
(( android.media.MediaPlayer ) v0 ).start ( ); // invoke-virtual {v0}, Landroid/media/MediaPlayer;->start()V
/* .line 378 */
return;
} // .end method
private void resumeMusic ( ) {
/* .locals 1 */
/* .prologue */
/* .line 395 */
v0 = this.mMusicMP;
if ( v0 != null) { // if-eqz v0, :cond_0
	 /* iget-boolean v0, p0, Lcom/funbox/game/ang/GMenu;->mIsMusic:Z */
	 if ( v0 != null) { // if-eqz v0, :cond_0
		 /* .line 396 */
		 v0 = this.mMusicMP;
		 (( android.media.MediaPlayer ) v0 ).start ( ); // invoke-virtual {v0}, Landroid/media/MediaPlayer;->start()V
		 /* .line 397 */
	 } // :cond_0
	 return;
} // .end method
private void stopMusic ( ) {
	 /* .locals 1 */
	 /* .prologue */
	 /* .line 359 */
	 v0 = this.mMusicMP;
	 if ( v0 != null) { // if-eqz v0, :cond_1
		 /* .line 360 */
		 v0 = this.mMusicMP;
		 v0 = 		 (( android.media.MediaPlayer ) v0 ).isPlaying ( ); // invoke-virtual {v0}, Landroid/media/MediaPlayer;->isPlaying()Z
		 if ( v0 != null) { // if-eqz v0, :cond_0
			 /* .line 361 */
			 v0 = this.mMusicMP;
			 (( android.media.MediaPlayer ) v0 ).stop ( ); // invoke-virtual {v0}, Landroid/media/MediaPlayer;->stop()V
			 /* .line 364 */
		 } // :cond_0
		 v0 = this.mMusicMP;
		 (( android.media.MediaPlayer ) v0 ).release ( ); // invoke-virtual {v0}, Landroid/media/MediaPlayer;->release()V
		 /* .line 365 */
		 int v0 = 0; // const/4 v0, 0x0
		 this.mMusicMP = v0;
		 /* .line 367 */
	 } // :cond_1
	 return;
} // .end method
/* # virtual methods */
public void loadGameParam ( ) {
	 /* .locals 4 */
	 /* .prologue */
	 int v3 = 1; // const/4 v3, 0x1
	 /* .line 300 */
	 v1 = com.funbox.game.ang.GMenu.PREFS_NAME;
	 int v2 = 0; // const/4 v2, 0x0
	 (( com.funbox.game.ang.GMenu ) p0 ).getSharedPreferences ( v1, v2 ); // invoke-virtual {p0, v1, v2}, Lcom/funbox/game/ang/GMenu;->getSharedPreferences(Ljava/lang/String;I)Landroid/content/SharedPreferences;
	 /* .line 301 */
	 /* .local v0, "settings":Landroid/content/SharedPreferences; */
	 v1 = 	 final String v1 = "isMusic"; // const-string v1, "isMusic"
	 /* iput-boolean v1, p0, Lcom/funbox/game/ang/GMenu;->mIsMusic:Z */
	 /* .line 302 */
	 v1 = 	 final String v1 = "isSound"; // const-string v1, "isSound"
	 /* iput-boolean v1, p0, Lcom/funbox/game/ang/GMenu;->mIsSound:Z */
	 /* .line 303 */
	 v1 = 	 final String v1 = "isVibrate"; // const-string v1, "isVibrate"
	 /* iput-boolean v1, p0, Lcom/funbox/game/ang/GMenu;->mIsVibrate:Z */
	 /* .line 304 */
	 return;
} // .end method
protected void onActivityResult ( Integer p0, Integer p1, android.content.Intent p2 ) {
	 /* .locals 5 */
	 /* .param p1, "requestCode" # I */
	 /* .param p2, "resultCode" # I */
	 /* .param p3, "data" # Landroid/content/Intent; */
	 /* .prologue */
	 int v4 = 1; // const/4 v4, 0x1
	 /* .line 111 */
	 final String v1 = "GMenu"; // const-string v1, "GMenu"
	 /* new-instance v2, Ljava/lang/StringBuilder; */
	 final String v3 = "onActivityResult(), requestCode="; // const-string v3, "onActivityResult(), requestCode="
	 /* invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V */
	 java.lang.Integer .toString ( p1 );
	 (( java.lang.StringBuilder ) v2 ).append ( v3 ); // invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
	 final String v3 = ", resultCode="; // const-string v3, ", resultCode="
	 (( java.lang.StringBuilder ) v2 ).append ( v3 ); // invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
	 (( java.lang.StringBuilder ) v2 ).append ( p2 ); // invoke-virtual {v2, p2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;
	 (( java.lang.StringBuilder ) v2 ).toString ( ); // invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
	 android.util.Log .v ( v1,v2 );
	 /* .line 113 */
	 int v1 = 2; // const/4 v1, 0x2
	 /* if-ne p1, v1, :cond_0 */
	 /* .line 115 */
	 int v1 = -1; // const/4 v1, -0x1
	 /* if-ne p2, v1, :cond_0 */
	 /* .line 118 */
	 /* iget-boolean v0, p0, Lcom/funbox/game/ang/GMenu;->mIsMusic:Z */
	 /* .line 120 */
	 /* .local v0, "bMusic":Z */
	 final String v1 = "isMusic"; // const-string v1, "isMusic"
	 v1 = 	 (( android.content.Intent ) p3 ).getBooleanExtra ( v1, v4 ); // invoke-virtual {p3, v1, v4}, Landroid/content/Intent;->getBooleanExtra(Ljava/lang/String;Z)Z
	 /* iput-boolean v1, p0, Lcom/funbox/game/ang/GMenu;->mIsMusic:Z */
	 /* .line 121 */
	 final String v1 = "isSound"; // const-string v1, "isSound"
	 v1 = 	 (( android.content.Intent ) p3 ).getBooleanExtra ( v1, v4 ); // invoke-virtual {p3, v1, v4}, Landroid/content/Intent;->getBooleanExtra(Ljava/lang/String;Z)Z
	 /* iput-boolean v1, p0, Lcom/funbox/game/ang/GMenu;->mIsSound:Z */
	 /* .line 122 */
	 final String v1 = "isVibrate"; // const-string v1, "isVibrate"
	 v1 = 	 (( android.content.Intent ) p3 ).getBooleanExtra ( v1, v4 ); // invoke-virtual {p3, v1, v4}, Landroid/content/Intent;->getBooleanExtra(Ljava/lang/String;Z)Z
	 /* iput-boolean v1, p0, Lcom/funbox/game/ang/GMenu;->mIsVibrate:Z */
	 /* .line 127 */
	 (( com.funbox.game.ang.GMenu ) p0 ).saveGameParam ( ); // invoke-virtual {p0}, Lcom/funbox/game/ang/GMenu;->saveGameParam()V
	 /* .line 130 */
	 if ( v0 != null) { // if-eqz v0, :cond_1
		 /* iget-boolean v1, p0, Lcom/funbox/game/ang/GMenu;->mIsMusic:Z */
		 /* if-nez v1, :cond_1 */
		 /* .line 131 */
		 /* invoke-direct {p0}, Lcom/funbox/game/ang/GMenu;->stopMusic()V */
		 /* .line 136 */
	 } // .end local v0 # "bMusic":Z
} // :cond_0
} // :goto_0
return;
/* .line 132 */
/* .restart local v0 # "bMusic":Z */
} // :cond_1
/* iget-boolean v1, p0, Lcom/funbox/game/ang/GMenu;->mIsMusic:Z */
if ( v1 != null) { // if-eqz v1, :cond_0
/* if-nez v0, :cond_0 */
/* .line 133 */
(( com.funbox.game.ang.GMenu ) p0 ).playMusic ( ); // invoke-virtual {p0}, Lcom/funbox/game/ang/GMenu;->playMusic()V
} // .end method
public void onCreate ( android.os.Bundle p0 ) {
/* .locals 5 */
/* .param p1, "savedInstanceState" # Landroid/os/Bundle; */
/* .prologue */
/* const/16 v4, 0x400 */
int v2 = 0; // const/4 v2, 0x0
final String v3 = "GMenu"; // const-string v3, "GMenu"
/* .line 47 */
/* invoke-super {p0, p1}, Landroid/app/Activity;->onCreate(Landroid/os/Bundle;)V */
/* .line 50 */
int v1 = 1; // const/4 v1, 0x1
(( com.funbox.game.ang.GMenu ) p0 ).requestWindowFeature ( v1 ); // invoke-virtual {p0, v1}, Lcom/funbox/game/ang/GMenu;->requestWindowFeature(I)Z
/* .line 51 */
(( com.funbox.game.ang.GMenu ) p0 ).getWindow ( ); // invoke-virtual {p0}, Lcom/funbox/game/ang/GMenu;->getWindow()Landroid/view/Window;
this.window = v1;
/* .line 52 */
v1 = this.window;
(( android.view.Window ) v1 ).setFlags ( v4, v4 ); // invoke-virtual {v1, v4, v4}, Landroid/view/Window;->setFlags(II)V
/* .line 57 */
/* const v1, 0x7f030004 */
(( com.funbox.game.ang.GMenu ) p0 ).setContentView ( v1 ); // invoke-virtual {p0, v1}, Lcom/funbox/game/ang/GMenu;->setContentView(I)V
/* .line 60 */
/* iput-boolean v2, p0, Lcom/funbox/game/ang/GMenu;->mGameSavePause:Z */
/* .line 61 */
/* iput v2, p0, Lcom/funbox/game/ang/GMenu;->mGameSaveLife:I */
/* .line 62 */
/* iput v2, p0, Lcom/funbox/game/ang/GMenu;->mGameSaveLevel:I */
/* .line 63 */
/* iput v2, p0, Lcom/funbox/game/ang/GMenu;->mGameSaveScore:I */
/* .line 66 */
(( com.funbox.game.ang.GMenu ) p0 ).loadGameParam ( ); // invoke-virtual {p0}, Lcom/funbox/game/ang/GMenu;->loadGameParam()V
/* .line 69 */
(( com.funbox.game.ang.GMenu ) p0 ).getIntent ( ); // invoke-virtual {p0}, Lcom/funbox/game/ang/GMenu;->getIntent()Landroid/content/Intent;
(( android.content.Intent ) v1 ).getExtras ( ); // invoke-virtual {v1}, Landroid/content/Intent;->getExtras()Landroid/os/Bundle;
/* .line 71 */
/* .local v0, "b":Landroid/os/Bundle; */
if ( v0 != null) { // if-eqz v0, :cond_1
/* .line 72 */
final String v1 = "GMenu"; // const-string v1, "GMenu"
final String v1 = "onCreate(), b != null"; // const-string v1, "onCreate(), b != null"
android.util.Log .v ( v3,v1 );
/* .line 74 */
final String v1 = "gamePause"; // const-string v1, "gamePause"
v1 = (( android.os.Bundle ) v0 ).getBoolean ( v1, v2 ); // invoke-virtual {v0, v1, v2}, Landroid/os/Bundle;->getBoolean(Ljava/lang/String;Z)Z
/* iput-boolean v1, p0, Lcom/funbox/game/ang/GMenu;->mGameSavePause:Z */
/* .line 75 */
final String v1 = "gameLife"; // const-string v1, "gameLife"
v1 = (( android.os.Bundle ) v0 ).getInt ( v1, v2 ); // invoke-virtual {v0, v1, v2}, Landroid/os/Bundle;->getInt(Ljava/lang/String;I)I
/* iput v1, p0, Lcom/funbox/game/ang/GMenu;->mGameSaveLife:I */
/* .line 76 */
final String v1 = "gameScore"; // const-string v1, "gameScore"
v1 = (( android.os.Bundle ) v0 ).getInt ( v1, v2 ); // invoke-virtual {v0, v1, v2}, Landroid/os/Bundle;->getInt(Ljava/lang/String;I)I
/* iput v1, p0, Lcom/funbox/game/ang/GMenu;->mGameSaveScore:I */
/* .line 77 */
final String v1 = "gameLevel"; // const-string v1, "gameLevel"
v1 = (( android.os.Bundle ) v0 ).getInt ( v1, v2 ); // invoke-virtual {v0, v1, v2}, Landroid/os/Bundle;->getInt(Ljava/lang/String;I)I
/* iput v1, p0, Lcom/funbox/game/ang/GMenu;->mGameSaveLevel:I */
/* .line 80 */
/* iget v1, p0, Lcom/funbox/game/ang/GMenu;->mGameSaveScore:I */
/* if-lez v1, :cond_0 */
/* .line 81 */
/* iget v1, p0, Lcom/funbox/game/ang/GMenu;->mGameSaveScore:I */
(( com.funbox.game.ang.GMenu ) p0 ).updateHighScore ( v1 ); // invoke-virtual {p0, v1}, Lcom/funbox/game/ang/GMenu;->updateHighScore(I)V
/* .line 85 */
} // :cond_0
final String v1 = "GMenu"; // const-string v1, "GMenu"
/* new-instance v1, Ljava/lang/StringBuilder; */
final String v2 = "onCreate(), Life="; // const-string v2, "onCreate(), Life="
/* invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V */
/* iget v2, p0, Lcom/funbox/game/ang/GMenu;->mGameSaveLife:I */
java.lang.Integer .toString ( v2 );
(( java.lang.StringBuilder ) v1 ).append ( v2 ); // invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
final String v2 = ", level="; // const-string v2, ", level="
(( java.lang.StringBuilder ) v1 ).append ( v2 ); // invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
/* iget v2, p0, Lcom/funbox/game/ang/GMenu;->mGameSaveLevel:I */
java.lang.Integer .toString ( v2 );
(( java.lang.StringBuilder ) v1 ).append ( v2 ); // invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v1 ).toString ( ); // invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
android.util.Log .v ( v3,v1 );
/* .line 91 */
} // :goto_0
/* invoke-direct {p0}, Lcom/funbox/game/ang/GMenu;->handleMenuClick()V */
/* .line 94 */
(( com.funbox.game.ang.GMenu ) p0 ).playMusic ( ); // invoke-virtual {p0}, Lcom/funbox/game/ang/GMenu;->playMusic()V
/* .line 95 */
/* const/16 v1, 0x76d */
com.funbox.game.promote.GameAd .init ( v1 );
/* .line 96 */
return;
/* .line 88 */
} // :cond_1
final String v1 = "GMenu"; // const-string v1, "GMenu"
final String v1 = "onCreate(), saveInstanceState=null"; // const-string v1, "onCreate(), saveInstanceState=null"
android.util.Log .v ( v3,v1 );
} // .end method
public Boolean onKeyDown ( Integer p0, android.view.KeyEvent p1 ) {
/* .locals 1 */
/* .param p1, "keyCode" # I */
/* .param p2, "event" # Landroid/view/KeyEvent; */
/* .prologue */
/* .line 100 */
int v0 = 4; // const/4 v0, 0x4
/* if-ne p1, v0, :cond_0 */
/* .line 102 */
int v0 = 1; // const/4 v0, 0x1
/* .line 104 */
} // :goto_0
} // :cond_0
v0 = /* invoke-super {p0, p1, p2}, Landroid/app/Activity;->onKeyDown(ILandroid/view/KeyEvent;)Z */
} // .end method
protected void onPause ( ) {
/* .locals 0 */
/* .prologue */
/* .line 140 */
/* invoke-super {p0}, Landroid/app/Activity;->onPause()V */
/* .line 141 */
/* invoke-direct {p0}, Lcom/funbox/game/ang/GMenu;->pauseMusic()V */
/* .line 142 */
return;
} // .end method
protected void onResume ( ) {
/* .locals 0 */
/* .prologue */
/* .line 145 */
/* invoke-super {p0}, Landroid/app/Activity;->onResume()V */
/* .line 146 */
/* invoke-direct {p0}, Lcom/funbox/game/ang/GMenu;->resumeMusic()V */
/* .line 147 */
return;
} // .end method
protected void onStop ( ) {
/* .locals 0 */
/* .prologue */
/* .line 150 */
/* invoke-super {p0}, Landroid/app/Activity;->onStop()V */
/* .line 151 */
return;
} // .end method
public void playMusic ( ) {
/* .locals 2 */
/* .prologue */
/* .line 345 */
/* iget-boolean v0, p0, Lcom/funbox/game/ang/GMenu;->mIsMusic:Z */
/* if-nez v0, :cond_0 */
/* .line 356 */
} // :goto_0
return;
/* .line 348 */
} // :cond_0
/* invoke-direct {p0}, Lcom/funbox/game/ang/GMenu;->stopMusic()V */
/* .line 350 */
v0 = this.mMusicMP;
/* if-nez v0, :cond_1 */
/* .line 351 */
(( com.funbox.game.ang.GMenu ) p0 ).getBaseContext ( ); // invoke-virtual {p0}, Lcom/funbox/game/ang/GMenu;->getBaseContext()Landroid/content/Context;
/* const v1, 0x7f04000c */
android.media.MediaPlayer .create ( v0,v1 );
this.mMusicMP = v0;
/* .line 354 */
} // :cond_1
v0 = this.mMusicMP;
(( android.media.MediaPlayer ) v0 ).start ( ); // invoke-virtual {v0}, Landroid/media/MediaPlayer;->start()V
/* .line 355 */
v0 = this.mMusicMP;
int v1 = 1; // const/4 v1, 0x1
(( android.media.MediaPlayer ) v0 ).setLooping ( v1 ); // invoke-virtual {v0, v1}, Landroid/media/MediaPlayer;->setLooping(Z)V
} // .end method
public void saveGameParam ( ) {
/* .locals 4 */
/* .prologue */
/* .line 307 */
v2 = com.funbox.game.ang.GMenu.PREFS_NAME;
int v3 = 0; // const/4 v3, 0x0
(( com.funbox.game.ang.GMenu ) p0 ).getSharedPreferences ( v2, v3 ); // invoke-virtual {p0, v2, v3}, Lcom/funbox/game/ang/GMenu;->getSharedPreferences(Ljava/lang/String;I)Landroid/content/SharedPreferences;
/* .line 308 */
/* .local v1, "settings":Landroid/content/SharedPreferences; */
/* .line 309 */
/* .local v0, "editor":Landroid/content/SharedPreferences$Editor; */
final String v2 = "isMusic"; // const-string v2, "isMusic"
/* iget-boolean v3, p0, Lcom/funbox/game/ang/GMenu;->mIsMusic:Z */
/* .line 310 */
final String v2 = "isSound"; // const-string v2, "isSound"
/* iget-boolean v3, p0, Lcom/funbox/game/ang/GMenu;->mIsSound:Z */
/* .line 311 */
final String v2 = "isVibrate"; // const-string v2, "isVibrate"
/* iget-boolean v3, p0, Lcom/funbox/game/ang/GMenu;->mIsVibrate:Z */
/* .line 313 */
/* .line 314 */
return;
} // .end method
public void showOptionDlg ( ) {
/* .locals 3 */
/* .prologue */
/* .line 279 */
/* new-instance v0, Landroid/content/Intent; */
/* invoke-direct {v0}, Landroid/content/Intent;-><init>()V */
/* .line 280 */
/* .local v0, "intent":Landroid/content/Intent; */
/* const-class v1, Lcom/funbox/game/ang/OptionActivity; */
(( android.content.Intent ) v0 ).setClass ( p0, v1 ); // invoke-virtual {v0, p0, v1}, Landroid/content/Intent;->setClass(Landroid/content/Context;Ljava/lang/Class;)Landroid/content/Intent;
/* .line 282 */
final String v1 = "isMusic"; // const-string v1, "isMusic"
/* iget-boolean v2, p0, Lcom/funbox/game/ang/GMenu;->mIsMusic:Z */
(( android.content.Intent ) v0 ).putExtra ( v1, v2 ); // invoke-virtual {v0, v1, v2}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Z)Landroid/content/Intent;
/* .line 283 */
final String v1 = "isSound"; // const-string v1, "isSound"
/* iget-boolean v2, p0, Lcom/funbox/game/ang/GMenu;->mIsSound:Z */
(( android.content.Intent ) v0 ).putExtra ( v1, v2 ); // invoke-virtual {v0, v1, v2}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Z)Landroid/content/Intent;
/* .line 284 */
final String v1 = "isVibrate"; // const-string v1, "isVibrate"
/* iget-boolean v2, p0, Lcom/funbox/game/ang/GMenu;->mIsVibrate:Z */
(( android.content.Intent ) v0 ).putExtra ( v1, v2 ); // invoke-virtual {v0, v1, v2}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Z)Landroid/content/Intent;
/* .line 287 */
int v1 = 2; // const/4 v1, 0x2
(( com.funbox.game.ang.GMenu ) p0 ).startActivityForResult ( v0, v1 ); // invoke-virtual {p0, v0, v1}, Lcom/funbox/game/ang/GMenu;->startActivityForResult(Landroid/content/Intent;I)V
/* .line 288 */
return;
} // .end method
public void showScoreList ( ) {
/* .locals 2 */
/* .prologue */
/* .line 292 */
/* new-instance v0, Landroid/content/Intent; */
/* invoke-direct {v0}, Landroid/content/Intent;-><init>()V */
/* .line 293 */
/* .local v0, "intent":Landroid/content/Intent; */
/* const-class v1, Lcom/funbox/game/ang/ScoreList; */
(( android.content.Intent ) v0 ).setClass ( p0, v1 ); // invoke-virtual {v0, p0, v1}, Landroid/content/Intent;->setClass(Landroid/content/Context;Ljava/lang/Class;)Landroid/content/Intent;
/* .line 296 */
(( com.funbox.game.ang.GMenu ) p0 ).startActivity ( v0 ); // invoke-virtual {p0, v0}, Lcom/funbox/game/ang/GMenu;->startActivity(Landroid/content/Intent;)V
/* .line 297 */
return;
} // .end method
public void updateHighScore ( Integer p0 ) {
/* .locals 11 */
/* .param p1, "highScore" # I */
/* .prologue */
int v9 = 0; // const/4 v9, 0x0
/* const/16 v7, 0x9 */
final String v10 = "GMenu"; // const-string v10, "GMenu"
final String v8 = "highScore"; // const-string v8, "highScore"
/* .line 317 */
final String v5 = "GMenu"; // const-string v5, "GMenu"
/* new-instance v5, Ljava/lang/StringBuilder; */
final String v6 = "updateHighScore(),highScore="; // const-string v6, "updateHighScore(),highScore="
/* invoke-direct {v5, v6}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V */
java.lang.Integer .toString ( p1 );
(( java.lang.StringBuilder ) v5 ).append ( v6 ); // invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v5 ).toString ( ); // invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
android.util.Log .v ( v10,v5 );
/* .line 318 */
/* if-gtz p1, :cond_0 */
/* .line 341 */
} // :goto_0
return;
/* .line 321 */
} // :cond_0
v5 = com.funbox.game.ang.GMenu.PREFS_NAME;
(( com.funbox.game.ang.GMenu ) p0 ).getSharedPreferences ( v5, v9 ); // invoke-virtual {p0, v5, v9}, Lcom/funbox/game/ang/GMenu;->getSharedPreferences(Ljava/lang/String;I)Landroid/content/SharedPreferences;
/* .line 322 */
/* .local v4, "settings":Landroid/content/SharedPreferences; */
/* const/16 v5, 0xa */
/* new-array v3, v5, [I */
/* .line 324 */
/* .local v3, "scoreArray":[I */
int v1 = 0; // const/4 v1, 0x0
/* .local v1, "i":I */
} // :goto_1
/* if-lt v1, v7, :cond_1 */
/* .line 328 */
/* .line 329 */
/* .local v0, "editor":Landroid/content/SharedPreferences$Editor; */
int v1 = 0; // const/4 v1, 0x0
} // :goto_2
/* if-lt v1, v7, :cond_2 */
/* .line 340 */
} // :goto_3
/* .line 325 */
} // .end local v0 # "editor":Landroid/content/SharedPreferences$Editor;
} // :cond_1
/* new-instance v5, Ljava/lang/StringBuilder; */
final String v6 = "highScore"; // const-string v6, "highScore"
/* invoke-direct {v5, v8}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V */
java.lang.Integer .toString ( v1 );
(( java.lang.StringBuilder ) v5 ).append ( v6 ); // invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
v5 = (( java.lang.StringBuilder ) v5 ).toString ( ); // invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
/* aput v5, v3, v1 */
/* .line 324 */
/* add-int/lit8 v1, v1, 0x1 */
/* .line 330 */
/* .restart local v0 # "editor":Landroid/content/SharedPreferences$Editor; */
} // :cond_2
/* aget v5, v3, v1 */
/* if-le p1, v5, :cond_4 */
/* .line 331 */
final String v5 = "GMenu"; // const-string v5, "GMenu"
/* new-instance v5, Ljava/lang/StringBuilder; */
final String v6 = "updateHighScore(), highScore>scoreArray[i], i="; // const-string v6, "updateHighScore(), highScore>scoreArray[i], i="
/* invoke-direct {v5, v6}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V */
java.lang.Integer .toString ( v1 );
(( java.lang.StringBuilder ) v5 ).append ( v6 ); // invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v5 ).toString ( ); // invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
android.util.Log .v ( v10,v5 );
/* .line 332 */
/* add-int/lit8 v2, v1, 0x1 */
/* .local v2, "j":I */
} // :goto_4
/* if-lt v2, v7, :cond_3 */
/* .line 335 */
/* new-instance v5, Ljava/lang/StringBuilder; */
final String v6 = "highScore"; // const-string v6, "highScore"
/* invoke-direct {v5, v8}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V */
java.lang.Integer .toString ( v1 );
(( java.lang.StringBuilder ) v5 ).append ( v6 ); // invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v5 ).toString ( ); // invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
/* .line 333 */
} // :cond_3
/* new-instance v5, Ljava/lang/StringBuilder; */
final String v6 = "highScore"; // const-string v6, "highScore"
/* invoke-direct {v5, v8}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V */
java.lang.Integer .toString ( v2 );
(( java.lang.StringBuilder ) v5 ).append ( v6 ); // invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v5 ).toString ( ); // invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
int v6 = 1; // const/4 v6, 0x1
/* sub-int v6, v2, v6 */
/* aget v6, v3, v6 */
/* .line 332 */
/* add-int/lit8 v2, v2, 0x1 */
/* .line 329 */
} // .end local v2 # "j":I
} // :cond_4
/* add-int/lit8 v1, v1, 0x1 */
} // .end method
