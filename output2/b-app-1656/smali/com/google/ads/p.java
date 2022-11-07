public class com.google.ads.p extends com.google.ads.s {
	 /* .source "SourceFile" */
	 /* # direct methods */
	 public com.google.ads.p ( ) {
		 /* .locals 0 */
		 /* .prologue */
		 /* .line 20 */
		 /* invoke-direct {p0}, Lcom/google/ads/s;-><init>()V */
		 return;
	 } // .end method
	 /* # virtual methods */
	 public void a ( Object p0, java.util.HashMap p1, android.webkit.WebView p2 ) {
		 /* .locals 5 */
		 /* .annotation system Ldalvik/annotation/Signature; */
		 /* value = { */
		 /* "(", */
		 /* "Lcom/google/ads/internal/d;", */
		 /* "Ljava/util/HashMap", */
		 /* "<", */
		 /* "Ljava/lang/String;", */
		 /* "Ljava/lang/String;", */
		 /* ">;", */
		 /* "Landroid/webkit/WebView;", */
		 /* ")V" */
		 /* } */
	 } // .end annotation
	 /* .prologue */
	 /* .line 29 */
	 final String v0 = "u"; // const-string v0, "u"
	 (( java.util.HashMap ) p2 ).get ( v0 ); // invoke-virtual {p2, v0}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;
	 /* check-cast v0, Ljava/lang/String; */
	 /* .line 30 */
	 /* if-nez v0, :cond_0 */
	 /* .line 31 */
	 final String v0 = "Could not get URL from click gmsg."; // const-string v0, "Could not get URL from click gmsg."
	 com.google.ads.util.b .e ( v0 );
	 /* .line 58 */
} // :goto_0
return;
/* .line 36 */
} // :cond_0
(( com.google.ads.internal.d ) p1 ).l ( ); // invoke-virtual {p1}, Lcom/google/ads/internal/d;->l()Lcom/google/ads/internal/g;
/* .line 37 */
if ( v1 != null) { // if-eqz v1, :cond_2
/* .line 38 */
android.net.Uri .parse ( v0 );
/* .line 39 */
(( android.net.Uri ) v2 ).getHost ( ); // invoke-virtual {v2}, Landroid/net/Uri;->getHost()Ljava/lang/String;
/* .line 40 */
if ( v0 != null) { // if-eqz v0, :cond_2
	 v3 = java.util.Locale.US;
	 (( java.lang.String ) v0 ).toLowerCase ( v3 ); // invoke-virtual {v0, v3}, Ljava/lang/String;->toLowerCase(Ljava/util/Locale;)Ljava/lang/String;
	 final String v3 = ".admob.com"; // const-string v3, ".admob.com"
	 v0 = 	 (( java.lang.String ) v0 ).endsWith ( v3 ); // invoke-virtual {v0, v3}, Ljava/lang/String;->endsWith(Ljava/lang/String;)Z
	 if ( v0 != null) { // if-eqz v0, :cond_2
		 /* .line 41 */
		 int v0 = 0; // const/4 v0, 0x0
		 /* .line 42 */
		 (( android.net.Uri ) v2 ).getPath ( ); // invoke-virtual {v2}, Landroid/net/Uri;->getPath()Ljava/lang/String;
		 /* .line 43 */
		 if ( v2 != null) { // if-eqz v2, :cond_1
			 /* .line 48 */
			 final String v3 = "/"; // const-string v3, "/"
			 (( java.lang.String ) v2 ).split ( v3 ); // invoke-virtual {v2, v3}, Ljava/lang/String;->split(Ljava/lang/String;)[Ljava/lang/String;
			 /* .line 49 */
			 /* array-length v3, v2 */
			 int v4 = 4; // const/4 v4, 0x4
			 /* if-lt v3, v4, :cond_1 */
			 /* .line 50 */
			 /* new-instance v0, Ljava/lang/StringBuilder; */
			 /* invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V */
			 int v3 = 2; // const/4 v3, 0x2
			 /* aget-object v3, v2, v3 */
			 (( java.lang.StringBuilder ) v0 ).append ( v3 ); // invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
			 final String v3 = "/"; // const-string v3, "/"
			 (( java.lang.StringBuilder ) v0 ).append ( v3 ); // invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
			 int v3 = 3; // const/4 v3, 0x3
			 /* aget-object v2, v2, v3 */
			 (( java.lang.StringBuilder ) v0 ).append ( v2 ); // invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
			 (( java.lang.StringBuilder ) v0 ).toString ( ); // invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
			 /* .line 53 */
		 } // :cond_1
		 (( com.google.ads.internal.g ) v1 ).b ( v0 ); // invoke-virtual {v1, v0}, Lcom/google/ads/internal/g;->b(Ljava/lang/String;)V
		 /* .line 57 */
	 } // :cond_2
	 /* invoke-super {p0, p1, p2, p3}, Lcom/google/ads/s;->a(Lcom/google/ads/internal/d;Ljava/util/HashMap;Landroid/webkit/WebView;)V */
} // .end method
