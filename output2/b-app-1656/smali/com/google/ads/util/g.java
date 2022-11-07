public class com.google.ads.util.g {
	 /* .source "SourceFile" */
	 /* # annotations */
	 /* .annotation system Ldalvik/annotation/MemberClasses; */
	 /* value = { */
	 /* Lcom/google/ads/util/g$1;, */
	 /* Lcom/google/ads/util/g$a;, */
	 /* Lcom/google/ads/util/g$b; */
	 /* } */
} // .end annotation
/* # direct methods */
public static void a ( android.view.View p0 ) {
	 /* .locals 2 */
	 /* .prologue */
	 /* .line 463 */
	 int v0 = 1; // const/4 v0, 0x1
	 int v1 = 0; // const/4 v1, 0x0
	 (( android.view.View ) p0 ).setLayerType ( v0, v1 ); // invoke-virtual {p0, v0, v1}, Landroid/view/View;->setLayerType(ILandroid/graphics/Paint;)V
	 /* .line 464 */
	 return;
} // .end method
public static void a ( android.view.Window p0 ) {
	 /* .locals 1 */
	 /* .prologue */
	 /* const/high16 v0, 0x1000000 */
	 /* .line 477 */
	 (( android.view.Window ) p0 ).setFlags ( v0, v0 ); // invoke-virtual {p0, v0, v0}, Landroid/view/Window;->setFlags(II)V
	 /* .line 479 */
	 return;
} // .end method
public static void a ( android.webkit.WebSettings p0, Object p1 ) {
	 /* .locals 5 */
	 /* .prologue */
	 int v4 = 1; // const/4 v4, 0x1
	 /* .line 435 */
	 v0 = this.d;
	 (( com.google.ads.util.i$b ) v0 ).a ( ); // invoke-virtual {v0}, Lcom/google/ads/util/i$b;->a()Ljava/lang/Object;
	 /* check-cast v0, Landroid/content/Context; */
	 /* .line 436 */
	 v1 = this.a;
	 (( com.google.ads.util.i$b ) v1 ).a ( ); // invoke-virtual {v1}, Lcom/google/ads/util/i$b;->a()Ljava/lang/Object;
	 /* check-cast v1, Lcom/google/ads/l; */
	 v1 = this.a;
	 (( com.google.ads.util.i$b ) v1 ).a ( ); // invoke-virtual {v1}, Lcom/google/ads/util/i$b;->a()Ljava/lang/Object;
	 /* check-cast v1, Lcom/google/ads/l$a; */
	 /* .line 439 */
	 (( android.webkit.WebSettings ) p0 ).setAppCacheEnabled ( v4 ); // invoke-virtual {p0, v4}, Landroid/webkit/WebSettings;->setAppCacheEnabled(Z)V
	 /* .line 440 */
	 v1 = this.f;
	 (( com.google.ads.util.i$c ) v1 ).a ( ); // invoke-virtual {v1}, Lcom/google/ads/util/i$c;->a()Ljava/lang/Object;
	 /* check-cast v1, Ljava/lang/Long; */
	 (( java.lang.Long ) v1 ).longValue ( ); // invoke-virtual {v1}, Ljava/lang/Long;->longValue()J
	 /* move-result-wide v1 */
	 (( android.webkit.WebSettings ) p0 ).setAppCacheMaxSize ( v1, v2 ); // invoke-virtual {p0, v1, v2}, Landroid/webkit/WebSettings;->setAppCacheMaxSize(J)V
	 /* .line 441 */
	 /* new-instance v1, Ljava/io/File; */
	 (( android.content.Context ) v0 ).getCacheDir ( ); // invoke-virtual {v0}, Landroid/content/Context;->getCacheDir()Ljava/io/File;
	 final String v3 = "admob"; // const-string v3, "admob"
	 /* invoke-direct {v1, v2, v3}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V */
	 (( java.io.File ) v1 ).getAbsolutePath ( ); // invoke-virtual {v1}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;
	 (( android.webkit.WebSettings ) p0 ).setAppCachePath ( v1 ); // invoke-virtual {p0, v1}, Landroid/webkit/WebSettings;->setAppCachePath(Ljava/lang/String;)V
	 /* .line 444 */
	 (( android.webkit.WebSettings ) p0 ).setDatabaseEnabled ( v4 ); // invoke-virtual {p0, v4}, Landroid/webkit/WebSettings;->setDatabaseEnabled(Z)V
	 /* .line 445 */
	 final String v1 = "admob"; // const-string v1, "admob"
	 (( android.content.Context ) v0 ).getDatabasePath ( v1 ); // invoke-virtual {v0, v1}, Landroid/content/Context;->getDatabasePath(Ljava/lang/String;)Ljava/io/File;
	 (( java.io.File ) v0 ).getAbsolutePath ( ); // invoke-virtual {v0}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;
	 (( android.webkit.WebSettings ) p0 ).setDatabasePath ( v0 ); // invoke-virtual {p0, v0}, Landroid/webkit/WebSettings;->setDatabasePath(Ljava/lang/String;)V
	 /* .line 448 */
	 (( android.webkit.WebSettings ) p0 ).setDomStorageEnabled ( v4 ); // invoke-virtual {p0, v4}, Landroid/webkit/WebSettings;->setDomStorageEnabled(Z)V
	 /* .line 452 */
	 (( android.webkit.WebSettings ) p0 ).setSupportZoom ( v4 ); // invoke-virtual {p0, v4}, Landroid/webkit/WebSettings;->setSupportZoom(Z)V
	 /* .line 453 */
	 (( android.webkit.WebSettings ) p0 ).setBuiltInZoomControls ( v4 ); // invoke-virtual {p0, v4}, Landroid/webkit/WebSettings;->setBuiltInZoomControls(Z)V
	 /* .line 454 */
	 int v0 = 0; // const/4 v0, 0x0
	 (( android.webkit.WebSettings ) p0 ).setDisplayZoomControls ( v0 ); // invoke-virtual {p0, v0}, Landroid/webkit/WebSettings;->setDisplayZoomControls(Z)V
	 /* .line 455 */
	 return;
} // .end method
public static void b ( android.view.View p0 ) {
	 /* .locals 2 */
	 /* .prologue */
	 /* .line 470 */
	 int v0 = 0; // const/4 v0, 0x0
	 int v1 = 0; // const/4 v1, 0x0
	 (( android.view.View ) p0 ).setLayerType ( v0, v1 ); // invoke-virtual {p0, v0, v1}, Landroid/view/View;->setLayerType(ILandroid/graphics/Paint;)V
	 /* .line 471 */
	 return;
} // .end method
