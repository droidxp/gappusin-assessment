public class com.funbox.game.promote.MyHttp {
	 /* .source "MyHttp.java" */
	 /* # instance fields */
	 private org.apache.http.client.HttpClient httpClient;
	 private org.apache.http.params.HttpParams httpParams;
	 /* # direct methods */
	 public com.funbox.game.promote.MyHttp ( ) {
		 /* .locals 0 */
		 /* .prologue */
		 /* .line 22 */
		 /* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
		 return;
	 } // .end method
	 /* # virtual methods */
	 public java.io.InputStream doGet ( java.lang.String p0, java.util.Map p1 ) {
		 /* .locals 13 */
		 /* .param p1, "url" # Ljava/lang/String; */
		 /* .param p2, "params" # Ljava/util/Map; */
		 /* .prologue */
		 final String v12 = "DownSongList"; // const-string v12, "DownSongList"
		 final String v11 = "&"; // const-string v11, "&"
		 /* .line 67 */
		 if ( p2 != null) { // if-eqz p2, :cond_0
			 /* .line 68 */
			 final String v6 = ""; // const-string v6, ""
			 /* .line 69 */
			 /* .local v6, "paramStr":Ljava/lang/String; */
			 /* .line 70 */
			 /* .local v4, "iter":Ljava/util/Iterator; */
		 v8 = 		 } // :goto_0
		 /* if-nez v8, :cond_2 */
		 /* .line 77 */
		 final String v8 = ""; // const-string v8, ""
		 v8 = 		 (( java.lang.String ) v6 ).equals ( v8 ); // invoke-virtual {v6, v8}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
		 /* if-nez v8, :cond_0 */
		 /* .line 78 */
		 final String v8 = "&"; // const-string v8, "&"
		 final String v8 = "?"; // const-string v8, "?"
		 (( java.lang.String ) v6 ).replaceFirst ( v11, v8 ); // invoke-virtual {v6, v11, v8}, Ljava/lang/String;->replaceFirst(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
		 /* .line 79 */
		 /* new-instance v8, Ljava/lang/StringBuilder; */
		 java.lang.String .valueOf ( p1 );
		 /* invoke-direct {v8, v9}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V */
		 (( java.lang.StringBuilder ) v8 ).append ( v6 ); // invoke-virtual {v8, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
		 (( java.lang.StringBuilder ) v8 ).toString ( ); // invoke-virtual {v8}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
		 /* .line 87 */
	 } // .end local v4 # "iter":Ljava/util/Iterator;
} // .end local v6 # "paramStr":Ljava/lang/String;
} // :cond_0
try { // :try_start_0
/* new-instance v2, Lorg/apache/http/client/methods/HttpGet; */
/* invoke-direct {v2, p1}, Lorg/apache/http/client/methods/HttpGet;-><init>(Ljava/lang/String;)V */
/* .line 88 */
/* .local v2, "httpRequest":Lorg/apache/http/client/methods/HttpGet; */
v8 = this.httpClient;
/* if-nez v8, :cond_1 */
/* .line 89 */
(( com.funbox.game.promote.MyHttp ) p0 ).getHttpClient ( ); // invoke-virtual {p0}, Lcom/funbox/game/promote/MyHttp;->getHttpClient()Lorg/apache/http/client/HttpClient;
/* .line 93 */
} // :cond_1
v8 = this.httpClient;
/* .line 95 */
v8 = /* .local v3, "httpResponse":Lorg/apache/http/HttpResponse; */
/* const/16 v9, 0xc8 */
/* if-ne v8, v9, :cond_3 */
/* .line 97 */
/* :try_end_0 */
/* .catch Lorg/apache/http/client/ClientProtocolException; {:try_start_0 ..:try_end_0} :catch_0 */
/* .catch Ljava/io/IOException; {:try_start_0 ..:try_end_0} :catch_1 */
/* .catch Ljava/lang/Exception; {:try_start_0 ..:try_end_0} :catch_2 */
/* .line 112 */
} // .end local v2 # "httpRequest":Lorg/apache/http/client/methods/HttpGet;
} // .end local v3 # "httpResponse":Lorg/apache/http/HttpResponse;
} // :goto_1
/* .line 71 */
/* .restart local v4 # "iter":Ljava/util/Iterator; */
/* .restart local v6 # "paramStr":Ljava/lang/String; */
} // :cond_2
/* check-cast v1, Ljava/util/Map$Entry; */
/* .line 72 */
/* .local v1, "entry":Ljava/util/Map$Entry; */
/* .line 73 */
/* .local v5, "key":Ljava/lang/Object; */
/* .line 74 */
/* .local v7, "val":Ljava/lang/Object; */
/* new-instance v8, Ljava/lang/StringBuilder; */
java.lang.String .valueOf ( v6 );
/* invoke-direct {v8, v9}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V */
/* new-instance v9, Ljava/lang/StringBuilder; */
final String v10 = "&"; // const-string v10, "&"
/* invoke-direct {v9, v11}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V */
(( java.lang.StringBuilder ) v9 ).append ( v5 ); // invoke-virtual {v9, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;
final String v10 = "="; // const-string v10, "="
(( java.lang.StringBuilder ) v9 ).append ( v10 ); // invoke-virtual {v9, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v9 ).append ( v7 ); // invoke-virtual {v9, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v9 ).toString ( ); // invoke-virtual {v9}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
(( java.lang.StringBuilder ) v8 ).append ( v6 ); // invoke-virtual {v8, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v8 ).toString ( ); // invoke-virtual {v8}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
/* goto/16 :goto_0 */
/* .line 101 */
} // .end local v1 # "entry":Ljava/util/Map$Entry;
} // .end local v4 # "iter":Ljava/util/Iterator;
} // .end local v5 # "key":Ljava/lang/Object;
} // .end local v6 # "paramStr":Ljava/lang/String;
} // .end local v7 # "val":Ljava/lang/Object;
/* .restart local v2 # "httpRequest":Lorg/apache/http/client/methods/HttpGet; */
/* .restart local v3 # "httpResponse":Lorg/apache/http/HttpResponse; */
} // :cond_3
try { // :try_start_1
final String v8 = "DownSongList"; // const-string v8, "DownSongList"
final String v9 = "doGet(): error"; // const-string v9, "doGet(): error"
android.util.Log .v ( v8,v9 );
/* :try_end_1 */
/* .catch Lorg/apache/http/client/ClientProtocolException; {:try_start_1 ..:try_end_1} :catch_0 */
/* .catch Ljava/io/IOException; {:try_start_1 ..:try_end_1} :catch_1 */
/* .catch Ljava/lang/Exception; {:try_start_1 ..:try_end_1} :catch_2 */
/* .line 111 */
} // .end local v2 # "httpRequest":Lorg/apache/http/client/methods/HttpGet;
} // .end local v3 # "httpResponse":Lorg/apache/http/HttpResponse;
} // :goto_2
final String v8 = "DownSongList"; // const-string v8, "DownSongList"
final String v8 = "doGet(): null"; // const-string v8, "doGet(): null"
android.util.Log .v ( v12,v8 );
/* .line 112 */
int v8 = 0; // const/4 v8, 0x0
/* .line 103 */
/* :catch_0 */
/* move-exception v8 */
/* move-object v0, v8 */
/* .line 104 */
/* .local v0, "e":Lorg/apache/http/client/ClientProtocolException; */
(( org.apache.http.client.ClientProtocolException ) v0 ).printStackTrace ( ); // invoke-virtual {v0}, Lorg/apache/http/client/ClientProtocolException;->printStackTrace()V
/* .line 105 */
} // .end local v0 # "e":Lorg/apache/http/client/ClientProtocolException;
/* :catch_1 */
/* move-exception v8 */
/* move-object v0, v8 */
/* .line 106 */
/* .local v0, "e":Ljava/io/IOException; */
(( java.io.IOException ) v0 ).printStackTrace ( ); // invoke-virtual {v0}, Ljava/io/IOException;->printStackTrace()V
/* .line 107 */
} // .end local v0 # "e":Ljava/io/IOException;
/* :catch_2 */
/* move-exception v8 */
/* move-object v0, v8 */
/* .line 108 */
/* .local v0, "e":Ljava/lang/Exception; */
(( java.lang.Exception ) v0 ).printStackTrace ( ); // invoke-virtual {v0}, Ljava/lang/Exception;->printStackTrace()V
} // .end method
public org.apache.http.client.HttpClient getHttpClient ( ) {
/* .locals 3 */
/* .prologue */
/* const/16 v2, 0x4e20 */
/* .line 31 */
/* new-instance v1, Lorg/apache/http/params/BasicHttpParams; */
/* invoke-direct {v1}, Lorg/apache/http/params/BasicHttpParams;-><init>()V */
this.httpParams = v1;
/* .line 35 */
v1 = this.httpParams;
org.apache.http.params.HttpConnectionParams .setConnectionTimeout ( v1,v2 );
/* .line 37 */
v1 = this.httpParams;
org.apache.http.params.HttpConnectionParams .setSoTimeout ( v1,v2 );
/* .line 39 */
v1 = this.httpParams;
/* const/16 v2, 0x2000 */
org.apache.http.params.HttpConnectionParams .setSocketBufferSize ( v1,v2 );
/* .line 43 */
v1 = this.httpParams;
int v2 = 1; // const/4 v2, 0x1
org.apache.http.client.params.HttpClientParams .setRedirecting ( v1,v2 );
/* .line 47 */
final String v0 = "Mozilla/5.0 (iPhone; U; CPU iPhone OS 3_0 like Mac OS X; en-us) AppleWebKit/528.18 (KHTML, like Gecko) Version/4.0 Mobile/7A341 Safari/528.16"; // const-string v0, "Mozilla/5.0 (iPhone; U; CPU iPhone OS 3_0 like Mac OS X; en-us) AppleWebKit/528.18 (KHTML, like Gecko) Version/4.0 Mobile/7A341 Safari/528.16"
/* .line 48 */
/* .local v0, "userAgent":Ljava/lang/String; */
v1 = this.httpParams;
org.apache.http.params.HttpProtocolParams .setUserAgent ( v1,v0 );
/* .line 57 */
/* new-instance v1, Lorg/apache/http/impl/client/DefaultHttpClient; */
v2 = this.httpParams;
/* invoke-direct {v1, v2}, Lorg/apache/http/impl/client/DefaultHttpClient;-><init>(Lorg/apache/http/params/HttpParams;)V */
this.httpClient = v1;
/* .line 59 */
v1 = this.httpClient;
} // .end method
