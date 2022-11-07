public class com.facebook.android.FacebookError extends java.lang.Throwable {
	 /* .source "FacebookError.java" */
	 /* # static fields */
	 private static final Long serialVersionUID;
	 /* # instance fields */
	 private Integer mErrorCode;
	 private java.lang.String mErrorType;
	 /* # direct methods */
	 public com.facebook.android.FacebookError ( ) {
		 /* .locals 1 */
		 /* .param p1, "message" # Ljava/lang/String; */
		 /* .prologue */
		 /* .line 33 */
		 /* invoke-direct {p0, p1}, Ljava/lang/Throwable;-><init>(Ljava/lang/String;)V */
		 /* .line 29 */
		 int v0 = 0; // const/4 v0, 0x0
		 /* iput v0, p0, Lcom/facebook/android/FacebookError;->mErrorCode:I */
		 /* .line 34 */
		 return;
	 } // .end method
	 public com.facebook.android.FacebookError ( ) {
		 /* .locals 1 */
		 /* .param p1, "message" # Ljava/lang/String; */
		 /* .param p2, "type" # Ljava/lang/String; */
		 /* .param p3, "code" # I */
		 /* .prologue */
		 /* .line 37 */
		 /* invoke-direct {p0, p1}, Ljava/lang/Throwable;-><init>(Ljava/lang/String;)V */
		 /* .line 29 */
		 int v0 = 0; // const/4 v0, 0x0
		 /* iput v0, p0, Lcom/facebook/android/FacebookError;->mErrorCode:I */
		 /* .line 38 */
		 this.mErrorType = p2;
		 /* .line 39 */
		 /* iput p3, p0, Lcom/facebook/android/FacebookError;->mErrorCode:I */
		 /* .line 40 */
		 return;
	 } // .end method
	 /* # virtual methods */
	 public Integer getErrorCode ( ) {
		 /* .locals 1 */
		 /* .prologue */
		 /* .line 43 */
		 /* iget v0, p0, Lcom/facebook/android/FacebookError;->mErrorCode:I */
	 } // .end method
	 public java.lang.String getErrorType ( ) {
		 /* .locals 1 */
		 /* .prologue */
		 /* .line 47 */
		 v0 = this.mErrorType;
	 } // .end method
