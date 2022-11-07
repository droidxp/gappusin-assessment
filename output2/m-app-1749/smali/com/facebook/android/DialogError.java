public class com.facebook.android.DialogError extends java.lang.Throwable {
	 /* .source "DialogError.java" */
	 /* # static fields */
	 private static final Long serialVersionUID;
	 /* # instance fields */
	 private Integer mErrorCode;
	 private java.lang.String mFailingUrl;
	 /* # direct methods */
	 public com.facebook.android.DialogError ( ) {
		 /* .locals 0 */
		 /* .param p1, "message" # Ljava/lang/String; */
		 /* .param p2, "errorCode" # I */
		 /* .param p3, "failingUrl" # Ljava/lang/String; */
		 /* .prologue */
		 /* .line 38 */
		 /* invoke-direct {p0, p1}, Ljava/lang/Throwable;-><init>(Ljava/lang/String;)V */
		 /* .line 39 */
		 /* iput p2, p0, Lcom/facebook/android/DialogError;->mErrorCode:I */
		 /* .line 40 */
		 this.mFailingUrl = p3;
		 /* .line 41 */
		 return;
	 } // .end method
	 /* # virtual methods */
	 Integer getErrorCode ( ) {
		 /* .locals 1 */
		 /* .prologue */
		 /* .line 44 */
		 /* iget v0, p0, Lcom/facebook/android/DialogError;->mErrorCode:I */
	 } // .end method
	 java.lang.String getFailingUrl ( ) {
		 /* .locals 1 */
		 /* .prologue */
		 /* .line 48 */
		 v0 = this.mFailingUrl;
	 } // .end method
