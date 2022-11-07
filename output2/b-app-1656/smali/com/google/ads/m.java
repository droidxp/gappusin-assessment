public class com.google.ads.m extends com.google.ads.util.i {
	 /* .source "SourceFile" */
	 /* # instance fields */
	 public final com.google.ads.util.i$b a;
	 /* .annotation system Ldalvik/annotation/Signature; */
	 /* value = { */
	 /* "Lcom/google/ads/util/i$b", */
	 /* "<", */
	 /* "Lcom/google/ads/l;", */
	 /* ">;" */
	 /* } */
} // .end annotation
} // .end field
public final com.google.ads.util.i$b b;
/* .annotation system Ldalvik/annotation/Signature; */
/* value = { */
/* "Lcom/google/ads/util/i$b", */
/* "<", */
/* "Ljava/lang/String;", */
/* ">;" */
/* } */
} // .end annotation
} // .end field
public final com.google.ads.util.i$d c;
/* .annotation system Ldalvik/annotation/Signature; */
/* value = { */
/* "Lcom/google/ads/util/i$d", */
/* "<", */
/* "Landroid/app/Activity;", */
/* ">;" */
/* } */
} // .end annotation
} // .end field
public final com.google.ads.util.i$b d;
/* .annotation system Ldalvik/annotation/Signature; */
/* value = { */
/* "Lcom/google/ads/util/i$b", */
/* "<", */
/* "Landroid/content/Context;", */
/* ">;" */
/* } */
} // .end annotation
} // .end field
public final com.google.ads.util.i$b e;
/* .annotation system Ldalvik/annotation/Signature; */
/* value = { */
/* "Lcom/google/ads/util/i$b", */
/* "<", */
/* "Landroid/view/ViewGroup;", */
/* ">;" */
/* } */
} // .end annotation
} // .end field
public final com.google.ads.util.i$b f;
/* .annotation system Ldalvik/annotation/Signature; */
/* value = { */
/* "Lcom/google/ads/util/i$b", */
/* "<", */
/* "Lcom/google/ads/Ad;", */
/* ">;" */
/* } */
} // .end annotation
} // .end field
public final com.google.ads.util.i$b g;
/* .annotation system Ldalvik/annotation/Signature; */
/* value = { */
/* "Lcom/google/ads/util/i$b", */
/* "<", */
/* "Lcom/google/ads/AdView;", */
/* ">;" */
/* } */
} // .end annotation
} // .end field
public final com.google.ads.util.i$b h;
/* .annotation system Ldalvik/annotation/Signature; */
/* value = { */
/* "Lcom/google/ads/util/i$b", */
/* "<", */
/* "Lcom/google/ads/InterstitialAd;", */
/* ">;" */
/* } */
} // .end annotation
} // .end field
public final com.google.ads.util.i$b i;
/* .annotation system Ldalvik/annotation/Signature; */
/* value = { */
/* "Lcom/google/ads/util/i$b", */
/* "<", */
/* "Lcom/google/ads/internal/h;", */
/* ">;" */
/* } */
} // .end annotation
} // .end field
public final com.google.ads.util.i$c j;
/* .annotation system Ldalvik/annotation/Signature; */
/* value = { */
/* "Lcom/google/ads/util/i$c", */
/* "<", */
/* "Lcom/google/ads/AdListener;", */
/* ">;" */
/* } */
} // .end annotation
} // .end field
/* # direct methods */
public com.google.ads.m ( ) {
/* .locals 2 */
/* .prologue */
/* .line 81 */
/* invoke-direct {p0}, Lcom/google/ads/util/i;-><init>()V */
/* .line 63 */
/* new-instance v0, Lcom/google/ads/util/i$c; */
final String v1 = "adListener"; // const-string v1, "adListener"
/* invoke-direct {v0, p0, v1}, Lcom/google/ads/util/i$c;-><init>(Lcom/google/ads/util/i;Ljava/lang/String;)V */
this.j = v0;
/* .line 82 */
/* new-instance v0, Lcom/google/ads/util/i$b; */
final String v1 = "appState"; // const-string v1, "appState"
/* invoke-direct {v0, p0, v1, p1}, Lcom/google/ads/util/i$b;-><init>(Lcom/google/ads/util/i;Ljava/lang/String;Ljava/lang/Object;)V */
this.a = v0;
/* .line 83 */
/* new-instance v0, Lcom/google/ads/util/i$b; */
final String v1 = "ad"; // const-string v1, "ad"
/* invoke-direct {v0, p0, v1, p2}, Lcom/google/ads/util/i$b;-><init>(Lcom/google/ads/util/i;Ljava/lang/String;Ljava/lang/Object;)V */
this.f = v0;
/* .line 84 */
/* new-instance v0, Lcom/google/ads/util/i$b; */
final String v1 = "adView"; // const-string v1, "adView"
/* invoke-direct {v0, p0, v1, p3}, Lcom/google/ads/util/i$b;-><init>(Lcom/google/ads/util/i;Ljava/lang/String;Ljava/lang/Object;)V */
this.g = v0;
/* .line 85 */
/* new-instance v0, Lcom/google/ads/util/i$b; */
final String v1 = "adType"; // const-string v1, "adType"
/* invoke-direct {v0, p0, v1, p9}, Lcom/google/ads/util/i$b;-><init>(Lcom/google/ads/util/i;Ljava/lang/String;Ljava/lang/Object;)V */
this.i = v0;
/* .line 86 */
/* new-instance v0, Lcom/google/ads/util/i$b; */
final String v1 = "adUnitId"; // const-string v1, "adUnitId"
/* invoke-direct {v0, p0, v1, p5}, Lcom/google/ads/util/i$b;-><init>(Lcom/google/ads/util/i;Ljava/lang/String;Ljava/lang/Object;)V */
this.b = v0;
/* .line 87 */
/* new-instance v0, Lcom/google/ads/util/i$d; */
final String v1 = "activity"; // const-string v1, "activity"
/* invoke-direct {v0, p0, v1, p6}, Lcom/google/ads/util/i$d;-><init>(Lcom/google/ads/util/i;Ljava/lang/String;Ljava/lang/Object;)V */
this.c = v0;
/* .line 88 */
/* new-instance v0, Lcom/google/ads/util/i$b; */
final String v1 = "interstitialAd"; // const-string v1, "interstitialAd"
/* invoke-direct {v0, p0, v1, p4}, Lcom/google/ads/util/i$b;-><init>(Lcom/google/ads/util/i;Ljava/lang/String;Ljava/lang/Object;)V */
this.h = v0;
/* .line 89 */
/* new-instance v0, Lcom/google/ads/util/i$b; */
final String v1 = "bannerContainer"; // const-string v1, "bannerContainer"
/* invoke-direct {v0, p0, v1, p8}, Lcom/google/ads/util/i$b;-><init>(Lcom/google/ads/util/i;Ljava/lang/String;Ljava/lang/Object;)V */
this.e = v0;
/* .line 90 */
/* new-instance v0, Lcom/google/ads/util/i$b; */
final String v1 = "applicationContext"; // const-string v1, "applicationContext"
/* invoke-direct {v0, p0, v1, p7}, Lcom/google/ads/util/i$b;-><init>(Lcom/google/ads/util/i;Ljava/lang/String;Ljava/lang/Object;)V */
this.d = v0;
/* .line 92 */
return;
} // .end method
public static com.google.ads.m a ( com.google.ads.Ad p0, java.lang.String p1, android.app.Activity p2, android.view.ViewGroup p3, com.google.ads.AdSize p4 ) {
/* .locals 10 */
/* .prologue */
int v4 = 0; // const/4 v4, 0x0
/* .line 96 */
/* new-instance v0, Lcom/google/ads/m; */
com.google.ads.l .a ( );
/* instance-of v2, p0, Lcom/google/ads/AdView; */
if ( v2 != null) { // if-eqz v2, :cond_1
/* move-object v2, p0 */
/* check-cast v2, Lcom/google/ads/AdView; */
/* move-object v3, v2 */
} // :goto_0
/* instance-of v2, p0, Lcom/google/ads/InterstitialAd; */
if ( v2 != null) { // if-eqz v2, :cond_0
/* move-object v2, p0 */
/* check-cast v2, Lcom/google/ads/InterstitialAd; */
/* move-object v4, v2 */
} // :cond_0
(( java.lang.String ) p1 ).trim ( ); // invoke-virtual {p1}, Ljava/lang/String;->trim()Ljava/lang/String;
(( android.app.Activity ) p2 ).getApplicationContext ( ); // invoke-virtual {p2}, Landroid/app/Activity;->getApplicationContext()Landroid/content/Context;
/* if-nez p4, :cond_2 */
v9 = com.google.ads.internal.h.a;
} // :goto_1
/* move-object v2, p0 */
/* move-object v6, p2 */
/* move-object v8, p3 */
/* invoke-direct/range {v0 ..v9}, Lcom/google/ads/m;-><init>(Lcom/google/ads/l;Lcom/google/ads/Ad;Lcom/google/ads/AdView;Lcom/google/ads/InterstitialAd;Ljava/lang/String;Landroid/app/Activity;Landroid/content/Context;Landroid/view/ViewGroup;Lcom/google/ads/internal/h;)V */
} // :cond_1
/* move-object v3, v4 */
} // :cond_2
(( android.app.Activity ) p2 ).getApplicationContext ( ); // invoke-virtual {p2}, Landroid/app/Activity;->getApplicationContext()Landroid/content/Context;
com.google.ads.internal.h .a ( p4,v2 );
} // .end method
/* # virtual methods */
public Boolean a ( ) {
/* .locals 1 */
/* .prologue */
/* .line 69 */
v0 = (( com.google.ads.m ) p0 ).b ( ); // invoke-virtual {p0}, Lcom/google/ads/m;->b()Z
/* if-nez v0, :cond_0 */
int v0 = 1; // const/4 v0, 0x1
} // :goto_0
} // :cond_0
int v0 = 0; // const/4 v0, 0x0
} // .end method
public Boolean b ( ) {
/* .locals 1 */
/* .prologue */
/* .line 73 */
v0 = this.i;
(( com.google.ads.util.i$b ) v0 ).a ( ); // invoke-virtual {v0}, Lcom/google/ads/util/i$b;->a()Ljava/lang/Object;
/* check-cast v0, Lcom/google/ads/internal/h; */
v0 = (( com.google.ads.internal.h ) v0 ).a ( ); // invoke-virtual {v0}, Lcom/google/ads/internal/h;->a()Z
} // .end method
