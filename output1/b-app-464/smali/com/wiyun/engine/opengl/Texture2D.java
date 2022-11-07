public class com.wiyun.engine.opengl.Texture2D extends com.wiyun.engine.BaseWYObject {
	 /* # static fields */
	 public static final Integer CENTER;
	 public static final Integer LEFT;
	 public static final Integer RIGHT;
	 public static final Integer SOURCE_BMP;
	 public static final Integer SOURCE_JPG;
	 public static final Integer SOURCE_LABEL;
	 public static final Integer SOURCE_OPENGL;
	 public static final Integer SOURCE_PNG;
	 public static final Integer SOURCE_PVR;
	 public static final Integer SOURCE_RAW;
	 /* # direct methods */
	 protected com.wiyun.engine.opengl.Texture2D ( ) {
		 /* .locals 0 */
		 /* invoke-direct {p0}, Lcom/wiyun/engine/BaseWYObject;-><init>()V */
		 return;
	 } // .end method
	 protected com.wiyun.engine.opengl.Texture2D ( ) {
		 /* .locals 0 */
		 /* invoke-direct {p0, p1}, Lcom/wiyun/engine/BaseWYObject;-><init>(I)V */
		 return;
	 } // .end method
	 public static com.wiyun.engine.opengl.Texture2D from ( Integer p0 ) {
		 /* .locals 1 */
		 /* if-nez p0, :cond_0 */
		 int v0 = 0; // const/4 v0, 0x0
	 } // :goto_0
} // :cond_0
/* new-instance v0, Lcom/wiyun/engine/opengl/Texture2D; */
/* invoke-direct {v0, p0}, Lcom/wiyun/engine/opengl/Texture2D;-><init>(I)V */
} // .end method
private static Integer getNextPOT ( Integer p0 ) {
/* .locals 2 */
/* add-int/lit8 v0, p0, -0x1 */
/* shr-int/lit8 v1, v0, 0x1 */
/* or-int/2addr v0, v1 */
/* shr-int/lit8 v1, v0, 0x2 */
/* or-int/2addr v0, v1 */
/* shr-int/lit8 v1, v0, 0x4 */
/* or-int/2addr v0, v1 */
/* shr-int/lit8 v1, v0, 0x8 */
/* or-int/2addr v0, v1 */
/* shr-int/lit8 v1, v0, 0x10 */
/* or-int/2addr v0, v1 */
/* add-int/lit8 v0, v0, 0x1 */
} // .end method
public static com.wiyun.engine.opengl.Texture2D make ( Integer p0 ) {
/* .locals 1 */
int v0 = 0; // const/4 v0, 0x0
com.wiyun.engine.opengl.Texture2D .make ( p0,v0 );
} // .end method
public static com.wiyun.engine.opengl.Texture2D make ( Integer p0, Integer p1 ) {
/* .locals 1 */
com.wiyun.engine.opengl.TextureManager .getInstance ( );
v0 = (( com.wiyun.engine.opengl.TextureManager ) v0 ).getTexturePixelFormat ( ); // invoke-virtual {v0}, Lcom/wiyun/engine/opengl/TextureManager;->getTexturePixelFormat()I
com.wiyun.engine.opengl.Texture2D .make ( p0,p1,v0 );
} // .end method
public static com.wiyun.engine.opengl.Texture2D make ( Integer p0, Integer p1, Integer p2 ) {
/* .locals 2 */
/* new-instance v0, Lcom/wiyun/engine/opengl/Texture2D; */
/* invoke-direct {v0}, Lcom/wiyun/engine/opengl/Texture2D;-><init>()V */
v1 = (( com.wiyun.engine.opengl.Texture2D ) v0 ).nativeInit ( p0, p1, p2 ); // invoke-virtual {v0, p0, p1, p2}, Lcom/wiyun/engine/opengl/Texture2D;->nativeInit(III)I
/* iput v1, v0, Lcom/wiyun/engine/opengl/Texture2D;->mPointer:I */
} // .end method
public static com.wiyun.engine.opengl.Texture2D make ( android.graphics.Bitmap p0 ) {
/* .locals 11 */
/* const v10, 0x46180400 # 9729.0f */
int v9 = 0; // const/4 v9, 0x0
int v3 = 1; // const/4 v3, 0x1
/* const/16 v8, 0xde1 */
int v2 = 0; // const/4 v2, 0x0
v4 = (( android.graphics.Bitmap ) p0 ).getWidth ( ); // invoke-virtual {p0}, Landroid/graphics/Bitmap;->getWidth()I
v5 = (( android.graphics.Bitmap ) p0 ).getHeight ( ); // invoke-virtual {p0}, Landroid/graphics/Bitmap;->getHeight()I
v0 = com.wiyun.engine.opengl.Texture2D .getNextPOT ( v4 );
v6 = com.wiyun.engine.opengl.Texture2D .getNextPOT ( v5 );
/* if-ne v4, v0, :cond_2 */
/* if-ne v5, v6, :cond_2 */
/* move v1, v2 */
} // :goto_0
if ( v1 != null) { // if-eqz v1, :cond_0
v7 = android.graphics.Bitmap$Config.ARGB_8888;
android.graphics.Bitmap .createBitmap ( v0,v6,v7 );
/* new-instance v6, Landroid/graphics/Canvas; */
/* invoke-direct {v6, v0}, Landroid/graphics/Canvas;-><init>(Landroid/graphics/Bitmap;)V */
(( android.graphics.Bitmap ) v0 ).eraseColor ( v2 ); // invoke-virtual {v0, v2}, Landroid/graphics/Bitmap;->eraseColor(I)V
int v7 = 0; // const/4 v7, 0x0
(( android.graphics.Canvas ) v6 ).drawBitmap ( p0, v9, v9, v7 ); // invoke-virtual {v6, p0, v9, v9, v7}, Landroid/graphics/Canvas;->drawBitmap(Landroid/graphics/Bitmap;FFLandroid/graphics/Paint;)V
/* move-object p0, v0 */
} // :cond_0
/* new-array v0, v3, [I */
android.opengl.GLES10 .glGenTextures ( v3,v0,v2 );
/* aget v3, v0, v2 */
android.opengl.GLES10 .glBindTexture ( v8,v3 );
/* const/16 v3, 0x2801 */
android.opengl.GLES10 .glTexParameterf ( v8,v3,v10 );
/* const/16 v3, 0x2800 */
android.opengl.GLES10 .glTexParameterf ( v8,v3,v10 );
android.opengl.GLUtils .texImage2D ( v8,v2,p0,v2 );
/* aget v0, v0, v2 */
com.wiyun.engine.opengl.Texture2D .makeGL ( v0,v4,v5 );
if ( v1 != null) { // if-eqz v1, :cond_1
(( android.graphics.Bitmap ) p0 ).recycle ( ); // invoke-virtual {p0}, Landroid/graphics/Bitmap;->recycle()V
} // :cond_1
} // :cond_2
/* move v1, v3 */
} // .end method
public static com.wiyun.engine.opengl.Texture2D make ( com.wiyun.engine.utils.BitmapRawData p0 ) {
/* .locals 2 */
/* new-instance v0, Lcom/wiyun/engine/opengl/Texture2D; */
/* invoke-direct {v0}, Lcom/wiyun/engine/opengl/Texture2D;-><init>()V */
com.wiyun.engine.opengl.TextureManager .getInstance ( );
v1 = (( com.wiyun.engine.opengl.TextureManager ) v1 ).getTexturePixelFormat ( ); // invoke-virtual {v1}, Lcom/wiyun/engine/opengl/TextureManager;->getTexturePixelFormat()I
v1 = (( com.wiyun.engine.opengl.Texture2D ) v0 ).nativeInitBitmap ( p0, v1 ); // invoke-virtual {v0, p0, v1}, Lcom/wiyun/engine/opengl/Texture2D;->nativeInitBitmap(Lcom/wiyun/engine/utils/BitmapRawData;I)I
/* iput v1, v0, Lcom/wiyun/engine/opengl/Texture2D;->mPointer:I */
} // .end method
public static com.wiyun.engine.opengl.Texture2D make ( java.lang.String p0 ) {
/* .locals 1 */
int v0 = 0; // const/4 v0, 0x0
com.wiyun.engine.opengl.Texture2D .make ( p0,v0 );
} // .end method
public static com.wiyun.engine.opengl.Texture2D make ( java.lang.String p0, Integer p1 ) {
/* .locals 1 */
com.wiyun.engine.opengl.TextureManager .getInstance ( );
v0 = (( com.wiyun.engine.opengl.TextureManager ) v0 ).getTexturePixelFormat ( ); // invoke-virtual {v0}, Lcom/wiyun/engine/opengl/TextureManager;->getTexturePixelFormat()I
com.wiyun.engine.opengl.Texture2D .make ( p0,p1,v0 );
} // .end method
public static com.wiyun.engine.opengl.Texture2D make ( java.lang.String p0, Integer p1, Integer p2 ) {
/* .locals 1 */
v0 = com.wiyun.engine.nodes.Director .getDefaultInDensity ( );
com.wiyun.engine.opengl.Texture2D .make ( p0,p1,p2,v0 );
} // .end method
public static com.wiyun.engine.opengl.Texture2D make ( java.lang.String p0, Integer p1, Integer p2, Float p3 ) {
/* .locals 2 */
/* new-instance v0, Lcom/wiyun/engine/opengl/Texture2D; */
/* invoke-direct {v0}, Lcom/wiyun/engine/opengl/Texture2D;-><init>()V */
v1 = (( com.wiyun.engine.opengl.Texture2D ) v0 ).nativeInit ( p0, p1, p2, p3 ); // invoke-virtual {v0, p0, p1, p2, p3}, Lcom/wiyun/engine/opengl/Texture2D;->nativeInit(Ljava/lang/String;IIF)I
/* iput v1, v0, Lcom/wiyun/engine/opengl/Texture2D;->mPointer:I */
} // .end method
public static com.wiyun.engine.opengl.Texture2D makeFile ( java.lang.String p0 ) {
/* .locals 1 */
int v0 = 0; // const/4 v0, 0x0
com.wiyun.engine.opengl.Texture2D .makeFile ( p0,v0 );
} // .end method
public static com.wiyun.engine.opengl.Texture2D makeFile ( java.lang.String p0, Integer p1 ) {
/* .locals 2 */
int v0 = 0; // const/4 v0, 0x0
com.wiyun.engine.opengl.TextureManager .getInstance ( );
v1 = (( com.wiyun.engine.opengl.TextureManager ) v1 ).getTexturePixelFormat ( ); // invoke-virtual {v1}, Lcom/wiyun/engine/opengl/TextureManager;->getTexturePixelFormat()I
com.wiyun.engine.opengl.Texture2D .makeFile ( p0,v0,v1 );
} // .end method
public static com.wiyun.engine.opengl.Texture2D makeFile ( java.lang.String p0, Integer p1, Integer p2 ) {
/* .locals 2 */
int v0 = 0; // const/4 v0, 0x0
v1 = com.wiyun.engine.nodes.Director .getDefaultInDensity ( );
com.wiyun.engine.opengl.Texture2D .makeFile ( p0,v0,p2,v1 );
} // .end method
public static com.wiyun.engine.opengl.Texture2D makeFile ( java.lang.String p0, Integer p1, Integer p2, Float p3 ) {
/* .locals 2 */
/* new-instance v0, Lcom/wiyun/engine/opengl/Texture2D; */
/* invoke-direct {v0}, Lcom/wiyun/engine/opengl/Texture2D;-><init>()V */
com.wiyun.engine.opengl.TextureManager .getInstance ( );
v1 = (( com.wiyun.engine.opengl.TextureManager ) v1 ).getTexturePixelFormat ( ); // invoke-virtual {v1}, Lcom/wiyun/engine/opengl/TextureManager;->getTexturePixelFormat()I
v1 = (( com.wiyun.engine.opengl.Texture2D ) v0 ).nativeInit ( p0, p1, v1, p3 ); // invoke-virtual {v0, p0, p1, v1, p3}, Lcom/wiyun/engine/opengl/Texture2D;->nativeInit(Ljava/lang/String;IIF)I
/* iput v1, v0, Lcom/wiyun/engine/opengl/Texture2D;->mPointer:I */
} // .end method
public static com.wiyun.engine.opengl.Texture2D makeGL ( Integer p0, Integer p1, Integer p2 ) {
/* .locals 2 */
/* new-instance v0, Lcom/wiyun/engine/opengl/Texture2D; */
/* invoke-direct {v0}, Lcom/wiyun/engine/opengl/Texture2D;-><init>()V */
v1 = (( com.wiyun.engine.opengl.Texture2D ) v0 ).nativeInitGL ( p0, p1, p2 ); // invoke-virtual {v0, p0, p1, p2}, Lcom/wiyun/engine/opengl/Texture2D;->nativeInitGL(III)I
/* iput v1, v0, Lcom/wiyun/engine/opengl/Texture2D;->mPointer:I */
} // .end method
public static com.wiyun.engine.opengl.Texture2D makeLabel ( java.lang.String p0, Float p1, Integer p2, java.lang.String p3, Float p4, Integer p5 ) {
/* .locals 7 */
/* new-instance v0, Lcom/wiyun/engine/opengl/Texture2D; */
/* invoke-direct {v0}, Lcom/wiyun/engine/opengl/Texture2D;-><init>()V */
/* move-object v1, p0 */
/* move v2, p1 */
/* move v3, p2 */
/* move-object v4, p3 */
/* move v5, p4 */
/* move v6, p5 */
v1 = /* invoke-virtual/range {v0 ..v6}, Lcom/wiyun/engine/opengl/Texture2D;->nativeInitLabel(Ljava/lang/String;FILjava/lang/String;FI)I */
/* iput v1, v0, Lcom/wiyun/engine/opengl/Texture2D;->mPointer:I */
} // .end method
public static com.wiyun.engine.opengl.Texture2D makeLabel ( java.lang.String p0, Float p1, java.lang.String p2, Boolean p3, Float p4, Integer p5 ) {
/* .locals 7 */
/* new-instance v0, Lcom/wiyun/engine/opengl/Texture2D; */
/* invoke-direct {v0}, Lcom/wiyun/engine/opengl/Texture2D;-><init>()V */
/* move-object v1, p0 */
/* move v2, p1 */
/* move-object v3, p2 */
/* move v4, p3 */
/* move v5, p4 */
/* move v6, p5 */
v1 = /* invoke-virtual/range {v0 ..v6}, Lcom/wiyun/engine/opengl/Texture2D;->nativeInitLabel(Ljava/lang/String;FLjava/lang/String;ZFI)I */
/* iput v1, v0, Lcom/wiyun/engine/opengl/Texture2D;->mPointer:I */
} // .end method
private native Integer nativeClone ( Integer p0 ) {
} // .end method
private native void nativeDrawAtPoint ( Float p0, Float p1 ) {
} // .end method
private native void nativeDrawAtPoint ( Float p0, Float p1, Boolean p2, Boolean p3 ) {
} // .end method
/* # virtual methods */
public native void applyFilter ( ) {
} // .end method
public native void applyTexParameters ( ) {
} // .end method
public com.wiyun.engine.opengl.Texture2D clone ( Integer p0 ) {
/* .locals 1 */
v0 = /* invoke-direct {p0, p1}, Lcom/wiyun/engine/opengl/Texture2D;->nativeClone(I)I */
com.wiyun.engine.opengl.Texture2D .from ( v0 );
} // .end method
public native Boolean deleteClone ( Integer p0 ) {
} // .end method
public void drawAtPoint ( javax.microedition.khronos.opengles.GL10 p0, Float p1, Float p2 ) {
/* .locals 0 */
/* invoke-direct {p0, p2, p3}, Lcom/wiyun/engine/opengl/Texture2D;->nativeDrawAtPoint(FF)V */
return;
} // .end method
public void drawAtPoint ( javax.microedition.khronos.opengles.GL10 p0, Float p1, Float p2, Boolean p3, Boolean p4 ) {
/* .locals 0 */
/* invoke-direct {p0, p2, p3, p4, p5}, Lcom/wiyun/engine/opengl/Texture2D;->nativeDrawAtPoint(FFZZ)V */
return;
} // .end method
public void drawAtPoint ( javax.microedition.khronos.opengles.GL10 p0, com.wiyun.engine.types.WYPoint p1 ) {
/* .locals 2 */
/* iget v0, p2, Lcom/wiyun/engine/types/WYPoint;->x:F */
/* iget v1, p2, Lcom/wiyun/engine/types/WYPoint;->y:F */
(( com.wiyun.engine.opengl.Texture2D ) p0 ).drawAtPoint ( p1, v0, v1 ); // invoke-virtual {p0, p1, v0, v1}, Lcom/wiyun/engine/opengl/Texture2D;->drawAtPoint(Ljavax/microedition/khronos/opengles/GL10;FF)V
return;
} // .end method
public void drawAtPoint ( javax.microedition.khronos.opengles.GL10 p0, com.wiyun.engine.types.WYPoint p1, Boolean p2, Boolean p3 ) {
/* .locals 6 */
/* iget v2, p2, Lcom/wiyun/engine/types/WYPoint;->x:F */
/* iget v3, p2, Lcom/wiyun/engine/types/WYPoint;->y:F */
/* move-object v0, p0 */
/* move-object v1, p1 */
/* move v4, p3 */
/* move v5, p4 */
/* invoke-virtual/range {v0 ..v5}, Lcom/wiyun/engine/opengl/Texture2D;->drawAtPoint(Ljavax/microedition/khronos/opengles/GL10;FFZZ)V */
return;
} // .end method
public native Float getHeight ( ) {
} // .end method
public native Float getHeightScale ( ) {
} // .end method
public native Integer getPixelHeight ( ) {
} // .end method
public native Integer getPixelWidth ( ) {
} // .end method
public native Float getWidth ( ) {
} // .end method
public native Float getWidthScale ( ) {
} // .end method
public Boolean hasPremultipliedAlpha ( ) {
/* .locals 1 */
int v0 = 0; // const/4 v0, 0x0
} // .end method
public native Boolean isFlipX ( ) {
} // .end method
public native Boolean isFlipY ( ) {
} // .end method
public native void loadTexture ( ) {
} // .end method
native Integer nativeInit ( Integer p0, Integer p1, Integer p2 ) {
} // .end method
native Integer nativeInit ( java.lang.String p0, Integer p1, Integer p2, Float p3 ) {
} // .end method
native Integer nativeInitBitmap ( com.wiyun.engine.utils.BitmapRawData p0, Integer p1 ) {
} // .end method
native Integer nativeInitFile ( java.lang.String p0, Integer p1, Integer p2, Float p3 ) {
} // .end method
native Integer nativeInitGL ( Integer p0, Integer p1, Integer p2 ) {
} // .end method
native Integer nativeInitLabel ( java.lang.String p0, Float p1, Integer p2, java.lang.String p3, Float p4, Integer p5 ) {
} // .end method
native Integer nativeInitLabel ( java.lang.String p0, Float p1, java.lang.String p2, Boolean p3, Float p4, Integer p5 ) {
} // .end method
public native void setAntiAlias ( Boolean p0 ) {
} // .end method
public native void setColorFilter ( com.wiyun.engine.filters.ColorFilter p0 ) {
} // .end method
public native void setFlipX ( Boolean p0 ) {
} // .end method
public native void setFlipY ( Boolean p0 ) {
} // .end method
public native void setRepeat ( Boolean p0 ) {
} // .end method
public native void setTexParameters ( Integer p0, Integer p1, Integer p2, Integer p3 ) {
} // .end method
public native Boolean switchToClone ( Integer p0 ) {
} // .end method
public native void updateRaw ( com.wiyun.engine.utils.BitmapRawData p0 ) {
} // .end method
