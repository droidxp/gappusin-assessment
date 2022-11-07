public class de.nurogames.android.ticb.base.objects.objAnimBackground {
	 /* .source "objAnimBackground.java" */
	 /* # static fields */
	 static final Integer CLOUD_BIG;
	 static final Integer CLOUD_MED;
	 static final Integer CLOUD_SML;
	 private static de.nurogames.android.ticb.base.objects.objCloud clouds;
	 private static Float l1_speed;
	 private static Float l2_speed;
	 private static Float layer1_x_offset;
	 private static Float layer2_x_offset;
	 private static Float max_offset;
	 /* # instance fields */
	 java.lang.Thread animateThread;
	 private Integer bottom_cloud_y;
	 private final java.util.Random rnd;
	 private final Integer twice_display_x;
	 private Float x;
	 /* # direct methods */
	 static de.nurogames.android.ticb.base.objects.objAnimBackground ( ) {
		 /* .locals 1 */
		 /* .prologue */
		 int v0 = 0; // const/4 v0, 0x0
		 /* .line 17 */
		 /* .line 18 */
		 /* .line 29 */
		 return;
	 } // .end method
	 public de.nurogames.android.ticb.base.objects.objAnimBackground ( ) {
		 /* .locals 10 */
		 /* .prologue */
		 int v9 = 3; // const/4 v9, 0x3
		 int v5 = 2; // const/4 v5, 0x2
		 int v8 = 0; // const/4 v8, 0x0
		 /* const/16 v7, 0x64 */
		 int v6 = 1; // const/4 v6, 0x1
		 /* .line 41 */
		 /* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
		 /* .line 14 */
		 /* new-instance v0, Ljava/util/Random; */
		 /* invoke-direct {v0}, Ljava/util/Random;-><init>()V */
		 this.rnd = v0;
		 /* .line 31 */
		 /* iput v8, p0, Lde/nurogames/android/ticb/base/objects/objAnimBackground;->bottom_cloud_y:I */
		 /* .line 33 */
		 /* mul-int/lit8 v0, v0, 0x2 */
		 /* iput v0, p0, Lde/nurogames/android/ticb/base/objects/objAnimBackground;->twice_display_x:I */
		 /* .line 120 */
		 /* new-instance v0, Lde/nurogames/android/ticb/base/objects/objAnimBackground$1; */
		 final String v1 = "cloudanim_game"; // const-string v1, "cloudanim_game"
		 /* invoke-direct {v0, p0, v1}, Lde/nurogames/android/ticb/base/objects/objAnimBackground$1;-><init>(Lde/nurogames/android/ticb/base/objects/objAnimBackground;Ljava/lang/String;)V */
		 this.animateThread = v0;
		 /* .line 43 */
		 v0 = de.nurogames.android.ticb.base.tinysanta.cntx;
		 (( android.content.Context ) v0 ).getResources ( ); // invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;
		 (( android.content.res.Resources ) v0 ).getIntArray ( v1 ); // invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getIntArray(I)[I
		 /* aget v0, v0, v1 */
		 /* iput v0, p0, Lde/nurogames/android/ticb/base/objects/objAnimBackground;->bottom_cloud_y:I */
		 /* .line 44 */
		 v0 = de.nurogames.android.ticb.base.tinysanta.cntx;
		 (( android.content.Context ) v0 ).getResources ( ); // invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;
		 (( android.content.res.Resources ) v0 ).getIntArray ( v1 ); // invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getIntArray(I)[I
		 /* aget v0, v0, v1 */
		 /* new-array v0, v0, [Lde/nurogames/android/ticb/base/objects/objCloud; */
		 /* .line 47 */
		 v0 = de.nurogames.android.ticb.base.objects.objAnimBackground.clouds;
		 /* new-instance v1, Lde/nurogames/android/ticb/base/objects/objCloud; */
		 /* .line 48 */
		 v3 = this.rnd;
		 /* iget v4, p0, Lde/nurogames/android/ticb/base/objects/objAnimBackground;->twice_display_x:I */
		 v3 = 		 (( java.util.Random ) v3 ).nextInt ( v4 ); // invoke-virtual {v3, v4}, Ljava/util/Random;->nextInt(I)I
		 /* add-int/2addr v2, v3 */
		 /* int-to-float v2, v2 */
		 /* .line 49 */
		 v3 = de.nurogames.android.ticb.base.core.AppResources.imgCloud;
		 /* aget-object v3, v3, v6 */
		 v3 = 		 (( android.graphics.Bitmap ) v3 ).getHeight ( ); // invoke-virtual {v3}, Landroid/graphics/Bitmap;->getHeight()I
		 v4 = this.rnd;
		 v4 = 		 (( java.util.Random ) v4 ).nextInt ( v7 ); // invoke-virtual {v4, v7}, Ljava/util/Random;->nextInt(I)I
		 /* add-int/2addr v3, v4 */
		 /* .line 50 */
		 /* invoke-direct {v1, v2, v3, v5}, Lde/nurogames/android/ticb/base/objects/objCloud;-><init>(FII)V */
		 /* .line 47 */
		 /* aput-object v1, v0, v8 */
		 /* .line 52 */
		 v0 = de.nurogames.android.ticb.base.objects.objAnimBackground.clouds;
		 /* new-instance v1, Lde/nurogames/android/ticb/base/objects/objCloud; */
		 /* .line 53 */
		 v3 = this.rnd;
		 /* iget v4, p0, Lde/nurogames/android/ticb/base/objects/objAnimBackground;->twice_display_x:I */
		 v3 = 		 (( java.util.Random ) v3 ).nextInt ( v4 ); // invoke-virtual {v3, v4}, Ljava/util/Random;->nextInt(I)I
		 /* add-int/2addr v2, v3 */
		 /* int-to-float v2, v2 */
		 /* .line 54 */
		 v3 = de.nurogames.android.ticb.base.core.AppResources.imgCloud;
		 /* aget-object v3, v3, v6 */
		 v3 = 		 (( android.graphics.Bitmap ) v3 ).getHeight ( ); // invoke-virtual {v3}, Landroid/graphics/Bitmap;->getHeight()I
		 v4 = this.rnd;
		 v4 = 		 (( java.util.Random ) v4 ).nextInt ( v7 ); // invoke-virtual {v4, v7}, Ljava/util/Random;->nextInt(I)I
		 /* add-int/2addr v3, v4 */
		 /* .line 55 */
		 /* invoke-direct {v1, v2, v3, v6}, Lde/nurogames/android/ticb/base/objects/objCloud;-><init>(FII)V */
		 /* .line 52 */
		 /* aput-object v1, v0, v6 */
		 /* .line 57 */
		 v0 = de.nurogames.android.ticb.base.objects.objAnimBackground.clouds;
		 /* new-instance v1, Lde/nurogames/android/ticb/base/objects/objCloud; */
		 /* .line 58 */
		 v3 = this.rnd;
		 /* iget v4, p0, Lde/nurogames/android/ticb/base/objects/objAnimBackground;->twice_display_x:I */
		 v3 = 		 (( java.util.Random ) v3 ).nextInt ( v4 ); // invoke-virtual {v3, v4}, Ljava/util/Random;->nextInt(I)I
		 /* add-int/2addr v2, v3 */
		 /* int-to-float v2, v2 */
		 /* .line 59 */
		 v3 = de.nurogames.android.ticb.base.core.AppResources.imgCloud;
		 /* aget-object v3, v3, v6 */
		 v3 = 		 (( android.graphics.Bitmap ) v3 ).getHeight ( ); // invoke-virtual {v3}, Landroid/graphics/Bitmap;->getHeight()I
		 v4 = this.rnd;
		 v4 = 		 (( java.util.Random ) v4 ).nextInt ( v7 ); // invoke-virtual {v4, v7}, Ljava/util/Random;->nextInt(I)I
		 /* add-int/2addr v3, v4 */
		 /* .line 60 */
		 /* invoke-direct {v1, v2, v3, v8}, Lde/nurogames/android/ticb/base/objects/objCloud;-><init>(FII)V */
		 /* .line 57 */
		 /* aput-object v1, v0, v5 */
		 /* .line 62 */
		 v0 = de.nurogames.android.ticb.base.objects.objAnimBackground.clouds;
		 /* array-length v0, v0 */
		 /* if-le v0, v9, :cond_0 */
		 /* .line 64 */
		 v0 = de.nurogames.android.ticb.base.objects.objAnimBackground.clouds;
		 /* new-instance v1, Lde/nurogames/android/ticb/base/objects/objCloud; */
		 /* .line 65 */
		 v3 = this.rnd;
		 /* iget v4, p0, Lde/nurogames/android/ticb/base/objects/objAnimBackground;->twice_display_x:I */
		 v3 = 		 (( java.util.Random ) v3 ).nextInt ( v4 ); // invoke-virtual {v3, v4}, Ljava/util/Random;->nextInt(I)I
		 /* add-int/2addr v2, v3 */
		 /* int-to-float v2, v2 */
		 /* .line 66 */
		 v3 = de.nurogames.android.ticb.base.core.AppResources.imgCloud;
		 /* aget-object v3, v3, v6 */
		 v3 = 		 (( android.graphics.Bitmap ) v3 ).getHeight ( ); // invoke-virtual {v3}, Landroid/graphics/Bitmap;->getHeight()I
		 v4 = this.rnd;
		 v4 = 		 (( java.util.Random ) v4 ).nextInt ( v7 ); // invoke-virtual {v4, v7}, Ljava/util/Random;->nextInt(I)I
		 /* add-int/2addr v3, v4 */
		 /* .line 67 */
		 /* invoke-direct {v1, v2, v3, v6}, Lde/nurogames/android/ticb/base/objects/objCloud;-><init>(FII)V */
		 /* .line 64 */
		 /* aput-object v1, v0, v9 */
		 /* .line 69 */
		 v0 = de.nurogames.android.ticb.base.objects.objAnimBackground.clouds;
		 int v1 = 4; // const/4 v1, 0x4
		 /* new-instance v2, Lde/nurogames/android/ticb/base/objects/objCloud; */
		 /* .line 70 */
		 v4 = this.rnd;
		 /* iget v5, p0, Lde/nurogames/android/ticb/base/objects/objAnimBackground;->twice_display_x:I */
		 v4 = 		 (( java.util.Random ) v4 ).nextInt ( v5 ); // invoke-virtual {v4, v5}, Ljava/util/Random;->nextInt(I)I
		 /* add-int/2addr v3, v4 */
		 /* int-to-float v3, v3 */
		 /* .line 71 */
		 v4 = de.nurogames.android.ticb.base.core.AppResources.imgCloud;
		 /* aget-object v4, v4, v6 */
		 v4 = 		 (( android.graphics.Bitmap ) v4 ).getHeight ( ); // invoke-virtual {v4}, Landroid/graphics/Bitmap;->getHeight()I
		 v5 = this.rnd;
		 v5 = 		 (( java.util.Random ) v5 ).nextInt ( v7 ); // invoke-virtual {v5, v7}, Ljava/util/Random;->nextInt(I)I
		 /* add-int/2addr v4, v5 */
		 /* .line 72 */
		 /* invoke-direct {v2, v3, v4, v8}, Lde/nurogames/android/ticb/base/objects/objCloud;-><init>(FII)V */
		 /* .line 69 */
		 /* aput-object v2, v0, v1 */
		 /* .line 76 */
	 } // :cond_0
	 v0 = de.nurogames.android.ticb.base.objects.objAnimBackground.clouds;
	 /* array-length v0, v0 */
	 int v1 = 5; // const/4 v1, 0x5
	 /* if-le v0, v1, :cond_1 */
	 /* .line 78 */
	 v0 = de.nurogames.android.ticb.base.objects.objAnimBackground.clouds;
	 int v1 = 5; // const/4 v1, 0x5
	 /* new-instance v2, Lde/nurogames/android/ticb/base/objects/objCloud; */
	 /* .line 79 */
	 v4 = this.rnd;
	 /* iget v5, p0, Lde/nurogames/android/ticb/base/objects/objAnimBackground;->twice_display_x:I */
	 v4 = 	 (( java.util.Random ) v4 ).nextInt ( v5 ); // invoke-virtual {v4, v5}, Ljava/util/Random;->nextInt(I)I
	 /* add-int/2addr v3, v4 */
	 /* int-to-float v3, v3 */
	 /* .line 80 */
	 v4 = de.nurogames.android.ticb.base.core.AppResources.imgCloud;
	 /* aget-object v4, v4, v6 */
	 v4 = 	 (( android.graphics.Bitmap ) v4 ).getHeight ( ); // invoke-virtual {v4}, Landroid/graphics/Bitmap;->getHeight()I
	 v5 = this.rnd;
	 v5 = 	 (( java.util.Random ) v5 ).nextInt ( v7 ); // invoke-virtual {v5, v7}, Ljava/util/Random;->nextInt(I)I
	 /* add-int/2addr v4, v5 */
	 /* .line 81 */
	 /* invoke-direct {v2, v3, v4, v8}, Lde/nurogames/android/ticb/base/objects/objCloud;-><init>(FII)V */
	 /* .line 78 */
	 /* aput-object v2, v0, v1 */
	 /* .line 82 */
	 v0 = de.nurogames.android.ticb.base.objects.objAnimBackground.clouds;
	 int v1 = 6; // const/4 v1, 0x6
	 /* new-instance v2, Lde/nurogames/android/ticb/base/objects/objCloud; */
	 /* .line 83 */
	 v4 = this.rnd;
	 /* iget v5, p0, Lde/nurogames/android/ticb/base/objects/objAnimBackground;->twice_display_x:I */
	 v4 = 	 (( java.util.Random ) v4 ).nextInt ( v5 ); // invoke-virtual {v4, v5}, Ljava/util/Random;->nextInt(I)I
	 /* add-int/2addr v3, v4 */
	 /* int-to-float v3, v3 */
	 /* .line 84 */
	 v4 = de.nurogames.android.ticb.base.core.AppResources.imgCloud;
	 /* aget-object v4, v4, v6 */
	 v4 = 	 (( android.graphics.Bitmap ) v4 ).getHeight ( ); // invoke-virtual {v4}, Landroid/graphics/Bitmap;->getHeight()I
	 v5 = this.rnd;
	 v5 = 	 (( java.util.Random ) v5 ).nextInt ( v7 ); // invoke-virtual {v5, v7}, Ljava/util/Random;->nextInt(I)I
	 /* add-int/2addr v4, v5 */
	 /* .line 85 */
	 /* invoke-direct {v2, v3, v4, v8}, Lde/nurogames/android/ticb/base/objects/objCloud;-><init>(FII)V */
	 /* .line 82 */
	 /* aput-object v2, v0, v1 */
	 /* .line 88 */
} // :cond_1
v0 = de.nurogames.android.ticb.base.core.AppResources.imgSkyBG;
v0 = (( android.graphics.Bitmap ) v0 ).getWidth ( ); // invoke-virtual {v0}, Landroid/graphics/Bitmap;->getWidth()I
/* int-to-float v0, v0 */
/* .line 90 */
return;
} // .end method
static void access$0 ( de.nurogames.android.ticb.base.objects.objAnimBackground p0, Float p1 ) { //synthethic
/* .locals 0 */
/* .prologue */
/* .line 35 */
/* iput p1, p0, Lde/nurogames/android/ticb/base/objects/objAnimBackground;->x:F */
return;
} // .end method
static Float access$1 ( de.nurogames.android.ticb.base.objects.objAnimBackground p0 ) { //synthethic
/* .locals 1 */
/* .prologue */
/* .line 35 */
/* iget v0, p0, Lde/nurogames/android/ticb/base/objects/objAnimBackground;->x:F */
} // .end method
static void access$10 ( Float p0 ) { //synthethic
/* .locals 0 */
/* .prologue */
/* .line 17 */
return;
} // .end method
static de.nurogames.android.ticb.base.objects.objCloud access$11 ( ) { //synthethic
/* .locals 1 */
/* .prologue */
/* .line 29 */
v0 = de.nurogames.android.ticb.base.objects.objAnimBackground.clouds;
} // .end method
static void access$2 ( Float p0 ) { //synthethic
/* .locals 0 */
/* .prologue */
/* .line 19 */
return;
} // .end method
static void access$3 ( Float p0 ) { //synthethic
/* .locals 0 */
/* .prologue */
/* .line 20 */
return;
} // .end method
static Float access$4 ( ) { //synthethic
/* .locals 1 */
/* .prologue */
/* .line 18 */
} // .end method
static Float access$5 ( ) { //synthethic
/* .locals 1 */
/* .prologue */
/* .line 19 */
} // .end method
static Float access$6 ( ) { //synthethic
/* .locals 1 */
/* .prologue */
/* .line 21 */
} // .end method
static void access$7 ( Float p0 ) { //synthethic
/* .locals 0 */
/* .prologue */
/* .line 18 */
return;
} // .end method
static Float access$8 ( ) { //synthethic
/* .locals 1 */
/* .prologue */
/* .line 17 */
} // .end method
static Float access$9 ( ) { //synthethic
/* .locals 1 */
/* .prologue */
/* .line 20 */
} // .end method
/* # virtual methods */
public void animate ( ) {
/* .locals 1 */
/* .prologue */
/* .line 143 */
v0 = this.animateThread;
(( java.lang.Thread ) v0 ).run ( ); // invoke-virtual {v0}, Ljava/lang/Thread;->run()V
/* .line 144 */
return;
} // .end method
public void onDraw ( android.graphics.Canvas p0 ) {
/* .locals 7 */
/* .param p1, "g" # Landroid/graphics/Canvas; */
/* .prologue */
/* const/high16 v6, 0x42000000 # 32.0f */
int v5 = 0; // const/4 v5, 0x0
int v4 = 0; // const/4 v4, 0x0
/* .line 95 */
v1 = de.nurogames.android.ticb.base.core.AppResources.imgSkyBG;
(( android.graphics.Canvas ) p1 ).drawBitmap ( v1, v5, v5, v4 ); // invoke-virtual {p1, v1, v5, v5, v4}, Landroid/graphics/Canvas;->drawBitmap(Landroid/graphics/Bitmap;FFLandroid/graphics/Paint;)V
/* .line 100 */
v1 = de.nurogames.android.ticb.base.tinysanta.INFO_MODEL;
final String v2 = "ideos x5"; // const-string v2, "ideos x5"
v1 = (( java.lang.String ) v1 ).equalsIgnoreCase ( v2 ); // invoke-virtual {v1, v2}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z
/* if-nez v1, :cond_0 */
/* .line 101 */
v1 = de.nurogames.android.ticb.base.tinysanta.INFO_MODEL;
final String v2 = "milestone"; // const-string v2, "milestone"
v1 = (( java.lang.String ) v1 ).equalsIgnoreCase ( v2 ); // invoke-virtual {v1, v2}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z
/* if-nez v1, :cond_0 */
/* .line 105 */
v1 = de.nurogames.android.ticb.base.core.AppResources.imgCloudLng;
/* sub-float v2, v5, v2 */
/* iget v3, p0, Lde/nurogames/android/ticb/base/objects/objAnimBackground;->bottom_cloud_y:I */
/* int-to-float v3, v3 */
(( android.graphics.Canvas ) p1 ).drawBitmap ( v1, v2, v3, v4 ); // invoke-virtual {p1, v1, v2, v3, v4}, Landroid/graphics/Canvas;->drawBitmap(Landroid/graphics/Bitmap;FFLandroid/graphics/Paint;)V
/* .line 106 */
v1 = de.nurogames.android.ticb.base.core.AppResources.imgCloudLng;
/* sub-float/2addr v2, v3 */
/* iget v3, p0, Lde/nurogames/android/ticb/base/objects/objAnimBackground;->bottom_cloud_y:I */
/* int-to-float v3, v3 */
(( android.graphics.Canvas ) p1 ).drawBitmap ( v1, v2, v3, v4 ); // invoke-virtual {p1, v1, v2, v3, v4}, Landroid/graphics/Canvas;->drawBitmap(Landroid/graphics/Bitmap;FFLandroid/graphics/Paint;)V
/* .line 110 */
} // :cond_0
v1 = de.nurogames.android.ticb.base.core.AppResources.imgCloudFades;
/* sub-float v2, v5, v2 */
(( android.graphics.Canvas ) p1 ).drawBitmap ( v1, v2, v6, v4 ); // invoke-virtual {p1, v1, v2, v6, v4}, Landroid/graphics/Canvas;->drawBitmap(Landroid/graphics/Bitmap;FFLandroid/graphics/Paint;)V
/* .line 111 */
v1 = de.nurogames.android.ticb.base.core.AppResources.imgCloudFades;
/* sub-float/2addr v2, v3 */
(( android.graphics.Canvas ) p1 ).drawBitmap ( v1, v2, v6, v4 ); // invoke-virtual {p1, v1, v2, v6, v4}, Landroid/graphics/Canvas;->drawBitmap(Landroid/graphics/Bitmap;FFLandroid/graphics/Paint;)V
/* .line 113 */
v2 = de.nurogames.android.ticb.base.objects.objAnimBackground.clouds;
/* array-length v3, v2 */
int v1 = 0; // const/4 v1, 0x0
} // :goto_0
/* if-lt v1, v3, :cond_1 */
/* .line 118 */
return;
/* .line 113 */
} // :cond_1
/* aget-object v0, v2, v1 */
/* .line 114 */
/* .local v0, "c":Lde/nurogames/android/ticb/base/objects/objCloud; */
/* iget v4, v0, Lde/nurogames/android/ticb/base/objects/objCloud;->mX:F */
/* iget v5, v0, Lde/nurogames/android/ticb/base/objects/objCloud;->mW:I */
/* rsub-int/lit8 v5, v5, 0x0 */
/* int-to-float v5, v5 */
/* cmpl-float v4, v4, v5 */
/* if-lez v4, :cond_2 */
/* iget v4, v0, Lde/nurogames/android/ticb/base/objects/objCloud;->mX:F */
/* iget v5, p0, Lde/nurogames/android/ticb/base/objects/objAnimBackground;->twice_display_x:I */
/* iget v6, v0, Lde/nurogames/android/ticb/base/objects/objCloud;->mW:I */
/* add-int/2addr v5, v6 */
/* int-to-float v5, v5 */
/* cmpg-float v4, v4, v5 */
/* if-gez v4, :cond_2 */
/* .line 115 */
(( de.nurogames.android.ticb.base.objects.objCloud ) v0 ).onDraw ( p1 ); // invoke-virtual {v0, p1}, Lde/nurogames/android/ticb/base/objects/objCloud;->onDraw(Landroid/graphics/Canvas;)V
/* .line 113 */
} // :cond_2
/* add-int/lit8 v1, v1, 0x1 */
} // .end method
