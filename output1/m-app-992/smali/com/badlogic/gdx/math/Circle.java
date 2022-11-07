public class com.badlogic.gdx.math.Circle implements java.io.Serializable {
	 /* # interfaces */
	 /* # instance fields */
	 public Float radius;
	 public Float x;
	 public Float y;
	 /* # direct methods */
	 public com.badlogic.gdx.math.Circle ( ) {
		 /* .locals 0 */
		 /* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
		 /* iput p1, p0, Lcom/badlogic/gdx/math/Circle;->x:F */
		 /* iput p2, p0, Lcom/badlogic/gdx/math/Circle;->y:F */
		 /* iput p3, p0, Lcom/badlogic/gdx/math/Circle;->radius:F */
		 return;
	 } // .end method
	 public com.badlogic.gdx.math.Circle ( ) {
		 /* .locals 1 */
		 /* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
		 /* iget v0, p1, Lcom/badlogic/gdx/math/Vector2;->x:F */
		 /* iput v0, p0, Lcom/badlogic/gdx/math/Circle;->x:F */
		 /* iget v0, p1, Lcom/badlogic/gdx/math/Vector2;->y:F */
		 /* iput v0, p0, Lcom/badlogic/gdx/math/Circle;->y:F */
		 /* iput p2, p0, Lcom/badlogic/gdx/math/Circle;->radius:F */
		 return;
	 } // .end method
	 /* # virtual methods */
	 public Boolean contains ( Float p0, Float p1 ) {
		 /* .locals 3 */
		 /* iget v0, p0, Lcom/badlogic/gdx/math/Circle;->x:F */
		 /* sub-float/2addr v0, p1 */
		 /* iget v1, p0, Lcom/badlogic/gdx/math/Circle;->y:F */
		 /* sub-float/2addr v1, p2 */
		 /* mul-float/2addr v0, v0 */
		 /* mul-float/2addr v1, v1 */
		 /* add-float/2addr v0, v1 */
		 /* iget v1, p0, Lcom/badlogic/gdx/math/Circle;->radius:F */
		 /* iget v2, p0, Lcom/badlogic/gdx/math/Circle;->radius:F */
		 /* mul-float/2addr v1, v2 */
		 /* cmpg-float v0, v0, v1 */
		 /* if-gtz v0, :cond_0 */
		 int v0 = 1; // const/4 v0, 0x1
	 } // :goto_0
} // :cond_0
int v0 = 0; // const/4 v0, 0x0
} // .end method
public Boolean contains ( com.badlogic.gdx.math.Vector2 p0 ) {
/* .locals 3 */
/* iget v0, p0, Lcom/badlogic/gdx/math/Circle;->x:F */
/* iget v1, p1, Lcom/badlogic/gdx/math/Vector2;->x:F */
/* sub-float/2addr v0, v1 */
/* iget v1, p0, Lcom/badlogic/gdx/math/Circle;->y:F */
/* iget v2, p1, Lcom/badlogic/gdx/math/Vector2;->y:F */
/* sub-float/2addr v1, v2 */
/* mul-float/2addr v0, v0 */
/* mul-float/2addr v1, v1 */
/* add-float/2addr v0, v1 */
/* iget v1, p0, Lcom/badlogic/gdx/math/Circle;->radius:F */
/* iget v2, p0, Lcom/badlogic/gdx/math/Circle;->radius:F */
/* mul-float/2addr v1, v2 */
/* cmpg-float v0, v0, v1 */
/* if-gtz v0, :cond_0 */
int v0 = 1; // const/4 v0, 0x1
} // :goto_0
} // :cond_0
int v0 = 0; // const/4 v0, 0x0
} // .end method
public void set ( Float p0, Float p1, Float p2 ) {
/* .locals 0 */
/* iput p1, p0, Lcom/badlogic/gdx/math/Circle;->x:F */
/* iput p2, p0, Lcom/badlogic/gdx/math/Circle;->y:F */
/* iput p3, p0, Lcom/badlogic/gdx/math/Circle;->radius:F */
return;
} // .end method
