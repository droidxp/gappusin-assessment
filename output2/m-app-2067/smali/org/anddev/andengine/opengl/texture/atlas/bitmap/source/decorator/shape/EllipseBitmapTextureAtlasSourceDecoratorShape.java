public class org.anddev.andengine.opengl.texture.atlas.bitmap.source.decorator.shape.EllipseBitmapTextureAtlasSourceDecoratorShape implements org.anddev.andengine.opengl.texture.atlas.bitmap.source.decorator.shape.IBitmapTextureAtlasSourceDecoratorShape {
	 /* # interfaces */
	 /* # static fields */
	 private static org.anddev.andengine.opengl.texture.atlas.bitmap.source.decorator.shape.EllipseBitmapTextureAtlasSourceDecoratorShape sDefaultInstance;
	 /* # instance fields */
	 private final android.graphics.RectF mRectF;
	 /* # direct methods */
	 public org.anddev.andengine.opengl.texture.atlas.bitmap.source.decorator.shape.EllipseBitmapTextureAtlasSourceDecoratorShape ( ) {
		 /* .locals 1 */
		 /* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
		 /* new-instance v0, Landroid/graphics/RectF; */
		 /* invoke-direct {v0}, Landroid/graphics/RectF;-><init>()V */
		 this.mRectF = v0;
		 return;
	 } // .end method
	 public static org.anddev.andengine.opengl.texture.atlas.bitmap.source.decorator.shape.EllipseBitmapTextureAtlasSourceDecoratorShape getDefaultInstance ( ) {
		 /* .locals 1 */
		 v0 = org.anddev.andengine.opengl.texture.atlas.bitmap.source.decorator.shape.EllipseBitmapTextureAtlasSourceDecoratorShape.sDefaultInstance;
		 /* if-nez v0, :cond_0 */
		 /* new-instance v0, Lorg/anddev/andengine/opengl/texture/atlas/bitmap/source/decorator/shape/EllipseBitmapTextureAtlasSourceDecoratorShape; */
		 /* invoke-direct {v0}, Lorg/anddev/andengine/opengl/texture/atlas/bitmap/source/decorator/shape/EllipseBitmapTextureAtlasSourceDecoratorShape;-><init>()V */
	 } // :cond_0
	 v0 = org.anddev.andengine.opengl.texture.atlas.bitmap.source.decorator.shape.EllipseBitmapTextureAtlasSourceDecoratorShape.sDefaultInstance;
} // .end method
/* # virtual methods */
public void onDecorateBitmap ( android.graphics.Canvas p0, android.graphics.Paint p1, org.anddev.andengine.opengl.texture.atlas.bitmap.source.decorator.BaseBitmapTextureAtlasSourceDecorator$TextureAtlasSourceDecoratorOptions p2 ) {
	 /* .locals 5 */
	 v0 = 	 (( org.anddev.andengine.opengl.texture.atlas.bitmap.source.decorator.BaseBitmapTextureAtlasSourceDecorator$TextureAtlasSourceDecoratorOptions ) p3 ).getInsetLeft ( ); // invoke-virtual {p3}, Lorg/anddev/andengine/opengl/texture/atlas/bitmap/source/decorator/BaseBitmapTextureAtlasSourceDecorator$TextureAtlasSourceDecoratorOptions;->getInsetLeft()F
	 v1 = 	 (( org.anddev.andengine.opengl.texture.atlas.bitmap.source.decorator.BaseBitmapTextureAtlasSourceDecorator$TextureAtlasSourceDecoratorOptions ) p3 ).getInsetTop ( ); // invoke-virtual {p3}, Lorg/anddev/andengine/opengl/texture/atlas/bitmap/source/decorator/BaseBitmapTextureAtlasSourceDecorator$TextureAtlasSourceDecoratorOptions;->getInsetTop()F
	 v2 = 	 (( android.graphics.Canvas ) p1 ).getWidth ( ); // invoke-virtual {p1}, Landroid/graphics/Canvas;->getWidth()I
	 /* int-to-float v2, v2 */
	 v3 = 	 (( org.anddev.andengine.opengl.texture.atlas.bitmap.source.decorator.BaseBitmapTextureAtlasSourceDecorator$TextureAtlasSourceDecoratorOptions ) p3 ).getInsetRight ( ); // invoke-virtual {p3}, Lorg/anddev/andengine/opengl/texture/atlas/bitmap/source/decorator/BaseBitmapTextureAtlasSourceDecorator$TextureAtlasSourceDecoratorOptions;->getInsetRight()F
	 /* sub-float/2addr v2, v3 */
	 v3 = 	 (( android.graphics.Canvas ) p1 ).getHeight ( ); // invoke-virtual {p1}, Landroid/graphics/Canvas;->getHeight()I
	 /* int-to-float v3, v3 */
	 v4 = 	 (( org.anddev.andengine.opengl.texture.atlas.bitmap.source.decorator.BaseBitmapTextureAtlasSourceDecorator$TextureAtlasSourceDecoratorOptions ) p3 ).getInsetBottom ( ); // invoke-virtual {p3}, Lorg/anddev/andengine/opengl/texture/atlas/bitmap/source/decorator/BaseBitmapTextureAtlasSourceDecorator$TextureAtlasSourceDecoratorOptions;->getInsetBottom()F
	 /* sub-float/2addr v3, v4 */
	 v4 = this.mRectF;
	 (( android.graphics.RectF ) v4 ).set ( v0, v1, v2, v3 ); // invoke-virtual {v4, v0, v1, v2, v3}, Landroid/graphics/RectF;->set(FFFF)V
	 v0 = this.mRectF;
	 (( android.graphics.Canvas ) p1 ).drawOval ( v0, p2 ); // invoke-virtual {p1, v0, p2}, Landroid/graphics/Canvas;->drawOval(Landroid/graphics/RectF;Landroid/graphics/Paint;)V
	 return;
} // .end method
