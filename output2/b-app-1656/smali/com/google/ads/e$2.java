class com.google.ads.e$2 implements java.lang.Runnable {
	 /* .source "SourceFile" */
	 /* # interfaces */
	 /* # annotations */
	 /* .annotation system Ldalvik/annotation/EnclosingMethod; */
	 /* value = Lcom/google/ads/e;->a(Lcom/google/ads/h;Z)V */
} // .end annotation
/* .annotation system Ldalvik/annotation/InnerClass; */
/* accessFlags = 0x0 */
/* name = null */
} // .end annotation
/* # instance fields */
final com.google.ads.f a; //synthetic
final Boolean b; //synthetic
final com.google.ads.e c; //synthetic
/* # direct methods */
 com.google.ads.e$2 ( ) {
/* .locals 0 */
/* .prologue */
/* .line 215 */
this.c = p1;
this.a = p2;
/* iput-boolean p3, p0, Lcom/google/ads/e$2;->b:Z */
/* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
return;
} // .end method
/* # virtual methods */
public void run ( ) {
/* .locals 3 */
/* .prologue */
/* .line 218 */
v0 = this.c;
com.google.ads.e .b ( v0 );
v1 = this.a;
/* iget-boolean v2, p0, Lcom/google/ads/e$2;->b:Z */
(( com.google.ads.internal.d ) v0 ).a ( v1, v2 ); // invoke-virtual {v0, v1, v2}, Lcom/google/ads/internal/d;->a(Lcom/google/ads/f;Z)V
/* .line 220 */
return;
} // .end method
