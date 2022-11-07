public class com.badlogic.gdx.math.Quaternion implements java.io.Serializable {
	 /* # interfaces */
	 /* # static fields */
	 private static final Float NORMALIZATION_TOLERANCE;
	 private static final Long serialVersionUID;
	 private static com.badlogic.gdx.math.Quaternion tmp1;
	 private static com.badlogic.gdx.math.Quaternion tmp2;
	 /* # instance fields */
	 public Float w;
	 public Float x;
	 public Float y;
	 public Float z;
	 /* # direct methods */
	 static com.badlogic.gdx.math.Quaternion ( ) {
		 /* .locals 2 */
		 int v1 = 0; // const/4 v1, 0x0
		 /* new-instance v0, Lcom/badlogic/gdx/math/Quaternion; */
		 /* invoke-direct {v0, v1, v1, v1, v1}, Lcom/badlogic/gdx/math/Quaternion;-><init>(FFFF)V */
		 /* new-instance v0, Lcom/badlogic/gdx/math/Quaternion; */
		 /* invoke-direct {v0, v1, v1, v1, v1}, Lcom/badlogic/gdx/math/Quaternion;-><init>(FFFF)V */
		 return;
	 } // .end method
	 com.badlogic.gdx.math.Quaternion ( ) {
		 /* .locals 0 */
		 /* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
		 return;
	 } // .end method
	 public com.badlogic.gdx.math.Quaternion ( ) {
		 /* .locals 0 */
		 /* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
		 (( com.badlogic.gdx.math.Quaternion ) p0 ).set ( p1, p2, p3, p4 ); // invoke-virtual {p0, p1, p2, p3, p4}, Lcom/badlogic/gdx/math/Quaternion;->set(FFFF)Lcom/badlogic/gdx/math/Quaternion;
		 return;
	 } // .end method
	 public com.badlogic.gdx.math.Quaternion ( ) {
		 /* .locals 0 */
		 /* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
		 (( com.badlogic.gdx.math.Quaternion ) p0 ).set ( p1 ); // invoke-virtual {p0, p1}, Lcom/badlogic/gdx/math/Quaternion;->set(Lcom/badlogic/gdx/math/Quaternion;)Lcom/badlogic/gdx/math/Quaternion;
		 return;
	 } // .end method
	 public com.badlogic.gdx.math.Quaternion ( ) {
		 /* .locals 0 */
		 /* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
		 (( com.badlogic.gdx.math.Quaternion ) p0 ).set ( p1, p2 ); // invoke-virtual {p0, p1, p2}, Lcom/badlogic/gdx/math/Quaternion;->set(Lcom/badlogic/gdx/math/Vector3;F)Lcom/badlogic/gdx/math/Quaternion;
		 return;
	 } // .end method
	 public static com.badlogic.gdx.math.Quaternion idt ( ) {
		 /* .locals 3 */
		 int v2 = 0; // const/4 v2, 0x0
		 /* new-instance v0, Lcom/badlogic/gdx/math/Quaternion; */
		 /* const/high16 v1, 0x3f800000 # 1.0f */
		 /* invoke-direct {v0, v2, v2, v2, v1}, Lcom/badlogic/gdx/math/Quaternion;-><init>(FFFF)V */
	 } // .end method
	 /* # virtual methods */
	 public com.badlogic.gdx.math.Quaternion conjugate ( ) {
		 /* .locals 1 */
		 /* iget v0, p0, Lcom/badlogic/gdx/math/Quaternion;->x:F */
		 /* neg-float v0, v0 */
		 /* iput v0, p0, Lcom/badlogic/gdx/math/Quaternion;->x:F */
		 /* iget v0, p0, Lcom/badlogic/gdx/math/Quaternion;->y:F */
		 /* neg-float v0, v0 */
		 /* iput v0, p0, Lcom/badlogic/gdx/math/Quaternion;->y:F */
		 /* iget v0, p0, Lcom/badlogic/gdx/math/Quaternion;->z:F */
		 /* neg-float v0, v0 */
		 /* iput v0, p0, Lcom/badlogic/gdx/math/Quaternion;->z:F */
	 } // .end method
	 public com.badlogic.gdx.math.Quaternion cpy ( ) {
		 /* .locals 1 */
		 /* new-instance v0, Lcom/badlogic/gdx/math/Quaternion; */
		 /* invoke-direct {v0, p0}, Lcom/badlogic/gdx/math/Quaternion;-><init>(Lcom/badlogic/gdx/math/Quaternion;)V */
	 } // .end method
	 public Float dot ( com.badlogic.gdx.math.Quaternion p0 ) {
		 /* .locals 3 */
		 /* iget v0, p0, Lcom/badlogic/gdx/math/Quaternion;->x:F */
		 /* iget v1, p1, Lcom/badlogic/gdx/math/Quaternion;->x:F */
		 /* mul-float/2addr v0, v1 */
		 /* iget v1, p0, Lcom/badlogic/gdx/math/Quaternion;->y:F */
		 /* iget v2, p1, Lcom/badlogic/gdx/math/Quaternion;->y:F */
		 /* mul-float/2addr v1, v2 */
		 /* add-float/2addr v0, v1 */
		 /* iget v1, p0, Lcom/badlogic/gdx/math/Quaternion;->z:F */
		 /* iget v2, p1, Lcom/badlogic/gdx/math/Quaternion;->z:F */
		 /* mul-float/2addr v1, v2 */
		 /* add-float/2addr v0, v1 */
		 /* iget v1, p0, Lcom/badlogic/gdx/math/Quaternion;->w:F */
		 /* iget v2, p1, Lcom/badlogic/gdx/math/Quaternion;->w:F */
		 /* mul-float/2addr v1, v2 */
		 /* add-float/2addr v0, v1 */
	 } // .end method
	 public Boolean equals ( java.lang.Object p0 ) {
		 /* .locals 4 */
		 int v3 = 1; // const/4 v3, 0x1
		 int v2 = 0; // const/4 v2, 0x0
		 /* if-ne p0, p1, :cond_0 */
		 /* move v0, v3 */
	 } // :goto_0
} // :cond_0
/* instance-of v0, p1, Lcom/badlogic/gdx/math/Quaternion; */
/* if-nez v0, :cond_1 */
/* move v0, v2 */
} // :cond_1
/* check-cast p1, Lcom/badlogic/gdx/math/Quaternion; */
/* iget v0, p0, Lcom/badlogic/gdx/math/Quaternion;->x:F */
/* iget v1, p1, Lcom/badlogic/gdx/math/Quaternion;->x:F */
/* cmpl-float v0, v0, v1 */
/* if-nez v0, :cond_2 */
/* iget v0, p0, Lcom/badlogic/gdx/math/Quaternion;->y:F */
/* iget v1, p1, Lcom/badlogic/gdx/math/Quaternion;->y:F */
/* cmpl-float v0, v0, v1 */
/* if-nez v0, :cond_2 */
/* iget v0, p0, Lcom/badlogic/gdx/math/Quaternion;->z:F */
/* iget v1, p1, Lcom/badlogic/gdx/math/Quaternion;->z:F */
/* cmpl-float v0, v0, v1 */
/* if-nez v0, :cond_2 */
/* iget v0, p0, Lcom/badlogic/gdx/math/Quaternion;->w:F */
/* iget v1, p1, Lcom/badlogic/gdx/math/Quaternion;->w:F */
/* cmpl-float v0, v0, v1 */
/* if-nez v0, :cond_2 */
/* move v0, v3 */
} // :cond_2
/* move v0, v2 */
} // .end method
public Float len ( ) {
/* .locals 3 */
/* iget v0, p0, Lcom/badlogic/gdx/math/Quaternion;->x:F */
/* iget v1, p0, Lcom/badlogic/gdx/math/Quaternion;->x:F */
/* mul-float/2addr v0, v1 */
/* iget v1, p0, Lcom/badlogic/gdx/math/Quaternion;->y:F */
/* iget v2, p0, Lcom/badlogic/gdx/math/Quaternion;->y:F */
/* mul-float/2addr v1, v2 */
/* add-float/2addr v0, v1 */
/* iget v1, p0, Lcom/badlogic/gdx/math/Quaternion;->z:F */
/* iget v2, p0, Lcom/badlogic/gdx/math/Quaternion;->z:F */
/* mul-float/2addr v1, v2 */
/* add-float/2addr v0, v1 */
/* iget v1, p0, Lcom/badlogic/gdx/math/Quaternion;->w:F */
/* iget v2, p0, Lcom/badlogic/gdx/math/Quaternion;->w:F */
/* mul-float/2addr v1, v2 */
/* add-float/2addr v0, v1 */
/* float-to-double v0, v0 */
java.lang.Math .sqrt ( v0,v1 );
/* move-result-wide v0 */
/* double-to-float v0, v0 */
} // .end method
public Float len2 ( ) {
/* .locals 3 */
/* iget v0, p0, Lcom/badlogic/gdx/math/Quaternion;->x:F */
/* iget v1, p0, Lcom/badlogic/gdx/math/Quaternion;->x:F */
/* mul-float/2addr v0, v1 */
/* iget v1, p0, Lcom/badlogic/gdx/math/Quaternion;->y:F */
/* iget v2, p0, Lcom/badlogic/gdx/math/Quaternion;->y:F */
/* mul-float/2addr v1, v2 */
/* add-float/2addr v0, v1 */
/* iget v1, p0, Lcom/badlogic/gdx/math/Quaternion;->z:F */
/* iget v2, p0, Lcom/badlogic/gdx/math/Quaternion;->z:F */
/* mul-float/2addr v1, v2 */
/* add-float/2addr v0, v1 */
/* iget v1, p0, Lcom/badlogic/gdx/math/Quaternion;->w:F */
/* iget v2, p0, Lcom/badlogic/gdx/math/Quaternion;->w:F */
/* mul-float/2addr v1, v2 */
/* add-float/2addr v0, v1 */
} // .end method
public com.badlogic.gdx.math.Quaternion mul ( Float p0 ) {
/* .locals 1 */
/* iget v0, p0, Lcom/badlogic/gdx/math/Quaternion;->x:F */
/* mul-float/2addr v0, p1 */
/* iput v0, p0, Lcom/badlogic/gdx/math/Quaternion;->x:F */
/* iget v0, p0, Lcom/badlogic/gdx/math/Quaternion;->y:F */
/* mul-float/2addr v0, p1 */
/* iput v0, p0, Lcom/badlogic/gdx/math/Quaternion;->y:F */
/* iget v0, p0, Lcom/badlogic/gdx/math/Quaternion;->z:F */
/* mul-float/2addr v0, p1 */
/* iput v0, p0, Lcom/badlogic/gdx/math/Quaternion;->z:F */
/* iget v0, p0, Lcom/badlogic/gdx/math/Quaternion;->w:F */
/* mul-float/2addr v0, p1 */
/* iput v0, p0, Lcom/badlogic/gdx/math/Quaternion;->w:F */
} // .end method
public com.badlogic.gdx.math.Quaternion mul ( com.badlogic.gdx.math.Quaternion p0 ) {
/* .locals 6 */
/* iget v0, p0, Lcom/badlogic/gdx/math/Quaternion;->w:F */
/* iget v1, p1, Lcom/badlogic/gdx/math/Quaternion;->x:F */
/* mul-float/2addr v0, v1 */
/* iget v1, p0, Lcom/badlogic/gdx/math/Quaternion;->x:F */
/* iget v2, p1, Lcom/badlogic/gdx/math/Quaternion;->w:F */
/* mul-float/2addr v1, v2 */
/* add-float/2addr v0, v1 */
/* iget v1, p0, Lcom/badlogic/gdx/math/Quaternion;->y:F */
/* iget v2, p1, Lcom/badlogic/gdx/math/Quaternion;->z:F */
/* mul-float/2addr v1, v2 */
/* add-float/2addr v0, v1 */
/* iget v1, p0, Lcom/badlogic/gdx/math/Quaternion;->z:F */
/* iget v2, p1, Lcom/badlogic/gdx/math/Quaternion;->y:F */
/* mul-float/2addr v1, v2 */
/* sub-float/2addr v0, v1 */
/* iget v1, p0, Lcom/badlogic/gdx/math/Quaternion;->w:F */
/* iget v2, p1, Lcom/badlogic/gdx/math/Quaternion;->y:F */
/* mul-float/2addr v1, v2 */
/* iget v2, p0, Lcom/badlogic/gdx/math/Quaternion;->y:F */
/* iget v3, p1, Lcom/badlogic/gdx/math/Quaternion;->w:F */
/* mul-float/2addr v2, v3 */
/* add-float/2addr v1, v2 */
/* iget v2, p0, Lcom/badlogic/gdx/math/Quaternion;->z:F */
/* iget v3, p1, Lcom/badlogic/gdx/math/Quaternion;->x:F */
/* mul-float/2addr v2, v3 */
/* add-float/2addr v1, v2 */
/* iget v2, p0, Lcom/badlogic/gdx/math/Quaternion;->x:F */
/* iget v3, p1, Lcom/badlogic/gdx/math/Quaternion;->z:F */
/* mul-float/2addr v2, v3 */
/* sub-float/2addr v1, v2 */
/* iget v2, p0, Lcom/badlogic/gdx/math/Quaternion;->w:F */
/* iget v3, p1, Lcom/badlogic/gdx/math/Quaternion;->z:F */
/* mul-float/2addr v2, v3 */
/* iget v3, p0, Lcom/badlogic/gdx/math/Quaternion;->z:F */
/* iget v4, p1, Lcom/badlogic/gdx/math/Quaternion;->w:F */
/* mul-float/2addr v3, v4 */
/* add-float/2addr v2, v3 */
/* iget v3, p0, Lcom/badlogic/gdx/math/Quaternion;->x:F */
/* iget v4, p1, Lcom/badlogic/gdx/math/Quaternion;->y:F */
/* mul-float/2addr v3, v4 */
/* add-float/2addr v2, v3 */
/* iget v3, p0, Lcom/badlogic/gdx/math/Quaternion;->y:F */
/* iget v4, p1, Lcom/badlogic/gdx/math/Quaternion;->x:F */
/* mul-float/2addr v3, v4 */
/* sub-float/2addr v2, v3 */
/* iget v3, p0, Lcom/badlogic/gdx/math/Quaternion;->w:F */
/* iget v4, p1, Lcom/badlogic/gdx/math/Quaternion;->w:F */
/* mul-float/2addr v3, v4 */
/* iget v4, p0, Lcom/badlogic/gdx/math/Quaternion;->x:F */
/* iget v5, p1, Lcom/badlogic/gdx/math/Quaternion;->x:F */
/* mul-float/2addr v4, v5 */
/* sub-float/2addr v3, v4 */
/* iget v4, p0, Lcom/badlogic/gdx/math/Quaternion;->y:F */
/* iget v5, p1, Lcom/badlogic/gdx/math/Quaternion;->y:F */
/* mul-float/2addr v4, v5 */
/* sub-float/2addr v3, v4 */
/* iget v4, p0, Lcom/badlogic/gdx/math/Quaternion;->z:F */
/* iget v5, p1, Lcom/badlogic/gdx/math/Quaternion;->z:F */
/* mul-float/2addr v4, v5 */
/* sub-float/2addr v3, v4 */
/* iput v0, p0, Lcom/badlogic/gdx/math/Quaternion;->x:F */
/* iput v1, p0, Lcom/badlogic/gdx/math/Quaternion;->y:F */
/* iput v2, p0, Lcom/badlogic/gdx/math/Quaternion;->z:F */
/* iput v3, p0, Lcom/badlogic/gdx/math/Quaternion;->w:F */
} // .end method
public com.badlogic.gdx.math.Quaternion mulLeft ( com.badlogic.gdx.math.Quaternion p0 ) {
/* .locals 6 */
/* iget v0, p1, Lcom/badlogic/gdx/math/Quaternion;->w:F */
/* iget v1, p0, Lcom/badlogic/gdx/math/Quaternion;->x:F */
/* mul-float/2addr v0, v1 */
/* iget v1, p1, Lcom/badlogic/gdx/math/Quaternion;->x:F */
/* iget v2, p0, Lcom/badlogic/gdx/math/Quaternion;->w:F */
/* mul-float/2addr v1, v2 */
/* add-float/2addr v0, v1 */
/* iget v1, p1, Lcom/badlogic/gdx/math/Quaternion;->y:F */
/* iget v2, p0, Lcom/badlogic/gdx/math/Quaternion;->z:F */
/* mul-float/2addr v1, v2 */
/* add-float/2addr v0, v1 */
/* iget v1, p1, Lcom/badlogic/gdx/math/Quaternion;->z:F */
/* iget v2, p0, Lcom/badlogic/gdx/math/Quaternion;->y:F */
/* mul-float/2addr v1, v2 */
/* sub-float/2addr v0, v1 */
/* iget v1, p1, Lcom/badlogic/gdx/math/Quaternion;->w:F */
/* iget v2, p0, Lcom/badlogic/gdx/math/Quaternion;->y:F */
/* mul-float/2addr v1, v2 */
/* iget v2, p1, Lcom/badlogic/gdx/math/Quaternion;->y:F */
/* iget v3, p0, Lcom/badlogic/gdx/math/Quaternion;->w:F */
/* mul-float/2addr v2, v3 */
/* add-float/2addr v1, v2 */
/* iget v2, p1, Lcom/badlogic/gdx/math/Quaternion;->z:F */
/* iget v3, p0, Lcom/badlogic/gdx/math/Quaternion;->x:F */
/* mul-float/2addr v2, v3 */
/* add-float/2addr v1, v2 */
/* iget v2, p1, Lcom/badlogic/gdx/math/Quaternion;->x:F */
/* iget v3, p0, Lcom/badlogic/gdx/math/Quaternion;->z:F */
/* mul-float/2addr v2, v3 */
/* sub-float/2addr v1, v2 */
/* iget v2, p1, Lcom/badlogic/gdx/math/Quaternion;->w:F */
/* iget v3, p0, Lcom/badlogic/gdx/math/Quaternion;->z:F */
/* mul-float/2addr v2, v3 */
/* iget v3, p1, Lcom/badlogic/gdx/math/Quaternion;->z:F */
/* iget v4, p0, Lcom/badlogic/gdx/math/Quaternion;->w:F */
/* mul-float/2addr v3, v4 */
/* add-float/2addr v2, v3 */
/* iget v3, p1, Lcom/badlogic/gdx/math/Quaternion;->x:F */
/* iget v4, p0, Lcom/badlogic/gdx/math/Quaternion;->y:F */
/* mul-float/2addr v3, v4 */
/* add-float/2addr v2, v3 */
/* iget v3, p1, Lcom/badlogic/gdx/math/Quaternion;->y:F */
/* iget v4, p0, Lcom/badlogic/gdx/math/Quaternion;->x:F */
/* mul-float/2addr v3, v4 */
/* sub-float/2addr v2, v3 */
/* iget v3, p1, Lcom/badlogic/gdx/math/Quaternion;->w:F */
/* iget v4, p0, Lcom/badlogic/gdx/math/Quaternion;->w:F */
/* mul-float/2addr v3, v4 */
/* iget v4, p1, Lcom/badlogic/gdx/math/Quaternion;->x:F */
/* iget v5, p0, Lcom/badlogic/gdx/math/Quaternion;->x:F */
/* mul-float/2addr v4, v5 */
/* sub-float/2addr v3, v4 */
/* iget v4, p1, Lcom/badlogic/gdx/math/Quaternion;->y:F */
/* iget v5, p0, Lcom/badlogic/gdx/math/Quaternion;->y:F */
/* mul-float/2addr v4, v5 */
/* sub-float/2addr v3, v4 */
/* iget v4, p1, Lcom/badlogic/gdx/math/Quaternion;->z:F */
/* iget v5, p0, Lcom/badlogic/gdx/math/Quaternion;->z:F */
/* mul-float/2addr v4, v5 */
/* sub-float/2addr v3, v4 */
/* iput v0, p0, Lcom/badlogic/gdx/math/Quaternion;->x:F */
/* iput v1, p0, Lcom/badlogic/gdx/math/Quaternion;->y:F */
/* iput v2, p0, Lcom/badlogic/gdx/math/Quaternion;->z:F */
/* iput v3, p0, Lcom/badlogic/gdx/math/Quaternion;->w:F */
} // .end method
public com.badlogic.gdx.math.Quaternion nor ( ) {
/* .locals 3 */
v0 = (( com.badlogic.gdx.math.Quaternion ) p0 ).len2 ( ); // invoke-virtual {p0}, Lcom/badlogic/gdx/math/Quaternion;->len2()F
int v1 = 0; // const/4 v1, 0x0
/* cmpl-float v1, v0, v1 */
if ( v1 != null) { // if-eqz v1, :cond_0
/* const/high16 v1, 0x3f800000 # 1.0f */
/* sub-float v1, v0, v1 */
v1 = java.lang.Math .abs ( v1 );
/* const v2, 0x3727c5ac # 1.0E-5f */
/* cmpl-float v1, v1, v2 */
/* if-lez v1, :cond_0 */
/* float-to-double v0, v0 */
java.lang.Math .sqrt ( v0,v1 );
/* move-result-wide v0 */
/* double-to-float v0, v0 */
/* iget v1, p0, Lcom/badlogic/gdx/math/Quaternion;->w:F */
/* div-float/2addr v1, v0 */
/* iput v1, p0, Lcom/badlogic/gdx/math/Quaternion;->w:F */
/* iget v1, p0, Lcom/badlogic/gdx/math/Quaternion;->x:F */
/* div-float/2addr v1, v0 */
/* iput v1, p0, Lcom/badlogic/gdx/math/Quaternion;->x:F */
/* iget v1, p0, Lcom/badlogic/gdx/math/Quaternion;->y:F */
/* div-float/2addr v1, v0 */
/* iput v1, p0, Lcom/badlogic/gdx/math/Quaternion;->y:F */
/* iget v1, p0, Lcom/badlogic/gdx/math/Quaternion;->z:F */
/* div-float v0, v1, v0 */
/* iput v0, p0, Lcom/badlogic/gdx/math/Quaternion;->z:F */
} // :cond_0
} // .end method
public com.badlogic.gdx.math.Quaternion set ( Float p0, Float p1, Float p2, Float p3 ) {
/* .locals 0 */
/* iput p1, p0, Lcom/badlogic/gdx/math/Quaternion;->x:F */
/* iput p2, p0, Lcom/badlogic/gdx/math/Quaternion;->y:F */
/* iput p3, p0, Lcom/badlogic/gdx/math/Quaternion;->z:F */
/* iput p4, p0, Lcom/badlogic/gdx/math/Quaternion;->w:F */
} // .end method
public com.badlogic.gdx.math.Quaternion set ( com.badlogic.gdx.math.Quaternion p0 ) {
/* .locals 4 */
/* iget v0, p1, Lcom/badlogic/gdx/math/Quaternion;->x:F */
/* iget v1, p1, Lcom/badlogic/gdx/math/Quaternion;->y:F */
/* iget v2, p1, Lcom/badlogic/gdx/math/Quaternion;->z:F */
/* iget v3, p1, Lcom/badlogic/gdx/math/Quaternion;->w:F */
(( com.badlogic.gdx.math.Quaternion ) p0 ).set ( v0, v1, v2, v3 ); // invoke-virtual {p0, v0, v1, v2, v3}, Lcom/badlogic/gdx/math/Quaternion;->set(FFFF)Lcom/badlogic/gdx/math/Quaternion;
} // .end method
public com.badlogic.gdx.math.Quaternion set ( com.badlogic.gdx.math.Vector3 p0, Float p1 ) {
/* .locals 5 */
/* const/high16 v3, 0x40000000 # 2.0f */
/* float-to-double v0, p2 */
java.lang.Math .toRadians ( v0,v1 );
/* move-result-wide v0 */
/* double-to-float v0, v0 */
/* div-float v1, v0, v3 */
/* float-to-double v1, v1 */
java.lang.Math .sin ( v1,v2 );
/* move-result-wide v1 */
/* double-to-float v1, v1 */
/* div-float/2addr v0, v3 */
/* float-to-double v2, v0 */
java.lang.Math .cos ( v2,v3 );
/* move-result-wide v2 */
/* double-to-float v0, v2 */
/* iget v2, p1, Lcom/badlogic/gdx/math/Vector3;->x:F */
/* mul-float/2addr v2, v1 */
/* iget v3, p1, Lcom/badlogic/gdx/math/Vector3;->y:F */
/* mul-float/2addr v3, v1 */
/* iget v4, p1, Lcom/badlogic/gdx/math/Vector3;->z:F */
/* mul-float/2addr v1, v4 */
(( com.badlogic.gdx.math.Quaternion ) p0 ).set ( v2, v3, v1, v0 ); // invoke-virtual {p0, v2, v3, v1, v0}, Lcom/badlogic/gdx/math/Quaternion;->set(FFFF)Lcom/badlogic/gdx/math/Quaternion;
(( com.badlogic.gdx.math.Quaternion ) v0 ).nor ( ); // invoke-virtual {v0}, Lcom/badlogic/gdx/math/Quaternion;->nor()Lcom/badlogic/gdx/math/Quaternion;
} // .end method
public com.badlogic.gdx.math.Quaternion setEulerAngles ( Float p0, Float p1, Float p2 ) {
/* .locals 8 */
/* const/high16 v7, 0x3f000000 # 0.5f */
/* float-to-double v0, p1 */
java.lang.Math .toRadians ( v0,v1 );
/* move-result-wide v0 */
/* double-to-float v0, v0 */
/* float-to-double v1, p2 */
java.lang.Math .toRadians ( v1,v2 );
/* move-result-wide v1 */
/* double-to-float v1, v1 */
/* float-to-double v2, p3 */
java.lang.Math .toRadians ( v2,v3 );
/* move-result-wide v2 */
/* double-to-float v2, v2 */
/* mul-float/2addr v2, v7 */
/* float-to-double v3, v2 */
java.lang.Math .sin ( v3,v4 );
/* move-result-wide v3 */
/* double-to-float v3, v3 */
/* float-to-double v4, v2 */
java.lang.Math .cos ( v4,v5 );
/* move-result-wide v4 */
/* double-to-float v2, v4 */
/* mul-float/2addr v1, v7 */
/* float-to-double v4, v1 */
java.lang.Math .sin ( v4,v5 );
/* move-result-wide v4 */
/* double-to-float v4, v4 */
/* float-to-double v5, v1 */
java.lang.Math .cos ( v5,v6 );
/* move-result-wide v5 */
/* double-to-float v1, v5 */
/* mul-float/2addr v0, v7 */
/* float-to-double v5, v0 */
java.lang.Math .sin ( v5,v6 );
/* move-result-wide v5 */
/* double-to-float v5, v5 */
/* float-to-double v6, v0 */
java.lang.Math .cos ( v6,v7 );
/* move-result-wide v6 */
/* double-to-float v0, v6 */
/* mul-float v6, v0, v4 */
/* mul-float/2addr v6, v2 */
/* mul-float v7, v5, v1 */
/* mul-float/2addr v7, v3 */
/* add-float/2addr v6, v7 */
/* iput v6, p0, Lcom/badlogic/gdx/math/Quaternion;->x:F */
/* mul-float v6, v5, v1 */
/* mul-float/2addr v6, v2 */
/* mul-float v7, v0, v4 */
/* mul-float/2addr v7, v3 */
/* sub-float/2addr v6, v7 */
/* iput v6, p0, Lcom/badlogic/gdx/math/Quaternion;->y:F */
/* mul-float v6, v0, v1 */
/* mul-float/2addr v6, v3 */
/* mul-float v7, v5, v4 */
/* mul-float/2addr v7, v2 */
/* sub-float/2addr v6, v7 */
/* iput v6, p0, Lcom/badlogic/gdx/math/Quaternion;->z:F */
/* mul-float/2addr v0, v1 */
/* mul-float/2addr v0, v2 */
/* mul-float v1, v5, v4 */
/* mul-float/2addr v1, v3 */
/* add-float/2addr v0, v1 */
/* iput v0, p0, Lcom/badlogic/gdx/math/Quaternion;->w:F */
} // .end method
public com.badlogic.gdx.math.Quaternion setFromAxes ( Float p0, Float p1, Float p2, Float p3, Float p4, Float p5, Float p6, Float p7, Float p8 ) {
/* .locals 19 */
/* add-float v5, p1, p5 */
/* add-float v5, v5, p9 */
int v6 = 0; // const/4 v6, 0x0
/* cmpl-float v6, v5, v6 */
/* if-ltz v6, :cond_0 */
/* const/high16 v6, 0x3f800000 # 1.0f */
/* add-float/2addr v5, v6 */
/* float-to-double v5, v5 */
java.lang.Math .sqrt ( v5,v6 );
/* move-result-wide v5 */
/* const-wide/high16 v7, 0x3fe0000000000000L # 0.5 */
/* mul-double/2addr v7, v5 */
/* const-wide/high16 v9, 0x3fe0000000000000L # 0.5 */
/* div-double v5, v9, v5 */
/* sub-float v9, p6, p8 */
/* float-to-double v9, v9 */
/* mul-double/2addr v9, v5 */
/* sub-float v11, p7, p3 */
/* float-to-double v11, v11 */
/* mul-double/2addr v11, v5 */
/* sub-float v13, p2, p4 */
/* float-to-double v13, v13 */
/* mul-double/2addr v5, v13 */
/* move-wide v15, v7 */
/* move-wide v7, v5 */
/* move-wide v5, v15 */
/* move-wide/from16 v17, v11 */
/* move-wide v11, v9 */
/* move-wide/from16 v9, v17 */
} // :goto_0
/* double-to-float v11, v11 */
/* double-to-float v9, v9 */
/* double-to-float v7, v7 */
/* double-to-float v5, v5 */
/* move-object/from16 v0, p0 */
/* move v1, v11 */
/* move v2, v9 */
/* move v3, v7 */
/* move v4, v5 */
(( com.badlogic.gdx.math.Quaternion ) v0 ).set ( v1, v2, v3, v4 ); // invoke-virtual {v0, v1, v2, v3, v4}, Lcom/badlogic/gdx/math/Quaternion;->set(FFFF)Lcom/badlogic/gdx/math/Quaternion;
} // :cond_0
/* cmpl-float v5, p1, p5 */
/* if-lez v5, :cond_1 */
/* cmpl-float v5, p1, p9 */
/* if-lez v5, :cond_1 */
/* const-wide/high16 v5, 0x3ff0000000000000L # 1.0 */
/* move/from16 v0, p1 */
/* float-to-double v0, v0 */
/* move-wide v7, v0 */
/* add-double/2addr v5, v7 */
/* move/from16 v0, p5 */
/* float-to-double v0, v0 */
/* move-wide v7, v0 */
/* sub-double/2addr v5, v7 */
/* move/from16 v0, p9 */
/* float-to-double v0, v0 */
/* move-wide v7, v0 */
/* sub-double/2addr v5, v7 */
java.lang.Math .sqrt ( v5,v6 );
/* move-result-wide v5 */
/* const-wide/high16 v7, 0x3fe0000000000000L # 0.5 */
/* mul-double/2addr v7, v5 */
/* const-wide/high16 v9, 0x3fe0000000000000L # 0.5 */
/* div-double v5, v9, v5 */
/* add-float v9, p2, p4 */
/* float-to-double v9, v9 */
/* mul-double/2addr v9, v5 */
/* add-float v11, p7, p3 */
/* float-to-double v11, v11 */
/* mul-double/2addr v11, v5 */
/* sub-float v13, p6, p8 */
/* float-to-double v13, v13 */
/* mul-double/2addr v5, v13 */
/* move-wide v15, v11 */
/* move-wide v11, v7 */
/* move-wide v7, v15 */
} // :cond_1
/* cmpl-float v5, p5, p9 */
/* if-lez v5, :cond_2 */
/* const-wide/high16 v5, 0x3ff0000000000000L # 1.0 */
/* move/from16 v0, p5 */
/* float-to-double v0, v0 */
/* move-wide v7, v0 */
/* add-double/2addr v5, v7 */
/* move/from16 v0, p1 */
/* float-to-double v0, v0 */
/* move-wide v7, v0 */
/* sub-double/2addr v5, v7 */
/* move/from16 v0, p9 */
/* float-to-double v0, v0 */
/* move-wide v7, v0 */
/* sub-double/2addr v5, v7 */
java.lang.Math .sqrt ( v5,v6 );
/* move-result-wide v5 */
/* const-wide/high16 v7, 0x3fe0000000000000L # 0.5 */
/* mul-double/2addr v7, v5 */
/* const-wide/high16 v9, 0x3fe0000000000000L # 0.5 */
/* div-double v5, v9, v5 */
/* add-float v9, p2, p4 */
/* float-to-double v9, v9 */
/* mul-double/2addr v9, v5 */
/* add-float v11, p6, p8 */
/* float-to-double v11, v11 */
/* mul-double/2addr v11, v5 */
/* sub-float v13, p7, p3 */
/* float-to-double v13, v13 */
/* mul-double/2addr v5, v13 */
/* move-wide v15, v11 */
/* move-wide v11, v9 */
/* move-wide v9, v7 */
/* move-wide v7, v15 */
} // :cond_2
/* const-wide/high16 v5, 0x3ff0000000000000L # 1.0 */
/* move/from16 v0, p9 */
/* float-to-double v0, v0 */
/* move-wide v7, v0 */
/* add-double/2addr v5, v7 */
/* move/from16 v0, p1 */
/* float-to-double v0, v0 */
/* move-wide v7, v0 */
/* sub-double/2addr v5, v7 */
/* move/from16 v0, p5 */
/* float-to-double v0, v0 */
/* move-wide v7, v0 */
/* sub-double/2addr v5, v7 */
java.lang.Math .sqrt ( v5,v6 );
/* move-result-wide v5 */
/* const-wide/high16 v7, 0x3fe0000000000000L # 0.5 */
/* mul-double/2addr v7, v5 */
/* const-wide/high16 v9, 0x3fe0000000000000L # 0.5 */
/* div-double v5, v9, v5 */
/* add-float v9, p7, p3 */
/* float-to-double v9, v9 */
/* mul-double/2addr v9, v5 */
/* add-float v11, p6, p8 */
/* float-to-double v11, v11 */
/* mul-double/2addr v11, v5 */
/* sub-float v13, p2, p4 */
/* float-to-double v13, v13 */
/* mul-double/2addr v5, v13 */
/* move-wide v15, v11 */
/* move-wide v11, v9 */
/* move-wide v9, v15 */
/* goto/16 :goto_0 */
} // .end method
public com.badlogic.gdx.math.Quaternion setFromAxis ( Float p0, Float p1, Float p2, Float p3 ) {
/* .locals 4 */
/* const/high16 v2, 0x40000000 # 2.0f */
/* const v0, 0x3c8efa35 */
/* mul-float/2addr v0, p4 */
/* div-float v1, v0, v2 */
v1 = com.badlogic.gdx.math.MathUtils .sin ( v1 );
/* div-float/2addr v0, v2 */
v0 = com.badlogic.gdx.math.MathUtils .cos ( v0 );
/* mul-float v2, p1, v1 */
/* mul-float v3, p2, v1 */
/* mul-float/2addr v1, p3 */
(( com.badlogic.gdx.math.Quaternion ) p0 ).set ( v2, v3, v1, v0 ); // invoke-virtual {p0, v2, v3, v1, v0}, Lcom/badlogic/gdx/math/Quaternion;->set(FFFF)Lcom/badlogic/gdx/math/Quaternion;
(( com.badlogic.gdx.math.Quaternion ) v0 ).nor ( ); // invoke-virtual {v0}, Lcom/badlogic/gdx/math/Quaternion;->nor()Lcom/badlogic/gdx/math/Quaternion;
} // .end method
public com.badlogic.gdx.math.Quaternion setFromAxis ( com.badlogic.gdx.math.Vector3 p0, Float p1 ) {
/* .locals 3 */
/* iget v0, p1, Lcom/badlogic/gdx/math/Vector3;->x:F */
/* iget v1, p1, Lcom/badlogic/gdx/math/Vector3;->y:F */
/* iget v2, p1, Lcom/badlogic/gdx/math/Vector3;->z:F */
(( com.badlogic.gdx.math.Quaternion ) p0 ).setFromAxis ( v0, v1, v2, p2 ); // invoke-virtual {p0, v0, v1, v2, p2}, Lcom/badlogic/gdx/math/Quaternion;->setFromAxis(FFFF)Lcom/badlogic/gdx/math/Quaternion;
} // .end method
public com.badlogic.gdx.math.Quaternion setFromMatrix ( com.badlogic.gdx.math.Matrix4 p0 ) {
/* .locals 10 */
v0 = this.val;
int v1 = 0; // const/4 v1, 0x0
/* aget v1, v0, v1 */
v0 = this.val;
int v2 = 4; // const/4 v2, 0x4
/* aget v2, v0, v2 */
v0 = this.val;
/* const/16 v3, 0x8 */
/* aget v3, v0, v3 */
v0 = this.val;
int v4 = 1; // const/4 v4, 0x1
/* aget v4, v0, v4 */
v0 = this.val;
int v5 = 5; // const/4 v5, 0x5
/* aget v5, v0, v5 */
v0 = this.val;
/* const/16 v6, 0x9 */
/* aget v6, v0, v6 */
v0 = this.val;
int v7 = 2; // const/4 v7, 0x2
/* aget v7, v0, v7 */
v0 = this.val;
int v8 = 6; // const/4 v8, 0x6
/* aget v8, v0, v8 */
v0 = this.val;
/* const/16 v9, 0xa */
/* aget v9, v0, v9 */
/* move-object v0, p0 */
/* invoke-virtual/range {v0 ..v9}, Lcom/badlogic/gdx/math/Quaternion;->setFromAxes(FFFFFFFFF)Lcom/badlogic/gdx/math/Quaternion; */
} // .end method
public com.badlogic.gdx.math.Quaternion slerp ( com.badlogic.gdx.math.Quaternion p0, Float p1 ) {
/* .locals 9 */
/* const/high16 v5, 0x3f800000 # 1.0f */
v0 = (( com.badlogic.gdx.math.Quaternion ) p0 ).equals ( p1 ); // invoke-virtual {p0, p1}, Lcom/badlogic/gdx/math/Quaternion;->equals(Ljava/lang/Object;)Z
if ( v0 != null) { // if-eqz v0, :cond_0
/* move-object v0, p0 */
} // :goto_0
} // :cond_0
v0 = (( com.badlogic.gdx.math.Quaternion ) p0 ).dot ( p1 ); // invoke-virtual {p0, p1}, Lcom/badlogic/gdx/math/Quaternion;->dot(Lcom/badlogic/gdx/math/Quaternion;)F
/* float-to-double v1, v0 */
/* const-wide/16 v3, 0x0 */
/* cmpg-double v1, v1, v3 */
/* if-gez v1, :cond_1 */
/* const/high16 v1, -0x40800000 # -1.0f */
(( com.badlogic.gdx.math.Quaternion ) p1 ).mul ( v1 ); // invoke-virtual {p1, v1}, Lcom/badlogic/gdx/math/Quaternion;->mul(F)Lcom/badlogic/gdx/math/Quaternion;
/* neg-float v0, v0 */
} // :cond_1
/* sub-float v1, v5, p2 */
/* sub-float v2, v5, v0 */
/* float-to-double v2, v2 */
/* const-wide v4, 0x3fb999999999999aL # 0.1 */
/* cmpl-double v2, v2, v4 */
/* if-lez v2, :cond_2 */
/* float-to-double v2, v0 */
java.lang.Math .acos ( v2,v3 );
/* move-result-wide v2 */
/* const-wide/high16 v4, 0x3ff0000000000000L # 1.0 */
java.lang.Math .sin ( v2,v3 );
/* move-result-wide v6 */
/* div-double/2addr v4, v6 */
/* float-to-double v0, v1 */
/* mul-double/2addr v0, v2 */
java.lang.Math .sin ( v0,v1 );
/* move-result-wide v0 */
/* mul-double/2addr v0, v4 */
/* double-to-float v0, v0 */
/* float-to-double v6, p2 */
/* mul-double v1, v6, v2 */
java.lang.Math .sin ( v1,v2 );
/* move-result-wide v1 */
/* mul-double/2addr v1, v4 */
/* double-to-float v1, v1 */
/* move v8, v1 */
/* move v1, v0 */
/* move v0, v8 */
} // :goto_1
/* iget v2, p0, Lcom/badlogic/gdx/math/Quaternion;->x:F */
/* mul-float/2addr v2, v1 */
/* iget v3, p1, Lcom/badlogic/gdx/math/Quaternion;->x:F */
/* mul-float/2addr v3, v0 */
/* add-float/2addr v2, v3 */
/* iget v3, p0, Lcom/badlogic/gdx/math/Quaternion;->y:F */
/* mul-float/2addr v3, v1 */
/* iget v4, p1, Lcom/badlogic/gdx/math/Quaternion;->y:F */
/* mul-float/2addr v4, v0 */
/* add-float/2addr v3, v4 */
/* iget v4, p0, Lcom/badlogic/gdx/math/Quaternion;->z:F */
/* mul-float/2addr v4, v1 */
/* iget v5, p1, Lcom/badlogic/gdx/math/Quaternion;->z:F */
/* mul-float/2addr v5, v0 */
/* add-float/2addr v4, v5 */
/* iget v5, p0, Lcom/badlogic/gdx/math/Quaternion;->w:F */
/* mul-float/2addr v1, v5 */
/* iget v5, p1, Lcom/badlogic/gdx/math/Quaternion;->w:F */
/* mul-float/2addr v0, v5 */
/* add-float/2addr v0, v1 */
(( com.badlogic.gdx.math.Quaternion ) p0 ).set ( v2, v3, v4, v0 ); // invoke-virtual {p0, v2, v3, v4, v0}, Lcom/badlogic/gdx/math/Quaternion;->set(FFFF)Lcom/badlogic/gdx/math/Quaternion;
/* move-object v0, p0 */
} // :cond_2
/* move v0, p2 */
} // .end method
public void toMatrix ( Float[] p0 ) {
/* .locals 14 */
/* const/high16 v13, 0x3f800000 # 1.0f */
int v12 = 0; // const/4 v12, 0x0
/* const/high16 v11, 0x40000000 # 2.0f */
/* iget v0, p0, Lcom/badlogic/gdx/math/Quaternion;->x:F */
/* iget v1, p0, Lcom/badlogic/gdx/math/Quaternion;->x:F */
/* mul-float/2addr v0, v1 */
/* iget v1, p0, Lcom/badlogic/gdx/math/Quaternion;->x:F */
/* iget v2, p0, Lcom/badlogic/gdx/math/Quaternion;->y:F */
/* mul-float/2addr v1, v2 */
/* iget v2, p0, Lcom/badlogic/gdx/math/Quaternion;->x:F */
/* iget v3, p0, Lcom/badlogic/gdx/math/Quaternion;->z:F */
/* mul-float/2addr v2, v3 */
/* iget v3, p0, Lcom/badlogic/gdx/math/Quaternion;->x:F */
/* iget v4, p0, Lcom/badlogic/gdx/math/Quaternion;->w:F */
/* mul-float/2addr v3, v4 */
/* iget v4, p0, Lcom/badlogic/gdx/math/Quaternion;->y:F */
/* iget v5, p0, Lcom/badlogic/gdx/math/Quaternion;->y:F */
/* mul-float/2addr v4, v5 */
/* iget v5, p0, Lcom/badlogic/gdx/math/Quaternion;->y:F */
/* iget v6, p0, Lcom/badlogic/gdx/math/Quaternion;->z:F */
/* mul-float/2addr v5, v6 */
/* iget v6, p0, Lcom/badlogic/gdx/math/Quaternion;->y:F */
/* iget v7, p0, Lcom/badlogic/gdx/math/Quaternion;->w:F */
/* mul-float/2addr v6, v7 */
/* iget v7, p0, Lcom/badlogic/gdx/math/Quaternion;->z:F */
/* iget v8, p0, Lcom/badlogic/gdx/math/Quaternion;->z:F */
/* mul-float/2addr v7, v8 */
/* iget v8, p0, Lcom/badlogic/gdx/math/Quaternion;->z:F */
/* iget v9, p0, Lcom/badlogic/gdx/math/Quaternion;->w:F */
/* mul-float/2addr v8, v9 */
int v9 = 0; // const/4 v9, 0x0
/* add-float v10, v4, v7 */
/* mul-float/2addr v10, v11 */
/* sub-float v10, v13, v10 */
/* aput v10, p1, v9 */
int v9 = 4; // const/4 v9, 0x4
/* sub-float v10, v1, v8 */
/* mul-float/2addr v10, v11 */
/* aput v10, p1, v9 */
/* const/16 v9, 0x8 */
/* add-float v10, v2, v6 */
/* mul-float/2addr v10, v11 */
/* aput v10, p1, v9 */
/* const/16 v9, 0xc */
/* aput v12, p1, v9 */
int v9 = 1; // const/4 v9, 0x1
/* add-float/2addr v1, v8 */
/* mul-float/2addr v1, v11 */
/* aput v1, p1, v9 */
int v1 = 5; // const/4 v1, 0x5
/* add-float/2addr v7, v0 */
/* mul-float/2addr v7, v11 */
/* sub-float v7, v13, v7 */
/* aput v7, p1, v1 */
/* const/16 v1, 0x9 */
/* sub-float v7, v5, v3 */
/* mul-float/2addr v7, v11 */
/* aput v7, p1, v1 */
/* const/16 v1, 0xd */
/* aput v12, p1, v1 */
int v1 = 2; // const/4 v1, 0x2
/* sub-float/2addr v2, v6 */
/* mul-float/2addr v2, v11 */
/* aput v2, p1, v1 */
int v1 = 6; // const/4 v1, 0x6
/* add-float v2, v5, v3 */
/* mul-float/2addr v2, v11 */
/* aput v2, p1, v1 */
/* const/16 v1, 0xa */
/* add-float/2addr v0, v4 */
/* mul-float/2addr v0, v11 */
/* sub-float v0, v13, v0 */
/* aput v0, p1, v1 */
/* const/16 v0, 0xe */
/* aput v12, p1, v0 */
int v0 = 3; // const/4 v0, 0x3
/* aput v12, p1, v0 */
int v0 = 7; // const/4 v0, 0x7
/* aput v12, p1, v0 */
/* const/16 v0, 0xb */
/* aput v12, p1, v0 */
/* const/16 v0, 0xf */
/* aput v13, p1, v0 */
return;
} // .end method
public java.lang.String toString ( ) {
/* .locals 3 */
final String v2 = "|"; // const-string v2, "|"
/* new-instance v0, Ljava/lang/StringBuilder; */
/* invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V */
final String v1 = "["; // const-string v1, "["
(( java.lang.StringBuilder ) v0 ).append ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
/* iget v1, p0, Lcom/badlogic/gdx/math/Quaternion;->x:F */
(( java.lang.StringBuilder ) v0 ).append ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;
final String v1 = "|"; // const-string v1, "|"
(( java.lang.StringBuilder ) v0 ).append ( v2 ); // invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
/* iget v1, p0, Lcom/badlogic/gdx/math/Quaternion;->y:F */
(( java.lang.StringBuilder ) v0 ).append ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;
final String v1 = "|"; // const-string v1, "|"
(( java.lang.StringBuilder ) v0 ).append ( v2 ); // invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
/* iget v1, p0, Lcom/badlogic/gdx/math/Quaternion;->z:F */
(( java.lang.StringBuilder ) v0 ).append ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;
final String v1 = "|"; // const-string v1, "|"
(( java.lang.StringBuilder ) v0 ).append ( v2 ); // invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
/* iget v1, p0, Lcom/badlogic/gdx/math/Quaternion;->w:F */
(( java.lang.StringBuilder ) v0 ).append ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;
final String v1 = "]"; // const-string v1, "]"
(( java.lang.StringBuilder ) v0 ).append ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v0 ).toString ( ); // invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
} // .end method
public void transform ( com.badlogic.gdx.math.Vector3 p0 ) {
/* .locals 6 */
v0 = com.badlogic.gdx.math.Quaternion.tmp2;
(( com.badlogic.gdx.math.Quaternion ) v0 ).set ( p0 ); // invoke-virtual {v0, p0}, Lcom/badlogic/gdx/math/Quaternion;->set(Lcom/badlogic/gdx/math/Quaternion;)Lcom/badlogic/gdx/math/Quaternion;
v0 = com.badlogic.gdx.math.Quaternion.tmp2;
(( com.badlogic.gdx.math.Quaternion ) v0 ).conjugate ( ); // invoke-virtual {v0}, Lcom/badlogic/gdx/math/Quaternion;->conjugate()Lcom/badlogic/gdx/math/Quaternion;
v0 = com.badlogic.gdx.math.Quaternion.tmp2;
v1 = com.badlogic.gdx.math.Quaternion.tmp1;
/* iget v2, p1, Lcom/badlogic/gdx/math/Vector3;->x:F */
/* iget v3, p1, Lcom/badlogic/gdx/math/Vector3;->y:F */
/* iget v4, p1, Lcom/badlogic/gdx/math/Vector3;->z:F */
int v5 = 0; // const/4 v5, 0x0
(( com.badlogic.gdx.math.Quaternion ) v1 ).set ( v2, v3, v4, v5 ); // invoke-virtual {v1, v2, v3, v4, v5}, Lcom/badlogic/gdx/math/Quaternion;->set(FFFF)Lcom/badlogic/gdx/math/Quaternion;
(( com.badlogic.gdx.math.Quaternion ) v0 ).mulLeft ( v1 ); // invoke-virtual {v0, v1}, Lcom/badlogic/gdx/math/Quaternion;->mulLeft(Lcom/badlogic/gdx/math/Quaternion;)Lcom/badlogic/gdx/math/Quaternion;
(( com.badlogic.gdx.math.Quaternion ) v0 ).mulLeft ( p0 ); // invoke-virtual {v0, p0}, Lcom/badlogic/gdx/math/Quaternion;->mulLeft(Lcom/badlogic/gdx/math/Quaternion;)Lcom/badlogic/gdx/math/Quaternion;
v0 = com.badlogic.gdx.math.Quaternion.tmp2;
/* iget v0, v0, Lcom/badlogic/gdx/math/Quaternion;->x:F */
/* iput v0, p1, Lcom/badlogic/gdx/math/Vector3;->x:F */
v0 = com.badlogic.gdx.math.Quaternion.tmp2;
/* iget v0, v0, Lcom/badlogic/gdx/math/Quaternion;->y:F */
/* iput v0, p1, Lcom/badlogic/gdx/math/Vector3;->y:F */
v0 = com.badlogic.gdx.math.Quaternion.tmp2;
/* iget v0, v0, Lcom/badlogic/gdx/math/Quaternion;->z:F */
/* iput v0, p1, Lcom/badlogic/gdx/math/Vector3;->z:F */
return;
} // .end method
