public class com.games.ActivityHttp {
	 /* .source "ActivityHttp.java" */
	 /* # direct methods */
	 public com.games.ActivityHttp ( ) {
		 /* .locals 0 */
		 /* .prologue */
		 /* .line 12 */
		 /* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
		 return;
	 } // .end method
	 public static java.lang.String getContent ( java.lang.String p0 ) {
		 /* .locals 7 */
		 /* .param p0, "url" # Ljava/lang/String; */
		 /* .prologue */
		 /* .line 49 */
		 com.games.ActivityHttp .getUrl ( p0 );
		 /* .line 52 */
		 /* .local v4, "httpConn":Ljava/net/HttpURLConnection; */
		 try { // :try_start_0
			 (( java.net.HttpURLConnection ) v4 ).getInputStream ( ); // invoke-virtual {v4}, Ljava/net/HttpURLConnection;->getInputStream()Ljava/io/InputStream;
			 /* .line 53 */
			 /* .local v5, "iStream":Ljava/io/InputStream; */
			 /* new-instance v0, Ljava/io/ByteArrayOutputStream; */
			 /* invoke-direct {v0}, Ljava/io/ByteArrayOutputStream;-><init>()V */
			 /* .line 55 */
			 /* .local v0, "bytestream":Ljava/io/ByteArrayOutputStream; */
		 } // :goto_0
		 v1 = 		 (( java.io.InputStream ) v5 ).read ( ); // invoke-virtual {v5}, Ljava/io/InputStream;->read()I
		 /* .local v1, "ch":I */
		 int v6 = -1; // const/4 v6, -0x1
		 /* if-ne v1, v6, :cond_0 */
		 /* .line 58 */
		 /* new-instance v2, Ljava/lang/String; */
		 (( java.io.ByteArrayOutputStream ) v0 ).toByteArray ( ); // invoke-virtual {v0}, Ljava/io/ByteArrayOutputStream;->toByteArray()[B
		 /* invoke-direct {v2, v6}, Ljava/lang/String;-><init>([B)V */
		 /* .line 66 */
	 } // .end local v0 # "bytestream":Ljava/io/ByteArrayOutputStream;
} // .end local v1 # "ch":I
} // .end local v5 # "iStream":Ljava/io/InputStream;
} // :goto_1
/* .line 56 */
/* .restart local v0 # "bytestream":Ljava/io/ByteArrayOutputStream; */
/* .restart local v1 # "ch":I */
/* .restart local v5 # "iStream":Ljava/io/InputStream; */
} // :cond_0
(( java.io.ByteArrayOutputStream ) v0 ).write ( v1 ); // invoke-virtual {v0, v1}, Ljava/io/ByteArrayOutputStream;->write(I)V
/* :try_end_0 */
/* .catch Ljava/lang/Exception; {:try_start_0 ..:try_end_0} :catch_0 */
/* .line 61 */
} // .end local v0 # "bytestream":Ljava/io/ByteArrayOutputStream;
} // .end local v1 # "ch":I
} // .end local v5 # "iStream":Ljava/io/InputStream;
/* :catch_0 */
/* move-exception v3 */
/* .line 63 */
/* .local v3, "e":Ljava/lang/Exception; */
(( java.lang.Exception ) v3 ).printStackTrace ( ); // invoke-virtual {v3}, Ljava/lang/Exception;->printStackTrace()V
/* .line 66 */
final String v2 = ""; // const-string v2, ""
} // .end method
public static java.io.InputStream getInputStreamFromURL ( java.lang.String p0 ) {
/* .locals 6 */
/* .param p0, "urlStr" # Ljava/lang/String; */
/* .prologue */
/* .line 16 */
int v4 = 0; // const/4 v4, 0x0
/* .line 17 */
/* .local v4, "urlConn":Ljava/net/HttpURLConnection; */
int v2 = 0; // const/4 v2, 0x0
/* .line 19 */
/* .local v2, "inputStream":Ljava/io/InputStream; */
try { // :try_start_0
/* new-instance v3, Ljava/net/URL; */
/* invoke-direct {v3, p0}, Ljava/net/URL;-><init>(Ljava/lang/String;)V */
/* .line 20 */
/* .local v3, "url":Ljava/net/URL; */
(( java.net.URL ) v3 ).openConnection ( ); // invoke-virtual {v3}, Ljava/net/URL;->openConnection()Ljava/net/URLConnection;
/* move-object v0, v5 */
/* check-cast v0, Ljava/net/HttpURLConnection; */
/* move-object v4, v0 */
/* .line 21 */
(( java.net.HttpURLConnection ) v4 ).getInputStream ( ); // invoke-virtual {v4}, Ljava/net/HttpURLConnection;->getInputStream()Ljava/io/InputStream;
/* :try_end_0 */
/* .catch Ljava/net/MalformedURLException; {:try_start_0 ..:try_end_0} :catch_0 */
/* .catch Ljava/io/IOException; {:try_start_0 ..:try_end_0} :catch_1 */
/* .line 28 */
} // .end local v3 # "url":Ljava/net/URL;
} // :goto_0
/* .line 22 */
/* :catch_0 */
/* move-exception v1 */
/* .line 23 */
/* .local v1, "e":Ljava/net/MalformedURLException; */
(( java.net.MalformedURLException ) v1 ).printStackTrace ( ); // invoke-virtual {v1}, Ljava/net/MalformedURLException;->printStackTrace()V
/* .line 24 */
} // .end local v1 # "e":Ljava/net/MalformedURLException;
/* :catch_1 */
/* move-exception v1 */
/* .line 25 */
/* .local v1, "e":Ljava/io/IOException; */
(( java.io.IOException ) v1 ).printStackTrace ( ); // invoke-virtual {v1}, Ljava/io/IOException;->printStackTrace()V
} // .end method
public static java.lang.String getResponseHeader ( java.lang.String p0, java.lang.String p1 ) {
/* .locals 3 */
/* .param p0, "url" # Ljava/lang/String; */
/* .param p1, "paramName" # Ljava/lang/String; */
/* .prologue */
/* .line 33 */
com.games.ActivityHttp .getUrl ( p0 );
/* .line 35 */
/* .local v1, "httpConn":Ljava/net/HttpURLConnection; */
if ( v1 != null) { // if-eqz v1, :cond_0
/* .line 37 */
(( java.net.HttpURLConnection ) v1 ).getHeaderField ( p1 ); // invoke-virtual {v1, p1}, Ljava/net/HttpURLConnection;->getHeaderField(Ljava/lang/String;)Ljava/lang/String;
/* .line 38 */
/* .local v0, "headerValue":Ljava/lang/String; */
if ( v0 != null) { // if-eqz v0, :cond_0
final String v2 = ""; // const-string v2, ""
v2 = (( java.lang.String ) v0 ).equals ( v2 ); // invoke-virtual {v0, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
/* if-nez v2, :cond_0 */
/* .line 44 */
} // .end local v0 # "headerValue":Ljava/lang/String;
} // :goto_0
} // :cond_0
final String v0 = ""; // const-string v0, ""
} // .end method
public static java.net.HttpURLConnection getUrl ( java.lang.String p0 ) {
/* .locals 2 */
/* .param p0, "url" # Ljava/lang/String; */
/* .prologue */
/* .line 75 */
try { // :try_start_0
com.games.ActivityHttp .httpGet ( p0 );
/* :try_end_0 */
/* .catch Ljava/lang/Exception; {:try_start_0 ..:try_end_0} :catch_0 */
/* .line 84 */
} // :goto_0
/* .line 79 */
/* :catch_0 */
/* move-exception v0 */
/* .line 81 */
/* .local v0, "e":Ljava/lang/Exception; */
(( java.lang.Exception ) v0 ).printStackTrace ( ); // invoke-virtual {v0}, Ljava/lang/Exception;->printStackTrace()V
/* .line 84 */
int v1 = 0; // const/4 v1, 0x0
} // .end method
public static java.net.HttpURLConnection httpGet ( java.lang.String p0 ) {
/* .locals 7 */
/* .param p0, "urlString" # Ljava/lang/String; */
/* .annotation system Ldalvik/annotation/Throws; */
/* value = { */
/* Ljava/io/IOException; */
/* } */
} // .end annotation
/* .prologue */
/* .line 117 */
int v4 = -1; // const/4 v4, -0x1
/* .line 119 */
/* .local v4, "response":I */
/* new-instance v5, Ljava/net/URL; */
/* invoke-direct {v5, p0}, Ljava/net/URL;-><init>(Ljava/lang/String;)V */
/* .line 120 */
/* .local v5, "url":Ljava/net/URL; */
(( java.net.URL ) v5 ).openConnection ( ); // invoke-virtual {v5}, Ljava/net/URL;->openConnection()Ljava/net/URLConnection;
/* .line 124 */
/* .local v1, "conn":Ljava/net/URLConnection; */
try { // :try_start_0
/* move-object v0, v1 */
/* check-cast v0, Ljava/net/HttpURLConnection; */
/* move-object v3, v0 */
/* .line 125 */
/* .local v3, "httpConn":Ljava/net/HttpURLConnection; */
int v6 = 0; // const/4 v6, 0x0
(( java.net.HttpURLConnection ) v3 ).setAllowUserInteraction ( v6 ); // invoke-virtual {v3, v6}, Ljava/net/HttpURLConnection;->setAllowUserInteraction(Z)V
/* .line 126 */
int v6 = 1; // const/4 v6, 0x1
(( java.net.HttpURLConnection ) v3 ).setInstanceFollowRedirects ( v6 ); // invoke-virtual {v3, v6}, Ljava/net/HttpURLConnection;->setInstanceFollowRedirects(Z)V
/* .line 127 */
final String v6 = "GET"; // const-string v6, "GET"
(( java.net.HttpURLConnection ) v3 ).setRequestMethod ( v6 ); // invoke-virtual {v3, v6}, Ljava/net/HttpURLConnection;->setRequestMethod(Ljava/lang/String;)V
/* .line 128 */
(( java.net.HttpURLConnection ) v3 ).connect ( ); // invoke-virtual {v3}, Ljava/net/HttpURLConnection;->connect()V
/* .line 129 */
(( java.net.HttpURLConnection ) v3 ).getResponseCode ( ); // invoke-virtual {v3}, Ljava/net/HttpURLConnection;->getResponseCode()I
/* :try_end_0 */
v4 = /* .catch Ljava/lang/Exception; {:try_start_0 ..:try_end_0} :catch_0 */
/* .line 130 */
/* const/16 v6, 0xc8 */
/* if-ne v4, v6, :cond_0 */
/* .line 140 */
} // .end local v3 # "httpConn":Ljava/net/HttpURLConnection;
} // :goto_0
/* .line 135 */
/* :catch_0 */
/* move-exception v2 */
/* .line 137 */
/* .local v2, "ex":Ljava/lang/Exception; */
(( java.lang.Exception ) v2 ).printStackTrace ( ); // invoke-virtual {v2}, Ljava/lang/Exception;->printStackTrace()V
/* .line 140 */
} // .end local v2 # "ex":Ljava/lang/Exception;
} // :cond_0
int v3 = 0; // const/4 v3, 0x0
} // .end method
public static java.net.HttpURLConnection httpPost ( java.lang.String p0, Object[] p1 ) {
/* .locals 8 */
/* .param p0, "urlString" # Ljava/lang/String; */
/* .param p1, "byteData" # [B */
/* .annotation system Ldalvik/annotation/Throws; */
/* value = { */
/* Ljava/lang/Exception; */
/* } */
} // .end annotation
/* .prologue */
/* .line 89 */
/* new-instance v6, Ljava/net/URL; */
/* invoke-direct {v6, p0}, Ljava/net/URL;-><init>(Ljava/lang/String;)V */
/* .line 90 */
/* .local v6, "url":Ljava/net/URL; */
(( java.net.URL ) v6 ).openConnection ( ); // invoke-virtual {v6}, Ljava/net/URL;->openConnection()Ljava/net/URLConnection;
/* .line 91 */
/* .local v1, "conn":Ljava/net/URLConnection; */
int v5 = -1; // const/4 v5, -0x1
/* .line 94 */
/* .local v5, "response":I */
try { // :try_start_0
/* move-object v0, v1 */
/* check-cast v0, Ljava/net/HttpURLConnection; */
/* move-object v3, v0 */
/* .line 95 */
/* .local v3, "httpConn":Ljava/net/HttpURLConnection; */
int v7 = 1; // const/4 v7, 0x1
(( java.net.HttpURLConnection ) v3 ).setDoOutput ( v7 ); // invoke-virtual {v3, v7}, Ljava/net/HttpURLConnection;->setDoOutput(Z)V
/* .line 96 */
int v7 = 1; // const/4 v7, 0x1
(( java.net.HttpURLConnection ) v3 ).setDoInput ( v7 ); // invoke-virtual {v3, v7}, Ljava/net/HttpURLConnection;->setDoInput(Z)V
/* .line 97 */
final String v7 = "POST"; // const-string v7, "POST"
(( java.net.HttpURLConnection ) v3 ).setRequestMethod ( v7 ); // invoke-virtual {v3, v7}, Ljava/net/HttpURLConnection;->setRequestMethod(Ljava/lang/String;)V
/* .line 98 */
(( java.net.HttpURLConnection ) v3 ).connect ( ); // invoke-virtual {v3}, Ljava/net/HttpURLConnection;->connect()V
/* .line 100 */
(( java.net.HttpURLConnection ) v3 ).getOutputStream ( ); // invoke-virtual {v3}, Ljava/net/HttpURLConnection;->getOutputStream()Ljava/io/OutputStream;
/* .line 101 */
/* .local v4, "outStream":Ljava/io/OutputStream; */
(( java.io.OutputStream ) v4 ).write ( p1 ); // invoke-virtual {v4, p1}, Ljava/io/OutputStream;->write([B)V
/* .line 102 */
(( java.io.OutputStream ) v4 ).flush ( ); // invoke-virtual {v4}, Ljava/io/OutputStream;->flush()V
/* .line 103 */
(( java.io.OutputStream ) v4 ).close ( ); // invoke-virtual {v4}, Ljava/io/OutputStream;->close()V
/* :try_end_0 */
/* .catch Ljava/lang/Exception; {:try_start_0 ..:try_end_0} :catch_0 */
/* .line 112 */
} // .end local v3 # "httpConn":Ljava/net/HttpURLConnection;
} // .end local v4 # "outStream":Ljava/io/OutputStream;
} // :goto_0
/* .line 107 */
/* :catch_0 */
/* move-exception v2 */
/* .line 109 */
/* .local v2, "ex":Ljava/lang/Exception; */
(( java.lang.Exception ) v2 ).printStackTrace ( ); // invoke-virtual {v2}, Ljava/lang/Exception;->printStackTrace()V
/* .line 112 */
int v3 = 0; // const/4 v3, 0x0
} // .end method
