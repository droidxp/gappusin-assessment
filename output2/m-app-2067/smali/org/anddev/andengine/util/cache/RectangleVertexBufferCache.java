public class org.anddev.andengine.util.cache.RectangleVertexBufferCache {
	 /* # instance fields */
	 private final Integer mDrawType;
	 private final org.anddev.andengine.util.MultiKeyHashMap mRectangleVertexBufferCache;
	 /* # direct methods */
	 public org.anddev.andengine.util.cache.RectangleVertexBufferCache ( ) {
		 /* .locals 1 */
		 /* const v0, 0x88e4 */
		 /* invoke-direct {p0, v0}, Lorg/anddev/andengine/util/cache/RectangleVertexBufferCache;-><init>(I)V */
		 return;
	 } // .end method
	 public org.anddev.andengine.util.cache.RectangleVertexBufferCache ( ) {
		 /* .locals 1 */
		 /* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
		 /* new-instance v0, Lorg/anddev/andengine/util/MultiKeyHashMap; */
		 /* invoke-direct {v0}, Lorg/anddev/andengine/util/MultiKeyHashMap;-><init>()V */
		 this.mRectangleVertexBufferCache = v0;
		 /* iput p1, p0, Lorg/anddev/andengine/util/cache/RectangleVertexBufferCache;->mDrawType:I */
		 return;
	 } // .end method
	 /* # virtual methods */
	 public org.anddev.andengine.opengl.vertex.RectangleVertexBuffer get ( Integer p0, Integer p1 ) {
		 /* .locals 5 */
		 int v4 = 0; // const/4 v4, 0x0
		 v0 = this.mRectangleVertexBufferCache;
		 int v1 = 2; // const/4 v1, 0x2
		 /* new-array v1, v1, [Ljava/lang/Integer; */
		 java.lang.Integer .valueOf ( p1 );
		 /* aput-object v2, v1, v4 */
		 int v2 = 1; // const/4 v2, 0x1
		 java.lang.Integer .valueOf ( p2 );
		 /* aput-object v3, v1, v2 */
		 (( org.anddev.andengine.util.MultiKeyHashMap ) v0 ).get ( v1 ); // invoke-virtual {v0, v1}, Lorg/anddev/andengine/util/MultiKeyHashMap;->get([Ljava/lang/Object;)Ljava/lang/Object;
		 /* check-cast v0, Lorg/anddev/andengine/opengl/vertex/RectangleVertexBuffer; */
		 if ( v0 != null) { // if-eqz v0, :cond_0
		 } // :goto_0
	 } // :cond_0
	 /* new-instance v0, Lorg/anddev/andengine/opengl/vertex/RectangleVertexBuffer; */
	 /* iget v1, p0, Lorg/anddev/andengine/util/cache/RectangleVertexBufferCache;->mDrawType:I */
	 /* invoke-direct {v0, v1, v4}, Lorg/anddev/andengine/opengl/vertex/RectangleVertexBuffer;-><init>(IZ)V */
	 (( org.anddev.andengine.util.cache.RectangleVertexBufferCache ) p0 ).put ( p1, p2, v0 ); // invoke-virtual {p0, p1, p2, v0}, Lorg/anddev/andengine/util/cache/RectangleVertexBufferCache;->put(IILorg/anddev/andengine/opengl/vertex/RectangleVertexBuffer;)Lorg/anddev/andengine/opengl/vertex/RectangleVertexBuffer;
} // .end method
public org.anddev.andengine.opengl.vertex.RectangleVertexBuffer put ( Integer p0, Integer p1, org.anddev.andengine.opengl.vertex.RectangleVertexBuffer p2 ) {
	 /* .locals 5 */
	 /* int-to-float v0, p1 */
	 /* int-to-float v1, p2 */
	 (( org.anddev.andengine.opengl.vertex.RectangleVertexBuffer ) p3 ).update ( v0, v1 ); // invoke-virtual {p3, v0, v1}, Lorg/anddev/andengine/opengl/vertex/RectangleVertexBuffer;->update(FF)V
	 org.anddev.andengine.opengl.buffer.BufferObjectManager .getActiveInstance ( );
	 (( org.anddev.andengine.opengl.buffer.BufferObjectManager ) v0 ).loadBufferObject ( p3 ); // invoke-virtual {v0, p3}, Lorg/anddev/andengine/opengl/buffer/BufferObjectManager;->loadBufferObject(Lorg/anddev/andengine/opengl/buffer/BufferObject;)V
	 v0 = this.mRectangleVertexBufferCache;
	 /* new-instance v1, Lorg/anddev/andengine/util/MultiKey; */
	 int v2 = 2; // const/4 v2, 0x2
	 /* new-array v2, v2, [Ljava/lang/Integer; */
	 int v3 = 0; // const/4 v3, 0x0
	 java.lang.Integer .valueOf ( p1 );
	 /* aput-object v4, v2, v3 */
	 int v3 = 1; // const/4 v3, 0x1
	 java.lang.Integer .valueOf ( p2 );
	 /* aput-object v4, v2, v3 */
	 /* invoke-direct {v1, v2}, Lorg/anddev/andengine/util/MultiKey;-><init>([Ljava/lang/Object;)V */
	 (( org.anddev.andengine.util.MultiKeyHashMap ) v0 ).put ( v1, p3 ); // invoke-virtual {v0, v1, p3}, Lorg/anddev/andengine/util/MultiKeyHashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
} // .end method
