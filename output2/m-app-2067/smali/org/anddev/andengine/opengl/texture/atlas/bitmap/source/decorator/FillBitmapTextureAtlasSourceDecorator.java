public class org.anddev.andengine.opengl.texture.atlas.bitmap.source.decorator.FillBitmapTextureAtlasSourceDecorator extends org.anddev.andengine.opengl.texture.atlas.bitmap.source.decorator.BaseShapeBitmapTextureAtlasSourceDecorator {
	 /* # instance fields */
	 protected final Integer mFillColor;
	 /* # direct methods */
	 public org.anddev.andengine.opengl.texture.atlas.bitmap.source.decorator.FillBitmapTextureAtlasSourceDecorator ( ) {
		 /* .locals 1 */
		 int v0 = 0; // const/4 v0, 0x0
		 /* invoke-direct {p0, p1, p2, p3, v0}, Lorg/anddev/andengine/opengl/texture/atlas/bitmap/source/decorator/FillBitmapTextureAtlasSourceDecorator;-><init>(Lorg/anddev/andengine/opengl/texture/atlas/bitmap/source/IBitmapTextureAtlasSource;Lorg/anddev/andengine/opengl/texture/atlas/bitmap/source/decorator/shape/IBitmapTextureAtlasSourceDecoratorShape;ILorg/anddev/andengine/opengl/texture/atlas/bitmap/source/decorator/BaseBitmapTextureAtlasSourceDecorator$TextureAtlasSourceDecoratorOptions;)V */
		 return;
	 } // .end method
	 public org.anddev.andengine.opengl.texture.atlas.bitmap.source.decorator.FillBitmapTextureAtlasSourceDecorator ( ) {
		 /* .locals 2 */
		 /* invoke-direct {p0, p1, p2, p4}, Lorg/anddev/andengine/opengl/texture/atlas/bitmap/source/decorator/BaseShapeBitmapTextureAtlasSourceDecorator;-><init>(Lorg/anddev/andengine/opengl/texture/atlas/bitmap/source/IBitmapTextureAtlasSource;Lorg/anddev/andengine/opengl/texture/atlas/bitmap/source/decorator/shape/IBitmapTextureAtlasSourceDecoratorShape;Lorg/anddev/andengine/opengl/texture/atlas/bitmap/source/decorator/BaseBitmapTextureAtlasSourceDecorator$TextureAtlasSourceDecoratorOptions;)V */
		 /* iput p3, p0, Lorg/anddev/andengine/opengl/texture/atlas/bitmap/source/decorator/FillBitmapTextureAtlasSourceDecorator;->mFillColor:I */
		 v0 = this.mPaint;
		 v1 = android.graphics.Paint$Style.FILL;
		 (( android.graphics.Paint ) v0 ).setStyle ( v1 ); // invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setStyle(Landroid/graphics/Paint$Style;)V
		 v0 = this.mPaint;
		 (( android.graphics.Paint ) v0 ).setColor ( p3 ); // invoke-virtual {v0, p3}, Landroid/graphics/Paint;->setColor(I)V
		 return;
	 } // .end method
	 /* # virtual methods */
	 public org.anddev.andengine.opengl.texture.atlas.bitmap.source.IBitmapTextureAtlasSource clone ( ) { //bridge//synthethic
		 /* .locals 1 */
		 (( org.anddev.andengine.opengl.texture.atlas.bitmap.source.decorator.FillBitmapTextureAtlasSourceDecorator ) p0 ).clone ( ); // invoke-virtual {p0}, Lorg/anddev/andengine/opengl/texture/atlas/bitmap/source/decorator/FillBitmapTextureAtlasSourceDecorator;->clone()Lorg/anddev/andengine/opengl/texture/atlas/bitmap/source/decorator/FillBitmapTextureAtlasSourceDecorator;
	 } // .end method
	 public org.anddev.andengine.opengl.texture.atlas.bitmap.source.decorator.BaseShapeBitmapTextureAtlasSourceDecorator clone ( ) { //bridge//synthethic
		 /* .locals 1 */
		 (( org.anddev.andengine.opengl.texture.atlas.bitmap.source.decorator.FillBitmapTextureAtlasSourceDecorator ) p0 ).clone ( ); // invoke-virtual {p0}, Lorg/anddev/andengine/opengl/texture/atlas/bitmap/source/decorator/FillBitmapTextureAtlasSourceDecorator;->clone()Lorg/anddev/andengine/opengl/texture/atlas/bitmap/source/decorator/FillBitmapTextureAtlasSourceDecorator;
	 } // .end method
	 public org.anddev.andengine.opengl.texture.atlas.bitmap.source.decorator.FillBitmapTextureAtlasSourceDecorator clone ( ) {
		 /* .locals 5 */
		 /* new-instance v0, Lorg/anddev/andengine/opengl/texture/atlas/bitmap/source/decorator/FillBitmapTextureAtlasSourceDecorator; */
		 v1 = this.mBitmapTextureAtlasSource;
		 v2 = this.mBitmapTextureAtlasSourceDecoratorShape;
		 /* iget v3, p0, Lorg/anddev/andengine/opengl/texture/atlas/bitmap/source/decorator/FillBitmapTextureAtlasSourceDecorator;->mFillColor:I */
		 v4 = this.mTextureAtlasSourceDecoratorOptions;
		 /* invoke-direct {v0, v1, v2, v3, v4}, Lorg/anddev/andengine/opengl/texture/atlas/bitmap/source/decorator/FillBitmapTextureAtlasSourceDecorator;-><init>(Lorg/anddev/andengine/opengl/texture/atlas/bitmap/source/IBitmapTextureAtlasSource;Lorg/anddev/andengine/opengl/texture/atlas/bitmap/source/decorator/shape/IBitmapTextureAtlasSourceDecoratorShape;ILorg/anddev/andengine/opengl/texture/atlas/bitmap/source/decorator/BaseBitmapTextureAtlasSourceDecorator$TextureAtlasSourceDecoratorOptions;)V */
	 } // .end method
	 public org.anddev.andengine.opengl.texture.source.ITextureAtlasSource clone ( ) { //bridge//synthethic
		 /* .locals 1 */
		 (( org.anddev.andengine.opengl.texture.atlas.bitmap.source.decorator.FillBitmapTextureAtlasSourceDecorator ) p0 ).clone ( ); // invoke-virtual {p0}, Lorg/anddev/andengine/opengl/texture/atlas/bitmap/source/decorator/FillBitmapTextureAtlasSourceDecorator;->clone()Lorg/anddev/andengine/opengl/texture/atlas/bitmap/source/decorator/FillBitmapTextureAtlasSourceDecorator;
	 } // .end method
