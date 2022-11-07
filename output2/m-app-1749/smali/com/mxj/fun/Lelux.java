public class com.mxj.fun.Lelux {
	 /* .source "Lelux.java" */
	 /* # static fields */
	 private static java.lang.String baseServerUrl;
	 /* # instance fields */
	 private Boolean isFollowRedirects;
	 java.net.URL url;
	 public java.net.HttpURLConnection urlConnection;
	 java.lang.String urlStr;
	 /* # direct methods */
	 static com.mxj.fun.Lelux ( ) {
		 /* .locals 1 */
		 /* .prologue */
		 /* .line 16 */
		 final String v0 = "http://115.28.32.8:8082/LisJiTin/lis"; // const-string v0, "http://115.28.32.8:8082/LisJiTin/lis"
		 return;
	 } // .end method
	 public com.mxj.fun.Lelux ( ) {
		 /* .locals 2 */
		 /* .prologue */
		 int v1 = 0; // const/4 v1, 0x0
		 /* .line 18 */
		 /* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
		 /* .line 12 */
		 final String v0 = ""; // const-string v0, ""
		 this.urlStr = v0;
		 /* .line 13 */
		 this.url = v1;
		 /* .line 14 */
		 this.urlConnection = v1;
		 /* .line 15 */
		 int v0 = 1; // const/4 v0, 0x1
		 /* iput-boolean v0, p0, Lcom/mxj/fun/Lelux;->isFollowRedirects:Z */
		 /* .line 19 */
		 v0 = com.mxj.fun.Lelux.baseServerUrl;
		 this.urlStr = v0;
		 /* .line 20 */
		 (( com.mxj.fun.Lelux ) p0 ).init ( ); // invoke-virtual {p0}, Lcom/mxj/fun/Lelux;->init()V
		 /* .line 21 */
		 return;
	 } // .end method
	 /* # virtual methods */
	 public java.io.InputStream getInputStream ( ) {
		 /* .locals 1 */
		 /* .annotation system Ldalvik/annotation/Throws; */
		 /* value = { */
		 /* Ljava/io/IOException; */
		 /* } */
	 } // .end annotation
	 /* .prologue */
	 /* .line 34 */
	 v0 = this.urlConnection;
	 (( java.net.HttpURLConnection ) v0 ).connect ( ); // invoke-virtual {v0}, Ljava/net/HttpURLConnection;->connect()V
	 /* .line 35 */
	 v0 = this.urlConnection;
	 (( java.net.HttpURLConnection ) v0 ).getInputStream ( ); // invoke-virtual {v0}, Ljava/net/HttpURLConnection;->getInputStream()Ljava/io/InputStream;
} // .end method
public java.io.OutputStream getOutputStream ( ) {
	 /* .locals 2 */
	 /* .annotation system Ldalvik/annotation/Throws; */
	 /* value = { */
	 /* Ljava/io/IOException; */
	 /* } */
} // .end annotation
/* .prologue */
/* .line 25 */
/* iget-boolean v0, p0, Lcom/mxj/fun/Lelux;->isFollowRedirects:Z */
java.net.HttpURLConnection .setFollowRedirects ( v0 );
/* .line 26 */
v0 = this.urlConnection;
/* const/16 v1, 0x1770 */
(( java.net.HttpURLConnection ) v0 ).setConnectTimeout ( v1 ); // invoke-virtual {v0, v1}, Ljava/net/HttpURLConnection;->setConnectTimeout(I)V
/* .line 27 */
v0 = this.urlConnection;
/* const v1, 0x493e0 */
(( java.net.HttpURLConnection ) v0 ).setReadTimeout ( v1 ); // invoke-virtual {v0, v1}, Ljava/net/HttpURLConnection;->setReadTimeout(I)V
/* .line 28 */
v0 = this.urlConnection;
final String v1 = "POST"; // const-string v1, "POST"
(( java.net.HttpURLConnection ) v0 ).setRequestMethod ( v1 ); // invoke-virtual {v0, v1}, Ljava/net/HttpURLConnection;->setRequestMethod(Ljava/lang/String;)V
/* .line 30 */
v0 = this.urlConnection;
(( java.net.HttpURLConnection ) v0 ).getOutputStream ( ); // invoke-virtual {v0}, Ljava/net/HttpURLConnection;->getOutputStream()Ljava/io/OutputStream;
} // .end method
public void init ( ) {
/* .locals 2 */
/* .prologue */
/* .line 41 */
try { // :try_start_0
	 /* new-instance v0, Ljava/net/URL; */
	 v1 = this.urlStr;
	 /* invoke-direct {v0, v1}, Ljava/net/URL;-><init>(Ljava/lang/String;)V */
	 this.url = v0;
	 /* .line 42 */
	 v0 = this.url;
	 (( java.net.URL ) v0 ).openConnection ( ); // invoke-virtual {v0}, Ljava/net/URL;->openConnection()Ljava/net/URLConnection;
	 /* check-cast v0, Ljava/net/HttpURLConnection; */
	 this.urlConnection = v0;
	 /* .line 43 */
	 v0 = this.urlConnection;
	 int v1 = 1; // const/4 v1, 0x1
	 (( java.net.HttpURLConnection ) v0 ).setDoOutput ( v1 ); // invoke-virtual {v0, v1}, Ljava/net/HttpURLConnection;->setDoOutput(Z)V
	 /* :try_end_0 */
	 /* .catch Ljava/lang/Exception; {:try_start_0 ..:try_end_0} :catch_0 */
	 /* .line 48 */
} // :goto_0
return;
/* .line 44 */
/* :catch_0 */
/* move-exception v0 */
} // .end method
