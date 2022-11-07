public class de.nurogames.android.ticb.base.objects.objPollem {
	 /* .source "objPollem.java" */
	 /* # instance fields */
	 public Integer mH;
	 public Integer mW;
	 public Float mX;
	 public Float mY;
	 /* # direct methods */
	 public de.nurogames.android.ticb.base.objects.objPollem ( ) {
		 /* .locals 1 */
		 /* .param p1, "x" # F */
		 /* .param p2, "y" # F */
		 /* .prologue */
		 /* .line 14 */
		 /* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
		 /* .line 16 */
		 v0 = de.nurogames.android.ticb.base.core.AppResources.imgPolle;
		 v0 = 		 (( android.graphics.Bitmap ) v0 ).getWidth ( ); // invoke-virtual {v0}, Landroid/graphics/Bitmap;->getWidth()I
		 /* div-int/lit8 v0, v0, 0x2 */
		 /* int-to-float v0, v0 */
		 /* sub-float v0, p1, v0 */
		 /* iput v0, p0, Lde/nurogames/android/ticb/base/objects/objPollem;->mX:F */
		 /* .line 17 */
		 v0 = de.nurogames.android.ticb.base.core.AppResources.imgPolle;
		 v0 = 		 (( android.graphics.Bitmap ) v0 ).getHeight ( ); // invoke-virtual {v0}, Landroid/graphics/Bitmap;->getHeight()I
		 /* div-int/lit8 v0, v0, 0x2 */
		 /* int-to-float v0, v0 */
		 /* sub-float v0, p2, v0 */
		 /* iput v0, p0, Lde/nurogames/android/ticb/base/objects/objPollem;->mY:F */
		 /* .line 19 */
		 v0 = de.nurogames.android.ticb.base.core.AppResources.imgPolle;
		 v0 = 		 (( android.graphics.Bitmap ) v0 ).getWidth ( ); // invoke-virtual {v0}, Landroid/graphics/Bitmap;->getWidth()I
		 /* iput v0, p0, Lde/nurogames/android/ticb/base/objects/objPollem;->mW:I */
		 /* .line 20 */
		 v0 = de.nurogames.android.ticb.base.core.AppResources.imgPolle;
		 v0 = 		 (( android.graphics.Bitmap ) v0 ).getHeight ( ); // invoke-virtual {v0}, Landroid/graphics/Bitmap;->getHeight()I
		 /* iput v0, p0, Lde/nurogames/android/ticb/base/objects/objPollem;->mH:I */
		 /* .line 22 */
		 return;
	 } // .end method
	 /* # virtual methods */
	 public void onDraw ( android.graphics.Canvas p0 ) {
		 /* .locals 4 */
		 /* .param p1, "g" # Landroid/graphics/Canvas; */
		 /* .prologue */
		 /* .line 26 */
		 /* .line 27 */
		 v0 = de.nurogames.android.ticb.base.core.AppResources.imgPolle;
		 /* .line 28 */
		 /* iget v1, p0, Lde/nurogames/android/ticb/base/objects/objPollem;->mX:F */
		 /* iget v2, p0, Lde/nurogames/android/ticb/base/objects/objPollem;->mY:F */
		 /* .line 29 */
		 int v3 = 0; // const/4 v3, 0x0
		 /* .line 26 */
		 (( android.graphics.Canvas ) p1 ).drawBitmap ( v0, v1, v2, v3 ); // invoke-virtual {p1, v0, v1, v2, v3}, Landroid/graphics/Canvas;->drawBitmap(Landroid/graphics/Bitmap;FFLandroid/graphics/Paint;)V
		 /* .line 31 */
		 return;
	 } // .end method
