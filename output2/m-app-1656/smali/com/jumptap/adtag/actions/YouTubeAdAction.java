public class com.jumptap.adtag.actions.YouTubeAdAction extends com.jumptap.adtag.actions.AdAction {
	 /* .source "YouTubeAdAction.java" */
	 /* # static fields */
	 private static final java.lang.String CLASS_NAME1;
	 private static final java.lang.String CLASS_NAME2;
	 private static final java.lang.String PACKAGE_NAME;
	 /* # direct methods */
	 public com.jumptap.adtag.actions.YouTubeAdAction ( ) {
		 /* .locals 0 */
		 /* .prologue */
		 /* .line 13 */
		 /* invoke-direct {p0}, Lcom/jumptap/adtag/actions/AdAction;-><init>()V */
		 return;
	 } // .end method
	 private void openYoutubePlayer ( android.content.Context p0, android.net.Uri p1, java.lang.String p2 ) {
		 /* .locals 3 */
		 /* .param p1, "context" # Landroid/content/Context; */
		 /* .param p2, "uri" # Landroid/net/Uri; */
		 /* .param p3, "className" # Ljava/lang/String; */
		 /* .prologue */
		 /* .line 64 */
		 /* new-instance v0, Landroid/content/Intent; */
		 final String v1 = "android.intent.action.VIEW"; // const-string v1, "android.intent.action.VIEW"
		 /* invoke-direct {v0, v1, p2}, Landroid/content/Intent;-><init>(Ljava/lang/String;Landroid/net/Uri;)V */
		 /* .line 65 */
		 /* .local v0, "myIntent":Landroid/content/Intent; */
		 /* new-instance v1, Landroid/content/ComponentName; */
		 final String v2 = "com.google.android.youtube"; // const-string v2, "com.google.android.youtube"
		 /* invoke-direct {v1, v2, p3}, Landroid/content/ComponentName;-><init>(Ljava/lang/String;Ljava/lang/String;)V */
		 (( android.content.Intent ) v0 ).setComponent ( v1 ); // invoke-virtual {v0, v1}, Landroid/content/Intent;->setComponent(Landroid/content/ComponentName;)Landroid/content/Intent;
		 /* .line 66 */
		 /* const/high16 v1, 0x10000000 */
		 (( android.content.Intent ) v0 ).setFlags ( v1 ); // invoke-virtual {v0, v1}, Landroid/content/Intent;->setFlags(I)Landroid/content/Intent;
		 /* .line 68 */
		 (( android.content.Context ) p1 ).startActivity ( v0 ); // invoke-virtual {p1, v0}, Landroid/content/Context;->startActivity(Landroid/content/Intent;)V
		 /* .line 70 */
		 return;
	 } // .end method
	 /* # virtual methods */
	 public void perform ( android.content.Context p0, com.jumptap.adtag.JtAdView p1 ) {
		 /* .locals 7 */
		 /* .param p1, "context" # Landroid/content/Context; */
		 /* .param p2, "widget" # Lcom/jumptap/adtag/JtAdView; */
		 /* .prologue */
		 /* .line 21 */
		 final String v4 = "JtAd"; // const-string v4, "JtAd"
		 /* new-instance v5, Ljava/lang/StringBuilder; */
		 /* invoke-direct {v5}, Ljava/lang/StringBuilder;-><init>()V */
		 final String v6 = "Performing YouTubeAdAction:"; // const-string v6, "Performing YouTubeAdAction:"
		 (( java.lang.StringBuilder ) v5 ).append ( v6 ); // invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
		 v6 = this.redirectedUrl;
		 (( java.lang.StringBuilder ) v5 ).append ( v6 ); // invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
		 (( java.lang.StringBuilder ) v5 ).toString ( ); // invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
		 android.util.Log .i ( v4,v5 );
		 /* .line 22 */
		 v4 = this.redirectedUrl;
		 android.net.Uri .parse ( v4 );
		 /* .line 23 */
		 /* .local v3, "uri":Landroid/net/Uri; */
		 if ( p2 != null) { // if-eqz p2, :cond_0
			 /* .line 24 */
			 int v4 = 1; // const/4 v4, 0x1
			 (( com.jumptap.adtag.JtAdView ) p2 ).setLaunchedActivity ( v4 ); // invoke-virtual {p2, v4}, Lcom/jumptap/adtag/JtAdView;->setLaunchedActivity(Z)V
			 /* .line 25 */
			 (( com.jumptap.adtag.JtAdView ) p2 ).notifyLaunchActivity ( ); // invoke-virtual {p2}, Lcom/jumptap/adtag/JtAdView;->notifyLaunchActivity()V
			 /* .line 28 */
		 } // :cond_0
		 try { // :try_start_0
			 final String v4 = "com.google.android.youtube.PlayerActivity"; // const-string v4, "com.google.android.youtube.PlayerActivity"
			 /* invoke-direct {p0, p1, v3, v4}, Lcom/jumptap/adtag/actions/YouTubeAdAction;->openYoutubePlayer(Landroid/content/Context;Landroid/net/Uri;Ljava/lang/String;)V */
			 /* :try_end_0 */
			 /* .catch Landroid/content/ActivityNotFoundException; {:try_start_0 ..:try_end_0} :catch_0 */
			 /* .line 45 */
		 } // :goto_0
		 return;
		 /* .line 30 */
		 /* :catch_0 */
		 /* move-exception v0 */
		 /* .line 31 */
		 /* .local v0, "e1":Landroid/content/ActivityNotFoundException; */
		 final String v4 = "JtAd"; // const-string v4, "JtAd"
		 final String v5 = "cannot start activity: com.google.android.youtube.PlayerActivity"; // const-string v5, "cannot start activity: com.google.android.youtube.PlayerActivity"
		 android.util.Log .e ( v4,v5 );
		 /* .line 32 */
		 final String v4 = "JtAd"; // const-string v4, "JtAd"
		 (( android.content.ActivityNotFoundException ) v0 ).getMessage ( ); // invoke-virtual {v0}, Landroid/content/ActivityNotFoundException;->getMessage()Ljava/lang/String;
		 android.util.Log .e ( v4,v5 );
		 /* .line 34 */
		 try { // :try_start_1
			 final String v4 = "com.google.android.youtube.YouTubePlayer"; // const-string v4, "com.google.android.youtube.YouTubePlayer"
			 /* invoke-direct {p0, p1, v3, v4}, Lcom/jumptap/adtag/actions/YouTubeAdAction;->openYoutubePlayer(Landroid/content/Context;Landroid/net/Uri;Ljava/lang/String;)V */
			 /* :try_end_1 */
			 /* .catch Landroid/content/ActivityNotFoundException; {:try_start_1 ..:try_end_1} :catch_1 */
			 /* .line 36 */
			 /* :catch_1 */
			 /* move-exception v1 */
			 /* .line 37 */
			 /* .local v1, "e2":Landroid/content/ActivityNotFoundException; */
			 final String v4 = "JtAd"; // const-string v4, "JtAd"
			 final String v5 = "cannot start activity: com.google.android.youtube.YouTubePlayer"; // const-string v5, "cannot start activity: com.google.android.youtube.YouTubePlayer"
			 android.util.Log .e ( v4,v5 );
			 /* .line 38 */
			 final String v4 = "JtAd"; // const-string v4, "JtAd"
			 (( android.content.ActivityNotFoundException ) v1 ).getMessage ( ); // invoke-virtual {v1}, Landroid/content/ActivityNotFoundException;->getMessage()Ljava/lang/String;
			 android.util.Log .e ( v4,v5 );
			 /* .line 41 */
			 /* new-instance v2, Landroid/content/Intent; */
			 final String v4 = "android.intent.action.VIEW"; // const-string v4, "android.intent.action.VIEW"
			 /* invoke-direct {v2, v4, v3}, Landroid/content/Intent;-><init>(Ljava/lang/String;Landroid/net/Uri;)V */
			 /* .line 42 */
			 /* .local v2, "myIntent":Landroid/content/Intent; */
			 (( android.content.Context ) p1 ).startActivity ( v2 ); // invoke-virtual {p1, v2}, Landroid/content/Context;->startActivity(Landroid/content/Intent;)V
		 } // .end method
