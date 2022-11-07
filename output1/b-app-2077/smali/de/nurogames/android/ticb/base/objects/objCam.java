public class de.nurogames.android.ticb.base.objects.objCam {
	 /* .source "objCam.java" */
	 /* # static fields */
	 private static Integer ZOOM_AT;
	 public static Float ZOOM_FACTOR;
	 private static final Float ZOOM_FACTOR_MAX;
	 private static final Float ZOOM_FACTOR_MIN;
	 private static Integer ZOOM_TO;
	 public static de.nurogames.android.ticb.base.core.Vector3D camPos;
	 /* # instance fields */
	 private Integer CAM_BASE;
	 private Integer STRANGE_UNKNOWN_INTEGER_HAS_SOMETHING_TO_DO_WITH_ZOOM;
	 private Float dif;
	 private Float dif_mapped;
	 private android.content.res.Resources res;
	 /* # direct methods */
	 static de.nurogames.android.ticb.base.objects.objCam ( ) {
		 /* .locals 2 */
		 /* .prologue */
		 int v1 = 0; // const/4 v1, 0x0
		 /* .line 21 */
		 /* const v0, 0x3f7d70a4 # 0.99f */
		 /* .line 24 */
		 /* .line 25 */
		 return;
	 } // .end method
	 public de.nurogames.android.ticb.base.objects.objCam ( ) {
		 /* .locals 1 */
		 /* .prologue */
		 int v0 = 0; // const/4 v0, 0x0
		 /* .line 10 */
		 /* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
		 /* .line 30 */
		 /* iput v0, p0, Lde/nurogames/android/ticb/base/objects/objCam;->CAM_BASE:I */
		 /* .line 31 */
		 /* iput v0, p0, Lde/nurogames/android/ticb/base/objects/objCam;->STRANGE_UNKNOWN_INTEGER_HAS_SOMETHING_TO_DO_WITH_ZOOM:I */
		 /* .line 10 */
		 return;
	 } // .end method
	 /* # virtual methods */
	 public void init ( ) {
		 /* .locals 2 */
		 /* .prologue */
		 int v1 = 0; // const/4 v1, 0x0
		 /* .line 40 */
		 /* const v0, 0x3f7d70a4 # 0.99f */
		 /* .line 43 */
		 /* new-instance v0, Lde/nurogames/android/ticb/base/core/Vector3D; */
		 /* invoke-direct {v0, v1, v1}, Lde/nurogames/android/ticb/base/core/Vector3D;-><init>(FF)V */
		 /* .line 45 */
		 v0 = de.nurogames.android.ticb.base.tinysanta.cntx;
		 (( android.content.Context ) v0 ).getResources ( ); // invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;
		 this.res = v0;
		 /* .line 47 */
		 v0 = this.res;
		 (( android.content.res.Resources ) v0 ).getIntArray ( v1 ); // invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getIntArray(I)[I
		 /* aget v0, v0, v1 */
		 /* iput v0, p0, Lde/nurogames/android/ticb/base/objects/objCam;->CAM_BASE:I */
		 /* .line 48 */
		 v0 = this.res;
		 (( android.content.res.Resources ) v0 ).getIntArray ( v1 ); // invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getIntArray(I)[I
		 /* aget v0, v0, v1 */
		 /* iput v0, p0, Lde/nurogames/android/ticb/base/objects/objCam;->STRANGE_UNKNOWN_INTEGER_HAS_SOMETHING_TO_DO_WITH_ZOOM:I */
		 /* .line 49 */
		 v0 = this.res;
		 (( android.content.res.Resources ) v0 ).getIntArray ( v1 ); // invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getIntArray(I)[I
		 /* aget v0, v0, v1 */
		 /* .line 50 */
		 v0 = this.res;
		 (( android.content.res.Resources ) v0 ).getIntArray ( v1 ); // invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getIntArray(I)[I
		 /* aget v0, v0, v1 */
		 /* .line 52 */
		 return;
	 } // .end method
	 public void setZoom ( ) {
		 /* .locals 7 */
		 /* .prologue */
		 /* const v6, 0x3f7d70a4 # 0.99f */
		 /* const/high16 v5, 0x3f000000 # 0.5f */
		 /* .line 60 */
		 v0 = de.nurogames.android.ticb.base.objects.objBee.playerPos;
		 /* iget v0, v0, Lde/nurogames/android/ticb/base/core/Vector3D;->y:F */
		 /* int-to-float v1, v1 */
		 /* sub-float/2addr v0, v1 */
		 /* iput v0, p0, Lde/nurogames/android/ticb/base/objects/objCam;->dif:F */
		 /* .line 61 */
		 /* iget v0, p0, Lde/nurogames/android/ticb/base/objects/objCam;->dif:F */
		 /* int-to-float v1, v1 */
		 /* int-to-float v2, v2 */
		 v0 = 		 de.nurogames.android.ticb.base.core.VectorMath .map ( v0,v1,v2,v6,v5 );
		 /* iput v0, p0, Lde/nurogames/android/ticb/base/objects/objCam;->dif_mapped:F */
		 /* .line 62 */
		 /* iget v0, p0, Lde/nurogames/android/ticb/base/objects/objCam;->dif_mapped:F */
		 /* cmpl-float v0, v0, v6 */
		 /* if-lez v0, :cond_1 */
		 /* iput v6, p0, Lde/nurogames/android/ticb/base/objects/objCam;->dif_mapped:F */
		 /* .line 66 */
	 } // :cond_0
} // :goto_0
/* iget v0, p0, Lde/nurogames/android/ticb/base/objects/objCam;->dif_mapped:F */
/* .line 69 */
v0 = de.nurogames.android.ticb.base.objects.objCam.camPos;
/* iget v1, p0, Lde/nurogames/android/ticb/base/objects/objCam;->CAM_BASE:I */
/* int-to-float v1, v1 */
/* iget v2, p0, Lde/nurogames/android/ticb/base/objects/objCam;->dif_mapped:F */
/* iget v3, p0, Lde/nurogames/android/ticb/base/objects/objCam;->STRANGE_UNKNOWN_INTEGER_HAS_SOMETHING_TO_DO_WITH_ZOOM:I */
/* int-to-float v3, v3 */
/* int-to-float v4, v4 */
v2 = de.nurogames.android.ticb.base.core.VectorMath .map ( v2,v6,v5,v3,v4 );
/* add-float/2addr v1, v2 */
/* iput v1, v0, Lde/nurogames/android/ticb/base/core/Vector3D;->y:F */
/* .line 80 */
return;
/* .line 63 */
} // :cond_1
/* iget v0, p0, Lde/nurogames/android/ticb/base/objects/objCam;->dif_mapped:F */
/* cmpg-float v0, v0, v5 */
/* if-gez v0, :cond_0 */
/* iput v5, p0, Lde/nurogames/android/ticb/base/objects/objCam;->dif_mapped:F */
} // .end method
