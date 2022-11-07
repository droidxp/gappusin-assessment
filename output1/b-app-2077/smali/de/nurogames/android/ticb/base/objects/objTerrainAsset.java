public class de.nurogames.android.ticb.base.objects.objTerrainAsset {
	 /* .source "objTerrainAsset.java" */
	 /* # instance fields */
	 public Integer mH;
	 public Integer mW;
	 public Float mX;
	 public Float mY;
	 public Integer objType;
	 /* # direct methods */
	 public de.nurogames.android.ticb.base.objects.objTerrainAsset ( ) {
		 /* .locals 2 */
		 /* .param p1, "x" # F */
		 /* .param p2, "y" # F */
		 /* .param p3, "type" # I */
		 /* .prologue */
		 /* .line 19 */
		 /* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
		 /* .line 21 */
		 /* iput p3, p0, Lde/nurogames/android/ticb/base/objects/objTerrainAsset;->objType:I */
		 /* .line 23 */
		 v0 = de.nurogames.android.ticb.base.core.AppResources.imgLevelAsset;
		 v1 = de.nurogames.android.ticb.base.views.TinyBeeView.terrain;
		 /* iget v1, v1, Lde/nurogames/android/ticb/base/objects/objTerrainMap;->checkpoints:I */
		 /* aget-object v0, v0, v1 */
		 /* iget v1, p0, Lde/nurogames/android/ticb/base/objects/objTerrainAsset;->objType:I */
		 /* aget-object v0, v0, v1 */
		 v0 = 		 (( android.graphics.Bitmap ) v0 ).getWidth ( ); // invoke-virtual {v0}, Landroid/graphics/Bitmap;->getWidth()I
		 /* div-int/lit8 v0, v0, 0x2 */
		 /* int-to-float v0, v0 */
		 /* sub-float v0, p1, v0 */
		 /* iput v0, p0, Lde/nurogames/android/ticb/base/objects/objTerrainAsset;->mX:F */
		 /* .line 24 */
		 v0 = de.nurogames.android.ticb.base.core.AppResources.imgLevelAsset;
		 v1 = de.nurogames.android.ticb.base.views.TinyBeeView.terrain;
		 /* iget v1, v1, Lde/nurogames/android/ticb/base/objects/objTerrainMap;->checkpoints:I */
		 /* aget-object v0, v0, v1 */
		 /* iget v1, p0, Lde/nurogames/android/ticb/base/objects/objTerrainAsset;->objType:I */
		 /* aget-object v0, v0, v1 */
		 v0 = 		 (( android.graphics.Bitmap ) v0 ).getHeight ( ); // invoke-virtual {v0}, Landroid/graphics/Bitmap;->getHeight()I
		 /* int-to-float v0, v0 */
		 /* const/high16 v1, 0x3f400000 # 0.75f */
		 /* mul-float/2addr v0, v1 */
		 /* sub-float v0, p2, v0 */
		 /* iput v0, p0, Lde/nurogames/android/ticb/base/objects/objTerrainAsset;->mY:F */
		 /* .line 26 */
		 v0 = de.nurogames.android.ticb.base.core.AppResources.imgLevelAsset;
		 v1 = de.nurogames.android.ticb.base.views.TinyBeeView.terrain;
		 /* iget v1, v1, Lde/nurogames/android/ticb/base/objects/objTerrainMap;->checkpoints:I */
		 /* aget-object v0, v0, v1 */
		 /* iget v1, p0, Lde/nurogames/android/ticb/base/objects/objTerrainAsset;->objType:I */
		 /* aget-object v0, v0, v1 */
		 v0 = 		 (( android.graphics.Bitmap ) v0 ).getWidth ( ); // invoke-virtual {v0}, Landroid/graphics/Bitmap;->getWidth()I
		 /* iput v0, p0, Lde/nurogames/android/ticb/base/objects/objTerrainAsset;->mW:I */
		 /* .line 27 */
		 v0 = de.nurogames.android.ticb.base.core.AppResources.imgLevelAsset;
		 v1 = de.nurogames.android.ticb.base.views.TinyBeeView.terrain;
		 /* iget v1, v1, Lde/nurogames/android/ticb/base/objects/objTerrainMap;->checkpoints:I */
		 /* aget-object v0, v0, v1 */
		 /* iget v1, p0, Lde/nurogames/android/ticb/base/objects/objTerrainAsset;->objType:I */
		 /* aget-object v0, v0, v1 */
		 v0 = 		 (( android.graphics.Bitmap ) v0 ).getHeight ( ); // invoke-virtual {v0}, Landroid/graphics/Bitmap;->getHeight()I
		 /* iput v0, p0, Lde/nurogames/android/ticb/base/objects/objTerrainAsset;->mH:I */
		 /* .line 29 */
		 return;
	 } // .end method
	 /* # virtual methods */
	 public void onDraw ( android.graphics.Canvas p0 ) {
		 /* .locals 4 */
		 /* .param p1, "g" # Landroid/graphics/Canvas; */
		 /* .prologue */
		 /* .line 33 */
		 /* .line 34 */
		 v0 = de.nurogames.android.ticb.base.core.AppResources.imgLevelAsset;
		 v1 = de.nurogames.android.ticb.base.views.TinyBeeView.terrain;
		 /* iget v1, v1, Lde/nurogames/android/ticb/base/objects/objTerrainMap;->checkpoints:I */
		 /* aget-object v0, v0, v1 */
		 /* iget v1, p0, Lde/nurogames/android/ticb/base/objects/objTerrainAsset;->objType:I */
		 /* aget-object v0, v0, v1 */
		 /* .line 35 */
		 /* iget v1, p0, Lde/nurogames/android/ticb/base/objects/objTerrainAsset;->mX:F */
		 /* .line 36 */
		 /* iget v2, p0, Lde/nurogames/android/ticb/base/objects/objTerrainAsset;->mY:F */
		 /* .line 37 */
		 int v3 = 0; // const/4 v3, 0x0
		 /* .line 33 */
		 (( android.graphics.Canvas ) p1 ).drawBitmap ( v0, v1, v2, v3 ); // invoke-virtual {p1, v0, v1, v2, v3}, Landroid/graphics/Canvas;->drawBitmap(Landroid/graphics/Bitmap;FFLandroid/graphics/Paint;)V
		 /* .line 39 */
		 return;
	 } // .end method
