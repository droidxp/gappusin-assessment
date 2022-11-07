public class org.anddev.andengine.collision.ShapeCollisionChecker extends org.anddev.andengine.collision.BaseCollisionChecker {
	 /* # direct methods */
	 public org.anddev.andengine.collision.ShapeCollisionChecker ( ) {
		 /* .locals 0 */
		 /* invoke-direct {p0}, Lorg/anddev/andengine/collision/BaseCollisionChecker;-><init>()V */
		 return;
	 } // .end method
	 public static Boolean checkCollision ( Integer p0, Float[] p1, Integer p2, Float[] p3 ) {
		 /* .locals 4 */
		 int v3 = 0; // const/4 v3, 0x0
		 int v2 = 1; // const/4 v2, 0x1
		 int v0 = 4; // const/4 v0, 0x4
		 /* sub-int v0, p0, v0 */
	 } // :goto_0
	 /* if-gez v0, :cond_0 */
	 int v0 = 2; // const/4 v0, 0x2
	 /* sub-int v0, p0, v0 */
	 v0 = 	 org.anddev.andengine.collision.ShapeCollisionChecker .checkCollisionSub ( v0,v3,p1,p3,p2 );
	 if ( v0 != null) { // if-eqz v0, :cond_2
		 /* move v0, v2 */
	 } // :goto_1
} // :cond_0
/* add-int/lit8 v1, v0, 0x2 */
v1 = org.anddev.andengine.collision.ShapeCollisionChecker .checkCollisionSub ( v0,v1,p1,p3,p2 );
if ( v1 != null) { // if-eqz v1, :cond_1
	 /* move v0, v2 */
} // :cond_1
/* add-int/lit8 v0, v0, -0x2 */
} // :cond_2
/* aget v0, p3, v3 */
/* aget v1, p3, v2 */
v0 = org.anddev.andengine.collision.ShapeCollisionChecker .checkContains ( p1,p0,v0,v1 );
if ( v0 != null) { // if-eqz v0, :cond_3
/* move v0, v2 */
} // :cond_3
/* aget v0, p1, v3 */
/* aget v1, p1, v2 */
v0 = org.anddev.andengine.collision.ShapeCollisionChecker .checkContains ( p3,p2,v0,v1 );
if ( v0 != null) { // if-eqz v0, :cond_4
/* move v0, v2 */
} // :cond_4
/* move v0, v3 */
} // .end method
private static Boolean checkCollisionSub ( Integer p0, Integer p1, Float[] p2, Float[] p3, Integer p4 ) {
/* .locals 11 */
int v10 = 0; // const/4 v10, 0x0
int v9 = 1; // const/4 v9, 0x1
/* add-int/lit8 v0, p0, 0x0 */
/* aget v0, p2, v0 */
/* add-int/lit8 v1, p0, 0x1 */
/* aget v1, p2, v1 */
/* add-int/lit8 v2, p1, 0x0 */
/* aget v2, p2, v2 */
/* add-int/lit8 v3, p1, 0x1 */
/* aget v3, p2, v3 */
int v4 = 4; // const/4 v4, 0x4
/* sub-int v4, p4, v4 */
/* move v8, v4 */
} // :goto_0
/* if-gez v8, :cond_0 */
int v4 = 2; // const/4 v4, 0x2
/* sub-int v4, p4, v4 */
/* aget v4, p3, v4 */
/* sub-int v5, p4, v9 */
/* aget v5, p3, v5 */
/* aget v6, p3, v10 */
/* aget v7, p3, v9 */
v0 = /* invoke-static/range {v0 ..v7}, Lorg/anddev/andengine/collision/LineCollisionChecker;->checkLineCollision(FFFFFFFF)Z */
if ( v0 != null) { // if-eqz v0, :cond_2
/* move v0, v9 */
} // :goto_1
} // :cond_0
/* add-int/lit8 v4, v8, 0x0 */
/* aget v4, p3, v4 */
/* add-int/lit8 v5, v8, 0x1 */
/* aget v5, p3, v5 */
/* add-int/lit8 v6, v8, 0x2 */
/* add-int/lit8 v6, v6, 0x0 */
/* aget v6, p3, v6 */
/* add-int/lit8 v7, v8, 0x2 */
/* add-int/lit8 v7, v7, 0x1 */
/* aget v7, p3, v7 */
v4 = /* invoke-static/range {v0 ..v7}, Lorg/anddev/andengine/collision/LineCollisionChecker;->checkLineCollision(FFFFFFFF)Z */
if ( v4 != null) { // if-eqz v4, :cond_1
/* move v0, v9 */
} // :cond_1
/* add-int/lit8 v4, v8, -0x2 */
/* move v8, v4 */
} // :cond_2
/* move v0, v10 */
} // .end method
public static Boolean checkContains ( Float[] p0, Integer p1, Float p2, Float p3 ) {
/* .locals 10 */
int v9 = 0; // const/4 v9, 0x0
int v8 = 1; // const/4 v8, 0x1
int v0 = 4; // const/4 v0, 0x4
/* sub-int v0, p1, v0 */
/* move v6, v0 */
/* move v7, v9 */
} // :goto_0
/* if-gez v6, :cond_0 */
int v0 = 2; // const/4 v0, 0x2
/* sub-int v0, p1, v0 */
/* aget v0, p0, v0 */
/* sub-int v1, p1, v8 */
/* aget v1, p0, v1 */
/* aget v2, p0, v9 */
/* aget v3, p0, v8 */
/* move v4, p2 */
/* move v5, p3 */
v0 = /* invoke-static/range {v0 ..v5}, Lorg/anddev/andengine/collision/BaseCollisionChecker;->relativeCCW(FFFFFF)I */
/* if-nez v0, :cond_2 */
/* move v0, v8 */
} // :goto_1
} // :cond_0
/* aget v0, p0, v6 */
/* add-int/lit8 v1, v6, 0x1 */
/* aget v1, p0, v1 */
/* add-int/lit8 v2, v6, 0x2 */
/* aget v2, p0, v2 */
/* add-int/lit8 v3, v6, 0x3 */
/* aget v3, p0, v3 */
/* move v4, p2 */
/* move v5, p3 */
v0 = /* invoke-static/range {v0 ..v5}, Lorg/anddev/andengine/collision/BaseCollisionChecker;->relativeCCW(FFFFFF)I */
/* if-nez v0, :cond_1 */
/* move v0, v8 */
} // :cond_1
/* add-int/2addr v0, v7 */
/* add-int/lit8 v1, v6, -0x2 */
/* move v6, v1 */
/* move v7, v0 */
} // :cond_2
/* add-int/2addr v0, v7 */
/* div-int/lit8 v1, p1, 0x2 */
/* if-eq v0, v1, :cond_3 */
/* neg-int v1, v1 */
/* if-eq v0, v1, :cond_3 */
/* move v0, v9 */
} // :cond_3
/* move v0, v8 */
} // .end method
