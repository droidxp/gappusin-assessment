public class com.ansca.corona.CoronaText {
	 /* .source "CoronaText.java" */
	 /* # annotations */
	 /* .annotation system Ldalvik/annotation/MemberClasses; */
	 /* value = { */
	 /* Lcom/ansca/corona/CoronaText$TextInfo; */
	 /* } */
} // .end annotation
/* # static fields */
private static ourBits;
private static ourCachedInt;
private static Integer ourCachedSize;
private static java.util.HashMap ourTypefaces;
/* .annotation system Ldalvik/annotation/Signature; */
/* value = { */
/* "Ljava/util/HashMap", */
/* "<", */
/* "Ljava/lang/String;", */
/* "Lcom/ansca/corona/CoronaText$TextInfo;", */
/* ">;" */
/* } */
} // .end annotation
} // .end field
/* # instance fields */
protected Integer myHeight;
private com.ansca.corona.CoronaText$TextInfo myTextInfo;
protected Integer myWidth;
/* # direct methods */
static com.ansca.corona.CoronaText ( ) {
/* .locals 2 */
/* .prologue */
int v1 = 1; // const/4 v1, 0x1
/* .line 35 */
/* .line 36 */
/* new-array v0, v0, [I */
/* .line 37 */
/* new-array v0, v1, [B */
/* .line 54 */
/* new-instance v0, Ljava/util/HashMap; */
/* invoke-direct {v0}, Ljava/util/HashMap;-><init>()V */
return;
} // .end method
 com.ansca.corona.CoronaText ( ) {
/* .locals 2 */
/* .param p1, "fontName" # Ljava/lang/String; */
/* .param p2, "fontSize" # F */
/* .param p3, "activity" # Lcom/ansca/corona/CoronaActivity; */
/* .prologue */
int v1 = 0; // const/4 v1, 0x0
/* .line 106 */
/* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
/* .line 32 */
/* iput v1, p0, Lcom/ansca/corona/CoronaText;->myWidth:I */
/* .line 33 */
/* iput v1, p0, Lcom/ansca/corona/CoronaText;->myHeight:I */
/* .line 107 */
com.ansca.corona.CoronaText .getTypeface ( p1,p3 );
/* .line 108 */
/* .local v0, "typeface":Landroid/graphics/Typeface; */
v1 = com.ansca.corona.CoronaText.ourTypefaces;
(( java.util.HashMap ) v1 ).get ( p1 ); // invoke-virtual {v1, p1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;
/* check-cast v1, Lcom/ansca/corona/CoronaText$TextInfo; */
this.myTextInfo = v1;
/* .line 109 */
return;
} // .end method
public static com.ansca.corona.CoronaText getCoronaText ( java.lang.String p0, Float p1, com.ansca.corona.CoronaActivity p2 ) {
/* .locals 1 */
/* .param p0, "fontName" # Ljava/lang/String; */
/* .param p1, "fontSize" # F */
/* .param p2, "activity" # Lcom/ansca/corona/CoronaActivity; */
/* .prologue */
/* .line 28 */
/* new-instance v0, Lcom/ansca/corona/CoronaText; */
/* invoke-direct {v0, p0, p1, p2}, Lcom/ansca/corona/CoronaText;-><init>(Ljava/lang/String;FLcom/ansca/corona/CoronaActivity;)V */
/* .line 29 */
/* .local v0, "coronaText":Lcom/ansca/corona/CoronaText; */
} // .end method
public static java.lang.String getFonts ( ) {
/* .locals 12 */
/* .prologue */
/* .line 221 */
/* new-instance v3, Ljava/util/ArrayList; */
/* invoke-direct {v3}, Ljava/util/ArrayList;-><init>()V */
/* .line 222 */
/* .local v3, "fontNames":Ljava/util/List;, "Ljava/util/List<Ljava/lang/String;>;" */
/* new-instance v8, Ljava/io/File; */
final String v10 = "/system/fonts/"; // const-string v10, "/system/fonts/"
/* invoke-direct {v8, v10}, Ljava/io/File;-><init>(Ljava/lang/String;)V */
/* .line 223 */
/* .local v8, "temp":Ljava/io/File; */
final String v4 = ".ttf"; // const-string v4, ".ttf"
/* .line 224 */
/* .local v4, "fontSuffix":Ljava/lang/String; */
/* new-instance v7, Lcom/ansca/corona/CoronaText$1; */
/* invoke-direct {v7}, Lcom/ansca/corona/CoronaText$1;-><init>()V */
/* .line 229 */
/* .local v7, "myFileNameFilter":Ljava/io/FilenameFilter; */
(( java.io.File ) v8 ).listFiles ( v7 ); // invoke-virtual {v8, v7}, Ljava/io/File;->listFiles(Ljava/io/FilenameFilter;)[Ljava/io/File;
/* .local v0, "arr$":[Ljava/io/File; */
/* array-length v6, v0 */
/* .local v6, "len$":I */
int v5 = 0; // const/4 v5, 0x0
/* .local v5, "i$":I */
} // :goto_0
/* if-ge v5, v6, :cond_0 */
/* aget-object v1, v0, v5 */
/* .line 230 */
/* .local v1, "font":Ljava/io/File; */
(( java.io.File ) v1 ).getName ( ); // invoke-virtual {v1}, Ljava/io/File;->getName()Ljava/lang/String;
/* .line 231 */
/* .local v2, "fontName":Ljava/lang/String; */
int v10 = 0; // const/4 v10, 0x0
final String v11 = ".ttf"; // const-string v11, ".ttf"
v11 = (( java.lang.String ) v2 ).lastIndexOf ( v11 ); // invoke-virtual {v2, v11}, Ljava/lang/String;->lastIndexOf(Ljava/lang/String;)I
(( java.lang.String ) v2 ).subSequence ( v10, v11 ); // invoke-virtual {v2, v10, v11}, Ljava/lang/String;->subSequence(II)Ljava/lang/CharSequence;
(( java.lang.Object ) v10 ).toString ( ); // invoke-virtual {v10}, Ljava/lang/Object;->toString()Ljava/lang/String;
/* .line 229 */
/* add-int/lit8 v5, v5, 0x1 */
/* .line 235 */
} // .end local v1 # "font":Ljava/io/File;
} // .end local v2 # "fontName":Ljava/lang/String;
v10 = } // :cond_0
/* new-array v9, v10, [Ljava/lang/String; */
/* .line 236 */
/* .local v9, "typedArray":[Ljava/lang/String; */
/* check-cast v10, [Ljava/lang/String; */
} // .end method
public static android.graphics.Typeface getTypeface ( java.lang.String p0, com.ansca.corona.CoronaActivity p1 ) {
/* .locals 11 */
/* .param p0, "fontName" # Ljava/lang/String; */
/* .param p1, "activity" # Lcom/ansca/corona/CoronaActivity; */
/* .prologue */
/* .line 58 */
v8 = com.ansca.corona.CoronaText.ourTypefaces;
(( java.util.HashMap ) v8 ).get ( p0 ); // invoke-virtual {v8, p0}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;
/* check-cast v2, Lcom/ansca/corona/CoronaText$TextInfo; */
/* .line 60 */
/* .local v2, "fontInfo":Lcom/ansca/corona/CoronaText$TextInfo; */
if ( v2 != null) { // if-eqz v2, :cond_1
/* .line 61 */
v7 = this.myTypeface;
/* .line 101 */
} // :cond_0
} // :goto_0
/* .line 63 */
} // :cond_1
int v6 = 0; // const/4 v6, 0x0
/* .line 64 */
/* .local v6, "style":I */
int v7 = 0; // const/4 v7, 0x0
/* .line 66 */
/* .local v7, "typeface":Landroid/graphics/Typeface; */
final String v8 = ""; // const-string v8, ""
v8 = (( java.lang.String ) v8 ).equals ( p0 ); // invoke-virtual {v8, p0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
/* if-nez v8, :cond_2 */
/* if-nez p0, :cond_4 */
/* .line 67 */
} // :cond_2
int v1 = 0; // const/4 v1, 0x0
/* .line 68 */
/* .local v1, "createName":Ljava/lang/String; */
android.graphics.Typeface .create ( v1,v6 );
/* .line 69 */
final String p0 = ""; // const-string p0, ""
/* .line 97 */
} // .end local v1 # "createName":Ljava/lang/String;
} // :cond_3
} // :goto_1
if ( v7 != null) { // if-eqz v7, :cond_0
/* .line 98 */
/* new-instance v4, Lcom/ansca/corona/CoronaText$TextInfo; */
/* invoke-direct {v4, v7}, Lcom/ansca/corona/CoronaText$TextInfo;-><init>(Landroid/graphics/Typeface;)V */
/* .line 99 */
/* .local v4, "info":Lcom/ansca/corona/CoronaText$TextInfo; */
v8 = com.ansca.corona.CoronaText.ourTypefaces;
(( java.util.HashMap ) v8 ).put ( p0, v4 ); // invoke-virtual {v8, p0, v4}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
/* .line 72 */
} // .end local v4 # "info":Lcom/ansca/corona/CoronaText$TextInfo;
} // :cond_4
(( com.ansca.corona.CoronaActivity ) p1 ).getAssets ( ); // invoke-virtual {p1}, Lcom/ansca/corona/CoronaActivity;->getAssets()Landroid/content/res/AssetManager;
/* .line 75 */
/* .local v0, "assetManager":Landroid/content/res/AssetManager; */
try { // :try_start_0
/* new-instance v8, Ljava/lang/StringBuilder; */
/* invoke-direct {v8}, Ljava/lang/StringBuilder;-><init>()V */
(( java.lang.StringBuilder ) v8 ).append ( p0 ); // invoke-virtual {v8, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
final String v9 = ".ttf"; // const-string v9, ".ttf"
(( java.lang.StringBuilder ) v8 ).append ( v9 ); // invoke-virtual {v8, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v8 ).toString ( ); // invoke-virtual {v8}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
/* .line 76 */
/* .local v3, "fontPath":Ljava/lang/String; */
(( android.content.res.AssetManager ) v0 ).open ( v3 ); // invoke-virtual {v0, v3}, Landroid/content/res/AssetManager;->open(Ljava/lang/String;)Ljava/io/InputStream;
/* .line 77 */
/* .local v5, "is":Ljava/io/InputStream; */
v8 = (( java.io.InputStream ) v5 ).available ( ); // invoke-virtual {v5}, Ljava/io/InputStream;->available()I
/* if-lez v8, :cond_5 */
/* .line 78 */
(( java.io.InputStream ) v5 ).close ( ); // invoke-virtual {v5}, Ljava/io/InputStream;->close()V
/* .line 81 */
android.graphics.Typeface .createFromAsset ( v0,v3 );
/* :try_end_0 */
/* .catch Ljava/io/IOException; {:try_start_0 ..:try_end_0} :catch_0 */
/* .line 86 */
} // .end local v3 # "fontPath":Ljava/lang/String;
} // .end local v5 # "is":Ljava/io/InputStream;
} // :cond_5
} // :goto_2
/* if-nez v7, :cond_6 */
/* .line 87 */
com.ansca.corona.Controller .getAndroidVersionSpecific ( );
/* new-instance v9, Ljava/lang/StringBuilder; */
/* invoke-direct {v9}, Ljava/lang/StringBuilder;-><init>()V */
final String v10 = "/system/fonts/"; // const-string v10, "/system/fonts/"
(( java.lang.StringBuilder ) v9 ).append ( v10 ); // invoke-virtual {v9, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v9 ).append ( p0 ); // invoke-virtual {v9, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
final String v10 = ".ttf"; // const-string v10, ".ttf"
(( java.lang.StringBuilder ) v9 ).append ( v10 ); // invoke-virtual {v9, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v9 ).toString ( ); // invoke-virtual {v9}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
/* .line 89 */
} // :cond_6
/* if-nez v7, :cond_3 */
/* .line 91 */
v8 = java.lang.System.out;
/* new-instance v9, Ljava/lang/StringBuilder; */
/* invoke-direct {v9}, Ljava/lang/StringBuilder;-><init>()V */
final String v10 = "WARNING: Could not load font "; // const-string v10, "WARNING: Could not load font "
(( java.lang.StringBuilder ) v9 ).append ( v10 ); // invoke-virtual {v9, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v9 ).append ( p0 ); // invoke-virtual {v9, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
final String v10 = ".Using default."; // const-string v10, ".Using default."
(( java.lang.StringBuilder ) v9 ).append ( v10 ); // invoke-virtual {v9, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v9 ).toString ( ); // invoke-virtual {v9}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
(( java.io.PrintStream ) v8 ).println ( v9 ); // invoke-virtual {v8, v9}, Ljava/io/PrintStream;->println(Ljava/lang/String;)V
/* .line 92 */
int v1 = 0; // const/4 v1, 0x0
/* .line 93 */
/* .restart local v1 # "createName":Ljava/lang/String; */
android.graphics.Typeface .create ( v1,v6 );
/* .line 83 */
} // .end local v1 # "createName":Ljava/lang/String;
/* :catch_0 */
/* move-exception v8 */
} // .end method
/* # virtual methods */
public getBits ( ) {
/* .locals 1 */
/* .prologue */
/* .line 214 */
v0 = com.ansca.corona.CoronaText.ourBits;
} // .end method
public Integer getHeight ( ) {
/* .locals 1 */
/* .prologue */
/* .line 211 */
/* iget v0, p0, Lcom/ansca/corona/CoronaText;->myHeight:I */
} // .end method
public Integer getWidth ( ) {
/* .locals 1 */
/* .prologue */
/* .line 208 */
/* iget v0, p0, Lcom/ansca/corona/CoronaText;->myWidth:I */
} // .end method
public void release ( ) {
/* .locals 0 */
/* .prologue */
/* .line 217 */
return;
} // .end method
public void render ( java.lang.String p0, Float p1, Integer p2, Integer p3, com.ansca.corona.CoronaActivity p4 ) {
/* .locals 24 */
/* .param p1, "text" # Ljava/lang/String; */
/* .param p2, "fontSize" # F */
/* .param p3, "width" # I */
/* .param p4, "height" # I */
/* .param p5, "activity" # Lcom/ansca/corona/CoronaActivity; */
/* .prologue */
/* .line 114 */
if ( p1 != null) { // if-eqz p1, :cond_0
v3 = /* invoke-virtual/range {p1 ..p1}, Ljava/lang/String;->length()I */
/* if-lez v3, :cond_0 */
int v3 = 0; // const/4 v3, 0x0
/* cmpg-float v3, p2, v3 */
/* if-gtz v3, :cond_1 */
/* .line 205 */
} // :cond_0
} // :goto_0
return;
/* .line 119 */
} // :cond_1
/* move-object/from16 v0, p0 */
v3 = this.myTextInfo;
v4 = this.myTextPaint;
/* .line 120 */
/* .local v4, "textPaint":Landroid/text/TextPaint; */
/* move/from16 v0, p2 */
(( android.text.TextPaint ) v4 ).setTextSize ( v0 ); // invoke-virtual {v4, v0}, Landroid/text/TextPaint;->setTextSize(F)V
/* .line 121 */
(( android.text.TextPaint ) v4 ).getFontMetricsInt ( ); // invoke-virtual {v4}, Landroid/text/TextPaint;->getFontMetricsInt()Landroid/graphics/Paint$FontMetricsInt;
/* .line 122 */
/* .local v19, "metrics":Landroid/graphics/Paint$FontMetricsInt; */
v18 = com.ansca.corona.JavaToNativeShim .getMaxTextureSize ( );
/* .line 125 */
/* .local v18, "maxTextureSize":I */
/* if-gtz p3, :cond_2 */
/* .line 126 */
/* move-object/from16 v0, p1 */
v3 = android.text.StaticLayout .getDesiredWidth ( v0,v4 );
/* const/high16 v5, 0x3f000000 # 0.5f */
/* add-float/2addr v3, v5 */
/* float-to-int v0, v3 */
/* move/from16 p3, v0 */
/* .line 127 */
int v3 = 1; // const/4 v3, 0x1
/* move/from16 v0, p3 */
/* if-ge v0, v3, :cond_2 */
/* .line 128 */
/* const/16 p3, 0x1 */
/* .line 131 */
} // :cond_2
/* and-int/lit8 v3, p3, 0x3 */
if ( v3 != null) { // if-eqz v3, :cond_3
/* .line 133 */
/* add-int/lit8 v3, p3, 0x3 */
/* and-int/lit8 p3, v3, -0x4 */
/* .line 135 */
} // :cond_3
/* move/from16 v0, p3 */
/* move/from16 v1, v18 */
/* if-le v0, v1, :cond_4 */
/* .line 136 */
/* move/from16 p3, v18 */
/* .line 140 */
} // :cond_4
v6 = android.text.Layout$Alignment.ALIGN_NORMAL;
/* .line 141 */
/* .local v6, "textAlignment":Landroid/text/Layout$Alignment; */
/* new-instance v2, Landroid/text/StaticLayout; */
/* const/high16 v7, 0x3f800000 # 1.0f */
/* const/high16 v8, 0x3f800000 # 1.0f */
int v9 = 1; // const/4 v9, 0x1
/* move-object/from16 v3, p1 */
/* move/from16 v5, p3 */
/* invoke-direct/range {v2 ..v9}, Landroid/text/StaticLayout;-><init>(Ljava/lang/CharSequence;Landroid/text/TextPaint;ILandroid/text/Layout$Alignment;FFZ)V */
/* .line 144 */
/* .local v2, "layout":Landroid/text/StaticLayout; */
/* if-gtz p4, :cond_5 */
/* .line 145 */
/* move-object/from16 v0, v19 */
/* iget v3, v0, Landroid/graphics/Paint$FontMetricsInt;->top:I */
v3 = java.lang.Math .abs ( v3 );
/* move-object/from16 v0, v19 */
/* iget v5, v0, Landroid/graphics/Paint$FontMetricsInt;->bottom:I */
v5 = java.lang.Math .abs ( v5 );
/* add-int/2addr v3, v5 */
/* add-int/lit8 p4, v3, 0x1 */
/* .line 146 */
v3 = (( android.text.StaticLayout ) v2 ).getLineCount ( ); // invoke-virtual {v2}, Landroid/text/StaticLayout;->getLineCount()I
/* mul-int p4, p4, v3 */
/* .line 147 */
int v3 = 1; // const/4 v3, 0x1
/* move/from16 v0, p4 */
/* if-ge v0, v3, :cond_5 */
/* .line 148 */
/* const/16 p4, 0x1 */
/* .line 151 */
} // :cond_5
/* move/from16 v0, p4 */
/* move/from16 v1, v18 */
/* if-le v0, v1, :cond_6 */
/* .line 152 */
/* move/from16 p4, v18 */
/* .line 156 */
} // :cond_6
int v7 = 0; // const/4 v7, 0x0
/* .line 158 */
/* .local v7, "bitmap":Landroid/graphics/Bitmap; */
try { // :try_start_0
v3 = android.graphics.Bitmap$Config.ARGB_8888;
/* move/from16 v0, p3 */
/* move/from16 v1, p4 */
android.graphics.Bitmap .createBitmap ( v0,v1,v3 );
/* .line 159 */
int v3 = 0; // const/4 v3, 0x0
(( android.graphics.Bitmap ) v7 ).eraseColor ( v3 ); // invoke-virtual {v7, v3}, Landroid/graphics/Bitmap;->eraseColor(I)V
/* .line 160 */
/* new-instance v16, Landroid/graphics/Canvas; */
/* move-object/from16 v0, v16 */
/* invoke-direct {v0, v7}, Landroid/graphics/Canvas;-><init>(Landroid/graphics/Bitmap;)V */
/* .line 161 */
/* .local v16, "canvas":Landroid/graphics/Canvas; */
/* move-object/from16 v0, v16 */
(( android.text.StaticLayout ) v2 ).draw ( v0 ); // invoke-virtual {v2, v0}, Landroid/text/StaticLayout;->draw(Landroid/graphics/Canvas;)V
/* :try_end_0 */
/* .catch Ljava/lang/Exception; {:try_start_0 ..:try_end_0} :catch_0 */
/* .line 166 */
} // .end local v16 # "canvas":Landroid/graphics/Canvas;
} // :goto_1
if ( v7 != null) { // if-eqz v7, :cond_0
/* .line 171 */
int v8 = 0; // const/4 v8, 0x0
/* .line 172 */
/* .local v8, "intBits":[I */
int v15 = 0; // const/4 v15, 0x0
/* .line 174 */
/* .local v15, "bytes":[B */
/* mul-int v20, p3, p4 */
/* .line 175 */
/* .local v20, "newSize":I */
try { // :try_start_1
/* move/from16 v0, v20 */
/* if-le v0, v3, :cond_7 */
/* .line 176 */
/* move/from16 v0, v20 */
/* new-array v3, v0, [I */
/* .line 177 */
/* .line 179 */
} // :cond_7
v8 = com.ansca.corona.CoronaText.ourCachedInt;
/* .line 180 */
v3 = com.ansca.corona.CoronaText.ourBits;
/* array-length v3, v3 */
/* move/from16 v0, v20 */
/* if-eq v0, v3, :cond_8 */
/* .line 181 */
/* move/from16 v0, v20 */
/* new-array v3, v0, [B */
/* .line 183 */
} // :cond_8
v15 = com.ansca.corona.CoronaText.ourBits;
/* .line 184 */
int v9 = 0; // const/4 v9, 0x0
int v11 = 0; // const/4 v11, 0x0
int v12 = 0; // const/4 v12, 0x0
/* move/from16 v10, p3 */
/* move/from16 v13, p3 */
/* move/from16 v14, p4 */
/* invoke-virtual/range {v7 ..v14}, Landroid/graphics/Bitmap;->getPixels([IIIIIII)V */
/* :try_end_1 */
/* .catch Ljava/lang/Exception; {:try_start_1 ..:try_end_1} :catch_1 */
/* .line 189 */
} // :goto_2
(( android.graphics.Bitmap ) v7 ).recycle ( ); // invoke-virtual {v7}, Landroid/graphics/Bitmap;->recycle()V
/* .line 190 */
if ( v8 != null) { // if-eqz v8, :cond_0
if ( v15 != null) { // if-eqz v15, :cond_0
/* .line 195 */
/* const/16 v23, 0x0 */
/* .local v23, "y":I */
} // :goto_3
/* move/from16 v0, v23 */
/* move/from16 v1, p4 */
/* if-ge v0, v1, :cond_a */
/* .line 196 */
/* mul-int v21, v23, p3 */
/* .line 197 */
/* .local v21, "start":I */
/* const/16 v22, 0x0 */
/* .local v22, "x":I */
} // :goto_4
/* move/from16 v0, v22 */
/* move/from16 v1, p3 */
/* if-ge v0, v1, :cond_9 */
/* .line 198 */
/* add-int v3, v21, v22 */
/* add-int v5, v21, v22 */
/* aget v5, v8, v5 */
v5 = android.graphics.Color .alpha ( v5 );
/* and-int/lit16 v5, v5, 0xff */
/* int-to-byte v5, v5 */
/* aput-byte v5, v15, v3 */
/* .line 197 */
/* add-int/lit8 v22, v22, 0x1 */
/* .line 163 */
} // .end local v8 # "intBits":[I
} // .end local v15 # "bytes":[B
} // .end local v20 # "newSize":I
} // .end local v21 # "start":I
} // .end local v22 # "x":I
} // .end local v23 # "y":I
/* :catch_0 */
/* move-exception v17 */
/* .line 164 */
/* .local v17, "ex":Ljava/lang/Exception; */
/* invoke-virtual/range {v17 ..v17}, Ljava/lang/Exception;->printStackTrace()V */
/* .line 186 */
} // .end local v17 # "ex":Ljava/lang/Exception;
/* .restart local v8 # "intBits":[I */
/* .restart local v15 # "bytes":[B */
/* .restart local v20 # "newSize":I */
/* :catch_1 */
/* move-exception v17 */
/* .line 187 */
/* .restart local v17 # "ex":Ljava/lang/Exception; */
/* invoke-virtual/range {v17 ..v17}, Ljava/lang/Exception;->printStackTrace()V */
/* .line 195 */
} // .end local v17 # "ex":Ljava/lang/Exception;
/* .restart local v21 # "start":I */
/* .restart local v22 # "x":I */
/* .restart local v23 # "y":I */
} // :cond_9
/* add-int/lit8 v23, v23, 0x1 */
/* .line 203 */
} // .end local v21 # "start":I
} // .end local v22 # "x":I
} // :cond_a
/* move/from16 v0, p3 */
/* move-object/from16 v1, p0 */
/* iput v0, v1, Lcom/ansca/corona/CoronaText;->myWidth:I */
/* .line 204 */
/* move/from16 v0, p4 */
/* move-object/from16 v1, p0 */
/* iput v0, v1, Lcom/ansca/corona/CoronaText;->myHeight:I */
/* goto/16 :goto_0 */
} // .end method
