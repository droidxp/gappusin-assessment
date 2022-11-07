public class de.nurogames.android.ticb.base.objects.objPopUpDialog {
	 /* .source "objPopUpDialog.java" */
	 /* # static fields */
	 public static de.nurogames.android.ticb.base.objects.objMenuButton no;
	 public static de.nurogames.android.ticb.base.objects.objMenuButton yes;
	 /* # instance fields */
	 private android.graphics.Bitmap BG;
	 private android.graphics.Paint mPaint;
	 /* # direct methods */
	 public de.nurogames.android.ticb.base.objects.objPopUpDialog ( ) {
		 /* .locals 9 */
		 /* .param p1, "x" # I */
		 /* .param p2, "y" # I */
		 /* .param p3, "imgBG" # Landroid/graphics/Bitmap; */
		 /* .prologue */
		 int v8 = 1; // const/4 v8, 0x1
		 int v7 = 0; // const/4 v7, 0x0
		 /* const v6, 0x3db851ec # 0.09f */
		 /* .line 21 */
		 /* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
		 /* .line 17 */
		 /* new-instance v0, Landroid/graphics/Paint; */
		 /* invoke-direct {v0}, Landroid/graphics/Paint;-><init>()V */
		 this.mPaint = v0;
		 /* .line 23 */
		 this.BG = p3;
		 /* .line 25 */
		 /* new-instance v0, Lde/nurogames/android/ticb/base/objects/objMenuButton; */
		 final String v1 = ""; // const-string v1, ""
		 /* .line 26 */
		 /* int-to-float v2, v2 */
		 v3 = this.BG;
		 v3 = 		 (( android.graphics.Bitmap ) v3 ).getWidth ( ); // invoke-virtual {v3}, Landroid/graphics/Bitmap;->getWidth()I
		 /* int-to-float v3, v3 */
		 /* const/high16 v4, 0x3ec00000 # 0.375f */
		 /* mul-float/2addr v3, v4 */
		 /* sub-float/2addr v2, v3 */
		 /* float-to-int v2, v2 */
		 /* .line 27 */
		 /* int-to-float v3, v3 */
		 v4 = this.BG;
		 v4 = 		 (( android.graphics.Bitmap ) v4 ).getHeight ( ); // invoke-virtual {v4}, Landroid/graphics/Bitmap;->getHeight()I
		 /* int-to-float v4, v4 */
		 /* const v5, 0x3d8f5c29 # 0.07f */
		 /* mul-float/2addr v4, v5 */
		 /* add-float/2addr v3, v4 */
		 /* float-to-int v3, v3 */
		 /* .line 28 */
		 v4 = de.nurogames.android.ticb.base.core.AppResources.imgMenu_ok;
		 /* aget-object v4, v4, v7 */
		 /* .line 29 */
		 v5 = de.nurogames.android.ticb.base.core.AppResources.imgMenu_ok;
		 /* aget-object v5, v5, v8 */
		 /* .line 25 */
		 /* invoke-direct/range {v0 ..v5}, Lde/nurogames/android/ticb/base/objects/objMenuButton;-><init>(Ljava/lang/String;IILandroid/graphics/Bitmap;Landroid/graphics/Bitmap;)V */
		 /* .line 31 */
		 /* new-instance v0, Lde/nurogames/android/ticb/base/objects/objMenuButton; */
		 final String v1 = ""; // const-string v1, ""
		 /* .line 32 */
		 /* int-to-float v2, v2 */
		 v3 = this.BG;
		 v3 = 		 (( android.graphics.Bitmap ) v3 ).getWidth ( ); // invoke-virtual {v3}, Landroid/graphics/Bitmap;->getWidth()I
		 /* int-to-float v3, v3 */
		 /* mul-float/2addr v3, v6 */
		 /* add-float/2addr v2, v3 */
		 /* float-to-int v2, v2 */
		 /* .line 33 */
		 /* int-to-float v3, v3 */
		 v4 = this.BG;
		 v4 = 		 (( android.graphics.Bitmap ) v4 ).getHeight ( ); // invoke-virtual {v4}, Landroid/graphics/Bitmap;->getHeight()I
		 /* int-to-float v4, v4 */
		 /* mul-float/2addr v4, v6 */
		 /* add-float/2addr v3, v4 */
		 /* float-to-int v3, v3 */
		 /* .line 34 */
		 v4 = de.nurogames.android.ticb.base.core.AppResources.imgMenu_cancel;
		 /* aget-object v4, v4, v7 */
		 /* .line 35 */
		 v5 = de.nurogames.android.ticb.base.core.AppResources.imgMenu_cancel;
		 /* aget-object v5, v5, v8 */
		 /* .line 31 */
		 /* invoke-direct/range {v0 ..v5}, Lde/nurogames/android/ticb/base/objects/objMenuButton;-><init>(Ljava/lang/String;IILandroid/graphics/Bitmap;Landroid/graphics/Bitmap;)V */
		 /* .line 37 */
		 return;
	 } // .end method
	 /* # virtual methods */
	 public void onDraw ( android.graphics.Canvas p0 ) {
		 /* .locals 6 */
		 /* .param p1, "g" # Landroid/graphics/Canvas; */
		 /* .prologue */
		 int v1 = 0; // const/4 v1, 0x0
		 /* .line 41 */
		 v0 = this.mPaint;
		 /* const/16 v2, 0x8e */
		 (( android.graphics.Paint ) v0 ).setAlpha ( v2 ); // invoke-virtual {v0, v2}, Landroid/graphics/Paint;->setAlpha(I)V
		 /* .line 42 */
		 /* int-to-float v3, v0 */
		 /* int-to-float v4, v0 */
		 v5 = this.mPaint;
		 /* move-object v0, p1 */
		 /* move v2, v1 */
		 /* invoke-virtual/range {v0 ..v5}, Landroid/graphics/Canvas;->drawRect(FFFFLandroid/graphics/Paint;)V */
		 /* .line 44 */
		 v0 = this.mPaint;
		 /* const/16 v1, 0xff */
		 (( android.graphics.Paint ) v0 ).setAlpha ( v1 ); // invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setAlpha(I)V
		 /* .line 46 */
		 v0 = this.BG;
		 /* .line 47 */
		 v2 = this.BG;
		 v2 = 		 (( android.graphics.Bitmap ) v2 ).getWidth ( ); // invoke-virtual {v2}, Landroid/graphics/Bitmap;->getWidth()I
		 /* div-int/lit8 v2, v2, 0x2 */
		 /* sub-int/2addr v1, v2 */
		 /* int-to-float v1, v1 */
		 /* .line 48 */
		 v3 = this.BG;
		 v3 = 		 (( android.graphics.Bitmap ) v3 ).getHeight ( ); // invoke-virtual {v3}, Landroid/graphics/Bitmap;->getHeight()I
		 /* div-int/lit8 v3, v3, 0x2 */
		 /* sub-int/2addr v2, v3 */
		 /* int-to-float v2, v2 */
		 /* .line 49 */
		 int v3 = 0; // const/4 v3, 0x0
		 /* .line 45 */
		 (( android.graphics.Canvas ) p1 ).drawBitmap ( v0, v1, v2, v3 ); // invoke-virtual {p1, v0, v1, v2, v3}, Landroid/graphics/Canvas;->drawBitmap(Landroid/graphics/Bitmap;FFLandroid/graphics/Paint;)V
		 /* .line 51 */
		 v0 = de.nurogames.android.ticb.base.objects.objPopUpDialog.yes;
		 (( de.nurogames.android.ticb.base.objects.objMenuButton ) v0 ).onDraw ( p1 ); // invoke-virtual {v0, p1}, Lde/nurogames/android/ticb/base/objects/objMenuButton;->onDraw(Landroid/graphics/Canvas;)V
		 /* .line 52 */
		 v0 = de.nurogames.android.ticb.base.objects.objPopUpDialog.no;
		 (( de.nurogames.android.ticb.base.objects.objMenuButton ) v0 ).onDraw ( p1 ); // invoke-virtual {v0, p1}, Lde/nurogames/android/ticb/base/objects/objMenuButton;->onDraw(Landroid/graphics/Canvas;)V
		 /* .line 54 */
		 return;
	 } // .end method
