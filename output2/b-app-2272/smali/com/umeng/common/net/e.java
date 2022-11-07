class com.umeng.common.net.e implements java.lang.Runnable {
	 /* .source "DownloadTool.java" */
	 /* # interfaces */
	 /* # instance fields */
	 final com.umeng.common.net.d a; //synthetic
	 private final java.lang.String b; //synthetic
	 private final Boolean c; //synthetic
	 private final java.util.Map d; //synthetic
	 /* # direct methods */
	 com.umeng.common.net.e ( ) {
		 /* .locals 0 */
		 /* .prologue */
		 /* .line 1 */
		 this.a = p1;
		 this.b = p2;
		 /* iput-boolean p3, p0, Lcom/umeng/common/net/e;->c:Z */
		 this.d = p4;
		 /* .line 295 */
		 /* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
		 return;
	 } // .end method
	 /* # virtual methods */
	 public void run ( ) {
		 /* .locals 14 */
		 /* .prologue */
		 int v13 = 1; // const/4 v13, 0x1
		 int v2 = 0; // const/4 v2, 0x0
		 /* .line 298 */
		 /* .line 299 */
		 int v3 = -2; // const/4 v3, -0x2
		 /* .line 300 */
		 /* new-instance v0, Ljava/util/Random; */
		 /* invoke-direct {v0}, Ljava/util/Random;-><init>()V */
		 /* const/16 v1, 0x3e8 */
		 v4 = 		 (( java.util.Random ) v0 ).nextInt ( v1 ); // invoke-virtual {v0, v1}, Ljava/util/Random;->nextInt(I)I
		 /* .line 301 */
		 v0 = this.b;
		 /* if-nez v0, :cond_1 */
		 /* .line 302 */
		 com.umeng.common.net.d .a ( );
		 /* new-instance v1, Ljava/lang/StringBuilder; */
		 java.lang.String .valueOf ( v4 );
		 /* invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V */
		 final String v2 = "service report: urls is null"; // const-string v2, "service report: urls is null"
		 (( java.lang.StringBuilder ) v1 ).append ( v2 ); // invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
		 (( java.lang.StringBuilder ) v1 ).toString ( ); // invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
		 com.umeng.common.Log .a ( v0,v1 );
		 /* .line 358 */
	 } // :cond_0
	 return;
	 /* .line 305 */
} // :cond_1
v5 = this.b;
/* array-length v6, v5 */
/* move v1, v2 */
} // :goto_0
/* if-ge v1, v6, :cond_0 */
/* aget-object v7, v5, v1 */
/* .line 307 */
com.umeng.common.util.h .a ( );
/* .line 308 */
final String v8 = " "; // const-string v8, " "
(( java.lang.String ) v0 ).split ( v8 ); // invoke-virtual {v0, v8}, Ljava/lang/String;->split(Ljava/lang/String;)[Ljava/lang/String;
/* aget-object v8, v8, v2 */
/* .line 309 */
final String v9 = " "; // const-string v9, " "
(( java.lang.String ) v0 ).split ( v9 ); // invoke-virtual {v0, v9}, Ljava/lang/String;->split(Ljava/lang/String;)[Ljava/lang/String;
/* aget-object v0, v0, v13 */
/* .line 311 */
java.lang.System .currentTimeMillis ( );
/* move-result-wide v9 */
/* .line 313 */
/* new-instance v11, Ljava/lang/StringBuilder; */
/* invoke-direct {v11, v7}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V */
/* .line 314 */
final String v12 = "&data="; // const-string v12, "&data="
(( java.lang.StringBuilder ) v11 ).append ( v12 ); // invoke-virtual {v11, v12}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v12 ).append ( v8 ); // invoke-virtual {v12, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
/* .line 315 */
final String v8 = "&time="; // const-string v8, "&time="
(( java.lang.StringBuilder ) v11 ).append ( v8 ); // invoke-virtual {v11, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v8 ).append ( v0 ); // invoke-virtual {v8, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
/* .line 316 */
final String v0 = "&ts="; // const-string v0, "&ts="
(( java.lang.StringBuilder ) v11 ).append ( v0 ); // invoke-virtual {v11, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v0 ).append ( v9, v10 ); // invoke-virtual {v0, v9, v10}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;
/* .line 317 */
/* iget-boolean v0, p0, Lcom/umeng/common/net/e;->c:Z */
if ( v0 != null) { // if-eqz v0, :cond_3
/* .line 318 */
final String v0 = "&action_type="; // const-string v0, "&action_type="
(( java.lang.StringBuilder ) v11 ).append ( v0 ); // invoke-virtual {v11, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v0 ).append ( v13 ); // invoke-virtual {v0, v13}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;
/* .line 321 */
} // :goto_1
v0 = this.d;
if ( v0 != null) { // if-eqz v0, :cond_2
/* .line 322 */
v0 = this.d;
/* .line 323 */
v0 = } // :goto_2
/* if-nez v0, :cond_4 */
/* .line 328 */
} // :cond_2
try { // :try_start_0
com.umeng.common.net.d .a ( );
/* .line 329 */
/* new-instance v8, Ljava/lang/StringBuilder; */
java.lang.String .valueOf ( v4 );
/* invoke-direct {v8, v9}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V */
final String v9 = ": service report:\tget: "; // const-string v9, ": service report:\tget: "
(( java.lang.StringBuilder ) v8 ).append ( v9 ); // invoke-virtual {v8, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
/* .line 330 */
(( java.lang.StringBuilder ) v11 ).toString ( ); // invoke-virtual {v11}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
(( java.lang.StringBuilder ) v8 ).append ( v9 ); // invoke-virtual {v8, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
/* .line 329 */
(( java.lang.StringBuilder ) v8 ).toString ( ); // invoke-virtual {v8}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
/* .line 328 */
com.umeng.common.Log .a ( v0,v8 );
/* .line 331 */
/* new-instance v0, Lorg/apache/http/client/methods/HttpGet; */
(( java.lang.StringBuilder ) v11 ).toString ( ); // invoke-virtual {v11}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
/* invoke-direct {v0, v8}, Lorg/apache/http/client/methods/HttpGet;-><init>(Ljava/lang/String;)V */
/* .line 332 */
/* new-instance v8, Lorg/apache/http/params/BasicHttpParams; */
/* invoke-direct {v8}, Lorg/apache/http/params/BasicHttpParams;-><init>()V */
/* .line 334 */
/* const/16 v9, 0x2710 */
/* .line 333 */
org.apache.http.params.HttpConnectionParams .setConnectionTimeout ( v8,v9 );
/* .line 335 */
/* const/16 v9, 0x4e20 */
org.apache.http.params.HttpConnectionParams .setSoTimeout ( v8,v9 );
/* .line 336 */
/* new-instance v9, Lorg/apache/http/impl/client/DefaultHttpClient; */
/* invoke-direct {v9, v8}, Lorg/apache/http/impl/client/DefaultHttpClient;-><init>(Lorg/apache/http/params/HttpParams;)V */
/* .line 338 */
/* .line 340 */
com.umeng.common.net.d .a ( );
/* new-instance v9, Ljava/lang/StringBuilder; */
java.lang.String .valueOf ( v4 );
/* invoke-direct {v9, v10}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V */
/* .line 341 */
final String v10 = ": service report:status code: "; // const-string v10, ": service report:status code: "
(( java.lang.StringBuilder ) v9 ).append ( v10 ); // invoke-virtual {v9, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
v10 = /* .line 342 */
(( java.lang.StringBuilder ) v9 ).append ( v10 ); // invoke-virtual {v9, v10}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v9 ).toString ( ); // invoke-virtual {v9}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
/* .line 340 */
com.umeng.common.Log .a ( v8,v9 );
/* .line 343 */
/* :try_end_0 */
/* .catch Lorg/apache/http/client/ClientProtocolException; {:try_start_0 ..:try_end_0} :catch_0 */
v0 = /* .catch Ljava/io/IOException; {:try_start_0 ..:try_end_0} :catch_1 */
/* const/16 v7, 0xc8 */
/* if-eq v0, v7, :cond_0 */
/* .line 305 */
} // :goto_3
/* add-int/lit8 v0, v1, 0x1 */
/* move v1, v0 */
/* goto/16 :goto_0 */
/* .line 320 */
} // :cond_3
final String v0 = "&action_type="; // const-string v0, "&action_type="
(( java.lang.StringBuilder ) v11 ).append ( v0 ); // invoke-virtual {v11, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v0 ).append ( v3 ); // invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;
/* goto/16 :goto_1 */
/* .line 323 */
} // :cond_4
/* check-cast v0, Ljava/lang/String; */
/* .line 324 */
final String v9 = "&"; // const-string v9, "&"
(( java.lang.StringBuilder ) v11 ).append ( v9 ); // invoke-virtual {v11, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v9 ).append ( v0 ); // invoke-virtual {v9, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
final String v10 = "="; // const-string v10, "="
(( java.lang.StringBuilder ) v9 ).append ( v10 ); // invoke-virtual {v9, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
v10 = this.d;
/* check-cast v0, Ljava/lang/String; */
(( java.lang.StringBuilder ) v9 ).append ( v0 ); // invoke-virtual {v9, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
/* goto/16 :goto_2 */
/* .line 346 */
/* :catch_0 */
/* move-exception v0 */
/* .line 347 */
com.umeng.common.net.d .a ( );
/* .line 348 */
/* new-instance v9, Ljava/lang/StringBuilder; */
java.lang.String .valueOf ( v4 );
/* invoke-direct {v9, v10}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V */
/* .line 349 */
final String v10 = ": service report:\tClientProtocolException,Failed to send message."; // const-string v10, ": service report:\tClientProtocolException,Failed to send message."
(( java.lang.StringBuilder ) v9 ).append ( v10 ); // invoke-virtual {v9, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
/* .line 350 */
(( java.lang.StringBuilder ) v9 ).append ( v7 ); // invoke-virtual {v9, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
/* .line 348 */
(( java.lang.StringBuilder ) v7 ).toString ( ); // invoke-virtual {v7}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
/* .line 347 */
com.umeng.common.Log .c ( v8,v7,v0 );
/* .line 351 */
/* :catch_1 */
/* move-exception v0 */
/* .line 352 */
com.umeng.common.net.d .a ( );
/* .line 353 */
/* new-instance v9, Ljava/lang/StringBuilder; */
java.lang.String .valueOf ( v4 );
/* invoke-direct {v9, v10}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V */
/* .line 354 */
final String v10 = ": service report:\tIOException,Failed to send message."; // const-string v10, ": service report:\tIOException,Failed to send message."
(( java.lang.StringBuilder ) v9 ).append ( v10 ); // invoke-virtual {v9, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
/* .line 355 */
(( java.lang.StringBuilder ) v9 ).append ( v7 ); // invoke-virtual {v9, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
/* .line 353 */
(( java.lang.StringBuilder ) v7 ).toString ( ); // invoke-virtual {v7}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
/* .line 352 */
com.umeng.common.Log .c ( v8,v7,v0 );
} // .end method
