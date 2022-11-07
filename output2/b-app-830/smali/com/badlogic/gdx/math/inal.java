public class inal {
	 /* # static fields */
	 static com.badlogic.gdx.math.Vector3 best;
	 private static final com.badlogic.gdx.math.Vector3 dir;
	 private static final com.badlogic.gdx.math.Vector3 i;
	 private static final com.badlogic.gdx.math.Plane p;
	 private static final com.badlogic.gdx.math.Vector3 start;
	 static com.badlogic.gdx.math.Vector3 tmp;
	 static com.badlogic.gdx.math.Vector3 tmp1;
	 static com.badlogic.gdx.math.Vector3 tmp2;
	 static com.badlogic.gdx.math.Vector3 tmp3;
	 private static final com.badlogic.gdx.math.Vector3 v0;
	 private static final com.badlogic.gdx.math.Vector3 v1;
	 private static final com.badlogic.gdx.math.Vector3 v2;
	 /* # direct methods */
	 static inal ( ) {
		 /* .locals 3 */
		 /* new-instance v0, Lcom/badlogic/gdx/math/Vector3; */
		 /* invoke-direct {v0}, Lcom/badlogic/gdx/math/Vector3;-><init>()V */
		 /* new-instance v0, Lcom/badlogic/gdx/math/Vector3; */
		 /* invoke-direct {v0}, Lcom/badlogic/gdx/math/Vector3;-><init>()V */
		 /* new-instance v0, Lcom/badlogic/gdx/math/Vector3; */
		 /* invoke-direct {v0}, Lcom/badlogic/gdx/math/Vector3;-><init>()V */
		 /* new-instance v0, Lcom/badlogic/gdx/math/Plane; */
		 /* new-instance v1, Lcom/badlogic/gdx/math/Vector3; */
		 /* invoke-direct {v1}, Lcom/badlogic/gdx/math/Vector3;-><init>()V */
		 int v2 = 0; // const/4 v2, 0x0
		 /* invoke-direct {v0, v1, v2}, Lcom/badlogic/gdx/math/Plane;-><init>(Lcom/badlogic/gdx/math/Vector3;F)V */
		 /* new-instance v0, Lcom/badlogic/gdx/math/Vector3; */
		 /* invoke-direct {v0}, Lcom/badlogic/gdx/math/Vector3;-><init>()V */
		 /* new-instance v0, Lcom/badlogic/gdx/math/Vector3; */
		 /* invoke-direct {v0}, Lcom/badlogic/gdx/math/Vector3;-><init>()V */
		 /* new-instance v0, Lcom/badlogic/gdx/math/Vector3; */
		 /* invoke-direct {v0}, Lcom/badlogic/gdx/math/Vector3;-><init>()V */
		 /* new-instance v0, Lcom/badlogic/gdx/math/Vector3; */
		 /* invoke-direct {v0}, Lcom/badlogic/gdx/math/Vector3;-><init>()V */
		 /* new-instance v0, Lcom/badlogic/gdx/math/Vector3; */
		 /* invoke-direct {v0}, Lcom/badlogic/gdx/math/Vector3;-><init>()V */
		 /* new-instance v0, Lcom/badlogic/gdx/math/Vector3; */
		 /* invoke-direct {v0}, Lcom/badlogic/gdx/math/Vector3;-><init>()V */
		 /* new-instance v0, Lcom/badlogic/gdx/math/Vector3; */
		 /* invoke-direct {v0}, Lcom/badlogic/gdx/math/Vector3;-><init>()V */
		 /* new-instance v0, Lcom/badlogic/gdx/math/Vector3; */
		 /* invoke-direct {v0}, Lcom/badlogic/gdx/math/Vector3;-><init>()V */
		 return;
	 } // .end method
	 public inal ( ) {
		 /* .locals 0 */
		 /* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
		 return;
	 } // .end method
	 static Float det ( Float p0, Float p1, Float p2, Float p3 ) {
		 /* .locals 2 */
		 /* mul-float v0, p0, p3 */
		 /* mul-float v1, p1, p2 */
		 /* sub-float/2addr v0, v1 */
	 } // .end method
	 static Double detd ( Double p0, Double p1, Double p2, Double p3 ) {
		 /* .locals 4 */
		 /* mul-double v0, p0, p6 */
		 /* mul-double v2, p2, p4 */
		 /* sub-double/2addr v0, v2 */
		 /* return-wide v0 */
	 } // .end method
	 public static Float distanceLinePoint ( com.badlogic.gdx.math.Vector2 p0, com.badlogic.gdx.math.Vector2 p1, com.badlogic.gdx.math.Vector2 p2 ) {
		 /* .locals 5 */
		 int v4 = 0; // const/4 v4, 0x0
		 v0 = com.badlogic.gdx.math.Intersector.tmp;
		 /* iget v1, p1, Lcom/badlogic/gdx/math/Vector2;->x:F */
		 /* iget v2, p1, Lcom/badlogic/gdx/math/Vector2;->y:F */
		 (( com.badlogic.gdx.math.Vector3 ) v0 ).set ( v1, v2, v4 ); // invoke-virtual {v0, v1, v2, v4}, Lcom/badlogic/gdx/math/Vector3;->set(FFF)Lcom/badlogic/gdx/math/Vector3;
		 v0 = com.badlogic.gdx.math.Intersector.tmp;
		 /* iget v1, p0, Lcom/badlogic/gdx/math/Vector2;->y:F */
		 /* iget v2, p0, Lcom/badlogic/gdx/math/Vector2;->y:F */
		 (( com.badlogic.gdx.math.Vector3 ) v0 ).sub ( v1, v2, v4 ); // invoke-virtual {v0, v1, v2, v4}, Lcom/badlogic/gdx/math/Vector3;->sub(FFF)Lcom/badlogic/gdx/math/Vector3;
		 v0 = 		 (( com.badlogic.gdx.math.Vector3 ) v0 ).len2 ( ); // invoke-virtual {v0}, Lcom/badlogic/gdx/math/Vector3;->len2()F
		 /* cmpl-float v1, v0, v4 */
		 /* if-nez v1, :cond_0 */
		 v0 = 		 (( com.badlogic.gdx.math.Vector2 ) p2 ).dst ( p0 ); // invoke-virtual {p2, p0}, Lcom/badlogic/gdx/math/Vector2;->dst(Lcom/badlogic/gdx/math/Vector2;)F
	 } // :goto_0
} // :cond_0
v1 = com.badlogic.gdx.math.Intersector.tmp;
/* iget v2, p2, Lcom/badlogic/gdx/math/Vector2;->x:F */
/* iget v3, p2, Lcom/badlogic/gdx/math/Vector2;->y:F */
(( com.badlogic.gdx.math.Vector3 ) v1 ).set ( v2, v3, v4 ); // invoke-virtual {v1, v2, v3, v4}, Lcom/badlogic/gdx/math/Vector3;->set(FFF)Lcom/badlogic/gdx/math/Vector3;
v1 = com.badlogic.gdx.math.Intersector.tmp;
/* iget v2, p0, Lcom/badlogic/gdx/math/Vector2;->x:F */
/* iget v3, p0, Lcom/badlogic/gdx/math/Vector2;->y:F */
(( com.badlogic.gdx.math.Vector3 ) v1 ).sub ( v2, v3, v4 ); // invoke-virtual {v1, v2, v3, v4}, Lcom/badlogic/gdx/math/Vector3;->sub(FFF)Lcom/badlogic/gdx/math/Vector3;
v1 = com.badlogic.gdx.math.Intersector.tmp2;
/* iget v2, p1, Lcom/badlogic/gdx/math/Vector2;->x:F */
/* iget v3, p1, Lcom/badlogic/gdx/math/Vector2;->y:F */
(( com.badlogic.gdx.math.Vector3 ) v1 ).set ( v2, v3, v4 ); // invoke-virtual {v1, v2, v3, v4}, Lcom/badlogic/gdx/math/Vector3;->set(FFF)Lcom/badlogic/gdx/math/Vector3;
v1 = com.badlogic.gdx.math.Intersector.tmp2;
/* iget v2, p0, Lcom/badlogic/gdx/math/Vector2;->x:F */
/* iget v3, p0, Lcom/badlogic/gdx/math/Vector2;->y:F */
(( com.badlogic.gdx.math.Vector3 ) v1 ).sub ( v2, v3, v4 ); // invoke-virtual {v1, v2, v3, v4}, Lcom/badlogic/gdx/math/Vector3;->sub(FFF)Lcom/badlogic/gdx/math/Vector3;
v1 = com.badlogic.gdx.math.Intersector.tmp;
v2 = com.badlogic.gdx.math.Intersector.tmp2;
v1 = (( com.badlogic.gdx.math.Vector3 ) v1 ).dot ( v2 ); // invoke-virtual {v1, v2}, Lcom/badlogic/gdx/math/Vector3;->dot(Lcom/badlogic/gdx/math/Vector3;)F
/* div-float v0, v1, v0 */
/* cmpg-float v1, v0, v4 */
/* if-gez v1, :cond_1 */
v0 = (( com.badlogic.gdx.math.Vector2 ) p2 ).dst ( p0 ); // invoke-virtual {p2, p0}, Lcom/badlogic/gdx/math/Vector2;->dst(Lcom/badlogic/gdx/math/Vector2;)F
} // :cond_1
/* const/high16 v1, 0x3f800000 # 1.0f */
/* cmpl-float v1, v0, v1 */
/* if-lez v1, :cond_2 */
v0 = (( com.badlogic.gdx.math.Vector2 ) p2 ).dst ( p1 ); // invoke-virtual {p2, p1}, Lcom/badlogic/gdx/math/Vector2;->dst(Lcom/badlogic/gdx/math/Vector2;)F
} // :cond_2
v1 = com.badlogic.gdx.math.Intersector.tmp;
/* iget v2, p1, Lcom/badlogic/gdx/math/Vector2;->x:F */
/* iget v3, p1, Lcom/badlogic/gdx/math/Vector2;->y:F */
(( com.badlogic.gdx.math.Vector3 ) v1 ).set ( v2, v3, v4 ); // invoke-virtual {v1, v2, v3, v4}, Lcom/badlogic/gdx/math/Vector3;->set(FFF)Lcom/badlogic/gdx/math/Vector3;
v1 = com.badlogic.gdx.math.Intersector.tmp;
/* iget v2, p0, Lcom/badlogic/gdx/math/Vector2;->x:F */
/* iget v3, p0, Lcom/badlogic/gdx/math/Vector2;->y:F */
(( com.badlogic.gdx.math.Vector3 ) v1 ).sub ( v2, v3, v4 ); // invoke-virtual {v1, v2, v3, v4}, Lcom/badlogic/gdx/math/Vector3;->sub(FFF)Lcom/badlogic/gdx/math/Vector3;
(( com.badlogic.gdx.math.Vector3 ) v1 ).mul ( v0 ); // invoke-virtual {v1, v0}, Lcom/badlogic/gdx/math/Vector3;->mul(F)Lcom/badlogic/gdx/math/Vector3;
/* iget v1, p0, Lcom/badlogic/gdx/math/Vector2;->x:F */
/* iget v2, p0, Lcom/badlogic/gdx/math/Vector2;->y:F */
(( com.badlogic.gdx.math.Vector3 ) v0 ).add ( v1, v2, v4 ); // invoke-virtual {v0, v1, v2, v4}, Lcom/badlogic/gdx/math/Vector3;->add(FFF)Lcom/badlogic/gdx/math/Vector3;
v0 = com.badlogic.gdx.math.Intersector.tmp2;
/* iget v1, p2, Lcom/badlogic/gdx/math/Vector2;->x:F */
/* iget v2, p2, Lcom/badlogic/gdx/math/Vector2;->y:F */
(( com.badlogic.gdx.math.Vector3 ) v0 ).set ( v1, v2, v4 ); // invoke-virtual {v0, v1, v2, v4}, Lcom/badlogic/gdx/math/Vector3;->set(FFF)Lcom/badlogic/gdx/math/Vector3;
v1 = com.badlogic.gdx.math.Intersector.tmp;
v0 = (( com.badlogic.gdx.math.Vector3 ) v0 ).dst ( v1 ); // invoke-virtual {v0, v1}, Lcom/badlogic/gdx/math/Vector3;->dst(Lcom/badlogic/gdx/math/Vector3;)F
} // .end method
public static Float getLowestPositiveRoot ( Float p0, Float p1, Float p2 ) {
/* .locals 6 */
/* const/high16 v5, 0x7fc00000 # Float.NaN */
int v4 = 0; // const/4 v4, 0x0
/* mul-float v0, p1, p1 */
/* const/high16 v1, 0x40800000 # 4.0f */
/* mul-float/2addr v1, p0 */
/* mul-float/2addr v1, p2 */
/* sub-float/2addr v0, v1 */
/* cmpg-float v1, v0, v4 */
/* if-gez v1, :cond_1 */
/* move v0, v5 */
} // :cond_0
} // :goto_0
} // :cond_1
/* float-to-double v0, v0 */
java.lang.Math .sqrt ( v0,v1 );
/* move-result-wide v0 */
/* double-to-float v0, v0 */
/* const/high16 v1, 0x3f800000 # 1.0f */
/* const/high16 v2, 0x40000000 # 2.0f */
/* mul-float/2addr v2, p0 */
/* div-float/2addr v1, v2 */
/* neg-float v2, p1 */
/* sub-float/2addr v2, v0 */
/* mul-float/2addr v2, v1 */
/* neg-float v3, p1 */
/* add-float/2addr v0, v3 */
/* mul-float/2addr v0, v1 */
/* cmpl-float v1, v2, v0 */
/* if-lez v1, :cond_3 */
/* move v1, v2 */
} // :goto_1
/* cmpl-float v2, v0, v4 */
/* if-gtz v2, :cond_0 */
/* cmpl-float v0, v1, v4 */
/* if-lez v0, :cond_2 */
/* move v0, v1 */
} // :cond_2
/* move v0, v5 */
} // :cond_3
/* move v1, v0 */
/* move v0, v2 */
} // .end method
public static Boolean intersectLines ( com.badlogic.gdx.math.Vector2 p0, com.badlogic.gdx.math.Vector2 p1, com.badlogic.gdx.math.Vector2 p2, com.badlogic.gdx.math.Vector2 p3, com.badlogic.gdx.math.Vector2 p4 ) {
/* .locals 10 */
/* iget v0, p0, Lcom/badlogic/gdx/math/Vector2;->x:F */
/* iget p0, p0, Lcom/badlogic/gdx/math/Vector2;->y:F */
/* iget v1, p1, Lcom/badlogic/gdx/math/Vector2;->x:F */
/* iget p1, p1, Lcom/badlogic/gdx/math/Vector2;->y:F */
/* iget v2, p2, Lcom/badlogic/gdx/math/Vector2;->x:F */
/* iget p2, p2, Lcom/badlogic/gdx/math/Vector2;->y:F */
/* iget v3, p3, Lcom/badlogic/gdx/math/Vector2;->x:F */
/* iget p3, p3, Lcom/badlogic/gdx/math/Vector2;->y:F */
v4 = com.badlogic.gdx.math.Intersector .det ( v0,p0,v1,p1 );
v5 = com.badlogic.gdx.math.Intersector .det ( v2,p2,v3,p3 );
/* sub-float v6, v0, v1 */
/* sub-float v7, p0, p1 */
/* sub-float v8, v2, v3 */
/* sub-float v9, p2, p3 */
v6 = com.badlogic.gdx.math.Intersector .det ( v6,v7,v8,v9 );
/* sub-float/2addr v0, v1 */
/* sub-float v1, v2, v3 */
v0 = com.badlogic.gdx.math.Intersector .det ( v4,v0,v5,v1 );
/* div-float/2addr v0, v6 */
/* sub-float/2addr p0, p1 */
/* sub-float p1, p2, p3 */
p0 = com.badlogic.gdx.math.Intersector .det ( v4,p0,v5,p1 );
/* div-float/2addr p0, v6 */
/* iput v0, p4, Lcom/badlogic/gdx/math/Vector2;->x:F */
/* iput p0, p4, Lcom/badlogic/gdx/math/Vector2;->y:F */
int p0 = 1; // const/4 p0, 0x1
} // .end method
public static Boolean intersectRayBoundsFast ( com.badlogic.gdx.math.collision.Ray p0, com.badlogic.gdx.math.collision.BoundingBox p1 ) {
/* .locals 8 */
/* const/high16 v3, 0x3f800000 # 1.0f */
v0 = this.direction;
/* iget v0, v0, Lcom/badlogic/gdx/math/Vector3;->x:F */
/* div-float v0, v3, v0 */
v1 = this.direction;
/* iget v1, v1, Lcom/badlogic/gdx/math/Vector3;->y:F */
/* div-float v1, v3, v1 */
v2 = this.direction;
/* iget v2, v2, Lcom/badlogic/gdx/math/Vector3;->z:F */
/* div-float v2, v3, v2 */
v3 = this.min;
/* iget v3, v3, Lcom/badlogic/gdx/math/Vector3;->x:F */
v4 = this.origin;
/* iget v4, v4, Lcom/badlogic/gdx/math/Vector3;->x:F */
/* sub-float/2addr v3, v4 */
/* mul-float/2addr v3, v0 */
v4 = this.max;
/* iget v4, v4, Lcom/badlogic/gdx/math/Vector3;->x:F */
v5 = this.origin;
/* iget v5, v5, Lcom/badlogic/gdx/math/Vector3;->x:F */
/* sub-float/2addr v4, v5 */
/* mul-float/2addr v0, v4 */
/* cmpg-float v4, v3, v0 */
/* if-gez v4, :cond_4 */
} // :goto_0
v4 = this.min;
/* iget v4, v4, Lcom/badlogic/gdx/math/Vector3;->y:F */
v5 = this.origin;
/* iget v5, v5, Lcom/badlogic/gdx/math/Vector3;->y:F */
/* sub-float/2addr v4, v5 */
/* mul-float/2addr v4, v1 */
v5 = this.max;
/* iget v5, v5, Lcom/badlogic/gdx/math/Vector3;->y:F */
v6 = this.origin;
/* iget v6, v6, Lcom/badlogic/gdx/math/Vector3;->y:F */
/* sub-float/2addr v5, v6 */
/* mul-float/2addr v1, v5 */
/* cmpl-float v5, v4, v1 */
/* if-lez v5, :cond_0 */
/* move v7, v4 */
/* move v4, v1 */
/* move v1, v7 */
} // :cond_0
/* cmpl-float v5, v4, v3 */
/* if-lez v5, :cond_1 */
/* move v3, v4 */
} // :cond_1
/* cmpg-float v4, v1, v0 */
/* if-gez v4, :cond_2 */
/* move v0, v1 */
} // :cond_2
v1 = this.min;
/* iget v1, v1, Lcom/badlogic/gdx/math/Vector3;->z:F */
v4 = this.origin;
/* iget v4, v4, Lcom/badlogic/gdx/math/Vector3;->z:F */
/* sub-float/2addr v1, v4 */
/* mul-float/2addr v1, v2 */
v4 = this.max;
/* iget v4, v4, Lcom/badlogic/gdx/math/Vector3;->z:F */
v5 = this.origin;
/* iget v5, v5, Lcom/badlogic/gdx/math/Vector3;->z:F */
/* sub-float/2addr v4, v5 */
/* mul-float/2addr v2, v4 */
/* cmpl-float v4, v1, v2 */
/* if-lez v4, :cond_7 */
} // :goto_1
/* cmpl-float v4, v2, v3 */
/* if-lez v4, :cond_6 */
} // :goto_2
/* cmpg-float v3, v1, v0 */
/* if-gez v3, :cond_3 */
/* move v0, v1 */
} // :cond_3
int v1 = 0; // const/4 v1, 0x0
/* cmpl-float v1, v0, v1 */
/* if-ltz v1, :cond_5 */
/* cmpl-float v0, v0, v2 */
/* if-ltz v0, :cond_5 */
int v0 = 1; // const/4 v0, 0x1
} // :goto_3
} // :cond_4
/* move v7, v3 */
/* move v3, v0 */
/* move v0, v7 */
} // :cond_5
int v0 = 0; // const/4 v0, 0x0
} // :cond_6
/* move v2, v3 */
} // :cond_7
/* move v7, v2 */
/* move v2, v1 */
/* move v1, v7 */
} // .end method
public static Boolean intersectRayPlane ( com.badlogic.gdx.math.collision.Ray p0, com.badlogic.gdx.math.Plane p1, com.badlogic.gdx.math.Vector3 p2 ) {
/* .locals 6 */
int v5 = 1; // const/4 v5, 0x1
int v4 = 0; // const/4 v4, 0x0
int v3 = 0; // const/4 v3, 0x0
v0 = this.direction;
(( com.badlogic.gdx.math.Plane ) p1 ).getNormal ( ); // invoke-virtual {p1}, Lcom/badlogic/gdx/math/Plane;->getNormal()Lcom/badlogic/gdx/math/Vector3;
v0 = (( com.badlogic.gdx.math.Vector3 ) v0 ).dot ( v1 ); // invoke-virtual {v0, v1}, Lcom/badlogic/gdx/math/Vector3;->dot(Lcom/badlogic/gdx/math/Vector3;)F
/* cmpl-float v1, v0, v3 */
if ( v1 != null) { // if-eqz v1, :cond_2
v1 = this.origin;
(( com.badlogic.gdx.math.Plane ) p1 ).getNormal ( ); // invoke-virtual {p1}, Lcom/badlogic/gdx/math/Plane;->getNormal()Lcom/badlogic/gdx/math/Vector3;
v1 = (( com.badlogic.gdx.math.Vector3 ) v1 ).dot ( v2 ); // invoke-virtual {v1, v2}, Lcom/badlogic/gdx/math/Vector3;->dot(Lcom/badlogic/gdx/math/Vector3;)F
v2 = (( com.badlogic.gdx.math.Plane ) p1 ).getD ( ); // invoke-virtual {p1}, Lcom/badlogic/gdx/math/Plane;->getD()F
/* add-float/2addr v1, v2 */
/* neg-float v1, v1 */
/* div-float v0, v1, v0 */
/* cmpg-float v1, v0, v3 */
/* if-gez v1, :cond_0 */
/* move v0, v4 */
} // :goto_0
} // :cond_0
if ( p2 != null) { // if-eqz p2, :cond_1
v1 = this.origin;
(( com.badlogic.gdx.math.Vector3 ) p2 ).set ( v1 ); // invoke-virtual {p2, v1}, Lcom/badlogic/gdx/math/Vector3;->set(Lcom/badlogic/gdx/math/Vector3;)Lcom/badlogic/gdx/math/Vector3;
v2 = this.direction;
(( com.badlogic.gdx.math.Vector3 ) v2 ).tmp ( ); // invoke-virtual {v2}, Lcom/badlogic/gdx/math/Vector3;->tmp()Lcom/badlogic/gdx/math/Vector3;
(( com.badlogic.gdx.math.Vector3 ) v2 ).mul ( v0 ); // invoke-virtual {v2, v0}, Lcom/badlogic/gdx/math/Vector3;->mul(F)Lcom/badlogic/gdx/math/Vector3;
(( com.badlogic.gdx.math.Vector3 ) v1 ).add ( v0 ); // invoke-virtual {v1, v0}, Lcom/badlogic/gdx/math/Vector3;->add(Lcom/badlogic/gdx/math/Vector3;)Lcom/badlogic/gdx/math/Vector3;
} // :cond_1
/* move v0, v5 */
} // :cond_2
v0 = this.origin;
(( com.badlogic.gdx.math.Plane ) p1 ).testPoint ( v0 ); // invoke-virtual {p1, v0}, Lcom/badlogic/gdx/math/Plane;->testPoint(Lcom/badlogic/gdx/math/Vector3;)Lcom/badlogic/gdx/math/Plane$PlaneSide;
v1 = com.badlogic.gdx.math.Plane$PlaneSide.OnPlane;
/* if-ne v0, v1, :cond_4 */
if ( p2 != null) { // if-eqz p2, :cond_3
v0 = this.origin;
(( com.badlogic.gdx.math.Vector3 ) p2 ).set ( v0 ); // invoke-virtual {p2, v0}, Lcom/badlogic/gdx/math/Vector3;->set(Lcom/badlogic/gdx/math/Vector3;)Lcom/badlogic/gdx/math/Vector3;
} // :cond_3
/* move v0, v5 */
} // :cond_4
/* move v0, v4 */
} // .end method
public static Boolean intersectRaySphere ( com.badlogic.gdx.math.collision.Ray p0, com.badlogic.gdx.math.Vector3 p1, Float p2, com.badlogic.gdx.math.Vector3 p3 ) {
/* .locals 8 */
int v7 = 1; // const/4 v7, 0x1
int v6 = 0; // const/4 v6, 0x0
/* const/high16 v5, 0x40000000 # 2.0f */
int v4 = 0; // const/4 v4, 0x0
v0 = com.badlogic.gdx.math.Intersector.dir;
v1 = this.direction;
(( com.badlogic.gdx.math.Vector3 ) v0 ).set ( v1 ); // invoke-virtual {v0, v1}, Lcom/badlogic/gdx/math/Vector3;->set(Lcom/badlogic/gdx/math/Vector3;)Lcom/badlogic/gdx/math/Vector3;
(( com.badlogic.gdx.math.Vector3 ) v0 ).nor ( ); // invoke-virtual {v0}, Lcom/badlogic/gdx/math/Vector3;->nor()Lcom/badlogic/gdx/math/Vector3;
v0 = com.badlogic.gdx.math.Intersector.start;
v1 = this.origin;
(( com.badlogic.gdx.math.Vector3 ) v0 ).set ( v1 ); // invoke-virtual {v0, v1}, Lcom/badlogic/gdx/math/Vector3;->set(Lcom/badlogic/gdx/math/Vector3;)Lcom/badlogic/gdx/math/Vector3;
v0 = com.badlogic.gdx.math.Intersector.dir;
v1 = com.badlogic.gdx.math.Intersector.start;
(( com.badlogic.gdx.math.Vector3 ) v1 ).tmp ( ); // invoke-virtual {v1}, Lcom/badlogic/gdx/math/Vector3;->tmp()Lcom/badlogic/gdx/math/Vector3;
(( com.badlogic.gdx.math.Vector3 ) v1 ).sub ( p1 ); // invoke-virtual {v1, p1}, Lcom/badlogic/gdx/math/Vector3;->sub(Lcom/badlogic/gdx/math/Vector3;)Lcom/badlogic/gdx/math/Vector3;
v0 = (( com.badlogic.gdx.math.Vector3 ) v0 ).dot ( v1 ); // invoke-virtual {v0, v1}, Lcom/badlogic/gdx/math/Vector3;->dot(Lcom/badlogic/gdx/math/Vector3;)F
/* mul-float/2addr v0, v5 */
v1 = com.badlogic.gdx.math.Intersector.start;
v1 = (( com.badlogic.gdx.math.Vector3 ) v1 ).dst2 ( p1 ); // invoke-virtual {v1, p1}, Lcom/badlogic/gdx/math/Vector3;->dst2(Lcom/badlogic/gdx/math/Vector3;)F
/* mul-float v2, p2, p2 */
/* sub-float/2addr v1, v2 */
/* mul-float v2, v0, v0 */
/* const/high16 v3, 0x40800000 # 4.0f */
/* mul-float/2addr v3, v1 */
/* sub-float/2addr v2, v3 */
/* cmpg-float v3, v2, v4 */
/* if-gez v3, :cond_0 */
/* move v0, v6 */
} // :goto_0
} // :cond_0
/* float-to-double v2, v2 */
java.lang.Math .sqrt ( v2,v3 );
/* move-result-wide v2 */
/* double-to-float v2, v2 */
/* cmpg-float v3, v0, v4 */
/* if-gez v3, :cond_1 */
/* neg-float v0, v0 */
/* sub-float/2addr v0, v2 */
/* div-float/2addr v0, v5 */
} // :goto_1
/* const/high16 v2, 0x3f800000 # 1.0f */
/* div-float v2, v0, v2 */
/* div-float v0, v1, v0 */
/* cmpl-float v1, v2, v0 */
/* if-lez v1, :cond_6 */
/* move v1, v2 */
} // :goto_2
/* cmpg-float v2, v1, v4 */
/* if-gez v2, :cond_2 */
/* move v0, v6 */
} // :cond_1
/* neg-float v0, v0 */
/* add-float/2addr v0, v2 */
/* div-float/2addr v0, v5 */
} // :cond_2
/* cmpg-float v2, v0, v4 */
/* if-gez v2, :cond_4 */
if ( p3 != null) { // if-eqz p3, :cond_3
v0 = com.badlogic.gdx.math.Intersector.start;
(( com.badlogic.gdx.math.Vector3 ) p3 ).set ( v0 ); // invoke-virtual {p3, v0}, Lcom/badlogic/gdx/math/Vector3;->set(Lcom/badlogic/gdx/math/Vector3;)Lcom/badlogic/gdx/math/Vector3;
v2 = com.badlogic.gdx.math.Intersector.dir;
(( com.badlogic.gdx.math.Vector3 ) v2 ).tmp ( ); // invoke-virtual {v2}, Lcom/badlogic/gdx/math/Vector3;->tmp()Lcom/badlogic/gdx/math/Vector3;
(( com.badlogic.gdx.math.Vector3 ) v2 ).mul ( v1 ); // invoke-virtual {v2, v1}, Lcom/badlogic/gdx/math/Vector3;->mul(F)Lcom/badlogic/gdx/math/Vector3;
(( com.badlogic.gdx.math.Vector3 ) v0 ).add ( v1 ); // invoke-virtual {v0, v1}, Lcom/badlogic/gdx/math/Vector3;->add(Lcom/badlogic/gdx/math/Vector3;)Lcom/badlogic/gdx/math/Vector3;
} // :cond_3
/* move v0, v7 */
} // :cond_4
if ( p3 != null) { // if-eqz p3, :cond_5
v1 = com.badlogic.gdx.math.Intersector.start;
(( com.badlogic.gdx.math.Vector3 ) p3 ).set ( v1 ); // invoke-virtual {p3, v1}, Lcom/badlogic/gdx/math/Vector3;->set(Lcom/badlogic/gdx/math/Vector3;)Lcom/badlogic/gdx/math/Vector3;
v2 = com.badlogic.gdx.math.Intersector.dir;
(( com.badlogic.gdx.math.Vector3 ) v2 ).tmp ( ); // invoke-virtual {v2}, Lcom/badlogic/gdx/math/Vector3;->tmp()Lcom/badlogic/gdx/math/Vector3;
(( com.badlogic.gdx.math.Vector3 ) v2 ).mul ( v0 ); // invoke-virtual {v2, v0}, Lcom/badlogic/gdx/math/Vector3;->mul(F)Lcom/badlogic/gdx/math/Vector3;
(( com.badlogic.gdx.math.Vector3 ) v1 ).add ( v0 ); // invoke-virtual {v1, v0}, Lcom/badlogic/gdx/math/Vector3;->add(Lcom/badlogic/gdx/math/Vector3;)Lcom/badlogic/gdx/math/Vector3;
} // :cond_5
/* move v0, v7 */
} // :cond_6
/* move v1, v0 */
/* move v0, v2 */
} // .end method
public static Boolean intersectRayTriangle ( com.badlogic.gdx.math.collision.Ray p0, com.badlogic.gdx.math.Vector3 p1, com.badlogic.gdx.math.Vector3 p2, com.badlogic.gdx.math.Vector3 p3, com.badlogic.gdx.math.Vector3 p4 ) {
/* .locals 9 */
int v8 = 0; // const/4 v8, 0x0
int v7 = 0; // const/4 v7, 0x0
v0 = com.badlogic.gdx.math.Intersector.p;
(( com.badlogic.gdx.math.Plane ) v0 ).set ( p1, p2, p3 ); // invoke-virtual {v0, p1, p2, p3}, Lcom/badlogic/gdx/math/Plane;->set(Lcom/badlogic/gdx/math/Vector3;Lcom/badlogic/gdx/math/Vector3;Lcom/badlogic/gdx/math/Vector3;)V
v0 = com.badlogic.gdx.math.Intersector.p;
v1 = com.badlogic.gdx.math.Intersector.i;
v0 = com.badlogic.gdx.math.Intersector .intersectRayPlane ( p0,v0,v1 );
/* if-nez v0, :cond_0 */
/* move v0, v8 */
} // :goto_0
} // :cond_0
v0 = com.badlogic.gdx.math.Intersector.v0;
(( com.badlogic.gdx.math.Vector3 ) v0 ).set ( p3 ); // invoke-virtual {v0, p3}, Lcom/badlogic/gdx/math/Vector3;->set(Lcom/badlogic/gdx/math/Vector3;)Lcom/badlogic/gdx/math/Vector3;
(( com.badlogic.gdx.math.Vector3 ) v0 ).sub ( p1 ); // invoke-virtual {v0, p1}, Lcom/badlogic/gdx/math/Vector3;->sub(Lcom/badlogic/gdx/math/Vector3;)Lcom/badlogic/gdx/math/Vector3;
v0 = com.badlogic.gdx.math.Intersector.v1;
(( com.badlogic.gdx.math.Vector3 ) v0 ).set ( p2 ); // invoke-virtual {v0, p2}, Lcom/badlogic/gdx/math/Vector3;->set(Lcom/badlogic/gdx/math/Vector3;)Lcom/badlogic/gdx/math/Vector3;
(( com.badlogic.gdx.math.Vector3 ) v0 ).sub ( p1 ); // invoke-virtual {v0, p1}, Lcom/badlogic/gdx/math/Vector3;->sub(Lcom/badlogic/gdx/math/Vector3;)Lcom/badlogic/gdx/math/Vector3;
v0 = com.badlogic.gdx.math.Intersector.v2;
v1 = com.badlogic.gdx.math.Intersector.i;
(( com.badlogic.gdx.math.Vector3 ) v0 ).set ( v1 ); // invoke-virtual {v0, v1}, Lcom/badlogic/gdx/math/Vector3;->set(Lcom/badlogic/gdx/math/Vector3;)Lcom/badlogic/gdx/math/Vector3;
(( com.badlogic.gdx.math.Vector3 ) v0 ).sub ( p1 ); // invoke-virtual {v0, p1}, Lcom/badlogic/gdx/math/Vector3;->sub(Lcom/badlogic/gdx/math/Vector3;)Lcom/badlogic/gdx/math/Vector3;
v0 = com.badlogic.gdx.math.Intersector.v0;
v1 = com.badlogic.gdx.math.Intersector.v0;
v0 = (( com.badlogic.gdx.math.Vector3 ) v0 ).dot ( v1 ); // invoke-virtual {v0, v1}, Lcom/badlogic/gdx/math/Vector3;->dot(Lcom/badlogic/gdx/math/Vector3;)F
v1 = com.badlogic.gdx.math.Intersector.v0;
v2 = com.badlogic.gdx.math.Intersector.v1;
v1 = (( com.badlogic.gdx.math.Vector3 ) v1 ).dot ( v2 ); // invoke-virtual {v1, v2}, Lcom/badlogic/gdx/math/Vector3;->dot(Lcom/badlogic/gdx/math/Vector3;)F
v2 = com.badlogic.gdx.math.Intersector.v0;
v3 = com.badlogic.gdx.math.Intersector.v2;
v2 = (( com.badlogic.gdx.math.Vector3 ) v2 ).dot ( v3 ); // invoke-virtual {v2, v3}, Lcom/badlogic/gdx/math/Vector3;->dot(Lcom/badlogic/gdx/math/Vector3;)F
v3 = com.badlogic.gdx.math.Intersector.v1;
v4 = com.badlogic.gdx.math.Intersector.v1;
v3 = (( com.badlogic.gdx.math.Vector3 ) v3 ).dot ( v4 ); // invoke-virtual {v3, v4}, Lcom/badlogic/gdx/math/Vector3;->dot(Lcom/badlogic/gdx/math/Vector3;)F
v4 = com.badlogic.gdx.math.Intersector.v1;
v5 = com.badlogic.gdx.math.Intersector.v2;
v4 = (( com.badlogic.gdx.math.Vector3 ) v4 ).dot ( v5 ); // invoke-virtual {v4, v5}, Lcom/badlogic/gdx/math/Vector3;->dot(Lcom/badlogic/gdx/math/Vector3;)F
/* mul-float v5, v0, v3 */
/* mul-float v6, v1, v1 */
/* sub-float/2addr v5, v6 */
/* cmpl-float v6, v5, v7 */
/* if-nez v6, :cond_1 */
/* move v0, v8 */
} // :cond_1
/* mul-float/2addr v3, v2 */
/* mul-float v6, v1, v4 */
/* sub-float/2addr v3, v6 */
/* div-float/2addr v3, v5 */
/* mul-float/2addr v0, v4 */
/* mul-float/2addr v1, v2 */
/* sub-float/2addr v0, v1 */
/* div-float/2addr v0, v5 */
/* cmpl-float v1, v3, v7 */
/* if-ltz v1, :cond_3 */
/* cmpl-float v1, v0, v7 */
/* if-ltz v1, :cond_3 */
/* add-float/2addr v0, v3 */
/* const/high16 v1, 0x3f800000 # 1.0f */
/* cmpg-float v0, v0, v1 */
/* if-gtz v0, :cond_3 */
if ( p4 != null) { // if-eqz p4, :cond_2
v0 = com.badlogic.gdx.math.Intersector.i;
(( com.badlogic.gdx.math.Vector3 ) p4 ).set ( v0 ); // invoke-virtual {p4, v0}, Lcom/badlogic/gdx/math/Vector3;->set(Lcom/badlogic/gdx/math/Vector3;)Lcom/badlogic/gdx/math/Vector3;
} // :cond_2
int v0 = 1; // const/4 v0, 0x1
} // :cond_3
/* move v0, v8 */
} // .end method
public static Boolean intersectRayTriangles ( com.badlogic.gdx.math.collision.Ray p0, java.util.List p1, com.badlogic.gdx.math.Vector3 p2 ) {
/* .locals 8 */
int v7 = 1; // const/4 v7, 0x1
int v6 = 0; // const/4 v6, 0x0
v1 = /* const v0, 0x7f7fffff # Float.MAX_VALUE */
/* rem-int/lit8 v1, v1, 0x3 */
if ( v1 != null) { // if-eqz v1, :cond_0
/* new-instance v0, Ljava/lang/RuntimeException; */
final String v1 = "triangle list size is not a multiple of 3"; // const-string v1, "triangle list size is not a multiple of 3"
/* invoke-direct {v0, v1}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V */
/* throw v0 */
} // :cond_0
/* move v3, v6 */
/* move v4, v0 */
v0 = } // :goto_0
int v1 = 2; // const/4 v1, 0x2
/* sub-int/2addr v0, v1 */
/* if-ge v3, v0, :cond_1 */
/* check-cast v0, Lcom/badlogic/gdx/math/Vector3; */
/* add-int/lit8 v1, v3, 0x1 */
/* check-cast v1, Lcom/badlogic/gdx/math/Vector3; */
/* add-int/lit8 v2, v3, 0x2 */
/* check-cast v2, Lcom/badlogic/gdx/math/Vector3; */
v5 = com.badlogic.gdx.math.Intersector.tmp;
v0 = com.badlogic.gdx.math.Intersector .intersectRayTriangle ( p0,v0,v1,v2,v5 );
/* if-ne v0, v7, :cond_4 */
v0 = this.origin;
(( com.badlogic.gdx.math.Vector3 ) v0 ).tmp ( ); // invoke-virtual {v0}, Lcom/badlogic/gdx/math/Vector3;->tmp()Lcom/badlogic/gdx/math/Vector3;
v1 = com.badlogic.gdx.math.Intersector.tmp;
(( com.badlogic.gdx.math.Vector3 ) v0 ).sub ( v1 ); // invoke-virtual {v0, v1}, Lcom/badlogic/gdx/math/Vector3;->sub(Lcom/badlogic/gdx/math/Vector3;)Lcom/badlogic/gdx/math/Vector3;
v0 = (( com.badlogic.gdx.math.Vector3 ) v0 ).len ( ); // invoke-virtual {v0}, Lcom/badlogic/gdx/math/Vector3;->len()F
/* cmpg-float v1, v0, v4 */
/* if-gez v1, :cond_4 */
v1 = com.badlogic.gdx.math.Intersector.best;
v2 = com.badlogic.gdx.math.Intersector.tmp;
(( com.badlogic.gdx.math.Vector3 ) v1 ).set ( v2 ); // invoke-virtual {v1, v2}, Lcom/badlogic/gdx/math/Vector3;->set(Lcom/badlogic/gdx/math/Vector3;)Lcom/badlogic/gdx/math/Vector3;
} // :goto_1
/* add-int/lit8 v1, v3, 0x3 */
/* move v3, v1 */
/* move v4, v0 */
} // :cond_1
v0 = com.badlogic.gdx.math.Intersector.best;
/* if-nez v0, :cond_2 */
/* move v0, v6 */
} // :goto_2
} // :cond_2
if ( p2 != null) { // if-eqz p2, :cond_3
v0 = com.badlogic.gdx.math.Intersector.best;
(( com.badlogic.gdx.math.Vector3 ) p2 ).set ( v0 ); // invoke-virtual {p2, v0}, Lcom/badlogic/gdx/math/Vector3;->set(Lcom/badlogic/gdx/math/Vector3;)Lcom/badlogic/gdx/math/Vector3;
} // :cond_3
/* move v0, v7 */
} // :cond_4
/* move v0, v4 */
} // .end method
public static Boolean intersectRayTriangles ( com.badlogic.gdx.math.collision.Ray p0, Float[] p1, com.badlogic.gdx.math.Vector3 p2 ) {
/* .locals 11 */
int v10 = 1; // const/4 v10, 0x1
int v9 = 0; // const/4 v9, 0x0
/* const v0, 0x7f7fffff # Float.MAX_VALUE */
/* array-length v1, p1 */
/* div-int/lit8 v1, v1, 0x3 */
/* rem-int/lit8 v1, v1, 0x3 */
if ( v1 != null) { // if-eqz v1, :cond_0
/* new-instance v0, Ljava/lang/RuntimeException; */
final String v1 = "triangle list size is not a multiple of 3"; // const-string v1, "triangle list size is not a multiple of 3"
/* invoke-direct {v0, v1}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V */
/* throw v0 */
} // :cond_0
/* move v1, v9 */
/* move v2, v0 */
/* move v0, v9 */
} // :goto_0
/* array-length v3, p1 */
int v4 = 6; // const/4 v4, 0x6
/* sub-int/2addr v3, v4 */
/* if-ge v0, v3, :cond_2 */
v3 = com.badlogic.gdx.math.Intersector.tmp1;
/* aget v4, p1, v0 */
/* add-int/lit8 v5, v0, 0x1 */
/* aget v5, p1, v5 */
/* add-int/lit8 v6, v0, 0x2 */
/* aget v6, p1, v6 */
(( com.badlogic.gdx.math.Vector3 ) v3 ).set ( v4, v5, v6 ); // invoke-virtual {v3, v4, v5, v6}, Lcom/badlogic/gdx/math/Vector3;->set(FFF)Lcom/badlogic/gdx/math/Vector3;
v4 = com.badlogic.gdx.math.Intersector.tmp2;
/* add-int/lit8 v5, v0, 0x3 */
/* aget v5, p1, v5 */
/* add-int/lit8 v6, v0, 0x4 */
/* aget v6, p1, v6 */
/* add-int/lit8 v7, v0, 0x5 */
/* aget v7, p1, v7 */
(( com.badlogic.gdx.math.Vector3 ) v4 ).set ( v5, v6, v7 ); // invoke-virtual {v4, v5, v6, v7}, Lcom/badlogic/gdx/math/Vector3;->set(FFF)Lcom/badlogic/gdx/math/Vector3;
v5 = com.badlogic.gdx.math.Intersector.tmp3;
/* add-int/lit8 v6, v0, 0x6 */
/* aget v6, p1, v6 */
/* add-int/lit8 v7, v0, 0x7 */
/* aget v7, p1, v7 */
/* add-int/lit8 v8, v0, 0x8 */
/* aget v8, p1, v8 */
(( com.badlogic.gdx.math.Vector3 ) v5 ).set ( v6, v7, v8 ); // invoke-virtual {v5, v6, v7, v8}, Lcom/badlogic/gdx/math/Vector3;->set(FFF)Lcom/badlogic/gdx/math/Vector3;
v6 = com.badlogic.gdx.math.Intersector.tmp;
v3 = com.badlogic.gdx.math.Intersector .intersectRayTriangle ( p0,v3,v4,v5,v6 );
/* if-ne v3, v10, :cond_1 */
v3 = this.origin;
(( com.badlogic.gdx.math.Vector3 ) v3 ).tmp ( ); // invoke-virtual {v3}, Lcom/badlogic/gdx/math/Vector3;->tmp()Lcom/badlogic/gdx/math/Vector3;
v4 = com.badlogic.gdx.math.Intersector.tmp;
(( com.badlogic.gdx.math.Vector3 ) v3 ).sub ( v4 ); // invoke-virtual {v3, v4}, Lcom/badlogic/gdx/math/Vector3;->sub(Lcom/badlogic/gdx/math/Vector3;)Lcom/badlogic/gdx/math/Vector3;
v3 = (( com.badlogic.gdx.math.Vector3 ) v3 ).len ( ); // invoke-virtual {v3}, Lcom/badlogic/gdx/math/Vector3;->len()F
/* cmpg-float v4, v3, v2 */
/* if-gez v4, :cond_1 */
v1 = com.badlogic.gdx.math.Intersector.best;
v2 = com.badlogic.gdx.math.Intersector.tmp;
(( com.badlogic.gdx.math.Vector3 ) v1 ).set ( v2 ); // invoke-virtual {v1, v2}, Lcom/badlogic/gdx/math/Vector3;->set(Lcom/badlogic/gdx/math/Vector3;)Lcom/badlogic/gdx/math/Vector3;
/* move v1, v10 */
/* move v2, v3 */
} // :cond_1
/* add-int/lit8 v0, v0, 0x9 */
} // :cond_2
/* if-nez v1, :cond_3 */
/* move v0, v9 */
} // :goto_1
} // :cond_3
if ( p2 != null) { // if-eqz p2, :cond_4
v0 = com.badlogic.gdx.math.Intersector.best;
(( com.badlogic.gdx.math.Vector3 ) p2 ).set ( v0 ); // invoke-virtual {p2, v0}, Lcom/badlogic/gdx/math/Vector3;->set(Lcom/badlogic/gdx/math/Vector3;)Lcom/badlogic/gdx/math/Vector3;
} // :cond_4
/* move v0, v10 */
} // .end method
public static Boolean intersectRayTriangles ( com.badlogic.gdx.math.collision.Ray p0, Float[] p1, Object[] p2, Integer p3, com.badlogic.gdx.math.Vector3 p4 ) {
/* .locals 11 */
int v10 = 1; // const/4 v10, 0x1
int v9 = 0; // const/4 v9, 0x0
/* const v0, 0x7f7fffff # Float.MAX_VALUE */
/* array-length v1, p2 */
/* rem-int/lit8 v1, v1, 0x3 */
if ( v1 != null) { // if-eqz v1, :cond_0
/* new-instance v0, Ljava/lang/RuntimeException; */
final String v1 = "triangle list size is not a multiple of 3"; // const-string v1, "triangle list size is not a multiple of 3"
/* invoke-direct {v0, v1}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V */
/* throw v0 */
} // :cond_0
/* move v1, v9 */
/* move v2, v0 */
/* move v0, v9 */
} // :goto_0
/* array-length v3, p2 */
/* if-ge v0, v3, :cond_2 */
/* aget-short v3, p2, v0 */
/* mul-int/2addr v3, p3 */
/* add-int/lit8 v4, v0, 0x1 */
/* aget-short v4, p2, v4 */
/* mul-int/2addr v4, p3 */
/* add-int/lit8 v5, v0, 0x2 */
/* aget-short v5, p2, v5 */
/* mul-int/2addr v5, p3 */
v6 = com.badlogic.gdx.math.Intersector.tmp1;
/* aget v7, p1, v3 */
/* add-int/lit8 v8, v3, 0x1 */
/* aget v8, p1, v8 */
/* add-int/lit8 v3, v3, 0x2 */
/* aget v3, p1, v3 */
(( com.badlogic.gdx.math.Vector3 ) v6 ).set ( v7, v8, v3 ); // invoke-virtual {v6, v7, v8, v3}, Lcom/badlogic/gdx/math/Vector3;->set(FFF)Lcom/badlogic/gdx/math/Vector3;
v6 = com.badlogic.gdx.math.Intersector.tmp2;
/* aget v7, p1, v4 */
/* add-int/lit8 v8, v4, 0x1 */
/* aget v8, p1, v8 */
/* add-int/lit8 v4, v4, 0x2 */
/* aget v4, p1, v4 */
(( com.badlogic.gdx.math.Vector3 ) v6 ).set ( v7, v8, v4 ); // invoke-virtual {v6, v7, v8, v4}, Lcom/badlogic/gdx/math/Vector3;->set(FFF)Lcom/badlogic/gdx/math/Vector3;
v6 = com.badlogic.gdx.math.Intersector.tmp3;
/* aget v7, p1, v5 */
/* add-int/lit8 v8, v5, 0x1 */
/* aget v8, p1, v8 */
/* add-int/lit8 v5, v5, 0x2 */
/* aget v5, p1, v5 */
(( com.badlogic.gdx.math.Vector3 ) v6 ).set ( v7, v8, v5 ); // invoke-virtual {v6, v7, v8, v5}, Lcom/badlogic/gdx/math/Vector3;->set(FFF)Lcom/badlogic/gdx/math/Vector3;
v6 = com.badlogic.gdx.math.Intersector.tmp;
v3 = com.badlogic.gdx.math.Intersector .intersectRayTriangle ( p0,v3,v4,v5,v6 );
/* if-ne v3, v10, :cond_1 */
v3 = this.origin;
(( com.badlogic.gdx.math.Vector3 ) v3 ).tmp ( ); // invoke-virtual {v3}, Lcom/badlogic/gdx/math/Vector3;->tmp()Lcom/badlogic/gdx/math/Vector3;
v4 = com.badlogic.gdx.math.Intersector.tmp;
(( com.badlogic.gdx.math.Vector3 ) v3 ).sub ( v4 ); // invoke-virtual {v3, v4}, Lcom/badlogic/gdx/math/Vector3;->sub(Lcom/badlogic/gdx/math/Vector3;)Lcom/badlogic/gdx/math/Vector3;
v3 = (( com.badlogic.gdx.math.Vector3 ) v3 ).len ( ); // invoke-virtual {v3}, Lcom/badlogic/gdx/math/Vector3;->len()F
/* cmpg-float v4, v3, v2 */
/* if-gez v4, :cond_1 */
v1 = com.badlogic.gdx.math.Intersector.best;
v2 = com.badlogic.gdx.math.Intersector.tmp;
(( com.badlogic.gdx.math.Vector3 ) v1 ).set ( v2 ); // invoke-virtual {v1, v2}, Lcom/badlogic/gdx/math/Vector3;->set(Lcom/badlogic/gdx/math/Vector3;)Lcom/badlogic/gdx/math/Vector3;
/* move v1, v10 */
/* move v2, v3 */
} // :cond_1
/* add-int/lit8 v0, v0, 0x3 */
} // :cond_2
/* if-nez v1, :cond_3 */
/* move v0, v9 */
} // :goto_1
} // :cond_3
if ( p4 != null) { // if-eqz p4, :cond_4
v0 = com.badlogic.gdx.math.Intersector.best;
(( com.badlogic.gdx.math.Vector3 ) p4 ).set ( v0 ); // invoke-virtual {p4, v0}, Lcom/badlogic/gdx/math/Vector3;->set(Lcom/badlogic/gdx/math/Vector3;)Lcom/badlogic/gdx/math/Vector3;
} // :cond_4
/* move v0, v10 */
} // .end method
public static Boolean intersectRectangles ( com.badlogic.gdx.math.Rectangle p0, com.badlogic.gdx.math.Rectangle p1 ) {
/* .locals 3 */
v0 = (( com.badlogic.gdx.math.Rectangle ) p0 ).getX ( ); // invoke-virtual {p0}, Lcom/badlogic/gdx/math/Rectangle;->getX()F
v1 = (( com.badlogic.gdx.math.Rectangle ) p1 ).getX ( ); // invoke-virtual {p1}, Lcom/badlogic/gdx/math/Rectangle;->getX()F
v2 = (( com.badlogic.gdx.math.Rectangle ) p1 ).getWidth ( ); // invoke-virtual {p1}, Lcom/badlogic/gdx/math/Rectangle;->getWidth()F
/* add-float/2addr v1, v2 */
/* cmpl-float v0, v0, v1 */
/* if-gtz v0, :cond_0 */
v0 = (( com.badlogic.gdx.math.Rectangle ) p0 ).getX ( ); // invoke-virtual {p0}, Lcom/badlogic/gdx/math/Rectangle;->getX()F
v1 = (( com.badlogic.gdx.math.Rectangle ) p0 ).getWidth ( ); // invoke-virtual {p0}, Lcom/badlogic/gdx/math/Rectangle;->getWidth()F
/* add-float/2addr v0, v1 */
v1 = (( com.badlogic.gdx.math.Rectangle ) p1 ).getX ( ); // invoke-virtual {p1}, Lcom/badlogic/gdx/math/Rectangle;->getX()F
/* cmpg-float v0, v0, v1 */
/* if-ltz v0, :cond_0 */
v0 = (( com.badlogic.gdx.math.Rectangle ) p0 ).getY ( ); // invoke-virtual {p0}, Lcom/badlogic/gdx/math/Rectangle;->getY()F
v1 = (( com.badlogic.gdx.math.Rectangle ) p1 ).getY ( ); // invoke-virtual {p1}, Lcom/badlogic/gdx/math/Rectangle;->getY()F
v2 = (( com.badlogic.gdx.math.Rectangle ) p1 ).getHeight ( ); // invoke-virtual {p1}, Lcom/badlogic/gdx/math/Rectangle;->getHeight()F
/* add-float/2addr v1, v2 */
/* cmpl-float v0, v0, v1 */
/* if-gtz v0, :cond_0 */
v0 = (( com.badlogic.gdx.math.Rectangle ) p0 ).getY ( ); // invoke-virtual {p0}, Lcom/badlogic/gdx/math/Rectangle;->getY()F
v1 = (( com.badlogic.gdx.math.Rectangle ) p0 ).getHeight ( ); // invoke-virtual {p0}, Lcom/badlogic/gdx/math/Rectangle;->getHeight()F
/* add-float/2addr v0, v1 */
v1 = (( com.badlogic.gdx.math.Rectangle ) p1 ).getY ( ); // invoke-virtual {p1}, Lcom/badlogic/gdx/math/Rectangle;->getY()F
/* cmpg-float v0, v0, v1 */
/* if-ltz v0, :cond_0 */
int v0 = 1; // const/4 v0, 0x1
} // :goto_0
} // :cond_0
int v0 = 0; // const/4 v0, 0x0
} // .end method
public static Boolean intersectSegmentCircle ( com.badlogic.gdx.math.Vector2 p0, com.badlogic.gdx.math.Vector2 p1, com.badlogic.gdx.math.Vector2 p2, Float p3 ) {
/* .locals 5 */
int v4 = 0; // const/4 v4, 0x0
v0 = com.badlogic.gdx.math.Intersector.tmp;
/* iget v1, p1, Lcom/badlogic/gdx/math/Vector2;->x:F */
/* iget v2, p0, Lcom/badlogic/gdx/math/Vector2;->x:F */
/* sub-float/2addr v1, v2 */
/* iget v2, p1, Lcom/badlogic/gdx/math/Vector2;->y:F */
/* iget v3, p0, Lcom/badlogic/gdx/math/Vector2;->y:F */
/* sub-float/2addr v2, v3 */
(( com.badlogic.gdx.math.Vector3 ) v0 ).set ( v1, v2, v4 ); // invoke-virtual {v0, v1, v2, v4}, Lcom/badlogic/gdx/math/Vector3;->set(FFF)Lcom/badlogic/gdx/math/Vector3;
v0 = com.badlogic.gdx.math.Intersector.tmp1;
/* iget v1, p2, Lcom/badlogic/gdx/math/Vector2;->x:F */
/* iget v2, p0, Lcom/badlogic/gdx/math/Vector2;->x:F */
/* sub-float/2addr v1, v2 */
/* iget v2, p2, Lcom/badlogic/gdx/math/Vector2;->y:F */
/* iget v3, p0, Lcom/badlogic/gdx/math/Vector2;->y:F */
/* sub-float/2addr v2, v3 */
(( com.badlogic.gdx.math.Vector3 ) v0 ).set ( v1, v2, v4 ); // invoke-virtual {v0, v1, v2, v4}, Lcom/badlogic/gdx/math/Vector3;->set(FFF)Lcom/badlogic/gdx/math/Vector3;
v0 = com.badlogic.gdx.math.Intersector.tmp;
v0 = (( com.badlogic.gdx.math.Vector3 ) v0 ).len ( ); // invoke-virtual {v0}, Lcom/badlogic/gdx/math/Vector3;->len()F
v1 = com.badlogic.gdx.math.Intersector.tmp1;
v2 = com.badlogic.gdx.math.Intersector.tmp;
(( com.badlogic.gdx.math.Vector3 ) v2 ).nor ( ); // invoke-virtual {v2}, Lcom/badlogic/gdx/math/Vector3;->nor()Lcom/badlogic/gdx/math/Vector3;
v1 = (( com.badlogic.gdx.math.Vector3 ) v1 ).dot ( v2 ); // invoke-virtual {v1, v2}, Lcom/badlogic/gdx/math/Vector3;->dot(Lcom/badlogic/gdx/math/Vector3;)F
/* cmpg-float v2, v1, v4 */
/* if-gtz v2, :cond_0 */
v0 = com.badlogic.gdx.math.Intersector.tmp2;
/* iget v1, p0, Lcom/badlogic/gdx/math/Vector2;->x:F */
/* iget v2, p0, Lcom/badlogic/gdx/math/Vector2;->y:F */
(( com.badlogic.gdx.math.Vector3 ) v0 ).set ( v1, v2, v4 ); // invoke-virtual {v0, v1, v2, v4}, Lcom/badlogic/gdx/math/Vector3;->set(FFF)Lcom/badlogic/gdx/math/Vector3;
} // :goto_0
/* iget v0, p2, Lcom/badlogic/gdx/math/Vector2;->x:F */
v1 = com.badlogic.gdx.math.Intersector.tmp2;
/* iget v1, v1, Lcom/badlogic/gdx/math/Vector3;->x:F */
/* sub-float/2addr v0, v1 */
/* iget v1, p2, Lcom/badlogic/gdx/math/Vector2;->y:F */
v2 = com.badlogic.gdx.math.Intersector.tmp2;
/* iget v2, v2, Lcom/badlogic/gdx/math/Vector3;->y:F */
/* sub-float/2addr v1, v2 */
/* mul-float/2addr v0, v0 */
/* mul-float/2addr v1, v1 */
/* add-float/2addr v0, v1 */
/* cmpg-float v0, v0, p3 */
/* if-gtz v0, :cond_2 */
int v0 = 1; // const/4 v0, 0x1
} // :goto_1
} // :cond_0
/* cmpl-float v0, v1, v0 */
/* if-ltz v0, :cond_1 */
v0 = com.badlogic.gdx.math.Intersector.tmp2;
/* iget v1, p1, Lcom/badlogic/gdx/math/Vector2;->x:F */
/* iget v2, p1, Lcom/badlogic/gdx/math/Vector2;->y:F */
(( com.badlogic.gdx.math.Vector3 ) v0 ).set ( v1, v2, v4 ); // invoke-virtual {v0, v1, v2, v4}, Lcom/badlogic/gdx/math/Vector3;->set(FFF)Lcom/badlogic/gdx/math/Vector3;
} // :cond_1
v0 = com.badlogic.gdx.math.Intersector.tmp3;
v2 = com.badlogic.gdx.math.Intersector.tmp;
(( com.badlogic.gdx.math.Vector3 ) v2 ).mul ( v1 ); // invoke-virtual {v2, v1}, Lcom/badlogic/gdx/math/Vector3;->mul(F)Lcom/badlogic/gdx/math/Vector3;
(( com.badlogic.gdx.math.Vector3 ) v0 ).set ( v1 ); // invoke-virtual {v0, v1}, Lcom/badlogic/gdx/math/Vector3;->set(Lcom/badlogic/gdx/math/Vector3;)Lcom/badlogic/gdx/math/Vector3;
v0 = com.badlogic.gdx.math.Intersector.tmp2;
v1 = com.badlogic.gdx.math.Intersector.tmp3;
/* iget v1, v1, Lcom/badlogic/gdx/math/Vector3;->x:F */
/* iget v2, p0, Lcom/badlogic/gdx/math/Vector2;->x:F */
/* add-float/2addr v1, v2 */
v2 = com.badlogic.gdx.math.Intersector.tmp3;
/* iget v2, v2, Lcom/badlogic/gdx/math/Vector3;->y:F */
/* iget v3, p0, Lcom/badlogic/gdx/math/Vector2;->y:F */
/* add-float/2addr v2, v3 */
(( com.badlogic.gdx.math.Vector3 ) v0 ).set ( v1, v2, v4 ); // invoke-virtual {v0, v1, v2, v4}, Lcom/badlogic/gdx/math/Vector3;->set(FFF)Lcom/badlogic/gdx/math/Vector3;
} // :cond_2
int v0 = 0; // const/4 v0, 0x0
} // .end method
public static Float intersectSegmentCircleDisplace ( com.badlogic.gdx.math.Vector2 p0, com.badlogic.gdx.math.Vector2 p1, com.badlogic.gdx.math.Vector2 p2, Float p3, com.badlogic.gdx.math.Vector2 p4 ) {
/* .locals 6 */
/* const/high16 v5, 0x7f800000 # Float.POSITIVE_INFINITY */
int v4 = 0; // const/4 v4, 0x0
/* iget v0, p2, Lcom/badlogic/gdx/math/Vector2;->x:F */
/* iget v1, p0, Lcom/badlogic/gdx/math/Vector2;->x:F */
/* sub-float/2addr v0, v1 */
/* iget v1, p1, Lcom/badlogic/gdx/math/Vector2;->x:F */
/* iget v2, p0, Lcom/badlogic/gdx/math/Vector2;->x:F */
/* sub-float/2addr v1, v2 */
/* mul-float/2addr v0, v1 */
/* iget v1, p2, Lcom/badlogic/gdx/math/Vector2;->y:F */
/* iget v2, p0, Lcom/badlogic/gdx/math/Vector2;->y:F */
/* sub-float/2addr v1, v2 */
/* iget v2, p1, Lcom/badlogic/gdx/math/Vector2;->y:F */
/* iget v3, p0, Lcom/badlogic/gdx/math/Vector2;->y:F */
/* sub-float/2addr v2, v3 */
/* mul-float/2addr v1, v2 */
/* add-float/2addr v0, v1 */
v1 = (( com.badlogic.gdx.math.Vector2 ) p0 ).dst ( p1 ); // invoke-virtual {p0, p1}, Lcom/badlogic/gdx/math/Vector2;->dst(Lcom/badlogic/gdx/math/Vector2;)F
/* mul-float/2addr v1, v1 */
/* div-float/2addr v0, v1 */
/* cmpg-float v1, v0, v4 */
/* if-ltz v1, :cond_0 */
/* const/high16 v1, 0x3f800000 # 1.0f */
/* cmpl-float v1, v0, v1 */
/* if-lez v1, :cond_1 */
} // :cond_0
/* move v0, v5 */
} // :goto_0
} // :cond_1
v1 = com.badlogic.gdx.math.Intersector.tmp;
/* iget v2, p1, Lcom/badlogic/gdx/math/Vector2;->x:F */
/* iget v3, p1, Lcom/badlogic/gdx/math/Vector2;->y:F */
(( com.badlogic.gdx.math.Vector3 ) v1 ).set ( v2, v3, v4 ); // invoke-virtual {v1, v2, v3, v4}, Lcom/badlogic/gdx/math/Vector3;->set(FFF)Lcom/badlogic/gdx/math/Vector3;
/* iget v2, p0, Lcom/badlogic/gdx/math/Vector2;->x:F */
/* iget v3, p0, Lcom/badlogic/gdx/math/Vector2;->y:F */
(( com.badlogic.gdx.math.Vector3 ) v1 ).sub ( v2, v3, v4 ); // invoke-virtual {v1, v2, v3, v4}, Lcom/badlogic/gdx/math/Vector3;->sub(FFF)Lcom/badlogic/gdx/math/Vector3;
v1 = com.badlogic.gdx.math.Intersector.tmp2;
/* iget v2, p0, Lcom/badlogic/gdx/math/Vector2;->x:F */
/* iget v3, p0, Lcom/badlogic/gdx/math/Vector2;->y:F */
(( com.badlogic.gdx.math.Vector3 ) v1 ).set ( v2, v3, v4 ); // invoke-virtual {v1, v2, v3, v4}, Lcom/badlogic/gdx/math/Vector3;->set(FFF)Lcom/badlogic/gdx/math/Vector3;
v2 = com.badlogic.gdx.math.Intersector.tmp;
(( com.badlogic.gdx.math.Vector3 ) v2 ).mul ( v0 ); // invoke-virtual {v2, v0}, Lcom/badlogic/gdx/math/Vector3;->mul(F)Lcom/badlogic/gdx/math/Vector3;
(( com.badlogic.gdx.math.Vector3 ) v1 ).add ( v0 ); // invoke-virtual {v1, v0}, Lcom/badlogic/gdx/math/Vector3;->add(Lcom/badlogic/gdx/math/Vector3;)Lcom/badlogic/gdx/math/Vector3;
v0 = com.badlogic.gdx.math.Intersector.tmp2;
/* iget v1, p2, Lcom/badlogic/gdx/math/Vector2;->x:F */
/* iget v2, p2, Lcom/badlogic/gdx/math/Vector2;->y:F */
v0 = (( com.badlogic.gdx.math.Vector3 ) v0 ).dst ( v1, v2, v4 ); // invoke-virtual {v0, v1, v2, v4}, Lcom/badlogic/gdx/math/Vector3;->dst(FFF)F
/* cmpg-float v1, v0, p3 */
/* if-gez v1, :cond_2 */
(( com.badlogic.gdx.math.Vector2 ) p4 ).set ( p2 ); // invoke-virtual {p4, p2}, Lcom/badlogic/gdx/math/Vector2;->set(Lcom/badlogic/gdx/math/Vector2;)Lcom/badlogic/gdx/math/Vector2;
v2 = com.badlogic.gdx.math.Intersector.tmp2;
/* iget v2, v2, Lcom/badlogic/gdx/math/Vector3;->x:F */
v3 = com.badlogic.gdx.math.Intersector.tmp2;
/* iget v3, v3, Lcom/badlogic/gdx/math/Vector3;->y:F */
(( com.badlogic.gdx.math.Vector2 ) v1 ).sub ( v2, v3 ); // invoke-virtual {v1, v2, v3}, Lcom/badlogic/gdx/math/Vector2;->sub(FF)Lcom/badlogic/gdx/math/Vector2;
(( com.badlogic.gdx.math.Vector2 ) v1 ).nor ( ); // invoke-virtual {v1}, Lcom/badlogic/gdx/math/Vector2;->nor()Lcom/badlogic/gdx/math/Vector2;
} // :cond_2
/* move v0, v5 */
} // .end method
public static Boolean intersectSegmentPlane ( com.badlogic.gdx.math.Vector3 p0, com.badlogic.gdx.math.Vector3 p1, com.badlogic.gdx.math.Plane p2, com.badlogic.gdx.math.Vector3 p3 ) {
/* .locals 4 */
(( com.badlogic.gdx.math.Vector3 ) p1 ).tmp ( ); // invoke-virtual {p1}, Lcom/badlogic/gdx/math/Vector3;->tmp()Lcom/badlogic/gdx/math/Vector3;
(( com.badlogic.gdx.math.Vector3 ) v0 ).sub ( p0 ); // invoke-virtual {v0, p0}, Lcom/badlogic/gdx/math/Vector3;->sub(Lcom/badlogic/gdx/math/Vector3;)Lcom/badlogic/gdx/math/Vector3;
(( com.badlogic.gdx.math.Plane ) p2 ).getNormal ( ); // invoke-virtual {p2}, Lcom/badlogic/gdx/math/Plane;->getNormal()Lcom/badlogic/gdx/math/Vector3;
v1 = (( com.badlogic.gdx.math.Vector3 ) v0 ).dot ( v1 ); // invoke-virtual {v0, v1}, Lcom/badlogic/gdx/math/Vector3;->dot(Lcom/badlogic/gdx/math/Vector3;)F
(( com.badlogic.gdx.math.Plane ) p2 ).getNormal ( ); // invoke-virtual {p2}, Lcom/badlogic/gdx/math/Plane;->getNormal()Lcom/badlogic/gdx/math/Vector3;
v2 = (( com.badlogic.gdx.math.Vector3 ) p0 ).dot ( v2 ); // invoke-virtual {p0, v2}, Lcom/badlogic/gdx/math/Vector3;->dot(Lcom/badlogic/gdx/math/Vector3;)F
v3 = (( com.badlogic.gdx.math.Plane ) p2 ).getD ( ); // invoke-virtual {p2}, Lcom/badlogic/gdx/math/Plane;->getD()F
/* add-float/2addr v2, v3 */
/* neg-float v2, v2 */
/* div-float v1, v2, v1 */
int v2 = 0; // const/4 v2, 0x0
/* cmpg-float v2, v1, v2 */
/* if-ltz v2, :cond_0 */
/* const/high16 v2, 0x3f800000 # 1.0f */
/* cmpl-float v2, v1, v2 */
/* if-lez v2, :cond_1 */
} // :cond_0
int v0 = 0; // const/4 v0, 0x0
} // :goto_0
} // :cond_1
(( com.badlogic.gdx.math.Vector3 ) p3 ).set ( p0 ); // invoke-virtual {p3, p0}, Lcom/badlogic/gdx/math/Vector3;->set(Lcom/badlogic/gdx/math/Vector3;)Lcom/badlogic/gdx/math/Vector3;
(( com.badlogic.gdx.math.Vector3 ) v0 ).mul ( v1 ); // invoke-virtual {v0, v1}, Lcom/badlogic/gdx/math/Vector3;->mul(F)Lcom/badlogic/gdx/math/Vector3;
(( com.badlogic.gdx.math.Vector3 ) v2 ).add ( v0 ); // invoke-virtual {v2, v0}, Lcom/badlogic/gdx/math/Vector3;->add(Lcom/badlogic/gdx/math/Vector3;)Lcom/badlogic/gdx/math/Vector3;
int v0 = 1; // const/4 v0, 0x1
} // .end method
public static Boolean intersectSegments ( com.badlogic.gdx.math.Vector2 p0, com.badlogic.gdx.math.Vector2 p1, com.badlogic.gdx.math.Vector2 p2, com.badlogic.gdx.math.Vector2 p3, com.badlogic.gdx.math.Vector2 p4 ) {
/* .locals 7 */
/* iget v0, p0, Lcom/badlogic/gdx/math/Vector2;->x:F */
/* iget p0, p0, Lcom/badlogic/gdx/math/Vector2;->y:F */
/* iget v1, p1, Lcom/badlogic/gdx/math/Vector2;->x:F */
/* iget p1, p1, Lcom/badlogic/gdx/math/Vector2;->y:F */
/* iget v2, p2, Lcom/badlogic/gdx/math/Vector2;->x:F */
/* iget p2, p2, Lcom/badlogic/gdx/math/Vector2;->y:F */
/* iget v3, p3, Lcom/badlogic/gdx/math/Vector2;->x:F */
/* iget p3, p3, Lcom/badlogic/gdx/math/Vector2;->y:F */
/* sub-float v4, p3, p2 */
/* sub-float v5, v1, v0 */
/* mul-float/2addr v4, v5 */
/* sub-float v5, v3, v2 */
/* sub-float v6, p1, p0 */
/* mul-float/2addr v5, v6 */
/* sub-float/2addr v4, v5 */
int v5 = 0; // const/4 v5, 0x0
/* cmpl-float v5, v4, v5 */
/* if-nez v5, :cond_0 */
int p0 = 0; // const/4 p0, 0x0
} // :goto_0
} // :cond_0
/* sub-float/2addr v3, v2 */
/* sub-float v5, p0, p2 */
/* mul-float/2addr v3, v5 */
/* sub-float/2addr p3, p2 */
/* sub-float v5, v0, v2 */
/* mul-float/2addr p3, v5 */
/* sub-float p3, v3, p3 */
/* div-float/2addr p3, v4 */
/* sub-float v3, v1, v0 */
/* sub-float p2, p0, p2 */
/* mul-float/2addr p2, v3 */
/* sub-float v3, p1, p0 */
/* sub-float v2, v0, v2 */
/* mul-float/2addr v2, v3 */
/* sub-float/2addr p2, v2 */
/* div-float/2addr p2, v4 */
int v2 = 0; // const/4 v2, 0x0
/* cmpg-float v2, p3, v2 */
/* if-ltz v2, :cond_1 */
/* const/high16 v2, 0x3f800000 # 1.0f */
/* cmpl-float v2, p3, v2 */
/* if-lez v2, :cond_2 */
} // :cond_1
int p0 = 0; // const/4 p0, 0x0
} // :cond_2
int v2 = 0; // const/4 v2, 0x0
/* cmpg-float v2, p2, v2 */
/* if-ltz v2, :cond_3 */
/* const/high16 v2, 0x3f800000 # 1.0f */
/* cmpl-float p2, p2, v2 */
/* if-lez p2, :cond_4 */
} // :cond_3
int p0 = 0; // const/4 p0, 0x0
} // :cond_4
if ( p4 != null) { // if-eqz p4, :cond_5
/* sub-float p2, v1, v0 */
/* mul-float/2addr p2, p3 */
/* add-float/2addr p2, v0 */
/* sub-float/2addr p1, p0 */
/* mul-float/2addr p1, p3 */
/* add-float/2addr p0, p1 */
(( com.badlogic.gdx.math.Vector2 ) p4 ).set ( p2, p0 ); // invoke-virtual {p4, p2, p0}, Lcom/badlogic/gdx/math/Vector2;->set(FF)Lcom/badlogic/gdx/math/Vector2;
} // :cond_5
int p0 = 1; // const/4 p0, 0x1
} // .end method
public static Boolean isPointInPolygon ( java.util.List p0, com.badlogic.gdx.math.Vector2 p1 ) {
/* .locals 9 */
int v8 = 1; // const/4 v8, 0x1
v0 = int v7 = 0; // const/4 v7, 0x0
/* sub-int/2addr v0, v8 */
/* move v1, v7 */
/* move v2, v7 */
/* move v3, v0 */
v0 = } // :goto_0
/* if-ge v1, v0, :cond_3 */
/* check-cast v0, Lcom/badlogic/gdx/math/Vector2; */
/* iget v0, v0, Lcom/badlogic/gdx/math/Vector2;->y:F */
/* iget v4, p1, Lcom/badlogic/gdx/math/Vector2;->y:F */
/* cmpg-float v0, v0, v4 */
/* if-gez v0, :cond_0 */
/* check-cast v0, Lcom/badlogic/gdx/math/Vector2; */
/* iget v0, v0, Lcom/badlogic/gdx/math/Vector2;->y:F */
/* iget v4, p1, Lcom/badlogic/gdx/math/Vector2;->y:F */
/* cmpl-float v0, v0, v4 */
/* if-gez v0, :cond_1 */
} // :cond_0
/* check-cast v0, Lcom/badlogic/gdx/math/Vector2; */
/* iget v0, v0, Lcom/badlogic/gdx/math/Vector2;->y:F */
/* iget v4, p1, Lcom/badlogic/gdx/math/Vector2;->y:F */
/* cmpg-float v0, v0, v4 */
/* if-gez v0, :cond_4 */
/* check-cast v0, Lcom/badlogic/gdx/math/Vector2; */
/* iget v0, v0, Lcom/badlogic/gdx/math/Vector2;->y:F */
/* iget v4, p1, Lcom/badlogic/gdx/math/Vector2;->y:F */
/* cmpl-float v0, v0, v4 */
/* if-ltz v0, :cond_4 */
} // :cond_1
/* check-cast v0, Lcom/badlogic/gdx/math/Vector2; */
/* iget v4, v0, Lcom/badlogic/gdx/math/Vector2;->x:F */
/* iget v5, p1, Lcom/badlogic/gdx/math/Vector2;->y:F */
/* check-cast v0, Lcom/badlogic/gdx/math/Vector2; */
/* iget v0, v0, Lcom/badlogic/gdx/math/Vector2;->y:F */
/* sub-float/2addr v5, v0 */
/* check-cast v0, Lcom/badlogic/gdx/math/Vector2; */
/* iget v6, v0, Lcom/badlogic/gdx/math/Vector2;->y:F */
/* check-cast v0, Lcom/badlogic/gdx/math/Vector2; */
/* iget v0, v0, Lcom/badlogic/gdx/math/Vector2;->y:F */
/* sub-float v0, v6, v0 */
/* div-float/2addr v5, v0 */
/* check-cast v0, Lcom/badlogic/gdx/math/Vector2; */
/* iget v3, v0, Lcom/badlogic/gdx/math/Vector2;->x:F */
/* check-cast v0, Lcom/badlogic/gdx/math/Vector2; */
/* iget v0, v0, Lcom/badlogic/gdx/math/Vector2;->x:F */
/* sub-float v0, v3, v0 */
/* mul-float/2addr v0, v5 */
/* add-float/2addr v0, v4 */
/* iget v3, p1, Lcom/badlogic/gdx/math/Vector2;->x:F */
/* cmpg-float v0, v0, v3 */
/* if-gez v0, :cond_4 */
/* if-nez v2, :cond_2 */
/* move v0, v8 */
} // :goto_1
/* add-int/lit8 v2, v1, 0x1 */
/* move v3, v1 */
/* move v1, v2 */
/* move v2, v0 */
/* goto/16 :goto_0 */
} // :cond_2
/* move v0, v7 */
} // :cond_3
} // :cond_4
/* move v0, v2 */
} // .end method
public static Boolean isPointInTriangle ( com.badlogic.gdx.math.Vector3 p0, com.badlogic.gdx.math.Vector3 p1, com.badlogic.gdx.math.Vector3 p2, com.badlogic.gdx.math.Vector3 p3 ) {
/* .locals 7 */
int v6 = 0; // const/4 v6, 0x0
int v5 = 0; // const/4 v5, 0x0
v0 = com.badlogic.gdx.math.Intersector.v0;
(( com.badlogic.gdx.math.Vector3 ) v0 ).set ( p1 ); // invoke-virtual {v0, p1}, Lcom/badlogic/gdx/math/Vector3;->set(Lcom/badlogic/gdx/math/Vector3;)Lcom/badlogic/gdx/math/Vector3;
(( com.badlogic.gdx.math.Vector3 ) v0 ).sub ( p0 ); // invoke-virtual {v0, p0}, Lcom/badlogic/gdx/math/Vector3;->sub(Lcom/badlogic/gdx/math/Vector3;)Lcom/badlogic/gdx/math/Vector3;
v0 = com.badlogic.gdx.math.Intersector.v1;
(( com.badlogic.gdx.math.Vector3 ) v0 ).set ( p2 ); // invoke-virtual {v0, p2}, Lcom/badlogic/gdx/math/Vector3;->set(Lcom/badlogic/gdx/math/Vector3;)Lcom/badlogic/gdx/math/Vector3;
(( com.badlogic.gdx.math.Vector3 ) v0 ).sub ( p0 ); // invoke-virtual {v0, p0}, Lcom/badlogic/gdx/math/Vector3;->sub(Lcom/badlogic/gdx/math/Vector3;)Lcom/badlogic/gdx/math/Vector3;
v0 = com.badlogic.gdx.math.Intersector.v2;
(( com.badlogic.gdx.math.Vector3 ) v0 ).set ( p3 ); // invoke-virtual {v0, p3}, Lcom/badlogic/gdx/math/Vector3;->set(Lcom/badlogic/gdx/math/Vector3;)Lcom/badlogic/gdx/math/Vector3;
(( com.badlogic.gdx.math.Vector3 ) v0 ).sub ( p0 ); // invoke-virtual {v0, p0}, Lcom/badlogic/gdx/math/Vector3;->sub(Lcom/badlogic/gdx/math/Vector3;)Lcom/badlogic/gdx/math/Vector3;
v0 = com.badlogic.gdx.math.Intersector.v0;
v1 = com.badlogic.gdx.math.Intersector.v1;
v0 = (( com.badlogic.gdx.math.Vector3 ) v0 ).dot ( v1 ); // invoke-virtual {v0, v1}, Lcom/badlogic/gdx/math/Vector3;->dot(Lcom/badlogic/gdx/math/Vector3;)F
v1 = com.badlogic.gdx.math.Intersector.v0;
v2 = com.badlogic.gdx.math.Intersector.v2;
v1 = (( com.badlogic.gdx.math.Vector3 ) v1 ).dot ( v2 ); // invoke-virtual {v1, v2}, Lcom/badlogic/gdx/math/Vector3;->dot(Lcom/badlogic/gdx/math/Vector3;)F
v2 = com.badlogic.gdx.math.Intersector.v1;
v3 = com.badlogic.gdx.math.Intersector.v2;
v2 = (( com.badlogic.gdx.math.Vector3 ) v2 ).dot ( v3 ); // invoke-virtual {v2, v3}, Lcom/badlogic/gdx/math/Vector3;->dot(Lcom/badlogic/gdx/math/Vector3;)F
v3 = com.badlogic.gdx.math.Intersector.v2;
v4 = com.badlogic.gdx.math.Intersector.v2;
v3 = (( com.badlogic.gdx.math.Vector3 ) v3 ).dot ( v4 ); // invoke-virtual {v3, v4}, Lcom/badlogic/gdx/math/Vector3;->dot(Lcom/badlogic/gdx/math/Vector3;)F
/* mul-float v4, v2, v1 */
/* mul-float/2addr v3, v0 */
/* sub-float v3, v4, v3 */
/* cmpg-float v3, v3, v5 */
/* if-gez v3, :cond_0 */
/* move v0, v6 */
} // :goto_0
} // :cond_0
v3 = com.badlogic.gdx.math.Intersector.v1;
v4 = com.badlogic.gdx.math.Intersector.v1;
v3 = (( com.badlogic.gdx.math.Vector3 ) v3 ).dot ( v4 ); // invoke-virtual {v3, v4}, Lcom/badlogic/gdx/math/Vector3;->dot(Lcom/badlogic/gdx/math/Vector3;)F
/* mul-float/2addr v0, v2 */
/* mul-float/2addr v1, v3 */
/* sub-float/2addr v0, v1 */
/* cmpg-float v0, v0, v5 */
/* if-gez v0, :cond_1 */
/* move v0, v6 */
} // :cond_1
int v0 = 1; // const/4 v0, 0x1
} // .end method
public static Boolean overlapCircleRectangle ( com.badlogic.gdx.math.Circle p0, com.badlogic.gdx.math.Rectangle p1 ) {
/* .locals 5 */
/* iget v0, p0, Lcom/badlogic/gdx/math/Circle;->x:F */
/* iget v1, p0, Lcom/badlogic/gdx/math/Circle;->y:F */
/* iget v2, p0, Lcom/badlogic/gdx/math/Circle;->x:F */
/* iget v3, p1, Lcom/badlogic/gdx/math/Rectangle;->x:F */
/* cmpg-float v2, v2, v3 */
/* if-gez v2, :cond_2 */
/* iget v0, p1, Lcom/badlogic/gdx/math/Rectangle;->x:F */
} // :cond_0
} // :goto_0
/* iget v2, p0, Lcom/badlogic/gdx/math/Circle;->y:F */
/* iget v3, p1, Lcom/badlogic/gdx/math/Rectangle;->y:F */
/* cmpg-float v2, v2, v3 */
/* if-gez v2, :cond_3 */
/* iget v1, p1, Lcom/badlogic/gdx/math/Rectangle;->y:F */
} // :cond_1
} // :goto_1
/* iget v2, p0, Lcom/badlogic/gdx/math/Circle;->x:F */
/* sub-float/2addr v0, v2 */
/* mul-float/2addr v0, v0 */
/* iget v2, p0, Lcom/badlogic/gdx/math/Circle;->y:F */
/* sub-float/2addr v1, v2 */
/* mul-float/2addr v1, v1 */
/* add-float/2addr v0, v1 */
/* iget v1, p0, Lcom/badlogic/gdx/math/Circle;->radius:F */
/* iget v2, p0, Lcom/badlogic/gdx/math/Circle;->radius:F */
/* mul-float/2addr v1, v2 */
/* cmpg-float v0, v0, v1 */
/* if-gez v0, :cond_4 */
int v0 = 1; // const/4 v0, 0x1
} // :goto_2
} // :cond_2
/* iget v2, p0, Lcom/badlogic/gdx/math/Circle;->x:F */
/* iget v3, p1, Lcom/badlogic/gdx/math/Rectangle;->x:F */
/* iget v4, p1, Lcom/badlogic/gdx/math/Rectangle;->width:F */
/* add-float/2addr v3, v4 */
/* cmpl-float v2, v2, v3 */
/* if-lez v2, :cond_0 */
/* iget v0, p1, Lcom/badlogic/gdx/math/Rectangle;->x:F */
/* iget v2, p1, Lcom/badlogic/gdx/math/Rectangle;->width:F */
/* add-float/2addr v0, v2 */
} // :cond_3
/* iget v2, p0, Lcom/badlogic/gdx/math/Circle;->y:F */
/* iget v3, p1, Lcom/badlogic/gdx/math/Rectangle;->y:F */
/* iget v4, p1, Lcom/badlogic/gdx/math/Rectangle;->height:F */
/* add-float/2addr v3, v4 */
/* cmpl-float v2, v2, v3 */
/* if-lez v2, :cond_1 */
/* iget v1, p1, Lcom/badlogic/gdx/math/Rectangle;->y:F */
/* iget v2, p1, Lcom/badlogic/gdx/math/Rectangle;->height:F */
/* add-float/2addr v1, v2 */
} // :cond_4
int v0 = 0; // const/4 v0, 0x0
} // .end method
public static Boolean overlapCircles ( com.badlogic.gdx.math.Circle p0, com.badlogic.gdx.math.Circle p1 ) {
/* .locals 3 */
/* iget v0, p0, Lcom/badlogic/gdx/math/Circle;->x:F */
/* iget v1, p1, Lcom/badlogic/gdx/math/Circle;->x:F */
/* sub-float/2addr v0, v1 */
/* iget v1, p0, Lcom/badlogic/gdx/math/Circle;->y:F */
/* iget v2, p1, Lcom/badlogic/gdx/math/Circle;->y:F */
/* sub-float/2addr v1, v2 */
/* mul-float/2addr v0, v0 */
/* mul-float/2addr v1, v1 */
/* add-float/2addr v0, v1 */
/* iget v1, p0, Lcom/badlogic/gdx/math/Circle;->radius:F */
/* iget v2, p1, Lcom/badlogic/gdx/math/Circle;->radius:F */
/* add-float/2addr v1, v2 */
/* mul-float/2addr v1, v1 */
/* cmpg-float v0, v0, v1 */
/* if-gtz v0, :cond_0 */
int v0 = 1; // const/4 v0, 0x1
} // :goto_0
} // :cond_0
int v0 = 0; // const/4 v0, 0x0
} // .end method
public static Boolean overlapRectangles ( com.badlogic.gdx.math.Rectangle p0, com.badlogic.gdx.math.Rectangle p1 ) {
/* .locals 3 */
/* iget v0, p0, Lcom/badlogic/gdx/math/Rectangle;->x:F */
/* iget v1, p1, Lcom/badlogic/gdx/math/Rectangle;->x:F */
/* iget v2, p1, Lcom/badlogic/gdx/math/Rectangle;->width:F */
/* add-float/2addr v1, v2 */
/* cmpg-float v0, v0, v1 */
/* if-gez v0, :cond_0 */
/* iget v0, p0, Lcom/badlogic/gdx/math/Rectangle;->x:F */
/* iget v1, p0, Lcom/badlogic/gdx/math/Rectangle;->width:F */
/* add-float/2addr v0, v1 */
/* iget v1, p1, Lcom/badlogic/gdx/math/Rectangle;->x:F */
/* cmpl-float v0, v0, v1 */
/* if-lez v0, :cond_0 */
/* iget v0, p0, Lcom/badlogic/gdx/math/Rectangle;->y:F */
/* iget v1, p1, Lcom/badlogic/gdx/math/Rectangle;->y:F */
/* iget v2, p1, Lcom/badlogic/gdx/math/Rectangle;->height:F */
/* add-float/2addr v1, v2 */
/* cmpg-float v0, v0, v1 */
/* if-gez v0, :cond_0 */
/* iget v0, p0, Lcom/badlogic/gdx/math/Rectangle;->y:F */
/* iget v1, p0, Lcom/badlogic/gdx/math/Rectangle;->height:F */
/* add-float/2addr v0, v1 */
/* iget v1, p1, Lcom/badlogic/gdx/math/Rectangle;->y:F */
/* cmpl-float v0, v0, v1 */
/* if-lez v0, :cond_0 */
int v0 = 1; // const/4 v0, 0x1
} // :goto_0
} // :cond_0
int v0 = 0; // const/4 v0, 0x0
} // .end method
