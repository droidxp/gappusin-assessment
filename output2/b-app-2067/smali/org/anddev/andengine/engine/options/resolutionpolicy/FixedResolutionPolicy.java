public class org.anddev.andengine.engine.options.resolutionpolicy.FixedResolutionPolicy extends org.anddev.andengine.engine.options.resolutionpolicy.BaseResolutionPolicy {
	 /* # instance fields */
	 private final Integer mHeight;
	 private final Integer mWidth;
	 /* # direct methods */
	 public org.anddev.andengine.engine.options.resolutionpolicy.FixedResolutionPolicy ( ) {
		 /* .locals 0 */
		 /* invoke-direct {p0}, Lorg/anddev/andengine/engine/options/resolutionpolicy/BaseResolutionPolicy;-><init>()V */
		 /* iput p1, p0, Lorg/anddev/andengine/engine/options/resolutionpolicy/FixedResolutionPolicy;->mWidth:I */
		 /* iput p2, p0, Lorg/anddev/andengine/engine/options/resolutionpolicy/FixedResolutionPolicy;->mHeight:I */
		 return;
	 } // .end method
	 /* # virtual methods */
	 public void onMeasure ( org.anddev.andengine.opengl.view.RenderSurfaceView p0, Integer p1, Integer p2 ) {
		 /* .locals 2 */
		 /* iget v0, p0, Lorg/anddev/andengine/engine/options/resolutionpolicy/FixedResolutionPolicy;->mWidth:I */
		 /* iget v1, p0, Lorg/anddev/andengine/engine/options/resolutionpolicy/FixedResolutionPolicy;->mHeight:I */
		 (( org.anddev.andengine.opengl.view.RenderSurfaceView ) p1 ).setMeasuredDimensionProxy ( v0, v1 ); // invoke-virtual {p1, v0, v1}, Lorg/anddev/andengine/opengl/view/RenderSurfaceView;->setMeasuredDimensionProxy(II)V
		 return;
	 } // .end method
