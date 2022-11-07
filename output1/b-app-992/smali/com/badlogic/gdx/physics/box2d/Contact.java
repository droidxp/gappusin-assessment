public class com.badlogic.gdx.physics.box2d.Contact {
	 /* # instance fields */
	 protected Long addr;
	 private final tmp;
	 protected com.badlogic.gdx.physics.box2d.World world;
	 protected final com.badlogic.gdx.physics.box2d.WorldManifold worldManifold;
	 /* # direct methods */
	 protected com.badlogic.gdx.physics.box2d.Contact ( ) {
		 /* .locals 1 */
		 /* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
		 /* new-instance v0, Lcom/badlogic/gdx/physics/box2d/WorldManifold; */
		 /* invoke-direct {v0}, Lcom/badlogic/gdx/physics/box2d/WorldManifold;-><init>()V */
		 this.worldManifold = v0;
		 int v0 = 6; // const/4 v0, 0x6
		 /* new-array v0, v0, [F */
		 this.tmp = v0;
		 /* iput-wide p2, p0, Lcom/badlogic/gdx/physics/box2d/Contact;->addr:J */
		 this.world = p1;
		 return;
	 } // .end method
	 private native Integer jniGetChildIndexA ( Long p0 ) {
	 } // .end method
	 private native Integer jniGetChildIndexB ( Long p0 ) {
	 } // .end method
	 private native Long jniGetFixtureA ( Long p0 ) {
	 } // .end method
	 private native Long jniGetFixtureB ( Long p0 ) {
	 } // .end method
	 private native Float jniGetFriction ( Long p0 ) {
	 } // .end method
	 private native Float jniGetRestitution ( Long p0 ) {
	 } // .end method
	 private native Integer jniGetWorldManifold ( Long p0, Float[] p1 ) {
	 } // .end method
	 private native Boolean jniIsEnabled ( Long p0 ) {
	 } // .end method
	 private native Boolean jniIsTouching ( Long p0 ) {
	 } // .end method
	 private native void jniResetFriction ( Long p0 ) {
	 } // .end method
	 private native void jniResetRestitution ( Long p0 ) {
	 } // .end method
	 private native void jniSetEnabled ( Long p0, Boolean p1 ) {
	 } // .end method
	 private native void jniSetFriction ( Long p0, Float p1 ) {
	 } // .end method
	 private native void jniSetRestitution ( Long p0, Float p1 ) {
	 } // .end method
	 /* # virtual methods */
	 public void ResetRestitution ( ) {
		 /* .locals 2 */
		 /* iget-wide v0, p0, Lcom/badlogic/gdx/physics/box2d/Contact;->addr:J */
		 /* invoke-direct {p0, v0, v1}, Lcom/badlogic/gdx/physics/box2d/Contact;->jniResetRestitution(J)V */
		 return;
	 } // .end method
	 public Integer getChildIndexA ( ) {
		 /* .locals 2 */
		 /* iget-wide v0, p0, Lcom/badlogic/gdx/physics/box2d/Contact;->addr:J */
		 v0 = 		 /* invoke-direct {p0, v0, v1}, Lcom/badlogic/gdx/physics/box2d/Contact;->jniGetChildIndexA(J)I */
	 } // .end method
	 public Integer getChildIndexB ( ) {
		 /* .locals 2 */
		 /* iget-wide v0, p0, Lcom/badlogic/gdx/physics/box2d/Contact;->addr:J */
		 v0 = 		 /* invoke-direct {p0, v0, v1}, Lcom/badlogic/gdx/physics/box2d/Contact;->jniGetChildIndexB(J)I */
	 } // .end method
	 public com.badlogic.gdx.physics.box2d.Fixture getFixtureA ( ) {
		 /* .locals 3 */
		 v0 = this.world;
		 v0 = this.fixtures;
		 /* iget-wide v1, p0, Lcom/badlogic/gdx/physics/box2d/Contact;->addr:J */
		 /* invoke-direct {p0, v1, v2}, Lcom/badlogic/gdx/physics/box2d/Contact;->jniGetFixtureA(J)J */
		 /* move-result-wide v1 */
		 (( com.badlogic.gdx.utils.LongMap ) v0 ).get ( v1, v2 ); // invoke-virtual {v0, v1, v2}, Lcom/badlogic/gdx/utils/LongMap;->get(J)Ljava/lang/Object;
		 /* check-cast p0, Lcom/badlogic/gdx/physics/box2d/Fixture; */
	 } // .end method
	 public com.badlogic.gdx.physics.box2d.Fixture getFixtureB ( ) {
		 /* .locals 3 */
		 v0 = this.world;
		 v0 = this.fixtures;
		 /* iget-wide v1, p0, Lcom/badlogic/gdx/physics/box2d/Contact;->addr:J */
		 /* invoke-direct {p0, v1, v2}, Lcom/badlogic/gdx/physics/box2d/Contact;->jniGetFixtureB(J)J */
		 /* move-result-wide v1 */
		 (( com.badlogic.gdx.utils.LongMap ) v0 ).get ( v1, v2 ); // invoke-virtual {v0, v1, v2}, Lcom/badlogic/gdx/utils/LongMap;->get(J)Ljava/lang/Object;
		 /* check-cast p0, Lcom/badlogic/gdx/physics/box2d/Fixture; */
	 } // .end method
	 public Float getFriction ( ) {
		 /* .locals 2 */
		 /* iget-wide v0, p0, Lcom/badlogic/gdx/physics/box2d/Contact;->addr:J */
		 v0 = 		 /* invoke-direct {p0, v0, v1}, Lcom/badlogic/gdx/physics/box2d/Contact;->jniGetFriction(J)F */
	 } // .end method
	 public Float getRestitution ( ) {
		 /* .locals 2 */
		 /* iget-wide v0, p0, Lcom/badlogic/gdx/physics/box2d/Contact;->addr:J */
		 v0 = 		 /* invoke-direct {p0, v0, v1}, Lcom/badlogic/gdx/physics/box2d/Contact;->jniGetRestitution(J)F */
	 } // .end method
	 public com.badlogic.gdx.physics.box2d.WorldManifold getWorldManifold ( ) {
		 /* .locals 6 */
		 int v5 = 0; // const/4 v5, 0x0
		 /* iget-wide v0, p0, Lcom/badlogic/gdx/physics/box2d/Contact;->addr:J */
		 v2 = this.tmp;
		 v0 = 		 /* invoke-direct {p0, v0, v1, v2}, Lcom/badlogic/gdx/physics/box2d/Contact;->jniGetWorldManifold(J[F)I */
		 v1 = this.worldManifold;
		 /* iput v0, v1, Lcom/badlogic/gdx/physics/box2d/WorldManifold;->numContactPoints:I */
		 v1 = this.worldManifold;
		 v1 = this.normal;
		 v2 = this.tmp;
		 /* aget v2, v2, v5 */
		 v3 = this.tmp;
		 int v4 = 1; // const/4 v4, 0x1
		 /* aget v3, v3, v4 */
		 (( com.badlogic.gdx.math.Vector2 ) v1 ).set ( v2, v3 ); // invoke-virtual {v1, v2, v3}, Lcom/badlogic/gdx/math/Vector2;->set(FF)Lcom/badlogic/gdx/math/Vector2;
		 /* move v1, v5 */
	 } // :goto_0
	 /* if-ge v1, v0, :cond_0 */
	 v2 = this.worldManifold;
	 v2 = this.points;
	 /* aget-object v2, v2, v1 */
	 v3 = this.tmp;
	 /* mul-int/lit8 v4, v1, 0x2 */
	 /* add-int/lit8 v4, v4, 0x2 */
	 /* aget v3, v3, v4 */
	 /* iput v3, v2, Lcom/badlogic/gdx/math/Vector2;->x:F */
	 v3 = this.tmp;
	 /* mul-int/lit8 v4, v1, 0x2 */
	 /* add-int/lit8 v4, v4, 0x2 */
	 /* add-int/lit8 v4, v4, 0x1 */
	 /* aget v3, v3, v4 */
	 /* iput v3, v2, Lcom/badlogic/gdx/math/Vector2;->y:F */
	 /* add-int/lit8 v1, v1, 0x1 */
} // :cond_0
v0 = this.worldManifold;
} // .end method
public Boolean isEnabled ( ) {
/* .locals 2 */
/* iget-wide v0, p0, Lcom/badlogic/gdx/physics/box2d/Contact;->addr:J */
v0 = /* invoke-direct {p0, v0, v1}, Lcom/badlogic/gdx/physics/box2d/Contact;->jniIsEnabled(J)Z */
} // .end method
public Boolean isTouching ( ) {
/* .locals 2 */
/* iget-wide v0, p0, Lcom/badlogic/gdx/physics/box2d/Contact;->addr:J */
v0 = /* invoke-direct {p0, v0, v1}, Lcom/badlogic/gdx/physics/box2d/Contact;->jniIsTouching(J)Z */
} // .end method
public void resetFriction ( ) {
/* .locals 2 */
/* iget-wide v0, p0, Lcom/badlogic/gdx/physics/box2d/Contact;->addr:J */
/* invoke-direct {p0, v0, v1}, Lcom/badlogic/gdx/physics/box2d/Contact;->jniResetFriction(J)V */
return;
} // .end method
public void setEnabled ( Boolean p0 ) {
/* .locals 2 */
/* iget-wide v0, p0, Lcom/badlogic/gdx/physics/box2d/Contact;->addr:J */
/* invoke-direct {p0, v0, v1, p1}, Lcom/badlogic/gdx/physics/box2d/Contact;->jniSetEnabled(JZ)V */
return;
} // .end method
public void setFriction ( Float p0 ) {
/* .locals 2 */
/* iget-wide v0, p0, Lcom/badlogic/gdx/physics/box2d/Contact;->addr:J */
/* invoke-direct {p0, v0, v1, p1}, Lcom/badlogic/gdx/physics/box2d/Contact;->jniSetFriction(JF)V */
return;
} // .end method
public void setRestitution ( Float p0 ) {
/* .locals 2 */
/* iget-wide v0, p0, Lcom/badlogic/gdx/physics/box2d/Contact;->addr:J */
/* invoke-direct {p0, v0, v1, p1}, Lcom/badlogic/gdx/physics/box2d/Contact;->jniSetRestitution(JF)V */
return;
} // .end method
