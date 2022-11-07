public class com.openfeint.internal.request.multipart.ByteArrayPartSource implements com.openfeint.internal.request.multipart.PartSource {
	 /* .source "ByteArrayPartSource.java" */
	 /* # interfaces */
	 /* # instance fields */
	 private bytes;
	 private java.lang.String fileName;
	 /* # direct methods */
	 public com.openfeint.internal.request.multipart.ByteArrayPartSource ( ) {
		 /* .locals 0 */
		 /* .param p1, "fileName" # Ljava/lang/String; */
		 /* .param p2, "bytes" # [B */
		 /* .prologue */
		 /* .line 59 */
		 /* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
		 /* .line 61 */
		 this.fileName = p1;
		 /* .line 62 */
		 this.bytes = p2;
		 /* .line 64 */
		 return;
	 } // .end method
	 /* # virtual methods */
	 public java.io.InputStream createInputStream ( ) {
		 /* .locals 2 */
		 /* .annotation system Ldalvik/annotation/Throws; */
		 /* value = { */
		 /* Ljava/io/IOException; */
		 /* } */
	 } // .end annotation
	 /* .prologue */
	 /* .line 84 */
	 /* new-instance v0, Ljava/io/ByteArrayInputStream; */
	 v1 = this.bytes;
	 /* invoke-direct {v0, v1}, Ljava/io/ByteArrayInputStream;-><init>([B)V */
} // .end method
public java.lang.String getFileName ( ) {
	 /* .locals 1 */
	 /* .prologue */
	 /* .line 77 */
	 v0 = this.fileName;
} // .end method
public Long getLength ( ) {
	 /* .locals 2 */
	 /* .prologue */
	 /* .line 70 */
	 v0 = this.bytes;
	 /* array-length v0, v0 */
	 /* int-to-long v0, v0 */
	 /* return-wide v0 */
} // .end method
