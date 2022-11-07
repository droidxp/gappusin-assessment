public class com.badlogic.gdx.math.Vector2 implements java.io.Serializable {
	 /* # interfaces */
	 /* # static fields */
	 private static final Long serialVersionUID;
	 private static final com.badlogic.gdx.math.Vector2 tmp;
	 static com.badlogic.gdx.math.Vector2 tmpobj;
	 static com.badlogic.gdx.math.Vector2 tmpobj1;
	 /* # instance fields */
	 public Float x;
	 public Float y;
	 /* # direct methods */
	 static com.badlogic.gdx.math.Vector2 ( ) {
		 /* .locals 1 */
		 /* new-instance v0, Lcom/badlogic/gdx/math/Vector2; */
		 /* invoke-direct {v0}, Lcom/badlogic/gdx/math/Vector2;-><init>()V */
		 /* new-instance v0, Lcom/badlogic/gdx/math/Vector2; */
		 /* invoke-direct {v0}, Lcom/badlogic/gdx/math/Vector2;-><init>()V */
		 /* new-instance v0, Lcom/badlogic/gdx/math/Vector2; */
		 /* invoke-direct {v0}, Lcom/badlogic/gdx/math/Vector2;-><init>()V */
		 return;
	 } // .end method
	 public com.badlogic.gdx.math.Vector2 ( ) {
		 /* .locals 0 */
		 /* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
		 return;
	 } // .end method
	 public com.badlogic.gdx.math.Vector2 ( ) {
		 /* .locals 0 */
		 /* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
		 /* iput p1, p0, Lcom/badlogic/gdx/math/Vector2;->x:F */
		 /* iput p2, p0, Lcom/badlogic/gdx/math/Vector2;->y:F */
		 return;
	 } // .end method
	 public com.badlogic.gdx.math.Vector2 ( ) {
		 /* .locals 0 */
		 /* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
		 (( com.badlogic.gdx.math.Vector2 ) p0 ).set ( p1 ); // invoke-virtual {p0, p1}, Lcom/badlogic/gdx/math/Vector2;->set(Lcom/badlogic/gdx/math/Vector2;)Lcom/badlogic/gdx/math/Vector2;
		 return;
	 } // .end method
	 public static com.badlogic.gdx.math.Vector2 tmp ( Float p0, Float p1 ) {
		 /* .locals 1 */
		 v0 = com.badlogic.gdx.math.Vector2.tmpobj;
		 /* iput p0, v0, Lcom/badlogic/gdx/math/Vector2;->x:F */
		 v0 = com.badlogic.gdx.math.Vector2.tmpobj;
		 /* iput p1, v0, Lcom/badlogic/gdx/math/Vector2;->y:F */
		 v0 = com.badlogic.gdx.math.Vector2.tmpobj;
	 } // .end method
	 public static com.badlogic.gdx.math.Vector2 tmp ( com.badlogic.gdx.math.Vector2 p0 ) {
		 /* .locals 2 */
		 v0 = com.badlogic.gdx.math.Vector2.tmpobj;
		 /* iget v1, p0, Lcom/badlogic/gdx/math/Vector2;->x:F */
		 /* iput v1, v0, Lcom/badlogic/gdx/math/Vector2;->x:F */
		 v0 = com.badlogic.gdx.math.Vector2.tmpobj;
		 /* iget v1, p0, Lcom/badlogic/gdx/math/Vector2;->y:F */
		 /* iput v1, v0, Lcom/badlogic/gdx/math/Vector2;->y:F */
		 v0 = com.badlogic.gdx.math.Vector2.tmpobj;
	 } // .end method
	 public static com.badlogic.gdx.math.Vector2 tmp1 ( Float p0, Float p1 ) {
		 /* .locals 1 */
		 v0 = com.badlogic.gdx.math.Vector2.tmpobj1;
		 /* iput p0, v0, Lcom/badlogic/gdx/math/Vector2;->x:F */
		 v0 = com.badlogic.gdx.math.Vector2.tmpobj1;
		 /* iput p1, v0, Lcom/badlogic/gdx/math/Vector2;->y:F */
		 v0 = com.badlogic.gdx.math.Vector2.tmpobj1;
	 } // .end method
	 public static com.badlogic.gdx.math.Vector2 tmp1 ( com.badlogic.gdx.math.Vector2 p0 ) {
		 /* .locals 2 */
		 v0 = com.badlogic.gdx.math.Vector2.tmpobj1;
		 /* iget v1, p0, Lcom/badlogic/gdx/math/Vector2;->x:F */
		 /* iput v1, v0, Lcom/badlogic/gdx/math/Vector2;->x:F */
		 v0 = com.badlogic.gdx.math.Vector2.tmpobj1;
		 /* iget v1, p0, Lcom/badlogic/gdx/math/Vector2;->y:F */
		 /* iput v1, v0, Lcom/badlogic/gdx/math/Vector2;->y:F */
		 v0 = com.badlogic.gdx.math.Vector2.tmpobj1;
	 } // .end method
	 /* # virtual methods */
	 public com.badlogic.gdx.math.Vector2 add ( Float p0, Float p1 ) {
		 /* .locals 1 */
		 /* iget v0, p0, Lcom/badlogic/gdx/math/Vector2;->x:F */
		 /* add-float/2addr v0, p1 */
		 /* iput v0, p0, Lcom/badlogic/gdx/math/Vector2;->x:F */
		 /* iget v0, p0, Lcom/badlogic/gdx/math/Vector2;->y:F */
		 /* add-float/2addr v0, p2 */
		 /* iput v0, p0, Lcom/badlogic/gdx/math/Vector2;->y:F */
	 } // .end method
	 public com.badlogic.gdx.math.Vector2 add ( com.badlogic.gdx.math.Vector2 p0 ) {
		 /* .locals 2 */
		 /* iget v0, p0, Lcom/badlogic/gdx/math/Vector2;->x:F */
		 /* iget v1, p1, Lcom/badlogic/gdx/math/Vector2;->x:F */
		 /* add-float/2addr v0, v1 */
		 /* iput v0, p0, Lcom/badlogic/gdx/math/Vector2;->x:F */
		 /* iget v0, p0, Lcom/badlogic/gdx/math/Vector2;->y:F */
		 /* iget v1, p1, Lcom/badlogic/gdx/math/Vector2;->y:F */
		 /* add-float/2addr v0, v1 */
		 /* iput v0, p0, Lcom/badlogic/gdx/math/Vector2;->y:F */
	 } // .end method
	 public Float angle ( ) {
		 /* .locals 4 */
		 /* iget v0, p0, Lcom/badlogic/gdx/math/Vector2;->y:F */
		 /* float-to-double v0, v0 */
		 /* iget v2, p0, Lcom/badlogic/gdx/math/Vector2;->x:F */
		 /* float-to-double v2, v2 */
		 java.lang.Math .atan2 ( v0,v1,v2,v3 );
		 /* move-result-wide v0 */
		 /* double-to-float v0, v0 */
		 /* const v1, 0x42652ee0 */
		 /* mul-float/2addr v0, v1 */
		 int v1 = 0; // const/4 v1, 0x0
		 /* cmpg-float v1, v0, v1 */
		 /* if-gez v1, :cond_0 */
		 /* const/high16 v1, 0x43b40000 # 360.0f */
		 /* add-float/2addr v0, v1 */
	 } // :cond_0
} // .end method
public com.badlogic.gdx.math.Vector2 cpy ( ) {
	 /* .locals 1 */
	 /* new-instance v0, Lcom/badlogic/gdx/math/Vector2; */
	 /* invoke-direct {v0, p0}, Lcom/badlogic/gdx/math/Vector2;-><init>(Lcom/badlogic/gdx/math/Vector2;)V */
} // .end method
public Float crs ( Float p0, Float p1 ) {
	 /* .locals 2 */
	 /* iget v0, p0, Lcom/badlogic/gdx/math/Vector2;->x:F */
	 /* mul-float/2addr v0, p2 */
	 /* iget v1, p0, Lcom/badlogic/gdx/math/Vector2;->y:F */
	 /* mul-float/2addr v1, p1 */
	 /* sub-float/2addr v0, v1 */
} // .end method
public Float crs ( com.badlogic.gdx.math.Vector2 p0 ) {
	 /* .locals 3 */
	 /* iget v0, p0, Lcom/badlogic/gdx/math/Vector2;->x:F */
	 /* iget v1, p1, Lcom/badlogic/gdx/math/Vector2;->y:F */
	 /* mul-float/2addr v0, v1 */
	 /* iget v1, p0, Lcom/badlogic/gdx/math/Vector2;->y:F */
	 /* iget v2, p1, Lcom/badlogic/gdx/math/Vector2;->x:F */
	 /* mul-float/2addr v1, v2 */
	 /* sub-float/2addr v0, v1 */
} // .end method
public Float dot ( com.badlogic.gdx.math.Vector2 p0 ) {
	 /* .locals 3 */
	 /* iget v0, p0, Lcom/badlogic/gdx/math/Vector2;->x:F */
	 /* iget v1, p1, Lcom/badlogic/gdx/math/Vector2;->x:F */
	 /* mul-float/2addr v0, v1 */
	 /* iget v1, p0, Lcom/badlogic/gdx/math/Vector2;->y:F */
	 /* iget v2, p1, Lcom/badlogic/gdx/math/Vector2;->y:F */
	 /* mul-float/2addr v1, v2 */
	 /* add-float/2addr v0, v1 */
} // .end method
public Float dst ( Float p0, Float p1 ) {
	 /* .locals 2 */
	 /* iget v0, p0, Lcom/badlogic/gdx/math/Vector2;->x:F */
	 /* sub-float v0, p1, v0 */
	 /* iget v1, p0, Lcom/badlogic/gdx/math/Vector2;->y:F */
	 /* sub-float v1, p2, v1 */
	 /* mul-float/2addr v0, v0 */
	 /* mul-float/2addr v1, v1 */
	 /* add-float/2addr v0, v1 */
	 /* float-to-double v0, v0 */
	 java.lang.Math .sqrt ( v0,v1 );
	 /* move-result-wide v0 */
	 /* double-to-float v0, v0 */
} // .end method
public Float dst ( com.badlogic.gdx.math.Vector2 p0 ) {
	 /* .locals 3 */
	 /* iget v0, p1, Lcom/badlogic/gdx/math/Vector2;->x:F */
	 /* iget v1, p0, Lcom/badlogic/gdx/math/Vector2;->x:F */
	 /* sub-float/2addr v0, v1 */
	 /* iget v1, p1, Lcom/badlogic/gdx/math/Vector2;->y:F */
	 /* iget v2, p0, Lcom/badlogic/gdx/math/Vector2;->y:F */
	 /* sub-float/2addr v1, v2 */
	 /* mul-float/2addr v0, v0 */
	 /* mul-float/2addr v1, v1 */
	 /* add-float/2addr v0, v1 */
	 /* float-to-double v0, v0 */
	 java.lang.Math .sqrt ( v0,v1 );
	 /* move-result-wide v0 */
	 /* double-to-float v0, v0 */
} // .end method
public Float dst2 ( com.badlogic.gdx.math.Vector2 p0 ) {
	 /* .locals 3 */
	 /* iget v0, p1, Lcom/badlogic/gdx/math/Vector2;->x:F */
	 /* iget v1, p0, Lcom/badlogic/gdx/math/Vector2;->x:F */
	 /* sub-float/2addr v0, v1 */
	 /* iget v1, p1, Lcom/badlogic/gdx/math/Vector2;->y:F */
	 /* iget v2, p0, Lcom/badlogic/gdx/math/Vector2;->y:F */
	 /* sub-float/2addr v1, v2 */
	 /* mul-float/2addr v0, v0 */
	 /* mul-float/2addr v1, v1 */
	 /* add-float/2addr v0, v1 */
} // .end method
public Float len ( ) {
	 /* .locals 3 */
	 /* iget v0, p0, Lcom/badlogic/gdx/math/Vector2;->x:F */
	 /* iget v1, p0, Lcom/badlogic/gdx/math/Vector2;->x:F */
	 /* mul-float/2addr v0, v1 */
	 /* iget v1, p0, Lcom/badlogic/gdx/math/Vector2;->y:F */
	 /* iget v2, p0, Lcom/badlogic/gdx/math/Vector2;->y:F */
	 /* mul-float/2addr v1, v2 */
	 /* add-float/2addr v0, v1 */
	 /* float-to-double v0, v0 */
	 java.lang.Math .sqrt ( v0,v1 );
	 /* move-result-wide v0 */
	 /* double-to-float v0, v0 */
} // .end method
public Float len2 ( ) {
	 /* .locals 3 */
	 /* iget v0, p0, Lcom/badlogic/gdx/math/Vector2;->x:F */
	 /* iget v1, p0, Lcom/badlogic/gdx/math/Vector2;->x:F */
	 /* mul-float/2addr v0, v1 */
	 /* iget v1, p0, Lcom/badlogic/gdx/math/Vector2;->y:F */
	 /* iget v2, p0, Lcom/badlogic/gdx/math/Vector2;->y:F */
	 /* mul-float/2addr v1, v2 */
	 /* add-float/2addr v0, v1 */
} // .end method
public com.badlogic.gdx.math.Vector2 lerp ( com.badlogic.gdx.math.Vector2 p0, Float p1 ) {
	 /* .locals 2 */
	 /* const/high16 v0, 0x3f800000 # 1.0f */
	 /* sub-float/2addr v0, p2 */
	 (( com.badlogic.gdx.math.Vector2 ) p0 ).mul ( v0 ); // invoke-virtual {p0, v0}, Lcom/badlogic/gdx/math/Vector2;->mul(F)Lcom/badlogic/gdx/math/Vector2;
	 (( com.badlogic.gdx.math.Vector2 ) p1 ).tmp ( ); // invoke-virtual {p1}, Lcom/badlogic/gdx/math/Vector2;->tmp()Lcom/badlogic/gdx/math/Vector2;
	 (( com.badlogic.gdx.math.Vector2 ) v1 ).mul ( p2 ); // invoke-virtual {v1, p2}, Lcom/badlogic/gdx/math/Vector2;->mul(F)Lcom/badlogic/gdx/math/Vector2;
	 (( com.badlogic.gdx.math.Vector2 ) v0 ).add ( v1 ); // invoke-virtual {v0, v1}, Lcom/badlogic/gdx/math/Vector2;->add(Lcom/badlogic/gdx/math/Vector2;)Lcom/badlogic/gdx/math/Vector2;
} // .end method
public com.badlogic.gdx.math.Vector2 mul ( Float p0 ) {
	 /* .locals 1 */
	 /* iget v0, p0, Lcom/badlogic/gdx/math/Vector2;->x:F */
	 /* mul-float/2addr v0, p1 */
	 /* iput v0, p0, Lcom/badlogic/gdx/math/Vector2;->x:F */
	 /* iget v0, p0, Lcom/badlogic/gdx/math/Vector2;->y:F */
	 /* mul-float/2addr v0, p1 */
	 /* iput v0, p0, Lcom/badlogic/gdx/math/Vector2;->y:F */
} // .end method
public com.badlogic.gdx.math.Vector2 mul ( com.badlogic.gdx.math.Matrix3 p0 ) {
	 /* .locals 5 */
	 /* iget v0, p0, Lcom/badlogic/gdx/math/Vector2;->x:F */
	 v1 = this.vals;
	 int v2 = 0; // const/4 v2, 0x0
	 /* aget v1, v1, v2 */
	 /* mul-float/2addr v0, v1 */
	 /* iget v1, p0, Lcom/badlogic/gdx/math/Vector2;->y:F */
	 v2 = this.vals;
	 int v3 = 3; // const/4 v3, 0x3
	 /* aget v2, v2, v3 */
	 /* mul-float/2addr v1, v2 */
	 /* add-float/2addr v0, v1 */
	 v1 = this.vals;
	 int v2 = 6; // const/4 v2, 0x6
	 /* aget v1, v1, v2 */
	 /* add-float/2addr v0, v1 */
	 /* iget v1, p0, Lcom/badlogic/gdx/math/Vector2;->x:F */
	 v2 = this.vals;
	 int v3 = 1; // const/4 v3, 0x1
	 /* aget v2, v2, v3 */
	 /* mul-float/2addr v1, v2 */
	 /* iget v2, p0, Lcom/badlogic/gdx/math/Vector2;->y:F */
	 v3 = this.vals;
	 int v4 = 4; // const/4 v4, 0x4
	 /* aget v3, v3, v4 */
	 /* mul-float/2addr v2, v3 */
	 /* add-float/2addr v1, v2 */
	 v2 = this.vals;
	 int v3 = 7; // const/4 v3, 0x7
	 /* aget v2, v2, v3 */
	 /* add-float/2addr v1, v2 */
	 /* iput v0, p0, Lcom/badlogic/gdx/math/Vector2;->x:F */
	 /* iput v1, p0, Lcom/badlogic/gdx/math/Vector2;->y:F */
} // .end method
public com.badlogic.gdx.math.Vector2 nor ( ) {
	 /* .locals 2 */
	 v0 = 	 (( com.badlogic.gdx.math.Vector2 ) p0 ).len ( ); // invoke-virtual {p0}, Lcom/badlogic/gdx/math/Vector2;->len()F
	 int v1 = 0; // const/4 v1, 0x0
	 /* cmpl-float v1, v0, v1 */
	 if ( v1 != null) { // if-eqz v1, :cond_0
		 /* iget v1, p0, Lcom/badlogic/gdx/math/Vector2;->x:F */
		 /* div-float/2addr v1, v0 */
		 /* iput v1, p0, Lcom/badlogic/gdx/math/Vector2;->x:F */
		 /* iget v1, p0, Lcom/badlogic/gdx/math/Vector2;->y:F */
		 /* div-float v0, v1, v0 */
		 /* iput v0, p0, Lcom/badlogic/gdx/math/Vector2;->y:F */
	 } // :cond_0
} // .end method
public com.badlogic.gdx.math.Vector2 rotate ( Float p0 ) {
	 /* .locals 4 */
	 /* const v0, 0x3c8efa35 */
	 /* mul-float/2addr v0, p1 */
	 /* float-to-double v1, v0 */
	 java.lang.Math .cos ( v1,v2 );
	 /* move-result-wide v1 */
	 /* double-to-float v1, v1 */
	 /* float-to-double v2, v0 */
	 java.lang.Math .sin ( v2,v3 );
	 /* move-result-wide v2 */
	 /* double-to-float v0, v2 */
	 /* iget v2, p0, Lcom/badlogic/gdx/math/Vector2;->x:F */
	 /* mul-float/2addr v2, v1 */
	 /* iget v3, p0, Lcom/badlogic/gdx/math/Vector2;->y:F */
	 /* mul-float/2addr v3, v0 */
	 /* sub-float/2addr v2, v3 */
	 /* iget v3, p0, Lcom/badlogic/gdx/math/Vector2;->x:F */
	 /* mul-float/2addr v0, v3 */
	 /* iget v3, p0, Lcom/badlogic/gdx/math/Vector2;->y:F */
	 /* mul-float/2addr v1, v3 */
	 /* add-float/2addr v0, v1 */
	 /* iput v2, p0, Lcom/badlogic/gdx/math/Vector2;->x:F */
	 /* iput v0, p0, Lcom/badlogic/gdx/math/Vector2;->y:F */
} // .end method
public com.badlogic.gdx.math.Vector2 set ( Float p0, Float p1 ) {
	 /* .locals 0 */
	 /* iput p1, p0, Lcom/badlogic/gdx/math/Vector2;->x:F */
	 /* iput p2, p0, Lcom/badlogic/gdx/math/Vector2;->y:F */
} // .end method
public com.badlogic.gdx.math.Vector2 set ( com.badlogic.gdx.math.Vector2 p0 ) {
	 /* .locals 1 */
	 /* iget v0, p1, Lcom/badlogic/gdx/math/Vector2;->x:F */
	 /* iput v0, p0, Lcom/badlogic/gdx/math/Vector2;->x:F */
	 /* iget v0, p1, Lcom/badlogic/gdx/math/Vector2;->y:F */
	 /* iput v0, p0, Lcom/badlogic/gdx/math/Vector2;->y:F */
} // .end method
public com.badlogic.gdx.math.Vector2 sub ( Float p0, Float p1 ) {
	 /* .locals 1 */
	 /* iget v0, p0, Lcom/badlogic/gdx/math/Vector2;->x:F */
	 /* sub-float/2addr v0, p1 */
	 /* iput v0, p0, Lcom/badlogic/gdx/math/Vector2;->x:F */
	 /* iget v0, p0, Lcom/badlogic/gdx/math/Vector2;->y:F */
	 /* sub-float/2addr v0, p2 */
	 /* iput v0, p0, Lcom/badlogic/gdx/math/Vector2;->y:F */
} // .end method
public com.badlogic.gdx.math.Vector2 sub ( com.badlogic.gdx.math.Vector2 p0 ) {
	 /* .locals 2 */
	 /* iget v0, p0, Lcom/badlogic/gdx/math/Vector2;->x:F */
	 /* iget v1, p1, Lcom/badlogic/gdx/math/Vector2;->x:F */
	 /* sub-float/2addr v0, v1 */
	 /* iput v0, p0, Lcom/badlogic/gdx/math/Vector2;->x:F */
	 /* iget v0, p0, Lcom/badlogic/gdx/math/Vector2;->y:F */
	 /* iget v1, p1, Lcom/badlogic/gdx/math/Vector2;->y:F */
	 /* sub-float/2addr v0, v1 */
	 /* iput v0, p0, Lcom/badlogic/gdx/math/Vector2;->y:F */
} // .end method
public com.badlogic.gdx.math.Vector2 tmp ( ) {
	 /* .locals 1 */
	 v0 = com.badlogic.gdx.math.Vector2.tmp;
	 (( com.badlogic.gdx.math.Vector2 ) v0 ).set ( p0 ); // invoke-virtual {v0, p0}, Lcom/badlogic/gdx/math/Vector2;->set(Lcom/badlogic/gdx/math/Vector2;)Lcom/badlogic/gdx/math/Vector2;
} // .end method
public java.lang.String toString ( ) {
	 /* .locals 2 */
	 /* new-instance v0, Ljava/lang/StringBuilder; */
	 /* invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V */
	 final String v1 = "["; // const-string v1, "["
	 (( java.lang.StringBuilder ) v0 ).append ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
	 /* iget v1, p0, Lcom/badlogic/gdx/math/Vector2;->x:F */
	 (( java.lang.StringBuilder ) v0 ).append ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;
	 final String v1 = ":"; // const-string v1, ":"
	 (( java.lang.StringBuilder ) v0 ).append ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
	 /* iget v1, p0, Lcom/badlogic/gdx/math/Vector2;->y:F */
	 (( java.lang.StringBuilder ) v0 ).append ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;
	 final String v1 = "]"; // const-string v1, "]"
	 (( java.lang.StringBuilder ) v0 ).append ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
	 (( java.lang.StringBuilder ) v0 ).toString ( ); // invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
} // .end method
