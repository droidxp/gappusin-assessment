public class de.nurogames.android.ticb.base.objects.objGameStartCounter {
	 /* .source "objGameStartCounter.java" */
	 /* # instance fields */
	 private Integer idx;
	 private final Integer tick;
	 public Integer timeLeftMS;
	 /* # direct methods */
	 public de.nurogames.android.ticb.base.objects.objGameStartCounter ( ) {
		 /* .locals 1 */
		 /* .prologue */
		 /* .line 7 */
		 /* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
		 /* .line 9 */
		 /* const/16 v0, 0xbb8 */
		 /* iput v0, p0, Lde/nurogames/android/ticb/base/objects/objGameStartCounter;->timeLeftMS:I */
		 /* .line 10 */
		 /* const/16 v0, 0x3cf */
		 /* iput v0, p0, Lde/nurogames/android/ticb/base/objects/objGameStartCounter;->tick:I */
		 /* .line 7 */
		 return;
	 } // .end method
	 /* # virtual methods */
	 public void TimeShown ( Integer p0 ) {
		 /* .locals 2 */
		 /* .param p1, "value" # I */
		 /* .prologue */
		 /* .line 27 */
		 /* iget v0, p0, Lde/nurogames/android/ticb/base/objects/objGameStartCounter;->timeLeftMS:I */
		 /* sub-int/2addr v0, p1 */
		 /* iput v0, p0, Lde/nurogames/android/ticb/base/objects/objGameStartCounter;->timeLeftMS:I */
		 /* .line 28 */
		 /* iget v0, p0, Lde/nurogames/android/ticb/base/objects/objGameStartCounter;->timeLeftMS:I */
		 /* rem-int/lit16 v0, v0, 0x3e8 */
		 /* const/16 v1, 0x3cf */
		 /* if-lt v0, v1, :cond_0 */
		 /* .line 29 */
		 de.nurogames.android.ticb.base.core.AppResources .playSFX ( v0 );
		 /* .line 30 */
	 } // :cond_0
	 /* iget v0, p0, Lde/nurogames/android/ticb/base/objects/objGameStartCounter;->timeLeftMS:I */
	 /* add-int/lit8 v0, v0, -0x1 */
	 /* div-int/lit16 v0, v0, 0x3e8 */
	 /* iput v0, p0, Lde/nurogames/android/ticb/base/objects/objGameStartCounter;->idx:I */
	 /* .line 31 */
	 return;
} // .end method
public void onDraw ( android.graphics.Canvas p0 ) {
	 /* .locals 5 */
	 /* .param p1, "g" # Landroid/graphics/Canvas; */
	 /* .prologue */
	 /* .line 19 */
	 /* .line 20 */
	 v0 = de.nurogames.android.ticb.base.core.AppResources.imgCountDown;
	 /* iget v1, p0, Lde/nurogames/android/ticb/base/objects/objGameStartCounter;->idx:I */
	 /* aget-object v0, v0, v1 */
	 /* .line 21 */
	 v2 = de.nurogames.android.ticb.base.core.AppResources.imgCountDown;
	 /* iget v3, p0, Lde/nurogames/android/ticb/base/objects/objGameStartCounter;->idx:I */
	 /* aget-object v2, v2, v3 */
	 v2 = 	 (( android.graphics.Bitmap ) v2 ).getWidth ( ); // invoke-virtual {v2}, Landroid/graphics/Bitmap;->getWidth()I
	 /* div-int/lit8 v2, v2, 0x2 */
	 /* sub-int/2addr v1, v2 */
	 /* int-to-float v1, v1 */
	 /* .line 22 */
	 v3 = de.nurogames.android.ticb.base.core.AppResources.imgCountDown;
	 /* iget v4, p0, Lde/nurogames/android/ticb/base/objects/objGameStartCounter;->idx:I */
	 /* aget-object v3, v3, v4 */
	 v3 = 	 (( android.graphics.Bitmap ) v3 ).getHeight ( ); // invoke-virtual {v3}, Landroid/graphics/Bitmap;->getHeight()I
	 /* div-int/lit8 v3, v3, 0x2 */
	 /* sub-int/2addr v2, v3 */
	 /* int-to-float v2, v2 */
	 /* .line 23 */
	 int v3 = 0; // const/4 v3, 0x0
	 /* .line 19 */
	 (( android.graphics.Canvas ) p1 ).drawBitmap ( v0, v1, v2, v3 ); // invoke-virtual {p1, v0, v1, v2, v3}, Landroid/graphics/Canvas;->drawBitmap(Landroid/graphics/Bitmap;FFLandroid/graphics/Paint;)V
	 /* .line 24 */
	 return;
} // .end method
