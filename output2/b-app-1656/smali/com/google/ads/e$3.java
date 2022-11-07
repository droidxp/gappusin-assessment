class com.google.ads.e$3 implements java.lang.Runnable {
	 /* .source "SourceFile" */
	 /* # interfaces */
	 /* # annotations */
	 /* .annotation system Ldalvik/annotation/EnclosingMethod; */
	 /* value = Lcom/google/ads/e;->a(Lcom/google/ads/h;Landroid/view/View;)V */
} // .end annotation
/* .annotation system Ldalvik/annotation/InnerClass; */
/* accessFlags = 0x0 */
/* name = null */
} // .end annotation
/* # instance fields */
final android.view.View a; //synthetic
final com.google.ads.f b; //synthetic
final com.google.ads.e c; //synthetic
/* # direct methods */
 com.google.ads.e$3 ( ) {
/* .locals 0 */
/* .prologue */
/* .line 235 */
this.c = p1;
this.a = p2;
this.b = p3;
/* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
return;
} // .end method
/* # virtual methods */
public void run ( ) {
/* .locals 5 */
/* .prologue */
/* .line 238 */
v0 = this.c;
com.google.ads.e .b ( v0 );
v1 = this.a;
v2 = this.c;
com.google.ads.e .c ( v2 );
v3 = this.b;
int v4 = 1; // const/4 v4, 0x1
(( com.google.ads.internal.d ) v0 ).a ( v1, v2, v3, v4 ); // invoke-virtual {v0, v1, v2, v3, v4}, Lcom/google/ads/internal/d;->a(Landroid/view/View;Lcom/google/ads/h;Lcom/google/ads/f;Z)V
/* .line 239 */
return;
} // .end method
