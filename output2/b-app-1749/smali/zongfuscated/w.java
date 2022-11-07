public class zongfuscated.w {
	 /* # static fields */
	 private static final java.lang.String a;
	 /* # direct methods */
	 static zongfuscated.w ( ) {
		 /* .locals 1 */
		 /* const-class v0, Lzongfuscated/w; */
		 (( java.lang.Class ) v0 ).getSimpleName ( ); // invoke-virtual {v0}, Ljava/lang/Class;->getSimpleName()Ljava/lang/String;
		 return;
	 } // .end method
	 public zongfuscated.w ( ) {
		 /* .locals 0 */
		 /* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
		 return;
	 } // .end method
	 public static com.zong.android.engine.xml.pojo.lookup.ZongPricePoint a ( java.io.InputStream p0 ) {
		 /* .locals 6 */
		 /* new-instance v0, Lcom/zong/android/engine/xml/pojo/lookup/ZongPricePoint; */
		 /* invoke-direct {v0}, Lcom/zong/android/engine/xml/pojo/lookup/ZongPricePoint;-><init>()V */
		 /* new-instance v1, Landroid/sax/RootElement; */
		 final String v2 = "http://pay01.zong.com/zongpay"; // const-string v2, "http://pay01.zong.com/zongpay"
		 final String v3 = "responseMobilePaymentProcessEntrypoints"; // const-string v3, "responseMobilePaymentProcessEntrypoints"
		 /* invoke-direct {v1, v2, v3}, Landroid/sax/RootElement;-><init>(Ljava/lang/String;Ljava/lang/String;)V */
		 final String v2 = "http://pay01.zong.com/zongpay"; // const-string v2, "http://pay01.zong.com/zongpay"
		 final String v3 = "providers"; // const-string v3, "providers"
		 (( android.sax.RootElement ) v1 ).getChild ( v2, v3 ); // invoke-virtual {v1, v2, v3}, Landroid/sax/RootElement;->getChild(Ljava/lang/String;Ljava/lang/String;)Landroid/sax/Element;
		 final String v3 = "http://pay01.zong.com/zongpay"; // const-string v3, "http://pay01.zong.com/zongpay"
		 final String v4 = "items"; // const-string v4, "items"
		 (( android.sax.RootElement ) v1 ).getChild ( v3, v4 ); // invoke-virtual {v1, v3, v4}, Landroid/sax/RootElement;->getChild(Ljava/lang/String;Ljava/lang/String;)Landroid/sax/Element;
		 final String v4 = "http://pay01.zong.com/zongpay"; // const-string v4, "http://pay01.zong.com/zongpay"
		 final String v5 = "countryCode"; // const-string v5, "countryCode"
		 (( android.sax.RootElement ) v1 ).getChild ( v4, v5 ); // invoke-virtual {v1, v4, v5}, Landroid/sax/RootElement;->getChild(Ljava/lang/String;Ljava/lang/String;)Landroid/sax/Element;
		 /* new-instance v5, Lzongfuscated/w$1; */
		 /* invoke-direct {v5, v0}, Lzongfuscated/w$1;-><init>(Lcom/zong/android/engine/xml/pojo/lookup/ZongPricePoint;)V */
		 (( android.sax.Element ) v4 ).setEndTextElementListener ( v5 ); // invoke-virtual {v4, v5}, Landroid/sax/Element;->setEndTextElementListener(Landroid/sax/EndTextElementListener;)V
		 final String v4 = "http://pay01.zong.com/zongpay"; // const-string v4, "http://pay01.zong.com/zongpay"
		 final String v5 = "localCurrency"; // const-string v5, "localCurrency"
		 (( android.sax.RootElement ) v1 ).getChild ( v4, v5 ); // invoke-virtual {v1, v4, v5}, Landroid/sax/RootElement;->getChild(Ljava/lang/String;Ljava/lang/String;)Landroid/sax/Element;
		 /* new-instance v5, Lzongfuscated/w$2; */
		 /* invoke-direct {v5, v0}, Lzongfuscated/w$2;-><init>(Lcom/zong/android/engine/xml/pojo/lookup/ZongPricePoint;)V */
		 (( android.sax.Element ) v4 ).setEndTextElementListener ( v5 ); // invoke-virtual {v4, v5}, Landroid/sax/Element;->setEndTextElementListener(Landroid/sax/EndTextElementListener;)V
		 final String v4 = "http://pay01.zong.com/zongpay"; // const-string v4, "http://pay01.zong.com/zongpay"
		 final String v5 = "exchangeRate"; // const-string v5, "exchangeRate"
		 (( android.sax.RootElement ) v1 ).getChild ( v4, v5 ); // invoke-virtual {v1, v4, v5}, Landroid/sax/RootElement;->getChild(Ljava/lang/String;Ljava/lang/String;)Landroid/sax/Element;
		 /* new-instance v5, Lzongfuscated/w$3; */
		 /* invoke-direct {v5, v0}, Lzongfuscated/w$3;-><init>(Lcom/zong/android/engine/xml/pojo/lookup/ZongPricePoint;)V */
		 (( android.sax.Element ) v4 ).setEndTextElementListener ( v5 ); // invoke-virtual {v4, v5}, Landroid/sax/Element;->setEndTextElementListener(Landroid/sax/EndTextElementListener;)V
		 final String v4 = "http://pay01.zong.com/zongpay"; // const-string v4, "http://pay01.zong.com/zongpay"
		 final String v5 = "provider"; // const-string v5, "provider"
		 (( android.sax.Element ) v2 ).getChild ( v4, v5 ); // invoke-virtual {v2, v4, v5}, Landroid/sax/Element;->getChild(Ljava/lang/String;Ljava/lang/String;)Landroid/sax/Element;
		 /* new-instance v4, Lzongfuscated/w$4; */
		 /* invoke-direct {v4, v0}, Lzongfuscated/w$4;-><init>(Lcom/zong/android/engine/xml/pojo/lookup/ZongPricePoint;)V */
		 (( android.sax.Element ) v2 ).setStartElementListener ( v4 ); // invoke-virtual {v2, v4}, Landroid/sax/Element;->setStartElementListener(Landroid/sax/StartElementListener;)V
		 final String v2 = "http://pay01.zong.com/zongpay"; // const-string v2, "http://pay01.zong.com/zongpay"
		 final String v4 = "item"; // const-string v4, "item"
		 (( android.sax.Element ) v3 ).getChild ( v2, v4 ); // invoke-virtual {v3, v2, v4}, Landroid/sax/Element;->getChild(Ljava/lang/String;Ljava/lang/String;)Landroid/sax/Element;
		 final String v3 = "http://pay01.zong.com/zongpay"; // const-string v3, "http://pay01.zong.com/zongpay"
		 final String v4 = "supportedProviders"; // const-string v4, "supportedProviders"
		 (( android.sax.Element ) v2 ).getChild ( v3, v4 ); // invoke-virtual {v2, v3, v4}, Landroid/sax/Element;->getChild(Ljava/lang/String;Ljava/lang/String;)Landroid/sax/Element;
		 final String v4 = "http://pay01.zong.com/zongpay"; // const-string v4, "http://pay01.zong.com/zongpay"
		 final String v5 = "entrypointUrl"; // const-string v5, "entrypointUrl"
		 (( android.sax.Element ) v2 ).getChild ( v4, v5 ); // invoke-virtual {v2, v4, v5}, Landroid/sax/Element;->getChild(Ljava/lang/String;Ljava/lang/String;)Landroid/sax/Element;
		 /* new-instance v5, Lzongfuscated/w$5; */
		 /* invoke-direct {v5, v0}, Lzongfuscated/w$5;-><init>(Lcom/zong/android/engine/xml/pojo/lookup/ZongPricePoint;)V */
		 (( android.sax.Element ) v2 ).setStartElementListener ( v5 ); // invoke-virtual {v2, v5}, Landroid/sax/Element;->setStartElementListener(Landroid/sax/StartElementListener;)V
		 final String v2 = "http://pay01.zong.com/zongpay"; // const-string v2, "http://pay01.zong.com/zongpay"
		 final String v5 = "provider"; // const-string v5, "provider"
		 (( android.sax.Element ) v3 ).getChild ( v2, v5 ); // invoke-virtual {v3, v2, v5}, Landroid/sax/Element;->getChild(Ljava/lang/String;Ljava/lang/String;)Landroid/sax/Element;
		 /* new-instance v3, Lzongfuscated/w$6; */
		 /* invoke-direct {v3, v0}, Lzongfuscated/w$6;-><init>(Lcom/zong/android/engine/xml/pojo/lookup/ZongPricePoint;)V */
		 (( android.sax.Element ) v2 ).setStartElementListener ( v3 ); // invoke-virtual {v2, v3}, Landroid/sax/Element;->setStartElementListener(Landroid/sax/StartElementListener;)V
		 /* new-instance v2, Lzongfuscated/w$7; */
		 /* invoke-direct {v2, v0}, Lzongfuscated/w$7;-><init>(Lcom/zong/android/engine/xml/pojo/lookup/ZongPricePoint;)V */
		 (( android.sax.Element ) v4 ).setEndTextElementListener ( v2 ); // invoke-virtual {v4, v2}, Landroid/sax/Element;->setEndTextElementListener(Landroid/sax/EndTextElementListener;)V
		 try { // :try_start_0
			 v2 = android.util.Xml$Encoding.UTF_8;
			 (( android.sax.RootElement ) v1 ).getContentHandler ( ); // invoke-virtual {v1}, Landroid/sax/RootElement;->getContentHandler()Lorg/xml/sax/ContentHandler;
			 android.util.Xml .parse ( p0,v2,v1 );
			 /* :try_end_0 */
			 /* .catch Ljava/lang/Exception; {:try_start_0 ..:try_end_0} :catch_0 */
		 } // :goto_0
		 /* :catch_0 */
		 /* move-exception v0 */
		 v1 = zongfuscated.w.a;
		 final String v2 = "Parse"; // const-string v2, "Parse"
		 zongfuscated.q .a ( v1,v2,v0 );
		 int v0 = 0; // const/4 v0, 0x0
	 } // .end method
