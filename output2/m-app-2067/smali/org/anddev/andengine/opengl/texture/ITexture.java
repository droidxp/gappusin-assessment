public abstract class org.anddev.andengine.opengl.texture.ITexture {
	 /* # virtual methods */
	 public abstract void bind ( javax.microedition.khronos.opengles.GL10 p0 ) {
	 } // .end method
	 public abstract Integer getHardwareTextureID ( ) {
	 } // .end method
	 public abstract Integer getHeight ( ) {
	 } // .end method
	 public abstract org.anddev.andengine.opengl.texture.TextureOptions getTextureOptions ( ) {
	 } // .end method
	 public abstract org.anddev.andengine.opengl.texture.ITexture$ITextureStateListener getTextureStateListener ( ) {
	 } // .end method
	 public abstract Integer getWidth ( ) {
	 } // .end method
	 public abstract Boolean hasTextureStateListener ( ) {
	 } // .end method
	 public abstract Boolean isLoadedToHardware ( ) {
	 } // .end method
	 public abstract Boolean isUpdateOnHardwareNeeded ( ) {
	 } // .end method
	 public abstract void loadToHardware ( javax.microedition.khronos.opengles.GL10 p0 ) {
	 } // .end method
	 public abstract void reloadToHardware ( javax.microedition.khronos.opengles.GL10 p0 ) {
	 } // .end method
	 public abstract void setLoadedToHardware ( Boolean p0 ) {
	 } // .end method
	 public abstract void setUpdateOnHardwareNeeded ( Boolean p0 ) {
	 } // .end method
	 public abstract void unloadFromHardware ( javax.microedition.khronos.opengles.GL10 p0 ) {
	 } // .end method
