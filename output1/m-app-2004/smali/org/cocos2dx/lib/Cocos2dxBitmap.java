public class org.cocos2dx.lib.Cocos2dxBitmap {
	 /* .source "Cocos2dxBitmap.java" */
	 /* # annotations */
	 /* .annotation system Ldalvik/annotation/MemberClasses; */
	 /* value = { */
	 /* Lorg/cocos2dx/lib/Cocos2dxBitmap$TextProperty; */
	 /* } */
} // .end annotation
/* # static fields */
private static final Integer ALIGNCENTER;
private static final Integer ALIGNLEFT;
private static final Integer ALIGNRIGHT;
private static android.content.Context context;
/* # direct methods */
public org.cocos2dx.lib.Cocos2dxBitmap ( ) {
	 /* .locals 0 */
	 /* .prologue */
	 /* .line 40 */
	 /* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
	 return;
} // .end method
private static org.cocos2dx.lib.Cocos2dxBitmap$TextProperty computeTextProperty ( java.lang.String p0, android.graphics.Paint p1, Integer p2, Integer p3 ) {
	 /* .locals 11 */
	 /* .param p0, "content" # Ljava/lang/String; */
	 /* .param p1, "paint" # Landroid/graphics/Paint; */
	 /* .param p2, "maxWidth" # I */
	 /* .param p3, "maxHeight" # I */
	 /* .prologue */
	 int v7 = 0; // const/4 v7, 0x0
	 /* .line 135 */
	 (( android.graphics.Paint ) p1 ).getFontMetricsInt ( ); // invoke-virtual {p1}, Landroid/graphics/Paint;->getFontMetricsInt()Landroid/graphics/Paint$FontMetricsInt;
	 /* .line 136 */
	 /* .local v0, "fm":Landroid/graphics/Paint$FontMetricsInt; */
	 /* iget v6, v0, Landroid/graphics/Paint$FontMetricsInt;->bottom:I */
	 /* iget v8, v0, Landroid/graphics/Paint$FontMetricsInt;->top:I */
	 /* sub-int/2addr v6, v8 */
	 /* int-to-double v8, v6 */
	 java.lang.Math .ceil ( v8,v9 );
	 /* move-result-wide v8 */
	 /* double-to-int v1, v8 */
	 /* .line 137 */
	 /* .local v1, "h":I */
	 int v4 = 0; // const/4 v4, 0x0
	 /* .line 139 */
	 /* .local v4, "maxContentWidth":I */
	 org.cocos2dx.lib.Cocos2dxBitmap .splitString ( p0,p3,p2,p1 );
	 /* .line 141 */
	 /* .local v3, "lines":[Ljava/lang/String; */
	 if ( p2 != null) { // if-eqz p2, :cond_1
		 /* .line 142 */
		 /* move v4, p2 */
		 /* .line 157 */
	 } // :cond_0
	 /* new-instance v6, Lorg/cocos2dx/lib/Cocos2dxBitmap$TextProperty; */
	 /* invoke-direct {v6, v4, v1, v3}, Lorg/cocos2dx/lib/Cocos2dxBitmap$TextProperty;-><init>(II[Ljava/lang/String;)V */
	 /* .line 148 */
} // :cond_1
int v5 = 0; // const/4 v5, 0x0
/* .line 149 */
/* .local v5, "temp":I */
/* array-length v8, v3 */
/* move v6, v7 */
} // :goto_0
/* if-ge v6, v8, :cond_0 */
/* aget-object v2, v3, v6 */
/* .line 150 */
/* .local v2, "line":Ljava/lang/String; */
v9 = (( java.lang.String ) v2 ).length ( ); // invoke-virtual {v2}, Ljava/lang/String;->length()I
v9 = (( android.graphics.Paint ) p1 ).measureText ( v2, v7, v9 ); // invoke-virtual {p1, v2, v7, v9}, Landroid/graphics/Paint;->measureText(Ljava/lang/String;II)F
/* float-to-double v9, v9 */
java.lang.Math .ceil ( v9,v10 );
/* move-result-wide v9 */
/* double-to-int v5, v9 */
/* .line 151 */
/* if-le v5, v4, :cond_2 */
/* .line 152 */
/* move v4, v5 */
/* .line 149 */
} // :cond_2
/* add-int/lit8 v6, v6, 0x1 */
} // .end method
private static Integer computeX ( android.graphics.Paint p0, java.lang.String p1, Integer p2, Integer p3 ) {
/* .locals 1 */
/* .param p0, "paint" # Landroid/graphics/Paint; */
/* .param p1, "content" # Ljava/lang/String; */
/* .param p2, "w" # I */
/* .param p3, "alignment" # I */
/* .prologue */
/* .line 91 */
int v0 = 0; // const/4 v0, 0x0
/* .line 93 */
/* .local v0, "ret":I */
/* packed-switch p3, :pswitch_data_0 */
/* .line 114 */
} // :goto_0
/* :pswitch_0 */
/* .line 95 */
/* :pswitch_1 */
/* div-int/lit8 v0, p2, 0x2 */
/* .line 96 */
/* .line 103 */
/* :pswitch_2 */
/* move v0, p2 */
/* .line 104 */
/* .line 93 */
/* :pswitch_data_0 */
/* .packed-switch 0x31 */
/* :pswitch_0 */
/* :pswitch_2 */
/* :pswitch_1 */
} // .end packed-switch
} // .end method
public static void createTextBitmap ( java.lang.String p0, java.lang.String p1, Integer p2, Integer p3, Integer p4, Integer p5 ) {
/* .locals 17 */
/* .param p0, "content" # Ljava/lang/String; */
/* .param p1, "fontName" # Ljava/lang/String; */
/* .param p2, "fontSize" # I */
/* .param p3, "alignment" # I */
/* .param p4, "width" # I */
/* .param p5, "height" # I */
/* .prologue */
/* .line 62 */
/* invoke-static/range {p0 ..p0}, Lorg/cocos2dx/lib/Cocos2dxBitmap;->refactorString(Ljava/lang/String;)Ljava/lang/String; */
/* .line 63 */
/* invoke-static/range {p1 ..p3}, Lorg/cocos2dx/lib/Cocos2dxBitmap;->newPaint(Ljava/lang/String;II)Landroid/graphics/Paint; */
/* .line 65 */
/* .local v9, "paint":Landroid/graphics/Paint; */
/* move-object/from16 v0, p0 */
/* move/from16 v1, p4 */
/* move/from16 v2, p5 */
org.cocos2dx.lib.Cocos2dxBitmap .computeTextProperty ( v0,v9,v1,v2 );
/* .line 67 */
/* .local v10, "textProperty":Lorg/cocos2dx/lib/Cocos2dxBitmap$TextProperty; */
/* if-nez p5, :cond_0 */
/* iget v4, v10, Lorg/cocos2dx/lib/Cocos2dxBitmap$TextProperty;->totalHeight:I */
/* .line 71 */
/* .local v4, "bitmapTotalHeight":I */
} // :goto_0
/* iget v13, v10, Lorg/cocos2dx/lib/Cocos2dxBitmap$TextProperty;->maxWidth:I */
/* if-lez v13, :cond_1 */
/* iget v13, v10, Lorg/cocos2dx/lib/Cocos2dxBitmap$TextProperty;->maxWidth:I */
/* .line 72 */
} // :goto_1
/* if-lez v4, :cond_2 */
} // .end local v4 # "bitmapTotalHeight":I
} // :goto_2
v14 = android.graphics.Bitmap$Config.ARGB_8888;
/* .line 71 */
android.graphics.Bitmap .createBitmap ( v13,v4,v14 );
/* .line 73 */
/* .local v3, "bitmap":Landroid/graphics/Bitmap; */
/* new-instance v5, Landroid/graphics/Canvas; */
/* invoke-direct {v5, v3}, Landroid/graphics/Canvas;-><init>(Landroid/graphics/Bitmap;)V */
/* .line 76 */
/* .local v5, "canvas":Landroid/graphics/Canvas; */
(( android.graphics.Paint ) v9 ).getFontMetricsInt ( ); // invoke-virtual {v9}, Landroid/graphics/Paint;->getFontMetricsInt()Landroid/graphics/Paint$FontMetricsInt;
/* .line 77 */
/* .local v6, "fm":Landroid/graphics/Paint$FontMetricsInt; */
int v11 = 0; // const/4 v11, 0x0
/* .line 78 */
/* .local v11, "x":I */
/* if-nez p5, :cond_3 */
/* iget v13, v6, Landroid/graphics/Paint$FontMetricsInt;->top:I */
/* neg-int v12, v13 */
/* .line 80 */
/* .local v12, "y":I */
} // :goto_3
v8 = this.lines;
/* .line 81 */
/* .local v8, "lines":[Ljava/lang/String; */
/* array-length v14, v8 */
int v13 = 0; // const/4 v13, 0x0
} // :goto_4
/* if-lt v13, v14, :cond_4 */
/* .line 87 */
org.cocos2dx.lib.Cocos2dxBitmap .initNativeObject ( v3 );
/* .line 88 */
return;
} // .end local v3 # "bitmap":Landroid/graphics/Bitmap;
} // .end local v5 # "canvas":Landroid/graphics/Canvas;
} // .end local v6 # "fm":Landroid/graphics/Paint$FontMetricsInt;
} // .end local v8 # "lines":[Ljava/lang/String;
} // .end local v11 # "x":I
} // .end local v12 # "y":I
} // :cond_0
/* move/from16 v4, p5 */
/* .line 67 */
/* .line 71 */
/* .restart local v4 # "bitmapTotalHeight":I */
} // :cond_1
int v13 = 1; // const/4 v13, 0x1
/* .line 72 */
} // :cond_2
int v4 = 1; // const/4 v4, 0x1
/* .line 79 */
} // .end local v4 # "bitmapTotalHeight":I
/* .restart local v3 # "bitmap":Landroid/graphics/Bitmap; */
/* .restart local v5 # "canvas":Landroid/graphics/Canvas; */
/* .restart local v6 # "fm":Landroid/graphics/Paint$FontMetricsInt; */
/* .restart local v11 # "x":I */
} // :cond_3
/* iget v13, v6, Landroid/graphics/Paint$FontMetricsInt;->top:I */
/* neg-int v13, v13 */
/* iget v14, v10, Lorg/cocos2dx/lib/Cocos2dxBitmap$TextProperty;->totalHeight:I */
/* sub-int v14, p5, v14 */
/* div-int/lit8 v14, v14, 0x2 */
/* add-int v12, v13, v14 */
/* .line 81 */
/* .restart local v8 # "lines":[Ljava/lang/String; */
/* .restart local v12 # "y":I */
} // :cond_4
/* aget-object v7, v8, v13 */
/* .line 82 */
/* .local v7, "line":Ljava/lang/String; */
/* iget v15, v10, Lorg/cocos2dx/lib/Cocos2dxBitmap$TextProperty;->maxWidth:I */
/* move/from16 v0, p3 */
v11 = org.cocos2dx.lib.Cocos2dxBitmap .computeX ( v9,v7,v15,v0 );
/* .line 83 */
/* int-to-float v15, v11 */
/* int-to-float v0, v12 */
/* move/from16 v16, v0 */
/* move/from16 v0, v16 */
(( android.graphics.Canvas ) v5 ).drawText ( v7, v15, v0, v9 ); // invoke-virtual {v5, v7, v15, v0, v9}, Landroid/graphics/Canvas;->drawText(Ljava/lang/String;FFLandroid/graphics/Paint;)V
/* .line 84 */
/* iget v15, v10, Lorg/cocos2dx/lib/Cocos2dxBitmap$TextProperty;->heightPerLine:I */
/* add-int/2addr v12, v15 */
/* .line 81 */
/* add-int/lit8 v13, v13, 0x1 */
} // .end method
private static java.util.LinkedList divideStringWithMaxWidth ( android.graphics.Paint p0, java.lang.String p1, Integer p2 ) {
/* .locals 8 */
/* .param p0, "paint" # Landroid/graphics/Paint; */
/* .param p1, "content" # Ljava/lang/String; */
/* .param p2, "width" # I */
/* .annotation system Ldalvik/annotation/Signature; */
/* value = { */
/* "(", */
/* "Landroid/graphics/Paint;", */
/* "Ljava/lang/String;", */
/* "I)", */
/* "Ljava/util/LinkedList", */
/* "<", */
/* "Ljava/lang/String;", */
/* ">;" */
/* } */
} // .end annotation
/* .prologue */
/* .line 227 */
v0 = (( java.lang.String ) p1 ).length ( ); // invoke-virtual {p1}, Ljava/lang/String;->length()I
/* .line 228 */
/* .local v0, "charLength":I */
int v3 = 0; // const/4 v3, 0x0
/* .line 229 */
/* .local v3, "start":I */
int v5 = 0; // const/4 v5, 0x0
/* .line 230 */
/* .local v5, "tempWidth":I */
/* new-instance v4, Ljava/util/LinkedList; */
/* invoke-direct {v4}, Ljava/util/LinkedList;-><init>()V */
/* .line 235 */
/* .local v4, "strList":Ljava/util/LinkedList;, "Ljava/util/LinkedList<Ljava/lang/String;>;" */
int v1 = 1; // const/4 v1, 0x1
/* .local v1, "i":I */
} // :goto_0
/* if-le v1, v0, :cond_1 */
/* .line 270 */
/* if-ge v3, v0, :cond_0 */
/* .line 271 */
(( java.lang.String ) p1 ).substring ( v3 ); // invoke-virtual {p1, v3}, Ljava/lang/String;->substring(I)Ljava/lang/String;
(( java.util.LinkedList ) v4 ).add ( v6 ); // invoke-virtual {v4, v6}, Ljava/util/LinkedList;->add(Ljava/lang/Object;)Z
/* .line 274 */
} // :cond_0
/* .line 236 */
} // :cond_1
v6 = (( android.graphics.Paint ) p0 ).measureText ( p1, v3, v1 ); // invoke-virtual {p0, p1, v3, v1}, Landroid/graphics/Paint;->measureText(Ljava/lang/String;II)F
/* float-to-double v6, v6 */
java.lang.Math .ceil ( v6,v7 );
/* move-result-wide v6 */
/* double-to-int v5, v6 */
/* .line 237 */
/* if-lt v5, p2, :cond_2 */
/* .line 238 */
int v6 = 0; // const/4 v6, 0x0
(( java.lang.String ) p1 ).substring ( v6, v1 ); // invoke-virtual {p1, v6, v1}, Ljava/lang/String;->substring(II)Ljava/lang/String;
final String v7 = " "; // const-string v7, " "
v2 = (( java.lang.String ) v6 ).lastIndexOf ( v7 ); // invoke-virtual {v6, v7}, Ljava/lang/String;->lastIndexOf(Ljava/lang/String;)I
/* .line 240 */
/* .local v2, "lastIndexOfSpace":I */
int v6 = -1; // const/4 v6, -0x1
/* if-eq v2, v6, :cond_3 */
/* if-le v2, v3, :cond_3 */
/* .line 244 */
(( java.lang.String ) p1 ).substring ( v3, v2 ); // invoke-virtual {p1, v3, v2}, Ljava/lang/String;->substring(II)Ljava/lang/String;
(( java.util.LinkedList ) v4 ).add ( v6 ); // invoke-virtual {v4, v6}, Ljava/util/LinkedList;->add(Ljava/lang/Object;)Z
/* .line 245 */
/* move v1, v2 */
/* .line 263 */
} // :goto_1
/* move v3, v1 */
/* .line 235 */
} // .end local v2 # "lastIndexOfSpace":I
} // :cond_2
/* add-int/lit8 v1, v1, 0x1 */
/* .line 251 */
/* .restart local v2 # "lastIndexOfSpace":I */
} // :cond_3
/* if-le v5, p2, :cond_4 */
/* .line 252 */
/* add-int/lit8 v6, v1, -0x1 */
(( java.lang.String ) p1 ).substring ( v3, v6 ); // invoke-virtual {p1, v3, v6}, Ljava/lang/String;->substring(II)Ljava/lang/String;
(( java.util.LinkedList ) v4 ).add ( v6 ); // invoke-virtual {v4, v6}, Ljava/util/LinkedList;->add(Ljava/lang/Object;)Z
/* .line 256 */
/* add-int/lit8 v1, v1, -0x1 */
/* .line 259 */
} // :cond_4
(( java.lang.String ) p1 ).substring ( v3, v1 ); // invoke-virtual {p1, v3, v1}, Ljava/lang/String;->substring(II)Ljava/lang/String;
(( java.util.LinkedList ) v4 ).add ( v6 ); // invoke-virtual {v4, v6}, Ljava/util/LinkedList;->add(Ljava/lang/Object;)Z
} // .end method
private static getPixels ( android.graphics.Bitmap p0 ) {
/* .locals 4 */
/* .param p0, "bitmap" # Landroid/graphics/Bitmap; */
/* .prologue */
/* .line 370 */
if ( p0 != null) { // if-eqz p0, :cond_0
/* .line 371 */
v2 = (( android.graphics.Bitmap ) p0 ).getWidth ( ); // invoke-virtual {p0}, Landroid/graphics/Bitmap;->getWidth()I
v3 = (( android.graphics.Bitmap ) p0 ).getHeight ( ); // invoke-virtual {p0}, Landroid/graphics/Bitmap;->getHeight()I
/* mul-int/2addr v2, v3 */
/* mul-int/lit8 v2, v2, 0x4 */
/* new-array v1, v2, [B */
/* .line 372 */
/* .local v1, "pixels":[B */
java.nio.ByteBuffer .wrap ( v1 );
/* .line 373 */
/* .local v0, "buf":Ljava/nio/ByteBuffer; */
java.nio.ByteOrder .nativeOrder ( );
(( java.nio.ByteBuffer ) v0 ).order ( v2 ); // invoke-virtual {v0, v2}, Ljava/nio/ByteBuffer;->order(Ljava/nio/ByteOrder;)Ljava/nio/ByteBuffer;
/* .line 374 */
(( android.graphics.Bitmap ) p0 ).copyPixelsToBuffer ( v0 ); // invoke-virtual {p0, v0}, Landroid/graphics/Bitmap;->copyPixelsToBuffer(Ljava/nio/Buffer;)V
/* .line 378 */
} // .end local v0 # "buf":Ljava/nio/ByteBuffer;
} // .end local v1 # "pixels":[B
} // :goto_0
} // :cond_0
int v1 = 0; // const/4 v1, 0x0
} // .end method
private static void initNativeObject ( android.graphics.Bitmap p0 ) {
/* .locals 3 */
/* .param p0, "bitmap" # Landroid/graphics/Bitmap; */
/* .prologue */
/* .line 361 */
org.cocos2dx.lib.Cocos2dxBitmap .getPixels ( p0 );
/* .line 362 */
/* .local v0, "pixels":[B */
/* if-nez v0, :cond_0 */
/* .line 367 */
} // :goto_0
return;
/* .line 366 */
} // :cond_0
v1 = (( android.graphics.Bitmap ) p0 ).getWidth ( ); // invoke-virtual {p0}, Landroid/graphics/Bitmap;->getWidth()I
v2 = (( android.graphics.Bitmap ) p0 ).getHeight ( ); // invoke-virtual {p0}, Landroid/graphics/Bitmap;->getHeight()I
org.cocos2dx.lib.Cocos2dxBitmap .nativeInitBitmapDC ( v1,v2,v0 );
} // .end method
private static native void nativeInitBitmapDC ( Integer p0, Integer p1, Object[] p2 ) {
} // .end method
private static android.graphics.Paint newPaint ( java.lang.String p0, Integer p1, Integer p2 ) {
/* .locals 7 */
/* .param p0, "fontName" # Ljava/lang/String; */
/* .param p1, "fontSize" # I */
/* .param p2, "alignment" # I */
/* .prologue */
int v6 = 0; // const/4 v6, 0x0
/* .line 278 */
/* new-instance v1, Landroid/graphics/Paint; */
/* invoke-direct {v1}, Landroid/graphics/Paint;-><init>()V */
/* .line 279 */
/* .local v1, "paint":Landroid/graphics/Paint; */
int v3 = -1; // const/4 v3, -0x1
(( android.graphics.Paint ) v1 ).setColor ( v3 ); // invoke-virtual {v1, v3}, Landroid/graphics/Paint;->setColor(I)V
/* .line 280 */
/* int-to-float v3, p1 */
(( android.graphics.Paint ) v1 ).setTextSize ( v3 ); // invoke-virtual {v1, v3}, Landroid/graphics/Paint;->setTextSize(F)V
/* .line 281 */
int v3 = 1; // const/4 v3, 0x1
(( android.graphics.Paint ) v1 ).setAntiAlias ( v3 ); // invoke-virtual {v1, v3}, Landroid/graphics/Paint;->setAntiAlias(Z)V
/* .line 286 */
final String v3 = ".ttf"; // const-string v3, ".ttf"
v3 = (( java.lang.String ) p0 ).endsWith ( v3 ); // invoke-virtual {p0, v3}, Ljava/lang/String;->endsWith(Ljava/lang/String;)Z
if ( v3 != null) { // if-eqz v3, :cond_0
/* .line 289 */
try { // :try_start_0
v3 = org.cocos2dx.lib.Cocos2dxBitmap.context;
org.cocos2dx.lib.Cocos2dxTypefaces .get ( v3,p0 );
/* .line 290 */
/* .local v2, "typeFace":Landroid/graphics/Typeface; */
(( android.graphics.Paint ) v1 ).setTypeface ( v2 ); // invoke-virtual {v1, v2}, Landroid/graphics/Paint;->setTypeface(Landroid/graphics/Typeface;)Landroid/graphics/Typeface;
/* :try_end_0 */
/* .catch Ljava/lang/Exception; {:try_start_0 ..:try_end_0} :catch_0 */
/* .line 305 */
} // .end local v2 # "typeFace":Landroid/graphics/Typeface;
} // :goto_0
/* packed-switch p2, :pswitch_data_0 */
/* .line 319 */
v3 = android.graphics.Paint$Align.LEFT;
(( android.graphics.Paint ) v1 ).setTextAlign ( v3 ); // invoke-virtual {v1, v3}, Landroid/graphics/Paint;->setTextAlign(Landroid/graphics/Paint$Align;)V
/* .line 323 */
} // :goto_1
/* .line 291 */
/* :catch_0 */
/* move-exception v0 */
/* .line 292 */
/* .local v0, "e":Ljava/lang/Exception; */
final String v3 = "Cocos2dxBitmap"; // const-string v3, "Cocos2dxBitmap"
/* .line 293 */
/* new-instance v4, Ljava/lang/StringBuilder; */
final String v5 = "error to create ttf type face: "; // const-string v5, "error to create ttf type face: "
/* invoke-direct {v4, v5}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V */
(( java.lang.StringBuilder ) v4 ).append ( p0 ); // invoke-virtual {v4, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v4 ).toString ( ); // invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
/* .line 292 */
android.util.Log .e ( v3,v4 );
/* .line 298 */
android.graphics.Typeface .create ( p0,v6 );
(( android.graphics.Paint ) v1 ).setTypeface ( v3 ); // invoke-virtual {v1, v3}, Landroid/graphics/Paint;->setTypeface(Landroid/graphics/Typeface;)Landroid/graphics/Typeface;
/* .line 302 */
} // .end local v0 # "e":Ljava/lang/Exception;
} // :cond_0
android.graphics.Typeface .create ( p0,v6 );
(( android.graphics.Paint ) v1 ).setTypeface ( v3 ); // invoke-virtual {v1, v3}, Landroid/graphics/Paint;->setTypeface(Landroid/graphics/Typeface;)Landroid/graphics/Typeface;
/* .line 307 */
/* :pswitch_0 */
v3 = android.graphics.Paint$Align.CENTER;
(( android.graphics.Paint ) v1 ).setTextAlign ( v3 ); // invoke-virtual {v1, v3}, Landroid/graphics/Paint;->setTextAlign(Landroid/graphics/Paint$Align;)V
/* .line 311 */
/* :pswitch_1 */
v3 = android.graphics.Paint$Align.LEFT;
(( android.graphics.Paint ) v1 ).setTextAlign ( v3 ); // invoke-virtual {v1, v3}, Landroid/graphics/Paint;->setTextAlign(Landroid/graphics/Paint$Align;)V
/* .line 315 */
/* :pswitch_2 */
v3 = android.graphics.Paint$Align.RIGHT;
(( android.graphics.Paint ) v1 ).setTextAlign ( v3 ); // invoke-virtual {v1, v3}, Landroid/graphics/Paint;->setTextAlign(Landroid/graphics/Paint$Align;)V
/* .line 305 */
/* nop */
/* :pswitch_data_0 */
/* .packed-switch 0x31 */
/* :pswitch_1 */
/* :pswitch_2 */
/* :pswitch_0 */
} // .end packed-switch
} // .end method
private static java.lang.String refactorString ( java.lang.String p0 ) {
/* .locals 5 */
/* .param p0, "str" # Ljava/lang/String; */
/* .prologue */
/* .line 328 */
final String v3 = ""; // const-string v3, ""
v3 = (( java.lang.String ) p0 ).compareTo ( v3 ); // invoke-virtual {p0, v3}, Ljava/lang/String;->compareTo(Ljava/lang/String;)I
/* if-nez v3, :cond_0 */
/* .line 329 */
final String v3 = " "; // const-string v3, " "
/* .line 357 */
} // :goto_0
/* .line 339 */
} // :cond_0
/* new-instance v2, Ljava/lang/StringBuilder; */
/* invoke-direct {v2, p0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V */
/* .line 340 */
/* .local v2, "strBuilder":Ljava/lang/StringBuilder; */
int v1 = 0; // const/4 v1, 0x0
/* .line 341 */
/* .local v1, "start":I */
final String v3 = "\n"; // const-string v3, "\n"
v0 = (( java.lang.StringBuilder ) v2 ).indexOf ( v3 ); // invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->indexOf(Ljava/lang/String;)I
/* .line 342 */
/* .local v0, "index":I */
} // :goto_1
int v3 = -1; // const/4 v3, -0x1
/* if-ne v0, v3, :cond_2 */
/* .line 357 */
} // :cond_1
(( java.lang.StringBuilder ) v2 ).toString ( ); // invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
/* .line 343 */
} // :cond_2
if ( v0 != null) { // if-eqz v0, :cond_3
/* add-int/lit8 v3, v0, -0x1 */
v3 = (( java.lang.StringBuilder ) v2 ).charAt ( v3 ); // invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->charAt(I)C
/* const/16 v4, 0xa */
/* if-ne v3, v4, :cond_4 */
/* .line 344 */
} // :cond_3
final String v3 = " "; // const-string v3, " "
(( java.lang.StringBuilder ) v2 ).insert ( v1, v3 ); // invoke-virtual {v2, v1, v3}, Ljava/lang/StringBuilder;->insert(ILjava/lang/String;)Ljava/lang/StringBuilder;
/* .line 345 */
/* add-int/lit8 v1, v0, 0x2 */
/* .line 350 */
} // :goto_2
v3 = (( java.lang.StringBuilder ) v2 ).length ( ); // invoke-virtual {v2}, Ljava/lang/StringBuilder;->length()I
/* if-gt v1, v3, :cond_1 */
v3 = (( java.lang.StringBuilder ) v2 ).length ( ); // invoke-virtual {v2}, Ljava/lang/StringBuilder;->length()I
/* if-eq v0, v3, :cond_1 */
/* .line 354 */
final String v3 = "\n"; // const-string v3, "\n"
v0 = (( java.lang.StringBuilder ) v2 ).indexOf ( v3, v1 ); // invoke-virtual {v2, v3, v1}, Ljava/lang/StringBuilder;->indexOf(Ljava/lang/String;I)I
/* .line 347 */
} // :cond_4
/* add-int/lit8 v1, v0, 0x1 */
} // .end method
public static void setContext ( android.content.Context p0 ) {
/* .locals 0 */
/* .param p0, "context" # Landroid/content/Context; */
/* .prologue */
/* .line 52 */
/* .line 53 */
return;
} // .end method
private static java.lang.String splitString ( java.lang.String p0, Integer p1, Integer p2, android.graphics.Paint p3 ) {
/* .locals 15 */
/* .param p0, "content" # Ljava/lang/String; */
/* .param p1, "maxHeight" # I */
/* .param p2, "maxWidth" # I */
/* .param p3, "paint" # Landroid/graphics/Paint; */
/* .prologue */
/* .line 166 */
final String v11 = "\\n"; // const-string v11, "\\n"
(( java.lang.String ) p0 ).split ( v11 ); // invoke-virtual {p0, v11}, Ljava/lang/String;->split(Ljava/lang/String;)[Ljava/lang/String;
/* .line 167 */
/* .local v7, "lines":[Ljava/lang/String; */
int v9 = 0; // const/4 v9, 0x0
/* .line 168 */
/* .local v9, "ret":[Ljava/lang/String; */
/* invoke-virtual/range {p3 ..p3}, Landroid/graphics/Paint;->getFontMetricsInt()Landroid/graphics/Paint$FontMetricsInt; */
/* .line 169 */
/* .local v2, "fm":Landroid/graphics/Paint$FontMetricsInt; */
/* iget v11, v2, Landroid/graphics/Paint$FontMetricsInt;->bottom:I */
/* iget v12, v2, Landroid/graphics/Paint$FontMetricsInt;->top:I */
/* sub-int/2addr v11, v12 */
/* int-to-double v11, v11 */
java.lang.Math .ceil ( v11,v12 );
/* move-result-wide v11 */
/* double-to-int v3, v11 */
/* .line 170 */
/* .local v3, "heightPerLine":I */
/* div-int v8, p1, v3 */
/* .line 172 */
/* .local v8, "maxLines":I */
if ( p2 != null) { // if-eqz p2, :cond_6
/* .line 173 */
/* new-instance v10, Ljava/util/LinkedList; */
/* invoke-direct {v10}, Ljava/util/LinkedList;-><init>()V */
/* .line 174 */
/* .local v10, "strList":Ljava/util/LinkedList;, "Ljava/util/LinkedList<Ljava/lang/String;>;" */
/* array-length v12, v7 */
int v11 = 0; // const/4 v11, 0x0
} // :goto_0
/* if-lt v11, v12, :cond_2 */
/* .line 198 */
} // :cond_0
/* if-lez v8, :cond_1 */
v11 = (( java.util.LinkedList ) v10 ).size ( ); // invoke-virtual {v10}, Ljava/util/LinkedList;->size()I
/* if-le v11, v8, :cond_1 */
/* .line 199 */
} // :goto_1
v11 = (( java.util.LinkedList ) v10 ).size ( ); // invoke-virtual {v10}, Ljava/util/LinkedList;->size()I
/* if-gt v11, v8, :cond_5 */
/* .line 204 */
} // :cond_1
v11 = (( java.util.LinkedList ) v10 ).size ( ); // invoke-virtual {v10}, Ljava/util/LinkedList;->size()I
/* new-array v9, v11, [Ljava/lang/String; */
/* .line 205 */
(( java.util.LinkedList ) v10 ).toArray ( v9 ); // invoke-virtual {v10, v9}, Ljava/util/LinkedList;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;
/* .line 222 */
} // .end local v10 # "strList":Ljava/util/LinkedList;, "Ljava/util/LinkedList<Ljava/lang/String;>;"
} // :goto_2
/* .line 174 */
/* .restart local v10 # "strList":Ljava/util/LinkedList;, "Ljava/util/LinkedList<Ljava/lang/String;>;" */
} // :cond_2
/* aget-object v5, v7, v11 */
/* .line 179 */
/* .local v5, "line":Ljava/lang/String; */
/* move-object/from16 v0, p3 */
v13 = (( android.graphics.Paint ) v0 ).measureText ( v5 ); // invoke-virtual {v0, v5}, Landroid/graphics/Paint;->measureText(Ljava/lang/String;)F
/* float-to-double v13, v13 */
java.lang.Math .ceil ( v13,v14 );
/* move-result-wide v13 */
/* double-to-int v6, v13 */
/* .line 180 */
/* .local v6, "lineWidth":I */
/* move/from16 v0, p2 */
/* if-le v6, v0, :cond_4 */
/* .line 181 */
/* move-object/from16 v0, p3 */
/* move/from16 v1, p2 */
org.cocos2dx.lib.Cocos2dxBitmap .divideStringWithMaxWidth ( v0,v5,v1 );
(( java.util.LinkedList ) v10 ).addAll ( v13 ); // invoke-virtual {v10, v13}, Ljava/util/LinkedList;->addAll(Ljava/util/Collection;)Z
/* .line 190 */
} // :goto_3
/* if-lez v8, :cond_3 */
v13 = (( java.util.LinkedList ) v10 ).size ( ); // invoke-virtual {v10}, Ljava/util/LinkedList;->size()I
/* if-ge v13, v8, :cond_0 */
/* .line 174 */
} // :cond_3
/* add-int/lit8 v11, v11, 0x1 */
/* .line 184 */
} // :cond_4
(( java.util.LinkedList ) v10 ).add ( v5 ); // invoke-virtual {v10, v5}, Ljava/util/LinkedList;->add(Ljava/lang/Object;)Z
/* .line 200 */
} // .end local v5 # "line":Ljava/lang/String;
} // .end local v6 # "lineWidth":I
} // :cond_5
(( java.util.LinkedList ) v10 ).removeLast ( ); // invoke-virtual {v10}, Ljava/util/LinkedList;->removeLast()Ljava/lang/Object;
/* .line 207 */
} // .end local v10 # "strList":Ljava/util/LinkedList;, "Ljava/util/LinkedList<Ljava/lang/String;>;"
} // :cond_6
if ( p1 != null) { // if-eqz p1, :cond_8
/* array-length v11, v7 */
/* if-le v11, v8, :cond_8 */
/* .line 211 */
/* new-instance v10, Ljava/util/LinkedList; */
/* invoke-direct {v10}, Ljava/util/LinkedList;-><init>()V */
/* .line 212 */
/* .restart local v10 # "strList":Ljava/util/LinkedList;, "Ljava/util/LinkedList<Ljava/lang/String;>;" */
int v4 = 0; // const/4 v4, 0x0
/* .local v4, "i":I */
} // :goto_4
/* if-lt v4, v8, :cond_7 */
/* .line 215 */
v11 = (( java.util.LinkedList ) v10 ).size ( ); // invoke-virtual {v10}, Ljava/util/LinkedList;->size()I
/* new-array v9, v11, [Ljava/lang/String; */
/* .line 216 */
(( java.util.LinkedList ) v10 ).toArray ( v9 ); // invoke-virtual {v10, v9}, Ljava/util/LinkedList;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;
/* .line 213 */
} // :cond_7
/* aget-object v11, v7, v4 */
(( java.util.LinkedList ) v10 ).add ( v11 ); // invoke-virtual {v10, v11}, Ljava/util/LinkedList;->add(Ljava/lang/Object;)Z
/* .line 212 */
/* add-int/lit8 v4, v4, 0x1 */
/* .line 219 */
} // .end local v4 # "i":I
} // .end local v10 # "strList":Ljava/util/LinkedList;, "Ljava/util/LinkedList<Ljava/lang/String;>;"
} // :cond_8
/* move-object v9, v7 */
} // .end method
