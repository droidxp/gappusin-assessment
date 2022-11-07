public class de.nurogames.android.ticb.base.objects.objAnimMenuBackground {
	 /* .source "objAnimMenuBackground.java" */
	 /* # static fields */
	 static final Integer CLOUD_BIG;
	 static final Integer CLOUD_MED;
	 static final Integer CLOUD_SML;
	 /* # instance fields */
	 java.lang.Thread animateThread;
	 private Integer bottom_cloud_y;
	 private final de.nurogames.android.ticb.base.objects.objCloud clouds;
	 private Float l1_speed;
	 private Float l2_speed;
	 private Float layer1_x_offset;
	 private Float layer2_x_offset;
	 private Integer long_cloud;
	 private Integer long_fades;
	 private Float max_offset;
	 private final java.util.Random rnd;
	 private Integer twice_display_x;
	 Float x;
	 /* # direct methods */
	 public de.nurogames.android.ticb.base.objects.objAnimMenuBackground ( ) {
		 /* .locals 9 */
		 /* .prologue */
		 int v5 = 2; // const/4 v5, 0x2
		 int v1 = 0; // const/4 v1, 0x0
		 int v8 = 0; // const/4 v8, 0x0
		 /* const/16 v7, 0x64 */
		 int v6 = 1; // const/4 v6, 0x1
		 /* .line 41 */
		 /* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
		 /* .line 14 */
		 /* new-instance v0, Ljava/util/Random; */
		 /* invoke-direct {v0}, Ljava/util/Random;-><init>()V */
		 this.rnd = v0;
		 /* .line 17 */
		 /* iput v1, p0, Lde/nurogames/android/ticb/base/objects/objAnimMenuBackground;->layer1_x_offset:F */
		 /* .line 18 */
		 /* iput v1, p0, Lde/nurogames/android/ticb/base/objects/objAnimMenuBackground;->layer2_x_offset:F */
		 /* .line 31 */
		 /* iput v8, p0, Lde/nurogames/android/ticb/base/objects/objAnimMenuBackground;->bottom_cloud_y:I */
		 /* .line 33 */
		 /* mul-int/lit8 v0, v0, 0x2 */
		 /* iput v0, p0, Lde/nurogames/android/ticb/base/objects/objAnimMenuBackground;->twice_display_x:I */
		 /* .line 35 */
		 v0 = de.nurogames.android.ticb.base.core.AppResources.imgCloudLng;
		 v0 = 		 (( android.graphics.Bitmap ) v0 ).getWidth ( ); // invoke-virtual {v0}, Landroid/graphics/Bitmap;->getWidth()I
		 /* iput v0, p0, Lde/nurogames/android/ticb/base/objects/objAnimMenuBackground;->long_cloud:I */
		 /* .line 37 */
		 v0 = de.nurogames.android.ticb.base.core.AppResources.imgCloudFades;
		 v0 = 		 (( android.graphics.Bitmap ) v0 ).getWidth ( ); // invoke-virtual {v0}, Landroid/graphics/Bitmap;->getWidth()I
		 /* iput v0, p0, Lde/nurogames/android/ticb/base/objects/objAnimMenuBackground;->long_fades:I */
		 /* .line 114 */
		 /* new-instance v0, Lde/nurogames/android/ticb/base/objects/objAnimMenuBackground$1; */
		 final String v1 = "cloudanim_menu"; // const-string v1, "cloudanim_menu"
		 /* invoke-direct {v0, p0, v1}, Lde/nurogames/android/ticb/base/objects/objAnimMenuBackground$1;-><init>(Lde/nurogames/android/ticb/base/objects/objAnimMenuBackground;Ljava/lang/String;)V */
		 this.animateThread = v0;
		 /* .line 43 */
		 v1 = de.nurogames.android.ticb.base.core.AppResources.imgCloudLng;
		 v1 = 		 (( android.graphics.Bitmap ) v1 ).getHeight ( ); // invoke-virtual {v1}, Landroid/graphics/Bitmap;->getHeight()I
		 /* sub-int/2addr v0, v1 */
		 /* iput v0, p0, Lde/nurogames/android/ticb/base/objects/objAnimMenuBackground;->bottom_cloud_y:I */
		 /* .line 44 */
		 v0 = de.nurogames.android.ticb.base.tinysanta.cntx;
		 (( android.content.Context ) v0 ).getResources ( ); // invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;
		 (( android.content.res.Resources ) v0 ).getIntArray ( v1 ); // invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getIntArray(I)[I
		 /* aget v0, v0, v1 */
		 /* new-array v0, v0, [Lde/nurogames/android/ticb/base/objects/objCloud; */
		 this.clouds = v0;
		 /* .line 47 */
		 v0 = this.clouds;
		 /* new-instance v1, Lde/nurogames/android/ticb/base/objects/objCloud; */
		 /* .line 48 */
		 v3 = this.rnd;
		 /* iget v4, p0, Lde/nurogames/android/ticb/base/objects/objAnimMenuBackground;->twice_display_x:I */
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
		 /* .line 51 */
		 v0 = this.clouds;
		 /* new-instance v1, Lde/nurogames/android/ticb/base/objects/objCloud; */
		 /* .line 52 */
		 v3 = this.rnd;
		 /* iget v4, p0, Lde/nurogames/android/ticb/base/objects/objAnimMenuBackground;->twice_display_x:I */
		 v3 = 		 (( java.util.Random ) v3 ).nextInt ( v4 ); // invoke-virtual {v3, v4}, Ljava/util/Random;->nextInt(I)I
		 /* add-int/2addr v2, v3 */
		 /* int-to-float v2, v2 */
		 /* .line 53 */
		 v3 = de.nurogames.android.ticb.base.core.AppResources.imgCloud;
		 /* aget-object v3, v3, v6 */
		 v3 = 		 (( android.graphics.Bitmap ) v3 ).getHeight ( ); // invoke-virtual {v3}, Landroid/graphics/Bitmap;->getHeight()I
		 v4 = this.rnd;
		 v4 = 		 (( java.util.Random ) v4 ).nextInt ( v7 ); // invoke-virtual {v4, v7}, Ljava/util/Random;->nextInt(I)I
		 /* add-int/2addr v3, v4 */
		 /* .line 54 */
		 /* invoke-direct {v1, v2, v3, v6}, Lde/nurogames/android/ticb/base/objects/objCloud;-><init>(FII)V */
		 /* .line 51 */
		 /* aput-object v1, v0, v6 */
		 /* .line 55 */
		 v0 = this.clouds;
		 /* new-instance v1, Lde/nurogames/android/ticb/base/objects/objCloud; */
		 /* .line 56 */
		 v3 = this.rnd;
		 /* iget v4, p0, Lde/nurogames/android/ticb/base/objects/objAnimMenuBackground;->twice_display_x:I */
		 v3 = 		 (( java.util.Random ) v3 ).nextInt ( v4 ); // invoke-virtual {v3, v4}, Ljava/util/Random;->nextInt(I)I
		 /* add-int/2addr v2, v3 */
		 /* int-to-float v2, v2 */
		 /* .line 57 */
		 v3 = de.nurogames.android.ticb.base.core.AppResources.imgCloud;
		 /* aget-object v3, v3, v6 */
		 v3 = 		 (( android.graphics.Bitmap ) v3 ).getHeight ( ); // invoke-virtual {v3}, Landroid/graphics/Bitmap;->getHeight()I
		 v4 = this.rnd;
		 v4 = 		 (( java.util.Random ) v4 ).nextInt ( v7 ); // invoke-virtual {v4, v7}, Ljava/util/Random;->nextInt(I)I
		 /* add-int/2addr v3, v4 */
		 /* .line 58 */
		 /* invoke-direct {v1, v2, v3, v8}, Lde/nurogames/android/ticb/base/objects/objCloud;-><init>(FII)V */
		 /* .line 55 */
		 /* aput-object v1, v0, v5 */
		 /* .line 60 */
		 v0 = this.clouds;
		 /* array-length v0, v0 */
		 int v1 = 3; // const/4 v1, 0x3
		 /* if-le v0, v1, :cond_0 */
		 /* .line 62 */
		 v0 = this.clouds;
		 int v1 = 3; // const/4 v1, 0x3
		 /* new-instance v2, Lde/nurogames/android/ticb/base/objects/objCloud; */
		 /* .line 63 */
		 v4 = this.rnd;
		 /* iget v5, p0, Lde/nurogames/android/ticb/base/objects/objAnimMenuBackground;->twice_display_x:I */
		 v4 = 		 (( java.util.Random ) v4 ).nextInt ( v5 ); // invoke-virtual {v4, v5}, Ljava/util/Random;->nextInt(I)I
		 /* add-int/2addr v3, v4 */
		 /* int-to-float v3, v3 */
		 /* .line 64 */
		 v4 = de.nurogames.android.ticb.base.core.AppResources.imgCloud;
		 /* aget-object v4, v4, v6 */
		 v4 = 		 (( android.graphics.Bitmap ) v4 ).getHeight ( ); // invoke-virtual {v4}, Landroid/graphics/Bitmap;->getHeight()I
		 v5 = this.rnd;
		 v5 = 		 (( java.util.Random ) v5 ).nextInt ( v7 ); // invoke-virtual {v5, v7}, Ljava/util/Random;->nextInt(I)I
		 /* add-int/2addr v4, v5 */
		 /* .line 65 */
		 /* invoke-direct {v2, v3, v4, v6}, Lde/nurogames/android/ticb/base/objects/objCloud;-><init>(FII)V */
		 /* .line 62 */
		 /* aput-object v2, v0, v1 */
		 /* .line 67 */
		 v0 = this.clouds;
		 int v1 = 4; // const/4 v1, 0x4
		 /* new-instance v2, Lde/nurogames/android/ticb/base/objects/objCloud; */
		 /* .line 68 */
		 v4 = this.rnd;
		 /* iget v5, p0, Lde/nurogames/android/ticb/base/objects/objAnimMenuBackground;->twice_display_x:I */
		 v4 = 		 (( java.util.Random ) v4 ).nextInt ( v5 ); // invoke-virtual {v4, v5}, Ljava/util/Random;->nextInt(I)I
		 /* add-int/2addr v3, v4 */
		 /* int-to-float v3, v3 */
		 /* .line 69 */
		 v4 = de.nurogames.android.ticb.base.core.AppResources.imgCloud;
		 /* aget-object v4, v4, v6 */
		 v4 = 		 (( android.graphics.Bitmap ) v4 ).getHeight ( ); // invoke-virtual {v4}, Landroid/graphics/Bitmap;->getHeight()I
		 v5 = this.rnd;
		 v5 = 		 (( java.util.Random ) v5 ).nextInt ( v7 ); // invoke-virtual {v5, v7}, Ljava/util/Random;->nextInt(I)I
		 /* add-int/2addr v4, v5 */
		 /* .line 70 */
		 /* invoke-direct {v2, v3, v4, v8}, Lde/nurogames/android/ticb/base/objects/objCloud;-><init>(FII)V */
		 /* .line 67 */
		 /* aput-object v2, v0, v1 */
		 /* .line 74 */
	 } // :cond_0
	 v0 = this.clouds;
	 /* array-length v0, v0 */
	 int v1 = 5; // const/4 v1, 0x5
	 /* if-le v0, v1, :cond_1 */
	 /* .line 75 */
	 v0 = this.clouds;
	 int v1 = 5; // const/4 v1, 0x5
	 /* new-instance v2, Lde/nurogames/android/ticb/base/objects/objCloud; */
	 /* .line 76 */
	 v4 = this.rnd;
	 /* iget v5, p0, Lde/nurogames/android/ticb/base/objects/objAnimMenuBackground;->twice_display_x:I */
	 v4 = 	 (( java.util.Random ) v4 ).nextInt ( v5 ); // invoke-virtual {v4, v5}, Ljava/util/Random;->nextInt(I)I
	 /* add-int/2addr v3, v4 */
	 /* int-to-float v3, v3 */
	 /* .line 77 */
	 v4 = de.nurogames.android.ticb.base.core.AppResources.imgCloud;
	 /* aget-object v4, v4, v6 */
	 v4 = 	 (( android.graphics.Bitmap ) v4 ).getHeight ( ); // invoke-virtual {v4}, Landroid/graphics/Bitmap;->getHeight()I
	 v5 = this.rnd;
	 v5 = 	 (( java.util.Random ) v5 ).nextInt ( v7 ); // invoke-virtual {v5, v7}, Ljava/util/Random;->nextInt(I)I
	 /* add-int/2addr v4, v5 */
	 /* .line 78 */
	 /* invoke-direct {v2, v3, v4, v8}, Lde/nurogames/android/ticb/base/objects/objCloud;-><init>(FII)V */
	 /* .line 75 */
	 /* aput-object v2, v0, v1 */
	 /* .line 79 */
	 v0 = this.clouds;
	 int v1 = 6; // const/4 v1, 0x6
	 /* new-instance v2, Lde/nurogames/android/ticb/base/objects/objCloud; */
	 /* .line 80 */
	 v4 = this.rnd;
	 /* iget v5, p0, Lde/nurogames/android/ticb/base/objects/objAnimMenuBackground;->twice_display_x:I */
	 v4 = 	 (( java.util.Random ) v4 ).nextInt ( v5 ); // invoke-virtual {v4, v5}, Ljava/util/Random;->nextInt(I)I
	 /* add-int/2addr v3, v4 */
	 /* int-to-float v3, v3 */
	 /* .line 81 */
	 v4 = de.nurogames.android.ticb.base.core.AppResources.imgCloud;
	 /* aget-object v4, v4, v6 */
	 v4 = 	 (( android.graphics.Bitmap ) v4 ).getHeight ( ); // invoke-virtual {v4}, Landroid/graphics/Bitmap;->getHeight()I
	 v5 = this.rnd;
	 v5 = 	 (( java.util.Random ) v5 ).nextInt ( v7 ); // invoke-virtual {v5, v7}, Ljava/util/Random;->nextInt(I)I
	 /* add-int/2addr v4, v5 */
	 /* .line 82 */
	 /* invoke-direct {v2, v3, v4, v8}, Lde/nurogames/android/ticb/base/objects/objCloud;-><init>(FII)V */
	 /* .line 79 */
	 /* aput-object v2, v0, v1 */
	 /* .line 85 */
} // :cond_1
/* const/high16 v0, 0x40400000 # 3.0f */
/* iput v0, p0, Lde/nurogames/android/ticb/base/objects/objAnimMenuBackground;->l1_speed:F */
/* .line 86 */
/* const/high16 v0, 0x3f800000 # 1.0f */
/* iput v0, p0, Lde/nurogames/android/ticb/base/objects/objAnimMenuBackground;->l2_speed:F */
/* .line 88 */
v0 = de.nurogames.android.ticb.base.core.AppResources.imgSkyBG;
v0 = (( android.graphics.Bitmap ) v0 ).getWidth ( ); // invoke-virtual {v0}, Landroid/graphics/Bitmap;->getWidth()I
/* int-to-float v0, v0 */
/* iput v0, p0, Lde/nurogames/android/ticb/base/objects/objAnimMenuBackground;->max_offset:F */
/* .line 90 */
return;
} // .end method
static void access$0 ( de.nurogames.android.ticb.base.objects.objAnimMenuBackground p0, Float p1 ) { //synthethic
/* .locals 0 */
/* .prologue */
/* .line 19 */
/* iput p1, p0, Lde/nurogames/android/ticb/base/objects/objAnimMenuBackground;->l1_speed:F */
return;
} // .end method
static void access$1 ( de.nurogames.android.ticb.base.objects.objAnimMenuBackground p0, Float p1 ) { //synthethic
/* .locals 0 */
/* .prologue */
/* .line 20 */
/* iput p1, p0, Lde/nurogames/android/ticb/base/objects/objAnimMenuBackground;->l2_speed:F */
return;
} // .end method
static Float access$2 ( de.nurogames.android.ticb.base.objects.objAnimMenuBackground p0 ) { //synthethic
/* .locals 1 */
/* .prologue */
/* .line 18 */
/* iget v0, p0, Lde/nurogames/android/ticb/base/objects/objAnimMenuBackground;->layer2_x_offset:F */
} // .end method
static Float access$3 ( de.nurogames.android.ticb.base.objects.objAnimMenuBackground p0 ) { //synthethic
/* .locals 1 */
/* .prologue */
/* .line 20 */
/* iget v0, p0, Lde/nurogames/android/ticb/base/objects/objAnimMenuBackground;->l2_speed:F */
} // .end method
static Float access$4 ( de.nurogames.android.ticb.base.objects.objAnimMenuBackground p0 ) { //synthethic
/* .locals 1 */
/* .prologue */
/* .line 21 */
/* iget v0, p0, Lde/nurogames/android/ticb/base/objects/objAnimMenuBackground;->max_offset:F */
} // .end method
static void access$5 ( de.nurogames.android.ticb.base.objects.objAnimMenuBackground p0, Float p1 ) { //synthethic
/* .locals 0 */
/* .prologue */
/* .line 18 */
/* iput p1, p0, Lde/nurogames/android/ticb/base/objects/objAnimMenuBackground;->layer2_x_offset:F */
return;
} // .end method
static Float access$6 ( de.nurogames.android.ticb.base.objects.objAnimMenuBackground p0 ) { //synthethic
/* .locals 1 */
/* .prologue */
/* .line 17 */
/* iget v0, p0, Lde/nurogames/android/ticb/base/objects/objAnimMenuBackground;->layer1_x_offset:F */
} // .end method
static Float access$7 ( de.nurogames.android.ticb.base.objects.objAnimMenuBackground p0 ) { //synthethic
/* .locals 1 */
/* .prologue */
/* .line 19 */
/* iget v0, p0, Lde/nurogames/android/ticb/base/objects/objAnimMenuBackground;->l1_speed:F */
} // .end method
static void access$8 ( de.nurogames.android.ticb.base.objects.objAnimMenuBackground p0, Float p1 ) { //synthethic
/* .locals 0 */
/* .prologue */
/* .line 17 */
/* iput p1, p0, Lde/nurogames/android/ticb/base/objects/objAnimMenuBackground;->layer1_x_offset:F */
return;
} // .end method
static de.nurogames.android.ticb.base.objects.objCloud access$9 ( de.nurogames.android.ticb.base.objects.objAnimMenuBackground p0 ) { //synthethic
/* .locals 1 */
/* .prologue */
/* .line 29 */
v0 = this.clouds;
} // .end method
/* # virtual methods */
public void animate ( ) {
/* .locals 1 */
/* .prologue */
/* .line 138 */
v0 = this.animateThread;
(( java.lang.Thread ) v0 ).run ( ); // invoke-virtual {v0}, Ljava/lang/Thread;->run()V
/* .line 139 */
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
/* .line 98 */
v1 = de.nurogames.android.ticb.base.core.AppResources.imgCloudLng;
/* iget v2, p0, Lde/nurogames/android/ticb/base/objects/objAnimMenuBackground;->layer2_x_offset:F */
/* sub-float v2, v5, v2 */
/* iget v3, p0, Lde/nurogames/android/ticb/base/objects/objAnimMenuBackground;->bottom_cloud_y:I */
/* int-to-float v3, v3 */
(( android.graphics.Canvas ) p1 ).drawBitmap ( v1, v2, v3, v4 ); // invoke-virtual {p1, v1, v2, v3, v4}, Landroid/graphics/Canvas;->drawBitmap(Landroid/graphics/Bitmap;FFLandroid/graphics/Paint;)V
/* .line 99 */
v1 = de.nurogames.android.ticb.base.core.AppResources.imgCloudLng;
/* iget v2, p0, Lde/nurogames/android/ticb/base/objects/objAnimMenuBackground;->long_cloud:I */
/* int-to-float v2, v2 */
/* iget v3, p0, Lde/nurogames/android/ticb/base/objects/objAnimMenuBackground;->layer2_x_offset:F */
/* sub-float/2addr v2, v3 */
/* iget v3, p0, Lde/nurogames/android/ticb/base/objects/objAnimMenuBackground;->bottom_cloud_y:I */
/* int-to-float v3, v3 */
(( android.graphics.Canvas ) p1 ).drawBitmap ( v1, v2, v3, v4 ); // invoke-virtual {p1, v1, v2, v3, v4}, Landroid/graphics/Canvas;->drawBitmap(Landroid/graphics/Bitmap;FFLandroid/graphics/Paint;)V
/* .line 102 */
v1 = de.nurogames.android.ticb.base.core.AppResources.imgCloudFades;
/* iget v2, p0, Lde/nurogames/android/ticb/base/objects/objAnimMenuBackground;->layer1_x_offset:F */
/* sub-float v2, v5, v2 */
(( android.graphics.Canvas ) p1 ).drawBitmap ( v1, v2, v6, v4 ); // invoke-virtual {p1, v1, v2, v6, v4}, Landroid/graphics/Canvas;->drawBitmap(Landroid/graphics/Bitmap;FFLandroid/graphics/Paint;)V
/* .line 103 */
v1 = de.nurogames.android.ticb.base.core.AppResources.imgCloudFades;
/* iget v2, p0, Lde/nurogames/android/ticb/base/objects/objAnimMenuBackground;->long_fades:I */
/* int-to-float v2, v2 */
/* iget v3, p0, Lde/nurogames/android/ticb/base/objects/objAnimMenuBackground;->layer1_x_offset:F */
/* sub-float/2addr v2, v3 */
(( android.graphics.Canvas ) p1 ).drawBitmap ( v1, v2, v6, v4 ); // invoke-virtual {p1, v1, v2, v6, v4}, Landroid/graphics/Canvas;->drawBitmap(Landroid/graphics/Bitmap;FFLandroid/graphics/Paint;)V
/* .line 106 */
v2 = this.clouds;
/* array-length v3, v2 */
int v1 = 0; // const/4 v1, 0x0
} // :goto_0
/* if-lt v1, v3, :cond_0 */
/* .line 111 */
return;
/* .line 106 */
} // :cond_0
/* aget-object v0, v2, v1 */
/* .line 107 */
/* .local v0, "c":Lde/nurogames/android/ticb/base/objects/objCloud; */
/* iget v4, v0, Lde/nurogames/android/ticb/base/objects/objCloud;->mX:F */
/* iget v5, v0, Lde/nurogames/android/ticb/base/objects/objCloud;->mW:I */
/* rsub-int/lit8 v5, v5, 0x0 */
/* int-to-float v5, v5 */
/* cmpl-float v4, v4, v5 */
/* if-lez v4, :cond_1 */
/* iget v4, v0, Lde/nurogames/android/ticb/base/objects/objCloud;->mX:F */
/* iget v5, p0, Lde/nurogames/android/ticb/base/objects/objAnimMenuBackground;->twice_display_x:I */
/* iget v6, v0, Lde/nurogames/android/ticb/base/objects/objCloud;->mW:I */
/* add-int/2addr v5, v6 */
/* int-to-float v5, v5 */
/* cmpg-float v4, v4, v5 */
/* if-gez v4, :cond_1 */
/* .line 108 */
(( de.nurogames.android.ticb.base.objects.objCloud ) v0 ).onDraw ( p1 ); // invoke-virtual {v0, p1}, Lde/nurogames/android/ticb/base/objects/objCloud;->onDraw(Landroid/graphics/Canvas;)V
/* .line 106 */
} // :cond_1
/* add-int/lit8 v1, v1, 0x1 */
} // .end method
