public class com.funbox.game.promote.AdSplash extends android.app.Activity {
	 /* .source "AdSplash.java" */
	 /* # instance fields */
	 android.os.Handler handler;
	 private Boolean mIsRunning;
	 java.util.TimerTask mTask;
	 java.util.Timer mTimer;
	 /* # direct methods */
	 public com.funbox.game.promote.AdSplash ( ) {
		 /* .locals 1 */
		 /* .prologue */
		 /* .line 27 */
		 /* invoke-direct {p0}, Landroid/app/Activity;-><init>()V */
		 /* .line 28 */
		 int v0 = 0; // const/4 v0, 0x0
		 /* iput-boolean v0, p0, Lcom/funbox/game/promote/AdSplash;->mIsRunning:Z */
		 /* .line 145 */
		 /* new-instance v0, Ljava/util/Timer; */
		 /* invoke-direct {v0}, Ljava/util/Timer;-><init>()V */
		 this.mTimer = v0;
		 /* .line 146 */
		 /* new-instance v0, Lcom/funbox/game/promote/AdSplash$1; */
		 /* invoke-direct {v0, p0}, Lcom/funbox/game/promote/AdSplash$1;-><init>(Lcom/funbox/game/promote/AdSplash;)V */
		 this.mTask = v0;
		 /* .line 157 */
		 /* new-instance v0, Lcom/funbox/game/promote/AdSplash$2; */
		 /* invoke-direct {v0, p0}, Lcom/funbox/game/promote/AdSplash$2;-><init>(Lcom/funbox/game/promote/AdSplash;)V */
		 this.handler = v0;
		 /* .line 27 */
		 return;
	 } // .end method
	 static Boolean access$0 ( com.funbox.game.promote.AdSplash p0 ) { //synthethic
		 /* .locals 1 */
		 /* .prologue */
		 /* .line 28 */
		 /* iget-boolean v0, p0, Lcom/funbox/game/promote/AdSplash;->mIsRunning:Z */
	 } // .end method
	 /* # virtual methods */
	 public void finish ( ) {
		 /* .locals 2 */
		 /* .prologue */
		 /* .line 187 */
		 v0 = this.mTimer;
		 if ( v0 != null) { // if-eqz v0, :cond_0
			 /* .line 188 */
			 v0 = this.mTimer;
			 (( java.util.Timer ) v0 ).cancel ( ); // invoke-virtual {v0}, Ljava/util/Timer;->cancel()V
			 /* .line 189 */
			 int v0 = 0; // const/4 v0, 0x0
			 this.mTimer = v0;
			 /* .line 192 */
		 } // :cond_0
		 final String v0 = "AdSplash"; // const-string v0, "AdSplash"
		 final String v1 = "finish()....is call!"; // const-string v1, "finish()....is call!"
		 android.util.Log .v ( v0,v1 );
		 /* .line 193 */
		 /* invoke-super {p0}, Landroid/app/Activity;->finish()V */
		 /* .line 194 */
		 v0 = 		 android.os.Process .myPid ( );
		 android.os.Process .killProcess ( v0 );
		 /* .line 195 */
		 return;
	 } // .end method
	 public void onCreate ( android.os.Bundle p0 ) {
		 /* .locals 19 */
		 /* .param p1, "icicle" # Landroid/os/Bundle; */
		 /* .prologue */
		 /* .line 33 */
		 /* invoke-super/range {p0 ..p1}, Landroid/app/Activity;->onCreate(Landroid/os/Bundle;)V */
		 /* .line 34 */
		 int v2 = 1; // const/4 v2, 0x1
		 /* move-object/from16 v0, p0 */
		 /* move v1, v2 */
		 (( com.funbox.game.promote.AdSplash ) v0 ).requestWindowFeature ( v1 ); // invoke-virtual {v0, v1}, Lcom/funbox/game/promote/AdSplash;->requestWindowFeature(I)Z
		 /* .line 35 */
		 /* invoke-virtual/range {p0 ..p0}, Lcom/funbox/game/promote/AdSplash;->getWindow()Landroid/view/Window; */
		 /* const/16 v3, 0x80 */
		 /* .line 36 */
		 /* const/16 v4, 0x80 */
		 /* .line 35 */
		 (( android.view.Window ) v2 ).setFlags ( v3, v4 ); // invoke-virtual {v2, v3, v4}, Landroid/view/Window;->setFlags(II)V
		 /* .line 37 */
		 /* invoke-virtual/range {p0 ..p0}, Lcom/funbox/game/promote/AdSplash;->getWindow()Landroid/view/Window; */
		 /* const/16 v3, 0x400 */
		 /* .line 38 */
		 /* const/16 v4, 0x400 */
		 /* .line 37 */
		 (( android.view.Window ) v2 ).setFlags ( v3, v4 ); // invoke-virtual {v2, v3, v4}, Landroid/view/Window;->setFlags(II)V
		 /* .line 40 */
		 /* const/high16 v2, 0x7f030000 */
		 /* move-object/from16 v0, p0 */
		 /* move v1, v2 */
		 (( com.funbox.game.promote.AdSplash ) v0 ).setContentView ( v1 ); // invoke-virtual {v0, v1}, Lcom/funbox/game/promote/AdSplash;->setContentView(I)V
		 /* .line 47 */
		 /* const/16 v13, 0x3a98 */
		 /* .line 48 */
		 /* .local v13, "delay":I */
		 /* const/16 v17, 0x64 */
		 /* .line 51 */
		 /* .local v17, "period":I */
		 /* const/high16 v2, 0x7f060000 */
		 /* move-object/from16 v0, p0 */
		 /* move v1, v2 */
		 (( com.funbox.game.promote.AdSplash ) v0 ).findViewById ( v1 ); // invoke-virtual {v0, v1}, Lcom/funbox/game/promote/AdSplash;->findViewById(I)Landroid/view/View;
		 /* check-cast v16, Landroid/widget/RelativeLayout; */
		 /* .line 57 */
		 /* .local v16, "layout":Landroid/widget/RelativeLayout; */
		 /* const v2, 0x7f060001 */
		 /* move-object/from16 v0, p0 */
		 /* move v1, v2 */
		 (( com.funbox.game.promote.AdSplash ) v0 ).findViewById ( v1 ); // invoke-virtual {v0, v1}, Lcom/funbox/game/promote/AdSplash;->findViewById(I)Landroid/view/View;
		 /* check-cast v9, Landroid/widget/Button; */
		 /* .line 58 */
		 /* .local v9, "btnDownload":Landroid/widget/Button; */
		 /* const v2, 0x7f060002 */
		 /* move-object/from16 v0, p0 */
		 /* move v1, v2 */
		 (( com.funbox.game.promote.AdSplash ) v0 ).findViewById ( v1 ); // invoke-virtual {v0, v1}, Lcom/funbox/game/promote/AdSplash;->findViewById(I)Landroid/view/View;
		 /* check-cast v10, Landroid/widget/Button; */
		 /* .line 59 */
		 /* .local v10, "btnMoreGame":Landroid/widget/Button; */
		 /* const v2, 0x7f060004 */
		 /* move-object/from16 v0, p0 */
		 /* move v1, v2 */
		 (( com.funbox.game.promote.AdSplash ) v0 ).findViewById ( v1 ); // invoke-virtual {v0, v1}, Lcom/funbox/game/promote/AdSplash;->findViewById(I)Landroid/view/View;
		 /* check-cast v11, Landroid/widget/Button; */
		 /* .line 60 */
		 /* .local v11, "btnMoreGame2":Landroid/widget/Button; */
		 /* const v2, 0x7f060003 */
		 /* move-object/from16 v0, p0 */
		 /* move v1, v2 */
		 (( com.funbox.game.promote.AdSplash ) v0 ).findViewById ( v1 ); // invoke-virtual {v0, v1}, Lcom/funbox/game/promote/AdSplash;->findViewById(I)Landroid/view/View;
		 /* check-cast v8, Landroid/widget/Button; */
		 /* .line 63 */
		 /* .local v8, "btnClose":Landroid/widget/Button; */
		 /* new-instance v2, Lcom/funbox/game/promote/AdSplash$3; */
		 /* move-object v0, v2 */
		 /* move-object/from16 v1, p0 */
		 /* invoke-direct {v0, v1}, Lcom/funbox/game/promote/AdSplash$3;-><init>(Lcom/funbox/game/promote/AdSplash;)V */
		 (( android.widget.Button ) v8 ).setOnClickListener ( v2 ); // invoke-virtual {v8, v2}, Landroid/widget/Button;->setOnClickListener(Landroid/view/View$OnClickListener;)V
		 /* .line 71 */
		 v2 = 		 com.funbox.game.promote.GameAd .checkShowGameAd ( );
		 if ( v2 != null) { // if-eqz v2, :cond_2
			 /* .line 75 */
			 v15 = 			 com.funbox.game.promote.GameAd .getShowGameId ( );
			 /* .line 76 */
			 /* .local v15, "gameId":I */
			 com.funbox.game.promote.GameAd .getLocalImgFullNameById ( v15 );
			 /* .line 78 */
			 /* .local v14, "fullName":Ljava/lang/String; */
			 final String v2 = "AdSplash"; // const-string v2, "AdSplash"
			 /* new-instance v3, Ljava/lang/StringBuilder; */
			 final String v4 = "show adsplash...imgFile="; // const-string v4, "show adsplash...imgFile="
			 /* invoke-direct {v3, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V */
			 (( java.lang.StringBuilder ) v3 ).append ( v14 ); // invoke-virtual {v3, v14}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
			 (( java.lang.StringBuilder ) v3 ).toString ( ); // invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
			 android.util.Log .v ( v2,v3 );
			 /* .line 82 */
			 try { // :try_start_0
				 android.graphics.BitmapFactory .decodeFile ( v14 );
				 /* .line 83 */
				 /* .local v18, "tempBmp":Landroid/graphics/Bitmap; */
				 if ( v18 != null) { // if-eqz v18, :cond_0
					 /* .line 85 */
					 v2 = 					 /* invoke-virtual/range {v18 ..v18}, Landroid/graphics/Bitmap;->getWidth()I */
					 v3 = 					 /* invoke-virtual/range {v18 ..v18}, Landroid/graphics/Bitmap;->getHeight()I */
					 /* if-le v2, v3, :cond_1 */
					 /* .line 86 */
					 int v2 = 0; // const/4 v2, 0x0
					 /* move-object/from16 v0, p0 */
					 /* move v1, v2 */
					 (( com.funbox.game.promote.AdSplash ) v0 ).setRequestedOrientation ( v1 ); // invoke-virtual {v0, v1}, Lcom/funbox/game/promote/AdSplash;->setRequestedOrientation(I)V
					 /* .line 90 */
				 } // :goto_0
				 /* new-instance v12, Landroid/graphics/drawable/BitmapDrawable; */
				 /* move-object v0, v12 */
				 /* move-object/from16 v1, v18 */
				 /* invoke-direct {v0, v1}, Landroid/graphics/drawable/BitmapDrawable;-><init>(Landroid/graphics/Bitmap;)V */
				 /* .line 91 */
				 /* .local v12, "d":Landroid/graphics/drawable/Drawable; */
				 /* move-object/from16 v0, v16 */
				 /* move-object v1, v12 */
				 (( android.widget.RelativeLayout ) v0 ).setBackgroundDrawable ( v1 ); // invoke-virtual {v0, v1}, Landroid/widget/RelativeLayout;->setBackgroundDrawable(Landroid/graphics/drawable/Drawable;)V
				 /* .line 93 */
				 int v2 = 0; // const/4 v2, 0x0
				 (( android.widget.Button ) v9 ).setVisibility ( v2 ); // invoke-virtual {v9, v2}, Landroid/widget/Button;->setVisibility(I)V
				 /* .line 94 */
				 int v2 = 0; // const/4 v2, 0x0
				 (( android.widget.Button ) v11 ).setVisibility ( v2 ); // invoke-virtual {v11, v2}, Landroid/widget/Button;->setVisibility(I)V
				 /* .line 95 */
				 /* const/16 v2, 0x8 */
				 (( android.widget.Button ) v10 ).setVisibility ( v2 ); // invoke-virtual {v10, v2}, Landroid/widget/Button;->setVisibility(I)V
				 /* .line 97 */
				 /* new-instance v2, Lcom/funbox/game/promote/AdSplash$4; */
				 /* move-object v0, v2 */
				 /* move-object/from16 v1, p0 */
				 /* invoke-direct {v0, v1}, Lcom/funbox/game/promote/AdSplash$4;-><init>(Lcom/funbox/game/promote/AdSplash;)V */
				 (( android.widget.Button ) v9 ).setOnClickListener ( v2 ); // invoke-virtual {v9, v2}, Landroid/widget/Button;->setOnClickListener(Landroid/view/View$OnClickListener;)V
				 /* .line 109 */
				 /* new-instance v2, Lcom/funbox/game/promote/AdSplash$5; */
				 /* move-object v0, v2 */
				 /* move-object/from16 v1, p0 */
				 /* invoke-direct {v0, v1}, Lcom/funbox/game/promote/AdSplash$5;-><init>(Lcom/funbox/game/promote/AdSplash;)V */
				 (( android.widget.Button ) v11 ).setOnClickListener ( v2 ); // invoke-virtual {v11, v2}, Landroid/widget/Button;->setOnClickListener(Landroid/view/View$OnClickListener;)V
				 /* :try_end_0 */
				 /* .catch Ljava/lang/Exception; {:try_start_0 ..:try_end_0} :catch_0 */
				 /* .line 142 */
			 } // .end local v12 # "d":Landroid/graphics/drawable/Drawable;
		 } // .end local v14 # "fullName":Ljava/lang/String;
	 } // .end local v15 # "gameId":I
} // .end local v18 # "tempBmp":Landroid/graphics/Bitmap;
} // :cond_0
} // :goto_1
/* move-object/from16 v0, p0 */
v0 = this.mTimer;
/* move-object v2, v0 */
/* move-object/from16 v0, p0 */
v0 = this.mTask;
/* move-object v3, v0 */
/* int-to-long v4, v13 */
/* move/from16 v0, v17 */
/* int-to-long v0, v0 */
/* move-wide v6, v0 */
/* invoke-virtual/range {v2 ..v7}, Ljava/util/Timer;->schedule(Ljava/util/TimerTask;JJ)V */
/* .line 143 */
return;
/* .line 88 */
/* .restart local v14 # "fullName":Ljava/lang/String; */
/* .restart local v15 # "gameId":I */
/* .restart local v18 # "tempBmp":Landroid/graphics/Bitmap; */
} // :cond_1
int v2 = 1; // const/4 v2, 0x1
try { // :try_start_1
/* move-object/from16 v0, p0 */
/* move v1, v2 */
(( com.funbox.game.promote.AdSplash ) v0 ).setRequestedOrientation ( v1 ); // invoke-virtual {v0, v1}, Lcom/funbox/game/promote/AdSplash;->setRequestedOrientation(I)V
/* :try_end_1 */
/* .catch Ljava/lang/Exception; {:try_start_1 ..:try_end_1} :catch_0 */
/* .line 118 */
} // .end local v18 # "tempBmp":Landroid/graphics/Bitmap;
/* :catch_0 */
/* move-exception v2 */
/* .line 123 */
} // .end local v14 # "fullName":Ljava/lang/String;
} // .end local v15 # "gameId":I
} // :cond_2
/* const/16 v13, 0x1f40 */
/* .line 124 */
/* const/16 v2, 0x8 */
(( android.widget.Button ) v9 ).setVisibility ( v2 ); // invoke-virtual {v9, v2}, Landroid/widget/Button;->setVisibility(I)V
/* .line 125 */
/* const/16 v2, 0x8 */
(( android.widget.Button ) v11 ).setVisibility ( v2 ); // invoke-virtual {v11, v2}, Landroid/widget/Button;->setVisibility(I)V
/* .line 126 */
int v2 = 0; // const/4 v2, 0x0
(( android.widget.Button ) v10 ).setVisibility ( v2 ); // invoke-virtual {v10, v2}, Landroid/widget/Button;->setVisibility(I)V
/* .line 128 */
/* new-instance v2, Lcom/funbox/game/promote/AdSplash$6; */
/* move-object v0, v2 */
/* move-object/from16 v1, p0 */
/* invoke-direct {v0, v1}, Lcom/funbox/game/promote/AdSplash$6;-><init>(Lcom/funbox/game/promote/AdSplash;)V */
(( android.widget.Button ) v10 ).setOnClickListener ( v2 ); // invoke-virtual {v10, v2}, Landroid/widget/Button;->setOnClickListener(Landroid/view/View$OnClickListener;)V
} // .end method
public Boolean onKeyDown ( Integer p0, android.view.KeyEvent p1 ) {
/* .locals 1 */
/* .param p1, "keyCode" # I */
/* .param p2, "event" # Landroid/view/KeyEvent; */
/* .prologue */
/* .line 199 */
int v0 = 4; // const/4 v0, 0x4
/* if-ne p1, v0, :cond_0 */
/* .line 200 */
com.funbox.game.promote.GameAd .doGameAdClick ( );
/* .line 201 */
(( com.funbox.game.promote.AdSplash ) p0 ).finish ( ); // invoke-virtual {p0}, Lcom/funbox/game/promote/AdSplash;->finish()V
/* .line 202 */
int v0 = 1; // const/4 v0, 0x1
/* .line 204 */
} // :goto_0
} // :cond_0
v0 = /* invoke-super {p0, p1, p2}, Landroid/app/Activity;->onKeyDown(ILandroid/view/KeyEvent;)Z */
} // .end method
protected void onPause ( ) {
/* .locals 1 */
/* .prologue */
/* .line 167 */
/* invoke-super {p0}, Landroid/app/Activity;->onPause()V */
/* .line 168 */
int v0 = 0; // const/4 v0, 0x0
/* iput-boolean v0, p0, Lcom/funbox/game/promote/AdSplash;->mIsRunning:Z */
/* .line 169 */
return;
} // .end method
protected void onResume ( ) {
/* .locals 1 */
/* .prologue */
/* .line 173 */
/* invoke-super {p0}, Landroid/app/Activity;->onResume()V */
/* .line 174 */
int v0 = 1; // const/4 v0, 0x1
/* iput-boolean v0, p0, Lcom/funbox/game/promote/AdSplash;->mIsRunning:Z */
/* .line 175 */
return;
} // .end method
protected void onStop ( ) {
/* .locals 1 */
/* .prologue */
/* .line 179 */
/* invoke-super {p0}, Landroid/app/Activity;->onStop()V */
/* .line 180 */
int v0 = 1; // const/4 v0, 0x1
/* iput-boolean v0, p0, Lcom/funbox/game/promote/AdSplash;->mIsRunning:Z */
/* .line 183 */
return;
} // .end method
