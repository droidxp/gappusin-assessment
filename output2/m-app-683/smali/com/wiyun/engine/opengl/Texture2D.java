public class com.wiyun.engine.opengl.Texture2D extends com.wiyun.engine.BaseWYObject {
	 /* .source "Texture2D.java" */
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
		 /* .param p1, "pointer" # I */
		 /* .prologue */
		 /* .line 728 */
		 /* invoke-direct {p0, p1}, Lcom/wiyun/engine/BaseWYObject;-><init>(I)V */
		 /* .line 729 */
		 return;
	 } // .end method
	 protected com.wiyun.engine.opengl.Texture2D ( ) {
		 /* .locals 1 */
		 /* .param p1, "tex" # I */
		 /* .param p2, "w" # I */
		 /* .param p3, "h" # I */
		 /* .prologue */
		 /* .line 731 */
		 /* invoke-direct {p0}, Lcom/wiyun/engine/BaseWYObject;-><init>()V */
		 /* .line 732 */
		 v0 = 		 /* invoke-direct {p0, p1, p2, p3}, Lcom/wiyun/engine/opengl/Texture2D;->nativeNew(III)I */
		 /* iput v0, p0, Lcom/wiyun/engine/opengl/Texture2D;->mPointer:I */
		 /* .line 733 */
		 return;
	 } // .end method
	 com.wiyun.engine.opengl.Texture2D ( ) {
		 /* .locals 1 */
		 /* .param p1, "source" # I */
		 /* .param p2, "resId" # I */
		 /* .param p3, "transparentColor" # I */
		 /* .param p4, "pixelFormat" # I */
		 /* .prologue */
		 /* .line 700 */
		 /* invoke-direct {p0}, Lcom/wiyun/engine/BaseWYObject;-><init>()V */
		 /* .line 701 */
		 v0 = 		 /* invoke-direct {p0, p1, p2, p3, p4}, Lcom/wiyun/engine/opengl/Texture2D;->nativeNew(IIII)I */
		 /* iput v0, p0, Lcom/wiyun/engine/opengl/Texture2D;->mPointer:I */
		 /* .line 702 */
		 return;
	 } // .end method
	 com.wiyun.engine.opengl.Texture2D ( ) {
		 /* .locals 6 */
		 /* .param p1, "dummy" # I */
		 /* .param p2, "source" # I */
		 /* .param p3, "path" # Ljava/lang/String; */
		 /* .param p4, "transparentColor" # I */
		 /* .param p5, "pixelFormat" # I */
		 /* .param p6, "inDensity" # F */
		 /* .prologue */
		 /* .line 708 */
		 /* invoke-direct {p0}, Lcom/wiyun/engine/BaseWYObject;-><init>()V */
		 /* move-object v0, p0 */
		 /* move v1, p2 */
		 /* move-object v2, p3 */
		 /* move v3, p4 */
		 /* move v4, p5 */
		 /* move v5, p6 */
		 /* .line 709 */
		 v0 = 		 /* invoke-direct/range {v0 ..v5}, Lcom/wiyun/engine/opengl/Texture2D;->nativeNewFile(ILjava/lang/String;IIF)I */
		 /* iput v0, p0, Lcom/wiyun/engine/opengl/Texture2D;->mPointer:I */
		 /* .line 710 */
		 return;
	 } // .end method
	 com.wiyun.engine.opengl.Texture2D ( ) {
		 /* .locals 1 */
		 /* .param p1, "source" # I */
		 /* .param p2, "path" # Ljava/lang/String; */
		 /* .param p3, "transparentColor" # I */
		 /* .param p4, "pixelFormat" # I */
		 /* .param p5, "inDensity" # F */
		 /* .prologue */
		 /* .line 704 */
		 /* invoke-direct {p0}, Lcom/wiyun/engine/BaseWYObject;-><init>()V */
		 /* .line 705 */
		 v0 = 		 /* invoke-direct/range {p0 ..p5}, Lcom/wiyun/engine/opengl/Texture2D;->nativeNew(ILjava/lang/String;IIF)I */
		 /* iput v0, p0, Lcom/wiyun/engine/opengl/Texture2D;->mPointer:I */
		 /* .line 706 */
		 return;
	 } // .end method
	 com.wiyun.engine.opengl.Texture2D ( ) {
		 /* .locals 1 */
		 /* .param p1, "raw" # Lcom/wiyun/engine/utils/BitmapRawData; */
		 /* .param p2, "pixelFormat" # I */
		 /* .prologue */
		 /* .line 696 */
		 /* invoke-direct {p0}, Lcom/wiyun/engine/BaseWYObject;-><init>()V */
		 /* .line 697 */
		 v0 = 		 /* invoke-direct {p0, p1, p2}, Lcom/wiyun/engine/opengl/Texture2D;->nativeNew(Lcom/wiyun/engine/utils/BitmapRawData;I)I */
		 /* iput v0, p0, Lcom/wiyun/engine/opengl/Texture2D;->mPointer:I */
		 /* .line 698 */
		 return;
	 } // .end method
	 com.wiyun.engine.opengl.Texture2D ( ) {
		 /* .locals 1 */
		 /* .param p1, "text" # Ljava/lang/String; */
		 /* .param p2, "fontSize" # F */
		 /* .param p3, "style" # I */
		 /* .param p4, "fontName" # Ljava/lang/String; */
		 /* .param p5, "width" # F */
		 /* .param p6, "alignment" # I */
		 /* .prologue */
		 /* .line 716 */
		 /* invoke-direct {p0}, Lcom/wiyun/engine/BaseWYObject;-><init>()V */
		 /* .line 717 */
		 v0 = 		 /* invoke-direct/range {p0 ..p6}, Lcom/wiyun/engine/opengl/Texture2D;->nativeNew(Ljava/lang/String;FILjava/lang/String;FI)I */
		 /* iput v0, p0, Lcom/wiyun/engine/opengl/Texture2D;->mPointer:I */
		 /* .line 718 */
		 return;
	 } // .end method
	 com.wiyun.engine.opengl.Texture2D ( ) {
		 /* .locals 1 */
		 /* .param p1, "text" # Ljava/lang/String; */
		 /* .param p2, "fontSize" # F */
		 /* .param p3, "fontPath" # Ljava/lang/String; */
		 /* .param p4, "isFile" # Z */
		 /* .param p5, "width" # F */
		 /* .param p6, "alignment" # I */
		 /* .prologue */
		 /* .line 712 */
		 /* invoke-direct {p0}, Lcom/wiyun/engine/BaseWYObject;-><init>()V */
		 /* .line 713 */
		 v0 = 		 /* invoke-direct/range {p0 ..p6}, Lcom/wiyun/engine/opengl/Texture2D;->nativeNew(Ljava/lang/String;FLjava/lang/String;ZFI)I */
		 /* iput v0, p0, Lcom/wiyun/engine/opengl/Texture2D;->mPointer:I */
		 /* .line 714 */
		 return;
	 } // .end method
	 public static com.wiyun.engine.opengl.Texture2D from ( Integer p0 ) {
		 /* .locals 1 */
		 /* .param p0, "pointer" # I */
		 /* .prologue */
		 /* .line 721 */
		 /* if-nez p0, :cond_0 */
		 int v0 = 0; // const/4 v0, 0x0
	 } // :goto_0
} // :cond_0
/* new-instance v0, Lcom/wiyun/engine/opengl/Texture2D; */
/* invoke-direct {v0, p0}, Lcom/wiyun/engine/opengl/Texture2D;-><init>(I)V */
} // .end method
private static Integer getNextPOT ( Integer p0 ) {
/* .locals 1 */
/* .param p0, "x" # I */
/* .prologue */
/* .line 965 */
/* add-int/lit8 p0, p0, -0x1 */
/* .line 966 */
/* shr-int/lit8 v0, p0, 0x1 */
/* or-int/2addr p0, v0 */
/* .line 967 */
/* shr-int/lit8 v0, p0, 0x2 */
/* or-int/2addr p0, v0 */
/* .line 968 */
/* shr-int/lit8 v0, p0, 0x4 */
/* or-int/2addr p0, v0 */
/* .line 969 */
/* shr-int/lit8 v0, p0, 0x8 */
/* or-int/2addr p0, v0 */
/* .line 970 */
/* shr-int/lit8 v0, p0, 0x10 */
/* or-int/2addr p0, v0 */
/* .line 971 */
/* add-int/lit8 v0, p0, 0x1 */
} // .end method
public static com.wiyun.engine.opengl.Texture2D make ( android.graphics.Bitmap p0 ) {
/* .locals 15 */
/* .param p0, "b" # Landroid/graphics/Bitmap; */
/* .prologue */
/* const v14, 0x46180400 # 9729.0f */
int v13 = 0; // const/4 v13, 0x0
int v10 = 1; // const/4 v10, 0x1
/* const/16 v12, 0xde1 */
int v9 = 0; // const/4 v9, 0x0
/* .line 270 */
v8 = (( android.graphics.Bitmap ) p0 ).getWidth ( ); // invoke-virtual {p0}, Landroid/graphics/Bitmap;->getWidth()I
/* .line 271 */
/* .local v8, "w":I */
v1 = (( android.graphics.Bitmap ) p0 ).getHeight ( ); // invoke-virtual {p0}, Landroid/graphics/Bitmap;->getHeight()I
/* .line 272 */
/* .local v1, "h":I */
v5 = com.wiyun.engine.opengl.Texture2D .getNextPOT ( v8 );
/* .line 273 */
/* .local v5, "potW":I */
v4 = com.wiyun.engine.opengl.Texture2D .getNextPOT ( v1 );
/* .line 274 */
/* .local v4, "potH":I */
/* if-ne v8, v5, :cond_2 */
/* if-ne v1, v4, :cond_2 */
/* move v3, v9 */
/* .line 275 */
/* .local v3, "notPOT":Z */
} // :goto_0
if ( v3 != null) { // if-eqz v3, :cond_0
/* .line 276 */
v11 = android.graphics.Bitmap$Config.ARGB_8888;
android.graphics.Bitmap .createBitmap ( v5,v4,v11 );
/* .line 277 */
/* .local v2, "newB":Landroid/graphics/Bitmap; */
/* new-instance v0, Landroid/graphics/Canvas; */
/* invoke-direct {v0, v2}, Landroid/graphics/Canvas;-><init>(Landroid/graphics/Bitmap;)V */
/* .line 278 */
/* .local v0, "c":Landroid/graphics/Canvas; */
(( android.graphics.Bitmap ) v2 ).eraseColor ( v9 ); // invoke-virtual {v2, v9}, Landroid/graphics/Bitmap;->eraseColor(I)V
/* .line 279 */
int v11 = 0; // const/4 v11, 0x0
(( android.graphics.Canvas ) v0 ).drawBitmap ( p0, v13, v13, v11 ); // invoke-virtual {v0, p0, v13, v13, v11}, Landroid/graphics/Canvas;->drawBitmap(Landroid/graphics/Bitmap;FFLandroid/graphics/Paint;)V
/* .line 280 */
/* move-object p0, v2 */
/* .line 285 */
} // .end local v0 # "c":Landroid/graphics/Canvas;
} // .end local v2 # "newB":Landroid/graphics/Bitmap;
} // :cond_0
/* new-array v7, v10, [I */
/* .line 286 */
/* .local v7, "textures":[I */
android.opengl.GLES10 .glGenTextures ( v10,v7,v9 );
/* .line 287 */
/* aget v10, v7, v9 */
android.opengl.GLES10 .glBindTexture ( v12,v10 );
/* .line 288 */
/* const/16 v10, 0x2801 */
android.opengl.GLES10 .glTexParameterf ( v12,v10,v14 );
/* .line 289 */
/* const/16 v10, 0x2800 */
android.opengl.GLES10 .glTexParameterf ( v12,v10,v14 );
/* .line 292 */
android.opengl.GLUtils .texImage2D ( v12,v9,p0,v9 );
/* .line 295 */
/* aget v9, v7, v9 */
com.wiyun.engine.opengl.Texture2D .makeGL ( v9,v8,v1 );
/* .line 298 */
/* .local v6, "t":Lcom/wiyun/engine/opengl/Texture2D; */
if ( v3 != null) { // if-eqz v3, :cond_1
/* .line 299 */
(( android.graphics.Bitmap ) p0 ).recycle ( ); // invoke-virtual {p0}, Landroid/graphics/Bitmap;->recycle()V
/* .line 300 */
int p0 = 0; // const/4 p0, 0x0
/* .line 303 */
} // :cond_1
} // .end local v3 # "notPOT":Z
} // .end local v6 # "t":Lcom/wiyun/engine/opengl/Texture2D;
} // .end local v7 # "textures":[I
} // :cond_2
/* move v3, v10 */
/* .line 274 */
} // .end method
public static com.wiyun.engine.opengl.Texture2D make ( com.wiyun.engine.utils.BitmapRawData p0 ) {
/* .locals 1 */
/* .param p0, "raw" # Lcom/wiyun/engine/utils/BitmapRawData; */
/* .prologue */
/* .line 249 */
com.wiyun.engine.opengl.TextureManager .getInstance ( );
v0 = (( com.wiyun.engine.opengl.TextureManager ) v0 ).getTexturePixelFormat ( ); // invoke-virtual {v0}, Lcom/wiyun/engine/opengl/TextureManager;->getTexturePixelFormat()I
com.wiyun.engine.opengl.Texture2D .make ( p0,v0 );
} // .end method
public static com.wiyun.engine.opengl.Texture2D make ( com.wiyun.engine.utils.BitmapRawData p0, Integer p1 ) {
/* .locals 1 */
/* .param p0, "raw" # Lcom/wiyun/engine/utils/BitmapRawData; */
/* .param p1, "format" # I */
/* .prologue */
/* .line 339 */
/* new-instance v0, Lcom/wiyun/engine/opengl/Texture2D; */
/* invoke-direct {v0, p0, p1}, Lcom/wiyun/engine/opengl/Texture2D;-><init>(Lcom/wiyun/engine/utils/BitmapRawData;I)V */
/* .line 340 */
/* .local v0, "tex":Lcom/wiyun/engine/opengl/Texture2D; */
} // .end method
public static com.wiyun.engine.opengl.Texture2D make ( java.lang.String p0, Float p1, Integer p2, java.lang.String p3, Float p4, Integer p5 ) {
/* .locals 7 */
/* .param p0, "text" # Ljava/lang/String; */
/* .param p1, "fontSize" # F */
/* .param p2, "style" # I */
/* .param p3, "fontName" # Ljava/lang/String; */
/* .param p4, "width" # F */
/* .param p5, "alignment" # I */
/* .prologue */
/* .line 652 */
/* new-instance v0, Lcom/wiyun/engine/opengl/Texture2D; */
/* move-object v1, p0 */
/* move v2, p1 */
/* move v3, p2 */
/* move-object v4, p3 */
/* move v5, p4 */
/* move v6, p5 */
/* invoke-direct/range {v0 ..v6}, Lcom/wiyun/engine/opengl/Texture2D;-><init>(Ljava/lang/String;FILjava/lang/String;FI)V */
/* .line 653 */
/* .local v0, "tex":Lcom/wiyun/engine/opengl/Texture2D; */
} // .end method
public static com.wiyun.engine.opengl.Texture2D make ( java.lang.String p0, Float p1, java.lang.String p2, Boolean p3, Float p4, Integer p5 ) {
/* .locals 7 */
/* .param p0, "text" # Ljava/lang/String; */
/* .param p1, "fontSize" # F */
/* .param p2, "fontPath" # Ljava/lang/String; */
/* .param p3, "isFile" # Z */
/* .param p4, "width" # F */
/* .param p5, "alignment" # I */
/* .prologue */
/* .line 633 */
/* new-instance v0, Lcom/wiyun/engine/opengl/Texture2D; */
/* move-object v1, p0 */
/* move v2, p1 */
/* move-object v3, p2 */
/* move v4, p3 */
/* move v5, p4 */
/* move v6, p5 */
/* invoke-direct/range {v0 ..v6}, Lcom/wiyun/engine/opengl/Texture2D;-><init>(Ljava/lang/String;FLjava/lang/String;ZFI)V */
/* .line 634 */
/* .local v0, "tex":Lcom/wiyun/engine/opengl/Texture2D; */
} // .end method
public static com.wiyun.engine.opengl.Texture2D makeBMP ( Integer p0 ) {
/* .locals 1 */
/* .param p0, "resId" # I */
/* .prologue */
/* .line 76 */
int v0 = 0; // const/4 v0, 0x0
com.wiyun.engine.opengl.Texture2D .makeBMP ( p0,v0 );
} // .end method
public static com.wiyun.engine.opengl.Texture2D makeBMP ( Integer p0, Integer p1 ) {
/* .locals 1 */
/* .param p0, "resId" # I */
/* .param p1, "transparentColor" # I */
/* .prologue */
/* .line 88 */
com.wiyun.engine.opengl.TextureManager .getInstance ( );
v0 = (( com.wiyun.engine.opengl.TextureManager ) v0 ).getTexturePixelFormat ( ); // invoke-virtual {v0}, Lcom/wiyun/engine/opengl/TextureManager;->getTexturePixelFormat()I
com.wiyun.engine.opengl.Texture2D .makeBMP ( p0,p1,v0 );
} // .end method
public static com.wiyun.engine.opengl.Texture2D makeBMP ( Integer p0, Integer p1, Integer p2 ) {
/* .locals 2 */
/* .param p0, "resId" # I */
/* .param p1, "transparentColor" # I */
/* .param p2, "format" # I */
/* .prologue */
/* .line 101 */
/* new-instance v0, Lcom/wiyun/engine/opengl/Texture2D; */
int v1 = 1; // const/4 v1, 0x1
/* invoke-direct {v0, v1, p0, p1, p2}, Lcom/wiyun/engine/opengl/Texture2D;-><init>(IIII)V */
/* .line 102 */
/* .local v0, "tex":Lcom/wiyun/engine/opengl/Texture2D; */
} // .end method
public static com.wiyun.engine.opengl.Texture2D makeBMP ( java.lang.String p0 ) {
/* .locals 1 */
/* .param p0, "path" # Ljava/lang/String; */
/* .prologue */
/* .line 112 */
int v0 = 0; // const/4 v0, 0x0
com.wiyun.engine.opengl.Texture2D .makeBMP ( p0,v0 );
} // .end method
public static com.wiyun.engine.opengl.Texture2D makeBMP ( java.lang.String p0, Integer p1 ) {
/* .locals 1 */
/* .param p0, "path" # Ljava/lang/String; */
/* .param p1, "transparentColor" # I */
/* .prologue */
/* .line 124 */
com.wiyun.engine.opengl.TextureManager .getInstance ( );
v0 = (( com.wiyun.engine.opengl.TextureManager ) v0 ).getTexturePixelFormat ( ); // invoke-virtual {v0}, Lcom/wiyun/engine/opengl/TextureManager;->getTexturePixelFormat()I
com.wiyun.engine.opengl.Texture2D .makeBMP ( p0,p1,v0 );
} // .end method
public static com.wiyun.engine.opengl.Texture2D makeBMP ( java.lang.String p0, Integer p1, Integer p2 ) {
/* .locals 1 */
/* .param p0, "path" # Ljava/lang/String; */
/* .param p1, "transparentColor" # I */
/* .param p2, "format" # I */
/* .prologue */
/* .line 137 */
v0 = com.wiyun.engine.nodes.Director .getDefaultInDensity ( );
com.wiyun.engine.opengl.Texture2D .makeBMP ( p0,p1,p2,v0 );
} // .end method
public static com.wiyun.engine.opengl.Texture2D makeBMP ( java.lang.String p0, Integer p1, Integer p2, Float p3 ) {
/* .locals 6 */
/* .param p0, "path" # Ljava/lang/String; */
/* .param p1, "transparentColor" # I */
/* .param p2, "format" # I */
/* .param p3, "inDensity" # F */
/* .prologue */
/* .line 151 */
/* new-instance v0, Lcom/wiyun/engine/opengl/Texture2D; */
int v1 = 1; // const/4 v1, 0x1
/* move-object v2, p0 */
/* move v3, p1 */
/* move v4, p2 */
/* move v5, p3 */
/* invoke-direct/range {v0 ..v5}, Lcom/wiyun/engine/opengl/Texture2D;-><init>(ILjava/lang/String;IIF)V */
/* .line 152 */
/* .local v0, "tex":Lcom/wiyun/engine/opengl/Texture2D; */
} // .end method
public static com.wiyun.engine.opengl.Texture2D makeFileBMP ( java.lang.String p0 ) {
/* .locals 1 */
/* .param p0, "path" # Ljava/lang/String; */
/* .prologue */
/* .line 465 */
int v0 = 0; // const/4 v0, 0x0
com.wiyun.engine.opengl.Texture2D .makeFileBMP ( p0,v0 );
} // .end method
public static com.wiyun.engine.opengl.Texture2D makeFileBMP ( java.lang.String p0, Integer p1 ) {
/* .locals 1 */
/* .param p0, "path" # Ljava/lang/String; */
/* .param p1, "transparentColor" # I */
/* .prologue */
/* .line 477 */
com.wiyun.engine.opengl.TextureManager .getInstance ( );
v0 = (( com.wiyun.engine.opengl.TextureManager ) v0 ).getTexturePixelFormat ( ); // invoke-virtual {v0}, Lcom/wiyun/engine/opengl/TextureManager;->getTexturePixelFormat()I
com.wiyun.engine.opengl.Texture2D .makeFileBMP ( p0,p1,v0 );
} // .end method
public static com.wiyun.engine.opengl.Texture2D makeFileBMP ( java.lang.String p0, Integer p1, Integer p2 ) {
/* .locals 1 */
/* .param p0, "path" # Ljava/lang/String; */
/* .param p1, "transparentColor" # I */
/* .param p2, "format" # I */
/* .prologue */
/* .line 490 */
v0 = com.wiyun.engine.nodes.Director .getDefaultInDensity ( );
com.wiyun.engine.opengl.Texture2D .makeFileBMP ( p0,p1,p2,v0 );
} // .end method
public static com.wiyun.engine.opengl.Texture2D makeFileBMP ( java.lang.String p0, Integer p1, Integer p2, Float p3 ) {
/* .locals 7 */
/* .param p0, "path" # Ljava/lang/String; */
/* .param p1, "transparentColor" # I */
/* .param p2, "format" # I */
/* .param p3, "inDensity" # F */
/* .prologue */
/* .line 504 */
/* new-instance v0, Lcom/wiyun/engine/opengl/Texture2D; */
int v1 = 0; // const/4 v1, 0x0
int v2 = 1; // const/4 v2, 0x1
/* move-object v3, p0 */
/* move v4, p1 */
/* move v5, p2 */
/* move v6, p3 */
/* invoke-direct/range {v0 ..v6}, Lcom/wiyun/engine/opengl/Texture2D;-><init>(IILjava/lang/String;IIF)V */
/* .line 505 */
/* .local v0, "tex":Lcom/wiyun/engine/opengl/Texture2D; */
} // .end method
public static com.wiyun.engine.opengl.Texture2D makeFileJPG ( java.lang.String p0 ) {
/* .locals 1 */
/* .param p0, "path" # Ljava/lang/String; */
/* .prologue */
/* .line 515 */
int v0 = 0; // const/4 v0, 0x0
com.wiyun.engine.opengl.Texture2D .makeFileJPG ( p0,v0 );
} // .end method
public static com.wiyun.engine.opengl.Texture2D makeFileJPG ( java.lang.String p0, Integer p1 ) {
/* .locals 1 */
/* .param p0, "path" # Ljava/lang/String; */
/* .param p1, "transparentColor" # I */
/* .prologue */
/* .line 527 */
com.wiyun.engine.opengl.TextureManager .getInstance ( );
v0 = (( com.wiyun.engine.opengl.TextureManager ) v0 ).getTexturePixelFormat ( ); // invoke-virtual {v0}, Lcom/wiyun/engine/opengl/TextureManager;->getTexturePixelFormat()I
com.wiyun.engine.opengl.Texture2D .makeFileJPG ( p0,p1,v0 );
} // .end method
public static com.wiyun.engine.opengl.Texture2D makeFileJPG ( java.lang.String p0, Integer p1, Integer p2 ) {
/* .locals 1 */
/* .param p0, "path" # Ljava/lang/String; */
/* .param p1, "transparentColor" # I */
/* .param p2, "format" # I */
/* .prologue */
/* .line 540 */
v0 = com.wiyun.engine.nodes.Director .getDefaultInDensity ( );
com.wiyun.engine.opengl.Texture2D .makeFileJPG ( p0,p1,p2,v0 );
} // .end method
public static com.wiyun.engine.opengl.Texture2D makeFileJPG ( java.lang.String p0, Integer p1, Integer p2, Float p3 ) {
/* .locals 7 */
/* .param p0, "path" # Ljava/lang/String; */
/* .param p1, "transparentColor" # I */
/* .param p2, "format" # I */
/* .param p3, "inDensity" # F */
/* .prologue */
/* .line 554 */
/* new-instance v0, Lcom/wiyun/engine/opengl/Texture2D; */
int v1 = 0; // const/4 v1, 0x0
int v2 = 2; // const/4 v2, 0x2
/* move-object v3, p0 */
/* move v4, p1 */
/* move v5, p2 */
/* move v6, p3 */
/* invoke-direct/range {v0 ..v6}, Lcom/wiyun/engine/opengl/Texture2D;-><init>(IILjava/lang/String;IIF)V */
/* .line 555 */
/* .local v0, "tex":Lcom/wiyun/engine/opengl/Texture2D; */
} // .end method
public static com.wiyun.engine.opengl.Texture2D makeFilePNG ( java.lang.String p0 ) {
/* .locals 1 */
/* .param p0, "path" # Ljava/lang/String; */
/* .prologue */
/* .line 419 */
v0 = com.wiyun.engine.nodes.Director .getDefaultInDensity ( );
com.wiyun.engine.opengl.Texture2D .makeFilePNG ( p0,v0 );
} // .end method
public static com.wiyun.engine.opengl.Texture2D makeFilePNG ( java.lang.String p0, Float p1 ) {
/* .locals 7 */
/* .param p0, "path" # Ljava/lang/String; */
/* .param p1, "inDensity" # F */
/* .prologue */
int v1 = 0; // const/4 v1, 0x0
/* .line 441 */
/* new-instance v0, Lcom/wiyun/engine/opengl/Texture2D; */
int v2 = 3; // const/4 v2, 0x3
com.wiyun.engine.opengl.TextureManager .getInstance ( );
v5 = (( com.wiyun.engine.opengl.TextureManager ) v3 ).getTexturePixelFormat ( ); // invoke-virtual {v3}, Lcom/wiyun/engine/opengl/TextureManager;->getTexturePixelFormat()I
/* move-object v3, p0 */
/* move v4, v1 */
/* move v6, p1 */
/* invoke-direct/range {v0 ..v6}, Lcom/wiyun/engine/opengl/Texture2D;-><init>(IILjava/lang/String;IIF)V */
/* .line 442 */
/* .local v0, "tex":Lcom/wiyun/engine/opengl/Texture2D; */
} // .end method
public static com.wiyun.engine.opengl.Texture2D makeFilePNG ( java.lang.String p0, Integer p1 ) {
/* .locals 1 */
/* .param p0, "path" # Ljava/lang/String; */
/* .param p1, "format" # I */
/* .prologue */
/* .line 430 */
v0 = com.wiyun.engine.nodes.Director .getDefaultInDensity ( );
com.wiyun.engine.opengl.Texture2D .makeFilePNG ( p0,p1,v0 );
} // .end method
public static com.wiyun.engine.opengl.Texture2D makeFilePNG ( java.lang.String p0, Integer p1, Float p2 ) {
/* .locals 7 */
/* .param p0, "path" # Ljava/lang/String; */
/* .param p1, "format" # I */
/* .param p2, "inDensity" # F */
/* .prologue */
int v1 = 0; // const/4 v1, 0x0
/* .line 454 */
/* new-instance v0, Lcom/wiyun/engine/opengl/Texture2D; */
int v2 = 3; // const/4 v2, 0x3
/* move-object v3, p0 */
/* move v4, v1 */
/* move v5, p1 */
/* move v6, p2 */
/* invoke-direct/range {v0 ..v6}, Lcom/wiyun/engine/opengl/Texture2D;-><init>(IILjava/lang/String;IIF)V */
/* .line 455 */
/* .local v0, "tex":Lcom/wiyun/engine/opengl/Texture2D; */
} // .end method
public static com.wiyun.engine.opengl.Texture2D makeFilePVR ( java.lang.String p0 ) {
/* .locals 1 */
/* .param p0, "path" # Ljava/lang/String; */
/* .prologue */
/* .line 565 */
v0 = com.wiyun.engine.nodes.Director .getDefaultInDensity ( );
com.wiyun.engine.opengl.Texture2D .makeFilePVR ( p0,v0 );
} // .end method
public static com.wiyun.engine.opengl.Texture2D makeFilePVR ( java.lang.String p0, Float p1 ) {
/* .locals 7 */
/* .param p0, "path" # Ljava/lang/String; */
/* .param p1, "inDensity" # F */
/* .prologue */
int v1 = 0; // const/4 v1, 0x0
/* .line 578 */
/* new-instance v0, Lcom/wiyun/engine/opengl/Texture2D; */
int v2 = 4; // const/4 v2, 0x4
com.wiyun.engine.opengl.TextureManager .getInstance ( );
v5 = (( com.wiyun.engine.opengl.TextureManager ) v3 ).getTexturePixelFormat ( ); // invoke-virtual {v3}, Lcom/wiyun/engine/opengl/TextureManager;->getTexturePixelFormat()I
/* move-object v3, p0 */
/* move v4, v1 */
/* move v6, p1 */
/* invoke-direct/range {v0 ..v6}, Lcom/wiyun/engine/opengl/Texture2D;-><init>(IILjava/lang/String;IIF)V */
/* .line 579 */
/* .local v0, "tex":Lcom/wiyun/engine/opengl/Texture2D; */
} // .end method
public static com.wiyun.engine.opengl.Texture2D makeGL ( Integer p0, Integer p1, Integer p2 ) {
/* .locals 1 */
/* .param p0, "tex" # I */
/* .param p1, "w" # I */
/* .param p2, "h" # I */
/* .prologue */
/* .line 327 */
/* new-instance v0, Lcom/wiyun/engine/opengl/Texture2D; */
/* invoke-direct {v0, p0, p1, p2}, Lcom/wiyun/engine/opengl/Texture2D;-><init>(III)V */
} // .end method
public static com.wiyun.engine.opengl.Texture2D makeJPG ( Integer p0 ) {
/* .locals 1 */
/* .param p0, "resId" # I */
/* .prologue */
/* .line 162 */
int v0 = 0; // const/4 v0, 0x0
com.wiyun.engine.opengl.Texture2D .makeJPG ( p0,v0 );
} // .end method
public static com.wiyun.engine.opengl.Texture2D makeJPG ( Integer p0, Integer p1 ) {
/* .locals 1 */
/* .param p0, "resId" # I */
/* .param p1, "transparentColor" # I */
/* .prologue */
/* .line 174 */
com.wiyun.engine.opengl.TextureManager .getInstance ( );
v0 = (( com.wiyun.engine.opengl.TextureManager ) v0 ).getTexturePixelFormat ( ); // invoke-virtual {v0}, Lcom/wiyun/engine/opengl/TextureManager;->getTexturePixelFormat()I
com.wiyun.engine.opengl.Texture2D .makeJPG ( p0,p1,v0 );
} // .end method
public static com.wiyun.engine.opengl.Texture2D makeJPG ( Integer p0, Integer p1, Integer p2 ) {
/* .locals 2 */
/* .param p0, "resId" # I */
/* .param p1, "transparentColor" # I */
/* .param p2, "format" # I */
/* .prologue */
/* .line 187 */
/* new-instance v0, Lcom/wiyun/engine/opengl/Texture2D; */
int v1 = 2; // const/4 v1, 0x2
/* invoke-direct {v0, v1, p0, p1, p2}, Lcom/wiyun/engine/opengl/Texture2D;-><init>(IIII)V */
/* .line 188 */
/* .local v0, "tex":Lcom/wiyun/engine/opengl/Texture2D; */
} // .end method
public static com.wiyun.engine.opengl.Texture2D makeJPG ( java.lang.String p0 ) {
/* .locals 1 */
/* .param p0, "path" # Ljava/lang/String; */
/* .prologue */
/* .line 198 */
int v0 = 0; // const/4 v0, 0x0
com.wiyun.engine.opengl.Texture2D .makeJPG ( p0,v0 );
} // .end method
public static com.wiyun.engine.opengl.Texture2D makeJPG ( java.lang.String p0, Integer p1 ) {
/* .locals 1 */
/* .param p0, "path" # Ljava/lang/String; */
/* .param p1, "transparentColor" # I */
/* .prologue */
/* .line 210 */
com.wiyun.engine.opengl.TextureManager .getInstance ( );
v0 = (( com.wiyun.engine.opengl.TextureManager ) v0 ).getTexturePixelFormat ( ); // invoke-virtual {v0}, Lcom/wiyun/engine/opengl/TextureManager;->getTexturePixelFormat()I
com.wiyun.engine.opengl.Texture2D .makeJPG ( p0,p1,v0 );
} // .end method
public static com.wiyun.engine.opengl.Texture2D makeJPG ( java.lang.String p0, Integer p1, Integer p2 ) {
/* .locals 1 */
/* .param p0, "path" # Ljava/lang/String; */
/* .param p1, "transparentColor" # I */
/* .param p2, "format" # I */
/* .prologue */
/* .line 223 */
v0 = com.wiyun.engine.nodes.Director .getDefaultInDensity ( );
com.wiyun.engine.opengl.Texture2D .makeJPG ( p0,p1,p2,v0 );
} // .end method
public static com.wiyun.engine.opengl.Texture2D makeJPG ( java.lang.String p0, Integer p1, Integer p2, Float p3 ) {
/* .locals 6 */
/* .param p0, "path" # Ljava/lang/String; */
/* .param p1, "transparentColor" # I */
/* .param p2, "format" # I */
/* .param p3, "inDensity" # F */
/* .prologue */
/* .line 237 */
/* new-instance v0, Lcom/wiyun/engine/opengl/Texture2D; */
int v1 = 2; // const/4 v1, 0x2
/* move-object v2, p0 */
/* move v3, p1 */
/* move v4, p2 */
/* move v5, p3 */
/* invoke-direct/range {v0 ..v5}, Lcom/wiyun/engine/opengl/Texture2D;-><init>(ILjava/lang/String;IIF)V */
/* .line 238 */
/* .local v0, "tex":Lcom/wiyun/engine/opengl/Texture2D; */
} // .end method
public static com.wiyun.engine.opengl.Texture2D makePNG ( Integer p0 ) {
/* .locals 4 */
/* .param p0, "resId" # I */
/* .prologue */
/* .line 350 */
/* new-instance v0, Lcom/wiyun/engine/opengl/Texture2D; */
int v1 = 3; // const/4 v1, 0x3
int v2 = 0; // const/4 v2, 0x0
com.wiyun.engine.opengl.TextureManager .getInstance ( );
v3 = (( com.wiyun.engine.opengl.TextureManager ) v3 ).getTexturePixelFormat ( ); // invoke-virtual {v3}, Lcom/wiyun/engine/opengl/TextureManager;->getTexturePixelFormat()I
/* invoke-direct {v0, v1, p0, v2, v3}, Lcom/wiyun/engine/opengl/Texture2D;-><init>(IIII)V */
/* .line 351 */
/* .local v0, "tex":Lcom/wiyun/engine/opengl/Texture2D; */
} // .end method
public static com.wiyun.engine.opengl.Texture2D makePNG ( Integer p0, Integer p1 ) {
/* .locals 3 */
/* .param p0, "resId" # I */
/* .param p1, "format" # I */
/* .prologue */
/* .line 362 */
/* new-instance v0, Lcom/wiyun/engine/opengl/Texture2D; */
int v1 = 3; // const/4 v1, 0x3
int v2 = 0; // const/4 v2, 0x0
/* invoke-direct {v0, v1, p0, v2, p1}, Lcom/wiyun/engine/opengl/Texture2D;-><init>(IIII)V */
/* .line 363 */
/* .local v0, "tex":Lcom/wiyun/engine/opengl/Texture2D; */
} // .end method
public static com.wiyun.engine.opengl.Texture2D makePNG ( java.lang.String p0 ) {
/* .locals 1 */
/* .param p0, "path" # Ljava/lang/String; */
/* .prologue */
/* .line 373 */
v0 = com.wiyun.engine.nodes.Director .getDefaultInDensity ( );
com.wiyun.engine.opengl.Texture2D .makePNG ( p0,v0 );
} // .end method
public static com.wiyun.engine.opengl.Texture2D makePNG ( java.lang.String p0, Float p1 ) {
/* .locals 6 */
/* .param p0, "path" # Ljava/lang/String; */
/* .param p1, "inDensity" # F */
/* .prologue */
/* .line 395 */
/* new-instance v0, Lcom/wiyun/engine/opengl/Texture2D; */
int v1 = 3; // const/4 v1, 0x3
int v3 = 0; // const/4 v3, 0x0
com.wiyun.engine.opengl.TextureManager .getInstance ( );
v4 = (( com.wiyun.engine.opengl.TextureManager ) v2 ).getTexturePixelFormat ( ); // invoke-virtual {v2}, Lcom/wiyun/engine/opengl/TextureManager;->getTexturePixelFormat()I
/* move-object v2, p0 */
/* move v5, p1 */
/* invoke-direct/range {v0 ..v5}, Lcom/wiyun/engine/opengl/Texture2D;-><init>(ILjava/lang/String;IIF)V */
/* .line 396 */
/* .local v0, "tex":Lcom/wiyun/engine/opengl/Texture2D; */
} // .end method
public static com.wiyun.engine.opengl.Texture2D makePNG ( java.lang.String p0, Integer p1 ) {
/* .locals 1 */
/* .param p0, "path" # Ljava/lang/String; */
/* .param p1, "format" # I */
/* .prologue */
/* .line 384 */
v0 = com.wiyun.engine.nodes.Director .getDefaultInDensity ( );
com.wiyun.engine.opengl.Texture2D .makePNG ( p0,p1,v0 );
} // .end method
public static com.wiyun.engine.opengl.Texture2D makePNG ( java.lang.String p0, Integer p1, Float p2 ) {
/* .locals 6 */
/* .param p0, "path" # Ljava/lang/String; */
/* .param p1, "format" # I */
/* .param p2, "inDensity" # F */
/* .prologue */
/* .line 408 */
/* new-instance v0, Lcom/wiyun/engine/opengl/Texture2D; */
int v1 = 3; // const/4 v1, 0x3
int v3 = 0; // const/4 v3, 0x0
/* move-object v2, p0 */
/* move v4, p1 */
/* move v5, p2 */
/* invoke-direct/range {v0 ..v5}, Lcom/wiyun/engine/opengl/Texture2D;-><init>(ILjava/lang/String;IIF)V */
/* .line 409 */
/* .local v0, "tex":Lcom/wiyun/engine/opengl/Texture2D; */
} // .end method
public static com.wiyun.engine.opengl.Texture2D makePVR ( Integer p0 ) {
/* .locals 4 */
/* .param p0, "resId" # I */
/* .prologue */
/* .line 590 */
/* new-instance v0, Lcom/wiyun/engine/opengl/Texture2D; */
int v1 = 4; // const/4 v1, 0x4
int v2 = 0; // const/4 v2, 0x0
com.wiyun.engine.opengl.TextureManager .getInstance ( );
v3 = (( com.wiyun.engine.opengl.TextureManager ) v3 ).getTexturePixelFormat ( ); // invoke-virtual {v3}, Lcom/wiyun/engine/opengl/TextureManager;->getTexturePixelFormat()I
/* invoke-direct {v0, v1, p0, v2, v3}, Lcom/wiyun/engine/opengl/Texture2D;-><init>(IIII)V */
/* .line 591 */
/* .local v0, "tex":Lcom/wiyun/engine/opengl/Texture2D; */
} // .end method
public static com.wiyun.engine.opengl.Texture2D makePVR ( java.lang.String p0 ) {
/* .locals 1 */
/* .param p0, "path" # Ljava/lang/String; */
/* .prologue */
/* .line 601 */
v0 = com.wiyun.engine.nodes.Director .getDefaultInDensity ( );
com.wiyun.engine.opengl.Texture2D .makePVR ( p0,v0 );
} // .end method
public static com.wiyun.engine.opengl.Texture2D makePVR ( java.lang.String p0, Float p1 ) {
/* .locals 6 */
/* .param p0, "path" # Ljava/lang/String; */
/* .param p1, "inDensity" # F */
/* .prologue */
/* .line 614 */
/* new-instance v0, Lcom/wiyun/engine/opengl/Texture2D; */
int v1 = 4; // const/4 v1, 0x4
int v3 = 0; // const/4 v3, 0x0
com.wiyun.engine.opengl.TextureManager .getInstance ( );
v4 = (( com.wiyun.engine.opengl.TextureManager ) v2 ).getTexturePixelFormat ( ); // invoke-virtual {v2}, Lcom/wiyun/engine/opengl/TextureManager;->getTexturePixelFormat()I
/* move-object v2, p0 */
/* move v5, p1 */
/* invoke-direct/range {v0 ..v5}, Lcom/wiyun/engine/opengl/Texture2D;-><init>(ILjava/lang/String;IIF)V */
/* .line 615 */
/* .local v0, "tex":Lcom/wiyun/engine/opengl/Texture2D; */
} // .end method
private native Integer nativeClone ( Integer p0 ) {
} // .end method
private native void nativeDrawAtPoint ( Float p0, Float p1 ) {
} // .end method
private native void nativeDrawAtPoint ( Float p0, Float p1, Boolean p2, Boolean p3 ) {
} // .end method
private native Integer nativeNew ( Integer p0, Integer p1, Integer p2 ) {
} // .end method
private native Integer nativeNew ( Integer p0, Integer p1, Integer p2, Integer p3 ) {
} // .end method
private native Integer nativeNew ( Integer p0, java.lang.String p1, Integer p2, Integer p3, Float p4 ) {
} // .end method
private native Integer nativeNew ( com.wiyun.engine.utils.BitmapRawData p0, Integer p1 ) {
} // .end method
private native Integer nativeNew ( java.lang.String p0, Float p1, Integer p2, java.lang.String p3, Float p4, Integer p5 ) {
} // .end method
private native Integer nativeNew ( java.lang.String p0, Float p1, java.lang.String p2, Boolean p3, Float p4, Integer p5 ) {
} // .end method
private native Integer nativeNewFile ( Integer p0, java.lang.String p1, Integer p2, Integer p3, Float p4 ) {
} // .end method
/* # virtual methods */
public native void applyFilter ( ) {
} // .end method
public native void applyTexParameters ( ) {
} // .end method
public com.wiyun.engine.opengl.Texture2D clone ( Integer p0 ) {
/* .locals 2 */
/* .param p1, "cloneId" # I */
/* .prologue */
/* .line 942 */
v0 = /* invoke-direct {p0, p1}, Lcom/wiyun/engine/opengl/Texture2D;->nativeClone(I)I */
/* .line 943 */
/* .local v0, "pointer":I */
com.wiyun.engine.opengl.Texture2D .from ( v0 );
} // .end method
public void drawAtPoint ( javax.microedition.khronos.opengles.GL10 p0, Float p1, Float p2 ) {
/* .locals 0 */
/* .param p1, "gl" # Ljavax/microedition/khronos/opengles/GL10; */
/* .param p2, "x" # F */
/* .param p3, "y" # F */
/* .prologue */
/* .line 759 */
/* invoke-direct {p0, p2, p3}, Lcom/wiyun/engine/opengl/Texture2D;->nativeDrawAtPoint(FF)V */
/* .line 760 */
return;
} // .end method
public void drawAtPoint ( javax.microedition.khronos.opengles.GL10 p0, Float p1, Float p2, Boolean p3, Boolean p4 ) {
/* .locals 0 */
/* .param p1, "gl" # Ljavax/microedition/khronos/opengles/GL10; */
/* .param p2, "x" # F */
/* .param p3, "y" # F */
/* .param p4, "flipX" # Z */
/* .param p5, "flipY" # Z */
/* .prologue */
/* .line 797 */
/* invoke-direct {p0, p2, p3, p4, p5}, Lcom/wiyun/engine/opengl/Texture2D;->nativeDrawAtPoint(FFZZ)V */
/* .line 798 */
return;
} // .end method
public void drawAtPoint ( javax.microedition.khronos.opengles.GL10 p0, com.wiyun.engine.types.WYPoint p1 ) {
/* .locals 2 */
/* .param p1, "gl" # Ljavax/microedition/khronos/opengles/GL10; */
/* .param p2, "point" # Lcom/wiyun/engine/types/WYPoint; */
/* .prologue */
/* .line 748 */
/* iget v0, p2, Lcom/wiyun/engine/types/WYPoint;->x:F */
/* iget v1, p2, Lcom/wiyun/engine/types/WYPoint;->y:F */
(( com.wiyun.engine.opengl.Texture2D ) p0 ).drawAtPoint ( p1, v0, v1 ); // invoke-virtual {p0, p1, v0, v1}, Lcom/wiyun/engine/opengl/Texture2D;->drawAtPoint(Ljavax/microedition/khronos/opengles/GL10;FF)V
/* .line 749 */
return;
} // .end method
public void drawAtPoint ( javax.microedition.khronos.opengles.GL10 p0, com.wiyun.engine.types.WYPoint p1, Boolean p2, Boolean p3 ) {
/* .locals 6 */
/* .param p1, "gl" # Ljavax/microedition/khronos/opengles/GL10; */
/* .param p2, "point" # Lcom/wiyun/engine/types/WYPoint; */
/* .param p3, "flipX" # Z */
/* .param p4, "flipY" # Z */
/* .prologue */
/* .line 782 */
/* iget v2, p2, Lcom/wiyun/engine/types/WYPoint;->x:F */
/* iget v3, p2, Lcom/wiyun/engine/types/WYPoint;->y:F */
/* move-object v0, p0 */
/* move-object v1, p1 */
/* move v4, p3 */
/* move v5, p4 */
/* invoke-virtual/range {v0 ..v5}, Lcom/wiyun/engine/opengl/Texture2D;->drawAtPoint(Ljavax/microedition/khronos/opengles/GL10;FFZZ)V */
/* .line 783 */
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
/* .prologue */
/* .line 830 */
int v0 = 0; // const/4 v0, 0x0
} // .end method
public native Boolean isFlipX ( ) {
} // .end method
public native Boolean isFlipY ( ) {
} // .end method
public native void loadTexture ( ) {
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
public native void switchToClone ( Integer p0 ) {
} // .end method
public native void updateRaw ( com.wiyun.engine.utils.BitmapRawData p0 ) {
} // .end method
