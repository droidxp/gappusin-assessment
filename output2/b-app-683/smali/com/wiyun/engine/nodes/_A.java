class com.wiyun.engine.nodes._A {
	 /* .source "_A.java" */
	 /* # static fields */
	 static Boolean a;
	 private static Integer b;
	 private static Boolean c;
	 private static java.lang.String d;
	 /* # direct methods */
	 static com.wiyun.engine.nodes._A ( ) {
		 /* .locals 1 */
		 /* .prologue */
		 /* .line 112 */
		 /* const/16 v0, 0x2710 */
		 /* .line 145 */
		 int v0 = 0; // const/4 v0, 0x0
		 com.wiyun.engine.nodes._A.a = (v0!= 0);
		 /* .line 105 */
		 return;
	 } // .end method
	 com.wiyun.engine.nodes._A ( ) {
		 /* .locals 0 */
		 /* .prologue */
		 /* .line 105 */
		 /* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
		 return;
	 } // .end method
	 private static Integer a ( java.lang.String p0, java.lang.String p1, Integer p2 ) {
		 /* .locals 6 */
		 /* .prologue */
		 /* const v3, 0x7fffffff */
		 int v1 = -1; // const/4 v1, -0x1
		 /* .line 424 */
		 /* .line 425 */
		 v4 = 		 (( java.lang.String ) p1 ).length ( ); // invoke-virtual {p1}, Ljava/lang/String;->length()I
		 /* .line 426 */
		 int v0 = 0; // const/4 v0, 0x0
		 /* move v2, v0 */
		 /* move v0, v3 */
	 } // :goto_0
	 /* if-lt v2, v4, :cond_1 */
	 /* .line 434 */
	 /* if-ne v0, v3, :cond_0 */
	 /* move v0, v1 */
	 /* .line 437 */
} // :cond_0
/* .line 427 */
} // :cond_1
v5 = (( java.lang.String ) p1 ).charAt ( v2 ); // invoke-virtual {p1, v2}, Ljava/lang/String;->charAt(I)C
/* .line 428 */
v5 = (( java.lang.String ) p0 ).indexOf ( v5, p2 ); // invoke-virtual {p0, v5, p2}, Ljava/lang/String;->indexOf(II)I
/* .line 429 */
/* if-eq v5, v1, :cond_2 */
/* .line 430 */
v0 = java.lang.Math .min ( v0,v5 );
/* .line 426 */
} // :cond_2
/* add-int/lit8 v2, v2, 0x1 */
} // .end method
static java.lang.String a ( android.content.Context p0 ) {
/* .locals 3 */
/* .param p0, "context" # Landroid/content/Context; */
/* .prologue */
/* .line 343 */
v1 = com.wiyun.engine.nodes._A.d;
v1 = android.text.TextUtils .isEmpty ( v1 );
if ( v1 != null) { // if-eqz v1, :cond_0
/* .line 344 */
(( android.content.Context ) p0 ).getResources ( ); // invoke-virtual {p0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;
(( android.content.res.Resources ) v1 ).getConfiguration ( ); // invoke-virtual {v1}, Landroid/content/res/Resources;->getConfiguration()Landroid/content/res/Configuration;
/* .line 345 */
/* .local v0, "config":Landroid/content/res/Configuration; */
/* iget v1, v0, Landroid/content/res/Configuration;->mcc:I */
/* mul-int/lit8 v1, v1, 0x64 */
/* iget v2, v0, Landroid/content/res/Configuration;->mnc:I */
/* add-int/2addr v1, v2 */
java.lang.String .valueOf ( v1 );
/* .line 348 */
} // .end local v0 # "config":Landroid/content/res/Configuration;
} // :cond_0
v1 = com.wiyun.engine.nodes._A.d;
} // .end method
static java.lang.String a ( java.lang.String p0 ) { //synthethic
/* .locals 1 */
/* .prologue */
/* .line 351 */
com.wiyun.engine.nodes._A .c ( p0 );
} // .end method
private static java.lang.String a ( java.lang.String p0, java.lang.String p1 ) {
/* .locals 11 */
/* .prologue */
/* const/16 v10, 0x30 */
int v1 = 0; // const/4 v1, 0x0
int v3 = -1; // const/4 v3, -0x1
/* const/16 v9, 0x25 */
/* .line 356 */
/* if-nez p0, :cond_0 */
/* .line 357 */
int p0 = 0; // const/4 p0, 0x0
/* .line 419 */
} // :goto_0
/* .line 360 */
} // :cond_0
try { // :try_start_0
final String v0 = "://"; // const-string v0, "://"
v0 = (( java.lang.String ) p0 ).indexOf ( v0 ); // invoke-virtual {p0, v0}, Ljava/lang/String;->indexOf(Ljava/lang/String;)I
/* .line 361 */
/* add-int/lit8 v2, v0, 0x3 */
(( java.lang.String ) p0 ).substring ( v2 ); // invoke-virtual {p0, v2}, Ljava/lang/String;->substring(I)Ljava/lang/String;
/* .line 362 */
final String v4 = "/"; // const-string v4, "/"
(( java.lang.String ) v2 ).split ( v4 ); // invoke-virtual {v2, v4}, Ljava/lang/String;->split(Ljava/lang/String;)[Ljava/lang/String;
/* .line 364 */
/* new-instance v6, Ljava/lang/StringBuilder; */
int v2 = 0; // const/4 v2, 0x0
/* add-int/lit8 v0, v0, 0x3 */
(( java.lang.String ) p0 ).substring ( v2, v0 ); // invoke-virtual {p0, v2, v0}, Ljava/lang/String;->substring(II)Ljava/lang/String;
/* invoke-direct {v6, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V */
/* .line 365 */
int v0 = 0; // const/4 v0, 0x0
/* aget-object v0, v5, v0 */
(( java.lang.StringBuilder ) v6 ).append ( v0 ); // invoke-virtual {v6, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
/* .line 366 */
/* const/16 v0, 0x2f */
(( java.lang.StringBuilder ) v6 ).append ( v0 ); // invoke-virtual {v6, v0}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;
/* .line 367 */
int v0 = 1; // const/4 v0, 0x1
/* move v4, v0 */
} // :goto_1
/* array-length v0, v5 */
/* if-lt v4, v0, :cond_1 */
/* .line 417 */
(( java.lang.StringBuilder ) v6 ).toString ( ); // invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
/* .line 368 */
} // :cond_1
/* aget-object v7, v5, v4 */
/* .line 369 */
/* const/16 v0, 0x25 */
v0 = (( java.lang.String ) v7 ).indexOf ( v0 ); // invoke-virtual {v7, v0}, Ljava/lang/String;->indexOf(I)I
/* .line 370 */
/* if-ne v0, v3, :cond_3 */
/* .line 371 */
com.wiyun.engine.nodes._A .c ( v6,v7,p1 );
/* .line 413 */
} // :goto_2
/* array-length v0, v5 */
/* add-int/lit8 v0, v0, -0x1 */
/* if-ge v4, v0, :cond_2 */
/* .line 414 */
/* const/16 v0, 0x2f */
(( java.lang.StringBuilder ) v6 ).append ( v0 ); // invoke-virtual {v6, v0}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;
/* .line 367 */
} // :cond_2
/* add-int/lit8 v0, v4, 0x1 */
/* move v4, v0 */
} // :cond_3
/* move v2, v0 */
/* move v0, v1 */
/* .line 374 */
} // :goto_3
/* if-ne v2, v3, :cond_4 */
/* .line 410 */
(( java.lang.String ) v7 ).substring ( v0 ); // invoke-virtual {v7, v0}, Ljava/lang/String;->substring(I)Ljava/lang/String;
com.wiyun.engine.nodes._A .c ( v6,v0,p1 );
/* .line 418 */
/* :catch_0 */
/* move-exception v0 */
/* .line 375 */
} // :cond_4
(( java.lang.String ) v7 ).substring ( v0, v2 ); // invoke-virtual {v7, v0, v2}, Ljava/lang/String;->substring(II)Ljava/lang/String;
/* .line 376 */
com.wiyun.engine.nodes._A .c ( v6,v0,p1 );
/* .line 378 */
v0 = (( java.lang.String ) v7 ).length ( ); // invoke-virtual {v7}, Ljava/lang/String;->length()I
/* add-int/lit8 v0, v0, -0x1 */
/* if-ne v2, v0, :cond_5 */
/* .line 379 */
final String v0 = "%25"; // const-string v0, "%25"
(( java.lang.StringBuilder ) v6 ).append ( v0 ); // invoke-virtual {v6, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
/* .line 381 */
v0 = (( java.lang.String ) v7 ).length ( ); // invoke-virtual {v7}, Ljava/lang/String;->length()I
/* move v2, v3 */
/* .line 382 */
} // :cond_5
v0 = (( java.lang.String ) v7 ).length ( ); // invoke-virtual {v7}, Ljava/lang/String;->length()I
/* add-int/lit8 v0, v0, -0x2 */
/* if-ge v2, v0, :cond_f */
/* .line 383 */
/* add-int/lit8 v0, v2, 0x1 */
v0 = (( java.lang.String ) v7 ).charAt ( v0 ); // invoke-virtual {v7, v0}, Ljava/lang/String;->charAt(I)C
/* .line 384 */
/* if-ne v0, v9, :cond_6 */
/* .line 385 */
final String v0 = "%25"; // const-string v0, "%25"
(( java.lang.StringBuilder ) v6 ).append ( v0 ); // invoke-virtual {v6, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
/* .line 386 */
/* add-int/lit8 v0, v2, 0x2 */
/* .line 387 */
/* const/16 v2, 0x25 */
v2 = (( java.lang.String ) v7 ).indexOf ( v2, v0 ); // invoke-virtual {v7, v2, v0}, Ljava/lang/String;->indexOf(II)I
/* .line 388 */
} // :cond_6
/* if-lt v0, v10, :cond_7 */
/* const/16 v8, 0x39 */
/* if-le v0, v8, :cond_9 */
} // :cond_7
/* const/16 v8, 0x41 */
/* if-lt v0, v8, :cond_8 */
/* const/16 v8, 0x5a */
/* if-le v0, v8, :cond_9 */
} // :cond_8
/* const/16 v8, 0x61 */
/* if-lt v0, v8, :cond_e */
/* const/16 v8, 0x7a */
/* if-gt v0, v8, :cond_e */
/* .line 389 */
} // :cond_9
/* add-int/lit8 v0, v2, 0x2 */
v0 = (( java.lang.String ) v7 ).charAt ( v0 ); // invoke-virtual {v7, v0}, Ljava/lang/String;->charAt(I)C
/* .line 390 */
/* if-lt v0, v10, :cond_a */
/* const/16 v8, 0x39 */
/* if-le v0, v8, :cond_c */
} // :cond_a
/* const/16 v8, 0x41 */
/* if-lt v0, v8, :cond_b */
/* const/16 v8, 0x5a */
/* if-le v0, v8, :cond_c */
} // :cond_b
/* const/16 v8, 0x61 */
/* if-lt v0, v8, :cond_d */
/* const/16 v8, 0x7a */
/* if-gt v0, v8, :cond_d */
/* .line 391 */
} // :cond_c
/* add-int/lit8 v0, v2, 0x3 */
(( java.lang.String ) v7 ).substring ( v2, v0 ); // invoke-virtual {v7, v2, v0}, Ljava/lang/String;->substring(II)Ljava/lang/String;
(( java.lang.StringBuilder ) v6 ).append ( v0 ); // invoke-virtual {v6, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
/* .line 392 */
/* add-int/lit8 v0, v2, 0x3 */
/* .line 393 */
/* const/16 v2, 0x25 */
v2 = (( java.lang.String ) v7 ).indexOf ( v2, v0 ); // invoke-virtual {v7, v2, v0}, Ljava/lang/String;->indexOf(II)I
/* goto/16 :goto_3 */
/* .line 395 */
} // :cond_d
final String v0 = "%25"; // const-string v0, "%25"
(( java.lang.StringBuilder ) v6 ).append ( v0 ); // invoke-virtual {v6, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
/* .line 396 */
/* add-int/lit8 v0, v2, 0x1 */
/* .line 397 */
/* const/16 v2, 0x25 */
v2 = (( java.lang.String ) v7 ).indexOf ( v2, v0 ); // invoke-virtual {v7, v2, v0}, Ljava/lang/String;->indexOf(II)I
/* goto/16 :goto_3 */
/* .line 400 */
} // :cond_e
final String v0 = "%25"; // const-string v0, "%25"
(( java.lang.StringBuilder ) v6 ).append ( v0 ); // invoke-virtual {v6, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
/* .line 401 */
/* add-int/lit8 v0, v2, 0x1 */
/* .line 402 */
/* const/16 v2, 0x25 */
v2 = (( java.lang.String ) v7 ).indexOf ( v2, v0 ); // invoke-virtual {v7, v2, v0}, Ljava/lang/String;->indexOf(II)I
/* goto/16 :goto_3 */
/* .line 405 */
} // :cond_f
final String v0 = "%25"; // const-string v0, "%25"
(( java.lang.StringBuilder ) v6 ).append ( v0 ); // invoke-virtual {v6, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
/* .line 406 */
/* add-int/lit8 v0, v2, 0x1 */
/* .line 407 */
/* const/16 v2, 0x25 */
(( java.lang.String ) v7 ).indexOf ( v2, v0 ); // invoke-virtual {v7, v2, v0}, Ljava/lang/String;->indexOf(II)I
/* :try_end_0 */
v2 = /* .catch Ljava/io/UnsupportedEncodingException; {:try_start_0 ..:try_end_0} :catch_0 */
/* goto/16 :goto_3 */
} // .end method
static org.apache.http.impl.client.DefaultHttpClient a ( ) { //synthethic
/* .locals 1 */
/* .prologue */
/* .line 152 */
com.wiyun.engine.nodes._A .d ( );
} // .end method
static void a ( java.lang.StringBuilder p0, java.lang.String p1, java.lang.String p2 ) { //synthethic
/* .locals 0 */
/* .annotation system Ldalvik/annotation/Throws; */
/* value = { */
/* Ljava/io/UnsupportedEncodingException; */
/* } */
} // .end annotation
/* .prologue */
/* .line 330 */
com.wiyun.engine.nodes._A .b ( p0,p1,p2 );
return;
} // .end method
static void a ( Boolean p0 ) { //synthethic
/* .locals 0 */
/* .prologue */
/* .line 142 */
com.wiyun.engine.nodes._A.c = (p0!= 0);
return;
} // .end method
static java.lang.String b ( ) { //synthethic
/* .locals 1 */
/* .prologue */
/* .line 257 */
com.wiyun.engine.nodes._A .e ( );
} // .end method
private static void b ( java.lang.StringBuilder p0, java.lang.String p1, java.lang.String p2 ) {
/* .locals 2 */
/* .annotation system Ldalvik/annotation/Throws; */
/* value = { */
/* Ljava/io/UnsupportedEncodingException; */
/* } */
} // .end annotation
/* .prologue */
/* .line 331 */
if ( p2 != null) { // if-eqz p2, :cond_0
v0 = (( java.lang.String ) p2 ).length ( ); // invoke-virtual {p2}, Ljava/lang/String;->length()I
/* if-lez v0, :cond_0 */
/* .line 332 */
final String v0 = "&"; // const-string v0, "&"
(( java.lang.StringBuilder ) p0 ).append ( v0 ); // invoke-virtual {p0, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v0 ).append ( p1 ); // invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
final String v1 = "="; // const-string v1, "="
(( java.lang.StringBuilder ) v0 ).append ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
final String v1 = "UTF-8"; // const-string v1, "UTF-8"
java.net.URLEncoder .encode ( p2,v1 );
(( java.lang.StringBuilder ) v0 ).append ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
/* .line 334 */
} // :cond_0
return;
} // .end method
private static Boolean b ( java.lang.String p0 ) {
/* .locals 5 */
/* .param p0, "s" # Ljava/lang/String; */
/* .prologue */
int v2 = 0; // const/4 v2, 0x0
/* .line 291 */
/* if-nez p0, :cond_1 */
/* .line 301 */
} // :cond_0
} // :goto_0
/* .line 294 */
} // :cond_1
v1 = (( java.lang.String ) p0 ).length ( ); // invoke-virtual {p0}, Ljava/lang/String;->length()I
/* .line 295 */
/* .local v1, "length":I */
int v0 = 0; // const/4 v0, 0x0
/* .local v0, "i":I */
} // :goto_1
/* if-ge v0, v1, :cond_0 */
/* .line 296 */
v3 = (( java.lang.String ) p0 ).charAt ( v0 ); // invoke-virtual {p0, v0}, Ljava/lang/String;->charAt(I)C
/* const/16 v4, 0x30 */
/* if-eq v3, v4, :cond_2 */
/* .line 297 */
int v2 = 1; // const/4 v2, 0x1
/* .line 295 */
} // :cond_2
/* add-int/lit8 v0, v0, 0x1 */
} // .end method
private static java.lang.String c ( java.lang.String p0 ) {
/* .locals 1 */
/* .prologue */
/* .line 352 */
final String v0 = "utf-8"; // const-string v0, "utf-8"
com.wiyun.engine.nodes._A .a ( p0,v0 );
} // .end method
private static void c ( java.lang.StringBuilder p0, java.lang.String p1, java.lang.String p2 ) {
/* .locals 4 */
/* .annotation system Ldalvik/annotation/Throws; */
/* value = { */
/* Ljava/io/UnsupportedEncodingException; */
/* } */
} // .end annotation
/* .prologue */
int v0 = 0; // const/4 v0, 0x0
int v3 = -1; // const/4 v3, -0x1
/* .line 441 */
final String v1 = "?&=:,()+ "; // const-string v1, "?&=:,()+ "
v1 = com.wiyun.engine.nodes._A .a ( p1,v1,v0 );
/* .line 442 */
/* if-ne v1, v3, :cond_1 */
/* .line 443 */
java.net.URLEncoder .encode ( p1,p2 );
(( java.lang.StringBuilder ) p0 ).append ( v0 ); // invoke-virtual {p0, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
/* .line 459 */
} // :goto_0
return;
/* .line 447 */
} // :cond_0
(( java.lang.String ) p1 ).substring ( v0, v1 ); // invoke-virtual {p1, v0, v1}, Ljava/lang/String;->substring(II)Ljava/lang/String;
java.net.URLEncoder .encode ( v0,p2 );
(( java.lang.StringBuilder ) p0 ).append ( v0 ); // invoke-virtual {p0, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
/* .line 448 */
v0 = (( java.lang.String ) p1 ).charAt ( v1 ); // invoke-virtual {p1, v1}, Ljava/lang/String;->charAt(I)C
/* .line 449 */
/* const/16 v2, 0x20 */
/* if-ne v0, v2, :cond_2 */
/* .line 450 */
final String v0 = "%20"; // const-string v0, "%20"
(( java.lang.StringBuilder ) p0 ).append ( v0 ); // invoke-virtual {p0, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
/* .line 454 */
} // :goto_1
/* add-int/lit8 v0, v1, 0x1 */
/* .line 455 */
final String v1 = "?&=:,()+ "; // const-string v1, "?&=:,()+ "
v1 = com.wiyun.engine.nodes._A .a ( p1,v1,v0 );
/* .line 446 */
} // :cond_1
/* if-ne v1, v3, :cond_0 */
/* .line 457 */
(( java.lang.String ) p1 ).substring ( v0 ); // invoke-virtual {p1, v0}, Ljava/lang/String;->substring(I)Ljava/lang/String;
java.net.URLEncoder .encode ( v0,p2 );
(( java.lang.StringBuilder ) p0 ).append ( v0 ); // invoke-virtual {p0, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
/* .line 452 */
} // :cond_2
(( java.lang.StringBuilder ) p0 ).append ( v0 ); // invoke-virtual {p0, v0}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;
} // .end method
static Boolean c ( ) { //synthethic
/* .locals 1 */
/* .prologue */
/* .line 304 */
v0 = com.wiyun.engine.nodes._A .g ( );
} // .end method
private static org.apache.http.impl.client.DefaultHttpClient d ( ) {
/* .locals 8 */
/* .prologue */
/* .line 154 */
/* new-instance v3, Lorg/apache/http/conn/scheme/SchemeRegistry; */
/* invoke-direct {v3}, Lorg/apache/http/conn/scheme/SchemeRegistry;-><init>()V */
/* .line 155 */
/* .local v3, "schemeRegistry":Lorg/apache/http/conn/scheme/SchemeRegistry; */
org.apache.http.conn.scheme.PlainSocketFactory .getSocketFactory ( );
/* .line 156 */
/* .local v4, "sf":Lorg/apache/http/conn/scheme/SocketFactory; */
/* new-instance v5, Lorg/apache/http/conn/scheme/Scheme; */
final String v6 = "http"; // const-string v6, "http"
/* const/16 v7, 0x50 */
/* invoke-direct {v5, v6, v4, v7}, Lorg/apache/http/conn/scheme/Scheme;-><init>(Ljava/lang/String;Lorg/apache/http/conn/scheme/SocketFactory;I)V */
(( org.apache.http.conn.scheme.SchemeRegistry ) v3 ).register ( v5 ); // invoke-virtual {v3, v5}, Lorg/apache/http/conn/scheme/SchemeRegistry;->register(Lorg/apache/http/conn/scheme/Scheme;)Lorg/apache/http/conn/scheme/Scheme;
/* .line 157 */
/* new-instance v2, Lorg/apache/http/params/BasicHttpParams; */
/* invoke-direct {v2}, Lorg/apache/http/params/BasicHttpParams;-><init>()V */
/* .line 158 */
/* .local v2, "params":Lorg/apache/http/params/HttpParams; */
v5 = org.apache.http.HttpVersion.HTTP_1_1;
org.apache.http.params.HttpProtocolParams .setVersion ( v2,v5 );
/* .line 159 */
final String v5 = "UTF-8"; // const-string v5, "UTF-8"
org.apache.http.params.HttpProtocolParams .setContentCharset ( v2,v5 );
/* .line 160 */
int v5 = 0; // const/4 v5, 0x0
org.apache.http.params.HttpProtocolParams .setUseExpectContinue ( v2,v5 );
/* .line 161 */
org.apache.http.params.HttpConnectionParams .setConnectionTimeout ( v2,v5 );
/* .line 162 */
org.apache.http.params.HttpConnectionParams .setSoTimeout ( v2,v5 );
/* .line 163 */
/* new-instance v0, Lorg/apache/http/impl/conn/tsccm/ThreadSafeClientConnManager; */
/* invoke-direct {v0, v2, v3}, Lorg/apache/http/impl/conn/tsccm/ThreadSafeClientConnManager;-><init>(Lorg/apache/http/params/HttpParams;Lorg/apache/http/conn/scheme/SchemeRegistry;)V */
/* .line 164 */
/* .local v0, "ccm":Lorg/apache/http/conn/ClientConnectionManager; */
/* new-instance v1, Lorg/apache/http/impl/client/DefaultHttpClient; */
/* invoke-direct {v1, v0, v2}, Lorg/apache/http/impl/client/DefaultHttpClient;-><init>(Lorg/apache/http/conn/ClientConnectionManager;Lorg/apache/http/params/HttpParams;)V */
/* .line 166 */
/* .local v1, "client":Lorg/apache/http/impl/client/DefaultHttpClient; */
} // .end method
private static java.lang.String e ( ) {
/* .locals 4 */
/* .prologue */
int v2 = 0; // const/4 v2, 0x0
/* .line 258 */
com.wiyun.engine.nodes.Director .getInstance ( );
(( com.wiyun.engine.nodes.Director ) v3 ).getContext ( ); // invoke-virtual {v3}, Lcom/wiyun/engine/nodes/Director;->getContext()Landroid/content/Context;
/* .line 259 */
/* .local v0, "context":Landroid/content/Context; */
/* if-nez v0, :cond_1 */
/* .line 272 */
} // :cond_0
} // :goto_0
/* .line 262 */
} // :cond_1
final String v3 = "android.permission.READ_PHONE_STATE"; // const-string v3, "android.permission.READ_PHONE_STATE"
v3 = (( android.content.Context ) v0 ).checkCallingOrSelfPermission ( v3 ); // invoke-virtual {v0, v3}, Landroid/content/Context;->checkCallingOrSelfPermission(Ljava/lang/String;)I
/* if-nez v3, :cond_0 */
/* .line 264 */
final String v3 = "phone"; // const-string v3, "phone"
(( android.content.Context ) v0 ).getSystemService ( v3 ); // invoke-virtual {v0, v3}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;
/* check-cast v1, Landroid/telephony/TelephonyManager; */
/* .line 266 */
/* .local v1, "manager":Landroid/telephony/TelephonyManager; */
if ( v1 != null) { // if-eqz v1, :cond_0
/* .line 267 */
(( android.telephony.TelephonyManager ) v1 ).getDeviceId ( ); // invoke-virtual {v1}, Landroid/telephony/TelephonyManager;->getDeviceId()Ljava/lang/String;
} // .end method
private static Boolean f ( ) {
/* .locals 4 */
/* .prologue */
int v2 = 0; // const/4 v2, 0x0
/* .line 278 */
com.wiyun.engine.nodes.Director .getInstance ( );
(( com.wiyun.engine.nodes.Director ) v3 ).getContext ( ); // invoke-virtual {v3}, Lcom/wiyun/engine/nodes/Director;->getContext()Landroid/content/Context;
/* .line 279 */
/* .local v0, "context":Landroid/content/Context; */
/* if-nez v0, :cond_1 */
/* .line 286 */
} // :cond_0
} // :goto_0
/* .line 282 */
} // :cond_1
final String v3 = "sensor"; // const-string v3, "sensor"
(( android.content.Context ) v0 ).getSystemService ( v3 ); // invoke-virtual {v0, v3}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;
/* check-cast v1, Landroid/hardware/SensorManager; */
/* .line 283 */
/* .local v1, "sm":Landroid/hardware/SensorManager; */
if ( v1 != null) { // if-eqz v1, :cond_0
/* .line 286 */
int v3 = 2; // const/4 v3, 0x2
(( android.hardware.SensorManager ) v1 ).getDefaultSensor ( v3 ); // invoke-virtual {v1, v3}, Landroid/hardware/SensorManager;->getDefaultSensor(I)Landroid/hardware/Sensor;
if ( v3 != null) { // if-eqz v3, :cond_0
int v2 = 1; // const/4 v2, 0x1
} // .end method
private static Boolean g ( ) {
/* .locals 10 */
/* .prologue */
int v6 = 1; // const/4 v6, 0x1
int v7 = 0; // const/4 v7, 0x0
/* .line 305 */
com.wiyun.engine.nodes._A .e ( );
/* .line 306 */
/* .local v0, "deviceId":Ljava/lang/String; */
v8 = android.os.Build.FINGERPRINT;
final String v9 = "generic"; // const-string v9, "generic"
v2 = (( java.lang.String ) v8 ).startsWith ( v9 ); // invoke-virtual {v8, v9}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z
/* .line 307 */
/* .local v2, "generic":Z */
final String v8 = "sdk"; // const-string v8, "sdk"
v9 = android.os.Build.MODEL;
v3 = (( java.lang.String ) v8 ).equalsIgnoreCase ( v9 ); // invoke-virtual {v8, v9}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z
/* .line 308 */
/* .local v3, "sdk":Z */
v4 = com.wiyun.engine.nodes._A .f ( );
/* .line 311 */
/* .local v4, "sensor":Z */
int v5 = 0; // const/4 v5, 0x0
/* .line 312 */
/* .local v5, "weight":I */
v8 = android.text.TextUtils .isEmpty ( v0 );
/* if-nez v8, :cond_0 */
v8 = com.wiyun.engine.nodes._A .b ( v0 );
if ( v8 != null) { // if-eqz v8, :cond_0
/* .line 313 */
/* add-int/lit8 v5, v5, 0x1e */
/* .line 314 */
} // :cond_0
/* if-nez v2, :cond_1 */
/* .line 315 */
/* add-int/lit8 v5, v5, 0x1e */
/* .line 316 */
} // :cond_1
/* if-nez v3, :cond_2 */
/* .line 317 */
/* add-int/lit8 v5, v5, 0x14 */
/* .line 318 */
} // :cond_2
if ( v4 != null) { // if-eqz v4, :cond_3
/* .line 319 */
/* add-int/lit8 v5, v5, 0x32 */
/* .line 322 */
} // :cond_3
/* const/16 v8, 0x32 */
/* if-lt v5, v8, :cond_4 */
/* move v1, v7 */
/* .line 324 */
/* .local v1, "emu":I */
} // :goto_0
if ( v1 != null) { // if-eqz v1, :cond_5
} // :goto_1
} // .end local v1 # "emu":I
} // :cond_4
/* move v1, v6 */
/* .line 322 */
/* .restart local v1 # "emu":I */
} // :cond_5
/* move v6, v7 */
/* .line 324 */
} // .end method
static void s ( android.content.Context p0 ) {
/* .locals 2 */
/* .param p0, "context" # Landroid/content/Context; */
/* .prologue */
/* .line 171 */
final String v0 = "android.permission.INTERNET"; // const-string v0, "android.permission.INTERNET"
v0 = (( android.content.Context ) p0 ).checkCallingOrSelfPermission ( v0 ); // invoke-virtual {p0, v0}, Landroid/content/Context;->checkCallingOrSelfPermission(Ljava/lang/String;)I
if ( v0 != null) { // if-eqz v0, :cond_0
/* .line 255 */
} // :goto_0
return;
/* .line 175 */
} // :cond_0
/* const-class v1, Lcom/wiyun/engine/nodes/_A; */
/* monitor-enter v1 */
/* .line 176 */
try { // :try_start_0
/* sget-boolean v0, Lcom/wiyun/engine/nodes/_A;->c:Z */
if ( v0 != null) { // if-eqz v0, :cond_1
/* .line 177 */
/* monitor-exit v1 */
/* .line 175 */
/* :catchall_0 */
/* move-exception v0 */
/* monitor-exit v1 */
/* :try_end_0 */
/* .catchall {:try_start_0 ..:try_end_0} :catchall_0 */
/* throw v0 */
/* .line 178 */
} // :cond_1
int v0 = 1; // const/4 v0, 0x1
try { // :try_start_1
com.wiyun.engine.nodes._A.c = (v0!= 0);
/* .line 175 */
/* monitor-exit v1 */
/* :try_end_1 */
/* .catchall {:try_start_1 ..:try_end_1} :catchall_0 */
/* .line 182 */
/* new-instance v0, Lcom/wiyun/engine/nodes/_A$1; */
/* invoke-direct {v0, p0}, Lcom/wiyun/engine/nodes/_A$1;-><init>(Landroid/content/Context;)V */
/* .line 254 */
(( com.wiyun.engine.nodes._A$1 ) v0 ).start ( ); // invoke-virtual {v0}, Lcom/wiyun/engine/nodes/_A$1;->start()V
} // .end method
