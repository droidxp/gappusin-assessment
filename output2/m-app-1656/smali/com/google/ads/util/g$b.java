public class com.google.ads.util.g$b extends com.google.ads.internal.i {
	 /* .source "SourceFile" */
	 /* # annotations */
	 /* .annotation system Ldalvik/annotation/EnclosingClass; */
	 /* value = Lcom/google/ads/util/g; */
} // .end annotation
/* .annotation system Ldalvik/annotation/InnerClass; */
/* accessFlags = 0x9 */
/* name = "b" */
} // .end annotation
/* # direct methods */
public com.google.ads.util.g$b ( ) {
/* .locals 0 */
/* .annotation system Ldalvik/annotation/Signature; */
/* value = { */
/* "(", */
/* "Lcom/google/ads/internal/d;", */
/* "Ljava/util/Map", */
/* "<", */
/* "Ljava/lang/String;", */
/* "Lcom/google/ads/n;", */
/* ">;ZZ)V" */
/* } */
} // .end annotation
/* .prologue */
/* .line 67 */
/* invoke-direct {p0, p1, p2, p3, p4}, Lcom/google/ads/internal/i;-><init>(Lcom/google/ads/internal/d;Ljava/util/Map;ZZ)V */
/* .line 68 */
return;
} // .end method
private static android.webkit.WebResourceResponse a ( java.lang.String p0, android.content.Context p1 ) {
/* .locals 5 */
/* .annotation system Ldalvik/annotation/Throws; */
/* value = { */
/* Ljava/io/IOException; */
/* } */
} // .end annotation
/* .prologue */
/* .line 136 */
/* new-instance v0, Ljava/net/URL; */
/* invoke-direct {v0, p0}, Ljava/net/URL;-><init>(Ljava/lang/String;)V */
/* .line 137 */
(( java.net.URL ) v0 ).openConnection ( ); // invoke-virtual {v0}, Ljava/net/URL;->openConnection()Ljava/net/URLConnection;
/* check-cast v0, Ljava/net/HttpURLConnection; */
/* .line 139 */
try { // :try_start_0
(( android.content.Context ) p1 ).getApplicationContext ( ); // invoke-virtual {p1}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;
com.google.ads.util.AdUtil .a ( v0,v1 );
/* .line 140 */
(( java.net.HttpURLConnection ) v0 ).connect ( ); // invoke-virtual {v0}, Ljava/net/HttpURLConnection;->connect()V
/* .line 141 */
/* new-instance v1, Ljava/io/InputStreamReader; */
(( java.net.HttpURLConnection ) v0 ).getInputStream ( ); // invoke-virtual {v0}, Ljava/net/HttpURLConnection;->getInputStream()Ljava/io/InputStream;
/* invoke-direct {v1, v2}, Ljava/io/InputStreamReader;-><init>(Ljava/io/InputStream;)V */
com.google.ads.util.AdUtil .a ( v1 );
/* .line 144 */
final String v2 = "UTF-8"; // const-string v2, "UTF-8"
/* .line 145 */
/* new-instance v3, Ljava/io/ByteArrayInputStream; */
(( java.lang.String ) v1 ).getBytes ( v2 ); // invoke-virtual {v1, v2}, Ljava/lang/String;->getBytes(Ljava/lang/String;)[B
/* invoke-direct {v3, v1}, Ljava/io/ByteArrayInputStream;-><init>([B)V */
/* .line 147 */
/* new-instance v1, Landroid/webkit/WebResourceResponse; */
final String v4 = "application/javascript"; // const-string v4, "application/javascript"
/* invoke-direct {v1, v4, v2, v3}, Landroid/webkit/WebResourceResponse;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/io/InputStream;)V */
/* :try_end_0 */
/* .catchall {:try_start_0 ..:try_end_0} :catchall_0 */
/* .line 149 */
(( java.net.HttpURLConnection ) v0 ).disconnect ( ); // invoke-virtual {v0}, Ljava/net/HttpURLConnection;->disconnect()V
/* :catchall_0 */
/* move-exception v1 */
(( java.net.HttpURLConnection ) v0 ).disconnect ( ); // invoke-virtual {v0}, Ljava/net/HttpURLConnection;->disconnect()V
/* throw v1 */
} // .end method
/* # virtual methods */
public android.webkit.WebResourceResponse shouldInterceptRequest ( android.webkit.WebView p0, java.lang.String p1 ) {
/* .locals 3 */
/* .param p1, "view" # Landroid/webkit/WebView; */
/* .param p2, "url" # Ljava/lang/String; */
/* .prologue */
/* .line 78 */
try { // :try_start_0
/* new-instance v0, Ljava/io/File; */
/* invoke-direct {v0, p2}, Ljava/io/File;-><init>(Ljava/lang/String;)V */
(( java.io.File ) v0 ).getName ( ); // invoke-virtual {v0}, Ljava/io/File;->getName()Ljava/lang/String;
/* .line 79 */
final String v1 = "mraid.js"; // const-string v1, "mraid.js"
v0 = (( java.lang.String ) v1 ).equalsIgnoreCase ( v0 ); // invoke-virtual {v1, v0}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z
if ( v0 != null) { // if-eqz v0, :cond_1
	 /* .line 81 */
	 v0 = this.a;
	 (( com.google.ads.internal.d ) v0 ).i ( ); // invoke-virtual {v0}, Lcom/google/ads/internal/d;->i()Lcom/google/ads/internal/c;
	 /* .line 82 */
	 if ( v0 != null) { // if-eqz v0, :cond_0
		 /* .line 84 */
		 int v1 = 1; // const/4 v1, 0x1
		 (( com.google.ads.internal.c ) v0 ).b ( v1 ); // invoke-virtual {v0, v1}, Lcom/google/ads/internal/c;->b(Z)V
		 /* .line 98 */
	 } // :goto_0
	 v0 = this.a;
	 (( com.google.ads.internal.d ) v0 ).g ( ); // invoke-virtual {v0}, Lcom/google/ads/internal/d;->g()Lcom/google/ads/m;
	 v0 = this.a;
	 (( com.google.ads.util.i$b ) v0 ).a ( ); // invoke-virtual {v0}, Lcom/google/ads/util/i$b;->a()Ljava/lang/Object;
	 /* check-cast v0, Lcom/google/ads/l; */
	 v0 = this.a;
	 (( com.google.ads.util.i$b ) v0 ).a ( ); // invoke-virtual {v0}, Lcom/google/ads/util/i$b;->a()Ljava/lang/Object;
	 /* check-cast v0, Lcom/google/ads/l$a; */
	 /* .line 99 */
	 v1 = this.a;
	 (( com.google.ads.internal.d ) v1 ).g ( ); // invoke-virtual {v1}, Lcom/google/ads/internal/d;->g()Lcom/google/ads/m;
	 v1 = 	 (( com.google.ads.m ) v1 ).b ( ); // invoke-virtual {v1}, Lcom/google/ads/m;->b()Z
	 /* if-nez v1, :cond_3 */
	 /* .line 100 */
	 /* iget-boolean v1, p0, Lcom/google/ads/util/g$b;->b:Z */
	 if ( v1 != null) { // if-eqz v1, :cond_2
		 /* .line 101 */
		 v0 = this.d;
		 (( com.google.ads.util.i$c ) v0 ).a ( ); // invoke-virtual {v0}, Lcom/google/ads/util/i$c;->a()Ljava/lang/Object;
		 /* check-cast v0, Ljava/lang/String; */
		 /* .line 102 */
		 /* new-instance v1, Ljava/lang/StringBuilder; */
		 /* invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V */
		 final String v2 = "shouldInterceptRequest("; // const-string v2, "shouldInterceptRequest("
		 (( java.lang.StringBuilder ) v1 ).append ( v2 ); // invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
		 (( java.lang.StringBuilder ) v1 ).append ( v0 ); // invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
		 final String v2 = ")"; // const-string v2, ")"
		 (( java.lang.StringBuilder ) v1 ).append ( v2 ); // invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
		 (( java.lang.StringBuilder ) v1 ).toString ( ); // invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
		 com.google.ads.util.b .a ( v1 );
		 /* .line 103 */
		 (( android.webkit.WebView ) p1 ).getContext ( ); // invoke-virtual {p1}, Landroid/webkit/WebView;->getContext()Landroid/content/Context;
		 com.google.ads.util.g$b .a ( v0,v1 );
		 /* .line 128 */
	 } // :goto_1
	 /* .line 94 */
} // :cond_0
v0 = this.a;
int v1 = 1; // const/4 v1, 0x1
(( com.google.ads.internal.d ) v0 ).a ( v1 ); // invoke-virtual {v0, v1}, Lcom/google/ads/internal/d;->a(Z)V
/* :try_end_0 */
/* .catch Ljava/io/IOException; {:try_start_0 ..:try_end_0} :catch_0 */
/* .catch Ljava/lang/Throwable; {:try_start_0 ..:try_end_0} :catch_1 */
/* .line 121 */
/* :catch_0 */
/* move-exception v0 */
/* .line 122 */
final String v1 = "IOException fetching MRAID JS."; // const-string v1, "IOException fetching MRAID JS."
com.google.ads.util.b .d ( v1,v0 );
/* .line 128 */
} // :cond_1
} // :goto_2
/* invoke-super {p0, p1, p2}, Lcom/google/ads/internal/i;->shouldInterceptRequest(Landroid/webkit/WebView;Ljava/lang/String;)Landroid/webkit/WebResourceResponse; */
/* .line 107 */
} // :cond_2
try { // :try_start_1
v0 = this.c;
(( com.google.ads.util.i$c ) v0 ).a ( ); // invoke-virtual {v0}, Lcom/google/ads/util/i$c;->a()Ljava/lang/Object;
/* check-cast v0, Ljava/lang/String; */
/* .line 108 */
/* new-instance v1, Ljava/lang/StringBuilder; */
/* invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V */
final String v2 = "shouldInterceptRequest("; // const-string v2, "shouldInterceptRequest("
(( java.lang.StringBuilder ) v1 ).append ( v2 ); // invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v1 ).append ( v0 ); // invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
final String v2 = ")"; // const-string v2, ")"
(( java.lang.StringBuilder ) v1 ).append ( v2 ); // invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v1 ).toString ( ); // invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
com.google.ads.util.b .a ( v1 );
/* .line 109 */
(( android.webkit.WebView ) p1 ).getContext ( ); // invoke-virtual {p1}, Landroid/webkit/WebView;->getContext()Landroid/content/Context;
com.google.ads.util.g$b .a ( v0,v1 );
/* .line 114 */
} // :cond_3
v0 = this.e;
(( com.google.ads.util.i$c ) v0 ).a ( ); // invoke-virtual {v0}, Lcom/google/ads/util/i$c;->a()Ljava/lang/Object;
/* check-cast v0, Ljava/lang/String; */
/* .line 115 */
/* new-instance v1, Ljava/lang/StringBuilder; */
/* invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V */
final String v2 = "shouldInterceptRequest("; // const-string v2, "shouldInterceptRequest("
(( java.lang.StringBuilder ) v1 ).append ( v2 ); // invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v1 ).append ( v0 ); // invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
final String v2 = ")"; // const-string v2, ")"
(( java.lang.StringBuilder ) v1 ).append ( v2 ); // invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v1 ).toString ( ); // invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
com.google.ads.util.b .a ( v1 );
/* .line 116 */
(( android.webkit.WebView ) p1 ).getContext ( ); // invoke-virtual {p1}, Landroid/webkit/WebView;->getContext()Landroid/content/Context;
com.google.ads.util.g$b .a ( v0,v1 );
/* :try_end_1 */
/* .catch Ljava/io/IOException; {:try_start_1 ..:try_end_1} :catch_0 */
/* .catch Ljava/lang/Throwable; {:try_start_1 ..:try_end_1} :catch_1 */
/* .line 123 */
/* :catch_1 */
/* move-exception v0 */
/* .line 125 */
final String v1 = "An unknown error occurred fetching MRAID JS."; // const-string v1, "An unknown error occurred fetching MRAID JS."
com.google.ads.util.b .b ( v1,v0 );
} // .end method
