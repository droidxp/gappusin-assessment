public class de.nurogames.android.ticb.base.core.VectorMath {
	 /* .source "VectorMath.java" */
	 /* # static fields */
	 static Double adx;
	 static Double ady;
	 static Double alpha;
	 static Double dWinkel;
	 static Double dx;
	 static Double dy;
	 static Float fVectorLength;
	 static Integer iWinkel;
	 static de.nurogames.android.ticb.base.core.Vector3D result;
	 static Double rwinkel;
	 /* # direct methods */
	 static de.nurogames.android.ticb.base.core.VectorMath ( ) {
		 /* .locals 2 */
		 /* .prologue */
		 int v1 = 0; // const/4 v1, 0x0
		 /* .line 6 */
		 /* new-instance v0, Lde/nurogames/android/ticb/base/core/Vector3D; */
		 /* invoke-direct {v0, v1, v1, v1}, Lde/nurogames/android/ticb/base/core/Vector3D;-><init>(FFF)V */
		 /* .line 20 */
		 return;
	 } // .end method
	 public de.nurogames.android.ticb.base.core.VectorMath ( ) {
		 /* .locals 0 */
		 /* .prologue */
		 /* .line 4 */
		 /* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
		 return;
	 } // .end method
	 public static de.nurogames.android.ticb.base.core.Vector3D add ( de.nurogames.android.ticb.base.core.Vector3D p0, de.nurogames.android.ticb.base.core.Vector3D p1 ) {
		 /* .locals 5 */
		 /* .param p0, "v1" # Lde/nurogames/android/ticb/base/core/Vector3D; */
		 /* .param p1, "v2" # Lde/nurogames/android/ticb/base/core/Vector3D; */
		 /* .prologue */
		 /* .line 25 */
		 /* new-instance v0, Lde/nurogames/android/ticb/base/core/Vector3D; */
		 /* iget v1, p0, Lde/nurogames/android/ticb/base/core/Vector3D;->x:F */
		 /* iget v2, p1, Lde/nurogames/android/ticb/base/core/Vector3D;->x:F */
		 /* add-float/2addr v1, v2 */
		 /* iget v2, p0, Lde/nurogames/android/ticb/base/core/Vector3D;->y:F */
		 /* iget v3, p1, Lde/nurogames/android/ticb/base/core/Vector3D;->y:F */
		 /* add-float/2addr v2, v3 */
		 /* iget v3, p0, Lde/nurogames/android/ticb/base/core/Vector3D;->z:F */
		 /* iget v4, p1, Lde/nurogames/android/ticb/base/core/Vector3D;->z:F */
		 /* add-float/2addr v3, v4 */
		 /* invoke-direct {v0, v1, v2, v3}, Lde/nurogames/android/ticb/base/core/Vector3D;-><init>(FFF)V */
	 } // .end method
	 public static Float calculateAngle ( de.nurogames.android.ticb.base.core.Vector3D p0, de.nurogames.android.ticb.base.core.Vector3D p1 ) {
		 /* .locals 8 */
		 /* .param p0, "v1" # Lde/nurogames/android/ticb/base/core/Vector3D; */
		 /* .param p1, "v2" # Lde/nurogames/android/ticb/base/core/Vector3D; */
		 /* .prologue */
		 int v0 = 0; // const/4 v0, 0x0
		 /* const-wide v6, 0x4066800000000000L # 180.0 */
		 /* const-wide/16 v4, 0x0 */
		 /* .line 96 */
		 /* iget v1, p1, Lde/nurogames/android/ticb/base/core/Vector3D;->x:F */
		 /* iget v2, p0, Lde/nurogames/android/ticb/base/core/Vector3D;->x:F */
		 /* sub-float/2addr v1, v2 */
		 /* float-to-double v1, v1 */
		 /* sput-wide v1, Lde/nurogames/android/ticb/base/core/VectorMath;->dx:D */
		 /* .line 97 */
		 /* iget v1, p1, Lde/nurogames/android/ticb/base/core/Vector3D;->y:F */
		 /* iget v2, p0, Lde/nurogames/android/ticb/base/core/Vector3D;->y:F */
		 /* sub-float/2addr v1, v2 */
		 /* float-to-double v1, v1 */
		 /* sput-wide v1, Lde/nurogames/android/ticb/base/core/VectorMath;->dy:D */
		 /* .line 98 */
		 /* sget-wide v1, Lde/nurogames/android/ticb/base/core/VectorMath;->dx:D */
		 java.lang.Math .abs ( v1,v2 );
		 /* move-result-wide v1 */
		 /* sput-wide v1, Lde/nurogames/android/ticb/base/core/VectorMath;->adx:D */
		 /* .line 99 */
		 /* sget-wide v1, Lde/nurogames/android/ticb/base/core/VectorMath;->dy:D */
		 java.lang.Math .abs ( v1,v2 );
		 /* move-result-wide v1 */
		 /* sput-wide v1, Lde/nurogames/android/ticb/base/core/VectorMath;->ady:D */
		 /* .line 101 */
		 /* sget-wide v1, Lde/nurogames/android/ticb/base/core/VectorMath;->dy:D */
		 /* cmpl-double v1, v1, v4 */
		 /* if-nez v1, :cond_1 */
		 /* sget-wide v1, Lde/nurogames/android/ticb/base/core/VectorMath;->dx:D */
		 /* cmpl-double v1, v1, v4 */
		 /* if-nez v1, :cond_1 */
		 /* .line 133 */
	 } // :cond_0
} // :goto_0
/* .line 103 */
} // :cond_1
/* sget-wide v1, Lde/nurogames/android/ticb/base/core/VectorMath;->dy:D */
/* cmpl-double v1, v1, v4 */
/* if-nez v1, :cond_2 */
/* sget-wide v1, Lde/nurogames/android/ticb/base/core/VectorMath;->dx:D */
/* cmpl-double v1, v1, v4 */
/* if-gtz v1, :cond_0 */
/* .line 105 */
} // :cond_2
/* sget-wide v0, Lde/nurogames/android/ticb/base/core/VectorMath;->dy:D */
/* cmpl-double v0, v0, v4 */
/* if-nez v0, :cond_3 */
/* sget-wide v0, Lde/nurogames/android/ticb/base/core/VectorMath;->dx:D */
/* cmpg-double v0, v0, v4 */
/* if-gez v0, :cond_3 */
/* .line 106 */
/* const/high16 v0, 0x43340000 # 180.0f */
/* .line 107 */
} // :cond_3
/* sget-wide v0, Lde/nurogames/android/ticb/base/core/VectorMath;->dy:D */
/* cmpl-double v0, v0, v4 */
/* if-lez v0, :cond_4 */
/* sget-wide v0, Lde/nurogames/android/ticb/base/core/VectorMath;->dx:D */
/* cmpl-double v0, v0, v4 */
/* if-nez v0, :cond_4 */
/* .line 108 */
/* const/high16 v0, 0x43870000 # 270.0f */
/* .line 109 */
} // :cond_4
/* sget-wide v0, Lde/nurogames/android/ticb/base/core/VectorMath;->dy:D */
/* cmpg-double v0, v0, v4 */
/* if-gez v0, :cond_5 */
/* sget-wide v0, Lde/nurogames/android/ticb/base/core/VectorMath;->dx:D */
/* cmpl-double v0, v0, v4 */
/* if-nez v0, :cond_5 */
/* .line 110 */
/* const/high16 v0, 0x42b40000 # 90.0f */
/* .line 113 */
} // :cond_5
/* sget-wide v0, Lde/nurogames/android/ticb/base/core/VectorMath;->ady:D */
/* sget-wide v2, Lde/nurogames/android/ticb/base/core/VectorMath;->adx:D */
/* div-double/2addr v0, v2 */
java.lang.Math .atan ( v0,v1 );
/* move-result-wide v0 */
/* sput-wide v0, Lde/nurogames/android/ticb/base/core/VectorMath;->rwinkel:D */
/* .line 114 */
/* sput-wide v4, Lde/nurogames/android/ticb/base/core/VectorMath;->dWinkel:D */
/* .line 116 */
/* sget-wide v0, Lde/nurogames/android/ticb/base/core/VectorMath;->dx:D */
/* cmpl-double v0, v0, v4 */
/* if-lez v0, :cond_8 */
/* sget-wide v0, Lde/nurogames/android/ticb/base/core/VectorMath;->dy:D */
/* cmpl-double v0, v0, v4 */
/* if-lez v0, :cond_8 */
/* .line 117 */
/* const-wide v0, 0x4076800000000000L # 360.0 */
/* sget-wide v2, Lde/nurogames/android/ticb/base/core/VectorMath;->rwinkel:D */
java.lang.Math .toDegrees ( v2,v3 );
/* move-result-wide v2 */
/* sub-double/2addr v0, v2 */
/* sput-wide v0, Lde/nurogames/android/ticb/base/core/VectorMath;->dWinkel:D */
/* .line 128 */
} // :cond_6
} // :goto_1
/* sget-wide v0, Lde/nurogames/android/ticb/base/core/VectorMath;->dWinkel:D */
/* double-to-int v0, v0 */
/* .line 130 */
/* const/16 v1, 0x168 */
/* if-ne v0, v1, :cond_7 */
/* .line 131 */
int v0 = 0; // const/4 v0, 0x0
/* .line 133 */
} // :cond_7
/* int-to-float v0, v0 */
/* .line 119 */
} // :cond_8
/* sget-wide v0, Lde/nurogames/android/ticb/base/core/VectorMath;->dx:D */
/* cmpg-double v0, v0, v4 */
/* if-gez v0, :cond_9 */
/* sget-wide v0, Lde/nurogames/android/ticb/base/core/VectorMath;->dy:D */
/* cmpl-double v0, v0, v4 */
/* if-lez v0, :cond_9 */
/* .line 120 */
/* sget-wide v0, Lde/nurogames/android/ticb/base/core/VectorMath;->rwinkel:D */
java.lang.Math .toDegrees ( v0,v1 );
/* move-result-wide v0 */
/* add-double/2addr v0, v6 */
/* sput-wide v0, Lde/nurogames/android/ticb/base/core/VectorMath;->dWinkel:D */
/* .line 122 */
} // :cond_9
/* sget-wide v0, Lde/nurogames/android/ticb/base/core/VectorMath;->dx:D */
/* cmpl-double v0, v0, v4 */
/* if-lez v0, :cond_a */
/* sget-wide v0, Lde/nurogames/android/ticb/base/core/VectorMath;->dy:D */
/* cmpg-double v0, v0, v4 */
/* if-gez v0, :cond_a */
/* .line 123 */
/* sget-wide v0, Lde/nurogames/android/ticb/base/core/VectorMath;->rwinkel:D */
java.lang.Math .toDegrees ( v0,v1 );
/* move-result-wide v0 */
/* sub-double v0, v6, v0 */
/* sput-wide v0, Lde/nurogames/android/ticb/base/core/VectorMath;->dWinkel:D */
/* .line 125 */
} // :cond_a
/* sget-wide v0, Lde/nurogames/android/ticb/base/core/VectorMath;->dx:D */
/* cmpg-double v0, v0, v4 */
/* if-gez v0, :cond_6 */
/* sget-wide v0, Lde/nurogames/android/ticb/base/core/VectorMath;->dy:D */
/* cmpg-double v0, v0, v4 */
/* if-gez v0, :cond_6 */
/* .line 126 */
/* sget-wide v0, Lde/nurogames/android/ticb/base/core/VectorMath;->rwinkel:D */
java.lang.Math .toDegrees ( v0,v1 );
/* move-result-wide v0 */
/* sput-wide v0, Lde/nurogames/android/ticb/base/core/VectorMath;->dWinkel:D */
} // .end method
public static Float calculateAngleToOrigin ( de.nurogames.android.ticb.base.core.Vector3D p0 ) {
/* .locals 8 */
/* .param p0, "v2" # Lde/nurogames/android/ticb/base/core/Vector3D; */
/* .prologue */
int v2 = 0; // const/4 v2, 0x0
/* .line 79 */
/* iget v0, p0, Lde/nurogames/android/ticb/base/core/Vector3D;->x:F */
/* sub-float/2addr v0, v2 */
/* float-to-double v0, v0 */
/* sput-wide v0, Lde/nurogames/android/ticb/base/core/VectorMath;->dx:D */
/* .line 80 */
/* iget v0, p0, Lde/nurogames/android/ticb/base/core/Vector3D;->y:F */
/* sub-float/2addr v0, v2 */
/* float-to-double v0, v0 */
/* sput-wide v0, Lde/nurogames/android/ticb/base/core/VectorMath;->dy:D */
/* .line 82 */
/* sget-wide v0, Lde/nurogames/android/ticb/base/core/VectorMath;->dy:D */
/* sget-wide v2, Lde/nurogames/android/ticb/base/core/VectorMath;->dx:D */
/* sget-wide v4, Lde/nurogames/android/ticb/base/core/VectorMath;->dx:D */
/* mul-double/2addr v2, v4 */
/* sget-wide v4, Lde/nurogames/android/ticb/base/core/VectorMath;->dy:D */
/* sget-wide v6, Lde/nurogames/android/ticb/base/core/VectorMath;->dy:D */
/* mul-double/2addr v4, v6 */
/* add-double/2addr v2, v4 */
java.lang.Math .sqrt ( v2,v3 );
/* move-result-wide v2 */
/* div-double/2addr v0, v2 */
java.lang.Math .acos ( v0,v1 );
/* move-result-wide v0 */
/* sput-wide v0, Lde/nurogames/android/ticb/base/core/VectorMath;->alpha:D */
/* .line 84 */
/* const-wide v0, 0x4056800000000000L # 90.0 */
/* sget-wide v2, Lde/nurogames/android/ticb/base/core/VectorMath;->alpha:D */
java.lang.Math .toDegrees ( v2,v3 );
/* move-result-wide v2 */
/* sub-double/2addr v0, v2 */
/* double-to-float v0, v0 */
} // .end method
public static de.nurogames.android.ticb.base.core.Vector3D cross ( de.nurogames.android.ticb.base.core.Vector3D p0, de.nurogames.android.ticb.base.core.Vector3D p1 ) {
/* .locals 6 */
/* .param p0, "v1" # Lde/nurogames/android/ticb/base/core/Vector3D; */
/* .param p1, "v2" # Lde/nurogames/android/ticb/base/core/Vector3D; */
/* .prologue */
/* .line 49 */
/* new-instance v0, Lde/nurogames/android/ticb/base/core/Vector3D; */
/* iget v1, p0, Lde/nurogames/android/ticb/base/core/Vector3D;->y:F */
/* iget v2, p1, Lde/nurogames/android/ticb/base/core/Vector3D;->z:F */
/* mul-float/2addr v1, v2 */
/* iget v2, p0, Lde/nurogames/android/ticb/base/core/Vector3D;->z:F */
/* iget v3, p1, Lde/nurogames/android/ticb/base/core/Vector3D;->y:F */
/* mul-float/2addr v2, v3 */
/* sub-float/2addr v1, v2 */
/* iget v2, p0, Lde/nurogames/android/ticb/base/core/Vector3D;->z:F */
/* iget v3, p1, Lde/nurogames/android/ticb/base/core/Vector3D;->x:F */
/* mul-float/2addr v2, v3 */
/* iget v3, p0, Lde/nurogames/android/ticb/base/core/Vector3D;->x:F */
/* iget v4, p1, Lde/nurogames/android/ticb/base/core/Vector3D;->z:F */
/* mul-float/2addr v3, v4 */
/* sub-float/2addr v2, v3 */
/* iget v3, p0, Lde/nurogames/android/ticb/base/core/Vector3D;->x:F */
/* iget v4, p1, Lde/nurogames/android/ticb/base/core/Vector3D;->y:F */
/* mul-float/2addr v3, v4 */
/* iget v4, p0, Lde/nurogames/android/ticb/base/core/Vector3D;->y:F */
/* iget v5, p1, Lde/nurogames/android/ticb/base/core/Vector3D;->x:F */
/* mul-float/2addr v4, v5 */
/* sub-float/2addr v3, v4 */
/* invoke-direct {v0, v1, v2, v3}, Lde/nurogames/android/ticb/base/core/Vector3D;-><init>(FFF)V */
} // .end method
public static Float distance ( de.nurogames.android.ticb.base.core.Vector3D p0, de.nurogames.android.ticb.base.core.Vector3D p1 ) {
/* .locals 3 */
/* .param p0, "v1" # Lde/nurogames/android/ticb/base/core/Vector3D; */
/* .param p1, "v2" # Lde/nurogames/android/ticb/base/core/Vector3D; */
/* .prologue */
/* .line 45 */
/* iget v0, p0, Lde/nurogames/android/ticb/base/core/Vector3D;->x:F */
/* float-to-int v0, v0 */
/* iget v1, p1, Lde/nurogames/android/ticb/base/core/Vector3D;->x:F */
/* float-to-int v1, v1 */
/* add-int/2addr v0, v1 */
/* iget v1, p0, Lde/nurogames/android/ticb/base/core/Vector3D;->y:F */
/* float-to-int v1, v1 */
/* iget v2, p1, Lde/nurogames/android/ticb/base/core/Vector3D;->y:F */
/* float-to-int v2, v2 */
/* sub-int/2addr v1, v2 */
/* add-int/lit8 v1, v1, 0x2 */
/* xor-int/2addr v0, v1 */
/* iget v1, p0, Lde/nurogames/android/ticb/base/core/Vector3D;->z:F */
/* float-to-int v1, v1 */
/* iget v2, p1, Lde/nurogames/android/ticb/base/core/Vector3D;->z:F */
/* float-to-int v2, v2 */
/* sub-int/2addr v1, v2 */
/* add-int/lit8 v1, v1, 0x2 */
/* xor-int/2addr v0, v1 */
/* xor-int/lit8 v0, v0, 0x2 */
/* int-to-double v0, v0 */
java.lang.Math .sqrt ( v0,v1 );
/* move-result-wide v0 */
/* double-to-float v0, v0 */
} // .end method
public static Float dotProduct ( de.nurogames.android.ticb.base.core.Vector3D p0, de.nurogames.android.ticb.base.core.Vector3D p1 ) {
/* .locals 3 */
/* .param p0, "v1" # Lde/nurogames/android/ticb/base/core/Vector3D; */
/* .param p1, "v2" # Lde/nurogames/android/ticb/base/core/Vector3D; */
/* .prologue */
/* .line 53 */
/* iget v0, p0, Lde/nurogames/android/ticb/base/core/Vector3D;->x:F */
/* iget v1, p1, Lde/nurogames/android/ticb/base/core/Vector3D;->x:F */
/* mul-float/2addr v0, v1 */
/* iget v1, p0, Lde/nurogames/android/ticb/base/core/Vector3D;->y:F */
/* iget v2, p1, Lde/nurogames/android/ticb/base/core/Vector3D;->y:F */
/* mul-float/2addr v1, v2 */
/* add-float/2addr v0, v1 */
/* iget v1, p0, Lde/nurogames/android/ticb/base/core/Vector3D;->z:F */
/* iget v2, p1, Lde/nurogames/android/ticb/base/core/Vector3D;->z:F */
/* mul-float/2addr v1, v2 */
/* add-float/2addr v0, v1 */
} // .end method
public static Double length ( de.nurogames.android.ticb.base.core.Vector3D p0 ) {
/* .locals 3 */
/* .param p0, "v" # Lde/nurogames/android/ticb/base/core/Vector3D; */
/* .prologue */
/* .line 41 */
/* iget v0, p0, Lde/nurogames/android/ticb/base/core/Vector3D;->x:F */
/* iget v1, p0, Lde/nurogames/android/ticb/base/core/Vector3D;->x:F */
/* mul-float/2addr v0, v1 */
/* iget v1, p0, Lde/nurogames/android/ticb/base/core/Vector3D;->y:F */
/* iget v2, p0, Lde/nurogames/android/ticb/base/core/Vector3D;->y:F */
/* mul-float/2addr v1, v2 */
/* add-float/2addr v0, v1 */
/* iget v1, p0, Lde/nurogames/android/ticb/base/core/Vector3D;->z:F */
/* iget v2, p0, Lde/nurogames/android/ticb/base/core/Vector3D;->z:F */
/* mul-float/2addr v1, v2 */
/* add-float/2addr v0, v1 */
/* float-to-double v0, v0 */
java.lang.Math .sqrt ( v0,v1 );
/* move-result-wide v0 */
/* return-wide v0 */
} // .end method
public static Float map ( Float p0, Float p1, Float p2, Float p3, Float p4 ) {
/* .locals 2 */
/* .param p0, "v" # F */
/* .param p1, "old_min" # F */
/* .param p2, "old_max" # F */
/* .param p3, "new_min" # F */
/* .param p4, "new_max" # F */
/* .prologue */
/* .line 157 */
/* sub-float v0, p4, p3 */
/* sub-float v1, p2, p1 */
/* div-float/2addr v0, v1 */
/* mul-float/2addr v0, p0 */
/* add-float/2addr v0, p3 */
} // .end method
public static de.nurogames.android.ticb.base.core.Vector3D multiply ( de.nurogames.android.ticb.base.core.Vector3D p0, Float p1 ) {
/* .locals 4 */
/* .param p0, "v1" # Lde/nurogames/android/ticb/base/core/Vector3D; */
/* .param p1, "value" # F */
/* .prologue */
/* .line 37 */
/* new-instance v0, Lde/nurogames/android/ticb/base/core/Vector3D; */
/* iget v1, p0, Lde/nurogames/android/ticb/base/core/Vector3D;->x:F */
/* mul-float/2addr v1, p1 */
/* iget v2, p0, Lde/nurogames/android/ticb/base/core/Vector3D;->y:F */
/* mul-float/2addr v2, p1 */
/* iget v3, p0, Lde/nurogames/android/ticb/base/core/Vector3D;->z:F */
/* mul-float/2addr v3, p1 */
/* invoke-direct {v0, v1, v2, v3}, Lde/nurogames/android/ticb/base/core/Vector3D;-><init>(FFF)V */
} // .end method
public static de.nurogames.android.ticb.base.core.Vector3D multiply ( de.nurogames.android.ticb.base.core.Vector3D p0, de.nurogames.android.ticb.base.core.Vector3D p1 ) {
/* .locals 5 */
/* .param p0, "v1" # Lde/nurogames/android/ticb/base/core/Vector3D; */
/* .param p1, "v2" # Lde/nurogames/android/ticb/base/core/Vector3D; */
/* .prologue */
/* .line 33 */
/* new-instance v0, Lde/nurogames/android/ticb/base/core/Vector3D; */
/* iget v1, p0, Lde/nurogames/android/ticb/base/core/Vector3D;->x:F */
/* iget v2, p1, Lde/nurogames/android/ticb/base/core/Vector3D;->x:F */
/* mul-float/2addr v1, v2 */
/* iget v2, p0, Lde/nurogames/android/ticb/base/core/Vector3D;->y:F */
/* iget v3, p1, Lde/nurogames/android/ticb/base/core/Vector3D;->y:F */
/* mul-float/2addr v2, v3 */
/* iget v3, p0, Lde/nurogames/android/ticb/base/core/Vector3D;->z:F */
/* iget v4, p1, Lde/nurogames/android/ticb/base/core/Vector3D;->z:F */
/* mul-float/2addr v3, v4 */
/* invoke-direct {v0, v1, v2, v3}, Lde/nurogames/android/ticb/base/core/Vector3D;-><init>(FFF)V */
} // .end method
public static de.nurogames.android.ticb.base.core.Vector3D normalize ( de.nurogames.android.ticb.base.core.Vector3D p0 ) {
/* .locals 3 */
/* .param p0, "v1" # Lde/nurogames/android/ticb/base/core/Vector3D; */
/* .prologue */
/* .line 58 */
de.nurogames.android.ticb.base.core.VectorMath .length ( p0 );
/* move-result-wide v0 */
/* double-to-float v0, v0 */
/* .line 60 */
int v1 = 0; // const/4 v1, 0x0
/* cmpl-float v0, v0, v1 */
if ( v0 != null) { // if-eqz v0, :cond_0
/* .line 62 */
v0 = de.nurogames.android.ticb.base.core.VectorMath.result;
/* iget v1, p0, Lde/nurogames/android/ticb/base/core/Vector3D;->x:F */
/* div-float/2addr v1, v2 */
/* iput v1, v0, Lde/nurogames/android/ticb/base/core/Vector3D;->x:F */
/* .line 63 */
v0 = de.nurogames.android.ticb.base.core.VectorMath.result;
/* iget v1, p0, Lde/nurogames/android/ticb/base/core/Vector3D;->y:F */
/* div-float/2addr v1, v2 */
/* iput v1, v0, Lde/nurogames/android/ticb/base/core/Vector3D;->y:F */
/* .line 64 */
v0 = de.nurogames.android.ticb.base.core.VectorMath.result;
/* iget v1, p0, Lde/nurogames/android/ticb/base/core/Vector3D;->z:F */
/* div-float/2addr v1, v2 */
/* iput v1, v0, Lde/nurogames/android/ticb/base/core/Vector3D;->z:F */
/* .line 67 */
} // :cond_0
v0 = de.nurogames.android.ticb.base.core.VectorMath.result;
} // .end method
public static de.nurogames.android.ticb.base.core.Vector3D subtract ( de.nurogames.android.ticb.base.core.Vector3D p0, de.nurogames.android.ticb.base.core.Vector3D p1 ) {
/* .locals 5 */
/* .param p0, "v1" # Lde/nurogames/android/ticb/base/core/Vector3D; */
/* .param p1, "v2" # Lde/nurogames/android/ticb/base/core/Vector3D; */
/* .prologue */
/* .line 29 */
/* new-instance v0, Lde/nurogames/android/ticb/base/core/Vector3D; */
/* iget v1, p0, Lde/nurogames/android/ticb/base/core/Vector3D;->x:F */
/* iget v2, p1, Lde/nurogames/android/ticb/base/core/Vector3D;->x:F */
/* sub-float/2addr v1, v2 */
/* iget v2, p0, Lde/nurogames/android/ticb/base/core/Vector3D;->y:F */
/* iget v3, p1, Lde/nurogames/android/ticb/base/core/Vector3D;->y:F */
/* sub-float/2addr v2, v3 */
/* iget v3, p0, Lde/nurogames/android/ticb/base/core/Vector3D;->z:F */
/* iget v4, p1, Lde/nurogames/android/ticb/base/core/Vector3D;->z:F */
/* sub-float/2addr v3, v4 */
/* invoke-direct {v0, v1, v2, v3}, Lde/nurogames/android/ticb/base/core/Vector3D;-><init>(FFF)V */
} // .end method
