public class inal implements java.lang.Runnable {
	 /* .source "SourceFile" */
	 /* # interfaces */
	 /* # annotations */
	 /* .annotation system Ldalvik/annotation/MemberClasses; */
	 /* value = { */
	 /* Lcom/google/ads/internal/f$a; */
	 /* } */
} // .end annotation
/* # instance fields */
private final com.google.ads.internal.c a;
private final com.google.ads.internal.d b;
private final com.google.ads.internal.f$a c;
private volatile Boolean d;
private Boolean e;
private java.lang.String f;
private java.lang.Thread g;
/* # direct methods */
 inal ( ) {
	 /* .locals 1 */
	 /* .prologue */
	 /* .line 122 */
	 /* new-instance v0, Lcom/google/ads/internal/f$1; */
	 /* invoke-direct {v0}, Lcom/google/ads/internal/f$1;-><init>()V */
	 /* invoke-direct {p0, p1, p2, v0}, Lcom/google/ads/internal/f;-><init>(Lcom/google/ads/internal/c;Lcom/google/ads/internal/d;Lcom/google/ads/internal/f$a;)V */
	 /* .line 128 */
	 return;
} // .end method
 inal ( ) {
	 /* .locals 1 */
	 /* .prologue */
	 /* .line 141 */
	 /* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
	 /* .line 113 */
	 int v0 = 0; // const/4 v0, 0x0
	 this.g = v0;
	 /* .line 142 */
	 this.a = p1;
	 /* .line 143 */
	 this.b = p2;
	 /* .line 144 */
	 this.c = p3;
	 /* .line 145 */
	 return;
} // .end method
private void a ( android.content.Context p0, java.net.HttpURLConnection p1 ) {
	 /* .locals 3 */
	 /* .prologue */
	 /* .line 443 */
	 android.preference.PreferenceManager .getDefaultSharedPreferences ( p1 );
	 /* .line 444 */
	 final String v1 = "drt"; // const-string v1, "drt"
	 final String v2 = ""; // const-string v2, ""
	 /* .line 445 */
	 /* iget-boolean v1, p0, Lcom/google/ads/internal/f;->e:Z */
	 if ( v1 != null) { // if-eqz v1, :cond_0
		 v1 = 		 android.text.TextUtils .isEmpty ( v0 );
		 /* if-nez v1, :cond_0 */
		 /* .line 446 */
		 /* const/16 v2, 0x8 */
		 /* if-ne v1, v2, :cond_1 */
		 /* .line 450 */
		 final String v1 = "X-Afma-drt-Cookie"; // const-string v1, "X-Afma-drt-Cookie"
		 (( java.net.HttpURLConnection ) p2 ).addRequestProperty ( v1, v0 ); // invoke-virtual {p2, v1, v0}, Ljava/net/HttpURLConnection;->addRequestProperty(Ljava/lang/String;Ljava/lang/String;)V
		 /* .line 455 */
	 } // :cond_0
} // :goto_0
return;
/* .line 452 */
} // :cond_1
final String v1 = "Cookie"; // const-string v1, "Cookie"
(( java.net.HttpURLConnection ) p2 ).addRequestProperty ( v1, v0 ); // invoke-virtual {p2, v1, v0}, Ljava/net/HttpURLConnection;->addRequestProperty(Ljava/lang/String;Ljava/lang/String;)V
} // .end method
private void a ( java.net.HttpURLConnection p0 ) {
/* .locals 0 */
/* .prologue */
/* .line 161 */
/* invoke-direct {p0, p1}, Lcom/google/ads/internal/f;->b(Ljava/net/HttpURLConnection;)V */
/* .line 162 */
/* invoke-direct {p0, p1}, Lcom/google/ads/internal/f;->f(Ljava/net/HttpURLConnection;)V */
/* .line 163 */
/* invoke-direct {p0, p1}, Lcom/google/ads/internal/f;->g(Ljava/net/HttpURLConnection;)V */
/* .line 164 */
/* invoke-direct {p0, p1}, Lcom/google/ads/internal/f;->h(Ljava/net/HttpURLConnection;)V */
/* .line 165 */
/* invoke-direct {p0, p1}, Lcom/google/ads/internal/f;->e(Ljava/net/HttpURLConnection;)V */
/* .line 166 */
/* invoke-direct {p0, p1}, Lcom/google/ads/internal/f;->i(Ljava/net/HttpURLConnection;)V */
/* .line 167 */
/* invoke-direct {p0, p1}, Lcom/google/ads/internal/f;->j(Ljava/net/HttpURLConnection;)V */
/* .line 168 */
/* invoke-direct {p0, p1}, Lcom/google/ads/internal/f;->k(Ljava/net/HttpURLConnection;)V */
/* .line 169 */
/* invoke-direct {p0, p1}, Lcom/google/ads/internal/f;->d(Ljava/net/HttpURLConnection;)V */
/* .line 170 */
/* invoke-direct {p0, p1}, Lcom/google/ads/internal/f;->c(Ljava/net/HttpURLConnection;)V */
/* .line 171 */
return;
} // .end method
private void a ( java.net.HttpURLConnection p0, Integer p1 ) {
/* .locals 3 */
/* .annotation system Ldalvik/annotation/Throws; */
/* value = { */
/* Ljava/io/IOException; */
/* } */
} // .end annotation
/* .prologue */
/* const/16 v1, 0x190 */
/* .line 352 */
/* const/16 v0, 0x12c */
/* if-gt v0, p2, :cond_1 */
/* if-ge p2, v1, :cond_1 */
/* .line 354 */
final String v0 = "Location"; // const-string v0, "Location"
(( java.net.HttpURLConnection ) p1 ).getHeaderField ( v0 ); // invoke-virtual {p1, v0}, Ljava/net/HttpURLConnection;->getHeaderField(Ljava/lang/String;)Ljava/lang/String;
/* .line 355 */
/* if-nez v0, :cond_0 */
/* .line 356 */
/* new-instance v0, Ljava/lang/StringBuilder; */
/* invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V */
final String v1 = "Could not get redirect location from a "; // const-string v1, "Could not get redirect location from a "
(( java.lang.StringBuilder ) v0 ).append ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v0 ).append ( p2 ); // invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;
final String v1 = " redirect."; // const-string v1, " redirect."
(( java.lang.StringBuilder ) v0 ).append ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v0 ).toString ( ); // invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
com.google.ads.util.b .c ( v0 );
/* .line 357 */
v0 = this.a;
v1 = com.google.ads.AdRequest$ErrorCode.INTERNAL_ERROR;
(( com.google.ads.internal.c ) v0 ).a ( v1 ); // invoke-virtual {v0, v1}, Lcom/google/ads/internal/c;->a(Lcom/google/ads/AdRequest$ErrorCode;)V
/* .line 358 */
(( com.google.ads.internal.f ) p0 ).a ( ); // invoke-virtual {p0}, Lcom/google/ads/internal/f;->a()V
/* .line 393 */
} // :goto_0
return;
/* .line 362 */
} // :cond_0
/* invoke-direct {p0, p1}, Lcom/google/ads/internal/f;->a(Ljava/net/HttpURLConnection;)V */
/* .line 365 */
this.f = v0;
/* .line 366 */
} // :cond_1
/* const/16 v0, 0xc8 */
/* if-ne p2, v0, :cond_3 */
/* .line 368 */
/* invoke-direct {p0, p1}, Lcom/google/ads/internal/f;->a(Ljava/net/HttpURLConnection;)V */
/* .line 369 */
/* new-instance v0, Ljava/io/InputStreamReader; */
(( java.net.HttpURLConnection ) p1 ).getInputStream ( ); // invoke-virtual {p1}, Ljava/net/HttpURLConnection;->getInputStream()Ljava/io/InputStream;
/* invoke-direct {v0, v1}, Ljava/io/InputStreamReader;-><init>(Ljava/io/InputStream;)V */
com.google.ads.util.AdUtil .a ( v0 );
(( java.lang.String ) v0 ).trim ( ); // invoke-virtual {v0}, Ljava/lang/String;->trim()Ljava/lang/String;
/* .line 373 */
/* new-instance v1, Ljava/lang/StringBuilder; */
/* invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V */
final String v2 = "Response content is: "; // const-string v2, "Response content is: "
(( java.lang.StringBuilder ) v1 ).append ( v2 ); // invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v1 ).append ( v0 ); // invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v1 ).toString ( ); // invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
com.google.ads.util.b .a ( v1 );
/* .line 374 */
v1 = android.text.TextUtils .isEmpty ( v0 );
if ( v1 != null) { // if-eqz v1, :cond_2
/* .line 375 */
/* new-instance v1, Ljava/lang/StringBuilder; */
/* invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V */
final String v2 = "Response message is null or zero length: "; // const-string v2, "Response message is null or zero length: "
(( java.lang.StringBuilder ) v1 ).append ( v2 ); // invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v1 ).append ( v0 ); // invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v0 ).toString ( ); // invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
com.google.ads.util.b .a ( v0 );
/* .line 376 */
v0 = this.a;
v1 = com.google.ads.AdRequest$ErrorCode.NO_FILL;
(( com.google.ads.internal.c ) v0 ).a ( v1 ); // invoke-virtual {v0, v1}, Lcom/google/ads/internal/c;->a(Lcom/google/ads/AdRequest$ErrorCode;)V
/* .line 377 */
(( com.google.ads.internal.f ) p0 ).a ( ); // invoke-virtual {p0}, Lcom/google/ads/internal/f;->a()V
/* .line 382 */
} // :cond_2
v1 = this.a;
v2 = this.f;
(( com.google.ads.internal.c ) v1 ).a ( v0, v2 ); // invoke-virtual {v1, v0, v2}, Lcom/google/ads/internal/c;->a(Ljava/lang/String;Ljava/lang/String;)V
/* .line 383 */
(( com.google.ads.internal.f ) p0 ).a ( ); // invoke-virtual {p0}, Lcom/google/ads/internal/f;->a()V
/* .line 384 */
} // :cond_3
/* if-ne p2, v1, :cond_4 */
/* .line 385 */
final String v0 = "Bad request"; // const-string v0, "Bad request"
com.google.ads.util.b .c ( v0 );
/* .line 386 */
v0 = this.a;
v1 = com.google.ads.AdRequest$ErrorCode.INVALID_REQUEST;
(( com.google.ads.internal.c ) v0 ).a ( v1 ); // invoke-virtual {v0, v1}, Lcom/google/ads/internal/c;->a(Lcom/google/ads/AdRequest$ErrorCode;)V
/* .line 387 */
(( com.google.ads.internal.f ) p0 ).a ( ); // invoke-virtual {p0}, Lcom/google/ads/internal/f;->a()V
/* .line 389 */
} // :cond_4
/* new-instance v0, Ljava/lang/StringBuilder; */
/* invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V */
final String v1 = "Invalid response code: "; // const-string v1, "Invalid response code: "
(( java.lang.StringBuilder ) v0 ).append ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v0 ).append ( p2 ); // invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v0 ).toString ( ); // invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
com.google.ads.util.b .c ( v0 );
/* .line 390 */
v0 = this.a;
v1 = com.google.ads.AdRequest$ErrorCode.INTERNAL_ERROR;
(( com.google.ads.internal.c ) v0 ).a ( v1 ); // invoke-virtual {v0, v1}, Lcom/google/ads/internal/c;->a(Lcom/google/ads/AdRequest$ErrorCode;)V
/* .line 391 */
(( com.google.ads.internal.f ) p0 ).a ( ); // invoke-virtual {p0}, Lcom/google/ads/internal/f;->a()V
/* goto/16 :goto_0 */
} // .end method
private void b ( ) {
/* .locals 2 */
/* .annotation system Ldalvik/annotation/Throws; */
/* value = { */
/* Ljava/net/MalformedURLException;, */
/* Ljava/io/IOException; */
/* } */
} // .end annotation
/* .prologue */
/* .line 420 */
} // :goto_0
/* iget-boolean v0, p0, Lcom/google/ads/internal/f;->d:Z */
/* if-nez v0, :cond_0 */
/* .line 421 */
/* new-instance v0, Ljava/net/URL; */
v1 = this.f;
/* invoke-direct {v0, v1}, Ljava/net/URL;-><init>(Ljava/lang/String;)V */
/* .line 422 */
v1 = this.c;
/* .line 425 */
try { // :try_start_0
v0 = this.b;
(( com.google.ads.internal.d ) v0 ).g ( ); // invoke-virtual {v0}, Lcom/google/ads/internal/d;->g()Lcom/google/ads/m;
v0 = this.d;
(( com.google.ads.util.i$b ) v0 ).a ( ); // invoke-virtual {v0}, Lcom/google/ads/util/i$b;->a()Ljava/lang/Object;
/* check-cast v0, Landroid/content/Context; */
/* invoke-direct {p0, v0, v1}, Lcom/google/ads/internal/f;->a(Landroid/content/Context;Ljava/net/HttpURLConnection;)V */
/* .line 426 */
v0 = this.b;
(( com.google.ads.internal.d ) v0 ).g ( ); // invoke-virtual {v0}, Lcom/google/ads/internal/d;->g()Lcom/google/ads/m;
v0 = this.d;
(( com.google.ads.util.i$b ) v0 ).a ( ); // invoke-virtual {v0}, Lcom/google/ads/util/i$b;->a()Ljava/lang/Object;
/* check-cast v0, Landroid/content/Context; */
com.google.ads.util.AdUtil .a ( v1,v0 );
/* .line 427 */
int v0 = 0; // const/4 v0, 0x0
(( java.net.HttpURLConnection ) v1 ).setInstanceFollowRedirects ( v0 ); // invoke-virtual {v1, v0}, Ljava/net/HttpURLConnection;->setInstanceFollowRedirects(Z)V
/* .line 428 */
(( java.net.HttpURLConnection ) v1 ).connect ( ); // invoke-virtual {v1}, Ljava/net/HttpURLConnection;->connect()V
/* .line 429 */
v0 = (( java.net.HttpURLConnection ) v1 ).getResponseCode ( ); // invoke-virtual {v1}, Ljava/net/HttpURLConnection;->getResponseCode()I
/* .line 430 */
/* invoke-direct {p0, v1, v0}, Lcom/google/ads/internal/f;->a(Ljava/net/HttpURLConnection;I)V */
/* :try_end_0 */
/* .catchall {:try_start_0 ..:try_end_0} :catchall_0 */
/* .line 432 */
(( java.net.HttpURLConnection ) v1 ).disconnect ( ); // invoke-virtual {v1}, Ljava/net/HttpURLConnection;->disconnect()V
/* :catchall_0 */
/* move-exception v0 */
(( java.net.HttpURLConnection ) v1 ).disconnect ( ); // invoke-virtual {v1}, Ljava/net/HttpURLConnection;->disconnect()V
/* throw v0 */
/* .line 435 */
} // :cond_0
return;
} // .end method
private void b ( java.net.HttpURLConnection p0 ) {
/* .locals 2 */
/* .prologue */
/* .line 177 */
final String v0 = "X-Afma-Debug-Dialog"; // const-string v0, "X-Afma-Debug-Dialog"
(( java.net.HttpURLConnection ) p1 ).getHeaderField ( v0 ); // invoke-virtual {p1, v0}, Ljava/net/HttpURLConnection;->getHeaderField(Ljava/lang/String;)Ljava/lang/String;
/* .line 178 */
v1 = android.text.TextUtils .isEmpty ( v0 );
/* if-nez v1, :cond_0 */
/* .line 179 */
v1 = this.a;
(( com.google.ads.internal.c ) v1 ).e ( v0 ); // invoke-virtual {v1, v0}, Lcom/google/ads/internal/c;->e(Ljava/lang/String;)V
/* .line 181 */
} // :cond_0
return;
} // .end method
private void c ( java.net.HttpURLConnection p0 ) {
/* .locals 2 */
/* .prologue */
/* .line 188 */
final String v0 = "Content-Type"; // const-string v0, "Content-Type"
(( java.net.HttpURLConnection ) p1 ).getHeaderField ( v0 ); // invoke-virtual {p1, v0}, Ljava/net/HttpURLConnection;->getHeaderField(Ljava/lang/String;)Ljava/lang/String;
/* .line 189 */
v1 = android.text.TextUtils .isEmpty ( v0 );
/* if-nez v1, :cond_0 */
/* .line 190 */
v1 = this.a;
(( com.google.ads.internal.c ) v1 ).b ( v0 ); // invoke-virtual {v1, v0}, Lcom/google/ads/internal/c;->b(Ljava/lang/String;)V
/* .line 192 */
} // :cond_0
return;
} // .end method
private void d ( java.net.HttpURLConnection p0 ) {
/* .locals 2 */
/* .prologue */
/* .line 200 */
final String v0 = "X-Afma-Mediation"; // const-string v0, "X-Afma-Mediation"
(( java.net.HttpURLConnection ) p1 ).getHeaderField ( v0 ); // invoke-virtual {p1, v0}, Ljava/net/HttpURLConnection;->getHeaderField(Ljava/lang/String;)Ljava/lang/String;
/* .line 201 */
v1 = android.text.TextUtils .isEmpty ( v0 );
/* if-nez v1, :cond_0 */
/* .line 202 */
v1 = this.a;
java.lang.Boolean .valueOf ( v0 );
v0 = (( java.lang.Boolean ) v0 ).booleanValue ( ); // invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z
(( com.google.ads.internal.c ) v1 ).a ( v0 ); // invoke-virtual {v1, v0}, Lcom/google/ads/internal/c;->a(Z)V
/* .line 204 */
} // :cond_0
return;
} // .end method
private void e ( java.net.HttpURLConnection p0 ) {
/* .locals 5 */
/* .prologue */
/* .line 210 */
final String v0 = "X-Afma-Interstitial-Timeout"; // const-string v0, "X-Afma-Interstitial-Timeout"
(( java.net.HttpURLConnection ) p1 ).getHeaderField ( v0 ); // invoke-virtual {p1, v0}, Ljava/net/HttpURLConnection;->getHeaderField(Ljava/lang/String;)Ljava/lang/String;
/* .line 211 */
v0 = android.text.TextUtils .isEmpty ( v1 );
/* if-nez v0, :cond_0 */
/* .line 213 */
try { // :try_start_0
v0 = java.lang.Float .parseFloat ( v1 );
/* .line 214 */
v2 = this.b;
/* const/high16 v3, 0x447a0000 # 1000.0f */
/* mul-float/2addr v0, v3 */
/* float-to-long v3, v0 */
(( com.google.ads.internal.d ) v2 ).a ( v3, v4 ); // invoke-virtual {v2, v3, v4}, Lcom/google/ads/internal/d;->a(J)V
/* :try_end_0 */
/* .catch Ljava/lang/NumberFormatException; {:try_start_0 ..:try_end_0} :catch_0 */
/* .line 220 */
} // :cond_0
} // :goto_0
return;
/* .line 216 */
/* :catch_0 */
/* move-exception v0 */
/* .line 217 */
/* new-instance v2, Ljava/lang/StringBuilder; */
/* invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V */
final String v3 = "Could not get timeout value: "; // const-string v3, "Could not get timeout value: "
(( java.lang.StringBuilder ) v2 ).append ( v3 ); // invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v2 ).append ( v1 ); // invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v1 ).toString ( ); // invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
com.google.ads.util.b .d ( v1,v0 );
} // .end method
private void f ( java.net.HttpURLConnection p0 ) {
/* .locals 5 */
/* .prologue */
/* .line 227 */
final String v0 = "X-Afma-Tracking-Urls"; // const-string v0, "X-Afma-Tracking-Urls"
(( java.net.HttpURLConnection ) p1 ).getHeaderField ( v0 ); // invoke-virtual {p1, v0}, Ljava/net/HttpURLConnection;->getHeaderField(Ljava/lang/String;)Ljava/lang/String;
/* .line 228 */
v1 = android.text.TextUtils .isEmpty ( v0 );
/* if-nez v1, :cond_0 */
/* .line 229 */
(( java.lang.String ) v0 ).trim ( ); // invoke-virtual {v0}, Ljava/lang/String;->trim()Ljava/lang/String;
final String v1 = "\\s+"; // const-string v1, "\\s+"
(( java.lang.String ) v0 ).split ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/String;->split(Ljava/lang/String;)[Ljava/lang/String;
/* .line 230 */
/* array-length v2, v1 */
int v0 = 0; // const/4 v0, 0x0
} // :goto_0
/* if-ge v0, v2, :cond_0 */
/* aget-object v3, v1, v0 */
/* .line 231 */
v4 = this.b;
(( com.google.ads.internal.d ) v4 ).b ( v3 ); // invoke-virtual {v4, v3}, Lcom/google/ads/internal/d;->b(Ljava/lang/String;)V
/* .line 230 */
/* add-int/lit8 v0, v0, 0x1 */
/* .line 234 */
} // :cond_0
return;
} // .end method
private void g ( java.net.HttpURLConnection p0 ) {
/* .locals 5 */
/* .prologue */
/* .line 240 */
final String v0 = "X-Afma-Click-Tracking-Urls"; // const-string v0, "X-Afma-Click-Tracking-Urls"
(( java.net.HttpURLConnection ) p1 ).getHeaderField ( v0 ); // invoke-virtual {p1, v0}, Ljava/net/HttpURLConnection;->getHeaderField(Ljava/lang/String;)Ljava/lang/String;
/* .line 241 */
v1 = android.text.TextUtils .isEmpty ( v0 );
/* if-nez v1, :cond_0 */
/* .line 242 */
(( java.lang.String ) v0 ).trim ( ); // invoke-virtual {v0}, Ljava/lang/String;->trim()Ljava/lang/String;
final String v1 = "\\s+"; // const-string v1, "\\s+"
(( java.lang.String ) v0 ).split ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/String;->split(Ljava/lang/String;)[Ljava/lang/String;
/* .line 243 */
/* array-length v2, v1 */
int v0 = 0; // const/4 v0, 0x0
} // :goto_0
/* if-ge v0, v2, :cond_0 */
/* aget-object v3, v1, v0 */
/* .line 244 */
v4 = this.a;
(( com.google.ads.internal.c ) v4 ).a ( v3 ); // invoke-virtual {v4, v3}, Lcom/google/ads/internal/c;->a(Ljava/lang/String;)V
/* .line 243 */
/* add-int/lit8 v0, v0, 0x1 */
/* .line 247 */
} // :cond_0
return;
} // .end method
private void h ( java.net.HttpURLConnection p0 ) {
/* .locals 4 */
/* .prologue */
/* .line 254 */
final String v0 = "X-Afma-Refresh-Rate"; // const-string v0, "X-Afma-Refresh-Rate"
(( java.net.HttpURLConnection ) p1 ).getHeaderField ( v0 ); // invoke-virtual {p1, v0}, Ljava/net/HttpURLConnection;->getHeaderField(Ljava/lang/String;)Ljava/lang/String;
/* .line 255 */
v1 = android.text.TextUtils .isEmpty ( v0 );
/* if-nez v1, :cond_0 */
/* .line 258 */
try { // :try_start_0
java.lang.Float .parseFloat ( v0 );
/* :try_end_0 */
v0 = /* .catch Ljava/lang/NumberFormatException; {:try_start_0 ..:try_end_0} :catch_0 */
/* .line 263 */
int v1 = 0; // const/4 v1, 0x0
/* cmpl-float v1, v0, v1 */
/* if-lez v1, :cond_1 */
/* .line 264 */
v1 = this.b;
(( com.google.ads.internal.d ) v1 ).a ( v0 ); // invoke-virtual {v1, v0}, Lcom/google/ads/internal/d;->a(F)V
/* .line 265 */
v0 = this.b;
v0 = (( com.google.ads.internal.d ) v0 ).r ( ); // invoke-virtual {v0}, Lcom/google/ads/internal/d;->r()Z
/* if-nez v0, :cond_0 */
/* .line 266 */
v0 = this.b;
(( com.google.ads.internal.d ) v0 ).f ( ); // invoke-virtual {v0}, Lcom/google/ads/internal/d;->f()V
/* .line 272 */
} // :cond_0
} // :goto_0
return;
/* .line 259 */
/* :catch_0 */
/* move-exception v1 */
/* .line 260 */
/* new-instance v2, Ljava/lang/StringBuilder; */
/* invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V */
final String v3 = "Could not get refresh value: "; // const-string v3, "Could not get refresh value: "
(( java.lang.StringBuilder ) v2 ).append ( v3 ); // invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v2 ).append ( v0 ); // invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v0 ).toString ( ); // invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
com.google.ads.util.b .d ( v0,v1 );
/* .line 268 */
} // :cond_1
v0 = this.b;
v0 = (( com.google.ads.internal.d ) v0 ).r ( ); // invoke-virtual {v0}, Lcom/google/ads/internal/d;->r()Z
if ( v0 != null) { // if-eqz v0, :cond_0
/* .line 269 */
v0 = this.b;
(( com.google.ads.internal.d ) v0 ).e ( ); // invoke-virtual {v0}, Lcom/google/ads/internal/d;->e()V
} // .end method
private void i ( java.net.HttpURLConnection p0 ) {
/* .locals 2 */
/* .prologue */
/* .line 279 */
final String v0 = "X-Afma-Orientation"; // const-string v0, "X-Afma-Orientation"
(( java.net.HttpURLConnection ) p1 ).getHeaderField ( v0 ); // invoke-virtual {p1, v0}, Ljava/net/HttpURLConnection;->getHeaderField(Ljava/lang/String;)Ljava/lang/String;
/* .line 280 */
v1 = android.text.TextUtils .isEmpty ( v0 );
/* if-nez v1, :cond_0 */
/* .line 281 */
final String v1 = "portrait"; // const-string v1, "portrait"
v1 = (( java.lang.String ) v0 ).equals ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
if ( v1 != null) { // if-eqz v1, :cond_1
/* .line 282 */
v0 = this.a;
v1 = com.google.ads.util.AdUtil .b ( );
(( com.google.ads.internal.c ) v0 ).a ( v1 ); // invoke-virtual {v0, v1}, Lcom/google/ads/internal/c;->a(I)V
/* .line 287 */
} // :cond_0
} // :goto_0
return;
/* .line 283 */
} // :cond_1
final String v1 = "landscape"; // const-string v1, "landscape"
v0 = (( java.lang.String ) v0 ).equals ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
if ( v0 != null) { // if-eqz v0, :cond_0
/* .line 284 */
v0 = this.a;
v1 = com.google.ads.util.AdUtil .a ( );
(( com.google.ads.internal.c ) v0 ).a ( v1 ); // invoke-virtual {v0, v1}, Lcom/google/ads/internal/c;->a(I)V
} // .end method
private void j ( java.net.HttpURLConnection p0 ) {
/* .locals 3 */
/* .prologue */
/* .line 294 */
final String v0 = "X-Afma-Doritos-Cache-Life"; // const-string v0, "X-Afma-Doritos-Cache-Life"
(( java.net.HttpURLConnection ) p1 ).getHeaderField ( v0 ); // invoke-virtual {p1, v0}, Ljava/net/HttpURLConnection;->getHeaderField(Ljava/lang/String;)Ljava/lang/String;
v0 = android.text.TextUtils .isEmpty ( v0 );
/* if-nez v0, :cond_0 */
/* .line 296 */
try { // :try_start_0
final String v0 = "X-Afma-Doritos-Cache-Life"; // const-string v0, "X-Afma-Doritos-Cache-Life"
(( java.net.HttpURLConnection ) p1 ).getHeaderField ( v0 ); // invoke-virtual {p1, v0}, Ljava/net/HttpURLConnection;->getHeaderField(Ljava/lang/String;)Ljava/lang/String;
java.lang.Long .parseLong ( v0 );
/* move-result-wide v0 */
/* .line 298 */
v2 = this.b;
(( com.google.ads.internal.d ) v2 ).b ( v0, v1 ); // invoke-virtual {v2, v0, v1}, Lcom/google/ads/internal/d;->b(J)V
/* :try_end_0 */
/* .catch Ljava/lang/NumberFormatException; {:try_start_0 ..:try_end_0} :catch_0 */
/* .line 305 */
} // :cond_0
} // :goto_0
return;
/* .line 299 */
/* :catch_0 */
/* move-exception v0 */
/* .line 300 */
/* new-instance v0, Ljava/lang/StringBuilder; */
/* invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V */
final String v1 = "Got bad value of Doritos cookie cache life from header: "; // const-string v1, "Got bad value of Doritos cookie cache life from header: "
(( java.lang.StringBuilder ) v0 ).append ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
final String v1 = "X-Afma-Doritos-Cache-Life"; // const-string v1, "X-Afma-Doritos-Cache-Life"
(( java.net.HttpURLConnection ) p1 ).getHeaderField ( v1 ); // invoke-virtual {p1, v1}, Ljava/net/HttpURLConnection;->getHeaderField(Ljava/lang/String;)Ljava/lang/String;
(( java.lang.StringBuilder ) v0 ).append ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
final String v1 = ".Using default value instead."; // const-string v1, ".Using default value instead."
(( java.lang.StringBuilder ) v0 ).append ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v0 ).toString ( ); // invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
com.google.ads.util.b .e ( v0 );
} // .end method
private void k ( java.net.HttpURLConnection p0 ) {
/* .locals 2 */
/* .prologue */
/* .line 322 */
final String v0 = "Cache-Control"; // const-string v0, "Cache-Control"
(( java.net.HttpURLConnection ) p1 ).getHeaderField ( v0 ); // invoke-virtual {p1, v0}, Ljava/net/HttpURLConnection;->getHeaderField(Ljava/lang/String;)Ljava/lang/String;
/* .line 323 */
v1 = android.text.TextUtils .isEmpty ( v0 );
/* if-nez v1, :cond_0 */
/* .line 326 */
v1 = this.a;
(( com.google.ads.internal.c ) v1 ).c ( v0 ); // invoke-virtual {v1, v0}, Lcom/google/ads/internal/c;->c(Ljava/lang/String;)V
/* .line 328 */
} // :cond_0
return;
} // .end method
/* # virtual methods */
void a ( ) {
/* .locals 1 */
/* .prologue */
/* .line 153 */
int v0 = 1; // const/4 v0, 0x1
/* iput-boolean v0, p0, Lcom/google/ads/internal/f;->d:Z */
/* .line 154 */
return;
} // .end method
synchronized void a ( java.lang.String p0 ) {
/* .locals 1 */
/* .prologue */
/* .line 335 */
/* monitor-enter p0 */
try { // :try_start_0
v0 = this.g;
/* if-nez v0, :cond_0 */
/* .line 336 */
this.f = p1;
/* .line 337 */
int v0 = 0; // const/4 v0, 0x0
/* iput-boolean v0, p0, Lcom/google/ads/internal/f;->d:Z */
/* .line 338 */
/* new-instance v0, Ljava/lang/Thread; */
/* invoke-direct {v0, p0}, Ljava/lang/Thread;-><init>(Ljava/lang/Runnable;)V */
this.g = v0;
/* .line 339 */
v0 = this.g;
(( java.lang.Thread ) v0 ).start ( ); // invoke-virtual {v0}, Ljava/lang/Thread;->start()V
/* :try_end_0 */
/* .catchall {:try_start_0 ..:try_end_0} :catchall_0 */
/* .line 341 */
} // :cond_0
/* monitor-exit p0 */
return;
/* .line 335 */
/* :catchall_0 */
/* move-exception v0 */
/* monitor-exit p0 */
/* throw v0 */
} // .end method
public void a ( Boolean p0 ) {
/* .locals 0 */
/* .prologue */
/* .line 314 */
/* iput-boolean p1, p0, Lcom/google/ads/internal/f;->e:Z */
/* .line 315 */
return;
} // .end method
public void run ( ) {
/* .locals 2 */
/* .prologue */
/* .line 399 */
try { // :try_start_0
/* invoke-direct {p0}, Lcom/google/ads/internal/f;->b()V */
/* :try_end_0 */
/* .catch Ljava/net/MalformedURLException; {:try_start_0 ..:try_end_0} :catch_0 */
/* .catch Ljava/io/IOException; {:try_start_0 ..:try_end_0} :catch_1 */
/* .catch Ljava/lang/Throwable; {:try_start_0 ..:try_end_0} :catch_2 */
/* .line 413 */
} // :goto_0
return;
/* .line 400 */
/* :catch_0 */
/* move-exception v0 */
/* .line 402 */
final String v1 = "Received malformed ad url from javascript."; // const-string v1, "Received malformed ad url from javascript."
com.google.ads.util.b .b ( v1,v0 );
/* .line 403 */
v0 = this.a;
v1 = com.google.ads.AdRequest$ErrorCode.INTERNAL_ERROR;
(( com.google.ads.internal.c ) v0 ).a ( v1 ); // invoke-virtual {v0, v1}, Lcom/google/ads/internal/c;->a(Lcom/google/ads/AdRequest$ErrorCode;)V
/* .line 404 */
/* :catch_1 */
/* move-exception v0 */
/* .line 406 */
final String v1 = "IOException connecting to ad url."; // const-string v1, "IOException connecting to ad url."
com.google.ads.util.b .d ( v1,v0 );
/* .line 407 */
v0 = this.a;
v1 = com.google.ads.AdRequest$ErrorCode.NETWORK_ERROR;
(( com.google.ads.internal.c ) v0 ).a ( v1 ); // invoke-virtual {v0, v1}, Lcom/google/ads/internal/c;->a(Lcom/google/ads/AdRequest$ErrorCode;)V
/* .line 408 */
/* :catch_2 */
/* move-exception v0 */
/* .line 410 */
final String v1 = "An unknown error occurred in AdResponseLoader."; // const-string v1, "An unknown error occurred in AdResponseLoader."
com.google.ads.util.b .b ( v1,v0 );
/* .line 411 */
v0 = this.a;
v1 = com.google.ads.AdRequest$ErrorCode.INTERNAL_ERROR;
(( com.google.ads.internal.c ) v0 ).a ( v1 ); // invoke-virtual {v0, v1}, Lcom/google/ads/internal/c;->a(Lcom/google/ads/AdRequest$ErrorCode;)V
} // .end method
