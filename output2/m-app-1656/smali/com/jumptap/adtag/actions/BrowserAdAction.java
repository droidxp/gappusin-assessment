public class com.jumptap.adtag.actions.BrowserAdAction extends com.jumptap.adtag.actions.AdAction {
	 /* .source "BrowserAdAction.java" */
	 /* # direct methods */
	 public com.jumptap.adtag.actions.BrowserAdAction ( ) {
		 /* .locals 0 */
		 /* .prologue */
		 /* .line 12 */
		 /* invoke-direct {p0}, Lcom/jumptap/adtag/actions/AdAction;-><init>()V */
		 return;
	 } // .end method
	 /* # virtual methods */
	 public void perform ( android.content.Context p0, com.jumptap.adtag.JtAdView p1 ) {
		 /* .locals 5 */
		 /* .param p1, "context" # Landroid/content/Context; */
		 /* .param p2, "widget" # Lcom/jumptap/adtag/JtAdView; */
		 /* .prologue */
		 /* .line 16 */
		 final String v2 = "JtAd"; // const-string v2, "JtAd"
		 /* new-instance v3, Ljava/lang/StringBuilder; */
		 /* invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V */
		 final String v4 = "Performing BrowserAdAction: "; // const-string v4, "Performing BrowserAdAction: "
		 (( java.lang.StringBuilder ) v3 ).append ( v4 ); // invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
		 v4 = this.redirectedUrl;
		 (( java.lang.StringBuilder ) v3 ).append ( v4 ); // invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
		 (( java.lang.StringBuilder ) v3 ).toString ( ); // invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
		 android.util.Log .i ( v2,v3 );
		 /* .line 17 */
		 /* new-instance v1, Landroid/content/Intent; */
		 final String v2 = "android.intent.action.VIEW"; // const-string v2, "android.intent.action.VIEW"
		 v3 = this.redirectedUrl;
		 android.net.Uri .parse ( v3 );
		 /* invoke-direct {v1, v2, v3}, Landroid/content/Intent;-><init>(Ljava/lang/String;Landroid/net/Uri;)V */
		 /* .line 19 */
		 /* .local v1, "myIntent":Landroid/content/Intent; */
		 if ( p2 != null) { // if-eqz p2, :cond_0
			 /* .line 20 */
			 int v2 = 1; // const/4 v2, 0x1
			 try { // :try_start_0
				 (( com.jumptap.adtag.JtAdView ) p2 ).setLaunchedActivity ( v2 ); // invoke-virtual {p2, v2}, Lcom/jumptap/adtag/JtAdView;->setLaunchedActivity(Z)V
				 /* .line 21 */
				 (( com.jumptap.adtag.JtAdView ) p2 ).notifyLaunchActivity ( ); // invoke-virtual {p2}, Lcom/jumptap/adtag/JtAdView;->notifyLaunchActivity()V
				 /* .line 23 */
			 } // :cond_0
			 (( android.content.Context ) p1 ).startActivity ( v1 ); // invoke-virtual {p1, v1}, Landroid/content/Context;->startActivity(Landroid/content/Intent;)V
			 /* :try_end_0 */
			 /* .catch Landroid/content/ActivityNotFoundException; {:try_start_0 ..:try_end_0} :catch_0 */
			 /* .line 27 */
		 } // :goto_0
		 return;
		 /* .line 24 */
		 /* :catch_0 */
		 /* move-exception v0 */
		 /* .line 25 */
		 /* .local v0, "e":Landroid/content/ActivityNotFoundException; */
		 final String v2 = "JtAd"; // const-string v2, "JtAd"
		 final String v3 = "cannot initiate Browser"; // const-string v3, "cannot initiate Browser"
		 android.util.Log .e ( v2,v3,v0 );
	 } // .end method
