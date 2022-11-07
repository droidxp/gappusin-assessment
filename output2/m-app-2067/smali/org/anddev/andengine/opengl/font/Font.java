public class org.anddev.andengine.opengl.font.Font {
	 /* # static fields */
	 private static final Integer LETTER_EXTRA_WIDTH;
	 protected static final Float LETTER_LEFT_OFFSET;
	 /* # instance fields */
	 private final android.graphics.Paint mBackgroundPaint;
	 private final org.anddev.andengine.opengl.texture.atlas.bitmap.BitmapTextureAtlas mBitmapTextureAtlas;
	 protected final android.graphics.Canvas mCanvas;
	 private final org.anddev.andengine.opengl.font.Size mCreateLetterTemporarySize;
	 private Integer mCurrentTextureX;
	 private Integer mCurrentTextureY;
	 protected final android.graphics.Paint$FontMetrics mFontMetrics;
	 private final android.graphics.Rect mGetLetterBitmapTemporaryRect;
	 private final android.graphics.Rect mGetLetterBoundsTemporaryRect;
	 private final android.graphics.Rect mGetStringWidthTemporaryRect;
	 private final java.util.ArrayList mLettersPendingToBeDrawnToTexture;
	 private final Integer mLineGap;
	 private final Integer mLineHeight;
	 private final android.util.SparseArray mManagedCharacterToLetterMap;
	 protected final android.graphics.Paint mPaint;
	 private final mTemporaryTextWidthFetchers;
	 private final Float mTextureHeight;
	 private final Float mTextureWidth;
	 /* # direct methods */
	 public org.anddev.andengine.opengl.font.Font ( ) {
		 /* .locals 2 */
		 int v1 = 0; // const/4 v1, 0x0
		 /* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
		 /* iput v1, p0, Lorg/anddev/andengine/opengl/font/Font;->mCurrentTextureX:I */
		 /* iput v1, p0, Lorg/anddev/andengine/opengl/font/Font;->mCurrentTextureY:I */
		 /* new-instance v0, Landroid/util/SparseArray; */
		 /* invoke-direct {v0}, Landroid/util/SparseArray;-><init>()V */
		 this.mManagedCharacterToLetterMap = v0;
		 /* new-instance v0, Ljava/util/ArrayList; */
		 /* invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V */
		 this.mLettersPendingToBeDrawnToTexture = v0;
		 /* new-instance v0, Lorg/anddev/andengine/opengl/font/Size; */
		 /* invoke-direct {v0}, Lorg/anddev/andengine/opengl/font/Size;-><init>()V */
		 this.mCreateLetterTemporarySize = v0;
		 /* new-instance v0, Landroid/graphics/Rect; */
		 /* invoke-direct {v0}, Landroid/graphics/Rect;-><init>()V */
		 this.mGetLetterBitmapTemporaryRect = v0;
		 /* new-instance v0, Landroid/graphics/Rect; */
		 /* invoke-direct {v0}, Landroid/graphics/Rect;-><init>()V */
		 this.mGetStringWidthTemporaryRect = v0;
		 /* new-instance v0, Landroid/graphics/Rect; */
		 /* invoke-direct {v0}, Landroid/graphics/Rect;-><init>()V */
		 this.mGetLetterBoundsTemporaryRect = v0;
		 int v0 = 1; // const/4 v0, 0x1
		 /* new-array v0, v0, [F */
		 this.mTemporaryTextWidthFetchers = v0;
		 /* new-instance v0, Landroid/graphics/Canvas; */
		 /* invoke-direct {v0}, Landroid/graphics/Canvas;-><init>()V */
		 this.mCanvas = v0;
		 this.mBitmapTextureAtlas = p1;
		 v0 = 		 (( org.anddev.andengine.opengl.texture.atlas.bitmap.BitmapTextureAtlas ) p1 ).getWidth ( ); // invoke-virtual {p1}, Lorg/anddev/andengine/opengl/texture/atlas/bitmap/BitmapTextureAtlas;->getWidth()I
		 /* int-to-float v0, v0 */
		 /* iput v0, p0, Lorg/anddev/andengine/opengl/font/Font;->mTextureWidth:F */
		 v0 = 		 (( org.anddev.andengine.opengl.texture.atlas.bitmap.BitmapTextureAtlas ) p1 ).getHeight ( ); // invoke-virtual {p1}, Lorg/anddev/andengine/opengl/texture/atlas/bitmap/BitmapTextureAtlas;->getHeight()I
		 /* int-to-float v0, v0 */
		 /* iput v0, p0, Lorg/anddev/andengine/opengl/font/Font;->mTextureHeight:F */
		 /* new-instance v0, Landroid/graphics/Paint; */
		 /* invoke-direct {v0}, Landroid/graphics/Paint;-><init>()V */
		 this.mPaint = v0;
		 v0 = this.mPaint;
		 (( android.graphics.Paint ) v0 ).setTypeface ( p2 ); // invoke-virtual {v0, p2}, Landroid/graphics/Paint;->setTypeface(Landroid/graphics/Typeface;)Landroid/graphics/Typeface;
		 v0 = this.mPaint;
		 (( android.graphics.Paint ) v0 ).setColor ( p5 ); // invoke-virtual {v0, p5}, Landroid/graphics/Paint;->setColor(I)V
		 v0 = this.mPaint;
		 (( android.graphics.Paint ) v0 ).setTextSize ( p3 ); // invoke-virtual {v0, p3}, Landroid/graphics/Paint;->setTextSize(F)V
		 v0 = this.mPaint;
		 (( android.graphics.Paint ) v0 ).setAntiAlias ( p4 ); // invoke-virtual {v0, p4}, Landroid/graphics/Paint;->setAntiAlias(Z)V
		 /* new-instance v0, Landroid/graphics/Paint; */
		 /* invoke-direct {v0}, Landroid/graphics/Paint;-><init>()V */
		 this.mBackgroundPaint = v0;
		 v0 = this.mBackgroundPaint;
		 (( android.graphics.Paint ) v0 ).setColor ( v1 ); // invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setColor(I)V
		 v0 = this.mBackgroundPaint;
		 v1 = android.graphics.Paint$Style.FILL;
		 (( android.graphics.Paint ) v0 ).setStyle ( v1 ); // invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setStyle(Landroid/graphics/Paint$Style;)V
		 v0 = this.mPaint;
		 (( android.graphics.Paint ) v0 ).getFontMetrics ( ); // invoke-virtual {v0}, Landroid/graphics/Paint;->getFontMetrics()Landroid/graphics/Paint$FontMetrics;
		 this.mFontMetrics = v0;
		 v0 = this.mFontMetrics;
		 /* iget v0, v0, Landroid/graphics/Paint$FontMetrics;->ascent:F */
		 v0 = 		 java.lang.Math .abs ( v0 );
		 v1 = this.mFontMetrics;
		 /* iget v1, v1, Landroid/graphics/Paint$FontMetrics;->descent:F */
		 v1 = 		 java.lang.Math .abs ( v1 );
		 /* add-float/2addr v0, v1 */
		 v0 = 		 android.util.FloatMath .ceil ( v0 );
		 /* float-to-int v0, v0 */
		 /* iput v0, p0, Lorg/anddev/andengine/opengl/font/Font;->mLineHeight:I */
		 v0 = this.mFontMetrics;
		 /* iget v0, v0, Landroid/graphics/Paint$FontMetrics;->leading:F */
		 v0 = 		 android.util.FloatMath .ceil ( v0 );
		 /* float-to-int v0, v0 */
		 /* iput v0, p0, Lorg/anddev/andengine/opengl/font/Font;->mLineGap:I */
		 return;
	 } // .end method
	 private org.anddev.andengine.opengl.font.Letter createLetter ( Object p0 ) {
		 /* .locals 10 */
		 /* iget v0, p0, Lorg/anddev/andengine/opengl/font/Font;->mTextureWidth:F */
		 /* iget v1, p0, Lorg/anddev/andengine/opengl/font/Font;->mTextureHeight:F */
		 v2 = this.mCreateLetterTemporarySize;
		 /* invoke-direct {p0, p1, v2}, Lorg/anddev/andengine/opengl/font/Font;->getLetterBounds(CLorg/anddev/andengine/opengl/font/Size;)V */
		 v9 = 		 (( org.anddev.andengine.opengl.font.Size ) v2 ).getWidth ( ); // invoke-virtual {v2}, Lorg/anddev/andengine/opengl/font/Size;->getWidth()F
		 v4 = 		 (( org.anddev.andengine.opengl.font.Size ) v2 ).getHeight ( ); // invoke-virtual {v2}, Lorg/anddev/andengine/opengl/font/Size;->getHeight()F
		 /* iget v2, p0, Lorg/anddev/andengine/opengl/font/Font;->mCurrentTextureX:I */
		 /* int-to-float v2, v2 */
		 /* add-float/2addr v2, v9 */
		 /* cmpl-float v2, v2, v0 */
		 /* if-ltz v2, :cond_0 */
		 int v2 = 0; // const/4 v2, 0x0
		 /* iput v2, p0, Lorg/anddev/andengine/opengl/font/Font;->mCurrentTextureX:I */
		 /* iget v2, p0, Lorg/anddev/andengine/opengl/font/Font;->mCurrentTextureY:I */
		 v3 = 		 (( org.anddev.andengine.opengl.font.Font ) p0 ).getLineGap ( ); // invoke-virtual {p0}, Lorg/anddev/andengine/opengl/font/Font;->getLineGap()I
		 v5 = 		 (( org.anddev.andengine.opengl.font.Font ) p0 ).getLineHeight ( ); // invoke-virtual {p0}, Lorg/anddev/andengine/opengl/font/Font;->getLineHeight()I
		 /* add-int/2addr v3, v5 */
		 /* add-int/2addr v2, v3 */
		 /* iput v2, p0, Lorg/anddev/andengine/opengl/font/Font;->mCurrentTextureY:I */
	 } // :cond_0
	 /* iget v2, p0, Lorg/anddev/andengine/opengl/font/Font;->mCurrentTextureX:I */
	 /* int-to-float v2, v2 */
	 /* div-float v5, v2, v0 */
	 /* iget v2, p0, Lorg/anddev/andengine/opengl/font/Font;->mCurrentTextureY:I */
	 /* int-to-float v2, v2 */
	 /* div-float v6, v2, v1 */
	 /* div-float v7, v9, v0 */
	 /* div-float v8, v4, v1 */
	 /* new-instance v0, Lorg/anddev/andengine/opengl/font/Letter; */
	 v2 = 	 /* invoke-direct {p0, p1}, Lorg/anddev/andengine/opengl/font/Font;->getLetterAdvance(C)I */
	 /* float-to-int v3, v9 */
	 /* float-to-int v4, v4 */
	 /* move v1, p1 */
	 /* invoke-direct/range {v0 ..v8}, Lorg/anddev/andengine/opengl/font/Letter;-><init>(CIIIFFFF)V */
	 /* iget v1, p0, Lorg/anddev/andengine/opengl/font/Font;->mCurrentTextureX:I */
	 /* int-to-float v1, v1 */
	 /* add-float/2addr v1, v9 */
	 /* float-to-int v1, v1 */
	 /* iput v1, p0, Lorg/anddev/andengine/opengl/font/Font;->mCurrentTextureX:I */
} // .end method
private Integer getLetterAdvance ( Object p0 ) {
	 /* .locals 3 */
	 v0 = this.mPaint;
	 java.lang.String .valueOf ( p1 );
	 v2 = this.mTemporaryTextWidthFetchers;
	 (( android.graphics.Paint ) v0 ).getTextWidths ( v1, v2 ); // invoke-virtual {v0, v1, v2}, Landroid/graphics/Paint;->getTextWidths(Ljava/lang/String;[F)I
	 v0 = this.mTemporaryTextWidthFetchers;
	 int v1 = 0; // const/4 v1, 0x0
	 /* aget v0, v0, v1 */
	 v0 = 	 android.util.FloatMath .ceil ( v0 );
	 /* float-to-int v0, v0 */
} // .end method
private android.graphics.Bitmap getLetterBitmap ( Object p0 ) {
	 /* .locals 8 */
	 int v5 = 1; // const/4 v5, 0x1
	 int v1 = 0; // const/4 v1, 0x0
	 v2 = this.mGetLetterBitmapTemporaryRect;
	 java.lang.String .valueOf ( p1 );
	 v0 = this.mPaint;
	 int v3 = 0; // const/4 v3, 0x0
	 (( android.graphics.Paint ) v0 ).getTextBounds ( v6, v3, v5, v2 ); // invoke-virtual {v0, v6, v3, v5, v2}, Landroid/graphics/Paint;->getTextBounds(Ljava/lang/String;IILandroid/graphics/Rect;)V
	 v4 = 	 (( org.anddev.andengine.opengl.font.Font ) p0 ).getLineHeight ( ); // invoke-virtual {p0}, Lorg/anddev/andengine/opengl/font/Font;->getLineHeight()I
	 v0 = 	 (( android.graphics.Rect ) v2 ).width ( ); // invoke-virtual {v2}, Landroid/graphics/Rect;->width()I
	 /* if-nez v0, :cond_0 */
	 /* move v0, v5 */
} // :goto_0
v3 = android.graphics.Bitmap$Config.ARGB_8888;
android.graphics.Bitmap .createBitmap ( v0,v4,v3 );
v0 = this.mCanvas;
(( android.graphics.Canvas ) v0 ).setBitmap ( v7 ); // invoke-virtual {v0, v7}, Landroid/graphics/Canvas;->setBitmap(Landroid/graphics/Bitmap;)V
v0 = this.mCanvas;
v2 = (( android.graphics.Rect ) v2 ).width ( ); // invoke-virtual {v2}, Landroid/graphics/Rect;->width()I
/* add-int/lit8 v2, v2, 0xa */
/* int-to-float v3, v2 */
/* int-to-float v4, v4 */
v5 = this.mBackgroundPaint;
/* move v2, v1 */
/* invoke-virtual/range {v0 ..v5}, Landroid/graphics/Canvas;->drawRect(FFFFLandroid/graphics/Paint;)V */
(( org.anddev.andengine.opengl.font.Font ) p0 ).drawCharacterString ( v6 ); // invoke-virtual {p0, v6}, Lorg/anddev/andengine/opengl/font/Font;->drawCharacterString(Ljava/lang/String;)V
} // :cond_0
v0 = (( android.graphics.Rect ) v2 ).width ( ); // invoke-virtual {v2}, Landroid/graphics/Rect;->width()I
/* add-int/lit8 v0, v0, 0xa */
} // .end method
private void getLetterBounds ( Object p0, org.anddev.andengine.opengl.font.Size p1 ) {
/* .locals 5 */
v0 = this.mPaint;
java.lang.String .valueOf ( p1 );
int v2 = 0; // const/4 v2, 0x0
int v3 = 1; // const/4 v3, 0x1
v4 = this.mGetLetterBoundsTemporaryRect;
(( android.graphics.Paint ) v0 ).getTextBounds ( v1, v2, v3, v4 ); // invoke-virtual {v0, v1, v2, v3, v4}, Landroid/graphics/Paint;->getTextBounds(Ljava/lang/String;IILandroid/graphics/Rect;)V
v0 = this.mGetLetterBoundsTemporaryRect;
v0 = (( android.graphics.Rect ) v0 ).width ( ); // invoke-virtual {v0}, Landroid/graphics/Rect;->width()I
/* add-int/lit8 v0, v0, 0xa */
v1 = (( org.anddev.andengine.opengl.font.Font ) p0 ).getLineHeight ( ); // invoke-virtual {p0}, Lorg/anddev/andengine/opengl/font/Font;->getLineHeight()I
(( org.anddev.andengine.opengl.font.Size ) p2 ).set ( v0, v1 ); // invoke-virtual {p2, v0, v1}, Lorg/anddev/andengine/opengl/font/Size;->set(II)V
return;
} // .end method
/* # virtual methods */
protected void drawCharacterString ( java.lang.String p0 ) {
/* .locals 4 */
v0 = this.mCanvas;
int v1 = 0; // const/4 v1, 0x0
v2 = this.mFontMetrics;
/* iget v2, v2, Landroid/graphics/Paint$FontMetrics;->ascent:F */
/* neg-float v2, v2 */
v3 = this.mPaint;
(( android.graphics.Canvas ) v0 ).drawText ( p1, v1, v2, v3 ); // invoke-virtual {v0, p1, v1, v2, v3}, Landroid/graphics/Canvas;->drawText(Ljava/lang/String;FFLandroid/graphics/Paint;)V
return;
} // .end method
public org.anddev.andengine.opengl.texture.atlas.bitmap.BitmapTextureAtlas getBitmapTextureAtlas ( ) {
/* .locals 1 */
v0 = this.mBitmapTextureAtlas;
} // .end method
public synchronized org.anddev.andengine.opengl.font.Letter getLetter ( Object p0 ) {
/* .locals 3 */
/* monitor-enter p0 */
try { // :try_start_0
v1 = this.mManagedCharacterToLetterMap;
(( android.util.SparseArray ) v1 ).get ( p1 ); // invoke-virtual {v1, p1}, Landroid/util/SparseArray;->get(I)Ljava/lang/Object;
/* check-cast v0, Lorg/anddev/andengine/opengl/font/Letter; */
/* if-nez v0, :cond_0 */
/* invoke-direct {p0, p1}, Lorg/anddev/andengine/opengl/font/Font;->createLetter(C)Lorg/anddev/andengine/opengl/font/Letter; */
v2 = this.mLettersPendingToBeDrawnToTexture;
(( java.util.ArrayList ) v2 ).add ( v0 ); // invoke-virtual {v2, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z
(( android.util.SparseArray ) v1 ).put ( p1, v0 ); // invoke-virtual {v1, p1, v0}, Landroid/util/SparseArray;->put(ILjava/lang/Object;)V
/* :try_end_0 */
/* .catchall {:try_start_0 ..:try_end_0} :catchall_0 */
} // :cond_0
/* monitor-exit p0 */
/* :catchall_0 */
/* move-exception v0 */
/* monitor-exit p0 */
/* throw v0 */
} // .end method
public Integer getLineGap ( ) {
/* .locals 1 */
/* iget v0, p0, Lorg/anddev/andengine/opengl/font/Font;->mLineGap:I */
} // .end method
public Integer getLineHeight ( ) {
/* .locals 1 */
/* iget v0, p0, Lorg/anddev/andengine/opengl/font/Font;->mLineHeight:I */
} // .end method
public Integer getStringWidth ( java.lang.String p0 ) {
/* .locals 4 */
v0 = this.mPaint;
int v1 = 0; // const/4 v1, 0x0
v2 = (( java.lang.String ) p1 ).length ( ); // invoke-virtual {p1}, Ljava/lang/String;->length()I
v3 = this.mGetStringWidthTemporaryRect;
(( android.graphics.Paint ) v0 ).getTextBounds ( p1, v1, v2, v3 ); // invoke-virtual {v0, p1, v1, v2, v3}, Landroid/graphics/Paint;->getTextBounds(Ljava/lang/String;IILandroid/graphics/Rect;)V
v0 = this.mGetStringWidthTemporaryRect;
v0 = (( android.graphics.Rect ) v0 ).width ( ); // invoke-virtual {v0}, Landroid/graphics/Rect;->width()I
} // .end method
public void prepareLetters ( Object...p0 ) {
/* .locals 3 */
/* array-length v0, p1 */
int v1 = 0; // const/4 v1, 0x0
} // :goto_0
/* if-lt v1, v0, :cond_0 */
return;
} // :cond_0
/* aget-char v2, p1, v1 */
(( org.anddev.andengine.opengl.font.Font ) p0 ).getLetter ( v2 ); // invoke-virtual {p0, v2}, Lorg/anddev/andengine/opengl/font/Font;->getLetter(C)Lorg/anddev/andengine/opengl/font/Letter;
/* add-int/lit8 v1, v1, 0x1 */
} // .end method
public synchronized void reload ( ) {
/* .locals 4 */
/* monitor-enter p0 */
try { // :try_start_0
v1 = this.mLettersPendingToBeDrawnToTexture;
v2 = this.mManagedCharacterToLetterMap;
(( android.util.SparseArray ) v2 ).size ( ); // invoke-virtual {v2}, Landroid/util/SparseArray;->size()I
/* :try_end_0 */
v0 = /* .catchall {:try_start_0 ..:try_end_0} :catchall_0 */
int v3 = 1; // const/4 v3, 0x1
/* sub-int/2addr v0, v3 */
/* move v3, v0 */
} // :goto_0
/* if-gez v3, :cond_0 */
/* monitor-exit p0 */
return;
} // :cond_0
try { // :try_start_1
(( android.util.SparseArray ) v2 ).valueAt ( v3 ); // invoke-virtual {v2, v3}, Landroid/util/SparseArray;->valueAt(I)Ljava/lang/Object;
/* check-cast v0, Lorg/anddev/andengine/opengl/font/Letter; */
(( java.util.ArrayList ) v1 ).add ( v0 ); // invoke-virtual {v1, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z
/* :try_end_1 */
/* .catchall {:try_start_1 ..:try_end_1} :catchall_0 */
/* add-int/lit8 v0, v3, -0x1 */
/* move v3, v0 */
/* :catchall_0 */
/* move-exception v0 */
/* monitor-exit p0 */
/* throw v0 */
} // .end method
public synchronized void update ( javax.microedition.khronos.opengles.GL10 p0 ) {
/* .locals 9 */
/* monitor-enter p0 */
try { // :try_start_0
v1 = this.mLettersPendingToBeDrawnToTexture;
v0 = (( java.util.ArrayList ) v1 ).size ( ); // invoke-virtual {v1}, Ljava/util/ArrayList;->size()I
/* if-lez v0, :cond_0 */
v0 = this.mBitmapTextureAtlas;
(( org.anddev.andengine.opengl.texture.atlas.bitmap.BitmapTextureAtlas ) v0 ).bind ( p1 ); // invoke-virtual {v0, p1}, Lorg/anddev/andengine/opengl/texture/atlas/bitmap/BitmapTextureAtlas;->bind(Ljavax/microedition/khronos/opengles/GL10;)V
/* iget v2, p0, Lorg/anddev/andengine/opengl/font/Font;->mTextureWidth:F */
/* iget v3, p0, Lorg/anddev/andengine/opengl/font/Font;->mTextureHeight:F */
v0 = (( java.util.ArrayList ) v1 ).size ( ); // invoke-virtual {v1}, Ljava/util/ArrayList;->size()I
int v4 = 1; // const/4 v4, 0x1
/* sub-int/2addr v0, v4 */
/* move v4, v0 */
} // :goto_0
/* if-gez v4, :cond_1 */
(( java.util.ArrayList ) v1 ).clear ( ); // invoke-virtual {v1}, Ljava/util/ArrayList;->clear()V
java.lang.System .gc ( );
/* :try_end_0 */
/* .catchall {:try_start_0 ..:try_end_0} :catchall_0 */
} // :cond_0
/* monitor-exit p0 */
return;
} // :cond_1
try { // :try_start_1
(( java.util.ArrayList ) v1 ).get ( v4 ); // invoke-virtual {v1, v4}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;
/* check-cast v0, Lorg/anddev/andengine/opengl/font/Letter; */
/* iget-char v5, v0, Lorg/anddev/andengine/opengl/font/Letter;->mCharacter:C */
/* invoke-direct {p0, v5}, Lorg/anddev/andengine/opengl/font/Font;->getLetterBitmap(C)Landroid/graphics/Bitmap; */
/* const/16 v6, 0xde1 */
int v7 = 0; // const/4 v7, 0x0
/* iget v8, v0, Lorg/anddev/andengine/opengl/font/Letter;->mTextureX:F */
/* mul-float/2addr v8, v2 */
/* float-to-int v8, v8 */
/* iget v0, v0, Lorg/anddev/andengine/opengl/font/Letter;->mTextureY:F */
/* mul-float/2addr v0, v3 */
/* float-to-int v0, v0 */
android.opengl.GLUtils .texSubImage2D ( v6,v7,v8,v0,v5 );
(( android.graphics.Bitmap ) v5 ).recycle ( ); // invoke-virtual {v5}, Landroid/graphics/Bitmap;->recycle()V
/* :try_end_1 */
/* .catchall {:try_start_1 ..:try_end_1} :catchall_0 */
/* add-int/lit8 v0, v4, -0x1 */
/* move v4, v0 */
/* :catchall_0 */
/* move-exception v0 */
/* monitor-exit p0 */
/* throw v0 */
} // .end method
