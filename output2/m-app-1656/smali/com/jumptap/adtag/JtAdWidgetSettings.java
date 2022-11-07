public class com.jumptap.adtag.JtAdWidgetSettings implements java.lang.Cloneable {
	 /* .source "JtAdWidgetSettings.java" */
	 /* # interfaces */
	 /* # annotations */
	 /* .annotation system Ldalvik/annotation/MemberClasses; */
	 /* value = { */
	 /* Lcom/jumptap/adtag/JtAdWidgetSettings$AdultContent; */
	 /* } */
} // .end annotation
/* # static fields */
private static final java.lang.String ANDROID_OS;
private static final java.lang.String BASE_JT_URL;
private static final java.lang.String DEFAULT_LANG;
private static final Integer DEFAULT_REFRESH_PERIOD;
private static final java.lang.String DISMISS_BUTTON_DEFAULT_LABEL;
private static final Integer INTERSTITIAL_SHOW_DEFAULT_TIME;
private static final java.lang.String JT_BUNDLE;
private static final java.lang.String JT_LIB_VER;
private static final java.lang.String TAPLINK_VER;
private static final java.lang.String XHTML;
/* # instance fields */
private java.lang.String adFormat;
private java.lang.String adultContentType;
private java.lang.String age;
private android.graphics.Bitmap alternateImage;
private java.lang.String appId;
private java.lang.String appVer;
private Integer backgroundColor;
private java.lang.String bundleVersion;
private java.lang.String country;
private java.lang.String dismissButtonLabel;
private java.lang.String gender;
private Integer height;
private java.lang.String hhi;
private java.lang.String host;
private Integer interstitialshowTime;
private java.lang.String jtLibVer;
private java.lang.String language;
private java.lang.String os;
private java.lang.String postalCode;
private java.lang.String publisherId;
private Integer refreshPeriod;
private Boolean shouldDebugNetworkTraffic;
private Boolean shouldSendLocation;
private java.lang.String siteId;
private java.lang.String spotId;
private java.lang.String userAgent;
private java.lang.String version;
private Integer width;
/* # direct methods */
protected com.jumptap.adtag.JtAdWidgetSettings ( ) {
	 /* .locals 2 */
	 /* .prologue */
	 int v1 = 0; // const/4 v1, 0x0
	 /* .line 80 */
	 /* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
	 /* .line 48 */
	 /* const/16 v0, 0x140 */
	 /* iput v0, p0, Lcom/jumptap/adtag/JtAdWidgetSettings;->width:I */
	 /* .line 49 */
	 /* const/16 v0, 0x32 */
	 /* iput v0, p0, Lcom/jumptap/adtag/JtAdWidgetSettings;->height:I */
	 /* .line 51 */
	 this.publisherId = v1;
	 /* .line 52 */
	 this.siteId = v1;
	 /* .line 53 */
	 this.spotId = v1;
	 /* .line 54 */
	 final String v0 = "http://a.jumptap.com/a/ads?textOnly=f"; // const-string v0, "http://a.jumptap.com/a/ads?textOnly=f"
	 this.host = v0;
	 /* .line 55 */
	 this.userAgent = v1;
	 /* .line 56 */
	 final String v0 = "en"; // const-string v0, "en"
	 this.language = v0;
	 /* .line 57 */
	 final String v0 = "notallowed"; // const-string v0, "notallowed"
	 this.adultContentType = v0;
	 /* .line 58 */
	 final String v0 = ""; // const-string v0, ""
	 this.postalCode = v0;
	 /* .line 59 */
	 final String v0 = ""; // const-string v0, ""
	 this.country = v0;
	 /* .line 60 */
	 final String v0 = ""; // const-string v0, ""
	 this.age = v0;
	 /* .line 61 */
	 final String v0 = ""; // const-string v0, ""
	 this.gender = v0;
	 /* .line 62 */
	 final String v0 = ""; // const-string v0, ""
	 this.hhi = v0;
	 /* .line 63 */
	 final String v0 = "com.jumptap.adtag-android"; // const-string v0, "com.jumptap.adtag-android"
	 this.bundleVersion = v0;
	 /* .line 64 */
	 final String v0 = "xhtml"; // const-string v0, "xhtml"
	 this.adFormat = v0;
	 /* .line 65 */
	 final String v0 = "2.4.0.4"; // const-string v0, "2.4.0.4"
	 this.jtLibVer = v0;
	 /* .line 66 */
	 final String v0 = "v28"; // const-string v0, "v28"
	 this.version = v0;
	 /* .line 67 */
	 final String v0 = "Linux"; // const-string v0, "Linux"
	 this.os = v0;
	 /* .line 68 */
	 final String v0 = ""; // const-string v0, ""
	 this.appId = v0;
	 /* .line 69 */
	 final String v0 = ""; // const-string v0, ""
	 this.appVer = v0;
	 /* .line 71 */
	 /* const/16 v0, 0x3c */
	 /* iput v0, p0, Lcom/jumptap/adtag/JtAdWidgetSettings;->refreshPeriod:I */
	 /* .line 73 */
	 int v0 = 1; // const/4 v0, 0x1
	 /* iput-boolean v0, p0, Lcom/jumptap/adtag/JtAdWidgetSettings;->shouldSendLocation:Z */
	 /* .line 75 */
	 int v0 = -1; // const/4 v0, -0x1
	 /* iput v0, p0, Lcom/jumptap/adtag/JtAdWidgetSettings;->backgroundColor:I */
	 /* .line 76 */
	 final String v0 = "Close"; // const-string v0, "Close"
	 this.dismissButtonLabel = v0;
	 /* .line 77 */
	 /* const/16 v0, 0xa */
	 /* iput v0, p0, Lcom/jumptap/adtag/JtAdWidgetSettings;->interstitialshowTime:I */
	 /* .line 78 */
	 int v0 = 0; // const/4 v0, 0x0
	 /* iput-boolean v0, p0, Lcom/jumptap/adtag/JtAdWidgetSettings;->shouldDebugNetworkTraffic:Z */
	 /* .line 81 */
	 return;
} // .end method
protected com.jumptap.adtag.JtAdWidgetSettings ( ) {
	 /* .locals 2 */
	 /* .param p1, "publisherId" # Ljava/lang/String; */
	 /* .prologue */
	 int v1 = 0; // const/4 v1, 0x0
	 /* .line 83 */
	 /* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
	 /* .line 48 */
	 /* const/16 v0, 0x140 */
	 /* iput v0, p0, Lcom/jumptap/adtag/JtAdWidgetSettings;->width:I */
	 /* .line 49 */
	 /* const/16 v0, 0x32 */
	 /* iput v0, p0, Lcom/jumptap/adtag/JtAdWidgetSettings;->height:I */
	 /* .line 51 */
	 this.publisherId = v1;
	 /* .line 52 */
	 this.siteId = v1;
	 /* .line 53 */
	 this.spotId = v1;
	 /* .line 54 */
	 final String v0 = "http://a.jumptap.com/a/ads?textOnly=f"; // const-string v0, "http://a.jumptap.com/a/ads?textOnly=f"
	 this.host = v0;
	 /* .line 55 */
	 this.userAgent = v1;
	 /* .line 56 */
	 final String v0 = "en"; // const-string v0, "en"
	 this.language = v0;
	 /* .line 57 */
	 final String v0 = "notallowed"; // const-string v0, "notallowed"
	 this.adultContentType = v0;
	 /* .line 58 */
	 final String v0 = ""; // const-string v0, ""
	 this.postalCode = v0;
	 /* .line 59 */
	 final String v0 = ""; // const-string v0, ""
	 this.country = v0;
	 /* .line 60 */
	 final String v0 = ""; // const-string v0, ""
	 this.age = v0;
	 /* .line 61 */
	 final String v0 = ""; // const-string v0, ""
	 this.gender = v0;
	 /* .line 62 */
	 final String v0 = ""; // const-string v0, ""
	 this.hhi = v0;
	 /* .line 63 */
	 final String v0 = "com.jumptap.adtag-android"; // const-string v0, "com.jumptap.adtag-android"
	 this.bundleVersion = v0;
	 /* .line 64 */
	 final String v0 = "xhtml"; // const-string v0, "xhtml"
	 this.adFormat = v0;
	 /* .line 65 */
	 final String v0 = "2.4.0.4"; // const-string v0, "2.4.0.4"
	 this.jtLibVer = v0;
	 /* .line 66 */
	 final String v0 = "v28"; // const-string v0, "v28"
	 this.version = v0;
	 /* .line 67 */
	 final String v0 = "Linux"; // const-string v0, "Linux"
	 this.os = v0;
	 /* .line 68 */
	 final String v0 = ""; // const-string v0, ""
	 this.appId = v0;
	 /* .line 69 */
	 final String v0 = ""; // const-string v0, ""
	 this.appVer = v0;
	 /* .line 71 */
	 /* const/16 v0, 0x3c */
	 /* iput v0, p0, Lcom/jumptap/adtag/JtAdWidgetSettings;->refreshPeriod:I */
	 /* .line 73 */
	 int v0 = 1; // const/4 v0, 0x1
	 /* iput-boolean v0, p0, Lcom/jumptap/adtag/JtAdWidgetSettings;->shouldSendLocation:Z */
	 /* .line 75 */
	 int v0 = -1; // const/4 v0, -0x1
	 /* iput v0, p0, Lcom/jumptap/adtag/JtAdWidgetSettings;->backgroundColor:I */
	 /* .line 76 */
	 final String v0 = "Close"; // const-string v0, "Close"
	 this.dismissButtonLabel = v0;
	 /* .line 77 */
	 /* const/16 v0, 0xa */
	 /* iput v0, p0, Lcom/jumptap/adtag/JtAdWidgetSettings;->interstitialshowTime:I */
	 /* .line 78 */
	 int v0 = 0; // const/4 v0, 0x0
	 /* iput-boolean v0, p0, Lcom/jumptap/adtag/JtAdWidgetSettings;->shouldDebugNetworkTraffic:Z */
	 /* .line 84 */
	 this.publisherId = p1;
	 /* .line 85 */
	 return;
} // .end method
/* # virtual methods */
public com.jumptap.adtag.JtAdWidgetSettings copy ( ) {
	 /* .locals 5 */
	 /* .prologue */
	 /* .line 93 */
	 int v1 = 0; // const/4 v1, 0x0
	 /* .line 95 */
	 /* .local v1, "clonedWidgetSettings":Lcom/jumptap/adtag/JtAdWidgetSettings; */
	 try { // :try_start_0
		 (( java.lang.Object ) p0 ).clone ( ); // invoke-virtual {p0}, Ljava/lang/Object;->clone()Ljava/lang/Object;
		 /* move-object v0, v3 */
		 /* check-cast v0, Lcom/jumptap/adtag/JtAdWidgetSettings; */
		 /* move-object v1, v0 */
		 /* :try_end_0 */
		 /* .catch Ljava/lang/CloneNotSupportedException; {:try_start_0 ..:try_end_0} :catch_0 */
		 /* .line 99 */
	 } // :goto_0
	 /* .line 96 */
	 /* :catch_0 */
	 /* move-exception v2 */
	 /* .line 97 */
	 /* .local v2, "e":Ljava/lang/CloneNotSupportedException; */
	 final String v3 = "JtAd"; // const-string v3, "JtAd"
	 (( java.lang.CloneNotSupportedException ) v2 ).getMessage ( ); // invoke-virtual {v2}, Ljava/lang/CloneNotSupportedException;->getMessage()Ljava/lang/String;
	 android.util.Log .d ( v3,v4 );
} // .end method
protected java.lang.String getAdFormat ( ) {
	 /* .locals 1 */
	 /* .prologue */
	 /* .line 336 */
	 v0 = this.adFormat;
} // .end method
public java.lang.String getAdultContentType ( ) {
	 /* .locals 1 */
	 /* .prologue */
	 /* .line 212 */
	 v0 = this.adultContentType;
} // .end method
public java.lang.String getAge ( ) {
	 /* .locals 1 */
	 /* .prologue */
	 /* .line 261 */
	 v0 = this.age;
} // .end method
public android.graphics.Bitmap getAlternateImage ( ) {
	 /* .locals 1 */
	 /* .prologue */
	 /* .line 392 */
	 v0 = this.alternateImage;
} // .end method
public java.lang.String getApplicationId ( ) {
	 /* .locals 1 */
	 /* .prologue */
	 /* .line 475 */
	 v0 = this.appId;
} // .end method
public java.lang.String getApplicationVersion ( ) {
	 /* .locals 1 */
	 /* .prologue */
	 /* .line 491 */
	 v0 = this.appVer;
} // .end method
public Integer getBackgroundColor ( ) {
	 /* .locals 1 */
	 /* .prologue */
	 /* .line 409 */
	 /* iget v0, p0, Lcom/jumptap/adtag/JtAdWidgetSettings;->backgroundColor:I */
} // .end method
public java.lang.String getBundleVersion ( ) {
	 /* .locals 1 */
	 /* .prologue */
	 /* .line 328 */
	 v0 = this.bundleVersion;
} // .end method
public java.lang.String getCountry ( ) {
	 /* .locals 1 */
	 /* .prologue */
	 /* .line 245 */
	 v0 = this.country;
} // .end method
public java.lang.String getDismissButtonLabel ( ) {
	 /* .locals 1 */
	 /* .prologue */
	 /* .line 434 */
	 v0 = this.dismissButtonLabel;
} // .end method
public java.lang.String getGender ( ) {
	 /* .locals 1 */
	 /* .prologue */
	 /* .line 277 */
	 v0 = this.gender;
} // .end method
public java.lang.String getHHI ( ) {
	 /* .locals 1 */
	 /* .prologue */
	 /* .line 293 */
	 v0 = this.hhi;
} // .end method
public Integer getHeight ( ) {
	 /* .locals 1 */
	 /* .prologue */
	 /* .line 503 */
	 /* iget v0, p0, Lcom/jumptap/adtag/JtAdWidgetSettings;->height:I */
} // .end method
public java.lang.String getHostURL ( ) {
	 /* .locals 1 */
	 /* .prologue */
	 /* .line 164 */
	 v0 = this.host;
} // .end method
public Integer getInterstitialshowTime ( ) {
	 /* .locals 1 */
	 /* .prologue */
	 /* .line 451 */
	 /* iget v0, p0, Lcom/jumptap/adtag/JtAdWidgetSettings;->interstitialshowTime:I */
} // .end method
public java.lang.String getJtLibVer ( ) {
	 /* .locals 1 */
	 /* .prologue */
	 /* .line 351 */
	 v0 = this.jtLibVer;
} // .end method
public java.lang.String getLanguage ( ) {
	 /* .locals 1 */
	 /* .prologue */
	 /* .line 196 */
	 v0 = this.language;
} // .end method
public java.lang.String getOs ( ) {
	 /* .locals 1 */
	 /* .prologue */
	 /* .line 459 */
	 v0 = this.os;
} // .end method
public java.lang.String getPostalCode ( ) {
	 /* .locals 1 */
	 /* .prologue */
	 /* .line 229 */
	 v0 = this.postalCode;
} // .end method
public java.lang.String getPublisherId ( ) {
	 /* .locals 1 */
	 /* .prologue */
	 /* .line 108 */
	 v0 = this.publisherId;
} // .end method
public Integer getRefreshPeriod ( ) {
	 /* .locals 1 */
	 /* .prologue */
	 /* .line 311 */
	 /* iget v0, p0, Lcom/jumptap/adtag/JtAdWidgetSettings;->refreshPeriod:I */
} // .end method
public Boolean getShouldDebugNetworkTraffic ( ) {
	 /* .locals 1 */
	 /* .prologue */
	 /* .line 515 */
	 /* iget-boolean v0, p0, Lcom/jumptap/adtag/JtAdWidgetSettings;->shouldDebugNetworkTraffic:Z */
} // .end method
public java.lang.String getSiteId ( ) {
	 /* .locals 1 */
	 /* .prologue */
	 /* .line 129 */
	 v0 = this.siteId;
} // .end method
public java.lang.String getSpotId ( ) {
	 /* .locals 1 */
	 /* .prologue */
	 /* .line 147 */
	 v0 = this.spotId;
} // .end method
public java.lang.String getUserAgent ( android.webkit.WebView p0 ) {
	 /* .locals 4 */
	 /* .param p1, "webView" # Landroid/webkit/WebView; */
	 /* .prologue */
	 /* .line 183 */
	 v1 = this.userAgent;
	 /* if-nez v1, :cond_0 */
	 /* .line 184 */
	 (( android.webkit.WebView ) p1 ).getSettings ( ); // invoke-virtual {p1}, Landroid/webkit/WebView;->getSettings()Landroid/webkit/WebSettings;
	 /* .line 185 */
	 /* .local v0, "settings":Landroid/webkit/WebSettings; */
	 (( android.webkit.WebSettings ) v0 ).getUserAgentString ( ); // invoke-virtual {v0}, Landroid/webkit/WebSettings;->getUserAgentString()Ljava/lang/String;
	 this.userAgent = v1;
	 /* .line 186 */
	 final String v1 = "JtAd"; // const-string v1, "JtAd"
	 /* new-instance v2, Ljava/lang/StringBuilder; */
	 /* invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V */
	 final String v3 = "userAgent: "; // const-string v3, "userAgent: "
	 (( java.lang.StringBuilder ) v2 ).append ( v3 ); // invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
	 v3 = this.userAgent;
	 (( java.lang.StringBuilder ) v2 ).append ( v3 ); // invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
	 (( java.lang.StringBuilder ) v2 ).toString ( ); // invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
	 android.util.Log .d ( v1,v2 );
	 /* .line 188 */
} // .end local v0 # "settings":Landroid/webkit/WebSettings;
} // :cond_0
v1 = this.userAgent;
} // .end method
public java.lang.String getVersion ( ) {
/* .locals 1 */
/* .prologue */
/* .line 359 */
v0 = this.version;
} // .end method
public Integer getWidth ( ) {
/* .locals 1 */
/* .prologue */
/* .line 495 */
/* iget v0, p0, Lcom/jumptap/adtag/JtAdWidgetSettings;->width:I */
} // .end method
public Boolean isShouldSendLocation ( ) {
/* .locals 1 */
/* .prologue */
/* .line 384 */
/* iget-boolean v0, p0, Lcom/jumptap/adtag/JtAdWidgetSettings;->shouldSendLocation:Z */
} // .end method
public void setAdFormat ( java.lang.String p0 ) {
/* .locals 0 */
/* .param p1, "adFormat" # Ljava/lang/String; */
/* .prologue */
/* .line 343 */
this.adFormat = p1;
/* .line 344 */
return;
} // .end method
public void setAdultContentType ( java.lang.String p0 ) {
/* .locals 0 */
/* .param p1, "adultContent" # Ljava/lang/String; */
/* .prologue */
/* .line 221 */
this.adultContentType = p1;
/* .line 222 */
return;
} // .end method
public void setAge ( java.lang.String p0 ) {
/* .locals 0 */
/* .param p1, "age" # Ljava/lang/String; */
/* .prologue */
/* .line 269 */
this.age = p1;
/* .line 270 */
return;
} // .end method
public void setAlternateImage ( android.graphics.Bitmap p0 ) {
/* .locals 0 */
/* .param p1, "alternateImage" # Landroid/graphics/Bitmap; */
/* .prologue */
/* .line 401 */
this.alternateImage = p1;
/* .line 402 */
return;
} // .end method
public void setApplicationId ( java.lang.String p0 ) {
/* .locals 0 */
/* .param p1, "appId" # Ljava/lang/String; */
/* .prologue */
/* .line 467 */
this.appId = p1;
/* .line 468 */
return;
} // .end method
public void setApplicationVersion ( java.lang.String p0 ) {
/* .locals 0 */
/* .param p1, "appVer" # Ljava/lang/String; */
/* .prologue */
/* .line 483 */
this.appVer = p1;
/* .line 484 */
return;
} // .end method
public void setBackgroundColor ( Integer p0 ) {
/* .locals 0 */
/* .param p1, "backgroundColor" # I */
/* .prologue */
/* .line 418 */
/* iput p1, p0, Lcom/jumptap/adtag/JtAdWidgetSettings;->backgroundColor:I */
/* .line 419 */
return;
} // .end method
public void setCountry ( java.lang.String p0 ) {
/* .locals 0 */
/* .param p1, "country" # Ljava/lang/String; */
/* .prologue */
/* .line 253 */
this.country = p1;
/* .line 254 */
return;
} // .end method
public void setDismissButtonLabel ( java.lang.String p0 ) {
/* .locals 0 */
/* .param p1, "dismissButtonLabel" # Ljava/lang/String; */
/* .prologue */
/* .line 426 */
this.dismissButtonLabel = p1;
/* .line 427 */
return;
} // .end method
public void setGender ( java.lang.String p0 ) {
/* .locals 0 */
/* .param p1, "gender" # Ljava/lang/String; */
/* .prologue */
/* .line 285 */
this.gender = p1;
/* .line 286 */
return;
} // .end method
public void setHHI ( java.lang.String p0 ) {
/* .locals 0 */
/* .param p1, "hhi" # Ljava/lang/String; */
/* .prologue */
/* .line 301 */
this.hhi = p1;
/* .line 302 */
return;
} // .end method
public void setHeight ( Integer p0 ) {
/* .locals 0 */
/* .param p1, "height" # I */
/* .prologue */
/* .line 507 */
/* iput p1, p0, Lcom/jumptap/adtag/JtAdWidgetSettings;->height:I */
/* .line 508 */
return;
} // .end method
public void setHostURL ( java.lang.String p0 ) {
/* .locals 0 */
/* .param p1, "host" # Ljava/lang/String; */
/* .prologue */
/* .line 172 */
this.host = p1;
/* .line 173 */
return;
} // .end method
public void setInterstitialshowTime ( Integer p0 ) {
/* .locals 0 */
/* .param p1, "interstitialshowTime" # I */
/* .prologue */
/* .line 443 */
/* iput p1, p0, Lcom/jumptap/adtag/JtAdWidgetSettings;->interstitialshowTime:I */
/* .line 444 */
return;
} // .end method
public void setLanguage ( java.lang.String p0 ) {
/* .locals 0 */
/* .param p1, "language" # Ljava/lang/String; */
/* .prologue */
/* .line 204 */
this.language = p1;
/* .line 205 */
return;
} // .end method
public void setPostalCode ( java.lang.String p0 ) {
/* .locals 0 */
/* .param p1, "postalCode" # Ljava/lang/String; */
/* .prologue */
/* .line 237 */
this.postalCode = p1;
/* .line 238 */
return;
} // .end method
public void setPublisherId ( java.lang.String p0 ) {
/* .locals 0 */
/* .param p1, "publisherId" # Ljava/lang/String; */
/* .prologue */
/* .line 116 */
this.publisherId = p1;
/* .line 117 */
return;
} // .end method
public void setRefreshPeriod ( Integer p0 ) {
/* .locals 0 */
/* .param p1, "refreshPeriod" # I */
/* .prologue */
/* .line 320 */
/* iput p1, p0, Lcom/jumptap/adtag/JtAdWidgetSettings;->refreshPeriod:I */
/* .line 321 */
return;
} // .end method
public void setShouldDebugNetworkTraffic ( Boolean p0 ) {
/* .locals 0 */
/* .param p1, "should" # Z */
/* .prologue */
/* .line 511 */
/* iput-boolean p1, p0, Lcom/jumptap/adtag/JtAdWidgetSettings;->shouldDebugNetworkTraffic:Z */
/* .line 512 */
return;
} // .end method
public void setShouldSendLocation ( Boolean p0 ) {
/* .locals 0 */
/* .param p1, "shouldSendLocation" # Z */
/* .prologue */
/* .line 376 */
/* iput-boolean p1, p0, Lcom/jumptap/adtag/JtAdWidgetSettings;->shouldSendLocation:Z */
/* .line 377 */
return;
} // .end method
public void setSiteId ( java.lang.String p0 ) {
/* .locals 0 */
/* .param p1, "siteId" # Ljava/lang/String; */
/* .prologue */
/* .line 137 */
this.siteId = p1;
/* .line 138 */
return;
} // .end method
public void setSpotId ( java.lang.String p0 ) {
/* .locals 0 */
/* .param p1, "spotId" # Ljava/lang/String; */
/* .prologue */
/* .line 155 */
this.spotId = p1;
/* .line 156 */
return;
} // .end method
public void setVersion ( java.lang.String p0 ) {
/* .locals 0 */
/* .param p1, "version" # Ljava/lang/String; */
/* .prologue */
/* .line 367 */
this.version = p1;
/* .line 368 */
return;
} // .end method
public void setWidth ( Integer p0 ) {
/* .locals 0 */
/* .param p1, "width" # I */
/* .prologue */
/* .line 499 */
/* iput p1, p0, Lcom/jumptap/adtag/JtAdWidgetSettings;->width:I */
/* .line 500 */
return;
} // .end method
