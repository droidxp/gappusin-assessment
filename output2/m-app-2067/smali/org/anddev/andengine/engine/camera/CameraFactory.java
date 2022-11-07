public class org.anddev.andengine.engine.camera.CameraFactory {
	 /* # direct methods */
	 public org.anddev.andengine.engine.camera.CameraFactory ( ) {
		 /* .locals 0 */
		 /* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
		 return;
	 } // .end method
	 public static org.anddev.andengine.engine.camera.Camera createPixelPerfectCamera ( android.content.Context p0, Float p1, Float p2 ) {
		 /* .locals 5 */
		 /* const/high16 v4, 0x3f000000 # 0.5f */
		 org.anddev.andengine.engine.camera.CameraFactory .getDisplayMetrics ( p0 );
		 /* iget v1, v0, Landroid/util/DisplayMetrics;->widthPixels:I */
		 /* int-to-float v1, v1 */
		 /* iget v0, v0, Landroid/util/DisplayMetrics;->heightPixels:I */
		 /* int-to-float v0, v0 */
		 /* new-instance v2, Lorg/anddev/andengine/engine/camera/Camera; */
		 /* mul-float v3, v1, v4 */
		 /* sub-float v3, p1, v3 */
		 /* mul-float/2addr v4, v0 */
		 /* sub-float v4, p2, v4 */
		 /* invoke-direct {v2, v3, v4, v1, v0}, Lorg/anddev/andengine/engine/camera/Camera;-><init>(FFFF)V */
	 } // .end method
	 private static android.util.DisplayMetrics getDisplayMetrics ( android.content.Context p0 ) {
		 /* .locals 1 */
		 (( android.content.Context ) p0 ).getResources ( ); // invoke-virtual {p0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;
		 (( android.content.res.Resources ) v0 ).getDisplayMetrics ( ); // invoke-virtual {v0}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;
	 } // .end method
