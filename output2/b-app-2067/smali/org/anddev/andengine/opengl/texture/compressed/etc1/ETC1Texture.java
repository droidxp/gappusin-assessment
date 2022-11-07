public abstract class org.anddev.andengine.opengl.texture.compressed.etc1.ETC1Texture extends org.anddev.andengine.opengl.texture.Texture {
	 /* # instance fields */
	 private org.anddev.andengine.opengl.texture.compressed.etc1.ETC1Texture$ETC1TextureHeader mETC1TextureHeader;
	 /* # direct methods */
	 public org.anddev.andengine.opengl.texture.compressed.etc1.ETC1Texture ( ) {
		 /* .locals 2 */
		 v0 = org.anddev.andengine.opengl.texture.TextureOptions.DEFAULT;
		 int v1 = 0; // const/4 v1, 0x0
		 /* invoke-direct {p0, v0, v1}, Lorg/anddev/andengine/opengl/texture/compressed/etc1/ETC1Texture;-><init>(Lorg/anddev/andengine/opengl/texture/TextureOptions;Lorg/anddev/andengine/opengl/texture/ITexture$ITextureStateListener;)V */
		 return;
	 } // .end method
	 public org.anddev.andengine.opengl.texture.compressed.etc1.ETC1Texture ( ) {
		 /* .locals 1 */
		 v0 = org.anddev.andengine.opengl.texture.TextureOptions.DEFAULT;
		 /* invoke-direct {p0, v0, p1}, Lorg/anddev/andengine/opengl/texture/compressed/etc1/ETC1Texture;-><init>(Lorg/anddev/andengine/opengl/texture/TextureOptions;Lorg/anddev/andengine/opengl/texture/ITexture$ITextureStateListener;)V */
		 return;
	 } // .end method
	 public org.anddev.andengine.opengl.texture.compressed.etc1.ETC1Texture ( ) {
		 /* .locals 1 */
		 int v0 = 0; // const/4 v0, 0x0
		 /* invoke-direct {p0, p1, v0}, Lorg/anddev/andengine/opengl/texture/compressed/etc1/ETC1Texture;-><init>(Lorg/anddev/andengine/opengl/texture/TextureOptions;Lorg/anddev/andengine/opengl/texture/ITexture$ITextureStateListener;)V */
		 return;
	 } // .end method
	 public org.anddev.andengine.opengl.texture.compressed.etc1.ETC1Texture ( ) {
		 /* .locals 4 */
		 v0 = org.anddev.andengine.opengl.texture.Texture$PixelFormat.RGB_565;
		 /* invoke-direct {p0, v0, p1, p2}, Lorg/anddev/andengine/opengl/texture/Texture;-><init>(Lorg/anddev/andengine/opengl/texture/Texture$PixelFormat;Lorg/anddev/andengine/opengl/texture/TextureOptions;Lorg/anddev/andengine/opengl/texture/ITexture$ITextureStateListener;)V */
		 int v0 = 0; // const/4 v0, 0x0
		 try { // :try_start_0
			 (( org.anddev.andengine.opengl.texture.compressed.etc1.ETC1Texture ) p0 ).getInputStream ( ); // invoke-virtual {p0}, Lorg/anddev/andengine/opengl/texture/compressed/etc1/ETC1Texture;->getInputStream()Ljava/io/InputStream;
			 /* :try_end_0 */
			 /* .catchall {:try_start_0 ..:try_end_0} :catchall_0 */
			 try { // :try_start_1
				 /* new-instance v1, Lorg/anddev/andengine/opengl/texture/compressed/etc1/ETC1Texture$ETC1TextureHeader; */
				 /* const/16 v2, 0x10 */
				 org.anddev.andengine.util.StreamUtils .streamToBytes ( v0,v2 );
				 /* invoke-direct {v1, v2}, Lorg/anddev/andengine/opengl/texture/compressed/etc1/ETC1Texture$ETC1TextureHeader;-><init>([B)V */
				 this.mETC1TextureHeader = v1;
				 /* :try_end_1 */
				 /* .catchall {:try_start_1 ..:try_end_1} :catchall_1 */
				 org.anddev.andengine.util.StreamUtils .close ( v0 );
				 return;
				 /* :catchall_0 */
				 /* move-exception v1 */
				 /* move-object v3, v1 */
				 /* move-object v1, v0 */
				 /* move-object v0, v3 */
			 } // :goto_0
			 org.anddev.andengine.util.StreamUtils .close ( v1 );
			 /* throw v0 */
			 /* :catchall_1 */
			 /* move-exception v1 */
			 /* move-object v3, v1 */
			 /* move-object v1, v0 */
			 /* move-object v0, v3 */
		 } // .end method
		 /* # virtual methods */
		 public Integer getHeight ( ) {
			 /* .locals 1 */
			 v0 = this.mETC1TextureHeader;
			 v0 = 			 (( org.anddev.andengine.opengl.texture.compressed.etc1.ETC1Texture$ETC1TextureHeader ) v0 ).getHeight ( ); // invoke-virtual {v0}, Lorg/anddev/andengine/opengl/texture/compressed/etc1/ETC1Texture$ETC1TextureHeader;->getHeight()I
		 } // .end method
		 protected abstract java.io.InputStream getInputStream ( ) {
		 } // .end method
		 public Integer getWidth ( ) {
			 /* .locals 1 */
			 v0 = this.mETC1TextureHeader;
			 v0 = 			 (( org.anddev.andengine.opengl.texture.compressed.etc1.ETC1Texture$ETC1TextureHeader ) v0 ).getWidth ( ); // invoke-virtual {v0}, Lorg/anddev/andengine/opengl/texture/compressed/etc1/ETC1Texture$ETC1TextureHeader;->getWidth()I
		 } // .end method
		 protected void writeTextureToHardware ( javax.microedition.khronos.opengles.GL10 p0 ) {
			 /* .locals 6 */
			 int v1 = 0; // const/4 v1, 0x0
			 (( org.anddev.andengine.opengl.texture.compressed.etc1.ETC1Texture ) p0 ).getInputStream ( ); // invoke-virtual {p0}, Lorg/anddev/andengine/opengl/texture/compressed/etc1/ETC1Texture;->getInputStream()Ljava/io/InputStream;
			 /* const/16 v0, 0xde1 */
			 v2 = this.mPixelFormat;
			 v3 = 			 (( org.anddev.andengine.opengl.texture.Texture$PixelFormat ) v2 ).getGLFormat ( ); // invoke-virtual {v2}, Lorg/anddev/andengine/opengl/texture/Texture$PixelFormat;->getGLFormat()I
			 v2 = this.mPixelFormat;
			 v4 = 			 (( org.anddev.andengine.opengl.texture.Texture$PixelFormat ) v2 ).getGLType ( ); // invoke-virtual {v2}, Lorg/anddev/andengine/opengl/texture/Texture$PixelFormat;->getGLType()I
			 /* move v2, v1 */
			 /* invoke-static/range {v0 ..v5}, Landroid/opengl/ETC1Util;->loadTexture(IIIIILjava/io/InputStream;)V */
			 return;
		 } // .end method
