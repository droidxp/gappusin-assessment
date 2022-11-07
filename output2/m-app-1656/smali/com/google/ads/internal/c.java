public class com.google.ads.internal.c implements java.lang.Runnable {
	 /* .source "SourceFile" */
	 /* # interfaces */
	 /* # annotations */
	 /* .annotation system Ldalvik/annotation/MemberClasses; */
	 /* value = { */
	 /* Lcom/google/ads/internal/c$e;, */
	 /* Lcom/google/ads/internal/c$c;, */
	 /* Lcom/google/ads/internal/c$a;, */
	 /* Lcom/google/ads/internal/c$b;, */
	 /* Lcom/google/ads/internal/c$d; */
	 /* } */
} // .end annotation
/* # instance fields */
private java.lang.String a;
private java.lang.String b;
private java.lang.String c;
private java.lang.String d;
private Boolean e;
private com.google.ads.internal.f f;
private com.google.ads.internal.d g;
private com.google.ads.AdRequest h;
private android.webkit.WebView i;
private java.lang.String j;
private java.util.LinkedList k;
/* .annotation system Ldalvik/annotation/Signature; */
/* value = { */
/* "Ljava/util/LinkedList", */
/* "<", */
/* "Ljava/lang/String;", */
/* ">;" */
/* } */
} // .end annotation
} // .end field
private java.lang.String l;
private volatile Boolean m;
private Boolean n;
private com.google.ads.AdRequest$ErrorCode o;
private Boolean p;
private Integer q;
private java.lang.Thread r;
private Boolean s;
/* # direct methods */
protected com.google.ads.internal.c ( ) {
/* .locals 0 */
/* .prologue */
/* .line 350 */
/* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
/* .line 352 */
return;
} // .end method
public com.google.ads.internal.c ( ) {
/* .locals 4 */
/* .prologue */
int v3 = 0; // const/4 v3, 0x0
int v2 = 0; // const/4 v2, 0x0
/* .line 360 */
/* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
/* .line 362 */
this.g = p1;
/* .line 366 */
this.j = v2;
/* .line 371 */
this.a = v2;
/* .line 372 */
this.b = v2;
/* .line 373 */
this.c = v2;
/* .line 380 */
/* new-instance v0, Ljava/util/LinkedList; */
/* invoke-direct {v0}, Ljava/util/LinkedList;-><init>()V */
this.k = v0;
/* .line 384 */
this.o = v2;
/* .line 388 */
/* iput-boolean v3, p0, Lcom/google/ads/internal/c;->p:Z */
/* .line 391 */
int v0 = -1; // const/4 v0, -0x1
/* iput v0, p0, Lcom/google/ads/internal/c;->q:I */
/* .line 393 */
/* iput-boolean v3, p0, Lcom/google/ads/internal/c;->e:Z */
/* .line 394 */
/* iput-boolean v3, p0, Lcom/google/ads/internal/c;->n:Z */
/* .line 395 */
this.l = v2;
/* .line 398 */
(( com.google.ads.internal.d ) p1 ).g ( ); // invoke-virtual {p1}, Lcom/google/ads/internal/d;->g()Lcom/google/ads/m;
v0 = this.c;
(( com.google.ads.util.i$d ) v0 ).a ( ); // invoke-virtual {v0}, Lcom/google/ads/util/i$d;->a()Ljava/lang/Object;
/* check-cast v0, Landroid/app/Activity; */
/* .line 399 */
if ( v0 != null) { // if-eqz v0, :cond_0
/* .line 403 */
/* new-instance v0, Lcom/google/ads/internal/AdWebView; */
(( com.google.ads.internal.d ) p1 ).g ( ); // invoke-virtual {p1}, Lcom/google/ads/internal/d;->g()Lcom/google/ads/m;
/* invoke-direct {v0, v1, v2}, Lcom/google/ads/internal/AdWebView;-><init>(Lcom/google/ads/m;Lcom/google/ads/AdSize;)V */
this.i = v0;
/* .line 404 */
v0 = this.i;
v1 = com.google.ads.internal.a.b;
com.google.ads.internal.i .a ( p1,v1,v3,v3 );
(( android.webkit.WebView ) v0 ).setWebViewClient ( v1 ); // invoke-virtual {v0, v1}, Landroid/webkit/WebView;->setWebViewClient(Landroid/webkit/WebViewClient;)V
/* .line 408 */
v0 = this.i;
/* const/16 v1, 0x8 */
(( android.webkit.WebView ) v0 ).setVisibility ( v1 ); // invoke-virtual {v0, v1}, Landroid/webkit/WebView;->setVisibility(I)V
/* .line 409 */
v0 = this.i;
int v1 = 1; // const/4 v1, 0x1
(( android.webkit.WebView ) v0 ).setWillNotDraw ( v1 ); // invoke-virtual {v0, v1}, Landroid/webkit/WebView;->setWillNotDraw(Z)V
/* .line 412 */
/* new-instance v0, Lcom/google/ads/internal/f; */
/* invoke-direct {v0, p0, p1}, Lcom/google/ads/internal/f;-><init>(Lcom/google/ads/internal/c;Lcom/google/ads/internal/d;)V */
this.f = v0;
/* .line 420 */
} // :goto_0
return;
/* .line 416 */
} // :cond_0
this.i = v2;
/* .line 417 */
this.f = v2;
/* .line 418 */
final String v0 = "activity was null while trying to create an AdLoader."; // const-string v0, "activity was null while trying to create an AdLoader."
com.google.ads.util.b .e ( v0 );
} // .end method
static com.google.ads.internal.d a ( Object p0 ) { //synthethic
/* .locals 1 */
/* .prologue */
/* .line 42 */
v0 = this.g;
} // .end method
static void a ( java.lang.String p0, Object p1, Object p2 ) {
/* .locals 5 */
/* .prologue */
/* .line 696 */
/* if-nez p0, :cond_1 */
/* .line 728 */
} // :cond_0
} // :goto_0
return;
/* .line 699 */
} // :cond_1
final String v0 = "no-store"; // const-string v0, "no-store"
v0 = (( java.lang.String ) p0 ).contains ( v0 ); // invoke-virtual {p0, v0}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z
/* if-nez v0, :cond_0 */
/* .line 702 */
final String v0 = "no-cache"; // const-string v0, "no-cache"
v0 = (( java.lang.String ) p0 ).contains ( v0 ); // invoke-virtual {p0, v0}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z
/* if-nez v0, :cond_0 */
/* .line 707 */
final String v0 = "max-age\\s*=\\s*(\\d+)"; // const-string v0, "max-age\\s*=\\s*(\\d+)"
java.util.regex.Pattern .compile ( v0 );
(( java.util.regex.Pattern ) v0 ).matcher ( p0 ); // invoke-virtual {v0, p0}, Ljava/util/regex/Pattern;->matcher(Ljava/lang/CharSequence;)Ljava/util/regex/Matcher;
/* .line 709 */
v1 = (( java.util.regex.Matcher ) v0 ).find ( ); // invoke-virtual {v0}, Ljava/util/regex/Matcher;->find()Z
if ( v1 != null) { // if-eqz v1, :cond_2
/* .line 711 */
int v1 = 1; // const/4 v1, 0x1
try { // :try_start_0
(( java.util.regex.Matcher ) v0 ).group ( v1 ); // invoke-virtual {v0, v1}, Ljava/util/regex/Matcher;->group(I)Ljava/lang/String;
v0 = java.lang.Integer .parseInt ( v0 );
/* .line 712 */
(( com.google.ads.d ) p2 ).a ( p1, v0 ); // invoke-virtual {p2, p1, v0}, Lcom/google/ads/d;->a(Lcom/google/ads/c;I)V
/* .line 713 */
v1 = java.util.Locale.US;
final String v2 = "Caching gWhirl configuration for: %d seconds"; // const-string v2, "Caching gWhirl configuration for: %d seconds"
int v3 = 1; // const/4 v3, 0x1
/* new-array v3, v3, [Ljava/lang/Object; */
int v4 = 0; // const/4 v4, 0x0
java.lang.Integer .valueOf ( v0 );
/* aput-object v0, v3, v4 */
java.lang.String .format ( v1,v2,v3 );
com.google.ads.util.b .c ( v0 );
/* :try_end_0 */
/* .catch Ljava/lang/NumberFormatException; {:try_start_0 ..:try_end_0} :catch_0 */
/* .line 716 */
/* :catch_0 */
/* move-exception v0 */
/* .line 719 */
final String v1 = "Caught exception trying to parse cache control directive.Overflow?"; // const-string v1, "Caught exception trying to parse cache control directive.Overflow?"
com.google.ads.util.b .b ( v1,v0 );
/* .line 726 */
} // :cond_2
/* new-instance v0, Ljava/lang/StringBuilder; */
/* invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V */
final String v1 = "Unrecognized cacheControlDirective: \'"; // const-string v1, "Unrecognized cacheControlDirective: \'"
(( java.lang.StringBuilder ) v0 ).append ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v0 ).append ( p0 ); // invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
final String v1 = "\'.Not caching configuration."; // const-string v1, "\'.Not caching configuration."
(( java.lang.StringBuilder ) v0 ).append ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v0 ).toString ( ); // invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
com.google.ads.util.b .c ( v0 );
} // .end method
private java.lang.String d ( ) {
/* .locals 1 */
/* .prologue */
/* .line 738 */
v0 = this.h;
/* instance-of v0, v0, Lcom/google/ads/searchads/SearchAdRequest; */
if ( v0 != null) { // if-eqz v0, :cond_0
/* .line 739 */
final String v0 = "<html><head><script src=\"http://www.gstatic.com/safa/sdk-core-v40.js\"></script><script>"; // const-string v0, "<html><head><script src=\"http://www.gstatic.com/safa/sdk-core-v40.js\"></script><script>"
/* .line 741 */
} // :goto_0
} // :cond_0
final String v0 = "<html><head><script src=\"http://media.admob.com/sdk-core-v40.js\"></script><script>"; // const-string v0, "<html><head><script src=\"http://media.admob.com/sdk-core-v40.js\"></script><script>"
} // .end method
private void e ( ) {
/* .locals 5 */
/* .prologue */
/* .line 994 */
v0 = this.g;
(( com.google.ads.internal.d ) v0 ).j ( ); // invoke-virtual {v0}, Lcom/google/ads/internal/d;->j()Lcom/google/ads/internal/AdWebView;
/* .line 995 */
v1 = this.g;
(( com.google.ads.internal.d ) v1 ).k ( ); // invoke-virtual {v1}, Lcom/google/ads/internal/d;->k()Lcom/google/ads/internal/i;
/* .line 996 */
int v2 = 1; // const/4 v2, 0x1
(( com.google.ads.internal.i ) v1 ).c ( v2 ); // invoke-virtual {v1, v2}, Lcom/google/ads/internal/i;->c(Z)V
/* .line 997 */
v1 = this.g;
/* new-instance v2, Lcom/google/ads/internal/c$c; */
v3 = this.a;
v4 = this.b;
/* invoke-direct {v2, p0, v0, v3, v4}, Lcom/google/ads/internal/c$c;-><init>(Lcom/google/ads/internal/c;Landroid/webkit/WebView;Ljava/lang/String;Ljava/lang/String;)V */
(( com.google.ads.internal.d ) v1 ).a ( v2 ); // invoke-virtual {v1, v2}, Lcom/google/ads/internal/d;->a(Ljava/lang/Runnable;)V
/* .line 999 */
return;
} // .end method
private void f ( ) {
/* .locals 7 */
/* .prologue */
/* .line 1005 */
v6 = this.g;
/* new-instance v0, Lcom/google/ads/internal/c$e; */
v1 = this.g;
v2 = this.k;
/* iget v3, p0, Lcom/google/ads/internal/c;->q:I */
/* iget-boolean v4, p0, Lcom/google/ads/internal/c;->n:Z */
v5 = this.l;
/* invoke-direct/range {v0 ..v5}, Lcom/google/ads/internal/c$e;-><init>(Lcom/google/ads/internal/d;Ljava/util/LinkedList;IZLjava/lang/String;)V */
(( com.google.ads.internal.d ) v6 ).a ( v0 ); // invoke-virtual {v6, v0}, Lcom/google/ads/internal/d;->a(Ljava/lang/Runnable;)V
/* .line 1010 */
return;
} // .end method
private void f ( java.lang.String p0 ) {
/* .locals 4 */
/* .prologue */
/* .line 985 */
v0 = this.g;
/* new-instance v1, Lcom/google/ads/internal/c$c; */
v2 = this.i;
int v3 = 0; // const/4 v3, 0x0
/* invoke-direct {v1, p0, v2, v3, p1}, Lcom/google/ads/internal/c$c;-><init>(Lcom/google/ads/internal/c;Landroid/webkit/WebView;Ljava/lang/String;Ljava/lang/String;)V */
(( com.google.ads.internal.d ) v0 ).a ( v1 ); // invoke-virtual {v0, v1}, Lcom/google/ads/internal/d;->a(Ljava/lang/Runnable;)V
/* .line 987 */
return;
} // .end method
/* # virtual methods */
public java.lang.String a ( java.util.Map p0, android.app.Activity p1 ) {
/* .locals 7 */
/* .annotation system Ldalvik/annotation/Signature; */
/* value = { */
/* "(", */
/* "Ljava/util/Map", */
/* "<", */
/* "Ljava/lang/String;", */
/* "Ljava/lang/Object;", */
/* ">;", */
/* "Landroid/app/Activity;", */
/* ")", */
/* "Ljava/lang/String;" */
/* } */
} // .end annotation
/* .annotation system Ldalvik/annotation/Throws; */
/* value = { */
/* Lcom/google/ads/internal/c$b;, */
/* Lcom/google/ads/internal/c$d; */
/* } */
} // .end annotation
/* .prologue */
/* const-wide/16 v5, 0x0 */
/* .line 759 */
(( android.app.Activity ) p2 ).getApplicationContext ( ); // invoke-virtual {p2}, Landroid/app/Activity;->getApplicationContext()Landroid/content/Context;
/* .line 762 */
v0 = this.g;
(( com.google.ads.internal.d ) v0 ).l ( ); // invoke-virtual {v0}, Lcom/google/ads/internal/d;->l()Lcom/google/ads/internal/g;
/* .line 765 */
(( com.google.ads.internal.g ) v0 ).h ( ); // invoke-virtual {v0}, Lcom/google/ads/internal/g;->h()J
/* move-result-wide v2 */
/* .line 766 */
/* cmp-long v4, v2, v5 */
/* if-lez v4, :cond_0 */
/* .line 767 */
final String v4 = "prl"; // const-string v4, "prl"
java.lang.Long .valueOf ( v2,v3 );
/* .line 771 */
} // :cond_0
(( com.google.ads.internal.g ) v0 ).g ( ); // invoke-virtual {v0}, Lcom/google/ads/internal/g;->g()Ljava/lang/String;
/* .line 772 */
if ( v2 != null) { // if-eqz v2, :cond_1
/* .line 773 */
final String v3 = "ppcl"; // const-string v3, "ppcl"
/* .line 778 */
} // :cond_1
(( com.google.ads.internal.g ) v0 ).f ( ); // invoke-virtual {v0}, Lcom/google/ads/internal/g;->f()Ljava/lang/String;
/* .line 779 */
if ( v2 != null) { // if-eqz v2, :cond_2
/* .line 780 */
final String v3 = "pcl"; // const-string v3, "pcl"
/* .line 784 */
} // :cond_2
(( com.google.ads.internal.g ) v0 ).e ( ); // invoke-virtual {v0}, Lcom/google/ads/internal/g;->e()J
/* move-result-wide v2 */
/* .line 785 */
/* cmp-long v4, v2, v5 */
/* if-lez v4, :cond_3 */
/* .line 786 */
final String v4 = "pcc"; // const-string v4, "pcc"
java.lang.Long .valueOf ( v2,v3 );
/* .line 790 */
} // :cond_3
final String v2 = "preqs"; // const-string v2, "preqs"
(( com.google.ads.internal.g ) v0 ).i ( ); // invoke-virtual {v0}, Lcom/google/ads/internal/g;->i()J
/* move-result-wide v3 */
java.lang.Long .valueOf ( v3,v4 );
/* .line 793 */
(( com.google.ads.internal.g ) v0 ).j ( ); // invoke-virtual {v0}, Lcom/google/ads/internal/g;->j()Ljava/lang/String;
/* .line 794 */
if ( v2 != null) { // if-eqz v2, :cond_4
/* .line 795 */
final String v3 = "pai"; // const-string v3, "pai"
/* .line 799 */
} // :cond_4
v2 = (( com.google.ads.internal.g ) v0 ).k ( ); // invoke-virtual {v0}, Lcom/google/ads/internal/g;->k()Z
/* .line 800 */
if ( v2 != null) { // if-eqz v2, :cond_5
/* .line 801 */
final String v2 = "aoi_timeout"; // const-string v2, "aoi_timeout"
final String v3 = "true"; // const-string v3, "true"
/* .line 805 */
} // :cond_5
v2 = (( com.google.ads.internal.g ) v0 ).m ( ); // invoke-virtual {v0}, Lcom/google/ads/internal/g;->m()Z
/* .line 806 */
if ( v2 != null) { // if-eqz v2, :cond_6
/* .line 807 */
final String v2 = "aoi_nofill"; // const-string v2, "aoi_nofill"
final String v3 = "true"; // const-string v3, "true"
/* .line 811 */
} // :cond_6
(( com.google.ads.internal.g ) v0 ).p ( ); // invoke-virtual {v0}, Lcom/google/ads/internal/g;->p()Ljava/lang/String;
/* .line 812 */
if ( v2 != null) { // if-eqz v2, :cond_7
/* .line 813 */
final String v3 = "pit"; // const-string v3, "pit"
/* .line 817 */
} // :cond_7
com.google.ads.internal.g .q ( );
/* move-result-wide v2 */
/* .line 818 */
final String v4 = "ptime"; // const-string v4, "ptime"
java.lang.Long .valueOf ( v2,v3 );
/* .line 821 */
(( com.google.ads.internal.g ) v0 ).a ( ); // invoke-virtual {v0}, Lcom/google/ads/internal/g;->a()V
/* .line 822 */
(( com.google.ads.internal.g ) v0 ).d ( ); // invoke-virtual {v0}, Lcom/google/ads/internal/g;->d()V
/* .line 825 */
v0 = this.g;
(( com.google.ads.internal.d ) v0 ).g ( ); // invoke-virtual {v0}, Lcom/google/ads/internal/d;->g()Lcom/google/ads/m;
v0 = (( com.google.ads.m ) v0 ).b ( ); // invoke-virtual {v0}, Lcom/google/ads/m;->b()Z
if ( v0 != null) { // if-eqz v0, :cond_9
/* .line 826 */
final String v0 = "format"; // const-string v0, "format"
final String v2 = "interstitial_mb"; // const-string v2, "interstitial_mb"
/* .line 848 */
} // :goto_0
final String v0 = "slotname"; // const-string v0, "slotname"
v2 = this.g;
(( com.google.ads.internal.d ) v2 ).g ( ); // invoke-virtual {v2}, Lcom/google/ads/internal/d;->g()Lcom/google/ads/m;
v2 = this.b;
(( com.google.ads.util.i$b ) v2 ).a ( ); // invoke-virtual {v2}, Lcom/google/ads/util/i$b;->a()Ljava/lang/Object;
/* .line 852 */
final String v0 = "js"; // const-string v0, "js"
final String v2 = "afma-sdk-a-v6.0.1"; // const-string v2, "afma-sdk-a-v6.0.1"
/* .line 855 */
(( android.content.Context ) v1 ).getPackageName ( ); // invoke-virtual {v1}, Landroid/content/Context;->getPackageName()Ljava/lang/String;
/* .line 858 */
try { // :try_start_0
(( android.content.Context ) v1 ).getPackageManager ( ); // invoke-virtual {v1}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;
int v3 = 0; // const/4 v3, 0x0
(( android.content.pm.PackageManager ) v2 ).getPackageInfo ( v0, v3 ); // invoke-virtual {v2, v0, v3}, Landroid/content/pm/PackageManager;->getPackageInfo(Ljava/lang/String;I)Landroid/content/pm/PackageInfo;
/* :try_end_0 */
/* .catch Landroid/content/pm/PackageManager$NameNotFoundException; {:try_start_0 ..:try_end_0} :catch_0 */
/* .line 862 */
/* iget v0, v0, Landroid/content/pm/PackageInfo;->versionCode:I */
/* .line 865 */
com.google.ads.util.AdUtil .f ( v1 );
/* .line 866 */
v3 = android.text.TextUtils .isEmpty ( v2 );
/* if-nez v3, :cond_8 */
/* .line 867 */
final String v3 = "mv"; // const-string v3, "mv"
/* .line 871 */
} // :cond_8
final String v2 = "msid"; // const-string v2, "msid"
(( android.content.Context ) v1 ).getPackageName ( ); // invoke-virtual {v1}, Landroid/content/Context;->getPackageName()Ljava/lang/String;
/* .line 874 */
final String v2 = "app_name"; // const-string v2, "app_name"
/* new-instance v3, Ljava/lang/StringBuilder; */
/* invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V */
(( java.lang.StringBuilder ) v3 ).append ( v0 ); // invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;
final String v3 = ".android."; // const-string v3, ".android."
(( java.lang.StringBuilder ) v0 ).append ( v3 ); // invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( android.content.Context ) v1 ).getPackageName ( ); // invoke-virtual {v1}, Landroid/content/Context;->getPackageName()Ljava/lang/String;
(( java.lang.StringBuilder ) v0 ).append ( v3 ); // invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v0 ).toString ( ); // invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
/* .line 878 */
final String v0 = "isu"; // const-string v0, "isu"
com.google.ads.util.AdUtil .a ( v1 );
/* .line 881 */
com.google.ads.util.AdUtil .d ( v1 );
/* .line 882 */
/* if-nez v0, :cond_d */
/* .line 883 */
/* new-instance v0, Lcom/google/ads/internal/c$d; */
final String v1 = "NETWORK_ERROR"; // const-string v1, "NETWORK_ERROR"
/* invoke-direct {v0, p0, v1}, Lcom/google/ads/internal/c$d;-><init>(Lcom/google/ads/internal/c;Ljava/lang/String;)V */
/* throw v0 */
/* .line 828 */
} // :cond_9
v0 = this.g;
(( com.google.ads.internal.d ) v0 ).g ( ); // invoke-virtual {v0}, Lcom/google/ads/internal/d;->g()Lcom/google/ads/m;
v0 = this.i;
(( com.google.ads.util.i$b ) v0 ).a ( ); // invoke-virtual {v0}, Lcom/google/ads/util/i$b;->a()Ljava/lang/Object;
/* check-cast v0, Lcom/google/ads/internal/h; */
(( com.google.ads.internal.h ) v0 ).b ( ); // invoke-virtual {v0}, Lcom/google/ads/internal/h;->b()Lcom/google/ads/AdSize;
/* .line 829 */
v2 = (( com.google.ads.AdSize ) v0 ).isFullWidth ( ); // invoke-virtual {v0}, Lcom/google/ads/AdSize;->isFullWidth()Z
if ( v2 != null) { // if-eqz v2, :cond_a
/* .line 830 */
final String v2 = "smart_w"; // const-string v2, "smart_w"
final String v3 = "full"; // const-string v3, "full"
/* .line 832 */
} // :cond_a
v2 = (( com.google.ads.AdSize ) v0 ).isAutoHeight ( ); // invoke-virtual {v0}, Lcom/google/ads/AdSize;->isAutoHeight()Z
if ( v2 != null) { // if-eqz v2, :cond_b
/* .line 833 */
final String v2 = "smart_h"; // const-string v2, "smart_h"
final String v3 = "auto"; // const-string v3, "auto"
/* .line 835 */
} // :cond_b
v2 = (( com.google.ads.AdSize ) v0 ).isCustomAdSize ( ); // invoke-virtual {v0}, Lcom/google/ads/AdSize;->isCustomAdSize()Z
/* if-nez v2, :cond_c */
/* .line 836 */
final String v2 = "format"; // const-string v2, "format"
(( com.google.ads.AdSize ) v0 ).toString ( ); // invoke-virtual {v0}, Lcom/google/ads/AdSize;->toString()Ljava/lang/String;
/* goto/16 :goto_0 */
/* .line 838 */
} // :cond_c
/* new-instance v2, Ljava/util/HashMap; */
/* invoke-direct {v2}, Ljava/util/HashMap;-><init>()V */
/* .line 839 */
final String v3 = "w"; // const-string v3, "w"
v4 = (( com.google.ads.AdSize ) v0 ).getWidth ( ); // invoke-virtual {v0}, Lcom/google/ads/AdSize;->getWidth()I
java.lang.Integer .valueOf ( v4 );
/* .line 840 */
final String v3 = "h"; // const-string v3, "h"
v0 = (( com.google.ads.AdSize ) v0 ).getHeight ( ); // invoke-virtual {v0}, Lcom/google/ads/AdSize;->getHeight()I
java.lang.Integer .valueOf ( v0 );
/* .line 841 */
final String v0 = "ad_frame"; // const-string v0, "ad_frame"
/* goto/16 :goto_0 */
/* .line 859 */
/* :catch_0 */
/* move-exception v0 */
/* .line 860 */
/* new-instance v0, Lcom/google/ads/internal/c$b; */
final String v1 = "NameNotFoundException"; // const-string v1, "NameNotFoundException"
/* invoke-direct {v0, p0, v1}, Lcom/google/ads/internal/c$b;-><init>(Lcom/google/ads/internal/c;Ljava/lang/String;)V */
/* throw v0 */
/* .line 885 */
} // :cond_d
final String v2 = "net"; // const-string v2, "net"
/* .line 889 */
com.google.ads.util.AdUtil .e ( v1 );
/* .line 890 */
if ( v0 != null) { // if-eqz v0, :cond_e
v2 = (( java.lang.String ) v0 ).length ( ); // invoke-virtual {v0}, Ljava/lang/String;->length()I
if ( v2 != null) { // if-eqz v2, :cond_e
/* .line 891 */
final String v2 = "cap"; // const-string v2, "cap"
/* .line 895 */
} // :cond_e
final String v0 = "u_audio"; // const-string v0, "u_audio"
com.google.ads.util.AdUtil .g ( v1 );
v2 = (( com.google.ads.util.AdUtil$a ) v2 ).ordinal ( ); // invoke-virtual {v2}, Lcom/google/ads/util/AdUtil$a;->ordinal()I
java.lang.Integer .valueOf ( v2 );
/* .line 898 */
com.google.ads.util.AdUtil .a ( p2 );
/* .line 901 */
final String v2 = "u_sd"; // const-string v2, "u_sd"
/* iget v3, v0, Landroid/util/DisplayMetrics;->density:F */
java.lang.Float .valueOf ( v3 );
/* .line 904 */
final String v2 = "u_h"; // const-string v2, "u_h"
v3 = com.google.ads.util.AdUtil .a ( v1,v0 );
java.lang.Integer .valueOf ( v3 );
/* .line 908 */
final String v2 = "u_w"; // const-string v2, "u_w"
v0 = com.google.ads.util.AdUtil .b ( v1,v0 );
java.lang.Integer .valueOf ( v0 );
/* .line 912 */
final String v0 = "hl"; // const-string v0, "hl"
java.util.Locale .getDefault ( );
(( java.util.Locale ) v2 ).getLanguage ( ); // invoke-virtual {v2}, Ljava/util/Locale;->getLanguage()Ljava/lang/String;
/* .line 915 */
final String v0 = "phone"; // const-string v0, "phone"
(( android.content.Context ) v1 ).getSystemService ( v0 ); // invoke-virtual {v1, v0}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;
/* check-cast v0, Landroid/telephony/TelephonyManager; */
/* .line 918 */
final String v1 = "carrier"; // const-string v1, "carrier"
(( android.telephony.TelephonyManager ) v0 ).getNetworkOperator ( ); // invoke-virtual {v0}, Landroid/telephony/TelephonyManager;->getNetworkOperator()Ljava/lang/String;
/* .line 922 */
v0 = com.google.ads.util.AdUtil .c ( );
if ( v0 != null) { // if-eqz v0, :cond_f
/* .line 923 */
final String v0 = "simulator"; // const-string v0, "simulator"
int v1 = 1; // const/4 v1, 0x1
java.lang.Integer .valueOf ( v1 );
/* .line 928 */
} // :cond_f
final String v0 = "session_id"; // const-string v0, "session_id"
com.google.ads.b .a ( );
(( com.google.ads.b ) v1 ).b ( ); // invoke-virtual {v1}, Lcom/google/ads/b;->b()Ljava/math/BigInteger;
(( java.math.BigInteger ) v1 ).toString ( ); // invoke-virtual {v1}, Ljava/math/BigInteger;->toString()Ljava/lang/String;
/* .line 936 */
final String v0 = "seq_num"; // const-string v0, "seq_num"
com.google.ads.b .a ( );
(( com.google.ads.b ) v1 ).c ( ); // invoke-virtual {v1}, Lcom/google/ads/b;->c()Ljava/math/BigInteger;
(( java.math.BigInteger ) v1 ).toString ( ); // invoke-virtual {v1}, Ljava/math/BigInteger;->toString()Ljava/lang/String;
/* .line 940 */
com.google.ads.util.AdUtil .a ( p1 );
/* .line 943 */
v0 = this.g;
(( com.google.ads.internal.d ) v0 ).g ( ); // invoke-virtual {v0}, Lcom/google/ads/internal/d;->g()Lcom/google/ads/m;
v0 = this.a;
(( com.google.ads.util.i$b ) v0 ).a ( ); // invoke-virtual {v0}, Lcom/google/ads/util/i$b;->a()Ljava/lang/Object;
/* check-cast v0, Lcom/google/ads/l; */
v0 = this.a;
(( com.google.ads.util.i$b ) v0 ).a ( ); // invoke-virtual {v0}, Lcom/google/ads/util/i$b;->a()Ljava/lang/Object;
/* check-cast v0, Lcom/google/ads/l$a; */
/* .line 947 */
v0 = this.l;
(( com.google.ads.util.i$c ) v0 ).a ( ); // invoke-virtual {v0}, Lcom/google/ads/util/i$c;->a()Ljava/lang/Object;
/* check-cast v0, Ljava/lang/Boolean; */
v0 = (( java.lang.Boolean ) v0 ).booleanValue ( ); // invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z
if ( v0 != null) { // if-eqz v0, :cond_10
/* new-instance v0, Ljava/lang/StringBuilder; */
/* invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V */
/* invoke-direct {p0}, Lcom/google/ads/internal/c;->d()Ljava/lang/String; */
(( java.lang.StringBuilder ) v0 ).append ( v2 ); // invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
final String v2 = "AFMA_buildAdURL"; // const-string v2, "AFMA_buildAdURL"
(( java.lang.StringBuilder ) v0 ).append ( v2 ); // invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
final String v2 = "("; // const-string v2, "("
(( java.lang.StringBuilder ) v0 ).append ( v2 ); // invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v0 ).append ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
final String v1 = ");"; // const-string v1, ");"
(( java.lang.StringBuilder ) v0 ).append ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
final String v1 = "</script></head><body></body></html>"; // const-string v1, "</script></head><body></body></html>"
(( java.lang.StringBuilder ) v0 ).append ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v0 ).toString ( ); // invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
/* .line 953 */
} // :goto_1
/* new-instance v1, Ljava/lang/StringBuilder; */
/* invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V */
final String v2 = "adRequestUrlHtml: "; // const-string v2, "adRequestUrlHtml: "
(( java.lang.StringBuilder ) v1 ).append ( v2 ); // invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v1 ).append ( v0 ); // invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v1 ).toString ( ); // invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
com.google.ads.util.b .c ( v1 );
/* .line 955 */
/* .line 947 */
} // :cond_10
/* new-instance v0, Ljava/lang/StringBuilder; */
/* invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V */
/* invoke-direct {p0}, Lcom/google/ads/internal/c;->d()Ljava/lang/String; */
(( java.lang.StringBuilder ) v0 ).append ( v2 ); // invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
final String v2 = "AFMA_getSdkConstants();"; // const-string v2, "AFMA_getSdkConstants();"
(( java.lang.StringBuilder ) v0 ).append ( v2 ); // invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
final String v2 = "AFMA_buildAdURL"; // const-string v2, "AFMA_buildAdURL"
(( java.lang.StringBuilder ) v0 ).append ( v2 ); // invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
final String v2 = "("; // const-string v2, "("
(( java.lang.StringBuilder ) v0 ).append ( v2 ); // invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v0 ).append ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
final String v1 = ");"; // const-string v1, ");"
(( java.lang.StringBuilder ) v0 ).append ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
final String v1 = "</script></head><body></body></html>"; // const-string v1, "</script></head><body></body></html>"
(( java.lang.StringBuilder ) v0 ).append ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v0 ).toString ( ); // invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
} // .end method
protected void a ( ) {
/* .locals 1 */
/* .prologue */
/* .line 433 */
final String v0 = "AdLoader cancelled."; // const-string v0, "AdLoader cancelled."
com.google.ads.util.b .a ( v0 );
/* .line 436 */
v0 = this.i;
(( android.webkit.WebView ) v0 ).stopLoading ( ); // invoke-virtual {v0}, Landroid/webkit/WebView;->stopLoading()V
/* .line 437 */
v0 = this.i;
(( android.webkit.WebView ) v0 ).destroy ( ); // invoke-virtual {v0}, Landroid/webkit/WebView;->destroy()V
/* .line 440 */
v0 = this.r;
if ( v0 != null) { // if-eqz v0, :cond_0
/* .line 441 */
v0 = this.r;
(( java.lang.Thread ) v0 ).interrupt ( ); // invoke-virtual {v0}, Ljava/lang/Thread;->interrupt()V
/* .line 442 */
int v0 = 0; // const/4 v0, 0x0
this.r = v0;
/* .line 446 */
} // :cond_0
v0 = this.f;
(( com.google.ads.internal.f ) v0 ).a ( ); // invoke-virtual {v0}, Lcom/google/ads/internal/f;->a()V
/* .line 448 */
int v0 = 1; // const/4 v0, 0x1
/* iput-boolean v0, p0, Lcom/google/ads/internal/c;->m:Z */
/* .line 449 */
return;
} // .end method
public synchronized void a ( Integer p0 ) {
/* .locals 1 */
/* .prologue */
/* .line 1104 */
/* monitor-enter p0 */
try { // :try_start_0
/* iput p1, p0, Lcom/google/ads/internal/c;->q:I */
/* :try_end_0 */
/* .catchall {:try_start_0 ..:try_end_0} :catchall_0 */
/* .line 1105 */
/* monitor-exit p0 */
return;
/* .line 1104 */
/* :catchall_0 */
/* move-exception v0 */
/* monitor-exit p0 */
/* throw v0 */
} // .end method
public synchronized void a ( com.google.ads.AdRequest$ErrorCode p0 ) {
/* .locals 1 */
/* .prologue */
/* .line 1073 */
/* monitor-enter p0 */
try { // :try_start_0
this.o = p1;
/* .line 1074 */
(( java.lang.Object ) p0 ).notify ( ); // invoke-virtual {p0}, Ljava/lang/Object;->notify()V
/* :try_end_0 */
/* .catchall {:try_start_0 ..:try_end_0} :catchall_0 */
/* .line 1075 */
/* monitor-exit p0 */
return;
/* .line 1073 */
/* :catchall_0 */
/* move-exception v0 */
/* monitor-exit p0 */
/* throw v0 */
} // .end method
protected void a ( com.google.ads.AdRequest$ErrorCode p0, Boolean p1 ) {
/* .locals 7 */
/* .prologue */
/* .line 970 */
v0 = this.f;
(( com.google.ads.internal.f ) v0 ).a ( ); // invoke-virtual {v0}, Lcom/google/ads/internal/f;->a()V
/* .line 971 */
v6 = this.g;
/* new-instance v0, Lcom/google/ads/internal/c$a; */
v1 = this.g;
v2 = this.i;
v3 = this.f;
/* move-object v4, p1 */
/* move v5, p2 */
/* invoke-direct/range {v0 ..v5}, Lcom/google/ads/internal/c$a;-><init>(Lcom/google/ads/internal/d;Landroid/webkit/WebView;Lcom/google/ads/internal/f;Lcom/google/ads/AdRequest$ErrorCode;Z)V */
(( com.google.ads.internal.d ) v6 ).a ( v0 ); // invoke-virtual {v6, v0}, Lcom/google/ads/internal/d;->a(Ljava/lang/Runnable;)V
/* .line 976 */
return;
} // .end method
protected void a ( com.google.ads.AdRequest p0 ) {
/* .locals 1 */
/* .prologue */
/* .line 457 */
this.h = p1;
/* .line 458 */
int v0 = 0; // const/4 v0, 0x0
/* iput-boolean v0, p0, Lcom/google/ads/internal/c;->m:Z */
/* .line 459 */
/* new-instance v0, Ljava/lang/Thread; */
/* invoke-direct {v0, p0}, Ljava/lang/Thread;-><init>(Ljava/lang/Runnable;)V */
this.r = v0;
/* .line 460 */
v0 = this.r;
(( java.lang.Thread ) v0 ).start ( ); // invoke-virtual {v0}, Ljava/lang/Thread;->start()V
/* .line 461 */
return;
} // .end method
protected synchronized void a ( java.lang.String p0 ) {
/* .locals 1 */
/* .prologue */
/* .line 426 */
/* monitor-enter p0 */
try { // :try_start_0
v0 = this.k;
(( java.util.LinkedList ) v0 ).add ( p1 ); // invoke-virtual {v0, p1}, Ljava/util/LinkedList;->add(Ljava/lang/Object;)Z
/* :try_end_0 */
/* .catchall {:try_start_0 ..:try_end_0} :catchall_0 */
/* .line 427 */
/* monitor-exit p0 */
return;
/* .line 426 */
/* :catchall_0 */
/* move-exception v0 */
/* monitor-exit p0 */
/* throw v0 */
} // .end method
protected synchronized void a ( java.lang.String p0, java.lang.String p1 ) {
/* .locals 1 */
/* .prologue */
/* .line 1031 */
/* monitor-enter p0 */
try { // :try_start_0
this.a = p2;
/* .line 1032 */
this.b = p1;
/* .line 1033 */
(( java.lang.Object ) p0 ).notify ( ); // invoke-virtual {p0}, Ljava/lang/Object;->notify()V
/* :try_end_0 */
/* .catchall {:try_start_0 ..:try_end_0} :catchall_0 */
/* .line 1034 */
/* monitor-exit p0 */
return;
/* .line 1031 */
/* :catchall_0 */
/* move-exception v0 */
/* monitor-exit p0 */
/* throw v0 */
} // .end method
protected synchronized void a ( Boolean p0 ) {
/* .locals 1 */
/* .prologue */
/* .line 1013 */
/* monitor-enter p0 */
try { // :try_start_0
/* iput-boolean p1, p0, Lcom/google/ads/internal/c;->e:Z */
/* :try_end_0 */
/* .catchall {:try_start_0 ..:try_end_0} :catchall_0 */
/* .line 1014 */
/* monitor-exit p0 */
return;
/* .line 1013 */
/* :catchall_0 */
/* move-exception v0 */
/* monitor-exit p0 */
/* throw v0 */
} // .end method
protected void b ( ) {
/* .locals 4 */
/* .prologue */
int v3 = 0; // const/4 v3, 0x0
/* .line 658 */
try { // :try_start_0
v0 = this.d;
v0 = android.text.TextUtils .isEmpty ( v0 );
if ( v0 != null) { // if-eqz v0, :cond_0
/* .line 659 */
final String v0 = "Got a mediation response with no content type.Aborting mediation."; // const-string v0, "Got a mediation response with no content type.Aborting mediation."
com.google.ads.util.b .b ( v0 );
/* .line 660 */
v0 = com.google.ads.AdRequest$ErrorCode.INTERNAL_ERROR;
int v1 = 0; // const/4 v1, 0x0
(( com.google.ads.internal.c ) p0 ).a ( v0, v1 ); // invoke-virtual {p0, v0, v1}, Lcom/google/ads/internal/c;->a(Lcom/google/ads/AdRequest$ErrorCode;Z)V
/* .line 685 */
} // :goto_0
return;
/* .line 663 */
} // :cond_0
v0 = this.d;
final String v1 = "application/json"; // const-string v1, "application/json"
v0 = (( java.lang.String ) v0 ).startsWith ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z
/* if-nez v0, :cond_1 */
/* .line 664 */
/* new-instance v0, Ljava/lang/StringBuilder; */
/* invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V */
final String v1 = "Got a mediation response with a content type: \'"; // const-string v1, "Got a mediation response with a content type: \'"
(( java.lang.StringBuilder ) v0 ).append ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
v1 = this.d;
(( java.lang.StringBuilder ) v0 ).append ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
final String v1 = "\'.Expected something starting with \'application/json\'.Aborting mediation."; // const-string v1, "\'.Expected something starting with \'application/json\'.Aborting mediation."
(( java.lang.StringBuilder ) v0 ).append ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v0 ).toString ( ); // invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
com.google.ads.util.b .b ( v0 );
/* .line 666 */
v0 = com.google.ads.AdRequest$ErrorCode.INTERNAL_ERROR;
int v1 = 0; // const/4 v1, 0x0
(( com.google.ads.internal.c ) p0 ).a ( v0, v1 ); // invoke-virtual {p0, v0, v1}, Lcom/google/ads/internal/c;->a(Lcom/google/ads/AdRequest$ErrorCode;Z)V
/* :try_end_0 */
/* .catch Lorg/json/JSONException; {:try_start_0 ..:try_end_0} :catch_0 */
/* .line 681 */
/* :catch_0 */
/* move-exception v0 */
/* .line 682 */
final String v1 = "AdLoader can\'t parse gWhirl server configuration."; // const-string v1, "AdLoader can\'t parse gWhirl server configuration."
com.google.ads.util.b .b ( v1,v0 );
/* .line 683 */
v0 = com.google.ads.AdRequest$ErrorCode.INTERNAL_ERROR;
(( com.google.ads.internal.c ) p0 ).a ( v0, v3 ); // invoke-virtual {p0, v0, v3}, Lcom/google/ads/internal/c;->a(Lcom/google/ads/AdRequest$ErrorCode;Z)V
/* .line 669 */
} // :cond_1
try { // :try_start_1
v0 = this.b;
com.google.ads.c .a ( v0 );
/* .line 671 */
v1 = this.c;
v2 = this.g;
(( com.google.ads.internal.d ) v2 ).h ( ); // invoke-virtual {v2}, Lcom/google/ads/internal/d;->h()Lcom/google/ads/d;
com.google.ads.internal.c .a ( v1,v0,v2 );
/* .line 675 */
v1 = this.g;
/* new-instance v2, Lcom/google/ads/internal/c$1; */
/* invoke-direct {v2, p0, v0}, Lcom/google/ads/internal/c$1;-><init>(Lcom/google/ads/internal/c;Lcom/google/ads/c;)V */
(( com.google.ads.internal.d ) v1 ).a ( v2 ); // invoke-virtual {v1, v2}, Lcom/google/ads/internal/d;->a(Ljava/lang/Runnable;)V
/* :try_end_1 */
/* .catch Lorg/json/JSONException; {:try_start_1 ..:try_end_1} :catch_0 */
} // .end method
protected synchronized void b ( java.lang.String p0 ) {
/* .locals 1 */
/* .prologue */
/* .line 1017 */
/* monitor-enter p0 */
try { // :try_start_0
this.d = p1;
/* :try_end_0 */
/* .catchall {:try_start_0 ..:try_end_0} :catchall_0 */
/* .line 1018 */
/* monitor-exit p0 */
return;
/* .line 1017 */
/* :catchall_0 */
/* move-exception v0 */
/* monitor-exit p0 */
/* throw v0 */
} // .end method
public synchronized void b ( Boolean p0 ) {
/* .locals 1 */
/* .prologue */
/* .line 1094 */
/* monitor-enter p0 */
try { // :try_start_0
/* iput-boolean p1, p0, Lcom/google/ads/internal/c;->n:Z */
/* :try_end_0 */
/* .catchall {:try_start_0 ..:try_end_0} :catchall_0 */
/* .line 1095 */
/* monitor-exit p0 */
return;
/* .line 1094 */
/* :catchall_0 */
/* move-exception v0 */
/* monitor-exit p0 */
/* throw v0 */
} // .end method
protected synchronized void c ( ) {
/* .locals 1 */
/* .prologue */
/* .line 1086 */
/* monitor-enter p0 */
int v0 = 1; // const/4 v0, 0x1
try { // :try_start_0
/* iput-boolean v0, p0, Lcom/google/ads/internal/c;->p:Z */
/* .line 1087 */
(( java.lang.Object ) p0 ).notify ( ); // invoke-virtual {p0}, Ljava/lang/Object;->notify()V
/* :try_end_0 */
/* .catchall {:try_start_0 ..:try_end_0} :catchall_0 */
/* .line 1088 */
/* monitor-exit p0 */
return;
/* .line 1086 */
/* :catchall_0 */
/* move-exception v0 */
/* monitor-exit p0 */
/* throw v0 */
} // .end method
protected synchronized void c ( java.lang.String p0 ) {
/* .locals 1 */
/* .prologue */
/* .line 1042 */
/* monitor-enter p0 */
try { // :try_start_0
this.c = p1;
/* :try_end_0 */
/* .catchall {:try_start_0 ..:try_end_0} :catchall_0 */
/* .line 1043 */
/* monitor-exit p0 */
return;
/* .line 1042 */
/* :catchall_0 */
/* move-exception v0 */
/* monitor-exit p0 */
/* throw v0 */
} // .end method
public void c ( Boolean p0 ) {
/* .locals 0 */
/* .prologue */
/* .line 1114 */
/* iput-boolean p1, p0, Lcom/google/ads/internal/c;->s:Z */
/* .line 1115 */
return;
} // .end method
public synchronized void d ( java.lang.String p0 ) {
/* .locals 1 */
/* .prologue */
/* .line 1054 */
/* monitor-enter p0 */
try { // :try_start_0
this.j = p1;
/* .line 1055 */
(( java.lang.Object ) p0 ).notify ( ); // invoke-virtual {p0}, Ljava/lang/Object;->notify()V
/* :try_end_0 */
/* .catchall {:try_start_0 ..:try_end_0} :catchall_0 */
/* .line 1056 */
/* monitor-exit p0 */
return;
/* .line 1054 */
/* :catchall_0 */
/* move-exception v0 */
/* monitor-exit p0 */
/* throw v0 */
} // .end method
public void e ( java.lang.String p0 ) {
/* .locals 0 */
/* .prologue */
/* .line 1062 */
this.l = p1;
/* .line 1063 */
return;
} // .end method
public void run ( ) {
/* .locals 11 */
/* .prologue */
/* const-wide/16 v9, 0x0 */
/* .line 469 */
/* monitor-enter p0 */
/* .line 473 */
try { // :try_start_0
v0 = this.i;
if ( v0 != null) { // if-eqz v0, :cond_0
v0 = this.f;
/* if-nez v0, :cond_1 */
/* .line 474 */
} // :cond_0
final String v0 = "adRequestWebView was null while trying to load an ad."; // const-string v0, "adRequestWebView was null while trying to load an ad."
com.google.ads.util.b .e ( v0 );
/* .line 475 */
v0 = com.google.ads.AdRequest$ErrorCode.INTERNAL_ERROR;
int v1 = 0; // const/4 v1, 0x0
(( com.google.ads.internal.c ) p0 ).a ( v0, v1 ); // invoke-virtual {p0, v0, v1}, Lcom/google/ads/internal/c;->a(Lcom/google/ads/AdRequest$ErrorCode;Z)V
/* :try_end_0 */
/* .catch Ljava/lang/Throwable; {:try_start_0 ..:try_end_0} :catch_0 */
/* .catchall {:try_start_0 ..:try_end_0} :catchall_0 */
/* .line 476 */
try { // :try_start_1
/* monitor-exit p0 */
/* :try_end_1 */
/* .catchall {:try_start_1 ..:try_end_1} :catchall_0 */
/* .line 653 */
} // :goto_0
return;
/* .line 480 */
} // :cond_1
try { // :try_start_2
v0 = this.g;
(( com.google.ads.internal.d ) v0 ).g ( ); // invoke-virtual {v0}, Lcom/google/ads/internal/d;->g()Lcom/google/ads/m;
v0 = this.c;
(( com.google.ads.util.i$d ) v0 ).a ( ); // invoke-virtual {v0}, Lcom/google/ads/util/i$d;->a()Ljava/lang/Object;
/* check-cast v0, Landroid/app/Activity; */
/* .line 481 */
/* if-nez v0, :cond_2 */
/* .line 482 */
final String v0 = "activity was null while forming an ad request."; // const-string v0, "activity was null while forming an ad request."
com.google.ads.util.b .e ( v0 );
/* .line 483 */
v0 = com.google.ads.AdRequest$ErrorCode.INTERNAL_ERROR;
int v1 = 0; // const/4 v1, 0x0
(( com.google.ads.internal.c ) p0 ).a ( v0, v1 ); // invoke-virtual {p0, v0, v1}, Lcom/google/ads/internal/c;->a(Lcom/google/ads/AdRequest$ErrorCode;Z)V
/* :try_end_2 */
/* .catch Ljava/lang/Throwable; {:try_start_2 ..:try_end_2} :catch_0 */
/* .catchall {:try_start_2 ..:try_end_2} :catchall_0 */
/* .line 484 */
try { // :try_start_3
/* monitor-exit p0 */
/* .line 652 */
/* :catchall_0 */
/* move-exception v0 */
/* monitor-exit p0 */
/* :try_end_3 */
/* .catchall {:try_start_3 ..:try_end_3} :catchall_0 */
/* throw v0 */
/* .line 488 */
} // :cond_2
try { // :try_start_4
v1 = this.g;
(( com.google.ads.internal.d ) v1 ).n ( ); // invoke-virtual {v1}, Lcom/google/ads/internal/d;->n()J
/* move-result-wide v3 */
/* .line 489 */
android.os.SystemClock .elapsedRealtime ( );
/* move-result-wide v5 */
/* .line 493 */
v2 = this.h;
v1 = this.g;
(( com.google.ads.internal.d ) v1 ).g ( ); // invoke-virtual {v1}, Lcom/google/ads/internal/d;->g()Lcom/google/ads/m;
v1 = this.d;
(( com.google.ads.util.i$b ) v1 ).a ( ); // invoke-virtual {v1}, Lcom/google/ads/util/i$b;->a()Ljava/lang/Object;
/* check-cast v1, Landroid/content/Context; */
(( com.google.ads.AdRequest ) v2 ).getRequestMap ( v1 ); // invoke-virtual {v2, v1}, Lcom/google/ads/AdRequest;->getRequestMap(Landroid/content/Context;)Ljava/util/Map;
/* .line 496 */
final String v1 = "extras"; // const-string v1, "extras"
/* .line 498 */
/* instance-of v2, v1, Ljava/util/Map; */
if ( v2 != null) { // if-eqz v2, :cond_5
	 /* .line 499 */
	 /* check-cast v1, Ljava/util/Map; */
	 /* .line 502 */
	 final String v2 = "_adUrl"; // const-string v2, "_adUrl"
	 /* .line 503 */
	 /* instance-of v8, v2, Ljava/lang/String; */
	 if ( v8 != null) { // if-eqz v8, :cond_3
		 /* .line 504 */
		 /* check-cast v2, Ljava/lang/String; */
		 this.a = v2;
		 /* .line 508 */
	 } // :cond_3
	 final String v2 = "_orientation"; // const-string v2, "_orientation"
	 /* .line 509 */
	 /* instance-of v8, v2, Ljava/lang/String; */
	 if ( v8 != null) { // if-eqz v8, :cond_4
		 /* .line 510 */
		 final String v8 = "p"; // const-string v8, "p"
		 v8 = 		 (( java.lang.Object ) v2 ).equals ( v8 ); // invoke-virtual {v2, v8}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z
		 if ( v8 != null) { // if-eqz v8, :cond_7
			 /* .line 511 */
			 int v2 = 1; // const/4 v2, 0x1
			 /* iput v2, p0, Lcom/google/ads/internal/c;->q:I */
			 /* .line 518 */
		 } // :cond_4
	 } // :goto_1
	 final String v2 = "_norefresh"; // const-string v2, "_norefresh"
	 /* .line 519 */
	 /* instance-of v2, v1, Ljava/lang/String; */
	 if ( v2 != null) { // if-eqz v2, :cond_5
		 /* .line 520 */
		 final String v2 = "t"; // const-string v2, "t"
		 v1 = 		 (( java.lang.Object ) v1 ).equals ( v2 ); // invoke-virtual {v1, v2}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z
		 if ( v1 != null) { // if-eqz v1, :cond_5
			 /* .line 521 */
			 v1 = this.g;
			 (( com.google.ads.internal.d ) v1 ).d ( ); // invoke-virtual {v1}, Lcom/google/ads/internal/d;->d()V
			 /* .line 528 */
		 } // :cond_5
		 v1 = this.a;
		 /* :try_end_4 */
		 /* .catch Ljava/lang/Throwable; {:try_start_4 ..:try_end_4} :catch_0 */
		 /* .catchall {:try_start_4 ..:try_end_4} :catchall_0 */
		 /* if-nez v1, :cond_e */
		 /* .line 531 */
		 try { // :try_start_5
			 (( com.google.ads.internal.c ) p0 ).a ( v7, v0 ); // invoke-virtual {p0, v7, v0}, Lcom/google/ads/internal/c;->a(Ljava/util/Map;Landroid/app/Activity;)Ljava/lang/String;
			 /* :try_end_5 */
			 /* .catch Lcom/google/ads/internal/c$d; {:try_start_5 ..:try_end_5} :catch_1 */
			 /* .catch Lcom/google/ads/internal/c$b; {:try_start_5 ..:try_end_5} :catch_2 */
			 /* .catch Ljava/lang/Throwable; {:try_start_5 ..:try_end_5} :catch_0 */
			 /* .catchall {:try_start_5 ..:try_end_5} :catchall_0 */
			 /* .line 541 */
			 try { // :try_start_6
				 /* invoke-direct {p0, v0}, Lcom/google/ads/internal/c;->f(Ljava/lang/String;)V */
				 /* .line 544 */
				 android.os.SystemClock .elapsedRealtime ( );
				 /* :try_end_6 */
				 /* .catch Ljava/lang/Throwable; {:try_start_6 ..:try_end_6} :catch_0 */
				 /* .catchall {:try_start_6 ..:try_end_6} :catchall_0 */
				 /* move-result-wide v0 */
				 /* sub-long/2addr v0, v5 */
				 /* sub-long v0, v3, v0 */
				 /* .line 546 */
				 /* cmp-long v2, v0, v9 */
				 /* if-lez v2, :cond_6 */
				 /* .line 547 */
				 try { // :try_start_7
					 (( java.lang.Object ) p0 ).wait ( v0, v1 ); // invoke-virtual {p0, v0, v1}, Ljava/lang/Object;->wait(J)V
					 /* :try_end_7 */
					 /* .catch Ljava/lang/InterruptedException; {:try_start_7 ..:try_end_7} :catch_3 */
					 /* .catch Ljava/lang/Throwable; {:try_start_7 ..:try_end_7} :catch_0 */
					 /* .catchall {:try_start_7 ..:try_end_7} :catchall_0 */
					 /* .line 557 */
				 } // :cond_6
				 try { // :try_start_8
					 /* iget-boolean v0, p0, Lcom/google/ads/internal/c;->m:Z */
					 /* :try_end_8 */
					 /* .catch Ljava/lang/Throwable; {:try_start_8 ..:try_end_8} :catch_0 */
					 /* .catchall {:try_start_8 ..:try_end_8} :catchall_0 */
					 if ( v0 != null) { // if-eqz v0, :cond_8
						 /* .line 558 */
						 try { // :try_start_9
							 /* monitor-exit p0 */
							 /* :try_end_9 */
							 /* .catchall {:try_start_9 ..:try_end_9} :catchall_0 */
							 /* goto/16 :goto_0 */
							 /* .line 512 */
						 } // :cond_7
						 try { // :try_start_a
							 final String v8 = "l"; // const-string v8, "l"
							 v2 = 							 (( java.lang.Object ) v2 ).equals ( v8 ); // invoke-virtual {v2, v8}, Ljava/lang/Object;->equals(Ljava/lang/Object;)Z
							 if ( v2 != null) { // if-eqz v2, :cond_4
								 /* .line 513 */
								 int v2 = 0; // const/4 v2, 0x0
								 /* iput v2, p0, Lcom/google/ads/internal/c;->q:I */
								 /* :try_end_a */
								 /* .catch Ljava/lang/Throwable; {:try_start_a ..:try_end_a} :catch_0 */
								 /* .catchall {:try_start_a ..:try_end_a} :catchall_0 */
								 /* .line 647 */
								 /* :catch_0 */
								 /* move-exception v0 */
								 /* .line 649 */
								 try { // :try_start_b
									 final String v1 = "An unknown error occurred in AdLoader."; // const-string v1, "An unknown error occurred in AdLoader."
									 com.google.ads.util.b .b ( v1,v0 );
									 /* .line 650 */
									 v0 = com.google.ads.AdRequest$ErrorCode.INTERNAL_ERROR;
									 int v1 = 1; // const/4 v1, 0x1
									 (( com.google.ads.internal.c ) p0 ).a ( v0, v1 ); // invoke-virtual {p0, v0, v1}, Lcom/google/ads/internal/c;->a(Lcom/google/ads/AdRequest$ErrorCode;Z)V
									 /* .line 652 */
								 } // :goto_2
								 /* monitor-exit p0 */
								 /* :try_end_b */
								 /* .catchall {:try_start_b ..:try_end_b} :catchall_0 */
								 /* goto/16 :goto_0 */
								 /* .line 532 */
								 /* :catch_1 */
								 /* move-exception v0 */
								 /* .line 533 */
								 try { // :try_start_c
									 /* new-instance v1, Ljava/lang/StringBuilder; */
									 /* invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V */
									 final String v2 = "Unable to connect to network: "; // const-string v2, "Unable to connect to network: "
									 (( java.lang.StringBuilder ) v1 ).append ( v2 ); // invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
									 (( java.lang.StringBuilder ) v1 ).append ( v0 ); // invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;
									 (( java.lang.StringBuilder ) v0 ).toString ( ); // invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
									 com.google.ads.util.b .c ( v0 );
									 /* .line 534 */
									 v0 = com.google.ads.AdRequest$ErrorCode.NETWORK_ERROR;
									 int v1 = 0; // const/4 v1, 0x0
									 (( com.google.ads.internal.c ) p0 ).a ( v0, v1 ); // invoke-virtual {p0, v0, v1}, Lcom/google/ads/internal/c;->a(Lcom/google/ads/AdRequest$ErrorCode;Z)V
									 /* :try_end_c */
									 /* .catch Ljava/lang/Throwable; {:try_start_c ..:try_end_c} :catch_0 */
									 /* .catchall {:try_start_c ..:try_end_c} :catchall_0 */
									 /* .line 535 */
									 try { // :try_start_d
										 /* monitor-exit p0 */
										 /* :try_end_d */
										 /* .catchall {:try_start_d ..:try_end_d} :catchall_0 */
										 /* goto/16 :goto_0 */
										 /* .line 536 */
										 /* :catch_2 */
										 /* move-exception v0 */
										 /* .line 537 */
										 try { // :try_start_e
											 /* new-instance v1, Ljava/lang/StringBuilder; */
											 /* invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V */
											 final String v2 = "Caught internal exception: "; // const-string v2, "Caught internal exception: "
											 (( java.lang.StringBuilder ) v1 ).append ( v2 ); // invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
											 (( java.lang.StringBuilder ) v1 ).append ( v0 ); // invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;
											 (( java.lang.StringBuilder ) v0 ).toString ( ); // invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
											 com.google.ads.util.b .c ( v0 );
											 /* .line 538 */
											 v0 = com.google.ads.AdRequest$ErrorCode.INTERNAL_ERROR;
											 int v1 = 0; // const/4 v1, 0x0
											 (( com.google.ads.internal.c ) p0 ).a ( v0, v1 ); // invoke-virtual {p0, v0, v1}, Lcom/google/ads/internal/c;->a(Lcom/google/ads/AdRequest$ErrorCode;Z)V
											 /* :try_end_e */
											 /* .catch Ljava/lang/Throwable; {:try_start_e ..:try_end_e} :catch_0 */
											 /* .catchall {:try_start_e ..:try_end_e} :catchall_0 */
											 /* .line 539 */
											 try { // :try_start_f
												 /* monitor-exit p0 */
												 /* :try_end_f */
												 /* .catchall {:try_start_f ..:try_end_f} :catchall_0 */
												 /* goto/16 :goto_0 */
												 /* .line 549 */
												 /* :catch_3 */
												 /* move-exception v0 */
												 /* .line 551 */
												 try { // :try_start_10
													 /* new-instance v1, Ljava/lang/StringBuilder; */
													 /* invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V */
													 final String v2 = "AdLoader InterruptedException while getting the URL: "; // const-string v2, "AdLoader InterruptedException while getting the URL: "
													 (( java.lang.StringBuilder ) v1 ).append ( v2 ); // invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
													 (( java.lang.StringBuilder ) v1 ).append ( v0 ); // invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;
													 (( java.lang.StringBuilder ) v0 ).toString ( ); // invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
													 com.google.ads.util.b .a ( v0 );
													 /* :try_end_10 */
													 /* .catch Ljava/lang/Throwable; {:try_start_10 ..:try_end_10} :catch_0 */
													 /* .catchall {:try_start_10 ..:try_end_10} :catchall_0 */
													 /* .line 553 */
													 try { // :try_start_11
														 /* monitor-exit p0 */
														 /* :try_end_11 */
														 /* .catchall {:try_start_11 ..:try_end_11} :catchall_0 */
														 /* goto/16 :goto_0 */
														 /* .line 559 */
													 } // :cond_8
													 try { // :try_start_12
														 v0 = this.o;
														 if ( v0 != null) { // if-eqz v0, :cond_9
															 /* .line 560 */
															 v0 = this.o;
															 int v1 = 0; // const/4 v1, 0x0
															 (( com.google.ads.internal.c ) p0 ).a ( v0, v1 ); // invoke-virtual {p0, v0, v1}, Lcom/google/ads/internal/c;->a(Lcom/google/ads/AdRequest$ErrorCode;Z)V
															 /* :try_end_12 */
															 /* .catch Ljava/lang/Throwable; {:try_start_12 ..:try_end_12} :catch_0 */
															 /* .catchall {:try_start_12 ..:try_end_12} :catchall_0 */
															 /* .line 561 */
															 try { // :try_start_13
																 /* monitor-exit p0 */
																 /* :try_end_13 */
																 /* .catchall {:try_start_13 ..:try_end_13} :catchall_0 */
																 /* goto/16 :goto_0 */
																 /* .line 562 */
															 } // :cond_9
															 try { // :try_start_14
																 v0 = this.j;
																 /* if-nez v0, :cond_a */
																 /* .line 564 */
																 /* new-instance v0, Ljava/lang/StringBuilder; */
																 /* invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V */
																 final String v1 = "AdLoader timed out after "; // const-string v1, "AdLoader timed out after "
																 (( java.lang.StringBuilder ) v0 ).append ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
																 (( java.lang.StringBuilder ) v0 ).append ( v3, v4 ); // invoke-virtual {v0, v3, v4}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;
																 final String v1 = "ms while getting the URL."; // const-string v1, "ms while getting the URL."
																 (( java.lang.StringBuilder ) v0 ).append ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
																 (( java.lang.StringBuilder ) v0 ).toString ( ); // invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
																 com.google.ads.util.b .c ( v0 );
																 /* .line 566 */
																 v0 = com.google.ads.AdRequest$ErrorCode.NETWORK_ERROR;
																 int v1 = 0; // const/4 v1, 0x0
																 (( com.google.ads.internal.c ) p0 ).a ( v0, v1 ); // invoke-virtual {p0, v0, v1}, Lcom/google/ads/internal/c;->a(Lcom/google/ads/AdRequest$ErrorCode;Z)V
																 /* :try_end_14 */
																 /* .catch Ljava/lang/Throwable; {:try_start_14 ..:try_end_14} :catch_0 */
																 /* .catchall {:try_start_14 ..:try_end_14} :catchall_0 */
																 /* .line 567 */
																 try { // :try_start_15
																	 /* monitor-exit p0 */
																	 /* :try_end_15 */
																	 /* .catchall {:try_start_15 ..:try_end_15} :catchall_0 */
																	 /* goto/16 :goto_0 */
																	 /* .line 571 */
																 } // :cond_a
																 try { // :try_start_16
																	 v0 = this.f;
																	 /* iget-boolean v1, p0, Lcom/google/ads/internal/c;->s:Z */
																	 (( com.google.ads.internal.f ) v0 ).a ( v1 ); // invoke-virtual {v0, v1}, Lcom/google/ads/internal/f;->a(Z)V
																	 /* .line 574 */
																	 v0 = this.f;
																	 v1 = this.j;
																	 (( com.google.ads.internal.f ) v0 ).a ( v1 ); // invoke-virtual {v0, v1}, Lcom/google/ads/internal/f;->a(Ljava/lang/String;)V
																	 /* .line 577 */
																	 android.os.SystemClock .elapsedRealtime ( );
																	 /* :try_end_16 */
																	 /* .catch Ljava/lang/Throwable; {:try_start_16 ..:try_end_16} :catch_0 */
																	 /* .catchall {:try_start_16 ..:try_end_16} :catchall_0 */
																	 /* move-result-wide v0 */
																	 /* sub-long/2addr v0, v5 */
																	 /* sub-long v0, v3, v0 */
																	 /* .line 579 */
																	 /* cmp-long v2, v0, v9 */
																	 /* if-lez v2, :cond_b */
																	 /* .line 580 */
																	 try { // :try_start_17
																		 (( java.lang.Object ) p0 ).wait ( v0, v1 ); // invoke-virtual {p0, v0, v1}, Ljava/lang/Object;->wait(J)V
																		 /* :try_end_17 */
																		 /* .catch Ljava/lang/InterruptedException; {:try_start_17 ..:try_end_17} :catch_4 */
																		 /* .catch Ljava/lang/Throwable; {:try_start_17 ..:try_end_17} :catch_0 */
																		 /* .catchall {:try_start_17 ..:try_end_17} :catchall_0 */
																		 /* .line 590 */
																	 } // :cond_b
																	 try { // :try_start_18
																		 /* iget-boolean v0, p0, Lcom/google/ads/internal/c;->m:Z */
																		 /* :try_end_18 */
																		 /* .catch Ljava/lang/Throwable; {:try_start_18 ..:try_end_18} :catch_0 */
																		 /* .catchall {:try_start_18 ..:try_end_18} :catchall_0 */
																		 if ( v0 != null) { // if-eqz v0, :cond_c
																			 /* .line 591 */
																			 try { // :try_start_19
																				 /* monitor-exit p0 */
																				 /* :try_end_19 */
																				 /* .catchall {:try_start_19 ..:try_end_19} :catchall_0 */
																				 /* goto/16 :goto_0 */
																				 /* .line 582 */
																				 /* :catch_4 */
																				 /* move-exception v0 */
																				 /* .line 584 */
																				 try { // :try_start_1a
																					 /* new-instance v1, Ljava/lang/StringBuilder; */
																					 /* invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V */
																					 final String v2 = "AdLoader InterruptedException while getting the ad server\'s response: "; // const-string v2, "AdLoader InterruptedException while getting the ad server\'s response: "
																					 (( java.lang.StringBuilder ) v1 ).append ( v2 ); // invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
																					 (( java.lang.StringBuilder ) v1 ).append ( v0 ); // invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;
																					 (( java.lang.StringBuilder ) v0 ).toString ( ); // invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
																					 com.google.ads.util.b .a ( v0 );
																					 /* :try_end_1a */
																					 /* .catch Ljava/lang/Throwable; {:try_start_1a ..:try_end_1a} :catch_0 */
																					 /* .catchall {:try_start_1a ..:try_end_1a} :catchall_0 */
																					 /* .line 586 */
																					 try { // :try_start_1b
																						 /* monitor-exit p0 */
																						 /* :try_end_1b */
																						 /* .catchall {:try_start_1b ..:try_end_1b} :catchall_0 */
																						 /* goto/16 :goto_0 */
																						 /* .line 592 */
																					 } // :cond_c
																					 try { // :try_start_1c
																						 v0 = this.o;
																						 if ( v0 != null) { // if-eqz v0, :cond_d
																							 /* .line 593 */
																							 v0 = this.o;
																							 int v1 = 0; // const/4 v1, 0x0
																							 (( com.google.ads.internal.c ) p0 ).a ( v0, v1 ); // invoke-virtual {p0, v0, v1}, Lcom/google/ads/internal/c;->a(Lcom/google/ads/AdRequest$ErrorCode;Z)V
																							 /* :try_end_1c */
																							 /* .catch Ljava/lang/Throwable; {:try_start_1c ..:try_end_1c} :catch_0 */
																							 /* .catchall {:try_start_1c ..:try_end_1c} :catchall_0 */
																							 /* .line 594 */
																							 try { // :try_start_1d
																								 /* monitor-exit p0 */
																								 /* :try_end_1d */
																								 /* .catchall {:try_start_1d ..:try_end_1d} :catchall_0 */
																								 /* goto/16 :goto_0 */
																								 /* .line 595 */
																							 } // :cond_d
																							 try { // :try_start_1e
																								 v0 = this.b;
																								 /* if-nez v0, :cond_e */
																								 /* .line 597 */
																								 /* new-instance v0, Ljava/lang/StringBuilder; */
																								 /* invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V */
																								 final String v1 = "AdLoader timed out after "; // const-string v1, "AdLoader timed out after "
																								 (( java.lang.StringBuilder ) v0 ).append ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
																								 (( java.lang.StringBuilder ) v0 ).append ( v3, v4 ); // invoke-virtual {v0, v3, v4}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;
																								 final String v1 = "ms while waiting for the ad server\'s response."; // const-string v1, "ms while waiting for the ad server\'s response."
																								 (( java.lang.StringBuilder ) v0 ).append ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
																								 (( java.lang.StringBuilder ) v0 ).toString ( ); // invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
																								 com.google.ads.util.b .c ( v0 );
																								 /* .line 599 */
																								 v0 = com.google.ads.AdRequest$ErrorCode.NETWORK_ERROR;
																								 int v1 = 0; // const/4 v1, 0x0
																								 (( com.google.ads.internal.c ) p0 ).a ( v0, v1 ); // invoke-virtual {p0, v0, v1}, Lcom/google/ads/internal/c;->a(Lcom/google/ads/AdRequest$ErrorCode;Z)V
																								 /* :try_end_1e */
																								 /* .catch Ljava/lang/Throwable; {:try_start_1e ..:try_end_1e} :catch_0 */
																								 /* .catchall {:try_start_1e ..:try_end_1e} :catchall_0 */
																								 /* .line 600 */
																								 try { // :try_start_1f
																									 /* monitor-exit p0 */
																									 /* :try_end_1f */
																									 /* .catchall {:try_start_1f ..:try_end_1f} :catchall_0 */
																									 /* goto/16 :goto_0 */
																									 /* .line 604 */
																								 } // :cond_e
																								 try { // :try_start_20
																									 /* iget-boolean v0, p0, Lcom/google/ads/internal/c;->e:Z */
																									 if ( v0 != null) { // if-eqz v0, :cond_f
																										 /* .line 607 */
																										 v0 = this.g;
																										 int v1 = 1; // const/4 v1, 0x1
																										 (( com.google.ads.internal.d ) v0 ).b ( v1 ); // invoke-virtual {v0, v1}, Lcom/google/ads/internal/d;->b(Z)V
																										 /* .line 608 */
																										 (( com.google.ads.internal.c ) p0 ).b ( ); // invoke-virtual {p0}, Lcom/google/ads/internal/c;->b()V
																										 /* :try_end_20 */
																										 /* .catch Ljava/lang/Throwable; {:try_start_20 ..:try_end_20} :catch_0 */
																										 /* .catchall {:try_start_20 ..:try_end_20} :catchall_0 */
																										 /* .line 609 */
																										 try { // :try_start_21
																											 /* monitor-exit p0 */
																											 /* :try_end_21 */
																											 /* .catchall {:try_start_21 ..:try_end_21} :catchall_0 */
																											 /* goto/16 :goto_0 */
																											 /* .line 613 */
																										 } // :cond_f
																										 try { // :try_start_22
																											 v0 = this.d;
																											 if ( v0 != null) { // if-eqz v0, :cond_11
																												 v0 = this.d;
																												 final String v1 = "application/json"; // const-string v1, "application/json"
																												 v0 = 																												 (( java.lang.String ) v0 ).startsWith ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z
																												 /* if-nez v0, :cond_10 */
																												 v0 = this.d;
																												 final String v1 = "text/javascript"; // const-string v1, "text/javascript"
																												 v0 = 																												 (( java.lang.String ) v0 ).startsWith ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z
																												 if ( v0 != null) { // if-eqz v0, :cond_11
																													 /* .line 616 */
																												 } // :cond_10
																												 /* new-instance v0, Ljava/lang/StringBuilder; */
																												 /* invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V */
																												 final String v1 = "Expected HTML but received "; // const-string v1, "Expected HTML but received "
																												 (( java.lang.StringBuilder ) v0 ).append ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
																												 v1 = this.d;
																												 (( java.lang.StringBuilder ) v0 ).append ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
																												 final String v1 = "."; // const-string v1, "."
																												 (( java.lang.StringBuilder ) v0 ).append ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
																												 (( java.lang.StringBuilder ) v0 ).toString ( ); // invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
																												 com.google.ads.util.b .b ( v0 );
																												 /* .line 617 */
																												 v0 = com.google.ads.AdRequest$ErrorCode.INTERNAL_ERROR;
																												 int v1 = 0; // const/4 v1, 0x0
																												 (( com.google.ads.internal.c ) p0 ).a ( v0, v1 ); // invoke-virtual {p0, v0, v1}, Lcom/google/ads/internal/c;->a(Lcom/google/ads/AdRequest$ErrorCode;Z)V
																												 /* :try_end_22 */
																												 /* .catch Ljava/lang/Throwable; {:try_start_22 ..:try_end_22} :catch_0 */
																												 /* .catchall {:try_start_22 ..:try_end_22} :catchall_0 */
																												 /* .line 618 */
																												 try { // :try_start_23
																													 /* monitor-exit p0 */
																													 /* :try_end_23 */
																													 /* .catchall {:try_start_23 ..:try_end_23} :catchall_0 */
																													 /* goto/16 :goto_0 */
																													 /* .line 625 */
																												 } // :cond_11
																												 try { // :try_start_24
																													 v0 = this.g;
																													 int v1 = 0; // const/4 v1, 0x0
																													 (( com.google.ads.internal.d ) v0 ).b ( v1 ); // invoke-virtual {v0, v1}, Lcom/google/ads/internal/d;->b(Z)V
																													 /* .line 626 */
																													 /* invoke-direct {p0}, Lcom/google/ads/internal/c;->e()V */
																													 /* .line 629 */
																													 android.os.SystemClock .elapsedRealtime ( );
																													 /* :try_end_24 */
																													 /* .catch Ljava/lang/Throwable; {:try_start_24 ..:try_end_24} :catch_0 */
																													 /* .catchall {:try_start_24 ..:try_end_24} :catchall_0 */
																													 /* move-result-wide v0 */
																													 /* sub-long/2addr v0, v5 */
																													 /* sub-long v0, v3, v0 */
																													 /* .line 631 */
																													 /* cmp-long v2, v0, v9 */
																													 /* if-lez v2, :cond_12 */
																													 /* .line 632 */
																													 try { // :try_start_25
																														 (( java.lang.Object ) p0 ).wait ( v0, v1 ); // invoke-virtual {p0, v0, v1}, Ljava/lang/Object;->wait(J)V
																														 /* :try_end_25 */
																														 /* .catch Ljava/lang/InterruptedException; {:try_start_25 ..:try_end_25} :catch_5 */
																														 /* .catch Ljava/lang/Throwable; {:try_start_25 ..:try_end_25} :catch_0 */
																														 /* .catchall {:try_start_25 ..:try_end_25} :catchall_0 */
																														 /* .line 640 */
																													 } // :cond_12
																													 try { // :try_start_26
																														 /* iget-boolean v0, p0, Lcom/google/ads/internal/c;->p:Z */
																														 if ( v0 != null) { // if-eqz v0, :cond_13
																															 /* .line 641 */
																															 /* invoke-direct {p0}, Lcom/google/ads/internal/c;->f()V */
																															 /* goto/16 :goto_2 */
																															 /* .line 634 */
																															 /* :catch_5 */
																															 /* move-exception v0 */
																															 /* .line 635 */
																															 /* new-instance v1, Ljava/lang/StringBuilder; */
																															 /* invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V */
																															 final String v2 = "AdLoader InterruptedException while loading the HTML: "; // const-string v2, "AdLoader InterruptedException while loading the HTML: "
																															 (( java.lang.StringBuilder ) v1 ).append ( v2 ); // invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
																															 (( java.lang.StringBuilder ) v1 ).append ( v0 ); // invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;
																															 (( java.lang.StringBuilder ) v0 ).toString ( ); // invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
																															 com.google.ads.util.b .a ( v0 );
																															 /* :try_end_26 */
																															 /* .catch Ljava/lang/Throwable; {:try_start_26 ..:try_end_26} :catch_0 */
																															 /* .catchall {:try_start_26 ..:try_end_26} :catchall_0 */
																															 /* .line 636 */
																															 try { // :try_start_27
																																 /* monitor-exit p0 */
																																 /* :try_end_27 */
																																 /* .catchall {:try_start_27 ..:try_end_27} :catchall_0 */
																																 /* goto/16 :goto_0 */
																																 /* .line 643 */
																															 } // :cond_13
																															 try { // :try_start_28
																																 /* new-instance v0, Ljava/lang/StringBuilder; */
																																 /* invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V */
																																 final String v1 = "AdLoader timed out after "; // const-string v1, "AdLoader timed out after "
																																 (( java.lang.StringBuilder ) v0 ).append ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
																																 (( java.lang.StringBuilder ) v0 ).append ( v3, v4 ); // invoke-virtual {v0, v3, v4}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;
																																 final String v1 = "ms while loading the HTML."; // const-string v1, "ms while loading the HTML."
																																 (( java.lang.StringBuilder ) v0 ).append ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
																																 (( java.lang.StringBuilder ) v0 ).toString ( ); // invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
																																 com.google.ads.util.b .c ( v0 );
																																 /* .line 645 */
																																 v0 = com.google.ads.AdRequest$ErrorCode.NETWORK_ERROR;
																																 int v1 = 1; // const/4 v1, 0x1
																																 (( com.google.ads.internal.c ) p0 ).a ( v0, v1 ); // invoke-virtual {p0, v0, v1}, Lcom/google/ads/internal/c;->a(Lcom/google/ads/AdRequest$ErrorCode;Z)V
																																 /* :try_end_28 */
																																 /* .catch Ljava/lang/Throwable; {:try_start_28 ..:try_end_28} :catch_0 */
																																 /* .catchall {:try_start_28 ..:try_end_28} :catchall_0 */
																																 /* goto/16 :goto_2 */
																															 } // .end method
