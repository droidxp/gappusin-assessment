public class com.mobfox.video.sdk.ResourceManager {
	 /* .source "ResourceManager.java" */
	 /* # annotations */
	 /* .annotation system Ldalvik/annotation/MemberClasses; */
	 /* value = { */
	 /* Lcom/mobfox/video/sdk/ResourceManager$FetchImageTask; */
	 /* } */
} // .end annotation
/* # static fields */
public static final java.lang.String BACK_ICON;
public static final java.lang.String BOTTOMBAR_BG;
public static final java.lang.String BROWSER_BUTTON_BG;
public static final java.lang.String BROWSER_BUTTON_BG_DISABLED;
public static final java.lang.String BROWSER_BUTTON_BG_DISABLED_SELECTED;
public static final java.lang.String BROWSER_BUTTON_BG_PRESSED;
public static final java.lang.String BROWSER_BUTTON_BG_SELECTED;
public static final Integer DEFAUL_BACK_BG_RESOURCE_ID;
public static final Integer DEFAUL_BACK_IMAGE_RESOURCE_ID;
public static final Integer DEFAUL_BOTTOMBAR_BG_RESOURCE_ID;
public static final Integer DEFAUL_EXTERNAL_BG_RESOURCE_ID;
public static final Integer DEFAUL_EXTERNAL_IMAGE_RESOURCE_ID;
public static final Integer DEFAUL_FORWARD_BG_RESOURCE_ID;
public static final Integer DEFAUL_FORWARD_IMAGE_RESOURCE_ID;
public static final Integer DEFAUL_PAUSE_BG_RESOURCE_ID;
public static final Integer DEFAUL_PAUSE_IMAGE_RESOURCE_ID;
public static final Integer DEFAUL_PLAY_BG_RESOURCE_ID;
public static final Integer DEFAUL_PLAY_IMAGE_RESOURCE_ID;
public static final Integer DEFAUL_RELOAD_BG_RESOURCE_ID;
public static final Integer DEFAUL_RELOAD_IMAGE_RESOURCE_ID;
public static final Integer DEFAUL_REPLAY_BG_RESOURCE_ID;
public static final Integer DEFAUL_REPLAY_IMAGE_RESOURCE_ID;
public static final Integer DEFAUL_SKIP_BG_RESOURCE_ID;
public static final Integer DEFAUL_SKIP_IMAGE_RESOURCE_ID;
public static final Integer DEFAUL_TOPBAR_BG_RESOURCE_ID;
public static final java.lang.String EXTERNAL_ICON;
public static final java.lang.String FORWARD_ICON;
public static final java.lang.String PAUSE_ICON;
public static final java.lang.String PLAY_ICON;
public static final java.lang.String RELOAD_ICON;
public static final java.lang.String REPLAY_ICON;
public static final Integer RESOURCE_LOADED_MSG;
public static final java.lang.String SKIP_BUTTON_BG;
public static final java.lang.String SKIP_BUTTON_BG_DISABLED;
public static final java.lang.String SKIP_BUTTON_BG_DISABLED_SELECTED;
public static final java.lang.String SKIP_BUTTON_BG_PRESSED;
public static final java.lang.String SKIP_BUTTON_BG_SELECTED;
public static final java.lang.String SKIP_ICON;
public static final java.lang.String TOPBAR_BG;
public static final Integer TYPE_FILE;
public static final Integer TYPE_UNKNOWN;
public static final Integer TYPE_ZIP;
public static final java.lang.String VERSION;
public static final java.lang.String VIDEO_BUTTON_BG;
public static final java.lang.String VIDEO_BUTTON_BG_DISABLED;
public static final java.lang.String VIDEO_BUTTON_BG_DISABLED_SELECTED;
public static final java.lang.String VIDEO_BUTTON_BG_PRESSED;
public static final java.lang.String VIDEO_BUTTON_BG_SELECTED;
public static Boolean sCancel;
public static org.apache.http.client.methods.HttpGet sDownloadGet;
public static Boolean sDownloading;
private static java.util.HashMap sResources;
/* .annotation system Ldalvik/annotation/Signature; */
/* value = { */
/* "Ljava/util/HashMap", */
/* "<", */
/* "Ljava/lang/Integer;", */
/* "Landroid/graphics/drawable/Drawable;", */
/* ">;" */
/* } */
} // .end annotation
} // .end field
/* # instance fields */
private android.content.Context mContext;
private android.os.Handler mHandler;
private java.util.HashMap mResources;
/* .annotation system Ldalvik/annotation/Signature; */
/* value = { */
/* "Ljava/util/HashMap", */
/* "<", */
/* "Ljava/lang/Integer;", */
/* "Landroid/graphics/drawable/Drawable;", */
/* ">;" */
/* } */
} // .end annotation
} // .end field
/* # direct methods */
static com.mobfox.video.sdk.ResourceManager ( ) {
/* .locals 1 */
/* .prologue */
int v0 = 0; // const/4 v0, 0x0
/* .line 39 */
com.mobfox.video.sdk.ResourceManager.sDownloading = (v0!= 0);
/* .line 40 */
com.mobfox.video.sdk.ResourceManager.sCancel = (v0!= 0);
/* .line 89 */
/* new-instance v0, Ljava/util/HashMap; */
/* invoke-direct {v0}, Ljava/util/HashMap;-><init>()V */
/* .line 33 */
return;
} // .end method
public com.mobfox.video.sdk.ResourceManager ( ) {
/* .locals 1 */
/* .param p1, "ctx" # Landroid/content/Context; */
/* .param p2, "h" # Landroid/os/Handler; */
/* .prologue */
/* .line 389 */
/* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
/* .line 91 */
/* new-instance v0, Ljava/util/HashMap; */
/* invoke-direct {v0}, Ljava/util/HashMap;-><init>()V */
this.mResources = v0;
/* .line 390 */
this.mContext = p1;
/* .line 391 */
this.mHandler = p2;
/* .line 392 */
return;
} // .end method
static android.os.Handler access$0 ( com.mobfox.video.sdk.ResourceManager p0 ) { //synthethic
/* .locals 1 */
/* .prologue */
/* .line 93 */
v0 = this.mHandler;
} // .end method
static java.util.HashMap access$1 ( com.mobfox.video.sdk.ResourceManager p0 ) { //synthethic
/* .locals 1 */
/* .prologue */
/* .line 91 */
v0 = this.mResources;
} // .end method
private static android.graphics.drawable.Drawable buildDrawable ( android.content.Context p0, java.lang.String p1 ) {
/* .locals 11 */
/* .param p0, "ctx" # Landroid/content/Context; */
/* .param p1, "name" # Ljava/lang/String; */
/* .prologue */
/* .line 276 */
int v5 = 0; // const/4 v5, 0x0
/* .line 278 */
/* .local v5, "in":Ljava/io/InputStream; */
try { // :try_start_0
(( java.lang.Object ) p0 ).getClass ( ); // invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;
(( java.lang.Class ) v8 ).getClassLoader ( ); // invoke-virtual {v8}, Ljava/lang/Class;->getClassLoader()Ljava/lang/ClassLoader;
/* .line 279 */
/* new-instance v9, Ljava/lang/StringBuilder; */
final String v10 = "defaultresources/"; // const-string v10, "defaultresources/"
/* invoke-direct {v9, v10}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V */
(( java.lang.StringBuilder ) v9 ).append ( p1 ); // invoke-virtual {v9, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v9 ).toString ( ); // invoke-virtual {v9}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
(( java.lang.ClassLoader ) v8 ).getResourceAsStream ( v9 ); // invoke-virtual {v8, v9}, Ljava/lang/ClassLoader;->getResourceAsStream(Ljava/lang/String;)Ljava/io/InputStream;
/* .line 281 */
android.graphics.BitmapFactory .decodeStream ( v5 );
/* .line 282 */
/* .local v0, "b":Landroid/graphics/Bitmap; */
if ( v0 != null) { // if-eqz v0, :cond_6
/* .line 284 */
(( android.content.Context ) p0 ).getResources ( ); // invoke-virtual {p0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;
(( android.content.res.Resources ) v8 ).getDisplayMetrics ( ); // invoke-virtual {v8}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;
/* .line 285 */
/* .local v6, "m":Landroid/util/DisplayMetrics; */
v7 = (( android.graphics.Bitmap ) v0 ).getWidth ( ); // invoke-virtual {v0}, Landroid/graphics/Bitmap;->getWidth()I
/* .line 286 */
/* .local v7, "w":I */
v2 = (( android.graphics.Bitmap ) v0 ).getHeight ( ); // invoke-virtual {v0}, Landroid/graphics/Bitmap;->getHeight()I
/* .line 288 */
/* .local v2, "h":I */
int v8 = 1; // const/4 v8, 0x1
/* int-to-float v9, v7 */
/* .line 287 */
v8 = android.util.TypedValue .applyDimension ( v8,v9,v6 );
/* float-to-int v4, v8 */
/* .line 290 */
/* .local v4, "imageWidth":I */
int v8 = 1; // const/4 v8, 0x1
/* int-to-float v9, v2 */
/* .line 289 */
v8 = android.util.TypedValue .applyDimension ( v8,v9,v6 );
/* float-to-int v3, v8 */
/* .line 291 */
/* .local v3, "imageHeight":I */
/* if-ne v4, v7, :cond_0 */
/* if-eq v3, v2, :cond_1 */
/* .line 293 */
} // :cond_0
int v8 = 0; // const/4 v8, 0x0
/* .line 292 */
android.graphics.Bitmap .createScaledBitmap ( v0,v4,v3,v8 );
/* .line 295 */
} // :cond_1
/* new-instance v8, Landroid/graphics/drawable/BitmapDrawable; */
(( android.content.Context ) p0 ).getResources ( ); // invoke-virtual {p0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;
/* invoke-direct {v8, v9, v0}, Landroid/graphics/drawable/BitmapDrawable;-><init>(Landroid/content/res/Resources;Landroid/graphics/Bitmap;)V */
/* :try_end_0 */
/* .catch Ljava/lang/Exception; {:try_start_0 ..:try_end_0} :catch_0 */
/* .catchall {:try_start_0 ..:try_end_0} :catchall_0 */
/* .line 303 */
if ( v5 != null) { // if-eqz v5, :cond_2
/* .line 305 */
try { // :try_start_1
(( java.io.InputStream ) v5 ).close ( ); // invoke-virtual {v5}, Ljava/io/InputStream;->close()V
/* :try_end_1 */
/* .catch Ljava/lang/Exception; {:try_start_1 ..:try_end_1} :catch_1 */
/* .line 306 */
int v5 = 0; // const/4 v5, 0x0
/* .line 311 */
} // .end local v0 # "b":Landroid/graphics/Bitmap;
} // .end local v2 # "h":I
} // .end local v3 # "imageHeight":I
} // .end local v4 # "imageWidth":I
} // .end local v6 # "m":Landroid/util/DisplayMetrics;
} // .end local v7 # "w":I
} // :cond_2
} // :goto_0
/* .line 297 */
/* :catch_0 */
/* move-exception v1 */
/* .line 298 */
/* .local v1, "e":Ljava/lang/Exception; */
try { // :try_start_2
final String v8 = "MOBFOX"; // const-string v8, "MOBFOX"
int v9 = 4; // const/4 v9, 0x4
v8 = android.util.Log .isLoggable ( v8,v9 );
if ( v8 != null) { // if-eqz v8, :cond_3
/* .line 299 */
final String v8 = "MOBFOX"; // const-string v8, "MOBFOX"
/* new-instance v9, Ljava/lang/StringBuilder; */
final String v10 = "MobFox ResourceManager cannot find resource "; // const-string v10, "MobFox ResourceManager cannot find resource "
/* invoke-direct {v9, v10}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V */
/* .line 300 */
(( java.lang.StringBuilder ) v9 ).append ( p1 ); // invoke-virtual {v9, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v9 ).toString ( ); // invoke-virtual {v9}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
/* .line 299 */
android.util.Log .i ( v8,v9 );
/* :try_end_2 */
/* .catchall {:try_start_2 ..:try_end_2} :catchall_0 */
/* .line 303 */
} // :cond_3
if ( v5 != null) { // if-eqz v5, :cond_4
/* .line 305 */
try { // :try_start_3
(( java.io.InputStream ) v5 ).close ( ); // invoke-virtual {v5}, Ljava/io/InputStream;->close()V
/* :try_end_3 */
/* .catch Ljava/lang/Exception; {:try_start_3 ..:try_end_3} :catch_2 */
/* .line 306 */
int v5 = 0; // const/4 v5, 0x0
/* .line 311 */
} // .end local v1 # "e":Ljava/lang/Exception;
} // :cond_4
} // :goto_1
int v8 = 0; // const/4 v8, 0x0
/* .line 302 */
/* :catchall_0 */
/* move-exception v8 */
/* .line 303 */
if ( v5 != null) { // if-eqz v5, :cond_5
/* .line 305 */
try { // :try_start_4
(( java.io.InputStream ) v5 ).close ( ); // invoke-virtual {v5}, Ljava/io/InputStream;->close()V
/* :try_end_4 */
/* .catch Ljava/lang/Exception; {:try_start_4 ..:try_end_4} :catch_3 */
/* .line 306 */
int v5 = 0; // const/4 v5, 0x0
/* .line 310 */
} // :cond_5
} // :goto_2
/* throw v8 */
/* .line 303 */
/* .restart local v0 # "b":Landroid/graphics/Bitmap; */
} // :cond_6
if ( v5 != null) { // if-eqz v5, :cond_4
/* .line 305 */
try { // :try_start_5
(( java.io.InputStream ) v5 ).close ( ); // invoke-virtual {v5}, Ljava/io/InputStream;->close()V
/* :try_end_5 */
/* .catch Ljava/lang/Exception; {:try_start_5 ..:try_end_5} :catch_4 */
/* .line 306 */
int v5 = 0; // const/4 v5, 0x0
/* .line 307 */
/* .restart local v2 # "h":I */
/* .restart local v3 # "imageHeight":I */
/* .restart local v4 # "imageWidth":I */
/* .restart local v6 # "m":Landroid/util/DisplayMetrics; */
/* .restart local v7 # "w":I */
/* :catch_1 */
/* move-exception v9 */
} // .end local v0 # "b":Landroid/graphics/Bitmap;
} // .end local v2 # "h":I
} // .end local v3 # "imageHeight":I
} // .end local v4 # "imageWidth":I
} // .end local v6 # "m":Landroid/util/DisplayMetrics;
} // .end local v7 # "w":I
/* .restart local v1 # "e":Ljava/lang/Exception; */
/* :catch_2 */
/* move-exception v8 */
} // .end local v1 # "e":Ljava/lang/Exception;
/* :catch_3 */
/* move-exception v9 */
/* .restart local v0 # "b":Landroid/graphics/Bitmap; */
/* :catch_4 */
/* move-exception v8 */
} // .end method
private static android.graphics.drawable.Drawable buildNinePatchDrawable ( android.content.Context p0, java.lang.String p1 ) {
/* .locals 14 */
/* .param p0, "ctx" # Landroid/content/Context; */
/* .param p1, "name" # Ljava/lang/String; */
/* .prologue */
int v13 = 0; // const/4 v13, 0x0
/* .line 231 */
int v10 = 0; // const/4 v10, 0x0
/* .line 233 */
/* .local v10, "in":Ljava/io/InputStream; */
try { // :try_start_0
(( java.lang.Object ) p0 ).getClass ( ); // invoke-virtual {p0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;
(( java.lang.Class ) v0 ).getClassLoader ( ); // invoke-virtual {v0}, Ljava/lang/Class;->getClassLoader()Ljava/lang/ClassLoader;
/* .line 234 */
/* new-instance v1, Ljava/lang/StringBuilder; */
final String v4 = "defaultresources/"; // const-string v4, "defaultresources/"
/* invoke-direct {v1, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V */
(( java.lang.StringBuilder ) v1 ).append ( p1 ); // invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v1 ).toString ( ); // invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
(( java.lang.ClassLoader ) v0 ).getResourceAsStream ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/ClassLoader;->getResourceAsStream(Ljava/lang/String;)Ljava/io/InputStream;
/* .line 236 */
android.graphics.BitmapFactory .decodeStream ( v10 );
/* .line 237 */
/* .local v2, "b":Landroid/graphics/Bitmap; */
if ( v2 != null) { // if-eqz v2, :cond_7
/* .line 238 */
(( android.graphics.Bitmap ) v2 ).getNinePatchChunk ( ); // invoke-virtual {v2}, Landroid/graphics/Bitmap;->getNinePatchChunk()[B
/* .line 239 */
/* .local v3, "chunk":[B */
v0 = android.graphics.NinePatch .isNinePatchChunk ( v3 );
if ( v0 != null) { // if-eqz v0, :cond_1
/* .line 240 */
/* new-instance v0, Landroid/graphics/drawable/NinePatchDrawable; */
(( android.content.Context ) p0 ).getResources ( ); // invoke-virtual {p0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;
/* .line 241 */
/* new-instance v4, Landroid/graphics/Rect; */
/* invoke-direct {v4}, Landroid/graphics/Rect;-><init>()V */
int v5 = 0; // const/4 v5, 0x0
/* .line 240 */
/* invoke-direct/range {v0 ..v5}, Landroid/graphics/drawable/NinePatchDrawable;-><init>(Landroid/content/res/Resources;Landroid/graphics/Bitmap;[BLandroid/graphics/Rect;Ljava/lang/String;)V */
/* :try_end_0 */
/* .catch Ljava/lang/Exception; {:try_start_0 ..:try_end_0} :catch_0 */
/* .catchall {:try_start_0 ..:try_end_0} :catchall_0 */
/* .line 263 */
if ( v10 != null) { // if-eqz v10, :cond_0
/* .line 265 */
try { // :try_start_1
(( java.io.InputStream ) v10 ).close ( ); // invoke-virtual {v10}, Ljava/io/InputStream;->close()V
/* :try_end_1 */
/* .catch Ljava/lang/Exception; {:try_start_1 ..:try_end_1} :catch_1 */
/* .line 266 */
int v10 = 0; // const/4 v10, 0x0
/* .line 271 */
} // .end local v2 # "b":Landroid/graphics/Bitmap;
} // .end local v3 # "chunk":[B
} // :cond_0
} // :goto_0
/* .line 243 */
/* .restart local v2 # "b":Landroid/graphics/Bitmap; */
/* .restart local v3 # "chunk":[B */
} // :cond_1
try { // :try_start_2
(( android.content.Context ) p0 ).getResources ( ); // invoke-virtual {p0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;
(( android.content.res.Resources ) v0 ).getDisplayMetrics ( ); // invoke-virtual {v0}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;
/* .line 244 */
/* .local v11, "m":Landroid/util/DisplayMetrics; */
v12 = (( android.graphics.Bitmap ) v2 ).getWidth ( ); // invoke-virtual {v2}, Landroid/graphics/Bitmap;->getWidth()I
/* .line 245 */
/* .local v12, "w":I */
v7 = (( android.graphics.Bitmap ) v2 ).getHeight ( ); // invoke-virtual {v2}, Landroid/graphics/Bitmap;->getHeight()I
/* .line 247 */
/* .local v7, "h":I */
int v0 = 1; // const/4 v0, 0x1
/* int-to-float v1, v12 */
/* .line 246 */
v0 = android.util.TypedValue .applyDimension ( v0,v1,v11 );
/* float-to-int v9, v0 */
/* .line 249 */
/* .local v9, "imageWidth":I */
int v0 = 1; // const/4 v0, 0x1
/* int-to-float v1, v7 */
/* .line 248 */
v0 = android.util.TypedValue .applyDimension ( v0,v1,v11 );
/* float-to-int v8, v0 */
/* .line 250 */
/* .local v8, "imageHeight":I */
/* if-ne v9, v12, :cond_2 */
/* if-eq v8, v7, :cond_3 */
/* .line 252 */
} // :cond_2
int v0 = 0; // const/4 v0, 0x0
/* .line 251 */
android.graphics.Bitmap .createScaledBitmap ( v2,v9,v8,v0 );
/* .line 254 */
} // :cond_3
/* new-instance v0, Landroid/graphics/drawable/BitmapDrawable; */
(( android.content.Context ) p0 ).getResources ( ); // invoke-virtual {p0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;
/* invoke-direct {v0, v1, v2}, Landroid/graphics/drawable/BitmapDrawable;-><init>(Landroid/content/res/Resources;Landroid/graphics/Bitmap;)V */
/* :try_end_2 */
/* .catch Ljava/lang/Exception; {:try_start_2 ..:try_end_2} :catch_0 */
/* .catchall {:try_start_2 ..:try_end_2} :catchall_0 */
/* .line 263 */
if ( v10 != null) { // if-eqz v10, :cond_0
/* .line 265 */
try { // :try_start_3
(( java.io.InputStream ) v10 ).close ( ); // invoke-virtual {v10}, Ljava/io/InputStream;->close()V
/* :try_end_3 */
/* .catch Ljava/lang/Exception; {:try_start_3 ..:try_end_3} :catch_2 */
/* .line 266 */
int v10 = 0; // const/4 v10, 0x0
/* .line 257 */
} // .end local v2 # "b":Landroid/graphics/Bitmap;
} // .end local v3 # "chunk":[B
} // .end local v7 # "h":I
} // .end local v8 # "imageHeight":I
} // .end local v9 # "imageWidth":I
} // .end local v11 # "m":Landroid/util/DisplayMetrics;
} // .end local v12 # "w":I
/* :catch_0 */
/* move-exception v6 */
/* .line 258 */
/* .local v6, "e":Ljava/lang/Exception; */
try { // :try_start_4
final String v0 = "MOBFOX"; // const-string v0, "MOBFOX"
int v1 = 3; // const/4 v1, 0x3
v0 = android.util.Log .isLoggable ( v0,v1 );
if ( v0 != null) { // if-eqz v0, :cond_4
/* .line 259 */
final String v0 = "MOBFOX"; // const-string v0, "MOBFOX"
/* new-instance v1, Ljava/lang/StringBuilder; */
final String v4 = "MobFox ResourceManager cannot find resource "; // const-string v4, "MobFox ResourceManager cannot find resource "
/* invoke-direct {v1, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V */
/* .line 260 */
(( java.lang.StringBuilder ) v1 ).append ( p1 ); // invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v1 ).toString ( ); // invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
/* .line 259 */
android.util.Log .d ( v0,v1 );
/* :try_end_4 */
/* .catchall {:try_start_4 ..:try_end_4} :catchall_0 */
/* .line 263 */
} // :cond_4
if ( v10 != null) { // if-eqz v10, :cond_5
/* .line 265 */
try { // :try_start_5
(( java.io.InputStream ) v10 ).close ( ); // invoke-virtual {v10}, Ljava/io/InputStream;->close()V
/* :try_end_5 */
/* .catch Ljava/lang/Exception; {:try_start_5 ..:try_end_5} :catch_3 */
/* .line 266 */
int v10 = 0; // const/4 v10, 0x0
} // .end local v6 # "e":Ljava/lang/Exception;
} // :cond_5
} // :goto_1
/* move-object v0, v13 */
/* .line 271 */
/* .line 262 */
/* :catchall_0 */
/* move-exception v0 */
/* .line 263 */
if ( v10 != null) { // if-eqz v10, :cond_6
/* .line 265 */
try { // :try_start_6
(( java.io.InputStream ) v10 ).close ( ); // invoke-virtual {v10}, Ljava/io/InputStream;->close()V
/* :try_end_6 */
/* .catch Ljava/lang/Exception; {:try_start_6 ..:try_end_6} :catch_4 */
/* .line 266 */
int v10 = 0; // const/4 v10, 0x0
/* .line 270 */
} // :cond_6
} // :goto_2
/* throw v0 */
/* .line 263 */
/* .restart local v2 # "b":Landroid/graphics/Bitmap; */
} // :cond_7
if ( v10 != null) { // if-eqz v10, :cond_5
/* .line 265 */
try { // :try_start_7
(( java.io.InputStream ) v10 ).close ( ); // invoke-virtual {v10}, Ljava/io/InputStream;->close()V
/* :try_end_7 */
/* .catch Ljava/lang/Exception; {:try_start_7 ..:try_end_7} :catch_5 */
/* .line 266 */
int v10 = 0; // const/4 v10, 0x0
/* .line 267 */
/* .restart local v3 # "chunk":[B */
/* :catch_1 */
/* move-exception v1 */
/* .restart local v7 # "h":I */
/* .restart local v8 # "imageHeight":I */
/* .restart local v9 # "imageWidth":I */
/* .restart local v11 # "m":Landroid/util/DisplayMetrics; */
/* .restart local v12 # "w":I */
/* :catch_2 */
/* move-exception v1 */
} // .end local v2 # "b":Landroid/graphics/Bitmap;
} // .end local v3 # "chunk":[B
} // .end local v7 # "h":I
} // .end local v8 # "imageHeight":I
} // .end local v9 # "imageWidth":I
} // .end local v11 # "m":Landroid/util/DisplayMetrics;
} // .end local v12 # "w":I
/* .restart local v6 # "e":Ljava/lang/Exception; */
/* :catch_3 */
/* move-exception v0 */
} // .end local v6 # "e":Ljava/lang/Exception;
/* :catch_4 */
/* move-exception v1 */
/* .restart local v2 # "b":Landroid/graphics/Bitmap; */
/* :catch_5 */
/* move-exception v0 */
} // .end method
public static void cancel ( ) {
/* .locals 1 */
/* .prologue */
/* .line 381 */
int v0 = 1; // const/4 v0, 0x1
com.mobfox.video.sdk.ResourceManager.sCancel = (v0!= 0);
/* .line 382 */
v0 = com.mobfox.video.sdk.ResourceManager.sDownloadGet;
if ( v0 != null) { // if-eqz v0, :cond_0
/* .line 383 */
v0 = com.mobfox.video.sdk.ResourceManager.sDownloadGet;
(( org.apache.http.client.methods.HttpGet ) v0 ).abort ( ); // invoke-virtual {v0}, Lorg/apache/http/client/methods/HttpGet;->abort()V
/* .line 384 */
int v0 = 0; // const/4 v0, 0x0
/* .line 386 */
} // :cond_0
v0 = com.mobfox.video.sdk.ResourceManager.sResources;
(( java.util.HashMap ) v0 ).clear ( ); // invoke-virtual {v0}, Ljava/util/HashMap;->clear()V
/* .line 387 */
return;
} // .end method
public static void downloadResources ( android.content.Context p0, java.lang.String p1, Boolean p2 ) {
/* .locals 2 */
/* .param p0, "ctx" # Landroid/content/Context; */
/* .param p1, "userAgent" # Ljava/lang/String; */
/* .param p2, "force" # Z */
/* .prologue */
/* .line 360 */
final String v0 = "mofix"; // const-string v0, "mofix"
final String v1 = "loading_res"; // const-string v1, "loading_res"
android.util.Log .i ( v0,v1 );
/* .line 361 */
com.mobfox.video.sdk.ResourceManager .initDefaultResources ( p0 );
/* .line 362 */
return;
} // .end method
public static android.graphics.drawable.Drawable getDefaultResource ( Integer p0 ) {
/* .locals 2 */
/* .param p0, "resId" # I */
/* .prologue */
/* .line 96 */
v0 = com.mobfox.video.sdk.ResourceManager.sResources;
java.lang.Integer .valueOf ( p0 );
(( java.util.HashMap ) v0 ).get ( v1 ); // invoke-virtual {v0, v1}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;
/* check-cast v0, Landroid/graphics/drawable/Drawable; */
} // .end method
public static Long getInstalledVersion ( android.content.Context p0 ) {
/* .locals 9 */
/* .param p0, "ctx" # Landroid/content/Context; */
/* .prologue */
/* .line 114 */
/* const-wide/16 v3, -0x1 */
/* .line 115 */
/* .local v3, "result":J */
int v0 = 0; // const/4 v0, 0x0
/* .line 117 */
/* .local v0, "in":Ljava/io/FileInputStream; */
try { // :try_start_0
final String v6 = "mobfox_version.txt"; // const-string v6, "mobfox_version.txt"
(( android.content.Context ) p0 ).openFileInput ( v6 ); // invoke-virtual {p0, v6}, Landroid/content/Context;->openFileInput(Ljava/lang/String;)Ljava/io/FileInputStream;
/* .line 118 */
/* new-instance v1, Ljava/io/InputStreamReader; */
final String v6 = "UTF-8"; // const-string v6, "UTF-8"
/* invoke-direct {v1, v0, v6}, Ljava/io/InputStreamReader;-><init>(Ljava/io/InputStream;Ljava/lang/String;)V */
/* .line 119 */
/* .local v1, "isr":Ljava/io/InputStreamReader; */
/* new-instance v2, Ljava/io/BufferedReader; */
/* invoke-direct {v2, v1}, Ljava/io/BufferedReader;-><init>(Ljava/io/Reader;)V */
/* .line 120 */
/* .local v2, "reader":Ljava/io/BufferedReader; */
(( java.io.BufferedReader ) v2 ).readLine ( ); // invoke-virtual {v2}, Ljava/io/BufferedReader;->readLine()Ljava/lang/String;
/* .line 121 */
/* .local v5, "version":Ljava/lang/String; */
java.lang.Long .valueOf ( v5 );
(( java.lang.Long ) v6 ).longValue ( ); // invoke-virtual {v6}, Ljava/lang/Long;->longValue()J
/* :try_end_0 */
/* .catch Ljava/lang/Exception; {:try_start_0 ..:try_end_0} :catch_0 */
/* .catchall {:try_start_0 ..:try_end_0} :catchall_0 */
/* move-result-wide v3 */
/* .line 125 */
if ( v0 != null) { // if-eqz v0, :cond_0
/* .line 127 */
try { // :try_start_1
(( java.io.FileInputStream ) v0 ).close ( ); // invoke-virtual {v0}, Ljava/io/FileInputStream;->close()V
/* :try_end_1 */
/* .catch Ljava/lang/Exception; {:try_start_1 ..:try_end_1} :catch_3 */
/* .line 133 */
} // .end local v1 # "isr":Ljava/io/InputStreamReader;
} // .end local v2 # "reader":Ljava/io/BufferedReader;
} // .end local v5 # "version":Ljava/lang/String;
} // :cond_0
} // :goto_0
final String v6 = "MOBFOX"; // const-string v6, "MOBFOX"
int v7 = 3; // const/4 v7, 0x3
v6 = android.util.Log .isLoggable ( v6,v7 );
if ( v6 != null) { // if-eqz v6, :cond_1
/* .line 134 */
final String v6 = "MOBFOX"; // const-string v6, "MOBFOX"
/* new-instance v7, Ljava/lang/StringBuilder; */
final String v8 = "MobFox Resources installed version:"; // const-string v8, "MobFox Resources installed version:"
/* invoke-direct {v7, v8}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V */
(( java.lang.StringBuilder ) v7 ).append ( v3, v4 ); // invoke-virtual {v7, v3, v4}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v7 ).toString ( ); // invoke-virtual {v7}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
android.util.Log .d ( v6,v7 );
/* .line 136 */
} // :cond_1
/* return-wide v3 */
/* .line 122 */
/* :catch_0 */
/* move-exception v6 */
/* .line 125 */
if ( v0 != null) { // if-eqz v0, :cond_0
/* .line 127 */
try { // :try_start_2
(( java.io.FileInputStream ) v0 ).close ( ); // invoke-virtual {v0}, Ljava/io/FileInputStream;->close()V
/* :try_end_2 */
/* .catch Ljava/lang/Exception; {:try_start_2 ..:try_end_2} :catch_1 */
/* .line 128 */
/* :catch_1 */
/* move-exception v6 */
/* .line 124 */
/* :catchall_0 */
/* move-exception v6 */
/* .line 125 */
if ( v0 != null) { // if-eqz v0, :cond_2
/* .line 127 */
try { // :try_start_3
(( java.io.FileInputStream ) v0 ).close ( ); // invoke-virtual {v0}, Ljava/io/FileInputStream;->close()V
/* :try_end_3 */
/* .catch Ljava/lang/Exception; {:try_start_3 ..:try_end_3} :catch_2 */
/* .line 132 */
} // :cond_2
} // :goto_1
/* throw v6 */
/* .line 128 */
/* :catch_2 */
/* move-exception v7 */
/* .restart local v1 # "isr":Ljava/io/InputStreamReader; */
/* .restart local v2 # "reader":Ljava/io/BufferedReader; */
/* .restart local v5 # "version":Ljava/lang/String; */
/* :catch_3 */
/* move-exception v6 */
} // .end method
private static void initDefaultResources ( android.content.Context p0 ) {
/* .locals 7 */
/* .param p0, "ctx" # Landroid/content/Context; */
/* .prologue */
int v3 = 0; // const/4 v3, 0x0
/* .line 160 */
v0 = com.mobfox.video.sdk.ResourceManager.sResources;
v0 = (( java.util.HashMap ) v0 ).size ( ); // invoke-virtual {v0}, Ljava/util/HashMap;->size()I
/* if-lez v0, :cond_1 */
/* .line 161 */
final String v0 = "MOBFOX"; // const-string v0, "MOBFOX"
int v1 = 4; // const/4 v1, 0x4
v0 = android.util.Log .isLoggable ( v0,v1 );
if ( v0 != null) { // if-eqz v0, :cond_0
/* .line 162 */
final String v0 = "MOBFOX"; // const-string v0, "MOBFOX"
/* .line 163 */
final String v1 = "MobFox ResourceManager default resources already intialized"; // const-string v1, "MobFox ResourceManager default resources already intialized"
/* .line 162 */
android.util.Log .i ( v0,v1 );
/* .line 217 */
} // :cond_0
} // :goto_0
return;
/* .line 168 */
} // :cond_1
/* const/16 v0, -0xb */
final String v1 = "mobfox_video_play.png"; // const-string v1, "mobfox_video_play.png"
com.mobfox.video.sdk.ResourceManager .registerImageResource ( p0,v0,v1 );
/* .line 169 */
/* const/16 v0, -0xc */
final String v1 = "mobfox_video_pause.png"; // const-string v1, "mobfox_video_pause.png"
com.mobfox.video.sdk.ResourceManager .registerImageResource ( p0,v0,v1 );
/* .line 170 */
/* const/16 v0, -0xd */
final String v1 = "mobfox_video_replay.png"; // const-string v1, "mobfox_video_replay.png"
com.mobfox.video.sdk.ResourceManager .registerImageResource ( p0,v0,v1 );
/* .line 171 */
/* const/16 v0, -0xe */
final String v1 = "mobfox_browser_back.png"; // const-string v1, "mobfox_browser_back.png"
com.mobfox.video.sdk.ResourceManager .registerImageResource ( p0,v0,v1 );
/* .line 172 */
/* const/16 v0, -0xf */
/* .line 173 */
final String v1 = "mobfox_browser_forward.png"; // const-string v1, "mobfox_browser_forward.png"
/* .line 172 */
com.mobfox.video.sdk.ResourceManager .registerImageResource ( p0,v0,v1 );
/* .line 174 */
/* const/16 v0, -0x10 */
final String v1 = "mobfox_video_replay.png"; // const-string v1, "mobfox_video_replay.png"
com.mobfox.video.sdk.ResourceManager .registerImageResource ( p0,v0,v1 );
/* .line 175 */
/* const/16 v0, -0x11 */
/* .line 176 */
final String v1 = "mobfox_browser_external.png"; // const-string v1, "mobfox_browser_external.png"
/* .line 175 */
com.mobfox.video.sdk.ResourceManager .registerImageResource ( p0,v0,v1 );
/* .line 177 */
/* const/16 v0, -0x12 */
final String v1 = "mobfox_skip.png"; // const-string v1, "mobfox_skip.png"
com.mobfox.video.sdk.ResourceManager .registerImageResource ( p0,v0,v1 );
/* .line 179 */
int v1 = -1; // const/4 v1, -0x1
/* .line 180 */
final String v2 = "mobfox_bar.png"; // const-string v2, "mobfox_bar.png"
/* move-object v0, p0 */
/* move-object v4, v3 */
/* move-object v5, v3 */
/* move-object v6, v3 */
/* .line 179 */
/* invoke-static/range {v0 ..v6}, Lcom/mobfox/video/sdk/ResourceManager;->registerBackgroundResource(Landroid/content/Context;ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V */
/* .line 182 */
int v1 = -2; // const/4 v1, -0x2
/* .line 183 */
final String v2 = "mobfox_bar.png"; // const-string v2, "mobfox_bar.png"
/* move-object v0, p0 */
/* move-object v4, v3 */
/* move-object v5, v3 */
/* move-object v6, v3 */
/* .line 182 */
/* invoke-static/range {v0 ..v6}, Lcom/mobfox/video/sdk/ResourceManager;->registerBackgroundResource(Landroid/content/Context;ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V */
/* .line 185 */
int v1 = -3; // const/4 v1, -0x3
/* .line 186 */
final String v2 = "mobfox_videobutton_bg.9.png"; // const-string v2, "mobfox_videobutton_bg.9.png"
final String v3 = "mobfox_videobutton_bg_pressed.9.png"; // const-string v3, "mobfox_videobutton_bg_pressed.9.png"
/* .line 187 */
final String v4 = "mobfox_videobutton_bg_selected.9.png"; // const-string v4, "mobfox_videobutton_bg_selected.9.png"
final String v5 = "mobfox_videobutton_bg_disabled.9.png"; // const-string v5, "mobfox_videobutton_bg_disabled.9.png"
/* .line 188 */
final String v6 = "mobfox_videobutton_bg_disabled_selected.9.png"; // const-string v6, "mobfox_videobutton_bg_disabled_selected.9.png"
/* move-object v0, p0 */
/* .line 185 */
/* invoke-static/range {v0 ..v6}, Lcom/mobfox/video/sdk/ResourceManager;->registerBackgroundResource(Landroid/content/Context;ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V */
/* .line 189 */
int v1 = -4; // const/4 v1, -0x4
/* .line 190 */
final String v2 = "mobfox_videobutton_bg.9.png"; // const-string v2, "mobfox_videobutton_bg.9.png"
final String v3 = "mobfox_videobutton_bg_pressed.9.png"; // const-string v3, "mobfox_videobutton_bg_pressed.9.png"
/* .line 191 */
final String v4 = "mobfox_videobutton_bg_selected.9.png"; // const-string v4, "mobfox_videobutton_bg_selected.9.png"
final String v5 = "mobfox_videobutton_bg_disabled.9.png"; // const-string v5, "mobfox_videobutton_bg_disabled.9.png"
/* .line 192 */
final String v6 = "mobfox_videobutton_bg_disabled_selected.9.png"; // const-string v6, "mobfox_videobutton_bg_disabled_selected.9.png"
/* move-object v0, p0 */
/* .line 189 */
/* invoke-static/range {v0 ..v6}, Lcom/mobfox/video/sdk/ResourceManager;->registerBackgroundResource(Landroid/content/Context;ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V */
/* .line 193 */
int v1 = -5; // const/4 v1, -0x5
/* .line 194 */
final String v2 = "mobfox_videobutton_bg.9.png"; // const-string v2, "mobfox_videobutton_bg.9.png"
final String v3 = "mobfox_videobutton_bg_pressed.9.png"; // const-string v3, "mobfox_videobutton_bg_pressed.9.png"
/* .line 195 */
final String v4 = "mobfox_videobutton_bg_selected.9.png"; // const-string v4, "mobfox_videobutton_bg_selected.9.png"
final String v5 = "mobfox_videobutton_bg_disabled.9.png"; // const-string v5, "mobfox_videobutton_bg_disabled.9.png"
/* .line 196 */
final String v6 = "mobfox_videobutton_bg_disabled_selected.9.png"; // const-string v6, "mobfox_videobutton_bg_disabled_selected.9.png"
/* move-object v0, p0 */
/* .line 193 */
/* invoke-static/range {v0 ..v6}, Lcom/mobfox/video/sdk/ResourceManager;->registerBackgroundResource(Landroid/content/Context;ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V */
/* .line 197 */
/* const/16 v1, -0x9 */
/* .line 198 */
final String v2 = "mobfox_browserbutton_bg.9.png"; // const-string v2, "mobfox_browserbutton_bg.9.png"
final String v3 = "mobfox_browserbutton_bg_pressed.9.png"; // const-string v3, "mobfox_browserbutton_bg_pressed.9.png"
/* .line 199 */
final String v4 = "mobfox_browserbutton_bg_selected.9.png"; // const-string v4, "mobfox_browserbutton_bg_selected.9.png"
final String v5 = "mobfox_browserbutton_bg_disabled.9.png"; // const-string v5, "mobfox_browserbutton_bg_disabled.9.png"
/* .line 200 */
final String v6 = "mobfox_browserbutton_bg_disabled_selected.9.png"; // const-string v6, "mobfox_browserbutton_bg_disabled_selected.9.png"
/* move-object v0, p0 */
/* .line 197 */
/* invoke-static/range {v0 ..v6}, Lcom/mobfox/video/sdk/ResourceManager;->registerBackgroundResource(Landroid/content/Context;ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V */
/* .line 201 */
int v1 = -6; // const/4 v1, -0x6
/* .line 202 */
final String v2 = "mobfox_browserbutton_bg.9.png"; // const-string v2, "mobfox_browserbutton_bg.9.png"
final String v3 = "mobfox_browserbutton_bg_pressed.9.png"; // const-string v3, "mobfox_browserbutton_bg_pressed.9.png"
/* .line 203 */
final String v4 = "mobfox_browserbutton_bg_selected.9.png"; // const-string v4, "mobfox_browserbutton_bg_selected.9.png"
final String v5 = "mobfox_browserbutton_bg_disabled.9.png"; // const-string v5, "mobfox_browserbutton_bg_disabled.9.png"
/* .line 204 */
final String v6 = "mobfox_browserbutton_bg_disabled_selected.9.png"; // const-string v6, "mobfox_browserbutton_bg_disabled_selected.9.png"
/* move-object v0, p0 */
/* .line 201 */
/* invoke-static/range {v0 ..v6}, Lcom/mobfox/video/sdk/ResourceManager;->registerBackgroundResource(Landroid/content/Context;ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V */
/* .line 205 */
int v1 = -7; // const/4 v1, -0x7
/* .line 206 */
final String v2 = "mobfox_browserbutton_bg.9.png"; // const-string v2, "mobfox_browserbutton_bg.9.png"
final String v3 = "mobfox_browserbutton_bg_pressed.9.png"; // const-string v3, "mobfox_browserbutton_bg_pressed.9.png"
/* .line 207 */
final String v4 = "mobfox_browserbutton_bg_selected.9.png"; // const-string v4, "mobfox_browserbutton_bg_selected.9.png"
final String v5 = "mobfox_browserbutton_bg_disabled.9.png"; // const-string v5, "mobfox_browserbutton_bg_disabled.9.png"
/* .line 208 */
final String v6 = "mobfox_browserbutton_bg_disabled_selected.9.png"; // const-string v6, "mobfox_browserbutton_bg_disabled_selected.9.png"
/* move-object v0, p0 */
/* .line 205 */
/* invoke-static/range {v0 ..v6}, Lcom/mobfox/video/sdk/ResourceManager;->registerBackgroundResource(Landroid/content/Context;ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V */
/* .line 209 */
int v1 = -8; // const/4 v1, -0x8
/* .line 210 */
final String v2 = "mobfox_browserbutton_bg.9.png"; // const-string v2, "mobfox_browserbutton_bg.9.png"
final String v3 = "mobfox_browserbutton_bg_pressed.9.png"; // const-string v3, "mobfox_browserbutton_bg_pressed.9.png"
/* .line 211 */
final String v4 = "mobfox_browserbutton_bg_selected.9.png"; // const-string v4, "mobfox_browserbutton_bg_selected.9.png"
final String v5 = "mobfox_browserbutton_bg_disabled.9.png"; // const-string v5, "mobfox_browserbutton_bg_disabled.9.png"
/* .line 212 */
final String v6 = "mobfox_browserbutton_bg_disabled_selected.9.png"; // const-string v6, "mobfox_browserbutton_bg_disabled_selected.9.png"
/* move-object v0, p0 */
/* .line 209 */
/* invoke-static/range {v0 ..v6}, Lcom/mobfox/video/sdk/ResourceManager;->registerBackgroundResource(Landroid/content/Context;ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V */
/* .line 213 */
/* const/16 v1, -0xa */
/* .line 214 */
final String v2 = "mobfox_skipbutton_bg.9.png"; // const-string v2, "mobfox_skipbutton_bg.9.png"
final String v3 = "mobfox_skipbutton_bg_pressed.9.png"; // const-string v3, "mobfox_skipbutton_bg_pressed.9.png"
/* .line 215 */
final String v4 = "mobfox_skipbutton_bg_selected.9.png"; // const-string v4, "mobfox_skipbutton_bg_selected.9.png"
final String v5 = "mobfox_skipbutton_bg_disabled.9.png"; // const-string v5, "mobfox_skipbutton_bg_disabled.9.png"
/* .line 216 */
final String v6 = "mobfox_skipbutton_bg_disabled_selected.9.png"; // const-string v6, "mobfox_skipbutton_bg_disabled_selected.9.png"
/* move-object v0, p0 */
/* .line 213 */
/* invoke-static/range {v0 ..v6}, Lcom/mobfox/video/sdk/ResourceManager;->registerBackgroundResource(Landroid/content/Context;ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V */
/* goto/16 :goto_0 */
} // .end method
public static Boolean isDownloading ( ) {
/* .locals 1 */
/* .prologue */
/* .line 355 */
/* sget-boolean v0, Lcom/mobfox/video/sdk/ResourceManager;->sDownloading:Z */
} // .end method
private static void registerBackgroundResource ( android.content.Context p0, Integer p1, java.lang.String p2, java.lang.String p3, java.lang.String p4, java.lang.String p5, java.lang.String p6 ) {
/* .locals 7 */
/* .param p0, "ctx" # Landroid/content/Context; */
/* .param p1, "resId" # I */
/* .param p2, "normal" # Ljava/lang/String; */
/* .param p3, "pressed" # Ljava/lang/String; */
/* .param p4, "selected" # Ljava/lang/String; */
/* .param p5, "disabled" # Ljava/lang/String; */
/* .param p6, "disabled_selected" # Ljava/lang/String; */
/* .prologue */
int v6 = 1; // const/4 v6, 0x1
int v5 = 0; // const/4 v5, 0x0
/* .line 317 */
int v1 = 0; // const/4 v1, 0x0
/* .line 318 */
/* .local v1, "found":Z */
/* new-instance v2, Landroid/graphics/drawable/StateListDrawable; */
/* invoke-direct {v2}, Landroid/graphics/drawable/StateListDrawable;-><init>()V */
/* .line 319 */
/* .local v2, "states":Landroid/graphics/drawable/StateListDrawable; */
int v0 = 0; // const/4 v0, 0x0
/* .line 320 */
/* .local v0, "d":Landroid/graphics/drawable/Drawable; */
com.mobfox.video.sdk.ResourceManager .buildNinePatchDrawable ( p0,p3 );
/* .line 321 */
if ( v0 != null) { // if-eqz v0, :cond_0
/* .line 322 */
int v1 = 1; // const/4 v1, 0x1
/* .line 323 */
/* new-array v3, v6, [I */
/* const v4, 0x10100a7 */
/* aput v4, v3, v5 */
(( android.graphics.drawable.StateListDrawable ) v2 ).addState ( v3, v0 ); // invoke-virtual {v2, v3, v0}, Landroid/graphics/drawable/StateListDrawable;->addState([ILandroid/graphics/drawable/Drawable;)V
/* .line 325 */
} // :cond_0
com.mobfox.video.sdk.ResourceManager .buildNinePatchDrawable ( p0,p6 );
/* .line 326 */
if ( v0 != null) { // if-eqz v0, :cond_1
/* .line 327 */
int v1 = 1; // const/4 v1, 0x1
/* .line 328 */
int v3 = 2; // const/4 v3, 0x2
/* new-array v3, v3, [I */
/* fill-array-data v3, :array_0 */
(( android.graphics.drawable.StateListDrawable ) v2 ).addState ( v3, v0 ); // invoke-virtual {v2, v3, v0}, Landroid/graphics/drawable/StateListDrawable;->addState([ILandroid/graphics/drawable/Drawable;)V
/* .line 332 */
} // :cond_1
com.mobfox.video.sdk.ResourceManager .buildNinePatchDrawable ( p0,p5 );
/* .line 333 */
if ( v0 != null) { // if-eqz v0, :cond_2
/* .line 334 */
int v1 = 1; // const/4 v1, 0x1
/* .line 335 */
/* new-array v3, v6, [I */
/* const v4, -0x101009e */
/* aput v4, v3, v5 */
(( android.graphics.drawable.StateListDrawable ) v2 ).addState ( v3, v0 ); // invoke-virtual {v2, v3, v0}, Landroid/graphics/drawable/StateListDrawable;->addState([ILandroid/graphics/drawable/Drawable;)V
/* .line 338 */
} // :cond_2
com.mobfox.video.sdk.ResourceManager .buildNinePatchDrawable ( p0,p4 );
/* .line 339 */
if ( v0 != null) { // if-eqz v0, :cond_3
/* .line 340 */
int v1 = 1; // const/4 v1, 0x1
/* .line 341 */
/* new-array v3, v6, [I */
/* const v4, 0x10100a1 */
/* aput v4, v3, v5 */
(( android.graphics.drawable.StateListDrawable ) v2 ).addState ( v3, v0 ); // invoke-virtual {v2, v3, v0}, Landroid/graphics/drawable/StateListDrawable;->addState([ILandroid/graphics/drawable/Drawable;)V
/* .line 344 */
} // :cond_3
com.mobfox.video.sdk.ResourceManager .buildNinePatchDrawable ( p0,p2 );
/* .line 345 */
if ( v0 != null) { // if-eqz v0, :cond_4
/* .line 346 */
int v1 = 1; // const/4 v1, 0x1
/* .line 347 */
/* new-array v3, v5, [I */
(( android.graphics.drawable.StateListDrawable ) v2 ).addState ( v3, v0 ); // invoke-virtual {v2, v3, v0}, Landroid/graphics/drawable/StateListDrawable;->addState([ILandroid/graphics/drawable/Drawable;)V
/* .line 349 */
} // :cond_4
if ( v1 != null) { // if-eqz v1, :cond_5
/* .line 350 */
v3 = com.mobfox.video.sdk.ResourceManager.sResources;
java.lang.Integer .valueOf ( p1 );
(( java.util.HashMap ) v3 ).put ( v4, v2 ); // invoke-virtual {v3, v4, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
/* .line 352 */
} // :cond_5
return;
/* .line 328 */
/* :array_0 */
/* .array-data 4 */
/* -0x101009e */
/* 0x10100a1 */
} // .end array-data
} // .end method
private static void registerImageResource ( android.content.Context p0, Integer p1, java.lang.String p2 ) {
/* .locals 4 */
/* .param p0, "ctx" # Landroid/content/Context; */
/* .param p1, "resId" # I */
/* .param p2, "name" # Ljava/lang/String; */
/* .prologue */
/* .line 221 */
com.mobfox.video.sdk.ResourceManager .buildDrawable ( p0,p2 );
/* .line 222 */
/* .local v0, "d":Landroid/graphics/drawable/Drawable; */
if ( v0 != null) { // if-eqz v0, :cond_0
/* .line 223 */
v1 = com.mobfox.video.sdk.ResourceManager.sResources;
java.lang.Integer .valueOf ( p1 );
(( java.util.HashMap ) v1 ).put ( v2, v0 ); // invoke-virtual {v1, v2, v0}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
/* .line 227 */
} // :goto_0
return;
/* .line 225 */
} // :cond_0
final String v1 = "registerImageResource"; // const-string v1, "registerImageResource"
/* new-instance v2, Ljava/lang/StringBuilder; */
final String v3 = "drawable was null "; // const-string v3, "drawable was null "
/* invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V */
(( java.lang.StringBuilder ) v2 ).append ( p2 ); // invoke-virtual {v2, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v2 ).toString ( ); // invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
android.util.Log .i ( v1,v2 );
} // .end method
public static Boolean resourcesInstalled ( android.content.Context p0 ) {
/* .locals 5 */
/* .param p0, "ctx" # Landroid/content/Context; */
/* .prologue */
/* .line 100 */
int v2 = 0; // const/4 v2, 0x0
/* .line 101 */
/* .local v2, "result":Z */
(( android.content.Context ) p0 ).fileList ( ); // invoke-virtual {p0}, Landroid/content/Context;->fileList()[Ljava/lang/String;
/* .line 102 */
/* .local v0, "files":[Ljava/lang/String; */
int v1 = 0; // const/4 v1, 0x0
/* .local v1, "i":I */
} // :goto_0
/* array-length v3, v0 */
/* if-lt v1, v3, :cond_0 */
/* .line 110 */
} // .end local v2 # "result":Z
} // :goto_1
/* .line 103 */
/* .restart local v2 # "result":Z */
} // :cond_0
final String v3 = "mobfox_version.txt"; // const-string v3, "mobfox_version.txt"
/* aget-object v4, v0, v1 */
v3 = (( java.lang.String ) v3 ).equals ( v4 ); // invoke-virtual {v3, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
if ( v3 != null) { // if-eqz v3, :cond_2
/* .line 104 */
final String v3 = "MOBFOX"; // const-string v3, "MOBFOX"
int v4 = 3; // const/4 v4, 0x3
v3 = android.util.Log .isLoggable ( v3,v4 );
if ( v3 != null) { // if-eqz v3, :cond_1
/* .line 105 */
final String v3 = "MOBFOX"; // const-string v3, "MOBFOX"
final String v4 = "MobFox Resources already installed"; // const-string v4, "MobFox Resources already installed"
android.util.Log .d ( v3,v4 );
/* .line 107 */
} // :cond_1
int v2 = 1; // const/4 v2, 0x1
/* .line 102 */
} // :cond_2
/* add-int/lit8 v1, v1, 0x1 */
} // .end method
public static void saveInstalledVersion ( android.content.Context p0, Long p1 ) {
/* .locals 4 */
/* .param p0, "ctx" # Landroid/content/Context; */
/* .param p1, "version" # J */
/* .prologue */
/* .line 140 */
int v1 = 0; // const/4 v1, 0x0
/* .line 142 */
/* .local v1, "out":Ljava/io/FileOutputStream; */
try { // :try_start_0
final String v2 = "mobfox_version.txt"; // const-string v2, "mobfox_version.txt"
int v3 = 0; // const/4 v3, 0x0
(( android.content.Context ) p0 ).openFileOutput ( v2, v3 ); // invoke-virtual {p0, v2, v3}, Landroid/content/Context;->openFileOutput(Ljava/lang/String;I)Ljava/io/FileOutputStream;
/* .line 143 */
/* new-instance v0, Ljava/io/OutputStreamWriter; */
final String v2 = "UTF-8"; // const-string v2, "UTF-8"
/* invoke-direct {v0, v1, v2}, Ljava/io/OutputStreamWriter;-><init>(Ljava/io/OutputStream;Ljava/lang/String;)V */
/* .line 144 */
/* .local v0, "osr":Ljava/io/OutputStreamWriter; */
java.lang.String .valueOf ( p1,p2 );
(( java.io.OutputStreamWriter ) v0 ).write ( v2 ); // invoke-virtual {v0, v2}, Ljava/io/OutputStreamWriter;->write(Ljava/lang/String;)V
/* .line 145 */
(( java.io.OutputStreamWriter ) v0 ).flush ( ); // invoke-virtual {v0}, Ljava/io/OutputStreamWriter;->flush()V
/* :try_end_0 */
/* .catch Ljava/lang/Exception; {:try_start_0 ..:try_end_0} :catch_0 */
/* .catchall {:try_start_0 ..:try_end_0} :catchall_0 */
/* .line 149 */
if ( v1 != null) { // if-eqz v1, :cond_0
/* .line 151 */
try { // :try_start_1
(( java.io.FileOutputStream ) v1 ).close ( ); // invoke-virtual {v1}, Ljava/io/FileOutputStream;->close()V
/* :try_end_1 */
/* .catch Ljava/lang/Exception; {:try_start_1 ..:try_end_1} :catch_3 */
/* .line 157 */
} // .end local v0 # "osr":Ljava/io/OutputStreamWriter;
} // :cond_0
} // :goto_0
return;
/* .line 146 */
/* :catch_0 */
/* move-exception v2 */
/* .line 149 */
if ( v1 != null) { // if-eqz v1, :cond_0
/* .line 151 */
try { // :try_start_2
(( java.io.FileOutputStream ) v1 ).close ( ); // invoke-virtual {v1}, Ljava/io/FileOutputStream;->close()V
/* :try_end_2 */
/* .catch Ljava/lang/Exception; {:try_start_2 ..:try_end_2} :catch_1 */
/* .line 152 */
/* :catch_1 */
/* move-exception v2 */
/* .line 148 */
/* :catchall_0 */
/* move-exception v2 */
/* .line 149 */
if ( v1 != null) { // if-eqz v1, :cond_1
/* .line 151 */
try { // :try_start_3
(( java.io.FileOutputStream ) v1 ).close ( ); // invoke-virtual {v1}, Ljava/io/FileOutputStream;->close()V
/* :try_end_3 */
/* .catch Ljava/lang/Exception; {:try_start_3 ..:try_end_3} :catch_2 */
/* .line 156 */
} // :cond_1
} // :goto_1
/* throw v2 */
/* .line 152 */
/* :catch_2 */
/* move-exception v3 */
/* .restart local v0 # "osr":Ljava/io/OutputStreamWriter; */
/* :catch_3 */
/* move-exception v2 */
} // .end method
/* # virtual methods */
public Boolean containsResource ( Integer p0 ) {
/* .locals 2 */
/* .param p1, "resourceId" # I */
/* .prologue */
/* .line 401 */
v0 = this.mResources;
java.lang.Integer .valueOf ( p1 );
v0 = (( java.util.HashMap ) v0 ).containsKey ( v1 ); // invoke-virtual {v0, v1}, Ljava/util/HashMap;->containsKey(Ljava/lang/Object;)Z
/* if-nez v0, :cond_0 */
v0 = com.mobfox.video.sdk.ResourceManager.sResources;
/* .line 402 */
java.lang.Integer .valueOf ( p1 );
v0 = (( java.util.HashMap ) v0 ).containsKey ( v1 ); // invoke-virtual {v0, v1}, Ljava/util/HashMap;->containsKey(Ljava/lang/Object;)Z
/* if-nez v0, :cond_0 */
int v0 = 0; // const/4 v0, 0x0
} // :goto_0
} // :cond_0
int v0 = 1; // const/4 v0, 0x1
/* .line 401 */
} // .end method
public void fetchResource ( java.lang.String p0, Integer p1 ) {
/* .locals 2 */
/* .param p1, "url" # Ljava/lang/String; */
/* .param p2, "resourceId" # I */
/* .prologue */
/* .line 395 */
v0 = this.mResources;
java.lang.Integer .valueOf ( p2 );
v0 = (( java.util.HashMap ) v0 ).containsKey ( v1 ); // invoke-virtual {v0, v1}, Ljava/util/HashMap;->containsKey(Ljava/lang/Object;)Z
/* if-nez v0, :cond_0 */
/* .line 396 */
/* new-instance v0, Lcom/mobfox/video/sdk/ResourceManager$FetchImageTask; */
v1 = this.mContext;
/* invoke-direct {v0, p0, v1, p1, p2}, Lcom/mobfox/video/sdk/ResourceManager$FetchImageTask;-><init>(Lcom/mobfox/video/sdk/ResourceManager;Landroid/content/Context;Ljava/lang/String;I)V */
int v1 = 0; // const/4 v1, 0x0
/* new-array v1, v1, [Ljava/lang/Void; */
(( com.mobfox.video.sdk.ResourceManager$FetchImageTask ) v0 ).execute ( v1 ); // invoke-virtual {v0, v1}, Lcom/mobfox/video/sdk/ResourceManager$FetchImageTask;->execute([Ljava/lang/Object;)Landroid/os/AsyncTask;
/* .line 398 */
} // :cond_0
return;
} // .end method
public android.graphics.drawable.Drawable getResource ( Integer p0 ) {
/* .locals 3 */
/* .param p1, "resourceId" # I */
/* .prologue */
/* .line 406 */
v1 = this.mResources;
java.lang.Integer .valueOf ( p1 );
(( java.util.HashMap ) v1 ).get ( v2 ); // invoke-virtual {v1, v2}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;
/* check-cast v0, Landroid/graphics/drawable/Drawable; */
/* .line 407 */
/* .local v0, "d":Landroid/graphics/drawable/Drawable; */
/* if-nez v0, :cond_0 */
/* .line 408 */
v1 = com.mobfox.video.sdk.ResourceManager.sResources;
java.lang.Integer .valueOf ( p1 );
(( java.util.HashMap ) v1 ).get ( v2 ); // invoke-virtual {v1, v2}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;
} // .end local v0 # "d":Landroid/graphics/drawable/Drawable;
/* check-cast v0, Landroid/graphics/drawable/Drawable; */
/* .line 410 */
/* .restart local v0 # "d":Landroid/graphics/drawable/Drawable; */
} // :cond_0
} // .end method
public Boolean setImageButton ( android.widget.ImageButton p0, Integer p1, Integer p2 ) {
/* .locals 5 */
/* .param p1, "b" # Landroid/widget/ImageButton; */
/* .param p2, "imageResourceId" # I */
/* .param p3, "bgResourceId" # I */
/* .prologue */
int v2 = 0; // const/4 v2, 0x0
/* .line 415 */
v3 = this.mResources;
java.lang.Integer .valueOf ( p2 );
(( java.util.HashMap ) v3 ).get ( v4 ); // invoke-virtual {v3, v4}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;
/* check-cast v1, Landroid/graphics/drawable/Drawable; */
/* .line 416 */
/* .local v1, "image":Landroid/graphics/drawable/Drawable; */
/* if-nez v1, :cond_0 */
/* .line 417 */
v3 = com.mobfox.video.sdk.ResourceManager.sResources;
java.lang.Integer .valueOf ( p2 );
(( java.util.HashMap ) v3 ).get ( v4 ); // invoke-virtual {v3, v4}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;
} // .end local v1 # "image":Landroid/graphics/drawable/Drawable;
/* check-cast v1, Landroid/graphics/drawable/Drawable; */
/* .line 419 */
/* .restart local v1 # "image":Landroid/graphics/drawable/Drawable; */
} // :cond_0
v3 = this.mResources;
java.lang.Integer .valueOf ( p3 );
(( java.util.HashMap ) v3 ).get ( v4 ); // invoke-virtual {v3, v4}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;
/* check-cast v0, Landroid/graphics/drawable/Drawable; */
/* .line 420 */
/* .local v0, "bg":Landroid/graphics/drawable/Drawable; */
/* if-nez v0, :cond_1 */
/* .line 421 */
v3 = com.mobfox.video.sdk.ResourceManager.sResources;
java.lang.Integer .valueOf ( p3 );
(( java.util.HashMap ) v3 ).get ( v4 ); // invoke-virtual {v3, v4}, Ljava/util/HashMap;->get(Ljava/lang/Object;)Ljava/lang/Object;
} // .end local v0 # "bg":Landroid/graphics/drawable/Drawable;
/* check-cast v0, Landroid/graphics/drawable/Drawable; */
/* .line 423 */
/* .restart local v0 # "bg":Landroid/graphics/drawable/Drawable; */
} // :cond_1
/* if-nez v0, :cond_3 */
/* if-nez v1, :cond_3 */
/* .line 434 */
} // :cond_2
} // :goto_0
/* .line 426 */
} // :cond_3
if ( p1 != null) { // if-eqz p1, :cond_2
/* .line 427 */
(( android.widget.ImageButton ) p1 ).setBackgroundDrawable ( v0 ); // invoke-virtual {p1, v0}, Landroid/widget/ImageButton;->setBackgroundDrawable(Landroid/graphics/drawable/Drawable;)V
/* .line 428 */
/* if-nez v0, :cond_4 */
/* .line 429 */
(( android.widget.ImageButton ) p1 ).setPadding ( v2, v2, v2, v2 ); // invoke-virtual {p1, v2, v2, v2, v2}, Landroid/widget/ImageButton;->setPadding(IIII)V
/* .line 431 */
} // :cond_4
(( android.widget.ImageButton ) p1 ).setImageDrawable ( v1 ); // invoke-virtual {p1, v1}, Landroid/widget/ImageButton;->setImageDrawable(Landroid/graphics/drawable/Drawable;)V
/* .line 432 */
int v2 = 1; // const/4 v2, 0x1
} // .end method
