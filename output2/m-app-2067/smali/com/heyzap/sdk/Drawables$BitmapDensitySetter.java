public class com.heyzap.sdk.Drawables$BitmapDensitySetter {
	 /* # direct methods */
	 public com.heyzap.sdk.Drawables$BitmapDensitySetter ( ) {
		 /* .locals 0 */
		 /* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
		 return;
	 } // .end method
	 /* # virtual methods */
	 public android.graphics.drawable.BitmapDrawable setDensity ( android.graphics.drawable.BitmapDrawable p0, Integer p1, android.content.res.Resources p2 ) {
		 /* .locals 2 */
		 (( android.graphics.drawable.BitmapDrawable ) p1 ).getBitmap ( ); // invoke-virtual {p1}, Landroid/graphics/drawable/BitmapDrawable;->getBitmap()Landroid/graphics/Bitmap;
		 (( android.graphics.Bitmap ) v0 ).setDensity ( p2 ); // invoke-virtual {v0, p2}, Landroid/graphics/Bitmap;->setDensity(I)V
		 /* new-instance v1, Landroid/graphics/drawable/BitmapDrawable; */
		 /* invoke-direct {v1, p3, v0}, Landroid/graphics/drawable/BitmapDrawable;-><init>(Landroid/content/res/Resources;Landroid/graphics/Bitmap;)V */
	 } // .end method
