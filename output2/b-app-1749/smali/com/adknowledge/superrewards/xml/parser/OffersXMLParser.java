public class com.adknowledge.superrewards.xml.parser.OffersXMLParser {
	 /* .source "OffersXMLParser.java" */
	 /* # instance fields */
	 private com.adknowledge.superrewards.model.SROffer currentSROffer;
	 private com.adknowledge.superrewards.model.SRPricePoint currentSRPricePoint;
	 /* # direct methods */
	 public com.adknowledge.superrewards.xml.parser.OffersXMLParser ( ) {
		 /* .locals 0 */
		 /* .prologue */
		 /* .line 40 */
		 /* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
		 /* .line 42 */
		 return;
	 } // .end method
	 static com.adknowledge.superrewards.model.SROffer access$000 ( com.adknowledge.superrewards.xml.parser.OffersXMLParser p0 ) { //synthethic
		 /* .locals 1 */
		 /* .param p0, "x0" # Lcom/adknowledge/superrewards/xml/parser/OffersXMLParser; */
		 /* .prologue */
		 /* .line 34 */
		 v0 = this.currentSROffer;
	 } // .end method
	 static com.adknowledge.superrewards.model.SROffer access$002 ( com.adknowledge.superrewards.xml.parser.OffersXMLParser p0, com.adknowledge.superrewards.model.SROffer p1 ) { //synthethic
		 /* .locals 0 */
		 /* .param p0, "x0" # Lcom/adknowledge/superrewards/xml/parser/OffersXMLParser; */
		 /* .param p1, "x1" # Lcom/adknowledge/superrewards/model/SROffer; */
		 /* .prologue */
		 /* .line 34 */
		 this.currentSROffer = p1;
	 } // .end method
	 static com.adknowledge.superrewards.model.SRPricePoint access$100 ( com.adknowledge.superrewards.xml.parser.OffersXMLParser p0 ) { //synthethic
		 /* .locals 1 */
		 /* .param p0, "x0" # Lcom/adknowledge/superrewards/xml/parser/OffersXMLParser; */
		 /* .prologue */
		 /* .line 34 */
		 v0 = this.currentSRPricePoint;
	 } // .end method
	 static com.adknowledge.superrewards.model.SRPricePoint access$102 ( com.adknowledge.superrewards.xml.parser.OffersXMLParser p0, com.adknowledge.superrewards.model.SRPricePoint p1 ) { //synthethic
		 /* .locals 0 */
		 /* .param p0, "x0" # Lcom/adknowledge/superrewards/xml/parser/OffersXMLParser; */
		 /* .param p1, "x1" # Lcom/adknowledge/superrewards/model/SRPricePoint; */
		 /* .prologue */
		 /* .line 34 */
		 this.currentSRPricePoint = p1;
	 } // .end method
	 /* # virtual methods */
	 public java.util.List parse ( java.lang.String p0 ) {
		 /* .locals 41 */
		 /* .param p1, "xml" # Ljava/lang/String; */
		 /* .annotation system Ldalvik/annotation/Signature; */
		 /* value = { */
		 /* "(", */
		 /* "Ljava/lang/String;", */
		 /* ")", */
		 /* "Ljava/util/List", */
		 /* "<", */
		 /* "Lcom/adknowledge/superrewards/model/SROffer;", */
		 /* ">;" */
		 /* } */
	 } // .end annotation
	 /* .prologue */
	 /* .line 51 */
	 final String v39 = "SR"; // const-string v39, "SR"
	 final String v40 = "In Offers Parser"; // const-string v40, "In Offers Parser"
	 /* invoke-static/range {v39 ..v40}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I */
	 /* .line 53 */
	 /* new-instance v39, Lcom/adknowledge/superrewards/model/SROffer; */
	 /* invoke-direct/range {v39 ..v39}, Lcom/adknowledge/superrewards/model/SROffer;-><init>()V */
	 /* move-object/from16 v0, v39 */
	 /* move-object/from16 v1, p0 */
	 this.currentSROffer = v0;
	 /* .line 54 */
	 /* new-instance v22, Landroid/sax/RootElement; */
	 final String v39 = "srxml"; // const-string v39, "srxml"
	 /* move-object/from16 v0, v22 */
	 /* move-object/from16 v1, v39 */
	 /* invoke-direct {v0, v1}, Landroid/sax/RootElement;-><init>(Ljava/lang/String;)V */
	 /* .line 55 */
	 /* .local v22, "offers":Landroid/sax/RootElement; */
	 /* new-instance v19, Ljava/util/ArrayList; */
	 /* invoke-direct/range {v19 ..v19}, Ljava/util/ArrayList;-><init>()V */
	 /* .line 56 */
	 /* .local v19, "messages":Ljava/util/List;, "Ljava/util/List<Lcom/adknowledge/superrewards/model/SROffer;>;" */
	 /* new-instance v39, Lcom/adknowledge/superrewards/xml/parser/OffersXMLParser$1; */
	 /* move-object/from16 v0, v39 */
	 /* move-object/from16 v1, p0 */
	 /* invoke-direct {v0, v1}, Lcom/adknowledge/superrewards/xml/parser/OffersXMLParser$1;-><init>(Lcom/adknowledge/superrewards/xml/parser/OffersXMLParser;)V */
	 /* move-object/from16 v0, v22 */
	 /* move-object/from16 v1, v39 */
	 (( android.sax.RootElement ) v0 ).setStartElementListener ( v1 ); // invoke-virtual {v0, v1}, Landroid/sax/RootElement;->setStartElementListener(Landroid/sax/StartElementListener;)V
	 /* .line 73 */
	 final String v39 = "params"; // const-string v39, "params"
	 /* move-object/from16 v0, v22 */
	 /* move-object/from16 v1, v39 */
	 (( android.sax.RootElement ) v0 ).getChild ( v1 ); // invoke-virtual {v0, v1}, Landroid/sax/RootElement;->getChild(Ljava/lang/String;)Landroid/sax/Element;
	 final String v40 = "links"; // const-string v40, "links"
	 /* invoke-virtual/range {v39 ..v40}, Landroid/sax/Element;->getChild(Ljava/lang/String;)Landroid/sax/Element; */
	 final String v40 = "help"; // const-string v40, "help"
	 /* invoke-virtual/range {v39 ..v40}, Landroid/sax/Element;->getChild(Ljava/lang/String;)Landroid/sax/Element; */
	 /* .line 75 */
	 /* .local v14, "help":Landroid/sax/Element; */
	 /* new-instance v39, Lcom/adknowledge/superrewards/xml/parser/OffersXMLParser$2; */
	 /* move-object/from16 v0, v39 */
	 /* move-object/from16 v1, p0 */
	 /* invoke-direct {v0, v1}, Lcom/adknowledge/superrewards/xml/parser/OffersXMLParser$2;-><init>(Lcom/adknowledge/superrewards/xml/parser/OffersXMLParser;)V */
	 /* move-object/from16 v0, v39 */
	 (( android.sax.Element ) v14 ).setEndTextElementListener ( v0 ); // invoke-virtual {v14, v0}, Landroid/sax/Element;->setEndTextElementListener(Landroid/sax/EndTextElementListener;)V
	 /* .line 82 */
	 final String v39 = "params"; // const-string v39, "params"
	 /* move-object/from16 v0, v22 */
	 /* move-object/from16 v1, v39 */
	 (( android.sax.RootElement ) v0 ).getChild ( v1 ); // invoke-virtual {v0, v1}, Landroid/sax/RootElement;->getChild(Ljava/lang/String;)Landroid/sax/Element;
	 final String v40 = "appinfo"; // const-string v40, "appinfo"
	 /* invoke-virtual/range {v39 ..v40}, Landroid/sax/Element;->getChild(Ljava/lang/String;)Landroid/sax/Element; */
	 /* .line 84 */
	 /* .local v3, "appinfo":Landroid/sax/Element; */
	 /* new-instance v39, Lcom/adknowledge/superrewards/xml/parser/OffersXMLParser$3; */
	 /* move-object/from16 v0, v39 */
	 /* move-object/from16 v1, p0 */
	 /* invoke-direct {v0, v1}, Lcom/adknowledge/superrewards/xml/parser/OffersXMLParser$3;-><init>(Lcom/adknowledge/superrewards/xml/parser/OffersXMLParser;)V */
	 /* move-object/from16 v0, v39 */
	 (( android.sax.Element ) v3 ).setStartElementListener ( v0 ); // invoke-virtual {v3, v0}, Landroid/sax/Element;->setStartElementListener(Landroid/sax/StartElementListener;)V
	 /* .line 92 */
	 final String v39 = "params"; // const-string v39, "params"
	 /* move-object/from16 v0, v22 */
	 /* move-object/from16 v1, v39 */
	 (( android.sax.RootElement ) v0 ).getChild ( v1 ); // invoke-virtual {v0, v1}, Landroid/sax/RootElement;->getChild(Ljava/lang/String;)Landroid/sax/Element;
	 final String v40 = "appinfo"; // const-string v40, "appinfo"
	 /* invoke-virtual/range {v39 ..v40}, Landroid/sax/Element;->getChild(Ljava/lang/String;)Landroid/sax/Element; */
	 final String v40 = "currency"; // const-string v40, "currency"
	 /* invoke-virtual/range {v39 ..v40}, Landroid/sax/Element;->getChild(Ljava/lang/String;)Landroid/sax/Element; */
	 /* .line 94 */
	 /* .local v5, "currency":Landroid/sax/Element; */
	 /* new-instance v39, Lcom/adknowledge/superrewards/xml/parser/OffersXMLParser$4; */
	 /* move-object/from16 v0, v39 */
	 /* move-object/from16 v1, p0 */
	 /* invoke-direct {v0, v1}, Lcom/adknowledge/superrewards/xml/parser/OffersXMLParser$4;-><init>(Lcom/adknowledge/superrewards/xml/parser/OffersXMLParser;)V */
	 /* move-object/from16 v0, v39 */
	 (( android.sax.Element ) v5 ).setEndTextElementListener ( v0 ); // invoke-virtual {v5, v0}, Landroid/sax/Element;->setEndTextElementListener(Landroid/sax/EndTextElementListener;)V
	 /* .line 101 */
	 final String v39 = "params"; // const-string v39, "params"
	 /* move-object/from16 v0, v22 */
	 /* move-object/from16 v1, v39 */
	 (( android.sax.RootElement ) v0 ).getChild ( v1 ); // invoke-virtual {v0, v1}, Landroid/sax/RootElement;->getChild(Ljava/lang/String;)Landroid/sax/Element;
	 final String v40 = "appinfo"; // const-string v40, "appinfo"
	 /* invoke-virtual/range {v39 ..v40}, Landroid/sax/Element;->getChild(Ljava/lang/String;)Landroid/sax/Element; */
	 final String v40 = "currency_icon"; // const-string v40, "currency_icon"
	 /* invoke-virtual/range {v39 ..v40}, Landroid/sax/Element;->getChild(Ljava/lang/String;)Landroid/sax/Element; */
	 /* .line 103 */
	 /* .local v6, "currencyIcon":Landroid/sax/Element; */
	 /* new-instance v39, Lcom/adknowledge/superrewards/xml/parser/OffersXMLParser$5; */
	 /* move-object/from16 v0, v39 */
	 /* move-object/from16 v1, p0 */
	 /* invoke-direct {v0, v1}, Lcom/adknowledge/superrewards/xml/parser/OffersXMLParser$5;-><init>(Lcom/adknowledge/superrewards/xml/parser/OffersXMLParser;)V */
	 /* move-object/from16 v0, v39 */
	 (( android.sax.Element ) v6 ).setEndTextElementListener ( v0 ); // invoke-virtual {v6, v0}, Landroid/sax/Element;->setEndTextElementListener(Landroid/sax/EndTextElementListener;)V
	 /* .line 112 */
	 final String v39 = "directpay"; // const-string v39, "directpay"
	 /* move-object/from16 v0, v22 */
	 /* move-object/from16 v1, v39 */
	 (( android.sax.RootElement ) v0 ).getChild ( v1 ); // invoke-virtual {v0, v1}, Landroid/sax/RootElement;->getChild(Ljava/lang/String;)Landroid/sax/Element;
	 final String v40 = "local_rate"; // const-string v40, "local_rate"
	 /* invoke-virtual/range {v39 ..v40}, Landroid/sax/Element;->getChild(Ljava/lang/String;)Landroid/sax/Element; */
	 final String v40 = "rate"; // const-string v40, "rate"
	 /* invoke-virtual/range {v39 ..v40}, Landroid/sax/Element;->getChild(Ljava/lang/String;)Landroid/sax/Element; */
	 /* .line 114 */
	 /* .local v17, "localrate":Landroid/sax/Element; */
	 /* new-instance v39, Lcom/adknowledge/superrewards/xml/parser/OffersXMLParser$6; */
	 /* move-object/from16 v0, v39 */
	 /* move-object/from16 v1, p0 */
	 /* invoke-direct {v0, v1}, Lcom/adknowledge/superrewards/xml/parser/OffersXMLParser$6;-><init>(Lcom/adknowledge/superrewards/xml/parser/OffersXMLParser;)V */
	 /* move-object/from16 v0, v17 */
	 /* move-object/from16 v1, v39 */
	 (( android.sax.Element ) v0 ).setEndTextElementListener ( v1 ); // invoke-virtual {v0, v1}, Landroid/sax/Element;->setEndTextElementListener(Landroid/sax/EndTextElementListener;)V
	 /* .line 121 */
	 final String v39 = "directpay"; // const-string v39, "directpay"
	 /* move-object/from16 v0, v22 */
	 /* move-object/from16 v1, v39 */
	 (( android.sax.RootElement ) v0 ).getChild ( v1 ); // invoke-virtual {v0, v1}, Landroid/sax/RootElement;->getChild(Ljava/lang/String;)Landroid/sax/Element;
	 final String v40 = "local_rate"; // const-string v40, "local_rate"
	 /* invoke-virtual/range {v39 ..v40}, Landroid/sax/Element;->getChild(Ljava/lang/String;)Landroid/sax/Element; */
	 final String v40 = "currency_code"; // const-string v40, "currency_code"
	 /* invoke-virtual/range {v39 ..v40}, Landroid/sax/Element;->getChild(Ljava/lang/String;)Landroid/sax/Element; */
	 /* .line 124 */
	 /* .local v7, "currencycode":Landroid/sax/Element; */
	 /* new-instance v39, Lcom/adknowledge/superrewards/xml/parser/OffersXMLParser$7; */
	 /* move-object/from16 v0, v39 */
	 /* move-object/from16 v1, p0 */
	 /* invoke-direct {v0, v1}, Lcom/adknowledge/superrewards/xml/parser/OffersXMLParser$7;-><init>(Lcom/adknowledge/superrewards/xml/parser/OffersXMLParser;)V */
	 /* move-object/from16 v0, v39 */
	 (( android.sax.Element ) v7 ).setEndTextElementListener ( v0 ); // invoke-virtual {v7, v0}, Landroid/sax/Element;->setEndTextElementListener(Landroid/sax/EndTextElementListener;)V
	 /* .line 133 */
	 final String v39 = "directpay"; // const-string v39, "directpay"
	 /* move-object/from16 v0, v22 */
	 /* move-object/from16 v1, v39 */
	 (( android.sax.RootElement ) v0 ).getChild ( v1 ); // invoke-virtual {v0, v1}, Landroid/sax/RootElement;->getChild(Ljava/lang/String;)Landroid/sax/Element;
	 final String v40 = "local_rate"; // const-string v40, "local_rate"
	 /* invoke-virtual/range {v39 ..v40}, Landroid/sax/Element;->getChild(Ljava/lang/String;)Landroid/sax/Element; */
	 final String v40 = "currency_symbol"; // const-string v40, "currency_symbol"
	 /* invoke-virtual/range {v39 ..v40}, Landroid/sax/Element;->getChild(Ljava/lang/String;)Landroid/sax/Element; */
	 /* .line 136 */
	 /* .local v8, "currencysymbol":Landroid/sax/Element; */
	 /* new-instance v39, Lcom/adknowledge/superrewards/xml/parser/OffersXMLParser$8; */
	 /* move-object/from16 v0, v39 */
	 /* move-object/from16 v1, p0 */
	 /* invoke-direct {v0, v1}, Lcom/adknowledge/superrewards/xml/parser/OffersXMLParser$8;-><init>(Lcom/adknowledge/superrewards/xml/parser/OffersXMLParser;)V */
	 /* move-object/from16 v0, v39 */
	 (( android.sax.Element ) v8 ).setEndTextElementListener ( v0 ); // invoke-virtual {v8, v0}, Landroid/sax/Element;->setEndTextElementListener(Landroid/sax/EndTextElementListener;)V
	 /* .line 145 */
	 final String v39 = "directpay"; // const-string v39, "directpay"
	 /* move-object/from16 v0, v22 */
	 /* move-object/from16 v1, v39 */
	 (( android.sax.RootElement ) v0 ).getChild ( v1 ); // invoke-virtual {v0, v1}, Landroid/sax/RootElement;->getChild(Ljava/lang/String;)Landroid/sax/Element;
	 final String v40 = "local_rate"; // const-string v40, "local_rate"
	 /* invoke-virtual/range {v39 ..v40}, Landroid/sax/Element;->getChild(Ljava/lang/String;)Landroid/sax/Element; */
	 final String v40 = "to_us_text"; // const-string v40, "to_us_text"
	 /* invoke-virtual/range {v39 ..v40}, Landroid/sax/Element;->getChild(Ljava/lang/String;)Landroid/sax/Element; */
	 /* .line 148 */
	 /* .local v37, "toustext":Landroid/sax/Element; */
	 /* new-instance v39, Lcom/adknowledge/superrewards/xml/parser/OffersXMLParser$9; */
	 /* move-object/from16 v0, v39 */
	 /* move-object/from16 v1, p0 */
	 /* invoke-direct {v0, v1}, Lcom/adknowledge/superrewards/xml/parser/OffersXMLParser$9;-><init>(Lcom/adknowledge/superrewards/xml/parser/OffersXMLParser;)V */
	 /* move-object/from16 v0, v37 */
	 /* move-object/from16 v1, v39 */
	 (( android.sax.Element ) v0 ).setEndTextElementListener ( v1 ); // invoke-virtual {v0, v1}, Landroid/sax/Element;->setEndTextElementListener(Landroid/sax/EndTextElementListener;)V
	 /* .line 155 */
	 final String v39 = "directpay"; // const-string v39, "directpay"
	 /* move-object/from16 v0, v22 */
	 /* move-object/from16 v1, v39 */
	 (( android.sax.RootElement ) v0 ).getChild ( v1 ); // invoke-virtual {v0, v1}, Landroid/sax/RootElement;->getChild(Ljava/lang/String;)Landroid/sax/Element;
	 final String v40 = "providers"; // const-string v40, "providers"
	 /* invoke-virtual/range {v39 ..v40}, Landroid/sax/Element;->getChild(Ljava/lang/String;)Landroid/sax/Element; */
	 final String v40 = "provider"; // const-string v40, "provider"
	 /* invoke-virtual/range {v39 ..v40}, Landroid/sax/Element;->getChild(Ljava/lang/String;)Landroid/sax/Element; */
	 /* .line 157 */
	 /* .local v11, "dpayoffer":Landroid/sax/Element; */
	 /* new-instance v39, Lcom/adknowledge/superrewards/xml/parser/OffersXMLParser$10; */
	 /* move-object/from16 v0, v39 */
	 /* move-object/from16 v1, p0 */
	 /* invoke-direct {v0, v1}, Lcom/adknowledge/superrewards/xml/parser/OffersXMLParser$10;-><init>(Lcom/adknowledge/superrewards/xml/parser/OffersXMLParser;)V */
	 /* move-object/from16 v0, v39 */
	 (( android.sax.Element ) v11 ).setStartElementListener ( v0 ); // invoke-virtual {v11, v0}, Landroid/sax/Element;->setStartElementListener(Landroid/sax/StartElementListener;)V
	 /* .line 169 */
	 /* new-instance v39, Lcom/adknowledge/superrewards/xml/parser/OffersXMLParser$11; */
	 /* move-object/from16 v0, v39 */
	 /* move-object/from16 v1, p0 */
	 /* move-object/from16 v2, v19 */
	 /* invoke-direct {v0, v1, v2}, Lcom/adknowledge/superrewards/xml/parser/OffersXMLParser$11;-><init>(Lcom/adknowledge/superrewards/xml/parser/OffersXMLParser;Ljava/util/List;)V */
	 /* move-object/from16 v0, v39 */
	 (( android.sax.Element ) v11 ).setEndElementListener ( v0 ); // invoke-virtual {v11, v0}, Landroid/sax/Element;->setEndElementListener(Landroid/sax/EndElementListener;)V
	 /* .line 178 */
	 final String v39 = "name"; // const-string v39, "name"
	 /* move-object/from16 v0, v39 */
	 (( android.sax.Element ) v11 ).getChild ( v0 ); // invoke-virtual {v11, v0}, Landroid/sax/Element;->getChild(Ljava/lang/String;)Landroid/sax/Element;
	 /* .line 179 */
	 /* .local v20, "name":Landroid/sax/Element; */
	 /* new-instance v39, Lcom/adknowledge/superrewards/xml/parser/OffersXMLParser$12; */
	 /* move-object/from16 v0, v39 */
	 /* move-object/from16 v1, p0 */
	 /* invoke-direct {v0, v1}, Lcom/adknowledge/superrewards/xml/parser/OffersXMLParser$12;-><init>(Lcom/adknowledge/superrewards/xml/parser/OffersXMLParser;)V */
	 /* move-object/from16 v0, v20 */
	 /* move-object/from16 v1, v39 */
	 (( android.sax.Element ) v0 ).setEndTextElementListener ( v1 ); // invoke-virtual {v0, v1}, Landroid/sax/Element;->setEndTextElementListener(Landroid/sax/EndTextElementListener;)V
	 /* .line 187 */
	 final String v39 = "description"; // const-string v39, "description"
	 /* move-object/from16 v0, v39 */
	 (( android.sax.Element ) v11 ).getChild ( v0 ); // invoke-virtual {v11, v0}, Landroid/sax/Element;->getChild(Ljava/lang/String;)Landroid/sax/Element;
	 /* .line 188 */
	 /* .local v9, "description":Landroid/sax/Element; */
	 /* new-instance v39, Lcom/adknowledge/superrewards/xml/parser/OffersXMLParser$13; */
	 /* move-object/from16 v0, v39 */
	 /* move-object/from16 v1, p0 */
	 /* invoke-direct {v0, v1}, Lcom/adknowledge/superrewards/xml/parser/OffersXMLParser$13;-><init>(Lcom/adknowledge/superrewards/xml/parser/OffersXMLParser;)V */
	 /* move-object/from16 v0, v39 */
	 (( android.sax.Element ) v9 ).setEndTextElementListener ( v0 ); // invoke-virtual {v9, v0}, Landroid/sax/Element;->setEndTextElementListener(Landroid/sax/EndTextElementListener;)V
	 /* .line 196 */
	 final String v39 = "short_description"; // const-string v39, "short_description"
	 /* move-object/from16 v0, v39 */
	 (( android.sax.Element ) v11 ).getChild ( v0 ); // invoke-virtual {v11, v0}, Landroid/sax/Element;->getChild(Ljava/lang/String;)Landroid/sax/Element;
	 /* .line 198 */
	 /* .local v28, "shortdescription":Landroid/sax/Element; */
	 /* new-instance v39, Lcom/adknowledge/superrewards/xml/parser/OffersXMLParser$14; */
	 /* move-object/from16 v0, v39 */
	 /* move-object/from16 v1, p0 */
	 /* invoke-direct {v0, v1}, Lcom/adknowledge/superrewards/xml/parser/OffersXMLParser$14;-><init>(Lcom/adknowledge/superrewards/xml/parser/OffersXMLParser;)V */
	 /* move-object/from16 v0, v28 */
	 /* move-object/from16 v1, v39 */
	 (( android.sax.Element ) v0 ).setEndTextElementListener ( v1 ); // invoke-virtual {v0, v1}, Landroid/sax/Element;->setEndTextElementListener(Landroid/sax/EndTextElementListener;)V
	 /* .line 208 */
	 final String v39 = "long_description"; // const-string v39, "long_description"
	 /* move-object/from16 v0, v39 */
	 (( android.sax.Element ) v11 ).getChild ( v0 ); // invoke-virtual {v11, v0}, Landroid/sax/Element;->getChild(Ljava/lang/String;)Landroid/sax/Element;
	 /* .line 210 */
	 /* .local v18, "longdescription":Landroid/sax/Element; */
	 /* new-instance v39, Lcom/adknowledge/superrewards/xml/parser/OffersXMLParser$15; */
	 /* move-object/from16 v0, v39 */
	 /* move-object/from16 v1, p0 */
	 /* invoke-direct {v0, v1}, Lcom/adknowledge/superrewards/xml/parser/OffersXMLParser$15;-><init>(Lcom/adknowledge/superrewards/xml/parser/OffersXMLParser;)V */
	 /* move-object/from16 v0, v18 */
	 /* move-object/from16 v1, v39 */
	 (( android.sax.Element ) v0 ).setEndTextElementListener ( v1 ); // invoke-virtual {v0, v1}, Landroid/sax/Element;->setEndTextElementListener(Landroid/sax/EndTextElementListener;)V
	 /* .line 220 */
	 final String v39 = "geo_availability"; // const-string v39, "geo_availability"
	 /* move-object/from16 v0, v39 */
	 (( android.sax.Element ) v11 ).getChild ( v0 ); // invoke-virtual {v11, v0}, Landroid/sax/Element;->getChild(Ljava/lang/String;)Landroid/sax/Element;
	 /* .line 221 */
	 /* .local v13, "geo":Landroid/sax/Element; */
	 /* new-instance v39, Lcom/adknowledge/superrewards/xml/parser/OffersXMLParser$16; */
	 /* move-object/from16 v0, v39 */
	 /* move-object/from16 v1, p0 */
	 /* invoke-direct {v0, v1}, Lcom/adknowledge/superrewards/xml/parser/OffersXMLParser$16;-><init>(Lcom/adknowledge/superrewards/xml/parser/OffersXMLParser;)V */
	 /* move-object/from16 v0, v39 */
	 (( android.sax.Element ) v13 ).setEndTextElementListener ( v0 ); // invoke-virtual {v13, v0}, Landroid/sax/Element;->setEndTextElementListener(Landroid/sax/EndTextElementListener;)V
	 /* .line 229 */
	 final String v39 = "click_url"; // const-string v39, "click_url"
	 /* move-object/from16 v0, v39 */
	 (( android.sax.Element ) v11 ).getChild ( v0 ); // invoke-virtual {v11, v0}, Landroid/sax/Element;->getChild(Ljava/lang/String;)Landroid/sax/Element;
	 /* .line 230 */
	 /* .local v4, "clickurl":Landroid/sax/Element; */
	 /* new-instance v39, Lcom/adknowledge/superrewards/xml/parser/OffersXMLParser$17; */
	 /* move-object/from16 v0, v39 */
	 /* move-object/from16 v1, p0 */
	 /* invoke-direct {v0, v1}, Lcom/adknowledge/superrewards/xml/parser/OffersXMLParser$17;-><init>(Lcom/adknowledge/superrewards/xml/parser/OffersXMLParser;)V */
	 /* move-object/from16 v0, v39 */
	 (( android.sax.Element ) v4 ).setEndTextElementListener ( v0 ); // invoke-virtual {v4, v0}, Landroid/sax/Element;->setEndTextElementListener(Landroid/sax/EndTextElementListener;)V
	 /* .line 238 */
	 final String v39 = "image"; // const-string v39, "image"
	 /* move-object/from16 v0, v39 */
	 (( android.sax.Element ) v11 ).getChild ( v0 ); // invoke-virtual {v11, v0}, Landroid/sax/Element;->getChild(Ljava/lang/String;)Landroid/sax/Element;
	 /* .line 239 */
	 /* .local v15, "image":Landroid/sax/Element; */
	 /* new-instance v39, Lcom/adknowledge/superrewards/xml/parser/OffersXMLParser$18; */
	 /* move-object/from16 v0, v39 */
	 /* move-object/from16 v1, p0 */
	 /* invoke-direct {v0, v1}, Lcom/adknowledge/superrewards/xml/parser/OffersXMLParser$18;-><init>(Lcom/adknowledge/superrewards/xml/parser/OffersXMLParser;)V */
	 /* move-object/from16 v0, v39 */
	 (( android.sax.Element ) v15 ).setEndTextElementListener ( v0 ); // invoke-virtual {v15, v0}, Landroid/sax/Element;->setEndTextElementListener(Landroid/sax/EndTextElementListener;)V
	 /* .line 247 */
	 final String v39 = "price_points"; // const-string v39, "price_points"
	 /* move-object/from16 v0, v39 */
	 (( android.sax.Element ) v11 ).getChild ( v0 ); // invoke-virtual {v11, v0}, Landroid/sax/Element;->getChild(Ljava/lang/String;)Landroid/sax/Element;
	 /* .line 248 */
	 /* .local v26, "pricePoints":Landroid/sax/Element; */
	 /* new-instance v39, Lcom/adknowledge/superrewards/model/SRPricePoint; */
	 /* invoke-direct/range {v39 ..v39}, Lcom/adknowledge/superrewards/model/SRPricePoint;-><init>()V */
	 /* move-object/from16 v0, v39 */
	 /* move-object/from16 v1, p0 */
	 this.currentSRPricePoint = v0;
	 /* .line 249 */
	 final String v39 = "price"; // const-string v39, "price"
	 /* move-object/from16 v0, v26 */
	 /* move-object/from16 v1, v39 */
	 (( android.sax.Element ) v0 ).getChild ( v1 ); // invoke-virtual {v0, v1}, Landroid/sax/Element;->getChild(Ljava/lang/String;)Landroid/sax/Element;
	 /* .line 250 */
	 /* .local v25, "pricePoint":Landroid/sax/Element; */
	 /* new-instance v39, Lcom/adknowledge/superrewards/xml/parser/OffersXMLParser$19; */
	 /* move-object/from16 v0, v39 */
	 /* move-object/from16 v1, p0 */
	 /* invoke-direct {v0, v1}, Lcom/adknowledge/superrewards/xml/parser/OffersXMLParser$19;-><init>(Lcom/adknowledge/superrewards/xml/parser/OffersXMLParser;)V */
	 /* move-object/from16 v0, v25 */
	 /* move-object/from16 v1, v39 */
	 (( android.sax.Element ) v0 ).setStartElementListener ( v1 ); // invoke-virtual {v0, v1}, Landroid/sax/Element;->setStartElementListener(Landroid/sax/StartElementListener;)V
	 /* .line 298 */
	 /* new-instance v39, Lcom/adknowledge/superrewards/xml/parser/OffersXMLParser$20; */
	 /* move-object/from16 v0, v39 */
	 /* move-object/from16 v1, p0 */
	 /* invoke-direct {v0, v1}, Lcom/adknowledge/superrewards/xml/parser/OffersXMLParser$20;-><init>(Lcom/adknowledge/superrewards/xml/parser/OffersXMLParser;)V */
	 /* move-object/from16 v0, v25 */
	 /* move-object/from16 v1, v39 */
	 (( android.sax.Element ) v0 ).setEndElementListener ( v1 ); // invoke-virtual {v0, v1}, Landroid/sax/Element;->setEndElementListener(Landroid/sax/EndElementListener;)V
	 /* .line 310 */
	 final String v39 = "offers"; // const-string v39, "offers"
	 /* move-object/from16 v0, v22 */
	 /* move-object/from16 v1, v39 */
	 (( android.sax.RootElement ) v0 ).getChild ( v1 ); // invoke-virtual {v0, v1}, Landroid/sax/RootElement;->getChild(Ljava/lang/String;)Landroid/sax/Element;
	 /* .line 313 */
	 /* .local v23, "otheroffer":Landroid/sax/Element; */
	 final String v39 = "testoffer"; // const-string v39, "testoffer"
	 /* move-object/from16 v0, v23 */
	 /* move-object/from16 v1, v39 */
	 (( android.sax.Element ) v0 ).getChild ( v1 ); // invoke-virtual {v0, v1}, Landroid/sax/Element;->getChild(Ljava/lang/String;)Landroid/sax/Element;
	 /* .line 314 */
	 /* .local v31, "testoffer":Landroid/sax/Element; */
	 /* new-instance v39, Lcom/adknowledge/superrewards/xml/parser/OffersXMLParser$21; */
	 /* move-object/from16 v0, v39 */
	 /* move-object/from16 v1, p0 */
	 /* invoke-direct {v0, v1}, Lcom/adknowledge/superrewards/xml/parser/OffersXMLParser$21;-><init>(Lcom/adknowledge/superrewards/xml/parser/OffersXMLParser;)V */
	 /* move-object/from16 v0, v31 */
	 /* move-object/from16 v1, v39 */
	 (( android.sax.Element ) v0 ).setStartElementListener ( v1 ); // invoke-virtual {v0, v1}, Landroid/sax/Element;->setStartElementListener(Landroid/sax/StartElementListener;)V
	 /* .line 324 */
	 /* new-instance v39, Lcom/adknowledge/superrewards/xml/parser/OffersXMLParser$22; */
	 /* move-object/from16 v0, v39 */
	 /* move-object/from16 v1, p0 */
	 /* move-object/from16 v2, v19 */
	 /* invoke-direct {v0, v1, v2}, Lcom/adknowledge/superrewards/xml/parser/OffersXMLParser$22;-><init>(Lcom/adknowledge/superrewards/xml/parser/OffersXMLParser;Ljava/util/List;)V */
	 /* move-object/from16 v0, v31 */
	 /* move-object/from16 v1, v39 */
	 (( android.sax.Element ) v0 ).setEndElementListener ( v1 ); // invoke-virtual {v0, v1}, Landroid/sax/Element;->setEndElementListener(Landroid/sax/EndElementListener;)V
	 /* .line 335 */
	 final String v39 = "title"; // const-string v39, "title"
	 /* move-object/from16 v0, v31 */
	 /* move-object/from16 v1, v39 */
	 (( android.sax.Element ) v0 ).getChild ( v1 ); // invoke-virtual {v0, v1}, Landroid/sax/Element;->getChild(Ljava/lang/String;)Landroid/sax/Element;
	 /* .line 336 */
	 /* .local v34, "testtitle":Landroid/sax/Element; */
	 /* new-instance v39, Lcom/adknowledge/superrewards/xml/parser/OffersXMLParser$23; */
	 /* move-object/from16 v0, v39 */
	 /* move-object/from16 v1, p0 */
	 /* invoke-direct {v0, v1}, Lcom/adknowledge/superrewards/xml/parser/OffersXMLParser$23;-><init>(Lcom/adknowledge/superrewards/xml/parser/OffersXMLParser;)V */
	 /* move-object/from16 v0, v34 */
	 /* move-object/from16 v1, v39 */
	 (( android.sax.Element ) v0 ).setEndTextElementListener ( v1 ); // invoke-virtual {v0, v1}, Landroid/sax/Element;->setEndTextElementListener(Landroid/sax/EndTextElementListener;)V
	 /* .line 344 */
	 final String v39 = "description"; // const-string v39, "description"
	 /* move-object/from16 v0, v31 */
	 /* move-object/from16 v1, v39 */
	 (( android.sax.Element ) v0 ).getChild ( v1 ); // invoke-virtual {v0, v1}, Landroid/sax/Element;->getChild(Ljava/lang/String;)Landroid/sax/Element;
	 /* .line 345 */
	 /* .local v29, "testdescription2":Landroid/sax/Element; */
	 /* new-instance v39, Lcom/adknowledge/superrewards/xml/parser/OffersXMLParser$24; */
	 /* move-object/from16 v0, v39 */
	 /* move-object/from16 v1, p0 */
	 /* invoke-direct {v0, v1}, Lcom/adknowledge/superrewards/xml/parser/OffersXMLParser$24;-><init>(Lcom/adknowledge/superrewards/xml/parser/OffersXMLParser;)V */
	 /* move-object/from16 v0, v29 */
	 /* move-object/from16 v1, v39 */
	 (( android.sax.Element ) v0 ).setEndTextElementListener ( v1 ); // invoke-virtual {v0, v1}, Landroid/sax/Element;->setEndTextElementListener(Landroid/sax/EndTextElementListener;)V
	 /* .line 353 */
	 final String v39 = "requirements"; // const-string v39, "requirements"
	 /* move-object/from16 v0, v31 */
	 /* move-object/from16 v1, v39 */
	 (( android.sax.Element ) v0 ).getChild ( v1 ); // invoke-virtual {v0, v1}, Landroid/sax/Element;->getChild(Ljava/lang/String;)Landroid/sax/Element;
	 /* .line 354 */
	 /* .local v33, "testrequirements":Landroid/sax/Element; */
	 /* new-instance v39, Lcom/adknowledge/superrewards/xml/parser/OffersXMLParser$25; */
	 /* move-object/from16 v0, v39 */
	 /* move-object/from16 v1, p0 */
	 /* invoke-direct {v0, v1}, Lcom/adknowledge/superrewards/xml/parser/OffersXMLParser$25;-><init>(Lcom/adknowledge/superrewards/xml/parser/OffersXMLParser;)V */
	 /* move-object/from16 v0, v33 */
	 /* move-object/from16 v1, v39 */
	 (( android.sax.Element ) v0 ).setEndTextElementListener ( v1 ); // invoke-virtual {v0, v1}, Landroid/sax/Element;->setEndTextElementListener(Landroid/sax/EndTextElementListener;)V
	 /* .line 362 */
	 final String v39 = "payout"; // const-string v39, "payout"
	 /* move-object/from16 v0, v31 */
	 /* move-object/from16 v1, v39 */
	 (( android.sax.Element ) v0 ).getChild ( v1 ); // invoke-virtual {v0, v1}, Landroid/sax/Element;->getChild(Ljava/lang/String;)Landroid/sax/Element;
	 /* .line 363 */
	 /* .local v32, "testpayout":Landroid/sax/Element; */
	 /* new-instance v39, Lcom/adknowledge/superrewards/xml/parser/OffersXMLParser$26; */
	 /* move-object/from16 v0, v39 */
	 /* move-object/from16 v1, p0 */
	 /* invoke-direct {v0, v1}, Lcom/adknowledge/superrewards/xml/parser/OffersXMLParser$26;-><init>(Lcom/adknowledge/superrewards/xml/parser/OffersXMLParser;)V */
	 /* move-object/from16 v0, v32 */
	 /* move-object/from16 v1, v39 */
	 (( android.sax.Element ) v0 ).setEndTextElementListener ( v1 ); // invoke-virtual {v0, v1}, Landroid/sax/Element;->setEndTextElementListener(Landroid/sax/EndTextElementListener;)V
	 /* .line 371 */
	 final String v39 = "click_url"; // const-string v39, "click_url"
	 /* move-object/from16 v0, v31 */
	 /* move-object/from16 v1, v39 */
	 (( android.sax.Element ) v0 ).getChild ( v1 ); // invoke-virtual {v0, v1}, Landroid/sax/Element;->getChild(Ljava/lang/String;)Landroid/sax/Element;
	 /* .line 372 */
	 /* .local v35, "testurl":Landroid/sax/Element; */
	 /* new-instance v39, Lcom/adknowledge/superrewards/xml/parser/OffersXMLParser$27; */
	 /* move-object/from16 v0, v39 */
	 /* move-object/from16 v1, p0 */
	 /* invoke-direct {v0, v1}, Lcom/adknowledge/superrewards/xml/parser/OffersXMLParser$27;-><init>(Lcom/adknowledge/superrewards/xml/parser/OffersXMLParser;)V */
	 /* move-object/from16 v0, v35 */
	 /* move-object/from16 v1, v39 */
	 (( android.sax.Element ) v0 ).setEndTextElementListener ( v1 ); // invoke-virtual {v0, v1}, Landroid/sax/Element;->setEndTextElementListener(Landroid/sax/EndTextElementListener;)V
	 /* .line 380 */
	 final String v39 = "image"; // const-string v39, "image"
	 /* move-object/from16 v0, v31 */
	 /* move-object/from16 v1, v39 */
	 (( android.sax.Element ) v0 ).getChild ( v1 ); // invoke-virtual {v0, v1}, Landroid/sax/Element;->getChild(Ljava/lang/String;)Landroid/sax/Element;
	 /* .line 381 */
	 /* .local v30, "testimage2":Landroid/sax/Element; */
	 /* new-instance v39, Lcom/adknowledge/superrewards/xml/parser/OffersXMLParser$28; */
	 /* move-object/from16 v0, v39 */
	 /* move-object/from16 v1, p0 */
	 /* invoke-direct {v0, v1}, Lcom/adknowledge/superrewards/xml/parser/OffersXMLParser$28;-><init>(Lcom/adknowledge/superrewards/xml/parser/OffersXMLParser;)V */
	 /* move-object/from16 v0, v30 */
	 /* move-object/from16 v1, v39 */
	 (( android.sax.Element ) v0 ).setEndTextElementListener ( v1 ); // invoke-virtual {v0, v1}, Landroid/sax/Element;->setEndTextElementListener(Landroid/sax/EndTextElementListener;)V
	 /* .line 391 */
	 final String v39 = "offer"; // const-string v39, "offer"
	 /* move-object/from16 v0, v23 */
	 /* move-object/from16 v1, v39 */
	 (( android.sax.Element ) v0 ).getChild ( v1 ); // invoke-virtual {v0, v1}, Landroid/sax/Element;->getChild(Ljava/lang/String;)Landroid/sax/Element;
	 /* .line 392 */
	 /* .local v21, "offer":Landroid/sax/Element; */
	 /* new-instance v39, Lcom/adknowledge/superrewards/xml/parser/OffersXMLParser$29; */
	 /* move-object/from16 v0, v39 */
	 /* move-object/from16 v1, p0 */
	 /* invoke-direct {v0, v1}, Lcom/adknowledge/superrewards/xml/parser/OffersXMLParser$29;-><init>(Lcom/adknowledge/superrewards/xml/parser/OffersXMLParser;)V */
	 /* move-object/from16 v0, v21 */
	 /* move-object/from16 v1, v39 */
	 (( android.sax.Element ) v0 ).setStartElementListener ( v1 ); // invoke-virtual {v0, v1}, Landroid/sax/Element;->setStartElementListener(Landroid/sax/StartElementListener;)V
	 /* .line 413 */
	 /* new-instance v39, Lcom/adknowledge/superrewards/xml/parser/OffersXMLParser$30; */
	 /* move-object/from16 v0, v39 */
	 /* move-object/from16 v1, p0 */
	 /* move-object/from16 v2, v19 */
	 /* invoke-direct {v0, v1, v2}, Lcom/adknowledge/superrewards/xml/parser/OffersXMLParser$30;-><init>(Lcom/adknowledge/superrewards/xml/parser/OffersXMLParser;Ljava/util/List;)V */
	 /* move-object/from16 v0, v21 */
	 /* move-object/from16 v1, v39 */
	 (( android.sax.Element ) v0 ).setEndElementListener ( v1 ); // invoke-virtual {v0, v1}, Landroid/sax/Element;->setEndElementListener(Landroid/sax/EndElementListener;)V
	 /* .line 423 */
	 final String v39 = "title"; // const-string v39, "title"
	 /* move-object/from16 v0, v21 */
	 /* move-object/from16 v1, v39 */
	 (( android.sax.Element ) v0 ).getChild ( v1 ); // invoke-virtual {v0, v1}, Landroid/sax/Element;->getChild(Ljava/lang/String;)Landroid/sax/Element;
	 /* .line 424 */
	 /* .local v36, "title":Landroid/sax/Element; */
	 /* new-instance v39, Lcom/adknowledge/superrewards/xml/parser/OffersXMLParser$31; */
	 /* move-object/from16 v0, v39 */
	 /* move-object/from16 v1, p0 */
	 /* invoke-direct {v0, v1}, Lcom/adknowledge/superrewards/xml/parser/OffersXMLParser$31;-><init>(Lcom/adknowledge/superrewards/xml/parser/OffersXMLParser;)V */
	 /* move-object/from16 v0, v36 */
	 /* move-object/from16 v1, v39 */
	 (( android.sax.Element ) v0 ).setEndTextElementListener ( v1 ); // invoke-virtual {v0, v1}, Landroid/sax/Element;->setEndTextElementListener(Landroid/sax/EndTextElementListener;)V
	 /* .line 432 */
	 final String v39 = "description"; // const-string v39, "description"
	 /* move-object/from16 v0, v21 */
	 /* move-object/from16 v1, v39 */
	 (( android.sax.Element ) v0 ).getChild ( v1 ); // invoke-virtual {v0, v1}, Landroid/sax/Element;->getChild(Ljava/lang/String;)Landroid/sax/Element;
	 /* .line 433 */
	 /* .local v10, "description2":Landroid/sax/Element; */
	 /* new-instance v39, Lcom/adknowledge/superrewards/xml/parser/OffersXMLParser$32; */
	 /* move-object/from16 v0, v39 */
	 /* move-object/from16 v1, p0 */
	 /* invoke-direct {v0, v1}, Lcom/adknowledge/superrewards/xml/parser/OffersXMLParser$32;-><init>(Lcom/adknowledge/superrewards/xml/parser/OffersXMLParser;)V */
	 /* move-object/from16 v0, v39 */
	 (( android.sax.Element ) v10 ).setEndTextElementListener ( v0 ); // invoke-virtual {v10, v0}, Landroid/sax/Element;->setEndTextElementListener(Landroid/sax/EndTextElementListener;)V
	 /* .line 441 */
	 final String v39 = "requirements"; // const-string v39, "requirements"
	 /* move-object/from16 v0, v21 */
	 /* move-object/from16 v1, v39 */
	 (( android.sax.Element ) v0 ).getChild ( v1 ); // invoke-virtual {v0, v1}, Landroid/sax/Element;->getChild(Ljava/lang/String;)Landroid/sax/Element;
	 /* .line 442 */
	 /* .local v27, "requirements":Landroid/sax/Element; */
	 /* new-instance v39, Lcom/adknowledge/superrewards/xml/parser/OffersXMLParser$33; */
	 /* move-object/from16 v0, v39 */
	 /* move-object/from16 v1, p0 */
	 /* invoke-direct {v0, v1}, Lcom/adknowledge/superrewards/xml/parser/OffersXMLParser$33;-><init>(Lcom/adknowledge/superrewards/xml/parser/OffersXMLParser;)V */
	 /* move-object/from16 v0, v27 */
	 /* move-object/from16 v1, v39 */
	 (( android.sax.Element ) v0 ).setEndTextElementListener ( v1 ); // invoke-virtual {v0, v1}, Landroid/sax/Element;->setEndTextElementListener(Landroid/sax/EndTextElementListener;)V
	 /* .line 450 */
	 final String v39 = "payout"; // const-string v39, "payout"
	 /* move-object/from16 v0, v21 */
	 /* move-object/from16 v1, v39 */
	 (( android.sax.Element ) v0 ).getChild ( v1 ); // invoke-virtual {v0, v1}, Landroid/sax/Element;->getChild(Ljava/lang/String;)Landroid/sax/Element;
	 /* .line 451 */
	 /* .local v24, "payout":Landroid/sax/Element; */
	 /* new-instance v39, Lcom/adknowledge/superrewards/xml/parser/OffersXMLParser$34; */
	 /* move-object/from16 v0, v39 */
	 /* move-object/from16 v1, p0 */
	 /* invoke-direct {v0, v1}, Lcom/adknowledge/superrewards/xml/parser/OffersXMLParser$34;-><init>(Lcom/adknowledge/superrewards/xml/parser/OffersXMLParser;)V */
	 /* move-object/from16 v0, v24 */
	 /* move-object/from16 v1, v39 */
	 (( android.sax.Element ) v0 ).setEndTextElementListener ( v1 ); // invoke-virtual {v0, v1}, Landroid/sax/Element;->setEndTextElementListener(Landroid/sax/EndTextElementListener;)V
	 /* .line 459 */
	 final String v39 = "click_url"; // const-string v39, "click_url"
	 /* move-object/from16 v0, v21 */
	 /* move-object/from16 v1, v39 */
	 (( android.sax.Element ) v0 ).getChild ( v1 ); // invoke-virtual {v0, v1}, Landroid/sax/Element;->getChild(Ljava/lang/String;)Landroid/sax/Element;
	 /* .line 460 */
	 /* .local v38, "url":Landroid/sax/Element; */
	 /* new-instance v39, Lcom/adknowledge/superrewards/xml/parser/OffersXMLParser$35; */
	 /* move-object/from16 v0, v39 */
	 /* move-object/from16 v1, p0 */
	 /* invoke-direct {v0, v1}, Lcom/adknowledge/superrewards/xml/parser/OffersXMLParser$35;-><init>(Lcom/adknowledge/superrewards/xml/parser/OffersXMLParser;)V */
	 /* invoke-virtual/range {v38 ..v39}, Landroid/sax/Element;->setEndTextElementListener(Landroid/sax/EndTextElementListener;)V */
	 /* .line 468 */
	 final String v39 = "image"; // const-string v39, "image"
	 /* move-object/from16 v0, v21 */
	 /* move-object/from16 v1, v39 */
	 (( android.sax.Element ) v0 ).getChild ( v1 ); // invoke-virtual {v0, v1}, Landroid/sax/Element;->getChild(Ljava/lang/String;)Landroid/sax/Element;
	 /* .line 469 */
	 /* .local v16, "image2":Landroid/sax/Element; */
	 /* new-instance v39, Lcom/adknowledge/superrewards/xml/parser/OffersXMLParser$36; */
	 /* move-object/from16 v0, v39 */
	 /* move-object/from16 v1, p0 */
	 /* invoke-direct {v0, v1}, Lcom/adknowledge/superrewards/xml/parser/OffersXMLParser$36;-><init>(Lcom/adknowledge/superrewards/xml/parser/OffersXMLParser;)V */
	 /* move-object/from16 v0, v16 */
	 /* move-object/from16 v1, v39 */
	 (( android.sax.Element ) v0 ).setEndTextElementListener ( v1 ); // invoke-virtual {v0, v1}, Landroid/sax/Element;->setEndTextElementListener(Landroid/sax/EndTextElementListener;)V
	 /* .line 478 */
	 try { // :try_start_0
		 /* invoke-virtual/range {v22 ..v22}, Landroid/sax/RootElement;->getContentHandler()Lorg/xml/sax/ContentHandler; */
		 /* move-object/from16 v0, p1 */
		 /* move-object/from16 v1, v39 */
		 android.util.Xml .parse ( v0,v1 );
		 /* :try_end_0 */
		 /* .catch Ljava/lang/Exception; {:try_start_0 ..:try_end_0} :catch_0 */
		 /* .line 483 */
		 /* .line 479 */
		 /* :catch_0 */
		 /* move-exception v12 */
		 /* .line 480 */
		 /* .local v12, "e":Ljava/lang/Exception; */
		 final String v39 = "SR"; // const-string v39, "SR"
		 (( java.lang.Exception ) v12 ).getMessage ( ); // invoke-virtual {v12}, Ljava/lang/Exception;->getMessage()Ljava/lang/String;
		 /* invoke-static/range {v39 ..v40}, Landroid/util/Log;->i(Ljava/lang/String;Ljava/lang/String;)I */
		 /* .line 481 */
		 /* new-instance v39, Ljava/lang/RuntimeException; */
		 /* move-object/from16 v0, v39 */
		 /* invoke-direct {v0, v12}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/Throwable;)V */
		 /* throw v39 */
	 } // .end method
