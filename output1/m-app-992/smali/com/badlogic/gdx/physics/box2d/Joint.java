public abstract class com.badlogic.gdx.physics.box2d.Joint {
	 /* # instance fields */
	 protected Long addr;
	 private final com.badlogic.gdx.math.Vector2 anchorA;
	 private final com.badlogic.gdx.math.Vector2 anchorB;
	 protected com.badlogic.gdx.physics.box2d.JointEdge jointEdgeA;
	 protected com.badlogic.gdx.physics.box2d.JointEdge jointEdgeB;
	 private final com.badlogic.gdx.math.Vector2 reactionForce;
	 private final tmp;
	 private final com.badlogic.gdx.physics.box2d.World world;
	 /* # direct methods */
	 protected com.badlogic.gdx.physics.box2d.Joint ( ) {
		 /* .locals 1 */
		 /* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
		 int v0 = 2; // const/4 v0, 0x2
		 /* new-array v0, v0, [F */
		 this.tmp = v0;
		 /* new-instance v0, Lcom/badlogic/gdx/math/Vector2; */
		 /* invoke-direct {v0}, Lcom/badlogic/gdx/math/Vector2;-><init>()V */
		 this.anchorA = v0;
		 /* new-instance v0, Lcom/badlogic/gdx/math/Vector2; */
		 /* invoke-direct {v0}, Lcom/badlogic/gdx/math/Vector2;-><init>()V */
		 this.anchorB = v0;
		 /* new-instance v0, Lcom/badlogic/gdx/math/Vector2; */
		 /* invoke-direct {v0}, Lcom/badlogic/gdx/math/Vector2;-><init>()V */
		 this.reactionForce = v0;
		 this.world = p1;
		 /* iput-wide p2, p0, Lcom/badlogic/gdx/physics/box2d/Joint;->addr:J */
		 return;
	 } // .end method
	 private native void jniGetAnchorA ( Long p0, Float[] p1 ) {
	 } // .end method
	 private native void jniGetAnchorB ( Long p0, Float[] p1 ) {
	 } // .end method
	 private native Long jniGetBodyA ( Long p0 ) {
	 } // .end method
	 private native Long jniGetBodyB ( Long p0 ) {
	 } // .end method
	 private native void jniGetReactionForce ( Long p0, Float p1, Float[] p2 ) {
	 } // .end method
	 private native Float jniGetReactionTorque ( Long p0, Float p1 ) {
	 } // .end method
	 private native Integer jniGetType ( Long p0 ) {
	 } // .end method
	 private native Boolean jniIsActive ( Long p0 ) {
	 } // .end method
	 /* # virtual methods */
	 public com.badlogic.gdx.math.Vector2 getAnchorA ( ) {
		 /* .locals 3 */
		 /* iget-wide v0, p0, Lcom/badlogic/gdx/physics/box2d/Joint;->addr:J */
		 v2 = this.tmp;
		 /* invoke-direct {p0, v0, v1, v2}, Lcom/badlogic/gdx/physics/box2d/Joint;->jniGetAnchorA(J[F)V */
		 v0 = this.anchorA;
		 v1 = this.tmp;
		 int v2 = 0; // const/4 v2, 0x0
		 /* aget v1, v1, v2 */
		 /* iput v1, v0, Lcom/badlogic/gdx/math/Vector2;->x:F */
		 v0 = this.anchorA;
		 v1 = this.tmp;
		 int v2 = 1; // const/4 v2, 0x1
		 /* aget v1, v1, v2 */
		 /* iput v1, v0, Lcom/badlogic/gdx/math/Vector2;->y:F */
		 v0 = this.anchorA;
	 } // .end method
	 public com.badlogic.gdx.math.Vector2 getAnchorB ( ) {
		 /* .locals 3 */
		 /* iget-wide v0, p0, Lcom/badlogic/gdx/physics/box2d/Joint;->addr:J */
		 v2 = this.tmp;
		 /* invoke-direct {p0, v0, v1, v2}, Lcom/badlogic/gdx/physics/box2d/Joint;->jniGetAnchorB(J[F)V */
		 v0 = this.anchorB;
		 v1 = this.tmp;
		 int v2 = 0; // const/4 v2, 0x0
		 /* aget v1, v1, v2 */
		 /* iput v1, v0, Lcom/badlogic/gdx/math/Vector2;->x:F */
		 v0 = this.anchorB;
		 v1 = this.tmp;
		 int v2 = 1; // const/4 v2, 0x1
		 /* aget v1, v1, v2 */
		 /* iput v1, v0, Lcom/badlogic/gdx/math/Vector2;->y:F */
		 v0 = this.anchorB;
	 } // .end method
	 public com.badlogic.gdx.physics.box2d.Body getBodyA ( ) {
		 /* .locals 3 */
		 v0 = this.world;
		 v0 = this.bodies;
		 /* iget-wide v1, p0, Lcom/badlogic/gdx/physics/box2d/Joint;->addr:J */
		 /* invoke-direct {p0, v1, v2}, Lcom/badlogic/gdx/physics/box2d/Joint;->jniGetBodyA(J)J */
		 /* move-result-wide v1 */
		 (( com.badlogic.gdx.utils.LongMap ) v0 ).get ( v1, v2 ); // invoke-virtual {v0, v1, v2}, Lcom/badlogic/gdx/utils/LongMap;->get(J)Ljava/lang/Object;
		 /* check-cast p0, Lcom/badlogic/gdx/physics/box2d/Body; */
	 } // .end method
	 public com.badlogic.gdx.physics.box2d.Body getBodyB ( ) {
		 /* .locals 3 */
		 v0 = this.world;
		 v0 = this.bodies;
		 /* iget-wide v1, p0, Lcom/badlogic/gdx/physics/box2d/Joint;->addr:J */
		 /* invoke-direct {p0, v1, v2}, Lcom/badlogic/gdx/physics/box2d/Joint;->jniGetBodyB(J)J */
		 /* move-result-wide v1 */
		 (( com.badlogic.gdx.utils.LongMap ) v0 ).get ( v1, v2 ); // invoke-virtual {v0, v1, v2}, Lcom/badlogic/gdx/utils/LongMap;->get(J)Ljava/lang/Object;
		 /* check-cast p0, Lcom/badlogic/gdx/physics/box2d/Body; */
	 } // .end method
	 public com.badlogic.gdx.math.Vector2 getReactionForce ( Float p0 ) {
		 /* .locals 3 */
		 /* iget-wide v0, p0, Lcom/badlogic/gdx/physics/box2d/Joint;->addr:J */
		 v2 = this.tmp;
		 /* invoke-direct {p0, v0, v1, p1, v2}, Lcom/badlogic/gdx/physics/box2d/Joint;->jniGetReactionForce(JF[F)V */
		 v0 = this.reactionForce;
		 v1 = this.tmp;
		 int v2 = 0; // const/4 v2, 0x0
		 /* aget v1, v1, v2 */
		 /* iput v1, v0, Lcom/badlogic/gdx/math/Vector2;->x:F */
		 v0 = this.reactionForce;
		 v1 = this.tmp;
		 int v2 = 1; // const/4 v2, 0x1
		 /* aget v1, v1, v2 */
		 /* iput v1, v0, Lcom/badlogic/gdx/math/Vector2;->y:F */
		 v0 = this.reactionForce;
	 } // .end method
	 public Float getReactionTorque ( Float p0 ) {
		 /* .locals 2 */
		 /* iget-wide v0, p0, Lcom/badlogic/gdx/physics/box2d/Joint;->addr:J */
		 v0 = 		 /* invoke-direct {p0, v0, v1, p1}, Lcom/badlogic/gdx/physics/box2d/Joint;->jniGetReactionTorque(JF)F */
	 } // .end method
	 public com.badlogic.gdx.physics.box2d.JointDef$JointType getType ( ) {
		 /* .locals 2 */
		 /* iget-wide v0, p0, Lcom/badlogic/gdx/physics/box2d/Joint;->addr:J */
		 v0 = 		 /* invoke-direct {p0, v0, v1}, Lcom/badlogic/gdx/physics/box2d/Joint;->jniGetType(J)I */
		 /* if-lez v0, :cond_0 */
		 v1 = com.badlogic.gdx.physics.box2d.JointDef$JointType.valueTypes;
		 /* array-length v1, v1 */
		 /* if-ge v0, v1, :cond_0 */
		 v1 = com.badlogic.gdx.physics.box2d.JointDef$JointType.valueTypes;
		 /* aget-object v0, v1, v0 */
	 } // :goto_0
} // :cond_0
v0 = com.badlogic.gdx.physics.box2d.JointDef$JointType.Unknown;
} // .end method
public Boolean isActive ( ) {
/* .locals 2 */
/* iget-wide v0, p0, Lcom/badlogic/gdx/physics/box2d/Joint;->addr:J */
v0 = /* invoke-direct {p0, v0, v1}, Lcom/badlogic/gdx/physics/box2d/Joint;->jniIsActive(J)Z */
} // .end method
