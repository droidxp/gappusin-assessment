public class com.openfeint.internal.ui.WebNav$WebNavClient extends android.webkit.WebViewClient {
	 /* .source "WebNav.java" */
	 /* # annotations */
	 /* .annotation system Ldalvik/annotation/EnclosingClass; */
	 /* value = Lcom/openfeint/internal/ui/WebNav; */
} // .end annotation
/* .annotation system Ldalvik/annotation/InnerClass; */
/* accessFlags = 0x4 */
/* name = "WebNavClient" */
} // .end annotation
/* # instance fields */
com.openfeint.internal.ui.WebNav$ActionHandler mActionHandler;
final com.openfeint.internal.ui.WebNav this$0; //synthetic
/* # direct methods */
public com.openfeint.internal.ui.WebNav$WebNavClient ( ) {
/* .locals 0 */
/* .param p2, "anActionHandler" # Lcom/openfeint/internal/ui/WebNav$ActionHandler; */
/* .prologue */
/* .line 365 */
this.this$0 = p1;
/* invoke-direct {p0}, Landroid/webkit/WebViewClient;-><init>()V */
/* .line 366 */
this.mActionHandler = p2;
/* .line 367 */
return;
} // .end method
/* # virtual methods */
protected void attemptRecovery ( android.webkit.WebView p0, java.lang.String p1 ) {
/* .locals 3 */
/* .param p1, "view" # Landroid/webkit/WebView; */
/* .param p2, "url" # Ljava/lang/String; */
/* .prologue */
/* .line 412 */
v0 = com.openfeint.internal.ui.WebViewCache .recover ( );
if ( v0 != null) { // if-eqz v0, :cond_1
	 /* .line 413 */
	 v0 = this.this$0;
	 int v1 = 1; // const/4 v1, 0x1
	 (( com.openfeint.internal.ui.WebNav ) v0 ).load ( v1 ); // invoke-virtual {v0, v1}, Lcom/openfeint/internal/ui/WebNav;->load(Z)V
	 /* .line 414 */
	 /* new-instance v0, Landroid/app/AlertDialog$Builder; */
	 (( android.webkit.WebView ) p1 ).getContext ( ); // invoke-virtual {p1}, Landroid/webkit/WebView;->getContext()Landroid/content/Context;
	 /* invoke-direct {v0, v1}, Landroid/app/AlertDialog$Builder;-><init>(Landroid/content/Context;)V */
	 com.openfeint.internal.OpenFeintInternal .getRString ( v1 );
	 (( android.app.AlertDialog$Builder ) v0 ).setMessage ( v1 ); // invoke-virtual {v0, v1}, Landroid/app/AlertDialog$Builder;->setMessage(Ljava/lang/CharSequence;)Landroid/app/AlertDialog$Builder;
	 com.openfeint.internal.OpenFeintInternal .getRString ( v1 );
	 /* new-instance v2, Lcom/openfeint/internal/ui/WebNav$WebNavClient$2; */
	 /* invoke-direct {v2, p0}, Lcom/openfeint/internal/ui/WebNav$WebNavClient$2;-><init>(Lcom/openfeint/internal/ui/WebNav$WebNavClient;)V */
	 (( android.app.AlertDialog$Builder ) v0 ).setNegativeButton ( v1, v2 ); // invoke-virtual {v0, v1, v2}, Landroid/app/AlertDialog$Builder;->setNegativeButton(Ljava/lang/CharSequence;Landroid/content/DialogInterface$OnClickListener;)Landroid/app/AlertDialog$Builder;
	 com.openfeint.internal.OpenFeintInternal .getRString ( v1 );
	 /* new-instance v2, Lcom/openfeint/internal/ui/WebNav$WebNavClient$1; */
	 /* invoke-direct {v2, p0}, Lcom/openfeint/internal/ui/WebNav$WebNavClient$1;-><init>(Lcom/openfeint/internal/ui/WebNav$WebNavClient;)V */
	 (( android.app.AlertDialog$Builder ) v0 ).setPositiveButton ( v1, v2 ); // invoke-virtual {v0, v1, v2}, Landroid/app/AlertDialog$Builder;->setPositiveButton(Ljava/lang/CharSequence;Landroid/content/DialogInterface$OnClickListener;)Landroid/app/AlertDialog$Builder;
	 (( android.app.AlertDialog$Builder ) v0 ).show ( ); // invoke-virtual {v0}, Landroid/app/AlertDialog$Builder;->show()Landroid/app/AlertDialog;
	 /* .line 432 */
} // :cond_0
} // :goto_0
return;
/* .line 429 */
} // :cond_1
v0 = com.openfeint.internal.ui.WebViewCache .isDiskError ( );
/* if-nez v0, :cond_0 */
/* .line 430 */
v0 = this.this$0;
(( com.openfeint.internal.ui.WebNav ) v0 ).finish ( ); // invoke-virtual {v0}, Lcom/openfeint/internal/ui/WebNav;->finish()V
} // .end method
public void loadInitialContent ( ) {
/* .locals 13 */
/* .prologue */
int v11 = 1; // const/4 v11, 0x1
/* .line 451 */
com.openfeint.internal.OpenFeintInternal .getInstance ( );
/* .line 452 */
/* .local v5, "of":Lcom/openfeint/internal/OpenFeintInternal; */
(( com.openfeint.internal.OpenFeintInternal ) v5 ).getCurrentUser ( ); // invoke-virtual {v5}, Lcom/openfeint/internal/OpenFeintInternal;->getCurrentUser()Lcom/openfeint/api/resource/CurrentUser;
/* .line 453 */
/* .local v4, "localUser":Lcom/openfeint/api/resource/User; */
v8 = this.this$0;
(( com.openfeint.internal.ui.WebNav ) v8 ).getResources ( ); // invoke-virtual {v8}, Lcom/openfeint/internal/ui/WebNav;->getResources()Landroid/content/res/Resources;
(( android.content.res.Resources ) v8 ).getConfiguration ( ); // invoke-virtual {v8}, Landroid/content/res/Resources;->getConfiguration()Landroid/content/res/Configuration;
/* iget v6, v8, Landroid/content/res/Configuration;->orientation:I */
/* .line 455 */
/* .local v6, "orientation":I */
/* new-instance v7, Ljava/util/HashMap; */
/* invoke-direct {v7}, Ljava/util/HashMap;-><init>()V */
/* .line 456 */
/* .local v7, "user":Ljava/util/HashMap;, "Ljava/util/HashMap<Ljava/lang/String;Ljava/lang/Object;>;" */
if ( v4 != null) { // if-eqz v4, :cond_0
/* .line 457 */
final String v8 = "id"; // const-string v8, "id"
(( com.openfeint.api.resource.User ) v4 ).resourceID ( ); // invoke-virtual {v4}, Lcom/openfeint/api/resource/User;->resourceID()Ljava/lang/String;
(( java.util.HashMap ) v7 ).put ( v8, v9 ); // invoke-virtual {v7, v8, v9}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
/* .line 458 */
final String v8 = "name"; // const-string v8, "name"
v9 = this.name;
(( java.util.HashMap ) v7 ).put ( v8, v9 ); // invoke-virtual {v7, v8, v9}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
/* .line 461 */
} // :cond_0
/* new-instance v2, Ljava/util/HashMap; */
/* invoke-direct {v2}, Ljava/util/HashMap;-><init>()V */
/* .line 462 */
/* .local v2, "game":Ljava/util/HashMap;, "Ljava/util/HashMap<Ljava/lang/String;Ljava/lang/Object;>;" */
final String v8 = "id"; // const-string v8, "id"
(( com.openfeint.internal.OpenFeintInternal ) v5 ).getAppID ( ); // invoke-virtual {v5}, Lcom/openfeint/internal/OpenFeintInternal;->getAppID()Ljava/lang/String;
(( java.util.HashMap ) v2 ).put ( v8, v9 ); // invoke-virtual {v2, v8, v9}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
/* .line 463 */
final String v8 = "name"; // const-string v8, "name"
(( com.openfeint.internal.OpenFeintInternal ) v5 ).getAppName ( ); // invoke-virtual {v5}, Lcom/openfeint/internal/OpenFeintInternal;->getAppName()Ljava/lang/String;
(( java.util.HashMap ) v2 ).put ( v8, v9 ); // invoke-virtual {v2, v8, v9}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
/* .line 464 */
final String v8 = "version"; // const-string v8, "version"
v9 = (( com.openfeint.internal.OpenFeintInternal ) v5 ).getAppVersion ( ); // invoke-virtual {v5}, Lcom/openfeint/internal/OpenFeintInternal;->getAppVersion()I
java.lang.Integer .toString ( v9 );
(( java.util.HashMap ) v2 ).put ( v8, v9 ); // invoke-virtual {v2, v8, v9}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
/* .line 466 */
com.openfeint.internal.OpenFeintInternal .getInstance ( );
(( com.openfeint.internal.OpenFeintInternal ) v8 ).getDeviceParams ( ); // invoke-virtual {v8}, Lcom/openfeint/internal/OpenFeintInternal;->getDeviceParams()Ljava/util/Map;
/* .line 468 */
/* .local v1, "device":Ljava/util/Map;, "Ljava/util/Map<Ljava/lang/String;Ljava/lang/Object;>;" */
/* new-instance v0, Ljava/util/HashMap; */
/* invoke-direct {v0}, Ljava/util/HashMap;-><init>()V */
/* .line 469 */
/* .local v0, "config":Ljava/util/HashMap;, "Ljava/util/HashMap<Ljava/lang/String;Ljava/lang/Object;>;" */
final String v8 = "platform"; // const-string v8, "platform"
final String v9 = "android"; // const-string v9, "android"
(( java.util.HashMap ) v0 ).put ( v8, v9 ); // invoke-virtual {v0, v8, v9}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
/* .line 470 */
final String v8 = "clientVersion"; // const-string v8, "clientVersion"
(( com.openfeint.internal.OpenFeintInternal ) v5 ).getOFVersion ( ); // invoke-virtual {v5}, Lcom/openfeint/internal/OpenFeintInternal;->getOFVersion()Ljava/lang/String;
(( java.util.HashMap ) v0 ).put ( v8, v9 ); // invoke-virtual {v0, v8, v9}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
/* .line 471 */
final String v8 = "hasNativeInterface"; // const-string v8, "hasNativeInterface"
java.lang.Boolean .valueOf ( v11 );
(( java.util.HashMap ) v0 ).put ( v8, v9 ); // invoke-virtual {v0, v8, v9}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
/* .line 472 */
final String v8 = "dpi"; // const-string v8, "dpi"
v9 = this.this$0;
com.openfeint.internal.Util .getDpiName ( v9 );
(( java.util.HashMap ) v0 ).put ( v8, v9 ); // invoke-virtual {v0, v8, v9}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
/* .line 473 */
final String v8 = "locale"; // const-string v8, "locale"
v9 = this.this$0;
(( com.openfeint.internal.ui.WebNav ) v9 ).getResources ( ); // invoke-virtual {v9}, Lcom/openfeint/internal/ui/WebNav;->getResources()Landroid/content/res/Resources;
(( android.content.res.Resources ) v9 ).getConfiguration ( ); // invoke-virtual {v9}, Landroid/content/res/Resources;->getConfiguration()Landroid/content/res/Configuration;
v9 = this.locale;
(( java.util.Locale ) v9 ).toString ( ); // invoke-virtual {v9}, Ljava/util/Locale;->toString()Ljava/lang/String;
(( java.util.HashMap ) v0 ).put ( v8, v9 ); // invoke-virtual {v0, v8, v9}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
/* .line 474 */
final String v8 = "user"; // const-string v8, "user"
/* new-instance v9, Lorg/json/JSONObject; */
/* invoke-direct {v9, v7}, Lorg/json/JSONObject;-><init>(Ljava/util/Map;)V */
(( java.util.HashMap ) v0 ).put ( v8, v9 ); // invoke-virtual {v0, v8, v9}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
/* .line 475 */
final String v8 = "game"; // const-string v8, "game"
/* new-instance v9, Lorg/json/JSONObject; */
/* invoke-direct {v9, v2}, Lorg/json/JSONObject;-><init>(Ljava/util/Map;)V */
(( java.util.HashMap ) v0 ).put ( v8, v9 ); // invoke-virtual {v0, v8, v9}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
/* .line 476 */
final String v8 = "device"; // const-string v8, "device"
/* new-instance v9, Lorg/json/JSONObject; */
/* invoke-direct {v9, v1}, Lorg/json/JSONObject;-><init>(Ljava/util/Map;)V */
(( java.util.HashMap ) v0 ).put ( v8, v9 ); // invoke-virtual {v0, v8, v9}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
/* .line 477 */
final String v8 = "actions"; // const-string v8, "actions"
/* new-instance v9, Lorg/json/JSONArray; */
v10 = this.this$0;
(( com.openfeint.internal.ui.WebNav ) v10 ).getActionHandler ( ); // invoke-virtual {v10}, Lcom/openfeint/internal/ui/WebNav;->getActionHandler()Lcom/openfeint/internal/ui/WebNav$ActionHandler;
(( com.openfeint.internal.ui.WebNav$ActionHandler ) v10 ).getActionList ( ); // invoke-virtual {v10}, Lcom/openfeint/internal/ui/WebNav$ActionHandler;->getActionList()Ljava/util/List;
/* invoke-direct {v9, v10}, Lorg/json/JSONArray;-><init>(Ljava/util/Collection;)V */
(( java.util.HashMap ) v0 ).put ( v8, v9 ); // invoke-virtual {v0, v8, v9}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
/* .line 479 */
final String v9 = "orientation"; // const-string v9, "orientation"
int v8 = 2; // const/4 v8, 0x2
/* if-ne v6, v8, :cond_1 */
final String v8 = "landscape"; // const-string v8, "landscape"
} // :goto_0
(( java.util.HashMap ) v0 ).put ( v9, v8 ); // invoke-virtual {v0, v9, v8}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
/* .line 483 */
final String v8 = "serverUrl"; // const-string v8, "serverUrl"
(( com.openfeint.internal.OpenFeintInternal ) v5 ).getServerUrl ( ); // invoke-virtual {v5}, Lcom/openfeint/internal/OpenFeintInternal;->getServerUrl()Ljava/lang/String;
(( java.util.HashMap ) v0 ).put ( v8, v9 ); // invoke-virtual {v0, v8, v9}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
/* .line 485 */
/* new-instance v3, Lorg/json/JSONObject; */
/* invoke-direct {v3, v0}, Lorg/json/JSONObject;-><init>(Ljava/util/Map;)V */
/* .line 488 */
/* .local v3, "json":Lorg/json/JSONObject; */
v8 = this.this$0;
final String v9 = "OF.init.clientBoot(%s)"; // const-string v9, "OF.init.clientBoot(%s)"
/* new-array v10, v11, [Ljava/lang/Object; */
int v11 = 0; // const/4 v11, 0x0
(( org.json.JSONObject ) v3 ).toString ( ); // invoke-virtual {v3}, Lorg/json/JSONObject;->toString()Ljava/lang/String;
/* aput-object v12, v10, v11 */
java.lang.String .format ( v9,v10 );
(( com.openfeint.internal.ui.WebNav ) v8 ).executeJavascript ( v9 ); // invoke-virtual {v8, v9}, Lcom/openfeint/internal/ui/WebNav;->executeJavascript(Ljava/lang/String;)V
/* .line 491 */
v8 = this.mActionHandler;
v8 = this.mWebNav;
(( com.openfeint.internal.ui.WebNav ) v8 ).loadInitialContent ( ); // invoke-virtual {v8}, Lcom/openfeint/internal/ui/WebNav;->loadInitialContent()V
/* .line 492 */
return;
/* .line 479 */
} // .end local v3 # "json":Lorg/json/JSONObject;
} // :cond_1
final String v8 = "portrait"; // const-string v8, "portrait"
} // .end method
public void onPageFinished ( android.webkit.WebView p0, java.lang.String p1 ) {
/* .locals 2 */
/* .param p1, "view" # Landroid/webkit/WebView; */
/* .param p2, "url" # Ljava/lang/String; */
/* .prologue */
/* .line 400 */
v0 = this.this$0;
/* iget-boolean v0, v0, Lcom/openfeint/internal/ui/WebNav;->mIsPageLoaded:Z */
if ( v0 != null) { // if-eqz v0, :cond_0
/* .line 408 */
} // :goto_0
return;
/* .line 401 */
} // :cond_0
v0 = this.this$0;
int v1 = 1; // const/4 v1, 0x1
/* iput-boolean v1, v0, Lcom/openfeint/internal/ui/WebNav;->mIsPageLoaded:Z */
/* .line 403 */
v0 = this.this$0;
/* iget-boolean v0, v0, Lcom/openfeint/internal/ui/WebNav;->mIsFrameworkLoaded:Z */
if ( v0 != null) { // if-eqz v0, :cond_1
/* .line 404 */
(( com.openfeint.internal.ui.WebNav$WebNavClient ) p0 ).loadInitialContent ( ); // invoke-virtual {p0}, Lcom/openfeint/internal/ui/WebNav$WebNavClient;->loadInitialContent()V
/* .line 406 */
} // :cond_1
(( com.openfeint.internal.ui.WebNav$WebNavClient ) p0 ).attemptRecovery ( p1, p2 ); // invoke-virtual {p0, p1, p2}, Lcom/openfeint/internal/ui/WebNav$WebNavClient;->attemptRecovery(Landroid/webkit/WebView;Ljava/lang/String;)V
} // .end method
public void onReceivedError ( android.webkit.WebView p0, Integer p1, java.lang.String p2, java.lang.String p3 ) {
/* .locals 2 */
/* .param p1, "view" # Landroid/webkit/WebView; */
/* .param p2, "errorCode" # I */
/* .param p3, "description" # Ljava/lang/String; */
/* .param p4, "failingUrl" # Ljava/lang/String; */
/* .prologue */
/* .line 395 */
v0 = this.mActionHandler;
int v1 = 0; // const/4 v1, 0x0
(( com.openfeint.internal.ui.WebNav$ActionHandler ) v0 ).hideLoader ( v1 ); // invoke-virtual {v0, v1}, Lcom/openfeint/internal/ui/WebNav$ActionHandler;->hideLoader(Ljava/util/Map;)V
/* .line 396 */
return;
} // .end method
public Boolean shouldOverrideUrlLoading ( android.webkit.WebView p0, java.lang.String p1 ) {
/* .locals 4 */
/* .param p1, "view" # Landroid/webkit/WebView; */
/* .param p2, "stringUrl" # Ljava/lang/String; */
/* .prologue */
/* .line 375 */
android.net.Uri .parse ( p2 );
/* .line 376 */
/* .local v0, "uri":Landroid/net/Uri; */
(( android.net.Uri ) v0 ).getScheme ( ); // invoke-virtual {v0}, Landroid/net/Uri;->getScheme()Ljava/lang/String;
final String v2 = "http"; // const-string v2, "http"
v1 = (( java.lang.String ) v1 ).equals ( v2 ); // invoke-virtual {v1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
/* if-nez v1, :cond_0 */
(( android.net.Uri ) v0 ).getScheme ( ); // invoke-virtual {v0}, Landroid/net/Uri;->getScheme()Ljava/lang/String;
final String v2 = "https"; // const-string v2, "https"
v1 = (( java.lang.String ) v1 ).equals ( v2 ); // invoke-virtual {v1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
if ( v1 != null) { // if-eqz v1, :cond_1
/* .line 378 */
} // :cond_0
(( android.webkit.WebView ) p1 ).loadUrl ( p2 ); // invoke-virtual {p1, p2}, Landroid/webkit/WebView;->loadUrl(Ljava/lang/String;)V
/* .line 385 */
} // :goto_0
int v1 = 1; // const/4 v1, 0x1
/* .line 379 */
} // :cond_1
(( android.net.Uri ) v0 ).getScheme ( ); // invoke-virtual {v0}, Landroid/net/Uri;->getScheme()Ljava/lang/String;
final String v2 = "openfeint"; // const-string v2, "openfeint"
v1 = (( java.lang.String ) v1 ).equals ( v2 ); // invoke-virtual {v1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
if ( v1 != null) { // if-eqz v1, :cond_2
/* .line 380 */
v1 = this.mActionHandler;
(( com.openfeint.internal.ui.WebNav$ActionHandler ) v1 ).dispatch ( v0 ); // invoke-virtual {v1, v0}, Lcom/openfeint/internal/ui/WebNav$ActionHandler;->dispatch(Landroid/net/Uri;)V
/* .line 382 */
} // :cond_2
final String v1 = "WebUI"; // const-string v1, "WebUI"
/* new-instance v2, Ljava/lang/StringBuilder; */
/* invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V */
final String v3 = "UNHANDLED PROTOCOL: "; // const-string v3, "UNHANDLED PROTOCOL: "
(( java.lang.StringBuilder ) v2 ).append ( v3 ); // invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( android.net.Uri ) v0 ).getScheme ( ); // invoke-virtual {v0}, Landroid/net/Uri;->getScheme()Ljava/lang/String;
(( java.lang.StringBuilder ) v2 ).append ( v3 ); // invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v2 ).toString ( ); // invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
com.openfeint.internal.OpenFeintInternal .log ( v1,v2 );
} // .end method
protected void submitCrashReport ( ) {
/* .locals 7 */
/* .prologue */
int v6 = 0; // const/4 v6, 0x0
/* .line 435 */
/* new-instance v0, Ljava/util/HashMap; */
/* invoke-direct {v0}, Ljava/util/HashMap;-><init>()V */
/* .line 436 */
/* .local v0, "crashReport":Ljava/util/Map;, "Ljava/util/Map<Ljava/lang/String;Ljava/lang/Object;>;" */
final String v3 = "console"; // const-string v3, "console"
/* new-instance v4, Lorg/json/JSONArray; */
v5 = this.this$0;
v5 = this.mPreloadConsoleOutput;
/* invoke-direct {v4, v5}, Lorg/json/JSONArray;-><init>(Ljava/util/Collection;)V */
/* .line 438 */
/* new-instance v1, Lorg/json/JSONObject; */
/* invoke-direct {v1, v0}, Lorg/json/JSONObject;-><init>(Ljava/util/Map;)V */
/* .line 440 */
/* .local v1, "json":Lorg/json/JSONObject; */
/* new-instance v2, Ljava/util/HashMap; */
/* invoke-direct {v2}, Ljava/util/HashMap;-><init>()V */
/* .line 441 */
/* .local v2, "params":Ljava/util/Map;, "Ljava/util/Map<Ljava/lang/String;Ljava/lang/Object;>;" */
final String v3 = "crash_report"; // const-string v3, "crash_report"
(( org.json.JSONObject ) v1 ).toString ( ); // invoke-virtual {v1}, Lorg/json/JSONObject;->toString()Ljava/lang/String;
/* .line 442 */
final String v3 = "/webui/crash_report"; // const-string v3, "/webui/crash_report"
final String v4 = "POST"; // const-string v4, "POST"
com.openfeint.internal.OpenFeintInternal .genericRequest ( v3,v4,v2,v6,v6 );
/* .line 443 */
return;
} // .end method
