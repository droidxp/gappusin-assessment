public abstract class org.anddev.andengine.opengl.texture.compressed.pvr.PVRTexture extends org.anddev.andengine.opengl.texture.Texture {
	 /* # static fields */
	 public static final Integer FLAG_ALPHA;
	 public static final Integer FLAG_BUMPMAP;
	 public static final Integer FLAG_CUBEMAP;
	 public static final Integer FLAG_FALSEMIPCOL;
	 public static final Integer FLAG_MIPMAP;
	 public static final Integer FLAG_TILING;
	 public static final Integer FLAG_TWIDDLE;
	 public static final Integer FLAG_VERTICALFLIP;
	 public static final Integer FLAG_VOLUME;
	 /* # instance fields */
	 private final org.anddev.andengine.opengl.texture.compressed.pvr.PVRTexture$PVRTextureHeader mPVRTextureHeader;
	 /* # direct methods */
	 public org.anddev.andengine.opengl.texture.compressed.pvr.PVRTexture ( ) {
		 /* .locals 2 */
		 v0 = org.anddev.andengine.opengl.texture.TextureOptions.DEFAULT;
		 int v1 = 0; // const/4 v1, 0x0
		 /* invoke-direct {p0, p1, v0, v1}, Lorg/anddev/andengine/opengl/texture/compressed/pvr/PVRTexture;-><init>(Lorg/anddev/andengine/opengl/texture/compressed/pvr/PVRTexture$PVRTextureFormat;Lorg/anddev/andengine/opengl/texture/TextureOptions;Lorg/anddev/andengine/opengl/texture/ITexture$ITextureStateListener;)V */
		 return;
	 } // .end method
	 public org.anddev.andengine.opengl.texture.compressed.pvr.PVRTexture ( ) {
		 /* .locals 1 */
		 v0 = org.anddev.andengine.opengl.texture.TextureOptions.DEFAULT;
		 /* invoke-direct {p0, p1, v0, p2}, Lorg/anddev/andengine/opengl/texture/compressed/pvr/PVRTexture;-><init>(Lorg/anddev/andengine/opengl/texture/compressed/pvr/PVRTexture$PVRTextureFormat;Lorg/anddev/andengine/opengl/texture/TextureOptions;Lorg/anddev/andengine/opengl/texture/ITexture$ITextureStateListener;)V */
		 return;
	 } // .end method
	 public org.anddev.andengine.opengl.texture.compressed.pvr.PVRTexture ( ) {
		 /* .locals 1 */
		 int v0 = 0; // const/4 v0, 0x0
		 /* invoke-direct {p0, p1, p2, v0}, Lorg/anddev/andengine/opengl/texture/compressed/pvr/PVRTexture;-><init>(Lorg/anddev/andengine/opengl/texture/compressed/pvr/PVRTexture$PVRTextureFormat;Lorg/anddev/andengine/opengl/texture/TextureOptions;Lorg/anddev/andengine/opengl/texture/ITexture$ITextureStateListener;)V */
		 return;
	 } // .end method
	 public org.anddev.andengine.opengl.texture.compressed.pvr.PVRTexture ( ) {
		 /* .locals 4 */
		 (( org.anddev.andengine.opengl.texture.compressed.pvr.PVRTexture$PVRTextureFormat ) p1 ).getPixelFormat ( ); // invoke-virtual {p1}, Lorg/anddev/andengine/opengl/texture/compressed/pvr/PVRTexture$PVRTextureFormat;->getPixelFormat()Lorg/anddev/andengine/opengl/texture/Texture$PixelFormat;
		 /* invoke-direct {p0, v0, p2, p3}, Lorg/anddev/andengine/opengl/texture/Texture;-><init>(Lorg/anddev/andengine/opengl/texture/Texture$PixelFormat;Lorg/anddev/andengine/opengl/texture/TextureOptions;Lorg/anddev/andengine/opengl/texture/ITexture$ITextureStateListener;)V */
		 int v0 = 0; // const/4 v0, 0x0
		 try { // :try_start_0
			 (( org.anddev.andengine.opengl.texture.compressed.pvr.PVRTexture ) p0 ).getInputStream ( ); // invoke-virtual {p0}, Lorg/anddev/andengine/opengl/texture/compressed/pvr/PVRTexture;->getInputStream()Ljava/io/InputStream;
			 /* :try_end_0 */
			 /* .catchall {:try_start_0 ..:try_end_0} :catchall_0 */
			 try { // :try_start_1
				 /* new-instance v1, Lorg/anddev/andengine/opengl/texture/compressed/pvr/PVRTexture$PVRTextureHeader; */
				 /* const/16 v2, 0x34 */
				 org.anddev.andengine.util.StreamUtils .streamToBytes ( v0,v2 );
				 /* invoke-direct {v1, v2}, Lorg/anddev/andengine/opengl/texture/compressed/pvr/PVRTexture$PVRTextureHeader;-><init>([B)V */
				 this.mPVRTextureHeader = v1;
				 /* :try_end_1 */
				 /* .catchall {:try_start_1 ..:try_end_1} :catchall_1 */
				 org.anddev.andengine.util.StreamUtils .close ( v0 );
				 v0 = 				 (( org.anddev.andengine.opengl.texture.compressed.pvr.PVRTexture ) p0 ).getWidth ( ); // invoke-virtual {p0}, Lorg/anddev/andengine/opengl/texture/compressed/pvr/PVRTexture;->getWidth()I
				 v0 = 				 org.anddev.andengine.util.MathUtils .isPowerOfTwo ( v0 );
				 if ( v0 != null) { // if-eqz v0, :cond_0
					 v0 = 					 (( org.anddev.andengine.opengl.texture.compressed.pvr.PVRTexture ) p0 ).getHeight ( ); // invoke-virtual {p0}, Lorg/anddev/andengine/opengl/texture/compressed/pvr/PVRTexture;->getHeight()I
					 v0 = 					 org.anddev.andengine.util.MathUtils .isPowerOfTwo ( v0 );
					 /* if-nez v0, :cond_1 */
				 } // :cond_0
				 /* new-instance v0, Ljava/lang/IllegalArgumentException; */
				 final String v1 = "mWidth and mHeight must be a power of 2!"; // const-string v1, "mWidth and mHeight must be a power of 2!"
				 /* invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V */
				 /* throw v0 */
				 /* :catchall_0 */
				 /* move-exception v1 */
				 /* move-object v3, v1 */
				 /* move-object v1, v0 */
				 /* move-object v0, v3 */
			 } // :goto_0
			 org.anddev.andengine.util.StreamUtils .close ( v1 );
			 /* throw v0 */
		 } // :cond_1
		 v0 = this.mPVRTextureHeader;
		 (( org.anddev.andengine.opengl.texture.compressed.pvr.PVRTexture$PVRTextureHeader ) v0 ).getPVRTextureFormat ( ); // invoke-virtual {v0}, Lorg/anddev/andengine/opengl/texture/compressed/pvr/PVRTexture$PVRTextureHeader;->getPVRTextureFormat()Lorg/anddev/andengine/opengl/texture/compressed/pvr/PVRTexture$PVRTextureFormat;
		 (( org.anddev.andengine.opengl.texture.compressed.pvr.PVRTexture$PVRTextureFormat ) v0 ).getPixelFormat ( ); // invoke-virtual {v0}, Lorg/anddev/andengine/opengl/texture/compressed/pvr/PVRTexture$PVRTextureFormat;->getPixelFormat()Lorg/anddev/andengine/opengl/texture/Texture$PixelFormat;
		 (( org.anddev.andengine.opengl.texture.compressed.pvr.PVRTexture$PVRTextureFormat ) p1 ).getPixelFormat ( ); // invoke-virtual {p1}, Lorg/anddev/andengine/opengl/texture/compressed/pvr/PVRTexture$PVRTextureFormat;->getPixelFormat()Lorg/anddev/andengine/opengl/texture/Texture$PixelFormat;
		 /* if-eq v0, v1, :cond_2 */
		 /* new-instance v0, Ljava/lang/IllegalArgumentException; */
		 /* new-instance v1, Ljava/lang/StringBuilder; */
		 final String v2 = "Other PVRTextureFormat: \'"; // const-string v2, "Other PVRTextureFormat: \'"
		 /* invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V */
		 v2 = this.mPVRTextureHeader;
		 (( org.anddev.andengine.opengl.texture.compressed.pvr.PVRTexture$PVRTextureHeader ) v2 ).getPVRTextureFormat ( ); // invoke-virtual {v2}, Lorg/anddev/andengine/opengl/texture/compressed/pvr/PVRTexture$PVRTextureHeader;->getPVRTextureFormat()Lorg/anddev/andengine/opengl/texture/compressed/pvr/PVRTexture$PVRTextureFormat;
		 (( org.anddev.andengine.opengl.texture.compressed.pvr.PVRTexture$PVRTextureFormat ) v2 ).getPixelFormat ( ); // invoke-virtual {v2}, Lorg/anddev/andengine/opengl/texture/compressed/pvr/PVRTexture$PVRTextureFormat;->getPixelFormat()Lorg/anddev/andengine/opengl/texture/Texture$PixelFormat;
		 (( java.lang.StringBuilder ) v1 ).append ( v2 ); // invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;
		 final String v2 = "\' found than expected: \'"; // const-string v2, "\' found than expected: \'"
		 (( java.lang.StringBuilder ) v1 ).append ( v2 ); // invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
		 (( org.anddev.andengine.opengl.texture.compressed.pvr.PVRTexture$PVRTextureFormat ) p1 ).getPixelFormat ( ); // invoke-virtual {p1}, Lorg/anddev/andengine/opengl/texture/compressed/pvr/PVRTexture$PVRTextureFormat;->getPixelFormat()Lorg/anddev/andengine/opengl/texture/Texture$PixelFormat;
		 (( java.lang.StringBuilder ) v1 ).append ( v2 ); // invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;
		 final String v2 = "\'."; // const-string v2, "\'."
		 (( java.lang.StringBuilder ) v1 ).append ( v2 ); // invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
		 (( java.lang.StringBuilder ) v1 ).toString ( ); // invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
		 /* invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V */
		 /* throw v0 */
	 } // :cond_2
	 v0 = this.mPVRTextureHeader;
	 (( org.anddev.andengine.opengl.texture.compressed.pvr.PVRTexture$PVRTextureHeader ) v0 ).getPVRTextureFormat ( ); // invoke-virtual {v0}, Lorg/anddev/andengine/opengl/texture/compressed/pvr/PVRTexture$PVRTextureHeader;->getPVRTextureFormat()Lorg/anddev/andengine/opengl/texture/compressed/pvr/PVRTexture$PVRTextureFormat;
	 v0 = 	 (( org.anddev.andengine.opengl.texture.compressed.pvr.PVRTexture$PVRTextureFormat ) v0 ).isCompressed ( ); // invoke-virtual {v0}, Lorg/anddev/andengine/opengl/texture/compressed/pvr/PVRTexture$PVRTextureFormat;->isCompressed()Z
	 if ( v0 != null) { // if-eqz v0, :cond_3
		 /* new-instance v0, Ljava/lang/IllegalArgumentException; */
		 /* new-instance v1, Ljava/lang/StringBuilder; */
		 final String v2 = "Invalid PVRTextureFormat: \'"; // const-string v2, "Invalid PVRTextureFormat: \'"
		 /* invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V */
		 v2 = this.mPVRTextureHeader;
		 (( org.anddev.andengine.opengl.texture.compressed.pvr.PVRTexture$PVRTextureHeader ) v2 ).getPVRTextureFormat ( ); // invoke-virtual {v2}, Lorg/anddev/andengine/opengl/texture/compressed/pvr/PVRTexture$PVRTextureHeader;->getPVRTextureFormat()Lorg/anddev/andengine/opengl/texture/compressed/pvr/PVRTexture$PVRTextureFormat;
		 (( java.lang.StringBuilder ) v1 ).append ( v2 ); // invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;
		 final String v2 = "\'."; // const-string v2, "\'."
		 (( java.lang.StringBuilder ) v1 ).append ( v2 ); // invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
		 (( java.lang.StringBuilder ) v1 ).toString ( ); // invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
		 /* invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V */
		 /* throw v0 */
	 } // :cond_3
	 int v0 = 1; // const/4 v0, 0x1
	 /* iput-boolean v0, p0, Lorg/anddev/andengine/opengl/texture/compressed/pvr/PVRTexture;->mUpdateOnHardwareNeeded:Z */
	 return;
	 /* :catchall_1 */
	 /* move-exception v1 */
	 /* move-object v3, v1 */
	 /* move-object v1, v0 */
	 /* move-object v0, v3 */
} // .end method
/* # virtual methods */
protected void generateHardwareTextureID ( javax.microedition.khronos.opengles.GL10 p0 ) {
	 /* .locals 2 */
	 /* const/16 v0, 0xcf5 */
	 int v1 = 1; // const/4 v1, 0x1
	 /* invoke-super {p0, p1}, Lorg/anddev/andengine/opengl/texture/Texture;->generateHardwareTextureID(Ljavax/microedition/khronos/opengles/GL10;)V */
	 return;
} // .end method
public Integer getHeight ( ) {
	 /* .locals 1 */
	 v0 = this.mPVRTextureHeader;
	 v0 = 	 (( org.anddev.andengine.opengl.texture.compressed.pvr.PVRTexture$PVRTextureHeader ) v0 ).getHeight ( ); // invoke-virtual {v0}, Lorg/anddev/andengine/opengl/texture/compressed/pvr/PVRTexture$PVRTextureHeader;->getHeight()I
} // .end method
protected abstract java.io.InputStream getInputStream ( ) {
} // .end method
public org.anddev.andengine.opengl.texture.compressed.pvr.PVRTexture$PVRTextureHeader getPVRTextureHeader ( ) {
	 /* .locals 1 */
	 v0 = this.mPVRTextureHeader;
} // .end method
public Integer getWidth ( ) {
	 /* .locals 1 */
	 v0 = this.mPVRTextureHeader;
	 v0 = 	 (( org.anddev.andengine.opengl.texture.compressed.pvr.PVRTexture$PVRTextureHeader ) v0 ).getWidth ( ); // invoke-virtual {v0}, Lorg/anddev/andengine/opengl/texture/compressed/pvr/PVRTexture$PVRTextureHeader;->getWidth()I
} // .end method
protected void writeTextureToHardware ( javax.microedition.khronos.opengles.GL10 p0 ) {
	 /* .locals 20 */
	 /* invoke-virtual/range {p0 ..p0}, Lorg/anddev/andengine/opengl/texture/compressed/pvr/PVRTexture;->getInputStream()Ljava/io/InputStream; */
	 try { // :try_start_0
		 org.anddev.andengine.util.StreamUtils .streamToBytes ( v14 );
		 java.nio.ByteBuffer .wrap ( v15 );
		 (( java.nio.ByteBuffer ) v4 ).rewind ( ); // invoke-virtual {v4}, Ljava/nio/ByteBuffer;->rewind()Ljava/nio/Buffer;
		 v5 = java.nio.ByteOrder.LITTLE_ENDIAN;
		 (( java.nio.ByteBuffer ) v4 ).order ( v5 ); // invoke-virtual {v4, v5}, Ljava/nio/ByteBuffer;->order(Ljava/nio/ByteOrder;)Ljava/nio/ByteBuffer;
		 v4 = 		 /* invoke-virtual/range {p0 ..p0}, Lorg/anddev/andengine/opengl/texture/compressed/pvr/PVRTexture;->getWidth()I */
		 v5 = 		 /* invoke-virtual/range {p0 ..p0}, Lorg/anddev/andengine/opengl/texture/compressed/pvr/PVRTexture;->getHeight()I */
		 /* move-object/from16 v0, p0 */
		 v0 = this.mPVRTextureHeader;
		 /* move-object v6, v0 */
		 v16 = 		 (( org.anddev.andengine.opengl.texture.compressed.pvr.PVRTexture$PVRTextureHeader ) v6 ).getDataLength ( ); // invoke-virtual {v6}, Lorg/anddev/andengine/opengl/texture/compressed/pvr/PVRTexture$PVRTextureHeader;->getDataLength()I
		 /* move-object/from16 v0, p0 */
		 v0 = this.mPixelFormat;
		 /* move-object v6, v0 */
		 v7 = 		 (( org.anddev.andengine.opengl.texture.Texture$PixelFormat ) v6 ).getGLFormat ( ); // invoke-virtual {v6}, Lorg/anddev/andengine/opengl/texture/Texture$PixelFormat;->getGLFormat()I
		 /* move-object/from16 v0, p0 */
		 v0 = this.mPixelFormat;
		 /* move-object v6, v0 */
		 v12 = 		 (( org.anddev.andengine.opengl.texture.Texture$PixelFormat ) v6 ).getGLType ( ); // invoke-virtual {v6}, Lorg/anddev/andengine/opengl/texture/Texture$PixelFormat;->getGLType()I
		 /* move-object/from16 v0, p0 */
		 v0 = this.mPVRTextureHeader;
		 /* move-object v6, v0 */
		 (( org.anddev.andengine.opengl.texture.compressed.pvr.PVRTexture$PVRTextureHeader ) v6 ).getBitsPerPixel ( ); // invoke-virtual {v6}, Lorg/anddev/andengine/opengl/texture/compressed/pvr/PVRTexture$PVRTextureHeader;->getBitsPerPixel()I
		 /* :try_end_0 */
		 v17 = 		 /* .catchall {:try_start_0 ..:try_end_0} :catchall_0 */
		 int v6 = 0; // const/4 v6, 0x0
		 int v8 = 0; // const/4 v8, 0x0
		 /* move/from16 v18, v8 */
		 /* move v9, v5 */
		 /* move v8, v4 */
	 } // :goto_0
	 /* move/from16 v0, v18 */
	 /* move/from16 v1, v16 */
	 /* if-lt v0, v1, :cond_0 */
	 org.anddev.andengine.util.StreamUtils .close ( v14 );
	 return;
} // :cond_0
/* mul-int v4, v8, v9 */
try { // :try_start_1
	 /* div-int/lit8 v5, v17, 0x8 */
	 /* mul-int v19, v4, v5 */
	 /* invoke-static/range {v19 ..v19}, Ljava/nio/ByteBuffer;->allocate(I)Ljava/nio/ByteBuffer; */
	 java.nio.ByteOrder .nativeOrder ( );
	 (( java.nio.ByteBuffer ) v4 ).order ( v5 ); // invoke-virtual {v4, v5}, Ljava/nio/ByteBuffer;->order(Ljava/nio/ByteOrder;)Ljava/nio/ByteBuffer;
	 /* add-int/lit8 v4, v18, 0x34 */
	 /* move-object v0, v13 */
	 /* move-object v1, v15 */
	 /* move v2, v4 */
	 /* move/from16 v3, v19 */
	 (( java.nio.ByteBuffer ) v0 ).put ( v1, v2, v3 ); // invoke-virtual {v0, v1, v2, v3}, Ljava/nio/ByteBuffer;->put([BII)Ljava/nio/ByteBuffer;
	 /* if-lez v6, :cond_2 */
	 /* if-ne v8, v9, :cond_1 */
	 v4 = 	 org.anddev.andengine.util.MathUtils .nextPowerOfTwo ( v8 );
	 /* if-eq v4, v8, :cond_2 */
} // :cond_1
final String v4 = "Mipmap level \'%u\' is not squared.Texture won\'t render correctly.width: \'%u\', height: \'%u\'."; // const-string v4, "Mipmap level \'%u\' is not squared.Texture won\'t render correctly.width: \'%u\', height: \'%u\'."
int v5 = 3; // const/4 v5, 0x3
/* new-array v5, v5, [Ljava/lang/Object; */
int v10 = 0; // const/4 v10, 0x0
java.lang.Integer .valueOf ( v6 );
/* aput-object v11, v5, v10 */
int v10 = 1; // const/4 v10, 0x1
java.lang.Integer .valueOf ( v8 );
/* aput-object v11, v5, v10 */
int v10 = 2; // const/4 v10, 0x2
java.lang.Integer .valueOf ( v9 );
/* aput-object v11, v5, v10 */
java.lang.String .format ( v4,v5 );
org.anddev.andengine.util.Debug .w ( v4 );
} // :cond_2
/* const/16 v5, 0xde1 */
int v10 = 0; // const/4 v10, 0x0
/* move-object/from16 v4, p1 */
/* move v11, v7 */
/* invoke-interface/range {v4 ..v13}, Ljavax/microedition/khronos/opengles/GL10;->glTexImage2D(IIIIIIIILjava/nio/Buffer;)V */
/* invoke-static/range {p1 ..p1}, Lorg/anddev/andengine/opengl/util/GLHelper;->checkGLError(Ljavax/microedition/khronos/opengles/GL10;)V */
/* add-int v4, v18, v19 */
/* shr-int/lit8 v5, v8, 0x1 */
int v8 = 1; // const/4 v8, 0x1
v5 = java.lang.Math .max ( v5,v8 );
/* shr-int/lit8 v8, v9, 0x1 */
int v9 = 1; // const/4 v9, 0x1
java.lang.Math .max ( v8,v9 );
/* :try_end_1 */
v8 = /* .catchall {:try_start_1 ..:try_end_1} :catchall_0 */
/* add-int/lit8 v6, v6, 0x1 */
/* move/from16 v18, v4 */
/* move v9, v8 */
/* move v8, v5 */
/* :catchall_0 */
/* move-exception v4 */
org.anddev.andengine.util.StreamUtils .close ( v14 );
/* throw v4 */
} // .end method
