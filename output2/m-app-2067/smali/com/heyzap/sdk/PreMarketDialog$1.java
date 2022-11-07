class com.heyzap.sdk.PreMarketDialog$1 implements android.view.View$OnClickListener {
	 /* # interfaces */
	 /* # instance fields */
	 final com.heyzap.sdk.PreMarketDialog this$0; //synthetic
	 final android.content.Context val$context; //synthetic
	 /* # direct methods */
	 com.heyzap.sdk.PreMarketDialog$1 ( ) {
		 /* .locals 0 */
		 this.this$0 = p1;
		 this.val$context = p2;
		 /* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
		 return;
	 } // .end method
	 /* # virtual methods */
	 public void onClick ( android.view.View p0 ) {
		 /* .locals 4 */
		 int v2 = 1; // const/4 v2, 0x1
		 v0 = this.val$context;
		 v0 = 		 com.heyzap.sdk.Utils .marketInstalled ( v0 );
		 /* if-nez v0, :cond_0 */
		 v0 = this.val$context;
		 final String v1 = "Sorry, the android market is not installed on your device."; // const-string v1, "Sorry, the android market is not installed on your device."
		 android.widget.Toast .makeText ( v0,v1,v2 );
		 (( android.widget.Toast ) v0 ).show ( ); // invoke-virtual {v0}, Landroid/widget/Toast;->show()V
	 } // :goto_0
	 return;
} // :cond_0
v0 = com.heyzap.sdk.Utils .androidVersionSupported ( );
/* if-nez v0, :cond_1 */
v0 = this.val$context;
final String v1 = "Sorry, your android version is not supported by Heyzap."; // const-string v1, "Sorry, your android version is not supported by Heyzap."
android.widget.Toast .makeText ( v0,v1,v2 );
(( android.widget.Toast ) v0 ).show ( ); // invoke-virtual {v0}, Landroid/widget/Toast;->show()V
} // :cond_1
/* new-instance v0, Ljava/lang/StringBuilder; */
/* invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V */
final String v1 = "market://details?id=com.heyzap.android&referrer="; // const-string v1, "market://details?id=com.heyzap.android&referrer="
(( java.lang.StringBuilder ) v0 ).append ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
v1 = this.this$0;
(( com.heyzap.sdk.PreMarketDialog ) v1 ).getContext ( ); // invoke-virtual {v1}, Lcom/heyzap/sdk/PreMarketDialog;->getContext()Landroid/content/Context;
com.heyzap.sdk.HeyzapAnalytics .getAnalyticsReferrer ( v1 );
(( java.lang.StringBuilder ) v0 ).append ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v0 ).toString ( ); // invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
v1 = this.this$0;
(( com.heyzap.sdk.PreMarketDialog ) v1 ).getContext ( ); // invoke-virtual {v1}, Lcom/heyzap/sdk/PreMarketDialog;->getContext()Landroid/content/Context;
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
(( com.heyzap.sdk.PreMarketDialog ) v0 ).getContext ( ); // invoke-virtual {v0}, Lcom/heyzap/sdk/PreMarketDialog;->getContext()Landroid/content/Context;
(( android.content.Context ) v0 ).startActivity ( v1 ); // invoke-virtual {v0, v1}, Landroid/content/Context;->startActivity(Landroid/content/Intent;)V
v0 = this.this$0;
(( com.heyzap.sdk.PreMarketDialog ) v0 ).hide ( ); // invoke-virtual {v0}, Lcom/heyzap/sdk/PreMarketDialog;->hide()V
} // .end method
