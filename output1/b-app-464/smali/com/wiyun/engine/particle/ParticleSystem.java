public abstract class com.wiyun.engine.particle.ParticleSystem extends com.wiyun.engine.nodes.Node implements com.wiyun.engine.nodes.Node$IBlendableTextureOwner {
	 /* # interfaces */
	 /* # static fields */
	 public static final Integer FREE;
	 public static final Integer GRAVITY;
	 public static final Integer GROUPED;
	 public static final Integer PARTICLE_DURATION_INFINITY;
	 public static final Integer PARTICLE_START_RADIUS_EQUAL_TO_END_RADIUS;
	 public static final Integer PARTICLE_START_SIZE_EQUAL_TO_END_SIZE;
	 public static final Integer RADIUS;
	 public static final Integer RELATIVE;
	 /* # direct methods */
	 protected com.wiyun.engine.particle.ParticleSystem ( ) {
		 /* .locals 0 */
		 /* invoke-direct {p0}, Lcom/wiyun/engine/nodes/Node;-><init>()V */
		 return;
	 } // .end method
	 protected com.wiyun.engine.particle.ParticleSystem ( ) {
		 /* .locals 0 */
		 /* invoke-direct {p0}, Lcom/wiyun/engine/nodes/Node;-><init>()V */
		 return;
	 } // .end method
	 protected com.wiyun.engine.particle.ParticleSystem ( ) {
		 /* .locals 0 */
		 /* invoke-direct {p0, p2}, Lcom/wiyun/engine/nodes/Node;-><init>(I)V */
		 return;
	 } // .end method
	 private native Integer getBlendFuncDst ( ) {
	 } // .end method
	 private native Integer getBlendFuncSrc ( ) {
	 } // .end method
	 private native Float getCenterOfGravityX ( ) {
	 } // .end method
	 private native Float getCenterOfGravityY ( ) {
	 } // .end method
	 private native Integer nativeGetTexture ( ) {
	 } // .end method
	 private native void setBlendFunc ( Integer p0, Integer p1 ) {
	 } // .end method
	 /* # virtual methods */
	 protected void doNativeInit ( ) {
		 /* .locals 0 */
		 return;
	 } // .end method
	 public com.wiyun.engine.types.WYBlendFunc getBlendFunc ( ) {
		 /* .locals 3 */
		 /* new-instance v0, Lcom/wiyun/engine/types/WYBlendFunc; */
		 v1 = 		 /* invoke-direct {p0}, Lcom/wiyun/engine/particle/ParticleSystem;->getBlendFuncSrc()I */
		 v2 = 		 /* invoke-direct {p0}, Lcom/wiyun/engine/particle/ParticleSystem;->getBlendFuncDst()I */
		 /* invoke-direct {v0, v1, v2}, Lcom/wiyun/engine/types/WYBlendFunc;-><init>(II)V */
	 } // .end method
	 public com.wiyun.engine.types.WYPoint getCenterOfGravity ( ) {
		 /* .locals 2 */
		 v0 = 		 /* invoke-direct {p0}, Lcom/wiyun/engine/particle/ParticleSystem;->getCenterOfGravityX()F */
		 v1 = 		 /* invoke-direct {p0}, Lcom/wiyun/engine/particle/ParticleSystem;->getCenterOfGravityY()F */
		 com.wiyun.engine.types.WYPoint .make ( v0,v1 );
	 } // .end method
	 public native Float getDuration ( ) {
	 } // .end method
	 public native Float getEmissionRate ( ) {
	 } // .end method
	 public native Integer getEmitterMode ( ) {
	 } // .end method
	 public native Float getLife ( ) {
	 } // .end method
	 public native Integer getMaxParticleCount ( ) {
	 } // .end method
	 public native Integer getParticleCount ( ) {
	 } // .end method
	 public native Integer getPositionType ( ) {
	 } // .end method
	 public com.wiyun.engine.opengl.Texture2D getTexture ( ) {
		 /* .locals 1 */
		 v0 = 		 /* invoke-direct {p0}, Lcom/wiyun/engine/particle/ParticleSystem;->nativeGetTexture()I */
		 com.wiyun.engine.opengl.Texture2D .from ( v0 );
	 } // .end method
	 public native Boolean isAutoRemoveOnFinish ( ) {
	 } // .end method
	 public native Boolean isBlendAdditive ( ) {
	 } // .end method
	 public native void resetSystem ( ) {
	 } // .end method
	 public native void setAutoRemoveOnFinish ( Boolean p0 ) {
	 } // .end method
	 public native void setBlendAdditive ( Boolean p0 ) {
	 } // .end method
	 public void setBlendFunc ( com.wiyun.engine.types.WYBlendFunc p0 ) {
		 /* .locals 2 */
		 /* iget v0, p1, Lcom/wiyun/engine/types/WYBlendFunc;->src:I */
		 /* iget v1, p1, Lcom/wiyun/engine/types/WYBlendFunc;->dst:I */
		 /* invoke-direct {p0, v0, v1}, Lcom/wiyun/engine/particle/ParticleSystem;->setBlendFunc(II)V */
		 return;
	 } // .end method
	 public native void setDirectionAngleVariance ( Float p0, Float p1 ) {
	 } // .end method
	 public native void setDuration ( Float p0 ) {
	 } // .end method
	 public native void setEmissionRate ( Float p0 ) {
	 } // .end method
	 public native void setEmitterMode ( Integer p0 ) {
	 } // .end method
	 public native void setEndColorVariance ( Float p0, Float p1, Float p2, Float p3, Float p4, Float p5, Float p6, Float p7 ) {
	 } // .end method
	 public native void setEndRadiusVariance ( Float p0, Float p1 ) {
	 } // .end method
	 public native void setEndSizeVariance ( Float p0, Float p1 ) {
	 } // .end method
	 public native void setEndSpinVariance ( Float p0, Float p1 ) {
	 } // .end method
	 public native void setLifeVariance ( Float p0, Float p1 ) {
	 } // .end method
	 public native void setParticleGravity ( Float p0, Float p1 ) {
	 } // .end method
	 public native void setParticlePositionVariance ( Float p0, Float p1, Float p2, Float p3 ) {
	 } // .end method
	 public native void setPositionType ( Integer p0 ) {
	 } // .end method
	 public native void setRadialAccelerationVariance ( Float p0, Float p1 ) {
	 } // .end method
	 public native void setRotationVariance ( Float p0, Float p1 ) {
	 } // .end method
	 public native void setSpeedVariance ( Float p0, Float p1 ) {
	 } // .end method
	 public native void setStartColorVariance ( Float p0, Float p1, Float p2, Float p3, Float p4, Float p5, Float p6, Float p7 ) {
	 } // .end method
	 public native void setStartRadiusVariance ( Float p0, Float p1 ) {
	 } // .end method
	 public native void setStartSizeVariance ( Float p0, Float p1 ) {
	 } // .end method
	 public native void setStartSpinVariance ( Float p0, Float p1 ) {
	 } // .end method
	 public native void setTangentialAccelerationVariance ( Float p0, Float p1 ) {
	 } // .end method
	 public native void setTexture ( com.wiyun.engine.opengl.Texture2D p0 ) {
	 } // .end method
	 public native void stopSystem ( ) {
	 } // .end method
