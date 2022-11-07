public class org.anddev.andengine.opengl.texture.atlas.bitmap.source.decorator.shape.RectangleBitmapTextureAtlasSourceDecoratorShape implements org.anddev.andengine.opengl.texture.atlas.bitmap.source.decorator.shape.IBitmapTextureAtlasSourceDecoratorShape {
	 /* # interfaces */
	 /* # static fields */
	 private static org.anddev.andengine.opengl.texture.atlas.bitmap.source.decorator.shape.RectangleBitmapTextureAtlasSourceDecoratorShape sDefaultInstance;
	 /* # direct methods */
	 public org.anddev.andengine.opengl.texture.atlas.bitmap.source.decorator.shape.RectangleBitmapTextureAtlasSourceDecoratorShape ( ) {
		 /* .locals 0 */
		 /* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
		 return;
	 } // .end method
	 public static org.anddev.andengine.opengl.texture.atlas.bitmap.source.decorator.shape.RectangleBitmapTextureAtlasSourceDecoratorShape getDefaultInstance ( ) {
		 /* .locals 1 */
		 v0 = org.anddev.andengine.opengl.texture.atlas.bitmap.source.decorator.shape.RectangleBitmapTextureAtlasSourceDecoratorShape.sDefaultInstance;
		 /* if-nez v0, :cond_0 */
		 /* new-instance v0, Lorg/anddev/andengine/opengl/texture/atlas/bitmap/source/decorator/shape/RectangleBitmapTextureAtlasSourceDecoratorShape; */
		 /* invoke-direct {v0}, Lorg/anddev/andengine/opengl/texture/atlas/bitmap/source/decorator/shape/RectangleBitmapTextureAtlasSourceDecoratorShape;-><init>()V */
	 } // :cond_0
	 v0 = org.anddev.andengine.opengl.texture.atlas.bitmap.source.decorator.shape.RectangleBitmapTextureAtlasSourceDecoratorShape.sDefaultInstance;
} // .end method
/* # virtual methods */
public void onDecorateBitmap ( android.graphics.Canvas p0, android.graphics.Paint p1, org.anddev.andengine.opengl.texture.atlas.bitmap.source.decorator.BaseBitmapTextureAtlasSourceDecorator$TextureAtlasSourceDecoratorOptions p2 ) {
	 /* .locals 6 */
	 v1 = 	 (( org.anddev.andengine.opengl.texture.atlas.bitmap.source.decorator.BaseBitmapTextureAtlasSourceDecorator$TextureAtlasSourceDecoratorOptions ) p3 ).getInsetLeft ( ); // invoke-virtual {p3}, Lorg/anddev/andengine/opengl/texture/atlas/bitmap/source/decorator/BaseBitmapTextureAtlasSourceDecorator$TextureAtlasSourceDecoratorOptions;->getInsetLeft()F
	 v2 = 	 (( org.anddev.andengine.opengl.texture.atlas.bitmap.source.decorator.BaseBitmapTextureAtlasSourceDecorator$TextureAtlasSourceDecoratorOptions ) p3 ).getInsetTop ( ); // invoke-virtual {p3}, Lorg/anddev/andengine/opengl/texture/atlas/bitmap/source/decorator/BaseBitmapTextureAtlasSourceDecorator$TextureAtlasSourceDecoratorOptions;->getInsetTop()F
	 v0 = 	 (( android.graphics.Canvas ) p1 ).getWidth ( ); // invoke-virtual {p1}, Landroid/graphics/Canvas;->getWidth()I
	 /* int-to-float v0, v0 */
	 v3 = 	 (( org.anddev.andengine.opengl.texture.atlas.bitmap.source.decorator.BaseBitmapTextureAtlasSourceDecorator$TextureAtlasSourceDecoratorOptions ) p3 ).getInsetRight ( ); // invoke-virtual {p3}, Lorg/anddev/andengine/opengl/texture/atlas/bitmap/source/decorator/BaseBitmapTextureAtlasSourceDecorator$TextureAtlasSourceDecoratorOptions;->getInsetRight()F
	 /* sub-float v3, v0, v3 */
	 v0 = 	 (( android.graphics.Canvas ) p1 ).getHeight ( ); // invoke-virtual {p1}, Landroid/graphics/Canvas;->getHeight()I
	 /* int-to-float v0, v0 */
	 v4 = 	 (( org.anddev.andengine.opengl.texture.atlas.bitmap.source.decorator.BaseBitmapTextureAtlasSourceDecorator$TextureAtlasSourceDecoratorOptions ) p3 ).getInsetBottom ( ); // invoke-virtual {p3}, Lorg/anddev/andengine/opengl/texture/atlas/bitmap/source/decorator/BaseBitmapTextureAtlasSourceDecorator$TextureAtlasSourceDecoratorOptions;->getInsetBottom()F
	 /* sub-float v4, v0, v4 */
	 /* move-object v0, p1 */
	 /* move-object v5, p2 */
	 /* invoke-virtual/range {v0 ..v5}, Landroid/graphics/Canvas;->drawRect(FFFFLandroid/graphics/Paint;)V */
	 return;
} // .end method
