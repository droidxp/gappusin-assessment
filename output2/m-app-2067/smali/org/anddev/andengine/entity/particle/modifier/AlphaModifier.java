public class org.anddev.andengine.entity.particle.modifier.AlphaModifier extends org.anddev.andengine.entity.particle.modifier.BaseSingleValueSpanModifier {
	 /* # direct methods */
	 public org.anddev.andengine.entity.particle.modifier.AlphaModifier ( ) {
		 /* .locals 0 */
		 /* invoke-direct {p0, p1, p2, p3, p4}, Lorg/anddev/andengine/entity/particle/modifier/BaseSingleValueSpanModifier;-><init>(FFFF)V */
		 return;
	 } // .end method
	 /* # virtual methods */
	 protected void onSetInitialValue ( org.anddev.andengine.entity.particle.Particle p0, Float p1 ) {
		 /* .locals 0 */
		 (( org.anddev.andengine.entity.particle.Particle ) p1 ).setAlpha ( p2 ); // invoke-virtual {p1, p2}, Lorg/anddev/andengine/entity/particle/Particle;->setAlpha(F)V
		 return;
	 } // .end method
	 protected void onSetValue ( org.anddev.andengine.entity.particle.Particle p0, Float p1 ) {
		 /* .locals 0 */
		 (( org.anddev.andengine.entity.particle.Particle ) p1 ).setAlpha ( p2 ); // invoke-virtual {p1, p2}, Lorg/anddev/andengine/entity/particle/Particle;->setAlpha(F)V
		 return;
	 } // .end method
