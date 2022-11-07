public class inal {
	 /* # instance fields */
	 private Integer a;
	 private org.apache.http.client.HttpClient b;
	 private org.apache.http.params.HttpParams c;
	 private Integer d;
	 private Integer e;
	 /* # direct methods */
	 public inal ( ) {
		 /* .locals 2 */
		 int v1 = 0; // const/4 v1, 0x0
		 /* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
		 int v0 = 0; // const/4 v0, 0x0
		 /* iput v0, p0, Lcom/doodlemobile/gamecenter/f/b;->a:I */
		 this.b = v1;
		 this.c = v1;
		 /* const/16 v0, 0xfa0 */
		 /* iput v0, p0, Lcom/doodlemobile/gamecenter/f/b;->d:I */
		 /* const/16 v0, 0x4e20 */
		 /* iput v0, p0, Lcom/doodlemobile/gamecenter/f/b;->e:I */
		 /* new-instance v0, Lorg/apache/http/params/BasicHttpParams; */
		 /* invoke-direct {v0}, Lorg/apache/http/params/BasicHttpParams;-><init>()V */
		 this.c = v0;
		 v0 = this.c;
		 /* iget v1, p0, Lcom/doodlemobile/gamecenter/f/b;->d:I */
		 org.apache.http.params.HttpConnectionParams .setConnectionTimeout ( v0,v1 );
		 v0 = this.c;
		 /* iget v1, p0, Lcom/doodlemobile/gamecenter/f/b;->e:I */
		 org.apache.http.params.HttpConnectionParams .setSoTimeout ( v0,v1 );
		 /* new-instance v0, Lorg/apache/http/impl/client/DefaultHttpClient; */
		 v1 = this.c;
		 /* invoke-direct {v0, v1}, Lorg/apache/http/impl/client/DefaultHttpClient;-><init>(Lorg/apache/http/params/HttpParams;)V */
		 this.b = v0;
		 return;
	 } // .end method
	 public static Integer a ( Object p0 ) {
		 /* .locals 1 */
		 /* new-instance v0, Lcom/doodlemobile/gamecenter/f/b; */
		 /* invoke-direct {v0}, Lcom/doodlemobile/gamecenter/f/b;-><init>()V */
		 v0 = 		 /* invoke-direct {v0, p0}, Lcom/doodlemobile/gamecenter/f/b;->b(Lcom/doodlemobile/gamecenter/c/l;)I */
	 } // .end method
	 private Integer b ( Object p0 ) {
		 /* .locals 10 */
		 final String v9 = "Exception: "; // const-string v9, "Exception: "
		 final String v8 = "Client"; // const-string v8, "Client"
		 v0 = this.c;
		 v1 = 		 (( com.doodlemobile.gamecenter.c.l ) p1 ).b ( ); // invoke-virtual {p1}, Lcom/doodlemobile/gamecenter/c/l;->b()I
		 org.apache.http.params.HttpConnectionParams .setConnectionTimeout ( v0,v1 );
		 v0 = this.c;
		 v1 = 		 (( com.doodlemobile.gamecenter.c.l ) p1 ).c ( ); // invoke-virtual {p1}, Lcom/doodlemobile/gamecenter/c/l;->c()I
		 org.apache.http.params.HttpConnectionParams .setSoTimeout ( v0,v1 );
		 (( com.doodlemobile.gamecenter.c.l ) p1 ).a ( ); // invoke-virtual {p1}, Lcom/doodlemobile/gamecenter/c/l;->a()Lorg/apache/http/client/methods/HttpPost;
		 try { // :try_start_0
			 java.lang.System .currentTimeMillis ( );
			 /* move-result-wide v1 */
			 v3 = this.b;
			 /* new-instance v3, Ljava/io/BufferedReader; */
			 /* new-instance v4, Ljava/io/InputStreamReader; */
			 /* invoke-direct {v4, v0}, Ljava/io/InputStreamReader;-><init>(Ljava/io/InputStream;)V */
			 /* invoke-direct {v3, v4}, Ljava/io/BufferedReader;-><init>(Ljava/io/Reader;)V */
			 /* new-instance v0, Ljava/lang/StringBuffer; */
			 /* invoke-direct {v0}, Ljava/lang/StringBuffer;-><init>()V */
			 /* const/16 v4, 0x2800 */
			 /* new-array v4, v4, [C */
		 } // :goto_0
		 v5 = 		 (( java.io.BufferedReader ) v3 ).read ( v4 ); // invoke-virtual {v3, v4}, Ljava/io/BufferedReader;->read([C)I
		 int v6 = -1; // const/4 v6, -0x1
		 /* if-eq v5, v6, :cond_0 */
		 /* new-instance v6, Ljava/lang/String; */
		 int v7 = 0; // const/4 v7, 0x0
		 /* invoke-direct {v6, v4, v7, v5}, Ljava/lang/String;-><init>([CII)V */
		 (( java.lang.StringBuffer ) v0 ).append ( v6 ); // invoke-virtual {v0, v6}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;
		 /* :try_end_0 */
		 /* .catch Ljava/net/SocketException; {:try_start_0 ..:try_end_0} :catch_0 */
		 /* .catch Ljava/net/SocketTimeoutException; {:try_start_0 ..:try_end_0} :catch_1 */
		 /* .catch Ljava/lang/Exception; {:try_start_0 ..:try_end_0} :catch_2 */
		 /* :catch_0 */
		 /* move-exception v0 */
		 final String v1 = "Client"; // const-string v1, "Client"
		 /* new-instance v1, Ljava/lang/StringBuilder; */
		 /* invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V */
		 final Stri ..:try_end_4} :catchall_0 */
		 /* :catchall_0 */
		 /* move-exception v2 */
	 } // :goto_3
	 if ( v1 != null) { // if-eqz v1, :cond_0
	 } // :cond_3
	 if ( v1 != null) { // if-eqz v1, :cond_0
		 /* :catchall_1 */
		 /* move-exception v0 */
		 /* move-object v0, v7 */
		 /* move-object v1, v7 */
		 /* :catchall_2 */
		 /* move-exception v0 */
		 /* move-object v0, v7 */
		 /* move-object v1, v6 */
		 /* :catchall_3 */
		 /* move-exception v0 */
		 /* move-object v0, v7 */
		 /* :catch_1 */
		 /* move-exception v0 */
		 /* move-object v1, v6 */
	 } // .end method
	 private static b ( java.lang.String p0 ) {
		 /* .locals 8 */
		 int v7 = 0; // const/4 v7, 0x0
		 /* new-instance v6, Lorg/apache/http/impl/client/DefaultHttpClient; */
		 /* invoke-direct {v6}, Lorg/apache/http/impl/client/DefaultHttpClient;-><init>()V */
		 final String v0 = "https"; // const-string v0, "https"
		 final String v1 = "http"; // const-string v1, "http"
		 (( java.lang.String ) p0 ).replace ( v0, v1 ); // invoke-virtual {p0, v0, v1}, Ljava/lang/String;->replace(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Ljava/lang/String;
		 try { // :try_start_0
			 /* new-instance v1, Lorg/apache/http/params/BasicHttpParams; */
			 /* invoke-direct {v1}, Lorg/apache/http/params/BasicHttpParams;-><init>()V */
			 /* new-instance v4, Ljava/util/ArrayList; */
			 /* invoke-direct {v4}, Ljava/util/ArrayList;-><init>()V */
			 /* new-instance v3, Ljava/net/URI; */
			 /* invoke-direct {v3, v0}, Ljava/net/URI;-><init>(Ljava/lang/String;)V */
			 (( java.net.URI ) v3 ).getScheme ( ); // invoke-virtual {v3}, Ljava/net/URI;->getScheme()Ljava/lang/String;
			 (( java.net.URI ) v3 ).getHost ( ); // invoke-virtual {v3}, Ljava/net/URI;->getHost()Ljava/lang/String;
			 v2 = 			 (( java.net.URI ) v3 ).getPort ( ); // invoke-virtual {v3}, Ljava/net/URI;->getPort()I
			 (( java.net.URI ) v3 ).getPath ( ); // invoke-virtual {v3}, Ljava/net/URI;->getPath()Ljava/lang/String;
			 final String v5 = "UTF-8"; // const-string v5, "UTF-8"
			 org.apache.http.client.utils.URLEncodedUtils .format ( v4,v5 );
			 int v5 = 0; // const/4 v5, 0x0
			 /* invoke-static/range {v0 ..v5}, Lorg/apache/http/client/utils/URIUtils;->createURI(Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/net/URI; */
			 /* new-instance v1, Lorg/apache/http/client/methods/HttpGet; */
			 v2 = 			 /* invoke-direct {v1, v0}, Lorg/apache/http/client/methods/HttpGet;-><init>(Ljava/net/URI;)V */
			 /* const/16 v3, 0xc8 */
			 /* if-eq v2, v3, :cond_0 */
			 (( org.apache.http.client.methods.HttpGet ) v1 ).abort ( ); // invoke-virtual {v1}, Lorg/apache/http/client/methods/HttpGet;->abort()V
			 /* :try_end_0 */
			 /* .catch Ljava/lang/Exception; {:try_start_0 ..:try_end_0} :catch_0 */
			 /* .catchall {:try_start_0 ..:try_end_0} :catchall_0 */
			 /* move-object v0, v7 */
		 } // :goto_0
		 try { // :try_start_1
			 /* :try_end_1 */
			 /* .catch Ljava/lang/Exception; {:try_start_1 ..:try_end_1} :catch_3 */
		 } // :goto_1
	 } // :cond_0
	 try { // :try_start_2
		 org.apache.http.util.EntityUtils .toByteArray ( v0 );
		 /* :try_end_2 */
		 /* .catch Ljava/lang/Exception; {:try_start_2 ..:try_end_2} :catch_0 */
		 /* .catchall {:try_start_2 ..:try_end_2} :catchall_0 */
		 /* :catch_0 */
		 /* move-exception v0 */
		 try { // :try_start_3
			 final String v1 = "ssc"; // const-string v1, "ssc"
			 /* new-instance v2, Ljava/lang/StringBuilder; */
			 /* invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V */
			 final String v3 = "getImageFromNet error"; // const-string v3, "getImageFromNet error"
			 (( java.lang.StringBuilder ) v2 ).append ( v3 ); // invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
			 (( java.lang.Exception ) v0 ).getMessage ( ); // invoke-virtual {v0}, Ljava/lang/Exception;->getMessage()Ljava/lang/String;
			 (( java.lang.StringBuilder ) v2 ).append ( v0 ); // invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
			 (( java.lang.StringBuilder ) v0 ).toString ( ); // invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
			 android.util.Log .w ( v1,v0 );
			 /* :try_end_3 */
			 /* .catchall {:try_start_3 ..:try_end_3} :catchall_0 */
			 try { // :try_start_4
				 /* :try_end_4 */
				 /* .catch Ljava/lang/Exception; {:try_start_4 ..:try_end_4} :catch_2 */
			 } // :goto_2
			 /* move-object v0, v7 */
			 /* :catchall_0 */
			 /* move-exception v0 */
			 try { // :try_start_5
				 /* :try_end_5 */
				 /* .catch Ljava/lang/Exception; {:try_start_5 ..:try_end_5} :catch_1 */
			 } // :goto_3
			 /* throw v0 */
			 /* :catch_1 */
			 /* move-exception v1 */
			 /* :catch_2 */
			 /* move-exception v0 */
			 /* :catch_3 */
			 /* move-exception v1 */
		 } // .end method
_start_2 ..:try_end_2} :catch_0 */
/* .catch Ljava/net/SocketTimeoutException; {:try_start_2 ..:try_end_2} :catch_1 */
/* .catch Ljava/lang/Exception; {:try_start_2 ..:try_end_2} :catch_2 */
/* :catch_2 */
/* move-exception v0 */
/* iput v1, p0, Lcom/doodlemobile/gamecenter/f/b;->a:I */
final String v1 = "Client"; // const-string v1, "Client"
/* new-instance v1, Ljava/lang/StringBuilder; */
/* invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V */
final String v2 = "Exception: "; // const-string v2, "Exception: "
(( java.lang.StringBuilder ) v1 ).append ( v9 ); // invoke-virtual {v1, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
/* iget v2, p0, Lcom/doodlemobile/gamecenter/f/b;->a:I */
(( java.lang.StringBuilder ) v1 ).append ( v2 ); // invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v1 ).toString ( ); // invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
android.util.Log .w ( v8,v1 );
(( java.lang.Exception ) v0 ).printStackTrace ( ); // invoke-virtual {v0}, Ljava/lang/Exception;->printStackTrace()V
/* goto/16 :goto_1 */
} // .end method
