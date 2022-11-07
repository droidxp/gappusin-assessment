public class com.jumptap.adtag.utils.JtAdUrlBuilder {
	 /* .source "JtAdUrlBuilder.java" */
	 /* # static fields */
	 private static final java.lang.String JT_COUNT;
	 /* # instance fields */
	 private android.content.Context context;
	 private com.jumptap.adtag.JtAdWidgetSettings widgetSettings;
	 /* # direct methods */
	 public com.jumptap.adtag.utils.JtAdUrlBuilder ( ) {
		 /* .locals 0 */
		 /* .param p1, "widgetSettings" # Lcom/jumptap/adtag/JtAdWidgetSettings; */
		 /* .param p2, "context" # Landroid/content/Context; */
		 /* .prologue */
		 /* .line 21 */
		 /* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
		 /* .line 22 */
		 this.widgetSettings = p1;
		 /* .line 23 */
		 this.context = p2;
		 /* .line 24 */
		 return;
	 } // .end method
	 public static java.lang.String encodeParam ( java.lang.String p0 ) {
		 /* .locals 2 */
		 /* .param p0, "str" # Ljava/lang/String; */
		 /* .prologue */
		 /* .line 82 */
		 if ( p0 != null) { // if-eqz p0, :cond_0
			 final String v1 = ""; // const-string v1, ""
			 v1 = 			 (( java.lang.String ) p0 ).equals ( v1 ); // invoke-virtual {p0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
			 if ( v1 != null) { // if-eqz v1, :cond_1
				 /* .line 83 */
			 } // :cond_0
			 final String v1 = ""; // const-string v1, ""
			 /* .line 90 */
		 } // :goto_0
		 /* .line 86 */
	 } // :cond_1
	 try { // :try_start_0
		 final String v1 = "UTF-8"; // const-string v1, "UTF-8"
		 java.net.URLEncoder .encode ( p0,v1 );
		 /* :try_end_0 */
		 /* .catch Ljava/io/UnsupportedEncodingException; {:try_start_0 ..:try_end_0} :catch_0 */
		 /* .line 87 */
		 /* :catch_0 */
		 /* move-exception v0 */
		 /* .line 89 */
		 /* .local v0, "e":Ljava/io/UnsupportedEncodingException; */
		 (( java.io.UnsupportedEncodingException ) v0 ).printStackTrace ( ); // invoke-virtual {v0}, Ljava/io/UnsupportedEncodingException;->printStackTrace()V
		 /* .line 90 */
		 final String v1 = ""; // const-string v1, ""
	 } // .end method
	 /* # virtual methods */
	 public java.lang.String getAdUrl ( android.webkit.WebView p0 ) {
		 /* .locals 1 */
		 /* .param p1, "view" # Landroid/webkit/WebView; */
		 /* .prologue */
		 /* .line 27 */
		 int v0 = 0; // const/4 v0, 0x0
		 (( com.jumptap.adtag.utils.JtAdUrlBuilder ) p0 ).getAdUrl ( p1, v0 ); // invoke-virtual {p0, p1, v0}, Lcom/jumptap/adtag/utils/JtAdUrlBuilder;->getAdUrl(Landroid/webkit/WebView;Ljava/lang/String;)Ljava/lang/String;
	 } // .end method
	 public java.lang.String getAdUrl ( android.webkit.WebView p0, java.lang.String p1 ) {
		 /* .locals 8 */
		 /* .param p1, "view" # Landroid/webkit/WebView; */
		 /* .param p2, "aditionalToUrl" # Ljava/lang/String; */
		 /* .prologue */
		 /* .line 32 */
		 /* new-instance v2, Ljava/lang/StringBuilder; */
		 v6 = this.widgetSettings;
		 (( com.jumptap.adtag.JtAdWidgetSettings ) v6 ).getHostURL ( ); // invoke-virtual {v6}, Lcom/jumptap/adtag/JtAdWidgetSettings;->getHostURL()Ljava/lang/String;
		 /* invoke-direct {v2, v6}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V */
		 /* .line 33 */
		 /* .local v2, "jtUrl":Ljava/lang/StringBuilder; */
		 final String v6 = "&ua="; // const-string v6, "&ua="
		 (( java.lang.StringBuilder ) v2 ).append ( v6 ); // invoke-virtual {v2, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
		 v7 = this.widgetSettings;
		 (( com.jumptap.adtag.JtAdWidgetSettings ) v7 ).getUserAgent ( p1 ); // invoke-virtual {v7, p1}, Lcom/jumptap/adtag/JtAdWidgetSettings;->getUserAgent(Landroid/webkit/WebView;)Ljava/lang/String;
		 com.jumptap.adtag.utils.JtAdUrlBuilder .encodeParam ( v7 );
		 (( java.lang.StringBuilder ) v6 ).append ( v7 ); // invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
		 /* .line 34 */
		 final String v6 = "&pub="; // const-string v6, "&pub="
		 (( java.lang.StringBuilder ) v2 ).append ( v6 ); // invoke-virtual {v2, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
		 v7 = this.widgetSettings;
		 (( com.jumptap.adtag.JtAdWidgetSettings ) v7 ).getPublisherId ( ); // invoke-virtual {v7}, Lcom/jumptap/adtag/JtAdWidgetSettings;->getPublisherId()Ljava/lang/String;
		 com.jumptap.adtag.utils.JtAdUrlBuilder .encodeParam ( v7 );
		 (( java.lang.StringBuilder ) v6 ).append ( v7 ); // invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
		 /* .line 35 */
		 final String v6 = "&spot="; // const-string v6, "&spot="
		 (( java.lang.StringBuilder ) v2 ).append ( v6 ); // invoke-virtual {v2, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
		 v7 = this.widgetSettings;
		 (( com.jumptap.adtag.JtAdWidgetSettings ) v7 ).getSpotId ( ); // invoke-virtual {v7}, Lcom/jumptap/adtag/JtAdWidgetSettings;->getSpotId()Ljava/lang/String;
		 com.jumptap.adtag.utils.JtAdUrlBuilder .encodeParam ( v7 );
		 (( java.lang.StringBuilder ) v6 ).append ( v7 ); // invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
		 /* .line 36 */
		 final String v6 = "&site="; // const-string v6, "&site="
		 (( java.lang.StringBuilder ) v2 ).append ( v6 ); // invoke-virtual {v2, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
		 v7 = this.widgetSettings;
		 (( com.jumptap.adtag.JtAdWidgetSettings ) v7 ).getSiteId ( ); // invoke-virtual {v7}, Lcom/jumptap/adtag/JtAdWidgetSettings;->getSiteId()Ljava/lang/String;
		 com.jumptap.adtag.utils.JtAdUrlBuilder .encodeParam ( v7 );
		 (( java.lang.StringBuilder ) v6 ).append ( v7 ); // invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
		 /* .line 39 */
		 v6 = this.widgetSettings;
		 v6 = 		 (( com.jumptap.adtag.JtAdWidgetSettings ) v6 ).isShouldSendLocation ( ); // invoke-virtual {v6}, Lcom/jumptap/adtag/JtAdWidgetSettings;->isShouldSendLocation()Z
		 if ( v6 != null) { // if-eqz v6, :cond_0
			 /* .line 40 */
			 v6 = this.context;
			 com.jumptap.adtag.utils.JtAdManager .getLocation ( v6 );
			 /* .line 41 */
			 /* .local v3, "location":Ljava/lang/String; */
			 if ( v3 != null) { // if-eqz v3, :cond_0
				 /* .line 42 */
				 final String v6 = "&ll="; // const-string v6, "&ll="
				 (( java.lang.StringBuilder ) v2 ).append ( v6 ); // invoke-virtual {v2, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
				 com.jumptap.adtag.utils.JtAdUrlBuilder .encodeParam ( v3 );
				 (( java.lang.StringBuilder ) v6 ).append ( v7 ); // invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
				 /* .line 43 */
				 final String v6 = "&country="; // const-string v6, "&country="
				 (( java.lang.StringBuilder ) v2 ).append ( v6 ); // invoke-virtual {v2, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
				 v7 = this.widgetSettings;
				 (( com.jumptap.adtag.JtAdWidgetSettings ) v7 ).getCountry ( ); // invoke-virtual {v7}, Lcom/jumptap/adtag/JtAdWidgetSettings;->getCountry()Ljava/lang/String;
				 com.jumptap.adtag.utils.JtAdUrlBuilder .encodeParam ( v7 );
				 (( java.lang.StringBuilder ) v6 ).append ( v7 ); // invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
				 /* .line 44 */
				 final String v6 = "&pc="; // const-string v6, "&pc="
				 (( java.lang.StringBuilder ) v2 ).append ( v6 ); // invoke-virtual {v2, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
				 v7 = this.widgetSettings;
				 (( com.jumptap.adtag.JtAdWidgetSettings ) v7 ).getPostalCode ( ); // invoke-virtual {v7}, Lcom/jumptap/adtag/JtAdWidgetSettings;->getPostalCode()Ljava/lang/String;
				 com.jumptap.adtag.utils.JtAdUrlBuilder .encodeParam ( v7 );
				 (( java.lang.StringBuilder ) v6 ).append ( v7 ); // invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
				 /* .line 47 */
			 } // .end local v3 # "location":Ljava/lang/String;
		 } // :cond_0
		 final String v6 = "&mt-age="; // const-string v6, "&mt-age="
		 (( java.lang.StringBuilder ) v2 ).append ( v6 ); // invoke-virtual {v2, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
		 v7 = this.widgetSettings;
		 (( com.jumptap.adtag.JtAdWidgetSettings ) v7 ).getAge ( ); // invoke-virtual {v7}, Lcom/jumptap/adtag/JtAdWidgetSettings;->getAge()Ljava/lang/String;
		 com.jumptap.adtag.utils.JtAdUrlBuilder .encodeParam ( v7 );
		 (( java.lang.StringBuilder ) v6 ).append ( v7 ); // invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
		 /* .line 48 */
		 final String v6 = "&mt-gender="; // const-string v6, "&mt-gender="
		 (( java.lang.StringBuilder ) v2 ).append ( v6 ); // invoke-virtual {v2, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
		 v7 = this.widgetSettings;
		 (( com.jumptap.adtag.JtAdWidgetSettings ) v7 ).getGender ( ); // invoke-virtual {v7}, Lcom/jumptap/adtag/JtAdWidgetSettings;->getGender()Ljava/lang/String;
		 com.jumptap.adtag.utils.JtAdUrlBuilder .encodeParam ( v7 );
		 (( java.lang.StringBuilder ) v6 ).append ( v7 ); // invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
		 /* .line 49 */
		 final String v6 = "&mt-hhi="; // const-string v6, "&mt-hhi="
		 (( java.lang.StringBuilder ) v2 ).append ( v6 ); // invoke-virtual {v2, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
		 v7 = this.widgetSettings;
		 (( com.jumptap.adtag.JtAdWidgetSettings ) v7 ).getHHI ( ); // invoke-virtual {v7}, Lcom/jumptap/adtag/JtAdWidgetSettings;->getHHI()Ljava/lang/String;
		 com.jumptap.adtag.utils.JtAdUrlBuilder .encodeParam ( v7 );
		 (( java.lang.StringBuilder ) v6 ).append ( v7 ); // invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
		 /* .line 51 */
		 final String v6 = "&hid="; // const-string v6, "&hid="
		 (( java.lang.StringBuilder ) v2 ).append ( v6 ); // invoke-virtual {v2, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
		 v7 = this.context;
		 com.jumptap.adtag.utils.JtAdManager .getHID ( v7 );
		 com.jumptap.adtag.utils.JtAdUrlBuilder .encodeParam ( v7 );
		 (( java.lang.StringBuilder ) v6 ).append ( v7 ); // invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
		 /* .line 52 */
		 final String v6 = "&a="; // const-string v6, "&a="
		 (( java.lang.StringBuilder ) v2 ).append ( v6 ); // invoke-virtual {v2, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
		 v7 = this.widgetSettings;
		 (( com.jumptap.adtag.JtAdWidgetSettings ) v7 ).getAdultContentType ( ); // invoke-virtual {v7}, Lcom/jumptap/adtag/JtAdWidgetSettings;->getAdultContentType()Ljava/lang/String;
		 com.jumptap.adtag.utils.JtAdUrlBuilder .encodeParam ( v7 );
		 (( java.lang.StringBuilder ) v6 ).append ( v7 ); // invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
		 /* .line 53 */
		 final String v6 = "&l="; // const-string v6, "&l="
		 (( java.lang.StringBuilder ) v2 ).append ( v6 ); // invoke-virtual {v2, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
		 v7 = this.widgetSettings;
		 (( com.jumptap.adtag.JtAdWidgetSettings ) v7 ).getLanguage ( ); // invoke-virtual {v7}, Lcom/jumptap/adtag/JtAdWidgetSettings;->getLanguage()Ljava/lang/String;
		 com.jumptap.adtag.utils.JtAdUrlBuilder .encodeParam ( v7 );
		 (( java.lang.StringBuilder ) v6 ).append ( v7 ); // invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
		 /* .line 54 */
		 final String v6 = "&c="; // const-string v6, "&c="
		 (( java.lang.StringBuilder ) v2 ).append ( v6 ); // invoke-virtual {v2, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
		 final String v7 = "1"; // const-string v7, "1"
		 com.jumptap.adtag.utils.JtAdUrlBuilder .encodeParam ( v7 );
		 (( java.lang.StringBuilder ) v6 ).append ( v7 ); // invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
		 /* .line 55 */
		 final String v6 = "&version="; // const-string v6, "&version="
		 (( java.lang.StringBuilder ) v2 ).append ( v6 ); // invoke-virtual {v2, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
		 v7 = this.widgetSettings;
		 (( com.jumptap.adtag.JtAdWidgetSettings ) v7 ).getVersion ( ); // invoke-virtual {v7}, Lcom/jumptap/adtag/JtAdWidgetSettings;->getVersion()Ljava/lang/String;
		 com.jumptap.adtag.utils.JtAdUrlBuilder .encodeParam ( v7 );
		 (( java.lang.StringBuilder ) v6 ).append ( v7 ); // invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
		 /* .line 57 */
		 final String v6 = "&mt-speed="; // const-string v6, "&mt-speed="
		 (( java.lang.StringBuilder ) v2 ).append ( v6 ); // invoke-virtual {v2, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
		 v7 = this.context;
		 com.jumptap.adtag.utils.JtAdManager .getConnectionType ( v7 );
		 com.jumptap.adtag.utils.JtAdUrlBuilder .encodeParam ( v7 );
		 (( java.lang.StringBuilder ) v6 ).append ( v7 ); // invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
		 /* .line 58 */
		 final String v6 = "&mt-jtlib="; // const-string v6, "&mt-jtlib="
		 (( java.lang.StringBuilder ) v2 ).append ( v6 ); // invoke-virtual {v2, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
		 v7 = this.widgetSettings;
		 (( com.jumptap.adtag.JtAdWidgetSettings ) v7 ).getJtLibVer ( ); // invoke-virtual {v7}, Lcom/jumptap/adtag/JtAdWidgetSettings;->getJtLibVer()Ljava/lang/String;
		 com.jumptap.adtag.utils.JtAdUrlBuilder .encodeParam ( v7 );
		 (( java.lang.StringBuilder ) v6 ).append ( v7 ); // invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
		 /* .line 59 */
		 final String v6 = "&mt-bundle="; // const-string v6, "&mt-bundle="
		 (( java.lang.StringBuilder ) v2 ).append ( v6 ); // invoke-virtual {v2, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
		 v7 = this.widgetSettings;
		 (( com.jumptap.adtag.JtAdWidgetSettings ) v7 ).getBundleVersion ( ); // invoke-virtual {v7}, Lcom/jumptap/adtag/JtAdWidgetSettings;->getBundleVersion()Ljava/lang/String;
		 com.jumptap.adtag.utils.JtAdUrlBuilder .encodeParam ( v7 );
		 (( java.lang.StringBuilder ) v6 ).append ( v7 ); // invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
		 /* .line 60 */
		 final String v6 = "&mt-os="; // const-string v6, "&mt-os="
		 (( java.lang.StringBuilder ) v2 ).append ( v6 ); // invoke-virtual {v2, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
		 v7 = this.widgetSettings;
		 (( com.jumptap.adtag.JtAdWidgetSettings ) v7 ).getOs ( ); // invoke-virtual {v7}, Lcom/jumptap/adtag/JtAdWidgetSettings;->getOs()Ljava/lang/String;
		 com.jumptap.adtag.utils.JtAdUrlBuilder .encodeParam ( v7 );
		 (( java.lang.StringBuilder ) v6 ).append ( v7 ); // invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
		 /* .line 61 */
		 final String v6 = "&mt-osversion="; // const-string v6, "&mt-osversion="
		 (( java.lang.StringBuilder ) v2 ).append ( v6 ); // invoke-virtual {v2, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
		 com.jumptap.adtag.utils.JtAdManager .getSDKVersion ( );
		 com.jumptap.adtag.utils.JtAdUrlBuilder .encodeParam ( v7 );
		 (( java.lang.StringBuilder ) v6 ).append ( v7 ); // invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
		 /* .line 62 */
		 final String v6 = "&mt-model="; // const-string v6, "&mt-model="
		 (( java.lang.StringBuilder ) v2 ).append ( v6 ); // invoke-virtual {v2, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
		 com.jumptap.adtag.utils.JtAdManager .getAndroidModel ( );
		 com.jumptap.adtag.utils.JtAdUrlBuilder .encodeParam ( v7 );
		 (( java.lang.StringBuilder ) v6 ).append ( v7 ); // invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
		 /* .line 63 */
		 final String v6 = "&mt-make="; // const-string v6, "&mt-make="
		 (( java.lang.StringBuilder ) v2 ).append ( v6 ); // invoke-virtual {v2, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
		 com.jumptap.adtag.utils.JtAdManager .getBrand ( );
		 com.jumptap.adtag.utils.JtAdUrlBuilder .encodeParam ( v7 );
		 (( java.lang.StringBuilder ) v6 ).append ( v7 ); // invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
		 /* .line 64 */
		 final String v6 = "&mt-fw="; // const-string v6, "&mt-fw="
		 (( java.lang.StringBuilder ) v2 ).append ( v6 ); // invoke-virtual {v2, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
		 com.jumptap.adtag.utils.JtAdManager .getKernelVersion ( );
		 com.jumptap.adtag.utils.JtAdUrlBuilder .encodeParam ( v7 );
		 (( java.lang.StringBuilder ) v6 ).append ( v7 ); // invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
		 /* .line 65 */
		 final String v6 = "&mt-operator="; // const-string v6, "&mt-operator="
		 (( java.lang.StringBuilder ) v2 ).append ( v6 ); // invoke-virtual {v2, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
		 v7 = this.context;
		 com.jumptap.adtag.utils.JtAdManager .getOperatorName ( v7 );
		 com.jumptap.adtag.utils.JtAdUrlBuilder .encodeParam ( v7 );
		 (( java.lang.StringBuilder ) v6 ).append ( v7 ); // invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
		 /* .line 66 */
		 final String v6 = "&mt-nradio="; // const-string v6, "&mt-nradio="
		 (( java.lang.StringBuilder ) v2 ).append ( v6 ); // invoke-virtual {v2, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
		 v7 = this.context;
		 com.jumptap.adtag.utils.JtAdManager .getNetworkType ( v7 );
		 com.jumptap.adtag.utils.JtAdUrlBuilder .encodeParam ( v7 );
		 (( java.lang.StringBuilder ) v6 ).append ( v7 ); // invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
		 /* .line 67 */
		 final String v6 = "&mt-dradio="; // const-string v6, "&mt-dradio="
		 (( java.lang.StringBuilder ) v2 ).append ( v6 ); // invoke-virtual {v2, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
		 v7 = this.context;
		 com.jumptap.adtag.utils.JtAdManager .getPhoneType ( v7 );
		 com.jumptap.adtag.utils.JtAdUrlBuilder .encodeParam ( v7 );
		 (( java.lang.StringBuilder ) v6 ).append ( v7 ); // invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
		 /* .line 68 */
		 v4 = 		 (( android.webkit.WebView ) p1 ).getWidth ( ); // invoke-virtual {p1}, Landroid/webkit/WebView;->getWidth()I
		 /* .line 69 */
		 /* .local v4, "width":I */
		 v0 = 		 (( android.webkit.WebView ) p1 ).getHeight ( ); // invoke-virtual {p1}, Landroid/webkit/WebView;->getHeight()I
		 /* .line 70 */
		 /* .local v0, "height":I */
		 java.lang.Integer .toString ( v4 );
		 /* .line 71 */
		 /* .local v5, "widthString":Ljava/lang/String; */
		 java.lang.Integer .toString ( v0 );
		 /* .line 72 */
		 /* .local v1, "heightString":Ljava/lang/String; */
		 final String v6 = "&mt-width="; // const-string v6, "&mt-width="
		 (( java.lang.StringBuilder ) v2 ).append ( v6 ); // invoke-virtual {v2, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
		 com.jumptap.adtag.utils.JtAdUrlBuilder .encodeParam ( v5 );
		 (( java.lang.StringBuilder ) v6 ).append ( v7 ); // invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
		 /* .line 73 */
		 final String v6 = "&mt-height="; // const-string v6, "&mt-height="
		 (( java.lang.StringBuilder ) v2 ).append ( v6 ); // invoke-virtual {v2, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
		 com.jumptap.adtag.utils.JtAdUrlBuilder .encodeParam ( v1 );
		 (( java.lang.StringBuilder ) v6 ).append ( v7 ); // invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
		 /* .line 74 */
		 if ( p2 != null) { // if-eqz p2, :cond_1
			 /* .line 75 */
			 /* new-instance v6, Ljava/lang/StringBuilder; */
			 /* invoke-direct {v6}, Ljava/lang/StringBuilder;-><init>()V */
			 final String v7 = "&"; // const-string v7, "&"
			 (( java.lang.StringBuilder ) v6 ).append ( v7 ); // invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
			 (( java.lang.StringBuilder ) v6 ).append ( p2 ); // invoke-virtual {v6, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
			 (( java.lang.StringBuilder ) v6 ).toString ( ); // invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
			 (( java.lang.StringBuilder ) v2 ).append ( v6 ); // invoke-virtual {v2, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
			 /* .line 78 */
		 } // :cond_1
		 (( java.lang.StringBuilder ) v2 ).toString ( ); // invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
	 } // .end method
