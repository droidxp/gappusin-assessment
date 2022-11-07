public class org.anddev.andengine.opengl.texture.atlas.bitmap.source.InternalStorageFileBitmapTextureAtlasSource extends org.anddev.andengine.opengl.texture.atlas.bitmap.source.FileBitmapTextureAtlasSource {
	 /* # direct methods */
	 public org.anddev.andengine.opengl.texture.atlas.bitmap.source.InternalStorageFileBitmapTextureAtlasSource ( ) {
		 /* .locals 2 */
		 /* new-instance v0, Ljava/io/File; */
		 org.anddev.andengine.util.FileUtils .getAbsolutePathOnInternalStorage ( p1,p2 );
		 /* invoke-direct {v0, v1}, Ljava/io/File;-><init>(Ljava/lang/String;)V */
		 /* invoke-direct {p0, v0}, Lorg/anddev/andengine/opengl/texture/atlas/bitmap/source/FileBitmapTextureAtlasSource;-><init>(Ljava/io/File;)V */
		 return;
	 } // .end method
