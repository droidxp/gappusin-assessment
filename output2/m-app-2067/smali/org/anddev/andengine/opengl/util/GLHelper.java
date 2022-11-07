public class org.anddev.andengine.opengl.util.GLHelper {
	 /* # static fields */
	 private static $SWITCH_TABLE$org$anddev$andengine$opengl$texture$Texture$PixelFormat; //synthetic
	 public static final Integer BYTES_PER_FLOAT;
	 public static final Integer BYTES_PER_PIXEL_RGBA;
	 public static Boolean EXTENSIONS_DRAWTEXTURE;
	 public static Boolean EXTENSIONS_VERTEXBUFFEROBJECTS;
	 private static final HARDWAREBUFFERID_CONTAINER;
	 private static final HARDWARETEXTUREID_CONTAINER;
	 private static final Boolean IS_LITTLE_ENDIAN;
	 private static Float sAlpha;
	 private static Float sBlue;
	 private static Integer sCurrentDestinationBlendMode;
	 private static Integer sCurrentHardwareBufferID;
	 private static Integer sCurrentHardwareTextureID;
	 private static Integer sCurrentMatrix;
	 private static Integer sCurrentSourceBlendMode;
	 private static org.anddev.andengine.opengl.util.FastFloatBuffer sCurrentTextureFloatBuffer;
	 private static org.anddev.andengine.opengl.texture.region.crop.TextureRegionCrop sCurrentTextureRegionCrop;
	 private static org.anddev.andengine.opengl.util.FastFloatBuffer sCurrentVertexFloatBuffer;
	 private static Boolean sEnableBlend;
	 private static Boolean sEnableCulling;
	 private static Boolean sEnableDepthTest;
	 private static Boolean sEnableDither;
	 private static Boolean sEnableLightning;
	 private static Boolean sEnableMultisample;
	 private static Boolean sEnableScissorTest;
	 private static Boolean sEnableTexCoordArray;
	 private static Boolean sEnableTextures;
	 private static Boolean sEnableVertexArray;
	 private static Float sGreen;
	 private static Float sLineWidth;
	 private static Float sRed;
	 /* # direct methods */
	 static $SWITCH_TABLE$org$anddev$andengine$opengl$texture$Texture$PixelFormat ( ) { //synthethic
		 /* .locals 3 */
		 v0 = org.anddev.andengine.opengl.util.GLHelper.$SWITCH_TABLE$org$anddev$andengine$opengl$texture$Texture$PixelFormat;
		 if ( v0 != null) { // if-eqz v0, :cond_0
		 } // :goto_0
	 } // :cond_0
	 org.anddev.andengine.opengl.texture.Texture$PixelFormat .values ( );
	 /* array-length v0, v0 */
	 /* new-array v0, v0, [I */
	 try { // :try_start_0
		 v1 = org.anddev.andengine.opengl.texture.Texture$PixelFormat.AI_8;
		 v1 = 		 (( org.anddev.andengine.opengl.texture.Texture$PixelFormat ) v1 ).ordinal ( ); // invoke-virtual {v1}, Lorg/anddev/andengine/opengl/texture/Texture$PixelFormat;->ordinal()I
		 /* const/16 v2, 0x8 */
		 /* aput v2, v0, v1 */
		 /* :try_end_0 */
		 /* .catch Ljava/lang/NoSuchFieldError; {:try_start_0 ..:try_end_0} :catch_7 */
	 } // :goto_1
	 try { // :try_start_1
		 v1 = org.anddev.andengine.opengl.texture.Texture$PixelFormat.A_8;
		 v1 = 		 (( org.anddev.andengine.opengl.texture.Texture$PixelFormat ) v1 ).ordinal ( ); // invoke-virtual {v1}, Lorg/anddev/andengine/opengl/texture/Texture$PixelFormat;->ordinal()I
		 int v2 = 6; // const/4 v2, 0x6
		 /* aput v2, v0, v1 */
		 /* :try_end_1 */
		 /* .catch Ljava/lang/NoSuchFieldError; {:try_start_1 ..:try_end_1} :catch_6 */
	 } // :goto_2
	 try { // :try_start_2
		 v1 = org.anddev.andengine.opengl.texture.Texture$PixelFormat.I_8;
		 v1 = 		 (( org.anddev.andengine.opengl.texture.Texture$PixelFormat ) v1 ).ordinal ( ); // invoke-virtual {v1}, Lorg/anddev/andengine/opengl/texture/Texture$PixelFormat;->ordinal()I
		 int v2 = 7; // const/4 v2, 0x7
		 /* aput v2, v0, v1 */
		 /* :try_end_2 */
		 /* .catch Ljava/lang/NoSuchFieldError; {:try_start_2 ..:try_end_2} :catch_5 */
	 } // :goto_3
	 try { // :try_start_3
		 v1 = org.anddev.andengine.opengl.texture.Texture$PixelFormat.RGBA_4444;
		 v1 = 		 (( org.anddev.andengine.opengl.texture.Texture$PixelFormat ) v1 ).ordinal ( ); // invoke-virtual {v1}, Lorg/anddev/andengine/opengl/texture/Texture$PixelFormat;->ordinal()I
		 int v2 = 2; // const/4 v2, 0x2
		 /* aput v2, v0, v1 */
		 /* :try_end_3 */
		 /* .catch Ljava/lang/NoSuchFieldError; {:try_start_3 ..:try_end_3} :catch_4 */
	 } // :goto_4
	 try { // :try_start_4
		 v1 = org.anddev.andengine.opengl.texture.Texture$PixelFormat.RGBA_5551;
		 v1 = 		 (( org.anddev.andengine.opengl.texture.Texture$PixelFormat ) v1 ).ordinal ( ); // invoke-virtual {v1}, Lorg/anddev/andengine/opengl/texture/Texture$PixelFormat;->ordinal()I
		 int v2 = 3; // const/4 v2, 0x3
		 /* aput v2, v0, v1 */
		 /* :try_end_4 */
		 /* .catch Ljava/lang/NoSuchFieldError; {:try_start_4 ..:try_end_4} :catch_3 */
	 } // :goto_5
	 try { // :try_start_5
		 v1 = org.anddev.andengine.opengl.texture.Texture$PixelFormat.RGBA_8888;
		 v1 = 		 (( org.anddev.andengine.opengl.texture.Texture$PixelFormat ) v1 ).ordinal ( ); // invoke-virtual {v1}, Lorg/anddev/andengine/opengl/texture/Texture$PixelFormat;->ordinal()I
		 int v2 = 4; // const/4 v2, 0x4
		 /* aput v2, v0, v1 */
		 /* :try_end_5 */
		 /* .catch Ljava/lang/NoSuchFieldError; {:try_start_5 ..:try_end_5} :catch_2 */
	 } // :goto_6
	 try { // :try_start_6
		 v1 = org.anddev.andengine.opengl.texture.Texture$PixelFormat.RGB_565;
		 v1 = 		 (( org.anddev.andengine.opengl.texture.Texture$PixelFormat ) v1 ).ordinal ( ); // invoke-virtual {v1}, Lorg/anddev/andengine/opengl/texture/Texture$PixelFormat;->ordinal()I
		 int v2 = 5; // const/4 v2, 0x5
		 /* aput v2, v0, v1 */
		 /* :try_end_6 */
		 /* .catch Ljava/lang/NoSuchFieldError; {:try_start_6 ..:try_end_6} :catch_1 */
	 } // :goto_7
	 try { // :try_start_7
		 v1 = org.anddev.andengine.opengl.texture.Texture$PixelFormat.UNDEFINED;
		 v1 = 		 (( org.anddev.andengine.opengl.texture.Texture$PixelFormat ) v1 ).ordinal ( ); // invoke-virtual {v1}, Lorg/anddev/andengine/opengl/texture/Texture$PixelFormat;->ordinal()I
		 int v2 = 1; // const/4 v2, 0x1
		 /* aput v2, v0, v1 */
		 /* :try_end_7 */
		 /* .catch Ljava/lang/NoSuchFieldError; {:try_start_7 ..:try_end_7} :catch_0 */
	 } // :goto_8
	 /* :catch_0 */
	 /* move-exception v1 */
	 /* :catch_1 */
	 /* move-exception v1 */
	 /* :catch_2 */
	 /* move-exception v1 */
	 /* :catch_3 */
	 /* move-exception v1 */
	 /* :catch_4 */
	 /* move-exception v1 */
	 /* :catch_5 */
	 /* move-exception v1 */
	 /* :catch_6 */
	 /* move-exception v1 */
	 /* :catch_7 */
	 /* move-exception v1 */
} // .end method
static org.anddev.andengine.opengl.util.GLHelper ( ) {
	 /* .locals 7 */
	 int v6 = 0; // const/4 v6, 0x0
	 /* const/high16 v5, -0x40800000 # -1.0f */
	 int v4 = -1; // const/4 v4, -0x1
	 int v3 = 1; // const/4 v3, 0x1
	 int v2 = 0; // const/4 v2, 0x0
	 java.nio.ByteOrder .nativeOrder ( );
	 v1 = java.nio.ByteOrder.LITTLE_ENDIAN;
	 /* if-ne v0, v1, :cond_0 */
	 /* move v0, v3 */
} // :goto_0
org.anddev.andengine.opengl.util.GLHelper.IS_LITTLE_ENDIAN = (v0!= 0);
/* new-array v0, v3, [I */
/* new-array v0, v3, [I */
org.anddev.andengine.opengl.util.GLHelper.sEnableDither = (v3!= 0);
org.anddev.andengine.opengl.util.GLHelper.sEnableLightning = (v3!= 0);
org.anddev.andengine.opengl.util.GLHelper.sEnableDepthTest = (v3!= 0);
org.anddev.andengine.opengl.util.GLHelper.sEnableMultisample = (v3!= 0);
org.anddev.andengine.opengl.util.GLHelper.sEnableScissorTest = (v2!= 0);
org.anddev.andengine.opengl.util.GLHelper.sEnableBlend = (v2!= 0);
org.anddev.andengine.opengl.util.GLHelper.sEnableCulling = (v2!= 0);
org.anddev.andengine.opengl.util.GLHelper.sEnableTextures = (v2!= 0);
org.anddev.andengine.opengl.util.GLHelper.sEnableTexCoordArray = (v2!= 0);
org.anddev.andengine.opengl.util.GLHelper.sEnableVertexArray = (v2!= 0);
/* const/high16 v0, 0x3f800000 # 1.0f */
org.anddev.andengine.opengl.util.GLHelper.EXTENSIONS_VERTEXBUFFEROBJECTS = (v2!= 0);
org.anddev.andengine.opengl.util.GLHelper.EXTENSIONS_DRAWTEXTURE = (v2!= 0);
return;
} // :cond_0
/* move v0, v2 */
} // .end method
public org.anddev.andengine.opengl.util.GLHelper ( ) {
/* .locals 0 */
/* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
return;
} // .end method
public static void bindBuffer ( javax.microedition.khronos.opengles.GL11 p0, Integer p1 ) {
/* .locals 1 */
/* if-eq v0, p1, :cond_0 */
/* const v0, 0x8892 */
} // :cond_0
return;
} // .end method
public static void bindTexture ( javax.microedition.khronos.opengles.GL10 p0, Integer p1 ) {
/* .locals 1 */
/* if-eq v0, p1, :cond_0 */
/* const/16 v0, 0xde1 */
} // :cond_0
return;
} // .end method
public static void blendFunction ( javax.microedition.khronos.opengles.GL10 p0, Integer p1, Integer p2 ) {
/* .locals 1 */
/* if-ne v0, p1, :cond_0 */
/* if-eq v0, p2, :cond_1 */
} // :cond_0
} // :cond_1
return;
} // .end method
public static void bufferData ( javax.microedition.khronos.opengles.GL11 p0, java.nio.ByteBuffer p1, Integer p2 ) {
/* .locals 2 */
/* const v0, 0x8892 */
v1 = (( java.nio.ByteBuffer ) p1 ).capacity ( ); // invoke-virtual {p1}, Ljava/nio/ByteBuffer;->capacity()I
return;
} // .end method
public static void checkGLError ( javax.microedition.khronos.opengles.GL10 p0 ) {
v0 = /* .locals 2 */
if ( v0 != null) { // if-eqz v0, :cond_0
/* new-instance v1, Landroid/opengl/GLException; */
/* invoke-direct {v1, v0}, Landroid/opengl/GLException;-><init>(I)V */
/* throw v1 */
} // :cond_0
return;
} // .end method
private static convertARGB_8888toARGB_4444 ( Integer[] p0 ) {
/* .locals 9 */
int v3 = 1; // const/4 v3, 0x1
/* array-length v0, p0 */
/* mul-int/lit8 v0, v0, 0x2 */
/* new-array v0, v0, [B */
/* sget-boolean v1, Lorg/anddev/andengine/opengl/util/GLHelper;->IS_LITTLE_ENDIAN:Z */
if ( v1 != null) { // if-eqz v1, :cond_2
/* array-length v1, p0 */
/* sub-int/2addr v1, v3 */
/* array-length v2, v0 */
/* sub-int/2addr v2, v3 */
/* move v8, v2 */
/* move v2, v1 */
/* move v1, v8 */
} // :goto_0
/* if-gez v2, :cond_1 */
} // :cond_0
} // :cond_1
/* aget v3, p0, v2 */
/* shr-int/lit8 v4, v3, 0x1c */
/* and-int/lit8 v4, v4, 0xf */
/* shr-int/lit8 v5, v3, 0x10 */
/* and-int/lit16 v5, v5, 0xf0 */
/* shr-int/lit8 v6, v3, 0x8 */
/* and-int/lit16 v6, v6, 0xf0 */
/* and-int/lit8 v3, v3, 0xf */
/* add-int/lit8 v7, v1, -0x1 */
/* or-int/2addr v4, v5 */
/* int-to-byte v4, v4 */
/* aput-byte v4, v0, v1 */
/* add-int/lit8 v1, v7, -0x1 */
/* or-int/2addr v3, v6 */
/* int-to-byte v3, v3 */
/* aput-byte v3, v0, v7 */
/* add-int/lit8 v2, v2, -0x1 */
} // :cond_2
/* array-length v1, p0 */
/* sub-int/2addr v1, v3 */
/* array-length v2, v0 */
/* sub-int/2addr v2, v3 */
/* move v8, v2 */
/* move v2, v1 */
/* move v1, v8 */
} // :goto_1
/* if-ltz v2, :cond_0 */
/* aget v3, p0, v2 */
/* shr-int/lit8 v4, v3, 0x1c */
/* and-int/lit8 v4, v4, 0xf */
/* shr-int/lit8 v5, v3, 0x10 */
/* and-int/lit16 v5, v5, 0xf0 */
/* shr-int/lit8 v6, v3, 0x8 */
/* and-int/lit16 v6, v6, 0xf0 */
/* and-int/lit8 v3, v3, 0xf */
/* add-int/lit8 v7, v1, -0x1 */
/* or-int/2addr v3, v6 */
/* int-to-byte v3, v3 */
/* aput-byte v3, v0, v1 */
/* add-int/lit8 v1, v7, -0x1 */
/* or-int v3, v4, v5 */
/* int-to-byte v3, v3 */
/* aput-byte v3, v0, v7 */
/* add-int/lit8 v2, v2, -0x1 */
} // .end method
private static convertARGB_8888toA_8 ( Integer[] p0 ) {
/* .locals 3 */
int v2 = 1; // const/4 v2, 0x1
/* array-length v0, p0 */
/* new-array v0, v0, [B */
/* sget-boolean v1, Lorg/anddev/andengine/opengl/util/GLHelper;->IS_LITTLE_ENDIAN:Z */
if ( v1 != null) { // if-eqz v1, :cond_2
/* array-length v1, p0 */
/* sub-int/2addr v1, v2 */
} // :goto_0
/* if-gez v1, :cond_1 */
} // :cond_0
} // :cond_1
/* aget v2, p0, v1 */
/* shr-int/lit8 v2, v2, 0x18 */
/* int-to-byte v2, v2 */
/* aput-byte v2, v0, v1 */
/* add-int/lit8 v1, v1, -0x1 */
} // :cond_2
/* array-length v1, p0 */
/* sub-int/2addr v1, v2 */
} // :goto_1
/* if-ltz v1, :cond_0 */
/* aget v2, p0, v1 */
/* and-int/lit16 v2, v2, 0xff */
/* int-to-byte v2, v2 */
/* aput-byte v2, v0, v1 */
/* add-int/lit8 v1, v1, -0x1 */
} // .end method
private static convertARGB_8888toRGBA_8888 ( Integer[] p0 ) {
/* .locals 4 */
int v1 = 1; // const/4 v1, 0x1
/* sget-boolean v0, Lorg/anddev/andengine/opengl/util/GLHelper;->IS_LITTLE_ENDIAN:Z */
if ( v0 != null) { // if-eqz v0, :cond_2
/* array-length v0, p0 */
/* sub-int/2addr v0, v1 */
} // :goto_0
/* if-gez v0, :cond_1 */
} // :cond_0
} // :cond_1
/* aget v1, p0, v0 */
/* const v2, -0xff0100 */
/* and-int/2addr v2, v1 */
/* and-int/lit16 v3, v1, 0xff */
/* shl-int/lit8 v3, v3, 0x10 */
/* or-int/2addr v2, v3 */
/* const/high16 v3, 0xff0000 */
/* and-int/2addr v1, v3 */
/* shr-int/lit8 v1, v1, 0x10 */
/* or-int/2addr v1, v2 */
/* aput v1, p0, v0 */
/* add-int/lit8 v0, v0, -0x1 */
} // :cond_2
/* array-length v0, p0 */
/* sub-int/2addr v0, v1 */
} // :goto_1
/* if-ltz v0, :cond_0 */
/* aget v1, p0, v0 */
/* const v2, 0xffffff */
/* and-int/2addr v2, v1 */
/* shl-int/lit8 v2, v2, 0x8 */
/* const/high16 v3, -0x1000000 */
/* and-int/2addr v1, v3 */
/* shr-int/lit8 v1, v1, 0x18 */
/* or-int/2addr v1, v2 */
/* aput v1, p0, v0 */
/* add-int/lit8 v0, v0, -0x1 */
} // .end method
private static convertARGB_8888toRGB_565 ( Integer[] p0 ) {
/* .locals 9 */
int v3 = 1; // const/4 v3, 0x1
/* array-length v0, p0 */
/* mul-int/lit8 v0, v0, 0x2 */
/* new-array v0, v0, [B */
/* sget-boolean v1, Lorg/anddev/andengine/opengl/util/GLHelper;->IS_LITTLE_ENDIAN:Z */
if ( v1 != null) { // if-eqz v1, :cond_2
/* array-length v1, p0 */
/* sub-int/2addr v1, v3 */
/* array-length v2, v0 */
/* sub-int/2addr v2, v3 */
/* move v8, v2 */
/* move v2, v1 */
/* move v1, v8 */
} // :goto_0
/* if-gez v2, :cond_1 */
} // :cond_0
} // :cond_1
/* aget v3, p0, v2 */
/* shr-int/lit8 v4, v3, 0x10 */
/* and-int/lit16 v4, v4, 0xff */
/* shr-int/lit8 v5, v3, 0x8 */
/* and-int/lit16 v5, v5, 0xff */
/* and-int/lit16 v3, v3, 0xff */
/* add-int/lit8 v6, v1, -0x1 */
/* and-int/lit16 v4, v4, 0xf8 */
/* shr-int/lit8 v7, v5, 0x5 */
/* or-int/2addr v4, v7 */
/* int-to-byte v4, v4 */
/* aput-byte v4, v0, v1 */
/* add-int/lit8 v1, v6, -0x1 */
/* shl-int/lit8 v4, v5, 0x3 */
/* and-int/lit16 v4, v4, 0xe0 */
/* shr-int/lit8 v3, v3, 0x3 */
/* or-int/2addr v3, v4 */
/* int-to-byte v3, v3 */
/* aput-byte v3, v0, v6 */
/* add-int/lit8 v2, v2, -0x1 */
} // :cond_2
/* array-length v1, p0 */
/* sub-int/2addr v1, v3 */
/* array-length v2, v0 */
/* sub-int/2addr v2, v3 */
/* move v8, v2 */
/* move v2, v1 */
/* move v1, v8 */
} // :goto_1
/* if-ltz v2, :cond_0 */
/* aget v3, p0, v2 */
/* shr-int/lit8 v4, v3, 0x10 */
/* and-int/lit16 v4, v4, 0xff */
/* shr-int/lit8 v5, v3, 0x8 */
/* and-int/lit16 v5, v5, 0xff */
/* and-int/lit16 v3, v3, 0xff */
/* add-int/lit8 v6, v1, -0x1 */
/* shl-int/lit8 v7, v5, 0x3 */
/* and-int/lit16 v7, v7, 0xe0 */
/* shr-int/lit8 v3, v3, 0x3 */
/* or-int/2addr v3, v7 */
/* int-to-byte v3, v3 */
/* aput-byte v3, v0, v1 */
/* add-int/lit8 v1, v6, -0x1 */
/* and-int/lit16 v3, v4, 0xf8 */
/* shr-int/lit8 v4, v5, 0x5 */
/* or-int/2addr v3, v4 */
/* int-to-byte v3, v3 */
/* aput-byte v3, v0, v6 */
/* add-int/lit8 v2, v2, -0x1 */
} // .end method
public static void deleteBuffer ( javax.microedition.khronos.opengles.GL11 p0, Integer p1 ) {
/* .locals 3 */
int v2 = 0; // const/4 v2, 0x0
v0 = org.anddev.andengine.opengl.util.GLHelper.HARDWAREBUFFERID_CONTAINER;
/* aput p1, v0, v2 */
int v0 = 1; // const/4 v0, 0x1
v1 = org.anddev.andengine.opengl.util.GLHelper.HARDWAREBUFFERID_CONTAINER;
return;
} // .end method
public static void deleteTexture ( javax.microedition.khronos.opengles.GL10 p0, Integer p1 ) {
/* .locals 3 */
int v2 = 0; // const/4 v2, 0x0
v0 = org.anddev.andengine.opengl.util.GLHelper.HARDWARETEXTUREID_CONTAINER;
/* aput p1, v0, v2 */
int v0 = 1; // const/4 v0, 0x1
v1 = org.anddev.andengine.opengl.util.GLHelper.HARDWARETEXTUREID_CONTAINER;
return;
} // .end method
public static void disableBlend ( javax.microedition.khronos.opengles.GL10 p0 ) {
/* .locals 1 */
/* sget-boolean v0, Lorg/anddev/andengine/opengl/util/GLHelper;->sEnableBlend:Z */
if ( v0 != null) { // if-eqz v0, :cond_0
int v0 = 0; // const/4 v0, 0x0
org.anddev.andengine.opengl.util.GLHelper.sEnableBlend = (v0!= 0);
/* const/16 v0, 0xbe2 */
} // :cond_0
return;
} // .end method
public static void disableCulling ( javax.microedition.khronos.opengles.GL10 p0 ) {
/* .locals 1 */
/* sget-boolean v0, Lorg/anddev/andengine/opengl/util/GLHelper;->sEnableCulling:Z */
if ( v0 != null) { // if-eqz v0, :cond_0
int v0 = 0; // const/4 v0, 0x0
org.anddev.andengine.opengl.util.GLHelper.sEnableCulling = (v0!= 0);
/* const/16 v0, 0xb44 */
} // :cond_0
return;
} // .end method
public static void disableDepthTest ( javax.microedition.khronos.opengles.GL10 p0 ) {
/* .locals 1 */
/* sget-boolean v0, Lorg/anddev/andengine/opengl/util/GLHelper;->sEnableDepthTest:Z */
if ( v0 != null) { // if-eqz v0, :cond_0
int v0 = 0; // const/4 v0, 0x0
org.anddev.andengine.opengl.util.GLHelper.sEnableDepthTest = (v0!= 0);
/* const/16 v0, 0xb71 */
} // :cond_0
return;
} // .end method
public static void disableDither ( javax.microedition.khronos.opengles.GL10 p0 ) {
/* .locals 1 */
/* sget-boolean v0, Lorg/anddev/andengine/opengl/util/GLHelper;->sEnableDither:Z */
if ( v0 != null) { // if-eqz v0, :cond_0
int v0 = 0; // const/4 v0, 0x0
org.anddev.andengine.opengl.util.GLHelper.sEnableDither = (v0!= 0);
/* const/16 v0, 0xbd0 */
} // :cond_0
return;
} // .end method
public static void disableLightning ( javax.microedition.khronos.opengles.GL10 p0 ) {
/* .locals 1 */
/* sget-boolean v0, Lorg/anddev/andengine/opengl/util/GLHelper;->sEnableLightning:Z */
if ( v0 != null) { // if-eqz v0, :cond_0
int v0 = 0; // const/4 v0, 0x0
org.anddev.andengine.opengl.util.GLHelper.sEnableLightning = (v0!= 0);
/* const/16 v0, 0xb50 */
} // :cond_0
return;
} // .end method
public static void disableMultisample ( javax.microedition.khronos.opengles.GL10 p0 ) {
/* .locals 1 */
/* sget-boolean v0, Lorg/anddev/andengine/opengl/util/GLHelper;->sEnableMultisample:Z */
if ( v0 != null) { // if-eqz v0, :cond_0
int v0 = 0; // const/4 v0, 0x0
org.anddev.andengine.opengl.util.GLHelper.sEnableMultisample = (v0!= 0);
/* const v0, 0x809d */
} // :cond_0
return;
} // .end method
public static void disableScissorTest ( javax.microedition.khronos.opengles.GL10 p0 ) {
/* .locals 1 */
/* sget-boolean v0, Lorg/anddev/andengine/opengl/util/GLHelper;->sEnableScissorTest:Z */
if ( v0 != null) { // if-eqz v0, :cond_0
int v0 = 0; // const/4 v0, 0x0
org.anddev.andengine.opengl.util.GLHelper.sEnableScissorTest = (v0!= 0);
/* const/16 v0, 0xc11 */
} // :cond_0
return;
} // .end method
public static void disableTexCoordArray ( javax.microedition.khronos.opengles.GL10 p0 ) {
/* .locals 1 */
/* sget-boolean v0, Lorg/anddev/andengine/opengl/util/GLHelper;->sEnableTexCoordArray:Z */
if ( v0 != null) { // if-eqz v0, :cond_0
int v0 = 0; // const/4 v0, 0x0
org.anddev.andengine.opengl.util.GLHelper.sEnableTexCoordArray = (v0!= 0);
/* const v0, 0x8078 */
} // :cond_0
return;
} // .end method
public static void disableTextures ( javax.microedition.khronos.opengles.GL10 p0 ) {
/* .locals 1 */
/* sget-boolean v0, Lorg/anddev/andengine/opengl/util/GLHelper;->sEnableTextures:Z */
if ( v0 != null) { // if-eqz v0, :cond_0
int v0 = 0; // const/4 v0, 0x0
org.anddev.andengine.opengl.util.GLHelper.sEnableTextures = (v0!= 0);
/* const/16 v0, 0xde1 */
} // :cond_0
return;
} // .end method
public static void disableVertexArray ( javax.microedition.khronos.opengles.GL10 p0 ) {
/* .locals 1 */
/* sget-boolean v0, Lorg/anddev/andengine/opengl/util/GLHelper;->sEnableVertexArray:Z */
if ( v0 != null) { // if-eqz v0, :cond_0
int v0 = 0; // const/4 v0, 0x0
org.anddev.andengine.opengl.util.GLHelper.sEnableVertexArray = (v0!= 0);
/* const v0, 0x8074 */
} // :cond_0
return;
} // .end method
public static void enableBlend ( javax.microedition.khronos.opengles.GL10 p0 ) {
/* .locals 1 */
/* sget-boolean v0, Lorg/anddev/andengine/opengl/util/GLHelper;->sEnableBlend:Z */
/* if-nez v0, :cond_0 */
int v0 = 1; // const/4 v0, 0x1
org.anddev.andengine.opengl.util.GLHelper.sEnableBlend = (v0!= 0);
/* const/16 v0, 0xbe2 */
} // :cond_0
return;
} // .end method
public static void enableCulling ( javax.microedition.khronos.opengles.GL10 p0 ) {
/* .locals 1 */
/* sget-boolean v0, Lorg/anddev/andengine/opengl/util/GLHelper;->sEnableCulling:Z */
/* if-nez v0, :cond_0 */
int v0 = 1; // const/4 v0, 0x1
org.anddev.andengine.opengl.util.GLHelper.sEnableCulling = (v0!= 0);
/* const/16 v0, 0xb44 */
} // :cond_0
return;
} // .end method
public static void enableDepthTest ( javax.microedition.khronos.opengles.GL10 p0 ) {
/* .locals 1 */
/* sget-boolean v0, Lorg/anddev/andengine/opengl/util/GLHelper;->sEnableDepthTest:Z */
/* if-nez v0, :cond_0 */
int v0 = 1; // const/4 v0, 0x1
org.anddev.andengine.opengl.util.GLHelper.sEnableDepthTest = (v0!= 0);
/* const/16 v0, 0xb71 */
} // :cond_0
return;
} // .end method
public static void enableDither ( javax.microedition.khronos.opengles.GL10 p0 ) {
/* .locals 1 */
/* sget-boolean v0, Lorg/anddev/andengine/opengl/util/GLHelper;->sEnableDither:Z */
/* if-nez v0, :cond_0 */
int v0 = 1; // const/4 v0, 0x1
org.anddev.andengine.opengl.util.GLHelper.sEnableDither = (v0!= 0);
/* const/16 v0, 0xbd0 */
} // :cond_0
return;
} // .end method
public static void enableExtensions ( javax.microedition.khronos.opengles.GL10 p0, org.anddev.andengine.engine.options.RenderOptions p1 ) {
/* .locals 7 */
int v6 = 1; // const/4 v6, 0x1
int v5 = 0; // const/4 v5, 0x0
/* const/16 v0, 0x1f02 */
/* const/16 v1, 0x1f01 */
/* const/16 v2, 0x1f03 */
/* new-instance v3, Ljava/lang/StringBuilder; */
final String v4 = "RENDERER: "; // const-string v4, "RENDERER: "
/* invoke-direct {v3, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V */
(( java.lang.StringBuilder ) v3 ).append ( v1 ); // invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v3 ).toString ( ); // invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
org.anddev.andengine.util.Debug .d ( v3 );
/* new-instance v3, Ljava/lang/StringBuilder; */
final String v4 = "VERSION: "; // const-string v4, "VERSION: "
/* invoke-direct {v3, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V */
(( java.lang.StringBuilder ) v3 ).append ( v0 ); // invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v3 ).toString ( ); // invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
org.anddev.andengine.util.Debug .d ( v3 );
/* new-instance v3, Ljava/lang/StringBuilder; */
final String v4 = "EXTENSIONS: "; // const-string v4, "EXTENSIONS: "
/* invoke-direct {v3, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V */
(( java.lang.StringBuilder ) v3 ).append ( v2 ); // invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v3 ).toString ( ); // invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
org.anddev.andengine.util.Debug .d ( v3 );
final String v3 = "1.0"; // const-string v3, "1.0"
v0 = (( java.lang.String ) v0 ).contains ( v3 ); // invoke-virtual {v0, v3}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z
final String v3 = "PixelFlinger"; // const-string v3, "PixelFlinger"
v1 = (( java.lang.String ) v1 ).contains ( v3 ); // invoke-virtual {v1, v3}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z
final String v3 = "_vertex_buffer_object"; // const-string v3, "_vertex_buffer_object"
v3 = (( java.lang.String ) v2 ).contains ( v3 ); // invoke-virtual {v2, v3}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z
final String v4 = "draw_texture"; // const-string v4, "draw_texture"
v2 = (( java.lang.String ) v2 ).contains ( v4 ); // invoke-virtual {v2, v4}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z
v4 = (( org.anddev.andengine.engine.options.RenderOptions ) p1 ).isDisableExtensionVertexBufferObjects ( ); // invoke-virtual {p1}, Lorg/anddev/andengine/engine/options/RenderOptions;->isDisableExtensionVertexBufferObjects()Z
/* if-nez v4, :cond_2 */
/* if-nez v1, :cond_2 */
/* if-nez v3, :cond_0 */
/* if-nez v0, :cond_2 */
} // :cond_0
/* move v1, v6 */
} // :goto_0
org.anddev.andengine.opengl.util.GLHelper.EXTENSIONS_VERTEXBUFFEROBJECTS = (v1!= 0);
v1 = (( org.anddev.andengine.engine.options.RenderOptions ) p1 ).isDisableExtensionVertexBufferObjects ( ); // invoke-virtual {p1}, Lorg/anddev/andengine/engine/options/RenderOptions;->isDisableExtensionVertexBufferObjects()Z
/* if-nez v1, :cond_3 */
/* if-nez v2, :cond_1 */
/* if-nez v0, :cond_3 */
} // :cond_1
/* move v0, v6 */
} // :goto_1
org.anddev.andengine.opengl.util.GLHelper.EXTENSIONS_DRAWTEXTURE = (v0!= 0);
org.anddev.andengine.opengl.util.GLHelper .hackBrokenDevices ( );
/* new-instance v0, Ljava/lang/StringBuilder; */
final String v1 = "EXTENSIONS_VERXTEXBUFFEROBJECTS = "; // const-string v1, "EXTENSIONS_VERXTEXBUFFEROBJECTS = "
/* invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V */
/* sget-boolean v1, Lorg/anddev/andengine/opengl/util/GLHelper;->EXTENSIONS_VERTEXBUFFEROBJECTS:Z */
(( java.lang.StringBuilder ) v0 ).append ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v0 ).toString ( ); // invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
org.anddev.andengine.util.Debug .d ( v0 );
/* new-instance v0, Ljava/lang/StringBuilder; */
final String v1 = "EXTENSIONS_DRAWTEXTURE = "; // const-string v1, "EXTENSIONS_DRAWTEXTURE = "
/* invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V */
/* sget-boolean v1, Lorg/anddev/andengine/opengl/util/GLHelper;->EXTENSIONS_DRAWTEXTURE:Z */
(( java.lang.StringBuilder ) v0 ).append ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v0 ).toString ( ); // invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
org.anddev.andengine.util.Debug .d ( v0 );
return;
} // :cond_2
/* move v1, v5 */
} // :cond_3
/* move v0, v5 */
} // .end method
public static void enableLightning ( javax.microedition.khronos.opengles.GL10 p0 ) {
/* .locals 1 */
/* sget-boolean v0, Lorg/anddev/andengine/opengl/util/GLHelper;->sEnableLightning:Z */
/* if-nez v0, :cond_0 */
int v0 = 1; // const/4 v0, 0x1
org.anddev.andengine.opengl.util.GLHelper.sEnableLightning = (v0!= 0);
/* const/16 v0, 0xb50 */
} // :cond_0
return;
} // .end method
public static void enableMultisample ( javax.microedition.khronos.opengles.GL10 p0 ) {
/* .locals 1 */
/* sget-boolean v0, Lorg/anddev/andengine/opengl/util/GLHelper;->sEnableMultisample:Z */
/* if-nez v0, :cond_0 */
int v0 = 1; // const/4 v0, 0x1
org.anddev.andengine.opengl.util.GLHelper.sEnableMultisample = (v0!= 0);
/* const v0, 0x809d */
} // :cond_0
return;
} // .end method
public static void enableScissorTest ( javax.microedition.khronos.opengles.GL10 p0 ) {
/* .locals 1 */
/* sget-boolean v0, Lorg/anddev/andengine/opengl/util/GLHelper;->sEnableScissorTest:Z */
/* if-nez v0, :cond_0 */
int v0 = 1; // const/4 v0, 0x1
org.anddev.andengine.opengl.util.GLHelper.sEnableScissorTest = (v0!= 0);
/* const/16 v0, 0xc11 */
} // :cond_0
return;
} // .end method
public static void enableTexCoordArray ( javax.microedition.khronos.opengles.GL10 p0 ) {
/* .locals 1 */
/* sget-boolean v0, Lorg/anddev/andengine/opengl/util/GLHelper;->sEnableTexCoordArray:Z */
/* if-nez v0, :cond_0 */
int v0 = 1; // const/4 v0, 0x1
org.anddev.andengine.opengl.util.GLHelper.sEnableTexCoordArray = (v0!= 0);
/* const v0, 0x8078 */
} // :cond_0
return;
} // .end method
public static void enableTextures ( javax.microedition.khronos.opengles.GL10 p0 ) {
/* .locals 1 */
/* sget-boolean v0, Lorg/anddev/andengine/opengl/util/GLHelper;->sEnableTextures:Z */
/* if-nez v0, :cond_0 */
int v0 = 1; // const/4 v0, 0x1
org.anddev.andengine.opengl.util.GLHelper.sEnableTextures = (v0!= 0);
/* const/16 v0, 0xde1 */
} // :cond_0
return;
} // .end method
public static void enableVertexArray ( javax.microedition.khronos.opengles.GL10 p0 ) {
/* .locals 1 */
/* sget-boolean v0, Lorg/anddev/andengine/opengl/util/GLHelper;->sEnableVertexArray:Z */
/* if-nez v0, :cond_0 */
int v0 = 1; // const/4 v0, 0x1
org.anddev.andengine.opengl.util.GLHelper.sEnableVertexArray = (v0!= 0);
/* const v0, 0x8074 */
} // :cond_0
return;
} // .end method
public static void forceBindTexture ( javax.microedition.khronos.opengles.GL10 p0, Integer p1 ) {
/* .locals 1 */
/* const/16 v0, 0xde1 */
return;
} // .end method
public static getPixelsARGB_8888 ( android.graphics.Bitmap p0 ) {
/* .locals 8 */
int v2 = 0; // const/4 v2, 0x0
v3 = (( android.graphics.Bitmap ) p0 ).getWidth ( ); // invoke-virtual {p0}, Landroid/graphics/Bitmap;->getWidth()I
v7 = (( android.graphics.Bitmap ) p0 ).getHeight ( ); // invoke-virtual {p0}, Landroid/graphics/Bitmap;->getHeight()I
/* mul-int v0, v3, v7 */
/* new-array v1, v0, [I */
/* move-object v0, p0 */
/* move v4, v2 */
/* move v5, v2 */
/* move v6, v3 */
/* invoke-virtual/range {v0 ..v7}, Landroid/graphics/Bitmap;->getPixels([IIIIIII)V */
} // .end method
public static void glTexSubImage2D ( javax.microedition.khronos.opengles.GL10 p0, Integer p1, Integer p2, Integer p3, Integer p4, android.graphics.Bitmap p5, org.anddev.andengine.opengl.texture.Texture$PixelFormat p6 ) {
/* .locals 12 */
/* invoke-static/range {p5 ..p5}, Lorg/anddev/andengine/opengl/util/GLHelper;->getPixelsARGB_8888(Landroid/graphics/Bitmap;)[I */
org.anddev.andengine.opengl.util.GLHelper .$SWITCH_TABLE$org$anddev$andengine$opengl$texture$Texture$PixelFormat ( );
v4 = /* invoke-virtual/range {p6 ..p6}, Lorg/anddev/andengine/opengl/texture/Texture$PixelFormat;->ordinal()I */
/* aget v3, v3, v4 */
/* packed-switch v3, :pswitch_data_0 */
/* :pswitch_0 */
/* new-instance p0, Ljava/lang/IllegalArgumentException; */
/* new-instance p1, Ljava/lang/StringBuilder; */
final String p2 = "Unexpected pTextureFormat: \'"; // const-string p2, "Unexpected pTextureFormat: \'"
/* invoke-direct {p1, p2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V */
/* move-object v0, p1 */
/* move-object/from16 v1, p6 */
(( java.lang.StringBuilder ) v0 ).append ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;
final String p2 = "\'."; // const-string p2, "\'."
(( java.lang.StringBuilder ) p1 ).append ( p2 ); // invoke-virtual {p1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) p1 ).toString ( ); // invoke-virtual {p1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
/* invoke-direct {p0, p1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V */
/* throw p0 */
/* :pswitch_1 */
org.anddev.andengine.opengl.util.GLHelper .convertARGB_8888toRGB_565 ( v2 );
java.nio.ByteBuffer .wrap ( v2 );
/* move-object v11, v2 */
} // :goto_0
v7 = /* invoke-virtual/range {p5 ..p5}, Landroid/graphics/Bitmap;->getWidth()I */
v8 = /* invoke-virtual/range {p5 ..p5}, Landroid/graphics/Bitmap;->getHeight()I */
v9 = /* invoke-virtual/range {p6 ..p6}, Lorg/anddev/andengine/opengl/texture/Texture$PixelFormat;->getGLFormat()I */
v10 = /* invoke-virtual/range {p6 ..p6}, Lorg/anddev/andengine/opengl/texture/Texture$PixelFormat;->getGLType()I */
/* move-object v2, p0 */
/* move v3, p1 */
/* move v4, p2 */
/* move v5, p3 */
/* move/from16 v6, p4 */
/* invoke-interface/range {v2 ..v11}, Ljavax/microedition/khronos/opengles/GL10;->glTexSubImage2D(IIIIIIIILjava/nio/Buffer;)V */
return;
/* :pswitch_2 */
org.anddev.andengine.opengl.util.GLHelper .convertARGB_8888toRGBA_8888 ( v2 );
java.nio.IntBuffer .wrap ( v2 );
/* move-object v11, v2 */
/* :pswitch_3 */
org.anddev.andengine.opengl.util.GLHelper .convertARGB_8888toARGB_4444 ( v2 );
java.nio.ByteBuffer .wrap ( v2 );
/* move-object v11, v2 */
/* :pswitch_4 */
org.anddev.andengine.opengl.util.GLHelper .convertARGB_8888toA_8 ( v2 );
java.nio.ByteBuffer .wrap ( v2 );
/* move-object v11, v2 */
/* :pswitch_data_0 */
/* .packed-switch 0x2 */
/* :pswitch_3 */
/* :pswitch_0 */
/* :pswitch_2 */
/* :pswitch_1 */
/* :pswitch_4 */
} // .end packed-switch
} // .end method
private static void hackBrokenDevices ( ) {
/* .locals 2 */
v0 = android.os.Build.PRODUCT;
final String v1 = "morrison"; // const-string v1, "morrison"
v0 = (( java.lang.String ) v0 ).contains ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z
if ( v0 != null) { // if-eqz v0, :cond_0
int v0 = 0; // const/4 v0, 0x0
org.anddev.andengine.opengl.util.GLHelper.EXTENSIONS_VERTEXBUFFEROBJECTS = (v0!= 0);
} // :cond_0
return;
} // .end method
public static void lineWidth ( javax.microedition.khronos.opengles.GL10 p0, Float p1 ) {
/* .locals 1 */
/* cmpl-float v0, v0, p1 */
if ( v0 != null) { // if-eqz v0, :cond_0
} // :cond_0
return;
} // .end method
public static void reset ( javax.microedition.khronos.opengles.GL10 p0 ) {
/* .locals 4 */
int v3 = 0; // const/4 v3, 0x0
int v2 = 0; // const/4 v2, 0x0
/* const/high16 v1, -0x40800000 # -1.0f */
int v0 = -1; // const/4 v0, -0x1
org.anddev.andengine.opengl.util.GLHelper .enableDither ( p0 );
org.anddev.andengine.opengl.util.GLHelper .enableLightning ( p0 );
org.anddev.andengine.opengl.util.GLHelper .enableDepthTest ( p0 );
org.anddev.andengine.opengl.util.GLHelper .enableMultisample ( p0 );
org.anddev.andengine.opengl.util.GLHelper .disableBlend ( p0 );
org.anddev.andengine.opengl.util.GLHelper .disableCulling ( p0 );
org.anddev.andengine.opengl.util.GLHelper .disableTextures ( p0 );
org.anddev.andengine.opengl.util.GLHelper .disableTexCoordArray ( p0 );
org.anddev.andengine.opengl.util.GLHelper .disableVertexArray ( p0 );
/* const/high16 v0, 0x3f800000 # 1.0f */
org.anddev.andengine.opengl.util.GLHelper.EXTENSIONS_VERTEXBUFFEROBJECTS = (v3!= 0);
org.anddev.andengine.opengl.util.GLHelper.EXTENSIONS_DRAWTEXTURE = (v3!= 0);
return;
} // .end method
public static void setColor ( javax.microedition.khronos.opengles.GL10 p0, Float p1, Float p2, Float p3, Float p4 ) {
/* .locals 1 */
/* cmpl-float v0, p4, v0 */
/* if-nez v0, :cond_0 */
/* cmpl-float v0, p1, v0 */
/* if-nez v0, :cond_0 */
/* cmpl-float v0, p2, v0 */
/* if-nez v0, :cond_0 */
/* cmpl-float v0, p3, v0 */
if ( v0 != null) { // if-eqz v0, :cond_1
} // :cond_0
} // :cond_1
return;
} // .end method
public static void setModelViewIdentityMatrix ( javax.microedition.khronos.opengles.GL10 p0 ) {
/* .locals 0 */
org.anddev.andengine.opengl.util.GLHelper .switchToModelViewMatrix ( p0 );
return;
} // .end method
public static void setPerspectiveCorrectionHintFastest ( javax.microedition.khronos.opengles.GL10 p0 ) {
/* .locals 2 */
/* const/16 v0, 0xc50 */
/* const/16 v1, 0x1101 */
return;
} // .end method
public static void setProjectionIdentityMatrix ( javax.microedition.khronos.opengles.GL10 p0 ) {
/* .locals 0 */
org.anddev.andengine.opengl.util.GLHelper .switchToProjectionMatrix ( p0 );
return;
} // .end method
public static void setShadeModelFlat ( javax.microedition.khronos.opengles.GL10 p0 ) {
/* .locals 1 */
/* const/16 v0, 0x1d00 */
return;
} // .end method
public static void switchToModelViewMatrix ( javax.microedition.khronos.opengles.GL10 p0 ) {
/* .locals 2 */
/* const/16 v1, 0x1700 */
/* if-eq v0, v1, :cond_0 */
} // :cond_0
return;
} // .end method
public static void switchToProjectionMatrix ( javax.microedition.khronos.opengles.GL10 p0 ) {
/* .locals 2 */
/* const/16 v1, 0x1701 */
/* if-eq v0, v1, :cond_0 */
} // :cond_0
return;
} // .end method
public static void texCoordPointer ( javax.microedition.khronos.opengles.GL10 p0, org.anddev.andengine.opengl.util.FastFloatBuffer p1 ) {
/* .locals 4 */
v0 = org.anddev.andengine.opengl.util.GLHelper.sCurrentTextureFloatBuffer;
/* if-eq v0, p1, :cond_0 */
int v0 = 2; // const/4 v0, 0x2
/* const/16 v1, 0x1406 */
int v2 = 0; // const/4 v2, 0x0
v3 = this.mByteBuffer;
} // :cond_0
return;
} // .end method
public static void texCoordZeroPointer ( javax.microedition.khronos.opengles.GL11 p0 ) {
/* .locals 3 */
int v2 = 0; // const/4 v2, 0x0
int v0 = 2; // const/4 v0, 0x2
/* const/16 v1, 0x1406 */
return;
} // .end method
public static void textureCrop ( javax.microedition.khronos.opengles.GL11 p0, org.anddev.andengine.opengl.texture.region.crop.TextureRegionCrop p1 ) {
/* .locals 4 */
v0 = org.anddev.andengine.opengl.util.GLHelper.sCurrentTextureRegionCrop;
/* if-ne p1, v0, :cond_0 */
v0 = (( org.anddev.andengine.opengl.texture.region.crop.TextureRegionCrop ) p1 ).isDirty ( ); // invoke-virtual {p1}, Lorg/anddev/andengine/opengl/texture/region/crop/TextureRegionCrop;->isDirty()Z
if ( v0 != null) { // if-eqz v0, :cond_1
} // :cond_0
/* const/16 v0, 0xde1 */
/* const v1, 0x8b9d */
(( org.anddev.andengine.opengl.texture.region.crop.TextureRegionCrop ) p1 ).getData ( ); // invoke-virtual {p1}, Lorg/anddev/andengine/opengl/texture/region/crop/TextureRegionCrop;->getData()[I
int v3 = 0; // const/4 v3, 0x0
} // :cond_1
return;
} // .end method
public static void vertexPointer ( javax.microedition.khronos.opengles.GL10 p0, org.anddev.andengine.opengl.util.FastFloatBuffer p1 ) {
/* .locals 4 */
v0 = org.anddev.andengine.opengl.util.GLHelper.sCurrentVertexFloatBuffer;
/* if-eq v0, p1, :cond_0 */
int v0 = 2; // const/4 v0, 0x2
/* const/16 v1, 0x1406 */
int v2 = 0; // const/4 v2, 0x0
v3 = this.mByteBuffer;
} // :cond_0
return;
} // .end method
public static void vertexZeroPointer ( javax.microedition.khronos.opengles.GL11 p0 ) {
/* .locals 3 */
int v2 = 0; // const/4 v2, 0x0
int v0 = 2; // const/4 v0, 0x2
/* const/16 v1, 0x1406 */
return;
} // .end method
