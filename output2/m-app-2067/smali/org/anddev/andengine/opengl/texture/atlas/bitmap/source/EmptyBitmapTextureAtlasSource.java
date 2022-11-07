public class org.anddev.andengine.opengl.texture.atlas.bitmap.source.EmptyBitmapTextureAtlasSource extends org.anddev.andengine.opengl.texture.source.BaseTextureAtlasSource implements org.anddev.andengine.opengl.texture.atlas.bitmap.source.IBitmapTextureAtlasSource {
	 /* # interfaces */
	 /* # instance fields */
	 private final Integer mHeight;
	 private final Integer mWidth;
	 /* # direct methods */
	 public org.anddev.andengine.opengl.texture.atlas.bitmap.source.EmptyBitmapTextureAtlasSource ( ) {
		 /* .locals 1 */
		 int v0 = 0; // const/4 v0, 0x0
		 /* invoke-direct {p0, v0, v0, p1, p2}, Lorg/anddev/andengine/opengl/texture/atlas/bitmap/source/EmptyBitmapTextureAtlasSource;-><init>(IIII)V */
		 return;
	 } // .end method
	 public org.anddev.andengine.opengl.texture.atlas.bitmap.source.EmptyBitmapTextureAtlasSource ( ) {
		 /* .locals 0 */
		 /* invoke-direct {p0, p1, p2}, Lorg/anddev/andengine/opengl/texture/source/BaseTextureAtlasSource;-><init>(II)V */
		 /* iput p3, p0, Lorg/anddev/andengine/opengl/texture/atlas/bitmap/source/EmptyBitmapTextureAtlasSource;->mWidth:I */
		 /* iput p4, p0, Lorg/anddev/andengine/opengl/texture/atlas/bitmap/source/EmptyBitmapTextureAtlasSource;->mHeight:I */
		 return;
	 } // .end method
	 /* # virtual methods */
	 public org.anddev.andengine.opengl.texture.atlas.bitmap.source.EmptyBitmapTextureAtlasSource clone ( ) {
		 /* .locals 5 */
		 /* new-instance v0, Lorg/anddev/andengine/opengl/texture/atlas/bitmap/source/EmptyBitmapTextureAtlasSource; */
		 /* iget v1, p0, Lorg/anddev/andengine/opengl/texture/atlas/bitmap/source/EmptyBitmapTextureAtlasSource;->mTexturePositionX:I */
		 /* iget v2, p0, Lorg/anddev/andengine/opengl/texture/atlas/bitmap/source/EmptyBitmapTextureAtlasSource;->mTexturePositionY:I */
		 /* iget v3, p0, Lorg/anddev/andengine/opengl/texture/atlas/bitmap/source/EmptyBitmapTextureAtlasSource;->mWidth:I */
		 /* iget v4, p0, Lorg/anddev/andengine/opengl/texture/atlas/bitmap/source/EmptyBitmapTextureAtlasSource;->mHeight:I */
		 /* invoke-direct {v0, v1, v2, v3, v4}, Lorg/anddev/andengine/opengl/texture/atlas/bitmap/source/EmptyBitmapTextureAtlasSource;-><init>(IIII)V */
	 } // .end method
	 public org.anddev.andengine.opengl.texture.atlas.bitmap.source.IBitmapTextureAtlasSource clone ( ) { //bridge//synthethic
		 /* .locals 1 */
		 (( org.anddev.andengine.opengl.texture.atlas.bitmap.source.EmptyBitmapTextureAtlasSource ) p0 ).clone ( ); // invoke-virtual {p0}, Lorg/anddev/andengine/opengl/texture/atlas/bitmap/source/EmptyBitmapTextureAtlasSource;->clone()Lorg/anddev/andengine/opengl/texture/atlas/bitmap/source/EmptyBitmapTextureAtlasSource;
	 } // .end method
	 public org.anddev.andengine.opengl.texture.source.BaseTextureAtlasSource clone ( ) { //bridge//synthethic
		 /* .locals 1 */
		 (( org.anddev.andengine.opengl.texture.atlas.bitmap.source.EmptyBitmapTextureAtlasSource ) p0 ).clone ( ); // invoke-virtual {p0}, Lorg/anddev/andengine/opengl/texture/atlas/bitmap/source/EmptyBitmapTextureAtlasSource;->clone()Lorg/anddev/andengine/opengl/texture/atlas/bitmap/source/EmptyBitmapTextureAtlasSource;
	 } // .end method
	 public org.anddev.andengine.opengl.texture.source.ITextureAtlasSource clone ( ) { //bridge//synthethic
		 /* .locals 1 */
		 (( org.anddev.andengine.opengl.texture.atlas.bitmap.source.EmptyBitmapTextureAtlasSource ) p0 ).clone ( ); // invoke-virtual {p0}, Lorg/anddev/andengine/opengl/texture/atlas/bitmap/source/EmptyBitmapTextureAtlasSource;->clone()Lorg/anddev/andengine/opengl/texture/atlas/bitmap/source/EmptyBitmapTextureAtlasSource;
	 } // .end method
	 public Integer getHeight ( ) {
		 /* .locals 1 */
		 /* iget v0, p0, Lorg/anddev/andengine/opengl/texture/atlas/bitmap/source/EmptyBitmapTextureAtlasSource;->mHeight:I */
	 } // .end method
	 public Integer getWidth ( ) {
		 /* .locals 1 */
		 /* iget v0, p0, Lorg/anddev/andengine/opengl/texture/atlas/bitmap/source/EmptyBitmapTextureAtlasSource;->mWidth:I */
	 } // .end method
	 public android.graphics.Bitmap onLoadBitmap ( android.graphics.Bitmap$Config p0 ) {
		 /* .locals 2 */
		 /* iget v0, p0, Lorg/anddev/andengine/opengl/texture/atlas/bitmap/source/EmptyBitmapTextureAtlasSource;->mWidth:I */
		 /* iget v1, p0, Lorg/anddev/andengine/opengl/texture/atlas/bitmap/source/EmptyBitmapTextureAtlasSource;->mHeight:I */
		 android.graphics.Bitmap .createBitmap ( v0,v1,p1 );
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
		 /* iget v1, p0, Lorg/anddev/andengine/opengl/texture/atlas/bitmap/source/EmptyBitmapTextureAtlasSource;->mWidth:I */
		 (( java.lang.StringBuilder ) v0 ).append ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;
		 final String v1 = " x "; // const-string v1, " x "
		 (( java.lang.StringBuilder ) v0 ).append ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
		 /* iget v1, p0, Lorg/anddev/andengine/opengl/texture/atlas/bitmap/source/EmptyBitmapTextureAtlasSource;->mHeight:I */
		 (( java.lang.StringBuilder ) v0 ).append ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;
		 final String v1 = ")"; // const-string v1, ")"
		 (( java.lang.StringBuilder ) v0 ).append ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
		 (( java.lang.StringBuilder ) v0 ).toString ( ); // invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
	 } // .end method
