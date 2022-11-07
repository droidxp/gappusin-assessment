public class com.wiyun.engine.particle.ParticleLoader {
	 /* # direct methods */
	 public com.wiyun.engine.particle.ParticleLoader ( ) {
		 /* .locals 0 */
		 /* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
		 return;
	 } // .end method
	 public static com.wiyun.engine.particle.QuadParticleSystem load ( Integer p0 ) {
		 /* .locals 1 */
		 v0 = 		 com.wiyun.engine.particle.ParticleLoader .nativeLoad ( p0 );
		 com.wiyun.engine.particle.QuadParticleSystem .from ( v0 );
	 } // .end method
	 public static com.wiyun.engine.particle.QuadParticleSystem load ( java.lang.String p0 ) {
		 /* .locals 1 */
		 int v0 = 0; // const/4 v0, 0x0
		 com.wiyun.engine.particle.ParticleLoader .load ( p0,v0 );
	 } // .end method
	 public static com.wiyun.engine.particle.QuadParticleSystem load ( java.lang.String p0, Boolean p1 ) {
		 /* .locals 1 */
		 v0 = 		 com.wiyun.engine.nodes.Director .getDefaultInDensity ( );
		 com.wiyun.engine.particle.ParticleLoader .load ( p0,p1,v0 );
	 } // .end method
	 public static com.wiyun.engine.particle.QuadParticleSystem load ( java.lang.String p0, Boolean p1, Float p2 ) {
		 /* .locals 1 */
		 v0 = 		 com.wiyun.engine.particle.ParticleLoader .nativeLoad ( p0,p1,p2 );
		 com.wiyun.engine.particle.QuadParticleSystem .from ( v0 );
	 } // .end method
	 private static native Integer nativeLoad ( Integer p0 ) {
	 } // .end method
	 private static native Integer nativeLoad ( java.lang.String p0, Boolean p1, Float p2 ) {
	 } // .end method
