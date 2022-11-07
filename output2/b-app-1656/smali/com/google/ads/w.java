public class com.google.ads.w implements com.google.ads.n {
	 /* .source "SourceFile" */
	 /* # interfaces */
	 /* # direct methods */
	 public com.google.ads.w ( ) {
		 /* .locals 0 */
		 /* .prologue */
		 /* .line 18 */
		 /* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
		 return;
	 } // .end method
	 /* # virtual methods */
	 public void a ( Object p0, java.util.HashMap p1, android.webkit.WebView p2 ) {
		 /* .locals 4 */
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
	 /* .line 27 */
	 final String v0 = "string"; // const-string v0, "string"
	 (( java.util.HashMap ) p2 ).get ( v0 ); // invoke-virtual {p2, v0}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;
	 /* check-cast v0, Ljava/lang/String; */
	 /* .line 28 */
	 final String v1 = "afma_notify_dt"; // const-string v1, "afma_notify_dt"
	 (( java.util.HashMap ) p2 ).get ( v1 ); // invoke-virtual {p2, v1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;
	 /* check-cast v1, Ljava/lang/String; */
	 /* .line 30 */
	 /* new-instance v2, Ljava/lang/StringBuilder; */
	 /* invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V */
	 final String v3 = "Received log message: <\"string\": \""; // const-string v3, "Received log message: <\"string\": \""
	 (( java.lang.StringBuilder ) v2 ).append ( v3 ); // invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
	 (( java.lang.StringBuilder ) v2 ).append ( v0 ); // invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
	 final String v2 = "\", \"afmaNotifyDt\": \""; // const-string v2, "\", \"afmaNotifyDt\": \""
	 (( java.lang.StringBuilder ) v0 ).append ( v2 ); // invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
	 (( java.lang.StringBuilder ) v0 ).append ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
	 final String v1 = "\">"; // const-string v1, "\">"
	 (( java.lang.StringBuilder ) v0 ).append ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
	 (( java.lang.StringBuilder ) v0 ).toString ( ); // invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
	 com.google.ads.util.b .c ( v0 );
	 /* .line 32 */
	 return;
} // .end method
