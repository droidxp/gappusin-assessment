public class com.google.ads.ab implements java.lang.Runnable {
	 /* .source "SourceFile" */
	 /* # interfaces */
	 /* # instance fields */
	 private java.lang.ref.WeakReference a;
	 /* .annotation system Ldalvik/annotation/Signature; */
	 /* value = { */
	 /* "Ljava/lang/ref/WeakReference", */
	 /* "<", */
	 /* "Lcom/google/ads/internal/d;", */
	 /* ">;" */
	 /* } */
} // .end annotation
} // .end field
/* # direct methods */
public com.google.ads.ab ( ) {
/* .locals 1 */
/* .prologue */
/* .line 30 */
/* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
/* .line 31 */
/* new-instance v0, Ljava/lang/ref/WeakReference; */
/* invoke-direct {v0, p1}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V */
this.a = v0;
/* .line 32 */
return;
} // .end method
/* # virtual methods */
public void run ( ) {
/* .locals 1 */
/* .prologue */
/* .line 44 */
v0 = this.a;
(( java.lang.ref.WeakReference ) v0 ).get ( ); // invoke-virtual {v0}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;
/* check-cast v0, Lcom/google/ads/internal/d; */
/* .line 45 */
/* if-nez v0, :cond_0 */
/* .line 46 */
final String v0 = "The ad must be gone, so cancelling the refresh timer."; // const-string v0, "The ad must be gone, so cancelling the refresh timer."
com.google.ads.util.b .a ( v0 );
/* .line 50 */
} // :goto_0
return;
/* .line 49 */
} // :cond_0
(( com.google.ads.internal.d ) v0 ).x ( ); // invoke-virtual {v0}, Lcom/google/ads/internal/d;->x()V
} // .end method
