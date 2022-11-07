public class de.nurogames.android.ticb.base.core.ShopMngr {
	 /* .source "ShopMngr.java" */
	 /* # static fields */
	 public static java.lang.String proversion_package;
	 public static java.util.Vector shopItems;
	 /* .annotation system Ldalvik/annotation/Signature; */
	 /* value = { */
	 /* "Ljava/util/Vector", */
	 /* "<", */
	 /* "Lde/nurogames/android/ticb/base/core/ShopElement;", */
	 /* ">;" */
	 /* } */
} // .end annotation
} // .end field
/* # instance fields */
private final java.lang.String KEY_SETTINGS;
private Integer count;
private android.app.Activity mAct;
private Integer mAppID;
private Boolean mHasProVersion;
private Boolean newest_shown;
private java.lang.String shop_url;
private java.util.Vector values;
/* .annotation system Ldalvik/annotation/Signature; */
/* value = { */
/* "Ljava/util/Vector", */
/* "<", */
/* "Ljava/lang/Integer;", */
/* ">;" */
/* } */
} // .end annotation
} // .end field
/* # direct methods */
static de.nurogames.android.ticb.base.core.ShopMngr ( ) {
/* .locals 1 */
/* .prologue */
/* .line 44 */
/* new-instance v0, Ljava/util/Vector; */
/* invoke-direct {v0}, Ljava/util/Vector;-><init>()V */
/* .line 54 */
final String v0 = ""; // const-string v0, ""
return;
} // .end method
public de.nurogames.android.ticb.base.core.ShopMngr ( ) {
/* .locals 2 */
/* .param p1, "APP_ID" # I */
/* .param p2, "secret" # I */
/* .param p3, "hasProVersion" # Z */
/* .param p4, "av" # Landroid/app/Activity; */
/* .prologue */
int v1 = 0; // const/4 v1, 0x0
/* .line 73 */
/* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
/* .line 47 */
final String v0 = "NURO_SHOP"; // const-string v0, "NURO_SHOP"
this.KEY_SETTINGS = v0;
/* .line 51 */
/* iput v1, p0, Lde/nurogames/android/ticb/base/core/ShopMngr;->count:I */
/* .line 56 */
/* const/16 v0, 0xf */
/* iput v0, p0, Lde/nurogames/android/ticb/base/core/ShopMngr;->mAppID:I */
/* .line 60 */
final String v0 = "http://appi.nurogames.com/appi"; // const-string v0, "http://appi.nurogames.com/appi"
this.shop_url = v0;
/* .line 62 */
/* iput-boolean v1, p0, Lde/nurogames/android/ticb/base/core/ShopMngr;->newest_shown:Z */
/* .line 76 */
v0 = de.nurogames.android.ticb.base.core.ShopMngr.shopItems;
(( java.util.Vector ) v0 ).clear ( ); // invoke-virtual {v0}, Ljava/util/Vector;->clear()V
/* .line 79 */
this.mAct = p4;
/* .line 84 */
/* iput-boolean p3, p0, Lde/nurogames/android/ticb/base/core/ShopMngr;->mHasProVersion:Z */
/* .line 86 */
/* new-instance v0, Ljava/util/Vector; */
/* invoke-direct {v0}, Ljava/util/Vector;-><init>()V */
this.values = v0;
/* .line 88 */
return;
} // .end method
static void access$0 ( de.nurogames.android.ticb.base.core.ShopMngr p0, Boolean p1 ) { //synthethic
/* .locals 0 */
/* .prologue */
/* .line 62 */
/* iput-boolean p1, p0, Lde/nurogames/android/ticb/base/core/ShopMngr;->newest_shown:Z */
return;
} // .end method
static android.app.Activity access$1 ( de.nurogames.android.ticb.base.core.ShopMngr p0 ) { //synthethic
/* .locals 1 */
/* .prologue */
/* .line 41 */
v0 = this.mAct;
} // .end method
public static java.lang.String base64Encode ( java.lang.String p0 ) {
/* .locals 3 */
/* .param p0, "s" # Ljava/lang/String; */
/* .prologue */
/* .line 289 */
/* new-instance v0, Ljava/io/ByteArrayOutputStream; */
/* invoke-direct {v0}, Ljava/io/ByteArrayOutputStream;-><init>()V */
/* .line 290 */
/* .local v0, "bOut":Ljava/io/ByteArrayOutputStream; */
/* new-instance v1, Lde/nurogames/android/ticb/base/core/Base64OutputStream; */
/* invoke-direct {v1, v0}, Lde/nurogames/android/ticb/base/core/Base64OutputStream;-><init>(Ljava/io/OutputStream;)V */
/* .line 292 */
/* .local v1, "out":Lde/nurogames/android/ticb/base/core/Base64OutputStream; */
try { // :try_start_0
(( java.lang.String ) p0 ).getBytes ( ); // invoke-virtual {p0}, Ljava/lang/String;->getBytes()[B
(( de.nurogames.android.ticb.base.core.Base64OutputStream ) v1 ).write ( v2 ); // invoke-virtual {v1, v2}, Lde/nurogames/android/ticb/base/core/Base64OutputStream;->write([B)V
/* .line 293 */
(( de.nurogames.android.ticb.base.core.Base64OutputStream ) v1 ).flush ( ); // invoke-virtual {v1}, Lde/nurogames/android/ticb/base/core/Base64OutputStream;->flush()V
/* .line 294 */
(( de.nurogames.android.ticb.base.core.Base64OutputStream ) v1 ).close ( ); // invoke-virtual {v1}, Lde/nurogames/android/ticb/base/core/Base64OutputStream;->close()V
/* :try_end_0 */
/* .catch Ljava/io/IOException; {:try_start_0 ..:try_end_0} :catch_0 */
/* .line 297 */
} // :goto_0
(( java.io.ByteArrayOutputStream ) v0 ).toString ( ); // invoke-virtual {v0}, Ljava/io/ByteArrayOutputStream;->toString()Ljava/lang/String;
/* .line 296 */
/* :catch_0 */
/* move-exception v2 */
} // .end method
/* # virtual methods */
public void addPromotedIDs ( Integer p0 ) {
/* .locals 5 */
/* .param p1, "id" # I */
/* .prologue */
int v4 = 0; // const/4 v4, 0x0
/* .line 262 */
v2 = this.mAct;
final String v3 = "NURO_SHOP"; // const-string v3, "NURO_SHOP"
(( android.app.Activity ) v2 ).getSharedPreferences ( v3, v4 ); // invoke-virtual {v2, v3, v4}, Landroid/app/Activity;->getSharedPreferences(Ljava/lang/String;I)Landroid/content/SharedPreferences;
/* .line 263 */
/* .local v1, "settings":Landroid/content/SharedPreferences; */
/* .line 265 */
/* .local v0, "editor":Landroid/content/SharedPreferences$Editor; */
final String v2 = "cnt"; // const-string v2, "cnt"
v3 = final String v3 = "cnt"; // const-string v3, "cnt"
/* add-int/lit8 v3, v3, 0x1 */
/* .line 266 */
/* new-instance v2, Ljava/lang/StringBuilder; */
final String v3 = "APPID:"; // const-string v3, "APPID:"
/* invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V */
/* iget v3, p0, Lde/nurogames/android/ticb/base/core/ShopMngr;->count:I */
(( java.lang.StringBuilder ) v2 ).append ( v3 ); // invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v2 ).toString ( ); // invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
/* .line 269 */
/* .line 271 */
return;
} // .end method
public void clearPromoIDs ( ) {
/* .locals 5 */
/* .prologue */
/* .line 277 */
v2 = this.mAct;
final String v3 = "NURO_SHOP"; // const-string v3, "NURO_SHOP"
int v4 = 0; // const/4 v4, 0x0
(( android.app.Activity ) v2 ).getSharedPreferences ( v3, v4 ); // invoke-virtual {v2, v3, v4}, Landroid/app/Activity;->getSharedPreferences(Ljava/lang/String;I)Landroid/content/SharedPreferences;
/* .line 278 */
/* .local v1, "settings":Landroid/content/SharedPreferences; */
/* .line 280 */
/* .local v0, "editor":Landroid/content/SharedPreferences$Editor; */
/* .line 283 */
/* .line 286 */
return;
} // .end method
public void getBrandNew ( ) {
/* .locals 20 */
/* .prologue */
/* .line 95 */
/* move-object/from16 v0, p0 */
/* iget-boolean v0, v0, Lde/nurogames/android/ticb/base/core/ShopMngr;->newest_shown:Z */
/* move/from16 v16, v0 */
/* if-nez v16, :cond_0 */
/* .line 98 */
/* invoke-virtual/range {p0 ..p0}, Lde/nurogames/android/ticb/base/core/ShopMngr;->clearPromoIDs()V */
/* .line 99 */
/* invoke-virtual/range {p0 ..p0}, Lde/nurogames/android/ticb/base/core/ShopMngr;->loadPromotedIDs()V */
/* .line 101 */
int v15 = 0; // const/4 v15, 0x0
/* .local v15, "x":I */
} // :goto_0
v16 = de.nurogames.android.ticb.base.core.ShopMngr.shopItems;
v16 = /* invoke-virtual/range {v16 ..v16}, Ljava/util/Vector;->size()I */
/* move/from16 v0, v16 */
/* if-lt v15, v0, :cond_1 */
/* .line 174 */
} // .end local v15 # "x":I
} // :cond_0
} // :goto_1
return;
/* .line 107 */
/* .restart local v15 # "x":I */
} // :cond_1
try { // :try_start_0
/* new-instance v12, Ljava/util/Date; */
java.lang.System .currentTimeMillis ( );
/* move-result-wide v16 */
/* move-wide/from16 v0, v16 */
/* invoke-direct {v12, v0, v1}, Ljava/util/Date;-><init>(J)V */
/* .line 109 */
/* .local v12, "now":Ljava/util/Date; */
/* new-instance v9, Ljava/util/Date; */
v16 = de.nurogames.android.ticb.base.core.ShopMngr.shopItems;
/* move-object/from16 v0, v16 */
(( java.util.Vector ) v0 ).elementAt ( v15 ); // invoke-virtual {v0, v15}, Ljava/util/Vector;->elementAt(I)Ljava/lang/Object;
/* check-cast v16, Lde/nurogames/android/ticb/base/core/ShopElement; */
/* invoke-virtual/range {v16 ..v16}, Lde/nurogames/android/ticb/base/core/ShopElement;->IsPromoTill()Ljava/lang/String; */
/* invoke-static/range {v16 ..v16}, Ljava/lang/Long;->parseLong(Ljava/lang/String;)J */
/* move-result-wide v16 */
/* const-wide/32 v18, 0x48190800 */
/* add-long v16, v16, v18 */
/* move-wide/from16 v0, v16 */
/* invoke-direct {v9, v0, v1}, Ljava/util/Date;-><init>(J)V */
/* .line 115 */
/* .local v9, "in2weeks":Ljava/util/Date; */
int v7 = 0; // const/4 v7, 0x0
/* .line 116 */
/* .local v7, "ignore":Z */
int v11 = 0; // const/4 v11, 0x0
/* .local v11, "n":I */
} // :goto_2
/* move-object/from16 v0, p0 */
v0 = this.values;
/* move-object/from16 v16, v0 */
v16 = /* invoke-virtual/range {v16 ..v16}, Ljava/util/Vector;->size()I */
/* move/from16 v0, v16 */
/* if-lt v11, v0, :cond_3 */
/* .line 122 */
v16 = (( java.util.Date ) v12 ).before ( v9 ); // invoke-virtual {v12, v9}, Ljava/util/Date;->before(Ljava/util/Date;)Z
if ( v16 != null) { // if-eqz v16, :cond_2
/* if-nez v7, :cond_2 */
/* move-object/from16 v0, p0 */
/* iget v0, v0, Lde/nurogames/android/ticb/base/core/ShopMngr;->mAppID:I */
/* move/from16 v17, v0 */
v16 = de.nurogames.android.ticb.base.core.ShopMngr.shopItems;
/* move-object/from16 v0, v16 */
(( java.util.Vector ) v0 ).elementAt ( v15 ); // invoke-virtual {v0, v15}, Ljava/util/Vector;->elementAt(I)Ljava/lang/Object;
/* check-cast v16, Lde/nurogames/android/ticb/base/core/ShopElement; */
v16 = /* invoke-virtual/range {v16 ..v16}, Lde/nurogames/android/ticb/base/core/ShopElement;->ID()I */
/* move/from16 v0, v17 */
/* move/from16 v1, v16 */
/* if-eq v0, v1, :cond_2 */
/* .line 124 */
v16 = de.nurogames.android.ticb.base.core.ShopMngr.shopItems;
/* move-object/from16 v0, v16 */
(( java.util.Vector ) v0 ).elementAt ( v15 ); // invoke-virtual {v0, v15}, Ljava/util/Vector;->elementAt(I)Ljava/lang/Object;
/* check-cast v16, Lde/nurogames/android/ticb/base/core/ShopElement; */
v16 = /* invoke-virtual/range {v16 ..v16}, Lde/nurogames/android/ticb/base/core/ShopElement;->ID()I */
/* move-object/from16 v0, p0 */
/* move/from16 v1, v16 */
(( de.nurogames.android.ticb.base.core.ShopMngr ) v0 ).addPromotedIDs ( v1 ); // invoke-virtual {v0, v1}, Lde/nurogames/android/ticb/base/core/ShopMngr;->addPromotedIDs(I)V
/* .line 126 */
/* new-instance v4, Landroid/app/Dialog; */
/* move-object/from16 v0, p0 */
v0 = this.mAct;
/* move-object/from16 v16, v0 */
/* move-object/from16 v0, v16 */
/* invoke-direct {v4, v0}, Landroid/app/Dialog;-><init>(Landroid/content/Context;)V */
/* .line 128 */
/* .local v4, "dialog":Landroid/app/Dialog; */
/* move/from16 v0, v16 */
(( android.app.Dialog ) v4 ).setContentView ( v0 ); // invoke-virtual {v4, v0}, Landroid/app/Dialog;->setContentView(I)V
/* .line 129 */
/* move-object/from16 v0, p0 */
v0 = this.mAct;
/* move-object/from16 v16, v0 */
/* invoke-virtual/range {v16 ..v16}, Landroid/app/Activity;->getResources()Landroid/content/res/Resources; */
/* invoke-virtual/range {v16 ..v17}, Landroid/content/res/Resources;->getStringArray(I)[Ljava/lang/String; */
/* aget-object v16, v16, v17 */
/* move-object/from16 v0, v16 */
(( android.app.Dialog ) v4 ).setTitle ( v0 ); // invoke-virtual {v4, v0}, Landroid/app/Dialog;->setTitle(Ljava/lang/CharSequence;)V
/* .line 131 */
/* move/from16 v0, v16 */
(( android.app.Dialog ) v4 ).findViewById ( v0 ); // invoke-virtual {v4, v0}, Landroid/app/Dialog;->findViewById(I)Landroid/view/View;
/* check-cast v8, Landroid/widget/ImageView; */
/* .line 132 */
/* .local v8, "image":Landroid/widget/ImageView; */
v16 = de.nurogames.android.ticb.base.core.ShopMngr.shopItems;
/* move-object/from16 v0, v16 */
(( java.util.Vector ) v0 ).elementAt ( v15 ); // invoke-virtual {v0, v15}, Ljava/util/Vector;->elementAt(I)Ljava/lang/Object;
/* check-cast v16, Lde/nurogames/android/ticb/base/core/ShopElement; */
/* invoke-virtual/range {v16 ..v16}, Lde/nurogames/android/ticb/base/core/ShopElement;->Icon()Landroid/graphics/Bitmap; */
/* move-object/from16 v0, v16 */
(( android.widget.ImageView ) v8 ).setImageBitmap ( v0 ); // invoke-virtual {v8, v0}, Landroid/widget/ImageView;->setImageBitmap(Landroid/graphics/Bitmap;)V
/* .line 134 */
/* move/from16 v0, v16 */
(( android.app.Dialog ) v4 ).findViewById ( v0 ); // invoke-virtual {v4, v0}, Landroid/app/Dialog;->findViewById(I)Landroid/view/View;
/* check-cast v14, Landroid/widget/TextView; */
/* .line 135 */
/* .local v14, "text":Landroid/widget/TextView; */
v16 = de.nurogames.android.ticb.base.core.ShopMngr.shopItems;
/* move-object/from16 v0, v16 */
(( java.util.Vector ) v0 ).elementAt ( v15 ); // invoke-virtual {v0, v15}, Ljava/util/Vector;->elementAt(I)Ljava/lang/Object;
/* check-cast v16, Lde/nurogames/android/ticb/base/core/ShopElement; */
/* invoke-virtual/range {v16 ..v16}, Lde/nurogames/android/ticb/base/core/ShopElement;->Name()Ljava/lang/String; */
/* move-object/from16 v0, v16 */
(( android.widget.TextView ) v14 ).setText ( v0 ); // invoke-virtual {v14, v0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V
/* .line 137 */
/* move/from16 v0, v16 */
(( android.app.Dialog ) v4 ).findViewById ( v0 ); // invoke-virtual {v4, v0}, Landroid/app/Dialog;->findViewById(I)Landroid/view/View;
/* check-cast v3, Landroid/widget/TextView; */
/* .line 138 */
/* .local v3, "desc":Landroid/widget/TextView; */
v16 = de.nurogames.android.ticb.base.core.ShopMngr.shopItems;
/* move-object/from16 v0, v16 */
(( java.util.Vector ) v0 ).elementAt ( v15 ); // invoke-virtual {v0, v15}, Ljava/util/Vector;->elementAt(I)Ljava/lang/Object;
/* check-cast v16, Lde/nurogames/android/ticb/base/core/ShopElement; */
/* invoke-virtual/range {v16 ..v16}, Lde/nurogames/android/ticb/base/core/ShopElement;->Desc()Ljava/lang/String; */
/* move-object/from16 v0, v16 */
(( android.widget.TextView ) v3 ).setText ( v0 ); // invoke-virtual {v3, v0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V
/* .line 140 */
/* move/from16 v0, v16 */
(( android.app.Dialog ) v4 ).findViewById ( v0 ); // invoke-virtual {v4, v0}, Landroid/app/Dialog;->findViewById(I)Landroid/view/View;
/* check-cast v13, Landroid/widget/TextView; */
/* .line 141 */
/* .local v13, "price":Landroid/widget/TextView; */
v16 = de.nurogames.android.ticb.base.core.ShopMngr.shopItems;
/* move-object/from16 v0, v16 */
(( java.util.Vector ) v0 ).elementAt ( v15 ); // invoke-virtual {v0, v15}, Ljava/util/Vector;->elementAt(I)Ljava/lang/Object;
/* check-cast v16, Lde/nurogames/android/ticb/base/core/ShopElement; */
/* invoke-virtual/range {v16 ..v16}, Lde/nurogames/android/ticb/base/core/ShopElement;->Price()Ljava/lang/String; */
/* move-object/from16 v0, v16 */
(( android.widget.TextView ) v13 ).setText ( v0 ); // invoke-virtual {v13, v0}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V
/* .line 143 */
/* new-instance v10, Landroid/content/Intent; */
final String v16 = "android.intent.action.VIEW"; // const-string v16, "android.intent.action.VIEW"
/* new-instance v17, Ljava/lang/StringBuilder; */
final String v18 = "market://search?q="; // const-string v18, "market://search?q="
/* invoke-direct/range {v17 ..v18}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V */
/* move-object/from16 v0, p0 */
(( de.nurogames.android.ticb.base.core.ShopMngr ) v0 ).getShopItem ( v15 ); // invoke-virtual {v0, v15}, Lde/nurogames/android/ticb/base/core/ShopMngr;->getShopItem(I)Lde/nurogames/android/ticb/base/core/ShopElement;
/* invoke-virtual/range {v18 ..v18}, Lde/nurogames/android/ticb/base/core/ShopElement;->MarketURL()Ljava/lang/String; */
/* invoke-virtual/range {v17 ..v18}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder; */
/* invoke-virtual/range {v17 ..v17}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String; */
/* invoke-static/range {v17 ..v17}, Landroid/net/Uri;->parse(Ljava/lang/String;)Landroid/net/Uri; */
/* move-object/from16 v0, v16 */
/* move-object/from16 v1, v17 */
/* invoke-direct {v10, v0, v1}, Landroid/content/Intent;-><init>(Ljava/lang/String;Landroid/net/Uri;)V */
/* .line 146 */
/* .local v10, "myIntent":Landroid/content/Intent; */
/* move/from16 v0, v16 */
(( android.app.Dialog ) v4 ).findViewById ( v0 ); // invoke-virtual {v4, v0}, Landroid/app/Dialog;->findViewById(I)Landroid/view/View;
/* check-cast v2, Landroid/widget/Button; */
/* .line 147 */
/* .local v2, "back":Landroid/widget/Button; */
/* move-object/from16 v0, p0 */
v0 = this.mAct;
/* move-object/from16 v16, v0 */
/* invoke-virtual/range {v16 ..v16}, Landroid/app/Activity;->getResources()Landroid/content/res/Resources; */
/* invoke-virtual/range {v16 ..v17}, Landroid/content/res/Resources;->getStringArray(I)[Ljava/lang/String; */
/* aget-object v16, v16, v17 */
/* move-object/from16 v0, v16 */
(( android.widget.Button ) v2 ).setText ( v0 ); // invoke-virtual {v2, v0}, Landroid/widget/Button;->setText(Ljava/lang/CharSequence;)V
/* .line 148 */
/* new-instance v16, Lde/nurogames/android/ticb/base/core/ShopMngr$1; */
/* move-object/from16 v0, v16 */
/* move-object/from16 v1, p0 */
/* invoke-direct {v0, v1, v4}, Lde/nurogames/android/ticb/base/core/ShopMngr$1;-><init>(Lde/nurogames/android/ticb/base/core/ShopMngr;Landroid/app/Dialog;)V */
/* move-object/from16 v0, v16 */
(( android.widget.Button ) v2 ).setOnClickListener ( v0 ); // invoke-virtual {v2, v0}, Landroid/widget/Button;->setOnClickListener(Landroid/view/View$OnClickListener;)V
/* .line 156 */
/* move/from16 v0, v16 */
(( android.app.Dialog ) v4 ).findViewById ( v0 ); // invoke-virtual {v4, v0}, Landroid/app/Dialog;->findViewById(I)Landroid/view/View;
/* check-cast v5, Landroid/widget/Button; */
/* .line 157 */
/* .local v5, "directbuy":Landroid/widget/Button; */
/* move-object/from16 v0, p0 */
v0 = this.mAct;
/* move-object/from16 v16, v0 */
/* invoke-virtual/range {v16 ..v16}, Landroid/app/Activity;->getResources()Landroid/content/res/Resources; */
/* invoke-virtual/range {v16 ..v17}, Landroid/content/res/Resources;->getStringArray(I)[Ljava/lang/String; */
/* aget-object v16, v16, v17 */
/* move-object/from16 v0, v16 */
(( android.widget.Button ) v5 ).setText ( v0 ); // invoke-virtual {v5, v0}, Landroid/widget/Button;->setText(Ljava/lang/CharSequence;)V
/* .line 158 */
/* new-instance v16, Lde/nurogames/android/ticb/base/core/ShopMngr$2; */
/* move-object/from16 v0, v16 */
/* move-object/from16 v1, p0 */
/* invoke-direct {v0, v1, v10, v4}, Lde/nurogames/android/ticb/base/core/ShopMngr$2;-><init>(Lde/nurogames/android/ticb/base/core/ShopMngr;Landroid/content/Intent;Landroid/app/Dialog;)V */
/* move-object/from16 v0, v16 */
(( android.widget.Button ) v5 ).setOnClickListener ( v0 ); // invoke-virtual {v5, v0}, Landroid/widget/Button;->setOnClickListener(Landroid/view/View$OnClickListener;)V
/* .line 165 */
(( android.app.Dialog ) v4 ).show ( ); // invoke-virtual {v4}, Landroid/app/Dialog;->show()V
/* :try_end_0 */
/* .catch Ljava/lang/Exception; {:try_start_0 ..:try_end_0} :catch_0 */
/* goto/16 :goto_1 */
/* .line 170 */
} // .end local v2 # "back":Landroid/widget/Button;
} // .end local v3 # "desc":Landroid/widget/TextView;
} // .end local v4 # "dialog":Landroid/app/Dialog;
} // .end local v5 # "directbuy":Landroid/widget/Button;
} // .end local v7 # "ignore":Z
} // .end local v8 # "image":Landroid/widget/ImageView;
} // .end local v9 # "in2weeks":Ljava/util/Date;
} // .end local v10 # "myIntent":Landroid/content/Intent;
} // .end local v11 # "n":I
} // .end local v12 # "now":Ljava/util/Date;
} // .end local v13 # "price":Landroid/widget/TextView;
} // .end local v14 # "text":Landroid/widget/TextView;
/* :catch_0 */
/* move-exception v6 */
/* .local v6, "e":Ljava/lang/Exception; */
(( java.lang.Exception ) v6 ).printStackTrace ( ); // invoke-virtual {v6}, Ljava/lang/Exception;->printStackTrace()V
/* .line 101 */
} // .end local v6 # "e":Ljava/lang/Exception;
} // :cond_2
/* add-int/lit8 v15, v15, 0x1 */
/* goto/16 :goto_0 */
/* .line 117 */
/* .restart local v7 # "ignore":Z */
/* .restart local v9 # "in2weeks":Ljava/util/Date; */
/* .restart local v11 # "n":I */
/* .restart local v12 # "now":Ljava/util/Date; */
} // :cond_3
try { // :try_start_1
v16 = de.nurogames.android.ticb.base.core.ShopMngr.shopItems;
/* move-object/from16 v0, v16 */
(( java.util.Vector ) v0 ).elementAt ( v15 ); // invoke-virtual {v0, v15}, Ljava/util/Vector;->elementAt(I)Ljava/lang/Object;
/* check-cast v16, Lde/nurogames/android/ticb/base/core/ShopElement; */
v17 = /* invoke-virtual/range {v16 ..v16}, Lde/nurogames/android/ticb/base/core/ShopElement;->ID()I */
/* move-object/from16 v0, p0 */
v0 = this.values;
/* move-object/from16 v16, v0 */
/* move-object/from16 v0, v16 */
(( java.util.Vector ) v0 ).elementAt ( v11 ); // invoke-virtual {v0, v11}, Ljava/util/Vector;->elementAt(I)Ljava/lang/Object;
/* check-cast v16, Ljava/lang/Integer; */
/* invoke-virtual/range {v16 ..v16}, Ljava/lang/Integer;->intValue()I */
/* :try_end_1 */
v16 = /* .catch Ljava/lang/Exception; {:try_start_1 ..:try_end_1} :catch_0 */
/* move/from16 v0, v17 */
/* move/from16 v1, v16 */
/* if-ne v0, v1, :cond_4 */
/* .line 118 */
int v7 = 1; // const/4 v7, 0x1
/* .line 116 */
} // :cond_4
/* add-int/lit8 v11, v11, 0x1 */
/* goto/16 :goto_2 */
} // .end method
public de.nurogames.android.ticb.base.core.ShopElement getShopItem ( Integer p0 ) {
/* .locals 1 */
/* .param p1, "id" # I */
/* .prologue */
/* .line 337 */
v0 = de.nurogames.android.ticb.base.core.ShopMngr.shopItems;
(( java.util.Vector ) v0 ).elementAt ( p1 ); // invoke-virtual {v0, p1}, Ljava/util/Vector;->elementAt(I)Ljava/lang/Object;
/* check-cast v0, Lde/nurogames/android/ticb/base/core/ShopElement; */
} // .end method
public Integer getShopItemCount ( ) {
/* .locals 1 */
/* .prologue */
/* .line 340 */
v0 = de.nurogames.android.ticb.base.core.ShopMngr.shopItems;
v0 = (( java.util.Vector ) v0 ).size ( ); // invoke-virtual {v0}, Ljava/util/Vector;->size()I
} // .end method
public java.lang.String getShopItemsDesc ( ) {
/* .locals 3 */
/* .prologue */
/* .line 307 */
v2 = de.nurogames.android.ticb.base.core.ShopMngr.shopItems;
v2 = (( java.util.Vector ) v2 ).size ( ); // invoke-virtual {v2}, Ljava/util/Vector;->size()I
/* new-array v0, v2, [Ljava/lang/String; */
/* .line 308 */
/* .local v0, "desc":[Ljava/lang/String; */
int v1 = 0; // const/4 v1, 0x0
/* .local v1, "x":I */
} // :goto_0
/* array-length v2, v0 */
/* if-lt v1, v2, :cond_0 */
/* .line 310 */
/* .line 309 */
} // :cond_0
v2 = de.nurogames.android.ticb.base.core.ShopMngr.shopItems;
(( java.util.Vector ) v2 ).elementAt ( v1 ); // invoke-virtual {v2, v1}, Ljava/util/Vector;->elementAt(I)Ljava/lang/Object;
/* check-cast v2, Lde/nurogames/android/ticb/base/core/ShopElement; */
(( de.nurogames.android.ticb.base.core.ShopElement ) v2 ).Desc ( ); // invoke-virtual {v2}, Lde/nurogames/android/ticb/base/core/ShopElement;->Desc()Ljava/lang/String;
/* aput-object v2, v0, v1 */
/* .line 308 */
/* add-int/lit8 v1, v1, 0x1 */
} // .end method
public android.graphics.Bitmap getShopItemsIcon ( ) {
/* .locals 3 */
/* .prologue */
/* .line 319 */
v2 = de.nurogames.android.ticb.base.core.ShopMngr.shopItems;
v2 = (( java.util.Vector ) v2 ).size ( ); // invoke-virtual {v2}, Ljava/util/Vector;->size()I
/* new-array v0, v2, [Landroid/graphics/Bitmap; */
/* .line 320 */
/* .local v0, "icon":[Landroid/graphics/Bitmap; */
int v1 = 0; // const/4 v1, 0x0
/* .local v1, "x":I */
} // :goto_0
/* array-length v2, v0 */
/* if-lt v1, v2, :cond_0 */
/* .line 322 */
/* .line 321 */
} // :cond_0
v2 = de.nurogames.android.ticb.base.core.ShopMngr.shopItems;
(( java.util.Vector ) v2 ).elementAt ( v1 ); // invoke-virtual {v2, v1}, Ljava/util/Vector;->elementAt(I)Ljava/lang/Object;
/* check-cast v2, Lde/nurogames/android/ticb/base/core/ShopElement; */
(( de.nurogames.android.ticb.base.core.ShopElement ) v2 ).Icon ( ); // invoke-virtual {v2}, Lde/nurogames/android/ticb/base/core/ShopElement;->Icon()Landroid/graphics/Bitmap;
/* aput-object v2, v0, v1 */
/* .line 320 */
/* add-int/lit8 v1, v1, 0x1 */
} // .end method
public java.lang.String getShopItemsIsNew ( ) {
/* .locals 3 */
/* .prologue */
/* .line 331 */
v2 = de.nurogames.android.ticb.base.core.ShopMngr.shopItems;
v2 = (( java.util.Vector ) v2 ).size ( ); // invoke-virtual {v2}, Ljava/util/Vector;->size()I
/* new-array v0, v2, [Ljava/lang/String; */
/* .line 332 */
/* .local v0, "isnew":[Ljava/lang/String; */
int v1 = 0; // const/4 v1, 0x0
/* .local v1, "x":I */
} // :goto_0
/* array-length v2, v0 */
/* if-lt v1, v2, :cond_0 */
/* .line 334 */
/* .line 333 */
} // :cond_0
v2 = de.nurogames.android.ticb.base.core.ShopMngr.shopItems;
(( java.util.Vector ) v2 ).elementAt ( v1 ); // invoke-virtual {v2, v1}, Ljava/util/Vector;->elementAt(I)Ljava/lang/Object;
/* check-cast v2, Lde/nurogames/android/ticb/base/core/ShopElement; */
(( de.nurogames.android.ticb.base.core.ShopElement ) v2 ).IsPromoTill ( ); // invoke-virtual {v2}, Lde/nurogames/android/ticb/base/core/ShopElement;->IsPromoTill()Ljava/lang/String;
/* aput-object v2, v0, v1 */
/* .line 332 */
/* add-int/lit8 v1, v1, 0x1 */
} // .end method
public java.lang.String getShopItemsName ( ) {
/* .locals 3 */
/* .prologue */
/* .line 301 */
v2 = de.nurogames.android.ticb.base.core.ShopMngr.shopItems;
v2 = (( java.util.Vector ) v2 ).size ( ); // invoke-virtual {v2}, Ljava/util/Vector;->size()I
/* new-array v0, v2, [Ljava/lang/String; */
/* .line 302 */
/* .local v0, "names":[Ljava/lang/String; */
int v1 = 0; // const/4 v1, 0x0
/* .local v1, "x":I */
} // :goto_0
/* array-length v2, v0 */
/* if-lt v1, v2, :cond_0 */
/* .line 304 */
/* .line 303 */
} // :cond_0
v2 = de.nurogames.android.ticb.base.core.ShopMngr.shopItems;
(( java.util.Vector ) v2 ).elementAt ( v1 ); // invoke-virtual {v2, v1}, Ljava/util/Vector;->elementAt(I)Ljava/lang/Object;
/* check-cast v2, Lde/nurogames/android/ticb/base/core/ShopElement; */
(( de.nurogames.android.ticb.base.core.ShopElement ) v2 ).Name ( ); // invoke-virtual {v2}, Lde/nurogames/android/ticb/base/core/ShopElement;->Name()Ljava/lang/String;
/* aput-object v2, v0, v1 */
/* .line 302 */
/* add-int/lit8 v1, v1, 0x1 */
} // .end method
public java.lang.String getShopItemsPlatform ( ) {
/* .locals 3 */
/* .prologue */
/* .line 325 */
v2 = de.nurogames.android.ticb.base.core.ShopMngr.shopItems;
v2 = (( java.util.Vector ) v2 ).size ( ); // invoke-virtual {v2}, Ljava/util/Vector;->size()I
/* new-array v0, v2, [Ljava/lang/String; */
/* .line 326 */
/* .local v0, "platform":[Ljava/lang/String; */
int v1 = 0; // const/4 v1, 0x0
/* .local v1, "x":I */
} // :goto_0
/* array-length v2, v0 */
/* if-lt v1, v2, :cond_0 */
/* .line 328 */
/* .line 327 */
} // :cond_0
v2 = de.nurogames.android.ticb.base.core.ShopMngr.shopItems;
(( java.util.Vector ) v2 ).elementAt ( v1 ); // invoke-virtual {v2, v1}, Ljava/util/Vector;->elementAt(I)Ljava/lang/Object;
/* check-cast v2, Lde/nurogames/android/ticb/base/core/ShopElement; */
(( de.nurogames.android.ticb.base.core.ShopElement ) v2 ).Platform ( ); // invoke-virtual {v2}, Lde/nurogames/android/ticb/base/core/ShopElement;->Platform()Ljava/lang/String;
/* aput-object v2, v0, v1 */
/* .line 326 */
/* add-int/lit8 v1, v1, 0x1 */
} // .end method
public java.lang.String getShopItemsPrice ( ) {
/* .locals 3 */
/* .prologue */
/* .line 313 */
v2 = de.nurogames.android.ticb.base.core.ShopMngr.shopItems;
v2 = (( java.util.Vector ) v2 ).size ( ); // invoke-virtual {v2}, Ljava/util/Vector;->size()I
/* new-array v0, v2, [Ljava/lang/String; */
/* .line 314 */
/* .local v0, "prices":[Ljava/lang/String; */
int v1 = 0; // const/4 v1, 0x0
/* .local v1, "x":I */
} // :goto_0
/* array-length v2, v0 */
/* if-lt v1, v2, :cond_0 */
/* .line 316 */
/* .line 315 */
} // :cond_0
v2 = de.nurogames.android.ticb.base.core.ShopMngr.shopItems;
(( java.util.Vector ) v2 ).elementAt ( v1 ); // invoke-virtual {v2, v1}, Ljava/util/Vector;->elementAt(I)Ljava/lang/Object;
/* check-cast v2, Lde/nurogames/android/ticb/base/core/ShopElement; */
(( de.nurogames.android.ticb.base.core.ShopElement ) v2 ).Price ( ); // invoke-virtual {v2}, Lde/nurogames/android/ticb/base/core/ShopElement;->Price()Ljava/lang/String;
/* aput-object v2, v0, v1 */
/* .line 314 */
/* add-int/lit8 v1, v1, 0x1 */
} // .end method
public Boolean hasProVersion ( ) {
/* .locals 1 */
/* .prologue */
/* .line 343 */
/* iget-boolean v0, p0, Lde/nurogames/android/ticb/base/core/ShopMngr;->mHasProVersion:Z */
} // .end method
public void loadDataFromServer ( ) {
/* .locals 15 */
/* .prologue */
/* .line 186 */
try { // :try_start_0
/* new-instance v10, Ljava/net/URL; */
/* new-instance v12, Ljava/lang/StringBuilder; */
v13 = this.shop_url;
java.lang.String .valueOf ( v13 );
/* invoke-direct {v12, v13}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V */
final String v13 = "/dont_delete/shoplist.xml"; // const-string v13, "/dont_delete/shoplist.xml"
(( java.lang.StringBuilder ) v12 ).append ( v13 ); // invoke-virtual {v12, v13}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v12 ).toString ( ); // invoke-virtual {v12}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
/* invoke-direct {v10, v12}, Ljava/net/URL;-><init>(Ljava/lang/String;)V */
/* :try_end_0 */
/* .catch Ljava/net/MalformedURLException; {:try_start_0 ..:try_end_0} :catch_1 */
/* .line 190 */
/* .local v10, "url":Ljava/net/URL; */
try { // :try_start_1
(( java.net.URL ) v10 ).openConnection ( ); // invoke-virtual {v10}, Ljava/net/URL;->openConnection()Ljava/net/URLConnection;
/* .line 192 */
/* .local v0, "conn":Ljava/net/URLConnection; */
final String v3 = "appi:preview"; // const-string v3, "appi:preview"
/* .line 193 */
/* .local v3, "input":Ljava/lang/String; */
de.nurogames.android.ticb.base.core.ShopMngr .base64Encode ( v3 );
/* .line 195 */
/* .local v2, "encoding":Ljava/lang/String; */
final String v12 = "Authorization"; // const-string v12, "Authorization"
/* new-instance v13, Ljava/lang/StringBuilder; */
final String v14 = "Basic "; // const-string v14, "Basic "
/* invoke-direct {v13, v14}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V */
(( java.lang.StringBuilder ) v13 ).append ( v2 ); // invoke-virtual {v13, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v13 ).toString ( ); // invoke-virtual {v13}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
(( java.net.URLConnection ) v0 ).setRequestProperty ( v12, v13 ); // invoke-virtual {v0, v12, v13}, Ljava/net/URLConnection;->setRequestProperty(Ljava/lang/String;Ljava/lang/String;)V
/* .line 196 */
/* const/16 v12, 0xc8 */
(( java.net.URLConnection ) v0 ).setConnectTimeout ( v12 ); // invoke-virtual {v0, v12}, Ljava/net/URLConnection;->setConnectTimeout(I)V
/* .line 197 */
(( java.net.URLConnection ) v0 ).connect ( ); // invoke-virtual {v0}, Ljava/net/URLConnection;->connect()V
/* .line 199 */
(( java.net.URLConnection ) v0 ).getInputStream ( ); // invoke-virtual {v0}, Ljava/net/URLConnection;->getInputStream()Ljava/io/InputStream;
/* :try_end_1 */
/* .catch Ljava/net/UnknownHostException; {:try_start_1 ..:try_end_1} :catch_0 */
/* .catch Ljava/io/IOException; {:try_start_1 ..:try_end_1} :catch_2 */
/* .catch Ljava/net/MalformedURLException; {:try_start_1 ..:try_end_1} :catch_1 */
/* .line 204 */
/* .local v5, "is":Ljava/io/InputStream; */
try { // :try_start_2
javax.xml.parsers.SAXParserFactory .newInstance ( );
/* .line 205 */
/* .local v8, "spf":Ljavax/xml/parsers/SAXParserFactory; */
(( javax.xml.parsers.SAXParserFactory ) v8 ).newSAXParser ( ); // invoke-virtual {v8}, Ljavax/xml/parsers/SAXParserFactory;->newSAXParser()Ljavax/xml/parsers/SAXParser;
/* .line 208 */
/* .local v7, "sp":Ljavax/xml/parsers/SAXParser; */
(( javax.xml.parsers.SAXParser ) v7 ).getXMLReader ( ); // invoke-virtual {v7}, Ljavax/xml/parsers/SAXParser;->getXMLReader()Lorg/xml/sax/XMLReader;
/* .line 211 */
/* .local v11, "xr":Lorg/xml/sax/XMLReader; */
/* new-instance v6, Lde/nurogames/android/ticb/base/core/ShopItemHandler; */
/* invoke-direct {v6}, Lde/nurogames/android/ticb/base/core/ShopItemHandler;-><init>()V */
/* .line 212 */
/* .local v6, "myExampleHandler":Lde/nurogames/android/ticb/base/core/ShopItemHandler; */
/* .line 215 */
/* new-instance v12, Lorg/xml/sax/InputSource; */
/* invoke-direct {v12, v5}, Lorg/xml/sax/InputSource;-><init>(Ljava/io/InputStream;)V */
/* :try_end_2 */
/* .catch Ljava/lang/Exception; {:try_start_2 ..:try_end_2} :catch_3 */
/* .catch Ljava/net/UnknownHostException; {:try_start_2 ..:try_end_2} :catch_0 */
/* .catch Ljava/io/IOException; {:try_start_2 ..:try_end_2} :catch_2 */
/* .catch Ljava/net/MalformedURLException; {:try_start_2 ..:try_end_2} :catch_1 */
/* .line 219 */
} // .end local v6 # "myExampleHandler":Lde/nurogames/android/ticb/base/core/ShopItemHandler;
} // .end local v7 # "sp":Ljavax/xml/parsers/SAXParser;
} // .end local v8 # "spf":Ljavax/xml/parsers/SAXParserFactory;
} // .end local v11 # "xr":Lorg/xml/sax/XMLReader;
} // :goto_0
try { // :try_start_3
(( java.io.InputStream ) v5 ).close ( ); // invoke-virtual {v5}, Ljava/io/InputStream;->close()V
/* :try_end_3 */
/* .catch Ljava/net/UnknownHostException; {:try_start_3 ..:try_end_3} :catch_0 */
/* .catch Ljava/io/IOException; {:try_start_3 ..:try_end_3} :catch_2 */
/* .catch Ljava/net/MalformedURLException; {:try_start_3 ..:try_end_3} :catch_1 */
/* .line 234 */
} // .end local v0 # "conn":Ljava/net/URLConnection;
} // .end local v2 # "encoding":Ljava/lang/String;
} // .end local v3 # "input":Ljava/lang/String;
} // .end local v5 # "is":Ljava/io/InputStream;
} // .end local v10 # "url":Ljava/net/URL;
} // :goto_1
return;
/* .line 222 */
/* .restart local v10 # "url":Ljava/net/URL; */
/* :catch_0 */
/* move-exception v9 */
/* .line 224 */
/* .local v9, "uhe":Ljava/net/UnknownHostException; */
int v12 = 1; // const/4 v12, 0x1
try { // :try_start_4
de.nurogames.android.ticb.base.tinysanta.NO_NETCONNCETION_AVAIL = (v12!= 0);
/* :try_end_4 */
/* .catch Ljava/net/MalformedURLException; {:try_start_4 ..:try_end_4} :catch_1 */
/* .line 230 */
} // .end local v9 # "uhe":Ljava/net/UnknownHostException;
} // .end local v10 # "url":Ljava/net/URL;
/* :catch_1 */
/* move-exception v1 */
/* .line 231 */
/* .local v1, "e":Ljava/net/MalformedURLException; */
(( java.net.MalformedURLException ) v1 ).printStackTrace ( ); // invoke-virtual {v1}, Ljava/net/MalformedURLException;->printStackTrace()V
/* .line 225 */
} // .end local v1 # "e":Ljava/net/MalformedURLException;
/* .restart local v10 # "url":Ljava/net/URL; */
/* :catch_2 */
/* move-exception v4 */
/* .line 227 */
/* .local v4, "ioe":Ljava/io/IOException; */
int v12 = 1; // const/4 v12, 0x1
try { // :try_start_5
de.nurogames.android.ticb.base.tinysanta.NO_SDCARD_AVAIL = (v12!= 0);
/* :try_end_5 */
/* .catch Ljava/net/MalformedURLException; {:try_start_5 ..:try_end_5} :catch_1 */
/* .line 217 */
} // .end local v4 # "ioe":Ljava/io/IOException;
/* .restart local v0 # "conn":Ljava/net/URLConnection; */
/* .restart local v2 # "encoding":Ljava/lang/String; */
/* .restart local v3 # "input":Ljava/lang/String; */
/* .restart local v5 # "is":Ljava/io/InputStream; */
/* :catch_3 */
/* move-exception v12 */
} // .end method
public void loadPromotedIDs ( ) {
/* .locals 6 */
/* .prologue */
int v5 = 0; // const/4 v5, 0x0
/* .line 242 */
v2 = this.mAct;
final String v3 = "NURO_SHOP"; // const-string v3, "NURO_SHOP"
(( android.app.Activity ) v2 ).getSharedPreferences ( v3, v5 ); // invoke-virtual {v2, v3, v5}, Landroid/app/Activity;->getSharedPreferences(Ljava/lang/String;I)Landroid/content/SharedPreferences;
/* .line 244 */
/* .local v0, "settings":Landroid/content/SharedPreferences; */
v2 = final String v2 = "cnt"; // const-string v2, "cnt"
/* iput v2, p0, Lde/nurogames/android/ticb/base/core/ShopMngr;->count:I */
/* .line 248 */
/* iget v2, p0, Lde/nurogames/android/ticb/base/core/ShopMngr;->count:I */
/* if-lez v2, :cond_0 */
/* .line 249 */
int v1 = 0; // const/4 v1, 0x0
/* .local v1, "x":I */
} // :goto_0
/* iget v2, p0, Lde/nurogames/android/ticb/base/core/ShopMngr;->count:I */
/* if-lt v1, v2, :cond_1 */
/* .line 256 */
} // .end local v1 # "x":I
} // :cond_0
return;
/* .line 253 */
/* .restart local v1 # "x":I */
} // :cond_1
v2 = this.values;
/* new-instance v3, Ljava/lang/StringBuilder; */
final String v4 = "APPID:"; // const-string v4, "APPID:"
/* invoke-direct {v3, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V */
(( java.lang.StringBuilder ) v3 ).append ( v1 ); // invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;
v3 = (( java.lang.StringBuilder ) v3 ).toString ( ); // invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
java.lang.Integer .valueOf ( v3 );
(( java.util.Vector ) v2 ).addElement ( v3 ); // invoke-virtual {v2, v3}, Ljava/util/Vector;->addElement(Ljava/lang/Object;)V
/* .line 249 */
/* add-int/lit8 v1, v1, 0x1 */
} // .end method
