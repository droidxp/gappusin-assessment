public class org.anddev.andengine.opengl.vertex.LineVertexBuffer extends org.anddev.andengine.opengl.vertex.VertexBuffer {
	 /* # static fields */
	 public static final Integer VERTICES_PER_LINE;
	 /* # direct methods */
	 public org.anddev.andengine.opengl.vertex.LineVertexBuffer ( ) {
		 /* .locals 1 */
		 int v0 = 4; // const/4 v0, 0x4
		 /* invoke-direct {p0, v0, p1, p2}, Lorg/anddev/andengine/opengl/vertex/VertexBuffer;-><init>(IIZ)V */
		 return;
	 } // .end method
	 /* # virtual methods */
	 public synchronized void update ( Float p0, Float p1, Float p2, Float p3 ) {
		 /* .locals 3 */
		 /* monitor-enter p0 */
		 try { // :try_start_0
			 v0 = this.mBufferData;
			 int v1 = 0; // const/4 v1, 0x0
			 v2 = 			 java.lang.Float .floatToRawIntBits ( p1 );
			 /* aput v2, v0, v1 */
			 int v1 = 1; // const/4 v1, 0x1
			 v2 = 			 java.lang.Float .floatToRawIntBits ( p2 );
			 /* aput v2, v0, v1 */
			 int v1 = 2; // const/4 v1, 0x2
			 v2 = 			 java.lang.Float .floatToRawIntBits ( p3 );
			 /* aput v2, v0, v1 */
			 int v1 = 3; // const/4 v1, 0x3
			 v2 = 			 java.lang.Float .floatToRawIntBits ( p4 );
			 /* aput v2, v0, v1 */
			 v1 = this.mFloatBuffer;
			 int v2 = 0; // const/4 v2, 0x0
			 (( org.anddev.andengine.opengl.util.FastFloatBuffer ) v1 ).position ( v2 ); // invoke-virtual {v1, v2}, Lorg/anddev/andengine/opengl/util/FastFloatBuffer;->position(I)V
			 (( org.anddev.andengine.opengl.util.FastFloatBuffer ) v1 ).put ( v0 ); // invoke-virtual {v1, v0}, Lorg/anddev/andengine/opengl/util/FastFloatBuffer;->put([I)V
			 int v0 = 0; // const/4 v0, 0x0
			 (( org.anddev.andengine.opengl.util.FastFloatBuffer ) v1 ).position ( v0 ); // invoke-virtual {v1, v0}, Lorg/anddev/andengine/opengl/util/FastFloatBuffer;->position(I)V
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
