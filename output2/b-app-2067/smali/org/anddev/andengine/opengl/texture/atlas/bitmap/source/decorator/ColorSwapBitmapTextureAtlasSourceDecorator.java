public class org.anddev.andengine.opengl.texture.atlas.bitmap.source.decorator.ColorSwapBitmapTextureAtlasSourceDecorator extends org.anddev.andengine.opengl.texture.atlas.bitmap.source.decorator.BaseShapeBitmapTextureAtlasSourceDecorator {
	 /* # static fields */
	 private static final Integer TOLERANCE_DEFAULT;
	 /* # instance fields */
	 protected final Integer mColorKeyColor;
	 protected final Integer mColorSwapColor;
	 protected final Integer mTolerance;
	 /* # direct methods */
	 public org.anddev.andengine.opengl.texture.atlas.bitmap.source.decorator.ColorSwapBitmapTextureAtlasSourceDecorator ( ) {
		 /* .locals 7 */
		 int v4 = 0; // const/4 v4, 0x0
		 int v6 = 0; // const/4 v6, 0x0
		 /* move-object v0, p0 */
		 /* move-object v1, p1 */
		 /* move-object v2, p2 */
		 /* move v3, p3 */
		 /* move v5, p4 */
		 /* invoke-direct/range {v0 ..v6}, Lorg/anddev/andengine/opengl/texture/atlas/bitmap/source/decorator/ColorSwapBitmapTextureAtlasSourceDecorator;-><init>(Lorg/anddev/andengine/opengl/texture/atlas/bitmap/source/IBitmapTextureAtlasSource;Lorg/anddev/andengine/opengl/texture/atlas/bitmap/source/decorator/shape/IBitmapTextureAtlasSourceDecoratorShape;IIILorg/anddev/andengine/opengl/texture/atlas/bitmap/source/decorator/BaseBitmapTextureAtlasSourceDecorator$TextureAtlasSourceDecoratorOptions;)V */
		 return;
	 } // .end method
	 public org.anddev.andengine.opengl.texture.atlas.bitmap.source.decorator.ColorSwapBitmapTextureAtlasSourceDecorator ( ) {
		 /* .locals 7 */
		 int v6 = 0; // const/4 v6, 0x0
		 /* move-object v0, p0 */
		 /* move-object v1, p1 */
		 /* move-object v2, p2 */
		 /* move v3, p3 */
		 /* move v4, p4 */
		 /* move v5, p5 */
		 /* invoke-direct/range {v0 ..v6}, Lorg/anddev/andengine/opengl/texture/atlas/bitmap/source/decorator/ColorSwapBitmapTextureAtlasSourceDecorator;-><init>(Lorg/anddev/andengine/opengl/texture/atlas/bitmap/source/IBitmapTextureAtlasSource;Lorg/anddev/andengine/opengl/texture/atlas/bitmap/source/decorator/shape/IBitmapTextureAtlasSourceDecoratorShape;IIILorg/anddev/andengine/opengl/texture/atlas/bitmap/source/decorator/BaseBitmapTextureAtlasSourceDecorator$TextureAtlasSourceDecoratorOptions;)V */
		 return;
	 } // .end method
	 public org.anddev.andengine.opengl.texture.atlas.bitmap.source.decorator.ColorSwapBitmapTextureAtlasSourceDecorator ( ) {
		 /* .locals 3 */
		 /* invoke-direct {p0, p1, p2, p6}, Lorg/anddev/andengine/opengl/texture/atlas/bitmap/source/decorator/BaseShapeBitmapTextureAtlasSourceDecorator;-><init>(Lorg/anddev/andengine/opengl/texture/atlas/bitmap/source/IBitmapTextureAtlasSource;Lorg/anddev/andengine/opengl/texture/atlas/bitmap/source/decorator/shape/IBitmapTextureAtlasSourceDecoratorShape;Lorg/anddev/andengine/opengl/texture/atlas/bitmap/source/decorator/BaseBitmapTextureAtlasSourceDecorator$TextureAtlasSourceDecoratorOptions;)V */
		 /* iput p3, p0, Lorg/anddev/andengine/opengl/texture/atlas/bitmap/source/decorator/ColorSwapBitmapTextureAtlasSourceDecorator;->mColorKeyColor:I */
		 /* iput p4, p0, Lorg/anddev/andengine/opengl/texture/atlas/bitmap/source/decorator/ColorSwapBitmapTextureAtlasSourceDecorator;->mTolerance:I */
		 /* iput p5, p0, Lorg/anddev/andengine/opengl/texture/atlas/bitmap/source/decorator/ColorSwapBitmapTextureAtlasSourceDecorator;->mColorSwapColor:I */
		 v0 = this.mPaint;
		 /* new-instance v1, Landroid/graphics/AvoidXfermode; */
		 v2 = android.graphics.AvoidXfermode$Mode.TARGET;
		 /* invoke-direct {v1, p3, p4, v2}, Landroid/graphics/AvoidXfermode;-><init>(IILandroid/graphics/AvoidXfermode$Mode;)V */
		 (( android.graphics.Paint ) v0 ).setXfermode ( v1 ); // invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setXfermode(Landroid/graphics/Xfermode;)Landroid/graphics/Xfermode;
		 v0 = this.mPaint;
		 (( android.graphics.Paint ) v0 ).setColor ( p5 ); // invoke-virtual {v0, p5}, Landroid/graphics/Paint;->setColor(I)V
		 return;
	 } // .end method
	 public org.anddev.andengine.opengl.texture.atlas.bitmap.source.decorator.ColorSwapBitmapTextureAtlasSourceDecorator ( ) {
		 /* .locals 7 */
		 int v4 = 0; // const/4 v4, 0x0
		 /* move-object v0, p0 */
		 /* move-object v1, p1 */
		 /* move-object v2, p2 */
		 /* move v3, p3 */
		 /* move v5, p4 */
		 /* move-object v6, p5 */
		 /* invoke-direct/range {v0 ..v6}, Lorg/anddev/andengine/opengl/texture/atlas/bitmap/source/decorator/ColorSwapBitmapTextureAtlasSourceDecorator;-><init>(Lorg/anddev/andengine/opengl/texture/atlas/bitmap/source/IBitmapTextureAtlasSource;Lorg/anddev/andengine/opengl/texture/atlas/bitmap/source/decorator/shape/IBitmapTextureAtlasSourceDecoratorShape;IIILorg/anddev/andengine/opengl/texture/atlas/bitmap/source/decorator/BaseBitmapTextureAtlasSourceDecorator$TextureAtlasSourceDecoratorOptions;)V */
		 return;
	 } // .end method
	 /* # virtual methods */
	 public org.anddev.andengine.opengl.texture.atlas.bitmap.source.IBitmapTextureAtlasSource clone ( ) { //bridge//synthethic
		 /* .locals 1 */
		 (( org.anddev.andengine.opengl.texture.atlas.bitmap.source.decorator.ColorSwapBitmapTextureAtlasSourceDecorator ) p0 ).clone ( ); // invoke-virtual {p0}, Lorg/anddev/andengine/opengl/texture/atlas/bitmap/source/decorator/ColorSwapBitmapTextureAtlasSourceDecorator;->clone()Lorg/anddev/andengine/opengl/texture/atlas/bitmap/source/decorator/ColorSwapBitmapTextureAtlasSourceDecorator;
	 } // .end method
	 public org.anddev.andengine.opengl.texture.atlas.bitmap.source.decorator.BaseShapeBitmapTextureAtlasSourceDecorator clone ( ) { //bridge//synthethic
		 /* .locals 1 */
		 (( org.anddev.andengine.opengl.texture.atlas.bitmap.source.decorator.ColorSwapBitmapTextureAtlasSourceDecorator ) p0 ).clone ( ); // invoke-virtual {p0}, Lorg/anddev/andengine/opengl/texture/atlas/bitmap/source/decorator/ColorSwapBitmapTextureAtlasSourceDecorator;->clone()Lorg/anddev/andengine/opengl/texture/atlas/bitmap/source/decorator/ColorSwapBitmapTextureAtlasSourceDecorator;
	 } // .end method
	 public org.anddev.andengine.opengl.texture.atlas.bitmap.source.decorator.ColorSwapBitmapTextureAtlasSourceDecorator clone ( ) {
		 /* .locals 7 */
		 /* new-instance v0, Lorg/anddev/andengine/opengl/texture/atlas/bitmap/source/decorator/ColorSwapBitmapTextureAtlasSourceDecorator; */
		 v1 = this.mBitmapTextureAtlasSource;
		 v2 = this.mBitmapTextureAtlasSourceDecoratorShape;
		 /* iget v3, p0, Lorg/anddev/andengine/opengl/texture/atlas/bitmap/source/decorator/ColorSwapBitmapTextureAtlasSourceDecorator;->mColorKeyColor:I */
		 /* iget v4, p0, Lorg/anddev/andengine/opengl/texture/atlas/bitmap/source/decorator/ColorSwapBitmapTextureAtlasSourceDecorator;->mTolerance:I */
		 /* iget v5, p0, Lorg/anddev/andengine/opengl/texture/atlas/bitmap/source/decorator/ColorSwapBitmapTextureAtlasSourceDecorator;->mColorSwapColor:I */
		 v6 = this.mTextureAtlasSourceDecoratorOptions;
		 /* invoke-direct/range {v0 ..v6}, Lorg/anddev/andengine/opengl/texture/atlas/bitmap/source/decorator/ColorSwapBitmapTextureAtlasSourceDecorator;-><init>(Lorg/anddev/andengine/opengl/texture/atlas/bitmap/source/IBitmapTextureAtlasSource;Lorg/anddev/andengine/opengl/texture/atlas/bitmap/source/decorator/shape/IBitmapTextureAtlasSourceDecoratorShape;IIILorg/anddev/andengine/opengl/texture/atlas/bitmap/source/decorator/BaseBitmapTextureAtlasSourceDecorator$TextureAtlasSourceDecoratorOptions;)V */
	 } // .end method
	 public org.anddev.andengine.opengl.texture.source.ITextureAtlasSource clone ( ) { //bridge//synthethic
		 /* .locals 1 */
		 (( org.anddev.andengine.opengl.texture.atlas.bitmap.source.decorator.ColorSwapBitmapTextureAtlasSourceDecorator ) p0 ).clone ( ); // invoke-virtual {p0}, Lorg/anddev/andengine/opengl/texture/atlas/bitmap/source/decorator/ColorSwapBitmapTextureAtlasSourceDecorator;->clone()Lorg/anddev/andengine/opengl/texture/atlas/bitmap/source/decorator/ColorSwapBitmapTextureAtlasSourceDecorator;
	 } // .end method
