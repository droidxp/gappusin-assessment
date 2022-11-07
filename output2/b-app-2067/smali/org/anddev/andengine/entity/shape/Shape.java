public abstract class org.anddev.andengine.entity.shape.Shape extends org.anddev.andengine.entity.Entity implements org.anddev.andengine.entity.shape.IShape {
	 /* # interfaces */
	 /* # static fields */
	 public static final Integer BLENDFUNCTION_DESTINATION_DEFAULT;
	 public static final Integer BLENDFUNCTION_DESTINATION_PREMULTIPLYALPHA_DEFAULT;
	 public static final Integer BLENDFUNCTION_SOURCE_DEFAULT;
	 public static final Integer BLENDFUNCTION_SOURCE_PREMULTIPLYALPHA_DEFAULT;
	 /* # instance fields */
	 private Boolean mCullingEnabled;
	 protected Integer mDestinationBlendFunction;
	 protected Integer mSourceBlendFunction;
	 /* # direct methods */
	 public org.anddev.andengine.entity.shape.Shape ( ) {
		 /* .locals 1 */
		 /* invoke-direct {p0, p1, p2}, Lorg/anddev/andengine/entity/Entity;-><init>(FF)V */
		 /* const/16 v0, 0x302 */
		 /* iput v0, p0, Lorg/anddev/andengine/entity/shape/Shape;->mSourceBlendFunction:I */
		 /* const/16 v0, 0x303 */
		 /* iput v0, p0, Lorg/anddev/andengine/entity/shape/Shape;->mDestinationBlendFunction:I */
		 int v0 = 0; // const/4 v0, 0x0
		 /* iput-boolean v0, p0, Lorg/anddev/andengine/entity/shape/Shape;->mCullingEnabled:Z */
		 return;
	 } // .end method
	 /* # virtual methods */
	 protected void doDraw ( javax.microedition.khronos.opengles.GL10 p0, org.anddev.andengine.engine.camera.Camera p1 ) {
		 /* .locals 0 */
		 (( org.anddev.andengine.entity.shape.Shape ) p0 ).onInitDraw ( p1 ); // invoke-virtual {p0, p1}, Lorg/anddev/andengine/entity/shape/Shape;->onInitDraw(Ljavax/microedition/khronos/opengles/GL10;)V
		 (( org.anddev.andengine.entity.shape.Shape ) p0 ).onApplyVertices ( p1 ); // invoke-virtual {p0, p1}, Lorg/anddev/andengine/entity/shape/Shape;->onApplyVertices(Ljavax/microedition/khronos/opengles/GL10;)V
		 (( org.anddev.andengine.entity.shape.Shape ) p0 ).drawVertices ( p1, p2 ); // invoke-virtual {p0, p1, p2}, Lorg/anddev/andengine/entity/shape/Shape;->drawVertices(Ljavax/microedition/khronos/opengles/GL10;Lorg/anddev/andengine/engine/camera/Camera;)V
		 return;
	 } // .end method
	 protected abstract void drawVertices ( javax.microedition.khronos.opengles.GL10 p0, org.anddev.andengine.engine.camera.Camera p1 ) {
	 } // .end method
	 protected void finalize ( ) {
		 /* .locals 2 */
		 /* invoke-super {p0}, Ljava/lang/Object;->finalize()V */
		 (( org.anddev.andengine.entity.shape.Shape ) p0 ).getVertexBuffer ( ); // invoke-virtual {p0}, Lorg/anddev/andengine/entity/shape/Shape;->getVertexBuffer()Lorg/anddev/andengine/opengl/vertex/VertexBuffer;
		 v1 = 		 (( org.anddev.andengine.opengl.vertex.VertexBuffer ) v0 ).isManaged ( ); // invoke-virtual {v0}, Lorg/anddev/andengine/opengl/vertex/VertexBuffer;->isManaged()Z
		 if ( v1 != null) { // if-eqz v1, :cond_0
			 (( org.anddev.andengine.opengl.vertex.VertexBuffer ) v0 ).unloadFromActiveBufferObjectManager ( ); // invoke-virtual {v0}, Lorg/anddev/andengine/opengl/vertex/VertexBuffer;->unloadFromActiveBufferObjectManager()V
		 } // :cond_0
		 return;
	 } // .end method
	 public Float getHeightScaled ( ) {
		 /* .locals 2 */
		 v0 = 		 (( org.anddev.andengine.entity.shape.Shape ) p0 ).getHeight ( ); // invoke-virtual {p0}, Lorg/anddev/andengine/entity/shape/Shape;->getHeight()F
		 /* iget v1, p0, Lorg/anddev/andengine/entity/shape/Shape;->mScaleY:F */
		 /* mul-float/2addr v0, v1 */
	 } // .end method
	 protected abstract org.anddev.andengine.opengl.vertex.VertexBuffer getVertexBuffer ( ) {
	 } // .end method
	 public Float getWidthScaled ( ) {
		 /* .locals 2 */
		 v0 = 		 (( org.anddev.andengine.entity.shape.Shape ) p0 ).getWidth ( ); // invoke-virtual {p0}, Lorg/anddev/andengine/entity/shape/Shape;->getWidth()F
		 /* iget v1, p0, Lorg/anddev/andengine/entity/shape/Shape;->mScaleX:F */
		 /* mul-float/2addr v0, v1 */
	 } // .end method
	 protected abstract Boolean isCulled ( org.anddev.andengine.engine.camera.Camera p0 ) {
	 } // .end method
	 public Boolean isCullingEnabled ( ) {
		 /* .locals 1 */
		 /* iget-boolean v0, p0, Lorg/anddev/andengine/entity/shape/Shape;->mCullingEnabled:Z */
	 } // .end method
	 public Boolean isVertexBufferManaged ( ) {
		 /* .locals 1 */
		 (( org.anddev.andengine.entity.shape.Shape ) p0 ).getVertexBuffer ( ); // invoke-virtual {p0}, Lorg/anddev/andengine/entity/shape/Shape;->getVertexBuffer()Lorg/anddev/andengine/opengl/vertex/VertexBuffer;
		 v0 = 		 (( org.anddev.andengine.opengl.vertex.VertexBuffer ) v0 ).isManaged ( ); // invoke-virtual {v0}, Lorg/anddev/andengine/opengl/vertex/VertexBuffer;->isManaged()Z
	 } // .end method
	 protected void onApplyVertices ( javax.microedition.khronos.opengles.GL10 p0 ) {
		 /* .locals 1 */
		 /* sget-boolean v0, Lorg/anddev/andengine/opengl/util/GLHelper;->EXTENSIONS_VERTEXBUFFEROBJECTS:Z */
		 if ( v0 != null) { // if-eqz v0, :cond_0
			 /* check-cast p1, Ljavax/microedition/khronos/opengles/GL11; */
			 (( org.anddev.andengine.entity.shape.Shape ) p0 ).getVertexBuffer ( ); // invoke-virtual {p0}, Lorg/anddev/andengine/entity/shape/Shape;->getVertexBuffer()Lorg/anddev/andengine/opengl/vertex/VertexBuffer;
			 (( org.anddev.andengine.opengl.vertex.VertexBuffer ) v0 ).selectOnHardware ( p1 ); // invoke-virtual {v0, p1}, Lorg/anddev/andengine/opengl/vertex/VertexBuffer;->selectOnHardware(Ljavax/microedition/khronos/opengles/GL11;)V
			 org.anddev.andengine.opengl.util.GLHelper .vertexZeroPointer ( p1 );
		 } // :goto_0
		 return;
	 } // :cond_0
	 (( org.anddev.andengine.entity.shape.Shape ) p0 ).getVertexBuffer ( ); // invoke-virtual {p0}, Lorg/anddev/andengine/entity/shape/Shape;->getVertexBuffer()Lorg/anddev/andengine/opengl/vertex/VertexBuffer;
	 (( org.anddev.andengine.opengl.vertex.VertexBuffer ) v0 ).getFloatBuffer ( ); // invoke-virtual {v0}, Lorg/anddev/andengine/opengl/vertex/VertexBuffer;->getFloatBuffer()Lorg/anddev/andengine/opengl/util/FastFloatBuffer;
	 org.anddev.andengine.opengl.util.GLHelper .vertexPointer ( p1,v0 );
} // .end method
public Boolean onAreaTouched ( org.anddev.andengine.input.touch.TouchEvent p0, Float p1, Float p2 ) {
	 /* .locals 1 */
	 int v0 = 0; // const/4 v0, 0x0
} // .end method
protected void onInitDraw ( javax.microedition.khronos.opengles.GL10 p0 ) {
	 /* .locals 4 */
	 /* iget v0, p0, Lorg/anddev/andengine/entity/shape/Shape;->mRed:F */
	 /* iget v1, p0, Lorg/anddev/andengine/entity/shape/Shape;->mGreen:F */
	 /* iget v2, p0, Lorg/anddev/andengine/entity/shape/Shape;->mBlue:F */
	 /* iget v3, p0, Lorg/anddev/andengine/entity/shape/Shape;->mAlpha:F */
	 org.anddev.andengine.opengl.util.GLHelper .setColor ( p1,v0,v1,v2,v3 );
	 org.anddev.andengine.opengl.util.GLHelper .enableVertexArray ( p1 );
	 /* iget v0, p0, Lorg/anddev/andengine/entity/shape/Shape;->mSourceBlendFunction:I */
	 /* iget v1, p0, Lorg/anddev/andengine/entity/shape/Shape;->mDestinationBlendFunction:I */
	 org.anddev.andengine.opengl.util.GLHelper .blendFunction ( p1,v0,v1 );
	 return;
} // .end method
protected void onManagedDraw ( javax.microedition.khronos.opengles.GL10 p0, org.anddev.andengine.engine.camera.Camera p1 ) {
	 /* .locals 1 */
	 /* iget-boolean v0, p0, Lorg/anddev/andengine/entity/shape/Shape;->mCullingEnabled:Z */
	 if ( v0 != null) { // if-eqz v0, :cond_0
		 v0 = 		 (( org.anddev.andengine.entity.shape.Shape ) p0 ).isCulled ( p2 ); // invoke-virtual {p0, p2}, Lorg/anddev/andengine/entity/shape/Shape;->isCulled(Lorg/anddev/andengine/engine/camera/Camera;)Z
		 /* if-nez v0, :cond_1 */
	 } // :cond_0
	 /* invoke-super {p0, p1, p2}, Lorg/anddev/andengine/entity/Entity;->onManagedDraw(Ljavax/microedition/khronos/opengles/GL10;Lorg/anddev/andengine/engine/camera/Camera;)V */
} // :cond_1
return;
} // .end method
protected abstract void onUpdateVertexBuffer ( ) {
} // .end method
public void reset ( ) {
/* .locals 1 */
/* invoke-super {p0}, Lorg/anddev/andengine/entity/Entity;->reset()V */
/* const/16 v0, 0x302 */
/* iput v0, p0, Lorg/anddev/andengine/entity/shape/Shape;->mSourceBlendFunction:I */
/* const/16 v0, 0x303 */
/* iput v0, p0, Lorg/anddev/andengine/entity/shape/Shape;->mDestinationBlendFunction:I */
return;
} // .end method
public void setBlendFunction ( Integer p0, Integer p1 ) {
/* .locals 0 */
/* iput p1, p0, Lorg/anddev/andengine/entity/shape/Shape;->mSourceBlendFunction:I */
/* iput p2, p0, Lorg/anddev/andengine/entity/shape/Shape;->mDestinationBlendFunction:I */
return;
} // .end method
public void setCullingEnabled ( Boolean p0 ) {
/* .locals 0 */
/* iput-boolean p1, p0, Lorg/anddev/andengine/entity/shape/Shape;->mCullingEnabled:Z */
return;
} // .end method
public void setVertexBufferManaged ( Boolean p0 ) {
/* .locals 1 */
(( org.anddev.andengine.entity.shape.Shape ) p0 ).getVertexBuffer ( ); // invoke-virtual {p0}, Lorg/anddev/andengine/entity/shape/Shape;->getVertexBuffer()Lorg/anddev/andengine/opengl/vertex/VertexBuffer;
(( org.anddev.andengine.opengl.vertex.VertexBuffer ) v0 ).setManaged ( p1 ); // invoke-virtual {v0, p1}, Lorg/anddev/andengine/opengl/vertex/VertexBuffer;->setManaged(Z)V
return;
} // .end method
protected void updateVertexBuffer ( ) {
/* .locals 0 */
(( org.anddev.andengine.entity.shape.Shape ) p0 ).onUpdateVertexBuffer ( ); // invoke-virtual {p0}, Lorg/anddev/andengine/entity/shape/Shape;->onUpdateVertexBuffer()V
return;
} // .end method
