public class org.nwhy.Whackczkm.VSGameView extends android.view.View {
	 /* .source "VSGameView.java" */
	 /* # static fields */
	 private static java.util.Random random;
	 /* # instance fields */
	 private final Integer MID_CLICK;
	 private final Integer MID_HIT;
	 private final Integer MID_SUCCESS;
	 java.lang.Runnable flush1000ms;
	 java.lang.Runnable flush80ms;
	 private java.util.List holeQuite1;
	 /* .annotation system Ldalvik/annotation/Signature; */
	 /* value = { */
	 /* "Ljava/util/List", */
	 /* "<", */
	 /* "Lorg/nwhy/Whackczkm/VSPic;", */
	 /* ">;" */
	 /* } */
} // .end annotation
} // .end field
private java.util.List holeQuite2;
/* .annotation system Ldalvik/annotation/Signature; */
/* value = { */
/* "Ljava/util/List", */
/* "<", */
/* "Lorg/nwhy/Whackczkm/VSPic;", */
/* ">;" */
/* } */
} // .end annotation
} // .end field
private Boolean isMute;
private org.nwhy.Whackczkm.CMIDIPlayer mCMIDIPlayer;
private android.content.Context mContext;
private Boolean pauseFlag;
private Integer score1;
private Integer score2;
private android.content.SharedPreferences settings;
private Integer time;
/* # direct methods */
static org.nwhy.Whackczkm.VSGameView ( ) {
/* .locals 1 */
/* .prologue */
/* .line 17 */
/* new-instance v0, Ljava/util/Random; */
/* invoke-direct {v0}, Ljava/util/Random;-><init>()V */
/* .line 16 */
return;
} // .end method
public org.nwhy.Whackczkm.VSGameView ( ) {
/* .locals 8 */
/* .param p1, "context" # Landroid/content/Context; */
/* .prologue */
int v7 = 2; // const/4 v7, 0x2
int v6 = 1; // const/4 v6, 0x1
int v5 = 0; // const/4 v5, 0x0
int v4 = 6; // const/4 v4, 0x6
/* .line 32 */
/* invoke-direct {p0, p1}, Landroid/view/View;-><init>(Landroid/content/Context;)V */
/* .line 25 */
/* iput v5, p0, Lorg/nwhy/Whackczkm/VSGameView;->MID_CLICK:I */
/* .line 26 */
/* iput v6, p0, Lorg/nwhy/Whackczkm/VSGameView;->MID_HIT:I */
/* .line 27 */
/* iput v7, p0, Lorg/nwhy/Whackczkm/VSGameView;->MID_SUCCESS:I */
/* .line 65 */
/* new-instance v2, Ljava/util/ArrayList; */
/* invoke-direct {v2, v4}, Ljava/util/ArrayList;-><init>(I)V */
this.holeQuite1 = v2;
/* .line 67 */
int v1 = 0; // const/4 v1, 0x0
/* .local v1, "i":I */
} // :goto_0
/* if-lt v1, v4, :cond_0 */
/* .line 71 */
/* new-instance v2, Ljava/util/ArrayList; */
/* invoke-direct {v2, v4}, Ljava/util/ArrayList;-><init>(I)V */
this.holeQuite2 = v2;
/* .line 73 */
int v1 = 0; // const/4 v1, 0x0
} // :goto_1
/* if-lt v1, v4, :cond_1 */
/* .line 157 */
/* new-instance v2, Lorg/nwhy/Whackczkm/VSGameView$1; */
/* invoke-direct {v2, p0}, Lorg/nwhy/Whackczkm/VSGameView$1;-><init>(Lorg/nwhy/Whackczkm/VSGameView;)V */
this.flush80ms = v2;
/* .line 164 */
/* new-instance v2, Lorg/nwhy/Whackczkm/VSGameView$2; */
/* invoke-direct {v2, p0}, Lorg/nwhy/Whackczkm/VSGameView$2;-><init>(Lorg/nwhy/Whackczkm/VSGameView;)V */
this.flush1000ms = v2;
/* .line 33 */
this.mContext = p1;
/* .line 34 */
/* move-object v0, p1 */
/* check-cast v0, Lorg/nwhy/Whackczkm/VSGame; */
/* move-object v2, v0 */
final String v3 = "org.nwhy.WhackAMole"; // const-string v3, "org.nwhy.WhackAMole"
(( org.nwhy.Whackczkm.VSGame ) v2 ).getSharedPreferences ( v3, v5 ); // invoke-virtual {v2, v3, v5}, Lorg/nwhy/Whackczkm/VSGame;->getSharedPreferences(Ljava/lang/String;I)Landroid/content/SharedPreferences;
this.settings = v2;
/* .line 35 */
/* new-instance v2, Lorg/nwhy/Whackczkm/CMIDIPlayer; */
/* invoke-direct {v2, p1}, Lorg/nwhy/Whackczkm/CMIDIPlayer;-><init>(Landroid/content/Context;)V */
this.mCMIDIPlayer = v2;
/* .line 36 */
v2 = this.mCMIDIPlayer;
/* const/high16 v3, 0x7f050000 */
(( org.nwhy.Whackczkm.CMIDIPlayer ) v2 ).loadSfx ( v3, v5 ); // invoke-virtual {v2, v3, v5}, Lorg/nwhy/Whackczkm/CMIDIPlayer;->loadSfx(II)V
/* .line 37 */
v2 = this.mCMIDIPlayer;
/* const v3, 0x7f050001 */
(( org.nwhy.Whackczkm.CMIDIPlayer ) v2 ).loadSfx ( v3, v6 ); // invoke-virtual {v2, v3, v6}, Lorg/nwhy/Whackczkm/CMIDIPlayer;->loadSfx(II)V
/* .line 38 */
v2 = this.mCMIDIPlayer;
/* const v3, 0x7f050002 */
(( org.nwhy.Whackczkm.CMIDIPlayer ) v2 ).loadSfx ( v3, v7 ); // invoke-virtual {v2, v3, v7}, Lorg/nwhy/Whackczkm/CMIDIPlayer;->loadSfx(II)V
/* .line 39 */
v2 = this.flush80ms;
/* const-wide/16 v3, 0x50 */
(( org.nwhy.Whackczkm.VSGameView ) p0 ).postDelayed ( v2, v3, v4 ); // invoke-virtual {p0, v2, v3, v4}, Lorg/nwhy/Whackczkm/VSGameView;->postDelayed(Ljava/lang/Runnable;J)Z
/* .line 40 */
/* invoke-direct {p0}, Lorg/nwhy/Whackczkm/VSGameView;->newGame()V */
/* .line 41 */
return;
/* .line 68 */
} // :cond_0
v2 = this.holeQuite1;
/* new-instance v3, Lorg/nwhy/Whackczkm/VSPic; */
/* invoke-direct {v3}, Lorg/nwhy/Whackczkm/VSPic;-><init>()V */
/* .line 67 */
/* add-int/lit8 v1, v1, 0x1 */
/* .line 74 */
} // :cond_1
v2 = this.holeQuite2;
/* new-instance v3, Lorg/nwhy/Whackczkm/VSPic; */
/* invoke-direct {v3}, Lorg/nwhy/Whackczkm/VSPic;-><init>()V */
/* .line 73 */
/* add-int/lit8 v1, v1, 0x1 */
} // .end method
static java.util.List access$0 ( org.nwhy.Whackczkm.VSGameView p0 ) { //synthethic
/* .locals 1 */
/* .prologue */
/* .line 65 */
v0 = this.holeQuite1;
} // .end method
static java.util.List access$1 ( org.nwhy.Whackczkm.VSGameView p0 ) { //synthethic
/* .locals 1 */
/* .prologue */
/* .line 71 */
v0 = this.holeQuite2;
} // .end method
static void access$2 ( org.nwhy.Whackczkm.VSGameView p0, Integer p1 ) { //synthethic
/* .locals 0 */
/* .prologue */
/* .line 237 */
/* invoke-direct {p0, p1}, Lorg/nwhy/Whackczkm/VSGameView;->playSound(I)V */
return;
} // .end method
private void drawGameOver ( android.graphics.Canvas p0 ) {
/* .locals 8 */
/* .param p1, "canvas" # Landroid/graphics/Canvas; */
/* .prologue */
int v7 = 0; // const/4 v7, 0x0
/* .line 114 */
v1 = org.nwhy.Whackczkm.ImageManager.bmStateBg;
/* const/high16 v2, 0x43340000 # 180.0f */
/* const/high16 v3, 0x42dc0000 # 110.0f */
(( android.graphics.Canvas ) p1 ).drawBitmap ( v1, v2, v3, v7 ); // invoke-virtual {p1, v1, v2, v3, v7}, Landroid/graphics/Canvas;->drawBitmap(Landroid/graphics/Bitmap;FFLandroid/graphics/Paint;)V
/* .line 115 */
v1 = this.mContext;
/* check-cast v1, Lorg/nwhy/Whackczkm/VSGame; */
/* const v2, 0x7f060007 */
(( org.nwhy.Whackczkm.VSGame ) v1 ).getString ( v2 ); // invoke-virtual {v1, v2}, Lorg/nwhy/Whackczkm/VSGame;->getString(I)Ljava/lang/String;
/* .line 117 */
/* .local v0, "s":Ljava/lang/String; */
/* iget v1, p0, Lorg/nwhy/Whackczkm/VSGameView;->score1:I */
/* iget v2, p0, Lorg/nwhy/Whackczkm/VSGameView;->score2:I */
/* if-le v1, v2, :cond_0 */
/* .line 118 */
v1 = this.mContext;
/* check-cast v1, Lorg/nwhy/Whackczkm/VSGame; */
/* const v2, 0x7f060010 */
(( org.nwhy.Whackczkm.VSGame ) v1 ).getString ( v2 ); // invoke-virtual {v1, v2}, Lorg/nwhy/Whackczkm/VSGame;->getString(I)Ljava/lang/String;
/* .line 124 */
} // :goto_0
/* const/high16 v1, 0x43480000 # 200.0f */
/* const/high16 v2, 0x43090000 # 137.0f */
v3 = org.nwhy.Whackczkm.PaintSuite.KV4text;
(( android.graphics.Canvas ) p1 ).drawText ( v0, v1, v2, v3 ); // invoke-virtual {p1, v0, v1, v2, v3}, Landroid/graphics/Canvas;->drawText(Ljava/lang/String;FFLandroid/graphics/Paint;)V
/* .line 125 */
v1 = org.nwhy.Whackczkm.ImageManager.bmStateBg;
/* new-instance v2, Landroid/graphics/Rect; */
/* const/16 v3, 0x7d */
/* const/16 v4, 0xa0 */
/* const/16 v5, 0x17c */
/* .line 126 */
/* const/16 v6, 0xc8 */
/* invoke-direct {v2, v3, v4, v5, v6}, Landroid/graphics/Rect;-><init>(IIII)V */
/* .line 125 */
(( android.graphics.Canvas ) p1 ).drawBitmap ( v1, v7, v2, v7 ); // invoke-virtual {p1, v1, v7, v2, v7}, Landroid/graphics/Canvas;->drawBitmap(Landroid/graphics/Bitmap;Landroid/graphics/Rect;Landroid/graphics/Rect;Landroid/graphics/Paint;)V
/* .line 127 */
p0 = this.mContext;
} // .end local p0 # "this":Lorg/nwhy/Whackczkm/VSGameView;
/* check-cast p0, Lorg/nwhy/Whackczkm/VSGame; */
/* const v1, 0x7f060009 */
(( org.nwhy.Whackczkm.VSGame ) p0 ).getString ( v1 ); // invoke-virtual {p0, v1}, Lorg/nwhy/Whackczkm/VSGame;->getString(I)Ljava/lang/String;
/* .line 128 */
/* const/high16 v1, 0x43140000 # 148.0f */
/* const/high16 v2, 0x433b0000 # 187.0f */
v3 = org.nwhy.Whackczkm.PaintSuite.KV4text;
(( android.graphics.Canvas ) p1 ).drawText ( v0, v1, v2, v3 ); // invoke-virtual {p1, v0, v1, v2, v3}, Landroid/graphics/Canvas;->drawText(Ljava/lang/String;FFLandroid/graphics/Paint;)V
/* .line 129 */
return;
/* .line 119 */
/* .restart local p0 # "this":Lorg/nwhy/Whackczkm/VSGameView; */
} // :cond_0
/* iget v1, p0, Lorg/nwhy/Whackczkm/VSGameView;->score1:I */
/* iget v2, p0, Lorg/nwhy/Whackczkm/VSGameView;->score2:I */
/* if-ge v1, v2, :cond_1 */
/* .line 120 */
v1 = this.mContext;
/* check-cast v1, Lorg/nwhy/Whackczkm/VSGame; */
/* const v2, 0x7f060011 */
(( org.nwhy.Whackczkm.VSGame ) v1 ).getString ( v2 ); // invoke-virtual {v1, v2}, Lorg/nwhy/Whackczkm/VSGame;->getString(I)Ljava/lang/String;
/* .line 122 */
} // :cond_1
v1 = this.mContext;
/* check-cast v1, Lorg/nwhy/Whackczkm/VSGame; */
/* const v2, 0x7f06000f */
(( org.nwhy.Whackczkm.VSGame ) v1 ).getString ( v2 ); // invoke-virtual {v1, v2}, Lorg/nwhy/Whackczkm/VSGame;->getString(I)Ljava/lang/String;
} // .end method
private void drawInfoPanel ( android.graphics.Canvas p0 ) {
/* .locals 8 */
/* .param p1, "canvas" # Landroid/graphics/Canvas; */
/* .prologue */
/* const/high16 v7, -0x3d4c0000 # -90.0f */
/* const/high16 v6, 0x43740000 # 244.0f */
/* const/high16 v5, 0x43660000 # 230.0f */
/* const v4, 0x43848000 # 265.0f */
/* const/high16 v3, 0x425c0000 # 55.0f */
/* .line 140 */
(( android.graphics.Canvas ) p1 ).rotate ( v7, v6, v4 ); // invoke-virtual {p1, v7, v6, v4}, Landroid/graphics/Canvas;->rotate(FFF)V
/* .line 141 */
/* new-instance v0, Ljava/lang/StringBuilder; */
/* invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V */
/* iget v1, p0, Lorg/nwhy/Whackczkm/VSGameView;->time:I */
/* div-int/lit8 v1, v1, 0xa */
(( java.lang.StringBuilder ) v0 ).append ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v0 ).toString ( ); // invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
v1 = org.nwhy.Whackczkm.PaintSuite.KV4text;
(( android.graphics.Canvas ) p1 ).drawText ( v0, v6, v4, v1 ); // invoke-virtual {p1, v0, v6, v4, v1}, Landroid/graphics/Canvas;->drawText(Ljava/lang/String;FFLandroid/graphics/Paint;)V
/* .line 142 */
/* new-instance v0, Ljava/lang/StringBuilder; */
/* invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V */
/* iget v1, p0, Lorg/nwhy/Whackczkm/VSGameView;->score2:I */
(( java.lang.StringBuilder ) v0 ).append ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v0 ).toString ( ); // invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
/* const v1, 0x439d8000 # 315.0f */
v2 = org.nwhy.Whackczkm.PaintSuite.KV4text;
(( android.graphics.Canvas ) p1 ).drawText ( v0, v1, v4, v2 ); // invoke-virtual {p1, v0, v1, v4, v2}, Landroid/graphics/Canvas;->drawText(Ljava/lang/String;FFLandroid/graphics/Paint;)V
/* .line 143 */
/* const/high16 v0, 0x42b40000 # 90.0f */
(( android.graphics.Canvas ) p1 ).rotate ( v0, v6, v4 ); // invoke-virtual {p1, v0, v6, v4}, Landroid/graphics/Canvas;->rotate(FFF)V
/* .line 145 */
/* const/high16 v0, 0x42b40000 # 90.0f */
(( android.graphics.Canvas ) p1 ).rotate ( v0, v5, v3 ); // invoke-virtual {p1, v0, v5, v3}, Landroid/graphics/Canvas;->rotate(FFF)V
/* .line 146 */
/* new-instance v0, Ljava/lang/StringBuilder; */
/* invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V */
/* iget v1, p0, Lorg/nwhy/Whackczkm/VSGameView;->time:I */
/* div-int/lit8 v1, v1, 0xa */
(( java.lang.StringBuilder ) v0 ).append ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v0 ).toString ( ); // invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
v1 = org.nwhy.Whackczkm.PaintSuite.KV4text;
(( android.graphics.Canvas ) p1 ).drawText ( v0, v5, v3, v1 ); // invoke-virtual {p1, v0, v5, v3, v1}, Landroid/graphics/Canvas;->drawText(Ljava/lang/String;FFLandroid/graphics/Paint;)V
/* .line 147 */
/* new-instance v0, Ljava/lang/StringBuilder; */
/* invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V */
/* iget v1, p0, Lorg/nwhy/Whackczkm/VSGameView;->score1:I */
(( java.lang.StringBuilder ) v0 ).append ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v0 ).toString ( ); // invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
/* const v1, 0x43968000 # 301.0f */
v2 = org.nwhy.Whackczkm.PaintSuite.KV4text;
(( android.graphics.Canvas ) p1 ).drawText ( v0, v1, v3, v2 ); // invoke-virtual {p1, v0, v1, v3, v2}, Landroid/graphics/Canvas;->drawText(Ljava/lang/String;FFLandroid/graphics/Paint;)V
/* .line 148 */
(( android.graphics.Canvas ) p1 ).rotate ( v7, v5, v3 ); // invoke-virtual {p1, v7, v5, v3}, Landroid/graphics/Canvas;->rotate(FFF)V
/* .line 155 */
return;
} // .end method
private void drawPausedScreen ( android.graphics.Canvas p0 ) {
/* .locals 8 */
/* .param p1, "canvas" # Landroid/graphics/Canvas; */
/* .prologue */
int v7 = 0; // const/4 v7, 0x0
/* .line 132 */
v1 = org.nwhy.Whackczkm.ImageManager.bmStateBg;
/* new-instance v2, Landroid/graphics/Rect; */
/* const/16 v3, 0x9b */
/* const/16 v4, 0x96 */
/* const/16 v5, 0x15e */
/* .line 133 */
/* const/16 v6, 0xbe */
/* invoke-direct {v2, v3, v4, v5, v6}, Landroid/graphics/Rect;-><init>(IIII)V */
/* .line 132 */
(( android.graphics.Canvas ) p1 ).drawBitmap ( v1, v7, v2, v7 ); // invoke-virtual {p1, v1, v7, v2, v7}, Landroid/graphics/Canvas;->drawBitmap(Landroid/graphics/Bitmap;Landroid/graphics/Rect;Landroid/graphics/Rect;Landroid/graphics/Paint;)V
/* .line 134 */
p0 = this.mContext;
} // .end local p0 # "this":Lorg/nwhy/Whackczkm/VSGameView;
/* check-cast p0, Lorg/nwhy/Whackczkm/VSGame; */
/* const v1, 0x7f060008 */
(( org.nwhy.Whackczkm.VSGame ) p0 ).getString ( v1 ); // invoke-virtual {p0, v1}, Lorg/nwhy/Whackczkm/VSGame;->getString(I)Ljava/lang/String;
/* .line 135 */
/* .local v0, "s":Ljava/lang/String; */
/* const/high16 v1, 0x433e0000 # 190.0f */
/* const/high16 v2, 0x43310000 # 177.0f */
v3 = org.nwhy.Whackczkm.PaintSuite.KV4text;
(( android.graphics.Canvas ) p1 ).drawText ( v0, v1, v2, v3 ); // invoke-virtual {p1, v0, v1, v2, v3}, Landroid/graphics/Canvas;->drawText(Ljava/lang/String;FFLandroid/graphics/Paint;)V
/* .line 136 */
return;
} // .end method
private void newGame ( ) {
/* .locals 0 */
/* .prologue */
/* .line 54 */
(( org.nwhy.Whackczkm.VSGameView ) p0 ).resume ( ); // invoke-virtual {p0}, Lorg/nwhy/Whackczkm/VSGameView;->resume()V
/* .line 55 */
/* invoke-direct {p0}, Lorg/nwhy/Whackczkm/VSGameView;->resetGame()V */
/* .line 56 */
return;
} // .end method
private void playSound ( Integer p0 ) {
/* .locals 3 */
/* .param p1, "mid_id" # I */
/* .prologue */
/* .line 238 */
v0 = this.settings;
final String v1 = "soundFlag"; // const-string v1, "soundFlag"
v0 = int v2 = 0; // const/4 v2, 0x0
/* iput-boolean v0, p0, Lorg/nwhy/Whackczkm/VSGameView;->isMute:Z */
/* .line 239 */
/* iget-boolean v0, p0, Lorg/nwhy/Whackczkm/VSGameView;->isMute:Z */
/* if-nez v0, :cond_0 */
/* .line 240 */
v0 = this.mCMIDIPlayer;
(( org.nwhy.Whackczkm.CMIDIPlayer ) v0 ).play ( p1 ); // invoke-virtual {v0, p1}, Lorg/nwhy/Whackczkm/CMIDIPlayer;->play(I)V
/* .line 242 */
} // :cond_0
return;
} // .end method
private void resetGame ( ) {
/* .locals 2 */
/* .prologue */
int v1 = 0; // const/4 v1, 0x0
/* .line 59 */
/* iput-boolean v1, p0, Lorg/nwhy/Whackczkm/VSGameView;->pauseFlag:Z */
/* .line 60 */
/* const/16 v0, 0x1c2 */
/* iput v0, p0, Lorg/nwhy/Whackczkm/VSGameView;->time:I */
/* .line 61 */
/* iput v1, p0, Lorg/nwhy/Whackczkm/VSGameView;->score1:I */
/* .line 62 */
/* iput v1, p0, Lorg/nwhy/Whackczkm/VSGameView;->score2:I */
/* .line 63 */
return;
} // .end method
/* # virtual methods */
protected void onDraw ( android.graphics.Canvas p0 ) {
/* .locals 9 */
/* .param p1, "canvas" # Landroid/graphics/Canvas; */
/* .prologue */
/* const/high16 v8, 0x43200000 # 160.0f */
/* const/high16 v7, 0x42e60000 # 115.0f */
int v4 = 0; // const/4 v4, 0x0
int v6 = 0; // const/4 v6, 0x0
int v5 = 1; // const/4 v5, 0x1
/* .line 80 */
/* invoke-super {p0, p1}, Landroid/view/View;->onDraw(Landroid/graphics/Canvas;)V */
/* .line 81 */
v3 = org.nwhy.Whackczkm.ImageManager.bmVSBG;
(( android.graphics.Canvas ) p1 ).drawBitmap ( v3, v4, v4, v6 ); // invoke-virtual {p1, v3, v4, v4, v6}, Landroid/graphics/Canvas;->drawBitmap(Landroid/graphics/Bitmap;FFLandroid/graphics/Paint;)V
/* .line 83 */
/* iget-boolean v3, p0, Lorg/nwhy/Whackczkm/VSGameView;->pauseFlag:Z */
if ( v3 != null) { // if-eqz v3, :cond_1
/* .line 84 */
/* invoke-direct {p0, p1}, Lorg/nwhy/Whackczkm/VSGameView;->drawPausedScreen(Landroid/graphics/Canvas;)V */
/* .line 111 */
} // :cond_0
} // :goto_0
return;
/* .line 88 */
} // :cond_1
/* iget v3, p0, Lorg/nwhy/Whackczkm/VSGameView;->time:I */
/* if-gtz v3, :cond_2 */
/* .line 89 */
(( org.nwhy.Whackczkm.VSGameView ) p0 ).getHandler ( ); // invoke-virtual {p0}, Lorg/nwhy/Whackczkm/VSGameView;->getHandler()Landroid/os/Handler;
v4 = this.flush1000ms;
(( android.os.Handler ) v3 ).removeCallbacks ( v4 ); // invoke-virtual {v3, v4}, Landroid/os/Handler;->removeCallbacks(Ljava/lang/Runnable;)V
/* .line 90 */
/* invoke-direct {p0, p1}, Lorg/nwhy/Whackczkm/VSGameView;->drawGameOver(Landroid/graphics/Canvas;)V */
/* .line 94 */
} // :cond_2
/* iget v3, p0, Lorg/nwhy/Whackczkm/VSGameView;->time:I */
/* sub-int/2addr v3, v5 */
/* iput v3, p0, Lorg/nwhy/Whackczkm/VSGameView;->time:I */
/* .line 95 */
/* invoke-direct {p0, p1}, Lorg/nwhy/Whackczkm/VSGameView;->drawInfoPanel(Landroid/graphics/Canvas;)V */
/* .line 97 */
/* const/high16 v3, 0x43340000 # 180.0f */
(( android.graphics.Canvas ) p1 ).rotate ( v3, v7, v8 ); // invoke-virtual {p1, v3, v7, v8}, Landroid/graphics/Canvas;->rotate(FFF)V
/* .line 98 */
int v1 = 0; // const/4 v1, 0x0
/* .local v1, "i":I */
} // :goto_1
v3 = v3 = this.holeQuite1;
/* if-lt v1, v3, :cond_3 */
/* .line 104 */
/* const/high16 v3, -0x3ccc0000 # -180.0f */
(( android.graphics.Canvas ) p1 ).rotate ( v3, v7, v8 ); // invoke-virtual {p1, v3, v7, v8}, Landroid/graphics/Canvas;->rotate(FFF)V
/* .line 105 */
int v1 = 0; // const/4 v1, 0x0
} // :goto_2
v3 = v3 = this.holeQuite2;
/* if-ge v1, v3, :cond_0 */
/* .line 106 */
v3 = this.holeQuite2;
/* check-cast v2, Lorg/nwhy/Whackczkm/VSPic; */
/* .line 107 */
/* .local v2, "pic":Lorg/nwhy/Whackczkm/VSPic; */
/* iget v3, v2, Lorg/nwhy/Whackczkm/VSPic;->currentType:I */
org.nwhy.Whackczkm.ImageManager .getVSBitmap ( v3 );
/* .line 108 */
/* .local v0, "bm":Landroid/graphics/Bitmap; */
v3 = org.nwhy.Whackczkm.Config.VS_POS2;
/* aget-object v3, v3, v1 */
int v4 = 0; // const/4 v4, 0x0
/* aget v3, v3, v4 */
/* int-to-float v3, v3 */
v4 = org.nwhy.Whackczkm.Config.VS_POS2;
/* aget-object v4, v4, v1 */
/* aget v4, v4, v5 */
/* int-to-float v4, v4 */
(( android.graphics.Canvas ) p1 ).drawBitmap ( v0, v3, v4, v6 ); // invoke-virtual {p1, v0, v3, v4, v6}, Landroid/graphics/Canvas;->drawBitmap(Landroid/graphics/Bitmap;FFLandroid/graphics/Paint;)V
/* .line 109 */
(( org.nwhy.Whackczkm.VSPic ) v2 ).toNext ( ); // invoke-virtual {v2}, Lorg/nwhy/Whackczkm/VSPic;->toNext()V
/* .line 105 */
/* add-int/lit8 v1, v1, 0x1 */
/* .line 99 */
} // .end local v0 # "bm":Landroid/graphics/Bitmap;
} // .end local v2 # "pic":Lorg/nwhy/Whackczkm/VSPic;
} // :cond_3
v3 = this.holeQuite1;
/* check-cast v2, Lorg/nwhy/Whackczkm/VSPic; */
/* .line 100 */
/* .restart local v2 # "pic":Lorg/nwhy/Whackczkm/VSPic; */
/* iget v3, v2, Lorg/nwhy/Whackczkm/VSPic;->currentType:I */
org.nwhy.Whackczkm.ImageManager .getVSBitmap ( v3 );
/* .line 101 */
/* .restart local v0 # "bm":Landroid/graphics/Bitmap; */
v3 = org.nwhy.Whackczkm.Config.VS_POS1;
/* aget-object v3, v3, v1 */
int v4 = 0; // const/4 v4, 0x0
/* aget v3, v3, v4 */
/* int-to-float v3, v3 */
v4 = org.nwhy.Whackczkm.Config.VS_POS1;
/* aget-object v4, v4, v1 */
/* aget v4, v4, v5 */
/* int-to-float v4, v4 */
(( android.graphics.Canvas ) p1 ).drawBitmap ( v0, v3, v4, v6 ); // invoke-virtual {p1, v0, v3, v4, v6}, Landroid/graphics/Canvas;->drawBitmap(Landroid/graphics/Bitmap;FFLandroid/graphics/Paint;)V
/* .line 102 */
(( org.nwhy.Whackczkm.VSPic ) v2 ).toNext ( ); // invoke-virtual {v2}, Lorg/nwhy/Whackczkm/VSPic;->toNext()V
/* .line 98 */
/* add-int/lit8 v1, v1, 0x1 */
} // .end method
public Boolean onTouchEvent ( android.view.MotionEvent p0 ) {
/* .locals 13 */
/* .param p1, "event" # Landroid/view/MotionEvent; */
/* .prologue */
int v11 = 3; // const/4 v11, 0x3
int v10 = 2; // const/4 v10, 0x2
int v9 = 1; // const/4 v9, 0x1
final String v12 = "ddd"; // const-string v12, "ddd"
/* .line 177 */
/* iget-boolean v7, p0, Lorg/nwhy/Whackczkm/VSGameView;->pauseFlag:Z */
if ( v7 != null) { // if-eqz v7, :cond_0
/* move v7, v9 */
/* .line 234 */
} // :goto_0
/* .line 180 */
} // :cond_0
/* iget v7, p0, Lorg/nwhy/Whackczkm/VSGameView;->time:I */
/* if-gtz v7, :cond_1 */
/* .line 181 */
/* invoke-direct {p0}, Lorg/nwhy/Whackczkm/VSGameView;->newGame()V */
/* .line 184 */
} // :cond_1
int v0 = 0; // const/4 v0, 0x0
/* .local v0, "i":I */
} // :goto_1
v7 = (( android.view.MotionEvent ) p1 ).getPointerCount ( ); // invoke-virtual {p1}, Landroid/view/MotionEvent;->getPointerCount()I
/* if-lt v0, v7, :cond_2 */
/* move v7, v9 */
/* .line 234 */
/* .line 185 */
} // :cond_2
v5 = (( android.view.MotionEvent ) p1 ).getX ( v0 ); // invoke-virtual {p1, v0}, Landroid/view/MotionEvent;->getX(I)F
/* .line 186 */
/* .local v5, "x":F */
v6 = (( android.view.MotionEvent ) p1 ).getY ( v0 ); // invoke-virtual {p1, v0}, Landroid/view/MotionEvent;->getY(I)F
/* .line 188 */
/* .local v6, "y":F */
/* float-to-int v7, v5 */
/* div-int/lit8 v3, v7, 0x78 */
/* .line 189 */
/* .local v3, "indexX":I */
/* float-to-int v7, v6 */
/* div-int/lit8 v4, v7, 0x6a */
/* .line 191 */
/* .local v4, "indexY":I */
/* if-ge v3, v10, :cond_a */
/* .line 192 */
int v1 = 0; // const/4 v1, 0x0
/* .line 193 */
/* .local v1, "index1":I */
/* if-nez v3, :cond_5 */
/* if-nez v4, :cond_5 */
/* .line 194 */
int v1 = 5; // const/4 v1, 0x5
/* .line 206 */
} // :cond_3
} // :goto_2
final String v7 = "ddd"; // const-string v7, "ddd"
/* new-instance v7, Ljava/lang/StringBuilder; */
final String v8 = "p1"; // const-string v8, "p1"
/* invoke-direct {v7, v8}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V */
(( java.lang.StringBuilder ) v7 ).append ( v1 ); // invoke-virtual {v7, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v7 ).toString ( ); // invoke-virtual {v7}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
android.util.Log .e ( v12,v7 );
/* .line 207 */
v7 = this.holeQuite1;
/* check-cast v7, Lorg/nwhy/Whackczkm/VSPic; */
v7 = (( org.nwhy.Whackczkm.VSPic ) v7 ).click ( ); // invoke-virtual {v7}, Lorg/nwhy/Whackczkm/VSPic;->click()Z
if ( v7 != null) { // if-eqz v7, :cond_4
/* .line 208 */
/* iget v7, p0, Lorg/nwhy/Whackczkm/VSGameView;->score1:I */
/* add-int/lit8 v7, v7, 0x2 */
/* iput v7, p0, Lorg/nwhy/Whackczkm/VSGameView;->score1:I */
/* .line 209 */
/* invoke-direct {p0, v9}, Lorg/nwhy/Whackczkm/VSGameView;->playSound(I)V */
/* .line 184 */
} // .end local v1 # "index1":I
} // :cond_4
} // :goto_3
/* add-int/lit8 v0, v0, 0x1 */
/* .line 195 */
/* .restart local v1 # "index1":I */
} // :cond_5
/* if-nez v3, :cond_6 */
/* if-ne v4, v9, :cond_6 */
/* .line 196 */
int v1 = 4; // const/4 v1, 0x4
/* .line 197 */
} // :cond_6
/* if-nez v3, :cond_7 */
/* if-ne v4, v10, :cond_7 */
/* .line 198 */
int v1 = 3; // const/4 v1, 0x3
/* .line 199 */
} // :cond_7
/* if-ne v3, v9, :cond_8 */
/* if-nez v4, :cond_8 */
/* .line 200 */
int v1 = 2; // const/4 v1, 0x2
/* .line 201 */
} // :cond_8
/* if-ne v3, v9, :cond_9 */
/* if-ne v4, v9, :cond_9 */
/* .line 202 */
int v1 = 1; // const/4 v1, 0x1
/* .line 203 */
} // :cond_9
/* if-ne v3, v9, :cond_3 */
/* if-ne v4, v10, :cond_3 */
/* .line 204 */
int v1 = 0; // const/4 v1, 0x0
/* .line 212 */
} // .end local v1 # "index1":I
} // :cond_a
int v2 = 0; // const/4 v2, 0x0
/* .line 213 */
/* .local v2, "index2":I */
/* if-ne v3, v10, :cond_c */
/* if-nez v4, :cond_c */
/* .line 214 */
int v2 = 0; // const/4 v2, 0x0
/* .line 227 */
} // :cond_b
} // :goto_4
final String v7 = "ddd"; // const-string v7, "ddd"
/* new-instance v7, Ljava/lang/StringBuilder; */
final String v8 = "p2"; // const-string v8, "p2"
/* invoke-direct {v7, v8}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V */
(( java.lang.StringBuilder ) v7 ).append ( v2 ); // invoke-virtual {v7, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v7 ).toString ( ); // invoke-virtual {v7}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
android.util.Log .e ( v12,v7 );
/* .line 228 */
v7 = this.holeQuite2;
/* check-cast v7, Lorg/nwhy/Whackczkm/VSPic; */
v7 = (( org.nwhy.Whackczkm.VSPic ) v7 ).click ( ); // invoke-virtual {v7}, Lorg/nwhy/Whackczkm/VSPic;->click()Z
if ( v7 != null) { // if-eqz v7, :cond_4
/* .line 229 */
/* iget v7, p0, Lorg/nwhy/Whackczkm/VSGameView;->score2:I */
/* add-int/lit8 v7, v7, 0x2 */
/* iput v7, p0, Lorg/nwhy/Whackczkm/VSGameView;->score2:I */
/* .line 230 */
/* invoke-direct {p0, v9}, Lorg/nwhy/Whackczkm/VSGameView;->playSound(I)V */
/* .line 215 */
} // :cond_c
/* if-ne v3, v10, :cond_d */
/* if-ne v4, v9, :cond_d */
/* .line 216 */
int v2 = 1; // const/4 v2, 0x1
/* .line 217 */
} // :cond_d
/* if-ne v3, v10, :cond_e */
/* if-ne v4, v10, :cond_e */
/* .line 218 */
int v2 = 2; // const/4 v2, 0x2
/* .line 219 */
} // :cond_e
/* if-ne v3, v11, :cond_f */
/* if-nez v4, :cond_f */
/* .line 220 */
int v2 = 3; // const/4 v2, 0x3
/* .line 221 */
} // :cond_f
/* if-ne v3, v11, :cond_10 */
/* if-ne v4, v9, :cond_10 */
/* .line 222 */
int v2 = 4; // const/4 v2, 0x4
/* .line 223 */
} // :cond_10
/* if-ne v3, v11, :cond_b */
/* if-ne v4, v10, :cond_b */
/* .line 224 */
int v2 = 5; // const/4 v2, 0x5
} // .end method
public void onWindowFocusChanged ( Boolean p0 ) {
/* .locals 0 */
/* .param p1, "hasWindowFocus" # Z */
/* .prologue */
/* .line 247 */
/* invoke-super {p0, p1}, Landroid/view/View;->onWindowFocusChanged(Z)V */
/* .line 248 */
/* if-nez p1, :cond_0 */
/* .line 249 */
(( org.nwhy.Whackczkm.VSGameView ) p0 ).pause ( ); // invoke-virtual {p0}, Lorg/nwhy/Whackczkm/VSGameView;->pause()V
/* .line 251 */
} // :cond_0
return;
} // .end method
public void pause ( ) {
/* .locals 2 */
/* .prologue */
/* .line 43 */
int v0 = 1; // const/4 v0, 0x1
/* iput-boolean v0, p0, Lorg/nwhy/Whackczkm/VSGameView;->pauseFlag:Z */
/* .line 44 */
(( org.nwhy.Whackczkm.VSGameView ) p0 ).getHandler ( ); // invoke-virtual {p0}, Lorg/nwhy/Whackczkm/VSGameView;->getHandler()Landroid/os/Handler;
v1 = this.flush1000ms;
(( android.os.Handler ) v0 ).removeCallbacks ( v1 ); // invoke-virtual {v0, v1}, Landroid/os/Handler;->removeCallbacks(Ljava/lang/Runnable;)V
/* .line 46 */
return;
} // .end method
public void resume ( ) {
/* .locals 3 */
/* .prologue */
/* .line 49 */
int v0 = 0; // const/4 v0, 0x0
/* iput-boolean v0, p0, Lorg/nwhy/Whackczkm/VSGameView;->pauseFlag:Z */
/* .line 50 */
v0 = this.flush1000ms;
/* const-wide/16 v1, 0x3e8 */
(( org.nwhy.Whackczkm.VSGameView ) p0 ).postDelayed ( v0, v1, v2 ); // invoke-virtual {p0, v0, v1, v2}, Lorg/nwhy/Whackczkm/VSGameView;->postDelayed(Ljava/lang/Runnable;J)Z
/* .line 51 */
return;
} // .end method
