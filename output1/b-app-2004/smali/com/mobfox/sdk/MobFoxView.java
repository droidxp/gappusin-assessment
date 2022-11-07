public class com.mobfox.sdk.MobFoxView extends android.widget.RelativeLayout {
	 /* .source "MobFoxView.java" */
	 /* # instance fields */
	 private Boolean animation;
	 private com.mobfox.sdk.BannerListener bannerListener;
	 Integer count;
	 private android.view.animation.Animation fadeInAnimation;
	 private android.view.animation.Animation fadeOutAnimation;
	 private android.webkit.WebView firstWebView;
	 private Boolean includeLocation;
	 private Integer isAccessCoarseLocation;
	 private Integer isAccessFineLocation;
	 Boolean isInternalBrowser;
	 private java.lang.Thread loadContentThread;
	 private android.location.LocationManager locationManager;
	 private com.mobfox.sdk.Mode mode;
	 private android.view.View$OnTouchListener onTouchListener;
	 private java.lang.String publisherId;
	 private java.util.Timer reloadTimer;
	 private com.mobfox.sdk.data.Request request;
	 private com.mobfox.sdk.data.Response response;
	 private android.webkit.WebView secondWebView;
	 final java.lang.Runnable showContent;
	 private Integer telephonyPermission;
	 private Boolean touchMove;
	 final android.os.Handler updateHandler;
	 private android.widget.ViewFlipper viewFlipper;
	 private android.webkit.WebSettings webSettings;
	 /* # direct methods */
	 public com.mobfox.sdk.MobFoxView ( ) {
		 /* .locals 11 */
		 /* .param p1, "context" # Landroid/content/Context; */
		 /* .param p2, "attributes" # Landroid/util/AttributeSet; */
		 /* .prologue */
		 int v6 = 0; // const/4 v6, 0x0
		 int v10 = 3; // const/4 v10, 0x3
		 int v9 = 0; // const/4 v9, 0x0
		 /* .line 183 */
		 /* invoke-direct {p0, p1, p2}, Landroid/widget/RelativeLayout;-><init>(Landroid/content/Context;Landroid/util/AttributeSet;)V */
		 /* .line 65 */
		 /* iput-boolean v9, p0, Lcom/mobfox/sdk/MobFoxView;->includeLocation:Z */
		 /* .line 71 */
		 /* iput-boolean v9, p0, Lcom/mobfox/sdk/MobFoxView;->isInternalBrowser:Z */
		 /* .line 74 */
		 this.fadeInAnimation = v6;
		 /* .line 75 */
		 this.fadeOutAnimation = v6;
		 /* .line 95 */
		 /* new-instance v6, Landroid/os/Handler; */
		 /* invoke-direct {v6}, Landroid/os/Handler;-><init>()V */
		 this.updateHandler = v6;
		 /* .line 97 */
		 /* new-instance v6, Lcom/mobfox/sdk/MobFoxView$1; */
		 /* invoke-direct {v6, p0}, Lcom/mobfox/sdk/MobFoxView$1;-><init>(Lcom/mobfox/sdk/MobFoxView;)V */
		 this.showContent = v6;
		 /* .line 103 */
		 /* new-instance v6, Lcom/mobfox/sdk/MobFoxView$2; */
		 /* invoke-direct {v6, p0}, Lcom/mobfox/sdk/MobFoxView$2;-><init>(Lcom/mobfox/sdk/MobFoxView;)V */
		 this.onTouchListener = v6;
		 /* .line 452 */
		 /* iput v9, p0, Lcom/mobfox/sdk/MobFoxView;->count:I */
		 /* .line 185 */
		 if ( p2 != null) { // if-eqz p2, :cond_6
			 v0 = 			 /* .line 186 */
			 /* .line 187 */
			 /* .local v0, "count":I */
			 int v2 = 0; // const/4 v2, 0x0
			 /* .local v2, "i":I */
		 } // :goto_0
		 /* if-ge v2, v0, :cond_6 */
		 /* .line 188 */
		 /* .line 189 */
		 /* .local v4, "name":Ljava/lang/String; */
		 final String v6 = "publisherId"; // const-string v6, "publisherId"
		 v6 = 		 (( java.lang.String ) v4 ).equals ( v6 ); // invoke-virtual {v4, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
		 if ( v6 != null) { // if-eqz v6, :cond_2
			 v5 = 			 /* .line 190 */
			 /* .line 191 */
			 /* .local v5, "resId":I */
			 if ( v5 != null) { // if-eqz v5, :cond_1
				 /* .line 193 */
				 try { // :try_start_0
					 (( android.content.Context ) p1 ).getString ( v5 ); // invoke-virtual {p1, v5}, Landroid/content/Context;->getString(I)Ljava/lang/String;
					 this.publisherId = v6;
					 /* :try_end_0 */
					 /* .catch Ljava/lang/Exception; {:try_start_0 ..:try_end_0} :catch_0 */
					 /* .line 200 */
				 } // :goto_1
				 final String v6 = "MOBFOX"; // const-string v6, "MOBFOX"
				 v6 = 				 android.util.Log .isLoggable ( v6,v10 );
				 if ( v6 != null) { // if-eqz v6, :cond_0
					 /* .line 201 */
					 final String v6 = "MOBFOX"; // const-string v6, "MOBFOX"
					 /* new-instance v7, Ljava/lang/StringBuilder; */
					 /* invoke-direct {v7}, Ljava/lang/StringBuilder;-><init>()V */
					 final String v8 = "MobFox Publisher Id:"; // const-string v8, "MobFox Publisher Id:"
					 (( java.lang.StringBuilder ) v7 ).append ( v8 ); // invoke-virtual {v7, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
					 v8 = this.publisherId;
					 (( java.lang.StringBuilder ) v7 ).append ( v8 ); // invoke-virtual {v7, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
					 (( java.lang.StringBuilder ) v7 ).toString ( ); // invoke-virtual {v7}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
					 android.util.Log .d ( v6,v7 );
					 /* .line 187 */
				 } // .end local v5 # "resId":I
			 } // :cond_0
		 } // :goto_2
		 /* add-int/lit8 v2, v2, 0x1 */
		 /* .line 194 */
		 /* .restart local v5 # "resId":I */
		 /* :catch_0 */
		 /* move-exception v1 */
		 /* .line 195 */
		 /* .local v1, "e":Ljava/lang/Exception; */
		 this.publisherId = v6;
		 /* .line 198 */
	 } // .end local v1 # "e":Ljava/lang/Exception;
} // :cond_1
this.publisherId = v6;
/* .line 203 */
} // .end local v5 # "resId":I
} // :cond_2
final String v6 = "mode"; // const-string v6, "mode"
v6 = (( java.lang.String ) v4 ).equals ( v6 ); // invoke-virtual {v4, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
if ( v6 != null) { // if-eqz v6, :cond_4
/* .line 204 */
/* .line 205 */
/* .local v3, "modeValue":Ljava/lang/String; */
if ( v3 != null) { // if-eqz v3, :cond_3
final String v6 = "test"; // const-string v6, "test"
v6 = (( java.lang.String ) v3 ).equalsIgnoreCase ( v6 ); // invoke-virtual {v3, v6}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z
if ( v6 != null) { // if-eqz v6, :cond_3
	 /* .line 206 */
	 v6 = com.mobfox.sdk.Mode.TEST;
	 this.mode = v6;
	 /* .line 208 */
} // :cond_3
final String v6 = "MOBFOX"; // const-string v6, "MOBFOX"
v6 = android.util.Log .isLoggable ( v6,v10 );
if ( v6 != null) { // if-eqz v6, :cond_0
	 /* .line 209 */
	 final String v6 = "MOBFOX"; // const-string v6, "MOBFOX"
	 /* new-instance v7, Ljava/lang/StringBuilder; */
	 /* invoke-direct {v7}, Ljava/lang/StringBuilder;-><init>()V */
	 final String v8 = "MobFox Mode:"; // const-string v8, "MobFox Mode:"
	 (( java.lang.StringBuilder ) v7 ).append ( v8 ); // invoke-virtual {v7, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
	 (( java.lang.StringBuilder ) v7 ).append ( v3 ); // invoke-virtual {v7, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
	 (( java.lang.StringBuilder ) v7 ).toString ( ); // invoke-virtual {v7}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
	 android.util.Log .d ( v6,v7 );
	 /* .line 211 */
} // .end local v3 # "modeValue":Ljava/lang/String;
} // :cond_4
final String v6 = "animation"; // const-string v6, "animation"
v6 = (( java.lang.String ) v4 ).equals ( v6 ); // invoke-virtual {v4, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
if ( v6 != null) { // if-eqz v6, :cond_5
v6 = /* .line 212 */
/* iput-boolean v6, p0, Lcom/mobfox/sdk/MobFoxView;->animation:Z */
/* .line 213 */
final String v6 = "MOBFOX"; // const-string v6, "MOBFOX"
v6 = android.util.Log .isLoggable ( v6,v10 );
if ( v6 != null) { // if-eqz v6, :cond_0
	 /* .line 214 */
	 final String v6 = "MOBFOX"; // const-string v6, "MOBFOX"
	 /* new-instance v7, Ljava/lang/StringBuilder; */
	 /* invoke-direct {v7}, Ljava/lang/StringBuilder;-><init>()V */
	 final String v8 = "MobFox Animation:"; // const-string v8, "MobFox Animation:"
	 (( java.lang.StringBuilder ) v7 ).append ( v8 ); // invoke-virtual {v7, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
	 /* iget-boolean v8, p0, Lcom/mobfox/sdk/MobFoxView;->animation:Z */
	 (( java.lang.StringBuilder ) v7 ).append ( v8 ); // invoke-virtual {v7, v8}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;
	 (( java.lang.StringBuilder ) v7 ).toString ( ); // invoke-virtual {v7}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
	 android.util.Log .d ( v6,v7 );
	 /* .line 216 */
} // :cond_5
final String v6 = "includeLocation"; // const-string v6, "includeLocation"
v6 = (( java.lang.String ) v4 ).equals ( v6 ); // invoke-virtual {v4, v6}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
if ( v6 != null) { // if-eqz v6, :cond_0
	 v6 = 	 /* .line 217 */
	 /* iput-boolean v6, p0, Lcom/mobfox/sdk/MobFoxView;->includeLocation:Z */
	 /* .line 218 */
	 final String v6 = "MOBFOX"; // const-string v6, "MOBFOX"
	 v6 = 	 android.util.Log .isLoggable ( v6,v10 );
	 if ( v6 != null) { // if-eqz v6, :cond_0
		 /* .line 219 */
		 final String v6 = "MOBFOX"; // const-string v6, "MOBFOX"
		 /* new-instance v7, Ljava/lang/StringBuilder; */
		 /* invoke-direct {v7}, Ljava/lang/StringBuilder;-><init>()V */
		 final String v8 = "MobFox includeLocation:"; // const-string v8, "MobFox includeLocation:"
		 (( java.lang.StringBuilder ) v7 ).append ( v8 ); // invoke-virtual {v7, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
		 /* iget-boolean v8, p0, Lcom/mobfox/sdk/MobFoxView;->includeLocation:Z */
		 (( java.lang.StringBuilder ) v7 ).append ( v8 ); // invoke-virtual {v7, v8}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;
		 (( java.lang.StringBuilder ) v7 ).toString ( ); // invoke-virtual {v7}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
		 android.util.Log .d ( v6,v7 );
		 /* goto/16 :goto_2 */
		 /* .line 224 */
	 } // .end local v0 # "count":I
} // .end local v2 # "i":I
} // .end local v4 # "name":Ljava/lang/String;
} // :cond_6
/* invoke-direct {p0, p1}, Lcom/mobfox/sdk/MobFoxView;->initialize(Landroid/content/Context;)V */
/* .line 225 */
return;
} // .end method
public com.mobfox.sdk.MobFoxView ( ) {
/* .locals 2 */
/* .param p1, "context" # Landroid/content/Context; */
/* .param p2, "publisherId" # Ljava/lang/String; */
/* .param p3, "mode" # Lcom/mobfox/sdk/Mode; */
/* .param p4, "includeLocation" # Z */
/* .param p5, "animation" # Z */
/* .prologue */
int v0 = 0; // const/4 v0, 0x0
int v1 = 0; // const/4 v1, 0x0
/* .line 169 */
/* invoke-direct {p0, p1}, Landroid/widget/RelativeLayout;-><init>(Landroid/content/Context;)V */
/* .line 65 */
/* iput-boolean v1, p0, Lcom/mobfox/sdk/MobFoxView;->includeLocation:Z */
/* .line 71 */
/* iput-boolean v1, p0, Lcom/mobfox/sdk/MobFoxView;->isInternalBrowser:Z */
/* .line 74 */
this.fadeInAnimation = v0;
/* .line 75 */
this.fadeOutAnimation = v0;
/* .line 95 */
/* new-instance v0, Landroid/os/Handler; */
/* invoke-direct {v0}, Landroid/os/Handler;-><init>()V */
this.updateHandler = v0;
/* .line 97 */
/* new-instance v0, Lcom/mobfox/sdk/MobFoxView$1; */
/* invoke-direct {v0, p0}, Lcom/mobfox/sdk/MobFoxView$1;-><init>(Lcom/mobfox/sdk/MobFoxView;)V */
this.showContent = v0;
/* .line 103 */
/* new-instance v0, Lcom/mobfox/sdk/MobFoxView$2; */
/* invoke-direct {v0, p0}, Lcom/mobfox/sdk/MobFoxView$2;-><init>(Lcom/mobfox/sdk/MobFoxView;)V */
this.onTouchListener = v0;
/* .line 452 */
/* iput v1, p0, Lcom/mobfox/sdk/MobFoxView;->count:I */
/* .line 170 */
this.publisherId = p2;
/* .line 171 */
/* iput-boolean p4, p0, Lcom/mobfox/sdk/MobFoxView;->includeLocation:Z */
/* .line 172 */
this.mode = p3;
/* .line 173 */
/* iput-boolean p5, p0, Lcom/mobfox/sdk/MobFoxView;->animation:Z */
/* .line 174 */
/* invoke-direct {p0, p1}, Lcom/mobfox/sdk/MobFoxView;->initialize(Landroid/content/Context;)V */
/* .line 175 */
return;
} // .end method
public com.mobfox.sdk.MobFoxView ( ) {
/* .locals 6 */
/* .param p1, "context" # Landroid/content/Context; */
/* .param p2, "publisherId" # Ljava/lang/String; */
/* .param p3, "includeLocation" # Z */
/* .param p4, "animation" # Z */
/* .prologue */
/* .line 153 */
v3 = com.mobfox.sdk.Mode.LIVE;
/* move-object v0, p0 */
/* move-object v1, p1 */
/* move-object v2, p2 */
/* move v4, p3 */
/* move v5, p4 */
/* invoke-direct/range {v0 ..v5}, Lcom/mobfox/sdk/MobFoxView;-><init>(Landroid/content/Context;Ljava/lang/String;Lcom/mobfox/sdk/Mode;ZZ)V */
/* .line 154 */
return;
} // .end method
static void access$000 ( com.mobfox.sdk.MobFoxView p0 ) { //synthethic
/* .locals 0 */
/* .param p0, "x0" # Lcom/mobfox/sdk/MobFoxView; */
/* .prologue */
/* .line 63 */
/* invoke-direct {p0}, Lcom/mobfox/sdk/MobFoxView;->showContent()V */
return;
} // .end method
static Boolean access$100 ( com.mobfox.sdk.MobFoxView p0 ) { //synthethic
/* .locals 1 */
/* .param p0, "x0" # Lcom/mobfox/sdk/MobFoxView; */
/* .prologue */
/* .line 63 */
/* iget-boolean v0, p0, Lcom/mobfox/sdk/MobFoxView;->touchMove:Z */
} // .end method
static Boolean access$102 ( com.mobfox.sdk.MobFoxView p0, Boolean p1 ) { //synthethic
/* .locals 0 */
/* .param p0, "x0" # Lcom/mobfox/sdk/MobFoxView; */
/* .param p1, "x1" # Z */
/* .prologue */
/* .line 63 */
/* iput-boolean p1, p0, Lcom/mobfox/sdk/MobFoxView;->touchMove:Z */
} // .end method
static com.mobfox.sdk.data.Response access$200 ( com.mobfox.sdk.MobFoxView p0 ) { //synthethic
/* .locals 1 */
/* .param p0, "x0" # Lcom/mobfox/sdk/MobFoxView; */
/* .prologue */
/* .line 63 */
v0 = this.response;
} // .end method
static com.mobfox.sdk.data.Response access$202 ( com.mobfox.sdk.MobFoxView p0, com.mobfox.sdk.data.Response p1 ) { //synthethic
/* .locals 0 */
/* .param p0, "x0" # Lcom/mobfox/sdk/MobFoxView; */
/* .param p1, "x1" # Lcom/mobfox/sdk/data/Response; */
/* .prologue */
/* .line 63 */
this.response = p1;
} // .end method
static com.mobfox.sdk.data.Request access$300 ( com.mobfox.sdk.MobFoxView p0 ) { //synthethic
/* .locals 1 */
/* .param p0, "x0" # Lcom/mobfox/sdk/MobFoxView; */
/* .prologue */
/* .line 63 */
/* invoke-direct {p0}, Lcom/mobfox/sdk/MobFoxView;->getRequest()Lcom/mobfox/sdk/data/Request; */
} // .end method
static java.lang.Thread access$402 ( com.mobfox.sdk.MobFoxView p0, java.lang.Thread p1 ) { //synthethic
/* .locals 0 */
/* .param p0, "x0" # Lcom/mobfox/sdk/MobFoxView; */
/* .param p1, "x1" # Ljava/lang/Thread; */
/* .prologue */
/* .line 63 */
this.loadContentThread = p1;
} // .end method
static com.mobfox.sdk.BannerListener access$500 ( com.mobfox.sdk.MobFoxView p0 ) { //synthethic
/* .locals 1 */
/* .param p0, "x0" # Lcom/mobfox/sdk/MobFoxView; */
/* .prologue */
/* .line 63 */
v0 = this.bannerListener;
} // .end method
private java.lang.String buildUserAgent ( ) {
/* .locals 11 */
/* .prologue */
/* .line 373 */
v1 = android.os.Build$VERSION.RELEASE;
/* .line 374 */
/* .local v1, "androidVersion":Ljava/lang/String; */
v6 = android.os.Build.MODEL;
/* .line 375 */
/* .local v6, "model":Ljava/lang/String; */
v0 = android.os.Build.ID;
/* .line 376 */
/* .local v0, "androidBuild":Ljava/lang/String; */
java.util.Locale .getDefault ( );
/* .line 377 */
/* .local v3, "l":Ljava/util/Locale; */
(( java.util.Locale ) v3 ).getLanguage ( ); // invoke-virtual {v3}, Ljava/util/Locale;->getLanguage()Ljava/lang/String;
/* .line 378 */
/* .local v4, "language":Ljava/lang/String; */
final String v5 = "en"; // const-string v5, "en"
/* .line 379 */
/* .local v5, "locale":Ljava/lang/String; */
if ( v4 != null) { // if-eqz v4, :cond_0
/* .line 380 */
(( java.lang.String ) v4 ).toLowerCase ( ); // invoke-virtual {v4}, Ljava/lang/String;->toLowerCase()Ljava/lang/String;
/* .line 381 */
(( java.util.Locale ) v3 ).getCountry ( ); // invoke-virtual {v3}, Ljava/util/Locale;->getCountry()Ljava/lang/String;
/* .line 382 */
/* .local v2, "country":Ljava/lang/String; */
if ( v2 != null) { // if-eqz v2, :cond_0
/* .line 383 */
/* new-instance v8, Ljava/lang/StringBuilder; */
/* invoke-direct {v8}, Ljava/lang/StringBuilder;-><init>()V */
(( java.lang.StringBuilder ) v8 ).append ( v5 ); // invoke-virtual {v8, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
final String v9 = "-"; // const-string v9, "-"
(( java.lang.StringBuilder ) v8 ).append ( v9 ); // invoke-virtual {v8, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.String ) v2 ).toLowerCase ( ); // invoke-virtual {v2}, Ljava/lang/String;->toLowerCase()Ljava/lang/String;
(( java.lang.StringBuilder ) v8 ).append ( v9 ); // invoke-virtual {v8, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v8 ).toString ( ); // invoke-virtual {v8}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
/* .line 387 */
} // .end local v2 # "country":Ljava/lang/String;
} // :cond_0
final String v8 = "Mozilla/5.0 (Linux; U; Android %1$s; %2$s; %3$s Build/%4$s) AppleWebKit/533.1 (KHTML, like Gecko) Version/4.0 Mobile Safari/533.1"; // const-string v8, "Mozilla/5.0 (Linux; U; Android %1$s; %2$s; %3$s Build/%4$s) AppleWebKit/533.1 (KHTML, like Gecko) Version/4.0 Mobile Safari/533.1"
int v9 = 4; // const/4 v9, 0x4
/* new-array v9, v9, [Ljava/lang/Object; */
int v10 = 0; // const/4 v10, 0x0
/* aput-object v1, v9, v10 */
int v10 = 1; // const/4 v10, 0x1
/* aput-object v5, v9, v10 */
int v10 = 2; // const/4 v10, 0x2
/* aput-object v6, v9, v10 */
int v10 = 3; // const/4 v10, 0x3
/* aput-object v0, v9, v10 */
java.lang.String .format ( v8,v9 );
/* .line 388 */
/* .local v7, "userAgent":Ljava/lang/String; */
} // .end method
private android.webkit.WebView createWebView ( android.content.Context p0 ) {
/* .locals 4 */
/* .param p1, "context" # Landroid/content/Context; */
/* .prologue */
int v3 = 0; // const/4 v3, 0x0
/* .line 285 */
/* new-instance v0, Lcom/mobfox/sdk/MobFoxView$4; */
(( com.mobfox.sdk.MobFoxView ) p0 ).getContext ( ); // invoke-virtual {p0}, Lcom/mobfox/sdk/MobFoxView;->getContext()Landroid/content/Context;
/* invoke-direct {v0, p0, v1}, Lcom/mobfox/sdk/MobFoxView$4;-><init>(Lcom/mobfox/sdk/MobFoxView;Landroid/content/Context;)V */
/* .line 295 */
/* .local v0, "webView":Landroid/webkit/WebView; */
(( android.webkit.WebView ) v0 ).getSettings ( ); // invoke-virtual {v0}, Landroid/webkit/WebView;->getSettings()Landroid/webkit/WebSettings;
this.webSettings = v1;
/* .line 296 */
v1 = this.webSettings;
int v2 = 1; // const/4 v2, 0x1
(( android.webkit.WebSettings ) v1 ).setJavaScriptEnabled ( v2 ); // invoke-virtual {v1, v2}, Landroid/webkit/WebSettings;->setJavaScriptEnabled(Z)V
/* .line 301 */
(( android.webkit.WebView ) v0 ).setBackgroundColor ( v3 ); // invoke-virtual {v0, v3}, Landroid/webkit/WebView;->setBackgroundColor(I)V
/* .line 303 */
/* new-instance v1, Lcom/mobfox/sdk/MobFoxWebViewClient; */
/* invoke-direct {v1, p0, p1}, Lcom/mobfox/sdk/MobFoxWebViewClient;-><init>(Lcom/mobfox/sdk/MobFoxView;Landroid/content/Context;)V */
(( android.webkit.WebView ) v0 ).setWebViewClient ( v1 ); // invoke-virtual {v0, v1}, Landroid/webkit/WebView;->setWebViewClient(Landroid/webkit/WebViewClient;)V
/* .line 305 */
(( android.webkit.WebView ) v0 ).setVerticalScrollBarEnabled ( v3 ); // invoke-virtual {v0, v3}, Landroid/webkit/WebView;->setVerticalScrollBarEnabled(Z)V
/* .line 306 */
(( android.webkit.WebView ) v0 ).setHorizontalScrollBarEnabled ( v3 ); // invoke-virtual {v0, v3}, Landroid/webkit/WebView;->setHorizontalScrollBarEnabled(Z)V
/* .line 308 */
} // .end method
private void doOpenUrl ( java.lang.String p0 ) {
/* .locals 3 */
/* .param p1, "url" # Ljava/lang/String; */
/* .prologue */
/* .line 597 */
v1 = this.response;
(( com.mobfox.sdk.data.Response ) v1 ).getClickType ( ); // invoke-virtual {v1}, Lcom/mobfox/sdk/data/Response;->getClickType()Lcom/mobfox/sdk/data/ClickType;
if ( v1 != null) { // if-eqz v1, :cond_0
v1 = this.response;
(( com.mobfox.sdk.data.Response ) v1 ).getClickType ( ); // invoke-virtual {v1}, Lcom/mobfox/sdk/data/Response;->getClickType()Lcom/mobfox/sdk/data/ClickType;
v2 = com.mobfox.sdk.data.ClickType.INAPP;
v1 = (( com.mobfox.sdk.data.ClickType ) v1 ).equals ( v2 ); // invoke-virtual {v1, v2}, Lcom/mobfox/sdk/data/ClickType;->equals(Ljava/lang/Object;)Z
if ( v1 != null) { // if-eqz v1, :cond_0
/* .line 598 */
/* new-instance v0, Landroid/content/Intent; */
(( com.mobfox.sdk.MobFoxView ) p0 ).getContext ( ); // invoke-virtual {p0}, Lcom/mobfox/sdk/MobFoxView;->getContext()Landroid/content/Context;
/* const-class v2, Lcom/mobfox/sdk/InAppWebView; */
/* invoke-direct {v0, v1, v2}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V */
/* .line 599 */
/* .local v0, "intent":Landroid/content/Intent; */
final String v1 = "REDIRECT_URI"; // const-string v1, "REDIRECT_URI"
v2 = this.response;
(( com.mobfox.sdk.data.Response ) v2 ).getClickUrl ( ); // invoke-virtual {v2}, Lcom/mobfox/sdk/data/Response;->getClickUrl()Ljava/lang/String;
(( android.content.Intent ) v0 ).putExtra ( v1, v2 ); // invoke-virtual {v0, v1, v2}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;
/* .line 600 */
(( com.mobfox.sdk.MobFoxView ) p0 ).getContext ( ); // invoke-virtual {p0}, Lcom/mobfox/sdk/MobFoxView;->getContext()Landroid/content/Context;
(( android.content.Context ) v1 ).startActivity ( v0 ); // invoke-virtual {v1, v0}, Landroid/content/Context;->startActivity(Landroid/content/Intent;)V
/* .line 605 */
} // :goto_0
return;
/* .line 602 */
} // .end local v0 # "intent":Landroid/content/Intent;
} // :cond_0
/* new-instance v0, Landroid/content/Intent; */
final String v1 = "android.intent.action.VIEW"; // const-string v1, "android.intent.action.VIEW"
android.net.Uri .parse ( p1 );
/* invoke-direct {v0, v1, v2}, Landroid/content/Intent;-><init>(Ljava/lang/String;Landroid/net/Uri;)V */
/* .line 603 */
/* .restart local v0 # "intent":Landroid/content/Intent; */
(( com.mobfox.sdk.MobFoxView ) p0 ).getContext ( ); // invoke-virtual {p0}, Lcom/mobfox/sdk/MobFoxView;->getContext()Landroid/content/Context;
(( android.content.Context ) v1 ).startActivity ( v0 ); // invoke-virtual {v1, v0}, Landroid/content/Context;->startActivity(Landroid/content/Intent;)V
} // .end method
private java.lang.String getDeviceId ( ) {
/* .locals 11 */
/* .prologue */
/* .line 312 */
(( com.mobfox.sdk.MobFoxView ) p0 ).getContext ( ); // invoke-virtual {p0}, Lcom/mobfox/sdk/MobFoxView;->getContext()Landroid/content/Context;
(( android.content.Context ) v5 ).getContentResolver ( ); // invoke-virtual {v5}, Landroid/content/Context;->getContentResolver()Landroid/content/ContentResolver;
final String v6 = "android_id"; // const-string v6, "android_id"
android.provider.Settings$Secure .getString ( v5,v6 );
/* .line 313 */
/* .local v0, "androidId":Ljava/lang/String; */
if ( v0 != null) { // if-eqz v0, :cond_0
final String v5 = "9774d56d682e549c"; // const-string v5, "9774d56d682e549c"
v5 = (( java.lang.String ) v0 ).equals ( v5 ); // invoke-virtual {v0, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
/* if-nez v5, :cond_0 */
final String v5 = "0000000000000000"; // const-string v5, "0000000000000000"
v5 = (( java.lang.String ) v0 ).equals ( v5 ); // invoke-virtual {v0, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
if ( v5 != null) { // if-eqz v5, :cond_2
/* .line 314 */
} // :cond_0
(( com.mobfox.sdk.MobFoxView ) p0 ).getContext ( ); // invoke-virtual {p0}, Lcom/mobfox/sdk/MobFoxView;->getContext()Landroid/content/Context;
android.preference.PreferenceManager .getDefaultSharedPreferences ( v5 );
/* .line 315 */
/* .local v3, "prefs":Landroid/content/SharedPreferences; */
final String v5 = "mobfox_device_id"; // const-string v5, "mobfox_device_id"
int v6 = 0; // const/4 v6, 0x0
/* .line 316 */
/* if-nez v0, :cond_1 */
/* .line 318 */
try { // :try_start_0
java.util.UUID .randomUUID ( );
(( java.util.UUID ) v5 ).toString ( ); // invoke-virtual {v5}, Ljava/util/UUID;->toString()Ljava/lang/String;
/* .line 319 */
/* .local v4, "uuid":Ljava/lang/String; */
final String v5 = "MD5"; // const-string v5, "MD5"
java.security.MessageDigest .getInstance ( v5 );
/* .line 320 */
/* .local v1, "digest":Ljava/security/MessageDigest; */
(( java.lang.String ) v4 ).getBytes ( ); // invoke-virtual {v4}, Ljava/lang/String;->getBytes()[B
int v6 = 0; // const/4 v6, 0x0
v7 = (( java.lang.String ) v4 ).length ( ); // invoke-virtual {v4}, Ljava/lang/String;->length()I
(( java.security.MessageDigest ) v1 ).update ( v5, v6, v7 ); // invoke-virtual {v1, v5, v6, v7}, Ljava/security/MessageDigest;->update([BII)V
/* .line 321 */
final String v5 = "%032X"; // const-string v5, "%032X"
int v6 = 1; // const/4 v6, 0x1
/* new-array v6, v6, [Ljava/lang/Object; */
int v7 = 0; // const/4 v7, 0x0
/* new-instance v8, Ljava/math/BigInteger; */
int v9 = 1; // const/4 v9, 0x1
(( java.security.MessageDigest ) v1 ).digest ( ); // invoke-virtual {v1}, Ljava/security/MessageDigest;->digest()[B
/* invoke-direct {v8, v9, v10}, Ljava/math/BigInteger;-><init>(I[B)V */
/* aput-object v8, v6, v7 */
java.lang.String .format ( v5,v6 );
int v6 = 0; // const/4 v6, 0x0
/* const/16 v7, 0x10 */
(( java.lang.String ) v5 ).substring ( v6, v7 ); // invoke-virtual {v5, v6, v7}, Ljava/lang/String;->substring(II)Ljava/lang/String;
/* :try_end_0 */
/* .catch Ljava/lang/Exception; {:try_start_0 ..:try_end_0} :catch_0 */
/* .line 326 */
} // .end local v1 # "digest":Ljava/security/MessageDigest;
} // .end local v4 # "uuid":Ljava/lang/String;
} // :goto_0
final String v6 = "mobfox_device_id"; // const-string v6, "mobfox_device_id"
/* .line 328 */
} // :cond_1
final String v5 = "MOBFOX"; // const-string v5, "MOBFOX"
int v6 = 3; // const/4 v6, 0x3
v5 = android.util.Log .isLoggable ( v5,v6 );
if ( v5 != null) { // if-eqz v5, :cond_2
/* .line 329 */
final String v5 = "MOBFOX"; // const-string v5, "MOBFOX"
/* new-instance v6, Ljava/lang/StringBuilder; */
/* invoke-direct {v6}, Ljava/lang/StringBuilder;-><init>()V */
final String v7 = "Unknown Android ID using pseudo unique id:"; // const-string v7, "Unknown Android ID using pseudo unique id:"
(( java.lang.StringBuilder ) v6 ).append ( v7 ); // invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v6 ).append ( v0 ); // invoke-virtual {v6, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v6 ).toString ( ); // invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
android.util.Log .d ( v5,v6 );
/* .line 332 */
} // .end local v3 # "prefs":Landroid/content/SharedPreferences;
} // :cond_2
/* .line 322 */
/* .restart local v3 # "prefs":Landroid/content/SharedPreferences; */
/* :catch_0 */
/* move-exception v2 */
/* .line 323 */
/* .local v2, "e":Ljava/lang/Exception; */
final String v5 = "MOBFOX"; // const-string v5, "MOBFOX"
final String v6 = "Could not generate pseudo unique id"; // const-string v6, "Could not generate pseudo unique id"
android.util.Log .d ( v5,v6,v2 );
/* .line 324 */
final String v0 = "9774d56d682e549c"; // const-string v0, "9774d56d682e549c"
} // .end method
private android.location.Location getLocation ( ) {
/* .locals 4 */
/* .prologue */
/* .line 524 */
v2 = this.locationManager;
if ( v2 != null) { // if-eqz v2, :cond_1
/* .line 525 */
/* iget v2, p0, Lcom/mobfox/sdk/MobFoxView;->isAccessFineLocation:I */
/* if-nez v2, :cond_0 */
/* .line 526 */
v2 = this.locationManager;
final String v3 = "gps"; // const-string v3, "gps"
v0 = (( android.location.LocationManager ) v2 ).isProviderEnabled ( v3 ); // invoke-virtual {v2, v3}, Landroid/location/LocationManager;->isProviderEnabled(Ljava/lang/String;)Z
/* .line 527 */
/* .local v0, "isGpsEnabled":Z */
if ( v0 != null) { // if-eqz v0, :cond_0
/* .line 528 */
v2 = this.locationManager;
final String v3 = "gps"; // const-string v3, "gps"
(( android.location.LocationManager ) v2 ).getLastKnownLocation ( v3 ); // invoke-virtual {v2, v3}, Landroid/location/LocationManager;->getLastKnownLocation(Ljava/lang/String;)Landroid/location/Location;
/* .line 539 */
} // .end local v0 # "isGpsEnabled":Z
} // :goto_0
/* .line 531 */
} // :cond_0
/* iget v2, p0, Lcom/mobfox/sdk/MobFoxView;->isAccessCoarseLocation:I */
/* if-nez v2, :cond_1 */
/* .line 532 */
v2 = this.locationManager;
final String v3 = "network"; // const-string v3, "network"
v1 = (( android.location.LocationManager ) v2 ).isProviderEnabled ( v3 ); // invoke-virtual {v2, v3}, Landroid/location/LocationManager;->isProviderEnabled(Ljava/lang/String;)Z
/* .line 534 */
/* .local v1, "isNetworkEnabled":Z */
if ( v1 != null) { // if-eqz v1, :cond_1
/* .line 535 */
v2 = this.locationManager;
final String v3 = "network"; // const-string v3, "network"
(( android.location.LocationManager ) v2 ).getLastKnownLocation ( v3 ); // invoke-virtual {v2, v3}, Landroid/location/LocationManager;->getLastKnownLocation(Ljava/lang/String;)Landroid/location/Location;
/* .line 539 */
} // .end local v1 # "isNetworkEnabled":Z
} // :cond_1
int v2 = 0; // const/4 v2, 0x0
} // .end method
private com.mobfox.sdk.data.Request getRequest ( ) {
/* .locals 8 */
/* .prologue */
int v7 = 3; // const/4 v7, 0x3
/* const-wide/16 v5, 0x0 */
/* .line 336 */
v2 = this.request;
/* if-nez v2, :cond_0 */
/* .line 337 */
/* new-instance v2, Lcom/mobfox/sdk/data/Request; */
/* invoke-direct {v2}, Lcom/mobfox/sdk/data/Request;-><init>()V */
this.request = v2;
/* .line 338 */
/* iget v2, p0, Lcom/mobfox/sdk/MobFoxView;->telephonyPermission:I */
/* if-nez v2, :cond_3 */
/* .line 339 */
(( com.mobfox.sdk.MobFoxView ) p0 ).getContext ( ); // invoke-virtual {p0}, Lcom/mobfox/sdk/MobFoxView;->getContext()Landroid/content/Context;
final String v3 = "phone"; // const-string v3, "phone"
(( android.content.Context ) v2 ).getSystemService ( v3 ); // invoke-virtual {v2, v3}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;
/* check-cast v1, Landroid/telephony/TelephonyManager; */
/* .line 340 */
/* .local v1, "tm":Landroid/telephony/TelephonyManager; */
v2 = this.request;
(( android.telephony.TelephonyManager ) v1 ).getDeviceId ( ); // invoke-virtual {v1}, Landroid/telephony/TelephonyManager;->getDeviceId()Ljava/lang/String;
(( com.mobfox.sdk.data.Request ) v2 ).setDeviceId ( v3 ); // invoke-virtual {v2, v3}, Lcom/mobfox/sdk/data/Request;->setDeviceId(Ljava/lang/String;)V
/* .line 341 */
v2 = this.request;
final String v3 = "3.1"; // const-string v3, "3.1"
(( com.mobfox.sdk.data.Request ) v2 ).setProtocolVersion ( v3 ); // invoke-virtual {v2, v3}, Lcom/mobfox/sdk/data/Request;->setProtocolVersion(Ljava/lang/String;)V
/* .line 346 */
} // .end local v1 # "tm":Landroid/telephony/TelephonyManager;
} // :goto_0
v2 = this.request;
v3 = this.mode;
(( com.mobfox.sdk.data.Request ) v2 ).setMode ( v3 ); // invoke-virtual {v2, v3}, Lcom/mobfox/sdk/data/Request;->setMode(Lcom/mobfox/sdk/Mode;)V
/* .line 347 */
v2 = this.request;
v3 = this.publisherId;
(( com.mobfox.sdk.data.Request ) v2 ).setPublisherId ( v3 ); // invoke-virtual {v2, v3}, Lcom/mobfox/sdk/data/Request;->setPublisherId(Ljava/lang/String;)V
/* .line 348 */
v2 = this.request;
v3 = this.webSettings;
(( android.webkit.WebSettings ) v3 ).getUserAgentString ( ); // invoke-virtual {v3}, Landroid/webkit/WebSettings;->getUserAgentString()Ljava/lang/String;
(( com.mobfox.sdk.data.Request ) v2 ).setUserAgent ( v3 ); // invoke-virtual {v2, v3}, Lcom/mobfox/sdk/data/Request;->setUserAgent(Ljava/lang/String;)V
/* .line 349 */
v2 = this.request;
/* invoke-direct {p0}, Lcom/mobfox/sdk/MobFoxView;->buildUserAgent()Ljava/lang/String; */
(( com.mobfox.sdk.data.Request ) v2 ).setUserAgent2 ( v3 ); // invoke-virtual {v2, v3}, Lcom/mobfox/sdk/data/Request;->setUserAgent2(Ljava/lang/String;)V
/* .line 350 */
final String v2 = "MOBFOX"; // const-string v2, "MOBFOX"
v2 = android.util.Log .isLoggable ( v2,v7 );
if ( v2 != null) { // if-eqz v2, :cond_0
/* .line 351 */
final String v2 = "MOBFOX"; // const-string v2, "MOBFOX"
/* new-instance v3, Ljava/lang/StringBuilder; */
/* invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V */
final String v4 = "WebKit UserAgent:"; // const-string v4, "WebKit UserAgent:"
(( java.lang.StringBuilder ) v3 ).append ( v4 ); // invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
v4 = this.request;
(( com.mobfox.sdk.data.Request ) v4 ).getUserAgent ( ); // invoke-virtual {v4}, Lcom/mobfox/sdk/data/Request;->getUserAgent()Ljava/lang/String;
(( java.lang.StringBuilder ) v3 ).append ( v4 ); // invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v3 ).toString ( ); // invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
android.util.Log .d ( v2,v3 );
/* .line 352 */
final String v2 = "MOBFOX"; // const-string v2, "MOBFOX"
/* new-instance v3, Ljava/lang/StringBuilder; */
/* invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V */
final String v4 = "MobFox built UserAgent:"; // const-string v4, "MobFox built UserAgent:"
(( java.lang.StringBuilder ) v3 ).append ( v4 ); // invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
v4 = this.request;
(( com.mobfox.sdk.data.Request ) v4 ).getUserAgent2 ( ); // invoke-virtual {v4}, Lcom/mobfox/sdk/data/Request;->getUserAgent2()Ljava/lang/String;
(( java.lang.StringBuilder ) v3 ).append ( v4 ); // invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v3 ).toString ( ); // invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
android.util.Log .d ( v2,v3 );
/* .line 355 */
} // :cond_0
int v0 = 0; // const/4 v0, 0x0
/* .line 356 */
/* .local v0, "location":Landroid/location/Location; */
/* iget-boolean v2, p0, Lcom/mobfox/sdk/MobFoxView;->includeLocation:Z */
if ( v2 != null) { // if-eqz v2, :cond_1
/* .line 357 */
/* invoke-direct {p0}, Lcom/mobfox/sdk/MobFoxView;->getLocation()Landroid/location/Location; */
/* .line 359 */
} // :cond_1
if ( v0 != null) { // if-eqz v0, :cond_4
/* .line 360 */
final String v2 = "MOBFOX"; // const-string v2, "MOBFOX"
v2 = android.util.Log .isLoggable ( v2,v7 );
if ( v2 != null) { // if-eqz v2, :cond_2
/* .line 361 */
final String v2 = "MOBFOX"; // const-string v2, "MOBFOX"
/* new-instance v3, Ljava/lang/StringBuilder; */
/* invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V */
final String v4 = "location is longitude: "; // const-string v4, "location is longitude: "
(( java.lang.StringBuilder ) v3 ).append ( v4 ); // invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( android.location.Location ) v0 ).getLongitude ( ); // invoke-virtual {v0}, Landroid/location/Location;->getLongitude()D
/* move-result-wide v4 */
(( java.lang.StringBuilder ) v3 ).append ( v4, v5 ); // invoke-virtual {v3, v4, v5}, Ljava/lang/StringBuilder;->append(D)Ljava/lang/StringBuilder;
final String v4 = ", latitude: "; // const-string v4, ", latitude: "
(( java.lang.StringBuilder ) v3 ).append ( v4 ); // invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( android.location.Location ) v0 ).getLatitude ( ); // invoke-virtual {v0}, Landroid/location/Location;->getLatitude()D
/* move-result-wide v4 */
(( java.lang.StringBuilder ) v3 ).append ( v4, v5 ); // invoke-virtual {v3, v4, v5}, Ljava/lang/StringBuilder;->append(D)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v3 ).toString ( ); // invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
android.util.Log .d ( v2,v3 );
/* .line 363 */
} // :cond_2
v2 = this.request;
(( android.location.Location ) v0 ).getLatitude ( ); // invoke-virtual {v0}, Landroid/location/Location;->getLatitude()D
/* move-result-wide v3 */
(( com.mobfox.sdk.data.Request ) v2 ).setLatitude ( v3, v4 ); // invoke-virtual {v2, v3, v4}, Lcom/mobfox/sdk/data/Request;->setLatitude(D)V
/* .line 364 */
v2 = this.request;
(( android.location.Location ) v0 ).getLongitude ( ); // invoke-virtual {v0}, Landroid/location/Location;->getLongitude()D
/* move-result-wide v3 */
(( com.mobfox.sdk.data.Request ) v2 ).setLongitude ( v3, v4 ); // invoke-virtual {v2, v3, v4}, Lcom/mobfox/sdk/data/Request;->setLongitude(D)V
/* .line 369 */
} // :goto_1
v2 = this.request;
/* .line 343 */
} // .end local v0 # "location":Landroid/location/Location;
} // :cond_3
v2 = this.request;
/* invoke-direct {p0}, Lcom/mobfox/sdk/MobFoxView;->getDeviceId()Ljava/lang/String; */
(( com.mobfox.sdk.data.Request ) v2 ).setDeviceId ( v3 ); // invoke-virtual {v2, v3}, Lcom/mobfox/sdk/data/Request;->setDeviceId(Ljava/lang/String;)V
/* .line 344 */
v2 = this.request;
final String v3 = "N3.1"; // const-string v3, "N3.1"
(( com.mobfox.sdk.data.Request ) v2 ).setProtocolVersion ( v3 ); // invoke-virtual {v2, v3}, Lcom/mobfox/sdk/data/Request;->setProtocolVersion(Ljava/lang/String;)V
/* goto/16 :goto_0 */
/* .line 366 */
/* .restart local v0 # "location":Landroid/location/Location; */
} // :cond_4
v2 = this.request;
(( com.mobfox.sdk.data.Request ) v2 ).setLatitude ( v5, v6 ); // invoke-virtual {v2, v5, v6}, Lcom/mobfox/sdk/data/Request;->setLatitude(D)V
/* .line 367 */
v2 = this.request;
(( com.mobfox.sdk.data.Request ) v2 ).setLongitude ( v5, v6 ); // invoke-virtual {v2, v5, v6}, Lcom/mobfox/sdk/data/Request;->setLongitude(D)V
} // .end method
private void initialize ( android.content.Context p0 ) {
/* .locals 13 */
/* .param p1, "context" # Landroid/content/Context; */
/* .prologue */
/* const-wide/16 v11, 0x3e8 */
int v5 = 3; // const/4 v5, 0x3
int v4 = -1; // const/4 v4, -0x1
int v2 = 0; // const/4 v2, 0x0
int v1 = 2; // const/4 v1, 0x2
/* .line 228 */
final String v0 = "MOBFOX"; // const-string v0, "MOBFOX"
v0 = android.util.Log .isLoggable ( v0,v5 );
if ( v0 != null) { // if-eqz v0, :cond_0
/* .line 229 */
final String v0 = "MOBFOX"; // const-string v0, "MOBFOX"
final String v3 = "MobFox SDK Version:1.4"; // const-string v3, "MobFox SDK Version:1.4"
android.util.Log .d ( v0,v3 );
/* .line 231 */
} // :cond_0
int v0 = 0; // const/4 v0, 0x0
this.locationManager = v0;
/* .line 232 */
final String v0 = "android.permission.READ_PHONE_STATE"; // const-string v0, "android.permission.READ_PHONE_STATE"
v0 = (( android.content.Context ) p1 ).checkCallingOrSelfPermission ( v0 ); // invoke-virtual {p1, v0}, Landroid/content/Context;->checkCallingOrSelfPermission(Ljava/lang/String;)I
/* iput v0, p0, Lcom/mobfox/sdk/MobFoxView;->telephonyPermission:I */
/* .line 233 */
final String v0 = "android.permission.ACCESS_FINE_LOCATION"; // const-string v0, "android.permission.ACCESS_FINE_LOCATION"
v0 = (( android.content.Context ) p1 ).checkCallingOrSelfPermission ( v0 ); // invoke-virtual {p1, v0}, Landroid/content/Context;->checkCallingOrSelfPermission(Ljava/lang/String;)I
/* iput v0, p0, Lcom/mobfox/sdk/MobFoxView;->isAccessFineLocation:I */
/* .line 234 */
final String v0 = "android.permission.ACCESS_COARSE_LOCATION"; // const-string v0, "android.permission.ACCESS_COARSE_LOCATION"
v0 = (( android.content.Context ) p1 ).checkCallingOrSelfPermission ( v0 ); // invoke-virtual {p1, v0}, Landroid/content/Context;->checkCallingOrSelfPermission(Ljava/lang/String;)I
/* iput v0, p0, Lcom/mobfox/sdk/MobFoxView;->isAccessCoarseLocation:I */
/* .line 235 */
/* iget v0, p0, Lcom/mobfox/sdk/MobFoxView;->isAccessFineLocation:I */
if ( v0 != null) { // if-eqz v0, :cond_1
/* iget v0, p0, Lcom/mobfox/sdk/MobFoxView;->isAccessCoarseLocation:I */
/* if-nez v0, :cond_2 */
/* .line 236 */
} // :cond_1
(( com.mobfox.sdk.MobFoxView ) p0 ).getContext ( ); // invoke-virtual {p0}, Lcom/mobfox/sdk/MobFoxView;->getContext()Landroid/content/Context;
final String v3 = "location"; // const-string v3, "location"
(( android.content.Context ) v0 ).getSystemService ( v3 ); // invoke-virtual {v0, v3}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;
/* check-cast v0, Landroid/location/LocationManager; */
this.locationManager = v0;
/* .line 238 */
} // :cond_2
/* invoke-direct {p0, p1}, Lcom/mobfox/sdk/MobFoxView;->createWebView(Landroid/content/Context;)Landroid/webkit/WebView; */
this.firstWebView = v0;
/* .line 239 */
/* invoke-direct {p0, p1}, Lcom/mobfox/sdk/MobFoxView;->createWebView(Landroid/content/Context;)Landroid/webkit/WebView; */
this.secondWebView = v0;
/* .line 240 */
final String v0 = "MOBFOX"; // const-string v0, "MOBFOX"
v0 = android.util.Log .isLoggable ( v0,v5 );
if ( v0 != null) { // if-eqz v0, :cond_3
/* .line 241 */
final String v0 = "MOBFOX"; // const-string v0, "MOBFOX"
final String v3 = "Create view flipper"; // const-string v3, "Create view flipper"
android.util.Log .d ( v0,v3 );
/* .line 243 */
} // :cond_3
/* new-instance v0, Lcom/mobfox/sdk/MobFoxView$3; */
(( com.mobfox.sdk.MobFoxView ) p0 ).getContext ( ); // invoke-virtual {p0}, Lcom/mobfox/sdk/MobFoxView;->getContext()Landroid/content/Context;
/* invoke-direct {v0, p0, v3}, Lcom/mobfox/sdk/MobFoxView$3;-><init>(Lcom/mobfox/sdk/MobFoxView;Landroid/content/Context;)V */
this.viewFlipper = v0;
/* .line 256 */
/* new-instance v10, Landroid/widget/FrameLayout$LayoutParams; */
/* invoke-direct {v10, v4, v4}, Landroid/widget/FrameLayout$LayoutParams;-><init>(II)V */
/* .line 257 */
/* .local v10, "webViewParams":Landroid/widget/FrameLayout$LayoutParams; */
v0 = this.viewFlipper;
v3 = this.firstWebView;
(( android.widget.ViewFlipper ) v0 ).addView ( v3, v10 ); // invoke-virtual {v0, v3, v10}, Landroid/widget/ViewFlipper;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V
/* .line 258 */
v0 = this.viewFlipper;
v3 = this.secondWebView;
(( android.widget.ViewFlipper ) v0 ).addView ( v3, v10 ); // invoke-virtual {v0, v3, v10}, Landroid/widget/ViewFlipper;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V
/* .line 260 */
/* new-instance v9, Landroid/widget/RelativeLayout$LayoutParams; */
/* invoke-direct {v9, v4, v4}, Landroid/widget/RelativeLayout$LayoutParams;-><init>(II)V */
/* .line 261 */
/* .local v9, "params":Landroid/widget/RelativeLayout$LayoutParams; */
v0 = this.viewFlipper;
(( com.mobfox.sdk.MobFoxView ) p0 ).addView ( v0, v9 ); // invoke-virtual {p0, v0, v9}, Lcom/mobfox/sdk/MobFoxView;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V
/* .line 263 */
v0 = this.firstWebView;
v3 = this.onTouchListener;
(( android.webkit.WebView ) v0 ).setOnTouchListener ( v3 ); // invoke-virtual {v0, v3}, Landroid/webkit/WebView;->setOnTouchListener(Landroid/view/View$OnTouchListener;)V
/* .line 264 */
v0 = this.secondWebView;
v3 = this.onTouchListener;
(( android.webkit.WebView ) v0 ).setOnTouchListener ( v3 ); // invoke-virtual {v0, v3}, Landroid/webkit/WebView;->setOnTouchListener(Landroid/view/View$OnTouchListener;)V
/* .line 266 */
final String v0 = "MOBFOX"; // const-string v0, "MOBFOX"
v0 = android.util.Log .isLoggable ( v0,v5 );
if ( v0 != null) { // if-eqz v0, :cond_4
/* .line 267 */
final String v0 = "MOBFOX"; // const-string v0, "MOBFOX"
/* new-instance v3, Ljava/lang/StringBuilder; */
/* invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V */
final String v4 = "animation: "; // const-string v4, "animation: "
(( java.lang.StringBuilder ) v3 ).append ( v4 ); // invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
/* iget-boolean v4, p0, Lcom/mobfox/sdk/MobFoxView;->animation:Z */
(( java.lang.StringBuilder ) v3 ).append ( v4 ); // invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v3 ).toString ( ); // invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
android.util.Log .d ( v0,v3 );
/* .line 269 */
} // :cond_4
/* iget-boolean v0, p0, Lcom/mobfox/sdk/MobFoxView;->animation:Z */
if ( v0 != null) { // if-eqz v0, :cond_5
/* .line 271 */
/* new-instance v0, Landroid/view/animation/TranslateAnimation; */
/* const/high16 v6, 0x3f800000 # 1.0f */
/* move v3, v1 */
/* move v4, v2 */
/* move v5, v1 */
/* move v7, v1 */
/* move v8, v2 */
/* invoke-direct/range {v0 ..v8}, Landroid/view/animation/TranslateAnimation;-><init>(IFIFIFIF)V */
this.fadeInAnimation = v0;
/* .line 273 */
v0 = this.fadeInAnimation;
(( android.view.animation.Animation ) v0 ).setDuration ( v11, v12 ); // invoke-virtual {v0, v11, v12}, Landroid/view/animation/Animation;->setDuration(J)V
/* .line 276 */
/* new-instance v0, Landroid/view/animation/TranslateAnimation; */
/* const/high16 v8, -0x40800000 # -1.0f */
/* move v3, v1 */
/* move v4, v2 */
/* move v5, v1 */
/* move v6, v2 */
/* move v7, v1 */
/* invoke-direct/range {v0 ..v8}, Landroid/view/animation/TranslateAnimation;-><init>(IFIFIFIF)V */
this.fadeOutAnimation = v0;
/* .line 278 */
v0 = this.fadeOutAnimation;
(( android.view.animation.Animation ) v0 ).setDuration ( v11, v12 ); // invoke-virtual {v0, v11, v12}, Landroid/view/animation/Animation;->setDuration(J)V
/* .line 279 */
v0 = this.viewFlipper;
v1 = this.fadeInAnimation;
(( android.widget.ViewFlipper ) v0 ).setInAnimation ( v1 ); // invoke-virtual {v0, v1}, Landroid/widget/ViewFlipper;->setInAnimation(Landroid/view/animation/Animation;)V
/* .line 280 */
v0 = this.viewFlipper;
v1 = this.fadeOutAnimation;
(( android.widget.ViewFlipper ) v0 ).setOutAnimation ( v1 ); // invoke-virtual {v0, v1}, Landroid/widget/ViewFlipper;->setOutAnimation(Landroid/view/animation/Animation;)V
/* .line 282 */
} // :cond_5
return;
} // .end method
private void loadContent ( ) {
/* .locals 2 */
/* .prologue */
/* .line 400 */
final String v0 = "MOBFOX"; // const-string v0, "MOBFOX"
int v1 = 3; // const/4 v1, 0x3
v0 = android.util.Log .isLoggable ( v0,v1 );
if ( v0 != null) { // if-eqz v0, :cond_0
/* .line 401 */
final String v0 = "MOBFOX"; // const-string v0, "MOBFOX"
final String v1 = "load content"; // const-string v1, "load content"
android.util.Log .d ( v0,v1 );
/* .line 404 */
} // :cond_0
v0 = this.loadContentThread;
/* if-nez v0, :cond_1 */
/* .line 405 */
/* new-instance v0, Ljava/lang/Thread; */
/* new-instance v1, Lcom/mobfox/sdk/MobFoxView$5; */
/* invoke-direct {v1, p0}, Lcom/mobfox/sdk/MobFoxView$5;-><init>(Lcom/mobfox/sdk/MobFoxView;)V */
/* invoke-direct {v0, v1}, Ljava/lang/Thread;-><init>(Ljava/lang/Runnable;)V */
this.loadContentThread = v0;
/* .line 435 */
v0 = this.loadContentThread;
/* new-instance v1, Lcom/mobfox/sdk/MobFoxView$6; */
/* invoke-direct {v1, p0}, Lcom/mobfox/sdk/MobFoxView$6;-><init>(Lcom/mobfox/sdk/MobFoxView;)V */
(( java.lang.Thread ) v0 ).setUncaughtExceptionHandler ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/Thread;->setUncaughtExceptionHandler(Ljava/lang/Thread$UncaughtExceptionHandler;)V
/* .line 445 */
v0 = this.loadContentThread;
(( java.lang.Thread ) v0 ).start ( ); // invoke-virtual {v0}, Ljava/lang/Thread;->start()V
/* .line 450 */
} // :goto_0
return;
/* .line 447 */
} // :cond_1
/* new-instance v0, Lcom/mobfox/sdk/RequestException; */
final String v1 = "MobFox is already loading an ad"; // const-string v1, "MobFox is already loading an ad"
/* invoke-direct {v0, v1}, Lcom/mobfox/sdk/RequestException;-><init>(Ljava/lang/String;)V */
(( com.mobfox.sdk.MobFoxView ) p0 ).notifyLoadAdFailed ( v0 ); // invoke-virtual {p0, v0}, Lcom/mobfox/sdk/MobFoxView;->notifyLoadAdFailed(Ljava/lang/Throwable;)V
} // .end method
private void showContent ( ) {
/* .locals 7 */
/* .prologue */
/* .line 459 */
try { // :try_start_0
v3 = this.viewFlipper;
(( android.widget.ViewFlipper ) v3 ).getCurrentView ( ); // invoke-virtual {v3}, Landroid/widget/ViewFlipper;->getCurrentView()Landroid/view/View;
v4 = this.firstWebView;
/* if-ne v3, v4, :cond_3 */
/* .line 460 */
v2 = this.secondWebView;
/* .line 464 */
/* .local v2, "webView":Landroid/webkit/WebView; */
} // :goto_0
v3 = this.response;
(( com.mobfox.sdk.data.Response ) v3 ).getType ( ); // invoke-virtual {v3}, Lcom/mobfox/sdk/data/Response;->getType()Lcom/mobfox/sdk/AdType;
v4 = com.mobfox.sdk.AdType.IMAGE;
/* if-ne v3, v4, :cond_4 */
/* .line 466 */
final String v3 = "<body style=\'\"\'margin: 0px; padding: 0px; text-align:center;\'\"\'><img src=\'\"\'{0}\'\"\' width=\'\"\'{1}\'dp\"\' height=\'\"\'{2}\'dp\"\'/></body>"; // const-string v3, "<body style=\'\"\'margin: 0px; padding: 0px; text-align:center;\'\"\'><img src=\'\"\'{0}\'\"\' width=\'\"\'{1}\'dp\"\' height=\'\"\'{2}\'dp\"\'/></body>"
int v4 = 3; // const/4 v4, 0x3
/* new-array v4, v4, [Ljava/lang/Object; */
int v5 = 0; // const/4 v5, 0x0
v6 = this.response;
(( com.mobfox.sdk.data.Response ) v6 ).getImageUrl ( ); // invoke-virtual {v6}, Lcom/mobfox/sdk/data/Response;->getImageUrl()Ljava/lang/String;
/* aput-object v6, v4, v5 */
int v5 = 1; // const/4 v5, 0x1
v6 = this.response;
v6 = (( com.mobfox.sdk.data.Response ) v6 ).getBannerWidth ( ); // invoke-virtual {v6}, Lcom/mobfox/sdk/data/Response;->getBannerWidth()I
java.lang.Integer .valueOf ( v6 );
/* aput-object v6, v4, v5 */
int v5 = 2; // const/4 v5, 0x2
v6 = this.response;
v6 = (( com.mobfox.sdk.data.Response ) v6 ).getBannerHeight ( ); // invoke-virtual {v6}, Lcom/mobfox/sdk/data/Response;->getBannerHeight()I
java.lang.Integer .valueOf ( v6 );
/* aput-object v6, v4, v5 */
java.text.MessageFormat .format ( v3,v4 );
/* .line 467 */
/* .local v1, "text":Ljava/lang/String; */
final String v3 = "MOBFOX"; // const-string v3, "MOBFOX"
int v4 = 3; // const/4 v4, 0x3
v3 = android.util.Log .isLoggable ( v3,v4 );
if ( v3 != null) { // if-eqz v3, :cond_0
/* .line 468 */
final String v3 = "MOBFOX"; // const-string v3, "MOBFOX"
/* new-instance v4, Ljava/lang/StringBuilder; */
/* invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V */
final String v5 = "set image: "; // const-string v5, "set image: "
(( java.lang.StringBuilder ) v4 ).append ( v5 ); // invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v4 ).append ( v1 ); // invoke-virtual {v4, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v4 ).toString ( ); // invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
android.util.Log .d ( v3,v4 );
/* .line 470 */
} // :cond_0
/* new-instance v3, Ljava/lang/StringBuilder; */
/* invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V */
final String v4 = "<style>* { -webkit-tap-highlight-color: rgba(0,0,0,0) }</style>"; // const-string v4, "<style>* { -webkit-tap-highlight-color: rgba(0,0,0,0) }</style>"
(( java.lang.StringBuilder ) v3 ).append ( v4 ); // invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v3 ).append ( v1 ); // invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v3 ).toString ( ); // invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
android.net.Uri .encode ( v3 );
/* .line 471 */
final String v3 = "text/html"; // const-string v3, "text/html"
final String v4 = "UTF-8"; // const-string v4, "UTF-8"
(( android.webkit.WebView ) v2 ).loadData ( v1, v3, v4 ); // invoke-virtual {v2, v1, v3, v4}, Landroid/webkit/WebView;->loadData(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
/* .line 472 */
(( com.mobfox.sdk.MobFoxView ) p0 ).notifyLoadAdSucceeded ( ); // invoke-virtual {p0}, Lcom/mobfox/sdk/MobFoxView;->notifyLoadAdSucceeded()V
/* .line 485 */
} // :goto_1
v3 = this.viewFlipper;
(( android.widget.ViewFlipper ) v3 ).getCurrentView ( ); // invoke-virtual {v3}, Landroid/widget/ViewFlipper;->getCurrentView()Landroid/view/View;
v4 = this.firstWebView;
/* if-ne v3, v4, :cond_7 */
/* .line 486 */
final String v3 = "MOBFOX"; // const-string v3, "MOBFOX"
int v4 = 3; // const/4 v4, 0x3
v3 = android.util.Log .isLoggable ( v3,v4 );
if ( v3 != null) { // if-eqz v3, :cond_1
/* .line 487 */
final String v3 = "MOBFOX"; // const-string v3, "MOBFOX"
final String v4 = "show next"; // const-string v4, "show next"
android.util.Log .d ( v3,v4 );
/* .line 489 */
} // :cond_1
v3 = this.viewFlipper;
(( android.widget.ViewFlipper ) v3 ).showNext ( ); // invoke-virtual {v3}, Landroid/widget/ViewFlipper;->showNext()V
/* .line 497 */
} // :goto_2
/* invoke-direct {p0}, Lcom/mobfox/sdk/MobFoxView;->startReloadTimer()V */
/* .line 503 */
} // .end local v1 # "text":Ljava/lang/String;
} // .end local v2 # "webView":Landroid/webkit/WebView;
} // :cond_2
} // :goto_3
return;
/* .line 462 */
} // :cond_3
v2 = this.firstWebView;
/* .restart local v2 # "webView":Landroid/webkit/WebView; */
/* goto/16 :goto_0 */
/* .line 473 */
} // :cond_4
v3 = this.response;
(( com.mobfox.sdk.data.Response ) v3 ).getType ( ); // invoke-virtual {v3}, Lcom/mobfox/sdk/data/Response;->getType()Lcom/mobfox/sdk/AdType;
v4 = com.mobfox.sdk.AdType.TEXT;
/* if-ne v3, v4, :cond_6 */
/* .line 474 */
/* new-instance v3, Ljava/lang/StringBuilder; */
/* invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V */
final String v4 = "<style>* { -webkit-tap-highlight-color: rgba(0,0,0,0) }</style>"; // const-string v4, "<style>* { -webkit-tap-highlight-color: rgba(0,0,0,0) }</style>"
(( java.lang.StringBuilder ) v3 ).append ( v4 ); // invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
v4 = this.response;
(( com.mobfox.sdk.data.Response ) v4 ).getText ( ); // invoke-virtual {v4}, Lcom/mobfox/sdk/data/Response;->getText()Ljava/lang/String;
(( java.lang.StringBuilder ) v3 ).append ( v4 ); // invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v3 ).toString ( ); // invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
android.net.Uri .encode ( v3 );
/* .line 475 */
/* .restart local v1 # "text":Ljava/lang/String; */
final String v3 = "MOBFOX"; // const-string v3, "MOBFOX"
int v4 = 3; // const/4 v4, 0x3
v3 = android.util.Log .isLoggable ( v3,v4 );
if ( v3 != null) { // if-eqz v3, :cond_5
/* .line 476 */
final String v3 = "MOBFOX"; // const-string v3, "MOBFOX"
/* new-instance v4, Ljava/lang/StringBuilder; */
/* invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V */
final String v5 = "set text: "; // const-string v5, "set text: "
(( java.lang.StringBuilder ) v4 ).append ( v5 ); // invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v4 ).append ( v1 ); // invoke-virtual {v4, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v4 ).toString ( ); // invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
android.util.Log .d ( v3,v4 );
/* .line 478 */
} // :cond_5
final String v3 = "text/html"; // const-string v3, "text/html"
final String v4 = "UTF-8"; // const-string v4, "UTF-8"
(( android.webkit.WebView ) v2 ).loadData ( v1, v3, v4 ); // invoke-virtual {v2, v1, v3, v4}, Landroid/webkit/WebView;->loadData(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V
/* .line 479 */
(( com.mobfox.sdk.MobFoxView ) p0 ).notifyLoadAdSucceeded ( ); // invoke-virtual {p0}, Lcom/mobfox/sdk/MobFoxView;->notifyLoadAdSucceeded()V
/* :try_end_0 */
/* .catch Ljava/lang/Throwable; {:try_start_0 ..:try_end_0} :catch_0 */
/* .line 498 */
} // .end local v1 # "text":Ljava/lang/String;
} // .end local v2 # "webView":Landroid/webkit/WebView;
/* :catch_0 */
/* move-exception v0 */
/* .line 499 */
/* .local v0, "t":Ljava/lang/Throwable; */
final String v3 = "MOBFOX"; // const-string v3, "MOBFOX"
int v4 = 6; // const/4 v4, 0x6
v3 = android.util.Log .isLoggable ( v3,v4 );
if ( v3 != null) { // if-eqz v3, :cond_2
/* .line 500 */
final String v3 = "MOBFOX"; // const-string v3, "MOBFOX"
final String v4 = "Uncaught exception in show content"; // const-string v4, "Uncaught exception in show content"
android.util.Log .e ( v3,v4,v0 );
/* .line 481 */
} // .end local v0 # "t":Ljava/lang/Throwable;
/* .restart local v2 # "webView":Landroid/webkit/WebView; */
} // :cond_6
try { // :try_start_1
(( com.mobfox.sdk.MobFoxView ) p0 ).notifyNoAd ( ); // invoke-virtual {p0}, Lcom/mobfox/sdk/MobFoxView;->notifyNoAd()V
/* .line 491 */
/* .restart local v1 # "text":Ljava/lang/String; */
} // :cond_7
final String v3 = "MOBFOX"; // const-string v3, "MOBFOX"
int v4 = 3; // const/4 v4, 0x3
v3 = android.util.Log .isLoggable ( v3,v4 );
if ( v3 != null) { // if-eqz v3, :cond_8
/* .line 492 */
final String v3 = "MOBFOX"; // const-string v3, "MOBFOX"
final String v4 = "show previous"; // const-string v4, "show previous"
android.util.Log .d ( v3,v4 );
/* .line 494 */
} // :cond_8
v3 = this.viewFlipper;
(( android.widget.ViewFlipper ) v3 ).showPrevious ( ); // invoke-virtual {v3}, Landroid/widget/ViewFlipper;->showPrevious()V
/* :try_end_1 */
/* .catch Ljava/lang/Throwable; {:try_start_1 ..:try_end_1} :catch_0 */
/* goto/16 :goto_2 */
} // .end method
private void startReloadTimer ( ) {
/* .locals 5 */
/* .prologue */
int v4 = 3; // const/4 v4, 0x3
/* .line 506 */
final String v2 = "MOBFOX"; // const-string v2, "MOBFOX"
v2 = android.util.Log .isLoggable ( v2,v4 );
if ( v2 != null) { // if-eqz v2, :cond_0
/* .line 507 */
final String v2 = "MOBFOX"; // const-string v2, "MOBFOX"
final String v3 = "start reload timer"; // const-string v3, "start reload timer"
android.util.Log .d ( v2,v3 );
/* .line 509 */
} // :cond_0
v2 = this.reloadTimer;
/* if-nez v2, :cond_1 */
/* .line 520 */
} // :goto_0
return;
/* .line 513 */
} // :cond_1
v2 = this.response;
v2 = (( com.mobfox.sdk.data.Response ) v2 ).getRefresh ( ); // invoke-virtual {v2}, Lcom/mobfox/sdk/data/Response;->getRefresh()I
/* mul-int/lit16 v0, v2, 0x3e8 */
/* .line 514 */
/* .local v0, "refreshTime":I */
final String v2 = "MOBFOX"; // const-string v2, "MOBFOX"
v2 = android.util.Log .isLoggable ( v2,v4 );
if ( v2 != null) { // if-eqz v2, :cond_2
/* .line 515 */
final String v2 = "MOBFOX"; // const-string v2, "MOBFOX"
/* new-instance v3, Ljava/lang/StringBuilder; */
/* invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V */
final String v4 = "set timer: "; // const-string v4, "set timer: "
(( java.lang.StringBuilder ) v3 ).append ( v4 ); // invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v3 ).append ( v0 ); // invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v3 ).toString ( ); // invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
android.util.Log .d ( v2,v3 );
/* .line 518 */
} // :cond_2
/* new-instance v1, Lcom/mobfox/sdk/ReloadTask; */
/* invoke-direct {v1, p0}, Lcom/mobfox/sdk/ReloadTask;-><init>(Lcom/mobfox/sdk/MobFoxView;)V */
/* .line 519 */
/* .local v1, "reloadTask":Lcom/mobfox/sdk/ReloadTask; */
v2 = this.reloadTimer;
/* int-to-long v3, v0 */
(( java.util.Timer ) v2 ).schedule ( v1, v3, v4 ); // invoke-virtual {v2, v1, v3, v4}, Ljava/util/Timer;->schedule(Ljava/util/TimerTask;J)V
} // .end method
/* # virtual methods */
public Integer getRefreshRate ( ) {
/* .locals 1 */
/* .prologue */
/* .line 655 */
v0 = this.response;
if ( v0 != null) { // if-eqz v0, :cond_0
/* .line 656 */
v0 = this.response;
v0 = (( com.mobfox.sdk.data.Response ) v0 ).getRefresh ( ); // invoke-virtual {v0}, Lcom/mobfox/sdk/data/Response;->getRefresh()I
/* .line 658 */
} // :goto_0
} // :cond_0
int v0 = -1; // const/4 v0, -0x1
} // .end method
public Boolean isInternalBrowser ( ) {
/* .locals 1 */
/* .prologue */
/* .line 392 */
/* iget-boolean v0, p0, Lcom/mobfox/sdk/MobFoxView;->isInternalBrowser:Z */
} // .end method
public void loadNextAd ( ) {
/* .locals 2 */
/* .prologue */
/* .line 608 */
final String v0 = "MOBFOX"; // const-string v0, "MOBFOX"
int v1 = 3; // const/4 v1, 0x3
v0 = android.util.Log .isLoggable ( v0,v1 );
if ( v0 != null) { // if-eqz v0, :cond_0
/* .line 609 */
final String v0 = "MOBFOX"; // const-string v0, "MOBFOX"
final String v1 = "load next ad"; // const-string v1, "load next ad"
android.util.Log .d ( v0,v1 );
/* .line 611 */
} // :cond_0
/* invoke-direct {p0}, Lcom/mobfox/sdk/MobFoxView;->loadContent()V */
/* .line 612 */
return;
} // .end method
protected void notifyAdClicked ( ) {
/* .locals 2 */
/* .prologue */
/* .line 717 */
v0 = this.updateHandler;
/* new-instance v1, Lcom/mobfox/sdk/MobFoxView$10; */
/* invoke-direct {v1, p0}, Lcom/mobfox/sdk/MobFoxView$10;-><init>(Lcom/mobfox/sdk/MobFoxView;)V */
(( android.os.Handler ) v0 ).post ( v1 ); // invoke-virtual {v0, v1}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z
/* .line 726 */
return;
} // .end method
protected void notifyLoadAdFailed ( java.lang.Throwable p0 ) {
/* .locals 2 */
/* .param p1, "e" # Ljava/lang/Throwable; */
/* .prologue */
/* .line 662 */
v0 = this.updateHandler;
/* new-instance v1, Lcom/mobfox/sdk/MobFoxView$7; */
/* invoke-direct {v1, p0, p1}, Lcom/mobfox/sdk/MobFoxView$7;-><init>(Lcom/mobfox/sdk/MobFoxView;Ljava/lang/Throwable;)V */
(( android.os.Handler ) v0 ).post ( v1 ); // invoke-virtual {v0, v1}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z
/* .line 683 */
return;
} // .end method
protected void notifyLoadAdSucceeded ( ) {
/* .locals 2 */
/* .prologue */
/* .line 702 */
v0 = this.updateHandler;
/* new-instance v1, Lcom/mobfox/sdk/MobFoxView$9; */
/* invoke-direct {v1, p0}, Lcom/mobfox/sdk/MobFoxView$9;-><init>(Lcom/mobfox/sdk/MobFoxView;)V */
(( android.os.Handler ) v0 ).post ( v1 ); // invoke-virtual {v0, v1}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z
/* .line 714 */
return;
} // .end method
protected void notifyNoAd ( ) {
/* .locals 2 */
/* .prologue */
/* .line 686 */
v0 = this.updateHandler;
/* new-instance v1, Lcom/mobfox/sdk/MobFoxView$8; */
/* invoke-direct {v1, p0}, Lcom/mobfox/sdk/MobFoxView$8;-><init>(Lcom/mobfox/sdk/MobFoxView;)V */
(( android.os.Handler ) v0 ).post ( v1 ); // invoke-virtual {v0, v1}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z
/* .line 699 */
return;
} // .end method
protected void onWindowVisibilityChanged ( Integer p0 ) {
/* .locals 3 */
/* .param p1, "visibility" # I */
/* .prologue */
/* .line 544 */
/* invoke-super {p0, p1}, Landroid/widget/RelativeLayout;->onWindowVisibilityChanged(I)V */
/* .line 546 */
/* if-nez p1, :cond_1 */
/* .line 547 */
(( com.mobfox.sdk.MobFoxView ) p0 ).resume ( ); // invoke-virtual {p0}, Lcom/mobfox/sdk/MobFoxView;->resume()V
/* .line 551 */
} // :goto_0
final String v0 = "MOBFOX"; // const-string v0, "MOBFOX"
int v1 = 3; // const/4 v1, 0x3
v0 = android.util.Log .isLoggable ( v0,v1 );
if ( v0 != null) { // if-eqz v0, :cond_0
/* .line 552 */
final String v0 = "MOBFOX"; // const-string v0, "MOBFOX"
/* new-instance v1, Ljava/lang/StringBuilder; */
/* invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V */
final String v2 = "onWindowVisibilityChanged: "; // const-string v2, "onWindowVisibilityChanged: "
(( java.lang.StringBuilder ) v1 ).append ( v2 ); // invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v1 ).append ( p1 ); // invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v1 ).toString ( ); // invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
android.util.Log .d ( v0,v1 );
/* .line 554 */
} // :cond_0
return;
/* .line 549 */
} // :cond_1
(( com.mobfox.sdk.MobFoxView ) p0 ).pause ( ); // invoke-virtual {p0}, Lcom/mobfox/sdk/MobFoxView;->pause()V
} // .end method
public void openLink ( ) {
/* .locals 13 */
/* .prologue */
/* const/16 v12, 0x3a98 */
/* .line 558 */
v9 = this.response;
if ( v9 != null) { // if-eqz v9, :cond_0
v9 = this.response;
(( com.mobfox.sdk.data.Response ) v9 ).getClickUrl ( ); // invoke-virtual {v9}, Lcom/mobfox/sdk/data/Response;->getClickUrl()Ljava/lang/String;
if ( v9 != null) { // if-eqz v9, :cond_0
/* .line 560 */
v9 = this.response;
v9 = (( com.mobfox.sdk.data.Response ) v9 ).isSkipPreflight ( ); // invoke-virtual {v9}, Lcom/mobfox/sdk/data/Response;->isSkipPreflight()Z
if ( v9 != null) { // if-eqz v9, :cond_1
/* .line 561 */
v9 = this.response;
(( com.mobfox.sdk.data.Response ) v9 ).getClickUrl ( ); // invoke-virtual {v9}, Lcom/mobfox/sdk/data/Response;->getClickUrl()Ljava/lang/String;
/* invoke-direct {p0, v9}, Lcom/mobfox/sdk/MobFoxView;->doOpenUrl(Ljava/lang/String;)V */
/* .line 594 */
} // :cond_0
} // :goto_0
return;
/* .line 563 */
} // :cond_1
final String v9 = "MOBFOX"; // const-string v9, "MOBFOX"
int v10 = 3; // const/4 v10, 0x3
v9 = android.util.Log .isLoggable ( v9,v10 );
if ( v9 != null) { // if-eqz v9, :cond_2
/* .line 564 */
final String v9 = "MOBFOX"; // const-string v9, "MOBFOX"
/* new-instance v10, Ljava/lang/StringBuilder; */
/* invoke-direct {v10}, Ljava/lang/StringBuilder;-><init>()V */
final String v11 = "prefetch url: "; // const-string v11, "prefetch url: "
(( java.lang.StringBuilder ) v10 ).append ( v11 ); // invoke-virtual {v10, v11}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
v11 = this.response;
(( com.mobfox.sdk.data.Response ) v11 ).getClickUrl ( ); // invoke-virtual {v11}, Lcom/mobfox/sdk/data/Response;->getClickUrl()Ljava/lang/String;
(( java.lang.StringBuilder ) v10 ).append ( v11 ); // invoke-virtual {v10, v11}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v10 ).toString ( ); // invoke-virtual {v10}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
android.util.Log .d ( v9,v10 );
/* .line 567 */
} // :cond_2
/* new-instance v0, Lorg/apache/http/impl/client/DefaultHttpClient; */
/* invoke-direct {v0}, Lorg/apache/http/impl/client/DefaultHttpClient;-><init>()V */
/* .line 568 */
/* .local v0, "client":Lorg/apache/http/impl/client/DefaultHttpClient; */
(( org.apache.http.impl.client.DefaultHttpClient ) v0 ).getParams ( ); // invoke-virtual {v0}, Lorg/apache/http/impl/client/DefaultHttpClient;->getParams()Lorg/apache/http/params/HttpParams;
org.apache.http.params.HttpConnectionParams .setSoTimeout ( v9,v12 );
/* .line 569 */
(( org.apache.http.impl.client.DefaultHttpClient ) v0 ).getParams ( ); // invoke-virtual {v0}, Lorg/apache/http/impl/client/DefaultHttpClient;->getParams()Lorg/apache/http/params/HttpParams;
org.apache.http.params.HttpConnectionParams .setConnectionTimeout ( v9,v12 );
/* .line 570 */
/* new-instance v5, Lorg/apache/http/client/methods/HttpGet; */
v9 = this.response;
(( com.mobfox.sdk.data.Response ) v9 ).getClickUrl ( ); // invoke-virtual {v9}, Lcom/mobfox/sdk/data/Response;->getClickUrl()Ljava/lang/String;
/* invoke-direct {v5, v9}, Lorg/apache/http/client/methods/HttpGet;-><init>(Ljava/lang/String;)V */
/* .line 573 */
/* .local v5, "get":Lorg/apache/http/client/methods/HttpGet; */
/* new-instance v6, Lorg/apache/http/protocol/BasicHttpContext; */
/* invoke-direct {v6}, Lorg/apache/http/protocol/BasicHttpContext;-><init>()V */
/* .line 575 */
/* .local v6, "httpContext":Lorg/apache/http/protocol/HttpContext; */
try { // :try_start_0
(( org.apache.http.impl.client.DefaultHttpClient ) v0 ).execute ( v5, v6 ); // invoke-virtual {v0, v5, v6}, Lorg/apache/http/impl/client/DefaultHttpClient;->execute(Lorg/apache/http/client/methods/HttpUriRequest;Lorg/apache/http/protocol/HttpContext;)Lorg/apache/http/HttpResponse;
/* .line 576 */
v9 = /* .local v7, "response":Lorg/apache/http/HttpResponse; */
/* const/16 v10, 0xc8 */
/* if-eq v9, v10, :cond_3 */
/* .line 577 */
/* new-instance v9, Ljava/io/IOException; */
(( java.lang.Object ) v10 ).toString ( ); // invoke-virtual {v10}, Ljava/lang/Object;->toString()Ljava/lang/String;
/* invoke-direct {v9, v10}, Ljava/io/IOException;-><init>(Ljava/lang/String;)V */
/* throw v9 */
/* :try_end_0 */
/* .catch Lorg/apache/http/client/ClientProtocolException; {:try_start_0 ..:try_end_0} :catch_0 */
/* .catch Ljava/io/IOException; {:try_start_0 ..:try_end_0} :catch_1 */
/* .catch Ljava/lang/Throwable; {:try_start_0 ..:try_end_0} :catch_2 */
/* .line 583 */
} // .end local v7 # "response":Lorg/apache/http/HttpResponse;
/* :catch_0 */
/* move-exception v4 */
/* .line 584 */
/* .local v4, "e":Lorg/apache/http/client/ClientProtocolException; */
final String v9 = "MOBFOX"; // const-string v9, "MOBFOX"
final String v10 = "Error in HTTP request"; // const-string v10, "Error in HTTP request"
android.util.Log .e ( v9,v10,v4 );
/* .line 579 */
} // .end local v4 # "e":Lorg/apache/http/client/ClientProtocolException;
/* .restart local v7 # "response":Lorg/apache/http/HttpResponse; */
} // :cond_3
try { // :try_start_1
final String v9 = "http.request"; // const-string v9, "http.request"
/* check-cast v2, Lorg/apache/http/client/methods/HttpUriRequest; */
/* .line 580 */
/* .local v2, "currentRequeset":Lorg/apache/http/client/methods/HttpUriRequest; */
final String v9 = "http.target_host"; // const-string v9, "http.target_host"
/* check-cast v1, Lorg/apache/http/HttpHost; */
/* .line 581 */
/* .local v1, "currentHost":Lorg/apache/http/HttpHost; */
/* new-instance v9, Ljava/lang/StringBuilder; */
/* invoke-direct {v9}, Ljava/lang/StringBuilder;-><init>()V */
(( org.apache.http.HttpHost ) v1 ).toURI ( ); // invoke-virtual {v1}, Lorg/apache/http/HttpHost;->toURI()Ljava/lang/String;
(( java.lang.StringBuilder ) v9 ).append ( v10 ); // invoke-virtual {v9, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v9 ).append ( v10 ); // invoke-virtual {v9, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v9 ).toString ( ); // invoke-virtual {v9}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
/* .line 582 */
/* .local v3, "currentUrl":Ljava/lang/String; */
/* invoke-direct {p0, v3}, Lcom/mobfox/sdk/MobFoxView;->doOpenUrl(Ljava/lang/String;)V */
/* :try_end_1 */
/* .catch Lorg/apache/http/client/ClientProtocolException; {:try_start_1 ..:try_end_1} :catch_0 */
/* .catch Ljava/io/IOException; {:try_start_1 ..:try_end_1} :catch_1 */
/* .catch Ljava/lang/Throwable; {:try_start_1 ..:try_end_1} :catch_2 */
/* goto/16 :goto_0 */
/* .line 585 */
} // .end local v1 # "currentHost":Lorg/apache/http/HttpHost;
} // .end local v2 # "currentRequeset":Lorg/apache/http/client/methods/HttpUriRequest;
} // .end local v3 # "currentUrl":Ljava/lang/String;
} // .end local v7 # "response":Lorg/apache/http/HttpResponse;
/* :catch_1 */
/* move-exception v4 */
/* .line 586 */
/* .local v4, "e":Ljava/io/IOException; */
final String v9 = "MOBFOX"; // const-string v9, "MOBFOX"
final String v10 = "Error in HTTP request"; // const-string v10, "Error in HTTP request"
android.util.Log .e ( v9,v10,v4 );
/* goto/16 :goto_0 */
/* .line 587 */
} // .end local v4 # "e":Ljava/io/IOException;
/* :catch_2 */
/* move-exception v8 */
/* .line 588 */
/* .local v8, "t":Ljava/lang/Throwable; */
final String v9 = "MOBFOX"; // const-string v9, "MOBFOX"
final String v10 = "Error in HTTP request"; // const-string v10, "Error in HTTP request"
android.util.Log .e ( v9,v10,v8 );
/* goto/16 :goto_0 */
} // .end method
public void pause ( ) {
/* .locals 3 */
/* .prologue */
/* .line 624 */
v1 = this.reloadTimer;
if ( v1 != null) { // if-eqz v1, :cond_1
/* .line 626 */
try { // :try_start_0
final String v1 = "MOBFOX"; // const-string v1, "MOBFOX"
int v2 = 3; // const/4 v2, 0x3
v1 = android.util.Log .isLoggable ( v1,v2 );
if ( v1 != null) { // if-eqz v1, :cond_0
/* .line 627 */
final String v1 = "MOBFOX"; // const-string v1, "MOBFOX"
final String v2 = "cancel reload timer"; // const-string v2, "cancel reload timer"
android.util.Log .d ( v1,v2 );
/* .line 629 */
} // :cond_0
v1 = this.reloadTimer;
(( java.util.Timer ) v1 ).cancel ( ); // invoke-virtual {v1}, Ljava/util/Timer;->cancel()V
/* .line 630 */
int v1 = 0; // const/4 v1, 0x0
this.reloadTimer = v1;
/* :try_end_0 */
/* .catch Ljava/lang/Exception; {:try_start_0 ..:try_end_0} :catch_0 */
/* .line 635 */
} // :cond_1
} // :goto_0
return;
/* .line 631 */
/* :catch_0 */
/* move-exception v0 */
/* .line 632 */
/* .local v0, "e":Ljava/lang/Exception; */
final String v1 = "MOBFOX"; // const-string v1, "MOBFOX"
final String v2 = "unable to cancel reloadTimer"; // const-string v2, "unable to cancel reloadTimer"
android.util.Log .e ( v1,v2,v0 );
} // .end method
public void resume ( ) {
/* .locals 3 */
/* .prologue */
/* .line 638 */
v0 = this.reloadTimer;
if ( v0 != null) { // if-eqz v0, :cond_0
/* .line 639 */
v0 = this.reloadTimer;
(( java.util.Timer ) v0 ).cancel ( ); // invoke-virtual {v0}, Ljava/util/Timer;->cancel()V
/* .line 640 */
int v0 = 0; // const/4 v0, 0x0
this.reloadTimer = v0;
/* .line 642 */
} // :cond_0
/* new-instance v0, Ljava/util/Timer; */
/* invoke-direct {v0}, Ljava/util/Timer;-><init>()V */
this.reloadTimer = v0;
/* .line 643 */
final String v0 = "MOBFOX"; // const-string v0, "MOBFOX"
int v1 = 3; // const/4 v1, 0x3
v0 = android.util.Log .isLoggable ( v0,v1 );
if ( v0 != null) { // if-eqz v0, :cond_1
/* .line 644 */
final String v0 = "MOBFOX"; // const-string v0, "MOBFOX"
/* new-instance v1, Ljava/lang/StringBuilder; */
/* invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V */
final String v2 = "response: "; // const-string v2, "response: "
(( java.lang.StringBuilder ) v1 ).append ( v2 ); // invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
v2 = this.response;
(( java.lang.StringBuilder ) v1 ).append ( v2 ); // invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v1 ).toString ( ); // invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
android.util.Log .d ( v0,v1 );
/* .line 647 */
} // :cond_1
v0 = this.response;
if ( v0 != null) { // if-eqz v0, :cond_2
v0 = this.response;
v0 = (( com.mobfox.sdk.data.Response ) v0 ).getRefresh ( ); // invoke-virtual {v0}, Lcom/mobfox/sdk/data/Response;->getRefresh()I
/* if-lez v0, :cond_2 */
/* .line 648 */
/* invoke-direct {p0}, Lcom/mobfox/sdk/MobFoxView;->startReloadTimer()V */
/* .line 652 */
} // :goto_0
return;
/* .line 650 */
} // :cond_2
/* invoke-direct {p0}, Lcom/mobfox/sdk/MobFoxView;->loadContent()V */
} // .end method
public void setBannerListener ( com.mobfox.sdk.BannerListener p0 ) {
/* .locals 0 */
/* .param p1, "bannerListener" # Lcom/mobfox/sdk/BannerListener; */
/* .prologue */
/* .line 620 */
this.bannerListener = p1;
/* .line 621 */
return;
} // .end method
public void setInternalBrowser ( Boolean p0 ) {
/* .locals 0 */
/* .param p1, "isInternalBrowser" # Z */
/* .prologue */
/* .line 396 */
/* iput-boolean p1, p0, Lcom/mobfox/sdk/MobFoxView;->isInternalBrowser:Z */
/* .line 397 */
return;
} // .end method
