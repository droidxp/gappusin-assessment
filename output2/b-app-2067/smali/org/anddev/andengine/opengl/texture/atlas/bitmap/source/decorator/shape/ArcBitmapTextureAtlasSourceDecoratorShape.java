public class org.anddev.andengine.opengl.texture.atlas.bitmap.source.decorator.shape.ArcBitmapTextureAtlasSourceDecoratorShape implements org.anddev.andengine.opengl.texture.atlas.bitmap.source.decorator.shape.IBitmapTextureAtlasSourceDecoratorShape {
	 /* # interfaces */
	 /* # static fields */
	 private static final Float STARTANGLE_DEFAULT;
	 private static final Float SWEEPANGLE_DEFAULT;
	 private static final Boolean USECENTER_DEFAULT;
	 private static org.anddev.andengine.opengl.texture.atlas.bitmap.source.decorator.shape.ArcBitmapTextureAtlasSourceDecoratorShape sDefaultInstance;
	 /* # instance fields */
	 private final android.graphics.RectF mRectF;
	 private final Float mStartAngle;
	 private final Float mSweepAngle;
	 private final Boolean mUseCenter;
	 /* # direct methods */
	 public org.anddev.andengine.opengl.texture.atlas.bitmap.source.decorator.shape.ArcBitmapTextureAtlasSourceDecoratorShape ( ) {
		 /* .locals 3 */
		 int v0 = 0; // const/4 v0, 0x0
		 /* const/high16 v1, 0x43b40000 # 360.0f */
		 int v2 = 1; // const/4 v2, 0x1
		 /* invoke-direct {p0, v0, v1, v2}, Lorg/anddev/andengine/opengl/texture/atlas/bitmap/source/decorator/shape/ArcBitmapTextureAtlasSourceDecoratorShape;-><init>(FFZ)V */
		 return;
	 } // .end method
	 public org.anddev.andengine.opengl.texture.atlas.bitmap.source.decorator.shape.ArcBitmapTextureAtlasSourceDecoratorShape ( ) {
		 /* .locals 1 */
		 /* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
		 /* new-instance v0, Landroid/graphics/RectF; */
		 /* invoke-direct {v0}, Landroid/graphics/RectF;-><init>()V */
		 this.mRectF = v0;
		 /* iput p1, p0, Lorg/anddev/andengine/opengl/texture/atlas/bitmap/source/decorator/shape/ArcBitmapTextureAtlasSourceDecoratorShape;->mStartAngle:F */
		 /* iput p2, p0, Lorg/anddev/andengine/opengl/texture/atlas/bitmap/source/decorator/shape/ArcBitmapTextureAtlasSourceDecoratorShape;->mSweepAngle:F */
		 /* iput-boolean p3, p0, Lorg/anddev/andengine/opengl/texture/atlas/bitmap/source/decorator/shape/ArcBitmapTextureAtlasSourceDecoratorShape;->mUseCenter:Z */
		 return;
	 } // .end method
	 public static org.anddev.andengine.opengl.texture.atlas.bitmap.source.decorator.shape.ArcBitmapTextureAtlasSourceDecoratorShape getDefaultInstance ( ) {
		 /* .locals 1 */
		 v0 = org.anddev.andengine.opengl.texture.atlas.bitmap.source.decorator.shape.ArcBitmapTextureAtlasSourceDecoratorShape.sDefaultInstance;
		 /* if-nez v0, :cond_0 */
		 /* new-instance v0, Lorg/anddev/andengine/opengl/texture/atlas/bitmap/source/decorator/shape/ArcBitmapTextureAtlasSourceDecoratorShape; */
		 /* invoke-direct {v0}, Lorg/anddev/andengine/opengl/texture/atlas/bitmap/source/decorator/shape/ArcBitmapTextureAtlasSourceDecoratorShape;-><init>()V */
	 } // :cond_0
	 v0 = org.anddev.andengine.opengl.texture.atlas.bitmap.source.decorator.shape.ArcBitmapTextureAtlasSourceDecoratorShape.sDefaultInstance;
} // .end method
/* # virtual methods */
public void onDecorateBitmap ( android.graphics.Canvas p0, android.graphics.Paint p1, org.anddev.andengine.opengl.texture.atlas.bitmap.source.decorator.BaseBitmapTextureAtlasSourceDecorator$TextureAtlasSourceDecoratorOptions p2 ) {
	 /* .locals 6 */
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
	 v1 = this.mRectF;
	 /* iget v2, p0, Lorg/anddev/andengine/opengl/texture/atlas/bitmap/source/decorator/shape/ArcBitmapTextureAtlasSourceDecoratorShape;->mStartAngle:F */
	 /* iget v3, p0, Lorg/anddev/andengine/opengl/texture/atlas/bitmap/source/decorator/shape/ArcBitmapTextureAtlasSourceDecoratorShape;->mSweepAngle:F */
	 /* iget-boolean v4, p0, Lorg/anddev/andengine/opengl/texture/atlas/bitmap/source/decorator/shape/ArcBitmapTextureAtlasSourceDecoratorShape;->mUseCenter:Z */
	 /* move-object v0, p1 */
	 /* move-object v5, p2 */
	 /* invoke-virtual/range {v0 ..v5}, Landroid/graphics/Canvas;->drawArc(Landroid/graphics/RectF;FFZLandroid/graphics/Paint;)V */
	 return;
} // .end method
