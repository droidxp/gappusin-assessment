public class com.badlogic.gdx.math.Plane implements java.io.Serializable {
	 /* # interfaces */
	 /* # static fields */
	 private static final Long serialVersionUID;
	 /* # instance fields */
	 public Float d;
	 public final com.badlogic.gdx.math.Vector3 normal;
	 /* # direct methods */
	 public com.badlogic.gdx.math.Plane ( ) {
		 /* .locals 1 */
		 /* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
		 /* new-instance v0, Lcom/badlogic/gdx/math/Vector3; */
		 /* invoke-direct {v0}, Lcom/badlogic/gdx/math/Vector3;-><init>()V */
		 this.normal = v0;
		 int v0 = 0; // const/4 v0, 0x0
		 /* iput v0, p0, Lcom/badlogic/gdx/math/Plane;->d:F */
		 v0 = this.normal;
		 (( com.badlogic.gdx.math.Vector3 ) v0 ).set ( p1 ); // invoke-virtual {v0, p1}, Lcom/badlogic/gdx/math/Vector3;->set(Lcom/badlogic/gdx/math/Vector3;)Lcom/badlogic/gdx/math/Vector3;
		 (( com.badlogic.gdx.math.Vector3 ) v0 ).nor ( ); // invoke-virtual {v0}, Lcom/badlogic/gdx/math/Vector3;->nor()Lcom/badlogic/gdx/math/Vector3;
		 /* iput p2, p0, Lcom/badlogic/gdx/math/Plane;->d:F */
		 return;
	 } // .end method
	 public com.badlogic.gdx.math.Plane ( ) {
		 /* .locals 1 */
		 /* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
		 /* new-instance v0, Lcom/badlogic/gdx/math/Vector3; */
		 /* invoke-direct {v0}, Lcom/badlogic/gdx/math/Vector3;-><init>()V */
		 this.normal = v0;
		 int v0 = 0; // const/4 v0, 0x0
		 /* iput v0, p0, Lcom/badlogic/gdx/math/Plane;->d:F */
		 v0 = this.normal;
		 (( com.badlogic.gdx.math.Vector3 ) v0 ).set ( p1 ); // invoke-virtual {v0, p1}, Lcom/badlogic/gdx/math/Vector3;->set(Lcom/badlogic/gdx/math/Vector3;)Lcom/badlogic/gdx/math/Vector3;
		 (( com.badlogic.gdx.math.Vector3 ) v0 ).nor ( ); // invoke-virtual {v0}, Lcom/badlogic/gdx/math/Vector3;->nor()Lcom/badlogic/gdx/math/Vector3;
		 v0 = this.normal;
		 v0 = 		 (( com.badlogic.gdx.math.Vector3 ) v0 ).dot ( p2 ); // invoke-virtual {v0, p2}, Lcom/badlogic/gdx/math/Vector3;->dot(Lcom/badlogic/gdx/math/Vector3;)F
		 /* neg-float v0, v0 */
		 /* iput v0, p0, Lcom/badlogic/gdx/math/Plane;->d:F */
		 return;
	 } // .end method
	 public com.badlogic.gdx.math.Plane ( ) {
		 /* .locals 1 */
		 /* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
		 /* new-instance v0, Lcom/badlogic/gdx/math/Vector3; */
		 /* invoke-direct {v0}, Lcom/badlogic/gdx/math/Vector3;-><init>()V */
		 this.normal = v0;
		 int v0 = 0; // const/4 v0, 0x0
		 /* iput v0, p0, Lcom/badlogic/gdx/math/Plane;->d:F */
		 (( com.badlogic.gdx.math.Plane ) p0 ).set ( p1, p2, p3 ); // invoke-virtual {p0, p1, p2, p3}, Lcom/badlogic/gdx/math/Plane;->set(Lcom/badlogic/gdx/math/Vector3;Lcom/badlogic/gdx/math/Vector3;Lcom/badlogic/gdx/math/Vector3;)V
		 return;
	 } // .end method
	 /* # virtual methods */
	 public Float distance ( com.badlogic.gdx.math.Vector3 p0 ) {
		 /* .locals 2 */
		 v0 = this.normal;
		 v0 = 		 (( com.badlogic.gdx.math.Vector3 ) v0 ).dot ( p1 ); // invoke-virtual {v0, p1}, Lcom/badlogic/gdx/math/Vector3;->dot(Lcom/badlogic/gdx/math/Vector3;)F
		 /* iget v1, p0, Lcom/badlogic/gdx/math/Plane;->d:F */
		 /* add-float/2addr v0, v1 */
	 } // .end method
	 public Float getD ( ) {
		 /* .locals 1 */
		 /* iget v0, p0, Lcom/badlogic/gdx/math/Plane;->d:F */
	 } // .end method
	 public com.badlogic.gdx.math.Vector3 getNormal ( ) {
		 /* .locals 1 */
		 v0 = this.normal;
	 } // .end method
	 public Boolean isFrontFacing ( com.badlogic.gdx.math.Vector3 p0 ) {
		 /* .locals 2 */
		 v0 = this.normal;
		 v0 = 		 (( com.badlogic.gdx.math.Vector3 ) v0 ).dot ( p1 ); // invoke-virtual {v0, p1}, Lcom/badlogic/gdx/math/Vector3;->dot(Lcom/badlogic/gdx/math/Vector3;)F
		 int v1 = 0; // const/4 v1, 0x0
		 /* cmpg-float v0, v0, v1 */
		 /* if-gtz v0, :cond_0 */
		 int v0 = 1; // const/4 v0, 0x1
	 } // :goto_0
} // :cond_0
int v0 = 0; // const/4 v0, 0x0
} // .end method
public void set ( Float p0, Float p1, Float p2, Float p3 ) {
/* .locals 1 */
v0 = this.normal;
(( com.badlogic.gdx.math.Vector3 ) v0 ).set ( p1, p2, p3 ); // invoke-virtual {v0, p1, p2, p3}, Lcom/badlogic/gdx/math/Vector3;->set(FFF)Lcom/badlogic/gdx/math/Vector3;
/* iput p4, p0, Lcom/badlogic/gdx/math/Plane;->d:F */
return;
} // .end method
public void set ( com.badlogic.gdx.math.Plane p0 ) {
/* .locals 2 */
v0 = this.normal;
v1 = this.normal;
(( com.badlogic.gdx.math.Vector3 ) v0 ).set ( v1 ); // invoke-virtual {v0, v1}, Lcom/badlogic/gdx/math/Vector3;->set(Lcom/badlogic/gdx/math/Vector3;)Lcom/badlogic/gdx/math/Vector3;
/* iget v0, p1, Lcom/badlogic/gdx/math/Plane;->d:F */
/* iput v0, p0, Lcom/badlogic/gdx/math/Plane;->d:F */
return;
} // .end method
public void set ( com.badlogic.gdx.math.Vector3 p0, com.badlogic.gdx.math.Vector3 p1 ) {
/* .locals 1 */
v0 = this.normal;
(( com.badlogic.gdx.math.Vector3 ) v0 ).set ( p2 ); // invoke-virtual {v0, p2}, Lcom/badlogic/gdx/math/Vector3;->set(Lcom/badlogic/gdx/math/Vector3;)Lcom/badlogic/gdx/math/Vector3;
v0 = (( com.badlogic.gdx.math.Vector3 ) p1 ).dot ( p2 ); // invoke-virtual {p1, p2}, Lcom/badlogic/gdx/math/Vector3;->dot(Lcom/badlogic/gdx/math/Vector3;)F
/* neg-float v0, v0 */
/* iput v0, p0, Lcom/badlogic/gdx/math/Plane;->d:F */
return;
} // .end method
public void set ( com.badlogic.gdx.math.Vector3 p0, com.badlogic.gdx.math.Vector3 p1, com.badlogic.gdx.math.Vector3 p2 ) {
/* .locals 2 */
(( com.badlogic.gdx.math.Vector3 ) p1 ).tmp ( ); // invoke-virtual {p1}, Lcom/badlogic/gdx/math/Vector3;->tmp()Lcom/badlogic/gdx/math/Vector3;
(( com.badlogic.gdx.math.Vector3 ) v0 ).sub ( p2 ); // invoke-virtual {v0, p2}, Lcom/badlogic/gdx/math/Vector3;->sub(Lcom/badlogic/gdx/math/Vector3;)Lcom/badlogic/gdx/math/Vector3;
(( com.badlogic.gdx.math.Vector3 ) p2 ).tmp2 ( ); // invoke-virtual {p2}, Lcom/badlogic/gdx/math/Vector3;->tmp2()Lcom/badlogic/gdx/math/Vector3;
(( com.badlogic.gdx.math.Vector3 ) v1 ).sub ( p3 ); // invoke-virtual {v1, p3}, Lcom/badlogic/gdx/math/Vector3;->sub(Lcom/badlogic/gdx/math/Vector3;)Lcom/badlogic/gdx/math/Vector3;
(( com.badlogic.gdx.math.Vector3 ) v0 ).crs ( v1 ); // invoke-virtual {v0, v1}, Lcom/badlogic/gdx/math/Vector3;->crs(Lcom/badlogic/gdx/math/Vector3;)Lcom/badlogic/gdx/math/Vector3;
(( com.badlogic.gdx.math.Vector3 ) v0 ).nor ( ); // invoke-virtual {v0}, Lcom/badlogic/gdx/math/Vector3;->nor()Lcom/badlogic/gdx/math/Vector3;
v1 = this.normal;
(( com.badlogic.gdx.math.Vector3 ) v1 ).set ( v0 ); // invoke-virtual {v1, v0}, Lcom/badlogic/gdx/math/Vector3;->set(Lcom/badlogic/gdx/math/Vector3;)Lcom/badlogic/gdx/math/Vector3;
v0 = (( com.badlogic.gdx.math.Vector3 ) p1 ).dot ( v0 ); // invoke-virtual {p1, v0}, Lcom/badlogic/gdx/math/Vector3;->dot(Lcom/badlogic/gdx/math/Vector3;)F
/* neg-float v0, v0 */
/* iput v0, p0, Lcom/badlogic/gdx/math/Plane;->d:F */
return;
} // .end method
public com.badlogic.gdx.math.Plane$PlaneSide testPoint ( com.badlogic.gdx.math.Vector3 p0 ) {
/* .locals 3 */
int v2 = 0; // const/4 v2, 0x0
v0 = this.normal;
v0 = (( com.badlogic.gdx.math.Vector3 ) v0 ).dot ( p1 ); // invoke-virtual {v0, p1}, Lcom/badlogic/gdx/math/Vector3;->dot(Lcom/badlogic/gdx/math/Vector3;)F
/* iget v1, p0, Lcom/badlogic/gdx/math/Plane;->d:F */
/* add-float/2addr v0, v1 */
/* cmpl-float v1, v0, v2 */
/* if-nez v1, :cond_0 */
v0 = com.badlogic.gdx.math.Plane$PlaneSide.OnPlane;
} // :goto_0
} // :cond_0
/* cmpg-float v0, v0, v2 */
/* if-gez v0, :cond_1 */
v0 = com.badlogic.gdx.math.Plane$PlaneSide.Back;
} // :cond_1
v0 = com.badlogic.gdx.math.Plane$PlaneSide.Front;
} // .end method
public java.lang.String toString ( ) {
/* .locals 2 */
/* new-instance v0, Ljava/lang/StringBuilder; */
/* invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V */
v1 = this.normal;
(( com.badlogic.gdx.math.Vector3 ) v1 ).toString ( ); // invoke-virtual {v1}, Lcom/badlogic/gdx/math/Vector3;->toString()Ljava/lang/String;
(( java.lang.StringBuilder ) v0 ).append ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
final String v1 = ", "; // const-string v1, ", "
(( java.lang.StringBuilder ) v0 ).append ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
/* iget v1, p0, Lcom/badlogic/gdx/math/Plane;->d:F */
(( java.lang.StringBuilder ) v0 ).append ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v0 ).toString ( ); // invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
} // .end method
