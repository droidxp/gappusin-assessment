public class com.a.f.j {
	 /* # static fields */
	 private static a;
	 private static java.lang.String b;
	 /* # direct methods */
	 public static void a ( ) {
		 /* .locals 2 */
		 int v0 = 0; // const/4 v0, 0x0
		 /* new-instance v0, Ljava/lang/StringBuilder; */
		 final String v1 = "http://"; // const-string v1, "http://"
		 /* invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V */
		 com.a.f.g .d ( );
		 (( java.lang.StringBuilder ) v0 ).append ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
		 (( java.lang.StringBuilder ) v0 ).toString ( ); // invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
		 return;
	 } // .end method
	 public static void a ( java.lang.String p0 ) {
		 /* .locals 0 */
		 /* if-nez p0, :cond_0 */
	 } // :goto_0
	 return;
} // :cond_0
} // .end method
public static void a ( Object[] p0 ) {
/* .locals 1 */
/* if-nez p0, :cond_0 */
} // :goto_0
return;
} // :cond_0
int v0 = 0; // const/4 v0, 0x0
} // .end method
static void a ( Object[] p0, java.lang.String p1 ) { //synthethic
/* .locals 0 */
com.a.f.j .b ( p0,p1 );
return;
} // .end method
public static void b ( ) {
/* .locals 2 */
com.a.f.j .a ( );
/* new-instance v0, Ljava/lang/StringBuilder; */
v1 = com.a.f.f.a;
java.lang.String .valueOf ( v1 );
/* invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V */
v1 = com.a.f.f.b;
(( java.lang.StringBuilder ) v0 ).append ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
final String v1 = "get_json.php"; // const-string v1, "get_json.php"
(( java.lang.StringBuilder ) v0 ).append ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v0 ).toString ( ); // invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
com.a.f.j .d ( );
return;
} // .end method
private static void b ( Object[] p0, java.lang.String p1 ) {
/* .locals 10 */
int v1 = 0; // const/4 v1, 0x0
int v4 = 0; // const/4 v4, 0x0
int v2 = 1; // const/4 v2, 0x1
/* if-nez p0, :cond_0 */
} // :goto_0
return;
} // :cond_0
try { // :try_start_0
/* new-instance v0, Ljava/net/URL; */
/* invoke-direct {v0, p1}, Ljava/net/URL;-><init>(Ljava/lang/String;)V */
(( java.net.URL ) v0 ).openConnection ( ); // invoke-virtual {v0}, Ljava/net/URL;->openConnection()Ljava/net/URLConnection;
/* check-cast v0, Ljava/net/HttpURLConnection; */
/* :try_end_0 */
/* .catch Ljava/net/MalformedURLException; {:try_start_0 ..:try_end_0} :catch_13 */
/* .catch Ljava/io/IOException; {:try_start_0 ..:try_end_0} :catch_3 */
/* .catch Ljava/lang/Exception; {:try_start_0 ..:try_end_0} :catch_6 */
/* .catchall {:try_start_0 ..:try_end_0} :catchall_0 */
try { // :try_start_1
final String v3 = "POST"; // const-string v3, "POST"
(( java.net.HttpURLConnection ) v0 ).setRequestMethod ( v3 ); // invoke-virtual {v0, v3}, Ljava/net/HttpURLConnection;->setRequestMethod(Ljava/lang/String;)V
int v3 = 1; // const/4 v3, 0x1
(( java.net.HttpURLConnection ) v0 ).setDoOutput ( v3 ); // invoke-virtual {v0, v3}, Ljava/net/HttpURLConnection;->setDoOutput(Z)V
int v3 = 1; // const/4 v3, 0x1
(( java.net.HttpURLConnection ) v0 ).setDoInput ( v3 ); // invoke-virtual {v0, v3}, Ljava/net/HttpURLConnection;->setDoInput(Z)V
(( java.net.HttpURLConnection ) v0 ).getOutputStream ( ); // invoke-virtual {v0}, Ljava/net/HttpURLConnection;->getOutputStream()Ljava/io/OutputStream;
/* :try_end_1 */
/* .catch Ljava/net/MalformedURLException; {:try_start_1 ..:try_end_1} :catch_14 */
/* .catch Ljava/io/IOException; {:try_start_1 ..:try_end_1} :catch_10 */
/* .catch Ljava/lang/Exception; {:try_start_1 ..:try_end_1} :catch_d */
/* .catchall {:try_start_1 ..:try_end_1} :catchall_1 */
try { // :try_start_2
(( java.io.OutputStream ) v5 ).write ( p0 ); // invoke-virtual {v5, p0}, Ljava/io/OutputStream;->write([B)V
(( java.io.OutputStream ) v5 ).flush ( ); // invoke-virtual {v5}, Ljava/io/OutputStream;->flush()V
(( java.net.HttpURLConnection ) v0 ).getInputStream ( ); // invoke-virtual {v0}, Ljava/net/HttpURLConnection;->getInputStream()Ljava/io/InputStream;
/* :try_end_2 */
/* .catch Ljava/net/MalformedURLException; {:try_start_2 ..:try_end_2} :catch_15 */
/* .catch Ljava/io/IOException; {:try_start_2 ..:try_end_2} :catch_11 */
/* .catch Ljava/lang/Exception; {:try_start_2 ..:try_end_2} :catch_e */
/* .catchall {:try_start_2 ..:try_end_2} :catchall_2 */
if ( v3 != null) { // if-eqz v3, :cond_1
try { // :try_start_3
	 v6 = 	 (( java.net.HttpURLConnection ) v0 ).getContentLength ( ); // invoke-virtual {v0}, Ljava/net/HttpURLConnection;->getContentLength()I
	 /* mul-int/lit8 v6, v6, 0x2 */
	 /* new-array v6, v6, [B */
} // :goto_1
v7 = (( java.io.InputStream ) v3 ).read ( v6 ); // invoke-virtual {v3, v6}, Ljava/io/InputStream;->read([B)I
int v8 = -1; // const/4 v8, -0x1
/* if-ne v7, v8, :cond_5 */
if ( v4 != null) { // if-eqz v4, :cond_1
	 (( java.lang.String ) v4 ).trim ( ); // invoke-virtual {v4}, Ljava/lang/String;->trim()Ljava/lang/String;
	 final String v6 = "(#)!@&$^*%"; // const-string v6, "(#)!@&$^*%"
	 com.a.f.c .a ( v4,v6 );
	 com.a.f.h .a ( v4 );
	 /* :try_end_3 */
	 /* .catch Ljava/net/MalformedURLException; {:try_start_3 ..:try_end_3} :catch_0 */
	 /* .catch Ljava/io/IOException; {:try_start_3 ..:try_end_3} :catch_12 */
	 /* .catch Ljava/lang/Exception; {:try_start_3 ..:try_end_3} :catch_f */
	 /* .catchall {:try_start_3 ..:try_end_3} :catchall_3 */
} // :cond_1
if ( v5 != null) { // if-eqz v5, :cond_2
	 try { // :try_start_4
		 (( java.io.OutputStream ) v5 ).close ( ); // invoke-virtual {v5}, Ljava/io/OutputStream;->close()V
		 /* :try_end_4 */
		 /* .catch Ljava/io/IOException; {:try_start_4 ..:try_end_4} :catch_b */
	 } // :cond_2
} // :goto_2
if ( v3 != null) { // if-eqz v3, :cond_3
	 try { // :try_start_5
		 (( java.io.InputStream ) v3 ).close ( ); // invoke-virtual {v3}, Ljava/io/InputStream;->close()V
		 /* :try_end_5 */
		 /* .catch Ljava/io/IOException; {:try_start_5 ..:try_end_5} :catch_c */
	 } // :cond_3
} // :goto_3
if ( v0 != null) { // if-eqz v0, :cond_4
	 (( java.net.HttpURLConnection ) v0 ).disconnect ( ); // invoke-virtual {v0}, Ljava/net/HttpURLConnection;->disconnect()V
} // :cond_4
/* move v0, v1 */
} // :goto_4
/* add-int/lit8 v2, v2, 0x1 */
if ( v0 != null) { // if-eqz v0, :cond_f
/* const/16 v2, 0xa */
/* if-gt v0, v2, :cond_f */
com.a.f.j .b ( );
} // :cond_5
try { // :try_start_6
/* new-instance v4, Ljava/lang/String; */
/* invoke-direct {v4, v6}, Ljava/lang/String;-><init>([B)V */
/* :try_end_6 */
/* .catch Ljava/net/MalformedURLException; {:try_start_6 ..:try_end_6} :catch_0 */
/* .catch Ljava/io/IOException; {:try_start_6 ..:try_end_6} :catch_12 */
/* .catch Ljava/lang/Exception; {:try_start_6 ..:try_end_6} :catch_f */
/* .catchall {:try_start_6 ..:try_end_6} :catchall_3 */
/* :catch_0 */
/* move-exception v2 */
/* move-object v4, v5 */
/* move-object v9, v3 */
/* move-object v3, v0 */
/* move-object v0, v2 */
/* move-object v2, v9 */
} // :goto_5
try { // :try_start_7
(( java.net.MalformedURLException ) v0 ).printStackTrace ( ); // invoke-virtual {v0}, Ljava/net/MalformedURLException;->printStackTrace()V
/* :try_end_7 */
/* .catchall {:try_start_7 ..:try_end_7} :catchall_4 */
if ( v4 != null) { // if-eqz v4, :cond_6
	 try { // :try_start_8
		 (( java.io.OutputStream ) v4 ).close ( ); // invoke-virtual {v4}, Ljava/io/OutputStream;->close()V
		 /* :try_end_8 */
		 /* .catch Ljava/io/IOException; {:try_start_8 ..:try_end_8} :catch_1 */
	 } // :cond_6
} // :goto_6
if ( v2 != null) { // if-eqz v2, :cond_7
	 try { // :try_start_9
		 (( java.io.InputStream ) v2 ).close ( ); // invoke-virtual {v2}, Ljava/io/InputStream;->close()V
		 /* :try_end_9 */
		 /* .catch Ljava/io/IOException; {:try_start_9 ..:try_end_9} :catch_2 */
	 } // :cond_7
} // :goto_7
if ( v3 != null) { // if-eqz v3, :cond_4
	 (( java.net.HttpURLConnection ) v3 ).disconnect ( ); // invoke-virtual {v3}, Ljava/net/HttpURLConnection;->disconnect()V
	 /* move v0, v1 */
	 /* :catch_1 */
	 /* move-exception v0 */
	 (( java.io.IOException ) v0 ).printStackTrace ( ); // invoke-virtual {v0}, Ljava/io/IOException;->printStackTrace()V
	 /* :catch_2 */
	 /* move-exception v0 */
	 (( java.io.IOException ) v0 ).printStackTrace ( ); // invoke-virtual {v0}, Ljava/io/IOException;->printStackTrace()V
	 /* :catch_3 */
	 /* move-exception v0 */
	 /* move-object v5, v4 */
	 /* move-object v3, v4 */
} // :goto_8
try { // :try_start_a
	 /* new-instance v6, Landroid/os/Message; */
	 /* invoke-direct {v6}, Landroid/os/Message;-><init>()V */
	 int v7 = 1; // const/4 v7, 0x1
	 /* iput v7, v6, Landroid/os/Message;->what:I */
	 v7 = com.calmei.jmsn.PlaneFightActivity.n;
	 (( android.os.Handler ) v7 ).sendMessage ( v6 ); // invoke-virtual {v7, v6}, Landroid/os/Handler;->sendMessage(Landroid/os/Message;)Z
	 (( java.io.IOException ) v0 ).printStackTrace ( ); // invoke-virtual {v0}, Ljava/io/IOException;->printStackTrace()V
	 /* :try_end_a */
	 /* .catchall {:try_start_a ..:try_end_a} :catchall_5 */
	 if ( v5 != null) { // if-eqz v5, :cond_8
		 try { // :try_start_b
			 (( java.io.OutputStream ) v5 ).close ( ); // invoke-virtual {v5}, Ljava/io/OutputStream;->close()V
			 /* :try_end_b */
			 /* .catch Ljava/io/IOException; {:try_start_b ..:try_end_b} :catch_4 */
		 } // :cond_8
	 } // :goto_9
	 if ( v4 != null) { // if-eqz v4, :cond_9
		 try { // :try_start_c
			 (( java.io.InputStream ) v4 ).close ( ); // invoke-virtual {v4}, Ljava/io/InputStream;->close()V
			 /* :try_end_c */
			 /* .catch Ljava/io/IOException; {:try_start_c ..:try_end_c} :catch_5 */
		 } // :cond_9
	 } // :goto_a
	 if ( v3 != null) { // if-eqz v3, :cond_10
		 (( java.net.HttpURLConnection ) v3 ).disconnect ( ); // invoke-virtual {v3}, Ljava/net/HttpURLConnection;->disconnect()V
		 /* move v0, v2 */
		 /* :catch_4 */
		 /* move-exception v0 */
		 (( java.io.IOException ) v0 ).printStackTrace ( ); // invoke-virtual {v0}, Ljava/io/IOException;->printStackTrace()V
		 /* :catch_5 */
		 /* move-exception v0 */
		 (( java.io.IOException ) v0 ).printStackTrace ( ); // invoke-virtual {v0}, Ljava/io/IOException;->printStackTrace()V
		 /* :catch_6 */
		 /* move-exception v0 */
		 /* move-object v5, v4 */
		 /* move-object v2, v4 */
	 } // :goto_b
	 try { // :try_start_d
		 v3 = java.lang.System.out;
		 /* new-instance v6, Ljava/lang/StringBuilder; */
		 final String v7 = "Exception ex"; // const-string v7, "Exception ex"
		 /* invoke-direct {v6, v7}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V */
		 (( java.lang.StringBuilder ) v6 ).append ( v0 ); // invoke-virtual {v6, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;
		 (( java.lang.StringBuilder ) v0 ).toString ( ); // invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
		 (( java.io.PrintStream ) v3 ).println ( v0 ); // invoke-virtual {v3, v0}, Ljava/io/PrintStream;->println(Ljava/lang/String;)V
		 /* :try_end_d */
		 /* .catchall {:try_start_d ..:try_end_d} :catchall_6 */
		 if ( v5 != null) { // if-eqz v5, :cond_a
			 try { // :try_start_e
				 (( java.io.OutputStream ) v5 ).close ( ); // invoke-virtual {v5}, Ljava/io/OutputStream;->close()V
				 /* :try_end_e */
				 /* .catch Ljava/io/IOException; {:try_start_e ..:try_end_e} :catch_7 */
			 } // :cond_a
		 } // :goto_c
		 if ( v4 != null) { // if-eqz v4, :cond_b
			 try { // :try_start_f
				 (( java.io.InputStream ) v4 ).close ( ); // invoke-virtual {v4}, Ljava/io/InputStream;->close()V
				 /* :try_end_f */
				 /* .catch Ljava/io/IOException; {:try_start_f ..:try_end_f} :catch_8 */
			 } // :cond_b
		 } // :goto_d
		 if ( v2 != null) { // if-eqz v2, :cond_4
			 (( java.net.HttpURLConnection ) v2 ).disconnect ( ); // invoke-virtual {v2}, Ljava/net/HttpURLConnection;->disconnect()V
			 /* move v0, v1 */
			 /* goto/16 :goto_4 */
			 /* :catch_7 */
			 /* move-exception v0 */
			 (( java.io.IOException ) v0 ).printStackTrace ( ); // invoke-virtual {v0}, Ljava/io/IOException;->printStackTrace()V
			 /* :catch_8 */
			 /* move-exception v0 */
			 (( java.io.IOException ) v0 ).printStackTrace ( ); // invoke-virtual {v0}, Ljava/io/IOException;->printStackTrace()V
			 /* :catchall_0 */
			 /* move-exception v0 */
			 /* move-object v5, v4 */
			 /* move-object v3, v4 */
		 } // :goto_e
		 if ( v5 != null) { // if-eqz v5, :cond_c
			 try { // :try_start_10
				 (( java.io.OutputStream ) v5 ).close ( ); // invoke-virtual {v5}, Ljava/io/OutputStream;->close()V
				 /* :try_end_10 */
				 /* .catch Ljava/io/IOException; {:try_start_10 ..:try_end_10} :catch_9 */
			 } // :cond_c
		 } // :goto_f
		 if ( v4 != null) { // if-eqz v4, :cond_d
			 try { // :try_start_11
				 (( java.io.InputStream ) v4 ).close ( ); // invoke-virtual {v4}, Ljava/io/InputStream;->close()V
				 /* :try_end_11 */
				 /* .catch Ljava/io/IOException; {:try_start_11 ..:try_end_11} :catch_a */
			 } // :cond_d
		 } // :goto_10
		 if ( v3 != null) { // if-eqz v3, :cond_e
			 (( java.net.HttpURLConnection ) v3 ).disconnect ( ); // invoke-virtual {v3}, Ljava/net/HttpURLConnection;->disconnect()V
		 } // :cond_e
		 /* throw v0 */
		 /* :catch_9 */
		 /* move-exception v1 */
		 (( java.io.IOException ) v1 ).printStackTrace ( ); // invoke-virtual {v1}, Ljava/io/IOException;->printStackTrace()V
		 /* :catch_a */
		 /* move-exception v1 */
		 (( java.io.IOException ) v1 ).printStackTrace ( ); // invoke-virtual {v1}, Ljava/io/IOException;->printStackTrace()V
		 /* :catch_b */
		 /* move-exception v2 */
		 (( java.io.IOException ) v2 ).printStackTrace ( ); // invoke-virtual {v2}, Ljava/io/IOException;->printStackTrace()V
		 /* goto/16 :goto_2 */
		 /* :catch_c */
		 /* move-exception v2 */
		 (( java.io.IOException ) v2 ).printStackTrace ( ); // invoke-virtual {v2}, Ljava/io/IOException;->printStackTrace()V
		 /* goto/16 :goto_3 */
	 } // :cond_f
	 /* goto/16 :goto_0 */
	 /* :catchall_1 */
	 /* move-exception v1 */
	 /* move-object v5, v4 */
	 /* move-object v3, v0 */
	 /* move-object v0, v1 */
	 /* :catchall_2 */
	 /* move-exception v1 */
	 /* move-object v3, v0 */
	 /* move-object v0, v1 */
	 /* :catchall_3 */
	 /* move-exception v1 */
	 /* move-object v4, v3 */
	 /* move-object v3, v0 */
	 /* move-object v0, v1 */
	 /* :catchall_4 */
	 /* move-exception v0 */
	 /* move-object v5, v4 */
	 /* move-object v4, v2 */
	 /* :catchall_5 */
	 /* move-exception v0 */
	 /* :catchall_6 */
	 /* move-exception v0 */
	 /* move-object v3, v2 */
	 /* :catch_d */
	 /* move-exception v2 */
	 /* move-object v5, v4 */
	 /* move-object v9, v2 */
	 /* move-object v2, v0 */
	 /* move-object v0, v9 */
	 /* :catch_e */
	 /* move-exception v2 */
	 /* move-object v9, v2 */
	 /* move-object v2, v0 */
	 /* move-object v0, v9 */
	 /* :catch_f */
	 /* move-exception v2 */
	 /* move-object v4, v3 */
	 /* move-object v9, v2 */
	 /* move-object v2, v0 */
	 /* move-object v0, v9 */
	 /* goto/16 :goto_b */
	 /* :catch_10 */
	 /* move-exception v3 */
	 /* move-object v5, v4 */
	 /* move-object v9, v3 */
	 /* move-object v3, v0 */
	 /* move-object v0, v9 */
	 /* goto/16 :goto_8 */
	 /* :catch_11 */
	 /* move-exception v3 */
	 /* move-object v9, v3 */
	 /* move-object v3, v0 */
	 /* move-object v0, v9 */
	 /* goto/16 :goto_8 */
	 /* :catch_12 */
	 /* move-exception v4 */
	 /* move-object v9, v4 */
	 /* move-object v4, v3 */
	 /* move-object v3, v0 */
	 /* move-object v0, v9 */
	 /* goto/16 :goto_8 */
	 /* :catch_13 */
	 /* move-exception v0 */
	 /* move-object v2, v4 */
	 /* move-object v3, v4 */
	 /* goto/16 :goto_5 */
	 /* :catch_14 */
	 /* move-exception v2 */
	 /* move-object v3, v0 */
	 /* move-object v0, v2 */
	 /* move-object v2, v4 */
	 /* goto/16 :goto_5 */
	 /* :catch_15 */
	 /* move-exception v2 */
	 /* move-object v3, v0 */
	 /* move-object v0, v2 */
	 /* move-object v2, v4 */
	 /* move-object v4, v5 */
	 /* goto/16 :goto_5 */
} // :cond_10
/* move v0, v2 */
/* goto/16 :goto_4 */
} // .end method
public static void c ( ) {
/* .locals 2 */
/* new-instance v0, Ljava/lang/StringBuilder; */
v1 = com.a.f.f.a;
java.lang.String .valueOf ( v1 );
/* invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V */
v1 = com.a.f.f.b;
(( java.lang.StringBuilder ) v0 ).append ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
com.a.f.g .e ( );
(( java.lang.StringBuilder ) v0 ).append ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v0 ).toString ( ); // invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
return;
} // .end method
public static void d ( ) {
/* .locals 2 */
v0 = com.a.f.f.c;
com.a.f.j .a ( v0 );
/* new-instance v0, Ljava/lang/Thread; */
/* new-instance v1, Lcom/a/f/k; */
/* invoke-direct {v1}, Lcom/a/f/k;-><init>()V */
/* invoke-direct {v0, v1}, Ljava/lang/Thread;-><init>(Ljava/lang/Runnable;)V */
(( java.lang.Thread ) v0 ).start ( ); // invoke-virtual {v0}, Ljava/lang/Thread;->start()V
return;
} // .end method
static e ( ) { //synthethic
/* .locals 1 */
v0 = com.a.f.j.a;
} // .end method
static java.lang.String f ( ) { //synthethic
/* .locals 1 */
v0 = com.a.f.j.b;
} // .end method
