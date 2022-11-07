public abstract class com.openfeint.internal.request.BitmapRequest extends com.openfeint.internal.request.DownloadRequest {
	 /* .source "BitmapRequest.java" */
	 /* # direct methods */
	 public com.openfeint.internal.request.BitmapRequest ( ) {
		 /* .locals 0 */
		 /* .prologue */
		 /* .line 9 */
		 /* invoke-direct {p0}, Lcom/openfeint/internal/request/DownloadRequest;-><init>()V */
		 return;
	 } // .end method
	 /* # virtual methods */
	 public void onSuccess ( android.graphics.Bitmap p0 ) {
		 /* .locals 0 */
		 /* .param p1, "responseBody" # Landroid/graphics/Bitmap; */
		 /* .prologue */
		 /* .line 12 */
		 return;
	 } // .end method
	 protected void onSuccess ( Object[] p0 ) {
		 /* .locals 3 */
		 /* .param p1, "body" # [B */
		 /* .prologue */
		 /* .line 15 */
		 int v1 = 0; // const/4 v1, 0x0
		 /* array-length v2, p1 */
		 android.graphics.BitmapFactory .decodeByteArray ( p1,v1,v2 );
		 /* .line 16 */
		 /* .local v0, "b":Landroid/graphics/Bitmap; */
		 if ( v0 != null) { // if-eqz v0, :cond_0
			 /* .line 17 */
			 (( com.openfeint.internal.request.BitmapRequest ) p0 ).onSuccess ( v0 ); // invoke-virtual {p0, v0}, Lcom/openfeint/internal/request/BitmapRequest;->onSuccess(Landroid/graphics/Bitmap;)V
			 /* .line 21 */
		 } // :goto_0
		 return;
		 /* .line 19 */
	 } // :cond_0
	 com.openfeint.internal.OpenFeintInternal .getRString ( v1 );
	 (( com.openfeint.internal.request.BitmapRequest ) p0 ).onFailure ( v1 ); // invoke-virtual {p0, v1}, Lcom/openfeint/internal/request/BitmapRequest;->onFailure(Ljava/lang/String;)V
} // .end method
