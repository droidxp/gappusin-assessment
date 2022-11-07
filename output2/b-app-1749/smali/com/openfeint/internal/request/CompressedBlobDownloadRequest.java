public abstract class com.openfeint.internal.request.CompressedBlobDownloadRequest extends com.openfeint.internal.request.DownloadRequest {
	 /* .source "CompressedBlobDownloadRequest.java" */
	 /* # direct methods */
	 public com.openfeint.internal.request.CompressedBlobDownloadRequest ( ) {
		 /* .locals 0 */
		 /* .prologue */
		 /* .line 8 */
		 /* invoke-direct {p0}, Lcom/openfeint/internal/request/DownloadRequest;-><init>()V */
		 return;
	 } // .end method
	 /* # virtual methods */
	 protected final void onSuccess ( Object[] p0 ) {
		 /* .locals 2 */
		 /* .param p1, "body" # [B */
		 /* .prologue */
		 /* .line 13 */
		 try { // :try_start_0
			 com.openfeint.internal.request.Compression .decompress ( p1 );
			 (( com.openfeint.internal.request.CompressedBlobDownloadRequest ) p0 ).onSuccessDecompress ( v1 ); // invoke-virtual {p0, v1}, Lcom/openfeint/internal/request/CompressedBlobDownloadRequest;->onSuccessDecompress([B)V
			 /* :try_end_0 */
			 /* .catch Ljava/io/IOException; {:try_start_0 ..:try_end_0} :catch_0 */
			 /* .line 17 */
		 } // :goto_0
		 return;
		 /* .line 14 */
		 /* :catch_0 */
		 /* move-exception v0 */
		 /* .line 15 */
		 /* .local v0, "e":Ljava/io/IOException; */
		 com.openfeint.internal.OpenFeintInternal .getRString ( v1 );
		 (( com.openfeint.internal.request.CompressedBlobDownloadRequest ) p0 ).onFailure ( v1 ); // invoke-virtual {p0, v1}, Lcom/openfeint/internal/request/CompressedBlobDownloadRequest;->onFailure(Ljava/lang/String;)V
	 } // .end method
	 protected abstract void onSuccessDecompress ( Object[] p0 ) {
	 } // .end method
