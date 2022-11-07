public class org.anddev.andengine.entity.text.Text extends org.anddev.andengine.entity.shape.RectangularShape {
	 /* # instance fields */
	 protected final Integer mCharactersMaximum;
	 private final org.anddev.andengine.opengl.font.Font mFont;
	 private java.lang.String mLines;
	 private Integer mMaximumLineWidth;
	 private java.lang.String mText;
	 private final org.anddev.andengine.opengl.texture.buffer.TextTextureBuffer mTextTextureBuffer;
	 protected final Integer mVertexCount;
	 private mWidths;
	 /* # direct methods */
	 public org.anddev.andengine.entity.text.Text ( ) {
		 /* .locals 6 */
		 v5 = org.anddev.andengine.util.HorizontalAlign.LEFT;
		 /* move-object v0, p0 */
		 /* move v1, p1 */
		 /* move v2, p2 */
		 /* move-object v3, p3 */
		 /* move-object v4, p4 */
		 /* invoke-direct/range {v0 ..v5}, Lorg/anddev/andengine/entity/text/Text;-><init>(FFLorg/anddev/andengine/opengl/font/Font;Ljava/lang/String;Lorg/anddev/andengine/util/HorizontalAlign;)V */
		 return;
	 } // .end method
	 public org.anddev.andengine.entity.text.Text ( ) {
		 /* .locals 7 */
		 v0 = 		 (( java.lang.String ) p4 ).length ( ); // invoke-virtual {p4}, Ljava/lang/String;->length()I
		 /* const/16 v1, 0xa */
		 v1 = 		 org.anddev.andengine.util.StringUtils .countOccurrences ( p4,v1 );
		 /* sub-int v6, v0, v1 */
		 /* move-object v0, p0 */
		 /* move v1, p1 */
		 /* move v2, p2 */
		 /* move-object v3, p3 */
		 /* move-object v4, p4 */
		 /* move-object v5, p5 */
		 /* invoke-direct/range {v0 ..v6}, Lorg/anddev/andengine/entity/text/Text;-><init>(FFLorg/anddev/andengine/opengl/font/Font;Ljava/lang/String;Lorg/anddev/andengine/util/HorizontalAlign;I)V */
		 return;
	 } // .end method
	 protected org.anddev.andengine.entity.text.Text ( ) {
		 /* .locals 8 */
		 /* const v7, 0x88e4 */
		 int v6 = 1; // const/4 v6, 0x1
		 int v3 = 0; // const/4 v3, 0x0
		 /* new-instance v5, Lorg/anddev/andengine/opengl/vertex/TextVertexBuffer; */
		 /* invoke-direct {v5, p6, p5, v7, v6}, Lorg/anddev/andengine/opengl/vertex/TextVertexBuffer;-><init>(ILorg/anddev/andengine/util/HorizontalAlign;IZ)V */
		 /* move-object v0, p0 */
		 /* move v1, p1 */
		 /* move v2, p2 */
		 /* move v4, v3 */
		 /* invoke-direct/range {v0 ..v5}, Lorg/anddev/andengine/entity/shape/RectangularShape;-><init>(FFFFLorg/anddev/andengine/opengl/vertex/VertexBuffer;)V */
		 /* iput p6, p0, Lorg/anddev/andengine/entity/text/Text;->mCharactersMaximum:I */
		 /* iget v0, p0, Lorg/anddev/andengine/entity/text/Text;->mCharactersMaximum:I */
		 /* mul-int/lit8 v0, v0, 0x6 */
		 /* iput v0, p0, Lorg/anddev/andengine/entity/text/Text;->mVertexCount:I */
		 /* new-instance v0, Lorg/anddev/andengine/opengl/texture/buffer/TextTextureBuffer; */
		 /* iget v1, p0, Lorg/anddev/andengine/entity/text/Text;->mVertexCount:I */
		 /* mul-int/lit8 v1, v1, 0x2 */
		 /* invoke-direct {v0, v1, v7, v6}, Lorg/anddev/andengine/opengl/texture/buffer/TextTextureBuffer;-><init>(IIZ)V */
		 this.mTextTextureBuffer = v0;
		 this.mFont = p3;
		 (( org.anddev.andengine.entity.text.Text ) p0 ).updateText ( p4 ); // invoke-virtual {p0, p4}, Lorg/anddev/andengine/entity/text/Text;->updateText(Ljava/lang/String;)V
		 /* invoke-direct {p0}, Lorg/anddev/andengine/entity/text/Text;->initBlendFunction()V */
		 return;
	 } // .end method
	 private void applyTexture ( javax.microedition.khronos.opengles.GL10 p0 ) {
		 /* .locals 3 */
		 /* sget-boolean v1, Lorg/anddev/andengine/opengl/util/GLHelper;->EXTENSIONS_VERTEXBUFFEROBJECTS:Z */
		 if ( v1 != null) { // if-eqz v1, :cond_0
			 /* move-object v0, p1 */
			 /* check-cast v0, Ljavax/microedition/khronos/opengles/GL11; */
			 /* move-object v1, v0 */
			 v2 = this.mTextTextureBuffer;
			 (( org.anddev.andengine.opengl.texture.buffer.TextTextureBuffer ) v2 ).selectOnHardware ( v1 ); // invoke-virtual {v2, v1}, Lorg/anddev/andengine/opengl/texture/buffer/TextTextureBuffer;->selectOnHardware(Ljavax/microedition/khronos/opengles/GL11;)V
			 v2 = this.mFont;
			 (( org.anddev.andengine.opengl.font.Font ) v2 ).getBitmapTextureAtlas ( ); // invoke-virtual {v2}, Lorg/anddev/andengine/opengl/font/Font;->getBitmapTextureAtlas()Lorg/anddev/andengine/opengl/texture/atlas/bitmap/BitmapTextureAtlas;
			 (( org.anddev.andengine.opengl.texture.atlas.bitmap.BitmapTextureAtlas ) v2 ).bind ( p1 ); // invoke-virtual {v2, p1}, Lorg/anddev/andengine/opengl/texture/atlas/bitmap/BitmapTextureAtlas;->bind(Ljavax/microedition/khronos/opengles/GL10;)V
			 org.anddev.andengine.opengl.util.GLHelper .texCoordZeroPointer ( v1 );
		 } // :goto_0
		 return;
	 } // :cond_0
	 v1 = this.mFont;
	 (( org.anddev.andengine.opengl.font.Font ) v1 ).getBitmapTextureAtlas ( ); // invoke-virtual {v1}, Lorg/anddev/andengine/opengl/font/Font;->getBitmapTextureAtlas()Lorg/anddev/andengine/opengl/texture/atlas/bitmap/BitmapTextureAtlas;
	 (( org.anddev.andengine.opengl.texture.atlas.bitmap.BitmapTextureAtlas ) v1 ).bind ( p1 ); // invoke-virtual {v1, p1}, Lorg/anddev/andengine/opengl/texture/atlas/bitmap/BitmapTextureAtlas;->bind(Ljavax/microedition/khronos/opengles/GL10;)V
	 v1 = this.mTextTextureBuffer;
	 (( org.anddev.andengine.opengl.texture.buffer.TextTextureBuffer ) v1 ).getFloatBuffer ( ); // invoke-virtual {v1}, Lorg/anddev/andengine/opengl/texture/buffer/TextTextureBuffer;->getFloatBuffer()Lorg/anddev/andengine/opengl/util/FastFloatBuffer;
	 org.anddev.andengine.opengl.util.GLHelper .texCoordPointer ( p1,v1 );
} // .end method
private void initBlendFunction ( ) {
	 /* .locals 2 */
	 v0 = this.mFont;
	 (( org.anddev.andengine.opengl.font.Font ) v0 ).getBitmapTextureAtlas ( ); // invoke-virtual {v0}, Lorg/anddev/andengine/opengl/font/Font;->getBitmapTextureAtlas()Lorg/anddev/andengine/opengl/texture/atlas/bitmap/BitmapTextureAtlas;
	 (( org.anddev.andengine.opengl.texture.atlas.bitmap.BitmapTextureAtlas ) v0 ).getTextureOptions ( ); // invoke-virtual {v0}, Lorg/anddev/andengine/opengl/texture/atlas/bitmap/BitmapTextureAtlas;->getTextureOptions()Lorg/anddev/andengine/opengl/texture/TextureOptions;
	 /* iget-boolean v0, v0, Lorg/anddev/andengine/opengl/texture/TextureOptions;->mPreMultipyAlpha:Z */
	 if ( v0 != null) { // if-eqz v0, :cond_0
		 int v0 = 1; // const/4 v0, 0x1
		 /* const/16 v1, 0x303 */
		 (( org.anddev.andengine.entity.text.Text ) p0 ).setBlendFunction ( v0, v1 ); // invoke-virtual {p0, v0, v1}, Lorg/anddev/andengine/entity/text/Text;->setBlendFunction(II)V
	 } // :cond_0
	 return;
} // .end method
/* # virtual methods */
protected void drawVertices ( javax.microedition.khronos.opengles.GL10 p0, org.anddev.andengine.engine.camera.Camera p1 ) {
	 /* .locals 3 */
	 int v0 = 4; // const/4 v0, 0x4
	 int v1 = 0; // const/4 v1, 0x0
	 /* iget v2, p0, Lorg/anddev/andengine/entity/text/Text;->mVertexCount:I */
	 return;
} // .end method
protected void finalize ( ) {
	 /* .locals 1 */
	 /* invoke-super {p0}, Lorg/anddev/andengine/entity/shape/RectangularShape;->finalize()V */
	 v0 = this.mTextTextureBuffer;
	 v0 = 	 (( org.anddev.andengine.opengl.texture.buffer.TextTextureBuffer ) v0 ).isManaged ( ); // invoke-virtual {v0}, Lorg/anddev/andengine/opengl/texture/buffer/TextTextureBuffer;->isManaged()Z
	 if ( v0 != null) { // if-eqz v0, :cond_0
		 v0 = this.mTextTextureBuffer;
		 (( org.anddev.andengine.opengl.texture.buffer.TextTextureBuffer ) v0 ).unloadFromActiveBufferObjectManager ( ); // invoke-virtual {v0}, Lorg/anddev/andengine/opengl/texture/buffer/TextTextureBuffer;->unloadFromActiveBufferObjectManager()V
	 } // :cond_0
	 return;
} // .end method
public Integer getCharactersMaximum ( ) {
	 /* .locals 1 */
	 /* iget v0, p0, Lorg/anddev/andengine/entity/text/Text;->mCharactersMaximum:I */
} // .end method
public java.lang.String getText ( ) {
	 /* .locals 1 */
	 v0 = this.mText;
} // .end method
public org.anddev.andengine.opengl.vertex.TextVertexBuffer getVertexBuffer ( ) {
	 /* .locals 0 */
	 p0 = this.mVertexBuffer;
	 /* check-cast p0, Lorg/anddev/andengine/opengl/vertex/TextVertexBuffer; */
} // .end method
public org.anddev.andengine.opengl.vertex.VertexBuffer getVertexBuffer ( ) { //bridge//synthethic
	 /* .locals 1 */
	 (( org.anddev.andengine.entity.text.Text ) p0 ).getVertexBuffer ( ); // invoke-virtual {p0}, Lorg/anddev/andengine/entity/text/Text;->getVertexBuffer()Lorg/anddev/andengine/opengl/vertex/TextVertexBuffer;
} // .end method
protected void onApplyTransformations ( javax.microedition.khronos.opengles.GL10 p0 ) {
	 /* .locals 0 */
	 /* invoke-super {p0, p1}, Lorg/anddev/andengine/entity/shape/RectangularShape;->onApplyTransformations(Ljavax/microedition/khronos/opengles/GL10;)V */
	 /* invoke-direct {p0, p1}, Lorg/anddev/andengine/entity/text/Text;->applyTexture(Ljavax/microedition/khronos/opengles/GL10;)V */
	 return;
} // .end method
protected void onInitDraw ( javax.microedition.khronos.opengles.GL10 p0 ) {
	 /* .locals 0 */
	 /* invoke-super {p0, p1}, Lorg/anddev/andengine/entity/shape/RectangularShape;->onInitDraw(Ljavax/microedition/khronos/opengles/GL10;)V */
	 org.anddev.andengine.opengl.util.GLHelper .enableTextures ( p1 );
	 org.anddev.andengine.opengl.util.GLHelper .enableTexCoordArray ( p1 );
	 return;
} // .end method
protected void onUpdateVertexBuffer ( ) {
	 /* .locals 5 */
	 v0 = this.mFont;
	 if ( v0 != null) { // if-eqz v0, :cond_0
		 (( org.anddev.andengine.entity.text.Text ) p0 ).getVertexBuffer ( ); // invoke-virtual {p0}, Lorg/anddev/andengine/entity/text/Text;->getVertexBuffer()Lorg/anddev/andengine/opengl/vertex/TextVertexBuffer;
		 /* iget v2, p0, Lorg/anddev/andengine/entity/text/Text;->mMaximumLineWidth:I */
		 v3 = this.mWidths;
		 v4 = this.mLines;
		 (( org.anddev.andengine.opengl.vertex.TextVertexBuffer ) v1 ).update ( v0, v2, v3, v4 ); // invoke-virtual {v1, v0, v2, v3, v4}, Lorg/anddev/andengine/opengl/vertex/TextVertexBuffer;->update(Lorg/anddev/andengine/opengl/font/Font;I[I[Ljava/lang/String;)V
	 } // :cond_0
	 return;
} // .end method
protected void updateText ( java.lang.String p0 ) {
	 /* .locals 9 */
	 int v5 = 0; // const/4 v5, 0x0
	 /* const/high16 v8, 0x3f000000 # 0.5f */
	 int v7 = 1; // const/4 v7, 0x1
	 this.mText = p1;
	 v0 = this.mFont;
	 v1 = this.mText;
	 /* const/16 v2, 0xa */
	 v3 = this.mLines;
	 org.anddev.andengine.util.StringUtils .split ( v1,v2,v3 );
	 this.mLines = v1;
	 v1 = this.mLines;
	 /* array-length v2, v1 */
	 v3 = this.mWidths;
	 if ( v3 != null) { // if-eqz v3, :cond_1
		 v3 = this.mWidths;
		 /* array-length v3, v3 */
		 /* if-ne v3, v2, :cond_1 */
		 /* move v3, v7 */
	 } // :goto_0
	 /* if-nez v3, :cond_0 */
	 /* new-array v3, v2, [I */
	 this.mWidths = v3;
} // :cond_0
v3 = this.mWidths;
/* sub-int v4, v2, v7 */
} // :goto_1
/* if-gez v4, :cond_2 */
/* iput v5, p0, Lorg/anddev/andengine/entity/text/Text;->mMaximumLineWidth:I */
/* iget v3, p0, Lorg/anddev/andengine/entity/text/Text;->mMaximumLineWidth:I */
/* int-to-float v3, v3 */
/* iput v3, p0, Lorg/anddev/andengine/entity/shape/RectangularShape;->mWidth:F */
/* iget v3, p0, Lorg/anddev/andengine/entity/shape/RectangularShape;->mWidth:F */
/* iput v3, p0, Lorg/anddev/andengine/entity/shape/RectangularShape;->mBaseWidth:F */
v4 = (( org.anddev.andengine.opengl.font.Font ) v0 ).getLineHeight ( ); // invoke-virtual {v0}, Lorg/anddev/andengine/opengl/font/Font;->getLineHeight()I
/* mul-int/2addr v4, v2 */
/* sub-int/2addr v2, v7 */
v5 = (( org.anddev.andengine.opengl.font.Font ) v0 ).getLineGap ( ); // invoke-virtual {v0}, Lorg/anddev/andengine/opengl/font/Font;->getLineGap()I
/* mul-int/2addr v2, v5 */
/* add-int/2addr v2, v4 */
/* int-to-float v2, v2 */
/* iput v2, p0, Lorg/anddev/andengine/entity/shape/RectangularShape;->mHeight:F */
/* iget v2, p0, Lorg/anddev/andengine/entity/shape/RectangularShape;->mHeight:F */
/* iput v2, p0, Lorg/anddev/andengine/entity/shape/RectangularShape;->mBaseHeight:F */
/* mul-float/2addr v3, v8 */
/* iput v3, p0, Lorg/anddev/andengine/entity/text/Text;->mRotationCenterX:F */
/* mul-float/2addr v2, v8 */
/* iput v2, p0, Lorg/anddev/andengine/entity/text/Text;->mRotationCenterY:F */
/* iget v2, p0, Lorg/anddev/andengine/entity/text/Text;->mRotationCenterX:F */
/* iput v2, p0, Lorg/anddev/andengine/entity/text/Text;->mScaleCenterX:F */
/* iget v2, p0, Lorg/anddev/andengine/entity/text/Text;->mRotationCenterY:F */
/* iput v2, p0, Lorg/anddev/andengine/entity/text/Text;->mScaleCenterY:F */
v2 = this.mTextTextureBuffer;
(( org.anddev.andengine.opengl.texture.buffer.TextTextureBuffer ) v2 ).update ( v0, v1 ); // invoke-virtual {v2, v0, v1}, Lorg/anddev/andengine/opengl/texture/buffer/TextTextureBuffer;->update(Lorg/anddev/andengine/opengl/font/Font;[Ljava/lang/String;)V
(( org.anddev.andengine.entity.text.Text ) p0 ).updateVertexBuffer ( ); // invoke-virtual {p0}, Lorg/anddev/andengine/entity/text/Text;->updateVertexBuffer()V
return;
} // :cond_1
/* move v3, v5 */
} // :cond_2
/* aget-object v6, v1, v4 */
v6 = (( org.anddev.andengine.opengl.font.Font ) v0 ).getStringWidth ( v6 ); // invoke-virtual {v0, v6}, Lorg/anddev/andengine/opengl/font/Font;->getStringWidth(Ljava/lang/String;)I
/* aput v6, v3, v4 */
/* aget v6, v3, v4 */
v5 = java.lang.Math .max ( v5,v6 );
/* add-int/lit8 v4, v4, -0x1 */
} // .end method
