public class org.anddev.andengine.opengl.texture.atlas.bitmap.source.decorator.BaseBitmapTextureAtlasSourceDecorator$TextureAtlasSourceDecoratorOptions {
	 /* # static fields */
	 public static final org.anddev.andengine.opengl.texture.atlas.bitmap.source.decorator.BaseBitmapTextureAtlasSourceDecorator$TextureAtlasSourceDecoratorOptions DEFAULT;
	 /* # instance fields */
	 private Boolean mAntiAliasing;
	 private Float mInsetBottom;
	 private Float mInsetLeft;
	 private Float mInsetRight;
	 private Float mInsetTop;
	 /* # direct methods */
	 static org.anddev.andengine.opengl.texture.atlas.bitmap.source.decorator.BaseBitmapTextureAtlasSourceDecorator$TextureAtlasSourceDecoratorOptions ( ) {
		 /* .locals 1 */
		 /* new-instance v0, Lorg/anddev/andengine/opengl/texture/atlas/bitmap/source/decorator/BaseBitmapTextureAtlasSourceDecorator$TextureAtlasSourceDecoratorOptions; */
		 /* invoke-direct {v0}, Lorg/anddev/andengine/opengl/texture/atlas/bitmap/source/decorator/BaseBitmapTextureAtlasSourceDecorator$TextureAtlasSourceDecoratorOptions;-><init>()V */
		 return;
	 } // .end method
	 public org.anddev.andengine.opengl.texture.atlas.bitmap.source.decorator.BaseBitmapTextureAtlasSourceDecorator$TextureAtlasSourceDecoratorOptions ( ) {
		 /* .locals 1 */
		 /* const/high16 v0, 0x3e800000 # 0.25f */
		 /* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
		 /* iput v0, p0, Lorg/anddev/andengine/opengl/texture/atlas/bitmap/source/decorator/BaseBitmapTextureAtlasSourceDecorator$TextureAtlasSourceDecoratorOptions;->mInsetLeft:F */
		 /* iput v0, p0, Lorg/anddev/andengine/opengl/texture/atlas/bitmap/source/decorator/BaseBitmapTextureAtlasSourceDecorator$TextureAtlasSourceDecoratorOptions;->mInsetRight:F */
		 /* iput v0, p0, Lorg/anddev/andengine/opengl/texture/atlas/bitmap/source/decorator/BaseBitmapTextureAtlasSourceDecorator$TextureAtlasSourceDecoratorOptions;->mInsetTop:F */
		 /* iput v0, p0, Lorg/anddev/andengine/opengl/texture/atlas/bitmap/source/decorator/BaseBitmapTextureAtlasSourceDecorator$TextureAtlasSourceDecoratorOptions;->mInsetBottom:F */
		 return;
	 } // .end method
	 /* # virtual methods */
	 protected java.lang.Object clone ( ) { //bridge//synthethic
		 /* .locals 1 */
		 (( org.anddev.andengine.opengl.texture.atlas.bitmap.source.decorator.BaseBitmapTextureAtlasSourceDecorator$TextureAtlasSourceDecoratorOptions ) p0 ).clone ( ); // invoke-virtual {p0}, Lorg/anddev/andengine/opengl/texture/atlas/bitmap/source/decorator/BaseBitmapTextureAtlasSourceDecorator$TextureAtlasSourceDecoratorOptions;->clone()Lorg/anddev/andengine/opengl/texture/atlas/bitmap/source/decorator/BaseBitmapTextureAtlasSourceDecorator$TextureAtlasSourceDecoratorOptions;
	 } // .end method
	 protected org.anddev.andengine.opengl.texture.atlas.bitmap.source.decorator.BaseBitmapTextureAtlasSourceDecorator$TextureAtlasSourceDecoratorOptions clone ( ) {
		 /* .locals 5 */
		 /* new-instance v0, Lorg/anddev/andengine/opengl/texture/atlas/bitmap/source/decorator/BaseBitmapTextureAtlasSourceDecorator$TextureAtlasSourceDecoratorOptions; */
		 /* invoke-direct {v0}, Lorg/anddev/andengine/opengl/texture/atlas/bitmap/source/decorator/BaseBitmapTextureAtlasSourceDecorator$TextureAtlasSourceDecoratorOptions;-><init>()V */
		 /* iget v1, p0, Lorg/anddev/andengine/opengl/texture/atlas/bitmap/source/decorator/BaseBitmapTextureAtlasSourceDecorator$TextureAtlasSourceDecoratorOptions;->mInsetLeft:F */
		 /* iget v2, p0, Lorg/anddev/andengine/opengl/texture/atlas/bitmap/source/decorator/BaseBitmapTextureAtlasSourceDecorator$TextureAtlasSourceDecoratorOptions;->mInsetTop:F */
		 /* iget v3, p0, Lorg/anddev/andengine/opengl/texture/atlas/bitmap/source/decorator/BaseBitmapTextureAtlasSourceDecorator$TextureAtlasSourceDecoratorOptions;->mInsetRight:F */
		 /* iget v4, p0, Lorg/anddev/andengine/opengl/texture/atlas/bitmap/source/decorator/BaseBitmapTextureAtlasSourceDecorator$TextureAtlasSourceDecoratorOptions;->mInsetBottom:F */
		 (( org.anddev.andengine.opengl.texture.atlas.bitmap.source.decorator.BaseBitmapTextureAtlasSourceDecorator$TextureAtlasSourceDecoratorOptions ) v0 ).setInsets ( v1, v2, v3, v4 ); // invoke-virtual {v0, v1, v2, v3, v4}, Lorg/anddev/andengine/opengl/texture/atlas/bitmap/source/decorator/BaseBitmapTextureAtlasSourceDecorator$TextureAtlasSourceDecoratorOptions;->setInsets(FFFF)Lorg/anddev/andengine/opengl/texture/atlas/bitmap/source/decorator/BaseBitmapTextureAtlasSourceDecorator$TextureAtlasSourceDecoratorOptions;
		 /* iget-boolean v1, p0, Lorg/anddev/andengine/opengl/texture/atlas/bitmap/source/decorator/BaseBitmapTextureAtlasSourceDecorator$TextureAtlasSourceDecoratorOptions;->mAntiAliasing:Z */
		 (( org.anddev.andengine.opengl.texture.atlas.bitmap.source.decorator.BaseBitmapTextureAtlasSourceDecorator$TextureAtlasSourceDecoratorOptions ) v0 ).setAntiAliasing ( v1 ); // invoke-virtual {v0, v1}, Lorg/anddev/andengine/opengl/texture/atlas/bitmap/source/decorator/BaseBitmapTextureAtlasSourceDecorator$TextureAtlasSourceDecoratorOptions;->setAntiAliasing(Z)Lorg/anddev/andengine/opengl/texture/atlas/bitmap/source/decorator/BaseBitmapTextureAtlasSourceDecorator$TextureAtlasSourceDecoratorOptions;
	 } // .end method
	 public Boolean getAntiAliasing ( ) {
		 /* .locals 1 */
		 /* iget-boolean v0, p0, Lorg/anddev/andengine/opengl/texture/atlas/bitmap/source/decorator/BaseBitmapTextureAtlasSourceDecorator$TextureAtlasSourceDecoratorOptions;->mAntiAliasing:Z */
	 } // .end method
	 public Float getInsetBottom ( ) {
		 /* .locals 1 */
		 /* iget v0, p0, Lorg/anddev/andengine/opengl/texture/atlas/bitmap/source/decorator/BaseBitmapTextureAtlasSourceDecorator$TextureAtlasSourceDecoratorOptions;->mInsetBottom:F */
	 } // .end method
	 public Float getInsetLeft ( ) {
		 /* .locals 1 */
		 /* iget v0, p0, Lorg/anddev/andengine/opengl/texture/atlas/bitmap/source/decorator/BaseBitmapTextureAtlasSourceDecorator$TextureAtlasSourceDecoratorOptions;->mInsetLeft:F */
	 } // .end method
	 public Float getInsetRight ( ) {
		 /* .locals 1 */
		 /* iget v0, p0, Lorg/anddev/andengine/opengl/texture/atlas/bitmap/source/decorator/BaseBitmapTextureAtlasSourceDecorator$TextureAtlasSourceDecoratorOptions;->mInsetRight:F */
	 } // .end method
	 public Float getInsetTop ( ) {
		 /* .locals 1 */
		 /* iget v0, p0, Lorg/anddev/andengine/opengl/texture/atlas/bitmap/source/decorator/BaseBitmapTextureAtlasSourceDecorator$TextureAtlasSourceDecoratorOptions;->mInsetTop:F */
	 } // .end method
	 public org.anddev.andengine.opengl.texture.atlas.bitmap.source.decorator.BaseBitmapTextureAtlasSourceDecorator$TextureAtlasSourceDecoratorOptions setAntiAliasing ( Boolean p0 ) {
		 /* .locals 0 */
		 /* iput-boolean p1, p0, Lorg/anddev/andengine/opengl/texture/atlas/bitmap/source/decorator/BaseBitmapTextureAtlasSourceDecorator$TextureAtlasSourceDecoratorOptions;->mAntiAliasing:Z */
	 } // .end method
	 public org.anddev.andengine.opengl.texture.atlas.bitmap.source.decorator.BaseBitmapTextureAtlasSourceDecorator$TextureAtlasSourceDecoratorOptions setInsetBottom ( Float p0 ) {
		 /* .locals 0 */
		 /* iput p1, p0, Lorg/anddev/andengine/opengl/texture/atlas/bitmap/source/decorator/BaseBitmapTextureAtlasSourceDecorator$TextureAtlasSourceDecoratorOptions;->mInsetBottom:F */
	 } // .end method
	 public org.anddev.andengine.opengl.texture.atlas.bitmap.source.decorator.BaseBitmapTextureAtlasSourceDecorator$TextureAtlasSourceDecoratorOptions setInsetLeft ( Float p0 ) {
		 /* .locals 0 */
		 /* iput p1, p0, Lorg/anddev/andengine/opengl/texture/atlas/bitmap/source/decorator/BaseBitmapTextureAtlasSourceDecorator$TextureAtlasSourceDecoratorOptions;->mInsetLeft:F */
	 } // .end method
	 public org.anddev.andengine.opengl.texture.atlas.bitmap.source.decorator.BaseBitmapTextureAtlasSourceDecorator$TextureAtlasSourceDecoratorOptions setInsetRight ( Float p0 ) {
		 /* .locals 0 */
		 /* iput p1, p0, Lorg/anddev/andengine/opengl/texture/atlas/bitmap/source/decorator/BaseBitmapTextureAtlasSourceDecorator$TextureAtlasSourceDecoratorOptions;->mInsetRight:F */
	 } // .end method
	 public org.anddev.andengine.opengl.texture.atlas.bitmap.source.decorator.BaseBitmapTextureAtlasSourceDecorator$TextureAtlasSourceDecoratorOptions setInsetTop ( Float p0 ) {
		 /* .locals 0 */
		 /* iput p1, p0, Lorg/anddev/andengine/opengl/texture/atlas/bitmap/source/decorator/BaseBitmapTextureAtlasSourceDecorator$TextureAtlasSourceDecoratorOptions;->mInsetTop:F */
	 } // .end method
	 public org.anddev.andengine.opengl.texture.atlas.bitmap.source.decorator.BaseBitmapTextureAtlasSourceDecorator$TextureAtlasSourceDecoratorOptions setInsets ( Float p0 ) {
		 /* .locals 1 */
		 (( org.anddev.andengine.opengl.texture.atlas.bitmap.source.decorator.BaseBitmapTextureAtlasSourceDecorator$TextureAtlasSourceDecoratorOptions ) p0 ).setInsets ( p1, p1, p1, p1 ); // invoke-virtual {p0, p1, p1, p1, p1}, Lorg/anddev/andengine/opengl/texture/atlas/bitmap/source/decorator/BaseBitmapTextureAtlasSourceDecorator$TextureAtlasSourceDecoratorOptions;->setInsets(FFFF)Lorg/anddev/andengine/opengl/texture/atlas/bitmap/source/decorator/BaseBitmapTextureAtlasSourceDecorator$TextureAtlasSourceDecoratorOptions;
	 } // .end method
	 public org.anddev.andengine.opengl.texture.atlas.bitmap.source.decorator.BaseBitmapTextureAtlasSourceDecorator$TextureAtlasSourceDecoratorOptions setInsets ( Float p0, Float p1, Float p2, Float p3 ) {
		 /* .locals 0 */
		 /* iput p1, p0, Lorg/anddev/andengine/opengl/texture/atlas/bitmap/source/decorator/BaseBitmapTextureAtlasSourceDecorator$TextureAtlasSourceDecoratorOptions;->mInsetLeft:F */
		 /* iput p2, p0, Lorg/anddev/andengine/opengl/texture/atlas/bitmap/source/decorator/BaseBitmapTextureAtlasSourceDecorator$TextureAtlasSourceDecoratorOptions;->mInsetTop:F */
		 /* iput p3, p0, Lorg/anddev/andengine/opengl/texture/atlas/bitmap/source/decorator/BaseBitmapTextureAtlasSourceDecorator$TextureAtlasSourceDecoratorOptions;->mInsetRight:F */
		 /* iput p4, p0, Lorg/anddev/andengine/opengl/texture/atlas/bitmap/source/decorator/BaseBitmapTextureAtlasSourceDecorator$TextureAtlasSourceDecoratorOptions;->mInsetBottom:F */
	 } // .end method
