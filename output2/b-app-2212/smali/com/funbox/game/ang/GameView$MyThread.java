class com.funbox.game.ang.GameView$MyThread implements java.lang.Runnable {
	 /* .source "GameView.java" */
	 /* # interfaces */
	 /* # annotations */
	 /* .annotation system Ldalvik/annotation/EnclosingClass; */
	 /* value = Lcom/funbox/game/ang/GameView; */
} // .end annotation
/* .annotation system Ldalvik/annotation/InnerClass; */
/* accessFlags = 0x0 */
/* name = "MyThread" */
} // .end annotation
/* # instance fields */
final com.funbox.game.ang.GameView this$0; //synthetic
/* # direct methods */
 com.funbox.game.ang.GameView$MyThread ( ) {
/* .locals 0 */
/* .prologue */
/* .line 190 */
this.this$0 = p1;
/* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
return;
} // .end method
/* # virtual methods */
public void run ( ) {
/* .locals 29 */
/* .prologue */
/* .line 193 */
/* const/16 v19, 0x1 */
/* .line 196 */
/* .local v19, "lastLevel":I */
/* const-wide/16 v17, 0x0 */
/* .line 200 */
/* .local v17, "lastCreateTime":J */
int v5 = 0; // const/4 v5, 0x0
/* .line 201 */
/* .local v5, "animal":Lcom/funbox/game/ang/Animal; */
/* const/16 v16, 0x0 */
/* .line 202 */
/* .local v16, "isShowAd":Z */
int v15 = -1; // const/4 v15, -0x1
/* .line 203 */
/* .local v15, "idx":I */
int v14 = 0; // const/4 v14, 0x0
/* .line 206 */
/* .local v14, "i":I */
java.lang.System .currentTimeMillis ( );
/* move-result-wide v11 */
/* .line 207 */
/* .local v11, "flowerTime":J */
java.lang.System .currentTimeMillis ( );
/* move-result-wide v7 */
/* .line 209 */
/* .local v7, "bombTime":J */
} // :cond_0
} // :goto_0
/* move-object/from16 v0, p0 */
v0 = this.this$0;
/* move-object/from16 v25, v0 */
v25 = /* invoke-static/range {v25 ..v25}, Lcom/funbox/game/ang/GameView;->access$0(Lcom/funbox/game/ang/GameView;)Z */
/* if-nez v25, :cond_1 */
/* .line 384 */
final String v25 = "GameView"; // const-string v25, "GameView"
final String v26 = "Thread exit!"; // const-string v26, "Thread exit!"
/* invoke-static/range {v25 ..v26}, Landroid/util/Log;->v(Ljava/lang/String;Ljava/lang/String;)I */
/* .line 385 */
return;
/* .line 210 */
} // :cond_1
/* move-object/from16 v0, p0 */
v0 = this.this$0;
/* move-object/from16 v25, v0 */
/* invoke-static/range {v25 ..v25}, Lcom/funbox/game/ang/GameView;->access$1(Lcom/funbox/game/ang/GameView;)Landroid/view/SurfaceHolder; */
/* const/16 v26, 0x0 */
/* invoke-interface/range {v25 ..v26}, Landroid/view/SurfaceHolder;->lockCanvas(Landroid/graphics/Rect;)Landroid/graphics/Canvas; */
/* .line 212 */
/* .local v10, "canvas":Landroid/graphics/Canvas; */
/* new-instance v20, Landroid/graphics/Paint; */
/* invoke-direct/range {v20 ..v20}, Landroid/graphics/Paint;-><init>()V */
/* .line 214 */
/* .local v20, "mPaint":Landroid/graphics/Paint; */
/* move-object/from16 v0, p0 */
v0 = this.this$0;
/* move-object/from16 v25, v0 */
/* invoke-static/range {v25 ..v25}, Lcom/funbox/game/ang/GameView;->access$2(Lcom/funbox/game/ang/GameView;)Landroid/graphics/Bitmap; */
/* const/16 v26, 0x0 */
/* const/16 v27, 0x0 */
/* move-object v0, v10 */
/* move-object/from16 v1, v25 */
/* move/from16 v2, v26 */
/* move/from16 v3, v27 */
/* move-object/from16 v4, v20 */
(( android.graphics.Canvas ) v0 ).drawBitmap ( v1, v2, v3, v4 ); // invoke-virtual {v0, v1, v2, v3, v4}, Landroid/graphics/Canvas;->drawBitmap(Landroid/graphics/Bitmap;FFLandroid/graphics/Paint;)V
/* .line 216 */
/* move-object/from16 v0, p0 */
v0 = this.this$0;
/* move-object/from16 v25, v0 */
/* move-object/from16 v0, v25 */
v0 = this.mGameField;
/* move-object/from16 v25, v0 */
/* invoke-virtual/range {v25 ..v25}, Lcom/funbox/game/ang/GameField;->getStatus()Lcom/funbox/game/ang/GameField$GAME_STATUS; */
/* .line 218 */
/* .local v13, "gs":Lcom/funbox/game/ang/GameField$GAME_STATUS; */
v25 = com.funbox.game.ang.GameField$GAME_STATUS.GS_PLAYING;
/* move-object v0, v13 */
/* move-object/from16 v1, v25 */
/* if-eq v0, v1, :cond_2 */
/* .line 219 */
v25 = com.funbox.game.ang.GameField$GAME_STATUS.GS_PAUSE;
/* move-object v0, v13 */
/* move-object/from16 v1, v25 */
/* if-ne v0, v1, :cond_3 */
/* .line 221 */
} // :cond_2
/* move-object/from16 v0, p0 */
v0 = this.this$0;
/* move-object/from16 v25, v0 */
/* invoke-static/range {v25 ..v25}, Lcom/funbox/game/ang/GameView;->access$3(Lcom/funbox/game/ang/GameView;)Lcom/funbox/game/ang/BombEffects; */
v25 = /* invoke-virtual/range {v25 ..v25}, Lcom/funbox/game/ang/BombEffects;->isAlive()Z */
if ( v25 != null) { // if-eqz v25, :cond_7
/* .line 223 */
java.lang.System .currentTimeMillis ( );
/* move-result-wide v25 */
/* const-wide/16 v27, 0x7d0 */
/* add-long v7, v25, v27 */
/* .line 224 */
java.lang.System .currentTimeMillis ( );
/* move-result-wide v25 */
/* const-wide/16 v27, 0x7d0 */
/* add-long v17, v25, v27 */
/* .line 270 */
} // :cond_3
} // :goto_1
/* move-object/from16 v0, p0 */
v0 = this.this$0;
/* move-object/from16 v25, v0 */
/* move-object/from16 v0, v25 */
/* move-object v1, v10 */
/* move-object/from16 v2, v20 */
com.funbox.game.ang.GameView .access$12 ( v0,v1,v2 );
/* .line 273 */
/* move-object/from16 v0, p0 */
v0 = this.this$0;
/* move-object/from16 v25, v0 */
/* move-object/from16 v0, v25 */
/* move-object v1, v10 */
/* move-object/from16 v2, v20 */
com.funbox.game.ang.GameView .access$13 ( v0,v1,v2 );
/* .line 276 */
/* move-object/from16 v0, p0 */
v0 = this.this$0;
/* move-object/from16 v25, v0 */
/* move-object/from16 v0, v25 */
/* move-object v1, v10 */
/* move-object/from16 v2, v20 */
com.funbox.game.ang.GameView .access$14 ( v0,v1,v2 );
/* .line 279 */
/* move-object/from16 v0, p0 */
v0 = this.this$0;
/* move-object/from16 v25, v0 */
/* move-object/from16 v0, v25 */
/* move-object v1, v10 */
/* move-object/from16 v2, v20 */
com.funbox.game.ang.GameView .access$15 ( v0,v1,v2 );
/* .line 282 */
/* move-object/from16 v0, p0 */
v0 = this.this$0;
/* move-object/from16 v25, v0 */
/* invoke-static/range {v25 ..v25}, Lcom/funbox/game/ang/GameView;->access$3(Lcom/funbox/game/ang/GameView;)Lcom/funbox/game/ang/BombEffects; */
v25 = /* invoke-virtual/range {v25 ..v25}, Lcom/funbox/game/ang/BombEffects;->isAlive()Z */
if ( v25 != null) { // if-eqz v25, :cond_4
/* .line 283 */
/* move-object/from16 v0, p0 */
v0 = this.this$0;
/* move-object/from16 v25, v0 */
/* move-object/from16 v0, v25 */
/* move-object v1, v10 */
/* move-object/from16 v2, v20 */
com.funbox.game.ang.GameView .access$16 ( v0,v1,v2 );
/* .line 285 */
} // :cond_4
v25 = com.funbox.game.ang.GameField$GAME_STATUS.GS_GAMEOVER;
/* move-object v0, v13 */
/* move-object/from16 v1, v25 */
/* if-ne v0, v1, :cond_5 */
/* .line 287 */
/* move-object/from16 v0, p0 */
v0 = this.this$0;
/* move-object/from16 v25, v0 */
/* invoke-static/range {v25 ..v25}, Lcom/funbox/game/ang/GameView;->access$17(Lcom/funbox/game/ang/GameView;)Landroid/graphics/Bitmap; */
/* const/high16 v26, 0x428c0000 # 70.0f */
/* const/high16 v27, 0x42c80000 # 100.0f */
/* move-object v0, v10 */
/* move-object/from16 v1, v25 */
/* move/from16 v2, v26 */
/* move/from16 v3, v27 */
/* move-object/from16 v4, v20 */
(( android.graphics.Canvas ) v0 ).drawBitmap ( v1, v2, v3, v4 ); // invoke-virtual {v0, v1, v2, v3, v4}, Landroid/graphics/Canvas;->drawBitmap(Landroid/graphics/Bitmap;FFLandroid/graphics/Paint;)V
/* .line 288 */
/* move-object/from16 v0, p0 */
v0 = this.this$0;
/* move-object/from16 v25, v0 */
/* const/16 v26, 0x320 */
/* invoke-virtual/range {v25 ..v26}, Lcom/funbox/game/ang/GameView;->mySleep(I)V */
/* .line 292 */
} // :cond_5
/* move-object/from16 v0, p0 */
v0 = this.this$0;
/* move-object/from16 v25, v0 */
/* invoke-static/range {v25 ..v25}, Lcom/funbox/game/ang/GameView;->access$1(Lcom/funbox/game/ang/GameView;)Landroid/view/SurfaceHolder; */
/* move-object/from16 v0, v25 */
/* move-object v1, v10 */
/* .line 295 */
/* move-object/from16 v0, p0 */
v0 = this.this$0;
/* move-object/from16 v25, v0 */
/* move-object/from16 v0, v25 */
v0 = this.mGameField;
/* move-object/from16 v25, v0 */
v25 = /* invoke-virtual/range {v25 ..v25}, Lcom/funbox/game/ang/GameField;->getLevel()I */
/* move/from16 v0, v25 */
/* move/from16 v1, v19 */
/* if-le v0, v1, :cond_6 */
/* .line 297 */
/* move-object/from16 v0, p0 */
v0 = this.this$0;
/* move-object/from16 v25, v0 */
/* invoke-static/range {v25 ..v25}, Lcom/funbox/game/ang/GameView;->access$18(Lcom/funbox/game/ang/GameView;)Lcom/funbox/game/ang/Main; */
/* move-object/from16 v0, p0 */
v0 = this.this$0;
/* move-object/from16 v26, v0 */
/* invoke-static/range {v26 ..v26}, Lcom/funbox/game/ang/GameView;->access$18(Lcom/funbox/game/ang/GameView;)Lcom/funbox/game/ang/Main; */
/* move-object/from16 v0, v26 */
v0 = this.mGameSound;
/* move-object/from16 v26, v0 */
/* invoke-virtual/range {v26 ..v26}, Ljava/lang/Object;->getClass()Ljava/lang/Class; */
/* const/16 v26, 0x8 */
/* invoke-virtual/range {v25 ..v26}, Lcom/funbox/game/ang/Main;->playSP(I)V */
/* .line 298 */
/* move-object/from16 v0, p0 */
v0 = this.this$0;
/* move-object/from16 v25, v0 */
/* move-object/from16 v0, v25 */
v0 = this.mGameField;
/* move-object/from16 v25, v0 */
v19 = /* invoke-virtual/range {v25 ..v25}, Lcom/funbox/game/ang/GameField;->getLevel()I */
/* .line 299 */
/* move-object/from16 v0, p0 */
v0 = this.this$0;
/* move-object/from16 v25, v0 */
/* const/16 v26, 0x3e8 */
/* invoke-virtual/range {v25 ..v26}, Lcom/funbox/game/ang/GameView;->mySleep(I)V */
/* .line 307 */
} // :cond_6
/* move-object/from16 v0, p0 */
v0 = this.this$0;
/* move-object/from16 v25, v0 */
/* move-object/from16 v0, v25 */
v0 = this.mGameField;
/* move-object/from16 v25, v0 */
/* invoke-virtual/range {v25 ..v25}, Lcom/funbox/game/ang/GameField;->getStatus()Lcom/funbox/game/ang/GameField$GAME_STATUS; */
/* .line 308 */
v25 = com.funbox.game.ang.GameField$GAME_STATUS.GS_PLAYING;
/* move-object v0, v13 */
/* move-object/from16 v1, v25 */
/* if-ne v0, v1, :cond_14 */
/* .line 311 */
int v14 = 0; // const/4 v14, 0x0
} // :goto_2
/* move-object/from16 v0, p0 */
v0 = this.this$0;
/* move-object/from16 v25, v0 */
/* invoke-static/range {v25 ..v25}, Lcom/funbox/game/ang/GameView;->access$4(Lcom/funbox/game/ang/GameView;)Lcom/funbox/game/ang/AnimalManager; */
/* invoke-virtual/range {v25 ..v25}, Ljava/lang/Object;->getClass()Ljava/lang/Class; */
/* const/16 v25, 0x9 */
/* move v0, v14 */
/* move/from16 v1, v25 */
/* if-lt v0, v1, :cond_d */
/* .line 353 */
/* move-object/from16 v0, p0 */
v0 = this.this$0;
/* move-object/from16 v25, v0 */
/* const/16 v26, 0x1e */
/* invoke-virtual/range {v25 ..v26}, Lcom/funbox/game/ang/GameView;->mySleep(I)V */
/* goto/16 :goto_0 */
/* .line 225 */
} // :cond_7
/* move-object/from16 v0, p0 */
v0 = this.this$0;
/* move-object/from16 v25, v0 */
/* invoke-static/range {v25 ..v25}, Lcom/funbox/game/ang/GameView;->access$4(Lcom/funbox/game/ang/GameView;)Lcom/funbox/game/ang/AnimalManager; */
v25 = /* invoke-virtual/range {v25 ..v25}, Lcom/funbox/game/ang/AnimalManager;->getAliveCnt()I */
/* move-object/from16 v0, p0 */
v0 = this.this$0;
/* move-object/from16 v26, v0 */
v26 = /* invoke-static/range {v26 ..v26}, Lcom/funbox/game/ang/GameView;->access$5(Lcom/funbox/game/ang/GameView;)I */
/* move/from16 v0, v25 */
/* move/from16 v1, v26 */
/* if-ge v0, v1, :cond_3 */
/* .line 226 */
/* move-object/from16 v0, p0 */
v0 = this.this$0;
/* move-object/from16 v25, v0 */
/* move-object/from16 v0, v25 */
/* move-wide/from16 v1, v17 */
v25 = com.funbox.game.ang.GameView .access$6 ( v0,v1,v2 );
if ( v25 != null) { // if-eqz v25, :cond_3
/* .line 228 */
v6 = com.funbox.game.ang.Animal$ANIMAL_TYPE.AT_RABBIT;
/* .line 231 */
/* .local v6, "at":Lcom/funbox/game/ang/Animal$ANIMAL_TYPE; */
/* move-object/from16 v0, p0 */
v0 = this.this$0;
/* move-object/from16 v25, v0 */
/* move-object/from16 v0, v25 */
/* move-wide v1, v7 */
v23 = com.funbox.game.ang.GameView .access$7 ( v0,v1,v2 );
/* .line 232 */
/* .local v23, "retCode":I */
if ( v23 != null) { // if-eqz v23, :cond_8
/* .line 233 */
java.lang.System .currentTimeMillis ( );
/* move-result-wide v7 */
/* .line 236 */
} // :cond_8
/* const/16 v25, 0x1 */
/* move/from16 v0, v23 */
/* move/from16 v1, v25 */
/* if-eq v0, v1, :cond_9 */
/* const/16 v25, 0x2 */
/* move/from16 v0, v23 */
/* move/from16 v1, v25 */
/* if-ne v0, v1, :cond_c */
/* .line 238 */
} // :cond_9
/* const/16 v25, 0x2 */
/* move/from16 v0, v23 */
/* move/from16 v1, v25 */
/* if-ne v0, v1, :cond_b */
v25 = com.funbox.game.ang.Animal$ANIMAL_TYPE.AT_BOMB;
/* move-object/from16 v6, v25 */
/* .line 240 */
} // :goto_3
/* move-object/from16 v0, p0 */
v0 = this.this$0;
/* move-object/from16 v25, v0 */
/* invoke-static/range {v25 ..v25}, Lcom/funbox/game/ang/GameView;->access$3(Lcom/funbox/game/ang/GameView;)Lcom/funbox/game/ang/BombEffects; */
/* invoke-virtual/range {v25 ..v25}, Lcom/funbox/game/ang/BombEffects;->ready()V */
/* .line 250 */
} // :cond_a
} // :goto_4
/* move-object/from16 v0, p0 */
v0 = this.this$0;
/* move-object/from16 v25, v0 */
/* invoke-static/range {v25 ..v25}, Lcom/funbox/game/ang/GameView;->access$4(Lcom/funbox/game/ang/GameView;)Lcom/funbox/game/ang/AnimalManager; */
v15 = /* invoke-virtual/range {v25 ..v25}, Lcom/funbox/game/ang/AnimalManager;->getNewAnimalIdxByRandom()I */
/* .line 251 */
/* move-object/from16 v0, p0 */
v0 = this.this$0;
/* move-object/from16 v25, v0 */
/* move-object/from16 v0, v25 */
/* move-object v1, v6 */
v22 = com.funbox.game.ang.GameView .access$9 ( v0,v1 );
/* .line 253 */
/* .local v22, "resId":I */
/* move-object/from16 v0, p0 */
v0 = this.this$0;
/* move-object/from16 v25, v0 */
/* invoke-static/range {v25 ..v25}, Lcom/funbox/game/ang/GameView;->access$4(Lcom/funbox/game/ang/GameView;)Lcom/funbox/game/ang/AnimalManager; */
/* move-object/from16 v0, v25 */
/* move v1, v15 */
(( com.funbox.game.ang.AnimalManager ) v0 ).getAnimal ( v1 ); // invoke-virtual {v0, v1}, Lcom/funbox/game/ang/AnimalManager;->getAnimal(I)Lcom/funbox/game/ang/Animal;
/* .line 254 */
(( com.funbox.game.ang.Animal ) v5 ).init ( ); // invoke-virtual {v5}, Lcom/funbox/game/ang/Animal;->init()V
/* .line 256 */
(( com.funbox.game.ang.Animal ) v5 ).setType ( v6 ); // invoke-virtual {v5, v6}, Lcom/funbox/game/ang/Animal;->setType(Lcom/funbox/game/ang/Animal$ANIMAL_TYPE;)V
/* .line 257 */
/* move-object v0, v5 */
/* move/from16 v1, v22 */
(( com.funbox.game.ang.Animal ) v0 ).setBmpId ( v1 ); // invoke-virtual {v0, v1}, Lcom/funbox/game/ang/Animal;->setBmpId(I)V
/* .line 258 */
/* move-object/from16 v0, p0 */
v0 = this.this$0;
/* move-object/from16 v25, v0 */
/* move-object/from16 v0, v25 */
/* move/from16 v1, v22 */
com.funbox.game.ang.GameView .access$10 ( v0,v1 );
/* move-object v0, v5 */
/* move-object/from16 v1, v25 */
(( com.funbox.game.ang.Animal ) v0 ).setBmp ( v1 ); // invoke-virtual {v0, v1}, Lcom/funbox/game/ang/Animal;->setBmp(Landroid/graphics/Bitmap;)V
/* .line 260 */
/* move-object/from16 v0, p0 */
v0 = this.this$0;
/* move-object/from16 v25, v0 */
/* move-object/from16 v0, v25 */
/* move-object v1, v6 */
v24 = com.funbox.game.ang.GameView .access$11 ( v0,v1 );
/* .line 261 */
/* .local v24, "v":I */
/* move-object v0, v5 */
/* move/from16 v1, v24 */
(( com.funbox.game.ang.Animal ) v0 ).setSpeed ( v1 ); // invoke-virtual {v0, v1}, Lcom/funbox/game/ang/Animal;->setSpeed(I)V
/* .line 263 */
(( com.funbox.game.ang.Animal ) v5 ).start ( ); // invoke-virtual {v5}, Lcom/funbox/game/ang/Animal;->start()V
/* .line 265 */
java.lang.System .currentTimeMillis ( );
/* move-result-wide v17 */
/* goto/16 :goto_1 */
/* .line 238 */
} // .end local v22 # "resId":I
} // .end local v24 # "v":I
} // :cond_b
v25 = com.funbox.game.ang.Animal$ANIMAL_TYPE.AT_FIRE;
/* move-object/from16 v6, v25 */
/* .line 242 */
} // :cond_c
/* move-object/from16 v0, p0 */
v0 = this.this$0;
/* move-object/from16 v25, v0 */
/* move-object/from16 v0, v25 */
/* move-wide v1, v11 */
v23 = com.funbox.game.ang.GameView .access$8 ( v0,v1,v2 );
if ( v23 != null) { // if-eqz v23, :cond_a
/* .line 243 */
java.lang.System .currentTimeMillis ( );
/* move-result-wide v11 */
/* .line 244 */
/* const/16 v25, 0x1 */
/* move/from16 v0, v23 */
/* move/from16 v1, v25 */
/* if-ne v0, v1, :cond_a */
/* .line 245 */
v6 = com.funbox.game.ang.Animal$ANIMAL_TYPE.AT_FLOWER;
/* goto/16 :goto_4 */
/* .line 312 */
} // .end local v6 # "at":Lcom/funbox/game/ang/Animal$ANIMAL_TYPE;
} // .end local v23 # "retCode":I
} // :cond_d
/* move-object/from16 v0, p0 */
v0 = this.this$0;
/* move-object/from16 v25, v0 */
/* invoke-static/range {v25 ..v25}, Lcom/funbox/game/ang/GameView;->access$4(Lcom/funbox/game/ang/GameView;)Lcom/funbox/game/ang/AnimalManager; */
/* move-object/from16 v0, v25 */
/* move v1, v14 */
(( com.funbox.game.ang.AnimalManager ) v0 ).getAnimal ( v1 ); // invoke-virtual {v0, v1}, Lcom/funbox/game/ang/AnimalManager;->getAnimal(I)Lcom/funbox/game/ang/Animal;
/* .line 313 */
v25 = (( com.funbox.game.ang.Animal ) v5 ).getAlive ( ); // invoke-virtual {v5}, Lcom/funbox/game/ang/Animal;->getAlive()Z
/* if-nez v25, :cond_f */
/* .line 311 */
} // :cond_e
} // :goto_5
/* add-int/lit8 v14, v14, 0x1 */
/* goto/16 :goto_2 */
/* .line 317 */
} // :cond_f
(( com.funbox.game.ang.Animal ) v5 ).getType ( ); // invoke-virtual {v5}, Lcom/funbox/game/ang/Animal;->getType()Lcom/funbox/game/ang/Animal$ANIMAL_TYPE;
v26 = com.funbox.game.ang.Animal$ANIMAL_TYPE.AT_RABBIT;
/* move-object/from16 v0, v25 */
/* move-object/from16 v1, v26 */
/* if-ne v0, v1, :cond_10 */
/* .line 318 */
v25 = (( com.funbox.game.ang.Animal ) v5 ).isSoundNow ( ); // invoke-virtual {v5}, Lcom/funbox/game/ang/Animal;->isSoundNow()Z
if ( v25 != null) { // if-eqz v25, :cond_10
/* .line 319 */
/* move-object/from16 v0, p0 */
v0 = this.this$0;
/* move-object/from16 v25, v0 */
/* invoke-static/range {v25 ..v25}, Lcom/funbox/game/ang/GameView;->access$18(Lcom/funbox/game/ang/GameView;)Lcom/funbox/game/ang/Main; */
/* move-object/from16 v0, p0 */
v0 = this.this$0;
/* move-object/from16 v26, v0 */
/* invoke-static/range {v26 ..v26}, Lcom/funbox/game/ang/GameView;->access$18(Lcom/funbox/game/ang/GameView;)Lcom/funbox/game/ang/Main; */
/* move-object/from16 v0, v26 */
v0 = this.mGameSound;
/* move-object/from16 v26, v0 */
/* invoke-virtual/range {v26 ..v26}, Ljava/lang/Object;->getClass()Ljava/lang/Class; */
/* const/16 v26, 0x4 */
/* invoke-virtual/range {v25 ..v26}, Lcom/funbox/game/ang/Main;->playSP(I)V */
/* .line 322 */
} // :cond_10
(( com.funbox.game.ang.Animal ) v5 ).getStatus ( ); // invoke-virtual {v5}, Lcom/funbox/game/ang/Animal;->getStatus()Lcom/funbox/game/ang/Animal$ANIMAL_STATUS;
v26 = com.funbox.game.ang.Animal$ANIMAL_STATUS.AS_STOP;
/* move-object/from16 v0, v25 */
/* move-object/from16 v1, v26 */
/* if-ne v0, v1, :cond_11 */
/* .line 330 */
v25 = com.funbox.game.ang.Animal$ANIMAL_STATUS.AS_DOWN;
/* move-object v0, v5 */
/* move-object/from16 v1, v25 */
(( com.funbox.game.ang.Animal ) v0 ).setStatus ( v1 ); // invoke-virtual {v0, v1}, Lcom/funbox/game/ang/Animal;->setStatus(Lcom/funbox/game/ang/Animal$ANIMAL_STATUS;)V
/* .line 333 */
} // :cond_11
v25 = (( com.funbox.game.ang.Animal ) v5 ).move ( ); // invoke-virtual {v5}, Lcom/funbox/game/ang/Animal;->move()Z
/* if-nez v25, :cond_e */
/* .line 334 */
(( com.funbox.game.ang.Animal ) v5 ).getStatus ( ); // invoke-virtual {v5}, Lcom/funbox/game/ang/Animal;->getStatus()Lcom/funbox/game/ang/Animal$ANIMAL_STATUS;
v26 = com.funbox.game.ang.Animal$ANIMAL_STATUS.AS_FINISH;
/* move-object/from16 v0, v25 */
/* move-object/from16 v1, v26 */
/* if-ne v0, v1, :cond_e */
/* .line 337 */
v25 = (( com.funbox.game.ang.Animal ) v5 ).isHit ( ); // invoke-virtual {v5}, Lcom/funbox/game/ang/Animal;->isHit()Z
/* if-nez v25, :cond_12 */
/* .line 338 */
(( com.funbox.game.ang.Animal ) v5 ).getType ( ); // invoke-virtual {v5}, Lcom/funbox/game/ang/Animal;->getType()Lcom/funbox/game/ang/Animal$ANIMAL_TYPE;
v26 = com.funbox.game.ang.Animal$ANIMAL_TYPE.AT_RABBIT;
/* move-object/from16 v0, v25 */
/* move-object/from16 v1, v26 */
/* if-ne v0, v1, :cond_13 */
/* .line 339 */
/* move-object/from16 v0, p0 */
v0 = this.this$0;
/* move-object/from16 v25, v0 */
/* move-object/from16 v0, v25 */
v0 = this.mGameField;
/* move-object/from16 v25, v0 */
v25 = /* invoke-virtual/range {v25 ..v25}, Lcom/funbox/game/ang/GameField;->decLife()Z */
/* if-nez v25, :cond_13 */
/* .line 341 */
/* move-object/from16 v0, p0 */
v0 = this.this$0;
/* move-object/from16 v25, v0 */
/* move-object/from16 v0, v25 */
v0 = this.mGameField;
/* move-object/from16 v25, v0 */
v26 = com.funbox.game.ang.GameField$GAME_STATUS.GS_GAMEOVER;
/* invoke-virtual/range {v25 ..v26}, Lcom/funbox/game/ang/GameField;->setStatus(Lcom/funbox/game/ang/GameField$GAME_STATUS;)V */
/* .line 347 */
} // :cond_12
} // :goto_6
(( com.funbox.game.ang.Animal ) v5 ).End ( ); // invoke-virtual {v5}, Lcom/funbox/game/ang/Animal;->End()V
/* goto/16 :goto_5 */
/* .line 342 */
} // :cond_13
(( com.funbox.game.ang.Animal ) v5 ).getType ( ); // invoke-virtual {v5}, Lcom/funbox/game/ang/Animal;->getType()Lcom/funbox/game/ang/Animal$ANIMAL_TYPE;
v25 = com.funbox.game.ang.Animal$ANIMAL_TYPE.AT_FLOWER;
/* .line 354 */
} // :cond_14
v25 = com.funbox.game.ang.GameField$GAME_STATUS.GS_READY;
/* move-object v0, v13 */
/* move-object/from16 v1, v25 */
/* if-ne v0, v1, :cond_15 */
/* .line 356 */
/* move-object/from16 v0, p0 */
v0 = this.this$0;
/* move-object/from16 v25, v0 */
/* const/16 v26, 0x7d0 */
/* invoke-virtual/range {v25 ..v26}, Lcom/funbox/game/ang/GameView;->mySleep(I)V */
/* .line 359 */
/* move-object/from16 v0, p0 */
v0 = this.this$0;
/* move-object/from16 v25, v0 */
/* move-object/from16 v0, v25 */
v0 = this.mGameField;
/* move-object/from16 v25, v0 */
v26 = com.funbox.game.ang.GameField$GAME_STATUS.GS_PLAYING;
/* invoke-virtual/range {v25 ..v26}, Lcom/funbox/game/ang/GameField;->setStatus(Lcom/funbox/game/ang/GameField$GAME_STATUS;)V */
/* goto/16 :goto_0 */
/* .line 360 */
} // :cond_15
/* move-object/from16 v0, p0 */
v0 = this.this$0;
/* move-object/from16 v25, v0 */
/* move-object/from16 v0, v25 */
v0 = this.mGameField;
/* move-object/from16 v25, v0 */
/* invoke-virtual/range {v25 ..v25}, Lcom/funbox/game/ang/GameField;->getStatus()Lcom/funbox/game/ang/GameField$GAME_STATUS; */
v26 = com.funbox.game.ang.GameField$GAME_STATUS.GS_PAUSE;
/* move-object/from16 v0, v25 */
/* move-object/from16 v1, v26 */
/* if-ne v0, v1, :cond_17 */
/* .line 362 */
} // :cond_16
/* move-object/from16 v0, p0 */
v0 = this.this$0;
/* move-object/from16 v25, v0 */
v25 = /* invoke-static/range {v25 ..v25}, Lcom/funbox/game/ang/GameView;->access$0(Lcom/funbox/game/ang/GameView;)Z */
if ( v25 != null) { // if-eqz v25, :cond_0
/* move-object/from16 v0, p0 */
v0 = this.this$0;
/* move-object/from16 v25, v0 */
/* move-object/from16 v0, v25 */
v0 = this.mGameField;
/* move-object/from16 v25, v0 */
/* invoke-virtual/range {v25 ..v25}, Lcom/funbox/game/ang/GameField;->getStatus()Lcom/funbox/game/ang/GameField$GAME_STATUS; */
v26 = com.funbox.game.ang.GameField$GAME_STATUS.GS_PAUSE;
/* move-object/from16 v0, v25 */
/* move-object/from16 v1, v26 */
/* if-ne v0, v1, :cond_0 */
/* .line 363 */
/* move-object/from16 v0, p0 */
v0 = this.this$0;
/* move-object/from16 v25, v0 */
/* const/16 v26, 0xc8 */
/* invoke-virtual/range {v25 ..v26}, Lcom/funbox/game/ang/GameView;->mySleep(I)V */
/* .line 364 */
/* move-object/from16 v0, p0 */
v0 = this.this$0;
/* move-object/from16 v25, v0 */
v25 = /* invoke-static/range {v25 ..v25}, Lcom/funbox/game/ang/GameView;->access$0(Lcom/funbox/game/ang/GameView;)Z */
if ( v25 != null) { // if-eqz v25, :cond_16
/* move-object/from16 v0, p0 */
v0 = this.this$0;
/* move-object/from16 v25, v0 */
/* move-object/from16 v0, v25 */
v0 = this.mGameField;
/* move-object/from16 v25, v0 */
/* invoke-virtual/range {v25 ..v25}, Lcom/funbox/game/ang/GameField;->getStatus()Lcom/funbox/game/ang/GameField$GAME_STATUS; */
v26 = com.funbox.game.ang.GameField$GAME_STATUS.GS_PAUSE;
/* move-object/from16 v0, v25 */
/* move-object/from16 v1, v26 */
/* if-eq v0, v1, :cond_16 */
/* goto/16 :goto_0 */
/* .line 369 */
} // :cond_17
v25 = com.funbox.game.ang.GameField$GAME_STATUS.GS_GAMEOVER;
/* move-object v0, v13 */
/* move-object/from16 v1, v25 */
/* if-ne v0, v1, :cond_0 */
/* .line 370 */
/* move-object/from16 v0, p0 */
v0 = this.this$0;
/* move-object/from16 v25, v0 */
/* const/16 v26, 0x64 */
/* invoke-virtual/range {v25 ..v26}, Lcom/funbox/game/ang/GameView;->mySleep(I)V */
/* .line 372 */
/* if-nez v16, :cond_0 */
/* .line 373 */
/* const/16 v16, 0x1 */
/* .line 375 */
/* new-instance v21, Landroid/os/Message; */
/* invoke-direct/range {v21 ..v21}, Landroid/os/Message;-><init>()V */
/* .line 376 */
/* .local v21, "message":Landroid/os/Message; */
/* new-instance v9, Landroid/os/Bundle; */
/* invoke-direct {v9}, Landroid/os/Bundle;-><init>()V */
/* .line 377 */
/* .local v9, "bundle":Landroid/os/Bundle; */
final String v25 = "showAd"; // const-string v25, "showAd"
/* const/16 v26, 0x1 */
/* move-object v0, v9 */
/* move-object/from16 v1, v25 */
/* move/from16 v2, v26 */
(( android.os.Bundle ) v0 ).putBoolean ( v1, v2 ); // invoke-virtual {v0, v1, v2}, Landroid/os/Bundle;->putBoolean(Ljava/lang/String;Z)V
/* .line 378 */
/* move-object/from16 v0, v21 */
/* move-object v1, v9 */
(( android.os.Message ) v0 ).setData ( v1 ); // invoke-virtual {v0, v1}, Landroid/os/Message;->setData(Landroid/os/Bundle;)V
/* .line 379 */
/* move-object/from16 v0, p0 */
v0 = this.this$0;
/* move-object/from16 v25, v0 */
/* invoke-static/range {v25 ..v25}, Lcom/funbox/game/ang/GameView;->access$19(Lcom/funbox/game/ang/GameView;)Landroid/os/Handler; */
/* move-object/from16 v0, v25 */
/* move-object/from16 v1, v21 */
(( android.os.Handler ) v0 ).sendMessage ( v1 ); // invoke-virtual {v0, v1}, Landroid/os/Handler;->sendMessage(Landroid/os/Message;)Z
/* goto/16 :goto_0 */
} // .end method
