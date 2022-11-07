class com.google.ads.internal.AdWebView$1 implements android.webkit.DownloadListener {
	 /* .source "SourceFile" */
	 /* # interfaces */
	 /* # annotations */
	 /* .annotation system Ldalvik/annotation/EnclosingMethod; */
	 /* value = Lcom/google/ads/internal/AdWebView;-><init>(Lcom/google/ads/m;Lcom/google/ads/AdSize;)V */
} // .end annotation
/* .annotation system Ldalvik/annotation/InnerClass; */
/* accessFlags = 0x0 */
/* name = null */
} // .end annotation
/* # instance fields */
final com.google.ads.internal.AdWebView a; //synthetic
/* # direct methods */
 com.google.ads.internal.AdWebView$1 ( ) {
/* .locals 0 */
/* .prologue */
/* .line 97 */
this.a = p1;
/* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
return;
} // .end method
/* # virtual methods */
public void onDownloadStart ( java.lang.String p0, java.lang.String p1, java.lang.String p2, java.lang.String p3, Long p4 ) {
/* .locals 3 */
/* .param p1, "url" # Ljava/lang/String; */
/* .param p2, "userAgent" # Ljava/lang/String; */
/* .param p3, "contentDisposition" # Ljava/lang/String; */
/* .param p4, "mimeType" # Ljava/lang/String; */
/* .param p5, "size" # J */
/* .prologue */
/* .line 102 */
try { // :try_start_0
	 /* new-instance v0, Landroid/content/Intent; */
	 final String v1 = "android.intent.action.VIEW"; // const-string v1, "android.intent.action.VIEW"
	 /* invoke-direct {v0, v1}, Landroid/content/Intent;-><init>(Ljava/lang/String;)V */
	 /* .line 103 */
	 android.net.Uri .parse ( p1 );
	 (( android.content.Intent ) v0 ).setDataAndType ( v1, p4 ); // invoke-virtual {v0, v1, p4}, Landroid/content/Intent;->setDataAndType(Landroid/net/Uri;Ljava/lang/String;)Landroid/content/Intent;
	 /* .line 104 */
	 v1 = this.a;
	 (( com.google.ads.internal.AdWebView ) v1 ).d ( ); // invoke-virtual {v1}, Lcom/google/ads/internal/AdWebView;->d()Lcom/google/ads/AdActivity;
	 /* .line 105 */
	 if ( v1 != null) { // if-eqz v1, :cond_0
		 v2 = 		 com.google.ads.util.AdUtil .a ( v0,v1 );
		 if ( v2 != null) { // if-eqz v2, :cond_0
			 /* .line 106 */
			 (( android.app.Activity ) v1 ).startActivity ( v0 ); // invoke-virtual {v1, v0}, Landroid/app/Activity;->startActivity(Landroid/content/Intent;)V
			 /* :try_end_0 */
			 /* .catch Landroid/content/ActivityNotFoundException; {:try_start_0 ..:try_end_0} :catch_0 */
			 /* .catch Ljava/lang/Throwable; {:try_start_0 ..:try_end_0} :catch_1 */
			 /* .line 113 */
		 } // :cond_0
	 } // :goto_0
	 return;
	 /* .line 108 */
	 /* :catch_0 */
	 /* move-exception v0 */
	 /* .line 109 */
	 /* new-instance v0, Ljava/lang/StringBuilder; */
	 /* invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V */
	 final String v1 = "Couldn\'t find an Activity to view url/mimetype: "; // const-string v1, "Couldn\'t find an Activity to view url/mimetype: "
	 (( java.lang.StringBuilder ) v0 ).append ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
	 (( java.lang.StringBuilder ) v0 ).append ( p1 ); // invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
	 final String v1 = " / "; // const-string v1, " / "
	 (( java.lang.StringBuilder ) v0 ).append ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
	 (( java.lang.StringBuilder ) v0 ).append ( p4 ); // invoke-virtual {v0, p4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
	 (( java.lang.StringBuilder ) v0 ).toString ( ); // invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
	 com.google.ads.util.b .a ( v0 );
	 /* .line 110 */
	 /* :catch_1 */
	 /* move-exception v0 */
	 /* .line 111 */
	 /* new-instance v1, Ljava/lang/StringBuilder; */
	 /* invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V */
	 final String v2 = "Unknown error trying to start activity to view URL: "; // const-string v2, "Unknown error trying to start activity to view URL: "
	 (( java.lang.StringBuilder ) v1 ).append ( v2 ); // invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
	 (( java.lang.StringBuilder ) v1 ).append ( p1 ); // invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
	 (( java.lang.StringBuilder ) v1 ).toString ( ); // invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
	 com.google.ads.util.b .b ( v1,v0 );
} // .end method
