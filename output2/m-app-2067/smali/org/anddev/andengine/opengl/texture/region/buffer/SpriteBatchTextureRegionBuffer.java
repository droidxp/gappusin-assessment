public class org.anddev.andengine.opengl.texture.region.buffer.SpriteBatchTextureRegionBuffer extends org.anddev.andengine.opengl.buffer.BufferObject {
	 /* # instance fields */
	 private Integer mIndex;
	 /* # direct methods */
	 public org.anddev.andengine.opengl.texture.region.buffer.SpriteBatchTextureRegionBuffer ( ) {
		 /* .locals 1 */
		 /* mul-int/lit8 v0, p1, 0x2 */
		 /* mul-int/lit8 v0, v0, 0x6 */
		 /* invoke-direct {p0, v0, p2, p3}, Lorg/anddev/andengine/opengl/buffer/BufferObject;-><init>(IIZ)V */
		 return;
	 } // .end method
	 /* # virtual methods */
	 public void add ( org.anddev.andengine.opengl.texture.region.BaseTextureRegion p0 ) {
		 /* .locals 7 */
		 (( org.anddev.andengine.opengl.texture.region.BaseTextureRegion ) p1 ).getTexture ( ); // invoke-virtual {p1}, Lorg/anddev/andengine/opengl/texture/region/BaseTextureRegion;->getTexture()Lorg/anddev/andengine/opengl/texture/ITexture;
		 /* if-nez v0, :cond_0 */
	 } // :goto_0
	 return;
} // :cond_0
v0 = (( org.anddev.andengine.opengl.texture.region.BaseTextureRegion ) p1 ).getTextureCoordinateX1 ( ); // invoke-virtual {p1}, Lorg/anddev/andengine/opengl/texture/region/BaseTextureRegion;->getTextureCoordinateX1()F
v0 = java.lang.Float .floatToRawIntBits ( v0 );
v1 = (( org.anddev.andengine.opengl.texture.region.BaseTextureRegion ) p1 ).getTextureCoordinateY1 ( ); // invoke-virtual {p1}, Lorg/anddev/andengine/opengl/texture/region/BaseTextureRegion;->getTextureCoordinateY1()F
v1 = java.lang.Float .floatToRawIntBits ( v1 );
v2 = (( org.anddev.andengine.opengl.texture.region.BaseTextureRegion ) p1 ).getTextureCoordinateX2 ( ); // invoke-virtual {p1}, Lorg/anddev/andengine/opengl/texture/region/BaseTextureRegion;->getTextureCoordinateX2()F
v2 = java.lang.Float .floatToRawIntBits ( v2 );
v3 = (( org.anddev.andengine.opengl.texture.region.BaseTextureRegion ) p1 ).getTextureCoordinateY2 ( ); // invoke-virtual {p1}, Lorg/anddev/andengine/opengl/texture/region/BaseTextureRegion;->getTextureCoordinateY2()F
v3 = java.lang.Float .floatToRawIntBits ( v3 );
v4 = this.mBufferData;
/* iget v5, p0, Lorg/anddev/andengine/opengl/texture/region/buffer/SpriteBatchTextureRegionBuffer;->mIndex:I */
/* add-int/lit8 v6, v5, 0x1 */
/* aput v0, v4, v5 */
/* add-int/lit8 v5, v6, 0x1 */
/* aput v1, v4, v6 */
/* add-int/lit8 v6, v5, 0x1 */
/* aput v0, v4, v5 */
/* add-int/lit8 v5, v6, 0x1 */
/* aput v3, v4, v6 */
/* add-int/lit8 v6, v5, 0x1 */
/* aput v2, v4, v5 */
/* add-int/lit8 v5, v6, 0x1 */
/* aput v1, v4, v6 */
/* add-int/lit8 v6, v5, 0x1 */
/* aput v2, v4, v5 */
/* add-int/lit8 v5, v6, 0x1 */
/* aput v1, v4, v6 */
/* add-int/lit8 v1, v5, 0x1 */
/* aput v0, v4, v5 */
/* add-int/lit8 v0, v1, 0x1 */
/* aput v3, v4, v1 */
/* add-int/lit8 v1, v0, 0x1 */
/* aput v2, v4, v0 */
/* add-int/lit8 v0, v1, 0x1 */
/* aput v3, v4, v1 */
/* iput v0, p0, Lorg/anddev/andengine/opengl/texture/region/buffer/SpriteBatchTextureRegionBuffer;->mIndex:I */
} // .end method
public void setIndex ( Integer p0 ) {
/* .locals 0 */
/* iput p1, p0, Lorg/anddev/andengine/opengl/texture/region/buffer/SpriteBatchTextureRegionBuffer;->mIndex:I */
return;
} // .end method
public void submit ( ) {
/* .locals 3 */
int v2 = 0; // const/4 v2, 0x0
v0 = this.mFloatBuffer;
(( org.anddev.andengine.opengl.util.FastFloatBuffer ) v0 ).position ( v2 ); // invoke-virtual {v0, v2}, Lorg/anddev/andengine/opengl/util/FastFloatBuffer;->position(I)V
v1 = this.mBufferData;
(( org.anddev.andengine.opengl.util.FastFloatBuffer ) v0 ).put ( v1 ); // invoke-virtual {v0, v1}, Lorg/anddev/andengine/opengl/util/FastFloatBuffer;->put([I)V
(( org.anddev.andengine.opengl.util.FastFloatBuffer ) v0 ).position ( v2 ); // invoke-virtual {v0, v2}, Lorg/anddev/andengine/opengl/util/FastFloatBuffer;->position(I)V
/* invoke-super {p0}, Lorg/anddev/andengine/opengl/buffer/BufferObject;->setHardwareBufferNeedsUpdate()V */
return;
} // .end method
