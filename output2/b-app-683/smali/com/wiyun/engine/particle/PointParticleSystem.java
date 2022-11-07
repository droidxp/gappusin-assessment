public class com.wiyun.engine.particle.PointParticleSystem extends com.wiyun.engine.particle.ParticleSystem {
	 /* .source "PointParticleSystem.java" */
	 /* # direct methods */
	 public com.wiyun.engine.particle.PointParticleSystem ( ) {
		 /* .locals 0 */
		 /* .param p1, "numberOfParticles" # I */
		 /* .prologue */
		 /* .line 8 */
		 /* invoke-direct {p0}, Lcom/wiyun/engine/particle/ParticleSystem;-><init>()V */
		 /* .line 9 */
		 /* invoke-direct {p0, p1}, Lcom/wiyun/engine/particle/PointParticleSystem;->nativeInit(I)V */
		 /* .line 10 */
		 return;
	 } // .end method
	 protected com.wiyun.engine.particle.PointParticleSystem ( ) {
		 /* .locals 1 */
		 /* .param p1, "dummy" # I */
		 /* .param p2, "pointer" # I */
		 /* .prologue */
		 /* .line 23 */
		 int v0 = 0; // const/4 v0, 0x0
		 /* invoke-direct {p0, v0, p2}, Lcom/wiyun/engine/particle/ParticleSystem;-><init>(II)V */
		 /* .line 24 */
		 return;
	 } // .end method
	 public static com.wiyun.engine.nodes.Node from ( Integer p0 ) { //bridge//synthethic
		 /* .locals 1 */
		 /* .prologue */
		 /* .line 1 */
		 com.wiyun.engine.particle.PointParticleSystem .from ( p0 );
	 } // .end method
	 public static com.wiyun.engine.particle.PointParticleSystem from ( Integer p0 ) {
		 /* .locals 2 */
		 /* .param p0, "pointer" # I */
		 /* .prologue */
		 /* .line 19 */
		 /* if-nez p0, :cond_0 */
		 int v0 = 0; // const/4 v0, 0x0
	 } // :goto_0
} // :cond_0
/* new-instance v0, Lcom/wiyun/engine/particle/PointParticleSystem; */
int v1 = 0; // const/4 v1, 0x0
/* invoke-direct {v0, v1, p0}, Lcom/wiyun/engine/particle/PointParticleSystem;-><init>(II)V */
} // .end method
private native void nativeInit ( Integer p0 ) {
} // .end method
