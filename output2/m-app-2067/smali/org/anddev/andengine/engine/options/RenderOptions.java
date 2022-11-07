public class org.anddev.andengine.engine.options.RenderOptions {
	 /* # instance fields */
	 private Boolean mDisableExtensionDrawTexture;
	 private Boolean mDisableExtensionVertexBufferObjects;
	 /* # direct methods */
	 public org.anddev.andengine.engine.options.RenderOptions ( ) {
		 /* .locals 1 */
		 int v0 = 0; // const/4 v0, 0x0
		 /* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
		 /* iput-boolean v0, p0, Lorg/anddev/andengine/engine/options/RenderOptions;->mDisableExtensionVertexBufferObjects:Z */
		 /* iput-boolean v0, p0, Lorg/anddev/andengine/engine/options/RenderOptions;->mDisableExtensionDrawTexture:Z */
		 return;
	 } // .end method
	 /* # virtual methods */
	 public org.anddev.andengine.engine.options.RenderOptions disableExtensionDrawTexture ( ) {
		 /* .locals 1 */
		 int v0 = 1; // const/4 v0, 0x1
		 (( org.anddev.andengine.engine.options.RenderOptions ) p0 ).setDisableExtensionDrawTexture ( v0 ); // invoke-virtual {p0, v0}, Lorg/anddev/andengine/engine/options/RenderOptions;->setDisableExtensionDrawTexture(Z)Lorg/anddev/andengine/engine/options/RenderOptions;
	 } // .end method
	 public org.anddev.andengine.engine.options.RenderOptions disableExtensionVertexBufferObjects ( ) {
		 /* .locals 1 */
		 int v0 = 1; // const/4 v0, 0x1
		 (( org.anddev.andengine.engine.options.RenderOptions ) p0 ).setDisableExtensionVertexBufferObjects ( v0 ); // invoke-virtual {p0, v0}, Lorg/anddev/andengine/engine/options/RenderOptions;->setDisableExtensionVertexBufferObjects(Z)Lorg/anddev/andengine/engine/options/RenderOptions;
	 } // .end method
	 public org.anddev.andengine.engine.options.RenderOptions enableExtensionDrawTexture ( ) {
		 /* .locals 1 */
		 int v0 = 0; // const/4 v0, 0x0
		 (( org.anddev.andengine.engine.options.RenderOptions ) p0 ).setDisableExtensionDrawTexture ( v0 ); // invoke-virtual {p0, v0}, Lorg/anddev/andengine/engine/options/RenderOptions;->setDisableExtensionDrawTexture(Z)Lorg/anddev/andengine/engine/options/RenderOptions;
	 } // .end method
	 public org.anddev.andengine.engine.options.RenderOptions enableExtensionVertexBufferObjects ( ) {
		 /* .locals 1 */
		 int v0 = 0; // const/4 v0, 0x0
		 (( org.anddev.andengine.engine.options.RenderOptions ) p0 ).setDisableExtensionVertexBufferObjects ( v0 ); // invoke-virtual {p0, v0}, Lorg/anddev/andengine/engine/options/RenderOptions;->setDisableExtensionVertexBufferObjects(Z)Lorg/anddev/andengine/engine/options/RenderOptions;
	 } // .end method
	 public Boolean isDisableExtensionDrawTexture ( ) {
		 /* .locals 1 */
		 /* iget-boolean v0, p0, Lorg/anddev/andengine/engine/options/RenderOptions;->mDisableExtensionDrawTexture:Z */
	 } // .end method
	 public Boolean isDisableExtensionVertexBufferObjects ( ) {
		 /* .locals 1 */
		 /* iget-boolean v0, p0, Lorg/anddev/andengine/engine/options/RenderOptions;->mDisableExtensionVertexBufferObjects:Z */
	 } // .end method
	 public org.anddev.andengine.engine.options.RenderOptions setDisableExtensionDrawTexture ( Boolean p0 ) {
		 /* .locals 0 */
		 /* iput-boolean p1, p0, Lorg/anddev/andengine/engine/options/RenderOptions;->mDisableExtensionDrawTexture:Z */
	 } // .end method
	 public org.anddev.andengine.engine.options.RenderOptions setDisableExtensionVertexBufferObjects ( Boolean p0 ) {
		 /* .locals 0 */
		 /* iput-boolean p1, p0, Lorg/anddev/andengine/engine/options/RenderOptions;->mDisableExtensionVertexBufferObjects:Z */
	 } // .end method
