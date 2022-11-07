public class de.nurogames.android.ticb.base.core.InAppMngr {
	 /* .source "InAppMngr.java" */
	 /* # static fields */
	 public static java.util.Vector inappItems;
	 /* .annotation system Ldalvik/annotation/Signature; */
	 /* value = { */
	 /* "Ljava/util/Vector", */
	 /* "<", */
	 /* "Lde/nurogames/android/ticb/base/core/InAppElement;", */
	 /* ">;" */
	 /* } */
} // .end annotation
} // .end field
public static java.lang.String item_descs;
public static java.lang.String item_names;
public static java.lang.String item_price_real;
public static java.lang.String item_price_token;
public static owned;
public static Integer selected_item;
/* # direct methods */
static de.nurogames.android.ticb.base.core.InAppMngr ( ) {
/* .locals 8 */
/* .prologue */
int v7 = 3; // const/4 v7, 0x3
int v6 = 2; // const/4 v6, 0x2
int v5 = 7; // const/4 v5, 0x7
int v4 = 1; // const/4 v4, 0x1
int v3 = 0; // const/4 v3, 0x0
/* .line 15 */
/* new-instance v0, Ljava/util/Vector; */
/* invoke-direct {v0}, Ljava/util/Vector;-><init>()V */
/* .line 17 */
/* new-array v0, v5, [Ljava/lang/String; */
/* .line 18 */
final String v1 = "Tiny Bee"; // const-string v1, "Tiny Bee"
/* aput-object v1, v0, v3 */
/* .line 19 */
final String v1 = "Tiger Bee"; // const-string v1, "Tiger Bee"
/* aput-object v1, v0, v4 */
/* .line 20 */
final String v1 = "Ladybug Bee"; // const-string v1, "Ladybug Bee"
/* aput-object v1, v0, v6 */
/* .line 21 */
final String v1 = "Golden Bee"; // const-string v1, "Golden Bee"
/* aput-object v1, v0, v7 */
int v1 = 4; // const/4 v1, 0x4
/* .line 22 */
final String v2 = "Character Pack"; // const-string v2, "Character Pack"
/* aput-object v2, v0, v1 */
int v1 = 5; // const/4 v1, 0x5
/* .line 23 */
final String v2 = "Level Pack"; // const-string v2, "Level Pack"
/* aput-object v2, v0, v1 */
int v1 = 6; // const/4 v1, 0x6
/* .line 24 */
final String v2 = "Level & Character Pack"; // const-string v2, "Level & Character Pack"
/* aput-object v2, v0, v1 */
/* .line 17 */
/* .line 26 */
/* new-array v0, v5, [Ljava/lang/String; */
/* .line 27 */
final String v1 = "...the original"; // const-string v1, "...the original"
/* aput-object v1, v0, v3 */
/* .line 28 */
final String v1 = "...show the wild side"; // const-string v1, "...show the wild side"
/* aput-object v1, v0, v4 */
/* .line 29 */
final String v1 = "...bring up color into play"; // const-string v1, "...bring up color into play"
/* aput-object v1, v0, v6 */
/* .line 30 */
final String v1 = "...for the bright flights"; // const-string v1, "...for the bright flights"
/* aput-object v1, v0, v7 */
int v1 = 4; // const/4 v1, 0x4
/* .line 31 */
final String v2 = "...feel free to choose"; // const-string v2, "...feel free to choose"
/* aput-object v2, v0, v1 */
int v1 = 5; // const/4 v1, 0x5
/* .line 32 */
final String v2 = "...stock up on 20 level"; // const-string v2, "...stock up on 20 level"
/* aput-object v2, v0, v1 */
int v1 = 6; // const/4 v1, 0x6
/* .line 33 */
final String v2 = "...the complete mix"; // const-string v2, "...the complete mix"
/* aput-object v2, v0, v1 */
/* .line 26 */
/* .line 35 */
/* new-array v0, v5, [Ljava/lang/String; */
/* .line 36 */
final String v1 = "-"; // const-string v1, "-"
/* aput-object v1, v0, v3 */
/* .line 37 */
final String v1 = "0.79\u20ac"; // const-string v1, "0.79\u20ac"
/* aput-object v1, v0, v4 */
/* .line 38 */
final String v1 = "0.79\u20ac"; // const-string v1, "0.79\u20ac"
/* aput-object v1, v0, v6 */
/* .line 39 */
final String v1 = "0.79\u20ac"; // const-string v1, "0.79\u20ac"
/* aput-object v1, v0, v7 */
int v1 = 4; // const/4 v1, 0x4
/* .line 40 */
final String v2 = "1.59\u20ac"; // const-string v2, "1.59\u20ac"
/* aput-object v2, v0, v1 */
int v1 = 5; // const/4 v1, 0x5
/* .line 41 */
final String v2 = "1.59\u20ac"; // const-string v2, "1.59\u20ac"
/* aput-object v2, v0, v1 */
int v1 = 6; // const/4 v1, 0x6
/* .line 42 */
final String v2 = "2.99\u20ac"; // const-string v2, "2.99\u20ac"
/* aput-object v2, v0, v1 */
/* .line 35 */
/* .line 44 */
/* new-array v0, v5, [Ljava/lang/String; */
/* .line 45 */
final String v1 = "-"; // const-string v1, "-"
/* aput-object v1, v0, v3 */
/* .line 46 */
final String v1 = "79"; // const-string v1, "79"
/* aput-object v1, v0, v4 */
/* .line 47 */
final String v1 = "79"; // const-string v1, "79"
/* aput-object v1, v0, v6 */
/* .line 48 */
final String v1 = "79"; // const-string v1, "79"
/* aput-object v1, v0, v7 */
int v1 = 4; // const/4 v1, 0x4
/* .line 49 */
final String v2 = "159"; // const-string v2, "159"
/* aput-object v2, v0, v1 */
int v1 = 5; // const/4 v1, 0x5
/* .line 50 */
final String v2 = "159"; // const-string v2, "159"
/* aput-object v2, v0, v1 */
int v1 = 6; // const/4 v1, 0x6
/* .line 51 */
final String v2 = "299"; // const-string v2, "299"
/* aput-object v2, v0, v1 */
/* .line 44 */
/* .line 53 */
/* new-array v0, v5, [Z */
/* .line 54 */
/* aput-boolean v4, v0, v3 */
/* .line 53 */
/* .line 62 */
return;
} // .end method
public de.nurogames.android.ticb.base.core.InAppMngr ( ) {
/* .locals 1 */
/* .prologue */
/* .line 71 */
/* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
/* .line 74 */
v0 = de.nurogames.android.ticb.base.core.InAppMngr.inappItems;
(( java.util.Vector ) v0 ).clear ( ); // invoke-virtual {v0}, Ljava/util/Vector;->clear()V
/* .line 77 */
/* invoke-direct {p0}, Lde/nurogames/android/ticb/base/core/InAppMngr;->loadShopItems()V */
/* .line 80 */
/* .line 81 */
return;
} // .end method
public static java.lang.String base64Encode ( java.lang.String p0 ) {
/* .locals 3 */
/* .param p0, "s" # Ljava/lang/String; */
/* .prologue */
/* .line 204 */
/* new-instance v0, Ljava/io/ByteArrayOutputStream; */
/* invoke-direct {v0}, Ljava/io/ByteArrayOutputStream;-><init>()V */
/* .line 205 */
/* .local v0, "bOut":Ljava/io/ByteArrayOutputStream; */
/* new-instance v1, Lde/nurogames/android/ticb/base/core/Base64OutputStream; */
/* invoke-direct {v1, v0}, Lde/nurogames/android/ticb/base/core/Base64OutputStream;-><init>(Ljava/io/OutputStream;)V */
/* .line 207 */
/* .local v1, "out":Lde/nurogames/android/ticb/base/core/Base64OutputStream; */
try { // :try_start_0
	 (( java.lang.String ) p0 ).getBytes ( ); // invoke-virtual {p0}, Ljava/lang/String;->getBytes()[B
	 (( de.nurogames.android.ticb.base.core.Base64OutputStream ) v1 ).write ( v2 ); // invoke-virtual {v1, v2}, Lde/nurogames/android/ticb/base/core/Base64OutputStream;->write([B)V
	 /* .line 208 */
	 (( de.nurogames.android.ticb.base.core.Base64OutputStream ) v1 ).flush ( ); // invoke-virtual {v1}, Lde/nurogames/android/ticb/base/core/Base64OutputStream;->flush()V
	 /* .line 209 */
	 (( de.nurogames.android.ticb.base.core.Base64OutputStream ) v1 ).close ( ); // invoke-virtual {v1}, Lde/nurogames/android/ticb/base/core/Base64OutputStream;->close()V
	 /* :try_end_0 */
	 /* .catch Ljava/io/IOException; {:try_start_0 ..:try_end_0} :catch_0 */
	 /* .line 213 */
} // :goto_0
(( java.io.ByteArrayOutputStream ) v0 ).toString ( ); // invoke-virtual {v0}, Ljava/io/ByteArrayOutputStream;->toString()Ljava/lang/String;
/* .line 211 */
/* :catch_0 */
/* move-exception v2 */
} // .end method
private void loadShopItems ( ) {
/* .locals 11 */
/* .prologue */
/* .line 136 */
int v7 = 7; // const/4 v7, 0x7
/* .line 137 */
/* .local v7, "DEMO_ITEMS":I */
int v8 = 5; // const/4 v8, 0x5
/* .line 138 */
/* .local v8, "FULL_ITEMS":I */
int v9 = 0; // const/4 v9, 0x0
/* .line 140 */
/* .local v9, "ammount":I */
/* if-nez v0, :cond_1 */
/* .line 141 */
/* move v9, v7 */
/* .line 146 */
} // :cond_0
} // :goto_0
int v1 = 0; // const/4 v1, 0x0
/* .local v1, "x":I */
} // :goto_1
/* if-lt v1, v9, :cond_2 */
/* .line 197 */
return;
/* .line 142 */
} // .end local v1 # "x":I
} // :cond_1
int v2 = 1; // const/4 v2, 0x1
/* if-ne v0, v2, :cond_0 */
/* .line 143 */
/* move v9, v8 */
/* .line 147 */
/* .restart local v1 # "x":I */
} // :cond_2
int v0 = 4; // const/4 v0, 0x4
/* if-ge v1, v0, :cond_3 */
/* .line 148 */
v10 = de.nurogames.android.ticb.base.core.InAppMngr.inappItems;
/* .line 149 */
/* new-instance v0, Lde/nurogames/android/ticb/base/core/InAppElement; */
v2 = de.nurogames.android.ticb.base.core.AppResources.imgFBIcon;
v3 = de.nurogames.android.ticb.base.core.InAppMngr.item_names;
/* aget-object v3, v3, v1 */
final String v4 = ""; // const-string v4, ""
v5 = de.nurogames.android.ticb.base.core.InAppMngr.item_descs;
/* aget-object v5, v5, v1 */
int v6 = 1; // const/4 v6, 0x1
/* invoke-direct/range {v0 ..v6}, Lde/nurogames/android/ticb/base/core/InAppElement;-><init>(ILandroid/graphics/Bitmap;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V */
/* .line 148 */
(( java.util.Vector ) v10 ).add ( v0 ); // invoke-virtual {v10, v0}, Ljava/util/Vector;->add(Ljava/lang/Object;)Z
/* .line 146 */
} // :goto_2
/* add-int/lit8 v1, v1, 0x1 */
/* .line 152 */
} // :cond_3
v10 = de.nurogames.android.ticb.base.core.InAppMngr.inappItems;
/* .line 153 */
/* new-instance v0, Lde/nurogames/android/ticb/base/core/InAppElement; */
v2 = de.nurogames.android.ticb.base.core.AppResources.imgFBIcon;
v3 = de.nurogames.android.ticb.base.core.InAppMngr.item_names;
/* aget-object v3, v3, v1 */
final String v4 = ""; // const-string v4, ""
v5 = de.nurogames.android.ticb.base.core.InAppMngr.item_descs;
/* aget-object v5, v5, v1 */
int v6 = 0; // const/4 v6, 0x0
/* invoke-direct/range {v0 ..v6}, Lde/nurogames/android/ticb/base/core/InAppElement;-><init>(ILandroid/graphics/Bitmap;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Z)V */
/* .line 152 */
(( java.util.Vector ) v10 ).add ( v0 ); // invoke-virtual {v10, v0}, Ljava/util/Vector;->add(Ljava/lang/Object;)Z
} // .end method
/* # virtual methods */
public de.nurogames.android.ticb.base.core.InAppElement getShopItem ( Integer p0 ) {
/* .locals 1 */
/* .param p1, "id" # I */
/* .prologue */
/* .line 218 */
v0 = de.nurogames.android.ticb.base.core.InAppMngr.inappItems;
(( java.util.Vector ) v0 ).elementAt ( p1 ); // invoke-virtual {v0, p1}, Ljava/util/Vector;->elementAt(I)Ljava/lang/Object;
/* check-cast v0, Lde/nurogames/android/ticb/base/core/InAppElement; */
} // .end method
public Integer getShopItemCount ( ) {
/* .locals 1 */
/* .prologue */
/* .line 221 */
v0 = de.nurogames.android.ticb.base.core.InAppMngr.inappItems;
v0 = (( java.util.Vector ) v0 ).size ( ); // invoke-virtual {v0}, Ljava/util/Vector;->size()I
} // .end method
public void removeItem ( Integer p0 ) {
/* .locals 1 */
/* .param p1, "index" # I */
/* .prologue */
/* .line 200 */
v0 = de.nurogames.android.ticb.base.core.InAppMngr.inappItems;
(( java.util.Vector ) v0 ).remove ( p1 ); // invoke-virtual {v0, p1}, Ljava/util/Vector;->remove(I)Ljava/lang/Object;
/* .line 201 */
return;
} // .end method
