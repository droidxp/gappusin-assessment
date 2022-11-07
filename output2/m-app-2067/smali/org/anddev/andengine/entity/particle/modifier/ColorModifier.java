public class org.anddev.andengine.entity.particle.modifier.ColorModifier extends org.anddev.andengine.entity.particle.modifier.BaseTripleValueSpanModifier {
	 /* # direct methods */
	 public org.anddev.andengine.entity.particle.modifier.ColorModifier ( ) {
		 /* .locals 0 */
		 /* invoke-direct/range {p0 ..p8}, Lorg/anddev/andengine/entity/particle/modifier/BaseTripleValueSpanModifier;-><init>(FFFFFFFF)V */
		 return;
	 } // .end method
	 /* # virtual methods */
	 protected void onSetInitialValues ( org.anddev.andengine.entity.particle.Particle p0, Float p1, Float p2, Float p3 ) {
		 /* .locals 0 */
		 (( org.anddev.andengine.entity.particle.Particle ) p1 ).setColor ( p2, p3, p4 ); // invoke-virtual {p1, p2, p3, p4}, Lorg/anddev/andengine/entity/particle/Particle;->setColor(FFF)V
		 return;
	 } // .end method
	 protected void onSetValues ( org.anddev.andengine.entity.particle.Particle p0, Float p1, Float p2, Float p3 ) {
		 /* .locals 0 */
		 (( org.anddev.andengine.entity.particle.Particle ) p1 ).setColor ( p2, p3, p4 ); // invoke-virtual {p1, p2, p3, p4}, Lorg/anddev/andengine/entity/particle/Particle;->setColor(FFF)V
		 return;
	 } // .end method
