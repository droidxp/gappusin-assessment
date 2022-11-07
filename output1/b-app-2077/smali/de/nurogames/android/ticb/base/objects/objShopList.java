public class de.nurogames.android.ticb.base.objects.objShopList {
	 /* .source "objShopList.java" */
	 /* # static fields */
	 static Integer FONT_SIZE;
	 static Float ICON_SCALE;
	 static Integer price_span_left;
	 static Integer title_span_left;
	 /* # instance fields */
	 private Boolean FAKE_BOLD;
	 private Float ICON_BACK_SCALE;
	 final android.graphics.RectF border;
	 final android.graphics.RectF box;
	 Integer color_normal_item;
	 Integer color_selected_item;
	 Integer color_spacer;
	 Float height;
	 Integer item_count;
	 private Integer item_spacing;
	 private Boolean list_hit;
	 Integer list_left_offset;
	 Integer list_top_offset;
	 private android.graphics.Paint mPaint;
	 private Integer max_offset;
	 Float perc_visible;
	 android.content.res.Resources res;
	 final android.graphics.RectF scrollbar_fill;
	 final android.graphics.RectF scrollbar_indicator;
	 private Integer selected_list_item_id;
	 private Float shop_list_bottom;
	 private Float shop_list_left;
	 private Float shop_list_right;
	 private Float shop_list_top;
	 Float top_offset;
	 Float total_list_height;
	 Float total_visible_height;
	 private Float y_offset;
	 /* # direct methods */
	 static de.nurogames.android.ticb.base.objects.objShopList ( ) {
		 /* .locals 1 */
		 /* .prologue */
		 int v0 = 0; // const/4 v0, 0x0
		 /* .line 42 */
		 /* .line 46 */
		 /* .line 47 */
		 /* .line 50 */
		 int v0 = 0; // const/4 v0, 0x0
		 return;
	 } // .end method
	 public de.nurogames.android.ticb.base.objects.objShopList ( ) {
		 /* .locals 8 */
		 /* .prologue */
		 /* const/16 v5, 0x56 */
		 int v4 = 0; // const/4 v4, 0x0
		 /* const/high16 v7, 0x41200000 # 10.0f */
		 /* const/high16 v6, 0x41000000 # 8.0f */
		 int v3 = 0; // const/4 v3, 0x0
		 /* .line 94 */
		 /* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
		 /* .line 19 */
		 /* new-instance v1, Landroid/graphics/Paint; */
		 /* invoke-direct {v1}, Landroid/graphics/Paint;-><init>()V */
		 this.mPaint = v1;
		 /* .line 22 */
		 /* iput-boolean v4, p0, Lde/nurogames/android/ticb/base/objects/objShopList;->list_hit:Z */
		 /* .line 24 */
		 int v1 = -1; // const/4 v1, -0x1
		 /* iput v1, p0, Lde/nurogames/android/ticb/base/objects/objShopList;->selected_list_item_id:I */
		 /* .line 26 */
		 /* iput v3, p0, Lde/nurogames/android/ticb/base/objects/objShopList;->y_offset:F */
		 /* .line 28 */
		 /* iput v4, p0, Lde/nurogames/android/ticb/base/objects/objShopList;->max_offset:I */
		 /* .line 30 */
		 /* iput v4, p0, Lde/nurogames/android/ticb/base/objects/objShopList;->item_spacing:I */
		 /* .line 33 */
		 /* const/16 v1, 0x20 */
		 /* iput v1, p0, Lde/nurogames/android/ticb/base/objects/objShopList;->list_top_offset:I */
		 /* .line 34 */
		 /* const/16 v1, 0x3c */
		 /* iput v1, p0, Lde/nurogames/android/ticb/base/objects/objShopList;->list_left_offset:I */
		 /* .line 36 */
		 /* int-to-float v1, v1 */
		 /* const v2, 0x3e4ccccd # 0.2f */
		 /* mul-float/2addr v1, v2 */
		 /* iput v1, p0, Lde/nurogames/android/ticb/base/objects/objShopList;->shop_list_top:F */
		 /* .line 37 */
		 /* int-to-float v1, v1 */
		 /* const v2, 0x3df5c28f # 0.12f */
		 /* mul-float/2addr v1, v2 */
		 /* iput v1, p0, Lde/nurogames/android/ticb/base/objects/objShopList;->shop_list_left:F */
		 /* .line 38 */
		 /* int-to-float v1, v1 */
		 /* iget v2, p0, Lde/nurogames/android/ticb/base/objects/objShopList;->shop_list_left:F */
		 /* sub-float/2addr v1, v2 */
		 /* iput v1, p0, Lde/nurogames/android/ticb/base/objects/objShopList;->shop_list_right:F */
		 /* .line 39 */
		 /* int-to-float v1, v1 */
		 /* iget v2, p0, Lde/nurogames/android/ticb/base/objects/objShopList;->shop_list_top:F */
		 /* sub-float/2addr v1, v2 */
		 /* iput v1, p0, Lde/nurogames/android/ticb/base/objects/objShopList;->shop_list_bottom:F */
		 /* .line 43 */
		 /* iput-boolean v4, p0, Lde/nurogames/android/ticb/base/objects/objShopList;->FAKE_BOLD:Z */
		 /* .line 51 */
		 /* iput v3, p0, Lde/nurogames/android/ticb/base/objects/objShopList;->ICON_BACK_SCALE:F */
		 /* .line 54 */
		 /* const/16 v1, 0x48 */
		 int v2 = 4; // const/4 v2, 0x4
		 v1 = 		 android.graphics.Color .rgb ( v5,v1,v2 );
		 /* iput v1, p0, Lde/nurogames/android/ticb/base/objects/objShopList;->color_spacer:I */
		 /* .line 55 */
		 v1 = 		 android.graphics.Color .rgb ( v5,v5,v5 );
		 /* iput v1, p0, Lde/nurogames/android/ticb/base/objects/objShopList;->color_selected_item:I */
		 /* .line 56 */
		 int v1 = -1; // const/4 v1, -0x1
		 /* iput v1, p0, Lde/nurogames/android/ticb/base/objects/objShopList;->color_normal_item:I */
		 /* .line 60 */
		 /* iput v3, p0, Lde/nurogames/android/ticb/base/objects/objShopList;->total_list_height:F */
		 /* .line 63 */
		 /* iput v3, p0, Lde/nurogames/android/ticb/base/objects/objShopList;->total_visible_height:F */
		 /* .line 66 */
		 /* iput v3, p0, Lde/nurogames/android/ticb/base/objects/objShopList;->perc_visible:F */
		 /* .line 69 */
		 /* iput v3, p0, Lde/nurogames/android/ticb/base/objects/objShopList;->height:F */
		 /* .line 70 */
		 /* iput v3, p0, Lde/nurogames/android/ticb/base/objects/objShopList;->top_offset:F */
		 /* .line 74 */
		 /* new-instance v1, Landroid/graphics/RectF; */
		 /* iget v2, p0, Lde/nurogames/android/ticb/base/objects/objShopList;->shop_list_left:F */
		 /* sub-float/2addr v2, v6 */
		 /* iget v3, p0, Lde/nurogames/android/ticb/base/objects/objShopList;->shop_list_top:F */
		 /* sub-float/2addr v3, v7 */
		 /* iget v4, p0, Lde/nurogames/android/ticb/base/objects/objShopList;->shop_list_right:F */
		 /* add-float/2addr v4, v6 */
		 /* iget v5, p0, Lde/nurogames/android/ticb/base/objects/objShopList;->shop_list_bottom:F */
		 /* add-float/2addr v5, v7 */
		 /* invoke-direct {v1, v2, v3, v4, v5}, Landroid/graphics/RectF;-><init>(FFFF)V */
		 this.box = v1;
		 /* .line 75 */
		 /* new-instance v1, Landroid/graphics/RectF; */
		 /* iget v2, p0, Lde/nurogames/android/ticb/base/objects/objShopList;->shop_list_left:F */
		 /* sub-float/2addr v2, v6 */
		 /* iget v3, p0, Lde/nurogames/android/ticb/base/objects/objShopList;->shop_list_top:F */
		 /* sub-float/2addr v3, v7 */
		 /* iget v4, p0, Lde/nurogames/android/ticb/base/objects/objShopList;->shop_list_right:F */
		 /* add-float/2addr v4, v6 */
		 /* iget v5, p0, Lde/nurogames/android/ticb/base/objects/objShopList;->shop_list_bottom:F */
		 /* add-float/2addr v5, v7 */
		 /* invoke-direct {v1, v2, v3, v4, v5}, Landroid/graphics/RectF;-><init>(FFFF)V */
		 this.border = v1;
		 /* .line 76 */
		 /* new-instance v1, Landroid/graphics/RectF; */
		 /* .line 77 */
		 /* iget v2, p0, Lde/nurogames/android/ticb/base/objects/objShopList;->shop_list_right:F */
		 /* const/high16 v3, 0x40000000 # 2.0f */
		 /* sub-float/2addr v2, v3 */
		 /* .line 78 */
		 /* iget v3, p0, Lde/nurogames/android/ticb/base/objects/objShopList;->shop_list_top:F */
		 /* .line 79 */
		 /* iget v4, p0, Lde/nurogames/android/ticb/base/objects/objShopList;->shop_list_right:F */
		 /* .line 80 */
		 /* iget v5, p0, Lde/nurogames/android/ticb/base/objects/objShopList;->shop_list_bottom:F */
		 /* invoke-direct {v1, v2, v3, v4, v5}, Landroid/graphics/RectF;-><init>(FFFF)V */
		 this.scrollbar_fill = v1;
		 /* .line 81 */
		 /* new-instance v1, Landroid/graphics/RectF; */
		 /* .line 82 */
		 /* iget v2, p0, Lde/nurogames/android/ticb/base/objects/objShopList;->shop_list_right:F */
		 /* const/high16 v3, 0x40000000 # 2.0f */
		 /* sub-float/2addr v2, v3 */
		 /* .line 83 */
		 /* iget v3, p0, Lde/nurogames/android/ticb/base/objects/objShopList;->shop_list_top:F */
		 /* iget v4, p0, Lde/nurogames/android/ticb/base/objects/objShopList;->top_offset:F */
		 /* add-float/2addr v3, v4 */
		 /* .line 84 */
		 /* iget v4, p0, Lde/nurogames/android/ticb/base/objects/objShopList;->shop_list_right:F */
		 /* .line 85 */
		 /* iget v5, p0, Lde/nurogames/android/ticb/base/objects/objShopList;->shop_list_top:F */
		 /* iget v6, p0, Lde/nurogames/android/ticb/base/objects/objShopList;->top_offset:F */
		 /* add-float/2addr v5, v6 */
		 /* iget v6, p0, Lde/nurogames/android/ticb/base/objects/objShopList;->height:F */
		 /* add-float/2addr v5, v6 */
		 /* invoke-direct {v1, v2, v3, v4, v5}, Landroid/graphics/RectF;-><init>(FFFF)V */
		 this.scrollbar_indicator = v1;
		 /* .line 96 */
		 v1 = this.mPaint;
		 int v2 = 1; // const/4 v2, 0x1
		 (( android.graphics.Paint ) v1 ).setAntiAlias ( v2 ); // invoke-virtual {v1, v2}, Landroid/graphics/Paint;->setAntiAlias(Z)V
		 /* .line 97 */
		 v1 = de.nurogames.android.ticb.base.tinysanta.cntx;
		 (( android.content.Context ) v1 ).getAssets ( ); // invoke-virtual {v1}, Landroid/content/Context;->getAssets()Landroid/content/res/AssetManager;
		 final String v2 = "font.otf"; // const-string v2, "font.otf"
		 android.graphics.Typeface .createFromAsset ( v1,v2 );
		 /* .line 98 */
		 /* .local v0, "tf":Landroid/graphics/Typeface; */
		 v1 = this.mPaint;
		 (( android.graphics.Paint ) v1 ).setTypeface ( v0 ); // invoke-virtual {v1, v0}, Landroid/graphics/Paint;->setTypeface(Landroid/graphics/Typeface;)Landroid/graphics/Typeface;
		 /* .line 100 */
		 /* iget-boolean v1, p0, Lde/nurogames/android/ticb/base/objects/objShopList;->FAKE_BOLD:Z */
		 if ( v1 != null) { // if-eqz v1, :cond_0
			 /* .line 101 */
			 v1 = this.mPaint;
			 /* iget-boolean v2, p0, Lde/nurogames/android/ticb/base/objects/objShopList;->FAKE_BOLD:Z */
			 (( android.graphics.Paint ) v1 ).setFakeBoldText ( v2 ); // invoke-virtual {v1, v2}, Landroid/graphics/Paint;->setFakeBoldText(Z)V
			 /* .line 103 */
		 } // :cond_0
		 v1 = de.nurogames.android.ticb.base.tinysanta.cntx;
		 (( android.content.Context ) v1 ).getResources ( ); // invoke-virtual {v1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;
		 this.res = v1;
		 /* .line 105 */
		 v1 = this.res;
		 (( android.content.res.Resources ) v1 ).getIntArray ( v2 ); // invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getIntArray(I)[I
		 /* aget v1, v1, v2 */
		 /* .line 106 */
		 v1 = this.res;
		 (( android.content.res.Resources ) v1 ).getIntArray ( v2 ); // invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getIntArray(I)[I
		 /* aget v1, v1, v2 */
		 /* .line 107 */
		 v1 = this.res;
		 (( android.content.res.Resources ) v1 ).getIntArray ( v2 ); // invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getIntArray(I)[I
		 /* aget v1, v1, v2 */
		 /* .line 108 */
		 v1 = this.res;
		 (( android.content.res.Resources ) v1 ).getIntArray ( v2 ); // invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getIntArray(I)[I
		 /* aget v1, v1, v2 */
		 /* iput v1, p0, Lde/nurogames/android/ticb/base/objects/objShopList;->item_spacing:I */
		 /* .line 110 */
		 v1 = this.res;
		 (( android.content.res.Resources ) v1 ).getStringArray ( v2 ); // invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getStringArray(I)[Ljava/lang/String;
		 /* aget-object v1, v1, v2 */
		 v1 = 		 java.lang.Float .parseFloat ( v1 );
		 /* .line 111 */
		 v1 = this.res;
		 (( android.content.res.Resources ) v1 ).getStringArray ( v2 ); // invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getStringArray(I)[Ljava/lang/String;
		 /* aget-object v1, v1, v2 */
		 v1 = 		 java.lang.Float .parseFloat ( v1 );
		 /* iput v1, p0, Lde/nurogames/android/ticb/base/objects/objShopList;->ICON_BACK_SCALE:F */
		 /* .line 113 */
		 /* iget v1, p0, Lde/nurogames/android/ticb/base/objects/objShopList;->shop_list_bottom:F */
		 /* iget v2, p0, Lde/nurogames/android/ticb/base/objects/objShopList;->shop_list_top:F */
		 /* sub-float/2addr v1, v2 */
		 /* float-to-int v1, v1 */
		 v2 = de.nurogames.android.ticb.base.tinysanta.shopMngr;
		 v2 = 		 (( de.nurogames.android.ticb.base.core.ShopMngr ) v2 ).getShopItemCount ( ); // invoke-virtual {v2}, Lde/nurogames/android/ticb/base/core/ShopMngr;->getShopItemCount()I
		 /* iget v3, p0, Lde/nurogames/android/ticb/base/objects/objShopList;->item_spacing:I */
		 /* mul-int/2addr v2, v3 */
		 /* sub-int/2addr v1, v2 */
		 /* iput v1, p0, Lde/nurogames/android/ticb/base/objects/objShopList;->max_offset:I */
		 /* .line 115 */
		 v1 = this.mPaint;
		 /* int-to-float v2, v2 */
		 (( android.graphics.Paint ) v1 ).setTextSize ( v2 ); // invoke-virtual {v1, v2}, Landroid/graphics/Paint;->setTextSize(F)V
		 /* .line 117 */
		 return;
	 } // .end method
	 /* # virtual methods */
	 public Float Bottom ( ) {
		 /* .locals 1 */
		 /* .prologue */
		 /* .line 225 */
		 /* iget v0, p0, Lde/nurogames/android/ticb/base/objects/objShopList;->shop_list_bottom:F */
	 } // .end method
	 public void Bottom ( Float p0 ) {
		 /* .locals 0 */
		 /* .param p1, "value" # F */
		 /* .prologue */
		 /* .line 224 */
		 /* iput p1, p0, Lde/nurogames/android/ticb/base/objects/objShopList;->shop_list_bottom:F */
		 return;
	 } // .end method
	 public void Hit ( Boolean p0 ) {
		 /* .locals 0 */
		 /* .param p1, "value" # Z */
		 /* .prologue */
		 /* .line 230 */
		 /* iput-boolean p1, p0, Lde/nurogames/android/ticb/base/objects/objShopList;->list_hit:Z */
		 return;
	 } // .end method
	 public Boolean Hit ( ) {
		 /* .locals 1 */
		 /* .prologue */
		 /* .line 231 */
		 /* iget-boolean v0, p0, Lde/nurogames/android/ticb/base/objects/objShopList;->list_hit:Z */
	 } // .end method
	 public Float Left ( ) {
		 /* .locals 1 */
		 /* .prologue */
		 /* .line 219 */
		 /* iget v0, p0, Lde/nurogames/android/ticb/base/objects/objShopList;->shop_list_left:F */
	 } // .end method
	 public void Left ( Integer p0 ) {
		 /* .locals 1 */
		 /* .param p1, "value" # I */
		 /* .prologue */
		 /* .line 218 */
		 /* int-to-float v0, p1 */
		 /* iput v0, p0, Lde/nurogames/android/ticb/base/objects/objShopList;->shop_list_left:F */
		 return;
	 } // .end method
	 public Float Right ( ) {
		 /* .locals 1 */
		 /* .prologue */
		 /* .line 228 */
		 /* iget v0, p0, Lde/nurogames/android/ticb/base/objects/objShopList;->shop_list_right:F */
	 } // .end method
	 public void Right ( Integer p0 ) {
		 /* .locals 1 */
		 /* .param p1, "value" # I */
		 /* .prologue */
		 /* .line 227 */
		 /* int-to-float v0, p1 */
		 /* iput v0, p0, Lde/nurogames/android/ticb/base/objects/objShopList;->shop_list_right:F */
		 return;
	 } // .end method
	 public Float Top ( ) {
		 /* .locals 1 */
		 /* .prologue */
		 /* .line 222 */
		 /* iget v0, p0, Lde/nurogames/android/ticb/base/objects/objShopList;->shop_list_top:F */
	 } // .end method
	 public void Top ( Float p0 ) {
		 /* .locals 0 */
		 /* .param p1, "value" # F */
		 /* .prologue */
		 /* .line 221 */
		 /* iput p1, p0, Lde/nurogames/android/ticb/base/objects/objShopList;->shop_list_top:F */
		 return;
	 } // .end method
	 public Integer item_spacing ( ) {
		 /* .locals 1 */
		 /* .prologue */
		 /* .line 243 */
		 /* iget v0, p0, Lde/nurogames/android/ticb/base/objects/objShopList;->item_spacing:I */
	 } // .end method
	 public void item_spacing ( Integer p0 ) {
		 /* .locals 0 */
		 /* .param p1, "value" # I */
		 /* .prologue */
		 /* .line 242 */
		 /* iput p1, p0, Lde/nurogames/android/ticb/base/objects/objShopList;->item_spacing:I */
		 return;
	 } // .end method
	 public Integer max_offset ( ) {
		 /* .locals 1 */
		 /* .prologue */
		 /* .line 240 */
		 /* iget v0, p0, Lde/nurogames/android/ticb/base/objects/objShopList;->max_offset:I */
	 } // .end method
	 public void max_offset ( Integer p0 ) {
		 /* .locals 0 */
		 /* .param p1, "value" # I */
		 /* .prologue */
		 /* .line 239 */
		 /* iput p1, p0, Lde/nurogames/android/ticb/base/objects/objShopList;->max_offset:I */
		 return;
	 } // .end method
	 public void onDraw ( android.graphics.Canvas p0 ) {
		 /* .locals 10 */
		 /* .param p1, "g" # Landroid/graphics/Canvas; */
		 /* .prologue */
		 int v9 = 0; // const/4 v9, 0x0
		 /* const/high16 v8, 0x42c80000 # 100.0f */
		 /* const/16 v3, 0x7f */
		 /* const/high16 v2, 0x41400000 # 12.0f */
		 /* const/high16 v7, 0x40000000 # 2.0f */
		 /* .line 122 */
		 v0 = this.mPaint;
		 v1 = android.graphics.Paint$Style.FILL;
		 (( android.graphics.Paint ) v0 ).setStyle ( v1 ); // invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setStyle(Landroid/graphics/Paint$Style;)V
		 /* .line 123 */
		 v0 = this.mPaint;
		 v1 = 		 android.graphics.Color .argb ( v3,v3,v3,v3 );
		 (( android.graphics.Paint ) v0 ).setColor ( v1 ); // invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setColor(I)V
		 /* .line 124 */
		 v0 = this.box;
		 v1 = this.mPaint;
		 (( android.graphics.Canvas ) p1 ).drawRoundRect ( v0, v2, v2, v1 ); // invoke-virtual {p1, v0, v2, v2, v1}, Landroid/graphics/Canvas;->drawRoundRect(Landroid/graphics/RectF;FFLandroid/graphics/Paint;)V
		 /* .line 126 */
		 v0 = this.mPaint;
		 v1 = android.graphics.Paint$Style.STROKE;
		 (( android.graphics.Paint ) v0 ).setStyle ( v1 ); // invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setStyle(Landroid/graphics/Paint$Style;)V
		 /* .line 127 */
		 v0 = this.mPaint;
		 /* const/high16 v1, -0x1000000 */
		 (( android.graphics.Paint ) v0 ).setColor ( v1 ); // invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setColor(I)V
		 /* .line 128 */
		 v0 = this.border;
		 v1 = this.mPaint;
		 (( android.graphics.Canvas ) p1 ).drawRoundRect ( v0, v2, v2, v1 ); // invoke-virtual {p1, v0, v2, v2, v1}, Landroid/graphics/Canvas;->drawRoundRect(Landroid/graphics/RectF;FFLandroid/graphics/Paint;)V
		 /* .line 130 */
		 v0 = this.mPaint;
		 v1 = android.graphics.Paint$Style.FILL;
		 (( android.graphics.Paint ) v0 ).setStyle ( v1 ); // invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setStyle(Landroid/graphics/Paint$Style;)V
		 /* .line 134 */
		 /* iget v1, p0, Lde/nurogames/android/ticb/base/objects/objShopList;->shop_list_left:F */
		 /* .line 135 */
		 /* iget v2, p0, Lde/nurogames/android/ticb/base/objects/objShopList;->shop_list_top:F */
		 /* .line 136 */
		 /* iget v3, p0, Lde/nurogames/android/ticb/base/objects/objShopList;->shop_list_right:F */
		 /* .line 137 */
		 /* iget v4, p0, Lde/nurogames/android/ticb/base/objects/objShopList;->shop_list_bottom:F */
		 /* .line 138 */
		 v5 = android.graphics.Region$Op.REPLACE;
		 /* move-object v0, p1 */
		 /* .line 133 */
		 /* invoke-virtual/range {v0 ..v5}, Landroid/graphics/Canvas;->clipRect(FFFFLandroid/graphics/Region$Op;)Z */
		 /* .line 141 */
		 v0 = de.nurogames.android.ticb.base.tinysanta.shopMngr;
		 v0 = 		 (( de.nurogames.android.ticb.base.core.ShopMngr ) v0 ).getShopItemCount ( ); // invoke-virtual {v0}, Lde/nurogames/android/ticb/base/core/ShopMngr;->getShopItemCount()I
		 /* iput v0, p0, Lde/nurogames/android/ticb/base/objects/objShopList;->item_count:I */
		 /* .line 142 */
		 int v6 = 0; // const/4 v6, 0x0
		 /* .local v6, "x":I */
	 } // :goto_0
	 /* iget v0, p0, Lde/nurogames/android/ticb/base/objects/objShopList;->item_count:I */
	 /* if-lt v6, v0, :cond_0 */
	 /* .line 189 */
	 v0 = de.nurogames.android.ticb.base.tinysanta.shopMngr;
	 v0 = 	 (( de.nurogames.android.ticb.base.core.ShopMngr ) v0 ).getShopItemCount ( ); // invoke-virtual {v0}, Lde/nurogames/android/ticb/base/core/ShopMngr;->getShopItemCount()I
	 /* iget v1, p0, Lde/nurogames/android/ticb/base/objects/objShopList;->item_spacing:I */
	 /* mul-int/2addr v0, v1 */
	 /* int-to-float v0, v0 */
	 /* iput v0, p0, Lde/nurogames/android/ticb/base/objects/objShopList;->total_list_height:F */
	 /* .line 192 */
	 /* iget v0, p0, Lde/nurogames/android/ticb/base/objects/objShopList;->shop_list_bottom:F */
	 /* iget v1, p0, Lde/nurogames/android/ticb/base/objects/objShopList;->shop_list_top:F */
	 /* sub-float/2addr v0, v1 */
	 /* iput v0, p0, Lde/nurogames/android/ticb/base/objects/objShopList;->total_visible_height:F */
	 /* .line 195 */
	 /* iget v0, p0, Lde/nurogames/android/ticb/base/objects/objShopList;->total_visible_height:F */
	 /* iget v1, p0, Lde/nurogames/android/ticb/base/objects/objShopList;->total_list_height:F */
	 /* div-float/2addr v1, v8 */
	 /* div-float/2addr v0, v1 */
	 /* iput v0, p0, Lde/nurogames/android/ticb/base/objects/objShopList;->perc_visible:F */
	 /* .line 198 */
	 /* iget v0, p0, Lde/nurogames/android/ticb/base/objects/objShopList;->total_visible_height:F */
	 /* iget v1, p0, Lde/nurogames/android/ticb/base/objects/objShopList;->perc_visible:F */
	 /* div-float/2addr v1, v8 */
	 /* mul-float/2addr v0, v1 */
	 /* iput v0, p0, Lde/nurogames/android/ticb/base/objects/objShopList;->height:F */
	 /* .line 199 */
	 /* iget v0, p0, Lde/nurogames/android/ticb/base/objects/objShopList;->y_offset:F */
	 v0 = 	 java.lang.Math .abs ( v0 );
	 /* iget v1, p0, Lde/nurogames/android/ticb/base/objects/objShopList;->perc_visible:F */
	 /* div-float/2addr v1, v8 */
	 /* mul-float/2addr v0, v1 */
	 /* iput v0, p0, Lde/nurogames/android/ticb/base/objects/objShopList;->top_offset:F */
	 /* .line 202 */
	 v0 = this.mPaint;
	 int v1 = -1; // const/4 v1, -0x1
	 (( android.graphics.Paint ) v0 ).setColor ( v1 ); // invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setColor(I)V
	 /* .line 204 */
	 v0 = this.scrollbar_fill;
	 /* .line 206 */
	 v1 = this.mPaint;
	 /* .line 203 */
	 (( android.graphics.Canvas ) p1 ).drawRoundRect ( v0, v7, v7, v1 ); // invoke-virtual {p1, v0, v7, v7, v1}, Landroid/graphics/Canvas;->drawRoundRect(Landroid/graphics/RectF;FFLandroid/graphics/Paint;)V
	 /* .line 208 */
	 v0 = this.mPaint;
	 /* const/16 v1, 0x56 */
	 /* const/16 v2, 0x48 */
	 int v3 = 4; // const/4 v3, 0x4
	 v1 = 	 android.graphics.Color .rgb ( v1,v2,v3 );
	 (( android.graphics.Paint ) v0 ).setColor ( v1 ); // invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setColor(I)V
	 /* .line 210 */
	 v0 = this.scrollbar_indicator;
	 /* .line 212 */
	 v1 = this.mPaint;
	 /* .line 209 */
	 (( android.graphics.Canvas ) p1 ).drawRoundRect ( v0, v7, v7, v1 ); // invoke-virtual {p1, v0, v7, v7, v1}, Landroid/graphics/Canvas;->drawRoundRect(Landroid/graphics/RectF;FFLandroid/graphics/Paint;)V
	 /* .line 214 */
	 /* int-to-float v3, v0 */
	 /* int-to-float v4, v0 */
	 v5 = android.graphics.Region$Op.REPLACE;
	 /* move-object v0, p1 */
	 /* move v1, v9 */
	 /* move v2, v9 */
	 /* invoke-virtual/range {v0 ..v5}, Landroid/graphics/Canvas;->clipRect(FFFFLandroid/graphics/Region$Op;)Z */
	 /* .line 216 */
	 return;
	 /* .line 144 */
} // :cond_0
(( android.graphics.Canvas ) p1 ).save ( ); // invoke-virtual {p1}, Landroid/graphics/Canvas;->save()I
/* .line 145 */
(( android.graphics.Canvas ) p1 ).scale ( v0, v1 ); // invoke-virtual {p1, v0, v1}, Landroid/graphics/Canvas;->scale(FF)V
/* .line 148 */
v0 = de.nurogames.android.ticb.base.core.ShopMngr.shopItems;
(( java.util.Vector ) v0 ).elementAt ( v6 ); // invoke-virtual {v0, v6}, Ljava/util/Vector;->elementAt(I)Ljava/lang/Object;
/* check-cast v0, Lde/nurogames/android/ticb/base/core/ShopElement; */
(( de.nurogames.android.ticb.base.core.ShopElement ) v0 ).Icon ( ); // invoke-virtual {v0}, Lde/nurogames/android/ticb/base/core/ShopElement;->Icon()Landroid/graphics/Bitmap;
if ( v0 != null) { // if-eqz v0, :cond_1
	 /* .line 150 */
	 v0 = de.nurogames.android.ticb.base.core.ShopMngr.shopItems;
	 (( java.util.Vector ) v0 ).elementAt ( v6 ); // invoke-virtual {v0, v6}, Ljava/util/Vector;->elementAt(I)Ljava/lang/Object;
	 /* check-cast v0, Lde/nurogames/android/ticb/base/core/ShopElement; */
	 (( de.nurogames.android.ticb.base.core.ShopElement ) v0 ).Icon ( ); // invoke-virtual {v0}, Lde/nurogames/android/ticb/base/core/ShopElement;->Icon()Landroid/graphics/Bitmap;
	 /* .line 151 */
	 /* iget v1, p0, Lde/nurogames/android/ticb/base/objects/objShopList;->shop_list_left:F */
	 /* const/high16 v2, 0x40c00000 # 6.0f */
	 /* add-float/2addr v1, v2 */
	 /* iget v2, p0, Lde/nurogames/android/ticb/base/objects/objShopList;->ICON_BACK_SCALE:F */
	 /* mul-float/2addr v1, v2 */
	 /* .line 152 */
	 /* iget v2, p0, Lde/nurogames/android/ticb/base/objects/objShopList;->shop_list_top:F */
	 /* float-to-int v2, v2 */
	 /* add-int/lit8 v2, v2, 0x4 */
	 /* iget v3, p0, Lde/nurogames/android/ticb/base/objects/objShopList;->item_spacing:I */
	 /* mul-int/2addr v3, v6 */
	 /* add-int/2addr v2, v3 */
	 /* int-to-float v2, v2 */
	 /* iget v3, p0, Lde/nurogames/android/ticb/base/objects/objShopList;->y_offset:F */
	 /* add-float/2addr v2, v3 */
	 /* iget v3, p0, Lde/nurogames/android/ticb/base/objects/objShopList;->ICON_BACK_SCALE:F */
	 /* mul-float/2addr v2, v3 */
	 /* .line 153 */
	 int v3 = 0; // const/4 v3, 0x0
	 /* .line 149 */
	 (( android.graphics.Canvas ) p1 ).drawBitmap ( v0, v1, v2, v3 ); // invoke-virtual {p1, v0, v1, v2, v3}, Landroid/graphics/Canvas;->drawBitmap(Landroid/graphics/Bitmap;FFLandroid/graphics/Paint;)V
	 /* .line 155 */
} // :cond_1
(( android.graphics.Canvas ) p1 ).restore ( ); // invoke-virtual {p1}, Landroid/graphics/Canvas;->restore()V
/* .line 157 */
/* iget v0, p0, Lde/nurogames/android/ticb/base/objects/objShopList;->selected_list_item_id:I */
/* if-ne v0, v6, :cond_2 */
/* .line 158 */
v0 = this.mPaint;
/* iget v1, p0, Lde/nurogames/android/ticb/base/objects/objShopList;->color_selected_item:I */
(( android.graphics.Paint ) v0 ).setColor ( v1 ); // invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setColor(I)V
/* .line 164 */
} // :goto_1
v0 = de.nurogames.android.ticb.base.core.ShopMngr.shopItems;
(( java.util.Vector ) v0 ).elementAt ( v6 ); // invoke-virtual {v0, v6}, Ljava/util/Vector;->elementAt(I)Ljava/lang/Object;
/* check-cast v0, Lde/nurogames/android/ticb/base/core/ShopElement; */
(( de.nurogames.android.ticb.base.core.ShopElement ) v0 ).Name ( ); // invoke-virtual {v0}, Lde/nurogames/android/ticb/base/core/ShopElement;->Name()Ljava/lang/String;
/* .line 165 */
/* iget v1, p0, Lde/nurogames/android/ticb/base/objects/objShopList;->shop_list_left:F */
/* int-to-float v2, v2 */
/* add-float/2addr v1, v2 */
/* .line 166 */
/* iget v2, p0, Lde/nurogames/android/ticb/base/objects/objShopList;->shop_list_top:F */
/* int-to-float v3, v3 */
/* const/high16 v4, 0x3fc00000 # 1.5f */
/* mul-float/2addr v3, v4 */
/* add-float/2addr v2, v3 */
/* iget v3, p0, Lde/nurogames/android/ticb/base/objects/objShopList;->item_spacing:I */
/* mul-int/2addr v3, v6 */
/* int-to-float v3, v3 */
/* add-float/2addr v2, v3 */
/* iget v3, p0, Lde/nurogames/android/ticb/base/objects/objShopList;->y_offset:F */
/* add-float/2addr v2, v3 */
/* .line 167 */
v3 = this.mPaint;
/* .line 163 */
(( android.graphics.Canvas ) p1 ).drawText ( v0, v1, v2, v3 ); // invoke-virtual {p1, v0, v1, v2, v3}, Landroid/graphics/Canvas;->drawText(Ljava/lang/String;FFLandroid/graphics/Paint;)V
/* .line 171 */
v0 = de.nurogames.android.ticb.base.core.ShopMngr.shopItems;
(( java.util.Vector ) v0 ).elementAt ( v6 ); // invoke-virtual {v0, v6}, Ljava/util/Vector;->elementAt(I)Ljava/lang/Object;
/* check-cast v0, Lde/nurogames/android/ticb/base/core/ShopElement; */
(( de.nurogames.android.ticb.base.core.ShopElement ) v0 ).Price ( ); // invoke-virtual {v0}, Lde/nurogames/android/ticb/base/core/ShopElement;->Price()Ljava/lang/String;
/* .line 172 */
/* iget v1, p0, Lde/nurogames/android/ticb/base/objects/objShopList;->shop_list_left:F */
/* int-to-float v2, v2 */
/* add-float/2addr v1, v2 */
/* .line 173 */
/* iget v2, p0, Lde/nurogames/android/ticb/base/objects/objShopList;->shop_list_top:F */
/* int-to-float v3, v3 */
/* const/high16 v4, 0x3fc00000 # 1.5f */
/* mul-float/2addr v3, v4 */
/* add-float/2addr v2, v3 */
/* iget v3, p0, Lde/nurogames/android/ticb/base/objects/objShopList;->item_spacing:I */
/* mul-int/2addr v3, v6 */
/* int-to-float v3, v3 */
/* add-float/2addr v2, v3 */
/* iget v3, p0, Lde/nurogames/android/ticb/base/objects/objShopList;->y_offset:F */
/* add-float/2addr v2, v3 */
/* .line 174 */
v3 = this.mPaint;
/* .line 170 */
(( android.graphics.Canvas ) p1 ).drawText ( v0, v1, v2, v3 ); // invoke-virtual {p1, v0, v1, v2, v3}, Landroid/graphics/Canvas;->drawText(Ljava/lang/String;FFLandroid/graphics/Paint;)V
/* .line 177 */
v0 = this.mPaint;
/* iget v1, p0, Lde/nurogames/android/ticb/base/objects/objShopList;->color_spacer:I */
(( android.graphics.Paint ) v0 ).setColor ( v1 ); // invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setColor(I)V
/* .line 179 */
/* iget v0, p0, Lde/nurogames/android/ticb/base/objects/objShopList;->shop_list_left:F */
/* const/high16 v1, 0x40800000 # 4.0f */
/* add-float/2addr v1, v0 */
/* .line 180 */
/* iget v0, p0, Lde/nurogames/android/ticb/base/objects/objShopList;->shop_list_top:F */
/* iget v2, p0, Lde/nurogames/android/ticb/base/objects/objShopList;->item_spacing:I */
/* int-to-float v2, v2 */
/* add-float/2addr v0, v2 */
/* iget v2, p0, Lde/nurogames/android/ticb/base/objects/objShopList;->item_spacing:I */
/* mul-int/2addr v2, v6 */
/* int-to-float v2, v2 */
/* add-float/2addr v0, v2 */
/* iget v2, p0, Lde/nurogames/android/ticb/base/objects/objShopList;->y_offset:F */
/* add-float/2addr v2, v0 */
/* .line 181 */
/* iget v0, p0, Lde/nurogames/android/ticb/base/objects/objShopList;->shop_list_right:F */
/* const/high16 v3, 0x40800000 # 4.0f */
/* sub-float v3, v0, v3 */
/* .line 182 */
/* iget v0, p0, Lde/nurogames/android/ticb/base/objects/objShopList;->shop_list_top:F */
/* iget v4, p0, Lde/nurogames/android/ticb/base/objects/objShopList;->item_spacing:I */
/* int-to-float v4, v4 */
/* add-float/2addr v0, v4 */
/* iget v4, p0, Lde/nurogames/android/ticb/base/objects/objShopList;->item_spacing:I */
/* mul-int/2addr v4, v6 */
/* int-to-float v4, v4 */
/* add-float/2addr v0, v4 */
/* iget v4, p0, Lde/nurogames/android/ticb/base/objects/objShopList;->y_offset:F */
/* add-float/2addr v4, v0 */
/* .line 183 */
v5 = this.mPaint;
/* move-object v0, p1 */
/* .line 178 */
/* invoke-virtual/range {v0 ..v5}, Landroid/graphics/Canvas;->drawLine(FFFFLandroid/graphics/Paint;)V */
/* .line 142 */
/* add-int/lit8 v6, v6, 0x1 */
/* goto/16 :goto_0 */
/* .line 160 */
} // :cond_2
v0 = this.mPaint;
/* iget v1, p0, Lde/nurogames/android/ticb/base/objects/objShopList;->color_normal_item:I */
(( android.graphics.Paint ) v0 ).setColor ( v1 ); // invoke-virtual {v0, v1}, Landroid/graphics/Paint;->setColor(I)V
/* goto/16 :goto_1 */
} // .end method
public Integer selectedItem ( ) {
/* .locals 1 */
/* .prologue */
/* .line 234 */
/* iget v0, p0, Lde/nurogames/android/ticb/base/objects/objShopList;->selected_list_item_id:I */
} // .end method
public void selectedItem ( Integer p0 ) {
/* .locals 0 */
/* .param p1, "value" # I */
/* .prologue */
/* .line 233 */
/* iput p1, p0, Lde/nurogames/android/ticb/base/objects/objShopList;->selected_list_item_id:I */
return;
} // .end method
public Float y_offset ( ) {
/* .locals 1 */
/* .prologue */
/* .line 237 */
/* iget v0, p0, Lde/nurogames/android/ticb/base/objects/objShopList;->y_offset:F */
} // .end method
public void y_offset ( Float p0 ) {
/* .locals 0 */
/* .param p1, "value" # F */
/* .prologue */
/* .line 236 */
/* iput p1, p0, Lde/nurogames/android/ticb/base/objects/objShopList;->y_offset:F */
return;
} // .end method
