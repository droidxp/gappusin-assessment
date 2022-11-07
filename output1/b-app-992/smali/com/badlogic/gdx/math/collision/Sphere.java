public class com.badlogic.gdx.math.collision.Sphere implements java.io.Serializable {
	 /* # interfaces */
	 /* # static fields */
	 private static final Long serialVersionUID;
	 /* # instance fields */
	 public final com.badlogic.gdx.math.Vector3 center;
	 public Float radius;
	 /* # direct methods */
	 public com.badlogic.gdx.math.collision.Sphere ( ) {
		 /* .locals 1 */
		 /* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
		 /* new-instance v0, Lcom/badlogic/gdx/math/Vector3; */
		 /* invoke-direct {v0, p1}, Lcom/badlogic/gdx/math/Vector3;-><init>(Lcom/badlogic/gdx/math/Vector3;)V */
		 this.center = v0;
		 /* iput p2, p0, Lcom/badlogic/gdx/math/collision/Sphere;->radius:F */
		 return;
	 } // .end method
	 /* # virtual methods */
	 public Boolean overlaps ( com.badlogic.gdx.math.collision.Sphere p0 ) {
		 /* .locals 4 */
		 v0 = this.center;
		 v1 = this.center;
		 v0 = 		 (( com.badlogic.gdx.math.Vector3 ) v0 ).dst2 ( v1 ); // invoke-virtual {v0, v1}, Lcom/badlogic/gdx/math/Vector3;->dst2(Lcom/badlogic/gdx/math/Vector3;)F
		 /* iget v1, p0, Lcom/badlogic/gdx/math/collision/Sphere;->radius:F */
		 /* iget v2, p0, Lcom/badlogic/gdx/math/collision/Sphere;->radius:F */
		 /* mul-float/2addr v1, v2 */
		 /* iget v2, p1, Lcom/badlogic/gdx/math/collision/Sphere;->radius:F */
		 /* iget v3, p0, Lcom/badlogic/gdx/math/collision/Sphere;->radius:F */
		 /* mul-float/2addr v2, v3 */
		 /* add-float/2addr v1, v2 */
		 /* cmpg-float v0, v0, v1 */
		 /* if-gez v0, :cond_0 */
		 int v0 = 1; // const/4 v0, 0x1
	 } // :goto_0
} // :cond_0
int v0 = 0; // const/4 v0, 0x0
} // .end method
