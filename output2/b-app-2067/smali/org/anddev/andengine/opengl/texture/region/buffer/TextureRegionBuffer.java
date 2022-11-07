public class org.anddev.andengine.opengl.texture.region.buffer.TextureRegionBuffer extends org.anddev.andengine.opengl.buffer.BufferObject {
	 /* # instance fields */
	 private Boolean mFlippedHorizontal;
	 private Boolean mFlippedVertical;
	 protected final org.anddev.andengine.opengl.texture.region.BaseTextureRegion mTextureRegion;
	 /* # direct methods */
	 public org.anddev.andengine.opengl.texture.region.buffer.TextureRegionBuffer ( ) {
		 /* .locals 1 */
		 /* const/16 v0, 0x8 */
		 /* invoke-direct {p0, v0, p2, p3}, Lorg/anddev/andengine/opengl/buffer/BufferObject;-><init>(IIZ)V */
		 this.mTextureRegion = p1;
		 return;
	 } // .end method
	 /* # virtual methods */
	 public org.anddev.andengine.opengl.texture.region.BaseTextureRegion getTextureRegion ( ) {
		 /* .locals 1 */
		 v0 = this.mTextureRegion;
	 } // .end method
	 public Boolean isFlippedHorizontal ( ) {
		 /* .locals 1 */
		 /* iget-boolean v0, p0, Lorg/anddev/andengine/opengl/texture/region/buffer/TextureRegionBuffer;->mFlippedHorizontal:Z */
	 } // .end method
	 public Boolean isFlippedVertical ( ) {
		 /* .locals 1 */
		 /* iget-boolean v0, p0, Lorg/anddev/andengine/opengl/texture/region/buffer/TextureRegionBuffer;->mFlippedVertical:Z */
	 } // .end method
	 public void setFlippedHorizontal ( Boolean p0 ) {
		 /* .locals 1 */
		 /* iget-boolean v0, p0, Lorg/anddev/andengine/opengl/texture/region/buffer/TextureRegionBuffer;->mFlippedHorizontal:Z */
		 /* if-eq v0, p1, :cond_0 */
		 /* iput-boolean p1, p0, Lorg/anddev/andengine/opengl/texture/region/buffer/TextureRegionBuffer;->mFlippedHorizontal:Z */
		 (( org.anddev.andengine.opengl.texture.region.buffer.TextureRegionBuffer ) p0 ).update ( ); // invoke-virtual {p0}, Lorg/anddev/andengine/opengl/texture/region/buffer/TextureRegionBuffer;->update()V
	 } // :cond_0
	 return;
} // .end method
public void setFlippedVertical ( Boolean p0 ) {
	 /* .locals 1 */
	 /* iget-boolean v0, p0, Lorg/anddev/andengine/opengl/texture/region/buffer/TextureRegionBuffer;->mFlippedVertical:Z */
	 /* if-eq v0, p1, :cond_0 */
	 /* iput-boolean p1, p0, Lorg/anddev/andengine/opengl/texture/region/buffer/TextureRegionBuffer;->mFlippedVertical:Z */
	 (( org.anddev.andengine.opengl.texture.region.buffer.TextureRegionBuffer ) p0 ).update ( ); // invoke-virtual {p0}, Lorg/anddev/andengine/opengl/texture/region/buffer/TextureRegionBuffer;->update()V
} // :cond_0
return;
} // .end method
public synchronized void update ( ) {
/* .locals 6 */
/* monitor-enter p0 */
try { // :try_start_0
	 v0 = this.mTextureRegion;
	 (( org.anddev.andengine.opengl.texture.region.BaseTextureRegion ) v0 ).getTexture ( ); // invoke-virtual {v0}, Lorg/anddev/andengine/opengl/texture/region/BaseTextureRegion;->getTexture()Lorg/anddev/andengine/opengl/texture/ITexture;
	 /* :try_end_0 */
	 /* .catchall {:try_start_0 ..:try_end_0} :catchall_0 */
	 /* if-nez v1, :cond_0 */
} // :goto_0
/* monitor-exit p0 */
return;
} // :cond_0
try { // :try_start_1
v1 = (( org.anddev.andengine.opengl.texture.region.BaseTextureRegion ) v0 ).getTextureCoordinateX1 ( ); // invoke-virtual {v0}, Lorg/anddev/andengine/opengl/texture/region/BaseTextureRegion;->getTextureCoordinateX1()F
v1 = java.lang.Float .floatToRawIntBits ( v1 );
v2 = (( org.anddev.andengine.opengl.texture.region.BaseTextureRegion ) v0 ).getTextureCoordinateY1 ( ); // invoke-virtual {v0}, Lorg/anddev/andengine/opengl/texture/region/BaseTextureRegion;->getTextureCoordinateY1()F
v2 = java.lang.Float .floatToRawIntBits ( v2 );
v3 = (( org.anddev.andengine.opengl.texture.region.BaseTextureRegion ) v0 ).getTextureCoordinateX2 ( ); // invoke-virtual {v0}, Lorg/anddev/andengine/opengl/texture/region/BaseTextureRegion;->getTextureCoordinateX2()F
v3 = java.lang.Float .floatToRawIntBits ( v3 );
v0 = (( org.anddev.andengine.opengl.texture.region.BaseTextureRegion ) v0 ).getTextureCoordinateY2 ( ); // invoke-virtual {v0}, Lorg/anddev/andengine/opengl/texture/region/BaseTextureRegion;->getTextureCoordinateY2()F
v0 = java.lang.Float .floatToRawIntBits ( v0 );
v4 = this.mBufferData;
/* iget-boolean v5, p0, Lorg/anddev/andengine/opengl/texture/region/buffer/TextureRegionBuffer;->mFlippedVertical:Z */
if ( v5 != null) { // if-eqz v5, :cond_2
	 /* iget-boolean v5, p0, Lorg/anddev/andengine/opengl/texture/region/buffer/TextureRegionBuffer;->mFlippedHorizontal:Z */
	 if ( v5 != null) { // if-eqz v5, :cond_1
		 int v5 = 0; // const/4 v5, 0x0
		 /* aput v3, v4, v5 */
		 int v5 = 1; // const/4 v5, 0x1
		 /* aput v0, v4, v5 */
		 int v5 = 2; // const/4 v5, 0x2
		 /* aput v3, v4, v5 */
		 int v3 = 3; // const/4 v3, 0x3
		 /* aput v2, v4, v3 */
		 int v3 = 4; // const/4 v3, 0x4
		 /* aput v1, v4, v3 */
		 int v3 = 5; // const/4 v3, 0x5
		 /* aput v0, v4, v3 */
		 int v0 = 6; // const/4 v0, 0x6
		 /* aput v1, v4, v0 */
		 int v0 = 7; // const/4 v0, 0x7
		 /* aput v2, v4, v0 */
	 } // :goto_1
	 v0 = this.mFloatBuffer;
	 int v1 = 0; // const/4 v1, 0x0
	 (( org.anddev.andengine.opengl.util.FastFloatBuffer ) v0 ).position ( v1 ); // invoke-virtual {v0, v1}, Lorg/anddev/andengine/opengl/util/FastFloatBuffer;->position(I)V
	 (( org.anddev.andengine.opengl.util.FastFloatBuffer ) v0 ).put ( v4 ); // invoke-virtual {v0, v4}, Lorg/anddev/andengine/opengl/util/FastFloatBuffer;->put([I)V
	 int v1 = 0; // const/4 v1, 0x0
	 (( org.anddev.andengine.opengl.util.FastFloatBuffer ) v0 ).position ( v1 ); // invoke-virtual {v0, v1}, Lorg/anddev/andengine/opengl/util/FastFloatBuffer;->position(I)V
	 /* invoke-super {p0}, Lorg/anddev/andengine/opengl/buffer/BufferObject;->setHardwareBufferNeedsUpdate()V */
	 /* :try_end_1 */
	 /* .catchall {:try_start_1 ..:try_end_1} :catchall_0 */
	 /* :catchall_0 */
	 /* move-exception v0 */
	 /* monitor-exit p0 */
	 /* throw v0 */
} // :cond_1
int v5 = 0; // const/4 v5, 0x0
try { // :try_start_2
	 /* aput v1, v4, v5 */
	 int v5 = 1; // const/4 v5, 0x1
	 /* aput v0, v4, v5 */
	 int v5 = 2; // const/4 v5, 0x2
	 /* aput v1, v4, v5 */
	 int v1 = 3; // const/4 v1, 0x3
	 /* aput v2, v4, v1 */
	 int v1 = 4; // const/4 v1, 0x4
	 /* aput v3, v4, v1 */
	 int v1 = 5; // const/4 v1, 0x5
	 /* aput v0, v4, v1 */
	 int v0 = 6; // const/4 v0, 0x6
	 /* aput v3, v4, v0 */
	 int v0 = 7; // const/4 v0, 0x7
	 /* aput v2, v4, v0 */
} // :cond_2
/* iget-boolean v5, p0, Lorg/anddev/andengine/opengl/texture/region/buffer/TextureRegionBuffer;->mFlippedHorizontal:Z */
if ( v5 != null) { // if-eqz v5, :cond_3
	 int v5 = 0; // const/4 v5, 0x0
	 /* aput v3, v4, v5 */
	 int v5 = 1; // const/4 v5, 0x1
	 /* aput v2, v4, v5 */
	 int v5 = 2; // const/4 v5, 0x2
	 /* aput v3, v4, v5 */
	 int v3 = 3; // const/4 v3, 0x3
	 /* aput v0, v4, v3 */
	 int v3 = 4; // const/4 v3, 0x4
	 /* aput v1, v4, v3 */
	 int v3 = 5; // const/4 v3, 0x5
	 /* aput v2, v4, v3 */
	 int v2 = 6; // const/4 v2, 0x6
	 /* aput v1, v4, v2 */
	 int v1 = 7; // const/4 v1, 0x7
	 /* aput v0, v4, v1 */
} // :cond_3
int v5 = 0; // const/4 v5, 0x0
/* aput v1, v4, v5 */
int v5 = 1; // const/4 v5, 0x1
/* aput v2, v4, v5 */
int v5 = 2; // const/4 v5, 0x2
/* aput v1, v4, v5 */
int v1 = 3; // const/4 v1, 0x3
/* aput v0, v4, v1 */
int v1 = 4; // const/4 v1, 0x4
/* aput v3, v4, v1 */
int v1 = 5; // const/4 v1, 0x5
/* aput v2, v4, v1 */
int v1 = 6; // const/4 v1, 0x6
/* aput v3, v4, v1 */
int v1 = 7; // const/4 v1, 0x7
/* aput v0, v4, v1 */
/* :try_end_2 */
/* .catchall {:try_start_2 ..:try_end_2} :catchall_0 */
} // .end method
