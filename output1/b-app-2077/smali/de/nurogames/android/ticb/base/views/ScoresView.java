public class de.nurogames.android.ticb.base.views.ScoresView extends de.nurogames.android.ticb.base.views.ViewPlus {
	 /* .source "ScoresView.java" */
	 /* # annotations */
	 /* .annotation system Ldalvik/annotation/MemberClasses; */
	 /* value = { */
	 /* Lde/nurogames/android/ticb/base/views/ScoresView$MyOnTouchListener;, */
	 /* Lde/nurogames/android/ticb/base/views/ScoresView$RefreshHandler; */
	 /* } */
} // .end annotation
/* # instance fields */
private Integer FONT_LARGE;
private Integer FONT_MEDIUM;
private Integer MENU_SCORES;
private Integer MENU_STATS;
private Integer MENU_TASKS;
private de.nurogames.android.ticb.base.objects.objMenuButton back;
private de.nurogames.android.ticb.base.objects.objAnimMenuBackground background;
private Integer icon_offset;
private Integer list_font_dif;
private Integer list_spacing;
private Integer list_top;
private list_x;
private Integer mMode;
private android.graphics.Paint mPaint;
private de.nurogames.android.ticb.base.views.ScoresView$RefreshHandler mRedrawHandler;
private Integer menu_top;
private de.nurogames.android.ticb.base.objects.objMenuButton menuitems;
private Integer multiplier_bar_y;
private java.lang.String scores_names;
private java.text.DecimalFormat secsformat;
private Integer selected_item;
private stats;
private java.lang.String stats_names;
private [Ljava.lang.String task_quest_names;
private top_scores;
/* # direct methods */
public de.nurogames.android.ticb.base.views.ScoresView ( ) {
	 /* .locals 3 */
	 /* .param p1, "context" # Landroid/content/Context; */
	 /* .param p2, "attrs" # Landroid/util/AttributeSet; */
	 /* .prologue */
	 int v2 = 0; // const/4 v2, 0x0
	 /* .line 95 */
	 /* invoke-direct {p0, p1}, Lde/nurogames/android/ticb/base/views/ViewPlus;-><init>(Landroid/content/Context;)V */
	 /* .line 32 */
	 /* iput v2, p0, Lde/nurogames/android/ticb/base/views/ScoresView;->icon_offset:I */
	 /* .line 35 */
	 /* iput v2, p0, Lde/nurogames/android/ticb/base/views/ScoresView;->mMode:I */
	 /* .line 38 */
	 /* new-instance v0, Lde/nurogames/android/ticb/base/views/ScoresView$RefreshHandler; */
	 /* invoke-direct {v0, p0}, Lde/nurogames/android/ticb/base/views/ScoresView$RefreshHandler;-><init>(Lde/nurogames/android/ticb/base/views/ScoresView;)V */
	 this.mRedrawHandler = v0;
	 /* .line 41 */
	 /* new-instance v0, Ljava/text/DecimalFormat; */
	 final String v1 = "##0.00"; // const-string v1, "##0.00"
	 /* invoke-direct {v0, v1}, Ljava/text/DecimalFormat;-><init>(Ljava/lang/String;)V */
	 this.secsformat = v0;
	 /* .line 50 */
	 /* new-instance v0, Landroid/graphics/Paint; */
	 /* invoke-direct {v0}, Landroid/graphics/Paint;-><init>()V */
	 this.mPaint = v0;
	 /* .line 53 */
	 int v0 = 3; // const/4 v0, 0x3
	 /* new-array v0, v0, [I */
	 this.list_x = v0;
	 /* .line 54 */
	 /* iput v2, p0, Lde/nurogames/android/ticb/base/views/ScoresView;->list_top:I */
	 /* .line 55 */
	 /* iput v2, p0, Lde/nurogames/android/ticb/base/views/ScoresView;->list_spacing:I */
	 /* .line 56 */
	 /* iput v2, p0, Lde/nurogames/android/ticb/base/views/ScoresView;->list_font_dif:I */
	 /* .line 60 */
	 /* const/16 v0, 0xb */
	 /* new-array v0, v0, [I */
	 this.top_scores = v0;
	 /* .line 64 */
	 int v0 = 6; // const/4 v0, 0x6
	 /* new-array v0, v0, [I */
	 this.stats = v0;
	 /* .line 70 */
	 int v0 = 5; // const/4 v0, 0x5
	 /* new-array v0, v0, [Lde/nurogames/android/ticb/base/objects/objMenuButton; */
	 this.menuitems = v0;
	 /* .line 71 */
	 /* const/16 v0, 0x50 */
	 /* iput v0, p0, Lde/nurogames/android/ticb/base/views/ScoresView;->menu_top:I */
	 /* .line 72 */
	 /* iput v2, p0, Lde/nurogames/android/ticb/base/views/ScoresView;->selected_item:I */
	 /* .line 75 */
	 /* iput v2, p0, Lde/nurogames/android/ticb/base/views/ScoresView;->MENU_SCORES:I */
	 /* .line 76 */
	 int v0 = 1; // const/4 v0, 0x1
	 /* iput v0, p0, Lde/nurogames/android/ticb/base/views/ScoresView;->MENU_STATS:I */
	 /* .line 77 */
	 int v0 = 2; // const/4 v0, 0x2
	 /* iput v0, p0, Lde/nurogames/android/ticb/base/views/ScoresView;->MENU_TASKS:I */
	 /* .line 80 */
	 /* iput v2, p0, Lde/nurogames/android/ticb/base/views/ScoresView;->FONT_MEDIUM:I */
	 /* .line 81 */
	 /* iput v2, p0, Lde/nurogames/android/ticb/base/views/ScoresView;->FONT_LARGE:I */
	 /* .line 83 */
	 /* iput v2, p0, Lde/nurogames/android/ticb/base/views/ScoresView;->multiplier_bar_y:I */
	 /* .line 96 */
	 return;
} // .end method
static de.nurogames.android.ticb.base.objects.objMenuButton access$0 ( de.nurogames.android.ticb.base.views.ScoresView p0 ) { //synthethic
	 /* .locals 1 */
	 /* .prologue */
	 /* .line 44 */
	 v0 = this.back;
} // .end method
static de.nurogames.android.ticb.base.objects.objMenuButton access$1 ( de.nurogames.android.ticb.base.views.ScoresView p0 ) { //synthethic
	 /* .locals 1 */
	 /* .prologue */
	 /* .line 70 */
	 v0 = this.menuitems;
} // .end method
static Integer access$2 ( de.nurogames.android.ticb.base.views.ScoresView p0 ) { //synthethic
	 /* .locals 1 */
	 /* .prologue */
	 /* .line 72 */
	 /* iget v0, p0, Lde/nurogames/android/ticb/base/views/ScoresView;->selected_item:I */
} // .end method
static void access$3 ( de.nurogames.android.ticb.base.views.ScoresView p0, Integer p1 ) { //synthethic
	 /* .locals 0 */
	 /* .prologue */
	 /* .line 72 */
	 /* iput p1, p0, Lde/nurogames/android/ticb/base/views/ScoresView;->selected_item:I */
	 return;
} // .end method
static void access$4 ( de.nurogames.android.ticb.base.views.ScoresView p0 ) { //synthethic
	 /* .locals 0 */
	 /* .prologue */
	 /* .line 586 */
	 /* invoke-direct {p0}, Lde/nurogames/android/ticb/base/views/ScoresView;->showTaskHelpDialog()V */
	 return;
} // .end method
private void showTaskHelpDialog ( ) {
	 /* .locals 5 */
	 /* .prologue */
	 /* .line 588 */
	 /* new-instance v1, Landroid/app/AlertDialog$Builder; */
	 (( de.nurogames.android.ticb.base.views.ScoresView ) p0 ).getContext ( ); // invoke-virtual {p0}, Lde/nurogames/android/ticb/base/views/ScoresView;->getContext()Landroid/content/Context;
	 /* invoke-direct {v1, v2}, Landroid/app/AlertDialog$Builder;-><init>(Landroid/content/Context;)V */
	 /* .line 590 */
	 /* .local v1, "builder":Landroid/app/AlertDialog$Builder; */
	 (( de.nurogames.android.ticb.base.views.ScoresView ) p0 ).getResources ( ); // invoke-virtual {p0}, Lde/nurogames/android/ticb/base/views/ScoresView;->getResources()Landroid/content/res/Resources;
	 (( android.content.res.Resources ) v2 ).getStringArray ( v3 ); // invoke-virtual {v2, v3}, Landroid/content/res/Resources;->getStringArray(I)[Ljava/lang/String;
	 /* aget-object v2, v2, v3 */
	 (( java.lang.String ) v2 ).toString ( ); // invoke-virtual {v2}, Ljava/lang/String;->toString()Ljava/lang/String;
	 (( android.app.AlertDialog$Builder ) v1 ).setMessage ( v2 ); // invoke-virtual {v1, v2}, Landroid/app/AlertDialog$Builder;->setMessage(Ljava/lang/CharSequence;)Landroid/app/AlertDialog$Builder;
	 /* .line 591 */
	 int v3 = 0; // const/4 v3, 0x0
	 (( android.app.AlertDialog$Builder ) v2 ).setCancelable ( v3 ); // invoke-virtual {v2, v3}, Landroid/app/AlertDialog$Builder;->setCancelable(Z)Landroid/app/AlertDialog$Builder;
	 /* .line 592 */
	 final String v3 = "ok"; // const-string v3, "ok"
	 /* new-instance v4, Lde/nurogames/android/ticb/base/views/ScoresView$1; */
	 /* invoke-direct {v4, p0}, Lde/nurogames/android/ticb/base/views/ScoresView$1;-><init>(Lde/nurogames/android/ticb/base/views/ScoresView;)V */
	 (( android.app.AlertDialog$Builder ) v2 ).setPositiveButton ( v3, v4 ); // invoke-virtual {v2, v3, v4}, Landroid/app/AlertDialog$Builder;->setPositiveButton(Ljava/lang/CharSequence;Landroid/content/DialogInterface$OnClickListener;)Landroid/app/AlertDialog$Builder;
	 /* .line 599 */
	 final String v2 = "Info"; // const-string v2, "Info"
	 (( android.app.AlertDialog$Builder ) v1 ).setTitle ( v2 ); // invoke-virtual {v1, v2}, Landroid/app/AlertDialog$Builder;->setTitle(Ljava/lang/CharSequence;)Landroid/app/AlertDialog$Builder;
	 /* .line 601 */
	 (( android.app.AlertDialog$Builder ) v1 ).create ( ); // invoke-virtual {v1}, Landroid/app/AlertDialog$Builder;->create()Landroid/app/AlertDialog;
	 /* .line 602 */
	 /* .local v0, "alert":Landroid/app/AlertDialog; */
	 (( android.app.AlertDialog ) v0 ).show ( ); // invoke-virtual {v0}, Landroid/app/AlertDialog;->show()V
	 /* .line 604 */
	 return;
} // .end method
/* # virtual methods */
public Integer getState ( ) {
	 /* .locals 1 */
	 /* .prologue */
	 /* .line 634 */
	 /* iget v0, p0, Lde/nurogames/android/ticb/base/views/ScoresView;->mMode:I */
} // .end method
public void initView ( ) {
	 /* .locals 14 */
	 /* .prologue */
	 int v13 = 2; // const/4 v13, 0x2
	 /* const v4, 0x3f4ccccd # 0.8f */
	 int v1 = 0; // const/4 v1, 0x0
	 int v12 = 1; // const/4 v12, 0x1
	 int v2 = 0; // const/4 v2, 0x0
	 /* .line 102 */
	 (( de.nurogames.android.ticb.base.views.ScoresView ) p0 ).setFocusable ( v12 ); // invoke-virtual {p0, v12}, Lde/nurogames/android/ticb/base/views/ScoresView;->setFocusable(Z)V
	 /* .line 105 */
	 /* new-instance v10, Lde/nurogames/android/ticb/base/views/ScoresView$MyOnTouchListener; */
	 /* invoke-direct {v10, p0}, Lde/nurogames/android/ticb/base/views/ScoresView$MyOnTouchListener;-><init>(Lde/nurogames/android/ticb/base/views/ScoresView;)V */
	 /* .line 106 */
	 /* .local v10, "tlistn":Lde/nurogames/android/ticb/base/views/ScoresView$MyOnTouchListener; */
	 (( de.nurogames.android.ticb.base.views.ScoresView ) p0 ).setOnTouchListener ( v10 ); // invoke-virtual {p0, v10}, Lde/nurogames/android/ticb/base/views/ScoresView;->setOnTouchListener(Landroid/view/View$OnTouchListener;)V
	 /* .line 109 */
	 v0 = this.mPaint;
	 (( android.graphics.Paint ) v0 ).setAntiAlias ( v12 ); // invoke-virtual {v0, v12}, Landroid/graphics/Paint;->setAntiAlias(Z)V
	 /* .line 110 */
	 v0 = de.nurogames.android.ticb.base.tinysanta.cntx;
	 (( android.content.Context ) v0 ).getAssets ( ); // invoke-virtual {v0}, Landroid/content/Context;->getAssets()Landroid/content/res/AssetManager;
	 final String v3 = "font.otf"; // const-string v3, "font.otf"
	 android.graphics.Typeface .createFromAsset ( v0,v3 );
	 /* .line 111 */
	 /* .local v9, "tf":Landroid/graphics/Typeface; */
	 v0 = this.mPaint;
	 (( android.graphics.Paint ) v0 ).setTypeface ( v9 ); // invoke-virtual {v0, v9}, Landroid/graphics/Paint;->setTypeface(Landroid/graphics/Typeface;)Landroid/graphics/Typeface;
	 /* .line 114 */
	 (( de.nurogames.android.ticb.base.views.ScoresView ) p0 ).getResources ( ); // invoke-virtual {p0}, Lde/nurogames/android/ticb/base/views/ScoresView;->getResources()Landroid/content/res/Resources;
	 (( android.content.res.Resources ) v0 ).getIntArray ( v3 ); // invoke-virtual {v0, v3}, Landroid/content/res/Resources;->getIntArray(I)[I
	 /* aget v0, v0, v3 */
	 /* iput v0, p0, Lde/nurogames/android/ticb/base/views/ScoresView;->FONT_MEDIUM:I */
	 /* .line 115 */
	 (( de.nurogames.android.ticb.base.views.ScoresView ) p0 ).getResources ( ); // invoke-virtual {p0}, Lde/nurogames/android/ticb/base/views/ScoresView;->getResources()Landroid/content/res/Resources;
	 (( android.content.res.Resources ) v0 ).getIntArray ( v3 ); // invoke-virtual {v0, v3}, Landroid/content/res/Resources;->getIntArray(I)[I
	 /* aget v0, v0, v3 */
	 /* iput v0, p0, Lde/nurogames/android/ticb/base/views/ScoresView;->FONT_LARGE:I */
	 /* .line 116 */
	 (( de.nurogames.android.ticb.base.views.ScoresView ) p0 ).getResources ( ); // invoke-virtual {p0}, Lde/nurogames/android/ticb/base/views/ScoresView;->getResources()Landroid/content/res/Resources;
	 (( android.content.res.Resources ) v0 ).getIntArray ( v3 ); // invoke-virtual {v0, v3}, Landroid/content/res/Resources;->getIntArray(I)[I
	 /* aget v0, v0, v3 */
	 /* iput v0, p0, Lde/nurogames/android/ticb/base/views/ScoresView;->menu_top:I */
	 /* .line 117 */
	 (( de.nurogames.android.ticb.base.views.ScoresView ) p0 ).getResources ( ); // invoke-virtual {p0}, Lde/nurogames/android/ticb/base/views/ScoresView;->getResources()Landroid/content/res/Resources;
	 (( android.content.res.Resources ) v0 ).getIntArray ( v3 ); // invoke-virtual {v0, v3}, Landroid/content/res/Resources;->getIntArray(I)[I
	 /* aget v0, v0, v3 */
	 /* iput v0, p0, Lde/nurogames/android/ticb/base/views/ScoresView;->list_top:I */
	 /* .line 118 */
	 (( de.nurogames.android.ticb.base.views.ScoresView ) p0 ).getResources ( ); // invoke-virtual {p0}, Lde/nurogames/android/ticb/base/views/ScoresView;->getResources()Landroid/content/res/Resources;
	 (( android.content.res.Resources ) v0 ).getIntArray ( v3 ); // invoke-virtual {v0, v3}, Landroid/content/res/Resources;->getIntArray(I)[I
	 /* aget v0, v0, v3 */
	 /* iput v0, p0, Lde/nurogames/android/ticb/base/views/ScoresView;->list_font_dif:I */
	 /* .line 119 */
	 (( de.nurogames.android.ticb.base.views.ScoresView ) p0 ).getResources ( ); // invoke-virtual {p0}, Lde/nurogames/android/ticb/base/views/ScoresView;->getResources()Landroid/content/res/Resources;
	 (( android.content.res.Resources ) v0 ).getIntArray ( v3 ); // invoke-virtual {v0, v3}, Landroid/content/res/Resources;->getIntArray(I)[I
	 /* aget v0, v0, v3 */
	 /* iput v0, p0, Lde/nurogames/android/ticb/base/views/ScoresView;->list_spacing:I */
	 /* .line 120 */
	 (( de.nurogames.android.ticb.base.views.ScoresView ) p0 ).getResources ( ); // invoke-virtual {p0}, Lde/nurogames/android/ticb/base/views/ScoresView;->getResources()Landroid/content/res/Resources;
	 (( android.content.res.Resources ) v0 ).getIntArray ( v3 ); // invoke-virtual {v0, v3}, Landroid/content/res/Resources;->getIntArray(I)[I
	 /* aget v0, v0, v3 */
	 /* iput v0, p0, Lde/nurogames/android/ticb/base/views/ScoresView;->multiplier_bar_y:I */
	 /* .line 122 */
	 /* const/high16 v0, 0x41000000 # 8.0f */
	 v3 = de.nurogames.android.ticb.base.tinysanta.sMetrics;
	 /* iget v3, v3, Landroid/util/DisplayMetrics;->density:F */
	 /* mul-float/2addr v0, v3 */
	 /* float-to-int v0, v0 */
	 /* iput v0, p0, Lde/nurogames/android/ticb/base/views/ScoresView;->icon_offset:I */
	 /* .line 124 */
	 /* if-ne v0, v3, :cond_0 */
	 /* .line 125 */
	 /* iget v0, p0, Lde/nurogames/android/ticb/base/views/ScoresView;->FONT_MEDIUM:I */
	 /* int-to-float v0, v0 */
	 /* mul-float/2addr v0, v4 */
	 /* float-to-int v0, v0 */
	 /* iput v0, p0, Lde/nurogames/android/ticb/base/views/ScoresView;->FONT_MEDIUM:I */
	 /* .line 126 */
	 /* iget v0, p0, Lde/nurogames/android/ticb/base/views/ScoresView;->FONT_LARGE:I */
	 /* int-to-float v0, v0 */
	 /* mul-float/2addr v0, v4 */
	 /* float-to-int v0, v0 */
	 /* iput v0, p0, Lde/nurogames/android/ticb/base/views/ScoresView;->FONT_LARGE:I */
	 /* .line 130 */
} // :cond_0
/* new-instance v0, Lde/nurogames/android/ticb/base/objects/objMenuButton; */
/* .line 132 */
v4 = de.nurogames.android.ticb.base.core.AppResources.imgMenu_back;
/* aget-object v4, v4, v2 */
v4 = (( android.graphics.Bitmap ) v4 ).getHeight ( ); // invoke-virtual {v4}, Landroid/graphics/Bitmap;->getHeight()I
/* sub-int/2addr v3, v4 */
/* .line 133 */
v4 = de.nurogames.android.ticb.base.core.AppResources.imgMenu_back;
/* aget-object v4, v4, v2 */
/* .line 134 */
v5 = de.nurogames.android.ticb.base.core.AppResources.imgMenu_back;
/* aget-object v5, v5, v12 */
/* invoke-direct/range {v0 ..v5}, Lde/nurogames/android/ticb/base/objects/objMenuButton;-><init>(Ljava/lang/String;IILandroid/graphics/Bitmap;Landroid/graphics/Bitmap;)V */
/* .line 130 */
this.back = v0;
/* .line 137 */
/* new-instance v0, Lde/nurogames/android/ticb/base/objects/objAnimMenuBackground; */
/* invoke-direct {v0}, Lde/nurogames/android/ticb/base/objects/objAnimMenuBackground;-><init>()V */
this.background = v0;
/* .line 140 */
v0 = this.menuitems;
/* new-instance v3, Lde/nurogames/android/ticb/base/objects/objMenuButton; */
/* .line 141 */
v5 = de.nurogames.android.ticb.base.core.AppResources.imgBtnScores;
/* aget-object v5, v5, v2 */
v5 = (( android.graphics.Bitmap ) v5 ).getWidth ( ); // invoke-virtual {v5}, Landroid/graphics/Bitmap;->getWidth()I
/* sub-int v5, v4, v5 */
/* .line 142 */
/* iget v4, p0, Lde/nurogames/android/ticb/base/views/ScoresView;->menu_top:I */
/* add-int/lit8 v6, v4, -0x10 */
/* .line 143 */
v4 = de.nurogames.android.ticb.base.core.AppResources.imgBtnScores;
/* aget-object v7, v4, v2 */
/* .line 144 */
v4 = de.nurogames.android.ticb.base.core.AppResources.imgBtnScores;
/* aget-object v8, v4, v12 */
/* move-object v4, v1 */
/* invoke-direct/range {v3 ..v8}, Lde/nurogames/android/ticb/base/objects/objMenuButton;-><init>(Ljava/lang/String;IILandroid/graphics/Bitmap;Landroid/graphics/Bitmap;)V */
/* .line 140 */
/* aput-object v3, v0, v2 */
/* .line 145 */
v0 = this.menuitems;
/* aget-object v0, v0, v2 */
(( de.nurogames.android.ticb.base.objects.objMenuButton ) v0 ).isToggled ( v12 ); // invoke-virtual {v0, v12}, Lde/nurogames/android/ticb/base/objects/objMenuButton;->isToggled(Z)V
/* .line 146 */
/* iput v2, p0, Lde/nurogames/android/ticb/base/views/ScoresView;->selected_item:I */
/* .line 148 */
v0 = this.menuitems;
/* new-instance v3, Lde/nurogames/android/ticb/base/objects/objMenuButton; */
/* .line 149 */
v5 = de.nurogames.android.ticb.base.core.AppResources.imgBtnStats;
/* aget-object v5, v5, v2 */
v5 = (( android.graphics.Bitmap ) v5 ).getWidth ( ); // invoke-virtual {v5}, Landroid/graphics/Bitmap;->getWidth()I
/* sub-int v5, v4, v5 */
/* .line 150 */
/* iget v4, p0, Lde/nurogames/android/ticb/base/views/ScoresView;->menu_top:I */
v6 = de.nurogames.android.ticb.base.core.AppResources.imgSideMenu;
v6 = (( android.graphics.Bitmap ) v6 ).getHeight ( ); // invoke-virtual {v6}, Landroid/graphics/Bitmap;->getHeight()I
/* int-to-float v6, v6 */
/* const v7, 0x3e99999a # 0.3f */
/* mul-float/2addr v6, v7 */
/* float-to-int v6, v6 */
/* add-int/2addr v6, v4 */
/* .line 151 */
v4 = de.nurogames.android.ticb.base.core.AppResources.imgBtnStats;
/* aget-object v7, v4, v2 */
/* .line 152 */
v4 = de.nurogames.android.ticb.base.core.AppResources.imgBtnStats;
/* aget-object v8, v4, v12 */
/* move-object v4, v1 */
/* invoke-direct/range {v3 ..v8}, Lde/nurogames/android/ticb/base/objects/objMenuButton;-><init>(Ljava/lang/String;IILandroid/graphics/Bitmap;Landroid/graphics/Bitmap;)V */
/* .line 148 */
/* aput-object v3, v0, v12 */
/* .line 154 */
v0 = this.menuitems;
/* new-instance v3, Lde/nurogames/android/ticb/base/objects/objMenuButton; */
/* .line 155 */
v5 = de.nurogames.android.ticb.base.core.AppResources.imgBtnTasks;
/* aget-object v5, v5, v2 */
v5 = (( android.graphics.Bitmap ) v5 ).getWidth ( ); // invoke-virtual {v5}, Landroid/graphics/Bitmap;->getWidth()I
/* sub-int v5, v4, v5 */
/* .line 156 */
/* iget v4, p0, Lde/nurogames/android/ticb/base/views/ScoresView;->menu_top:I */
v6 = de.nurogames.android.ticb.base.core.AppResources.imgSideMenu;
v6 = (( android.graphics.Bitmap ) v6 ).getHeight ( ); // invoke-virtual {v6}, Landroid/graphics/Bitmap;->getHeight()I
/* int-to-float v6, v6 */
/* const v7, 0x3f19999a # 0.6f */
/* mul-float/2addr v6, v7 */
/* float-to-int v6, v6 */
/* add-int/2addr v6, v4 */
/* .line 157 */
v4 = de.nurogames.android.ticb.base.core.AppResources.imgBtnTasks;
/* aget-object v7, v4, v2 */
/* .line 158 */
v4 = de.nurogames.android.ticb.base.core.AppResources.imgBtnTasks;
/* aget-object v8, v4, v12 */
/* move-object v4, v1 */
/* invoke-direct/range {v3 ..v8}, Lde/nurogames/android/ticb/base/objects/objMenuButton;-><init>(Ljava/lang/String;IILandroid/graphics/Bitmap;Landroid/graphics/Bitmap;)V */
/* .line 154 */
/* aput-object v3, v0, v13 */
/* .line 160 */
v0 = this.menuitems;
int v11 = 3; // const/4 v11, 0x3
/* new-instance v3, Lde/nurogames/android/ticb/base/objects/objMenuButton; */
/* .line 161 */
v4 = this.list_x;
/* aget v4, v4, v12 */
/* iget v5, p0, Lde/nurogames/android/ticb/base/views/ScoresView;->icon_offset:I */
/* sub-int/2addr v4, v5 */
v5 = de.nurogames.android.ticb.base.core.AppResources.imgTaskHelp;
v5 = (( android.graphics.Bitmap ) v5 ).getWidth ( ); // invoke-virtual {v5}, Landroid/graphics/Bitmap;->getWidth()I
/* sub-int v5, v4, v5 */
/* .line 162 */
/* iget v4, p0, Lde/nurogames/android/ticb/base/views/ScoresView;->list_top:I */
v6 = de.nurogames.android.ticb.base.core.AppResources.imgTaskHelp;
v6 = (( android.graphics.Bitmap ) v6 ).getHeight ( ); // invoke-virtual {v6}, Landroid/graphics/Bitmap;->getHeight()I
/* sub-int v6, v4, v6 */
/* .line 163 */
v7 = de.nurogames.android.ticb.base.core.AppResources.imgTaskHelp;
/* .line 164 */
v8 = de.nurogames.android.ticb.base.core.AppResources.imgTaskHelp;
/* move-object v4, v1 */
/* invoke-direct/range {v3 ..v8}, Lde/nurogames/android/ticb/base/objects/objMenuButton;-><init>(Ljava/lang/String;IILandroid/graphics/Bitmap;Landroid/graphics/Bitmap;)V */
/* .line 160 */
/* aput-object v3, v0, v11 */
/* .line 172 */
v0 = this.menuitems;
int v11 = 4; // const/4 v11, 0x4
/* new-instance v3, Lde/nurogames/android/ticb/base/objects/objMenuButton; */
/* .line 173 */
v4 = this.list_x;
/* aget v4, v4, v12 */
/* iget v5, p0, Lde/nurogames/android/ticb/base/views/ScoresView;->icon_offset:I */
/* sub-int/2addr v4, v5 */
v5 = de.nurogames.android.ticb.base.core.AppResources.imgScoreModeSwitch;
/* aget-object v5, v5, v6 */
v5 = (( android.graphics.Bitmap ) v5 ).getWidth ( ); // invoke-virtual {v5}, Landroid/graphics/Bitmap;->getWidth()I
/* sub-int v5, v4, v5 */
/* .line 174 */
/* iget v4, p0, Lde/nurogames/android/ticb/base/views/ScoresView;->list_top:I */
v6 = de.nurogames.android.ticb.base.core.AppResources.imgScoreModeSwitch;
/* aget-object v6, v6, v7 */
v6 = (( android.graphics.Bitmap ) v6 ).getHeight ( ); // invoke-virtual {v6}, Landroid/graphics/Bitmap;->getHeight()I
/* sub-int v6, v4, v6 */
/* .line 175 */
v4 = de.nurogames.android.ticb.base.core.AppResources.imgScoreModeSwitch;
/* aget-object v7, v4, v7 */
/* .line 176 */
v4 = de.nurogames.android.ticb.base.core.AppResources.imgScoreModeSwitch;
/* aget-object v8, v4, v8 */
/* move-object v4, v1 */
/* invoke-direct/range {v3 ..v8}, Lde/nurogames/android/ticb/base/objects/objMenuButton;-><init>(Ljava/lang/String;IILandroid/graphics/Bitmap;Landroid/graphics/Bitmap;)V */
/* .line 172 */
/* aput-object v3, v0, v11 */
/* .line 179 */
v0 = this.stats;
/* aput v1, v0, v2 */
/* .line 180 */
v0 = this.stats;
/* aput v1, v0, v12 */
/* .line 181 */
v0 = this.stats;
/* aput v1, v0, v13 */
/* .line 182 */
v0 = this.stats;
int v1 = 3; // const/4 v1, 0x3
/* aput v2, v0, v1 */
/* .line 183 */
v0 = this.stats;
int v1 = 4; // const/4 v1, 0x4
/* aput v2, v0, v1 */
/* .line 184 */
v0 = this.stats;
int v1 = 5; // const/4 v1, 0x5
/* aput v2, v0, v1 */
/* .line 186 */
/* if-nez v0, :cond_2 */
/* .line 187 */
v0 = de.nurogames.android.ticb.base.core.AppResources.task_quest_names_demo;
this.task_quest_names = v0;
/* .line 191 */
} // :cond_1
} // :goto_0
/* if-ne v0, v1, :cond_3 */
/* .line 192 */
(( de.nurogames.android.ticb.base.views.ScoresView ) p0 ).getResources ( ); // invoke-virtual {p0}, Lde/nurogames/android/ticb/base/views/ScoresView;->getResources()Landroid/content/res/Resources;
(( android.content.res.Resources ) v0 ).getStringArray ( v1 ); // invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getStringArray(I)[Ljava/lang/String;
this.scores_names = v0;
/* .line 193 */
(( de.nurogames.android.ticb.base.views.ScoresView ) p0 ).getResources ( ); // invoke-virtual {p0}, Lde/nurogames/android/ticb/base/views/ScoresView;->getResources()Landroid/content/res/Resources;
(( android.content.res.Resources ) v0 ).getStringArray ( v1 ); // invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getStringArray(I)[Ljava/lang/String;
this.stats_names = v0;
/* .line 208 */
} // :goto_1
return;
/* .line 188 */
} // :cond_2
/* if-ne v0, v12, :cond_1 */
/* .line 189 */
v0 = de.nurogames.android.ticb.base.core.AppResources.task_quest_names_full;
this.task_quest_names = v0;
/* .line 194 */
} // :cond_3
/* if-ne v0, v1, :cond_4 */
/* .line 195 */
(( de.nurogames.android.ticb.base.views.ScoresView ) p0 ).getResources ( ); // invoke-virtual {p0}, Lde/nurogames/android/ticb/base/views/ScoresView;->getResources()Landroid/content/res/Resources;
(( android.content.res.Resources ) v0 ).getStringArray ( v1 ); // invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getStringArray(I)[Ljava/lang/String;
this.scores_names = v0;
/* .line 196 */
(( de.nurogames.android.ticb.base.views.ScoresView ) p0 ).getResources ( ); // invoke-virtual {p0}, Lde/nurogames/android/ticb/base/views/ScoresView;->getResources()Landroid/content/res/Resources;
(( android.content.res.Resources ) v0 ).getStringArray ( v1 ); // invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getStringArray(I)[Ljava/lang/String;
this.stats_names = v0;
/* .line 197 */
} // :cond_4
/* if-ne v0, v1, :cond_5 */
/* .line 198 */
(( de.nurogames.android.ticb.base.views.ScoresView ) p0 ).getResources ( ); // invoke-virtual {p0}, Lde/nurogames/android/ticb/base/views/ScoresView;->getResources()Landroid/content/res/Resources;
(( android.content.res.Resources ) v0 ).getStringArray ( v1 ); // invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getStringArray(I)[Ljava/lang/String;
this.scores_names = v0;
/* .line 199 */
(( de.nurogames.android.ticb.base.views.ScoresView ) p0 ).getResources ( ); // invoke-virtual {p0}, Lde/nurogames/android/ticb/base/views/ScoresView;->getResources()Landroid/content/res/Resources;
(( android.content.res.Resources ) v0 ).getStringArray ( v1 ); // invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getStringArray(I)[Ljava/lang/String;
this.stats_names = v0;
/* .line 200 */
} // :cond_5
/* if-ne v0, v1, :cond_6 */
/* .line 201 */
(( de.nurogames.android.ticb.base.views.ScoresView ) p0 ).getResources ( ); // invoke-virtual {p0}, Lde/nurogames/android/ticb/base/views/ScoresView;->getResources()Landroid/content/res/Resources;
(( android.content.res.Resources ) v0 ).getStringArray ( v1 ); // invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getStringArray(I)[Ljava/lang/String;
this.scores_names = v0;
/* .line 202 */
(( de.nurogames.android.ticb.base.views.ScoresView ) p0 ).getResources ( ); // invoke-virtual {p0}, Lde/nurogames/android/ticb/base/views/ScoresView;->getResources()Landroid/content/res/Resources;
(( android.content.res.Resources ) v0 ).getStringArray ( v1 ); // invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getStringArray(I)[Ljava/lang/String;
this.stats_names = v0;
/* .line 204 */
} // :cond_6
(( de.nurogames.android.ticb.base.views.ScoresView ) p0 ).getResources ( ); // invoke-virtual {p0}, Lde/nurogames/android/ticb/base/views/ScoresView;->getResources()Landroid/content/res/Resources;
(( android.content.res.Resources ) v0 ).getStringArray ( v1 ); // invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getStringArray(I)[Ljava/lang/String;
this.scores_names = v0;
/* .line 205 */
(( de.nurogames.android.ticb.base.views.ScoresView ) p0 ).getResources ( ); // invoke-virtual {p0}, Lde/nurogames/android/ticb/base/views/ScoresView;->getResources()Landroid/content/res/Resources;
(( android.content.res.Resources ) v0 ).getStringArray ( v1 ); // invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getStringArray(I)[Ljava/lang/String;
this.stats_names = v0;
} // .end method
public void onDraw ( android.graphics.Canvas p0 ) {
/* .locals 14 */
/* .param p1, "g" # Landroid/graphics/Canvas; */
/* .prologue */
int v13 = 4; // const/4 v13, 0x4
int v12 = 3; // const/4 v12, 0x3
int v11 = 2; // const/4 v11, 0x2
int v1 = 0; // const/4 v1, 0x0
int v10 = 1; // const/4 v10, 0x1
/* .line 218 */
v0 = this.background;
(( de.nurogames.android.ticb.base.objects.objAnimMenuBackground ) v0 ).onDraw ( p1 ); // invoke-virtual {v0, p1}, Lde/nurogames/android/ticb/base/objects/objAnimMenuBackground;->onDraw(Landroid/graphics/Canvas;)V
/* .line 221 */
v0 = this.back;
(( de.nurogames.android.ticb.base.objects.objMenuButton ) v0 ).onDraw ( p1 ); // invoke-virtual {v0, p1}, Lde/nurogames/android/ticb/base/objects/objMenuButton;->onDraw(Landroid/graphics/Canvas;)V
/* .line 224 */
v0 = de.nurogames.android.ticb.base.core.AppResources.imgSideMenu;
v3 = de.nurogames.android.ticb.base.core.AppResources.imgSideMenu;
v3 = (( android.graphics.Bitmap ) v3 ).getWidth ( ); // invoke-virtual {v3}, Landroid/graphics/Bitmap;->getWidth()I
/* sub-int/2addr v2, v3 */
/* int-to-float v2, v2 */
/* iget v3, p0, Lde/nurogames/android/ticb/base/views/ScoresView;->menu_top:I */
/* int-to-float v3, v3 */
(( android.graphics.Canvas ) p1 ).drawBitmap ( v0, v2, v3, v1 ); // invoke-virtual {p1, v0, v2, v3, v1}, Landroid/graphics/Canvas;->drawBitmap(Landroid/graphics/Bitmap;FFLandroid/graphics/Paint;)V
/* .line 225 */
int v7 = 0; // const/4 v7, 0x0
/* .local v7, "x":I */
} // :goto_0
v0 = this.menuitems;
/* array-length v0, v0 */
/* add-int/lit8 v0, v0, -0x2 */
/* if-lt v7, v0, :cond_1 */
/* .line 229 */
/* iget v0, p0, Lde/nurogames/android/ticb/base/views/ScoresView;->selected_item:I */
/* iget v2, p0, Lde/nurogames/android/ticb/base/views/ScoresView;->MENU_SCORES:I */
/* if-ne v0, v2, :cond_7 */
/* .line 231 */
(( de.nurogames.android.ticb.base.views.ScoresView ) p0 ).getResources ( ); // invoke-virtual {p0}, Lde/nurogames/android/ticb/base/views/ScoresView;->getResources()Landroid/content/res/Resources;
(( android.content.res.Resources ) v0 ).getIntArray ( v2 ); // invoke-virtual {v0, v2}, Landroid/content/res/Resources;->getIntArray(I)[I
/* aget v0, v0, v2 */
/* iput v0, p0, Lde/nurogames/android/ticb/base/views/ScoresView;->list_spacing:I */
/* .line 233 */
int v0 = 5; // const/4 v0, 0x5
/* new-array v0, v0, [I */
int v2 = 0; // const/4 v2, 0x0
/* .line 234 */
(( de.nurogames.android.ticb.base.views.ScoresView ) p0 ).getResources ( ); // invoke-virtual {p0}, Lde/nurogames/android/ticb/base/views/ScoresView;->getResources()Landroid/content/res/Resources;
(( android.content.res.Resources ) v3 ).getIntArray ( v4 ); // invoke-virtual {v3, v4}, Landroid/content/res/Resources;->getIntArray(I)[I
/* aget v3, v3, v4 */
/* aput v3, v0, v2 */
/* .line 235 */
(( de.nurogames.android.ticb.base.views.ScoresView ) p0 ).getResources ( ); // invoke-virtual {p0}, Lde/nurogames/android/ticb/base/views/ScoresView;->getResources()Landroid/content/res/Resources;
(( android.content.res.Resources ) v2 ).getIntArray ( v3 ); // invoke-virtual {v2, v3}, Landroid/content/res/Resources;->getIntArray(I)[I
/* aget v2, v2, v3 */
/* aput v2, v0, v10 */
/* .line 236 */
(( de.nurogames.android.ticb.base.views.ScoresView ) p0 ).getResources ( ); // invoke-virtual {p0}, Lde/nurogames/android/ticb/base/views/ScoresView;->getResources()Landroid/content/res/Resources;
(( android.content.res.Resources ) v2 ).getIntArray ( v3 ); // invoke-virtual {v2, v3}, Landroid/content/res/Resources;->getIntArray(I)[I
/* aget v2, v2, v3 */
/* aput v2, v0, v11 */
/* .line 237 */
(( de.nurogames.android.ticb.base.views.ScoresView ) p0 ).getResources ( ); // invoke-virtual {p0}, Lde/nurogames/android/ticb/base/views/ScoresView;->getResources()Landroid/content/res/Resources;
(( android.content.res.Resources ) v2 ).getIntArray ( v3 ); // invoke-virtual {v2, v3}, Landroid/content/res/Resources;->getIntArray(I)[I
/* aget v2, v2, v3 */
/* aput v2, v0, v12 */
/* .line 238 */
(( de.nurogames.android.ticb.base.views.ScoresView ) p0 ).getResources ( ); // invoke-virtual {p0}, Lde/nurogames/android/ticb/base/views/ScoresView;->getResources()Landroid/content/res/Resources;
(( android.content.res.Resources ) v2 ).getIntArray ( v3 ); // invoke-virtual {v2, v3}, Landroid/content/res/Resources;->getIntArray(I)[I
/* aget v2, v2, v3 */
/* aput v2, v0, v13 */
/* .line 233 */
this.list_x = v0;
/* .line 241 */
v0 = this.menuitems;
/* aput-object v1, v0, v12 */
/* .line 244 */
v0 = this.menuitems;
/* aget-object v0, v0, v13 */
/* if-nez v0, :cond_2 */
/* .line 245 */
v8 = this.menuitems;
/* new-instance v0, Lde/nurogames/android/ticb/base/objects/objMenuButton; */
/* .line 246 */
v2 = this.list_x;
/* aget v2, v2, v10 */
/* iget v3, p0, Lde/nurogames/android/ticb/base/views/ScoresView;->icon_offset:I */
/* sub-int/2addr v2, v3 */
v3 = de.nurogames.android.ticb.base.core.AppResources.imgScoreModeSwitch;
/* aget-object v3, v3, v4 */
v3 = (( android.graphics.Bitmap ) v3 ).getWidth ( ); // invoke-virtual {v3}, Landroid/graphics/Bitmap;->getWidth()I
/* sub-int/2addr v2, v3 */
/* .line 247 */
/* iget v3, p0, Lde/nurogames/android/ticb/base/views/ScoresView;->list_top:I */
v4 = de.nurogames.android.ticb.base.core.AppResources.imgScoreModeSwitch;
/* aget-object v4, v4, v5 */
v4 = (( android.graphics.Bitmap ) v4 ).getHeight ( ); // invoke-virtual {v4}, Landroid/graphics/Bitmap;->getHeight()I
/* sub-int/2addr v3, v4 */
/* .line 248 */
v4 = de.nurogames.android.ticb.base.core.AppResources.imgScoreModeSwitch;
/* aget-object v4, v4, v5 */
/* .line 249 */
v5 = de.nurogames.android.ticb.base.core.AppResources.imgScoreModeSwitch;
/* aget-object v5, v5, v9 */
/* invoke-direct/range {v0 ..v5}, Lde/nurogames/android/ticb/base/objects/objMenuButton;-><init>(Ljava/lang/String;IILandroid/graphics/Bitmap;Landroid/graphics/Bitmap;)V */
/* .line 245 */
/* aput-object v0, v8, v13 */
/* .line 254 */
} // :goto_1
v0 = this.menuitems;
/* aget-object v0, v0, v13 */
(( de.nurogames.android.ticb.base.objects.objMenuButton ) v0 ).onDraw ( p1 ); // invoke-virtual {v0, p1}, Lde/nurogames/android/ticb/base/objects/objMenuButton;->onDraw(Landroid/graphics/Canvas;)V
/* .line 256 */
v0 = this.mPaint;
/* iget v1, p0, Lde/nurogames/android/ticb/base/views/ScoresView;->FONT_LARGE:I */
/* int-to-float v1, v1 */
(( android.graphics.Paint ) v0 ).setTextSize ( v1 ); // invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setTextSize(F)V
/* .line 257 */
v0 = this.mPaint;
int v1 = -1; // const/4 v1, -0x1
(( android.graphics.Paint ) v0 ).setColor ( v1 ); // invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setColor(I)V
/* .line 258 */
/* if-ne v0, v1, :cond_3 */
/* .line 259 */
(( de.nurogames.android.ticb.base.views.ScoresView ) p0 ).getResources ( ); // invoke-virtual {p0}, Lde/nurogames/android/ticb/base/views/ScoresView;->getResources()Landroid/content/res/Resources;
(( android.content.res.Resources ) v0 ).getStringArray ( v1 ); // invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getStringArray(I)[Ljava/lang/String;
/* aget-object v0, v0, v1 */
(( java.lang.String ) v0 ).toString ( ); // invoke-virtual {v0}, Ljava/lang/String;->toString()Ljava/lang/String;
v1 = this.list_x;
/* aget v1, v1, v10 */
/* int-to-float v1, v1 */
/* iget v2, p0, Lde/nurogames/android/ticb/base/views/ScoresView;->list_top:I */
/* iget v3, p0, Lde/nurogames/android/ticb/base/views/ScoresView;->FONT_LARGE:I */
/* sub-int/2addr v2, v3 */
/* int-to-float v2, v2 */
v3 = this.mPaint;
(( android.graphics.Canvas ) p1 ).drawText ( v0, v1, v2, v3 ); // invoke-virtual {p1, v0, v1, v2, v3}, Landroid/graphics/Canvas;->drawText(Ljava/lang/String;FFLandroid/graphics/Paint;)V
/* .line 269 */
} // :goto_2
v0 = this.mPaint;
/* iget v1, p0, Lde/nurogames/android/ticb/base/views/ScoresView;->FONT_MEDIUM:I */
/* int-to-float v1, v1 */
(( android.graphics.Paint ) v0 ).setTextSize ( v1 ); // invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setTextSize(F)V
/* .line 270 */
v0 = this.mPaint;
/* const/16 v1, 0x6e */
/* const/16 v2, 0x46 */
int v3 = 0; // const/4 v3, 0x0
v1 = android.graphics.Color .rgb ( v1,v2,v3 );
(( android.graphics.Paint ) v0 ).setColor ( v1 ); // invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setColor(I)V
/* .line 271 */
v0 = this.scores_names;
int v1 = 0; // const/4 v1, 0x0
/* aget-object v0, v0, v1 */
v1 = this.list_x;
/* aget v1, v1, v10 */
/* int-to-float v1, v1 */
/* iget v2, p0, Lde/nurogames/android/ticb/base/views/ScoresView;->list_top:I */
/* iget v3, p0, Lde/nurogames/android/ticb/base/views/ScoresView;->list_font_dif:I */
/* add-int/2addr v2, v3 */
/* int-to-float v2, v2 */
v3 = this.mPaint;
(( android.graphics.Canvas ) p1 ).drawText ( v0, v1, v2, v3 ); // invoke-virtual {p1, v0, v1, v2, v3}, Landroid/graphics/Canvas;->drawText(Ljava/lang/String;FFLandroid/graphics/Paint;)V
/* .line 272 */
v0 = this.scores_names;
/* aget-object v0, v0, v10 */
v1 = this.list_x;
/* aget v1, v1, v10 */
/* int-to-float v1, v1 */
/* iget v2, p0, Lde/nurogames/android/ticb/base/views/ScoresView;->list_top:I */
/* iget v3, p0, Lde/nurogames/android/ticb/base/views/ScoresView;->list_font_dif:I */
/* add-int/2addr v2, v3 */
/* iget v3, p0, Lde/nurogames/android/ticb/base/views/ScoresView;->list_spacing:I */
/* mul-int/lit8 v3, v3, 0x1 */
/* add-int/2addr v2, v3 */
/* int-to-float v2, v2 */
v3 = this.mPaint;
(( android.graphics.Canvas ) p1 ).drawText ( v0, v1, v2, v3 ); // invoke-virtual {p1, v0, v1, v2, v3}, Landroid/graphics/Canvas;->drawText(Ljava/lang/String;FFLandroid/graphics/Paint;)V
/* .line 273 */
v0 = this.scores_names;
/* aget-object v0, v0, v11 */
v1 = this.list_x;
/* aget v1, v1, v10 */
/* int-to-float v1, v1 */
/* iget v2, p0, Lde/nurogames/android/ticb/base/views/ScoresView;->list_top:I */
/* iget v3, p0, Lde/nurogames/android/ticb/base/views/ScoresView;->list_font_dif:I */
/* add-int/2addr v2, v3 */
/* iget v3, p0, Lde/nurogames/android/ticb/base/views/ScoresView;->list_spacing:I */
/* mul-int/lit8 v3, v3, 0x2 */
/* add-int/2addr v2, v3 */
/* int-to-float v2, v2 */
v3 = this.mPaint;
(( android.graphics.Canvas ) p1 ).drawText ( v0, v1, v2, v3 ); // invoke-virtual {p1, v0, v1, v2, v3}, Landroid/graphics/Canvas;->drawText(Ljava/lang/String;FFLandroid/graphics/Paint;)V
/* .line 274 */
v0 = this.scores_names;
/* aget-object v0, v0, v12 */
v1 = this.list_x;
/* aget v1, v1, v10 */
/* int-to-float v1, v1 */
/* iget v2, p0, Lde/nurogames/android/ticb/base/views/ScoresView;->list_top:I */
/* iget v3, p0, Lde/nurogames/android/ticb/base/views/ScoresView;->list_font_dif:I */
/* add-int/2addr v2, v3 */
/* iget v3, p0, Lde/nurogames/android/ticb/base/views/ScoresView;->list_spacing:I */
/* mul-int/lit8 v3, v3, 0x3 */
/* add-int/2addr v2, v3 */
/* int-to-float v2, v2 */
v3 = this.mPaint;
(( android.graphics.Canvas ) p1 ).drawText ( v0, v1, v2, v3 ); // invoke-virtual {p1, v0, v1, v2, v3}, Landroid/graphics/Canvas;->drawText(Ljava/lang/String;FFLandroid/graphics/Paint;)V
/* .line 275 */
v0 = this.scores_names;
/* aget-object v0, v0, v13 */
v1 = this.list_x;
/* aget v1, v1, v10 */
/* int-to-float v1, v1 */
/* iget v2, p0, Lde/nurogames/android/ticb/base/views/ScoresView;->list_top:I */
/* iget v3, p0, Lde/nurogames/android/ticb/base/views/ScoresView;->list_font_dif:I */
/* add-int/2addr v2, v3 */
/* iget v3, p0, Lde/nurogames/android/ticb/base/views/ScoresView;->list_spacing:I */
/* mul-int/lit8 v3, v3, 0x4 */
/* add-int/2addr v2, v3 */
/* int-to-float v2, v2 */
v3 = this.mPaint;
(( android.graphics.Canvas ) p1 ).drawText ( v0, v1, v2, v3 ); // invoke-virtual {p1, v0, v1, v2, v3}, Landroid/graphics/Canvas;->drawText(Ljava/lang/String;FFLandroid/graphics/Paint;)V
/* .line 276 */
v0 = this.scores_names;
int v1 = 5; // const/4 v1, 0x5
/* aget-object v0, v0, v1 */
v1 = this.list_x;
/* aget v1, v1, v10 */
/* int-to-float v1, v1 */
/* iget v2, p0, Lde/nurogames/android/ticb/base/views/ScoresView;->list_top:I */
/* iget v3, p0, Lde/nurogames/android/ticb/base/views/ScoresView;->list_font_dif:I */
/* add-int/2addr v2, v3 */
/* iget v3, p0, Lde/nurogames/android/ticb/base/views/ScoresView;->list_spacing:I */
/* mul-int/lit8 v3, v3, 0x5 */
/* add-int/2addr v2, v3 */
/* int-to-float v2, v2 */
v3 = this.mPaint;
(( android.graphics.Canvas ) p1 ).drawText ( v0, v1, v2, v3 ); // invoke-virtual {p1, v0, v1, v2, v3}, Landroid/graphics/Canvas;->drawText(Ljava/lang/String;FFLandroid/graphics/Paint;)V
/* .line 277 */
v0 = this.scores_names;
int v1 = 6; // const/4 v1, 0x6
/* aget-object v0, v0, v1 */
v1 = this.list_x;
/* aget v1, v1, v12 */
/* int-to-float v1, v1 */
/* iget v2, p0, Lde/nurogames/android/ticb/base/views/ScoresView;->list_top:I */
/* iget v3, p0, Lde/nurogames/android/ticb/base/views/ScoresView;->list_font_dif:I */
/* add-int/2addr v2, v3 */
/* int-to-float v2, v2 */
v3 = this.mPaint;
(( android.graphics.Canvas ) p1 ).drawText ( v0, v1, v2, v3 ); // invoke-virtual {p1, v0, v1, v2, v3}, Landroid/graphics/Canvas;->drawText(Ljava/lang/String;FFLandroid/graphics/Paint;)V
/* .line 278 */
v0 = this.scores_names;
int v1 = 7; // const/4 v1, 0x7
/* aget-object v0, v0, v1 */
v1 = this.list_x;
/* aget v1, v1, v12 */
/* int-to-float v1, v1 */
/* iget v2, p0, Lde/nurogames/android/ticb/base/views/ScoresView;->list_top:I */
/* iget v3, p0, Lde/nurogames/android/ticb/base/views/ScoresView;->list_font_dif:I */
/* add-int/2addr v2, v3 */
/* iget v3, p0, Lde/nurogames/android/ticb/base/views/ScoresView;->list_spacing:I */
/* mul-int/lit8 v3, v3, 0x1 */
/* add-int/2addr v2, v3 */
/* int-to-float v2, v2 */
v3 = this.mPaint;
(( android.graphics.Canvas ) p1 ).drawText ( v0, v1, v2, v3 ); // invoke-virtual {p1, v0, v1, v2, v3}, Landroid/graphics/Canvas;->drawText(Ljava/lang/String;FFLandroid/graphics/Paint;)V
/* .line 279 */
v0 = this.scores_names;
/* const/16 v1, 0x8 */
/* aget-object v0, v0, v1 */
v1 = this.list_x;
/* aget v1, v1, v12 */
/* int-to-float v1, v1 */
/* iget v2, p0, Lde/nurogames/android/ticb/base/views/ScoresView;->list_top:I */
/* iget v3, p0, Lde/nurogames/android/ticb/base/views/ScoresView;->list_font_dif:I */
/* add-int/2addr v2, v3 */
/* iget v3, p0, Lde/nurogames/android/ticb/base/views/ScoresView;->list_spacing:I */
/* mul-int/lit8 v3, v3, 0x2 */
/* add-int/2addr v2, v3 */
/* int-to-float v2, v2 */
v3 = this.mPaint;
(( android.graphics.Canvas ) p1 ).drawText ( v0, v1, v2, v3 ); // invoke-virtual {p1, v0, v1, v2, v3}, Landroid/graphics/Canvas;->drawText(Ljava/lang/String;FFLandroid/graphics/Paint;)V
/* .line 280 */
v0 = this.scores_names;
/* const/16 v1, 0x9 */
/* aget-object v0, v0, v1 */
v1 = this.list_x;
/* aget v1, v1, v12 */
/* int-to-float v1, v1 */
/* iget v2, p0, Lde/nurogames/android/ticb/base/views/ScoresView;->list_top:I */
/* iget v3, p0, Lde/nurogames/android/ticb/base/views/ScoresView;->list_font_dif:I */
/* add-int/2addr v2, v3 */
/* iget v3, p0, Lde/nurogames/android/ticb/base/views/ScoresView;->list_spacing:I */
/* mul-int/lit8 v3, v3, 0x3 */
/* add-int/2addr v2, v3 */
/* int-to-float v2, v2 */
v3 = this.mPaint;
(( android.graphics.Canvas ) p1 ).drawText ( v0, v1, v2, v3 ); // invoke-virtual {p1, v0, v1, v2, v3}, Landroid/graphics/Canvas;->drawText(Ljava/lang/String;FFLandroid/graphics/Paint;)V
/* .line 283 */
v0 = de.nurogames.android.ticb.base.tinysanta.data_mngr;
(( de.nurogames.android.ticb.base.core.DataManager ) v0 ).Scores ( v1 ); // invoke-virtual {v0, v1}, Lde/nurogames/android/ticb/base/core/DataManager;->Scores(I)[I
this.top_scores = v0;
/* .line 285 */
v0 = this.mPaint;
int v1 = -1; // const/4 v1, -0x1
(( android.graphics.Paint ) v0 ).setColor ( v1 ); // invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setColor(I)V
/* .line 286 */
/* new-instance v0, Ljava/lang/StringBuilder; */
/* invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V */
v1 = this.top_scores;
int v2 = 0; // const/4 v2, 0x0
/* aget v1, v1, v2 */
(( java.lang.StringBuilder ) v0 ).append ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v0 ).toString ( ); // invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
v1 = this.list_x;
/* aget v1, v1, v11 */
/* int-to-float v1, v1 */
/* iget v2, p0, Lde/nurogames/android/ticb/base/views/ScoresView;->list_top:I */
/* iget v3, p0, Lde/nurogames/android/ticb/base/views/ScoresView;->list_font_dif:I */
/* add-int/2addr v2, v3 */
/* int-to-float v2, v2 */
v3 = this.mPaint;
(( android.graphics.Canvas ) p1 ).drawText ( v0, v1, v2, v3 ); // invoke-virtual {p1, v0, v1, v2, v3}, Landroid/graphics/Canvas;->drawText(Ljava/lang/String;FFLandroid/graphics/Paint;)V
/* .line 287 */
/* new-instance v0, Ljava/lang/StringBuilder; */
/* invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V */
v1 = this.top_scores;
/* aget v1, v1, v10 */
(( java.lang.StringBuilder ) v0 ).append ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v0 ).toString ( ); // invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
v1 = this.list_x;
/* aget v1, v1, v11 */
/* int-to-float v1, v1 */
/* iget v2, p0, Lde/nurogames/android/ticb/base/views/ScoresView;->list_top:I */
/* iget v3, p0, Lde/nurogames/android/ticb/base/views/ScoresView;->list_font_dif:I */
/* add-int/2addr v2, v3 */
/* iget v3, p0, Lde/nurogames/android/ticb/base/views/ScoresView;->list_spacing:I */
/* mul-int/lit8 v3, v3, 0x1 */
/* add-int/2addr v2, v3 */
/* int-to-float v2, v2 */
v3 = this.mPaint;
(( android.graphics.Canvas ) p1 ).drawText ( v0, v1, v2, v3 ); // invoke-virtual {p1, v0, v1, v2, v3}, Landroid/graphics/Canvas;->drawText(Ljava/lang/String;FFLandroid/graphics/Paint;)V
/* .line 288 */
/* new-instance v0, Ljava/lang/StringBuilder; */
/* invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V */
v1 = this.top_scores;
/* aget v1, v1, v11 */
(( java.lang.StringBuilder ) v0 ).append ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v0 ).toString ( ); // invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
v1 = this.list_x;
/* aget v1, v1, v11 */
/* int-to-float v1, v1 */
/* iget v2, p0, Lde/nurogames/android/ticb/base/views/ScoresView;->list_top:I */
/* iget v3, p0, Lde/nurogames/android/ticb/base/views/ScoresView;->list_font_dif:I */
/* add-int/2addr v2, v3 */
/* iget v3, p0, Lde/nurogames/android/ticb/base/views/ScoresView;->list_spacing:I */
/* mul-int/lit8 v3, v3, 0x2 */
/* add-int/2addr v2, v3 */
/* int-to-float v2, v2 */
v3 = this.mPaint;
(( android.graphics.Canvas ) p1 ).drawText ( v0, v1, v2, v3 ); // invoke-virtual {p1, v0, v1, v2, v3}, Landroid/graphics/Canvas;->drawText(Ljava/lang/String;FFLandroid/graphics/Paint;)V
/* .line 289 */
/* new-instance v0, Ljava/lang/StringBuilder; */
/* invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V */
v1 = this.top_scores;
/* aget v1, v1, v12 */
(( java.lang.StringBuilder ) v0 ).append ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v0 ).toString ( ); // invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
v1 = this.list_x;
/* aget v1, v1, v11 */
/* int-to-float v1, v1 */
/* iget v2, p0, Lde/nurogames/android/ticb/base/views/ScoresView;->list_top:I */
/* iget v3, p0, Lde/nurogames/android/ticb/base/views/ScoresView;->list_font_dif:I */
/* add-int/2addr v2, v3 */
/* iget v3, p0, Lde/nurogames/android/ticb/base/views/ScoresView;->list_spacing:I */
/* mul-int/lit8 v3, v3, 0x3 */
/* add-int/2addr v2, v3 */
/* int-to-float v2, v2 */
v3 = this.mPaint;
(( android.graphics.Canvas ) p1 ).drawText ( v0, v1, v2, v3 ); // invoke-virtual {p1, v0, v1, v2, v3}, Landroid/graphics/Canvas;->drawText(Ljava/lang/String;FFLandroid/graphics/Paint;)V
/* .line 290 */
/* new-instance v0, Ljava/lang/StringBuilder; */
/* invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V */
v1 = this.top_scores;
/* aget v1, v1, v13 */
(( java.lang.StringBuilder ) v0 ).append ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v0 ).toString ( ); // invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
v1 = this.list_x;
/* aget v1, v1, v11 */
/* int-to-float v1, v1 */
/* iget v2, p0, Lde/nurogames/android/ticb/base/views/ScoresView;->list_top:I */
/* iget v3, p0, Lde/nurogames/android/ticb/base/views/ScoresView;->list_font_dif:I */
/* add-int/2addr v2, v3 */
/* iget v3, p0, Lde/nurogames/android/ticb/base/views/ScoresView;->list_spacing:I */
/* mul-int/lit8 v3, v3, 0x4 */
/* add-int/2addr v2, v3 */
/* int-to-float v2, v2 */
v3 = this.mPaint;
(( android.graphics.Canvas ) p1 ).drawText ( v0, v1, v2, v3 ); // invoke-virtual {p1, v0, v1, v2, v3}, Landroid/graphics/Canvas;->drawText(Ljava/lang/String;FFLandroid/graphics/Paint;)V
/* .line 291 */
/* new-instance v0, Ljava/lang/StringBuilder; */
/* invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V */
v1 = this.top_scores;
int v2 = 5; // const/4 v2, 0x5
/* aget v1, v1, v2 */
(( java.lang.StringBuilder ) v0 ).append ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v0 ).toString ( ); // invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
v1 = this.list_x;
/* aget v1, v1, v11 */
/* int-to-float v1, v1 */
/* iget v2, p0, Lde/nurogames/android/ticb/base/views/ScoresView;->list_top:I */
/* iget v3, p0, Lde/nurogames/android/ticb/base/views/ScoresView;->list_font_dif:I */
/* add-int/2addr v2, v3 */
/* iget v3, p0, Lde/nurogames/android/ticb/base/views/ScoresView;->list_spacing:I */
/* mul-int/lit8 v3, v3, 0x5 */
/* add-int/2addr v2, v3 */
/* int-to-float v2, v2 */
v3 = this.mPaint;
(( android.graphics.Canvas ) p1 ).drawText ( v0, v1, v2, v3 ); // invoke-virtual {p1, v0, v1, v2, v3}, Landroid/graphics/Canvas;->drawText(Ljava/lang/String;FFLandroid/graphics/Paint;)V
/* .line 292 */
/* new-instance v0, Ljava/lang/StringBuilder; */
/* invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V */
v1 = this.top_scores;
int v2 = 6; // const/4 v2, 0x6
/* aget v1, v1, v2 */
(( java.lang.StringBuilder ) v0 ).append ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v0 ).toString ( ); // invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
v1 = this.list_x;
/* aget v1, v1, v13 */
/* int-to-float v1, v1 */
/* iget v2, p0, Lde/nurogames/android/ticb/base/views/ScoresView;->list_top:I */
/* iget v3, p0, Lde/nurogames/android/ticb/base/views/ScoresView;->list_font_dif:I */
/* add-int/2addr v2, v3 */
/* int-to-float v2, v2 */
v3 = this.mPaint;
(( android.graphics.Canvas ) p1 ).drawText ( v0, v1, v2, v3 ); // invoke-virtual {p1, v0, v1, v2, v3}, Landroid/graphics/Canvas;->drawText(Ljava/lang/String;FFLandroid/graphics/Paint;)V
/* .line 293 */
/* new-instance v0, Ljava/lang/StringBuilder; */
/* invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V */
v1 = this.top_scores;
int v2 = 7; // const/4 v2, 0x7
/* aget v1, v1, v2 */
(( java.lang.StringBuilder ) v0 ).append ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v0 ).toString ( ); // invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
v1 = this.list_x;
/* aget v1, v1, v13 */
/* int-to-float v1, v1 */
/* iget v2, p0, Lde/nurogames/android/ticb/base/views/ScoresView;->list_top:I */
/* iget v3, p0, Lde/nurogames/android/ticb/base/views/ScoresView;->list_font_dif:I */
/* add-int/2addr v2, v3 */
/* iget v3, p0, Lde/nurogames/android/ticb/base/views/ScoresView;->list_spacing:I */
/* mul-int/lit8 v3, v3, 0x1 */
/* add-int/2addr v2, v3 */
/* int-to-float v2, v2 */
v3 = this.mPaint;
(( android.graphics.Canvas ) p1 ).drawText ( v0, v1, v2, v3 ); // invoke-virtual {p1, v0, v1, v2, v3}, Landroid/graphics/Canvas;->drawText(Ljava/lang/String;FFLandroid/graphics/Paint;)V
/* .line 296 */
/* new-instance v0, Ljava/lang/StringBuilder; */
/* invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V */
v1 = this.secsformat;
v2 = this.top_scores;
/* const/16 v3, 0x8 */
/* aget v2, v2, v3 */
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
/* aget v1, v1, v13 */
/* int-to-float v1, v1 */
/* iget v2, p0, Lde/nurogames/android/ticb/base/views/ScoresView;->list_top:I */
/* iget v3, p0, Lde/nurogames/android/ticb/base/views/ScoresView;->list_font_dif:I */
/* add-int/2addr v2, v3 */
/* iget v3, p0, Lde/nurogames/android/ticb/base/views/ScoresView;->list_spacing:I */
/* mul-int/lit8 v3, v3, 0x2 */
/* add-int/2addr v2, v3 */
/* int-to-float v2, v2 */
v3 = this.mPaint;
(( android.graphics.Canvas ) p1 ).drawText ( v0, v1, v2, v3 ); // invoke-virtual {p1, v0, v1, v2, v3}, Landroid/graphics/Canvas;->drawText(Ljava/lang/String;FFLandroid/graphics/Paint;)V
/* .line 298 */
/* new-instance v0, Ljava/lang/StringBuilder; */
/* invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V */
v1 = this.top_scores;
/* const/16 v2, 0x9 */
/* aget v1, v1, v2 */
/* add-int/lit8 v1, v1, 0x1 */
(( java.lang.StringBuilder ) v0 ).append ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v0 ).toString ( ); // invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
v1 = this.list_x;
/* aget v1, v1, v13 */
/* int-to-float v1, v1 */
/* iget v2, p0, Lde/nurogames/android/ticb/base/views/ScoresView;->list_top:I */
/* iget v3, p0, Lde/nurogames/android/ticb/base/views/ScoresView;->list_font_dif:I */
/* add-int/2addr v2, v3 */
/* iget v3, p0, Lde/nurogames/android/ticb/base/views/ScoresView;->list_spacing:I */
/* mul-int/lit8 v3, v3, 0x3 */
/* add-int/2addr v2, v3 */
/* int-to-float v2, v2 */
v3 = this.mPaint;
(( android.graphics.Canvas ) p1 ).drawText ( v0, v1, v2, v3 ); // invoke-virtual {p1, v0, v1, v2, v3}, Landroid/graphics/Canvas;->drawText(Ljava/lang/String;FFLandroid/graphics/Paint;)V
/* .line 441 */
} // :cond_0
return;
/* .line 226 */
} // :cond_1
v0 = this.menuitems;
/* aget-object v0, v0, v7 */
(( de.nurogames.android.ticb.base.objects.objMenuButton ) v0 ).onDraw ( p1 ); // invoke-virtual {v0, p1}, Lde/nurogames/android/ticb/base/objects/objMenuButton;->onDraw(Landroid/graphics/Canvas;)V
/* .line 225 */
/* add-int/lit8 v7, v7, 0x1 */
/* goto/16 :goto_0 */
/* .line 251 */
} // :cond_2
v0 = this.menuitems;
/* aget-object v0, v0, v13 */
v1 = this.list_x;
/* aget v1, v1, v10 */
/* iget v2, p0, Lde/nurogames/android/ticb/base/views/ScoresView;->icon_offset:I */
/* sub-int/2addr v1, v2 */
v2 = de.nurogames.android.ticb.base.core.AppResources.imgScoreModeSwitch;
/* aget-object v2, v2, v3 */
v2 = (( android.graphics.Bitmap ) v2 ).getWidth ( ); // invoke-virtual {v2}, Landroid/graphics/Bitmap;->getWidth()I
/* sub-int/2addr v1, v2 */
(( de.nurogames.android.ticb.base.objects.objMenuButton ) v0 ).X ( v1 ); // invoke-virtual {v0, v1}, Lde/nurogames/android/ticb/base/objects/objMenuButton;->X(I)V
/* .line 252 */
v0 = this.menuitems;
/* aget-object v0, v0, v13 */
/* iget v1, p0, Lde/nurogames/android/ticb/base/views/ScoresView;->list_top:I */
v2 = de.nurogames.android.ticb.base.core.AppResources.imgScoreModeSwitch;
/* aget-object v2, v2, v3 */
v2 = (( android.graphics.Bitmap ) v2 ).getHeight ( ); // invoke-virtual {v2}, Landroid/graphics/Bitmap;->getHeight()I
/* sub-int/2addr v1, v2 */
(( de.nurogames.android.ticb.base.objects.objMenuButton ) v0 ).Y ( v1 ); // invoke-virtual {v0, v1}, Lde/nurogames/android/ticb/base/objects/objMenuButton;->Y(I)V
/* goto/16 :goto_1 */
/* .line 260 */
} // :cond_3
/* if-ne v0, v1, :cond_4 */
/* .line 261 */
(( de.nurogames.android.ticb.base.views.ScoresView ) p0 ).getResources ( ); // invoke-virtual {p0}, Lde/nurogames/android/ticb/base/views/ScoresView;->getResources()Landroid/content/res/Resources;
(( android.content.res.Resources ) v0 ).getStringArray ( v1 ); // invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getStringArray(I)[Ljava/lang/String;
/* aget-object v0, v0, v1 */
(( java.lang.String ) v0 ).toString ( ); // invoke-virtual {v0}, Ljava/lang/String;->toString()Ljava/lang/String;
v1 = this.list_x;
/* aget v1, v1, v10 */
/* int-to-float v1, v1 */
/* iget v2, p0, Lde/nurogames/android/ticb/base/views/ScoresView;->list_top:I */
/* iget v3, p0, Lde/nurogames/android/ticb/base/views/ScoresView;->FONT_LARGE:I */
/* sub-int/2addr v2, v3 */
/* int-to-float v2, v2 */
v3 = this.mPaint;
(( android.graphics.Canvas ) p1 ).drawText ( v0, v1, v2, v3 ); // invoke-virtual {p1, v0, v1, v2, v3}, Landroid/graphics/Canvas;->drawText(Ljava/lang/String;FFLandroid/graphics/Paint;)V
/* goto/16 :goto_2 */
/* .line 262 */
} // :cond_4
/* if-ne v0, v1, :cond_5 */
/* .line 263 */
(( de.nurogames.android.ticb.base.views.ScoresView ) p0 ).getResources ( ); // invoke-virtual {p0}, Lde/nurogames/android/ticb/base/views/ScoresView;->getResources()Landroid/content/res/Resources;
(( android.content.res.Resources ) v0 ).getStringArray ( v1 ); // invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getStringArray(I)[Ljava/lang/String;
/* aget-object v0, v0, v1 */
(( java.lang.String ) v0 ).toString ( ); // invoke-virtual {v0}, Ljava/lang/String;->toString()Ljava/lang/String;
v1 = this.list_x;
/* aget v1, v1, v10 */
/* int-to-float v1, v1 */
/* iget v2, p0, Lde/nurogames/android/ticb/base/views/ScoresView;->list_top:I */
/* iget v3, p0, Lde/nurogames/android/ticb/base/views/ScoresView;->FONT_LARGE:I */
/* sub-int/2addr v2, v3 */
/* int-to-float v2, v2 */
v3 = this.mPaint;
(( android.graphics.Canvas ) p1 ).drawText ( v0, v1, v2, v3 ); // invoke-virtual {p1, v0, v1, v2, v3}, Landroid/graphics/Canvas;->drawText(Ljava/lang/String;FFLandroid/graphics/Paint;)V
/* goto/16 :goto_2 */
/* .line 264 */
} // :cond_5
/* if-ne v0, v1, :cond_6 */
/* .line 265 */
(( de.nurogames.android.ticb.base.views.ScoresView ) p0 ).getResources ( ); // invoke-virtual {p0}, Lde/nurogames/android/ticb/base/views/ScoresView;->getResources()Landroid/content/res/Resources;
(( android.content.res.Resources ) v0 ).getStringArray ( v1 ); // invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getStringArray(I)[Ljava/lang/String;
/* aget-object v0, v0, v1 */
(( java.lang.String ) v0 ).toString ( ); // invoke-virtual {v0}, Ljava/lang/String;->toString()Ljava/lang/String;
v1 = this.list_x;
/* aget v1, v1, v10 */
/* int-to-float v1, v1 */
/* iget v2, p0, Lde/nurogames/android/ticb/base/views/ScoresView;->list_top:I */
/* iget v3, p0, Lde/nurogames/android/ticb/base/views/ScoresView;->FONT_LARGE:I */
/* sub-int/2addr v2, v3 */
/* int-to-float v2, v2 */
v3 = this.mPaint;
(( android.graphics.Canvas ) p1 ).drawText ( v0, v1, v2, v3 ); // invoke-virtual {p1, v0, v1, v2, v3}, Landroid/graphics/Canvas;->drawText(Ljava/lang/String;FFLandroid/graphics/Paint;)V
/* goto/16 :goto_2 */
/* .line 267 */
} // :cond_6
(( de.nurogames.android.ticb.base.views.ScoresView ) p0 ).getResources ( ); // invoke-virtual {p0}, Lde/nurogames/android/ticb/base/views/ScoresView;->getResources()Landroid/content/res/Resources;
(( android.content.res.Resources ) v0 ).getStringArray ( v1 ); // invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getStringArray(I)[Ljava/lang/String;
/* aget-object v0, v0, v1 */
(( java.lang.String ) v0 ).toString ( ); // invoke-virtual {v0}, Ljava/lang/String;->toString()Ljava/lang/String;
v1 = this.list_x;
/* aget v1, v1, v10 */
/* int-to-float v1, v1 */
/* iget v2, p0, Lde/nurogames/android/ticb/base/views/ScoresView;->list_top:I */
/* iget v3, p0, Lde/nurogames/android/ticb/base/views/ScoresView;->FONT_LARGE:I */
/* sub-int/2addr v2, v3 */
/* int-to-float v2, v2 */
v3 = this.mPaint;
(( android.graphics.Canvas ) p1 ).drawText ( v0, v1, v2, v3 ); // invoke-virtual {p1, v0, v1, v2, v3}, Landroid/graphics/Canvas;->drawText(Ljava/lang/String;FFLandroid/graphics/Paint;)V
/* goto/16 :goto_2 */
/* .line 301 */
} // :cond_7
/* iget v0, p0, Lde/nurogames/android/ticb/base/views/ScoresView;->selected_item:I */
/* iget v2, p0, Lde/nurogames/android/ticb/base/views/ScoresView;->MENU_STATS:I */
/* if-ne v0, v2, :cond_9 */
/* .line 303 */
v0 = this.menuitems;
/* aput-object v1, v0, v12 */
/* .line 304 */
v0 = this.menuitems;
/* aput-object v1, v0, v13 */
/* .line 306 */
(( de.nurogames.android.ticb.base.views.ScoresView ) p0 ).getResources ( ); // invoke-virtual {p0}, Lde/nurogames/android/ticb/base/views/ScoresView;->getResources()Landroid/content/res/Resources;
(( android.content.res.Resources ) v0 ).getIntArray ( v2 ); // invoke-virtual {v0, v2}, Landroid/content/res/Resources;->getIntArray(I)[I
/* aget v0, v0, v2 */
/* iput v0, p0, Lde/nurogames/android/ticb/base/views/ScoresView;->list_spacing:I */
/* .line 308 */
/* new-array v0, v12, [I */
int v2 = 0; // const/4 v2, 0x0
/* .line 309 */
(( de.nurogames.android.ticb.base.views.ScoresView ) p0 ).getResources ( ); // invoke-virtual {p0}, Lde/nurogames/android/ticb/base/views/ScoresView;->getResources()Landroid/content/res/Resources;
(( android.content.res.Resources ) v3 ).getIntArray ( v4 ); // invoke-virtual {v3, v4}, Landroid/content/res/Resources;->getIntArray(I)[I
/* aget v3, v3, v4 */
/* aput v3, v0, v2 */
/* .line 310 */
(( de.nurogames.android.ticb.base.views.ScoresView ) p0 ).getResources ( ); // invoke-virtual {p0}, Lde/nurogames/android/ticb/base/views/ScoresView;->getResources()Landroid/content/res/Resources;
(( android.content.res.Resources ) v2 ).getIntArray ( v3 ); // invoke-virtual {v2, v3}, Landroid/content/res/Resources;->getIntArray(I)[I
/* aget v2, v2, v3 */
/* aput v2, v0, v10 */
/* .line 311 */
(( de.nurogames.android.ticb.base.views.ScoresView ) p0 ).getResources ( ); // invoke-virtual {p0}, Lde/nurogames/android/ticb/base/views/ScoresView;->getResources()Landroid/content/res/Resources;
(( android.content.res.Resources ) v2 ).getIntArray ( v3 ); // invoke-virtual {v2, v3}, Landroid/content/res/Resources;->getIntArray(I)[I
/* aget v2, v2, v3 */
/* aput v2, v0, v11 */
/* .line 308 */
this.list_x = v0;
/* .line 314 */
v0 = this.mPaint;
/* iget v2, p0, Lde/nurogames/android/ticb/base/views/ScoresView;->FONT_LARGE:I */
/* int-to-float v2, v2 */
(( android.graphics.Paint ) v0 ).setTextSize ( v2 ); // invoke-virtual {v0, v2}, Landroid/graphics/Paint;->setTextSize(F)V
/* .line 315 */
v0 = this.mPaint;
int v2 = -1; // const/4 v2, -0x1
(( android.graphics.Paint ) v0 ).setColor ( v2 ); // invoke-virtual {v0, v2}, Landroid/graphics/Paint;->setColor(I)V
/* .line 316 */
(( de.nurogames.android.ticb.base.views.ScoresView ) p0 ).getResources ( ); // invoke-virtual {p0}, Lde/nurogames/android/ticb/base/views/ScoresView;->getResources()Landroid/content/res/Resources;
(( android.content.res.Resources ) v0 ).getStringArray ( v2 ); // invoke-virtual {v0, v2}, Landroid/content/res/Resources;->getStringArray(I)[Ljava/lang/String;
/* aget-object v0, v0, v2 */
(( java.lang.String ) v0 ).toString ( ); // invoke-virtual {v0}, Ljava/lang/String;->toString()Ljava/lang/String;
v2 = this.list_x;
/* aget v2, v2, v10 */
/* int-to-float v2, v2 */
/* iget v3, p0, Lde/nurogames/android/ticb/base/views/ScoresView;->list_top:I */
/* iget v4, p0, Lde/nurogames/android/ticb/base/views/ScoresView;->FONT_LARGE:I */
/* sub-int/2addr v3, v4 */
/* int-to-float v3, v3 */
v4 = this.mPaint;
(( android.graphics.Canvas ) p1 ).drawText ( v0, v2, v3, v4 ); // invoke-virtual {p1, v0, v2, v3, v4}, Landroid/graphics/Canvas;->drawText(Ljava/lang/String;FFLandroid/graphics/Paint;)V
/* .line 318 */
v0 = this.mPaint;
/* iget v2, p0, Lde/nurogames/android/ticb/base/views/ScoresView;->FONT_MEDIUM:I */
/* int-to-float v2, v2 */
(( android.graphics.Paint ) v0 ).setTextSize ( v2 ); // invoke-virtual {v0, v2}, Landroid/graphics/Paint;->setTextSize(F)V
/* .line 319 */
int v7 = 0; // const/4 v7, 0x0
} // :goto_3
v0 = this.stats;
/* array-length v0, v0 */
/* if-ge v7, v0, :cond_0 */
/* .line 321 */
v0 = de.nurogames.android.ticb.base.core.AppResources.imgStatIcons;
/* aget-object v0, v0, v7 */
if ( v0 != null) { // if-eqz v0, :cond_8
/* .line 322 */
v0 = de.nurogames.android.ticb.base.core.AppResources.imgStatIcons;
/* aget-object v0, v0, v7 */
v2 = this.list_x;
/* aget v2, v2, v10 */
v3 = de.nurogames.android.ticb.base.core.AppResources.imgStatIcons;
/* aget-object v3, v3, v7 */
v3 = (( android.graphics.Bitmap ) v3 ).getWidth ( ); // invoke-virtual {v3}, Landroid/graphics/Bitmap;->getWidth()I
/* sub-int/2addr v2, v3 */
/* iget v3, p0, Lde/nurogames/android/ticb/base/views/ScoresView;->icon_offset:I */
/* sub-int/2addr v2, v3 */
/* int-to-float v2, v2 */
/* iget v3, p0, Lde/nurogames/android/ticb/base/views/ScoresView;->list_top:I */
/* iget v4, p0, Lde/nurogames/android/ticb/base/views/ScoresView;->list_spacing:I */
/* mul-int/2addr v4, v7 */
/* add-int/2addr v3, v4 */
/* int-to-float v3, v3 */
(( android.graphics.Canvas ) p1 ).drawBitmap ( v0, v2, v3, v1 ); // invoke-virtual {p1, v0, v2, v3, v1}, Landroid/graphics/Canvas;->drawBitmap(Landroid/graphics/Bitmap;FFLandroid/graphics/Paint;)V
/* .line 324 */
} // :cond_8
v0 = this.mPaint;
/* const/16 v2, 0x6e */
/* const/16 v3, 0x46 */
int v4 = 0; // const/4 v4, 0x0
v2 = android.graphics.Color .rgb ( v2,v3,v4 );
(( android.graphics.Paint ) v0 ).setColor ( v2 ); // invoke-virtual {v0, v2}, Landroid/graphics/Paint;->setColor(I)V
/* .line 325 */
v0 = this.stats_names;
/* aget-object v0, v0, v7 */
v2 = this.list_x;
/* aget v2, v2, v10 */
/* int-to-float v2, v2 */
/* iget v3, p0, Lde/nurogames/android/ticb/base/views/ScoresView;->list_top:I */
/* iget v4, p0, Lde/nurogames/android/ticb/base/views/ScoresView;->list_font_dif:I */
/* add-int/2addr v3, v4 */
/* iget v4, p0, Lde/nurogames/android/ticb/base/views/ScoresView;->list_spacing:I */
/* mul-int/2addr v4, v7 */
/* add-int/2addr v3, v4 */
/* int-to-float v3, v3 */
v4 = this.mPaint;
(( android.graphics.Canvas ) p1 ).drawText ( v0, v2, v3, v4 ); // invoke-virtual {p1, v0, v2, v3, v4}, Landroid/graphics/Canvas;->drawText(Ljava/lang/String;FFLandroid/graphics/Paint;)V
/* .line 327 */
v0 = this.mPaint;
int v2 = -1; // const/4 v2, -0x1
(( android.graphics.Paint ) v0 ).setColor ( v2 ); // invoke-virtual {v0, v2}, Landroid/graphics/Paint;->setColor(I)V
/* .line 328 */
/* new-instance v0, Ljava/lang/StringBuilder; */
/* invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V */
v2 = this.stats;
/* aget v2, v2, v7 */
(( java.lang.StringBuilder ) v0 ).append ( v2 ); // invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v0 ).toString ( ); // invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
v2 = this.list_x;
/* aget v2, v2, v11 */
/* int-to-float v2, v2 */
/* iget v3, p0, Lde/nurogames/android/ticb/base/views/ScoresView;->list_top:I */
/* iget v4, p0, Lde/nurogames/android/ticb/base/views/ScoresView;->list_font_dif:I */
/* add-int/2addr v3, v4 */
/* iget v4, p0, Lde/nurogames/android/ticb/base/views/ScoresView;->list_spacing:I */
/* mul-int/2addr v4, v7 */
/* add-int/2addr v3, v4 */
/* int-to-float v3, v3 */
v4 = this.mPaint;
(( android.graphics.Canvas ) p1 ).drawText ( v0, v2, v3, v4 ); // invoke-virtual {p1, v0, v2, v3, v4}, Landroid/graphics/Canvas;->drawText(Ljava/lang/String;FFLandroid/graphics/Paint;)V
/* .line 319 */
/* add-int/lit8 v7, v7, 0x1 */
/* .line 333 */
} // :cond_9
/* iget v0, p0, Lde/nurogames/android/ticb/base/views/ScoresView;->selected_item:I */
/* iget v2, p0, Lde/nurogames/android/ticb/base/views/ScoresView;->MENU_TASKS:I */
/* if-ne v0, v2, :cond_0 */
/* .line 335 */
(( de.nurogames.android.ticb.base.views.ScoresView ) p0 ).getResources ( ); // invoke-virtual {p0}, Lde/nurogames/android/ticb/base/views/ScoresView;->getResources()Landroid/content/res/Resources;
(( android.content.res.Resources ) v0 ).getIntArray ( v2 ); // invoke-virtual {v0, v2}, Landroid/content/res/Resources;->getIntArray(I)[I
/* aget v0, v0, v2 */
/* iput v0, p0, Lde/nurogames/android/ticb/base/views/ScoresView;->list_spacing:I */
/* .line 337 */
/* new-array v0, v12, [I */
int v2 = 0; // const/4 v2, 0x0
/* .line 338 */
(( de.nurogames.android.ticb.base.views.ScoresView ) p0 ).getResources ( ); // invoke-virtual {p0}, Lde/nurogames/android/ticb/base/views/ScoresView;->getResources()Landroid/content/res/Resources;
(( android.content.res.Resources ) v3 ).getIntArray ( v4 ); // invoke-virtual {v3, v4}, Landroid/content/res/Resources;->getIntArray(I)[I
/* aget v3, v3, v4 */
/* aput v3, v0, v2 */
/* .line 339 */
(( de.nurogames.android.ticb.base.views.ScoresView ) p0 ).getResources ( ); // invoke-virtual {p0}, Lde/nurogames/android/ticb/base/views/ScoresView;->getResources()Landroid/content/res/Resources;
(( android.content.res.Resources ) v2 ).getIntArray ( v3 ); // invoke-virtual {v2, v3}, Landroid/content/res/Resources;->getIntArray(I)[I
/* aget v2, v2, v3 */
/* aput v2, v0, v10 */
/* .line 340 */
(( de.nurogames.android.ticb.base.views.ScoresView ) p0 ).getResources ( ); // invoke-virtual {p0}, Lde/nurogames/android/ticb/base/views/ScoresView;->getResources()Landroid/content/res/Resources;
(( android.content.res.Resources ) v2 ).getIntArray ( v3 ); // invoke-virtual {v2, v3}, Landroid/content/res/Resources;->getIntArray(I)[I
/* aget v2, v2, v3 */
/* aput v2, v0, v11 */
/* .line 337 */
this.list_x = v0;
/* .line 343 */
v0 = this.menuitems;
/* aput-object v1, v0, v13 */
/* .line 346 */
v0 = this.menuitems;
/* aget-object v0, v0, v12 */
/* if-nez v0, :cond_a */
/* .line 347 */
v8 = this.menuitems;
/* new-instance v0, Lde/nurogames/android/ticb/base/objects/objMenuButton; */
/* .line 348 */
v2 = this.list_x;
/* aget v2, v2, v10 */
/* iget v3, p0, Lde/nurogames/android/ticb/base/views/ScoresView;->icon_offset:I */
/* sub-int/2addr v2, v3 */
v3 = de.nurogames.android.ticb.base.core.AppResources.imgTaskHelp;
v3 = (( android.graphics.Bitmap ) v3 ).getWidth ( ); // invoke-virtual {v3}, Landroid/graphics/Bitmap;->getWidth()I
/* sub-int/2addr v2, v3 */
/* .line 349 */
/* iget v3, p0, Lde/nurogames/android/ticb/base/views/ScoresView;->list_top:I */
v4 = de.nurogames.android.ticb.base.core.AppResources.imgTaskHelp;
v4 = (( android.graphics.Bitmap ) v4 ).getHeight ( ); // invoke-virtual {v4}, Landroid/graphics/Bitmap;->getHeight()I
/* sub-int/2addr v3, v4 */
/* .line 350 */
v4 = de.nurogames.android.ticb.base.core.AppResources.imgTaskHelp;
/* .line 351 */
v5 = de.nurogames.android.ticb.base.core.AppResources.imgTaskHelp;
/* invoke-direct/range {v0 ..v5}, Lde/nurogames/android/ticb/base/objects/objMenuButton;-><init>(Ljava/lang/String;IILandroid/graphics/Bitmap;Landroid/graphics/Bitmap;)V */
/* .line 347 */
/* aput-object v0, v8, v12 */
/* .line 357 */
} // :goto_4
v0 = this.menuitems;
/* aget-object v0, v0, v12 */
(( de.nurogames.android.ticb.base.objects.objMenuButton ) v0 ).onDraw ( p1 ); // invoke-virtual {v0, p1}, Lde/nurogames/android/ticb/base/objects/objMenuButton;->onDraw(Landroid/graphics/Canvas;)V
/* .line 359 */
v0 = this.mPaint;
/* iget v2, p0, Lde/nurogames/android/ticb/base/views/ScoresView;->FONT_LARGE:I */
/* int-to-float v2, v2 */
(( android.graphics.Paint ) v0 ).setTextSize ( v2 ); // invoke-virtual {v0, v2}, Landroid/graphics/Paint;->setTextSize(F)V
/* .line 360 */
v0 = this.mPaint;
int v2 = -1; // const/4 v2, -0x1
(( android.graphics.Paint ) v0 ).setColor ( v2 ); // invoke-virtual {v0, v2}, Landroid/graphics/Paint;->setColor(I)V
/* .line 361 */
(( de.nurogames.android.ticb.base.views.ScoresView ) p0 ).getResources ( ); // invoke-virtual {p0}, Lde/nurogames/android/ticb/base/views/ScoresView;->getResources()Landroid/content/res/Resources;
(( android.content.res.Resources ) v0 ).getStringArray ( v2 ); // invoke-virtual {v0, v2}, Landroid/content/res/Resources;->getStringArray(I)[Ljava/lang/String;
/* aget-object v0, v0, v2 */
(( java.lang.String ) v0 ).toString ( ); // invoke-virtual {v0}, Ljava/lang/String;->toString()Ljava/lang/String;
v2 = this.list_x;
/* aget v2, v2, v10 */
/* int-to-float v2, v2 */
/* iget v3, p0, Lde/nurogames/android/ticb/base/views/ScoresView;->list_top:I */
/* iget v4, p0, Lde/nurogames/android/ticb/base/views/ScoresView;->FONT_LARGE:I */
/* sub-int/2addr v3, v4 */
/* int-to-float v3, v3 */
v4 = this.mPaint;
(( android.graphics.Canvas ) p1 ).drawText ( v0, v2, v3, v4 ); // invoke-virtual {p1, v0, v2, v3, v4}, Landroid/graphics/Canvas;->drawText(Ljava/lang/String;FFLandroid/graphics/Paint;)V
/* .line 363 */
v0 = this.mPaint;
/* iget v2, p0, Lde/nurogames/android/ticb/base/views/ScoresView;->FONT_MEDIUM:I */
/* int-to-float v2, v2 */
(( android.graphics.Paint ) v0 ).setTextSize ( v2 ); // invoke-virtual {v0, v2}, Landroid/graphics/Paint;->setTextSize(F)V
/* .line 364 */
v0 = this.mPaint;
/* const/16 v2, 0x6e */
/* const/16 v3, 0x46 */
int v4 = 0; // const/4 v4, 0x0
v2 = android.graphics.Color .rgb ( v2,v3,v4 );
(( android.graphics.Paint ) v0 ).setColor ( v2 ); // invoke-virtual {v0, v2}, Landroid/graphics/Paint;->setColor(I)V
/* .line 365 */
de.nurogames.android.ticb.base.views.TinyBeeView .checkTaskRequirements ( );
/* .line 366 */
/* .local v6, "check":[Z */
int v7 = 0; // const/4 v7, 0x0
} // :goto_5
/* if-lt v7, v12, :cond_b */
/* .line 375 */
v0 = this.mPaint;
/* iget v2, p0, Lde/nurogames/android/ticb/base/views/ScoresView;->FONT_LARGE:I */
/* int-to-float v2, v2 */
(( android.graphics.Paint ) v0 ).setTextSize ( v2 ); // invoke-virtual {v0, v2}, Landroid/graphics/Paint;->setTextSize(F)V
/* .line 376 */
v0 = this.mPaint;
int v2 = -1; // const/4 v2, -0x1
(( android.graphics.Paint ) v0 ).setColor ( v2 ); // invoke-virtual {v0, v2}, Landroid/graphics/Paint;->setColor(I)V
/* .line 378 */
(( de.nurogames.android.ticb.base.views.ScoresView ) p0 ).getResources ( ); // invoke-virtual {p0}, Lde/nurogames/android/ticb/base/views/ScoresView;->getResources()Landroid/content/res/Resources;
(( android.content.res.Resources ) v0 ).getStringArray ( v2 ); // invoke-virtual {v0, v2}, Landroid/content/res/Resources;->getStringArray(I)[Ljava/lang/String;
/* aget-object v0, v0, v2 */
(( java.lang.String ) v0 ).toString ( ); // invoke-virtual {v0}, Ljava/lang/String;->toString()Ljava/lang/String;
v2 = this.list_x;
/* aget v2, v2, v10 */
/* int-to-float v2, v2 */
/* iget v3, p0, Lde/nurogames/android/ticb/base/views/ScoresView;->multiplier_bar_y:I */
/* int-to-float v3, v3 */
v4 = this.mPaint;
(( android.graphics.Canvas ) p1 ).drawText ( v0, v2, v3, v4 ); // invoke-virtual {p1, v0, v2, v3, v4}, Landroid/graphics/Canvas;->drawText(Ljava/lang/String;FFLandroid/graphics/Paint;)V
/* .line 381 */
/* if-lt v0, v2, :cond_e */
/* .line 382 */
v0 = de.nurogames.android.ticb.base.core.AppResources.imgMultiplierTaskbar;
v2 = this.list_x;
int v3 = 0; // const/4 v3, 0x0
/* aget v2, v2, v3 */
/* int-to-float v2, v2 */
/* iget v3, p0, Lde/nurogames/android/ticb/base/views/ScoresView;->multiplier_bar_y:I */
/* add-int/lit8 v3, v3, 0x14 */
/* int-to-float v3, v3 */
(( android.graphics.Canvas ) p1 ).drawBitmap ( v0, v2, v3, v1 ); // invoke-virtual {p1, v0, v2, v3, v1}, Landroid/graphics/Canvas;->drawBitmap(Landroid/graphics/Bitmap;FFLandroid/graphics/Paint;)V
/* .line 383 */
int v7 = 0; // const/4 v7, 0x0
} // :goto_6
/* if-ge v7, v0, :cond_0 */
/* .line 384 */
/* rem-int/lit8 v0, v7, 0x2 */
/* if-nez v0, :cond_d */
/* .line 385 */
v0 = de.nurogames.android.ticb.base.core.AppResources.imgHoneyDot;
/* aget-object v0, v0, v11 */
v2 = this.list_x;
int v3 = 0; // const/4 v3, 0x0
/* aget v2, v2, v3 */
/* add-int/lit8 v2, v2, 0x4 */
/* mul-int/lit8 v3, v7, 0x23 */
/* add-int/2addr v2, v3 */
/* int-to-float v2, v2 */
/* iget v3, p0, Lde/nurogames/android/ticb/base/views/ScoresView;->multiplier_bar_y:I */
/* add-int/lit8 v3, v3, 0x2c */
/* int-to-float v3, v3 */
(( android.graphics.Canvas ) p1 ).drawBitmap ( v0, v2, v3, v1 ); // invoke-virtual {p1, v0, v2, v3, v1}, Landroid/graphics/Canvas;->drawBitmap(Landroid/graphics/Bitmap;FFLandroid/graphics/Paint;)V
/* .line 383 */
} // :goto_7
/* add-int/lit8 v7, v7, 0x1 */
/* .line 354 */
} // .end local v6 # "check":[Z
} // :cond_a
v0 = this.menuitems;
/* aget-object v0, v0, v12 */
v2 = this.list_x;
/* aget v2, v2, v10 */
/* iget v3, p0, Lde/nurogames/android/ticb/base/views/ScoresView;->icon_offset:I */
/* sub-int/2addr v2, v3 */
v3 = de.nurogames.android.ticb.base.core.AppResources.imgTaskHelp;
v3 = (( android.graphics.Bitmap ) v3 ).getWidth ( ); // invoke-virtual {v3}, Landroid/graphics/Bitmap;->getWidth()I
/* sub-int/2addr v2, v3 */
(( de.nurogames.android.ticb.base.objects.objMenuButton ) v0 ).X ( v2 ); // invoke-virtual {v0, v2}, Lde/nurogames/android/ticb/base/objects/objMenuButton;->X(I)V
/* .line 355 */
v0 = this.menuitems;
/* aget-object v0, v0, v12 */
/* iget v2, p0, Lde/nurogames/android/ticb/base/views/ScoresView;->list_top:I */
v3 = de.nurogames.android.ticb.base.core.AppResources.imgTaskHelp;
v3 = (( android.graphics.Bitmap ) v3 ).getHeight ( ); // invoke-virtual {v3}, Landroid/graphics/Bitmap;->getHeight()I
/* sub-int/2addr v2, v3 */
(( de.nurogames.android.ticb.base.objects.objMenuButton ) v0 ).Y ( v2 ); // invoke-virtual {v0, v2}, Lde/nurogames/android/ticb/base/objects/objMenuButton;->Y(I)V
/* goto/16 :goto_4 */
/* .line 367 */
/* .restart local v6 # "check":[Z */
} // :cond_b
/* aget-boolean v0, v6, v7 */
if ( v0 != null) { // if-eqz v0, :cond_c
/* .line 368 */
v0 = de.nurogames.android.ticb.base.core.AppResources.imgTaskIcons;
/* aget-object v0, v0, v10 */
v2 = this.list_x;
/* aget v2, v2, v10 */
v3 = de.nurogames.android.ticb.base.core.AppResources.imgTaskIcons;
/* aget-object v3, v3, v10 */
v3 = (( android.graphics.Bitmap ) v3 ).getWidth ( ); // invoke-virtual {v3}, Landroid/graphics/Bitmap;->getWidth()I
/* sub-int/2addr v2, v3 */
/* iget v3, p0, Lde/nurogames/android/ticb/base/views/ScoresView;->icon_offset:I */
/* sub-int/2addr v2, v3 */
/* int-to-float v2, v2 */
/* iget v3, p0, Lde/nurogames/android/ticb/base/views/ScoresView;->list_top:I */
/* iget v4, p0, Lde/nurogames/android/ticb/base/views/ScoresView;->list_spacing:I */
/* mul-int/2addr v4, v7 */
/* add-int/2addr v3, v4 */
/* int-to-float v3, v3 */
(( android.graphics.Canvas ) p1 ).drawBitmap ( v0, v2, v3, v1 ); // invoke-virtual {p1, v0, v2, v3, v1}, Landroid/graphics/Canvas;->drawBitmap(Landroid/graphics/Bitmap;FFLandroid/graphics/Paint;)V
/* .line 372 */
} // :goto_8
v0 = this.task_quest_names;
/* aget-object v0, v0, v2 */
/* aget-object v0, v0, v2 */
/* aget-object v0, v0, v7 */
v2 = this.list_x;
/* aget v2, v2, v10 */
/* int-to-float v2, v2 */
/* iget v3, p0, Lde/nurogames/android/ticb/base/views/ScoresView;->list_top:I */
/* iget v4, p0, Lde/nurogames/android/ticb/base/views/ScoresView;->FONT_MEDIUM:I */
/* add-int/2addr v3, v4 */
v4 = de.nurogames.android.ticb.base.core.AppResources.imgTaskIcons;
/* aget-object v4, v4, v10 */
v4 = (( android.graphics.Bitmap ) v4 ).getHeight ( ); // invoke-virtual {v4}, Landroid/graphics/Bitmap;->getHeight()I
/* div-int/lit8 v4, v4, 0x2 */
/* iget v5, p0, Lde/nurogames/android/ticb/base/views/ScoresView;->FONT_MEDIUM:I */
/* div-int/lit8 v5, v5, 0x2 */
/* sub-int/2addr v4, v5 */
/* add-int/2addr v3, v4 */
/* iget v4, p0, Lde/nurogames/android/ticb/base/views/ScoresView;->list_spacing:I */
/* mul-int/2addr v4, v7 */
/* add-int/2addr v3, v4 */
/* int-to-float v3, v3 */
v4 = this.mPaint;
(( android.graphics.Canvas ) p1 ).drawText ( v0, v2, v3, v4 ); // invoke-virtual {p1, v0, v2, v3, v4}, Landroid/graphics/Canvas;->drawText(Ljava/lang/String;FFLandroid/graphics/Paint;)V
/* .line 366 */
/* add-int/lit8 v7, v7, 0x1 */
/* goto/16 :goto_5 */
/* .line 370 */
} // :cond_c
v0 = de.nurogames.android.ticb.base.core.AppResources.imgTaskIcons;
int v2 = 0; // const/4 v2, 0x0
/* aget-object v0, v0, v2 */
v2 = this.list_x;
/* aget v2, v2, v10 */
v3 = de.nurogames.android.ticb.base.core.AppResources.imgTaskIcons;
int v4 = 0; // const/4 v4, 0x0
/* aget-object v3, v3, v4 */
v3 = (( android.graphics.Bitmap ) v3 ).getWidth ( ); // invoke-virtual {v3}, Landroid/graphics/Bitmap;->getWidth()I
/* sub-int/2addr v2, v3 */
/* iget v3, p0, Lde/nurogames/android/ticb/base/views/ScoresView;->icon_offset:I */
/* sub-int/2addr v2, v3 */
/* int-to-float v2, v2 */
/* iget v3, p0, Lde/nurogames/android/ticb/base/views/ScoresView;->list_top:I */
/* iget v4, p0, Lde/nurogames/android/ticb/base/views/ScoresView;->list_spacing:I */
/* mul-int/2addr v4, v7 */
/* add-int/2addr v3, v4 */
/* int-to-float v3, v3 */
(( android.graphics.Canvas ) p1 ).drawBitmap ( v0, v2, v3, v1 ); // invoke-virtual {p1, v0, v2, v3, v1}, Landroid/graphics/Canvas;->drawBitmap(Landroid/graphics/Bitmap;FFLandroid/graphics/Paint;)V
/* .line 387 */
} // :cond_d
v0 = de.nurogames.android.ticb.base.core.AppResources.imgHoneyDot;
/* aget-object v0, v0, v11 */
v2 = this.list_x;
int v3 = 0; // const/4 v3, 0x0
/* aget v2, v2, v3 */
/* add-int/lit8 v2, v2, 0x4 */
/* mul-int/lit8 v3, v7, 0x23 */
/* add-int/2addr v2, v3 */
/* int-to-float v2, v2 */
/* iget v3, p0, Lde/nurogames/android/ticb/base/views/ScoresView;->multiplier_bar_y:I */
/* add-int/lit8 v3, v3, 0x54 */
/* int-to-float v3, v3 */
(( android.graphics.Canvas ) p1 ).drawBitmap ( v0, v2, v3, v1 ); // invoke-virtual {p1, v0, v2, v3, v1}, Landroid/graphics/Canvas;->drawBitmap(Landroid/graphics/Bitmap;FFLandroid/graphics/Paint;)V
/* goto/16 :goto_7 */
/* .line 390 */
} // :cond_e
/* if-ne v0, v2, :cond_10 */
/* .line 391 */
v0 = de.nurogames.android.ticb.base.core.AppResources.imgMultiplierTaskbar;
v3 = de.nurogames.android.ticb.base.core.AppResources.imgMultiplierTaskbar;
v3 = (( android.graphics.Bitmap ) v3 ).getWidth ( ); // invoke-virtual {v3}, Landroid/graphics/Bitmap;->getWidth()I
/* div-int/lit8 v3, v3, 0x2 */
/* sub-int/2addr v2, v3 */
/* iget v3, p0, Lde/nurogames/android/ticb/base/views/ScoresView;->FONT_LARGE:I */
/* sub-int/2addr v2, v3 */
/* int-to-float v2, v2 */
/* iget v3, p0, Lde/nurogames/android/ticb/base/views/ScoresView;->multiplier_bar_y:I */
/* add-int/lit8 v3, v3, 0x14 */
/* int-to-float v3, v3 */
(( android.graphics.Canvas ) p1 ).drawBitmap ( v0, v2, v3, v1 ); // invoke-virtual {p1, v0, v2, v3, v1}, Landroid/graphics/Canvas;->drawBitmap(Landroid/graphics/Bitmap;FFLandroid/graphics/Paint;)V
/* .line 392 */
int v7 = 0; // const/4 v7, 0x0
} // :goto_9
/* if-ge v7, v0, :cond_0 */
/* .line 393 */
/* rem-int/lit8 v0, v7, 0x2 */
/* if-nez v0, :cond_f */
/* .line 394 */
v0 = de.nurogames.android.ticb.base.core.AppResources.imgHoneyDot;
/* aget-object v0, v0, v11 */
v3 = de.nurogames.android.ticb.base.core.AppResources.imgMultiplierTaskbar;
v3 = (( android.graphics.Bitmap ) v3 ).getWidth ( ); // invoke-virtual {v3}, Landroid/graphics/Bitmap;->getWidth()I
/* div-int/lit8 v3, v3, 0x2 */
/* sub-int/2addr v2, v3 */
/* add-int/lit8 v2, v2, -0x1f */
/* mul-int/lit8 v3, v7, 0x1a */
/* add-int/2addr v2, v3 */
/* int-to-float v2, v2 */
/* iget v3, p0, Lde/nurogames/android/ticb/base/views/ScoresView;->multiplier_bar_y:I */
/* add-int/lit8 v3, v3, 0x25 */
/* int-to-float v3, v3 */
(( android.graphics.Canvas ) p1 ).drawBitmap ( v0, v2, v3, v1 ); // invoke-virtual {p1, v0, v2, v3, v1}, Landroid/graphics/Canvas;->drawBitmap(Landroid/graphics/Bitmap;FFLandroid/graphics/Paint;)V
/* .line 392 */
} // :goto_a
/* add-int/lit8 v7, v7, 0x1 */
/* .line 396 */
} // :cond_f
v0 = de.nurogames.android.ticb.base.core.AppResources.imgHoneyDot;
/* aget-object v0, v0, v11 */
v3 = de.nurogames.android.ticb.base.core.AppResources.imgMultiplierTaskbar;
v3 = (( android.graphics.Bitmap ) v3 ).getWidth ( ); // invoke-virtual {v3}, Landroid/graphics/Bitmap;->getWidth()I
/* div-int/lit8 v3, v3, 0x2 */
/* sub-int/2addr v2, v3 */
/* add-int/lit8 v2, v2, -0x1f */
/* mul-int/lit8 v3, v7, 0x1a */
/* add-int/2addr v2, v3 */
/* int-to-float v2, v2 */
/* iget v3, p0, Lde/nurogames/android/ticb/base/views/ScoresView;->multiplier_bar_y:I */
/* add-int/lit8 v3, v3, 0x43 */
/* int-to-float v3, v3 */
(( android.graphics.Canvas ) p1 ).drawBitmap ( v0, v2, v3, v1 ); // invoke-virtual {p1, v0, v2, v3, v1}, Landroid/graphics/Canvas;->drawBitmap(Landroid/graphics/Bitmap;FFLandroid/graphics/Paint;)V
/* .line 398 */
} // :cond_10
/* if-ne v0, v2, :cond_12 */
/* .line 399 */
v0 = de.nurogames.android.ticb.base.core.AppResources.imgMultiplierTaskbar;
v3 = de.nurogames.android.ticb.base.core.AppResources.imgMultiplierTaskbar;
v3 = (( android.graphics.Bitmap ) v3 ).getWidth ( ); // invoke-virtual {v3}, Landroid/graphics/Bitmap;->getWidth()I
/* div-int/lit8 v3, v3, 0x2 */
/* sub-int/2addr v2, v3 */
/* iget v3, p0, Lde/nurogames/android/ticb/base/views/ScoresView;->FONT_LARGE:I */
/* sub-int/2addr v2, v3 */
/* int-to-float v2, v2 */
/* iget v3, p0, Lde/nurogames/android/ticb/base/views/ScoresView;->multiplier_bar_y:I */
/* add-int/lit8 v3, v3, 0x14 */
/* int-to-float v3, v3 */
(( android.graphics.Canvas ) p1 ).drawBitmap ( v0, v2, v3, v1 ); // invoke-virtual {p1, v0, v2, v3, v1}, Landroid/graphics/Canvas;->drawBitmap(Landroid/graphics/Bitmap;FFLandroid/graphics/Paint;)V
/* .line 400 */
int v7 = 0; // const/4 v7, 0x0
} // :goto_b
/* if-ge v7, v0, :cond_0 */
/* .line 401 */
/* rem-int/lit8 v0, v7, 0x2 */
/* if-nez v0, :cond_11 */
/* .line 402 */
v0 = de.nurogames.android.ticb.base.core.AppResources.imgHoneyDot;
/* aget-object v0, v0, v11 */
v3 = de.nurogames.android.ticb.base.core.AppResources.imgMultiplierTaskbar;
v3 = (( android.graphics.Bitmap ) v3 ).getWidth ( ); // invoke-virtual {v3}, Landroid/graphics/Bitmap;->getWidth()I
/* div-int/lit8 v3, v3, 0x2 */
/* sub-int/2addr v2, v3 */
/* add-int/lit8 v2, v2, -0x1f */
/* mul-int/lit8 v3, v7, 0x1a */
/* add-int/2addr v2, v3 */
/* int-to-float v2, v2 */
/* iget v3, p0, Lde/nurogames/android/ticb/base/views/ScoresView;->multiplier_bar_y:I */
/* add-int/lit8 v3, v3, 0x25 */
/* int-to-float v3, v3 */
(( android.graphics.Canvas ) p1 ).drawBitmap ( v0, v2, v3, v1 ); // invoke-virtual {p1, v0, v2, v3, v1}, Landroid/graphics/Canvas;->drawBitmap(Landroid/graphics/Bitmap;FFLandroid/graphics/Paint;)V
/* .line 400 */
} // :goto_c
/* add-int/lit8 v7, v7, 0x1 */
/* .line 404 */
} // :cond_11
v0 = de.nurogames.android.ticb.base.core.AppResources.imgHoneyDot;
/* aget-object v0, v0, v11 */
v3 = de.nurogames.android.ticb.base.core.AppResources.imgMultiplierTaskbar;
v3 = (( android.graphics.Bitmap ) v3 ).getWidth ( ); // invoke-virtual {v3}, Landroid/graphics/Bitmap;->getWidth()I
/* div-int/lit8 v3, v3, 0x2 */
/* sub-int/2addr v2, v3 */
/* add-int/lit8 v2, v2, -0x1f */
/* mul-int/lit8 v3, v7, 0x1a */
/* add-int/2addr v2, v3 */
/* int-to-float v2, v2 */
/* iget v3, p0, Lde/nurogames/android/ticb/base/views/ScoresView;->multiplier_bar_y:I */
/* add-int/lit8 v3, v3, 0x43 */
/* int-to-float v3, v3 */
(( android.graphics.Canvas ) p1 ).drawBitmap ( v0, v2, v3, v1 ); // invoke-virtual {p1, v0, v2, v3, v1}, Landroid/graphics/Canvas;->drawBitmap(Landroid/graphics/Bitmap;FFLandroid/graphics/Paint;)V
/* .line 406 */
} // :cond_12
/* if-ne v0, v2, :cond_14 */
/* .line 407 */
v0 = de.nurogames.android.ticb.base.core.AppResources.imgMultiplierTaskbar;
v3 = de.nurogames.android.ticb.base.core.AppResources.imgMultiplierTaskbar;
v3 = (( android.graphics.Bitmap ) v3 ).getWidth ( ); // invoke-virtual {v3}, Landroid/graphics/Bitmap;->getWidth()I
/* div-int/lit8 v3, v3, 0x2 */
/* sub-int/2addr v2, v3 */
/* iget v3, p0, Lde/nurogames/android/ticb/base/views/ScoresView;->FONT_LARGE:I */
/* sub-int/2addr v2, v3 */
/* int-to-float v2, v2 */
/* iget v3, p0, Lde/nurogames/android/ticb/base/views/ScoresView;->multiplier_bar_y:I */
/* add-int/lit8 v3, v3, 0xd */
/* int-to-float v3, v3 */
(( android.graphics.Canvas ) p1 ).drawBitmap ( v0, v2, v3, v1 ); // invoke-virtual {p1, v0, v2, v3, v1}, Landroid/graphics/Canvas;->drawBitmap(Landroid/graphics/Bitmap;FFLandroid/graphics/Paint;)V
/* .line 408 */
int v7 = 0; // const/4 v7, 0x0
} // :goto_d
/* if-ge v7, v0, :cond_0 */
/* .line 409 */
/* rem-int/lit8 v0, v7, 0x2 */
/* if-nez v0, :cond_13 */
/* .line 410 */
v0 = de.nurogames.android.ticb.base.core.AppResources.imgHoneyDot;
/* aget-object v0, v0, v11 */
v3 = de.nurogames.android.ticb.base.core.AppResources.imgMultiplierTaskbar;
v3 = (( android.graphics.Bitmap ) v3 ).getWidth ( ); // invoke-virtual {v3}, Landroid/graphics/Bitmap;->getWidth()I
/* div-int/lit8 v3, v3, 0x2 */
/* sub-int/2addr v2, v3 */
/* add-int/lit8 v2, v2, -0x15 */
/* int-to-float v2, v2 */
/* int-to-float v3, v7 */
/* const v4, 0x418a6666 # 17.3f */
/* mul-float/2addr v3, v4 */
/* add-float/2addr v2, v3 */
/* iget v3, p0, Lde/nurogames/android/ticb/base/views/ScoresView;->multiplier_bar_y:I */
/* add-int/lit8 v3, v3, 0x18 */
/* int-to-float v3, v3 */
(( android.graphics.Canvas ) p1 ).drawBitmap ( v0, v2, v3, v1 ); // invoke-virtual {p1, v0, v2, v3, v1}, Landroid/graphics/Canvas;->drawBitmap(Landroid/graphics/Bitmap;FFLandroid/graphics/Paint;)V
/* .line 408 */
} // :goto_e
/* add-int/lit8 v7, v7, 0x1 */
/* .line 412 */
} // :cond_13
v0 = de.nurogames.android.ticb.base.core.AppResources.imgHoneyDot;
/* aget-object v0, v0, v11 */
v3 = de.nurogames.android.ticb.base.core.AppResources.imgMultiplierTaskbar;
v3 = (( android.graphics.Bitmap ) v3 ).getWidth ( ); // invoke-virtual {v3}, Landroid/graphics/Bitmap;->getWidth()I
/* div-int/lit8 v3, v3, 0x2 */
/* sub-int/2addr v2, v3 */
/* add-int/lit8 v2, v2, -0x15 */
/* int-to-float v2, v2 */
/* int-to-float v3, v7 */
/* const v4, 0x418a6666 # 17.3f */
/* mul-float/2addr v3, v4 */
/* add-float/2addr v2, v3 */
/* iget v3, p0, Lde/nurogames/android/ticb/base/views/ScoresView;->multiplier_bar_y:I */
/* add-int/lit8 v3, v3, 0x2d */
/* int-to-float v3, v3 */
(( android.graphics.Canvas ) p1 ).drawBitmap ( v0, v2, v3, v1 ); // invoke-virtual {p1, v0, v2, v3, v1}, Landroid/graphics/Canvas;->drawBitmap(Landroid/graphics/Bitmap;FFLandroid/graphics/Paint;)V
/* .line 414 */
} // :cond_14
/* if-ne v0, v2, :cond_16 */
/* .line 415 */
v0 = de.nurogames.android.ticb.base.core.AppResources.imgMultiplierTaskbar;
v3 = de.nurogames.android.ticb.base.core.AppResources.imgMultiplierTaskbar;
v3 = (( android.graphics.Bitmap ) v3 ).getWidth ( ); // invoke-virtual {v3}, Landroid/graphics/Bitmap;->getWidth()I
/* div-int/lit8 v3, v3, 0x2 */
/* sub-int/2addr v2, v3 */
/* iget v3, p0, Lde/nurogames/android/ticb/base/views/ScoresView;->FONT_LARGE:I */
/* sub-int/2addr v2, v3 */
/* int-to-float v2, v2 */
/* iget v3, p0, Lde/nurogames/android/ticb/base/views/ScoresView;->multiplier_bar_y:I */
/* add-int/lit8 v3, v3, 0xd */
/* int-to-float v3, v3 */
(( android.graphics.Canvas ) p1 ).drawBitmap ( v0, v2, v3, v1 ); // invoke-virtual {p1, v0, v2, v3, v1}, Landroid/graphics/Canvas;->drawBitmap(Landroid/graphics/Bitmap;FFLandroid/graphics/Paint;)V
/* .line 416 */
int v7 = 0; // const/4 v7, 0x0
} // :goto_f
/* if-ge v7, v0, :cond_0 */
/* .line 417 */
/* rem-int/lit8 v0, v7, 0x2 */
/* if-nez v0, :cond_15 */
/* .line 418 */
v0 = de.nurogames.android.ticb.base.core.AppResources.imgHoneyDot;
/* aget-object v0, v0, v11 */
v3 = de.nurogames.android.ticb.base.core.AppResources.imgMultiplierTaskbar;
v3 = (( android.graphics.Bitmap ) v3 ).getWidth ( ); // invoke-virtual {v3}, Landroid/graphics/Bitmap;->getWidth()I
/* div-int/lit8 v3, v3, 0x2 */
/* sub-int/2addr v2, v3 */
/* add-int/lit8 v2, v2, -0xf */
/* int-to-float v2, v2 */
/* int-to-float v3, v7 */
/* const v4, 0x4151999a # 13.1f */
/* mul-float/2addr v3, v4 */
/* add-float/2addr v2, v3 */
/* iget v3, p0, Lde/nurogames/android/ticb/base/views/ScoresView;->multiplier_bar_y:I */
/* add-int/lit8 v3, v3, 0x12 */
/* int-to-float v3, v3 */
(( android.graphics.Canvas ) p1 ).drawBitmap ( v0, v2, v3, v1 ); // invoke-virtual {p1, v0, v2, v3, v1}, Landroid/graphics/Canvas;->drawBitmap(Landroid/graphics/Bitmap;FFLandroid/graphics/Paint;)V
/* .line 416 */
} // :goto_10
/* add-int/lit8 v7, v7, 0x1 */
/* .line 420 */
} // :cond_15
v0 = de.nurogames.android.ticb.base.core.AppResources.imgHoneyDot;
/* aget-object v0, v0, v11 */
v3 = de.nurogames.android.ticb.base.core.AppResources.imgMultiplierTaskbar;
v3 = (( android.graphics.Bitmap ) v3 ).getWidth ( ); // invoke-virtual {v3}, Landroid/graphics/Bitmap;->getWidth()I
/* div-int/lit8 v3, v3, 0x2 */
/* sub-int/2addr v2, v3 */
/* add-int/lit8 v2, v2, -0xf */
/* int-to-float v2, v2 */
/* int-to-float v3, v7 */
/* const v4, 0x4151999a # 13.1f */
/* mul-float/2addr v3, v4 */
/* add-float/2addr v2, v3 */
/* iget v3, p0, Lde/nurogames/android/ticb/base/views/ScoresView;->multiplier_bar_y:I */
/* add-int/lit8 v3, v3, 0x1c */
/* int-to-float v3, v3 */
(( android.graphics.Canvas ) p1 ).drawBitmap ( v0, v2, v3, v1 ); // invoke-virtual {p1, v0, v2, v3, v1}, Landroid/graphics/Canvas;->drawBitmap(Landroid/graphics/Bitmap;FFLandroid/graphics/Paint;)V
/* .line 422 */
} // :cond_16
/* if-ne v0, v2, :cond_18 */
/* .line 423 */
v0 = de.nurogames.android.ticb.base.core.AppResources.imgMultiplierTaskbar;
v3 = de.nurogames.android.ticb.base.core.AppResources.imgMultiplierTaskbar;
v3 = (( android.graphics.Bitmap ) v3 ).getWidth ( ); // invoke-virtual {v3}, Landroid/graphics/Bitmap;->getWidth()I
/* div-int/lit8 v3, v3, 0x2 */
/* sub-int/2addr v2, v3 */
/* iget v3, p0, Lde/nurogames/android/ticb/base/views/ScoresView;->FONT_LARGE:I */
/* sub-int/2addr v2, v3 */
/* int-to-float v2, v2 */
/* iget v3, p0, Lde/nurogames/android/ticb/base/views/ScoresView;->multiplier_bar_y:I */
/* add-int/lit8 v3, v3, 0xd */
/* int-to-float v3, v3 */
(( android.graphics.Canvas ) p1 ).drawBitmap ( v0, v2, v3, v1 ); // invoke-virtual {p1, v0, v2, v3, v1}, Landroid/graphics/Canvas;->drawBitmap(Landroid/graphics/Bitmap;FFLandroid/graphics/Paint;)V
/* .line 424 */
int v7 = 0; // const/4 v7, 0x0
} // :goto_11
/* if-ge v7, v0, :cond_0 */
/* .line 425 */
/* rem-int/lit8 v0, v7, 0x2 */
/* if-nez v0, :cond_17 */
/* .line 426 */
v0 = de.nurogames.android.ticb.base.core.AppResources.imgHoneyDot;
/* aget-object v0, v0, v11 */
v3 = de.nurogames.android.ticb.base.core.AppResources.imgMultiplierTaskbar;
v3 = (( android.graphics.Bitmap ) v3 ).getWidth ( ); // invoke-virtual {v3}, Landroid/graphics/Bitmap;->getWidth()I
/* div-int/lit8 v3, v3, 0x2 */
/* sub-int/2addr v2, v3 */
/* add-int/lit8 v2, v2, -0xf */
/* int-to-float v2, v2 */
/* int-to-float v3, v7 */
/* const v4, 0x4151999a # 13.1f */
/* mul-float/2addr v3, v4 */
/* add-float/2addr v2, v3 */
/* iget v3, p0, Lde/nurogames/android/ticb/base/views/ScoresView;->multiplier_bar_y:I */
/* add-int/lit8 v3, v3, 0x12 */
/* int-to-float v3, v3 */
(( android.graphics.Canvas ) p1 ).drawBitmap ( v0, v2, v3, v1 ); // invoke-virtual {p1, v0, v2, v3, v1}, Landroid/graphics/Canvas;->drawBitmap(Landroid/graphics/Bitmap;FFLandroid/graphics/Paint;)V
/* .line 424 */
} // :goto_12
/* add-int/lit8 v7, v7, 0x1 */
/* .line 428 */
} // :cond_17
v0 = de.nurogames.android.ticb.base.core.AppResources.imgHoneyDot;
/* aget-object v0, v0, v11 */
v3 = de.nurogames.android.ticb.base.core.AppResources.imgMultiplierTaskbar;
v3 = (( android.graphics.Bitmap ) v3 ).getWidth ( ); // invoke-virtual {v3}, Landroid/graphics/Bitmap;->getWidth()I
/* div-int/lit8 v3, v3, 0x2 */
/* sub-int/2addr v2, v3 */
/* add-int/lit8 v2, v2, -0xf */
/* int-to-float v2, v2 */
/* int-to-float v3, v7 */
/* const v4, 0x4151999a # 13.1f */
/* mul-float/2addr v3, v4 */
/* add-float/2addr v2, v3 */
/* iget v3, p0, Lde/nurogames/android/ticb/base/views/ScoresView;->multiplier_bar_y:I */
/* add-int/lit8 v3, v3, 0x1c */
/* int-to-float v3, v3 */
(( android.graphics.Canvas ) p1 ).drawBitmap ( v0, v2, v3, v1 ); // invoke-virtual {p1, v0, v2, v3, v1}, Landroid/graphics/Canvas;->drawBitmap(Landroid/graphics/Bitmap;FFLandroid/graphics/Paint;)V
/* .line 431 */
} // :cond_18
v0 = de.nurogames.android.ticb.base.core.AppResources.imgMultiplierTaskbar;
v3 = de.nurogames.android.ticb.base.core.AppResources.imgMultiplierTaskbar;
v3 = (( android.graphics.Bitmap ) v3 ).getWidth ( ); // invoke-virtual {v3}, Landroid/graphics/Bitmap;->getWidth()I
/* div-int/lit8 v3, v3, 0x2 */
/* sub-int/2addr v2, v3 */
/* iget v3, p0, Lde/nurogames/android/ticb/base/views/ScoresView;->FONT_LARGE:I */
/* sub-int/2addr v2, v3 */
/* int-to-float v2, v2 */
/* iget v3, p0, Lde/nurogames/android/ticb/base/views/ScoresView;->multiplier_bar_y:I */
/* add-int/lit8 v3, v3, 0xd */
/* int-to-float v3, v3 */
(( android.graphics.Canvas ) p1 ).drawBitmap ( v0, v2, v3, v1 ); // invoke-virtual {p1, v0, v2, v3, v1}, Landroid/graphics/Canvas;->drawBitmap(Landroid/graphics/Bitmap;FFLandroid/graphics/Paint;)V
/* .line 432 */
int v7 = 0; // const/4 v7, 0x0
} // :goto_13
/* if-ge v7, v0, :cond_0 */
/* .line 433 */
/* rem-int/lit8 v0, v7, 0x2 */
/* if-nez v0, :cond_19 */
/* .line 434 */
v0 = de.nurogames.android.ticb.base.core.AppResources.imgHoneyDot;
/* aget-object v0, v0, v11 */
v3 = de.nurogames.android.ticb.base.core.AppResources.imgMultiplierTaskbar;
v3 = (( android.graphics.Bitmap ) v3 ).getWidth ( ); // invoke-virtual {v3}, Landroid/graphics/Bitmap;->getWidth()I
/* div-int/lit8 v3, v3, 0x2 */
/* sub-int/2addr v2, v3 */
/* add-int/lit8 v2, v2, -0x15 */
/* mul-int/lit8 v3, v7, 0x13 */
/* add-int/2addr v2, v3 */
/* int-to-float v2, v2 */
/* iget v3, p0, Lde/nurogames/android/ticb/base/views/ScoresView;->multiplier_bar_y:I */
/* add-int/lit8 v3, v3, 0x18 */
/* int-to-float v3, v3 */
(( android.graphics.Canvas ) p1 ).drawBitmap ( v0, v2, v3, v1 ); // invoke-virtual {p1, v0, v2, v3, v1}, Landroid/graphics/Canvas;->drawBitmap(Landroid/graphics/Bitmap;FFLandroid/graphics/Paint;)V
/* .line 432 */
} // :goto_14
/* add-int/lit8 v7, v7, 0x1 */
/* .line 436 */
} // :cond_19
v0 = de.nurogames.android.ticb.base.core.AppResources.imgHoneyDot;
/* aget-object v0, v0, v11 */
v3 = de.nurogames.android.ticb.base.core.AppResources.imgMultiplierTaskbar;
v3 = (( android.graphics.Bitmap ) v3 ).getWidth ( ); // invoke-virtual {v3}, Landroid/graphics/Bitmap;->getWidth()I
/* div-int/lit8 v3, v3, 0x2 */
/* sub-int/2addr v2, v3 */
/* add-int/lit8 v2, v2, -0x15 */
/* mul-int/lit8 v3, v7, 0x13 */
/* add-int/2addr v2, v3 */
/* int-to-float v2, v2 */
/* iget v3, p0, Lde/nurogames/android/ticb/base/views/ScoresView;->multiplier_bar_y:I */
/* add-int/lit8 v3, v3, 0x2d */
/* int-to-float v3, v3 */
(( android.graphics.Canvas ) p1 ).drawBitmap ( v0, v2, v3, v1 ); // invoke-virtual {p1, v0, v2, v3, v1}, Landroid/graphics/Canvas;->drawBitmap(Landroid/graphics/Bitmap;FFLandroid/graphics/Paint;)V
} // .end method
public void setState ( Integer p0 ) {
/* .locals 1 */
/* .param p1, "state" # I */
/* .prologue */
/* .line 627 */
/* iput p1, p0, Lde/nurogames/android/ticb/base/views/ScoresView;->mMode:I */
/* .line 628 */
int v0 = 1; // const/4 v0, 0x1
/* if-ne p1, v0, :cond_0 */
(( de.nurogames.android.ticb.base.views.ScoresView ) p0 ).initView ( ); // invoke-virtual {p0}, Lde/nurogames/android/ticb/base/views/ScoresView;->initView()V
/* .line 629 */
} // :cond_0
(( de.nurogames.android.ticb.base.views.ScoresView ) p0 ).update ( ); // invoke-virtual {p0}, Lde/nurogames/android/ticb/base/views/ScoresView;->update()V
/* .line 630 */
return;
} // .end method
public void update ( ) {
/* .locals 3 */
/* .prologue */
/* .line 449 */
/* iget v0, p0, Lde/nurogames/android/ticb/base/views/ScoresView;->mMode:I */
int v1 = 1; // const/4 v1, 0x1
/* if-ne v0, v1, :cond_0 */
/* .line 452 */
v0 = this.background;
(( de.nurogames.android.ticb.base.objects.objAnimMenuBackground ) v0 ).animate ( ); // invoke-virtual {v0}, Lde/nurogames/android/ticb/base/objects/objAnimMenuBackground;->animate()V
/* .line 455 */
v0 = this.mRedrawHandler;
/* const-wide/16 v1, 0x19 */
(( de.nurogames.android.ticb.base.views.ScoresView$RefreshHandler ) v0 ).sleep ( v1, v2 ); // invoke-virtual {v0, v1, v2}, Lde/nurogames/android/ticb/base/views/ScoresView$RefreshHandler;->sleep(J)V
/* .line 457 */
} // :cond_0
return;
} // .end method
