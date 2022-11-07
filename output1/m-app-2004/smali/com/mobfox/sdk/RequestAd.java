public class com.mobfox.sdk.RequestAd {
	 /* .source "RequestAd.java" */
	 /* # direct methods */
	 public com.mobfox.sdk.RequestAd ( ) {
		 /* .locals 0 */
		 /* .prologue */
		 /* .line 36 */
		 /* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
		 /* .line 37 */
		 return;
	 } // .end method
	 private Integer getInteger ( java.lang.String p0 ) {
		 /* .locals 2 */
		 /* .param p1, "text" # Ljava/lang/String; */
		 /* .prologue */
		 int v0 = 0; // const/4 v0, 0x0
		 /* .line 188 */
		 /* if-nez p1, :cond_0 */
		 /* .line 196 */
	 } // :goto_0
	 /* .line 192 */
} // :cond_0
try { // :try_start_0
	 java.lang.Integer .parseInt ( p1 );
	 /* :try_end_0 */
	 v0 = 	 /* .catch Ljava/lang/NumberFormatException; {:try_start_0 ..:try_end_0} :catch_0 */
	 /* .line 193 */
	 /* :catch_0 */
	 /* move-exception v1 */
} // .end method
private java.lang.String getValue ( org.w3c.dom.Document p0, java.lang.String p1 ) {
	 /* .locals 4 */
	 /* .param p1, "document" # Lorg/w3c/dom/Document; */
	 /* .param p2, "name" # Ljava/lang/String; */
	 /* .prologue */
	 int v3 = 0; // const/4 v3, 0x0
	 /* .line 168 */
	 /* .line 169 */
	 /* .local v1, "nodeList":Lorg/w3c/dom/NodeList; */
	 /* check-cast v0, Lorg/w3c/dom/Element; */
	 /* .line 170 */
	 /* .local v0, "element":Lorg/w3c/dom/Element; */
	 if ( v0 != null) { // if-eqz v0, :cond_0
		 /* .line 171 */
		 v2 = 		 /* .line 172 */
		 /* if-lez v2, :cond_0 */
		 /* .line 177 */
		 /* .line 180 */
	 } // :goto_0
} // :cond_0
int v2 = 0; // const/4 v2, 0x0
} // .end method
private Boolean getValueAsBoolean ( org.w3c.dom.Document p0, java.lang.String p1 ) {
/* .locals 2 */
/* .param p1, "document" # Lorg/w3c/dom/Document; */
/* .param p2, "name" # Ljava/lang/String; */
/* .prologue */
/* .line 163 */
final String v0 = "yes"; // const-string v0, "yes"
/* invoke-direct {p0, p1, p2}, Lcom/mobfox/sdk/RequestAd;->getValue(Lorg/w3c/dom/Document;Ljava/lang/String;)Ljava/lang/String; */
v0 = (( java.lang.String ) v0 ).equalsIgnoreCase ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z
} // .end method
private Integer getValueAsInt ( org.w3c.dom.Document p0, java.lang.String p1 ) {
/* .locals 1 */
/* .param p1, "document" # Lorg/w3c/dom/Document; */
/* .param p2, "name" # Ljava/lang/String; */
/* .prologue */
/* .line 184 */
/* invoke-direct {p0, p1, p2}, Lcom/mobfox/sdk/RequestAd;->getValue(Lorg/w3c/dom/Document;Ljava/lang/String;)Ljava/lang/String; */
v0 = /* invoke-direct {p0, v0}, Lcom/mobfox/sdk/RequestAd;->getInteger(Ljava/lang/String;)I */
} // .end method
private com.mobfox.sdk.data.Response parse ( java.io.InputStream p0 ) {
/* .locals 14 */
/* .param p1, "inputStream" # Ljava/io/InputStream; */
/* .annotation system Ldalvik/annotation/Throws; */
/* value = { */
/* Lcom/mobfox/sdk/RequestException; */
/* } */
} // .end annotation
/* .prologue */
/* .line 100 */
javax.xml.parsers.DocumentBuilderFactory .newInstance ( );
/* .line 102 */
/* .local v2, "dbf":Ljavax/xml/parsers/DocumentBuilderFactory; */
/* new-instance v7, Lcom/mobfox/sdk/data/Response; */
/* invoke-direct {v7}, Lcom/mobfox/sdk/data/Response;-><init>()V */
/* .line 105 */
/* .local v7, "response":Lcom/mobfox/sdk/data/Response; */
try { // :try_start_0
(( javax.xml.parsers.DocumentBuilderFactory ) v2 ).newDocumentBuilder ( ); // invoke-virtual {v2}, Ljavax/xml/parsers/DocumentBuilderFactory;->newDocumentBuilder()Ljavax/xml/parsers/DocumentBuilder;
/* .line 106 */
/* .local v1, "db":Ljavax/xml/parsers/DocumentBuilder; */
/* new-instance v8, Lorg/xml/sax/InputSource; */
/* invoke-direct {v8, p1}, Lorg/xml/sax/InputSource;-><init>(Ljava/io/InputStream;)V */
/* .line 107 */
/* .local v8, "src":Lorg/xml/sax/InputSource; */
final String v11 = "ISO-8859-1"; // const-string v11, "ISO-8859-1"
(( org.xml.sax.InputSource ) v8 ).setEncoding ( v11 ); // invoke-virtual {v8, v11}, Lorg/xml/sax/InputSource;->setEncoding(Ljava/lang/String;)V
/* .line 108 */
(( javax.xml.parsers.DocumentBuilder ) v1 ).parse ( v8 ); // invoke-virtual {v1, v8}, Ljavax/xml/parsers/DocumentBuilder;->parse(Lorg/xml/sax/InputSource;)Lorg/w3c/dom/Document;
/* .line 110 */
/* .local v3, "doc":Lorg/w3c/dom/Document; */
/* .line 112 */
/* .local v5, "element":Lorg/w3c/dom/Element; */
/* if-nez v5, :cond_0 */
/* .line 113 */
/* new-instance v11, Lcom/mobfox/sdk/RequestException; */
final String v12 = "Cannot parse Response, document is not an xml"; // const-string v12, "Cannot parse Response, document is not an xml"
/* invoke-direct {v11, v12}, Lcom/mobfox/sdk/RequestException;-><init>(Ljava/lang/String;)V */
/* throw v11 */
/* :try_end_0 */
/* .catch Ljavax/xml/parsers/ParserConfigurationException; {:try_start_0 ..:try_end_0} :catch_0 */
/* .catch Lorg/xml/sax/SAXException; {:try_start_0 ..:try_end_0} :catch_1 */
/* .catch Ljava/io/IOException; {:try_start_0 ..:try_end_0} :catch_2 */
/* .catch Ljava/lang/Throwable; {:try_start_0 ..:try_end_0} :catch_3 */
/* .line 149 */
} // .end local v1 # "db":Ljavax/xml/parsers/DocumentBuilder;
} // .end local v3 # "doc":Lorg/w3c/dom/Document;
} // .end local v5 # "element":Lorg/w3c/dom/Element;
} // .end local v8 # "src":Lorg/xml/sax/InputSource;
/* :catch_0 */
/* move-exception v4 */
/* .line 150 */
/* .local v4, "e":Ljavax/xml/parsers/ParserConfigurationException; */
/* new-instance v11, Lcom/mobfox/sdk/RequestException; */
final String v12 = "Cannot parse Response"; // const-string v12, "Cannot parse Response"
/* invoke-direct {v11, v12, v4}, Lcom/mobfox/sdk/RequestException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V */
/* throw v11 */
/* .line 116 */
} // .end local v4 # "e":Ljavax/xml/parsers/ParserConfigurationException;
/* .restart local v1 # "db":Ljavax/xml/parsers/DocumentBuilder; */
/* .restart local v3 # "doc":Lorg/w3c/dom/Document; */
/* .restart local v5 # "element":Lorg/w3c/dom/Element; */
/* .restart local v8 # "src":Lorg/xml/sax/InputSource; */
} // :cond_0
try { // :try_start_1
final String v11 = "error"; // const-string v11, "error"
/* invoke-direct {p0, v3, v11}, Lcom/mobfox/sdk/RequestAd;->getValue(Lorg/w3c/dom/Document;Ljava/lang/String;)Ljava/lang/String; */
/* .line 117 */
/* .local v6, "errorValue":Ljava/lang/String; */
if ( v6 != null) { // if-eqz v6, :cond_1
/* .line 118 */
/* new-instance v11, Lcom/mobfox/sdk/RequestException; */
/* new-instance v12, Ljava/lang/StringBuilder; */
/* invoke-direct {v12}, Ljava/lang/StringBuilder;-><init>()V */
final String v13 = "Error Response received: "; // const-string v13, "Error Response received: "
(( java.lang.StringBuilder ) v12 ).append ( v13 ); // invoke-virtual {v12, v13}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v12 ).append ( v6 ); // invoke-virtual {v12, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v12 ).toString ( ); // invoke-virtual {v12}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
/* invoke-direct {v11, v12}, Lcom/mobfox/sdk/RequestException;-><init>(Ljava/lang/String;)V */
/* throw v11 */
/* :try_end_1 */
/* .catch Ljavax/xml/parsers/ParserConfigurationException; {:try_start_1 ..:try_end_1} :catch_0 */
/* .catch Lorg/xml/sax/SAXException; {:try_start_1 ..:try_end_1} :catch_1 */
/* .catch Ljava/io/IOException; {:try_start_1 ..:try_end_1} :catch_2 */
/* .catch Ljava/lang/Throwable; {:try_start_1 ..:try_end_1} :catch_3 */
/* .line 151 */
} // .end local v1 # "db":Ljavax/xml/parsers/DocumentBuilder;
} // .end local v3 # "doc":Lorg/w3c/dom/Document;
} // .end local v5 # "element":Lorg/w3c/dom/Element;
} // .end local v6 # "errorValue":Ljava/lang/String;
} // .end local v8 # "src":Lorg/xml/sax/InputSource;
/* :catch_1 */
/* move-exception v4 */
/* .line 152 */
/* .local v4, "e":Lorg/xml/sax/SAXException; */
/* new-instance v11, Lcom/mobfox/sdk/RequestException; */
final String v12 = "Cannot parse Response"; // const-string v12, "Cannot parse Response"
/* invoke-direct {v11, v12, v4}, Lcom/mobfox/sdk/RequestException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V */
/* throw v11 */
/* .line 121 */
} // .end local v4 # "e":Lorg/xml/sax/SAXException;
/* .restart local v1 # "db":Ljavax/xml/parsers/DocumentBuilder; */
/* .restart local v3 # "doc":Lorg/w3c/dom/Document; */
/* .restart local v5 # "element":Lorg/w3c/dom/Element; */
/* .restart local v6 # "errorValue":Ljava/lang/String; */
/* .restart local v8 # "src":Lorg/xml/sax/InputSource; */
} // :cond_1
try { // :try_start_2
final String v11 = "type"; // const-string v11, "type"
/* .line 122 */
/* .local v10, "type":Ljava/lang/String; */
/* .line 123 */
final String v11 = "imageAd"; // const-string v11, "imageAd"
v11 = (( java.lang.String ) v11 ).equalsIgnoreCase ( v10 ); // invoke-virtual {v11, v10}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z
if ( v11 != null) { // if-eqz v11, :cond_2
/* .line 124 */
v11 = com.mobfox.sdk.AdType.IMAGE;
(( com.mobfox.sdk.data.Response ) v7 ).setType ( v11 ); // invoke-virtual {v7, v11}, Lcom/mobfox/sdk/data/Response;->setType(Lcom/mobfox/sdk/AdType;)V
/* .line 125 */
final String v11 = "bannerwidth"; // const-string v11, "bannerwidth"
v11 = /* invoke-direct {p0, v3, v11}, Lcom/mobfox/sdk/RequestAd;->getValueAsInt(Lorg/w3c/dom/Document;Ljava/lang/String;)I */
(( com.mobfox.sdk.data.Response ) v7 ).setBannerWidth ( v11 ); // invoke-virtual {v7, v11}, Lcom/mobfox/sdk/data/Response;->setBannerWidth(I)V
/* .line 126 */
final String v11 = "bannerheight"; // const-string v11, "bannerheight"
v11 = /* invoke-direct {p0, v3, v11}, Lcom/mobfox/sdk/RequestAd;->getValueAsInt(Lorg/w3c/dom/Document;Ljava/lang/String;)I */
(( com.mobfox.sdk.data.Response ) v7 ).setBannerHeight ( v11 ); // invoke-virtual {v7, v11}, Lcom/mobfox/sdk/data/Response;->setBannerHeight(I)V
/* .line 127 */
final String v11 = "clicktype"; // const-string v11, "clicktype"
/* invoke-direct {p0, v3, v11}, Lcom/mobfox/sdk/RequestAd;->getValue(Lorg/w3c/dom/Document;Ljava/lang/String;)Ljava/lang/String; */
com.mobfox.sdk.data.ClickType .getValue ( v11 );
/* .line 128 */
/* .local v0, "clickType":Lcom/mobfox/sdk/data/ClickType; */
(( com.mobfox.sdk.data.Response ) v7 ).setClickType ( v0 ); // invoke-virtual {v7, v0}, Lcom/mobfox/sdk/data/Response;->setClickType(Lcom/mobfox/sdk/data/ClickType;)V
/* .line 129 */
final String v11 = "clickurl"; // const-string v11, "clickurl"
/* invoke-direct {p0, v3, v11}, Lcom/mobfox/sdk/RequestAd;->getValue(Lorg/w3c/dom/Document;Ljava/lang/String;)Ljava/lang/String; */
(( com.mobfox.sdk.data.Response ) v7 ).setClickUrl ( v11 ); // invoke-virtual {v7, v11}, Lcom/mobfox/sdk/data/Response;->setClickUrl(Ljava/lang/String;)V
/* .line 130 */
final String v11 = "imageurl"; // const-string v11, "imageurl"
/* invoke-direct {p0, v3, v11}, Lcom/mobfox/sdk/RequestAd;->getValue(Lorg/w3c/dom/Document;Ljava/lang/String;)Ljava/lang/String; */
(( com.mobfox.sdk.data.Response ) v7 ).setImageUrl ( v11 ); // invoke-virtual {v7, v11}, Lcom/mobfox/sdk/data/Response;->setImageUrl(Ljava/lang/String;)V
/* .line 131 */
final String v11 = "refresh"; // const-string v11, "refresh"
v11 = /* invoke-direct {p0, v3, v11}, Lcom/mobfox/sdk/RequestAd;->getValueAsInt(Lorg/w3c/dom/Document;Ljava/lang/String;)I */
(( com.mobfox.sdk.data.Response ) v7 ).setRefresh ( v11 ); // invoke-virtual {v7, v11}, Lcom/mobfox/sdk/data/Response;->setRefresh(I)V
/* .line 132 */
final String v11 = "scale"; // const-string v11, "scale"
v11 = /* invoke-direct {p0, v3, v11}, Lcom/mobfox/sdk/RequestAd;->getValueAsBoolean(Lorg/w3c/dom/Document;Ljava/lang/String;)Z */
(( com.mobfox.sdk.data.Response ) v7 ).setScale ( v11 ); // invoke-virtual {v7, v11}, Lcom/mobfox/sdk/data/Response;->setScale(Z)V
/* .line 133 */
final String v11 = "skippreflight"; // const-string v11, "skippreflight"
v11 = /* invoke-direct {p0, v3, v11}, Lcom/mobfox/sdk/RequestAd;->getValueAsBoolean(Lorg/w3c/dom/Document;Ljava/lang/String;)Z */
(( com.mobfox.sdk.data.Response ) v7 ).setSkipPreflight ( v11 ); // invoke-virtual {v7, v11}, Lcom/mobfox/sdk/data/Response;->setSkipPreflight(Z)V
/* .line 159 */
} // .end local v0 # "clickType":Lcom/mobfox/sdk/data/ClickType;
} // :goto_0
/* .line 134 */
} // :cond_2
final String v11 = "textAd"; // const-string v11, "textAd"
v11 = (( java.lang.String ) v11 ).equalsIgnoreCase ( v10 ); // invoke-virtual {v11, v10}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z
if ( v11 != null) { // if-eqz v11, :cond_3
/* .line 135 */
v11 = com.mobfox.sdk.AdType.TEXT;
(( com.mobfox.sdk.data.Response ) v7 ).setType ( v11 ); // invoke-virtual {v7, v11}, Lcom/mobfox/sdk/data/Response;->setType(Lcom/mobfox/sdk/AdType;)V
/* .line 136 */
final String v11 = "htmlString"; // const-string v11, "htmlString"
/* invoke-direct {p0, v3, v11}, Lcom/mobfox/sdk/RequestAd;->getValue(Lorg/w3c/dom/Document;Ljava/lang/String;)Ljava/lang/String; */
(( com.mobfox.sdk.data.Response ) v7 ).setText ( v11 ); // invoke-virtual {v7, v11}, Lcom/mobfox/sdk/data/Response;->setText(Ljava/lang/String;)V
/* .line 137 */
final String v11 = "clicktype"; // const-string v11, "clicktype"
/* invoke-direct {p0, v3, v11}, Lcom/mobfox/sdk/RequestAd;->getValue(Lorg/w3c/dom/Document;Ljava/lang/String;)Ljava/lang/String; */
com.mobfox.sdk.data.ClickType .getValue ( v11 );
/* .line 138 */
/* .restart local v0 # "clickType":Lcom/mobfox/sdk/data/ClickType; */
(( com.mobfox.sdk.data.Response ) v7 ).setClickType ( v0 ); // invoke-virtual {v7, v0}, Lcom/mobfox/sdk/data/Response;->setClickType(Lcom/mobfox/sdk/data/ClickType;)V
/* .line 139 */
final String v11 = "clickurl"; // const-string v11, "clickurl"
/* invoke-direct {p0, v3, v11}, Lcom/mobfox/sdk/RequestAd;->getValue(Lorg/w3c/dom/Document;Ljava/lang/String;)Ljava/lang/String; */
(( com.mobfox.sdk.data.Response ) v7 ).setClickUrl ( v11 ); // invoke-virtual {v7, v11}, Lcom/mobfox/sdk/data/Response;->setClickUrl(Ljava/lang/String;)V
/* .line 140 */
final String v11 = "refresh"; // const-string v11, "refresh"
v11 = /* invoke-direct {p0, v3, v11}, Lcom/mobfox/sdk/RequestAd;->getValueAsInt(Lorg/w3c/dom/Document;Ljava/lang/String;)I */
(( com.mobfox.sdk.data.Response ) v7 ).setRefresh ( v11 ); // invoke-virtual {v7, v11}, Lcom/mobfox/sdk/data/Response;->setRefresh(I)V
/* .line 141 */
final String v11 = "scale"; // const-string v11, "scale"
v11 = /* invoke-direct {p0, v3, v11}, Lcom/mobfox/sdk/RequestAd;->getValueAsBoolean(Lorg/w3c/dom/Document;Ljava/lang/String;)Z */
(( com.mobfox.sdk.data.Response ) v7 ).setScale ( v11 ); // invoke-virtual {v7, v11}, Lcom/mobfox/sdk/data/Response;->setScale(Z)V
/* .line 142 */
final String v11 = "skippreflight"; // const-string v11, "skippreflight"
v11 = /* invoke-direct {p0, v3, v11}, Lcom/mobfox/sdk/RequestAd;->getValueAsBoolean(Lorg/w3c/dom/Document;Ljava/lang/String;)Z */
(( com.mobfox.sdk.data.Response ) v7 ).setSkipPreflight ( v11 ); // invoke-virtual {v7, v11}, Lcom/mobfox/sdk/data/Response;->setSkipPreflight(Z)V
/* :try_end_2 */
/* .catch Ljavax/xml/parsers/ParserConfigurationException; {:try_start_2 ..:try_end_2} :catch_0 */
/* .catch Lorg/xml/sax/SAXException; {:try_start_2 ..:try_end_2} :catch_1 */
/* .catch Ljava/io/IOException; {:try_start_2 ..:try_end_2} :catch_2 */
/* .catch Ljava/lang/Throwable; {:try_start_2 ..:try_end_2} :catch_3 */
/* .line 153 */
} // .end local v0 # "clickType":Lcom/mobfox/sdk/data/ClickType;
} // .end local v1 # "db":Ljavax/xml/parsers/DocumentBuilder;
} // .end local v3 # "doc":Lorg/w3c/dom/Document;
} // .end local v5 # "element":Lorg/w3c/dom/Element;
} // .end local v6 # "errorValue":Ljava/lang/String;
} // .end local v8 # "src":Lorg/xml/sax/InputSource;
} // .end local v10 # "type":Ljava/lang/String;
/* :catch_2 */
/* move-exception v4 */
/* .line 154 */
/* .local v4, "e":Ljava/io/IOException; */
/* new-instance v11, Lcom/mobfox/sdk/RequestException; */
final String v12 = "Cannot read Response"; // const-string v12, "Cannot read Response"
/* invoke-direct {v11, v12, v4}, Lcom/mobfox/sdk/RequestException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V */
/* throw v11 */
/* .line 143 */
} // .end local v4 # "e":Ljava/io/IOException;
/* .restart local v1 # "db":Ljavax/xml/parsers/DocumentBuilder; */
/* .restart local v3 # "doc":Lorg/w3c/dom/Document; */
/* .restart local v5 # "element":Lorg/w3c/dom/Element; */
/* .restart local v6 # "errorValue":Ljava/lang/String; */
/* .restart local v8 # "src":Lorg/xml/sax/InputSource; */
/* .restart local v10 # "type":Ljava/lang/String; */
} // :cond_3
try { // :try_start_3
final String v11 = "noAd"; // const-string v11, "noAd"
v11 = (( java.lang.String ) v11 ).equalsIgnoreCase ( v10 ); // invoke-virtual {v11, v10}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z
if ( v11 != null) { // if-eqz v11, :cond_4
/* .line 144 */
v11 = com.mobfox.sdk.AdType.NO_AD;
(( com.mobfox.sdk.data.Response ) v7 ).setType ( v11 ); // invoke-virtual {v7, v11}, Lcom/mobfox/sdk/data/Response;->setType(Lcom/mobfox/sdk/AdType;)V
/* :try_end_3 */
/* .catch Ljavax/xml/parsers/ParserConfigurationException; {:try_start_3 ..:try_end_3} :catch_0 */
/* .catch Lorg/xml/sax/SAXException; {:try_start_3 ..:try_end_3} :catch_1 */
/* .catch Ljava/io/IOException; {:try_start_3 ..:try_end_3} :catch_2 */
/* .catch Ljava/lang/Throwable; {:try_start_3 ..:try_end_3} :catch_3 */
/* .line 155 */
} // .end local v1 # "db":Ljavax/xml/parsers/DocumentBuilder;
} // .end local v3 # "doc":Lorg/w3c/dom/Document;
} // .end local v5 # "element":Lorg/w3c/dom/Element;
} // .end local v6 # "errorValue":Ljava/lang/String;
} // .end local v8 # "src":Lorg/xml/sax/InputSource;
} // .end local v10 # "type":Ljava/lang/String;
/* :catch_3 */
/* move-exception v9 */
/* .line 156 */
/* .local v9, "t":Ljava/lang/Throwable; */
/* new-instance v11, Lcom/mobfox/sdk/RequestException; */
final String v12 = "Cannot read Response"; // const-string v12, "Cannot read Response"
/* invoke-direct {v11, v12, v9}, Lcom/mobfox/sdk/RequestException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V */
/* throw v11 */
/* .line 146 */
} // .end local v9 # "t":Ljava/lang/Throwable;
/* .restart local v1 # "db":Ljavax/xml/parsers/DocumentBuilder; */
/* .restart local v3 # "doc":Lorg/w3c/dom/Document; */
/* .restart local v5 # "element":Lorg/w3c/dom/Element; */
/* .restart local v6 # "errorValue":Ljava/lang/String; */
/* .restart local v8 # "src":Lorg/xml/sax/InputSource; */
/* .restart local v10 # "type":Ljava/lang/String; */
} // :cond_4
try { // :try_start_4
/* new-instance v11, Lcom/mobfox/sdk/RequestException; */
/* new-instance v12, Ljava/lang/StringBuilder; */
/* invoke-direct {v12}, Ljava/lang/StringBuilder;-><init>()V */
final String v13 = "Unknown response type "; // const-string v13, "Unknown response type "
(( java.lang.StringBuilder ) v12 ).append ( v13 ); // invoke-virtual {v12, v13}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v12 ).append ( v10 ); // invoke-virtual {v12, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v12 ).toString ( ); // invoke-virtual {v12}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
/* invoke-direct {v11, v12}, Lcom/mobfox/sdk/RequestException;-><init>(Ljava/lang/String;)V */
/* throw v11 */
/* :try_end_4 */
/* .catch Ljavax/xml/parsers/ParserConfigurationException; {:try_start_4 ..:try_end_4} :catch_0 */
/* .catch Lorg/xml/sax/SAXException; {:try_start_4 ..:try_end_4} :catch_1 */
/* .catch Ljava/io/IOException; {:try_start_4 ..:try_end_4} :catch_2 */
/* .catch Ljava/lang/Throwable; {:try_start_4 ..:try_end_4} :catch_3 */
} // .end method
private com.mobfox.sdk.data.Response sendGetRequest ( com.mobfox.sdk.data.Request p0 ) {
/* .locals 12 */
/* .param p1, "request" # Lcom/mobfox/sdk/data/Request; */
/* .annotation system Ldalvik/annotation/Throws; */
/* value = { */
/* Lcom/mobfox/sdk/RequestException; */
/* } */
} // .end annotation
/* .prologue */
/* const/16 v11, 0x3a98 */
int v10 = 3; // const/4 v10, 0x3
/* const-wide/16 v8, 0x0 */
/* .line 44 */
final String v6 = "MOBFOX"; // const-string v6, "MOBFOX"
v6 = android.util.Log .isLoggable ( v6,v10 );
if ( v6 != null) { // if-eqz v6, :cond_0
/* .line 45 */
final String v6 = "MOBFOX"; // const-string v6, "MOBFOX"
final String v7 = "send Request"; // const-string v7, "send Request"
android.util.Log .d ( v6,v7 );
/* .line 47 */
} // :cond_0
/* new-instance v5, Ljava/lang/StringBuilder; */
final String v6 = "http://my.mobfox.com/request.php"; // const-string v6, "http://my.mobfox.com/request.php"
/* invoke-direct {v5, v6}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V */
/* .line 49 */
/* .local v5, "url":Ljava/lang/StringBuilder; */
final String v6 = "?rt=android_app"; // const-string v6, "?rt=android_app"
(( java.lang.StringBuilder ) v5 ).append ( v6 ); // invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
/* .line 53 */
try { // :try_start_0
final String v6 = "&o="; // const-string v6, "&o="
(( java.lang.StringBuilder ) v5 ).append ( v6 ); // invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
/* .line 54 */
(( com.mobfox.sdk.data.Request ) p1 ).getDeviceId ( ); // invoke-virtual {p1}, Lcom/mobfox/sdk/data/Request;->getDeviceId()Ljava/lang/String;
final String v7 = "UTF-8"; // const-string v7, "UTF-8"
java.net.URLEncoder .encode ( v6,v7 );
(( java.lang.StringBuilder ) v5 ).append ( v6 ); // invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
/* .line 55 */
final String v6 = "&m="; // const-string v6, "&m="
(( java.lang.StringBuilder ) v5 ).append ( v6 ); // invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
/* .line 56 */
(( com.mobfox.sdk.data.Request ) p1 ).getMode ( ); // invoke-virtual {p1}, Lcom/mobfox/sdk/data/Request;->getMode()Lcom/mobfox/sdk/Mode;
(( com.mobfox.sdk.Mode ) v6 ).toString ( ); // invoke-virtual {v6}, Lcom/mobfox/sdk/Mode;->toString()Ljava/lang/String;
(( java.lang.String ) v6 ).toLowerCase ( ); // invoke-virtual {v6}, Ljava/lang/String;->toLowerCase()Ljava/lang/String;
final String v7 = "UTF-8"; // const-string v7, "UTF-8"
java.net.URLEncoder .encode ( v6,v7 );
(( java.lang.StringBuilder ) v5 ).append ( v6 ); // invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
/* .line 57 */
final String v6 = "&s="; // const-string v6, "&s="
(( java.lang.StringBuilder ) v5 ).append ( v6 ); // invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
/* .line 58 */
(( com.mobfox.sdk.data.Request ) p1 ).getPublisherId ( ); // invoke-virtual {p1}, Lcom/mobfox/sdk/data/Request;->getPublisherId()Ljava/lang/String;
final String v7 = "UTF-8"; // const-string v7, "UTF-8"
java.net.URLEncoder .encode ( v6,v7 );
(( java.lang.StringBuilder ) v5 ).append ( v6 ); // invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
/* .line 59 */
final String v6 = "&u="; // const-string v6, "&u="
(( java.lang.StringBuilder ) v5 ).append ( v6 ); // invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
/* .line 60 */
(( com.mobfox.sdk.data.Request ) p1 ).getUserAgent ( ); // invoke-virtual {p1}, Lcom/mobfox/sdk/data/Request;->getUserAgent()Ljava/lang/String;
final String v7 = "UTF-8"; // const-string v7, "UTF-8"
java.net.URLEncoder .encode ( v6,v7 );
(( java.lang.StringBuilder ) v5 ).append ( v6 ); // invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
/* .line 61 */
final String v6 = "&u2="; // const-string v6, "&u2="
(( java.lang.StringBuilder ) v5 ).append ( v6 ); // invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
/* .line 62 */
(( com.mobfox.sdk.data.Request ) p1 ).getUserAgent2 ( ); // invoke-virtual {p1}, Lcom/mobfox/sdk/data/Request;->getUserAgent2()Ljava/lang/String;
final String v7 = "UTF-8"; // const-string v7, "UTF-8"
java.net.URLEncoder .encode ( v6,v7 );
(( java.lang.StringBuilder ) v5 ).append ( v6 ); // invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
/* .line 63 */
final String v6 = "&v="; // const-string v6, "&v="
(( java.lang.StringBuilder ) v5 ).append ( v6 ); // invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
/* .line 64 */
(( com.mobfox.sdk.data.Request ) p1 ).getProtocolVersion ( ); // invoke-virtual {p1}, Lcom/mobfox/sdk/data/Request;->getProtocolVersion()Ljava/lang/String;
final String v7 = "UTF-8"; // const-string v7, "UTF-8"
java.net.URLEncoder .encode ( v6,v7 );
(( java.lang.StringBuilder ) v5 ).append ( v6 ); // invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
/* .line 66 */
(( com.mobfox.sdk.data.Request ) p1 ).getLatitude ( ); // invoke-virtual {p1}, Lcom/mobfox/sdk/data/Request;->getLatitude()D
/* move-result-wide v6 */
/* cmpl-double v6, v6, v8 */
if ( v6 != null) { // if-eqz v6, :cond_1
(( com.mobfox.sdk.data.Request ) p1 ).getLongitude ( ); // invoke-virtual {p1}, Lcom/mobfox/sdk/data/Request;->getLongitude()D
/* move-result-wide v6 */
/* cmpl-double v6, v6, v8 */
if ( v6 != null) { // if-eqz v6, :cond_1
/* .line 67 */
final String v6 = "&latitude="; // const-string v6, "&latitude="
(( java.lang.StringBuilder ) v5 ).append ( v6 ); // invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
/* .line 68 */
(( com.mobfox.sdk.data.Request ) p1 ).getLatitude ( ); // invoke-virtual {p1}, Lcom/mobfox/sdk/data/Request;->getLatitude()D
/* move-result-wide v6 */
(( java.lang.StringBuilder ) v5 ).append ( v6, v7 ); // invoke-virtual {v5, v6, v7}, Ljava/lang/StringBuilder;->append(D)Ljava/lang/StringBuilder;
/* .line 69 */
final String v6 = "&longitude="; // const-string v6, "&longitude="
(( java.lang.StringBuilder ) v5 ).append ( v6 ); // invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
/* .line 70 */
(( com.mobfox.sdk.data.Request ) p1 ).getLongitude ( ); // invoke-virtual {p1}, Lcom/mobfox/sdk/data/Request;->getLongitude()D
/* move-result-wide v6 */
(( java.lang.StringBuilder ) v5 ).append ( v6, v7 ); // invoke-virtual {v5, v6, v7}, Ljava/lang/StringBuilder;->append(D)Ljava/lang/StringBuilder;
/* :try_end_0 */
/* .catch Ljava/io/UnsupportedEncodingException; {:try_start_0 ..:try_end_0} :catch_0 */
/* .line 76 */
} // :cond_1
final String v6 = "MOBFOX"; // const-string v6, "MOBFOX"
v6 = android.util.Log .isLoggable ( v6,v10 );
if ( v6 != null) { // if-eqz v6, :cond_2
/* .line 77 */
final String v6 = "MOBFOX"; // const-string v6, "MOBFOX"
/* new-instance v7, Ljava/lang/StringBuilder; */
/* invoke-direct {v7}, Ljava/lang/StringBuilder;-><init>()V */
final String v8 = "Perform HTTP Get Url: "; // const-string v8, "Perform HTTP Get Url: "
(( java.lang.StringBuilder ) v7 ).append ( v8 ); // invoke-virtual {v7, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v7 ).append ( v5 ); // invoke-virtual {v7, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v7 ).toString ( ); // invoke-virtual {v7}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
android.util.Log .d ( v6,v7 );
/* .line 79 */
} // :cond_2
/* new-instance v0, Lorg/apache/http/impl/client/DefaultHttpClient; */
/* invoke-direct {v0}, Lorg/apache/http/impl/client/DefaultHttpClient;-><init>()V */
/* .line 80 */
/* .local v0, "client":Lorg/apache/http/impl/client/DefaultHttpClient; */
(( org.apache.http.impl.client.DefaultHttpClient ) v0 ).getParams ( ); // invoke-virtual {v0}, Lorg/apache/http/impl/client/DefaultHttpClient;->getParams()Lorg/apache/http/params/HttpParams;
org.apache.http.params.HttpConnectionParams .setSoTimeout ( v6,v11 );
/* .line 81 */
(( org.apache.http.impl.client.DefaultHttpClient ) v0 ).getParams ( ); // invoke-virtual {v0}, Lorg/apache/http/impl/client/DefaultHttpClient;->getParams()Lorg/apache/http/params/HttpParams;
org.apache.http.params.HttpConnectionParams .setConnectionTimeout ( v6,v11 );
/* .line 82 */
(( org.apache.http.impl.client.DefaultHttpClient ) v0 ).getParams ( ); // invoke-virtual {v0}, Lorg/apache/http/impl/client/DefaultHttpClient;->getParams()Lorg/apache/http/params/HttpParams;
(( com.mobfox.sdk.data.Request ) p1 ).getUserAgent ( ); // invoke-virtual {p1}, Lcom/mobfox/sdk/data/Request;->getUserAgent()Ljava/lang/String;
org.apache.http.params.HttpProtocolParams .setUserAgent ( v6,v7 );
/* .line 83 */
/* new-instance v2, Lorg/apache/http/client/methods/HttpGet; */
(( java.lang.StringBuilder ) v5 ).toString ( ); // invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
/* invoke-direct {v2, v6}, Lorg/apache/http/client/methods/HttpGet;-><init>(Ljava/lang/String;)V */
/* .line 86 */
/* .local v2, "get":Lorg/apache/http/client/methods/HttpGet; */
try { // :try_start_1
(( org.apache.http.impl.client.DefaultHttpClient ) v0 ).execute ( v2 ); // invoke-virtual {v0, v2}, Lorg/apache/http/impl/client/DefaultHttpClient;->execute(Lorg/apache/http/client/methods/HttpUriRequest;)Lorg/apache/http/HttpResponse;
/* .line 87 */
/* .local v3, "response":Lorg/apache/http/HttpResponse; */
/* invoke-direct {p0, v6}, Lcom/mobfox/sdk/RequestAd;->parse(Ljava/io/InputStream;)Lcom/mobfox/sdk/data/Response; */
/* :try_end_1 */
/* .catch Lorg/apache/http/client/ClientProtocolException; {:try_start_1 ..:try_end_1} :catch_1 */
/* .catch Ljava/io/IOException; {:try_start_1 ..:try_end_1} :catch_2 */
/* .catch Ljava/lang/Throwable; {:try_start_1 ..:try_end_1} :catch_3 */
/* .line 72 */
} // .end local v0 # "client":Lorg/apache/http/impl/client/DefaultHttpClient;
} // .end local v2 # "get":Lorg/apache/http/client/methods/HttpGet;
} // .end local v3 # "response":Lorg/apache/http/HttpResponse;
/* :catch_0 */
/* move-exception v1 */
/* .line 73 */
/* .local v1, "e":Ljava/io/UnsupportedEncodingException; */
/* new-instance v6, Lcom/mobfox/sdk/RequestException; */
final String v7 = "Cannot create request URL"; // const-string v7, "Cannot create request URL"
/* invoke-direct {v6, v7, v1}, Lcom/mobfox/sdk/RequestException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V */
/* throw v6 */
/* .line 88 */
} // .end local v1 # "e":Ljava/io/UnsupportedEncodingException;
/* .restart local v0 # "client":Lorg/apache/http/impl/client/DefaultHttpClient; */
/* .restart local v2 # "get":Lorg/apache/http/client/methods/HttpGet; */
/* :catch_1 */
/* move-exception v1 */
/* .line 89 */
/* .local v1, "e":Lorg/apache/http/client/ClientProtocolException; */
/* new-instance v6, Lcom/mobfox/sdk/RequestException; */
final String v7 = "Error in HTTP request"; // const-string v7, "Error in HTTP request"
/* invoke-direct {v6, v7, v1}, Lcom/mobfox/sdk/RequestException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V */
/* throw v6 */
/* .line 90 */
} // .end local v1 # "e":Lorg/apache/http/client/ClientProtocolException;
/* :catch_2 */
/* move-exception v1 */
/* .line 91 */
/* .local v1, "e":Ljava/io/IOException; */
/* new-instance v6, Lcom/mobfox/sdk/RequestException; */
final String v7 = "Error in HTTP request"; // const-string v7, "Error in HTTP request"
/* invoke-direct {v6, v7, v1}, Lcom/mobfox/sdk/RequestException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V */
/* throw v6 */
/* .line 92 */
} // .end local v1 # "e":Ljava/io/IOException;
/* :catch_3 */
/* move-exception v4 */
/* .line 93 */
/* .local v4, "t":Ljava/lang/Throwable; */
/* new-instance v6, Lcom/mobfox/sdk/RequestException; */
final String v7 = "Error in HTTP request"; // const-string v7, "Error in HTTP request"
/* invoke-direct {v6, v7, v4}, Lcom/mobfox/sdk/RequestException;-><init>(Ljava/lang/String;Ljava/lang/Throwable;)V */
/* throw v6 */
} // .end method
/* # virtual methods */
public com.mobfox.sdk.data.Response sendRequest ( com.mobfox.sdk.data.Request p0 ) {
/* .locals 1 */
/* .param p1, "request" # Lcom/mobfox/sdk/data/Request; */
/* .annotation system Ldalvik/annotation/Throws; */
/* value = { */
/* Lcom/mobfox/sdk/RequestException; */
/* } */
} // .end annotation
/* .prologue */
/* .line 40 */
/* invoke-direct {p0, p1}, Lcom/mobfox/sdk/RequestAd;->sendGetRequest(Lcom/mobfox/sdk/data/Request;)Lcom/mobfox/sdk/data/Response; */
} // .end method
