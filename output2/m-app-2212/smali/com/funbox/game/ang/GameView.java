class com.funbox.game.ang.GameView extends android.view.SurfaceView implements android.view.SurfaceHolder$Callback {
	 /* .source "GameView.java" */
	 /* # interfaces */
	 /* # annotations */
	 /* .annotation system Ldalvik/annotation/MemberClasses; */
	 /* value = { */
	 /* Lcom/funbox/game/ang/GameView$MyThread; */
	 /* } */
} // .end annotation
/* # instance fields */
private android.view.SurfaceHolder holder;
private com.funbox.game.ang.AnimalManager mAnimalManager;
private android.graphics.Bitmap mBmpBkg;
private android.graphics.Bitmap mBmpGameOver;
private android.graphics.Bitmap mBmpPause1;
private android.graphics.Bitmap mBmpPause2;
private android.graphics.Bitmap mBmpScoreBoard;
private android.graphics.Bitmap mBmpSmallAnimal;
private android.graphics.Bitmap mBmpSoundOff;
private android.graphics.Bitmap mBmpSoundOn;
private com.funbox.game.ang.BombEffects mBombEffects;
private android.graphics.Typeface mDefaultFace;
private android.graphics.Typeface mFace;
public com.funbox.game.ang.GameField mGameField;
private com.funbox.game.ang.GrassManager mGrassManager;
private android.os.Handler mHandler;
private com.funbox.game.ang.Main mMain;
private java.util.Random mRand;
private Boolean mRunning;
private java.lang.Thread mThread;
/* # direct methods */
public com.funbox.game.ang.GameView ( ) {
	 /* .locals 4 */
	 /* .param p1, "context" # Landroid/content/Context; */
	 /* .param p2, "attrs" # Landroid/util/AttributeSet; */
	 /* .prologue */
	 /* .line 78 */
	 /* invoke-direct {p0, p1, p2}, Landroid/view/SurfaceView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V */
	 /* .line 73 */
	 /* new-instance v0, Ljava/util/Random; */
	 /* invoke-direct {v0}, Ljava/util/Random;-><init>()V */
	 this.mRand = v0;
	 /* .line 79 */
	 (( com.funbox.game.ang.GameView ) p0 ).getHolder ( ); // invoke-virtual {p0}, Lcom/funbox/game/ang/GameView;->getHolder()Landroid/view/SurfaceHolder;
	 this.holder = v0;
	 /* .line 80 */
	 v0 = this.holder;
	 /* .line 82 */
	 /* new-instance v0, Lcom/funbox/game/ang/GameView$1; */
	 /* invoke-direct {v0, p0}, Lcom/funbox/game/ang/GameView$1;-><init>(Lcom/funbox/game/ang/GameView;)V */
	 this.mHandler = v0;
	 /* .line 94 */
	 /* const v0, 0x7f020005 */
	 /* invoke-direct {p0, v0}, Lcom/funbox/game/ang/GameView;->getBitmapByResId(I)Landroid/graphics/Bitmap; */
	 this.mBmpBkg = v0;
	 /* .line 95 */
	 /* const v0, 0x7f02002c */
	 /* invoke-direct {p0, v0}, Lcom/funbox/game/ang/GameView;->getBitmapByResId(I)Landroid/graphics/Bitmap; */
	 this.mBmpGameOver = v0;
	 /* .line 96 */
	 /* const v0, 0x7f020050 */
	 /* invoke-direct {p0, v0}, Lcom/funbox/game/ang/GameView;->getBitmapByResId(I)Landroid/graphics/Bitmap; */
	 this.mBmpScoreBoard = v0;
	 /* .line 97 */
	 /* const v0, 0x7f02004c */
	 /* invoke-direct {p0, v0}, Lcom/funbox/game/ang/GameView;->getBitmapByResId(I)Landroid/graphics/Bitmap; */
	 this.mBmpSmallAnimal = v0;
	 /* .line 98 */
	 /* const v0, 0x7f020041 */
	 /* invoke-direct {p0, v0}, Lcom/funbox/game/ang/GameView;->getBitmapByResId(I)Landroid/graphics/Bitmap; */
	 this.mBmpPause1 = v0;
	 /* .line 99 */
	 /* const v0, 0x7f020042 */
	 /* invoke-direct {p0, v0}, Lcom/funbox/game/ang/GameView;->getBitmapByResId(I)Landroid/graphics/Bitmap; */
	 this.mBmpPause2 = v0;
	 /* .line 100 */
	 /* const v0, 0x7f02005a */
	 /* invoke-direct {p0, v0}, Lcom/funbox/game/ang/GameView;->getBitmapByResId(I)Landroid/graphics/Bitmap; */
	 this.mBmpSoundOn = v0;
	 /* .line 101 */
	 /* const v0, 0x7f02005b */
	 /* invoke-direct {p0, v0}, Lcom/funbox/game/ang/GameView;->getBitmapByResId(I)Landroid/graphics/Bitmap; */
	 this.mBmpSoundOff = v0;
	 /* .line 103 */
	 /* new-instance v0, Lcom/funbox/game/ang/GrassManager; */
	 /* const v1, 0x7f020030 */
	 /* invoke-direct {p0, v1}, Lcom/funbox/game/ang/GameView;->getBitmapByResId(I)Landroid/graphics/Bitmap; */
	 /* .line 104 */
	 /* const v2, 0x7f020031 */
	 /* invoke-direct {p0, v2}, Lcom/funbox/game/ang/GameView;->getBitmapByResId(I)Landroid/graphics/Bitmap; */
	 /* .line 105 */
	 /* const v3, 0x7f02005c */
	 /* invoke-direct {p0, v3}, Lcom/funbox/game/ang/GameView;->getBitmapByResId(I)Landroid/graphics/Bitmap; */
	 /* invoke-direct {v0, v1, v2, v3}, Lcom/funbox/game/ang/GrassManager;-><init>(Landroid/graphics/Bitmap;Landroid/graphics/Bitmap;Landroid/graphics/Bitmap;)V */
	 /* .line 103 */
	 this.mGrassManager = v0;
	 /* .line 107 */
	 /* new-instance v0, Lcom/funbox/game/ang/GameField; */
	 /* invoke-direct {v0}, Lcom/funbox/game/ang/GameField;-><init>()V */
	 this.mGameField = v0;
	 /* .line 108 */
	 /* new-instance v0, Lcom/funbox/game/ang/AnimalManager; */
	 /* invoke-direct {v0}, Lcom/funbox/game/ang/AnimalManager;-><init>()V */
	 this.mAnimalManager = v0;
	 /* .line 112 */
	 (( com.funbox.game.ang.GameView ) p0 ).getContext ( ); // invoke-virtual {p0}, Lcom/funbox/game/ang/GameView;->getContext()Landroid/content/Context;
	 (( android.content.Context ) v0 ).getAssets ( ); // invoke-virtual {v0}, Landroid/content/Context;->getAssets()Landroid/content/res/AssetManager;
	 final String v1 = "fonts/data.ttf"; // const-string v1, "fonts/data.ttf"
	 android.graphics.Typeface .createFromAsset ( v0,v1 );
	 this.mFace = v0;
	 /* .line 114 */
	 (( com.funbox.game.ang.GameView ) p0 ).initGame ( ); // invoke-virtual {p0}, Lcom/funbox/game/ang/GameView;->initGame()V
	 /* .line 115 */
	 return;
} // .end method
static Boolean access$0 ( com.funbox.game.ang.GameView p0 ) { //synthethic
	 /* .locals 1 */
	 /* .prologue */
	 /* .line 63 */
	 /* iget-boolean v0, p0, Lcom/funbox/game/ang/GameView;->mRunning:Z */
} // .end method
static android.view.SurfaceHolder access$1 ( com.funbox.game.ang.GameView p0 ) { //synthethic
	 /* .locals 1 */
	 /* .prologue */
	 /* .line 48 */
	 v0 = this.holder;
} // .end method
static android.graphics.Bitmap access$10 ( com.funbox.game.ang.GameView p0, Integer p1 ) { //synthethic
	 /* .locals 1 */
	 /* .prologue */
	 /* .line 183 */
	 /* invoke-direct {p0, p1}, Lcom/funbox/game/ang/GameView;->getBitmapByResId(I)Landroid/graphics/Bitmap; */
} // .end method
static Integer access$11 ( com.funbox.game.ang.GameView p0, com.funbox.game.ang.Animal$ANIMAL_TYPE p1 ) { //synthethic
	 /* .locals 1 */
	 /* .prologue */
	 /* .line 634 */
	 v0 = 	 /* invoke-direct {p0, p1}, Lcom/funbox/game/ang/GameView;->getAnimalMoveSpeed(Lcom/funbox/game/ang/Animal$ANIMAL_TYPE;)I */
} // .end method
static void access$12 ( com.funbox.game.ang.GameView p0, android.graphics.Canvas p1, android.graphics.Paint p2 ) { //synthethic
	 /* .locals 0 */
	 /* .prologue */
	 /* .line 559 */
	 /* invoke-direct {p0, p1, p2}, Lcom/funbox/game/ang/GameView;->drawMoveAnimals(Landroid/graphics/Canvas;Landroid/graphics/Paint;)V */
	 return;
} // .end method
static void access$13 ( com.funbox.game.ang.GameView p0, android.graphics.Canvas p1, android.graphics.Paint p2 ) { //synthethic
	 /* .locals 0 */
	 /* .prologue */
	 /* .line 512 */
	 /* invoke-direct {p0, p1, p2}, Lcom/funbox/game/ang/GameView;->drawScoreAndLevel(Landroid/graphics/Canvas;Landroid/graphics/Paint;)V */
	 return;
} // .end method
static void access$14 ( com.funbox.game.ang.GameView p0, android.graphics.Canvas p1, android.graphics.Paint p2 ) { //synthethic
	 /* .locals 0 */
	 /* .prologue */
	 /* .line 532 */
	 /* invoke-direct {p0, p1, p2}, Lcom/funbox/game/ang/GameView;->drawAnimalLife(Landroid/graphics/Canvas;Landroid/graphics/Paint;)V */
	 return;
} // .end method
static void access$15 ( com.funbox.game.ang.GameView p0, android.graphics.Canvas p1, android.graphics.Paint p2 ) { //synthethic
	 /* .locals 0 */
	 /* .prologue */
	 /* .line 548 */
	 /* invoke-direct {p0, p1, p2}, Lcom/funbox/game/ang/GameView;->drawPauseBtn(Landroid/graphics/Canvas;Landroid/graphics/Paint;)V */
	 return;
} // .end method
static void access$16 ( com.funbox.game.ang.GameView p0, android.graphics.Canvas p1, android.graphics.Paint p2 ) { //synthethic
	 /* .locals 0 */
	 /* .prologue */
	 /* .line 609 */
	 /* invoke-direct {p0, p1, p2}, Lcom/funbox/game/ang/GameView;->drawBombEffects(Landroid/graphics/Canvas;Landroid/graphics/Paint;)V */
	 return;
} // .end method
static android.graphics.Bitmap access$17 ( com.funbox.game.ang.GameView p0 ) { //synthethic
	 /* .locals 1 */
	 /* .prologue */
	 /* .line 52 */
	 v0 = this.mBmpGameOver;
} // .end method
static com.funbox.game.ang.Main access$18 ( com.funbox.game.ang.GameView p0 ) { //synthethic
	 /* .locals 1 */
	 /* .prologue */
	 /* .line 69 */
	 v0 = this.mMain;
} // .end method
static android.os.Handler access$19 ( com.funbox.game.ang.GameView p0 ) { //synthethic
	 /* .locals 1 */
	 /* .prologue */
	 /* .line 74 */
	 v0 = this.mHandler;
} // .end method
static android.graphics.Bitmap access$2 ( com.funbox.game.ang.GameView p0 ) { //synthethic
	 /* .locals 1 */
	 /* .prologue */
	 /* .line 51 */
	 v0 = this.mBmpBkg;
} // .end method
static com.funbox.game.ang.BombEffects access$3 ( com.funbox.game.ang.GameView p0 ) { //synthethic
	 /* .locals 1 */
	 /* .prologue */
	 /* .line 66 */
	 v0 = this.mBombEffects;
} // .end method
static com.funbox.game.ang.AnimalManager access$4 ( com.funbox.game.ang.GameView p0 ) { //synthethic
	 /* .locals 1 */
	 /* .prologue */
	 /* .line 59 */
	 v0 = this.mAnimalManager;
} // .end method
static Integer access$5 ( com.funbox.game.ang.GameView p0 ) { //synthethic
	 /* .locals 1 */
	 /* .prologue */
	 /* .line 741 */
	 v0 = 	 /* invoke-direct {p0}, Lcom/funbox/game/ang/GameView;->getAnimalMaxCnt()I */
} // .end method
static Boolean access$6 ( com.funbox.game.ang.GameView p0, Long p1 ) { //synthethic
	 /* .locals 1 */
	 /* .prologue */
	 /* .line 728 */
	 v0 = 	 /* invoke-direct {p0, p1, p2}, Lcom/funbox/game/ang/GameView;->isCreateAnimalByRandom(J)Z */
} // .end method
static Integer access$7 ( com.funbox.game.ang.GameView p0, Long p1 ) { //synthethic
	 /* .locals 1 */
	 /* .prologue */
	 /* .line 673 */
	 v0 = 	 /* invoke-direct {p0, p1, p2}, Lcom/funbox/game/ang/GameView;->checkBombTime(J)I */
} // .end method
static Integer access$8 ( com.funbox.game.ang.GameView p0, Long p1 ) { //synthethic
	 /* .locals 1 */
	 /* .prologue */
	 /* .line 653 */
	 v0 = 	 /* invoke-direct {p0, p1, p2}, Lcom/funbox/game/ang/GameView;->checkFlowerTime(J)I */
} // .end method
static Integer access$9 ( com.funbox.game.ang.GameView p0, com.funbox.game.ang.Animal$ANIMAL_TYPE p1 ) { //synthethic
	 /* .locals 1 */
	 /* .prologue */
	 /* .line 688 */
	 v0 = 	 /* invoke-direct {p0, p1}, Lcom/funbox/game/ang/GameView;->getAnimalBmpIdByType(Lcom/funbox/game/ang/Animal$ANIMAL_TYPE;)I */
} // .end method
private void bombAllAnimals ( ) {
	 /* .locals 7 */
	 /* .prologue */
	 /* .line 760 */
	 int v4 = 0; // const/4 v4, 0x0
	 /* .local v4, "i":I */
} // :goto_0
v5 = this.mAnimalManager;
(( java.lang.Object ) v5 ).getClass ( ); // invoke-virtual {v5}, Ljava/lang/Object;->getClass()Ljava/lang/Class;
/* const/16 v5, 0x9 */
/* if-lt v4, v5, :cond_0 */
/* .line 790 */
return;
/* .line 761 */
} // :cond_0
v5 = this.mAnimalManager;
(( com.funbox.game.ang.AnimalManager ) v5 ).getAnimal ( v4 ); // invoke-virtual {v5, v4}, Lcom/funbox/game/ang/AnimalManager;->getAnimal(I)Lcom/funbox/game/ang/Animal;
/* .line 762 */
/* .local v0, "animal":Lcom/funbox/game/ang/Animal; */
v5 = (( com.funbox.game.ang.Animal ) v0 ).getAlive ( ); // invoke-virtual {v0}, Lcom/funbox/game/ang/Animal;->getAlive()Z
/* if-nez v5, :cond_2 */
/* .line 760 */
} // :cond_1
} // :goto_1
/* add-int/lit8 v4, v4, 0x1 */
/* .line 765 */
} // :cond_2
(( com.funbox.game.ang.Animal ) v0 ).getType ( ); // invoke-virtual {v0}, Lcom/funbox/game/ang/Animal;->getType()Lcom/funbox/game/ang/Animal$ANIMAL_TYPE;
/* .line 766 */
/* .local v1, "at":Lcom/funbox/game/ang/Animal$ANIMAL_TYPE; */
v5 = com.funbox.game.ang.Animal$ANIMAL_TYPE.AT_BOMB;
/* if-eq v1, v5, :cond_1 */
/* .line 767 */
v5 = (( com.funbox.game.ang.Animal ) v0 ).isHit ( ); // invoke-virtual {v0}, Lcom/funbox/game/ang/Animal;->isHit()Z
/* if-nez v5, :cond_1 */
/* .line 768 */
(( com.funbox.game.ang.Animal ) v0 ).setHit ( ); // invoke-virtual {v0}, Lcom/funbox/game/ang/Animal;->setHit()V
/* .line 771 */
v5 = com.funbox.game.ang.Animal$ANIMAL_TYPE.AT_RABBIT;
/* if-ne v1, v5, :cond_3 */
/* .line 773 */
v5 = (( com.funbox.game.ang.Animal ) v0 ).getBmpId ( ); // invoke-virtual {v0}, Lcom/funbox/game/ang/Animal;->getBmpId()I
int v6 = 2; // const/4 v6, 0x2
v3 = /* invoke-direct {p0, v5, v6}, Lcom/funbox/game/ang/GameView;->getAnimalBmpIdByStatus(II)I */
/* .line 774 */
/* .local v3, "hitId":I */
/* invoke-direct {p0, v3}, Lcom/funbox/game/ang/GameView;->getBitmapByResId(I)Landroid/graphics/Bitmap; */
/* .line 779 */
} // .end local v3 # "hitId":I
/* .local v2, "bmp":Landroid/graphics/Bitmap; */
} // :goto_2
(( com.funbox.game.ang.Animal ) v0 ).setBmp ( v2 ); // invoke-virtual {v0, v2}, Lcom/funbox/game/ang/Animal;->setBmp(Landroid/graphics/Bitmap;)V
/* .line 786 */
v5 = com.funbox.game.ang.Animal$ANIMAL_TYPE.AT_RABBIT;
/* if-ne v1, v5, :cond_1 */
/* .line 787 */
v5 = this.mGameField;
(( com.funbox.game.ang.GameField ) v5 ).addScore ( ); // invoke-virtual {v5}, Lcom/funbox/game/ang/GameField;->addScore()V
/* .line 776 */
} // .end local v2 # "bmp":Landroid/graphics/Bitmap;
} // :cond_3
/* const v5, 0x7f02001e */
/* invoke-direct {p0, v5}, Lcom/funbox/game/ang/GameView;->getBitmapByResId(I)Landroid/graphics/Bitmap; */
/* .restart local v2 # "bmp":Landroid/graphics/Bitmap; */
} // .end method
private Integer checkBombTime ( Long p0 ) {
/* .locals 8 */
/* .param p1, "bombTime" # J */
/* .prologue */
/* .line 674 */
int v2 = 0; // const/4 v2, 0x0
/* .line 675 */
/* .local v2, "retCode":I */
v4 = this.mGameField;
v0 = (( com.funbox.game.ang.GameField ) v4 ).getLevel ( ); // invoke-virtual {v4}, Lcom/funbox/game/ang/GameField;->getLevel()I
/* .line 676 */
/* .local v0, "level":I */
/* const/16 v4, 0x1770 */
/* const/16 v5, 0x3a98 */
/* mul-int/lit16 v6, v0, 0x190 */
/* sub-int/2addr v5, v6 */
v3 = java.lang.Math .max ( v4,v5 );
/* .line 678 */
/* .local v3, "t":I */
java.lang.System .currentTimeMillis ( );
/* move-result-wide v4 */
/* sub-long/2addr v4, p1 */
/* int-to-long v6, v3 */
/* cmp-long v4, v4, v6 */
/* if-ltz v4, :cond_0 */
/* .line 680 */
v4 = this.mRand;
int v5 = 3; // const/4 v5, 0x3
v1 = (( java.util.Random ) v4 ).nextInt ( v5 ); // invoke-virtual {v4, v5}, Ljava/util/Random;->nextInt(I)I
/* .line 681 */
/* .local v1, "rd":I */
/* add-int/lit8 v2, v1, 0x1 */
/* .line 684 */
} // .end local v1 # "rd":I
} // :cond_0
} // .end method
private Integer checkFlowerTime ( Long p0 ) {
/* .locals 9 */
/* .param p1, "flowerTime" # J */
/* .prologue */
int v8 = 1; // const/4 v8, 0x1
/* .line 654 */
int v2 = 0; // const/4 v2, 0x0
/* .line 658 */
/* .local v2, "retCode":I */
v4 = this.mGameField;
v0 = (( com.funbox.game.ang.GameField ) v4 ).getLevel ( ); // invoke-virtual {v4}, Lcom/funbox/game/ang/GameField;->getLevel()I
/* .line 659 */
/* .local v0, "level":I */
int v4 = 6; // const/4 v4, 0x6
/* if-gt v0, v4, :cond_1 */
/* .line 660 */
/* const/16 v3, 0x1f40 */
/* .line 664 */
/* .local v3, "t":I */
} // :goto_0
java.lang.System .currentTimeMillis ( );
/* move-result-wide v4 */
/* sub-long/2addr v4, p1 */
/* int-to-long v6, v3 */
/* cmp-long v4, v4, v6 */
/* if-ltz v4, :cond_0 */
/* .line 666 */
v4 = this.mRand;
int v5 = 3; // const/4 v5, 0x3
v1 = (( java.util.Random ) v4 ).nextInt ( v5 ); // invoke-virtual {v4, v5}, Ljava/util/Random;->nextInt(I)I
/* .line 667 */
/* .local v1, "rd":I */
/* if-ne v1, v8, :cond_2 */
/* move v2, v8 */
/* .line 670 */
} // .end local v1 # "rd":I
} // :cond_0
} // :goto_1
/* .line 662 */
} // .end local v3 # "t":I
} // :cond_1
/* const/16 v3, 0x2ee0 */
/* .restart local v3 # "t":I */
/* .line 667 */
/* .restart local v1 # "rd":I */
} // :cond_2
int v4 = 2; // const/4 v4, 0x2
/* move v2, v4 */
} // .end method
private void drawAnimalLife ( android.graphics.Canvas p0, android.graphics.Paint p1 ) {
/* .locals 4 */
/* .param p1, "c" # Landroid/graphics/Canvas; */
/* .param p2, "p" # Landroid/graphics/Paint; */
/* .prologue */
/* .line 537 */
v1 = this.mGameField;
v1 = (( com.funbox.game.ang.GameField ) v1 ).getLife ( ); // invoke-virtual {v1}, Lcom/funbox/game/ang/GameField;->getLife()I
/* if-lez v1, :cond_0 */
/* .line 538 */
v1 = this.mBmpSmallAnimal;
/* const/high16 v2, 0x40800000 # 4.0f */
/* const/high16 v3, 0x40000000 # 2.0f */
(( android.graphics.Canvas ) p1 ).drawBitmap ( v1, v2, v3, p2 ); // invoke-virtual {p1, v1, v2, v3, p2}, Landroid/graphics/Canvas;->drawBitmap(Landroid/graphics/Bitmap;FFLandroid/graphics/Paint;)V
/* .line 540 */
/* new-instance v1, Ljava/lang/StringBuilder; */
final String v2 = "x"; // const-string v2, "x"
/* invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V */
v2 = this.mGameField;
v2 = (( com.funbox.game.ang.GameField ) v2 ).getLife ( ); // invoke-virtual {v2}, Lcom/funbox/game/ang/GameField;->getLife()I
java.lang.Integer .toString ( v2 );
(( java.lang.StringBuilder ) v1 ).append ( v2 ); // invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v1 ).toString ( ); // invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
/* .line 541 */
/* .local v0, "sText":Ljava/lang/String; */
/* const/high16 v1, 0x41600000 # 14.0f */
(( android.graphics.Paint ) p2 ).setTextSize ( v1 ); // invoke-virtual {p2, v1}, Landroid/graphics/Paint;->setTextSize(F)V
/* .line 542 */
int v1 = -1; // const/4 v1, -0x1
(( android.graphics.Paint ) p2 ).setColor ( v1 ); // invoke-virtual {p2, v1}, Landroid/graphics/Paint;->setColor(I)V
/* .line 543 */
/* const/high16 v1, 0x423c0000 # 47.0f */
/* const/high16 v2, 0x41a00000 # 20.0f */
(( android.graphics.Canvas ) p1 ).drawText ( v0, v1, v2, p2 ); // invoke-virtual {p1, v0, v1, v2, p2}, Landroid/graphics/Canvas;->drawText(Ljava/lang/String;FFLandroid/graphics/Paint;)V
/* .line 545 */
} // .end local v0 # "sText":Ljava/lang/String;
} // :cond_0
return;
} // .end method
private void drawBombEffects ( android.graphics.Canvas p0, android.graphics.Paint p1 ) {
/* .locals 6 */
/* .param p1, "c" # Landroid/graphics/Canvas; */
/* .param p2, "p" # Landroid/graphics/Paint; */
/* .prologue */
/* .line 610 */
v3 = this.mBombEffects;
v3 = (( com.funbox.game.ang.BombEffects ) v3 ).isAlive ( ); // invoke-virtual {v3}, Lcom/funbox/game/ang/BombEffects;->isAlive()Z
/* if-nez v3, :cond_0 */
/* .line 632 */
} // :goto_0
return;
/* .line 613 */
} // :cond_0
v3 = this.mBombEffects;
v2 = (( com.funbox.game.ang.BombEffects ) v3 ).getCurBmpId ( ); // invoke-virtual {v3}, Lcom/funbox/game/ang/BombEffects;->getCurBmpId()I
/* .line 614 */
/* .local v2, "resId":I */
int v3 = -1; // const/4 v3, -0x1
/* if-ne v2, v3, :cond_1 */
/* .line 615 */
v3 = this.mBombEffects;
(( com.funbox.game.ang.BombEffects ) v3 ).end ( ); // invoke-virtual {v3}, Lcom/funbox/game/ang/BombEffects;->end()V
/* .line 619 */
} // :cond_1
/* invoke-direct {p0, v2}, Lcom/funbox/game/ang/GameView;->getBitmapByResId(I)Landroid/graphics/Bitmap; */
/* .line 623 */
/* .local v0, "bmp":Landroid/graphics/Bitmap; */
int v1 = 0; // const/4 v1, 0x0
/* .local v1, "i":I */
} // :goto_1
/* const/16 v3, 0x9 */
/* if-lt v1, v3, :cond_2 */
/* .line 631 */
v3 = this.mBombEffects;
(( com.funbox.game.ang.BombEffects ) v3 ).nextStep ( ); // invoke-virtual {v3}, Lcom/funbox/game/ang/BombEffects;->nextStep()Z
/* .line 625 */
} // :cond_2
v3 = this.mBombEffects;
v3 = this.mPos;
/* aget-object v3, v3, v1 */
int v4 = 0; // const/4 v4, 0x0
/* aget v3, v3, v4 */
/* int-to-float v3, v3 */
/* .line 626 */
v4 = this.mBombEffects;
v4 = this.mPos;
/* aget-object v4, v4, v1 */
int v5 = 1; // const/4 v5, 0x1
/* aget v4, v4, v5 */
/* int-to-float v4, v4 */
/* .line 624 */
(( android.graphics.Canvas ) p1 ).drawBitmap ( v0, v3, v4, p2 ); // invoke-virtual {p1, v0, v3, v4, p2}, Landroid/graphics/Canvas;->drawBitmap(Landroid/graphics/Bitmap;FFLandroid/graphics/Paint;)V
/* .line 623 */
/* add-int/lit8 v1, v1, 0x1 */
} // .end method
private void drawMoveAnimals ( android.graphics.Canvas p0, android.graphics.Paint p1 ) {
/* .locals 9 */
/* .param p1, "c" # Landroid/graphics/Canvas; */
/* .param p2, "p" # Landroid/graphics/Paint; */
/* .prologue */
/* .line 564 */
int v6 = 3; // const/4 v6, 0x3
/* new-array v1, v6, [Z */
/* .line 568 */
/* .local v1, "b":[Z */
int v3 = 0; // const/4 v3, 0x0
/* .local v3, "i":I */
} // :goto_0
v6 = this.mAnimalManager;
(( java.lang.Object ) v6 ).getClass ( ); // invoke-virtual {v6}, Ljava/lang/Object;->getClass()Ljava/lang/Class;
/* const/16 v6, 0x9 */
/* if-lt v3, v6, :cond_0 */
/* .line 606 */
return;
/* .line 569 */
} // :cond_0
v6 = this.mAnimalManager;
(( com.funbox.game.ang.AnimalManager ) v6 ).getAnimal ( v3 ); // invoke-virtual {v6, v3}, Lcom/funbox/game/ang/AnimalManager;->getAnimal(I)Lcom/funbox/game/ang/Animal;
/* .line 570 */
/* .local v0, "animal":Lcom/funbox/game/ang/Animal; */
v6 = (( com.funbox.game.ang.Animal ) v0 ).getAlive ( ); // invoke-virtual {v0}, Lcom/funbox/game/ang/Animal;->getAlive()Z
if ( v6 != null) { // if-eqz v6, :cond_1
/* .line 572 */
(( com.funbox.game.ang.Animal ) v0 ).getBmp ( ); // invoke-virtual {v0}, Lcom/funbox/game/ang/Animal;->getBmp()Landroid/graphics/Bitmap;
/* .line 573 */
/* iget v7, v0, Lcom/funbox/game/ang/Animal;->mNowX:I */
/* int-to-float v7, v7 */
/* .line 574 */
/* iget v8, v0, Lcom/funbox/game/ang/Animal;->mNowY:I */
/* int-to-float v8, v8 */
/* .line 572 */
(( android.graphics.Canvas ) p1 ).drawBitmap ( v6, v7, v8, p2 ); // invoke-virtual {p1, v6, v7, v8, p2}, Landroid/graphics/Canvas;->drawBitmap(Landroid/graphics/Bitmap;FFLandroid/graphics/Paint;)V
/* .line 576 */
int v6 = 3; // const/4 v6, 0x3
/* if-ge v3, v6, :cond_3 */
/* .line 577 */
int v6 = 0; // const/4 v6, 0x0
int v7 = 1; // const/4 v7, 0x1
/* aput-boolean v7, v1, v6 */
/* .line 584 */
} // :cond_1
} // :goto_1
int v4 = 0; // const/4 v4, 0x0
/* .line 585 */
/* .local v4, "isGrass":Z */
int v6 = 2; // const/4 v6, 0x2
/* if-ne v3, v6, :cond_5 */
int v6 = 0; // const/4 v6, 0x0
/* aget-boolean v6, v1, v6 */
if ( v6 != null) { // if-eqz v6, :cond_5
/* .line 586 */
int v4 = 1; // const/4 v4, 0x1
/* .line 587 */
v5 = com.funbox.game.ang.Animal$ANIMAL_SITE.T1;
/* .line 598 */
/* .local v5, "site":Lcom/funbox/game/ang/Animal$ANIMAL_SITE; */
} // :goto_2
if ( v4 != null) { // if-eqz v4, :cond_2
/* .line 599 */
v6 = this.mGrassManager;
(( com.funbox.game.ang.GrassManager ) v6 ).getCurBmp ( v5 ); // invoke-virtual {v6, v5}, Lcom/funbox/game/ang/GrassManager;->getCurBmp(Lcom/funbox/game/ang/Animal$ANIMAL_SITE;)Landroid/graphics/Bitmap;
/* .line 601 */
/* .local v2, "bmp":Landroid/graphics/Bitmap; */
v6 = this.mGrassManager;
v6 = (( com.funbox.game.ang.GrassManager ) v6 ).getX ( ); // invoke-virtual {v6}, Lcom/funbox/game/ang/GrassManager;->getX()I
/* int-to-float v6, v6 */
/* .line 602 */
v7 = this.mGrassManager;
v7 = (( com.funbox.game.ang.GrassManager ) v7 ).getY ( v5 ); // invoke-virtual {v7, v5}, Lcom/funbox/game/ang/GrassManager;->getY(Lcom/funbox/game/ang/Animal$ANIMAL_SITE;)I
/* int-to-float v7, v7 */
/* .line 600 */
(( android.graphics.Canvas ) p1 ).drawBitmap ( v2, v6, v7, p2 ); // invoke-virtual {p1, v2, v6, v7, p2}, Landroid/graphics/Canvas;->drawBitmap(Landroid/graphics/Bitmap;FFLandroid/graphics/Paint;)V
/* .line 568 */
} // .end local v2 # "bmp":Landroid/graphics/Bitmap;
} // :cond_2
/* add-int/lit8 v3, v3, 0x1 */
/* .line 578 */
} // .end local v4 # "isGrass":Z
} // .end local v5 # "site":Lcom/funbox/game/ang/Animal$ANIMAL_SITE;
} // :cond_3
int v6 = 3; // const/4 v6, 0x3
/* if-lt v3, v6, :cond_4 */
int v6 = 6; // const/4 v6, 0x6
/* if-ge v3, v6, :cond_4 */
/* .line 579 */
int v6 = 1; // const/4 v6, 0x1
int v7 = 1; // const/4 v7, 0x1
/* aput-boolean v7, v1, v6 */
/* .line 580 */
} // :cond_4
int v6 = 6; // const/4 v6, 0x6
/* if-lt v3, v6, :cond_1 */
/* const/16 v6, 0x9 */
/* if-ge v3, v6, :cond_1 */
/* .line 581 */
int v6 = 2; // const/4 v6, 0x2
int v7 = 1; // const/4 v7, 0x1
/* aput-boolean v7, v1, v6 */
/* .line 588 */
/* .restart local v4 # "isGrass":Z */
} // :cond_5
int v6 = 5; // const/4 v6, 0x5
/* if-ne v3, v6, :cond_6 */
int v6 = 1; // const/4 v6, 0x1
/* aget-boolean v6, v1, v6 */
if ( v6 != null) { // if-eqz v6, :cond_6
/* .line 589 */
int v4 = 1; // const/4 v4, 0x1
/* .line 590 */
v5 = com.funbox.game.ang.Animal$ANIMAL_SITE.M1;
/* .restart local v5 # "site":Lcom/funbox/game/ang/Animal$ANIMAL_SITE; */
/* .line 591 */
} // .end local v5 # "site":Lcom/funbox/game/ang/Animal$ANIMAL_SITE;
} // :cond_6
/* const/16 v6, 0x8 */
/* if-ne v3, v6, :cond_7 */
int v6 = 2; // const/4 v6, 0x2
/* aget-boolean v6, v1, v6 */
if ( v6 != null) { // if-eqz v6, :cond_7
/* .line 592 */
int v4 = 1; // const/4 v4, 0x1
/* .line 593 */
v5 = com.funbox.game.ang.Animal$ANIMAL_SITE.B1;
/* .restart local v5 # "site":Lcom/funbox/game/ang/Animal$ANIMAL_SITE; */
/* .line 595 */
} // .end local v5 # "site":Lcom/funbox/game/ang/Animal$ANIMAL_SITE;
} // :cond_7
v5 = com.funbox.game.ang.Animal$ANIMAL_SITE.T1;
/* .restart local v5 # "site":Lcom/funbox/game/ang/Animal$ANIMAL_SITE; */
} // .end method
private void drawPauseBtn ( android.graphics.Canvas p0, android.graphics.Paint p1 ) {
/* .locals 4 */
/* .param p1, "c" # Landroid/graphics/Canvas; */
/* .param p2, "p" # Landroid/graphics/Paint; */
/* .prologue */
/* const v3, 0x438e8000 # 285.0f */
/* const/high16 v2, 0x40400000 # 3.0f */
/* .line 550 */
v0 = this.mGameField;
(( com.funbox.game.ang.GameField ) v0 ).getStatus ( ); // invoke-virtual {v0}, Lcom/funbox/game/ang/GameField;->getStatus()Lcom/funbox/game/ang/GameField$GAME_STATUS;
v1 = com.funbox.game.ang.GameField$GAME_STATUS.GS_PLAYING;
/* if-eq v0, v1, :cond_0 */
v0 = this.mGameField;
(( com.funbox.game.ang.GameField ) v0 ).getStatus ( ); // invoke-virtual {v0}, Lcom/funbox/game/ang/GameField;->getStatus()Lcom/funbox/game/ang/GameField$GAME_STATUS;
v1 = com.funbox.game.ang.GameField$GAME_STATUS.GS_READY;
/* if-ne v0, v1, :cond_2 */
/* .line 551 */
} // :cond_0
v0 = this.mBmpPause1;
(( android.graphics.Canvas ) p1 ).drawBitmap ( v0, v3, v2, p2 ); // invoke-virtual {p1, v0, v3, v2, p2}, Landroid/graphics/Canvas;->drawBitmap(Landroid/graphics/Bitmap;FFLandroid/graphics/Paint;)V
/* .line 556 */
} // :cond_1
} // :goto_0
return;
/* .line 553 */
} // :cond_2
v0 = this.mGameField;
(( com.funbox.game.ang.GameField ) v0 ).getStatus ( ); // invoke-virtual {v0}, Lcom/funbox/game/ang/GameField;->getStatus()Lcom/funbox/game/ang/GameField$GAME_STATUS;
v1 = com.funbox.game.ang.GameField$GAME_STATUS.GS_PAUSE;
/* if-ne v0, v1, :cond_1 */
/* .line 554 */
v0 = this.mBmpPause2;
(( android.graphics.Canvas ) p1 ).drawBitmap ( v0, v3, v2, p2 ); // invoke-virtual {p1, v0, v3, v2, p2}, Landroid/graphics/Canvas;->drawBitmap(Landroid/graphics/Bitmap;FFLandroid/graphics/Paint;)V
} // .end method
private void drawScoreAndLevel ( android.graphics.Canvas p0, android.graphics.Paint p1 ) {
/* .locals 5 */
/* .param p1, "c" # Landroid/graphics/Canvas; */
/* .param p2, "p" # Landroid/graphics/Paint; */
/* .prologue */
/* const v4, 0x43d58000 # 427.0f */
/* .line 514 */
v1 = this.mBmpScoreBoard;
/* const/high16 v2, 0x42300000 # 44.0f */
/* const/high16 v3, 0x43c80000 # 400.0f */
(( android.graphics.Canvas ) p1 ).drawBitmap ( v1, v2, v3, p2 ); // invoke-virtual {p1, v1, v2, v3, p2}, Landroid/graphics/Canvas;->drawBitmap(Landroid/graphics/Bitmap;FFLandroid/graphics/Paint;)V
/* .line 517 */
(( android.graphics.Paint ) p2 ).getTypeface ( ); // invoke-virtual {p2}, Landroid/graphics/Paint;->getTypeface()Landroid/graphics/Typeface;
this.mDefaultFace = v1;
/* .line 519 */
v1 = this.mFace;
(( android.graphics.Paint ) p2 ).setTypeface ( v1 ); // invoke-virtual {p2, v1}, Landroid/graphics/Paint;->setTypeface(Landroid/graphics/Typeface;)Landroid/graphics/Typeface;
/* .line 520 */
/* const v1, -0xff0100 */
(( android.graphics.Paint ) p2 ).setColor ( v1 ); // invoke-virtual {p2, v1}, Landroid/graphics/Paint;->setColor(I)V
/* .line 521 */
/* const/high16 v1, 0x41700000 # 15.0f */
(( android.graphics.Paint ) p2 ).setTextSize ( v1 ); // invoke-virtual {p2, v1}, Landroid/graphics/Paint;->setTextSize(F)V
/* .line 522 */
v1 = this.mGameField;
v1 = (( com.funbox.game.ang.GameField ) v1 ).getScore ( ); // invoke-virtual {v1}, Lcom/funbox/game/ang/GameField;->getScore()I
java.lang.Integer .toString ( v1 );
/* .line 523 */
/* .local v0, "sText":Ljava/lang/String; */
/* const/high16 v1, 0x42e60000 # 115.0f */
(( android.graphics.Canvas ) p1 ).drawText ( v0, v1, v4, p2 ); // invoke-virtual {p1, v0, v1, v4, p2}, Landroid/graphics/Canvas;->drawText(Ljava/lang/String;FFLandroid/graphics/Paint;)V
/* .line 525 */
v1 = this.mGameField;
v1 = (( com.funbox.game.ang.GameField ) v1 ).getLevel ( ); // invoke-virtual {v1}, Lcom/funbox/game/ang/GameField;->getLevel()I
java.lang.Integer .toString ( v1 );
/* .line 526 */
/* const/high16 v1, 0x43780000 # 248.0f */
(( android.graphics.Canvas ) p1 ).drawText ( v0, v1, v4, p2 ); // invoke-virtual {p1, v0, v1, v4, p2}, Landroid/graphics/Canvas;->drawText(Ljava/lang/String;FFLandroid/graphics/Paint;)V
/* .line 530 */
return;
} // .end method
private Integer getAnimalBmpIdByStatus ( Integer p0, Integer p1 ) {
/* .locals 3 */
/* .param p1, "orgId" # I */
/* .param p2, "status" # I */
/* .prologue */
int v2 = 1; // const/4 v2, 0x1
/* .line 715 */
/* const v0, 0x7f020045 */
/* .line 717 */
/* .local v0, "resId":I */
/* const v1, 0x7f020043 */
/* if-ne p1, v1, :cond_2 */
/* .line 718 */
/* if-ne p2, v2, :cond_1 */
/* const v1, 0x7f020045 */
/* move v0, v1 */
/* .line 724 */
} // :cond_0
} // :goto_0
/* .line 718 */
} // :cond_1
/* const v1, 0x7f020044 */
/* move v0, v1 */
/* .line 719 */
} // :cond_2
/* const v1, 0x7f020046 */
/* if-ne p1, v1, :cond_4 */
/* .line 720 */
/* if-ne p2, v2, :cond_3 */
/* const v1, 0x7f020048 */
/* move v0, v1 */
} // :goto_1
} // :cond_3
/* const v1, 0x7f020047 */
/* move v0, v1 */
/* .line 721 */
} // :cond_4
/* const v1, 0x7f020049 */
/* if-ne p1, v1, :cond_0 */
/* .line 722 */
/* if-ne p2, v2, :cond_5 */
/* const v1, 0x7f02004b */
/* move v0, v1 */
} // :goto_2
} // :cond_5
/* const v1, 0x7f02004a */
/* move v0, v1 */
} // .end method
private Integer getAnimalBmpIdByType ( com.funbox.game.ang.Animal$ANIMAL_TYPE p0 ) {
/* .locals 4 */
/* .param p1, "at" # Lcom/funbox/game/ang/Animal$ANIMAL_TYPE; */
/* .prologue */
/* .line 691 */
v2 = com.funbox.game.ang.Animal$ANIMAL_TYPE.AT_FLOWER;
/* if-ne p1, v2, :cond_0 */
/* .line 692 */
/* const v1, 0x7f02001d */
/* .line 711 */
/* .local v1, "resId":I */
} // :goto_0
/* .line 693 */
} // .end local v1 # "resId":I
} // :cond_0
v2 = com.funbox.game.ang.Animal$ANIMAL_TYPE.AT_BOMB;
/* if-ne p1, v2, :cond_1 */
/* .line 694 */
/* const v1, 0x7f020007 */
/* .restart local v1 # "resId":I */
/* .line 695 */
} // .end local v1 # "resId":I
} // :cond_1
v2 = com.funbox.game.ang.Animal$ANIMAL_TYPE.AT_FIRE;
/* if-ne p1, v2, :cond_2 */
/* .line 696 */
/* const v1, 0x7f020009 */
/* .restart local v1 # "resId":I */
/* .line 699 */
} // .end local v1 # "resId":I
} // :cond_2
v2 = this.mRand;
int v3 = 3; // const/4 v3, 0x3
v0 = (( java.util.Random ) v2 ).nextInt ( v3 ); // invoke-virtual {v2, v3}, Ljava/util/Random;->nextInt(I)I
/* .line 700 */
/* .local v0, "rd":I */
/* if-nez v0, :cond_3 */
/* .line 701 */
/* const v1, 0x7f020043 */
/* .restart local v1 # "resId":I */
/* .line 703 */
} // .end local v1 # "resId":I
} // :cond_3
int v2 = 1; // const/4 v2, 0x1
/* if-ne v0, v2, :cond_4 */
/* .line 704 */
/* const v1, 0x7f020046 */
/* .restart local v1 # "resId":I */
/* .line 707 */
} // .end local v1 # "resId":I
} // :cond_4
/* const v1, 0x7f020049 */
/* .restart local v1 # "resId":I */
} // .end method
private Integer getAnimalMaxCnt ( ) {
/* .locals 4 */
/* .prologue */
int v3 = 2; // const/4 v3, 0x2
/* .line 745 */
v2 = this.mGameField;
v1 = (( com.funbox.game.ang.GameField ) v2 ).getLevel ( ); // invoke-virtual {v2}, Lcom/funbox/game/ang/GameField;->getLevel()I
/* .line 746 */
/* .local v1, "level":I */
/* if-gt v1, v3, :cond_0 */
/* .line 747 */
int v0 = 1; // const/4 v0, 0x1
/* .line 751 */
/* .local v0, "cnt":I */
} // :goto_0
/* .line 749 */
} // .end local v0 # "cnt":I
} // :cond_0
/* sub-int v2, v1, v3 */
/* div-int/lit8 v2, v2, 0x4 */
/* add-int/lit8 v2, v2, 0x1 */
int v3 = 6; // const/4 v3, 0x6
v0 = java.lang.Math .min ( v2,v3 );
/* .restart local v0 # "cnt":I */
} // .end method
private Integer getAnimalMoveSpeed ( com.funbox.game.ang.Animal$ANIMAL_TYPE p0 ) {
/* .locals 5 */
/* .param p1, "at" # Lcom/funbox/game/ang/Animal$ANIMAL_TYPE; */
/* .prologue */
/* .line 637 */
v3 = com.funbox.game.ang.Animal$ANIMAL_TYPE.AT_BOMB;
/* if-ne p1, v3, :cond_1 */
/* .line 639 */
int v2 = 1; // const/4 v2, 0x1
/* .line 649 */
/* .local v2, "v":I */
} // :cond_0
} // :goto_0
/* .line 641 */
} // .end local v2 # "v":I
} // :cond_1
v3 = this.mGameField;
v0 = (( com.funbox.game.ang.GameField ) v3 ).getLevel ( ); // invoke-virtual {v3}, Lcom/funbox/game/ang/GameField;->getLevel()I
/* .line 642 */
/* .local v0, "level":I */
int v3 = 6; // const/4 v3, 0x6
/* div-int/lit8 v4, v0, 0x5 */
/* add-int/lit8 v4, v4, 0x2 */
v2 = java.lang.Math .min ( v3,v4 );
/* .line 643 */
/* .restart local v2 # "v":I */
int v3 = 5; // const/4 v3, 0x5
/* if-lt v2, v3, :cond_0 */
/* .line 644 */
v3 = this.mRand;
int v4 = 3; // const/4 v4, 0x3
v1 = (( java.util.Random ) v3 ).nextInt ( v4 ); // invoke-virtual {v3, v4}, Ljava/util/Random;->nextInt(I)I
/* .line 645 */
/* .local v1, "rd":I */
/* if-nez v1, :cond_0 */
/* .line 646 */
int v2 = 4; // const/4 v2, 0x4
} // .end method
private com.funbox.game.ang.Animal$ANIMAL_SITE getAnimalSiteByRandom ( ) {
/* .locals 4 */
/* .prologue */
/* .line 389 */
v2 = this.mRand;
/* const/16 v3, 0x9 */
v0 = (( java.util.Random ) v2 ).nextInt ( v3 ); // invoke-virtual {v2, v3}, Ljava/util/Random;->nextInt(I)I
/* .line 392 */
/* .local v0, "idx":I */
/* if-nez v0, :cond_0 */
/* .line 393 */
v1 = com.funbox.game.ang.Animal$ANIMAL_SITE.T1;
/* .line 413 */
/* .local v1, "site":Lcom/funbox/game/ang/Animal$ANIMAL_SITE; */
} // :goto_0
/* .line 394 */
} // .end local v1 # "site":Lcom/funbox/game/ang/Animal$ANIMAL_SITE;
} // :cond_0
int v2 = 1; // const/4 v2, 0x1
/* if-ne v0, v2, :cond_1 */
/* .line 395 */
v1 = com.funbox.game.ang.Animal$ANIMAL_SITE.T2;
/* .restart local v1 # "site":Lcom/funbox/game/ang/Animal$ANIMAL_SITE; */
/* .line 396 */
} // .end local v1 # "site":Lcom/funbox/game/ang/Animal$ANIMAL_SITE;
} // :cond_1
int v2 = 2; // const/4 v2, 0x2
/* if-ne v0, v2, :cond_2 */
/* .line 397 */
v1 = com.funbox.game.ang.Animal$ANIMAL_SITE.T3;
/* .restart local v1 # "site":Lcom/funbox/game/ang/Animal$ANIMAL_SITE; */
/* .line 398 */
} // .end local v1 # "site":Lcom/funbox/game/ang/Animal$ANIMAL_SITE;
} // :cond_2
int v2 = 3; // const/4 v2, 0x3
/* if-ne v0, v2, :cond_3 */
/* .line 399 */
v1 = com.funbox.game.ang.Animal$ANIMAL_SITE.M1;
/* .restart local v1 # "site":Lcom/funbox/game/ang/Animal$ANIMAL_SITE; */
/* .line 400 */
} // .end local v1 # "site":Lcom/funbox/game/ang/Animal$ANIMAL_SITE;
} // :cond_3
int v2 = 4; // const/4 v2, 0x4
/* if-ne v0, v2, :cond_4 */
/* .line 401 */
v1 = com.funbox.game.ang.Animal$ANIMAL_SITE.M2;
/* .restart local v1 # "site":Lcom/funbox/game/ang/Animal$ANIMAL_SITE; */
/* .line 402 */
} // .end local v1 # "site":Lcom/funbox/game/ang/Animal$ANIMAL_SITE;
} // :cond_4
int v2 = 5; // const/4 v2, 0x5
/* if-ne v0, v2, :cond_5 */
/* .line 403 */
v1 = com.funbox.game.ang.Animal$ANIMAL_SITE.M3;
/* .restart local v1 # "site":Lcom/funbox/game/ang/Animal$ANIMAL_SITE; */
/* .line 404 */
} // .end local v1 # "site":Lcom/funbox/game/ang/Animal$ANIMAL_SITE;
} // :cond_5
int v2 = 6; // const/4 v2, 0x6
/* if-ne v0, v2, :cond_6 */
/* .line 405 */
v1 = com.funbox.game.ang.Animal$ANIMAL_SITE.B1;
/* .restart local v1 # "site":Lcom/funbox/game/ang/Animal$ANIMAL_SITE; */
/* .line 406 */
} // .end local v1 # "site":Lcom/funbox/game/ang/Animal$ANIMAL_SITE;
} // :cond_6
int v2 = 7; // const/4 v2, 0x7
/* if-ne v0, v2, :cond_7 */
/* .line 407 */
v1 = com.funbox.game.ang.Animal$ANIMAL_SITE.B2;
/* .restart local v1 # "site":Lcom/funbox/game/ang/Animal$ANIMAL_SITE; */
/* .line 408 */
} // .end local v1 # "site":Lcom/funbox/game/ang/Animal$ANIMAL_SITE;
} // :cond_7
/* const/16 v2, 0x8 */
/* if-ne v0, v2, :cond_8 */
/* .line 409 */
v1 = com.funbox.game.ang.Animal$ANIMAL_SITE.B3;
/* .restart local v1 # "site":Lcom/funbox/game/ang/Animal$ANIMAL_SITE; */
/* .line 411 */
} // .end local v1 # "site":Lcom/funbox/game/ang/Animal$ANIMAL_SITE;
} // :cond_8
v1 = com.funbox.game.ang.Animal$ANIMAL_SITE.M2;
/* .restart local v1 # "site":Lcom/funbox/game/ang/Animal$ANIMAL_SITE; */
} // .end method
private android.graphics.Bitmap getBitmapByResId ( Integer p0 ) {
/* .locals 3 */
/* .param p1, "resId" # I */
/* .prologue */
/* .line 184 */
(( com.funbox.game.ang.GameView ) p0 ).getResources ( ); // invoke-virtual {p0}, Lcom/funbox/game/ang/GameView;->getResources()Landroid/content/res/Resources;
/* .line 185 */
/* .local v1, "res":Landroid/content/res/Resources; */
(( android.content.res.Resources ) v1 ).getDrawable ( p1 ); // invoke-virtual {v1, p1}, Landroid/content/res/Resources;->getDrawable(I)Landroid/graphics/drawable/Drawable;
/* check-cast v0, Landroid/graphics/drawable/BitmapDrawable; */
/* .line 186 */
/* .local v0, "bmpDraw":Landroid/graphics/drawable/BitmapDrawable; */
(( android.graphics.drawable.BitmapDrawable ) v0 ).getBitmap ( ); // invoke-virtual {v0}, Landroid/graphics/drawable/BitmapDrawable;->getBitmap()Landroid/graphics/Bitmap;
} // .end method
private Boolean isCreateAnimalByRandom ( Long p0 ) {
/* .locals 6 */
/* .param p1, "lastTime" # J */
/* .prologue */
/* .line 729 */
/* const/16 v2, 0x12c */
/* const/16 v3, 0x5dc */
v4 = this.mGameField;
v4 = (( com.funbox.game.ang.GameField ) v4 ).getLevel ( ); // invoke-virtual {v4}, Lcom/funbox/game/ang/GameField;->getLevel()I
/* mul-int/lit8 v4, v4, 0x64 */
/* sub-int/2addr v3, v4 */
v0 = java.lang.Math .max ( v2,v3 );
/* .line 730 */
/* .local v0, "createTime":I */
java.lang.System .currentTimeMillis ( );
/* move-result-wide v2 */
/* sub-long/2addr v2, p1 */
/* int-to-long v4, v0 */
/* cmp-long v2, v2, v4 */
/* if-ltz v2, :cond_0 */
/* .line 732 */
v2 = this.mRand;
int v3 = 3; // const/4 v3, 0x3
v1 = (( java.util.Random ) v2 ).nextInt ( v3 ); // invoke-virtual {v2, v3}, Ljava/util/Random;->nextInt(I)I
/* .line 733 */
/* .local v1, "rd":I */
/* if-nez v1, :cond_0 */
/* .line 734 */
int v2 = 1; // const/4 v2, 0x1
/* .line 737 */
} // .end local v1 # "rd":I
} // :goto_0
} // :cond_0
int v2 = 0; // const/4 v2, 0x0
} // .end method
/* # virtual methods */
public Boolean doSingleTapUp ( Float p0, Float p1 ) {
/* .locals 12 */
/* .param p1, "x" # F */
/* .param p2, "y" # F */
/* .prologue */
/* const/16 v11, 0x14 */
int v10 = 3; // const/4 v10, 0x3
/* .line 435 */
int v2 = 0; // const/4 v2, 0x0
/* .line 436 */
/* .local v2, "bResult":Z */
int v7 = 0; // const/4 v7, 0x0
/* .local v7, "i":I */
} // :goto_0
v8 = this.mAnimalManager;
(( java.lang.Object ) v8 ).getClass ( ); // invoke-virtual {v8}, Ljava/lang/Object;->getClass()Ljava/lang/Class;
/* const/16 v8, 0x9 */
/* if-lt v7, v8, :cond_0 */
/* move v3, v2 */
/* .line 508 */
} // .end local v2 # "bResult":Z
/* .local v3, "bResult":I */
} // :goto_1
/* .line 437 */
} // .end local v3 # "bResult":I
/* .restart local v2 # "bResult":Z */
} // :cond_0
v8 = this.mAnimalManager;
(( com.funbox.game.ang.AnimalManager ) v8 ).getAnimal ( v7 ); // invoke-virtual {v8, v7}, Lcom/funbox/game/ang/AnimalManager;->getAnimal(I)Lcom/funbox/game/ang/Animal;
/* .line 438 */
/* .local v0, "animal":Lcom/funbox/game/ang/Animal; */
v8 = (( com.funbox.game.ang.Animal ) v0 ).getAlive ( ); // invoke-virtual {v0}, Lcom/funbox/game/ang/Animal;->getAlive()Z
/* if-nez v8, :cond_2 */
/* .line 436 */
} // :cond_1
} // :goto_2
/* add-int/lit8 v7, v7, 0x1 */
/* .line 441 */
} // :cond_2
/* float-to-int v8, p1 */
/* float-to-int v9, p2 */
v8 = (( com.funbox.game.ang.Animal ) v0 ).isClickOk ( v8, v9 ); // invoke-virtual {v0, v8, v9}, Lcom/funbox/game/ang/Animal;->isClickOk(II)Z
if ( v8 != null) { // if-eqz v8, :cond_1
/* .line 442 */
int v2 = 1; // const/4 v2, 0x1
/* .line 444 */
(( com.funbox.game.ang.Animal ) v0 ).setHit ( ); // invoke-virtual {v0}, Lcom/funbox/game/ang/Animal;->setHit()V
/* .line 447 */
(( com.funbox.game.ang.Animal ) v0 ).getType ( ); // invoke-virtual {v0}, Lcom/funbox/game/ang/Animal;->getType()Lcom/funbox/game/ang/Animal$ANIMAL_TYPE;
/* .line 448 */
/* .local v1, "at":Lcom/funbox/game/ang/Animal$ANIMAL_TYPE; */
v8 = com.funbox.game.ang.Animal$ANIMAL_TYPE.AT_BOMB;
/* if-eq v1, v8, :cond_3 */
v8 = com.funbox.game.ang.Animal$ANIMAL_TYPE.AT_FIRE;
/* if-ne v1, v8, :cond_5 */
/* .line 450 */
} // :cond_3
(( com.funbox.game.ang.Animal ) v0 ).End ( ); // invoke-virtual {v0}, Lcom/funbox/game/ang/Animal;->End()V
/* .line 454 */
v8 = com.funbox.game.ang.Animal$ANIMAL_TYPE.AT_BOMB;
/* if-ne v1, v8, :cond_4 */
/* .line 455 */
v5 = com.funbox.game.ang.BombEffects$EFFECTS_TYPE.ET_BOMB;
/* .line 459 */
/* .local v5, "et":Lcom/funbox/game/ang/BombEffects$EFFECTS_TYPE; */
} // :goto_3
v8 = this.mBombEffects;
(( com.funbox.game.ang.BombEffects ) v8 ).start ( v5 ); // invoke-virtual {v8, v5}, Lcom/funbox/game/ang/BombEffects;->start(Lcom/funbox/game/ang/BombEffects$EFFECTS_TYPE;)V
/* .line 460 */
(( com.funbox.game.ang.GameView ) p0 ).mySleep ( v11 ); // invoke-virtual {p0, v11}, Lcom/funbox/game/ang/GameView;->mySleep(I)V
/* .line 463 */
v8 = this.mMain;
v9 = this.mMain;
v9 = this.mGameSound;
(( java.lang.Object ) v9 ).getClass ( ); // invoke-virtual {v9}, Ljava/lang/Object;->getClass()Ljava/lang/Class;
/* const/16 v9, 0xa */
(( com.funbox.game.ang.Main ) v8 ).playSP ( v9 ); // invoke-virtual {v8, v9}, Lcom/funbox/game/ang/Main;->playSP(I)V
/* .line 465 */
v8 = this.mMain;
(( com.funbox.game.ang.Main ) v8 ).playVibrate ( ); // invoke-virtual {v8}, Lcom/funbox/game/ang/Main;->playVibrate()V
/* .line 468 */
/* invoke-direct {p0}, Lcom/funbox/game/ang/GameView;->bombAllAnimals()V */
/* .line 470 */
/* const/16 v8, 0x1e */
(( com.funbox.game.ang.GameView ) p0 ).mySleep ( v8 ); // invoke-virtual {p0, v8}, Lcom/funbox/game/ang/GameView;->mySleep(I)V
/* .line 472 */
v8 = this.mMain;
v9 = this.mMain;
v9 = this.mGameSound;
(( java.lang.Object ) v9 ).getClass ( ); // invoke-virtual {v9}, Ljava/lang/Object;->getClass()Ljava/lang/Class;
(( com.funbox.game.ang.Main ) v8 ).playSP ( v10 ); // invoke-virtual {v8, v10}, Lcom/funbox/game/ang/Main;->playSP(I)V
/* move v3, v2 */
/* .line 474 */
/* .restart local v3 # "bResult":I */
/* .line 457 */
} // .end local v3 # "bResult":I
} // .end local v5 # "et":Lcom/funbox/game/ang/BombEffects$EFFECTS_TYPE;
} // :cond_4
v5 = com.funbox.game.ang.BombEffects$EFFECTS_TYPE.ET_FIRE;
/* .restart local v5 # "et":Lcom/funbox/game/ang/BombEffects$EFFECTS_TYPE; */
/* .line 475 */
} // .end local v5 # "et":Lcom/funbox/game/ang/BombEffects$EFFECTS_TYPE;
} // :cond_5
v8 = com.funbox.game.ang.Animal$ANIMAL_TYPE.AT_RABBIT;
/* if-ne v1, v8, :cond_7 */
/* .line 477 */
v8 = (( com.funbox.game.ang.Animal ) v0 ).getBmpId ( ); // invoke-virtual {v0}, Lcom/funbox/game/ang/Animal;->getBmpId()I
int v9 = 1; // const/4 v9, 0x1
v6 = /* invoke-direct {p0, v8, v9}, Lcom/funbox/game/ang/GameView;->getAnimalBmpIdByStatus(II)I */
/* .line 478 */
/* .local v6, "hitId":I */
/* invoke-direct {p0, v6}, Lcom/funbox/game/ang/GameView;->getBitmapByResId(I)Landroid/graphics/Bitmap; */
/* .line 482 */
} // .end local v6 # "hitId":I
/* .local v4, "bmp":Landroid/graphics/Bitmap; */
} // :goto_4
(( com.funbox.game.ang.Animal ) v0 ).setBmp ( v4 ); // invoke-virtual {v0, v4}, Lcom/funbox/game/ang/Animal;->setBmp(Landroid/graphics/Bitmap;)V
/* .line 484 */
v8 = com.funbox.game.ang.Animal$ANIMAL_TYPE.AT_RABBIT;
/* if-ne v1, v8, :cond_8 */
/* .line 486 */
v8 = this.mGameField;
(( com.funbox.game.ang.GameField ) v8 ).addScore ( ); // invoke-virtual {v8}, Lcom/funbox/game/ang/GameField;->addScore()V
/* .line 496 */
} // :cond_6
} // :goto_5
v8 = this.mMain;
v9 = this.mMain;
v9 = this.mGameSound;
(( java.lang.Object ) v9 ).getClass ( ); // invoke-virtual {v9}, Ljava/lang/Object;->getClass()Ljava/lang/Class;
int v9 = 2; // const/4 v9, 0x2
(( com.funbox.game.ang.Main ) v8 ).playSP ( v9 ); // invoke-virtual {v8, v9}, Lcom/funbox/game/ang/Main;->playSP(I)V
/* .line 497 */
(( com.funbox.game.ang.GameView ) p0 ).mySleep ( v11 ); // invoke-virtual {p0, v11}, Lcom/funbox/game/ang/GameView;->mySleep(I)V
/* .line 500 */
v8 = this.mMain;
(( com.funbox.game.ang.Main ) v8 ).playVibrate ( ); // invoke-virtual {v8}, Lcom/funbox/game/ang/Main;->playVibrate()V
/* .line 503 */
(( com.funbox.game.ang.Animal ) v0 ).getType ( ); // invoke-virtual {v0}, Lcom/funbox/game/ang/Animal;->getType()Lcom/funbox/game/ang/Animal$ANIMAL_TYPE;
v9 = com.funbox.game.ang.Animal$ANIMAL_TYPE.AT_RABBIT;
/* if-ne v8, v9, :cond_1 */
/* .line 504 */
v8 = this.mMain;
v9 = this.mMain;
v9 = this.mGameSound;
(( java.lang.Object ) v9 ).getClass ( ); // invoke-virtual {v9}, Ljava/lang/Object;->getClass()Ljava/lang/Class;
(( com.funbox.game.ang.Main ) v8 ).playSP ( v10 ); // invoke-virtual {v8, v10}, Lcom/funbox/game/ang/Main;->playSP(I)V
/* goto/16 :goto_2 */
/* .line 480 */
} // .end local v4 # "bmp":Landroid/graphics/Bitmap;
} // :cond_7
/* const v8, 0x7f02001e */
/* invoke-direct {p0, v8}, Lcom/funbox/game/ang/GameView;->getBitmapByResId(I)Landroid/graphics/Bitmap; */
/* .restart local v4 # "bmp":Landroid/graphics/Bitmap; */
/* .line 489 */
} // :cond_8
v8 = this.mGameField;
v8 = (( com.funbox.game.ang.GameField ) v8 ).decLife ( ); // invoke-virtual {v8}, Lcom/funbox/game/ang/GameField;->decLife()Z
/* if-nez v8, :cond_6 */
/* .line 491 */
v8 = this.mGameField;
v9 = com.funbox.game.ang.GameField$GAME_STATUS.GS_GAMEOVER;
(( com.funbox.game.ang.GameField ) v8 ).setStatus ( v9 ); // invoke-virtual {v8, v9}, Lcom/funbox/game/ang/GameField;->setStatus(Lcom/funbox/game/ang/GameField$GAME_STATUS;)V
} // .end method
public void exitGame ( ) {
/* .locals 2 */
/* .prologue */
/* .line 126 */
int v0 = 1; // const/4 v0, 0x1
/* .line 128 */
/* .local v0, "bResult":Z */
int v1 = 0; // const/4 v1, 0x0
/* iput-boolean v1, p0, Lcom/funbox/game/ang/GameView;->mRunning:Z */
/* .line 130 */
v1 = this.mThread;
if ( v1 != null) { // if-eqz v1, :cond_1
/* .line 131 */
} // :cond_0
} // :goto_0
/* if-nez v0, :cond_2 */
/* .line 142 */
} // :cond_1
return;
/* .line 133 */
} // :cond_2
try { // :try_start_0
v1 = this.mThread;
if ( v1 != null) { // if-eqz v1, :cond_0
/* .line 134 */
v1 = this.mThread;
(( java.lang.Thread ) v1 ).join ( ); // invoke-virtual {v1}, Ljava/lang/Thread;->join()V
/* :try_end_0 */
/* .catch Ljava/lang/InterruptedException; {:try_start_0 ..:try_end_0} :catch_0 */
/* .line 135 */
int v0 = 0; // const/4 v0, 0x0
/* .line 137 */
/* :catch_0 */
/* move-exception v1 */
} // .end method
public void initGame ( ) {
/* .locals 1 */
/* .prologue */
/* .line 122 */
/* new-instance v0, Lcom/funbox/game/ang/BombEffects; */
/* invoke-direct {v0}, Lcom/funbox/game/ang/BombEffects;-><init>()V */
this.mBombEffects = v0;
/* .line 123 */
return;
} // .end method
public void mySleep ( Integer p0 ) {
/* .locals 2 */
/* .param p1, "t" # I */
/* .prologue */
/* .line 422 */
/* int-to-long v0, p1 */
try { // :try_start_0
java.lang.Thread .sleep ( v0,v1 );
/* :try_end_0 */
/* .catch Ljava/lang/Exception; {:try_start_0 ..:try_end_0} :catch_0 */
/* .line 426 */
} // :goto_0
return;
/* .line 423 */
/* :catch_0 */
/* move-exception v0 */
} // .end method
public void setActivity ( android.app.Activity p0 ) {
/* .locals 0 */
/* .param p1, "a" # Landroid/app/Activity; */
/* .prologue */
/* .line 118 */
/* check-cast p1, Lcom/funbox/game/ang/Main; */
} // .end local p1 # "a":Landroid/app/Activity;
this.mMain = p1;
/* .line 119 */
return;
} // .end method
public void setRunning ( Boolean p0 ) {
/* .locals 0 */
/* .param p1, "isRunning" # Z */
/* .prologue */
/* .line 417 */
/* iput-boolean p1, p0, Lcom/funbox/game/ang/GameView;->mRunning:Z */
/* .line 418 */
return;
} // .end method
public void surfaceChanged ( android.view.SurfaceHolder p0, Integer p1, Integer p2, Integer p3 ) {
/* .locals 2 */
/* .param p1, "holder" # Landroid/view/SurfaceHolder; */
/* .param p2, "format" # I */
/* .param p3, "width" # I */
/* .param p4, "height" # I */
/* .prologue */
/* .line 146 */
final String v0 = "GameView"; // const-string v0, "GameView"
final String v1 = "surfaceChanged() ...is called"; // const-string v1, "surfaceChanged() ...is called"
android.util.Log .v ( v0,v1 );
/* .line 147 */
/* .line 148 */
return;
} // .end method
public void surfaceCreated ( android.view.SurfaceHolder p0 ) {
/* .locals 2 */
/* .param p1, "holder" # Landroid/view/SurfaceHolder; */
/* .prologue */
/* .line 151 */
final String v0 = "GameView"; // const-string v0, "GameView"
final String v1 = "surfaceCreated(): mTrhead.start()"; // const-string v1, "surfaceCreated(): mTrhead.start()"
android.util.Log .v ( v0,v1 );
/* .line 153 */
v0 = this.mThread;
/* if-nez v0, :cond_0 */
/* .line 154 */
int v0 = 1; // const/4 v0, 0x1
/* iput-boolean v0, p0, Lcom/funbox/game/ang/GameView;->mRunning:Z */
/* .line 156 */
v0 = this.mGameField;
v1 = com.funbox.game.ang.GameField$GAME_STATUS.GS_READY;
(( com.funbox.game.ang.GameField ) v0 ).setStatus ( v1 ); // invoke-virtual {v0, v1}, Lcom/funbox/game/ang/GameField;->setStatus(Lcom/funbox/game/ang/GameField$GAME_STATUS;)V
/* .line 158 */
/* new-instance v0, Ljava/lang/Thread; */
/* new-instance v1, Lcom/funbox/game/ang/GameView$MyThread; */
/* invoke-direct {v1, p0}, Lcom/funbox/game/ang/GameView$MyThread;-><init>(Lcom/funbox/game/ang/GameView;)V */
/* invoke-direct {v0, v1}, Ljava/lang/Thread;-><init>(Ljava/lang/Runnable;)V */
this.mThread = v0;
/* .line 159 */
v0 = this.mThread;
(( java.lang.Thread ) v0 ).start ( ); // invoke-virtual {v0}, Ljava/lang/Thread;->start()V
/* .line 161 */
} // :cond_0
return;
} // .end method
public void surfaceDestroyed ( android.view.SurfaceHolder p0 ) {
/* .locals 3 */
/* .param p1, "holder" # Landroid/view/SurfaceHolder; */
/* .prologue */
/* .line 164 */
final String v1 = "GameView"; // const-string v1, "GameView"
final String v2 = "surfaceDestroyed(): mThread.stop()"; // const-string v2, "surfaceDestroyed(): mThread.stop()"
android.util.Log .v ( v1,v2 );
/* .line 166 */
int v0 = 1; // const/4 v0, 0x1
/* .line 167 */
/* .local v0, "bResult":Z */
int v1 = 0; // const/4 v1, 0x0
/* iput-boolean v1, p0, Lcom/funbox/game/ang/GameView;->mRunning:Z */
/* .line 169 */
} // :goto_0
/* if-nez v0, :cond_0 */
/* .line 180 */
int v1 = 0; // const/4 v1, 0x0
this.mThread = v1;
/* .line 181 */
return;
/* .line 171 */
} // :cond_0
try { // :try_start_0
v1 = this.mThread;
if ( v1 != null) { // if-eqz v1, :cond_1
/* .line 172 */
v1 = this.mThread;
(( java.lang.Thread ) v1 ).join ( ); // invoke-virtual {v1}, Ljava/lang/Thread;->join()V
/* :try_end_0 */
/* .catch Ljava/lang/InterruptedException; {:try_start_0 ..:try_end_0} :catch_0 */
/* .line 174 */
} // :cond_1
int v0 = 0; // const/4 v0, 0x0
/* .line 175 */
/* :catch_0 */
/* move-exception v1 */
} // .end method
