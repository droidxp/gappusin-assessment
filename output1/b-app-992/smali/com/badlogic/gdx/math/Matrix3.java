public class com.badlogic.gdx.math.Matrix3 implements java.io.Serializable {
	 /* # interfaces */
	 /* # static fields */
	 private static final Float DEGREE_TO_RAD;
	 private static final Long serialVersionUID;
	 /* # instance fields */
	 private tmp;
	 public vals;
	 /* # direct methods */
	 public com.badlogic.gdx.math.Matrix3 ( ) {
		 /* .locals 2 */
		 /* const/16 v1, 0x9 */
		 /* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
		 /* new-array v0, v1, [F */
		 this.vals = v0;
		 /* new-array v0, v1, [F */
		 this.tmp = v0;
		 (( com.badlogic.gdx.math.Matrix3 ) p0 ).idt ( ); // invoke-virtual {p0}, Lcom/badlogic/gdx/math/Matrix3;->idt()Lcom/badlogic/gdx/math/Matrix3;
		 return;
	 } // .end method
	 private static void mul ( Float[] p0, Float[] p1 ) {
		 /* .locals 11 */
		 int v0 = 0; // const/4 v0, 0x0
		 /* aget v0, p0, v0 */
		 int v1 = 0; // const/4 v1, 0x0
		 /* aget v1, p1, v1 */
		 /* mul-float/2addr v0, v1 */
		 int v1 = 3; // const/4 v1, 0x3
		 /* aget v1, p0, v1 */
		 int v2 = 1; // const/4 v2, 0x1
		 /* aget v2, p1, v2 */
		 /* mul-float/2addr v1, v2 */
		 /* add-float/2addr v0, v1 */
		 int v1 = 6; // const/4 v1, 0x6
		 /* aget v1, p0, v1 */
		 int v2 = 2; // const/4 v2, 0x2
		 /* aget v2, p1, v2 */
		 /* mul-float/2addr v1, v2 */
		 /* add-float/2addr v0, v1 */
		 int v1 = 0; // const/4 v1, 0x0
		 /* aget v1, p0, v1 */
		 int v2 = 3; // const/4 v2, 0x3
		 /* aget v2, p1, v2 */
		 /* mul-float/2addr v1, v2 */
		 int v2 = 3; // const/4 v2, 0x3
		 /* aget v2, p0, v2 */
		 int v3 = 4; // const/4 v3, 0x4
		 /* aget v3, p1, v3 */
		 /* mul-float/2addr v2, v3 */
		 /* add-float/2addr v1, v2 */
		 int v2 = 6; // const/4 v2, 0x6
		 /* aget v2, p0, v2 */
		 int v3 = 5; // const/4 v3, 0x5
		 /* aget v3, p1, v3 */
		 /* mul-float/2addr v2, v3 */
		 /* add-float/2addr v1, v2 */
		 int v2 = 0; // const/4 v2, 0x0
		 /* aget v2, p0, v2 */
		 int v3 = 6; // const/4 v3, 0x6
		 /* aget v3, p1, v3 */
		 /* mul-float/2addr v2, v3 */
		 int v3 = 3; // const/4 v3, 0x3
		 /* aget v3, p0, v3 */
		 int v4 = 7; // const/4 v4, 0x7
		 /* aget v4, p1, v4 */
		 /* mul-float/2addr v3, v4 */
		 /* add-float/2addr v2, v3 */
		 int v3 = 6; // const/4 v3, 0x6
		 /* aget v3, p0, v3 */
		 /* const/16 v4, 0x8 */
		 /* aget v4, p1, v4 */
		 /* mul-float/2addr v3, v4 */
		 /* add-float/2addr v2, v3 */
		 int v3 = 1; // const/4 v3, 0x1
		 /* aget v3, p0, v3 */
		 int v4 = 0; // const/4 v4, 0x0
		 /* aget v4, p1, v4 */
		 /* mul-float/2addr v3, v4 */
		 int v4 = 4; // const/4 v4, 0x4
		 /* aget v4, p0, v4 */
		 int v5 = 1; // const/4 v5, 0x1
		 /* aget v5, p1, v5 */
		 /* mul-float/2addr v4, v5 */
		 /* add-float/2addr v3, v4 */
		 int v4 = 7; // const/4 v4, 0x7
		 /* aget v4, p0, v4 */
		 int v5 = 2; // const/4 v5, 0x2
		 /* aget v5, p1, v5 */
		 /* mul-float/2addr v4, v5 */
		 /* add-float/2addr v3, v4 */
		 int v4 = 1; // const/4 v4, 0x1
		 /* aget v4, p0, v4 */
		 int v5 = 3; // const/4 v5, 0x3
		 /* aget v5, p1, v5 */
		 /* mul-float/2addr v4, v5 */
		 int v5 = 4; // const/4 v5, 0x4
		 /* aget v5, p0, v5 */
		 int v6 = 4; // const/4 v6, 0x4
		 /* aget v6, p1, v6 */
		 /* mul-float/2addr v5, v6 */
		 /* add-float/2addr v4, v5 */
		 int v5 = 7; // const/4 v5, 0x7
		 /* aget v5, p0, v5 */
		 int v6 = 5; // const/4 v6, 0x5
		 /* aget v6, p1, v6 */
		 /* mul-float/2addr v5, v6 */
		 /* add-float/2addr v4, v5 */
		 int v5 = 1; // const/4 v5, 0x1
		 /* aget v5, p0, v5 */
		 int v6 = 6; // const/4 v6, 0x6
		 /* aget v6, p1, v6 */
		 /* mul-float/2addr v5, v6 */
		 int v6 = 4; // const/4 v6, 0x4
		 /* aget v6, p0, v6 */
		 int v7 = 7; // const/4 v7, 0x7
		 /* aget v7, p1, v7 */
		 /* mul-float/2addr v6, v7 */
		 /* add-float/2addr v5, v6 */
		 int v6 = 7; // const/4 v6, 0x7
		 /* aget v6, p0, v6 */
		 /* const/16 v7, 0x8 */
		 /* aget v7, p1, v7 */
		 /* mul-float/2addr v6, v7 */
		 /* add-float/2addr v5, v6 */
		 int v6 = 2; // const/4 v6, 0x2
		 /* aget v6, p0, v6 */
		 int v7 = 0; // const/4 v7, 0x0
		 /* aget v7, p1, v7 */
		 /* mul-float/2addr v6, v7 */
		 int v7 = 5; // const/4 v7, 0x5
		 /* aget v7, p0, v7 */
		 int v8 = 1; // const/4 v8, 0x1
		 /* aget v8, p1, v8 */
		 /* mul-float/2addr v7, v8 */
		 /* add-float/2addr v6, v7 */
		 /* const/16 v7, 0x8 */
		 /* aget v7, p0, v7 */
		 int v8 = 2; // const/4 v8, 0x2
		 /* aget v8, p1, v8 */
		 /* mul-float/2addr v7, v8 */
		 /* add-float/2addr v6, v7 */
		 int v7 = 2; // const/4 v7, 0x2
		 /* aget v7, p0, v7 */
		 int v8 = 3; // const/4 v8, 0x3
		 /* aget v8, p1, v8 */
		 /* mul-float/2addr v7, v8 */
		 int v8 = 5; // const/4 v8, 0x5
		 /* aget v8, p0, v8 */
		 int v9 = 4; // const/4 v9, 0x4
		 /* aget v9, p1, v9 */
		 /* mul-float/2addr v8, v9 */
		 /* add-float/2addr v7, v8 */
		 /* const/16 v8, 0x8 */
		 /* aget v8, p0, v8 */
		 int v9 = 5; // const/4 v9, 0x5
		 /* aget v9, p1, v9 */
		 /* mul-float/2addr v8, v9 */
		 /* add-float/2addr v7, v8 */
		 int v8 = 2; // const/4 v8, 0x2
		 /* aget v8, p0, v8 */
		 int v9 = 6; // const/4 v9, 0x6
		 /* aget v9, p1, v9 */
		 /* mul-float/2addr v8, v9 */
		 int v9 = 5; // const/4 v9, 0x5
		 /* aget v9, p0, v9 */
		 int v10 = 7; // const/4 v10, 0x7
		 /* aget v10, p1, v10 */
		 /* mul-float/2addr v9, v10 */
		 /* add-float/2addr v8, v9 */
		 /* const/16 v9, 0x8 */
		 /* aget v9, p0, v9 */
		 /* const/16 v10, 0x8 */
		 /* aget p1, p1, v10 */
		 /* mul-float/2addr p1, v9 */
		 /* add-float/2addr p1, v8 */
		 int v8 = 0; // const/4 v8, 0x0
		 /* aput v0, p0, v8 */
		 int v0 = 1; // const/4 v0, 0x1
		 /* aput v3, p0, v0 */
		 int v0 = 2; // const/4 v0, 0x2
		 /* aput v6, p0, v0 */
		 int v0 = 3; // const/4 v0, 0x3
		 /* aput v1, p0, v0 */
		 int v0 = 4; // const/4 v0, 0x4
		 /* aput v4, p0, v0 */
		 int v0 = 5; // const/4 v0, 0x5
		 /* aput v7, p0, v0 */
		 int v0 = 6; // const/4 v0, 0x6
		 /* aput v2, p0, v0 */
		 int v0 = 7; // const/4 v0, 0x7
		 /* aput v5, p0, v0 */
		 /* const/16 v0, 0x8 */
		 /* aput p1, p0, v0 */
		 return;
	 } // .end method
	 /* # virtual methods */
	 public Float det ( ) {
		 /* .locals 9 */
		 int v8 = 4; // const/4 v8, 0x4
		 int v7 = 3; // const/4 v7, 0x3
		 int v6 = 2; // const/4 v6, 0x2
		 int v5 = 1; // const/4 v5, 0x1
		 int v4 = 0; // const/4 v4, 0x0
		 v0 = this.vals;
		 /* aget v0, v0, v4 */
		 v1 = this.vals;
		 /* aget v1, v1, v8 */
		 /* mul-float/2addr v0, v1 */
		 v1 = this.vals;
		 /* const/16 v2, 0x8 */
		 /* aget v1, v1, v2 */
		 /* mul-float/2addr v0, v1 */
		 v1 = this.vals;
		 /* aget v1, v1, v7 */
		 v2 = this.vals;
		 int v3 = 7; // const/4 v3, 0x7
		 /* aget v2, v2, v3 */
		 /* mul-float/2addr v1, v2 */
		 v2 = this.vals;
		 /* aget v2, v2, v6 */
		 /* mul-float/2addr v1, v2 */
		 /* add-float/2addr v0, v1 */
		 v1 = this.vals;
		 int v2 = 6; // const/4 v2, 0x6
		 /* aget v1, v1, v2 */
		 v2 = this.vals;
		 /* aget v2, v2, v5 */
		 /* mul-float/2addr v1, v2 */
		 v2 = this.vals;
		 int v3 = 5; // const/4 v3, 0x5
		 /* aget v2, v2, v3 */
		 /* mul-float/2addr v1, v2 */
		 /* add-float/2addr v0, v1 */
		 v1 = this.vals;
		 /* aget v1, v1, v4 */
		 v2 = this.vals;
		 int v3 = 7; // const/4 v3, 0x7
		 /* aget v2, v2, v3 */
		 /* mul-float/2addr v1, v2 */
		 v2 = this.vals;
		 int v3 = 5; // const/4 v3, 0x5
		 /* aget v2, v2, v3 */
		 /* mul-float/2addr v1, v2 */
		 /* sub-float/2addr v0, v1 */
		 v1 = this.vals;
		 /* aget v1, v1, v7 */
		 v2 = this.vals;
		 /* aget v2, v2, v5 */
		 /* mul-float/2addr v1, v2 */
		 v2 = this.vals;
		 /* const/16 v3, 0x8 */
		 /* aget v2, v2, v3 */
		 /* mul-float/2addr v1, v2 */
		 /* sub-float/2addr v0, v1 */
		 v1 = this.vals;
		 int v2 = 6; // const/4 v2, 0x6
		 /* aget v1, v1, v2 */
		 v2 = this.vals;
		 /* aget v2, v2, v8 */
		 /* mul-float/2addr v1, v2 */
		 v2 = this.vals;
		 /* aget v2, v2, v6 */
		 /* mul-float/2addr v1, v2 */
		 /* sub-float/2addr v0, v1 */
	 } // .end method
	 public getValues ( ) {
		 /* .locals 1 */
		 v0 = this.vals;
	 } // .end method
	 public com.badlogic.gdx.math.Matrix3 idt ( ) {
		 /* .locals 4 */
		 /* const/high16 v3, 0x3f800000 # 1.0f */
		 int v2 = 0; // const/4 v2, 0x0
		 v0 = this.vals;
		 int v1 = 0; // const/4 v1, 0x0
		 /* aput v3, v0, v1 */
		 v0 = this.vals;
		 int v1 = 1; // const/4 v1, 0x1
		 /* aput v2, v0, v1 */
		 v0 = this.vals;
		 int v1 = 2; // const/4 v1, 0x2
		 /* aput v2, v0, v1 */
		 v0 = this.vals;
		 int v1 = 3; // const/4 v1, 0x3
		 /* aput v2, v0, v1 */
		 v0 = this.vals;
		 int v1 = 4; // const/4 v1, 0x4
		 /* aput v3, v0, v1 */
		 v0 = this.vals;
		 int v1 = 5; // const/4 v1, 0x5
		 /* aput v2, v0, v1 */
		 v0 = this.vals;
		 int v1 = 6; // const/4 v1, 0x6
		 /* aput v2, v0, v1 */
		 v0 = this.vals;
		 int v1 = 7; // const/4 v1, 0x7
		 /* aput v2, v0, v1 */
		 v0 = this.vals;
		 /* const/16 v1, 0x8 */
		 /* aput v3, v0, v1 */
	 } // .end method
	 public com.badlogic.gdx.math.Matrix3 inv ( ) {
		 /* .locals 12 */
		 int v11 = 4; // const/4 v11, 0x4
		 int v10 = 3; // const/4 v10, 0x3
		 int v9 = 2; // const/4 v9, 0x2
		 int v8 = 1; // const/4 v8, 0x1
		 int v7 = 0; // const/4 v7, 0x0
		 v0 = 		 (( com.badlogic.gdx.math.Matrix3 ) p0 ).det ( ); // invoke-virtual {p0}, Lcom/badlogic/gdx/math/Matrix3;->det()F
		 int v1 = 0; // const/4 v1, 0x0
		 /* cmpl-float v1, v0, v1 */
		 /* if-nez v1, :cond_0 */
		 /* new-instance v0, Lcom/badlogic/gdx/utils/GdxRuntimeException; */
		 final String v1 = "Can\'t invert a singular matrix"; // const-string v1, "Can\'t invert a singular matrix"
		 /* invoke-direct {v0, v1}, Lcom/badlogic/gdx/utils/GdxRuntimeException;-><init>(Ljava/lang/String;)V */
		 /* throw v0 */
	 } // :cond_0
	 /* const/high16 v1, 0x3f800000 # 1.0f */
	 /* div-float v0, v1, v0 */
	 /* const/16 v1, 0x9 */
	 /* new-array v1, v1, [F */
	 /* fill-array-data v1, :array_0 */
	 v2 = this.vals;
	 /* aget v2, v2, v11 */
	 v3 = this.vals;
	 /* const/16 v4, 0x8 */
	 /* aget v3, v3, v4 */
	 /* mul-float/2addr v2, v3 */
	 v3 = this.vals;
	 int v4 = 5; // const/4 v4, 0x5
	 /* aget v3, v3, v4 */
	 v4 = this.vals;
	 int v5 = 7; // const/4 v5, 0x7
	 /* aget v4, v4, v5 */
	 /* mul-float/2addr v3, v4 */
	 /* sub-float/2addr v2, v3 */
	 /* aput v2, v1, v7 */
	 v2 = this.vals;
	 /* aget v2, v2, v9 */
	 v3 = this.vals;
	 int v4 = 7; // const/4 v4, 0x7
	 /* aget v3, v3, v4 */
	 /* mul-float/2addr v2, v3 */
	 v3 = this.vals;
	 /* aget v3, v3, v8 */
	 v4 = this.vals;
	 /* const/16 v5, 0x8 */
	 /* aget v4, v4, v5 */
	 /* mul-float/2addr v3, v4 */
	 /* sub-float/2addr v2, v3 */
	 /* aput v2, v1, v8 */
	 v2 = this.vals;
	 /* aget v2, v2, v8 */
	 v3 = this.vals;
	 int v4 = 5; // const/4 v4, 0x5
	 /* aget v3, v3, v4 */
	 /* mul-float/2addr v2, v3 */
	 v3 = this.vals;
	 /* aget v3, v3, v9 */
	 v4 = this.vals;
	 /* aget v4, v4, v11 */
	 /* mul-float/2addr v3, v4 */
	 /* sub-float/2addr v2, v3 */
	 /* aput v2, v1, v9 */
	 v2 = this.vals;
	 int v3 = 5; // const/4 v3, 0x5
	 /* aget v2, v2, v3 */
	 v3 = this.vals;
	 int v4 = 6; // const/4 v4, 0x6
	 /* aget v3, v3, v4 */
	 /* mul-float/2addr v2, v3 */
	 v3 = this.vals;
	 /* aget v3, v3, v10 */
	 v4 = this.vals;
	 /* const/16 v5, 0x8 */
	 /* aget v4, v4, v5 */
	 /* mul-float/2addr v3, v4 */
	 /* sub-float/2addr v2, v3 */
	 /* aput v2, v1, v10 */
	 v2 = this.vals;
	 /* aget v2, v2, v7 */
	 v3 = this.vals;
	 /* const/16 v4, 0x8 */
	 /* aget v3, v3, v4 */
	 /* mul-float/2addr v2, v3 */
	 v3 = this.vals;
	 /* aget v3, v3, v9 */
	 v4 = this.vals;
	 int v5 = 6; // const/4 v5, 0x6
	 /* aget v4, v4, v5 */
	 /* mul-float/2addr v3, v4 */
	 /* sub-float/2addr v2, v3 */
	 /* aput v2, v1, v11 */
	 int v2 = 5; // const/4 v2, 0x5
	 v3 = this.vals;
	 /* aget v3, v3, v9 */
	 v4 = this.vals;
	 /* aget v4, v4, v10 */
	 /* mul-float/2addr v3, v4 */
	 v4 = this.vals;
	 /* aget v4, v4, v7 */
	 v5 = this.vals;
	 int v6 = 5; // const/4 v6, 0x5
	 /* aget v5, v5, v6 */
	 /* mul-float/2addr v4, v5 */
	 /* sub-float/2addr v3, v4 */
	 /* aput v3, v1, v2 */
	 int v2 = 6; // const/4 v2, 0x6
	 v3 = this.vals;
	 /* aget v3, v3, v10 */
	 v4 = this.vals;
	 int v5 = 7; // const/4 v5, 0x7
	 /* aget v4, v4, v5 */
	 /* mul-float/2addr v3, v4 */
	 v4 = this.vals;
	 /* aget v4, v4, v11 */
	 v5 = this.vals;
	 int v6 = 6; // const/4 v6, 0x6
	 /* aget v5, v5, v6 */
	 /* mul-float/2addr v4, v5 */
	 /* sub-float/2addr v3, v4 */
	 /* aput v3, v1, v2 */
	 int v2 = 7; // const/4 v2, 0x7
	 v3 = this.vals;
	 /* aget v3, v3, v8 */
	 v4 = this.vals;
	 int v5 = 6; // const/4 v5, 0x6
	 /* aget v4, v4, v5 */
	 /* mul-float/2addr v3, v4 */
	 v4 = this.vals;
	 /* aget v4, v4, v7 */
	 v5 = this.vals;
	 int v6 = 7; // const/4 v6, 0x7
	 /* aget v5, v5, v6 */
	 /* mul-float/2addr v4, v5 */
	 /* sub-float/2addr v3, v4 */
	 /* aput v3, v1, v2 */
	 /* const/16 v2, 0x8 */
	 v3 = this.vals;
	 /* aget v3, v3, v7 */
	 v4 = this.vals;
	 /* aget v4, v4, v11 */
	 /* mul-float/2addr v3, v4 */
	 v4 = this.vals;
	 /* aget v4, v4, v8 */
	 v5 = this.vals;
	 /* aget v5, v5, v10 */
	 /* mul-float/2addr v4, v5 */
	 /* sub-float/2addr v3, v4 */
	 /* aput v3, v1, v2 */
	 v2 = this.vals;
	 /* aget v3, v1, v7 */
	 /* mul-float/2addr v3, v0 */
	 /* aput v3, v2, v7 */
	 v2 = this.vals;
	 /* aget v3, v1, v8 */
	 /* mul-float/2addr v3, v0 */
	 /* aput v3, v2, v8 */
	 v2 = this.vals;
	 /* aget v3, v1, v9 */
	 /* mul-float/2addr v3, v0 */
	 /* aput v3, v2, v9 */
	 v2 = this.vals;
	 /* aget v3, v1, v10 */
	 /* mul-float/2addr v3, v0 */
	 /* aput v3, v2, v10 */
	 v2 = this.vals;
	 /* aget v3, v1, v11 */
	 /* mul-float/2addr v3, v0 */
	 /* aput v3, v2, v11 */
	 v2 = this.vals;
	 int v3 = 5; // const/4 v3, 0x5
	 int v4 = 5; // const/4 v4, 0x5
	 /* aget v4, v1, v4 */
	 /* mul-float/2addr v4, v0 */
	 /* aput v4, v2, v3 */
	 v2 = this.vals;
	 int v3 = 6; // const/4 v3, 0x6
	 int v4 = 6; // const/4 v4, 0x6
	 /* aget v4, v1, v4 */
	 /* mul-float/2addr v4, v0 */
	 /* aput v4, v2, v3 */
	 v2 = this.vals;
	 int v3 = 7; // const/4 v3, 0x7
	 int v4 = 7; // const/4 v4, 0x7
	 /* aget v4, v1, v4 */
	 /* mul-float/2addr v4, v0 */
	 /* aput v4, v2, v3 */
	 v2 = this.vals;
	 /* const/16 v3, 0x8 */
	 /* const/16 v4, 0x8 */
	 /* aget v1, v1, v4 */
	 /* mul-float/2addr v0, v1 */
	 /* aput v0, v2, v3 */
	 /* nop */
	 /* :array_0 */
	 /* .array-data 4 */
	 /* 0x0 */
	 /* 0x0 */
	 /* 0x0 */
	 /* 0x0 */
	 /* 0x0 */
	 /* 0x0 */
	 /* 0x0 */
	 /* 0x0 */
	 /* 0x0 */
} // .end array-data
} // .end method
public com.badlogic.gdx.math.Matrix3 mul ( com.badlogic.gdx.math.Matrix3 p0 ) {
/* .locals 12 */
v0 = this.vals;
int v1 = 0; // const/4 v1, 0x0
/* aget v0, v0, v1 */
v1 = this.vals;
int v2 = 0; // const/4 v2, 0x0
/* aget v1, v1, v2 */
/* mul-float/2addr v0, v1 */
v1 = this.vals;
int v2 = 3; // const/4 v2, 0x3
/* aget v1, v1, v2 */
v2 = this.vals;
int v3 = 1; // const/4 v3, 0x1
/* aget v2, v2, v3 */
/* mul-float/2addr v1, v2 */
/* add-float/2addr v0, v1 */
v1 = this.vals;
int v2 = 6; // const/4 v2, 0x6
/* aget v1, v1, v2 */
v2 = this.vals;
int v3 = 2; // const/4 v3, 0x2
/* aget v2, v2, v3 */
/* mul-float/2addr v1, v2 */
/* add-float/2addr v0, v1 */
v1 = this.vals;
int v2 = 0; // const/4 v2, 0x0
/* aget v1, v1, v2 */
v2 = this.vals;
int v3 = 3; // const/4 v3, 0x3
/* aget v2, v2, v3 */
/* mul-float/2addr v1, v2 */
v2 = this.vals;
int v3 = 3; // const/4 v3, 0x3
/* aget v2, v2, v3 */
v3 = this.vals;
int v4 = 4; // const/4 v4, 0x4
/* aget v3, v3, v4 */
/* mul-float/2addr v2, v3 */
/* add-float/2addr v1, v2 */
v2 = this.vals;
int v3 = 6; // const/4 v3, 0x6
/* aget v2, v2, v3 */
v3 = this.vals;
int v4 = 5; // const/4 v4, 0x5
/* aget v3, v3, v4 */
/* mul-float/2addr v2, v3 */
/* add-float/2addr v1, v2 */
v2 = this.vals;
int v3 = 0; // const/4 v3, 0x0
/* aget v2, v2, v3 */
v3 = this.vals;
int v4 = 6; // const/4 v4, 0x6
/* aget v3, v3, v4 */
/* mul-float/2addr v2, v3 */
v3 = this.vals;
int v4 = 3; // const/4 v4, 0x3
/* aget v3, v3, v4 */
v4 = this.vals;
int v5 = 7; // const/4 v5, 0x7
/* aget v4, v4, v5 */
/* mul-float/2addr v3, v4 */
/* add-float/2addr v2, v3 */
v3 = this.vals;
int v4 = 6; // const/4 v4, 0x6
/* aget v3, v3, v4 */
v4 = this.vals;
/* const/16 v5, 0x8 */
/* aget v4, v4, v5 */
/* mul-float/2addr v3, v4 */
/* add-float/2addr v2, v3 */
v3 = this.vals;
int v4 = 1; // const/4 v4, 0x1
/* aget v3, v3, v4 */
v4 = this.vals;
int v5 = 0; // const/4 v5, 0x0
/* aget v4, v4, v5 */
/* mul-float/2addr v3, v4 */
v4 = this.vals;
int v5 = 4; // const/4 v5, 0x4
/* aget v4, v4, v5 */
v5 = this.vals;
int v6 = 1; // const/4 v6, 0x1
/* aget v5, v5, v6 */
/* mul-float/2addr v4, v5 */
/* add-float/2addr v3, v4 */
v4 = this.vals;
int v5 = 7; // const/4 v5, 0x7
/* aget v4, v4, v5 */
v5 = this.vals;
int v6 = 2; // const/4 v6, 0x2
/* aget v5, v5, v6 */
/* mul-float/2addr v4, v5 */
/* add-float/2addr v3, v4 */
v4 = this.vals;
int v5 = 1; // const/4 v5, 0x1
/* aget v4, v4, v5 */
v5 = this.vals;
int v6 = 3; // const/4 v6, 0x3
/* aget v5, v5, v6 */
/* mul-float/2addr v4, v5 */
v5 = this.vals;
int v6 = 4; // const/4 v6, 0x4
/* aget v5, v5, v6 */
v6 = this.vals;
int v7 = 4; // const/4 v7, 0x4
/* aget v6, v6, v7 */
/* mul-float/2addr v5, v6 */
/* add-float/2addr v4, v5 */
v5 = this.vals;
int v6 = 7; // const/4 v6, 0x7
/* aget v5, v5, v6 */
v6 = this.vals;
int v7 = 5; // const/4 v7, 0x5
/* aget v6, v6, v7 */
/* mul-float/2addr v5, v6 */
/* add-float/2addr v4, v5 */
v5 = this.vals;
int v6 = 1; // const/4 v6, 0x1
/* aget v5, v5, v6 */
v6 = this.vals;
int v7 = 6; // const/4 v7, 0x6
/* aget v6, v6, v7 */
/* mul-float/2addr v5, v6 */
v6 = this.vals;
int v7 = 4; // const/4 v7, 0x4
/* aget v6, v6, v7 */
v7 = this.vals;
int v8 = 7; // const/4 v8, 0x7
/* aget v7, v7, v8 */
/* mul-float/2addr v6, v7 */
/* add-float/2addr v5, v6 */
v6 = this.vals;
int v7 = 7; // const/4 v7, 0x7
/* aget v6, v6, v7 */
v7 = this.vals;
/* const/16 v8, 0x8 */
/* aget v7, v7, v8 */
/* mul-float/2addr v6, v7 */
/* add-float/2addr v5, v6 */
v6 = this.vals;
int v7 = 2; // const/4 v7, 0x2
/* aget v6, v6, v7 */
v7 = this.vals;
int v8 = 0; // const/4 v8, 0x0
/* aget v7, v7, v8 */
/* mul-float/2addr v6, v7 */
v7 = this.vals;
int v8 = 5; // const/4 v8, 0x5
/* aget v7, v7, v8 */
v8 = this.vals;
int v9 = 1; // const/4 v9, 0x1
/* aget v8, v8, v9 */
/* mul-float/2addr v7, v8 */
/* add-float/2addr v6, v7 */
v7 = this.vals;
/* const/16 v8, 0x8 */
/* aget v7, v7, v8 */
v8 = this.vals;
int v9 = 2; // const/4 v9, 0x2
/* aget v8, v8, v9 */
/* mul-float/2addr v7, v8 */
/* add-float/2addr v6, v7 */
v7 = this.vals;
int v8 = 2; // const/4 v8, 0x2
/* aget v7, v7, v8 */
v8 = this.vals;
int v9 = 3; // const/4 v9, 0x3
/* aget v8, v8, v9 */
/* mul-float/2addr v7, v8 */
v8 = this.vals;
int v9 = 5; // const/4 v9, 0x5
/* aget v8, v8, v9 */
v9 = this.vals;
int v10 = 4; // const/4 v10, 0x4
/* aget v9, v9, v10 */
/* mul-float/2addr v8, v9 */
/* add-float/2addr v7, v8 */
v8 = this.vals;
/* const/16 v9, 0x8 */
/* aget v8, v8, v9 */
v9 = this.vals;
int v10 = 5; // const/4 v10, 0x5
/* aget v9, v9, v10 */
/* mul-float/2addr v8, v9 */
/* add-float/2addr v7, v8 */
v8 = this.vals;
int v9 = 2; // const/4 v9, 0x2
/* aget v8, v8, v9 */
v9 = this.vals;
int v10 = 6; // const/4 v10, 0x6
/* aget v9, v9, v10 */
/* mul-float/2addr v8, v9 */
v9 = this.vals;
int v10 = 5; // const/4 v10, 0x5
/* aget v9, v9, v10 */
v10 = this.vals;
int v11 = 7; // const/4 v11, 0x7
/* aget v10, v10, v11 */
/* mul-float/2addr v9, v10 */
/* add-float/2addr v8, v9 */
v9 = this.vals;
/* const/16 v10, 0x8 */
/* aget v9, v9, v10 */
v10 = this.vals;
/* const/16 v11, 0x8 */
/* aget v10, v10, v11 */
/* mul-float/2addr v9, v10 */
/* add-float/2addr v8, v9 */
v9 = this.vals;
int v10 = 0; // const/4 v10, 0x0
/* aput v0, v9, v10 */
v0 = this.vals;
int v9 = 1; // const/4 v9, 0x1
/* aput v3, v0, v9 */
v0 = this.vals;
int v3 = 2; // const/4 v3, 0x2
/* aput v6, v0, v3 */
v0 = this.vals;
int v3 = 3; // const/4 v3, 0x3
/* aput v1, v0, v3 */
v0 = this.vals;
int v1 = 4; // const/4 v1, 0x4
/* aput v4, v0, v1 */
v0 = this.vals;
int v1 = 5; // const/4 v1, 0x5
/* aput v7, v0, v1 */
v0 = this.vals;
int v1 = 6; // const/4 v1, 0x6
/* aput v2, v0, v1 */
v0 = this.vals;
int v1 = 7; // const/4 v1, 0x7
/* aput v5, v0, v1 */
v0 = this.vals;
/* const/16 v1, 0x8 */
/* aput v8, v0, v1 */
} // .end method
public com.badlogic.gdx.math.Matrix3 rotate ( Float p0 ) {
/* .locals 5 */
int v4 = 0; // const/4 v4, 0x0
/* cmpl-float v0, p1, v4 */
/* if-nez v0, :cond_0 */
/* move-object v0, p0 */
} // :goto_0
} // :cond_0
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
v2 = this.tmp;
int v3 = 0; // const/4 v3, 0x0
/* aput v1, v2, v3 */
v2 = this.tmp;
int v3 = 1; // const/4 v3, 0x1
/* aput v0, v2, v3 */
v2 = this.tmp;
int v3 = 2; // const/4 v3, 0x2
/* aput v4, v2, v3 */
v2 = this.tmp;
int v3 = 3; // const/4 v3, 0x3
/* neg-float v0, v0 */
/* aput v0, v2, v3 */
v0 = this.tmp;
int v2 = 4; // const/4 v2, 0x4
/* aput v1, v0, v2 */
v0 = this.tmp;
int v1 = 5; // const/4 v1, 0x5
/* aput v4, v0, v1 */
v0 = this.tmp;
int v1 = 6; // const/4 v1, 0x6
/* aput v4, v0, v1 */
v0 = this.tmp;
int v1 = 7; // const/4 v1, 0x7
/* aput v4, v0, v1 */
v0 = this.tmp;
/* const/16 v1, 0x8 */
/* const/high16 v2, 0x3f800000 # 1.0f */
/* aput v2, v0, v1 */
v0 = this.vals;
v1 = this.tmp;
com.badlogic.gdx.math.Matrix3 .mul ( v0,v1 );
/* move-object v0, p0 */
} // .end method
public com.badlogic.gdx.math.Matrix3 scale ( Float p0, Float p1 ) {
/* .locals 3 */
int v2 = 0; // const/4 v2, 0x0
v0 = this.tmp;
int v1 = 0; // const/4 v1, 0x0
/* aput p1, v0, v1 */
v0 = this.tmp;
int v1 = 1; // const/4 v1, 0x1
/* aput v2, v0, v1 */
v0 = this.tmp;
int v1 = 2; // const/4 v1, 0x2
/* aput v2, v0, v1 */
v0 = this.tmp;
int v1 = 3; // const/4 v1, 0x3
/* aput v2, v0, v1 */
v0 = this.tmp;
int v1 = 4; // const/4 v1, 0x4
/* aput p2, v0, v1 */
v0 = this.tmp;
int v1 = 5; // const/4 v1, 0x5
/* aput v2, v0, v1 */
v0 = this.tmp;
int v1 = 6; // const/4 v1, 0x6
/* aput v2, v0, v1 */
v0 = this.tmp;
int v1 = 7; // const/4 v1, 0x7
/* aput v2, v0, v1 */
v0 = this.tmp;
/* const/16 v1, 0x8 */
/* const/high16 v2, 0x3f800000 # 1.0f */
/* aput v2, v0, v1 */
v0 = this.vals;
v1 = this.tmp;
com.badlogic.gdx.math.Matrix3 .mul ( v0,v1 );
} // .end method
public com.badlogic.gdx.math.Matrix3 set ( com.badlogic.gdx.math.Matrix3 p0 ) {
/* .locals 7 */
int v6 = 4; // const/4 v6, 0x4
int v5 = 3; // const/4 v5, 0x3
int v4 = 2; // const/4 v4, 0x2
int v3 = 1; // const/4 v3, 0x1
int v2 = 0; // const/4 v2, 0x0
v0 = this.vals;
v1 = this.vals;
/* aget v1, v1, v2 */
/* aput v1, v0, v2 */
v0 = this.vals;
v1 = this.vals;
/* aget v1, v1, v3 */
/* aput v1, v0, v3 */
v0 = this.vals;
v1 = this.vals;
/* aget v1, v1, v4 */
/* aput v1, v0, v4 */
v0 = this.vals;
v1 = this.vals;
/* aget v1, v1, v5 */
/* aput v1, v0, v5 */
v0 = this.vals;
v1 = this.vals;
/* aget v1, v1, v6 */
/* aput v1, v0, v6 */
v0 = this.vals;
int v1 = 5; // const/4 v1, 0x5
v2 = this.vals;
int v3 = 5; // const/4 v3, 0x5
/* aget v2, v2, v3 */
/* aput v2, v0, v1 */
v0 = this.vals;
int v1 = 6; // const/4 v1, 0x6
v2 = this.vals;
int v3 = 6; // const/4 v3, 0x6
/* aget v2, v2, v3 */
/* aput v2, v0, v1 */
v0 = this.vals;
int v1 = 7; // const/4 v1, 0x7
v2 = this.vals;
int v3 = 7; // const/4 v3, 0x7
/* aget v2, v2, v3 */
/* aput v2, v0, v1 */
v0 = this.vals;
/* const/16 v1, 0x8 */
v2 = this.vals;
/* const/16 v3, 0x8 */
/* aget v2, v2, v3 */
/* aput v2, v0, v1 */
} // .end method
public com.badlogic.gdx.math.Matrix3 setToRotation ( Float p0 ) {
/* .locals 5 */
int v4 = 0; // const/4 v4, 0x0
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
v2 = this.vals;
int v3 = 0; // const/4 v3, 0x0
/* aput v1, v2, v3 */
v2 = this.vals;
int v3 = 1; // const/4 v3, 0x1
/* aput v0, v2, v3 */
v2 = this.vals;
int v3 = 2; // const/4 v3, 0x2
/* aput v4, v2, v3 */
v2 = this.vals;
int v3 = 3; // const/4 v3, 0x3
/* neg-float v0, v0 */
/* aput v0, v2, v3 */
v0 = this.vals;
int v2 = 4; // const/4 v2, 0x4
/* aput v1, v0, v2 */
v0 = this.vals;
int v1 = 5; // const/4 v1, 0x5
/* aput v4, v0, v1 */
v0 = this.vals;
int v1 = 6; // const/4 v1, 0x6
/* aput v4, v0, v1 */
v0 = this.vals;
int v1 = 7; // const/4 v1, 0x7
/* aput v4, v0, v1 */
v0 = this.vals;
/* const/16 v1, 0x8 */
/* const/high16 v2, 0x3f800000 # 1.0f */
/* aput v2, v0, v1 */
} // .end method
public com.badlogic.gdx.math.Matrix3 setToScaling ( Float p0, Float p1 ) {
/* .locals 3 */
int v2 = 0; // const/4 v2, 0x0
v0 = this.vals;
int v1 = 0; // const/4 v1, 0x0
/* aput p1, v0, v1 */
v0 = this.vals;
int v1 = 1; // const/4 v1, 0x1
/* aput v2, v0, v1 */
v0 = this.vals;
int v1 = 2; // const/4 v1, 0x2
/* aput v2, v0, v1 */
v0 = this.vals;
int v1 = 3; // const/4 v1, 0x3
/* aput v2, v0, v1 */
v0 = this.vals;
int v1 = 4; // const/4 v1, 0x4
/* aput p2, v0, v1 */
v0 = this.vals;
int v1 = 5; // const/4 v1, 0x5
/* aput v2, v0, v1 */
v0 = this.vals;
int v1 = 6; // const/4 v1, 0x6
/* aput v2, v0, v1 */
v0 = this.vals;
int v1 = 7; // const/4 v1, 0x7
/* aput v2, v0, v1 */
v0 = this.vals;
/* const/16 v1, 0x8 */
/* const/high16 v2, 0x3f800000 # 1.0f */
/* aput v2, v0, v1 */
} // .end method
public com.badlogic.gdx.math.Matrix3 setToTranslation ( Float p0, Float p1 ) {
/* .locals 4 */
/* const/high16 v3, 0x3f800000 # 1.0f */
int v2 = 0; // const/4 v2, 0x0
v0 = this.vals;
int v1 = 0; // const/4 v1, 0x0
/* aput v3, v0, v1 */
v0 = this.vals;
int v1 = 1; // const/4 v1, 0x1
/* aput v2, v0, v1 */
v0 = this.vals;
int v1 = 2; // const/4 v1, 0x2
/* aput v2, v0, v1 */
v0 = this.vals;
int v1 = 3; // const/4 v1, 0x3
/* aput v2, v0, v1 */
v0 = this.vals;
int v1 = 4; // const/4 v1, 0x4
/* aput v3, v0, v1 */
v0 = this.vals;
int v1 = 5; // const/4 v1, 0x5
/* aput v2, v0, v1 */
v0 = this.vals;
int v1 = 6; // const/4 v1, 0x6
/* aput p1, v0, v1 */
v0 = this.vals;
int v1 = 7; // const/4 v1, 0x7
/* aput p2, v0, v1 */
v0 = this.vals;
/* const/16 v1, 0x8 */
/* aput v3, v0, v1 */
} // .end method
public java.lang.String toString ( ) {
/* .locals 6 */
final String v5 = "]\n"; // const-string v5, "]\n"
final String v4 = "["; // const-string v4, "["
final String v3 = "|"; // const-string v3, "|"
/* new-instance v0, Ljava/lang/StringBuilder; */
/* invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V */
final String v1 = "["; // const-string v1, "["
(( java.lang.StringBuilder ) v0 ).append ( v4 ); // invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
v1 = this.vals;
int v2 = 0; // const/4 v2, 0x0
/* aget v1, v1, v2 */
(( java.lang.StringBuilder ) v0 ).append ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;
final String v1 = "|"; // const-string v1, "|"
(( java.lang.StringBuilder ) v0 ).append ( v3 ); // invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
v1 = this.vals;
int v2 = 3; // const/4 v2, 0x3
/* aget v1, v1, v2 */
(( java.lang.StringBuilder ) v0 ).append ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;
final String v1 = "|"; // const-string v1, "|"
(( java.lang.StringBuilder ) v0 ).append ( v3 ); // invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
v1 = this.vals;
int v2 = 6; // const/4 v2, 0x6
/* aget v1, v1, v2 */
(( java.lang.StringBuilder ) v0 ).append ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;
final String v1 = "]\n"; // const-string v1, "]\n"
(( java.lang.StringBuilder ) v0 ).append ( v5 ); // invoke-virtual {v0, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
final String v1 = "["; // const-string v1, "["
(( java.lang.StringBuilder ) v0 ).append ( v4 ); // invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
v1 = this.vals;
int v2 = 1; // const/4 v2, 0x1
/* aget v1, v1, v2 */
(( java.lang.StringBuilder ) v0 ).append ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;
final String v1 = "|"; // const-string v1, "|"
(( java.lang.StringBuilder ) v0 ).append ( v3 ); // invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
v1 = this.vals;
int v2 = 4; // const/4 v2, 0x4
/* aget v1, v1, v2 */
(( java.lang.StringBuilder ) v0 ).append ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;
final String v1 = "|"; // const-string v1, "|"
(( java.lang.StringBuilder ) v0 ).append ( v3 ); // invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
v1 = this.vals;
int v2 = 7; // const/4 v2, 0x7
/* aget v1, v1, v2 */
(( java.lang.StringBuilder ) v0 ).append ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;
final String v1 = "]\n"; // const-string v1, "]\n"
(( java.lang.StringBuilder ) v0 ).append ( v5 ); // invoke-virtual {v0, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
final String v1 = "["; // const-string v1, "["
(( java.lang.StringBuilder ) v0 ).append ( v4 ); // invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
v1 = this.vals;
int v2 = 2; // const/4 v2, 0x2
/* aget v1, v1, v2 */
(( java.lang.StringBuilder ) v0 ).append ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;
final String v1 = "|"; // const-string v1, "|"
(( java.lang.StringBuilder ) v0 ).append ( v3 ); // invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
v1 = this.vals;
int v2 = 5; // const/4 v2, 0x5
/* aget v1, v1, v2 */
(( java.lang.StringBuilder ) v0 ).append ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;
final String v1 = "|"; // const-string v1, "|"
(( java.lang.StringBuilder ) v0 ).append ( v3 ); // invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
v1 = this.vals;
/* const/16 v2, 0x8 */
/* aget v1, v1, v2 */
(( java.lang.StringBuilder ) v0 ).append ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;
final String v1 = "]"; // const-string v1, "]"
(( java.lang.StringBuilder ) v0 ).append ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v0 ).toString ( ); // invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
} // .end method
public com.badlogic.gdx.math.Matrix3 translate ( Float p0, Float p1 ) {
/* .locals 4 */
/* const/high16 v3, 0x3f800000 # 1.0f */
int v2 = 0; // const/4 v2, 0x0
v0 = this.tmp;
int v1 = 0; // const/4 v1, 0x0
/* aput v3, v0, v1 */
v0 = this.tmp;
int v1 = 1; // const/4 v1, 0x1
/* aput v2, v0, v1 */
v0 = this.tmp;
int v1 = 2; // const/4 v1, 0x2
/* aput v2, v0, v1 */
v0 = this.tmp;
int v1 = 3; // const/4 v1, 0x3
/* aput v2, v0, v1 */
v0 = this.tmp;
int v1 = 4; // const/4 v1, 0x4
/* aput v3, v0, v1 */
v0 = this.tmp;
int v1 = 5; // const/4 v1, 0x5
/* aput v2, v0, v1 */
v0 = this.tmp;
int v1 = 6; // const/4 v1, 0x6
/* aput p1, v0, v1 */
v0 = this.tmp;
int v1 = 7; // const/4 v1, 0x7
/* aput p2, v0, v1 */
v0 = this.tmp;
/* const/16 v1, 0x8 */
/* aput v3, v0, v1 */
v0 = this.vals;
v1 = this.tmp;
com.badlogic.gdx.math.Matrix3 .mul ( v0,v1 );
} // .end method
public com.badlogic.gdx.math.Matrix3 trn ( Float p0, Float p1 ) {
/* .locals 3 */
v0 = this.vals;
int v1 = 6; // const/4 v1, 0x6
/* aget v2, v0, v1 */
/* add-float/2addr v2, p1 */
/* aput v2, v0, v1 */
v0 = this.vals;
int v1 = 7; // const/4 v1, 0x7
/* aget v2, v0, v1 */
/* add-float/2addr v2, p2 */
/* aput v2, v0, v1 */
} // .end method
public com.badlogic.gdx.math.Matrix3 trn ( com.badlogic.gdx.math.Vector3 p0 ) {
/* .locals 4 */
v0 = this.vals;
int v1 = 6; // const/4 v1, 0x6
/* aget v2, v0, v1 */
/* iget v3, p1, Lcom/badlogic/gdx/math/Vector3;->x:F */
/* add-float/2addr v2, v3 */
/* aput v2, v0, v1 */
v0 = this.vals;
int v1 = 7; // const/4 v1, 0x7
/* aget v2, v0, v1 */
/* iget v3, p1, Lcom/badlogic/gdx/math/Vector3;->y:F */
/* add-float/2addr v2, v3 */
/* aput v2, v0, v1 */
} // .end method
