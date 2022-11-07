public class com.balloonisland.hfxw.Utility extends android.app.Application {
	 /* .source "Utility.java" */
	 /* # annotations */
	 /* .annotation system Ldalvik/annotation/MemberClasses; */
	 /* value = { */
	 /* Lcom/balloonisland/hfxw/Utility$FlushedInputStream; */
	 /* } */
} // .end annotation
/* # static fields */
public static final java.lang.String HACK_ICON_URL;
private static Integer MAX_IMAGE_DIMENSION;
public static java.util.Hashtable currentPermissions;
/* .annotation system Ldalvik/annotation/Signature; */
/* value = { */
/* "Ljava/util/Hashtable", */
/* "<", */
/* "Ljava/lang/String;", */
/* "Ljava/lang/String;", */
/* ">;" */
/* } */
} // .end annotation
} // .end field
public static android.net.http.AndroidHttpClient httpclient;
public static com.facebook.android.AsyncFacebookRunner mAsyncRunner;
public static com.facebook.android.Facebook mFacebook;
public static org.json.JSONObject mFriendsList;
public static java.lang.String objectID;
public static java.lang.String userUID;
/* # direct methods */
static com.balloonisland.hfxw.Utility ( ) {
/* .locals 1 */
/* .prologue */
int v0 = 0; // const/4 v0, 0x0
/* .line 31 */
/* .line 32 */
/* .line 34 */
/* .line 35 */
/* new-instance v0, Ljava/util/Hashtable; */
/* invoke-direct {v0}, Ljava/util/Hashtable;-><init>()V */
/* .line 37 */
/* const/16 v0, 0x2d0 */
/* .line 26 */
return;
} // .end method
public com.balloonisland.hfxw.Utility ( ) {
/* .locals 0 */
/* .prologue */
/* .line 26 */
/* invoke-direct {p0}, Landroid/app/Application;-><init>()V */
return;
} // .end method
public static android.graphics.Bitmap getBitmap ( java.lang.String p0 ) {
/* .locals 8 */
/* .param p0, "url" # Ljava/lang/String; */
/* .prologue */
/* .line 41 */
int v2 = 0; // const/4 v2, 0x0
/* .line 43 */
/* .local v2, "bm":Landroid/graphics/Bitmap; */
try { // :try_start_0
/* new-instance v0, Ljava/net/URL; */
/* invoke-direct {v0, p0}, Ljava/net/URL;-><init>(Ljava/lang/String;)V */
/* .line 44 */
/* .local v0, "aURL":Ljava/net/URL; */
(( java.net.URL ) v0 ).openConnection ( ); // invoke-virtual {v0}, Ljava/net/URL;->openConnection()Ljava/net/URLConnection;
/* .line 45 */
/* .local v3, "conn":Ljava/net/URLConnection; */
(( java.net.URLConnection ) v3 ).connect ( ); // invoke-virtual {v3}, Ljava/net/URLConnection;->connect()V
/* .line 46 */
(( java.net.URLConnection ) v3 ).getInputStream ( ); // invoke-virtual {v3}, Ljava/net/URLConnection;->getInputStream()Ljava/io/InputStream;
/* .line 47 */
/* .local v5, "is":Ljava/io/InputStream; */
/* new-instance v1, Ljava/io/BufferedInputStream; */
/* invoke-direct {v1, v5}, Ljava/io/BufferedInputStream;-><init>(Ljava/io/InputStream;)V */
/* .line 48 */
/* .local v1, "bis":Ljava/io/BufferedInputStream; */
/* new-instance v6, Lcom/balloonisland/hfxw/Utility$FlushedInputStream; */
/* invoke-direct {v6, v5}, Lcom/balloonisland/hfxw/Utility$FlushedInputStream;-><init>(Ljava/io/InputStream;)V */
android.graphics.BitmapFactory .decodeStream ( v6 );
/* .line 49 */
(( java.io.BufferedInputStream ) v1 ).close ( ); // invoke-virtual {v1}, Ljava/io/BufferedInputStream;->close()V
/* .line 50 */
(( java.io.InputStream ) v5 ).close ( ); // invoke-virtual {v5}, Ljava/io/InputStream;->close()V
/* :try_end_0 */
/* .catch Ljava/lang/Exception; {:try_start_0 ..:try_end_0} :catch_0 */
/* .catchall {:try_start_0 ..:try_end_0} :catchall_0 */
/* .line 54 */
v6 = com.balloonisland.hfxw.Utility.httpclient;
if ( v6 != null) { // if-eqz v6, :cond_0
	 /* .line 55 */
	 v6 = com.balloonisland.hfxw.Utility.httpclient;
	 (( android.net.http.AndroidHttpClient ) v6 ).close ( ); // invoke-virtual {v6}, Landroid/net/http/AndroidHttpClient;->close()V
	 /* .line 58 */
} // .end local v0 # "aURL":Ljava/net/URL;
} // .end local v1 # "bis":Ljava/io/BufferedInputStream;
} // .end local v3 # "conn":Ljava/net/URLConnection;
} // .end local v5 # "is":Ljava/io/InputStream;
} // :cond_0
} // :goto_0
/* .line 51 */
/* :catch_0 */
/* move-exception v4 */
/* .line 52 */
/* .local v4, "e":Ljava/lang/Exception; */
try { // :try_start_1
(( java.lang.Exception ) v4 ).printStackTrace ( ); // invoke-virtual {v4}, Ljava/lang/Exception;->printStackTrace()V
/* :try_end_1 */
/* .catchall {:try_start_1 ..:try_end_1} :catchall_0 */
/* .line 54 */
v6 = com.balloonisland.hfxw.Utility.httpclient;
if ( v6 != null) { // if-eqz v6, :cond_0
/* .line 55 */
v6 = com.balloonisland.hfxw.Utility.httpclient;
(( android.net.http.AndroidHttpClient ) v6 ).close ( ); // invoke-virtual {v6}, Landroid/net/http/AndroidHttpClient;->close()V
/* .line 53 */
} // .end local v4 # "e":Ljava/lang/Exception;
/* :catchall_0 */
/* move-exception v6 */
/* .line 54 */
v7 = com.balloonisland.hfxw.Utility.httpclient;
if ( v7 != null) { // if-eqz v7, :cond_1
/* .line 55 */
v7 = com.balloonisland.hfxw.Utility.httpclient;
(( android.net.http.AndroidHttpClient ) v7 ).close ( ); // invoke-virtual {v7}, Landroid/net/http/AndroidHttpClient;->close()V
/* .line 57 */
} // :cond_1
/* throw v6 */
} // .end method
public static Integer getOrientation ( android.content.Context p0, android.net.Uri p1 ) {
/* .locals 9 */
/* .param p0, "context" # Landroid/content/Context; */
/* .param p1, "photoUri" # Landroid/net/Uri; */
/* .prologue */
int v8 = 1; // const/4 v8, 0x1
int v7 = 0; // const/4 v7, 0x0
int v3 = 0; // const/4 v3, 0x0
/* .line 145 */
(( android.content.Context ) p0 ).getContentResolver ( ); // invoke-virtual {p0}, Landroid/content/Context;->getContentResolver()Landroid/content/ContentResolver;
/* .line 146 */
/* new-array v2, v8, [Ljava/lang/String; */
final String v1 = "orientation"; // const-string v1, "orientation"
/* aput-object v1, v2, v7 */
/* move-object v1, p1 */
/* move-object v4, v3 */
/* move-object v5, v3 */
/* .line 145 */
/* invoke-virtual/range {v0 ..v5}, Landroid/content/ContentResolver;->query(Landroid/net/Uri;[Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;Ljava/lang/String;)Landroid/database/Cursor; */
/* .line 148 */
v0 = /* .local v6, "cursor":Landroid/database/Cursor; */
/* if-eq v0, v8, :cond_0 */
/* .line 149 */
int v0 = -1; // const/4 v0, -0x1
/* .line 153 */
} // :goto_0
/* .line 152 */
} // :cond_0
v0 = /* .line 153 */
} // .end method
public static scaleImage ( android.content.Context p0, android.net.Uri p1 ) {
/* .locals 20 */
/* .param p0, "context" # Landroid/content/Context; */
/* .param p1, "photoUri" # Landroid/net/Uri; */
/* .annotation system Ldalvik/annotation/Throws; */
/* value = { */
/* Ljava/io/IOException; */
/* } */
} // .end annotation
/* .prologue */
/* .line 86 */
/* invoke-virtual/range {p0 ..p0}, Landroid/content/Context;->getContentResolver()Landroid/content/ContentResolver; */
/* move-object/from16 v0, p1 */
(( android.content.ContentResolver ) v2 ).openInputStream ( v0 ); // invoke-virtual {v2, v0}, Landroid/content/ContentResolver;->openInputStream(Landroid/net/Uri;)Ljava/io/InputStream;
/* .line 87 */
/* .local v12, "is":Ljava/io/InputStream; */
/* new-instance v10, Landroid/graphics/BitmapFactory$Options; */
/* invoke-direct {v10}, Landroid/graphics/BitmapFactory$Options;-><init>()V */
/* .line 88 */
/* .local v10, "dbo":Landroid/graphics/BitmapFactory$Options; */
int v2 = 1; // const/4 v2, 0x1
/* iput-boolean v2, v10, Landroid/graphics/BitmapFactory$Options;->inJustDecodeBounds:Z */
/* .line 89 */
int v2 = 0; // const/4 v2, 0x0
android.graphics.BitmapFactory .decodeStream ( v12,v2,v10 );
/* .line 90 */
(( java.io.InputStream ) v12 ).close ( ); // invoke-virtual {v12}, Ljava/io/InputStream;->close()V
/* .line 93 */
v15 = /* invoke-static/range {p0 ..p1}, Lcom/balloonisland/hfxw/Utility;->getOrientation(Landroid/content/Context;Landroid/net/Uri;)I */
/* .line 95 */
/* .local v15, "orientation":I */
/* const/16 v2, 0x5a */
/* if-eq v15, v2, :cond_0 */
/* const/16 v2, 0x10e */
/* if-ne v15, v2, :cond_4 */
/* .line 96 */
} // :cond_0
/* iget v0, v10, Landroid/graphics/BitmapFactory$Options;->outHeight:I */
/* move/from16 v17, v0 */
/* .line 97 */
/* .local v17, "rotatedWidth":I */
/* iget v0, v10, Landroid/graphics/BitmapFactory$Options;->outWidth:I */
/* move/from16 v16, v0 */
/* .line 104 */
/* .local v16, "rotatedHeight":I */
} // :goto_0
/* invoke-virtual/range {p0 ..p0}, Landroid/content/Context;->getContentResolver()Landroid/content/ContentResolver; */
/* move-object/from16 v0, p1 */
(( android.content.ContentResolver ) v2 ).openInputStream ( v0 ); // invoke-virtual {v2, v0}, Landroid/content/ContentResolver;->openInputStream(Landroid/net/Uri;)Ljava/io/InputStream;
/* .line 105 */
/* move/from16 v0, v17 */
/* if-gt v0, v2, :cond_1 */
/* move/from16 v0, v16 */
/* if-le v0, v2, :cond_5 */
/* .line 106 */
} // :cond_1
/* move/from16 v0, v17 */
/* int-to-float v2, v0 */
/* int-to-float v3, v3 */
/* div-float v19, v2, v3 */
/* .line 107 */
/* .local v19, "widthRatio":F */
/* move/from16 v0, v16 */
/* int-to-float v2, v0 */
/* int-to-float v3, v3 */
/* div-float v11, v2, v3 */
/* .line 108 */
/* .local v11, "heightRatio":F */
/* move/from16 v0, v19 */
v13 = java.lang.Math .max ( v0,v11 );
/* .line 111 */
/* .local v13, "maxRatio":F */
/* new-instance v14, Landroid/graphics/BitmapFactory$Options; */
/* invoke-direct {v14}, Landroid/graphics/BitmapFactory$Options;-><init>()V */
/* .line 112 */
/* .local v14, "options":Landroid/graphics/BitmapFactory$Options; */
/* float-to-int v2, v13 */
/* iput v2, v14, Landroid/graphics/BitmapFactory$Options;->inSampleSize:I */
/* .line 113 */
int v2 = 0; // const/4 v2, 0x0
android.graphics.BitmapFactory .decodeStream ( v12,v2,v14 );
/* .line 117 */
} // .end local v11 # "heightRatio":F
} // .end local v13 # "maxRatio":F
} // .end local v14 # "options":Landroid/graphics/BitmapFactory$Options;
} // .end local v19 # "widthRatio":F
/* .local v1, "srcBitmap":Landroid/graphics/Bitmap; */
} // :goto_1
(( java.io.InputStream ) v12 ).close ( ); // invoke-virtual {v12}, Ljava/io/InputStream;->close()V
/* .line 123 */
/* if-lez v15, :cond_2 */
/* .line 124 */
/* new-instance v6, Landroid/graphics/Matrix; */
/* invoke-direct {v6}, Landroid/graphics/Matrix;-><init>()V */
/* .line 125 */
/* .local v6, "matrix":Landroid/graphics/Matrix; */
/* int-to-float v2, v15 */
(( android.graphics.Matrix ) v6 ).postRotate ( v2 ); // invoke-virtual {v6, v2}, Landroid/graphics/Matrix;->postRotate(F)Z
/* .line 127 */
int v2 = 0; // const/4 v2, 0x0
int v3 = 0; // const/4 v3, 0x0
v4 = (( android.graphics.Bitmap ) v1 ).getWidth ( ); // invoke-virtual {v1}, Landroid/graphics/Bitmap;->getWidth()I
/* .line 128 */
v5 = (( android.graphics.Bitmap ) v1 ).getHeight ( ); // invoke-virtual {v1}, Landroid/graphics/Bitmap;->getHeight()I
int v7 = 1; // const/4 v7, 0x1
/* .line 127 */
/* invoke-static/range {v1 ..v7}, Landroid/graphics/Bitmap;->createBitmap(Landroid/graphics/Bitmap;IIIILandroid/graphics/Matrix;Z)Landroid/graphics/Bitmap; */
/* .line 131 */
} // .end local v6 # "matrix":Landroid/graphics/Matrix;
} // :cond_2
/* invoke-virtual/range {p0 ..p0}, Landroid/content/Context;->getContentResolver()Landroid/content/ContentResolver; */
/* move-object/from16 v0, p1 */
(( android.content.ContentResolver ) v2 ).getType ( v0 ); // invoke-virtual {v2, v0}, Landroid/content/ContentResolver;->getType(Landroid/net/Uri;)Ljava/lang/String;
/* .line 132 */
/* .local v18, "type":Ljava/lang/String; */
/* new-instance v9, Ljava/io/ByteArrayOutputStream; */
/* invoke-direct {v9}, Ljava/io/ByteArrayOutputStream;-><init>()V */
/* .line 133 */
/* .local v9, "baos":Ljava/io/ByteArrayOutputStream; */
final String v2 = "image/png"; // const-string v2, "image/png"
/* move-object/from16 v0, v18 */
v2 = (( java.lang.String ) v0 ).equals ( v2 ); // invoke-virtual {v0, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
if ( v2 != null) { // if-eqz v2, :cond_6
/* .line 134 */
v2 = android.graphics.Bitmap$CompressFormat.PNG;
/* const/16 v3, 0x64 */
(( android.graphics.Bitmap ) v1 ).compress ( v2, v3, v9 ); // invoke-virtual {v1, v2, v3, v9}, Landroid/graphics/Bitmap;->compress(Landroid/graphics/Bitmap$CompressFormat;ILjava/io/OutputStream;)Z
/* .line 138 */
} // :cond_3
} // :goto_2
(( java.io.ByteArrayOutputStream ) v9 ).toByteArray ( ); // invoke-virtual {v9}, Ljava/io/ByteArrayOutputStream;->toByteArray()[B
/* .line 139 */
/* .local v8, "bMapArray":[B */
(( java.io.ByteArrayOutputStream ) v9 ).close ( ); // invoke-virtual {v9}, Ljava/io/ByteArrayOutputStream;->close()V
/* .line 140 */
/* .line 99 */
} // .end local v1 # "srcBitmap":Landroid/graphics/Bitmap;
} // .end local v8 # "bMapArray":[B
} // .end local v9 # "baos":Ljava/io/ByteArrayOutputStream;
} // .end local v16 # "rotatedHeight":I
} // .end local v17 # "rotatedWidth":I
} // .end local v18 # "type":Ljava/lang/String;
} // :cond_4
/* iget v0, v10, Landroid/graphics/BitmapFactory$Options;->outWidth:I */
/* move/from16 v17, v0 */
/* .line 100 */
/* .restart local v17 # "rotatedWidth":I */
/* iget v0, v10, Landroid/graphics/BitmapFactory$Options;->outHeight:I */
/* move/from16 v16, v0 */
/* .restart local v16 # "rotatedHeight":I */
/* goto/16 :goto_0 */
/* .line 115 */
} // :cond_5
android.graphics.BitmapFactory .decodeStream ( v12 );
/* .restart local v1 # "srcBitmap":Landroid/graphics/Bitmap; */
/* .line 135 */
/* .restart local v9 # "baos":Ljava/io/ByteArrayOutputStream; */
/* .restart local v18 # "type":Ljava/lang/String; */
} // :cond_6
final String v2 = "image/jpg"; // const-string v2, "image/jpg"
/* move-object/from16 v0, v18 */
v2 = (( java.lang.String ) v0 ).equals ( v2 ); // invoke-virtual {v0, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
/* if-nez v2, :cond_7 */
final String v2 = "image/jpeg"; // const-string v2, "image/jpeg"
/* move-object/from16 v0, v18 */
v2 = (( java.lang.String ) v0 ).equals ( v2 ); // invoke-virtual {v0, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
if ( v2 != null) { // if-eqz v2, :cond_3
/* .line 136 */
} // :cond_7
v2 = android.graphics.Bitmap$CompressFormat.JPEG;
/* const/16 v3, 0x64 */
(( android.graphics.Bitmap ) v1 ).compress ( v2, v3, v9 ); // invoke-virtual {v1, v2, v3, v9}, Landroid/graphics/Bitmap;->compress(Landroid/graphics/Bitmap$CompressFormat;ILjava/io/OutputStream;)Z
} // .end method
