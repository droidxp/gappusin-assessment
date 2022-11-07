public class org.anddev.andengine.opengl.texture.atlas.bitmap.source.decorator.shape.CircleBitmapTextureAtlasSourceDecoratorShape implements org.anddev.andengine.opengl.texture.atlas.bitmap.source.decorator.shape.IBitmapTextureAtlasSourceDecoratorShape {
	 /* # interfaces */
	 /* # static fields */
	 private static org.anddev.andengine.opengl.texture.atlas.bitmap.source.decorator.shape.CircleBitmapTextureAtlasSourceDecoratorShape sDefaultInstance;
	 /* # direct methods */
	 public org.anddev.andengine.opengl.texture.atlas.bitmap.source.decorator.shape.CircleBitmapTextureAtlasSourceDecoratorShape ( ) {
		 /* .locals 0 */
		 /* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
		 return;
	 } // .end method
	 public static org.anddev.andengine.opengl.texture.atlas.bitmap.source.decorator.shape.CircleBitmapTextureAtlasSourceDecoratorShape getDefaultInstance ( ) {
		 /* .locals 1 */
		 v0 = org.anddev.andengine.opengl.texture.atlas.bitmap.source.decorator.shape.CircleBitmapTextureAtlasSourceDecoratorShape.sDefaultInstance;
		 /* if-nez v0, :cond_0 */
		 /* new-instance v0, Lorg/anddev/andengine/opengl/texture/atlas/bitmap/source/decorator/shape/CircleBitmapTextureAtlasSourceDecoratorShape; */
		 /* invoke-direct {v0}, Lorg/anddev/andengine/opengl/texture/atlas/bitmap/source/decorator/shape/CircleBitmapTextureAtlasSourceDecoratorShape;-><init>()V */
	 } // :cond_0
	 v0 = org.anddev.andengine.opengl.texture.atlas.bitmap.source.decorator.shape.CircleBitmapTextureAtlasSourceDecoratorShape.sDefaultInstance;
} // .end method
/* # virtual methods */
public void onDecorateBitmap ( android.graphics.Canvas p0, android.graphics.Paint p1, org.anddev.andengine.opengl.texture.atlas.bitmap.source.decorator.BaseBitmapTextureAtlasSourceDecorator$TextureAtlasSourceDecoratorOptions p2 ) {
	 /* .locals 6 */
	 /* const/high16 v5, 0x3f000000 # 0.5f */
	 v0 = 	 (( android.graphics.Canvas ) p1 ).getWidth ( ); // invoke-virtual {p1}, Landroid/graphics/Canvas;->getWidth()I
	 /* int-to-float v0, v0 */
	 v1 = 	 (( org.anddev.andengine.opengl.texture.atlas.bitmap.source.decorator.BaseBitmapTextureAtlasSourceDecorator$TextureAtlasSourceDecoratorOptions ) p3 ).getInsetLeft ( ); // invoke-virtual {p3}, Lorg/anddev/andengine/opengl/texture/atlas/bitmap/source/decorator/BaseBitmapTextureAtlasSourceDecorator$TextureAtlasSourceDecoratorOptions;->getInsetLeft()F
	 /* sub-float/2addr v0, v1 */
	 v1 = 	 (( org.anddev.andengine.opengl.texture.atlas.bitmap.source.decorator.BaseBitmapTextureAtlasSourceDecorator$TextureAtlasSourceDecoratorOptions ) p3 ).getInsetRight ( ); // invoke-virtual {p3}, Lorg/anddev/andengine/opengl/texture/atlas/bitmap/source/decorator/BaseBitmapTextureAtlasSourceDecorator$TextureAtlasSourceDecoratorOptions;->getInsetRight()F
	 /* sub-float/2addr v0, v1 */
	 v1 = 	 (( android.graphics.Canvas ) p1 ).getHeight ( ); // invoke-virtual {p1}, Landroid/graphics/Canvas;->getHeight()I
	 /* int-to-float v1, v1 */
	 v2 = 	 (( org.anddev.andengine.opengl.texture.atlas.bitmap.source.decorator.BaseBitmapTextureAtlasSourceDecorator$TextureAtlasSourceDecoratorOptions ) p3 ).getInsetTop ( ); // invoke-virtual {p3}, Lorg/anddev/andengine/opengl/texture/atlas/bitmap/source/decorator/BaseBitmapTextureAtlasSourceDecorator$TextureAtlasSourceDecoratorOptions;->getInsetTop()F
	 /* sub-float/2addr v1, v2 */
	 v2 = 	 (( org.anddev.andengine.opengl.texture.atlas.bitmap.source.decorator.BaseBitmapTextureAtlasSourceDecorator$TextureAtlasSourceDecoratorOptions ) p3 ).getInsetBottom ( ); // invoke-virtual {p3}, Lorg/anddev/andengine/opengl/texture/atlas/bitmap/source/decorator/BaseBitmapTextureAtlasSourceDecorator$TextureAtlasSourceDecoratorOptions;->getInsetBottom()F
	 /* sub-float/2addr v1, v2 */
	 v2 = 	 (( android.graphics.Canvas ) p1 ).getWidth ( ); // invoke-virtual {p1}, Landroid/graphics/Canvas;->getWidth()I
	 /* int-to-float v2, v2 */
	 v3 = 	 (( org.anddev.andengine.opengl.texture.atlas.bitmap.source.decorator.BaseBitmapTextureAtlasSourceDecorator$TextureAtlasSourceDecoratorOptions ) p3 ).getInsetLeft ( ); // invoke-virtual {p3}, Lorg/anddev/andengine/opengl/texture/atlas/bitmap/source/decorator/BaseBitmapTextureAtlasSourceDecorator$TextureAtlasSourceDecoratorOptions;->getInsetLeft()F
	 /* add-float/2addr v2, v3 */
	 v3 = 	 (( org.anddev.andengine.opengl.texture.atlas.bitmap.source.decorator.BaseBitmapTextureAtlasSourceDecorator$TextureAtlasSourceDecoratorOptions ) p3 ).getInsetRight ( ); // invoke-virtual {p3}, Lorg/anddev/andengine/opengl/texture/atlas/bitmap/source/decorator/BaseBitmapTextureAtlasSourceDecorator$TextureAtlasSourceDecoratorOptions;->getInsetRight()F
	 /* sub-float/2addr v2, v3 */
	 /* mul-float/2addr v2, v5 */
	 v3 = 	 (( android.graphics.Canvas ) p1 ).getHeight ( ); // invoke-virtual {p1}, Landroid/graphics/Canvas;->getHeight()I
	 /* int-to-float v3, v3 */
	 v4 = 	 (( org.anddev.andengine.opengl.texture.atlas.bitmap.source.decorator.BaseBitmapTextureAtlasSourceDecorator$TextureAtlasSourceDecoratorOptions ) p3 ).getInsetTop ( ); // invoke-virtual {p3}, Lorg/anddev/andengine/opengl/texture/atlas/bitmap/source/decorator/BaseBitmapTextureAtlasSourceDecorator$TextureAtlasSourceDecoratorOptions;->getInsetTop()F
	 /* add-float/2addr v3, v4 */
	 v4 = 	 (( org.anddev.andengine.opengl.texture.atlas.bitmap.source.decorator.BaseBitmapTextureAtlasSourceDecorator$TextureAtlasSourceDecoratorOptions ) p3 ).getInsetBottom ( ); // invoke-virtual {p3}, Lorg/anddev/andengine/opengl/texture/atlas/bitmap/source/decorator/BaseBitmapTextureAtlasSourceDecorator$TextureAtlasSourceDecoratorOptions;->getInsetBottom()F
	 /* sub-float/2addr v3, v4 */
	 /* mul-float/2addr v3, v5 */
	 /* mul-float/2addr v0, v5 */
	 /* mul-float/2addr v1, v5 */
	 v0 = 	 java.lang.Math .min ( v0,v1 );
	 (( android.graphics.Canvas ) p1 ).drawCircle ( v2, v3, v0, p2 ); // invoke-virtual {p1, v2, v3, v0, p2}, Landroid/graphics/Canvas;->drawCircle(FFFLandroid/graphics/Paint;)V
	 return;
} // .end method
