public class com.jumptap.adtag.actions.CallAdAction extends com.jumptap.adtag.actions.AdAction {
	 /* .source "CallAdAction.java" */
	 /* # direct methods */
	 public com.jumptap.adtag.actions.CallAdAction ( ) {
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
		 final String v4 = "Performing CallAdAction: "; // const-string v4, "Performing CallAdAction: "
		 (( java.lang.StringBuilder ) v3 ).append ( v4 ); // invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
		 v4 = this.redirectedUrl;
		 (( java.lang.StringBuilder ) v3 ).append ( v4 ); // invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
		 (( java.lang.StringBuilder ) v3 ).toString ( ); // invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
		 android.util.Log .i ( v2,v3 );
		 /* .line 17 */
		 v2 = this.redirectedUrl;
		 if ( v2 != null) { // if-eqz v2, :cond_1
			 /* .line 25 */
			 v2 = this.redirectedUrl;
			 v3 = this.useragent;
			 /* new-instance v4, Lcom/jumptap/adtag/actions/CallAdAction$1callTester; */
			 /* invoke-direct {v4, p0}, Lcom/jumptap/adtag/actions/CallAdAction$1callTester;-><init>(Lcom/jumptap/adtag/actions/CallAdAction;)V */
			 com.jumptap.adtag.actions.CallAdAction .getRedirectedUrlWithPredicate ( v2,v3,v4 );
			 this.redirectedUrl = v2;
			 /* .line 27 */
			 v2 = this.redirectedUrl;
			 if ( v2 != null) { // if-eqz v2, :cond_2
				 /* .line 29 */
				 if ( p2 != null) { // if-eqz p2, :cond_0
					 /* .line 30 */
					 int v2 = 1; // const/4 v2, 0x1
					 try { // :try_start_0
						 (( com.jumptap.adtag.JtAdView ) p2 ).setLaunchedActivity ( v2 ); // invoke-virtual {p2, v2}, Lcom/jumptap/adtag/JtAdView;->setLaunchedActivity(Z)V
						 /* .line 31 */
						 (( com.jumptap.adtag.JtAdView ) p2 ).notifyLaunchActivity ( ); // invoke-virtual {p2}, Lcom/jumptap/adtag/JtAdView;->notifyLaunchActivity()V
						 /* .line 33 */
					 } // :cond_0
					 /* new-instance v1, Landroid/content/Intent; */
					 final String v2 = "android.intent.action.DIAL"; // const-string v2, "android.intent.action.DIAL"
					 v3 = this.redirectedUrl;
					 android.net.Uri .parse ( v3 );
					 /* invoke-direct {v1, v2, v3}, Landroid/content/Intent;-><init>(Ljava/lang/String;Landroid/net/Uri;)V */
					 /* .line 34 */
					 /* .local v1, "myIntent":Landroid/content/Intent; */
					 (( android.content.Context ) p1 ).startActivity ( v1 ); // invoke-virtual {p1, v1}, Landroid/content/Context;->startActivity(Landroid/content/Intent;)V
					 /* :try_end_0 */
					 /* .catch Landroid/content/ActivityNotFoundException; {:try_start_0 ..:try_end_0} :catch_0 */
					 /* .line 42 */
				 } // .end local v1 # "myIntent":Landroid/content/Intent;
			 } // :cond_1
		 } // :goto_0
		 return;
		 /* .line 35 */
		 /* :catch_0 */
		 /* move-exception v0 */
		 /* .line 36 */
		 /* .local v0, "e":Landroid/content/ActivityNotFoundException; */
		 final String v2 = "JtAd"; // const-string v2, "JtAd"
		 /* new-instance v3, Ljava/lang/StringBuilder; */
		 /* invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V */
		 final String v4 = "cannot initiate phone call:url="; // const-string v4, "cannot initiate phone call:url="
		 (( java.lang.StringBuilder ) v3 ).append ( v4 ); // invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
		 v4 = this.redirectedUrl;
		 (( java.lang.StringBuilder ) v3 ).append ( v4 ); // invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
		 (( java.lang.StringBuilder ) v3 ).toString ( ); // invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
		 android.util.Log .e ( v2,v3,v0 );
		 /* .line 39 */
	 } // .end local v0 # "e":Landroid/content/ActivityNotFoundException;
} // :cond_2
final String v2 = "JtAd"; // const-string v2, "JtAd"
final String v3 = "no tel url to dial"; // const-string v3, "no tel url to dial"
android.util.Log .i ( v2,v3 );
} // .end method
