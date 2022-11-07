public class com.umeng.common.net.q {
	 /* .source "ResUtil.java" */
	 /* # annotations */
	 /* .annotation system Ldalvik/annotation/MemberClasses; */
	 /* value = { */
	 /* Lcom/umeng/common/net/q$a;, */
	 /* Lcom/umeng/common/net/q$b;, */
	 /* Lcom/umeng/common/net/q$c; */
	 /* } */
} // .end annotation
/* # static fields */
public static Boolean a;
private static final java.lang.String b;
private static final Long c;
private static final Long d;
private static final Long e;
private static final java.util.Map f;
/* .annotation system Ldalvik/annotation/Signature; */
/* value = { */
/* "Ljava/util/Map", */
/* "<", */
/* "Landroid/widget/ImageView;", */
/* "Ljava/lang/String;", */
/* ">;" */
/* } */
} // .end annotation
} // .end field
private static java.lang.Thread g;
/* # direct methods */
static com.umeng.common.net.q ( ) {
/* .locals 1 */
/* .prologue */
/* .line 49 */
/* const-class v0, Lcom/umeng/common/net/q; */
(( java.lang.Class ) v0 ).getName ( ); // invoke-virtual {v0}, Ljava/lang/Class;->getName()Ljava/lang/String;
/* .line 55 */
int v0 = 0; // const/4 v0, 0x0
com.umeng.common.net.q.a = (v0!= 0);
/* .line 73 */
/* new-instance v0, Ljava/util/WeakHashMap; */
/* invoke-direct {v0}, Ljava/util/WeakHashMap;-><init>()V */
java.util.Collections .synchronizedMap ( v0 );
/* .line 78 */
return;
} // .end method
public com.umeng.common.net.q ( ) {
/* .locals 0 */
/* .prologue */
/* .line 44 */
/* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
return;
} // .end method
private static Long a ( java.io.File p0 ) {
/* .locals 11 */
/* .prologue */
/* const-wide/16 v0, 0x0 */
/* .line 279 */
if ( p0 != null) { // if-eqz p0, :cond_0
v2 = (( java.io.File ) p0 ).exists ( ); // invoke-virtual {p0}, Ljava/io/File;->exists()Z
if ( v2 != null) { // if-eqz v2, :cond_0
	 v2 = 	 (( java.io.File ) p0 ).isDirectory ( ); // invoke-virtual {p0}, Ljava/io/File;->isDirectory()Z
	 /* if-nez v2, :cond_2 */
} // :cond_0
/* move-wide v1, v0 */
/* .line 298 */
} // :cond_1
/* return-wide v1 */
/* .line 282 */
} // :cond_2
/* new-instance v3, Ljava/util/Stack; */
/* invoke-direct {v3}, Ljava/util/Stack;-><init>()V */
/* .line 283 */
(( java.util.Stack ) v3 ).clear ( ); // invoke-virtual {v3}, Ljava/util/Stack;->clear()V
/* .line 285 */
(( java.util.Stack ) v3 ).push ( p0 ); // invoke-virtual {v3, p0}, Ljava/util/Stack;->push(Ljava/lang/Object;)Ljava/lang/Object;
/* move-wide v1, v0 */
/* .line 287 */
} // :goto_0
v0 = (( java.util.Stack ) v3 ).isEmpty ( ); // invoke-virtual {v3}, Ljava/util/Stack;->isEmpty()Z
/* if-nez v0, :cond_1 */
/* .line 288 */
(( java.util.Stack ) v3 ).pop ( ); // invoke-virtual {v3}, Ljava/util/Stack;->pop()Ljava/lang/Object;
/* check-cast v0, Ljava/io/File; */
/* .line 290 */
(( java.io.File ) v0 ).listFiles ( ); // invoke-virtual {v0}, Ljava/io/File;->listFiles()[Ljava/io/File;
/* .line 291 */
/* array-length v5, v4 */
int v0 = 0; // const/4 v0, 0x0
/* move v8, v0 */
/* move-wide v9, v1 */
/* move-wide v0, v9 */
/* move v2, v8 */
} // :goto_1
/* if-lt v2, v5, :cond_3 */
/* move-wide v1, v0 */
} // :cond_3
/* aget-object v6, v4, v2 */
/* .line 293 */
v7 = (( java.io.File ) v6 ).isDirectory ( ); // invoke-virtual {v6}, Ljava/io/File;->isDirectory()Z
/* if-nez v7, :cond_4 */
/* .line 294 */
(( java.io.File ) v6 ).length ( ); // invoke-virtual {v6}, Ljava/io/File;->length()J
/* move-result-wide v6 */
/* add-long/2addr v0, v6 */
/* .line 291 */
} // :cond_4
/* add-int/lit8 v2, v2, 0x1 */
} // .end method
private static android.graphics.Bitmap a ( android.graphics.Bitmap p0 ) {
/* .locals 9 */
/* .prologue */
/* .line 612 */
try { // :try_start_0
v0 = (( android.graphics.Bitmap ) p0 ).getWidth ( ); // invoke-virtual {p0}, Landroid/graphics/Bitmap;->getWidth()I
v1 = (( android.graphics.Bitmap ) p0 ).getHeight ( ); // invoke-virtual {p0}, Landroid/graphics/Bitmap;->getHeight()I
/* .line 613 */
v2 = android.graphics.Bitmap$Config.ARGB_8888;
/* .line 612 */
android.graphics.Bitmap .createBitmap ( v0,v1,v2 );
/* .line 614 */
/* new-instance v1, Landroid/graphics/Canvas; */
/* invoke-direct {v1, v0}, Landroid/graphics/Canvas;-><init>(Landroid/graphics/Bitmap;)V */
/* .line 617 */
/* new-instance v2, Landroid/graphics/Paint; */
/* invoke-direct {v2}, Landroid/graphics/Paint;-><init>()V */
/* .line 618 */
/* new-instance v3, Landroid/graphics/Rect; */
int v4 = 0; // const/4 v4, 0x0
int v5 = 0; // const/4 v5, 0x0
v6 = (( android.graphics.Bitmap ) p0 ).getWidth ( ); // invoke-virtual {p0}, Landroid/graphics/Bitmap;->getWidth()I
v7 = (( android.graphics.Bitmap ) p0 ).getHeight ( ); // invoke-virtual {p0}, Landroid/graphics/Bitmap;->getHeight()I
/* invoke-direct {v3, v4, v5, v6, v7}, Landroid/graphics/Rect;-><init>(IIII)V */
/* .line 619 */
/* new-instance v4, Landroid/graphics/RectF; */
/* invoke-direct {v4, v3}, Landroid/graphics/RectF;-><init>(Landroid/graphics/Rect;)V */
/* .line 621 */
int v5 = 1; // const/4 v5, 0x1
(( android.graphics.Paint ) v2 ).setAntiAlias ( v5 ); // invoke-virtual {v2, v5}, Landroid/graphics/Paint;->setAntiAlias(Z)V
/* .line 622 */
int v5 = 0; // const/4 v5, 0x0
int v6 = 0; // const/4 v6, 0x0
int v7 = 0; // const/4 v7, 0x0
int v8 = 0; // const/4 v8, 0x0
(( android.graphics.Canvas ) v1 ).drawARGB ( v5, v6, v7, v8 ); // invoke-virtual {v1, v5, v6, v7, v8}, Landroid/graphics/Canvas;->drawARGB(IIII)V
/* .line 623 */
/* const v5, -0xbdbdbe */
(( android.graphics.Paint ) v2 ).setColor ( v5 ); // invoke-virtual {v2, v5}, Landroid/graphics/Paint;->setColor(I)V
/* .line 627 */
v5 = (( android.graphics.Bitmap ) p0 ).getWidth ( ); // invoke-virtual {p0}, Landroid/graphics/Bitmap;->getWidth()I
/* div-int/lit8 v5, v5, 0x6 */
/* int-to-float v5, v5 */
v6 = (( android.graphics.Bitmap ) p0 ).getHeight ( ); // invoke-virtual {p0}, Landroid/graphics/Bitmap;->getHeight()I
/* div-int/lit8 v6, v6, 0x6 */
/* int-to-float v6, v6 */
(( android.graphics.Canvas ) v1 ).drawRoundRect ( v4, v5, v6, v2 ); // invoke-virtual {v1, v4, v5, v6, v2}, Landroid/graphics/Canvas;->drawRoundRect(Landroid/graphics/RectF;FFLandroid/graphics/Paint;)V
/* .line 629 */
/* new-instance v4, Landroid/graphics/PorterDuffXfermode; */
v5 = android.graphics.PorterDuff$Mode.SRC_IN;
/* invoke-direct {v4, v5}, Landroid/graphics/PorterDuffXfermode;-><init>(Landroid/graphics/PorterDuff$Mode;)V */
(( android.graphics.Paint ) v2 ).setXfermode ( v4 ); // invoke-virtual {v2, v4}, Landroid/graphics/Paint;->setXfermode(Landroid/graphics/Xfermode;)Landroid/graphics/Xfermode;
/* .line 630 */
(( android.graphics.Canvas ) v1 ).drawBitmap ( p0, v3, v3, v2 ); // invoke-virtual {v1, p0, v3, v3, v2}, Landroid/graphics/Canvas;->drawBitmap(Landroid/graphics/Bitmap;Landroid/graphics/Rect;Landroid/graphics/Rect;Landroid/graphics/Paint;)V
/* .line 632 */
(( android.graphics.Bitmap ) p0 ).recycle ( ); // invoke-virtual {p0}, Landroid/graphics/Bitmap;->recycle()V
/* :try_end_0 */
/* .catch Ljava/lang/OutOfMemoryError; {:try_start_0 ..:try_end_0} :catch_0 */
/* .line 636 */
} // :goto_0
/* .line 634 */
/* :catch_0 */
/* move-exception v0 */
/* .line 635 */
v0 = com.umeng.common.net.q.b;
final String v1 = "Cant`t create round corner bitmap.[OutOfMemoryError] "; // const-string v1, "Cant`t create round corner bitmap.[OutOfMemoryError] "
com.umeng.common.Log .e ( v0,v1 );
/* .line 636 */
int v0 = 0; // const/4 v0, 0x0
} // .end method
static android.graphics.drawable.Drawable a ( java.lang.String p0 ) { //synthethic
/* .locals 1 */
/* .prologue */
/* .line 565 */
com.umeng.common.net.q .c ( p0 );
} // .end method
public static java.io.File a ( java.lang.String p0, android.content.Context p1, Boolean[] p2 ) {
/* .locals 5 */
/* .annotation system Ldalvik/annotation/Throws; */
/* value = { */
/* Ljava/io/IOException; */
/* } */
} // .end annotation
/* .prologue */
/* const/16 v4, 0x1f9 */
int v3 = 0; // const/4 v3, 0x0
int v2 = -1; // const/4 v2, -0x1
/* .line 181 */
v0 = com.umeng.common.b .b ( );
if ( v0 != null) { // if-eqz v0, :cond_0
/* .line 182 */
android.os.Environment .getExternalStorageDirectory ( );
(( java.io.File ) v0 ).getCanonicalPath ( ); // invoke-virtual {v0}, Ljava/io/File;->getCanonicalPath()Ljava/lang/String;
/* .line 183 */
/* new-instance v1, Ljava/lang/StringBuilder; */
java.lang.String .valueOf ( v0 );
/* invoke-direct {v1, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V */
final String v0 = "/download/.um"; // const-string v0, "/download/.um"
(( java.lang.StringBuilder ) v1 ).append ( v0 ); // invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v0 ).append ( p0 ); // invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v0 ).toString ( ); // invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
/* .line 184 */
/* new-instance v0, Ljava/io/File; */
/* invoke-direct {v0, v1}, Ljava/io/File;-><init>(Ljava/lang/String;)V */
/* .line 185 */
(( java.io.File ) v0 ).mkdirs ( ); // invoke-virtual {v0}, Ljava/io/File;->mkdirs()Z
/* .line 186 */
v1 = (( java.io.File ) v0 ).exists ( ); // invoke-virtual {v0}, Ljava/io/File;->exists()Z
if ( v1 != null) { // if-eqz v1, :cond_0
/* .line 187 */
int v1 = 1; // const/4 v1, 0x1
/* aput-boolean v1, p2, v3 */
/* .line 199 */
} // :goto_0
/* .line 191 */
} // :cond_0
(( android.content.Context ) p1 ).getCacheDir ( ); // invoke-virtual {p1}, Landroid/content/Context;->getCacheDir()Ljava/io/File;
(( java.io.File ) v0 ).getAbsolutePath ( ); // invoke-virtual {v0}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;
/* .line 192 */
/* new-instance v1, Ljava/io/File; */
/* invoke-direct {v1, v0}, Ljava/io/File;-><init>(Ljava/lang/String;)V */
(( java.io.File ) v1 ).mkdir ( ); // invoke-virtual {v1}, Ljava/io/File;->mkdir()Z
/* .line 193 */
com.umeng.common.net.q .a ( v0,v4,v2,v2 );
/* .line 194 */
/* new-instance v1, Ljava/lang/StringBuilder; */
java.lang.String .valueOf ( v0 );
/* invoke-direct {v1, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V */
final String v0 = "/umdownload"; // const-string v0, "/umdownload"
(( java.lang.StringBuilder ) v1 ).append ( v0 ); // invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v0 ).toString ( ); // invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
/* .line 195 */
/* new-instance v0, Ljava/io/File; */
/* invoke-direct {v0, v1}, Ljava/io/File;-><init>(Ljava/lang/String;)V */
(( java.io.File ) v0 ).mkdir ( ); // invoke-virtual {v0}, Ljava/io/File;->mkdir()Z
/* .line 196 */
com.umeng.common.net.q .a ( v1,v4,v2,v2 );
/* .line 197 */
/* new-instance v0, Ljava/io/File; */
/* invoke-direct {v0, v1}, Ljava/io/File;-><init>(Ljava/lang/String;)V */
/* .line 198 */
/* aput-boolean v3, p2, v3 */
} // .end method
static java.lang.String a ( ) { //synthethic
/* .locals 1 */
/* .prologue */
/* .line 49 */
v0 = com.umeng.common.net.q.b;
} // .end method
public static java.lang.String a ( android.content.Context p0, java.lang.String p1 ) {
/* .locals 8 */
/* .prologue */
int v1 = 0; // const/4 v1, 0x0
/* .line 120 */
v0 = com.umeng.common.util.h .d ( p1 );
if ( v0 != null) { // if-eqz v0, :cond_0
/* move-object v0, v1 */
/* .line 167 */
} // :goto_0
/* .line 124 */
} // :cond_0
try { // :try_start_0
/* new-instance v0, Ljava/lang/StringBuilder; */
com.umeng.common.net.q .b ( p1 );
java.lang.String .valueOf ( v2 );
/* invoke-direct {v0, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V */
final String v2 = ".tmp"; // const-string v2, ".tmp"
(( java.lang.StringBuilder ) v0 ).append ( v2 ); // invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v0 ).toString ( ); // invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
/* .line 129 */
v0 = com.umeng.common.b .b ( );
if ( v0 != null) { // if-eqz v0, :cond_1
/* .line 130 */
android.os.Environment .getExternalStorageDirectory ( );
(( java.io.File ) v0 ).getCanonicalPath ( ); // invoke-virtual {v0}, Ljava/io/File;->getCanonicalPath()Ljava/lang/String;
/* .line 131 */
/* const-wide/32 v2, 0x3200000 */
/* .line 137 */
} // :goto_1
/* new-instance v5, Ljava/io/File; */
/* new-instance v6, Ljava/lang/StringBuilder; */
java.lang.String .valueOf ( v0 );
/* invoke-direct {v6, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V */
final String v0 = "/download/.um"; // const-string v0, "/download/.um"
(( java.lang.StringBuilder ) v6 ).append ( v0 ); // invoke-virtual {v6, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v0 ).toString ( ); // invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
/* invoke-direct {v5, v0}, Ljava/io/File;-><init>(Ljava/lang/String;)V */
/* .line 139 */
/* const-wide/32 v6, 0x1b7740 */
com.umeng.common.net.q .a ( v5,v2,v3,v6,v7 );
/* .line 141 */
/* new-instance v2, Ljava/io/File; */
/* invoke-direct {v2, v5, v4}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V */
/* :try_end_0 */
/* .catch Ljava/lang/Exception; {:try_start_0 ..:try_end_0} :catch_1 */
/* .line 142 */
try { // :try_start_1
(( java.io.File ) v2 ).createNewFile ( ); // invoke-virtual {v2}, Ljava/io/File;->createNewFile()Z
/* .line 143 */
/* new-instance v3, Ljava/io/FileOutputStream; */
/* invoke-direct {v3, v2}, Ljava/io/FileOutputStream;-><init>(Ljava/io/File;)V */
/* .line 145 */
/* new-instance v0, Ljava/net/URL; */
/* invoke-direct {v0, p1}, Ljava/net/URL;-><init>(Ljava/lang/String;)V */
(( java.net.URL ) v0 ).openConnection ( ); // invoke-virtual {v0}, Ljava/net/URL;->openConnection()Ljava/net/URLConnection;
(( java.net.URLConnection ) v0 ).getContent ( ); // invoke-virtual {v0}, Ljava/net/URLConnection;->getContent()Ljava/lang/Object;
/* check-cast v0, Ljava/io/InputStream; */
/* .line 147 */
/* const/16 v4, 0x1000 */
/* new-array v4, v4, [B */
/* .line 149 */
} // :goto_2
v5 = (( java.io.InputStream ) v0 ).read ( v4 ); // invoke-virtual {v0, v4}, Ljava/io/InputStream;->read([B)I
int v6 = -1; // const/4 v6, -0x1
/* if-ne v5, v6, :cond_2 */
/* .line 152 */
(( java.io.FileOutputStream ) v3 ).flush ( ); // invoke-virtual {v3}, Ljava/io/FileOutputStream;->flush()V
/* .line 154 */
(( java.io.InputStream ) v0 ).close ( ); // invoke-virtual {v0}, Ljava/io/InputStream;->close()V
/* .line 155 */
(( java.io.FileOutputStream ) v3 ).close ( ); // invoke-virtual {v3}, Ljava/io/FileOutputStream;->close()V
/* .line 157 */
/* new-instance v0, Ljava/io/File; */
(( java.io.File ) v2 ).getParent ( ); // invoke-virtual {v2}, Ljava/io/File;->getParent()Ljava/lang/String;
(( java.io.File ) v2 ).getName ( ); // invoke-virtual {v2}, Ljava/io/File;->getName()Ljava/lang/String;
final String v5 = ".tmp"; // const-string v5, ".tmp"
final String v6 = ""; // const-string v6, ""
(( java.lang.String ) v4 ).replace ( v5, v6 ); // invoke-virtual {v4, v5, v6}, Ljava/lang/String;->replace(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Ljava/lang/String;
/* invoke-direct {v0, v3, v4}, Ljava/io/File;-><init>(Ljava/lang/String;Ljava/lang/String;)V */
/* .line 158 */
(( java.io.File ) v2 ).renameTo ( v0 ); // invoke-virtual {v2, v0}, Ljava/io/File;->renameTo(Ljava/io/File;)Z
/* .line 159 */
v3 = com.umeng.common.net.q.b;
/* new-instance v4, Ljava/lang/StringBuilder; */
final String v5 = "download img["; // const-string v5, "download img["
/* invoke-direct {v4, v5}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V */
(( java.lang.StringBuilder ) v4 ).append ( p1 ); // invoke-virtual {v4, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
final String v5 = "] to "; // const-string v5, "] to "
(( java.lang.StringBuilder ) v4 ).append ( v5 ); // invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.io.File ) v0 ).getCanonicalPath ( ); // invoke-virtual {v0}, Ljava/io/File;->getCanonicalPath()Ljava/lang/String;
(( java.lang.StringBuilder ) v4 ).append ( v5 ); // invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v4 ).toString ( ); // invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
com.umeng.common.Log .a ( v3,v4 );
/* .line 160 */
(( java.io.File ) v0 ).getCanonicalPath ( ); // invoke-virtual {v0}, Ljava/io/File;->getCanonicalPath()Ljava/lang/String;
/* :try_end_1 */
/* .catch Ljava/lang/Exception; {:try_start_1 ..:try_end_1} :catch_0 */
/* goto/16 :goto_0 */
/* .line 133 */
} // :cond_1
try { // :try_start_2
(( android.content.Context ) p0 ).getCacheDir ( ); // invoke-virtual {p0}, Landroid/content/Context;->getCacheDir()Ljava/io/File;
(( java.io.File ) v0 ).getCanonicalPath ( ); // invoke-virtual {v0}, Ljava/io/File;->getCanonicalPath()Ljava/lang/String;
/* :try_end_2 */
/* .catch Ljava/lang/Exception; {:try_start_2 ..:try_end_2} :catch_1 */
/* .line 134 */
/* const-wide/32 v2, 0xa00000 */
/* goto/16 :goto_1 */
/* .line 150 */
} // :cond_2
int v6 = 0; // const/4 v6, 0x0
try { // :try_start_3
(( java.io.FileOutputStream ) v3 ).write ( v4, v6, v5 ); // invoke-virtual {v3, v4, v6, v5}, Ljava/io/FileOutputStream;->write([BII)V
/* :try_end_3 */
/* .catch Ljava/lang/Exception; {:try_start_3 ..:try_end_3} :catch_0 */
/* .line 161 */
/* :catch_0 */
/* move-exception v0 */
/* .line 162 */
} // :goto_3
v3 = com.umeng.common.net.q.b;
/* new-instance v4, Ljava/lang/StringBuilder; */
(( java.lang.Exception ) v0 ).getStackTrace ( ); // invoke-virtual {v0}, Ljava/lang/Exception;->getStackTrace()[Ljava/lang/StackTraceElement;
(( java.lang.Object ) v0 ).toString ( ); // invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;
java.lang.String .valueOf ( v0 );
/* invoke-direct {v4, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V */
final String v0 = "\t url:\t"; // const-string v0, "\t url:\t"
(( java.lang.StringBuilder ) v4 ).append ( v0 ); // invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
/* .line 163 */
v4 = com.umeng.common.util.h.a;
(( java.lang.StringBuilder ) v0 ).append ( v4 ); // invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v0 ).append ( p1 ); // invoke-virtual {v0, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v0 ).toString ( ); // invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
/* .line 162 */
com.umeng.common.Log .a ( v3,v0 );
/* .line 164 */
if ( v2 != null) { // if-eqz v2, :cond_3
v0 = (( java.io.File ) v2 ).exists ( ); // invoke-virtual {v2}, Ljava/io/File;->exists()Z
if ( v0 != null) { // if-eqz v0, :cond_3
/* .line 165 */
(( java.io.File ) v2 ).deleteOnExit ( ); // invoke-virtual {v2}, Ljava/io/File;->deleteOnExit()V
} // :cond_3
/* move-object v0, v1 */
/* .line 167 */
/* goto/16 :goto_0 */
/* .line 161 */
/* :catch_1 */
/* move-exception v0 */
/* move-object v2, v1 */
} // .end method
static void a ( android.content.Context p0, android.widget.ImageView p1, android.graphics.drawable.Drawable p2, Boolean p3, com.umeng.common.net.q$a p4, android.view.animation.Animation p5, Boolean p6, java.lang.String p7 ) { //synthethic
/* .locals 0 */
/* .prologue */
/* .line 449 */
/* invoke-static/range {p0 ..p7}, Lcom/umeng/common/net/q;->b(Landroid/content/Context;Landroid/widget/ImageView;Landroid/graphics/drawable/Drawable;ZLcom/umeng/common/net/q$a;Landroid/view/animation/Animation;ZLjava/lang/String;)V */
return;
} // .end method
public static void a ( android.content.Context p0, android.widget.ImageView p1, java.lang.String p2, Boolean p3 ) {
/* .locals 7 */
/* .prologue */
int v4 = 0; // const/4 v4, 0x0
/* .line 357 */
int v6 = 0; // const/4 v6, 0x0
/* move-object v0, p0 */
/* move-object v1, p1 */
/* move-object v2, p2 */
/* move v3, p3 */
/* move-object v5, v4 */
/* invoke-static/range {v0 ..v6}, Lcom/umeng/common/net/q;->a(Landroid/content/Context;Landroid/widget/ImageView;Ljava/lang/String;ZLcom/umeng/common/net/q$a;Landroid/view/animation/Animation;Z)V */
/* .line 358 */
return;
} // .end method
public static void a ( android.content.Context p0, android.widget.ImageView p1, java.lang.String p2, Boolean p3, com.umeng.common.net.q$a p4 ) {
/* .locals 7 */
/* .prologue */
/* .line 374 */
int v5 = 0; // const/4 v5, 0x0
int v6 = 0; // const/4 v6, 0x0
/* move-object v0, p0 */
/* move-object v1, p1 */
/* move-object v2, p2 */
/* move v3, p3 */
/* move-object v4, p4 */
/* invoke-static/range {v0 ..v6}, Lcom/umeng/common/net/q;->a(Landroid/content/Context;Landroid/widget/ImageView;Ljava/lang/String;ZLcom/umeng/common/net/q$a;Landroid/view/animation/Animation;Z)V */
/* .line 375 */
return;
} // .end method
public static void a ( android.content.Context p0, android.widget.ImageView p1, java.lang.String p2, Boolean p3, com.umeng.common.net.q$a p4, android.view.animation.Animation p5 ) {
/* .locals 7 */
/* .prologue */
/* .line 393 */
int v5 = 0; // const/4 v5, 0x0
int v6 = 0; // const/4 v6, 0x0
/* move-object v0, p0 */
/* move-object v1, p1 */
/* move-object v2, p2 */
/* move v3, p3 */
/* move-object v4, p4 */
/* invoke-static/range {v0 ..v6}, Lcom/umeng/common/net/q;->a(Landroid/content/Context;Landroid/widget/ImageView;Ljava/lang/String;ZLcom/umeng/common/net/q$a;Landroid/view/animation/Animation;Z)V */
/* .line 394 */
return;
} // .end method
public static void a ( android.content.Context p0, android.widget.ImageView p1, java.lang.String p2, Boolean p3, com.umeng.common.net.q$a p4, android.view.animation.Animation p5, Boolean p6 ) {
/* .locals 10 */
/* .prologue */
/* .line 413 */
/* if-nez p1, :cond_1 */
/* .line 434 */
} // :cond_0
} // :goto_0
return;
/* .line 414 */
} // :cond_1
v0 = com.umeng.common.net.q.f;
/* .line 417 */
try { // :try_start_0
com.umeng.common.net.q .b ( p0,p2 );
/* .line 418 */
if ( v0 != null) { // if-eqz v0, :cond_4
v1 = (( java.io.File ) v0 ).exists ( ); // invoke-virtual {v0}, Ljava/io/File;->exists()Z
if ( v1 != null) { // if-eqz v1, :cond_4
/* sget-boolean v1, Lcom/umeng/common/net/q;->a:Z */
/* if-nez v1, :cond_4 */
/* .line 419 */
if ( p4 != null) { // if-eqz p4, :cond_2
v1 = com.umeng.common.net.q$b.a;
/* .line 420 */
} // :cond_2
(( java.io.File ) v0 ).getAbsolutePath ( ); // invoke-virtual {v0}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;
com.umeng.common.net.q .c ( v1 );
/* .line 421 */
/* if-nez v2, :cond_3 */
/* .line 422 */
(( java.io.File ) v0 ).delete ( ); // invoke-virtual {v0}, Ljava/io/File;->delete()Z
} // :cond_3
/* move-object v0, p0 */
/* move-object v1, p1 */
/* move v3, p3 */
/* move-object v4, p4 */
/* move-object v5, p5 */
/* move/from16 v6, p6 */
/* move-object v7, p2 */
/* .line 423 */
/* invoke-static/range {v0 ..v7}, Lcom/umeng/common/net/q;->b(Landroid/content/Context;Landroid/widget/ImageView;Landroid/graphics/drawable/Drawable;ZLcom/umeng/common/net/q$a;Landroid/view/animation/Animation;ZLjava/lang/String;)V */
/* :try_end_0 */
/* .catch Ljava/lang/Exception; {:try_start_0 ..:try_end_0} :catch_0 */
/* .line 430 */
/* :catch_0 */
/* move-exception v0 */
/* .line 431 */
v1 = com.umeng.common.net.q.b;
final String v2 = ""; // const-string v2, ""
com.umeng.common.Log .b ( v1,v2,v0 );
/* .line 432 */
if ( p4 != null) { // if-eqz p4, :cond_0
v0 = com.umeng.common.net.p$a.b;
/* .line 426 */
} // :cond_4
try { // :try_start_1
/* new-instance v0, Lcom/umeng/common/net/q$c; */
v4 = com.umeng.common.net.q$b.b;
int v5 = 0; // const/4 v5, 0x0
/* move-object v1, p0 */
/* move-object v2, p1 */
/* move-object v3, p2 */
/* move v6, p3 */
/* move-object v7, p4 */
/* move-object v8, p5 */
/* move/from16 v9, p6 */
/* invoke-direct/range {v0 ..v9}, Lcom/umeng/common/net/q$c;-><init>(Landroid/content/Context;Landroid/widget/ImageView;Ljava/lang/String;Lcom/umeng/common/net/q$b;Ljava/io/File;ZLcom/umeng/common/net/q$a;Landroid/view/animation/Animation;Z)V */
/* .line 428 */
int v1 = 0; // const/4 v1, 0x0
/* new-array v1, v1, [Ljava/lang/Object; */
(( com.umeng.common.net.q$c ) v0 ).execute ( v1 ); // invoke-virtual {v0, v1}, Lcom/umeng/common/net/q$c;->execute([Ljava/lang/Object;)Landroid/os/AsyncTask;
/* :try_end_1 */
/* .catch Ljava/lang/Exception; {:try_start_1 ..:try_end_1} :catch_0 */
} // .end method
static void a ( java.io.File p0, Long p1 ) { //synthethic
/* .locals 0 */
/* .prologue */
/* .line 307 */
com.umeng.common.net.q .b ( p0,p1,p2 );
return;
} // .end method
public static void a ( java.io.File p0, Long p1, Long p2 ) {
/* .locals 3 */
/* .annotation system Ldalvik/annotation/Throws; */
/* value = { */
/* Ljava/io/IOException; */
/* } */
} // .end annotation
/* .prologue */
/* .line 251 */
v0 = (( java.io.File ) p0 ).exists ( ); // invoke-virtual {p0}, Ljava/io/File;->exists()Z
if ( v0 != null) { // if-eqz v0, :cond_2
/* .line 252 */
(( java.io.File ) p0 ).getCanonicalFile ( ); // invoke-virtual {p0}, Ljava/io/File;->getCanonicalFile()Ljava/io/File;
com.umeng.common.net.q .a ( v0 );
/* move-result-wide v0 */
/* cmp-long v0, v0, p1 */
/* if-lez v0, :cond_1 */
/* .line 254 */
v0 = com.umeng.common.net.q.g;
/* if-nez v0, :cond_0 */
/* .line 255 */
/* new-instance v0, Ljava/lang/Thread; */
/* new-instance v1, Lcom/umeng/common/net/r; */
/* invoke-direct {v1, p0, p3, p4}, Lcom/umeng/common/net/r;-><init>(Ljava/io/File;J)V */
/* invoke-direct {v0, v1}, Ljava/lang/Thread;-><init>(Ljava/lang/Runnable;)V */
/* .line 263 */
} // :cond_0
v1 = com.umeng.common.net.q.g;
/* monitor-enter v1 */
/* .line 264 */
try { // :try_start_0
v0 = com.umeng.common.net.q.g;
(( java.lang.Thread ) v0 ).start ( ); // invoke-virtual {v0}, Ljava/lang/Thread;->start()V
/* .line 263 */
/* monitor-exit v1 */
/* .line 276 */
} // :cond_1
} // :goto_0
return;
/* .line 263 */
/* :catchall_0 */
/* move-exception v0 */
/* monitor-exit v1 */
/* :try_end_0 */
/* .catchall {:try_start_0 ..:try_end_0} :catchall_0 */
/* throw v0 */
/* .line 268 */
} // :cond_2
v0 = (( java.io.File ) p0 ).mkdirs ( ); // invoke-virtual {p0}, Ljava/io/File;->mkdirs()Z
/* if-nez v0, :cond_1 */
/* .line 270 */
v0 = com.umeng.common.net.q.b;
/* .line 271 */
/* new-instance v1, Ljava/lang/StringBuilder; */
final String v2 = "Failed to create directory"; // const-string v2, "Failed to create directory"
/* invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V */
/* .line 272 */
(( java.io.File ) p0 ).getAbsolutePath ( ); // invoke-virtual {p0}, Ljava/io/File;->getAbsolutePath()Ljava/lang/String;
(( java.lang.StringBuilder ) v1 ).append ( v2 ); // invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
/* .line 273 */
final String v2 = ".Check permission.Make sure WRITE_EXTERNAL_STORAGE is added in your Manifest.xml"; // const-string v2, ".Check permission.Make sure WRITE_EXTERNAL_STORAGE is added in your Manifest.xml"
(( java.lang.StringBuilder ) v1 ).append ( v2 ); // invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
/* .line 271 */
(( java.lang.StringBuilder ) v1 ).toString ( ); // invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
/* .line 270 */
com.umeng.common.Log .b ( v0,v1 );
} // .end method
static void a ( java.lang.Thread p0 ) { //synthethic
/* .locals 0 */
/* .prologue */
/* .line 78 */
return;
} // .end method
private static Boolean a ( android.widget.ImageView p0, java.lang.String p1 ) {
/* .locals 1 */
/* .prologue */
/* .line 443 */
v0 = com.umeng.common.net.q.f;
/* check-cast v0, Ljava/lang/String; */
/* .line 444 */
if ( v0 != null) { // if-eqz v0, :cond_0
v0 = (( java.lang.String ) v0 ).equals ( p1 ); // invoke-virtual {v0, p1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
/* if-nez v0, :cond_0 */
/* .line 445 */
int v0 = 1; // const/4 v0, 0x1
/* .line 446 */
} // :goto_0
} // :cond_0
int v0 = 0; // const/4 v0, 0x0
} // .end method
public static Boolean a ( java.lang.String p0, Integer p1 ) {
/* .locals 3 */
/* .prologue */
int v2 = -1; // const/4 v2, -0x1
/* .line 232 */
/* const/16 v0, 0x1b0 */
/* .line 234 */
/* and-int/lit8 v1, p1, 0x1 */
if ( v1 != null) { // if-eqz v1, :cond_0
/* .line 235 */
/* const/16 v0, 0x1b4 */
/* .line 237 */
} // :cond_0
/* and-int/lit8 v1, p1, 0x2 */
if ( v1 != null) { // if-eqz v1, :cond_1
/* .line 238 */
/* or-int/lit8 v0, v0, 0x2 */
/* .line 240 */
} // :cond_1
v0 = com.umeng.common.net.q .a ( p0,v0,v2,v2 );
} // .end method
public static Boolean a ( java.lang.String p0, Integer p1, Integer p2, Integer p3 ) {
/* .locals 7 */
/* .prologue */
int v0 = 1; // const/4 v0, 0x1
int v1 = 0; // const/4 v1, 0x0
/* .line 212 */
try { // :try_start_0
final String v2 = "android.os.FileUtils"; // const-string v2, "android.os.FileUtils"
java.lang.Class .forName ( v2 );
/* .line 213 */
final String v3 = "setPermissions"; // const-string v3, "setPermissions"
int v4 = 4; // const/4 v4, 0x4
/* new-array v4, v4, [Ljava/lang/Class; */
int v5 = 0; // const/4 v5, 0x0
/* const-class v6, Ljava/lang/String; */
/* aput-object v6, v4, v5 */
int v5 = 1; // const/4 v5, 0x1
v6 = java.lang.Integer.TYPE;
/* aput-object v6, v4, v5 */
int v5 = 2; // const/4 v5, 0x2
v6 = java.lang.Integer.TYPE;
/* aput-object v6, v4, v5 */
int v5 = 3; // const/4 v5, 0x3
v6 = java.lang.Integer.TYPE;
/* aput-object v6, v4, v5 */
(( java.lang.Class ) v2 ).getMethod ( v3, v4 ); // invoke-virtual {v2, v3, v4}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;
/* .line 214 */
int v3 = 0; // const/4 v3, 0x0
int v4 = 4; // const/4 v4, 0x4
/* new-array v4, v4, [Ljava/lang/Object; */
int v5 = 0; // const/4 v5, 0x0
/* aput-object p0, v4, v5 */
int v5 = 1; // const/4 v5, 0x1
java.lang.Integer .valueOf ( p1 );
/* aput-object v6, v4, v5 */
int v5 = 2; // const/4 v5, 0x2
int v6 = -1; // const/4 v6, -0x1
java.lang.Integer .valueOf ( v6 );
/* aput-object v6, v4, v5 */
int v5 = 3; // const/4 v5, 0x3
int v6 = -1; // const/4 v6, -0x1
java.lang.Integer .valueOf ( v6 );
/* aput-object v6, v4, v5 */
(( java.lang.reflect.Method ) v2 ).invoke ( v3, v4 ); // invoke-virtual {v2, v3, v4}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
/* :try_end_0 */
/* .catch Ljava/lang/ClassNotFoundException; {:try_start_0 ..:try_end_0} :catch_0 */
/* .catch Ljava/lang/NoSuchMethodException; {:try_start_0 ..:try_end_0} :catch_1 */
/* .catch Ljava/lang/IllegalArgumentException; {:try_start_0 ..:try_end_0} :catch_2 */
/* .catch Ljava/lang/IllegalAccessException; {:try_start_0 ..:try_end_0} :catch_3 */
/* .catch Ljava/lang/reflect/InvocationTargetException; {:try_start_0 ..:try_end_0} :catch_4 */
/* .line 227 */
} // :goto_0
/* .line 216 */
/* :catch_0 */
/* move-exception v0 */
/* .line 217 */
v2 = com.umeng.common.net.q.b;
final String v3 = "error when set permissions:"; // const-string v3, "error when set permissions:"
com.umeng.common.Log .b ( v2,v3,v0 );
} // :goto_1
/* move v0, v1 */
/* .line 227 */
/* .line 218 */
/* :catch_1 */
/* move-exception v0 */
/* .line 219 */
v2 = com.umeng.common.net.q.b;
final String v3 = "error when set permissions:"; // const-string v3, "error when set permissions:"
com.umeng.common.Log .b ( v2,v3,v0 );
/* .line 220 */
/* :catch_2 */
/* move-exception v0 */
/* .line 221 */
v2 = com.umeng.common.net.q.b;
final String v3 = "error when set permissions:"; // const-string v3, "error when set permissions:"
com.umeng.common.Log .b ( v2,v3,v0 );
/* .line 222 */
/* :catch_3 */
/* move-exception v0 */
/* .line 223 */
v2 = com.umeng.common.net.q.b;
final String v3 = "error when set permissions:"; // const-string v3, "error when set permissions:"
com.umeng.common.Log .b ( v2,v3,v0 );
/* .line 224 */
/* :catch_4 */
/* move-exception v0 */
/* .line 225 */
v2 = com.umeng.common.net.q.b;
final String v3 = "error when set permissions:"; // const-string v3, "error when set permissions:"
com.umeng.common.Log .b ( v2,v3,v0 );
} // .end method
protected static java.io.File b ( android.content.Context p0, java.lang.String p1 ) {
/* .locals 4 */
/* .annotation system Ldalvik/annotation/Throws; */
/* value = { */
/* Ljava/io/IOException; */
/* } */
} // .end annotation
/* .prologue */
/* .line 326 */
com.umeng.common.net.q .b ( p1 );
/* .line 329 */
v0 = com.umeng.common.b .b ( );
if ( v0 != null) { // if-eqz v0, :cond_0
/* .line 330 */
android.os.Environment .getExternalStorageDirectory ( );
(( java.io.File ) v0 ).getCanonicalPath ( ); // invoke-virtual {v0}, Ljava/io/File;->getCanonicalPath()Ljava/lang/String;
/* .line 334 */
} // :goto_0
/* new-instance v2, Ljava/io/File; */
/* new-instance v3, Ljava/lang/StringBuilder; */
java.lang.String .valueOf ( v0 );
/* invoke-direct {v3, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V */
final String v0 = "/download/.um"; // const-string v0, "/download/.um"
(( java.lang.StringBuilder ) v3 ).append ( v0 ); // invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v0 ).toString ( ); // invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
/* invoke-direct {v2, v0}, Ljava/io/File;-><init>(Ljava/lang/String;)V */
/* .line 336 */
/* new-instance v0, Ljava/io/File; */
/* invoke-direct {v0, v2, v1}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V */
/* .line 337 */
v1 = (( java.io.File ) v0 ).exists ( ); // invoke-virtual {v0}, Ljava/io/File;->exists()Z
if ( v1 != null) { // if-eqz v1, :cond_1
/* .line 340 */
} // :goto_1
/* .line 332 */
} // :cond_0
(( android.content.Context ) p0 ).getCacheDir ( ); // invoke-virtual {p0}, Landroid/content/Context;->getCacheDir()Ljava/io/File;
(( java.io.File ) v0 ).getCanonicalPath ( ); // invoke-virtual {v0}, Ljava/io/File;->getCanonicalPath()Ljava/lang/String;
/* .line 340 */
} // :cond_1
int v0 = 0; // const/4 v0, 0x0
} // .end method
private static java.lang.String b ( java.lang.String p0 ) {
/* .locals 3 */
/* .prologue */
/* .line 87 */
final String v0 = "."; // const-string v0, "."
v1 = (( java.lang.String ) p0 ).lastIndexOf ( v0 ); // invoke-virtual {p0, v0}, Ljava/lang/String;->lastIndexOf(Ljava/lang/String;)I
/* .line 88 */
final String v0 = ""; // const-string v0, ""
/* .line 89 */
/* if-ltz v1, :cond_0 */
/* .line 90 */
(( java.lang.String ) p0 ).substring ( v1 ); // invoke-virtual {p0, v1}, Ljava/lang/String;->substring(I)Ljava/lang/String;
/* .line 92 */
} // :cond_0
/* new-instance v1, Ljava/lang/StringBuilder; */
com.umeng.common.util.h .a ( p0 );
java.lang.String .valueOf ( v2 );
/* invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V */
(( java.lang.StringBuilder ) v1 ).append ( v0 ); // invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v0 ).toString ( ); // invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
} // .end method
private static synchronized void b ( android.content.Context p0, android.widget.ImageView p1, android.graphics.drawable.Drawable p2, Boolean p3, com.umeng.common.net.q$a p4, android.view.animation.Animation p5, Boolean p6, java.lang.String p7 ) {
/* .locals 4 */
/* .prologue */
/* .line 453 */
/* const-class v1, Lcom/umeng/common/net/q; */
/* monitor-enter v1 */
if ( p6 != null) { // if-eqz p6, :cond_0
if ( p2 != null) { // if-eqz p2, :cond_0
/* .line 454 */
try { // :try_start_0
/* check-cast p2, Landroid/graphics/drawable/BitmapDrawable; */
(( android.graphics.drawable.BitmapDrawable ) p2 ).getBitmap ( ); // invoke-virtual {p2}, Landroid/graphics/drawable/BitmapDrawable;->getBitmap()Landroid/graphics/Bitmap;
/* .line 455 */
com.umeng.common.net.q .a ( v0 );
/* .line 456 */
/* new-instance p2, Landroid/graphics/drawable/BitmapDrawable; */
/* invoke-direct {p2, v0}, Landroid/graphics/drawable/BitmapDrawable;-><init>(Landroid/graphics/Bitmap;)V */
/* .line 459 */
} // :cond_0
if ( p2 != null) { // if-eqz p2, :cond_1
/* if-nez p1, :cond_4 */
/* .line 460 */
} // :cond_1
if ( p4 != null) { // if-eqz p4, :cond_2
v0 = com.umeng.common.net.p$a.b;
/* .line 461 */
} // :cond_2
v0 = com.umeng.common.net.q.b;
/* new-instance v2, Ljava/lang/StringBuilder; */
final String v3 = "bind drawable failed.drawable ["; // const-string v3, "bind drawable failed.drawable ["
/* invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V */
(( java.lang.StringBuilder ) v2 ).append ( p2 ); // invoke-virtual {v2, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;
final String v3 = "] imageView[+"; // const-string v3, "] imageView[+"
(( java.lang.StringBuilder ) v2 ).append ( v3 ); // invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v2 ).append ( p1 ); // invoke-virtual {v2, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;
/* .line 462 */
final String v3 = "+]"; // const-string v3, "+]"
(( java.lang.StringBuilder ) v2 ).append ( v3 ); // invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v2 ).toString ( ); // invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
/* .line 461 */
com.umeng.common.Log .e ( v0,v2 );
/* :try_end_0 */
/* .catch Ljava/lang/Exception; {:try_start_0 ..:try_end_0} :catch_0 */
/* .catchall {:try_start_0 ..:try_end_0} :catchall_0 */
/* .line 484 */
} // :cond_3
} // :goto_0
/* monitor-exit v1 */
return;
/* .line 466 */
} // :cond_4
try { // :try_start_1
v0 = com.umeng.common.net.q .a ( p1,p7 );
if ( v0 != null) { // if-eqz v0, :cond_5
/* .line 467 */
if ( p4 != null) { // if-eqz p4, :cond_3
v0 = com.umeng.common.net.p$a.b;
/* :try_end_1 */
/* .catch Ljava/lang/Exception; {:try_start_1 ..:try_end_1} :catch_0 */
/* .catchall {:try_start_1 ..:try_end_1} :catchall_0 */
/* .line 479 */
/* :catch_0 */
/* move-exception v0 */
/* .line 480 */
try { // :try_start_2
v2 = com.umeng.common.net.q.b;
final String v3 = "bind failed"; // const-string v3, "bind failed"
com.umeng.common.Log .b ( v2,v3,v0 );
/* .line 481 */
if ( p4 != null) { // if-eqz p4, :cond_3
v0 = com.umeng.common.net.p$a.b;
/* :try_end_2 */
/* .catchall {:try_start_2 ..:try_end_2} :catchall_0 */
/* .line 453 */
/* :catchall_0 */
/* move-exception v0 */
/* monitor-exit v1 */
/* throw v0 */
/* .line 471 */
} // :cond_5
if ( p3 != null) { // if-eqz p3, :cond_7
/* .line 472 */
try { // :try_start_3
(( android.widget.ImageView ) p1 ).setBackgroundDrawable ( p2 ); // invoke-virtual {p1, p2}, Landroid/widget/ImageView;->setBackgroundDrawable(Landroid/graphics/drawable/Drawable;)V
/* .line 476 */
} // :goto_1
if ( p5 != null) { // if-eqz p5, :cond_6
(( android.widget.ImageView ) p1 ).startAnimation ( p5 ); // invoke-virtual {p1, p5}, Landroid/widget/ImageView;->startAnimation(Landroid/view/animation/Animation;)V
/* .line 478 */
} // :cond_6
if ( p4 != null) { // if-eqz p4, :cond_3
v0 = com.umeng.common.net.p$a.a;
/* .line 474 */
} // :cond_7
(( android.widget.ImageView ) p1 ).setImageDrawable ( p2 ); // invoke-virtual {p1, p2}, Landroid/widget/ImageView;->setImageDrawable(Landroid/graphics/drawable/Drawable;)V
/* :try_end_3 */
/* .catch Ljava/lang/Exception; {:try_start_3 ..:try_end_3} :catch_0 */
/* .catchall {:try_start_3 ..:try_end_3} :catchall_0 */
} // .end method
private static void b ( java.io.File p0, Long p1 ) {
/* .locals 8 */
/* .prologue */
/* .line 308 */
if ( p0 != null) { // if-eqz p0, :cond_0
v0 = (( java.io.File ) p0 ).exists ( ); // invoke-virtual {p0}, Ljava/io/File;->exists()Z
if ( v0 != null) { // if-eqz v0, :cond_0
v0 = (( java.io.File ) p0 ).canWrite ( ); // invoke-virtual {p0}, Ljava/io/File;->canWrite()Z
if ( v0 != null) { // if-eqz v0, :cond_0
v0 = (( java.io.File ) p0 ).isDirectory ( ); // invoke-virtual {p0}, Ljava/io/File;->isDirectory()Z
/* if-nez v0, :cond_1 */
/* .line 316 */
} // :cond_0
return;
/* .line 309 */
} // :cond_1
(( java.io.File ) p0 ).listFiles ( ); // invoke-virtual {p0}, Ljava/io/File;->listFiles()[Ljava/io/File;
/* .line 310 */
/* array-length v2, v1 */
int v0 = 0; // const/4 v0, 0x0
} // :goto_0
/* if-ge v0, v2, :cond_0 */
/* aget-object v3, v1, v0 */
/* .line 311 */
v4 = (( java.io.File ) v3 ).isDirectory ( ); // invoke-virtual {v3}, Ljava/io/File;->isDirectory()Z
/* if-nez v4, :cond_2 */
/* .line 312 */
/* new-instance v4, Ljava/util/Date; */
/* invoke-direct {v4}, Ljava/util/Date;-><init>()V */
(( java.util.Date ) v4 ).getTime ( ); // invoke-virtual {v4}, Ljava/util/Date;->getTime()J
/* move-result-wide v4 */
(( java.io.File ) v3 ).lastModified ( ); // invoke-virtual {v3}, Ljava/io/File;->lastModified()J
/* move-result-wide v6 */
/* sub-long/2addr v4, v6 */
/* cmp-long v4, v4, p1 */
/* if-lez v4, :cond_2 */
/* .line 313 */
(( java.io.File ) v3 ).delete ( ); // invoke-virtual {v3}, Ljava/io/File;->delete()Z
/* .line 310 */
} // :cond_2
/* add-int/lit8 v0, v0, 0x1 */
} // .end method
private static android.graphics.drawable.Drawable c ( java.lang.String p0 ) {
/* .locals 5 */
/* .prologue */
/* .line 566 */
int v0 = 0; // const/4 v0, 0x0
/* .line 568 */
try { // :try_start_0
android.graphics.drawable.Drawable .createFromPath ( p0 );
/* :try_end_0 */
/* .catch Ljava/lang/OutOfMemoryError; {:try_start_0 ..:try_end_0} :catch_0 */
/* .line 572 */
} // :goto_0
/* .line 569 */
/* :catch_0 */
/* move-exception v1 */
/* .line 570 */
v2 = com.umeng.common.net.q.b;
/* new-instance v3, Ljava/lang/StringBuilder; */
final String v4 = "Resutil fetchImage OutOfMemoryError:"; // const-string v4, "Resutil fetchImage OutOfMemoryError:"
/* invoke-direct {v3, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V */
(( java.lang.OutOfMemoryError ) v1 ).toString ( ); // invoke-virtual {v1}, Ljava/lang/OutOfMemoryError;->toString()Ljava/lang/String;
(( java.lang.StringBuilder ) v3 ).append ( v1 ); // invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v1 ).toString ( ); // invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
com.umeng.common.Log .e ( v2,v1 );
} // .end method
