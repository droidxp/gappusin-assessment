public class org.anddev.andengine.engine.options.resolutionpolicy.RelativeResolutionPolicy extends org.anddev.andengine.engine.options.resolutionpolicy.BaseResolutionPolicy {
	 /* # instance fields */
	 private final Float mHeightScale;
	 private final Float mWidthScale;
	 /* # direct methods */
	 public org.anddev.andengine.engine.options.resolutionpolicy.RelativeResolutionPolicy ( ) {
		 /* .locals 0 */
		 /* invoke-direct {p0, p1, p1}, Lorg/anddev/andengine/engine/options/resolutionpolicy/RelativeResolutionPolicy;-><init>(FF)V */
		 return;
	 } // .end method
	 public org.anddev.andengine.engine.options.resolutionpolicy.RelativeResolutionPolicy ( ) {
		 /* .locals 0 */
		 /* invoke-direct {p0}, Lorg/anddev/andengine/engine/options/resolutionpolicy/BaseResolutionPolicy;-><init>()V */
		 /* iput p1, p0, Lorg/anddev/andengine/engine/options/resolutionpolicy/RelativeResolutionPolicy;->mWidthScale:F */
		 /* iput p2, p0, Lorg/anddev/andengine/engine/options/resolutionpolicy/RelativeResolutionPolicy;->mHeightScale:F */
		 return;
	 } // .end method
	 /* # virtual methods */
	 public void onMeasure ( org.anddev.andengine.opengl.view.RenderSurfaceView p0, Integer p1, Integer p2 ) {
		 /* .locals 3 */
		 org.anddev.andengine.engine.options.resolutionpolicy.BaseResolutionPolicy .throwOnNotMeasureSpecEXACTLY ( p2,p3 );
		 v0 = 		 android.view.View$MeasureSpec .getSize ( p2 );
		 /* int-to-float v0, v0 */
		 /* iget v1, p0, Lorg/anddev/andengine/engine/options/resolutionpolicy/RelativeResolutionPolicy;->mWidthScale:F */
		 /* mul-float/2addr v0, v1 */
		 /* float-to-int v0, v0 */
		 v1 = 		 android.view.View$MeasureSpec .getSize ( p3 );
		 /* int-to-float v1, v1 */
		 /* iget v2, p0, Lorg/anddev/andengine/engine/options/resolutionpolicy/RelativeResolutionPolicy;->mHeightScale:F */
		 /* mul-float/2addr v1, v2 */
		 /* float-to-int v1, v1 */
		 (( org.anddev.andengine.opengl.view.RenderSurfaceView ) p1 ).setMeasuredDimensionProxy ( v0, v1 ); // invoke-virtual {p1, v0, v1}, Lorg/anddev/andengine/opengl/view/RenderSurfaceView;->setMeasuredDimensionProxy(II)V
		 return;
	 } // .end method
