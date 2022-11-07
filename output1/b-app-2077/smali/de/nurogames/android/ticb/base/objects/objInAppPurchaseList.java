public class de.nurogames.android.ticb.base.objects.objInAppPurchaseList {
	 /* .source "objInAppPurchaseList.java" */
	 /* # static fields */
	 private static Integer FONT_SIZE;
	 /* # instance fields */
	 private Boolean FAKE_BOLD;
	 private Integer color_normal_item;
	 private Integer item_spacing;
	 private Boolean list_hit;
	 private Integer list_top_offset;
	 private android.graphics.Paint mPaint;
	 private Integer max_offset;
	 private Integer selected_list_item_id;
	 private Float shop_list_bottom;
	 private Float shop_list_left;
	 private Float shop_list_right;
	 private Float shop_list_top;
	 private Float x_offset;
	 /* # direct methods */
	 static de.nurogames.android.ticb.base.objects.objInAppPurchaseList ( ) {
		 /* .locals 1 */
		 /* .prologue */
		 /* .line 46 */
		 int v0 = 0; // const/4 v0, 0x0
		 return;
	 } // .end method
	 public de.nurogames.android.ticb.base.objects.objInAppPurchaseList ( ) {
		 /* .locals 5 */
		 /* .prologue */
		 int v4 = 0; // const/4 v4, 0x0
		 int v3 = 0; // const/4 v3, 0x0
		 /* .line 71 */
		 /* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
		 /* .line 22 */
		 /* new-instance v1, Landroid/graphics/Paint; */
		 /* invoke-direct {v1}, Landroid/graphics/Paint;-><init>()V */
		 this.mPaint = v1;
		 /* .line 25 */
		 /* iput-boolean v3, p0, Lde/nurogames/android/ticb/base/objects/objInAppPurchaseList;->list_hit:Z */
		 /* .line 28 */
		 int v1 = -1; // const/4 v1, -0x1
		 /* iput v1, p0, Lde/nurogames/android/ticb/base/objects/objInAppPurchaseList;->selected_list_item_id:I */
		 /* .line 31 */
		 /* iput v4, p0, Lde/nurogames/android/ticb/base/objects/objInAppPurchaseList;->x_offset:F */
		 /* .line 34 */
		 /* iput v3, p0, Lde/nurogames/android/ticb/base/objects/objInAppPurchaseList;->max_offset:I */
		 /* .line 37 */
		 /* iput v3, p0, Lde/nurogames/android/ticb/base/objects/objInAppPurchaseList;->item_spacing:I */
		 /* .line 40 */
		 /* int-to-float v1, v1 */
		 /* const v2, 0x3e19999a # 0.15f */
		 /* mul-float/2addr v1, v2 */
		 /* iput v1, p0, Lde/nurogames/android/ticb/base/objects/objInAppPurchaseList;->shop_list_top:F */
		 /* .line 41 */
		 /* iput v4, p0, Lde/nurogames/android/ticb/base/objects/objInAppPurchaseList;->shop_list_left:F */
		 /* .line 42 */
		 /* int-to-float v1, v1 */
		 /* iget v2, p0, Lde/nurogames/android/ticb/base/objects/objInAppPurchaseList;->shop_list_left:F */
		 /* sub-float/2addr v1, v2 */
		 /* iput v1, p0, Lde/nurogames/android/ticb/base/objects/objInAppPurchaseList;->shop_list_right:F */
		 /* .line 43 */
		 /* int-to-float v1, v1 */
		 /* iget v2, p0, Lde/nurogames/android/ticb/base/objects/objInAppPurchaseList;->shop_list_top:F */
		 /* sub-float/2addr v1, v2 */
		 /* iput v1, p0, Lde/nurogames/android/ticb/base/objects/objInAppPurchaseList;->shop_list_bottom:F */
		 /* .line 47 */
		 /* iput-boolean v3, p0, Lde/nurogames/android/ticb/base/objects/objInAppPurchaseList;->FAKE_BOLD:Z */
		 /* .line 52 */
		 /* const/16 v1, 0x6e */
		 /* const/16 v2, 0x46 */
		 v1 = 		 android.graphics.Color .rgb ( v1,v2,v3 );
		 /* iput v1, p0, Lde/nurogames/android/ticb/base/objects/objInAppPurchaseList;->color_normal_item:I */
		 /* .line 67 */
		 /* iput v3, p0, Lde/nurogames/android/ticb/base/objects/objInAppPurchaseList;->list_top_offset:I */
		 /* .line 73 */
		 v1 = this.mPaint;
		 int v2 = 1; // const/4 v2, 0x1
		 (( android.graphics.Paint ) v1 ).setAntiAlias ( v2 ); // invoke-virtual {v1, v2}, Landroid/graphics/Paint;->setAntiAlias(Z)V
		 /* .line 74 */
		 v1 = de.nurogames.android.ticb.base.tinysanta.cntx;
		 (( android.content.Context ) v1 ).getAssets ( ); // invoke-virtual {v1}, Landroid/content/Context;->getAssets()Landroid/content/res/AssetManager;
		 final String v2 = "font.otf"; // const-string v2, "font.otf"
		 android.graphics.Typeface .createFromAsset ( v1,v2 );
		 /* .line 75 */
		 /* .local v0, "tf":Landroid/graphics/Typeface; */
		 v1 = this.mPaint;
		 (( android.graphics.Paint ) v1 ).setTypeface ( v0 ); // invoke-virtual {v1, v0}, Landroid/graphics/Paint;->setTypeface(Landroid/graphics/Typeface;)Landroid/graphics/Typeface;
		 /* .line 77 */
		 /* iget-boolean v1, p0, Lde/nurogames/android/ticb/base/objects/objInAppPurchaseList;->FAKE_BOLD:Z */
		 if ( v1 != null) { // if-eqz v1, :cond_0
			 /* .line 78 */
			 v1 = this.mPaint;
			 /* iget-boolean v2, p0, Lde/nurogames/android/ticb/base/objects/objInAppPurchaseList;->FAKE_BOLD:Z */
			 (( android.graphics.Paint ) v1 ).setFakeBoldText ( v2 ); // invoke-virtual {v1, v2}, Landroid/graphics/Paint;->setFakeBoldText(Z)V
			 /* .line 80 */
		 } // :cond_0
		 v1 = de.nurogames.android.ticb.base.tinysanta.cntx;
		 (( android.content.Context ) v1 ).getResources ( ); // invoke-virtual {v1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;
		 (( android.content.res.Resources ) v1 ).getIntArray ( v2 ); // invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getIntArray(I)[I
		 /* aget v1, v1, v2 */
		 /* .line 82 */
		 /* if-ne v1, v2, :cond_1 */
		 /* .line 83 */
		 /* const/16 v1, 0x3c */
		 /* iput v1, p0, Lde/nurogames/android/ticb/base/objects/objInAppPurchaseList;->list_top_offset:I */
		 /* .line 89 */
	 } // :cond_1
	 v1 = de.nurogames.android.ticb.base.core.AppResources.imgInAppShopBuy;
	 /* aget-object v1, v1, v3 */
	 v1 = 	 (( android.graphics.Bitmap ) v1 ).getWidth ( ); // invoke-virtual {v1}, Landroid/graphics/Bitmap;->getWidth()I
	 /* int-to-float v1, v1 */
	 /* const/high16 v2, 0x3fa00000 # 1.25f */
	 /* mul-float/2addr v1, v2 */
	 /* float-to-int v1, v1 */
	 /* iput v1, p0, Lde/nurogames/android/ticb/base/objects/objInAppPurchaseList;->item_spacing:I */
	 /* .line 92 */
	 /* iget v1, p0, Lde/nurogames/android/ticb/base/objects/objInAppPurchaseList;->shop_list_right:F */
	 /* iget v2, p0, Lde/nurogames/android/ticb/base/objects/objInAppPurchaseList;->shop_list_left:F */
	 /* sub-float/2addr v1, v2 */
	 /* float-to-int v1, v1 */
	 v2 = de.nurogames.android.ticb.base.tinysanta.inAppMngr;
	 v2 = 	 (( de.nurogames.android.ticb.base.core.InAppMngr ) v2 ).getShopItemCount ( ); // invoke-virtual {v2}, Lde/nurogames/android/ticb/base/core/InAppMngr;->getShopItemCount()I
	 /* iget v3, p0, Lde/nurogames/android/ticb/base/objects/objInAppPurchaseList;->item_spacing:I */
	 /* mul-int/2addr v2, v3 */
	 /* sub-int/2addr v1, v2 */
	 /* iput v1, p0, Lde/nurogames/android/ticb/base/objects/objInAppPurchaseList;->max_offset:I */
	 /* .line 94 */
	 v1 = this.mPaint;
	 /* int-to-float v2, v2 */
	 (( android.graphics.Paint ) v1 ).setTextSize ( v2 ); // invoke-virtual {v1, v2}, Landroid/graphics/Paint;->setTextSize(F)V
	 /* .line 96 */
	 return;
} // .end method
/* # virtual methods */
public Float Bottom ( ) {
	 /* .locals 1 */
	 /* .prologue */
	 /* .line 235 */
	 /* iget v0, p0, Lde/nurogames/android/ticb/base/objects/objInAppPurchaseList;->shop_list_bottom:F */
} // .end method
public void Bottom ( Float p0 ) {
	 /* .locals 0 */
	 /* .param p1, "value" # F */
	 /* .prologue */
	 /* .line 234 */
	 /* iput p1, p0, Lde/nurogames/android/ticb/base/objects/objInAppPurchaseList;->shop_list_bottom:F */
	 return;
} // .end method
public void Hit ( Boolean p0 ) {
	 /* .locals 0 */
	 /* .param p1, "value" # Z */
	 /* .prologue */
	 /* .line 240 */
	 /* iput-boolean p1, p0, Lde/nurogames/android/ticb/base/objects/objInAppPurchaseList;->list_hit:Z */
	 return;
} // .end method
public Boolean Hit ( ) {
	 /* .locals 1 */
	 /* .prologue */
	 /* .line 241 */
	 /* iget-boolean v0, p0, Lde/nurogames/android/ticb/base/objects/objInAppPurchaseList;->list_hit:Z */
} // .end method
public Float Left ( ) {
	 /* .locals 1 */
	 /* .prologue */
	 /* .line 229 */
	 /* iget v0, p0, Lde/nurogames/android/ticb/base/objects/objInAppPurchaseList;->shop_list_left:F */
} // .end method
public void Left ( Integer p0 ) {
	 /* .locals 1 */
	 /* .param p1, "value" # I */
	 /* .prologue */
	 /* .line 228 */
	 /* int-to-float v0, p1 */
	 /* iput v0, p0, Lde/nurogames/android/ticb/base/objects/objInAppPurchaseList;->shop_list_left:F */
	 return;
} // .end method
public Float Right ( ) {
	 /* .locals 1 */
	 /* .prologue */
	 /* .line 238 */
	 /* iget v0, p0, Lde/nurogames/android/ticb/base/objects/objInAppPurchaseList;->shop_list_right:F */
} // .end method
public void Right ( Integer p0 ) {
	 /* .locals 1 */
	 /* .param p1, "value" # I */
	 /* .prologue */
	 /* .line 237 */
	 /* int-to-float v0, p1 */
	 /* iput v0, p0, Lde/nurogames/android/ticb/base/objects/objInAppPurchaseList;->shop_list_right:F */
	 return;
} // .end method
public Float Top ( ) {
	 /* .locals 1 */
	 /* .prologue */
	 /* .line 232 */
	 /* iget v0, p0, Lde/nurogames/android/ticb/base/objects/objInAppPurchaseList;->shop_list_top:F */
} // .end method
public void Top ( Float p0 ) {
	 /* .locals 0 */
	 /* .param p1, "value" # F */
	 /* .prologue */
	 /* .line 231 */
	 /* iput p1, p0, Lde/nurogames/android/ticb/base/objects/objInAppPurchaseList;->shop_list_top:F */
	 return;
} // .end method
public Integer item_spacing ( ) {
	 /* .locals 1 */
	 /* .prologue */
	 /* .line 253 */
	 /* iget v0, p0, Lde/nurogames/android/ticb/base/objects/objInAppPurchaseList;->item_spacing:I */
} // .end method
public void item_spacing ( Integer p0 ) {
	 /* .locals 0 */
	 /* .param p1, "value" # I */
	 /* .prologue */
	 /* .line 252 */
	 /* iput p1, p0, Lde/nurogames/android/ticb/base/objects/objInAppPurchaseList;->item_spacing:I */
	 return;
} // .end method
public Integer max_offset ( ) {
	 /* .locals 1 */
	 /* .prologue */
	 /* .line 250 */
	 /* iget v0, p0, Lde/nurogames/android/ticb/base/objects/objInAppPurchaseList;->max_offset:I */
} // .end method
public void max_offset ( Integer p0 ) {
	 /* .locals 0 */
	 /* .param p1, "value" # I */
	 /* .prologue */
	 /* .line 249 */
	 /* iput p1, p0, Lde/nurogames/android/ticb/base/objects/objInAppPurchaseList;->max_offset:I */
	 return;
} // .end method
public void onDraw ( android.graphics.Canvas p0 ) {
	 /* .locals 12 */
	 /* .param p1, "g" # Landroid/graphics/Canvas; */
	 /* .prologue */
	 int v11 = 2; // const/4 v11, 0x2
	 /* const/high16 v10, 0x3fc00000 # 1.5f */
	 int v9 = 0; // const/4 v9, 0x0
	 /* const/high16 v8, 0x40000000 # 2.0f */
	 /* const/high16 v7, 0x40c00000 # 6.0f */
	 /* .line 109 */
	 v0 = this.mPaint;
	 v1 = android.graphics.Paint$Style.FILL;
	 (( android.graphics.Paint ) v0 ).setStyle ( v1 ); // invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setStyle(Landroid/graphics/Paint$Style;)V
	 /* .line 113 */
	 /* iget v1, p0, Lde/nurogames/android/ticb/base/objects/objInAppPurchaseList;->shop_list_left:F */
	 /* .line 114 */
	 /* iget v0, p0, Lde/nurogames/android/ticb/base/objects/objInAppPurchaseList;->shop_list_top:F */
	 /* iget v2, p0, Lde/nurogames/android/ticb/base/objects/objInAppPurchaseList;->list_top_offset:I */
	 /* int-to-float v2, v2 */
	 /* add-float/2addr v2, v0 */
	 /* .line 115 */
	 /* iget v3, p0, Lde/nurogames/android/ticb/base/objects/objInAppPurchaseList;->shop_list_right:F */
	 /* .line 116 */
	 /* iget v0, p0, Lde/nurogames/android/ticb/base/objects/objInAppPurchaseList;->shop_list_bottom:F */
	 /* iget v4, p0, Lde/nurogames/android/ticb/base/objects/objInAppPurchaseList;->list_top_offset:I */
	 /* int-to-float v4, v4 */
	 /* add-float/2addr v4, v0 */
	 /* .line 117 */
	 v5 = android.graphics.Region$Op.REPLACE;
	 /* move-object v0, p1 */
	 /* .line 112 */
	 /* invoke-virtual/range {v0 ..v5}, Landroid/graphics/Canvas;->clipRect(FFFFLandroid/graphics/Region$Op;)Z */
	 /* .line 120 */
	 int v6 = 0; // const/4 v6, 0x0
	 /* .local v6, "x":I */
} // :goto_0
v0 = de.nurogames.android.ticb.base.tinysanta.inAppMngr;
v0 = (( de.nurogames.android.ticb.base.core.InAppMngr ) v0 ).getShopItemCount ( ); // invoke-virtual {v0}, Lde/nurogames/android/ticb/base/core/InAppMngr;->getShopItemCount()I
/* if-lt v6, v0, :cond_0 */
/* .line 224 */
int v1 = 0; // const/4 v1, 0x0
int v2 = 0; // const/4 v2, 0x0
/* int-to-float v3, v0 */
/* int-to-float v4, v0 */
v5 = android.graphics.Region$Op.REPLACE;
/* move-object v0, p1 */
/* invoke-virtual/range {v0 ..v5}, Landroid/graphics/Canvas;->clipRect(FFFFLandroid/graphics/Region$Op;)Z */
/* .line 226 */
return;
/* .line 125 */
} // :cond_0
v0 = this.mPaint;
/* iget v1, p0, Lde/nurogames/android/ticb/base/objects/objInAppPurchaseList;->color_normal_item:I */
(( android.graphics.Paint ) v0 ).setColor ( v1 ); // invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setColor(I)V
/* .line 129 */
v0 = de.nurogames.android.ticb.base.core.InAppMngr.inappItems;
(( java.util.Vector ) v0 ).elementAt ( v6 ); // invoke-virtual {v0, v6}, Ljava/util/Vector;->elementAt(I)Ljava/lang/Object;
/* check-cast v0, Lde/nurogames/android/ticb/base/core/InAppElement; */
(( de.nurogames.android.ticb.base.core.InAppElement ) v0 ).Name ( ); // invoke-virtual {v0}, Lde/nurogames/android/ticb/base/core/InAppElement;->Name()Ljava/lang/String;
/* .line 130 */
/* iget v0, p0, Lde/nurogames/android/ticb/base/objects/objInAppPurchaseList;->shop_list_left:F */
/* add-float/2addr v0, v7 */
/* iget v2, p0, Lde/nurogames/android/ticb/base/objects/objInAppPurchaseList;->item_spacing:I */
/* mul-int/2addr v2, v6 */
/* int-to-float v2, v2 */
/* add-float/2addr v0, v2 */
/* iget v2, p0, Lde/nurogames/android/ticb/base/objects/objInAppPurchaseList;->x_offset:F */
/* add-float/2addr v0, v2 */
/* iget v2, p0, Lde/nurogames/android/ticb/base/objects/objInAppPurchaseList;->item_spacing:I */
/* div-int/lit8 v2, v2, 0x2 */
/* int-to-float v2, v2 */
/* add-float/2addr v2, v0 */
v3 = this.mPaint;
v0 = de.nurogames.android.ticb.base.core.InAppMngr.inappItems;
(( java.util.Vector ) v0 ).elementAt ( v6 ); // invoke-virtual {v0, v6}, Ljava/util/Vector;->elementAt(I)Ljava/lang/Object;
/* check-cast v0, Lde/nurogames/android/ticb/base/core/InAppElement; */
(( de.nurogames.android.ticb.base.core.InAppElement ) v0 ).Name ( ); // invoke-virtual {v0}, Lde/nurogames/android/ticb/base/core/InAppElement;->Name()Ljava/lang/String;
v0 = (( android.graphics.Paint ) v3 ).measureText ( v0 ); // invoke-virtual {v3, v0}, Landroid/graphics/Paint;->measureText(Ljava/lang/String;)F
/* div-float/2addr v0, v8 */
/* sub-float v0, v2, v0 */
/* .line 131 */
/* iget v2, p0, Lde/nurogames/android/ticb/base/objects/objInAppPurchaseList;->shop_list_top:F */
/* iget v3, p0, Lde/nurogames/android/ticb/base/objects/objInAppPurchaseList;->list_top_offset:I */
/* int-to-float v3, v3 */
/* add-float/2addr v2, v3 */
/* const/high16 v3, 0x40800000 # 4.0f */
/* add-float/2addr v2, v3 */
/* int-to-float v3, v3 */
/* mul-float/2addr v3, v10 */
/* add-float/2addr v2, v3 */
/* .line 132 */
v3 = this.mPaint;
/* .line 128 */
(( android.graphics.Canvas ) p1 ).drawText ( v1, v0, v2, v3 ); // invoke-virtual {p1, v1, v0, v2, v3}, Landroid/graphics/Canvas;->drawText(Ljava/lang/String;FFLandroid/graphics/Paint;)V
/* .line 136 */
v0 = de.nurogames.android.ticb.base.core.InAppMngr.inappItems;
(( java.util.Vector ) v0 ).elementAt ( v6 ); // invoke-virtual {v0, v6}, Ljava/util/Vector;->elementAt(I)Ljava/lang/Object;
/* check-cast v0, Lde/nurogames/android/ticb/base/core/InAppElement; */
(( de.nurogames.android.ticb.base.core.InAppElement ) v0 ).Desc ( ); // invoke-virtual {v0}, Lde/nurogames/android/ticb/base/core/InAppElement;->Desc()Ljava/lang/String;
/* .line 137 */
/* iget v0, p0, Lde/nurogames/android/ticb/base/objects/objInAppPurchaseList;->shop_list_left:F */
/* add-float/2addr v0, v7 */
/* iget v2, p0, Lde/nurogames/android/ticb/base/objects/objInAppPurchaseList;->item_spacing:I */
/* mul-int/2addr v2, v6 */
/* int-to-float v2, v2 */
/* add-float/2addr v0, v2 */
/* iget v2, p0, Lde/nurogames/android/ticb/base/objects/objInAppPurchaseList;->x_offset:F */
/* add-float/2addr v0, v2 */
/* iget v2, p0, Lde/nurogames/android/ticb/base/objects/objInAppPurchaseList;->item_spacing:I */
/* div-int/lit8 v2, v2, 0x2 */
/* int-to-float v2, v2 */
/* add-float/2addr v2, v0 */
v3 = this.mPaint;
v0 = de.nurogames.android.ticb.base.core.InAppMngr.inappItems;
(( java.util.Vector ) v0 ).elementAt ( v6 ); // invoke-virtual {v0, v6}, Ljava/util/Vector;->elementAt(I)Ljava/lang/Object;
/* check-cast v0, Lde/nurogames/android/ticb/base/core/InAppElement; */
(( de.nurogames.android.ticb.base.core.InAppElement ) v0 ).Desc ( ); // invoke-virtual {v0}, Lde/nurogames/android/ticb/base/core/InAppElement;->Desc()Ljava/lang/String;
v0 = (( android.graphics.Paint ) v3 ).measureText ( v0 ); // invoke-virtual {v3, v0}, Landroid/graphics/Paint;->measureText(Ljava/lang/String;)F
/* div-float/2addr v0, v8 */
/* sub-float v0, v2, v0 */
/* .line 138 */
/* iget v2, p0, Lde/nurogames/android/ticb/base/objects/objInAppPurchaseList;->shop_list_top:F */
/* iget v3, p0, Lde/nurogames/android/ticb/base/objects/objInAppPurchaseList;->list_top_offset:I */
/* int-to-float v3, v3 */
/* add-float/2addr v2, v3 */
/* const/high16 v3, 0x40800000 # 4.0f */
/* add-float/2addr v2, v3 */
/* int-to-float v3, v3 */
/* mul-float/2addr v3, v10 */
/* add-float/2addr v2, v3 */
/* int-to-float v3, v3 */
/* add-float/2addr v2, v3 */
/* .line 139 */
v3 = this.mPaint;
/* .line 135 */
(( android.graphics.Canvas ) p1 ).drawText ( v1, v0, v2, v3 ); // invoke-virtual {p1, v1, v0, v2, v3}, Landroid/graphics/Canvas;->drawText(Ljava/lang/String;FFLandroid/graphics/Paint;)V
/* .line 142 */
v0 = de.nurogames.android.ticb.base.core.InAppMngr.inappItems;
(( java.util.Vector ) v0 ).elementAt ( v6 ); // invoke-virtual {v0, v6}, Ljava/util/Vector;->elementAt(I)Ljava/lang/Object;
/* check-cast v0, Lde/nurogames/android/ticb/base/core/InAppElement; */
(( de.nurogames.android.ticb.base.core.InAppElement ) v0 ).Icon ( ); // invoke-virtual {v0}, Lde/nurogames/android/ticb/base/core/InAppElement;->Icon()Landroid/graphics/Bitmap;
if ( v0 != null) { // if-eqz v0, :cond_1
/* .line 144 */
v0 = de.nurogames.android.ticb.base.core.InAppMngr.inappItems;
(( java.util.Vector ) v0 ).elementAt ( v6 ); // invoke-virtual {v0, v6}, Ljava/util/Vector;->elementAt(I)Ljava/lang/Object;
/* check-cast v0, Lde/nurogames/android/ticb/base/core/InAppElement; */
(( de.nurogames.android.ticb.base.core.InAppElement ) v0 ).Icon ( ); // invoke-virtual {v0}, Lde/nurogames/android/ticb/base/core/InAppElement;->Icon()Landroid/graphics/Bitmap;
/* .line 145 */
/* iget v0, p0, Lde/nurogames/android/ticb/base/objects/objInAppPurchaseList;->shop_list_left:F */
/* add-float/2addr v0, v7 */
/* iget v2, p0, Lde/nurogames/android/ticb/base/objects/objInAppPurchaseList;->item_spacing:I */
/* mul-int/2addr v2, v6 */
/* int-to-float v2, v2 */
/* add-float/2addr v0, v2 */
/* iget v2, p0, Lde/nurogames/android/ticb/base/objects/objInAppPurchaseList;->x_offset:F */
/* add-float/2addr v0, v2 */
/* iget v2, p0, Lde/nurogames/android/ticb/base/objects/objInAppPurchaseList;->item_spacing:I */
/* div-int/lit8 v2, v2, 0x2 */
/* int-to-float v2, v2 */
/* add-float/2addr v2, v0 */
v0 = de.nurogames.android.ticb.base.core.InAppMngr.inappItems;
(( java.util.Vector ) v0 ).elementAt ( v6 ); // invoke-virtual {v0, v6}, Ljava/util/Vector;->elementAt(I)Ljava/lang/Object;
/* check-cast v0, Lde/nurogames/android/ticb/base/core/InAppElement; */
(( de.nurogames.android.ticb.base.core.InAppElement ) v0 ).Icon ( ); // invoke-virtual {v0}, Lde/nurogames/android/ticb/base/core/InAppElement;->Icon()Landroid/graphics/Bitmap;
v0 = (( android.graphics.Bitmap ) v0 ).getWidth ( ); // invoke-virtual {v0}, Landroid/graphics/Bitmap;->getWidth()I
/* div-int/lit8 v0, v0, 0x2 */
/* int-to-float v0, v0 */
/* sub-float v0, v2, v0 */
/* .line 146 */
/* iget v2, p0, Lde/nurogames/android/ticb/base/objects/objInAppPurchaseList;->shop_list_top:F */
/* float-to-int v2, v2 */
/* iget v3, p0, Lde/nurogames/android/ticb/base/objects/objInAppPurchaseList;->list_top_offset:I */
/* add-int/2addr v2, v3 */
/* add-int/lit8 v2, v2, 0xe */
/* int-to-float v2, v2 */
/* int-to-float v3, v3 */
/* mul-float/2addr v3, v10 */
/* add-float/2addr v2, v3 */
/* int-to-float v3, v3 */
/* add-float/2addr v2, v3 */
/* .line 143 */
(( android.graphics.Canvas ) p1 ).drawBitmap ( v1, v0, v2, v9 ); // invoke-virtual {p1, v1, v0, v2, v9}, Landroid/graphics/Canvas;->drawBitmap(Landroid/graphics/Bitmap;FFLandroid/graphics/Paint;)V
/* .line 150 */
} // :cond_1
v0 = de.nurogames.android.ticb.base.core.InAppMngr.owned;
/* aget-boolean v0, v0, v6 */
if ( v0 != null) { // if-eqz v0, :cond_4
/* .line 151 */
v0 = de.nurogames.android.ticb.base.tinysanta.inAppMngr;
(( de.nurogames.android.ticb.base.core.InAppMngr ) v0 ).getShopItem ( v6 ); // invoke-virtual {v0, v6}, Lde/nurogames/android/ticb/base/core/InAppMngr;->getShopItem(I)Lde/nurogames/android/ticb/base/core/InAppElement;
v0 = (( de.nurogames.android.ticb.base.core.InAppElement ) v0 ).Selectable ( ); // invoke-virtual {v0}, Lde/nurogames/android/ticb/base/core/InAppElement;->Selectable()Z
if ( v0 != null) { // if-eqz v0, :cond_3
	 /* .line 152 */
	 /* if-ne v6, v0, :cond_2 */
	 /* .line 154 */
	 v0 = de.nurogames.android.ticb.base.core.AppResources.imgInAppShopBuy;
	 int v1 = 3; // const/4 v1, 0x3
	 /* aget-object v1, v0, v1 */
	 /* .line 155 */
	 /* iget v0, p0, Lde/nurogames/android/ticb/base/objects/objInAppPurchaseList;->shop_list_left:F */
	 /* add-float/2addr v0, v7 */
	 /* iget v2, p0, Lde/nurogames/android/ticb/base/objects/objInAppPurchaseList;->item_spacing:I */
	 /* mul-int/2addr v2, v6 */
	 /* int-to-float v2, v2 */
	 /* add-float/2addr v0, v2 */
	 /* iget v2, p0, Lde/nurogames/android/ticb/base/objects/objInAppPurchaseList;->x_offset:F */
	 /* add-float/2addr v0, v2 */
	 /* iget v2, p0, Lde/nurogames/android/ticb/base/objects/objInAppPurchaseList;->item_spacing:I */
	 /* div-int/lit8 v2, v2, 0x2 */
	 /* int-to-float v2, v2 */
	 /* add-float/2addr v0, v2 */
	 v2 = de.nurogames.android.ticb.base.core.AppResources.imgInAppShopBuy;
	 int v3 = 3; // const/4 v3, 0x3
	 /* aget-object v2, v2, v3 */
	 v2 = 	 (( android.graphics.Bitmap ) v2 ).getWidth ( ); // invoke-virtual {v2}, Landroid/graphics/Bitmap;->getWidth()I
	 /* div-int/lit8 v2, v2, 0x2 */
	 /* int-to-float v2, v2 */
	 /* sub-float v2, v0, v2 */
	 /* .line 156 */
	 /* iget v0, p0, Lde/nurogames/android/ticb/base/objects/objInAppPurchaseList;->shop_list_top:F */
	 /* float-to-int v0, v0 */
	 /* iget v3, p0, Lde/nurogames/android/ticb/base/objects/objInAppPurchaseList;->list_top_offset:I */
	 /* add-int/2addr v0, v3 */
	 /* add-int/lit8 v3, v0, 0xe */
	 v0 = de.nurogames.android.ticb.base.core.InAppMngr.inappItems;
	 (( java.util.Vector ) v0 ).elementAt ( v6 ); // invoke-virtual {v0, v6}, Ljava/util/Vector;->elementAt(I)Ljava/lang/Object;
	 /* check-cast v0, Lde/nurogames/android/ticb/base/core/InAppElement; */
	 (( de.nurogames.android.ticb.base.core.InAppElement ) v0 ).Icon ( ); // invoke-virtual {v0}, Lde/nurogames/android/ticb/base/core/InAppElement;->Icon()Landroid/graphics/Bitmap;
	 v0 = 	 (( android.graphics.Bitmap ) v0 ).getHeight ( ); // invoke-virtual {v0}, Landroid/graphics/Bitmap;->getHeight()I
	 /* add-int/2addr v0, v3 */
	 /* int-to-float v0, v0 */
	 /* int-to-float v3, v3 */
	 /* mul-float/2addr v3, v8 */
	 /* add-float/2addr v0, v3 */
	 /* .line 153 */
	 (( android.graphics.Canvas ) p1 ).drawBitmap ( v1, v2, v0, v9 ); // invoke-virtual {p1, v1, v2, v0, v9}, Landroid/graphics/Canvas;->drawBitmap(Landroid/graphics/Bitmap;FFLandroid/graphics/Paint;)V
	 /* .line 120 */
} // :goto_1
/* add-int/lit8 v6, v6, 0x1 */
/* goto/16 :goto_0 */
/* .line 160 */
} // :cond_2
v0 = de.nurogames.android.ticb.base.core.AppResources.imgInAppShopBuy;
/* aget-object v1, v0, v11 */
/* .line 161 */
/* iget v0, p0, Lde/nurogames/android/ticb/base/objects/objInAppPurchaseList;->shop_list_left:F */
/* add-float/2addr v0, v7 */
/* iget v2, p0, Lde/nurogames/android/ticb/base/objects/objInAppPurchaseList;->item_spacing:I */
/* mul-int/2addr v2, v6 */
/* int-to-float v2, v2 */
/* add-float/2addr v0, v2 */
/* iget v2, p0, Lde/nurogames/android/ticb/base/objects/objInAppPurchaseList;->x_offset:F */
/* add-float/2addr v0, v2 */
/* iget v2, p0, Lde/nurogames/android/ticb/base/objects/objInAppPurchaseList;->item_spacing:I */
/* div-int/lit8 v2, v2, 0x2 */
/* int-to-float v2, v2 */
/* add-float/2addr v0, v2 */
v2 = de.nurogames.android.ticb.base.core.AppResources.imgInAppShopBuy;
/* aget-object v2, v2, v11 */
v2 = (( android.graphics.Bitmap ) v2 ).getWidth ( ); // invoke-virtual {v2}, Landroid/graphics/Bitmap;->getWidth()I
/* div-int/lit8 v2, v2, 0x2 */
/* int-to-float v2, v2 */
/* sub-float v2, v0, v2 */
/* .line 162 */
/* iget v0, p0, Lde/nurogames/android/ticb/base/objects/objInAppPurchaseList;->shop_list_top:F */
/* float-to-int v0, v0 */
/* iget v3, p0, Lde/nurogames/android/ticb/base/objects/objInAppPurchaseList;->list_top_offset:I */
/* add-int/2addr v0, v3 */
/* add-int/lit8 v3, v0, 0xe */
v0 = de.nurogames.android.ticb.base.core.InAppMngr.inappItems;
(( java.util.Vector ) v0 ).elementAt ( v6 ); // invoke-virtual {v0, v6}, Ljava/util/Vector;->elementAt(I)Ljava/lang/Object;
/* check-cast v0, Lde/nurogames/android/ticb/base/core/InAppElement; */
(( de.nurogames.android.ticb.base.core.InAppElement ) v0 ).Icon ( ); // invoke-virtual {v0}, Lde/nurogames/android/ticb/base/core/InAppElement;->Icon()Landroid/graphics/Bitmap;
v0 = (( android.graphics.Bitmap ) v0 ).getHeight ( ); // invoke-virtual {v0}, Landroid/graphics/Bitmap;->getHeight()I
/* add-int/2addr v0, v3 */
/* int-to-float v0, v0 */
/* int-to-float v3, v3 */
/* mul-float/2addr v3, v8 */
/* add-float/2addr v0, v3 */
/* .line 159 */
(( android.graphics.Canvas ) p1 ).drawBitmap ( v1, v2, v0, v9 ); // invoke-virtual {p1, v1, v2, v0, v9}, Landroid/graphics/Canvas;->drawBitmap(Landroid/graphics/Bitmap;FFLandroid/graphics/Paint;)V
/* .line 166 */
} // :cond_3
v0 = de.nurogames.android.ticb.base.core.AppResources.imgInAppShopBuy;
int v1 = 4; // const/4 v1, 0x4
/* aget-object v1, v0, v1 */
/* .line 167 */
/* iget v0, p0, Lde/nurogames/android/ticb/base/objects/objInAppPurchaseList;->shop_list_left:F */
/* add-float/2addr v0, v7 */
/* iget v2, p0, Lde/nurogames/android/ticb/base/objects/objInAppPurchaseList;->item_spacing:I */
/* mul-int/2addr v2, v6 */
/* int-to-float v2, v2 */
/* add-float/2addr v0, v2 */
/* iget v2, p0, Lde/nurogames/android/ticb/base/objects/objInAppPurchaseList;->x_offset:F */
/* add-float/2addr v0, v2 */
/* iget v2, p0, Lde/nurogames/android/ticb/base/objects/objInAppPurchaseList;->item_spacing:I */
/* div-int/lit8 v2, v2, 0x2 */
/* int-to-float v2, v2 */
/* add-float/2addr v0, v2 */
v2 = de.nurogames.android.ticb.base.core.AppResources.imgInAppShopBuy;
/* aget-object v2, v2, v11 */
v2 = (( android.graphics.Bitmap ) v2 ).getWidth ( ); // invoke-virtual {v2}, Landroid/graphics/Bitmap;->getWidth()I
/* div-int/lit8 v2, v2, 0x2 */
/* int-to-float v2, v2 */
/* sub-float v2, v0, v2 */
/* .line 168 */
/* iget v0, p0, Lde/nurogames/android/ticb/base/objects/objInAppPurchaseList;->shop_list_top:F */
/* float-to-int v0, v0 */
/* iget v3, p0, Lde/nurogames/android/ticb/base/objects/objInAppPurchaseList;->list_top_offset:I */
/* add-int/2addr v0, v3 */
/* add-int/lit8 v3, v0, 0xe */
v0 = de.nurogames.android.ticb.base.core.InAppMngr.inappItems;
(( java.util.Vector ) v0 ).elementAt ( v6 ); // invoke-virtual {v0, v6}, Ljava/util/Vector;->elementAt(I)Ljava/lang/Object;
/* check-cast v0, Lde/nurogames/android/ticb/base/core/InAppElement; */
(( de.nurogames.android.ticb.base.core.InAppElement ) v0 ).Icon ( ); // invoke-virtual {v0}, Lde/nurogames/android/ticb/base/core/InAppElement;->Icon()Landroid/graphics/Bitmap;
v0 = (( android.graphics.Bitmap ) v0 ).getHeight ( ); // invoke-virtual {v0}, Landroid/graphics/Bitmap;->getHeight()I
/* add-int/2addr v0, v3 */
/* int-to-float v0, v0 */
/* int-to-float v3, v3 */
/* mul-float/2addr v3, v8 */
/* add-float/2addr v0, v3 */
/* .line 165 */
(( android.graphics.Canvas ) p1 ).drawBitmap ( v1, v2, v0, v9 ); // invoke-virtual {p1, v1, v2, v0, v9}, Landroid/graphics/Canvas;->drawBitmap(Landroid/graphics/Bitmap;FFLandroid/graphics/Paint;)V
/* goto/16 :goto_1 */
/* .line 172 */
} // :cond_4
/* iget v0, p0, Lde/nurogames/android/ticb/base/objects/objInAppPurchaseList;->selected_list_item_id:I */
/* if-ne v6, v0, :cond_5 */
/* .line 174 */
v0 = de.nurogames.android.ticb.base.core.AppResources.imgInAppShopBuy;
int v1 = 1; // const/4 v1, 0x1
/* aget-object v1, v0, v1 */
/* .line 175 */
/* iget v0, p0, Lde/nurogames/android/ticb/base/objects/objInAppPurchaseList;->shop_list_left:F */
/* add-float/2addr v0, v7 */
/* iget v2, p0, Lde/nurogames/android/ticb/base/objects/objInAppPurchaseList;->item_spacing:I */
/* mul-int/2addr v2, v6 */
/* int-to-float v2, v2 */
/* add-float/2addr v0, v2 */
/* iget v2, p0, Lde/nurogames/android/ticb/base/objects/objInAppPurchaseList;->x_offset:F */
/* add-float/2addr v0, v2 */
/* iget v2, p0, Lde/nurogames/android/ticb/base/objects/objInAppPurchaseList;->item_spacing:I */
/* div-int/lit8 v2, v2, 0x2 */
/* int-to-float v2, v2 */
/* add-float/2addr v0, v2 */
v2 = de.nurogames.android.ticb.base.core.AppResources.imgInAppShopBuy;
int v3 = 1; // const/4 v3, 0x1
/* aget-object v2, v2, v3 */
v2 = (( android.graphics.Bitmap ) v2 ).getWidth ( ); // invoke-virtual {v2}, Landroid/graphics/Bitmap;->getWidth()I
/* div-int/lit8 v2, v2, 0x2 */
/* int-to-float v2, v2 */
/* sub-float v2, v0, v2 */
/* .line 176 */
/* iget v0, p0, Lde/nurogames/android/ticb/base/objects/objInAppPurchaseList;->shop_list_top:F */
/* float-to-int v0, v0 */
/* iget v3, p0, Lde/nurogames/android/ticb/base/objects/objInAppPurchaseList;->list_top_offset:I */
/* add-int/2addr v0, v3 */
/* add-int/lit8 v3, v0, 0xe */
v0 = de.nurogames.android.ticb.base.core.InAppMngr.inappItems;
(( java.util.Vector ) v0 ).elementAt ( v6 ); // invoke-virtual {v0, v6}, Ljava/util/Vector;->elementAt(I)Ljava/lang/Object;
/* check-cast v0, Lde/nurogames/android/ticb/base/core/InAppElement; */
(( de.nurogames.android.ticb.base.core.InAppElement ) v0 ).Icon ( ); // invoke-virtual {v0}, Lde/nurogames/android/ticb/base/core/InAppElement;->Icon()Landroid/graphics/Bitmap;
v0 = (( android.graphics.Bitmap ) v0 ).getHeight ( ); // invoke-virtual {v0}, Landroid/graphics/Bitmap;->getHeight()I
/* add-int/2addr v0, v3 */
/* int-to-float v0, v0 */
/* int-to-float v3, v3 */
/* mul-float/2addr v3, v8 */
/* add-float/2addr v0, v3 */
/* .line 173 */
(( android.graphics.Canvas ) p1 ).drawBitmap ( v1, v2, v0, v9 ); // invoke-virtual {p1, v1, v2, v0, v9}, Landroid/graphics/Canvas;->drawBitmap(Landroid/graphics/Bitmap;FFLandroid/graphics/Paint;)V
/* goto/16 :goto_1 */
/* .line 180 */
} // :cond_5
v0 = de.nurogames.android.ticb.base.core.AppResources.imgInAppShopBuy;
int v1 = 0; // const/4 v1, 0x0
/* aget-object v1, v0, v1 */
/* .line 181 */
/* iget v0, p0, Lde/nurogames/android/ticb/base/objects/objInAppPurchaseList;->shop_list_left:F */
/* add-float/2addr v0, v7 */
/* iget v2, p0, Lde/nurogames/android/ticb/base/objects/objInAppPurchaseList;->item_spacing:I */
/* mul-int/2addr v2, v6 */
/* int-to-float v2, v2 */
/* add-float/2addr v0, v2 */
/* iget v2, p0, Lde/nurogames/android/ticb/base/objects/objInAppPurchaseList;->x_offset:F */
/* add-float/2addr v0, v2 */
/* iget v2, p0, Lde/nurogames/android/ticb/base/objects/objInAppPurchaseList;->item_spacing:I */
/* div-int/lit8 v2, v2, 0x2 */
/* int-to-float v2, v2 */
/* add-float/2addr v0, v2 */
v2 = de.nurogames.android.ticb.base.core.AppResources.imgInAppShopBuy;
int v3 = 0; // const/4 v3, 0x0
/* aget-object v2, v2, v3 */
v2 = (( android.graphics.Bitmap ) v2 ).getWidth ( ); // invoke-virtual {v2}, Landroid/graphics/Bitmap;->getWidth()I
/* div-int/lit8 v2, v2, 0x2 */
/* int-to-float v2, v2 */
/* sub-float v2, v0, v2 */
/* .line 182 */
/* iget v0, p0, Lde/nurogames/android/ticb/base/objects/objInAppPurchaseList;->shop_list_top:F */
/* float-to-int v0, v0 */
/* iget v3, p0, Lde/nurogames/android/ticb/base/objects/objInAppPurchaseList;->list_top_offset:I */
/* add-int/2addr v0, v3 */
/* add-int/lit8 v3, v0, 0xe */
v0 = de.nurogames.android.ticb.base.core.InAppMngr.inappItems;
(( java.util.Vector ) v0 ).elementAt ( v6 ); // invoke-virtual {v0, v6}, Ljava/util/Vector;->elementAt(I)Ljava/lang/Object;
/* check-cast v0, Lde/nurogames/android/ticb/base/core/InAppElement; */
(( de.nurogames.android.ticb.base.core.InAppElement ) v0 ).Icon ( ); // invoke-virtual {v0}, Lde/nurogames/android/ticb/base/core/InAppElement;->Icon()Landroid/graphics/Bitmap;
v0 = (( android.graphics.Bitmap ) v0 ).getHeight ( ); // invoke-virtual {v0}, Landroid/graphics/Bitmap;->getHeight()I
/* add-int/2addr v0, v3 */
/* int-to-float v0, v0 */
/* int-to-float v3, v3 */
/* mul-float/2addr v3, v8 */
/* add-float/2addr v0, v3 */
/* .line 179 */
(( android.graphics.Canvas ) p1 ).drawBitmap ( v1, v2, v0, v9 ); // invoke-virtual {p1, v1, v2, v0, v9}, Landroid/graphics/Canvas;->drawBitmap(Landroid/graphics/Bitmap;FFLandroid/graphics/Paint;)V
/* goto/16 :goto_1 */
} // .end method
public Integer selectedItem ( ) {
/* .locals 1 */
/* .prologue */
/* .line 244 */
/* iget v0, p0, Lde/nurogames/android/ticb/base/objects/objInAppPurchaseList;->selected_list_item_id:I */
} // .end method
public void selectedItem ( Integer p0 ) {
/* .locals 0 */
/* .param p1, "value" # I */
/* .prologue */
/* .line 243 */
/* iput p1, p0, Lde/nurogames/android/ticb/base/objects/objInAppPurchaseList;->selected_list_item_id:I */
return;
} // .end method
public Float x_offset ( ) {
/* .locals 1 */
/* .prologue */
/* .line 247 */
/* iget v0, p0, Lde/nurogames/android/ticb/base/objects/objInAppPurchaseList;->x_offset:F */
} // .end method
public void x_offset ( Float p0 ) {
/* .locals 0 */
/* .param p1, "value" # F */
/* .prologue */
/* .line 246 */
/* iput p1, p0, Lde/nurogames/android/ticb/base/objects/objInAppPurchaseList;->x_offset:F */
return;
} // .end method
