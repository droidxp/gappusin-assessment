public class com.badlogic.gdx.math.Matrix4 implements java.io.Serializable {
	 /* # interfaces */
	 /* # static fields */
	 public static final Integer M00;
	 public static final Integer M01;
	 public static final Integer M02;
	 public static final Integer M03;
	 public static final Integer M10;
	 public static final Integer M11;
	 public static final Integer M12;
	 public static final Integer M13;
	 public static final Integer M20;
	 public static final Integer M21;
	 public static final Integer M22;
	 public static final Integer M23;
	 public static final Integer M30;
	 public static final Integer M31;
	 public static final Integer M32;
	 public static final Integer M33;
	 static com.badlogic.gdx.math.Vector3 l_vex;
	 static com.badlogic.gdx.math.Vector3 l_vey;
	 static com.badlogic.gdx.math.Vector3 l_vez;
	 static com.badlogic.gdx.math.Quaternion quat;
	 static com.badlogic.gdx.math.Vector3 right;
	 private static final Long serialVersionUID;
	 static com.badlogic.gdx.math.Vector3 tmpForward;
	 static final com.badlogic.gdx.math.Matrix4 tmpMat;
	 static com.badlogic.gdx.math.Vector3 tmpUp;
	 static final com.badlogic.gdx.math.Vector3 tmpV;
	 static final com.badlogic.gdx.math.Vector3 tmpVec;
	 /* # instance fields */
	 public final tmp;
	 public final val;
	 /* # direct methods */
	 static com.badlogic.gdx.math.Matrix4 ( ) {
		 /* .locals 1 */
		 /* new-instance v0, Lcom/badlogic/gdx/math/Quaternion; */
		 /* invoke-direct {v0}, Lcom/badlogic/gdx/math/Quaternion;-><init>()V */
		 /* new-instance v0, Lcom/badlogic/gdx/math/Vector3; */
		 /* invoke-direct {v0}, Lcom/badlogic/gdx/math/Vector3;-><init>()V */
		 /* new-instance v0, Lcom/badlogic/gdx/math/Vector3; */
		 /* invoke-direct {v0}, Lcom/badlogic/gdx/math/Vector3;-><init>()V */
		 /* new-instance v0, Lcom/badlogic/gdx/math/Vector3; */
		 /* invoke-direct {v0}, Lcom/badlogic/gdx/math/Vector3;-><init>()V */
		 /* new-instance v0, Lcom/badlogic/gdx/math/Vector3; */
		 /* invoke-direct {v0}, Lcom/badlogic/gdx/math/Vector3;-><init>()V */
		 /* new-instance v0, Lcom/badlogic/gdx/math/Vector3; */
		 /* invoke-direct {v0}, Lcom/badlogic/gdx/math/Vector3;-><init>()V */
		 /* new-instance v0, Lcom/badlogic/gdx/math/Matrix4; */
		 /* invoke-direct {v0}, Lcom/badlogic/gdx/math/Matrix4;-><init>()V */
		 /* new-instance v0, Lcom/badlogic/gdx/math/Vector3; */
		 /* invoke-direct {v0}, Lcom/badlogic/gdx/math/Vector3;-><init>()V */
		 /* new-instance v0, Lcom/badlogic/gdx/math/Vector3; */
		 /* invoke-direct {v0}, Lcom/badlogic/gdx/math/Vector3;-><init>()V */
		 /* new-instance v0, Lcom/badlogic/gdx/math/Vector3; */
		 /* invoke-direct {v0}, Lcom/badlogic/gdx/math/Vector3;-><init>()V */
		 return;
	 } // .end method
	 public com.badlogic.gdx.math.Matrix4 ( ) {
		 /* .locals 3 */
		 /* const/16 v1, 0x10 */
		 /* const/high16 v2, 0x3f800000 # 1.0f */
		 /* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
		 /* new-array v0, v1, [F */
		 this.tmp = v0;
		 /* new-array v0, v1, [F */
		 this.val = v0;
		 v0 = this.val;
		 int v1 = 0; // const/4 v1, 0x0
		 /* aput v2, v0, v1 */
		 v0 = this.val;
		 int v1 = 5; // const/4 v1, 0x5
		 /* aput v2, v0, v1 */
		 v0 = this.val;
		 /* const/16 v1, 0xa */
		 /* aput v2, v0, v1 */
		 v0 = this.val;
		 /* const/16 v1, 0xf */
		 /* aput v2, v0, v1 */
		 return;
	 } // .end method
	 public com.badlogic.gdx.math.Matrix4 ( ) {
		 /* .locals 2 */
		 /* const/16 v1, 0x10 */
		 /* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
		 /* new-array v0, v1, [F */
		 this.tmp = v0;
		 /* new-array v0, v1, [F */
		 this.val = v0;
		 (( com.badlogic.gdx.math.Matrix4 ) p0 ).set ( p1 ); // invoke-virtual {p0, p1}, Lcom/badlogic/gdx/math/Matrix4;->set(Lcom/badlogic/gdx/math/Matrix4;)Lcom/badlogic/gdx/math/Matrix4;
		 return;
	 } // .end method
	 public com.badlogic.gdx.math.Matrix4 ( ) {
		 /* .locals 2 */
		 /* const/16 v1, 0x10 */
		 /* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
		 /* new-array v0, v1, [F */
		 this.tmp = v0;
		 /* new-array v0, v1, [F */
		 this.val = v0;
		 (( com.badlogic.gdx.math.Matrix4 ) p0 ).set ( p1 ); // invoke-virtual {p0, p1}, Lcom/badlogic/gdx/math/Matrix4;->set(Lcom/badlogic/gdx/math/Quaternion;)Lcom/badlogic/gdx/math/Matrix4;
		 return;
	 } // .end method
	 public com.badlogic.gdx.math.Matrix4 ( ) {
		 /* .locals 2 */
		 /* const/16 v1, 0x10 */
		 /* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
		 /* new-array v0, v1, [F */
		 this.tmp = v0;
		 /* new-array v0, v1, [F */
		 this.val = v0;
		 (( com.badlogic.gdx.math.Matrix4 ) p0 ).set ( p1 ); // invoke-virtual {p0, p1}, Lcom/badlogic/gdx/math/Matrix4;->set([F)Lcom/badlogic/gdx/math/Matrix4;
		 return;
	 } // .end method
	 public static native Float det ( Float[] p0 ) {
	 } // .end method
	 public static native Boolean inv ( Float[] p0 ) {
	 } // .end method
	 public static native void mul ( Float[] p0, Float[] p1 ) {
	 } // .end method
	 public static native void mulVec ( Float[] p0, Float[] p1 ) {
	 } // .end method
	 public static native void mulVec ( Float[] p0, Float[] p1, Integer p2, Integer p3, Integer p4 ) {
	 } // .end method
	 public static native void prj ( Float[] p0, Float[] p1 ) {
	 } // .end method
	 public static native void prj ( Float[] p0, Float[] p1, Integer p2, Integer p3, Integer p4 ) {
	 } // .end method
	 public static native void rot ( Float[] p0, Float[] p1 ) {
	 } // .end method
	 public static native void rot ( Float[] p0, Float[] p1, Integer p2, Integer p3, Integer p4 ) {
	 } // .end method
	 /* # virtual methods */
	 public com.badlogic.gdx.math.Matrix4 cpy ( ) {
		 /* .locals 1 */
		 /* new-instance v0, Lcom/badlogic/gdx/math/Matrix4; */
		 /* invoke-direct {v0, p0}, Lcom/badlogic/gdx/math/Matrix4;-><init>(Lcom/badlogic/gdx/math/Matrix4;)V */
	 } // .end method
	 public Float det ( ) {
		 /* .locals 9 */
		 int v8 = 4; // const/4 v8, 0x4
		 int v7 = 3; // const/4 v7, 0x3
		 int v6 = 2; // const/4 v6, 0x2
		 int v5 = 1; // const/4 v5, 0x1
		 int v4 = 0; // const/4 v4, 0x0
		 v0 = this.val;
		 /* aget v0, v0, v7 */
		 v1 = this.val;
		 int v2 = 6; // const/4 v2, 0x6
		 /* aget v1, v1, v2 */
		 /* mul-float/2addr v0, v1 */
		 v1 = this.val;
		 /* const/16 v2, 0x9 */
		 /* aget v1, v1, v2 */
		 /* mul-float/2addr v0, v1 */
		 v1 = this.val;
		 /* const/16 v2, 0xc */
		 /* aget v1, v1, v2 */
		 /* mul-float/2addr v0, v1 */
		 v1 = this.val;
		 /* aget v1, v1, v6 */
		 v2 = this.val;
		 int v3 = 7; // const/4 v3, 0x7
		 /* aget v2, v2, v3 */
		 /* mul-float/2addr v1, v2 */
		 v2 = this.val;
		 /* const/16 v3, 0x9 */
		 /* aget v2, v2, v3 */
		 /* mul-float/2addr v1, v2 */
		 v2 = this.val;
		 /* const/16 v3, 0xc */
		 /* aget v2, v2, v3 */
		 /* mul-float/2addr v1, v2 */
		 /* sub-float/2addr v0, v1 */
		 v1 = this.val;
		 /* aget v1, v1, v7 */
		 v2 = this.val;
		 int v3 = 5; // const/4 v3, 0x5
		 /* aget v2, v2, v3 */
		 /* mul-float/2addr v1, v2 */
		 v2 = this.val;
		 /* const/16 v3, 0xa */
		 /* aget v2, v2, v3 */
		 /* mul-float/2addr v1, v2 */
		 v2 = this.val;
		 /* const/16 v3, 0xc */
		 /* aget v2, v2, v3 */
		 /* mul-float/2addr v1, v2 */
		 /* sub-float/2addr v0, v1 */
		 v1 = this.val;
		 /* aget v1, v1, v5 */
		 v2 = this.val;
		 int v3 = 7; // const/4 v3, 0x7
		 /* aget v2, v2, v3 */
		 /* mul-float/2addr v1, v2 */
		 v2 = this.val;
		 /* const/16 v3, 0xa */
		 /* aget v2, v2, v3 */
		 /* mul-float/2addr v1, v2 */
		 v2 = this.val;
		 /* const/16 v3, 0xc */
		 /* aget v2, v2, v3 */
		 /* mul-float/2addr v1, v2 */
		 /* add-float/2addr v0, v1 */
		 v1 = this.val;
		 /* aget v1, v1, v6 */
		 v2 = this.val;
		 int v3 = 5; // const/4 v3, 0x5
		 /* aget v2, v2, v3 */
		 /* mul-float/2addr v1, v2 */
		 v2 = this.val;
		 /* const/16 v3, 0xb */
		 /* aget v2, v2, v3 */
		 /* mul-float/2addr v1, v2 */
		 v2 = this.val;
		 /* const/16 v3, 0xc */
		 /* aget v2, v2, v3 */
		 /* mul-float/2addr v1, v2 */
		 /* add-float/2addr v0, v1 */
		 v1 = this.val;
		 /* aget v1, v1, v5 */
		 v2 = this.val;
		 int v3 = 6; // const/4 v3, 0x6
		 /* aget v2, v2, v3 */
		 /* mul-float/2addr v1, v2 */
		 v2 = this.val;
		 /* const/16 v3, 0xb */
		 /* aget v2, v2, v3 */
		 /* mul-float/2addr v1, v2 */
		 v2 = this.val;
		 /* const/16 v3, 0xc */
		 /* aget v2, v2, v3 */
		 /* mul-float/2addr v1, v2 */
		 /* sub-float/2addr v0, v1 */
		 v1 = this.val;
		 /* aget v1, v1, v7 */
		 v2 = this.val;
		 int v3 = 6; // const/4 v3, 0x6
		 /* aget v2, v2, v3 */
		 /* mul-float/2addr v1, v2 */
		 v2 = this.val;
		 /* const/16 v3, 0x8 */
		 /* aget v2, v2, v3 */
		 /* mul-float/2addr v1, v2 */
		 v2 = this.val;
		 /* const/16 v3, 0xd */
		 /* aget v2, v2, v3 */
		 /* mul-float/2addr v1, v2 */
		 /* sub-float/2addr v0, v1 */
		 v1 = this.val;
		 /* aget v1, v1, v6 */
		 v2 = this.val;
		 int v3 = 7; // const/4 v3, 0x7
		 /* aget v2, v2, v3 */
		 /* mul-float/2addr v1, v2 */
		 v2 = this.val;
		 /* const/16 v3, 0x8 */
		 /* aget v2, v2, v3 */
		 /* mul-float/2addr v1, v2 */
		 v2 = this.val;
		 /* const/16 v3, 0xd */
		 /* aget v2, v2, v3 */
		 /* mul-float/2addr v1, v2 */
		 /* add-float/2addr v0, v1 */
		 v1 = this.val;
		 /* aget v1, v1, v7 */
		 v2 = this.val;
		 /* aget v2, v2, v8 */
		 /* mul-float/2addr v1, v2 */
		 v2 = this.val;
		 /* const/16 v3, 0xa */
		 /* aget v2, v2, v3 */
		 /* mul-float/2addr v1, v2 */
		 v2 = this.val;
		 /* const/16 v3, 0xd */
		 /* aget v2, v2, v3 */
		 /* mul-float/2addr v1, v2 */
		 /* add-float/2addr v0, v1 */
		 v1 = this.val;
		 /* aget v1, v1, v4 */
		 v2 = this.val;
		 int v3 = 7; // const/4 v3, 0x7
		 /* aget v2, v2, v3 */
		 /* mul-float/2addr v1, v2 */
		 v2 = this.val;
		 /* const/16 v3, 0xa */
		 /* aget v2, v2, v3 */
		 /* mul-float/2addr v1, v2 */
		 v2 = this.val;
		 /* const/16 v3, 0xd */
		 /* aget v2, v2, v3 */
		 /* mul-float/2addr v1, v2 */
		 /* sub-float/2addr v0, v1 */
		 v1 = this.val;
		 /* aget v1, v1, v6 */
		 v2 = this.val;
		 /* aget v2, v2, v8 */
		 /* mul-float/2addr v1, v2 */
		 v2 = this.val;
		 /* const/16 v3, 0xb */
		 /* aget v2, v2, v3 */
		 /* mul-float/2addr v1, v2 */
		 v2 = this.val;
		 /* const/16 v3, 0xd */
		 /* aget v2, v2, v3 */
		 /* mul-float/2addr v1, v2 */
		 /* sub-float/2addr v0, v1 */
		 v1 = this.val;
		 /* aget v1, v1, v4 */
		 v2 = this.val;
		 int v3 = 6; // const/4 v3, 0x6
		 /* aget v2, v2, v3 */
		 /* mul-float/2addr v1, v2 */
		 v2 = this.val;
		 /* const/16 v3, 0xb */
		 /* aget v2, v2, v3 */
		 /* mul-float/2addr v1, v2 */
		 v2 = this.val;
		 /* const/16 v3, 0xd */
		 /* aget v2, v2, v3 */
		 /* mul-float/2addr v1, v2 */
		 /* add-float/2addr v0, v1 */
		 v1 = this.val;
		 /* aget v1, v1, v7 */
		 v2 = this.val;
		 int v3 = 5; // const/4 v3, 0x5
		 /* aget v2, v2, v3 */
		 /* mul-float/2addr v1, v2 */
		 v2 = this.val;
		 /* const/16 v3, 0x8 */
		 /* aget v2, v2, v3 */
		 /* mul-float/2addr v1, v2 */
		 v2 = this.val;
		 /* const/16 v3, 0xe */
		 /* aget v2, v2, v3 */
		 /* mul-float/2addr v1, v2 */
		 /* add-float/2addr v0, v1 */
		 v1 = this.val;
		 /* aget v1, v1, v5 */
		 v2 = this.val;
		 int v3 = 7; // const/4 v3, 0x7
		 /* aget v2, v2, v3 */
		 /* mul-float/2addr v1, v2 */
		 v2 = this.val;
		 /* const/16 v3, 0x8 */
		 /* aget v2, v2, v3 */
		 /* mul-float/2addr v1, v2 */
		 v2 = this.val;
		 /* const/16 v3, 0xe */
		 /* aget v2, v2, v3 */
		 /* mul-float/2addr v1, v2 */
		 /* sub-float/2addr v0, v1 */
		 v1 = this.val;
		 /* aget v1, v1, v7 */
		 v2 = this.val;
		 /* aget v2, v2, v8 */
		 /* mul-float/2addr v1, v2 */
		 v2 = this.val;
		 /* const/16 v3, 0x9 */
		 /* aget v2, v2, v3 */
		 /* mul-float/2addr v1, v2 */
		 v2 = this.val;
		 /* const/16 v3, 0xe */
		 /* aget v2, v2, v3 */
		 /* mul-float/2addr v1, v2 */
		 /* sub-float/2addr v0, v1 */
		 v1 = this.val;
		 /* aget v1, v1, v4 */
		 v2 = this.val;
		 int v3 = 7; // const/4 v3, 0x7
		 /* aget v2, v2, v3 */
		 /* mul-float/2addr v1, v2 */
		 v2 = this.val;
		 /* const/16 v3, 0x9 */
		 /* aget v2, v2, v3 */
		 /* mul-float/2addr v1, v2 */
		 v2 = this.val;
		 /* const/16 v3, 0xe */
		 /* aget v2, v2, v3 */
		 /* mul-float/2addr v1, v2 */
		 /* add-float/2addr v0, v1 */
		 v1 = this.val;
		 /* aget v1, v1, v5 */
		 v2 = this.val;
		 /* aget v2, v2, v8 */
		 /* mul-float/2addr v1, v2 */
		 v2 = this.val;
		 /* const/16 v3, 0xb */
		 /* aget v2, v2, v3 */
		 /* mul-float/2addr v1, v2 */
		 v2 = this.val;
		 /* const/16 v3, 0xe */
		 /* aget v2, v2, v3 */
		 /* mul-float/2addr v1, v2 */
		 /* add-float/2addr v0, v1 */
		 v1 = this.val;
		 /* aget v1, v1, v4 */
		 v2 = this.val;
		 int v3 = 5; // const/4 v3, 0x5
		 /* aget v2, v2, v3 */
		 /* mul-float/2addr v1, v2 */
		 v2 = this.val;
		 /* const/16 v3, 0xb */
		 /* aget v2, v2, v3 */
		 /* mul-float/2addr v1, v2 */
		 v2 = this.val;
		 /* const/16 v3, 0xe */
		 /* aget v2, v2, v3 */
		 /* mul-float/2addr v1, v2 */
		 /* sub-float/2addr v0, v1 */
		 v1 = this.val;
		 /* aget v1, v1, v6 */
		 v2 = this.val;
		 int v3 = 5; // const/4 v3, 0x5
		 /* aget v2, v2, v3 */
		 /* mul-float/2addr v1, v2 */
		 v2 = this.val;
		 /* const/16 v3, 0x8 */
		 /* aget v2, v2, v3 */
		 /* mul-float/2addr v1, v2 */
		 v2 = this.val;
		 /* const/16 v3, 0xf */
		 /* aget v2, v2, v3 */
		 /* mul-float/2addr v1, v2 */
		 /* sub-float/2addr v0, v1 */
		 v1 = this.val;
		 /* aget v1, v1, v5 */
		 v2 = this.val;
		 int v3 = 6; // const/4 v3, 0x6
		 /* aget v2, v2, v3 */
		 /* mul-float/2addr v1, v2 */
		 v2 = this.val;
		 /* const/16 v3, 0x8 */
		 /* aget v2, v2, v3 */
		 /* mul-float/2addr v1, v2 */
		 v2 = this.val;
		 /* const/16 v3, 0xf */
		 /* aget v2, v2, v3 */
		 /* mul-float/2addr v1, v2 */
		 /* add-float/2addr v0, v1 */
		 v1 = this.val;
		 /* aget v1, v1, v6 */
		 v2 = this.val;
		 /* aget v2, v2, v8 */
		 /* mul-float/2addr v1, v2 */
		 v2 = this.val;
		 /* const/16 v3, 0x9 */
		 /* aget v2, v2, v3 */
		 /* mul-float/2addr v1, v2 */
		 v2 = this.val;
		 /* const/16 v3, 0xf */
		 /* aget v2, v2, v3 */
		 /* mul-float/2addr v1, v2 */
		 /* add-float/2addr v0, v1 */
		 v1 = this.val;
		 /* aget v1, v1, v4 */
		 v2 = this.val;
		 int v3 = 6; // const/4 v3, 0x6
		 /* aget v2, v2, v3 */
		 /* mul-float/2addr v1, v2 */
		 v2 = this.val;
		 /* const/16 v3, 0x9 */
		 /* aget v2, v2, v3 */
		 /* mul-float/2addr v1, v2 */
		 v2 = this.val;
		 /* const/16 v3, 0xf */
		 /* aget v2, v2, v3 */
		 /* mul-float/2addr v1, v2 */
		 /* sub-float/2addr v0, v1 */
		 v1 = this.val;
		 /* aget v1, v1, v5 */
		 v2 = this.val;
		 /* aget v2, v2, v8 */
		 /* mul-float/2addr v1, v2 */
		 v2 = this.val;
		 /* const/16 v3, 0xa */
		 /* aget v2, v2, v3 */
		 /* mul-float/2addr v1, v2 */
		 v2 = this.val;
		 /* const/16 v3, 0xf */
		 /* aget v2, v2, v3 */
		 /* mul-float/2addr v1, v2 */
		 /* sub-float/2addr v0, v1 */
		 v1 = this.val;
		 /* aget v1, v1, v4 */
		 v2 = this.val;
		 int v3 = 5; // const/4 v3, 0x5
		 /* aget v2, v2, v3 */
		 /* mul-float/2addr v1, v2 */
		 v2 = this.val;
		 /* const/16 v3, 0xa */
		 /* aget v2, v2, v3 */
		 /* mul-float/2addr v1, v2 */
		 v2 = this.val;
		 /* const/16 v3, 0xf */
		 /* aget v2, v2, v3 */
		 /* mul-float/2addr v1, v2 */
		 /* add-float/2addr v0, v1 */
	 } // .end method
	 public void getRotation ( com.badlogic.gdx.math.Quaternion p0 ) {
		 /* .locals 0 */
		 (( com.badlogic.gdx.math.Quaternion ) p1 ).setFromMatrix ( p0 ); // invoke-virtual {p1, p0}, Lcom/badlogic/gdx/math/Quaternion;->setFromMatrix(Lcom/badlogic/gdx/math/Matrix4;)Lcom/badlogic/gdx/math/Quaternion;
		 return;
	 } // .end method
	 public void getTranslation ( com.badlogic.gdx.math.Vector3 p0 ) {
		 /* .locals 2 */
		 v0 = this.val;
		 /* const/16 v1, 0xc */
		 /* aget v0, v0, v1 */
		 /* iput v0, p1, Lcom/badlogic/gdx/math/Vector3;->x:F */
		 v0 = this.val;
		 /* const/16 v1, 0xd */
		 /* aget v0, v0, v1 */
		 /* iput v0, p1, Lcom/badlogic/gdx/math/Vector3;->y:F */
		 v0 = this.val;
		 /* const/16 v1, 0xe */
		 /* aget v0, v0, v1 */
		 /* iput v0, p1, Lcom/badlogic/gdx/math/Vector3;->z:F */
		 return;
	 } // .end method
	 public getValues ( ) {
		 /* .locals 1 */
		 v0 = this.val;
	 } // .end method
	 public com.badlogic.gdx.math.Matrix4 idt ( ) {
		 /* .locals 4 */
		 /* const/high16 v3, 0x3f800000 # 1.0f */
		 int v2 = 0; // const/4 v2, 0x0
		 v0 = this.val;
		 int v1 = 0; // const/4 v1, 0x0
		 /* aput v3, v0, v1 */
		 v0 = this.val;
		 int v1 = 4; // const/4 v1, 0x4
		 /* aput v2, v0, v1 */
		 v0 = this.val;
		 /* const/16 v1, 0x8 */
		 /* aput v2, v0, v1 */
		 v0 = this.val;
		 /* const/16 v1, 0xc */
		 /* aput v2, v0, v1 */
		 v0 = this.val;
		 int v1 = 1; // const/4 v1, 0x1
		 /* aput v2, v0, v1 */
		 v0 = this.val;
		 int v1 = 5; // const/4 v1, 0x5
		 /* aput v3, v0, v1 */
		 v0 = this.val;
		 /* const/16 v1, 0x9 */
		 /* aput v2, v0, v1 */
		 v0 = this.val;
		 /* const/16 v1, 0xd */
		 /* aput v2, v0, v1 */
		 v0 = this.val;
		 int v1 = 2; // const/4 v1, 0x2
		 /* aput v2, v0, v1 */
		 v0 = this.val;
		 int v1 = 6; // const/4 v1, 0x6
		 /* aput v2, v0, v1 */
		 v0 = this.val;
		 /* const/16 v1, 0xa */
		 /* aput v3, v0, v1 */
		 v0 = this.val;
		 /* const/16 v1, 0xe */
		 /* aput v2, v0, v1 */
		 v0 = this.val;
		 int v1 = 3; // const/4 v1, 0x3
		 /* aput v2, v0, v1 */
		 v0 = this.val;
		 int v1 = 7; // const/4 v1, 0x7
		 /* aput v2, v0, v1 */
		 v0 = this.val;
		 /* const/16 v1, 0xb */
		 /* aput v2, v0, v1 */
		 v0 = this.val;
		 /* const/16 v1, 0xf */
		 /* aput v3, v0, v1 */
	 } // .end method
	 public com.badlogic.gdx.math.Matrix4 inv ( ) {
		 /* .locals 12 */
		 int v11 = 4; // const/4 v11, 0x4
		 int v10 = 3; // const/4 v10, 0x3
		 int v9 = 2; // const/4 v9, 0x2
		 int v8 = 1; // const/4 v8, 0x1
		 int v7 = 0; // const/4 v7, 0x0
		 v0 = this.val;
		 /* aget v0, v0, v10 */
		 v1 = this.val;
		 int v2 = 6; // const/4 v2, 0x6
		 /* aget v1, v1, v2 */
		 /* mul-float/2addr v0, v1 */
		 v1 = this.val;
		 /* const/16 v2, 0x9 */
		 /* aget v1, v1, v2 */
		 /* mul-float/2addr v0, v1 */
		 v1 = this.val;
		 /* const/16 v2, 0xc */
		 /* aget v1, v1, v2 */
		 /* mul-float/2addr v0, v1 */
		 v1 = this.val;
		 /* aget v1, v1, v9 */
		 v2 = this.val;
		 int v3 = 7; // const/4 v3, 0x7
		 /* aget v2, v2, v3 */
		 /* mul-float/2addr v1, v2 */
		 v2 = this.val;
		 /* const/16 v3, 0x9 */
		 /* aget v2, v2, v3 */
		 /* mul-float/2addr v1, v2 */
		 v2 = this.val;
		 /* const/16 v3, 0xc */
		 /* aget v2, v2, v3 */
		 /* mul-float/2addr v1, v2 */
		 /* sub-float/2addr v0, v1 */
		 v1 = this.val;
		 /* aget v1, v1, v10 */
		 v2 = this.val;
		 int v3 = 5; // const/4 v3, 0x5
		 /* aget v2, v2, v3 */
		 /* mul-float/2addr v1, v2 */
		 v2 = this.val;
		 /* const/16 v3, 0xa */
		 /* aget v2, v2, v3 */
		 /* mul-float/2addr v1, v2 */
		 v2 = this.val;
		 /* const/16 v3, 0xc */
		 /* aget v2, v2, v3 */
		 /* mul-float/2addr v1, v2 */
		 /* sub-float/2addr v0, v1 */
		 v1 = this.val;
		 /* aget v1, v1, v8 */
		 v2 = this.val;
		 int v3 = 7; // const/4 v3, 0x7
		 /* aget v2, v2, v3 */
		 /* mul-float/2addr v1, v2 */
		 v2 = this.val;
		 /* const/16 v3, 0xa */
		 /* aget v2, v2, v3 */
		 /* mul-float/2addr v1, v2 */
		 v2 = this.val;
		 /* const/16 v3, 0xc */
		 /* aget v2, v2, v3 */
		 /* mul-float/2addr v1, v2 */
		 /* add-float/2addr v0, v1 */
		 v1 = this.val;
		 /* aget v1, v1, v9 */
		 v2 = this.val;
		 int v3 = 5; // const/4 v3, 0x5
		 /* aget v2, v2, v3 */
		 /* mul-float/2addr v1, v2 */
		 v2 = this.val;
		 /* const/16 v3, 0xb */
		 /* aget v2, v2, v3 */
		 /* mul-float/2addr v1, v2 */
		 v2 = this.val;
		 /* const/16 v3, 0xc */
		 /* aget v2, v2, v3 */
		 /* mul-float/2addr v1, v2 */
		 /* add-float/2addr v0, v1 */
		 v1 = this.val;
		 /* aget v1, v1, v8 */
		 v2 = this.val;
		 int v3 = 6; // const/4 v3, 0x6
		 /* aget v2, v2, v3 */
		 /* mul-float/2addr v1, v2 */
		 v2 = this.val;
		 /* const/16 v3, 0xb */
		 /* aget v2, v2, v3 */
		 /* mul-float/2addr v1, v2 */
		 v2 = this.val;
		 /* const/16 v3, 0xc */
		 /* aget v2, v2, v3 */
		 /* mul-float/2addr v1, v2 */
		 /* sub-float/2addr v0, v1 */
		 v1 = this.val;
		 /* aget v1, v1, v10 */
		 v2 = this.val;
		 int v3 = 6; // const/4 v3, 0x6
		 /* aget v2, v2, v3 */
		 /* mul-float/2addr v1, v2 */
		 v2 = this.val;
		 /* const/16 v3, 0x8 */
		 /* aget v2, v2, v3 */
		 /* mul-float/2addr v1, v2 */
		 v2 = this.val;
		 /* const/16 v3, 0xd */
		 /* aget v2, v2, v3 */
		 /* mul-float/2addr v1, v2 */
		 /* sub-float/2addr v0, v1 */
		 v1 = this.val;
		 /* aget v1, v1, v9 */
		 v2 = this.val;
		 int v3 = 7; // const/4 v3, 0x7
		 /* aget v2, v2, v3 */
		 /* mul-float/2addr v1, v2 */
		 v2 = this.val;
		 /* const/16 v3, 0x8 */
		 /* aget v2, v2, v3 */
		 /* mul-float/2addr v1, v2 */
		 v2 = this.val;
		 /* const/16 v3, 0xd */
		 /* aget v2, v2, v3 */
		 /* mul-float/2addr v1, v2 */
		 /* add-float/2addr v0, v1 */
		 v1 = this.val;
		 /* aget v1, v1, v10 */
		 v2 = this.val;
		 /* aget v2, v2, v11 */
		 /* mul-float/2addr v1, v2 */
		 v2 = this.val;
		 /* const/16 v3, 0xa */
		 /* aget v2, v2, v3 */
		 /* mul-float/2addr v1, v2 */
		 v2 = this.val;
		 /* const/16 v3, 0xd */
		 /* aget v2, v2, v3 */
		 /* mul-float/2addr v1, v2 */
		 /* add-float/2addr v0, v1 */
		 v1 = this.val;
		 /* aget v1, v1, v7 */
		 v2 = this.val;
		 int v3 = 7; // const/4 v3, 0x7
		 /* aget v2, v2, v3 */
		 /* mul-float/2addr v1, v2 */
		 v2 = this.val;
		 /* const/16 v3, 0xa */
		 /* aget v2, v2, v3 */
		 /* mul-float/2addr v1, v2 */
		 v2 = this.val;
		 /* const/16 v3, 0xd */
		 /* aget v2, v2, v3 */
		 /* mul-float/2addr v1, v2 */
		 /* sub-float/2addr v0, v1 */
		 v1 = this.val;
		 /* aget v1, v1, v9 */
		 v2 = this.val;
		 /* aget v2, v2, v11 */
		 /* mul-float/2addr v1, v2 */
		 v2 = this.val;
		 /* const/16 v3, 0xb */
		 /* aget v2, v2, v3 */
		 /* mul-float/2addr v1, v2 */
		 v2 = this.val;
		 /* const/16 v3, 0xd */
		 /* aget v2, v2, v3 */
		 /* mul-float/2addr v1, v2 */
		 /* sub-float/2addr v0, v1 */
		 v1 = this.val;
		 /* aget v1, v1, v7 */
		 v2 = this.val;
		 int v3 = 6; // const/4 v3, 0x6
		 /* aget v2, v2, v3 */
		 /* mul-float/2addr v1, v2 */
		 v2 = this.val;
		 /* const/16 v3, 0xb */
		 /* aget v2, v2, v3 */
		 /* mul-float/2addr v1, v2 */
		 v2 = this.val;
		 /* const/16 v3, 0xd */
		 /* aget v2, v2, v3 */
		 /* mul-float/2addr v1, v2 */
		 /* add-float/2addr v0, v1 */
		 v1 = this.val;
		 /* aget v1, v1, v10 */
		 v2 = this.val;
		 int v3 = 5; // const/4 v3, 0x5
		 /* aget v2, v2, v3 */
		 /* mul-float/2addr v1, v2 */
		 v2 = this.val;
		 /* const/16 v3, 0x8 */
		 /* aget v2, v2, v3 */
		 /* mul-float/2addr v1, v2 */
		 v2 = this.val;
		 /* const/16 v3, 0xe */
		 /* aget v2, v2, v3 */
		 /* mul-float/2addr v1, v2 */
		 /* add-float/2addr v0, v1 */
		 v1 = this.val;
		 /* aget v1, v1, v8 */
		 v2 = this.val;
		 int v3 = 7; // const/4 v3, 0x7
		 /* aget v2, v2, v3 */
		 /* mul-float/2addr v1, v2 */
		 v2 = this.val;
		 /* const/16 v3, 0x8 */
		 /* aget v2, v2, v3 */
		 /* mul-float/2addr v1, v2 */
		 v2 = this.val;
		 /* const/16 v3, 0xe */
		 /* aget v2, v2, v3 */
		 /* mul-float/2addr v1, v2 */
		 /* sub-float/2addr v0, v1 */
		 v1 = this.val;
		 /* aget v1, v1, v10 */
		 v2 = this.val;
		 /* aget v2, v2, v11 */
		 /* mul-float/2addr v1, v2 */
		 v2 = this.val;
		 /* const/16 v3, 0x9 */
		 /* aget v2, v2, v3 */
		 /* mul-float/2addr v1, v2 */
		 v2 = this.val;
		 /* const/16 v3, 0xe */
		 /* aget v2, v2, v3 */
		 /* mul-float/2addr v1, v2 */
		 /* sub-float/2addr v0, v1 */
		 v1 = this.val;
		 /* aget v1, v1, v7 */
		 v2 = this.val;
		 int v3 = 7; // const/4 v3, 0x7
		 /* aget v2, v2, v3 */
		 /* mul-float/2addr v1, v2 */
		 v2 = this.val;
		 /* const/16 v3, 0x9 */
		 /* aget v2, v2, v3 */
		 /* mul-float/2addr v1, v2 */
		 v2 = this.val;
		 /* const/16 v3, 0xe */
		 /* aget v2, v2, v3 */
		 /* mul-float/2addr v1, v2 */
		 /* add-float/2addr v0, v1 */
		 v1 = this.val;
		 /* aget v1, v1, v8 */
		 v2 = this.val;
		 /* aget v2, v2, v11 */
		 /* mul-float/2addr v1, v2 */
		 v2 = this.val;
		 /* const/16 v3, 0xb */
		 /* aget v2, v2, v3 */
		 /* mul-float/2addr v1, v2 */
		 v2 = this.val;
		 /* const/16 v3, 0xe */
		 /* aget v2, v2, v3 */
		 /* mul-float/2addr v1, v2 */
		 /* add-float/2addr v0, v1 */
		 v1 = this.val;
		 /* aget v1, v1, v7 */
		 v2 = this.val;
		 int v3 = 5; // const/4 v3, 0x5
		 /* aget v2, v2, v3 */
		 /* mul-float/2addr v1, v2 */
		 v2 = this.val;
		 /* const/16 v3, 0xb */
		 /* aget v2, v2, v3 */
		 /* mul-float/2addr v1, v2 */
		 v2 = this.val;
		 /* const/16 v3, 0xe */
		 /* aget v2, v2, v3 */
		 /* mul-float/2addr v1, v2 */
		 /* sub-float/2addr v0, v1 */
		 v1 = this.val;
		 /* aget v1, v1, v9 */
		 v2 = this.val;
		 int v3 = 5; // const/4 v3, 0x5
		 /* aget v2, v2, v3 */
		 /* mul-float/2addr v1, v2 */
		 v2 = this.val;
		 /* const/16 v3, 0x8 */
		 /* aget v2, v2, v3 */
		 /* mul-float/2addr v1, v2 */
		 v2 = this.val;
		 /* const/16 v3, 0xf */
		 /* aget v2, v2, v3 */
		 /* mul-float/2addr v1, v2 */
		 /* sub-float/2addr v0, v1 */
		 v1 = this.val;
		 /* aget v1, v1, v8 */
		 v2 = this.val;
		 int v3 = 6; // const/4 v3, 0x6
		 /* aget v2, v2, v3 */
		 /* mul-float/2addr v1, v2 */
		 v2 = this.val;
		 /* const/16 v3, 0x8 */
		 /* aget v2, v2, v3 */
		 /* mul-float/2addr v1, v2 */
		 v2 = this.val;
		 /* const/16 v3, 0xf */
		 /* aget v2, v2, v3 */
		 /* mul-float/2addr v1, v2 */
		 /* add-float/2addr v0, v1 */
		 v1 = this.val;
		 /* aget v1, v1, v9 */
		 v2 = this.val;
		 /* aget v2, v2, v11 */
		 /* mul-float/2addr v1, v2 */
		 v2 = this.val;
		 /* const/16 v3, 0x9 */
		 /* aget v2, v2, v3 */
		 /* mul-float/2addr v1, v2 */
		 v2 = this.val;
		 /* const/16 v3, 0xf */
		 /* aget v2, v2, v3 */
		 /* mul-float/2addr v1, v2 */
		 /* add-float/2addr v0, v1 */
		 v1 = this.val;
		 /* aget v1, v1, v7 */
		 v2 = this.val;
		 int v3 = 6; // const/4 v3, 0x6
		 /* aget v2, v2, v3 */
		 /* mul-float/2addr v1, v2 */
		 v2 = this.val;
		 /* const/16 v3, 0x9 */
		 /* aget v2, v2, v3 */
		 /* mul-float/2addr v1, v2 */
		 v2 = this.val;
		 /* const/16 v3, 0xf */
		 /* aget v2, v2, v3 */
		 /* mul-float/2addr v1, v2 */
		 /* sub-float/2addr v0, v1 */
		 v1 = this.val;
		 /* aget v1, v1, v8 */
		 v2 = this.val;
		 /* aget v2, v2, v11 */
		 /* mul-float/2addr v1, v2 */
		 v2 = this.val;
		 /* const/16 v3, 0xa */
		 /* aget v2, v2, v3 */
		 /* mul-float/2addr v1, v2 */
		 v2 = this.val;
		 /* const/16 v3, 0xf */
		 /* aget v2, v2, v3 */
		 /* mul-float/2addr v1, v2 */
		 /* sub-float/2addr v0, v1 */
		 v1 = this.val;
		 /* aget v1, v1, v7 */
		 v2 = this.val;
		 int v3 = 5; // const/4 v3, 0x5
		 /* aget v2, v2, v3 */
		 /* mul-float/2addr v1, v2 */
		 v2 = this.val;
		 /* const/16 v3, 0xa */
		 /* aget v2, v2, v3 */
		 /* mul-float/2addr v1, v2 */
		 v2 = this.val;
		 /* const/16 v3, 0xf */
		 /* aget v2, v2, v3 */
		 /* mul-float/2addr v1, v2 */
		 /* add-float/2addr v0, v1 */
		 int v1 = 0; // const/4 v1, 0x0
		 /* cmpl-float v1, v0, v1 */
		 /* if-nez v1, :cond_0 */
		 /* new-instance v0, Ljava/lang/RuntimeException; */
		 final String v1 = "non-invertible matrix"; // const-string v1, "non-invertible matrix"
		 /* invoke-direct {v0, v1}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V */
		 /* throw v0 */
	 } // :cond_0
	 /* const/high16 v1, 0x3f800000 # 1.0f */
	 /* div-float v0, v1, v0 */
	 v1 = this.tmp;
	 v2 = this.val;
	 /* const/16 v3, 0x9 */
	 /* aget v2, v2, v3 */
	 v3 = this.val;
	 /* const/16 v4, 0xe */
	 /* aget v3, v3, v4 */
	 /* mul-float/2addr v2, v3 */
	 v3 = this.val;
	 int v4 = 7; // const/4 v4, 0x7
	 /* aget v3, v3, v4 */
	 /* mul-float/2addr v2, v3 */
	 v3 = this.val;
	 /* const/16 v4, 0xd */
	 /* aget v3, v3, v4 */
	 v4 = this.val;
	 /* const/16 v5, 0xa */
	 /* aget v4, v4, v5 */
	 /* mul-float/2addr v3, v4 */
	 v4 = this.val;
	 int v5 = 7; // const/4 v5, 0x7
	 /* aget v4, v4, v5 */
	 /* mul-float/2addr v3, v4 */
	 /* sub-float/2addr v2, v3 */
	 v3 = this.val;
	 /* const/16 v4, 0xd */
	 /* aget v3, v3, v4 */
	 v4 = this.val;
	 int v5 = 6; // const/4 v5, 0x6
	 /* aget v4, v4, v5 */
	 /* mul-float/2addr v3, v4 */
	 v4 = this.val;
	 /* const/16 v5, 0xb */
	 /* aget v4, v4, v5 */
	 /* mul-float/2addr v3, v4 */
	 /* add-float/2addr v2, v3 */
	 v3 = this.val;
	 int v4 = 5; // const/4 v4, 0x5
	 /* aget v3, v3, v4 */
	 v4 = this.val;
	 /* const/16 v5, 0xe */
	 /* aget v4, v4, v5 */
	 /* mul-float/2addr v3, v4 */
	 v4 = this.val;
	 /* const/16 v5, 0xb */
	 /* aget v4, v4, v5 */
	 /* mul-float/2addr v3, v4 */
	 /* sub-float/2addr v2, v3 */
	 v3 = this.val;
	 /* const/16 v4, 0x9 */
	 /* aget v3, v3, v4 */
	 v4 = this.val;
	 int v5 = 6; // const/4 v5, 0x6
	 /* aget v4, v4, v5 */
	 /* mul-float/2addr v3, v4 */
	 v4 = this.val;
	 /* const/16 v5, 0xf */
	 /* aget v4, v4, v5 */
	 /* mul-float/2addr v3, v4 */
	 /* sub-float/2addr v2, v3 */
	 v3 = this.val;
	 int v4 = 5; // const/4 v4, 0x5
	 /* aget v3, v3, v4 */
	 v4 = this.val;
	 /* const/16 v5, 0xa */
	 /* aget v4, v4, v5 */
	 /* mul-float/2addr v3, v4 */
	 v4 = this.val;
	 /* const/16 v5, 0xf */
	 /* aget v4, v4, v5 */
	 /* mul-float/2addr v3, v4 */
	 /* add-float/2addr v2, v3 */
	 /* aput v2, v1, v7 */
	 v1 = this.tmp;
	 v2 = this.val;
	 /* const/16 v3, 0xc */
	 /* aget v2, v2, v3 */
	 v3 = this.val;
	 /* const/16 v4, 0xa */
	 /* aget v3, v3, v4 */
	 /* mul-float/2addr v2, v3 */
	 v3 = this.val;
	 int v4 = 7; // const/4 v4, 0x7
	 /* aget v3, v3, v4 */
	 /* mul-float/2addr v2, v3 */
	 v3 = this.val;
	 /* const/16 v4, 0x8 */
	 /* aget v3, v3, v4 */
	 v4 = this.val;
	 /* const/16 v5, 0xe */
	 /* aget v4, v4, v5 */
	 /* mul-float/2addr v3, v4 */
	 v4 = this.val;
	 int v5 = 7; // const/4 v5, 0x7
	 /* aget v4, v4, v5 */
	 /* mul-float/2addr v3, v4 */
	 /* sub-float/2addr v2, v3 */
	 v3 = this.val;
	 /* const/16 v4, 0xc */
	 /* aget v3, v3, v4 */
	 v4 = this.val;
	 int v5 = 6; // const/4 v5, 0x6
	 /* aget v4, v4, v5 */
	 /* mul-float/2addr v3, v4 */
	 v4 = this.val;
	 /* const/16 v5, 0xb */
	 /* aget v4, v4, v5 */
	 /* mul-float/2addr v3, v4 */
	 /* sub-float/2addr v2, v3 */
	 v3 = this.val;
	 /* aget v3, v3, v11 */
	 v4 = this.val;
	 /* const/16 v5, 0xe */
	 /* aget v4, v4, v5 */
	 /* mul-float/2addr v3, v4 */
	 v4 = this.val;
	 /* const/16 v5, 0xb */
	 /* aget v4, v4, v5 */
	 /* mul-float/2addr v3, v4 */
	 /* add-float/2addr v2, v3 */
	 v3 = this.val;
	 /* const/16 v4, 0x8 */
	 /* aget v3, v3, v4 */
	 v4 = this.val;
	 int v5 = 6; // const/4 v5, 0x6
	 /* aget v4, v4, v5 */
	 /* mul-float/2addr v3, v4 */
	 v4 = this.val;
	 /* const/16 v5, 0xf */
	 /* aget v4, v4, v5 */
	 /* mul-float/2addr v3, v4 */
	 /* add-float/2addr v2, v3 */
	 v3 = this.val;
	 /* aget v3, v3, v11 */
	 v4 = this.val;
	 /* const/16 v5, 0xa */
	 /* aget v4, v4, v5 */
	 /* mul-float/2addr v3, v4 */
	 v4 = this.val;
	 /* const/16 v5, 0xf */
	 /* aget v4, v4, v5 */
	 /* mul-float/2addr v3, v4 */
	 /* sub-float/2addr v2, v3 */
	 /* aput v2, v1, v11 */
	 v1 = this.tmp;
	 /* const/16 v2, 0x8 */
	 v3 = this.val;
	 /* const/16 v4, 0x8 */
	 /* aget v3, v3, v4 */
	 v4 = this.val;
	 /* const/16 v5, 0xd */
	 /* aget v4, v4, v5 */
	 /* mul-float/2addr v3, v4 */
	 v4 = this.val;
	 int v5 = 7; // const/4 v5, 0x7
	 /* aget v4, v4, v5 */
	 /* mul-float/2addr v3, v4 */
	 v4 = this.val;
	 /* const/16 v5, 0xc */
	 /* aget v4, v4, v5 */
	 v5 = this.val;
	 /* const/16 v6, 0x9 */
	 /* aget v5, v5, v6 */
	 /* mul-float/2addr v4, v5 */
	 v5 = this.val;
	 int v6 = 7; // const/4 v6, 0x7
	 /* aget v5, v5, v6 */
	 /* mul-float/2addr v4, v5 */
	 /* sub-float/2addr v3, v4 */
	 v4 = this.val;
	 /* const/16 v5, 0xc */
	 /* aget v4, v4, v5 */
	 v5 = this.val;
	 int v6 = 5; // const/4 v6, 0x5
	 /* aget v5, v5, v6 */
	 /* mul-float/2addr v4, v5 */
	 v5 = this.val;
	 /* const/16 v6, 0xb */
	 /* aget v5, v5, v6 */
	 /* mul-float/2addr v4, v5 */
	 /* add-float/2addr v3, v4 */
	 v4 = this.val;
	 /* aget v4, v4, v11 */
	 v5 = this.val;
	 /* const/16 v6, 0xd */
	 /* aget v5, v5, v6 */
	 /* mul-float/2addr v4, v5 */
	 v5 = this.val;
	 /* const/16 v6, 0xb */
	 /* aget v5, v5, v6 */
	 /* mul-float/2addr v4, v5 */
	 /* sub-float/2addr v3, v4 */
	 v4 = this.val;
	 /* const/16 v5, 0x8 */
	 /* aget v4, v4, v5 */
	 v5 = this.val;
	 int v6 = 5; // const/4 v6, 0x5
	 /* aget v5, v5, v6 */
	 /* mul-float/2addr v4, v5 */
	 v5 = this.val;
	 /* const/16 v6, 0xf */
	 /* aget v5, v5, v6 */
	 /* mul-float/2addr v4, v5 */
	 /* sub-float/2addr v3, v4 */
	 v4 = this.val;
	 /* aget v4, v4, v11 */
	 v5 = this.val;
	 /* const/16 v6, 0x9 */
	 /* aget v5, v5, v6 */
	 /* mul-float/2addr v4, v5 */
	 v5 = this.val;
	 /* const/16 v6, 0xf */
	 /* aget v5, v5, v6 */
	 /* mul-float/2addr v4, v5 */
	 /* add-float/2addr v3, v4 */
	 /* aput v3, v1, v2 */
	 v1 = this.tmp;
	 /* const/16 v2, 0xc */
	 v3 = this.val;
	 /* const/16 v4, 0xc */
	 /* aget v3, v3, v4 */
	 v4 = this.val;
	 /* const/16 v5, 0x9 */
	 /* aget v4, v4, v5 */
	 /* mul-float/2addr v3, v4 */
	 v4 = this.val;
	 int v5 = 6; // const/4 v5, 0x6
	 /* aget v4, v4, v5 */
	 /* mul-float/2addr v3, v4 */
	 v4 = this.val;
	 /* const/16 v5, 0x8 */
	 /* aget v4, v4, v5 */
	 v5 = this.val;
	 /* const/16 v6, 0xd */
	 /* aget v5, v5, v6 */
	 /* mul-float/2addr v4, v5 */
	 v5 = this.val;
	 int v6 = 6; // const/4 v6, 0x6
	 /* aget v5, v5, v6 */
	 /* mul-float/2addr v4, v5 */
	 /* sub-float/2addr v3, v4 */
	 v4 = this.val;
	 /* const/16 v5, 0xc */
	 /* aget v4, v4, v5 */
	 v5 = this.val;
	 int v6 = 5; // const/4 v6, 0x5
	 /* aget v5, v5, v6 */
	 /* mul-float/2addr v4, v5 */
	 v5 = this.val;
	 /* const/16 v6, 0xa */
	 /* aget v5, v5, v6 */
	 /* mul-float/2addr v4, v5 */
	 /* sub-float/2addr v3, v4 */
	 v4 = this.val;
	 /* aget v4, v4, v11 */
	 v5 = this.val;
	 /* const/16 v6, 0xd */
	 /* aget v5, v5, v6 */
	 /* mul-float/2addr v4, v5 */
	 v5 = this.val;
	 /* const/16 v6, 0xa */
	 /* aget v5, v5, v6 */
	 /* mul-float/2addr v4, v5 */
	 /* add-float/2addr v3, v4 */
	 v4 = this.val;
	 /* const/16 v5, 0x8 */
	 /* aget v4, v4, v5 */
	 v5 = this.val;
	 int v6 = 5; // const/4 v6, 0x5
	 /* aget v5, v5, v6 */
	 /* mul-float/2addr v4, v5 */
	 v5 = this.val;
	 /* const/16 v6, 0xe */
	 /* aget v5, v5, v6 */
	 /* mul-float/2addr v4, v5 */
	 /* add-float/2addr v3, v4 */
	 v4 = this.val;
	 /* aget v4, v4, v11 */
	 v5 = this.val;
	 /* const/16 v6, 0x9 */
	 /* aget v5, v5, v6 */
	 /* mul-float/2addr v4, v5 */
	 v5 = this.val;
	 /* const/16 v6, 0xe */
	 /* aget v5, v5, v6 */
	 /* mul-float/2addr v4, v5 */
	 /* sub-float/2addr v3, v4 */
	 /* aput v3, v1, v2 */
	 v1 = this.tmp;
	 v2 = this.val;
	 /* const/16 v3, 0xd */
	 /* aget v2, v2, v3 */
	 v3 = this.val;
	 /* const/16 v4, 0xa */
	 /* aget v3, v3, v4 */
	 /* mul-float/2addr v2, v3 */
	 v3 = this.val;
	 /* aget v3, v3, v10 */
	 /* mul-float/2addr v2, v3 */
	 v3 = this.val;
	 /* const/16 v4, 0x9 */
	 /* aget v3, v3, v4 */
	 v4 = this.val;
	 /* const/16 v5, 0xe */
	 /* aget v4, v4, v5 */
	 /* mul-float/2addr v3, v4 */
	 v4 = this.val;
	 /* aget v4, v4, v10 */
	 /* mul-float/2addr v3, v4 */
	 /* sub-float/2addr v2, v3 */
	 v3 = this.val;
	 /* const/16 v4, 0xd */
	 /* aget v3, v3, v4 */
	 v4 = this.val;
	 /* aget v4, v4, v9 */
	 /* mul-float/2addr v3, v4 */
	 v4 = this.val;
	 /* const/16 v5, 0xb */
	 /* aget v4, v4, v5 */
	 /* mul-float/2addr v3, v4 */
	 /* sub-float/2addr v2, v3 */
	 v3 = this.val;
	 /* aget v3, v3, v8 */
	 v4 = this.val;
	 /* const/16 v5, 0xe */
	 /* aget v4, v4, v5 */
	 /* mul-float/2addr v3, v4 */
	 v4 = this.val;
	 /* const/16 v5, 0xb */
	 /* aget v4, v4, v5 */
	 /* mul-float/2addr v3, v4 */
	 /* add-float/2addr v2, v3 */
	 v3 = this.val;
	 /* const/16 v4, 0x9 */
	 /* aget v3, v3, v4 */
	 v4 = this.val;
	 /* aget v4, v4, v9 */
	 /* mul-float/2addr v3, v4 */
	 v4 = this.val;
	 /* const/16 v5, 0xf */
	 /* aget v4, v4, v5 */
	 /* mul-float/2addr v3, v4 */
	 /* add-float/2addr v2, v3 */
	 v3 = this.val;
	 /* aget v3, v3, v8 */
	 v4 = this.val;
	 /* const/16 v5, 0xa */
	 /* aget v4, v4, v5 */
	 /* mul-float/2addr v3, v4 */
	 v4 = this.val;
	 /* const/16 v5, 0xf */
	 /* aget v4, v4, v5 */
	 /* mul-float/2addr v3, v4 */
	 /* sub-float/2addr v2, v3 */
	 /* aput v2, v1, v8 */
	 v1 = this.tmp;
	 int v2 = 5; // const/4 v2, 0x5
	 v3 = this.val;
	 /* const/16 v4, 0x8 */
	 /* aget v3, v3, v4 */
	 v4 = this.val;
	 /* const/16 v5, 0xe */
	 /* aget v4, v4, v5 */
	 /* mul-float/2addr v3, v4 */
	 v4 = this.val;
	 /* aget v4, v4, v10 */
	 /* mul-float/2addr v3, v4 */
	 v4 = this.val;
	 /* const/16 v5, 0xc */
	 /* aget v4, v4, v5 */
	 v5 = this.val;
	 /* const/16 v6, 0xa */
	 /* aget v5, v5, v6 */
	 /* mul-float/2addr v4, v5 */
	 v5 = this.val;
	 /* aget v5, v5, v10 */
	 /* mul-float/2addr v4, v5 */
	 /* sub-float/2addr v3, v4 */
	 v4 = this.val;
	 /* const/16 v5, 0xc */
	 /* aget v4, v4, v5 */
	 v5 = this.val;
	 /* aget v5, v5, v9 */
	 /* mul-float/2addr v4, v5 */
	 v5 = this.val;
	 /* const/16 v6, 0xb */
	 /* aget v5, v5, v6 */
	 /* mul-float/2addr v4, v5 */
	 /* add-float/2addr v3, v4 */
	 v4 = this.val;
	 /* aget v4, v4, v7 */
	 v5 = this.val;
	 /* const/16 v6, 0xe */
	 /* aget v5, v5, v6 */
	 /* mul-float/2addr v4, v5 */
	 v5 = this.val;
	 /* const/16 v6, 0xb */
	 /* aget v5, v5, v6 */
	 /* mul-float/2addr v4, v5 */
	 /* sub-float/2addr v3, v4 */
	 v4 = this.val;
	 /* const/16 v5, 0x8 */
	 /* aget v4, v4, v5 */
	 v5 = this.val;
	 /* aget v5, v5, v9 */
	 /* mul-float/2addr v4, v5 */
	 v5 = this.val;
	 /* const/16 v6, 0xf */
	 /* aget v5, v5, v6 */
	 /* mul-float/2addr v4, v5 */
	 /* sub-float/2addr v3, v4 */
	 v4 = this.val;
	 /* aget v4, v4, v7 */
	 v5 = this.val;
	 /* const/16 v6, 0xa */
	 /* aget v5, v5, v6 */
	 /* mul-float/2addr v4, v5 */
	 v5 = this.val;
	 /* const/16 v6, 0xf */
	 /* aget v5, v5, v6 */
	 /* mul-float/2addr v4, v5 */
	 /* add-float/2addr v3, v4 */
	 /* aput v3, v1, v2 */
	 v1 = this.tmp;
	 /* const/16 v2, 0x9 */
	 v3 = this.val;
	 /* const/16 v4, 0xc */
	 /* aget v3, v3, v4 */
	 v4 = this.val;
	 /* const/16 v5, 0x9 */
	 /* aget v4, v4, v5 */
	 /* mul-float/2addr v3, v4 */
	 v4 = this.val;
	 /* aget v4, v4, v10 */
	 /* mul-float/2addr v3, v4 */
	 v4 = this.val;
	 /* const/16 v5, 0x8 */
	 /* aget v4, v4, v5 */
	 v5 = this.val;
	 /* const/16 v6, 0xd */
	 /* aget v5, v5, v6 */
	 /* mul-float/2addr v4, v5 */
	 v5 = this.val;
	 /* aget v5, v5, v10 */
	 /* mul-float/2addr v4, v5 */
	 /* sub-float/2addr v3, v4 */
	 v4 = this.val;
	 /* const/16 v5, 0xc */
	 /* aget v4, v4, v5 */
	 v5 = this.val;
	 /* aget v5, v5, v8 */
	 /* mul-float/2addr v4, v5 */
	 v5 = this.val;
	 /* const/16 v6, 0xb */
	 /* aget v5, v5, v6 */
	 /* mul-float/2addr v4, v5 */
	 /* sub-float/2addr v3, v4 */
	 v4 = this.val;
	 /* aget v4, v4, v7 */
	 v5 = this.val;
	 /* const/16 v6, 0xd */
	 /* aget v5, v5, v6 */
	 /* mul-float/2addr v4, v5 */
	 v5 = this.val;
	 /* const/16 v6, 0xb */
	 /* aget v5, v5, v6 */
	 /* mul-float/2addr v4, v5 */
	 /* add-float/2addr v3, v4 */
	 v4 = this.val;
	 /* const/16 v5, 0x8 */
	 /* aget v4, v4, v5 */
	 v5 = this.val;
	 /* aget v5, v5, v8 */
	 /* mul-float/2addr v4, v5 */
	 v5 = this.val;
	 /* const/16 v6, 0xf */
	 /* aget v5, v5, v6 */
	 /* mul-float/2addr v4, v5 */
	 /* add-float/2addr v3, v4 */
	 v4 = this.val;
	 /* aget v4, v4, v7 */
	 v5 = this.val;
	 /* const/16 v6, 0x9 */
	 /* aget v5, v5, v6 */
	 /* mul-float/2addr v4, v5 */
	 v5 = this.val;
	 /* const/16 v6, 0xf */
	 /* aget v5, v5, v6 */
	 /* mul-float/2addr v4, v5 */
	 /* sub-float/2addr v3, v4 */
	 /* aput v3, v1, v2 */
	 v1 = this.tmp;
	 /* const/16 v2, 0xd */
	 v3 = this.val;
	 /* const/16 v4, 0x8 */
	 /* aget v3, v3, v4 */
	 v4 = this.val;
	 /* const/16 v5, 0xd */
	 /* aget v4, v4, v5 */
	 /* mul-float/2addr v3, v4 */
	 v4 = this.val;
	 /* aget v4, v4, v9 */
	 /* mul-float/2addr v3, v4 */
	 v4 = this.val;
	 /* const/16 v5, 0xc */
	 /* aget v4, v4, v5 */
	 v5 = this.val;
	 /* const/16 v6, 0x9 */
	 /* aget v5, v5, v6 */
	 /* mul-float/2addr v4, v5 */
	 v5 = this.val;
	 /* aget v5, v5, v9 */
	 /* mul-float/2addr v4, v5 */
	 /* sub-float/2addr v3, v4 */
	 v4 = this.val;
	 /* const/16 v5, 0xc */
	 /* aget v4, v4, v5 */
	 v5 = this.val;
	 /* aget v5, v5, v8 */
	 /* mul-float/2addr v4, v5 */
	 v5 = this.val;
	 /* const/16 v6, 0xa */
	 /* aget v5, v5, v6 */
	 /* mul-float/2addr v4, v5 */
	 /* add-float/2addr v3, v4 */
	 v4 = this.val;
	 /* aget v4, v4, v7 */
	 v5 = this.val;
	 /* const/16 v6, 0xd */
	 /* aget v5, v5, v6 */
	 /* mul-float/2addr v4, v5 */
	 v5 = this.val;
	 /* const/16 v6, 0xa */
	 /* aget v5, v5, v6 */
	 /* mul-float/2addr v4, v5 */
	 /* sub-float/2addr v3, v4 */
	 v4 = this.val;
	 /* const/16 v5, 0x8 */
	 /* aget v4, v4, v5 */
	 v5 = this.val;
	 /* aget v5, v5, v8 */
	 /* mul-float/2addr v4, v5 */
	 v5 = this.val;
	 /* const/16 v6, 0xe */
	 /* aget v5, v5, v6 */
	 /* mul-float/2addr v4, v5 */
	 /* sub-float/2addr v3, v4 */
	 v4 = this.val;
	 /* aget v4, v4, v7 */
	 v5 = this.val;
	 /* const/16 v6, 0x9 */
	 /* aget v5, v5, v6 */
	 /* mul-float/2addr v4, v5 */
	 v5 = this.val;
	 /* const/16 v6, 0xe */
	 /* aget v5, v5, v6 */
	 /* mul-float/2addr v4, v5 */
	 /* add-float/2addr v3, v4 */
	 /* aput v3, v1, v2 */
	 v1 = this.tmp;
	 v2 = this.val;
	 int v3 = 5; // const/4 v3, 0x5
	 /* aget v2, v2, v3 */
	 v3 = this.val;
	 /* const/16 v4, 0xe */
	 /* aget v3, v3, v4 */
	 /* mul-float/2addr v2, v3 */
	 v3 = this.val;
	 /* aget v3, v3, v10 */
	 /* mul-float/2addr v2, v3 */
	 v3 = this.val;
	 /* const/16 v4, 0xd */
	 /* aget v3, v3, v4 */
	 v4 = this.val;
	 int v5 = 6; // const/4 v5, 0x6
	 /* aget v4, v4, v5 */
	 /* mul-float/2addr v3, v4 */
	 v4 = this.val;
	 /* aget v4, v4, v10 */
	 /* mul-float/2addr v3, v4 */
	 /* sub-float/2addr v2, v3 */
	 v3 = this.val;
	 /* const/16 v4, 0xd */
	 /* aget v3, v3, v4 */
	 v4 = this.val;
	 /* aget v4, v4, v9 */
	 /* mul-float/2addr v3, v4 */
	 v4 = this.val;
	 int v5 = 7; // const/4 v5, 0x7
	 /* aget v4, v4, v5 */
	 /* mul-float/2addr v3, v4 */
	 /* add-float/2addr v2, v3 */
	 v3 = this.val;
	 /* aget v3, v3, v8 */
	 v4 = this.val;
	 /* const/16 v5, 0xe */
	 /* aget v4, v4, v5 */
	 /* mul-float/2addr v3, v4 */
	 v4 = this.val;
	 int v5 = 7; // const/4 v5, 0x7
	 /* aget v4, v4, v5 */
	 /* mul-float/2addr v3, v4 */
	 /* sub-float/2addr v2, v3 */
	 v3 = this.val;
	 int v4 = 5; // const/4 v4, 0x5
	 /* aget v3, v3, v4 */
	 v4 = this.val;
	 /* aget v4, v4, v9 */
	 /* mul-float/2addr v3, v4 */
	 v4 = this.val;
	 /* const/16 v5, 0xf */
	 /* aget v4, v4, v5 */
	 /* mul-float/2addr v3, v4 */
	 /* sub-float/2addr v2, v3 */
	 v3 = this.val;
	 /* aget v3, v3, v8 */
	 v4 = this.val;
	 int v5 = 6; // const/4 v5, 0x6
	 /* aget v4, v4, v5 */
	 /* mul-float/2addr v3, v4 */
	 v4 = this.val;
	 /* const/16 v5, 0xf */
	 /* aget v4, v4, v5 */
	 /* mul-float/2addr v3, v4 */
	 /* add-float/2addr v2, v3 */
	 /* aput v2, v1, v9 */
	 v1 = this.tmp;
	 int v2 = 6; // const/4 v2, 0x6
	 v3 = this.val;
	 /* const/16 v4, 0xc */
	 /* aget v3, v3, v4 */
	 v4 = this.val;
	 int v5 = 6; // const/4 v5, 0x6
	 /* aget v4, v4, v5 */
	 /* mul-float/2addr v3, v4 */
	 v4 = this.val;
	 /* aget v4, v4, v10 */
	 /* mul-float/2addr v3, v4 */
	 v4 = this.val;
	 /* aget v4, v4, v11 */
	 v5 = this.val;
	 /* const/16 v6, 0xe */
	 /* aget v5, v5, v6 */
	 /* mul-float/2addr v4, v5 */
	 v5 = this.val;
	 /* aget v5, v5, v10 */
	 /* mul-float/2addr v4, v5 */
	 /* sub-float/2addr v3, v4 */
	 v4 = this.val;
	 /* const/16 v5, 0xc */
	 /* aget v4, v4, v5 */
	 v5 = this.val;
	 /* aget v5, v5, v9 */
	 /* mul-float/2addr v4, v5 */
	 v5 = this.val;
	 int v6 = 7; // const/4 v6, 0x7
	 /* aget v5, v5, v6 */
	 /* mul-float/2addr v4, v5 */
	 /* sub-float/2addr v3, v4 */
	 v4 = this.val;
	 /* aget v4, v4, v7 */
	 v5 = this.val;
	 /* const/16 v6, 0xe */
	 /* aget v5, v5, v6 */
	 /* mul-float/2addr v4, v5 */
	 v5 = this.val;
	 int v6 = 7; // const/4 v6, 0x7
	 /* aget v5, v5, v6 */
	 /* mul-float/2addr v4, v5 */
	 /* add-float/2addr v3, v4 */
	 v4 = this.val;
	 /* aget v4, v4, v11 */
	 v5 = this.val;
	 /* aget v5, v5, v9 */
	 /* mul-float/2addr v4, v5 */
	 v5 = this.val;
	 /* const/16 v6, 0xf */
	 /* aget v5, v5, v6 */
	 /* mul-float/2addr v4, v5 */
	 /* add-float/2addr v3, v4 */
	 v4 = this.val;
	 /* aget v4, v4, v7 */
	 v5 = this.val;
	 int v6 = 6; // const/4 v6, 0x6
	 /* aget v5, v5, v6 */
	 /* mul-float/2addr v4, v5 */
	 v5 = this.val;
	 /* const/16 v6, 0xf */
	 /* aget v5, v5, v6 */
	 /* mul-float/2addr v4, v5 */
	 /* sub-float/2addr v3, v4 */
	 /* aput v3, v1, v2 */
	 v1 = this.tmp;
	 /* const/16 v2, 0xa */
	 v3 = this.val;
	 /* aget v3, v3, v11 */
	 v4 = this.val;
	 /* const/16 v5, 0xd */
	 /* aget v4, v4, v5 */
	 /* mul-float/2addr v3, v4 */
	 v4 = this.val;
	 /* aget v4, v4, v10 */
	 /* mul-float/2addr v3, v4 */
	 v4 = this.val;
	 /* const/16 v5, 0xc */
	 /* aget v4, v4, v5 */
	 v5 = this.val;
	 int v6 = 5; // const/4 v6, 0x5
	 /* aget v5, v5, v6 */
	 /* mul-float/2addr v4, v5 */
	 v5 = this.val;
	 /* aget v5, v5, v10 */
	 /* mul-float/2addr v4, v5 */
	 /* sub-float/2addr v3, v4 */
	 v4 = this.val;
	 /* const/16 v5, 0xc */
	 /* aget v4, v4, v5 */
	 v5 = this.val;
	 /* aget v5, v5, v8 */
	 /* mul-float/2addr v4, v5 */
	 v5 = this.val;
	 int v6 = 7; // const/4 v6, 0x7
	 /* aget v5, v5, v6 */
	 /* mul-float/2addr v4, v5 */
	 /* add-float/2addr v3, v4 */
	 v4 = this.val;
	 /* aget v4, v4, v7 */
	 v5 = this.val;
	 /* const/16 v6, 0xd */
	 /* aget v5, v5, v6 */
	 /* mul-float/2addr v4, v5 */
	 v5 = this.val;
	 int v6 = 7; // const/4 v6, 0x7
	 /* aget v5, v5, v6 */
	 /* mul-float/2addr v4, v5 */
	 /* sub-float/2addr v3, v4 */
	 v4 = this.val;
	 /* aget v4, v4, v11 */
	 v5 = this.val;
	 /* aget v5, v5, v8 */
	 /* mul-float/2addr v4, v5 */
	 v5 = this.val;
	 /* const/16 v6, 0xf */
	 /* aget v5, v5, v6 */
	 /* mul-float/2addr v4, v5 */
	 /* sub-float/2addr v3, v4 */
	 v4 = this.val;
	 /* aget v4, v4, v7 */
	 v5 = this.val;
	 int v6 = 5; // const/4 v6, 0x5
	 /* aget v5, v5, v6 */
	 /* mul-float/2addr v4, v5 */
	 v5 = this.val;
	 /* const/16 v6, 0xf */
	 /* aget v5, v5, v6 */
	 /* mul-float/2addr v4, v5 */
	 /* add-float/2addr v3, v4 */
	 /* aput v3, v1, v2 */
	 v1 = this.tmp;
	 /* const/16 v2, 0xe */
	 v3 = this.val;
	 /* const/16 v4, 0xc */
	 /* aget v3, v3, v4 */
	 v4 = this.val;
	 int v5 = 5; // const/4 v5, 0x5
	 /* aget v4, v4, v5 */
	 /* mul-float/2addr v3, v4 */
	 v4 = this.val;
	 /* aget v4, v4, v9 */
	 /* mul-float/2addr v3, v4 */
	 v4 = this.val;
	 /* aget v4, v4, v11 */
	 v5 = this.val;
	 /* const/16 v6, 0xd */
	 /* aget v5, v5, v6 */
	 /* mul-float/2addr v4, v5 */
	 v5 = this.val;
	 /* aget v5, v5, v9 */
	 /* mul-float/2addr v4, v5 */
	 /* sub-float/2addr v3, v4 */
	 v4 = this.val;
	 /* const/16 v5, 0xc */
	 /* aget v4, v4, v5 */
	 v5 = this.val;
	 /* aget v5, v5, v8 */
	 /* mul-float/2addr v4, v5 */
	 v5 = this.val;
	 int v6 = 6; // const/4 v6, 0x6
	 /* aget v5, v5, v6 */
	 /* mul-float/2addr v4, v5 */
	 /* sub-float/2addr v3, v4 */
	 v4 = this.val;
	 /* aget v4, v4, v7 */
	 v5 = this.val;
	 /* const/16 v6, 0xd */
	 /* aget v5, v5, v6 */
	 /* mul-float/2addr v4, v5 */
	 v5 = this.val;
	 int v6 = 6; // const/4 v6, 0x6
	 /* aget v5, v5, v6 */
	 /* mul-float/2addr v4, v5 */
	 /* add-float/2addr v3, v4 */
	 v4 = this.val;
	 /* aget v4, v4, v11 */
	 v5 = this.val;
	 /* aget v5, v5, v8 */
	 /* mul-float/2addr v4, v5 */
	 v5 = this.val;
	 /* const/16 v6, 0xe */
	 /* aget v5, v5, v6 */
	 /* mul-float/2addr v4, v5 */
	 /* add-float/2addr v3, v4 */
	 v4 = this.val;
	 /* aget v4, v4, v7 */
	 v5 = this.val;
	 int v6 = 5; // const/4 v6, 0x5
	 /* aget v5, v5, v6 */
	 /* mul-float/2addr v4, v5 */
	 v5 = this.val;
	 /* const/16 v6, 0xe */
	 /* aget v5, v5, v6 */
	 /* mul-float/2addr v4, v5 */
	 /* sub-float/2addr v3, v4 */
	 /* aput v3, v1, v2 */
	 v1 = this.tmp;
	 v2 = this.val;
	 /* const/16 v3, 0x9 */
	 /* aget v2, v2, v3 */
	 v3 = this.val;
	 int v4 = 6; // const/4 v4, 0x6
	 /* aget v3, v3, v4 */
	 /* mul-float/2addr v2, v3 */
	 v3 = this.val;
	 /* aget v3, v3, v10 */
	 /* mul-float/2addr v2, v3 */
	 v3 = this.val;
	 int v4 = 5; // const/4 v4, 0x5
	 /* aget v3, v3, v4 */
	 v4 = this.val;
	 /* const/16 v5, 0xa */
	 /* aget v4, v4, v5 */
	 /* mul-float/2addr v3, v4 */
	 v4 = this.val;
	 /* aget v4, v4, v10 */
	 /* mul-float/2addr v3, v4 */
	 /* sub-float/2addr v2, v3 */
	 v3 = this.val;
	 /* const/16 v4, 0x9 */
	 /* aget v3, v3, v4 */
	 v4 = this.val;
	 /* aget v4, v4, v9 */
	 /* mul-float/2addr v3, v4 */
	 v4 = this.val;
	 int v5 = 7; // const/4 v5, 0x7
	 /* aget v4, v4, v5 */
	 /* mul-float/2addr v3, v4 */
	 /* sub-float/2addr v2, v3 */
	 v3 = this.val;
	 /* aget v3, v3, v8 */
	 v4 = this.val;
	 /* const/16 v5, 0xa */
	 /* aget v4, v4, v5 */
	 /* mul-float/2addr v3, v4 */
	 v4 = this.val;
	 int v5 = 7; // const/4 v5, 0x7
	 /* aget v4, v4, v5 */
	 /* mul-float/2addr v3, v4 */
	 /* add-float/2addr v2, v3 */
	 v3 = this.val;
	 int v4 = 5; // const/4 v4, 0x5
	 /* aget v3, v3, v4 */
	 v4 = this.val;
	 /* aget v4, v4, v9 */
	 /* mul-float/2addr v3, v4 */
	 v4 = this.val;
	 /* const/16 v5, 0xb */
	 /* aget v4, v4, v5 */
	 /* mul-float/2addr v3, v4 */
	 /* add-float/2addr v2, v3 */
	 v3 = this.val;
	 /* aget v3, v3, v8 */
	 v4 = this.val;
	 int v5 = 6; // const/4 v5, 0x6
	 /* aget v4, v4, v5 */
	 /* mul-float/2addr v3, v4 */
	 v4 = this.val;
	 /* const/16 v5, 0xb */
	 /* aget v4, v4, v5 */
	 /* mul-float/2addr v3, v4 */
	 /* sub-float/2addr v2, v3 */
	 /* aput v2, v1, v10 */
	 v1 = this.tmp;
	 int v2 = 7; // const/4 v2, 0x7
	 v3 = this.val;
	 /* aget v3, v3, v11 */
	 v4 = this.val;
	 /* const/16 v5, 0xa */
	 /* aget v4, v4, v5 */
	 /* mul-float/2addr v3, v4 */
	 v4 = this.val;
	 /* aget v4, v4, v10 */
	 /* mul-float/2addr v3, v4 */
	 v4 = this.val;
	 /* const/16 v5, 0x8 */
	 /* aget v4, v4, v5 */
	 v5 = this.val;
	 int v6 = 6; // const/4 v6, 0x6
	 /* aget v5, v5, v6 */
	 /* mul-float/2addr v4, v5 */
	 v5 = this.val;
	 /* aget v5, v5, v10 */
	 /* mul-float/2addr v4, v5 */
	 /* sub-float/2addr v3, v4 */
	 v4 = this.val;
	 /* const/16 v5, 0x8 */
	 /* aget v4, v4, v5 */
	 v5 = this.val;
	 /* aget v5, v5, v9 */
	 /* mul-float/2addr v4, v5 */
	 v5 = this.val;
	 int v6 = 7; // const/4 v6, 0x7
	 /* aget v5, v5, v6 */
	 /* mul-float/2addr v4, v5 */
	 /* add-float/2addr v3, v4 */
	 v4 = this.val;
	 /* aget v4, v4, v7 */
	 v5 = this.val;
	 /* const/16 v6, 0xa */
	 /* aget v5, v5, v6 */
	 /* mul-float/2addr v4, v5 */
	 v5 = this.val;
	 int v6 = 7; // const/4 v6, 0x7
	 /* aget v5, v5, v6 */
	 /* mul-float/2addr v4, v5 */
	 /* sub-float/2addr v3, v4 */
	 v4 = this.val;
	 /* aget v4, v4, v11 */
	 v5 = this.val;
	 /* aget v5, v5, v9 */
	 /* mul-float/2addr v4, v5 */
	 v5 = this.val;
	 /* const/16 v6, 0xb */
	 /* aget v5, v5, v6 */
	 /* mul-float/2addr v4, v5 */
	 /* sub-float/2addr v3, v4 */
	 v4 = this.val;
	 /* aget v4, v4, v7 */
	 v5 = this.val;
	 int v6 = 6; // const/4 v6, 0x6
	 /* aget v5, v5, v6 */
	 /* mul-float/2addr v4, v5 */
	 v5 = this.val;
	 /* const/16 v6, 0xb */
	 /* aget v5, v5, v6 */
	 /* mul-float/2addr v4, v5 */
	 /* add-float/2addr v3, v4 */
	 /* aput v3, v1, v2 */
	 v1 = this.tmp;
	 /* const/16 v2, 0xb */
	 v3 = this.val;
	 /* const/16 v4, 0x8 */
	 /* aget v3, v3, v4 */
	 v4 = this.val;
	 int v5 = 5; // const/4 v5, 0x5
	 /* aget v4, v4, v5 */
	 /* mul-float/2addr v3, v4 */
	 v4 = this.val;
	 /* aget v4, v4, v10 */
	 /* mul-float/2addr v3, v4 */
	 v4 = this.val;
	 /* aget v4, v4, v11 */
	 v5 = this.val;
	 /* const/16 v6, 0x9 */
	 /* aget v5, v5, v6 */
	 /* mul-float/2addr v4, v5 */
	 v5 = this.val;
	 /* aget v5, v5, v10 */
	 /* mul-float/2addr v4, v5 */
	 /* sub-float/2addr v3, v4 */
	 v4 = this.val;
	 /* const/16 v5, 0x8 */
	 /* aget v4, v4, v5 */
	 v5 = this.val;
	 /* aget v5, v5, v8 */
	 /* mul-float/2addr v4, v5 */
	 v5 = this.val;
	 int v6 = 7; // const/4 v6, 0x7
	 /* aget v5, v5, v6 */
	 /* mul-float/2addr v4, v5 */
	 /* sub-float/2addr v3, v4 */
	 v4 = this.val;
	 /* aget v4, v4, v7 */
	 v5 = this.val;
	 /* const/16 v6, 0x9 */
	 /* aget v5, v5, v6 */
	 /* mul-float/2addr v4, v5 */
	 v5 = this.val;
	 int v6 = 7; // const/4 v6, 0x7
	 /* aget v5, v5, v6 */
	 /* mul-float/2addr v4, v5 */
	 /* add-float/2addr v3, v4 */
	 v4 = this.val;
	 /* aget v4, v4, v11 */
	 v5 = this.val;
	 /* aget v5, v5, v8 */
	 /* mul-float/2addr v4, v5 */
	 v5 = this.val;
	 /* const/16 v6, 0xb */
	 /* aget v5, v5, v6 */
	 /* mul-float/2addr v4, v5 */
	 /* add-float/2addr v3, v4 */
	 v4 = this.val;
	 /* aget v4, v4, v7 */
	 v5 = this.val;
	 int v6 = 5; // const/4 v6, 0x5
	 /* aget v5, v5, v6 */
	 /* mul-float/2addr v4, v5 */
	 v5 = this.val;
	 /* const/16 v6, 0xb */
	 /* aget v5, v5, v6 */
	 /* mul-float/2addr v4, v5 */
	 /* sub-float/2addr v3, v4 */
	 /* aput v3, v1, v2 */
	 v1 = this.tmp;
	 /* const/16 v2, 0xf */
	 v3 = this.val;
	 /* aget v3, v3, v11 */
	 v4 = this.val;
	 /* const/16 v5, 0x9 */
	 /* aget v4, v4, v5 */
	 /* mul-float/2addr v3, v4 */
	 v4 = this.val;
	 /* aget v4, v4, v9 */
	 /* mul-float/2addr v3, v4 */
	 v4 = this.val;
	 /* const/16 v5, 0x8 */
	 /* aget v4, v4, v5 */
	 v5 = this.val;
	 int v6 = 5; // const/4 v6, 0x5
	 /* aget v5, v5, v6 */
	 /* mul-float/2addr v4, v5 */
	 v5 = this.val;
	 /* aget v5, v5, v9 */
	 /* mul-float/2addr v4, v5 */
	 /* sub-float/2addr v3, v4 */
	 v4 = this.val;
	 /* const/16 v5, 0x8 */
	 /* aget v4, v4, v5 */
	 v5 = this.val;
	 /* aget v5, v5, v8 */
	 /* mul-float/2addr v4, v5 */
	 v5 = this.val;
	 int v6 = 6; // const/4 v6, 0x6
	 /* aget v5, v5, v6 */
	 /* mul-float/2addr v4, v5 */
	 /* add-float/2addr v3, v4 */
	 v4 = this.val;
	 /* aget v4, v4, v7 */
	 v5 = this.val;
	 /* const/16 v6, 0x9 */
	 /* aget v5, v5, v6 */
	 /* mul-float/2addr v4, v5 */
	 v5 = this.val;
	 int v6 = 6; // const/4 v6, 0x6
	 /* aget v5, v5, v6 */
	 /* mul-float/2addr v4, v5 */
	 /* sub-float/2addr v3, v4 */
	 v4 = this.val;
	 /* aget v4, v4, v11 */
	 v5 = this.val;
	 /* aget v5, v5, v8 */
	 /* mul-float/2addr v4, v5 */
	 v5 = this.val;
	 /* const/16 v6, 0xa */
	 /* aget v5, v5, v6 */
	 /* mul-float/2addr v4, v5 */
	 /* sub-float/2addr v3, v4 */
	 v4 = this.val;
	 /* aget v4, v4, v7 */
	 v5 = this.val;
	 int v6 = 5; // const/4 v6, 0x5
	 /* aget v5, v5, v6 */
	 /* mul-float/2addr v4, v5 */
	 v5 = this.val;
	 /* const/16 v6, 0xa */
	 /* aget v5, v5, v6 */
	 /* mul-float/2addr v4, v5 */
	 /* add-float/2addr v3, v4 */
	 /* aput v3, v1, v2 */
	 v1 = this.val;
	 v2 = this.tmp;
	 /* aget v2, v2, v7 */
	 /* mul-float/2addr v2, v0 */
	 /* aput v2, v1, v7 */
	 v1 = this.val;
	 v2 = this.tmp;
	 /* aget v2, v2, v11 */
	 /* mul-float/2addr v2, v0 */
	 /* aput v2, v1, v11 */
	 v1 = this.val;
	 /* const/16 v2, 0x8 */
	 v3 = this.tmp;
	 /* const/16 v4, 0x8 */
	 /* aget v3, v3, v4 */
	 /* mul-float/2addr v3, v0 */
	 /* aput v3, v1, v2 */
	 v1 = this.val;
	 /* const/16 v2, 0xc */
	 v3 = this.tmp;
	 /* const/16 v4, 0xc */
	 /* aget v3, v3, v4 */
	 /* mul-float/2addr v3, v0 */
	 /* aput v3, v1, v2 */
	 v1 = this.val;
	 v2 = this.tmp;
	 /* aget v2, v2, v8 */
	 /* mul-float/2addr v2, v0 */
	 /* aput v2, v1, v8 */
	 v1 = this.val;
	 int v2 = 5; // const/4 v2, 0x5
	 v3 = this.tmp;
	 int v4 = 5; // const/4 v4, 0x5
	 /* aget v3, v3, v4 */
	 /* mul-float/2addr v3, v0 */
	 /* aput v3, v1, v2 */
	 v1 = this.val;
	 /* const/16 v2, 0x9 */
	 v3 = this.tmp;
	 /* const/16 v4, 0x9 */
	 /* aget v3, v3, v4 */
	 /* mul-float/2addr v3, v0 */
	 /* aput v3, v1, v2 */
	 v1 = this.val;
	 /* const/16 v2, 0xd */
	 v3 = this.tmp;
	 /* const/16 v4, 0xd */
	 /* aget v3, v3, v4 */
	 /* mul-float/2addr v3, v0 */
	 /* aput v3, v1, v2 */
	 v1 = this.val;
	 v2 = this.tmp;
	 /* aget v2, v2, v9 */
	 /* mul-float/2addr v2, v0 */
	 /* aput v2, v1, v9 */
	 v1 = this.val;
	 int v2 = 6; // const/4 v2, 0x6
	 v3 = this.tmp;
	 int v4 = 6; // const/4 v4, 0x6
	 /* aget v3, v3, v4 */
	 /* mul-float/2addr v3, v0 */
	 /* aput v3, v1, v2 */
	 v1 = this.val;
	 /* const/16 v2, 0xa */
	 v3 = this.tmp;
	 /* const/16 v4, 0xa */
	 /* aget v3, v3, v4 */
	 /* mul-float/2addr v3, v0 */
	 /* aput v3, v1, v2 */
	 v1 = this.val;
	 /* const/16 v2, 0xe */
	 v3 = this.tmp;
	 /* const/16 v4, 0xe */
	 /* aget v3, v3, v4 */
	 /* mul-float/2addr v3, v0 */
	 /* aput v3, v1, v2 */
	 v1 = this.val;
	 v2 = this.tmp;
	 /* aget v2, v2, v10 */
	 /* mul-float/2addr v2, v0 */
	 /* aput v2, v1, v10 */
	 v1 = this.val;
	 int v2 = 7; // const/4 v2, 0x7
	 v3 = this.tmp;
	 int v4 = 7; // const/4 v4, 0x7
	 /* aget v3, v3, v4 */
	 /* mul-float/2addr v3, v0 */
	 /* aput v3, v1, v2 */
	 v1 = this.val;
	 /* const/16 v2, 0xb */
	 v3 = this.tmp;
	 /* const/16 v4, 0xb */
	 /* aget v3, v3, v4 */
	 /* mul-float/2addr v3, v0 */
	 /* aput v3, v1, v2 */
	 v1 = this.val;
	 /* const/16 v2, 0xf */
	 v3 = this.tmp;
	 /* const/16 v4, 0xf */
	 /* aget v3, v3, v4 */
	 /* mul-float/2addr v0, v3 */
	 /* aput v0, v1, v2 */
} // .end method
public void lerp ( com.badlogic.gdx.math.Matrix4 p0, Float p1 ) {
	 /* .locals 4 */
	 int v0 = 0; // const/4 v0, 0x0
} // :goto_0
/* const/16 v1, 0x10 */
/* if-ge v0, v1, :cond_0 */
v1 = this.val;
v2 = this.val;
/* aget v2, v2, v0 */
/* const/high16 v3, 0x3f800000 # 1.0f */
/* sub-float/2addr v3, p2 */
/* mul-float/2addr v2, v3 */
v3 = this.val;
/* aget v3, v3, v0 */
/* mul-float/2addr v3, p2 */
/* add-float/2addr v2, v3 */
/* aput v2, v1, v0 */
/* add-int/lit8 v0, v0, 0x1 */
} // :cond_0
return;
} // .end method
public com.badlogic.gdx.math.Matrix4 mul ( com.badlogic.gdx.math.Matrix4 p0 ) {
/* .locals 11 */
int v10 = 4; // const/4 v10, 0x4
int v9 = 3; // const/4 v9, 0x3
int v8 = 2; // const/4 v8, 0x2
int v7 = 1; // const/4 v7, 0x1
int v6 = 0; // const/4 v6, 0x0
v0 = this.tmp;
v1 = this.val;
/* aget v1, v1, v6 */
v2 = this.val;
/* aget v2, v2, v6 */
/* mul-float/2addr v1, v2 */
v2 = this.val;
/* aget v2, v2, v10 */
v3 = this.val;
/* aget v3, v3, v7 */
/* mul-float/2addr v2, v3 */
/* add-float/2addr v1, v2 */
v2 = this.val;
/* const/16 v3, 0x8 */
/* aget v2, v2, v3 */
v3 = this.val;
/* aget v3, v3, v8 */
/* mul-float/2addr v2, v3 */
/* add-float/2addr v1, v2 */
v2 = this.val;
/* const/16 v3, 0xc */
/* aget v2, v2, v3 */
v3 = this.val;
/* aget v3, v3, v9 */
/* mul-float/2addr v2, v3 */
/* add-float/2addr v1, v2 */
/* aput v1, v0, v6 */
v0 = this.tmp;
v1 = this.val;
/* aget v1, v1, v6 */
v2 = this.val;
/* aget v2, v2, v10 */
/* mul-float/2addr v1, v2 */
v2 = this.val;
/* aget v2, v2, v10 */
v3 = this.val;
int v4 = 5; // const/4 v4, 0x5
/* aget v3, v3, v4 */
/* mul-float/2addr v2, v3 */
/* add-float/2addr v1, v2 */
v2 = this.val;
/* const/16 v3, 0x8 */
/* aget v2, v2, v3 */
v3 = this.val;
int v4 = 6; // const/4 v4, 0x6
/* aget v3, v3, v4 */
/* mul-float/2addr v2, v3 */
/* add-float/2addr v1, v2 */
v2 = this.val;
/* const/16 v3, 0xc */
/* aget v2, v2, v3 */
v3 = this.val;
int v4 = 7; // const/4 v4, 0x7
/* aget v3, v3, v4 */
/* mul-float/2addr v2, v3 */
/* add-float/2addr v1, v2 */
/* aput v1, v0, v10 */
v0 = this.tmp;
/* const/16 v1, 0x8 */
v2 = this.val;
/* aget v2, v2, v6 */
v3 = this.val;
/* const/16 v4, 0x8 */
/* aget v3, v3, v4 */
/* mul-float/2addr v2, v3 */
v3 = this.val;
/* aget v3, v3, v10 */
v4 = this.val;
/* const/16 v5, 0x9 */
/* aget v4, v4, v5 */
/* mul-float/2addr v3, v4 */
/* add-float/2addr v2, v3 */
v3 = this.val;
/* const/16 v4, 0x8 */
/* aget v3, v3, v4 */
v4 = this.val;
/* const/16 v5, 0xa */
/* aget v4, v4, v5 */
/* mul-float/2addr v3, v4 */
/* add-float/2addr v2, v3 */
v3 = this.val;
/* const/16 v4, 0xc */
/* aget v3, v3, v4 */
v4 = this.val;
/* const/16 v5, 0xb */
/* aget v4, v4, v5 */
/* mul-float/2addr v3, v4 */
/* add-float/2addr v2, v3 */
/* aput v2, v0, v1 */
v0 = this.tmp;
/* const/16 v1, 0xc */
v2 = this.val;
/* aget v2, v2, v6 */
v3 = this.val;
/* const/16 v4, 0xc */
/* aget v3, v3, v4 */
/* mul-float/2addr v2, v3 */
v3 = this.val;
/* aget v3, v3, v10 */
v4 = this.val;
/* const/16 v5, 0xd */
/* aget v4, v4, v5 */
/* mul-float/2addr v3, v4 */
/* add-float/2addr v2, v3 */
v3 = this.val;
/* const/16 v4, 0x8 */
/* aget v3, v3, v4 */
v4 = this.val;
/* const/16 v5, 0xe */
/* aget v4, v4, v5 */
/* mul-float/2addr v3, v4 */
/* add-float/2addr v2, v3 */
v3 = this.val;
/* const/16 v4, 0xc */
/* aget v3, v3, v4 */
v4 = this.val;
/* const/16 v5, 0xf */
/* aget v4, v4, v5 */
/* mul-float/2addr v3, v4 */
/* add-float/2addr v2, v3 */
/* aput v2, v0, v1 */
v0 = this.tmp;
v1 = this.val;
/* aget v1, v1, v7 */
v2 = this.val;
/* aget v2, v2, v6 */
/* mul-float/2addr v1, v2 */
v2 = this.val;
int v3 = 5; // const/4 v3, 0x5
/* aget v2, v2, v3 */
v3 = this.val;
/* aget v3, v3, v7 */
/* mul-float/2addr v2, v3 */
/* add-float/2addr v1, v2 */
v2 = this.val;
/* const/16 v3, 0x9 */
/* aget v2, v2, v3 */
v3 = this.val;
/* aget v3, v3, v8 */
/* mul-float/2addr v2, v3 */
/* add-float/2addr v1, v2 */
v2 = this.val;
/* const/16 v3, 0xd */
/* aget v2, v2, v3 */
v3 = this.val;
/* aget v3, v3, v9 */
/* mul-float/2addr v2, v3 */
/* add-float/2addr v1, v2 */
/* aput v1, v0, v7 */
v0 = this.tmp;
int v1 = 5; // const/4 v1, 0x5
v2 = this.val;
/* aget v2, v2, v7 */
v3 = this.val;
/* aget v3, v3, v10 */
/* mul-float/2addr v2, v3 */
v3 = this.val;
int v4 = 5; // const/4 v4, 0x5
/* aget v3, v3, v4 */
v4 = this.val;
int v5 = 5; // const/4 v5, 0x5
/* aget v4, v4, v5 */
/* mul-float/2addr v3, v4 */
/* add-float/2addr v2, v3 */
v3 = this.val;
/* const/16 v4, 0x9 */
/* aget v3, v3, v4 */
v4 = this.val;
int v5 = 6; // const/4 v5, 0x6
/* aget v4, v4, v5 */
/* mul-float/2addr v3, v4 */
/* add-float/2addr v2, v3 */
v3 = this.val;
/* const/16 v4, 0xd */
/* aget v3, v3, v4 */
v4 = this.val;
int v5 = 7; // const/4 v5, 0x7
/* aget v4, v4, v5 */
/* mul-float/2addr v3, v4 */
/* add-float/2addr v2, v3 */
/* aput v2, v0, v1 */
v0 = this.tmp;
/* const/16 v1, 0x9 */
v2 = this.val;
/* aget v2, v2, v7 */
v3 = this.val;
/* const/16 v4, 0x8 */
/* aget v3, v3, v4 */
/* mul-float/2addr v2, v3 */
v3 = this.val;
int v4 = 5; // const/4 v4, 0x5
/* aget v3, v3, v4 */
v4 = this.val;
/* const/16 v5, 0x9 */
/* aget v4, v4, v5 */
/* mul-float/2addr v3, v4 */
/* add-float/2addr v2, v3 */
v3 = this.val;
/* const/16 v4, 0x9 */
/* aget v3, v3, v4 */
v4 = this.val;
/* const/16 v5, 0xa */
/* aget v4, v4, v5 */
/* mul-float/2addr v3, v4 */
/* add-float/2addr v2, v3 */
v3 = this.val;
/* const/16 v4, 0xd */
/* aget v3, v3, v4 */
v4 = this.val;
/* const/16 v5, 0xb */
/* aget v4, v4, v5 */
/* mul-float/2addr v3, v4 */
/* add-float/2addr v2, v3 */
/* aput v2, v0, v1 */
v0 = this.tmp;
/* const/16 v1, 0xd */
v2 = this.val;
/* aget v2, v2, v7 */
v3 = this.val;
/* const/16 v4, 0xc */
/* aget v3, v3, v4 */
/* mul-float/2addr v2, v3 */
v3 = this.val;
int v4 = 5; // const/4 v4, 0x5
/* aget v3, v3, v4 */
v4 = this.val;
/* const/16 v5, 0xd */
/* aget v4, v4, v5 */
/* mul-float/2addr v3, v4 */
/* add-float/2addr v2, v3 */
v3 = this.val;
/* const/16 v4, 0x9 */
/* aget v3, v3, v4 */
v4 = this.val;
/* const/16 v5, 0xe */
/* aget v4, v4, v5 */
/* mul-float/2addr v3, v4 */
/* add-float/2addr v2, v3 */
v3 = this.val;
/* const/16 v4, 0xd */
/* aget v3, v3, v4 */
v4 = this.val;
/* const/16 v5, 0xf */
/* aget v4, v4, v5 */
/* mul-float/2addr v3, v4 */
/* add-float/2addr v2, v3 */
/* aput v2, v0, v1 */
v0 = this.tmp;
v1 = this.val;
/* aget v1, v1, v8 */
v2 = this.val;
/* aget v2, v2, v6 */
/* mul-float/2addr v1, v2 */
v2 = this.val;
int v3 = 6; // const/4 v3, 0x6
/* aget v2, v2, v3 */
v3 = this.val;
/* aget v3, v3, v7 */
/* mul-float/2addr v2, v3 */
/* add-float/2addr v1, v2 */
v2 = this.val;
/* const/16 v3, 0xa */
/* aget v2, v2, v3 */
v3 = this.val;
/* aget v3, v3, v8 */
/* mul-float/2addr v2, v3 */
/* add-float/2addr v1, v2 */
v2 = this.val;
/* const/16 v3, 0xe */
/* aget v2, v2, v3 */
v3 = this.val;
/* aget v3, v3, v9 */
/* mul-float/2addr v2, v3 */
/* add-float/2addr v1, v2 */
/* aput v1, v0, v8 */
v0 = this.tmp;
int v1 = 6; // const/4 v1, 0x6
v2 = this.val;
/* aget v2, v2, v8 */
v3 = this.val;
/* aget v3, v3, v10 */
/* mul-float/2addr v2, v3 */
v3 = this.val;
int v4 = 6; // const/4 v4, 0x6
/* aget v3, v3, v4 */
v4 = this.val;
int v5 = 5; // const/4 v5, 0x5
/* aget v4, v4, v5 */
/* mul-float/2addr v3, v4 */
/* add-float/2addr v2, v3 */
v3 = this.val;
/* const/16 v4, 0xa */
/* aget v3, v3, v4 */
v4 = this.val;
int v5 = 6; // const/4 v5, 0x6
/* aget v4, v4, v5 */
/* mul-float/2addr v3, v4 */
/* add-float/2addr v2, v3 */
v3 = this.val;
/* const/16 v4, 0xe */
/* aget v3, v3, v4 */
v4 = this.val;
int v5 = 7; // const/4 v5, 0x7
/* aget v4, v4, v5 */
/* mul-float/2addr v3, v4 */
/* add-float/2addr v2, v3 */
/* aput v2, v0, v1 */
v0 = this.tmp;
/* const/16 v1, 0xa */
v2 = this.val;
/* aget v2, v2, v8 */
v3 = this.val;
/* const/16 v4, 0x8 */
/* aget v3, v3, v4 */
/* mul-float/2addr v2, v3 */
v3 = this.val;
int v4 = 6; // const/4 v4, 0x6
/* aget v3, v3, v4 */
v4 = this.val;
/* const/16 v5, 0x9 */
/* aget v4, v4, v5 */
/* mul-float/2addr v3, v4 */
/* add-float/2addr v2, v3 */
v3 = this.val;
/* const/16 v4, 0xa */
/* aget v3, v3, v4 */
v4 = this.val;
/* const/16 v5, 0xa */
/* aget v4, v4, v5 */
/* mul-float/2addr v3, v4 */
/* add-float/2addr v2, v3 */
v3 = this.val;
/* const/16 v4, 0xe */
/* aget v3, v3, v4 */
v4 = this.val;
/* const/16 v5, 0xb */
/* aget v4, v4, v5 */
/* mul-float/2addr v3, v4 */
/* add-float/2addr v2, v3 */
/* aput v2, v0, v1 */
v0 = this.tmp;
/* const/16 v1, 0xe */
v2 = this.val;
/* aget v2, v2, v8 */
v3 = this.val;
/* const/16 v4, 0xc */
/* aget v3, v3, v4 */
/* mul-float/2addr v2, v3 */
v3 = this.val;
int v4 = 6; // const/4 v4, 0x6
/* aget v3, v3, v4 */
v4 = this.val;
/* const/16 v5, 0xd */
/* aget v4, v4, v5 */
/* mul-float/2addr v3, v4 */
/* add-float/2addr v2, v3 */
v3 = this.val;
/* const/16 v4, 0xa */
/* aget v3, v3, v4 */
v4 = this.val;
/* const/16 v5, 0xe */
/* aget v4, v4, v5 */
/* mul-float/2addr v3, v4 */
/* add-float/2addr v2, v3 */
v3 = this.val;
/* const/16 v4, 0xe */
/* aget v3, v3, v4 */
v4 = this.val;
/* const/16 v5, 0xf */
/* aget v4, v4, v5 */
/* mul-float/2addr v3, v4 */
/* add-float/2addr v2, v3 */
/* aput v2, v0, v1 */
v0 = this.tmp;
v1 = this.val;
/* aget v1, v1, v9 */
v2 = this.val;
/* aget v2, v2, v6 */
/* mul-float/2addr v1, v2 */
v2 = this.val;
int v3 = 7; // const/4 v3, 0x7
/* aget v2, v2, v3 */
v3 = this.val;
/* aget v3, v3, v7 */
/* mul-float/2addr v2, v3 */
/* add-float/2addr v1, v2 */
v2 = this.val;
/* const/16 v3, 0xb */
/* aget v2, v2, v3 */
v3 = this.val;
/* aget v3, v3, v8 */
/* mul-float/2addr v2, v3 */
/* add-float/2addr v1, v2 */
v2 = this.val;
/* const/16 v3, 0xf */
/* aget v2, v2, v3 */
v3 = this.val;
/* aget v3, v3, v9 */
/* mul-float/2addr v2, v3 */
/* add-float/2addr v1, v2 */
/* aput v1, v0, v9 */
v0 = this.tmp;
int v1 = 7; // const/4 v1, 0x7
v2 = this.val;
/* aget v2, v2, v9 */
v3 = this.val;
/* aget v3, v3, v10 */
/* mul-float/2addr v2, v3 */
v3 = this.val;
int v4 = 7; // const/4 v4, 0x7
/* aget v3, v3, v4 */
v4 = this.val;
int v5 = 5; // const/4 v5, 0x5
/* aget v4, v4, v5 */
/* mul-float/2addr v3, v4 */
/* add-float/2addr v2, v3 */
v3 = this.val;
/* const/16 v4, 0xb */
/* aget v3, v3, v4 */
v4 = this.val;
int v5 = 6; // const/4 v5, 0x6
/* aget v4, v4, v5 */
/* mul-float/2addr v3, v4 */
/* add-float/2addr v2, v3 */
v3 = this.val;
/* const/16 v4, 0xf */
/* aget v3, v3, v4 */
v4 = this.val;
int v5 = 7; // const/4 v5, 0x7
/* aget v4, v4, v5 */
/* mul-float/2addr v3, v4 */
/* add-float/2addr v2, v3 */
/* aput v2, v0, v1 */
v0 = this.tmp;
/* const/16 v1, 0xb */
v2 = this.val;
/* aget v2, v2, v9 */
v3 = this.val;
/* const/16 v4, 0x8 */
/* aget v3, v3, v4 */
/* mul-float/2addr v2, v3 */
v3 = this.val;
int v4 = 7; // const/4 v4, 0x7
/* aget v3, v3, v4 */
v4 = this.val;
/* const/16 v5, 0x9 */
/* aget v4, v4, v5 */
/* mul-float/2addr v3, v4 */
/* add-float/2addr v2, v3 */
v3 = this.val;
/* const/16 v4, 0xb */
/* aget v3, v3, v4 */
v4 = this.val;
/* const/16 v5, 0xa */
/* aget v4, v4, v5 */
/* mul-float/2addr v3, v4 */
/* add-float/2addr v2, v3 */
v3 = this.val;
/* const/16 v4, 0xf */
/* aget v3, v3, v4 */
v4 = this.val;
/* const/16 v5, 0xb */
/* aget v4, v4, v5 */
/* mul-float/2addr v3, v4 */
/* add-float/2addr v2, v3 */
/* aput v2, v0, v1 */
v0 = this.tmp;
/* const/16 v1, 0xf */
v2 = this.val;
/* aget v2, v2, v9 */
v3 = this.val;
/* const/16 v4, 0xc */
/* aget v3, v3, v4 */
/* mul-float/2addr v2, v3 */
v3 = this.val;
int v4 = 7; // const/4 v4, 0x7
/* aget v3, v3, v4 */
v4 = this.val;
/* const/16 v5, 0xd */
/* aget v4, v4, v5 */
/* mul-float/2addr v3, v4 */
/* add-float/2addr v2, v3 */
v3 = this.val;
/* const/16 v4, 0xb */
/* aget v3, v3, v4 */
v4 = this.val;
/* const/16 v5, 0xe */
/* aget v4, v4, v5 */
/* mul-float/2addr v3, v4 */
/* add-float/2addr v2, v3 */
v3 = this.val;
/* const/16 v4, 0xf */
/* aget v3, v3, v4 */
v4 = this.val;
/* const/16 v5, 0xf */
/* aget v4, v4, v5 */
/* mul-float/2addr v3, v4 */
/* add-float/2addr v2, v3 */
/* aput v2, v0, v1 */
v0 = this.tmp;
(( com.badlogic.gdx.math.Matrix4 ) p0 ).set ( v0 ); // invoke-virtual {p0, v0}, Lcom/badlogic/gdx/math/Matrix4;->set([F)Lcom/badlogic/gdx/math/Matrix4;
} // .end method
public com.badlogic.gdx.math.Matrix4 rotate ( Float p0, Float p1, Float p2, Float p3 ) {
/* .locals 18 */
int v4 = 0; // const/4 v4, 0x0
/* cmpl-float v4, p4, v4 */
/* if-nez v4, :cond_0 */
/* move-object/from16 v4, p0 */
} // :goto_0
} // :cond_0
v4 = com.badlogic.gdx.math.Matrix4.quat;
v5 = com.badlogic.gdx.math.Matrix4.tmpV;
/* move-object v0, v5 */
/* move/from16 v1, p1 */
/* move/from16 v2, p2 */
/* move/from16 v3, p3 */
(( com.badlogic.gdx.math.Vector3 ) v0 ).set ( v1, v2, v3 ); // invoke-virtual {v0, v1, v2, v3}, Lcom/badlogic/gdx/math/Vector3;->set(FFF)Lcom/badlogic/gdx/math/Vector3;
/* move-object v0, v4 */
/* move-object v1, v5 */
/* move/from16 v2, p4 */
(( com.badlogic.gdx.math.Quaternion ) v0 ).set ( v1, v2 ); // invoke-virtual {v0, v1, v2}, Lcom/badlogic/gdx/math/Quaternion;->set(Lcom/badlogic/gdx/math/Vector3;F)Lcom/badlogic/gdx/math/Quaternion;
v4 = com.badlogic.gdx.math.Matrix4.quat;
/* iget v5, v4, Lcom/badlogic/gdx/math/Quaternion;->x:F */
/* iget v6, v4, Lcom/badlogic/gdx/math/Quaternion;->x:F */
/* mul-float/2addr v5, v6 */
/* iget v6, v4, Lcom/badlogic/gdx/math/Quaternion;->x:F */
/* iget v7, v4, Lcom/badlogic/gdx/math/Quaternion;->y:F */
/* mul-float/2addr v6, v7 */
/* iget v7, v4, Lcom/badlogic/gdx/math/Quaternion;->x:F */
/* iget v8, v4, Lcom/badlogic/gdx/math/Quaternion;->z:F */
/* mul-float/2addr v7, v8 */
/* iget v8, v4, Lcom/badlogic/gdx/math/Quaternion;->x:F */
/* iget v9, v4, Lcom/badlogic/gdx/math/Quaternion;->w:F */
/* mul-float/2addr v8, v9 */
/* iget v9, v4, Lcom/badlogic/gdx/math/Quaternion;->y:F */
/* iget v10, v4, Lcom/badlogic/gdx/math/Quaternion;->y:F */
/* mul-float/2addr v9, v10 */
/* iget v10, v4, Lcom/badlogic/gdx/math/Quaternion;->y:F */
/* iget v11, v4, Lcom/badlogic/gdx/math/Quaternion;->z:F */
/* mul-float/2addr v10, v11 */
/* iget v11, v4, Lcom/badlogic/gdx/math/Quaternion;->y:F */
/* iget v12, v4, Lcom/badlogic/gdx/math/Quaternion;->w:F */
/* mul-float/2addr v11, v12 */
/* iget v12, v4, Lcom/badlogic/gdx/math/Quaternion;->z:F */
/* iget v13, v4, Lcom/badlogic/gdx/math/Quaternion;->z:F */
/* mul-float/2addr v12, v13 */
/* iget v13, v4, Lcom/badlogic/gdx/math/Quaternion;->z:F */
/* iget v4, v4, Lcom/badlogic/gdx/math/Quaternion;->w:F */
/* mul-float/2addr v4, v13 */
/* move-object/from16 v0, p0 */
v0 = this.tmp;
/* move-object v13, v0 */
int v14 = 0; // const/4 v14, 0x0
/* const/high16 v15, 0x3f800000 # 1.0f */
/* const/high16 v16, 0x40000000 # 2.0f */
/* add-float v17, v9, v12 */
/* mul-float v16, v16, v17 */
/* sub-float v15, v15, v16 */
/* aput v15, v13, v14 */
/* move-object/from16 v0, p0 */
v0 = this.tmp;
/* move-object v13, v0 */
int v14 = 4; // const/4 v14, 0x4
/* const/high16 v15, 0x40000000 # 2.0f */
/* sub-float v16, v6, v4 */
/* mul-float v15, v15, v16 */
/* aput v15, v13, v14 */
/* move-object/from16 v0, p0 */
v0 = this.tmp;
/* move-object v13, v0 */
/* const/16 v14, 0x8 */
/* const/high16 v15, 0x40000000 # 2.0f */
/* add-float v16, v7, v11 */
/* mul-float v15, v15, v16 */
/* aput v15, v13, v14 */
/* move-object/from16 v0, p0 */
v0 = this.tmp;
/* move-object v13, v0 */
/* const/16 v14, 0xc */
int v15 = 0; // const/4 v15, 0x0
/* aput v15, v13, v14 */
/* move-object/from16 v0, p0 */
v0 = this.tmp;
/* move-object v13, v0 */
int v14 = 1; // const/4 v14, 0x1
/* const/high16 v15, 0x40000000 # 2.0f */
/* add-float/2addr v4, v6 */
/* mul-float/2addr v4, v15 */
/* aput v4, v13, v14 */
/* move-object/from16 v0, p0 */
v0 = this.tmp;
/* move-object v4, v0 */
int v6 = 5; // const/4 v6, 0x5
/* const/high16 v13, 0x3f800000 # 1.0f */
/* const/high16 v14, 0x40000000 # 2.0f */
/* add-float/2addr v12, v5 */
/* mul-float/2addr v12, v14 */
/* sub-float v12, v13, v12 */
/* aput v12, v4, v6 */
/* move-object/from16 v0, p0 */
v0 = this.tmp;
/* move-object v4, v0 */
/* const/16 v6, 0x9 */
/* const/high16 v12, 0x40000000 # 2.0f */
/* sub-float v13, v10, v8 */
/* mul-float/2addr v12, v13 */
/* aput v12, v4, v6 */
/* move-object/from16 v0, p0 */
v0 = this.tmp;
/* move-object v4, v0 */
/* const/16 v6, 0xd */
int v12 = 0; // const/4 v12, 0x0
/* aput v12, v4, v6 */
/* move-object/from16 v0, p0 */
v0 = this.tmp;
/* move-object v4, v0 */
int v6 = 2; // const/4 v6, 0x2
/* const/high16 v12, 0x40000000 # 2.0f */
/* sub-float/2addr v7, v11 */
/* mul-float/2addr v7, v12 */
/* aput v7, v4, v6 */
/* move-object/from16 v0, p0 */
v0 = this.tmp;
/* move-object v4, v0 */
int v6 = 6; // const/4 v6, 0x6
/* const/high16 v7, 0x40000000 # 2.0f */
/* add-float/2addr v8, v10 */
/* mul-float/2addr v7, v8 */
/* aput v7, v4, v6 */
/* move-object/from16 v0, p0 */
v0 = this.tmp;
/* move-object v4, v0 */
/* const/16 v6, 0xa */
/* const/high16 v7, 0x3f800000 # 1.0f */
/* const/high16 v8, 0x40000000 # 2.0f */
/* add-float/2addr v5, v9 */
/* mul-float/2addr v5, v8 */
/* sub-float v5, v7, v5 */
/* aput v5, v4, v6 */
/* move-object/from16 v0, p0 */
v0 = this.tmp;
/* move-object v4, v0 */
/* const/16 v5, 0xe */
int v6 = 0; // const/4 v6, 0x0
/* aput v6, v4, v5 */
/* move-object/from16 v0, p0 */
v0 = this.tmp;
/* move-object v4, v0 */
int v5 = 3; // const/4 v5, 0x3
int v6 = 0; // const/4 v6, 0x0
/* aput v6, v4, v5 */
/* move-object/from16 v0, p0 */
v0 = this.tmp;
/* move-object v4, v0 */
int v5 = 7; // const/4 v5, 0x7
int v6 = 0; // const/4 v6, 0x0
/* aput v6, v4, v5 */
/* move-object/from16 v0, p0 */
v0 = this.tmp;
/* move-object v4, v0 */
/* const/16 v5, 0xb */
int v6 = 0; // const/4 v6, 0x0
/* aput v6, v4, v5 */
/* move-object/from16 v0, p0 */
v0 = this.tmp;
/* move-object v4, v0 */
/* const/16 v5, 0xf */
/* const/high16 v6, 0x3f800000 # 1.0f */
/* aput v6, v4, v5 */
/* move-object/from16 v0, p0 */
v0 = this.val;
/* move-object v4, v0 */
/* move-object/from16 v0, p0 */
v0 = this.tmp;
/* move-object v5, v0 */
com.badlogic.gdx.math.Matrix4 .mul ( v4,v5 );
/* move-object/from16 v4, p0 */
/* goto/16 :goto_0 */
} // .end method
public com.badlogic.gdx.math.Matrix4 scale ( Float p0, Float p1, Float p2 ) {
/* .locals 3 */
int v2 = 0; // const/4 v2, 0x0
v0 = this.tmp;
int v1 = 0; // const/4 v1, 0x0
/* aput p1, v0, v1 */
v0 = this.tmp;
int v1 = 4; // const/4 v1, 0x4
/* aput v2, v0, v1 */
v0 = this.tmp;
/* const/16 v1, 0x8 */
/* aput v2, v0, v1 */
v0 = this.tmp;
/* const/16 v1, 0xc */
/* aput v2, v0, v1 */
v0 = this.tmp;
int v1 = 1; // const/4 v1, 0x1
/* aput v2, v0, v1 */
v0 = this.tmp;
int v1 = 5; // const/4 v1, 0x5
/* aput p2, v0, v1 */
v0 = this.tmp;
/* const/16 v1, 0x9 */
/* aput v2, v0, v1 */
v0 = this.tmp;
/* const/16 v1, 0xd */
/* aput v2, v0, v1 */
v0 = this.tmp;
int v1 = 2; // const/4 v1, 0x2
/* aput v2, v0, v1 */
v0 = this.tmp;
int v1 = 6; // const/4 v1, 0x6
/* aput v2, v0, v1 */
v0 = this.tmp;
/* const/16 v1, 0xa */
/* aput p3, v0, v1 */
v0 = this.tmp;
/* const/16 v1, 0xe */
/* aput v2, v0, v1 */
v0 = this.tmp;
int v1 = 3; // const/4 v1, 0x3
/* aput v2, v0, v1 */
v0 = this.tmp;
int v1 = 7; // const/4 v1, 0x7
/* aput v2, v0, v1 */
v0 = this.tmp;
/* const/16 v1, 0xb */
/* aput v2, v0, v1 */
v0 = this.tmp;
/* const/16 v1, 0xf */
/* const/high16 v2, 0x3f800000 # 1.0f */
/* aput v2, v0, v1 */
v0 = this.val;
v1 = this.tmp;
com.badlogic.gdx.math.Matrix4 .mul ( v0,v1 );
} // .end method
public void scl ( com.badlogic.gdx.math.Vector3 p0 ) {
/* .locals 4 */
v0 = this.val;
int v1 = 0; // const/4 v1, 0x0
/* aget v2, v0, v1 */
/* iget v3, p1, Lcom/badlogic/gdx/math/Vector3;->x:F */
/* mul-float/2addr v2, v3 */
/* aput v2, v0, v1 */
v0 = this.val;
int v1 = 5; // const/4 v1, 0x5
/* aget v2, v0, v1 */
/* iget v3, p1, Lcom/badlogic/gdx/math/Vector3;->y:F */
/* mul-float/2addr v2, v3 */
/* aput v2, v0, v1 */
v0 = this.val;
/* const/16 v1, 0xa */
/* aget v2, v0, v1 */
/* iget v3, p1, Lcom/badlogic/gdx/math/Vector3;->z:F */
/* mul-float/2addr v2, v3 */
/* aput v2, v0, v1 */
return;
} // .end method
public com.badlogic.gdx.math.Matrix4 set ( com.badlogic.gdx.math.Matrix3 p0 ) {
/* .locals 7 */
int v6 = 3; // const/4 v6, 0x3
int v5 = 2; // const/4 v5, 0x2
int v3 = 1; // const/4 v3, 0x1
int v2 = 0; // const/4 v2, 0x0
int v4 = 0; // const/4 v4, 0x0
v0 = this.val;
v1 = this.vals;
/* aget v1, v1, v2 */
/* aput v1, v0, v2 */
v0 = this.val;
v1 = this.vals;
/* aget v1, v1, v3 */
/* aput v1, v0, v3 */
v0 = this.val;
v1 = this.vals;
/* aget v1, v1, v5 */
/* aput v1, v0, v5 */
v0 = this.val;
/* aput v4, v0, v6 */
v0 = this.val;
int v1 = 4; // const/4 v1, 0x4
v2 = this.vals;
/* aget v2, v2, v6 */
/* aput v2, v0, v1 */
v0 = this.val;
int v1 = 5; // const/4 v1, 0x5
v2 = this.vals;
int v3 = 4; // const/4 v3, 0x4
/* aget v2, v2, v3 */
/* aput v2, v0, v1 */
v0 = this.val;
int v1 = 6; // const/4 v1, 0x6
v2 = this.vals;
int v3 = 5; // const/4 v3, 0x5
/* aget v2, v2, v3 */
/* aput v2, v0, v1 */
v0 = this.val;
int v1 = 7; // const/4 v1, 0x7
/* aput v4, v0, v1 */
v0 = this.val;
/* const/16 v1, 0x8 */
/* aput v4, v0, v1 */
v0 = this.val;
/* const/16 v1, 0x9 */
/* aput v4, v0, v1 */
v0 = this.val;
/* const/16 v1, 0xa */
/* const/high16 v2, 0x3f800000 # 1.0f */
/* aput v2, v0, v1 */
v0 = this.val;
/* const/16 v1, 0xb */
/* aput v4, v0, v1 */
v0 = this.val;
/* const/16 v1, 0xc */
v2 = this.vals;
int v3 = 6; // const/4 v3, 0x6
/* aget v2, v2, v3 */
/* aput v2, v0, v1 */
v0 = this.val;
/* const/16 v1, 0xd */
v2 = this.vals;
int v3 = 7; // const/4 v3, 0x7
/* aget v2, v2, v3 */
/* aput v2, v0, v1 */
v0 = this.val;
/* const/16 v1, 0xe */
/* aput v4, v0, v1 */
v0 = this.val;
/* const/16 v1, 0xf */
v2 = this.vals;
/* const/16 v3, 0x8 */
/* aget v2, v2, v3 */
/* aput v2, v0, v1 */
} // .end method
public com.badlogic.gdx.math.Matrix4 set ( com.badlogic.gdx.math.Matrix4 p0 ) {
/* .locals 1 */
v0 = this.val;
(( com.badlogic.gdx.math.Matrix4 ) p0 ).set ( v0 ); // invoke-virtual {p0, v0}, Lcom/badlogic/gdx/math/Matrix4;->set([F)Lcom/badlogic/gdx/math/Matrix4;
} // .end method
public com.badlogic.gdx.math.Matrix4 set ( com.badlogic.gdx.math.Quaternion p0 ) {
/* .locals 14 */
/* iget v0, p1, Lcom/badlogic/gdx/math/Quaternion;->x:F */
/* iget v1, p1, Lcom/badlogic/gdx/math/Quaternion;->x:F */
/* mul-float/2addr v0, v1 */
/* iget v1, p1, Lcom/badlogic/gdx/math/Quaternion;->x:F */
/* iget v2, p1, Lcom/badlogic/gdx/math/Quaternion;->y:F */
/* mul-float/2addr v1, v2 */
/* iget v2, p1, Lcom/badlogic/gdx/math/Quaternion;->x:F */
/* iget v3, p1, Lcom/badlogic/gdx/math/Quaternion;->z:F */
/* mul-float/2addr v2, v3 */
/* iget v3, p1, Lcom/badlogic/gdx/math/Quaternion;->x:F */
/* iget v4, p1, Lcom/badlogic/gdx/math/Quaternion;->w:F */
/* mul-float/2addr v3, v4 */
/* iget v4, p1, Lcom/badlogic/gdx/math/Quaternion;->y:F */
/* iget v5, p1, Lcom/badlogic/gdx/math/Quaternion;->y:F */
/* mul-float/2addr v4, v5 */
/* iget v5, p1, Lcom/badlogic/gdx/math/Quaternion;->y:F */
/* iget v6, p1, Lcom/badlogic/gdx/math/Quaternion;->z:F */
/* mul-float/2addr v5, v6 */
/* iget v6, p1, Lcom/badlogic/gdx/math/Quaternion;->y:F */
/* iget v7, p1, Lcom/badlogic/gdx/math/Quaternion;->w:F */
/* mul-float/2addr v6, v7 */
/* iget v7, p1, Lcom/badlogic/gdx/math/Quaternion;->z:F */
/* iget v8, p1, Lcom/badlogic/gdx/math/Quaternion;->z:F */
/* mul-float/2addr v7, v8 */
/* iget v8, p1, Lcom/badlogic/gdx/math/Quaternion;->z:F */
/* iget v9, p1, Lcom/badlogic/gdx/math/Quaternion;->w:F */
/* mul-float/2addr v8, v9 */
v9 = this.val;
int v10 = 0; // const/4 v10, 0x0
/* const/high16 v11, 0x3f800000 # 1.0f */
/* const/high16 v12, 0x40000000 # 2.0f */
/* add-float v13, v4, v7 */
/* mul-float/2addr v12, v13 */
/* sub-float/2addr v11, v12 */
/* aput v11, v9, v10 */
v9 = this.val;
int v10 = 4; // const/4 v10, 0x4
/* const/high16 v11, 0x40000000 # 2.0f */
/* sub-float v12, v1, v8 */
/* mul-float/2addr v11, v12 */
/* aput v11, v9, v10 */
v9 = this.val;
/* const/16 v10, 0x8 */
/* const/high16 v11, 0x40000000 # 2.0f */
/* add-float v12, v2, v6 */
/* mul-float/2addr v11, v12 */
/* aput v11, v9, v10 */
v9 = this.val;
/* const/16 v10, 0xc */
int v11 = 0; // const/4 v11, 0x0
/* aput v11, v9, v10 */
v9 = this.val;
int v10 = 1; // const/4 v10, 0x1
/* const/high16 v11, 0x40000000 # 2.0f */
/* add-float/2addr v1, v8 */
/* mul-float/2addr v1, v11 */
/* aput v1, v9, v10 */
v1 = this.val;
int v8 = 5; // const/4 v8, 0x5
/* const/high16 v9, 0x3f800000 # 1.0f */
/* const/high16 v10, 0x40000000 # 2.0f */
/* add-float/2addr v7, v0 */
/* mul-float/2addr v7, v10 */
/* sub-float v7, v9, v7 */
/* aput v7, v1, v8 */
v1 = this.val;
/* const/16 v7, 0x9 */
/* const/high16 v8, 0x40000000 # 2.0f */
/* sub-float v9, v5, v3 */
/* mul-float/2addr v8, v9 */
/* aput v8, v1, v7 */
v1 = this.val;
/* const/16 v7, 0xd */
int v8 = 0; // const/4 v8, 0x0
/* aput v8, v1, v7 */
v1 = this.val;
int v7 = 2; // const/4 v7, 0x2
/* const/high16 v8, 0x40000000 # 2.0f */
/* sub-float/2addr v2, v6 */
/* mul-float/2addr v2, v8 */
/* aput v2, v1, v7 */
v1 = this.val;
int v2 = 6; // const/4 v2, 0x6
/* const/high16 v6, 0x40000000 # 2.0f */
/* add-float/2addr v3, v5 */
/* mul-float/2addr v3, v6 */
/* aput v3, v1, v2 */
v1 = this.val;
/* const/16 v2, 0xa */
/* const/high16 v3, 0x3f800000 # 1.0f */
/* const/high16 v5, 0x40000000 # 2.0f */
/* add-float/2addr v0, v4 */
/* mul-float/2addr v0, v5 */
/* sub-float v0, v3, v0 */
/* aput v0, v1, v2 */
v0 = this.val;
/* const/16 v1, 0xe */
int v2 = 0; // const/4 v2, 0x0
/* aput v2, v0, v1 */
v0 = this.val;
int v1 = 3; // const/4 v1, 0x3
int v2 = 0; // const/4 v2, 0x0
/* aput v2, v0, v1 */
v0 = this.val;
int v1 = 7; // const/4 v1, 0x7
int v2 = 0; // const/4 v2, 0x0
/* aput v2, v0, v1 */
v0 = this.val;
/* const/16 v1, 0xb */
int v2 = 0; // const/4 v2, 0x0
/* aput v2, v0, v1 */
v0 = this.val;
/* const/16 v1, 0xf */
/* const/high16 v2, 0x3f800000 # 1.0f */
/* aput v2, v0, v1 */
} // .end method
public com.badlogic.gdx.math.Matrix4 set ( Float[] p0 ) {
/* .locals 7 */
int v6 = 4; // const/4 v6, 0x4
int v5 = 3; // const/4 v5, 0x3
int v4 = 2; // const/4 v4, 0x2
int v3 = 1; // const/4 v3, 0x1
int v2 = 0; // const/4 v2, 0x0
v0 = this.val;
/* aget v1, p1, v2 */
/* aput v1, v0, v2 */
v0 = this.val;
/* aget v1, p1, v3 */
/* aput v1, v0, v3 */
v0 = this.val;
/* aget v1, p1, v4 */
/* aput v1, v0, v4 */
v0 = this.val;
/* aget v1, p1, v5 */
/* aput v1, v0, v5 */
v0 = this.val;
/* aget v1, p1, v6 */
/* aput v1, v0, v6 */
v0 = this.val;
int v1 = 5; // const/4 v1, 0x5
int v2 = 5; // const/4 v2, 0x5
/* aget v2, p1, v2 */
/* aput v2, v0, v1 */
v0 = this.val;
int v1 = 6; // const/4 v1, 0x6
int v2 = 6; // const/4 v2, 0x6
/* aget v2, p1, v2 */
/* aput v2, v0, v1 */
v0 = this.val;
int v1 = 7; // const/4 v1, 0x7
int v2 = 7; // const/4 v2, 0x7
/* aget v2, p1, v2 */
/* aput v2, v0, v1 */
v0 = this.val;
/* const/16 v1, 0x8 */
/* const/16 v2, 0x8 */
/* aget v2, p1, v2 */
/* aput v2, v0, v1 */
v0 = this.val;
/* const/16 v1, 0x9 */
/* const/16 v2, 0x9 */
/* aget v2, p1, v2 */
/* aput v2, v0, v1 */
v0 = this.val;
/* const/16 v1, 0xa */
/* const/16 v2, 0xa */
/* aget v2, p1, v2 */
/* aput v2, v0, v1 */
v0 = this.val;
/* const/16 v1, 0xb */
/* const/16 v2, 0xb */
/* aget v2, p1, v2 */
/* aput v2, v0, v1 */
v0 = this.val;
/* const/16 v1, 0xc */
/* const/16 v2, 0xc */
/* aget v2, p1, v2 */
/* aput v2, v0, v1 */
v0 = this.val;
/* const/16 v1, 0xd */
/* const/16 v2, 0xd */
/* aget v2, p1, v2 */
/* aput v2, v0, v1 */
v0 = this.val;
/* const/16 v1, 0xe */
/* const/16 v2, 0xe */
/* aget v2, p1, v2 */
/* aput v2, v0, v1 */
v0 = this.val;
/* const/16 v1, 0xf */
/* const/16 v2, 0xf */
/* aget v2, p1, v2 */
/* aput v2, v0, v1 */
} // .end method
public void set ( com.badlogic.gdx.math.Vector3 p0, com.badlogic.gdx.math.Vector3 p1, com.badlogic.gdx.math.Vector3 p2, com.badlogic.gdx.math.Vector3 p3 ) {
/* .locals 4 */
int v3 = 0; // const/4 v3, 0x0
v0 = this.val;
int v1 = 0; // const/4 v1, 0x0
/* iget v2, p1, Lcom/badlogic/gdx/math/Vector3;->x:F */
/* aput v2, v0, v1 */
v0 = this.val;
int v1 = 4; // const/4 v1, 0x4
/* iget v2, p1, Lcom/badlogic/gdx/math/Vector3;->y:F */
/* aput v2, v0, v1 */
v0 = this.val;
/* const/16 v1, 0x8 */
/* iget v2, p1, Lcom/badlogic/gdx/math/Vector3;->z:F */
/* aput v2, v0, v1 */
v0 = this.val;
int v1 = 1; // const/4 v1, 0x1
/* iget v2, p2, Lcom/badlogic/gdx/math/Vector3;->x:F */
/* aput v2, v0, v1 */
v0 = this.val;
int v1 = 5; // const/4 v1, 0x5
/* iget v2, p2, Lcom/badlogic/gdx/math/Vector3;->y:F */
/* aput v2, v0, v1 */
v0 = this.val;
/* const/16 v1, 0x9 */
/* iget v2, p2, Lcom/badlogic/gdx/math/Vector3;->z:F */
/* aput v2, v0, v1 */
v0 = this.val;
int v1 = 2; // const/4 v1, 0x2
/* iget v2, p3, Lcom/badlogic/gdx/math/Vector3;->x:F */
/* neg-float v2, v2 */
/* aput v2, v0, v1 */
v0 = this.val;
int v1 = 6; // const/4 v1, 0x6
/* iget v2, p3, Lcom/badlogic/gdx/math/Vector3;->y:F */
/* neg-float v2, v2 */
/* aput v2, v0, v1 */
v0 = this.val;
/* const/16 v1, 0xa */
/* iget v2, p3, Lcom/badlogic/gdx/math/Vector3;->z:F */
/* neg-float v2, v2 */
/* aput v2, v0, v1 */
v0 = this.val;
/* const/16 v1, 0xc */
/* iget v2, p4, Lcom/badlogic/gdx/math/Vector3;->x:F */
/* aput v2, v0, v1 */
v0 = this.val;
/* const/16 v1, 0xd */
/* iget v2, p4, Lcom/badlogic/gdx/math/Vector3;->y:F */
/* aput v2, v0, v1 */
v0 = this.val;
/* const/16 v1, 0xe */
/* iget v2, p4, Lcom/badlogic/gdx/math/Vector3;->z:F */
/* aput v2, v0, v1 */
v0 = this.val;
int v1 = 3; // const/4 v1, 0x3
/* aput v3, v0, v1 */
v0 = this.val;
int v1 = 7; // const/4 v1, 0x7
/* aput v3, v0, v1 */
v0 = this.val;
/* const/16 v1, 0xb */
/* aput v3, v0, v1 */
v0 = this.val;
/* const/16 v1, 0xf */
/* const/high16 v2, 0x3f800000 # 1.0f */
/* aput v2, v0, v1 */
return;
} // .end method
public com.badlogic.gdx.math.Matrix4 setFromEulerAngles ( Float p0, Float p1, Float p2 ) {
/* .locals 1 */
(( com.badlogic.gdx.math.Matrix4 ) p0 ).idt ( ); // invoke-virtual {p0}, Lcom/badlogic/gdx/math/Matrix4;->idt()Lcom/badlogic/gdx/math/Matrix4;
v0 = com.badlogic.gdx.math.Matrix4.quat;
(( com.badlogic.gdx.math.Quaternion ) v0 ).setEulerAngles ( p1, p2, p3 ); // invoke-virtual {v0, p1, p2, p3}, Lcom/badlogic/gdx/math/Quaternion;->setEulerAngles(FFF)Lcom/badlogic/gdx/math/Quaternion;
v0 = com.badlogic.gdx.math.Matrix4.quat;
(( com.badlogic.gdx.math.Matrix4 ) p0 ).set ( v0 ); // invoke-virtual {p0, v0}, Lcom/badlogic/gdx/math/Matrix4;->set(Lcom/badlogic/gdx/math/Quaternion;)Lcom/badlogic/gdx/math/Matrix4;
} // .end method
public com.badlogic.gdx.math.Matrix4 setToLookAt ( com.badlogic.gdx.math.Vector3 p0, com.badlogic.gdx.math.Vector3 p1 ) {
/* .locals 3 */
v0 = com.badlogic.gdx.math.Matrix4.l_vez;
(( com.badlogic.gdx.math.Vector3 ) v0 ).set ( p1 ); // invoke-virtual {v0, p1}, Lcom/badlogic/gdx/math/Vector3;->set(Lcom/badlogic/gdx/math/Vector3;)Lcom/badlogic/gdx/math/Vector3;
(( com.badlogic.gdx.math.Vector3 ) v0 ).nor ( ); // invoke-virtual {v0}, Lcom/badlogic/gdx/math/Vector3;->nor()Lcom/badlogic/gdx/math/Vector3;
v0 = com.badlogic.gdx.math.Matrix4.l_vex;
(( com.badlogic.gdx.math.Vector3 ) v0 ).set ( p1 ); // invoke-virtual {v0, p1}, Lcom/badlogic/gdx/math/Vector3;->set(Lcom/badlogic/gdx/math/Vector3;)Lcom/badlogic/gdx/math/Vector3;
(( com.badlogic.gdx.math.Vector3 ) v0 ).nor ( ); // invoke-virtual {v0}, Lcom/badlogic/gdx/math/Vector3;->nor()Lcom/badlogic/gdx/math/Vector3;
v0 = com.badlogic.gdx.math.Matrix4.l_vex;
(( com.badlogic.gdx.math.Vector3 ) v0 ).crs ( p2 ); // invoke-virtual {v0, p2}, Lcom/badlogic/gdx/math/Vector3;->crs(Lcom/badlogic/gdx/math/Vector3;)Lcom/badlogic/gdx/math/Vector3;
(( com.badlogic.gdx.math.Vector3 ) v0 ).nor ( ); // invoke-virtual {v0}, Lcom/badlogic/gdx/math/Vector3;->nor()Lcom/badlogic/gdx/math/Vector3;
v0 = com.badlogic.gdx.math.Matrix4.l_vey;
v1 = com.badlogic.gdx.math.Matrix4.l_vex;
(( com.badlogic.gdx.math.Vector3 ) v0 ).set ( v1 ); // invoke-virtual {v0, v1}, Lcom/badlogic/gdx/math/Vector3;->set(Lcom/badlogic/gdx/math/Vector3;)Lcom/badlogic/gdx/math/Vector3;
v1 = com.badlogic.gdx.math.Matrix4.l_vez;
(( com.badlogic.gdx.math.Vector3 ) v0 ).crs ( v1 ); // invoke-virtual {v0, v1}, Lcom/badlogic/gdx/math/Vector3;->crs(Lcom/badlogic/gdx/math/Vector3;)Lcom/badlogic/gdx/math/Vector3;
(( com.badlogic.gdx.math.Vector3 ) v0 ).nor ( ); // invoke-virtual {v0}, Lcom/badlogic/gdx/math/Vector3;->nor()Lcom/badlogic/gdx/math/Vector3;
(( com.badlogic.gdx.math.Matrix4 ) p0 ).idt ( ); // invoke-virtual {p0}, Lcom/badlogic/gdx/math/Matrix4;->idt()Lcom/badlogic/gdx/math/Matrix4;
v0 = this.val;
int v1 = 0; // const/4 v1, 0x0
v2 = com.badlogic.gdx.math.Matrix4.l_vex;
/* iget v2, v2, Lcom/badlogic/gdx/math/Vector3;->x:F */
/* aput v2, v0, v1 */
v0 = this.val;
int v1 = 4; // const/4 v1, 0x4
v2 = com.badlogic.gdx.math.Matrix4.l_vex;
/* iget v2, v2, Lcom/badlogic/gdx/math/Vector3;->y:F */
/* aput v2, v0, v1 */
v0 = this.val;
/* const/16 v1, 0x8 */
v2 = com.badlogic.gdx.math.Matrix4.l_vex;
/* iget v2, v2, Lcom/badlogic/gdx/math/Vector3;->z:F */
/* aput v2, v0, v1 */
v0 = this.val;
int v1 = 1; // const/4 v1, 0x1
v2 = com.badlogic.gdx.math.Matrix4.l_vey;
/* iget v2, v2, Lcom/badlogic/gdx/math/Vector3;->x:F */
/* aput v2, v0, v1 */
v0 = this.val;
int v1 = 5; // const/4 v1, 0x5
v2 = com.badlogic.gdx.math.Matrix4.l_vey;
/* iget v2, v2, Lcom/badlogic/gdx/math/Vector3;->y:F */
/* aput v2, v0, v1 */
v0 = this.val;
/* const/16 v1, 0x9 */
v2 = com.badlogic.gdx.math.Matrix4.l_vey;
/* iget v2, v2, Lcom/badlogic/gdx/math/Vector3;->z:F */
/* aput v2, v0, v1 */
v0 = this.val;
int v1 = 2; // const/4 v1, 0x2
v2 = com.badlogic.gdx.math.Matrix4.l_vez;
/* iget v2, v2, Lcom/badlogic/gdx/math/Vector3;->x:F */
/* neg-float v2, v2 */
/* aput v2, v0, v1 */
v0 = this.val;
int v1 = 6; // const/4 v1, 0x6
v2 = com.badlogic.gdx.math.Matrix4.l_vez;
/* iget v2, v2, Lcom/badlogic/gdx/math/Vector3;->y:F */
/* neg-float v2, v2 */
/* aput v2, v0, v1 */
v0 = this.val;
/* const/16 v1, 0xa */
v2 = com.badlogic.gdx.math.Matrix4.l_vez;
/* iget v2, v2, Lcom/badlogic/gdx/math/Vector3;->z:F */
/* neg-float v2, v2 */
/* aput v2, v0, v1 */
} // .end method
public com.badlogic.gdx.math.Matrix4 setToLookAt ( com.badlogic.gdx.math.Vector3 p0, com.badlogic.gdx.math.Vector3 p1, com.badlogic.gdx.math.Vector3 p2 ) {
/* .locals 3 */
v0 = com.badlogic.gdx.math.Matrix4.tmpVec;
(( com.badlogic.gdx.math.Vector3 ) v0 ).set ( p2 ); // invoke-virtual {v0, p2}, Lcom/badlogic/gdx/math/Vector3;->set(Lcom/badlogic/gdx/math/Vector3;)Lcom/badlogic/gdx/math/Vector3;
(( com.badlogic.gdx.math.Vector3 ) v0 ).sub ( p1 ); // invoke-virtual {v0, p1}, Lcom/badlogic/gdx/math/Vector3;->sub(Lcom/badlogic/gdx/math/Vector3;)Lcom/badlogic/gdx/math/Vector3;
v0 = com.badlogic.gdx.math.Matrix4.tmpVec;
(( com.badlogic.gdx.math.Matrix4 ) p0 ).setToLookAt ( v0, p3 ); // invoke-virtual {p0, v0, p3}, Lcom/badlogic/gdx/math/Matrix4;->setToLookAt(Lcom/badlogic/gdx/math/Vector3;Lcom/badlogic/gdx/math/Vector3;)Lcom/badlogic/gdx/math/Matrix4;
v0 = com.badlogic.gdx.math.Matrix4.tmpMat;
(( com.badlogic.gdx.math.Vector3 ) p1 ).tmp ( ); // invoke-virtual {p1}, Lcom/badlogic/gdx/math/Vector3;->tmp()Lcom/badlogic/gdx/math/Vector3;
/* const/high16 v2, -0x40800000 # -1.0f */
(( com.badlogic.gdx.math.Vector3 ) v1 ).mul ( v2 ); // invoke-virtual {v1, v2}, Lcom/badlogic/gdx/math/Vector3;->mul(F)Lcom/badlogic/gdx/math/Vector3;
(( com.badlogic.gdx.math.Matrix4 ) v0 ).setToTranslation ( v1 ); // invoke-virtual {v0, v1}, Lcom/badlogic/gdx/math/Matrix4;->setToTranslation(Lcom/badlogic/gdx/math/Vector3;)Lcom/badlogic/gdx/math/Matrix4;
(( com.badlogic.gdx.math.Matrix4 ) p0 ).mul ( v0 ); // invoke-virtual {p0, v0}, Lcom/badlogic/gdx/math/Matrix4;->mul(Lcom/badlogic/gdx/math/Matrix4;)Lcom/badlogic/gdx/math/Matrix4;
} // .end method
public com.badlogic.gdx.math.Matrix4 setToOrtho ( Float p0, Float p1, Float p2, Float p3, Float p4, Float p5 ) {
/* .locals 9 */
/* const/high16 v2, 0x40000000 # 2.0f */
int v8 = 0; // const/4 v8, 0x0
(( com.badlogic.gdx.math.Matrix4 ) p0 ).idt ( ); // invoke-virtual {p0}, Lcom/badlogic/gdx/math/Matrix4;->idt()Lcom/badlogic/gdx/math/Matrix4;
/* sub-float v0, p2, p1 */
/* div-float v0, v2, v0 */
/* sub-float v1, p4, p3 */
/* div-float v1, v2, v1 */
/* const/high16 v2, -0x40000000 # -2.0f */
/* sub-float v3, p6, p5 */
/* div-float/2addr v2, v3 */
/* add-float v3, p2, p1 */
/* neg-float v3, v3 */
/* sub-float v4, p2, p1 */
/* div-float/2addr v3, v4 */
/* add-float v4, p4, p3 */
/* neg-float v4, v4 */
/* sub-float v5, p4, p3 */
/* div-float/2addr v4, v5 */
/* add-float v5, p6, p5 */
/* neg-float v5, v5 */
/* sub-float v6, p6, p5 */
/* div-float/2addr v5, v6 */
v6 = this.val;
int v7 = 0; // const/4 v7, 0x0
/* aput v0, v6, v7 */
v0 = this.val;
int v6 = 1; // const/4 v6, 0x1
/* aput v8, v0, v6 */
v0 = this.val;
int v6 = 2; // const/4 v6, 0x2
/* aput v8, v0, v6 */
v0 = this.val;
int v6 = 3; // const/4 v6, 0x3
/* aput v8, v0, v6 */
v0 = this.val;
int v6 = 4; // const/4 v6, 0x4
/* aput v8, v0, v6 */
v0 = this.val;
int v6 = 5; // const/4 v6, 0x5
/* aput v1, v0, v6 */
v0 = this.val;
int v1 = 6; // const/4 v1, 0x6
/* aput v8, v0, v1 */
v0 = this.val;
int v1 = 7; // const/4 v1, 0x7
/* aput v8, v0, v1 */
v0 = this.val;
/* const/16 v1, 0x8 */
/* aput v8, v0, v1 */
v0 = this.val;
/* const/16 v1, 0x9 */
/* aput v8, v0, v1 */
v0 = this.val;
/* const/16 v1, 0xa */
/* aput v2, v0, v1 */
v0 = this.val;
/* const/16 v1, 0xb */
/* aput v8, v0, v1 */
v0 = this.val;
/* const/16 v1, 0xc */
/* aput v3, v0, v1 */
v0 = this.val;
/* const/16 v1, 0xd */
/* aput v4, v0, v1 */
v0 = this.val;
/* const/16 v1, 0xe */
/* aput v5, v0, v1 */
v0 = this.val;
/* const/16 v1, 0xf */
/* const/high16 v2, 0x3f800000 # 1.0f */
/* aput v2, v0, v1 */
} // .end method
public com.badlogic.gdx.math.Matrix4 setToOrtho2D ( Float p0, Float p1, Float p2, Float p3 ) {
/* .locals 7 */
/* add-float v2, p1, p3 */
/* add-float v4, p2, p4 */
int v5 = 0; // const/4 v5, 0x0
/* const/high16 v6, 0x3f800000 # 1.0f */
/* move-object v0, p0 */
/* move v1, p1 */
/* move v3, p2 */
/* invoke-virtual/range {v0 ..v6}, Lcom/badlogic/gdx/math/Matrix4;->setToOrtho(FFFFFF)Lcom/badlogic/gdx/math/Matrix4; */
} // .end method
public com.badlogic.gdx.math.Matrix4 setToOrtho2D ( Float p0, Float p1, Float p2, Float p3, Float p4, Float p5 ) {
/* .locals 7 */
/* add-float v2, p1, p3 */
/* add-float v4, p2, p4 */
/* move-object v0, p0 */
/* move v1, p1 */
/* move v3, p2 */
/* move v5, p5 */
/* move v6, p6 */
/* invoke-virtual/range {v0 ..v6}, Lcom/badlogic/gdx/math/Matrix4;->setToOrtho(FFFFFF)Lcom/badlogic/gdx/math/Matrix4; */
} // .end method
public com.badlogic.gdx.math.Matrix4 setToProjection ( Float p0, Float p1, Float p2, Float p3 ) {
/* .locals 7 */
int v6 = 0; // const/4 v6, 0x0
(( com.badlogic.gdx.math.Matrix4 ) p0 ).idt ( ); // invoke-virtual {p0}, Lcom/badlogic/gdx/math/Matrix4;->idt()Lcom/badlogic/gdx/math/Matrix4;
/* const-wide/high16 v0, 0x3ff0000000000000L # 1.0 */
/* float-to-double v2, p3 */
/* const-wide v4, 0x3f91df46a2529d39L # 0.017453292519943295 */
/* mul-double/2addr v2, v4 */
/* const-wide/high16 v4, 0x4000000000000000L # 2.0 */
/* div-double/2addr v2, v4 */
java.lang.Math .tan ( v2,v3 );
/* move-result-wide v2 */
/* div-double/2addr v0, v2 */
/* double-to-float v0, v0 */
/* add-float v1, p2, p1 */
/* sub-float v2, p1, p2 */
/* div-float/2addr v1, v2 */
/* const/high16 v2, 0x40000000 # 2.0f */
/* mul-float/2addr v2, p2 */
/* mul-float/2addr v2, p1 */
/* sub-float v3, p1, p2 */
/* div-float/2addr v2, v3 */
v3 = this.val;
int v4 = 0; // const/4 v4, 0x0
/* div-float v5, v0, p4 */
/* aput v5, v3, v4 */
v3 = this.val;
int v4 = 1; // const/4 v4, 0x1
/* aput v6, v3, v4 */
v3 = this.val;
int v4 = 2; // const/4 v4, 0x2
/* aput v6, v3, v4 */
v3 = this.val;
int v4 = 3; // const/4 v4, 0x3
/* aput v6, v3, v4 */
v3 = this.val;
int v4 = 4; // const/4 v4, 0x4
/* aput v6, v3, v4 */
v3 = this.val;
int v4 = 5; // const/4 v4, 0x5
/* aput v0, v3, v4 */
v0 = this.val;
int v3 = 6; // const/4 v3, 0x6
/* aput v6, v0, v3 */
v0 = this.val;
int v3 = 7; // const/4 v3, 0x7
/* aput v6, v0, v3 */
v0 = this.val;
/* const/16 v3, 0x8 */
/* aput v6, v0, v3 */
v0 = this.val;
/* const/16 v3, 0x9 */
/* aput v6, v0, v3 */
v0 = this.val;
/* const/16 v3, 0xa */
/* aput v1, v0, v3 */
v0 = this.val;
/* const/16 v1, 0xb */
/* const/high16 v3, -0x40800000 # -1.0f */
/* aput v3, v0, v1 */
v0 = this.val;
/* const/16 v1, 0xc */
/* aput v6, v0, v1 */
v0 = this.val;
/* const/16 v1, 0xd */
/* aput v6, v0, v1 */
v0 = this.val;
/* const/16 v1, 0xe */
/* aput v2, v0, v1 */
v0 = this.val;
/* const/16 v1, 0xf */
/* aput v6, v0, v1 */
} // .end method
public com.badlogic.gdx.math.Matrix4 setToRotation ( Float p0, Float p1, Float p2, Float p3 ) {
/* .locals 2 */
(( com.badlogic.gdx.math.Matrix4 ) p0 ).idt ( ); // invoke-virtual {p0}, Lcom/badlogic/gdx/math/Matrix4;->idt()Lcom/badlogic/gdx/math/Matrix4;
int v0 = 0; // const/4 v0, 0x0
/* cmpl-float v0, p4, v0 */
/* if-nez v0, :cond_0 */
/* move-object v0, p0 */
} // :goto_0
} // :cond_0
v0 = com.badlogic.gdx.math.Matrix4.quat;
v1 = com.badlogic.gdx.math.Matrix4.tmpV;
(( com.badlogic.gdx.math.Vector3 ) v1 ).set ( p1, p2, p3 ); // invoke-virtual {v1, p1, p2, p3}, Lcom/badlogic/gdx/math/Vector3;->set(FFF)Lcom/badlogic/gdx/math/Vector3;
(( com.badlogic.gdx.math.Quaternion ) v0 ).set ( v1, p4 ); // invoke-virtual {v0, v1, p4}, Lcom/badlogic/gdx/math/Quaternion;->set(Lcom/badlogic/gdx/math/Vector3;F)Lcom/badlogic/gdx/math/Quaternion;
(( com.badlogic.gdx.math.Matrix4 ) p0 ).set ( v0 ); // invoke-virtual {p0, v0}, Lcom/badlogic/gdx/math/Matrix4;->set(Lcom/badlogic/gdx/math/Quaternion;)Lcom/badlogic/gdx/math/Matrix4;
} // .end method
public com.badlogic.gdx.math.Matrix4 setToRotation ( com.badlogic.gdx.math.Vector3 p0, Float p1 ) {
/* .locals 1 */
(( com.badlogic.gdx.math.Matrix4 ) p0 ).idt ( ); // invoke-virtual {p0}, Lcom/badlogic/gdx/math/Matrix4;->idt()Lcom/badlogic/gdx/math/Matrix4;
int v0 = 0; // const/4 v0, 0x0
/* cmpl-float v0, p2, v0 */
/* if-nez v0, :cond_0 */
/* move-object v0, p0 */
} // :goto_0
} // :cond_0
v0 = com.badlogic.gdx.math.Matrix4.quat;
(( com.badlogic.gdx.math.Quaternion ) v0 ).set ( p1, p2 ); // invoke-virtual {v0, p1, p2}, Lcom/badlogic/gdx/math/Quaternion;->set(Lcom/badlogic/gdx/math/Vector3;F)Lcom/badlogic/gdx/math/Quaternion;
(( com.badlogic.gdx.math.Matrix4 ) p0 ).set ( v0 ); // invoke-virtual {p0, v0}, Lcom/badlogic/gdx/math/Matrix4;->set(Lcom/badlogic/gdx/math/Quaternion;)Lcom/badlogic/gdx/math/Matrix4;
} // .end method
public com.badlogic.gdx.math.Matrix4 setToScaling ( Float p0, Float p1, Float p2 ) {
/* .locals 2 */
(( com.badlogic.gdx.math.Matrix4 ) p0 ).idt ( ); // invoke-virtual {p0}, Lcom/badlogic/gdx/math/Matrix4;->idt()Lcom/badlogic/gdx/math/Matrix4;
v0 = this.val;
int v1 = 0; // const/4 v1, 0x0
/* aput p1, v0, v1 */
v0 = this.val;
int v1 = 5; // const/4 v1, 0x5
/* aput p2, v0, v1 */
v0 = this.val;
/* const/16 v1, 0xa */
/* aput p3, v0, v1 */
} // .end method
public com.badlogic.gdx.math.Matrix4 setToScaling ( com.badlogic.gdx.math.Vector3 p0 ) {
/* .locals 3 */
(( com.badlogic.gdx.math.Matrix4 ) p0 ).idt ( ); // invoke-virtual {p0}, Lcom/badlogic/gdx/math/Matrix4;->idt()Lcom/badlogic/gdx/math/Matrix4;
v0 = this.val;
int v1 = 0; // const/4 v1, 0x0
/* iget v2, p1, Lcom/badlogic/gdx/math/Vector3;->x:F */
/* aput v2, v0, v1 */
v0 = this.val;
int v1 = 5; // const/4 v1, 0x5
/* iget v2, p1, Lcom/badlogic/gdx/math/Vector3;->y:F */
/* aput v2, v0, v1 */
v0 = this.val;
/* const/16 v1, 0xa */
/* iget v2, p1, Lcom/badlogic/gdx/math/Vector3;->z:F */
/* aput v2, v0, v1 */
} // .end method
public com.badlogic.gdx.math.Matrix4 setToTranslation ( Float p0, Float p1, Float p2 ) {
/* .locals 2 */
(( com.badlogic.gdx.math.Matrix4 ) p0 ).idt ( ); // invoke-virtual {p0}, Lcom/badlogic/gdx/math/Matrix4;->idt()Lcom/badlogic/gdx/math/Matrix4;
v0 = this.val;
/* const/16 v1, 0xc */
/* aput p1, v0, v1 */
v0 = this.val;
/* const/16 v1, 0xd */
/* aput p2, v0, v1 */
v0 = this.val;
/* const/16 v1, 0xe */
/* aput p3, v0, v1 */
} // .end method
public com.badlogic.gdx.math.Matrix4 setToTranslation ( com.badlogic.gdx.math.Vector3 p0 ) {
/* .locals 3 */
(( com.badlogic.gdx.math.Matrix4 ) p0 ).idt ( ); // invoke-virtual {p0}, Lcom/badlogic/gdx/math/Matrix4;->idt()Lcom/badlogic/gdx/math/Matrix4;
v0 = this.val;
/* const/16 v1, 0xc */
/* iget v2, p1, Lcom/badlogic/gdx/math/Vector3;->x:F */
/* aput v2, v0, v1 */
v0 = this.val;
/* const/16 v1, 0xd */
/* iget v2, p1, Lcom/badlogic/gdx/math/Vector3;->y:F */
/* aput v2, v0, v1 */
v0 = this.val;
/* const/16 v1, 0xe */
/* iget v2, p1, Lcom/badlogic/gdx/math/Vector3;->z:F */
/* aput v2, v0, v1 */
} // .end method
public com.badlogic.gdx.math.Matrix4 setToTranslationAndScaling ( Float p0, Float p1, Float p2, Float p3, Float p4, Float p5 ) {
/* .locals 2 */
(( com.badlogic.gdx.math.Matrix4 ) p0 ).idt ( ); // invoke-virtual {p0}, Lcom/badlogic/gdx/math/Matrix4;->idt()Lcom/badlogic/gdx/math/Matrix4;
v0 = this.val;
/* const/16 v1, 0xc */
/* aput p1, v0, v1 */
v0 = this.val;
/* const/16 v1, 0xd */
/* aput p2, v0, v1 */
v0 = this.val;
/* const/16 v1, 0xe */
/* aput p3, v0, v1 */
v0 = this.val;
int v1 = 0; // const/4 v1, 0x0
/* aput p4, v0, v1 */
v0 = this.val;
int v1 = 5; // const/4 v1, 0x5
/* aput p5, v0, v1 */
v0 = this.val;
/* const/16 v1, 0xa */
/* aput p6, v0, v1 */
} // .end method
public com.badlogic.gdx.math.Matrix4 setToTranslationAndScaling ( com.badlogic.gdx.math.Vector3 p0, com.badlogic.gdx.math.Vector3 p1 ) {
/* .locals 3 */
(( com.badlogic.gdx.math.Matrix4 ) p0 ).idt ( ); // invoke-virtual {p0}, Lcom/badlogic/gdx/math/Matrix4;->idt()Lcom/badlogic/gdx/math/Matrix4;
v0 = this.val;
/* const/16 v1, 0xc */
/* iget v2, p1, Lcom/badlogic/gdx/math/Vector3;->x:F */
/* aput v2, v0, v1 */
v0 = this.val;
/* const/16 v1, 0xd */
/* iget v2, p1, Lcom/badlogic/gdx/math/Vector3;->y:F */
/* aput v2, v0, v1 */
v0 = this.val;
/* const/16 v1, 0xe */
/* iget v2, p1, Lcom/badlogic/gdx/math/Vector3;->z:F */
/* aput v2, v0, v1 */
v0 = this.val;
int v1 = 0; // const/4 v1, 0x0
/* iget v2, p2, Lcom/badlogic/gdx/math/Vector3;->x:F */
/* aput v2, v0, v1 */
v0 = this.val;
int v1 = 5; // const/4 v1, 0x5
/* iget v2, p2, Lcom/badlogic/gdx/math/Vector3;->y:F */
/* aput v2, v0, v1 */
v0 = this.val;
/* const/16 v1, 0xa */
/* iget v2, p2, Lcom/badlogic/gdx/math/Vector3;->z:F */
/* aput v2, v0, v1 */
} // .end method
public com.badlogic.gdx.math.Matrix4 setToWorld ( com.badlogic.gdx.math.Vector3 p0, com.badlogic.gdx.math.Vector3 p1, com.badlogic.gdx.math.Vector3 p2 ) {
/* .locals 3 */
v0 = com.badlogic.gdx.math.Matrix4.tmpForward;
(( com.badlogic.gdx.math.Vector3 ) v0 ).set ( p2 ); // invoke-virtual {v0, p2}, Lcom/badlogic/gdx/math/Vector3;->set(Lcom/badlogic/gdx/math/Vector3;)Lcom/badlogic/gdx/math/Vector3;
(( com.badlogic.gdx.math.Vector3 ) v0 ).nor ( ); // invoke-virtual {v0}, Lcom/badlogic/gdx/math/Vector3;->nor()Lcom/badlogic/gdx/math/Vector3;
v0 = com.badlogic.gdx.math.Matrix4.right;
v1 = com.badlogic.gdx.math.Matrix4.tmpForward;
(( com.badlogic.gdx.math.Vector3 ) v0 ).set ( v1 ); // invoke-virtual {v0, v1}, Lcom/badlogic/gdx/math/Vector3;->set(Lcom/badlogic/gdx/math/Vector3;)Lcom/badlogic/gdx/math/Vector3;
(( com.badlogic.gdx.math.Vector3 ) v0 ).crs ( p3 ); // invoke-virtual {v0, p3}, Lcom/badlogic/gdx/math/Vector3;->crs(Lcom/badlogic/gdx/math/Vector3;)Lcom/badlogic/gdx/math/Vector3;
(( com.badlogic.gdx.math.Vector3 ) v0 ).nor ( ); // invoke-virtual {v0}, Lcom/badlogic/gdx/math/Vector3;->nor()Lcom/badlogic/gdx/math/Vector3;
v0 = com.badlogic.gdx.math.Matrix4.tmpUp;
v1 = com.badlogic.gdx.math.Matrix4.right;
(( com.badlogic.gdx.math.Vector3 ) v0 ).set ( v1 ); // invoke-virtual {v0, v1}, Lcom/badlogic/gdx/math/Vector3;->set(Lcom/badlogic/gdx/math/Vector3;)Lcom/badlogic/gdx/math/Vector3;
v1 = com.badlogic.gdx.math.Matrix4.tmpForward;
(( com.badlogic.gdx.math.Vector3 ) v0 ).crs ( v1 ); // invoke-virtual {v0, v1}, Lcom/badlogic/gdx/math/Vector3;->crs(Lcom/badlogic/gdx/math/Vector3;)Lcom/badlogic/gdx/math/Vector3;
(( com.badlogic.gdx.math.Vector3 ) v0 ).nor ( ); // invoke-virtual {v0}, Lcom/badlogic/gdx/math/Vector3;->nor()Lcom/badlogic/gdx/math/Vector3;
v0 = com.badlogic.gdx.math.Matrix4.right;
v1 = com.badlogic.gdx.math.Matrix4.tmpUp;
v2 = com.badlogic.gdx.math.Matrix4.tmpForward;
(( com.badlogic.gdx.math.Matrix4 ) p0 ).set ( v0, v1, v2, p1 ); // invoke-virtual {p0, v0, v1, v2, p1}, Lcom/badlogic/gdx/math/Matrix4;->set(Lcom/badlogic/gdx/math/Vector3;Lcom/badlogic/gdx/math/Vector3;Lcom/badlogic/gdx/math/Vector3;Lcom/badlogic/gdx/math/Vector3;)V
} // .end method
public com.badlogic.gdx.math.Matrix4 toNormalMatrix ( ) {
/* .locals 3 */
int v2 = 0; // const/4 v2, 0x0
v0 = this.val;
/* const/16 v1, 0xc */
/* aput v2, v0, v1 */
v0 = this.val;
/* const/16 v1, 0xd */
/* aput v2, v0, v1 */
v0 = this.val;
/* const/16 v1, 0xe */
/* aput v2, v0, v1 */
(( com.badlogic.gdx.math.Matrix4 ) p0 ).inv ( ); // invoke-virtual {p0}, Lcom/badlogic/gdx/math/Matrix4;->inv()Lcom/badlogic/gdx/math/Matrix4;
(( com.badlogic.gdx.math.Matrix4 ) p0 ).tra ( ); // invoke-virtual {p0}, Lcom/badlogic/gdx/math/Matrix4;->tra()Lcom/badlogic/gdx/math/Matrix4;
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
v1 = this.val;
int v2 = 0; // const/4 v2, 0x0
/* aget v1, v1, v2 */
(( java.lang.StringBuilder ) v0 ).append ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;
final String v1 = "|"; // const-string v1, "|"
(( java.lang.StringBuilder ) v0 ).append ( v3 ); // invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
v1 = this.val;
int v2 = 4; // const/4 v2, 0x4
/* aget v1, v1, v2 */
(( java.lang.StringBuilder ) v0 ).append ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;
final String v1 = "|"; // const-string v1, "|"
(( java.lang.StringBuilder ) v0 ).append ( v3 ); // invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
v1 = this.val;
/* const/16 v2, 0x8 */
/* aget v1, v1, v2 */
(( java.lang.StringBuilder ) v0 ).append ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;
final String v1 = "|"; // const-string v1, "|"
(( java.lang.StringBuilder ) v0 ).append ( v3 ); // invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
v1 = this.val;
/* const/16 v2, 0xc */
/* aget v1, v1, v2 */
(( java.lang.StringBuilder ) v0 ).append ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;
final String v1 = "]\n"; // const-string v1, "]\n"
(( java.lang.StringBuilder ) v0 ).append ( v5 ); // invoke-virtual {v0, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
final String v1 = "["; // const-string v1, "["
(( java.lang.StringBuilder ) v0 ).append ( v4 ); // invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
v1 = this.val;
int v2 = 1; // const/4 v2, 0x1
/* aget v1, v1, v2 */
(( java.lang.StringBuilder ) v0 ).append ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;
final String v1 = "|"; // const-string v1, "|"
(( java.lang.StringBuilder ) v0 ).append ( v3 ); // invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
v1 = this.val;
int v2 = 5; // const/4 v2, 0x5
/* aget v1, v1, v2 */
(( java.lang.StringBuilder ) v0 ).append ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;
final String v1 = "|"; // const-string v1, "|"
(( java.lang.StringBuilder ) v0 ).append ( v3 ); // invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
v1 = this.val;
/* const/16 v2, 0x9 */
/* aget v1, v1, v2 */
(( java.lang.StringBuilder ) v0 ).append ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;
final String v1 = "|"; // const-string v1, "|"
(( java.lang.StringBuilder ) v0 ).append ( v3 ); // invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
v1 = this.val;
/* const/16 v2, 0xd */
/* aget v1, v1, v2 */
(( java.lang.StringBuilder ) v0 ).append ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;
final String v1 = "]\n"; // const-string v1, "]\n"
(( java.lang.StringBuilder ) v0 ).append ( v5 ); // invoke-virtual {v0, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
final String v1 = "["; // const-string v1, "["
(( java.lang.StringBuilder ) v0 ).append ( v4 ); // invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
v1 = this.val;
int v2 = 2; // const/4 v2, 0x2
/* aget v1, v1, v2 */
(( java.lang.StringBuilder ) v0 ).append ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;
final String v1 = "|"; // const-string v1, "|"
(( java.lang.StringBuilder ) v0 ).append ( v3 ); // invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
v1 = this.val;
int v2 = 6; // const/4 v2, 0x6
/* aget v1, v1, v2 */
(( java.lang.StringBuilder ) v0 ).append ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;
final String v1 = "|"; // const-string v1, "|"
(( java.lang.StringBuilder ) v0 ).append ( v3 ); // invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
v1 = this.val;
/* const/16 v2, 0xa */
/* aget v1, v1, v2 */
(( java.lang.StringBuilder ) v0 ).append ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;
final String v1 = "|"; // const-string v1, "|"
(( java.lang.StringBuilder ) v0 ).append ( v3 ); // invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
v1 = this.val;
/* const/16 v2, 0xe */
/* aget v1, v1, v2 */
(( java.lang.StringBuilder ) v0 ).append ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;
final String v1 = "]\n"; // const-string v1, "]\n"
(( java.lang.StringBuilder ) v0 ).append ( v5 ); // invoke-virtual {v0, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
final String v1 = "["; // const-string v1, "["
(( java.lang.StringBuilder ) v0 ).append ( v4 ); // invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
v1 = this.val;
int v2 = 3; // const/4 v2, 0x3
/* aget v1, v1, v2 */
(( java.lang.StringBuilder ) v0 ).append ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;
final String v1 = "|"; // const-string v1, "|"
(( java.lang.StringBuilder ) v0 ).append ( v3 ); // invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
v1 = this.val;
int v2 = 7; // const/4 v2, 0x7
/* aget v1, v1, v2 */
(( java.lang.StringBuilder ) v0 ).append ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;
final String v1 = "|"; // const-string v1, "|"
(( java.lang.StringBuilder ) v0 ).append ( v3 ); // invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
v1 = this.val;
/* const/16 v2, 0xb */
/* aget v1, v1, v2 */
(( java.lang.StringBuilder ) v0 ).append ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;
final String v1 = "|"; // const-string v1, "|"
(( java.lang.StringBuilder ) v0 ).append ( v3 ); // invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
v1 = this.val;
/* const/16 v2, 0xf */
/* aget v1, v1, v2 */
(( java.lang.StringBuilder ) v0 ).append ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;
final String v1 = "]\n"; // const-string v1, "]\n"
(( java.lang.StringBuilder ) v0 ).append ( v5 ); // invoke-virtual {v0, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v0 ).toString ( ); // invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
} // .end method
public com.badlogic.gdx.math.Matrix4 tra ( ) {
/* .locals 7 */
int v6 = 4; // const/4 v6, 0x4
int v5 = 3; // const/4 v5, 0x3
int v4 = 2; // const/4 v4, 0x2
int v3 = 1; // const/4 v3, 0x1
int v2 = 0; // const/4 v2, 0x0
v0 = this.tmp;
v1 = this.val;
/* aget v1, v1, v2 */
/* aput v1, v0, v2 */
v0 = this.tmp;
v1 = this.val;
/* aget v1, v1, v3 */
/* aput v1, v0, v6 */
v0 = this.tmp;
/* const/16 v1, 0x8 */
v2 = this.val;
/* aget v2, v2, v4 */
/* aput v2, v0, v1 */
v0 = this.tmp;
/* const/16 v1, 0xc */
v2 = this.val;
/* aget v2, v2, v5 */
/* aput v2, v0, v1 */
v0 = this.tmp;
v1 = this.val;
/* aget v1, v1, v6 */
/* aput v1, v0, v3 */
v0 = this.tmp;
int v1 = 5; // const/4 v1, 0x5
v2 = this.val;
int v3 = 5; // const/4 v3, 0x5
/* aget v2, v2, v3 */
/* aput v2, v0, v1 */
v0 = this.tmp;
/* const/16 v1, 0x9 */
v2 = this.val;
int v3 = 6; // const/4 v3, 0x6
/* aget v2, v2, v3 */
/* aput v2, v0, v1 */
v0 = this.tmp;
/* const/16 v1, 0xd */
v2 = this.val;
int v3 = 7; // const/4 v3, 0x7
/* aget v2, v2, v3 */
/* aput v2, v0, v1 */
v0 = this.tmp;
v1 = this.val;
/* const/16 v2, 0x8 */
/* aget v1, v1, v2 */
/* aput v1, v0, v4 */
v0 = this.tmp;
int v1 = 6; // const/4 v1, 0x6
v2 = this.val;
/* const/16 v3, 0x9 */
/* aget v2, v2, v3 */
/* aput v2, v0, v1 */
v0 = this.tmp;
/* const/16 v1, 0xa */
v2 = this.val;
/* const/16 v3, 0xa */
/* aget v2, v2, v3 */
/* aput v2, v0, v1 */
v0 = this.tmp;
/* const/16 v1, 0xe */
v2 = this.val;
/* const/16 v3, 0xb */
/* aget v2, v2, v3 */
/* aput v2, v0, v1 */
v0 = this.tmp;
v1 = this.val;
/* const/16 v2, 0xc */
/* aget v1, v1, v2 */
/* aput v1, v0, v5 */
v0 = this.tmp;
int v1 = 7; // const/4 v1, 0x7
v2 = this.val;
/* const/16 v3, 0xd */
/* aget v2, v2, v3 */
/* aput v2, v0, v1 */
v0 = this.tmp;
/* const/16 v1, 0xb */
v2 = this.val;
/* const/16 v3, 0xe */
/* aget v2, v2, v3 */
/* aput v2, v0, v1 */
v0 = this.tmp;
/* const/16 v1, 0xf */
v2 = this.val;
/* const/16 v3, 0xf */
/* aget v2, v2, v3 */
/* aput v2, v0, v1 */
v0 = this.tmp;
(( com.badlogic.gdx.math.Matrix4 ) p0 ).set ( v0 ); // invoke-virtual {p0, v0}, Lcom/badlogic/gdx/math/Matrix4;->set([F)Lcom/badlogic/gdx/math/Matrix4;
} // .end method
public com.badlogic.gdx.math.Matrix4 translate ( Float p0, Float p1, Float p2 ) {
/* .locals 4 */
/* const/high16 v3, 0x3f800000 # 1.0f */
int v2 = 0; // const/4 v2, 0x0
v0 = this.tmp;
int v1 = 0; // const/4 v1, 0x0
/* aput v3, v0, v1 */
v0 = this.tmp;
int v1 = 4; // const/4 v1, 0x4
/* aput v2, v0, v1 */
v0 = this.tmp;
/* const/16 v1, 0x8 */
/* aput v2, v0, v1 */
v0 = this.tmp;
/* const/16 v1, 0xc */
/* aput p1, v0, v1 */
v0 = this.tmp;
int v1 = 1; // const/4 v1, 0x1
/* aput v2, v0, v1 */
v0 = this.tmp;
int v1 = 5; // const/4 v1, 0x5
/* aput v3, v0, v1 */
v0 = this.tmp;
/* const/16 v1, 0x9 */
/* aput v2, v0, v1 */
v0 = this.tmp;
/* const/16 v1, 0xd */
/* aput p2, v0, v1 */
v0 = this.tmp;
int v1 = 2; // const/4 v1, 0x2
/* aput v2, v0, v1 */
v0 = this.tmp;
int v1 = 6; // const/4 v1, 0x6
/* aput v2, v0, v1 */
v0 = this.tmp;
/* const/16 v1, 0xa */
/* aput v3, v0, v1 */
v0 = this.tmp;
/* const/16 v1, 0xe */
/* aput p3, v0, v1 */
v0 = this.tmp;
int v1 = 3; // const/4 v1, 0x3
/* aput v2, v0, v1 */
v0 = this.tmp;
int v1 = 7; // const/4 v1, 0x7
/* aput v2, v0, v1 */
v0 = this.tmp;
/* const/16 v1, 0xb */
/* aput v2, v0, v1 */
v0 = this.tmp;
/* const/16 v1, 0xf */
/* aput v3, v0, v1 */
v0 = this.val;
v1 = this.tmp;
com.badlogic.gdx.math.Matrix4 .mul ( v0,v1 );
} // .end method
public com.badlogic.gdx.math.Matrix4 trn ( Float p0, Float p1, Float p2 ) {
/* .locals 3 */
v0 = this.val;
/* const/16 v1, 0xc */
/* aget v2, v0, v1 */
/* add-float/2addr v2, p1 */
/* aput v2, v0, v1 */
v0 = this.val;
/* const/16 v1, 0xd */
/* aget v2, v0, v1 */
/* add-float/2addr v2, p2 */
/* aput v2, v0, v1 */
v0 = this.val;
/* const/16 v1, 0xe */
/* aget v2, v0, v1 */
/* add-float/2addr v2, p3 */
/* aput v2, v0, v1 */
} // .end method
public com.badlogic.gdx.math.Matrix4 trn ( com.badlogic.gdx.math.Vector3 p0 ) {
/* .locals 4 */
v0 = this.val;
/* const/16 v1, 0xc */
/* aget v2, v0, v1 */
/* iget v3, p1, Lcom/badlogic/gdx/math/Vector3;->x:F */
/* add-float/2addr v2, v3 */
/* aput v2, v0, v1 */
v0 = this.val;
/* const/16 v1, 0xd */
/* aget v2, v0, v1 */
/* iget v3, p1, Lcom/badlogic/gdx/math/Vector3;->y:F */
/* add-float/2addr v2, v3 */
/* aput v2, v0, v1 */
v0 = this.val;
/* const/16 v1, 0xe */
/* aget v2, v0, v1 */
/* iget v3, p1, Lcom/badlogic/gdx/math/Vector3;->z:F */
/* add-float/2addr v2, v3 */
/* aput v2, v0, v1 */
} // .end method
