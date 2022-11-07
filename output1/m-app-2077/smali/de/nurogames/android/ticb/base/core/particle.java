public class de.nurogames.android.ticb.base.core.particle {
	 /* .source "particle.java" */
	 /* # instance fields */
	 public Integer life;
	 public de.nurogames.android.ticb.base.core.Vector3D pos;
	 public de.nurogames.android.ticb.base.core.Vector3D vel;
	 /* # direct methods */
	 public de.nurogames.android.ticb.base.core.particle ( ) {
		 /* .locals 0 */
		 /* .param p1, "p" # Lde/nurogames/android/ticb/base/core/Vector3D; */
		 /* .param p2, "v" # Lde/nurogames/android/ticb/base/core/Vector3D; */
		 /* .param p3, "lifetime" # I */
		 /* .prologue */
		 /* .line 12 */
		 /* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
		 /* .line 14 */
		 this.pos = p1;
		 /* .line 15 */
		 this.vel = p2;
		 /* .line 16 */
		 /* iput p3, p0, Lde/nurogames/android/ticb/base/core/particle;->life:I */
		 /* .line 17 */
		 return;
	 } // .end method
