public class com.badlogic.gdx.math.Vector3 implements java.io.Serializable {
	 /* # interfaces */
	 /* # static fields */
	 public static com.badlogic.gdx.math.Vector3 X;
	 public static com.badlogic.gdx.math.Vector3 Y;
	 public static com.badlogic.gdx.math.Vector3 Z;
	 private static final Long serialVersionUID;
	 private static com.badlogic.gdx.math.Vector3 tmp;
	 private static com.badlogic.gdx.math.Vector3 tmp2;
	 private static com.badlogic.gdx.math.Vector3 tmp3;
	 /* # instance fields */
	 public Float x;
	 public Float y;
	 public Float z;
	 /* # direct methods */
	 static com.badlogic.gdx.math.Vector3 ( ) {
		 /* .locals 3 */
		 /* const/high16 v2, 0x3f800000 # 1.0f */
		 int v1 = 0; // const/4 v1, 0x0
		 /* new-instance v0, Lcom/badlogic/gdx/math/Vector3; */
		 /* invoke-direct {v0}, Lcom/badlogic/gdx/math/Vector3;-><init>()V */
		 /* new-instance v0, Lcom/badlogic/gdx/math/Vector3; */
		 /* invoke-direct {v0}, Lcom/badlogic/gdx/math/Vector3;-><init>()V */
		 /* new-instance v0, Lcom/badlogic/gdx/math/Vector3; */
		 /* invoke-direct {v0}, Lcom/badlogic/gdx/math/Vector3;-><init>()V */
		 /* new-instance v0, Lcom/badlogic/gdx/math/Vector3; */
		 /* invoke-direct {v0, v2, v1, v1}, Lcom/badlogic/gdx/math/Vector3;-><init>(FFF)V */
		 /* new-instance v0, Lcom/badlogic/gdx/math/Vector3; */
		 /* invoke-direct {v0, v1, v2, v1}, Lcom/badlogic/gdx/math/Vector3;-><init>(FFF)V */
		 /* new-instance v0, Lcom/badlogic/gdx/math/Vector3; */
		 /* invoke-direct {v0, v1, v1, v2}, Lcom/badlogic/gdx/math/Vector3;-><init>(FFF)V */
		 return;
	 } // .end method
	 public com.badlogic.gdx.math.Vector3 ( ) {
		 /* .locals 0 */
		 /* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
		 return;
	 } // .end method
	 public com.badlogic.gdx.math.Vector3 ( ) {
		 /* .locals 0 */
		 /* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
		 (( com.badlogic.gdx.math.Vector3 ) p0 ).set ( p1, p2, p3 ); // invoke-virtual {p0, p1, p2, p3}, Lcom/badlogic/gdx/math/Vector3;->set(FFF)Lcom/badlogic/gdx/math/Vector3;
		 return;
	 } // .end method
	 public com.badlogic.gdx.math.Vector3 ( ) {
		 /* .locals 0 */
		 /* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
		 (( com.badlogic.gdx.math.Vector3 ) p0 ).set ( p1 ); // invoke-virtual {p0, p1}, Lcom/badlogic/gdx/math/Vector3;->set(Lcom/badlogic/gdx/math/Vector3;)Lcom/badlogic/gdx/math/Vector3;
		 return;
	 } // .end method
	 public com.badlogic.gdx.math.Vector3 ( ) {
		 /* .locals 3 */
		 /* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
		 int v0 = 0; // const/4 v0, 0x0
		 /* aget v0, p1, v0 */
		 int v1 = 1; // const/4 v1, 0x1
		 /* aget v1, p1, v1 */
		 int v2 = 2; // const/4 v2, 0x2
		 /* aget v2, p1, v2 */
		 (( com.badlogic.gdx.math.Vector3 ) p0 ).set ( v0, v1, v2 ); // invoke-virtual {p0, v0, v1, v2}, Lcom/badlogic/gdx/math/Vector3;->set(FFF)Lcom/badlogic/gdx/math/Vector3;
		 return;
	 } // .end method
	 /* # virtual methods */
	 public com.badlogic.gdx.math.Vector3 add ( Float p0 ) {
		 /* .locals 3 */
		 /* iget v0, p0, Lcom/badlogic/gdx/math/Vector3;->x:F */
		 /* add-float/2addr v0, p1 */
		 /* iget v1, p0, Lcom/badlogic/gdx/math/Vector3;->y:F */
		 /* add-float/2addr v1, p1 */
		 /* iget v2, p0, Lcom/badlogic/gdx/math/Vector3;->z:F */
		 /* add-float/2addr v2, p1 */
		 (( com.badlogic.gdx.math.Vector3 ) p0 ).set ( v0, v1, v2 ); // invoke-virtual {p0, v0, v1, v2}, Lcom/badlogic/gdx/math/Vector3;->set(FFF)Lcom/badlogic/gdx/math/Vector3;
	 } // .end method
	 public com.badlogic.gdx.math.Vector3 add ( Float p0, Float p1, Float p2 ) {
		 /* .locals 3 */
		 /* iget v0, p0, Lcom/badlogic/gdx/math/Vector3;->x:F */
		 /* add-float/2addr v0, p1 */
		 /* iget v1, p0, Lcom/badlogic/gdx/math/Vector3;->y:F */
		 /* add-float/2addr v1, p2 */
		 /* iget v2, p0, Lcom/badlogic/gdx/math/Vector3;->z:F */
		 /* add-float/2addr v2, p3 */
		 (( com.badlogic.gdx.math.Vector3 ) p0 ).set ( v0, v1, v2 ); // invoke-virtual {p0, v0, v1, v2}, Lcom/badlogic/gdx/math/Vector3;->set(FFF)Lcom/badlogic/gdx/math/Vector3;
	 } // .end method
	 public com.badlogic.gdx.math.Vector3 add ( com.badlogic.gdx.math.Vector3 p0 ) {
		 /* .locals 3 */
		 /* iget v0, p1, Lcom/badlogic/gdx/math/Vector3;->x:F */
		 /* iget v1, p1, Lcom/badlogic/gdx/math/Vector3;->y:F */
		 /* iget v2, p1, Lcom/badlogic/gdx/math/Vector3;->z:F */
		 (( com.badlogic.gdx.math.Vector3 ) p0 ).add ( v0, v1, v2 ); // invoke-virtual {p0, v0, v1, v2}, Lcom/badlogic/gdx/math/Vector3;->add(FFF)Lcom/badlogic/gdx/math/Vector3;
	 } // .end method
	 public com.badlogic.gdx.math.Vector3 cpy ( ) {
		 /* .locals 1 */
		 /* new-instance v0, Lcom/badlogic/gdx/math/Vector3; */
		 /* invoke-direct {v0, p0}, Lcom/badlogic/gdx/math/Vector3;-><init>(Lcom/badlogic/gdx/math/Vector3;)V */
	 } // .end method
	 public com.badlogic.gdx.math.Vector3 crs ( Float p0, Float p1, Float p2 ) {
		 /* .locals 4 */
		 /* iget v0, p0, Lcom/badlogic/gdx/math/Vector3;->y:F */
		 /* mul-float/2addr v0, p3 */
		 /* iget v1, p0, Lcom/badlogic/gdx/math/Vector3;->z:F */
		 /* mul-float/2addr v1, p2 */
		 /* sub-float/2addr v0, v1 */
		 /* iget v1, p0, Lcom/badlogic/gdx/math/Vector3;->z:F */
		 /* mul-float/2addr v1, p1 */
		 /* iget v2, p0, Lcom/badlogic/gdx/math/Vector3;->x:F */
		 /* mul-float/2addr v2, p3 */
		 /* sub-float/2addr v1, v2 */
		 /* iget v2, p0, Lcom/badlogic/gdx/math/Vector3;->x:F */
		 /* mul-float/2addr v2, p2 */
		 /* iget v3, p0, Lcom/badlogic/gdx/math/Vector3;->y:F */
		 /* mul-float/2addr v3, p1 */
		 /* sub-float/2addr v2, v3 */
		 (( com.badlogic.gdx.math.Vector3 ) p0 ).set ( v0, v1, v2 ); // invoke-virtual {p0, v0, v1, v2}, Lcom/badlogic/gdx/math/Vector3;->set(FFF)Lcom/badlogic/gdx/math/Vector3;
	 } // .end method
	 public com.badlogic.gdx.math.Vector3 crs ( com.badlogic.gdx.math.Vector3 p0 ) {
		 /* .locals 5 */
		 /* iget v0, p0, Lcom/badlogic/gdx/math/Vector3;->y:F */
		 /* iget v1, p1, Lcom/badlogic/gdx/math/Vector3;->z:F */
		 /* mul-float/2addr v0, v1 */
		 /* iget v1, p0, Lcom/badlogic/gdx/math/Vector3;->z:F */
		 /* iget v2, p1, Lcom/badlogic/gdx/math/Vector3;->y:F */
		 /* mul-float/2addr v1, v2 */
		 /* sub-float/2addr v0, v1 */
		 /* iget v1, p0, Lcom/badlogic/gdx/math/Vector3;->z:F */
		 /* iget v2, p1, Lcom/badlogic/gdx/math/Vector3;->x:F */
		 /* mul-float/2addr v1, v2 */
		 /* iget v2, p0, Lcom/badlogic/gdx/math/Vector3;->x:F */
		 /* iget v3, p1, Lcom/badlogic/gdx/math/Vector3;->z:F */
		 /* mul-float/2addr v2, v3 */
		 /* sub-float/2addr v1, v2 */
		 /* iget v2, p0, Lcom/badlogic/gdx/math/Vector3;->x:F */
		 /* iget v3, p1, Lcom/badlogic/gdx/math/Vector3;->y:F */
		 /* mul-float/2addr v2, v3 */
		 /* iget v3, p0, Lcom/badlogic/gdx/math/Vector3;->y:F */
		 /* iget v4, p1, Lcom/badlogic/gdx/math/Vector3;->x:F */
		 /* mul-float/2addr v3, v4 */
		 /* sub-float/2addr v2, v3 */
		 (( com.badlogic.gdx.math.Vector3 ) p0 ).set ( v0, v1, v2 ); // invoke-virtual {p0, v0, v1, v2}, Lcom/badlogic/gdx/math/Vector3;->set(FFF)Lcom/badlogic/gdx/math/Vector3;
	 } // .end method
	 public com.badlogic.gdx.math.Vector3 div ( Float p0 ) {
		 /* .locals 4 */
		 /* const/high16 v0, 0x3f800000 # 1.0f */
		 /* div-float/2addr v0, p1 */
		 /* iget v1, p0, Lcom/badlogic/gdx/math/Vector3;->x:F */
		 /* mul-float/2addr v1, v0 */
		 /* iget v2, p0, Lcom/badlogic/gdx/math/Vector3;->y:F */
		 /* mul-float/2addr v2, v0 */
		 /* iget v3, p0, Lcom/badlogic/gdx/math/Vector3;->z:F */
		 /* mul-float/2addr v0, v3 */
		 (( com.badlogic.gdx.math.Vector3 ) p0 ).set ( v1, v2, v0 ); // invoke-virtual {p0, v1, v2, v0}, Lcom/badlogic/gdx/math/Vector3;->set(FFF)Lcom/badlogic/gdx/math/Vector3;
	 } // .end method
	 public Float dot ( Float p0, Float p1, Float p2 ) {
		 /* .locals 2 */
		 /* iget v0, p0, Lcom/badlogic/gdx/math/Vector3;->x:F */
		 /* mul-float/2addr v0, p1 */
		 /* iget v1, p0, Lcom/badlogic/gdx/math/Vector3;->y:F */
		 /* mul-float/2addr v1, p2 */
		 /* add-float/2addr v0, v1 */
		 /* iget v1, p0, Lcom/badlogic/gdx/math/Vector3;->z:F */
		 /* mul-float/2addr v1, p3 */
		 /* add-float/2addr v0, v1 */
	 } // .end method
	 public Float dot ( com.badlogic.gdx.math.Vector3 p0 ) {
		 /* .locals 3 */
		 /* iget v0, p0, Lcom/badlogic/gdx/math/Vector3;->x:F */
		 /* iget v1, p1, Lcom/badlogic/gdx/math/Vector3;->x:F */
		 /* mul-float/2addr v0, v1 */
		 /* iget v1, p0, Lcom/badlogic/gdx/math/Vector3;->y:F */
		 /* iget v2, p1, Lcom/badlogic/gdx/math/Vector3;->y:F */
		 /* mul-float/2addr v1, v2 */
		 /* add-float/2addr v0, v1 */
		 /* iget v1, p0, Lcom/badlogic/gdx/math/Vector3;->z:F */
		 /* iget v2, p1, Lcom/badlogic/gdx/math/Vector3;->z:F */
		 /* mul-float/2addr v1, v2 */
		 /* add-float/2addr v0, v1 */
	 } // .end method
	 public Float dst ( Float p0, Float p1, Float p2 ) {
		 /* .locals 2 */
		 v0 = 		 (( com.badlogic.gdx.math.Vector3 ) p0 ).dst2 ( p1, p2, p3 ); // invoke-virtual {p0, p1, p2, p3}, Lcom/badlogic/gdx/math/Vector3;->dst2(FFF)F
		 /* float-to-double v0, v0 */
		 java.lang.Math .sqrt ( v0,v1 );
		 /* move-result-wide v0 */
		 /* double-to-float v0, v0 */
	 } // .end method
	 public Float dst ( com.badlogic.gdx.math.Vector3 p0 ) {
		 /* .locals 4 */
		 /* iget v0, p1, Lcom/badlogic/gdx/math/Vector3;->x:F */
		 /* iget v1, p0, Lcom/badlogic/gdx/math/Vector3;->x:F */
		 /* sub-float/2addr v0, v1 */
		 /* iget v1, p1, Lcom/badlogic/gdx/math/Vector3;->y:F */
		 /* iget v2, p0, Lcom/badlogic/gdx/math/Vector3;->y:F */
		 /* sub-float/2addr v1, v2 */
		 /* iget v2, p1, Lcom/badlogic/gdx/math/Vector3;->z:F */
		 /* iget v3, p0, Lcom/badlogic/gdx/math/Vector3;->z:F */
		 /* sub-float/2addr v2, v3 */
		 /* mul-float/2addr v0, v0 */
		 /* mul-float/2addr v1, v1 */
		 /* mul-float/2addr v2, v2 */
		 /* add-float/2addr v0, v1 */
		 /* add-float/2addr v0, v2 */
		 /* float-to-double v0, v0 */
		 java.lang.Math .sqrt ( v0,v1 );
		 /* move-result-wide v0 */
		 /* double-to-float v0, v0 */
	 } // .end method
	 public Float dst2 ( Float p0, Float p1, Float p2 ) {
		 /* .locals 3 */
		 /* iget v0, p0, Lcom/badlogic/gdx/math/Vector3;->x:F */
		 /* sub-float v0, p1, v0 */
		 /* iget v1, p0, Lcom/badlogic/gdx/math/Vector3;->y:F */
		 /* sub-float v1, p2, v1 */
		 /* iget v2, p0, Lcom/badlogic/gdx/math/Vector3;->z:F */
		 /* sub-float v2, p3, v2 */
		 /* mul-float/2addr v0, v0 */
		 /* mul-float/2addr v1, v1 */
		 /* mul-float/2addr v2, v2 */
		 /* add-float/2addr v0, v1 */
		 /* add-float/2addr v0, v2 */
	 } // .end method
	 public Float dst2 ( com.badlogic.gdx.math.Vector3 p0 ) {
		 /* .locals 4 */
		 /* iget v0, p1, Lcom/badlogic/gdx/math/Vector3;->x:F */
		 /* iget v1, p0, Lcom/badlogic/gdx/math/Vector3;->x:F */
		 /* sub-float/2addr v0, v1 */
		 /* iget v1, p1, Lcom/badlogic/gdx/math/Vector3;->y:F */
		 /* iget v2, p0, Lcom/badlogic/gdx/math/Vector3;->y:F */
		 /* sub-float/2addr v1, v2 */
		 /* iget v2, p1, Lcom/badlogic/gdx/math/Vector3;->z:F */
		 /* iget v3, p0, Lcom/badlogic/gdx/math/Vector3;->z:F */
		 /* sub-float/2addr v2, v3 */
		 /* mul-float/2addr v0, v0 */
		 /* mul-float/2addr v1, v1 */
		 /* mul-float/2addr v2, v2 */
		 /* add-float/2addr v0, v1 */
		 /* add-float/2addr v0, v2 */
	 } // .end method
	 public Boolean equals ( java.lang.Object p0 ) {
		 /* .locals 4 */
		 int v3 = 1; // const/4 v3, 0x1
		 int v2 = 0; // const/4 v2, 0x0
		 /* if-ne p0, p1, :cond_0 */
		 /* move v0, v3 */
	 } // :goto_0
} // :cond_0
/* if-nez p1, :cond_1 */
/* move v0, v2 */
} // :cond_1
(( java.lang.Object ) p0 ).getClass ( ); // invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;
(( java.lang.Object ) p1 ).getClass ( ); // invoke-virtual {p1}, Ljava/lang/Object;->getClass()Ljava/lang/Class;
/* if-eq v0, v1, :cond_2 */
/* move v0, v2 */
} // :cond_2
/* check-cast p1, Lcom/badlogic/gdx/math/Vector3; */
/* iget v0, p0, Lcom/badlogic/gdx/math/Vector3;->x:F */
v0 = com.badlogic.gdx.utils.NumberUtils .floatToIntBits ( v0 );
/* iget v1, p1, Lcom/badlogic/gdx/math/Vector3;->x:F */
v1 = com.badlogic.gdx.utils.NumberUtils .floatToIntBits ( v1 );
/* if-eq v0, v1, :cond_3 */
/* move v0, v2 */
} // :cond_3
/* iget v0, p0, Lcom/badlogic/gdx/math/Vector3;->y:F */
v0 = com.badlogic.gdx.utils.NumberUtils .floatToIntBits ( v0 );
/* iget v1, p1, Lcom/badlogic/gdx/math/Vector3;->y:F */
v1 = com.badlogic.gdx.utils.NumberUtils .floatToIntBits ( v1 );
/* if-eq v0, v1, :cond_4 */
/* move v0, v2 */
} // :cond_4
/* iget v0, p0, Lcom/badlogic/gdx/math/Vector3;->z:F */
v0 = com.badlogic.gdx.utils.NumberUtils .floatToIntBits ( v0 );
/* iget v1, p1, Lcom/badlogic/gdx/math/Vector3;->z:F */
v1 = com.badlogic.gdx.utils.NumberUtils .floatToIntBits ( v1 );
/* if-eq v0, v1, :cond_5 */
/* move v0, v2 */
} // :cond_5
/* move v0, v3 */
} // .end method
public Integer hashCode ( ) {
/* .locals 2 */
/* iget v0, p0, Lcom/badlogic/gdx/math/Vector3;->x:F */
v0 = com.badlogic.gdx.utils.NumberUtils .floatToIntBits ( v0 );
/* add-int/lit8 v0, v0, 0x1f */
/* mul-int/lit8 v0, v0, 0x1f */
/* iget v1, p0, Lcom/badlogic/gdx/math/Vector3;->y:F */
v1 = com.badlogic.gdx.utils.NumberUtils .floatToIntBits ( v1 );
/* add-int/2addr v0, v1 */
/* mul-int/lit8 v0, v0, 0x1f */
/* iget v1, p0, Lcom/badlogic/gdx/math/Vector3;->z:F */
v1 = com.badlogic.gdx.utils.NumberUtils .floatToIntBits ( v1 );
/* add-int/2addr v0, v1 */
} // .end method
public Boolean idt ( com.badlogic.gdx.math.Vector3 p0 ) {
/* .locals 2 */
/* iget v0, p0, Lcom/badlogic/gdx/math/Vector3;->x:F */
/* iget v1, p1, Lcom/badlogic/gdx/math/Vector3;->x:F */
/* cmpl-float v0, v0, v1 */
/* if-nez v0, :cond_0 */
/* iget v0, p0, Lcom/badlogic/gdx/math/Vector3;->y:F */
/* iget v1, p1, Lcom/badlogic/gdx/math/Vector3;->y:F */
/* cmpl-float v0, v0, v1 */
/* if-nez v0, :cond_0 */
/* iget v0, p0, Lcom/badlogic/gdx/math/Vector3;->z:F */
/* iget v1, p1, Lcom/badlogic/gdx/math/Vector3;->z:F */
/* cmpl-float v0, v0, v1 */
/* if-nez v0, :cond_0 */
int v0 = 1; // const/4 v0, 0x1
} // :goto_0
} // :cond_0
int v0 = 0; // const/4 v0, 0x0
} // .end method
public Boolean isUnit ( ) {
/* .locals 2 */
v0 = (( com.badlogic.gdx.math.Vector3 ) p0 ).len ( ); // invoke-virtual {p0}, Lcom/badlogic/gdx/math/Vector3;->len()F
/* const/high16 v1, 0x3f800000 # 1.0f */
/* cmpl-float v0, v0, v1 */
/* if-nez v0, :cond_0 */
int v0 = 1; // const/4 v0, 0x1
} // :goto_0
} // :cond_0
int v0 = 0; // const/4 v0, 0x0
} // .end method
public Boolean isZero ( ) {
/* .locals 2 */
int v1 = 0; // const/4 v1, 0x0
/* iget v0, p0, Lcom/badlogic/gdx/math/Vector3;->x:F */
/* cmpl-float v0, v0, v1 */
/* if-nez v0, :cond_0 */
/* iget v0, p0, Lcom/badlogic/gdx/math/Vector3;->y:F */
/* cmpl-float v0, v0, v1 */
/* if-nez v0, :cond_0 */
/* iget v0, p0, Lcom/badlogic/gdx/math/Vector3;->z:F */
/* cmpl-float v0, v0, v1 */
/* if-nez v0, :cond_0 */
int v0 = 1; // const/4 v0, 0x1
} // :goto_0
} // :cond_0
int v0 = 0; // const/4 v0, 0x0
} // .end method
public Float len ( ) {
/* .locals 3 */
/* iget v0, p0, Lcom/badlogic/gdx/math/Vector3;->x:F */
/* iget v1, p0, Lcom/badlogic/gdx/math/Vector3;->x:F */
/* mul-float/2addr v0, v1 */
/* iget v1, p0, Lcom/badlogic/gdx/math/Vector3;->y:F */
/* iget v2, p0, Lcom/badlogic/gdx/math/Vector3;->y:F */
/* mul-float/2addr v1, v2 */
/* add-float/2addr v0, v1 */
/* iget v1, p0, Lcom/badlogic/gdx/math/Vector3;->z:F */
/* iget v2, p0, Lcom/badlogic/gdx/math/Vector3;->z:F */
/* mul-float/2addr v1, v2 */
/* add-float/2addr v0, v1 */
/* float-to-double v0, v0 */
java.lang.Math .sqrt ( v0,v1 );
/* move-result-wide v0 */
/* double-to-float v0, v0 */
} // .end method
public Float len2 ( ) {
/* .locals 3 */
/* iget v0, p0, Lcom/badlogic/gdx/math/Vector3;->x:F */
/* iget v1, p0, Lcom/badlogic/gdx/math/Vector3;->x:F */
/* mul-float/2addr v0, v1 */
/* iget v1, p0, Lcom/badlogic/gdx/math/Vector3;->y:F */
/* iget v2, p0, Lcom/badlogic/gdx/math/Vector3;->y:F */
/* mul-float/2addr v1, v2 */
/* add-float/2addr v0, v1 */
/* iget v1, p0, Lcom/badlogic/gdx/math/Vector3;->z:F */
/* iget v2, p0, Lcom/badlogic/gdx/math/Vector3;->z:F */
/* mul-float/2addr v1, v2 */
/* add-float/2addr v0, v1 */
} // .end method
public com.badlogic.gdx.math.Vector3 lerp ( com.badlogic.gdx.math.Vector3 p0, Float p1 ) {
/* .locals 2 */
/* const/high16 v0, 0x3f800000 # 1.0f */
/* sub-float/2addr v0, p2 */
(( com.badlogic.gdx.math.Vector3 ) p0 ).mul ( v0 ); // invoke-virtual {p0, v0}, Lcom/badlogic/gdx/math/Vector3;->mul(F)Lcom/badlogic/gdx/math/Vector3;
(( com.badlogic.gdx.math.Vector3 ) p1 ).tmp ( ); // invoke-virtual {p1}, Lcom/badlogic/gdx/math/Vector3;->tmp()Lcom/badlogic/gdx/math/Vector3;
(( com.badlogic.gdx.math.Vector3 ) v1 ).mul ( p2 ); // invoke-virtual {v1, p2}, Lcom/badlogic/gdx/math/Vector3;->mul(F)Lcom/badlogic/gdx/math/Vector3;
(( com.badlogic.gdx.math.Vector3 ) v0 ).add ( v1 ); // invoke-virtual {v0, v1}, Lcom/badlogic/gdx/math/Vector3;->add(Lcom/badlogic/gdx/math/Vector3;)Lcom/badlogic/gdx/math/Vector3;
} // .end method
public com.badlogic.gdx.math.Vector3 mul ( Float p0 ) {
/* .locals 3 */
/* iget v0, p0, Lcom/badlogic/gdx/math/Vector3;->x:F */
/* mul-float/2addr v0, p1 */
/* iget v1, p0, Lcom/badlogic/gdx/math/Vector3;->y:F */
/* mul-float/2addr v1, p1 */
/* iget v2, p0, Lcom/badlogic/gdx/math/Vector3;->z:F */
/* mul-float/2addr v2, p1 */
(( com.badlogic.gdx.math.Vector3 ) p0 ).set ( v0, v1, v2 ); // invoke-virtual {p0, v0, v1, v2}, Lcom/badlogic/gdx/math/Vector3;->set(FFF)Lcom/badlogic/gdx/math/Vector3;
} // .end method
public com.badlogic.gdx.math.Vector3 mul ( com.badlogic.gdx.math.Matrix4 p0 ) {
/* .locals 6 */
v0 = this.val;
/* iget v1, p0, Lcom/badlogic/gdx/math/Vector3;->x:F */
int v2 = 0; // const/4 v2, 0x0
/* aget v2, v0, v2 */
/* mul-float/2addr v1, v2 */
/* iget v2, p0, Lcom/badlogic/gdx/math/Vector3;->y:F */
int v3 = 4; // const/4 v3, 0x4
/* aget v3, v0, v3 */
/* mul-float/2addr v2, v3 */
/* add-float/2addr v1, v2 */
/* iget v2, p0, Lcom/badlogic/gdx/math/Vector3;->z:F */
/* const/16 v3, 0x8 */
/* aget v3, v0, v3 */
/* mul-float/2addr v2, v3 */
/* add-float/2addr v1, v2 */
/* const/16 v2, 0xc */
/* aget v2, v0, v2 */
/* add-float/2addr v1, v2 */
/* iget v2, p0, Lcom/badlogic/gdx/math/Vector3;->x:F */
int v3 = 1; // const/4 v3, 0x1
/* aget v3, v0, v3 */
/* mul-float/2addr v2, v3 */
/* iget v3, p0, Lcom/badlogic/gdx/math/Vector3;->y:F */
int v4 = 5; // const/4 v4, 0x5
/* aget v4, v0, v4 */
/* mul-float/2addr v3, v4 */
/* add-float/2addr v2, v3 */
/* iget v3, p0, Lcom/badlogic/gdx/math/Vector3;->z:F */
/* const/16 v4, 0x9 */
/* aget v4, v0, v4 */
/* mul-float/2addr v3, v4 */
/* add-float/2addr v2, v3 */
/* const/16 v3, 0xd */
/* aget v3, v0, v3 */
/* add-float/2addr v2, v3 */
/* iget v3, p0, Lcom/badlogic/gdx/math/Vector3;->x:F */
int v4 = 2; // const/4 v4, 0x2
/* aget v4, v0, v4 */
/* mul-float/2addr v3, v4 */
/* iget v4, p0, Lcom/badlogic/gdx/math/Vector3;->y:F */
int v5 = 6; // const/4 v5, 0x6
/* aget v5, v0, v5 */
/* mul-float/2addr v4, v5 */
/* add-float/2addr v3, v4 */
/* iget v4, p0, Lcom/badlogic/gdx/math/Vector3;->z:F */
/* const/16 v5, 0xa */
/* aget v5, v0, v5 */
/* mul-float/2addr v4, v5 */
/* add-float/2addr v3, v4 */
/* const/16 v4, 0xe */
/* aget v0, v0, v4 */
/* add-float/2addr v0, v3 */
(( com.badlogic.gdx.math.Vector3 ) p0 ).set ( v1, v2, v0 ); // invoke-virtual {p0, v1, v2, v0}, Lcom/badlogic/gdx/math/Vector3;->set(FFF)Lcom/badlogic/gdx/math/Vector3;
} // .end method
public com.badlogic.gdx.math.Vector3 nor ( ) {
/* .locals 2 */
v0 = (( com.badlogic.gdx.math.Vector3 ) p0 ).len ( ); // invoke-virtual {p0}, Lcom/badlogic/gdx/math/Vector3;->len()F
int v1 = 0; // const/4 v1, 0x0
/* cmpl-float v1, v0, v1 */
/* if-nez v1, :cond_0 */
/* move-object v0, p0 */
} // :goto_0
} // :cond_0
(( com.badlogic.gdx.math.Vector3 ) p0 ).div ( v0 ); // invoke-virtual {p0, v0}, Lcom/badlogic/gdx/math/Vector3;->div(F)Lcom/badlogic/gdx/math/Vector3;
} // .end method
public com.badlogic.gdx.math.Vector3 prj ( com.badlogic.gdx.math.Matrix4 p0 ) {
/* .locals 7 */
v0 = this.val;
/* iget v1, p0, Lcom/badlogic/gdx/math/Vector3;->x:F */
int v2 = 3; // const/4 v2, 0x3
/* aget v2, v0, v2 */
/* mul-float/2addr v1, v2 */
/* iget v2, p0, Lcom/badlogic/gdx/math/Vector3;->y:F */
int v3 = 7; // const/4 v3, 0x7
/* aget v3, v0, v3 */
/* mul-float/2addr v2, v3 */
/* add-float/2addr v1, v2 */
/* iget v2, p0, Lcom/badlogic/gdx/math/Vector3;->z:F */
/* const/16 v3, 0xb */
/* aget v3, v0, v3 */
/* mul-float/2addr v2, v3 */
/* add-float/2addr v1, v2 */
/* const/16 v2, 0xf */
/* aget v2, v0, v2 */
/* add-float/2addr v1, v2 */
/* iget v2, p0, Lcom/badlogic/gdx/math/Vector3;->x:F */
int v3 = 0; // const/4 v3, 0x0
/* aget v3, v0, v3 */
/* mul-float/2addr v2, v3 */
/* iget v3, p0, Lcom/badlogic/gdx/math/Vector3;->y:F */
int v4 = 4; // const/4 v4, 0x4
/* aget v4, v0, v4 */
/* mul-float/2addr v3, v4 */
/* add-float/2addr v2, v3 */
/* iget v3, p0, Lcom/badlogic/gdx/math/Vector3;->z:F */
/* const/16 v4, 0x8 */
/* aget v4, v0, v4 */
/* mul-float/2addr v3, v4 */
/* add-float/2addr v2, v3 */
/* const/16 v3, 0xc */
/* aget v3, v0, v3 */
/* add-float/2addr v2, v3 */
/* div-float/2addr v2, v1 */
/* iget v3, p0, Lcom/badlogic/gdx/math/Vector3;->x:F */
int v4 = 1; // const/4 v4, 0x1
/* aget v4, v0, v4 */
/* mul-float/2addr v3, v4 */
/* iget v4, p0, Lcom/badlogic/gdx/math/Vector3;->y:F */
int v5 = 5; // const/4 v5, 0x5
/* aget v5, v0, v5 */
/* mul-float/2addr v4, v5 */
/* add-float/2addr v3, v4 */
/* iget v4, p0, Lcom/badlogic/gdx/math/Vector3;->z:F */
/* const/16 v5, 0x9 */
/* aget v5, v0, v5 */
/* mul-float/2addr v4, v5 */
/* add-float/2addr v3, v4 */
/* const/16 v4, 0xd */
/* aget v4, v0, v4 */
/* add-float/2addr v3, v4 */
/* div-float/2addr v3, v1 */
/* iget v4, p0, Lcom/badlogic/gdx/math/Vector3;->x:F */
int v5 = 2; // const/4 v5, 0x2
/* aget v5, v0, v5 */
/* mul-float/2addr v4, v5 */
/* iget v5, p0, Lcom/badlogic/gdx/math/Vector3;->y:F */
int v6 = 6; // const/4 v6, 0x6
/* aget v6, v0, v6 */
/* mul-float/2addr v5, v6 */
/* add-float/2addr v4, v5 */
/* iget v5, p0, Lcom/badlogic/gdx/math/Vector3;->z:F */
/* const/16 v6, 0xa */
/* aget v6, v0, v6 */
/* mul-float/2addr v5, v6 */
/* add-float/2addr v4, v5 */
/* const/16 v5, 0xe */
/* aget v0, v0, v5 */
/* add-float/2addr v0, v4 */
/* div-float/2addr v0, v1 */
(( com.badlogic.gdx.math.Vector3 ) p0 ).set ( v2, v3, v0 ); // invoke-virtual {p0, v2, v3, v0}, Lcom/badlogic/gdx/math/Vector3;->set(FFF)Lcom/badlogic/gdx/math/Vector3;
} // .end method
public com.badlogic.gdx.math.Vector3 rot ( com.badlogic.gdx.math.Matrix4 p0 ) {
/* .locals 6 */
v0 = this.val;
/* iget v1, p0, Lcom/badlogic/gdx/math/Vector3;->x:F */
int v2 = 0; // const/4 v2, 0x0
/* aget v2, v0, v2 */
/* mul-float/2addr v1, v2 */
/* iget v2, p0, Lcom/badlogic/gdx/math/Vector3;->y:F */
int v3 = 4; // const/4 v3, 0x4
/* aget v3, v0, v3 */
/* mul-float/2addr v2, v3 */
/* add-float/2addr v1, v2 */
/* iget v2, p0, Lcom/badlogic/gdx/math/Vector3;->z:F */
/* const/16 v3, 0x8 */
/* aget v3, v0, v3 */
/* mul-float/2addr v2, v3 */
/* add-float/2addr v1, v2 */
/* iget v2, p0, Lcom/badlogic/gdx/math/Vector3;->x:F */
int v3 = 1; // const/4 v3, 0x1
/* aget v3, v0, v3 */
/* mul-float/2addr v2, v3 */
/* iget v3, p0, Lcom/badlogic/gdx/math/Vector3;->y:F */
int v4 = 5; // const/4 v4, 0x5
/* aget v4, v0, v4 */
/* mul-float/2addr v3, v4 */
/* add-float/2addr v2, v3 */
/* iget v3, p0, Lcom/badlogic/gdx/math/Vector3;->z:F */
/* const/16 v4, 0x9 */
/* aget v4, v0, v4 */
/* mul-float/2addr v3, v4 */
/* add-float/2addr v2, v3 */
/* iget v3, p0, Lcom/badlogic/gdx/math/Vector3;->x:F */
int v4 = 2; // const/4 v4, 0x2
/* aget v4, v0, v4 */
/* mul-float/2addr v3, v4 */
/* iget v4, p0, Lcom/badlogic/gdx/math/Vector3;->y:F */
int v5 = 6; // const/4 v5, 0x6
/* aget v5, v0, v5 */
/* mul-float/2addr v4, v5 */
/* add-float/2addr v3, v4 */
/* iget v4, p0, Lcom/badlogic/gdx/math/Vector3;->z:F */
/* const/16 v5, 0xa */
/* aget v0, v0, v5 */
/* mul-float/2addr v0, v4 */
/* add-float/2addr v0, v3 */
(( com.badlogic.gdx.math.Vector3 ) p0 ).set ( v1, v2, v0 ); // invoke-virtual {p0, v1, v2, v0}, Lcom/badlogic/gdx/math/Vector3;->set(FFF)Lcom/badlogic/gdx/math/Vector3;
} // .end method
public com.badlogic.gdx.math.Vector3 scale ( Float p0, Float p1, Float p2 ) {
/* .locals 1 */
/* iget v0, p0, Lcom/badlogic/gdx/math/Vector3;->x:F */
/* mul-float/2addr v0, p1 */
/* iput v0, p0, Lcom/badlogic/gdx/math/Vector3;->x:F */
/* iget v0, p0, Lcom/badlogic/gdx/math/Vector3;->y:F */
/* mul-float/2addr v0, p2 */
/* iput v0, p0, Lcom/badlogic/gdx/math/Vector3;->y:F */
/* iget v0, p0, Lcom/badlogic/gdx/math/Vector3;->z:F */
/* mul-float/2addr v0, p3 */
/* iput v0, p0, Lcom/badlogic/gdx/math/Vector3;->z:F */
} // .end method
public com.badlogic.gdx.math.Vector3 set ( Float p0, Float p1, Float p2 ) {
/* .locals 0 */
/* iput p1, p0, Lcom/badlogic/gdx/math/Vector3;->x:F */
/* iput p2, p0, Lcom/badlogic/gdx/math/Vector3;->y:F */
/* iput p3, p0, Lcom/badlogic/gdx/math/Vector3;->z:F */
} // .end method
public com.badlogic.gdx.math.Vector3 set ( com.badlogic.gdx.math.Vector3 p0 ) {
/* .locals 3 */
/* iget v0, p1, Lcom/badlogic/gdx/math/Vector3;->x:F */
/* iget v1, p1, Lcom/badlogic/gdx/math/Vector3;->y:F */
/* iget v2, p1, Lcom/badlogic/gdx/math/Vector3;->z:F */
(( com.badlogic.gdx.math.Vector3 ) p0 ).set ( v0, v1, v2 ); // invoke-virtual {p0, v0, v1, v2}, Lcom/badlogic/gdx/math/Vector3;->set(FFF)Lcom/badlogic/gdx/math/Vector3;
} // .end method
public com.badlogic.gdx.math.Vector3 set ( Float[] p0 ) {
/* .locals 3 */
int v0 = 0; // const/4 v0, 0x0
/* aget v0, p1, v0 */
int v1 = 1; // const/4 v1, 0x1
/* aget v1, p1, v1 */
int v2 = 2; // const/4 v2, 0x2
/* aget v2, p1, v2 */
(( com.badlogic.gdx.math.Vector3 ) p0 ).set ( v0, v1, v2 ); // invoke-virtual {p0, v0, v1, v2}, Lcom/badlogic/gdx/math/Vector3;->set(FFF)Lcom/badlogic/gdx/math/Vector3;
} // .end method
public com.badlogic.gdx.math.Vector3 slerp ( com.badlogic.gdx.math.Vector3 p0, Float p1 ) {
/* .locals 7 */
/* const/high16 v6, 0x3f800000 # 1.0f */
/* const/high16 v5, -0x40800000 # -1.0f */
v0 = (( com.badlogic.gdx.math.Vector3 ) p0 ).dot ( p1 ); // invoke-virtual {p0, p1}, Lcom/badlogic/gdx/math/Vector3;->dot(Lcom/badlogic/gdx/math/Vector3;)F
/* float-to-double v1, v0 */
/* const-wide v3, 0x3fefff972474538fL # 0.99995 */
/* cmpl-double v1, v1, v3 */
/* if-gtz v1, :cond_0 */
/* float-to-double v1, v0 */
/* const-wide v3, 0x3feffbe76c8b4396L # 0.9995 */
/* cmpg-double v1, v1, v3 */
/* if-gez v1, :cond_1 */
} // :cond_0
(( com.badlogic.gdx.math.Vector3 ) p1 ).tmp ( ); // invoke-virtual {p1}, Lcom/badlogic/gdx/math/Vector3;->tmp()Lcom/badlogic/gdx/math/Vector3;
(( com.badlogic.gdx.math.Vector3 ) v0 ).sub ( p0 ); // invoke-virtual {v0, p0}, Lcom/badlogic/gdx/math/Vector3;->sub(Lcom/badlogic/gdx/math/Vector3;)Lcom/badlogic/gdx/math/Vector3;
(( com.badlogic.gdx.math.Vector3 ) v0 ).mul ( p2 ); // invoke-virtual {v0, p2}, Lcom/badlogic/gdx/math/Vector3;->mul(F)Lcom/badlogic/gdx/math/Vector3;
(( com.badlogic.gdx.math.Vector3 ) p0 ).add ( v0 ); // invoke-virtual {p0, v0}, Lcom/badlogic/gdx/math/Vector3;->add(Lcom/badlogic/gdx/math/Vector3;)Lcom/badlogic/gdx/math/Vector3;
(( com.badlogic.gdx.math.Vector3 ) p0 ).nor ( ); // invoke-virtual {p0}, Lcom/badlogic/gdx/math/Vector3;->nor()Lcom/badlogic/gdx/math/Vector3;
/* move-object v0, p0 */
} // :goto_0
} // :cond_1
/* cmpl-float v1, v0, v6 */
/* if-lez v1, :cond_2 */
/* move v0, v6 */
} // :cond_2
/* cmpg-float v1, v0, v5 */
/* if-gez v1, :cond_3 */
/* move v0, v5 */
} // :cond_3
/* float-to-double v1, v0 */
java.lang.Math .acos ( v1,v2 );
/* move-result-wide v1 */
/* double-to-float v1, v1 */
/* mul-float/2addr v1, p2 */
(( com.badlogic.gdx.math.Vector3 ) p1 ).tmp ( ); // invoke-virtual {p1}, Lcom/badlogic/gdx/math/Vector3;->tmp()Lcom/badlogic/gdx/math/Vector3;
/* iget v3, p0, Lcom/badlogic/gdx/math/Vector3;->x:F */
/* mul-float/2addr v3, v0 */
/* iget v4, p0, Lcom/badlogic/gdx/math/Vector3;->y:F */
/* mul-float/2addr v4, v0 */
/* iget v5, p0, Lcom/badlogic/gdx/math/Vector3;->z:F */
/* mul-float/2addr v0, v5 */
(( com.badlogic.gdx.math.Vector3 ) v2 ).sub ( v3, v4, v0 ); // invoke-virtual {v2, v3, v4, v0}, Lcom/badlogic/gdx/math/Vector3;->sub(FFF)Lcom/badlogic/gdx/math/Vector3;
(( com.badlogic.gdx.math.Vector3 ) v0 ).nor ( ); // invoke-virtual {v0}, Lcom/badlogic/gdx/math/Vector3;->nor()Lcom/badlogic/gdx/math/Vector3;
/* float-to-double v2, v1 */
java.lang.Math .cos ( v2,v3 );
/* move-result-wide v2 */
/* double-to-float v2, v2 */
(( com.badlogic.gdx.math.Vector3 ) p0 ).mul ( v2 ); // invoke-virtual {p0, v2}, Lcom/badlogic/gdx/math/Vector3;->mul(F)Lcom/badlogic/gdx/math/Vector3;
/* float-to-double v3, v1 */
java.lang.Math .sin ( v3,v4 );
/* move-result-wide v3 */
/* double-to-float v1, v3 */
(( com.badlogic.gdx.math.Vector3 ) v0 ).mul ( v1 ); // invoke-virtual {v0, v1}, Lcom/badlogic/gdx/math/Vector3;->mul(F)Lcom/badlogic/gdx/math/Vector3;
(( com.badlogic.gdx.math.Vector3 ) v2 ).add ( v0 ); // invoke-virtual {v2, v0}, Lcom/badlogic/gdx/math/Vector3;->add(Lcom/badlogic/gdx/math/Vector3;)Lcom/badlogic/gdx/math/Vector3;
(( com.badlogic.gdx.math.Vector3 ) v0 ).nor ( ); // invoke-virtual {v0}, Lcom/badlogic/gdx/math/Vector3;->nor()Lcom/badlogic/gdx/math/Vector3;
} // .end method
public com.badlogic.gdx.math.Vector3 sub ( Float p0 ) {
/* .locals 3 */
/* iget v0, p0, Lcom/badlogic/gdx/math/Vector3;->x:F */
/* sub-float/2addr v0, p1 */
/* iget v1, p0, Lcom/badlogic/gdx/math/Vector3;->y:F */
/* sub-float/2addr v1, p1 */
/* iget v2, p0, Lcom/badlogic/gdx/math/Vector3;->z:F */
/* sub-float/2addr v2, p1 */
(( com.badlogic.gdx.math.Vector3 ) p0 ).set ( v0, v1, v2 ); // invoke-virtual {p0, v0, v1, v2}, Lcom/badlogic/gdx/math/Vector3;->set(FFF)Lcom/badlogic/gdx/math/Vector3;
} // .end method
public com.badlogic.gdx.math.Vector3 sub ( Float p0, Float p1, Float p2 ) {
/* .locals 3 */
/* iget v0, p0, Lcom/badlogic/gdx/math/Vector3;->x:F */
/* sub-float/2addr v0, p1 */
/* iget v1, p0, Lcom/badlogic/gdx/math/Vector3;->y:F */
/* sub-float/2addr v1, p2 */
/* iget v2, p0, Lcom/badlogic/gdx/math/Vector3;->z:F */
/* sub-float/2addr v2, p3 */
(( com.badlogic.gdx.math.Vector3 ) p0 ).set ( v0, v1, v2 ); // invoke-virtual {p0, v0, v1, v2}, Lcom/badlogic/gdx/math/Vector3;->set(FFF)Lcom/badlogic/gdx/math/Vector3;
} // .end method
public com.badlogic.gdx.math.Vector3 sub ( com.badlogic.gdx.math.Vector3 p0 ) {
/* .locals 3 */
/* iget v0, p1, Lcom/badlogic/gdx/math/Vector3;->x:F */
/* iget v1, p1, Lcom/badlogic/gdx/math/Vector3;->y:F */
/* iget v2, p1, Lcom/badlogic/gdx/math/Vector3;->z:F */
(( com.badlogic.gdx.math.Vector3 ) p0 ).sub ( v0, v1, v2 ); // invoke-virtual {p0, v0, v1, v2}, Lcom/badlogic/gdx/math/Vector3;->sub(FFF)Lcom/badlogic/gdx/math/Vector3;
} // .end method
public com.badlogic.gdx.math.Vector3 tmp ( ) {
/* .locals 1 */
v0 = com.badlogic.gdx.math.Vector3.tmp;
(( com.badlogic.gdx.math.Vector3 ) v0 ).set ( p0 ); // invoke-virtual {v0, p0}, Lcom/badlogic/gdx/math/Vector3;->set(Lcom/badlogic/gdx/math/Vector3;)Lcom/badlogic/gdx/math/Vector3;
} // .end method
public com.badlogic.gdx.math.Vector3 tmp2 ( ) {
/* .locals 1 */
v0 = com.badlogic.gdx.math.Vector3.tmp2;
(( com.badlogic.gdx.math.Vector3 ) v0 ).set ( p0 ); // invoke-virtual {v0, p0}, Lcom/badlogic/gdx/math/Vector3;->set(Lcom/badlogic/gdx/math/Vector3;)Lcom/badlogic/gdx/math/Vector3;
} // .end method
com.badlogic.gdx.math.Vector3 tmp3 ( ) {
/* .locals 1 */
v0 = com.badlogic.gdx.math.Vector3.tmp3;
(( com.badlogic.gdx.math.Vector3 ) v0 ).set ( p0 ); // invoke-virtual {v0, p0}, Lcom/badlogic/gdx/math/Vector3;->set(Lcom/badlogic/gdx/math/Vector3;)Lcom/badlogic/gdx/math/Vector3;
} // .end method
public java.lang.String toString ( ) {
/* .locals 3 */
final String v2 = ","; // const-string v2, ","
/* new-instance v0, Ljava/lang/StringBuilder; */
/* invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V */
/* iget v1, p0, Lcom/badlogic/gdx/math/Vector3;->x:F */
(( java.lang.StringBuilder ) v0 ).append ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;
final String v1 = ","; // const-string v1, ","
(( java.lang.StringBuilder ) v0 ).append ( v2 ); // invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
/* iget v1, p0, Lcom/badlogic/gdx/math/Vector3;->y:F */
(( java.lang.StringBuilder ) v0 ).append ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;
final String v1 = ","; // const-string v1, ","
(( java.lang.StringBuilder ) v0 ).append ( v2 ); // invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
/* iget v1, p0, Lcom/badlogic/gdx/math/Vector3;->z:F */
(( java.lang.StringBuilder ) v0 ).append ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v0 ).toString ( ); // invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
} // .end method
