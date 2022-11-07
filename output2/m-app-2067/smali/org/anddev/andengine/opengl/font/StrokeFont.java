public class org.anddev.andengine.opengl.font.StrokeFont extends org.anddev.andengine.opengl.font.Font {
	 /* # instance fields */
	 private final Boolean mStrokeOnly;
	 private final android.graphics.Paint mStrokePaint;
	 /* # direct methods */
	 public org.anddev.andengine.opengl.font.StrokeFont ( ) {
		 /* .locals 9 */
		 int v8 = 0; // const/4 v8, 0x0
		 /* move-object v0, p0 */
		 /* move-object v1, p1 */
		 /* move-object v2, p2 */
		 /* move v3, p3 */
		 /* move v4, p4 */
		 /* move v5, p5 */
		 /* move v6, p6 */
		 /* move/from16 v7, p7 */
		 /* invoke-direct/range {v0 ..v8}, Lorg/anddev/andengine/opengl/font/StrokeFont;-><init>(Lorg/anddev/andengine/opengl/texture/atlas/bitmap/BitmapTextureAtlas;Landroid/graphics/Typeface;FZIFIZ)V */
		 return;
	 } // .end method
	 public org.anddev.andengine.opengl.font.StrokeFont ( ) {
		 /* .locals 2 */
		 /* invoke-direct/range {p0 ..p5}, Lorg/anddev/andengine/opengl/font/Font;-><init>(Lorg/anddev/andengine/opengl/texture/atlas/bitmap/BitmapTextureAtlas;Landroid/graphics/Typeface;FZI)V */
		 /* new-instance v0, Landroid/graphics/Paint; */
		 /* invoke-direct {v0}, Landroid/graphics/Paint;-><init>()V */
		 this.mStrokePaint = v0;
		 v0 = this.mStrokePaint;
		 (( android.graphics.Paint ) v0 ).setTypeface ( p2 ); // invoke-virtual {v0, p2}, Landroid/graphics/Paint;->setTypeface(Landroid/graphics/Typeface;)Landroid/graphics/Typeface;
		 v0 = this.mStrokePaint;
		 v1 = android.graphics.Paint$Style.STROKE;
		 (( android.graphics.Paint ) v0 ).setStyle ( v1 ); // invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setStyle(Landroid/graphics/Paint$Style;)V
		 v0 = this.mStrokePaint;
		 (( android.graphics.Paint ) v0 ).setStrokeWidth ( p6 ); // invoke-virtual {v0, p6}, Landroid/graphics/Paint;->setStrokeWidth(F)V
		 v0 = this.mStrokePaint;
		 (( android.graphics.Paint ) v0 ).setColor ( p7 ); // invoke-virtual {v0, p7}, Landroid/graphics/Paint;->setColor(I)V
		 v0 = this.mStrokePaint;
		 (( android.graphics.Paint ) v0 ).setTextSize ( p3 ); // invoke-virtual {v0, p3}, Landroid/graphics/Paint;->setTextSize(F)V
		 v0 = this.mStrokePaint;
		 (( android.graphics.Paint ) v0 ).setAntiAlias ( p4 ); // invoke-virtual {v0, p4}, Landroid/graphics/Paint;->setAntiAlias(Z)V
		 /* iput-boolean p8, p0, Lorg/anddev/andengine/opengl/font/StrokeFont;->mStrokeOnly:Z */
		 return;
	 } // .end method
	 /* # virtual methods */
	 protected void drawCharacterString ( java.lang.String p0 ) {
		 /* .locals 4 */
		 /* iget-boolean v0, p0, Lorg/anddev/andengine/opengl/font/StrokeFont;->mStrokeOnly:Z */
		 /* if-nez v0, :cond_0 */
		 /* invoke-super {p0, p1}, Lorg/anddev/andengine/opengl/font/Font;->drawCharacterString(Ljava/lang/String;)V */
	 } // :cond_0
	 v0 = this.mCanvas;
	 int v1 = 0; // const/4 v1, 0x0
	 v2 = this.mFontMetrics;
	 /* iget v2, v2, Landroid/graphics/Paint$FontMetrics;->ascent:F */
	 /* neg-float v2, v2 */
	 v3 = this.mStrokePaint;
	 (( android.graphics.Canvas ) v0 ).drawText ( p1, v1, v2, v3 ); // invoke-virtual {v0, p1, v1, v2, v3}, Landroid/graphics/Canvas;->drawText(Ljava/lang/String;FFLandroid/graphics/Paint;)V
	 return;
} // .end method
