public class com.badlogic.gdx.physics.box2d.Body {
	 /* # instance fields */
	 protected Long addr;
	 private java.util.ArrayList fixtures;
	 protected java.util.ArrayList joints;
	 public final com.badlogic.gdx.math.Vector2 linVelLoc;
	 public final com.badlogic.gdx.math.Vector2 linVelWorld;
	 private final com.badlogic.gdx.math.Vector2 linearVelocity;
	 private final com.badlogic.gdx.math.Vector2 localCenter;
	 private final com.badlogic.gdx.math.Vector2 localPoint;
	 public final com.badlogic.gdx.math.Vector2 localPoint2;
	 public final com.badlogic.gdx.math.Vector2 localVector;
	 private final com.badlogic.gdx.physics.box2d.MassData massData;
	 private final com.badlogic.gdx.math.Vector2 position;
	 private final tmp;
	 private final com.badlogic.gdx.physics.box2d.Transform transform;
	 private java.lang.Object userData;
	 private final com.badlogic.gdx.physics.box2d.World world;
	 private final com.badlogic.gdx.math.Vector2 worldCenter;
	 private final com.badlogic.gdx.math.Vector2 worldVector;
	 /* # direct methods */
	 protected com.badlogic.gdx.physics.box2d.Body ( ) {
		 /* .locals 2 */
		 int v1 = 2; // const/4 v1, 0x2
		 /* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
		 int v0 = 4; // const/4 v0, 0x4
		 /* new-array v0, v0, [F */
		 this.tmp = v0;
		 /* new-instance v0, Ljava/util/ArrayList; */
		 /* invoke-direct {v0, v1}, Ljava/util/ArrayList;-><init>(I)V */
		 this.fixtures = v0;
		 /* new-instance v0, Ljava/util/ArrayList; */
		 /* invoke-direct {v0, v1}, Ljava/util/ArrayList;-><init>(I)V */
		 this.joints = v0;
		 /* new-instance v0, Lcom/badlogic/gdx/physics/box2d/Transform; */
		 /* invoke-direct {v0}, Lcom/badlogic/gdx/physics/box2d/Transform;-><init>()V */
		 this.transform = v0;
		 /* new-instance v0, Lcom/badlogic/gdx/math/Vector2; */
		 /* invoke-direct {v0}, Lcom/badlogic/gdx/math/Vector2;-><init>()V */
		 this.position = v0;
		 /* new-instance v0, Lcom/badlogic/gdx/math/Vector2; */
		 /* invoke-direct {v0}, Lcom/badlogic/gdx/math/Vector2;-><init>()V */
		 this.worldCenter = v0;
		 /* new-instance v0, Lcom/badlogic/gdx/math/Vector2; */
		 /* invoke-direct {v0}, Lcom/badlogic/gdx/math/Vector2;-><init>()V */
		 this.localCenter = v0;
		 /* new-instance v0, Lcom/badlogic/gdx/math/Vector2; */
		 /* invoke-direct {v0}, Lcom/badlogic/gdx/math/Vector2;-><init>()V */
		 this.linearVelocity = v0;
		 /* new-instance v0, Lcom/badlogic/gdx/physics/box2d/MassData; */
		 /* invoke-direct {v0}, Lcom/badlogic/gdx/physics/box2d/MassData;-><init>()V */
		 this.massData = v0;
		 /* new-instance v0, Lcom/badlogic/gdx/math/Vector2; */
		 /* invoke-direct {v0}, Lcom/badlogic/gdx/math/Vector2;-><init>()V */
		 this.localPoint = v0;
		 /* new-instance v0, Lcom/badlogic/gdx/math/Vector2; */
		 /* invoke-direct {v0}, Lcom/badlogic/gdx/math/Vector2;-><init>()V */
		 this.worldVector = v0;
		 /* new-instance v0, Lcom/badlogic/gdx/math/Vector2; */
		 /* invoke-direct {v0}, Lcom/badlogic/gdx/math/Vector2;-><init>()V */
		 this.localPoint2 = v0;
		 /* new-instance v0, Lcom/badlogic/gdx/math/Vector2; */
		 /* invoke-direct {v0}, Lcom/badlogic/gdx/math/Vector2;-><init>()V */
		 this.localVector = v0;
		 /* new-instance v0, Lcom/badlogic/gdx/math/Vector2; */
		 /* invoke-direct {v0}, Lcom/badlogic/gdx/math/Vector2;-><init>()V */
		 this.linVelWorld = v0;
		 /* new-instance v0, Lcom/badlogic/gdx/math/Vector2; */
		 /* invoke-direct {v0}, Lcom/badlogic/gdx/math/Vector2;-><init>()V */
		 this.linVelLoc = v0;
		 this.world = p1;
		 /* iput-wide p2, p0, Lcom/badlogic/gdx/physics/box2d/Body;->addr:J */
		 return;
	 } // .end method
	 private native void jniApplyAngularImpulse ( Long p0, Float p1 ) {
	 } // .end method
	 private native void jniApplyForce ( Long p0, Float p1, Float p2, Float p3, Float p4 ) {
	 } // .end method
	 private native void jniApplyForceToCenter ( Long p0, Float p1, Float p2 ) {
	 } // .end method
	 private native void jniApplyLinearImpulse ( Long p0, Float p1, Float p2, Float p3, Float p4 ) {
	 } // .end method
	 private native void jniApplyTorque ( Long p0, Float p1 ) {
	 } // .end method
	 private native Long jniCreateFixture ( Long p0, Long p1, Float p2 ) {
	 } // .end method
	 private native Long jniCreateFixture ( Long p0, Long p1, Float p2, Float p3, Float p4, Boolean p5, Object p6, Object p7, Object p8 ) {
	 } // .end method
	 private native void jniDestroyFixture ( Long p0, Long p1 ) {
	 } // .end method
	 private native Float jniGetAngle ( Long p0 ) {
	 } // .end method
	 private native Float jniGetAngularDamping ( Long p0 ) {
	 } // .end method
	 private native Float jniGetAngularVelocity ( Long p0 ) {
	 } // .end method
	 private native Float jniGetGravityScale ( Long p0 ) {
	 } // .end method
	 private native Float jniGetInertia ( Long p0 ) {
	 } // .end method
	 private native Float jniGetLinearDamping ( Long p0 ) {
	 } // .end method
	 private native void jniGetLinearVelocity ( Long p0, Float[] p1 ) {
	 } // .end method
	 private native void jniGetLinearVelocityFromLocalPoint ( Long p0, Float p1, Float p2, Float[] p3 ) {
	 } // .end method
	 private native void jniGetLinearVelocityFromWorldPoint ( Long p0, Float p1, Float p2, Float[] p3 ) {
	 } // .end method
	 private native void jniGetLocalCenter ( Long p0, Float[] p1 ) {
	 } // .end method
	 private native void jniGetLocalPoint ( Long p0, Float p1, Float p2, Float[] p3 ) {
	 } // .end method
	 private native void jniGetLocalVector ( Long p0, Float p1, Float p2, Float[] p3 ) {
	 } // .end method
	 private native Float jniGetMass ( Long p0 ) {
	 } // .end method
	 private native void jniGetMassData ( Long p0, Float[] p1 ) {
	 } // .end method
	 private native void jniGetPosition ( Long p0, Float[] p1 ) {
	 } // .end method
	 private native void jniGetTransform ( Long p0, Float[] p1 ) {
	 } // .end method
	 private native Integer jniGetType ( Long p0 ) {
	 } // .end method
	 private native void jniGetWorldCenter ( Long p0, Float[] p1 ) {
	 } // .end method
	 private native void jniGetWorldPoint ( Long p0, Float p1, Float p2, Float[] p3 ) {
	 } // .end method
	 private native void jniGetWorldVector ( Long p0, Float p1, Float p2, Float[] p3 ) {
	 } // .end method
	 private native Boolean jniIsActive ( Long p0 ) {
	 } // .end method
	 private native Boolean jniIsAwake ( Long p0 ) {
	 } // .end method
	 private native Boolean jniIsBullet ( Long p0 ) {
	 } // .end method
	 private native Boolean jniIsFixedRotation ( Long p0 ) {
	 } // .end method
	 private native Boolean jniIsSleepingAllowed ( Long p0 ) {
	 } // .end method
	 private native void jniResetMassData ( Long p0 ) {
	 } // .end method
	 private native void jniSetActive ( Long p0, Boolean p1 ) {
	 } // .end method
	 private native void jniSetAngularDamping ( Long p0, Float p1 ) {
	 } // .end method
	 private native void jniSetAngularVelocity ( Long p0, Float p1 ) {
	 } // .end method
	 private native void jniSetAwake ( Long p0, Boolean p1 ) {
	 } // .end method
	 private native void jniSetBullet ( Long p0, Boolean p1 ) {
	 } // .end method
	 private native void jniSetFixedRotation ( Long p0, Boolean p1 ) {
	 } // .end method
	 private native void jniSetGravityScale ( Long p0, Float p1 ) {
	 } // .end method
	 private native void jniSetLinearDamping ( Long p0, Float p1 ) {
	 } // .end method
	 private native void jniSetLinearVelocity ( Long p0, Float p1, Float p2 ) {
	 } // .end method
	 private native void jniSetMassData ( Long p0, Float p1, Float p2, Float p3, Float p4 ) {
	 } // .end method
	 private native void jniSetSleepingAllowed ( Long p0, Boolean p1 ) {
	 } // .end method
	 private native void jniSetTransform ( Long p0, Float p1, Float p2, Float p3 ) {
	 } // .end method
	 private native void jniSetType ( Long p0, Integer p1 ) {
	 } // .end method
	 /* # virtual methods */
	 public void applyAngularImpulse ( Float p0 ) {
		 /* .locals 2 */
		 /* iget-wide v0, p0, Lcom/badlogic/gdx/physics/box2d/Body;->addr:J */
		 /* invoke-direct {p0, v0, v1, p1}, Lcom/badlogic/gdx/physics/box2d/Body;->jniApplyAngularImpulse(JF)V */
		 return;
	 } // .end method
	 public void applyForce ( Float p0, Float p1, Float p2, Float p3 ) {
		 /* .locals 7 */
		 /* iget-wide v1, p0, Lcom/badlogic/gdx/physics/box2d/Body;->addr:J */
		 /* move-object v0, p0 */
		 /* move v3, p1 */
		 /* move v4, p2 */
		 /* move v5, p3 */
		 /* move v6, p4 */
		 /* invoke-direct/range {v0 ..v6}, Lcom/badlogic/gdx/physics/box2d/Body;->jniApplyForce(JFFFF)V */
		 return;
	 } // .end method
	 public void applyForce ( com.badlogic.gdx.math.Vector2 p0, com.badlogic.gdx.math.Vector2 p1 ) {
		 /* .locals 7 */
		 /* iget-wide v1, p0, Lcom/badlogic/gdx/physics/box2d/Body;->addr:J */
		 /* iget v3, p1, Lcom/badlogic/gdx/math/Vector2;->x:F */
		 /* iget v4, p1, Lcom/badlogic/gdx/math/Vector2;->y:F */
		 /* iget v5, p2, Lcom/badlogic/gdx/math/Vector2;->x:F */
		 /* iget v6, p2, Lcom/badlogic/gdx/math/Vector2;->y:F */
		 /* move-object v0, p0 */
		 /* invoke-direct/range {v0 ..v6}, Lcom/badlogic/gdx/physics/box2d/Body;->jniApplyForce(JFFFF)V */
		 return;
	 } // .end method
	 public void applyForceToCenter ( Float p0, Float p1 ) {
		 /* .locals 2 */
		 /* iget-wide v0, p0, Lcom/badlogic/gdx/physics/box2d/Body;->addr:J */
		 /* invoke-direct {p0, v0, v1, p1, p2}, Lcom/badlogic/gdx/physics/box2d/Body;->jniApplyForceToCenter(JFF)V */
		 return;
	 } // .end method
	 public void applyForceToCenter ( com.badlogic.gdx.math.Vector2 p0 ) {
		 /* .locals 4 */
		 /* iget-wide v0, p0, Lcom/badlogic/gdx/physics/box2d/Body;->addr:J */
		 /* iget v2, p1, Lcom/badlogic/gdx/math/Vector2;->x:F */
		 /* iget v3, p1, Lcom/badlogic/gdx/math/Vector2;->y:F */
		 /* invoke-direct {p0, v0, v1, v2, v3}, Lcom/badlogic/gdx/physics/box2d/Body;->jniApplyForceToCenter(JFF)V */
		 return;
	 } // .end method
	 public void applyLinearImpulse ( Float p0, Float p1, Float p2, Float p3 ) {
		 /* .locals 7 */
		 /* iget-wide v1, p0, Lcom/badlogic/gdx/physics/box2d/Body;->addr:J */
		 /* move-object v0, p0 */
		 /* move v3, p1 */
		 /* move v4, p2 */
		 /* move v5, p3 */
		 /* move v6, p4 */
		 /* invoke-direct/range {v0 ..v6}, Lcom/badlogic/gdx/physics/box2d/Body;->jniApplyLinearImpulse(JFFFF)V */
		 return;
	 } // .end method
	 public void applyLinearImpulse ( com.badlogic.gdx.math.Vector2 p0, com.badlogic.gdx.math.Vector2 p1 ) {
		 /* .locals 7 */
		 /* iget-wide v1, p0, Lcom/badlogic/gdx/physics/box2d/Body;->addr:J */
		 /* iget v3, p1, Lcom/badlogic/gdx/math/Vector2;->x:F */
		 /* iget v4, p1, Lcom/badlogic/gdx/math/Vector2;->y:F */
		 /* iget v5, p2, Lcom/badlogic/gdx/math/Vector2;->x:F */
		 /* iget v6, p2, Lcom/badlogic/gdx/math/Vector2;->y:F */
		 /* move-object v0, p0 */
		 /* invoke-direct/range {v0 ..v6}, Lcom/badlogic/gdx/physics/box2d/Body;->jniApplyLinearImpulse(JFFFF)V */
		 return;
	 } // .end method
	 public void applyTorque ( Float p0 ) {
		 /* .locals 2 */
		 /* iget-wide v0, p0, Lcom/badlogic/gdx/physics/box2d/Body;->addr:J */
		 /* invoke-direct {p0, v0, v1, p1}, Lcom/badlogic/gdx/physics/box2d/Body;->jniApplyTorque(JF)V */
		 return;
	 } // .end method
	 public com.badlogic.gdx.physics.box2d.Fixture createFixture ( com.badlogic.gdx.physics.box2d.FixtureDef p0 ) {
		 /* .locals 12 */
		 /* iget-wide v1, p0, Lcom/badlogic/gdx/physics/box2d/Body;->addr:J */
		 v0 = this.shape;
		 /* iget-wide v3, v0, Lcom/badlogic/gdx/physics/box2d/Shape;->addr:J */
		 /* iget v5, p1, Lcom/badlogic/gdx/physics/box2d/FixtureDef;->friction:F */
		 /* iget v6, p1, Lcom/badlogic/gdx/physics/box2d/FixtureDef;->restitution:F */
		 /* iget v7, p1, Lcom/badlogic/gdx/physics/box2d/FixtureDef;->density:F */
		 /* iget-boolean v8, p1, Lcom/badlogic/gdx/physics/box2d/FixtureDef;->isSensor:Z */
		 v0 = this.filter;
		 /* iget-short v9, v0, Lcom/badlogic/gdx/physics/box2d/Filter;->categoryBits:S */
		 v0 = this.filter;
		 /* iget-short v10, v0, Lcom/badlogic/gdx/physics/box2d/Filter;->maskBits:S */
		 v0 = this.filter;
		 /* iget-short v11, v0, Lcom/badlogic/gdx/physics/box2d/Filter;->groupIndex:S */
		 /* move-object v0, p0 */
		 /* invoke-direct/range {v0 ..v11}, Lcom/badlogic/gdx/physics/box2d/Body;->jniCreateFixture(JJFFFZSSS)J */
		 /* move-result-wide v1 */
		 v0 = this.world;
		 v0 = this.freeFixtures;
		 (( com.badlogic.gdx.utils.Pool ) v0 ).obtain ( ); // invoke-virtual {v0}, Lcom/badlogic/gdx/utils/Pool;->obtain()Ljava/lang/Object;
		 /* check-cast v0, Lcom/badlogic/gdx/physics/box2d/Fixture; */
		 (( com.badlogic.gdx.physics.box2d.Fixture ) v0 ).reset ( p0, v1, v2 ); // invoke-virtual {v0, p0, v1, v2}, Lcom/badlogic/gdx/physics/box2d/Fixture;->reset(Lcom/badlogic/gdx/physics/box2d/Body;J)V
		 v1 = this.world;
		 v1 = this.fixtures;
		 /* iget-wide v2, v0, Lcom/badlogic/gdx/physics/box2d/Fixture;->addr:J */
		 (( com.badlogic.gdx.utils.LongMap ) v1 ).put ( v2, v3, v0 ); // invoke-virtual {v1, v2, v3, v0}, Lcom/badlogic/gdx/utils/LongMap;->put(JLjava/lang/Object;)Ljava/lang/Object;
		 v1 = this.fixtures;
		 (( java.util.ArrayList ) v1 ).add ( v0 ); // invoke-virtual {v1, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z
	 } // .end method
	 public com.badlogic.gdx.physics.box2d.Fixture createFixture ( com.badlogic.gdx.physics.box2d.Shape p0, Float p1 ) {
		 /* .locals 6 */
		 /* iget-wide v1, p0, Lcom/badlogic/gdx/physics/box2d/Body;->addr:J */
		 /* iget-wide v3, p1, Lcom/badlogic/gdx/physics/box2d/Shape;->addr:J */
		 /* move-object v0, p0 */
		 /* move v5, p2 */
		 /* invoke-direct/range {v0 ..v5}, Lcom/badlogic/gdx/physics/box2d/Body;->jniCreateFixture(JJF)J */
		 /* move-result-wide v1 */
		 v0 = this.world;
		 v0 = this.freeFixtures;
		 (( com.badlogic.gdx.utils.Pool ) v0 ).obtain ( ); // invoke-virtual {v0}, Lcom/badlogic/gdx/utils/Pool;->obtain()Ljava/lang/Object;
		 /* check-cast v0, Lcom/badlogic/gdx/physics/box2d/Fixture; */
		 (( com.badlogic.gdx.physics.box2d.Fixture ) v0 ).reset ( p0, v1, v2 ); // invoke-virtual {v0, p0, v1, v2}, Lcom/badlogic/gdx/physics/box2d/Fixture;->reset(Lcom/badlogic/gdx/physics/box2d/Body;J)V
		 v1 = this.world;
		 v1 = this.fixtures;
		 /* iget-wide v2, v0, Lcom/badlogic/gdx/physics/box2d/Fixture;->addr:J */
		 (( com.badlogic.gdx.utils.LongMap ) v1 ).put ( v2, v3, v0 ); // invoke-virtual {v1, v2, v3, v0}, Lcom/badlogic/gdx/utils/LongMap;->put(JLjava/lang/Object;)Ljava/lang/Object;
		 v1 = this.fixtures;
		 (( java.util.ArrayList ) v1 ).add ( v0 ); // invoke-virtual {v1, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z
	 } // .end method
	 public void destroyFixture ( com.badlogic.gdx.physics.box2d.Fixture p0 ) {
		 /* .locals 4 */
		 /* iget-wide v0, p0, Lcom/badlogic/gdx/physics/box2d/Body;->addr:J */
		 /* iget-wide v2, p1, Lcom/badlogic/gdx/physics/box2d/Fixture;->addr:J */
		 /* invoke-direct {p0, v0, v1, v2, v3}, Lcom/badlogic/gdx/physics/box2d/Body;->jniDestroyFixture(JJ)V */
		 v0 = this.world;
		 v0 = this.fixtures;
		 /* iget-wide v1, p1, Lcom/badlogic/gdx/physics/box2d/Fixture;->addr:J */
		 (( com.badlogic.gdx.utils.LongMap ) v0 ).remove ( v1, v2 ); // invoke-virtual {v0, v1, v2}, Lcom/badlogic/gdx/utils/LongMap;->remove(J)Ljava/lang/Object;
		 v0 = this.fixtures;
		 (( java.util.ArrayList ) v0 ).remove ( p1 ); // invoke-virtual {v0, p1}, Ljava/util/ArrayList;->remove(Ljava/lang/Object;)Z
		 v0 = this.world;
		 v0 = this.freeFixtures;
		 (( com.badlogic.gdx.utils.Pool ) v0 ).free ( p1 ); // invoke-virtual {v0, p1}, Lcom/badlogic/gdx/utils/Pool;->free(Ljava/lang/Object;)V
		 return;
	 } // .end method
	 public Float getAngle ( ) {
		 /* .locals 2 */
		 /* iget-wide v0, p0, Lcom/badlogic/gdx/physics/box2d/Body;->addr:J */
		 v0 = 		 /* invoke-direct {p0, v0, v1}, Lcom/badlogic/gdx/physics/box2d/Body;->jniGetAngle(J)F */
	 } // .end method
	 public Float getAngularDamping ( ) {
		 /* .locals 2 */
		 /* iget-wide v0, p0, Lcom/badlogic/gdx/physics/box2d/Body;->addr:J */
		 v0 = 		 /* invoke-direct {p0, v0, v1}, Lcom/badlogic/gdx/physics/box2d/Body;->jniGetAngularDamping(J)F */
	 } // .end method
	 public Float getAngularVelocity ( ) {
		 /* .locals 2 */
		 /* iget-wide v0, p0, Lcom/badlogic/gdx/physics/box2d/Body;->addr:J */
		 v0 = 		 /* invoke-direct {p0, v0, v1}, Lcom/badlogic/gdx/physics/box2d/Body;->jniGetAngularVelocity(J)F */
	 } // .end method
	 public java.util.ArrayList getFixtureList ( ) {
		 /* .locals 1 */
		 v0 = this.fixtures;
	 } // .end method
	 public Float getGravityScale ( ) {
		 /* .locals 2 */
		 /* iget-wide v0, p0, Lcom/badlogic/gdx/physics/box2d/Body;->addr:J */
		 v0 = 		 /* invoke-direct {p0, v0, v1}, Lcom/badlogic/gdx/physics/box2d/Body;->jniGetGravityScale(J)F */
	 } // .end method
	 public Float getInertia ( ) {
		 /* .locals 2 */
		 /* iget-wide v0, p0, Lcom/badlogic/gdx/physics/box2d/Body;->addr:J */
		 v0 = 		 /* invoke-direct {p0, v0, v1}, Lcom/badlogic/gdx/physics/box2d/Body;->jniGetInertia(J)F */
	 } // .end method
	 public java.util.ArrayList getJointList ( ) {
		 /* .locals 1 */
		 v0 = this.joints;
	 } // .end method
	 public Float getLinearDamping ( ) {
		 /* .locals 2 */
		 /* iget-wide v0, p0, Lcom/badlogic/gdx/physics/box2d/Body;->addr:J */
		 v0 = 		 /* invoke-direct {p0, v0, v1}, Lcom/badlogic/gdx/physics/box2d/Body;->jniGetLinearDamping(J)F */
	 } // .end method
	 public com.badlogic.gdx.math.Vector2 getLinearVelocity ( ) {
		 /* .locals 3 */
		 /* iget-wide v0, p0, Lcom/badlogic/gdx/physics/box2d/Body;->addr:J */
		 v2 = this.tmp;
		 /* invoke-direct {p0, v0, v1, v2}, Lcom/badlogic/gdx/physics/box2d/Body;->jniGetLinearVelocity(J[F)V */
		 v0 = this.linearVelocity;
		 v1 = this.tmp;
		 int v2 = 0; // const/4 v2, 0x0
		 /* aget v1, v1, v2 */
		 /* iput v1, v0, Lcom/badlogic/gdx/math/Vector2;->x:F */
		 v0 = this.linearVelocity;
		 v1 = this.tmp;
		 int v2 = 1; // const/4 v2, 0x1
		 /* aget v1, v1, v2 */
		 /* iput v1, v0, Lcom/badlogic/gdx/math/Vector2;->y:F */
		 v0 = this.linearVelocity;
	 } // .end method
	 public com.badlogic.gdx.math.Vector2 getLinearVelocityFromLocalPoint ( com.badlogic.gdx.math.Vector2 p0 ) {
		 /* .locals 6 */
		 /* iget-wide v1, p0, Lcom/badlogic/gdx/physics/box2d/Body;->addr:J */
		 /* iget v3, p1, Lcom/badlogic/gdx/math/Vector2;->x:F */
		 /* iget v4, p1, Lcom/badlogic/gdx/math/Vector2;->y:F */
		 v5 = this.tmp;
		 /* move-object v0, p0 */
		 /* invoke-direct/range {v0 ..v5}, Lcom/badlogic/gdx/physics/box2d/Body;->jniGetLinearVelocityFromLocalPoint(JFF[F)V */
		 v0 = this.linVelLoc;
		 v1 = this.tmp;
		 int v2 = 0; // const/4 v2, 0x0
		 /* aget v1, v1, v2 */
		 /* iput v1, v0, Lcom/badlogic/gdx/math/Vector2;->x:F */
		 v0 = this.linVelLoc;
		 v1 = this.tmp;
		 int v2 = 1; // const/4 v2, 0x1
		 /* aget v1, v1, v2 */
		 /* iput v1, v0, Lcom/badlogic/gdx/math/Vector2;->y:F */
		 v0 = this.linVelLoc;
	 } // .end method
	 public com.badlogic.gdx.math.Vector2 getLinearVelocityFromWorldPoint ( com.badlogic.gdx.math.Vector2 p0 ) {
		 /* .locals 6 */
		 /* iget-wide v1, p0, Lcom/badlogic/gdx/physics/box2d/Body;->addr:J */
		 /* iget v3, p1, Lcom/badlogic/gdx/math/Vector2;->x:F */
		 /* iget v4, p1, Lcom/badlogic/gdx/math/Vector2;->y:F */
		 v5 = this.tmp;
		 /* move-object v0, p0 */
		 /* invoke-direct/range {v0 ..v5}, Lcom/badlogic/gdx/physics/box2d/Body;->jniGetLinearVelocityFromWorldPoint(JFF[F)V */
		 v0 = this.linVelWorld;
		 v1 = this.tmp;
		 int v2 = 0; // const/4 v2, 0x0
		 /* aget v1, v1, v2 */
		 /* iput v1, v0, Lcom/badlogic/gdx/math/Vector2;->x:F */
		 v0 = this.linVelWorld;
		 v1 = this.tmp;
		 int v2 = 1; // const/4 v2, 0x1
		 /* aget v1, v1, v2 */
		 /* iput v1, v0, Lcom/badlogic/gdx/math/Vector2;->y:F */
		 v0 = this.linVelWorld;
	 } // .end method
	 public com.badlogic.gdx.math.Vector2 getLocalCenter ( ) {
		 /* .locals 3 */
		 /* iget-wide v0, p0, Lcom/badlogic/gdx/physics/box2d/Body;->addr:J */
		 v2 = this.tmp;
		 /* invoke-direct {p0, v0, v1, v2}, Lcom/badlogic/gdx/physics/box2d/Body;->jniGetLocalCenter(J[F)V */
		 v0 = this.localCenter;
		 v1 = this.tmp;
		 int v2 = 0; // const/4 v2, 0x0
		 /* aget v1, v1, v2 */
		 /* iput v1, v0, Lcom/badlogic/gdx/math/Vector2;->x:F */
		 v0 = this.localCenter;
		 v1 = this.tmp;
		 int v2 = 1; // const/4 v2, 0x1
		 /* aget v1, v1, v2 */
		 /* iput v1, v0, Lcom/badlogic/gdx/math/Vector2;->y:F */
		 v0 = this.localCenter;
	 } // .end method
	 public com.badlogic.gdx.math.Vector2 getLocalPoint ( com.badlogic.gdx.math.Vector2 p0 ) {
		 /* .locals 6 */
		 /* iget-wide v1, p0, Lcom/badlogic/gdx/physics/box2d/Body;->addr:J */
		 /* iget v3, p1, Lcom/badlogic/gdx/math/Vector2;->x:F */
		 /* iget v4, p1, Lcom/badlogic/gdx/math/Vector2;->y:F */
		 v5 = this.tmp;
		 /* move-object v0, p0 */
		 /* invoke-direct/range {v0 ..v5}, Lcom/badlogic/gdx/physics/box2d/Body;->jniGetLocalPoint(JFF[F)V */
		 v0 = this.localPoint2;
		 v1 = this.tmp;
		 int v2 = 0; // const/4 v2, 0x0
		 /* aget v1, v1, v2 */
		 /* iput v1, v0, Lcom/badlogic/gdx/math/Vector2;->x:F */
		 v0 = this.localPoint2;
		 v1 = this.tmp;
		 int v2 = 1; // const/4 v2, 0x1
		 /* aget v1, v1, v2 */
		 /* iput v1, v0, Lcom/badlogic/gdx/math/Vector2;->y:F */
		 v0 = this.localPoint2;
	 } // .end method
	 public com.badlogic.gdx.math.Vector2 getLocalVector ( com.badlogic.gdx.math.Vector2 p0 ) {
		 /* .locals 6 */
		 /* iget-wide v1, p0, Lcom/badlogic/gdx/physics/box2d/Body;->addr:J */
		 /* iget v3, p1, Lcom/badlogic/gdx/math/Vector2;->x:F */
		 /* iget v4, p1, Lcom/badlogic/gdx/math/Vector2;->y:F */
		 v5 = this.tmp;
		 /* move-object v0, p0 */
		 /* invoke-direct/range {v0 ..v5}, Lcom/badlogic/gdx/physics/box2d/Body;->jniGetLocalVector(JFF[F)V */
		 v0 = this.localVector;
		 v1 = this.tmp;
		 int v2 = 0; // const/4 v2, 0x0
		 /* aget v1, v1, v2 */
		 /* iput v1, v0, Lcom/badlogic/gdx/math/Vector2;->x:F */
		 v0 = this.localVector;
		 v1 = this.tmp;
		 int v2 = 1; // const/4 v2, 0x1
		 /* aget v1, v1, v2 */
		 /* iput v1, v0, Lcom/badlogic/gdx/math/Vector2;->y:F */
		 v0 = this.localVector;
	 } // .end method
	 public Float getMass ( ) {
		 /* .locals 2 */
		 /* iget-wide v0, p0, Lcom/badlogic/gdx/physics/box2d/Body;->addr:J */
		 v0 = 		 /* invoke-direct {p0, v0, v1}, Lcom/badlogic/gdx/physics/box2d/Body;->jniGetMass(J)F */
	 } // .end method
	 public com.badlogic.gdx.physics.box2d.MassData getMassData ( ) {
		 /* .locals 3 */
		 /* iget-wide v0, p0, Lcom/badlogic/gdx/physics/box2d/Body;->addr:J */
		 v2 = this.tmp;
		 /* invoke-direct {p0, v0, v1, v2}, Lcom/badlogic/gdx/physics/box2d/Body;->jniGetMassData(J[F)V */
		 v0 = this.massData;
		 v1 = this.tmp;
		 int v2 = 0; // const/4 v2, 0x0
		 /* aget v1, v1, v2 */
		 /* iput v1, v0, Lcom/badlogic/gdx/physics/box2d/MassData;->mass:F */
		 v0 = this.massData;
		 v0 = this.center;
		 v1 = this.tmp;
		 int v2 = 1; // const/4 v2, 0x1
		 /* aget v1, v1, v2 */
		 /* iput v1, v0, Lcom/badlogic/gdx/math/Vector2;->x:F */
		 v0 = this.massData;
		 v0 = this.center;
		 v1 = this.tmp;
		 int v2 = 2; // const/4 v2, 0x2
		 /* aget v1, v1, v2 */
		 /* iput v1, v0, Lcom/badlogic/gdx/math/Vector2;->y:F */
		 v0 = this.massData;
		 v1 = this.tmp;
		 int v2 = 3; // const/4 v2, 0x3
		 /* aget v1, v1, v2 */
		 /* iput v1, v0, Lcom/badlogic/gdx/physics/box2d/MassData;->I:F */
		 v0 = this.massData;
	 } // .end method
	 public com.badlogic.gdx.math.Vector2 getPosition ( ) {
		 /* .locals 3 */
		 /* iget-wide v0, p0, Lcom/badlogic/gdx/physics/box2d/Body;->addr:J */
		 v2 = this.tmp;
		 /* invoke-direct {p0, v0, v1, v2}, Lcom/badlogic/gdx/physics/box2d/Body;->jniGetPosition(J[F)V */
		 v0 = this.position;
		 v1 = this.tmp;
		 int v2 = 0; // const/4 v2, 0x0
		 /* aget v1, v1, v2 */
		 /* iput v1, v0, Lcom/badlogic/gdx/math/Vector2;->x:F */
		 v0 = this.position;
		 v1 = this.tmp;
		 int v2 = 1; // const/4 v2, 0x1
		 /* aget v1, v1, v2 */
		 /* iput v1, v0, Lcom/badlogic/gdx/math/Vector2;->y:F */
		 v0 = this.position;
	 } // .end method
	 public com.badlogic.gdx.physics.box2d.Transform getTransform ( ) {
		 /* .locals 3 */
		 /* iget-wide v0, p0, Lcom/badlogic/gdx/physics/box2d/Body;->addr:J */
		 v2 = this.transform;
		 v2 = this.vals;
		 /* invoke-direct {p0, v0, v1, v2}, Lcom/badlogic/gdx/physics/box2d/Body;->jniGetTransform(J[F)V */
		 v0 = this.transform;
	 } // .end method
	 public com.badlogic.gdx.physics.box2d.BodyDef$BodyType getType ( ) {
		 /* .locals 2 */
		 /* iget-wide v0, p0, Lcom/badlogic/gdx/physics/box2d/Body;->addr:J */
		 v0 = 		 /* invoke-direct {p0, v0, v1}, Lcom/badlogic/gdx/physics/box2d/Body;->jniGetType(J)I */
		 /* if-nez v0, :cond_0 */
		 v0 = com.badlogic.gdx.physics.box2d.BodyDef$BodyType.StaticBody;
	 } // :goto_0
} // :cond_0
int v1 = 1; // const/4 v1, 0x1
/* if-ne v0, v1, :cond_1 */
v0 = com.badlogic.gdx.physics.box2d.BodyDef$BodyType.KinematicBody;
} // :cond_1
int v1 = 2; // const/4 v1, 0x2
/* if-ne v0, v1, :cond_2 */
v0 = com.badlogic.gdx.physics.box2d.BodyDef$BodyType.DynamicBody;
} // :cond_2
v0 = com.badlogic.gdx.physics.box2d.BodyDef$BodyType.StaticBody;
} // .end method
public java.lang.Object getUserData ( ) {
/* .locals 1 */
v0 = this.userData;
} // .end method
public com.badlogic.gdx.physics.box2d.World getWorld ( ) {
/* .locals 1 */
v0 = this.world;
} // .end method
public com.badlogic.gdx.math.Vector2 getWorldCenter ( ) {
/* .locals 3 */
/* iget-wide v0, p0, Lcom/badlogic/gdx/physics/box2d/Body;->addr:J */
v2 = this.tmp;
/* invoke-direct {p0, v0, v1, v2}, Lcom/badlogic/gdx/physics/box2d/Body;->jniGetWorldCenter(J[F)V */
v0 = this.worldCenter;
v1 = this.tmp;
int v2 = 0; // const/4 v2, 0x0
/* aget v1, v1, v2 */
/* iput v1, v0, Lcom/badlogic/gdx/math/Vector2;->x:F */
v0 = this.worldCenter;
v1 = this.tmp;
int v2 = 1; // const/4 v2, 0x1
/* aget v1, v1, v2 */
/* iput v1, v0, Lcom/badlogic/gdx/math/Vector2;->y:F */
v0 = this.worldCenter;
} // .end method
public com.badlogic.gdx.math.Vector2 getWorldPoint ( com.badlogic.gdx.math.Vector2 p0 ) {
/* .locals 6 */
/* iget-wide v1, p0, Lcom/badlogic/gdx/physics/box2d/Body;->addr:J */
/* iget v3, p1, Lcom/badlogic/gdx/math/Vector2;->x:F */
/* iget v4, p1, Lcom/badlogic/gdx/math/Vector2;->y:F */
v5 = this.tmp;
/* move-object v0, p0 */
/* invoke-direct/range {v0 ..v5}, Lcom/badlogic/gdx/physics/box2d/Body;->jniGetWorldPoint(JFF[F)V */
v0 = this.localPoint;
v1 = this.tmp;
int v2 = 0; // const/4 v2, 0x0
/* aget v1, v1, v2 */
/* iput v1, v0, Lcom/badlogic/gdx/math/Vector2;->x:F */
v0 = this.localPoint;
v1 = this.tmp;
int v2 = 1; // const/4 v2, 0x1
/* aget v1, v1, v2 */
/* iput v1, v0, Lcom/badlogic/gdx/math/Vector2;->y:F */
v0 = this.localPoint;
} // .end method
public com.badlogic.gdx.math.Vector2 getWorldVector ( com.badlogic.gdx.math.Vector2 p0 ) {
/* .locals 6 */
/* iget-wide v1, p0, Lcom/badlogic/gdx/physics/box2d/Body;->addr:J */
/* iget v3, p1, Lcom/badlogic/gdx/math/Vector2;->x:F */
/* iget v4, p1, Lcom/badlogic/gdx/math/Vector2;->y:F */
v5 = this.tmp;
/* move-object v0, p0 */
/* invoke-direct/range {v0 ..v5}, Lcom/badlogic/gdx/physics/box2d/Body;->jniGetWorldVector(JFF[F)V */
v0 = this.worldVector;
v1 = this.tmp;
int v2 = 0; // const/4 v2, 0x0
/* aget v1, v1, v2 */
/* iput v1, v0, Lcom/badlogic/gdx/math/Vector2;->x:F */
v0 = this.worldVector;
v1 = this.tmp;
int v2 = 1; // const/4 v2, 0x1
/* aget v1, v1, v2 */
/* iput v1, v0, Lcom/badlogic/gdx/math/Vector2;->y:F */
v0 = this.worldVector;
} // .end method
public Boolean isActive ( ) {
/* .locals 2 */
/* iget-wide v0, p0, Lcom/badlogic/gdx/physics/box2d/Body;->addr:J */
v0 = /* invoke-direct {p0, v0, v1}, Lcom/badlogic/gdx/physics/box2d/Body;->jniIsActive(J)Z */
} // .end method
public Boolean isAwake ( ) {
/* .locals 2 */
/* iget-wide v0, p0, Lcom/badlogic/gdx/physics/box2d/Body;->addr:J */
v0 = /* invoke-direct {p0, v0, v1}, Lcom/badlogic/gdx/physics/box2d/Body;->jniIsAwake(J)Z */
} // .end method
public Boolean isBullet ( ) {
/* .locals 2 */
/* iget-wide v0, p0, Lcom/badlogic/gdx/physics/box2d/Body;->addr:J */
v0 = /* invoke-direct {p0, v0, v1}, Lcom/badlogic/gdx/physics/box2d/Body;->jniIsBullet(J)Z */
} // .end method
public Boolean isFixedRotation ( ) {
/* .locals 2 */
/* iget-wide v0, p0, Lcom/badlogic/gdx/physics/box2d/Body;->addr:J */
v0 = /* invoke-direct {p0, v0, v1}, Lcom/badlogic/gdx/physics/box2d/Body;->jniIsFixedRotation(J)Z */
} // .end method
public Boolean isSleepingAllowed ( ) {
/* .locals 2 */
/* iget-wide v0, p0, Lcom/badlogic/gdx/physics/box2d/Body;->addr:J */
v0 = /* invoke-direct {p0, v0, v1}, Lcom/badlogic/gdx/physics/box2d/Body;->jniIsSleepingAllowed(J)Z */
} // .end method
protected void reset ( Long p0 ) {
/* .locals 3 */
/* iput-wide p1, p0, Lcom/badlogic/gdx/physics/box2d/Body;->addr:J */
int v0 = 0; // const/4 v0, 0x0
this.userData = v0;
int v0 = 0; // const/4 v0, 0x0
} // :goto_0
v1 = this.fixtures;
v1 = (( java.util.ArrayList ) v1 ).size ( ); // invoke-virtual {v1}, Ljava/util/ArrayList;->size()I
/* if-ge v0, v1, :cond_0 */
v1 = this.world;
v1 = this.freeFixtures;
v2 = this.fixtures;
(( java.util.ArrayList ) v2 ).get ( v0 ); // invoke-virtual {v2, v0}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;
(( com.badlogic.gdx.utils.Pool ) v1 ).free ( v2 ); // invoke-virtual {v1, v2}, Lcom/badlogic/gdx/utils/Pool;->free(Ljava/lang/Object;)V
/* add-int/lit8 v0, v0, 0x1 */
} // :cond_0
v0 = this.fixtures;
(( java.util.ArrayList ) v0 ).clear ( ); // invoke-virtual {v0}, Ljava/util/ArrayList;->clear()V
v0 = this.joints;
(( java.util.ArrayList ) v0 ).clear ( ); // invoke-virtual {v0}, Ljava/util/ArrayList;->clear()V
return;
} // .end method
public void resetMassData ( ) {
/* .locals 2 */
/* iget-wide v0, p0, Lcom/badlogic/gdx/physics/box2d/Body;->addr:J */
/* invoke-direct {p0, v0, v1}, Lcom/badlogic/gdx/physics/box2d/Body;->jniResetMassData(J)V */
return;
} // .end method
public void setActive ( Boolean p0 ) {
/* .locals 2 */
/* iget-wide v0, p0, Lcom/badlogic/gdx/physics/box2d/Body;->addr:J */
/* invoke-direct {p0, v0, v1, p1}, Lcom/badlogic/gdx/physics/box2d/Body;->jniSetActive(JZ)V */
return;
} // .end method
public void setAngularDamping ( Float p0 ) {
/* .locals 2 */
/* iget-wide v0, p0, Lcom/badlogic/gdx/physics/box2d/Body;->addr:J */
/* invoke-direct {p0, v0, v1, p1}, Lcom/badlogic/gdx/physics/box2d/Body;->jniSetAngularDamping(JF)V */
return;
} // .end method
public void setAngularVelocity ( Float p0 ) {
/* .locals 2 */
/* iget-wide v0, p0, Lcom/badlogic/gdx/physics/box2d/Body;->addr:J */
/* invoke-direct {p0, v0, v1, p1}, Lcom/badlogic/gdx/physics/box2d/Body;->jniSetAngularVelocity(JF)V */
return;
} // .end method
public void setAwake ( Boolean p0 ) {
/* .locals 2 */
/* iget-wide v0, p0, Lcom/badlogic/gdx/physics/box2d/Body;->addr:J */
/* invoke-direct {p0, v0, v1, p1}, Lcom/badlogic/gdx/physics/box2d/Body;->jniSetAwake(JZ)V */
return;
} // .end method
public void setBullet ( Boolean p0 ) {
/* .locals 2 */
/* iget-wide v0, p0, Lcom/badlogic/gdx/physics/box2d/Body;->addr:J */
/* invoke-direct {p0, v0, v1, p1}, Lcom/badlogic/gdx/physics/box2d/Body;->jniSetBullet(JZ)V */
return;
} // .end method
public void setFixedRotation ( Boolean p0 ) {
/* .locals 2 */
/* iget-wide v0, p0, Lcom/badlogic/gdx/physics/box2d/Body;->addr:J */
/* invoke-direct {p0, v0, v1, p1}, Lcom/badlogic/gdx/physics/box2d/Body;->jniSetFixedRotation(JZ)V */
return;
} // .end method
public void setGravityScale ( Float p0 ) {
/* .locals 2 */
/* iget-wide v0, p0, Lcom/badlogic/gdx/physics/box2d/Body;->addr:J */
/* invoke-direct {p0, v0, v1, p1}, Lcom/badlogic/gdx/physics/box2d/Body;->jniSetGravityScale(JF)V */
return;
} // .end method
public void setLinearDamping ( Float p0 ) {
/* .locals 2 */
/* iget-wide v0, p0, Lcom/badlogic/gdx/physics/box2d/Body;->addr:J */
/* invoke-direct {p0, v0, v1, p1}, Lcom/badlogic/gdx/physics/box2d/Body;->jniSetLinearDamping(JF)V */
return;
} // .end method
public void setLinearVelocity ( Float p0, Float p1 ) {
/* .locals 2 */
/* iget-wide v0, p0, Lcom/badlogic/gdx/physics/box2d/Body;->addr:J */
/* invoke-direct {p0, v0, v1, p1, p2}, Lcom/badlogic/gdx/physics/box2d/Body;->jniSetLinearVelocity(JFF)V */
return;
} // .end method
public void setLinearVelocity ( com.badlogic.gdx.math.Vector2 p0 ) {
/* .locals 4 */
/* iget-wide v0, p0, Lcom/badlogic/gdx/physics/box2d/Body;->addr:J */
/* iget v2, p1, Lcom/badlogic/gdx/math/Vector2;->x:F */
/* iget v3, p1, Lcom/badlogic/gdx/math/Vector2;->y:F */
/* invoke-direct {p0, v0, v1, v2, v3}, Lcom/badlogic/gdx/physics/box2d/Body;->jniSetLinearVelocity(JFF)V */
return;
} // .end method
public void setMassData ( com.badlogic.gdx.physics.box2d.MassData p0 ) {
/* .locals 7 */
/* iget-wide v1, p0, Lcom/badlogic/gdx/physics/box2d/Body;->addr:J */
/* iget v3, p1, Lcom/badlogic/gdx/physics/box2d/MassData;->mass:F */
v0 = this.center;
/* iget v4, v0, Lcom/badlogic/gdx/math/Vector2;->x:F */
v0 = this.center;
/* iget v5, v0, Lcom/badlogic/gdx/math/Vector2;->y:F */
/* iget v6, p1, Lcom/badlogic/gdx/physics/box2d/MassData;->I:F */
/* move-object v0, p0 */
/* invoke-direct/range {v0 ..v6}, Lcom/badlogic/gdx/physics/box2d/Body;->jniSetMassData(JFFFF)V */
return;
} // .end method
public void setSleepingAllowed ( Boolean p0 ) {
/* .locals 2 */
/* iget-wide v0, p0, Lcom/badlogic/gdx/physics/box2d/Body;->addr:J */
/* invoke-direct {p0, v0, v1, p1}, Lcom/badlogic/gdx/physics/box2d/Body;->jniSetSleepingAllowed(JZ)V */
return;
} // .end method
public void setTransform ( Float p0, Float p1, Float p2 ) {
/* .locals 6 */
/* iget-wide v1, p0, Lcom/badlogic/gdx/physics/box2d/Body;->addr:J */
/* move-object v0, p0 */
/* move v3, p1 */
/* move v4, p2 */
/* move v5, p3 */
/* invoke-direct/range {v0 ..v5}, Lcom/badlogic/gdx/physics/box2d/Body;->jniSetTransform(JFFF)V */
return;
} // .end method
public void setTransform ( com.badlogic.gdx.math.Vector2 p0, Float p1 ) {
/* .locals 6 */
/* iget-wide v1, p0, Lcom/badlogic/gdx/physics/box2d/Body;->addr:J */
/* iget v3, p1, Lcom/badlogic/gdx/math/Vector2;->x:F */
/* iget v4, p1, Lcom/badlogic/gdx/math/Vector2;->y:F */
/* move-object v0, p0 */
/* move v5, p2 */
/* invoke-direct/range {v0 ..v5}, Lcom/badlogic/gdx/physics/box2d/Body;->jniSetTransform(JFFF)V */
return;
} // .end method
public void setType ( com.badlogic.gdx.physics.box2d.BodyDef$BodyType p0 ) {
/* .locals 3 */
/* iget-wide v0, p0, Lcom/badlogic/gdx/physics/box2d/Body;->addr:J */
v2 = (( com.badlogic.gdx.physics.box2d.BodyDef$BodyType ) p1 ).getValue ( ); // invoke-virtual {p1}, Lcom/badlogic/gdx/physics/box2d/BodyDef$BodyType;->getValue()I
/* invoke-direct {p0, v0, v1, v2}, Lcom/badlogic/gdx/physics/box2d/Body;->jniSetType(JI)V */
return;
} // .end method
public void setUserData ( java.lang.Object p0 ) {
/* .locals 0 */
this.userData = p1;
return;
} // .end method
