class com.heyzap.sdk.PopupToast$2 implements android.view.View$OnClickListener {
	 /* # interfaces */
	 /* # instance fields */
	 final com.heyzap.sdk.PopupToast this$0; //synthetic
	 /* # direct methods */
	 com.heyzap.sdk.PopupToast$2 ( ) {
		 /* .locals 0 */
		 this.this$0 = p1;
		 /* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
		 return;
	 } // .end method
	 /* # virtual methods */
	 public void onClick ( android.view.View p0 ) {
		 /* .locals 1 */
		 v0 = this.this$0;
		 (( com.heyzap.sdk.PopupToast ) v0 ).onCheckinClick ( p1 ); // invoke-virtual {v0, p1}, Lcom/heyzap/sdk/PopupToast;->onCheckinClick(Landroid/view/View;)V
		 return;
	 } // .end method
