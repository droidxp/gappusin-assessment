public abstract class com.balloonisland.hfxw.BaseDialogListener implements com.facebook.android.Facebook$DialogListener {
	 /* .source "BaseDialogListener.java" */
	 /* # interfaces */
	 /* # direct methods */
	 public com.balloonisland.hfxw.BaseDialogListener ( ) {
		 /* .locals 0 */
		 /* .prologue */
		 /* .line 11 */
		 /* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
		 return;
	 } // .end method
	 /* # virtual methods */
	 public void onCancel ( ) {
		 /* .locals 0 */
		 /* .prologue */
		 /* .line 25 */
		 return;
	 } // .end method
	 public void onError ( com.facebook.android.DialogError p0 ) {
		 /* .locals 0 */
		 /* .param p1, "e" # Lcom/facebook/android/DialogError; */
		 /* .prologue */
		 /* .line 20 */
		 (( com.facebook.android.DialogError ) p1 ).printStackTrace ( ); // invoke-virtual {p1}, Lcom/facebook/android/DialogError;->printStackTrace()V
		 /* .line 21 */
		 return;
	 } // .end method
	 public void onFacebookError ( com.facebook.android.FacebookError p0 ) {
		 /* .locals 0 */
		 /* .param p1, "e" # Lcom/facebook/android/FacebookError; */
		 /* .prologue */
		 /* .line 15 */
		 (( com.facebook.android.FacebookError ) p1 ).printStackTrace ( ); // invoke-virtual {p1}, Lcom/facebook/android/FacebookError;->printStackTrace()V
		 /* .line 16 */
		 return;
	 } // .end method
