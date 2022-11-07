public class org.cocos2dx.lib.Cocos2dxBitmap {
	 /* .source "Cocos2dxBitmap.java" */
	 /* # annotations */
	 /* .annotation system Ldalvik/annotation/MemberClasses; */
	 /* value = { */
	 /* Lorg/cocos2dx/lib/Cocos2dxBitmap$TextProperty; */
	 /* } */
} // .end annotation
/* # static fields */
private static final Integer HORIZONTALALIGN_CENTER;
private static final Integer HORIZONTALALIGN_LEFT;
private static final Integer HORIZONTALALIGN_RIGHT;
private static final Integer VERTICALALIGN_BOTTOM;
private static final Integer VERTICALALIGN_CENTER;
private static final Integer VERTICALALIGN_TOP;
private static android.content.Context sContext;
/* # direct methods */
public org.cocos2dx.lib.Cocos2dxBitmap ( ) {
	 /* .locals 0 */
	 /* .prologue */
	 /* .line 44 */
	 /* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
	 return;
} // .end method
private static org.cocos2dx.lib.Cocos2dxBitmap$TextProperty computeTextProperty ( java.lang.String p0, Integer p1, Integer p2, android.graphics.Paint p3 ) {
	 /* .locals 10 */
	 /* .param p0, "pString" # Ljava/lang/String; */
	 /* .param p1, "pWidth" # I */
	 /* .param p2, "pHeight" # I */
	 /* .param p3, "pPaint" # Landroid/graphics/Paint; */
	 /* .prologue */
	 int v7 = 0; // const/4 v7, 0x0
	 /* .line 157 */
	 (( android.graphics.Paint ) p3 ).getFontMetricsInt ( ); // invoke-virtual {p3}, Landroid/graphics/Paint;->getFontMetricsInt()Landroid/graphics/Paint$FontMetricsInt;
	 /* .line 158 */
	 /* .local v0, "fm":Landroid/graphics/Paint$FontMetricsInt; */
	 /* iget v6, v0, Landroid/graphics/Paint$FontMetricsInt;->bottom:I */
	 /* iget v8, v0, Landroid/graphics/Paint$FontMetricsInt;->top:I */
	 /* sub-int/2addr v6, v8 */
	 /* int-to-double v8, v6 */
	 java.lang.Math .ceil ( v8,v9 );
	 /* move-result-wide v8 */
	 /* double-to-int v1, v8 */
	 /* .line 159 */
	 /* .local v1, "h":I */
	 int v4 = 0; // const/4 v4, 0x0
	 /* .line 161 */
	 /* .local v4, "maxContentWidth":I */
	 org.cocos2dx.lib.Cocos2dxBitmap .splitString ( p0,p1,p2,p3 );
	 /* .line 163 */
	 /* .local v3, "lines":[Ljava/lang/String; */
	 if ( p1 != null) { // if-eqz p1, :cond_1
		 /* .line 164 */
		 /* move v4, p1 */
		 /* .line 176 */
	 } // :cond_0
	 /* new-instance v6, Lorg/cocos2dx/lib/Cocos2dxBitmap$TextProperty; */
	 /* invoke-direct {v6, v4, v1, v3}, Lorg/cocos2dx/lib/Cocos2dxBitmap$TextProperty;-><init>(II[Ljava/lang/String;)V */
	 /* .line 167 */
} // :cond_1
int v5 = 0; // const/4 v5, 0x0
/* .line 168 */
/* .local v5, "temp":I */
/* array-length v8, v3 */
/* move v6, v7 */
} // :goto_0
/* if-ge v6, v8, :cond_0 */
/* aget-object v2, v3, v6 */
/* .line 169 */
/* .local v2, "line":Ljava/lang/String; */
v9 = (( java.lang.String ) v2 ).length ( ); // invoke-virtual {v2}, Ljava/lang/String;->length()I
v9 = (( android.graphics.Paint ) p3 ).measureText ( v2, v7, v9 ); // invoke-virtual {p3, v2, v7, v9}, Landroid/graphics/Paint;->measureText(Ljava/lang/String;II)F
v9 = android.util.FloatMath .ceil ( v9 );
/* float-to-int v5, v9 */
/* .line 170 */
/* if-le v5, v4, :cond_2 */
/* .line 171 */
/* move v4, v5 */
/* .line 168 */
} // :cond_2
/* add-int/lit8 v6, v6, 0x1 */
} // .end method
private static Integer computeX ( java.lang.String p0, Integer p1, Integer p2 ) {
/* .locals 1 */
/* .param p0, "pText" # Ljava/lang/String; */
/* .param p1, "pMaxWidth" # I */
/* .param p2, "pHorizontalAlignment" # I */
/* .prologue */
/* .line 180 */
int v0 = 0; // const/4 v0, 0x0
/* .line 182 */
/* .local v0, "ret":I */
/* packed-switch p2, :pswitch_data_0 */
/* .line 194 */
} // :goto_0
/* .line 184 */
/* :pswitch_0 */
/* div-int/lit8 v0, p1, 0x2 */
/* .line 185 */
/* .line 187 */
/* :pswitch_1 */
/* move v0, p1 */
/* .line 188 */
/* .line 182 */
/* :pswitch_data_0 */
/* .packed-switch 0x2 */
/* :pswitch_1 */
/* :pswitch_0 */
} // .end packed-switch
} // .end method
private static Integer computeY ( android.graphics.Paint$FontMetricsInt p0, Integer p1, Integer p2, Integer p3 ) {
/* .locals 3 */
/* .param p0, "pFontMetricsInt" # Landroid/graphics/Paint$FontMetricsInt; */
/* .param p1, "pConstrainHeight" # I */
/* .param p2, "pTotalHeight" # I */
/* .param p3, "pVerticalAlignment" # I */
/* .prologue */
/* .line 198 */
/* iget v1, p0, Landroid/graphics/Paint$FontMetricsInt;->top:I */
/* neg-int v0, v1 */
/* .line 200 */
/* .local v0, "y":I */
/* if-le p1, p2, :cond_0 */
/* .line 201 */
/* packed-switch p3, :pswitch_data_0 */
/* .line 216 */
} // :cond_0
} // :goto_0
/* .line 203 */
/* :pswitch_0 */
/* iget v1, p0, Landroid/graphics/Paint$FontMetricsInt;->top:I */
/* neg-int v0, v1 */
/* .line 204 */
/* .line 206 */
/* :pswitch_1 */
/* iget v1, p0, Landroid/graphics/Paint$FontMetricsInt;->top:I */
/* neg-int v1, v1 */
/* sub-int v2, p1, p2 */
/* div-int/lit8 v2, v2, 0x2 */
/* add-int v0, v1, v2 */
/* .line 207 */
/* .line 209 */
/* :pswitch_2 */
/* iget v1, p0, Landroid/graphics/Paint$FontMetricsInt;->top:I */
/* neg-int v1, v1 */
/* sub-int v2, p1, p2 */
/* add-int v0, v1, v2 */
/* .line 210 */
/* .line 201 */
/* nop */
/* :pswitch_data_0 */
/* .packed-switch 0x1 */
/* :pswitch_0 */
/* :pswitch_2 */
/* :pswitch_1 */
} // .end packed-switch
} // .end method
public static void createTextBitmap ( java.lang.String p0, java.lang.String p1, Integer p2, Integer p3, Integer p4, Integer p5 ) {
/* .locals 19 */
/* .param p0, "pString" # Ljava/lang/String; */
/* .param p1, "pFontName" # Ljava/lang/String; */
/* .param p2, "pFontSize" # I */
/* .param p3, "pAlignment" # I */
/* .param p4, "pWidth" # I */
/* .param p5, "pHeight" # I */
/* .prologue */
/* .line 92 */
/* and-int/lit8 v7, p3, 0xf */
/* .line 93 */
/* .local v7, "horizontalAlignment":I */
/* shr-int/lit8 v15, p3, 0x4 */
/* and-int/lit8 v12, v15, 0xf */
/* .line 95 */
/* .local v12, "verticalAlignment":I */
/* invoke-static/range {p0 ..p0}, Lorg/cocos2dx/lib/Cocos2dxBitmap;->refactorString(Ljava/lang/String;)Ljava/lang/String; */
/* .line 96 */
/* move-object/from16 v0, p1 */
/* move/from16 v1, p2 */
org.cocos2dx.lib.Cocos2dxBitmap .newPaint ( v0,v1,v7 );
/* .line 98 */
/* .local v10, "paint":Landroid/graphics/Paint; */
/* move-object/from16 v0, p0 */
/* move/from16 v1, p4 */
/* move/from16 v2, p5 */
org.cocos2dx.lib.Cocos2dxBitmap .computeTextProperty ( v0,v1,v2,v10 );
/* .line 100 */
/* .local v11, "textProperty":Lorg/cocos2dx/lib/Cocos2dxBitmap$TextProperty; */
/* if-nez p5, :cond_0 */
v4 = org.cocos2dx.lib.Cocos2dxBitmap$TextProperty .access$0 ( v11 );
/* .line 102 */
/* .local v4, "bitmapTotalHeight":I */
} // :goto_0
v15 = org.cocos2dx.lib.Cocos2dxBitmap$TextProperty .access$1 ( v11 );
v16 = android.graphics.Bitmap$Config.ARGB_8888;
/* move-object/from16 v0, v16 */
android.graphics.Bitmap .createBitmap ( v15,v4,v0 );
/* .line 103 */
/* .local v3, "bitmap":Landroid/graphics/Bitmap; */
/* new-instance v5, Landroid/graphics/Canvas; */
/* invoke-direct {v5, v3}, Landroid/graphics/Canvas;-><init>(Landroid/graphics/Bitmap;)V */
/* .line 106 */
/* .local v5, "canvas":Landroid/graphics/Canvas; */
(( android.graphics.Paint ) v10 ).getFontMetricsInt ( ); // invoke-virtual {v10}, Landroid/graphics/Paint;->getFontMetricsInt()Landroid/graphics/Paint$FontMetricsInt;
/* .line 107 */
/* .local v6, "fontMetricsInt":Landroid/graphics/Paint$FontMetricsInt; */
int v13 = 0; // const/4 v13, 0x0
/* .line 108 */
/* .local v13, "x":I */
v15 = org.cocos2dx.lib.Cocos2dxBitmap$TextProperty .access$0 ( v11 );
/* move/from16 v0, p5 */
v14 = org.cocos2dx.lib.Cocos2dxBitmap .computeY ( v6,v0,v15,v12 );
/* .line 109 */
/* .local v14, "y":I */
org.cocos2dx.lib.Cocos2dxBitmap$TextProperty .access$2 ( v11 );
/* .line 110 */
/* .local v9, "lines":[Ljava/lang/String; */
/* array-length v0, v9 */
/* move/from16 v16, v0 */
int v15 = 0; // const/4 v15, 0x0
} // :goto_1
/* move/from16 v0, v16 */
/* if-lt v15, v0, :cond_1 */
/* .line 116 */
org.cocos2dx.lib.Cocos2dxBitmap .initNativeObject ( v3 );
/* .line 117 */
return;
} // .end local v3 # "bitmap":Landroid/graphics/Bitmap;
} // .end local v4 # "bitmapTotalHeight":I
} // .end local v5 # "canvas":Landroid/graphics/Canvas;
} // .end local v6 # "fontMetricsInt":Landroid/graphics/Paint$FontMetricsInt;
} // .end local v9 # "lines":[Ljava/lang/String;
} // .end local v13 # "x":I
} // .end local v14 # "y":I
} // :cond_0
/* move/from16 v4, p5 */
/* .line 100 */
/* .line 110 */
/* .restart local v3 # "bitmap":Landroid/graphics/Bitmap; */
/* .restart local v4 # "bitmapTotalHeight":I */
/* .restart local v5 # "canvas":Landroid/graphics/Canvas; */
/* .restart local v6 # "fontMetricsInt":Landroid/graphics/Paint$FontMetricsInt; */
/* .restart local v9 # "lines":[Ljava/lang/String; */
/* .restart local v13 # "x":I */
/* .restart local v14 # "y":I */
} // :cond_1
/* aget-object v8, v9, v15 */
/* .line 111 */
/* .local v8, "line":Ljava/lang/String; */
v17 = org.cocos2dx.lib.Cocos2dxBitmap$TextProperty .access$1 ( v11 );
/* move/from16 v0, v17 */
v13 = org.cocos2dx.lib.Cocos2dxBitmap .computeX ( v8,v0,v7 );
/* .line 112 */
/* int-to-float v0, v13 */
/* move/from16 v17, v0 */
/* int-to-float v0, v14 */
/* move/from16 v18, v0 */
/* move/from16 v0, v17 */
/* move/from16 v1, v18 */
(( android.graphics.Canvas ) v5 ).drawText ( v8, v0, v1, v10 ); // invoke-virtual {v5, v8, v0, v1, v10}, Landroid/graphics/Canvas;->drawText(Ljava/lang/String;FFLandroid/graphics/Paint;)V
/* .line 113 */
v17 = org.cocos2dx.lib.Cocos2dxBitmap$TextProperty .access$3 ( v11 );
/* add-int v14, v14, v17 */
/* .line 110 */
/* add-int/lit8 v15, v15, 0x1 */
} // .end method
private static java.util.LinkedList divideStringWithMaxWidth ( java.lang.String p0, Integer p1, android.graphics.Paint p2 ) {
/* .locals 9 */
/* .param p0, "pString" # Ljava/lang/String; */
/* .param p1, "pMaxWidth" # I */
/* .param p2, "pPaint" # Landroid/graphics/Paint; */
/* .annotation system Ldalvik/annotation/Signature; */
/* value = { */
/* "(", */
/* "Ljava/lang/String;", */
/* "I", */
/* "Landroid/graphics/Paint;", */
/* ")", */
/* "Ljava/util/LinkedList", */
/* "<", */
/* "Ljava/lang/String;", */
/* ">;" */
/* } */
} // .end annotation
/* .prologue */
/* .line 271 */
v0 = (( java.lang.String ) p0 ).length ( ); // invoke-virtual {p0}, Ljava/lang/String;->length()I
/* .line 272 */
/* .local v0, "charLength":I */
int v4 = 0; // const/4 v4, 0x0
/* .line 273 */
/* .local v4, "start":I */
int v6 = 0; // const/4 v6, 0x0
/* .line 274 */
/* .local v6, "tempWidth":I */
/* new-instance v5, Ljava/util/LinkedList; */
/* invoke-direct {v5}, Ljava/util/LinkedList;-><init>()V */
/* .line 277 */
/* .local v5, "strList":Ljava/util/LinkedList;, "Ljava/util/LinkedList<Ljava/lang/String;>;" */
int v1 = 1; // const/4 v1, 0x1
/* .local v1, "i":I */
} // :goto_0
/* if-le v1, v0, :cond_1 */
/* .line 307 */
/* if-ge v4, v0, :cond_0 */
/* .line 308 */
(( java.lang.String ) p0 ).substring ( v4 ); // invoke-virtual {p0, v4}, Ljava/lang/String;->substring(I)Ljava/lang/String;
(( java.util.LinkedList ) v5 ).add ( v7 ); // invoke-virtual {v5, v7}, Ljava/util/LinkedList;->add(Ljava/lang/Object;)Z
/* .line 311 */
} // :cond_0
/* .line 278 */
} // :cond_1
v7 = (( android.graphics.Paint ) p2 ).measureText ( p0, v4, v1 ); // invoke-virtual {p2, p0, v4, v1}, Landroid/graphics/Paint;->measureText(Ljava/lang/String;II)F
v7 = android.util.FloatMath .ceil ( v7 );
/* float-to-int v6, v7 */
/* .line 279 */
/* if-lt v6, p1, :cond_2 */
/* .line 280 */
int v7 = 0; // const/4 v7, 0x0
(( java.lang.String ) p0 ).substring ( v7, v1 ); // invoke-virtual {p0, v7, v1}, Ljava/lang/String;->substring(II)Ljava/lang/String;
final String v8 = " "; // const-string v8, " "
v3 = (( java.lang.String ) v7 ).lastIndexOf ( v8 ); // invoke-virtual {v7, v8}, Ljava/lang/String;->lastIndexOf(Ljava/lang/String;)I
/* .line 282 */
/* .local v3, "lastIndexOfSpace":I */
int v7 = -1; // const/4 v7, -0x1
/* if-eq v3, v7, :cond_3 */
/* if-le v3, v4, :cond_3 */
/* .line 284 */
(( java.lang.String ) p0 ).substring ( v4, v3 ); // invoke-virtual {p0, v4, v3}, Ljava/lang/String;->substring(II)Ljava/lang/String;
(( java.util.LinkedList ) v5 ).add ( v7 ); // invoke-virtual {v5, v7}, Ljava/util/LinkedList;->add(Ljava/lang/Object;)Z
/* .line 285 */
/* move v1, v3 */
/* .line 298 */
} // :goto_1
/* add-int/lit8 v2, v1, 0x1 */
} // .end local v1 # "i":I
/* .local v2, "i":I */
v7 = (( java.lang.String ) p0 ).indexOf ( v1 ); // invoke-virtual {p0, v1}, Ljava/lang/String;->indexOf(I)I
/* const/16 v8, 0x20 */
/* if-eq v7, v8, :cond_5 */
/* .line 302 */
/* move v4, v2 */
/* move v1, v2 */
/* .line 277 */
} // .end local v2 # "i":I
} // .end local v3 # "lastIndexOfSpace":I
/* .restart local v1 # "i":I */
} // :cond_2
/* add-int/lit8 v1, v1, 0x1 */
/* .line 288 */
/* .restart local v3 # "lastIndexOfSpace":I */
} // :cond_3
/* if-le v6, p1, :cond_4 */
/* .line 289 */
/* add-int/lit8 v7, v1, -0x1 */
(( java.lang.String ) p0 ).substring ( v4, v7 ); // invoke-virtual {p0, v4, v7}, Ljava/lang/String;->substring(II)Ljava/lang/String;
(( java.util.LinkedList ) v5 ).add ( v7 ); // invoke-virtual {v5, v7}, Ljava/util/LinkedList;->add(Ljava/lang/Object;)Z
/* .line 291 */
/* add-int/lit8 v1, v1, -0x1 */
/* .line 292 */
/* .line 293 */
} // :cond_4
(( java.lang.String ) p0 ).substring ( v4, v1 ); // invoke-virtual {p0, v4, v1}, Ljava/lang/String;->substring(II)Ljava/lang/String;
(( java.util.LinkedList ) v5 ).add ( v7 ); // invoke-virtual {v5, v7}, Ljava/util/LinkedList;->add(Ljava/lang/Object;)Z
} // .end local v1 # "i":I
/* .restart local v2 # "i":I */
} // :cond_5
/* move v1, v2 */
} // .end local v2 # "i":I
/* .restart local v1 # "i":I */
} // .end method
private static Integer getFontSizeAccordingHeight ( Integer p0 ) {
/* .locals 8 */
/* .param p0, "height" # I */
/* .prologue */
/* .line 366 */
/* new-instance v3, Landroid/graphics/Paint; */
/* invoke-direct {v3}, Landroid/graphics/Paint;-><init>()V */
/* .line 367 */
/* .local v3, "paint":Landroid/graphics/Paint; */
/* new-instance v0, Landroid/graphics/Rect; */
/* invoke-direct {v0}, Landroid/graphics/Rect;-><init>()V */
/* .line 369 */
/* .local v0, "bounds":Landroid/graphics/Rect; */
v5 = android.graphics.Typeface.DEFAULT;
(( android.graphics.Paint ) v3 ).setTypeface ( v5 ); // invoke-virtual {v3, v5}, Landroid/graphics/Paint;->setTypeface(Landroid/graphics/Typeface;)Landroid/graphics/Typeface;
/* .line 370 */
int v2 = 1; // const/4 v2, 0x1
/* .line 371 */
/* .local v2, "incr_text_size":I */
int v1 = 0; // const/4 v1, 0x0
/* .line 373 */
/* .local v1, "found_desired_size":Z */
} // :goto_0
if ( v1 != null) { // if-eqz v1, :cond_0
/* .line 386 */
/* .line 375 */
} // :cond_0
/* int-to-float v5, v2 */
(( android.graphics.Paint ) v3 ).setTextSize ( v5 ); // invoke-virtual {v3, v5}, Landroid/graphics/Paint;->setTextSize(F)V
/* .line 376 */
final String v4 = "SghMNy"; // const-string v4, "SghMNy"
/* .line 377 */
/* .local v4, "text":Ljava/lang/String; */
int v5 = 0; // const/4 v5, 0x0
v6 = (( java.lang.String ) v4 ).length ( ); // invoke-virtual {v4}, Ljava/lang/String;->length()I
(( android.graphics.Paint ) v3 ).getTextBounds ( v4, v5, v6, v0 ); // invoke-virtual {v3, v4, v5, v6, v0}, Landroid/graphics/Paint;->getTextBounds(Ljava/lang/String;IILandroid/graphics/Rect;)V
/* .line 379 */
/* add-int/lit8 v2, v2, 0x1 */
/* .line 381 */
v5 = (( android.graphics.Rect ) v0 ).height ( ); // invoke-virtual {v0}, Landroid/graphics/Rect;->height()I
/* sub-int v5, p0, v5 */
int v6 = 2; // const/4 v6, 0x2
/* if-gt v5, v6, :cond_1 */
/* .line 382 */
int v1 = 1; // const/4 v1, 0x1
/* .line 384 */
} // :cond_1
final String v5 = "font size"; // const-string v5, "font size"
/* new-instance v6, Ljava/lang/StringBuilder; */
final String v7 = "incr size:"; // const-string v7, "incr size:"
/* invoke-direct {v6, v7}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V */
(( java.lang.StringBuilder ) v6 ).append ( v2 ); // invoke-virtual {v6, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v6 ).toString ( ); // invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
android.util.Log .d ( v5,v6 );
} // .end method
private static getPixels ( android.graphics.Bitmap p0 ) {
/* .locals 4 */
/* .param p0, "pBitmap" # Landroid/graphics/Bitmap; */
/* .prologue */
/* .line 354 */
if ( p0 != null) { // if-eqz p0, :cond_0
/* .line 355 */
v2 = (( android.graphics.Bitmap ) p0 ).getWidth ( ); // invoke-virtual {p0}, Landroid/graphics/Bitmap;->getWidth()I
v3 = (( android.graphics.Bitmap ) p0 ).getHeight ( ); // invoke-virtual {p0}, Landroid/graphics/Bitmap;->getHeight()I
/* mul-int/2addr v2, v3 */
/* mul-int/lit8 v2, v2, 0x4 */
/* new-array v1, v2, [B */
/* .line 356 */
/* .local v1, "pixels":[B */
java.nio.ByteBuffer .wrap ( v1 );
/* .line 357 */
/* .local v0, "buf":Ljava/nio/ByteBuffer; */
java.nio.ByteOrder .nativeOrder ( );
(( java.nio.ByteBuffer ) v0 ).order ( v2 ); // invoke-virtual {v0, v2}, Ljava/nio/ByteBuffer;->order(Ljava/nio/ByteOrder;)Ljava/nio/ByteBuffer;
/* .line 358 */
(( android.graphics.Bitmap ) p0 ).copyPixelsToBuffer ( v0 ); // invoke-virtual {p0, v0}, Landroid/graphics/Bitmap;->copyPixelsToBuffer(Ljava/nio/Buffer;)V
/* .line 362 */
} // .end local v0 # "buf":Ljava/nio/ByteBuffer;
} // .end local v1 # "pixels":[B
} // :goto_0
} // :cond_0
int v1 = 0; // const/4 v1, 0x0
} // .end method
private static java.lang.String getStringWithEllipsis ( java.lang.String p0, Float p1, Float p2 ) {
/* .locals 2 */
/* .param p0, "pString" # Ljava/lang/String; */
/* .param p1, "width" # F */
/* .param p2, "fontSize" # F */
/* .prologue */
/* .line 390 */
v1 = android.text.TextUtils .isEmpty ( p0 );
if ( v1 != null) { // if-eqz v1, :cond_0
/* .line 391 */
final String v1 = ""; // const-string v1, ""
/* .line 398 */
} // :goto_0
/* .line 394 */
} // :cond_0
/* new-instance v0, Landroid/text/TextPaint; */
/* invoke-direct {v0}, Landroid/text/TextPaint;-><init>()V */
/* .line 395 */
/* .local v0, "paint":Landroid/text/TextPaint; */
v1 = android.graphics.Typeface.DEFAULT;
(( android.text.TextPaint ) v0 ).setTypeface ( v1 ); // invoke-virtual {v0, v1}, Landroid/text/TextPaint;->setTypeface(Landroid/graphics/Typeface;)Landroid/graphics/Typeface;
/* .line 396 */
(( android.text.TextPaint ) v0 ).setTextSize ( p2 ); // invoke-virtual {v0, p2}, Landroid/text/TextPaint;->setTextSize(F)V
/* .line 398 */
v1 = android.text.TextUtils$TruncateAt.END;
android.text.TextUtils .ellipsize ( p0,v0,p1,v1 );
} // .end method
private static void initNativeObject ( android.graphics.Bitmap p0 ) {
/* .locals 3 */
/* .param p0, "pBitmap" # Landroid/graphics/Bitmap; */
/* .prologue */
/* .line 345 */
org.cocos2dx.lib.Cocos2dxBitmap .getPixels ( p0 );
/* .line 346 */
/* .local v0, "pixels":[B */
/* if-nez v0, :cond_0 */
/* .line 351 */
} // :goto_0
return;
/* .line 350 */
} // :cond_0
v1 = (( android.graphics.Bitmap ) p0 ).getWidth ( ); // invoke-virtual {p0}, Landroid/graphics/Bitmap;->getWidth()I
v2 = (( android.graphics.Bitmap ) p0 ).getHeight ( ); // invoke-virtual {p0}, Landroid/graphics/Bitmap;->getHeight()I
org.cocos2dx.lib.Cocos2dxBitmap .nativeInitBitmapDC ( v1,v2,v0 );
} // .end method
private static native void nativeInitBitmapDC ( Integer p0, Integer p1, Object[] p2 ) {
} // .end method
private static android.graphics.Paint newPaint ( java.lang.String p0, Integer p1, Integer p2 ) {
/* .locals 7 */
/* .param p0, "pFontName" # Ljava/lang/String; */
/* .param p1, "pFontSize" # I */
/* .param p2, "pHorizontalAlignment" # I */
/* .prologue */
int v6 = 0; // const/4 v6, 0x0
/* .line 120 */
/* new-instance v1, Landroid/graphics/Paint; */
/* invoke-direct {v1}, Landroid/graphics/Paint;-><init>()V */
/* .line 121 */
/* .local v1, "paint":Landroid/graphics/Paint; */
int v3 = -1; // const/4 v3, -0x1
(( android.graphics.Paint ) v1 ).setColor ( v3 ); // invoke-virtual {v1, v3}, Landroid/graphics/Paint;->setColor(I)V
/* .line 122 */
/* int-to-float v3, p1 */
(( android.graphics.Paint ) v1 ).setTextSize ( v3 ); // invoke-virtual {v1, v3}, Landroid/graphics/Paint;->setTextSize(F)V
/* .line 123 */
int v3 = 1; // const/4 v3, 0x1
(( android.graphics.Paint ) v1 ).setAntiAlias ( v3 ); // invoke-virtual {v1, v3}, Landroid/graphics/Paint;->setAntiAlias(Z)V
/* .line 126 */
final String v3 = ".ttf"; // const-string v3, ".ttf"
v3 = (( java.lang.String ) p0 ).endsWith ( v3 ); // invoke-virtual {p0, v3}, Ljava/lang/String;->endsWith(Ljava/lang/String;)Z
if ( v3 != null) { // if-eqz v3, :cond_0
/* .line 128 */
try { // :try_start_0
v3 = org.cocos2dx.lib.Cocos2dxBitmap.sContext;
org.cocos2dx.lib.Cocos2dxTypefaces .get ( v3,p0 );
/* .line 129 */
/* .local v2, "typeFace":Landroid/graphics/Typeface; */
(( android.graphics.Paint ) v1 ).setTypeface ( v2 ); // invoke-virtual {v1, v2}, Landroid/graphics/Paint;->setTypeface(Landroid/graphics/Typeface;)Landroid/graphics/Typeface;
/* :try_end_0 */
/* .catch Ljava/lang/Exception; {:try_start_0 ..:try_end_0} :catch_0 */
/* .line 140 */
} // .end local v2 # "typeFace":Landroid/graphics/Typeface;
} // :goto_0
/* packed-switch p2, :pswitch_data_0 */
/* .line 149 */
v3 = android.graphics.Paint$Align.LEFT;
(( android.graphics.Paint ) v1 ).setTextAlign ( v3 ); // invoke-virtual {v1, v3}, Landroid/graphics/Paint;->setTextAlign(Landroid/graphics/Paint$Align;)V
/* .line 153 */
} // :goto_1
/* .line 130 */
/* :catch_0 */
/* move-exception v0 */
/* .line 131 */
/* .local v0, "e":Ljava/lang/Exception; */
final String v3 = "Cocos2dxBitmap"; // const-string v3, "Cocos2dxBitmap"
/* new-instance v4, Ljava/lang/StringBuilder; */
final String v5 = "error to create ttf type face: "; // const-string v5, "error to create ttf type face: "
/* invoke-direct {v4, v5}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V */
(( java.lang.StringBuilder ) v4 ).append ( p0 ); // invoke-virtual {v4, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v4 ).toString ( ); // invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
android.util.Log .e ( v3,v4 );
/* .line 134 */
android.graphics.Typeface .create ( p0,v6 );
(( android.graphics.Paint ) v1 ).setTypeface ( v3 ); // invoke-virtual {v1, v3}, Landroid/graphics/Paint;->setTypeface(Landroid/graphics/Typeface;)Landroid/graphics/Typeface;
/* .line 137 */
} // .end local v0 # "e":Ljava/lang/Exception;
} // :cond_0
android.graphics.Typeface .create ( p0,v6 );
(( android.graphics.Paint ) v1 ).setTypeface ( v3 ); // invoke-virtual {v1, v3}, Landroid/graphics/Paint;->setTypeface(Landroid/graphics/Typeface;)Landroid/graphics/Typeface;
/* .line 142 */
/* :pswitch_0 */
v3 = android.graphics.Paint$Align.CENTER;
(( android.graphics.Paint ) v1 ).setTextAlign ( v3 ); // invoke-virtual {v1, v3}, Landroid/graphics/Paint;->setTextAlign(Landroid/graphics/Paint$Align;)V
/* .line 145 */
/* :pswitch_1 */
v3 = android.graphics.Paint$Align.RIGHT;
(( android.graphics.Paint ) v1 ).setTextAlign ( v3 ); // invoke-virtual {v1, v3}, Landroid/graphics/Paint;->setTextAlign(Landroid/graphics/Paint$Align;)V
/* .line 140 */
/* nop */
/* :pswitch_data_0 */
/* .packed-switch 0x2 */
/* :pswitch_1 */
/* :pswitch_0 */
} // .end packed-switch
} // .end method
private static java.lang.String refactorString ( java.lang.String p0 ) {
/* .locals 5 */
/* .param p0, "pString" # Ljava/lang/String; */
/* .prologue */
/* .line 316 */
final String v3 = ""; // const-string v3, ""
v3 = (( java.lang.String ) p0 ).compareTo ( v3 ); // invoke-virtual {p0, v3}, Ljava/lang/String;->compareTo(Ljava/lang/String;)I
/* if-nez v3, :cond_0 */
/* .line 317 */
final String v3 = " "; // const-string v3, " "
/* .line 341 */
} // :goto_0
/* .line 323 */
} // :cond_0
/* new-instance v2, Ljava/lang/StringBuilder; */
/* invoke-direct {v2, p0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V */
/* .line 324 */
/* .local v2, "strBuilder":Ljava/lang/StringBuilder; */
int v1 = 0; // const/4 v1, 0x0
/* .line 325 */
/* .local v1, "start":I */
final String v3 = "\n"; // const-string v3, "\n"
v0 = (( java.lang.StringBuilder ) v2 ).indexOf ( v3 ); // invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->indexOf(Ljava/lang/String;)I
/* .line 326 */
/* .local v0, "index":I */
} // :goto_1
int v3 = -1; // const/4 v3, -0x1
/* if-ne v0, v3, :cond_2 */
/* .line 341 */
} // :cond_1
(( java.lang.StringBuilder ) v2 ).toString ( ); // invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
/* .line 327 */
} // :cond_2
if ( v0 != null) { // if-eqz v0, :cond_3
/* add-int/lit8 v3, v0, -0x1 */
v3 = (( java.lang.StringBuilder ) v2 ).charAt ( v3 ); // invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->charAt(I)C
/* const/16 v4, 0xa */
/* if-ne v3, v4, :cond_4 */
/* .line 328 */
} // :cond_3
final String v3 = " "; // const-string v3, " "
(( java.lang.StringBuilder ) v2 ).insert ( v1, v3 ); // invoke-virtual {v2, v1, v3}, Ljava/lang/StringBuilder;->insert(ILjava/lang/String;)Ljava/lang/StringBuilder;
/* .line 329 */
/* add-int/lit8 v1, v0, 0x2 */
/* .line 334 */
} // :goto_2
v3 = (( java.lang.StringBuilder ) v2 ).length ( ); // invoke-virtual {v2}, Ljava/lang/StringBuilder;->length()I
/* if-gt v1, v3, :cond_1 */
v3 = (( java.lang.StringBuilder ) v2 ).length ( ); // invoke-virtual {v2}, Ljava/lang/StringBuilder;->length()I
/* if-eq v0, v3, :cond_1 */
/* .line 338 */
final String v3 = "\n"; // const-string v3, "\n"
v0 = (( java.lang.StringBuilder ) v2 ).indexOf ( v3, v1 ); // invoke-virtual {v2, v3, v1}, Ljava/lang/StringBuilder;->indexOf(Ljava/lang/String;I)I
/* .line 331 */
} // :cond_4
/* add-int/lit8 v1, v0, 0x1 */
} // .end method
public static void setContext ( android.content.Context p0 ) {
/* .locals 0 */
/* .param p0, "pContext" # Landroid/content/Context; */
/* .prologue */
/* .line 72 */
/* .line 73 */
return;
} // .end method
private static java.lang.String splitString ( java.lang.String p0, Integer p1, Integer p2, android.graphics.Paint p3 ) {
/* .locals 12 */
/* .param p0, "pString" # Ljava/lang/String; */
/* .param p1, "pMaxWidth" # I */
/* .param p2, "pMaxHeight" # I */
/* .param p3, "pPaint" # Landroid/graphics/Paint; */
/* .prologue */
/* .line 223 */
final String v9 = "\\n"; // const-string v9, "\\n"
(( java.lang.String ) p0 ).split ( v9 ); // invoke-virtual {p0, v9}, Ljava/lang/String;->split(Ljava/lang/String;)[Ljava/lang/String;
/* .line 224 */
/* .local v5, "lines":[Ljava/lang/String; */
int v7 = 0; // const/4 v7, 0x0
/* .line 225 */
/* .local v7, "ret":[Ljava/lang/String; */
(( android.graphics.Paint ) p3 ).getFontMetricsInt ( ); // invoke-virtual {p3}, Landroid/graphics/Paint;->getFontMetricsInt()Landroid/graphics/Paint$FontMetricsInt;
/* .line 226 */
/* .local v0, "fm":Landroid/graphics/Paint$FontMetricsInt; */
/* iget v9, v0, Landroid/graphics/Paint$FontMetricsInt;->bottom:I */
/* iget v10, v0, Landroid/graphics/Paint$FontMetricsInt;->top:I */
/* sub-int/2addr v9, v10 */
/* int-to-double v9, v9 */
java.lang.Math .ceil ( v9,v10 );
/* move-result-wide v9 */
/* double-to-int v1, v9 */
/* .line 227 */
/* .local v1, "heightPerLine":I */
/* div-int v6, p2, v1 */
/* .line 229 */
/* .local v6, "maxLines":I */
if ( p1 != null) { // if-eqz p1, :cond_6
/* .line 230 */
/* new-instance v8, Ljava/util/LinkedList; */
/* invoke-direct {v8}, Ljava/util/LinkedList;-><init>()V */
/* .line 231 */
/* .local v8, "strList":Ljava/util/LinkedList;, "Ljava/util/LinkedList<Ljava/lang/String;>;" */
/* array-length v10, v5 */
int v9 = 0; // const/4 v9, 0x0
} // :goto_0
/* if-lt v9, v10, :cond_2 */
/* .line 247 */
} // :cond_0
/* if-lez v6, :cond_1 */
v9 = (( java.util.LinkedList ) v8 ).size ( ); // invoke-virtual {v8}, Ljava/util/LinkedList;->size()I
/* if-le v9, v6, :cond_1 */
/* .line 248 */
} // :goto_1
v9 = (( java.util.LinkedList ) v8 ).size ( ); // invoke-virtual {v8}, Ljava/util/LinkedList;->size()I
/* if-gt v9, v6, :cond_5 */
/* .line 253 */
} // :cond_1
v9 = (( java.util.LinkedList ) v8 ).size ( ); // invoke-virtual {v8}, Ljava/util/LinkedList;->size()I
/* new-array v7, v9, [Ljava/lang/String; */
/* .line 254 */
(( java.util.LinkedList ) v8 ).toArray ( v7 ); // invoke-virtual {v8, v7}, Ljava/util/LinkedList;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;
/* .line 267 */
} // .end local v8 # "strList":Ljava/util/LinkedList;, "Ljava/util/LinkedList<Ljava/lang/String;>;"
} // :goto_2
/* .line 231 */
/* .restart local v8 # "strList":Ljava/util/LinkedList;, "Ljava/util/LinkedList<Ljava/lang/String;>;" */
} // :cond_2
/* aget-object v3, v5, v9 */
/* .line 233 */
/* .local v3, "line":Ljava/lang/String; */
v11 = (( android.graphics.Paint ) p3 ).measureText ( v3 ); // invoke-virtual {p3, v3}, Landroid/graphics/Paint;->measureText(Ljava/lang/String;)F
v11 = android.util.FloatMath .ceil ( v11 );
/* float-to-int v4, v11 */
/* .line 234 */
/* .local v4, "lineWidth":I */
/* if-le v4, p1, :cond_4 */
/* .line 235 */
org.cocos2dx.lib.Cocos2dxBitmap .divideStringWithMaxWidth ( v3,p1,p3 );
(( java.util.LinkedList ) v8 ).addAll ( v11 ); // invoke-virtual {v8, v11}, Ljava/util/LinkedList;->addAll(Ljava/util/Collection;)Z
/* .line 241 */
} // :goto_3
/* if-lez v6, :cond_3 */
v11 = (( java.util.LinkedList ) v8 ).size ( ); // invoke-virtual {v8}, Ljava/util/LinkedList;->size()I
/* if-ge v11, v6, :cond_0 */
/* .line 231 */
} // :cond_3
/* add-int/lit8 v9, v9, 0x1 */
/* .line 237 */
} // :cond_4
(( java.util.LinkedList ) v8 ).add ( v3 ); // invoke-virtual {v8, v3}, Ljava/util/LinkedList;->add(Ljava/lang/Object;)Z
/* .line 249 */
} // .end local v3 # "line":Ljava/lang/String;
} // .end local v4 # "lineWidth":I
} // :cond_5
(( java.util.LinkedList ) v8 ).removeLast ( ); // invoke-virtual {v8}, Ljava/util/LinkedList;->removeLast()Ljava/lang/Object;
/* .line 255 */
} // .end local v8 # "strList":Ljava/util/LinkedList;, "Ljava/util/LinkedList<Ljava/lang/String;>;"
} // :cond_6
if ( p2 != null) { // if-eqz p2, :cond_8
/* array-length v9, v5 */
/* if-le v9, v6, :cond_8 */
/* .line 257 */
/* new-instance v8, Ljava/util/LinkedList; */
/* invoke-direct {v8}, Ljava/util/LinkedList;-><init>()V */
/* .line 258 */
/* .restart local v8 # "strList":Ljava/util/LinkedList;, "Ljava/util/LinkedList<Ljava/lang/String;>;" */
int v2 = 0; // const/4 v2, 0x0
/* .local v2, "i":I */
} // :goto_4
/* if-lt v2, v6, :cond_7 */
/* .line 261 */
v9 = (( java.util.LinkedList ) v8 ).size ( ); // invoke-virtual {v8}, Ljava/util/LinkedList;->size()I
/* new-array v7, v9, [Ljava/lang/String; */
/* .line 262 */
(( java.util.LinkedList ) v8 ).toArray ( v7 ); // invoke-virtual {v8, v7}, Ljava/util/LinkedList;->toArray([Ljava/lang/Object;)[Ljava/lang/Object;
/* .line 259 */
} // :cond_7
/* aget-object v9, v5, v2 */
(( java.util.LinkedList ) v8 ).add ( v9 ); // invoke-virtual {v8, v9}, Ljava/util/LinkedList;->add(Ljava/lang/Object;)Z
/* .line 258 */
/* add-int/lit8 v2, v2, 0x1 */
/* .line 264 */
} // .end local v2 # "i":I
} // .end local v8 # "strList":Ljava/util/LinkedList;, "Ljava/util/LinkedList<Ljava/lang/String;>;"
} // :cond_8
/* move-object v7, v5 */
} // .end method
