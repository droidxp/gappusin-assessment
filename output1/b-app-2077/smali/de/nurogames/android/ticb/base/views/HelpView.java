public class de.nurogames.android.ticb.base.views.HelpView extends de.nurogames.android.ticb.base.views.ViewPlus {
	 /* .source "HelpView.java" */
	 /* # annotations */
	 /* .annotation system Ldalvik/annotation/MemberClasses; */
	 /* value = { */
	 /* Lde/nurogames/android/ticb/base/views/HelpView$MyOnTouchListener;, */
	 /* Lde/nurogames/android/ticb/base/views/HelpView$RefreshHandler; */
	 /* } */
} // .end annotation
/* # instance fields */
Integer FONT_LARGE;
Integer FONT_MEDIUM;
private Integer MENU_AIM;
private Integer MENU_CONTROLS;
private Integer MENU_ITEMS;
private de.nurogames.android.ticb.base.objects.objMenuButton back;
private de.nurogames.android.ticb.base.objects.objAnimMenuBackground background;
private java.lang.String help_text_aim;
private java.lang.String help_text_controls;
private java.lang.String help_text_items;
private Integer icon_offset;
private Integer list_font_dif;
private Integer list_spacing;
private Integer list_top;
private list_x;
private Integer mMode;
private android.graphics.Paint mPaint;
private de.nurogames.android.ticb.base.views.HelpView$RefreshHandler mRedrawHandler;
private Integer menu_top;
private de.nurogames.android.ticb.base.objects.objMenuButton menuitems;
private Integer selected_item;
/* # direct methods */
public de.nurogames.android.ticb.base.views.HelpView ( ) {
	 /* .locals 3 */
	 /* .param p1, "context" # Landroid/content/Context; */
	 /* .param p2, "attrs" # Landroid/util/AttributeSet; */
	 /* .prologue */
	 int v2 = 3; // const/4 v2, 0x3
	 int v1 = 0; // const/4 v1, 0x0
	 /* .line 76 */
	 /* invoke-direct {p0, p1}, Lde/nurogames/android/ticb/base/views/ViewPlus;-><init>(Landroid/content/Context;)V */
	 /* .line 28 */
	 /* iput v1, p0, Lde/nurogames/android/ticb/base/views/HelpView;->icon_offset:I */
	 /* .line 31 */
	 /* iput v1, p0, Lde/nurogames/android/ticb/base/views/HelpView;->mMode:I */
	 /* .line 34 */
	 /* new-instance v0, Lde/nurogames/android/ticb/base/views/HelpView$RefreshHandler; */
	 /* invoke-direct {v0, p0}, Lde/nurogames/android/ticb/base/views/HelpView$RefreshHandler;-><init>(Lde/nurogames/android/ticb/base/views/HelpView;)V */
	 this.mRedrawHandler = v0;
	 /* .line 43 */
	 /* new-instance v0, Landroid/graphics/Paint; */
	 /* invoke-direct {v0}, Landroid/graphics/Paint;-><init>()V */
	 this.mPaint = v0;
	 /* .line 46 */
	 /* new-array v0, v2, [I */
	 this.list_x = v0;
	 /* .line 47 */
	 /* iput v1, p0, Lde/nurogames/android/ticb/base/views/HelpView;->list_top:I */
	 /* .line 48 */
	 /* iput v1, p0, Lde/nurogames/android/ticb/base/views/HelpView;->list_spacing:I */
	 /* .line 49 */
	 /* iput v1, p0, Lde/nurogames/android/ticb/base/views/HelpView;->list_font_dif:I */
	 /* .line 52 */
	 /* new-array v0, v2, [Lde/nurogames/android/ticb/base/objects/objMenuButton; */
	 this.menuitems = v0;
	 /* .line 53 */
	 /* const/16 v0, 0x50 */
	 /* iput v0, p0, Lde/nurogames/android/ticb/base/views/HelpView;->menu_top:I */
	 /* .line 54 */
	 /* iput v1, p0, Lde/nurogames/android/ticb/base/views/HelpView;->selected_item:I */
	 /* .line 56 */
	 /* iput v1, p0, Lde/nurogames/android/ticb/base/views/HelpView;->MENU_CONTROLS:I */
	 /* .line 57 */
	 int v0 = 1; // const/4 v0, 0x1
	 /* iput v0, p0, Lde/nurogames/android/ticb/base/views/HelpView;->MENU_ITEMS:I */
	 /* .line 58 */
	 int v0 = 2; // const/4 v0, 0x2
	 /* iput v0, p0, Lde/nurogames/android/ticb/base/views/HelpView;->MENU_AIM:I */
	 /* .line 64 */
	 /* iput v1, p0, Lde/nurogames/android/ticb/base/views/HelpView;->FONT_MEDIUM:I */
	 /* .line 65 */
	 /* iput v1, p0, Lde/nurogames/android/ticb/base/views/HelpView;->FONT_LARGE:I */
	 /* .line 77 */
	 return;
} // .end method
static de.nurogames.android.ticb.base.objects.objMenuButton access$0 ( de.nurogames.android.ticb.base.views.HelpView p0 ) { //synthethic
	 /* .locals 1 */
	 /* .prologue */
	 /* .line 37 */
	 v0 = this.back;
} // .end method
static de.nurogames.android.ticb.base.objects.objMenuButton access$1 ( de.nurogames.android.ticb.base.views.HelpView p0 ) { //synthethic
	 /* .locals 1 */
	 /* .prologue */
	 /* .line 52 */
	 v0 = this.menuitems;
} // .end method
static Integer access$2 ( de.nurogames.android.ticb.base.views.HelpView p0 ) { //synthethic
	 /* .locals 1 */
	 /* .prologue */
	 /* .line 54 */
	 /* iget v0, p0, Lde/nurogames/android/ticb/base/views/HelpView;->selected_item:I */
} // .end method
static void access$3 ( de.nurogames.android.ticb.base.views.HelpView p0, Integer p1 ) { //synthethic
	 /* .locals 0 */
	 /* .prologue */
	 /* .line 54 */
	 /* iput p1, p0, Lde/nurogames/android/ticb/base/views/HelpView;->selected_item:I */
	 return;
} // .end method
/* # virtual methods */
public Integer getState ( ) {
	 /* .locals 1 */
	 /* .prologue */
	 /* .line 403 */
	 /* iget v0, p0, Lde/nurogames/android/ticb/base/views/HelpView;->mMode:I */
} // .end method
public void initView ( ) {
	 /* .locals 12 */
	 /* .prologue */
	 /* const v4, 0x3f4ccccd # 0.8f */
	 int v1 = 0; // const/4 v1, 0x0
	 int v11 = 1; // const/4 v11, 0x1
	 int v2 = 0; // const/4 v2, 0x0
	 /* .line 83 */
	 (( de.nurogames.android.ticb.base.views.HelpView ) p0 ).setFocusable ( v11 ); // invoke-virtual {p0, v11}, Lde/nurogames/android/ticb/base/views/HelpView;->setFocusable(Z)V
	 /* .line 86 */
	 /* new-instance v10, Lde/nurogames/android/ticb/base/views/HelpView$MyOnTouchListener; */
	 /* invoke-direct {v10, p0}, Lde/nurogames/android/ticb/base/views/HelpView$MyOnTouchListener;-><init>(Lde/nurogames/android/ticb/base/views/HelpView;)V */
	 /* .line 87 */
	 /* .local v10, "tlistn":Lde/nurogames/android/ticb/base/views/HelpView$MyOnTouchListener; */
	 (( de.nurogames.android.ticb.base.views.HelpView ) p0 ).setOnTouchListener ( v10 ); // invoke-virtual {p0, v10}, Lde/nurogames/android/ticb/base/views/HelpView;->setOnTouchListener(Landroid/view/View$OnTouchListener;)V
	 /* .line 90 */
	 v0 = this.mPaint;
	 (( android.graphics.Paint ) v0 ).setAntiAlias ( v11 ); // invoke-virtual {v0, v11}, Landroid/graphics/Paint;->setAntiAlias(Z)V
	 /* .line 91 */
	 v0 = de.nurogames.android.ticb.base.tinysanta.cntx;
	 (( android.content.Context ) v0 ).getAssets ( ); // invoke-virtual {v0}, Landroid/content/Context;->getAssets()Landroid/content/res/AssetManager;
	 final String v3 = "font.otf"; // const-string v3, "font.otf"
	 android.graphics.Typeface .createFromAsset ( v0,v3 );
	 /* .line 92 */
	 /* .local v9, "tf":Landroid/graphics/Typeface; */
	 v0 = this.mPaint;
	 (( android.graphics.Paint ) v0 ).setTypeface ( v9 ); // invoke-virtual {v0, v9}, Landroid/graphics/Paint;->setTypeface(Landroid/graphics/Typeface;)Landroid/graphics/Typeface;
	 /* .line 94 */
	 (( de.nurogames.android.ticb.base.views.HelpView ) p0 ).getResources ( ); // invoke-virtual {p0}, Lde/nurogames/android/ticb/base/views/HelpView;->getResources()Landroid/content/res/Resources;
	 (( android.content.res.Resources ) v0 ).getIntArray ( v3 ); // invoke-virtual {v0, v3}, Landroid/content/res/Resources;->getIntArray(I)[I
	 /* aget v0, v0, v3 */
	 /* iput v0, p0, Lde/nurogames/android/ticb/base/views/HelpView;->FONT_MEDIUM:I */
	 /* .line 95 */
	 (( de.nurogames.android.ticb.base.views.HelpView ) p0 ).getResources ( ); // invoke-virtual {p0}, Lde/nurogames/android/ticb/base/views/HelpView;->getResources()Landroid/content/res/Resources;
	 (( android.content.res.Resources ) v0 ).getIntArray ( v3 ); // invoke-virtual {v0, v3}, Landroid/content/res/Resources;->getIntArray(I)[I
	 /* aget v0, v0, v3 */
	 /* iput v0, p0, Lde/nurogames/android/ticb/base/views/HelpView;->FONT_LARGE:I */
	 /* .line 96 */
	 (( de.nurogames.android.ticb.base.views.HelpView ) p0 ).getResources ( ); // invoke-virtual {p0}, Lde/nurogames/android/ticb/base/views/HelpView;->getResources()Landroid/content/res/Resources;
	 (( android.content.res.Resources ) v0 ).getIntArray ( v3 ); // invoke-virtual {v0, v3}, Landroid/content/res/Resources;->getIntArray(I)[I
	 /* aget v0, v0, v3 */
	 /* iput v0, p0, Lde/nurogames/android/ticb/base/views/HelpView;->menu_top:I */
	 /* .line 97 */
	 (( de.nurogames.android.ticb.base.views.HelpView ) p0 ).getResources ( ); // invoke-virtual {p0}, Lde/nurogames/android/ticb/base/views/HelpView;->getResources()Landroid/content/res/Resources;
	 (( android.content.res.Resources ) v0 ).getIntArray ( v3 ); // invoke-virtual {v0, v3}, Landroid/content/res/Resources;->getIntArray(I)[I
	 /* aget v0, v0, v3 */
	 /* iput v0, p0, Lde/nurogames/android/ticb/base/views/HelpView;->list_top:I */
	 /* .line 98 */
	 (( de.nurogames.android.ticb.base.views.HelpView ) p0 ).getResources ( ); // invoke-virtual {p0}, Lde/nurogames/android/ticb/base/views/HelpView;->getResources()Landroid/content/res/Resources;
	 (( android.content.res.Resources ) v0 ).getIntArray ( v3 ); // invoke-virtual {v0, v3}, Landroid/content/res/Resources;->getIntArray(I)[I
	 /* aget v0, v0, v3 */
	 /* iput v0, p0, Lde/nurogames/android/ticb/base/views/HelpView;->list_font_dif:I */
	 /* .line 100 */
	 /* const/high16 v0, 0x41000000 # 8.0f */
	 v3 = de.nurogames.android.ticb.base.tinysanta.sMetrics;
	 /* iget v3, v3, Landroid/util/DisplayMetrics;->density:F */
	 /* mul-float/2addr v0, v3 */
	 /* float-to-int v0, v0 */
	 /* iput v0, p0, Lde/nurogames/android/ticb/base/views/HelpView;->icon_offset:I */
	 /* .line 102 */
	 /* if-ne v0, v3, :cond_0 */
	 /* .line 103 */
	 /* iget v0, p0, Lde/nurogames/android/ticb/base/views/HelpView;->FONT_MEDIUM:I */
	 /* int-to-float v0, v0 */
	 /* mul-float/2addr v0, v4 */
	 /* float-to-int v0, v0 */
	 /* iput v0, p0, Lde/nurogames/android/ticb/base/views/HelpView;->FONT_MEDIUM:I */
	 /* .line 104 */
	 /* iget v0, p0, Lde/nurogames/android/ticb/base/views/HelpView;->FONT_LARGE:I */
	 /* int-to-float v0, v0 */
	 /* mul-float/2addr v0, v4 */
	 /* float-to-int v0, v0 */
	 /* iput v0, p0, Lde/nurogames/android/ticb/base/views/HelpView;->FONT_LARGE:I */
	 /* .line 108 */
} // :cond_0
/* new-instance v0, Lde/nurogames/android/ticb/base/objects/objMenuButton; */
/* .line 110 */
v4 = de.nurogames.android.ticb.base.core.AppResources.imgMenu_back;
/* aget-object v4, v4, v2 */
v4 = (( android.graphics.Bitmap ) v4 ).getHeight ( ); // invoke-virtual {v4}, Landroid/graphics/Bitmap;->getHeight()I
/* sub-int/2addr v3, v4 */
/* .line 111 */
v4 = de.nurogames.android.ticb.base.core.AppResources.imgMenu_back;
/* aget-object v4, v4, v2 */
/* .line 112 */
v5 = de.nurogames.android.ticb.base.core.AppResources.imgMenu_back;
/* aget-object v5, v5, v11 */
/* invoke-direct/range {v0 ..v5}, Lde/nurogames/android/ticb/base/objects/objMenuButton;-><init>(Ljava/lang/String;IILandroid/graphics/Bitmap;Landroid/graphics/Bitmap;)V */
/* .line 108 */
this.back = v0;
/* .line 115 */
/* new-instance v0, Lde/nurogames/android/ticb/base/objects/objAnimMenuBackground; */
/* invoke-direct {v0}, Lde/nurogames/android/ticb/base/objects/objAnimMenuBackground;-><init>()V */
this.background = v0;
/* .line 118 */
v0 = this.menuitems;
/* new-instance v3, Lde/nurogames/android/ticb/base/objects/objMenuButton; */
/* .line 119 */
v5 = de.nurogames.android.ticb.base.core.AppResources.imgBtnControl;
/* aget-object v5, v5, v2 */
v5 = (( android.graphics.Bitmap ) v5 ).getWidth ( ); // invoke-virtual {v5}, Landroid/graphics/Bitmap;->getWidth()I
/* sub-int v5, v4, v5 */
/* .line 120 */
/* iget v4, p0, Lde/nurogames/android/ticb/base/views/HelpView;->menu_top:I */
/* add-int/lit8 v6, v4, -0x10 */
/* .line 121 */
v4 = de.nurogames.android.ticb.base.core.AppResources.imgBtnControl;
/* aget-object v7, v4, v2 */
/* .line 122 */
v4 = de.nurogames.android.ticb.base.core.AppResources.imgBtnControl;
/* aget-object v8, v4, v11 */
/* move-object v4, v1 */
/* invoke-direct/range {v3 ..v8}, Lde/nurogames/android/ticb/base/objects/objMenuButton;-><init>(Ljava/lang/String;IILandroid/graphics/Bitmap;Landroid/graphics/Bitmap;)V */
/* .line 118 */
/* aput-object v3, v0, v2 */
/* .line 123 */
v0 = this.menuitems;
/* aget-object v0, v0, v2 */
(( de.nurogames.android.ticb.base.objects.objMenuButton ) v0 ).isToggled ( v11 ); // invoke-virtual {v0, v11}, Lde/nurogames/android/ticb/base/objects/objMenuButton;->isToggled(Z)V
/* .line 124 */
/* iput v2, p0, Lde/nurogames/android/ticb/base/views/HelpView;->selected_item:I */
/* .line 126 */
v0 = this.menuitems;
/* new-instance v3, Lde/nurogames/android/ticb/base/objects/objMenuButton; */
/* .line 127 */
v5 = de.nurogames.android.ticb.base.core.AppResources.imgBtnItems;
/* aget-object v5, v5, v2 */
v5 = (( android.graphics.Bitmap ) v5 ).getWidth ( ); // invoke-virtual {v5}, Landroid/graphics/Bitmap;->getWidth()I
/* sub-int v5, v4, v5 */
/* .line 128 */
/* iget v4, p0, Lde/nurogames/android/ticb/base/views/HelpView;->menu_top:I */
v6 = de.nurogames.android.ticb.base.core.AppResources.imgSideMenu;
v6 = (( android.graphics.Bitmap ) v6 ).getHeight ( ); // invoke-virtual {v6}, Landroid/graphics/Bitmap;->getHeight()I
/* int-to-float v6, v6 */
/* const v7, 0x3e99999a # 0.3f */
/* mul-float/2addr v6, v7 */
/* float-to-int v6, v6 */
/* add-int/2addr v6, v4 */
/* .line 129 */
v4 = de.nurogames.android.ticb.base.core.AppResources.imgBtnItems;
/* aget-object v7, v4, v2 */
/* .line 130 */
v4 = de.nurogames.android.ticb.base.core.AppResources.imgBtnItems;
/* aget-object v8, v4, v11 */
/* move-object v4, v1 */
/* invoke-direct/range {v3 ..v8}, Lde/nurogames/android/ticb/base/objects/objMenuButton;-><init>(Ljava/lang/String;IILandroid/graphics/Bitmap;Landroid/graphics/Bitmap;)V */
/* .line 126 */
/* aput-object v3, v0, v11 */
/* .line 132 */
v6 = this.menuitems;
int v7 = 2; // const/4 v7, 0x2
/* new-instance v0, Lde/nurogames/android/ticb/base/objects/objMenuButton; */
/* .line 133 */
v4 = de.nurogames.android.ticb.base.core.AppResources.imgBtnAim;
/* aget-object v4, v4, v2 */
v4 = (( android.graphics.Bitmap ) v4 ).getWidth ( ); // invoke-virtual {v4}, Landroid/graphics/Bitmap;->getWidth()I
/* sub-int v8, v3, v4 */
/* .line 134 */
/* iget v3, p0, Lde/nurogames/android/ticb/base/views/HelpView;->menu_top:I */
v4 = de.nurogames.android.ticb.base.core.AppResources.imgSideMenu;
v4 = (( android.graphics.Bitmap ) v4 ).getHeight ( ); // invoke-virtual {v4}, Landroid/graphics/Bitmap;->getHeight()I
/* int-to-float v4, v4 */
/* const v5, 0x3f19999a # 0.6f */
/* mul-float/2addr v4, v5 */
/* float-to-int v4, v4 */
/* add-int/2addr v3, v4 */
/* .line 135 */
v4 = de.nurogames.android.ticb.base.core.AppResources.imgBtnAim;
/* aget-object v4, v4, v2 */
/* .line 136 */
v2 = de.nurogames.android.ticb.base.core.AppResources.imgBtnAim;
/* aget-object v5, v2, v11 */
/* move v2, v8 */
/* invoke-direct/range {v0 ..v5}, Lde/nurogames/android/ticb/base/objects/objMenuButton;-><init>(Ljava/lang/String;IILandroid/graphics/Bitmap;Landroid/graphics/Bitmap;)V */
/* .line 132 */
/* aput-object v0, v6, v7 */
/* .line 138 */
/* if-ne v0, v1, :cond_1 */
/* .line 139 */
(( de.nurogames.android.ticb.base.views.HelpView ) p0 ).getResources ( ); // invoke-virtual {p0}, Lde/nurogames/android/ticb/base/views/HelpView;->getResources()Landroid/content/res/Resources;
(( android.content.res.Resources ) v0 ).getStringArray ( v1 ); // invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getStringArray(I)[Ljava/lang/String;
this.help_text_controls = v0;
/* .line 140 */
(( de.nurogames.android.ticb.base.views.HelpView ) p0 ).getResources ( ); // invoke-virtual {p0}, Lde/nurogames/android/ticb/base/views/HelpView;->getResources()Landroid/content/res/Resources;
(( android.content.res.Resources ) v0 ).getStringArray ( v1 ); // invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getStringArray(I)[Ljava/lang/String;
this.help_text_items = v0;
/* .line 141 */
(( de.nurogames.android.ticb.base.views.HelpView ) p0 ).getResources ( ); // invoke-virtual {p0}, Lde/nurogames/android/ticb/base/views/HelpView;->getResources()Landroid/content/res/Resources;
(( android.content.res.Resources ) v0 ).getStringArray ( v1 ); // invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getStringArray(I)[Ljava/lang/String;
this.help_text_aim = v0;
/* .line 160 */
} // :goto_0
return;
/* .line 142 */
} // :cond_1
/* if-ne v0, v1, :cond_2 */
/* .line 143 */
(( de.nurogames.android.ticb.base.views.HelpView ) p0 ).getResources ( ); // invoke-virtual {p0}, Lde/nurogames/android/ticb/base/views/HelpView;->getResources()Landroid/content/res/Resources;
(( android.content.res.Resources ) v0 ).getStringArray ( v1 ); // invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getStringArray(I)[Ljava/lang/String;
this.help_text_controls = v0;
/* .line 144 */
(( de.nurogames.android.ticb.base.views.HelpView ) p0 ).getResources ( ); // invoke-virtual {p0}, Lde/nurogames/android/ticb/base/views/HelpView;->getResources()Landroid/content/res/Resources;
(( android.content.res.Resources ) v0 ).getStringArray ( v1 ); // invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getStringArray(I)[Ljava/lang/String;
this.help_text_items = v0;
/* .line 145 */
(( de.nurogames.android.ticb.base.views.HelpView ) p0 ).getResources ( ); // invoke-virtual {p0}, Lde/nurogames/android/ticb/base/views/HelpView;->getResources()Landroid/content/res/Resources;
(( android.content.res.Resources ) v0 ).getStringArray ( v1 ); // invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getStringArray(I)[Ljava/lang/String;
this.help_text_aim = v0;
/* .line 146 */
} // :cond_2
/* if-ne v0, v1, :cond_3 */
/* .line 147 */
(( de.nurogames.android.ticb.base.views.HelpView ) p0 ).getResources ( ); // invoke-virtual {p0}, Lde/nurogames/android/ticb/base/views/HelpView;->getResources()Landroid/content/res/Resources;
(( android.content.res.Resources ) v0 ).getStringArray ( v1 ); // invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getStringArray(I)[Ljava/lang/String;
this.help_text_controls = v0;
/* .line 148 */
(( de.nurogames.android.ticb.base.views.HelpView ) p0 ).getResources ( ); // invoke-virtual {p0}, Lde/nurogames/android/ticb/base/views/HelpView;->getResources()Landroid/content/res/Resources;
(( android.content.res.Resources ) v0 ).getStringArray ( v1 ); // invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getStringArray(I)[Ljava/lang/String;
this.help_text_items = v0;
/* .line 149 */
(( de.nurogames.android.ticb.base.views.HelpView ) p0 ).getResources ( ); // invoke-virtual {p0}, Lde/nurogames/android/ticb/base/views/HelpView;->getResources()Landroid/content/res/Resources;
(( android.content.res.Resources ) v0 ).getStringArray ( v1 ); // invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getStringArray(I)[Ljava/lang/String;
this.help_text_aim = v0;
/* .line 150 */
} // :cond_3
/* if-ne v0, v1, :cond_4 */
/* .line 151 */
(( de.nurogames.android.ticb.base.views.HelpView ) p0 ).getResources ( ); // invoke-virtual {p0}, Lde/nurogames/android/ticb/base/views/HelpView;->getResources()Landroid/content/res/Resources;
(( android.content.res.Resources ) v0 ).getStringArray ( v1 ); // invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getStringArray(I)[Ljava/lang/String;
this.help_text_controls = v0;
/* .line 152 */
(( de.nurogames.android.ticb.base.views.HelpView ) p0 ).getResources ( ); // invoke-virtual {p0}, Lde/nurogames/android/ticb/base/views/HelpView;->getResources()Landroid/content/res/Resources;
(( android.content.res.Resources ) v0 ).getStringArray ( v1 ); // invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getStringArray(I)[Ljava/lang/String;
this.help_text_items = v0;
/* .line 153 */
(( de.nurogames.android.ticb.base.views.HelpView ) p0 ).getResources ( ); // invoke-virtual {p0}, Lde/nurogames/android/ticb/base/views/HelpView;->getResources()Landroid/content/res/Resources;
(( android.content.res.Resources ) v0 ).getStringArray ( v1 ); // invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getStringArray(I)[Ljava/lang/String;
this.help_text_aim = v0;
/* goto/16 :goto_0 */
/* .line 155 */
} // :cond_4
(( de.nurogames.android.ticb.base.views.HelpView ) p0 ).getResources ( ); // invoke-virtual {p0}, Lde/nurogames/android/ticb/base/views/HelpView;->getResources()Landroid/content/res/Resources;
(( android.content.res.Resources ) v0 ).getStringArray ( v1 ); // invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getStringArray(I)[Ljava/lang/String;
this.help_text_controls = v0;
/* .line 156 */
(( de.nurogames.android.ticb.base.views.HelpView ) p0 ).getResources ( ); // invoke-virtual {p0}, Lde/nurogames/android/ticb/base/views/HelpView;->getResources()Landroid/content/res/Resources;
(( android.content.res.Resources ) v0 ).getStringArray ( v1 ); // invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getStringArray(I)[Ljava/lang/String;
this.help_text_items = v0;
/* .line 157 */
(( de.nurogames.android.ticb.base.views.HelpView ) p0 ).getResources ( ); // invoke-virtual {p0}, Lde/nurogames/android/ticb/base/views/HelpView;->getResources()Landroid/content/res/Resources;
(( android.content.res.Resources ) v0 ).getStringArray ( v1 ); // invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getStringArray(I)[Ljava/lang/String;
this.help_text_aim = v0;
/* goto/16 :goto_0 */
} // .end method
public void onDraw ( android.graphics.Canvas p0 ) {
/* .locals 10 */
/* .param p1, "g" # Landroid/graphics/Canvas; */
/* .prologue */
int v9 = 3; // const/4 v9, 0x3
int v8 = 0; // const/4 v8, 0x0
int v7 = 2; // const/4 v7, 0x2
int v6 = 1; // const/4 v6, 0x1
int v5 = 0; // const/4 v5, 0x0
/* .line 170 */
v1 = this.background;
(( de.nurogames.android.ticb.base.objects.objAnimMenuBackground ) v1 ).onDraw ( p1 ); // invoke-virtual {v1, p1}, Lde/nurogames/android/ticb/base/objects/objAnimMenuBackground;->onDraw(Landroid/graphics/Canvas;)V
/* .line 173 */
v1 = this.back;
(( de.nurogames.android.ticb.base.objects.objMenuButton ) v1 ).onDraw ( p1 ); // invoke-virtual {v1, p1}, Lde/nurogames/android/ticb/base/objects/objMenuButton;->onDraw(Landroid/graphics/Canvas;)V
/* .line 176 */
v1 = de.nurogames.android.ticb.base.core.AppResources.imgSideMenu;
v3 = de.nurogames.android.ticb.base.core.AppResources.imgSideMenu;
v3 = (( android.graphics.Bitmap ) v3 ).getWidth ( ); // invoke-virtual {v3}, Landroid/graphics/Bitmap;->getWidth()I
/* sub-int/2addr v2, v3 */
/* int-to-float v2, v2 */
/* iget v3, p0, Lde/nurogames/android/ticb/base/views/HelpView;->menu_top:I */
/* int-to-float v3, v3 */
(( android.graphics.Canvas ) p1 ).drawBitmap ( v1, v2, v3, v8 ); // invoke-virtual {p1, v1, v2, v3, v8}, Landroid/graphics/Canvas;->drawBitmap(Landroid/graphics/Bitmap;FFLandroid/graphics/Paint;)V
/* .line 177 */
int v0 = 0; // const/4 v0, 0x0
/* .local v0, "x":I */
} // :goto_0
v1 = this.menuitems;
/* array-length v1, v1 */
/* if-lt v0, v1, :cond_1 */
/* .line 182 */
/* iget v1, p0, Lde/nurogames/android/ticb/base/views/HelpView;->selected_item:I */
/* iget v2, p0, Lde/nurogames/android/ticb/base/views/HelpView;->MENU_CONTROLS:I */
/* if-ne v1, v2, :cond_3 */
/* .line 184 */
(( de.nurogames.android.ticb.base.views.HelpView ) p0 ).getResources ( ); // invoke-virtual {p0}, Lde/nurogames/android/ticb/base/views/HelpView;->getResources()Landroid/content/res/Resources;
(( android.content.res.Resources ) v1 ).getIntArray ( v2 ); // invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getIntArray(I)[I
/* aget v1, v1, v2 */
/* iput v1, p0, Lde/nurogames/android/ticb/base/views/HelpView;->list_spacing:I */
/* .line 186 */
/* new-array v1, v9, [I */
/* .line 187 */
(( de.nurogames.android.ticb.base.views.HelpView ) p0 ).getResources ( ); // invoke-virtual {p0}, Lde/nurogames/android/ticb/base/views/HelpView;->getResources()Landroid/content/res/Resources;
(( android.content.res.Resources ) v2 ).getIntArray ( v3 ); // invoke-virtual {v2, v3}, Landroid/content/res/Resources;->getIntArray(I)[I
/* aget v2, v2, v3 */
/* aput v2, v1, v5 */
/* .line 188 */
(( de.nurogames.android.ticb.base.views.HelpView ) p0 ).getResources ( ); // invoke-virtual {p0}, Lde/nurogames/android/ticb/base/views/HelpView;->getResources()Landroid/content/res/Resources;
(( android.content.res.Resources ) v2 ).getIntArray ( v3 ); // invoke-virtual {v2, v3}, Landroid/content/res/Resources;->getIntArray(I)[I
/* aget v2, v2, v3 */
/* aput v2, v1, v6 */
/* .line 189 */
(( de.nurogames.android.ticb.base.views.HelpView ) p0 ).getResources ( ); // invoke-virtual {p0}, Lde/nurogames/android/ticb/base/views/HelpView;->getResources()Landroid/content/res/Resources;
(( android.content.res.Resources ) v2 ).getIntArray ( v3 ); // invoke-virtual {v2, v3}, Landroid/content/res/Resources;->getIntArray(I)[I
/* aget v2, v2, v3 */
/* aput v2, v1, v7 */
/* .line 186 */
this.list_x = v1;
/* .line 193 */
v1 = this.mPaint;
/* iget v2, p0, Lde/nurogames/android/ticb/base/views/HelpView;->FONT_LARGE:I */
/* int-to-float v2, v2 */
(( android.graphics.Paint ) v1 ).setTextSize ( v2 ); // invoke-virtual {v1, v2}, Landroid/graphics/Paint;->setTextSize(F)V
/* .line 194 */
v1 = this.mPaint;
int v2 = -1; // const/4 v2, -0x1
(( android.graphics.Paint ) v1 ).setColor ( v2 ); // invoke-virtual {v1, v2}, Landroid/graphics/Paint;->setColor(I)V
/* .line 195 */
v1 = this.help_text_controls;
/* aget-object v1, v1, v5 */
v2 = this.list_x;
/* aget v2, v2, v5 */
/* int-to-float v2, v2 */
/* iget v3, p0, Lde/nurogames/android/ticb/base/views/HelpView;->list_top:I */
/* iget v4, p0, Lde/nurogames/android/ticb/base/views/HelpView;->FONT_LARGE:I */
/* sub-int/2addr v3, v4 */
/* int-to-float v3, v3 */
v4 = this.mPaint;
(( android.graphics.Canvas ) p1 ).drawText ( v1, v2, v3, v4 ); // invoke-virtual {p1, v1, v2, v3, v4}, Landroid/graphics/Canvas;->drawText(Ljava/lang/String;FFLandroid/graphics/Paint;)V
/* .line 198 */
v1 = this.mPaint;
/* iget v2, p0, Lde/nurogames/android/ticb/base/views/HelpView;->FONT_MEDIUM:I */
/* int-to-float v2, v2 */
(( android.graphics.Paint ) v1 ).setTextSize ( v2 ); // invoke-virtual {v1, v2}, Landroid/graphics/Paint;->setTextSize(F)V
/* .line 199 */
v1 = this.mPaint;
/* const/16 v2, 0x6e */
/* const/16 v3, 0x46 */
v2 = android.graphics.Color .rgb ( v2,v3,v5 );
(( android.graphics.Paint ) v1 ).setColor ( v2 ); // invoke-virtual {v1, v2}, Landroid/graphics/Paint;->setColor(I)V
/* .line 200 */
int v0 = 0; // const/4 v0, 0x0
} // :goto_1
v1 = this.help_text_controls;
/* array-length v1, v1 */
/* add-int/lit8 v1, v1, -0x1 */
/* if-lt v0, v1, :cond_2 */
/* .line 203 */
v1 = de.nurogames.android.ticb.base.core.AppResources.imgHelpControls;
/* int-to-float v2, v2 */
/* const v3, 0x3ecccccd # 0.4f */
/* mul-float/2addr v2, v3 */
v4 = de.nurogames.android.ticb.base.core.AppResources.imgHelpControls;
v4 = (( android.graphics.Bitmap ) v4 ).getHeight ( ); // invoke-virtual {v4}, Landroid/graphics/Bitmap;->getHeight()I
/* sub-int/2addr v3, v4 */
/* int-to-float v3, v3 */
(( android.graphics.Canvas ) p1 ).drawBitmap ( v1, v2, v3, v8 ); // invoke-virtual {p1, v1, v2, v3, v8}, Landroid/graphics/Canvas;->drawBitmap(Landroid/graphics/Bitmap;FFLandroid/graphics/Paint;)V
/* .line 273 */
} // :cond_0
} // :goto_2
return;
/* .line 178 */
} // :cond_1
v1 = this.menuitems;
/* aget-object v1, v1, v0 */
(( de.nurogames.android.ticb.base.objects.objMenuButton ) v1 ).onDraw ( p1 ); // invoke-virtual {v1, p1}, Lde/nurogames/android/ticb/base/objects/objMenuButton;->onDraw(Landroid/graphics/Canvas;)V
/* .line 177 */
/* add-int/lit8 v0, v0, 0x1 */
/* goto/16 :goto_0 */
/* .line 201 */
} // :cond_2
v1 = this.help_text_controls;
/* add-int/lit8 v2, v0, 0x1 */
/* aget-object v1, v1, v2 */
v2 = this.list_x;
/* aget v2, v2, v5 */
/* int-to-float v2, v2 */
/* iget v3, p0, Lde/nurogames/android/ticb/base/views/HelpView;->list_top:I */
/* iget v4, p0, Lde/nurogames/android/ticb/base/views/HelpView;->list_font_dif:I */
/* add-int/2addr v3, v4 */
/* iget v4, p0, Lde/nurogames/android/ticb/base/views/HelpView;->list_spacing:I */
/* mul-int/2addr v4, v0 */
/* add-int/2addr v3, v4 */
/* int-to-float v3, v3 */
v4 = this.mPaint;
(( android.graphics.Canvas ) p1 ).drawText ( v1, v2, v3, v4 ); // invoke-virtual {p1, v1, v2, v3, v4}, Landroid/graphics/Canvas;->drawText(Ljava/lang/String;FFLandroid/graphics/Paint;)V
/* .line 200 */
/* add-int/lit8 v0, v0, 0x1 */
/* .line 207 */
} // :cond_3
/* iget v1, p0, Lde/nurogames/android/ticb/base/views/HelpView;->selected_item:I */
/* iget v2, p0, Lde/nurogames/android/ticb/base/views/HelpView;->MENU_ITEMS:I */
/* if-ne v1, v2, :cond_4 */
/* .line 209 */
(( de.nurogames.android.ticb.base.views.HelpView ) p0 ).getResources ( ); // invoke-virtual {p0}, Lde/nurogames/android/ticb/base/views/HelpView;->getResources()Landroid/content/res/Resources;
(( android.content.res.Resources ) v1 ).getIntArray ( v2 ); // invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getIntArray(I)[I
/* aget v1, v1, v2 */
/* iput v1, p0, Lde/nurogames/android/ticb/base/views/HelpView;->list_spacing:I */
/* .line 211 */
/* new-array v1, v9, [I */
/* .line 212 */
(( de.nurogames.android.ticb.base.views.HelpView ) p0 ).getResources ( ); // invoke-virtual {p0}, Lde/nurogames/android/ticb/base/views/HelpView;->getResources()Landroid/content/res/Resources;
(( android.content.res.Resources ) v2 ).getIntArray ( v3 ); // invoke-virtual {v2, v3}, Landroid/content/res/Resources;->getIntArray(I)[I
/* aget v2, v2, v3 */
/* aput v2, v1, v5 */
/* .line 213 */
(( de.nurogames.android.ticb.base.views.HelpView ) p0 ).getResources ( ); // invoke-virtual {p0}, Lde/nurogames/android/ticb/base/views/HelpView;->getResources()Landroid/content/res/Resources;
(( android.content.res.Resources ) v2 ).getIntArray ( v3 ); // invoke-virtual {v2, v3}, Landroid/content/res/Resources;->getIntArray(I)[I
/* aget v2, v2, v3 */
/* aput v2, v1, v6 */
/* .line 214 */
(( de.nurogames.android.ticb.base.views.HelpView ) p0 ).getResources ( ); // invoke-virtual {p0}, Lde/nurogames/android/ticb/base/views/HelpView;->getResources()Landroid/content/res/Resources;
(( android.content.res.Resources ) v2 ).getIntArray ( v3 ); // invoke-virtual {v2, v3}, Landroid/content/res/Resources;->getIntArray(I)[I
/* aget v2, v2, v3 */
/* aput v2, v1, v7 */
/* .line 211 */
this.list_x = v1;
/* .line 218 */
v1 = this.mPaint;
/* iget v2, p0, Lde/nurogames/android/ticb/base/views/HelpView;->FONT_LARGE:I */
/* int-to-float v2, v2 */
(( android.graphics.Paint ) v1 ).setTextSize ( v2 ); // invoke-virtual {v1, v2}, Landroid/graphics/Paint;->setTextSize(F)V
/* .line 219 */
v1 = this.mPaint;
int v2 = -1; // const/4 v2, -0x1
(( android.graphics.Paint ) v1 ).setColor ( v2 ); // invoke-virtual {v1, v2}, Landroid/graphics/Paint;->setColor(I)V
/* .line 220 */
v1 = this.help_text_items;
/* aget-object v1, v1, v5 */
v2 = this.list_x;
/* aget v2, v2, v5 */
/* int-to-float v2, v2 */
/* iget v3, p0, Lde/nurogames/android/ticb/base/views/HelpView;->list_top:I */
/* iget v4, p0, Lde/nurogames/android/ticb/base/views/HelpView;->FONT_LARGE:I */
/* sub-int/2addr v3, v4 */
/* int-to-float v3, v3 */
v4 = this.mPaint;
(( android.graphics.Canvas ) p1 ).drawText ( v1, v2, v3, v4 ); // invoke-virtual {p1, v1, v2, v3, v4}, Landroid/graphics/Canvas;->drawText(Ljava/lang/String;FFLandroid/graphics/Paint;)V
/* .line 223 */
v1 = de.nurogames.android.ticb.base.core.AppResources.imgHoneyDot;
/* aget-object v1, v1, v5 */
v2 = this.list_x;
/* aget v2, v2, v6 */
/* iget v3, p0, Lde/nurogames/android/ticb/base/views/HelpView;->icon_offset:I */
/* sub-int/2addr v2, v3 */
v3 = de.nurogames.android.ticb.base.core.AppResources.imgHoneyDot;
/* aget-object v3, v3, v5 */
v3 = (( android.graphics.Bitmap ) v3 ).getWidth ( ); // invoke-virtual {v3}, Landroid/graphics/Bitmap;->getWidth()I
/* sub-int/2addr v2, v3 */
/* int-to-float v2, v2 */
/* iget v3, p0, Lde/nurogames/android/ticb/base/views/HelpView;->list_top:I */
/* int-to-float v3, v3 */
(( android.graphics.Canvas ) p1 ).drawBitmap ( v1, v2, v3, v8 ); // invoke-virtual {p1, v1, v2, v3, v8}, Landroid/graphics/Canvas;->drawBitmap(Landroid/graphics/Bitmap;FFLandroid/graphics/Paint;)V
/* .line 224 */
v1 = de.nurogames.android.ticb.base.core.AppResources.imgStatIcons;
/* aget-object v1, v1, v7 */
v2 = this.list_x;
/* aget v2, v2, v6 */
/* iget v3, p0, Lde/nurogames/android/ticb/base/views/HelpView;->icon_offset:I */
/* sub-int/2addr v2, v3 */
v3 = de.nurogames.android.ticb.base.core.AppResources.imgStatIcons;
/* aget-object v3, v3, v7 */
v3 = (( android.graphics.Bitmap ) v3 ).getWidth ( ); // invoke-virtual {v3}, Landroid/graphics/Bitmap;->getWidth()I
/* sub-int/2addr v2, v3 */
/* int-to-float v2, v2 */
/* iget v3, p0, Lde/nurogames/android/ticb/base/views/HelpView;->list_top:I */
/* iget v4, p0, Lde/nurogames/android/ticb/base/views/HelpView;->list_spacing:I */
/* mul-int/lit8 v4, v4, 0x1 */
/* add-int/2addr v3, v4 */
/* int-to-float v3, v3 */
(( android.graphics.Canvas ) p1 ).drawBitmap ( v1, v2, v3, v8 ); // invoke-virtual {p1, v1, v2, v3, v8}, Landroid/graphics/Canvas;->drawBitmap(Landroid/graphics/Bitmap;FFLandroid/graphics/Paint;)V
/* .line 225 */
v1 = de.nurogames.android.ticb.base.core.AppResources.imgStatIcons;
/* aget-object v1, v1, v9 */
v2 = this.list_x;
/* aget v2, v2, v6 */
/* iget v3, p0, Lde/nurogames/android/ticb/base/views/HelpView;->icon_offset:I */
/* sub-int/2addr v2, v3 */
v3 = de.nurogames.android.ticb.base.core.AppResources.imgStatIcons;
/* aget-object v3, v3, v9 */
v3 = (( android.graphics.Bitmap ) v3 ).getWidth ( ); // invoke-virtual {v3}, Landroid/graphics/Bitmap;->getWidth()I
/* sub-int/2addr v2, v3 */
/* int-to-float v2, v2 */
/* iget v3, p0, Lde/nurogames/android/ticb/base/views/HelpView;->list_top:I */
/* iget v4, p0, Lde/nurogames/android/ticb/base/views/HelpView;->list_spacing:I */
/* mul-int/lit8 v4, v4, 0x2 */
/* add-int/2addr v3, v4 */
/* int-to-float v3, v3 */
(( android.graphics.Canvas ) p1 ).drawBitmap ( v1, v2, v3, v8 ); // invoke-virtual {p1, v1, v2, v3, v8}, Landroid/graphics/Canvas;->drawBitmap(Landroid/graphics/Bitmap;FFLandroid/graphics/Paint;)V
/* .line 226 */
v1 = de.nurogames.android.ticb.base.core.AppResources.imgStatIcons;
int v2 = 4; // const/4 v2, 0x4
/* aget-object v1, v1, v2 */
v2 = this.list_x;
/* aget v2, v2, v6 */
/* iget v3, p0, Lde/nurogames/android/ticb/base/views/HelpView;->icon_offset:I */
/* sub-int/2addr v2, v3 */
v3 = de.nurogames.android.ticb.base.core.AppResources.imgStatIcons;
int v4 = 4; // const/4 v4, 0x4
/* aget-object v3, v3, v4 */
v3 = (( android.graphics.Bitmap ) v3 ).getWidth ( ); // invoke-virtual {v3}, Landroid/graphics/Bitmap;->getWidth()I
/* sub-int/2addr v2, v3 */
/* int-to-float v2, v2 */
/* iget v3, p0, Lde/nurogames/android/ticb/base/views/HelpView;->list_top:I */
/* iget v4, p0, Lde/nurogames/android/ticb/base/views/HelpView;->list_spacing:I */
/* mul-int/lit8 v4, v4, 0x3 */
/* add-int/2addr v3, v4 */
/* int-to-float v3, v3 */
(( android.graphics.Canvas ) p1 ).drawBitmap ( v1, v2, v3, v8 ); // invoke-virtual {p1, v1, v2, v3, v8}, Landroid/graphics/Canvas;->drawBitmap(Landroid/graphics/Bitmap;FFLandroid/graphics/Paint;)V
/* .line 227 */
v1 = de.nurogames.android.ticb.base.core.AppResources.imgStatIcons;
int v2 = 5; // const/4 v2, 0x5
/* aget-object v1, v1, v2 */
v2 = this.list_x;
/* aget v2, v2, v6 */
/* iget v3, p0, Lde/nurogames/android/ticb/base/views/HelpView;->icon_offset:I */
/* sub-int/2addr v2, v3 */
v3 = de.nurogames.android.ticb.base.core.AppResources.imgStatIcons;
int v4 = 5; // const/4 v4, 0x5
/* aget-object v3, v3, v4 */
v3 = (( android.graphics.Bitmap ) v3 ).getWidth ( ); // invoke-virtual {v3}, Landroid/graphics/Bitmap;->getWidth()I
/* sub-int/2addr v2, v3 */
/* int-to-float v2, v2 */
/* iget v3, p0, Lde/nurogames/android/ticb/base/views/HelpView;->list_top:I */
/* iget v4, p0, Lde/nurogames/android/ticb/base/views/HelpView;->list_spacing:I */
/* mul-int/lit8 v4, v4, 0x4 */
/* add-int/2addr v3, v4 */
/* int-to-float v3, v3 */
(( android.graphics.Canvas ) p1 ).drawBitmap ( v1, v2, v3, v8 ); // invoke-virtual {p1, v1, v2, v3, v8}, Landroid/graphics/Canvas;->drawBitmap(Landroid/graphics/Bitmap;FFLandroid/graphics/Paint;)V
/* .line 230 */
v1 = this.mPaint;
/* iget v2, p0, Lde/nurogames/android/ticb/base/views/HelpView;->FONT_MEDIUM:I */
/* int-to-float v2, v2 */
(( android.graphics.Paint ) v1 ).setTextSize ( v2 ); // invoke-virtual {v1, v2}, Landroid/graphics/Paint;->setTextSize(F)V
/* .line 231 */
v1 = this.mPaint;
/* const/16 v2, 0x6e */
/* const/16 v3, 0x46 */
v2 = android.graphics.Color .rgb ( v2,v3,v5 );
(( android.graphics.Paint ) v1 ).setColor ( v2 ); // invoke-virtual {v1, v2}, Landroid/graphics/Paint;->setColor(I)V
/* .line 232 */
v1 = this.help_text_items;
/* aget-object v1, v1, v6 */
v2 = this.list_x;
/* aget v2, v2, v6 */
/* int-to-float v2, v2 */
/* iget v3, p0, Lde/nurogames/android/ticb/base/views/HelpView;->list_top:I */
/* iget v4, p0, Lde/nurogames/android/ticb/base/views/HelpView;->list_font_dif:I */
/* add-int/2addr v3, v4 */
/* int-to-float v3, v3 */
v4 = this.mPaint;
(( android.graphics.Canvas ) p1 ).drawText ( v1, v2, v3, v4 ); // invoke-virtual {p1, v1, v2, v3, v4}, Landroid/graphics/Canvas;->drawText(Ljava/lang/String;FFLandroid/graphics/Paint;)V
/* .line 233 */
v1 = this.help_text_items;
/* aget-object v1, v1, v9 */
v2 = this.list_x;
/* aget v2, v2, v6 */
/* int-to-float v2, v2 */
/* iget v3, p0, Lde/nurogames/android/ticb/base/views/HelpView;->list_top:I */
/* iget v4, p0, Lde/nurogames/android/ticb/base/views/HelpView;->list_font_dif:I */
/* add-int/2addr v3, v4 */
/* iget v4, p0, Lde/nurogames/android/ticb/base/views/HelpView;->list_spacing:I */
/* mul-int/lit8 v4, v4, 0x1 */
/* add-int/2addr v3, v4 */
/* int-to-float v3, v3 */
v4 = this.mPaint;
(( android.graphics.Canvas ) p1 ).drawText ( v1, v2, v3, v4 ); // invoke-virtual {p1, v1, v2, v3, v4}, Landroid/graphics/Canvas;->drawText(Ljava/lang/String;FFLandroid/graphics/Paint;)V
/* .line 234 */
v1 = this.help_text_items;
int v2 = 5; // const/4 v2, 0x5
/* aget-object v1, v1, v2 */
v2 = this.list_x;
/* aget v2, v2, v6 */
/* int-to-float v2, v2 */
/* iget v3, p0, Lde/nurogames/android/ticb/base/views/HelpView;->list_top:I */
/* iget v4, p0, Lde/nurogames/android/ticb/base/views/HelpView;->list_font_dif:I */
/* add-int/2addr v3, v4 */
/* iget v4, p0, Lde/nurogames/android/ticb/base/views/HelpView;->list_spacing:I */
/* mul-int/lit8 v4, v4, 0x2 */
/* add-int/2addr v3, v4 */
/* int-to-float v3, v3 */
v4 = this.mPaint;
(( android.graphics.Canvas ) p1 ).drawText ( v1, v2, v3, v4 ); // invoke-virtual {p1, v1, v2, v3, v4}, Landroid/graphics/Canvas;->drawText(Ljava/lang/String;FFLandroid/graphics/Paint;)V
/* .line 235 */
v1 = this.help_text_items;
int v2 = 7; // const/4 v2, 0x7
/* aget-object v1, v1, v2 */
v2 = this.list_x;
/* aget v2, v2, v6 */
/* int-to-float v2, v2 */
/* iget v3, p0, Lde/nurogames/android/ticb/base/views/HelpView;->list_top:I */
/* iget v4, p0, Lde/nurogames/android/ticb/base/views/HelpView;->list_font_dif:I */
/* add-int/2addr v3, v4 */
/* iget v4, p0, Lde/nurogames/android/ticb/base/views/HelpView;->list_spacing:I */
/* mul-int/lit8 v4, v4, 0x3 */
/* add-int/2addr v3, v4 */
/* int-to-float v3, v3 */
v4 = this.mPaint;
(( android.graphics.Canvas ) p1 ).drawText ( v1, v2, v3, v4 ); // invoke-virtual {p1, v1, v2, v3, v4}, Landroid/graphics/Canvas;->drawText(Ljava/lang/String;FFLandroid/graphics/Paint;)V
/* .line 236 */
v1 = this.help_text_items;
/* const/16 v2, 0x9 */
/* aget-object v1, v1, v2 */
v2 = this.list_x;
/* aget v2, v2, v6 */
/* int-to-float v2, v2 */
/* iget v3, p0, Lde/nurogames/android/ticb/base/views/HelpView;->list_top:I */
/* iget v4, p0, Lde/nurogames/android/ticb/base/views/HelpView;->list_font_dif:I */
/* add-int/2addr v3, v4 */
/* iget v4, p0, Lde/nurogames/android/ticb/base/views/HelpView;->list_spacing:I */
/* mul-int/lit8 v4, v4, 0x4 */
/* add-int/2addr v3, v4 */
/* int-to-float v3, v3 */
v4 = this.mPaint;
(( android.graphics.Canvas ) p1 ).drawText ( v1, v2, v3, v4 ); // invoke-virtual {p1, v1, v2, v3, v4}, Landroid/graphics/Canvas;->drawText(Ljava/lang/String;FFLandroid/graphics/Paint;)V
/* .line 239 */
v1 = this.mPaint;
int v2 = -1; // const/4 v2, -0x1
(( android.graphics.Paint ) v1 ).setColor ( v2 ); // invoke-virtual {v1, v2}, Landroid/graphics/Paint;->setColor(I)V
/* .line 240 */
v1 = this.help_text_items;
/* aget-object v1, v1, v7 */
v2 = this.list_x;
/* aget v2, v2, v7 */
/* int-to-float v2, v2 */
/* iget v3, p0, Lde/nurogames/android/ticb/base/views/HelpView;->list_top:I */
/* iget v4, p0, Lde/nurogames/android/ticb/base/views/HelpView;->list_font_dif:I */
/* add-int/2addr v3, v4 */
/* int-to-float v3, v3 */
v4 = this.mPaint;
(( android.graphics.Canvas ) p1 ).drawText ( v1, v2, v3, v4 ); // invoke-virtual {p1, v1, v2, v3, v4}, Landroid/graphics/Canvas;->drawText(Ljava/lang/String;FFLandroid/graphics/Paint;)V
/* .line 241 */
v1 = this.help_text_items;
int v2 = 4; // const/4 v2, 0x4
/* aget-object v1, v1, v2 */
v2 = this.list_x;
/* aget v2, v2, v7 */
/* int-to-float v2, v2 */
/* iget v3, p0, Lde/nurogames/android/ticb/base/views/HelpView;->list_top:I */
/* iget v4, p0, Lde/nurogames/android/ticb/base/views/HelpView;->list_font_dif:I */
/* add-int/2addr v3, v4 */
/* iget v4, p0, Lde/nurogames/android/ticb/base/views/HelpView;->list_spacing:I */
/* mul-int/lit8 v4, v4, 0x1 */
/* add-int/2addr v3, v4 */
/* int-to-float v3, v3 */
v4 = this.mPaint;
(( android.graphics.Canvas ) p1 ).drawText ( v1, v2, v3, v4 ); // invoke-virtual {p1, v1, v2, v3, v4}, Landroid/graphics/Canvas;->drawText(Ljava/lang/String;FFLandroid/graphics/Paint;)V
/* .line 242 */
v1 = this.help_text_items;
int v2 = 6; // const/4 v2, 0x6
/* aget-object v1, v1, v2 */
v2 = this.list_x;
/* aget v2, v2, v7 */
/* int-to-float v2, v2 */
/* iget v3, p0, Lde/nurogames/android/ticb/base/views/HelpView;->list_top:I */
/* iget v4, p0, Lde/nurogames/android/ticb/base/views/HelpView;->list_font_dif:I */
/* add-int/2addr v3, v4 */
/* iget v4, p0, Lde/nurogames/android/ticb/base/views/HelpView;->list_spacing:I */
/* mul-int/lit8 v4, v4, 0x2 */
/* add-int/2addr v3, v4 */
/* int-to-float v3, v3 */
v4 = this.mPaint;
(( android.graphics.Canvas ) p1 ).drawText ( v1, v2, v3, v4 ); // invoke-virtual {p1, v1, v2, v3, v4}, Landroid/graphics/Canvas;->drawText(Ljava/lang/String;FFLandroid/graphics/Paint;)V
/* .line 243 */
v1 = this.help_text_items;
/* const/16 v2, 0x8 */
/* aget-object v1, v1, v2 */
v2 = this.list_x;
/* aget v2, v2, v7 */
/* int-to-float v2, v2 */
/* iget v3, p0, Lde/nurogames/android/ticb/base/views/HelpView;->list_top:I */
/* iget v4, p0, Lde/nurogames/android/ticb/base/views/HelpView;->list_font_dif:I */
/* add-int/2addr v3, v4 */
/* iget v4, p0, Lde/nurogames/android/ticb/base/views/HelpView;->list_spacing:I */
/* mul-int/lit8 v4, v4, 0x3 */
/* add-int/2addr v3, v4 */
/* int-to-float v3, v3 */
v4 = this.mPaint;
(( android.graphics.Canvas ) p1 ).drawText ( v1, v2, v3, v4 ); // invoke-virtual {p1, v1, v2, v3, v4}, Landroid/graphics/Canvas;->drawText(Ljava/lang/String;FFLandroid/graphics/Paint;)V
/* .line 244 */
v1 = this.help_text_items;
/* const/16 v2, 0xa */
/* aget-object v1, v1, v2 */
v2 = this.list_x;
/* aget v2, v2, v7 */
/* int-to-float v2, v2 */
/* iget v3, p0, Lde/nurogames/android/ticb/base/views/HelpView;->list_top:I */
/* iget v4, p0, Lde/nurogames/android/ticb/base/views/HelpView;->list_font_dif:I */
/* add-int/2addr v3, v4 */
/* iget v4, p0, Lde/nurogames/android/ticb/base/views/HelpView;->list_spacing:I */
/* mul-int/lit8 v4, v4, 0x4 */
/* add-int/2addr v3, v4 */
/* int-to-float v3, v3 */
v4 = this.mPaint;
(( android.graphics.Canvas ) p1 ).drawText ( v1, v2, v3, v4 ); // invoke-virtual {p1, v1, v2, v3, v4}, Landroid/graphics/Canvas;->drawText(Ljava/lang/String;FFLandroid/graphics/Paint;)V
/* goto/16 :goto_2 */
/* .line 247 */
} // :cond_4
/* iget v1, p0, Lde/nurogames/android/ticb/base/views/HelpView;->selected_item:I */
/* iget v2, p0, Lde/nurogames/android/ticb/base/views/HelpView;->MENU_AIM:I */
/* if-ne v1, v2, :cond_0 */
/* .line 249 */
(( de.nurogames.android.ticb.base.views.HelpView ) p0 ).getResources ( ); // invoke-virtual {p0}, Lde/nurogames/android/ticb/base/views/HelpView;->getResources()Landroid/content/res/Resources;
(( android.content.res.Resources ) v1 ).getIntArray ( v2 ); // invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getIntArray(I)[I
/* aget v1, v1, v2 */
/* iput v1, p0, Lde/nurogames/android/ticb/base/views/HelpView;->list_spacing:I */
/* .line 251 */
/* new-array v1, v9, [I */
/* .line 252 */
(( de.nurogames.android.ticb.base.views.HelpView ) p0 ).getResources ( ); // invoke-virtual {p0}, Lde/nurogames/android/ticb/base/views/HelpView;->getResources()Landroid/content/res/Resources;
(( android.content.res.Resources ) v2 ).getIntArray ( v3 ); // invoke-virtual {v2, v3}, Landroid/content/res/Resources;->getIntArray(I)[I
/* aget v2, v2, v3 */
/* aput v2, v1, v5 */
/* .line 253 */
(( de.nurogames.android.ticb.base.views.HelpView ) p0 ).getResources ( ); // invoke-virtual {p0}, Lde/nurogames/android/ticb/base/views/HelpView;->getResources()Landroid/content/res/Resources;
(( android.content.res.Resources ) v2 ).getIntArray ( v3 ); // invoke-virtual {v2, v3}, Landroid/content/res/Resources;->getIntArray(I)[I
/* aget v2, v2, v3 */
/* aput v2, v1, v6 */
/* .line 254 */
(( de.nurogames.android.ticb.base.views.HelpView ) p0 ).getResources ( ); // invoke-virtual {p0}, Lde/nurogames/android/ticb/base/views/HelpView;->getResources()Landroid/content/res/Resources;
(( android.content.res.Resources ) v2 ).getIntArray ( v3 ); // invoke-virtual {v2, v3}, Landroid/content/res/Resources;->getIntArray(I)[I
/* aget v2, v2, v3 */
/* aput v2, v1, v7 */
/* .line 251 */
this.list_x = v1;
/* .line 258 */
v1 = this.mPaint;
/* iget v2, p0, Lde/nurogames/android/ticb/base/views/HelpView;->FONT_LARGE:I */
/* int-to-float v2, v2 */
(( android.graphics.Paint ) v1 ).setTextSize ( v2 ); // invoke-virtual {v1, v2}, Landroid/graphics/Paint;->setTextSize(F)V
/* .line 259 */
v1 = this.mPaint;
int v2 = -1; // const/4 v2, -0x1
(( android.graphics.Paint ) v1 ).setColor ( v2 ); // invoke-virtual {v1, v2}, Landroid/graphics/Paint;->setColor(I)V
/* .line 260 */
v1 = this.help_text_aim;
/* aget-object v1, v1, v5 */
v2 = this.list_x;
/* aget v2, v2, v5 */
/* int-to-float v2, v2 */
/* iget v3, p0, Lde/nurogames/android/ticb/base/views/HelpView;->list_top:I */
/* iget v4, p0, Lde/nurogames/android/ticb/base/views/HelpView;->FONT_LARGE:I */
/* sub-int/2addr v3, v4 */
/* int-to-float v3, v3 */
v4 = this.mPaint;
(( android.graphics.Canvas ) p1 ).drawText ( v1, v2, v3, v4 ); // invoke-virtual {p1, v1, v2, v3, v4}, Landroid/graphics/Canvas;->drawText(Ljava/lang/String;FFLandroid/graphics/Paint;)V
/* .line 263 */
v1 = this.mPaint;
/* iget v2, p0, Lde/nurogames/android/ticb/base/views/HelpView;->FONT_MEDIUM:I */
/* int-to-float v2, v2 */
(( android.graphics.Paint ) v1 ).setTextSize ( v2 ); // invoke-virtual {v1, v2}, Landroid/graphics/Paint;->setTextSize(F)V
/* .line 264 */
v1 = this.mPaint;
/* const/16 v2, 0x6e */
/* const/16 v3, 0x46 */
v2 = android.graphics.Color .rgb ( v2,v3,v5 );
(( android.graphics.Paint ) v1 ).setColor ( v2 ); // invoke-virtual {v1, v2}, Landroid/graphics/Paint;->setColor(I)V
/* .line 265 */
int v0 = 0; // const/4 v0, 0x0
} // :goto_3
v1 = this.help_text_aim;
/* array-length v1, v1 */
/* add-int/lit8 v1, v1, -0x1 */
/* if-lt v0, v1, :cond_5 */
/* .line 269 */
v1 = de.nurogames.android.ticb.base.core.AppResources.imgProgessBarHelp;
v3 = de.nurogames.android.ticb.base.core.AppResources.imgProgessBarHelp;
v3 = (( android.graphics.Bitmap ) v3 ).getWidth ( ); // invoke-virtual {v3}, Landroid/graphics/Bitmap;->getWidth()I
/* div-int/lit8 v3, v3, 0x2 */
/* sub-int/2addr v2, v3 */
/* int-to-float v2, v2 */
/* int-to-float v3, v3 */
v4 = de.nurogames.android.ticb.base.core.AppResources.imgProgessBarHelp;
v4 = (( android.graphics.Bitmap ) v4 ).getHeight ( ); // invoke-virtual {v4}, Landroid/graphics/Bitmap;->getHeight()I
/* int-to-float v4, v4 */
/* const/high16 v5, 0x3fc00000 # 1.5f */
/* mul-float/2addr v4, v5 */
/* sub-float/2addr v3, v4 */
(( android.graphics.Canvas ) p1 ).drawBitmap ( v1, v2, v3, v8 ); // invoke-virtual {p1, v1, v2, v3, v8}, Landroid/graphics/Canvas;->drawBitmap(Landroid/graphics/Bitmap;FFLandroid/graphics/Paint;)V
/* goto/16 :goto_2 */
/* .line 266 */
} // :cond_5
v1 = this.help_text_aim;
/* add-int/lit8 v2, v0, 0x1 */
/* aget-object v1, v1, v2 */
v2 = this.list_x;
/* aget v2, v2, v5 */
/* int-to-float v2, v2 */
/* iget v3, p0, Lde/nurogames/android/ticb/base/views/HelpView;->list_top:I */
/* iget v4, p0, Lde/nurogames/android/ticb/base/views/HelpView;->list_font_dif:I */
/* add-int/2addr v3, v4 */
/* iget v4, p0, Lde/nurogames/android/ticb/base/views/HelpView;->list_spacing:I */
/* mul-int/2addr v4, v0 */
/* add-int/2addr v3, v4 */
/* int-to-float v3, v3 */
v4 = this.mPaint;
(( android.graphics.Canvas ) p1 ).drawText ( v1, v2, v3, v4 ); // invoke-virtual {p1, v1, v2, v3, v4}, Landroid/graphics/Canvas;->drawText(Ljava/lang/String;FFLandroid/graphics/Paint;)V
/* .line 265 */
/* add-int/lit8 v0, v0, 0x1 */
} // .end method
public void setState ( Integer p0 ) {
/* .locals 1 */
/* .param p1, "state" # I */
/* .prologue */
/* .line 396 */
/* iput p1, p0, Lde/nurogames/android/ticb/base/views/HelpView;->mMode:I */
/* .line 397 */
int v0 = 1; // const/4 v0, 0x1
/* if-ne p1, v0, :cond_0 */
(( de.nurogames.android.ticb.base.views.HelpView ) p0 ).initView ( ); // invoke-virtual {p0}, Lde/nurogames/android/ticb/base/views/HelpView;->initView()V
/* .line 398 */
} // :cond_0
(( de.nurogames.android.ticb.base.views.HelpView ) p0 ).update ( ); // invoke-virtual {p0}, Lde/nurogames/android/ticb/base/views/HelpView;->update()V
/* .line 399 */
return;
} // .end method
public void update ( ) {
/* .locals 3 */
/* .prologue */
/* .line 280 */
/* iget v0, p0, Lde/nurogames/android/ticb/base/views/HelpView;->mMode:I */
int v1 = 1; // const/4 v1, 0x1
/* if-ne v0, v1, :cond_0 */
/* .line 283 */
v0 = this.background;
(( de.nurogames.android.ticb.base.objects.objAnimMenuBackground ) v0 ).animate ( ); // invoke-virtual {v0}, Lde/nurogames/android/ticb/base/objects/objAnimMenuBackground;->animate()V
/* .line 286 */
v0 = this.mRedrawHandler;
/* const-wide/16 v1, 0x19 */
(( de.nurogames.android.ticb.base.views.HelpView$RefreshHandler ) v0 ).sleep ( v1, v2 ); // invoke-virtual {v0, v1, v2}, Lde/nurogames/android/ticb/base/views/HelpView$RefreshHandler;->sleep(J)V
/* .line 288 */
} // :cond_0
return;
} // .end method
