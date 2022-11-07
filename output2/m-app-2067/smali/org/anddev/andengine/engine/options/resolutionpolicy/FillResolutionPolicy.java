public class org.anddev.andengine.engine.options.resolutionpolicy.FillResolutionPolicy extends org.anddev.andengine.engine.options.resolutionpolicy.BaseResolutionPolicy {
	 /* # direct methods */
	 public org.anddev.andengine.engine.options.resolutionpolicy.FillResolutionPolicy ( ) {
		 /* .locals 0 */
		 /* invoke-direct {p0}, Lorg/anddev/andengine/engine/options/resolutionpolicy/BaseResolutionPolicy;-><init>()V */
		 return;
	 } // .end method
	 /* # virtual methods */
	 public void onMeasure ( org.anddev.andengine.opengl.view.RenderSurfaceView p0, Integer p1, Integer p2 ) {
		 /* .locals 2 */
		 org.anddev.andengine.engine.options.resolutionpolicy.BaseResolutionPolicy .throwOnNotMeasureSpecEXACTLY ( p2,p3 );
		 v0 = 		 android.view.View$MeasureSpec .getSize ( p2 );
		 v1 = 		 android.view.View$MeasureSpec .getSize ( p3 );
		 (( org.anddev.andengine.opengl.view.RenderSurfaceView ) p1 ).setMeasuredDimensionProxy ( v0, v1 ); // invoke-virtual {p1, v0, v1}, Lorg/anddev/andengine/opengl/view/RenderSurfaceView;->setMeasuredDimensionProxy(II)V
		 return;
	 } // .end method
