public class com.badlogic.gdx.math.Frustum {
	 /* # static fields */
	 protected static final com.badlogic.gdx.math.Vector3 clipSpacePlanePoints;
	 protected static final clipSpacePlanePointsArray;
	 /* # instance fields */
	 public final com.badlogic.gdx.math.Vector3 planePoints;
	 protected final planePointsArray;
	 public final com.badlogic.gdx.math.Plane planes;
	 /* # direct methods */
	 static com.badlogic.gdx.math.Frustum ( ) {
		 /* .locals 8 */
		 int v5 = 0; // const/4 v5, 0x0
		 /* const/high16 v4, 0x3f800000 # 1.0f */
		 /* const/high16 v3, -0x40800000 # -1.0f */
		 /* const/16 v0, 0x8 */
		 /* new-array v0, v0, [Lcom/badlogic/gdx/math/Vector3; */
		 /* new-instance v1, Lcom/badlogic/gdx/math/Vector3; */
		 /* invoke-direct {v1, v3, v3, v3}, Lcom/badlogic/gdx/math/Vector3;-><init>(FFF)V */
		 /* aput-object v1, v0, v5 */
		 int v1 = 1; // const/4 v1, 0x1
		 /* new-instance v2, Lcom/badlogic/gdx/math/Vector3; */
		 /* invoke-direct {v2, v4, v3, v3}, Lcom/badlogic/gdx/math/Vector3;-><init>(FFF)V */
		 /* aput-object v2, v0, v1 */
		 int v1 = 2; // const/4 v1, 0x2
		 /* new-instance v2, Lcom/badlogic/gdx/math/Vector3; */
		 /* invoke-direct {v2, v4, v4, v3}, Lcom/badlogic/gdx/math/Vector3;-><init>(FFF)V */
		 /* aput-object v2, v0, v1 */
		 int v1 = 3; // const/4 v1, 0x3
		 /* new-instance v2, Lcom/badlogic/gdx/math/Vector3; */
		 /* invoke-direct {v2, v3, v4, v3}, Lcom/badlogic/gdx/math/Vector3;-><init>(FFF)V */
		 /* aput-object v2, v0, v1 */
		 int v1 = 4; // const/4 v1, 0x4
		 /* new-instance v2, Lcom/badlogic/gdx/math/Vector3; */
		 /* invoke-direct {v2, v3, v3, v4}, Lcom/badlogic/gdx/math/Vector3;-><init>(FFF)V */
		 /* aput-object v2, v0, v1 */
		 int v1 = 5; // const/4 v1, 0x5
		 /* new-instance v2, Lcom/badlogic/gdx/math/Vector3; */
		 /* invoke-direct {v2, v4, v3, v4}, Lcom/badlogic/gdx/math/Vector3;-><init>(FFF)V */
		 /* aput-object v2, v0, v1 */
		 int v1 = 6; // const/4 v1, 0x6
		 /* new-instance v2, Lcom/badlogic/gdx/math/Vector3; */
		 /* invoke-direct {v2, v4, v4, v4}, Lcom/badlogic/gdx/math/Vector3;-><init>(FFF)V */
		 /* aput-object v2, v0, v1 */
		 int v1 = 7; // const/4 v1, 0x7
		 /* new-instance v2, Lcom/badlogic/gdx/math/Vector3; */
		 /* invoke-direct {v2, v3, v4, v4}, Lcom/badlogic/gdx/math/Vector3;-><init>(FFF)V */
		 /* aput-object v2, v0, v1 */
		 /* const/16 v0, 0x18 */
		 /* new-array v0, v0, [F */
		 v0 = com.badlogic.gdx.math.Frustum.clipSpacePlanePoints;
		 /* array-length v1, v0 */
		 /* move v2, v5 */
		 /* move v3, v5 */
	 } // :goto_0
	 /* if-ge v2, v1, :cond_0 */
	 /* aget-object v4, v0, v2 */
	 v5 = com.badlogic.gdx.math.Frustum.clipSpacePlanePointsArray;
	 /* add-int/lit8 v6, v3, 0x1 */
	 /* iget v7, v4, Lcom/badlogic/gdx/math/Vector3;->x:F */
	 /* aput v7, v5, v3 */
	 v3 = com.badlogic.gdx.math.Frustum.clipSpacePlanePointsArray;
	 /* add-int/lit8 v5, v6, 0x1 */
	 /* iget v7, v4, Lcom/badlogic/gdx/math/Vector3;->y:F */
	 /* aput v7, v3, v6 */
	 v3 = com.badlogic.gdx.math.Frustum.clipSpacePlanePointsArray;
	 /* add-int/lit8 v6, v5, 0x1 */
	 /* iget v4, v4, Lcom/badlogic/gdx/math/Vector3;->z:F */
	 /* aput v4, v3, v5 */
	 /* add-int/lit8 v2, v2, 0x1 */
	 /* move v3, v6 */
} // :cond_0
return;
} // .end method
public com.badlogic.gdx.math.Frustum ( ) {
/* .locals 6 */
int v3 = 0; // const/4 v3, 0x0
int v5 = 6; // const/4 v5, 0x6
/* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
/* new-array v0, v5, [Lcom/badlogic/gdx/math/Plane; */
this.planes = v0;
/* const/16 v0, 0x8 */
/* new-array v0, v0, [Lcom/badlogic/gdx/math/Vector3; */
/* new-instance v1, Lcom/badlogic/gdx/math/Vector3; */
/* invoke-direct {v1}, Lcom/badlogic/gdx/math/Vector3;-><init>()V */
/* aput-object v1, v0, v3 */
int v1 = 1; // const/4 v1, 0x1
/* new-instance v2, Lcom/badlogic/gdx/math/Vector3; */
/* invoke-direct {v2}, Lcom/badlogic/gdx/math/Vector3;-><init>()V */
/* aput-object v2, v0, v1 */
int v1 = 2; // const/4 v1, 0x2
/* new-instance v2, Lcom/badlogic/gdx/math/Vector3; */
/* invoke-direct {v2}, Lcom/badlogic/gdx/math/Vector3;-><init>()V */
/* aput-object v2, v0, v1 */
int v1 = 3; // const/4 v1, 0x3
/* new-instance v2, Lcom/badlogic/gdx/math/Vector3; */
/* invoke-direct {v2}, Lcom/badlogic/gdx/math/Vector3;-><init>()V */
/* aput-object v2, v0, v1 */
int v1 = 4; // const/4 v1, 0x4
/* new-instance v2, Lcom/badlogic/gdx/math/Vector3; */
/* invoke-direct {v2}, Lcom/badlogic/gdx/math/Vector3;-><init>()V */
/* aput-object v2, v0, v1 */
int v1 = 5; // const/4 v1, 0x5
/* new-instance v2, Lcom/badlogic/gdx/math/Vector3; */
/* invoke-direct {v2}, Lcom/badlogic/gdx/math/Vector3;-><init>()V */
/* aput-object v2, v0, v1 */
/* new-instance v1, Lcom/badlogic/gdx/math/Vector3; */
/* invoke-direct {v1}, Lcom/badlogic/gdx/math/Vector3;-><init>()V */
/* aput-object v1, v0, v5 */
int v1 = 7; // const/4 v1, 0x7
/* new-instance v2, Lcom/badlogic/gdx/math/Vector3; */
/* invoke-direct {v2}, Lcom/badlogic/gdx/math/Vector3;-><init>()V */
/* aput-object v2, v0, v1 */
this.planePoints = v0;
/* const/16 v0, 0x18 */
/* new-array v0, v0, [F */
this.planePointsArray = v0;
/* move v0, v3 */
} // :goto_0
/* if-ge v0, v5, :cond_0 */
v1 = this.planes;
/* new-instance v2, Lcom/badlogic/gdx/math/Plane; */
/* new-instance v3, Lcom/badlogic/gdx/math/Vector3; */
/* invoke-direct {v3}, Lcom/badlogic/gdx/math/Vector3;-><init>()V */
int v4 = 0; // const/4 v4, 0x0
/* invoke-direct {v2, v3, v4}, Lcom/badlogic/gdx/math/Plane;-><init>(Lcom/badlogic/gdx/math/Vector3;F)V */
/* aput-object v2, v1, v0 */
/* add-int/lit8 v0, v0, 0x1 */
} // :cond_0
return;
} // .end method
/* # virtual methods */
public Boolean boundsInFrustum ( com.badlogic.gdx.math.collision.BoundingBox p0 ) {
/* .locals 9 */
int v8 = 0; // const/4 v8, 0x0
(( com.badlogic.gdx.math.collision.BoundingBox ) p1 ).getCorners ( ); // invoke-virtual {p1}, Lcom/badlogic/gdx/math/collision/BoundingBox;->getCorners()[Lcom/badlogic/gdx/math/Vector3;
/* array-length v1, v0 */
v2 = this.planes;
/* array-length v2, v2 */
/* move v3, v8 */
} // :goto_0
/* if-ge v3, v2, :cond_3 */
/* move v4, v8 */
/* move v5, v8 */
} // :goto_1
/* if-ge v4, v1, :cond_1 */
v6 = this.planes;
/* aget-object v6, v6, v3 */
/* aget-object v7, v0, v4 */
(( com.badlogic.gdx.math.Plane ) v6 ).testPoint ( v7 ); // invoke-virtual {v6, v7}, Lcom/badlogic/gdx/math/Plane;->testPoint(Lcom/badlogic/gdx/math/Vector3;)Lcom/badlogic/gdx/math/Plane$PlaneSide;
v7 = com.badlogic.gdx.math.Plane$PlaneSide.Back;
/* if-ne v6, v7, :cond_0 */
/* add-int/lit8 v5, v5, 0x1 */
} // :cond_0
/* add-int/lit8 v4, v4, 0x1 */
} // :cond_1
/* const/16 v4, 0x8 */
/* if-ne v5, v4, :cond_2 */
/* move v0, v8 */
} // :goto_2
} // :cond_2
/* add-int/lit8 v3, v3, 0x1 */
} // :cond_3
int v0 = 1; // const/4 v0, 0x1
} // .end method
public Boolean pointInFrustum ( com.badlogic.gdx.math.Vector3 p0 ) {
/* .locals 4 */
int v3 = 0; // const/4 v3, 0x0
/* move v0, v3 */
} // :goto_0
v1 = this.planes;
/* array-length v1, v1 */
/* if-ge v0, v1, :cond_1 */
v1 = this.planes;
/* aget-object v1, v1, v0 */
(( com.badlogic.gdx.math.Plane ) v1 ).testPoint ( p1 ); // invoke-virtual {v1, p1}, Lcom/badlogic/gdx/math/Plane;->testPoint(Lcom/badlogic/gdx/math/Vector3;)Lcom/badlogic/gdx/math/Plane$PlaneSide;
v2 = com.badlogic.gdx.math.Plane$PlaneSide.Back;
/* if-ne v1, v2, :cond_0 */
/* move v0, v3 */
} // :goto_1
} // :cond_0
/* add-int/lit8 v0, v0, 0x1 */
} // :cond_1
int v0 = 1; // const/4 v0, 0x1
} // .end method
public Boolean sphereInFrustum ( com.badlogic.gdx.math.Vector3 p0, Float p1 ) {
/* .locals 4 */
int v3 = 0; // const/4 v3, 0x0
/* move v0, v3 */
} // :goto_0
v1 = this.planes;
/* array-length v1, v1 */
/* if-ge v0, v1, :cond_1 */
v1 = this.planes;
/* aget-object v1, v1, v0 */
v1 = (( com.badlogic.gdx.math.Plane ) v1 ).distance ( p1 ); // invoke-virtual {v1, p1}, Lcom/badlogic/gdx/math/Plane;->distance(Lcom/badlogic/gdx/math/Vector3;)F
/* neg-float v2, p2 */
/* cmpg-float v1, v1, v2 */
/* if-gez v1, :cond_0 */
/* move v0, v3 */
} // :goto_1
} // :cond_0
/* add-int/lit8 v0, v0, 0x1 */
} // :cond_1
int v0 = 1; // const/4 v0, 0x1
} // .end method
public Boolean sphereInFrustumWithoutNearFar ( com.badlogic.gdx.math.Vector3 p0, Float p1 ) {
/* .locals 4 */
int v3 = 0; // const/4 v3, 0x0
/* move v0, v3 */
} // :goto_0
v1 = this.planes;
/* array-length v1, v1 */
/* if-ge v0, v1, :cond_1 */
v1 = this.planes;
/* aget-object v1, v1, v0 */
v1 = (( com.badlogic.gdx.math.Plane ) v1 ).distance ( p1 ); // invoke-virtual {v1, p1}, Lcom/badlogic/gdx/math/Plane;->distance(Lcom/badlogic/gdx/math/Vector3;)F
/* neg-float v2, p2 */
/* cmpg-float v1, v1, v2 */
/* if-gez v1, :cond_0 */
/* move v0, v3 */
} // :goto_1
} // :cond_0
/* add-int/lit8 v0, v0, 0x1 */
} // :cond_1
int v0 = 1; // const/4 v0, 0x1
} // .end method
public void update ( com.badlogic.gdx.math.Matrix4 p0 ) {
/* .locals 10 */
int v9 = 2; // const/4 v9, 0x2
int v8 = 4; // const/4 v8, 0x4
int v7 = 3; // const/4 v7, 0x3
int v6 = 1; // const/4 v6, 0x1
int v5 = 0; // const/4 v5, 0x0
v0 = com.badlogic.gdx.math.Frustum.clipSpacePlanePointsArray;
v1 = this.planePointsArray;
v2 = com.badlogic.gdx.math.Frustum.clipSpacePlanePointsArray;
/* array-length v2, v2 */
java.lang.System .arraycopy ( v0,v5,v1,v5,v2 );
v0 = this.val;
v1 = this.planePointsArray;
/* const/16 v2, 0x8 */
com.badlogic.gdx.math.Matrix4 .prj ( v0,v1,v5,v2,v7 );
/* move v0, v5 */
/* move v1, v5 */
} // :goto_0
/* const/16 v2, 0x8 */
/* if-ge v1, v2, :cond_0 */
v2 = this.planePoints;
/* aget-object v2, v2, v1 */
v3 = this.planePointsArray;
/* add-int/lit8 v4, v0, 0x1 */
/* aget v0, v3, v0 */
/* iput v0, v2, Lcom/badlogic/gdx/math/Vector3;->x:F */
v0 = this.planePointsArray;
/* add-int/lit8 v3, v4, 0x1 */
/* aget v0, v0, v4 */
/* iput v0, v2, Lcom/badlogic/gdx/math/Vector3;->y:F */
v0 = this.planePointsArray;
/* add-int/lit8 v4, v3, 0x1 */
/* aget v0, v0, v3 */
/* iput v0, v2, Lcom/badlogic/gdx/math/Vector3;->z:F */
/* add-int/lit8 v0, v1, 0x1 */
/* move v1, v0 */
/* move v0, v4 */
} // :cond_0
v0 = this.planes;
/* aget-object v0, v0, v5 */
v1 = this.planePoints;
/* aget-object v1, v1, v6 */
v2 = this.planePoints;
/* aget-object v2, v2, v5 */
v3 = this.planePoints;
/* aget-object v3, v3, v9 */
(( com.badlogic.gdx.math.Plane ) v0 ).set ( v1, v2, v3 ); // invoke-virtual {v0, v1, v2, v3}, Lcom/badlogic/gdx/math/Plane;->set(Lcom/badlogic/gdx/math/Vector3;Lcom/badlogic/gdx/math/Vector3;Lcom/badlogic/gdx/math/Vector3;)V
v0 = this.planes;
/* aget-object v0, v0, v6 */
v1 = this.planePoints;
/* aget-object v1, v1, v8 */
v2 = this.planePoints;
int v3 = 5; // const/4 v3, 0x5
/* aget-object v2, v2, v3 */
v3 = this.planePoints;
int v4 = 7; // const/4 v4, 0x7
/* aget-object v3, v3, v4 */
(( com.badlogic.gdx.math.Plane ) v0 ).set ( v1, v2, v3 ); // invoke-virtual {v0, v1, v2, v3}, Lcom/badlogic/gdx/math/Plane;->set(Lcom/badlogic/gdx/math/Vector3;Lcom/badlogic/gdx/math/Vector3;Lcom/badlogic/gdx/math/Vector3;)V
v0 = this.planes;
/* aget-object v0, v0, v9 */
v1 = this.planePoints;
/* aget-object v1, v1, v5 */
v2 = this.planePoints;
/* aget-object v2, v2, v8 */
v3 = this.planePoints;
/* aget-object v3, v3, v7 */
(( com.badlogic.gdx.math.Plane ) v0 ).set ( v1, v2, v3 ); // invoke-virtual {v0, v1, v2, v3}, Lcom/badlogic/gdx/math/Plane;->set(Lcom/badlogic/gdx/math/Vector3;Lcom/badlogic/gdx/math/Vector3;Lcom/badlogic/gdx/math/Vector3;)V
v0 = this.planes;
/* aget-object v0, v0, v7 */
v1 = this.planePoints;
int v2 = 5; // const/4 v2, 0x5
/* aget-object v1, v1, v2 */
v2 = this.planePoints;
/* aget-object v2, v2, v6 */
v3 = this.planePoints;
int v4 = 6; // const/4 v4, 0x6
/* aget-object v3, v3, v4 */
(( com.badlogic.gdx.math.Plane ) v0 ).set ( v1, v2, v3 ); // invoke-virtual {v0, v1, v2, v3}, Lcom/badlogic/gdx/math/Plane;->set(Lcom/badlogic/gdx/math/Vector3;Lcom/badlogic/gdx/math/Vector3;Lcom/badlogic/gdx/math/Vector3;)V
v0 = this.planes;
/* aget-object v0, v0, v8 */
v1 = this.planePoints;
/* aget-object v1, v1, v9 */
v2 = this.planePoints;
/* aget-object v2, v2, v7 */
v3 = this.planePoints;
int v4 = 6; // const/4 v4, 0x6
/* aget-object v3, v3, v4 */
(( com.badlogic.gdx.math.Plane ) v0 ).set ( v1, v2, v3 ); // invoke-virtual {v0, v1, v2, v3}, Lcom/badlogic/gdx/math/Plane;->set(Lcom/badlogic/gdx/math/Vector3;Lcom/badlogic/gdx/math/Vector3;Lcom/badlogic/gdx/math/Vector3;)V
v0 = this.planes;
int v1 = 5; // const/4 v1, 0x5
/* aget-object v0, v0, v1 */
v1 = this.planePoints;
/* aget-object v1, v1, v8 */
v2 = this.planePoints;
/* aget-object v2, v2, v5 */
v3 = this.planePoints;
/* aget-object v3, v3, v6 */
(( com.badlogic.gdx.math.Plane ) v0 ).set ( v1, v2, v3 ); // invoke-virtual {v0, v1, v2, v3}, Lcom/badlogic/gdx/math/Plane;->set(Lcom/badlogic/gdx/math/Vector3;Lcom/badlogic/gdx/math/Vector3;Lcom/badlogic/gdx/math/Vector3;)V
return;
} // .end method
