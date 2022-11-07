public class org.anddev.andengine.opengl.texture.atlas.bitmap.source.ResourceBitmapTextureAtlasSource extends org.anddev.andengine.opengl.texture.source.BaseTextureAtlasSource implements org.anddev.andengine.opengl.texture.atlas.bitmap.source.IBitmapTextureAtlasSource {
	 /* # interfaces */
	 /* # instance fields */
	 private final android.content.Context mContext;
	 private final Integer mDrawableResourceID;
	 private final Integer mHeight;
	 private final Integer mWidth;
	 /* # direct methods */
	 public org.anddev.andengine.opengl.texture.atlas.bitmap.source.ResourceBitmapTextureAtlasSource ( ) {
		 /* .locals 1 */
		 int v0 = 0; // const/4 v0, 0x0
		 /* invoke-direct {p0, p1, p2, v0, v0}, Lorg/anddev/andengine/opengl/texture/atlas/bitmap/source/ResourceBitmapTextureAtlasSource;-><init>(Landroid/content/Context;III)V */
		 return;
	 } // .end method
	 public org.anddev.andengine.opengl.texture.atlas.bitmap.source.ResourceBitmapTextureAtlasSource ( ) {
		 /* .locals 2 */
		 /* invoke-direct {p0, p3, p4}, Lorg/anddev/andengine/opengl/texture/source/BaseTextureAtlasSource;-><init>(II)V */
		 this.mContext = p1;
		 /* iput p2, p0, Lorg/anddev/andengine/opengl/texture/atlas/bitmap/source/ResourceBitmapTextureAtlasSource;->mDrawableResourceID:I */
		 /* new-instance v0, Landroid/graphics/BitmapFactory$Options; */
		 /* invoke-direct {v0}, Landroid/graphics/BitmapFactory$Options;-><init>()V */
		 int v1 = 1; // const/4 v1, 0x1
		 /* iput-boolean v1, v0, Landroid/graphics/BitmapFactory$Options;->inJustDecodeBounds:Z */
		 (( android.content.Context ) p1 ).getResources ( ); // invoke-virtual {p1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;
		 android.graphics.BitmapFactory .decodeResource ( v1,p2,v0 );
		 /* iget v1, v0, Landroid/graphics/BitmapFactory$Options;->outWidth:I */
		 /* iput v1, p0, Lorg/anddev/andengine/opengl/texture/atlas/bitmap/source/ResourceBitmapTextureAtlasSource;->mWidth:I */
		 /* iget v0, v0, Landroid/graphics/BitmapFactory$Options;->outHeight:I */
		 /* iput v0, p0, Lorg/anddev/andengine/opengl/texture/atlas/bitmap/source/ResourceBitmapTextureAtlasSource;->mHeight:I */
		 return;
	 } // .end method
	 protected org.anddev.andengine.opengl.texture.atlas.bitmap.source.ResourceBitmapTextureAtlasSource ( ) {
		 /* .locals 0 */
		 /* invoke-direct {p0, p3, p4}, Lorg/anddev/andengine/opengl/texture/source/BaseTextureAtlasSource;-><init>(II)V */
		 this.mContext = p1;
		 /* iput p2, p0, Lorg/anddev/andengine/opengl/texture/atlas/bitmap/source/ResourceBitmapTextureAtlasSource;->mDrawableResourceID:I */
		 /* iput p5, p0, Lorg/anddev/andengine/opengl/texture/atlas/bitmap/source/ResourceBitmapTextureAtlasSource;->mWidth:I */
		 /* iput p6, p0, Lorg/anddev/andengine/opengl/texture/atlas/bitmap/source/ResourceBitmapTextureAtlasSource;->mHeight:I */
		 return;
	 } // .end method
	 /* # virtual methods */
	 public org.anddev.andengine.opengl.texture.atlas.bitmap.source.IBitmapTextureAtlasSource clone ( ) { //bridge//synthethic
		 /* .locals 1 */
		 (( org.anddev.andengine.opengl.texture.atlas.bitmap.source.ResourceBitmapTextureAtlasSource ) p0 ).clone ( ); // invoke-virtual {p0}, Lorg/anddev/andengine/opengl/texture/atlas/bitmap/source/ResourceBitmapTextureAtlasSource;->clone()Lorg/anddev/andengine/opengl/texture/atlas/bitmap/source/ResourceBitmapTextureAtlasSource;
	 } // .end method
	 public org.anddev.andengine.opengl.texture.atlas.bitmap.source.ResourceBitmapTextureAtlasSource clone ( ) {
		 /* .locals 7 */
		 /* new-instance v0, Lorg/anddev/andengine/opengl/texture/atlas/bitmap/source/ResourceBitmapTextureAtlasSource; */
		 v1 = this.mContext;
		 /* iget v2, p0, Lorg/anddev/andengine/opengl/texture/atlas/bitmap/source/ResourceBitmapTextureAtlasSource;->mDrawableResourceID:I */
		 /* iget v3, p0, Lorg/anddev/andengine/opengl/texture/atlas/bitmap/source/ResourceBitmapTextureAtlasSource;->mTexturePositionX:I */
		 /* iget v4, p0, Lorg/anddev/andengine/opengl/texture/atlas/bitmap/source/ResourceBitmapTextureAtlasSource;->mTexturePositionY:I */
		 /* iget v5, p0, Lorg/anddev/andengine/opengl/texture/atlas/bitmap/source/ResourceBitmapTextureAtlasSource;->mWidth:I */
		 /* iget v6, p0, Lorg/anddev/andengine/opengl/texture/atlas/bitmap/source/ResourceBitmapTextureAtlasSource;->mHeight:I */
		 /* invoke-direct/range {v0 ..v6}, Lorg/anddev/andengine/opengl/texture/atlas/bitmap/source/ResourceBitmapTextureAtlasSource;-><init>(Landroid/content/Context;IIIII)V */
	 } // .end method
	 public org.anddev.andengine.opengl.texture.source.BaseTextureAtlasSource clone ( ) { //bridge//synthethic
		 /* .locals 1 */
		 (( org.anddev.andengine.opengl.texture.atlas.bitmap.source.ResourceBitmapTextureAtlasSource ) p0 ).clone ( ); // invoke-virtual {p0}, Lorg/anddev/andengine/opengl/texture/atlas/bitmap/source/ResourceBitmapTextureAtlasSource;->clone()Lorg/anddev/andengine/opengl/texture/atlas/bitmap/source/ResourceBitmapTextureAtlasSource;
	 } // .end method
	 public org.anddev.andengine.opengl.texture.source.ITextureAtlasSource clone ( ) { //bridge//synthethic
		 /* .locals 1 */
		 (( org.anddev.andengine.opengl.texture.atlas.bitmap.source.ResourceBitmapTextureAtlasSource ) p0 ).clone ( ); // invoke-virtual {p0}, Lorg/anddev/andengine/opengl/texture/atlas/bitmap/source/ResourceBitmapTextureAtlasSource;->clone()Lorg/anddev/andengine/opengl/texture/atlas/bitmap/source/ResourceBitmapTextureAtlasSource;
	 } // .end method
	 public Integer getHeight ( ) {
		 /* .locals 1 */
		 /* iget v0, p0, Lorg/anddev/andengine/opengl/texture/atlas/bitmap/source/ResourceBitmapTextureAtlasSource;->mHeight:I */
	 } // .end method
	 public Integer getWidth ( ) {
		 /* .locals 1 */
		 /* iget v0, p0, Lorg/anddev/andengine/opengl/texture/atlas/bitmap/source/ResourceBitmapTextureAtlasSource;->mWidth:I */
	 } // .end method
	 public android.graphics.Bitmap onLoadBitmap ( android.graphics.Bitmap$Config p0 ) {
		 /* .locals 3 */
		 /* new-instance v0, Landroid/graphics/BitmapFactory$Options; */
		 /* invoke-direct {v0}, Landroid/graphics/BitmapFactory$Options;-><init>()V */
		 this.inPreferredConfig = p1;
		 v1 = this.mContext;
		 (( android.content.Context ) v1 ).getResources ( ); // invoke-virtual {v1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;
		 /* iget v2, p0, Lorg/anddev/andengine/opengl/texture/atlas/bitmap/source/ResourceBitmapTextureAtlasSource;->mDrawableResourceID:I */
		 android.graphics.BitmapFactory .decodeResource ( v1,v2,v0 );
	 } // .end method
	 public java.lang.String toString ( ) {
		 /* .locals 2 */
		 /* new-instance v0, Ljava/lang/StringBuilder; */
		 (( java.lang.Object ) p0 ).getClass ( ); // invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;
		 (( java.lang.Class ) v1 ).getSimpleName ( ); // invoke-virtual {v1}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;
		 java.lang.String .valueOf ( v1 );
		 /* invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V */
		 final String v1 = "("; // const-string v1, "("
		 (( java.lang.StringBuilder ) v0 ).append ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
		 /* iget v1, p0, Lorg/anddev/andengine/opengl/texture/atlas/bitmap/source/ResourceBitmapTextureAtlasSource;->mDrawableResourceID:I */
		 (( java.lang.StringBuilder ) v0 ).append ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;
		 final String v1 = ")"; // const-string v1, ")"
		 (( java.lang.StringBuilder ) v0 ).append ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
		 (( java.lang.StringBuilder ) v0 ).toString ( ); // invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
	 } // .end method
