public class com.inneractive.api.ads.InneractiveAdView extends android.webkit.WebView {
	 /* .source "InneractiveAdView.java" */
	 /* # annotations */
	 /* .annotation system Ldalvik/annotation/MemberClasses; */
	 /* value = { */
	 /* Lcom/inneractive/api/ads/InneractiveAdView$IAwebChromeClient;, */
	 /* Lcom/inneractive/api/ads/InneractiveAdView$IAwebViewClient; */
	 /* } */
} // .end annotation
/* # static fields */
private static final Integer ANIMATION_DURATION;
protected static final java.lang.String CLICK_REPORT_URL_POSTFIX;
protected static final java.lang.String CLICK_REPORT_URL_PREFIX;
private static final java.lang.String CLIENT_ID_FILE_NAME;
private static final Integer CONNECTION_TIMEOUT;
private static final java.lang.String DEFAULT_CONTENT_ENCODING;
private static final java.lang.String DEFAULT_CONTENT_TYPE;
private static final Integer DEFAULT_REFRESH_INTERVAL;
private static final java.lang.String ERROR_CODE_HOUSE_AD;
private static final java.lang.String ERROR_CODE_INTERNAL_ERROR;
private static final java.lang.String ERROR_CODE_INVALID_INPUT;
private static final java.lang.String ERROR_CODE_OK;
private static final java.lang.String ERROR_CODE_UNKNOWN_APP_ID;
private static final Integer FADE_IN_MSG;
private static final Integer FADE_OUT_MSG;
static final Long GPS_REFRESH_INTERVAL;
protected static java.lang.String HOST_URL;
protected static java.lang.String HOST_URL_FOR_BANNER_AD;
protected static final java.lang.String HOST_URL_FOR_FULL_SCREEN_AD;
protected static java.lang.String HOST_URL_FOR_TEXT_AD;
private static final java.lang.String LOG;
static final java.lang.String MARKET_PORTAL_BANNER;
static final java.lang.String MARKET_PORTAL_TEXT;
private static final Integer MAX_REFRESH_INTERVAL;
private static final Integer MIN_REFRESH_INTERVAL;
private static final java.lang.String SDK_VERSION;
private static final Integer STANDART_BANNER_HEIGHT;
private static final Integer STANDART_BANNER_WIDTH;
private static final Integer STANDART_FULL_SCREEN_AD_HEIGHT;
private static final Integer STANDART_FULL_SCREEN_AD_WIDTH;
protected static final java.lang.String TEST_CLICK_REPORT_URL_PREFIX;
protected static java.lang.String TEST_HOST_URL;
protected static java.lang.String TEST_HOST_URL_FOR_BANNER_AD;
protected static final java.lang.String TEST_HOST_URL_FOR_FULL_SCREEN_AD;
protected static java.lang.String TEST_HOST_URL_FOR_TEXT_AD;
private static final java.lang.String VERSION;
private static java.lang.String clientID;
private static android.location.Location coordinates;
private static java.lang.String errorCode;
static Boolean isGPSfirstTime;
static Long lastGPSTime;
static Long lastGPSTimeInSeconds;
private static final java.lang.Object lock;
private static java.lang.String sessionID;
static Long startGPSTime;
static Long startGPSTimeInSec;
private static java.lang.String userAgent;
/* # instance fields */
private final java.lang.String BACK_EVENT_URL;
private final java.lang.String CLICK_EVENT_URL;
private final java.lang.String COLLAPSE_EVENT_URL;
private final java.lang.String ERROR_EVENT_URL;
private final java.lang.String EXPAND_EVENT_URL;
private final java.lang.String IA_EVENT_PREFIX;
private final java.lang.String LOAD_EVENT_URL;
private java.lang.String adRequest;
private Integer adType;
private Integer age;
private android.content.Context appContext;
private java.lang.String appID;
private final java.lang.String bannerAdTypeSTR;
private java.lang.String deviceID;
private java.lang.String distributionID;
private java.lang.String externalID;
private android.view.animation.Animation fadeInAnimation;
private android.view.animation.Animation fadeOutAnimation;
private final java.lang.String fullAdTypeSTR;
private java.lang.String gender;
private com.inneractive.api.ads.InneractiveAdView$IAwebChromeClient iaWVCclient;
private com.inneractive.api.ads.InneractiveAdView$IAwebViewClient iaWebClient;
private java.lang.String keywords;
private com.inneractive.api.ads.InneractiveAdEventsListener listener;
java.lang.String location;
private android.os.Handler mHandler;
private java.lang.String metaDataStr;
private java.lang.String msisdn;
private Integer refreshInterval;
private Integer screenHeight;
private Integer screenWidth;
private final java.lang.String skipURL;
private Boolean testMode;
private final java.lang.String textAdTypeSTR;
/* # direct methods */
static com.inneractive.api.ads.InneractiveAdView ( ) {
	 /* .locals 2 */
	 /* .prologue */
	 /* .line 56 */
	 final String v0 = "-1"; // const-string v0, "-1"
	 /* .line 65 */
	 /* new-instance v0, Ljava/lang/Object; */
	 /* invoke-direct {v0}, Ljava/lang/Object;-><init>()V */
	 /* .line 111 */
	 final String v0 = "http://wv.inner-active.mobi/simpleM2M/"; // const-string v0, "http://wv.inner-active.mobi/simpleM2M/"
	 /* .line 112 */
	 final String v0 = "http://ia-test.inner-active.mobi:8080/simpleM2M/"; // const-string v0, "http://ia-test.inner-active.mobi:8080/simpleM2M/"
	 /* .line 114 */
	 /* new-instance v0, Ljava/lang/StringBuilder; */
	 v1 = com.inneractive.api.ads.InneractiveAdView.HOST_URL;
	 java.lang.String .valueOf ( v1 );
	 /* invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V */
	 final String v1 = "clientRequestWVBannerOnly?"; // const-string v1, "clientRequestWVBannerOnly?"
	 (( java.lang.StringBuilder ) v0 ).append ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
	 (( java.lang.StringBuilder ) v0 ).toString ( ); // invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
	 /* .line 115 */
	 /* new-instance v0, Ljava/lang/StringBuilder; */
	 v1 = com.inneractive.api.ads.InneractiveAdView.HOST_URL;
	 java.lang.String .valueOf ( v1 );
	 /* invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V */
	 final String v1 = "clientRequestWVTextOnly?"; // const-string v1, "clientRequestWVTextOnly?"
	 (( java.lang.StringBuilder ) v0 ).append ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
	 (( java.lang.StringBuilder ) v0 ).toString ( ); // invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
	 /* .line 116 */
	 /* new-instance v0, Ljava/lang/StringBuilder; */
	 v1 = com.inneractive.api.ads.InneractiveAdView.HOST_URL;
	 java.lang.String .valueOf ( v1 );
	 /* invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V */
	 final String v1 = "clientRequestWVFullScreenNoTouch?"; // const-string v1, "clientRequestWVFullScreenNoTouch?"
	 (( java.lang.StringBuilder ) v0 ).append ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
	 (( java.lang.StringBuilder ) v0 ).toString ( ); // invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
	 /* .line 117 */
	 /* new-instance v0, Ljava/lang/StringBuilder; */
	 v1 = com.inneractive.api.ads.InneractiveAdView.HOST_URL;
	 java.lang.String .valueOf ( v1 );
	 /* invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V */
	 final String v1 = "wvClickUpdate?"; // const-string v1, "wvClickUpdate?"
	 (( java.lang.StringBuilder ) v0 ).append ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
	 (( java.lang.StringBuilder ) v0 ).toString ( ); // invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
	 /* .line 120 */
	 /* new-instance v0, Ljava/lang/StringBuilder; */
	 v1 = com.inneractive.api.ads.InneractiveAdView.TEST_HOST_URL;
	 java.lang.String .valueOf ( v1 );
	 /* invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V */
	 final String v1 = "clientRequestWVBannerOnly?"; // const-string v1, "clientRequestWVBannerOnly?"
	 (( java.lang.StringBuilder ) v0 ).append ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
	 (( java.lang.StringBuilder ) v0 ).toString ( ); // invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
	 /* .line 121 */
	 /* new-instance v0, Ljava/lang/StringBuilder; */
	 v1 = com.inneractive.api.ads.InneractiveAdView.TEST_HOST_URL;
	 java.lang.String .valueOf ( v1 );
	 /* invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V */
	 final String v1 = "clientRequestWVTextOnly?"; // const-string v1, "clientRequestWVTextOnly?"
	 (( java.lang.StringBuilder ) v0 ).append ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
	 (( java.lang.StringBuilder ) v0 ).toString ( ); // invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
	 /* .line 122 */
	 /* new-instance v0, Ljava/lang/StringBuilder; */
	 v1 = com.inneractive.api.ads.InneractiveAdView.TEST_HOST_URL;
	 java.lang.String .valueOf ( v1 );
	 /* invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V */
	 final String v1 = "clientRequestWVFullScreenNoTouch?"; // const-string v1, "clientRequestWVFullScreenNoTouch?"
	 (( java.lang.StringBuilder ) v0 ).append ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
	 (( java.lang.StringBuilder ) v0 ).toString ( ); // invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
	 /* .line 123 */
	 /* new-instance v0, Ljava/lang/StringBuilder; */
	 v1 = com.inneractive.api.ads.InneractiveAdView.TEST_HOST_URL;
	 java.lang.String .valueOf ( v1 );
	 /* invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V */
	 final String v1 = "wvClickUpdate?"; // const-string v1, "wvClickUpdate?"
	 (( java.lang.StringBuilder ) v0 ).append ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
	 (( java.lang.StringBuilder ) v0 ).toString ( ); // invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
	 /* .line 40 */
	 return;
} // .end method
public com.inneractive.api.ads.InneractiveAdView ( ) {
	 /* .locals 2 */
	 /* .param p1, "context" # Landroid/content/Context; */
	 /* .prologue */
	 /* .line 156 */
	 int v0 = 0; // const/4 v0, 0x0
	 int v1 = 0; // const/4 v1, 0x0
	 /* invoke-direct {p0, p1, v0, v1}, Lcom/inneractive/api/ads/InneractiveAdView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V */
	 /* .line 158 */
	 return;
} // .end method
public com.inneractive.api.ads.InneractiveAdView ( ) {
	 /* .locals 1 */
	 /* .param p1, "context" # Landroid/content/Context; */
	 /* .param p2, "attrs" # Landroid/util/AttributeSet; */
	 /* .prologue */
	 /* .line 162 */
	 int v0 = 0; // const/4 v0, 0x0
	 /* invoke-direct {p0, p1, p2, v0}, Lcom/inneractive/api/ads/InneractiveAdView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V */
	 /* .line 163 */
	 return;
} // .end method
public com.inneractive.api.ads.InneractiveAdView ( ) {
	 /* .locals 10 */
	 /* .param p1, "context" # Landroid/content/Context; */
	 /* .param p2, "attrs" # Landroid/util/AttributeSet; */
	 /* .param p3, "defStyle" # I */
	 /* .prologue */
	 /* const/16 v9, 0x12c */
	 /* const/16 v8, 0x1e */
	 int v7 = 2; // const/4 v7, 0x2
	 int v6 = 1; // const/4 v6, 0x1
	 int v5 = 0; // const/4 v5, 0x0
	 /* .line 170 */
	 /* invoke-direct {p0, p1, p2, p3}, Landroid/webkit/WebView;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;I)V */
	 /* .line 47 */
	 final String v3 = ""; // const-string v3, ""
	 this.appID = v3;
	 /* .line 49 */
	 final String v3 = ""; // const-string v3, ""
	 this.distributionID = v3;
	 /* .line 67 */
	 final String v3 = "http://wv.inner-active.mobi/simpleM2M/inneractive-skip"; // const-string v3, "http://wv.inner-active.mobi/simpleM2M/inneractive-skip"
	 this.skipURL = v3;
	 /* .line 68 */
	 final String v3 = "ia://"; // const-string v3, "ia://"
	 this.IA_EVENT_PREFIX = v3;
	 /* .line 69 */
	 final String v3 = "load"; // const-string v3, "load"
	 this.LOAD_EVENT_URL = v3;
	 /* .line 70 */
	 final String v3 = "error"; // const-string v3, "error"
	 this.ERROR_EVENT_URL = v3;
	 /* .line 71 */
	 final String v3 = "expand"; // const-string v3, "expand"
	 this.EXPAND_EVENT_URL = v3;
	 /* .line 72 */
	 final String v3 = "collapse"; // const-string v3, "collapse"
	 this.COLLAPSE_EVENT_URL = v3;
	 /* .line 73 */
	 final String v3 = "click"; // const-string v3, "click"
	 this.CLICK_EVENT_URL = v3;
	 /* .line 74 */
	 final String v3 = "back"; // const-string v3, "back"
	 this.BACK_EVENT_URL = v3;
	 /* .line 75 */
	 final String v3 = ""; // const-string v3, ""
	 this.metaDataStr = v3;
	 /* .line 89 */
	 final String v3 = ""; // const-string v3, ""
	 this.adRequest = v3;
	 /* .line 91 */
	 /* iput v5, p0, Lcom/inneractive/api/ads/InneractiveAdView;->age:I */
	 /* .line 92 */
	 final String v3 = ""; // const-string v3, ""
	 this.gender = v3;
	 /* .line 93 */
	 final String v3 = ""; // const-string v3, ""
	 this.externalID = v3;
	 /* .line 94 */
	 final String v3 = ""; // const-string v3, ""
	 this.msisdn = v3;
	 /* .line 95 */
	 final String v3 = ""; // const-string v3, ""
	 this.keywords = v3;
	 /* .line 96 */
	 /* iput-boolean v5, p0, Lcom/inneractive/api/ads/InneractiveAdView;->testMode:Z */
	 /* .line 138 */
	 final String v3 = "banner_ad"; // const-string v3, "banner_ad"
	 this.bannerAdTypeSTR = v3;
	 /* .line 139 */
	 final String v3 = "text_ad"; // const-string v3, "text_ad"
	 this.textAdTypeSTR = v3;
	 /* .line 140 */
	 final String v3 = "full_screen_ad"; // const-string v3, "full_screen_ad"
	 this.fullAdTypeSTR = v3;
	 /* .line 1159 */
	 /* new-instance v3, Lcom/inneractive/api/ads/InneractiveAdView$1; */
	 /* invoke-direct {v3, p0}, Lcom/inneractive/api/ads/InneractiveAdView$1;-><init>(Lcom/inneractive/api/ads/InneractiveAdView;)V */
	 this.mHandler = v3;
	 /* .line 171 */
	 this.appContext = p1;
	 /* .line 174 */
	 /* invoke-direct {p0}, Lcom/inneractive/api/ads/InneractiveAdView;->getDeviceID()Ljava/lang/String; */
	 this.deviceID = v3;
	 /* .line 175 */
	 /* new-instance v3, Lcom/inneractive/api/ads/InneractiveAdView$IAwebChromeClient; */
	 /* invoke-direct {v3, p0}, Lcom/inneractive/api/ads/InneractiveAdView$IAwebChromeClient;-><init>(Lcom/inneractive/api/ads/InneractiveAdView;)V */
	 this.iaWVCclient = v3;
	 /* .line 176 */
	 /* new-instance v3, Lcom/inneractive/api/ads/InneractiveAdView$IAwebViewClient; */
	 int v4 = 0; // const/4 v4, 0x0
	 /* invoke-direct {v3, p0, v4}, Lcom/inneractive/api/ads/InneractiveAdView$IAwebViewClient;-><init>(Lcom/inneractive/api/ads/InneractiveAdView;Lcom/inneractive/api/ads/InneractiveAdView$IAwebViewClient;)V */
	 this.iaWebClient = v3;
	 /* .line 177 */
	 v3 = this.iaWebClient;
	 v4 = this.mHandler;
	 (( com.inneractive.api.ads.InneractiveAdView$IAwebViewClient ) v3 ).setHandler ( v4 ); // invoke-virtual {v3, v4}, Lcom/inneractive/api/ads/InneractiveAdView$IAwebViewClient;->setHandler(Landroid/os/Handler;)V
	 /* .line 179 */
	 if ( p2 != null) { // if-eqz p2, :cond_5
		 /* .line 181 */
		 /* new-instance v3, Ljava/lang/StringBuilder; */
		 final String v4 = "http://schemas.android.com/apk/res/"; // const-string v4, "http://schemas.android.com/apk/res/"
		 /* invoke-direct {v3, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V */
		 (( android.content.Context ) p1 ).getPackageName ( ); // invoke-virtual {p1}, Landroid/content/Context;->getPackageName()Ljava/lang/String;
		 (( java.lang.StringBuilder ) v3 ).append ( v4 ); // invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
		 (( java.lang.StringBuilder ) v3 ).toString ( ); // invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
		 /* .line 183 */
		 /* .local v1, "namespace":Ljava/lang/String; */
		 final String v3 = "appID"; // const-string v3, "appID"
		 this.appID = v3;
		 /* .line 184 */
		 v3 = this.appID;
		 if ( v3 != null) { // if-eqz v3, :cond_0
			 v3 = this.appID;
			 final String v4 = ""; // const-string v4, ""
			 v3 = 			 (( java.lang.String ) v3 ).equals ( v4 ); // invoke-virtual {v3, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
			 if ( v3 != null) { // if-eqz v3, :cond_1
				 /* .line 185 */
			 } // :cond_0
			 final String v3 = "inneractive"; // const-string v3, "inneractive"
			 final String v4 = "Critical error - your appID is invalid! please add your application ID in your layout XML.for example: app:appID=My_App_ID"; // const-string v4, "Critical error - your appID is invalid! please add your application ID in your layout XML.for example: app:appID=My_App_ID"
			 android.util.Log .e ( v3,v4 );
			 /* .line 187 */
		 } // :cond_1
		 final String v3 = "distID"; // const-string v3, "distID"
		 this.distributionID = v3;
		 /* .line 189 */
		 final String v3 = "adType"; // const-string v3, "adType"
		 /* .line 190 */
		 /* .local v0, "adTypeStr":Ljava/lang/String; */
		 final String v3 = "text_ad"; // const-string v3, "text_ad"
		 v3 = 		 (( java.lang.String ) v0 ).equals ( v3 ); // invoke-virtual {v0, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
		 if ( v3 != null) { // if-eqz v3, :cond_6
			 /* .line 191 */
			 /* iput v6, p0, Lcom/inneractive/api/ads/InneractiveAdView;->adType:I */
			 /* .line 192 */
			 v3 = this.distributionID;
			 /* if-nez v3, :cond_2 */
			 /* .line 193 */
			 final String v3 = "600"; // const-string v3, "600"
			 this.distributionID = v3;
			 /* .line 208 */
		 } // :cond_2
	 } // :goto_0
	 v3 = 	 final String v3 = "refreshInterval"; // const-string v3, "refreshInterval"
	 /* iput v3, p0, Lcom/inneractive/api/ads/InneractiveAdView;->refreshInterval:I */
	 /* .line 210 */
	 /* iget v3, p0, Lcom/inneractive/api/ads/InneractiveAdView;->adType:I */
	 /* if-eq v3, v7, :cond_b */
	 /* .line 211 */
	 /* iget v3, p0, Lcom/inneractive/api/ads/InneractiveAdView;->refreshInterval:I */
	 /* if-gez v3, :cond_8 */
	 /* .line 212 */
	 /* const/16 v3, 0x3c */
	 /* iput v3, p0, Lcom/inneractive/api/ads/InneractiveAdView;->refreshInterval:I */
	 /* .line 226 */
} // :cond_3
} // :goto_1
v3 = final String v3 = "age"; // const-string v3, "age"
/* iput v3, p0, Lcom/inneractive/api/ads/InneractiveAdView;->age:I */
/* .line 227 */
final String v3 = "gender"; // const-string v3, "gender"
this.gender = v3;
/* .line 228 */
final String v3 = "externalID"; // const-string v3, "externalID"
this.externalID = v3;
/* .line 229 */
final String v3 = "msisdn"; // const-string v3, "msisdn"
this.msisdn = v3;
/* .line 230 */
final String v3 = "keywords"; // const-string v3, "keywords"
this.keywords = v3;
/* .line 231 */
v2 = final String v3 = "test"; // const-string v3, "test"
/* .line 232 */
/* .local v2, "test":I */
/* if-ne v2, v6, :cond_4 */
/* .line 233 */
/* iput-boolean v6, p0, Lcom/inneractive/api/ads/InneractiveAdView;->testMode:Z */
/* .line 237 */
} // :cond_4
/* invoke-direct {p0}, Lcom/inneractive/api/ads/InneractiveAdView;->createMetaData()V */
/* .line 238 */
java.lang.System .currentTimeMillis ( );
/* move-result-wide v3 */
/* sput-wide v3, Lcom/inneractive/api/ads/InneractiveAdView;->startGPSTime:J */
/* .line 239 */
v3 = java.util.concurrent.TimeUnit.MILLISECONDS;
/* sget-wide v4, Lcom/inneractive/api/ads/InneractiveAdView;->startGPSTime:J */
(( java.util.concurrent.TimeUnit ) v3 ).toSeconds ( v4, v5 ); // invoke-virtual {v3, v4, v5}, Ljava/util/concurrent/TimeUnit;->toSeconds(J)J
/* move-result-wide v3 */
/* sput-wide v3, Lcom/inneractive/api/ads/InneractiveAdView;->startGPSTimeInSec:J */
/* .line 240 */
com.inneractive.api.ads.InneractiveAdView.isGPSfirstTime = (v6!= 0);
/* .line 243 */
} // .end local v0 # "adTypeStr":Ljava/lang/String;
} // .end local v1 # "namespace":Ljava/lang/String;
} // .end local v2 # "test":I
} // :cond_5
(( com.inneractive.api.ads.InneractiveAdView ) p0 ).displayAd ( p1 ); // invoke-virtual {p0, p1}, Lcom/inneractive/api/ads/InneractiveAdView;->displayAd(Landroid/content/Context;)V
/* .line 244 */
return;
/* .line 196 */
/* .restart local v0 # "adTypeStr":Ljava/lang/String; */
/* .restart local v1 # "namespace":Ljava/lang/String; */
} // :cond_6
final String v3 = "full_screen_ad"; // const-string v3, "full_screen_ad"
v3 = (( java.lang.String ) v0 ).equals ( v3 ); // invoke-virtual {v0, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
if ( v3 != null) { // if-eqz v3, :cond_7
/* .line 197 */
/* iput v7, p0, Lcom/inneractive/api/ads/InneractiveAdView;->adType:I */
/* .line 198 */
v3 = this.distributionID;
/* if-nez v3, :cond_2 */
/* .line 199 */
final String v3 = "559"; // const-string v3, "559"
this.distributionID = v3;
/* .line 203 */
} // :cond_7
/* iput v5, p0, Lcom/inneractive/api/ads/InneractiveAdView;->adType:I */
/* .line 204 */
v3 = this.distributionID;
/* if-nez v3, :cond_2 */
/* .line 205 */
final String v3 = "559"; // const-string v3, "559"
this.distributionID = v3;
/* .line 214 */
} // :cond_8
/* iget v3, p0, Lcom/inneractive/api/ads/InneractiveAdView;->refreshInterval:I */
/* if-ge v3, v8, :cond_9 */
/* iget v3, p0, Lcom/inneractive/api/ads/InneractiveAdView;->refreshInterval:I */
if ( v3 != null) { // if-eqz v3, :cond_9
/* .line 215 */
/* iput v8, p0, Lcom/inneractive/api/ads/InneractiveAdView;->refreshInterval:I */
/* .line 217 */
} // :cond_9
/* iget v3, p0, Lcom/inneractive/api/ads/InneractiveAdView;->refreshInterval:I */
/* if-gt v3, v9, :cond_a */
/* iget v3, p0, Lcom/inneractive/api/ads/InneractiveAdView;->refreshInterval:I */
/* if-nez v3, :cond_3 */
/* .line 218 */
} // :cond_a
/* iput v9, p0, Lcom/inneractive/api/ads/InneractiveAdView;->refreshInterval:I */
/* .line 223 */
} // :cond_b
/* iput v5, p0, Lcom/inneractive/api/ads/InneractiveAdView;->refreshInterval:I */
/* goto/16 :goto_1 */
} // .end method
 com.inneractive.api.ads.InneractiveAdView ( ) {
/* .locals 3 */
/* .param p1, "context" # Landroid/content/Context; */
/* .param p2, "appID" # Ljava/lang/String; */
/* .param p3, "adType" # B */
/* .param p4, "refreshInterval" # I */
/* .prologue */
int v2 = 2; // const/4 v2, 0x2
int v1 = 0; // const/4 v1, 0x0
/* .line 291 */
/* invoke-direct {p0, p1}, Landroid/webkit/WebView;-><init>(Landroid/content/Context;)V */
/* .line 47 */
final String v0 = ""; // const-string v0, ""
this.appID = v0;
/* .line 49 */
final String v0 = ""; // const-string v0, ""
this.distributionID = v0;
/* .line 67 */
final String v0 = "http://wv.inner-active.mobi/simpleM2M/inneractive-skip"; // const-string v0, "http://wv.inner-active.mobi/simpleM2M/inneractive-skip"
this.skipURL = v0;
/* .line 68 */
final String v0 = "ia://"; // const-string v0, "ia://"
this.IA_EVENT_PREFIX = v0;
/* .line 69 */
final String v0 = "load"; // const-string v0, "load"
this.LOAD_EVENT_URL = v0;
/* .line 70 */
final String v0 = "error"; // const-string v0, "error"
this.ERROR_EVENT_URL = v0;
/* .line 71 */
final String v0 = "expand"; // const-string v0, "expand"
this.EXPAND_EVENT_URL = v0;
/* .line 72 */
final String v0 = "collapse"; // const-string v0, "collapse"
this.COLLAPSE_EVENT_URL = v0;
/* .line 73 */
final String v0 = "click"; // const-string v0, "click"
this.CLICK_EVENT_URL = v0;
/* .line 74 */
final String v0 = "back"; // const-string v0, "back"
this.BACK_EVENT_URL = v0;
/* .line 75 */
final String v0 = ""; // const-string v0, ""
this.metaDataStr = v0;
/* .line 89 */
final String v0 = ""; // const-string v0, ""
this.adRequest = v0;
/* .line 91 */
/* iput v1, p0, Lcom/inneractive/api/ads/InneractiveAdView;->age:I */
/* .line 92 */
final String v0 = ""; // const-string v0, ""
this.gender = v0;
/* .line 93 */
final String v0 = ""; // const-string v0, ""
this.externalID = v0;
/* .line 94 */
final String v0 = ""; // const-string v0, ""
this.msisdn = v0;
/* .line 95 */
final String v0 = ""; // const-string v0, ""
this.keywords = v0;
/* .line 96 */
/* iput-boolean v1, p0, Lcom/inneractive/api/ads/InneractiveAdView;->testMode:Z */
/* .line 138 */
final String v0 = "banner_ad"; // const-string v0, "banner_ad"
this.bannerAdTypeSTR = v0;
/* .line 139 */
final String v0 = "text_ad"; // const-string v0, "text_ad"
this.textAdTypeSTR = v0;
/* .line 140 */
final String v0 = "full_screen_ad"; // const-string v0, "full_screen_ad"
this.fullAdTypeSTR = v0;
/* .line 1159 */
/* new-instance v0, Lcom/inneractive/api/ads/InneractiveAdView$1; */
/* invoke-direct {v0, p0}, Lcom/inneractive/api/ads/InneractiveAdView$1;-><init>(Lcom/inneractive/api/ads/InneractiveAdView;)V */
this.mHandler = v0;
/* .line 292 */
this.appContext = p1;
/* .line 295 */
/* invoke-direct {p0}, Lcom/inneractive/api/ads/InneractiveAdView;->getDeviceID()Ljava/lang/String; */
this.deviceID = v0;
/* .line 296 */
/* new-instance v0, Lcom/inneractive/api/ads/InneractiveAdView$IAwebChromeClient; */
/* invoke-direct {v0, p0}, Lcom/inneractive/api/ads/InneractiveAdView$IAwebChromeClient;-><init>(Lcom/inneractive/api/ads/InneractiveAdView;)V */
this.iaWVCclient = v0;
/* .line 297 */
/* new-instance v0, Lcom/inneractive/api/ads/InneractiveAdView$IAwebViewClient; */
int v1 = 0; // const/4 v1, 0x0
/* invoke-direct {v0, p0, v1}, Lcom/inneractive/api/ads/InneractiveAdView$IAwebViewClient;-><init>(Lcom/inneractive/api/ads/InneractiveAdView;Lcom/inneractive/api/ads/InneractiveAdView$IAwebViewClient;)V */
this.iaWebClient = v0;
/* .line 298 */
v0 = this.iaWebClient;
v1 = this.mHandler;
(( com.inneractive.api.ads.InneractiveAdView$IAwebViewClient ) v0 ).setHandler ( v1 ); // invoke-virtual {v0, v1}, Lcom/inneractive/api/ads/InneractiveAdView$IAwebViewClient;->setHandler(Landroid/os/Handler;)V
/* .line 299 */
this.appID = p2;
/* .line 301 */
if ( p2 != null) { // if-eqz p2, :cond_0
final String v0 = ""; // const-string v0, ""
v0 = (( java.lang.String ) p2 ).equals ( v0 ); // invoke-virtual {p2, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
if ( v0 != null) { // if-eqz v0, :cond_1
/* .line 302 */
} // :cond_0
final String v0 = "inneractive"; // const-string v0, "inneractive"
final String v1 = "Critical error - your appID is invalid! please add your application ID"; // const-string v1, "Critical error - your appID is invalid! please add your application ID"
android.util.Log .e ( v0,v1 );
/* .line 305 */
} // :cond_1
/* iput p3, p0, Lcom/inneractive/api/ads/InneractiveAdView;->adType:I */
/* .line 306 */
/* iput p4, p0, Lcom/inneractive/api/ads/InneractiveAdView;->refreshInterval:I */
/* .line 308 */
/* if-eq p3, v2, :cond_3 */
/* const/16 v0, 0x3c */
/* if-ge p4, v0, :cond_3 */
/* .line 309 */
/* const/16 p4, 0x3c */
/* .line 316 */
} // :cond_2
} // :goto_0
java.lang.System .currentTimeMillis ( );
/* move-result-wide v0 */
/* sput-wide v0, Lcom/inneractive/api/ads/InneractiveAdView;->startGPSTime:J */
/* .line 317 */
v0 = java.util.concurrent.TimeUnit.MILLISECONDS;
/* sget-wide v1, Lcom/inneractive/api/ads/InneractiveAdView;->startGPSTime:J */
(( java.util.concurrent.TimeUnit ) v0 ).toSeconds ( v1, v2 ); // invoke-virtual {v0, v1, v2}, Ljava/util/concurrent/TimeUnit;->toSeconds(J)J
/* move-result-wide v0 */
/* sput-wide v0, Lcom/inneractive/api/ads/InneractiveAdView;->startGPSTimeInSec:J */
/* .line 318 */
int v0 = 1; // const/4 v0, 0x1
com.inneractive.api.ads.InneractiveAdView.isGPSfirstTime = (v0!= 0);
/* .line 319 */
(( com.inneractive.api.ads.InneractiveAdView ) p0 ).displayAd ( p1 ); // invoke-virtual {p0, p1}, Lcom/inneractive/api/ads/InneractiveAdView;->displayAd(Landroid/content/Context;)V
/* .line 320 */
return;
/* .line 311 */
} // :cond_3
/* if-ne p3, v2, :cond_2 */
/* .line 312 */
int p4 = 0; // const/4 p4, 0x0
} // .end method
 com.inneractive.api.ads.InneractiveAdView ( ) {
/* .locals 3 */
/* .param p1, "context" # Landroid/content/Context; */
/* .param p2, "appID" # Ljava/lang/String; */
/* .param p3, "adType" # B */
/* .param p4, "refreshInterval" # I */
/* .param p5, "metaData" # Ljava/util/Hashtable; */
/* .prologue */
int v1 = 0; // const/4 v1, 0x0
/* .line 253 */
/* invoke-direct {p0, p1}, Landroid/webkit/WebView;-><init>(Landroid/content/Context;)V */
/* .line 47 */
final String v0 = ""; // const-string v0, ""
this.appID = v0;
/* .line 49 */
final String v0 = ""; // const-string v0, ""
this.distributionID = v0;
/* .line 67 */
final String v0 = "http://wv.inner-active.mobi/simpleM2M/inneractive-skip"; // const-string v0, "http://wv.inner-active.mobi/simpleM2M/inneractive-skip"
this.skipURL = v0;
/* .line 68 */
final String v0 = "ia://"; // const-string v0, "ia://"
this.IA_EVENT_PREFIX = v0;
/* .line 69 */
final String v0 = "load"; // const-string v0, "load"
this.LOAD_EVENT_URL = v0;
/* .line 70 */
final String v0 = "error"; // const-string v0, "error"
this.ERROR_EVENT_URL = v0;
/* .line 71 */
final String v0 = "expand"; // const-string v0, "expand"
this.EXPAND_EVENT_URL = v0;
/* .line 72 */
final String v0 = "collapse"; // const-string v0, "collapse"
this.COLLAPSE_EVENT_URL = v0;
/* .line 73 */
final String v0 = "click"; // const-string v0, "click"
this.CLICK_EVENT_URL = v0;
/* .line 74 */
final String v0 = "back"; // const-string v0, "back"
this.BACK_EVENT_URL = v0;
/* .line 75 */
final String v0 = ""; // const-string v0, ""
this.metaDataStr = v0;
/* .line 89 */
final String v0 = ""; // const-string v0, ""
this.adRequest = v0;
/* .line 91 */
/* iput v1, p0, Lcom/inneractive/api/ads/InneractiveAdView;->age:I */
/* .line 92 */
final String v0 = ""; // const-string v0, ""
this.gender = v0;
/* .line 93 */
final String v0 = ""; // const-string v0, ""
this.externalID = v0;
/* .line 94 */
final String v0 = ""; // const-string v0, ""
this.msisdn = v0;
/* .line 95 */
final String v0 = ""; // const-string v0, ""
this.keywords = v0;
/* .line 96 */
/* iput-boolean v1, p0, Lcom/inneractive/api/ads/InneractiveAdView;->testMode:Z */
/* .line 138 */
final String v0 = "banner_ad"; // const-string v0, "banner_ad"
this.bannerAdTypeSTR = v0;
/* .line 139 */
final String v0 = "text_ad"; // const-string v0, "text_ad"
this.textAdTypeSTR = v0;
/* .line 140 */
final String v0 = "full_screen_ad"; // const-string v0, "full_screen_ad"
this.fullAdTypeSTR = v0;
/* .line 1159 */
/* new-instance v0, Lcom/inneractive/api/ads/InneractiveAdView$1; */
/* invoke-direct {v0, p0}, Lcom/inneractive/api/ads/InneractiveAdView$1;-><init>(Lcom/inneractive/api/ads/InneractiveAdView;)V */
this.mHandler = v0;
/* .line 254 */
this.appContext = p1;
/* .line 257 */
/* invoke-direct {p0}, Lcom/inneractive/api/ads/InneractiveAdView;->getDeviceID()Ljava/lang/String; */
this.deviceID = v0;
/* .line 258 */
/* new-instance v0, Lcom/inneractive/api/ads/InneractiveAdView$IAwebChromeClient; */
/* invoke-direct {v0, p0}, Lcom/inneractive/api/ads/InneractiveAdView$IAwebChromeClient;-><init>(Lcom/inneractive/api/ads/InneractiveAdView;)V */
this.iaWVCclient = v0;
/* .line 259 */
/* new-instance v0, Lcom/inneractive/api/ads/InneractiveAdView$IAwebViewClient; */
int v1 = 0; // const/4 v1, 0x0
/* invoke-direct {v0, p0, v1}, Lcom/inneractive/api/ads/InneractiveAdView$IAwebViewClient;-><init>(Lcom/inneractive/api/ads/InneractiveAdView;Lcom/inneractive/api/ads/InneractiveAdView$IAwebViewClient;)V */
this.iaWebClient = v0;
/* .line 260 */
v0 = this.iaWebClient;
v1 = this.mHandler;
(( com.inneractive.api.ads.InneractiveAdView$IAwebViewClient ) v0 ).setHandler ( v1 ); // invoke-virtual {v0, v1}, Lcom/inneractive/api/ads/InneractiveAdView$IAwebViewClient;->setHandler(Landroid/os/Handler;)V
/* .line 261 */
this.appID = p2;
/* .line 262 */
/* iput p3, p0, Lcom/inneractive/api/ads/InneractiveAdView;->adType:I */
/* .line 263 */
/* iput p4, p0, Lcom/inneractive/api/ads/InneractiveAdView;->refreshInterval:I */
/* .line 265 */
int v0 = 2; // const/4 v0, 0x2
/* if-eq p3, v0, :cond_4 */
/* .line 266 */
/* if-gez p4, :cond_1 */
/* .line 267 */
/* const/16 p4, 0x3c */
/* .line 281 */
} // :cond_0
} // :goto_0
java.lang.System .currentTimeMillis ( );
/* move-result-wide v0 */
/* sput-wide v0, Lcom/inneractive/api/ads/InneractiveAdView;->startGPSTime:J */
/* .line 282 */
v0 = java.util.concurrent.TimeUnit.MILLISECONDS;
/* sget-wide v1, Lcom/inneractive/api/ads/InneractiveAdView;->startGPSTime:J */
(( java.util.concurrent.TimeUnit ) v0 ).toSeconds ( v1, v2 ); // invoke-virtual {v0, v1, v2}, Ljava/util/concurrent/TimeUnit;->toSeconds(J)J
/* move-result-wide v0 */
/* sput-wide v0, Lcom/inneractive/api/ads/InneractiveAdView;->startGPSTimeInSec:J */
/* .line 283 */
int v0 = 1; // const/4 v0, 0x1
com.inneractive.api.ads.InneractiveAdView.isGPSfirstTime = (v0!= 0);
/* .line 284 */
/* invoke-direct {p0, p5}, Lcom/inneractive/api/ads/InneractiveAdView;->initMetaData(Ljava/util/Hashtable;)V */
/* .line 285 */
(( com.inneractive.api.ads.InneractiveAdView ) p0 ).displayAd ( p1 ); // invoke-virtual {p0, p1}, Lcom/inneractive/api/ads/InneractiveAdView;->displayAd(Landroid/content/Context;)V
/* .line 286 */
return;
/* .line 269 */
} // :cond_1
/* const/16 v0, 0x1e */
/* if-ge p4, v0, :cond_2 */
if ( p4 != null) { // if-eqz p4, :cond_2
/* .line 270 */
/* const/16 p4, 0x1e */
/* .line 272 */
} // :cond_2
/* const/16 v0, 0x12c */
/* if-gt p4, v0, :cond_3 */
/* if-nez p4, :cond_0 */
/* .line 273 */
} // :cond_3
/* const/16 p4, 0x12c */
/* .line 278 */
} // :cond_4
int p4 = 0; // const/4 p4, 0x0
} // .end method
static android.view.animation.Animation access$0 ( com.inneractive.api.ads.InneractiveAdView p0 ) { //synthethic
/* .locals 1 */
/* .prologue */
/* .line 43 */
v0 = this.fadeInAnimation;
} // .end method
static void access$1 ( com.inneractive.api.ads.InneractiveAdView p0, android.view.animation.Animation p1 ) { //synthethic
/* .locals 0 */
/* .prologue */
/* .line 1179 */
/* invoke-direct {p0, p1}, Lcom/inneractive/api/ads/InneractiveAdView;->startCustomAnimation(Landroid/view/animation/Animation;)V */
return;
} // .end method
static java.lang.String access$10 ( com.inneractive.api.ads.InneractiveAdView p0 ) { //synthethic
/* .locals 1 */
/* .prologue */
/* .line 47 */
v0 = this.appID;
} // .end method
static java.lang.String access$11 ( ) { //synthethic
/* .locals 1 */
/* .prologue */
/* .line 55 */
v0 = com.inneractive.api.ads.InneractiveAdView.sessionID;
} // .end method
static Boolean access$12 ( com.inneractive.api.ads.InneractiveAdView p0, java.lang.String p1 ) { //synthethic
/* .locals 1 */
/* .prologue */
/* .line 591 */
v0 = /* invoke-direct {p0, p1}, Lcom/inneractive/api/ads/InneractiveAdView;->browse(Ljava/lang/String;)Z */
} // .end method
static Integer access$13 ( com.inneractive.api.ads.InneractiveAdView p0 ) { //synthethic
/* .locals 1 */
/* .prologue */
/* .line 51 */
/* iget v0, p0, Lcom/inneractive/api/ads/InneractiveAdView;->adType:I */
} // .end method
static Integer access$14 ( com.inneractive.api.ads.InneractiveAdView p0 ) { //synthethic
/* .locals 1 */
/* .prologue */
/* .line 90 */
/* iget v0, p0, Lcom/inneractive/api/ads/InneractiveAdView;->refreshInterval:I */
} // .end method
static java.lang.String access$15 ( com.inneractive.api.ads.InneractiveAdView p0 ) { //synthethic
/* .locals 1 */
/* .prologue */
/* .line 89 */
v0 = this.adRequest;
} // .end method
static java.lang.String access$16 ( ) { //synthethic
/* .locals 1 */
/* .prologue */
/* .line 87 */
v0 = com.inneractive.api.ads.InneractiveAdView.userAgent;
} // .end method
static android.os.Handler access$17 ( com.inneractive.api.ads.InneractiveAdView p0 ) { //synthethic
/* .locals 1 */
/* .prologue */
/* .line 1159 */
v0 = this.mHandler;
} // .end method
static android.location.Location access$18 ( ) { //synthethic
/* .locals 1 */
/* .prologue */
/* .line 82 */
v0 = com.inneractive.api.ads.InneractiveAdView.coordinates;
} // .end method
static void access$19 ( android.location.Location p0 ) { //synthethic
/* .locals 0 */
/* .prologue */
/* .line 82 */
return;
} // .end method
static android.view.animation.Animation access$2 ( com.inneractive.api.ads.InneractiveAdView p0 ) { //synthethic
/* .locals 1 */
/* .prologue */
/* .line 42 */
v0 = this.fadeOutAnimation;
} // .end method
static void access$3 ( java.lang.String p0 ) { //synthethic
/* .locals 0 */
/* .prologue */
/* .line 56 */
return;
} // .end method
static void access$4 ( java.lang.String p0 ) { //synthethic
/* .locals 0 */
/* .prologue */
/* .line 55 */
return;
} // .end method
static void access$5 ( java.lang.String p0 ) { //synthethic
/* .locals 0 */
/* .prologue */
/* .line 57 */
return;
} // .end method
static java.lang.String access$6 ( ) { //synthethic
/* .locals 1 */
/* .prologue */
/* .line 57 */
v0 = com.inneractive.api.ads.InneractiveAdView.errorCode;
} // .end method
static com.inneractive.api.ads.InneractiveAdEventsListener access$7 ( com.inneractive.api.ads.InneractiveAdView p0 ) { //synthethic
/* .locals 1 */
/* .prologue */
/* .line 142 */
v0 = this.listener;
} // .end method
static java.lang.String access$8 ( ) { //synthethic
/* .locals 1 */
/* .prologue */
/* .line 56 */
v0 = com.inneractive.api.ads.InneractiveAdView.clientID;
} // .end method
static Boolean access$9 ( com.inneractive.api.ads.InneractiveAdView p0 ) { //synthethic
/* .locals 1 */
/* .prologue */
/* .line 96 */
/* iget-boolean v0, p0, Lcom/inneractive/api/ads/InneractiveAdView;->testMode:Z */
} // .end method
private Boolean browse ( java.lang.String p0 ) {
/* .locals 4 */
/* .param p1, "destURL" # Ljava/lang/String; */
/* .prologue */
/* .line 593 */
try { // :try_start_0
/* new-instance v1, Landroid/content/Intent; */
final String v2 = "android.intent.action.VIEW"; // const-string v2, "android.intent.action.VIEW"
android.net.Uri .parse ( p1 );
/* invoke-direct {v1, v2, v3}, Landroid/content/Intent;-><init>(Ljava/lang/String;Landroid/net/Uri;)V */
/* .line 594 */
/* .local v1, "intent":Landroid/content/Intent; */
/* const/high16 v2, 0x10000000 */
(( android.content.Intent ) v1 ).setFlags ( v2 ); // invoke-virtual {v1, v2}, Landroid/content/Intent;->setFlags(I)Landroid/content/Intent;
/* .line 595 */
v2 = this.appContext;
(( android.content.Context ) v2 ).startActivity ( v1 ); // invoke-virtual {v2, v1}, Landroid/content/Context;->startActivity(Landroid/content/Intent;)V
/* :try_end_0 */
/* .catch Ljava/lang/Exception; {:try_start_0 ..:try_end_0} :catch_0 */
/* .line 596 */
int v2 = 1; // const/4 v2, 0x1
/* .line 598 */
} // .end local v1 # "intent":Landroid/content/Intent;
} // :goto_0
/* .line 597 */
/* :catch_0 */
/* move-exception v0 */
/* .line 598 */
/* .local v0, "e":Ljava/lang/Exception; */
int v2 = 0; // const/4 v2, 0x0
} // .end method
private void createMetaData ( ) {
/* .locals 4 */
/* .prologue */
/* .line 407 */
v1 = this.metaDataStr;
if ( v1 != null) { // if-eqz v1, :cond_5
v1 = this.metaDataStr;
final String v2 = ""; // const-string v2, ""
v1 = (( java.lang.String ) v1 ).equals ( v2 ); // invoke-virtual {v1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
if ( v1 != null) { // if-eqz v1, :cond_5
/* .line 408 */
/* iget v1, p0, Lcom/inneractive/api/ads/InneractiveAdView;->age:I */
/* const/16 v2, 0x78 */
/* if-ge v1, v2, :cond_0 */
/* iget v1, p0, Lcom/inneractive/api/ads/InneractiveAdView;->age:I */
int v2 = 1; // const/4 v2, 0x1
/* if-le v1, v2, :cond_0 */
/* .line 409 */
v1 = this.metaDataStr;
/* new-instance v2, Ljava/lang/StringBuilder; */
java.lang.String .valueOf ( v1 );
/* invoke-direct {v2, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V */
final String v1 = "&a="; // const-string v1, "&a="
(( java.lang.StringBuilder ) v2 ).append ( v1 ); // invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v1 ).toString ( ); // invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
this.metaDataStr = v1;
/* .line 410 */
v1 = this.metaDataStr;
/* new-instance v2, Ljava/lang/StringBuilder; */
java.lang.String .valueOf ( v1 );
/* invoke-direct {v2, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V */
/* iget v1, p0, Lcom/inneractive/api/ads/InneractiveAdView;->age:I */
(( java.lang.StringBuilder ) v2 ).append ( v1 ); // invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v1 ).toString ( ); // invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
this.metaDataStr = v1;
/* .line 413 */
} // :cond_0
v1 = this.externalID;
if ( v1 != null) { // if-eqz v1, :cond_1
v1 = this.externalID;
final String v2 = ""; // const-string v2, ""
v1 = (( java.lang.String ) v1 ).equals ( v2 ); // invoke-virtual {v1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
/* if-nez v1, :cond_1 */
/* .line 414 */
v1 = this.metaDataStr;
/* new-instance v2, Ljava/lang/StringBuilder; */
java.lang.String .valueOf ( v1 );
/* invoke-direct {v2, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V */
final String v1 = "&eid="; // const-string v1, "&eid="
(( java.lang.StringBuilder ) v2 ).append ( v1 ); // invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
v2 = this.externalID;
(( java.lang.StringBuilder ) v1 ).append ( v2 ); // invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v1 ).toString ( ); // invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
this.metaDataStr = v1;
/* .line 416 */
} // :cond_1
v1 = this.gender;
if ( v1 != null) { // if-eqz v1, :cond_3
v1 = this.gender;
final String v2 = ""; // const-string v2, ""
v1 = (( java.lang.String ) v1 ).equals ( v2 ); // invoke-virtual {v1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
/* if-nez v1, :cond_3 */
/* .line 417 */
v1 = this.gender;
final String v2 = "f"; // const-string v2, "f"
v1 = (( java.lang.String ) v1 ).equals ( v2 ); // invoke-virtual {v1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
/* if-nez v1, :cond_2 */
v1 = this.gender;
final String v2 = "female"; // const-string v2, "female"
v1 = (( java.lang.String ) v1 ).equals ( v2 ); // invoke-virtual {v1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
/* if-nez v1, :cond_2 */
v1 = this.gender;
final String v2 = "m"; // const-string v2, "m"
v1 = (( java.lang.String ) v1 ).equals ( v2 ); // invoke-virtual {v1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
/* if-nez v1, :cond_2 */
v1 = this.gender;
final String v2 = "male"; // const-string v2, "male"
v1 = (( java.lang.String ) v1 ).equals ( v2 ); // invoke-virtual {v1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
/* if-nez v1, :cond_2 */
v1 = this.gender;
final String v2 = "F"; // const-string v2, "F"
v1 = (( java.lang.String ) v1 ).equals ( v2 ); // invoke-virtual {v1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
/* if-nez v1, :cond_2 */
v1 = this.gender;
final String v2 = "Female"; // const-string v2, "Female"
v1 = (( java.lang.String ) v1 ).equals ( v2 ); // invoke-virtual {v1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
/* if-nez v1, :cond_2 */
v1 = this.gender;
final String v2 = "M"; // const-string v2, "M"
v1 = (( java.lang.String ) v1 ).equals ( v2 ); // invoke-virtual {v1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
/* if-nez v1, :cond_2 */
v1 = this.gender;
final String v2 = "Male"; // const-string v2, "Male"
v1 = (( java.lang.String ) v1 ).equals ( v2 ); // invoke-virtual {v1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
if ( v1 != null) { // if-eqz v1, :cond_3
/* .line 418 */
} // :cond_2
v1 = this.metaDataStr;
/* new-instance v2, Ljava/lang/StringBuilder; */
java.lang.String .valueOf ( v1 );
/* invoke-direct {v2, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V */
final String v1 = "&g="; // const-string v1, "&g="
(( java.lang.StringBuilder ) v2 ).append ( v1 ); // invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
v2 = this.gender;
(( java.lang.StringBuilder ) v1 ).append ( v2 ); // invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v1 ).toString ( ); // invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
this.metaDataStr = v1;
/* .line 422 */
} // :cond_3
v1 = this.keywords;
if ( v1 != null) { // if-eqz v1, :cond_4
v1 = this.keywords;
final String v2 = ""; // const-string v2, ""
v1 = (( java.lang.String ) v1 ).equals ( v2 ); // invoke-virtual {v1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
/* if-nez v1, :cond_4 */
/* .line 423 */
v1 = this.keywords;
final String v2 = " "; // const-string v2, " "
final String v3 = ""; // const-string v3, ""
(( java.lang.String ) v1 ).replace ( v2, v3 ); // invoke-virtual {v1, v2, v3}, Ljava/lang/String;->replace(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Ljava/lang/String;
/* .line 424 */
/* .local v0, "keywordsWOspaces":Ljava/lang/String; */
v1 = this.metaDataStr;
/* new-instance v2, Ljava/lang/StringBuilder; */
java.lang.String .valueOf ( v1 );
/* invoke-direct {v2, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V */
final String v1 = "&k="; // const-string v1, "&k="
(( java.lang.StringBuilder ) v2 ).append ( v1 ); // invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v1 ).append ( v0 ); // invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v1 ).toString ( ); // invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
this.metaDataStr = v1;
/* .line 426 */
} // .end local v0 # "keywordsWOspaces":Ljava/lang/String;
} // :cond_4
v1 = this.msisdn;
if ( v1 != null) { // if-eqz v1, :cond_5
v1 = this.msisdn;
final String v2 = ""; // const-string v2, ""
v1 = (( java.lang.String ) v1 ).equals ( v2 ); // invoke-virtual {v1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
/* if-nez v1, :cond_5 */
/* .line 427 */
v1 = this.metaDataStr;
/* new-instance v2, Ljava/lang/StringBuilder; */
java.lang.String .valueOf ( v1 );
/* invoke-direct {v2, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V */
final String v1 = "&mn="; // const-string v1, "&mn="
(( java.lang.StringBuilder ) v2 ).append ( v1 ); // invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
v2 = this.msisdn;
(( java.lang.StringBuilder ) v1 ).append ( v2 ); // invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v1 ).toString ( ); // invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
this.metaDataStr = v1;
/* .line 431 */
} // :cond_5
return;
} // .end method
public static android.location.Location getCoordinates ( android.content.Context p0 ) {
/* .locals 13 */
/* .param p0, "context" # Landroid/content/Context; */
/* .prologue */
/* .line 740 */
v3 = com.inneractive.api.ads.InneractiveAdView.coordinates;
/* if-nez v3, :cond_2 */
if ( p0 != null) { // if-eqz p0, :cond_2
/* .line 742 */
/* monitor-enter p0 */
/* .line 744 */
int v12 = 0; // const/4 v12, 0x0
/* .line 745 */
/* .local v12, "permissions":Z */
int v1 = 0; // const/4 v1, 0x0
/* .line 746 */
/* .local v1, "manager":Landroid/location/LocationManager; */
int v2 = 0; // const/4 v2, 0x0
/* .line 749 */
/* .local v2, "provider":Ljava/lang/String; */
try { // :try_start_0
final String v3 = "android.permission.ACCESS_COARSE_LOCATION"; // const-string v3, "android.permission.ACCESS_COARSE_LOCATION"
v3 = (( android.content.Context ) p0 ).checkCallingOrSelfPermission ( v3 ); // invoke-virtual {p0, v3}, Landroid/content/Context;->checkCallingOrSelfPermission(Ljava/lang/String;)I
/* if-nez v3, :cond_0 */
/* .line 751 */
final String v3 = "inneractive"; // const-string v3, "inneractive"
final String v4 = "Trying to get locations from the network."; // const-string v4, "Trying to get locations from the network."
android.util.Log .d ( v3,v4 );
/* .line 753 */
int v12 = 1; // const/4 v12, 0x1
/* .line 754 */
final String v3 = "location"; // const-string v3, "location"
(( android.content.Context ) p0 ).getSystemService ( v3 ); // invoke-virtual {p0, v3}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;
/* move-object v0, v3 */
/* check-cast v0, Landroid/location/LocationManager; */
/* move-object v1, v0 */
/* .line 756 */
if ( v1 != null) { // if-eqz v1, :cond_0
/* .line 758 */
/* new-instance v8, Landroid/location/Criteria; */
/* invoke-direct {v8}, Landroid/location/Criteria;-><init>()V */
/* .line 759 */
/* .local v8, "criteria":Landroid/location/Criteria; */
int v3 = 2; // const/4 v3, 0x2
(( android.location.Criteria ) v8 ).setAccuracy ( v3 ); // invoke-virtual {v8, v3}, Landroid/location/Criteria;->setAccuracy(I)V
/* .line 760 */
int v3 = 0; // const/4 v3, 0x0
(( android.location.Criteria ) v8 ).setCostAllowed ( v3 ); // invoke-virtual {v8, v3}, Landroid/location/Criteria;->setCostAllowed(Z)V
/* .line 761 */
int v3 = 1; // const/4 v3, 0x1
(( android.location.LocationManager ) v1 ).getBestProvider ( v8, v3 ); // invoke-virtual {v1, v8, v3}, Landroid/location/LocationManager;->getBestProvider(Landroid/location/Criteria;Z)Ljava/lang/String;
/* .line 766 */
} // .end local v8 # "criteria":Landroid/location/Criteria;
} // :cond_0
/* if-nez v2, :cond_1 */
/* .line 768 */
final String v3 = "android.permission.ACCESS_FINE_LOCATION"; // const-string v3, "android.permission.ACCESS_FINE_LOCATION"
v3 = (( android.content.Context ) p0 ).checkCallingOrSelfPermission ( v3 ); // invoke-virtual {p0, v3}, Landroid/content/Context;->checkCallingOrSelfPermission(Ljava/lang/String;)I
/* if-nez v3, :cond_1 */
/* .line 770 */
final String v3 = "inneractive"; // const-string v3, "inneractive"
final String v4 = "Trying to get locations from GPS."; // const-string v4, "Trying to get locations from GPS."
android.util.Log .d ( v3,v4 );
/* .line 772 */
int v12 = 1; // const/4 v12, 0x1
/* .line 773 */
final String v3 = "location"; // const-string v3, "location"
(( android.content.Context ) p0 ).getSystemService ( v3 ); // invoke-virtual {p0, v3}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;
/* move-object v0, v3 */
/* check-cast v0, Landroid/location/LocationManager; */
/* move-object v1, v0 */
/* .line 775 */
if ( v1 != null) { // if-eqz v1, :cond_1
/* .line 777 */
/* new-instance v8, Landroid/location/Criteria; */
/* invoke-direct {v8}, Landroid/location/Criteria;-><init>()V */
/* .line 778 */
/* .restart local v8 # "criteria":Landroid/location/Criteria; */
int v3 = 1; // const/4 v3, 0x1
(( android.location.Criteria ) v8 ).setAccuracy ( v3 ); // invoke-virtual {v8, v3}, Landroid/location/Criteria;->setAccuracy(I)V
/* .line 779 */
int v3 = 0; // const/4 v3, 0x0
(( android.location.Criteria ) v8 ).setCostAllowed ( v3 ); // invoke-virtual {v8, v3}, Landroid/location/Criteria;->setCostAllowed(Z)V
/* .line 780 */
int v3 = 1; // const/4 v3, 0x1
(( android.location.LocationManager ) v1 ).getBestProvider ( v8, v3 ); // invoke-virtual {v1, v8, v3}, Landroid/location/LocationManager;->getBestProvider(Landroid/location/Criteria;Z)Ljava/lang/String;
/* .line 786 */
} // .end local v8 # "criteria":Landroid/location/Criteria;
} // :cond_1
/* if-nez v12, :cond_3 */
/* .line 788 */
final String v3 = "inneractive"; // const-string v3, "inneractive"
final String v4 = "Cannot access user\'s location.To improve your revenue open manifest.xml and just before the final </manifest> tag add: <uses-permission android:name=\"android.permission.ACCESS_COURSE_LOCATION\" />"; // const-string v4, "Cannot access user\'s location.To improve your revenue open manifest.xml and just before the final </manifest> tag add: <uses-permission android:name=\"android.permission.ACCESS_COURSE_LOCATION\" />"
android.util.Log .w ( v3,v4 );
/* .line 742 */
} // :goto_0
/* monitor-exit p0 */
/* :try_end_0 */
/* .catchall {:try_start_0 ..:try_end_0} :catchall_0 */
/* .line 832 */
} // .end local v1 # "manager":Landroid/location/LocationManager;
} // .end local v2 # "provider":Ljava/lang/String;
} // .end local v12 # "permissions":Z
} // :cond_2
v3 = com.inneractive.api.ads.InneractiveAdView.coordinates;
/* .line 790 */
/* .restart local v1 # "manager":Landroid/location/LocationManager; */
/* .restart local v2 # "provider":Ljava/lang/String; */
/* .restart local v12 # "permissions":Z */
} // :cond_3
/* if-nez v2, :cond_4 */
/* .line 792 */
try { // :try_start_1
final String v3 = "inneractive"; // const-string v3, "inneractive"
final String v4 = "No location providers are available.Ads will not be geotargeted."; // const-string v4, "No location providers are available.Ads will not be geotargeted."
android.util.Log .d ( v3,v4 );
/* .line 742 */
/* :catchall_0 */
/* move-exception v3 */
/* monitor-exit p0 */
/* :try_end_1 */
/* .catchall {:try_start_1 ..:try_end_1} :catchall_0 */
/* throw v3 */
/* .line 796 */
} // :cond_4
try { // :try_start_2
final String v3 = "inneractive"; // const-string v3, "inneractive"
final String v4 = "Location provider setup successfully."; // const-string v4, "Location provider setup successfully."
android.util.Log .i ( v3,v4 );
/* .line 798 */
(( android.location.LocationManager ) v1 ).getLastKnownLocation ( v2 ); // invoke-virtual {v1, v2}, Landroid/location/LocationManager;->getLastKnownLocation(Ljava/lang/String;)Landroid/location/Location;
/* .line 801 */
/* const-wide/32 v10, 0xdbba0 */
/* .line 802 */
/* .local v10, "minTime":J */
/* const/high16 v9, 0x43480000 # 200.0f */
/* .line 804 */
/* .local v9, "minDistance":F */
/* const-wide/32 v3, 0xdbba0 */
/* const/high16 v5, 0x43480000 # 200.0f */
/* new-instance v6, Lcom/inneractive/api/ads/InneractiveAdView$3; */
/* invoke-direct {v6}, Lcom/inneractive/api/ads/InneractiveAdView$3;-><init>()V */
/* .line 827 */
(( android.content.Context ) p0 ).getMainLooper ( ); // invoke-virtual {p0}, Landroid/content/Context;->getMainLooper()Landroid/os/Looper;
/* .line 804 */
/* invoke-virtual/range {v1 ..v7}, Landroid/location/LocationManager;->requestLocationUpdates(Ljava/lang/String;JFLandroid/location/LocationListener;Landroid/os/Looper;)V */
/* :try_end_2 */
/* .catchall {:try_start_2 ..:try_end_2} :catchall_0 */
} // .end method
static java.lang.String getCoordinatesAsString ( android.content.Context p0 ) {
/* .locals 5 */
/* .param p0, "context" # Landroid/content/Context; */
/* .prologue */
/* .line 844 */
int v1 = 0; // const/4 v1, 0x0
/* .line 845 */
/* .local v1, "result":Ljava/lang/String; */
com.inneractive.api.ads.InneractiveAdView .getCoordinates ( p0 );
/* .line 847 */
/* .local v0, "l":Landroid/location/Location; */
if ( v0 != null) { // if-eqz v0, :cond_0
/* .line 849 */
/* new-instance v2, Ljava/lang/StringBuilder; */
(( android.location.Location ) v0 ).getLatitude ( ); // invoke-virtual {v0}, Landroid/location/Location;->getLatitude()D
/* move-result-wide v3 */
java.lang.String .valueOf ( v3,v4 );
/* invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V */
final String v3 = ","; // const-string v3, ","
(( java.lang.StringBuilder ) v2 ).append ( v3 ); // invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( android.location.Location ) v0 ).getLongitude ( ); // invoke-virtual {v0}, Landroid/location/Location;->getLongitude()D
/* move-result-wide v3 */
(( java.lang.StringBuilder ) v2 ).append ( v3, v4 ); // invoke-virtual {v2, v3, v4}, Ljava/lang/StringBuilder;->append(D)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v2 ).toString ( ); // invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
/* .line 852 */
} // :cond_0
final String v2 = "inneractive"; // const-string v2, "inneractive"
int v3 = 3; // const/4 v3, 0x3
v2 = android.util.Log .isLoggable ( v2,v3 );
if ( v2 != null) { // if-eqz v2, :cond_1
/* .line 854 */
final String v2 = "inneractive"; // const-string v2, "inneractive"
/* new-instance v3, Ljava/lang/StringBuilder; */
final String v4 = "User coordinates are "; // const-string v4, "User coordinates are "
/* invoke-direct {v3, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V */
(( java.lang.StringBuilder ) v3 ).append ( v1 ); // invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v3 ).toString ( ); // invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
android.util.Log .d ( v2,v3 );
/* .line 857 */
} // :cond_1
} // .end method
protected static getData ( java.net.HttpURLConnection p0 ) {
/* .locals 6 */
/* .param p0, "httpConnection" # Ljava/net/HttpURLConnection; */
/* .annotation system Ldalvik/annotation/Throws; */
/* value = { */
/* Ljava/io/IOException; */
/* } */
} // .end annotation
/* .prologue */
/* .line 1099 */
int v4 = 0; // const/4 v4, 0x0
/* .line 1100 */
/* .local v4, "in":Ljava/io/InputStream; */
int v2 = 0; // const/4 v2, 0x0
/* check-cast v2, [B */
/* .line 1102 */
/* .local v2, "buffer":[B */
try { // :try_start_0
(( java.net.HttpURLConnection ) p0 ).getInputStream ( ); // invoke-virtual {p0}, Ljava/net/HttpURLConnection;->getInputStream()Ljava/io/InputStream;
/* .line 1106 */
v3 = (( java.net.HttpURLConnection ) p0 ).getContentLength ( ); // invoke-virtual {p0}, Ljava/net/HttpURLConnection;->getContentLength()I
/* .line 1108 */
/* .local v3, "contentLength":I */
/* if-lez v3, :cond_2 */
/* .line 1109 */
/* new-array v2, v3, [B */
/* .line 1110 */
(( java.io.InputStream ) v4 ).read ( v2 ); // invoke-virtual {v4, v2}, Ljava/io/InputStream;->read([B)I
/* :try_end_0 */
/* .catchall {:try_start_0 ..:try_end_0} :catchall_0 */
/* .line 1129 */
} // :cond_0
} // :goto_0
if ( v4 != null) { // if-eqz v4, :cond_1
/* .line 1130 */
(( java.io.InputStream ) v4 ).close ( ); // invoke-virtual {v4}, Ljava/io/InputStream;->close()V
/* .line 1134 */
} // :cond_1
/* .line 1113 */
} // :cond_2
int v0 = 0; // const/4 v0, 0x0
/* .line 1115 */
/* .local v0, "bos":Ljava/io/ByteArrayOutputStream; */
try { // :try_start_1
/* new-instance v1, Ljava/io/ByteArrayOutputStream; */
/* invoke-direct {v1}, Ljava/io/ByteArrayOutputStream;-><init>()V */
/* :try_end_1 */
/* .catchall {:try_start_1 ..:try_end_1} :catchall_2 */
/* .line 1116 */
} // .end local v0 # "bos":Ljava/io/ByteArrayOutputStream;
/* .local v1, "bos":Ljava/io/ByteArrayOutputStream; */
} // :goto_1
try { // :try_start_2
v5 = (( java.io.InputStream ) v4 ).available ( ); // invoke-virtual {v4}, Ljava/io/InputStream;->available()I
/* if-gtz v5, :cond_4 */
/* .line 1119 */
(( java.io.ByteArrayOutputStream ) v1 ).toByteArray ( ); // invoke-virtual {v1}, Ljava/io/ByteArrayOutputStream;->toByteArray()[B
/* :try_end_2 */
/* .catchall {:try_start_2 ..:try_end_2} :catchall_1 */
/* .line 1122 */
if ( v1 != null) { // if-eqz v1, :cond_0
/* .line 1123 */
try { // :try_start_3
(( java.io.ByteArrayOutputStream ) v1 ).close ( ); // invoke-virtual {v1}, Ljava/io/ByteArrayOutputStream;->close()V
/* :try_end_3 */
/* .catchall {:try_start_3 ..:try_end_3} :catchall_0 */
/* .line 1128 */
} // .end local v1 # "bos":Ljava/io/ByteArrayOutputStream;
} // .end local v3 # "contentLength":I
/* :catchall_0 */
/* move-exception v5 */
/* .line 1129 */
if ( v4 != null) { // if-eqz v4, :cond_3
/* .line 1130 */
(( java.io.InputStream ) v4 ).close ( ); // invoke-virtual {v4}, Ljava/io/InputStream;->close()V
/* .line 1132 */
} // :cond_3
/* throw v5 */
/* .line 1117 */
/* .restart local v1 # "bos":Ljava/io/ByteArrayOutputStream; */
/* .restart local v3 # "contentLength":I */
} // :cond_4
try { // :try_start_4
v5 = (( java.io.InputStream ) v4 ).read ( ); // invoke-virtual {v4}, Ljava/io/InputStream;->read()I
(( java.io.ByteArrayOutputStream ) v1 ).write ( v5 ); // invoke-virtual {v1, v5}, Ljava/io/ByteArrayOutputStream;->write(I)V
/* :try_end_4 */
/* .catchall {:try_start_4 ..:try_end_4} :catchall_1 */
/* .line 1121 */
/* :catchall_1 */
/* move-exception v5 */
/* move-object v0, v1 */
/* .line 1122 */
} // .end local v1 # "bos":Ljava/io/ByteArrayOutputStream;
/* .restart local v0 # "bos":Ljava/io/ByteArrayOutputStream; */
} // :goto_2
if ( v0 != null) { // if-eqz v0, :cond_5
/* .line 1123 */
try { // :try_start_5
(( java.io.ByteArrayOutputStream ) v0 ).close ( ); // invoke-virtual {v0}, Ljava/io/ByteArrayOutputStream;->close()V
/* .line 1125 */
} // :cond_5
/* throw v5 */
/* :try_end_5 */
/* .catchall {:try_start_5 ..:try_end_5} :catchall_0 */
/* .line 1121 */
/* :catchall_2 */
/* move-exception v5 */
} // .end method
private java.lang.String getDeviceID ( ) {
/* .locals 4 */
/* .prologue */
/* .line 863 */
v1 = this.appContext;
final String v2 = "android.permission.READ_PHONE_STATE"; // const-string v2, "android.permission.READ_PHONE_STATE"
v1 = (( android.content.Context ) v1 ).checkCallingOrSelfPermission ( v2 ); // invoke-virtual {v1, v2}, Landroid/content/Context;->checkCallingOrSelfPermission(Ljava/lang/String;)I
int v2 = -1; // const/4 v2, -0x1
/* if-ne v1, v2, :cond_0 */
/* .line 865 */
final String v1 = "innerActive"; // const-string v1, "innerActive"
final String v2 = "Cannot get device ID (IMEI) without READ_PHONE_STATE permissions! Open manifest.xml and just before the final </manifest> tag add: <uses-permission android:name=\"android.permission.READ_PHONE_STATE\" />"; // const-string v2, "Cannot get device ID (IMEI) without READ_PHONE_STATE permissions! Open manifest.xml and just before the final </manifest> tag add: <uses-permission android:name=\"android.permission.READ_PHONE_STATE\" />"
android.util.Log .w ( v1,v2 );
/* .line 874 */
} // :goto_0
v1 = this.deviceID;
/* .line 870 */
} // :cond_0
v1 = this.appContext;
final String v2 = "phone"; // const-string v2, "phone"
(( android.content.Context ) v1 ).getSystemService ( v2 ); // invoke-virtual {v1, v2}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;
/* check-cast v0, Landroid/telephony/TelephonyManager; */
/* .line 871 */
/* .local v0, "tm":Landroid/telephony/TelephonyManager; */
(( android.telephony.TelephonyManager ) v0 ).getDeviceId ( ); // invoke-virtual {v0}, Landroid/telephony/TelephonyManager;->getDeviceId()Ljava/lang/String;
this.deviceID = v1;
/* .line 872 */
final String v1 = "inneractive"; // const-string v1, "inneractive"
/* new-instance v2, Ljava/lang/StringBuilder; */
final String v3 = "device ID = "; // const-string v3, "device ID = "
/* invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V */
v3 = this.deviceID;
(( java.lang.StringBuilder ) v2 ).append ( v3 ); // invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v2 ).toString ( ); // invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
android.util.Log .i ( v1,v2 );
} // .end method
private void getScreenHeight ( ) {
/* .locals 3 */
/* .prologue */
/* .line 333 */
v1 = this.appContext;
final String v2 = "window"; // const-string v2, "window"
(( android.content.Context ) v1 ).getSystemService ( v2 ); // invoke-virtual {v1, v2}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;
/* check-cast v1, Landroid/view/WindowManager; */
/* .line 334 */
/* .local v0, "display":Landroid/view/Display; */
v1 = (( android.view.Display ) v0 ).getHeight ( ); // invoke-virtual {v0}, Landroid/view/Display;->getHeight()I
/* iput v1, p0, Lcom/inneractive/api/ads/InneractiveAdView;->screenHeight:I */
/* .line 335 */
return;
} // .end method
private void getScreenWidth ( ) {
/* .locals 3 */
/* .prologue */
/* .line 327 */
v1 = this.appContext;
final String v2 = "window"; // const-string v2, "window"
(( android.content.Context ) v1 ).getSystemService ( v2 ); // invoke-virtual {v1, v2}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;
/* check-cast v1, Landroid/view/WindowManager; */
/* .line 328 */
/* .local v0, "display":Landroid/view/Display; */
v1 = (( android.view.Display ) v0 ).getWidth ( ); // invoke-virtual {v0}, Landroid/view/Display;->getWidth()I
/* iput v1, p0, Lcom/inneractive/api/ads/InneractiveAdView;->screenWidth:I */
/* .line 330 */
return;
} // .end method
static synchronized java.lang.String httpGetRaw ( java.lang.String p0 ) {
/* .locals 15 */
/* .param p0, "ipUrl" # Ljava/lang/String; */
/* .annotation system Ldalvik/annotation/Throws; */
/* value = { */
/* Ljava/lang/Exception; */
/* } */
} // .end annotation
/* .prologue */
/* .line 995 */
/* const-class v12, Lcom/inneractive/api/ads/InneractiveAdView; */
/* monitor-enter v12 */
int v5 = 0; // const/4 v5, 0x0
/* .line 996 */
/* .local v5, "httpConnection":Ljava/net/HttpURLConnection; */
int v6 = 0; // const/4 v6, 0x0
/* .line 997 */
/* .local v6, "inputStream":Ljava/io/InputStream; */
int v7 = 0; // const/4 v7, 0x0
/* .line 1000 */
/* .local v7, "out":Ljava/io/OutputStream; */
try { // :try_start_0
final String v4 = ""; // const-string v4, ""
/* .line 1001 */
/* .local v4, "data":Ljava/lang/String; */
final String v2 = ""; // const-string v2, ""
/* .line 1002 */
/* .local v2, "contentEncoding":Ljava/lang/String; */
final String v3 = ""; // const-string v3, ""
/* .line 1004 */
/* .local v3, "contentType":Ljava/lang/String; */
/* new-instance v10, Ljava/net/URL; */
/* invoke-direct {v10, p0}, Ljava/net/URL;-><init>(Ljava/lang/String;)V */
/* .line 1005 */
/* .local v10, "url":Ljava/net/URL; */
(( java.net.URL ) v10 ).openConnection ( ); // invoke-virtual {v10}, Ljava/net/URL;->openConnection()Ljava/net/URLConnection;
/* move-object v0, v11 */
/* check-cast v0, Ljava/net/HttpURLConnection; */
/* move-object v5, v0 */
/* .line 1008 */
final String v11 = "GET"; // const-string v11, "GET"
(( java.net.HttpURLConnection ) v5 ).setRequestMethod ( v11 ); // invoke-virtual {v5, v11}, Ljava/net/HttpURLConnection;->setRequestMethod(Ljava/lang/String;)V
/* .line 1009 */
final String v11 = "User-Agent"; // const-string v11, "User-Agent"
v13 = com.inneractive.api.ads.InneractiveAdView.userAgent;
(( java.net.HttpURLConnection ) v5 ).setRequestProperty ( v11, v13 ); // invoke-virtual {v5, v11, v13}, Ljava/net/HttpURLConnection;->setRequestProperty(Ljava/lang/String;Ljava/lang/String;)V
/* .line 1011 */
v8 = (( java.net.HttpURLConnection ) v5 ).getResponseCode ( ); // invoke-virtual {v5}, Ljava/net/HttpURLConnection;->getResponseCode()I
/* .line 1012 */
/* .local v8, "responseCode":I */
(( java.net.HttpURLConnection ) v5 ).getResponseMessage ( ); // invoke-virtual {v5}, Ljava/net/HttpURLConnection;->getResponseMessage()Ljava/lang/String;
/* .line 1014 */
/* .local v9, "responseMsg":Ljava/lang/String; */
/* const/16 v11, 0xc8 */
/* if-eq v8, v11, :cond_0 */
/* .line 1015 */
final String v11 = "inneractive"; // const-string v11, "inneractive"
final String v13 = "responsecode != 200"; // const-string v13, "responsecode != 200"
android.util.Log .w ( v11,v13 );
/* .line 1016 */
/* new-instance v11, Ljava/io/IOException; */
/* new-instance v13, Ljava/lang/StringBuilder; */
final String v14 = "HTTP response code: "; // const-string v14, "HTTP response code: "
/* invoke-direct {v13, v14}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V */
(( java.lang.StringBuilder ) v13 ).append ( v8 ); // invoke-virtual {v13, v8}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v13 ).append ( v9 ); // invoke-virtual {v13, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v13 ).toString ( ); // invoke-virtual {v13}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
/* invoke-direct {v11, v13}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V */
/* throw v11 */
/* :try_end_0 */
/* .catchall {:try_start_0 ..:try_end_0} :catchall_0 */
/* .line 995 */
} // .end local v2 # "contentEncoding":Ljava/lang/String;
} // .end local v3 # "contentType":Ljava/lang/String;
} // .end local v4 # "data":Ljava/lang/String;
} // .end local v8 # "responseCode":I
} // .end local v9 # "responseMsg":Ljava/lang/String;
} // .end local v10 # "url":Ljava/net/URL;
/* :catchall_0 */
/* move-exception v11 */
/* monitor-exit v12 */
/* throw v11 */
/* .line 1022 */
/* .restart local v2 # "contentEncoding":Ljava/lang/String; */
/* .restart local v3 # "contentType":Ljava/lang/String; */
/* .restart local v4 # "data":Ljava/lang/String; */
/* .restart local v8 # "responseCode":I */
/* .restart local v9 # "responseMsg":Ljava/lang/String; */
/* .restart local v10 # "url":Ljava/net/URL; */
} // :cond_0
try { // :try_start_1
(( java.net.HttpURLConnection ) v5 ).getContentEncoding ( ); // invoke-virtual {v5}, Ljava/net/HttpURLConnection;->getContentEncoding()Ljava/lang/String;
/* .line 1023 */
(( java.net.HttpURLConnection ) v5 ).getInputStream ( ); // invoke-virtual {v5}, Ljava/net/HttpURLConnection;->getInputStream()Ljava/io/InputStream;
/* .line 1024 */
/* if-nez v2, :cond_1 */
/* .line 1025 */
final String v2 = "utf-8"; // const-string v2, "utf-8"
/* .line 1029 */
} // :cond_1
final String v3 = "text/html"; // const-string v3, "text/html"
/* .line 1031 */
com.inneractive.api.ads.InneractiveAdView .getData ( v5 );
/* .line 1034 */
/* .local v1, "buffer":[B */
/* new-instance v4, Ljava/lang/String; */
} // .end local v4 # "data":Ljava/lang/String;
/* invoke-direct {v4, v1, v2}, Ljava/lang/String;-><init>([BLjava/lang/String;)V */
/* .line 1075 */
/* .restart local v4 # "data":Ljava/lang/String; */
if ( v6 != null) { // if-eqz v6, :cond_2
/* .line 1076 */
(( java.io.InputStream ) v6 ).close ( ); // invoke-virtual {v6}, Ljava/io/InputStream;->close()V
/* :try_end_1 */
/* .catchall {:try_start_1 ..:try_end_1} :catchall_0 */
/* .line 1077 */
int v6 = 0; // const/4 v6, 0x0
/* .line 1085 */
} // :cond_2
/* monitor-exit v12 */
} // .end method
private void initMetaData ( java.util.Hashtable p0 ) {
/* .locals 10 */
/* .param p1, "metaData" # Ljava/util/Hashtable; */
/* .prologue */
int v9 = 1; // const/4 v9, 0x1
/* .line 340 */
if ( p1 != null) { // if-eqz p1, :cond_0
/* .line 342 */
int v3 = 0; // const/4 v3, 0x0
/* .local v3, "i":I */
} // :goto_0
v7 = (( java.util.Hashtable ) p1 ).size ( ); // invoke-virtual {p1}, Ljava/util/Hashtable;->size()I
/* if-lt v3, v7, :cond_1 */
/* .line 401 */
} // .end local v3 # "i":I
} // :cond_0
return;
/* .line 343 */
/* .restart local v3 # "i":I */
} // :cond_1
final String v7 = "Key_Age"; // const-string v7, "Key_Age"
v7 = (( java.util.Hashtable ) p1 ).containsKey ( v7 ); // invoke-virtual {p1, v7}, Ljava/util/Hashtable;->containsKey(Ljava/lang/Object;)Z
if ( v7 != null) { // if-eqz v7, :cond_3
/* .line 344 */
final String v7 = "Key_Age"; // const-string v7, "Key_Age"
(( java.util.Hashtable ) p1 ).get ( v7 ); // invoke-virtual {p1, v7}, Ljava/util/Hashtable;->get(Ljava/lang/Object;)Ljava/lang/Object;
/* check-cast v1, Ljava/lang/String; */
/* .line 345 */
/* .local v1, "ageStr":Ljava/lang/String; */
v0 = java.lang.Integer .parseInt ( v1 );
/* .line 346 */
/* .local v0, "age":I */
/* const/16 v7, 0x78 */
/* if-ge v0, v7, :cond_2 */
/* if-le v0, v9, :cond_2 */
/* .line 347 */
v7 = this.metaDataStr;
/* new-instance v8, Ljava/lang/StringBuilder; */
java.lang.String .valueOf ( v7 );
/* invoke-direct {v8, v7}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V */
final String v7 = "&a="; // const-string v7, "&a="
(( java.lang.StringBuilder ) v8 ).append ( v7 ); // invoke-virtual {v8, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v7 ).toString ( ); // invoke-virtual {v7}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
this.metaDataStr = v7;
/* .line 348 */
v7 = this.metaDataStr;
/* new-instance v8, Ljava/lang/StringBuilder; */
java.lang.String .valueOf ( v7 );
/* invoke-direct {v8, v7}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V */
(( java.lang.StringBuilder ) v8 ).append ( v0 ); // invoke-virtual {v8, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v7 ).toString ( ); // invoke-virtual {v7}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
this.metaDataStr = v7;
/* .line 352 */
} // :cond_2
final String v7 = "Key_Age"; // const-string v7, "Key_Age"
(( java.util.Hashtable ) p1 ).remove ( v7 ); // invoke-virtual {p1, v7}, Ljava/util/Hashtable;->remove(Ljava/lang/Object;)Ljava/lang/Object;
/* .line 356 */
} // .end local v0 # "age":I
} // .end local v1 # "ageStr":Ljava/lang/String;
} // :cond_3
final String v7 = "Key_Distribution_ID"; // const-string v7, "Key_Distribution_ID"
v7 = (( java.util.Hashtable ) p1 ).containsKey ( v7 ); // invoke-virtual {p1, v7}, Ljava/util/Hashtable;->containsKey(Ljava/lang/Object;)Z
if ( v7 != null) { // if-eqz v7, :cond_4
/* .line 357 */
final String v7 = "Key_Distribution_ID"; // const-string v7, "Key_Distribution_ID"
(( java.util.Hashtable ) p1 ).get ( v7 ); // invoke-virtual {p1, v7}, Ljava/util/Hashtable;->get(Ljava/lang/Object;)Ljava/lang/Object;
/* check-cast v7, Ljava/lang/String; */
this.distributionID = v7;
/* .line 358 */
final String v7 = "Key_Distribution_ID"; // const-string v7, "Key_Distribution_ID"
(( java.util.Hashtable ) p1 ).remove ( v7 ); // invoke-virtual {p1, v7}, Ljava/util/Hashtable;->remove(Ljava/lang/Object;)Ljava/lang/Object;
/* .line 360 */
} // :cond_4
final String v7 = "Key_External_ID"; // const-string v7, "Key_External_ID"
v7 = (( java.util.Hashtable ) p1 ).containsKey ( v7 ); // invoke-virtual {p1, v7}, Ljava/util/Hashtable;->containsKey(Ljava/lang/Object;)Z
if ( v7 != null) { // if-eqz v7, :cond_5
/* .line 361 */
v7 = this.metaDataStr;
/* new-instance v8, Ljava/lang/StringBuilder; */
java.lang.String .valueOf ( v7 );
/* invoke-direct {v8, v7}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V */
final String v7 = "&eid="; // const-string v7, "&eid="
(( java.lang.StringBuilder ) v8 ).append ( v7 ); // invoke-virtual {v8, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v7 ).toString ( ); // invoke-virtual {v7}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
this.metaDataStr = v7;
/* .line 362 */
v7 = this.metaDataStr;
/* new-instance v8, Ljava/lang/StringBuilder; */
java.lang.String .valueOf ( v7 );
/* invoke-direct {v8, v7}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V */
final String v7 = "Key_External_ID"; // const-string v7, "Key_External_ID"
(( java.util.Hashtable ) p1 ).get ( v7 ); // invoke-virtual {p1, v7}, Ljava/util/Hashtable;->get(Ljava/lang/Object;)Ljava/lang/Object;
(( java.lang.StringBuilder ) v8 ).append ( v7 ); // invoke-virtual {v8, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v7 ).toString ( ); // invoke-virtual {v7}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
this.metaDataStr = v7;
/* .line 363 */
final String v7 = "Key_External_ID"; // const-string v7, "Key_External_ID"
(( java.util.Hashtable ) p1 ).remove ( v7 ); // invoke-virtual {p1, v7}, Ljava/util/Hashtable;->remove(Ljava/lang/Object;)Ljava/lang/Object;
/* .line 365 */
} // :cond_5
final String v7 = "Key_Gender"; // const-string v7, "Key_Gender"
v7 = (( java.util.Hashtable ) p1 ).containsKey ( v7 ); // invoke-virtual {p1, v7}, Ljava/util/Hashtable;->containsKey(Ljava/lang/Object;)Z
if ( v7 != null) { // if-eqz v7, :cond_7
/* .line 366 */
final String v7 = "Key_Gender"; // const-string v7, "Key_Gender"
(( java.util.Hashtable ) p1 ).get ( v7 ); // invoke-virtual {p1, v7}, Ljava/util/Hashtable;->get(Ljava/lang/Object;)Ljava/lang/Object;
/* check-cast v2, Ljava/lang/String; */
/* .line 367 */
/* .local v2, "genderStr":Ljava/lang/String; */
final String v7 = "f"; // const-string v7, "f"
v7 = (( java.lang.String ) v2 ).equals ( v7 ); // invoke-virtual {v2, v7}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
/* if-nez v7, :cond_6 */
final String v7 = "female"; // const-string v7, "female"
v7 = (( java.lang.String ) v2 ).equals ( v7 ); // invoke-virtual {v2, v7}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
/* if-nez v7, :cond_6 */
final String v7 = "m"; // const-string v7, "m"
v7 = (( java.lang.String ) v2 ).equals ( v7 ); // invoke-virtual {v2, v7}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
/* if-nez v7, :cond_6 */
final String v7 = "male"; // const-string v7, "male"
v7 = (( java.lang.String ) v2 ).equals ( v7 ); // invoke-virtual {v2, v7}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
/* if-nez v7, :cond_6 */
final String v7 = "F"; // const-string v7, "F"
v7 = (( java.lang.String ) v2 ).equals ( v7 ); // invoke-virtual {v2, v7}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
/* if-nez v7, :cond_6 */
final String v7 = "Female"; // const-string v7, "Female"
v7 = (( java.lang.String ) v2 ).equals ( v7 ); // invoke-virtual {v2, v7}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
/* if-nez v7, :cond_6 */
final String v7 = "M"; // const-string v7, "M"
v7 = (( java.lang.String ) v2 ).equals ( v7 ); // invoke-virtual {v2, v7}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
/* if-nez v7, :cond_6 */
final String v7 = "Male"; // const-string v7, "Male"
v7 = (( java.lang.String ) v2 ).equals ( v7 ); // invoke-virtual {v2, v7}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
if ( v7 != null) { // if-eqz v7, :cond_7
/* .line 368 */
} // :cond_6
v7 = this.metaDataStr;
/* new-instance v8, Ljava/lang/StringBuilder; */
java.lang.String .valueOf ( v7 );
/* invoke-direct {v8, v7}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V */
final String v7 = "&g="; // const-string v7, "&g="
(( java.lang.StringBuilder ) v8 ).append ( v7 ); // invoke-virtual {v8, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v7 ).toString ( ); // invoke-virtual {v7}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
this.metaDataStr = v7;
/* .line 369 */
v7 = this.metaDataStr;
/* new-instance v8, Ljava/lang/StringBuilder; */
java.lang.String .valueOf ( v7 );
/* invoke-direct {v8, v7}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V */
(( java.lang.StringBuilder ) v8 ).append ( v2 ); // invoke-virtual {v8, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v7 ).toString ( ); // invoke-virtual {v7}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
this.metaDataStr = v7;
/* .line 370 */
final String v7 = "Key_Gender"; // const-string v7, "Key_Gender"
(( java.util.Hashtable ) p1 ).remove ( v7 ); // invoke-virtual {p1, v7}, Ljava/util/Hashtable;->remove(Ljava/lang/Object;)Ljava/lang/Object;
/* .line 374 */
} // .end local v2 # "genderStr":Ljava/lang/String;
} // :cond_7
final String v7 = "Key_Keywords"; // const-string v7, "Key_Keywords"
v7 = (( java.util.Hashtable ) p1 ).containsKey ( v7 ); // invoke-virtual {p1, v7}, Ljava/util/Hashtable;->containsKey(Ljava/lang/Object;)Z
if ( v7 != null) { // if-eqz v7, :cond_8
/* .line 375 */
v7 = this.metaDataStr;
/* new-instance v8, Ljava/lang/StringBuilder; */
java.lang.String .valueOf ( v7 );
/* invoke-direct {v8, v7}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V */
final String v7 = "&k="; // const-string v7, "&k="
(( java.lang.StringBuilder ) v8 ).append ( v7 ); // invoke-virtual {v8, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v7 ).toString ( ); // invoke-virtual {v7}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
this.metaDataStr = v7;
/* .line 376 */
final String v7 = "Key_Keywords"; // const-string v7, "Key_Keywords"
(( java.util.Hashtable ) p1 ).get ( v7 ); // invoke-virtual {p1, v7}, Ljava/util/Hashtable;->get(Ljava/lang/Object;)Ljava/lang/Object;
/* check-cast v4, Ljava/lang/String; */
/* .line 377 */
/* .local v4, "keywords":Ljava/lang/String; */
final String v7 = " "; // const-string v7, " "
final String v8 = ""; // const-string v8, ""
(( java.lang.String ) v4 ).replace ( v7, v8 ); // invoke-virtual {v4, v7, v8}, Ljava/lang/String;->replace(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Ljava/lang/String;
/* .line 378 */
/* .local v5, "keywordsWOspaces":Ljava/lang/String; */
v7 = this.metaDataStr;
/* new-instance v8, Ljava/lang/StringBuilder; */
java.lang.String .valueOf ( v7 );
/* invoke-direct {v8, v7}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V */
(( java.lang.StringBuilder ) v8 ).append ( v5 ); // invoke-virtual {v8, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v7 ).toString ( ); // invoke-virtual {v7}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
this.metaDataStr = v7;
/* .line 379 */
final String v7 = "Key_Keywords"; // const-string v7, "Key_Keywords"
(( java.util.Hashtable ) p1 ).remove ( v7 ); // invoke-virtual {p1, v7}, Ljava/util/Hashtable;->remove(Ljava/lang/Object;)Ljava/lang/Object;
/* .line 381 */
} // .end local v4 # "keywords":Ljava/lang/String;
} // .end local v5 # "keywordsWOspaces":Ljava/lang/String;
} // :cond_8
final String v7 = "Key_Msisdn"; // const-string v7, "Key_Msisdn"
v7 = (( java.util.Hashtable ) p1 ).containsKey ( v7 ); // invoke-virtual {p1, v7}, Ljava/util/Hashtable;->containsKey(Ljava/lang/Object;)Z
if ( v7 != null) { // if-eqz v7, :cond_9
/* .line 382 */
v7 = this.metaDataStr;
/* new-instance v8, Ljava/lang/StringBuilder; */
java.lang.String .valueOf ( v7 );
/* invoke-direct {v8, v7}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V */
final String v7 = "&mn="; // const-string v7, "&mn="
(( java.lang.StringBuilder ) v8 ).append ( v7 ); // invoke-virtual {v8, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v7 ).toString ( ); // invoke-virtual {v7}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
this.metaDataStr = v7;
/* .line 383 */
v7 = this.metaDataStr;
/* new-instance v8, Ljava/lang/StringBuilder; */
java.lang.String .valueOf ( v7 );
/* invoke-direct {v8, v7}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V */
final String v7 = "Key_Msisdn"; // const-string v7, "Key_Msisdn"
(( java.util.Hashtable ) p1 ).get ( v7 ); // invoke-virtual {p1, v7}, Ljava/util/Hashtable;->get(Ljava/lang/Object;)Ljava/lang/Object;
(( java.lang.StringBuilder ) v8 ).append ( v7 ); // invoke-virtual {v8, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v7 ).toString ( ); // invoke-virtual {v7}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
this.metaDataStr = v7;
/* .line 384 */
final String v7 = "Key_Msisdn"; // const-string v7, "Key_Msisdn"
(( java.util.Hashtable ) p1 ).remove ( v7 ); // invoke-virtual {p1, v7}, Ljava/util/Hashtable;->remove(Ljava/lang/Object;)Ljava/lang/Object;
/* .line 386 */
} // :cond_9
final String v7 = "test"; // const-string v7, "test"
v7 = (( java.util.Hashtable ) p1 ).containsKey ( v7 ); // invoke-virtual {p1, v7}, Ljava/util/Hashtable;->containsKey(Ljava/lang/Object;)Z
if ( v7 != null) { // if-eqz v7, :cond_b
/* .line 387 */
final String v7 = "test"; // const-string v7, "test"
(( java.util.Hashtable ) p1 ).get ( v7 ); // invoke-virtual {p1, v7}, Ljava/util/Hashtable;->get(Ljava/lang/Object;)Ljava/lang/Object;
/* check-cast v7, Ljava/lang/Integer; */
v6 = (( java.lang.Integer ) v7 ).intValue ( ); // invoke-virtual {v7}, Ljava/lang/Integer;->intValue()I
/* .line 389 */
/* .local v6, "test":I */
/* if-ne v6, v9, :cond_a */
/* .line 390 */
/* iput-boolean v9, p0, Lcom/inneractive/api/ads/InneractiveAdView;->testMode:Z */
/* .line 393 */
} // :cond_a
final String v7 = "test"; // const-string v7, "test"
(( java.util.Hashtable ) p1 ).remove ( v7 ); // invoke-virtual {p1, v7}, Ljava/util/Hashtable;->remove(Ljava/lang/Object;)Ljava/lang/Object;
/* .line 342 */
} // .end local v6 # "test":I
} // :cond_b
/* add-int/lit8 v3, v3, 0x1 */
/* goto/16 :goto_0 */
} // .end method
private Boolean isFileExists ( android.content.Context p0, java.lang.String p1 ) {
/* .locals 2 */
/* .param p1, "context" # Landroid/content/Context; */
/* .param p2, "fileName" # Ljava/lang/String; */
/* .prologue */
/* .line 930 */
v1 = com.inneractive.api.ads.InneractiveAdView.lock;
/* monitor-enter v1 */
/* .line 931 */
try { // :try_start_0
(( android.content.Context ) p1 ).getFileStreamPath ( p2 ); // invoke-virtual {p1, p2}, Landroid/content/Context;->getFileStreamPath(Ljava/lang/String;)Ljava/io/File;
v0 = (( java.io.File ) v0 ).exists ( ); // invoke-virtual {v0}, Ljava/io/File;->exists()Z
/* monitor-exit v1 */
/* .line 930 */
/* :catchall_0 */
/* move-exception v0 */
/* monitor-exit v1 */
/* :try_end_0 */
/* .catchall {:try_start_0 ..:try_end_0} :catchall_0 */
/* throw v0 */
} // .end method
private void readClientIDFromFile ( ) {
/* .locals 6 */
/* .prologue */
/* .line 916 */
try { // :try_start_0
v4 = this.appContext;
final String v5 = "ClientIDFile"; // const-string v5, "ClientIDFile"
(( android.content.Context ) v4 ).openFileInput ( v5 ); // invoke-virtual {v4, v5}, Landroid/content/Context;->openFileInput(Ljava/lang/String;)Ljava/io/FileInputStream;
/* .line 917 */
/* .local v3, "fis":Ljava/io/FileInputStream; */
v4 = (( java.io.FileInputStream ) v3 ).available ( ); // invoke-virtual {v3}, Ljava/io/FileInputStream;->available()I
/* new-array v1, v4, [B */
/* .line 918 */
/* .local v1, "clientIdByteArr":[B */
v0 = (( java.io.FileInputStream ) v3 ).read ( v1 ); // invoke-virtual {v3, v1}, Ljava/io/FileInputStream;->read([B)I
/* .line 919 */
/* .local v0, "bytesRead":I */
/* if-lez v0, :cond_0 */
/* .line 920 */
/* new-instance v4, Ljava/lang/String; */
/* invoke-direct {v4, v1}, Ljava/lang/String;-><init>([B)V */
/* :try_end_0 */
/* .catch Ljava/lang/Exception; {:try_start_0 ..:try_end_0} :catch_0 */
/* .line 926 */
} // .end local v0 # "bytesRead":I
} // .end local v1 # "clientIdByteArr":[B
} // .end local v3 # "fis":Ljava/io/FileInputStream;
} // :cond_0
} // :goto_0
return;
/* .line 923 */
/* :catch_0 */
/* move-exception v2 */
/* .line 924 */
/* .local v2, "e":Ljava/lang/Exception; */
final String v4 = "innerActive"; // const-string v4, "innerActive"
final String v5 = "failed to get the clientID from memory"; // const-string v5, "failed to get the clientID from memory"
android.util.Log .w ( v4,v5 );
} // .end method
private void startCustomAnimation ( android.view.animation.Animation p0 ) {
/* .locals 3 */
/* .param p1, "animation" # Landroid/view/animation/Animation; */
/* .prologue */
int v2 = 1; // const/4 v2, 0x1
/* .line 1180 */
/* const-wide/16 v0, 0x1f4 */
(( android.view.animation.Animation ) p1 ).setDuration ( v0, v1 ); // invoke-virtual {p1, v0, v1}, Landroid/view/animation/Animation;->setDuration(J)V
/* .line 1181 */
(( android.view.animation.Animation ) p1 ).setFillEnabled ( v2 ); // invoke-virtual {p1, v2}, Landroid/view/animation/Animation;->setFillEnabled(Z)V
/* .line 1182 */
(( android.view.animation.Animation ) p1 ).setFillAfter ( v2 ); // invoke-virtual {p1, v2}, Landroid/view/animation/Animation;->setFillAfter(Z)V
/* .line 1183 */
(( com.inneractive.api.ads.InneractiveAdView ) p0 ).startAnimation ( p1 ); // invoke-virtual {p0, p1}, Lcom/inneractive/api/ads/InneractiveAdView;->startAnimation(Landroid/view/animation/Animation;)V
/* .line 1184 */
return;
} // .end method
/* # virtual methods */
protected void WriteClientIDToFile ( java.lang.String p0 ) {
/* .locals 5 */
/* .param p1, "clientID" # Ljava/lang/String; */
/* .prologue */
/* .line 896 */
try { // :try_start_0
v2 = this.appContext;
final String v3 = "ClientIDFile"; // const-string v3, "ClientIDFile"
v2 = /* invoke-direct {p0, v2, v3}, Lcom/inneractive/api/ads/InneractiveAdView;->isFileExists(Landroid/content/Context;Ljava/lang/String;)Z */
if ( v2 != null) { // if-eqz v2, :cond_0
/* .line 897 */
v2 = this.appContext;
final String v3 = "ClientIDFile"; // const-string v3, "ClientIDFile"
(( android.content.Context ) v2 ).deleteFile ( v3 ); // invoke-virtual {v2, v3}, Landroid/content/Context;->deleteFile(Ljava/lang/String;)Z
/* .line 899 */
} // :cond_0
final String v2 = "inneractive"; // const-string v2, "inneractive"
/* new-instance v3, Ljava/lang/StringBuilder; */
final String v4 = "saving clientID - "; // const-string v4, "saving clientID - "
/* invoke-direct {v3, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V */
(( java.lang.StringBuilder ) v3 ).append ( p1 ); // invoke-virtual {v3, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v3 ).toString ( ); // invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
android.util.Log .w ( v2,v3 );
/* .line 900 */
v2 = this.appContext;
final String v3 = "ClientIDFile"; // const-string v3, "ClientIDFile"
int v4 = 0; // const/4 v4, 0x0
(( android.content.Context ) v2 ).openFileOutput ( v3, v4 ); // invoke-virtual {v2, v3, v4}, Landroid/content/Context;->openFileOutput(Ljava/lang/String;I)Ljava/io/FileOutputStream;
/* .line 901 */
/* .local v1, "fos":Ljava/io/FileOutputStream; */
(( java.lang.String ) p1 ).getBytes ( ); // invoke-virtual {p1}, Ljava/lang/String;->getBytes()[B
(( java.io.FileOutputStream ) v1 ).write ( v2 ); // invoke-virtual {v1, v2}, Ljava/io/FileOutputStream;->write([B)V
/* :try_end_0 */
/* .catch Ljava/lang/Exception; {:try_start_0 ..:try_end_0} :catch_0 */
/* .line 908 */
} // .end local v1 # "fos":Ljava/io/FileOutputStream;
} // :goto_0
return;
/* .line 903 */
/* :catch_0 */
/* move-exception v0 */
/* .line 905 */
/* .local v0, "e":Ljava/lang/Exception; */
final String v2 = "innerActive"; // const-string v2, "innerActive"
final String v3 = "failed to save the clientID"; // const-string v3, "failed to save the clientID"
android.util.Log .w ( v2,v3 );
} // .end method
void createAdRequest ( ) {
/* .locals 9 */
/* .prologue */
int v8 = 1; // const/4 v8, 0x1
/* .line 527 */
/* iget v6, p0, Lcom/inneractive/api/ads/InneractiveAdView;->adType:I */
int v7 = 2; // const/4 v7, 0x2
/* if-ne v6, v7, :cond_8 */
/* .line 528 */
/* iget-boolean v6, p0, Lcom/inneractive/api/ads/InneractiveAdView;->testMode:Z */
if ( v6 != null) { // if-eqz v6, :cond_7
/* .line 529 */
v6 = com.inneractive.api.ads.InneractiveAdView.TEST_HOST_URL_FOR_FULL_SCREEN_AD;
this.adRequest = v6;
/* .line 552 */
} // :goto_0
v6 = this.distributionID;
if ( v6 != null) { // if-eqz v6, :cond_1
v6 = this.distributionID;
final String v7 = ""; // const-string v7, ""
/* if-eq v6, v7, :cond_0 */
v6 = this.distributionID;
final String v7 = "600"; // const-string v7, "600"
v6 = (( java.lang.String ) v6 ).equals ( v7 ); // invoke-virtual {v6, v7}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
if ( v6 != null) { // if-eqz v6, :cond_c
} // :cond_0
/* iget v6, p0, Lcom/inneractive/api/ads/InneractiveAdView;->adType:I */
/* if-eq v6, v8, :cond_c */
/* .line 554 */
} // :cond_1
final String v6 = "559"; // const-string v6, "559"
this.distributionID = v6;
/* .line 561 */
} // :cond_2
} // :goto_1
/* invoke-direct {p0}, Lcom/inneractive/api/ads/InneractiveAdView;->getScreenWidth()V */
/* .line 562 */
/* invoke-direct {p0}, Lcom/inneractive/api/ads/InneractiveAdView;->getScreenHeight()V */
/* .line 564 */
java.lang.System .currentTimeMillis ( );
/* move-result-wide v2 */
/* .line 565 */
/* .local v2, "currentTime":J */
v6 = java.util.concurrent.TimeUnit.MILLISECONDS;
(( java.util.concurrent.TimeUnit ) v6 ).toSeconds ( v2, v3 ); // invoke-virtual {v6, v2, v3}, Ljava/util/concurrent/TimeUnit;->toSeconds(J)J
/* move-result-wide v0 */
/* .line 566 */
/* .local v0, "currTimeInSeconds":J */
v6 = this.adRequest;
/* new-instance v7, Ljava/lang/StringBuilder; */
java.lang.String .valueOf ( v6 );
/* invoke-direct {v7, v6}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V */
final String v6 = "aid="; // const-string v6, "aid="
(( java.lang.StringBuilder ) v7 ).append ( v6 ); // invoke-virtual {v7, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
v7 = this.appID;
(( java.lang.StringBuilder ) v6 ).append ( v7 ); // invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
final String v7 = "&po="; // const-string v7, "&po="
(( java.lang.StringBuilder ) v6 ).append ( v7 ); // invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
v7 = this.distributionID;
(( java.lang.StringBuilder ) v6 ).append ( v7 ); // invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
final String v7 = "&v="; // const-string v7, "&v="
(( java.lang.StringBuilder ) v6 ).append ( v7 ); // invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
final String v7 = "2.0.1-Android-3.0.4"; // const-string v7, "2.0.1-Android-3.0.4"
(( java.lang.StringBuilder ) v6 ).append ( v7 ); // invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
final String v7 = "&hid="; // const-string v7, "&hid="
(( java.lang.StringBuilder ) v6 ).append ( v7 ); // invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
v7 = this.deviceID;
(( java.lang.StringBuilder ) v6 ).append ( v7 ); // invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
final String v7 = "&t="; // const-string v7, "&t="
(( java.lang.StringBuilder ) v6 ).append ( v7 ); // invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
java.lang.System .currentTimeMillis ( );
/* move-result-wide v7 */
(( java.lang.StringBuilder ) v6 ).append ( v7, v8 ); // invoke-virtual {v6, v7, v8}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;
final String v7 = "&w="; // const-string v7, "&w="
(( java.lang.StringBuilder ) v6 ).append ( v7 ); // invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
/* iget v7, p0, Lcom/inneractive/api/ads/InneractiveAdView;->screenWidth:I */
(( java.lang.StringBuilder ) v6 ).append ( v7 ); // invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;
final String v7 = "&h="; // const-string v7, "&h="
(( java.lang.StringBuilder ) v6 ).append ( v7 ); // invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
/* iget v7, p0, Lcom/inneractive/api/ads/InneractiveAdView;->screenHeight:I */
(( java.lang.StringBuilder ) v6 ).append ( v7 ); // invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;
v7 = this.metaDataStr;
(( java.lang.StringBuilder ) v6 ).append ( v7 ); // invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v6 ).toString ( ); // invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
this.adRequest = v6;
/* .line 568 */
/* invoke-direct {p0}, Lcom/inneractive/api/ads/InneractiveAdView;->readClientIDFromFile()V */
/* .line 569 */
v6 = com.inneractive.api.ads.InneractiveAdView.clientID;
final String v7 = "-1"; // const-string v7, "-1"
v6 = (( java.lang.String ) v6 ).equals ( v7 ); // invoke-virtual {v6, v7}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
/* if-nez v6, :cond_3 */
v6 = com.inneractive.api.ads.InneractiveAdView.clientID;
if ( v6 != null) { // if-eqz v6, :cond_3
v6 = com.inneractive.api.ads.InneractiveAdView.clientID;
final String v7 = ""; // const-string v7, ""
v6 = (( java.lang.String ) v6 ).equals ( v7 ); // invoke-virtual {v6, v7}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
/* if-nez v6, :cond_3 */
/* .line 570 */
v6 = this.adRequest;
/* new-instance v7, Ljava/lang/StringBuilder; */
java.lang.String .valueOf ( v6 );
/* invoke-direct {v7, v6}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V */
final String v6 = "&cid="; // const-string v6, "&cid="
(( java.lang.StringBuilder ) v7 ).append ( v6 ); // invoke-virtual {v7, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
v7 = com.inneractive.api.ads.InneractiveAdView.clientID;
(( java.lang.StringBuilder ) v6 ).append ( v7 ); // invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v6 ).toString ( ); // invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
this.adRequest = v6;
/* .line 572 */
} // :cond_3
/* sget-wide v6, Lcom/inneractive/api/ads/InneractiveAdView;->startGPSTimeInSec:J */
/* sub-long v4, v0, v6 */
/* .line 574 */
/* .local v4, "diffGPSTime":J */
/* sget-boolean v6, Lcom/inneractive/api/ads/InneractiveAdView;->isGPSfirstTime:Z */
/* if-nez v6, :cond_4 */
/* const-wide/16 v6, 0x2a30 */
/* cmp-long v6, v4, v6 */
/* if-ltz v6, :cond_5 */
/* .line 575 */
} // :cond_4
v6 = this.appContext;
com.inneractive.api.ads.InneractiveAdView .getCoordinatesAsString ( v6 );
this.location = v6;
/* .line 576 */
final String v6 = "inneractive"; // const-string v6, "inneractive"
final String v7 = "Time to get the GPS location..."; // const-string v7, "Time to get the GPS location..."
android.util.Log .i ( v6,v7 );
/* .line 579 */
java.lang.System .currentTimeMillis ( );
/* move-result-wide v6 */
/* sput-wide v6, Lcom/inneractive/api/ads/InneractiveAdView;->startGPSTime:J */
/* .line 580 */
v6 = java.util.concurrent.TimeUnit.MILLISECONDS;
/* sget-wide v7, Lcom/inneractive/api/ads/InneractiveAdView;->startGPSTime:J */
(( java.util.concurrent.TimeUnit ) v6 ).toSeconds ( v7, v8 ); // invoke-virtual {v6, v7, v8}, Ljava/util/concurrent/TimeUnit;->toSeconds(J)J
/* move-result-wide v6 */
/* sput-wide v6, Lcom/inneractive/api/ads/InneractiveAdView;->startGPSTimeInSec:J */
/* .line 581 */
int v6 = 0; // const/4 v6, 0x0
com.inneractive.api.ads.InneractiveAdView.isGPSfirstTime = (v6!= 0);
/* .line 584 */
} // :cond_5
v6 = this.location;
if ( v6 != null) { // if-eqz v6, :cond_6
/* .line 585 */
v6 = this.adRequest;
/* new-instance v7, Ljava/lang/StringBuilder; */
java.lang.String .valueOf ( v6 );
/* invoke-direct {v7, v6}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V */
final String v6 = "&lg="; // const-string v6, "&lg="
(( java.lang.StringBuilder ) v7 ).append ( v6 ); // invoke-virtual {v7, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
v7 = this.location;
(( java.lang.StringBuilder ) v6 ).append ( v7 ); // invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v6 ).toString ( ); // invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
this.adRequest = v6;
/* .line 587 */
} // :cond_6
return;
/* .line 532 */
} // .end local v0 # "currTimeInSeconds":J
} // .end local v2 # "currentTime":J
} // .end local v4 # "diffGPSTime":J
} // :cond_7
v6 = com.inneractive.api.ads.InneractiveAdView.HOST_URL_FOR_FULL_SCREEN_AD;
this.adRequest = v6;
/* goto/16 :goto_0 */
/* .line 536 */
} // :cond_8
/* iget v6, p0, Lcom/inneractive/api/ads/InneractiveAdView;->adType:I */
/* if-ne v6, v8, :cond_a */
/* .line 537 */
/* iget-boolean v6, p0, Lcom/inneractive/api/ads/InneractiveAdView;->testMode:Z */
if ( v6 != null) { // if-eqz v6, :cond_9
/* .line 538 */
v6 = com.inneractive.api.ads.InneractiveAdView.TEST_HOST_URL_FOR_TEXT_AD;
this.adRequest = v6;
/* goto/16 :goto_0 */
/* .line 541 */
} // :cond_9
v6 = com.inneractive.api.ads.InneractiveAdView.HOST_URL_FOR_TEXT_AD;
this.adRequest = v6;
/* goto/16 :goto_0 */
/* .line 545 */
} // :cond_a
/* iget-boolean v6, p0, Lcom/inneractive/api/ads/InneractiveAdView;->testMode:Z */
if ( v6 != null) { // if-eqz v6, :cond_b
/* .line 546 */
v6 = com.inneractive.api.ads.InneractiveAdView.TEST_HOST_URL_FOR_BANNER_AD;
this.adRequest = v6;
/* goto/16 :goto_0 */
/* .line 549 */
} // :cond_b
v6 = com.inneractive.api.ads.InneractiveAdView.HOST_URL_FOR_BANNER_AD;
this.adRequest = v6;
/* goto/16 :goto_0 */
/* .line 556 */
} // :cond_c
v6 = this.distributionID;
if ( v6 != null) { // if-eqz v6, :cond_e
v6 = this.distributionID;
final String v7 = ""; // const-string v7, ""
/* if-eq v6, v7, :cond_d */
v6 = this.distributionID;
final String v7 = "559"; // const-string v7, "559"
v6 = (( java.lang.String ) v6 ).equals ( v7 ); // invoke-virtual {v6, v7}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
if ( v6 != null) { // if-eqz v6, :cond_2
} // :cond_d
/* iget v6, p0, Lcom/inneractive/api/ads/InneractiveAdView;->adType:I */
/* if-ne v6, v8, :cond_2 */
/* .line 557 */
} // :cond_e
final String v6 = "600"; // const-string v6, "600"
this.distributionID = v6;
/* goto/16 :goto_1 */
} // .end method
protected void displayAd ( android.content.Context p0 ) {
/* .locals 4 */
/* .param p1, "appContext" # Landroid/content/Context; */
/* .prologue */
/* .line 435 */
(( com.inneractive.api.ads.InneractiveAdView ) p0 ).createAdRequest ( ); // invoke-virtual {p0}, Lcom/inneractive/api/ads/InneractiveAdView;->createAdRequest()V
/* .line 438 */
v1 = (( com.inneractive.api.ads.InneractiveAdView ) p0 ).isInternetPermissionExist ( ); // invoke-virtual {p0}, Lcom/inneractive/api/ads/InneractiveAdView;->isInternetPermissionExist()Z
if ( v1 != null) { // if-eqz v1, :cond_2
/* .line 440 */
try { // :try_start_0
(( com.inneractive.api.ads.InneractiveAdView ) p0 ).getSettings ( ); // invoke-virtual {p0}, Lcom/inneractive/api/ads/InneractiveAdView;->getSettings()Landroid/webkit/WebSettings;
int v2 = 1; // const/4 v2, 0x1
(( android.webkit.WebSettings ) v1 ).setJavaScriptEnabled ( v2 ); // invoke-virtual {v1, v2}, Landroid/webkit/WebSettings;->setJavaScriptEnabled(Z)V
/* .line 441 */
(( com.inneractive.api.ads.InneractiveAdView ) p0 ).getSettings ( ); // invoke-virtual {p0}, Lcom/inneractive/api/ads/InneractiveAdView;->getSettings()Landroid/webkit/WebSettings;
(( android.webkit.WebSettings ) v1 ).getUserAgentString ( ); // invoke-virtual {v1}, Landroid/webkit/WebSettings;->getUserAgentString()Ljava/lang/String;
/* .line 442 */
v1 = this.iaWVCclient;
(( com.inneractive.api.ads.InneractiveAdView ) p0 ).setWebChromeClient ( v1 ); // invoke-virtual {p0, v1}, Lcom/inneractive/api/ads/InneractiveAdView;->setWebChromeClient(Landroid/webkit/WebChromeClient;)V
/* .line 443 */
(( com.inneractive.api.ads.InneractiveAdView ) p0 ).getSettings ( ); // invoke-virtual {p0}, Lcom/inneractive/api/ads/InneractiveAdView;->getSettings()Landroid/webkit/WebSettings;
int v2 = 1; // const/4 v2, 0x1
(( android.webkit.WebSettings ) v1 ).setLoadsImagesAutomatically ( v2 ); // invoke-virtual {v1, v2}, Landroid/webkit/WebSettings;->setLoadsImagesAutomatically(Z)V
/* .line 444 */
(( com.inneractive.api.ads.InneractiveAdView ) p0 ).getSettings ( ); // invoke-virtual {p0}, Lcom/inneractive/api/ads/InneractiveAdView;->getSettings()Landroid/webkit/WebSettings;
int v2 = 1; // const/4 v2, 0x1
(( android.webkit.WebSettings ) v1 ).setPluginsEnabled ( v2 ); // invoke-virtual {v1, v2}, Landroid/webkit/WebSettings;->setPluginsEnabled(Z)V
/* .line 445 */
(( com.inneractive.api.ads.InneractiveAdView ) p0 ).getSettings ( ); // invoke-virtual {p0}, Lcom/inneractive/api/ads/InneractiveAdView;->getSettings()Landroid/webkit/WebSettings;
int v2 = 1; // const/4 v2, 0x1
(( android.webkit.WebSettings ) v1 ).setJavaScriptCanOpenWindowsAutomatically ( v2 ); // invoke-virtual {v1, v2}, Landroid/webkit/WebSettings;->setJavaScriptCanOpenWindowsAutomatically(Z)V
/* .line 446 */
(( com.inneractive.api.ads.InneractiveAdView ) p0 ).getSettings ( ); // invoke-virtual {p0}, Lcom/inneractive/api/ads/InneractiveAdView;->getSettings()Landroid/webkit/WebSettings;
int v2 = 0; // const/4 v2, 0x0
(( android.webkit.WebSettings ) v1 ).setSaveFormData ( v2 ); // invoke-virtual {v1, v2}, Landroid/webkit/WebSettings;->setSaveFormData(Z)V
/* .line 447 */
(( com.inneractive.api.ads.InneractiveAdView ) p0 ).getSettings ( ); // invoke-virtual {p0}, Lcom/inneractive/api/ads/InneractiveAdView;->getSettings()Landroid/webkit/WebSettings;
int v2 = 0; // const/4 v2, 0x0
(( android.webkit.WebSettings ) v1 ).setSavePassword ( v2 ); // invoke-virtual {v1, v2}, Landroid/webkit/WebSettings;->setSavePassword(Z)V
/* .line 449 */
int v1 = 0; // const/4 v1, 0x0
(( com.inneractive.api.ads.InneractiveAdView ) p0 ).setBackgroundColor ( v1 ); // invoke-virtual {p0, v1}, Lcom/inneractive/api/ads/InneractiveAdView;->setBackgroundColor(I)V
/* .line 450 */
/* iget v1, p0, Lcom/inneractive/api/ads/InneractiveAdView;->adType:I */
/* if-nez v1, :cond_0 */
/* .line 451 */
/* const/high16 v1, -0x1000000 */
(( com.inneractive.api.ads.InneractiveAdView ) p0 ).setBackgroundColor ( v1 ); // invoke-virtual {p0, v1}, Lcom/inneractive/api/ads/InneractiveAdView;->setBackgroundColor(I)V
/* .line 453 */
} // :cond_0
v1 = this.iaWebClient;
(( com.inneractive.api.ads.InneractiveAdView ) p0 ).setWebViewClient ( v1 ); // invoke-virtual {p0, v1}, Lcom/inneractive/api/ads/InneractiveAdView;->setWebViewClient(Landroid/webkit/WebViewClient;)V
/* .line 455 */
int v1 = 0; // const/4 v1, 0x0
(( com.inneractive.api.ads.InneractiveAdView ) p0 ).setScrollBarStyle ( v1 ); // invoke-virtual {p0, v1}, Lcom/inneractive/api/ads/InneractiveAdView;->setScrollBarStyle(I)V
/* .line 456 */
int v1 = 0; // const/4 v1, 0x0
(( com.inneractive.api.ads.InneractiveAdView ) p0 ).setVerticalScrollBarEnabled ( v1 ); // invoke-virtual {p0, v1}, Lcom/inneractive/api/ads/InneractiveAdView;->setVerticalScrollBarEnabled(Z)V
/* .line 457 */
int v1 = 0; // const/4 v1, 0x0
(( com.inneractive.api.ads.InneractiveAdView ) p0 ).setHorizontalScrollBarEnabled ( v1 ); // invoke-virtual {p0, v1}, Lcom/inneractive/api/ads/InneractiveAdView;->setHorizontalScrollBarEnabled(Z)V
/* .line 458 */
/* new-instance v1, Landroid/view/animation/AlphaAnimation; */
/* const/high16 v2, 0x3f800000 # 1.0f */
int v3 = 0; // const/4 v3, 0x0
/* invoke-direct {v1, v2, v3}, Landroid/view/animation/AlphaAnimation;-><init>(FF)V */
this.fadeOutAnimation = v1;
/* .line 459 */
/* new-instance v1, Landroid/view/animation/AlphaAnimation; */
int v2 = 0; // const/4 v2, 0x0
/* const/high16 v3, 0x3f800000 # 1.0f */
/* invoke-direct {v1, v2, v3}, Landroid/view/animation/AlphaAnimation;-><init>(FF)V */
this.fadeInAnimation = v1;
/* .line 461 */
(( com.inneractive.api.ads.InneractiveAdView ) p0 ).requestAd ( ); // invoke-virtual {p0}, Lcom/inneractive/api/ads/InneractiveAdView;->requestAd()V
/* :try_end_0 */
/* .catch Ljava/lang/Exception; {:try_start_0 ..:try_end_0} :catch_1 */
/* .line 489 */
} // :cond_1
} // :goto_0
return;
/* .line 474 */
} // :cond_2
v1 = this.listener;
if ( v1 != null) { // if-eqz v1, :cond_1
/* .line 478 */
try { // :try_start_1
v1 = this.listener;
/* .line 479 */
final String v1 = "inneractive"; // const-string v1, "inneractive"
final String v2 = "onFailedToReceiveAd - Cannot request an ad without Internet permissions! Open manifest.xml and just before the final </manifest> tag add: <uses-permission android:name=\"android.permission.INTERNET\" />"; // const-string v2, "onFailedToReceiveAd - Cannot request an ad without Internet permissions! Open manifest.xml and just before the final </manifest> tag add: <uses-permission android:name=\"android.permission.INTERNET\" />"
android.util.Log .i ( v1,v2 );
/* :try_end_1 */
/* .catch Ljava/lang/Exception; {:try_start_1 ..:try_end_1} :catch_0 */
/* .line 483 */
/* :catch_0 */
/* move-exception v0 */
/* .line 485 */
/* .local v0, "e":Ljava/lang/Exception; */
final String v1 = "inneractive"; // const-string v1, "inneractive"
final String v2 = "onFailedToReceiveAd - catch"; // const-string v2, "onFailedToReceiveAd - catch"
android.util.Log .w ( v1,v2,v0 );
/* .line 466 */
} // .end local v0 # "e":Ljava/lang/Exception;
/* :catch_1 */
/* move-exception v1 */
} // .end method
protected Boolean isInternetPermissionExist ( ) {
/* .locals 2 */
/* .prologue */
/* .line 878 */
v0 = this.appContext;
final String v1 = "android.permission.INTERNET"; // const-string v1, "android.permission.INTERNET"
v0 = (( android.content.Context ) v0 ).checkCallingOrSelfPermission ( v1 ); // invoke-virtual {v0, v1}, Landroid/content/Context;->checkCallingOrSelfPermission(Ljava/lang/String;)I
int v1 = -1; // const/4 v1, -0x1
/* if-ne v0, v1, :cond_0 */
/* .line 880 */
final String v0 = "inneractive"; // const-string v0, "inneractive"
final String v1 = "Cannot request an ad without Internet permissions! Open manifest.xml and just before the final </manifest> tag add: <uses-permission android:name=\"android.permission.INTERNET\" />"; // const-string v1, "Cannot request an ad without Internet permissions! Open manifest.xml and just before the final </manifest> tag add: <uses-permission android:name=\"android.permission.INTERNET\" />"
android.util.Log .w ( v0,v1 );
/* .line 883 */
int v0 = 0; // const/4 v0, 0x0
/* .line 887 */
} // :goto_0
} // :cond_0
int v0 = 1; // const/4 v0, 0x1
} // .end method
protected void onMeasure ( Integer p0, Integer p1 ) {
/* .locals 3 */
/* .param p1, "w" # I */
/* .param p2, "h" # I */
/* .prologue */
/* .line 1140 */
/* invoke-super {p0, p1, p2}, Landroid/webkit/WebView;->onMeasure(II)V */
/* .line 1141 */
final String v0 = "inneractive"; // const-string v0, "inneractive"
/* new-instance v1, Ljava/lang/StringBuilder; */
final String v2 = "screenwidth = "; // const-string v2, "screenwidth = "
/* invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V */
/* iget v2, p0, Lcom/inneractive/api/ads/InneractiveAdView;->screenWidth:I */
(( java.lang.StringBuilder ) v1 ).append ( v2 ); // invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;
final String v2 = " screenheight = "; // const-string v2, " screenheight = "
(( java.lang.StringBuilder ) v1 ).append ( v2 ); // invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
/* iget v2, p0, Lcom/inneractive/api/ads/InneractiveAdView;->screenHeight:I */
(( java.lang.StringBuilder ) v1 ).append ( v2 ); // invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v1 ).toString ( ); // invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
android.util.Log .i ( v0,v1 );
/* .line 1151 */
return;
} // .end method
public void onWindowFocusChanged ( Boolean p0 ) {
/* .locals 3 */
/* .param p1, "hasWindowFocus" # Z */
/* .prologue */
/* .line 1336 */
/* if-nez p1, :cond_0 */
/* .line 1337 */
final String v0 = "inneractive"; // const-string v0, "inneractive"
final String v1 = "focus changed...set refresh interval to 0"; // const-string v1, "focus changed...set refresh interval to 0"
android.util.Log .i ( v0,v1 );
/* .line 1338 */
int v0 = 0; // const/4 v0, 0x0
(( com.inneractive.api.ads.InneractiveAdView ) p0 ).setRefreshInterval ( v0 ); // invoke-virtual {p0, v0}, Lcom/inneractive/api/ads/InneractiveAdView;->setRefreshInterval(I)V
/* .line 1344 */
} // :goto_0
return;
/* .line 1341 */
} // :cond_0
final String v0 = "inneractive"; // const-string v0, "inneractive"
/* new-instance v1, Ljava/lang/StringBuilder; */
final String v2 = "focus changed...set refresh interval to "; // const-string v2, "focus changed...set refresh interval to "
/* invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V */
/* iget v2, p0, Lcom/inneractive/api/ads/InneractiveAdView;->refreshInterval:I */
(( java.lang.StringBuilder ) v1 ).append ( v2 ); // invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v1 ).toString ( ); // invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
android.util.Log .i ( v0,v1 );
/* .line 1342 */
/* iget v0, p0, Lcom/inneractive/api/ads/InneractiveAdView;->refreshInterval:I */
(( com.inneractive.api.ads.InneractiveAdView ) p0 ).setRefreshInterval ( v0 ); // invoke-virtual {p0, v0}, Lcom/inneractive/api/ads/InneractiveAdView;->setRefreshInterval(I)V
} // .end method
protected synchronized void requestAd ( ) {
/* .locals 2 */
/* .prologue */
/* .line 609 */
/* monitor-enter p0 */
try { // :try_start_0
v0 = this.iaWebClient;
int v1 = 0; // const/4 v1, 0x0
(( com.inneractive.api.ads.InneractiveAdView$IAwebViewClient ) v0 ).setDidFinishLoad ( v1 ); // invoke-virtual {v0, v1}, Lcom/inneractive/api/ads/InneractiveAdView$IAwebViewClient;->setDidFinishLoad(Z)V
/* .line 613 */
/* new-instance v0, Lcom/inneractive/api/ads/InneractiveAdView$2; */
/* invoke-direct {v0, p0}, Lcom/inneractive/api/ads/InneractiveAdView$2;-><init>(Lcom/inneractive/api/ads/InneractiveAdView;)V */
/* .line 705 */
(( com.inneractive.api.ads.InneractiveAdView$2 ) v0 ).start ( ); // invoke-virtual {v0}, Lcom/inneractive/api/ads/InneractiveAdView$2;->start()V
/* :try_end_0 */
/* .catchall {:try_start_0 ..:try_end_0} :catchall_0 */
/* .line 709 */
/* monitor-exit p0 */
return;
/* .line 609 */
/* :catchall_0 */
/* move-exception v0 */
/* monitor-exit p0 */
/* throw v0 */
} // .end method
public void setListener ( com.inneractive.api.ads.InneractiveAdEventsListener p0 ) {
/* .locals 1 */
/* .param p1, "listener" # Lcom/inneractive/api/ads/InneractiveAdEventsListener; */
/* .prologue */
/* .line 1352 */
/* monitor-enter p0 */
/* .line 1354 */
try { // :try_start_0
this.listener = p1;
/* .line 1352 */
/* monitor-exit p0 */
/* .line 1356 */
return;
/* .line 1352 */
/* :catchall_0 */
/* move-exception v0 */
/* monitor-exit p0 */
/* :try_end_0 */
/* .catchall {:try_start_0 ..:try_end_0} :catchall_0 */
/* throw v0 */
} // .end method
public synchronized void setRefreshInterval ( Integer p0 ) {
/* .locals 3 */
/* .param p1, "seconds" # I */
/* .prologue */
/* .line 714 */
/* monitor-enter p0 */
try { // :try_start_0
/* iput p1, p0, Lcom/inneractive/api/ads/InneractiveAdView;->refreshInterval:I */
/* .line 715 */
com.inneractive.api.ads.InneractiveAdViewScheduler .getInstance ( );
/* new-instance v1, Lcom/inneractive/api/ads/InneractiveRefreshTask; */
/* invoke-direct {v1, p0}, Lcom/inneractive/api/ads/InneractiveRefreshTask;-><init>(Lcom/inneractive/api/ads/InneractiveAdView;)V */
/* iget v2, p0, Lcom/inneractive/api/ads/InneractiveAdView;->refreshInterval:I */
(( com.inneractive.api.ads.InneractiveAdViewScheduler ) v0 ).scheduleTask ( v1, v2 ); // invoke-virtual {v0, v1, v2}, Lcom/inneractive/api/ads/InneractiveAdViewScheduler;->scheduleTask(Ljava/util/TimerTask;I)V
/* :try_end_0 */
/* .catchall {:try_start_0 ..:try_end_0} :catchall_0 */
/* .line 716 */
/* monitor-exit p0 */
return;
/* .line 714 */
/* :catchall_0 */
/* move-exception v0 */
/* monitor-exit p0 */
/* throw v0 */
} // .end method
