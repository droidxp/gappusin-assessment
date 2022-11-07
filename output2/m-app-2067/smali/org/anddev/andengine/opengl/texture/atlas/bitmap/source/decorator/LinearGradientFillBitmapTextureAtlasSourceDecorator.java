public class org.anddev.andengine.opengl.texture.atlas.bitmap.source.decorator.LinearGradientFillBitmapTextureAtlasSourceDecorator extends org.anddev.andengine.opengl.texture.atlas.bitmap.source.decorator.BaseShapeBitmapTextureAtlasSourceDecorator {
	 /* # instance fields */
	 protected final mColors;
	 protected final org.anddev.andengine.opengl.texture.atlas.bitmap.source.decorator.LinearGradientFillBitmapTextureAtlasSourceDecorator$LinearGradientDirection mLinearGradientDirection;
	 protected final mPositions;
	 /* # direct methods */
	 public org.anddev.andengine.opengl.texture.atlas.bitmap.source.decorator.LinearGradientFillBitmapTextureAtlasSourceDecorator ( ) {
		 /* .locals 7 */
		 int v6 = 0; // const/4 v6, 0x0
		 /* move-object v0, p0 */
		 /* move-object v1, p1 */
		 /* move-object v2, p2 */
		 /* move v3, p3 */
		 /* move v4, p4 */
		 /* move-object v5, p5 */
		 /* invoke-direct/range {v0 ..v6}, Lorg/anddev/andengine/opengl/texture/atlas/bitmap/source/decorator/LinearGradientFillBitmapTextureAtlasSourceDecorator;-><init>(Lorg/anddev/andengine/opengl/texture/atlas/bitmap/source/IBitmapTextureAtlasSource;Lorg/anddev/andengine/opengl/texture/atlas/bitmap/source/decorator/shape/IBitmapTextureAtlasSourceDecoratorShape;IILorg/anddev/andengine/opengl/texture/atlas/bitmap/source/decorator/LinearGradientFillBitmapTextureAtlasSourceDecorator$LinearGradientDirection;Lorg/anddev/andengine/opengl/texture/atlas/bitmap/source/decorator/BaseBitmapTextureAtlasSourceDecorator$TextureAtlasSourceDecoratorOptions;)V */
		 return;
	 } // .end method
	 public org.anddev.andengine.opengl.texture.atlas.bitmap.source.decorator.LinearGradientFillBitmapTextureAtlasSourceDecorator ( ) {
		 /* .locals 7 */
		 int v0 = 2; // const/4 v0, 0x2
		 /* new-array v3, v0, [I */
		 int v0 = 0; // const/4 v0, 0x0
		 /* aput p3, v3, v0 */
		 int v0 = 1; // const/4 v0, 0x1
		 /* aput p4, v3, v0 */
		 int v4 = 0; // const/4 v4, 0x0
		 /* move-object v0, p0 */
		 /* move-object v1, p1 */
		 /* move-object v2, p2 */
		 /* move-object v5, p5 */
		 /* move-object v6, p6 */
		 /* invoke-direct/range {v0 ..v6}, Lorg/anddev/andengine/opengl/texture/atlas/bitmap/source/decorator/LinearGradientFillBitmapTextureAtlasSourceDecorator;-><init>(Lorg/anddev/andengine/opengl/texture/atlas/bitmap/source/IBitmapTextureAtlasSource;Lorg/anddev/andengine/opengl/texture/atlas/bitmap/source/decorator/shape/IBitmapTextureAtlasSourceDecoratorShape;[I[FLorg/anddev/andengine/opengl/texture/atlas/bitmap/source/decorator/LinearGradientFillBitmapTextureAtlasSourceDecorator$LinearGradientDirection;Lorg/anddev/andengine/opengl/texture/atlas/bitmap/source/decorator/BaseBitmapTextureAtlasSourceDecorator$TextureAtlasSourceDecoratorOptions;)V */
		 return;
	 } // .end method
	 public org.anddev.andengine.opengl.texture.atlas.bitmap.source.decorator.LinearGradientFillBitmapTextureAtlasSourceDecorator ( ) {
		 /* .locals 7 */
		 int v6 = 0; // const/4 v6, 0x0
		 /* move-object v0, p0 */
		 /* move-object v1, p1 */
		 /* move-object v2, p2 */
		 /* move-object v3, p3 */
		 /* move-object v4, p4 */
		 /* move-object v5, p5 */
		 /* invoke-direct/range {v0 ..v6}, Lorg/anddev/andengine/opengl/texture/atlas/bitmap/source/decorator/LinearGradientFillBitmapTextureAtlasSourceDecorator;-><init>(Lorg/anddev/andengine/opengl/texture/atlas/bitmap/source/IBitmapTextureAtlasSource;Lorg/anddev/andengine/opengl/texture/atlas/bitmap/source/decorator/shape/IBitmapTextureAtlasSourceDecoratorShape;[I[FLorg/anddev/andengine/opengl/texture/atlas/bitmap/source/decorator/LinearGradientFillBitmapTextureAtlasSourceDecorator$LinearGradientDirection;Lorg/anddev/andengine/opengl/texture/atlas/bitmap/source/decorator/BaseBitmapTextureAtlasSourceDecorator$TextureAtlasSourceDecoratorOptions;)V */
		 return;
	 } // .end method
	 public org.anddev.andengine.opengl.texture.atlas.bitmap.source.decorator.LinearGradientFillBitmapTextureAtlasSourceDecorator ( ) {
		 /* .locals 9 */
		 int v2 = 1; // const/4 v2, 0x1
		 /* invoke-direct {p0, p1, p2, p6}, Lorg/anddev/andengine/opengl/texture/atlas/bitmap/source/decorator/BaseShapeBitmapTextureAtlasSourceDecorator;-><init>(Lorg/anddev/andengine/opengl/texture/atlas/bitmap/source/IBitmapTextureAtlasSource;Lorg/anddev/andengine/opengl/texture/atlas/bitmap/source/decorator/shape/IBitmapTextureAtlasSourceDecoratorShape;Lorg/anddev/andengine/opengl/texture/atlas/bitmap/source/decorator/BaseBitmapTextureAtlasSourceDecorator$TextureAtlasSourceDecoratorOptions;)V */
		 this.mColors = p3;
		 this.mPositions = p4;
		 this.mLinearGradientDirection = p5;
		 v0 = this.mPaint;
		 v1 = android.graphics.Paint$Style.FILL;
		 v0 = 		 (( android.graphics.Paint ) v0 ).setStyle ( v1 ); // invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setStyle(Landroid/graphics/Paint$Style;)V
		 v1 = 		 /* sub-int/2addr v0, v2 */
		 /* sub-int v4, v1, v2 */
		 v1 = 		 (( org.anddev.andengine.opengl.texture.atlas.bitmap.source.decorator.LinearGradientFillBitmapTextureAtlasSourceDecorator$LinearGradientDirection ) p5 ).getFromX ( v0 ); // invoke-virtual {p5, v0}, Lorg/anddev/andengine/opengl/texture/atlas/bitmap/source/decorator/LinearGradientFillBitmapTextureAtlasSourceDecorator$LinearGradientDirection;->getFromX(I)I
		 /* int-to-float v1, v1 */
		 v2 = 		 (( org.anddev.andengine.opengl.texture.atlas.bitmap.source.decorator.LinearGradientFillBitmapTextureAtlasSourceDecorator$LinearGradientDirection ) p5 ).getFromY ( v4 ); // invoke-virtual {p5, v4}, Lorg/anddev/andengine/opengl/texture/atlas/bitmap/source/decorator/LinearGradientFillBitmapTextureAtlasSourceDecorator$LinearGradientDirection;->getFromY(I)I
		 /* int-to-float v2, v2 */
		 v0 = 		 (( org.anddev.andengine.opengl.texture.atlas.bitmap.source.decorator.LinearGradientFillBitmapTextureAtlasSourceDecorator$LinearGradientDirection ) p5 ).getToX ( v0 ); // invoke-virtual {p5, v0}, Lorg/anddev/andengine/opengl/texture/atlas/bitmap/source/decorator/LinearGradientFillBitmapTextureAtlasSourceDecorator$LinearGradientDirection;->getToX(I)I
		 /* int-to-float v3, v0 */
		 v0 = 		 (( org.anddev.andengine.opengl.texture.atlas.bitmap.source.decorator.LinearGradientFillBitmapTextureAtlasSourceDecorator$LinearGradientDirection ) p5 ).getToY ( v4 ); // invoke-virtual {p5, v4}, Lorg/anddev/andengine/opengl/texture/atlas/bitmap/source/decorator/LinearGradientFillBitmapTextureAtlasSourceDecorator$LinearGradientDirection;->getToY(I)I
		 /* int-to-float v4, v0 */
		 v8 = this.mPaint;
		 /* new-instance v0, Landroid/graphics/LinearGradient; */
		 v7 = android.graphics.Shader$TileMode.CLAMP;
		 /* move-object v5, p3 */
		 /* move-object v6, p4 */
		 /* invoke-direct/range {v0 ..v7}, Landroid/graphics/LinearGradient;-><init>(FFFF[I[FLandroid/graphics/Shader$TileMode;)V */
		 (( android.graphics.Paint ) v8 ).setShader ( v0 ); // invoke-virtual {v8, v0}, Landroid/graphics/Paint;->setShader(Landroid/graphics/Shader;)Landroid/graphics/Shader;
		 return;
	 } // .end method
	 /* # virtual methods */
	 public org.anddev.andengine.opengl.texture.atlas.bitmap.source.IBitmapTextureAtlasSource clone ( ) { //bridge//synthethic
		 /* .locals 1 */
		 (( org.anddev.andengine.opengl.texture.atlas.bitmap.source.decorator.LinearGradientFillBitmapTextureAtlasSourceDecorator ) p0 ).clone ( ); // invoke-virtual {p0}, Lorg/anddev/andengine/opengl/texture/atlas/bitmap/source/decorator/LinearGradientFillBitmapTextureAtlasSourceDecorator;->clone()Lorg/anddev/andengine/opengl/texture/atlas/bitmap/source/decorator/LinearGradientFillBitmapTextureAtlasSourceDecorator;
	 } // .end method
	 public org.anddev.andengine.opengl.texture.atlas.bitmap.source.decorator.BaseShapeBitmapTextureAtlasSourceDecorator clone ( ) { //bridge//synthethic
		 /* .locals 1 */
		 (( org.anddev.andengine.opengl.texture.atlas.bitmap.source.decorator.LinearGradientFillBitmapTextureAtlasSourceDecorator ) p0 ).clone ( ); // invoke-virtual {p0}, Lorg/anddev/andengine/opengl/texture/atlas/bitmap/source/decorator/LinearGradientFillBitmapTextureAtlasSourceDecorator;->clone()Lorg/anddev/andengine/opengl/texture/atlas/bitmap/source/decorator/LinearGradientFillBitmapTextureAtlasSourceDecorator;
	 } // .end method
	 public org.anddev.andengine.opengl.texture.atlas.bitmap.source.decorator.LinearGradientFillBitmapTextureAtlasSourceDecorator clone ( ) {
		 /* .locals 7 */
		 /* new-instance v0, Lorg/anddev/andengine/opengl/texture/atlas/bitmap/source/decorator/LinearGradientFillBitmapTextureAtlasSourceDecorator; */
		 v1 = this.mBitmapTextureAtlasSource;
		 v2 = this.mBitmapTextureAtlasSourceDecoratorShape;
		 v3 = this.mColors;
		 v4 = this.mPositions;
		 v5 = this.mLinearGradientDirection;
		 v6 = this.mTextureAtlasSourceDecoratorOptions;
		 /* invoke-direct/range {v0 ..v6}, Lorg/anddev/andengine/opengl/texture/atlas/bitmap/source/decorator/LinearGradientFillBitmapTextureAtlasSourceDecorator;-><init>(Lorg/anddev/andengine/opengl/texture/atlas/bitmap/source/IBitmapTextureAtlasSource;Lorg/anddev/andengine/opengl/texture/atlas/bitmap/source/decorator/shape/IBitmapTextureAtlasSourceDecoratorShape;[I[FLorg/anddev/andengine/opengl/texture/atlas/bitmap/source/decorator/LinearGradientFillBitmapTextureAtlasSourceDecorator$LinearGradientDirection;Lorg/anddev/andengine/opengl/texture/atlas/bitmap/source/decorator/BaseBitmapTextureAtlasSourceDecorator$TextureAtlasSourceDecoratorOptions;)V */
	 } // .end method
	 public org.anddev.andengine.opengl.texture.source.ITextureAtlasSource clone ( ) { //bridge//synthethic
		 /* .locals 1 */
		 (( org.anddev.andengine.opengl.texture.atlas.bitmap.source.decorator.LinearGradientFillBitmapTextureAtlasSourceDecorator ) p0 ).clone ( ); // invoke-virtual {p0}, Lorg/anddev/andengine/opengl/texture/atlas/bitmap/source/decorator/LinearGradientFillBitmapTextureAtlasSourceDecorator;->clone()Lorg/anddev/andengine/opengl/texture/atlas/bitmap/source/decorator/LinearGradientFillBitmapTextureAtlasSourceDecorator;
	 } // .end method
