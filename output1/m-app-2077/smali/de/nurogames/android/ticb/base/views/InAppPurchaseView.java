public class de.nurogames.android.ticb.base.views.InAppPurchaseView extends de.nurogames.android.ticb.base.views.ViewPlus {
	 /* .source "InAppPurchaseView.java" */
	 /* # annotations */
	 /* .annotation system Ldalvik/annotation/MemberClasses; */
	 /* value = { */
	 /* Lde/nurogames/android/ticb/base/views/InAppPurchaseView$MyOnTouchListener;, */
	 /* Lde/nurogames/android/ticb/base/views/InAppPurchaseView$RefreshHandler; */
	 /* } */
} // .end annotation
/* # instance fields */
private Integer FONT_SIZE;
private de.nurogames.android.ticb.base.objects.objMenuButton back;
private de.nurogames.android.ticb.base.objects.objAnimMenuBackground background;
private de.nurogames.android.ticb.base.objects.objInAppPurchaseList iapl;
private Integer mMode;
private android.graphics.Paint mPaint;
private de.nurogames.android.ticb.base.views.InAppPurchaseView$RefreshHandler mRedrawHandler;
private Float touch_moving_delay;
/* # direct methods */
public de.nurogames.android.ticb.base.views.InAppPurchaseView ( ) {
	 /* .locals 2 */
	 /* .param p1, "context" # Landroid/content/Context; */
	 /* .param p2, "attrs" # Landroid/util/AttributeSet; */
	 /* .prologue */
	 int v1 = 0; // const/4 v1, 0x0
	 /* .line 66 */
	 /* invoke-direct {p0, p1}, Lde/nurogames/android/ticb/base/views/ViewPlus;-><init>(Landroid/content/Context;)V */
	 /* .line 37 */
	 /* iput v1, p0, Lde/nurogames/android/ticb/base/views/InAppPurchaseView;->mMode:I */
	 /* .line 40 */
	 /* new-instance v0, Lde/nurogames/android/ticb/base/views/InAppPurchaseView$RefreshHandler; */
	 /* invoke-direct {v0, p0}, Lde/nurogames/android/ticb/base/views/InAppPurchaseView$RefreshHandler;-><init>(Lde/nurogames/android/ticb/base/views/InAppPurchaseView;)V */
	 this.mRedrawHandler = v0;
	 /* .line 51 */
	 /* new-instance v0, Landroid/graphics/Paint; */
	 /* invoke-direct {v0}, Landroid/graphics/Paint;-><init>()V */
	 this.mPaint = v0;
	 /* .line 53 */
	 /* iput v1, p0, Lde/nurogames/android/ticb/base/views/InAppPurchaseView;->FONT_SIZE:I */
	 /* .line 55 */
	 /* const/high16 v0, 0x40200000 # 2.5f */
	 /* iput v0, p0, Lde/nurogames/android/ticb/base/views/InAppPurchaseView;->touch_moving_delay:F */
	 /* .line 67 */
	 return;
} // .end method
static de.nurogames.android.ticb.base.objects.objMenuButton access$0 ( de.nurogames.android.ticb.base.views.InAppPurchaseView p0 ) { //synthethic
	 /* .locals 1 */
	 /* .prologue */
	 /* .line 43 */
	 v0 = this.back;
} // .end method
static de.nurogames.android.ticb.base.objects.objInAppPurchaseList access$1 ( de.nurogames.android.ticb.base.views.InAppPurchaseView p0 ) { //synthethic
	 /* .locals 1 */
	 /* .prologue */
	 /* .line 49 */
	 v0 = this.iapl;
} // .end method
static void access$2 ( de.nurogames.android.ticb.base.views.InAppPurchaseView p0, Integer p1 ) { //synthethic
	 /* .locals 0 */
	 /* .prologue */
	 /* .line 286 */
	 /* invoke-direct {p0, p1}, Lde/nurogames/android/ticb/base/views/InAppPurchaseView;->itemClicked(I)V */
	 return;
} // .end method
static Float access$3 ( de.nurogames.android.ticb.base.views.InAppPurchaseView p0 ) { //synthethic
	 /* .locals 1 */
	 /* .prologue */
	 /* .line 55 */
	 /* iget v0, p0, Lde/nurogames/android/ticb/base/views/InAppPurchaseView;->touch_moving_delay:F */
} // .end method
private void itemClicked ( Integer p0 ) {
	 /* .locals 14 */
	 /* .param p1, "itemID" # I */
	 /* .prologue */
	 int v13 = 6; // const/4 v13, 0x6
	 /* const/high16 v12, 0x42c00000 # 96.0f */
	 int v11 = 5; // const/4 v11, 0x5
	 int v10 = 4; // const/4 v10, 0x4
	 int v9 = 0; // const/4 v9, 0x0
	 /* .line 288 */
	 v6 = java.lang.System.out;
	 /* new-instance v7, Ljava/lang/StringBuilder; */
	 final String v8 = "is this item owned? = "; // const-string v8, "is this item owned? = "
	 /* invoke-direct {v7, v8}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V */
	 v8 = de.nurogames.android.ticb.base.core.InAppMngr.owned;
	 /* aget-boolean v8, v8, p1 */
	 (( java.lang.StringBuilder ) v7 ).append ( v8 ); // invoke-virtual {v7, v8}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;
	 (( java.lang.StringBuilder ) v7 ).toString ( ); // invoke-virtual {v7}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
	 (( java.io.PrintStream ) v6 ).println ( v7 ); // invoke-virtual {v6, v7}, Ljava/io/PrintStream;->println(Ljava/lang/String;)V
	 /* .line 291 */
	 v6 = de.nurogames.android.ticb.base.core.InAppMngr.owned;
	 /* aget-boolean v6, v6, p1 */
	 /* if-nez v6, :cond_5 */
	 /* .line 293 */
	 v6 = de.nurogames.android.ticb.base.tinysanta.cntx;
	 v7 = de.nurogames.android.ticb.base.tinysanta.CATALOG;
	 /* add-int/lit8 v8, p1, -0x1 */
	 /* aget-object v7, v7, v8 */
	 /* iget v7, v7, Lde/nurogames/android/ticb/base/tinysanta$CatalogEntry;->nameId:I */
	 (( android.content.Context ) v6 ).getString ( v7 ); // invoke-virtual {v6, v7}, Landroid/content/Context;->getString(I)Ljava/lang/String;
	 /* .line 294 */
	 /* .local v2, "item_name":Ljava/lang/String; */
	 v6 = de.nurogames.android.ticb.base.tinysanta.CATALOG;
	 /* add-int/lit8 v7, p1, -0x1 */
	 /* aget-object v6, v6, v7 */
	 v3 = this.sku;
	 /* .line 296 */
	 /* .local v3, "item_sku":Ljava/lang/String; */
	 /* new-instance v1, Landroid/app/Dialog; */
	 (( de.nurogames.android.ticb.base.views.InAppPurchaseView ) p0 ).getContext ( ); // invoke-virtual {p0}, Lde/nurogames/android/ticb/base/views/InAppPurchaseView;->getContext()Landroid/content/Context;
	 /* invoke-direct {v1, v6}, Landroid/app/Dialog;-><init>(Landroid/content/Context;)V */
	 /* .line 297 */
	 /* .local v1, "dialog":Landroid/app/Dialog; */
	 (( android.app.Dialog ) v1 ).setContentView ( v6 ); // invoke-virtual {v1, v6}, Landroid/app/Dialog;->setContentView(I)V
	 /* .line 298 */
	 /* new-instance v6, Ljava/lang/StringBuilder; */
	 final String v7 = "Info: "; // const-string v7, "Info: "
	 /* invoke-direct {v6, v7}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V */
	 (( java.lang.StringBuilder ) v6 ).append ( v2 ); // invoke-virtual {v6, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
	 (( java.lang.StringBuilder ) v6 ).toString ( ); // invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
	 (( android.app.Dialog ) v1 ).setTitle ( v6 ); // invoke-virtual {v1, v6}, Landroid/app/Dialog;->setTitle(Ljava/lang/CharSequence;)V
	 /* .line 299 */
	 (( android.app.Dialog ) v1 ).show ( ); // invoke-virtual {v1}, Landroid/app/Dialog;->show()V
	 /* .line 301 */
	 (( android.app.Dialog ) v1 ).findViewById ( v6 ); // invoke-virtual {v1, v6}, Landroid/app/Dialog;->findViewById(I)Landroid/view/View;
	 /* check-cast v5, Landroid/widget/TextView; */
	 /* .line 303 */
	 /* .local v5, "purchase_info":Landroid/widget/TextView; */
	 /* if-ge p1, v10, :cond_2 */
	 /* .line 304 */
	 (( de.nurogames.android.ticb.base.views.InAppPurchaseView ) p0 ).getResources ( ); // invoke-virtual {p0}, Lde/nurogames/android/ticb/base/views/InAppPurchaseView;->getResources()Landroid/content/res/Resources;
	 (( android.content.res.Resources ) v6 ).getStringArray ( v7 ); // invoke-virtual {v6, v7}, Landroid/content/res/Resources;->getStringArray(I)[Ljava/lang/String;
	 /* aget-object v6, v6, v7 */
	 (( android.widget.TextView ) v5 ).setText ( v6 ); // invoke-virtual {v5, v6}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V
	 /* .line 312 */
} // :cond_0
} // :goto_0
(( android.app.Dialog ) v1 ).findViewById ( v6 ); // invoke-virtual {v1, v6}, Landroid/app/Dialog;->findViewById(I)Landroid/view/View;
/* check-cast v0, Landroid/widget/Button; */
/* .line 315 */
/* .local v0, "btnGoogleMarket":Landroid/widget/Button; */
/* new-instance v6, Landroid/widget/LinearLayout$LayoutParams; */
/* .line 316 */
v7 = de.nurogames.android.ticb.base.tinysanta.sMetrics;
/* iget v7, v7, Landroid/util/DisplayMetrics;->density:F */
/* mul-float/2addr v7, v12 */
/* float-to-int v7, v7 */
/* .line 317 */
v8 = de.nurogames.android.ticb.base.tinysanta.sMetrics;
/* iget v8, v8, Landroid/util/DisplayMetrics;->density:F */
/* mul-float/2addr v8, v12 */
/* float-to-int v8, v8 */
/* .line 315 */
/* invoke-direct {v6, v7, v8}, Landroid/widget/LinearLayout$LayoutParams;-><init>(II)V */
/* .line 314 */
(( android.widget.Button ) v0 ).setLayoutParams ( v6 ); // invoke-virtual {v0, v6}, Landroid/widget/Button;->setLayoutParams(Landroid/view/ViewGroup$LayoutParams;)V
/* .line 319 */
/* new-instance v6, Lde/nurogames/android/ticb/base/views/InAppPurchaseView$1; */
/* invoke-direct {v6, p0, v2, v3, v1}, Lde/nurogames/android/ticb/base/views/InAppPurchaseView$1;-><init>(Lde/nurogames/android/ticb/base/views/InAppPurchaseView;Ljava/lang/String;Ljava/lang/String;Landroid/app/Dialog;)V */
(( android.widget.Button ) v0 ).setOnClickListener ( v6 ); // invoke-virtual {v0, v6}, Landroid/widget/Button;->setOnClickListener(Landroid/view/View$OnClickListener;)V
/* .line 332 */
(( android.app.Dialog ) v1 ).findViewById ( v6 ); // invoke-virtual {v1, v6}, Landroid/app/Dialog;->findViewById(I)Landroid/view/View;
/* check-cast v4, Landroid/widget/TextView; */
/* .line 333 */
/* .local v4, "price2":Landroid/widget/TextView; */
v6 = de.nurogames.android.ticb.base.core.InAppMngr.item_price_real;
/* aget-object v6, v6, p1 */
(( android.widget.TextView ) v4 ).setText ( v6 ); // invoke-virtual {v4, v6}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V
/* .line 396 */
} // .end local v0 # "btnGoogleMarket":Landroid/widget/Button;
} // .end local v1 # "dialog":Landroid/app/Dialog;
} // .end local v2 # "item_name":Ljava/lang/String;
} // .end local v3 # "item_sku":Ljava/lang/String;
} // .end local v4 # "price2":Landroid/widget/TextView;
} // .end local v5 # "purchase_info":Landroid/widget/TextView;
} // :cond_1
} // :goto_1
return;
/* .line 305 */
/* .restart local v1 # "dialog":Landroid/app/Dialog; */
/* .restart local v2 # "item_name":Ljava/lang/String; */
/* .restart local v3 # "item_sku":Ljava/lang/String; */
/* .restart local v5 # "purchase_info":Landroid/widget/TextView; */
} // :cond_2
/* if-ne p1, v10, :cond_3 */
/* .line 306 */
(( de.nurogames.android.ticb.base.views.InAppPurchaseView ) p0 ).getResources ( ); // invoke-virtual {p0}, Lde/nurogames/android/ticb/base/views/InAppPurchaseView;->getResources()Landroid/content/res/Resources;
(( android.content.res.Resources ) v6 ).getStringArray ( v7 ); // invoke-virtual {v6, v7}, Landroid/content/res/Resources;->getStringArray(I)[Ljava/lang/String;
/* aget-object v6, v6, v7 */
(( android.widget.TextView ) v5 ).setText ( v6 ); // invoke-virtual {v5, v6}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V
/* .line 307 */
} // :cond_3
/* if-ne p1, v11, :cond_4 */
/* .line 308 */
(( de.nurogames.android.ticb.base.views.InAppPurchaseView ) p0 ).getResources ( ); // invoke-virtual {p0}, Lde/nurogames/android/ticb/base/views/InAppPurchaseView;->getResources()Landroid/content/res/Resources;
(( android.content.res.Resources ) v6 ).getStringArray ( v7 ); // invoke-virtual {v6, v7}, Landroid/content/res/Resources;->getStringArray(I)[Ljava/lang/String;
/* aget-object v6, v6, v7 */
(( android.widget.TextView ) v5 ).setText ( v6 ); // invoke-virtual {v5, v6}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V
/* .line 309 */
} // :cond_4
/* if-ne p1, v13, :cond_0 */
/* .line 310 */
(( de.nurogames.android.ticb.base.views.InAppPurchaseView ) p0 ).getResources ( ); // invoke-virtual {p0}, Lde/nurogames/android/ticb/base/views/InAppPurchaseView;->getResources()Landroid/content/res/Resources;
(( android.content.res.Resources ) v6 ).getStringArray ( v7 ); // invoke-virtual {v6, v7}, Landroid/content/res/Resources;->getStringArray(I)[Ljava/lang/String;
/* aget-object v6, v6, v7 */
(( android.widget.TextView ) v5 ).setText ( v6 ); // invoke-virtual {v5, v6}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V
/* .line 338 */
} // .end local v1 # "dialog":Landroid/app/Dialog;
} // .end local v2 # "item_name":Ljava/lang/String;
} // .end local v3 # "item_sku":Ljava/lang/String;
} // .end local v5 # "purchase_info":Landroid/widget/TextView;
} // :cond_5
int v6 = 3; // const/4 v6, 0x3
/* if-gt p1, v6, :cond_a */
/* .line 340 */
/* .line 341 */
/* .line 344 */
/* if-eq v6, v7, :cond_6 */
/* .line 346 */
/* if-ne v6, v7, :cond_7 */
/* .line 349 */
} // :cond_6
int v6 = 2; // const/4 v6, 0x2
de.nurogames.android.ticb.base.core.AppResources .loadBeeStyle ( v6,v7 );
/* .line 367 */
} // :goto_2
de.nurogames.android.ticb.base.objects.objBee .generateRotations ( );
/* .line 352 */
} // :cond_7
/* if-ne v6, v7, :cond_8 */
/* .line 355 */
int v6 = 1; // const/4 v6, 0x1
de.nurogames.android.ticb.base.core.AppResources .loadBeeStyle ( v6,v7 );
/* .line 358 */
} // :cond_8
/* if-lt v6, v7, :cond_9 */
/* .line 361 */
de.nurogames.android.ticb.base.core.AppResources .loadBeeStyle ( v9,v6 );
/* .line 364 */
} // :cond_9
de.nurogames.android.ticb.base.core.AppResources .loadBeeStyle ( v9,v6 );
/* .line 372 */
} // :cond_a
/* if-ne p1, v10, :cond_b */
/* .line 374 */
v6 = de.nurogames.android.ticb.base.core.InAppMngr.owned;
/* aget-boolean v6, v6, v11 */
/* if-nez v6, :cond_d */
/* .line 375 */
v6 = de.nurogames.android.ticb.base.tinysanta.cntx;
(( de.nurogames.android.ticb.base.views.InAppPurchaseView ) p0 ).getResources ( ); // invoke-virtual {p0}, Lde/nurogames/android/ticb/base/views/InAppPurchaseView;->getResources()Landroid/content/res/Resources;
(( android.content.res.Resources ) v7 ).getStringArray ( v8 ); // invoke-virtual {v7, v8}, Landroid/content/res/Resources;->getStringArray(I)[Ljava/lang/String;
/* aget-object v7, v7, v8 */
(( java.lang.String ) v7 ).toString ( ); // invoke-virtual {v7}, Ljava/lang/String;->toString()Ljava/lang/String;
android.widget.Toast .makeText ( v6,v7,v9 );
(( android.widget.Toast ) v6 ).show ( ); // invoke-virtual {v6}, Landroid/widget/Toast;->show()V
/* .line 380 */
} // :cond_b
} // :goto_3
/* if-ne p1, v11, :cond_c */
/* .line 382 */
v6 = de.nurogames.android.ticb.base.core.InAppMngr.owned;
/* aget-boolean v6, v6, v10 */
/* if-nez v6, :cond_e */
/* .line 383 */
v6 = de.nurogames.android.ticb.base.tinysanta.cntx;
(( de.nurogames.android.ticb.base.views.InAppPurchaseView ) p0 ).getResources ( ); // invoke-virtual {p0}, Lde/nurogames/android/ticb/base/views/InAppPurchaseView;->getResources()Landroid/content/res/Resources;
(( android.content.res.Resources ) v7 ).getStringArray ( v8 ); // invoke-virtual {v7, v8}, Landroid/content/res/Resources;->getStringArray(I)[Ljava/lang/String;
/* aget-object v7, v7, v8 */
(( java.lang.String ) v7 ).toString ( ); // invoke-virtual {v7}, Ljava/lang/String;->toString()Ljava/lang/String;
android.widget.Toast .makeText ( v6,v7,v9 );
(( android.widget.Toast ) v6 ).show ( ); // invoke-virtual {v6}, Landroid/widget/Toast;->show()V
/* .line 388 */
} // :cond_c
} // :goto_4
/* if-ne p1, v13, :cond_1 */
/* .line 390 */
v6 = de.nurogames.android.ticb.base.tinysanta.cntx;
(( de.nurogames.android.ticb.base.views.InAppPurchaseView ) p0 ).getResources ( ); // invoke-virtual {p0}, Lde/nurogames/android/ticb/base/views/InAppPurchaseView;->getResources()Landroid/content/res/Resources;
(( android.content.res.Resources ) v7 ).getStringArray ( v8 ); // invoke-virtual {v7, v8}, Landroid/content/res/Resources;->getStringArray(I)[Ljava/lang/String;
/* aget-object v7, v7, v8 */
(( java.lang.String ) v7 ).toString ( ); // invoke-virtual {v7}, Ljava/lang/String;->toString()Ljava/lang/String;
android.widget.Toast .makeText ( v6,v7,v9 );
(( android.widget.Toast ) v6 ).show ( ); // invoke-virtual {v6}, Landroid/widget/Toast;->show()V
/* goto/16 :goto_1 */
/* .line 378 */
} // :cond_d
v6 = de.nurogames.android.ticb.base.tinysanta.cntx;
(( de.nurogames.android.ticb.base.views.InAppPurchaseView ) p0 ).getResources ( ); // invoke-virtual {p0}, Lde/nurogames/android/ticb/base/views/InAppPurchaseView;->getResources()Landroid/content/res/Resources;
(( android.content.res.Resources ) v7 ).getStringArray ( v8 ); // invoke-virtual {v7, v8}, Landroid/content/res/Resources;->getStringArray(I)[Ljava/lang/String;
/* aget-object v7, v7, v8 */
(( java.lang.String ) v7 ).toString ( ); // invoke-virtual {v7}, Ljava/lang/String;->toString()Ljava/lang/String;
android.widget.Toast .makeText ( v6,v7,v9 );
(( android.widget.Toast ) v6 ).show ( ); // invoke-virtual {v6}, Landroid/widget/Toast;->show()V
/* .line 386 */
} // :cond_e
v6 = de.nurogames.android.ticb.base.tinysanta.cntx;
(( de.nurogames.android.ticb.base.views.InAppPurchaseView ) p0 ).getResources ( ); // invoke-virtual {p0}, Lde/nurogames/android/ticb/base/views/InAppPurchaseView;->getResources()Landroid/content/res/Resources;
(( android.content.res.Resources ) v7 ).getStringArray ( v8 ); // invoke-virtual {v7, v8}, Landroid/content/res/Resources;->getStringArray(I)[Ljava/lang/String;
/* aget-object v7, v7, v8 */
(( java.lang.String ) v7 ).toString ( ); // invoke-virtual {v7}, Ljava/lang/String;->toString()Ljava/lang/String;
android.widget.Toast .makeText ( v6,v7,v9 );
(( android.widget.Toast ) v6 ).show ( ); // invoke-virtual {v6}, Landroid/widget/Toast;->show()V
} // .end method
/* # virtual methods */
public Integer getState ( ) {
/* .locals 1 */
/* .prologue */
/* .line 424 */
/* iget v0, p0, Lde/nurogames/android/ticb/base/views/InAppPurchaseView;->mMode:I */
} // .end method
public void initView ( ) {
/* .locals 11 */
/* .prologue */
/* const/16 v10, 0x10 */
/* const v9, 0x40333333 # 2.8f */
/* const v8, 0x400ccccd # 2.2f */
int v7 = 1; // const/4 v7, 0x1
int v2 = 0; // const/4 v2, 0x0
/* .line 74 */
(( de.nurogames.android.ticb.base.views.InAppPurchaseView ) p0 ).setFocusable ( v7 ); // invoke-virtual {p0, v7}, Lde/nurogames/android/ticb/base/views/InAppPurchaseView;->setFocusable(Z)V
/* .line 76 */
/* new-instance v6, Lde/nurogames/android/ticb/base/views/InAppPurchaseView$MyOnTouchListener; */
/* invoke-direct {v6, p0}, Lde/nurogames/android/ticb/base/views/InAppPurchaseView$MyOnTouchListener;-><init>(Lde/nurogames/android/ticb/base/views/InAppPurchaseView;)V */
/* .line 77 */
/* .local v6, "tlistn":Lde/nurogames/android/ticb/base/views/InAppPurchaseView$MyOnTouchListener; */
(( de.nurogames.android.ticb.base.views.InAppPurchaseView ) p0 ).setOnTouchListener ( v6 ); // invoke-virtual {p0, v6}, Lde/nurogames/android/ticb/base/views/InAppPurchaseView;->setOnTouchListener(Landroid/view/View$OnTouchListener;)V
/* .line 79 */
/* new-instance v0, Lde/nurogames/android/ticb/base/objects/objMenuButton; */
int v1 = 0; // const/4 v1, 0x0
/* .line 81 */
v4 = de.nurogames.android.ticb.base.core.AppResources.imgMenu_back;
/* aget-object v4, v4, v2 */
v4 = (( android.graphics.Bitmap ) v4 ).getHeight ( ); // invoke-virtual {v4}, Landroid/graphics/Bitmap;->getHeight()I
/* sub-int/2addr v3, v4 */
/* .line 82 */
v4 = de.nurogames.android.ticb.base.core.AppResources.imgMenu_back;
/* aget-object v4, v4, v2 */
/* .line 83 */
v5 = de.nurogames.android.ticb.base.core.AppResources.imgMenu_back;
/* aget-object v5, v5, v7 */
/* invoke-direct/range {v0 ..v5}, Lde/nurogames/android/ticb/base/objects/objMenuButton;-><init>(Ljava/lang/String;IILandroid/graphics/Bitmap;Landroid/graphics/Bitmap;)V */
/* .line 79 */
this.back = v0;
/* .line 85 */
/* new-instance v0, Lde/nurogames/android/ticb/base/objects/objAnimMenuBackground; */
/* invoke-direct {v0}, Lde/nurogames/android/ticb/base/objects/objAnimMenuBackground;-><init>()V */
this.background = v0;
/* .line 87 */
v0 = this.mPaint;
(( android.graphics.Paint ) v0 ).setAntiAlias ( v7 ); // invoke-virtual {v0, v7}, Landroid/graphics/Paint;->setAntiAlias(Z)V
/* .line 88 */
v0 = this.mPaint;
v1 = de.nurogames.android.ticb.base.tinysanta.cntx;
(( android.content.Context ) v1 ).getAssets ( ); // invoke-virtual {v1}, Landroid/content/Context;->getAssets()Landroid/content/res/AssetManager;
final String v2 = "font.otf"; // const-string v2, "font.otf"
android.graphics.Typeface .createFromAsset ( v1,v2 );
(( android.graphics.Paint ) v0 ).setTypeface ( v1 ); // invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setTypeface(Landroid/graphics/Typeface;)Landroid/graphics/Typeface;
/* .line 90 */
/* if-lt v0, v1, :cond_0 */
/* .line 91 */
/* iput v9, p0, Lde/nurogames/android/ticb/base/views/InAppPurchaseView;->touch_moving_delay:F */
/* .line 92 */
/* const/16 v0, 0x20 */
/* iput v0, p0, Lde/nurogames/android/ticb/base/views/InAppPurchaseView;->FONT_SIZE:I */
/* .line 107 */
} // :goto_0
/* new-instance v0, Lde/nurogames/android/ticb/base/objects/objInAppPurchaseList; */
/* invoke-direct {v0}, Lde/nurogames/android/ticb/base/objects/objInAppPurchaseList;-><init>()V */
this.iapl = v0;
/* .line 109 */
return;
/* .line 93 */
} // :cond_0
/* if-ne v0, v1, :cond_1 */
/* .line 94 */
/* const/high16 v0, 0x40200000 # 2.5f */
/* iput v0, p0, Lde/nurogames/android/ticb/base/views/InAppPurchaseView;->touch_moving_delay:F */
/* .line 95 */
/* const/16 v0, 0x14 */
/* iput v0, p0, Lde/nurogames/android/ticb/base/views/InAppPurchaseView;->FONT_SIZE:I */
/* .line 96 */
} // :cond_1
/* if-ne v0, v1, :cond_2 */
/* .line 97 */
/* iput v8, p0, Lde/nurogames/android/ticb/base/views/InAppPurchaseView;->touch_moving_delay:F */
/* .line 98 */
/* iput v10, p0, Lde/nurogames/android/ticb/base/views/InAppPurchaseView;->FONT_SIZE:I */
/* .line 99 */
} // :cond_2
/* if-ne v0, v1, :cond_3 */
/* .line 100 */
/* iput v8, p0, Lde/nurogames/android/ticb/base/views/InAppPurchaseView;->touch_moving_delay:F */
/* .line 101 */
/* iput v10, p0, Lde/nurogames/android/ticb/base/views/InAppPurchaseView;->FONT_SIZE:I */
/* .line 103 */
} // :cond_3
/* iput v9, p0, Lde/nurogames/android/ticb/base/views/InAppPurchaseView;->touch_moving_delay:F */
/* .line 104 */
/* const/16 v0, 0x20 */
/* iput v0, p0, Lde/nurogames/android/ticb/base/views/InAppPurchaseView;->FONT_SIZE:I */
} // .end method
public void onDraw ( android.graphics.Canvas p0 ) {
/* .locals 8 */
/* .param p1, "g" # Landroid/graphics/Canvas; */
/* .prologue */
/* const v7, -0xbbbbbc */
/* const/high16 v6, 0x40000000 # 2.0f */
/* const v5, 0x3f19999a # 0.6f */
/* .line 119 */
v0 = this.background;
(( de.nurogames.android.ticb.base.objects.objAnimMenuBackground ) v0 ).onDraw ( p1 ); // invoke-virtual {v0, p1}, Lde/nurogames/android/ticb/base/objects/objAnimMenuBackground;->onDraw(Landroid/graphics/Canvas;)V
/* .line 122 */
v0 = this.iapl;
(( de.nurogames.android.ticb.base.objects.objInAppPurchaseList ) v0 ).onDraw ( p1 ); // invoke-virtual {v0, p1}, Lde/nurogames/android/ticb/base/objects/objInAppPurchaseList;->onDraw(Landroid/graphics/Canvas;)V
/* .line 125 */
v0 = this.back;
(( de.nurogames.android.ticb.base.objects.objMenuButton ) v0 ).onDraw ( p1 ); // invoke-virtual {v0, p1}, Lde/nurogames/android/ticb/base/objects/objMenuButton;->onDraw(Landroid/graphics/Canvas;)V
/* .line 127 */
v0 = this.mPaint;
int v1 = -1; // const/4 v1, -0x1
(( android.graphics.Paint ) v0 ).setColor ( v1 ); // invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setColor(I)V
/* .line 128 */
v0 = this.mPaint;
/* iget v1, p0, Lde/nurogames/android/ticb/base/views/InAppPurchaseView;->FONT_SIZE:I */
/* int-to-float v1, v1 */
(( android.graphics.Paint ) v0 ).setTextSize ( v1 ); // invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setTextSize(F)V
/* .line 130 */
(( de.nurogames.android.ticb.base.views.InAppPurchaseView ) p0 ).getResources ( ); // invoke-virtual {p0}, Lde/nurogames/android/ticb/base/views/InAppPurchaseView;->getResources()Landroid/content/res/Resources;
(( android.content.res.Resources ) v0 ).getStringArray ( v1 ); // invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getStringArray(I)[Ljava/lang/String;
/* aget-object v0, v0, v1 */
(( java.lang.String ) v0 ).toString ( ); // invoke-virtual {v0}, Ljava/lang/String;->toString()Ljava/lang/String;
/* .line 131 */
/* int-to-float v1, v1 */
/* const v2, 0x3d4ccccd # 0.05f */
/* mul-float/2addr v1, v2 */
/* .line 132 */
/* int-to-float v2, v2 */
/* const v3, 0x3da3d70a # 0.08f */
/* mul-float/2addr v2, v3 */
/* .line 133 */
v3 = this.mPaint;
/* .line 129 */
(( android.graphics.Canvas ) p1 ).drawText ( v0, v1, v2, v3 ); // invoke-virtual {p1, v0, v1, v2, v3}, Landroid/graphics/Canvas;->drawText(Ljava/lang/String;FFLandroid/graphics/Paint;)V
/* .line 135 */
v0 = this.mPaint;
(( android.graphics.Paint ) v0 ).setColor ( v7 ); // invoke-virtual {v0, v7}, Landroid/graphics/Paint;->setColor(I)V
/* .line 136 */
v0 = this.mPaint;
/* iget v1, p0, Lde/nurogames/android/ticb/base/views/InAppPurchaseView;->FONT_SIZE:I */
/* int-to-float v1, v1 */
/* const/high16 v2, 0x3f400000 # 0.75f */
/* mul-float/2addr v1, v2 */
(( android.graphics.Paint ) v0 ).setTextSize ( v1 ); // invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setTextSize(F)V
/* .line 137 */
v0 = de.nurogames.android.ticb.base.tinysanta.inAppMngr;
v0 = (( de.nurogames.android.ticb.base.core.InAppMngr ) v0 ).getShopItemCount ( ); // invoke-virtual {v0}, Lde/nurogames/android/ticb/base/core/InAppMngr;->getShopItemCount()I
/* if-nez v0, :cond_0 */
/* .line 138 */
(( de.nurogames.android.ticb.base.views.InAppPurchaseView ) p0 ).getResources ( ); // invoke-virtual {p0}, Lde/nurogames/android/ticb/base/views/InAppPurchaseView;->getResources()Landroid/content/res/Resources;
(( android.content.res.Resources ) v0 ).getStringArray ( v1 ); // invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getStringArray(I)[Ljava/lang/String;
/* aget-object v0, v0, v1 */
(( java.lang.String ) v0 ).toString ( ); // invoke-virtual {v0}, Ljava/lang/String;->toString()Ljava/lang/String;
/* .line 139 */
/* int-to-float v1, v1 */
v2 = this.mPaint;
(( de.nurogames.android.ticb.base.views.InAppPurchaseView ) p0 ).getResources ( ); // invoke-virtual {p0}, Lde/nurogames/android/ticb/base/views/InAppPurchaseView;->getResources()Landroid/content/res/Resources;
(( android.content.res.Resources ) v3 ).getStringArray ( v4 ); // invoke-virtual {v3, v4}, Landroid/content/res/Resources;->getStringArray(I)[Ljava/lang/String;
/* aget-object v3, v3, v4 */
(( java.lang.String ) v3 ).toString ( ); // invoke-virtual {v3}, Ljava/lang/String;->toString()Ljava/lang/String;
v2 = (( android.graphics.Paint ) v2 ).measureText ( v3 ); // invoke-virtual {v2, v3}, Landroid/graphics/Paint;->measureText(Ljava/lang/String;)F
/* div-float/2addr v2, v6 */
/* sub-float/2addr v1, v2 */
/* .line 140 */
/* int-to-float v2, v2 */
/* .line 141 */
v3 = this.mPaint;
/* .line 138 */
(( android.graphics.Canvas ) p1 ).drawText ( v0, v1, v2, v3 ); // invoke-virtual {p1, v0, v1, v2, v3}, Landroid/graphics/Canvas;->drawText(Ljava/lang/String;FFLandroid/graphics/Paint;)V
/* .line 144 */
} // :cond_0
v0 = this.mPaint;
(( android.graphics.Paint ) v0 ).setColor ( v7 ); // invoke-virtual {v0, v7}, Landroid/graphics/Paint;->setColor(I)V
/* .line 145 */
v0 = this.mPaint;
/* iget v1, p0, Lde/nurogames/android/ticb/base/views/InAppPurchaseView;->FONT_SIZE:I */
/* int-to-float v1, v1 */
/* mul-float/2addr v1, v5 */
(( android.graphics.Paint ) v0 ).setTextSize ( v1 ); // invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setTextSize(F)V
/* .line 146 */
(( de.nurogames.android.ticb.base.views.InAppPurchaseView ) p0 ).getResources ( ); // invoke-virtual {p0}, Lde/nurogames/android/ticb/base/views/InAppPurchaseView;->getResources()Landroid/content/res/Resources;
(( android.content.res.Resources ) v0 ).getStringArray ( v1 ); // invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getStringArray(I)[Ljava/lang/String;
/* aget-object v0, v0, v1 */
(( java.lang.String ) v0 ).toString ( ); // invoke-virtual {v0}, Ljava/lang/String;->toString()Ljava/lang/String;
/* .line 147 */
/* add-int/lit8 v1, v1, -0x14 */
/* int-to-float v1, v1 */
v2 = this.mPaint;
(( de.nurogames.android.ticb.base.views.InAppPurchaseView ) p0 ).getResources ( ); // invoke-virtual {p0}, Lde/nurogames/android/ticb/base/views/InAppPurchaseView;->getResources()Landroid/content/res/Resources;
(( android.content.res.Resources ) v3 ).getStringArray ( v4 ); // invoke-virtual {v3, v4}, Landroid/content/res/Resources;->getStringArray(I)[Ljava/lang/String;
/* aget-object v3, v3, v4 */
(( java.lang.String ) v3 ).toString ( ); // invoke-virtual {v3}, Ljava/lang/String;->toString()Ljava/lang/String;
v2 = (( android.graphics.Paint ) v2 ).measureText ( v3 ); // invoke-virtual {v2, v3}, Landroid/graphics/Paint;->measureText(Ljava/lang/String;)F
/* sub-float/2addr v1, v2 */
/* .line 148 */
/* int-to-float v2, v2 */
/* iget v3, p0, Lde/nurogames/android/ticb/base/views/InAppPurchaseView;->FONT_SIZE:I */
/* int-to-float v3, v3 */
/* mul-float/2addr v3, v5 */
/* mul-float/2addr v3, v6 */
/* sub-float/2addr v2, v3 */
/* .line 149 */
v3 = this.mPaint;
/* .line 146 */
(( android.graphics.Canvas ) p1 ).drawText ( v0, v1, v2, v3 ); // invoke-virtual {p1, v0, v1, v2, v3}, Landroid/graphics/Canvas;->drawText(Ljava/lang/String;FFLandroid/graphics/Paint;)V
/* .line 151 */
(( de.nurogames.android.ticb.base.views.InAppPurchaseView ) p0 ).getResources ( ); // invoke-virtual {p0}, Lde/nurogames/android/ticb/base/views/InAppPurchaseView;->getResources()Landroid/content/res/Resources;
(( android.content.res.Resources ) v0 ).getStringArray ( v1 ); // invoke-virtual {v0, v1}, Landroid/content/res/Resources;->getStringArray(I)[Ljava/lang/String;
/* aget-object v0, v0, v1 */
(( java.lang.String ) v0 ).toString ( ); // invoke-virtual {v0}, Ljava/lang/String;->toString()Ljava/lang/String;
/* .line 152 */
/* add-int/lit8 v1, v1, -0x14 */
/* int-to-float v1, v1 */
v2 = this.mPaint;
(( de.nurogames.android.ticb.base.views.InAppPurchaseView ) p0 ).getResources ( ); // invoke-virtual {p0}, Lde/nurogames/android/ticb/base/views/InAppPurchaseView;->getResources()Landroid/content/res/Resources;
(( android.content.res.Resources ) v3 ).getStringArray ( v4 ); // invoke-virtual {v3, v4}, Landroid/content/res/Resources;->getStringArray(I)[Ljava/lang/String;
/* aget-object v3, v3, v4 */
(( java.lang.String ) v3 ).toString ( ); // invoke-virtual {v3}, Ljava/lang/String;->toString()Ljava/lang/String;
v2 = (( android.graphics.Paint ) v2 ).measureText ( v3 ); // invoke-virtual {v2, v3}, Landroid/graphics/Paint;->measureText(Ljava/lang/String;)F
/* sub-float/2addr v1, v2 */
/* .line 153 */
/* int-to-float v2, v2 */
/* iget v3, p0, Lde/nurogames/android/ticb/base/views/InAppPurchaseView;->FONT_SIZE:I */
/* int-to-float v3, v3 */
/* mul-float/2addr v3, v5 */
/* sub-float/2addr v2, v3 */
/* .line 154 */
v3 = this.mPaint;
/* .line 151 */
(( android.graphics.Canvas ) p1 ).drawText ( v0, v1, v2, v3 ); // invoke-virtual {p1, v0, v1, v2, v3}, Landroid/graphics/Canvas;->drawText(Ljava/lang/String;FFLandroid/graphics/Paint;)V
/* .line 155 */
return;
} // .end method
public void setState ( Integer p0 ) {
/* .locals 0 */
/* .param p1, "state" # I */
/* .prologue */
/* .line 417 */
/* iput p1, p0, Lde/nurogames/android/ticb/base/views/InAppPurchaseView;->mMode:I */
/* .line 418 */
(( de.nurogames.android.ticb.base.views.InAppPurchaseView ) p0 ).initView ( ); // invoke-virtual {p0}, Lde/nurogames/android/ticb/base/views/InAppPurchaseView;->initView()V
/* .line 419 */
(( de.nurogames.android.ticb.base.views.InAppPurchaseView ) p0 ).update ( ); // invoke-virtual {p0}, Lde/nurogames/android/ticb/base/views/InAppPurchaseView;->update()V
/* .line 420 */
return;
} // .end method
public void update ( ) {
/* .locals 3 */
/* .prologue */
/* .line 163 */
/* iget v0, p0, Lde/nurogames/android/ticb/base/views/InAppPurchaseView;->mMode:I */
int v1 = 1; // const/4 v1, 0x1
/* if-ne v0, v1, :cond_0 */
/* .line 166 */
v0 = this.background;
(( de.nurogames.android.ticb.base.objects.objAnimMenuBackground ) v0 ).animate ( ); // invoke-virtual {v0}, Lde/nurogames/android/ticb/base/objects/objAnimMenuBackground;->animate()V
/* .line 169 */
v0 = this.mRedrawHandler;
/* const-wide/16 v1, 0x19 */
(( de.nurogames.android.ticb.base.views.InAppPurchaseView$RefreshHandler ) v0 ).sleep ( v1, v2 ); // invoke-virtual {v0, v1, v2}, Lde/nurogames/android/ticb/base/views/InAppPurchaseView$RefreshHandler;->sleep(J)V
/* .line 171 */
} // :cond_0
return;
} // .end method
