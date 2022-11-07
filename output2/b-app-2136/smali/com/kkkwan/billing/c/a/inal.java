public class inal {
	 /* # direct methods */
	 public inal ( ) {
		 /* .locals 0 */
		 /* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
		 return;
	 } // .end method
	 static void a ( Object p0, java.lang.String p1 ) { //synthethic
		 /* .locals 8 */
		 try { // :try_start_0
			 /* new-instance v0, Ljava/net/URL; */
			 /* invoke-direct {v0, p1}, Ljava/net/URL;-><init>(Ljava/lang/String;)V */
			 (( java.net.URL ) v0 ).openConnection ( ); // invoke-virtual {v0}, Ljava/net/URL;->openConnection()Ljava/net/URLConnection;
			 /* check-cast v0, Ljava/net/HttpURLConnection; */
			 final String v1 = "GET"; // const-string v1, "GET"
			 (( java.net.HttpURLConnection ) v0 ).setRequestMethod ( v1 ); // invoke-virtual {v0, v1}, Ljava/net/HttpURLConnection;->setRequestMethod(Ljava/lang/String;)V
			 /* const/16 v1, 0x1388 */
			 (( java.net.HttpURLConnection ) v0 ).setConnectTimeout ( v1 ); // invoke-virtual {v0, v1}, Ljava/net/HttpURLConnection;->setConnectTimeout(I)V
			 (( java.net.HttpURLConnection ) v0 ).getInputStream ( ); // invoke-virtual {v0}, Ljava/net/HttpURLConnection;->getInputStream()Ljava/io/InputStream;
			 /* const/16 v0, 0x400 */
			 /* new-array v2, v0, [B */
			 int v0 = 0; // const/4 v0, 0x0
		 } // :goto_0
		 v3 = 		 (( java.io.InputStream ) v1 ).read ( v2 ); // invoke-virtual {v1, v2}, Ljava/io/InputStream;->read([B)I
		 int v4 = -1; // const/4 v4, -0x1
		 /* if-eq v3, v4, :cond_0 */
		 /* if-gtz v0, :cond_0 */
		 com.kkkwan.billing.h.i .a ( v2 );
		 final String v5 = "DownloadMgr"; // const-string v5, "DownloadMgr"
		 /* new-instance v6, Ljava/lang/StringBuilder; */
		 final String v7 = "\u8f93\u51fa\u7684\u603b\u5b57\u8282\u6570len="; // const-string v7, "\u8f93\u51fa\u7684\u603b\u5b57\u8282\u6570len="
		 /* invoke-direct {v6, v7}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V */
		 /* add-int/lit8 v3, v3, 0x0 */
		 (( java.lang.StringBuilder ) v6 ).append ( v3 ); // invoke-virtual {v6, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;
		 (( java.lang.StringBuilder ) v3 ).toString ( ); // invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
		 com.kkkwan.billing.h.f .a ( v5,v3 );
		 final String v3 = "DownloadMgr"; // const-string v3, "DownloadMgr"
		 /* new-instance v5, Ljava/lang/StringBuilder; */
		 final String v6 = "downloadData="; // const-string v6, "downloadData="
		 /* invoke-direct {v5, v6}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V */
		 (( java.lang.StringBuilder ) v5 ).append ( v4 ); // invoke-virtual {v5, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
		 (( java.lang.StringBuilder ) v4 ).toString ( ); // invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
		 com.kkkwan.billing.h.f .a ( v3,v4 );
		 /* add-int/lit8 v0, v0, 0x1 */
	 } // :cond_0
	 (( java.io.InputStream ) v1 ).close ( ); // invoke-virtual {v1}, Ljava/io/InputStream;->close()V
	 /* :try_end_0 */
	 /* .catch Ljava/lang/Exception; {:try_start_0 ..:try_end_0} :catch_0 */
} // :goto_1
return;
/* :catch_0 */
/* move-exception v0 */
(( java.lang.Exception ) v0 ).printStackTrace ( ); // invoke-virtual {v0}, Ljava/lang/Exception;->printStackTrace()V
} // .end method
/* # virtual methods */
public final void a ( android.content.Context p0, java.lang.String p1 ) {
/* .locals 2 */
/* new-instance v0, Ljava/lang/Thread; */
/* new-instance v1, Lcom/kkkwan/billing/c/a/b; */
/* invoke-direct {v1, p0, p1, p2}, Lcom/kkkwan/billing/c/a/b;-><init>(Lcom/kkkwan/billing/c/a/a;Landroid/content/Context;Ljava/lang/String;)V */
/* invoke-direct {v0, v1}, Ljava/lang/Thread;-><init>(Ljava/lang/Runnable;)V */
(( java.lang.Thread ) v0 ).start ( ); // invoke-virtual {v0}, Ljava/lang/Thread;->start()V
return;
} // .end method
