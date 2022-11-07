public abstract class org.anddev.andengine.opengl.texture.atlas.bitmap.source.decorator.BaseShapeBitmapTextureAtlasSourceDecorator extends org.anddev.andengine.opengl.texture.atlas.bitmap.source.decorator.BaseBitmapTextureAtlasSourceDecorator {
	 /* # instance fields */
	 protected final org.anddev.andengine.opengl.texture.atlas.bitmap.source.decorator.shape.IBitmapTextureAtlasSourceDecoratorShape mBitmapTextureAtlasSourceDecoratorShape;
	 /* # direct methods */
	 public org.anddev.andengine.opengl.texture.atlas.bitmap.source.decorator.BaseShapeBitmapTextureAtlasSourceDecorator ( ) {
		 /* .locals 0 */
		 /* invoke-direct {p0, p1, p3}, Lorg/anddev/andengine/opengl/texture/atlas/bitmap/source/decorator/BaseBitmapTextureAtlasSourceDecorator;-><init>(Lorg/anddev/andengine/opengl/texture/atlas/bitmap/source/IBitmapTextureAtlasSource;Lorg/anddev/andengine/opengl/texture/atlas/bitmap/source/decorator/BaseBitmapTextureAtlasSourceDecorator$TextureAtlasSourceDecoratorOptions;)V */
		 this.mBitmapTextureAtlasSourceDecoratorShape = p2;
		 return;
	 } // .end method
	 /* # virtual methods */
	 public org.anddev.andengine.opengl.texture.atlas.bitmap.source.IBitmapTextureAtlasSource clone ( ) { //bridge//synthethic
		 /* .locals 1 */
		 (( org.anddev.andengine.opengl.texture.atlas.bitmap.source.decorator.BaseShapeBitmapTextureAtlasSourceDecorator ) p0 ).clone ( ); // invoke-virtual {p0}, Lorg/anddev/andengine/opengl/texture/atlas/bitmap/source/decorator/BaseShapeBitmapTextureAtlasSourceDecorator;->clone()Lorg/anddev/andengine/opengl/texture/atlas/bitmap/source/decorator/BaseShapeBitmapTextureAtlasSourceDecorator;
	 } // .end method
	 public org.anddev.andengine.opengl.texture.atlas.bitmap.source.decorator.BaseBitmapTextureAtlasSourceDecorator clone ( ) { //bridge//synthethic
		 /* .locals 1 */
		 (( org.anddev.andengine.opengl.texture.atlas.bitmap.source.decorator.BaseShapeBitmapTextureAtlasSourceDecorator ) p0 ).clone ( ); // invoke-virtual {p0}, Lorg/anddev/andengine/opengl/texture/atlas/bitmap/source/decorator/BaseShapeBitmapTextureAtlasSourceDecorator;->clone()Lorg/anddev/andengine/opengl/texture/atlas/bitmap/source/decorator/BaseShapeBitmapTextureAtlasSourceDecorator;
	 } // .end method
	 public abstract org.anddev.andengine.opengl.texture.atlas.bitmap.source.decorator.BaseShapeBitmapTextureAtlasSourceDecorator clone ( ) {
	 } // .end method
	 public org.anddev.andengine.opengl.texture.source.ITextureAtlasSource clone ( ) { //bridge//synthethic
		 /* .locals 1 */
		 (( org.anddev.andengine.opengl.texture.atlas.bitmap.source.decorator.BaseShapeBitmapTextureAtlasSourceDecorator ) p0 ).clone ( ); // invoke-virtual {p0}, Lorg/anddev/andengine/opengl/texture/atlas/bitmap/source/decorator/BaseShapeBitmapTextureAtlasSourceDecorator;->clone()Lorg/anddev/andengine/opengl/texture/atlas/bitmap/source/decorator/BaseShapeBitmapTextureAtlasSourceDecorator;
	 } // .end method
	 protected void onDecorateBitmap ( android.graphics.Canvas p0 ) {
		 /* .locals 3 */
		 v0 = this.mBitmapTextureAtlasSourceDecoratorShape;
		 v1 = this.mPaint;
		 v2 = this.mTextureAtlasSourceDecoratorOptions;
		 /* if-nez v2, :cond_0 */
		 v2 = org.anddev.andengine.opengl.texture.atlas.bitmap.source.decorator.BaseBitmapTextureAtlasSourceDecorator$TextureAtlasSourceDecoratorOptions.DEFAULT;
	 } // :goto_0
	 return;
} // :cond_0
v2 = this.mTextureAtlasSourceDecoratorOptions;
} // .end method
