public class com.mobfox.video.sdk.MobFoxWebViewClient extends android.webkit.WebViewClient {
	 /* .source "MobFoxWebViewClient.java" */
	 /* # annotations */
	 /* .annotation system Ldalvik/annotation/MemberClasses; */
	 /* value = { */
	 /* Lcom/mobfox/video/sdk/MobFoxWebViewClient$OnPageLoadedListener; */
	 /* } */
} // .end annotation
/* # instance fields */
private android.app.Activity mActivity;
private Boolean mAllowNavigation;
private java.lang.String mAllowedUrl;
private Long mFinishedLoadingTime;
private com.mobfox.video.sdk.MobFoxWebViewClient$OnPageLoadedListener mOnPageLoadedListener;
/* # direct methods */
public com.mobfox.video.sdk.MobFoxWebViewClient ( ) {
	 /* .locals 2 */
	 /* .param p1, "activity" # Landroid/app/Activity; */
	 /* .param p2, "allowNavigation" # Z */
	 /* .prologue */
	 /* .line 22 */
	 /* invoke-direct {p0}, Landroid/webkit/WebViewClient;-><init>()V */
	 /* .line 16 */
	 int v0 = 0; // const/4 v0, 0x0
	 /* iput-boolean v0, p0, Lcom/mobfox/video/sdk/MobFoxWebViewClient;->mAllowNavigation:Z */
	 /* .line 23 */
	 this.mActivity = p1;
	 /* .line 24 */
	 /* iput-boolean p2, p0, Lcom/mobfox/video/sdk/MobFoxWebViewClient;->mAllowNavigation:Z */
	 /* .line 25 */
	 /* const-wide/16 v0, 0x0 */
	 /* iput-wide v0, p0, Lcom/mobfox/video/sdk/MobFoxWebViewClient;->mFinishedLoadingTime:J */
	 /* .line 26 */
	 return;
} // .end method
/* # virtual methods */
public java.lang.String getAllowedUrl ( ) {
	 /* .locals 1 */
	 /* .prologue */
	 /* .line 137 */
	 v0 = this.mAllowedUrl;
} // .end method
public Long getFinishedLoadingTime ( ) {
	 /* .locals 2 */
	 /* .prologue */
	 /* .line 133 */
	 /* iget-wide v0, p0, Lcom/mobfox/video/sdk/MobFoxWebViewClient;->mFinishedLoadingTime:J */
	 /* return-wide v0 */
} // .end method
public void onPageFinished ( android.webkit.WebView p0, java.lang.String p1 ) {
	 /* .locals 4 */
	 /* .param p1, "view" # Landroid/webkit/WebView; */
	 /* .param p2, "url" # Ljava/lang/String; */
	 /* .prologue */
	 /* .line 117 */
	 /* invoke-super {p0, p1, p2}, Landroid/webkit/WebViewClient;->onPageFinished(Landroid/webkit/WebView;Ljava/lang/String;)V */
	 /* .line 118 */
	 final String v0 = "MOBFOX"; // const-string v0, "MOBFOX"
	 int v1 = 3; // const/4 v1, 0x3
	 v0 = 	 android.util.Log .isLoggable ( v0,v1 );
	 if ( v0 != null) { // if-eqz v0, :cond_0
		 /* .line 119 */
		 final String v0 = "MOBFOX"; // const-string v0, "MOBFOX"
		 /* new-instance v1, Ljava/lang/StringBuilder; */
		 final String v2 = "onPageFinished:"; // const-string v2, "onPageFinished:"
		 /* invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V */
		 (( java.lang.StringBuilder ) v1 ).append ( p2 ); // invoke-virtual {v1, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
		 final String v2 = " mAllowedUrl:"; // const-string v2, " mAllowedUrl:"
		 (( java.lang.StringBuilder ) v1 ).append ( v2 ); // invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
		 v2 = this.mAllowedUrl;
		 (( java.lang.StringBuilder ) v1 ).append ( v2 ); // invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
		 (( java.lang.StringBuilder ) v1 ).toString ( ); // invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
		 android.util.Log .d ( v0,v1 );
		 /* .line 121 */
	 } // :cond_0
	 v0 = this.mAllowedUrl;
	 if ( v0 != null) { // if-eqz v0, :cond_1
		 v0 = this.mAllowedUrl;
		 v0 = 		 (( java.lang.String ) p2 ).equals ( v0 ); // invoke-virtual {p2, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
		 if ( v0 != null) { // if-eqz v0, :cond_3
			 /* .line 123 */
		 } // :cond_1
		 /* iget-wide v0, p0, Lcom/mobfox/video/sdk/MobFoxWebViewClient;->mFinishedLoadingTime:J */
		 /* const-wide/16 v2, 0x0 */
		 /* cmp-long v0, v0, v2 */
		 /* if-nez v0, :cond_2 */
		 /* .line 124 */
		 java.lang.System .currentTimeMillis ( );
		 /* move-result-wide v0 */
		 /* iput-wide v0, p0, Lcom/mobfox/video/sdk/MobFoxWebViewClient;->mFinishedLoadingTime:J */
		 /* .line 126 */
	 } // :cond_2
	 v0 = this.mOnPageLoadedListener;
	 if ( v0 != null) { // if-eqz v0, :cond_3
		 /* .line 127 */
		 v0 = this.mOnPageLoadedListener;
		 /* .line 130 */
	 } // :cond_3
	 return;
} // .end method
public void setAllowedUrl ( java.lang.String p0 ) {
	 /* .locals 4 */
	 /* .param p1, "url" # Ljava/lang/String; */
	 /* .prologue */
	 /* .line 104 */
	 /* const-wide/16 v2, 0x0 */
	 /* iput-wide v2, p0, Lcom/mobfox/video/sdk/MobFoxWebViewClient;->mFinishedLoadingTime:J */
	 /* .line 105 */
	 this.mAllowedUrl = p1;
	 /* .line 106 */
	 v2 = this.mAllowedUrl;
	 if ( v2 != null) { // if-eqz v2, :cond_1
		 /* .line 107 */
		 v2 = this.mAllowedUrl;
		 android.net.Uri .parse ( v2 );
		 /* .line 108 */
		 /* .local v1, "uri":Landroid/net/Uri; */
		 (( android.net.Uri ) v1 ).getPath ( ); // invoke-virtual {v1}, Landroid/net/Uri;->getPath()Ljava/lang/String;
		 /* .line 109 */
		 /* .local v0, "path":Ljava/lang/String; */
		 if ( v0 != null) { // if-eqz v0, :cond_0
			 v2 = 			 (( java.lang.String ) v0 ).length ( ); // invoke-virtual {v0}, Ljava/lang/String;->length()I
			 /* if-nez v2, :cond_1 */
			 /* .line 110 */
		 } // :cond_0
		 v2 = this.mAllowedUrl;
		 /* new-instance v3, Ljava/lang/StringBuilder; */
		 java.lang.String .valueOf ( v2 );
		 /* invoke-direct {v3, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V */
		 final String v2 = "/"; // const-string v2, "/"
		 (( java.lang.StringBuilder ) v3 ).append ( v2 ); // invoke-virtual {v3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
		 (( java.lang.StringBuilder ) v2 ).toString ( ); // invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
		 this.mAllowedUrl = v2;
		 /* .line 113 */
	 } // .end local v0 # "path":Ljava/lang/String;
} // .end local v1 # "uri":Landroid/net/Uri;
} // :cond_1
return;
} // .end method
public void setOnPageLoadedListener ( com.mobfox.video.sdk.MobFoxWebViewClient$OnPageLoadedListener p0 ) {
/* .locals 0 */
/* .param p1, "l" # Lcom/mobfox/video/sdk/MobFoxWebViewClient$OnPageLoadedListener; */
/* .prologue */
/* .line 141 */
this.mOnPageLoadedListener = p1;
/* .line 142 */
return;
} // .end method
public Boolean shouldOverrideUrlLoading ( android.webkit.WebView p0, java.lang.String p1 ) {
/* .locals 9 */
/* .param p1, "view" # Landroid/webkit/WebView; */
/* .param p2, "url" # Ljava/lang/String; */
/* .prologue */
int v8 = 3; // const/4 v8, 0x3
int v7 = 1; // const/4 v7, 0x1
/* .line 30 */
final String v4 = "MOBFOX"; // const-string v4, "MOBFOX"
v4 = android.util.Log .isLoggable ( v4,v8 );
if ( v4 != null) { // if-eqz v4, :cond_0
/* .line 31 */
final String v4 = "MOBFOX"; // const-string v4, "MOBFOX"
/* new-instance v5, Ljava/lang/StringBuilder; */
final String v6 = "Loading url:"; // const-string v6, "Loading url:"
/* invoke-direct {v5, v6}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V */
(( java.lang.StringBuilder ) v5 ).append ( p2 ); // invoke-virtual {v5, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v5 ).toString ( ); // invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
android.util.Log .d ( v4,v5 );
/* .line 33 */
} // :cond_0
final String v4 = "market:"; // const-string v4, "market:"
v4 = (( java.lang.String ) p2 ).startsWith ( v4 ); // invoke-virtual {p2, v4}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z
/* if-nez v4, :cond_1 */
/* .line 34 */
final String v4 = "http://market.android.com"; // const-string v4, "http://market.android.com"
v4 = (( java.lang.String ) p2 ).startsWith ( v4 ); // invoke-virtual {p2, v4}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z
/* if-nez v4, :cond_1 */
/* .line 35 */
final String v4 = "sms:"; // const-string v4, "sms:"
v4 = (( java.lang.String ) p2 ).startsWith ( v4 ); // invoke-virtual {p2, v4}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z
/* if-nez v4, :cond_1 */
final String v4 = "tel:"; // const-string v4, "tel:"
v4 = (( java.lang.String ) p2 ).startsWith ( v4 ); // invoke-virtual {p2, v4}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z
/* if-nez v4, :cond_1 */
/* .line 36 */
final String v4 = "mailto:"; // const-string v4, "mailto:"
v4 = (( java.lang.String ) p2 ).startsWith ( v4 ); // invoke-virtual {p2, v4}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z
/* if-nez v4, :cond_1 */
final String v4 = "voicemail:"; // const-string v4, "voicemail:"
v4 = (( java.lang.String ) p2 ).startsWith ( v4 ); // invoke-virtual {p2, v4}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z
/* if-nez v4, :cond_1 */
/* .line 37 */
final String v4 = "geo:"; // const-string v4, "geo:"
v4 = (( java.lang.String ) p2 ).startsWith ( v4 ); // invoke-virtual {p2, v4}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z
/* if-nez v4, :cond_1 */
/* .line 38 */
final String v4 = "google.streetview:"; // const-string v4, "google.streetview:"
v4 = (( java.lang.String ) p2 ).startsWith ( v4 ); // invoke-virtual {p2, v4}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z
if ( v4 != null) { // if-eqz v4, :cond_3
/* .line 39 */
} // :cond_1
/* new-instance v2, Landroid/content/Intent; */
final String v4 = "android.intent.action.VIEW"; // const-string v4, "android.intent.action.VIEW"
android.net.Uri .parse ( p2 );
/* invoke-direct {v2, v4, v5}, Landroid/content/Intent;-><init>(Ljava/lang/String;Landroid/net/Uri;)V */
/* .line 41 */
/* .local v2, "intent":Landroid/content/Intent; */
try { // :try_start_0
v4 = this.mActivity;
(( android.app.Activity ) v4 ).startActivity ( v2 ); // invoke-virtual {v4, v2}, Landroid/app/Activity;->startActivity(Landroid/content/Intent;)V
/* :try_end_0 */
/* .catch Landroid/content/ActivityNotFoundException; {:try_start_0 ..:try_end_0} :catch_0 */
/* .line 100 */
} // .end local v2 # "intent":Landroid/content/Intent;
} // :cond_2
} // :goto_0
/* .line 42 */
/* .restart local v2 # "intent":Landroid/content/Intent; */
/* :catch_0 */
/* move-exception v1 */
/* .line 43 */
/* .local v1, "e":Landroid/content/ActivityNotFoundException; */
final String v4 = "MOBFOX"; // const-string v4, "MOBFOX"
/* new-instance v5, Ljava/lang/StringBuilder; */
final String v6 = "Could open URL: "; // const-string v6, "Could open URL: "
/* invoke-direct {v5, v6}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V */
(( java.lang.StringBuilder ) v5 ).append ( p2 ); // invoke-virtual {v5, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v5 ).toString ( ); // invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
android.util.Log .w ( v4,v5 );
/* .line 48 */
} // .end local v1 # "e":Landroid/content/ActivityNotFoundException;
} // .end local v2 # "intent":Landroid/content/Intent;
} // :cond_3
final String v4 = "mfox:external:"; // const-string v4, "mfox:external:"
v4 = (( java.lang.String ) p2 ).startsWith ( v4 ); // invoke-virtual {p2, v4}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z
if ( v4 != null) { // if-eqz v4, :cond_4
/* .line 49 */
/* const/16 v4, 0xe */
(( java.lang.String ) p2 ).substring ( v4 ); // invoke-virtual {p2, v4}, Ljava/lang/String;->substring(I)Ljava/lang/String;
/* .line 50 */
/* new-instance v2, Landroid/content/Intent; */
final String v4 = "android.intent.action.VIEW"; // const-string v4, "android.intent.action.VIEW"
/* .line 51 */
android.net.Uri .parse ( p2 );
/* .line 50 */
/* invoke-direct {v2, v4, v5}, Landroid/content/Intent;-><init>(Ljava/lang/String;Landroid/net/Uri;)V */
/* .line 52 */
/* .restart local v2 # "intent":Landroid/content/Intent; */
v4 = this.mActivity;
(( android.app.Activity ) v4 ).startActivity ( v2 ); // invoke-virtual {v4, v2}, Landroid/app/Activity;->startActivity(Landroid/content/Intent;)V
/* .line 55 */
} // .end local v2 # "intent":Landroid/content/Intent;
} // :cond_4
final String v4 = "mfox:replayvideo"; // const-string v4, "mfox:replayvideo"
v4 = (( java.lang.String ) p2 ).startsWith ( v4 ); // invoke-virtual {p2, v4}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z
if ( v4 != null) { // if-eqz v4, :cond_5
/* .line 57 */
try { // :try_start_1
v4 = this.mActivity;
(( java.lang.Object ) v4 ).getClass ( ); // invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;
/* .line 58 */
/* .local v0, "c":Ljava/lang/Class;, "Ljava/lang/Class<+Landroid/app/Activity;>;" */
final String v4 = "replayVideo"; // const-string v4, "replayVideo"
int v5 = 0; // const/4 v5, 0x0
/* new-array v5, v5, [Ljava/lang/Class; */
(( java.lang.Class ) v0 ).getMethod ( v4, v5 ); // invoke-virtual {v0, v4, v5}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;
/* .line 59 */
/* .local v3, "method":Ljava/lang/reflect/Method; */
v4 = this.mActivity;
int v5 = 0; // const/4 v5, 0x0
/* new-array v5, v5, [Ljava/lang/Object; */
(( java.lang.reflect.Method ) v3 ).invoke ( v4, v5 ); // invoke-virtual {v3, v4, v5}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
/* :try_end_1 */
/* .catch Ljava/lang/NoSuchMethodException; {:try_start_1 ..:try_end_1} :catch_1 */
/* .catch Ljava/lang/Exception; {:try_start_1 ..:try_end_1} :catch_2 */
/* .line 60 */
} // .end local v0 # "c":Ljava/lang/Class;, "Ljava/lang/Class<+Landroid/app/Activity;>;"
} // .end local v3 # "method":Ljava/lang/reflect/Method;
/* :catch_1 */
/* move-exception v1 */
/* .line 61 */
/* .local v1, "e":Ljava/lang/NoSuchMethodException; */
final String v4 = "MOBFOX"; // const-string v4, "MOBFOX"
v4 = android.util.Log .isLoggable ( v4,v8 );
if ( v4 != null) { // if-eqz v4, :cond_2
/* .line 62 */
final String v4 = "MOBFOX"; // const-string v4, "MOBFOX"
final String v5 = "Your activity class has no replayVideo method"; // const-string v5, "Your activity class has no replayVideo method"
android.util.Log .d ( v4,v5 );
/* .line 64 */
} // .end local v1 # "e":Ljava/lang/NoSuchMethodException;
/* :catch_2 */
/* move-exception v1 */
/* .line 65 */
/* .local v1, "e":Ljava/lang/Exception; */
final String v4 = "MOBFOX"; // const-string v4, "MOBFOX"
v4 = android.util.Log .isLoggable ( v4,v8 );
if ( v4 != null) { // if-eqz v4, :cond_2
/* .line 66 */
final String v4 = "MOBFOX"; // const-string v4, "MOBFOX"
/* .line 67 */
final String v5 = "Couldn\'t run replayVideo method in your Activity"; // const-string v5, "Couldn\'t run replayVideo method in your Activity"
/* .line 66 */
android.util.Log .d ( v4,v5 );
/* .line 72 */
} // .end local v1 # "e":Ljava/lang/Exception;
} // :cond_5
final String v4 = "mfox:playvideo"; // const-string v4, "mfox:playvideo"
v4 = (( java.lang.String ) p2 ).startsWith ( v4 ); // invoke-virtual {p2, v4}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z
if ( v4 != null) { // if-eqz v4, :cond_6
/* .line 74 */
try { // :try_start_2
v4 = this.mActivity;
(( java.lang.Object ) v4 ).getClass ( ); // invoke-virtual {v4}, Ljava/lang/Object;->getClass()Ljava/lang/Class;
/* .line 75 */
/* .restart local v0 # "c":Ljava/lang/Class;, "Ljava/lang/Class<+Landroid/app/Activity;>;" */
final String v4 = "playVideo"; // const-string v4, "playVideo"
int v5 = 0; // const/4 v5, 0x0
/* new-array v5, v5, [Ljava/lang/Class; */
(( java.lang.Class ) v0 ).getMethod ( v4, v5 ); // invoke-virtual {v0, v4, v5}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;
/* .line 76 */
/* .restart local v3 # "method":Ljava/lang/reflect/Method; */
v4 = this.mActivity;
int v5 = 0; // const/4 v5, 0x0
/* new-array v5, v5, [Ljava/lang/Object; */
(( java.lang.reflect.Method ) v3 ).invoke ( v4, v5 ); // invoke-virtual {v3, v4, v5}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
/* :try_end_2 */
/* .catch Ljava/lang/NoSuchMethodException; {:try_start_2 ..:try_end_2} :catch_3 */
/* .catch Ljava/lang/Exception; {:try_start_2 ..:try_end_2} :catch_4 */
/* goto/16 :goto_0 */
/* .line 77 */
} // .end local v0 # "c":Ljava/lang/Class;, "Ljava/lang/Class<+Landroid/app/Activity;>;"
} // .end local v3 # "method":Ljava/lang/reflect/Method;
/* :catch_3 */
/* move-exception v1 */
/* .line 78 */
/* .local v1, "e":Ljava/lang/NoSuchMethodException; */
final String v4 = "MOBFOX"; // const-string v4, "MOBFOX"
v4 = android.util.Log .isLoggable ( v4,v8 );
if ( v4 != null) { // if-eqz v4, :cond_2
/* .line 79 */
final String v4 = "MOBFOX"; // const-string v4, "MOBFOX"
final String v5 = "Your activity class has no playVideo method"; // const-string v5, "Your activity class has no playVideo method"
android.util.Log .d ( v4,v5 );
/* goto/16 :goto_0 */
/* .line 81 */
} // .end local v1 # "e":Ljava/lang/NoSuchMethodException;
/* :catch_4 */
/* move-exception v1 */
/* .line 82 */
/* .local v1, "e":Ljava/lang/Exception; */
final String v4 = "MOBFOX"; // const-string v4, "MOBFOX"
v4 = android.util.Log .isLoggable ( v4,v8 );
if ( v4 != null) { // if-eqz v4, :cond_2
/* .line 83 */
final String v4 = "MOBFOX"; // const-string v4, "MOBFOX"
/* .line 84 */
final String v5 = "Couldn\'t run replayVideo method in your Activity"; // const-string v5, "Couldn\'t run replayVideo method in your Activity"
/* .line 83 */
android.util.Log .d ( v4,v5 );
/* goto/16 :goto_0 */
/* .line 89 */
} // .end local v1 # "e":Ljava/lang/Exception;
} // :cond_6
final String v4 = "mfox:skip"; // const-string v4, "mfox:skip"
v4 = (( java.lang.String ) p2 ).startsWith ( v4 ); // invoke-virtual {p2, v4}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z
if ( v4 != null) { // if-eqz v4, :cond_7
/* .line 90 */
v4 = this.mActivity;
(( android.app.Activity ) v4 ).finish ( ); // invoke-virtual {v4}, Landroid/app/Activity;->finish()V
/* goto/16 :goto_0 */
/* .line 93 */
} // :cond_7
/* iget-boolean v4, p0, Lcom/mobfox/video/sdk/MobFoxWebViewClient;->mAllowNavigation:Z */
/* if-nez v4, :cond_8 */
v4 = this.mAllowedUrl;
v4 = (( java.lang.String ) p2 ).equals ( v4 ); // invoke-virtual {p2, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
if ( v4 != null) { // if-eqz v4, :cond_9
/* .line 94 */
} // :cond_8
(( android.webkit.WebView ) p1 ).loadUrl ( p2 ); // invoke-virtual {p1, p2}, Landroid/webkit/WebView;->loadUrl(Ljava/lang/String;)V
/* goto/16 :goto_0 */
/* .line 96 */
} // :cond_9
/* new-instance v2, Landroid/content/Intent; */
v4 = this.mActivity;
/* const-class v5, Lcom/mobfox/video/sdk/MobFoxRichMediaActivity; */
/* invoke-direct {v2, v4, v5}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V */
/* .line 97 */
/* .restart local v2 # "intent":Landroid/content/Intent; */
android.net.Uri .parse ( p2 );
(( android.content.Intent ) v2 ).setData ( v4 ); // invoke-virtual {v2, v4}, Landroid/content/Intent;->setData(Landroid/net/Uri;)Landroid/content/Intent;
/* .line 98 */
v4 = this.mActivity;
(( android.app.Activity ) v4 ).startActivity ( v2 ); // invoke-virtual {v4, v2}, Landroid/app/Activity;->startActivity(Landroid/content/Intent;)V
/* goto/16 :goto_0 */
} // .end method
