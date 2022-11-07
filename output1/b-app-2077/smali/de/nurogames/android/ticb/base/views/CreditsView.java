public class de.nurogames.android.ticb.base.views.CreditsView extends de.nurogames.android.ticb.base.views.ViewPlus {
	 /* .source "CreditsView.java" */
	 /* # annotations */
	 /* .annotation system Ldalvik/annotation/MemberClasses; */
	 /* value = { */
	 /* Lde/nurogames/android/ticb/base/views/CreditsView$MyOnTouchListener;, */
	 /* Lde/nurogames/android/ticb/base/views/CreditsView$RefreshHandler; */
	 /* } */
} // .end annotation
/* # instance fields */
private Integer FONT_LARGE;
private Integer FONT_MEDIUM;
private Integer FONT_SMALL;
private de.nurogames.android.ticb.base.objects.objMenuButton back;
private de.nurogames.android.ticb.base.objects.objAnimMenuBackground background;
private java.lang.String credits;
private de.nurogames.android.ticb.base.objects.objMenuButton easteregg;
private Integer mMode;
private android.graphics.Paint mPaint;
private de.nurogames.android.ticb.base.views.CreditsView$RefreshHandler mRedrawHandler;
private Integer text_item_spacing;
private text_y;
private java.lang.String version;
/* # direct methods */
public de.nurogames.android.ticb.base.views.CreditsView ( ) {
	 /* .locals 2 */
	 /* .param p1, "context" # Landroid/content/Context; */
	 /* .param p2, "attrs" # Landroid/util/AttributeSet; */
	 /* .prologue */
	 int v1 = 0; // const/4 v1, 0x0
	 /* .line 72 */
	 /* invoke-direct {p0, p1}, Lde/nurogames/android/ticb/base/views/ViewPlus;-><init>(Landroid/content/Context;)V */
	 /* .line 34 */
	 /* iput v1, p0, Lde/nurogames/android/ticb/base/views/CreditsView;->mMode:I */
	 /* .line 37 */
	 /* new-instance v0, Lde/nurogames/android/ticb/base/views/CreditsView$RefreshHandler; */
	 /* invoke-direct {v0, p0}, Lde/nurogames/android/ticb/base/views/CreditsView$RefreshHandler;-><init>(Lde/nurogames/android/ticb/base/views/CreditsView;)V */
	 this.mRedrawHandler = v0;
	 /* .line 47 */
	 /* new-instance v0, Landroid/graphics/Paint; */
	 /* invoke-direct {v0}, Landroid/graphics/Paint;-><init>()V */
	 this.mPaint = v0;
	 /* .line 51 */
	 /* iput v1, p0, Lde/nurogames/android/ticb/base/views/CreditsView;->text_item_spacing:I */
	 /* .line 54 */
	 /* iput v1, p0, Lde/nurogames/android/ticb/base/views/CreditsView;->FONT_SMALL:I */
	 /* .line 55 */
	 /* iput v1, p0, Lde/nurogames/android/ticb/base/views/CreditsView;->FONT_MEDIUM:I */
	 /* .line 56 */
	 /* iput v1, p0, Lde/nurogames/android/ticb/base/views/CreditsView;->FONT_LARGE:I */
	 /* .line 73 */
	 return;
} // .end method
static de.nurogames.android.ticb.base.objects.objMenuButton access$0 ( de.nurogames.android.ticb.base.views.CreditsView p0 ) { //synthethic
	 /* .locals 1 */
	 /* .prologue */
	 /* .line 40 */
	 v0 = this.back;
} // .end method
static de.nurogames.android.ticb.base.objects.objMenuButton access$1 ( de.nurogames.android.ticb.base.views.CreditsView p0 ) { //synthethic
	 /* .locals 1 */
	 /* .prologue */
	 /* .line 41 */
	 v0 = this.easteregg;
} // .end method
static void access$2 ( de.nurogames.android.ticb.base.views.CreditsView p0 ) { //synthethic
	 /* .locals 0 */
	 /* .prologue */
	 /* .line 404 */
	 /* invoke-direct {p0}, Lde/nurogames/android/ticb/base/views/CreditsView;->showEasterEggDialog()V */
	 return;
} // .end method
static android.graphics.Paint access$3 ( de.nurogames.android.ticb.base.views.CreditsView p0 ) { //synthethic
	 /* .locals 1 */
	 /* .prologue */
	 /* .line 47 */
	 v0 = this.mPaint;
} // .end method
private java.lang.String getVersion ( ) {
	 /* .locals 5 */
	 /* .prologue */
	 /* .line 77 */
	 int v1 = 0; // const/4 v1, 0x0
	 /* .line 80 */
	 /* .local v1, "packageInfo":Landroid/content/pm/PackageInfo; */
	 try { // :try_start_0
		 (( de.nurogames.android.ticb.base.views.CreditsView ) p0 ).getContext ( ); // invoke-virtual {p0}, Lde/nurogames/android/ticb/base/views/CreditsView;->getContext()Landroid/content/Context;
		 (( android.content.Context ) v2 ).getPackageManager ( ); // invoke-virtual {v2}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;
		 (( de.nurogames.android.ticb.base.views.CreditsView ) p0 ).getContext ( ); // invoke-virtual {p0}, Lde/nurogames/android/ticb/base/views/CreditsView;->getContext()Landroid/content/Context;
		 (( android.content.Context ) v3 ).getPackageName ( ); // invoke-virtual {v3}, Landroid/content/Context;->getPackageName()Ljava/lang/String;
		 /* const/16 v4, 0x80 */
		 (( android.content.pm.PackageManager ) v2 ).getPackageInfo ( v3, v4 ); // invoke-virtual {v2, v3, v4}, Landroid/content/pm/PackageManager;->getPackageInfo(Ljava/lang/String;I)Landroid/content/pm/PackageInfo;
		 /* .line 81 */
		 /* new-instance v2, Ljava/lang/StringBuilder; */
		 (( de.nurogames.android.ticb.base.views.CreditsView ) p0 ).getResources ( ); // invoke-virtual {p0}, Lde/nurogames/android/ticb/base/views/CreditsView;->getResources()Landroid/content/res/Resources;
		 (( android.content.res.Resources ) v3 ).getString ( v4 ); // invoke-virtual {v3, v4}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;
		 java.lang.String .valueOf ( v3 );
		 /* invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V */
		 final String v3 = " v"; // const-string v3, " v"
		 (( java.lang.StringBuilder ) v2 ).append ( v3 ); // invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
		 v3 = this.versionName;
		 (( java.lang.StringBuilder ) v2 ).append ( v3 ); // invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
		 (( java.lang.StringBuilder ) v2 ).toString ( ); // invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
		 /* :try_end_0 */
		 /* .catch Landroid/content/pm/PackageManager$NameNotFoundException; {:try_start_0 ..:try_end_0} :catch_0 */
		 /* .line 83 */
	 } // :goto_0
	 /* :catch_0 */
	 /* move-exception v0 */
	 /* .local v0, "e":Landroid/content/pm/PackageManager$NameNotFoundException; */
	 final String v2 = "v0.00"; // const-string v2, "v0.00"
} // .end method
private void showEasterEggDialog ( ) {
	 /* .locals 5 */
	 /* .prologue */
	 /* .line 406 */
	 /* new-instance v1, Landroid/app/AlertDialog$Builder; */
	 (( de.nurogames.android.ticb.base.views.CreditsView ) p0 ).getContext ( ); // invoke-virtual {p0}, Lde/nurogames/android/ticb/base/views/CreditsView;->getContext()Landroid/content/Context;
	 /* invoke-direct {v1, v2}, Landroid/app/AlertDialog$Builder;-><init>(Landroid/content/Context;)V */
	 /* .line 408 */
	 /* .local v1, "builder":Landroid/app/AlertDialog$Builder; */
	 (( de.nurogames.android.ticb.base.views.CreditsView ) p0 ).getResources ( ); // invoke-virtual {p0}, Lde/nurogames/android/ticb/base/views/CreditsView;->getResources()Landroid/content/res/Resources;
	 (( android.content.res.Resources ) v2 ).getString ( v3 ); // invoke-virtual {v2, v3}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;
	 (( java.lang.String ) v2 ).toString ( ); // invoke-virtual {v2}, Ljava/lang/String;->toString()Ljava/lang/String;
	 (( android.app.AlertDialog$Builder ) v1 ).setMessage ( v2 ); // invoke-virtual {v1, v2}, Landroid/app/AlertDialog$Builder;->setMessage(Ljava/lang/CharSequence;)Landroid/app/AlertDialog$Builder;
	 /* .line 409 */
	 int v3 = 0; // const/4 v3, 0x0
	 (( android.app.AlertDialog$Builder ) v2 ).setCancelable ( v3 ); // invoke-virtual {v2, v3}, Landroid/app/AlertDialog$Builder;->setCancelable(Z)Landroid/app/AlertDialog$Builder;
	 /* .line 410 */
	 final String v3 = "prost!"; // const-string v3, "prost!"
	 /* new-instance v4, Lde/nurogames/android/ticb/base/views/CreditsView$1; */
	 /* invoke-direct {v4, p0}, Lde/nurogames/android/ticb/base/views/CreditsView$1;-><init>(Lde/nurogames/android/ticb/base/views/CreditsView;)V */
	 (( android.app.AlertDialog$Builder ) v2 ).setPositiveButton ( v3, v4 ); // invoke-virtual {v2, v3, v4}, Landroid/app/AlertDialog$Builder;->setPositiveButton(Ljava/lang/CharSequence;Landroid/content/DialogInterface$OnClickListener;)Landroid/app/AlertDialog$Builder;
	 /* .line 417 */
	 final String v2 = "Easter Egg :)"; // const-string v2, "Easter Egg :)"
	 (( android.app.AlertDialog$Builder ) v1 ).setTitle ( v2 ); // invoke-virtual {v1, v2}, Landroid/app/AlertDialog$Builder;->setTitle(Ljava/lang/CharSequence;)Landroid/app/AlertDialog$Builder;
	 /* .line 419 */
	 (( android.app.AlertDialog$Builder ) v1 ).create ( ); // invoke-virtual {v1}, Landroid/app/AlertDialog$Builder;->create()Landroid/app/AlertDialog;
	 /* .line 420 */
	 /* .local v0, "alert":Landroid/app/AlertDialog; */
	 (( android.app.AlertDialog ) v0 ).show ( ); // invoke-virtual {v0}, Landroid/app/AlertDialog;->show()V
	 /* .line 422 */
	 return;
} // .end method
/* # virtual methods */
public Integer getState ( ) {
	 /* .locals 1 */
	 /* .prologue */
	 /* .line 397 */
	 /* iget v0, p0, Lde/nurogames/android/ticb/base/views/CreditsView;->mMode:I */
} // .end method
public void initView ( ) {
	 /* .locals 10 */
	 /* .prologue */
	 int v1 = 0; // const/4 v1, 0x0
	 int v9 = 3; // const/4 v9, 0x3
	 int v8 = 1; // const/4 v8, 0x1
	 int v2 = 0; // const/4 v2, 0x0
	 /* .line 91 */
	 (( de.nurogames.android.ticb.base.views.CreditsView ) p0 ).setFocusable ( v8 ); // invoke-virtual {p0, v8}, Lde/nurogames/android/ticb/base/views/CreditsView;->setFocusable(Z)V
	 /* .line 94 */
	 /* new-instance v7, Lde/nurogames/android/ticb/base/views/CreditsView$MyOnTouchListener; */
	 /* invoke-direct {v7, p0}, Lde/nurogames/android/ticb/base/views/CreditsView$MyOnTouchListener;-><init>(Lde/nurogames/android/ticb/base/views/CreditsView;)V */
	 /* .line 95 */
	 /* .local v7, "tlistn":Lde/nurogames/android/ticb/base/views/CreditsView$MyOnTouchListener; */
	 (( de.nurogames.android.ticb.base.views.CreditsView ) p0 ).setOnTouchListener ( v7 ); // invoke-virtual {p0, v7}, Lde/nurogames/android/ticb/base/views/CreditsView;->setOnTouchListener(Landroid/view/View$OnTouchListener;)V
	 /* .line 98 */
	 v0 = this.mPaint;
	 (( android.graphics.Paint ) v0 ).setAntiAlias ( v8 ); // invoke-virtual {v0, v8}, Landroid/graphics/Paint;->setAntiAlias(Z)V
	 /* .line 99 */
	 v0 = de.nurogames.android.ticb.base.tinysanta.cntx;
	 (( android.content.Context ) v0 ).getAssets ( ); // invoke-virtual {v0}, Landroid/content/Context;->getAssets()Landroid/content/res/AssetManager;
	 final String v3 = "font.otf"; // const-string v3, "font.otf"
	 android.graphics.Typeface .createFromAsset ( v0,v3 );
	 /* .line 100 */
	 /* .local v6, "tf":Landroid/graphics/Typeface; */
	 v0 = this.mPaint;
	 (( android.graphics.Paint ) v0 ).setTypeface ( v6 ); // invoke-virtual {v0, v6}, Landroid/graphics/Paint;->setTypeface(Landroid/graphics/Typeface;)Landroid/graphics/Typeface;
	 /* .line 102 */
	 /* if-ne v0, v3, :cond_0 */
	 /* .line 103 */
	 (( de.nurogames.android.ticb.base.views.CreditsView ) p0 ).getResources ( ); // invoke-virtual {p0}, Lde/nurogames/android/ticb/base/views/CreditsView;->getResources()Landroid/content/res/Resources;
	 (( android.content.res.Resources ) v0 ).getStringArray ( v3 ); // invoke-virtual {v0, v3}, Landroid/content/res/Resources;->getStringArray(I)[Ljava/lang/String;
	 this.credits = v0;
	 /* .line 113 */
} // :goto_0
(( de.nurogames.android.ticb.base.views.CreditsView ) p0 ).getResources ( ); // invoke-virtual {p0}, Lde/nurogames/android/ticb/base/views/CreditsView;->getResources()Landroid/content/res/Resources;
(( android.content.res.Resources ) v0 ).getIntArray ( v3 ); // invoke-virtual {v0, v3}, Landroid/content/res/Resources;->getIntArray(I)[I
/* aget v0, v0, v3 */
/* iput v0, p0, Lde/nurogames/android/ticb/base/views/CreditsView;->FONT_LARGE:I */
/* .line 114 */
(( de.nurogames.android.ticb.base.views.CreditsView ) p0 ).getResources ( ); // invoke-virtual {p0}, Lde/nurogames/android/ticb/base/views/CreditsView;->getResources()Landroid/content/res/Resources;
(( android.content.res.Resources ) v0 ).getIntArray ( v3 ); // invoke-virtual {v0, v3}, Landroid/content/res/Resources;->getIntArray(I)[I
/* aget v0, v0, v3 */
/* iput v0, p0, Lde/nurogames/android/ticb/base/views/CreditsView;->FONT_MEDIUM:I */
/* .line 115 */
(( de.nurogames.android.ticb.base.views.CreditsView ) p0 ).getResources ( ); // invoke-virtual {p0}, Lde/nurogames/android/ticb/base/views/CreditsView;->getResources()Landroid/content/res/Resources;
(( android.content.res.Resources ) v0 ).getIntArray ( v3 ); // invoke-virtual {v0, v3}, Landroid/content/res/Resources;->getIntArray(I)[I
/* aget v0, v0, v3 */
/* iput v0, p0, Lde/nurogames/android/ticb/base/views/CreditsView;->FONT_SMALL:I */
/* .line 116 */
(( de.nurogames.android.ticb.base.views.CreditsView ) p0 ).getResources ( ); // invoke-virtual {p0}, Lde/nurogames/android/ticb/base/views/CreditsView;->getResources()Landroid/content/res/Resources;
(( android.content.res.Resources ) v0 ).getIntArray ( v3 ); // invoke-virtual {v0, v3}, Landroid/content/res/Resources;->getIntArray(I)[I
/* aget v0, v0, v3 */
/* iput v0, p0, Lde/nurogames/android/ticb/base/views/CreditsView;->text_item_spacing:I */
/* .line 118 */
int v0 = 5; // const/4 v0, 0x5
/* new-array v0, v0, [I */
/* .line 119 */
(( de.nurogames.android.ticb.base.views.CreditsView ) p0 ).getResources ( ); // invoke-virtual {p0}, Lde/nurogames/android/ticb/base/views/CreditsView;->getResources()Landroid/content/res/Resources;
(( android.content.res.Resources ) v3 ).getIntArray ( v4 ); // invoke-virtual {v3, v4}, Landroid/content/res/Resources;->getIntArray(I)[I
/* aget v3, v3, v4 */
/* aput v3, v0, v2 */
/* .line 120 */
(( de.nurogames.android.ticb.base.views.CreditsView ) p0 ).getResources ( ); // invoke-virtual {p0}, Lde/nurogames/android/ticb/base/views/CreditsView;->getResources()Landroid/content/res/Resources;
(( android.content.res.Resources ) v3 ).getIntArray ( v4 ); // invoke-virtual {v3, v4}, Landroid/content/res/Resources;->getIntArray(I)[I
/* aget v3, v3, v4 */
/* aput v3, v0, v8 */
int v3 = 2; // const/4 v3, 0x2
/* .line 121 */
(( de.nurogames.android.ticb.base.views.CreditsView ) p0 ).getResources ( ); // invoke-virtual {p0}, Lde/nurogames/android/ticb/base/views/CreditsView;->getResources()Landroid/content/res/Resources;
(( android.content.res.Resources ) v4 ).getIntArray ( v5 ); // invoke-virtual {v4, v5}, Landroid/content/res/Resources;->getIntArray(I)[I
/* aget v4, v4, v5 */
/* aput v4, v0, v3 */
/* .line 122 */
(( de.nurogames.android.ticb.base.views.CreditsView ) p0 ).getResources ( ); // invoke-virtual {p0}, Lde/nurogames/android/ticb/base/views/CreditsView;->getResources()Landroid/content/res/Resources;
(( android.content.res.Resources ) v3 ).getIntArray ( v4 ); // invoke-virtual {v3, v4}, Landroid/content/res/Resources;->getIntArray(I)[I
/* aget v3, v3, v4 */
/* aput v3, v0, v9 */
int v3 = 4; // const/4 v3, 0x4
/* .line 123 */
(( de.nurogames.android.ticb.base.views.CreditsView ) p0 ).getResources ( ); // invoke-virtual {p0}, Lde/nurogames/android/ticb/base/views/CreditsView;->getResources()Landroid/content/res/Resources;
(( android.content.res.Resources ) v4 ).getIntArray ( v5 ); // invoke-virtual {v4, v5}, Landroid/content/res/Resources;->getIntArray(I)[I
/* aget v4, v4, v5 */
/* aput v4, v0, v3 */
/* .line 118 */
this.text_y = v0;
/* .line 127 */
/* new-instance v0, Lde/nurogames/android/ticb/base/objects/objMenuButton; */
/* .line 129 */
v4 = de.nurogames.android.ticb.base.core.AppResources.imgMenu_back;
/* aget-object v4, v4, v2 */
v4 = (( android.graphics.Bitmap ) v4 ).getHeight ( ); // invoke-virtual {v4}, Landroid/graphics/Bitmap;->getHeight()I
/* sub-int/2addr v3, v4 */
/* .line 130 */
v4 = de.nurogames.android.ticb.base.core.AppResources.imgMenu_back;
/* aget-object v4, v4, v2 */
/* .line 131 */
v5 = de.nurogames.android.ticb.base.core.AppResources.imgMenu_back;
/* aget-object v5, v5, v8 */
/* invoke-direct/range {v0 ..v5}, Lde/nurogames/android/ticb/base/objects/objMenuButton;-><init>(Ljava/lang/String;IILandroid/graphics/Bitmap;Landroid/graphics/Bitmap;)V */
/* .line 127 */
this.back = v0;
/* .line 133 */
/* new-instance v0, Lde/nurogames/android/ticb/base/objects/objMenuButton; */
/* .line 134 */
/* int-to-float v2, v2 */
v3 = this.mPaint;
v4 = this.credits;
int v5 = 7; // const/4 v5, 0x7
/* aget-object v4, v4, v5 */
v3 = (( android.graphics.Paint ) v3 ).measureText ( v4 ); // invoke-virtual {v3, v4}, Landroid/graphics/Paint;->measureText(Ljava/lang/String;)F
/* const/high16 v4, 0x40000000 # 2.0f */
/* div-float/2addr v3, v4 */
/* sub-float/2addr v2, v3 */
/* float-to-int v2, v2 */
/* .line 135 */
v3 = this.text_y;
/* aget v3, v3, v9 */
/* .line 136 */
v4 = de.nurogames.android.ticb.base.core.AppResources.imgSweet;
/* .line 137 */
v5 = de.nurogames.android.ticb.base.core.AppResources.imgSweet;
/* invoke-direct/range {v0 ..v5}, Lde/nurogames/android/ticb/base/objects/objMenuButton;-><init>(Ljava/lang/String;IILandroid/graphics/Bitmap;Landroid/graphics/Bitmap;)V */
/* .line 133 */
this.easteregg = v0;
/* .line 140 */
/* new-instance v0, Lde/nurogames/android/ticb/base/objects/objAnimMenuBackground; */
/* invoke-direct {v0}, Lde/nurogames/android/ticb/base/objects/objAnimMenuBackground;-><init>()V */
this.background = v0;
/* .line 142 */
/* invoke-direct {p0}, Lde/nurogames/android/ticb/base/views/CreditsView;->getVersion()Ljava/lang/String; */
this.version = v0;
/* .line 144 */
return;
/* .line 104 */
} // :cond_0
/* if-ne v0, v3, :cond_1 */
/* .line 105 */
(( de.nurogames.android.ticb.base.views.CreditsView ) p0 ).getResources ( ); // invoke-virtual {p0}, Lde/nurogames/android/ticb/base/views/CreditsView;->getResources()Landroid/content/res/Resources;
(( android.content.res.Resources ) v0 ).getStringArray ( v3 ); // invoke-virtual {v0, v3}, Landroid/content/res/Resources;->getStringArray(I)[Ljava/lang/String;
this.credits = v0;
/* goto/16 :goto_0 */
/* .line 106 */
} // :cond_1
/* if-ne v0, v3, :cond_2 */
/* .line 107 */
(( de.nurogames.android.ticb.base.views.CreditsView ) p0 ).getResources ( ); // invoke-virtual {p0}, Lde/nurogames/android/ticb/base/views/CreditsView;->getResources()Landroid/content/res/Resources;
(( android.content.res.Resources ) v0 ).getStringArray ( v3 ); // invoke-virtual {v0, v3}, Landroid/content/res/Resources;->getStringArray(I)[Ljava/lang/String;
this.credits = v0;
/* goto/16 :goto_0 */
/* .line 108 */
} // :cond_2
/* if-ne v0, v3, :cond_3 */
/* .line 109 */
(( de.nurogames.android.ticb.base.views.CreditsView ) p0 ).getResources ( ); // invoke-virtual {p0}, Lde/nurogames/android/ticb/base/views/CreditsView;->getResources()Landroid/content/res/Resources;
(( android.content.res.Resources ) v0 ).getStringArray ( v3 ); // invoke-virtual {v0, v3}, Landroid/content/res/Resources;->getStringArray(I)[Ljava/lang/String;
this.credits = v0;
/* goto/16 :goto_0 */
/* .line 111 */
} // :cond_3
(( de.nurogames.android.ticb.base.views.CreditsView ) p0 ).getResources ( ); // invoke-virtual {p0}, Lde/nurogames/android/ticb/base/views/CreditsView;->getResources()Landroid/content/res/Resources;
(( android.content.res.Resources ) v0 ).getStringArray ( v3 ); // invoke-virtual {v0, v3}, Landroid/content/res/Resources;->getStringArray(I)[Ljava/lang/String;
this.credits = v0;
/* goto/16 :goto_0 */
} // .end method
public void onDraw ( android.graphics.Canvas p0 ) {
/* .locals 12 */
/* .param p1, "g" # Landroid/graphics/Canvas; */
/* .prologue */
int v11 = 2; // const/4 v11, 0x2
int v10 = 1; // const/4 v10, 0x1
int v6 = 0; // const/4 v6, 0x0
/* const/high16 v9, 0x40000000 # 2.0f */
int v8 = 0; // const/4 v8, 0x0
/* .line 154 */
v3 = this.background;
(( de.nurogames.android.ticb.base.objects.objAnimMenuBackground ) v3 ).onDraw ( p1 ); // invoke-virtual {v3, p1}, Lde/nurogames/android/ticb/base/objects/objAnimMenuBackground;->onDraw(Landroid/graphics/Canvas;)V
/* .line 157 */
v3 = de.nurogames.android.ticb.base.core.AppResources.imgHoneyDot;
int v4 = 4; // const/4 v4, 0x4
/* aget-object v3, v3, v4 */
/* add-int/lit8 v4, v4, -0x76 */
/* int-to-float v4, v4 */
v5 = this.text_y;
/* aget v5, v5, v8 */
/* add-int/lit8 v5, v5, 0x12 */
/* int-to-float v5, v5 */
(( android.graphics.Canvas ) p1 ).drawBitmap ( v3, v4, v5, v6 ); // invoke-virtual {p1, v3, v4, v5, v6}, Landroid/graphics/Canvas;->drawBitmap(Landroid/graphics/Bitmap;FFLandroid/graphics/Paint;)V
/* .line 159 */
v3 = de.nurogames.android.ticb.base.core.AppResources.imgHoneyDot;
/* aget-object v3, v3, v8 */
/* add-int/lit16 v4, v4, 0x9a */
/* int-to-float v4, v4 */
v5 = this.text_y;
/* aget v5, v5, v8 */
/* add-int/lit8 v5, v5, 0x20 */
/* int-to-float v5, v5 */
(( android.graphics.Canvas ) p1 ).drawBitmap ( v3, v4, v5, v6 ); // invoke-virtual {p1, v3, v4, v5, v6}, Landroid/graphics/Canvas;->drawBitmap(Landroid/graphics/Bitmap;FFLandroid/graphics/Paint;)V
/* .line 160 */
v3 = de.nurogames.android.ticb.base.core.AppResources.imgHoneyDot;
/* aget-object v3, v3, v8 */
/* add-int/lit16 v4, v4, 0xc2 */
/* int-to-float v4, v4 */
v5 = this.text_y;
/* aget v5, v5, v8 */
/* add-int/lit8 v5, v5, 0x14 */
/* int-to-float v5, v5 */
(( android.graphics.Canvas ) p1 ).drawBitmap ( v3, v4, v5, v6 ); // invoke-virtual {p1, v3, v4, v5, v6}, Landroid/graphics/Canvas;->drawBitmap(Landroid/graphics/Bitmap;FFLandroid/graphics/Paint;)V
/* .line 161 */
v3 = de.nurogames.android.ticb.base.core.AppResources.imgHoneyDot;
/* aget-object v3, v3, v8 */
/* add-int/lit16 v4, v4, 0xea */
/* int-to-float v4, v4 */
v5 = this.text_y;
/* aget v5, v5, v8 */
/* add-int/lit8 v5, v5, 0xe */
/* int-to-float v5, v5 */
(( android.graphics.Canvas ) p1 ).drawBitmap ( v3, v4, v5, v6 ); // invoke-virtual {p1, v3, v4, v5, v6}, Landroid/graphics/Canvas;->drawBitmap(Landroid/graphics/Bitmap;FFLandroid/graphics/Paint;)V
/* .line 163 */
v3 = de.nurogames.android.ticb.base.core.AppResources.imgHoneyDot;
int v4 = 3; // const/4 v4, 0x3
/* aget-object v3, v3, v4 */
/* add-int/lit16 v4, v4, -0x8c */
/* int-to-float v4, v4 */
v5 = this.text_y;
/* aget v5, v5, v8 */
/* add-int/lit16 v5, v5, 0xa8 */
/* int-to-float v5, v5 */
(( android.graphics.Canvas ) p1 ).drawBitmap ( v3, v4, v5, v6 ); // invoke-virtual {p1, v3, v4, v5, v6}, Landroid/graphics/Canvas;->drawBitmap(Landroid/graphics/Bitmap;FFLandroid/graphics/Paint;)V
/* .line 165 */
v3 = de.nurogames.android.ticb.base.core.AppResources.imgHoneyDot;
/* aget-object v3, v3, v11 */
/* add-int/lit8 v4, v4, 0x70 */
/* int-to-float v4, v4 */
v5 = this.text_y;
/* aget v5, v5, v8 */
/* add-int/lit16 v5, v5, 0x142 */
/* int-to-float v5, v5 */
(( android.graphics.Canvas ) p1 ).drawBitmap ( v3, v4, v5, v6 ); // invoke-virtual {p1, v3, v4, v5, v6}, Landroid/graphics/Canvas;->drawBitmap(Landroid/graphics/Bitmap;FFLandroid/graphics/Paint;)V
/* .line 167 */
v3 = de.nurogames.android.ticb.base.core.AppResources.imgHoneyDot;
/* aget-object v3, v3, v8 */
/* add-int/lit8 v4, v4, 0x54 */
/* int-to-float v4, v4 */
v5 = this.text_y;
/* aget v5, v5, v8 */
/* add-int/lit16 v5, v5, 0x16a */
/* int-to-float v5, v5 */
(( android.graphics.Canvas ) p1 ).drawBitmap ( v3, v4, v5, v6 ); // invoke-virtual {p1, v3, v4, v5, v6}, Landroid/graphics/Canvas;->drawBitmap(Landroid/graphics/Bitmap;FFLandroid/graphics/Paint;)V
/* .line 168 */
v3 = de.nurogames.android.ticb.base.core.AppResources.imgHoneyDot;
/* aget-object v3, v3, v8 */
/* add-int/lit8 v4, v4, 0x6e */
/* int-to-float v4, v4 */
v5 = this.text_y;
/* aget v5, v5, v8 */
/* add-int/lit16 v5, v5, 0x176 */
/* int-to-float v5, v5 */
(( android.graphics.Canvas ) p1 ).drawBitmap ( v3, v4, v5, v6 ); // invoke-virtual {p1, v3, v4, v5, v6}, Landroid/graphics/Canvas;->drawBitmap(Landroid/graphics/Bitmap;FFLandroid/graphics/Paint;)V
/* .line 171 */
v3 = de.nurogames.android.ticb.base.core.AppResources.imgBee;
/* aget-object v3, v3, v8 */
/* const/16 v4, 0x9 */
/* aget-object v3, v3, v4 */
/* aget-object v3, v3, v8 */
/* add-int/lit8 v4, v4, 0x50 */
/* int-to-float v4, v4 */
v5 = this.text_y;
/* aget v5, v5, v8 */
/* add-int/lit8 v5, v5, 0x44 */
/* int-to-float v5, v5 */
(( android.graphics.Canvas ) p1 ).drawBitmap ( v3, v4, v5, v6 ); // invoke-virtual {p1, v3, v4, v5, v6}, Landroid/graphics/Canvas;->drawBitmap(Landroid/graphics/Bitmap;FFLandroid/graphics/Paint;)V
/* .line 172 */
v3 = de.nurogames.android.ticb.base.core.AppResources.imgBee;
/* aget-object v3, v3, v10 */
/* const/16 v4, 0x9 */
/* aget-object v3, v3, v4 */
/* aget-object v3, v3, v8 */
/* add-int/lit16 v4, v4, 0x80 */
/* int-to-float v4, v4 */
v5 = this.text_y;
/* aget v5, v5, v8 */
/* add-int/lit16 v5, v5, 0xe4 */
/* int-to-float v5, v5 */
(( android.graphics.Canvas ) p1 ).drawBitmap ( v3, v4, v5, v6 ); // invoke-virtual {p1, v3, v4, v5, v6}, Landroid/graphics/Canvas;->drawBitmap(Landroid/graphics/Bitmap;FFLandroid/graphics/Paint;)V
/* .line 173 */
v3 = de.nurogames.android.ticb.base.core.AppResources.imgBee;
/* aget-object v3, v3, v11 */
/* const/16 v4, 0x9 */
/* aget-object v3, v3, v4 */
/* aget-object v3, v3, v8 */
/* add-int/lit16 v4, v4, -0xf0 */
/* int-to-float v4, v4 */
v5 = this.text_y;
/* aget v5, v5, v8 */
/* add-int/lit16 v5, v5, 0x148 */
/* int-to-float v5, v5 */
(( android.graphics.Canvas ) p1 ).drawBitmap ( v3, v4, v5, v6 ); // invoke-virtual {p1, v3, v4, v5, v6}, Landroid/graphics/Canvas;->drawBitmap(Landroid/graphics/Bitmap;FFLandroid/graphics/Paint;)V
/* .line 180 */
v3 = this.mPaint;
/* iget v4, p0, Lde/nurogames/android/ticb/base/views/CreditsView;->FONT_LARGE:I */
/* int-to-float v4, v4 */
(( android.graphics.Paint ) v3 ).setTextSize ( v4 ); // invoke-virtual {v3, v4}, Landroid/graphics/Paint;->setTextSize(F)V
/* .line 181 */
v3 = this.mPaint;
/* const/16 v4, 0x6e */
/* const/16 v5, 0x46 */
v4 = android.graphics.Color .rgb ( v4,v5,v8 );
(( android.graphics.Paint ) v3 ).setColor ( v4 ); // invoke-virtual {v3, v4}, Landroid/graphics/Paint;->setColor(I)V
/* .line 182 */
v3 = this.credits;
/* aget-object v3, v3, v8 */
/* int-to-float v4, v4 */
v5 = this.mPaint;
v6 = this.credits;
/* aget-object v6, v6, v8 */
v5 = (( android.graphics.Paint ) v5 ).measureText ( v6 ); // invoke-virtual {v5, v6}, Landroid/graphics/Paint;->measureText(Ljava/lang/String;)F
/* div-float/2addr v5, v9 */
/* sub-float/2addr v4, v5 */
v5 = this.text_y;
/* aget v5, v5, v8 */
/* int-to-float v5, v5 */
v6 = this.mPaint;
(( android.graphics.Canvas ) p1 ).drawText ( v3, v4, v5, v6 ); // invoke-virtual {p1, v3, v4, v5, v6}, Landroid/graphics/Canvas;->drawText(Ljava/lang/String;FFLandroid/graphics/Paint;)V
/* .line 188 */
v3 = this.mPaint;
int v4 = -1; // const/4 v4, -0x1
(( android.graphics.Paint ) v3 ).setColor ( v4 ); // invoke-virtual {v3, v4}, Landroid/graphics/Paint;->setColor(I)V
/* .line 189 */
v3 = this.mPaint;
/* iget v4, p0, Lde/nurogames/android/ticb/base/views/CreditsView;->FONT_MEDIUM:I */
/* int-to-float v4, v4 */
(( android.graphics.Paint ) v3 ).setTextSize ( v4 ); // invoke-virtual {v3, v4}, Landroid/graphics/Paint;->setTextSize(F)V
/* .line 190 */
v3 = this.credits;
/* aget-object v3, v3, v10 */
/* int-to-float v4, v4 */
v5 = this.mPaint;
v6 = this.credits;
/* aget-object v6, v6, v10 */
v5 = (( android.graphics.Paint ) v5 ).measureText ( v6 ); // invoke-virtual {v5, v6}, Landroid/graphics/Paint;->measureText(Ljava/lang/String;)F
/* div-float/2addr v5, v9 */
/* sub-float/2addr v4, v5 */
v5 = this.text_y;
/* aget v5, v5, v10 */
/* int-to-float v5, v5 */
v6 = this.mPaint;
(( android.graphics.Canvas ) p1 ).drawText ( v3, v4, v5, v6 ); // invoke-virtual {p1, v3, v4, v5, v6}, Landroid/graphics/Canvas;->drawText(Ljava/lang/String;FFLandroid/graphics/Paint;)V
/* .line 192 */
v3 = this.mPaint;
/* const/16 v4, 0x6e */
/* const/16 v5, 0x46 */
v4 = android.graphics.Color .rgb ( v4,v5,v8 );
(( android.graphics.Paint ) v3 ).setColor ( v4 ); // invoke-virtual {v3, v4}, Landroid/graphics/Paint;->setColor(I)V
/* .line 193 */
v3 = this.mPaint;
/* iget v4, p0, Lde/nurogames/android/ticb/base/views/CreditsView;->FONT_SMALL:I */
/* int-to-float v4, v4 */
(( android.graphics.Paint ) v3 ).setTextSize ( v4 ); // invoke-virtual {v3, v4}, Landroid/graphics/Paint;->setTextSize(F)V
/* .line 194 */
v3 = this.credits;
/* aget-object v3, v3, v11 */
/* int-to-float v4, v4 */
v5 = this.mPaint;
v6 = this.credits;
/* aget-object v6, v6, v11 */
v5 = (( android.graphics.Paint ) v5 ).measureText ( v6 ); // invoke-virtual {v5, v6}, Landroid/graphics/Paint;->measureText(Ljava/lang/String;)F
/* div-float/2addr v5, v9 */
/* sub-float/2addr v4, v5 */
v5 = this.text_y;
/* aget v5, v5, v10 */
/* iget v6, p0, Lde/nurogames/android/ticb/base/views/CreditsView;->text_item_spacing:I */
/* add-int/2addr v5, v6 */
/* int-to-float v5, v5 */
v6 = this.mPaint;
(( android.graphics.Canvas ) p1 ).drawText ( v3, v4, v5, v6 ); // invoke-virtual {p1, v3, v4, v5, v6}, Landroid/graphics/Canvas;->drawText(Ljava/lang/String;FFLandroid/graphics/Paint;)V
/* .line 195 */
v3 = this.credits;
int v4 = 3; // const/4 v4, 0x3
/* aget-object v3, v3, v4 */
/* int-to-float v4, v4 */
v5 = this.mPaint;
v6 = this.credits;
int v7 = 3; // const/4 v7, 0x3
/* aget-object v6, v6, v7 */
v5 = (( android.graphics.Paint ) v5 ).measureText ( v6 ); // invoke-virtual {v5, v6}, Landroid/graphics/Paint;->measureText(Ljava/lang/String;)F
/* div-float/2addr v5, v9 */
/* sub-float/2addr v4, v5 */
v5 = this.text_y;
/* aget v5, v5, v10 */
/* iget v6, p0, Lde/nurogames/android/ticb/base/views/CreditsView;->text_item_spacing:I */
/* mul-int/lit8 v6, v6, 0x2 */
/* add-int/2addr v5, v6 */
/* int-to-float v5, v5 */
v6 = this.mPaint;
(( android.graphics.Canvas ) p1 ).drawText ( v3, v4, v5, v6 ); // invoke-virtual {p1, v3, v4, v5, v6}, Landroid/graphics/Canvas;->drawText(Ljava/lang/String;FFLandroid/graphics/Paint;)V
/* .line 201 */
v3 = this.mPaint;
int v4 = -1; // const/4 v4, -0x1
(( android.graphics.Paint ) v3 ).setColor ( v4 ); // invoke-virtual {v3, v4}, Landroid/graphics/Paint;->setColor(I)V
/* .line 202 */
v3 = this.mPaint;
/* iget v4, p0, Lde/nurogames/android/ticb/base/views/CreditsView;->FONT_MEDIUM:I */
/* int-to-float v4, v4 */
(( android.graphics.Paint ) v3 ).setTextSize ( v4 ); // invoke-virtual {v3, v4}, Landroid/graphics/Paint;->setTextSize(F)V
/* .line 203 */
v3 = this.credits;
int v4 = 4; // const/4 v4, 0x4
/* aget-object v3, v3, v4 */
/* int-to-float v4, v4 */
v5 = this.mPaint;
v6 = this.credits;
int v7 = 4; // const/4 v7, 0x4
/* aget-object v6, v6, v7 */
v5 = (( android.graphics.Paint ) v5 ).measureText ( v6 ); // invoke-virtual {v5, v6}, Landroid/graphics/Paint;->measureText(Ljava/lang/String;)F
/* div-float/2addr v5, v9 */
/* sub-float/2addr v4, v5 */
v5 = this.text_y;
/* aget v5, v5, v11 */
/* int-to-float v5, v5 */
v6 = this.mPaint;
(( android.graphics.Canvas ) p1 ).drawText ( v3, v4, v5, v6 ); // invoke-virtual {p1, v3, v4, v5, v6}, Landroid/graphics/Canvas;->drawText(Ljava/lang/String;FFLandroid/graphics/Paint;)V
/* .line 205 */
v3 = this.mPaint;
/* const/16 v4, 0x6e */
/* const/16 v5, 0x46 */
v4 = android.graphics.Color .rgb ( v4,v5,v8 );
(( android.graphics.Paint ) v3 ).setColor ( v4 ); // invoke-virtual {v3, v4}, Landroid/graphics/Paint;->setColor(I)V
/* .line 206 */
v3 = this.mPaint;
/* iget v4, p0, Lde/nurogames/android/ticb/base/views/CreditsView;->FONT_SMALL:I */
/* int-to-float v4, v4 */
(( android.graphics.Paint ) v3 ).setTextSize ( v4 ); // invoke-virtual {v3, v4}, Landroid/graphics/Paint;->setTextSize(F)V
/* .line 207 */
v3 = this.credits;
int v4 = 5; // const/4 v4, 0x5
/* aget-object v3, v3, v4 */
/* int-to-float v4, v4 */
v5 = this.mPaint;
v6 = this.credits;
int v7 = 5; // const/4 v7, 0x5
/* aget-object v6, v6, v7 */
v5 = (( android.graphics.Paint ) v5 ).measureText ( v6 ); // invoke-virtual {v5, v6}, Landroid/graphics/Paint;->measureText(Ljava/lang/String;)F
/* div-float/2addr v5, v9 */
/* sub-float/2addr v4, v5 */
v5 = this.text_y;
/* aget v5, v5, v11 */
/* iget v6, p0, Lde/nurogames/android/ticb/base/views/CreditsView;->text_item_spacing:I */
/* add-int/2addr v5, v6 */
/* int-to-float v5, v5 */
v6 = this.mPaint;
(( android.graphics.Canvas ) p1 ).drawText ( v3, v4, v5, v6 ); // invoke-virtual {p1, v3, v4, v5, v6}, Landroid/graphics/Canvas;->drawText(Ljava/lang/String;FFLandroid/graphics/Paint;)V
/* .line 213 */
v3 = this.mPaint;
int v4 = -1; // const/4 v4, -0x1
(( android.graphics.Paint ) v3 ).setColor ( v4 ); // invoke-virtual {v3, v4}, Landroid/graphics/Paint;->setColor(I)V
/* .line 214 */
v3 = this.mPaint;
/* iget v4, p0, Lde/nurogames/android/ticb/base/views/CreditsView;->FONT_MEDIUM:I */
/* int-to-float v4, v4 */
(( android.graphics.Paint ) v3 ).setTextSize ( v4 ); // invoke-virtual {v3, v4}, Landroid/graphics/Paint;->setTextSize(F)V
/* .line 215 */
v3 = this.credits;
int v4 = 6; // const/4 v4, 0x6
/* aget-object v3, v3, v4 */
/* int-to-float v4, v4 */
v5 = this.mPaint;
v6 = this.credits;
int v7 = 6; // const/4 v7, 0x6
/* aget-object v6, v6, v7 */
v5 = (( android.graphics.Paint ) v5 ).measureText ( v6 ); // invoke-virtual {v5, v6}, Landroid/graphics/Paint;->measureText(Ljava/lang/String;)F
/* div-float/2addr v5, v9 */
/* sub-float/2addr v4, v5 */
v5 = this.text_y;
int v6 = 3; // const/4 v6, 0x3
/* aget v5, v5, v6 */
/* int-to-float v5, v5 */
v6 = this.mPaint;
(( android.graphics.Canvas ) p1 ).drawText ( v3, v4, v5, v6 ); // invoke-virtual {p1, v3, v4, v5, v6}, Landroid/graphics/Canvas;->drawText(Ljava/lang/String;FFLandroid/graphics/Paint;)V
/* .line 217 */
v3 = this.mPaint;
/* const/16 v4, 0x6e */
/* const/16 v5, 0x46 */
v4 = android.graphics.Color .rgb ( v4,v5,v8 );
(( android.graphics.Paint ) v3 ).setColor ( v4 ); // invoke-virtual {v3, v4}, Landroid/graphics/Paint;->setColor(I)V
/* .line 218 */
v3 = this.mPaint;
/* iget v4, p0, Lde/nurogames/android/ticb/base/views/CreditsView;->FONT_SMALL:I */
/* int-to-float v4, v4 */
(( android.graphics.Paint ) v3 ).setTextSize ( v4 ); // invoke-virtual {v3, v4}, Landroid/graphics/Paint;->setTextSize(F)V
/* .line 219 */
v3 = this.credits;
int v4 = 7; // const/4 v4, 0x7
/* aget-object v3, v3, v4 */
/* int-to-float v4, v4 */
v5 = this.mPaint;
v6 = this.credits;
int v7 = 7; // const/4 v7, 0x7
/* aget-object v6, v6, v7 */
v5 = (( android.graphics.Paint ) v5 ).measureText ( v6 ); // invoke-virtual {v5, v6}, Landroid/graphics/Paint;->measureText(Ljava/lang/String;)F
/* div-float/2addr v5, v9 */
/* sub-float/2addr v4, v5 */
v5 = this.text_y;
int v6 = 3; // const/4 v6, 0x3
/* aget v5, v5, v6 */
/* iget v6, p0, Lde/nurogames/android/ticb/base/views/CreditsView;->text_item_spacing:I */
/* add-int/2addr v5, v6 */
/* int-to-float v5, v5 */
v6 = this.mPaint;
(( android.graphics.Canvas ) p1 ).drawText ( v3, v4, v5, v6 ); // invoke-virtual {p1, v3, v4, v5, v6}, Landroid/graphics/Canvas;->drawText(Ljava/lang/String;FFLandroid/graphics/Paint;)V
/* .line 225 */
v3 = this.mPaint;
int v4 = -1; // const/4 v4, -0x1
(( android.graphics.Paint ) v3 ).setColor ( v4 ); // invoke-virtual {v3, v4}, Landroid/graphics/Paint;->setColor(I)V
/* .line 226 */
v3 = this.mPaint;
/* iget v4, p0, Lde/nurogames/android/ticb/base/views/CreditsView;->FONT_MEDIUM:I */
/* int-to-float v4, v4 */
(( android.graphics.Paint ) v3 ).setTextSize ( v4 ); // invoke-virtual {v3, v4}, Landroid/graphics/Paint;->setTextSize(F)V
/* .line 227 */
v3 = this.credits;
/* const/16 v4, 0x8 */
/* aget-object v3, v3, v4 */
/* int-to-float v4, v4 */
v5 = this.mPaint;
v6 = this.credits;
/* const/16 v7, 0x8 */
/* aget-object v6, v6, v7 */
v5 = (( android.graphics.Paint ) v5 ).measureText ( v6 ); // invoke-virtual {v5, v6}, Landroid/graphics/Paint;->measureText(Ljava/lang/String;)F
/* div-float/2addr v5, v9 */
/* sub-float/2addr v4, v5 */
v5 = this.text_y;
int v6 = 4; // const/4 v6, 0x4
/* aget v5, v5, v6 */
/* int-to-float v5, v5 */
v6 = this.mPaint;
(( android.graphics.Canvas ) p1 ).drawText ( v3, v4, v5, v6 ); // invoke-virtual {p1, v3, v4, v5, v6}, Landroid/graphics/Canvas;->drawText(Ljava/lang/String;FFLandroid/graphics/Paint;)V
/* .line 229 */
v3 = this.mPaint;
/* const/16 v4, 0x6e */
/* const/16 v5, 0x46 */
v4 = android.graphics.Color .rgb ( v4,v5,v8 );
(( android.graphics.Paint ) v3 ).setColor ( v4 ); // invoke-virtual {v3, v4}, Landroid/graphics/Paint;->setColor(I)V
/* .line 230 */
v3 = this.mPaint;
/* iget v4, p0, Lde/nurogames/android/ticb/base/views/CreditsView;->FONT_SMALL:I */
/* int-to-float v4, v4 */
(( android.graphics.Paint ) v3 ).setTextSize ( v4 ); // invoke-virtual {v3, v4}, Landroid/graphics/Paint;->setTextSize(F)V
/* .line 231 */
v3 = this.credits;
/* const/16 v4, 0x9 */
/* aget-object v3, v3, v4 */
/* int-to-float v4, v4 */
v5 = this.mPaint;
v6 = this.credits;
/* const/16 v7, 0x9 */
/* aget-object v6, v6, v7 */
v5 = (( android.graphics.Paint ) v5 ).measureText ( v6 ); // invoke-virtual {v5, v6}, Landroid/graphics/Paint;->measureText(Ljava/lang/String;)F
/* div-float/2addr v5, v9 */
/* sub-float/2addr v4, v5 */
v5 = this.text_y;
int v6 = 4; // const/4 v6, 0x4
/* aget v5, v5, v6 */
/* iget v6, p0, Lde/nurogames/android/ticb/base/views/CreditsView;->text_item_spacing:I */
/* add-int/2addr v5, v6 */
/* int-to-float v5, v5 */
v6 = this.mPaint;
(( android.graphics.Canvas ) p1 ).drawText ( v3, v4, v5, v6 ); // invoke-virtual {p1, v3, v4, v5, v6}, Landroid/graphics/Canvas;->drawText(Ljava/lang/String;FFLandroid/graphics/Paint;)V
/* .line 236 */
v3 = this.back;
(( de.nurogames.android.ticb.base.objects.objMenuButton ) v3 ).onDraw ( p1 ); // invoke-virtual {v3, p1}, Lde/nurogames/android/ticb/base/objects/objMenuButton;->onDraw(Landroid/graphics/Canvas;)V
/* .line 239 */
v3 = de.nurogames.android.ticb.base.core.AppResources.sHumanReadableLanguages;
/* aget-object v3, v3, v4 */
/* const/high16 v4, 0x41a00000 # 20.0f */
v5 = this.mPaint;
(( android.graphics.Canvas ) p1 ).drawText ( v3, v9, v4, v5 ); // invoke-virtual {p1, v3, v9, v4, v5}, Landroid/graphics/Canvas;->drawText(Ljava/lang/String;FFLandroid/graphics/Paint;)V
/* .line 241 */
final String v1 = "OpenFeint v1.10.2"; // const-string v1, "OpenFeint v1.10.2"
/* .line 242 */
/* .local v1, "OF_VERSION":Ljava/lang/String; */
/* int-to-float v3, v3 */
v4 = this.mPaint;
v4 = (( android.graphics.Paint ) v4 ).measureText ( v1 ); // invoke-virtual {v4, v1}, Landroid/graphics/Paint;->measureText(Ljava/lang/String;)F
/* sub-float/2addr v3, v4 */
/* const/high16 v4, 0x40c00000 # 6.0f */
/* sub-float/2addr v3, v4 */
/* add-int/lit8 v4, v4, -0x6 */
/* iget v5, p0, Lde/nurogames/android/ticb/base/views/CreditsView;->FONT_MEDIUM:I */
/* mul-int/lit8 v5, v5, 0x1 */
/* sub-int/2addr v4, v5 */
/* int-to-float v4, v4 */
v5 = this.mPaint;
(( android.graphics.Canvas ) p1 ).drawText ( v1, v3, v4, v5 ); // invoke-virtual {p1, v1, v3, v4, v5}, Landroid/graphics/Canvas;->drawText(Ljava/lang/String;FFLandroid/graphics/Paint;)V
/* .line 243 */
final String v2 = "PocketChange v5.3.1"; // const-string v2, "PocketChange v5.3.1"
/* .line 244 */
/* .local v2, "PC_VERSION":Ljava/lang/String; */
/* int-to-float v3, v3 */
v4 = this.mPaint;
v4 = (( android.graphics.Paint ) v4 ).measureText ( v2 ); // invoke-virtual {v4, v2}, Landroid/graphics/Paint;->measureText(Ljava/lang/String;)F
/* sub-float/2addr v3, v4 */
/* const/high16 v4, 0x40c00000 # 6.0f */
/* sub-float/2addr v3, v4 */
/* add-int/lit8 v4, v4, -0x6 */
/* iget v5, p0, Lde/nurogames/android/ticb/base/views/CreditsView;->FONT_MEDIUM:I */
/* mul-int/lit8 v5, v5, 0x2 */
/* sub-int/2addr v4, v5 */
/* int-to-float v4, v4 */
v5 = this.mPaint;
(( android.graphics.Canvas ) p1 ).drawText ( v2, v3, v4, v5 ); // invoke-virtual {p1, v2, v3, v4, v5}, Landroid/graphics/Canvas;->drawText(Ljava/lang/String;FFLandroid/graphics/Paint;)V
/* .line 245 */
/* if-nez v3, :cond_0 */
/* .line 246 */
final String v0 = "MobClix v4.0.1"; // const-string v0, "MobClix v4.0.1"
/* .line 247 */
/* .local v0, "ADS_VERSION":Ljava/lang/String; */
/* int-to-float v3, v3 */
v4 = this.mPaint;
v4 = (( android.graphics.Paint ) v4 ).measureText ( v0 ); // invoke-virtual {v4, v0}, Landroid/graphics/Paint;->measureText(Ljava/lang/String;)F
/* sub-float/2addr v3, v4 */
/* const/high16 v4, 0x40c00000 # 6.0f */
/* sub-float/2addr v3, v4 */
/* add-int/lit8 v4, v4, -0x6 */
/* iget v5, p0, Lde/nurogames/android/ticb/base/views/CreditsView;->FONT_MEDIUM:I */
/* mul-int/lit8 v5, v5, 0x3 */
/* sub-int/2addr v4, v5 */
/* int-to-float v4, v4 */
v5 = this.mPaint;
(( android.graphics.Canvas ) p1 ).drawText ( v0, v3, v4, v5 ); // invoke-virtual {p1, v0, v3, v4, v5}, Landroid/graphics/Canvas;->drawText(Ljava/lang/String;FFLandroid/graphics/Paint;)V
/* .line 251 */
} // .end local v0 # "ADS_VERSION":Ljava/lang/String;
} // :cond_0
v3 = this.version;
/* int-to-float v4, v4 */
v5 = this.mPaint;
v6 = this.version;
v5 = (( android.graphics.Paint ) v5 ).measureText ( v6 ); // invoke-virtual {v5, v6}, Landroid/graphics/Paint;->measureText(Ljava/lang/String;)F
/* sub-float/2addr v4, v5 */
/* const/high16 v5, 0x40c00000 # 6.0f */
/* sub-float/2addr v4, v5 */
/* add-int/lit8 v5, v5, -0x6 */
/* int-to-float v5, v5 */
v6 = this.mPaint;
(( android.graphics.Canvas ) p1 ).drawText ( v3, v4, v5, v6 ); // invoke-virtual {p1, v3, v4, v5, v6}, Landroid/graphics/Canvas;->drawText(Ljava/lang/String;FFLandroid/graphics/Paint;)V
/* .line 253 */
return;
} // .end method
public void setState ( Integer p0 ) {
/* .locals 1 */
/* .param p1, "state" # I */
/* .prologue */
/* .line 387 */
/* iput p1, p0, Lde/nurogames/android/ticb/base/views/CreditsView;->mMode:I */
/* .line 388 */
int v0 = 1; // const/4 v0, 0x1
/* if-ne p1, v0, :cond_0 */
/* .line 389 */
(( de.nurogames.android.ticb.base.views.CreditsView ) p0 ).initView ( ); // invoke-virtual {p0}, Lde/nurogames/android/ticb/base/views/CreditsView;->initView()V
/* .line 390 */
de.nurogames.android.ticb.base.core.AppResources .switchMusic_MenuToCredits ( );
/* .line 391 */
(( de.nurogames.android.ticb.base.views.CreditsView ) p0 ).update ( ); // invoke-virtual {p0}, Lde/nurogames/android/ticb/base/views/CreditsView;->update()V
/* .line 393 */
} // :cond_0
return;
} // .end method
public void update ( ) {
/* .locals 3 */
/* .prologue */
/* .line 261 */
/* iget v0, p0, Lde/nurogames/android/ticb/base/views/CreditsView;->mMode:I */
int v1 = 1; // const/4 v1, 0x1
/* if-ne v0, v1, :cond_0 */
/* .line 264 */
v0 = this.background;
(( de.nurogames.android.ticb.base.objects.objAnimMenuBackground ) v0 ).animate ( ); // invoke-virtual {v0}, Lde/nurogames/android/ticb/base/objects/objAnimMenuBackground;->animate()V
/* .line 267 */
v0 = this.mRedrawHandler;
/* const-wide/16 v1, 0x19 */
(( de.nurogames.android.ticb.base.views.CreditsView$RefreshHandler ) v0 ).sleep ( v1, v2 ); // invoke-virtual {v0, v1, v2}, Lde/nurogames/android/ticb/base/views/CreditsView$RefreshHandler;->sleep(J)V
/* .line 269 */
} // :cond_0
return;
} // .end method
