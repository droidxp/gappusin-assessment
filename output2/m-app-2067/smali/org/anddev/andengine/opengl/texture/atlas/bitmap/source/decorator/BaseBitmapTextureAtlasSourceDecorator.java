public abstract class org.anddev.andengine.opengl.texture.atlas.bitmap.source.decorator.BaseBitmapTextureAtlasSourceDecorator extends org.anddev.andengine.opengl.texture.source.BaseTextureAtlasSource implements org.anddev.andengine.opengl.texture.atlas.bitmap.source.IBitmapTextureAtlasSource {
	 /* # interfaces */
	 /* # instance fields */
	 protected final org.anddev.andengine.opengl.texture.atlas.bitmap.source.IBitmapTextureAtlasSource mBitmapTextureAtlasSource;
	 protected android.graphics.Paint mPaint;
	 protected org.anddev.andengine.opengl.texture.atlas.bitmap.source.decorator.BaseBitmapTextureAtlasSourceDecorator$TextureAtlasSourceDecoratorOptions mTextureAtlasSourceDecoratorOptions;
	 /* # direct methods */
	 public org.anddev.andengine.opengl.texture.atlas.bitmap.source.decorator.BaseBitmapTextureAtlasSourceDecorator ( ) {
		 /* .locals 1 */
		 /* new-instance v0, Lorg/anddev/andengine/opengl/texture/atlas/bitmap/source/decorator/BaseBitmapTextureAtlasSourceDecorator$TextureAtlasSourceDecoratorOptions; */
		 /* invoke-direct {v0}, Lorg/anddev/andengine/opengl/texture/atlas/bitmap/source/decorator/BaseBitmapTextureAtlasSourceDecorator$TextureAtlasSourceDecoratorOptions;-><init>()V */
		 /* invoke-direct {p0, p1, v0}, Lorg/anddev/andengine/opengl/texture/atlas/bitmap/source/decorator/BaseBitmapTextureAtlasSourceDecorator;-><init>(Lorg/anddev/andengine/opengl/texture/atlas/bitmap/source/IBitmapTextureAtlasSource;Lorg/anddev/andengine/opengl/texture/atlas/bitmap/source/decorator/BaseBitmapTextureAtlasSourceDecorator$TextureAtlasSourceDecoratorOptions;)V */
		 return;
	 } // .end method
	 public org.anddev.andengine.opengl.texture.atlas.bitmap.source.decorator.BaseBitmapTextureAtlasSourceDecorator ( ) {
		 v1 = 		 v0 = 		 /* .locals 2 */
		 /* invoke-direct {p0, v0, v1}, Lorg/anddev/andengine/opengl/texture/source/BaseTextureAtlasSource;-><init>(II)V */
		 /* new-instance v0, Landroid/graphics/Paint; */
		 /* invoke-direct {v0}, Landroid/graphics/Paint;-><init>()V */
		 this.mPaint = v0;
		 this.mBitmapTextureAtlasSource = p1;
		 /* if-nez p2, :cond_0 */
		 /* new-instance v0, Lorg/anddev/andengine/opengl/texture/atlas/bitmap/source/decorator/BaseBitmapTextureAtlasSourceDecorator$TextureAtlasSourceDecoratorOptions; */
		 /* invoke-direct {v0}, Lorg/anddev/andengine/opengl/texture/atlas/bitmap/source/decorator/BaseBitmapTextureAtlasSourceDecorator$TextureAtlasSourceDecoratorOptions;-><init>()V */
	 } // :goto_0
	 this.mTextureAtlasSourceDecoratorOptions = v0;
	 v0 = this.mPaint;
	 v1 = this.mTextureAtlasSourceDecoratorOptions;
	 v1 = 	 (( org.anddev.andengine.opengl.texture.atlas.bitmap.source.decorator.BaseBitmapTextureAtlasSourceDecorator$TextureAtlasSourceDecoratorOptions ) v1 ).getAntiAliasing ( ); // invoke-virtual {v1}, Lorg/anddev/andengine/opengl/texture/atlas/bitmap/source/decorator/BaseBitmapTextureAtlasSourceDecorator$TextureAtlasSourceDecoratorOptions;->getAntiAliasing()Z
	 (( android.graphics.Paint ) v0 ).setAntiAlias ( v1 ); // invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setAntiAlias(Z)V
	 return;
} // :cond_0
/* move-object v0, p2 */
} // .end method
private android.graphics.Bitmap ensureLoadedBitmapIsMutable ( android.graphics.Bitmap p0 ) {
/* .locals 2 */
v0 = (( android.graphics.Bitmap ) p1 ).isMutable ( ); // invoke-virtual {p1}, Landroid/graphics/Bitmap;->isMutable()Z
if ( v0 != null) { // if-eqz v0, :cond_0
	 /* move-object v0, p1 */
} // :goto_0
} // :cond_0
(( android.graphics.Bitmap ) p1 ).getConfig ( ); // invoke-virtual {p1}, Landroid/graphics/Bitmap;->getConfig()Landroid/graphics/Bitmap$Config;
int v1 = 1; // const/4 v1, 0x1
(( android.graphics.Bitmap ) p1 ).copy ( v0, v1 ); // invoke-virtual {p1, v0, v1}, Landroid/graphics/Bitmap;->copy(Landroid/graphics/Bitmap$Config;Z)Landroid/graphics/Bitmap;
(( android.graphics.Bitmap ) p1 ).recycle ( ); // invoke-virtual {p1}, Landroid/graphics/Bitmap;->recycle()V
} // .end method
/* # virtual methods */
public org.anddev.andengine.opengl.texture.atlas.bitmap.source.IBitmapTextureAtlasSource clone ( ) { //bridge//synthethic
/* .locals 1 */
(( org.anddev.andengine.opengl.texture.atlas.bitmap.source.decorator.BaseBitmapTextureAtlasSourceDecorator ) p0 ).clone ( ); // invoke-virtual {p0}, Lorg/anddev/andengine/opengl/texture/atlas/bitmap/source/decorator/BaseBitmapTextureAtlasSourceDecorator;->clone()Lorg/anddev/andengine/opengl/texture/atlas/bitmap/source/decorator/BaseBitmapTextureAtlasSourceDecorator;
} // .end method
public abstract org.anddev.andengine.opengl.texture.atlas.bitmap.source.decorator.BaseBitmapTextureAtlasSourceDecorator clone ( ) {
} // .end method
public org.anddev.andengine.opengl.texture.source.BaseTextureAtlasSource clone ( ) { //bridge//synthethic
/* .locals 1 */
(( org.anddev.andengine.opengl.texture.atlas.bitmap.source.decorator.BaseBitmapTextureAtlasSourceDecorator ) p0 ).clone ( ); // invoke-virtual {p0}, Lorg/anddev/andengine/opengl/texture/atlas/bitmap/source/decorator/BaseBitmapTextureAtlasSourceDecorator;->clone()Lorg/anddev/andengine/opengl/texture/atlas/bitmap/source/decorator/BaseBitmapTextureAtlasSourceDecorator;
} // .end method
public org.anddev.andengine.opengl.texture.source.ITextureAtlasSource clone ( ) { //bridge//synthethic
/* .locals 1 */
(( org.anddev.andengine.opengl.texture.atlas.bitmap.source.decorator.BaseBitmapTextureAtlasSourceDecorator ) p0 ).clone ( ); // invoke-virtual {p0}, Lorg/anddev/andengine/opengl/texture/atlas/bitmap/source/decorator/BaseBitmapTextureAtlasSourceDecorator;->clone()Lorg/anddev/andengine/opengl/texture/atlas/bitmap/source/decorator/BaseBitmapTextureAtlasSourceDecorator;
} // .end method
public Integer getHeight ( ) {
/* .locals 1 */
v0 = v0 = this.mBitmapTextureAtlasSource;
} // .end method
public android.graphics.Paint getPaint ( ) {
/* .locals 1 */
v0 = this.mPaint;
} // .end method
public org.anddev.andengine.opengl.texture.atlas.bitmap.source.decorator.BaseBitmapTextureAtlasSourceDecorator$TextureAtlasSourceDecoratorOptions getTextureAtlasSourceDecoratorOptions ( ) {
/* .locals 1 */
v0 = this.mTextureAtlasSourceDecoratorOptions;
} // .end method
public Integer getWidth ( ) {
/* .locals 1 */
v0 = v0 = this.mBitmapTextureAtlasSource;
} // .end method
protected abstract void onDecorateBitmap ( android.graphics.Canvas p0 ) {
} // .end method
public android.graphics.Bitmap onLoadBitmap ( android.graphics.Bitmap$Config p0 ) {
/* .locals 2 */
v0 = this.mBitmapTextureAtlasSource;
/* invoke-direct {p0, v0}, Lorg/anddev/andengine/opengl/texture/atlas/bitmap/source/decorator/BaseBitmapTextureAtlasSourceDecorator;->ensureLoadedBitmapIsMutable(Landroid/graphics/Bitmap;)Landroid/graphics/Bitmap; */
/* new-instance v1, Landroid/graphics/Canvas; */
/* invoke-direct {v1, v0}, Landroid/graphics/Canvas;-><init>(Landroid/graphics/Bitmap;)V */
(( org.anddev.andengine.opengl.texture.atlas.bitmap.source.decorator.BaseBitmapTextureAtlasSourceDecorator ) p0 ).onDecorateBitmap ( v1 ); // invoke-virtual {p0, v1}, Lorg/anddev/andengine/opengl/texture/atlas/bitmap/source/decorator/BaseBitmapTextureAtlasSourceDecorator;->onDecorateBitmap(Landroid/graphics/Canvas;)V
} // .end method
public void setPaint ( android.graphics.Paint p0 ) {
/* .locals 0 */
this.mPaint = p1;
return;
} // .end method
public void setTextureAtlasSourceDecoratorOptions ( org.anddev.andengine.opengl.texture.atlas.bitmap.source.decorator.BaseBitmapTextureAtlasSourceDecorator$TextureAtlasSourceDecoratorOptions p0 ) {
/* .locals 0 */
this.mTextureAtlasSourceDecoratorOptions = p1;
return;
} // .end method
