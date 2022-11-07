class com.google.ads.ae$a implements java.lang.Runnable {
	 /* .source "SourceFile" */
	 /* # interfaces */
	 /* # annotations */
	 /* .annotation system Ldalvik/annotation/EnclosingClass; */
	 /* value = Lcom/google/ads/ae; */
} // .end annotation
/* .annotation system Ldalvik/annotation/InnerClass; */
/* accessFlags = 0xa */
/* name = "a" */
} // .end annotation
/* # instance fields */
private final java.lang.ref.WeakReference a;
/* .annotation system Ldalvik/annotation/Signature; */
/* value = { */
/* "Ljava/lang/ref/WeakReference", */
/* "<", */
/* "Landroid/app/Activity;", */
/* ">;" */
/* } */
} // .end annotation
} // .end field
private final android.content.SharedPreferences$Editor b;
/* # direct methods */
public com.google.ads.ae$a ( ) {
/* .locals 1 */
/* .prologue */
/* .line 58 */
int v0 = 0; // const/4 v0, 0x0
/* invoke-direct {p0, p1, v0}, Lcom/google/ads/ae$a;-><init>(Landroid/app/Activity;Landroid/content/SharedPreferences$Editor;)V */
/* .line 59 */
return;
} // .end method
 com.google.ads.ae$a ( ) {
/* .locals 1 */
/* .prologue */
/* .line 67 */
/* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
/* .line 68 */
/* new-instance v0, Ljava/lang/ref/WeakReference; */
/* invoke-direct {v0, p1}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V */
this.a = v0;
/* .line 69 */
this.b = p2;
/* .line 70 */
return;
} // .end method
private android.content.SharedPreferences$Editor a ( android.app.Activity p0 ) {
/* .locals 1 */
/* .prologue */
/* .line 73 */
v0 = this.b;
/* if-nez v0, :cond_0 */
/* .line 74 */
(( android.app.Activity ) p1 ).getApplicationContext ( ); // invoke-virtual {p1}, Landroid/app/Activity;->getApplicationContext()Landroid/content/Context;
android.preference.PreferenceManager .getDefaultSharedPreferences ( v0 );
/* .line 77 */
} // :goto_0
} // :cond_0
v0 = this.b;
} // .end method
/* # virtual methods */
public void run ( ) {
/* .locals 9 */
/* .prologue */
int v8 = 0; // const/4 v8, 0x0
/* .line 85 */
try { // :try_start_0
v1 = this.a;
(( java.lang.ref.WeakReference ) v1 ).get ( ); // invoke-virtual {v1}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;
/* move-object v0, v1 */
/* check-cast v0, Landroid/app/Activity; */
/* move-object v7, v0 */
/* .line 86 */
/* if-nez v7, :cond_0 */
/* .line 87 */
final String v1 = "Activity was null while making a doritos cookie request."; // const-string v1, "Activity was null while making a doritos cookie request."
com.google.ads.util.b .a ( v1 );
/* .line 121 */
} // :goto_0
return;
/* .line 91 */
} // :cond_0
(( android.app.Activity ) v7 ).getContentResolver ( ); // invoke-virtual {v7}, Landroid/app/Activity;->getContentResolver()Landroid/content/ContentResolver;
/* .line 94 */
v2 = com.google.ads.ac.b;
v3 = com.google.ads.ac.d;
int v4 = 0; // const/4 v4, 0x0
int v5 = 0; // const/4 v5, 0x0
int v6 = 0; // const/4 v6, 0x0
/* invoke-virtual/range {v1 ..v6}, Landroid/content/ContentResolver;->query(Landroid/net/Uri;[Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;)Landroid/database/Cursor; */
/* .line 98 */
v2 = if ( v1 != null) { // if-eqz v1, :cond_1
if ( v2 != null) { // if-eqz v2, :cond_1
/* array-length v2, v2 */
/* if-lez v2, :cond_1 */
/* .line 100 */
v2 = int v2 = 0; // const/4 v2, 0x0
/* .line 105 */
} // :goto_1
/* invoke-direct {p0, v7}, Lcom/google/ads/ae$a;->a(Landroid/app/Activity;)Landroid/content/SharedPreferences$Editor; */
/* .line 106 */
v3 = android.text.TextUtils .isEmpty ( v1 );
/* if-nez v3, :cond_2 */
/* .line 110 */
final String v3 = "drt"; // const-string v3, "drt"
/* .line 111 */
final String v1 = "drt_ts"; // const-string v1, "drt_ts"
/* new-instance v3, Ljava/util/Date; */
/* invoke-direct {v3}, Ljava/util/Date;-><init>()V */
(( java.util.Date ) v3 ).getTime ( ); // invoke-virtual {v3}, Ljava/util/Date;->getTime()J
/* move-result-wide v3 */
/* .line 117 */
} // :goto_2
/* :try_end_0 */
/* .catch Ljava/lang/Throwable; {:try_start_0 ..:try_end_0} :catch_0 */
/* .line 118 */
/* :catch_0 */
/* move-exception v1 */
/* .line 119 */
final String v2 = "An unknown error occurred while sending a doritos request."; // const-string v2, "An unknown error occurred while sending a doritos request."
com.google.ads.util.b .b ( v2,v1 );
/* .line 103 */
} // :cond_1
try { // :try_start_1
final String v1 = "Google+ app not installed, not storing doritos cookie"; // const-string v1, "Google+ app not installed, not storing doritos cookie"
com.google.ads.util.b .a ( v1 );
/* move-object v1, v8 */
/* .line 114 */
} // :cond_2
final String v1 = "drt"; // const-string v1, "drt"
final String v3 = ""; // const-string v3, ""
/* .line 115 */
final String v1 = "drt_ts"; // const-string v1, "drt_ts"
/* const-wide/16 v3, 0x0 */
/* :try_end_1 */
/* .catch Ljava/lang/Throwable; {:try_start_1 ..:try_end_1} :catch_0 */
} // .end method
