class de.nurogames.android.ticb.base.views.TinyBeeView$1 extends java.lang.Thread {
	 /* .source "TinyBeeView.java" */
	 /* # annotations */
	 /* .annotation system Ldalvik/annotation/EnclosingClass; */
	 /* value = Lde/nurogames/android/ticb/base/views/TinyBeeView; */
} // .end annotation
/* .annotation system Ldalvik/annotation/InnerClass; */
/* accessFlags = 0x0 */
/* name = null */
} // .end annotation
/* # instance fields */
final de.nurogames.android.ticb.base.views.TinyBeeView this$0; //synthetic
/* # direct methods */
 de.nurogames.android.ticb.base.views.TinyBeeView$1 ( ) {
/* .locals 0 */
/* .param p2, "$anonymous0" # Ljava/lang/String; */
/* .prologue */
/* .line 1 */
this.this$0 = p1;
/* .line 342 */
/* invoke-direct {p0, p2}, Ljava/lang/Thread;-><init>(Ljava/lang/String;)V */
return;
} // .end method
/* # virtual methods */
public void run ( ) {
/* .locals 1 */
/* .prologue */
/* .line 345 */
v0 = this.this$0;
de.nurogames.android.ticb.base.views.TinyBeeView .access$0 ( v0 );
/* .line 348 */
v0 = de.nurogames.android.ticb.base.views.TinyBeeView.player;
(( de.nurogames.android.ticb.base.objects.objBee ) v0 ).playerPhysics ( ); // invoke-virtual {v0}, Lde/nurogames/android/ticb/base/objects/objBee;->playerPhysics()V
/* .line 349 */
v0 = de.nurogames.android.ticb.base.views.TinyBeeView.player;
(( de.nurogames.android.ticb.base.objects.objBee ) v0 ).animate ( ); // invoke-virtual {v0}, Lde/nurogames/android/ticb/base/objects/objBee;->animate()V
/* .line 350 */
return;
} // .end method
