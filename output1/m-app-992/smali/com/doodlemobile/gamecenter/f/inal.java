public class inal {
	 /* # direct methods */
	 public inal ( ) {
		 /* .locals 0 */
		 /* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
		 return;
	 } // .end method
	 public static a ( java.lang.String p0 ) {
		 /* .locals 8 */
		 int v7 = 0; // const/4 v7, 0x0
		 try { // :try_start_0
			 /* new-instance v0, Lorg/apache/http/params/BasicHttpParams; */
			 /* invoke-direct {v0}, Lorg/apache/http/params/BasicHttpParams;-><init>()V */
			 /* new-instance v4, Ljava/util/ArrayList; */
			 /* invoke-direct {v4}, Ljava/util/ArrayList;-><init>()V */
			 /* new-instance v6, Lorg/apache/http/impl/client/DefaultHttpClient; */
			 /* invoke-direct {v6}, Lorg/apache/http/impl/client/DefaultHttpClient;-><init>()V */
			 /* :try_end_0 */
			 /* .catch Ljava/lang/Exception; {:try_start_0 ..:try_end_0} :catch_0 */
			 /* .catchall {:try_start_0 ..:try_end_0} :catchall_1 */
			 try { // :try_start_1
				 /* new-instance v3, Ljava/net/URI; */
				 /* invoke-direct {v3, p0}, Ljava/net/URI;-><init>(Ljava/lang/String;)V */
				 (( java.net.URI ) v3 ).getScheme ( ); // invoke-virtual {v3}, Ljava/net/URI;->getScheme()Ljava/lang/String;
				 (( java.net.URI ) v3 ).getHost ( ); // invoke-virtual {v3}, Ljava/net/URI;->getHost()Ljava/lang/String;
				 v2 = 				 (( java.net.URI ) v3 ).getPort ( ); // invoke-virtual {v3}, Ljava/net/URI;->getPort()I
				 (( java.net.URI ) v3 ).getPath ( ); // invoke-virtual {v3}, Ljava/net/URI;->getPath()Ljava/lang/String;
				 final String v5 = "UTF-8"; // const-string v5, "UTF-8"
				 org.apache.http.client.utils.URLEncodedUtils .format ( v4,v5 );
				 int v5 = 0; // const/4 v5, 0x0
				 /* invoke-static/range {v0 ..v5}, Lorg/apache/http/client/utils/URIUtils;->createURI(Ljava/lang/String;Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;)Ljava/net/URI; */
				 /* new-instance v1, Lorg/apache/http/client/methods/HttpGet; */
				 v2 = 				 /* invoke-direct {v1, v0}, Lorg/apache/http/client/methods/HttpGet;-><init>(Ljava/net/URI;)V */
				 /* const/16 v3, 0xc8 */
				 /* if-eq v2, v3, :cond_1 */
				 (( org.apache.http.client.methods.HttpGet ) v1 ).abort ( ); // invoke-virtual {v1}, Lorg/apache/http/client/methods/HttpGet;->abort()V
				 /* :try_end_1 */
				 /* .catch Ljava/lang/Exception; {:try_start_1 ..:try_end_1} :catch_1 */
				 /* .catchall {:try_start_1 ..:try_end_1} :catchall_2 */
				 /* move-object v0, v7 */
			 } // :goto_0
		 } // :cond_0
	 } // :goto_1
} // :cond_1
try { // :try_start_2
	 org.apache.http.util.EntityUtils .toByteArray ( v0 );
	 /* :try_end_2 */
	 /* .catch Ljava/lang/Exception; {:try_start_2 ..:try_end_2} :catch_1 */
	 /* .catchall {:try_start_2 ..:try_end_2} :catchall_2 */
	 /* :catch_0 */
	 /* move-exception v0 */
	 /* move-object v1, v7 */
} // :goto_2
try { // :try_start_3
	 final String v2 = "ssc"; // const-string v2, "ssc"
	 /* new-instance v3, Ljava/lang/StringBuilder; */
	 /* invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V */
	 final String v4 = "getImageFromNet error"; // const-string v4, "getImageFromNet error"
	 (( java.lang.StringBuilder ) v3 ).append ( v4 ); // invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
	 (( java.lang.Exception ) v0 ).getMessage ( ); // invoke-virtual {v0}, Ljava/lang/Exception;->getMessage()Ljava/lang/String;
	 (( java.lang.StringBuilder ) v3 ).append ( v0 ); // invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
	 (( java.lang.StringBuilder ) v0 ).toString ( ); // invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
	 android.util.Log .w ( v2,v0 );
	 com.doodlemobile.gamecenter.f.a .b ( p0 );
	 /* :try_end_3 */
	 /* .catchall {:try_start_3 ..:try_end_3} :catchall_3 */
	 if ( v0 != null) { // if-eqz v0, :cond_2
		 try { // :try_start_4
			 /* array-length v2, v0 */
			 /* if-nez v2, :cond_3 */
		 } // :cond_2
		 /* new-instance v2, Ljava/lang/Exception; */
		 /* invoke-direct {v2}, Ljava/lang/Exception;-><init>()V */
		 /* throw v2 */
		 /* :try_end_4 */
		 /* .catchall {:try_start_4 ..:try_end_4} :catchall_0 */
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
