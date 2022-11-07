public abstract class org.anddev.andengine.entity.primitive.BaseRectangle extends org.anddev.andengine.entity.shape.RectangularShape {
	 /* # direct methods */
	 public org.anddev.andengine.entity.primitive.BaseRectangle ( ) {
		 /* .locals 6 */
		 /* new-instance v5, Lorg/anddev/andengine/opengl/vertex/RectangleVertexBuffer; */
		 /* const v0, 0x88e4 */
		 int v1 = 1; // const/4 v1, 0x1
		 /* invoke-direct {v5, v0, v1}, Lorg/anddev/andengine/opengl/vertex/RectangleVertexBuffer;-><init>(IZ)V */
		 /* move-object v0, p0 */
		 /* move v1, p1 */
		 /* move v2, p2 */
		 /* move v3, p3 */
		 /* move v4, p4 */
		 /* invoke-direct/range {v0 ..v5}, Lorg/anddev/andengine/entity/shape/RectangularShape;-><init>(FFFFLorg/anddev/andengine/opengl/vertex/VertexBuffer;)V */
		 (( org.anddev.andengine.entity.primitive.BaseRectangle ) p0 ).updateVertexBuffer ( ); // invoke-virtual {p0}, Lorg/anddev/andengine/entity/primitive/BaseRectangle;->updateVertexBuffer()V
		 return;
	 } // .end method
	 public org.anddev.andengine.entity.primitive.BaseRectangle ( ) {
		 /* .locals 0 */
		 /* invoke-direct/range {p0 ..p5}, Lorg/anddev/andengine/entity/shape/RectangularShape;-><init>(FFFFLorg/anddev/andengine/opengl/vertex/VertexBuffer;)V */
		 return;
	 } // .end method
	 /* # virtual methods */
	 public org.anddev.andengine.opengl.vertex.RectangleVertexBuffer getVertexBuffer ( ) {
		 /* .locals 0 */
		 p0 = this.mVertexBuffer;
		 /* check-cast p0, Lorg/anddev/andengine/opengl/vertex/RectangleVertexBuffer; */
	 } // .end method
	 public org.anddev.andengine.opengl.vertex.VertexBuffer getVertexBuffer ( ) { //bridge//synthethic
		 /* .locals 1 */
		 (( org.anddev.andengine.entity.primitive.BaseRectangle ) p0 ).getVertexBuffer ( ); // invoke-virtual {p0}, Lorg/anddev/andengine/entity/primitive/BaseRectangle;->getVertexBuffer()Lorg/anddev/andengine/opengl/vertex/RectangleVertexBuffer;
	 } // .end method
	 protected void onUpdateVertexBuffer ( ) {
		 /* .locals 3 */
		 (( org.anddev.andengine.entity.primitive.BaseRectangle ) p0 ).getVertexBuffer ( ); // invoke-virtual {p0}, Lorg/anddev/andengine/entity/primitive/BaseRectangle;->getVertexBuffer()Lorg/anddev/andengine/opengl/vertex/RectangleVertexBuffer;
		 /* iget v1, p0, Lorg/anddev/andengine/entity/primitive/BaseRectangle;->mWidth:F */
		 /* iget v2, p0, Lorg/anddev/andengine/entity/primitive/BaseRectangle;->mHeight:F */
		 (( org.anddev.andengine.opengl.vertex.RectangleVertexBuffer ) v0 ).update ( v1, v2 ); // invoke-virtual {v0, v1, v2}, Lorg/anddev/andengine/opengl/vertex/RectangleVertexBuffer;->update(FF)V
		 return;
	 } // .end method
