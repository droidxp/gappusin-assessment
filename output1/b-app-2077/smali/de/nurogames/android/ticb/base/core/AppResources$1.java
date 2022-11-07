class de.nurogames.android.ticb.base.core.AppResources$1 extends java.lang.Thread {
	 /* .source "AppResources.java" */
	 /* # annotations */
	 /* .annotation system Ldalvik/annotation/EnclosingMethod; */
	 /* value = Lde/nurogames/android/ticb/base/core/AppResources;->playSFX(I)V */
} // .end annotation
/* .annotation system Ldalvik/annotation/InnerClass; */
/* accessFlags = 0x0 */
/* name = null */
} // .end annotation
/* # instance fields */
private final Integer val$index; //synthetic
/* # direct methods */
 de.nurogames.android.ticb.base.core.AppResources$1 ( ) {
/* .locals 0 */
/* .param p1, "$anonymous0" # Ljava/lang/String; */
/* .prologue */
/* .line 1 */
/* iput p2, p0, Lde/nurogames/android/ticb/base/core/AppResources$1;->val$index:I */
/* .line 1805 */
/* invoke-direct {p0, p1}, Ljava/lang/Thread;-><init>(Ljava/lang/String;)V */
return;
} // .end method
/* # virtual methods */
public void run ( ) {
/* .locals 7 */
/* .prologue */
/* .line 1807 */
v0 = de.nurogames.android.ticb.base.core.AppResources.mSoundPool;
v1 = de.nurogames.android.ticb.base.core.AppResources.mSoundPoolMap;
/* iget v2, p0, Lde/nurogames/android/ticb/base/core/AppResources$1;->val$index:I */
v1 = (( android.util.SparseIntArray ) v1 ).get ( v2 ); // invoke-virtual {v1, v2}, Landroid/util/SparseIntArray;->get(I)I
int v4 = 1; // const/4 v4, 0x1
int v5 = 0; // const/4 v5, 0x0
/* const/high16 v6, 0x3f800000 # 1.0f */
/* invoke-virtual/range {v0 ..v6}, Landroid/media/SoundPool;->play(IFFIIF)I */
/* .line 1808 */
return;
} // .end method
