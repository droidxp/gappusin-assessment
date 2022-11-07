public abstract class org.anddev.andengine.opengl.texture.atlas.bitmap.source.PictureBitmapTextureAtlasSource extends org.anddev.andengine.opengl.texture.source.BaseTextureAtlasSource implements org.anddev.andengine.opengl.texture.atlas.bitmap.source.IBitmapTextureAtlasSource {
	 /* # interfaces */
	 /* # instance fields */
	 protected final Integer mHeight;
	 protected final android.graphics.Picture mPicture;
	 protected final Integer mWidth;
	 /* # direct methods */
	 public org.anddev.andengine.opengl.texture.atlas.bitmap.source.PictureBitmapTextureAtlasSource ( ) {
		 /* .locals 1 */
		 int v0 = 0; // const/4 v0, 0x0
		 /* invoke-direct {p0, p1, v0, v0}, Lorg/anddev/andengine/opengl/texture/atlas/bitmap/source/PictureBitmapTextureAtlasSource;-><init>(Landroid/graphics/Picture;II)V */
		 return;
	 } // .end method
	 public org.anddev.andengine.opengl.texture.atlas.bitmap.source.PictureBitmapTextureAtlasSource ( ) {
		 /* .locals 6 */
		 v4 = 		 (( android.graphics.Picture ) p1 ).getWidth ( ); // invoke-virtual {p1}, Landroid/graphics/Picture;->getWidth()I
		 v5 = 		 (( android.graphics.Picture ) p1 ).getHeight ( ); // invoke-virtual {p1}, Landroid/graphics/Picture;->getHeight()I
		 /* move-object v0, p0 */
		 /* move-object v1, p1 */
		 /* move v2, p2 */
		 /* move v3, p3 */
		 /* invoke-direct/range {v0 ..v5}, Lorg/anddev/andengine/opengl/texture/atlas/bitmap/source/PictureBitmapTextureAtlasSource;-><init>(Landroid/graphics/Picture;IIII)V */
		 return;
	 } // .end method
	 public org.anddev.andengine.opengl.texture.atlas.bitmap.source.PictureBitmapTextureAtlasSource ( ) {
		 /* .locals 6 */
		 v0 = 		 (( android.graphics.Picture ) p1 ).getWidth ( ); // invoke-virtual {p1}, Landroid/graphics/Picture;->getWidth()I
		 /* int-to-float v0, v0 */
		 /* mul-float/2addr v0, p4 */
		 v4 = 		 java.lang.Math .round ( v0 );
		 v0 = 		 (( android.graphics.Picture ) p1 ).getHeight ( ); // invoke-virtual {p1}, Landroid/graphics/Picture;->getHeight()I
		 /* int-to-float v0, v0 */
		 /* mul-float/2addr v0, p4 */
		 v5 = 		 java.lang.Math .round ( v0 );
		 /* move-object v0, p0 */
		 /* move-object v1, p1 */
		 /* move v2, p2 */
		 /* move v3, p3 */
		 /* invoke-direct/range {v0 ..v5}, Lorg/anddev/andengine/opengl/texture/atlas/bitmap/source/PictureBitmapTextureAtlasSource;-><init>(Landroid/graphics/Picture;IIII)V */
		 return;
	 } // .end method
	 public org.anddev.andengine.opengl.texture.atlas.bitmap.source.PictureBitmapTextureAtlasSource ( ) {
		 /* .locals 0 */
		 /* invoke-direct {p0, p2, p3}, Lorg/anddev/andengine/opengl/texture/source/BaseTextureAtlasSource;-><init>(II)V */
		 this.mPicture = p1;
		 /* iput p4, p0, Lorg/anddev/andengine/opengl/texture/atlas/bitmap/source/PictureBitmapTextureAtlasSource;->mWidth:I */
		 /* iput p5, p0, Lorg/anddev/andengine/opengl/texture/atlas/bitmap/source/PictureBitmapTextureAtlasSource;->mHeight:I */
		 return;
	 } // .end method
	 /* # virtual methods */
	 public org.anddev.andengine.opengl.texture.atlas.bitmap.source.IBitmapTextureAtlasSource clone ( ) { //bridge//synthethic
		 /* .locals 1 */
		 (( org.anddev.andengine.opengl.texture.atlas.bitmap.source.PictureBitmapTextureAtlasSource ) p0 ).clone ( ); // invoke-virtual {p0}, Lorg/anddev/andengine/opengl/texture/atlas/bitmap/source/PictureBitmapTextureAtlasSource;->clone()Lorg/anddev/andengine/opengl/texture/atlas/bitmap/source/PictureBitmapTextureAtlasSource;
	 } // .end method
	 public abstract org.anddev.andengine.opengl.texture.atlas.bitmap.source.PictureBitmapTextureAtlasSource clone ( ) {
	 } // .end method
	 public org.anddev.andengine.opengl.texture.source.BaseTextureAtlasSource clone ( ) { //bridge//synthethic
		 /* .locals 1 */
		 (( org.anddev.andengine.opengl.texture.atlas.bitmap.source.PictureBitmapTextureAtlasSource ) p0 ).clone ( ); // invoke-virtual {p0}, Lorg/anddev/andengine/opengl/texture/atlas/bitmap/source/PictureBitmapTextureAtlasSource;->clone()Lorg/anddev/andengine/opengl/texture/atlas/bitmap/source/PictureBitmapTextureAtlasSource;
	 } // .end method
	 public org.anddev.andengine.opengl.texture.source.ITextureAtlasSource clone ( ) { //bridge//synthethic
		 /* .locals 1 */
		 (( org.anddev.andengine.opengl.texture.atlas.bitmap.source.PictureBitmapTextureAtlasSource ) p0 ).clone ( ); // invoke-virtual {p0}, Lorg/anddev/andengine/opengl/texture/atlas/bitmap/source/PictureBitmapTextureAtlasSource;->clone()Lorg/anddev/andengine/opengl/texture/atlas/bitmap/source/PictureBitmapTextureAtlasSource;
	 } // .end method
	 public Integer getHeight ( ) {
		 /* .locals 1 */
		 /* iget v0, p0, Lorg/anddev/andengine/opengl/texture/atlas/bitmap/source/PictureBitmapTextureAtlasSource;->mHeight:I */
	 } // .end method
	 public Integer getWidth ( ) {
		 /* .locals 1 */
		 /* iget v0, p0, Lorg/anddev/andengine/opengl/texture/atlas/bitmap/source/PictureBitmapTextureAtlasSource;->mWidth:I */
	 } // .end method
	 public android.graphics.Bitmap onLoadBitmap ( android.graphics.Bitmap$Config p0 ) {
		 /* .locals 7 */
		 int v6 = 0; // const/4 v6, 0x0
		 v0 = this.mPicture;
		 /* if-nez v0, :cond_0 */
		 final String v0 = "Failed loading Bitmap in PictureBitmapTextureAtlasSource."; // const-string v0, "Failed loading Bitmap in PictureBitmapTextureAtlasSource."
		 org.anddev.andengine.util.Debug .e ( v0 );
		 int v0 = 0; // const/4 v0, 0x0
	 } // :goto_0
} // :cond_0
/* iget v1, p0, Lorg/anddev/andengine/opengl/texture/atlas/bitmap/source/PictureBitmapTextureAtlasSource;->mWidth:I */
/* iget v2, p0, Lorg/anddev/andengine/opengl/texture/atlas/bitmap/source/PictureBitmapTextureAtlasSource;->mHeight:I */
android.graphics.Bitmap .createBitmap ( v1,v2,p1 );
/* new-instance v2, Landroid/graphics/Canvas; */
/* invoke-direct {v2, v1}, Landroid/graphics/Canvas;-><init>(Landroid/graphics/Bitmap;)V */
/* iget v3, p0, Lorg/anddev/andengine/opengl/texture/atlas/bitmap/source/PictureBitmapTextureAtlasSource;->mWidth:I */
/* int-to-float v3, v3 */
v4 = this.mPicture;
v4 = (( android.graphics.Picture ) v4 ).getWidth ( ); // invoke-virtual {v4}, Landroid/graphics/Picture;->getWidth()I
/* int-to-float v4, v4 */
/* div-float/2addr v3, v4 */
/* iget v4, p0, Lorg/anddev/andengine/opengl/texture/atlas/bitmap/source/PictureBitmapTextureAtlasSource;->mHeight:I */
/* int-to-float v4, v4 */
v5 = this.mPicture;
v5 = (( android.graphics.Picture ) v5 ).getHeight ( ); // invoke-virtual {v5}, Landroid/graphics/Picture;->getHeight()I
/* int-to-float v5, v5 */
/* div-float/2addr v4, v5 */
(( android.graphics.Canvas ) v2 ).scale ( v3, v4, v6, v6 ); // invoke-virtual {v2, v3, v4, v6, v6}, Landroid/graphics/Canvas;->scale(FFFF)V
(( android.graphics.Picture ) v0 ).draw ( v2 ); // invoke-virtual {v0, v2}, Landroid/graphics/Picture;->draw(Landroid/graphics/Canvas;)V
/* move-object v0, v1 */
} // .end method
