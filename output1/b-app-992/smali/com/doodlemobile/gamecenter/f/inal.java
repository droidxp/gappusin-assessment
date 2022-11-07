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
		 final String v2 = "Exception: "; // const-string v2, "Exception: "
		 (( java.lang.StringBuilder ) v1 ).append ( v9 ); // invoke-virtual {v1, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
		 /* iget v2, p0, Lcom/doodlemobile/gamecenter/f/b;->a:I */
		 (( java.lang.StringBuilder ) v1 ).append ( v2 ); // invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;
		 (( java.lang.StringBuilder ) v1 ).toString ( ); // invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
		 android.util.Log .w ( v8,v1 );
		 (( java.net.SocketException ) v0 ).printStackTrace ( ); // invoke-virtual {v0}, Ljava/net/SocketException;->printStackTrace()V
	 } // :goto_1
} // :cond_0
try { // :try_start_1
	 (( java.lang.StringBuffer ) v0 ).toString ( ); // invoke-virtual {v0}, Ljava/lang/StringBuffer;->toString()Ljava/lang/String;
	 com.doodlemobile.gamecenter.c.m .b ( v0 );
	 if ( v0 != null) { // if-eqz v0, :cond_1
		 /* new-instance v3, Lcom/doodlemobile/gamecenter/c/n; */
		 (( java.lang.String ) v0 ).getBytes ( ); // invoke-virtual {v0}, Ljava/lang/String;->getBytes()[B
		 /* invoke-direct {v3, v0}, Lcom/doodlemobile/gamecenter/c/n;-><init>([B)V */
		 /* move-object v0, v3 */
	 } // :goto_2
	 /* if-nez v0, :cond_2 */
	 /* new-instance v0, Ljava/lang/Exception; */
	 final String v1 = "Server return null"; // const-string v1, "Server return null"
	 /* invoke-direct {v0, v1}, Ljava/lang/Exception;-><init>(Ljava/lang/String;)V */
	 /* throw v0 */
	 /* :try_end_1 */
	 /* .catch Ljava/net/SocketException; {:try_start_1 ..:try_end_1} :catch_0 */
	 /* .catch Ljava/net/SocketTimeoutException; {:try_start_1 ..:try_end_1} :catch_1 */
	 /* .catch Ljava/lang/Exception; {:try_start_1 ..:try_end_1} :catch_2 */
	 /* :catch_1 */
	 /* move-exception v0 */
	 final String v1 = "Client"; // const-string v1, "Client"
	 /* new-instance v1, Ljava/lang/StringBuilder; */
	 /* invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V */
	 final String v2 = "Exception: "; // const-string v2, "Exception: "
	 (( java.lang.StringBuilder ) v1 ).append ( v9 ); // invoke-virtual {v1, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
	 /* iget v2, p0, Lcom/doodlemobile/gamecenter/f/b;->a:I */
	 (( java.lang.StringBuilder ) v1 ).append ( v2 ); // invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;
	 (( java.lang.StringBuilder ) v1 ).toString ( ); // invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
	 android.util.Log .w ( v8,v1 );
	 (( java.net.SocketTimeoutException ) v0 ).printStackTrace ( ); // invoke-virtual {v0}, Ljava/net/SocketTimeoutException;->printStackTrace()V
} // :cond_1
int v0 = 0; // const/4 v0, 0x0
} // :cond_2
try { // :try_start_2
(( com.doodlemobile.gamecenter.c.n ) v0 ).b ( ); // invoke-virtual {v0}, Lcom/doodlemobile/gamecenter/c/n;->b()J
/* move-result-wide v3 */
/* int-to-long v5, v5 */
/* cmp-long v3, v3, v5 */
/* if-nez v3, :cond_4 */
java.lang.System .currentTimeMillis ( );
/* move-result-wide v3 */
/* new-instance v5, Ljava/util/HashMap; */
/* invoke-direct {v5}, Ljava/util/HashMap;-><init>()V */
final String v6 = "duration"; // const-string v6, "duration"
/* sub-long v1, v3, v1 */
java.lang.String .valueOf ( v1,v2 );
final String v1 = "api"; // const-string v1, "api"
(( com.doodlemobile.gamecenter.c.l ) p1 ).e ( ); // invoke-virtual {p1}, Lcom/doodlemobile/gamecenter/c/l;->e()Ljava/lang/String;
java.lang.String .valueOf ( v2 );
/* new-instance v1, Ljava/text/SimpleDateFormat; */
final String v2 = "yyyy-MM-dd HH:mm:ss"; // const-string v2, "yyyy-MM-dd HH:mm:ss"
/* invoke-direct {v1, v2}, Ljava/text/SimpleDateFormat;-><init>(Ljava/lang/String;)V */
final String v2 = "GMT+8"; // const-string v2, "GMT+8"
java.util.TimeZone .getTimeZone ( v2 );
(( java.text.SimpleDateFormat ) v1 ).setTimeZone ( v2 ); // invoke-virtual {v1, v2}, Ljava/text/SimpleDateFormat;->setTimeZone(Ljava/util/TimeZone;)V
/* new-instance v2, Ljava/util/Date; */
/* invoke-direct {v2}, Ljava/util/Date;-><init>()V */
(( java.text.SimpleDateFormat ) v1 ).format ( v2 ); // invoke-virtual {v1, v2}, Ljava/text/SimpleDateFormat;->format(Ljava/util/Date;)Ljava/lang/String;
final String v2 = "time"; // const-string v2, "time"
v0 = (( com.doodlemobile.gamecenter.c.l ) p1 ).a ( v0 ); // invoke-virtual {p1, v0}, Lcom/doodlemobile/gamecenter/c/l;->a(Lcom/doodlemobile/gamecenter/c/n;)Z
if ( v0 != null) { // if-eqz v0, :cond_3
	 /* goto/16 :goto_1 */
} // :cond_3
/* goto/16 :goto_1 */
} // :cond_4
/* new-instance v0, Ljava/lang/Exception; */
final String v1 = "cloud client exception"; // const-string v1, "cloud client exception"
/* invoke-direct {v0, v1}, Ljava/lang/Exception;-><init>(Ljava/lang/String;)V */
/* throw v0 */
/* :try_end_2 */
/* .catch Ljava/net/SocketException; {:try_start_2 ..:try_end_2} :catch_0 */
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
