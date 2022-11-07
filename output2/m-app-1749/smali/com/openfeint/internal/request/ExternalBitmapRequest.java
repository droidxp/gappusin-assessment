public class com.openfeint.internal.request.ExternalBitmapRequest extends com.openfeint.internal.request.BitmapRequest {
	 /* .source "ExternalBitmapRequest.java" */
	 /* # instance fields */
	 private java.lang.String mURL;
	 /* # direct methods */
	 public com.openfeint.internal.request.ExternalBitmapRequest ( ) {
		 /* .locals 0 */
		 /* .param p1, "url" # Ljava/lang/String; */
		 /* .prologue */
		 /* .line 6 */
		 /* invoke-direct {p0}, Lcom/openfeint/internal/request/BitmapRequest;-><init>()V */
		 this.mURL = p1;
		 return;
	 } // .end method
	 /* # virtual methods */
	 public java.lang.String path ( ) {
		 /* .locals 1 */
		 /* .prologue */
		 /* .line 10 */
		 final String v0 = ""; // const-string v0, ""
	 } // .end method
	 public Boolean signed ( ) {
		 /* .locals 1 */
		 /* .prologue */
		 /* .line 8 */
		 int v0 = 0; // const/4 v0, 0x0
	 } // .end method
	 public java.lang.String url ( ) {
		 /* .locals 1 */
		 /* .prologue */
		 /* .line 9 */
		 v0 = this.mURL;
	 } // .end method
