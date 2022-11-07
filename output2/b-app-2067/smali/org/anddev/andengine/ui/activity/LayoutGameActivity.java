public abstract class org.anddev.andengine.ui.activity.LayoutGameActivity extends org.anddev.andengine.ui.activity.BaseGameActivity {
	 /* # direct methods */
	 public org.anddev.andengine.ui.activity.LayoutGameActivity ( ) {
		 /* .locals 0 */
		 /* invoke-direct {p0}, Lorg/anddev/andengine/ui/activity/BaseGameActivity;-><init>()V */
		 return;
	 } // .end method
	 /* # virtual methods */
	 protected abstract Integer getLayoutID ( ) {
	 } // .end method
	 protected abstract Integer getRenderSurfaceViewID ( ) {
	 } // .end method
	 protected void onSetContentView ( ) {
		 /* .locals 2 */
		 v0 = 		 (( org.anddev.andengine.ui.activity.LayoutGameActivity ) p0 ).getLayoutID ( ); // invoke-virtual {p0}, Lorg/anddev/andengine/ui/activity/LayoutGameActivity;->getLayoutID()I
		 /* invoke-super {p0, v0}, Lorg/anddev/andengine/ui/activity/BaseGameActivity;->setContentView(I)V */
		 v0 = 		 (( org.anddev.andengine.ui.activity.LayoutGameActivity ) p0 ).getRenderSurfaceViewID ( ); // invoke-virtual {p0}, Lorg/anddev/andengine/ui/activity/LayoutGameActivity;->getRenderSurfaceViewID()I
		 (( org.anddev.andengine.ui.activity.LayoutGameActivity ) p0 ).findViewById ( v0 ); // invoke-virtual {p0, v0}, Lorg/anddev/andengine/ui/activity/LayoutGameActivity;->findViewById(I)Landroid/view/View;
		 /* check-cast v0, Lorg/anddev/andengine/opengl/view/RenderSurfaceView; */
		 this.mRenderSurfaceView = v0;
		 v0 = this.mRenderSurfaceView;
		 int v1 = 0; // const/4 v1, 0x0
		 (( org.anddev.andengine.opengl.view.RenderSurfaceView ) v0 ).setEGLConfigChooser ( v1 ); // invoke-virtual {v0, v1}, Lorg/anddev/andengine/opengl/view/RenderSurfaceView;->setEGLConfigChooser(Z)V
		 v0 = this.mRenderSurfaceView;
		 v1 = this.mEngine;
		 (( org.anddev.andengine.opengl.view.RenderSurfaceView ) v0 ).setRenderer ( v1 ); // invoke-virtual {v0, v1}, Lorg/anddev/andengine/opengl/view/RenderSurfaceView;->setRenderer(Lorg/anddev/andengine/engine/Engine;)V
		 return;
	 } // .end method
