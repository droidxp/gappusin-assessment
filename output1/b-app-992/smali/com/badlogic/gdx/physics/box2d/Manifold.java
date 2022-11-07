public class com.badlogic.gdx.physics.box2d.Manifold {
	 /* # instance fields */
	 Long addr;
	 final com.badlogic.gdx.math.Vector2 localNormal;
	 final com.badlogic.gdx.math.Vector2 localPoint;
	 final com.badlogic.gdx.physics.box2d.Manifold$ManifoldPoint points;
	 final tmpFloat;
	 final tmpInt;
	 final com.badlogic.gdx.physics.box2d.World world;
	 /* # direct methods */
	 protected com.badlogic.gdx.physics.box2d.Manifold ( ) {
		 /* .locals 4 */
		 int v3 = 2; // const/4 v3, 0x2
		 /* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
		 /* new-array v0, v3, [Lcom/badlogic/gdx/physics/box2d/Manifold$ManifoldPoint; */
		 int v1 = 0; // const/4 v1, 0x0
		 /* new-instance v2, Lcom/badlogic/gdx/physics/box2d/Manifold$ManifoldPoint; */
		 /* invoke-direct {v2, p0}, Lcom/badlogic/gdx/physics/box2d/Manifold$ManifoldPoint;-><init>(Lcom/badlogic/gdx/physics/box2d/Manifold;)V */
		 /* aput-object v2, v0, v1 */
		 int v1 = 1; // const/4 v1, 0x1
		 /* new-instance v2, Lcom/badlogic/gdx/physics/box2d/Manifold$ManifoldPoint; */
		 /* invoke-direct {v2, p0}, Lcom/badlogic/gdx/physics/box2d/Manifold$ManifoldPoint;-><init>(Lcom/badlogic/gdx/physics/box2d/Manifold;)V */
		 /* aput-object v2, v0, v1 */
		 this.points = v0;
		 /* new-instance v0, Lcom/badlogic/gdx/math/Vector2; */
		 /* invoke-direct {v0}, Lcom/badlogic/gdx/math/Vector2;-><init>()V */
		 this.localNormal = v0;
		 /* new-instance v0, Lcom/badlogic/gdx/math/Vector2; */
		 /* invoke-direct {v0}, Lcom/badlogic/gdx/math/Vector2;-><init>()V */
		 this.localPoint = v0;
		 /* new-array v0, v3, [I */
		 this.tmpInt = v0;
		 int v0 = 4; // const/4 v0, 0x4
		 /* new-array v0, v0, [F */
		 this.tmpFloat = v0;
		 this.world = p1;
		 /* iput-wide p2, p0, Lcom/badlogic/gdx/physics/box2d/Manifold;->addr:J */
		 return;
	 } // .end method
	 private native void jniGetLocalNormal ( Long p0, Float[] p1 ) {
	 } // .end method
	 private native void jniGetLocalPoint ( Long p0, Float[] p1 ) {
	 } // .end method
	 private native Integer jniGetPoint ( Long p0, Float[] p1, Integer p2 ) {
	 } // .end method
	 private native Integer jniGetPointCount ( Long p0 ) {
	 } // .end method
	 private native Integer jniGetType ( Long p0 ) {
	 } // .end method
	 /* # virtual methods */
	 public com.badlogic.gdx.math.Vector2 getLocalNormal ( ) {
		 /* .locals 4 */
		 /* iget-wide v0, p0, Lcom/badlogic/gdx/physics/box2d/Manifold;->addr:J */
		 v2 = this.tmpFloat;
		 /* invoke-direct {p0, v0, v1, v2}, Lcom/badlogic/gdx/physics/box2d/Manifold;->jniGetLocalNormal(J[F)V */
		 v0 = this.localNormal;
		 v1 = this.tmpFloat;
		 int v2 = 0; // const/4 v2, 0x0
		 /* aget v1, v1, v2 */
		 v2 = this.tmpFloat;
		 int v3 = 1; // const/4 v3, 0x1
		 /* aget v2, v2, v3 */
		 (( com.badlogic.gdx.math.Vector2 ) v0 ).set ( v1, v2 ); // invoke-virtual {v0, v1, v2}, Lcom/badlogic/gdx/math/Vector2;->set(FF)Lcom/badlogic/gdx/math/Vector2;
		 v0 = this.localNormal;
	 } // .end method
	 public com.badlogic.gdx.math.Vector2 getLocalPoint ( ) {
		 /* .locals 4 */
		 /* iget-wide v0, p0, Lcom/badlogic/gdx/physics/box2d/Manifold;->addr:J */
		 v2 = this.tmpFloat;
		 /* invoke-direct {p0, v0, v1, v2}, Lcom/badlogic/gdx/physics/box2d/Manifold;->jniGetLocalPoint(J[F)V */
		 v0 = this.localPoint;
		 v1 = this.tmpFloat;
		 int v2 = 0; // const/4 v2, 0x0
		 /* aget v1, v1, v2 */
		 v2 = this.tmpFloat;
		 int v3 = 1; // const/4 v3, 0x1
		 /* aget v2, v2, v3 */
		 (( com.badlogic.gdx.math.Vector2 ) v0 ).set ( v1, v2 ); // invoke-virtual {v0, v1, v2}, Lcom/badlogic/gdx/math/Vector2;->set(FF)Lcom/badlogic/gdx/math/Vector2;
		 v0 = this.localPoint;
	 } // .end method
	 public Integer getPointCount ( ) {
		 /* .locals 2 */
		 /* iget-wide v0, p0, Lcom/badlogic/gdx/physics/box2d/Manifold;->addr:J */
		 v0 = 		 /* invoke-direct {p0, v0, v1}, Lcom/badlogic/gdx/physics/box2d/Manifold;->jniGetPointCount(J)I */
	 } // .end method
	 public com.badlogic.gdx.physics.box2d.Manifold$ManifoldPoint getPoints ( ) {
		 /* .locals 8 */
		 int v7 = 0; // const/4 v7, 0x0
		 /* iget-wide v0, p0, Lcom/badlogic/gdx/physics/box2d/Manifold;->addr:J */
		 v0 = 		 /* invoke-direct {p0, v0, v1}, Lcom/badlogic/gdx/physics/box2d/Manifold;->jniGetPointCount(J)I */
		 /* move v1, v7 */
	 } // :goto_0
	 /* if-ge v1, v0, :cond_0 */
	 /* iget-wide v2, p0, Lcom/badlogic/gdx/physics/box2d/Manifold;->addr:J */
	 v4 = this.tmpFloat;
	 v2 = 	 /* invoke-direct {p0, v2, v3, v4, v1}, Lcom/badlogic/gdx/physics/box2d/Manifold;->jniGetPoint(J[FI)I */
	 v3 = this.points;
	 /* aget-object v3, v3, v1 */
	 /* iput v2, v3, Lcom/badlogic/gdx/physics/box2d/Manifold$ManifoldPoint;->contactID:I */
	 v2 = this.localPoint;
	 v4 = this.tmpFloat;
	 /* aget v4, v4, v7 */
	 v5 = this.tmpFloat;
	 int v6 = 1; // const/4 v6, 0x1
	 /* aget v5, v5, v6 */
	 (( com.badlogic.gdx.math.Vector2 ) v2 ).set ( v4, v5 ); // invoke-virtual {v2, v4, v5}, Lcom/badlogic/gdx/math/Vector2;->set(FF)Lcom/badlogic/gdx/math/Vector2;
	 v2 = this.tmpFloat;
	 int v4 = 2; // const/4 v4, 0x2
	 /* aget v2, v2, v4 */
	 /* iput v2, v3, Lcom/badlogic/gdx/physics/box2d/Manifold$ManifoldPoint;->normalImpulse:F */
	 v2 = this.tmpFloat;
	 int v4 = 3; // const/4 v4, 0x3
	 /* aget v2, v2, v4 */
	 /* iput v2, v3, Lcom/badlogic/gdx/physics/box2d/Manifold$ManifoldPoint;->tangentImpulse:F */
	 /* add-int/lit8 v1, v1, 0x1 */
} // :cond_0
v0 = this.points;
} // .end method
public com.badlogic.gdx.physics.box2d.Manifold$ManifoldType getType ( ) {
/* .locals 2 */
/* iget-wide v0, p0, Lcom/badlogic/gdx/physics/box2d/Manifold;->addr:J */
v0 = /* invoke-direct {p0, v0, v1}, Lcom/badlogic/gdx/physics/box2d/Manifold;->jniGetType(J)I */
/* if-nez v0, :cond_0 */
v0 = com.badlogic.gdx.physics.box2d.Manifold$ManifoldType.Circle;
} // :goto_0
} // :cond_0
int v1 = 1; // const/4 v1, 0x1
/* if-ne v0, v1, :cond_1 */
v0 = com.badlogic.gdx.physics.box2d.Manifold$ManifoldType.FaceA;
} // :cond_1
int v1 = 2; // const/4 v1, 0x2
/* if-ne v0, v1, :cond_2 */
v0 = com.badlogic.gdx.physics.box2d.Manifold$ManifoldType.FaceB;
} // :cond_2
v0 = com.badlogic.gdx.physics.box2d.Manifold$ManifoldType.Circle;
} // .end method
