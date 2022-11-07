public class de.nurogames.android.ticb.base.objects.objHoneyDrop {
	 /* .source "objHoneyDrop.java" */
	 /* # instance fields */
	 public Integer dropType;
	 public Integer mH;
	 public Integer mW;
	 public Integer mX;
	 private Integer mXM;
	 public Integer mY;
	 private Integer mYM;
	 private Integer x;
	 private Integer y;
	 /* # direct methods */
	 public de.nurogames.android.ticb.base.objects.objHoneyDrop ( ) {
		 /* .locals 2 */
		 /* .param p1, "x" # I */
		 /* .param p2, "y" # I */
		 /* .param p3, "type" # I */
		 /* .prologue */
		 /* .line 22 */
		 /* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
		 /* .line 24 */
		 /* iput p3, p0, Lde/nurogames/android/ticb/base/objects/objHoneyDrop;->dropType:I */
		 /* .line 26 */
		 /* iput p1, p0, Lde/nurogames/android/ticb/base/objects/objHoneyDrop;->mX:I */
		 /* .line 27 */
		 /* iput p2, p0, Lde/nurogames/android/ticb/base/objects/objHoneyDrop;->mY:I */
		 /* .line 29 */
		 v0 = de.nurogames.android.ticb.base.core.AppResources.imgHoneyDot;
		 /* iget v1, p0, Lde/nurogames/android/ticb/base/objects/objHoneyDrop;->dropType:I */
		 /* aget-object v0, v0, v1 */
		 v0 = 		 (( android.graphics.Bitmap ) v0 ).getWidth ( ); // invoke-virtual {v0}, Landroid/graphics/Bitmap;->getWidth()I
		 /* div-int/lit8 v0, v0, 0x2 */
		 /* iput v0, p0, Lde/nurogames/android/ticb/base/objects/objHoneyDrop;->mXM:I */
		 /* .line 30 */
		 v0 = de.nurogames.android.ticb.base.core.AppResources.imgHoneyDot;
		 /* iget v1, p0, Lde/nurogames/android/ticb/base/objects/objHoneyDrop;->dropType:I */
		 /* aget-object v0, v0, v1 */
		 v0 = 		 (( android.graphics.Bitmap ) v0 ).getHeight ( ); // invoke-virtual {v0}, Landroid/graphics/Bitmap;->getHeight()I
		 /* div-int/lit8 v0, v0, 0x2 */
		 /* iput v0, p0, Lde/nurogames/android/ticb/base/objects/objHoneyDrop;->mYM:I */
		 /* .line 32 */
		 v0 = de.nurogames.android.ticb.base.core.AppResources.imgHoneyDot;
		 /* iget v1, p0, Lde/nurogames/android/ticb/base/objects/objHoneyDrop;->dropType:I */
		 /* aget-object v0, v0, v1 */
		 v0 = 		 (( android.graphics.Bitmap ) v0 ).getWidth ( ); // invoke-virtual {v0}, Landroid/graphics/Bitmap;->getWidth()I
		 /* iput v0, p0, Lde/nurogames/android/ticb/base/objects/objHoneyDrop;->mW:I */
		 /* .line 33 */
		 v0 = de.nurogames.android.ticb.base.core.AppResources.imgHoneyDot;
		 /* iget v1, p0, Lde/nurogames/android/ticb/base/objects/objHoneyDrop;->dropType:I */
		 /* aget-object v0, v0, v1 */
		 v0 = 		 (( android.graphics.Bitmap ) v0 ).getHeight ( ); // invoke-virtual {v0}, Landroid/graphics/Bitmap;->getHeight()I
		 /* iput v0, p0, Lde/nurogames/android/ticb/base/objects/objHoneyDrop;->mH:I */
		 /* .line 35 */
		 /* iget v0, p0, Lde/nurogames/android/ticb/base/objects/objHoneyDrop;->mX:I */
		 /* iget v1, p0, Lde/nurogames/android/ticb/base/objects/objHoneyDrop;->mXM:I */
		 /* sub-int/2addr v0, v1 */
		 /* iput v0, p0, Lde/nurogames/android/ticb/base/objects/objHoneyDrop;->x:I */
		 /* .line 36 */
		 /* iget v0, p0, Lde/nurogames/android/ticb/base/objects/objHoneyDrop;->mY:I */
		 /* iget v1, p0, Lde/nurogames/android/ticb/base/objects/objHoneyDrop;->mYM:I */
		 /* sub-int/2addr v0, v1 */
		 /* iput v0, p0, Lde/nurogames/android/ticb/base/objects/objHoneyDrop;->y:I */
		 /* .line 37 */
		 return;
	 } // .end method
	 /* # virtual methods */
	 public void onDraw ( android.graphics.Canvas p0 ) {
		 /* .locals 4 */
		 /* .param p1, "g" # Landroid/graphics/Canvas; */
		 /* .prologue */
		 /* .line 41 */
		 /* .line 42 */
		 v0 = de.nurogames.android.ticb.base.core.AppResources.imgHoneyDot;
		 /* iget v1, p0, Lde/nurogames/android/ticb/base/objects/objHoneyDrop;->dropType:I */
		 /* aget-object v0, v0, v1 */
		 /* .line 43 */
		 /* iget v1, p0, Lde/nurogames/android/ticb/base/objects/objHoneyDrop;->x:I */
		 /* int-to-float v1, v1 */
		 /* .line 44 */
		 /* iget v2, p0, Lde/nurogames/android/ticb/base/objects/objHoneyDrop;->y:I */
		 /* int-to-float v2, v2 */
		 /* .line 45 */
		 int v3 = 0; // const/4 v3, 0x0
		 /* .line 41 */
		 (( android.graphics.Canvas ) p1 ).drawBitmap ( v0, v1, v2, v3 ); // invoke-virtual {p1, v0, v1, v2, v3}, Landroid/graphics/Canvas;->drawBitmap(Landroid/graphics/Bitmap;FFLandroid/graphics/Paint;)V
		 /* .line 47 */
		 return;
	 } // .end method
