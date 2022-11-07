public class org.anddev.andengine.opengl.texture.ITexture$ITextureStateListener$DebugTextureStateListener implements org.anddev.andengine.opengl.texture.ITexture$ITextureStateListener {
	 /* # interfaces */
	 /* # direct methods */
	 public org.anddev.andengine.opengl.texture.ITexture$ITextureStateListener$DebugTextureStateListener ( ) {
		 /* .locals 0 */
		 /* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
		 return;
	 } // .end method
	 /* # virtual methods */
	 public void onLoadedToHardware ( org.anddev.andengine.opengl.texture.ITexture p0 ) {
		 /* .locals 2 */
		 /* new-instance v0, Ljava/lang/StringBuilder; */
		 final String v1 = "Texture loaded: "; // const-string v1, "Texture loaded: "
		 /* invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V */
		 (( java.lang.Object ) p1 ).toString ( ); // invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;
		 (( java.lang.StringBuilder ) v0 ).append ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
		 (( java.lang.StringBuilder ) v0 ).toString ( ); // invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
		 org.anddev.andengine.util.Debug .d ( v0 );
		 return;
	 } // .end method
	 public void onUnloadedFromHardware ( org.anddev.andengine.opengl.texture.ITexture p0 ) {
		 /* .locals 2 */
		 /* new-instance v0, Ljava/lang/StringBuilder; */
		 final String v1 = "Texture unloaded: "; // const-string v1, "Texture unloaded: "
		 /* invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V */
		 (( java.lang.Object ) p1 ).toString ( ); // invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;
		 (( java.lang.StringBuilder ) v0 ).append ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
		 (( java.lang.StringBuilder ) v0 ).toString ( ); // invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
		 org.anddev.andengine.util.Debug .d ( v0 );
		 return;
	 } // .end method
