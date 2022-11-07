public class com.wiyun.engine.particle.QuadParticleSystem extends com.wiyun.engine.particle.ParticleSystem {
	 /* .source "QuadParticleSystem.java" */
	 /* # direct methods */
	 public com.wiyun.engine.particle.QuadParticleSystem ( ) {
		 /* .locals 0 */
		 /* .param p1, "numberOfParticles" # I */
		 /* .prologue */
		 /* .line 11 */
		 /* invoke-direct {p0}, Lcom/wiyun/engine/particle/ParticleSystem;-><init>()V */
		 /* .line 12 */
		 /* invoke-direct {p0, p1}, Lcom/wiyun/engine/particle/QuadParticleSystem;->nativeInit(I)V */
		 /* .line 13 */
		 return;
	 } // .end method
	 protected com.wiyun.engine.particle.QuadParticleSystem ( ) {
		 /* .locals 1 */
		 /* .param p1, "dummy" # I */
		 /* .param p2, "pointer" # I */
		 /* .prologue */
		 /* .line 26 */
		 int v0 = 0; // const/4 v0, 0x0
		 /* invoke-direct {p0, v0, p2}, Lcom/wiyun/engine/particle/ParticleSystem;-><init>(II)V */
		 /* .line 27 */
		 return;
	 } // .end method
	 public static com.wiyun.engine.nodes.Node from ( Integer p0 ) { //bridge//synthethic
		 /* .locals 1 */
		 /* .prologue */
		 /* .line 1 */
		 com.wiyun.engine.particle.QuadParticleSystem .from ( p0 );
	 } // .end method
	 public static com.wiyun.engine.particle.QuadParticleSystem from ( Integer p0 ) {
		 /* .locals 2 */
		 /* .param p0, "pointer" # I */
		 /* .prologue */
		 /* .line 22 */
		 /* if-nez p0, :cond_0 */
		 int v0 = 0; // const/4 v0, 0x0
	 } // :goto_0
} // :cond_0
/* new-instance v0, Lcom/wiyun/engine/particle/QuadParticleSystem; */
int v1 = 0; // const/4 v1, 0x0
/* invoke-direct {v0, v1, p0}, Lcom/wiyun/engine/particle/QuadParticleSystem;-><init>(II)V */
} // .end method
private native void nativeInit ( Integer p0 ) {
} // .end method
/* # virtual methods */
public native void setTexture ( com.wiyun.engine.opengl.Texture2D p0, com.wiyun.engine.types.WYRect p1 ) {
} // .end method
