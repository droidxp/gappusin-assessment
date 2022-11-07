public class com.admob.android.ads.AdView extends android.widget.RelativeLayout {
	 /* .source "AdView.java" */
	 /* # static fields */
	 static final android.os.Handler a;
	 private static java.lang.Boolean b;
	 private static java.util.Vector r;
	 /* .annotation system Ldalvik/annotation/Signature; */
	 /* value = { */
	 /* "Ljava/util/Vector", */
	 /* "<", */
	 /* "Landroid/view/View;", */
	 /* ">;" */
	 /* } */
} // .end annotation
} // .end field
/* # instance fields */
private com.admob.android.ads.g c;
private Integer d;
private Boolean e;
private com.admob.android.ads.AdView$a f;
private Integer g;
private Integer h;
private Integer i;
private java.lang.String j;
private java.lang.String k;
private com.admob.android.ads.AdListener l;
private Boolean m;
private Boolean n;
private Boolean o;
private Long p;
private com.admob.android.ads.d$a q;
/* # direct methods */
static com.admob.android.ads.AdView ( ) {
/* .locals 1 */
/* .prologue */
/* .line 224 */
/* new-instance v0, Landroid/os/Handler; */
/* invoke-direct {v0}, Landroid/os/Handler;-><init>()V */
/* .line 1615 */
/* new-instance v0, Ljava/util/Vector; */
/* invoke-direct {v0}, Ljava/util/Vector;-><init>()V */
return;
} // .end method
public com.admob.android.ads.AdView ( ) {
/* .locals 2 */
/* .prologue */
/* .line 254 */
int v0 = 0; // const/4 v0, 0x0
int v1 = 0; // const/4 v1, 0x0
/* invoke-direct {p0, p1, v0, v1}, Lcom/admob/android/ads/AdView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V */
/* .line 255 */
return;
} // .end method
public com.admob.android.ads.AdView ( ) {
/* .locals 1 */
/* .prologue */
/* .line 267 */
int v0 = 0; // const/4 v0, 0x0
/* invoke-direct {p0, p1, p2, v0}, Lcom/admob/android/ads/AdView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V */
/* .line 268 */
return;
} // .end method
public com.admob.android.ads.AdView ( ) {
/* .locals 9 */
/* .prologue */
int v1 = 1; // const/4 v1, 0x1
/* const/high16 v3, -0x1000000 */
/* const/16 v7, 0xa */
int v6 = 0; // const/4 v6, 0x0
int v5 = -1; // const/4 v5, -0x1
/* .line 281 */
/* invoke-direct {p0, p1, p2, p3}, Landroid/widget/RelativeLayout;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V */
/* .line 200 */
/* iput-boolean v1, p0, Lcom/admob/android/ads/AdView;->n:Z */
/* .line 284 */
/* const/high16 v0, 0x40000 */
(( com.admob.android.ads.AdView ) p0 ).setDescendantFocusability ( v0 ); // invoke-virtual {p0, v0}, Lcom/admob/android/ads/AdView;->setDescendantFocusability(I)V
/* .line 285 */
(( com.admob.android.ads.AdView ) p0 ).setClickable ( v1 ); // invoke-virtual {p0, v1}, Lcom/admob/android/ads/AdView;->setClickable(Z)V
/* .line 286 */
(( com.admob.android.ads.AdView ) p0 ).setLongClickable ( v6 ); // invoke-virtual {p0, v6}, Lcom/admob/android/ads/AdView;->setLongClickable(Z)V
/* .line 289 */
/* const/16 v0, 0x11 */
(( com.admob.android.ads.AdView ) p0 ).setGravity ( v0 ); // invoke-virtual {p0, v0}, Lcom/admob/android/ads/AdView;->setGravity(I)V
/* .line 296 */
if ( p2 != null) { // if-eqz p2, :cond_5
	 /* .line 298 */
	 /* new-instance v0, Ljava/lang/StringBuilder; */
	 /* invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V */
	 final String v1 = "http://schemas.android.com/apk/res/"; // const-string v1, "http://schemas.android.com/apk/res/"
	 (( java.lang.StringBuilder ) v0 ).append ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
	 (( android.content.Context ) p1 ).getPackageName ( ); // invoke-virtual {p1}, Landroid/content/Context;->getPackageName()Ljava/lang/String;
	 (( java.lang.StringBuilder ) v0 ).append ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
	 (( java.lang.StringBuilder ) v0 ).toString ( ); // invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
	 /* .line 300 */
	 v1 = 	 final String v1 = "testing"; // const-string v1, "testing"
	 /* .line 301 */
	 if ( v1 != null) { // if-eqz v1, :cond_0
		 /* .line 303 */
		 final String v1 = "AdMobSDK"; // const-string v1, "AdMobSDK"
		 final String v2 = "AdView\'s \"testing\" XML attribute has been deprecated and will be ignored.Please delete it from your XML layout and use AdManager.setTestDevices instead."; // const-string v2, "AdView\'s \"testing\" XML attribute has been deprecated and will be ignored.Please delete it from your XML layout and use AdManager.setTestDevices instead."
		 android.util.Log .w ( v1,v2 );
		 /* .line 306 */
	 } // :cond_0
	 v1 = 	 final String v1 = "backgroundColor"; // const-string v1, "backgroundColor"
	 /* .line 308 */
	 v2 = 	 final String v2 = "textColor"; // const-string v2, "textColor"
	 /* .line 309 */
	 /* if-ltz v2, :cond_1 */
	 /* .line 311 */
	 (( com.admob.android.ads.AdView ) p0 ).setTextColor ( v2 ); // invoke-virtual {p0, v2}, Lcom/admob/android/ads/AdView;->setTextColor(I)V
	 /* .line 314 */
} // :cond_1
v2 = final String v2 = "primaryTextColor"; // const-string v2, "primaryTextColor"
/* .line 315 */
v3 = final String v3 = "secondaryTextColor"; // const-string v3, "secondaryTextColor"
/* .line 317 */
final String v4 = "keywords"; // const-string v4, "keywords"
this.j = v4;
/* .line 319 */
v4 = final String v4 = "refreshInterval"; // const-string v4, "refreshInterval"
/* .line 320 */
(( com.admob.android.ads.AdView ) p0 ).setRequestInterval ( v4 ); // invoke-virtual {p0, v4}, Lcom/admob/android/ads/AdView;->setRequestInterval(I)V
/* .line 322 */
v0 = final String v4 = "isGoneWithoutAd"; // const-string v4, "isGoneWithoutAd"
/* .line 323 */
if ( v0 != null) { // if-eqz v0, :cond_2
	 /* .line 325 */
	 (( com.admob.android.ads.AdView ) p0 ).setGoneWithoutAd ( v0 ); // invoke-virtual {p0, v0}, Lcom/admob/android/ads/AdView;->setGoneWithoutAd(Z)V
} // :cond_2
/* move v0, v3 */
/* move v8, v2 */
/* move v2, v1 */
/* move v1, v8 */
/* .line 329 */
} // :goto_0
(( com.admob.android.ads.AdView ) p0 ).setBackgroundColor ( v2 ); // invoke-virtual {p0, v2}, Lcom/admob/android/ads/AdView;->setBackgroundColor(I)V
/* .line 330 */
(( com.admob.android.ads.AdView ) p0 ).setPrimaryTextColor ( v1 ); // invoke-virtual {p0, v1}, Lcom/admob/android/ads/AdView;->setPrimaryTextColor(I)V
/* .line 331 */
(( com.admob.android.ads.AdView ) p0 ).setSecondaryTextColor ( v0 ); // invoke-virtual {p0, v0}, Lcom/admob/android/ads/AdView;->setSecondaryTextColor(I)V
/* .line 333 */
int v0 = 0; // const/4 v0, 0x0
this.c = v0;
/* .line 334 */
int v0 = 0; // const/4 v0, 0x0
this.q = v0;
/* .line 337 */
v0 = com.admob.android.ads.AdView.b;
/* if-nez v0, :cond_3 */
/* .line 339 */
v0 = com.admob.android.ads.AdView .a ( p1 );
java.lang.Boolean .valueOf ( v0 );
/* .line 341 */
} // :cond_3
v0 = com.admob.android.ads.AdView.b;
v0 = (( java.lang.Boolean ) v0 ).booleanValue ( ); // invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z
if ( v0 != null) { // if-eqz v0, :cond_4
/* .line 343 */
/* new-instance v0, Landroid/widget/TextView; */
/* invoke-direct {v0, p1, p2, p3}, Landroid/widget/TextView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V */
/* .line 344 */
v1 = (( com.admob.android.ads.AdView ) p0 ).getBackgroundColor ( ); // invoke-virtual {p0}, Lcom/admob/android/ads/AdView;->getBackgroundColor()I
(( android.widget.TextView ) v0 ).setBackgroundColor ( v1 ); // invoke-virtual {v0, v1}, Landroid/widget/TextView;->setBackgroundColor(I)V
/* .line 345 */
v1 = (( com.admob.android.ads.AdView ) p0 ).getPrimaryTextColor ( ); // invoke-virtual {p0}, Lcom/admob/android/ads/AdView;->getPrimaryTextColor()I
(( android.widget.TextView ) v0 ).setTextColor ( v1 ); // invoke-virtual {v0, v1}, Landroid/widget/TextView;->setTextColor(I)V
/* .line 346 */
(( android.widget.TextView ) v0 ).setPadding ( v7, v7, v7, v7 ); // invoke-virtual {v0, v7, v7, v7, v7}, Landroid/widget/TextView;->setPadding(IIII)V
/* .line 347 */
/* const/high16 v1, 0x41800000 # 16.0f */
(( android.widget.TextView ) v0 ).setTextSize ( v1 ); // invoke-virtual {v0, v1}, Landroid/widget/TextView;->setTextSize(F)V
/* .line 348 */
/* const/16 v1, 0x10 */
(( android.widget.TextView ) v0 ).setGravity ( v1 ); // invoke-virtual {v0, v1}, Landroid/widget/TextView;->setGravity(I)V
/* .line 349 */
final String v1 = "Ads by AdMob"; // const-string v1, "Ads by AdMob"
(( android.widget.TextView ) v0 ).setText ( v1 ); // invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V
/* .line 350 */
/* new-instance v1, Landroid/widget/RelativeLayout$LayoutParams; */
/* invoke-direct {v1, v5, v5}, Landroid/widget/RelativeLayout$LayoutParams;-><init>(II)V */
(( com.admob.android.ads.AdView ) p0 ).addView ( v0, v1 ); // invoke-virtual {p0, v0, v1}, Lcom/admob/android/ads/AdView;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V
/* .line 355 */
} // :cond_4
return;
} // :cond_5
/* move v0, v5 */
/* move v1, v5 */
/* move v2, v3 */
} // .end method
static com.admob.android.ads.g a ( com.admob.android.ads.AdView p0 ) { //synthethic
/* .locals 1 */
/* .prologue */
/* .line 53 */
v0 = this.c;
} // .end method
private void a ( ) {
/* .locals 2 */
/* .prologue */
final String v1 = "AdMobSDK"; // const-string v1, "AdMobSDK"
/* .line 609 */
(( com.admob.android.ads.AdView ) p0 ).getContext ( ); // invoke-virtual {p0}, Lcom/admob/android/ads/AdView;->getContext()Landroid/content/Context;
/* .line 610 */
com.admob.android.ads.t .a ( v0 );
/* .line 614 */
/* iget-boolean v0, p0, Lcom/admob/android/ads/AdView;->n:Z */
/* if-nez v0, :cond_1 */
v0 = /* invoke-super {p0}, Landroid/widget/RelativeLayout;->getVisibility()I */
if ( v0 != null) { // if-eqz v0, :cond_1
/* .line 618 */
final String v0 = "AdMobSDK"; // const-string v0, "AdMobSDK"
final String v0 = "Cannot requestFreshAd() when the AdView is not visible.Call AdView.setVisibility(View.VISIBLE) first."; // const-string v0, "Cannot requestFreshAd() when the AdView is not visible.Call AdView.setVisibility(View.VISIBLE) first."
android.util.Log .w ( v1,v0 );
/* .line 635 */
} // :cond_0
} // :goto_0
return;
/* .line 620 */
} // :cond_1
/* iget-boolean v0, p0, Lcom/admob/android/ads/AdView;->o:Z */
if ( v0 != null) { // if-eqz v0, :cond_2
/* .line 622 */
final String v0 = "AdMobSDK"; // const-string v0, "AdMobSDK"
int v0 = 3; // const/4 v0, 0x3
v0 = android.util.Log .isLoggable ( v1,v0 );
if ( v0 != null) { // if-eqz v0, :cond_0
/* .line 624 */
final String v0 = "AdMobSDK"; // const-string v0, "AdMobSDK"
final String v0 = "Ignoring requestFreshAd() because we are requesting an ad right now already."; // const-string v0, "Ignoring requestFreshAd() because we are requesting an ad right now already."
android.util.Log .d ( v1,v0 );
/* .line 629 */
} // :cond_2
int v0 = 1; // const/4 v0, 0x1
/* iput-boolean v0, p0, Lcom/admob/android/ads/AdView;->o:Z */
/* .line 630 */
android.os.SystemClock .uptimeMillis ( );
/* move-result-wide v0 */
/* iput-wide v0, p0, Lcom/admob/android/ads/AdView;->p:J */
/* .line 633 */
/* new-instance v0, Lcom/admob/android/ads/a; */
/* invoke-direct {v0, p0}, Lcom/admob/android/ads/a;-><init>(Lcom/admob/android/ads/AdView;)V */
(( com.admob.android.ads.a ) v0 ).start ( ); // invoke-virtual {v0}, Lcom/admob/android/ads/a;->start()V
} // .end method
static void a ( android.view.View p0 ) {
/* .locals 1 */
/* .prologue */
/* .line 1632 */
v0 = com.admob.android.ads.AdView.r;
(( java.util.Vector ) v0 ).add ( p0 ); // invoke-virtual {v0, p0}, Ljava/util/Vector;->add(Ljava/lang/Object;)Z
/* .line 1633 */
return;
} // .end method
static void a ( com.admob.android.ads.AdView p0, Object p1 ) { //synthethic
/* .locals 3 */
/* .prologue */
final String v2 = "AdMobSDK"; // const-string v2, "AdMobSDK"
/* .line 53 */
v0 = this.l;
if ( v0 != null) { // if-eqz v0, :cond_1
v0 = this.c;
if ( v0 != null) { // if-eqz v0, :cond_0
v0 = this.c;
(( com.admob.android.ads.g ) v0 ).getParent ( ); // invoke-virtual {v0}, Lcom/admob/android/ads/g;->getParent()Landroid/view/ViewParent;
/* if-nez v0, :cond_2 */
} // :cond_0
try { // :try_start_0
v0 = this.l;
/* :try_end_0 */
/* .catch Ljava/lang/Exception; {:try_start_0 ..:try_end_0} :catch_0 */
} // :cond_1
} // :goto_0
return;
/* :catch_0 */
/* move-exception v0 */
final String v1 = "AdMobSDK"; // const-string v1, "AdMobSDK"
final String v1 = "Unhandled exception raised in your AdListener.onReceiveAd."; // const-string v1, "Unhandled exception raised in your AdListener.onReceiveAd."
android.util.Log .w ( v2,v1,v0 );
} // :cond_2
try { // :try_start_1
v0 = this.l;
/* :try_end_1 */
/* .catch Ljava/lang/Exception; {:try_start_1 ..:try_end_1} :catch_1 */
/* :catch_1 */
/* move-exception v0 */
final String v1 = "AdMobSDK"; // const-string v1, "AdMobSDK"
final String v1 = "Unhandled exception raised in your AdListener.onReceiveRefreshedAd."; // const-string v1, "Unhandled exception raised in your AdListener.onReceiveRefreshedAd."
android.util.Log .w ( v2,v1,v0 );
} // .end method
static void a ( com.admob.android.ads.AdView p0, Object p1 ) { //synthethic
/* .locals 3 */
/* .prologue */
/* .line 53 */
this.c = p1;
/* iget-boolean v0, p0, Lcom/admob/android/ads/AdView;->m:Z */
if ( v0 != null) { // if-eqz v0, :cond_0
/* new-instance v0, Landroid/view/animation/AlphaAnimation; */
int v1 = 0; // const/4 v1, 0x0
/* const/high16 v2, 0x3f800000 # 1.0f */
/* invoke-direct {v0, v1, v2}, Landroid/view/animation/AlphaAnimation;-><init>(FF)V */
/* const-wide/16 v1, 0xe9 */
(( android.view.animation.AlphaAnimation ) v0 ).setDuration ( v1, v2 ); // invoke-virtual {v0, v1, v2}, Landroid/view/animation/AlphaAnimation;->setDuration(J)V
(( android.view.animation.AlphaAnimation ) v0 ).startNow ( ); // invoke-virtual {v0}, Landroid/view/animation/AlphaAnimation;->startNow()V
int v1 = 1; // const/4 v1, 0x1
(( android.view.animation.AlphaAnimation ) v0 ).setFillAfter ( v1 ); // invoke-virtual {v0, v1}, Landroid/view/animation/AlphaAnimation;->setFillAfter(Z)V
/* new-instance v1, Landroid/view/animation/AccelerateInterpolator; */
/* invoke-direct {v1}, Landroid/view/animation/AccelerateInterpolator;-><init>()V */
(( android.view.animation.AlphaAnimation ) v0 ).setInterpolator ( v1 ); // invoke-virtual {v0, v1}, Landroid/view/animation/AlphaAnimation;->setInterpolator(Landroid/view/animation/Interpolator;)V
(( com.admob.android.ads.AdView ) p0 ).startAnimation ( v0 ); // invoke-virtual {p0, v0}, Lcom/admob/android/ads/AdView;->startAnimation(Landroid/view/animation/Animation;)V
} // :cond_0
return;
} // .end method
private void a ( Boolean p0 ) {
/* .locals 5 */
/* .prologue */
final String v0 = "AdMobSDK"; // const-string v0, "AdMobSDK"
/* .line 947 */
/* monitor-enter p0 */
/* .line 950 */
if ( p1 != null) { // if-eqz p1, :cond_1
try { // :try_start_0
/* iget v0, p0, Lcom/admob/android/ads/AdView;->d:I */
/* if-lez v0, :cond_1 */
v0 = (( com.admob.android.ads.AdView ) p0 ).getVisibility ( ); // invoke-virtual {p0}, Lcom/admob/android/ads/AdView;->getVisibility()I
/* if-nez v0, :cond_1 */
/* .line 954 */
/* iget v0, p0, Lcom/admob/android/ads/AdView;->d:I */
/* invoke-direct {p0}, Lcom/admob/android/ads/AdView;->b()V */
v1 = /* invoke-direct {p0}, Lcom/admob/android/ads/AdView;->c()Z */
if ( v1 != null) { // if-eqz v1, :cond_0
/* new-instance v1, Lcom/admob/android/ads/AdView$a; */
/* invoke-direct {v1, p0}, Lcom/admob/android/ads/AdView$a;-><init>(Lcom/admob/android/ads/AdView;)V */
this.f = v1;
v1 = com.admob.android.ads.AdView.a;
v2 = this.f;
/* int-to-long v3, v0 */
(( android.os.Handler ) v1 ).postDelayed ( v2, v3, v4 ); // invoke-virtual {v1, v2, v3, v4}, Landroid/os/Handler;->postDelayed(Ljava/lang/Runnable;J)Z
final String v1 = "AdMobSDK"; // const-string v1, "AdMobSDK"
int v2 = 3; // const/4 v2, 0x3
v1 = android.util.Log .isLoggable ( v1,v2 );
if ( v1 != null) { // if-eqz v1, :cond_0
final String v1 = "AdMobSDK"; // const-string v1, "AdMobSDK"
/* new-instance v2, Ljava/lang/StringBuilder; */
/* invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V */
final String v3 = "Ad refresh scheduled for "; // const-string v3, "Ad refresh scheduled for "
(( java.lang.StringBuilder ) v2 ).append ( v3 ); // invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v2 ).append ( v0 ); // invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;
final String v2 = " from now."; // const-string v2, " from now."
(( java.lang.StringBuilder ) v0 ).append ( v2 ); // invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v0 ).toString ( ); // invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
android.util.Log .d ( v1,v0 );
/* .line 961 */
} // :cond_0
} // :goto_0
/* monitor-exit p0 */
return;
/* .line 956 */
} // :cond_1
if ( p1 != null) { // if-eqz p1, :cond_2
/* iget v0, p0, Lcom/admob/android/ads/AdView;->d:I */
/* if-nez v0, :cond_0 */
/* .line 959 */
} // :cond_2
/* invoke-direct {p0}, Lcom/admob/android/ads/AdView;->b()V */
/* .line 961 */
/* :catchall_0 */
/* move-exception v0 */
/* monitor-exit p0 */
/* :try_end_0 */
/* .catchall {:try_start_0 ..:try_end_0} :catchall_0 */
/* throw v0 */
} // .end method
private static Boolean a ( android.content.Context p0 ) {
/* .locals 2 */
/* .prologue */
int v1 = 0; // const/4 v1, 0x0
/* .line 1652 */
try { // :try_start_0
final String v0 = "org.json.JSONException"; // const-string v0, "org.json.JSONException"
java.lang.Class .forName ( v0 );
/* :try_end_0 */
/* .catch Ljava/lang/ClassNotFoundException; {:try_start_0 ..:try_end_0} :catch_0 */
if ( v0 != null) { // if-eqz v0, :cond_0
/* move v0, v1 */
/* .line 1673 */
} // :goto_0
/* :catch_0 */
/* move-exception v0 */
/* .line 1664 */
} // :cond_0
com.admob.android.ads.AdManager .getUserId ( p0 );
/* if-nez v0, :cond_1 */
/* .line 1667 */
int v0 = 1; // const/4 v0, 0x1
} // :cond_1
/* move v0, v1 */
/* .line 1673 */
} // .end method
static Boolean a ( com.admob.android.ads.AdView p0, Boolean p1 ) { //synthethic
/* .locals 1 */
/* .prologue */
/* .line 53 */
int v0 = 0; // const/4 v0, 0x0
/* iput-boolean v0, p0, Lcom/admob/android/ads/AdView;->o:Z */
} // .end method
static com.admob.android.ads.AdListener b ( com.admob.android.ads.AdView p0 ) { //synthethic
/* .locals 1 */
/* .prologue */
/* .line 53 */
v0 = this.l;
} // .end method
private void b ( ) {
/* .locals 3 */
/* .prologue */
final String v2 = "AdMobSDK"; // const-string v2, "AdMobSDK"
/* .line 969 */
v0 = this.f;
if ( v0 != null) { // if-eqz v0, :cond_0
/* .line 971 */
v0 = this.f;
int v1 = 1; // const/4 v1, 0x1
/* iput-boolean v1, v0, Lcom/admob/android/ads/AdView$a;->a:Z */
/* .line 972 */
int v0 = 0; // const/4 v0, 0x0
this.f = v0;
/* .line 974 */
final String v0 = "AdMobSDK"; // const-string v0, "AdMobSDK"
int v0 = 2; // const/4 v0, 0x2
v0 = android.util.Log .isLoggable ( v2,v0 );
if ( v0 != null) { // if-eqz v0, :cond_0
/* .line 976 */
final String v0 = "AdMobSDK"; // const-string v0, "AdMobSDK"
final String v0 = "Cancelled an ad refresh scheduled for the future."; // const-string v0, "Cancelled an ad refresh scheduled for the future."
android.util.Log .v ( v2,v0 );
/* .line 979 */
} // :cond_0
return;
} // .end method
static void b ( android.view.View p0 ) {
/* .locals 1 */
/* .prologue */
/* .line 1637 */
v0 = com.admob.android.ads.AdView.r;
(( java.util.Vector ) v0 ).remove ( p0 ); // invoke-virtual {v0, p0}, Ljava/util/Vector;->remove(Ljava/lang/Object;)Z
/* .line 1638 */
return;
} // .end method
static void b ( com.admob.android.ads.AdView p0, Object p1 ) { //synthethic
/* .locals 7 */
/* .prologue */
int v6 = 1; // const/4 v6, 0x1
/* const/high16 v1, 0x40000000 # 2.0f */
/* .line 53 */
/* const/16 v0, 0x8 */
(( com.admob.android.ads.g ) p1 ).setVisibility ( v0 ); // invoke-virtual {p1, v0}, Lcom/admob/android/ads/g;->setVisibility(I)V
v0 = (( com.admob.android.ads.AdView ) p0 ).getWidth ( ); // invoke-virtual {p0}, Lcom/admob/android/ads/AdView;->getWidth()I
/* int-to-float v0, v0 */
/* div-float v3, v0, v1 */
v0 = (( com.admob.android.ads.AdView ) p0 ).getHeight ( ); // invoke-virtual {p0}, Lcom/admob/android/ads/AdView;->getHeight()I
/* int-to-float v0, v0 */
/* div-float v4, v0, v1 */
/* const v0, -0x41333333 # -0.4f */
v1 = (( com.admob.android.ads.AdView ) p0 ).getWidth ( ); // invoke-virtual {p0}, Lcom/admob/android/ads/AdView;->getWidth()I
/* int-to-float v1, v1 */
/* mul-float v5, v0, v1 */
/* new-instance v0, Lcom/admob/android/ads/j; */
int v1 = 0; // const/4 v1, 0x0
/* const/high16 v2, -0x3d4c0000 # -90.0f */
/* invoke-direct/range {v0 ..v6}, Lcom/admob/android/ads/j;-><init>(FFFFFZ)V */
/* const-wide/16 v1, 0x2bc */
(( com.admob.android.ads.j ) v0 ).setDuration ( v1, v2 ); // invoke-virtual {v0, v1, v2}, Lcom/admob/android/ads/j;->setDuration(J)V
(( com.admob.android.ads.j ) v0 ).setFillAfter ( v6 ); // invoke-virtual {v0, v6}, Lcom/admob/android/ads/j;->setFillAfter(Z)V
/* new-instance v1, Landroid/view/animation/AccelerateInterpolator; */
/* invoke-direct {v1}, Landroid/view/animation/AccelerateInterpolator;-><init>()V */
(( com.admob.android.ads.j ) v0 ).setInterpolator ( v1 ); // invoke-virtual {v0, v1}, Lcom/admob/android/ads/j;->setInterpolator(Landroid/view/animation/Interpolator;)V
/* new-instance v1, Lcom/admob/android/ads/AdView$1; */
/* invoke-direct {v1, p0, p1}, Lcom/admob/android/ads/AdView$1;-><init>(Lcom/admob/android/ads/AdView;Lcom/admob/android/ads/g;)V */
(( com.admob.android.ads.j ) v0 ).setAnimationListener ( v1 ); // invoke-virtual {v0, v1}, Lcom/admob/android/ads/j;->setAnimationListener(Landroid/view/animation/Animation$AnimationListener;)V
(( com.admob.android.ads.AdView ) p0 ).startAnimation ( v0 ); // invoke-virtual {p0, v0}, Lcom/admob/android/ads/AdView;->startAnimation(Landroid/view/animation/Animation;)V
return;
} // .end method
static void b ( com.admob.android.ads.AdView p0, Boolean p1 ) { //synthethic
/* .locals 1 */
/* .prologue */
/* .line 53 */
int v0 = 1; // const/4 v0, 0x1
/* invoke-direct {p0, v0}, Lcom/admob/android/ads/AdView;->a(Z)V */
return;
} // .end method
static com.admob.android.ads.g c ( com.admob.android.ads.AdView p0, Object p1 ) { //synthethic
/* .locals 0 */
/* .prologue */
/* .line 53 */
this.c = p1;
} // .end method
static void c ( com.admob.android.ads.AdView p0 ) { //synthethic
/* .locals 2 */
/* .prologue */
/* .line 53 */
v0 = this.l;
if ( v0 != null) { // if-eqz v0, :cond_0
v0 = com.admob.android.ads.AdView.a;
/* new-instance v1, Lcom/admob/android/ads/AdView$d; */
/* invoke-direct {v1, p0}, Lcom/admob/android/ads/AdView$d;-><init>(Lcom/admob/android/ads/AdView;)V */
(( android.os.Handler ) v0 ).post ( v1 ); // invoke-virtual {v0, v1}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z
} // :cond_0
return;
} // .end method
private Boolean c ( ) {
/* .locals 5 */
/* .prologue */
final String v4 = "AdMobSDK"; // const-string v4, "AdMobSDK"
/* .line 1020 */
v0 = this.c;
if ( v0 != null) { // if-eqz v0, :cond_1
/* .line 1023 */
v0 = this.c;
(( com.admob.android.ads.g ) v0 ).b ( ); // invoke-virtual {v0}, Lcom/admob/android/ads/g;->b()Lcom/admob/android/ads/d;
/* .line 1024 */
if ( v0 != null) { // if-eqz v0, :cond_1
v0 = (( com.admob.android.ads.d ) v0 ).d ( ); // invoke-virtual {v0}, Lcom/admob/android/ads/d;->d()Z
if ( v0 != null) { // if-eqz v0, :cond_1
/* .line 1027 */
v0 = this.c;
(( com.admob.android.ads.g ) v0 ).g ( ); // invoke-virtual {v0}, Lcom/admob/android/ads/g;->g()J
/* move-result-wide v0 */
/* const-wide/16 v2, 0x78 */
/* cmp-long v0, v0, v2 */
/* if-gez v0, :cond_1 */
/* .line 1029 */
final String v0 = "AdMobSDK"; // const-string v0, "AdMobSDK"
int v0 = 3; // const/4 v0, 0x3
v0 = android.util.Log .isLoggable ( v4,v0 );
if ( v0 != null) { // if-eqz v0, :cond_0
	 /* .line 1031 */
	 final String v0 = "AdMobSDK"; // const-string v0, "AdMobSDK"
	 final String v0 = "Cannot refresh CPM ads.Ignoring request to refresh the ad."; // const-string v0, "Cannot refresh CPM ads.Ignoring request to refresh the ad."
	 android.util.Log .d ( v4,v0 );
	 /* .line 1035 */
} // :cond_0
int v0 = 0; // const/4 v0, 0x0
/* .line 1041 */
} // :goto_0
} // :cond_1
int v0 = 1; // const/4 v0, 0x1
} // .end method
static com.admob.android.ads.d$a d ( com.admob.android.ads.AdView p0 ) { //synthethic
/* .locals 1 */
/* .prologue */
/* .line 53 */
v0 = this.q;
/* if-nez v0, :cond_0 */
/* new-instance v0, Lcom/admob/android/ads/d$a; */
/* invoke-direct {v0, p0}, Lcom/admob/android/ads/d$a;-><init>(Lcom/admob/android/ads/AdView;)V */
this.q = v0;
} // :cond_0
v0 = this.q;
} // .end method
static java.lang.String e ( com.admob.android.ads.AdView p0 ) { //synthethic
/* .locals 1 */
/* .prologue */
/* .line 53 */
v0 = this.j;
} // .end method
static java.lang.String f ( com.admob.android.ads.AdView p0 ) { //synthethic
/* .locals 1 */
/* .prologue */
/* .line 53 */
v0 = this.k;
} // .end method
static Long g ( com.admob.android.ads.AdView p0 ) { //synthethic
/* .locals 2 */
/* .prologue */
/* .line 53 */
/* iget-wide v0, p0, Lcom/admob/android/ads/AdView;->p:J */
/* return-wide v0 */
} // .end method
static Integer h ( com.admob.android.ads.AdView p0 ) { //synthethic
/* .locals 1 */
/* .prologue */
/* .line 53 */
/* iget v0, p0, Lcom/admob/android/ads/AdView;->d:I */
} // .end method
static void i ( com.admob.android.ads.AdView p0 ) { //synthethic
/* .locals 0 */
/* .prologue */
/* .line 53 */
/* invoke-direct {p0}, Lcom/admob/android/ads/AdView;->a()V */
return;
} // .end method
/* # virtual methods */
final void a ( Object p0, Object p1 ) {
/* .locals 7 */
/* .prologue */
int v6 = 1; // const/4 v6, 0x1
int v5 = 0; // const/4 v5, 0x0
/* .line 778 */
v0 = /* invoke-super {p0}, Landroid/view/View;->getVisibility()I */
/* .line 781 */
(( com.admob.android.ads.d ) p1 ).a ( ); // invoke-virtual {p1}, Lcom/admob/android/ads/d;->a()D
/* move-result-wide v1 */
/* .line 782 */
/* const-wide/16 v3, 0x0 */
/* cmpl-double v3, v1, v3 */
/* if-ltz v3, :cond_1 */
/* .line 784 */
/* iput-boolean v6, p0, Lcom/admob/android/ads/AdView;->e:Z */
/* .line 785 */
/* double-to-int v1, v1 */
(( com.admob.android.ads.AdView ) p0 ).setRequestInterval ( v1 ); // invoke-virtual {p0, v1}, Lcom/admob/android/ads/AdView;->setRequestInterval(I)V
/* .line 788 */
/* invoke-direct {p0, v6}, Lcom/admob/android/ads/AdView;->a(Z)V */
/* .line 797 */
} // :goto_0
/* iget-boolean v1, p0, Lcom/admob/android/ads/AdView;->n:Z */
/* .line 798 */
if ( v1 != null) { // if-eqz v1, :cond_0
/* .line 800 */
/* iput-boolean v5, p0, Lcom/admob/android/ads/AdView;->n:Z */
/* .line 803 */
} // :cond_0
(( com.admob.android.ads.g ) p2 ).a ( p1 ); // invoke-virtual {p2, p1}, Lcom/admob/android/ads/g;->a(Lcom/admob/android/ads/d;)V
/* .line 804 */
(( com.admob.android.ads.g ) p2 ).setVisibility ( v0 ); // invoke-virtual {p2, v0}, Lcom/admob/android/ads/g;->setVisibility(I)V
/* .line 805 */
/* const/16 v2, 0x11 */
(( com.admob.android.ads.g ) p2 ).setGravity ( v2 ); // invoke-virtual {p2, v2}, Lcom/admob/android/ads/g;->setGravity(I)V
/* .line 806 */
(( com.admob.android.ads.d ) p1 ).a ( p2 ); // invoke-virtual {p1, p2}, Lcom/admob/android/ads/d;->a(Lcom/admob/android/ads/g;)V
/* .line 809 */
/* new-instance v2, Landroid/widget/RelativeLayout$LayoutParams; */
v3 = (( com.admob.android.ads.d ) p1 ).e ( ); // invoke-virtual {p1}, Lcom/admob/android/ads/d;->e()I
v3 = (( com.admob.android.ads.d ) p1 ).a ( v3 ); // invoke-virtual {p1, v3}, Lcom/admob/android/ads/d;->a(I)I
v4 = (( com.admob.android.ads.d ) p1 ).f ( ); // invoke-virtual {p1}, Lcom/admob/android/ads/d;->f()I
v4 = (( com.admob.android.ads.d ) p1 ).a ( v4 ); // invoke-virtual {p1, v4}, Lcom/admob/android/ads/d;->a(I)I
/* invoke-direct {v2, v3, v4}, Landroid/widget/RelativeLayout$LayoutParams;-><init>(II)V */
/* .line 812 */
(( com.admob.android.ads.g ) p2 ).setLayoutParams ( v2 ); // invoke-virtual {p2, v2}, Lcom/admob/android/ads/g;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V
/* .line 815 */
v2 = com.admob.android.ads.AdView.a;
/* new-instance v3, Lcom/admob/android/ads/AdView$b; */
/* invoke-direct {v3, p0, p2, v0, v1}, Lcom/admob/android/ads/AdView$b;-><init>(Lcom/admob/android/ads/AdView;Lcom/admob/android/ads/g;IZ)V */
(( android.os.Handler ) v2 ).post ( v3 ); // invoke-virtual {v2, v3}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z
/* .line 816 */
return;
/* .line 792 */
} // :cond_1
/* iput-boolean v5, p0, Lcom/admob/android/ads/AdView;->e:Z */
} // .end method
public com.admob.android.ads.AdListener getAdListener ( ) {
/* .locals 1 */
/* .prologue */
/* .line 1415 */
v0 = this.l;
} // .end method
public Integer getBackgroundColor ( ) {
/* .locals 1 */
/* .prologue */
/* .line 1227 */
/* iget v0, p0, Lcom/admob/android/ads/AdView;->g:I */
} // .end method
public java.lang.String getKeywords ( ) {
/* .locals 1 */
/* .prologue */
/* .line 1237 */
v0 = this.j;
} // .end method
public Integer getPrimaryTextColor ( ) {
/* .locals 1 */
/* .prologue */
/* .line 1155 */
/* iget v0, p0, Lcom/admob/android/ads/AdView;->h:I */
} // .end method
public Integer getRequestInterval ( ) {
/* .locals 1 */
/* .prologue */
/* .line 885 */
/* iget v0, p0, Lcom/admob/android/ads/AdView;->d:I */
/* div-int/lit16 v0, v0, 0x3e8 */
/* .line 886 */
} // .end method
public java.lang.String getSearchQuery ( ) {
/* .locals 1 */
/* .prologue */
/* .line 1261 */
v0 = this.k;
} // .end method
public Integer getSecondaryTextColor ( ) {
/* .locals 1 */
/* .prologue */
/* .line 1182 */
/* iget v0, p0, Lcom/admob/android/ads/AdView;->i:I */
} // .end method
public Integer getTextColor ( ) {
/* .locals 2 */
/* .annotation runtime Ljava/lang/Deprecated; */
} // .end annotation
/* .prologue */
/* .line 1143 */
final String v0 = "AdMobSDK"; // const-string v0, "AdMobSDK"
final String v1 = "Calling the deprecated method getTextColor! Please use getPrimaryTextColor and getSecondaryTextColor instead."; // const-string v1, "Calling the deprecated method getTextColor! Please use getPrimaryTextColor and getSecondaryTextColor instead."
android.util.Log .w ( v0,v1 );
/* .line 1144 */
v0 = (( com.admob.android.ads.AdView ) p0 ).getPrimaryTextColor ( ); // invoke-virtual {p0}, Lcom/admob/android/ads/AdView;->getPrimaryTextColor()I
} // .end method
public Boolean hasAd ( ) {
/* .locals 1 */
/* .prologue */
/* .line 1430 */
v0 = this.c;
if ( v0 != null) { // if-eqz v0, :cond_0
v0 = this.c;
(( com.admob.android.ads.g ) v0 ).b ( ); // invoke-virtual {v0}, Lcom/admob/android/ads/g;->b()Lcom/admob/android/ads/d;
if ( v0 != null) { // if-eqz v0, :cond_0
int v0 = 1; // const/4 v0, 0x1
} // :goto_0
} // :cond_0
int v0 = 0; // const/4 v0, 0x0
} // .end method
public Boolean isGoneWithoutAd ( ) {
/* .locals 2 */
/* .annotation runtime Ljava/lang/Deprecated; */
} // .end annotation
/* .prologue */
/* .line 1308 */
final String v0 = "AdMobSDK"; // const-string v0, "AdMobSDK"
final String v1 = "Deprecated method isGoneWithoutAd was called.See JavaDoc for instructions to remove."; // const-string v1, "Deprecated method isGoneWithoutAd was called.See JavaDoc for instructions to remove."
android.util.Log .w ( v0,v1 );
/* .line 1309 */
int v0 = 0; // const/4 v0, 0x0
} // .end method
protected void onAttachedToWindow ( ) {
/* .locals 1 */
/* .prologue */
int v0 = 1; // const/4 v0, 0x1
/* .line 1449 */
/* iput-boolean v0, p0, Lcom/admob/android/ads/AdView;->m:Z */
/* .line 1450 */
/* invoke-direct {p0, v0}, Lcom/admob/android/ads/AdView;->a(Z)V */
/* .line 1451 */
/* invoke-super {p0}, Landroid/widget/RelativeLayout;->onAttachedToWindow()V */
/* .line 1452 */
return;
} // .end method
protected void onDetachedFromWindow ( ) {
/* .locals 1 */
/* .prologue */
int v0 = 0; // const/4 v0, 0x0
/* .line 1460 */
/* iput-boolean v0, p0, Lcom/admob/android/ads/AdView;->m:Z */
/* .line 1461 */
/* invoke-direct {p0, v0}, Lcom/admob/android/ads/AdView;->a(Z)V */
/* .line 1462 */
/* invoke-super {p0}, Landroid/widget/RelativeLayout;->onDetachedFromWindow()V */
/* .line 1463 */
return;
} // .end method
protected void onMeasure ( Integer p0, Integer p1 ) {
/* .locals 9 */
/* .prologue */
/* const/high16 v4, 0x40000000 # 2.0f */
/* const/high16 v8, -0x80000000 */
final String v7 = "AdMobSDK"; // const-string v7, "AdMobSDK"
/* .line 385 */
/* invoke-super {p0, p1, p2}, Landroid/widget/RelativeLayout;->onMeasure(II)V */
/* .line 388 */
v0 = android.view.View$MeasureSpec .getSize ( p1 );
/* .line 389 */
v1 = android.view.View$MeasureSpec .getMode ( p1 );
/* .line 390 */
v2 = android.view.View$MeasureSpec .getSize ( p2 );
/* .line 391 */
v3 = android.view.View$MeasureSpec .getMode ( p2 );
/* .line 394 */
/* if-eq v1, v8, :cond_0 */
/* if-ne v1, v4, :cond_4 */
} // :cond_0
/* move v1, v0 */
/* .line 407 */
} // :goto_0
/* if-ne v3, v4, :cond_5 */
/* move v3, v2 */
/* .line 444 */
} // :goto_1
(( com.admob.android.ads.AdView ) p0 ).setMeasuredDimension ( v1, v3 ); // invoke-virtual {p0, v1, v3}, Lcom/admob/android/ads/AdView;->setMeasuredDimension(II)V
/* .line 448 */
final String v4 = "AdMobSDK"; // const-string v4, "AdMobSDK"
int v4 = 2; // const/4 v4, 0x2
v4 = android.util.Log .isLoggable ( v7,v4 );
if ( v4 != null) { // if-eqz v4, :cond_1
/* .line 450 */
final String v4 = "AdMobSDK"; // const-string v4, "AdMobSDK"
/* new-instance v4, Ljava/lang/StringBuilder; */
/* invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V */
final String v5 = "AdView.onMeasure: widthSize "; // const-string v5, "AdView.onMeasure: widthSize "
(( java.lang.StringBuilder ) v4 ).append ( v5 ); // invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v4 ).append ( v0 ); // invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;
final String v4 = " heightSize "; // const-string v4, " heightSize "
(( java.lang.StringBuilder ) v0 ).append ( v4 ); // invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v0 ).append ( v2 ); // invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v0 ).toString ( ); // invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
android.util.Log .v ( v7,v0 );
/* .line 451 */
final String v0 = "AdMobSDK"; // const-string v0, "AdMobSDK"
/* new-instance v0, Ljava/lang/StringBuilder; */
/* invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V */
final String v2 = "AdView.onMeasure: measuredWidth "; // const-string v2, "AdView.onMeasure: measuredWidth "
(( java.lang.StringBuilder ) v0 ).append ( v2 ); // invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v0 ).append ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;
final String v1 = " measuredHeight "; // const-string v1, " measuredHeight "
(( java.lang.StringBuilder ) v0 ).append ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v0 ).append ( v3 ); // invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v0 ).toString ( ); // invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
android.util.Log .v ( v7,v0 );
/* .line 455 */
} // :cond_1
v0 = (( com.admob.android.ads.AdView ) p0 ).getMeasuredWidth ( ); // invoke-virtual {p0}, Lcom/admob/android/ads/AdView;->getMeasuredWidth()I
/* .line 456 */
v1 = (( com.admob.android.ads.AdView ) p0 ).getMeasuredHeight ( ); // invoke-virtual {p0}, Lcom/admob/android/ads/AdView;->getMeasuredHeight()I
/* .line 458 */
final String v2 = "AdMobSDK"; // const-string v2, "AdMobSDK"
int v2 = 3; // const/4 v2, 0x3
v2 = android.util.Log .isLoggable ( v7,v2 );
if ( v2 != null) { // if-eqz v2, :cond_2
/* .line 460 */
final String v2 = "AdMobSDK"; // const-string v2, "AdMobSDK"
/* new-instance v2, Ljava/lang/StringBuilder; */
/* invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V */
final String v3 = "AdView size is "; // const-string v3, "AdView size is "
(( java.lang.StringBuilder ) v2 ).append ( v3 ); // invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v2 ).append ( v0 ); // invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;
final String v2 = " by "; // const-string v2, " by "
(( java.lang.StringBuilder ) v0 ).append ( v2 ); // invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v0 ).append ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v0 ).toString ( ); // invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
android.util.Log .d ( v7,v0 );
/* .line 464 */
} // :cond_2
/* iget-boolean v0, p0, Lcom/admob/android/ads/AdView;->n:Z */
if ( v0 != null) { // if-eqz v0, :cond_3
v0 = com.admob.android.ads.AdView.b;
v0 = (( java.lang.Boolean ) v0 ).booleanValue ( ); // invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z
/* if-nez v0, :cond_3 */
/* .line 466 */
/* invoke-direct {p0}, Lcom/admob/android/ads/AdView;->a()V */
/* .line 468 */
} // :cond_3
return;
/* .line 404 */
} // :cond_4
(( com.admob.android.ads.AdView ) p0 ).getContext ( ); // invoke-virtual {p0}, Lcom/admob/android/ads/AdView;->getContext()Landroid/content/Context;
v1 = com.admob.android.ads.AdManager .getScreenWidth ( v1 );
/* goto/16 :goto_0 */
/* .line 414 */
} // :cond_5
int v4 = 0; // const/4 v4, 0x0
/* .line 417 */
v5 = this.c;
if ( v5 != null) { // if-eqz v5, :cond_7
/* .line 419 */
v5 = this.c;
(( com.admob.android.ads.g ) v5 ).b ( ); // invoke-virtual {v5}, Lcom/admob/android/ads/g;->b()Lcom/admob/android/ads/d;
/* .line 421 */
if ( v5 != null) { // if-eqz v5, :cond_7
/* .line 424 */
v6 = (( com.admob.android.ads.d ) v5 ).f ( ); // invoke-virtual {v5}, Lcom/admob/android/ads/d;->f()I
v5 = (( com.admob.android.ads.d ) v5 ).a ( v6 ); // invoke-virtual {v5, v6}, Lcom/admob/android/ads/d;->a(I)I
/* .line 425 */
/* if-ne v3, v8, :cond_6 */
/* if-ge v2, v5, :cond_6 */
/* .line 431 */
final String v3 = "AdMobSDK"; // const-string v3, "AdMobSDK"
/* new-instance v3, Ljava/lang/StringBuilder; */
/* invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V */
final String v6 = "Cannot display ad because its container is too small.The ad is "; // const-string v6, "Cannot display ad because its container is too small.The ad is "
(( java.lang.StringBuilder ) v3 ).append ( v6 ); // invoke-virtual {v3, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v3 ).append ( v5 ); // invoke-virtual {v3, v5}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;
final String v5 = " pixels tall but is only given "; // const-string v5, " pixels tall but is only given "
(( java.lang.StringBuilder ) v3 ).append ( v5 ); // invoke-virtual {v3, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v3 ).append ( v2 ); // invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;
final String v5 = " at most to draw into.Please make your view containing AdView taller."; // const-string v5, " at most to draw into.Please make your view containing AdView taller."
(( java.lang.StringBuilder ) v3 ).append ( v5 ); // invoke-virtual {v3, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v3 ).toString ( ); // invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
android.util.Log .w ( v7,v3 );
/* move v3, v4 */
/* goto/16 :goto_1 */
} // :cond_6
/* move v3, v5 */
/* .line 438 */
/* goto/16 :goto_1 */
} // :cond_7
/* move v3, v4 */
/* goto/16 :goto_1 */
} // .end method
public void onWindowFocusChanged ( Boolean p0 ) {
/* .locals 0 */
/* .prologue */
/* .line 1113 */
/* invoke-direct {p0, p1}, Lcom/admob/android/ads/AdView;->a(Z)V */
/* .line 1114 */
return;
} // .end method
protected void onWindowVisibilityChanged ( Integer p0 ) {
/* .locals 1 */
/* .prologue */
/* .line 1123 */
/* if-nez p1, :cond_0 */
int v0 = 1; // const/4 v0, 0x1
} // :goto_0
/* invoke-direct {p0, v0}, Lcom/admob/android/ads/AdView;->a(Z)V */
/* .line 1124 */
return;
/* .line 1123 */
} // :cond_0
int v0 = 0; // const/4 v0, 0x0
} // .end method
public void requestFreshAd ( ) {
/* .locals 6 */
/* .prologue */
int v5 = 3; // const/4 v5, 0x3
final String v4 = "AdMobSDK"; // const-string v4, "AdMobSDK"
/* .line 566 */
/* iget-boolean v0, p0, Lcom/admob/android/ads/AdView;->e:Z */
if ( v0 != null) { // if-eqz v0, :cond_1
/* .line 568 */
final String v0 = "AdMobSDK"; // const-string v0, "AdMobSDK"
v0 = android.util.Log .isLoggable ( v4,v5 );
if ( v0 != null) { // if-eqz v0, :cond_0
/* .line 570 */
final String v0 = "AdMobSDK"; // const-string v0, "AdMobSDK"
final String v0 = "Request interval overridden by the server.Ignoring requestFreshAd."; // const-string v0, "Request interval overridden by the server.Ignoring requestFreshAd."
android.util.Log .d ( v4,v0 );
/* .line 597 */
} // :cond_0
} // :goto_0
return;
/* .line 577 */
} // :cond_1
android.os.SystemClock .uptimeMillis ( );
/* move-result-wide v0 */
/* iget-wide v2, p0, Lcom/admob/android/ads/AdView;->p:J */
/* sub-long/2addr v0, v2 */
/* const-wide/16 v2, 0x3e8 */
/* div-long/2addr v0, v2 */
/* .line 578 */
/* const-wide/16 v2, 0x0 */
/* cmp-long v2, v0, v2 */
/* if-lez v2, :cond_2 */
/* const-wide/16 v2, 0xd */
/* cmp-long v2, v0, v2 */
/* if-gez v2, :cond_2 */
/* .line 580 */
final String v2 = "AdMobSDK"; // const-string v2, "AdMobSDK"
v2 = android.util.Log .isLoggable ( v4,v5 );
if ( v2 != null) { // if-eqz v2, :cond_0
/* .line 582 */
final String v2 = "AdMobSDK"; // const-string v2, "AdMobSDK"
/* new-instance v2, Ljava/lang/StringBuilder; */
/* invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V */
final String v3 = "Ignoring requestFreshAd.Called "; // const-string v3, "Ignoring requestFreshAd.Called "
(( java.lang.StringBuilder ) v2 ).append ( v3 ); // invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v2 ).append ( v0, v1 ); // invoke-virtual {v2, v0, v1}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;
final String v1 = " seconds since last refresh."; // const-string v1, " seconds since last refresh."
(( java.lang.StringBuilder ) v0 ).append ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
final String v1 = "Refreshes must be at least "; // const-string v1, "Refreshes must be at least "
(( java.lang.StringBuilder ) v0 ).append ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
/* const/16 v1, 0xd */
(( java.lang.StringBuilder ) v0 ).append ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;
final String v1 = " apart."; // const-string v1, " apart."
(( java.lang.StringBuilder ) v0 ).append ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v0 ).toString ( ); // invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
android.util.Log .d ( v4,v0 );
/* .line 591 */
} // :cond_2
v0 = /* invoke-direct {p0}, Lcom/admob/android/ads/AdView;->c()Z */
if ( v0 != null) { // if-eqz v0, :cond_0
/* .line 596 */
/* invoke-direct {p0}, Lcom/admob/android/ads/AdView;->a()V */
} // .end method
public void setAdListener ( com.admob.android.ads.AdListener p0 ) {
/* .locals 1 */
/* .prologue */
/* .line 1402 */
/* monitor-enter p0 */
/* .line 1404 */
try { // :try_start_0
this.l = p1;
/* .line 1405 */
/* monitor-exit p0 */
return;
/* :catchall_0 */
/* move-exception v0 */
/* monitor-exit p0 */
/* :try_end_0 */
/* .catchall {:try_start_0 ..:try_end_0} :catchall_0 */
/* throw v0 */
} // .end method
public void setBackgroundColor ( Integer p0 ) {
/* .locals 1 */
/* .prologue */
/* .line 1214 */
/* const/high16 v0, -0x1000000 */
/* or-int/2addr v0, p1 */
/* iput v0, p0, Lcom/admob/android/ads/AdView;->g:I */
/* .line 1216 */
(( com.admob.android.ads.AdView ) p0 ).invalidate ( ); // invoke-virtual {p0}, Lcom/admob/android/ads/AdView;->invalidate()V
/* .line 1217 */
return;
} // .end method
public void setEnabled ( Boolean p0 ) {
/* .locals 1 */
/* .prologue */
/* .line 1379 */
/* invoke-super {p0, p1}, Landroid/widget/RelativeLayout;->setEnabled(Z)V */
/* .line 1382 */
if ( p1 != null) { // if-eqz p1, :cond_0
/* .line 1384 */
int v0 = 0; // const/4 v0, 0x0
(( com.admob.android.ads.AdView ) p0 ).setVisibility ( v0 ); // invoke-virtual {p0, v0}, Lcom/admob/android/ads/AdView;->setVisibility(I)V
/* .line 1390 */
} // :goto_0
return;
/* .line 1388 */
} // :cond_0
/* const/16 v0, 0x8 */
(( com.admob.android.ads.AdView ) p0 ).setVisibility ( v0 ); // invoke-virtual {p0, v0}, Lcom/admob/android/ads/AdView;->setVisibility(I)V
} // .end method
public void setGoneWithoutAd ( Boolean p0 ) {
/* .locals 2 */
/* .annotation runtime Ljava/lang/Deprecated; */
} // .end annotation
/* .prologue */
/* .line 1299 */
final String v0 = "AdMobSDK"; // const-string v0, "AdMobSDK"
final String v1 = "Deprecated method setGoneWithoutAd was called.See JavaDoc for instructions to remove."; // const-string v1, "Deprecated method setGoneWithoutAd was called.See JavaDoc for instructions to remove."
android.util.Log .w ( v0,v1 );
/* .line 1300 */
return;
} // .end method
public void setKeywords ( java.lang.String p0 ) {
/* .locals 0 */
/* .prologue */
/* .line 1252 */
this.j = p1;
/* .line 1253 */
return;
} // .end method
public void setPrimaryTextColor ( Integer p0 ) {
/* .locals 1 */
/* .prologue */
/* .line 1171 */
/* const/high16 v0, -0x1000000 */
/* or-int/2addr v0, p1 */
/* iput v0, p0, Lcom/admob/android/ads/AdView;->h:I */
/* .line 1172 */
return;
} // .end method
public void setRequestInterval ( Integer p0 ) {
/* .locals 6 */
/* .prologue */
/* const/16 v4, 0x258 */
/* const/16 v3, 0xd */
final String v5 = "AdView.setRequestInterval("; // const-string v5, "AdView.setRequestInterval("
final String v2 = "AdMobSDK"; // const-string v2, "AdMobSDK"
/* .line 904 */
/* mul-int/lit16 v0, p1, 0x3e8 */
/* .line 906 */
/* iget v1, p0, Lcom/admob/android/ads/AdView;->d:I */
/* if-eq v1, v0, :cond_2 */
/* .line 908 */
/* if-lez p1, :cond_0 */
/* .line 912 */
/* if-ge p1, v3, :cond_3 */
/* .line 915 */
final String v0 = "AdMobSDK"; // const-string v0, "AdMobSDK"
/* new-instance v0, Ljava/lang/StringBuilder; */
/* invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V */
final String v1 = "AdView.setRequestInterval("; // const-string v1, "AdView.setRequestInterval("
(( java.lang.StringBuilder ) v0 ).append ( v5 ); // invoke-virtual {v0, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v0 ).append ( p1 ); // invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;
final String v1 = ") seconds must be >= "; // const-string v1, ") seconds must be >= "
(( java.lang.StringBuilder ) v0 ).append ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v0 ).append ( v3 ); // invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v0 ).toString ( ); // invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
android.util.Log .w ( v2,v0 );
/* .line 916 */
/* const/16 v0, 0x32c8 */
/* .line 925 */
} // :cond_0
} // :goto_0
/* iput v0, p0, Lcom/admob/android/ads/AdView;->d:I */
/* .line 928 */
/* if-gtz p1, :cond_1 */
/* .line 931 */
/* invoke-direct {p0}, Lcom/admob/android/ads/AdView;->b()V */
/* .line 934 */
} // :cond_1
final String v0 = "AdMobSDK"; // const-string v0, "AdMobSDK"
/* new-instance v0, Ljava/lang/StringBuilder; */
/* invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V */
final String v1 = "Requesting fresh ads every "; // const-string v1, "Requesting fresh ads every "
(( java.lang.StringBuilder ) v0 ).append ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v0 ).append ( p1 ); // invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;
final String v1 = " seconds."; // const-string v1, " seconds."
(( java.lang.StringBuilder ) v0 ).append ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v0 ).toString ( ); // invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
android.util.Log .i ( v2,v0 );
/* .line 936 */
} // :cond_2
return;
/* .line 918 */
} // :cond_3
/* if-le p1, v4, :cond_0 */
/* .line 921 */
final String v0 = "AdMobSDK"; // const-string v0, "AdMobSDK"
/* new-instance v0, Ljava/lang/StringBuilder; */
/* invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V */
final String v1 = "AdView.setRequestInterval("; // const-string v1, "AdView.setRequestInterval("
(( java.lang.StringBuilder ) v0 ).append ( v5 ); // invoke-virtual {v0, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v0 ).append ( p1 ); // invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;
final String v1 = ") seconds must be <= "; // const-string v1, ") seconds must be <= "
(( java.lang.StringBuilder ) v0 ).append ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v0 ).append ( v4 ); // invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v0 ).toString ( ); // invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
android.util.Log .w ( v2,v0 );
/* .line 922 */
/* const v0, 0x927c0 */
} // .end method
public void setSearchQuery ( java.lang.String p0 ) {
/* .locals 0 */
/* .prologue */
/* .line 1272 */
this.k = p1;
/* .line 1273 */
return;
} // .end method
public void setSecondaryTextColor ( Integer p0 ) {
/* .locals 1 */
/* .prologue */
/* .line 1199 */
/* const/high16 v0, -0x1000000 */
/* or-int/2addr v0, p1 */
/* iput v0, p0, Lcom/admob/android/ads/AdView;->i:I */
/* .line 1200 */
return;
} // .end method
public void setTextColor ( Integer p0 ) {
/* .locals 2 */
/* .annotation runtime Ljava/lang/Deprecated; */
} // .end annotation
/* .prologue */
/* .line 1132 */
final String v0 = "AdMobSDK"; // const-string v0, "AdMobSDK"
final String v1 = "Calling the deprecated method setTextColor! Please use setPrimaryTextColor and setSecondaryTextColor instead."; // const-string v1, "Calling the deprecated method setTextColor! Please use setPrimaryTextColor and setSecondaryTextColor instead."
android.util.Log .w ( v0,v1 );
/* .line 1133 */
(( com.admob.android.ads.AdView ) p0 ).setPrimaryTextColor ( p1 ); // invoke-virtual {p0, p1}, Lcom/admob/android/ads/AdView;->setPrimaryTextColor(I)V
/* .line 1134 */
(( com.admob.android.ads.AdView ) p0 ).setSecondaryTextColor ( p1 ); // invoke-virtual {p0, p1}, Lcom/admob/android/ads/AdView;->setSecondaryTextColor(I)V
/* .line 1135 */
return;
} // .end method
public void setVisibility ( Integer p0 ) {
/* .locals 4 */
/* .prologue */
int v3 = 0; // const/4 v3, 0x0
/* .line 1338 */
v0 = /* invoke-super {p0}, Landroid/widget/RelativeLayout;->getVisibility()I */
/* .line 1340 */
/* if-eq v0, p1, :cond_1 */
/* .line 1342 */
/* monitor-enter p0 */
/* .line 1345 */
try { // :try_start_0
v0 = (( com.admob.android.ads.AdView ) p0 ).getChildCount ( ); // invoke-virtual {p0}, Lcom/admob/android/ads/AdView;->getChildCount()I
/* move v1, v3 */
/* .line 1347 */
} // :goto_0
/* if-ge v1, v0, :cond_0 */
/* .line 1349 */
(( com.admob.android.ads.AdView ) p0 ).getChildAt ( v1 ); // invoke-virtual {p0, v1}, Lcom/admob/android/ads/AdView;->getChildAt(I)Landroid/view/View;
/* .line 1350 */
(( android.view.View ) v2 ).setVisibility ( p1 ); // invoke-virtual {v2, p1}, Landroid/view/View;->setVisibility(I)V
/* .line 1347 */
/* add-int/lit8 v1, v1, 0x1 */
/* .line 1354 */
} // :cond_0
/* invoke-super {p0, p1}, Landroid/widget/RelativeLayout;->setVisibility(I)V */
/* .line 1356 */
(( com.admob.android.ads.AdView ) p0 ).invalidate ( ); // invoke-virtual {p0}, Lcom/admob/android/ads/AdView;->invalidate()V
/* .line 1357 */
/* monitor-exit p0 */
/* :try_end_0 */
/* .catchall {:try_start_0 ..:try_end_0} :catchall_0 */
/* .line 1362 */
} // :cond_1
/* if-nez p1, :cond_2 */
int v0 = 1; // const/4 v0, 0x1
} // :goto_1
/* invoke-direct {p0, v0}, Lcom/admob/android/ads/AdView;->a(Z)V */
/* .line 1363 */
return;
/* .line 1357 */
/* :catchall_0 */
/* move-exception v0 */
try { // :try_start_1
/* monitor-exit p0 */
/* :try_end_1 */
/* .catchall {:try_start_1 ..:try_end_1} :catchall_0 */
/* throw v0 */
} // :cond_2
/* move v0, v3 */
/* .line 1362 */
} // .end method
