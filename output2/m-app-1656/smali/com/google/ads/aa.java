public class com.google.ads.aa implements java.lang.Runnable {
	 /* .source "SourceFile" */
	 /* # interfaces */
	 /* # instance fields */
	 private android.content.Context a;
	 private java.lang.String b;
	 /* # direct methods */
	 public com.google.ads.aa ( ) {
		 /* .locals 0 */
		 /* .prologue */
		 /* .line 32 */
		 /* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
		 /* .line 33 */
		 this.b = p1;
		 /* .line 34 */
		 this.a = p2;
		 /* .line 35 */
		 return;
	 } // .end method
	 /* # virtual methods */
	 protected java.net.HttpURLConnection a ( java.net.URL p0 ) {
		 /* .locals 1 */
		 /* .annotation system Ldalvik/annotation/Throws; */
		 /* value = { */
		 /* Ljava/io/IOException; */
		 /* } */
	 } // .end annotation
	 /* .prologue */
	 /* .line 41 */
	 (( java.net.URL ) p1 ).openConnection ( ); // invoke-virtual {p1}, Ljava/net/URL;->openConnection()Ljava/net/URLConnection;
	 /* check-cast v0, Ljava/net/HttpURLConnection; */
} // .end method
public void run ( ) {
	 /* .locals 4 */
	 /* .prologue */
	 /* .line 53 */
	 try { // :try_start_0
		 /* new-instance v0, Ljava/lang/StringBuilder; */
		 /* invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V */
		 final String v1 = "Pinging URL: "; // const-string v1, "Pinging URL: "
		 (( java.lang.StringBuilder ) v0 ).append ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
		 v1 = this.b;
		 (( java.lang.StringBuilder ) v0 ).append ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
		 (( java.lang.StringBuilder ) v0 ).toString ( ); // invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
		 com.google.ads.util.b .a ( v0 );
		 /* .line 55 */
		 /* new-instance v0, Ljava/net/URL; */
		 v1 = this.b;
		 /* invoke-direct {v0, v1}, Ljava/net/URL;-><init>(Ljava/lang/String;)V */
		 /* .line 58 */
		 (( com.google.ads.aa ) p0 ).a ( v0 ); // invoke-virtual {p0, v0}, Lcom/google/ads/aa;->a(Ljava/net/URL;)Ljava/net/HttpURLConnection;
		 /* :try_end_0 */
		 /* .catch Ljava/io/IOException; {:try_start_0 ..:try_end_0} :catch_0 */
		 /* .line 60 */
		 try { // :try_start_1
			 v0 = this.a;
			 com.google.ads.util.AdUtil .a ( v1,v0 );
			 /* .line 61 */
			 int v0 = 1; // const/4 v0, 0x1
			 (( java.net.HttpURLConnection ) v1 ).setInstanceFollowRedirects ( v0 ); // invoke-virtual {v1, v0}, Ljava/net/HttpURLConnection;->setInstanceFollowRedirects(Z)V
			 /* .line 62 */
			 (( java.net.HttpURLConnection ) v1 ).connect ( ); // invoke-virtual {v1}, Ljava/net/HttpURLConnection;->connect()V
			 /* .line 65 */
			 v0 = 			 (( java.net.HttpURLConnection ) v1 ).getResponseCode ( ); // invoke-virtual {v1}, Ljava/net/HttpURLConnection;->getResponseCode()I
			 /* .line 66 */
			 /* const/16 v2, 0xc8 */
			 /* if-lt v0, v2, :cond_0 */
			 /* const/16 v2, 0x12c */
			 /* if-lt v0, v2, :cond_1 */
			 /* .line 67 */
		 } // :cond_0
		 /* new-instance v2, Ljava/lang/StringBuilder; */
		 /* invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V */
		 final String v3 = "Did not receive 2XX (got "; // const-string v3, "Did not receive 2XX (got "
		 (( java.lang.StringBuilder ) v2 ).append ( v3 ); // invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
		 (( java.lang.StringBuilder ) v2 ).append ( v0 ); // invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;
		 final String v2 = ") from pinging URL: "; // const-string v2, ") from pinging URL: "
		 (( java.lang.StringBuilder ) v0 ).append ( v2 ); // invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
		 v2 = this.b;
		 (( java.lang.StringBuilder ) v0 ).append ( v2 ); // invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
		 (( java.lang.StringBuilder ) v0 ).toString ( ); // invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
		 com.google.ads.util.b .e ( v0 );
		 /* :try_end_1 */
		 /* .catchall {:try_start_1 ..:try_end_1} :catchall_0 */
		 /* .line 71 */
	 } // :cond_1
	 try { // :try_start_2
		 (( java.net.HttpURLConnection ) v1 ).disconnect ( ); // invoke-virtual {v1}, Ljava/net/HttpURLConnection;->disconnect()V
		 /* .line 76 */
	 } // :goto_0
	 return;
	 /* .line 71 */
	 /* :catchall_0 */
	 /* move-exception v0 */
	 (( java.net.HttpURLConnection ) v1 ).disconnect ( ); // invoke-virtual {v1}, Ljava/net/HttpURLConnection;->disconnect()V
	 /* throw v0 */
	 /* :try_end_2 */
	 /* .catch Ljava/io/IOException; {:try_start_2 ..:try_end_2} :catch_0 */
	 /* .line 73 */
	 /* :catch_0 */
	 /* move-exception v0 */
	 /* .line 74 */
	 /* new-instance v1, Ljava/lang/StringBuilder; */
	 /* invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V */
	 final String v2 = "Unable to ping the URL: "; // const-string v2, "Unable to ping the URL: "
	 (( java.lang.StringBuilder ) v1 ).append ( v2 ); // invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
	 v2 = this.b;
	 (( java.lang.StringBuilder ) v1 ).append ( v2 ); // invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
	 (( java.lang.StringBuilder ) v1 ).toString ( ); // invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
	 com.google.ads.util.b .d ( v1,v0 );
} // .end method
