public abstract class org.anddev.andengine.opengl.texture.Texture implements org.anddev.andengine.opengl.texture.ITexture {
	 /* # interfaces */
	 /* # static fields */
	 private static final HARDWARETEXTUREID_FETCHER;
	 /* # instance fields */
	 protected Integer mHardwareTextureID;
	 protected Boolean mLoadedToHardware;
	 protected final org.anddev.andengine.opengl.texture.Texture$PixelFormat mPixelFormat;
	 protected final org.anddev.andengine.opengl.texture.TextureOptions mTextureOptions;
	 protected final org.anddev.andengine.opengl.texture.ITexture$ITextureStateListener mTextureStateListener;
	 protected Boolean mUpdateOnHardwareNeeded;
	 /* # direct methods */
	 static org.anddev.andengine.opengl.texture.Texture ( ) {
		 /* .locals 1 */
		 int v0 = 1; // const/4 v0, 0x1
		 /* new-array v0, v0, [I */
		 return;
	 } // .end method
	 public org.anddev.andengine.opengl.texture.Texture ( ) {
		 /* .locals 1 */
		 /* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
		 int v0 = -1; // const/4 v0, -0x1
		 /* iput v0, p0, Lorg/anddev/andengine/opengl/texture/Texture;->mHardwareTextureID:I */
		 int v0 = 0; // const/4 v0, 0x0
		 /* iput-boolean v0, p0, Lorg/anddev/andengine/opengl/texture/Texture;->mUpdateOnHardwareNeeded:Z */
		 this.mPixelFormat = p1;
		 this.mTextureOptions = p2;
		 this.mTextureStateListener = p3;
		 return;
	 } // .end method
	 /* # virtual methods */
	 protected void applyTextureOptions ( javax.microedition.khronos.opengles.GL10 p0 ) {
		 /* .locals 1 */
		 v0 = this.mTextureOptions;
		 (( org.anddev.andengine.opengl.texture.TextureOptions ) v0 ).apply ( p1 ); // invoke-virtual {v0, p1}, Lorg/anddev/andengine/opengl/texture/TextureOptions;->apply(Ljavax/microedition/khronos/opengles/GL10;)V
		 return;
	 } // .end method
	 public void bind ( javax.microedition.khronos.opengles.GL10 p0 ) {
		 /* .locals 1 */
		 /* iget v0, p0, Lorg/anddev/andengine/opengl/texture/Texture;->mHardwareTextureID:I */
		 org.anddev.andengine.opengl.util.GLHelper .bindTexture ( p1,v0 );
		 return;
	 } // .end method
	 protected void bindTextureOnHardware ( javax.microedition.khronos.opengles.GL10 p0 ) {
		 /* .locals 1 */
		 /* iget v0, p0, Lorg/anddev/andengine/opengl/texture/Texture;->mHardwareTextureID:I */
		 org.anddev.andengine.opengl.util.GLHelper .forceBindTexture ( p1,v0 );
		 return;
	 } // .end method
	 protected void deleteTextureOnHardware ( javax.microedition.khronos.opengles.GL10 p0 ) {
		 /* .locals 1 */
		 /* iget v0, p0, Lorg/anddev/andengine/opengl/texture/Texture;->mHardwareTextureID:I */
		 org.anddev.andengine.opengl.util.GLHelper .deleteTexture ( p1,v0 );
		 return;
	 } // .end method
	 protected void generateHardwareTextureID ( javax.microedition.khronos.opengles.GL10 p0 ) {
		 /* .locals 3 */
		 int v2 = 0; // const/4 v2, 0x0
		 int v0 = 1; // const/4 v0, 0x1
		 v1 = org.anddev.andengine.opengl.texture.Texture.HARDWARETEXTUREID_FETCHER;
		 v0 = org.anddev.andengine.opengl.texture.Texture.HARDWARETEXTUREID_FETCHER;
		 /* aget v0, v0, v2 */
		 /* iput v0, p0, Lorg/anddev/andengine/opengl/texture/Texture;->mHardwareTextureID:I */
		 return;
	 } // .end method
	 public Integer getHardwareTextureID ( ) {
		 /* .locals 1 */
		 /* iget v0, p0, Lorg/anddev/andengine/opengl/texture/Texture;->mHardwareTextureID:I */
	 } // .end method
	 public org.anddev.andengine.opengl.texture.Texture$PixelFormat getPixelFormat ( ) {
		 /* .locals 1 */
		 v0 = this.mPixelFormat;
	 } // .end method
	 public org.anddev.andengine.opengl.texture.TextureOptions getTextureOptions ( ) {
		 /* .locals 1 */
		 v0 = this.mTextureOptions;
	 } // .end method
	 public org.anddev.andengine.opengl.texture.ITexture$ITextureStateListener getTextureStateListener ( ) {
		 /* .locals 1 */
		 v0 = this.mTextureStateListener;
	 } // .end method
	 public Boolean hasTextureStateListener ( ) {
		 /* .locals 1 */
		 v0 = this.mTextureStateListener;
		 if ( v0 != null) { // if-eqz v0, :cond_0
			 int v0 = 1; // const/4 v0, 0x1
		 } // :goto_0
	 } // :cond_0
	 int v0 = 0; // const/4 v0, 0x0
} // .end method
public Boolean isLoadedToHardware ( ) {
	 /* .locals 1 */
	 /* iget-boolean v0, p0, Lorg/anddev/andengine/opengl/texture/Texture;->mLoadedToHardware:Z */
} // .end method
public Boolean isUpdateOnHardwareNeeded ( ) {
	 /* .locals 1 */
	 /* iget-boolean v0, p0, Lorg/anddev/andengine/opengl/texture/Texture;->mUpdateOnHardwareNeeded:Z */
} // .end method
public void loadToHardware ( javax.microedition.khronos.opengles.GL10 p0 ) {
	 /* .locals 1 */
	 org.anddev.andengine.opengl.util.GLHelper .enableTextures ( p1 );
	 (( org.anddev.andengine.opengl.texture.Texture ) p0 ).generateHardwareTextureID ( p1 ); // invoke-virtual {p0, p1}, Lorg/anddev/andengine/opengl/texture/Texture;->generateHardwareTextureID(Ljavax/microedition/khronos/opengles/GL10;)V
	 (( org.anddev.andengine.opengl.texture.Texture ) p0 ).bindTextureOnHardware ( p1 ); // invoke-virtual {p0, p1}, Lorg/anddev/andengine/opengl/texture/Texture;->bindTextureOnHardware(Ljavax/microedition/khronos/opengles/GL10;)V
	 (( org.anddev.andengine.opengl.texture.Texture ) p0 ).applyTextureOptions ( p1 ); // invoke-virtual {p0, p1}, Lorg/anddev/andengine/opengl/texture/Texture;->applyTextureOptions(Ljavax/microedition/khronos/opengles/GL10;)V
	 (( org.anddev.andengine.opengl.texture.Texture ) p0 ).writeTextureToHardware ( p1 ); // invoke-virtual {p0, p1}, Lorg/anddev/andengine/opengl/texture/Texture;->writeTextureToHardware(Ljavax/microedition/khronos/opengles/GL10;)V
	 int v0 = 0; // const/4 v0, 0x0
	 /* iput-boolean v0, p0, Lorg/anddev/andengine/opengl/texture/Texture;->mUpdateOnHardwareNeeded:Z */
	 int v0 = 1; // const/4 v0, 0x1
	 /* iput-boolean v0, p0, Lorg/anddev/andengine/opengl/texture/Texture;->mLoadedToHardware:Z */
	 v0 = this.mTextureStateListener;
	 if ( v0 != null) { // if-eqz v0, :cond_0
		 v0 = this.mTextureStateListener;
	 } // :cond_0
	 return;
} // .end method
public void reloadToHardware ( javax.microedition.khronos.opengles.GL10 p0 ) {
	 /* .locals 0 */
	 (( org.anddev.andengine.opengl.texture.Texture ) p0 ).unloadFromHardware ( p1 ); // invoke-virtual {p0, p1}, Lorg/anddev/andengine/opengl/texture/Texture;->unloadFromHardware(Ljavax/microedition/khronos/opengles/GL10;)V
	 (( org.anddev.andengine.opengl.texture.Texture ) p0 ).loadToHardware ( p1 ); // invoke-virtual {p0, p1}, Lorg/anddev/andengine/opengl/texture/Texture;->loadToHardware(Ljavax/microedition/khronos/opengles/GL10;)V
	 return;
} // .end method
public void setLoadedToHardware ( Boolean p0 ) {
	 /* .locals 0 */
	 /* iput-boolean p1, p0, Lorg/anddev/andengine/opengl/texture/Texture;->mLoadedToHardware:Z */
	 return;
} // .end method
public void setUpdateOnHardwareNeeded ( Boolean p0 ) {
	 /* .locals 0 */
	 /* iput-boolean p1, p0, Lorg/anddev/andengine/opengl/texture/Texture;->mUpdateOnHardwareNeeded:Z */
	 return;
} // .end method
public void unloadFromHardware ( javax.microedition.khronos.opengles.GL10 p0 ) {
	 /* .locals 1 */
	 org.anddev.andengine.opengl.util.GLHelper .enableTextures ( p1 );
	 (( org.anddev.andengine.opengl.texture.Texture ) p0 ).deleteTextureOnHardware ( p1 ); // invoke-virtual {p0, p1}, Lorg/anddev/andengine/opengl/texture/Texture;->deleteTextureOnHardware(Ljavax/microedition/khronos/opengles/GL10;)V
	 int v0 = -1; // const/4 v0, -0x1
	 /* iput v0, p0, Lorg/anddev/andengine/opengl/texture/Texture;->mHardwareTextureID:I */
	 int v0 = 0; // const/4 v0, 0x0
	 /* iput-boolean v0, p0, Lorg/anddev/andengine/opengl/texture/Texture;->mLoadedToHardware:Z */
	 v0 = this.mTextureStateListener;
	 if ( v0 != null) { // if-eqz v0, :cond_0
		 v0 = this.mTextureStateListener;
	 } // :cond_0
	 return;
} // .end method
protected abstract void writeTextureToHardware ( javax.microedition.khronos.opengles.GL10 p0 ) {
} // .end method
