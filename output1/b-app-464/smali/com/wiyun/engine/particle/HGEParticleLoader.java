public class com.wiyun.engine.particle.HGEParticleLoader {
	 /* # direct methods */
	 public com.wiyun.engine.particle.HGEParticleLoader ( ) {
		 /* .locals 0 */
		 /* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
		 return;
	 } // .end method
	 public static com.wiyun.engine.particle.QuadParticleSystem load ( Integer p0, Integer p1, com.wiyun.engine.opengl.Texture2D p2 ) {
		 /* .locals 1 */
		 v0 = 		 com.wiyun.engine.particle.HGEParticleLoader .nativeLoad ( p0,p1,p2 );
		 com.wiyun.engine.particle.QuadParticleSystem .from ( v0 );
	 } // .end method
	 public static com.wiyun.engine.particle.QuadParticleSystem load ( java.lang.String p0, Integer p1, com.wiyun.engine.opengl.Texture2D p2 ) {
		 /* .locals 1 */
		 int v0 = 0; // const/4 v0, 0x0
		 com.wiyun.engine.particle.HGEParticleLoader .load ( p0,p1,p2,v0 );
	 } // .end method
	 public static com.wiyun.engine.particle.QuadParticleSystem load ( java.lang.String p0, Integer p1, com.wiyun.engine.opengl.Texture2D p2, Boolean p3 ) {
		 /* .locals 1 */
		 v0 = 		 com.wiyun.engine.nodes.Director .getDefaultInDensity ( );
		 com.wiyun.engine.particle.HGEParticleLoader .load ( p0,p1,p2,p3,v0 );
	 } // .end method
	 public static com.wiyun.engine.particle.QuadParticleSystem load ( java.lang.String p0, Integer p1, com.wiyun.engine.opengl.Texture2D p2, Boolean p3, Float p4 ) {
		 /* .locals 1 */
		 v0 = 		 com.wiyun.engine.particle.HGEParticleLoader .nativeLoad ( p0,p1,p2,p3,p4 );
		 com.wiyun.engine.particle.QuadParticleSystem .from ( v0 );
	 } // .end method
	 private static native Integer nativeLoad ( Integer p0, Integer p1, com.wiyun.engine.opengl.Texture2D p2 ) {
	 } // .end method
	 private static native Integer nativeLoad ( java.lang.String p0, Integer p1, com.wiyun.engine.opengl.Texture2D p2, Boolean p3, Float p4 ) {
	 } // .end method
