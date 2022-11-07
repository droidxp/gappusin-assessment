public class com.wiyun.engine.utils.BitmapRawData {
	 /* # instance fields */
	 public data;
	 public Integer height;
	 public Integer width;
	 /* # direct methods */
	 public com.wiyun.engine.utils.BitmapRawData ( ) {
		 /* .locals 0 */
		 /* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
		 return;
	 } // .end method
	 /* # virtual methods */
	 public java.nio.IntBuffer asIntBuffer ( ) {
		 /* .locals 2 */
		 v0 = this.data;
		 java.nio.ByteBuffer .wrap ( v0 );
		 v1 = java.nio.ByteOrder.BIG_ENDIAN;
		 (( java.nio.ByteBuffer ) v0 ).order ( v1 ); // invoke-virtual {v0, v1}, Ljava/nio/ByteBuffer;->order(Ljava/nio/ByteOrder;)Ljava/nio/ByteBuffer;
		 (( java.nio.ByteBuffer ) v0 ).asIntBuffer ( ); // invoke-virtual {v0}, Ljava/nio/ByteBuffer;->asIntBuffer()Ljava/nio/IntBuffer;
	 } // .end method
	 public void destroy ( ) {
		 /* .locals 1 */
		 int v0 = 0; // const/4 v0, 0x0
		 this.data = v0;
		 return;
	 } // .end method
