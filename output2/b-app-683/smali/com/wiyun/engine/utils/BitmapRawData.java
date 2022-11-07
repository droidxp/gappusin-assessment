public class com.wiyun.engine.utils.BitmapRawData {
	 /* .source "BitmapRawData.java" */
	 /* # instance fields */
	 public data;
	 public Integer height;
	 public Integer width;
	 /* # direct methods */
	 public com.wiyun.engine.utils.BitmapRawData ( ) {
		 /* .locals 0 */
		 /* .prologue */
		 /* .line 14 */
		 /* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
		 return;
	 } // .end method
	 /* # virtual methods */
	 public java.nio.IntBuffer asIntBuffer ( ) {
		 /* .locals 2 */
		 /* .prologue */
		 /* .line 45 */
		 v1 = this.data;
		 java.nio.ByteBuffer .wrap ( v1 );
		 /* .line 46 */
		 /* .local v0, "bb":Ljava/nio/ByteBuffer; */
		 v1 = java.nio.ByteOrder.BIG_ENDIAN;
		 (( java.nio.ByteBuffer ) v0 ).order ( v1 ); // invoke-virtual {v0, v1}, Ljava/nio/ByteBuffer;->order(Ljava/nio/ByteOrder;)Ljava/nio/ByteBuffer;
		 /* .line 47 */
		 (( java.nio.ByteBuffer ) v0 ).asIntBuffer ( ); // invoke-virtual {v0}, Ljava/nio/ByteBuffer;->asIntBuffer()Ljava/nio/IntBuffer;
	 } // .end method
	 public void destroy ( ) {
		 /* .locals 1 */
		 /* .prologue */
		 /* .line 35 */
		 int v0 = 0; // const/4 v0, 0x0
		 this.data = v0;
		 /* .line 36 */
		 return;
	 } // .end method
