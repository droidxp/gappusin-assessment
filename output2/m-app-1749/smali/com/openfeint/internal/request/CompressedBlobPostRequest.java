public class com.openfeint.internal.request.CompressedBlobPostRequest extends com.openfeint.internal.request.BlobPostRequest {
	 /* .source "CompressedBlobPostRequest.java" */
	 /* # instance fields */
	 java.lang.String mFilename;
	 com.openfeint.internal.resource.BlobUploadParameters mParameters;
	 Object mUncompressedData;
	 /* # direct methods */
	 public com.openfeint.internal.request.CompressedBlobPostRequest ( ) {
		 /* .locals 2 */
		 /* .param p1, "parameters" # Lcom/openfeint/internal/resource/BlobUploadParameters; */
		 /* .param p2, "filename" # Ljava/lang/String; */
		 /* .param p3, "uncompressedData" # [B */
		 /* .prologue */
		 /* .line 13 */
		 /* new-instance v0, Lcom/openfeint/internal/request/multipart/ByteArrayPartSource; */
		 com.openfeint.internal.request.Compression .compress ( p3 );
		 /* invoke-direct {v0, p2, v1}, Lcom/openfeint/internal/request/multipart/ByteArrayPartSource;-><init>(Ljava/lang/String;[B)V */
		 final String v1 = "application/octet-stream"; // const-string v1, "application/octet-stream"
		 /* invoke-direct {p0, p1, v0, v1}, Lcom/openfeint/internal/request/BlobPostRequest;-><init>(Lcom/openfeint/internal/resource/BlobUploadParameters;Lcom/openfeint/internal/request/multipart/PartSource;Ljava/lang/String;)V */
		 /* .line 14 */
		 return;
	 } // .end method
