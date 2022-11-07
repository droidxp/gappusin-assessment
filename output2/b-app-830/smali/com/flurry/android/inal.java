class inal {
	 /* # instance fields */
	 java.lang.String a;
	 java.util.List b;
	 /* # direct methods */
	 inal ( ) {
		 /* .locals 0 */
		 /* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
		 return;
	 } // .end method
ang.String c;
	 private static volatile java.lang.String d;
	 private static volatile java.lang.String e;
	 private static java.lang.String f;
	 private static Integer g;
	 /* # instance fields */
	 private java.lang.String h;
	 private java.lang.String i;
	 private java.lang.String j;
	 private Long k;
	 private Long l;
	 private Long m;
	 private Long n;
	 private com.flurry.android.z o;
	 private Boolean p;
	 private volatile Boolean q;
	 private java.lang.String r;
	 private java.util.Map s;
	 private android.os.Handler t;
	 private Boolean u;
	 private transient java.util.Map v;
	 private com.flurry.android.ag w;
	 private java.util.List x;
	 private java.util.Map y;
	 private com.flurry.android.AppCircleCallback z;
	 /* # direct methods */
	 static inal ( ) {
		 /* .locals 3 */
		 final String v0 = "market://"; // const-string v0, "market://"
		 final String v0 = "market://details?id="; // const-string v0, "market://details?id="
		 final String v0 = "https://market.android.com/details?id="; // const-string v0, "https://market.android.com/details?id="
		 final String v0 = "com.flurry.android.ACTION_CATALOG"; // const-string v0, "com.flurry.android.ACTION_CATALOG"
		 final String v0 = "FlurryAgent"; // const-string v0, "FlurryAgent"
		 /* new-instance v0, Ljava/util/Random; */
		 java.lang.System .currentTimeMillis ( );
		 /* move-result-wide v1 */
		 /* invoke-direct {v0, v1, v2}, Ljava/util/Random;-><init>(J)V */
		 /* const/16 v0, 0x1388 */
		 final String v0 = ""; // const-string v0, ""
		 /* const-wide/16 v0, 0x0 */
		 /* sput-wide v0, Lcom/flurry/android/u;->A:J */
		 return;
	 } // .end method
	 public inal ( ) {
		 /* .locals 1 */
		 /* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
		 int v0 = 1; // const/4 v0, 0x1
		 /* iput-boolean v0, p0, Lcom/flurry/android/u;->p:Z */
		 /* new-instance v0, Ljava/util/HashMap; */
		 /* invoke-direct {v0}, Ljava/util/HashMap;-><init>()V */
		 this.s = v0;
		 /* new-instance v0, Ljava/util/HashMap; */
		 /* invoke-direct {v0}, Ljava/util/HashMap;-><init>()V */
		 this.v = v0;
		 /* new-instance v0, Ljava/util/ArrayList; */
		 /* invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V */
		 this.x = v0;
		 /* new-instance v0, Ljava/util/HashMap; */
		 /* invoke-direct {v0}, Ljava/util/HashMap;-><init>()V */
		 this.y = v0;
		 /* new-instance v0, Lcom/flurry/android/z; */
		 /* invoke-direct {v0}, Lcom/flurry/android/z;-><init>()V */
		 this.o = v0;
		 return;
	 } // .end method
	 static java.lang.String a ( Object p0, java.lang.String p1 ) { //synthethic
		 /* .locals 1 */
		 /* invoke-direct {p0, p1}, Lcom/flurry/android/u;->b(Ljava/lang/String;)Ljava/lang/String; */
	 } // .end method
	 private static java.lang.String a ( Object[] p0 ) {
		 /* .locals 4 */
		 /* const/16 v3, 0xa */
		 /* new-instance v0, Ljava/lang/StringBuilder; */
		 /* invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V */
		 int v1 = 0; // const/4 v1, 0x0
	 } // :goto_0
	 /* array-length v2, p0 */
	 /* if-ge v1, v2, :cond_2 */
	 /* aget-byte v2, p0, v1 */
	 /* shr-int/lit8 v2, v2, 0x4 */
	 /* and-int/lit8 v2, v2, 0xf */
	 /* if-ge v2, v3, :cond_0 */
	 /* add-int/lit8 v2, v2, 0x30 */
	 /* int-to-char v2, v2 */
	 (( java.lang.StringBuilder ) v0 ).append ( v2 ); // invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;
} // :goto_1
/* aget-byte v2, p0, v1 */
/* and-int/lit8 v2, v2, 0xf */
/* if-ge v2, v3, :cond_1 */
/* add-int/lit8 v2, v2, 0x30 */
/* int-to-char v2, v2 */
(( java.lang.StringBuilder ) v0 ).append ( v2 ); // invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;
} // :goto_2
/* add-int/lit8 v1, v1, 0x1 */
} // :cond_0
/* add-int/lit8 v2, v2, 0x41 */
/* sub-int/2addr v2, v3 */
/* int-to-char v2, v2 */
(( java.lang.StringBuilder ) v0 ).append ( v2 ); // invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;
} // :cond_1
/* add-int/lit8 v2, v2, 0x41 */
/* sub-int/2addr v2, v3 */
/* int-to-char v2, v2 */
(( java.lang.StringBuilder ) v0 ).append ( v2 ); // invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;
} // :cond_2
(( java.lang.StringBuilder ) v0 ).toString ( ); // invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
} // .end method
static void a ( Object p0, android.content.Context p1, java.lang.String p2 ) { //synthethic
/* .locals 5 */
final String v4 = "android.intent.action.VIEW"; // const-string v4, "android.intent.action.VIEW"
v0 = com.flurry.android.u.d;
v0 = (( java.lang.String ) p2 ).startsWith ( v0 ); // invoke-virtual {p2, v0}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z
if ( v0 != null) { // if-eqz v0, :cond_1
v0 = com.flurry.android.u.d;
v0 = (( java.lang.String ) v0 ).length ( ); // invoke-virtual {v0}, Ljava/lang/String;->length()I
(( java.lang.String ) p2 ).substring ( v0 ); // invoke-virtual {p2, v0}, Ljava/lang/String;->substring(I)Ljava/lang/String;
/* iget-boolean v1, p0, Lcom/flurry/android/u;->p:Z */
if ( v1 != null) { // if-eqz v1, :cond_0
try { // :try_start_0
v1 = com.flurry.android.u.a;
/* new-instance v2, Ljava/lang/StringBuilder; */
/* invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V */
final String v3 = "Launching Android Market for app "; // const-string v3, "Launching Android Market for app "
(( java.lang.StringBuilder ) v2 ).append ( v3 ); // invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v2 ).append ( v0 ); // invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v0 ).toString ( ); // invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
com.flurry.android.ah .a ( v1,v0 );
/* new-instance v0, Landroid/content/Intent; */
final String v1 = "android.intent.action.VIEW"; // const-string v1, "android.intent.action.VIEW"
/* invoke-direct {v0, v1}, Landroid/content/Intent;-><init>(Ljava/lang/String;)V */
android.net.Uri .parse ( p2 );
(( android.content.Intent ) v0 ).setData ( v1 ); // invoke-virtual {v0, v1}, Landroid/content/Intent;->setData(Landroid/net/Uri;)Landroid/content/Intent;
(( android.content.Context ) p1 ).startActivity ( v0 ); // invoke-virtual {p1, v0}, Landroid/content/Context;->startActivity(Landroid/content/Intent;)V
/* :try_end_0 */
/* .catch Ljava/lang/Exception; {:try_start_0 ..:try_end_0} :catch_0 */
} // :goto_0
return;
/* :catch_0 */
/* move-exception v0 */
v1 = com.flurry.android.u.a;
/* new-instance v2, Ljava/lang/StringBuilder; */
/* invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V */
final String v3 = "Cannot launch Marketplace url "; // const-string v3, "Cannot launch Marketplace url "
(( java.lang.StringBuilder ) v2 ).append ( v3 ); // invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v2 ).append ( p2 ); // invoke-virtual {v2, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v2 ).toString ( ); // invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
com.flurry.android.ah .c ( v1,v2,v0 );
} // :cond_0
v1 = com.flurry.android.u.a;
/* new-instance v2, Ljava/lang/StringBuilder; */
/* invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V */
final String v3 = "Launching Android Market website for app "; // const-string v3, "Launching Android Market website for app "
(( java.lang.StringBuilder ) v2 ).append ( v3 ); // invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v2 ).append ( v0 ); // invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v2 ).toString ( ); // invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
com.flurry.android.ah .a ( v1,v2 );
/* new-instance v1, Ljava/lang/StringBuilder; */
/* invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V */
v2 = com.flurry.android.u.e;
(( java.lang.StringBuilder ) v1 ).append ( v2 ); // invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v1 ).append ( v0 ); // invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v0 ).toString ( ); // invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
/* new-instance v1, Landroid/content/Intent; */
final String v2 = "android.intent.action.VIEW"; // const-string v2, "android.intent.action.VIEW"
/* invoke-direct {v1, v4}, Landroid/content/Intent;-><init>(Ljava/lang/String;)V */
android.net.Uri .parse ( v0 );
(( android.content.Intent ) v1 ).setData ( v0 ); // invoke-virtual {v1, v0}, Landroid/content/Intent;->setData(Landroid/net/Uri;)Landroid/content/Intent;
(( android.content.Context ) p1 ).startActivity ( v0 ); // invoke-virtual {p1, v0}, Landroid/content/Context;->startActivity(Landroid/content/Intent;)V
} // :cond_1
v0 = com.flurry.android.u.a;
/* new-instance v1, Ljava/lang/StringBuilder; */
/* invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V */
final String v2 = "Unexpected android market url scheme: "; // const-string v2, "Unexpected android market url scheme: "
(( java.lang.StringBuilder ) v1 ).append ( v2 ); // invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v1 ).append ( p2 ); // invoke-virtual {v1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v1 ).toString ( ); // invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
com.flurry.android.ah .d ( v0,v1 );
} // .end method
private static void a ( java.lang.Runnable p0 ) {
/* .locals 1 */
/* new-instance v0, Landroid/os/Handler; */
/* invoke-direct {v0}, Landroid/os/Handler;-><init>()V */
(( android.os.Handler ) v0 ).post ( p0 ); // invoke-virtual {v0, p0}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z
return;
} // .end method
private java.lang.String b ( java.lang.String p0 ) {
/* .locals 7 */
int v5 = 0; // const/4 v5, 0x0
final String v4 = "Unknown host: "; // const-string v4, "Unknown host: "
try { // :try_start_0
v0 = com.flurry.android.u.c;
v0 = (( java.lang.String ) p1 ).startsWith ( v0 ); // invoke-virtual {p1, v0}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z
/* if-nez v0, :cond_2 */
/* new-instance v0, Lorg/apache/http/client/methods/HttpGet; */
/* invoke-direct {v0, p1}, Lorg/apache/http/client/methods/HttpGet;-><init>(Ljava/lang/String;)V */
/* new-instance v1, Lorg/apache/http/impl/client/DefaultHttpClient; */
v1 = /* invoke-direct {v1}, Lorg/apache/http/impl/client/DefaultHttpClient;-><init>()V */
/* const/16 v2, 0xc8 */
/* if-ne v1, v2, :cond_1 */
org.apache.http.util.EntityUtils .toString ( v0 );
/* :try_end_0 */
/* .catch Ljava/net/UnknownHostException; {:try_start_0 ..:try_end_0} :catch_0 */
/* .catch Ljava/lang/Exception; {:try_start_0 ..:try_end_0} :catch_1 */
try { // :try_start_1
v1 = com.flurry.android.u.c;
v1 = (( java.lang.String ) v0 ).startsWith ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z
/* if-nez v1, :cond_0 */
/* invoke-direct {p0, v0}, Lcom/flurry/android/u;->b(Ljava/lang/String;)Ljava/lang/String; */
/* :try_end_1 */
/* .catch Ljava/net/UnknownHostException; {:try_start_1 ..:try_end_1} :catch_0 */
/* .catch Ljava/lang/Exception; {:try_start_1 ..:try_end_1} :catch_2 */
} // :cond_0
} // :goto_0
} // :cond_1
try { // :try_start_2
v0 = com.flurry.android.u.a;
/* new-instance v2, Ljava/lang/StringBuilder; */
/* invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V */
final String v3 = "Cannot process with responseCode "; // const-string v3, "Cannot process with responseCode "
(( java.lang.StringBuilder ) v2 ).append ( v3 ); // invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v2 ).append ( v1 ); // invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v2 ).toString ( ); // invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
com.flurry.android.ah .c ( v0,v2 );
/* new-instance v0, Ljava/lang/StringBuilder; */
/* invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V */
final String v2 = "Error when fetching application\'s android market ID, responseCode "; // const-string v2, "Error when fetching application\'s android market ID, responseCode "
(( java.lang.StringBuilder ) v0 ).append ( v2 ); // invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v0 ).append ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v0 ).toString ( ); // invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
/* invoke-direct {p0, v0}, Lcom/flurry/android/u;->c(Ljava/lang/String;)V */
/* :try_end_2 */
/* .catch Ljava/net/UnknownHostException; {:try_start_2 ..:try_end_2} :catch_0 */
/* .catch Ljava/lang/Exception; {:try_start_2 ..:try_end_2} :catch_1 */
} // :cond_2
/* move-object v0, p1 */
/* :catch_0 */
/* move-exception v0 */
v1 = com.flurry.android.u.a;
/* new-instance v2, Ljava/lang/StringBuilder; */
/* invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V */
final String v3 = "Unknown host: "; // const-string v3, "Unknown host: "
(( java.lang.StringBuilder ) v2 ).append ( v4 ); // invoke-virtual {v2, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.net.UnknownHostException ) v0 ).getMessage ( ); // invoke-virtual {v0}, Ljava/net/UnknownHostException;->getMessage()Ljava/lang/String;
(( java.lang.StringBuilder ) v2 ).append ( v3 ); // invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v2 ).toString ( ); // invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
com.flurry.android.ah .c ( v1,v2 );
v1 = this.z;
if ( v1 != null) { // if-eqz v1, :cond_3
/* new-instance v1, Ljava/lang/StringBuilder; */
/* invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V */
final String v2 = "Unknown host: "; // const-string v2, "Unknown host: "
(( java.lang.StringBuilder ) v1 ).append ( v4 ); // invoke-virtual {v1, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.net.UnknownHostException ) v0 ).getMessage ( ); // invoke-virtual {v0}, Ljava/net/UnknownHostException;->getMessage()Ljava/lang/String;
(( java.lang.StringBuilder ) v1 ).append ( v0 ); // invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v0 ).toString ( ); // invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
/* invoke-direct {p0, v0}, Lcom/flurry/android/u;->c(Ljava/lang/String;)V */
} // :cond_3
/* move-object v0, v5 */
/* :catch_1 */
/* move-exception v0 */
/* move-object v1, p1 */
} // :goto_1
v2 = com.flurry.android.u.a;
/* new-instance v3, Ljava/lang/StringBuilder; */
/* invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V */
final String v4 = "Failed on url: "; // const-string v4, "Failed on url: "
(( java.lang.StringBuilder ) v3 ).append ( v4 ); // invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v3 ).append ( v1 ); // invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v1 ).toString ( ); // invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
com.flurry.android.ah .c ( v2,v1,v0 );
/* move-object v0, v5 */
/* goto/16 :goto_0 */
/* :catch_2 */
/* move-exception v1 */
/* move-object v6, v1 */
/* move-object v1, v0 */
/* move-object v0, v6 */
} // .end method
static void b ( Object p0, java.lang.String p1 ) { //synthethic
/* .locals 0 */
/* invoke-direct {p0, p1}, Lcom/flurry/android/u;->c(Ljava/lang/String;)V */
return;
} // .end method
private void c ( java.lang.String p0 ) {
/* .locals 1 */
/* new-instance v0, Lcom/flurry/android/ae; */
/* invoke-direct {v0, p0, p1}, Lcom/flurry/android/ae;-><init>(Lcom/flurry/android/u;Ljava/lang/String;)V */
com.flurry.android.u .a ( v0 );
return;
} // .end method
private synchronized com.flurry.android.AdImage k ( ) {
/* .locals 1 */
/* monitor-enter p0 */
try { // :try_start_0
/* invoke-direct {p0}, Lcom/flurry/android/u;->l()Z */
/* :try_end_0 */
v0 = /* .catchall {:try_start_0 ..:try_end_0} :catchall_0 */
/* if-nez v0, :cond_0 */
int v0 = 0; // const/4 v0, 0x0
} // :goto_0
/* monitor-exit p0 */
} // :cond_0
try { // :try_start_1
v0 = this.o;
(( com.flurry.android.z ) v0 ).b ( ); // invoke-virtual {v0}, Lcom/flurry/android/z;->b()Lcom/flurry/android/AdImage;
/* :try_end_1 */
/* .catchall {:try_start_1 ..:try_end_1} :catchall_0 */
/* :catchall_0 */
/* move-exception v0 */
/* monitor-exit p0 */
/* throw v0 */
} // .end method
private Boolean l ( ) {
/* .locals 2 */
/* iget-boolean v0, p0, Lcom/flurry/android/u;->q:Z */
/* if-nez v0, :cond_0 */
v0 = com.flurry.android.u.a;
final String v1 = "AppCircle is not initialized"; // const-string v1, "AppCircle is not initialized"
com.flurry.android.ah .d ( v0,v1 );
} // :cond_0
v0 = this.r;
/* if-nez v0, :cond_1 */
v0 = com.flurry.android.u.a;
final String v1 = "Cannot identify UDID."; // const-string v1, "Cannot identify UDID."
com.flurry.android.ah .d ( v0,v1 );
} // :cond_1
/* iget-boolean v0, p0, Lcom/flurry/android/u;->q:Z */
} // .end method
/* # virtual methods */
synchronized final com.flurry.android.AdImage a ( Long p0 ) {
/* .locals 1 */
/* monitor-enter p0 */
try { // :try_start_0
/* invoke-direct {p0}, Lcom/flurry/android/u;->l()Z */
/* :try_end_0 */
v0 = /* .catchall {:try_start_0 ..:try_end_0} :catchall_0 */
/* if-nez v0, :cond_0 */
int v0 = 0; // const/4 v0, 0x0
} // :goto_0
/* monitor-exit p0 */
} // :cond_0
try { // :try_start_1
v0 = this.o;
(( com.flurry.android.z ) v0 ).a ( p1, p2 ); // invoke-virtual {v0, p1, p2}, Lcom/flurry/android/z;->a(J)Lcom/flurry/android/AdImage;
/* :try_end_1 */
/* .catchall {:try_start_1 ..:try_end_1} :catchall_0 */
/* :catchall_0 */
/* move-exception v0 */
/* monitor-exit p0 */
/* throw v0 */
} // .end method
synchronized final java.lang.String a ( Object p0 ) {
/* .locals 6 */
/* monitor-enter p0 */
try { // :try_start_0
v0 = this.b;
(( com.flurry.android.p ) p1 ).a ( ); // invoke-virtual {p1}, Lcom/flurry/android/p;->a()J
/* move-result-wide v1 */
/* new-instance v3, Ljava/lang/StringBuilder; */
/* invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V */
final String v4 = "?apik="; // const-string v4, "?apik="
(( java.lang.StringBuilder ) v3 ).append ( v4 ); // invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
v4 = this.j;
(( java.lang.StringBuilder ) v3 ).append ( v4 ); // invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
final String v4 = "&cid="; // const-string v4, "&cid="
(( java.lang.StringBuilder ) v3 ).append ( v4 ); // invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
/* iget-wide v4, v0, Lcom/flurry/android/v;->e:J */
(( java.lang.StringBuilder ) v3 ).append ( v4, v5 ); // invoke-virtual {v3, v4, v5}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;
final String v4 = "&adid="; // const-string v4, "&adid="
(( java.lang.StringBuilder ) v3 ).append ( v4 ); // invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
/* iget-wide v4, v0, Lcom/flurry/android/v;->a:J */
(( java.lang.StringBuilder ) v3 ).append ( v4, v5 ); // invoke-virtual {v3, v4, v5}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;
final String v4 = "&pid="; // const-string v4, "&pid="
(( java.lang.StringBuilder ) v3 ).append ( v4 ); // invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
v4 = this.r;
(( java.lang.StringBuilder ) v3 ).append ( v4 ); // invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
final String v4 = "&iid="; // const-string v4, "&iid="
(( java.lang.StringBuilder ) v3 ).append ( v4 ); // invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
/* iget-wide v4, p0, Lcom/flurry/android/u;->k:J */
(( java.lang.StringBuilder ) v3 ).append ( v4, v5 ); // invoke-virtual {v3, v4, v5}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;
final String v4 = "&sid="; // const-string v4, "&sid="
(( java.lang.StringBuilder ) v3 ).append ( v4 ); // invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
/* iget-wide v4, p0, Lcom/flurry/android/u;->l:J */
(( java.lang.StringBuilder ) v3 ).append ( v4, v5 ); // invoke-virtual {v3, v4, v5}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;
final String v4 = "&its="; // const-string v4, "&its="
(( java.lang.StringBuilder ) v3 ).append ( v4 ); // invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v3 ).append ( v1, v2 ); // invoke-virtual {v3, v1, v2}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;
final String v2 = "&hid="; // const-string v2, "&hid="
(( java.lang.StringBuilder ) v1 ).append ( v2 ); // invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
v2 = this.a;
com.flurry.android.r .a ( v2 );
(( java.lang.StringBuilder ) v1 ).append ( v2 ); // invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
final String v2 = "&ac="; // const-string v2, "&ac="
(( java.lang.StringBuilder ) v1 ).append ( v2 ); // invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
v0 = this.g;
com.flurry.android.u .a ( v0 );
(( java.lang.StringBuilder ) v1 ).append ( v0 ); // invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
v0 = this.s;
if ( v0 != null) { // if-eqz v0, :cond_0
v0 = v0 = this.s;
/* if-nez v0, :cond_0 */
v0 = this.s;
v0 = } // :goto_0
if ( v0 != null) { // if-eqz v0, :cond_0
/* check-cast v0, Ljava/util/Map$Entry; */
/* new-instance v1, Ljava/lang/StringBuilder; */
/* invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V */
final String v4 = "c_"; // const-string v4, "c_"
(( java.lang.StringBuilder ) v1 ).append ( v4 ); // invoke-virtual {v1, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
/* check-cast v1, Ljava/lang/String; */
com.flurry.android.r .a ( v1 );
(( java.lang.StringBuilder ) v4 ).append ( v1 ); // invoke-virtual {v4, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v1 ).toString ( ); // invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
/* check-cast v0, Ljava/lang/String; */
com.flurry.android.r .a ( v0 );
final String v4 = "&"; // const-string v4, "&"
(( java.lang.StringBuilder ) v2 ).append ( v4 ); // invoke-virtual {v2, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v4 ).append ( v1 ); // invoke-virtual {v4, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
final String v4 = "="; // const-string v4, "="
(( java.lang.StringBuilder ) v1 ).append ( v4 ); // invoke-virtual {v1, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v1 ).append ( v0 ); // invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
/* :try_end_0 */
/* .catchall {:try_start_0 ..:try_end_0} :catchall_0 */
/* :catchall_0 */
/* move-exception v0 */
/* monitor-exit p0 */
/* throw v0 */
} // :cond_0
try { // :try_start_1
final String v0 = "&ats="; // const-string v0, "&ats="
(( java.lang.StringBuilder ) v2 ).append ( v0 ); // invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
java.lang.System .currentTimeMillis ( );
/* move-result-wide v3 */
(( java.lang.StringBuilder ) v0 ).append ( v3, v4 ); // invoke-virtual {v0, v3, v4}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v2 ).toString ( ); // invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
/* :try_end_1 */
/* .catchall {:try_start_1 ..:try_end_1} :catchall_0 */
/* monitor-exit p0 */
} // .end method
synchronized final java.util.List a ( android.content.Context p0, java.util.List p1, java.lang.Long p2, Integer p3, Boolean p4 ) {
/* .locals 11 */
/* monitor-enter p0 */
try { // :try_start_0
v0 = /* invoke-direct {p0}, Lcom/flurry/android/u;->l()Z */
/* if-nez v0, :cond_0 */
java.util.Collections .emptyList ( );
/* :try_end_0 */
/* .catchall {:try_start_0 ..:try_end_0} :catchall_0 */
} // :goto_0
/* monitor-exit p0 */
} // :cond_0
try { // :try_start_1
v0 = this.o;
v0 = (( com.flurry.android.z ) v0 ).c ( ); // invoke-virtual {v0}, Lcom/flurry/android/z;->c()Z
if ( v0 != null) { // if-eqz v0, :cond_a
if ( p2 != null) { // if-eqz p2, :cond_a
v0 = if ( p2 != null) { // if-eqz p2, :cond_1
/* if-nez v0, :cond_1 */
v0 = this.o;
v0 = (( com.flurry.android.z ) v0 ).c ( ); // invoke-virtual {v0}, Lcom/flurry/android/z;->c()Z
/* if-nez v0, :cond_4 */
} // :cond_1
java.util.Collections .emptyList ( );
/* move-object v7, v0 */
v1 = v0 = } // :goto_1
v8 = java.lang.Math .min ( v0,v1 );
/* new-instance v9, Ljava/util/ArrayList; */
/* invoke-direct {v9}, Ljava/util/ArrayList;-><init>()V */
int v0 = 0; // const/4 v0, 0x0
/* move v10, v0 */
} // :goto_2
/* if-ge v10, v8, :cond_9 */
/* check-cast p3, Ljava/lang/String; */
v0 = this.o;
(( com.flurry.android.z ) v0 ).b ( p3 ); // invoke-virtual {v0, p3}, Lcom/flurry/android/z;->b(Ljava/lang/String;)Lcom/flurry/android/e;
if ( v4 != null) { // if-eqz v4, :cond_8
/* new-instance v3, Lcom/flurry/android/p; */
/* check-cast p3, Ljava/lang/String; */
int v0 = 1; // const/4 v0, 0x1
(( com.flurry.android.u ) p0 ).i ( ); // invoke-virtual {p0}, Lcom/flurry/android/u;->i()J
/* move-result-wide v1 */
/* invoke-direct {v3, p3, v0, v1, v2}, Lcom/flurry/android/p;-><init>(Ljava/lang/String;BJ)V */
v0 = v0 = this.x;
/* const/16 v1, 0x7fff */
/* if-ge v0, v1, :cond_2 */
v0 = this.x;
v0 = this.v;
(( com.flurry.android.p ) v3 ).a ( ); // invoke-virtual {v3}, Lcom/flurry/android/p;->a()J
/* move-result-wide v1 */
java.lang.Long .valueOf ( v1,v2 );
v0 = } // :cond_2
/* if-ge v10, v0, :cond_3 */
/* check-cast p3, Lcom/flurry/android/v; */
this.b = p3;
/* new-instance v0, Lcom/flurry/android/f; */
int v1 = 2; // const/4 v1, 0x2
(( com.flurry.android.u ) p0 ).i ( ); // invoke-virtual {p0}, Lcom/flurry/android/u;->i()J
/* move-result-wide v5 */
/* invoke-direct {v0, v1, v5, v6}, Lcom/flurry/android/f;-><init>(BJ)V */
(( com.flurry.android.p ) v3 ).a ( v0 ); // invoke-virtual {v3, v0}, Lcom/flurry/android/p;->a(Lcom/flurry/android/f;)V
/* new-instance v0, Lcom/flurry/android/y; */
/* move-object v1, p1 */
/* move-object v2, p0 */
/* move v5, p4 */
/* move/from16 v6, p5 */
/* invoke-direct/range {v0 ..v6}, Lcom/flurry/android/y;-><init>(Landroid/content/Context;Lcom/flurry/android/u;Lcom/flurry/android/p;Lcom/flurry/android/e;IZ)V */
} // :cond_3
} // :goto_3
/* add-int/lit8 v0, v10, 0x1 */
/* move v10, v0 */
} // :cond_4
v1 = this.o;
int v0 = 0; // const/4 v0, 0x0
/* check-cast v0, Ljava/lang/String; */
(( com.flurry.android.z ) v1 ).a ( v0 ); // invoke-virtual {v1, v0}, Lcom/flurry/android/z;->a(Ljava/lang/String;)[Lcom/flurry/android/v;
if ( v0 != null) { // if-eqz v0, :cond_7
/* array-length v1, v0 */
/* if-lez v1, :cond_7 */
/* new-instance v1, Ljava/util/ArrayList; */
java.util.Arrays .asList ( v0 );
/* invoke-direct {v1, v0}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V */
java.util.Collections .shuffle ( v1 );
if ( p3 != null) { // if-eqz p3, :cond_6
v0 = } // :cond_5
if ( v0 != null) { // if-eqz v0, :cond_6
/* check-cast v0, Lcom/flurry/android/v; */
/* iget-wide v3, v0, Lcom/flurry/android/v;->a:J */
(( java.lang.Long ) p3 ).longValue ( ); // invoke-virtual {p3}, Ljava/lang/Long;->longValue()J
/* move-result-wide v5 */
/* cmp-long v0, v3, v5 */
/* if-nez v0, :cond_5 */
} // :cond_6
v3 = v2 = int v0 = 0; // const/4 v0, 0x0
v2 = java.lang.Math .min ( v2,v3 );
/* move-object v7, v0 */
/* goto/16 :goto_1 */
} // :cond_7
java.util.Collections .emptyList ( );
/* move-object v7, v0 */
/* goto/16 :goto_1 */
} // :cond_8
v0 = com.flurry.android.u.a;
/* new-instance v1, Ljava/lang/StringBuilder; */
/* invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V */
final String v2 = "Cannot find hook: "; // const-string v2, "Cannot find hook: "
(( java.lang.StringBuilder ) v1 ).append ( v2 ); // invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v1 ).append ( p3 ); // invoke-virtual {v1, p3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v1 ).toString ( ); // invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
com.flurry.android.ah .d ( v0,v1 );
/* :try_end_1 */
/* .catchall {:try_start_1 ..:try_end_1} :catchall_0 */
/* :catchall_0 */
/* move-exception v0 */
/* monitor-exit p0 */
/* throw v0 */
} // :cond_9
/* move-object v0, v9 */
/* goto/16 :goto_0 */
} // :cond_a
try { // :try_start_2
java.util.Collections .emptyList ( );
/* :try_end_2 */
/* .catchall {:try_start_2 ..:try_end_2} :catchall_0 */
/* goto/16 :goto_0 */
} // .end method
synchronized final void a ( Integer p0 ) {
/* .locals 1 */
/* monitor-enter p0 */
try { // :try_start_0
v0 = this.z;
if ( v0 != null) { // if-eqz v0, :cond_0
/* new-instance v0, Lcom/flurry/android/ad; */
/* invoke-direct {v0, p0, p1}, Lcom/flurry/android/ad;-><init>(Lcom/flurry/android/u;I)V */
com.flurry.android.u .a ( v0 );
/* :try_end_0 */
/* .catchall {:try_start_0 ..:try_end_0} :catchall_0 */
} // :cond_0
/* monitor-exit p0 */
return;
/* :catchall_0 */
/* move-exception v0 */
/* monitor-exit p0 */
/* throw v0 */
} // .end method
synchronized final void a ( Long p0, Long p1 ) {
/* .locals 2 */
/* monitor-enter p0 */
try { // :try_start_0
/* iput-wide p1, p0, Lcom/flurry/android/u;->l:J */
/* iput-wide p3, p0, Lcom/flurry/android/u;->m:J */
/* const-wide/16 v0, 0x0 */
/* iput-wide v0, p0, Lcom/flurry/android/u;->n:J */
v0 = this.x;
/* :try_end_0 */
/* .catchall {:try_start_0 ..:try_end_0} :catchall_0 */
/* monitor-exit p0 */
return;
/* :catchall_0 */
/* move-exception v0 */
/* monitor-exit p0 */
/* throw v0 */
} // .end method
synchronized final void a ( android.content.Context p0, Object p1 ) {
/* .locals 5 */
int v4 = 1; // const/4 v4, 0x1
/* monitor-enter p0 */
try { // :try_start_0
/* iget-boolean v0, p0, Lcom/flurry/android/u;->q:Z */
/* if-nez v0, :cond_0 */
v0 = this.c;
this.h = v0;
v0 = this.d;
this.i = v0;
v0 = this.a;
this.j = v0;
/* iget-wide v0, p2, Lcom/flurry/android/a;->b:J */
/* iput-wide v0, p0, Lcom/flurry/android/u;->k:J */
v0 = this.e;
this.t = v0;
/* new-instance v0, Lcom/flurry/android/ag; */
v1 = this.t;
/* invoke-direct {v0, v1, v2}, Lcom/flurry/android/ag;-><init>(Landroid/os/Handler;I)V */
this.w = v0;
(( android.content.Context ) p1 ).getResources ( ); // invoke-virtual {p1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;
(( android.content.res.Resources ) v0 ).getDisplayMetrics ( ); // invoke-virtual {v0}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;
v0 = this.y;
v0 = this.v;
v0 = this.o;
(( com.flurry.android.z ) v0 ).a ( p1, p0, p2 ); // invoke-virtual {v0, p1, p0, p2}, Lcom/flurry/android/z;->a(Landroid/content/Context;Lcom/flurry/android/u;Lcom/flurry/android/a;)V
v0 = this.s;
(( android.content.Context ) p1 ).getPackageManager ( ); // invoke-virtual {p1}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;
(( android.content.Context ) p1 ).getPackageName ( ); // invoke-virtual {p1}, Landroid/content/Context;->getPackageName()Ljava/lang/String;
/* new-instance v2, Ljava/lang/StringBuilder; */
/* invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V */
v3 = com.flurry.android.u.d;
(( java.lang.StringBuilder ) v2 ).append ( v3 ); // invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v2 ).append ( v1 ); // invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v1 ).toString ( ); // invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
/* new-instance v2, Landroid/content/Intent; */
final String v3 = "android.intent.action.VIEW"; // const-string v3, "android.intent.action.VIEW"
/* invoke-direct {v2, v3}, Landroid/content/Intent;-><init>(Ljava/lang/String;)V */
android.net.Uri .parse ( v1 );
(( android.content.Intent ) v2 ).setData ( v1 ); // invoke-virtual {v2, v1}, Landroid/content/Intent;->setData(Landroid/net/Uri;)Landroid/content/Intent;
/* const/high16 v1, 0x10000 */
v0 = (( android.content.pm.PackageManager ) v0 ).queryIntentActivities ( v2, v1 ); // invoke-virtual {v0, v2, v1}, Landroid/content/pm/PackageManager;->queryIntentActivities(Landroid/content/Intent;I)Ljava/util/List;
/* if-lez v0, :cond_1 */
/* move v0, v4 */
} // :goto_0
/* iput-boolean v0, p0, Lcom/flurry/android/u;->p:Z */
int v0 = 1; // const/4 v0, 0x1
/* iput-boolean v0, p0, Lcom/flurry/android/u;->q:Z */
/* :try_end_0 */
/* .catchall {:try_start_0 ..:try_end_0} :catchall_0 */
} // :cond_0
/* monitor-exit p0 */
return;
} // :cond_1
int v0 = 0; // const/4 v0, 0x0
/* :catchall_0 */
/* move-exception v0 */
/* monitor-exit p0 */
/* throw v0 */
} // .end method
synchronized final void a ( android.content.Context p0, Object p1, java.lang.String p2 ) {
/* .locals 2 */
/* monitor-enter p0 */
try { // :try_start_0
/* invoke-direct {p0}, Lcom/flurry/android/u;->l()Z */
/* :try_end_0 */
v0 = /* .catchall {:try_start_0 ..:try_end_0} :catchall_0 */
/* if-nez v0, :cond_0 */
} // :goto_0
/* monitor-exit p0 */
return;
} // :cond_0
try { // :try_start_1
v0 = this.t;
/* new-instance v1, Lcom/flurry/android/ak; */
/* invoke-direct {v1, p0, p3, p1, p2}, Lcom/flurry/android/ak;-><init>(Lcom/flurry/android/u;Ljava/lang/String;Landroid/content/Context;Lcom/flurry/android/p;)V */
(( android.os.Handler ) v0 ).post ( v1 ); // invoke-virtual {v0, v1}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z
/* :try_end_1 */
/* .catchall {:try_start_1 ..:try_end_1} :catchall_0 */
/* :catchall_0 */
/* move-exception v0 */
/* monitor-exit p0 */
/* throw v0 */
} // .end method
final void a ( java.lang.String p0 ) {
/* .locals 0 */
this.r = p1;
return;
} // .end method
synchronized final void a ( java.util.Map p0, java.util.Map p1, java.util.Map p2, java.util.Map p3, java.util.Map p4, java.util.Map p5 ) {
/* .locals 7 */
/* monitor-enter p0 */
try { // :try_start_0
/* invoke-direct {p0}, Lcom/flurry/android/u;->l()Z */
/* :try_end_0 */
v0 = /* .catchall {:try_start_0 ..:try_end_0} :catchall_0 */
/* if-nez v0, :cond_0 */
} // :goto_0
/* monitor-exit p0 */
return;
} // :cond_0
try { // :try_start_1
v0 = this.o;
/* move-object v1, p1 */
/* move-object v2, p2 */
/* move-object v3, p3 */
/* move-object v4, p4 */
/* move-object v5, p5 */
/* move-object v6, p6 */
/* invoke-virtual/range {v0 ..v6}, Lcom/flurry/android/z;->a(Ljava/util/Map;Ljava/util/Map;Ljava/util/Map;Ljava/util/Map;Ljava/util/Map;Ljava/util/Map;)V */
final String v0 = "FlurryAgent"; // const-string v0, "FlurryAgent"
v1 = this.o;
(( com.flurry.android.z ) v1 ).toString ( ); // invoke-virtual {v1}, Lcom/flurry/android/z;->toString()Ljava/lang/String;
android.util.Log .i ( v0,v1 );
/* :try_end_1 */
/* .catchall {:try_start_1 ..:try_end_1} :catchall_0 */
/* :catchall_0 */
/* move-exception v0 */
/* monitor-exit p0 */
/* throw v0 */
} // .end method
final Boolean a ( ) {
/* .locals 1 */
/* iget-boolean v0, p0, Lcom/flurry/android/u;->q:Z */
} // .end method
synchronized final com.flurry.android.p b ( Long p0 ) {
/* .locals 2 */
/* monitor-enter p0 */
try { // :try_start_0
v0 = this.v;
java.lang.Long .valueOf ( p1,p2 );
/* check-cast v0, Lcom/flurry/android/p; */
/* :try_end_0 */
/* .catchall {:try_start_0 ..:try_end_0} :catchall_0 */
/* monitor-exit p0 */
/* :catchall_0 */
/* move-exception v0 */
/* monitor-exit p0 */
/* throw v0 */
} // .end method
synchronized final com.flurry.android.p b ( Object p0 ) {
/* .locals 5 */
/* monitor-enter p0 */
try { // :try_start_0
v0 = v0 = this.x;
/* if-nez v0, :cond_0 */
/* new-instance v0, Lcom/flurry/android/p; */
(( com.flurry.android.u ) p0 ).i ( ); // invoke-virtual {p0}, Lcom/flurry/android/u;->i()J
/* move-result-wide v1 */
/* invoke-direct {v0, p1, v1, v2}, Lcom/flurry/android/p;-><init>(Lcom/flurry/android/p;J)V */
v1 = this.x;
} // :goto_0
/* new-instance v1, Lcom/flurry/android/f; */
int v2 = 4; // const/4 v2, 0x4
(( com.flurry.android.u ) p0 ).i ( ); // invoke-virtual {p0}, Lcom/flurry/android/u;->i()J
/* move-result-wide v3 */
/* invoke-direct {v1, v2, v3, v4}, Lcom/flurry/android/f;-><init>(BJ)V */
(( com.flurry.android.p ) v0 ).a ( v1 ); // invoke-virtual {v0, v1}, Lcom/flurry/android/p;->a(Lcom/flurry/android/f;)V
/* :try_end_0 */
/* .catchall {:try_start_0 ..:try_end_0} :catchall_0 */
/* monitor-exit p0 */
/* :catchall_0 */
/* move-exception v0 */
/* monitor-exit p0 */
/* throw v0 */
} // :cond_0
/* move-object v0, p1 */
} // .end method
synchronized final void b ( ) {
/* .locals 1 */
/* monitor-enter p0 */
try { // :try_start_0
/* invoke-direct {p0}, Lcom/flurry/android/u;->l()Z */
/* :try_end_0 */
v0 = /* .catchall {:try_start_0 ..:try_end_0} :catchall_0 */
/* if-nez v0, :cond_0 */
} // :goto_0
/* monitor-exit p0 */
return;
} // :cond_0
try { // :try_start_1
v0 = this.o;
(( com.flurry.android.z ) v0 ).e ( ); // invoke-virtual {v0}, Lcom/flurry/android/z;->e()V
/* :try_end_1 */
/* .catchall {:try_start_1 ..:try_end_1} :catchall_0 */
/* :catchall_0 */
/* move-exception v0 */
/* monitor-exit p0 */
/* throw v0 */
} // .end method
synchronized final void c ( ) {
/* .locals 1 */
/* monitor-enter p0 */
try { // :try_start_0
/* invoke-direct {p0}, Lcom/flurry/android/u;->l()Z */
/* :try_end_0 */
v0 = /* .catchall {:try_start_0 ..:try_end_0} :catchall_0 */
/* if-nez v0, :cond_0 */
} // :goto_0
/* monitor-exit p0 */
return;
} // :cond_0
try { // :try_start_1
v0 = this.o;
(( com.flurry.android.z ) v0 ).f ( ); // invoke-virtual {v0}, Lcom/flurry/android/z;->f()V
/* :try_end_1 */
/* .catchall {:try_start_1 ..:try_end_1} :catchall_0 */
/* :catchall_0 */
/* move-exception v0 */
/* monitor-exit p0 */
/* throw v0 */
} // .end method
synchronized final Long d ( ) {
/* .locals 2 */
/* monitor-enter p0 */
try { // :try_start_0
/* invoke-direct {p0}, Lcom/flurry/android/u;->l()Z */
/* :try_end_0 */
v0 = /* .catchall {:try_start_0 ..:try_end_0} :catchall_0 */
/* if-nez v0, :cond_0 */
/* const-wide/16 v0, 0x0 */
} // :goto_0
/* monitor-exit p0 */
/* return-wide v0 */
} // :cond_0
try { // :try_start_1
v0 = this.o;
(( com.flurry.android.z ) v0 ).d ( ); // invoke-virtual {v0}, Lcom/flurry/android/z;->d()J
/* :try_end_1 */
/* .catchall {:try_start_1 ..:try_end_1} :catchall_0 */
/* move-result-wide v0 */
/* :catchall_0 */
/* move-exception v0 */
/* monitor-exit p0 */
/* throw v0 */
} // .end method
synchronized final java.util.Set e ( ) {
/* .locals 1 */
/* monitor-enter p0 */
try { // :try_start_0
v0 = /* invoke-direct {p0}, Lcom/flurry/android/u;->l()Z */
/* if-nez v0, :cond_0 */
java.util.Collections .emptySet ( );
/* :try_end_0 */
/* .catchall {:try_start_0 ..:try_end_0} :catchall_0 */
} // :goto_0
/* monitor-exit p0 */
} // :cond_0
try { // :try_start_1
v0 = this.o;
(( com.flurry.android.z ) v0 ).a ( ); // invoke-virtual {v0}, Lcom/flurry/android/z;->a()Ljava/util/Set;
/* :try_end_1 */
/* .catchall {:try_start_1 ..:try_end_1} :catchall_0 */
/* :catchall_0 */
/* move-exception v0 */
/* monitor-exit p0 */
/* throw v0 */
} // .end method
synchronized final java.util.List f ( ) {
/* .locals 1 */
/* monitor-enter p0 */
try { // :try_start_0
v0 = this.x;
/* :try_end_0 */
/* .catchall {:try_start_0 ..:try_end_0} :catchall_0 */
/* monitor-exit p0 */
/* :catchall_0 */
/* move-exception v0 */
/* monitor-exit p0 */
/* throw v0 */
} // .end method
synchronized final void g ( ) {
/* .locals 1 */
/* monitor-enter p0 */
try { // :try_start_0
v0 = this.v;
/* :try_end_0 */
/* .catchall {:try_start_0 ..:try_end_0} :catchall_0 */
/* monitor-exit p0 */
return;
/* :catchall_0 */
/* move-exception v0 */
/* monitor-exit p0 */
/* throw v0 */
} // .end method
final java.lang.String h ( ) {
/* .locals 1 */
v0 = this.h;
} // .end method
synchronized final Long i ( ) {
/* .locals 4 */
/* monitor-enter p0 */
try { // :try_start_0
android.os.SystemClock .elapsedRealtime ( );
/* move-result-wide v0 */
/* iget-wide v2, p0, Lcom/flurry/android/u;->m:J */
/* sub-long/2addr v0, v2 */
/* iget-wide v2, p0, Lcom/flurry/android/u;->n:J */
/* cmp-long v2, v0, v2 */
/* if-lez v2, :cond_0 */
} // :goto_0
/* iput-wide v0, p0, Lcom/flurry/android/u;->n:J */
/* iget-wide v0, p0, Lcom/flurry/android/u;->n:J */
/* :try_end_0 */
/* .catchall {:try_start_0 ..:try_end_0} :catchall_0 */
/* monitor-exit p0 */
/* return-wide v0 */
} // :cond_0
try { // :try_start_1
/* iget-wide v0, p0, Lcom/flurry/android/u;->n:J */
/* const-wide/16 v2, 0x1 */
/* add-long/2addr v0, v2 */
/* iput-wide v0, p0, Lcom/flurry/android/u;->n:J */
/* :try_end_1 */
/* .catchall {:try_start_1 ..:try_end_1} :catchall_0 */
/* :catchall_0 */
/* move-exception v0 */
/* monitor-exit p0 */
/* throw v0 */
} // .end method
synchronized final com.flurry.android.AdImage j ( ) {
/* .locals 1 */
/* monitor-enter p0 */
try { // :try_start_0
/* invoke-direct {p0}, Lcom/flurry/android/u;->l()Z */
/* :try_end_0 */
v0 = /* .catchall {:try_start_0 ..:try_end_0} :catchall_0 */
/* if-nez v0, :cond_0 */
int v0 = 0; // const/4 v0, 0x0
} // :goto_0
/* monitor-exit p0 */
} // :cond_0
try { // :try_start_1
/* invoke-direct {p0}, Lcom/flurry/android/u;->k()Lcom/flurry/android/AdImage; */
/* :try_end_1 */
/* .catchall {:try_start_1 ..:try_end_1} :catchall_0 */
/* :catchall_0 */
/* move-exception v0 */
/* monitor-exit p0 */
/* throw v0 */
} // .end method
public synchronized final void onClick ( android.view.View p0 ) {
/* .locals 7 */
/* monitor-enter p0 */
try { // :try_start_0
/* move-object v0, p1 */
/* check-cast v0, Lcom/flurry/android/y; */
/* move-object v1, v0 */
(( com.flurry.android.y ) v1 ).a ( ); // invoke-virtual {v1}, Lcom/flurry/android/y;->a()Lcom/flurry/android/p;
(( com.flurry.android.u ) p0 ).b ( v2 ); // invoke-virtual {p0, v2}, Lcom/flurry/android/u;->b(Lcom/flurry/android/p;)Lcom/flurry/android/p;
(( com.flurry.android.y ) v1 ).a ( v2 ); // invoke-virtual {v1, v2}, Lcom/flurry/android/y;->a(Lcom/flurry/android/p;)V
(( com.flurry.android.u ) p0 ).a ( v2 ); // invoke-virtual {p0, v2}, Lcom/flurry/android/u;->a(Lcom/flurry/android/p;)Ljava/lang/String;
/* iget-boolean v3, p0, Lcom/flurry/android/u;->u:Z */
if ( v3 != null) { // if-eqz v3, :cond_2
(( android.view.View ) p1 ).getContext ( ); // invoke-virtual {p1}, Landroid/view/View;->getContext()Landroid/content/Context;
/* new-instance v4, Ljava/lang/StringBuilder; */
/* invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V */
v5 = this.h;
(( java.lang.StringBuilder ) v4 ).append ( v5 ); // invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v4 ).append ( v1 ); // invoke-virtual {v4, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v1 ).toString ( ); // invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
/* new-instance v4, Landroid/content/Intent; */
v5 = com.flurry.android.FlurryAgent.a;
if ( v5 != null) { // if-eqz v5, :cond_1
v5 = com.flurry.android.FlurryAgent.a;
} // :goto_0
/* invoke-direct {v4, v5}, Landroid/content/Intent;-><init>(Ljava/lang/String;)V */
final String v5 = "android.intent.category.DEFAULT"; // const-string v5, "android.intent.category.DEFAULT"v1 = "FlurryAgent"; // const-string v1, "FlurryAgent"
final String v2 = "Processing report response"; // const-string v2, "Processing report response"
com.flurry.android.ah .a ( v1,v2 );
if ( v0 != null) { // if-eqz v0, :cond_1
/* :try_end_0 */
/* .catchall {:try_start_0 ..:try_end_0} :catchall_0 */
/* move-result-wide v1 */
/* const-wide/16 v3, 0x0 */
/* cmp-long v1, v1, v3 */
if ( v1 != null) { // if-eqz v1, :cond_1
try { // :try_start_1
/* new-instance v2, Ljava/io/DataInputStream; */
/* invoke-direct {v2, v1}, Ljava/io/DataInputStream;-><init>(Ljava/io/InputStream;)V */
/* invoke-direct {p0, v2}, Lcom/flurry/android/FlurryAgent;->a(Ljava/io/DataInputStream;)V */
/* :try_end_1 */
/* .catchall {:try_start_1 ..:try_end_1} :catchall_1 */
try { // :try_start_2
/* move v0, v5 */
} // :goto_1
int v1 = 0; // const/4 v1, 0x0
this.D = v1;
/* monitor-exit p0 */
/* goto/16 :goto_0 */
/* :catchall_0 */
/* move-exception v0 */
/* monitor-exit p0 */
/* :try_end_2 */
/* .catchall {:try_start_2 ..:try_end_2} :catchall_0 */
/* throw v0 */
/* :catchall_1 */
/* move-exception v1 */
try { // :try_start_3
/* throw v1 */
} // :cond_1
/* move v0, v5 */
} // :cond_2
final String v0 = "FlurryAgent"; // const-string v0, "FlurryAgent"
/* new-instance v2, Ljava/lang/StringBuilder; */
/* invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V */
final String v3 = "Report failed.HTTP response: "; // const-string v3, "Report failed.HTTP response: "
(( java.lang.StringBuilder ) v2 ).append ( v3 ); // invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v2 ).append ( v1 ); // invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v1 ).toString ( ); // invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
com.flurry.android.ah .a ( v0,v1 );
/* :try_end_3 */
/* .catchall {:try_start_3 ..:try_end_3} :catchall_0 */
/* move v0, v4 */
} // .end method
private synchronized a ( Boolean p0 ) {
/* .locals 8 */
int v7 = 0; // const/4 v7, 0x0
int v6 = 0; // const/4 v6, 0x0
/* monitor-enter p0 */
try { // :try_start_0
/* new-instance v1, Ljava/io/ByteArrayOutputStream; */
/* invoke-direct {v1}, Ljava/io/ByteArrayOutputStream;-><init>()V */
/* new-instance v2, Ljava/io/DataOutputStream; */
/* invoke-direct {v2, v1}, Ljava/io/DataOutputStream;-><init>(Ljava/io/OutputStream;)V */
/* :try_end_0 */
/* .catch Ljava/lang/Throwable; {:try_start_0 ..:try_end_0} :catch_1 */
/* .catchall {:try_start_0 ..:try_end_0} :catchall_2 */
/* const/16 v0, 0xf */
try { // :try_start_1
(( java.io.DataOutputStream ) v2 ).writeShort ( v0 ); // invoke-virtual {v2, v0}, Ljava/io/DataOutputStream;->writeShort(I)V
/* sget-boolean v0, Lcom/flurry/android/FlurryAgent;->q:Z */
if ( v0 != null) { // if-eqz v0, :cond_0
if ( p1 != null) { // if-eqz p1, :cond_0
int v0 = 1; // const/4 v0, 0x1
(( java.io.DataOutputStream ) v2 ).writeShort ( v0 ); // invoke-virtual {v2, v0}, Ljava/io/DataOutputStream;->writeShort(I)V
} // :goto_0
/* sget-boolean v0, Lcom/flurry/android/FlurryAgent;->q:Z */
if ( v0 != null) { // if-eqz v0, :cond_1
v0 = this.aa;
(( com.flurry.android.u ) v0 ).d ( ); // invoke-virtual {v0}, Lcom/flurry/android/u;->d()J
/* move-result-wide v3 */
(( java.io.DataOutputStream ) v2 ).writeLong ( v3, v4 ); // invoke-virtual {v2, v3, v4}, Ljava/io/DataOutputStream;->writeLong(J)V
v0 = this.aa;
v3 = (( com.flurry.android.u ) v0 ).e ( ); // invoke-virtual {v0}, Lcom/flurry/android/u;->e()Ljava/util/Set;
(( java.io.DataOutputStream ) v2 ).writeShort ( v3 ); // invoke-virtual {v2, v3}, Ljava/io/DataOutputStream;->writeShort(I)V
v0 = } // :goto_1
if ( v0 != null) { // if-eqz v0, :cond_2
/* check-cast v0, Ljava/lang/Long; */
(( java.lang.Long ) v0 ).longValue ( ); // invoke-virtual {v0}, Ljava/lang/Long;->longValue()J
/* move-result-wide v4 */
int v0 = 1; // const/4 v0, 0x1
(( java.io.DataOutputStream ) v2 ).writeByte ( v0 ); // invoke-virtual {v2, v0}, Ljava/io/DataOutputStream;->writeByte(I)V
(( java.io.DataOutputStream ) v2 ).writeLong ( v4, v5 ); // invoke-virtual {v2, v4, v5}, Ljava/io/DataOutputStream;->writeLong(J)V
/* :try_end_1 */
/* .catch Ljava/lang/Throwable; {:try_start_1 ..:try_end_1} :catch_0 */
/* .catchall {:try_start_1 ..:try_end_1} :catchall_0 */
/* :catch_0 */
/* move-exception v0 */
/* move-object v1, v2 */
} // :goto_2
try { // :try_start_2
final String v2 = "FlurryAgent"; // const-string v2, "FlurryAgent"
final String v3 = "Error when generating report"; // const-string v3, "Error when generating report"
com.flurry.android.ah .b ( v2,v3,v0 );
/* :try_end_2 */
/* .catchall {:try_start_2 ..:try_end_2} :catchall_3 */
try { // :try_start_3
com.flurry.android.r .a ( v1 );
/* :try_end_3 */
/* .catchall {:try_start_3 ..:try_end_3} :catchall_1 */
/* move-object v0, v7 */
} // :goto_3
/* monitor-exit p0 */
} // :cond_0
int v0 = 0; // const/4 v0, 0x0
try { // :try_start_4
(( java.io.DataOutputStream ) v2 ).writeShort ( v0 ); // invoke-virtual {v2, v0}, Ljava/io/DataOutputStream;->writeShort(I)V
/* :try_end_4 */
/* .catch Ljava/lang/Throwable; {:try_start_4 ..:try_end_4} :catch_0 */
/* .catchall {:try_start_4 ..:try_end_4} :catchall_0 */
/* :catchall_0 */
/* move-exception v0 */
/* move-object v1, v2 */
} // :goto_4
try { // :try_start_5
com.flurry.android.r .a ( v1 );
/* throw v0 */
/* :try_end_5 */
/* .catchall {:try_start_5 ..:try_end_5} :catchall_1 */
/* :catchall_1 */
/* move-exception v0 */
/* monitor-exit p0 */
/* throw v0 */
} // :cond_1
/* const-wide/16 v3, 0x0 */
try { // :try_start_6
(( java.io.DataOutputStream ) v2 ).writeLong ( v3, v4 ); // invoke-virtual {v2, v3, v4}, Ljava/io/DataOutputStream;->writeLong(J)V
int v0 = 0; // const/4 v0, 0x0
(( java.io.DataOutputStream ) v2 ).writeShort ( v0 ); // invoke-virtual {v2, v0}, Ljava/io/DataOutputStream;->writeShort(I)V
} // :cond_2
int v0 = 3; // const/4 v0, 0x3
(( java.io.DataOutputStream ) v2 ).writeShort ( v0 ); // invoke-virtual {v2, v0}, Ljava/io/DataOutputStream;->writeShort(I)V
/* const/16 v0, 0x79 */
(( java.io.DataOutputStream ) v2 ).writeShort ( v0 ); // invoke-virtual {v2, v0}, Ljava/io/DataOutputStream;->writeShort(I)V
java.lang.System .currentTimeMillis ( );
/* move-result-wide v3 */
(( java.io.DataOutputStream ) v2 ).writeLong ( v3, v4 ); // invoke-virtual {v2, v3, v4}, Ljava/io/DataOutputStream;->writeLong(J)V
v0 = this.z;
(( java.io.DataOutputStream ) v2 ).writeUTF ( v0 ); // invoke-virtual {v2, v0}, Ljava/io/DataOutputStream;->writeUTF(Ljava/lang/String;)V
v0 = this.B;
(( java.io.DataOutputStream ) v2 ).writeUTF ( v0 ); // invoke-virtual {v2, v0}, Ljava/io/DataOutputStream;->writeUTF(Ljava/lang/String;)V
int v0 = 0; // const/4 v0, 0x0
(( java.io.DataOutputStream ) v2 ).writeShort ( v0 ); // invoke-virtual {v2, v0}, Ljava/io/DataOutputStream;->writeShort(I)V
v0 = this.F;
(( java.io.DataOutputStream ) v2 ).writeUTF ( v0 ); // invoke-virtual {v2, v0}, Ljava/io/DataOutputStream;->writeUTF(Ljava/lang/String;)V
/* iget-wide v3, p0, Lcom/flurry/android/FlurryAgent;->H:J */
(( java.io.DataOutputStream ) v2 ).writeLong ( v3, v4 ); // invoke-virtual {v2, v3, v4}, Ljava/io/DataOutputStream;->writeLong(J)V
/* iget-wide v3, p0, Lcom/flurry/android/FlurryAgent;->J:J */
(( java.io.DataOutputStream ) v2 ).writeLong ( v3, v4 ); // invoke-virtual {v2, v3, v4}, Ljava/io/DataOutputStream;->writeLong(J)V
int v0 = 6; // const/4 v0, 0x6
(( java.io.DataOutputStream ) v2 ).writeShort ( v0 ); // invoke-virtual {v2, v0}, Ljava/io/DataOutputStream;->writeShort(I)V
final String v0 = "device.model"; // const-string v0, "device.model"
(( java.io.DataOutputStream ) v2 ).writeUTF ( v0 ); // invoke-virtual {v2, v0}, Ljava/io/DataOutputStream;->writeUTF(Ljava/lang/String;)V
v0 = android.os.Build.MODEL;
(( java.io.DataOutputStream ) v2 ).writeUTF ( v0 ); // invoke-virtual {v2, v0}, Ljava/io/DataOutputStream;->writeUTF(Ljava/lang/String;)V
final String v0 = "build.brand"; // const-string v0, "build.brand"
(( java.io.DataOutputStream ) v2 ).writeUTF ( v0 ); // invoke-virtual {v2, v0}, Ljava/io/DataOutputStream;->writeUTF(Ljava/lang/String;)V
v0 = android.os.Build.BRAND;
(( java.io.DataOutputStream ) v2 ).writeUTF ( v0 ); // invoke-virtual {v2, v0}, Ljava/io/DataOutputStream;->writeUTF(Ljava/lang/String;)V
final String v0 = "build.id"; // const-string v0, "build.id"
(( java.io.DataOutputStream ) v2 ).writeUTF ( v0 ); // invoke-virtual {v2, v0}, Ljava/io/DataOutputStream;->writeUTF(Ljava/lang/String;)V
v0 = android.os.Build.ID;
(( java.io.DataOutputStream ) v2 ).writeUTF ( v0 ); // invoke-virtual {v2, v0}, Ljava/io/DataOutputStream;->writeUTF(Ljava/lang/String;)V
final String v0 = "version.release"; // const-string v0, "version.release"
(( java.io.DataOutputStream ) v2 ).writeUTF ( v0 ); // invoke-virtual {v2, v0}, Ljava/io/DataOutputStream;->writeUTF(Ljava/lang/String;)V
v0 = android.os.Build$VERSION.RELEASE;
(( java.io.DataOutputStream ) v2 ).writeUTF ( v0 ); // invoke-virtual {v2, v0}, Ljava/io/DataOutputStream;->writeUTF(Ljava/lang/String;)V
final String v0 = "build.device"; // const-string v0, "build.device"
(( java.io.DataOutputStream ) v2 ).writeUTF ( v0 ); // invoke-virtual {v2, v0}, Ljava/io/DataOutputStream;->writeUTF(Ljava/lang/String;)V
v0 = android.os.Build.DEVICE;
(( java.io.DataOutputStream ) v2 ).writeUTF ( v0 ); // invoke-virtual {v2, v0}, Ljava/io/DataOutputStream;->writeUTF(Ljava/lang/String;)V
final String v0 = "build.product"; // const-string v0, "build.product"
(( java.io.DataOutputStream ) v2 ).writeUTF ( v0 ); // invoke-virtual {v2, v0}, Ljava/io/DataOutputStream;->writeUTF(Ljava/lang/String;)V
v0 = android.os.Build.PRODUCT;
(( java.io.DataOutputStream ) v2 ).writeUTF ( v0 ); // invoke-virtual {v2, v0}, Ljava/io/DataOutputStream;->writeUTF(Ljava/lang/String;)V
v3 = v0 = this.I;
(( java.io.DataOutputStream ) v2 ).writeShort ( v3 ); // invoke-virtual {v2, v3}, Ljava/io/DataOutputStream;->writeShort(I)V
/* move v4, v6 */
} // :goto_5
/* if-ge v4, v3, :cond_3 */
v0 = this.I;
/* check-cast v0, [B */
(( java.io.DataOutputStream ) v2 ).write ( v0 ); // invoke-virtual {v2, v0}, Ljava/io/DataOutputStream;->write([B)V
/* add-int/lit8 v0, v4, 0x1 */
/* move v4, v0 */
} // :cond_3
/* new-instance v0, Ljava/util/ArrayList; */
v3 = this.I;
/* invoke-direct {v0, v3}, Ljava/util/ArrayList;-><init>(Ljava/util/Collection;)V */
this.D = v0;
(( java.io.DataOutputStream ) v2 ).close ( ); // invoke-virtual {v2}, Ljava/io/DataOutputStream;->close()V
(( java.io.ByteArrayOutputStream ) v1 ).toByteArray ( ); // invoke-virtual {v1}, Ljava/io/ByteArrayOutputStream;->toByteArray()[B
/* :try_end_6 */
/* .catch Ljava/lang/Throwable; {:try_start_6 ..:try_end_6} :catch_0 */
/* .catchall {:try_start_6 ..:try_end_6} :catchall_0 */
try { // :try_start_7
com.flurry.android.r .a ( v2 );
/* :try_end_7 */
/* .catchall {:try_start_7 ..:try_end_7} :catchall_1 */
/* goto/16 :goto_3 */
/* :catchall_2 */
/* move-exception v0 */
/* move-object v1, v7 */
/* goto/16 :goto_4 */
/* :catchall_3 */
/* move-exception v0 */
/* goto/16 :goto_4 */
/* :catch_1 */
/* move-exception v0 */
/* move-object v1, v7 */
/* goto/16 :goto_2 */
} // .end method
static com.flurry.android.u b ( ) {
/* .locals 1 */
v0 = com.flurry.android.FlurryAgent.j;
v0 = this.aa;
} // .end method
private synchronized void b ( android.content.Context p0 ) {
/* .locals 9 */
final String v0 = "FlurryAgent"; // const-string v0, "FlurryAgent"
/* monitor-enter p0 */
try { // :try_start_0
/* invoke-direct {p0, p1}, Lcom/flurry/android/FlurryAgent;->c(Landroid/content/Context;)Ljava/lang/String; */
this.F = v0;
v0 = this.u;
v0 = (( java.io.File ) v0 ).exists ( ); // invoke-virtual {v0}, Ljava/io/File;->exists()Z
if ( v0 != null) { // if-eqz v0, :cond_6
final String v0 = "FlurryAgent"; // const-string v0, "FlurryAgent"
/* new-instance v1, Ljava/lang/StringBuilder; */
/* invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V */
final String v2 = "loading persistent data: "; // const-string v2, "loading persistent data: "
(( java.lang.StringBuilder ) v1 ).append ( v2 ); // invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
v2 = this.u;
(( java.io.File ) v2 ).getAbsolutePath ( ); // invoke-virtual {v2}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;
(( java.lang.StringBuilder ) v1 ).append ( v2 ); // invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v1 ).toString ( ); // invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
com.flurry.android.ah .c ( v0,v1 );
/* :try_end_0 */
/* .catchall {:try_start_0 ..:try_end_0} :catchall_0 */
int v0 = 0; // const/4 v0, 0x0
try { // :try_start_1
/* new-instance v1, Ljava/io/FileInputStream; */
v2 = this.u;
/* invoke-direct {v1, v2}, Ljava/io/FileInputStream;-><init>(Ljava/io/File;)V */
/* new-instance v2, Ljava/io/DataInputStream; */
/* invoke-direct {v2, v1}, Ljava/io/DataInputStream;-><init>(Ljava/io/InputStream;)V */
/* :try_end_1 */
/* .catch Ljava/lang/Throwable; {:try_start_1 ..:try_end_1} :catch_2 */
/* .catchall {:try_start_1 ..:try_end_1} :catchall_1 */
try { // :try_start_2
v0 = (( java.io.DataInputStream ) v2 ).readUnsignedShort ( ); // invoke-virtual {v2}, Ljava/io/DataInputStream;->readUnsignedShort()I
/* const v1, 0xb5fa */
/* if-ne v0, v1, :cond_4 */
/* invoke-direct {p0, v2}, Lcom/flurry/android/FlurryAgent;->b(Ljava/io/DataInputStream;)V */
/* :try_end_2 */
/* .catch Ljava/lang/Throwable; {:try_start_2 ..:try_end_2} :catch_0 */
/* .catchall {:try_start_2 ..:try_end_2} :catchall_2 */
} // :goto_0
try { // :try_start_3
com.flurry.android.r .a ( v2 );
/* :try_end_3 */
/* .catchall {:try_start_3 ..:try_end_3} :catchall_0 */
} // :goto_1
try { // :try_start_4
/* iget-boolean v0, p0, Lcom/flurry/android/FlurryAgent;->w:Z */
/* if-nez v0, :cond_0 */
v0 = this.u;
v0 = (( java.io.File ) v0 ).delete ( ); // invoke-virtual {v0}, Ljava/io/File;->delete()Z
if ( v0 != null) { // if-eqz v0, :cond_5
final String v0 = "FlurryAgent"; // const-string v0, "FlurryAgent"
final String v1 = "Deleted persistence file"; // const-string v1, "Deleted persistence file"
com.flurry.android.ah .a ( v0,v1 );
/* :try_end_4 */
/* .catch Ljava/lang/Throwable; {:try_start_4 ..:try_end_4} :catch_1 */
/* .catchall {:try_start_4 ..:try_end_4} :catchall_0 */
} // :cond_0
} // :goto_2
try { // :try_start_5
/* iget-boolean v0, p0, Lcom/flurry/android/FlurryAgent;->w:Z */
/* if-nez v0, :cond_1 */
int v0 = 0; // const/4 v0, 0x0
/* iput-boolean v0, p0, Lcom/flurry/android/FlurryAgent;->G:Z */
/* iget-wide v0, p0, Lcom/flurry/android/FlurryAgent;->J:J */
/* iput-wide v0, p0, Lcom/flurry/android/FlurryAgent;->H:J */
int v0 = 1; // const/4 v0, 0x1
/* iput-boolean v0, p0, Lcom/flurry/android/FlurryAgent;->w:Z */
} // :cond_1
v0 = this.F;
/* if-nez v0, :cond_2 */
java.lang.Math .random ( );
/* move-result-wide v0 */
java.lang.Double .doubleToLongBits ( v0,v1 );
/* move-result-wide v0 */
/* const-wide/16 v2, 0x25 */
java.lang.System .nanoTime ( );
/* move-result-wide v4 */
v6 = this.z;
v6 = (( java.lang.String ) v6 ).hashCode ( ); // invoke-virtual {v6}, Ljava/lang/String;->hashCode()I
/* mul-int/lit8 v6, v6, 0x25 */
/* int-to-long v6, v6 */
/* add-long/2addr v4, v6 */
/* mul-long/2addr v2, v4 */
/* add-long/2addr v0, v2 */
/* new-instance v2, Ljava/lang/StringBuilder; */
/* invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V */
final String v3 = "ID"; // const-string v3, "ID"
(( java.lang.StringBuilder ) v2 ).append ( v3 ); // invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
/* const/16 v3, 0x10 */
java.lang.Long .toString ( v0,v1,v3 );
(( java.lang.StringBuilder ) v2 ).append ( v0 ); // invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v0 ).toString ( ); // invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
this.F = v0;
final String v0 = "FlurryAgent"; // const-string v0, "FlurryAgent"
final String v1 = "Generated id"; // const-string v1, "Generated id"
com.flurry.android.ah .c ( v0,v1 );
} // :cond_2
v0 = this.aa;
v1 = this.F;
(( com.flurry.android.u ) v0 ).a ( v1 ); // invoke-virtual {v0, v1}, Lcom/flurry/android/u;->a(Ljava/lang/String;)V
v0 = this.F;
final String v1 = "AND"; // const-string v1, "AND"
v0 = (( java.lang.String ) v0 ).startsWith ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z
/* if-nez v0, :cond_3 */
v0 = this.t;
v0 = (( java.io.File ) v0 ).exists ( ); // invoke-virtual {v0}, Ljava/io/File;->exists()Z
/* if-nez v0, :cond_3 */
v0 = this.F;
/* invoke-direct {p0, p1, v0}, Lcom/flurry/android/FlurryAgent;->c(Landroid/content/Context;Ljava/lang/String;)V */
/* :try_end_5 */
/* .catchall {:try_start_5 ..:try_end_5} :catchall_0 */
} // :cond_3
/* monitor-exit p0 */
return;
} // :cond_4
try { // :try_start_6
final String v0 = "FlurryAgent"; // const-string v0, "FlurryAgent"
final String v1 = "Unexpected file type"; // const-string v1, "Unexpected file type"
com.flurry.android.ah .a ( v0,v1 );
/* :try_end_6 */
/* .catch Ljava/lang/Throwable; {:try_start_6 ..:try_end_6} :catch_0 */
/* .catchall {:try_start_6 ..:try_end_6} :catchall_2 */
/* goto/16 :goto_0 */
/* :catch_0 */
/* move-exception v0 */
/* move-object v1, v2 */
} // :goto_3
try { // :try_start_7
final String v2 = "FlurryAgent"; // const-string v2, "FlurryAgent"
final String v3 = "Error when loading persistent file"; // const-string v3, "Error when loading persistent file"
com.flurry.android.ah .b ( v2,v3,v0 );
/* :try_end_7 */
/* .catchall {:try_start_7 ..:try_end_7} :catchall_3 */
try { // :try_start_8
com.flurry.android.r .a ( v1 );
/* :try_end_8 */
/* .catchall {:try_start_8 ..:try_end_8} :catchall_0 */
/* goto/16 :goto_1 */
/* :catchall_0 */
/* move-exception v0 */
/* monitor-exit p0 */
/* throw v0 */
/* :catchall_1 */
/* move-exception v1 */
/* move-object v8, v1 */
/* move-object v1, v0 */
/* move-object v0, v8 */
} // :goto_4
try { // :try_start_9
com.flurry.android.r .a ( v1 );
/* throw v0 */
/* :try_end_9 */
/* .catchall {:try_start_9 ..:try_end_9} :catchall_0 */
} // :cond_5
try { // :try_start_a
final String v0 = "FlurryAgent"; // const-string v0, "FlurryAgent"
final String v1 = "Cannot delete persistence file"; // const-string v1, "Cannot delete persistence file"
com.flurry.android.ah .b ( v0,v1 );
/* :try_end_a */
/* .catch Ljava/lang/Throwable; {:try_start_a ..:try_end_a} :catch_1 */
/* .catchall {:try_start_a ..:try_end_a} :catchall_0 */
/* goto/16 :goto_2 */
/* :catch_1 */
/* move-exception v0 */
try { // :try_start_b
final String v1 = "FlurryAgent"; // const-string v1, "FlurryAgent"
final String v2 = ""; // const-string v2, ""
com.flurry.android.ah .b ( v1,v2,v0 );
/* goto/16 :goto_2 */
} // :cond_6
final String v0 = "FlurryAgent"; // const-string v0, "FlurryAgent"
final String v1 = "Agent cache file doesn\'t exist."; // const-string v1, "Agent cache file doesn\'t exist."
com.flurry.android.ah .c ( v0,v1 );
/* :try_end_b */
/* .catchall {:try_start_b ..:try_end_b} :catchall_0 */
/* goto/16 :goto_2 */
/* :catchall_2 */
/* move-exception v0 */
/* move-object v1, v2 */
/* :catchall_3 */
/* move-exception v0 */
/* :catch_2 */
/* move-exception v1 */
/* move-object v8, v1 */
/* move-object v1, v0 */
/* move-object v0, v8 */
} // .end method
private synchronized void b ( android.content.Context p0, java.lang.String p1 ) {
/* .locals 8 */
int v7 = 1; // const/4 v7, 0x1
final String v0 = " and "; // const-string v0, " and "
final String v0 = "FlurryAgent"; // const-string v0, "FlurryAgent"
/* monitor-enter p0 */
try { // :try_start_0
v0 = this.z;
if ( v0 != null) { // if-eqz v0, :cond_0
v0 = this.z;
v0 = (( java.lang.String ) v0 ).equals ( p2 ); // invoke-virtual {v0, p2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
/* if-nez v0, :cond_0 */
final String v0 = "FlurryAgent"; // const-string v0, "FlurryAgent"
/* new-instance v1, Ljava/lang/StringBuilder; */
/* invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V */
final String v2 = "onStartSession called with different api keys: "; // const-string v2, "onStartSession called with different api keys: "
(( java.lang.StringBuilder ) v1 ).append ( v2 ); // invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
v2 = this.z;
(( java.lang.StringBuilder ) v1 ).append ( v2 ); // invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
final String v2 = " and "; // const-string v2, " and "
(( java.lang.StringBuilder ) v1 ).append ( v2 ); // invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v1 ).append ( p2 ); // invoke-virtual {v1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v1 ).toString ( ); // invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
com.flurry.android.ah .b ( v0,v1 );
} // :cond_0
v0 = this.y;
/* check-cast v0, Landroid/content/Context; */
if ( v0 != null) { // if-eqz v0, :cond_1
final String v0 = "FlurryAgent"; // const-string v0, "FlurryAgent"
final String v1 = "onStartSession called with duplicate context, use a specific Activity or Service as context instead of using a global context"; // const-string v1, "onStartSession called with duplicate context, use a specific Activity or Service as context instead of using a global context"
com.flurry.android.ah .d ( v0,v1 );
} // :cond_1
/* iget-boolean v0, p0, Lcom/flurry/android/FlurryAgent;->v:Z */
/* if-nez v0, :cond_8 */
final String v0 = "FlurryAgent"; // const-string v0, "FlurryAgent"
final String v1 = "Initializing Flurry session"; // const-string v1, "Initializing Flurry session"
com.flurry.android.ah .a ( v0,v1 );
this.z = p2;
/* new-instance v0, Ljava/lang/StringBuilder; */
/* invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V */
final String v1 = ".flurryagent."; // const-string v1, ".flurryagent."
(( java.lang.StringBuilder ) v0 ).append ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
v1 = this.z;
v1 = (( java.lang.String ) v1 ).hashCode ( ); // invoke-virtual {v1}, Ljava/lang/String;->hashCode()I
/* const/16 v2, 0x10 */
java.lang.Integer .toString ( v1,v2 );
(( java.lang.StringBuilder ) v0 ).append ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v0 ).toString ( ); // invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
(( android.content.Context ) p1 ).getFileStreamPath ( v0 ); // invoke-virtual {p1, v0}, Landroid/content/Context;->getFileStreamPath(Ljava/lang/String;)Ljava/io/File;
this.u = v0;
final String v0 = ".flurryb."; // const-string v0, ".flurryb."
(( android.content.Context ) p1 ).getFileStreamPath ( v0 ); // invoke-virtual {p1, v0}, Landroid/content/Context;->getFileStreamPath(Ljava/lang/String;)Ljava/io/File;
this.t = v0;
/* sget-boolean v0, Lcom/flurry/android/FlurryAgent;->o:Z */
if ( v0 != null) { // if-eqz v0, :cond_2
/* new-instance v0, Lcom/flurry/android/FlurryAgent$FlurryDefaultExceptionHandler; */
/* invoke-direct {v0}, Lcom/flurry/android/FlurryAgent$FlurryDefaultExceptionHandler;-><init>()V */
java.lang.Thread .setDefaultUncaughtExceptionHandler ( v0 );
} // :cond_2
(( android.content.Context ) p1 ).getApplicationContext ( ); // invoke-virtual {p1}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;
v1 = this.B;
/* if-nez v1, :cond_3 */
com.flurry.android.FlurryAgent .d ( v0 );
this.B = v1;
} // :cond_3
(( android.content.Context ) v0 ).getPackageName ( ); // invoke-virtual {v0}, Landroid/content/Context;->getPackageName()Ljava/lang/String;
v2 = this.A;
if ( v2 != null) { // if-eqz v2, :cond_4
v2 = this.A;
v2 = (( java.lang.String ) v2 ).equals ( v1 ); // invoke-virtual {v2, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
/* if-nez v2, :cond_4 */
final String v2 = "FlurryAgent"; // const-string v2, "FlurryAgent"
/* new-instance v3, Ljava/lang/StringBuilder; */
/* invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V */
final String v4 = "onStartSession called from different application packages: "; // const-string v4, "onStartSession called from different application packages: "
(( java.lang.StringBuilder ) v3 ).append ( v4 ); // invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
v4 = this.A;
(( java.lang.StringBuilder ) v3 ).append ( v4 ); // invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
final String v4 = " and "; // const-string v4, " and "
(( java.lang.StringBuilder ) v3 ).append ( v4 ); // invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v3 ).append ( v1 ); // invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v3 ).toString ( ); // invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
com.flurry.android.ah .b ( v2,v3 );
} // :cond_4
this.A = v1;
android.os.SystemClock .elapsedRealtime ( );
/* move-result-wide v1 */
/* iget-wide v3, p0, Lcom/flurry/android/FlurryAgent;->x:J */
/* sub-long v3, v1, v3 */
/* sget-wide v5, Lcom/flurry/android/FlurryAgent;->k:J */
/* cmp-long v3, v3, v5 */
/* if-lez v3, :cond_b */
final String v3 = "FlurryAgent"; // const-string v3, "FlurryAgent"
final String v4 = "New session"; // const-string v4, "New session"
com.flurry.android.ah .a ( v3,v4 );
java.lang.System .currentTimeMillis ( );
/* move-result-wide v3 */
/* iput-wide v3, p0, Lcom/flurry/android/FlurryAgent;->J:J */
/* iput-wide v1, p0, Lcom/flurry/android/FlurryAgent;->K:J */
/* const-wide/16 v1, -0x1 */
/* iput-wide v1, p0, Lcom/flurry/android/FlurryAgent;->L:J */
final String v1 = ""; // const-string v1, ""
this.P = v1;
int v1 = 0; // const/4 v1, 0x0
/* iput v1, p0, Lcom/flurry/android/FlurryAgent;->S:I */
int v1 = 0; // const/4 v1, 0x0
this.T = v1;
java.util.TimeZone .getDefault ( );
(( java.util.TimeZone ) v1 ).getID ( ); // invoke-virtual {v1}, Ljava/util/TimeZone;->getID()Ljava/lang/String;
this.N = v1;
/* new-instance v1, Ljava/lang/StringBuilder; */
/* invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V */
java.util.Locale .getDefault ( );
(( java.util.Locale ) v2 ).getLanguage ( ); // invoke-virtual {v2}, Ljava/util/Locale;->getLanguage()Ljava/lang/String;
(( java.lang.StringBuilder ) v1 ).append ( v2 ); // invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
final String v2 = "_"; // const-string v2, "_"
(( java.lang.StringBuilder ) v1 ).append ( v2 ); // invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
java.util.Locale .getDefault ( );
(( java.util.Locale ) v2 ).getCountry ( ); // invoke-virtual {v2}, Ljava/util/Locale;->getCountry()Ljava/lang/String;
(( java.lang.StringBuilder ) v1 ).append ( v2 ); // invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v1 ).toString ( ); // invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
this.M = v1;
/* new-instance v1, Ljava/util/HashMap; */
/* invoke-direct {v1}, Ljava/util/HashMap;-><init>()V */
this.U = v1;
/* new-instance v1, Ljava/util/ArrayList; */
/* invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V */
this.V = v1;
int v1 = 1; // const/4 v1, 0x1
/* iput-boolean v1, p0, Lcom/flurry/android/FlurryAgent;->W:Z */
/* new-instance v1, Ljava/util/ArrayList; */
/* invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V */
this.Y = v1;
int v1 = 0; // const/4 v1, 0x0
/* iput v1, p0, Lcom/flurry/android/FlurryAgent;->X:I */
int v1 = 0; // const/4 v1, 0x0
/* iput v1, p0, Lcom/flurry/android/FlurryAgent;->Z:I */
/* sget-boolean v1, Lcom/flurry/android/FlurryAgent;->q:Z */
if ( v1 != null) { // if-eqz v1, :cond_6
v1 = this.aa;
v1 = (( com.flurry.android.u ) v1 ).a ( ); // invoke-virtual {v1}, Lcom/flurry/android/u;->a()Z
/* if-nez v1, :cond_5 */
final String v1 = "FlurryAgent"; // const-string v1, "FlurryAgent"
final String v2 = "Initializing AppCircle"; // const-string v2, "Initializing AppCircle"
com.flurry.android.ah .a ( v1,v2 );
/* new-instance v1, Lcom/flurry/android/a; */
/* invoke-direct {v1}, Lcom/flurry/android/a;-><init>()V */
v2 = this.z;
this.a = v2;
/* iget-wide v2, p0, Lcom/flurry/android/FlurryAgent;->H:J */
/* iput-wide v2, v1, Lcom/flurry/android/a;->b:J */
v2 = com.flurry.android.FlurryAgent.f;
if ( v2 != null) { // if-eqz v2, :cond_9
v2 = com.flurry.android.FlurryAgent.f;
} // :goto_0
this.c = v2;
v2 = com.flurry.android.FlurryAgent.h;
if ( v2 != null) { // if-eqz v2, :cond_a
v2 = com.flurry.android.FlurryAgent.h;
} // :goto_1
this.d = v2;
v2 = this.s;
this.e = v2;
v2 = this.aa;
(( com.flurry.android.u ) v2 ).a ( p1, v1 ); // invoke-virtual {v2, p1, v1}, Lcom/flurry/android/u;->a(Landroid/content/Context;Lcom/flurry/android/a;)V
final String v1 = "FlurryAgent"; // const-string v1, "FlurryAgent"
final String v2 = "AppCircle initialized"; // const-string v2, "AppCircle initialized"
com.flurry.android.ah .a ( v1,v2 );
} // :cond_5
v1 = this.aa;
/* iget-wide v2, p0, Lcom/flurry/android/FlurryAgent;->J:J */
/* iget-wide v4, p0, Lcom/flurry/android/FlurryAgent;->K:J */
(( com.flurry.android.u ) v1 ).a ( v2, v3, v4, v5 ); // invoke-virtual {v1, v2, v3, v4, v5}, Lcom/flurry/android/u;->a(JJ)V
} // :cond_6
/* iget-boolean v1, p0, Lcom/flurry/android/FlurryAgent;->C:Z */
/* new-instance v2, Lcom/flurry/android/d; */
/* invoke-direct {v2, p0, v0, v1}, Lcom/flurry/android/d;-><init>(Lcom/flurry/android/FlurryAgent;Landroid/content/Context;Z)V */
/* invoke-direct {p0, v2}, Lcom/flurry/android/FlurryAgent;->a(Ljava/lang/Runnable;)V */
} // :cond_7
} // :goto_2
int v0 = 1; // const/4 v0, 0x1
/* iput-boolean v0, p0, Lcom/flurry/android/FlurryAgent;->v:Z */
/* :try_end_0 */
/* .catchall {:try_start_0 ..:try_end_0} :catchall_0 */
} // :cond_8
/* monitor-exit p0 */
return;
} // :cond_9
try { // :try_start_1
v2 = com.flurry.android.FlurryAgent.g;
} // :cond_a
v2 = com.flurry.android.FlurryAgent.i;
} // :cond_b
final String v0 = "FlurryAgent"; // const-string v0, "FlurryAgent"
final String v1 = "Continuing previous session"; // const-string v1, "Continuing previous session"
com.flurry.android.ah .a ( v0,v1 );
v0 = v0 = this.I;
/* if-nez v0, :cond_7 */
v0 = this.I;
v1 = v1 = this.I;
/* sub-int/2addr v1, v7 */
/* :try_end_1 */
/* .catchall {:try_start_1 ..:try_end_1} :catchall_0 */
/* :catchall_0 */
/* move-exception v0 */
/* monitor-exit p0 */
/* throw v0 */
} // .end method
static void b ( com.flurry.android.FlurryAgent p0 ) { //synthethic
/* .locals 0 */
/* invoke-direct {p0}, Lcom/flurry/android/FlurryAgent;->g()V */
return;
} // .end method
private synchronized void b ( java.io.DataInputStream p0 ) {
/* .locals 5 */
int v1 = 2; // const/4 v1, 0x2
int v4 = 0; // const/4 v4, 0x0
final String v0 = "Unknown agent file version: "; // const-string v0, "Unknown agent file version: "
final String v0 = "FlurryAgent"; // const-string v0, "FlurryAgent"
/* monitor-enter p0 */
try { // :try_start_0
v0 = (( java.io.DataInputStream ) p1 ).readUnsignedShort ( ); // invoke-virtual {p1}, Ljava/io/DataInputStream;->readUnsignedShort()I
/* if-le v0, v1, :cond_0 */
final String v1 = "FlurryAgent"; // const-string v1, "FlurryAgent"
/* new-instance v2, Ljava/lang/StringBuilder; */
/* invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V */
final String v3 = "Unknown agent file version: "; // const-string v3, "Unknown agent file version: "
(( java.lang.StringBuilder ) v2 ).append ( v3 ); // invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v2 ).append ( v0 ); // invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v2 ).toString ( ); // invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
com.flurry.android.ah .b ( v1,v2 );
/* new-instance v1, Ljava/io/IOException; */
/* new-instance v2, Ljava/lang/StringBuilder; */
/* invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V */
final String v3 = "Unknown agent file version: "; // const-string v3, "Unknown agent file version: "
(( java.lang.StringBuilder ) v2 ).append ( v3 ); // invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v2 ).append ( v0 ); // invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v0 ).toString ( ); // invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
/* invoke-direct {v1, v0}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V */
/* throw v1 */
/* :try_end_0 */
/* .catchall {:try_start_0 ..:try_end_0} :catchall_0 */
/* :catchall_0 */
/* move-exception v0 */
/* monitor-exit p0 */
/* throw v0 */
} // :cond_0
/* if-lt v0, v1, :cond_4 */
try { // :try_start_1
(( java.io.DataInputStream ) p1 ).readUTF ( ); // invoke-virtual {p1}, Ljava/io/DataInputStream;->readUTF()Ljava/lang/String;
final String v1 = "FlurryAgent"; // const-string v1, "FlurryAgent"
/* new-instance v2, Ljava/lang/StringBuilder; */
/* invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V */
final String v3 = "Loading API key: "; // const-string v3, "Loading API key: "
(( java.lang.StringBuilder ) v2 ).append ( v3 ); // invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
v3 = this.z;
com.flurry.android.FlurryAgent .f ( v3 );
(( java.lang.StringBuilder ) v2 ).append ( v3 ); // invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v2 ).toString ( ); // invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
com.flurry.android.ah .a ( v1,v2 );
v1 = this.z;
v1 = (( java.lang.String ) v0 ).equals ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
if ( v1 != null) { // if-eqz v1, :cond_3
(( java.io.DataInputStream ) p1 ).readUTF ( ); // invoke-virtual {p1}, Ljava/io/DataInputStream;->readUTF()Ljava/lang/String;
v1 = this.F;
/* if-nez v1, :cond_1 */
final String v1 = "FlurryAgent"; // const-string v1, "FlurryAgent"
/* new-instance v2, Ljava/lang/StringBuilder; */
/* invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V */
final String v3 = "Loading phoneId: "; // const-string v3, "Loading phoneId: "
(( java.lang.StringBuilder ) v2 ).append ( v3 ); // invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v2 ).append ( v0 ); // invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v2 ).toString ( ); // invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
com.flurry.android.ah .a ( v1,v2 );
} // :cond_1
this.F = v0;
v0 = (( java.io.DataInputStream ) p1 ).readBoolean ( ); // invoke-virtual {p1}, Ljava/io/DataInputStream;->readBoolean()Z
/* iput-boolean v0, p0, Lcom/flurry/android/FlurryAgent;->G:Z */
(( java.io.DataInputStream ) p1 ).readLong ( ); // invoke-virtual {p1}, Ljava/io/DataInputStream;->readLong()J
/* move-result-wide v0 */
/* iput-wide v0, p0, Lcom/flurry/android/FlurryAgent;->H:J */
final String v0 = "FlurryAgent"; // const-string v0, "FlurryAgent"
final String v1 = "Loading session reports"; // const-string v1, "Loading session reports"
com.flurry.android.ah .a ( v0,v1 );
/* move v0, v4 */
} // :goto_0
v1 = (( java.io.DataInputStream ) p1 ).readUnsignedShort ( ); // invoke-virtual {p1}, Ljava/io/DataInputStream;->readUnsignedShort()I
if ( v1 != null) { // if-eqz v1, :cond_2
/* new-array v1, v1, [B */
(( java.io.DataInputStream ) p1 ).readFully ( v1 ); // invoke-virtual {p1, v1}, Ljava/io/DataInputStream;->readFully([B)V
v2 = this.I;
int v3 = 0; // const/4 v3, 0x0
final String v1 = "FlurryAgent"; // const-string v1, "FlurryAgent"
/* new-instance v2, Ljava/lang/StringBuilder; */
/* invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V */
final String v3 = "Session report added: "; // const-string v3, "Session report added: "
(( java.lang.StringBuilder ) v2 ).append ( v3 ); // invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
/* add-int/lit8 v0, v0, 0x1 */
(( java.lang.StringBuilder ) v2 ).append ( v0 ); // invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v2 ).toString ( ); // invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
com.flurry.android.ah .a ( v1,v2 );
} // :cond_2
final String v0 = "FlurryAgent"; // const-string v0, "FlurryAgent"
final String v1 = "Persistent file loaded"; // const-string v1, "Persistent file loaded"
com.flurry.android.ah .a ( v0,v1 );
int v0 = 1; // const/4 v0, 0x1
/* iput-boolean v0, p0, Lcom/flurry/android/FlurryAgent;->w:Z */
/* :try_end_1 */
/* .catchall {:try_start_1 ..:try_end_1} :catchall_0 */
} // :goto_1
/* monitor-exit p0 */
return;
} // :cond_3
try { // :try_start_2
final String v1 = "FlurryAgent"; // const-string v1, "FlurryAgent"
/* new-instance v2, Ljava/lang/StringBuilder; */
/* invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V */
final String v3 = "Api keys do not match, old: "; // const-string v3, "Api keys do not match, old: "
(( java.lang.StringBuilder ) v2 ).append ( v3 ); // invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
com.flurry.android.FlurryAgent .f ( v0 );
(( java.lang.StringBuilder ) v2 ).append ( v0 ); // invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
final String v2 = ", new: "; // const-string v2, ", new: "
(( java.lang.StringBuilder ) v0 ).append ( v2 ); // invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
v2 = this.z;
com.flurry.android.FlurryAgent .f ( v2 );
(( java.lang.StringBuilder ) v0 ).append ( v2 ); // invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v0 ).toString ( ); // invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
com.flurry.android.ah .a ( v1,v0 );
} // :cond_4
final String v1 = "FlurryAgent"; // const-string v1, "FlurryAgent"
/* new-instance v2, Ljava/lang/StringBuilder; */
/* invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V */
final String v3 = "Deleting old file version: "; // const-string v3, "Deleting old file version: "
(( java.lang.StringBuilder ) v2 ).append ( v3 ); // invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v2 ).append ( v0 ); // invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v0 ).toString ( ); // invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
com.flurry.android.ah .d ( v1,v0 );
/* :try_end_2 */
/* .catchall {:try_start_2 ..:try_end_2} :catchall_0 */
} // .end method
public static void b ( java.lang.String p0 ) {
/* .locals 4 */
try { // :try_start_0
v0 = com.flurry.android.FlurryAgent.j;
int v1 = 1; // const/4 v1, 0x1
/* invoke-direct {v0, p0, v1}, Lcom/flurry/android/FlurryAgent;->a(Ljava/lang/String;Z)V */
/* :try_end_0 */
/* .catch Ljava/lang/Throwable; {:try_start_0 ..:try_end_0} :catch_0 */
} // :goto_0
return;
/* :catch_0 */
/* move-exception v0 */
final String v1 = "FlurryAgent"; // const-string v1, "FlurryAgent"
/* new-instance v2, Ljava/lang/StringBuilder; */
/* invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V */
final String v3 = "Failed to log event: "; // const-string v3, "Failed to log event: "
(( java.lang.StringBuilder ) v2 ).append ( v3 ); // invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v2 ).append ( p0 ); // invoke-virtual {v2, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v2 ).toString ( ); // invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
com.flurry.android.ah .b ( v1,v2,v0 );
} // .end method
private void b ( Boolean p0 ) {
/* .locals 5 */
final String v4 = ""; // const-string v4, ""
final String v3 = "FlurryAgent"; // const-string v3, "FlurryAgent"
try { // :try_start_0
final String v0 = "FlurryAgent"; // const-string v0, "FlurryAgent"
final String v1 = "generating report"; // const-string v1, "generating report"
com.flurry.android.ah .a ( v0,v1 );
/* invoke-direct {p0, p1}, Lcom/flurry/android/FlurryAgent;->a(Z)[B */
if ( v0 != null) { // if-eqz v0, :cond_2
v0 = /* invoke-direct {p0, v0}, Lcom/flurry/android/FlurryAgent;->a([B)Z */
if ( v0 != null) { // if-eqz v0, :cond_0
final String v0 = "FlurryAgent"; // const-string v0, "FlurryAgent"
/* new-instance v1, Ljava/lang/StringBuilder; */
/* invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V */
final String v2 = "Done sending "; // const-string v2, "Done sending "
(( java.lang.StringBuilder ) v1 ).append ( v2 ); // invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
/* iget-boolean v2, p0, Lcom/flurry/android/FlurryAgent;->v:Z */
if ( v2 != null) { // if-eqz v2, :cond_1
final String v2 = "initial "; // const-string v2, "initial "
} // :goto_0
(( java.lang.StringBuilder ) v1 ).append ( v2 ); // invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
final String v2 = "agent report"; // const-string v2, "agent report"
(( java.lang.StringBuilder ) v1 ).append ( v2 ); // invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v1 ).toString ( ); // invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
com.flurry.android.ah .a ( v0,v1 );
/* invoke-direct {p0}, Lcom/flurry/android/FlurryAgent;->i()V */
} // :cond_0
} // :goto_1
return;
} // :cond_1
final String v2 = ""; // const-string v2, ""
/* move-object v2, v4 */
} // :cond_2
final String v0 = "FlurryAgent"; // const-string v0, "FlurryAgent"
final String v1 = "Error generating report"; // const-string v1, "Error generating report"
com.flurry.android.ah .a ( v0,v1 );
/* :try_end_0 */
/* .catch Ljava/io/IOException; {:try_start_0 ..:try_end_0} :catch_0 */
/* .catch Ljava/lang/Throwable; {:try_start_0 ..:try_end_0} :catch_1 */
/* :catch_0 */
/* move-exception v0 */
final String v1 = "FlurryAgent"; // const-string v1, "FlurryAgent"
final String v1 = ""; // const-string v1, ""
com.flurry.android.ah .a ( v3,v4,v0 );
/* :catch_1 */
/* move-exception v0 */
final String v1 = "FlurryAgent"; // const-string v1, "FlurryAgent"
final String v1 = ""; // const-string v1, ""
com.flurry.android.ah .b ( v3,v4,v0 );
} // .end method
static java.lang.String c ( ) {
/* .locals 1 */
v0 = com.flurry.android.FlurryAgent.j;
v0 = this.z;
} // .end method
private java.lang.String c ( android.content.Context p0 ) {
/* .locals 8 */
int v6 = 0; // const/4 v6, 0x0
int v5 = 0; // const/4 v5, 0x0
v0 = this.F;
if ( v0 != null) { // if-eqz v0, :cond_0
v0 = this.F;
} // :goto_0
} // :cond_0
(( android.content.Context ) p1 ).getContentResolver ( ); // invoke-virtual {p1}, Landroid/content/Context;->getContentResolver()Landroid/content/ContentResolver;
final String v1 = "android_id"; // const-string v1, "android_id"
android.provider.Settings$System .getString ( v0,v1 );
if ( v0 != null) { // if-eqz v0, :cond_1
v1 = (( java.lang.String ) v0 ).length ( ); // invoke-virtual {v0}, Ljava/lang/String;->length()I
/* if-lez v1, :cond_1 */
final String v1 = "null"; // const-string v1, "null"
v1 = (( java.lang.String ) v0 ).equals ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
if ( v1 != null) { // if-eqz v1, :cond_2
} // :cond_1
/* move v1, v5 */
} // :goto_1
if ( v1 != null) { // if-eqz v1, :cond_5
/* new-instance v1, Ljava/lang/StringBuilder; */
/* invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V */
final String v2 = "AND"; // const-string v2, "AND"
(( java.lang.StringBuilder ) v1 ).append ( v2 ); // invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v1 ).append ( v0 ); // invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v0 ).toString ( ); // invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
} // :cond_2
v1 = com.flurry.android.FlurryAgent.b;
/* array-length v2, v1 */
/* move v3, v5 */
} // :goto_2
/* if-ge v3, v2, :cond_4 */
/* aget-object v4, v1, v3 */
v4 = (( java.lang.String ) v0 ).equals ( v4 ); // invoke-virtual {v0, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
if ( v4 != null) { // if-eqz v4, :cond_3
/* move v1, v5 */
} // :cond_3
/* add-int/lit8 v3, v3, 0x1 */
} // :cond_4
int v1 = 1; // const/4 v1, 0x1
} // :cond_5
final String v0 = ".flurryb."; // const-string v0, ".flurryb."
(( android.content.Context ) p1 ).getFileStreamPath ( v0 ); // invoke-virtual {p1, v0}, Landroid/content/Context;->getFileStreamPath(Ljava/lang/String;)Ljava/io/File;
v1 = (( java.io.File ) v0 ).exists ( ); // invoke-virtual {v0}, Ljava/io/File;->exists()Z
if ( v1 != null) { // if-eqz v1, :cond_6
try { // :try_start_0
/* new-instance v1, Ljava/io/FileInputStream; */
/* invoke-direct {v1, v0}, Ljava/io/FileInputStream;-><init>(Ljava/io/File;)V */
/* new-instance v0, Ljava/io/DataInputStream; */
/* invoke-direct {v0, v1}, Ljava/io/DataInputStream;-><init>(Ljava/io/InputStream;)V */
/* :try_end_0 */
/* .catch Ljava/lang/Throwable; {:try_start_0 ..:try_end_0} :catch_0 */
/* .catchall {:try_start_0 ..:try_end_0} :catchall_0 */
try { // :try_start_1
(( java.io.DataInputStream ) v0 ).readInt ( ); // invoke-virtual {v0}, Ljava/io/DataInputStream;->readInt()I
(( java.io.DataInputStream ) v0 ).readUTF ( ); // invoke-virtual {v0}, Ljava/io/DataInputStream;->readUTF()Ljava/lang/String;
/* :try_end_1 */
/* .catch Ljava/lang/Throwable; {:try_start_1 ..:try_end_1} :catch_1 */
/* .catchall {:try_start_1 ..:try_end_1} :catchall_1 */
com.flurry.android.r .a ( v0 );
/* move-object v0, v1 */
/* :catch_0 */
/* move-exception v0 */
/* move-object v1, v6 */
} // :goto_3
try { // :try_start_2
final String v2 = "FlurryAgent"; // const-string v2, "FlurryAgent"
final String v3 = "Error when loading b file"; // const-string v3, "Error when loading b file"
com.flurry.android.ah .b ( v2,v3,v0 );
/* :try_end_2 */
/* .catchall {:try_start_2 ..:try_end_2} :catchall_2 */
com.flurry.android.r .a ( v1 );
/* move-object v0, v6 */
/* :catchall_0 */
/* move-exception v0 */
/* move-object v1, v6 */
} // :goto_4
com.flurry.android.r .a ( v1 );
/* throw v0 */
/* :catchall_1 */
/* move-exception v1 */
/* move-object v7, v1 */
/* move-object v1, v0 */
/* move-object v0, v7 */
/* :catchall_2 */
/* move-exception v0 */
/* :catch_1 */
/* move-exception v1 */
/* move-object v7, v1 */
/* move-object v1, v0 */
/* move-object v0, v7 */
} // :cond_6
/* move-object v0, v6 */
/* goto/16 :goto_0 */
} // .end method
private synchronized void c ( android.content.Context p0, java.lang.String p1 ) {
/* .locals 5 */
/* monitor-enter p0 */
try { // :try_start_0
final String v0 = ".flurryb."; // const-string v0, ".flurryb."
(( android.content.Context ) p1 ).getFileStreamPath ( v0 ); // invoke-virtual {p1, v0}, Landroid/content/Context;->getFileStreamPath(Ljava/lang/String;)Ljava/io/File;
this.t = v0;
v0 = this.t;
com.flurry.android.FlurryAgent .a ( v0 );
/* :try_end_0 */
v0 = /* .catchall {:try_start_0 ..:try_end_0} :catchall_0 */
/* if-nez v0, :cond_0 */
} // :goto_0
/* monitor-exit p0 */
return;
} // :cond_0
int v0 = 0; // const/4 v0, 0x0
try { // :try_start_1
/* new-instance v1, Ljava/io/FileOutputStream; */
v2 = this.t;
/* invoke-direct {v1, v2}, Ljava/io/FileOutputStream;-><init>(Ljava/io/File;)V */
/* new-instance v2, Ljava/io/DataOutputStream; */
/* invoke-direct {v2, v1}, Ljava/io/DataOutputStream;-><init>(Ljava/io/OutputStream;)V */
/* :try_end_1 */
/* .catch Ljava/lang/Throwable; {:try_start_1 ..:try_end_1} :catch_0 */
/* .catchall {:try_start_1 ..:try_end_1} :catchall_1 */
int v0 = 1; // const/4 v0, 0x1
try { // :try_start_2
(( java.io.DataOutputStream ) v2 ).writeInt ( v0 ); // invoke-virtual {v2, v0}, Ljava/io/DataOutputStream;->writeInt(I)V
(( java.io.DataOutputStream ) v2 ).writeUTF ( p2 ); // invoke-virtual {v2, p2}, Ljava/io/DataOutputStream;->writeUTF(Ljava/lang/String;)V
/* :try_end_2 */
/* .catch Ljava/lang/Throwable; {:try_start_2 ..:try_end_2} :catch_1 */
/* .catchall {:try_start_2 ..:try_end_2} :catchall_2 */
try { // :try_start_3
com.flurry.android.r .a ( v2 );
/* :try_end_3 */
/* .catchall {:try_start_3 ..:try_end_3} :catchall_0 */
/* :catchall_0 */
/* move-exception v0 */
/* monitor-exit p0 */
/* throw v0 */
/* :catch_0 */
/* move-exception v1 */
/* move-object v4, v1 */
/* move-object v1, v0 */
/* move-object v0, v4 */
} // :goto_1
try { // :try_start_4
final String v2 = "FlurryAgent"; // const-string v2, "FlurryAgent"
final String v3 = "Error when saving b file"; // const-string v3, "Error when saving b file"
com.flurry.android.ah .b ( v2,v3,v0 );
/* :try_end_4 */
/* .catchall {:try_start_4 ..:try_end_4} :catchall_3 */
try { // :try_start_5
com.flurry.android.r .a ( v1 );
/* :catchall_1 */
/* move-exception v1 */
/* move-object v4, v1 */
/* move-object v1, v0 */
/* move-object v0, v4 */
} // :goto_2
com.flurry.android.r .a ( v1 );
/* throw v0 */
/* :try_end_5 */
/* .catchall {:try_start_5 ..:try_end_5} :catchall_0 */
/* :catchall_2 */
/* move-exception v0 */
/* move-object v1, v2 */
/* :catchall_3 */
/* move-exception v0 */
/* :catch_1 */
/* move-exception v0 */
/* move-object v1, v2 */
} // .end method
static void c ( com.flurry.android.FlurryAgent p0 ) { //synthethic
/* .locals 0 */
/* invoke-direct {p0}, Lcom/flurry/android/FlurryAgent;->i()V */
return;
} // .end method
public static void c ( java.lang.String p0 ) {
/* .locals 4 */
try { // :try_start_0
v0 = com.flurry.android.FlurryAgent.j;
/* invoke-direct {v0, p0}, Lcom/flurry/android/FlurryAgent;->e(Ljava/lang/String;)V */
/* :try_end_0 */
/* .catch Ljava/lang/Throwable; {:try_start_0 ..:try_end_0} :catch_0 */
} // :goto_0
return;
/* :catch_0 */
/* move-exception v0 */
final String v1 = "FlurryAgent"; // const-string v1, "FlurryAgent"
/* new-instance v2, Ljava/lang/StringBuilder; */
/* invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V */
final String v3 = "Failed to signify the end of event: "; // const-string v3, "Failed to signify the end of event: "
(( java.lang.StringBuilder ) v2 ).append ( v3 ); // invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v2 ).append ( p0 ); // invoke-virtual {v2, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v2 ).toString ( ); // invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
com.flurry.android.ah .b ( v1,v2,v0 );
} // .end method
static com.flurry.android.FlurryAgent d ( ) { //synthethic
/* .locals 1 */
v0 = com.flurry.android.FlurryAgent.j;
} // .end method
private static java.lang.String d ( android.content.Context p0 ) {
/* .locals 3 */
try { // :try_start_0
(( android.content.Context ) p0 ).getPackageManager ( ); // invoke-virtual {p0}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;
(( android.content.Context ) p0 ).getPackageName ( ); // invoke-virtual {p0}, Landroid/content/Context;->getPackageName()Ljava/lang/String;
int v2 = 0; // const/4 v2, 0x0
(( android.content.pm.PackageManager ) v0 ).getPackageInfo ( v1, v2 ); // invoke-virtual {v0, v1, v2}, Landroid/content/pm/PackageManager;->getPackageInfo(Ljava/lang/String;I)Landroid/content/pm/PackageInfo;
v1 = this.versionName;
if ( v1 != null) { // if-eqz v1, :cond_0
v0 = this.versionName;
} // :goto_0
} // :cond_0
/* iget v1, v0, Landroid/content/pm/PackageInfo;->versionCode:I */
if ( v1 != null) { // if-eqz v1, :cond_1
/* iget v0, v0, Landroid/content/pm/PackageInfo;->versionCode:I */
java.lang.Integer .toString ( v0 );
/* :try_end_0 */
/* .catch Ljava/lang/Throwable; {:try_start_0 ..:try_end_0} :catch_0 */
/* :catch_0 */
/* move-exception v0 */
final String v1 = "FlurryAgent"; // const-string v1, "FlurryAgent"
final String v2 = ""; // const-string v2, ""
com.flurry.android.ah .b ( v1,v2,v0 );
} // :cond_1
final String v0 = "Unknown"; // const-string v0, "Unknown"
} // .end method
static void d ( com.flurry.android.FlurryAgent p0 ) { //synthethic
/* .locals 5 */
int v4 = 0; // const/4 v4, 0x0
try { // :try_start_0
/* monitor-enter p0 */
/* :try_end_0 */
/* .catch Ljava/lang/Throwable; {:try_start_0 ..:try_end_0} :catch_0 */
try { // :try_start_1
android.os.SystemClock .elapsedRealtime ( );
/* move-result-wide v0 */
/* iget-wide v2, p0, Lcom/flurry/android/FlurryAgent;->x:J */
/* sub-long/2addr v0, v2 */
/* iget-boolean v2, p0, Lcom/flurry/android/FlurryAgent;->v:Z */
/* if-nez v2, :cond_1 */
/* sget-wide v2, Lcom/flurry/android/FlurryAgent;->k:J */
/* cmp-long v0, v0, v2 */
/* if-lez v0, :cond_1 */
v0 = v0 = this.I;
/* if-lez v0, :cond_1 */
int v0 = 1; // const/4 v0, 0x1
} // :goto_0
/* monitor-exit p0 */
/* :try_end_1 */
/* .catchall {:try_start_1 ..:try_end_1} :catchall_0 */
if ( v0 != null) { // if-eqz v0, :cond_0
int v0 = 0; // const/4 v0, 0x0
try { // :try_start_2
/* invoke-direct {p0, v0}, Lcom/flurry/android/FlurryAgent;->b(Z)V */
/* :try_end_2 */
/* .catch Ljava/lang/Throwable; {:try_start_2 ..:try_end_2} :catch_0 */
} // :cond_0
} // :goto_1
return;
} // :cond_1
/* move v0, v4 */
/* :catchall_0 */
/* move-exception v0 */
try { // :try_start_3
/* monitor-exit p0 */
/* :try_end_3 */
/* .catchall {:try_start_3 ..:try_end_3} :catchall_0 */
try { // :try_start_4
/* throw v0 */
/* :try_end_4 */
/* .catch Ljava/lang/Throwable; {:try_start_4 ..:try_end_4} :catch_0 */
/* :catch_0 */
/* move-exception v0 */
final String v1 = "FlurryAgent"; // const-string v1, "FlurryAgent"
final String v2 = ""; // const-string v2, ""
com.flurry.android.ah .b ( v1,v2,v0 );
} // .end method
public static void d ( java.lang.String p0 ) {
/* .locals 3 */
try { // :try_start_0
v0 = com.flurry.android.FlurryAgent.j;
int v1 = 0; // const/4 v1, 0x0
/* invoke-direct {v0, p0, v1}, Lcom/flurry/android/FlurryAgent;->a(Ljava/lang/String;Z)V */
/* :try_end_0 */
/* .catch Ljava/lang/Throwable; {:try_start_0 ..:try_end_0} :catch_0 */
} // :goto_0
return;
/* :catch_0 */
/* move-exception v0 */
final String v1 = "FlurryAgent"; // const-string v1, "FlurryAgent"
final String v2 = ""; // const-string v2, ""
com.flurry.android.ah .b ( v1,v2,v0 );
} // .end method
static Long e ( ) { //synthethic
/* .locals 2 */
/* sget-wide v0, Lcom/flurry/android/FlurryAgent;->k:J */
/* return-wide v0 */
} // .end method
private android.location.Location e ( android.content.Context p0 ) {
/* .locals 7 */
final String v0 = "android.permission.ACCESS_FINE_LOCATION"; // const-string v0, "android.permission.ACCESS_FINE_LOCATION"
v0 = (( android.content.Context ) p1 ).checkCallingOrSelfPermission ( v0 ); // invoke-virtual {p1, v0}, Landroid/content/Context;->checkCallingOrSelfPermission(Ljava/lang/String;)I
if ( v0 != null) { // if-eqz v0, :cond_0
final String v0 = "android.permission.ACCESS_COARSE_LOCATION"; // const-string v0, "android.permission.ACCESS_COARSE_LOCATION"
v0 = (( android.content.Context ) p1 ).checkCallingOrSelfPermission ( v0 ); // invoke-virtual {p1, v0}, Landroid/content/Context;->checkCallingOrSelfPermission(Ljava/lang/String;)I
/* if-nez v0, :cond_3 */
} // :cond_0
final String v0 = "location"; // const-string v0, "location"
(( android.content.Context ) p1 ).getSystemService ( v0 ); // invoke-virtual {p1, v0}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;
/* check-cast v0, Landroid/location/LocationManager; */
/* monitor-enter p0 */
try { // :try_start_0
v1 = this.E;
/* if-nez v1, :cond_2 */
this.E = v0;
} // :goto_0
/* monitor-exit p0 */
/* :try_end_0 */
/* .catchall {:try_start_0 ..:try_end_0} :catchall_0 */
v1 = com.flurry.android.FlurryAgent.p;
/* if-nez v1, :cond_1 */
/* new-instance v1, Landroid/location/Criteria; */
/* invoke-direct {v1}, Landroid/location/Criteria;-><init>()V */
} // :cond_1
int v2 = 1; // const/4 v2, 0x1
(( android.location.LocationManager ) v0 ).getBestProvider ( v1, v2 ); // invoke-virtual {v0, v1, v2}, Landroid/location/LocationManager;->getBestProvider(Landroid/location/Criteria;Z)Ljava/lang/String;
if ( v1 != null) { // if-eqz v1, :cond_3
/* const-wide/16 v2, 0x0 */
int v4 = 0; // const/4 v4, 0x0
android.os.Looper .getMainLooper ( );
/* move-object v5, p0 */
/* invoke-virtual/range {v0 ..v6}, Landroid/location/LocationManager;->requestLocationUpdates(Ljava/lang/String;JFLandroid/location/LocationListener;Landroid/os/Looper;)V */
(( android.location.LocationManager ) v0 ).getLastKnownLocation ( v1 ); // invoke-virtual {v0, v1}, Landroid/location/LocationManager;->getLastKnownLocation(Ljava/lang/String;)Landroid/location/Location;
} // :goto_1
} // :cond_2
try { // :try_start_1
v0 = this.E;
/* :catchall_0 */
/* move-exception v0 */
/* monitor-exit p0 */
/* :try_end_1 */
/* .catchall {:try_start_1 ..:try_end_1} :catchall_0 */
/* throw v0 */
} // :cond_3
int v0 = 0; // const/4 v0, 0x0
} // .end method
static android.os.Handler e ( com.flurry.android.FlurryAgent p0 ) { //synthethic
/* .locals 1 */
v0 = this.s;
} // .end method
private synchronized void e ( java.lang.String p0 ) {
/* .locals 5 */
/* monitor-enter p0 */
try { // :try_start_0
v0 = this.V;
v0 = } // :cond_0
if ( v0 != null) { // if-eqz v0, :cond_1
/* check-cast v0, Lcom/flurry/android/i; */
v2 = (( com.flurry.android.i ) v0 ).a ( p1 ); // invoke-virtual {v0, p1}, Lcom/flurry/android/i;->a(Ljava/lang/String;)Z
if ( v2 != null) { // if-eqz v2, :cond_0
android.os.SystemClock .elapsedRealtime ( );
/* move-result-wide v1 */
/* iget-wide v3, p0, Lcom/flurry/android/FlurryAgent;->K:J */
/* sub-long/2addr v1, v3 */
(( com.flurry.android.i ) v0 ).a ( v1, v2 ); // invoke-virtual {v0, v1, v2}, Lcom/flurry/android/i;->a(J)V
/* :try_end_0 */
/* .catchall {:try_start_0 ..:try_end_0} :catchall_0 */
} // :cond_1
/* monitor-exit p0 */
return;
/* :catchall_0 */
/* move-exception v0 */
/* monitor-exit p0 */
/* throw v0 */
} // .end method
static com.flurry.android.u f ( com.flurry.android.FlurryAgent p0 ) { //synthethic
/* .locals 1 */
v0 = this.aa;
} // .end method
private static java.lang.String f ( java.lang.String p0 ) {
/* .locals 4 */
int v3 = 4; // const/4 v3, 0x4
if ( p0 != null) { // if-eqz p0, :cond_1
v0 = (( java.lang.String ) p0 ).length ( ); // invoke-virtual {p0}, Ljava/lang/String;->length()I
/* if-le v0, v3, :cond_1 */
/* new-instance v0, Ljava/lang/StringBuilder; */
/* invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V */
int v1 = 0; // const/4 v1, 0x0
} // :goto_0
v2 = (( java.lang.String ) p0 ).length ( ); // invoke-virtual {p0}, Ljava/lang/String;->length()I
/* sub-int/2addr v2, v3 */
/* if-ge v1, v2, :cond_0 */
/* const/16 v2, 0x2a */
(( java.lang.StringBuilder ) v0 ).append ( v2 ); // invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;
/* add-int/lit8 v1, v1, 0x1 */
} // :cond_0
v1 = (( java.lang.String ) p0 ).length ( ); // invoke-virtual {p0}, Ljava/lang/String;->length()I
/* sub-int/2addr v1, v3 */
(( java.lang.String ) p0 ).substring ( v1 ); // invoke-virtual {p0, v1}, Ljava/lang/String;->substring(I)Ljava/lang/String;
(( java.lang.StringBuilder ) v0 ).append ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v0 ).toString ( ); // invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
} // :goto_1
} // :cond_1
/* move-object v0, p0 */
} // .end method
static Boolean f ( ) { //synthethic
/* .locals 1 */
/* sget-boolean v0, Lcom/flurry/android/FlurryAgent;->q:Z */
} // .end method
private synchronized void g ( ) {
/* .locals 7 */
final String v4 = ""; // const-string v4, ""
/* monitor-enter p0 */
int v0 = 0; // const/4 v0, 0x0
try { // :try_start_0
/* new-instance v2, Ljava/io/ByteArrayOutputStream; */
/* invoke-direct {v2}, Ljava/io/ByteArrayOutputStream;-><init>()V */
/* new-instance v3, Ljava/io/DataOutputStream; */
/* invoke-direct {v3, v2}, Ljava/io/DataOutputStream;-><init>(Ljava/io/OutputStream;)V */
/* :try_end_0 */
/* .catch Ljava/io/IOException; {:try_start_0 ..:try_end_0} :catch_1 */
/* .catchall {:try_start_0 ..:try_end_0} :catchall_2 */
int v0 = 1; // const/4 v0, 0x1
try { // :try_start_1
(( java.io.DataOutputStream ) v3 ).writeShort ( v0 ); // invoke-virtual {v3, v0}, Ljava/io/DataOutputStream;->writeShort(I)V
v0 = this.B;
(( java.io.DataOutputStream ) v3 ).writeUTF ( v0 ); // invoke-virtual {v3, v0}, Ljava/io/DataOutputStream;->writeUTF(Ljava/lang/String;)V
/* iget-wide v0, p0, Lcom/flurry/android/FlurryAgent;->J:J */
(( java.io.DataOutputStream ) v3 ).writeLong ( v0, v1 ); // invoke-virtual {v3, v0, v1}, Ljava/io/DataOutputStream;->writeLong(J)V
/* iget-wide v0, p0, Lcom/flurry/android/FlurryAgent;->L:J */
(( java.io.DataOutputStream ) v3 ).writeLong ( v0, v1 ); // invoke-virtual {v3, v0, v1}, Ljava/io/DataOutputStream;->writeLong(J)V
/* const-wide/16 v0, 0x0 */
(( java.io.DataOutputStream ) v3 ).writeLong ( v0, v1 ); // invoke-virtual {v3, v0, v1}, Ljava/io/DataOutputStream;->writeLong(J)V
v0 = this.M;
(( java.io.DataOutputStream ) v3 ).writeUTF ( v0 ); // invoke-virtual {v3, v0}, Ljava/io/DataOutputStream;->writeUTF(Ljava/lang/String;)V
v0 = this.N;
(( java.io.DataOutputStream ) v3 ).writeUTF ( v0 ); // invoke-virtual {v3, v0}, Ljava/io/DataOutputStream;->writeUTF(Ljava/lang/String;)V
/* iget-byte v0, p0, Lcom/flurry/android/FlurryAgent;->O:B */
(( java.io.DataOutputStream ) v3 ).writeByte ( v0 ); // invoke-virtual {v3, v0}, Ljava/io/DataOutputStream;->writeByte(I)V
v0 = this.P;
/* if-nez v0, :cond_0 */
final String v0 = ""; // const-string v0, ""
/* move-object v0, v4 */
} // :goto_0
(( java.io.DataOutputStream ) v3 ).writeUTF ( v0 ); // invoke-virtual {v3, v0}, Ljava/io/DataOutputStream;->writeUTF(Ljava/lang/String;)V
v0 = this.T;
/* if-nez v0, :cond_1 */
int v0 = 0; // const/4 v0, 0x0
(( java.io.DataOutputStream ) v3 ).writeBoolean ( v0 ); // invoke-virtual {v3, v0}, Ljava/io/DataOutputStream;->writeBoolean(Z)V
} // :goto_1
/* iget v0, p0, Lcom/flurry/android/FlurryAgent;->Z:I */
(( java.io.DataOutputStream ) v3 ).writeInt ( v0 ); // invoke-virtual {v3, v0}, Ljava/io/DataOutputStream;->writeInt(I)V
int v0 = -1; // const/4 v0, -0x1
(( java.io.DataOutputStream ) v3 ).writeByte ( v0 ); // invoke-virtual {v3, v0}, Ljava/io/DataOutputStream;->writeByte(I)V
int v0 = -1; // const/4 v0, -0x1
(( java.io.DataOutputStream ) v3 ).writeByte ( v0 ); // invoke-virtual {v3, v0}, Ljava/io/DataOutputStream;->writeByte(I)V
/* iget-byte v0, p0, Lcom/flurry/android/FlurryAgent;->Q:B */
(( java.io.DataOutputStream ) v3 ).writeByte ( v0 ); // invoke-virtual {v3, v0}, Ljava/io/DataOutputStream;->writeByte(I)V
v0 = this.R;
/* if-nez v0, :cond_2 */
int v0 = 0; // const/4 v0, 0x0
(( java.io.DataOutputStream ) v3 ).writeBoolean ( v0 ); // invoke-virtual {v3, v0}, Ljava/io/DataOutputStream;->writeBoolean(Z)V
} // :goto_2
v0 = v0 = this.U;
(( java.io.DataOutputStream ) v3 ).writeShort ( v0 ); // invoke-virtual {v3, v0}, Ljava/io/DataOutputStream;->writeShort(I)V
v0 = this.U;
v0 = } // :goto_3
if ( v0 != null) { // if-eqz v0, :cond_3
/* check-cast v0, Ljava/util/Map$Entry; */
/* check-cast v1, Ljava/lang/String; */
(( java.io.DataOutputStream ) v3 ).writeUTF ( v1 ); // invoke-virtual {v3, v1}, Ljava/io/DataOutputStream;->writeUTF(Ljava/lang/String;)V
/* check-cast v0, Lcom/flurry/android/g; */
/* iget v0, v0, Lcom/flurry/android/g;->a:I */
(( java.io.DataOutputStream ) v3 ).writeInt ( v0 ); // invoke-virtual {v3, v0}, Ljava/io/DataOutputStream;->writeInt(I)V
/* :try_end_1 */
/* .catch Ljava/io/IOException; {:try_start_1 ..:try_end_1} :catch_0 */
/* .catchall {:try_start_1 ..:try_end_1} :catchall_0 */
/* :catch_0 */
/* move-exception v0 */
/* move-object v1, v3 */
} // :goto_4
try { // :try_start_2
final String v2 = "FlurryAgent"; // const-string v2, "FlurryAgent"
final String v3 = ""; // const-string v3, ""
com.flurry.android.ah .b ( v2,v3,v0 );
/* :try_end_2 */
/* .catchall {:try_start_2 ..:try_end_2} :catchall_3 */
try { // :try_start_3
com.flurry.android.r .a ( v1 );
/* :try_end_3 */
/* .catchall {:try_start_3 ..:try_end_3} :catchall_1 */
} // :goto_5
/* monitor-exit p0 */
return;
} // :cond_0
try { // :try_start_4
v0 = this.P;
} // :cond_1
int v0 = 1; // const/4 v0, 0x1
(( java.io.DataOutputStream ) v3 ).writeBoolean ( v0 ); // invoke-virtual {v3, v0}, Ljava/io/DataOutputStream;->writeBoolean(Z)V
v0 = this.T;
(( android.location.Location ) v0 ).getLatitude ( ); // invoke-virtual {v0}, Landroid/location/Location;->getLatitude()D
/* move-result-wide v0 */
com.flurry.android.FlurryAgent .a ( v0,v1 );
/* move-result-wide v0 */
(( java.io.DataOutputStream ) v3 ).writeDouble ( v0, v1 ); // invoke-virtual {v3, v0, v1}, Ljava/io/DataOutputStream;->writeDouble(D)V
v0 = this.T;
(( android.location.Location ) v0 ).getLongitude ( ); // invoke-virtual {v0}, Landroid/location/Location;->getLongitude()D
/* move-result-wide v0 */
com.flurry.android.FlurryAgent .a ( v0,v1 );
/* move-result-wide v0 */
(( java.io.DataOutputStream ) v3 ).writeDouble ( v0, v1 ); // invoke-virtual {v3, v0, v1}, Ljava/io/DataOutputStream;->writeDouble(D)V
v0 = this.T;
v0 = (( android.location.Location ) v0 ).getAccuracy ( ); // invoke-virtual {v0}, Landroid/location/Location;->getAccuracy()F
(( java.io.DataOutputStream ) v3 ).writeFloat ( v0 ); // invoke-virtual {v3, v0}, Ljava/io/DataOutputStream;->writeFloat(F)V
/* :try_end_4 */
/* .catch Ljava/io/IOException; {:try_start_4 ..:try_end_4} :catch_0 */
/* .catchall {:try_start_4 ..:try_end_4} :catchall_0 */
/* goto/16 :goto_1 */
/* :catchall_0 */
/* move-exception v0 */
/* move-object v1, v3 */
} // :goto_6
try { // :try_start_5
com.flurry.android.r .a ( v1 );
/* throw v0 */
/* :try_end_5 */
/* .catchall {:try_start_5 ..:try_end_5} :catchall_1 */
/* :catchall_1 */
/* move-exception v0 */
/* monitor-exit p0 */
/* throw v0 */
} // :cond_2
int v0 = 1; // const/4 v0, 0x1
try { // :try_start_6
(( java.io.DataOutputStream ) v3 ).writeBoolean ( v0 ); // invoke-virtual {v3, v0}, Ljava/io/DataOutputStream;->writeBoolean(Z)V
v0 = this.R;
(( java.lang.Long ) v0 ).longValue ( ); // invoke-virtual {v0}, Ljava/lang/Long;->longValue()J
/* move-result-wide v0 */
(( java.io.DataOutputStream ) v3 ).writeLong ( v0, v1 ); // invoke-virtual {v3, v0, v1}, Ljava/io/DataOutputStream;->writeLong(J)V
/* goto/16 :goto_2 */
} // :cond_3
v0 = v0 = this.V;
(( java.io.DataOutputStream ) v3 ).writeShort ( v0 ); // invoke-virtual {v3, v0}, Ljava/io/DataOutputStream;->writeShort(I)V
v0 = this.V;
v0 = } // :goto_7
if ( v0 != null) { // if-eqz v0, :cond_4
/* check-cast v0, Lcom/flurry/android/i; */
(( com.flurry.android.i ) v0 ).a ( ); // invoke-virtual {v0}, Lcom/flurry/android/i;->a()[B
(( java.io.DataOutputStream ) v3 ).write ( v0 ); // invoke-virtual {v3, v0}, Ljava/io/DataOutputStream;->write([B)V
} // :cond_4
/* iget-boolean v0, p0, Lcom/flurry/android/FlurryAgent;->W:Z */
(( java.io.DataOutputStream ) v3 ).writeBoolean ( v0 ); // invoke-virtual {v3, v0}, Ljava/io/DataOutputStream;->writeBoolean(Z)V
/* iget v0, p0, Lcom/flurry/android/FlurryAgent;->S:I */
(( java.io.DataOutputStream ) v3 ).writeInt ( v0 ); // invoke-virtual {v3, v0}, Ljava/io/DataOutputStream;->writeInt(I)V
v0 = v0 = this.Y;
(( java.io.DataOutputStream ) v3 ).writeShort ( v0 ); // invoke-virtual {v3, v0}, Ljava/io/DataOutputStream;->writeShort(I)V
v0 = this.Y;
v0 = } // :goto_8
if ( v0 != null) { // if-eqz v0, :cond_5
/* check-cast v0, Lcom/flurry/android/aa; */
/* iget-wide v4, v0, Lcom/flurry/android/aa;->a:J */
(( java.io.DataOutputStream ) v3 ).writeLong ( v4, v5 ); // invoke-virtual {v3, v4, v5}, Ljava/io/DataOutputStream;->writeLong(J)V
v4 = this.b;
(( java.io.DataOutputStream ) v3 ).writeUTF ( v4 ); // invoke-virtual {v3, v4}, Ljava/io/DataOutputStream;->writeUTF(Ljava/lang/String;)V
v4 = this.c;
(( java.io.DataOutputStream ) v3 ).writeUTF ( v4 ); // invoke-virtual {v3, v4}, Ljava/io/DataOutputStream;->writeUTF(Ljava/lang/String;)V
v0 = this.d;
(( java.io.DataOutputStream ) v3 ).writeUTF ( v0 ); // invoke-virtual {v3, v0}, Ljava/io/DataOutputStream;->writeUTF(Ljava/lang/String;)V
} // :cond_5
/* sget-boolean v0, Lcom/flurry/android/FlurryAgent;->q:Z */
if ( v0 != null) { // if-eqz v0, :cond_6
v0 = this.aa;
v1 = (( com.flurry.android.u ) v0 ).f ( ); // invoke-virtual {v0}, Lcom/flurry/android/u;->f()Ljava/util/List;
(( java.io.DataOutputStream ) v3 ).writeShort ( v1 ); // invoke-virtual {v3, v1}, Ljava/io/DataOutputStream;->writeShort(I)V
v0 = } // :goto_9
if ( v0 != null) { // if-eqz v0, :cond_7
/* check-cast v0, Lcom/flurry/android/p; */
(( com.flurry.android.p ) v0 ).a ( v3 ); // invoke-virtual {v0, v3}, Lcom/flurry/android/p;->a(Ljava/io/DataOutput;)V
} // :cond_6
int v0 = 0; // const/4 v0, 0x0
(( java.io.DataOutputStream ) v3 ).writeShort ( v0 ); // invoke-virtual {v3, v0}, Ljava/io/DataOutputStream;->writeShort(I)V
} // :cond_7
v0 = this.I;
(( java.io.ByteArrayOutputStream ) v2 ).toByteArray ( ); // invoke-virtual {v2}, Ljava/io/ByteArrayOutputStream;->toByteArray()[B
/* :try_end_6 */
/* .catch Ljava/io/IOException; {:try_start_6 ..:try_end_6} :catch_0 */
/* .catchall {:try_start_6 ..:try_end_6} :catchall_0 */
try { // :try_start_7
com.flurry.android.r .a ( v3 );
/* :try_end_7 */
/* .catchall {:try_start_7 ..:try_end_7} :catchall_1 */
/* goto/16 :goto_5 */
/* :catchall_2 */
/* move-exception v1 */
/* move-object v6, v1 */
/* move-object v1, v0 */
/* move-object v0, v6 */
/* goto/16 :goto_6 */
/* :catchall_3 */
/* move-exception v0 */
/* goto/16 :goto_6 */
/* :catch_1 */
/* move-exception v1 */
/* move-object v6, v1 */
/* move-object v1, v0 */
/* move-object v0, v6 */
/* goto/16 :goto_4 */
} // .end method
private static java.lang.String h ( ) {
/* .locals 1 */
v0 = com.flurry.android.FlurryAgent.c;
if ( v0 != null) { // if-eqz v0, :cond_0
v0 = com.flurry.android.FlurryAgent.c;
} // :goto_0
} // :cond_0
/* sget-boolean v0, Lcom/flurry/android/FlurryAgent;->n:Z */
if ( v0 != null) { // if-eqz v0, :cond_1
v0 = com.flurry.android.FlurryAgent.d;
} // :cond_1
/* sget-boolean v0, Lcom/flurry/android/FlurryAgent;->m:Z */
if ( v0 != null) { // if-eqz v0, :cond_2
v0 = com.flurry.android.FlurryAgent.e;
} // :cond_2
v0 = com.flurry.android.FlurryAgent.d;
} // .end method
private synchronized void i ( ) {
/* .locals 6 */
int v2 = 0; // const/4 v2, 0x0
final String v0 = "FlurryAgent"; // const-string v0, "FlurryAgent"
/* monitor-enter p0 */
try { // :try_start_0
v0 = this.u;
com.flurry.android.FlurryAgent .a ( v0 );
/* :try_end_0 */
/* .catch Ljava/lang/Throwable; {:try_start_0 ..:try_end_0} :catch_0 */
v0 = /* .catchall {:try_start_0 ..:try_end_0} :catchall_1 */
/* if-nez v0, :cond_0 */
int v0 = 0; // const/4 v0, 0x0
try { // :try_start_1
com.flurry.android.r .a ( v0 );
/* :try_end_1 */
/* .catchall {:try_start_1 ..:try_end_1} :catchall_0 */
} // :goto_0
/* monitor-exit p0 */
return;
} // :cond_0
try { // :try_start_2
/* new-instance v0, Ljava/io/FileOutputStream; */
v1 = this.u;
/* invoke-direct {v0, v1}, Ljava/io/FileOutputStream;-><init>(Ljava/io/File;)V */
/* new-instance v1, Ljava/io/DataOutputStream; */
/* invoke-direct {v1, v0}, Ljava/io/DataOutputStream;-><init>(Ljava/io/OutputStream;)V */
/* :try_end_2 */
/* .catch Ljava/lang/Throwable; {:try_start_2 ..:try_end_2} :catch_0 */
/* .catchall {:try_start_2 ..:try_end_2} :catchall_1 */
/* const v0, 0xb5fa */
try { // :try_start_3
(( java.io.DataOutputStream ) v1 ).writeShort ( v0 ); // invoke-virtual {v1, v0}, Ljava/io/DataOutputStream;->writeShort(I)V
int v0 = 2; // const/4 v0, 0x2
(( java.io.DataOutputStream ) v1 ).writeShort ( v0 ); // invoke-virtual {v1, v0}, Ljava/io/DataOutputStream;->writeShort(I)V
v0 = this.z;
(( java.io.DataOutputStream ) v1 ).writeUTF ( v0 ); // invoke-virtual {v1, v0}, Ljava/io/DataOutputStream;->writeUTF(Ljava/lang/String;)V
v0 = this.F;
(( java.io.DataOutputStream ) v1 ).writeUTF ( v0 ); // invoke-virtual {v1, v0}, Ljava/io/DataOutputStream;->writeUTF(Ljava/lang/String;)V
/* iget-boolean v0, p0, Lcom/flurry/android/FlurryAgent;->G:Z */
(( java.io.DataOutputStream ) v1 ).writeBoolean ( v0 ); // invoke-virtual {v1, v0}, Ljava/io/DataOutputStream;->writeBoolean(Z)V
/* iget-wide v2, p0, Lcom/flurry/android/FlurryAgent;->H:J */
(( java.io.DataOutputStream ) v1 ).writeLong ( v2, v3 ); // invoke-virtual {v1, v2, v3}, Ljava/io/DataOutputStream;->writeLong(J)V
v0 = v0 = this.I;
int v2 = 1; // const/4 v2, 0x1
/* sub-int/2addr v0, v2 */
/* move v2, v0 */
} // :goto_1
/* if-ltz v2, :cond_1 */
v0 = this.I;
/* check-cast v0, [B */
/* array-length v3, v0 */
/* add-int/lit8 v4, v3, 0x2 */
v5 = (( java.io.DataOutputStream ) v1 ).size ( ); // invoke-virtual {v1}, Ljava/io/DataOutputStream;->size()I
/* add-int/2addr v4, v5 */
/* const v5, 0xc350 */
/* if-le v4, v5, :cond_2 */
final String v0 = "FlurryAgent"; // const-string v0, "FlurryAgent"
/* new-instance v3, Ljava/lang/StringBuilder; */
/* invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V */
final String v4 = "discarded sessions: "; // const-string v4, "discarded sessions: "
(( java.lang.StringBuilder ) v3 ).append ( v4 ); // invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v3 ).append ( v2 ); // invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v2 ).toString ( ); // invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
com.flurry.android.ah .a ( v0,v2 );
} // :cond_1
int v0 = 0; // const/4 v0, 0x0
(( java.io.DataOutputStream ) v1 ).writeShort ( v0 ); // invoke-virtual {v1, v0}, Ljava/io/DataOutputStream;->writeShort(I)V
/* :try_end_3 */
/* .catch Ljava/lang/Throwable; {:try_start_3 ..:try_end_3} :catch_1 */
/* .catchall {:try_start_3 ..:try_end_3} :catchall_2 */
try { // :try_start_4
com.flurry.android.r .a ( v1 );
/* :try_end_4 */
/* .catchall {:try_start_4 ..:try_end_4} :catchall_0 */
/* :catchall_0 */
/* move-exception v0 */
/* monitor-exit p0 */
/* throw v0 */
} // :cond_2
try { // :try_start_5
(( java.io.DataOutputStream ) v1 ).writeShort ( v3 ); // invoke-virtual {v1, v3}, Ljava/io/DataOutputStream;->writeShort(I)V
(( java.io.DataOutputStream ) v1 ).write ( v0 ); // invoke-virtual {v1, v0}, Ljava/io/DataOutputStream;->write([B)V
/* :try_end_5 */
/* .catch Ljava/lang/Throwable; {:try_start_5 ..:try_end_5} :catch_1 */
/* .catchall {:try_start_5 ..:try_end_5} :catchall_2 */
/* add-int/lit8 v0, v2, -0x1 */
/* move v2, v0 */
/* :catch_0 */
/* move-exception v0 */
/* move-object v1, v2 */
} // :goto_2
try { // :try_start_6
final String v2 = "FlurryAgent"; // const-string v2, "FlurryAgent"
final String v3 = ""; // const-string v3, ""
com.flurry.android.ah .b ( v2,v3,v0 );
/* :try_end_6 */
/* .catchall {:try_start_6 ..:try_end_6} :catchall_2 */
try { // :try_start_7
com.flurry.android.r .a ( v1 );
/* goto/16 :goto_0 */
/* :catchall_1 */
/* move-exception v0 */
/* move-object v1, v2 */
} // :goto_3
com.flurry.android.r .a ( v1 );
/* throw v0 */
/* :try_end_7 */
/* .catchall {:try_start_7 ..:try_end_7} :catchall_0 */
/* :catchall_2 */
/* move-exception v0 */
/* :catch_1 */
/* move-exception v0 */
} // .end method
private synchronized void j ( ) {
/* .locals 1 */
/* monitor-enter p0 */
try { // :try_start_0
v0 = this.E;
if ( v0 != null) { // if-eqz v0, :cond_0
v0 = this.E;
(( android.location.LocationManager ) v0 ).removeUpdates ( p0 ); // invoke-virtual {v0, p0}, Landroid/location/LocationManager;->removeUpdates(Landroid/location/LocationListener;)V
/* :try_end_0 */
/* .catchall {:try_start_0 ..:try_end_0} :catchall_0 */
} // :cond_0
/* monitor-exit p0 */
return;
/* :catchall_0 */
/* move-exception v0 */
/* monitor-exit p0 */
/* throw v0 */
} // .end method
/* # virtual methods */
final void a ( java.lang.Throwable p0 ) {
/* .locals 5 */
final String v4 = ""; // const-string v4, ""
(( java.lang.Throwable ) p1 ).printStackTrace ( ); // invoke-virtual {p1}, Ljava/lang/Throwable;->printStackTrace()V
final String v0 = ""; // const-string v0, ""
(( java.lang.Throwable ) p1 ).getStackTrace ( ); // invoke-virtual {p1}, Ljava/lang/Throwable;->getStackTrace()[Ljava/lang/StackTraceElement;
if ( v0 != null) { // if-eqz v0, :cond_1
/* array-length v1, v0 */
/* if-lez v1, :cond_1 */
int v1 = 0; // const/4 v1, 0x0
/* aget-object v0, v0, v1 */
/* new-instance v1, Ljava/lang/StringBuilder; */
/* invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V */
(( java.lang.StackTraceElement ) v0 ).getClassName ( ); // invoke-virtual {v0}, Ljava/lang/StackTraceElement;->getClassName()Ljava/lang/String;
(( java.lang.StringBuilder ) v1 ).append ( v2 ); // invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
final String v3 = "."; // const-string v3, "."
(( java.lang.StringBuilder ) v2 ).append ( v3 ); // invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StackTraceElement ) v0 ).getMethodName ( ); // invoke-virtual {v0}, Ljava/lang/StackTraceElement;->getMethodName()Ljava/lang/String;
(( java.lang.StringBuilder ) v2 ).append ( v3 ); // invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
final String v3 = ":"; // const-string v3, ":"
(( java.lang.StringBuilder ) v2 ).append ( v3 ); // invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
v0 = (( java.lang.StackTraceElement ) v0 ).getLineNumber ( ); // invoke-virtual {v0}, Ljava/lang/StackTraceElement;->getLineNumber()I
(( java.lang.StringBuilder ) v2 ).append ( v0 ); // invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;
(( java.lang.Throwable ) p1 ).getMessage ( ); // invoke-virtual {p1}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;
if ( v0 != null) { // if-eqz v0, :cond_0
/* new-instance v0, Ljava/lang/StringBuilder; */
/* invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V */
final String v2 = " ("; // const-string v2, " ("
(( java.lang.StringBuilder ) v0 ).append ( v2 ); // invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.Throwable ) p1 ).getMessage ( ); // invoke-virtual {p1}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;
(( java.lang.StringBuilder ) v0 ).append ( v2 ); // invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
final String v2 = ")"; // const-string v2, ")"
(( java.lang.StringBuilder ) v0 ).append ( v2 ); // invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v0 ).toString ( ); // invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
(( java.lang.StringBuilder ) v1 ).append ( v0 ); // invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
} // :cond_0
(( java.lang.StringBuilder ) v1 ).toString ( ); // invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
} // :goto_0
(( java.lang.Object ) p1 ).getClass ( ); // invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;
(( java.lang.Class ) v1 ).toString ( ); // invoke-virtual {v1}, Ljava/lang/Class;->toString()Ljava/lang/String;
final String v2 = "uncaught"; // const-string v2, "uncaught"
try { // :try_start_0
v3 = com.flurry.android.FlurryAgent.j;
/* invoke-direct {v3, v2, v0, v1}, Lcom/flurry/android/FlurryAgent;->a(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V */
/* :try_end_0 */
/* .catch Ljava/lang/Throwable; {:try_start_0 ..:try_end_0} :catch_0 */
} // :goto_1
v0 = this.y;
int v0 = 0; // const/4 v0, 0x0
int v1 = 1; // const/4 v1, 0x1
/* invoke-direct {p0, v0, v1}, Lcom/flurry/android/FlurryAgent;->a(Landroid/content/Context;Z)V */
return;
} // :cond_1
(( java.lang.Throwable ) p1 ).getMessage ( ); // invoke-virtual {p1}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;
if ( v0 != null) { // if-eqz v0, :cond_2
(( java.lang.Throwable ) p1 ).getMessage ( ); // invoke-virtual {p1}, Ljava/lang/Throwable;->getMessage()Ljava/lang/String;
/* :catch_0 */
/* move-exception v0 */
final String v1 = "FlurryAgent"; // const-string v1, "FlurryAgent"
final String v2 = ""; // const-string v2, ""
com.flurry.android.ah .b ( v1,v4,v0 );
} // :cond_2
/* move-object v0, v4 */
} // .end method
public synchronized final void onLocationChanged ( android.location.Location p0 ) {
/* .locals 3 */
/* monitor-enter p0 */
try { // :try_start_0
this.T = p1;
/* invoke-direct {p0}, Lcom/flurry/android/FlurryAgent;->j()V */
/* :try_end_0 */
/* .catch Ljava/lang/Throwable; {:try_start_0 ..:try_end_0} :catch_0 */
/* .catchall {:try_start_0 ..:try_end_0} :catchall_0 */
} // :goto_0
/* monitor-exit p0 */
return;
/* :catch_0 */
/* move-exception v0 */
try { // :try_start_1
final String v1 = "FlurryAgent"; // const-string v1, "FlurryAgent"
final String v2 = ""; // const-string v2, ""
com.flurry.android.ah .b ( v1,v2,v0 );
/* :try_end_1 */
/* .catchall {:try_start_1 ..:try_end_1} :catchall_0 */
/* :catchall_0 */
/* move-exception v0 */
/* monitor-exit p0 */
/* throw v0 */
} // .end method
public final void onProviderDisabled ( java.lang.String p0 ) {
/* .locals 0 */
return;
} // .end method
public final void onProviderEnabled ( java.lang.String p0 ) {
/* .locals 0 */
return;
} // .end method
public final void onStatusChanged ( java.lang.String p0, Integer p1, android.os.Bundle p2 ) {
/* .locals 0 */
return;
} // .end method
