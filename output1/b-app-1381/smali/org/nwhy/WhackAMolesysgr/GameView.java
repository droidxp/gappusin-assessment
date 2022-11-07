public class org.nwhy.WhackAMolesysgr.GameView extends android.view.View {
	 /* .source "GameView.java" */
	 /* # static fields */
	 private static java.util.Random random;
	 static org.nwhy.WhackAMolesysgr.GameView self;
	 /* # instance fields */
	 private final Integer MID_CLICK;
	 private final Integer MID_HIT;
	 private final Integer MID_SUCCESS;
	 java.lang.Runnable flush1000ms;
	 java.lang.Runnable flush80ms;
	 private java.util.List holeQuite;
	 /* .annotation system Ldalvik/annotation/Signature; */
	 /* value = { */
	 /* "Ljava/util/List", */
	 /* "<", */
	 /* "Lorg/nwhy/WhackAMolesysgr/Pic;", */
	 /* ">;" */
	 /* } */
} // .end annotation
} // .end field
public Integer hp;
private Boolean isMute;
private org.nwhy.WhackAMolesysgr.CMIDIPlayer mCMIDIPlayer;
private android.content.Context mContext;
private Integer mGoal;
private Boolean pauseFlag;
private Integer score;
private android.content.SharedPreferences settings;
private Integer stageID;
/* # direct methods */
static org.nwhy.WhackAMolesysgr.GameView ( ) {
/* .locals 1 */
/* .prologue */
/* .line 20 */
/* new-instance v0, Ljava/util/Random; */
/* invoke-direct {v0}, Ljava/util/Random;-><init>()V */
/* .line 18 */
return;
} // .end method
public org.nwhy.WhackAMolesysgr.GameView ( ) {
/* .locals 8 */
/* .param p1, "context" # Landroid/content/Context; */
/* .prologue */
/* const/16 v7, 0x9 */
int v6 = 2; // const/4 v6, 0x2
int v5 = 1; // const/4 v5, 0x1
int v4 = 0; // const/4 v4, 0x0
/* .line 37 */
/* invoke-direct {p0, p1}, Landroid/view/View;-><init>(Landroid/content/Context;)V */
/* .line 30 */
/* iput v4, p0, Lorg/nwhy/WhackAMolesysgr/GameView;->MID_CLICK:I */
/* .line 31 */
/* iput v5, p0, Lorg/nwhy/WhackAMolesysgr/GameView;->MID_HIT:I */
/* .line 32 */
/* iput v6, p0, Lorg/nwhy/WhackAMolesysgr/GameView;->MID_SUCCESS:I */
/* .line 75 */
/* new-instance v2, Ljava/util/ArrayList; */
/* invoke-direct {v2, v7}, Ljava/util/ArrayList;-><init>(I)V */
this.holeQuite = v2;
/* .line 77 */
int v1 = 0; // const/4 v1, 0x0
/* .local v1, "i":I */
} // :goto_0
/* if-lt v1, v7, :cond_0 */
/* .line 164 */
/* new-instance v2, Lorg/nwhy/WhackAMolesysgr/GameView$1; */
/* invoke-direct {v2, p0}, Lorg/nwhy/WhackAMolesysgr/GameView$1;-><init>(Lorg/nwhy/WhackAMolesysgr/GameView;)V */
this.flush80ms = v2;
/* .line 171 */
/* new-instance v2, Lorg/nwhy/WhackAMolesysgr/GameView$2; */
/* invoke-direct {v2, p0}, Lorg/nwhy/WhackAMolesysgr/GameView$2;-><init>(Lorg/nwhy/WhackAMolesysgr/GameView;)V */
this.flush1000ms = v2;
/* .line 38 */
/* .line 39 */
this.mContext = p1;
/* .line 41 */
/* move-object v0, p1 */
/* check-cast v0, Lorg/nwhy/WhackAMolesysgr/Game; */
/* move-object v2, v0 */
final String v3 = "org.nwhy.WhackAMole"; // const-string v3, "org.nwhy.WhackAMole"
(( org.nwhy.WhackAMolesysgr.Game ) v2 ).getSharedPreferences ( v3, v4 ); // invoke-virtual {v2, v3, v4}, Lorg/nwhy/WhackAMolesysgr/Game;->getSharedPreferences(Ljava/lang/String;I)Landroid/content/SharedPreferences;
this.settings = v2;
/* .line 42 */
v2 = this.settings;
v2 = final String v3 = "saveStageID"; // const-string v3, "saveStageID"
/* iput v2, p0, Lorg/nwhy/WhackAMolesysgr/GameView;->stageID:I */
/* .line 44 */
/* new-instance v2, Lorg/nwhy/WhackAMolesysgr/CMIDIPlayer; */
/* invoke-direct {v2, p1}, Lorg/nwhy/WhackAMolesysgr/CMIDIPlayer;-><init>(Landroid/content/Context;)V */
this.mCMIDIPlayer = v2;
/* .line 45 */
v2 = this.mCMIDIPlayer;
/* const/high16 v3, 0x7f050000 */
(( org.nwhy.WhackAMolesysgr.CMIDIPlayer ) v2 ).loadSfx ( v3, v4 ); // invoke-virtual {v2, v3, v4}, Lorg/nwhy/WhackAMolesysgr/CMIDIPlayer;->loadSfx(II)V
/* .line 46 */
v2 = this.mCMIDIPlayer;
/* const v3, 0x7f050001 */
(( org.nwhy.WhackAMolesysgr.CMIDIPlayer ) v2 ).loadSfx ( v3, v5 ); // invoke-virtual {v2, v3, v5}, Lorg/nwhy/WhackAMolesysgr/CMIDIPlayer;->loadSfx(II)V
/* .line 47 */
v2 = this.mCMIDIPlayer;
/* const v3, 0x7f050002 */
(( org.nwhy.WhackAMolesysgr.CMIDIPlayer ) v2 ).loadSfx ( v3, v6 ); // invoke-virtual {v2, v3, v6}, Lorg/nwhy/WhackAMolesysgr/CMIDIPlayer;->loadSfx(II)V
/* .line 48 */
v2 = this.flush80ms;
/* const-wide/16 v3, 0x50 */
(( org.nwhy.WhackAMolesysgr.GameView ) p0 ).postDelayed ( v2, v3, v4 ); // invoke-virtual {p0, v2, v3, v4}, Lorg/nwhy/WhackAMolesysgr/GameView;->postDelayed(Ljava/lang/Runnable;J)Z
/* .line 49 */
/* invoke-direct {p0}, Lorg/nwhy/WhackAMolesysgr/GameView;->newGame()V */
/* .line 50 */
return;
/* .line 78 */
} // :cond_0
v2 = this.holeQuite;
/* new-instance v3, Lorg/nwhy/WhackAMolesysgr/Pic; */
/* invoke-direct {v3}, Lorg/nwhy/WhackAMolesysgr/Pic;-><init>()V */
/* .line 77 */
/* add-int/lit8 v1, v1, 0x1 */
} // .end method
static java.util.List access$0 ( org.nwhy.WhackAMolesysgr.GameView p0 ) { //synthethic
/* .locals 1 */
/* .prologue */
/* .line 75 */
v0 = this.holeQuite;
} // .end method
static java.util.Random access$1 ( ) { //synthethic
/* .locals 1 */
/* .prologue */
/* .line 20 */
v0 = org.nwhy.WhackAMolesysgr.GameView.random;
} // .end method
static void access$2 ( org.nwhy.WhackAMolesysgr.GameView p0, Integer p1 ) { //synthethic
/* .locals 0 */
/* .prologue */
/* .line 230 */
/* invoke-direct {p0, p1}, Lorg/nwhy/WhackAMolesysgr/GameView;->playSound(I)V */
return;
} // .end method
static Integer access$3 ( org.nwhy.WhackAMolesysgr.GameView p0 ) { //synthethic
/* .locals 1 */
/* .prologue */
/* .line 27 */
/* iget v0, p0, Lorg/nwhy/WhackAMolesysgr/GameView;->stageID:I */
} // .end method
private void doWiGameThing ( ) {
/* .locals 8 */
/* .prologue */
/* const/16 v7, 0x28 */
/* const/16 v6, 0x1e */
/* const/16 v5, 0x14 */
/* const/16 v4, 0xa */
/* .line 126 */
final String v0 = "d69ea7d5cdfb3516"; // const-string v0, "d69ea7d5cdfb3516"
/* iget v1, p0, Lorg/nwhy/WhackAMolesysgr/GameView;->stageID:I */
int v2 = 0; // const/4 v2, 0x0
int v3 = 1; // const/4 v3, 0x1
com.wiyun.game.WiGame .submitScore ( v0,v1,v2,v3 );
/* .line 128 */
/* iget v0, p0, Lorg/nwhy/WhackAMolesysgr/GameView;->stageID:I */
/* if-ge v0, v4, :cond_1 */
/* .line 129 */
final String v0 = "b7fab3056f2928a1"; // const-string v0, "b7fab3056f2928a1"
com.wiyun.game.WiGame .unlockAchievement ( v0 );
/* .line 139 */
} // :cond_0
} // :goto_0
return;
/* .line 130 */
} // :cond_1
/* iget v0, p0, Lorg/nwhy/WhackAMolesysgr/GameView;->stageID:I */
/* if-lt v0, v4, :cond_2 */
/* iget v0, p0, Lorg/nwhy/WhackAMolesysgr/GameView;->stageID:I */
/* if-ge v0, v5, :cond_2 */
/* .line 131 */
final String v0 = "2452d5d670a412a0"; // const-string v0, "2452d5d670a412a0"
com.wiyun.game.WiGame .unlockAchievement ( v0 );
/* .line 132 */
} // :cond_2
/* iget v0, p0, Lorg/nwhy/WhackAMolesysgr/GameView;->stageID:I */
/* if-lt v0, v5, :cond_3 */
/* iget v0, p0, Lorg/nwhy/WhackAMolesysgr/GameView;->stageID:I */
/* if-ge v0, v6, :cond_3 */
/* .line 133 */
final String v0 = "3d58054c0faa8fa7"; // const-string v0, "3d58054c0faa8fa7"
com.wiyun.game.WiGame .unlockAchievement ( v0 );
/* .line 134 */
} // :cond_3
/* iget v0, p0, Lorg/nwhy/WhackAMolesysgr/GameView;->stageID:I */
/* if-lt v0, v6, :cond_4 */
/* iget v0, p0, Lorg/nwhy/WhackAMolesysgr/GameView;->stageID:I */
/* if-ge v0, v7, :cond_4 */
/* .line 135 */
final String v0 = "514dd4f75b21f39b"; // const-string v0, "514dd4f75b21f39b"
com.wiyun.game.WiGame .unlockAchievement ( v0 );
/* .line 136 */
} // :cond_4
/* iget v0, p0, Lorg/nwhy/WhackAMolesysgr/GameView;->stageID:I */
/* if-lt v0, v7, :cond_0 */
/* .line 137 */
final String v0 = "e726d4794d8ae970"; // const-string v0, "e726d4794d8ae970"
com.wiyun.game.WiGame .unlockAchievement ( v0 );
} // .end method
private void drawGameOver ( android.graphics.Canvas p0 ) {
/* .locals 8 */
/* .param p1, "canvas" # Landroid/graphics/Canvas; */
/* .prologue */
int v7 = 0; // const/4 v7, 0x0
/* .line 142 */
v1 = org.nwhy.WhackAMolesysgr.ImageManager.bmStateBg;
/* const/high16 v2, 0x43340000 # 180.0f */
/* const/high16 v3, 0x42dc0000 # 110.0f */
(( android.graphics.Canvas ) p1 ).drawBitmap ( v1, v2, v3, v7 ); // invoke-virtual {p1, v1, v2, v3, v7}, Landroid/graphics/Canvas;->drawBitmap(Landroid/graphics/Bitmap;FFLandroid/graphics/Paint;)V
/* .line 143 */
v1 = this.mContext;
/* check-cast v1, Lorg/nwhy/WhackAMolesysgr/Game; */
/* const v2, 0x7f060007 */
(( org.nwhy.WhackAMolesysgr.Game ) v1 ).getString ( v2 ); // invoke-virtual {v1, v2}, Lorg/nwhy/WhackAMolesysgr/Game;->getString(I)Ljava/lang/String;
/* .line 144 */
/* .local v0, "s":Ljava/lang/String; */
/* const/high16 v1, 0x43480000 # 200.0f */
/* const/high16 v2, 0x43090000 # 137.0f */
v3 = org.nwhy.WhackAMolesysgr.PaintSuite.KV4text;
(( android.graphics.Canvas ) p1 ).drawText ( v0, v1, v2, v3 ); // invoke-virtual {p1, v0, v1, v2, v3}, Landroid/graphics/Canvas;->drawText(Ljava/lang/String;FFLandroid/graphics/Paint;)V
/* .line 145 */
v1 = org.nwhy.WhackAMolesysgr.ImageManager.bmStateBg;
/* new-instance v2, Landroid/graphics/Rect; */
/* const/16 v3, 0x7d */
/* const/16 v4, 0xa0 */
/* const/16 v5, 0x17c */
/* .line 146 */
/* const/16 v6, 0xc8 */
/* invoke-direct {v2, v3, v4, v5, v6}, Landroid/graphics/Rect;-><init>(IIII)V */
/* .line 145 */
(( android.graphics.Canvas ) p1 ).drawBitmap ( v1, v7, v2, v7 ); // invoke-virtual {p1, v1, v7, v2, v7}, Landroid/graphics/Canvas;->drawBitmap(Landroid/graphics/Bitmap;Landroid/graphics/Rect;Landroid/graphics/Rect;Landroid/graphics/Paint;)V
/* .line 147 */
p0 = this.mContext;
} // .end local p0 # "this":Lorg/nwhy/WhackAMolesysgr/GameView;
/* check-cast p0, Lorg/nwhy/WhackAMolesysgr/Game; */
/* const v1, 0x7f060009 */
(( org.nwhy.WhackAMolesysgr.Game ) p0 ).getString ( v1 ); // invoke-virtual {p0, v1}, Lorg/nwhy/WhackAMolesysgr/Game;->getString(I)Ljava/lang/String;
/* .line 148 */
/* const/high16 v1, 0x43140000 # 148.0f */
/* const/high16 v2, 0x433b0000 # 187.0f */
v3 = org.nwhy.WhackAMolesysgr.PaintSuite.KV4text;
(( android.graphics.Canvas ) p1 ).drawText ( v0, v1, v2, v3 ); // invoke-virtual {p1, v0, v1, v2, v3}, Landroid/graphics/Canvas;->drawText(Ljava/lang/String;FFLandroid/graphics/Paint;)V
/* .line 149 */
return;
} // .end method
private void drawInfoPanel ( android.graphics.Canvas p0 ) {
/* .locals 4 */
/* .param p1, "canvas" # Landroid/graphics/Canvas; */
/* .prologue */
/* const v3, 0x439a8000 # 309.0f */
/* .line 159 */
/* new-instance v0, Ljava/lang/StringBuilder; */
/* iget v1, p0, Lorg/nwhy/WhackAMolesysgr/GameView;->score:I */
java.lang.String .valueOf ( v1 );
/* invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V */
final String v1 = "/"; // const-string v1, "/"
(( java.lang.StringBuilder ) v0 ).append ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
/* iget v1, p0, Lorg/nwhy/WhackAMolesysgr/GameView;->mGoal:I */
(( java.lang.StringBuilder ) v0 ).append ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v0 ).toString ( ); // invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
/* const/high16 v1, 0x42a00000 # 80.0f */
v2 = org.nwhy.WhackAMolesysgr.PaintSuite.KV4text;
(( android.graphics.Canvas ) p1 ).drawText ( v0, v1, v3, v2 ); // invoke-virtual {p1, v0, v1, v3, v2}, Landroid/graphics/Canvas;->drawText(Ljava/lang/String;FFLandroid/graphics/Paint;)V
/* .line 160 */
/* new-instance v0, Ljava/lang/StringBuilder; */
/* invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V */
/* iget v1, p0, Lorg/nwhy/WhackAMolesysgr/GameView;->stageID:I */
/* add-int/lit8 v1, v1, 0x1 */
(( java.lang.StringBuilder ) v0 ).append ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v0 ).toString ( ); // invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
/* const v1, 0x43b18000 # 355.0f */
v2 = org.nwhy.WhackAMolesysgr.PaintSuite.KV4text;
(( android.graphics.Canvas ) p1 ).drawText ( v0, v1, v3, v2 ); // invoke-virtual {p1, v0, v1, v3, v2}, Landroid/graphics/Canvas;->drawText(Ljava/lang/String;FFLandroid/graphics/Paint;)V
/* .line 161 */
/* new-instance v0, Ljava/lang/StringBuilder; */
/* invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V */
/* iget v1, p0, Lorg/nwhy/WhackAMolesysgr/GameView;->hp:I */
(( java.lang.StringBuilder ) v0 ).append ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v0 ).toString ( ); // invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
/* const/high16 v1, 0x43dc0000 # 440.0f */
v2 = org.nwhy.WhackAMolesysgr.PaintSuite.KV4text;
(( android.graphics.Canvas ) p1 ).drawText ( v0, v1, v3, v2 ); // invoke-virtual {p1, v0, v1, v3, v2}, Landroid/graphics/Canvas;->drawText(Ljava/lang/String;FFLandroid/graphics/Paint;)V
/* .line 162 */
return;
} // .end method
private void drawPausedScreen ( android.graphics.Canvas p0 ) {
/* .locals 8 */
/* .param p1, "canvas" # Landroid/graphics/Canvas; */
/* .prologue */
int v7 = 0; // const/4 v7, 0x0
/* .line 152 */
v1 = org.nwhy.WhackAMolesysgr.ImageManager.bmStateBg;
/* new-instance v2, Landroid/graphics/Rect; */
/* const/16 v3, 0x9b */
/* const/16 v4, 0x96 */
/* const/16 v5, 0x15e */
/* .line 153 */
/* const/16 v6, 0xbe */
/* invoke-direct {v2, v3, v4, v5, v6}, Landroid/graphics/Rect;-><init>(IIII)V */
/* .line 152 */
(( android.graphics.Canvas ) p1 ).drawBitmap ( v1, v7, v2, v7 ); // invoke-virtual {p1, v1, v7, v2, v7}, Landroid/graphics/Canvas;->drawBitmap(Landroid/graphics/Bitmap;Landroid/graphics/Rect;Landroid/graphics/Rect;Landroid/graphics/Paint;)V
/* .line 154 */
p0 = this.mContext;
} // .end local p0 # "this":Lorg/nwhy/WhackAMolesysgr/GameView;
/* check-cast p0, Lorg/nwhy/WhackAMolesysgr/Game; */
/* const v1, 0x7f060008 */
(( org.nwhy.WhackAMolesysgr.Game ) p0 ).getString ( v1 ); // invoke-virtual {p0, v1}, Lorg/nwhy/WhackAMolesysgr/Game;->getString(I)Ljava/lang/String;
/* .line 155 */
/* .local v0, "s":Ljava/lang/String; */
/* const/high16 v1, 0x433e0000 # 190.0f */
/* const/high16 v2, 0x43310000 # 177.0f */
v3 = org.nwhy.WhackAMolesysgr.PaintSuite.KV4text;
(( android.graphics.Canvas ) p1 ).drawText ( v0, v1, v2, v3 ); // invoke-virtual {p1, v0, v1, v2, v3}, Landroid/graphics/Canvas;->drawText(Ljava/lang/String;FFLandroid/graphics/Paint;)V
/* .line 156 */
return;
} // .end method
private void newGame ( ) {
/* .locals 0 */
/* .prologue */
/* .line 64 */
(( org.nwhy.WhackAMolesysgr.GameView ) p0 ).resume ( ); // invoke-virtual {p0}, Lorg/nwhy/WhackAMolesysgr/GameView;->resume()V
/* .line 65 */
/* invoke-direct {p0}, Lorg/nwhy/WhackAMolesysgr/GameView;->resetGame()V */
/* .line 66 */
return;
} // .end method
private void nextLevel ( ) {
/* .locals 1 */
/* .prologue */
/* .line 117 */
int v0 = 2; // const/4 v0, 0x2
/* invoke-direct {p0, v0}, Lorg/nwhy/WhackAMolesysgr/GameView;->playSound(I)V */
/* .line 118 */
/* iget v0, p0, Lorg/nwhy/WhackAMolesysgr/GameView;->stageID:I */
/* add-int/lit8 v0, v0, 0x1 */
/* iput v0, p0, Lorg/nwhy/WhackAMolesysgr/GameView;->stageID:I */
/* .line 119 */
/* iget v0, p0, Lorg/nwhy/WhackAMolesysgr/GameView;->stageID:I */
(( org.nwhy.WhackAMolesysgr.GameView ) p0 ).saveStageInfo ( v0 ); // invoke-virtual {p0, v0}, Lorg/nwhy/WhackAMolesysgr/GameView;->saveStageInfo(I)V
/* .line 121 */
/* invoke-direct {p0}, Lorg/nwhy/WhackAMolesysgr/GameView;->doWiGameThing()V */
/* .line 122 */
/* invoke-direct {p0}, Lorg/nwhy/WhackAMolesysgr/GameView;->resetGame()V */
/* .line 123 */
return;
} // .end method
private void playSound ( Integer p0 ) {
/* .locals 3 */
/* .param p1, "mid_id" # I */
/* .prologue */
/* .line 231 */
v0 = this.settings;
final String v1 = "soundFlag"; // const-string v1, "soundFlag"
v0 = int v2 = 0; // const/4 v2, 0x0
/* iput-boolean v0, p0, Lorg/nwhy/WhackAMolesysgr/GameView;->isMute:Z */
/* .line 232 */
/* iget-boolean v0, p0, Lorg/nwhy/WhackAMolesysgr/GameView;->isMute:Z */
/* if-nez v0, :cond_0 */
/* .line 233 */
v0 = this.mCMIDIPlayer;
(( org.nwhy.WhackAMolesysgr.CMIDIPlayer ) v0 ).play ( p1 ); // invoke-virtual {v0, p1}, Lorg/nwhy/WhackAMolesysgr/CMIDIPlayer;->play(I)V
/* .line 235 */
} // :cond_0
return;
} // .end method
private void resetGame ( ) {
/* .locals 1 */
/* .prologue */
int v0 = 0; // const/4 v0, 0x0
/* .line 69 */
/* iput-boolean v0, p0, Lorg/nwhy/WhackAMolesysgr/GameView;->pauseFlag:Z */
/* .line 70 */
/* iput v0, p0, Lorg/nwhy/WhackAMolesysgr/GameView;->score:I */
/* .line 71 */
/* iget v0, p0, Lorg/nwhy/WhackAMolesysgr/GameView;->stageID:I */
/* mul-int/lit8 v0, v0, 0x2 */
/* add-int/lit8 v0, v0, 0x5 */
/* iput v0, p0, Lorg/nwhy/WhackAMolesysgr/GameView;->hp:I */
/* .line 72 */
/* iget v0, p0, Lorg/nwhy/WhackAMolesysgr/GameView;->stageID:I */
/* mul-int/lit8 v0, v0, 0xa */
/* add-int/lit8 v0, v0, 0x14 */
/* iput v0, p0, Lorg/nwhy/WhackAMolesysgr/GameView;->mGoal:I */
/* .line 73 */
return;
} // .end method
/* # virtual methods */
protected void onDraw ( android.graphics.Canvas p0 ) {
/* .locals 8 */
/* .param p1, "canvas" # Landroid/graphics/Canvas; */
/* .prologue */
int v7 = 0; // const/4 v7, 0x0
int v6 = 0; // const/4 v6, 0x0
/* .line 84 */
/* invoke-super {p0, p1}, Landroid/view/View;->onDraw(Landroid/graphics/Canvas;)V */
/* .line 85 */
v5 = org.nwhy.WhackAMolesysgr.ImageManager.bmBG;
(( android.graphics.Canvas ) p1 ).drawBitmap ( v5, v6, v6, v7 ); // invoke-virtual {p1, v5, v6, v6, v7}, Landroid/graphics/Canvas;->drawBitmap(Landroid/graphics/Bitmap;FFLandroid/graphics/Paint;)V
/* .line 86 */
/* iget v5, p0, Lorg/nwhy/WhackAMolesysgr/GameView;->hp:I */
/* if-gtz v5, :cond_1 */
/* .line 87 */
(( org.nwhy.WhackAMolesysgr.GameView ) p0 ).getHandler ( ); // invoke-virtual {p0}, Lorg/nwhy/WhackAMolesysgr/GameView;->getHandler()Landroid/os/Handler;
v6 = this.flush1000ms;
(( android.os.Handler ) v5 ).removeCallbacks ( v6 ); // invoke-virtual {v5, v6}, Landroid/os/Handler;->removeCallbacks(Ljava/lang/Runnable;)V
/* .line 89 */
/* invoke-direct {p0, p1}, Lorg/nwhy/WhackAMolesysgr/GameView;->drawGameOver(Landroid/graphics/Canvas;)V */
/* .line 114 */
} // :cond_0
} // :goto_0
return;
/* .line 92 */
} // :cond_1
/* iget-boolean v5, p0, Lorg/nwhy/WhackAMolesysgr/GameView;->pauseFlag:Z */
if ( v5 != null) { // if-eqz v5, :cond_2
/* .line 93 */
/* invoke-direct {p0, p1}, Lorg/nwhy/WhackAMolesysgr/GameView;->drawPausedScreen(Landroid/graphics/Canvas;)V */
/* .line 96 */
} // :cond_2
/* iget v5, p0, Lorg/nwhy/WhackAMolesysgr/GameView;->score:I */
/* iget v6, p0, Lorg/nwhy/WhackAMolesysgr/GameView;->mGoal:I */
/* if-lt v5, v6, :cond_3 */
/* .line 97 */
/* invoke-direct {p0}, Lorg/nwhy/WhackAMolesysgr/GameView;->nextLevel()V */
/* .line 101 */
} // :cond_3
/* invoke-direct {p0, p1}, Lorg/nwhy/WhackAMolesysgr/GameView;->drawInfoPanel(Landroid/graphics/Canvas;)V */
/* .line 103 */
int v1 = 0; // const/4 v1, 0x0
/* .local v1, "i":I */
} // :goto_1
v5 = v5 = this.holeQuite;
/* if-ge v1, v5, :cond_0 */
/* .line 104 */
v5 = this.holeQuite;
/* check-cast v2, Lorg/nwhy/WhackAMolesysgr/Pic; */
/* .line 106 */
/* .local v2, "pic":Lorg/nwhy/WhackAMolesysgr/Pic; */
/* div-int/lit8 v4, v1, 0x3 */
/* .line 107 */
/* .local v4, "y":I */
/* rem-int/lit8 v3, v1, 0x3 */
/* .line 109 */
/* .local v3, "x":I */
/* iget v5, v2, Lorg/nwhy/WhackAMolesysgr/Pic;->currentType:I */
org.nwhy.WhackAMolesysgr.ImageManager .getBitmap ( v5 );
/* .line 110 */
/* .local v0, "bm":Landroid/graphics/Bitmap; */
/* mul-int/lit16 v5, v3, 0xa0 */
/* add-int/lit8 v5, v5, 0x32 */
/* int-to-float v5, v5 */
/* .line 111 */
/* mul-int/lit8 v6, v4, 0x46 */
/* add-int/lit8 v6, v6, 0x3c */
/* int-to-float v6, v6 */
/* .line 110 */
(( android.graphics.Canvas ) p1 ).drawBitmap ( v0, v5, v6, v7 ); // invoke-virtual {p1, v0, v5, v6, v7}, Landroid/graphics/Canvas;->drawBitmap(Landroid/graphics/Bitmap;FFLandroid/graphics/Paint;)V
/* .line 112 */
(( org.nwhy.WhackAMolesysgr.Pic ) v2 ).toNext ( ); // invoke-virtual {v2}, Lorg/nwhy/WhackAMolesysgr/Pic;->toNext()V
/* .line 103 */
/* add-int/lit8 v1, v1, 0x1 */
} // .end method
public Boolean onTouchEvent ( android.view.MotionEvent p0 ) {
/* .locals 11 */
/* .param p1, "event" # Landroid/view/MotionEvent; */
/* .prologue */
int v10 = 3; // const/4 v10, 0x3
int v9 = 1; // const/4 v9, 0x1
/* .line 201 */
/* iget-boolean v7, p0, Lorg/nwhy/WhackAMolesysgr/GameView;->pauseFlag:Z */
if ( v7 != null) { // if-eqz v7, :cond_0
/* move v7, v9 */
/* .line 227 */
} // :goto_0
/* .line 204 */
} // :cond_0
/* iget v7, p0, Lorg/nwhy/WhackAMolesysgr/GameView;->hp:I */
/* if-gtz v7, :cond_1 */
/* .line 205 */
/* invoke-direct {p0}, Lorg/nwhy/WhackAMolesysgr/GameView;->newGame()V */
/* move v7, v9 */
/* .line 206 */
/* .line 209 */
} // :cond_1
int v0 = 0; // const/4 v0, 0x0
/* .local v0, "i":I */
} // :goto_1
v7 = (( android.view.MotionEvent ) p1 ).getPointerCount ( ); // invoke-virtual {p1}, Landroid/view/MotionEvent;->getPointerCount()I
/* if-lt v0, v7, :cond_2 */
/* move v7, v9 */
/* .line 227 */
/* .line 210 */
} // :cond_2
v5 = (( android.view.MotionEvent ) p1 ).getX ( v0 ); // invoke-virtual {p1, v0}, Landroid/view/MotionEvent;->getX(I)F
/* .line 211 */
/* .local v5, "x":F */
v6 = (( android.view.MotionEvent ) p1 ).getY ( v0 ); // invoke-virtual {p1, v0}, Landroid/view/MotionEvent;->getY(I)F
/* .line 213 */
/* .local v6, "y":F */
/* const/high16 v7, 0x42480000 # 50.0f */
/* sub-float v3, v5, v7 */
/* .line 214 */
/* .local v3, "offsetIndexX":F */
/* const/high16 v7, 0x42700000 # 60.0f */
/* sub-float v4, v6, v7 */
/* .line 215 */
/* .local v4, "offsetIndexY":F */
/* float-to-int v7, v3 */
/* div-int/lit16 v1, v7, 0xa0 */
/* .line 216 */
/* .local v1, "indexX":I */
/* float-to-int v7, v4 */
/* div-int/lit8 v2, v7, 0x46 */
/* .line 217 */
/* .local v2, "indexY":I */
/* if-ge v1, v10, :cond_3 */
/* if-ltz v1, :cond_3 */
/* .line 218 */
/* if-ge v2, v10, :cond_3 */
/* if-gez v2, :cond_4 */
} // :cond_3
/* move v7, v9 */
/* .line 219 */
/* .line 222 */
} // :cond_4
v7 = this.holeQuite;
/* mul-int/lit8 v8, v2, 0x3 */
/* add-int/2addr v8, v1 */
/* check-cast v7, Lorg/nwhy/WhackAMolesysgr/Pic; */
v7 = (( org.nwhy.WhackAMolesysgr.Pic ) v7 ).click ( ); // invoke-virtual {v7}, Lorg/nwhy/WhackAMolesysgr/Pic;->click()Z
if ( v7 != null) { // if-eqz v7, :cond_5
/* .line 223 */
/* iget v7, p0, Lorg/nwhy/WhackAMolesysgr/GameView;->score:I */
/* add-int/lit8 v7, v7, 0x2 */
/* iput v7, p0, Lorg/nwhy/WhackAMolesysgr/GameView;->score:I */
/* .line 224 */
/* invoke-direct {p0, v9}, Lorg/nwhy/WhackAMolesysgr/GameView;->playSound(I)V */
/* .line 209 */
} // :cond_5
/* add-int/lit8 v0, v0, 0x1 */
} // .end method
public void onWindowFocusChanged ( Boolean p0 ) {
/* .locals 0 */
/* .param p1, "hasWindowFocus" # Z */
/* .prologue */
/* .line 244 */
/* invoke-super {p0, p1}, Landroid/view/View;->onWindowFocusChanged(Z)V */
/* .line 245 */
/* if-nez p1, :cond_0 */
/* .line 246 */
(( org.nwhy.WhackAMolesysgr.GameView ) p0 ).pause ( ); // invoke-virtual {p0}, Lorg/nwhy/WhackAMolesysgr/GameView;->pause()V
/* .line 248 */
} // :cond_0
return;
} // .end method
public void pause ( ) {
/* .locals 2 */
/* .prologue */
/* .line 53 */
int v0 = 1; // const/4 v0, 0x1
/* iput-boolean v0, p0, Lorg/nwhy/WhackAMolesysgr/GameView;->pauseFlag:Z */
/* .line 54 */
(( org.nwhy.WhackAMolesysgr.GameView ) p0 ).getHandler ( ); // invoke-virtual {p0}, Lorg/nwhy/WhackAMolesysgr/GameView;->getHandler()Landroid/os/Handler;
v1 = this.flush1000ms;
(( android.os.Handler ) v0 ).removeCallbacks ( v1 ); // invoke-virtual {v0, v1}, Landroid/os/Handler;->removeCallbacks(Ljava/lang/Runnable;)V
/* .line 56 */
return;
} // .end method
public void resume ( ) {
/* .locals 3 */
/* .prologue */
/* .line 59 */
int v0 = 0; // const/4 v0, 0x0
/* iput-boolean v0, p0, Lorg/nwhy/WhackAMolesysgr/GameView;->pauseFlag:Z */
/* .line 60 */
v0 = this.flush1000ms;
/* const-wide/16 v1, 0x3e8 */
(( org.nwhy.WhackAMolesysgr.GameView ) p0 ).postDelayed ( v0, v1, v2 ); // invoke-virtual {p0, v0, v1, v2}, Lorg/nwhy/WhackAMolesysgr/GameView;->postDelayed(Ljava/lang/Runnable;J)Z
/* .line 61 */
return;
} // .end method
public void saveStageInfo ( Integer p0 ) {
/* .locals 2 */
/* .param p1, "stageID" # I */
/* .prologue */
/* .line 238 */
v0 = this.settings;
final String v1 = "saveStageID"; // const-string v1, "saveStageID"
/* .line 239 */
return;
} // .end method
