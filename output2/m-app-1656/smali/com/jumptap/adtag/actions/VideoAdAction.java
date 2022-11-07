public class com.jumptap.adtag.actions.VideoAdAction extends com.jumptap.adtag.actions.AdAction {
	 /* .source "VideoAdAction.java" */
	 /* # direct methods */
	 public com.jumptap.adtag.actions.VideoAdAction ( ) {
		 /* .locals 0 */
		 /* .prologue */
		 /* .line 12 */
		 /* invoke-direct {p0}, Lcom/jumptap/adtag/actions/AdAction;-><init>()V */
		 return;
	 } // .end method
	 /* # virtual methods */
	 public void perform ( android.content.Context p0, com.jumptap.adtag.JtAdView p1 ) {
		 /* .locals 6 */
		 /* .param p1, "context" # Landroid/content/Context; */
		 /* .param p2, "widget" # Lcom/jumptap/adtag/JtAdView; */
		 /* .prologue */
		 /* .line 16 */
		 final String v3 = "JtAd"; // const-string v3, "JtAd"
		 /* new-instance v4, Ljava/lang/StringBuilder; */
		 /* invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V */
		 final String v5 = "Performing VideoAdAction: "; // const-string v5, "Performing VideoAdAction: "
		 (( java.lang.StringBuilder ) v4 ).append ( v5 ); // invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
		 v5 = this.redirectedUrl;
		 (( java.lang.StringBuilder ) v4 ).append ( v5 ); // invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
		 (( java.lang.StringBuilder ) v4 ).toString ( ); // invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
		 android.util.Log .i ( v3,v4 );
		 /* .line 17 */
		 /* new-instance v1, Landroid/content/Intent; */
		 final String v3 = "android.intent.action.VIEW"; // const-string v3, "android.intent.action.VIEW"
		 /* invoke-direct {v1, v3}, Landroid/content/Intent;-><init>(Ljava/lang/String;)V */
		 /* .line 18 */
		 /* .local v1, "myIntent":Landroid/content/Intent; */
		 v3 = this.redirectedUrl;
		 android.net.Uri .parse ( v3 );
		 /* .line 19 */
		 /* .local v2, "u":Landroid/net/Uri; */
		 final String v3 = "video/*"; // const-string v3, "video/*"
		 (( android.content.Intent ) v1 ).setDataAndType ( v2, v3 ); // invoke-virtual {v1, v2, v3}, Landroid/content/Intent;->setDataAndType(Landroid/net/Uri;Ljava/lang/String;)Landroid/content/Intent;
		 /* .line 22 */
		 if ( p2 != null) { // if-eqz p2, :cond_0
			 /* .line 23 */
			 int v3 = 1; // const/4 v3, 0x1
			 try { // :try_start_0
				 (( com.jumptap.adtag.JtAdView ) p2 ).setLaunchedActivity ( v3 ); // invoke-virtual {p2, v3}, Lcom/jumptap/adtag/JtAdView;->setLaunchedActivity(Z)V
				 /* .line 24 */
				 (( com.jumptap.adtag.JtAdView ) p2 ).notifyLaunchActivity ( ); // invoke-virtual {p2}, Lcom/jumptap/adtag/JtAdView;->notifyLaunchActivity()V
				 /* .line 26 */
			 } // :cond_0
			 (( android.content.Context ) p1 ).startActivity ( v1 ); // invoke-virtual {p1, v1}, Landroid/content/Context;->startActivity(Landroid/content/Intent;)V
			 /* :try_end_0 */
			 /* .catch Landroid/content/ActivityNotFoundException; {:try_start_0 ..:try_end_0} :catch_0 */
			 /* .line 31 */
		 } // :goto_0
		 return;
		 /* .line 27 */
		 /* :catch_0 */
		 /* move-exception v0 */
		 /* .line 28 */
		 /* .local v0, "e":Landroid/content/ActivityNotFoundException; */
		 final String v3 = "JtAd"; // const-string v3, "JtAd"
		 final String v4 = "cannot initiate video"; // const-string v4, "cannot initiate video"
		 android.util.Log .e ( v3,v4,v0 );
	 } // .end method
