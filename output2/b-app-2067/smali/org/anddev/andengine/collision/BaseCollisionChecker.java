public class org.anddev.andengine.collision.BaseCollisionChecker {
	 /* # direct methods */
	 public org.anddev.andengine.collision.BaseCollisionChecker ( ) {
		 /* .locals 0 */
		 /* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
		 return;
	 } // .end method
	 public static Boolean checkAxisAlignedRectangleCollision ( Float p0, Float p1, Float p2, Float p3, Float p4, Float p5, Float p6, Float p7 ) {
		 /* .locals 1 */
		 /* cmpg-float v0, p0, p6 */
		 /* if-gez v0, :cond_0 */
		 /* cmpg-float v0, p4, p2 */
		 /* if-gez v0, :cond_0 */
		 /* cmpg-float v0, p1, p7 */
		 /* if-gez v0, :cond_0 */
		 /* cmpg-float v0, p5, p3 */
		 /* if-gez v0, :cond_0 */
		 int v0 = 1; // const/4 v0, 0x1
	 } // :goto_0
} // :cond_0
int v0 = 0; // const/4 v0, 0x0
} // .end method
public static Integer relativeCCW ( Float p0, Float p1, Float p2, Float p3, Float p4, Float p5 ) {
/* .locals 7 */
int v6 = 0; // const/4 v6, 0x0
/* sub-float v0, p2, p0 */
/* sub-float v1, p3, p1 */
/* sub-float v2, p4, p0 */
/* sub-float v3, p5, p1 */
/* mul-float v4, v2, v1 */
/* mul-float v5, v3, v0 */
/* sub-float/2addr v4, v5 */
/* cmpl-float v5, v4, v6 */
/* if-nez v5, :cond_3 */
/* mul-float v4, v2, v0 */
/* mul-float v5, v3, v1 */
/* add-float/2addr v4, v5 */
/* cmpl-float v5, v4, v6 */
/* if-lez v5, :cond_3 */
/* sub-float/2addr v2, v0 */
/* sub-float/2addr v3, v1 */
/* mul-float/2addr v0, v2 */
/* mul-float/2addr v1, v3 */
/* add-float/2addr v0, v1 */
/* cmpg-float v1, v0, v6 */
/* if-gez v1, :cond_0 */
/* move v0, v6 */
} // :cond_0
} // :goto_0
/* cmpg-float v1, v0, v6 */
/* if-gez v1, :cond_1 */
int v0 = -1; // const/4 v0, -0x1
} // :goto_1
} // :cond_1
/* cmpl-float v0, v0, v6 */
/* if-lez v0, :cond_2 */
int v0 = 1; // const/4 v0, 0x1
} // :cond_2
int v0 = 0; // const/4 v0, 0x0
} // :cond_3
/* move v0, v4 */
} // .end method
