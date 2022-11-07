public class de.nurogames.android.ticb.base.objects.objPauseOverlay {
	 /* .source "objPauseOverlay.java" */
	 /* # static fields */
	 static Integer VIEWMODE_SCORES;
	 static Integer VIEWMODE_TASKS;
	 static final Integer list_font_dif;
	 static Integer list_top;
	 static Integer menu_top;
	 /* # instance fields */
	 private Integer FONT_LARGE;
	 private Integer FONT_MEDIUM;
	 check;
	 private Integer icon_offset;
	 Integer len;
	 private Integer list_spacing;
	 private list_x;
	 private android.graphics.Paint mPaint;
	 public Integer mViewMode;
	 public de.nurogames.android.ticb.base.objects.objMenuButton menuButtons;
	 private Integer multiplier_bar_y;
	 private Integer pause_x;
	 private Integer pause_y;
	 android.content.res.Resources res;
	 private java.text.DecimalFormat secsformat;
	 private [Ljava.lang.String task_quest_names;
	 private android.graphics.Typeface tf;
	 /* # direct methods */
	 static de.nurogames.android.ticb.base.objects.objPauseOverlay ( ) {
		 /* .locals 1 */
		 /* .prologue */
		 int v0 = 0; // const/4 v0, 0x0
		 /* .line 31 */
		 /* .line 40 */
		 /* .line 52 */
		 /* .line 53 */
		 int v0 = 1; // const/4 v0, 0x1
		 return;
	 } // .end method
	 public de.nurogames.android.ticb.base.objects.objPauseOverlay ( ) {
		 /* .locals 3 */
		 /* .prologue */
		 int v2 = 0; // const/4 v2, 0x0
		 /* .line 59 */
		 /* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
		 /* .line 21 */
		 /* iput v2, p0, Lde/nurogames/android/ticb/base/objects/objPauseOverlay;->icon_offset:I */
		 /* .line 24 */
		 /* new-instance v0, Ljava/text/DecimalFormat; */
		 final String v1 = "##0.00"; // const-string v1, "##0.00"
		 /* invoke-direct {v0, v1}, Ljava/text/DecimalFormat;-><init>(Ljava/lang/String;)V */
		 this.secsformat = v0;
		 /* .line 27 */
		 /* new-instance v0, Landroid/graphics/Paint; */
		 /* invoke-direct {v0}, Landroid/graphics/Paint;-><init>()V */
		 this.mPaint = v0;
		 /* .line 30 */
		 int v0 = 3; // const/4 v0, 0x3
		 /* new-array v0, v0, [I */
		 this.list_x = v0;
		 /* .line 32 */
		 /* const/16 v0, 0x1c */
		 /* iput v0, p0, Lde/nurogames/android/ticb/base/objects/objPauseOverlay;->list_spacing:I */
		 /* .line 38 */
		 int v0 = 5; // const/4 v0, 0x5
		 /* new-array v0, v0, [Lde/nurogames/android/ticb/base/objects/objMenuButton; */
		 this.menuButtons = v0;
		 /* .line 42 */
		 /* iput v2, p0, Lde/nurogames/android/ticb/base/objects/objPauseOverlay;->mViewMode:I */
		 /* .line 46 */
		 /* iput v2, p0, Lde/nurogames/android/ticb/base/objects/objPauseOverlay;->pause_x:I */
		 /* .line 47 */
		 /* iput v2, p0, Lde/nurogames/android/ticb/base/objects/objPauseOverlay;->pause_y:I */
		 /* .line 49 */
		 /* iput v2, p0, Lde/nurogames/android/ticb/base/objects/objPauseOverlay;->FONT_MEDIUM:I */
		 /* .line 50 */
		 /* iput v2, p0, Lde/nurogames/android/ticb/base/objects/objPauseOverlay;->FONT_LARGE:I */
		 /* .line 55 */
		 /* iput v2, p0, Lde/nurogames/android/ticb/base/objects/objPauseOverlay;->multiplier_bar_y:I */
		 /* .line 60 */
		 (( de.nurogames.android.ticb.base.objects.objPauseOverlay ) p0 ).init ( ); // invoke-virtual {p0}, Lde/nurogames/android/ticb/base/objects/objPauseOverlay;->init()V
		 /* .line 61 */
		 return;
	 } // .end method
	 /* # virtual methods */
	 public void init ( ) {
		 /* .locals 10 */
		 /* .prologue */
		 /* const v3, 0x3f4ccccd # 0.8f */
		 int v1 = 0; // const/4 v1, 0x0
		 int v9 = 1; // const/4 v9, 0x1
		 int v8 = 0; // const/4 v8, 0x0
		 /* .line 68 */
		 v0 = this.mPaint;
		 (( android.graphics.Paint ) v0 ).setAntiAlias ( v9 ); // invoke-virtual {v0, v9}, Landroid/graphics/Paint;->setAntiAlias(Z)V
		 /* .line 69 */
		 v0 = de.nurogames.android.ticb.base.tinysanta.cntx;
		 (( android.content.Context ) v0 ).getAssets ( ); // invoke-virtual {v0}, Landroid/content/Context;->getAssets()Landroid/content/res/AssetManager;
		 final String v2 = "font.otf"; // const-string v2, "font.otf"
		 android.graphics.Typeface .createFromAsset ( v0,v2 );
		 this.tf = v0;
		 /* .line 70 */
		 v0 = this.mPaint;
		 v2 = this.tf;
		 (( android.graphics.Paint ) v0 ).setTypeface ( v2 ); // invoke-virtual {v0, v2}, Landroid/graphics/Paint;->setTypeface(Landroid/graphics/Typeface;)Landroid/graphics/Typeface;
		 /* .line 72 */
		 v0 = de.nurogames.android.ticb.base.tinysanta.cntx;
		 (( android.content.Context ) v0 ).getResources ( ); // invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;
		 this.res = v0;
		 /* .line 74 */
		 v0 = this.res;
		 (( android.content.res.Resources ) v0 ).getIntArray ( v2 ); // invoke-virtual {v0, v2}, Landroid/content/res/Resources;->getIntArray(I)[I
		 /* aget v0, v0, v2 */
		 /* iput v0, p0, Lde/nurogames/android/ticb/base/objects/objPauseOverlay;->FONT_MEDIUM:I */
		 /* .line 75 */
		 v0 = this.res;
		 (( android.content.res.Resources ) v0 ).getIntArray ( v2 ); // invoke-virtual {v0, v2}, Landroid/content/res/Resources;->getIntArray(I)[I
		 /* aget v0, v0, v2 */
		 /* iput v0, p0, Lde/nurogames/android/ticb/base/objects/objPauseOverlay;->FONT_LARGE:I */
		 /* .line 76 */
		 v0 = this.res;
		 (( android.content.res.Resources ) v0 ).getIntArray ( v2 ); // invoke-virtual {v0, v2}, Landroid/content/res/Resources;->getIntArray(I)[I
		 /* aget v0, v0, v2 */
		 /* iput v0, p0, Lde/nurogames/android/ticb/base/objects/objPauseOverlay;->pause_x:I */
		 /* .line 77 */
		 v0 = this.res;
		 (( android.content.res.Resources ) v0 ).getIntArray ( v2 ); // invoke-virtual {v0, v2}, Landroid/content/res/Resources;->getIntArray(I)[I
		 /* aget v0, v0, v2 */
		 /* iput v0, p0, Lde/nurogames/android/ticb/base/objects/objPauseOverlay;->pause_y:I */
		 /* .line 78 */
		 v0 = this.res;
		 (( android.content.res.Resources ) v0 ).getIntArray ( v2 ); // invoke-virtual {v0, v2}, Landroid/content/res/Resources;->getIntArray(I)[I
		 /* aget v0, v0, v2 */
		 /* .line 79 */
		 v0 = this.res;
		 (( android.content.res.Resources ) v0 ).getIntArray ( v2 ); // invoke-virtual {v0, v2}, Landroid/content/res/Resources;->getIntArray(I)[I
		 /* aget v0, v0, v2 */
		 /* .line 80 */
		 v0 = this.res;
		 (( android.content.res.Resources ) v0 ).getIntArray ( v2 ); // invoke-virtual {v0, v2}, Landroid/content/res/Resources;->getIntArray(I)[I
		 /* aget v0, v0, v2 */
		 /* iput v0, p0, Lde/nurogames/android/ticb/base/objects/objPauseOverlay;->multiplier_bar_y:I */
		 /* .line 82 */
		 /* const/high16 v0, 0x41000000 # 8.0f */
		 v2 = de.nurogames.android.ticb.base.tinysanta.sMetrics;
		 /* iget v2, v2, Landroid/util/DisplayMetrics;->density:F */
		 /* mul-float/2addr v0, v2 */
		 /* float-to-int v0, v0 */
		 /* iput v0, p0, Lde/nurogames/android/ticb/base/objects/objPauseOverlay;->icon_offset:I */
		 /* .line 84 */
		 /* if-ne v0, v2, :cond_0 */
		 /* .line 85 */
		 /* iget v0, p0, Lde/nurogames/android/ticb/base/objects/objPauseOverlay;->FONT_MEDIUM:I */
		 /* int-to-float v0, v0 */
		 /* mul-float/2addr v0, v3 */
		 /* float-to-int v0, v0 */
		 /* iput v0, p0, Lde/nurogames/android/ticb/base/objects/objPauseOverlay;->FONT_MEDIUM:I */
		 /* .line 86 */
		 /* iget v0, p0, Lde/nurogames/android/ticb/base/objects/objPauseOverlay;->FONT_LARGE:I */
		 /* int-to-float v0, v0 */
		 /* mul-float/2addr v0, v3 */
		 /* float-to-int v0, v0 */
		 /* iput v0, p0, Lde/nurogames/android/ticb/base/objects/objPauseOverlay;->FONT_LARGE:I */
		 /* .line 90 */
	 } // :cond_0
	 v6 = this.menuButtons;
	 /* new-instance v0, Lde/nurogames/android/ticb/base/objects/objMenuButton; */
	 /* .line 91 */
	 v3 = de.nurogames.android.ticb.base.core.AppResources.imgMenuResume;
	 /* aget-object v3, v3, v8 */
	 v3 = 	 (( android.graphics.Bitmap ) v3 ).getWidth ( ); // invoke-virtual {v3}, Landroid/graphics/Bitmap;->getWidth()I
	 /* sub-int/2addr v2, v3 */
	 /* .line 92 */
	 /* add-int/lit8 v3, v3, -0x10 */
	 /* .line 93 */
	 v4 = de.nurogames.android.ticb.base.core.AppResources.imgMenuResume;
	 /* aget-object v4, v4, v8 */
	 /* .line 94 */
	 v5 = de.nurogames.android.ticb.base.core.AppResources.imgMenuResume;
	 /* aget-object v5, v5, v9 */
	 /* invoke-direct/range {v0 ..v5}, Lde/nurogames/android/ticb/base/objects/objMenuButton;-><init>(Ljava/lang/String;IILandroid/graphics/Bitmap;Landroid/graphics/Bitmap;)V */
	 /* .line 90 */
	 /* aput-object v0, v6, v8 */
	 /* .line 97 */
	 v6 = this.menuButtons;
	 /* new-instance v0, Lde/nurogames/android/ticb/base/objects/objMenuButton; */
	 /* .line 98 */
	 v3 = de.nurogames.android.ticb.base.core.AppResources.imgMenuNewGame;
	 /* aget-object v3, v3, v8 */
	 v3 = 	 (( android.graphics.Bitmap ) v3 ).getWidth ( ); // invoke-virtual {v3}, Landroid/graphics/Bitmap;->getWidth()I
	 /* sub-int/2addr v2, v3 */
	 /* .line 99 */
	 v4 = de.nurogames.android.ticb.base.core.AppResources.imgSideMenu;
	 v4 = 	 (( android.graphics.Bitmap ) v4 ).getHeight ( ); // invoke-virtual {v4}, Landroid/graphics/Bitmap;->getHeight()I
	 /* int-to-float v4, v4 */
	 /* const v5, 0x3e99999a # 0.3f */
	 /* mul-float/2addr v4, v5 */
	 /* float-to-int v4, v4 */
	 /* add-int/2addr v3, v4 */
	 /* .line 100 */
	 v4 = de.nurogames.android.ticb.base.core.AppResources.imgMenuNewGame;
	 /* aget-object v4, v4, v8 */
	 /* .line 101 */
	 v5 = de.nurogames.android.ticb.base.core.AppResources.imgMenuNewGame;
	 /* aget-object v5, v5, v9 */
	 /* invoke-direct/range {v0 ..v5}, Lde/nurogames/android/ticb/base/objects/objMenuButton;-><init>(Ljava/lang/String;IILandroid/graphics/Bitmap;Landroid/graphics/Bitmap;)V */
	 /* .line 97 */
	 /* aput-object v0, v6, v9 */
	 /* .line 104 */
	 v6 = this.menuButtons;
	 int v7 = 2; // const/4 v7, 0x2
	 /* new-instance v0, Lde/nurogames/android/ticb/base/objects/objMenuButton; */
	 /* .line 105 */
	 v3 = de.nurogames.android.ticb.base.core.AppResources.imgMenuBackToMenu;
	 /* aget-object v3, v3, v8 */
	 v3 = 	 (( android.graphics.Bitmap ) v3 ).getWidth ( ); // invoke-virtual {v3}, Landroid/graphics/Bitmap;->getWidth()I
	 /* sub-int/2addr v2, v3 */
	 /* .line 106 */
	 v4 = de.nurogames.android.ticb.base.core.AppResources.imgSideMenu;
	 v4 = 	 (( android.graphics.Bitmap ) v4 ).getHeight ( ); // invoke-virtual {v4}, Landroid/graphics/Bitmap;->getHeight()I
	 /* int-to-float v4, v4 */
	 /* const v5, 0x3f19999a # 0.6f */
	 /* mul-float/2addr v4, v5 */
	 /* float-to-int v4, v4 */
	 /* add-int/2addr v3, v4 */
	 /* .line 107 */
	 v4 = de.nurogames.android.ticb.base.core.AppResources.imgMenuBackToMenu;
	 /* aget-object v4, v4, v8 */
	 /* .line 108 */
	 v5 = de.nurogames.android.ticb.base.core.AppResources.imgMenuBackToMenu;
	 /* aget-object v5, v5, v9 */
	 /* invoke-direct/range {v0 ..v5}, Lde/nurogames/android/ticb/base/objects/objMenuButton;-><init>(Ljava/lang/String;IILandroid/graphics/Bitmap;Landroid/graphics/Bitmap;)V */
	 /* .line 104 */
	 /* aput-object v0, v6, v7 */
	 /* .line 111 */
	 v6 = this.menuButtons;
	 int v7 = 3; // const/4 v7, 0x3
	 /* new-instance v0, Lde/nurogames/android/ticb/base/objects/objMenuButton; */
	 /* .line 113 */
	 v3 = de.nurogames.android.ticb.base.core.AppResources.imgMenuTasks;
	 /* aget-object v3, v3, v8 */
	 v3 = 	 (( android.graphics.Bitmap ) v3 ).getHeight ( ); // invoke-virtual {v3}, Landroid/graphics/Bitmap;->getHeight()I
	 /* sub-int v3, v2, v3 */
	 /* .line 114 */
	 v2 = de.nurogames.android.ticb.base.core.AppResources.imgMenuTasks;
	 /* aget-object v4, v2, v8 */
	 /* .line 115 */
	 v2 = de.nurogames.android.ticb.base.core.AppResources.imgMenuTasks;
	 /* aget-object v5, v2, v9 */
	 /* move v2, v8 */
	 /* invoke-direct/range {v0 ..v5}, Lde/nurogames/android/ticb/base/objects/objMenuButton;-><init>(Ljava/lang/String;IILandroid/graphics/Bitmap;Landroid/graphics/Bitmap;)V */
	 /* .line 111 */
	 /* aput-object v0, v6, v7 */
	 /* .line 118 */
	 v6 = this.menuButtons;
	 int v7 = 4; // const/4 v7, 0x4
	 /* new-instance v0, Lde/nurogames/android/ticb/base/objects/objMenuButton; */
	 /* .line 120 */
	 v3 = de.nurogames.android.ticb.base.core.AppResources.imgTaskHelp;
	 v3 = 	 (( android.graphics.Bitmap ) v3 ).getHeight ( ); // invoke-virtual {v3}, Landroid/graphics/Bitmap;->getHeight()I
	 /* mul-int/lit8 v3, v3, 0x2 */
	 /* sub-int v3, v2, v3 */
	 /* .line 121 */
	 v4 = de.nurogames.android.ticb.base.core.AppResources.imgTaskHelp;
	 /* .line 122 */
	 v5 = de.nurogames.android.ticb.base.core.AppResources.imgTaskHelp;
	 /* move v2, v8 */
	 /* invoke-direct/range {v0 ..v5}, Lde/nurogames/android/ticb/base/objects/objMenuButton;-><init>(Ljava/lang/String;IILandroid/graphics/Bitmap;Landroid/graphics/Bitmap;)V */
	 /* .line 118 */
	 /* aput-object v0, v6, v7 */
	 /* .line 124 */
	 /* if-nez v0, :cond_2 */
	 /* .line 125 */
	 v0 = de.nurogames.android.ticb.base.core.AppResources.task_quest_names_demo;
	 this.task_quest_names = v0;
	 /* .line 129 */
} // :cond_1
} // :goto_0
return;
/* .line 126 */
} // :cond_2
/* if-ne v0, v9, :cond_1 */
/* .line 127 */
v0 = de.nurogames.android.ticb.base.core.AppResources.task_quest_names_full;
this.task_quest_names = v0;
} // .end method
public void onDraw ( android.graphics.Canvas p0 ) {
/* .locals 11 */
/* .param p1, "g" # Landroid/graphics/Canvas; */
/* .prologue */
int v10 = 4; // const/4 v10, 0x4
int v9 = 2; // const/4 v9, 0x2
int v8 = 0; // const/4 v8, 0x0
int v7 = 1; // const/4 v7, 0x1
int v2 = 5; // const/4 v2, 0x5
/* .line 135 */
/* iget v0, p0, Lde/nurogames/android/ticb/base/objects/objPauseOverlay;->mViewMode:I */
/* if-ne v0, v1, :cond_15 */
/* .line 137 */
v0 = this.res;
(( android.content.res.Resources ) v0 ).getIntArray ( v1 ); // invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getIntArray(I)[I
/* aget v0, v0, v1 */
/* iput v0, p0, Lde/nurogames/android/ticb/base/objects/objPauseOverlay;->list_spacing:I */
/* .line 138 */
v0 = this.list_x;
/* if-nez v0, :cond_0 */
/* .line 139 */
/* if-ne v0, v1, :cond_3 */
/* .line 140 */
/* new-array v0, v2, [I */
/* fill-array-data v0, :array_0 */
this.list_x = v0;
/* .line 177 */
} // :cond_0
} // :goto_0
v0 = this.mPaint;
/* const/high16 v1, -0x1000000 */
(( android.graphics.Paint ) v0 ).setColor ( v1 ); // invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setColor(I)V
/* .line 178 */
v0 = this.mPaint;
/* const/16 v1, 0x8e */
(( android.graphics.Paint ) v0 ).setAlpha ( v1 ); // invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setAlpha(I)V
/* .line 179 */
int v1 = 0; // const/4 v1, 0x0
int v2 = 0; // const/4 v2, 0x0
/* int-to-float v3, v0 */
/* int-to-float v4, v0 */
v5 = this.mPaint;
/* move-object v0, p1 */
/* invoke-virtual/range {v0 ..v5}, Landroid/graphics/Canvas;->drawRect(FFFFLandroid/graphics/Paint;)V */
/* .line 180 */
v0 = de.nurogames.android.ticb.base.core.AppResources.imgPause;
/* iget v1, p0, Lde/nurogames/android/ticb/base/objects/objPauseOverlay;->pause_x:I */
/* int-to-float v1, v1 */
/* iget v2, p0, Lde/nurogames/android/ticb/base/objects/objPauseOverlay;->pause_y:I */
/* int-to-float v2, v2 */
(( android.graphics.Canvas ) p1 ).drawBitmap ( v0, v1, v2, v8 ); // invoke-virtual {p1, v0, v1, v2, v8}, Landroid/graphics/Canvas;->drawBitmap(Landroid/graphics/Bitmap;FFLandroid/graphics/Paint;)V
/* .line 183 */
v0 = this.mPaint;
int v1 = -1; // const/4 v1, -0x1
(( android.graphics.Paint ) v0 ).setColor ( v1 ); // invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setColor(I)V
/* .line 184 */
v0 = this.mPaint;
/* iget v1, p0, Lde/nurogames/android/ticb/base/objects/objPauseOverlay;->FONT_LARGE:I */
/* int-to-float v1, v1 */
(( android.graphics.Paint ) v0 ).setTextSize ( v1 ); // invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setTextSize(F)V
/* .line 185 */
v0 = this.res;
(( android.content.res.Resources ) v0 ).getStringArray ( v1 ); // invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getStringArray(I)[Ljava/lang/String;
/* aget-object v0, v0, v1 */
v1 = this.list_x;
/* aget v1, v1, v7 */
/* int-to-float v1, v1 */
/* iget v3, p0, Lde/nurogames/android/ticb/base/objects/objPauseOverlay;->FONT_LARGE:I */
/* sub-int/2addr v2, v3 */
/* int-to-float v2, v2 */
v3 = this.mPaint;
(( android.graphics.Canvas ) p1 ).drawText ( v0, v1, v2, v3 ); // invoke-virtual {p1, v0, v1, v2, v3}, Landroid/graphics/Canvas;->drawText(Ljava/lang/String;FFLandroid/graphics/Paint;)V
/* .line 188 */
v0 = this.mPaint;
/* iget v1, p0, Lde/nurogames/android/ticb/base/objects/objPauseOverlay;->FONT_MEDIUM:I */
/* int-to-float v1, v1 */
(( android.graphics.Paint ) v0 ).setTextSize ( v1 ); // invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setTextSize(F)V
/* .line 189 */
v0 = this.mPaint;
/* const/16 v1, 0xff */
/* const/16 v2, 0xd8 */
int v3 = 0; // const/4 v3, 0x0
v1 = android.graphics.Color .rgb ( v1,v2,v3 );
(( android.graphics.Paint ) v0 ).setColor ( v1 ); // invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setColor(I)V
/* .line 190 */
v0 = this.res;
(( android.content.res.Resources ) v0 ).getStringArray ( v1 ); // invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getStringArray(I)[Ljava/lang/String;
/* aget-object v0, v0, v1 */
v1 = this.list_x;
/* aget v1, v1, v7 */
/* int-to-float v1, v1 */
/* int-to-float v2, v2 */
v3 = this.mPaint;
(( android.graphics.Canvas ) p1 ).drawText ( v0, v1, v2, v3 ); // invoke-virtual {p1, v0, v1, v2, v3}, Landroid/graphics/Canvas;->drawText(Ljava/lang/String;FFLandroid/graphics/Paint;)V
/* .line 191 */
v0 = this.res;
(( android.content.res.Resources ) v0 ).getStringArray ( v1 ); // invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getStringArray(I)[Ljava/lang/String;
/* aget-object v0, v0, v1 */
v1 = this.list_x;
/* aget v1, v1, v7 */
/* int-to-float v1, v1 */
/* iget v3, p0, Lde/nurogames/android/ticb/base/objects/objPauseOverlay;->list_spacing:I */
/* mul-int/lit8 v3, v3, 0x1 */
/* add-int/2addr v2, v3 */
/* int-to-float v2, v2 */
v3 = this.mPaint;
(( android.graphics.Canvas ) p1 ).drawText ( v0, v1, v2, v3 ); // invoke-virtual {p1, v0, v1, v2, v3}, Landroid/graphics/Canvas;->drawText(Ljava/lang/String;FFLandroid/graphics/Paint;)V
/* .line 192 */
v0 = this.res;
(( android.content.res.Resources ) v0 ).getStringArray ( v1 ); // invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getStringArray(I)[Ljava/lang/String;
/* aget-object v0, v0, v1 */
v1 = this.list_x;
/* aget v1, v1, v7 */
/* int-to-float v1, v1 */
/* iget v3, p0, Lde/nurogames/android/ticb/base/objects/objPauseOverlay;->list_spacing:I */
/* mul-int/lit8 v3, v3, 0x2 */
/* add-int/2addr v2, v3 */
/* int-to-float v2, v2 */
v3 = this.mPaint;
(( android.graphics.Canvas ) p1 ).drawText ( v0, v1, v2, v3 ); // invoke-virtual {p1, v0, v1, v2, v3}, Landroid/graphics/Canvas;->drawText(Ljava/lang/String;FFLandroid/graphics/Paint;)V
/* .line 193 */
v0 = this.res;
(( android.content.res.Resources ) v0 ).getStringArray ( v1 ); // invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getStringArray(I)[Ljava/lang/String;
/* aget-object v0, v0, v1 */
v1 = this.list_x;
/* aget v1, v1, v7 */
/* int-to-float v1, v1 */
/* iget v3, p0, Lde/nurogames/android/ticb/base/objects/objPauseOverlay;->list_spacing:I */
/* mul-int/lit8 v3, v3, 0x3 */
/* add-int/2addr v2, v3 */
/* int-to-float v2, v2 */
v3 = this.mPaint;
(( android.graphics.Canvas ) p1 ).drawText ( v0, v1, v2, v3 ); // invoke-virtual {p1, v0, v1, v2, v3}, Landroid/graphics/Canvas;->drawText(Ljava/lang/String;FFLandroid/graphics/Paint;)V
/* .line 194 */
v0 = this.res;
(( android.content.res.Resources ) v0 ).getStringArray ( v1 ); // invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getStringArray(I)[Ljava/lang/String;
/* aget-object v0, v0, v1 */
v1 = this.list_x;
/* aget v1, v1, v7 */
/* int-to-float v1, v1 */
/* iget v3, p0, Lde/nurogames/android/ticb/base/objects/objPauseOverlay;->list_spacing:I */
/* mul-int/lit8 v3, v3, 0x4 */
/* add-int/2addr v2, v3 */
/* int-to-float v2, v2 */
v3 = this.mPaint;
(( android.graphics.Canvas ) p1 ).drawText ( v0, v1, v2, v3 ); // invoke-virtual {p1, v0, v1, v2, v3}, Landroid/graphics/Canvas;->drawText(Ljava/lang/String;FFLandroid/graphics/Paint;)V
/* .line 195 */
v0 = this.res;
(( android.content.res.Resources ) v0 ).getStringArray ( v1 ); // invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getStringArray(I)[Ljava/lang/String;
/* aget-object v0, v0, v1 */
v1 = this.list_x;
/* aget v1, v1, v7 */
/* int-to-float v1, v1 */
/* iget v3, p0, Lde/nurogames/android/ticb/base/objects/objPauseOverlay;->list_spacing:I */
/* mul-int/lit8 v3, v3, 0x5 */
/* add-int/2addr v2, v3 */
/* int-to-float v2, v2 */
v3 = this.mPaint;
(( android.graphics.Canvas ) p1 ).drawText ( v0, v1, v2, v3 ); // invoke-virtual {p1, v0, v1, v2, v3}, Landroid/graphics/Canvas;->drawText(Ljava/lang/String;FFLandroid/graphics/Paint;)V
/* .line 196 */
v0 = this.res;
(( android.content.res.Resources ) v0 ).getStringArray ( v1 ); // invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getStringArray(I)[Ljava/lang/String;
/* aget-object v0, v0, v1 */
v1 = this.list_x;
int v2 = 3; // const/4 v2, 0x3
/* aget v1, v1, v2 */
/* int-to-float v1, v1 */
/* int-to-float v2, v2 */
v3 = this.mPaint;
(( android.graphics.Canvas ) p1 ).drawText ( v0, v1, v2, v3 ); // invoke-virtual {p1, v0, v1, v2, v3}, Landroid/graphics/Canvas;->drawText(Ljava/lang/String;FFLandroid/graphics/Paint;)V
/* .line 197 */
v0 = this.res;
(( android.content.res.Resources ) v0 ).getStringArray ( v1 ); // invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getStringArray(I)[Ljava/lang/String;
/* aget-object v0, v0, v1 */
v1 = this.list_x;
int v2 = 3; // const/4 v2, 0x3
/* aget v1, v1, v2 */
/* int-to-float v1, v1 */
/* iget v3, p0, Lde/nurogames/android/ticb/base/objects/objPauseOverlay;->list_spacing:I */
/* mul-int/lit8 v3, v3, 0x1 */
/* add-int/2addr v2, v3 */
/* int-to-float v2, v2 */
v3 = this.mPaint;
(( android.graphics.Canvas ) p1 ).drawText ( v0, v1, v2, v3 ); // invoke-virtual {p1, v0, v1, v2, v3}, Landroid/graphics/Canvas;->drawText(Ljava/lang/String;FFLandroid/graphics/Paint;)V
/* .line 198 */
v0 = this.res;
(( android.content.res.Resources ) v0 ).getStringArray ( v1 ); // invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getStringArray(I)[Ljava/lang/String;
/* aget-object v0, v0, v1 */
v1 = this.list_x;
int v2 = 3; // const/4 v2, 0x3
/* aget v1, v1, v2 */
/* int-to-float v1, v1 */
/* iget v3, p0, Lde/nurogames/android/ticb/base/objects/objPauseOverlay;->list_spacing:I */
/* mul-int/lit8 v3, v3, 0x2 */
/* add-int/2addr v2, v3 */
/* int-to-float v2, v2 */
v3 = this.mPaint;
(( android.graphics.Canvas ) p1 ).drawText ( v0, v1, v2, v3 ); // invoke-virtual {p1, v0, v1, v2, v3}, Landroid/graphics/Canvas;->drawText(Ljava/lang/String;FFLandroid/graphics/Paint;)V
/* .line 199 */
v0 = this.res;
(( android.content.res.Resources ) v0 ).getStringArray ( v1 ); // invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getStringArray(I)[Ljava/lang/String;
/* aget-object v0, v0, v1 */
v1 = this.list_x;
int v2 = 3; // const/4 v2, 0x3
/* aget v1, v1, v2 */
/* int-to-float v1, v1 */
/* iget v3, p0, Lde/nurogames/android/ticb/base/objects/objPauseOverlay;->list_spacing:I */
/* mul-int/lit8 v3, v3, 0x3 */
/* add-int/2addr v2, v3 */
/* int-to-float v2, v2 */
v3 = this.mPaint;
(( android.graphics.Canvas ) p1 ).drawText ( v0, v1, v2, v3 ); // invoke-virtual {p1, v0, v1, v2, v3}, Landroid/graphics/Canvas;->drawText(Ljava/lang/String;FFLandroid/graphics/Paint;)V
/* .line 201 */
v0 = this.mPaint;
int v1 = -1; // const/4 v1, -0x1
(( android.graphics.Paint ) v0 ).setColor ( v1 ); // invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setColor(I)V
/* .line 202 */
/* new-instance v0, Ljava/lang/StringBuilder; */
/* invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V */
/* int-to-float v1, v1 */
v2 = de.nurogames.android.ticb.base.objects.objBee.playerPos;
/* iget v2, v2, Lde/nurogames/android/ticb/base/core/Vector3D;->x:F */
/* const/high16 v3, 0x41200000 # 10.0f */
/* div-float/2addr v2, v3 */
/* add-float/2addr v1, v2 */
/* float-to-int v1, v1 */
/* add-int/lit8 v2, v2, 0x1 */
/* mul-int/2addr v1, v2 */
(( java.lang.StringBuilder ) v0 ).append ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v0 ).toString ( ); // invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
v1 = this.list_x;
/* aget v1, v1, v9 */
/* int-to-float v1, v1 */
/* int-to-float v2, v2 */
v3 = this.mPaint;
(( android.graphics.Canvas ) p1 ).drawText ( v0, v1, v2, v3 ); // invoke-virtual {p1, v0, v1, v2, v3}, Landroid/graphics/Canvas;->drawText(Ljava/lang/String;FFLandroid/graphics/Paint;)V
/* .line 203 */
/* new-instance v0, Ljava/lang/StringBuilder; */
/* invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V */
v1 = de.nurogames.android.ticb.base.objects.objBee.playerPos;
/* iget v1, v1, Lde/nurogames/android/ticb/base/core/Vector3D;->x:F */
/* const/high16 v2, 0x41200000 # 10.0f */
/* div-float/2addr v1, v2 */
/* float-to-int v1, v1 */
(( java.lang.StringBuilder ) v0 ).append ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v0 ).toString ( ); // invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
v1 = this.list_x;
/* aget v1, v1, v9 */
/* int-to-float v1, v1 */
/* iget v3, p0, Lde/nurogames/android/ticb/base/objects/objPauseOverlay;->list_spacing:I */
/* mul-int/lit8 v3, v3, 0x1 */
/* add-int/2addr v2, v3 */
/* int-to-float v2, v2 */
v3 = this.mPaint;
(( android.graphics.Canvas ) p1 ).drawText ( v0, v1, v2, v3 ); // invoke-virtual {p1, v0, v1, v2, v3}, Landroid/graphics/Canvas;->drawText(Ljava/lang/String;FFLandroid/graphics/Paint;)V
/* .line 204 */
/* new-instance v0, Ljava/lang/StringBuilder; */
/* invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V */
v1 = this.secsformat;
v2 = de.nurogames.android.ticb.base.views.TinyBeeView.player;
/* iget v2, v2, Lde/nurogames/android/ticb/base/objects/objBee;->topSpeed:F */
/* float-to-double v2, v2 */
(( java.text.DecimalFormat ) v1 ).format ( v2, v3 ); // invoke-virtual {v1, v2, v3}, Ljava/text/DecimalFormat;->format(D)Ljava/lang/String;
(( java.lang.StringBuilder ) v0 ).append ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v0 ).toString ( ); // invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
v1 = this.list_x;
/* aget v1, v1, v9 */
/* int-to-float v1, v1 */
/* iget v3, p0, Lde/nurogames/android/ticb/base/objects/objPauseOverlay;->list_spacing:I */
/* mul-int/lit8 v3, v3, 0x2 */
/* add-int/2addr v2, v3 */
/* int-to-float v2, v2 */
v3 = this.mPaint;
(( android.graphics.Canvas ) p1 ).drawText ( v0, v1, v2, v3 ); // invoke-virtual {p1, v0, v1, v2, v3}, Landroid/graphics/Canvas;->drawText(Ljava/lang/String;FFLandroid/graphics/Paint;)V
/* .line 205 */
/* new-instance v0, Ljava/lang/StringBuilder; */
/* invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V */
(( java.lang.StringBuilder ) v0 ).append ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v0 ).toString ( ); // invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
v1 = this.list_x;
/* aget v1, v1, v9 */
/* int-to-float v1, v1 */
/* iget v3, p0, Lde/nurogames/android/ticb/base/objects/objPauseOverlay;->list_spacing:I */
/* mul-int/lit8 v3, v3, 0x3 */
/* add-int/2addr v2, v3 */
/* int-to-float v2, v2 */
v3 = this.mPaint;
(( android.graphics.Canvas ) p1 ).drawText ( v0, v1, v2, v3 ); // invoke-virtual {p1, v0, v1, v2, v3}, Landroid/graphics/Canvas;->drawText(Ljava/lang/String;FFLandroid/graphics/Paint;)V
/* .line 206 */
/* new-instance v0, Ljava/lang/StringBuilder; */
/* invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V */
(( java.lang.StringBuilder ) v0 ).append ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v0 ).toString ( ); // invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
v1 = this.list_x;
/* aget v1, v1, v9 */
/* int-to-float v1, v1 */
/* iget v3, p0, Lde/nurogames/android/ticb/base/objects/objPauseOverlay;->list_spacing:I */
/* mul-int/lit8 v3, v3, 0x4 */
/* add-int/2addr v2, v3 */
/* int-to-float v2, v2 */
v3 = this.mPaint;
(( android.graphics.Canvas ) p1 ).drawText ( v0, v1, v2, v3 ); // invoke-virtual {p1, v0, v1, v2, v3}, Landroid/graphics/Canvas;->drawText(Ljava/lang/String;FFLandroid/graphics/Paint;)V
/* .line 207 */
/* new-instance v0, Ljava/lang/StringBuilder; */
/* invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V */
(( java.lang.StringBuilder ) v0 ).append ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v0 ).toString ( ); // invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
v1 = this.list_x;
/* aget v1, v1, v9 */
/* int-to-float v1, v1 */
/* iget v3, p0, Lde/nurogames/android/ticb/base/objects/objPauseOverlay;->list_spacing:I */
/* mul-int/lit8 v3, v3, 0x5 */
/* add-int/2addr v2, v3 */
/* int-to-float v2, v2 */
v3 = this.mPaint;
(( android.graphics.Canvas ) p1 ).drawText ( v0, v1, v2, v3 ); // invoke-virtual {p1, v0, v1, v2, v3}, Landroid/graphics/Canvas;->drawText(Ljava/lang/String;FFLandroid/graphics/Paint;)V
/* .line 208 */
/* new-instance v0, Ljava/lang/StringBuilder; */
/* invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V */
v1 = de.nurogames.android.ticb.base.views.TinyBeeView.player;
/* iget v1, v1, Lde/nurogames/android/ticb/base/objects/objBee;->sweetCount:I */
(( java.lang.StringBuilder ) v0 ).append ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v0 ).toString ( ); // invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
v1 = this.list_x;
/* aget v1, v1, v10 */
/* int-to-float v1, v1 */
/* int-to-float v2, v2 */
v3 = this.mPaint;
(( android.graphics.Canvas ) p1 ).drawText ( v0, v1, v2, v3 ); // invoke-virtual {p1, v0, v1, v2, v3}, Landroid/graphics/Canvas;->drawText(Ljava/lang/String;FFLandroid/graphics/Paint;)V
/* .line 209 */
/* new-instance v0, Ljava/lang/StringBuilder; */
/* invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V */
v1 = de.nurogames.android.ticb.base.views.TinyBeeView.player;
/* iget v1, v1, Lde/nurogames/android/ticb/base/objects/objBee;->ouchCount:I */
(( java.lang.StringBuilder ) v0 ).append ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v0 ).toString ( ); // invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
v1 = this.list_x;
/* aget v1, v1, v10 */
/* int-to-float v1, v1 */
/* iget v3, p0, Lde/nurogames/android/ticb/base/objects/objPauseOverlay;->list_spacing:I */
/* mul-int/lit8 v3, v3, 0x1 */
/* add-int/2addr v2, v3 */
/* int-to-float v2, v2 */
v3 = this.mPaint;
(( android.graphics.Canvas ) p1 ).drawText ( v0, v1, v2, v3 ); // invoke-virtual {p1, v0, v1, v2, v3}, Landroid/graphics/Canvas;->drawText(Ljava/lang/String;FFLandroid/graphics/Paint;)V
/* .line 210 */
/* new-instance v0, Ljava/lang/StringBuilder; */
/* invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V */
v1 = this.secsformat;
v2 = de.nurogames.android.ticb.base.views.TinyBeeView.player;
/* iget v2, v2, Lde/nurogames/android/ticb/base/objects/objBee;->maxAir:I */
/* int-to-float v2, v2 */
/* const/high16 v3, 0x42200000 # 40.0f */
/* div-float/2addr v2, v3 */
/* float-to-double v2, v2 */
(( java.text.DecimalFormat ) v1 ).format ( v2, v3 ); // invoke-virtual {v1, v2, v3}, Ljava/text/DecimalFormat;->format(D)Ljava/lang/String;
(( java.lang.StringBuilder ) v0 ).append ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
final String v1 = "s"; // const-string v1, "s"
(( java.lang.StringBuilder ) v0 ).append ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v0 ).toString ( ); // invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
v1 = this.list_x;
/* aget v1, v1, v10 */
/* int-to-float v1, v1 */
/* iget v3, p0, Lde/nurogames/android/ticb/base/objects/objPauseOverlay;->list_spacing:I */
/* mul-int/lit8 v3, v3, 0x2 */
/* add-int/2addr v2, v3 */
/* int-to-float v2, v2 */
v3 = this.mPaint;
(( android.graphics.Canvas ) p1 ).drawText ( v0, v1, v2, v3 ); // invoke-virtual {p1, v0, v1, v2, v3}, Landroid/graphics/Canvas;->drawText(Ljava/lang/String;FFLandroid/graphics/Paint;)V
/* .line 213 */
v0 = de.nurogames.android.ticb.base.core.AppResources.imgSideMenu;
v2 = de.nurogames.android.ticb.base.core.AppResources.imgSideMenu;
v2 = (( android.graphics.Bitmap ) v2 ).getWidth ( ); // invoke-virtual {v2}, Landroid/graphics/Bitmap;->getWidth()I
/* sub-int/2addr v1, v2 */
/* int-to-float v1, v1 */
/* int-to-float v2, v2 */
(( android.graphics.Canvas ) p1 ).drawBitmap ( v0, v1, v2, v8 ); // invoke-virtual {p1, v0, v1, v2, v8}, Landroid/graphics/Canvas;->drawBitmap(Landroid/graphics/Bitmap;FFLandroid/graphics/Paint;)V
/* .line 215 */
/* if-nez v0, :cond_13 */
/* .line 216 */
/* new-instance v0, Ljava/lang/StringBuilder; */
/* invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V */
v1 = de.nurogames.android.ticb.base.views.TinyBeeView.terrain;
/* iget v1, v1, Lde/nurogames/android/ticb/base/objects/objTerrainMap;->checkpoints:I */
/* add-int/lit8 v1, v1, 0x1 */
(( java.lang.StringBuilder ) v0 ).append ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v0 ).toString ( ); // invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
v1 = this.list_x;
/* aget v1, v1, v10 */
/* int-to-float v1, v1 */
/* iget v3, p0, Lde/nurogames/android/ticb/base/objects/objPauseOverlay;->list_spacing:I */
/* mul-int/lit8 v3, v3, 0x3 */
/* add-int/2addr v2, v3 */
/* int-to-float v2, v2 */
v3 = this.mPaint;
(( android.graphics.Canvas ) p1 ).drawText ( v0, v1, v2, v3 ); // invoke-virtual {p1, v0, v1, v2, v3}, Landroid/graphics/Canvas;->drawText(Ljava/lang/String;FFLandroid/graphics/Paint;)V
/* .line 221 */
} // :cond_1
} // :goto_1
v0 = this.menuButtons;
/* array-length v0, v0 */
/* add-int/lit8 v0, v0, -0x1 */
/* iput v0, p0, Lde/nurogames/android/ticb/base/objects/objPauseOverlay;->len:I */
/* .line 222 */
int v6 = 0; // const/4 v6, 0x0
/* .local v6, "x":I */
} // :goto_2
/* iget v0, p0, Lde/nurogames/android/ticb/base/objects/objPauseOverlay;->len:I */
/* if-lt v6, v0, :cond_14 */
/* .line 316 */
} // .end local v6 # "x":I
} // :cond_2
return;
/* .line 141 */
} // :cond_3
/* if-ne v0, v1, :cond_4 */
/* .line 142 */
/* new-array v0, v2, [I */
/* fill-array-data v0, :array_1 */
this.list_x = v0;
/* goto/16 :goto_0 */
/* .line 143 */
} // :cond_4
/* if-ne v0, v1, :cond_5 */
/* .line 144 */
/* new-array v0, v2, [I */
/* fill-array-data v0, :array_2 */
this.list_x = v0;
/* goto/16 :goto_0 */
/* .line 145 */
} // :cond_5
/* if-ne v0, v1, :cond_6 */
/* .line 146 */
/* new-array v0, v2, [I */
/* fill-array-data v0, :array_3 */
this.list_x = v0;
/* goto/16 :goto_0 */
/* .line 147 */
} // :cond_6
/* if-ne v0, v1, :cond_7 */
/* .line 148 */
/* new-array v0, v2, [I */
/* fill-array-data v0, :array_4 */
this.list_x = v0;
/* goto/16 :goto_0 */
/* .line 149 */
} // :cond_7
/* if-ne v0, v1, :cond_8 */
/* .line 150 */
/* new-array v0, v2, [I */
/* fill-array-data v0, :array_5 */
this.list_x = v0;
/* goto/16 :goto_0 */
/* .line 151 */
} // :cond_8
/* if-ne v0, v1, :cond_9 */
/* .line 152 */
/* new-array v0, v2, [I */
/* fill-array-data v0, :array_6 */
this.list_x = v0;
/* goto/16 :goto_0 */
/* .line 153 */
} // :cond_9
/* if-ne v0, v1, :cond_a */
/* .line 154 */
/* new-array v0, v2, [I */
/* fill-array-data v0, :array_7 */
this.list_x = v0;
/* goto/16 :goto_0 */
/* .line 155 */
} // :cond_a
/* if-ne v0, v1, :cond_b */
/* .line 156 */
/* new-array v0, v2, [I */
/* fill-array-data v0, :array_8 */
this.list_x = v0;
/* goto/16 :goto_0 */
/* .line 157 */
} // :cond_b
/* if-ne v0, v1, :cond_c */
/* .line 158 */
/* new-array v0, v2, [I */
/* fill-array-data v0, :array_9 */
this.list_x = v0;
/* goto/16 :goto_0 */
/* .line 159 */
} // :cond_c
/* if-ne v0, v1, :cond_d */
/* .line 160 */
/* new-array v0, v2, [I */
/* fill-array-data v0, :array_a */
this.list_x = v0;
/* goto/16 :goto_0 */
/* .line 161 */
} // :cond_d
/* if-ne v0, v1, :cond_e */
/* .line 162 */
/* new-array v0, v2, [I */
/* fill-array-data v0, :array_b */
this.list_x = v0;
/* goto/16 :goto_0 */
/* .line 163 */
} // :cond_e
/* if-ne v0, v1, :cond_f */
/* .line 164 */
/* new-array v0, v2, [I */
/* fill-array-data v0, :array_c */
this.list_x = v0;
/* goto/16 :goto_0 */
/* .line 165 */
} // :cond_f
/* if-ne v0, v1, :cond_10 */
/* .line 166 */
/* new-array v0, v2, [I */
/* fill-array-data v0, :array_d */
this.list_x = v0;
/* goto/16 :goto_0 */
/* .line 167 */
} // :cond_10
/* if-ne v0, v1, :cond_11 */
/* .line 168 */
/* new-array v0, v2, [I */
/* fill-array-data v0, :array_e */
this.list_x = v0;
/* goto/16 :goto_0 */
/* .line 169 */
} // :cond_11
/* if-ne v0, v1, :cond_12 */
/* .line 170 */
/* new-array v0, v2, [I */
/* fill-array-data v0, :array_f */
this.list_x = v0;
/* goto/16 :goto_0 */
/* .line 172 */
} // :cond_12
/* const/16 v0, 0x14 */
/* iput v0, p0, Lde/nurogames/android/ticb/base/objects/objPauseOverlay;->list_spacing:I */
/* .line 173 */
/* new-array v0, v2, [I */
/* fill-array-data v0, :array_10 */
this.list_x = v0;
/* goto/16 :goto_0 */
/* .line 217 */
} // :cond_13
/* if-ne v0, v7, :cond_1 */
/* .line 218 */
/* new-instance v0, Ljava/lang/StringBuilder; */
/* invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V */
v1 = de.nurogames.android.ticb.base.views.TinyBeeView.terrain;
/* iget v1, v1, Lde/nurogames/android/ticb/base/objects/objTerrainMap;->endless_mode_checkpoint_cnt:I */
/* add-int/lit8 v1, v1, 0x1 */
(( java.lang.StringBuilder ) v0 ).append ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v0 ).toString ( ); // invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
v1 = this.list_x;
/* aget v1, v1, v10 */
/* int-to-float v1, v1 */
/* iget v3, p0, Lde/nurogames/android/ticb/base/objects/objPauseOverlay;->list_spacing:I */
/* mul-int/lit8 v3, v3, 0x3 */
/* add-int/2addr v2, v3 */
/* int-to-float v2, v2 */
v3 = this.mPaint;
(( android.graphics.Canvas ) p1 ).drawText ( v0, v1, v2, v3 ); // invoke-virtual {p1, v0, v1, v2, v3}, Landroid/graphics/Canvas;->drawText(Ljava/lang/String;FFLandroid/graphics/Paint;)V
/* goto/16 :goto_1 */
/* .line 223 */
/* .restart local v6 # "x":I */
} // :cond_14
v0 = this.menuButtons;
/* aget-object v0, v0, v6 */
(( de.nurogames.android.ticb.base.objects.objMenuButton ) v0 ).onDraw ( p1 ); // invoke-virtual {v0, p1}, Lde/nurogames/android/ticb/base/objects/objMenuButton;->onDraw(Landroid/graphics/Canvas;)V
/* .line 222 */
/* add-int/lit8 v6, v6, 0x1 */
/* goto/16 :goto_2 */
/* .line 227 */
} // .end local v6 # "x":I
} // :cond_15
/* iget v0, p0, Lde/nurogames/android/ticb/base/objects/objPauseOverlay;->mViewMode:I */
/* if-ne v0, v1, :cond_2 */
/* .line 229 */
v0 = this.menuButtons;
/* aget-object v0, v0, v10 */
(( de.nurogames.android.ticb.base.objects.objMenuButton ) v0 ).onDraw ( p1 ); // invoke-virtual {v0, p1}, Lde/nurogames/android/ticb/base/objects/objMenuButton;->onDraw(Landroid/graphics/Canvas;)V
/* .line 231 */
v0 = this.res;
(( android.content.res.Resources ) v0 ).getIntArray ( v1 ); // invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getIntArray(I)[I
/* aget v0, v0, v1 */
/* iput v0, p0, Lde/nurogames/android/ticb/base/objects/objPauseOverlay;->list_spacing:I */
/* .line 232 */
v0 = this.list_x;
/* if-nez v0, :cond_16 */
/* .line 233 */
/* if-ne v0, v1, :cond_17 */
/* .line 234 */
/* new-array v0, v2, [I */
/* fill-array-data v0, :array_11 */
this.list_x = v0;
/* .line 271 */
} // :cond_16
} // :goto_3
v0 = this.mPaint;
/* const/high16 v1, -0x1000000 */
(( android.graphics.Paint ) v0 ).setColor ( v1 ); // invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setColor(I)V
/* .line 272 */
v0 = this.mPaint;
/* const/16 v1, 0x8e */
(( android.graphics.Paint ) v0 ).setAlpha ( v1 ); // invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setAlpha(I)V
/* .line 273 */
int v1 = 0; // const/4 v1, 0x0
int v2 = 0; // const/4 v2, 0x0
/* int-to-float v3, v0 */
/* int-to-float v4, v0 */
v5 = this.mPaint;
/* move-object v0, p1 */
/* invoke-virtual/range {v0 ..v5}, Landroid/graphics/Canvas;->drawRect(FFFFLandroid/graphics/Paint;)V */
/* .line 274 */
v0 = de.nurogames.android.ticb.base.core.AppResources.imgPause;
/* iget v1, p0, Lde/nurogames/android/ticb/base/objects/objPauseOverlay;->pause_x:I */
/* int-to-float v1, v1 */
/* iget v2, p0, Lde/nurogames/android/ticb/base/objects/objPauseOverlay;->pause_y:I */
/* int-to-float v2, v2 */
(( android.graphics.Canvas ) p1 ).drawBitmap ( v0, v1, v2, v8 ); // invoke-virtual {p1, v0, v1, v2, v8}, Landroid/graphics/Canvas;->drawBitmap(Landroid/graphics/Bitmap;FFLandroid/graphics/Paint;)V
/* .line 277 */
v0 = this.mPaint;
/* iget v1, p0, Lde/nurogames/android/ticb/base/objects/objPauseOverlay;->FONT_LARGE:I */
/* int-to-float v1, v1 */
(( android.graphics.Paint ) v0 ).setTextSize ( v1 ); // invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setTextSize(F)V
/* .line 278 */
v0 = this.mPaint;
int v1 = -1; // const/4 v1, -0x1
(( android.graphics.Paint ) v0 ).setColor ( v1 ); // invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setColor(I)V
/* .line 279 */
v0 = this.res;
(( android.content.res.Resources ) v0 ).getStringArray ( v1 ); // invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getStringArray(I)[Ljava/lang/String;
/* aget-object v0, v0, v1 */
v1 = this.list_x;
/* aget v1, v1, v7 */
/* int-to-float v1, v1 */
/* iget v3, p0, Lde/nurogames/android/ticb/base/objects/objPauseOverlay;->FONT_LARGE:I */
/* sub-int/2addr v2, v3 */
/* int-to-float v2, v2 */
v3 = this.mPaint;
(( android.graphics.Canvas ) p1 ).drawText ( v0, v1, v2, v3 ); // invoke-virtual {p1, v0, v1, v2, v3}, Landroid/graphics/Canvas;->drawText(Ljava/lang/String;FFLandroid/graphics/Paint;)V
/* .line 282 */
v0 = this.mPaint;
/* iget v1, p0, Lde/nurogames/android/ticb/base/objects/objPauseOverlay;->FONT_MEDIUM:I */
/* int-to-float v1, v1 */
(( android.graphics.Paint ) v0 ).setTextSize ( v1 ); // invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setTextSize(F)V
/* .line 283 */
v0 = this.mPaint;
/* const/16 v1, 0xff */
/* const/16 v2, 0xd8 */
int v3 = 0; // const/4 v3, 0x0
v1 = android.graphics.Color .rgb ( v1,v2,v3 );
(( android.graphics.Paint ) v0 ).setColor ( v1 ); // invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setColor(I)V
/* .line 285 */
de.nurogames.android.ticb.base.views.TinyBeeView .checkTaskRequirements ( );
this.check = v0;
/* .line 286 */
int v6 = 0; // const/4 v6, 0x0
/* .restart local v6 # "x":I */
} // :goto_4
int v0 = 3; // const/4 v0, 0x3
/* if-lt v6, v0, :cond_27 */
/* .line 295 */
v0 = this.mPaint;
/* iget v1, p0, Lde/nurogames/android/ticb/base/objects/objPauseOverlay;->FONT_LARGE:I */
/* int-to-float v1, v1 */
(( android.graphics.Paint ) v0 ).setTextSize ( v1 ); // invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setTextSize(F)V
/* .line 296 */
v0 = this.mPaint;
int v1 = -1; // const/4 v1, -0x1
(( android.graphics.Paint ) v0 ).setColor ( v1 ); // invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setColor(I)V
/* .line 298 */
v0 = this.res;
(( android.content.res.Resources ) v0 ).getStringArray ( v1 ); // invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getStringArray(I)[Ljava/lang/String;
/* aget-object v0, v0, v1 */
(( java.lang.String ) v0 ).toString ( ); // invoke-virtual {v0}, Ljava/lang/String;->toString()Ljava/lang/String;
v1 = this.list_x;
/* aget v1, v1, v7 */
/* int-to-float v1, v1 */
/* iget v2, p0, Lde/nurogames/android/ticb/base/objects/objPauseOverlay;->multiplier_bar_y:I */
/* add-int/lit8 v2, v2, -0xc */
/* int-to-float v2, v2 */
v3 = this.mPaint;
(( android.graphics.Canvas ) p1 ).drawText ( v0, v1, v2, v3 ); // invoke-virtual {p1, v0, v1, v2, v3}, Landroid/graphics/Canvas;->drawText(Ljava/lang/String;FFLandroid/graphics/Paint;)V
/* .line 299 */
v0 = de.nurogames.android.ticb.base.core.AppResources.imgMultiplierTaskbar;
v2 = de.nurogames.android.ticb.base.core.AppResources.imgMultiplierTaskbar;
v2 = (( android.graphics.Bitmap ) v2 ).getWidth ( ); // invoke-virtual {v2}, Landroid/graphics/Bitmap;->getWidth()I
/* div-int/lit8 v2, v2, 0x2 */
/* sub-int/2addr v1, v2 */
/* int-to-float v1, v1 */
/* iget v2, p0, Lde/nurogames/android/ticb/base/objects/objPauseOverlay;->multiplier_bar_y:I */
/* int-to-float v2, v2 */
(( android.graphics.Canvas ) p1 ).drawBitmap ( v0, v1, v2, v8 ); // invoke-virtual {p1, v0, v1, v2, v8}, Landroid/graphics/Canvas;->drawBitmap(Landroid/graphics/Bitmap;FFLandroid/graphics/Paint;)V
/* .line 300 */
int v6 = 0; // const/4 v6, 0x0
} // :goto_5
/* if-lt v6, v0, :cond_29 */
/* .line 307 */
v0 = de.nurogames.android.ticb.base.core.AppResources.imgSideMenu;
v2 = de.nurogames.android.ticb.base.core.AppResources.imgSideMenu;
v2 = (( android.graphics.Bitmap ) v2 ).getWidth ( ); // invoke-virtual {v2}, Landroid/graphics/Bitmap;->getWidth()I
/* sub-int/2addr v1, v2 */
/* int-to-float v1, v1 */
/* int-to-float v2, v2 */
(( android.graphics.Canvas ) p1 ).drawBitmap ( v0, v1, v2, v8 ); // invoke-virtual {p1, v0, v1, v2, v8}, Landroid/graphics/Canvas;->drawBitmap(Landroid/graphics/Bitmap;FFLandroid/graphics/Paint;)V
/* .line 310 */
v0 = this.menuButtons;
/* array-length v0, v0 */
/* iput v0, p0, Lde/nurogames/android/ticb/base/objects/objPauseOverlay;->len:I */
/* .line 311 */
int v6 = 0; // const/4 v6, 0x0
} // :goto_6
/* iget v0, p0, Lde/nurogames/android/ticb/base/objects/objPauseOverlay;->len:I */
/* if-ge v6, v0, :cond_2 */
/* .line 312 */
v0 = this.menuButtons;
/* aget-object v0, v0, v6 */
(( de.nurogames.android.ticb.base.objects.objMenuButton ) v0 ).onDraw ( p1 ); // invoke-virtual {v0, p1}, Lde/nurogames/android/ticb/base/objects/objMenuButton;->onDraw(Landroid/graphics/Canvas;)V
/* .line 311 */
/* add-int/lit8 v6, v6, 0x1 */
/* .line 235 */
} // .end local v6 # "x":I
} // :cond_17
/* if-ne v0, v1, :cond_18 */
/* .line 236 */
/* new-array v0, v2, [I */
/* fill-array-data v0, :array_12 */
this.list_x = v0;
/* goto/16 :goto_3 */
/* .line 237 */
} // :cond_18
/* if-ne v0, v1, :cond_19 */
/* .line 238 */
/* new-array v0, v2, [I */
/* fill-array-data v0, :array_13 */
this.list_x = v0;
/* goto/16 :goto_3 */
/* .line 239 */
} // :cond_19
/* if-ne v0, v1, :cond_1a */
/* .line 240 */
/* new-array v0, v2, [I */
/* fill-array-data v0, :array_14 */
this.list_x = v0;
/* goto/16 :goto_3 */
/* .line 241 */
} // :cond_1a
/* if-ne v0, v1, :cond_1b */
/* .line 242 */
/* new-array v0, v2, [I */
/* fill-array-data v0, :array_15 */
this.list_x = v0;
/* goto/16 :goto_3 */
/* .line 243 */
} // :cond_1b
/* if-ne v0, v1, :cond_1c */
/* .line 244 */
/* new-array v0, v2, [I */
/* fill-array-data v0, :array_16 */
this.list_x = v0;
/* goto/16 :goto_3 */
/* .line 245 */
} // :cond_1c
/* if-ne v0, v1, :cond_1d */
/* .line 246 */
/* new-array v0, v2, [I */
/* fill-array-data v0, :array_17 */
this.list_x = v0;
/* goto/16 :goto_3 */
/* .line 247 */
} // :cond_1d
/* if-ne v0, v1, :cond_1e */
/* .line 248 */
/* new-array v0, v2, [I */
/* fill-array-data v0, :array_18 */
this.list_x = v0;
/* goto/16 :goto_3 */
/* .line 249 */
} // :cond_1e
/* if-ne v0, v1, :cond_1f */
/* .line 250 */
/* new-array v0, v2, [I */
/* fill-array-data v0, :array_19 */
this.list_x = v0;
/* goto/16 :goto_3 */
/* .line 251 */
} // :cond_1f
/* if-ne v0, v1, :cond_20 */
/* .line 252 */
/* new-array v0, v2, [I */
/* fill-array-data v0, :array_1a */
this.list_x = v0;
/* goto/16 :goto_3 */
/* .line 253 */
} // :cond_20
/* if-ne v0, v1, :cond_21 */
/* .line 254 */
/* new-array v0, v2, [I */
/* fill-array-data v0, :array_1b */
this.list_x = v0;
/* goto/16 :goto_3 */
/* .line 255 */
} // :cond_21
/* if-ne v0, v1, :cond_22 */
/* .line 256 */
/* new-array v0, v2, [I */
/* fill-array-data v0, :array_1c */
this.list_x = v0;
/* goto/16 :goto_3 */
/* .line 257 */
} // :cond_22
/* if-ne v0, v1, :cond_23 */
/* .line 258 */
/* new-array v0, v2, [I */
/* fill-array-data v0, :array_1d */
this.list_x = v0;
/* goto/16 :goto_3 */
/* .line 259 */
} // :cond_23
/* if-ne v0, v1, :cond_24 */
/* .line 260 */
/* new-array v0, v2, [I */
/* fill-array-data v0, :array_1e */
this.list_x = v0;
/* goto/16 :goto_3 */
/* .line 261 */
} // :cond_24
/* if-ne v0, v1, :cond_25 */
/* .line 262 */
/* new-array v0, v2, [I */
/* fill-array-data v0, :array_1f */
this.list_x = v0;
/* goto/16 :goto_3 */
/* .line 263 */
} // :cond_25
/* if-ne v0, v1, :cond_26 */
/* .line 264 */
/* new-array v0, v2, [I */
/* fill-array-data v0, :array_20 */
this.list_x = v0;
/* goto/16 :goto_3 */
/* .line 266 */
} // :cond_26
/* const/16 v0, 0x20 */
/* iput v0, p0, Lde/nurogames/android/ticb/base/objects/objPauseOverlay;->list_spacing:I */
/* .line 267 */
/* new-array v0, v2, [I */
/* fill-array-data v0, :array_21 */
this.list_x = v0;
/* goto/16 :goto_3 */
/* .line 287 */
/* .restart local v6 # "x":I */
} // :cond_27
v0 = this.check;
/* aget-boolean v0, v0, v6 */
if ( v0 != null) { // if-eqz v0, :cond_28
/* .line 288 */
v0 = de.nurogames.android.ticb.base.core.AppResources.imgTaskIcons;
/* aget-object v0, v0, v7 */
v1 = this.list_x;
/* aget v1, v1, v7 */
v2 = de.nurogames.android.ticb.base.core.AppResources.imgTaskIcons;
/* aget-object v2, v2, v7 */
v2 = (( android.graphics.Bitmap ) v2 ).getWidth ( ); // invoke-virtual {v2}, Landroid/graphics/Bitmap;->getWidth()I
/* sub-int/2addr v1, v2 */
/* iget v2, p0, Lde/nurogames/android/ticb/base/objects/objPauseOverlay;->icon_offset:I */
/* sub-int/2addr v1, v2 */
/* int-to-float v1, v1 */
/* iget v3, p0, Lde/nurogames/android/ticb/base/objects/objPauseOverlay;->list_spacing:I */
/* mul-int/2addr v3, v6 */
/* add-int/2addr v2, v3 */
/* int-to-float v2, v2 */
(( android.graphics.Canvas ) p1 ).drawBitmap ( v0, v1, v2, v8 ); // invoke-virtual {p1, v0, v1, v2, v8}, Landroid/graphics/Canvas;->drawBitmap(Landroid/graphics/Bitmap;FFLandroid/graphics/Paint;)V
/* .line 292 */
} // :goto_7
v0 = this.task_quest_names;
/* aget-object v0, v0, v1 */
/* aget-object v0, v0, v1 */
/* aget-object v0, v0, v6 */
v1 = this.list_x;
/* aget v1, v1, v7 */
/* int-to-float v1, v1 */
/* iget v3, p0, Lde/nurogames/android/ticb/base/objects/objPauseOverlay;->FONT_MEDIUM:I */
/* add-int/2addr v2, v3 */
v3 = de.nurogames.android.ticb.base.core.AppResources.imgTaskIcons;
/* aget-object v3, v3, v7 */
v3 = (( android.graphics.Bitmap ) v3 ).getHeight ( ); // invoke-virtual {v3}, Landroid/graphics/Bitmap;->getHeight()I
/* div-int/lit8 v3, v3, 0x2 */
/* iget v4, p0, Lde/nurogames/android/ticb/base/objects/objPauseOverlay;->FONT_MEDIUM:I */
/* div-int/lit8 v4, v4, 0x2 */
/* sub-int/2addr v3, v4 */
/* add-int/2addr v2, v3 */
/* iget v3, p0, Lde/nurogames/android/ticb/base/objects/objPauseOverlay;->list_spacing:I */
/* mul-int/2addr v3, v6 */
/* add-int/2addr v2, v3 */
/* int-to-float v2, v2 */
v3 = this.mPaint;
(( android.graphics.Canvas ) p1 ).drawText ( v0, v1, v2, v3 ); // invoke-virtual {p1, v0, v1, v2, v3}, Landroid/graphics/Canvas;->drawText(Ljava/lang/String;FFLandroid/graphics/Paint;)V
/* .line 286 */
/* add-int/lit8 v6, v6, 0x1 */
/* goto/16 :goto_4 */
/* .line 290 */
} // :cond_28
v0 = de.nurogames.android.ticb.base.core.AppResources.imgTaskIcons;
int v1 = 0; // const/4 v1, 0x0
/* aget-object v0, v0, v1 */
v1 = this.list_x;
/* aget v1, v1, v7 */
v2 = de.nurogames.android.ticb.base.core.AppResources.imgTaskIcons;
int v3 = 0; // const/4 v3, 0x0
/* aget-object v2, v2, v3 */
v2 = (( android.graphics.Bitmap ) v2 ).getWidth ( ); // invoke-virtual {v2}, Landroid/graphics/Bitmap;->getWidth()I
/* sub-int/2addr v1, v2 */
/* iget v2, p0, Lde/nurogames/android/ticb/base/objects/objPauseOverlay;->icon_offset:I */
/* sub-int/2addr v1, v2 */
/* int-to-float v1, v1 */
/* iget v3, p0, Lde/nurogames/android/ticb/base/objects/objPauseOverlay;->list_spacing:I */
/* mul-int/2addr v3, v6 */
/* add-int/2addr v2, v3 */
/* int-to-float v2, v2 */
(( android.graphics.Canvas ) p1 ).drawBitmap ( v0, v1, v2, v8 ); // invoke-virtual {p1, v0, v1, v2, v8}, Landroid/graphics/Canvas;->drawBitmap(Landroid/graphics/Bitmap;FFLandroid/graphics/Paint;)V
/* .line 301 */
} // :cond_29
/* rem-int/lit8 v0, v6, 0x2 */
/* if-nez v0, :cond_2a */
/* .line 302 */
v0 = de.nurogames.android.ticb.base.core.AppResources.imgHoneyDot;
/* aget-object v0, v0, v9 */
v2 = de.nurogames.android.ticb.base.core.AppResources.imgMultiplierTaskbar;
v2 = (( android.graphics.Bitmap ) v2 ).getWidth ( ); // invoke-virtual {v2}, Landroid/graphics/Bitmap;->getWidth()I
/* div-int/lit8 v2, v2, 0x2 */
/* sub-int/2addr v1, v2 */
/* add-int/lit8 v1, v1, 0x4 */
/* mul-int/lit8 v2, v6, 0x23 */
/* add-int/2addr v1, v2 */
/* int-to-float v1, v1 */
/* iget v2, p0, Lde/nurogames/android/ticb/base/objects/objPauseOverlay;->multiplier_bar_y:I */
/* add-int/lit8 v2, v2, 0x18 */
/* int-to-float v2, v2 */
(( android.graphics.Canvas ) p1 ).drawBitmap ( v0, v1, v2, v8 ); // invoke-virtual {p1, v0, v1, v2, v8}, Landroid/graphics/Canvas;->drawBitmap(Landroid/graphics/Bitmap;FFLandroid/graphics/Paint;)V
/* .line 300 */
} // :goto_8
/* add-int/lit8 v6, v6, 0x1 */
/* goto/16 :goto_5 */
/* .line 304 */
} // :cond_2a
v0 = de.nurogames.android.ticb.base.core.AppResources.imgHoneyDot;
/* aget-object v0, v0, v9 */
v2 = de.nurogames.android.ticb.base.core.AppResources.imgMultiplierTaskbar;
v2 = (( android.graphics.Bitmap ) v2 ).getWidth ( ); // invoke-virtual {v2}, Landroid/graphics/Bitmap;->getWidth()I
/* div-int/lit8 v2, v2, 0x2 */
/* sub-int/2addr v1, v2 */
/* add-int/lit8 v1, v1, 0x4 */
/* mul-int/lit8 v2, v6, 0x23 */
/* add-int/2addr v1, v2 */
/* int-to-float v1, v1 */
/* iget v2, p0, Lde/nurogames/android/ticb/base/objects/objPauseOverlay;->multiplier_bar_y:I */
/* add-int/lit8 v2, v2, 0x40 */
/* int-to-float v2, v2 */
(( android.graphics.Canvas ) p1 ).drawBitmap ( v0, v1, v2, v8 ); // invoke-virtual {p1, v0, v1, v2, v8}, Landroid/graphics/Canvas;->drawBitmap(Landroid/graphics/Bitmap;FFLandroid/graphics/Paint;)V
/* .line 140 */
/* :array_0 */
/* .array-data 4 */
/* 0x64 */
/* 0xb4 */
/* 0x172 */
/* 0x208 */
/* 0x294 */
} // .end array-data
/* .line 142 */
/* :array_1 */
/* .array-data 4 */
/* 0x64 */
/* 0xb4 */
/* 0x172 */
/* 0x208 */
/* 0x294 */
} // .end array-data
/* .line 144 */
/* :array_2 */
/* .array-data 4 */
/* 0x64 */
/* 0xb4 */
/* 0x172 */
/* 0x208 */
/* 0x294 */
} // .end array-data
/* .line 146 */
/* :array_3 */
/* .array-data 4 */
/* 0x64 */
/* 0xb4 */
/* 0x14a */
/* 0x1b8 */
/* 0x21c */
} // .end array-data
/* .line 148 */
/* :array_4 */
/* .array-data 4 */
/* 0x64 */
/* 0xb4 */
/* 0x14a */
/* 0x1b8 */
/* 0x21c */
} // .end array-data
/* .line 150 */
/* :array_5 */
/* .array-data 4 */
/* 0x64 */
/* 0xb4 */
/* 0x14a */
/* 0x1b8 */
/* 0x21c */
} // .end array-data
/* .line 152 */
/* :array_6 */
/* .array-data 4 */
/* 0x64 */
/* 0xb4 */
/* 0x14a */
/* 0x1b8 */
/* 0x21c */
} // .end array-data
/* .line 154 */
/* :array_7 */
/* .array-data 4 */
/* 0x64 */
/* 0xa0 */
/* 0x136 */
/* 0x1a4 */
/* 0x21c */
} // .end array-data
/* .line 156 */
/* :array_8 */
/* .array-data 4 */
/* 0x64 */
/* 0xa0 */
/* 0x136 */
/* 0x1a4 */
/* 0x21c */
} // .end array-data
/* .line 158 */
/* :array_9 */
/* .array-data 4 */
/* 0x64 */
/* 0xa0 */
/* 0x136 */
/* 0x1a4 */
/* 0x21c */
} // .end array-data
/* .line 160 */
/* :array_a */
/* .array-data 4 */
/* 0x64 */
/* 0xa0 */
/* 0x136 */
/* 0x1a4 */
/* 0x21c */
} // .end array-data
/* .line 162 */
/* :array_b */
/* .array-data 4 */
/* 0x64 */
/* 0xa0 */
/* 0x136 */
/* 0x1a4 */
/* 0x21c */
} // .end array-data
/* .line 164 */
/* :array_c */
/* .array-data 4 */
/* 0x64 */
/* 0xa0 */
/* 0x136 */
/* 0x1a4 */
/* 0x21c */
} // .end array-data
/* .line 166 */
/* :array_d */
/* .array-data 4 */
/* 0x3c */
/* 0x58 */
/* 0xbc */
/* 0x102 */
/* 0x144 */
} // .end array-data
/* .line 168 */
/* :array_e */
/* .array-data 4 */
/* 0x20 */
/* 0x3c */
/* 0x84 */
/* 0xb2 */
/* 0xe8 */
} // .end array-data
/* .line 170 */
/* :array_f */
/* .array-data 4 */
/* 0x20 */
/* 0x3c */
/* 0x84 */
/* 0xb2 */
/* 0xe8 */
} // .end array-data
/* .line 173 */
/* :array_10 */
/* .array-data 4 */
/* 0x3c */
/* 0x58 */
/* 0xbc */
/* 0x102 */
/* 0x144 */
} // .end array-data
/* .line 234 */
/* :array_11 */
/* .array-data 4 */
/* 0x64 */
/* 0xb4 */
/* 0x15e */
/* 0x1a4 */
/* 0x21c */
} // .end array-data
/* .line 236 */
/* :array_12 */
/* .array-data 4 */
/* 0x64 */
/* 0xb4 */
/* 0x15e */
/* 0x1a4 */
/* 0x21c */
} // .end array-data
/* .line 238 */
/* :array_13 */
/* .array-data 4 */
/* 0x64 */
/* 0xb4 */
/* 0x15e */
/* 0x1a4 */
/* 0x21c */
} // .end array-data
/* .line 240 */
/* :array_14 */
/* .array-data 4 */
/* 0x64 */
/* 0xb4 */
/* 0x14a */
/* 0x1b8 */
/* 0x21c */
} // .end array-data
/* .line 242 */
/* :array_15 */
/* .array-data 4 */
/* 0x64 */
/* 0xb4 */
/* 0x14a */
/* 0x1b8 */
/* 0x21c */
} // .end array-data
/* .line 244 */
/* :array_16 */
/* .array-data 4 */
/* 0x64 */
/* 0xb4 */
/* 0x14a */
/* 0x1b8 */
/* 0x21c */
} // .end array-data
/* .line 246 */
/* :array_17 */
/* .array-data 4 */
/* 0x64 */
/* 0xb4 */
/* 0x14a */
/* 0x1b8 */
/* 0x21c */
} // .end array-data
/* .line 248 */
/* :array_18 */
/* .array-data 4 */
/* 0x64 */
/* 0xa0 */
/* 0x136 */
/* 0x1a4 */
/* 0x21c */
} // .end array-data
/* .line 250 */
/* :array_19 */
/* .array-data 4 */
/* 0x64 */
/* 0xa0 */
/* 0x136 */
/* 0x1a4 */
/* 0x21c */
} // .end array-data
/* .line 252 */
/* :array_1a */
/* .array-data 4 */
/* 0x64 */
/* 0xa0 */
/* 0x136 */
/* 0x1a4 */
/* 0x21c */
} // .end array-data
/* .line 254 */
/* :array_1b */
/* .array-data 4 */
/* 0x64 */
/* 0xa0 */
/* 0x136 */
/* 0x1a4 */
/* 0x21c */
} // .end array-data
/* .line 256 */
/* :array_1c */
/* .array-data 4 */
/* 0x64 */
/* 0xa0 */
/* 0x136 */
/* 0x1a4 */
/* 0x21c */
} // .end array-data
/* .line 258 */
/* :array_1d */
/* .array-data 4 */
/* 0x64 */
/* 0xa0 */
/* 0x136 */
/* 0x1a4 */
/* 0x21c */
} // .end array-data
/* .line 260 */
/* :array_1e */
/* .array-data 4 */
/* 0x3c */
/* 0x64 */
/* 0xc8 */
/* 0x102 */
/* 0x148 */
} // .end array-data
/* .line 262 */
/* :array_1f */
/* .array-data 4 */
/* 0x20 */
/* 0x3c */
/* 0x84 */
/* 0xb2 */
/* 0xe8 */
} // .end array-data
/* .line 264 */
/* :array_20 */
/* .array-data 4 */
/* 0x20 */
/* 0x3c */
/* 0x84 */
/* 0xb2 */
/* 0xe8 */
} // .end array-data
/* .line 267 */
/* :array_21 */
/* .array-data 4 */
/* 0x3c */
/* 0x64 */
/* 0xc8 */
/* 0x102 */
/* 0x148 */
} // .end array-data
} // .end method
