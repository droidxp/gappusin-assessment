public class com.badlogic.gdx.physics.box2d.Transform {
	 /* # static fields */
	 public static final Integer COS;
	 public static final Integer POS_X;
	 public static final Integer POS_Y;
	 public static final Integer SIN;
	 /* # instance fields */
	 private com.badlogic.gdx.math.Vector2 position;
	 public vals;
	 /* # direct methods */
	 public com.badlogic.gdx.physics.box2d.Transform ( ) {
		 /* .locals 1 */
		 /* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
		 int v0 = 4; // const/4 v0, 0x4
		 /* new-array v0, v0, [F */
		 this.vals = v0;
		 /* new-instance v0, Lcom/badlogic/gdx/math/Vector2; */
		 /* invoke-direct {v0}, Lcom/badlogic/gdx/math/Vector2;-><init>()V */
		 this.position = v0;
		 return;
	 } // .end method
	 public com.badlogic.gdx.physics.box2d.Transform ( ) {
		 /* .locals 1 */
		 /* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
		 int v0 = 4; // const/4 v0, 0x4
		 /* new-array v0, v0, [F */
		 this.vals = v0;
		 /* new-instance v0, Lcom/badlogic/gdx/math/Vector2; */
		 /* invoke-direct {v0}, Lcom/badlogic/gdx/math/Vector2;-><init>()V */
		 this.position = v0;
		 (( com.badlogic.gdx.physics.box2d.Transform ) p0 ).setPosition ( p1 ); // invoke-virtual {p0, p1}, Lcom/badlogic/gdx/physics/box2d/Transform;->setPosition(Lcom/badlogic/gdx/math/Vector2;)V
		 (( com.badlogic.gdx.physics.box2d.Transform ) p0 ).setRotation ( p2 ); // invoke-virtual {p0, p2}, Lcom/badlogic/gdx/physics/box2d/Transform;->setRotation(F)V
		 return;
	 } // .end method
	 /* # virtual methods */
	 public com.badlogic.gdx.math.Vector2 getPosition ( ) {
		 /* .locals 4 */
		 v0 = this.position;
		 v1 = this.vals;
		 int v2 = 0; // const/4 v2, 0x0
		 /* aget v1, v1, v2 */
		 v2 = this.vals;
		 int v3 = 1; // const/4 v3, 0x1
		 /* aget v2, v2, v3 */
		 (( com.badlogic.gdx.math.Vector2 ) v0 ).set ( v1, v2 ); // invoke-virtual {v0, v1, v2}, Lcom/badlogic/gdx/math/Vector2;->set(FF)Lcom/badlogic/gdx/math/Vector2;
	 } // .end method
	 public Float getRotation ( ) {
		 /* .locals 4 */
		 v0 = this.vals;
		 int v1 = 3; // const/4 v1, 0x3
		 /* aget v0, v0, v1 */
		 /* float-to-double v0, v0 */
		 v2 = this.vals;
		 int v3 = 2; // const/4 v3, 0x2
		 /* aget v2, v2, v3 */
		 /* float-to-double v2, v2 */
		 java.lang.Math .atan2 ( v0,v1,v2,v3 );
		 /* move-result-wide v0 */
		 /* double-to-float v0, v0 */
	 } // .end method
	 public com.badlogic.gdx.math.Vector2 mul ( com.badlogic.gdx.math.Vector2 p0 ) {
		 /* .locals 5 */
		 int v3 = 3; // const/4 v3, 0x3
		 int v4 = 2; // const/4 v4, 0x2
		 v0 = this.vals;
		 int v1 = 0; // const/4 v1, 0x0
		 /* aget v0, v0, v1 */
		 v1 = this.vals;
		 /* aget v1, v1, v4 */
		 /* iget v2, p1, Lcom/badlogic/gdx/math/Vector2;->x:F */
		 /* mul-float/2addr v1, v2 */
		 /* add-float/2addr v0, v1 */
		 v1 = this.vals;
		 /* aget v1, v1, v3 */
		 /* neg-float v1, v1 */
		 /* iget v2, p1, Lcom/badlogic/gdx/math/Vector2;->y:F */
		 /* mul-float/2addr v1, v2 */
		 /* add-float/2addr v0, v1 */
		 v1 = this.vals;
		 int v2 = 1; // const/4 v2, 0x1
		 /* aget v1, v1, v2 */
		 v2 = this.vals;
		 /* aget v2, v2, v3 */
		 /* iget v3, p1, Lcom/badlogic/gdx/math/Vector2;->x:F */
		 /* mul-float/2addr v2, v3 */
		 /* add-float/2addr v1, v2 */
		 v2 = this.vals;
		 /* aget v2, v2, v4 */
		 /* iget v3, p1, Lcom/badlogic/gdx/math/Vector2;->y:F */
		 /* mul-float/2addr v2, v3 */
		 /* add-float/2addr v1, v2 */
		 /* iput v0, p1, Lcom/badlogic/gdx/math/Vector2;->x:F */
		 /* iput v1, p1, Lcom/badlogic/gdx/math/Vector2;->y:F */
	 } // .end method
	 public void setPosition ( com.badlogic.gdx.math.Vector2 p0 ) {
		 /* .locals 3 */
		 v0 = this.vals;
		 int v1 = 0; // const/4 v1, 0x0
		 /* iget v2, p1, Lcom/badlogic/gdx/math/Vector2;->x:F */
		 /* aput v2, v0, v1 */
		 v0 = this.vals;
		 int v1 = 1; // const/4 v1, 0x1
		 /* iget v2, p1, Lcom/badlogic/gdx/math/Vector2;->y:F */
		 /* aput v2, v0, v1 */
		 return;
	 } // .end method
	 public void setRotation ( Float p0 ) {
		 /* .locals 4 */
		 /* float-to-double v0, p1 */
		 java.lang.Math .cos ( v0,v1 );
		 /* move-result-wide v0 */
		 /* double-to-float v0, v0 */
		 /* float-to-double v1, p1 */
		 java.lang.Math .sin ( v1,v2 );
		 /* move-result-wide v1 */
		 /* double-to-float v1, v1 */
		 v2 = this.vals;
		 int v3 = 2; // const/4 v3, 0x2
		 /* aput v0, v2, v3 */
		 v0 = this.vals;
		 int v2 = 3; // const/4 v2, 0x3
		 /* aput v1, v0, v2 */
		 return;
	 } // .end method
