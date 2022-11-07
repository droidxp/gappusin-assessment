public class de.nurogames.android.ticb.base.core.ShopItemHandler extends org.xml.sax.helpers.DefaultHandler {
	 /* .source "ShopItemHandler.java" */
	 /* # instance fields */
	 private de.nurogames.android.ticb.base.core.ShopDataSet myParsedExampleDataSet;
	 private Boolean tag_desc;
	 private Boolean tag_icon;
	 private Boolean tag_id;
	 private Boolean tag_isnew;
	 private Boolean tag_market;
	 private Boolean tag_name;
	 private Boolean tag_platform;
	 private Boolean tag_price;
	 /* # direct methods */
	 public de.nurogames.android.ticb.base.core.ShopItemHandler ( ) {
		 /* .locals 1 */
		 /* .prologue */
		 int v0 = 0; // const/4 v0, 0x0
		 /* .line 18 */
		 /* invoke-direct {p0}, Lorg/xml/sax/helpers/DefaultHandler;-><init>()V */
		 /* .line 24 */
		 /* iput-boolean v0, p0, Lde/nurogames/android/ticb/base/core/ShopItemHandler;->tag_id:Z */
		 /* .line 25 */
		 /* iput-boolean v0, p0, Lde/nurogames/android/ticb/base/core/ShopItemHandler;->tag_icon:Z */
		 /* .line 26 */
		 /* iput-boolean v0, p0, Lde/nurogames/android/ticb/base/core/ShopItemHandler;->tag_name:Z */
		 /* .line 27 */
		 /* iput-boolean v0, p0, Lde/nurogames/android/ticb/base/core/ShopItemHandler;->tag_desc:Z */
		 /* .line 28 */
		 /* iput-boolean v0, p0, Lde/nurogames/android/ticb/base/core/ShopItemHandler;->tag_price:Z */
		 /* .line 29 */
		 /* iput-boolean v0, p0, Lde/nurogames/android/ticb/base/core/ShopItemHandler;->tag_market:Z */
		 /* .line 30 */
		 /* iput-boolean v0, p0, Lde/nurogames/android/ticb/base/core/ShopItemHandler;->tag_platform:Z */
		 /* .line 31 */
		 /* iput-boolean v0, p0, Lde/nurogames/android/ticb/base/core/ShopItemHandler;->tag_isnew:Z */
		 /* .line 33 */
		 /* new-instance v0, Lde/nurogames/android/ticb/base/core/ShopDataSet; */
		 /* invoke-direct {v0}, Lde/nurogames/android/ticb/base/core/ShopDataSet;-><init>()V */
		 this.myParsedExampleDataSet = v0;
		 /* .line 18 */
		 return;
	 } // .end method
	 public static java.lang.String base64Encode ( java.lang.String p0 ) {
		 /* .locals 3 */
		 /* .param p0, "s" # Ljava/lang/String; */
		 /* .prologue */
		 /* .line 181 */
		 /* new-instance v0, Ljava/io/ByteArrayOutputStream; */
		 /* invoke-direct {v0}, Ljava/io/ByteArrayOutputStream;-><init>()V */
		 /* .line 182 */
		 /* .local v0, "bOut":Ljava/io/ByteArrayOutputStream; */
		 /* new-instance v1, Lde/nurogames/android/ticb/base/core/Base64OutputStream; */
		 /* invoke-direct {v1, v0}, Lde/nurogames/android/ticb/base/core/Base64OutputStream;-><init>(Ljava/io/OutputStream;)V */
		 /* .line 184 */
		 /* .local v1, "out":Lde/nurogames/android/ticb/base/core/Base64OutputStream; */
		 try { // :try_start_0
			 (( java.lang.String ) p0 ).getBytes ( ); // invoke-virtual {p0}, Ljava/lang/String;->getBytes()[B
			 (( de.nurogames.android.ticb.base.core.Base64OutputStream ) v1 ).write ( v2 ); // invoke-virtual {v1, v2}, Lde/nurogames/android/ticb/base/core/Base64OutputStream;->write([B)V
			 /* .line 185 */
			 (( de.nurogames.android.ticb.base.core.Base64OutputStream ) v1 ).flush ( ); // invoke-virtual {v1}, Lde/nurogames/android/ticb/base/core/Base64OutputStream;->flush()V
			 /* .line 186 */
			 (( de.nurogames.android.ticb.base.core.Base64OutputStream ) v1 ).close ( ); // invoke-virtual {v1}, Lde/nurogames/android/ticb/base/core/Base64OutputStream;->close()V
			 /* :try_end_0 */
			 /* .catch Ljava/io/IOException; {:try_start_0 ..:try_end_0} :catch_0 */
			 /* .line 188 */
		 } // :goto_0
		 (( java.io.ByteArrayOutputStream ) v0 ).toString ( ); // invoke-virtual {v0}, Ljava/io/ByteArrayOutputStream;->toString()Ljava/lang/String;
		 /* .line 187 */
		 /* :catch_0 */
		 /* move-exception v2 */
	 } // .end method
	 /* # virtual methods */
	 public void characters ( Object[] p0, Integer p1, Integer p2 ) {
		 /* .locals 18 */
		 /* .param p1, "ch" # [C */
		 /* .param p2, "start" # I */
		 /* .param p3, "length" # I */
		 /* .prologue */
		 /* .line 110 */
		 /* move-object/from16 v0, p0 */
		 /* iget-boolean v4, v0, Lde/nurogames/android/ticb/base/core/ShopItemHandler;->tag_id:Z */
		 if ( v4 != null) { // if-eqz v4, :cond_0
			 /* .line 111 */
			 /* move-object/from16 v0, p0 */
			 v4 = this.myParsedExampleDataSet;
			 /* new-instance v5, Ljava/lang/String; */
			 /* move-object/from16 v0, p1 */
			 /* move/from16 v1, p2 */
			 /* move/from16 v2, p3 */
			 /* invoke-direct {v5, v0, v1, v2}, Ljava/lang/String;-><init>([CII)V */
			 v5 = 			 java.lang.Integer .parseInt ( v5 );
			 (( de.nurogames.android.ticb.base.core.ShopDataSet ) v4 ).setID ( v5 ); // invoke-virtual {v4, v5}, Lde/nurogames/android/ticb/base/core/ShopDataSet;->setID(I)V
			 /* .line 113 */
		 } // :cond_0
		 /* move-object/from16 v0, p0 */
		 /* iget-boolean v4, v0, Lde/nurogames/android/ticb/base/core/ShopItemHandler;->tag_market:Z */
		 if ( v4 != null) { // if-eqz v4, :cond_1
			 /* .line 114 */
			 /* move-object/from16 v0, p0 */
			 v4 = this.myParsedExampleDataSet;
			 /* new-instance v5, Ljava/lang/String; */
			 /* move-object/from16 v0, p1 */
			 /* move/from16 v1, p2 */
			 /* move/from16 v2, p3 */
			 /* invoke-direct {v5, v0, v1, v2}, Ljava/lang/String;-><init>([CII)V */
			 (( de.nurogames.android.ticb.base.core.ShopDataSet ) v4 ).setMarketURL ( v5 ); // invoke-virtual {v4, v5}, Lde/nurogames/android/ticb/base/core/ShopDataSet;->setMarketURL(Ljava/lang/String;)V
			 /* .line 116 */
		 } // :cond_1
		 /* move-object/from16 v0, p0 */
		 /* iget-boolean v4, v0, Lde/nurogames/android/ticb/base/core/ShopItemHandler;->tag_icon:Z */
		 if ( v4 != null) { // if-eqz v4, :cond_2
			 /* .line 125 */
			 try { // :try_start_0
				 /* new-instance v4, Ljava/net/URL; */
				 /* new-instance v5, Ljava/lang/String; */
				 /* move-object/from16 v0, p1 */
				 /* move/from16 v1, p2 */
				 /* move/from16 v2, p3 */
				 /* invoke-direct {v5, v0, v1, v2}, Ljava/lang/String;-><init>([CII)V */
				 /* invoke-direct {v4, v5}, Ljava/net/URL;-><init>(Ljava/lang/String;)V */
				 (( java.net.URL ) v4 ).openConnection ( ); // invoke-virtual {v4}, Ljava/net/URL;->openConnection()Ljava/net/URLConnection;
				 /* .line 127 */
				 /* .local v12, "conn":Ljava/net/URLConnection; */
				 final String v16 = "appi:preview"; // const-string v16, "appi:preview"
				 /* .line 128 */
				 /* .local v16, "input":Ljava/lang/String; */
				 /* invoke-static/range {v16 ..v16}, Lde/nurogames/android/ticb/base/core/ShopItemHandler;->base64Encode(Ljava/lang/String;)Ljava/lang/String; */
				 /* .line 130 */
				 /* .local v14, "encoding":Ljava/lang/String; */
				 final String v4 = "Authorization"; // const-string v4, "Authorization"
				 /* new-instance v5, Ljava/lang/StringBuilder; */
				 final String v6 = "Basic "; // const-string v6, "Basic "
				 /* invoke-direct {v5, v6}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V */
				 (( java.lang.StringBuilder ) v5 ).append ( v14 ); // invoke-virtual {v5, v14}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
				 (( java.lang.StringBuilder ) v5 ).toString ( ); // invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
				 (( java.net.URLConnection ) v12 ).setRequestProperty ( v4, v5 ); // invoke-virtual {v12, v4, v5}, Ljava/net/URLConnection;->setRequestProperty(Ljava/lang/String;Ljava/lang/String;)V
				 /* .line 131 */
				 /* const/16 v4, 0xbb8 */
				 (( java.net.URLConnection ) v12 ).setConnectTimeout ( v4 ); // invoke-virtual {v12, v4}, Ljava/net/URLConnection;->setConnectTimeout(I)V
				 /* .line 132 */
				 (( java.net.URLConnection ) v12 ).connect ( ); // invoke-virtual {v12}, Ljava/net/URLConnection;->connect()V
				 /* .line 134 */
				 (( java.net.URLConnection ) v12 ).getInputStream ( ); // invoke-virtual {v12}, Ljava/net/URLConnection;->getInputStream()Ljava/io/InputStream;
				 /* .line 136 */
				 /* .local v17, "is":Ljava/io/InputStream; */
				 /* invoke-static/range {v17 ..v17}, Landroid/graphics/BitmapFactory;->decodeStream(Ljava/io/InputStream;)Landroid/graphics/Bitmap; */
				 /* .line 138 */
				 /* .local v15, "icon":Landroid/graphics/Bitmap; */
				 /* move-object/from16 v0, p0 */
				 v4 = this.myParsedExampleDataSet;
				 (( de.nurogames.android.ticb.base.core.ShopDataSet ) v4 ).setIcon ( v15 ); // invoke-virtual {v4, v15}, Lde/nurogames/android/ticb/base/core/ShopDataSet;->setIcon(Landroid/graphics/Bitmap;)V
				 /* :try_end_0 */
				 /* .catch Ljava/net/MalformedURLException; {:try_start_0 ..:try_end_0} :catch_0 */
				 /* .catch Ljava/io/IOException; {:try_start_0 ..:try_end_0} :catch_1 */
				 /* .line 145 */
			 } // .end local v12 # "conn":Ljava/net/URLConnection;
		 } // .end local v14 # "encoding":Ljava/lang/String;
	 } // .end local v15 # "icon":Landroid/graphics/Bitmap;
} // .end local v16 # "input":Ljava/lang/String;
} // .end local v17 # "is":Ljava/io/InputStream;
} // :cond_2
} // :goto_0
/* move-object/from16 v0, p0 */
/* iget-boolean v4, v0, Lde/nurogames/android/ticb/base/core/ShopItemHandler;->tag_name:Z */
if ( v4 != null) { // if-eqz v4, :cond_3
/* .line 146 */
/* move-object/from16 v0, p0 */
v4 = this.myParsedExampleDataSet;
/* new-instance v5, Ljava/lang/String; */
/* move-object/from16 v0, p1 */
/* move/from16 v1, p2 */
/* move/from16 v2, p3 */
/* invoke-direct {v5, v0, v1, v2}, Ljava/lang/String;-><init>([CII)V */
(( de.nurogames.android.ticb.base.core.ShopDataSet ) v4 ).setName ( v5 ); // invoke-virtual {v4, v5}, Lde/nurogames/android/ticb/base/core/ShopDataSet;->setName(Ljava/lang/String;)V
/* .line 148 */
} // :cond_3
/* move-object/from16 v0, p0 */
/* iget-boolean v4, v0, Lde/nurogames/android/ticb/base/core/ShopItemHandler;->tag_desc:Z */
if ( v4 != null) { // if-eqz v4, :cond_4
/* .line 149 */
/* move-object/from16 v0, p0 */
v4 = this.myParsedExampleDataSet;
/* new-instance v5, Ljava/lang/String; */
/* move-object/from16 v0, p1 */
/* move/from16 v1, p2 */
/* move/from16 v2, p3 */
/* invoke-direct {v5, v0, v1, v2}, Ljava/lang/String;-><init>([CII)V */
(( de.nurogames.android.ticb.base.core.ShopDataSet ) v4 ).setDesc ( v5 ); // invoke-virtual {v4, v5}, Lde/nurogames/android/ticb/base/core/ShopDataSet;->setDesc(Ljava/lang/String;)V
/* .line 151 */
} // :cond_4
/* move-object/from16 v0, p0 */
/* iget-boolean v4, v0, Lde/nurogames/android/ticb/base/core/ShopItemHandler;->tag_price:Z */
if ( v4 != null) { // if-eqz v4, :cond_5
/* .line 152 */
/* move-object/from16 v0, p0 */
v4 = this.myParsedExampleDataSet;
/* new-instance v5, Ljava/lang/String; */
/* move-object/from16 v0, p1 */
/* move/from16 v1, p2 */
/* move/from16 v2, p3 */
/* invoke-direct {v5, v0, v1, v2}, Ljava/lang/String;-><init>([CII)V */
(( de.nurogames.android.ticb.base.core.ShopDataSet ) v4 ).setPrice ( v5 ); // invoke-virtual {v4, v5}, Lde/nurogames/android/ticb/base/core/ShopDataSet;->setPrice(Ljava/lang/String;)V
/* .line 155 */
} // :cond_5
/* move-object/from16 v0, p0 */
/* iget-boolean v4, v0, Lde/nurogames/android/ticb/base/core/ShopItemHandler;->tag_isnew:Z */
if ( v4 != null) { // if-eqz v4, :cond_6
/* .line 156 */
/* move-object/from16 v0, p0 */
v4 = this.myParsedExampleDataSet;
/* new-instance v5, Ljava/lang/String; */
/* move-object/from16 v0, p1 */
/* move/from16 v1, p2 */
/* move/from16 v2, p3 */
/* invoke-direct {v5, v0, v1, v2}, Ljava/lang/String;-><init>([CII)V */
(( de.nurogames.android.ticb.base.core.ShopDataSet ) v4 ).setIsNew ( v5 ); // invoke-virtual {v4, v5}, Lde/nurogames/android/ticb/base/core/ShopDataSet;->setIsNew(Ljava/lang/String;)V
/* .line 159 */
} // :cond_6
/* move-object/from16 v0, p0 */
/* iget-boolean v4, v0, Lde/nurogames/android/ticb/base/core/ShopItemHandler;->tag_platform:Z */
if ( v4 != null) { // if-eqz v4, :cond_7
/* .line 161 */
/* move-object/from16 v0, p0 */
v4 = this.myParsedExampleDataSet;
/* new-instance v5, Ljava/lang/String; */
/* move-object/from16 v0, p1 */
/* move/from16 v1, p2 */
/* move/from16 v2, p3 */
/* invoke-direct {v5, v0, v1, v2}, Ljava/lang/String;-><init>([CII)V */
(( de.nurogames.android.ticb.base.core.ShopDataSet ) v4 ).setPlatform ( v5 ); // invoke-virtual {v4, v5}, Lde/nurogames/android/ticb/base/core/ShopDataSet;->setPlatform(Ljava/lang/String;)V
/* .line 163 */
/* new-instance v3, Lde/nurogames/android/ticb/base/core/ShopElement; */
/* .line 164 */
/* move-object/from16 v0, p0 */
v4 = this.myParsedExampleDataSet;
v4 = (( de.nurogames.android.ticb.base.core.ShopDataSet ) v4 ).getID ( ); // invoke-virtual {v4}, Lde/nurogames/android/ticb/base/core/ShopDataSet;->getID()I
/* .line 165 */
/* move-object/from16 v0, p0 */
v5 = this.myParsedExampleDataSet;
(( de.nurogames.android.ticb.base.core.ShopDataSet ) v5 ).getIcon ( ); // invoke-virtual {v5}, Lde/nurogames/android/ticb/base/core/ShopDataSet;->getIcon()Landroid/graphics/Bitmap;
/* .line 166 */
/* move-object/from16 v0, p0 */
v6 = this.myParsedExampleDataSet;
(( de.nurogames.android.ticb.base.core.ShopDataSet ) v6 ).getName ( ); // invoke-virtual {v6}, Lde/nurogames/android/ticb/base/core/ShopDataSet;->getName()Ljava/lang/String;
/* .line 167 */
/* move-object/from16 v0, p0 */
v7 = this.myParsedExampleDataSet;
(( de.nurogames.android.ticb.base.core.ShopDataSet ) v7 ).getPrice ( ); // invoke-virtual {v7}, Lde/nurogames/android/ticb/base/core/ShopDataSet;->getPrice()Ljava/lang/String;
/* .line 168 */
/* move-object/from16 v0, p0 */
v8 = this.myParsedExampleDataSet;
(( de.nurogames.android.ticb.base.core.ShopDataSet ) v8 ).getMarketURL ( ); // invoke-virtual {v8}, Lde/nurogames/android/ticb/base/core/ShopDataSet;->getMarketURL()Ljava/lang/String;
/* .line 169 */
/* move-object/from16 v0, p0 */
v9 = this.myParsedExampleDataSet;
(( de.nurogames.android.ticb.base.core.ShopDataSet ) v9 ).getDesc ( ); // invoke-virtual {v9}, Lde/nurogames/android/ticb/base/core/ShopDataSet;->getDesc()Ljava/lang/String;
/* .line 170 */
/* move-object/from16 v0, p0 */
v10 = this.myParsedExampleDataSet;
(( de.nurogames.android.ticb.base.core.ShopDataSet ) v10 ).getPlatform ( ); // invoke-virtual {v10}, Lde/nurogames/android/ticb/base/core/ShopDataSet;->getPlatform()Ljava/lang/String;
/* .line 171 */
/* move-object/from16 v0, p0 */
v11 = this.myParsedExampleDataSet;
(( de.nurogames.android.ticb.base.core.ShopDataSet ) v11 ).getIsNew ( ); // invoke-virtual {v11}, Lde/nurogames/android/ticb/base/core/ShopDataSet;->getIsNew()Ljava/lang/String;
/* .line 163 */
/* invoke-direct/range {v3 ..v11}, Lde/nurogames/android/ticb/base/core/ShopElement;-><init>(ILandroid/graphics/Bitmap;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V */
/* .line 174 */
/* .local v3, "shopitem":Lde/nurogames/android/ticb/base/core/ShopElement; */
v4 = de.nurogames.android.ticb.base.core.ShopMngr.shopItems;
(( java.util.Vector ) v4 ).addElement ( v3 ); // invoke-virtual {v4, v3}, Ljava/util/Vector;->addElement(Ljava/lang/Object;)V
/* .line 178 */
} // .end local v3 # "shopitem":Lde/nurogames/android/ticb/base/core/ShopElement;
} // :cond_7
return;
/* .line 140 */
/* :catch_0 */
/* move-exception v13 */
/* .local v13, "e":Ljava/net/MalformedURLException; */
(( java.net.MalformedURLException ) v13 ).printStackTrace ( ); // invoke-virtual {v13}, Ljava/net/MalformedURLException;->printStackTrace()V
/* goto/16 :goto_0 */
/* .line 141 */
} // .end local v13 # "e":Ljava/net/MalformedURLException;
/* :catch_1 */
/* move-exception v13 */
/* .local v13, "e":Ljava/io/IOException; */
(( java.io.IOException ) v13 ).printStackTrace ( ); // invoke-virtual {v13}, Ljava/io/IOException;->printStackTrace()V
/* goto/16 :goto_0 */
} // .end method
public void endDocument ( ) {
/* .locals 0 */
/* .annotation system Ldalvik/annotation/Throws; */
/* value = { */
/* Lorg/xml/sax/SAXException; */
/* } */
} // .end annotation
/* .prologue */
/* .line 59 */
return;
} // .end method
public void endElement ( java.lang.String p0, java.lang.String p1, java.lang.String p2 ) {
/* .locals 2 */
/* .param p1, "namespaceURI" # Ljava/lang/String; */
/* .param p2, "localName" # Ljava/lang/String; */
/* .param p3, "qName" # Ljava/lang/String; */
/* .annotation system Ldalvik/annotation/Throws; */
/* value = { */
/* Lorg/xml/sax/SAXException; */
/* } */
} // .end annotation
/* .prologue */
int v1 = 0; // const/4 v1, 0x0
/* .line 92 */
final String v0 = "id"; // const-string v0, "id"
v0 = (( java.lang.String ) p2 ).equals ( v0 ); // invoke-virtual {p2, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
if ( v0 != null) { // if-eqz v0, :cond_0
/* iput-boolean v1, p0, Lde/nurogames/android/ticb/base/core/ShopItemHandler;->tag_id:Z */
/* .line 93 */
} // :cond_0
final String v0 = "market"; // const-string v0, "market"
v0 = (( java.lang.String ) p2 ).equals ( v0 ); // invoke-virtual {p2, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
if ( v0 != null) { // if-eqz v0, :cond_1
/* iput-boolean v1, p0, Lde/nurogames/android/ticb/base/core/ShopItemHandler;->tag_market:Z */
/* .line 94 */
} // :cond_1
final String v0 = "icon"; // const-string v0, "icon"
v0 = (( java.lang.String ) p2 ).equals ( v0 ); // invoke-virtual {p2, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
if ( v0 != null) { // if-eqz v0, :cond_2
/* iput-boolean v1, p0, Lde/nurogames/android/ticb/base/core/ShopItemHandler;->tag_icon:Z */
/* .line 95 */
} // :cond_2
final String v0 = "name"; // const-string v0, "name"
v0 = (( java.lang.String ) p2 ).equals ( v0 ); // invoke-virtual {p2, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
if ( v0 != null) { // if-eqz v0, :cond_3
/* iput-boolean v1, p0, Lde/nurogames/android/ticb/base/core/ShopItemHandler;->tag_name:Z */
/* .line 96 */
} // :cond_3
final String v0 = "description"; // const-string v0, "description"
v0 = (( java.lang.String ) p2 ).equals ( v0 ); // invoke-virtual {p2, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
if ( v0 != null) { // if-eqz v0, :cond_4
/* iput-boolean v1, p0, Lde/nurogames/android/ticb/base/core/ShopItemHandler;->tag_desc:Z */
/* .line 97 */
} // :cond_4
final String v0 = "android"; // const-string v0, "android"
v0 = (( java.lang.String ) p2 ).equals ( v0 ); // invoke-virtual {p2, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
if ( v0 != null) { // if-eqz v0, :cond_5
/* iput-boolean v1, p0, Lde/nurogames/android/ticb/base/core/ShopItemHandler;->tag_price:Z */
/* .line 98 */
} // :cond_5
final String v0 = "plattform"; // const-string v0, "plattform"
v0 = (( java.lang.String ) p2 ).equals ( v0 ); // invoke-virtual {p2, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
if ( v0 != null) { // if-eqz v0, :cond_6
/* iput-boolean v1, p0, Lde/nurogames/android/ticb/base/core/ShopItemHandler;->tag_platform:Z */
/* .line 99 */
} // :cond_6
final String v0 = "promote-date"; // const-string v0, "promote-date"
v0 = (( java.lang.String ) p2 ).equals ( v0 ); // invoke-virtual {p2, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
if ( v0 != null) { // if-eqz v0, :cond_7
/* iput-boolean v1, p0, Lde/nurogames/android/ticb/base/core/ShopItemHandler;->tag_isnew:Z */
/* .line 101 */
} // :cond_7
return;
} // .end method
public de.nurogames.android.ticb.base.core.ShopDataSet getParsedData ( ) {
/* .locals 1 */
/* .prologue */
/* .line 42 */
v0 = this.myParsedExampleDataSet;
} // .end method
public void startDocument ( ) {
/* .locals 1 */
/* .annotation system Ldalvik/annotation/Throws; */
/* value = { */
/* Lorg/xml/sax/SAXException; */
/* } */
} // .end annotation
/* .prologue */
/* .line 53 */
/* new-instance v0, Lde/nurogames/android/ticb/base/core/ShopDataSet; */
/* invoke-direct {v0}, Lde/nurogames/android/ticb/base/core/ShopDataSet;-><init>()V */
this.myParsedExampleDataSet = v0;
/* .line 54 */
return;
} // .end method
public void startElement ( java.lang.String p0, java.lang.String p1, java.lang.String p2, org.xml.sax.Attributes p3 ) {
/* .locals 2 */
/* .param p1, "namespaceURI" # Ljava/lang/String; */
/* .param p2, "localName" # Ljava/lang/String; */
/* .param p3, "qName" # Ljava/lang/String; */
/* .param p4, "atts" # Lorg/xml/sax/Attributes; */
/* .annotation system Ldalvik/annotation/Throws; */
/* value = { */
/* Lorg/xml/sax/SAXException; */
/* } */
} // .end annotation
/* .prologue */
int v1 = 1; // const/4 v1, 0x1
/* .line 74 */
final String v0 = "id"; // const-string v0, "id"
v0 = (( java.lang.String ) p2 ).equals ( v0 ); // invoke-virtual {p2, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
if ( v0 != null) { // if-eqz v0, :cond_0
/* iput-boolean v1, p0, Lde/nurogames/android/ticb/base/core/ShopItemHandler;->tag_id:Z */
/* .line 75 */
} // :cond_0
final String v0 = "market"; // const-string v0, "market"
v0 = (( java.lang.String ) p2 ).equals ( v0 ); // invoke-virtual {p2, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
if ( v0 != null) { // if-eqz v0, :cond_1
/* iput-boolean v1, p0, Lde/nurogames/android/ticb/base/core/ShopItemHandler;->tag_market:Z */
/* .line 76 */
} // :cond_1
final String v0 = "icon"; // const-string v0, "icon"
v0 = (( java.lang.String ) p2 ).equals ( v0 ); // invoke-virtual {p2, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
if ( v0 != null) { // if-eqz v0, :cond_2
/* iput-boolean v1, p0, Lde/nurogames/android/ticb/base/core/ShopItemHandler;->tag_icon:Z */
/* .line 77 */
} // :cond_2
final String v0 = "name"; // const-string v0, "name"
v0 = (( java.lang.String ) p2 ).equals ( v0 ); // invoke-virtual {p2, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
if ( v0 != null) { // if-eqz v0, :cond_3
/* iput-boolean v1, p0, Lde/nurogames/android/ticb/base/core/ShopItemHandler;->tag_name:Z */
/* .line 78 */
} // :cond_3
final String v0 = "description"; // const-string v0, "description"
v0 = (( java.lang.String ) p2 ).equals ( v0 ); // invoke-virtual {p2, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
if ( v0 != null) { // if-eqz v0, :cond_4
/* iput-boolean v1, p0, Lde/nurogames/android/ticb/base/core/ShopItemHandler;->tag_desc:Z */
/* .line 79 */
} // :cond_4
final String v0 = "android"; // const-string v0, "android"
v0 = (( java.lang.String ) p2 ).equals ( v0 ); // invoke-virtual {p2, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
if ( v0 != null) { // if-eqz v0, :cond_5
/* iput-boolean v1, p0, Lde/nurogames/android/ticb/base/core/ShopItemHandler;->tag_price:Z */
/* .line 80 */
} // :cond_5
final String v0 = "plattform"; // const-string v0, "plattform"
v0 = (( java.lang.String ) p2 ).equals ( v0 ); // invoke-virtual {p2, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
if ( v0 != null) { // if-eqz v0, :cond_6
/* iput-boolean v1, p0, Lde/nurogames/android/ticb/base/core/ShopItemHandler;->tag_platform:Z */
/* .line 81 */
} // :cond_6
final String v0 = "promote-date"; // const-string v0, "promote-date"
v0 = (( java.lang.String ) p2 ).equals ( v0 ); // invoke-virtual {p2, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
if ( v0 != null) { // if-eqz v0, :cond_7
/* iput-boolean v1, p0, Lde/nurogames/android/ticb/base/core/ShopItemHandler;->tag_isnew:Z */
/* .line 83 */
} // :cond_7
return;
} // .end method
