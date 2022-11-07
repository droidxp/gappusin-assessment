public class com.umeng.common.net.s {
	 /* .source "UClient.java" */
	 /* # static fields */
	 private static final java.lang.String a;
	 /* # instance fields */
	 private java.util.Map b;
	 /* .annotation system Ldalvik/annotation/Signature; */
	 /* value = { */
	 /* "Ljava/util/Map", */
	 /* "<", */
	 /* "Ljava/lang/String;", */
	 /* "Ljava/lang/String;", */
	 /* ">;" */
	 /* } */
} // .end annotation
} // .end field
/* # direct methods */
static com.umeng.common.net.s ( ) {
/* .locals 1 */
/* .prologue */
/* .line 54 */
/* const-class v0, Lcom/umeng/common/net/s; */
(( java.lang.Class ) v0 ).getName ( ); // invoke-virtual {v0}, Ljava/lang/Class;->getName()Ljava/lang/String;
return;
} // .end method
public com.umeng.common.net.s ( ) {
/* .locals 0 */
/* .prologue */
/* .line 49 */
/* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
return;
} // .end method
private static java.lang.String a ( java.io.InputStream p0 ) {
/* .locals 5 */
/* .prologue */
int v0 = 0; // const/4 v0, 0x0
/* .line 190 */
/* new-instance v1, Ljava/io/BufferedReader; */
/* new-instance v2, Ljava/io/InputStreamReader; */
/* invoke-direct {v2, p0}, Ljava/io/InputStreamReader;-><init>(Ljava/io/InputStream;)V */
/* .line 191 */
/* const/16 v3, 0x2000 */
/* .line 190 */
/* invoke-direct {v1, v2, v3}, Ljava/io/BufferedReader;-><init>(Ljava/io/Reader;I)V */
/* .line 192 */
/* new-instance v2, Ljava/lang/StringBuilder; */
/* invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V */
/* .line 196 */
} // :goto_0
try { // :try_start_0
(( java.io.BufferedReader ) v1 ).readLine ( ); // invoke-virtual {v1}, Ljava/io/BufferedReader;->readLine()Ljava/lang/String;
/* :try_end_0 */
/* .catch Ljava/io/IOException; {:try_start_0 ..:try_end_0} :catch_0 */
/* .catchall {:try_start_0 ..:try_end_0} :catchall_0 */
/* if-nez v3, :cond_0 */
/* .line 204 */
try { // :try_start_1
	 (( java.io.InputStream ) p0 ).close ( ); // invoke-virtual {p0}, Ljava/io/InputStream;->close()V
	 /* :try_end_1 */
	 /* .catch Ljava/io/IOException; {:try_start_1 ..:try_end_1} :catch_3 */
	 /* .line 210 */
	 (( java.lang.StringBuilder ) v2 ).toString ( ); // invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
} // :goto_1
/* .line 197 */
} // :cond_0
try { // :try_start_2
/* new-instance v4, Ljava/lang/StringBuilder; */
java.lang.String .valueOf ( v3 );
/* invoke-direct {v4, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V */
final String v3 = "\n"; // const-string v3, "\n"
(( java.lang.StringBuilder ) v4 ).append ( v3 ); // invoke-virtual {v4, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v3 ).toString ( ); // invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
(( java.lang.StringBuilder ) v2 ).append ( v3 ); // invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
/* :try_end_2 */
/* .catch Ljava/io/IOException; {:try_start_2 ..:try_end_2} :catch_0 */
/* .catchall {:try_start_2 ..:try_end_2} :catchall_0 */
/* .line 199 */
/* :catch_0 */
/* move-exception v1 */
/* .line 200 */
try { // :try_start_3
	 v2 = com.umeng.common.net.s.a;
	 final String v3 = "Caught IOException in convertStreamToString()"; // const-string v3, "Caught IOException in convertStreamToString()"
	 com.umeng.common.Log .b ( v2,v3,v1 );
	 /* :try_end_3 */
	 /* .catchall {:try_start_3 ..:try_end_3} :catchall_0 */
	 /* .line 204 */
	 try { // :try_start_4
		 (( java.io.InputStream ) p0 ).close ( ); // invoke-virtual {p0}, Ljava/io/InputStream;->close()V
		 /* :try_end_4 */
		 /* .catch Ljava/io/IOException; {:try_start_4 ..:try_end_4} :catch_1 */
		 /* .line 205 */
		 /* :catch_1 */
		 /* move-exception v1 */
		 /* .line 206 */
		 v2 = com.umeng.common.net.s.a;
		 final String v3 = "Caught IOException in convertStreamToString()"; // const-string v3, "Caught IOException in convertStreamToString()"
		 com.umeng.common.Log .b ( v2,v3,v1 );
		 /* .line 202 */
		 /* :catchall_0 */
		 /* move-exception v1 */
		 /* .line 204 */
		 try { // :try_start_5
			 (( java.io.InputStream ) p0 ).close ( ); // invoke-virtual {p0}, Ljava/io/InputStream;->close()V
			 /* :try_end_5 */
			 /* .catch Ljava/io/IOException; {:try_start_5 ..:try_end_5} :catch_2 */
			 /* .line 209 */
			 /* throw v1 */
			 /* .line 205 */
			 /* :catch_2 */
			 /* move-exception v1 */
			 /* .line 206 */
			 v2 = com.umeng.common.net.s.a;
			 final String v3 = "Caught IOException in convertStreamToString()"; // const-string v3, "Caught IOException in convertStreamToString()"
			 com.umeng.common.Log .b ( v2,v3,v1 );
			 /* .line 205 */
			 /* :catch_3 */
			 /* move-exception v1 */
			 /* .line 206 */
			 v2 = com.umeng.common.net.s.a;
			 final String v3 = "Caught IOException in convertStreamToString()"; // const-string v3, "Caught IOException in convertStreamToString()"
			 com.umeng.common.Log .b ( v2,v3,v1 );
		 } // .end method
		 private org.apache.http.params.HttpParams a ( ) {
			 /* .locals 2 */
			 /* .prologue */
			 /* .line 285 */
			 /* new-instance v0, Lorg/apache/http/params/BasicHttpParams; */
			 /* invoke-direct {v0}, Lorg/apache/http/params/BasicHttpParams;-><init>()V */
			 /* .line 286 */
			 /* const/16 v1, 0x2710 */
			 org.apache.http.params.HttpConnectionParams .setConnectionTimeout ( v0,v1 );
			 /* .line 287 */
			 /* const/16 v1, 0x4e20 */
			 org.apache.http.params.HttpConnectionParams .setSoTimeout ( v0,v1 );
			 /* .line 288 */
			 final String v1 = "http.agent"; // const-string v1, "http.agent"
			 java.lang.System .getProperty ( v1 );
			 org.apache.http.params.HttpProtocolParams .setUserAgent ( v0,v1 );
			 /* .line 289 */
		 } // .end method
		 private org.json.JSONObject a ( java.lang.String p0 ) {
			 /* .locals 7 */
			 /* .prologue */
			 int v2 = 0; // const/4 v2, 0x0
			 /* .line 214 */
			 /* new-instance v0, Ljava/util/Random; */
			 /* invoke-direct {v0}, Ljava/util/Random;-><init>()V */
			 /* const/16 v1, 0x3e8 */
			 v3 = 			 (( java.util.Random ) v0 ).nextInt ( v1 ); // invoke-virtual {v0, v1}, Ljava/util/Random;->nextInt(I)I
			 /* .line 216 */
			 try { // :try_start_0
				 final String v0 = "line.separator"; // const-string v0, "line.separator"
				 java.lang.System .getProperty ( v0 );
				 /* .line 217 */
				 v0 = 				 (( java.lang.String ) p1 ).length ( ); // invoke-virtual {p1}, Ljava/lang/String;->length()I
				 int v1 = 1; // const/4 v1, 0x1
				 /* if-gt v0, v1, :cond_0 */
				 /* .line 218 */
				 v0 = com.umeng.common.net.s.a;
				 /* new-instance v1, Ljava/lang/StringBuilder; */
				 java.lang.String .valueOf ( v3 );
				 /* invoke-direct {v1, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V */
				 final String v4 = ":\tInvalid baseUrl."; // const-string v4, ":\tInvalid baseUrl."
				 (( java.lang.StringBuilder ) v1 ).append ( v4 ); // invoke-virtual {v1, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
				 (( java.lang.StringBuilder ) v1 ).toString ( ); // invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
				 com.umeng.common.Log .b ( v0,v1 );
				 /* move-object v0, v2 */
				 /* .line 280 */
			 } // :goto_0
			 /* .line 222 */
		 } // :cond_0
		 v0 = com.umeng.common.net.s.a;
		 /* new-instance v1, Ljava/lang/StringBuilder; */
		 java.lang.String .valueOf ( v3 );
		 /* invoke-direct {v1, v5}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V */
		 final String v5 = ":\tget: "; // const-string v5, ":\tget: "
		 (( java.lang.StringBuilder ) v1 ).append ( v5 ); // invoke-virtual {v1, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
		 (( java.lang.StringBuilder ) v1 ).append ( p1 ); // invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
		 (( java.lang.StringBuilder ) v1 ).toString ( ); // invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
		 com.umeng.common.Log .a ( v0,v1 );
		 /* .line 223 */
		 /* new-instance v5, Lorg/apache/http/client/methods/HttpGet; */
		 /* invoke-direct {v5, p1}, Lorg/apache/http/client/methods/HttpGet;-><init>(Ljava/lang/String;)V */
		 /* .line 225 */
		 v0 = this.b;
		 if ( v0 != null) { // if-eqz v0, :cond_1
			 v0 = 			 v0 = this.b;
			 /* if-lez v0, :cond_1 */
			 /* .line 226 */
			 v0 = this.b;
			 /* .line 227 */
		 v0 = 		 } // :goto_1
		 /* if-nez v0, :cond_2 */
		 /* .line 231 */
	 } // :cond_1
	 /* invoke-direct {p0}, Lcom/umeng/common/net/s;->a()Lorg/apache/http/params/HttpParams; */
	 /* .line 233 */
	 /* new-instance v1, Lorg/apache/http/impl/client/DefaultHttpClient; */
	 /* invoke-direct {v1, v0}, Lorg/apache/http/impl/client/DefaultHttpClient;-><init>(Lorg/apache/http/params/HttpParams;)V */
	 /* .line 234 */
	 v1 = 	 /* .line 236 */
	 /* const/16 v5, 0xc8 */
	 /* if-ne v1, v5, :cond_5 */
	 /* .line 238 */
	 /* .line 240 */
	 if ( v1 != null) { // if-eqz v1, :cond_6
		 /* .line 241 */
		 /* .line 242 */
		 final String v5 = "Content-Encoding"; // const-string v5, "Content-Encoding"
		 /* .line 244 */
		 if ( v0 != null) { // if-eqz v0, :cond_3
			 /* .line 245 */
			 final String v6 = "gzip"; // const-string v6, "gzip"
			 v5 = 			 (( java.lang.String ) v5 ).equalsIgnoreCase ( v6 ); // invoke-virtual {v5, v6}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z
			 if ( v5 != null) { // if-eqz v5, :cond_3
				 /* .line 246 */
				 v0 = com.umeng.common.net.s.a;
				 /* new-instance v5, Ljava/lang/StringBuilder; */
				 java.lang.String .valueOf ( v3 );
				 /* invoke-direct {v5, v6}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V */
				 /* .line 247 */
				 final String v6 = " Use GZIPInputStream get data...."; // const-string v6, " Use GZIPInputStream get data...."
				 (( java.lang.StringBuilder ) v5 ).append ( v6 ); // invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
				 (( java.lang.StringBuilder ) v5 ).toString ( ); // invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
				 /* .line 246 */
				 com.umeng.common.Log .a ( v0,v5 );
				 /* .line 248 */
				 /* new-instance v0, Ljava/util/zip/GZIPInputStream; */
				 /* invoke-direct {v0, v1}, Ljava/util/zip/GZIPInputStream;-><init>(Ljava/io/InputStream;)V */
				 /* .line 256 */
			 } // :goto_2
			 com.umeng.common.net.s .a ( v0 );
			 /* .line 257 */
			 v0 = com.umeng.common.net.s.a;
			 /* new-instance v5, Ljava/lang/StringBuilder; */
			 java.lang.String .valueOf ( v3 );
			 /* invoke-direct {v5, v6}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V */
			 final String v6 = ":\tresponse: "; // const-string v6, ":\tresponse: "
			 (( java.lang.StringBuilder ) v5 ).append ( v6 ); // invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
			 (( java.lang.StringBuilder ) v5 ).append ( v4 ); // invoke-virtual {v5, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
			 /* .line 258 */
			 (( java.lang.StringBuilder ) v4 ).append ( v1 ); // invoke-virtual {v4, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
			 (( java.lang.StringBuilder ) v4 ).toString ( ); // invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
			 /* .line 257 */
			 com.umeng.common.Log .a ( v0,v4 );
			 /* .line 260 */
			 /* if-nez v1, :cond_4 */
			 /* move-object v0, v2 */
			 /* .line 261 */
			 /* goto/16 :goto_0 */
			 /* .line 227 */
		 } // :cond_2
		 /* check-cast v0, Ljava/lang/String; */
		 /* .line 228 */
		 v1 = this.b;
		 /* check-cast v1, Ljava/lang/String; */
		 (( org.apache.http.client.methods.HttpGet ) v5 ).addHeader ( v0, v1 ); // invoke-virtual {v5, v0, v1}, Lorg/apache/http/client/methods/HttpGet;->addHeader(Ljava/lang/String;Ljava/lang/String;)V
		 /* :try_end_0 */
		 /* .catch Lorg/apache/http/client/ClientProtocolException; {:try_start_0 ..:try_end_0} :catch_0 */
		 /* .catch Ljava/lang/Exception; {:try_start_0 ..:try_end_0} :catch_1 */
		 /* goto/16 :goto_1 */
		 /* .line 271 */
		 /* :catch_0 */
		 /* move-exception v0 */
		 /* .line 272 */
		 v1 = com.umeng.common.net.s.a;
		 /* .line 273 */
		 /* new-instance v4, Ljava/lang/StringBuilder; */
		 java.lang.String .valueOf ( v3 );
		 /* invoke-direct {v4, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V */
		 /* .line 274 */
		 final String v3 = ":\tClientProtocolException,Failed to send message."; // const-string v3, ":\tClientProtocolException,Failed to send message."
		 (( java.lang.StringBuilder ) v4 ).append ( v3 ); // invoke-virtual {v4, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
		 /* .line 275 */
		 (( java.lang.StringBuilder ) v3 ).append ( p1 ); // invoke-virtual {v3, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
		 /* .line 273 */
		 (( java.lang.StringBuilder ) v3 ).toString ( ); // invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
		 /* .line 272 */
		 com.umeng.common.Log .c ( v1,v3,v0 );
		 /* move-object v0, v2 */
		 /* .line 276 */
		 /* goto/16 :goto_0 */
		 /* .line 249 */
	 } // :cond_3
	 if ( v0 != null) { // if-eqz v0, :cond_7
		 /* .line 250 */
		 try { // :try_start_1
			 final String v5 = "deflate"; // const-string v5, "deflate"
			 v0 = 			 (( java.lang.String ) v0 ).equalsIgnoreCase ( v5 ); // invoke-virtual {v0, v5}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z
			 if ( v0 != null) { // if-eqz v0, :cond_7
				 /* .line 251 */
				 v0 = com.umeng.common.net.s.a;
				 /* new-instance v5, Ljava/lang/StringBuilder; */
				 java.lang.String .valueOf ( v3 );
				 /* invoke-direct {v5, v6}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V */
				 /* .line 252 */
				 final String v6 = " Use InflaterInputStream get data...."; // const-string v6, " Use InflaterInputStream get data...."
				 (( java.lang.StringBuilder ) v5 ).append ( v6 ); // invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
				 (( java.lang.StringBuilder ) v5 ).toString ( ); // invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
				 /* .line 251 */
				 com.umeng.common.Log .a ( v0,v5 );
				 /* .line 253 */
				 /* new-instance v0, Ljava/util/zip/InflaterInputStream; */
				 /* invoke-direct {v0, v1}, Ljava/util/zip/InflaterInputStream;-><init>(Ljava/io/InputStream;)V */
				 /* :try_end_1 */
				 /* .catch Lorg/apache/http/client/ClientProtocolException; {:try_start_1 ..:try_end_1} :catch_0 */
				 /* .catch Ljava/lang/Exception; {:try_start_1 ..:try_end_1} :catch_1 */
				 /* goto/16 :goto_2 */
				 /* .line 277 */
				 /* :catch_1 */
				 /* move-exception v0 */
				 /* .line 278 */
				 v1 = com.umeng.common.net.s.a;
				 /* new-instance v4, Ljava/lang/StringBuilder; */
				 java.lang.String .valueOf ( v3 );
				 /* invoke-direct {v4, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V */
				 final String v3 = ":\tIOException,Failed to send message."; // const-string v3, ":\tIOException,Failed to send message."
				 (( java.lang.StringBuilder ) v4 ).append ( v3 ); // invoke-virtual {v4, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
				 (( java.lang.StringBuilder ) v3 ).append ( p1 ); // invoke-virtual {v3, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
				 (( java.lang.StringBuilder ) v3 ).toString ( ); // invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
				 com.umeng.common.Log .c ( v1,v3,v0 );
				 /* move-object v0, v2 */
				 /* .line 280 */
				 /* goto/16 :goto_0 */
				 /* .line 263 */
			 } // :cond_4
			 try { // :try_start_2
				 /* new-instance v0, Lorg/json/JSONObject; */
				 /* invoke-direct {v0, v1}, Lorg/json/JSONObject;-><init>(Ljava/lang/String;)V */
				 /* goto/16 :goto_0 */
				 /* .line 266 */
			 } // :cond_5
			 v1 = com.umeng.common.net.s.a;
			 /* new-instance v4, Ljava/lang/StringBuilder; */
			 java.lang.String .valueOf ( v3 );
			 /* invoke-direct {v4, v5}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V */
			 final String v5 = ":\tFailed to send message.StatusCode = "; // const-string v5, ":\tFailed to send message.StatusCode = "
			 (( java.lang.StringBuilder ) v4 ).append ( v5 ); // invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
			 v0 = 			 /* .line 267 */
			 (( java.lang.StringBuilder ) v4 ).append ( v0 ); // invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;
			 /* .line 268 */
			 v4 = com.umeng.common.util.h.a;
			 (( java.lang.StringBuilder ) v0 ).append ( v4 ); // invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
			 (( java.lang.StringBuilder ) v0 ).append ( p1 ); // invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
			 (( java.lang.StringBuilder ) v0 ).toString ( ); // invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
			 /* .line 266 */
			 com.umeng.common.Log .c ( v1,v0 );
			 /* :try_end_2 */
			 /* .catch Lorg/apache/http/client/ClientProtocolException; {:try_start_2 ..:try_end_2} :catch_0 */
			 /* .catch Ljava/lang/Exception; {:try_start_2 ..:try_end_2} :catch_1 */
		 } // :cond_6
		 /* move-object v0, v2 */
		 /* .line 270 */
		 /* goto/16 :goto_0 */
	 } // :cond_7
	 /* move-object v0, v1 */
	 /* goto/16 :goto_2 */
} // .end method
private org.json.JSONObject a ( java.lang.String p0, org.json.JSONObject p1 ) {
	 /* .locals 9 */
	 /* .prologue */
	 int v0 = 0; // const/4 v0, 0x0
	 /* .line 107 */
	 (( org.json.JSONObject ) p2 ).toString ( ); // invoke-virtual {p2}, Lorg/json/JSONObject;->toString()Ljava/lang/String;
	 /* .line 108 */
	 /* new-instance v2, Ljava/util/Random; */
	 /* invoke-direct {v2}, Ljava/util/Random;-><init>()V */
	 /* const/16 v3, 0x3e8 */
	 v3 = 	 (( java.util.Random ) v2 ).nextInt ( v3 ); // invoke-virtual {v2, v3}, Ljava/util/Random;->nextInt(I)I
	 /* .line 109 */
	 v2 = com.umeng.common.net.s.a;
	 /* new-instance v4, Ljava/lang/StringBuilder; */
	 java.lang.String .valueOf ( v3 );
	 /* invoke-direct {v4, v5}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V */
	 final String v5 = ":\trequest: "; // const-string v5, ":\trequest: "
	 (( java.lang.StringBuilder ) v4 ).append ( v5 ); // invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
	 (( java.lang.StringBuilder ) v4 ).append ( p1 ); // invoke-virtual {v4, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
	 v5 = com.umeng.common.util.h.a;
	 (( java.lang.StringBuilder ) v4 ).append ( v5 ); // invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
	 (( java.lang.StringBuilder ) v4 ).append ( v1 ); // invoke-virtual {v4, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
	 (( java.lang.StringBuilder ) v4 ).toString ( ); // invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
	 com.umeng.common.Log .c ( v2,v4 );
	 /* .line 112 */
	 /* new-instance v2, Lorg/apache/http/client/methods/HttpPost; */
	 /* invoke-direct {v2, p1}, Lorg/apache/http/client/methods/HttpPost;-><init>(Ljava/lang/String;)V */
	 /* .line 114 */
	 /* invoke-direct {p0}, Lcom/umeng/common/net/s;->a()Lorg/apache/http/params/HttpParams; */
	 /* .line 115 */
	 /* new-instance v5, Lorg/apache/http/impl/client/DefaultHttpClient; */
	 /* invoke-direct {v5, v4}, Lorg/apache/http/impl/client/DefaultHttpClient;-><init>(Lorg/apache/http/params/HttpParams;)V */
	 /* .line 122 */
	 try { // :try_start_0
		 v4 = 		 (( com.umeng.common.net.s ) p0 ).shouldCompressData ( ); // invoke-virtual {p0}, Lcom/umeng/common/net/s;->shouldCompressData()Z
		 if ( v4 != null) { // if-eqz v4, :cond_1
			 /* .line 123 */
			 /* new-instance v4, Ljava/lang/StringBuilder; */
			 final String v6 = "content="; // const-string v6, "content="
			 /* invoke-direct {v4, v6}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V */
			 (( java.lang.StringBuilder ) v4 ).append ( v1 ); // invoke-virtual {v4, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
			 (( java.lang.StringBuilder ) v1 ).toString ( ); // invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
			 /* .line 125 */
			 java.nio.charset.Charset .defaultCharset ( );
			 (( java.nio.charset.Charset ) v4 ).toString ( ); // invoke-virtual {v4}, Ljava/nio/charset/Charset;->toString()Ljava/lang/String;
			 /* .line 124 */
			 com.umeng.common.util.f .a ( v1,v4 );
			 /* .line 126 */
			 final String v4 = "Content-Encoding"; // const-string v4, "Content-Encoding"
			 final String v6 = "deflate"; // const-string v6, "deflate"
			 (( org.apache.http.client.methods.HttpPost ) v2 ).addHeader ( v4, v6 ); // invoke-virtual {v2, v4, v6}, Lorg/apache/http/client/methods/HttpPost;->addHeader(Ljava/lang/String;Ljava/lang/String;)V
			 /* .line 127 */
			 /* new-instance v4, Lorg/apache/http/entity/InputStreamEntity; */
			 /* .line 128 */
			 /* new-instance v6, Ljava/io/ByteArrayInputStream; */
			 /* invoke-direct {v6, v1}, Ljava/io/ByteArrayInputStream;-><init>([B)V */
			 /* array-length v1, v1 */
			 /* int-to-long v7, v1 */
			 /* .line 127 */
			 /* invoke-direct {v4, v6, v7, v8}, Lorg/apache/http/entity/InputStreamEntity;-><init>(Ljava/io/InputStream;J)V */
			 /* .line 129 */
			 (( org.apache.http.client.methods.HttpPost ) v2 ).setEntity ( v4 ); // invoke-virtual {v2, v4}, Lorg/apache/http/client/methods/HttpPost;->setEntity(Lorg/apache/http/HttpEntity;)V
			 /* .line 138 */
		 } // :goto_0
		 v2 = 		 /* .line 139 */
		 /* const/16 v4, 0xc8 */
		 /* if-ne v2, v4, :cond_3 */
		 /* .line 141 */
		 /* .line 143 */
		 if ( v2 != null) { // if-eqz v2, :cond_0
			 /* .line 144 */
			 /* .line 145 */
			 final String v4 = "Content-Encoding"; // const-string v4, "Content-Encoding"
			 /* .line 147 */
			 if ( v1 != null) { // if-eqz v1, :cond_4
				 /* .line 148 */
				 final String v4 = "deflate"; // const-string v4, "deflate"
				 v1 = 				 (( java.lang.String ) v1 ).equalsIgnoreCase ( v4 ); // invoke-virtual {v1, v4}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z
				 if ( v1 != null) { // if-eqz v1, :cond_4
					 /* .line 149 */
					 /* new-instance v1, Ljava/util/zip/InflaterInputStream; */
					 /* invoke-direct {v1, v2}, Ljava/util/zip/InflaterInputStream;-><init>(Ljava/io/InputStream;)V */
					 /* .line 152 */
				 } // :goto_1
				 com.umeng.common.net.s .a ( v1 );
				 /* .line 153 */
				 v1 = com.umeng.common.net.s.a;
				 /* new-instance v4, Ljava/lang/StringBuilder; */
				 java.lang.String .valueOf ( v3 );
				 /* invoke-direct {v4, v5}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V */
				 final String v5 = ":\tresponse: "; // const-string v5, ":\tresponse: "
				 (( java.lang.StringBuilder ) v4 ).append ( v5 ); // invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
				 v5 = com.umeng.common.util.h.a;
				 (( java.lang.StringBuilder ) v4 ).append ( v5 ); // invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
				 /* .line 154 */
				 (( java.lang.StringBuilder ) v4 ).append ( v2 ); // invoke-virtual {v4, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
				 (( java.lang.StringBuilder ) v4 ).toString ( ); // invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
				 /* .line 153 */
				 com.umeng.common.Log .a ( v1,v4 );
				 /* .line 156 */
				 /* if-nez v2, :cond_2 */
				 /* .line 181 */
			 } // :cond_0
		 } // :goto_2
		 /* .line 131 */
	 } // :cond_1
	 /* new-instance v4, Ljava/util/ArrayList; */
	 /* .line 132 */
	 int v6 = 1; // const/4 v6, 0x1
	 /* .line 131 */
	 /* invoke-direct {v4, v6}, Ljava/util/ArrayList;-><init>(I)V */
	 /* .line 133 */
	 /* new-instance v6, Lorg/apache/http/message/BasicNameValuePair; */
	 final String v7 = "content"; // const-string v7, "content"
	 /* invoke-direct {v6, v7, v1}, Lorg/apache/http/message/BasicNameValuePair;-><init>(Ljava/lang/String;Ljava/lang/String;)V */
	 /* .line 134 */
	 /* new-instance v1, Lorg/apache/http/client/entity/UrlEncodedFormEntity; */
	 /* .line 135 */
	 final String v6 = "UTF-8"; // const-string v6, "UTF-8"
	 /* invoke-direct {v1, v4, v6}, Lorg/apache/http/client/entity/UrlEncodedFormEntity;-><init>(Ljava/util/List;Ljava/lang/String;)V */
	 /* .line 134 */
	 (( org.apache.http.client.methods.HttpPost ) v2 ).setEntity ( v1 ); // invoke-virtual {v2, v1}, Lorg/apache/http/client/methods/HttpPost;->setEntity(Lorg/apache/http/HttpEntity;)V
	 /* :try_end_0 */
	 /* .catch Lorg/apache/http/client/ClientProtocolException; {:try_start_0 ..:try_end_0} :catch_0 */
	 /* .catch Ljava/io/IOException; {:try_start_0 ..:try_end_0} :catch_1 */
	 /* .catch Lorg/json/JSONException; {:try_start_0 ..:try_end_0} :catch_2 */
	 /* .line 168 */
	 /* :catch_0 */
	 /* move-exception v1 */
	 /* .line 169 */
	 v2 = com.umeng.common.net.s.a;
	 /* .line 170 */
	 /* new-instance v4, Ljava/lang/StringBuilder; */
	 java.lang.String .valueOf ( v3 );
	 /* invoke-direct {v4, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V */
	 /* .line 171 */
	 final String v3 = ":\tClientProtocolException,Failed to send message."; // const-string v3, ":\tClientProtocolException,Failed to send message."
	 (( java.lang.StringBuilder ) v4 ).append ( v3 ); // invoke-virtual {v4, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
	 /* .line 172 */
	 (( java.lang.StringBuilder ) v3 ).append ( p1 ); // invoke-virtual {v3, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
	 /* .line 170 */
	 (( java.lang.StringBuilder ) v3 ).toString ( ); // invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
	 /* .line 169 */
	 com.umeng.common.Log .c ( v2,v3,v1 );
	 /* .line 159 */
} // :cond_2
try { // :try_start_1
	 /* new-instance v1, Lorg/json/JSONObject; */
	 /* invoke-direct {v1, v2}, Lorg/json/JSONObject;-><init>(Ljava/lang/String;)V */
	 /* move-object v0, v1 */
	 /* .line 163 */
} // :cond_3
v2 = com.umeng.common.net.s.a;
/* new-instance v4, Ljava/lang/StringBuilder; */
java.lang.String .valueOf ( v3 );
/* invoke-direct {v4, v5}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V */
final String v5 = ":\tFailed to send message.StatusCode = "; // const-string v5, ":\tFailed to send message.StatusCode = "
(( java.lang.StringBuilder ) v4 ).append ( v5 ); // invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
v1 = /* .line 164 */
(( java.lang.StringBuilder ) v4 ).append ( v1 ); // invoke-virtual {v4, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;
/* .line 165 */
v4 = com.umeng.common.util.h.a;
(( java.lang.StringBuilder ) v1 ).append ( v4 ); // invoke-virtual {v1, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v1 ).append ( p1 ); // invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v1 ).toString ( ); // invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
/* .line 163 */
com.umeng.common.Log .c ( v2,v1 );
/* :try_end_1 */
/* .catch Lorg/apache/http/client/ClientProtocolException; {:try_start_1 ..:try_end_1} :catch_0 */
/* .catch Ljava/io/IOException; {:try_start_1 ..:try_end_1} :catch_1 */
/* .catch Lorg/json/JSONException; {:try_start_1 ..:try_end_1} :catch_2 */
/* .line 174 */
/* :catch_1 */
/* move-exception v1 */
/* .line 175 */
v2 = com.umeng.common.net.s.a;
/* new-instance v4, Ljava/lang/StringBuilder; */
java.lang.String .valueOf ( v3 );
/* invoke-direct {v4, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V */
final String v3 = ":\tIOException,Failed to send message."; // const-string v3, ":\tIOException,Failed to send message."
(( java.lang.StringBuilder ) v4 ).append ( v3 ); // invoke-virtual {v4, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v3 ).append ( p1 ); // invoke-virtual {v3, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v3 ).toString ( ); // invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
com.umeng.common.Log .c ( v2,v3,v1 );
/* goto/16 :goto_2 */
/* .line 178 */
/* :catch_2 */
/* move-exception v1 */
/* .line 179 */
v2 = com.umeng.common.net.s.a;
/* new-instance v4, Ljava/lang/StringBuilder; */
java.lang.String .valueOf ( v3 );
/* invoke-direct {v4, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V */
final String v3 = ":\tIOException,Failed to send message."; // const-string v3, ":\tIOException,Failed to send message."
(( java.lang.StringBuilder ) v4 ).append ( v3 ); // invoke-virtual {v4, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v3 ).append ( p1 ); // invoke-virtual {v3, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v3 ).toString ( ); // invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
com.umeng.common.Log .c ( v2,v3,v1 );
/* goto/16 :goto_2 */
} // :cond_4
/* move-object v1, v2 */
/* goto/16 :goto_1 */
} // .end method
private void b ( java.lang.String p0 ) {
/* .locals 3 */
/* .prologue */
/* .line 305 */
/* .line 306 */
v0 = com.umeng.common.util.h .d ( p1 );
/* if-nez v0, :cond_0 */
/* .line 307 */
v0 = com.umeng.common.net.t.c;
(( java.lang.String ) p1 ).trim ( ); // invoke-virtual {p1}, Ljava/lang/String;->trim()Ljava/lang/String;
v0 = (( java.lang.String ) v0 ).equals ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
v1 = com.umeng.common.net.t.b;
/* .line 308 */
(( java.lang.String ) p1 ).trim ( ); // invoke-virtual {p1}, Ljava/lang/String;->trim()Ljava/lang/String;
v1 = (( java.lang.String ) v1 ).equals ( v2 ); // invoke-virtual {v1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
/* xor-int/2addr v0, v1 */
/* if-nez v0, :cond_1 */
/* .line 309 */
} // :cond_0
/* new-instance v0, Ljava/lang/RuntimeException; */
/* new-instance v1, Ljava/lang/StringBuilder; */
final String v2 = "\u9a8c\u8bc1\u8bf7\u6c42\u65b9\u5f0f\u5931\u8d25["; // const-string v2, "\u9a8c\u8bc1\u8bf7\u6c42\u65b9\u5f0f\u5931\u8d25["
/* invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V */
(( java.lang.StringBuilder ) v1 ).append ( p1 ); // invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
final String v2 = "]"; // const-string v2, "]"
(( java.lang.StringBuilder ) v1 ).append ( v2 ); // invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v1 ).toString ( ); // invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
/* invoke-direct {v0, v1}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V */
/* throw v0 */
/* .line 310 */
} // :cond_1
return;
} // .end method
/* # virtual methods */
public com.umeng.common.net.u execute ( Object p0, java.lang.Class p1 ) {
/* .locals 5 */
/* .annotation system Ldalvik/annotation/Signature; */
/* value = { */
/* "<T:", */
/* "Lcom/umeng/common/net/u;", */
/* ">(", */
/* "Lcom/umeng/common/net/t;", */
/* "Ljava/lang/Class", */
/* "<TT;>;)TT;" */
/* } */
} // .end annotation
/* .prologue */
int v1 = 0; // const/4 v1, 0x0
/* .line 72 */
(( com.umeng.common.net.t ) p1 ).c ( ); // invoke-virtual {p1}, Lcom/umeng/common/net/t;->c()Ljava/lang/String;
(( java.lang.String ) v0 ).trim ( ); // invoke-virtual {v0}, Ljava/lang/String;->trim()Ljava/lang/String;
/* .line 73 */
/* invoke-direct {p0, v0}, Lcom/umeng/common/net/s;->b(Ljava/lang/String;)V */
/* .line 76 */
v2 = com.umeng.common.net.t.c;
v2 = (( java.lang.String ) v2 ).equals ( v0 ); // invoke-virtual {v2, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
if ( v2 != null) { // if-eqz v2, :cond_0
/* .line 77 */
(( com.umeng.common.net.t ) p1 ).b ( ); // invoke-virtual {p1}, Lcom/umeng/common/net/t;->b()Ljava/lang/String;
/* invoke-direct {p0, v0}, Lcom/umeng/common/net/s;->a(Ljava/lang/String;)Lorg/json/JSONObject; */
/* .line 82 */
} // :goto_0
/* if-nez v0, :cond_1 */
/* move-object v0, v1 */
/* .line 103 */
} // :goto_1
/* .line 78 */
} // :cond_0
v2 = com.umeng.common.net.t.b;
v0 = (( java.lang.String ) v2 ).equals ( v0 ); // invoke-virtual {v2, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
if ( v0 != null) { // if-eqz v0, :cond_2
/* .line 79 */
v0 = this.d;
(( com.umeng.common.net.t ) p1 ).a ( ); // invoke-virtual {p1}, Lcom/umeng/common/net/t;->a()Lorg/json/JSONObject;
/* invoke-direct {p0, v0, v2}, Lcom/umeng/common/net/s;->a(Ljava/lang/String;Lorg/json/JSONObject;)Lorg/json/JSONObject; */
/* .line 88 */
} // :cond_1
int v2 = 1; // const/4 v2, 0x1
try { // :try_start_0
/* new-array v2, v2, [Ljava/lang/Class; */
int v3 = 0; // const/4 v3, 0x0
/* const-class v4, Lorg/json/JSONObject; */
/* aput-object v4, v2, v3 */
(( java.lang.Class ) p2 ).getConstructor ( v2 ); // invoke-virtual {p2, v2}, Ljava/lang/Class;->getConstructor([Ljava/lang/Class;)Ljava/lang/reflect/Constructor;
/* .line 89 */
int v3 = 1; // const/4 v3, 0x1
/* new-array v3, v3, [Ljava/lang/Object; */
int v4 = 0; // const/4 v4, 0x0
/* aput-object v0, v3, v4 */
(( java.lang.reflect.Constructor ) v2 ).newInstance ( v3 ); // invoke-virtual {v2, v3}, Ljava/lang/reflect/Constructor;->newInstance([Ljava/lang/Object;)Ljava/lang/Object;
/* check-cast v0, Lcom/umeng/common/net/u; */
/* :try_end_0 */
/* .catch Ljava/lang/SecurityException; {:try_start_0 ..:try_end_0} :catch_0 */
/* .catch Ljava/lang/NoSuchMethodException; {:try_start_0 ..:try_end_0} :catch_1 */
/* .catch Ljava/lang/IllegalArgumentException; {:try_start_0 ..:try_end_0} :catch_2 */
/* .catch Ljava/lang/InstantiationException; {:try_start_0 ..:try_end_0} :catch_3 */
/* .catch Ljava/lang/IllegalAccessException; {:try_start_0 ..:try_end_0} :catch_4 */
/* .catch Ljava/lang/reflect/InvocationTargetException; {:try_start_0 ..:try_end_0} :catch_5 */
/* .line 90 */
/* :catch_0 */
/* move-exception v0 */
/* .line 91 */
v2 = com.umeng.common.net.s.a;
final String v3 = "SecurityException"; // const-string v3, "SecurityException"
com.umeng.common.Log .b ( v2,v3,v0 );
} // :goto_2
/* move-object v0, v1 */
/* .line 103 */
/* .line 92 */
/* :catch_1 */
/* move-exception v0 */
/* .line 93 */
v2 = com.umeng.common.net.s.a;
final String v3 = "NoSuchMethodException"; // const-string v3, "NoSuchMethodException"
com.umeng.common.Log .b ( v2,v3,v0 );
/* .line 94 */
/* :catch_2 */
/* move-exception v0 */
/* .line 95 */
v2 = com.umeng.common.net.s.a;
final String v3 = "IllegalArgumentException"; // const-string v3, "IllegalArgumentException"
com.umeng.common.Log .b ( v2,v3,v0 );
/* .line 96 */
/* :catch_3 */
/* move-exception v0 */
/* .line 97 */
v2 = com.umeng.common.net.s.a;
final String v3 = "InstantiationException"; // const-string v3, "InstantiationException"
com.umeng.common.Log .b ( v2,v3,v0 );
/* .line 98 */
/* :catch_4 */
/* move-exception v0 */
/* .line 99 */
v2 = com.umeng.common.net.s.a;
final String v3 = "IllegalAccessException"; // const-string v3, "IllegalAccessException"
com.umeng.common.Log .b ( v2,v3,v0 );
/* .line 100 */
/* :catch_5 */
/* move-exception v0 */
/* .line 101 */
v2 = com.umeng.common.net.s.a;
final String v3 = "InvocationTargetException"; // const-string v3, "InvocationTargetException"
com.umeng.common.Log .b ( v2,v3,v0 );
} // :cond_2
/* move-object v0, v1 */
} // .end method
public com.umeng.common.net.s setHeader ( java.util.Map p0 ) {
/* .locals 0 */
/* .annotation system Ldalvik/annotation/Signature; */
/* value = { */
/* "(", */
/* "Ljava/util/Map", */
/* "<", */
/* "Ljava/lang/String;", */
/* "Ljava/lang/String;", */
/* ">;)", */
/* "Lcom/umeng/common/net/s;" */
/* } */
} // .end annotation
/* .prologue */
/* .line 300 */
this.b = p1;
/* .line 301 */
} // .end method
public Boolean shouldCompressData ( ) {
/* .locals 1 */
/* .prologue */
/* .line 186 */
int v0 = 0; // const/4 v0, 0x0
} // .end method
