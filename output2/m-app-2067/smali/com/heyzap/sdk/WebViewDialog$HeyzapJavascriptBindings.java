class com.heyzap.sdk.WebViewDialog$HeyzapJavascriptBindings {
	 /* # instance fields */
	 final com.heyzap.sdk.WebViewDialog this$0; //synthetic
	 /* # direct methods */
	 private com.heyzap.sdk.WebViewDialog$HeyzapJavascriptBindings ( ) {
		 /* .locals 0 */
		 this.this$0 = p1;
		 /* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
		 return;
	 } // .end method
	 com.heyzap.sdk.WebViewDialog$HeyzapJavascriptBindings ( ) { //synthethic
		 /* .locals 0 */
		 /* invoke-direct {p0, p1}, Lcom/heyzap/sdk/WebViewDialog$HeyzapJavascriptBindings;-><init>(Lcom/heyzap/sdk/WebViewDialog;)V */
		 return;
	 } // .end method
	 /* # virtual methods */
	 public void endActivity ( ) {
		 /* .locals 1 */
		 v0 = this.this$0;
		 (( com.heyzap.sdk.WebViewDialog ) v0 ).hide ( ); // invoke-virtual {v0}, Lcom/heyzap/sdk/WebViewDialog;->hide()V
		 return;
	 } // .end method
	 public void gotoHeyzapOnMarket ( ) {
		 /* .locals 4 */
		 v0 = this.this$0;
		 v0 = 		 com.heyzap.sdk.WebViewDialog .access$200 ( v0 );
		 if ( v0 != null) { // if-eqz v0, :cond_0
			 v0 = this.this$0;
			 (( com.heyzap.sdk.WebViewDialog ) v0 ).getContext ( ); // invoke-virtual {v0}, Lcom/heyzap/sdk/WebViewDialog;->getContext()Landroid/content/Context;
			 com.heyzap.sdk.HeyzapLib .sendNotification ( v0 );
		 } // :cond_0
		 /* new-instance v0, Ljava/lang/StringBuilder; */
		 /* invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V */
		 final String v1 = "market://details?id=com.heyzap.android&referrer="; // const-string v1, "market://details?id=com.heyzap.android&referrer="
		 (( java.lang.StringBuilder ) v0 ).append ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
		 v1 = this.this$0;
		 (( com.heyzap.sdk.WebViewDialog ) v1 ).getContext ( ); // invoke-virtual {v1}, Lcom/heyzap/sdk/WebViewDialog;->getContext()Landroid/content/Context;
		 com.heyzap.sdk.HeyzapAnalytics .getAnalyticsReferrer ( v1 );
		 (( java.lang.StringBuilder ) v0 ).append ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
		 (( java.lang.StringBuilder ) v0 ).toString ( ); // invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
		 v1 = this.this$0;
		 (( com.heyzap.sdk.WebViewDialog ) v1 ).getContext ( ); // invoke-virtual {v1}, Lcom/heyzap/sdk/WebViewDialog;->getContext()Landroid/content/Context;
		 final String v2 = "install-button-clicked"; // const-string v2, "install-button-clicked"
		 com.heyzap.sdk.HeyzapAnalytics .trackEvent ( v1,v2 );
		 final String v1 = "HeyzapSDK"; // const-string v1, "HeyzapSDK"
		 /* new-instance v2, Ljava/lang/StringBuilder; */
		 /* invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V */
		 final String v3 = "Sending player to market, uri: "; // const-string v3, "Sending player to market, uri: "
		 (( java.lang.StringBuilder ) v2 ).append ( v3 ); // invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
		 (( java.lang.StringBuilder ) v2 ).append ( v0 ); // invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
		 (( java.lang.StringBuilder ) v2 ).toString ( ); // invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
		 android.util.Log .d ( v1,v2 );
		 /* new-instance v1, Landroid/content/Intent; */
		 final String v2 = "android.intent.action.VIEW"; // const-string v2, "android.intent.action.VIEW"
		 android.net.Uri .parse ( v0 );
		 /* invoke-direct {v1, v2, v0}, Landroid/content/Intent;-><init>(Ljava/lang/String;Landroid/net/Uri;)V */
		 /* const/high16 v0, 0x18000000 */
		 (( android.content.Intent ) v1 ).addFlags ( v0 ); // invoke-virtual {v1, v0}, Landroid/content/Intent;->addFlags(I)Landroid/content/Intent;
		 v0 = this.this$0;
		 (( com.heyzap.sdk.WebViewDialog ) v0 ).getContext ( ); // invoke-virtual {v0}, Lcom/heyzap/sdk/WebViewDialog;->getContext()Landroid/content/Context;
		 (( android.content.Context ) v0 ).startActivity ( v1 ); // invoke-virtual {v0, v1}, Landroid/content/Context;->startActivity(Landroid/content/Intent;)V
		 v0 = this.this$0;
		 (( com.heyzap.sdk.WebViewDialog ) v0 ).hide ( ); // invoke-virtual {v0}, Lcom/heyzap/sdk/WebViewDialog;->hide()V
		 return;
	 } // .end method
	 public void setNotDead ( ) {
		 /* .locals 2 */
		 v0 = this.this$0;
		 int v1 = 0; // const/4 v1, 0x0
		 com.heyzap.sdk.WebViewDialog .access$302 ( v0,v1 );
		 return;
	 } // .end method
