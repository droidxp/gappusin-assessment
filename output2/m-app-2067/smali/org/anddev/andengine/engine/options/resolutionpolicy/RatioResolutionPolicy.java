public class org.anddev.andengine.engine.options.resolutionpolicy.RatioResolutionPolicy extends org.anddev.andengine.engine.options.resolutionpolicy.BaseResolutionPolicy {
	 /* # instance fields */
	 private final Float mRatio;
	 /* # direct methods */
	 public org.anddev.andengine.engine.options.resolutionpolicy.RatioResolutionPolicy ( ) {
		 /* .locals 0 */
		 /* invoke-direct {p0}, Lorg/anddev/andengine/engine/options/resolutionpolicy/BaseResolutionPolicy;-><init>()V */
		 /* iput p1, p0, Lorg/anddev/andengine/engine/options/resolutionpolicy/RatioResolutionPolicy;->mRatio:F */
		 return;
	 } // .end method
	 public org.anddev.andengine.engine.options.resolutionpolicy.RatioResolutionPolicy ( ) {
		 /* .locals 1 */
		 /* invoke-direct {p0}, Lorg/anddev/andengine/engine/options/resolutionpolicy/BaseResolutionPolicy;-><init>()V */
		 /* div-float v0, p1, p2 */
		 /* iput v0, p0, Lorg/anddev/andengine/engine/options/resolutionpolicy/RatioResolutionPolicy;->mRatio:F */
		 return;
	 } // .end method
	 /* # virtual methods */
	 public void onMeasure ( org.anddev.andengine.opengl.view.RenderSurfaceView p0, Integer p1, Integer p2 ) {
		 /* .locals 5 */
		 org.anddev.andengine.engine.options.resolutionpolicy.BaseResolutionPolicy .throwOnNotMeasureSpecEXACTLY ( p2,p3 );
		 v0 = 		 android.view.View$MeasureSpec .getSize ( p2 );
		 v1 = 		 android.view.View$MeasureSpec .getSize ( p3 );
		 /* iget v2, p0, Lorg/anddev/andengine/engine/options/resolutionpolicy/RatioResolutionPolicy;->mRatio:F */
		 /* int-to-float v3, v0 */
		 /* int-to-float v4, v1 */
		 /* div-float/2addr v3, v4 */
		 /* cmpg-float v3, v3, v2 */
		 /* if-gez v3, :cond_0 */
		 /* int-to-float v1, v0 */
		 /* div-float/2addr v1, v2 */
		 v1 = 		 java.lang.Math .round ( v1 );
	 } // :goto_0
	 (( org.anddev.andengine.opengl.view.RenderSurfaceView ) p1 ).setMeasuredDimensionProxy ( v0, v1 ); // invoke-virtual {p1, v0, v1}, Lorg/anddev/andengine/opengl/view/RenderSurfaceView;->setMeasuredDimensionProxy(II)V
	 return;
} // :cond_0
/* int-to-float v0, v1 */
/* mul-float/2addr v0, v2 */
v0 = java.lang.Math .round ( v0 );
} // .end method
