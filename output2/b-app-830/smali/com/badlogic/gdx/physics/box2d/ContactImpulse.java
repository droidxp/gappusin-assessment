public class com.badlogic.gdx.physics.box2d.ContactImpulse {
	 /* # instance fields */
	 Long addr;
	 final normalImpulses;
	 final tangentImpulses;
	 tmp;
	 final com.badlogic.gdx.physics.box2d.World world;
	 /* # direct methods */
	 protected com.badlogic.gdx.physics.box2d.ContactImpulse ( ) {
		 /* .locals 2 */
		 int v1 = 2; // const/4 v1, 0x2
		 /* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
		 /* new-array v0, v1, [F */
		 this.tmp = v0;
		 /* new-array v0, v1, [F */
		 this.normalImpulses = v0;
		 /* new-array v0, v1, [F */
		 this.tangentImpulses = v0;
		 this.world = p1;
		 /* iput-wide p2, p0, Lcom/badlogic/gdx/physics/box2d/ContactImpulse;->addr:J */
		 return;
	 } // .end method
	 private native Integer jniGetCount ( Long p0 ) {
	 } // .end method
	 private native void jniGetNormalImpulses ( Long p0, Float[] p1 ) {
	 } // .end method
	 private native void jniGetTangentImpulses ( Long p0, Float[] p1 ) {
	 } // .end method
	 /* # virtual methods */
	 public Integer getCount ( ) {
		 /* .locals 2 */
		 /* iget-wide v0, p0, Lcom/badlogic/gdx/physics/box2d/ContactImpulse;->addr:J */
		 v0 = 		 /* invoke-direct {p0, v0, v1}, Lcom/badlogic/gdx/physics/box2d/ContactImpulse;->jniGetCount(J)I */
	 } // .end method
	 public getNormalImpulses ( ) {
		 /* .locals 3 */
		 /* iget-wide v0, p0, Lcom/badlogic/gdx/physics/box2d/ContactImpulse;->addr:J */
		 v2 = this.normalImpulses;
		 /* invoke-direct {p0, v0, v1, v2}, Lcom/badlogic/gdx/physics/box2d/ContactImpulse;->jniGetNormalImpulses(J[F)V */
		 v0 = this.normalImpulses;
	 } // .end method
	 public getTangentImpulses ( ) {
		 /* .locals 3 */
		 /* iget-wide v0, p0, Lcom/badlogic/gdx/physics/box2d/ContactImpulse;->addr:J */
		 v2 = this.tangentImpulses;
		 /* invoke-direct {p0, v0, v1, v2}, Lcom/badlogic/gdx/physics/box2d/ContactImpulse;->jniGetTangentImpulses(J[F)V */
		 v0 = this.tangentImpulses;
	 } // .end method
