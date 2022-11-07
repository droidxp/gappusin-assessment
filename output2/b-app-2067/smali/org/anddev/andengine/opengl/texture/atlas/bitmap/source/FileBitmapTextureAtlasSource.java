public class org.anddev.andengine.opengl.texture.atlas.bitmap.source.FileBitmapTextureAtlasSource extends org.anddev.andengine.opengl.texture.source.BaseTextureAtlasSource implements org.anddev.andengine.opengl.texture.atlas.bitmap.source.IBitmapTextureAtlasSource {
	 /* # interfaces */
	 /* # instance fields */
	 private final java.io.File mFile;
	 private final Integer mHeight;
	 private final Integer mWidth;
	 /* # direct methods */
	 public org.anddev.andengine.opengl.texture.atlas.bitmap.source.FileBitmapTextureAtlasSource ( ) {
		 /* .locals 1 */
		 int v0 = 0; // const/4 v0, 0x0
		 /* invoke-direct {p0, p1, v0, v0}, Lorg/anddev/andengine/opengl/texture/atlas/bitmap/source/FileBitmapTextureAtlasSource;-><init>(Ljava/io/File;II)V */
		 return;
	 } // .end method
	 public org.anddev.andengine.opengl.texture.atlas.bitmap.source.FileBitmapTextureAtlasSource ( ) {
		 /* .locals 6 */
		 int v2 = 0; // const/4 v2, 0x0
		 /* invoke-direct {p0, p2, p3}, Lorg/anddev/andengine/opengl/texture/source/BaseTextureAtlasSource;-><init>(II)V */
		 this.mFile = p1;
		 /* new-instance v0, Landroid/graphics/BitmapFactory$Options; */
		 /* invoke-direct {v0}, Landroid/graphics/BitmapFactory$Options;-><init>()V */
		 int v1 = 1; // const/4 v1, 0x1
		 /* iput-boolean v1, v0, Landroid/graphics/BitmapFactory$Options;->inJustDecodeBounds:Z */
		 try { // :try_start_0
			 /* new-instance v1, Ljava/io/FileInputStream; */
			 /* invoke-direct {v1, p1}, Ljava/io/FileInputStream;-><init>(Ljava/io/File;)V */
			 /* :try_end_0 */
			 /* .catch Ljava/io/IOException; {:try_start_0 ..:try_end_0} :catch_0 */
			 /* .catchall {:try_start_0 ..:try_end_0} :catchall_0 */
			 int v2 = 0; // const/4 v2, 0x0
			 try { // :try_start_1
				 android.graphics.BitmapFactory .decodeStream ( v1,v2,v0 );
				 /* :try_end_1 */
				 /* .catch Ljava/io/IOException; {:try_start_1 ..:try_end_1} :catch_1 */
				 /* .catchall {:try_start_1 ..:try_end_1} :catchall_1 */
				 org.anddev.andengine.util.StreamUtils .close ( v1 );
			 } // :goto_0
			 /* iget v1, v0, Landroid/graphics/BitmapFactory$Options;->outWidth:I */
			 /* iput v1, p0, Lorg/anddev/andengine/opengl/texture/atlas/bitmap/source/FileBitmapTextureAtlasSource;->mWidth:I */
			 /* iget v0, v0, Landroid/graphics/BitmapFactory$Options;->outHeight:I */
			 /* iput v0, p0, Lorg/anddev/andengine/opengl/texture/atlas/bitmap/source/FileBitmapTextureAtlasSource;->mHeight:I */
			 return;
			 /* :catch_0 */
			 /* move-exception v1 */
		 } // :goto_1
		 try { // :try_start_2
			 /* new-instance v3, Ljava/lang/StringBuilder; */
			 final String v4 = "Failed loading Bitmap in FileBitmapTextureAtlasSource.File: "; // const-string v4, "Failed loading Bitmap in FileBitmapTextureAtlasSource.File: "
			 /* invoke-direct {v3, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V */
			 (( java.lang.StringBuilder ) v3 ).append ( p1 ); // invoke-virtual {v3, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;
			 (( java.lang.StringBuilder ) v3 ).toString ( ); // invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
			 org.anddev.andengine.util.Debug .e ( v3,v1 );
			 /* :try_end_2 */
			 /* .catchall {:try_start_2 ..:try_end_2} :catchall_2 */
			 org.anddev.andengine.util.StreamUtils .close ( v2 );
			 /* :catchall_0 */
			 /* move-exception v0 */
			 /* move-object v1, v2 */
		 } // :goto_2
		 org.anddev.andengine.util.StreamUtils .close ( v1 );
		 /* throw v0 */
		 /* :catchall_1 */
		 /* move-exception v0 */
		 /* :catchall_2 */
		 /* move-exception v0 */
		 /* move-object v1, v2 */
		 /* :catch_1 */
		 /* move-exception v2 */
		 /* move-object v5, v2 */
		 /* move-object v2, v1 */
		 /* move-object v1, v5 */
	 } // .end method
	 org.anddev.andengine.opengl.texture.atlas.bitmap.source.FileBitmapTextureAtlasSource ( ) {
		 /* .locals 0 */
		 /* invoke-direct {p0, p2, p3}, Lorg/anddev/andengine/opengl/texture/source/BaseTextureAtlasSource;-><init>(II)V */
		 this.mFile = p1;
		 /* iput p4, p0, Lorg/anddev/andengine/opengl/texture/atlas/bitmap/source/FileBitmapTextureAtlasSource;->mWidth:I */
		 /* iput p5, p0, Lorg/anddev/andengine/opengl/texture/atlas/bitmap/source/FileBitmapTextureAtlasSource;->mHeight:I */
		 return;
	 } // .end method
	 /* # virtual methods */
	 public org.anddev.andengine.opengl.texture.atlas.bitmap.source.FileBitmapTextureAtlasSource clone ( ) {
		 /* .locals 6 */
		 /* new-instance v0, Lorg/anddev/andengine/opengl/texture/atlas/bitmap/source/FileBitmapTextureAtlasSource; */
		 v1 = this.mFile;
		 /* iget v2, p0, Lorg/anddev/andengine/opengl/texture/atlas/bitmap/source/FileBitmapTextureAtlasSource;->mTexturePositionX:I */
		 /* iget v3, p0, Lorg/anddev/andengine/opengl/texture/atlas/bitmap/source/FileBitmapTextureAtlasSource;->mTexturePositionY:I */
		 /* iget v4, p0, Lorg/anddev/andengine/opengl/texture/atlas/bitmap/source/FileBitmapTextureAtlasSource;->mWidth:I */
		 /* iget v5, p0, Lorg/anddev/andengine/opengl/texture/atlas/bitmap/source/FileBitmapTextureAtlasSource;->mHeight:I */
		 /* invoke-direct/range {v0 ..v5}, Lorg/anddev/andengine/opengl/texture/atlas/bitmap/source/FileBitmapTextureAtlasSource;-><init>(Ljava/io/File;IIII)V */
	 } // .end method
	 public org.anddev.andengine.opengl.texture.atlas.bitmap.source.IBitmapTextureAtlasSource clone ( ) { //bridge//synthethic
		 /* .locals 1 */
		 (( org.anddev.andengine.opengl.texture.atlas.bitmap.source.FileBitmapTextureAtlasSource ) p0 ).clone ( ); // invoke-virtual {p0}, Lorg/anddev/andengine/opengl/texture/atlas/bitmap/source/FileBitmapTextureAtlasSource;->clone()Lorg/anddev/andengine/opengl/texture/atlas/bitmap/source/FileBitmapTextureAtlasSource;
	 } // .end method
	 public org.anddev.andengine.opengl.texture.source.BaseTextureAtlasSource clone ( ) { //bridge//synthethic
		 /* .locals 1 */
		 (( org.anddev.andengine.opengl.texture.atlas.bitmap.source.FileBitmapTextureAtlasSource ) p0 ).clone ( ); // invoke-virtual {p0}, Lorg/anddev/andengine/opengl/texture/atlas/bitmap/source/FileBitmapTextureAtlasSource;->clone()Lorg/anddev/andengine/opengl/texture/atlas/bitmap/source/FileBitmapTextureAtlasSource;
	 } // .end method
	 public org.anddev.andengine.opengl.texture.source.ITextureAtlasSource clone ( ) { //bridge//synthethic
		 /* .locals 1 */
		 (( org.anddev.andengine.opengl.texture.atlas.bitmap.source.FileBitmapTextureAtlasSource ) p0 ).clone ( ); // invoke-virtual {p0}, Lorg/anddev/andengine/opengl/texture/atlas/bitmap/source/FileBitmapTextureAtlasSource;->clone()Lorg/anddev/andengine/opengl/texture/atlas/bitmap/source/FileBitmapTextureAtlasSource;
	 } // .end method
	 public Integer getHeight ( ) {
		 /* .locals 1 */
		 /* iget v0, p0, Lorg/anddev/andengine/opengl/texture/atlas/bitmap/source/FileBitmapTextureAtlasSource;->mHeight:I */
	 } // .end method
	 public Integer getWidth ( ) {
		 /* .locals 1 */
		 /* iget v0, p0, Lorg/anddev/andengine/opengl/texture/atlas/bitmap/source/FileBitmapTextureAtlasSource;->mWidth:I */
	 } // .end method
	 public android.graphics.Bitmap onLoadBitmap ( android.graphics.Bitmap$Config p0 ) {
		 /* .locals 5 */
		 int v4 = 0; // const/4 v4, 0x0
		 /* new-instance v0, Landroid/graphics/BitmapFactory$Options; */
		 /* invoke-direct {v0}, Landroid/graphics/BitmapFactory$Options;-><init>()V */
		 this.inPreferredConfig = p1;
		 try { // :try_start_0
			 /* new-instance v1, Ljava/io/FileInputStream; */
			 v2 = this.mFile;
			 /* invoke-direct {v1, v2}, Ljava/io/FileInputStream;-><init>(Ljava/io/File;)V */
			 /* :try_end_0 */
			 /* .catch Ljava/io/IOException; {:try_start_0 ..:try_end_0} :catch_0 */
			 /* .catchall {:try_start_0 ..:try_end_0} :catchall_0 */
			 int v2 = 0; // const/4 v2, 0x0
			 try { // :try_start_1
				 android.graphics.BitmapFactory .decodeStream ( v1,v2,v0 );
				 /* :try_end_1 */
				 /* .catch Ljava/io/IOException; {:try_start_1 ..:try_end_1} :catch_1 */
				 /* .catchall {:try_start_1 ..:try_end_1} :catchall_1 */
				 org.anddev.andengine.util.StreamUtils .close ( v1 );
			 } // :goto_0
			 /* :catch_0 */
			 /* move-exception v0 */
			 /* move-object v1, v4 */
		 } // :goto_1
		 try { // :try_start_2
			 /* new-instance v2, Ljava/lang/StringBuilder; */
			 final String v3 = "Failed loading Bitmap in "; // const-string v3, "Failed loading Bitmap in "
			 /* invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V */
			 (( java.lang.Object ) p0 ).getClass ( ); // invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;
			 (( java.lang.Class ) v3 ).getSimpleName ( ); // invoke-virtual {v3}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;
			 (( java.lang.StringBuilder ) v2 ).append ( v3 ); // invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
			 final String v3 = ".File: "; // const-string v3, ".File: "
			 (( java.lang.StringBuilder ) v2 ).append ( v3 ); // invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
			 v3 = this.mFile;
			 (( java.lang.StringBuilder ) v2 ).append ( v3 ); // invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;
			 (( java.lang.StringBuilder ) v2 ).toString ( ); // invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
			 org.anddev.andengine.util.Debug .e ( v2,v0 );
			 /* :try_end_2 */
			 /* .catchall {:try_start_2 ..:try_end_2} :catchall_1 */
			 org.anddev.andengine.util.StreamUtils .close ( v1 );
			 /* move-object v0, v4 */
			 /* :catchall_0 */
			 /* move-exception v0 */
			 /* move-object v1, v4 */
		 } // :goto_2
		 org.anddev.andengine.util.StreamUtils .close ( v1 );
		 /* throw v0 */
		 /* :catchall_1 */
		 /* move-exception v0 */
		 /* :catch_1 */
		 /* move-exception v0 */
	 } // .end method
	 public java.lang.String toString ( ) {
		 /* .locals 2 */
		 /* new-instance v0, Ljava/lang/StringBuilder; */
		 (( java.lang.Object ) p0 ).getClass ( ); // invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;
		 (( java.lang.Class ) v1 ).getSimpleName ( ); // invoke-virtual {v1}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;
		 java.lang.String .valueOf ( v1 );
		 /* invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V */
		 final String v1 = "("; // const-string v1, "("
		 (( java.lang.StringBuilder ) v0 ).append ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
		 v1 = this.mFile;
		 (( java.lang.StringBuilder ) v0 ).append ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;
		 final String v1 = ")"; // const-string v1, ")"
		 (( java.lang.StringBuilder ) v0 ).append ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
		 (( java.lang.StringBuilder ) v0 ).toString ( ); // invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
	 } // .end method
