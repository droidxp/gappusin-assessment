class inal extends android.webkit.WebViewClient {
	 /* .source "AdMobWebView.java" */
	 /* # annotations */
	 /* .annotation system Ldalvik/annotation/EnclosingClass; */
	 /* value = Lcom/admob/android/ads/view/AdMobWebView; */
} // .end annotation
/* .annotation system Ldalvik/annotation/InnerClass; */
/* accessFlags = 0x2 */
/* name = "a" */
} // .end annotation
/* # instance fields */
private com.admob.android.ads.view.AdMobWebView a;
private com.admob.android.ads.view.AdMobWebView b; //synthetic
/* # direct methods */
public inal ( ) {
/* .locals 0 */
/* .prologue */
/* .line 129 */
this.b = p1;
/* invoke-direct {p0}, Landroid/webkit/WebViewClient;-><init>()V */
/* .line 130 */
this.a = p2;
/* .line 131 */
return;
} // .end method
private static java.util.Hashtable a ( java.lang.String p0 ) {
/* .locals 5 */
/* .annotation system Ldalvik/annotation/Signature; */
/* value = { */
/* "(", */
/* "Ljava/lang/String;", */
/* ")", */
/* "Ljava/util/Hashtable", */
/* "<", */
/* "Ljava/lang/String;", */
/* "Ljava/lang/String;", */
/* ">;" */
/* } */
} // .end annotation
/* .prologue */
/* .line 187 */
int v0 = 0; // const/4 v0, 0x0
/* .line 189 */
if ( p0 != null) { // if-eqz p0, :cond_1
/* .line 191 */
/* new-instance v0, Ljava/util/Hashtable; */
/* invoke-direct {v0}, Ljava/util/Hashtable;-><init>()V */
/* .line 192 */
/* new-instance v1, Ljava/util/StringTokenizer; */
final String v2 = "&"; // const-string v2, "&"
/* invoke-direct {v1, p0, v2}, Ljava/util/StringTokenizer;-><init>(Ljava/lang/String;Ljava/lang/String;)V */
/* .line 193 */
} // :cond_0
} // :goto_0
v2 = (( java.util.StringTokenizer ) v1 ).hasMoreTokens ( ); // invoke-virtual {v1}, Ljava/util/StringTokenizer;->hasMoreTokens()Z
if ( v2 != null) { // if-eqz v2, :cond_1
/* .line 195 */
(( java.util.StringTokenizer ) v1 ).nextToken ( ); // invoke-virtual {v1}, Ljava/util/StringTokenizer;->nextToken()Ljava/lang/String;
/* .line 196 */
/* new-instance v3, Ljava/util/StringTokenizer; */
final String v4 = "="; // const-string v4, "="
/* invoke-direct {v3, v2, v4}, Ljava/util/StringTokenizer;-><init>(Ljava/lang/String;Ljava/lang/String;)V */
/* .line 198 */
v2 = (( java.util.StringTokenizer ) v3 ).hasMoreTokens ( ); // invoke-virtual {v3}, Ljava/util/StringTokenizer;->hasMoreTokens()Z
if ( v2 != null) { // if-eqz v2, :cond_0
/* .line 200 */
(( java.util.StringTokenizer ) v3 ).nextToken ( ); // invoke-virtual {v3}, Ljava/util/StringTokenizer;->nextToken()Ljava/lang/String;
/* .line 201 */
v4 = (( java.util.StringTokenizer ) v3 ).hasMoreTokens ( ); // invoke-virtual {v3}, Ljava/util/StringTokenizer;->hasMoreTokens()Z
if ( v4 != null) { // if-eqz v4, :cond_0
	 /* .line 203 */
	 (( java.util.StringTokenizer ) v3 ).nextToken ( ); // invoke-virtual {v3}, Ljava/util/StringTokenizer;->nextToken()Ljava/lang/String;
	 /* .line 205 */
	 if ( v2 != null) { // if-eqz v2, :cond_0
		 if ( v3 != null) { // if-eqz v3, :cond_0
			 /* .line 207 */
			 (( java.util.Hashtable ) v0 ).put ( v2, v3 ); // invoke-virtual {v0, v2, v3}, Ljava/util/Hashtable;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
			 /* .line 214 */
		 } // :cond_1
	 } // .end method
	 /* # virtual methods */
	 public final void onPageFinished ( android.webkit.WebView p0, java.lang.String p1 ) {
		 /* .locals 3 */
		 /* .prologue */
		 /* .line 222 */
		 final String v0 = "http://mm.admob.com/static/android/canvas.html"; // const-string v0, "http://mm.admob.com/static/android/canvas.html"
		 v0 = 		 (( java.lang.String ) v0 ).equals ( p2 ); // invoke-virtual {v0, p2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
		 if ( v0 != null) { // if-eqz v0, :cond_0
			 v0 = this.a;
			 /* iget-boolean v0, v0, Lcom/admob/android/ads/view/AdMobWebView;->c:Z */
			 if ( v0 != null) { // if-eqz v0, :cond_0
				 /* .line 224 */
				 /* new-instance v0, Ljava/lang/StringBuilder; */
				 /* invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V */
				 /* .line 225 */
				 final String v1 = "javascript:cb(\'"; // const-string v1, "javascript:cb(\'"
				 (( java.lang.StringBuilder ) v0 ).append ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
				 /* .line 226 */
				 v1 = this.b;
				 v1 = this.b;
				 (( java.lang.StringBuilder ) v0 ).append ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
				 /* .line 227 */
				 final String v1 = "\',\'"; // const-string v1, "\',\'"
				 (( java.lang.StringBuilder ) v0 ).append ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
				 /* .line 228 */
				 v1 = this.b;
				 v1 = this.a;
				 (( java.lang.StringBuilder ) v0 ).append ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
				 /* .line 229 */
				 final String v1 = "\')"; // const-string v1, "\')"
				 (( java.lang.StringBuilder ) v0 ).append ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
				 /* .line 231 */
				 v1 = this.a;
				 int v2 = 0; // const/4 v2, 0x0
				 /* iput-boolean v2, v1, Lcom/admob/android/ads/view/AdMobWebView;->c:Z */
				 /* .line 232 */
				 v1 = this.a;
				 (( java.lang.StringBuilder ) v0 ).toString ( ); // invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
				 (( com.admob.android.ads.view.AdMobWebView ) v1 ).loadUrl ( v0 ); // invoke-virtual {v1, v0}, Lcom/admob/android/ads/view/AdMobWebView;->loadUrl(Ljava/lang/String;)V
				 /* .line 234 */
			 } // :cond_0
			 return;
		 } // .end method
		 public final Boolean shouldOverrideUrlLoading ( android.webkit.WebView p0, java.lang.String p1 ) {
			 /* .locals 5 */
			 /* .prologue */
			 int v4 = 1; // const/4 v4, 0x1
			 /* .line 138 */
			 try { // :try_start_0
				 /* new-instance v0, Ljava/net/URI; */
				 /* invoke-direct {v0, p2}, Ljava/net/URI;-><init>(Ljava/lang/String;)V */
				 /* .line 140 */
				 (( java.net.URI ) v0 ).getScheme ( ); // invoke-virtual {v0}, Ljava/net/URI;->getScheme()Ljava/lang/String;
				 /* .line 142 */
				 final String v2 = "admob"; // const-string v2, "admob"
				 v1 = 				 (( java.lang.String ) v2 ).equals ( v1 ); // invoke-virtual {v2, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
				 if ( v1 != null) { // if-eqz v1, :cond_1
					 /* .line 145 */
					 (( java.net.URI ) v0 ).getHost ( ); // invoke-virtual {v0}, Ljava/net/URI;->getHost()Ljava/lang/String;
					 /* .line 146 */
					 final String v2 = "launch"; // const-string v2, "launch"
					 v2 = 					 (( java.lang.String ) v2 ).equals ( v1 ); // invoke-virtual {v2, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
					 if ( v2 != null) { // if-eqz v2, :cond_0
						 /* .line 148 */
						 (( java.net.URI ) v0 ).getQuery ( ); // invoke-virtual {v0}, Ljava/net/URI;->getQuery()Ljava/lang/String;
						 /* .line 149 */
						 if ( v0 != null) { // if-eqz v0, :cond_1
							 /* .line 151 */
							 com.admob.android.ads.view.AdMobWebView$a .a ( v0 );
							 /* .line 152 */
							 if ( v0 != null) { // if-eqz v0, :cond_1
								 /* .line 154 */
								 final String v1 = "url"; // const-string v1, "url"
								 (( java.util.Hashtable ) v0 ).get ( v1 ); // invoke-virtual {v0, v1}, Ljava/util/Hashtable;->get(Ljava/lang/Object;)Ljava/lang/Object;
								 /* check-cast v0, Ljava/lang/String; */
								 /* .line 155 */
								 if ( v0 != null) { // if-eqz v0, :cond_1
									 /* .line 157 */
									 v1 = this.b;
									 (( com.admob.android.ads.view.AdMobWebView ) v1 ).getContext ( ); // invoke-virtual {v1}, Lcom/admob/android/ads/view/AdMobWebView;->getContext()Landroid/content/Context;
									 /* .line 158 */
									 /* new-instance v2, Landroid/content/Intent; */
									 final String v3 = "android.intent.action.VIEW"; // const-string v3, "android.intent.action.VIEW"
									 android.net.Uri .parse ( v0 );
									 /* invoke-direct {v2, v3, v0}, Landroid/content/Intent;-><init>(Ljava/lang/String;Landroid/net/Uri;)V */
									 (( android.content.Context ) v1 ).startActivity ( v2 ); // invoke-virtual {v1, v2}, Landroid/content/Context;->startActivity(Landroid/content/Intent;)V
									 /* .line 159 */
									 v0 = this.a;
									 com.admob.android.ads.view.AdMobWebView .a ( v0 );
									 /* move v0, v4 */
									 /* .line 182 */
								 } // :goto_0
								 /* .line 165 */
							 } // :cond_0
							 final String v0 = "closecanvas"; // const-string v0, "closecanvas"
							 v0 = 							 (( java.lang.String ) v0 ).equals ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
							 if ( v0 != null) { // if-eqz v0, :cond_1
								 /* .line 168 */
								 v0 = this.a;
								 /* if-ne p1, v0, :cond_1 */
								 /* .line 170 */
								 v0 = this.a;
								 com.admob.android.ads.view.AdMobWebView .a ( v0 );
								 /* :try_end_0 */
								 /* .catch Ljava/net/URISyntaxException; {:try_start_0 ..:try_end_0} :catch_0 */
								 /* move v0, v4 */
								 /* .line 171 */
								 /* .line 176 */
								 /* :catch_0 */
								 /* move-exception v0 */
								 /* .line 178 */
								 final String v1 = "AdMobSDK"; // const-string v1, "AdMobSDK"
								 final String v2 = "Bad link URL in AdMob web view."; // const-string v2, "Bad link URL in AdMob web view."
								 android.util.Log .w ( v1,v2,v0 );
								 /* .line 182 */
							 } // :cond_1
							 int v0 = 0; // const/4 v0, 0x0
						 } // .end method
