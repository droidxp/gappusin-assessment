public class org.anddev.andengine.entity.particle.modifier.ExpireModifier implements org.anddev.andengine.entity.particle.modifier.IParticleModifier {
	 /* # interfaces */
	 /* # instance fields */
	 private Float mMaxLifeTime;
	 private Float mMinLifeTime;
	 /* # direct methods */
	 public org.anddev.andengine.entity.particle.modifier.ExpireModifier ( ) {
		 /* .locals 0 */
		 /* invoke-direct {p0, p1, p1}, Lorg/anddev/andengine/entity/particle/modifier/ExpireModifier;-><init>(FF)V */
		 return;
	 } // .end method
	 public org.anddev.andengine.entity.particle.modifier.ExpireModifier ( ) {
		 /* .locals 0 */
		 /* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
		 /* iput p1, p0, Lorg/anddev/andengine/entity/particle/modifier/ExpireModifier;->mMinLifeTime:F */
		 /* iput p2, p0, Lorg/anddev/andengine/entity/particle/modifier/ExpireModifier;->mMaxLifeTime:F */
		 return;
	 } // .end method
	 /* # virtual methods */
	 public Float getMaxLifeTime ( ) {
		 /* .locals 1 */
		 /* iget v0, p0, Lorg/anddev/andengine/entity/particle/modifier/ExpireModifier;->mMaxLifeTime:F */
	 } // .end method
	 public Float getMinLifeTime ( ) {
		 /* .locals 1 */
		 /* iget v0, p0, Lorg/anddev/andengine/entity/particle/modifier/ExpireModifier;->mMinLifeTime:F */
	 } // .end method
	 public void onInitializeParticle ( org.anddev.andengine.entity.particle.Particle p0 ) {
		 /* .locals 3 */
		 v0 = org.anddev.andengine.util.MathUtils.RANDOM;
		 v0 = 		 (( java.util.Random ) v0 ).nextFloat ( ); // invoke-virtual {v0}, Ljava/util/Random;->nextFloat()F
		 /* iget v1, p0, Lorg/anddev/andengine/entity/particle/modifier/ExpireModifier;->mMaxLifeTime:F */
		 /* iget v2, p0, Lorg/anddev/andengine/entity/particle/modifier/ExpireModifier;->mMinLifeTime:F */
		 /* sub-float/2addr v1, v2 */
		 /* mul-float/2addr v0, v1 */
		 /* iget v1, p0, Lorg/anddev/andengine/entity/particle/modifier/ExpireModifier;->mMinLifeTime:F */
		 /* add-float/2addr v0, v1 */
		 (( org.anddev.andengine.entity.particle.Particle ) p1 ).setDeathTime ( v0 ); // invoke-virtual {p1, v0}, Lorg/anddev/andengine/entity/particle/Particle;->setDeathTime(F)V
		 return;
	 } // .end method
	 public void onUpdateParticle ( org.anddev.andengine.entity.particle.Particle p0 ) {
		 /* .locals 0 */
		 return;
	 } // .end method
	 public void setLifeTime ( Float p0 ) {
		 /* .locals 0 */
		 /* iput p1, p0, Lorg/anddev/andengine/entity/particle/modifier/ExpireModifier;->mMinLifeTime:F */
		 /* iput p1, p0, Lorg/anddev/andengine/entity/particle/modifier/ExpireModifier;->mMaxLifeTime:F */
		 return;
	 } // .end method
	 public void setLifeTime ( Float p0, Float p1 ) {
		 /* .locals 0 */
		 /* iput p1, p0, Lorg/anddev/andengine/entity/particle/modifier/ExpireModifier;->mMinLifeTime:F */
		 /* iput p2, p0, Lorg/anddev/andengine/entity/particle/modifier/ExpireModifier;->mMaxLifeTime:F */
		 return;
	 } // .end method
