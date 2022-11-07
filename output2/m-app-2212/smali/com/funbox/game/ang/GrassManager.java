class com.funbox.game.ang.GrassManager {
	 /* .source "GrassManager.java" */
	 /* # instance fields */
	 private android.graphics.Bitmap mBmpBottom;
	 private android.graphics.Bitmap mBmpMiddle;
	 private android.graphics.Bitmap mBmpTop;
	 private final Integer mX;
	 private final Integer mY1;
	 private final Integer mY2;
	 private final Integer mY3;
	 /* # direct methods */
	 public com.funbox.game.ang.GrassManager ( ) {
		 /* .locals 1 */
		 /* .param p1, "bmpBottom" # Landroid/graphics/Bitmap; */
		 /* .param p2, "bmpMiddle" # Landroid/graphics/Bitmap; */
		 /* .param p3, "bmpTop" # Landroid/graphics/Bitmap; */
		 /* .prologue */
		 /* .line 22 */
		 /* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
		 /* .line 11 */
		 int v0 = 0; // const/4 v0, 0x0
		 /* iput v0, p0, Lcom/funbox/game/ang/GrassManager;->mX:I */
		 /* .line 14 */
		 /* const/16 v0, 0x7e */
		 /* iput v0, p0, Lcom/funbox/game/ang/GrassManager;->mY1:I */
		 /* .line 15 */
		 /* const/16 v0, 0xd1 */
		 /* iput v0, p0, Lcom/funbox/game/ang/GrassManager;->mY2:I */
		 /* .line 16 */
		 /* const/16 v0, 0x130 */
		 /* iput v0, p0, Lcom/funbox/game/ang/GrassManager;->mY3:I */
		 /* .line 26 */
		 this.mBmpBottom = p1;
		 /* .line 27 */
		 this.mBmpMiddle = p2;
		 /* .line 28 */
		 this.mBmpTop = p3;
		 /* .line 29 */
		 return;
	 } // .end method
	 /* # virtual methods */
	 public android.graphics.Bitmap getCurBmp ( com.funbox.game.ang.Animal$ANIMAL_SITE p0 ) {
		 /* .locals 2 */
		 /* .param p1, "site" # Lcom/funbox/game/ang/Animal$ANIMAL_SITE; */
		 /* .prologue */
		 /* .line 34 */
		 v1 = com.funbox.game.ang.Animal$ANIMAL_SITE.B1;
		 /* if-eq p1, v1, :cond_0 */
		 /* .line 35 */
		 v1 = com.funbox.game.ang.Animal$ANIMAL_SITE.B2;
		 /* if-eq p1, v1, :cond_0 */
		 /* .line 36 */
		 v1 = com.funbox.game.ang.Animal$ANIMAL_SITE.B3;
		 /* if-ne p1, v1, :cond_1 */
		 /* .line 37 */
	 } // :cond_0
	 v0 = this.mBmpBottom;
	 /* .line 50 */
	 /* .local v0, "bmp":Landroid/graphics/Bitmap; */
} // :goto_0
/* .line 38 */
} // .end local v0 # "bmp":Landroid/graphics/Bitmap;
} // :cond_1
v1 = com.funbox.game.ang.Animal$ANIMAL_SITE.M1;
/* if-eq p1, v1, :cond_2 */
/* .line 39 */
v1 = com.funbox.game.ang.Animal$ANIMAL_SITE.M2;
/* if-eq p1, v1, :cond_2 */
/* .line 40 */
v1 = com.funbox.game.ang.Animal$ANIMAL_SITE.M3;
/* if-ne p1, v1, :cond_3 */
/* .line 41 */
} // :cond_2
v0 = this.mBmpMiddle;
/* .restart local v0 # "bmp":Landroid/graphics/Bitmap; */
/* .line 42 */
} // .end local v0 # "bmp":Landroid/graphics/Bitmap;
} // :cond_3
v1 = com.funbox.game.ang.Animal$ANIMAL_SITE.T1;
/* if-eq p1, v1, :cond_4 */
/* .line 43 */
v1 = com.funbox.game.ang.Animal$ANIMAL_SITE.T2;
/* if-eq p1, v1, :cond_4 */
/* .line 44 */
v1 = com.funbox.game.ang.Animal$ANIMAL_SITE.T3;
/* if-ne p1, v1, :cond_5 */
/* .line 45 */
} // :cond_4
v0 = this.mBmpTop;
/* .restart local v0 # "bmp":Landroid/graphics/Bitmap; */
/* .line 47 */
} // .end local v0 # "bmp":Landroid/graphics/Bitmap;
} // :cond_5
v0 = this.mBmpTop;
/* .restart local v0 # "bmp":Landroid/graphics/Bitmap; */
} // .end method
public Integer getX ( ) {
/* .locals 1 */
/* .prologue */
/* .line 54 */
int v0 = 0; // const/4 v0, 0x0
} // .end method
public Integer getY ( com.funbox.game.ang.Animal$ANIMAL_SITE p0 ) {
/* .locals 2 */
/* .param p1, "site" # Lcom/funbox/game/ang/Animal$ANIMAL_SITE; */
/* .prologue */
/* const/16 v1, 0x7e */
/* .line 58 */
v0 = com.funbox.game.ang.Animal$ANIMAL_SITE.T1;
/* if-eq p1, v0, :cond_0 */
/* .line 59 */
v0 = com.funbox.game.ang.Animal$ANIMAL_SITE.T2;
/* if-eq p1, v0, :cond_0 */
/* .line 60 */
v0 = com.funbox.game.ang.Animal$ANIMAL_SITE.T3;
/* if-ne p1, v0, :cond_1 */
} // :cond_0
/* move v0, v1 */
/* .line 71 */
} // :goto_0
/* .line 62 */
} // :cond_1
v0 = com.funbox.game.ang.Animal$ANIMAL_SITE.M1;
/* if-eq p1, v0, :cond_2 */
/* .line 63 */
v0 = com.funbox.game.ang.Animal$ANIMAL_SITE.M2;
/* if-eq p1, v0, :cond_2 */
/* .line 64 */
v0 = com.funbox.game.ang.Animal$ANIMAL_SITE.M3;
/* if-ne p1, v0, :cond_3 */
/* .line 65 */
} // :cond_2
/* const/16 v0, 0xd1 */
/* .line 66 */
} // :cond_3
v0 = com.funbox.game.ang.Animal$ANIMAL_SITE.B1;
/* if-eq p1, v0, :cond_4 */
/* .line 67 */
v0 = com.funbox.game.ang.Animal$ANIMAL_SITE.B2;
/* if-eq p1, v0, :cond_4 */
/* .line 68 */
v0 = com.funbox.game.ang.Animal$ANIMAL_SITE.B3;
/* if-ne p1, v0, :cond_5 */
/* .line 69 */
} // :cond_4
/* const/16 v0, 0x130 */
} // :cond_5
/* move v0, v1 */
/* .line 71 */
} // .end method
