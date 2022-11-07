public class org.nwhy.Whackczkm.ImageManager {
	 /* .source "ImageManager.java" */
	 /* # static fields */
	 public static android.graphics.Bitmap bmBG;
	 public static android.graphics.Bitmap bmStateBg;
	 public static android.graphics.Bitmap bmVSBG;
	 private static java.util.Map values;
	 /* .annotation system Ldalvik/annotation/Signature; */
	 /* value = { */
	 /* "Ljava/util/Map", */
	 /* "<", */
	 /* "Ljava/lang/Integer;", */
	 /* "Landroid/graphics/Bitmap;", */
	 /* ">;" */
	 /* } */
} // .end annotation
} // .end field
private static java.util.Map vsBm;
/* .annotation system Ldalvik/annotation/Signature; */
/* value = { */
/* "Ljava/util/Map", */
/* "<", */
/* "Ljava/lang/Integer;", */
/* "Landroid/graphics/Bitmap;", */
/* ">;" */
/* } */
} // .end annotation
} // .end field
/* # direct methods */
static org.nwhy.Whackczkm.ImageManager ( ) {
/* .locals 1 */
/* .prologue */
/* .line 15 */
/* new-instance v0, Ljava/util/HashMap; */
/* invoke-direct {v0}, Ljava/util/HashMap;-><init>()V */
/* .line 16 */
/* new-instance v0, Ljava/util/HashMap; */
/* invoke-direct {v0}, Ljava/util/HashMap;-><init>()V */
/* .line 13 */
return;
} // .end method
public org.nwhy.Whackczkm.ImageManager ( ) {
/* .locals 0 */
/* .prologue */
/* .line 13 */
/* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
return;
} // .end method
public static android.graphics.Bitmap getBitmap ( Integer p0 ) {
/* .locals 2 */
/* .param p0, "index" # I */
/* .prologue */
/* .line 22 */
v0 = org.nwhy.Whackczkm.ImageManager.values;
java.lang.Integer .valueOf ( p0 );
} // .end local p0 # "index":I
/* check-cast p0, Landroid/graphics/Bitmap; */
} // .end method
public static android.graphics.Bitmap getVSBitmap ( Integer p0 ) {
/* .locals 2 */
/* .param p0, "index" # I */
/* .prologue */
/* .line 26 */
v0 = org.nwhy.Whackczkm.ImageManager.vsBm;
java.lang.Integer .valueOf ( p0 );
} // .end local p0 # "index":I
/* check-cast p0, Landroid/graphics/Bitmap; */
} // .end method
public static void init ( android.content.Context p0 ) {
/* .locals 9 */
/* .param p0, "context" # Landroid/content/Context; */
/* .prologue */
/* const v8, 0x7f02000a */
/* const v7, 0x7f020009 */
/* const v6, 0x7f020008 */
/* const v5, 0x7f02000f */
/* const v4, 0x7f020007 */
/* .line 30 */
(( android.content.Context ) p0 ).getResources ( ); // invoke-virtual {p0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;
/* .line 31 */
/* .local v0, "resources":Landroid/content/res/Resources; */
v1 = org.nwhy.Whackczkm.ImageManager.values;
/* new-instance v2, Ljava/lang/Integer; */
/* const/16 v3, 0xd */
/* invoke-direct {v2, v3}, Ljava/lang/Integer;-><init>(I)V */
/* const v3, 0x7f020011 */
org.nwhy.Whackczkm.ImageManager .loadBallView ( v0,v3 );
/* .line 32 */
v1 = org.nwhy.Whackczkm.ImageManager.values;
/* new-instance v2, Ljava/lang/Integer; */
/* const/16 v3, 0xc */
/* invoke-direct {v2, v3}, Ljava/lang/Integer;-><init>(I)V */
/* const v3, 0x7f020012 */
org.nwhy.Whackczkm.ImageManager .loadBallView ( v0,v3 );
/* .line 33 */
v1 = org.nwhy.Whackczkm.ImageManager.values;
/* new-instance v2, Ljava/lang/Integer; */
/* const/16 v3, 0xb */
/* invoke-direct {v2, v3}, Ljava/lang/Integer;-><init>(I)V */
/* const v3, 0x7f020013 */
org.nwhy.Whackczkm.ImageManager .loadBallView ( v0,v3 );
/* .line 34 */
v1 = org.nwhy.Whackczkm.ImageManager.values;
/* new-instance v2, Ljava/lang/Integer; */
/* const/16 v3, 0xa */
/* invoke-direct {v2, v3}, Ljava/lang/Integer;-><init>(I)V */
/* const v3, 0x7f020014 */
org.nwhy.Whackczkm.ImageManager .loadBallView ( v0,v3 );
/* .line 35 */
v1 = org.nwhy.Whackczkm.ImageManager.values;
/* new-instance v2, Ljava/lang/Integer; */
/* const/16 v3, 0x9 */
/* invoke-direct {v2, v3}, Ljava/lang/Integer;-><init>(I)V */
/* const v3, 0x7f020015 */
org.nwhy.Whackczkm.ImageManager .loadBallView ( v0,v3 );
/* .line 36 */
v1 = org.nwhy.Whackczkm.ImageManager.values;
/* new-instance v2, Ljava/lang/Integer; */
/* const/16 v3, 0x8 */
/* invoke-direct {v2, v3}, Ljava/lang/Integer;-><init>(I)V */
/* const v3, 0x7f020016 */
org.nwhy.Whackczkm.ImageManager .loadBallView ( v0,v3 );
/* .line 37 */
v1 = org.nwhy.Whackczkm.ImageManager.values;
/* new-instance v2, Ljava/lang/Integer; */
int v3 = 7; // const/4 v3, 0x7
/* invoke-direct {v2, v3}, Ljava/lang/Integer;-><init>(I)V */
/* const v3, 0x7f020016 */
org.nwhy.Whackczkm.ImageManager .loadBallView ( v0,v3 );
/* .line 38 */
v1 = org.nwhy.Whackczkm.ImageManager.values;
/* new-instance v2, Ljava/lang/Integer; */
int v3 = 6; // const/4 v3, 0x6
/* invoke-direct {v2, v3}, Ljava/lang/Integer;-><init>(I)V */
/* const v3, 0x7f020016 */
org.nwhy.Whackczkm.ImageManager .loadBallView ( v0,v3 );
/* .line 39 */
v1 = org.nwhy.Whackczkm.ImageManager.values;
/* new-instance v2, Ljava/lang/Integer; */
int v3 = 5; // const/4 v3, 0x5
/* invoke-direct {v2, v3}, Ljava/lang/Integer;-><init>(I)V */
/* const v3, 0x7f020015 */
org.nwhy.Whackczkm.ImageManager .loadBallView ( v0,v3 );
/* .line 40 */
v1 = org.nwhy.Whackczkm.ImageManager.values;
/* new-instance v2, Ljava/lang/Integer; */
int v3 = 4; // const/4 v3, 0x4
/* invoke-direct {v2, v3}, Ljava/lang/Integer;-><init>(I)V */
/* const v3, 0x7f020014 */
org.nwhy.Whackczkm.ImageManager .loadBallView ( v0,v3 );
/* .line 41 */
v1 = org.nwhy.Whackczkm.ImageManager.values;
/* new-instance v2, Ljava/lang/Integer; */
int v3 = 3; // const/4 v3, 0x3
/* invoke-direct {v2, v3}, Ljava/lang/Integer;-><init>(I)V */
/* const v3, 0x7f020013 */
org.nwhy.Whackczkm.ImageManager .loadBallView ( v0,v3 );
/* .line 42 */
v1 = org.nwhy.Whackczkm.ImageManager.values;
/* new-instance v2, Ljava/lang/Integer; */
int v3 = 2; // const/4 v3, 0x2
/* invoke-direct {v2, v3}, Ljava/lang/Integer;-><init>(I)V */
/* const v3, 0x7f020012 */
org.nwhy.Whackczkm.ImageManager .loadBallView ( v0,v3 );
/* .line 43 */
v1 = org.nwhy.Whackczkm.ImageManager.values;
/* new-instance v2, Ljava/lang/Integer; */
int v3 = 1; // const/4 v3, 0x1
/* invoke-direct {v2, v3}, Ljava/lang/Integer;-><init>(I)V */
/* const v3, 0x7f020011 */
org.nwhy.Whackczkm.ImageManager .loadBallView ( v0,v3 );
/* .line 44 */
v1 = org.nwhy.Whackczkm.ImageManager.values;
/* new-instance v2, Ljava/lang/Integer; */
int v3 = 0; // const/4 v3, 0x0
/* invoke-direct {v2, v3}, Ljava/lang/Integer;-><init>(I)V */
/* const v3, 0x7f020002 */
org.nwhy.Whackczkm.ImageManager .loadBallView ( v0,v3 );
/* .line 46 */
v1 = org.nwhy.Whackczkm.ImageManager.values;
/* new-instance v2, Ljava/lang/Integer; */
/* const/16 v3, -0x9 */
/* invoke-direct {v2, v3}, Ljava/lang/Integer;-><init>(I)V */
org.nwhy.Whackczkm.ImageManager .loadBallView ( v0,v5 );
/* .line 47 */
v1 = org.nwhy.Whackczkm.ImageManager.values;
/* new-instance v2, Ljava/lang/Integer; */
int v3 = -8; // const/4 v3, -0x8
/* invoke-direct {v2, v3}, Ljava/lang/Integer;-><init>(I)V */
org.nwhy.Whackczkm.ImageManager .loadBallView ( v0,v5 );
/* .line 48 */
v1 = org.nwhy.Whackczkm.ImageManager.values;
/* new-instance v2, Ljava/lang/Integer; */
int v3 = -7; // const/4 v3, -0x7
/* invoke-direct {v2, v3}, Ljava/lang/Integer;-><init>(I)V */
org.nwhy.Whackczkm.ImageManager .loadBallView ( v0,v5 );
/* .line 49 */
v1 = org.nwhy.Whackczkm.ImageManager.values;
/* new-instance v2, Ljava/lang/Integer; */
int v3 = -6; // const/4 v3, -0x6
/* invoke-direct {v2, v3}, Ljava/lang/Integer;-><init>(I)V */
org.nwhy.Whackczkm.ImageManager .loadBallView ( v0,v5 );
/* .line 50 */
v1 = org.nwhy.Whackczkm.ImageManager.values;
/* new-instance v2, Ljava/lang/Integer; */
int v3 = -5; // const/4 v3, -0x5
/* invoke-direct {v2, v3}, Ljava/lang/Integer;-><init>(I)V */
/* const v3, 0x7f020015 */
org.nwhy.Whackczkm.ImageManager .loadBallView ( v0,v3 );
/* .line 51 */
v1 = org.nwhy.Whackczkm.ImageManager.values;
/* new-instance v2, Ljava/lang/Integer; */
int v3 = -4; // const/4 v3, -0x4
/* invoke-direct {v2, v3}, Ljava/lang/Integer;-><init>(I)V */
/* const v3, 0x7f020014 */
org.nwhy.Whackczkm.ImageManager .loadBallView ( v0,v3 );
/* .line 52 */
v1 = org.nwhy.Whackczkm.ImageManager.values;
/* new-instance v2, Ljava/lang/Integer; */
int v3 = -3; // const/4 v3, -0x3
/* invoke-direct {v2, v3}, Ljava/lang/Integer;-><init>(I)V */
/* const v3, 0x7f020013 */
org.nwhy.Whackczkm.ImageManager .loadBallView ( v0,v3 );
/* .line 53 */
v1 = org.nwhy.Whackczkm.ImageManager.values;
/* new-instance v2, Ljava/lang/Integer; */
int v3 = -2; // const/4 v3, -0x2
/* invoke-direct {v2, v3}, Ljava/lang/Integer;-><init>(I)V */
/* const v3, 0x7f020012 */
org.nwhy.Whackczkm.ImageManager .loadBallView ( v0,v3 );
/* .line 54 */
v1 = org.nwhy.Whackczkm.ImageManager.values;
/* new-instance v2, Ljava/lang/Integer; */
int v3 = -1; // const/4 v3, -0x1
/* invoke-direct {v2, v3}, Ljava/lang/Integer;-><init>(I)V */
/* const v3, 0x7f020011 */
org.nwhy.Whackczkm.ImageManager .loadBallView ( v0,v3 );
/* .line 56 */
v1 = org.nwhy.Whackczkm.ImageManager.vsBm;
/* new-instance v2, Ljava/lang/Integer; */
/* const/16 v3, 0xd */
/* invoke-direct {v2, v3}, Ljava/lang/Integer;-><init>(I)V */
org.nwhy.Whackczkm.ImageManager .loadBallView ( v0,v6 );
/* .line 57 */
v1 = org.nwhy.Whackczkm.ImageManager.vsBm;
/* new-instance v2, Ljava/lang/Integer; */
/* const/16 v3, 0xc */
/* invoke-direct {v2, v3}, Ljava/lang/Integer;-><init>(I)V */
org.nwhy.Whackczkm.ImageManager .loadBallView ( v0,v7 );
/* .line 58 */
v1 = org.nwhy.Whackczkm.ImageManager.vsBm;
/* new-instance v2, Ljava/lang/Integer; */
/* const/16 v3, 0xb */
/* invoke-direct {v2, v3}, Ljava/lang/Integer;-><init>(I)V */
org.nwhy.Whackczkm.ImageManager .loadBallView ( v0,v8 );
/* .line 59 */
v1 = org.nwhy.Whackczkm.ImageManager.vsBm;
/* new-instance v2, Ljava/lang/Integer; */
/* const/16 v3, 0xa */
/* invoke-direct {v2, v3}, Ljava/lang/Integer;-><init>(I)V */
/* const v3, 0x7f02000b */
org.nwhy.Whackczkm.ImageManager .loadBallView ( v0,v3 );
/* .line 60 */
v1 = org.nwhy.Whackczkm.ImageManager.vsBm;
/* new-instance v2, Ljava/lang/Integer; */
/* const/16 v3, 0x9 */
/* invoke-direct {v2, v3}, Ljava/lang/Integer;-><init>(I)V */
/* const v3, 0x7f02000c */
org.nwhy.Whackczkm.ImageManager .loadBallView ( v0,v3 );
/* .line 61 */
v1 = org.nwhy.Whackczkm.ImageManager.vsBm;
/* new-instance v2, Ljava/lang/Integer; */
/* const/16 v3, 0x8 */
/* invoke-direct {v2, v3}, Ljava/lang/Integer;-><init>(I)V */
/* const v3, 0x7f02000d */
org.nwhy.Whackczkm.ImageManager .loadBallView ( v0,v3 );
/* .line 62 */
v1 = org.nwhy.Whackczkm.ImageManager.vsBm;
/* new-instance v2, Ljava/lang/Integer; */
int v3 = 7; // const/4 v3, 0x7
/* invoke-direct {v2, v3}, Ljava/lang/Integer;-><init>(I)V */
/* const v3, 0x7f02000d */
org.nwhy.Whackczkm.ImageManager .loadBallView ( v0,v3 );
/* .line 63 */
v1 = org.nwhy.Whackczkm.ImageManager.vsBm;
/* new-instance v2, Ljava/lang/Integer; */
int v3 = 6; // const/4 v3, 0x6
/* invoke-direct {v2, v3}, Ljava/lang/Integer;-><init>(I)V */
/* const v3, 0x7f02000d */
org.nwhy.Whackczkm.ImageManager .loadBallView ( v0,v3 );
/* .line 64 */
v1 = org.nwhy.Whackczkm.ImageManager.vsBm;
/* new-instance v2, Ljava/lang/Integer; */
int v3 = 5; // const/4 v3, 0x5
/* invoke-direct {v2, v3}, Ljava/lang/Integer;-><init>(I)V */
/* const v3, 0x7f02000c */
org.nwhy.Whackczkm.ImageManager .loadBallView ( v0,v3 );
/* .line 65 */
v1 = org.nwhy.Whackczkm.ImageManager.vsBm;
/* new-instance v2, Ljava/lang/Integer; */
int v3 = 4; // const/4 v3, 0x4
/* invoke-direct {v2, v3}, Ljava/lang/Integer;-><init>(I)V */
/* const v3, 0x7f02000b */
org.nwhy.Whackczkm.ImageManager .loadBallView ( v0,v3 );
/* .line 66 */
v1 = org.nwhy.Whackczkm.ImageManager.vsBm;
/* new-instance v2, Ljava/lang/Integer; */
int v3 = 3; // const/4 v3, 0x3
/* invoke-direct {v2, v3}, Ljava/lang/Integer;-><init>(I)V */
org.nwhy.Whackczkm.ImageManager .loadBallView ( v0,v8 );
/* .line 67 */
v1 = org.nwhy.Whackczkm.ImageManager.vsBm;
/* new-instance v2, Ljava/lang/Integer; */
int v3 = 2; // const/4 v3, 0x2
/* invoke-direct {v2, v3}, Ljava/lang/Integer;-><init>(I)V */
org.nwhy.Whackczkm.ImageManager .loadBallView ( v0,v7 );
/* .line 68 */
v1 = org.nwhy.Whackczkm.ImageManager.vsBm;
/* new-instance v2, Ljava/lang/Integer; */
int v3 = 1; // const/4 v3, 0x1
/* invoke-direct {v2, v3}, Ljava/lang/Integer;-><init>(I)V */
org.nwhy.Whackczkm.ImageManager .loadBallView ( v0,v6 );
/* .line 69 */
v1 = org.nwhy.Whackczkm.ImageManager.vsBm;
/* new-instance v2, Ljava/lang/Integer; */
int v3 = 0; // const/4 v3, 0x0
/* invoke-direct {v2, v3}, Ljava/lang/Integer;-><init>(I)V */
/* const v3, 0x7f020002 */
org.nwhy.Whackczkm.ImageManager .loadBallView ( v0,v3 );
/* .line 71 */
v1 = org.nwhy.Whackczkm.ImageManager.vsBm;
/* new-instance v2, Ljava/lang/Integer; */
/* const/16 v3, -0x9 */
/* invoke-direct {v2, v3}, Ljava/lang/Integer;-><init>(I)V */
org.nwhy.Whackczkm.ImageManager .loadBallView ( v0,v4 );
/* .line 72 */
v1 = org.nwhy.Whackczkm.ImageManager.vsBm;
/* new-instance v2, Ljava/lang/Integer; */
int v3 = -8; // const/4 v3, -0x8
/* invoke-direct {v2, v3}, Ljava/lang/Integer;-><init>(I)V */
org.nwhy.Whackczkm.ImageManager .loadBallView ( v0,v4 );
/* .line 73 */
v1 = org.nwhy.Whackczkm.ImageManager.vsBm;
/* new-instance v2, Ljava/lang/Integer; */
int v3 = -7; // const/4 v3, -0x7
/* invoke-direct {v2, v3}, Ljava/lang/Integer;-><init>(I)V */
org.nwhy.Whackczkm.ImageManager .loadBallView ( v0,v4 );
/* .line 74 */
v1 = org.nwhy.Whackczkm.ImageManager.vsBm;
/* new-instance v2, Ljava/lang/Integer; */
int v3 = -6; // const/4 v3, -0x6
/* invoke-direct {v2, v3}, Ljava/lang/Integer;-><init>(I)V */
org.nwhy.Whackczkm.ImageManager .loadBallView ( v0,v4 );
/* .line 75 */
v1 = org.nwhy.Whackczkm.ImageManager.vsBm;
/* new-instance v2, Ljava/lang/Integer; */
int v3 = -5; // const/4 v3, -0x5
/* invoke-direct {v2, v3}, Ljava/lang/Integer;-><init>(I)V */
/* const v3, 0x7f02000c */
org.nwhy.Whackczkm.ImageManager .loadBallView ( v0,v3 );
/* .line 76 */
v1 = org.nwhy.Whackczkm.ImageManager.vsBm;
/* new-instance v2, Ljava/lang/Integer; */
int v3 = -4; // const/4 v3, -0x4
/* invoke-direct {v2, v3}, Ljava/lang/Integer;-><init>(I)V */
/* const v3, 0x7f02000b */
org.nwhy.Whackczkm.ImageManager .loadBallView ( v0,v3 );
/* .line 77 */
v1 = org.nwhy.Whackczkm.ImageManager.vsBm;
/* new-instance v2, Ljava/lang/Integer; */
int v3 = -3; // const/4 v3, -0x3
/* invoke-direct {v2, v3}, Ljava/lang/Integer;-><init>(I)V */
org.nwhy.Whackczkm.ImageManager .loadBallView ( v0,v8 );
/* .line 78 */
v1 = org.nwhy.Whackczkm.ImageManager.vsBm;
/* new-instance v2, Ljava/lang/Integer; */
int v3 = -2; // const/4 v3, -0x2
/* invoke-direct {v2, v3}, Ljava/lang/Integer;-><init>(I)V */
org.nwhy.Whackczkm.ImageManager .loadBallView ( v0,v7 );
/* .line 79 */
v1 = org.nwhy.Whackczkm.ImageManager.vsBm;
/* new-instance v2, Ljava/lang/Integer; */
int v3 = -1; // const/4 v3, -0x1
/* invoke-direct {v2, v3}, Ljava/lang/Integer;-><init>(I)V */
org.nwhy.Whackczkm.ImageManager .loadBallView ( v0,v6 );
/* .line 81 */
/* const v1, 0x7f02000e */
android.graphics.BitmapFactory .decodeResource ( v0,v1 );
/* .line 82 */
/* const v1, 0x7f020006 */
android.graphics.BitmapFactory .decodeResource ( v0,v1 );
/* .line 83 */
/* const/high16 v1, 0x7f020000 */
android.graphics.BitmapFactory .decodeResource ( v0,v1 );
/* .line 84 */
return;
} // .end method
private static android.graphics.Bitmap loadBallView ( android.content.res.Resources p0, Integer p1 ) {
/* .locals 6 */
/* .param p0, "resources" # Landroid/content/res/Resources; */
/* .param p1, "resId" # I */
/* .prologue */
int v5 = 0; // const/4 v5, 0x0
/* const/16 v4, 0x50 */
/* .line 88 */
(( android.content.res.Resources ) p0 ).getDrawable ( p1 ); // invoke-virtual {p0, p1}, Landroid/content/res/Resources;->getDrawable(I)Landroid/graphics/drawable/Drawable;
/* .line 89 */
/* .local v2, "image":Landroid/graphics/drawable/Drawable; */
v3 = android.graphics.Bitmap$Config.ARGB_8888;
android.graphics.Bitmap .createBitmap ( v4,v4,v3 );
/* .line 91 */
/* .local v0, "bitmap":Landroid/graphics/Bitmap; */
/* new-instance v1, Landroid/graphics/Canvas; */
/* invoke-direct {v1, v0}, Landroid/graphics/Canvas;-><init>(Landroid/graphics/Bitmap;)V */
/* .line 92 */
/* .local v1, "canvas":Landroid/graphics/Canvas; */
(( android.graphics.drawable.Drawable ) v2 ).setBounds ( v5, v5, v4, v4 ); // invoke-virtual {v2, v5, v5, v4, v4}, Landroid/graphics/drawable/Drawable;->setBounds(IIII)V
/* .line 93 */
(( android.graphics.drawable.Drawable ) v2 ).draw ( v1 ); // invoke-virtual {v2, v1}, Landroid/graphics/drawable/Drawable;->draw(Landroid/graphics/Canvas;)V
/* .line 95 */
} // .end method
