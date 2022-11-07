class com.google.ads.internal.AdVideoView$a implements java.lang.Runnable {
	 /* .source "SourceFile" */
	 /* # interfaces */
	 /* # annotations */
	 /* .annotation system Ldalvik/annotation/EnclosingClass; */
	 /* value = Lcom/google/ads/internal/AdVideoView; */
} // .end annotation
/* .annotation system Ldalvik/annotation/InnerClass; */
/* accessFlags = 0xa */
/* name = "a" */
} // .end annotation
/* # instance fields */
private java.lang.ref.WeakReference a;
/* .annotation system Ldalvik/annotation/Signature; */
/* value = { */
/* "Ljava/lang/ref/WeakReference", */
/* "<", */
/* "Lcom/google/ads/internal/AdVideoView;", */
/* ">;" */
/* } */
} // .end annotation
} // .end field
private android.os.Handler b;
/* # direct methods */
public com.google.ads.internal.AdVideoView$a ( ) {
/* .locals 1 */
/* .prologue */
/* .line 51 */
/* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
/* .line 52 */
/* new-instance v0, Ljava/lang/ref/WeakReference; */
/* invoke-direct {v0, p1}, Ljava/lang/ref/WeakReference;-><init>(Ljava/lang/Object;)V */
this.a = v0;
/* .line 53 */
/* new-instance v0, Landroid/os/Handler; */
/* invoke-direct {v0}, Landroid/os/Handler;-><init>()V */
this.b = v0;
/* .line 54 */
return;
} // .end method
/* # virtual methods */
public void a ( ) {
/* .locals 3 */
/* .prologue */
/* .line 68 */
v0 = this.b;
/* const-wide/16 v1, 0xfa */
(( android.os.Handler ) v0 ).postDelayed ( p0, v1, v2 ); // invoke-virtual {v0, p0, v1, v2}, Landroid/os/Handler;->postDelayed(Ljava/lang/Runnable;J)Z
/* .line 69 */
return;
} // .end method
public void run ( ) {
/* .locals 3 */
/* .prologue */
/* .line 58 */
v0 = this.a;
(( java.lang.ref.WeakReference ) v0 ).get ( ); // invoke-virtual {v0}, Ljava/lang/ref/WeakReference;->get()Ljava/lang/Object;
/* check-cast v0, Lcom/google/ads/internal/AdVideoView; */
/* .line 59 */
/* if-nez v0, :cond_0 */
/* .line 60 */
final String v0 = "The video must be gone, so cancelling the timeupdate task."; // const-string v0, "The video must be gone, so cancelling the timeupdate task."
com.google.ads.util.b .d ( v0 );
/* .line 65 */
} // :goto_0
return;
/* .line 63 */
} // :cond_0
(( com.google.ads.internal.AdVideoView ) v0 ).f ( ); // invoke-virtual {v0}, Lcom/google/ads/internal/AdVideoView;->f()V
/* .line 64 */
v0 = this.b;
/* const-wide/16 v1, 0xfa */
(( android.os.Handler ) v0 ).postDelayed ( p0, v1, v2 ); // invoke-virtual {v0, p0, v1, v2}, Landroid/os/Handler;->postDelayed(Ljava/lang/Runnable;J)Z
} // .end method
