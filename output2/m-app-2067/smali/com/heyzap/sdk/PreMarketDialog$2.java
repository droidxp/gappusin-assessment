class com.heyzap.sdk.PreMarketDialog$2 implements android.view.View$OnClickListener {
	 /* # interfaces */
	 /* # instance fields */
	 final com.heyzap.sdk.PreMarketDialog this$0; //synthetic
	 /* # direct methods */
	 com.heyzap.sdk.PreMarketDialog$2 ( ) {
		 /* .locals 0 */
		 this.this$0 = p1;
		 /* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
		 return;
	 } // .end method
	 /* # virtual methods */
	 public void onClick ( android.view.View p0 ) {
		 /* .locals 2 */
		 v0 = this.this$0;
		 (( com.heyzap.sdk.PreMarketDialog ) v0 ).getContext ( ); // invoke-virtual {v0}, Lcom/heyzap/sdk/PreMarketDialog;->getContext()Landroid/content/Context;
		 final String v1 = "skip-button-clicked"; // const-string v1, "skip-button-clicked"
		 com.heyzap.sdk.HeyzapAnalytics .trackEvent ( v0,v1 );
		 v0 = this.this$0;
		 (( com.heyzap.sdk.PreMarketDialog ) v0 ).hide ( ); // invoke-virtual {v0}, Lcom/heyzap/sdk/PreMarketDialog;->hide()V
		 return;
	 } // .end method
