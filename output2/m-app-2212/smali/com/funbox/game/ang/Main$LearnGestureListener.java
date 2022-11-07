class com.funbox.game.ang.Main$LearnGestureListener extends android.view.GestureDetector$SimpleOnGestureListener {
	 /* .source "Main.java" */
	 /* # annotations */
	 /* .annotation system Ldalvik/annotation/EnclosingClass; */
	 /* value = Lcom/funbox/game/ang/Main; */
} // .end annotation
/* .annotation system Ldalvik/annotation/InnerClass; */
/* accessFlags = 0x0 */
/* name = "LearnGestureListener" */
} // .end annotation
/* # instance fields */
final com.funbox.game.ang.Main this$0; //synthetic
/* # direct methods */
 com.funbox.game.ang.Main$LearnGestureListener ( ) {
/* .locals 0 */
/* .prologue */
/* .line 240 */
this.this$0 = p1;
/* invoke-direct {p0}, Landroid/view/GestureDetector$SimpleOnGestureListener;-><init>()V */
return;
} // .end method
/* # virtual methods */
public Boolean onDoubleTap ( android.view.MotionEvent p0 ) {
/* .locals 2 */
/* .param p1, "event" # Landroid/view/MotionEvent; */
/* .prologue */
/* .line 295 */
final String v0 = "DEBUG"; // const-string v0, "DEBUG"
final String v1 = "onDoubleTap"; // const-string v1, "onDoubleTap"
android.util.Log .v ( v0,v1 );
/* .line 296 */
int v0 = 1; // const/4 v0, 0x1
} // .end method
public Boolean onDown ( android.view.MotionEvent p0 ) {
/* .locals 2 */
/* .param p1, "ev" # Landroid/view/MotionEvent; */
/* .prologue */
/* .line 284 */
final String v0 = "DEBUG"; // const-string v0, "DEBUG"
final String v1 = "onDownd"; // const-string v1, "onDownd"
android.util.Log .v ( v0,v1 );
/* .line 285 */
int v0 = 1; // const/4 v0, 0x1
} // .end method
public Boolean onFling ( android.view.MotionEvent p0, android.view.MotionEvent p1, Float p2, Float p3 ) {
/* .locals 2 */
/* .param p1, "e1" # Landroid/view/MotionEvent; */
/* .param p2, "e2" # Landroid/view/MotionEvent; */
/* .param p3, "velocityX" # F */
/* .param p4, "velocityY" # F */
/* .prologue */
/* .line 291 */
final String v0 = "DEBUG"; // const-string v0, "DEBUG"
final String v1 = "onFling"; // const-string v1, "onFling"
android.util.Log .v ( v0,v1 );
/* .line 292 */
int v0 = 1; // const/4 v0, 0x1
} // .end method
public void onLongPress ( android.view.MotionEvent p0 ) {
/* .locals 2 */
/* .param p1, "ev" # Landroid/view/MotionEvent; */
/* .prologue */
/* .line 272 */
final String v0 = "DEBUG"; // const-string v0, "DEBUG"
final String v1 = "onLongPress"; // const-string v1, "onLongPress"
android.util.Log .v ( v0,v1 );
/* .line 273 */
return;
} // .end method
public Boolean onScroll ( android.view.MotionEvent p0, android.view.MotionEvent p1, Float p2, Float p3 ) {
/* .locals 2 */
/* .param p1, "e1" # Landroid/view/MotionEvent; */
/* .param p2, "e2" # Landroid/view/MotionEvent; */
/* .param p3, "distanceX" # F */
/* .param p4, "distanceY" # F */
/* .prologue */
/* .line 278 */
final String v0 = "DEBUG"; // const-string v0, "DEBUG"
final String v1 = "onScroll"; // const-string v1, "onScroll"
android.util.Log .v ( v0,v1 );
/* .line 279 */
int v0 = 1; // const/4 v0, 0x1
} // .end method
public void onShowPress ( android.view.MotionEvent p0 ) {
/* .locals 2 */
/* .param p1, "ev" # Landroid/view/MotionEvent; */
/* .prologue */
/* .line 267 */
final String v0 = "DEBUG"; // const-string v0, "DEBUG"
final String v1 = "onShowPress"; // const-string v1, "onShowPress"
android.util.Log .v ( v0,v1 );
/* .line 268 */
return;
} // .end method
public Boolean onSingleTapUp ( android.view.MotionEvent p0 ) {
/* .locals 8 */
/* .param p1, "ev" # Landroid/view/MotionEvent; */
/* .prologue */
int v7 = 1; // const/4 v7, 0x1
/* .line 243 */
final String v3 = "DEBUG"; // const-string v3, "DEBUG"
final String v4 = "onSingleTapUp"; // const-string v4, "onSingleTapUp"
android.util.Log .v ( v3,v4 );
/* .line 244 */
v3 = this.this$0;
v3 = this.mGameView;
v3 = this.mGameField;
(( com.funbox.game.ang.GameField ) v3 ).getStatus ( ); // invoke-virtual {v3}, Lcom/funbox/game/ang/GameField;->getStatus()Lcom/funbox/game/ang/GameField$GAME_STATUS;
v4 = com.funbox.game.ang.GameField$GAME_STATUS.GS_GAMEOVER;
/* if-ne v3, v4, :cond_0 */
/* .line 245 */
v3 = this.this$0;
(( com.funbox.game.ang.Main ) v3 ).exitMain ( ); // invoke-virtual {v3}, Lcom/funbox/game/ang/Main;->exitMain()V
/* move v3, v7 */
/* .line 262 */
} // :goto_0
/* .line 248 */
} // :cond_0
v3 = this.this$0;
v3 = this.mGameView;
v4 = (( android.view.MotionEvent ) p1 ).getX ( ); // invoke-virtual {p1}, Landroid/view/MotionEvent;->getX()F
v5 = (( android.view.MotionEvent ) p1 ).getY ( ); // invoke-virtual {p1}, Landroid/view/MotionEvent;->getY()F
(( com.funbox.game.ang.GameView ) v3 ).doSingleTapUp ( v4, v5 ); // invoke-virtual {v3, v4, v5}, Lcom/funbox/game/ang/GameView;->doSingleTapUp(FF)Z
/* .line 250 */
v3 = (( android.view.MotionEvent ) p1 ).getX ( ); // invoke-virtual {p1}, Landroid/view/MotionEvent;->getX()F
/* float-to-int v1, v3 */
/* .line 251 */
/* .local v1, "x":I */
v3 = (( android.view.MotionEvent ) p1 ).getY ( ); // invoke-virtual {p1}, Landroid/view/MotionEvent;->getY()F
/* float-to-int v2, v3 */
/* .line 254 */
/* .local v2, "y":I */
/* new-instance v0, Landroid/graphics/Rect; */
/* const/16 v3, 0x11d */
int v4 = 3; // const/4 v4, 0x3
/* const/16 v5, 0x138 */
/* const/16 v6, 0x1e */
/* invoke-direct {v0, v3, v4, v5, v6}, Landroid/graphics/Rect;-><init>(IIII)V */
/* .line 255 */
/* .local v0, "rect_PauseBtn":Landroid/graphics/Rect; */
v3 = (( android.graphics.Rect ) v0 ).contains ( v1, v2 ); // invoke-virtual {v0, v1, v2}, Landroid/graphics/Rect;->contains(II)Z
if ( v3 != null) { // if-eqz v3, :cond_1
/* .line 256 */
v3 = this.this$0;
v3 = this.mGameView;
v3 = this.mGameField;
(( com.funbox.game.ang.GameField ) v3 ).getStatus ( ); // invoke-virtual {v3}, Lcom/funbox/game/ang/GameField;->getStatus()Lcom/funbox/game/ang/GameField$GAME_STATUS;
v4 = com.funbox.game.ang.GameField$GAME_STATUS.GS_PLAYING;
/* if-ne v3, v4, :cond_2 */
/* .line 257 */
v3 = this.this$0;
v3 = this.mGameView;
v3 = this.mGameField;
v4 = com.funbox.game.ang.GameField$GAME_STATUS.GS_PAUSE;
(( com.funbox.game.ang.GameField ) v3 ).setStatus ( v4 ); // invoke-virtual {v3, v4}, Lcom/funbox/game/ang/GameField;->setStatus(Lcom/funbox/game/ang/GameField$GAME_STATUS;)V
} // :cond_1
} // :goto_1
/* move v3, v7 */
/* .line 262 */
/* .line 258 */
} // :cond_2
v3 = this.this$0;
v3 = this.mGameView;
v3 = this.mGameField;
(( com.funbox.game.ang.GameField ) v3 ).getStatus ( ); // invoke-virtual {v3}, Lcom/funbox/game/ang/GameField;->getStatus()Lcom/funbox/game/ang/GameField$GAME_STATUS;
v4 = com.funbox.game.ang.GameField$GAME_STATUS.GS_PAUSE;
/* if-ne v3, v4, :cond_1 */
/* .line 259 */
v3 = this.this$0;
v3 = this.mGameView;
v3 = this.mGameField;
v4 = com.funbox.game.ang.GameField$GAME_STATUS.GS_PLAYING;
(( com.funbox.game.ang.GameField ) v3 ).setStatus ( v4 ); // invoke-virtual {v3, v4}, Lcom/funbox/game/ang/GameField;->setStatus(Lcom/funbox/game/ang/GameField$GAME_STATUS;)V
} // .end method
