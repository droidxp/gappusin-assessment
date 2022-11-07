public class de.nurogames.android.ticb.base.objects.objCloud {
	 /* .source "objCloud.java" */
	 /* # instance fields */
	 private Integer dXTwice;
	 private Float mCLOUD_SPEED;
	 public Integer mH;
	 private Integer mType;
	 public Integer mW;
	 public Float mX;
	 public Integer mY;
	 private java.util.Random rnd;
	 /* # direct methods */
	 public de.nurogames.android.ticb.base.objects.objCloud ( ) {
		 /* .locals 2 */
		 /* .param p1, "x" # F */
		 /* .param p2, "y" # I */
		 /* .param p3, "type" # I */
		 /* .prologue */
		 /* .line 30 */
		 /* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
		 /* .line 22 */
		 /* mul-int/lit8 v0, v0, 0x2 */
		 /* iput v0, p0, Lde/nurogames/android/ticb/base/objects/objCloud;->dXTwice:I */
		 /* .line 25 */
		 /* new-instance v0, Ljava/util/Random; */
		 /* invoke-direct {v0}, Ljava/util/Random;-><init>()V */
		 this.rnd = v0;
		 /* .line 32 */
		 v0 = de.nurogames.android.ticb.base.core.AppResources.imgCloud;
		 /* aget-object v0, v0, p3 */
		 v0 = 		 (( android.graphics.Bitmap ) v0 ).getWidth ( ); // invoke-virtual {v0}, Landroid/graphics/Bitmap;->getWidth()I
		 /* div-int/lit8 v0, v0, 0x2 */
		 /* int-to-float v0, v0 */
		 /* sub-float v0, p1, v0 */
		 /* iput v0, p0, Lde/nurogames/android/ticb/base/objects/objCloud;->mX:F */
		 /* .line 33 */
		 v0 = de.nurogames.android.ticb.base.core.AppResources.imgCloud;
		 /* aget-object v0, v0, p3 */
		 v0 = 		 (( android.graphics.Bitmap ) v0 ).getHeight ( ); // invoke-virtual {v0}, Landroid/graphics/Bitmap;->getHeight()I
		 /* div-int/lit8 v0, v0, 0x2 */
		 /* sub-int v0, p2, v0 */
		 /* iput v0, p0, Lde/nurogames/android/ticb/base/objects/objCloud;->mY:I */
		 /* .line 34 */
		 v0 = de.nurogames.android.ticb.base.core.AppResources.imgCloud;
		 /* aget-object v0, v0, p3 */
		 v0 = 		 (( android.graphics.Bitmap ) v0 ).getWidth ( ); // invoke-virtual {v0}, Landroid/graphics/Bitmap;->getWidth()I
		 /* iput v0, p0, Lde/nurogames/android/ticb/base/objects/objCloud;->mW:I */
		 /* .line 35 */
		 v0 = de.nurogames.android.ticb.base.core.AppResources.imgCloud;
		 /* aget-object v0, v0, p3 */
		 v0 = 		 (( android.graphics.Bitmap ) v0 ).getHeight ( ); // invoke-virtual {v0}, Landroid/graphics/Bitmap;->getHeight()I
		 /* iput v0, p0, Lde/nurogames/android/ticb/base/objects/objCloud;->mH:I */
		 /* .line 37 */
		 /* iput p3, p0, Lde/nurogames/android/ticb/base/objects/objCloud;->mType:I */
		 /* .line 39 */
		 /* iget v0, p0, Lde/nurogames/android/ticb/base/objects/objCloud;->mType:I */
		 /* if-nez v0, :cond_1 */
		 /* .line 40 */
		 /* const/high16 v0, 0x40600000 # 3.5f */
		 /* iput v0, p0, Lde/nurogames/android/ticb/base/objects/objCloud;->mCLOUD_SPEED:F */
		 /* .line 46 */
	 } // :cond_0
} // :goto_0
return;
/* .line 41 */
} // :cond_1
/* iget v0, p0, Lde/nurogames/android/ticb/base/objects/objCloud;->mType:I */
int v1 = 1; // const/4 v1, 0x1
/* if-ne v0, v1, :cond_2 */
/* .line 42 */
/* const/high16 v0, 0x40200000 # 2.5f */
/* iput v0, p0, Lde/nurogames/android/ticb/base/objects/objCloud;->mCLOUD_SPEED:F */
/* .line 43 */
} // :cond_2
/* iget v0, p0, Lde/nurogames/android/ticb/base/objects/objCloud;->mType:I */
int v1 = 2; // const/4 v1, 0x2
/* if-ne v0, v1, :cond_0 */
/* .line 44 */
/* const v0, 0x3fb33333 # 1.4f */
/* iput v0, p0, Lde/nurogames/android/ticb/base/objects/objCloud;->mCLOUD_SPEED:F */
} // .end method
/* # virtual methods */
public void animate ( ) {
/* .locals 4 */
/* .prologue */
/* .line 59 */
/* iget v0, p0, Lde/nurogames/android/ticb/base/objects/objCloud;->mX:F */
/* iget v1, p0, Lde/nurogames/android/ticb/base/objects/objCloud;->mCLOUD_SPEED:F */
v2 = de.nurogames.android.ticb.base.objects.objBee.playerVel;
/* iget v2, v2, Lde/nurogames/android/ticb/base/core/Vector3D;->x:F */
/* const/high16 v3, 0x40000000 # 2.0f */
/* div-float/2addr v2, v3 */
/* add-float/2addr v1, v2 */
/* sub-float/2addr v0, v1 */
/* iput v0, p0, Lde/nurogames/android/ticb/base/objects/objCloud;->mX:F */
/* .line 62 */
/* iget v0, p0, Lde/nurogames/android/ticb/base/objects/objCloud;->mX:F */
/* const/high16 v1, -0x3cb80000 # -200.0f */
/* cmpg-float v0, v0, v1 */
/* if-gez v0, :cond_0 */
/* .line 63 */
v1 = this.rnd;
/* iget v2, p0, Lde/nurogames/android/ticb/base/objects/objCloud;->dXTwice:I */
v1 = (( java.util.Random ) v1 ).nextInt ( v2 ); // invoke-virtual {v1, v2}, Ljava/util/Random;->nextInt(I)I
/* add-int/2addr v0, v1 */
/* int-to-float v0, v0 */
/* iput v0, p0, Lde/nurogames/android/ticb/base/objects/objCloud;->mX:F */
/* .line 64 */
/* iget v0, p0, Lde/nurogames/android/ticb/base/objects/objCloud;->mH:I */
v1 = this.rnd;
/* const/16 v2, 0x64 */
v1 = (( java.util.Random ) v1 ).nextInt ( v2 ); // invoke-virtual {v1, v2}, Ljava/util/Random;->nextInt(I)I
/* add-int/2addr v0, v1 */
/* iput v0, p0, Lde/nurogames/android/ticb/base/objects/objCloud;->mY:I */
/* .line 66 */
} // :cond_0
return;
} // .end method
public void onDraw ( android.graphics.Canvas p0 ) {
/* .locals 4 */
/* .param p1, "g" # Landroid/graphics/Canvas; */
/* .prologue */
/* .line 50 */
/* .line 51 */
v0 = de.nurogames.android.ticb.base.core.AppResources.imgCloud;
/* iget v1, p0, Lde/nurogames/android/ticb/base/objects/objCloud;->mType:I */
/* aget-object v0, v0, v1 */
/* .line 52 */
/* iget v1, p0, Lde/nurogames/android/ticb/base/objects/objCloud;->mX:F */
/* iget v2, p0, Lde/nurogames/android/ticb/base/objects/objCloud;->mY:I */
/* int-to-float v2, v2 */
int v3 = 0; // const/4 v3, 0x0
/* .line 50 */
(( android.graphics.Canvas ) p1 ).drawBitmap ( v0, v1, v2, v3 ); // invoke-virtual {p1, v0, v1, v2, v3}, Landroid/graphics/Canvas;->drawBitmap(Landroid/graphics/Bitmap;FFLandroid/graphics/Paint;)V
/* .line 54 */
return;
} // .end method
