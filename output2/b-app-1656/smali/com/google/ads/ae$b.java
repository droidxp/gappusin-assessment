class com.google.ads.ae$b implements java.lang.Runnable {
	 /* .source "SourceFile" */
	 /* # interfaces */
	 /* # annotations */
	 /* .annotation system Ldalvik/annotation/EnclosingClass; */
	 /* value = Lcom/google/ads/ae; */
} // .end annotation
/* .annotation system Ldalvik/annotation/InnerClass; */
/* accessFlags = 0xa */
/* name = "b" */
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
private final android.webkit.WebView b;
private final java.lang.String c;
/* # direct methods */
public com.google.ads.ae$b ( ) {
/* .locals 1 */
/* .prologue */
/* .line 132 */
/* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
/* .line 133 */
/* new-instance v0, Ljava/lang/ref/WeakReference; */
/* invoke-direct {v0, p1}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V */
this.a = v0;
/* .line 134 */
this.c = p3;
/* .line 135 */
this.b = p2;
/* .line 136 */
return;
} // .end method
/* # virtual methods */
public void run ( ) {
/* .locals 8 */
/* .prologue */
int v6 = 1; // const/4 v6, 0x1
int v7 = 0; // const/4 v7, 0x0
/* .line 141 */
/* .line 142 */
try { // :try_start_0
v0 = com.google.ads.ac.a;
v1 = this.c;
android.net.Uri .withAppendedPath ( v0,v1 );
/* .line 144 */
v0 = this.a;
(( java.lang.ref.WeakReference ) v0 ).get ( ); // invoke-virtual {v0}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;
/* check-cast v0, Landroid/app/Activity; */
/* .line 145 */
/* if-nez v0, :cond_0 */
/* .line 146 */
final String v0 = "Activity was null while getting the +1 button state."; // const-string v0, "Activity was null while getting the +1 button state."
com.google.ads.util.b .a ( v0 );
/* .line 163 */
} // :goto_0
return;
/* .line 149 */
} // :cond_0
(( android.app.Activity ) v0 ).getContentResolver ( ); // invoke-virtual {v0}, Landroid/app/Activity;->getContentResolver()Landroid/content/ContentResolver;
/* .line 150 */
v2 = com.google.ads.ac.c;
int v3 = 0; // const/4 v3, 0x0
int v4 = 0; // const/4 v4, 0x0
int v5 = 0; // const/4 v5, 0x0
/* invoke-virtual/range {v0 ..v5}, Landroid/content/ContentResolver;->query(Landroid/net/Uri;[Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;)Landroid/database/Cursor; */
/* .line 153 */
v1 = if ( v0 != null) { // if-eqz v0, :cond_2
if ( v1 != null) { // if-eqz v1, :cond_2
/* .line 154 */
v0 = v1 = final String v1 = "has_plus1"; // const-string v1, "has_plus1"
/* if-ne v0, v6, :cond_1 */
/* move v0, v6 */
/* .line 159 */
} // :goto_1
v1 = this.b;
/* new-instance v2, Lcom/google/ads/ae$c; */
v3 = this.b;
/* invoke-direct {v2, v3, v0}, Lcom/google/ads/ae$c;-><init>(Landroid/webkit/WebView;Z)V */
(( android.webkit.WebView ) v1 ).post ( v2 ); // invoke-virtual {v1, v2}, Landroid/webkit/WebView;->post(Ljava/lang/Runnable;)Z
/* :try_end_0 */
/* .catch Ljava/lang/Throwable; {:try_start_0 ..:try_end_0} :catch_0 */
/* .line 160 */
/* :catch_0 */
/* move-exception v0 */
/* .line 161 */
final String v1 = "An unknown error occurred while updating the +1 state."; // const-string v1, "An unknown error occurred while updating the +1 state."
com.google.ads.util.b .b ( v1,v0 );
} // :cond_1
/* move v0, v7 */
/* .line 154 */
/* .line 157 */
} // :cond_2
try { // :try_start_1
final String v0 = "Google+ app not installed, showing ad as not +1\'d"; // const-string v0, "Google+ app not installed, showing ad as not +1\'d"
com.google.ads.util.b .a ( v0 );
/* :try_end_1 */
/* .catch Ljava/lang/Throwable; {:try_start_1 ..:try_end_1} :catch_0 */
/* move v0, v7 */
} // .end method
