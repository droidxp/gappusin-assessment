class com.google.ads.e$8 implements java.lang.Runnable {
	 /* .source "SourceFile" */
	 /* # interfaces */
	 /* # annotations */
	 /* .annotation system Ldalvik/annotation/EnclosingMethod; */
	 /* value = Lcom/google/ads/e;->a(Ljava/lang/String;Landroid/app/Activity;Lcom/google/ads/AdRequest;Lcom/google/ads/f;Ljava/util/HashMap;J)Z */
} // .end annotation
/* .annotation system Ldalvik/annotation/InnerClass; */
/* accessFlags = 0x0 */
/* name = null */
} // .end annotation
/* # instance fields */
final com.google.ads.h a; //synthetic
final android.view.View b; //synthetic
final com.google.ads.f c; //synthetic
final com.google.ads.e d; //synthetic
/* # direct methods */
 com.google.ads.e$8 ( ) {
/* .locals 0 */
/* .prologue */
/* .line 410 */
this.d = p1;
this.a = p2;
this.b = p3;
this.c = p4;
/* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
return;
} // .end method
/* # virtual methods */
public void run ( ) {
/* .locals 5 */
/* .prologue */
/* .line 414 */
v0 = this.d;
v1 = this.a;
v0 = com.google.ads.e .a ( v0,v1 );
if ( v0 != null) { // if-eqz v0, :cond_0
	 /* .line 415 */
	 final String v0 = "Trying to switch GWAdNetworkAmbassadors, but GWController().destroy() has been called.Destroying the new ambassador and terminating mediation."; // const-string v0, "Trying to switch GWAdNetworkAmbassadors, but GWController().destroy() has been called.Destroying the new ambassador and terminating mediation."
	 com.google.ads.util.b .a ( v0 );
	 /* .line 423 */
} // :goto_0
return;
/* .line 421 */
} // :cond_0
v0 = this.d;
com.google.ads.e .b ( v0 );
v1 = this.b;
v2 = this.a;
v3 = this.c;
int v4 = 0; // const/4 v4, 0x0
(( com.google.ads.internal.d ) v0 ).a ( v1, v2, v3, v4 ); // invoke-virtual {v0, v1, v2, v3, v4}, Lcom/google/ads/internal/d;->a(Landroid/view/View;Lcom/google/ads/h;Lcom/google/ads/f;Z)V
} // .end method
