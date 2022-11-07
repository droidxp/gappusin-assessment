public class com.google.ads.u implements com.google.ads.n {
	 /* .source "SourceFile" */
	 /* # interfaces */
	 /* # direct methods */
	 public com.google.ads.u ( ) {
		 /* .locals 0 */
		 /* .prologue */
		 /* .line 19 */
		 /* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
		 return;
	 } // .end method
	 /* # virtual methods */
	 public void a ( Object p0, java.util.HashMap p1, android.webkit.WebView p2 ) {
		 /* .locals 6 */
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
	 /* .line 28 */
	 final String v0 = "url"; // const-string v0, "url"
	 (( java.util.HashMap ) p2 ).get ( v0 ); // invoke-virtual {p2, v0}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;
	 /* check-cast v0, Ljava/lang/String; */
	 /* .line 29 */
	 final String v1 = "type"; // const-string v1, "type"
	 (( java.util.HashMap ) p2 ).get ( v1 ); // invoke-virtual {p2, v1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;
	 /* check-cast v1, Ljava/lang/String; */
	 /* .line 30 */
	 final String v2 = "afma_notify_dt"; // const-string v2, "afma_notify_dt"
	 (( java.util.HashMap ) p2 ).get ( v2 ); // invoke-virtual {p2, v2}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;
	 /* check-cast v2, Ljava/lang/String; */
	 /* .line 31 */
	 final String v3 = "1"; // const-string v3, "1"
	 final String v4 = "drt_include"; // const-string v4, "drt_include"
	 (( java.util.HashMap ) p2 ).get ( v4 ); // invoke-virtual {p2, v4}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;
	 v3 = 	 (( java.lang.String ) v3 ).equals ( v4 ); // invoke-virtual {v3, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
	 /* .line 33 */
	 /* new-instance v4, Ljava/lang/StringBuilder; */
	 /* invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V */
	 final String v5 = "Received ad url: <url: \""; // const-string v5, "Received ad url: <url: \""
	 (( java.lang.StringBuilder ) v4 ).append ( v5 ); // invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
	 (( java.lang.StringBuilder ) v4 ).append ( v0 ); // invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
	 final String v5 = "\" type: \""; // const-string v5, "\" type: \""
	 (( java.lang.StringBuilder ) v4 ).append ( v5 ); // invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
	 (( java.lang.StringBuilder ) v4 ).append ( v1 ); // invoke-virtual {v4, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
	 final String v4 = "\" afmaNotifyDt: \""; // const-string v4, "\" afmaNotifyDt: \""
	 (( java.lang.StringBuilder ) v1 ).append ( v4 ); // invoke-virtual {v1, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
	 (( java.lang.StringBuilder ) v1 ).append ( v2 ); // invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
	 final String v2 = "\">"; // const-string v2, "\">"
	 (( java.lang.StringBuilder ) v1 ).append ( v2 ); // invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
	 (( java.lang.StringBuilder ) v1 ).toString ( ); // invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
	 com.google.ads.util.b .c ( v1 );
	 /* .line 40 */
	 (( com.google.ads.internal.d ) p1 ).i ( ); // invoke-virtual {p1}, Lcom/google/ads/internal/d;->i()Lcom/google/ads/internal/c;
	 /* .line 41 */
	 if ( v1 != null) { // if-eqz v1, :cond_0
		 /* .line 42 */
		 (( com.google.ads.internal.c ) v1 ).c ( v3 ); // invoke-virtual {v1, v3}, Lcom/google/ads/internal/c;->c(Z)V
		 /* .line 43 */
		 (( com.google.ads.internal.c ) v1 ).d ( v0 ); // invoke-virtual {v1, v0}, Lcom/google/ads/internal/c;->d(Ljava/lang/String;)V
		 /* .line 45 */
	 } // :cond_0
	 return;
} // .end method
