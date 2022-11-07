public class org.anddev.andengine.collision.LineCollisionChecker extends org.anddev.andengine.collision.ShapeCollisionChecker {
	 /* # direct methods */
	 public org.anddev.andengine.collision.LineCollisionChecker ( ) {
		 /* .locals 0 */
		 /* invoke-direct {p0}, Lorg/anddev/andengine/collision/ShapeCollisionChecker;-><init>()V */
		 return;
	 } // .end method
	 public static Boolean checkLineCollision ( Float p0, Float p1, Float p2, Float p3, Float p4, Float p5, Float p6, Float p7 ) {
		 /* .locals 7 */
		 v6 = 		 /* invoke-static/range {p0 ..p5}, Lorg/anddev/andengine/collision/BaseCollisionChecker;->relativeCCW(FFFFFF)I */
		 /* move v0, p0 */
		 /* move v1, p1 */
		 /* move v2, p2 */
		 /* move v3, p3 */
		 /* move v4, p6 */
		 /* move v5, p7 */
		 v0 = 		 /* invoke-static/range {v0 ..v5}, Lorg/anddev/andengine/collision/BaseCollisionChecker;->relativeCCW(FFFFFF)I */
		 /* mul-int/2addr v0, v6 */
		 /* if-gtz v0, :cond_0 */
		 /* move v0, p4 */
		 /* move v1, p5 */
		 /* move v2, p6 */
		 /* move v3, p7 */
		 /* move v4, p0 */
		 /* move v5, p1 */
		 v6 = 		 /* invoke-static/range {v0 ..v5}, Lorg/anddev/andengine/collision/BaseCollisionChecker;->relativeCCW(FFFFFF)I */
		 /* move v0, p4 */
		 /* move v1, p5 */
		 /* move v2, p6 */
		 /* move v3, p7 */
		 /* move v4, p2 */
		 /* move v5, p3 */
		 v0 = 		 /* invoke-static/range {v0 ..v5}, Lorg/anddev/andengine/collision/BaseCollisionChecker;->relativeCCW(FFFFFF)I */
		 /* mul-int/2addr v0, v6 */
		 /* if-gtz v0, :cond_0 */
		 int v0 = 1; // const/4 v0, 0x1
	 } // :goto_0
} // :cond_0
int v0 = 0; // const/4 v0, 0x0
} // .end method
public static void fillVertices ( org.anddev.andengine.entity.primitive.Line p0, Float[] p1 ) {
/* .locals 3 */
int v1 = 0; // const/4 v1, 0x0
int v0 = 0; // const/4 v0, 0x0
/* aput v1, p1, v0 */
int v0 = 1; // const/4 v0, 0x1
/* aput v1, p1, v0 */
int v0 = 2; // const/4 v0, 0x2
v1 = (( org.anddev.andengine.entity.primitive.Line ) p0 ).getX2 ( ); // invoke-virtual {p0}, Lorg/anddev/andengine/entity/primitive/Line;->getX2()F
v2 = (( org.anddev.andengine.entity.primitive.Line ) p0 ).getX1 ( ); // invoke-virtual {p0}, Lorg/anddev/andengine/entity/primitive/Line;->getX1()F
/* sub-float/2addr v1, v2 */
/* aput v1, p1, v0 */
int v0 = 3; // const/4 v0, 0x3
v1 = (( org.anddev.andengine.entity.primitive.Line ) p0 ).getY2 ( ); // invoke-virtual {p0}, Lorg/anddev/andengine/entity/primitive/Line;->getY2()F
v2 = (( org.anddev.andengine.entity.primitive.Line ) p0 ).getY1 ( ); // invoke-virtual {p0}, Lorg/anddev/andengine/entity/primitive/Line;->getY1()F
/* sub-float/2addr v1, v2 */
/* aput v1, p1, v0 */
(( org.anddev.andengine.entity.primitive.Line ) p0 ).getLocalToSceneTransformation ( ); // invoke-virtual {p0}, Lorg/anddev/andengine/entity/primitive/Line;->getLocalToSceneTransformation()Lorg/anddev/andengine/util/Transformation;
(( org.anddev.andengine.util.Transformation ) v0 ).transform ( p1 ); // invoke-virtual {v0, p1}, Lorg/anddev/andengine/util/Transformation;->transform([F)V
return;
} // .end method
