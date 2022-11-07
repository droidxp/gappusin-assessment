public class inal extends java.lang.Enum {
	 /* # static fields */
	 public static final org.anddev.andengine.opengl.texture.atlas.bitmap.BitmapTextureAtlas$BitmapTextureFormat A_8;
	 private static final org.anddev.andengine.opengl.texture.atlas.bitmap.BitmapTextureAtlas$BitmapTextureFormat ENUM$VALUES; //synthetic
	 public static final org.anddev.andengine.opengl.texture.atlas.bitmap.BitmapTextureAtlas$BitmapTextureFormat RGBA_4444;
	 public static final org.anddev.andengine.opengl.texture.atlas.bitmap.BitmapTextureAtlas$BitmapTextureFormat RGBA_8888;
	 public static final org.anddev.andengine.opengl.texture.atlas.bitmap.BitmapTextureAtlas$BitmapTextureFormat RGB_565;
	 /* # instance fields */
	 private final android.graphics.Bitmap$Config mBitmapConfig;
	 private final org.anddev.andengine.opengl.texture.Texture$PixelFormat mPixelFormat;
	 /* # direct methods */
	 static inal ( ) {
		 /* .locals 8 */
		 int v7 = 3; // const/4 v7, 0x3
		 int v6 = 2; // const/4 v6, 0x2
		 int v5 = 1; // const/4 v5, 0x1
		 int v4 = 0; // const/4 v4, 0x0
		 /* new-instance v0, Lorg/anddev/andengine/opengl/texture/atlas/bitmap/BitmapTextureAtlas$BitmapTextureFormat; */
		 final String v1 = "RGBA_4444"; // const-string v1, "RGBA_4444"
		 v2 = android.graphics.Bitmap$Config.ARGB_4444;
		 v3 = org.anddev.andengine.opengl.texture.Texture$PixelFormat.RGBA_4444;
		 /* invoke-direct {v0, v1, v4, v2, v3}, Lorg/anddev/andengine/opengl/texture/atlas/bitmap/BitmapTextureAtlas$BitmapTextureFormat;-><init>(Ljava/lang/String;ILandroid/graphics/Bitmap$Config;Lorg/anddev/andengine/opengl/texture/Texture$PixelFormat;)V */
		 /* new-instance v0, Lorg/anddev/andengine/opengl/texture/atlas/bitmap/BitmapTextureAtlas$BitmapTextureFormat; */
		 final String v1 = "RGBA_8888"; // const-string v1, "RGBA_8888"
		 v2 = android.graphics.Bitmap$Config.ARGB_8888;
		 v3 = org.anddev.andengine.opengl.texture.Texture$PixelFormat.RGBA_8888;
		 /* invoke-direct {v0, v1, v5, v2, v3}, Lorg/anddev/andengine/opengl/texture/atlas/bitmap/BitmapTextureAtlas$BitmapTextureFormat;-><init>(Ljava/lang/String;ILandroid/graphics/Bitmap$Config;Lorg/anddev/andengine/opengl/texture/Texture$PixelFormat;)V */
		 /* new-instance v0, Lorg/anddev/andengine/opengl/texture/atlas/bitmap/BitmapTextureAtlas$BitmapTextureFormat; */
		 final String v1 = "RGB_565"; // const-string v1, "RGB_565"
		 v2 = android.graphics.Bitmap$Config.RGB_565;
		 v3 = org.anddev.andengine.opengl.texture.Texture$PixelFormat.RGB_565;
		 /* invoke-direct {v0, v1, v6, v2, v3}, Lorg/anddev/andengine/opengl/texture/atlas/bitmap/BitmapTextureAtlas$BitmapTextureFormat;-><init>(Ljava/lang/String;ILandroid/graphics/Bitmap$Config;Lorg/anddev/andengine/opengl/texture/Texture$PixelFormat;)V */
		 /* new-instance v0, Lorg/anddev/andengine/opengl/texture/atlas/bitmap/BitmapTextureAtlas$BitmapTextureFormat; */
		 final String v1 = "A_8"; // const-string v1, "A_8"
		 v2 = android.graphics.Bitmap$Config.ALPHA_8;
		 v3 = org.anddev.andengine.opengl.texture.Texture$PixelFormat.A_8;
		 /* invoke-direct {v0, v1, v7, v2, v3}, Lorg/anddev/andengine/opengl/texture/atlas/bitmap/BitmapTextureAtlas$BitmapTextureFormat;-><init>(Ljava/lang/String;ILandroid/graphics/Bitmap$Config;Lorg/anddev/andengine/opengl/texture/Texture$PixelFormat;)V */
		 int v0 = 4; // const/4 v0, 0x4
		 /* new-array v0, v0, [Lorg/anddev/andengine/opengl/texture/atlas/bitmap/BitmapTextureAtlas$BitmapTextureFormat; */
		 v1 = org.anddev.andengine.opengl.texture.atlas.bitmap.BitmapTextureAtlas$BitmapTextureFormat.RGBA_4444;
		 /* aput-object v1, v0, v4 */
		 v1 = org.anddev.andengine.opengl.texture.atlas.bitmap.BitmapTextureAtlas$BitmapTextureFormat.RGBA_8888;
		 /* aput-object v1, v0, v5 */
		 v1 = org.anddev.andengine.opengl.texture.atlas.bitmap.BitmapTextureAtlas$BitmapTextureFormat.RGB_565;
		 /* aput-object v1, v0, v6 */
		 v1 = org.anddev.andengine.opengl.texture.atlas.bitmap.BitmapTextureAtlas$BitmapTextureFormat.A_8;
		 /* aput-object v1, v0, v7 */
		 return;
	 } // .end method
	 private inal ( ) {
		 /* .locals 0 */
		 /* invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V */
		 this.mBitmapConfig = p3;
		 this.mPixelFormat = p4;
		 return;
	 } // .end method
	 public static org.anddev.andengine.opengl.texture.atlas.bitmap.BitmapTextureAtlas$BitmapTextureFormat valueOf ( java.lang.String p0 ) {
		 /* .locals 1 */
		 /* const-class v0, Lorg/anddev/andengine/opengl/texture/atlas/bitmap/BitmapTextureAtlas$BitmapTextureFormat; */
		 java.lang.Enum .valueOf ( v0,p0 );
		 /* check-cast p0, Lorg/anddev/andengine/opengl/texture/atlas/bitmap/BitmapTextureAtlas$BitmapTextureFormat; */
	 } // .end method
	 public static org.anddev.andengine.opengl.texture.atlas.bitmap.BitmapTextureAtlas$BitmapTextureFormat values ( ) {
		 /* .locals 4 */
		 int v3 = 0; // const/4 v3, 0x0
		 v0 = org.anddev.andengine.opengl.texture.atlas.bitmap.BitmapTextureAtlas$BitmapTextureFormat.ENUM$VALUES;
		 /* array-length v1, v0 */
		 /* new-array v2, v1, [Lorg/anddev/andengine/opengl/texture/atlas/bitmap/BitmapTextureAtlas$BitmapTextureFormat; */
		 java.lang.System .arraycopy ( v0,v3,v2,v3,v1 );
	 } // .end method
	 /* # virtual methods */
	 public final android.graphics.Bitmap$Config getBitmapConfig ( ) {
		 /* .locals 1 */
		 v0 = this.mBitmapConfig;
	 } // .end method
	 public final org.anddev.andengine.opengl.texture.Texture$PixelFormat getPixelFormat ( ) {
		 /* .locals 1 */
		 v0 = this.mPixelFormat;
	 } // .end method
