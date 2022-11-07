class de.nurogames.android.ticb.base.views.TinyBeeView$3 extends java.lang.Thread {
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
 de.nurogames.android.ticb.base.views.TinyBeeView$3 ( ) {
/* .locals 0 */
/* .param p2, "$anonymous0" # Ljava/lang/String; */
/* .prologue */
/* .line 1 */
this.this$0 = p1;
/* .line 358 */
/* invoke-direct {p0, p2}, Ljava/lang/Thread;-><init>(Ljava/lang/String;)V */
return;
} // .end method
/* # virtual methods */
public void run ( ) {
/* .locals 1 */
/* .prologue */
/* .line 360 */
v0 = de.nurogames.android.ticb.base.views.TinyBeeView.terrain;
(( de.nurogames.android.ticb.base.objects.objTerrainMap ) v0 ).animatePollem ( ); // invoke-virtual {v0}, Lde/nurogames/android/ticb/base/objects/objTerrainMap;->animatePollem()V
/* .line 361 */
return;
} // .end method
