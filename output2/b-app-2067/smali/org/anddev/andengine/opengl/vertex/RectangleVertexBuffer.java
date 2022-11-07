public class org.anddev.andengine.opengl.vertex.RectangleVertexBuffer extends org.anddev.andengine.opengl.vertex.VertexBuffer {
	 /* # static fields */
	 private static final Integer FLOAT_TO_RAW_INT_BITS_ZERO;
	 public static final Integer VERTICES_PER_RECTANGLE;
	 /* # direct methods */
	 static org.anddev.andengine.opengl.vertex.RectangleVertexBuffer ( ) {
		 /* .locals 1 */
		 int v0 = 0; // const/4 v0, 0x0
		 v0 = 		 java.lang.Float .floatToRawIntBits ( v0 );
		 return;
	 } // .end method
	 public org.anddev.andengine.opengl.vertex.RectangleVertexBuffer ( ) {
		 /* .locals 1 */
		 /* const/16 v0, 0x8 */
		 /* invoke-direct {p0, v0, p1, p2}, Lorg/anddev/andengine/opengl/vertex/VertexBuffer;-><init>(IIZ)V */
		 return;
	 } // .end method
	 /* # virtual methods */
	 public synchronized void update ( Float p0, Float p1 ) {
		 /* .locals 6 */
		 /* monitor-enter p0 */
		 try { // :try_start_0
			 v2 = 			 java.lang.Float .floatToRawIntBits ( p1 );
			 v3 = 			 java.lang.Float .floatToRawIntBits ( p2 );
			 v4 = this.mBufferData;
			 int v5 = 0; // const/4 v5, 0x0
			 /* aput v0, v4, v5 */
			 int v5 = 1; // const/4 v5, 0x1
			 /* aput v1, v4, v5 */
			 int v5 = 2; // const/4 v5, 0x2
			 /* aput v0, v4, v5 */
			 int v0 = 3; // const/4 v0, 0x3
			 /* aput v3, v4, v0 */
			 int v0 = 4; // const/4 v0, 0x4
			 /* aput v2, v4, v0 */
			 int v0 = 5; // const/4 v0, 0x5
			 /* aput v1, v4, v0 */
			 int v0 = 6; // const/4 v0, 0x6
			 /* aput v2, v4, v0 */
			 int v0 = 7; // const/4 v0, 0x7
			 /* aput v3, v4, v0 */
			 (( org.anddev.andengine.opengl.vertex.RectangleVertexBuffer ) p0 ).getFloatBuffer ( ); // invoke-virtual {p0}, Lorg/anddev/andengine/opengl/vertex/RectangleVertexBuffer;->getFloatBuffer()Lorg/anddev/andengine/opengl/util/FastFloatBuffer;
			 int v1 = 0; // const/4 v1, 0x0
			 (( org.anddev.andengine.opengl.util.FastFloatBuffer ) v0 ).position ( v1 ); // invoke-virtual {v0, v1}, Lorg/anddev/andengine/opengl/util/FastFloatBuffer;->position(I)V
			 (( org.anddev.andengine.opengl.util.FastFloatBuffer ) v0 ).put ( v4 ); // invoke-virtual {v0, v4}, Lorg/anddev/andengine/opengl/util/FastFloatBuffer;->put([I)V
			 int v1 = 0; // const/4 v1, 0x0
			 (( org.anddev.andengine.opengl.util.FastFloatBuffer ) v0 ).position ( v1 ); // invoke-virtual {v0, v1}, Lorg/anddev/andengine/opengl/util/FastFloatBuffer;->position(I)V
			 /* invoke-super {p0}, Lorg/anddev/andengine/opengl/vertex/VertexBuffer;->setHardwareBufferNeedsUpdate()V */
			 /* :try_end_0 */
			 /* .catchall {:try_start_0 ..:try_end_0} :catchall_0 */
			 /* monitor-exit p0 */
			 return;
			 /* :catchall_0 */
			 /* move-exception v0 */
			 /* monitor-exit p0 */
			 /* throw v0 */
		 } // .end method
