class de.nurogames.android.ticb.base.views.TinyBeeView$2 extends java.lang.Thread {
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
 de.nurogames.android.ticb.base.views.TinyBeeView$2 ( ) {
/* .locals 0 */
/* .param p2, "$anonymous0" # Ljava/lang/String; */
/* .prologue */
/* .line 1 */
this.this$0 = p1;
/* .line 352 */
/* invoke-direct {p0, p2}, Ljava/lang/Thread;-><init>(Ljava/lang/String;)V */
return;
} // .end method
/* # virtual methods */
public void run ( ) {
/* .locals 3 */
/* .prologue */
/* .line 354 */
v0 = de.nurogames.android.ticb.base.objects.objCam.camPos;
v1 = de.nurogames.android.ticb.base.objects.objBee.playerPos;
/* iget v1, v1, Lde/nurogames/android/ticb/base/core/Vector3D;->x:F */
v2 = this.this$0;
v2 = de.nurogames.android.ticb.base.views.TinyBeeView .access$1 ( v2 );
/* int-to-float v2, v2 */
/* sub-float/2addr v1, v2 */
/* iput v1, v0, Lde/nurogames/android/ticb/base/core/Vector3D;->x:F */
/* .line 355 */
return;
} // .end method
