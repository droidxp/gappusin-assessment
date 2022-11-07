public class org.anddev.andengine.opengl.view.RenderSurfaceView extends org.anddev.andengine.opengl.view.GLSurfaceView {
	 /* # instance fields */
	 private org.anddev.andengine.opengl.view.RenderSurfaceView$Renderer mRenderer;
	 /* # direct methods */
	 public org.anddev.andengine.opengl.view.RenderSurfaceView ( ) {
		 /* .locals 0 */
		 /* invoke-direct {p0, p1}, Lorg/anddev/andengine/opengl/view/GLSurfaceView;-><init>(Landroid/content/Context;)V */
		 return;
	 } // .end method
	 public org.anddev.andengine.opengl.view.RenderSurfaceView ( ) {
		 /* .locals 0 */
		 /* invoke-direct {p0, p1, p2}, Lorg/anddev/andengine/opengl/view/GLSurfaceView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V */
		 return;
	 } // .end method
	 /* # virtual methods */
	 protected void onMeasure ( Integer p0, Integer p1 ) {
		 /* .locals 1 */
		 v0 = this.mRenderer;
		 org.anddev.andengine.opengl.view.RenderSurfaceView$Renderer .access$0 ( v0 );
		 (( org.anddev.andengine.engine.Engine ) v0 ).getEngineOptions ( ); // invoke-virtual {v0}, Lorg/anddev/andengine/engine/Engine;->getEngineOptions()Lorg/anddev/andengine/engine/options/EngineOptions;
		 (( org.anddev.andengine.engine.options.EngineOptions ) v0 ).getResolutionPolicy ( ); // invoke-virtual {v0}, Lorg/anddev/andengine/engine/options/EngineOptions;->getResolutionPolicy()Lorg/anddev/andengine/engine/options/resolutionpolicy/IResolutionPolicy;
		 return;
	 } // .end method
	 public void setMeasuredDimensionProxy ( Integer p0, Integer p1 ) {
		 /* .locals 0 */
		 (( org.anddev.andengine.opengl.view.RenderSurfaceView ) p0 ).setMeasuredDimension ( p1, p2 ); // invoke-virtual {p0, p1, p2}, Lorg/anddev/andengine/opengl/view/RenderSurfaceView;->setMeasuredDimension(II)V
		 return;
	 } // .end method
	 public void setRenderer ( org.anddev.andengine.engine.Engine p0 ) {
		 /* .locals 1 */
		 (( org.anddev.andengine.opengl.view.RenderSurfaceView ) p0 ).setOnTouchListener ( p1 ); // invoke-virtual {p0, p1}, Lorg/anddev/andengine/opengl/view/RenderSurfaceView;->setOnTouchListener(Landroid/view/View$OnTouchListener;)V
		 /* new-instance v0, Lorg/anddev/andengine/opengl/view/RenderSurfaceView$Renderer; */
		 /* invoke-direct {v0, p1}, Lorg/anddev/andengine/opengl/view/RenderSurfaceView$Renderer;-><init>(Lorg/anddev/andengine/engine/Engine;)V */
		 this.mRenderer = v0;
		 v0 = this.mRenderer;
		 (( org.anddev.andengine.opengl.view.RenderSurfaceView ) p0 ).setRenderer ( v0 ); // invoke-virtual {p0, v0}, Lorg/anddev/andengine/opengl/view/RenderSurfaceView;->setRenderer(Lorg/anddev/andengine/opengl/view/GLSurfaceView$Renderer;)V
		 return;
	 } // .end method
