public class de.nurogames.android.ticb.base.objects.objDifficultyChooser {
	 /* .source "objDifficultyChooser.java" */
	 /* # static fields */
	 public static de.nurogames.android.ticb.base.objects.objMenuButton cancel;
	 public static de.nurogames.android.ticb.base.objects.objMenuButton easy;
	 public static de.nurogames.android.ticb.base.objects.objMenuButton hard;
	 public static Integer mX;
	 public static Integer mY;
	 public static de.nurogames.android.ticb.base.objects.objMenuButton normal;
	 /* # instance fields */
	 private android.graphics.Bitmap BG;
	 private android.graphics.Paint mPaint;
	 /* # direct methods */
	 public de.nurogames.android.ticb.base.objects.objDifficultyChooser ( ) {
		 /* .locals 9 */
		 /* .param p1, "x" # I */
		 /* .param p2, "y" # I */
		 /* .param p3, "imgBG" # Landroid/graphics/Bitmap; */
		 /* .prologue */
		 /* const v8, 0x3d8f5c29 # 0.07f */
		 int v7 = 1; // const/4 v7, 0x1
		 int v6 = 0; // const/4 v6, 0x0
		 /* .line 26 */
		 /* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
		 /* .line 22 */
		 /* new-instance v0, Landroid/graphics/Paint; */
		 /* invoke-direct {v0}, Landroid/graphics/Paint;-><init>()V */
		 this.mPaint = v0;
		 /* .line 28 */
		 /* .line 29 */
		 /* .line 31 */
		 this.BG = p3;
		 /* .line 33 */
		 v0 = this.mPaint;
		 /* const/16 v1, 0xa2 */
		 (( android.graphics.Paint ) v0 ).setAlpha ( v1 ); // invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setAlpha(I)V
		 /* .line 35 */
		 /* new-instance v0, Lde/nurogames/android/ticb/base/objects/objMenuButton; */
		 final String v1 = ""; // const-string v1, ""
		 /* .line 36 */
		 /* int-to-float v2, v2 */
		 v3 = this.BG;
		 v3 = 		 (( android.graphics.Bitmap ) v3 ).getWidth ( ); // invoke-virtual {v3}, Landroid/graphics/Bitmap;->getWidth()I
		 /* int-to-float v3, v3 */
		 /* const/high16 v4, 0x3ec00000 # 0.375f */
		 /* mul-float/2addr v3, v4 */
		 /* sub-float/2addr v2, v3 */
		 /* float-to-int v2, v2 */
		 /* .line 37 */
		 /* int-to-float v3, v3 */
		 v4 = this.BG;
		 v4 = 		 (( android.graphics.Bitmap ) v4 ).getHeight ( ); // invoke-virtual {v4}, Landroid/graphics/Bitmap;->getHeight()I
		 /* int-to-float v4, v4 */
		 /* mul-float/2addr v4, v8 */
		 /* add-float/2addr v3, v4 */
		 /* float-to-int v3, v3 */
		 /* .line 38 */
		 v4 = de.nurogames.android.ticb.base.core.AppResources.imgMenu_cancel;
		 /* aget-object v4, v4, v6 */
		 /* .line 39 */
		 v5 = de.nurogames.android.ticb.base.core.AppResources.imgMenu_cancel;
		 /* aget-object v5, v5, v7 */
		 /* .line 35 */
		 /* invoke-direct/range {v0 ..v5}, Lde/nurogames/android/ticb/base/objects/objMenuButton;-><init>(Ljava/lang/String;IILandroid/graphics/Bitmap;Landroid/graphics/Bitmap;)V */
		 /* .line 41 */
		 /* new-instance v0, Lde/nurogames/android/ticb/base/objects/objMenuButton; */
		 final String v1 = ""; // const-string v1, ""
		 /* .line 42 */
		 /* int-to-float v2, v2 */
		 v3 = this.BG;
		 v3 = 		 (( android.graphics.Bitmap ) v3 ).getWidth ( ); // invoke-virtual {v3}, Landroid/graphics/Bitmap;->getWidth()I
		 /* int-to-float v3, v3 */
		 /* const v4, 0x3d4ccccd # 0.05f */
		 /* mul-float/2addr v3, v4 */
		 /* sub-float/2addr v2, v3 */
		 /* float-to-int v2, v2 */
		 /* .line 43 */
		 /* int-to-float v3, v3 */
		 v4 = this.BG;
		 v4 = 		 (( android.graphics.Bitmap ) v4 ).getHeight ( ); // invoke-virtual {v4}, Landroid/graphics/Bitmap;->getHeight()I
		 /* int-to-float v4, v4 */
		 /* mul-float/2addr v4, v8 */
		 /* add-float/2addr v3, v4 */
		 /* float-to-int v3, v3 */
		 /* .line 44 */
		 v4 = de.nurogames.android.ticb.base.core.AppResources.imgMenu_cancel;
		 /* aget-object v4, v4, v6 */
		 /* .line 45 */
		 v5 = de.nurogames.android.ticb.base.core.AppResources.imgMenu_cancel;
		 /* aget-object v5, v5, v7 */
		 /* .line 41 */
		 /* invoke-direct/range {v0 ..v5}, Lde/nurogames/android/ticb/base/objects/objMenuButton;-><init>(Ljava/lang/String;IILandroid/graphics/Bitmap;Landroid/graphics/Bitmap;)V */
		 /* .line 47 */
		 /* new-instance v0, Lde/nurogames/android/ticb/base/objects/objMenuButton; */
		 final String v1 = ""; // const-string v1, ""
		 /* .line 48 */
		 /* int-to-float v2, v2 */
		 v3 = this.BG;
		 v3 = 		 (( android.graphics.Bitmap ) v3 ).getWidth ( ); // invoke-virtual {v3}, Landroid/graphics/Bitmap;->getWidth()I
		 /* int-to-float v3, v3 */
		 /* const/high16 v4, 0x3e800000 # 0.25f */
		 /* mul-float/2addr v3, v4 */
		 /* add-float/2addr v2, v3 */
		 /* float-to-int v2, v2 */
		 /* .line 49 */
		 /* int-to-float v3, v3 */
		 v4 = this.BG;
		 v4 = 		 (( android.graphics.Bitmap ) v4 ).getHeight ( ); // invoke-virtual {v4}, Landroid/graphics/Bitmap;->getHeight()I
		 /* int-to-float v4, v4 */
		 /* mul-float/2addr v4, v8 */
		 /* add-float/2addr v3, v4 */
		 /* float-to-int v3, v3 */
		 /* .line 50 */
		 v4 = de.nurogames.android.ticb.base.core.AppResources.imgMenu_cancel;
		 /* aget-object v4, v4, v6 */
		 /* .line 51 */
		 v5 = de.nurogames.android.ticb.base.core.AppResources.imgMenu_cancel;
		 /* aget-object v5, v5, v7 */
		 /* .line 47 */
		 /* invoke-direct/range {v0 ..v5}, Lde/nurogames/android/ticb/base/objects/objMenuButton;-><init>(Ljava/lang/String;IILandroid/graphics/Bitmap;Landroid/graphics/Bitmap;)V */
		 /* .line 53 */
		 /* new-instance v0, Lde/nurogames/android/ticb/base/objects/objMenuButton; */
		 final String v1 = ""; // const-string v1, ""
		 /* .line 54 */
		 /* int-to-float v2, v2 */
		 v3 = this.BG;
		 v3 = 		 (( android.graphics.Bitmap ) v3 ).getWidth ( ); // invoke-virtual {v3}, Landroid/graphics/Bitmap;->getWidth()I
		 /* int-to-float v3, v3 */
		 /* const v4, 0x3e99999a # 0.3f */
		 /* mul-float/2addr v3, v4 */
		 /* add-float/2addr v2, v3 */
		 /* float-to-int v2, v2 */
		 /* .line 55 */
		 /* int-to-float v3, v3 */
		 v4 = this.BG;
		 v4 = 		 (( android.graphics.Bitmap ) v4 ).getHeight ( ); // invoke-virtual {v4}, Landroid/graphics/Bitmap;->getHeight()I
		 /* int-to-float v4, v4 */
		 /* const v5, 0x3ef0a3d7 # 0.47f */
		 /* mul-float/2addr v4, v5 */
		 /* sub-float/2addr v3, v4 */
		 /* float-to-int v3, v3 */
		 /* .line 56 */
		 v4 = de.nurogames.android.ticb.base.core.AppResources.imgMenu_cancel;
		 /* aget-object v4, v4, v6 */
		 /* .line 57 */
		 v5 = de.nurogames.android.ticb.base.core.AppResources.imgMenu_cancel;
		 /* aget-object v5, v5, v7 */
		 /* .line 53 */
		 /* invoke-direct/range {v0 ..v5}, Lde/nurogames/android/ticb/base/objects/objMenuButton;-><init>(Ljava/lang/String;IILandroid/graphics/Bitmap;Landroid/graphics/Bitmap;)V */
		 /* .line 59 */
		 return;
	 } // .end method
	 /* # virtual methods */
	 public void onDraw ( android.graphics.Canvas p0 ) {
		 /* .locals 6 */
		 /* .param p1, "g" # Landroid/graphics/Canvas; */
		 /* .prologue */
		 int v1 = 0; // const/4 v1, 0x0
		 /* .line 63 */
		 /* int-to-float v3, v0 */
		 /* int-to-float v4, v0 */
		 v5 = this.mPaint;
		 /* move-object v0, p1 */
		 /* move v2, v1 */
		 /* invoke-virtual/range {v0 ..v5}, Landroid/graphics/Canvas;->drawRect(FFFFLandroid/graphics/Paint;)V */
		 /* .line 66 */
		 v0 = this.BG;
		 /* .line 67 */
		 v2 = this.BG;
		 v2 = 		 (( android.graphics.Bitmap ) v2 ).getWidth ( ); // invoke-virtual {v2}, Landroid/graphics/Bitmap;->getWidth()I
		 /* div-int/lit8 v2, v2, 0x2 */
		 /* sub-int/2addr v1, v2 */
		 /* int-to-float v1, v1 */
		 /* .line 68 */
		 v3 = this.BG;
		 v3 = 		 (( android.graphics.Bitmap ) v3 ).getHeight ( ); // invoke-virtual {v3}, Landroid/graphics/Bitmap;->getHeight()I
		 /* div-int/lit8 v3, v3, 0x2 */
		 /* sub-int/2addr v2, v3 */
		 /* int-to-float v2, v2 */
		 /* .line 69 */
		 int v3 = 0; // const/4 v3, 0x0
		 /* .line 65 */
		 (( android.graphics.Canvas ) p1 ).drawBitmap ( v0, v1, v2, v3 ); // invoke-virtual {p1, v0, v1, v2, v3}, Landroid/graphics/Canvas;->drawBitmap(Landroid/graphics/Bitmap;FFLandroid/graphics/Paint;)V
		 /* .line 71 */
		 return;
	 } // .end method
