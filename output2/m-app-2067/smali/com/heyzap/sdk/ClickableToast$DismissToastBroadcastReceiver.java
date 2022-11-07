public class com.heyzap.sdk.ClickableToast$DismissToastBroadcastReceiver extends android.content.BroadcastReceiver {
	 /* # instance fields */
	 private com.heyzap.sdk.ClickableToast toast;
	 /* # direct methods */
	 public com.heyzap.sdk.ClickableToast$DismissToastBroadcastReceiver ( ) {
		 /* .locals 0 */
		 /* invoke-direct {p0}, Landroid/content/BroadcastReceiver;-><init>()V */
		 return;
	 } // .end method
	 /* # virtual methods */
	 public void onReceive ( android.content.Context p0, android.content.Intent p1 ) {
		 /* .locals 1 */
		 v0 = this.toast;
		 if ( v0 != null) { // if-eqz v0, :cond_0
			 v0 = this.toast;
			 (( com.heyzap.sdk.ClickableToast ) v0 ).hide ( ); // invoke-virtual {v0}, Lcom/heyzap/sdk/ClickableToast;->hide()V
		 } // :cond_0
		 return;
	 } // .end method
	 public void setToast ( com.heyzap.sdk.ClickableToast p0 ) {
		 /* .locals 0 */
		 this.toast = p1;
		 return;
	 } // .end method
