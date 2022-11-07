public class inal extends java.lang.Enum {
	 /* # static fields */
	 public static final org.anddev.andengine.opengl.texture.Texture$PixelFormat AI_8;
	 public static final org.anddev.andengine.opengl.texture.Texture$PixelFormat A_8;
	 private static final org.anddev.andengine.opengl.texture.Texture$PixelFormat ENUM$VALUES; //synthetic
	 public static final org.anddev.andengine.opengl.texture.Texture$PixelFormat I_8;
	 public static final org.anddev.andengine.opengl.texture.Texture$PixelFormat RGBA_4444;
	 public static final org.anddev.andengine.opengl.texture.Texture$PixelFormat RGBA_5551;
	 public static final org.anddev.andengine.opengl.texture.Texture$PixelFormat RGBA_8888;
	 public static final org.anddev.andengine.opengl.texture.Texture$PixelFormat RGB_565;
	 public static final org.anddev.andengine.opengl.texture.Texture$PixelFormat UNDEFINED;
	 /* # instance fields */
	 private final Integer mBitsPerPixel;
	 private final Integer mGLFormat;
	 private final Integer mGLType;
	 /* # direct methods */
	 static inal ( ) {
		 /* .locals 10 */
		 /* const/16 v9, 0x1908 */
		 /* const/16 v8, 0x8 */
		 int v3 = -1; // const/4 v3, -0x1
		 /* const/16 v7, 0x1401 */
		 /* const/16 v6, 0x10 */
		 /* new-instance v0, Lorg/anddev/andengine/opengl/texture/Texture$PixelFormat; */
		 final String v1 = "UNDEFINED"; // const-string v1, "UNDEFINED"
		 int v2 = 0; // const/4 v2, 0x0
		 /* move v4, v3 */
		 /* move v5, v3 */
		 /* invoke-direct/range {v0 ..v5}, Lorg/anddev/andengine/opengl/texture/Texture$PixelFormat;-><init>(Ljava/lang/String;IIII)V */
		 /* new-instance v0, Lorg/anddev/andengine/opengl/texture/Texture$PixelFormat; */
		 final String v1 = "RGBA_4444"; // const-string v1, "RGBA_4444"
		 int v2 = 1; // const/4 v2, 0x1
		 /* const v4, 0x8033 */
		 /* move v3, v9 */
		 /* move v5, v6 */
		 /* invoke-direct/range {v0 ..v5}, Lorg/anddev/andengine/opengl/texture/Texture$PixelFormat;-><init>(Ljava/lang/String;IIII)V */
		 /* new-instance v0, Lorg/anddev/andengine/opengl/texture/Texture$PixelFormat; */
		 final String v1 = "RGBA_5551"; // const-string v1, "RGBA_5551"
		 int v2 = 2; // const/4 v2, 0x2
		 /* const v4, 0x8034 */
		 /* move v3, v9 */
		 /* move v5, v6 */
		 /* invoke-direct/range {v0 ..v5}, Lorg/anddev/andengine/opengl/texture/Texture$PixelFormat;-><init>(Ljava/lang/String;IIII)V */
		 /* new-instance v0, Lorg/anddev/andengine/opengl/texture/Texture$PixelFormat; */
		 final String v1 = "RGBA_8888"; // const-string v1, "RGBA_8888"
		 int v2 = 3; // const/4 v2, 0x3
		 /* const/16 v5, 0x20 */
		 /* move v3, v9 */
		 /* move v4, v7 */
		 /* invoke-direct/range {v0 ..v5}, Lorg/anddev/andengine/opengl/texture/Texture$PixelFormat;-><init>(Ljava/lang/String;IIII)V */
		 /* new-instance v0, Lorg/anddev/andengine/opengl/texture/Texture$PixelFormat; */
		 final String v1 = "RGB_565"; // const-string v1, "RGB_565"
		 int v2 = 4; // const/4 v2, 0x4
		 /* const/16 v3, 0x1907 */
		 /* const v4, 0x8363 */
		 /* move v5, v6 */
		 /* invoke-direct/range {v0 ..v5}, Lorg/anddev/andengine/opengl/texture/Texture$PixelFormat;-><init>(Ljava/lang/String;IIII)V */
		 /* new-instance v0, Lorg/anddev/andengine/opengl/texture/Texture$PixelFormat; */
		 final String v1 = "A_8"; // const-string v1, "A_8"
		 int v2 = 5; // const/4 v2, 0x5
		 /* const/16 v3, 0x1906 */
		 /* move v4, v7 */
		 /* move v5, v8 */
		 /* invoke-direct/range {v0 ..v5}, Lorg/anddev/andengine/opengl/texture/Texture$PixelFormat;-><init>(Ljava/lang/String;IIII)V */
		 /* new-instance v0, Lorg/anddev/andengine/opengl/texture/Texture$PixelFormat; */
		 final String v1 = "I_8"; // const-string v1, "I_8"
		 int v2 = 6; // const/4 v2, 0x6
		 /* const/16 v3, 0x1909 */
		 /* move v4, v7 */
		 /* move v5, v8 */
		 /* invoke-direct/range {v0 ..v5}, Lorg/anddev/andengine/opengl/texture/Texture$PixelFormat;-><init>(Ljava/lang/String;IIII)V */
		 /* new-instance v0, Lorg/anddev/andengine/opengl/texture/Texture$PixelFormat; */
		 final String v1 = "AI_8"; // const-string v1, "AI_8"
		 int v2 = 7; // const/4 v2, 0x7
		 /* const/16 v3, 0x190a */
		 /* move v4, v7 */
		 /* move v5, v6 */
		 /* invoke-direct/range {v0 ..v5}, Lorg/anddev/andengine/opengl/texture/Texture$PixelFormat;-><init>(Ljava/lang/String;IIII)V */
		 /* new-array v0, v8, [Lorg/anddev/andengine/opengl/texture/Texture$PixelFormat; */
		 int v1 = 0; // const/4 v1, 0x0
		 v2 = org.anddev.andengine.opengl.texture.Texture$PixelFormat.UNDEFINED;
		 /* aput-object v2, v0, v1 */
		 int v1 = 1; // const/4 v1, 0x1
		 v2 = org.anddev.andengine.opengl.texture.Texture$PixelFormat.RGBA_4444;
		 /* aput-object v2, v0, v1 */
		 int v1 = 2; // const/4 v1, 0x2
		 v2 = org.anddev.andengine.opengl.texture.Texture$PixelFormat.RGBA_5551;
		 /* aput-object v2, v0, v1 */
		 int v1 = 3; // const/4 v1, 0x3
		 v2 = org.anddev.andengine.opengl.texture.Texture$PixelFormat.RGBA_8888;
		 /* aput-object v2, v0, v1 */
		 int v1 = 4; // const/4 v1, 0x4
		 v2 = org.anddev.andengine.opengl.texture.Texture$PixelFormat.RGB_565;
		 /* aput-object v2, v0, v1 */
		 int v1 = 5; // const/4 v1, 0x5
		 v2 = org.anddev.andengine.opengl.texture.Texture$PixelFormat.A_8;
		 /* aput-object v2, v0, v1 */
		 int v1 = 6; // const/4 v1, 0x6
		 v2 = org.anddev.andengine.opengl.texture.Texture$PixelFormat.I_8;
		 /* aput-object v2, v0, v1 */
		 int v1 = 7; // const/4 v1, 0x7
		 v2 = org.anddev.andengine.opengl.texture.Texture$PixelFormat.AI_8;
		 /* aput-object v2, v0, v1 */
		 return;
	 } // .end method
	 private inal ( ) {
		 /* .locals 0 */
		 /* invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V */
		 /* iput p3, p0, Lorg/anddev/andengine/opengl/texture/Texture$PixelFormat;->mGLFormat:I */
		 /* iput p4, p0, Lorg/anddev/andengine/opengl/texture/Texture$PixelFormat;->mGLType:I */
		 /* iput p5, p0, Lorg/anddev/andengine/opengl/texture/Texture$PixelFormat;->mBitsPerPixel:I */
		 return;
	 } // .end method
	 public static org.anddev.andengine.opengl.texture.Texture$PixelFormat valueOf ( java.lang.String p0 ) {
		 /* .locals 1 */
		 /* const-class v0, Lorg/anddev/andengine/opengl/texture/Texture$PixelFormat; */
		 java.lang.Enum .valueOf ( v0,p0 );
		 /* check-cast p0, Lorg/anddev/andengine/opengl/texture/Texture$PixelFormat; */
	 } // .end method
	 public static org.anddev.andengine.opengl.texture.Texture$PixelFormat values ( ) {
		 /* .locals 4 */
		 int v3 = 0; // const/4 v3, 0x0
		 v0 = org.anddev.andengine.opengl.texture.Texture$PixelFormat.ENUM$VALUES;
		 /* array-length v1, v0 */
		 /* new-array v2, v1, [Lorg/anddev/andengine/opengl/texture/Texture$PixelFormat; */
		 java.lang.System .arraycopy ( v0,v3,v2,v3,v1 );
	 } // .end method
	 /* # virtual methods */
	 public final Integer getBitsPerPixel ( ) {
		 /* .locals 1 */
		 /* iget v0, p0, Lorg/anddev/andengine/opengl/texture/Texture$PixelFormat;->mBitsPerPixel:I */
	 } // .end method
	 public final Integer getGLFormat ( ) {
		 /* .locals 1 */
		 /* iget v0, p0, Lorg/anddev/andengine/opengl/texture/Texture$PixelFormat;->mGLFormat:I */
	 } // .end method
	 public final Integer getGLType ( ) {
		 /* .locals 1 */
		 /* iget v0, p0, Lorg/anddev/andengine/opengl/texture/Texture$PixelFormat;->mGLType:I */
	 } // .end method
