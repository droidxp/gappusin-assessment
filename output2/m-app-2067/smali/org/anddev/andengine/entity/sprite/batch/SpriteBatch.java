public class org.anddev.andengine.entity.sprite.batch.SpriteBatch extends org.anddev.andengine.entity.Entity {
	 /* # instance fields */
	 protected final Integer mCapacity;
	 private Integer mDestinationBlendFunction;
	 private Boolean mDirty;
	 private Integer mIndex;
	 private Integer mSourceBlendFunction;
	 private final org.anddev.andengine.opengl.texture.region.buffer.SpriteBatchTextureRegionBuffer mSpriteBatchTextureRegionBuffer;
	 private final org.anddev.andengine.opengl.vertex.SpriteBatchVertexBuffer mSpriteBatchVertexBuffer;
	 private final org.anddev.andengine.opengl.texture.ITexture mTexture;
	 private Integer mVertices;
	 /* # direct methods */
	 public org.anddev.andengine.entity.sprite.batch.SpriteBatch ( ) {
		 /* .locals 3 */
		 /* const v2, 0x88e4 */
		 int v1 = 1; // const/4 v1, 0x1
		 /* invoke-direct {p0}, Lorg/anddev/andengine/entity/Entity;-><init>()V */
		 int v0 = 0; // const/4 v0, 0x0
		 /* iput-boolean v0, p0, Lorg/anddev/andengine/entity/sprite/batch/SpriteBatch;->mDirty:Z */
		 this.mTexture = p1;
		 /* iput p2, p0, Lorg/anddev/andengine/entity/sprite/batch/SpriteBatch;->mCapacity:I */
		 /* new-instance v0, Lorg/anddev/andengine/opengl/vertex/SpriteBatchVertexBuffer; */
		 /* invoke-direct {v0, p2, v2, v1}, Lorg/anddev/andengine/opengl/vertex/SpriteBatchVertexBuffer;-><init>(IIZ)V */
		 this.mSpriteBatchVertexBuffer = v0;
		 /* new-instance v0, Lorg/anddev/andengine/opengl/texture/region/buffer/SpriteBatchTextureRegionBuffer; */
		 /* invoke-direct {v0, p2, v2, v1}, Lorg/anddev/andengine/opengl/texture/region/buffer/SpriteBatchTextureRegionBuffer;-><init>(IIZ)V */
		 this.mSpriteBatchTextureRegionBuffer = v0;
		 /* invoke-direct {p0}, Lorg/anddev/andengine/entity/sprite/batch/SpriteBatch;->initBlendFunction()V */
		 return;
	 } // .end method
	 private void assertCapacity ( ) {
		 /* .locals 3 */
		 /* iget v0, p0, Lorg/anddev/andengine/entity/sprite/batch/SpriteBatch;->mIndex:I */
		 /* iget v1, p0, Lorg/anddev/andengine/entity/sprite/batch/SpriteBatch;->mCapacity:I */
		 /* if-ne v0, v1, :cond_0 */
		 /* new-instance v0, Ljava/lang/IllegalStateException; */
		 /* new-instance v1, Ljava/lang/StringBuilder; */
		 final String v2 = "This SpriteBatch has already reached its capacity ("; // const-string v2, "This SpriteBatch has already reached its capacity ("
		 /* invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V */
		 /* iget v2, p0, Lorg/anddev/andengine/entity/sprite/batch/SpriteBatch;->mCapacity:I */
		 (( java.lang.StringBuilder ) v1 ).append ( v2 ); // invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;
		 final String v2 = ") !"; // const-string v2, ") !"
		 (( java.lang.StringBuilder ) v1 ).append ( v2 ); // invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
		 (( java.lang.StringBuilder ) v1 ).toString ( ); // invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
		 /* invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V */
		 /* throw v0 */
	 } // :cond_0
	 return;
} // .end method
private void assertCapacity ( Integer p0 ) {
	 /* .locals 3 */
	 /* iget v0, p0, Lorg/anddev/andengine/entity/sprite/batch/SpriteBatch;->mCapacity:I */
	 /* if-lt p1, v0, :cond_0 */
	 /* new-instance v0, Ljava/lang/IllegalStateException; */
	 /* new-instance v1, Ljava/lang/StringBuilder; */
	 final String v2 = "This supplied pIndex: \'"; // const-string v2, "This supplied pIndex: \'"
	 /* invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V */
	 (( java.lang.StringBuilder ) v1 ).append ( p1 ); // invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;
	 final String v2 = "\' is exceeding the capacity: \'"; // const-string v2, "\' is exceeding the capacity: \'"
	 (( java.lang.StringBuilder ) v1 ).append ( v2 ); // invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
	 /* iget v2, p0, Lorg/anddev/andengine/entity/sprite/batch/SpriteBatch;->mCapacity:I */
	 (( java.lang.StringBuilder ) v1 ).append ( v2 ); // invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;
	 final String v2 = "\' of this SpriteBatch!"; // const-string v2, "\' of this SpriteBatch!"
	 (( java.lang.StringBuilder ) v1 ).append ( v2 ); // invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
	 (( java.lang.StringBuilder ) v1 ).toString ( ); // invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
	 /* invoke-direct {v0, v1}, Ljava/lang/IllegalStateException;-><init>(Ljava/lang/String;)V */
	 /* throw v0 */
} // :cond_0
return;
} // .end method
private void drawVertices ( javax.microedition.khronos.opengles.GL10 p0, org.anddev.andengine.engine.camera.Camera p1 ) {
/* .locals 3 */
int v0 = 4; // const/4 v0, 0x4
int v1 = 0; // const/4 v1, 0x0
/* iget v2, p0, Lorg/anddev/andengine/entity/sprite/batch/SpriteBatch;->mVertices:I */
return;
} // .end method
private void initBlendFunction ( ) {
/* .locals 2 */
v0 = this.mTexture;
/* iget-boolean v0, v0, Lorg/anddev/andengine/opengl/texture/TextureOptions;->mPreMultipyAlpha:Z */
if ( v0 != null) { // if-eqz v0, :cond_0
	 int v0 = 1; // const/4 v0, 0x1
	 /* const/16 v1, 0x303 */
	 (( org.anddev.andengine.entity.sprite.batch.SpriteBatch ) p0 ).setBlendFunction ( v0, v1 ); // invoke-virtual {p0, v0, v1}, Lorg/anddev/andengine/entity/sprite/batch/SpriteBatch;->setBlendFunction(II)V
} // :cond_0
return;
} // .end method
private void onApplyTextureRegion ( javax.microedition.khronos.opengles.GL10 p0 ) {
/* .locals 3 */
/* sget-boolean v1, Lorg/anddev/andengine/opengl/util/GLHelper;->EXTENSIONS_VERTEXBUFFEROBJECTS:Z */
if ( v1 != null) { // if-eqz v1, :cond_0
	 /* move-object v0, p1 */
	 /* check-cast v0, Ljavax/microedition/khronos/opengles/GL11; */
	 /* move-object v1, v0 */
	 v2 = this.mSpriteBatchTextureRegionBuffer;
	 (( org.anddev.andengine.opengl.texture.region.buffer.SpriteBatchTextureRegionBuffer ) v2 ).selectOnHardware ( v1 ); // invoke-virtual {v2, v1}, Lorg/anddev/andengine/opengl/texture/region/buffer/SpriteBatchTextureRegionBuffer;->selectOnHardware(Ljavax/microedition/khronos/opengles/GL11;)V
	 v2 = this.mTexture;
	 org.anddev.andengine.opengl.util.GLHelper .texCoordZeroPointer ( v1 );
} // :goto_0
return;
} // :cond_0
v1 = this.mTexture;
v1 = this.mSpriteBatchTextureRegionBuffer;
(( org.anddev.andengine.opengl.texture.region.buffer.SpriteBatchTextureRegionBuffer ) v1 ).getFloatBuffer ( ); // invoke-virtual {v1}, Lorg/anddev/andengine/opengl/texture/region/buffer/SpriteBatchTextureRegionBuffer;->getFloatBuffer()Lorg/anddev/andengine/opengl/util/FastFloatBuffer;
org.anddev.andengine.opengl.util.GLHelper .texCoordPointer ( p1,v1 );
} // .end method
/* # virtual methods */
protected void assertTexture ( org.anddev.andengine.opengl.texture.region.BaseTextureRegion p0 ) {
/* .locals 2 */
(( org.anddev.andengine.opengl.texture.region.BaseTextureRegion ) p1 ).getTexture ( ); // invoke-virtual {p1}, Lorg/anddev/andengine/opengl/texture/region/BaseTextureRegion;->getTexture()Lorg/anddev/andengine/opengl/texture/ITexture;
v1 = this.mTexture;
/* if-eq v0, v1, :cond_0 */
/* new-instance v0, Ljava/lang/IllegalArgumentException; */
final String v1 = "The supplied Texture does match the Texture of this SpriteBatch!"; // const-string v1, "The supplied Texture does match the Texture of this SpriteBatch!"
/* invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V */
/* throw v0 */
} // :cond_0
return;
} // .end method
protected void begin ( javax.microedition.khronos.opengles.GL10 p0 ) {
/* .locals 0 */
return;
} // .end method
protected void doDraw ( javax.microedition.khronos.opengles.GL10 p0, org.anddev.andengine.engine.camera.Camera p1 ) {
/* .locals 1 */
(( org.anddev.andengine.entity.sprite.batch.SpriteBatch ) p0 ).onInitDraw ( p1 ); // invoke-virtual {p0, p1}, Lorg/anddev/andengine/entity/sprite/batch/SpriteBatch;->onInitDraw(Ljavax/microedition/khronos/opengles/GL10;)V
(( org.anddev.andengine.entity.sprite.batch.SpriteBatch ) p0 ).begin ( p1 ); // invoke-virtual {p0, p1}, Lorg/anddev/andengine/entity/sprite/batch/SpriteBatch;->begin(Ljavax/microedition/khronos/opengles/GL10;)V
(( org.anddev.andengine.entity.sprite.batch.SpriteBatch ) p0 ).onDrawSpriteBatch ( ); // invoke-virtual {p0}, Lorg/anddev/andengine/entity/sprite/batch/SpriteBatch;->onDrawSpriteBatch()V
/* iget-boolean v0, p0, Lorg/anddev/andengine/entity/sprite/batch/SpriteBatch;->mDirty:Z */
if ( v0 != null) { // if-eqz v0, :cond_0
(( org.anddev.andengine.entity.sprite.batch.SpriteBatch ) p0 ).submit ( ); // invoke-virtual {p0}, Lorg/anddev/andengine/entity/sprite/batch/SpriteBatch;->submit()V
} // :cond_0
(( org.anddev.andengine.entity.sprite.batch.SpriteBatch ) p0 ).onApplyVertices ( p1 ); // invoke-virtual {p0, p1}, Lorg/anddev/andengine/entity/sprite/batch/SpriteBatch;->onApplyVertices(Ljavax/microedition/khronos/opengles/GL10;)V
/* invoke-direct {p0, p1}, Lorg/anddev/andengine/entity/sprite/batch/SpriteBatch;->onApplyTextureRegion(Ljavax/microedition/khronos/opengles/GL10;)V */
/* invoke-direct {p0, p1, p2}, Lorg/anddev/andengine/entity/sprite/batch/SpriteBatch;->drawVertices(Ljavax/microedition/khronos/opengles/GL10;Lorg/anddev/andengine/engine/camera/Camera;)V */
(( org.anddev.andengine.entity.sprite.batch.SpriteBatch ) p0 ).end ( p1 ); // invoke-virtual {p0, p1}, Lorg/anddev/andengine/entity/sprite/batch/SpriteBatch;->end(Ljavax/microedition/khronos/opengles/GL10;)V
return;
} // .end method
public void draw ( org.anddev.andengine.entity.sprite.BaseSprite p0 ) {
/* .locals 6 */
v0 = (( org.anddev.andengine.entity.sprite.BaseSprite ) p1 ).isVisible ( ); // invoke-virtual {p1}, Lorg/anddev/andengine/entity/sprite/BaseSprite;->isVisible()Z
if ( v0 != null) { // if-eqz v0, :cond_0
/* invoke-direct {p0}, Lorg/anddev/andengine/entity/sprite/batch/SpriteBatch;->assertCapacity()V */
(( org.anddev.andengine.entity.sprite.BaseSprite ) p1 ).getTextureRegion ( ); // invoke-virtual {p1}, Lorg/anddev/andengine/entity/sprite/BaseSprite;->getTextureRegion()Lorg/anddev/andengine/opengl/texture/region/BaseTextureRegion;
(( org.anddev.andengine.entity.sprite.batch.SpriteBatch ) p0 ).assertTexture ( v0 ); // invoke-virtual {p0, v0}, Lorg/anddev/andengine/entity/sprite/batch/SpriteBatch;->assertTexture(Lorg/anddev/andengine/opengl/texture/region/BaseTextureRegion;)V
v1 = (( org.anddev.andengine.entity.sprite.BaseSprite ) p1 ).getRotation ( ); // invoke-virtual {p1}, Lorg/anddev/andengine/entity/sprite/BaseSprite;->getRotation()F
int v2 = 0; // const/4 v2, 0x0
/* cmpl-float v1, v1, v2 */
/* if-nez v1, :cond_1 */
v1 = (( org.anddev.andengine.entity.sprite.BaseSprite ) p1 ).isScaled ( ); // invoke-virtual {p1}, Lorg/anddev/andengine/entity/sprite/BaseSprite;->isScaled()Z
/* if-nez v1, :cond_1 */
v1 = this.mSpriteBatchVertexBuffer;
v2 = (( org.anddev.andengine.entity.sprite.BaseSprite ) p1 ).getX ( ); // invoke-virtual {p1}, Lorg/anddev/andengine/entity/sprite/BaseSprite;->getX()F
v3 = (( org.anddev.andengine.entity.sprite.BaseSprite ) p1 ).getY ( ); // invoke-virtual {p1}, Lorg/anddev/andengine/entity/sprite/BaseSprite;->getY()F
v4 = (( org.anddev.andengine.entity.sprite.BaseSprite ) p1 ).getWidth ( ); // invoke-virtual {p1}, Lorg/anddev/andengine/entity/sprite/BaseSprite;->getWidth()F
v5 = (( org.anddev.andengine.entity.sprite.BaseSprite ) p1 ).getHeight ( ); // invoke-virtual {p1}, Lorg/anddev/andengine/entity/sprite/BaseSprite;->getHeight()F
(( org.anddev.andengine.opengl.vertex.SpriteBatchVertexBuffer ) v1 ).add ( v2, v3, v4, v5 ); // invoke-virtual {v1, v2, v3, v4, v5}, Lorg/anddev/andengine/opengl/vertex/SpriteBatchVertexBuffer;->add(FFFF)V
} // :goto_0
v1 = this.mSpriteBatchTextureRegionBuffer;
(( org.anddev.andengine.opengl.texture.region.buffer.SpriteBatchTextureRegionBuffer ) v1 ).add ( v0 ); // invoke-virtual {v1, v0}, Lorg/anddev/andengine/opengl/texture/region/buffer/SpriteBatchTextureRegionBuffer;->add(Lorg/anddev/andengine/opengl/texture/region/BaseTextureRegion;)V
/* iget v0, p0, Lorg/anddev/andengine/entity/sprite/batch/SpriteBatch;->mIndex:I */
/* add-int/lit8 v0, v0, 0x1 */
/* iput v0, p0, Lorg/anddev/andengine/entity/sprite/batch/SpriteBatch;->mIndex:I */
int v0 = 1; // const/4 v0, 0x1
/* iput-boolean v0, p0, Lorg/anddev/andengine/entity/sprite/batch/SpriteBatch;->mDirty:Z */
} // :cond_0
return;
} // :cond_1
v1 = this.mSpriteBatchVertexBuffer;
v2 = (( org.anddev.andengine.entity.sprite.BaseSprite ) p1 ).getWidth ( ); // invoke-virtual {p1}, Lorg/anddev/andengine/entity/sprite/BaseSprite;->getWidth()F
v3 = (( org.anddev.andengine.entity.sprite.BaseSprite ) p1 ).getHeight ( ); // invoke-virtual {p1}, Lorg/anddev/andengine/entity/sprite/BaseSprite;->getHeight()F
(( org.anddev.andengine.entity.sprite.BaseSprite ) p1 ).getLocalToParentTransformation ( ); // invoke-virtual {p1}, Lorg/anddev/andengine/entity/sprite/BaseSprite;->getLocalToParentTransformation()Lorg/anddev/andengine/util/Transformation;
(( org.anddev.andengine.opengl.vertex.SpriteBatchVertexBuffer ) v1 ).add ( v2, v3, v4 ); // invoke-virtual {v1, v2, v3, v4}, Lorg/anddev/andengine/opengl/vertex/SpriteBatchVertexBuffer;->add(FFLorg/anddev/andengine/util/Transformation;)V
} // .end method
public void draw ( org.anddev.andengine.opengl.texture.region.BaseTextureRegion p0, Float p1, Float p2, Float p3, Float p4 ) {
/* .locals 1 */
/* invoke-direct {p0}, Lorg/anddev/andengine/entity/sprite/batch/SpriteBatch;->assertCapacity()V */
(( org.anddev.andengine.entity.sprite.batch.SpriteBatch ) p0 ).assertTexture ( p1 ); // invoke-virtual {p0, p1}, Lorg/anddev/andengine/entity/sprite/batch/SpriteBatch;->assertTexture(Lorg/anddev/andengine/opengl/texture/region/BaseTextureRegion;)V
v0 = this.mSpriteBatchVertexBuffer;
(( org.anddev.andengine.opengl.vertex.SpriteBatchVertexBuffer ) v0 ).add ( p2, p3, p4, p5 ); // invoke-virtual {v0, p2, p3, p4, p5}, Lorg/anddev/andengine/opengl/vertex/SpriteBatchVertexBuffer;->add(FFFF)V
v0 = this.mSpriteBatchTextureRegionBuffer;
(( org.anddev.andengine.opengl.texture.region.buffer.SpriteBatchTextureRegionBuffer ) v0 ).add ( p1 ); // invoke-virtual {v0, p1}, Lorg/anddev/andengine/opengl/texture/region/buffer/SpriteBatchTextureRegionBuffer;->add(Lorg/anddev/andengine/opengl/texture/region/BaseTextureRegion;)V
/* iget v0, p0, Lorg/anddev/andengine/entity/sprite/batch/SpriteBatch;->mIndex:I */
/* add-int/lit8 v0, v0, 0x1 */
/* iput v0, p0, Lorg/anddev/andengine/entity/sprite/batch/SpriteBatch;->mIndex:I */
int v0 = 1; // const/4 v0, 0x1
/* iput-boolean v0, p0, Lorg/anddev/andengine/entity/sprite/batch/SpriteBatch;->mDirty:Z */
return;
} // .end method
public void draw ( org.anddev.andengine.opengl.texture.region.BaseTextureRegion p0, Float p1, Float p2, Float p3, Float p4, Float p5 ) {
/* .locals 6 */
/* invoke-direct {p0}, Lorg/anddev/andengine/entity/sprite/batch/SpriteBatch;->assertCapacity()V */
(( org.anddev.andengine.entity.sprite.batch.SpriteBatch ) p0 ).assertTexture ( p1 ); // invoke-virtual {p0, p1}, Lorg/anddev/andengine/entity/sprite/batch/SpriteBatch;->assertTexture(Lorg/anddev/andengine/opengl/texture/region/BaseTextureRegion;)V
v0 = this.mSpriteBatchVertexBuffer;
/* move v1, p2 */
/* move v2, p3 */
/* move v3, p4 */
/* move v4, p5 */
/* move v5, p6 */
/* invoke-virtual/range {v0 ..v5}, Lorg/anddev/andengine/opengl/vertex/SpriteBatchVertexBuffer;->add(FFFFF)V */
v0 = this.mSpriteBatchTextureRegionBuffer;
(( org.anddev.andengine.opengl.texture.region.buffer.SpriteBatchTextureRegionBuffer ) v0 ).add ( p1 ); // invoke-virtual {v0, p1}, Lorg/anddev/andengine/opengl/texture/region/buffer/SpriteBatchTextureRegionBuffer;->add(Lorg/anddev/andengine/opengl/texture/region/BaseTextureRegion;)V
/* iget v0, p0, Lorg/anddev/andengine/entity/sprite/batch/SpriteBatch;->mIndex:I */
/* add-int/lit8 v0, v0, 0x1 */
/* iput v0, p0, Lorg/anddev/andengine/entity/sprite/batch/SpriteBatch;->mIndex:I */
int v0 = 1; // const/4 v0, 0x1
/* iput-boolean v0, p0, Lorg/anddev/andengine/entity/sprite/batch/SpriteBatch;->mDirty:Z */
return;
} // .end method
public void draw ( org.anddev.andengine.opengl.texture.region.BaseTextureRegion p0, Float p1, Float p2, Float p3, Float p4, Float p5, Float p6 ) {
/* .locals 7 */
/* invoke-direct {p0}, Lorg/anddev/andengine/entity/sprite/batch/SpriteBatch;->assertCapacity()V */
(( org.anddev.andengine.entity.sprite.batch.SpriteBatch ) p0 ).assertTexture ( p1 ); // invoke-virtual {p0, p1}, Lorg/anddev/andengine/entity/sprite/batch/SpriteBatch;->assertTexture(Lorg/anddev/andengine/opengl/texture/region/BaseTextureRegion;)V
v0 = this.mSpriteBatchVertexBuffer;
/* move v1, p2 */
/* move v2, p3 */
/* move v3, p4 */
/* move v4, p5 */
/* move v5, p6 */
/* move v6, p7 */
/* invoke-virtual/range {v0 ..v6}, Lorg/anddev/andengine/opengl/vertex/SpriteBatchVertexBuffer;->add(FFFFFF)V */
v0 = this.mSpriteBatchTextureRegionBuffer;
(( org.anddev.andengine.opengl.texture.region.buffer.SpriteBatchTextureRegionBuffer ) v0 ).add ( p1 ); // invoke-virtual {v0, p1}, Lorg/anddev/andengine/opengl/texture/region/buffer/SpriteBatchTextureRegionBuffer;->add(Lorg/anddev/andengine/opengl/texture/region/BaseTextureRegion;)V
/* iget v0, p0, Lorg/anddev/andengine/entity/sprite/batch/SpriteBatch;->mIndex:I */
/* add-int/lit8 v0, v0, 0x1 */
/* iput v0, p0, Lorg/anddev/andengine/entity/sprite/batch/SpriteBatch;->mIndex:I */
int v0 = 1; // const/4 v0, 0x1
/* iput-boolean v0, p0, Lorg/anddev/andengine/entity/sprite/batch/SpriteBatch;->mDirty:Z */
return;
} // .end method
public void draw ( org.anddev.andengine.opengl.texture.region.BaseTextureRegion p0, Float p1, Float p2, Float p3, Float p4, Float p5, Float p6, Float p7 ) {
/* .locals 8 */
/* invoke-direct {p0}, Lorg/anddev/andengine/entity/sprite/batch/SpriteBatch;->assertCapacity()V */
(( org.anddev.andengine.entity.sprite.batch.SpriteBatch ) p0 ).assertTexture ( p1 ); // invoke-virtual {p0, p1}, Lorg/anddev/andengine/entity/sprite/batch/SpriteBatch;->assertTexture(Lorg/anddev/andengine/opengl/texture/region/BaseTextureRegion;)V
v0 = this.mSpriteBatchVertexBuffer;
/* move v1, p2 */
/* move v2, p3 */
/* move v3, p4 */
/* move v4, p5 */
/* move v5, p6 */
/* move v6, p7 */
/* move/from16 v7, p8 */
/* invoke-virtual/range {v0 ..v7}, Lorg/anddev/andengine/opengl/vertex/SpriteBatchVertexBuffer;->add(FFFFFFF)V */
v0 = this.mSpriteBatchTextureRegionBuffer;
(( org.anddev.andengine.opengl.texture.region.buffer.SpriteBatchTextureRegionBuffer ) v0 ).add ( p1 ); // invoke-virtual {v0, p1}, Lorg/anddev/andengine/opengl/texture/region/buffer/SpriteBatchTextureRegionBuffer;->add(Lorg/anddev/andengine/opengl/texture/region/BaseTextureRegion;)V
/* iget v0, p0, Lorg/anddev/andengine/entity/sprite/batch/SpriteBatch;->mIndex:I */
/* add-int/lit8 v0, v0, 0x1 */
/* iput v0, p0, Lorg/anddev/andengine/entity/sprite/batch/SpriteBatch;->mIndex:I */
int v0 = 1; // const/4 v0, 0x1
/* iput-boolean v0, p0, Lorg/anddev/andengine/entity/sprite/batch/SpriteBatch;->mDirty:Z */
return;
} // .end method
public void draw ( org.anddev.andengine.opengl.texture.region.BaseTextureRegion p0, Float p1, Float p2, Float p3, Float p4, Float p5, Float p6, Float p7, Float p8 ) {
/* .locals 9 */
/* invoke-direct {p0}, Lorg/anddev/andengine/entity/sprite/batch/SpriteBatch;->assertCapacity()V */
(( org.anddev.andengine.entity.sprite.batch.SpriteBatch ) p0 ).assertTexture ( p1 ); // invoke-virtual {p0, p1}, Lorg/anddev/andengine/entity/sprite/batch/SpriteBatch;->assertTexture(Lorg/anddev/andengine/opengl/texture/region/BaseTextureRegion;)V
v0 = this.mSpriteBatchVertexBuffer;
/* move v1, p2 */
/* move v2, p3 */
/* move v3, p4 */
/* move v4, p5 */
/* move v5, p6 */
/* move/from16 v6, p7 */
/* move/from16 v7, p8 */
/* move/from16 v8, p9 */
/* invoke-virtual/range {v0 ..v8}, Lorg/anddev/andengine/opengl/vertex/SpriteBatchVertexBuffer;->addInner(FFFFFFFF)V */
v0 = this.mSpriteBatchTextureRegionBuffer;
(( org.anddev.andengine.opengl.texture.region.buffer.SpriteBatchTextureRegionBuffer ) v0 ).add ( p1 ); // invoke-virtual {v0, p1}, Lorg/anddev/andengine/opengl/texture/region/buffer/SpriteBatchTextureRegionBuffer;->add(Lorg/anddev/andengine/opengl/texture/region/BaseTextureRegion;)V
/* iget v0, p0, Lorg/anddev/andengine/entity/sprite/batch/SpriteBatch;->mIndex:I */
/* add-int/lit8 v0, v0, 0x1 */
/* iput v0, p0, Lorg/anddev/andengine/entity/sprite/batch/SpriteBatch;->mIndex:I */
int v0 = 1; // const/4 v0, 0x1
/* iput-boolean v0, p0, Lorg/anddev/andengine/entity/sprite/batch/SpriteBatch;->mDirty:Z */
return;
} // .end method
protected void drawWithoutChecks ( org.anddev.andengine.entity.sprite.BaseSprite p0 ) {
/* .locals 6 */
v0 = (( org.anddev.andengine.entity.sprite.BaseSprite ) p1 ).isVisible ( ); // invoke-virtual {p1}, Lorg/anddev/andengine/entity/sprite/BaseSprite;->isVisible()Z
if ( v0 != null) { // if-eqz v0, :cond_0
(( org.anddev.andengine.entity.sprite.BaseSprite ) p1 ).getTextureRegion ( ); // invoke-virtual {p1}, Lorg/anddev/andengine/entity/sprite/BaseSprite;->getTextureRegion()Lorg/anddev/andengine/opengl/texture/region/BaseTextureRegion;
v1 = (( org.anddev.andengine.entity.sprite.BaseSprite ) p1 ).getRotation ( ); // invoke-virtual {p1}, Lorg/anddev/andengine/entity/sprite/BaseSprite;->getRotation()F
int v2 = 0; // const/4 v2, 0x0
/* cmpl-float v1, v1, v2 */
/* if-nez v1, :cond_1 */
v1 = (( org.anddev.andengine.entity.sprite.BaseSprite ) p1 ).isScaled ( ); // invoke-virtual {p1}, Lorg/anddev/andengine/entity/sprite/BaseSprite;->isScaled()Z
/* if-nez v1, :cond_1 */
v1 = this.mSpriteBatchVertexBuffer;
v2 = (( org.anddev.andengine.entity.sprite.BaseSprite ) p1 ).getX ( ); // invoke-virtual {p1}, Lorg/anddev/andengine/entity/sprite/BaseSprite;->getX()F
v3 = (( org.anddev.andengine.entity.sprite.BaseSprite ) p1 ).getY ( ); // invoke-virtual {p1}, Lorg/anddev/andengine/entity/sprite/BaseSprite;->getY()F
v4 = (( org.anddev.andengine.entity.sprite.BaseSprite ) p1 ).getWidth ( ); // invoke-virtual {p1}, Lorg/anddev/andengine/entity/sprite/BaseSprite;->getWidth()F
v5 = (( org.anddev.andengine.entity.sprite.BaseSprite ) p1 ).getHeight ( ); // invoke-virtual {p1}, Lorg/anddev/andengine/entity/sprite/BaseSprite;->getHeight()F
(( org.anddev.andengine.opengl.vertex.SpriteBatchVertexBuffer ) v1 ).add ( v2, v3, v4, v5 ); // invoke-virtual {v1, v2, v3, v4, v5}, Lorg/anddev/andengine/opengl/vertex/SpriteBatchVertexBuffer;->add(FFFF)V
} // :goto_0
v1 = this.mSpriteBatchTextureRegionBuffer;
(( org.anddev.andengine.opengl.texture.region.buffer.SpriteBatchTextureRegionBuffer ) v1 ).add ( v0 ); // invoke-virtual {v1, v0}, Lorg/anddev/andengine/opengl/texture/region/buffer/SpriteBatchTextureRegionBuffer;->add(Lorg/anddev/andengine/opengl/texture/region/BaseTextureRegion;)V
/* iget v0, p0, Lorg/anddev/andengine/entity/sprite/batch/SpriteBatch;->mIndex:I */
/* add-int/lit8 v0, v0, 0x1 */
/* iput v0, p0, Lorg/anddev/andengine/entity/sprite/batch/SpriteBatch;->mIndex:I */
int v0 = 1; // const/4 v0, 0x1
/* iput-boolean v0, p0, Lorg/anddev/andengine/entity/sprite/batch/SpriteBatch;->mDirty:Z */
} // :cond_0
return;
} // :cond_1
v1 = this.mSpriteBatchVertexBuffer;
v2 = (( org.anddev.andengine.entity.sprite.BaseSprite ) p1 ).getWidth ( ); // invoke-virtual {p1}, Lorg/anddev/andengine/entity/sprite/BaseSprite;->getWidth()F
v3 = (( org.anddev.andengine.entity.sprite.BaseSprite ) p1 ).getHeight ( ); // invoke-virtual {p1}, Lorg/anddev/andengine/entity/sprite/BaseSprite;->getHeight()F
(( org.anddev.andengine.entity.sprite.BaseSprite ) p1 ).getLocalToParentTransformation ( ); // invoke-virtual {p1}, Lorg/anddev/andengine/entity/sprite/BaseSprite;->getLocalToParentTransformation()Lorg/anddev/andengine/util/Transformation;
(( org.anddev.andengine.opengl.vertex.SpriteBatchVertexBuffer ) v1 ).add ( v2, v3, v4 ); // invoke-virtual {v1, v2, v3, v4}, Lorg/anddev/andengine/opengl/vertex/SpriteBatchVertexBuffer;->add(FFLorg/anddev/andengine/util/Transformation;)V
} // .end method
protected void drawWithoutChecks ( org.anddev.andengine.opengl.texture.region.BaseTextureRegion p0, Float p1, Float p2, Float p3, Float p4 ) {
/* .locals 1 */
v0 = this.mSpriteBatchVertexBuffer;
(( org.anddev.andengine.opengl.vertex.SpriteBatchVertexBuffer ) v0 ).add ( p2, p3, p4, p5 ); // invoke-virtual {v0, p2, p3, p4, p5}, Lorg/anddev/andengine/opengl/vertex/SpriteBatchVertexBuffer;->add(FFFF)V
v0 = this.mSpriteBatchTextureRegionBuffer;
(( org.anddev.andengine.opengl.texture.region.buffer.SpriteBatchTextureRegionBuffer ) v0 ).add ( p1 ); // invoke-virtual {v0, p1}, Lorg/anddev/andengine/opengl/texture/region/buffer/SpriteBatchTextureRegionBuffer;->add(Lorg/anddev/andengine/opengl/texture/region/BaseTextureRegion;)V
/* iget v0, p0, Lorg/anddev/andengine/entity/sprite/batch/SpriteBatch;->mIndex:I */
/* add-int/lit8 v0, v0, 0x1 */
/* iput v0, p0, Lorg/anddev/andengine/entity/sprite/batch/SpriteBatch;->mIndex:I */
int v0 = 1; // const/4 v0, 0x1
/* iput-boolean v0, p0, Lorg/anddev/andengine/entity/sprite/batch/SpriteBatch;->mDirty:Z */
return;
} // .end method
protected void drawWithoutChecks ( org.anddev.andengine.opengl.texture.region.BaseTextureRegion p0, Float p1, Float p2, Float p3, Float p4, Float p5 ) {
/* .locals 6 */
v0 = this.mSpriteBatchVertexBuffer;
/* move v1, p2 */
/* move v2, p3 */
/* move v3, p4 */
/* move v4, p5 */
/* move v5, p6 */
/* invoke-virtual/range {v0 ..v5}, Lorg/anddev/andengine/opengl/vertex/SpriteBatchVertexBuffer;->add(FFFFF)V */
v0 = this.mSpriteBatchTextureRegionBuffer;
(( org.anddev.andengine.opengl.texture.region.buffer.SpriteBatchTextureRegionBuffer ) v0 ).add ( p1 ); // invoke-virtual {v0, p1}, Lorg/anddev/andengine/opengl/texture/region/buffer/SpriteBatchTextureRegionBuffer;->add(Lorg/anddev/andengine/opengl/texture/region/BaseTextureRegion;)V
/* iget v0, p0, Lorg/anddev/andengine/entity/sprite/batch/SpriteBatch;->mIndex:I */
/* add-int/lit8 v0, v0, 0x1 */
/* iput v0, p0, Lorg/anddev/andengine/entity/sprite/batch/SpriteBatch;->mIndex:I */
int v0 = 1; // const/4 v0, 0x1
/* iput-boolean v0, p0, Lorg/anddev/andengine/entity/sprite/batch/SpriteBatch;->mDirty:Z */
return;
} // .end method
protected void drawWithoutChecks ( org.anddev.andengine.opengl.texture.region.BaseTextureRegion p0, Float p1, Float p2, Float p3, Float p4, Float p5, Float p6 ) {
/* .locals 7 */
v0 = this.mSpriteBatchVertexBuffer;
/* move v1, p2 */
/* move v2, p3 */
/* move v3, p4 */
/* move v4, p5 */
/* move v5, p6 */
/* move v6, p7 */
/* invoke-virtual/range {v0 ..v6}, Lorg/anddev/andengine/opengl/vertex/SpriteBatchVertexBuffer;->add(FFFFFF)V */
v0 = this.mSpriteBatchTextureRegionBuffer;
(( org.anddev.andengine.opengl.texture.region.buffer.SpriteBatchTextureRegionBuffer ) v0 ).add ( p1 ); // invoke-virtual {v0, p1}, Lorg/anddev/andengine/opengl/texture/region/buffer/SpriteBatchTextureRegionBuffer;->add(Lorg/anddev/andengine/opengl/texture/region/BaseTextureRegion;)V
/* iget v0, p0, Lorg/anddev/andengine/entity/sprite/batch/SpriteBatch;->mIndex:I */
/* add-int/lit8 v0, v0, 0x1 */
/* iput v0, p0, Lorg/anddev/andengine/entity/sprite/batch/SpriteBatch;->mIndex:I */
int v0 = 1; // const/4 v0, 0x1
/* iput-boolean v0, p0, Lorg/anddev/andengine/entity/sprite/batch/SpriteBatch;->mDirty:Z */
return;
} // .end method
protected void drawWithoutChecks ( org.anddev.andengine.opengl.texture.region.BaseTextureRegion p0, Float p1, Float p2, Float p3, Float p4, Float p5, Float p6, Float p7 ) {
/* .locals 8 */
v0 = this.mSpriteBatchVertexBuffer;
/* move v1, p2 */
/* move v2, p3 */
/* move v3, p4 */
/* move v4, p5 */
/* move v5, p6 */
/* move v6, p7 */
/* move/from16 v7, p8 */
/* invoke-virtual/range {v0 ..v7}, Lorg/anddev/andengine/opengl/vertex/SpriteBatchVertexBuffer;->add(FFFFFFF)V */
v0 = this.mSpriteBatchTextureRegionBuffer;
(( org.anddev.andengine.opengl.texture.region.buffer.SpriteBatchTextureRegionBuffer ) v0 ).add ( p1 ); // invoke-virtual {v0, p1}, Lorg/anddev/andengine/opengl/texture/region/buffer/SpriteBatchTextureRegionBuffer;->add(Lorg/anddev/andengine/opengl/texture/region/BaseTextureRegion;)V
/* iget v0, p0, Lorg/anddev/andengine/entity/sprite/batch/SpriteBatch;->mIndex:I */
/* add-int/lit8 v0, v0, 0x1 */
/* iput v0, p0, Lorg/anddev/andengine/entity/sprite/batch/SpriteBatch;->mIndex:I */
int v0 = 1; // const/4 v0, 0x1
/* iput-boolean v0, p0, Lorg/anddev/andengine/entity/sprite/batch/SpriteBatch;->mDirty:Z */
return;
} // .end method
protected void drawWithoutChecks ( org.anddev.andengine.opengl.texture.region.BaseTextureRegion p0, Float p1, Float p2, Float p3, Float p4, Float p5, Float p6, Float p7, Float p8 ) {
/* .locals 9 */
v0 = this.mSpriteBatchVertexBuffer;
/* move v1, p2 */
/* move v2, p3 */
/* move v3, p4 */
/* move v4, p5 */
/* move v5, p6 */
/* move/from16 v6, p7 */
/* move/from16 v7, p8 */
/* move/from16 v8, p9 */
/* invoke-virtual/range {v0 ..v8}, Lorg/anddev/andengine/opengl/vertex/SpriteBatchVertexBuffer;->addInner(FFFFFFFF)V */
v0 = this.mSpriteBatchTextureRegionBuffer;
(( org.anddev.andengine.opengl.texture.region.buffer.SpriteBatchTextureRegionBuffer ) v0 ).add ( p1 ); // invoke-virtual {v0, p1}, Lorg/anddev/andengine/opengl/texture/region/buffer/SpriteBatchTextureRegionBuffer;->add(Lorg/anddev/andengine/opengl/texture/region/BaseTextureRegion;)V
/* iget v0, p0, Lorg/anddev/andengine/entity/sprite/batch/SpriteBatch;->mIndex:I */
/* add-int/lit8 v0, v0, 0x1 */
/* iput v0, p0, Lorg/anddev/andengine/entity/sprite/batch/SpriteBatch;->mIndex:I */
int v0 = 1; // const/4 v0, 0x1
/* iput-boolean v0, p0, Lorg/anddev/andengine/entity/sprite/batch/SpriteBatch;->mDirty:Z */
return;
} // .end method
protected void end ( javax.microedition.khronos.opengles.GL10 p0 ) {
/* .locals 0 */
return;
} // .end method
protected void finalize ( ) {
/* .locals 1 */
/* invoke-super {p0}, Ljava/lang/Object;->finalize()V */
v0 = this.mSpriteBatchVertexBuffer;
v0 = (( org.anddev.andengine.opengl.vertex.SpriteBatchVertexBuffer ) v0 ).isManaged ( ); // invoke-virtual {v0}, Lorg/anddev/andengine/opengl/vertex/SpriteBatchVertexBuffer;->isManaged()Z
if ( v0 != null) { // if-eqz v0, :cond_0
v0 = this.mSpriteBatchVertexBuffer;
(( org.anddev.andengine.opengl.vertex.SpriteBatchVertexBuffer ) v0 ).unloadFromActiveBufferObjectManager ( ); // invoke-virtual {v0}, Lorg/anddev/andengine/opengl/vertex/SpriteBatchVertexBuffer;->unloadFromActiveBufferObjectManager()V
} // :cond_0
v0 = this.mSpriteBatchTextureRegionBuffer;
v0 = (( org.anddev.andengine.opengl.texture.region.buffer.SpriteBatchTextureRegionBuffer ) v0 ).isManaged ( ); // invoke-virtual {v0}, Lorg/anddev/andengine/opengl/texture/region/buffer/SpriteBatchTextureRegionBuffer;->isManaged()Z
if ( v0 != null) { // if-eqz v0, :cond_1
v0 = this.mSpriteBatchTextureRegionBuffer;
(( org.anddev.andengine.opengl.texture.region.buffer.SpriteBatchTextureRegionBuffer ) v0 ).unloadFromActiveBufferObjectManager ( ); // invoke-virtual {v0}, Lorg/anddev/andengine/opengl/texture/region/buffer/SpriteBatchTextureRegionBuffer;->unloadFromActiveBufferObjectManager()V
} // :cond_1
return;
} // .end method
public Integer getIndex ( ) {
/* .locals 1 */
/* iget v0, p0, Lorg/anddev/andengine/entity/sprite/batch/SpriteBatch;->mIndex:I */
} // .end method
protected void onApplyVertices ( javax.microedition.khronos.opengles.GL10 p0 ) {
/* .locals 1 */
/* sget-boolean v0, Lorg/anddev/andengine/opengl/util/GLHelper;->EXTENSIONS_VERTEXBUFFEROBJECTS:Z */
if ( v0 != null) { // if-eqz v0, :cond_0
/* check-cast p1, Ljavax/microedition/khronos/opengles/GL11; */
v0 = this.mSpriteBatchVertexBuffer;
(( org.anddev.andengine.opengl.vertex.SpriteBatchVertexBuffer ) v0 ).selectOnHardware ( p1 ); // invoke-virtual {v0, p1}, Lorg/anddev/andengine/opengl/vertex/SpriteBatchVertexBuffer;->selectOnHardware(Ljavax/microedition/khronos/opengles/GL11;)V
org.anddev.andengine.opengl.util.GLHelper .vertexZeroPointer ( p1 );
} // :goto_0
return;
} // :cond_0
v0 = this.mSpriteBatchVertexBuffer;
(( org.anddev.andengine.opengl.vertex.SpriteBatchVertexBuffer ) v0 ).getFloatBuffer ( ); // invoke-virtual {v0}, Lorg/anddev/andengine/opengl/vertex/SpriteBatchVertexBuffer;->getFloatBuffer()Lorg/anddev/andengine/opengl/util/FastFloatBuffer;
org.anddev.andengine.opengl.util.GLHelper .vertexPointer ( p1,v0 );
} // .end method
protected void onDrawSpriteBatch ( ) {
/* .locals 0 */
return;
} // .end method
protected void onInitDraw ( javax.microedition.khronos.opengles.GL10 p0 ) {
/* .locals 4 */
/* iget v0, p0, Lorg/anddev/andengine/entity/sprite/batch/SpriteBatch;->mRed:F */
/* iget v1, p0, Lorg/anddev/andengine/entity/sprite/batch/SpriteBatch;->mGreen:F */
/* iget v2, p0, Lorg/anddev/andengine/entity/sprite/batch/SpriteBatch;->mBlue:F */
/* iget v3, p0, Lorg/anddev/andengine/entity/sprite/batch/SpriteBatch;->mAlpha:F */
org.anddev.andengine.opengl.util.GLHelper .setColor ( p1,v0,v1,v2,v3 );
org.anddev.andengine.opengl.util.GLHelper .enableVertexArray ( p1 );
/* iget v0, p0, Lorg/anddev/andengine/entity/sprite/batch/SpriteBatch;->mSourceBlendFunction:I */
/* iget v1, p0, Lorg/anddev/andengine/entity/sprite/batch/SpriteBatch;->mDestinationBlendFunction:I */
org.anddev.andengine.opengl.util.GLHelper .blendFunction ( p1,v0,v1 );
org.anddev.andengine.opengl.util.GLHelper .enableTextures ( p1 );
org.anddev.andengine.opengl.util.GLHelper .enableTexCoordArray ( p1 );
return;
} // .end method
public void reset ( ) {
/* .locals 0 */
/* invoke-super {p0}, Lorg/anddev/andengine/entity/Entity;->reset()V */
/* invoke-direct {p0}, Lorg/anddev/andengine/entity/sprite/batch/SpriteBatch;->initBlendFunction()V */
return;
} // .end method
public void setBlendFunction ( Integer p0, Integer p1 ) {
/* .locals 0 */
/* iput p1, p0, Lorg/anddev/andengine/entity/sprite/batch/SpriteBatch;->mSourceBlendFunction:I */
/* iput p2, p0, Lorg/anddev/andengine/entity/sprite/batch/SpriteBatch;->mDestinationBlendFunction:I */
return;
} // .end method
public void setIndex ( Integer p0 ) {
/* .locals 2 */
/* invoke-direct {p0, p1}, Lorg/anddev/andengine/entity/sprite/batch/SpriteBatch;->assertCapacity(I)V */
/* iput p1, p0, Lorg/anddev/andengine/entity/sprite/batch/SpriteBatch;->mIndex:I */
/* mul-int/lit8 v0, p1, 0x6 */
v1 = this.mSpriteBatchVertexBuffer;
(( org.anddev.andengine.opengl.vertex.SpriteBatchVertexBuffer ) v1 ).setIndex ( v0 ); // invoke-virtual {v1, v0}, Lorg/anddev/andengine/opengl/vertex/SpriteBatchVertexBuffer;->setIndex(I)V
v1 = this.mSpriteBatchTextureRegionBuffer;
(( org.anddev.andengine.opengl.texture.region.buffer.SpriteBatchTextureRegionBuffer ) v1 ).setIndex ( v0 ); // invoke-virtual {v1, v0}, Lorg/anddev/andengine/opengl/texture/region/buffer/SpriteBatchTextureRegionBuffer;->setIndex(I)V
return;
} // .end method
public void submit ( ) {
/* .locals 2 */
int v1 = 0; // const/4 v1, 0x0
/* iget v0, p0, Lorg/anddev/andengine/entity/sprite/batch/SpriteBatch;->mIndex:I */
/* mul-int/lit8 v0, v0, 0x6 */
/* iput v0, p0, Lorg/anddev/andengine/entity/sprite/batch/SpriteBatch;->mVertices:I */
v0 = this.mSpriteBatchVertexBuffer;
(( org.anddev.andengine.opengl.vertex.SpriteBatchVertexBuffer ) v0 ).submit ( ); // invoke-virtual {v0}, Lorg/anddev/andengine/opengl/vertex/SpriteBatchVertexBuffer;->submit()V
v0 = this.mSpriteBatchTextureRegionBuffer;
(( org.anddev.andengine.opengl.texture.region.buffer.SpriteBatchTextureRegionBuffer ) v0 ).submit ( ); // invoke-virtual {v0}, Lorg/anddev/andengine/opengl/texture/region/buffer/SpriteBatchTextureRegionBuffer;->submit()V
/* iput v1, p0, Lorg/anddev/andengine/entity/sprite/batch/SpriteBatch;->mIndex:I */
v0 = this.mSpriteBatchVertexBuffer;
(( org.anddev.andengine.opengl.vertex.SpriteBatchVertexBuffer ) v0 ).setIndex ( v1 ); // invoke-virtual {v0, v1}, Lorg/anddev/andengine/opengl/vertex/SpriteBatchVertexBuffer;->setIndex(I)V
v0 = this.mSpriteBatchTextureRegionBuffer;
(( org.anddev.andengine.opengl.texture.region.buffer.SpriteBatchTextureRegionBuffer ) v0 ).setIndex ( v1 ); // invoke-virtual {v0, v1}, Lorg/anddev/andengine/opengl/texture/region/buffer/SpriteBatchTextureRegionBuffer;->setIndex(I)V
/* iput-boolean v1, p0, Lorg/anddev/andengine/entity/sprite/batch/SpriteBatch;->mDirty:Z */
return;
} // .end method
