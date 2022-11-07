public class com.openfeint.internal.ui.WebNav extends com.openfeint.internal.ui.NestedWindow {
	 /* .source "WebNav.java" */
	 /* # annotations */
	 /* .annotation system Ldalvik/annotation/MemberClasses; */
	 /* value = { */
	 /* Lcom/openfeint/internal/ui/WebNav$ActionHandler;, */
	 /* Lcom/openfeint/internal/ui/WebNav$WebNavChromeClient;, */
	 /* Lcom/openfeint/internal/ui/WebNav$WebNavClient; */
	 /* } */
} // .end annotation
/* # static fields */
protected static final Integer REQUEST_CODE_NATIVE_BROWSER;
protected static final java.lang.String TAG;
/* # instance fields */
com.openfeint.internal.ui.WebNav$ActionHandler mActionHandler;
Boolean mIsFrameworkLoaded;
Boolean mIsPageLoaded;
android.app.Dialog mLaunchLoadingView;
private java.util.Map mNativeBrowserParameters;
/* .annotation system Ldalvik/annotation/Signature; */
/* value = { */
/* "Ljava/util/Map", */
/* "<", */
/* "Ljava/lang/String;", */
/* "Ljava/lang/String;", */
/* ">;" */
/* } */
} // .end annotation
} // .end field
protected java.util.ArrayList mPreloadConsoleOutput;
/* .annotation system Ldalvik/annotation/Signature; */
/* value = { */
/* "Ljava/util/ArrayList", */
/* "<", */
/* "Ljava/lang/String;", */
/* ">;" */
/* } */
} // .end annotation
} // .end field
private Boolean mShouldRefreshOnResume;
private com.openfeint.internal.ui.WebNav$WebNavClient mWebViewClient;
protected Integer pageStackCount;
/* # direct methods */
public com.openfeint.internal.ui.WebNav ( ) {
/* .locals 1 */
/* .prologue */
int v0 = 0; // const/4 v0, 0x0
/* .line 51 */
/* invoke-direct {p0}, Lcom/openfeint/internal/ui/NestedWindow;-><init>()V */
/* .line 80 */
/* iput-boolean v0, p0, Lcom/openfeint/internal/ui/WebNav;->mIsPageLoaded:Z */
/* .line 81 */
/* iput-boolean v0, p0, Lcom/openfeint/internal/ui/WebNav;->mIsFrameworkLoaded:Z */
/* .line 86 */
int v0 = 1; // const/4 v0, 0x1
/* iput-boolean v0, p0, Lcom/openfeint/internal/ui/WebNav;->mShouldRefreshOnResume:Z */
/* .line 88 */
/* new-instance v0, Ljava/util/ArrayList; */
/* invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V */
this.mPreloadConsoleOutput = v0;
/* .line 926 */
int v0 = 0; // const/4 v0, 0x0
this.mNativeBrowserParameters = v0;
return;
} // .end method
static void access$100 ( com.openfeint.internal.ui.WebNav p0 ) { //synthethic
/* .locals 0 */
/* .param p0, "x0" # Lcom/openfeint/internal/ui/WebNav; */
/* .prologue */
/* .line 51 */
/* invoke-direct {p0}, Lcom/openfeint/internal/ui/WebNav;->closeForDiskError()V */
return;
} // .end method
static void access$200 ( com.openfeint.internal.ui.WebNav p0 ) { //synthethic
/* .locals 0 */
/* .param p0, "x0" # Lcom/openfeint/internal/ui/WebNav; */
/* .prologue */
/* .line 51 */
/* invoke-direct {p0}, Lcom/openfeint/internal/ui/WebNav;->dismissDialog()V */
return;
} // .end method
static void access$300 ( com.openfeint.internal.ui.WebNav p0 ) { //synthethic
/* .locals 0 */
/* .param p0, "x0" # Lcom/openfeint/internal/ui/WebNav; */
/* .prologue */
/* .line 51 */
/* invoke-direct {p0}, Lcom/openfeint/internal/ui/WebNav;->showDialog()V */
return;
} // .end method
static java.util.Map access$400 ( com.openfeint.internal.ui.WebNav p0 ) { //synthethic
/* .locals 1 */
/* .param p0, "x0" # Lcom/openfeint/internal/ui/WebNav; */
/* .prologue */
/* .line 51 */
v0 = this.mNativeBrowserParameters;
} // .end method
static java.util.Map access$402 ( com.openfeint.internal.ui.WebNav p0, java.util.Map p1 ) { //synthethic
/* .locals 0 */
/* .param p0, "x0" # Lcom/openfeint/internal/ui/WebNav; */
/* .param p1, "x1" # Ljava/util/Map; */
/* .prologue */
/* .line 51 */
this.mNativeBrowserParameters = p1;
} // .end method
private void closeForDiskError ( ) {
/* .locals 1 */
/* .prologue */
/* .line 185 */
/* new-instance v0, Lcom/openfeint/internal/ui/WebNav$4; */
/* invoke-direct {v0, p0}, Lcom/openfeint/internal/ui/WebNav$4;-><init>(Lcom/openfeint/internal/ui/WebNav;)V */
(( com.openfeint.internal.ui.WebNav ) p0 ).runOnUiThread ( v0 ); // invoke-virtual {p0, v0}, Lcom/openfeint/internal/ui/WebNav;->runOnUiThread(Ljava/lang/Runnable;)V
/* .line 201 */
return;
} // .end method
private void dismissDialog ( ) {
/* .locals 1 */
/* .prologue */
/* .line 237 */
v0 = this.mLaunchLoadingView;
v0 = (( android.app.Dialog ) v0 ).isShowing ( ); // invoke-virtual {v0}, Landroid/app/Dialog;->isShowing()Z
if ( v0 != null) { // if-eqz v0, :cond_0
/* .line 238 */
v0 = this.mLaunchLoadingView;
(( android.app.Dialog ) v0 ).dismiss ( ); // invoke-virtual {v0}, Landroid/app/Dialog;->dismiss()V
/* .line 239 */
} // :cond_0
return;
} // .end method
private static final java.lang.String jsQuotedStringLiteral ( java.lang.String p0 ) {
/* .locals 4 */
/* .param p0, "unquotedString" # Ljava/lang/String; */
/* .prologue */
/* .line 204 */
/* if-nez p0, :cond_0 */
final String v0 = "\'\'"; // const-string v0, "\'\'"
/* .line 205 */
} // :goto_0
} // :cond_0
/* new-instance v0, Ljava/lang/StringBuilder; */
/* invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V */
final String v1 = "\'"; // const-string v1, "\'"
(( java.lang.StringBuilder ) v0 ).append ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
final String v1 = "\\"; // const-string v1, "\\"
final String v2 = "\\\\"; // const-string v2, "\\\\"
(( java.lang.String ) p0 ).replace ( v1, v2 ); // invoke-virtual {p0, v1, v2}, Ljava/lang/String;->replace(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Ljava/lang/String;
final String v2 = "\'"; // const-string v2, "\'"
final String v3 = "\\\'"; // const-string v3, "\\\'"
(( java.lang.String ) v1 ).replace ( v2, v3 ); // invoke-virtual {v1, v2, v3}, Ljava/lang/String;->replace(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Ljava/lang/String;
(( java.lang.StringBuilder ) v0 ).append ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
final String v1 = "\'"; // const-string v1, "\'"
(( java.lang.StringBuilder ) v0 ).append ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v0 ).toString ( ); // invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
} // .end method
private void showDialog ( ) {
/* .locals 1 */
/* .prologue */
/* .line 242 */
v0 = this.mLaunchLoadingView;
v0 = (( android.app.Dialog ) v0 ).isShowing ( ); // invoke-virtual {v0}, Landroid/app/Dialog;->isShowing()Z
/* if-nez v0, :cond_0 */
/* .line 243 */
v0 = this.mLaunchLoadingView;
(( android.app.Dialog ) v0 ).show ( ); // invoke-virtual {v0}, Landroid/app/Dialog;->show()V
/* .line 244 */
} // :cond_0
return;
} // .end method
/* # virtual methods */
protected com.openfeint.internal.ui.WebNav$ActionHandler createActionHandler ( com.openfeint.internal.ui.WebNav p0 ) {
/* .locals 1 */
/* .param p1, "webNav" # Lcom/openfeint/internal/ui/WebNav; */
/* .prologue */
/* .line 292 */
/* new-instance v0, Lcom/openfeint/internal/ui/WebNav$ActionHandler; */
/* invoke-direct {v0, p0, p1}, Lcom/openfeint/internal/ui/WebNav$ActionHandler;-><init>(Lcom/openfeint/internal/ui/WebNav;Lcom/openfeint/internal/ui/WebNav;)V */
} // .end method
protected com.openfeint.internal.ui.WebNav$WebNavClient createWebNavClient ( com.openfeint.internal.ui.WebNav$ActionHandler p0 ) {
/* .locals 1 */
/* .param p1, "actionHandler" # Lcom/openfeint/internal/ui/WebNav$ActionHandler; */
/* .prologue */
/* .line 303 */
/* new-instance v0, Lcom/openfeint/internal/ui/WebNav$WebNavClient; */
/* invoke-direct {v0, p0, p1}, Lcom/openfeint/internal/ui/WebNav$WebNavClient;-><init>(Lcom/openfeint/internal/ui/WebNav;Lcom/openfeint/internal/ui/WebNav$ActionHandler;)V */
} // .end method
public void executeJavascript ( java.lang.String p0 ) {
/* .locals 3 */
/* .param p1, "js" # Ljava/lang/String; */
/* .prologue */
/* .line 346 */
v0 = this.mWebView;
if ( v0 != null) { // if-eqz v0, :cond_0
/* .line 347 */
v0 = this.mWebView;
/* new-instance v1, Ljava/lang/StringBuilder; */
/* invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V */
final String v2 = "javascript:"; // const-string v2, "javascript:"
(( java.lang.StringBuilder ) v1 ).append ( v2 ); // invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v1 ).append ( p1 ); // invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v1 ).toString ( ); // invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
(( android.webkit.WebView ) v0 ).loadUrl ( v1 ); // invoke-virtual {v0, v1}, Landroid/webkit/WebView;->loadUrl(Ljava/lang/String;)V
/* .line 349 */
} // :cond_0
return;
} // .end method
public com.openfeint.internal.ui.WebNav$ActionHandler getActionHandler ( ) {
/* .locals 1 */
/* .prologue */
/* .line 75 */
v0 = this.mActionHandler;
} // .end method
public android.app.Dialog getLaunchLoadingView ( ) {
/* .locals 1 */
/* .prologue */
/* .line 78 */
v0 = this.mLaunchLoadingView;
} // .end method
protected java.lang.String initialContentPath ( ) {
/* .locals 3 */
/* .prologue */
/* .line 313 */
(( com.openfeint.internal.ui.WebNav ) p0 ).getIntent ( ); // invoke-virtual {p0}, Lcom/openfeint/internal/ui/WebNav;->getIntent()Landroid/content/Intent;
final String v2 = "content_path"; // const-string v2, "content_path"
(( android.content.Intent ) v1 ).getStringExtra ( v2 ); // invoke-virtual {v1, v2}, Landroid/content/Intent;->getStringExtra(Ljava/lang/String;)Ljava/lang/String;
/* .line 314 */
/* .local v0, "contentPath":Ljava/lang/String; */
/* if-nez v0, :cond_0 */
/* .line 315 */
/* new-instance v1, Ljava/lang/RuntimeException; */
final String v2 = "WebNav intent requires extra value \'content_path\'"; // const-string v2, "WebNav intent requires extra value \'content_path\'"
/* invoke-direct {v1, v2}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/String;)V */
/* throw v1 */
/* .line 317 */
} // :cond_0
} // .end method
protected void load ( Boolean p0 ) {
/* .locals 2 */
/* .param p1, "reload" # Z */
/* .prologue */
/* .line 161 */
int v0 = 0; // const/4 v0, 0x0
/* iput-boolean v0, p0, Lcom/openfeint/internal/ui/WebNav;->mIsPageLoaded:Z */
/* .line 162 */
(( com.openfeint.internal.ui.WebNav ) p0 ).rootPage ( ); // invoke-virtual {p0}, Lcom/openfeint/internal/ui/WebNav;->rootPage()Ljava/lang/String;
/* new-instance v1, Lcom/openfeint/internal/ui/WebNav$3; */
/* invoke-direct {v1, p0, p1}, Lcom/openfeint/internal/ui/WebNav$3;-><init>(Lcom/openfeint/internal/ui/WebNav;Z)V */
com.openfeint.internal.ui.WebViewCache .trackPath ( v0,v1 );
/* .line 180 */
return;
} // .end method
public void loadInitialContent ( ) {
/* .locals 3 */
/* .prologue */
/* .line 266 */
(( com.openfeint.internal.ui.WebNav ) p0 ).initialContentPath ( ); // invoke-virtual {p0}, Lcom/openfeint/internal/ui/WebNav;->initialContentPath()Ljava/lang/String;
/* .line 267 */
/* .local v0, "path":Ljava/lang/String; */
final String v1 = "?"; // const-string v1, "?"
v1 = (( java.lang.String ) v0 ).contains ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z
if ( v1 != null) { // if-eqz v1, :cond_0
final String v1 = "\\?"; // const-string v1, "\\?"
(( java.lang.String ) v0 ).split ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/String;->split(Ljava/lang/String;)[Ljava/lang/String;
int v2 = 0; // const/4 v2, 0x0
/* aget-object v0, v1, v2 */
/* .line 268 */
} // :cond_0
final String v1 = ".json"; // const-string v1, ".json"
v1 = (( java.lang.String ) v0 ).endsWith ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/String;->endsWith(Ljava/lang/String;)Z
/* if-nez v1, :cond_1 */
/* new-instance v1, Ljava/lang/StringBuilder; */
/* invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V */
(( java.lang.StringBuilder ) v1 ).append ( v0 ); // invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
final String v2 = ".json"; // const-string v2, ".json"
(( java.lang.StringBuilder ) v1 ).append ( v2 ); // invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v1 ).toString ( ); // invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
/* .line 270 */
} // :cond_1
/* new-instance v1, Lcom/openfeint/internal/ui/WebNav$5; */
/* invoke-direct {v1, p0}, Lcom/openfeint/internal/ui/WebNav$5;-><init>(Lcom/openfeint/internal/ui/WebNav;)V */
com.openfeint.internal.ui.WebViewCache .trackPath ( v0,v1 );
/* .line 281 */
return;
} // .end method
protected void onActivityResult ( Integer p0, Integer p1, android.content.Intent p2 ) {
/* .locals 11 */
/* .param p1, "requestCode" # I */
/* .param p2, "resultCode" # I */
/* .param p3, "data" # Landroid/content/Intent; */
/* .prologue */
int v10 = 2; // const/4 v10, 0x2
int v9 = 1; // const/4 v9, 0x1
int v8 = 0; // const/4 v8, 0x0
/* .line 929 */
/* invoke-super {p0, p1, p2, p3}, Lcom/openfeint/internal/ui/NestedWindow;->onActivityResult(IILandroid/content/Intent;)V */
/* .line 932 */
v6 = this.mNativeBrowserParameters;
if ( v6 != null) { // if-eqz v6, :cond_5
/* const/16 v6, 0x63dd */
/* if-ne p1, v6, :cond_5 */
/* .line 933 */
if ( p2 != null) { // if-eqz p2, :cond_4
/* .line 936 */
/* iput-boolean v8, p0, Lcom/openfeint/internal/ui/WebNav;->mShouldRefreshOnResume:Z */
/* .line 938 */
final String v6 = "com.openfeint.internal.ui.NativeBrowser.argument.failed"; // const-string v6, "com.openfeint.internal.ui.NativeBrowser.argument.failed"
v6 = (( android.content.Intent ) p3 ).getBooleanExtra ( v6, v8 ); // invoke-virtual {p3, v6, v8}, Landroid/content/Intent;->getBooleanExtra(Ljava/lang/String;Z)Z
if ( v6 != null) { // if-eqz v6, :cond_2
/* .line 939 */
v6 = this.mNativeBrowserParameters;
final String v7 = "on_failure"; // const-string v7, "on_failure"
/* check-cast v1, Ljava/lang/String; */
/* .line 940 */
/* .local v1, "cb":Ljava/lang/String; */
if ( v1 != null) { // if-eqz v1, :cond_0
/* .line 941 */
final String v6 = "com.openfeint.internal.ui.NativeBrowser.argument.failure_code"; // const-string v6, "com.openfeint.internal.ui.NativeBrowser.argument.failure_code"
v2 = (( android.content.Intent ) p3 ).getIntExtra ( v6, v8 ); // invoke-virtual {p3, v6, v8}, Landroid/content/Intent;->getIntExtra(Ljava/lang/String;I)I
/* .line 942 */
/* .local v2, "code":I */
final String v6 = "com.openfeint.internal.ui.NativeBrowser.argument.failure_desc"; // const-string v6, "com.openfeint.internal.ui.NativeBrowser.argument.failure_desc"
(( android.content.Intent ) p3 ).getStringExtra ( v6 ); // invoke-virtual {p3, v6}, Landroid/content/Intent;->getStringExtra(Ljava/lang/String;)Ljava/lang/String;
/* .line 943 */
/* .local v3, "desc":Ljava/lang/String; */
final String v6 = "%s(%d, %s)"; // const-string v6, "%s(%d, %s)"
int v7 = 3; // const/4 v7, 0x3
/* new-array v7, v7, [Ljava/lang/Object; */
/* aput-object v1, v7, v8 */
java.lang.Integer .valueOf ( v2 );
/* aput-object v8, v7, v9 */
com.openfeint.internal.ui.WebNav .jsQuotedStringLiteral ( v3 );
/* aput-object v8, v7, v10 */
java.lang.String .format ( v6,v7 );
(( com.openfeint.internal.ui.WebNav ) p0 ).executeJavascript ( v6 ); // invoke-virtual {p0, v6}, Lcom/openfeint/internal/ui/WebNav;->executeJavascript(Ljava/lang/String;)V
/* .line 960 */
} // .end local v2 # "code":I
} // .end local v3 # "desc":Ljava/lang/String;
} // :cond_0
} // :goto_0
int v6 = 0; // const/4 v6, 0x0
this.mNativeBrowserParameters = v6;
/* .line 978 */
} // .end local v1 # "cb":Ljava/lang/String;
} // :cond_1
} // :goto_1
return;
/* .line 948 */
} // :cond_2
v6 = this.mNativeBrowserParameters;
final String v7 = "callback"; // const-string v7, "callback"
/* check-cast v1, Ljava/lang/String; */
/* .line 949 */
/* .restart local v1 # "cb":Ljava/lang/String; */
if ( v1 != null) { // if-eqz v1, :cond_0
/* .line 950 */
final String v6 = "com.openfeint.internal.ui.NativeBrowser.argument.result"; // const-string v6, "com.openfeint.internal.ui.NativeBrowser.argument.result"
(( android.content.Intent ) p3 ).getStringExtra ( v6 ); // invoke-virtual {p3, v6}, Landroid/content/Intent;->getStringExtra(Ljava/lang/String;)Ljava/lang/String;
/* .line 951 */
/* .local v5, "rv":Ljava/lang/String; */
final String v6 = "%s(%s)"; // const-string v6, "%s(%s)"
/* new-array v7, v10, [Ljava/lang/Object; */
/* aput-object v1, v7, v8 */
if ( v5 != null) { // if-eqz v5, :cond_3
} // .end local v5 # "rv":Ljava/lang/String;
} // :goto_2
/* aput-object v5, v7, v9 */
java.lang.String .format ( v6,v7 );
(( com.openfeint.internal.ui.WebNav ) p0 ).executeJavascript ( v6 ); // invoke-virtual {p0, v6}, Lcom/openfeint/internal/ui/WebNav;->executeJavascript(Ljava/lang/String;)V
/* .restart local v5 # "rv":Ljava/lang/String; */
} // :cond_3
final String v5 = ""; // const-string v5, ""
/* .line 955 */
} // .end local v1 # "cb":Ljava/lang/String;
} // .end local v5 # "rv":Ljava/lang/String;
} // :cond_4
v6 = this.mNativeBrowserParameters;
final String v7 = "on_cancel"; // const-string v7, "on_cancel"
/* check-cast v1, Ljava/lang/String; */
/* .line 956 */
/* .restart local v1 # "cb":Ljava/lang/String; */
if ( v1 != null) { // if-eqz v1, :cond_0
/* .line 957 */
final String v6 = "%s()"; // const-string v6, "%s()"
/* new-array v7, v9, [Ljava/lang/Object; */
/* aput-object v1, v7, v8 */
java.lang.String .format ( v6,v7 );
(( com.openfeint.internal.ui.WebNav ) p0 ).executeJavascript ( v6 ); // invoke-virtual {p0, v6}, Lcom/openfeint/internal/ui/WebNav;->executeJavascript(Ljava/lang/String;)V
/* .line 961 */
} // .end local v1 # "cb":Ljava/lang/String;
} // :cond_5
v6 = com.openfeint.internal.ImagePicker .isImagePickerActivityResult ( p1 );
if ( v6 != null) { // if-eqz v6, :cond_1
/* .line 962 */
/* const/16 v6, 0x98 */
com.openfeint.internal.ImagePicker .onImagePickerActivityResult ( p0,p2,v6,p3 );
/* .line 963 */
/* .local v4, "image":Landroid/graphics/Bitmap; */
if ( v4 != null) { // if-eqz v4, :cond_1
/* .line 964 */
/* new-instance v6, Ljava/lang/StringBuilder; */
/* invoke-direct {v6}, Ljava/lang/StringBuilder;-><init>()V */
final String v7 = "/xp/users/"; // const-string v7, "/xp/users/"
(( java.lang.StringBuilder ) v6 ).append ( v7 ); // invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
com.openfeint.internal.OpenFeintInternal .getInstance ( );
(( com.openfeint.internal.OpenFeintInternal ) v7 ).getCurrentUser ( ); // invoke-virtual {v7}, Lcom/openfeint/internal/OpenFeintInternal;->getCurrentUser()Lcom/openfeint/api/resource/CurrentUser;
(( com.openfeint.api.resource.CurrentUser ) v7 ).resourceID ( ); // invoke-virtual {v7}, Lcom/openfeint/api/resource/CurrentUser;->resourceID()Ljava/lang/String;
(( java.lang.StringBuilder ) v6 ).append ( v7 ); // invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
final String v7 = "/profile_picture"; // const-string v7, "/profile_picture"
(( java.lang.StringBuilder ) v6 ).append ( v7 ); // invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v6 ).toString ( ); // invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
/* .line 965 */
/* .local v0, "apiPath":Ljava/lang/String; */
/* new-instance v6, Lcom/openfeint/internal/ui/WebNav$6; */
/* invoke-direct {v6, p0}, Lcom/openfeint/internal/ui/WebNav$6;-><init>(Lcom/openfeint/internal/ui/WebNav;)V */
com.openfeint.internal.ImagePicker .compressAndUpload ( v4,v0,v6 );
} // .end method
public void onConfigurationChanged ( android.content.res.Configuration p0 ) {
/* .locals 4 */
/* .param p1, "newConfig" # Landroid/content/res/Configuration; */
/* .prologue */
/* .line 251 */
/* invoke-super {p0, p1}, Lcom/openfeint/internal/ui/NestedWindow;->onConfigurationChanged(Landroid/content/res/Configuration;)V */
/* .line 252 */
int v0 = 0; // const/4 v0, 0x0
/* .line 253 */
/* .local v0, "orientationString":Ljava/lang/String; */
/* iget v1, p1, Landroid/content/res/Configuration;->orientation:I */
int v2 = 2; // const/4 v2, 0x2
/* if-ne v1, v2, :cond_0 */
/* .line 254 */
final String v0 = "landscape"; // const-string v0, "landscape"
/* .line 259 */
} // :goto_0
final String v1 = "OF.setOrientation(\'%s\');"; // const-string v1, "OF.setOrientation(\'%s\');"
int v2 = 1; // const/4 v2, 0x1
/* new-array v2, v2, [Ljava/lang/Object; */
int v3 = 0; // const/4 v3, 0x0
/* aput-object v0, v2, v3 */
java.lang.String .format ( v1,v2 );
(( com.openfeint.internal.ui.WebNav ) p0 ).executeJavascript ( v1 ); // invoke-virtual {p0, v1}, Lcom/openfeint/internal/ui/WebNav;->executeJavascript(Ljava/lang/String;)V
/* .line 260 */
return;
/* .line 256 */
} // :cond_0
final String v0 = "portrait"; // const-string v0, "portrait"
} // .end method
public void onCreate ( android.os.Bundle p0 ) {
/* .locals 6 */
/* .param p1, "savedInstanceState" # Landroid/os/Bundle; */
/* .prologue */
int v4 = 1; // const/4 v4, 0x1
int v5 = 0; // const/4 v5, 0x0
/* .line 93 */
/* invoke-super {p0, p1}, Lcom/openfeint/internal/ui/NestedWindow;->onCreate(Landroid/os/Bundle;)V */
/* .line 95 */
final String v2 = "WebUI"; // const-string v2, "WebUI"
final String v3 = "--- WebUI Bootup ---"; // const-string v3, "--- WebUI Bootup ---"
com.openfeint.internal.OpenFeintInternal .log ( v2,v3 );
/* .line 98 */
/* iput v5, p0, Lcom/openfeint/internal/ui/WebNav;->pageStackCount:I */
/* .line 101 */
v2 = this.mWebView;
(( android.webkit.WebView ) v2 ).getSettings ( ); // invoke-virtual {v2}, Landroid/webkit/WebView;->getSettings()Landroid/webkit/WebSettings;
(( android.webkit.WebSettings ) v2 ).setJavaScriptEnabled ( v4 ); // invoke-virtual {v2, v4}, Landroid/webkit/WebSettings;->setJavaScriptEnabled(Z)V
/* .line 102 */
v2 = this.mWebView;
(( android.webkit.WebView ) v2 ).getSettings ( ); // invoke-virtual {v2}, Landroid/webkit/WebView;->getSettings()Landroid/webkit/WebSettings;
(( android.webkit.WebSettings ) v2 ).setPluginsEnabled ( v5 ); // invoke-virtual {v2, v5}, Landroid/webkit/WebSettings;->setPluginsEnabled(Z)V
/* .line 103 */
v2 = this.mWebView;
/* const/high16 v3, 0x2000000 */
(( android.webkit.WebView ) v2 ).setScrollBarStyle ( v3 ); // invoke-virtual {v2, v3}, Landroid/webkit/WebView;->setScrollBarStyle(I)V
/* .line 104 */
v2 = this.mWebView;
(( android.webkit.WebView ) v2 ).getSettings ( ); // invoke-virtual {v2}, Landroid/webkit/WebView;->getSettings()Landroid/webkit/WebSettings;
int v3 = 2; // const/4 v3, 0x2
(( android.webkit.WebSettings ) v2 ).setCacheMode ( v3 ); // invoke-virtual {v2, v3}, Landroid/webkit/WebSettings;->setCacheMode(I)V
/* .line 107 */
/* new-instance v2, Landroid/app/Dialog; */
/* invoke-direct {v2, p0, v3}, Landroid/app/Dialog;-><init>(Landroid/content/Context;I)V */
this.mLaunchLoadingView = v2;
/* .line 108 */
v2 = this.mLaunchLoadingView;
/* new-instance v3, Lcom/openfeint/internal/ui/WebNav$1; */
/* invoke-direct {v3, p0}, Lcom/openfeint/internal/ui/WebNav$1;-><init>(Lcom/openfeint/internal/ui/WebNav;)V */
(( android.app.Dialog ) v2 ).setOnCancelListener ( v3 ); // invoke-virtual {v2, v3}, Landroid/app/Dialog;->setOnCancelListener(Landroid/content/DialogInterface$OnCancelListener;)V
/* .line 114 */
v2 = this.mLaunchLoadingView;
(( android.app.Dialog ) v2 ).setCancelable ( v4 ); // invoke-virtual {v2, v4}, Landroid/app/Dialog;->setCancelable(Z)V
/* .line 115 */
v2 = this.mLaunchLoadingView;
(( android.app.Dialog ) v2 ).setContentView ( v3 ); // invoke-virtual {v2, v3}, Landroid/app/Dialog;->setContentView(I)V
/* .line 117 */
v2 = this.mLaunchLoadingView;
(( android.app.Dialog ) v2 ).findViewById ( v3 ); // invoke-virtual {v2, v3}, Landroid/app/Dialog;->findViewById(I)Landroid/view/View;
/* check-cast v1, Landroid/widget/ProgressBar; */
/* .line 118 */
/* .local v1, "progress":Landroid/widget/ProgressBar; */
(( android.widget.ProgressBar ) v1 ).setIndeterminate ( v4 ); // invoke-virtual {v1, v4}, Landroid/widget/ProgressBar;->setIndeterminate(Z)V
/* .line 119 */
com.openfeint.internal.OpenFeintInternal .getInstance ( );
(( com.openfeint.internal.OpenFeintInternal ) v2 ).getContext ( ); // invoke-virtual {v2}, Lcom/openfeint/internal/OpenFeintInternal;->getContext()Landroid/content/Context;
(( android.content.Context ) v2 ).getResources ( ); // invoke-virtual {v2}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;
(( android.content.res.Resources ) v2 ).getDrawable ( v3 ); // invoke-virtual {v2, v3}, Landroid/content/res/Resources;->getDrawable(I)Landroid/graphics/drawable/Drawable;
(( android.widget.ProgressBar ) v1 ).setIndeterminateDrawable ( v2 ); // invoke-virtual {v1, v2}, Landroid/widget/ProgressBar;->setIndeterminateDrawable(Landroid/graphics/drawable/Drawable;)V
/* .line 125 */
(( com.openfeint.internal.ui.WebNav ) p0 ).createActionHandler ( p0 ); // invoke-virtual {p0, p0}, Lcom/openfeint/internal/ui/WebNav;->createActionHandler(Lcom/openfeint/internal/ui/WebNav;)Lcom/openfeint/internal/ui/WebNav$ActionHandler;
this.mActionHandler = v2;
/* .line 126 */
v2 = this.mActionHandler;
(( com.openfeint.internal.ui.WebNav ) p0 ).createWebNavClient ( v2 ); // invoke-virtual {p0, v2}, Lcom/openfeint/internal/ui/WebNav;->createWebNavClient(Lcom/openfeint/internal/ui/WebNav$ActionHandler;)Lcom/openfeint/internal/ui/WebNav$WebNavClient;
this.mWebViewClient = v2;
/* .line 127 */
v2 = this.mWebView;
v3 = this.mWebViewClient;
(( android.webkit.WebView ) v2 ).setWebViewClient ( v3 ); // invoke-virtual {v2, v3}, Landroid/webkit/WebView;->setWebViewClient(Landroid/webkit/WebViewClient;)V
/* .line 128 */
v2 = this.mWebView;
/* new-instance v3, Lcom/openfeint/internal/ui/WebNav$WebNavChromeClient; */
int v4 = 0; // const/4 v4, 0x0
/* invoke-direct {v3, p0, v4}, Lcom/openfeint/internal/ui/WebNav$WebNavChromeClient;-><init>(Lcom/openfeint/internal/ui/WebNav;Lcom/openfeint/internal/ui/WebNav$1;)V */
(( android.webkit.WebView ) v2 ).setWebChromeClient ( v3 ); // invoke-virtual {v2, v3}, Landroid/webkit/WebView;->setWebChromeClient(Landroid/webkit/WebChromeClient;)V
/* .line 131 */
v2 = this.mWebView;
/* new-instance v3, Lcom/openfeint/internal/ui/WebNav$2; */
/* invoke-direct {v3, p0}, Lcom/openfeint/internal/ui/WebNav$2;-><init>(Lcom/openfeint/internal/ui/WebNav;)V */
final String v4 = "NativeInterface"; // const-string v4, "NativeInterface"
(( android.webkit.WebView ) v2 ).addJavascriptInterface ( v3, v4 ); // invoke-virtual {v2, v3, v4}, Landroid/webkit/WebView;->addJavascriptInterface(Ljava/lang/Object;Ljava/lang/String;)V
/* .line 148 */
(( com.openfeint.internal.ui.WebNav ) p0 ).initialContentPath ( ); // invoke-virtual {p0}, Lcom/openfeint/internal/ui/WebNav;->initialContentPath()Ljava/lang/String;
/* .line 149 */
/* .local v0, "path":Ljava/lang/String; */
final String v2 = "?"; // const-string v2, "?"
v2 = (( java.lang.String ) v0 ).contains ( v2 ); // invoke-virtual {v0, v2}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z
if ( v2 != null) { // if-eqz v2, :cond_0
final String v2 = "\\?"; // const-string v2, "\\?"
(( java.lang.String ) v0 ).split ( v2 ); // invoke-virtual {v0, v2}, Ljava/lang/String;->split(Ljava/lang/String;)[Ljava/lang/String;
/* aget-object v0, v2, v5 */
/* .line 150 */
} // :cond_0
final String v2 = ".json"; // const-string v2, ".json"
v2 = (( java.lang.String ) v0 ).endsWith ( v2 ); // invoke-virtual {v0, v2}, Ljava/lang/String;->endsWith(Ljava/lang/String;)Z
/* if-nez v2, :cond_1 */
/* new-instance v2, Ljava/lang/StringBuilder; */
/* invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V */
(( java.lang.StringBuilder ) v2 ).append ( v0 ); // invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
final String v3 = ".json"; // const-string v3, ".json"
(( java.lang.StringBuilder ) v2 ).append ( v3 ); // invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v2 ).toString ( ); // invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
/* .line 151 */
} // :cond_1
com.openfeint.internal.ui.WebViewCache .prioritize ( v0 );
/* .line 152 */
(( com.openfeint.internal.ui.WebNav ) p0 ).load ( v5 ); // invoke-virtual {p0, v5}, Lcom/openfeint/internal/ui/WebNav;->load(Z)V
/* .line 153 */
v2 = this.mLaunchLoadingView;
(( android.app.Dialog ) v2 ).show ( ); // invoke-virtual {v2}, Landroid/app/Dialog;->show()V
/* .line 154 */
return;
} // .end method
public void onDestroy ( ) {
/* .locals 1 */
/* .prologue */
/* .line 995 */
v0 = this.mWebView;
(( android.webkit.WebView ) v0 ).destroy ( ); // invoke-virtual {v0}, Landroid/webkit/WebView;->destroy()V
/* .line 996 */
int v0 = 0; // const/4 v0, 0x0
this.mWebView = v0;
/* .line 997 */
/* invoke-super {p0}, Lcom/openfeint/internal/ui/NestedWindow;->onDestroy()V */
/* .line 998 */
return;
} // .end method
public Boolean onKeyDown ( Integer p0, android.view.KeyEvent p1 ) {
/* .locals 5 */
/* .param p1, "keyCode" # I */
/* .param p2, "event" # Landroid/view/KeyEvent; */
/* .prologue */
int v0 = 1; // const/4 v0, 0x1
/* .line 326 */
/* const/16 v1, 0x54 */
/* if-ne p1, v1, :cond_0 */
/* .line 327 */
final String v1 = "OF.menu(\'%s\')"; // const-string v1, "OF.menu(\'%s\')"
/* new-array v2, v0, [Ljava/lang/Object; */
int v3 = 0; // const/4 v3, 0x0
final String v4 = "search"; // const-string v4, "search"
/* aput-object v4, v2, v3 */
java.lang.String .format ( v1,v2 );
(( com.openfeint.internal.ui.WebNav ) p0 ).executeJavascript ( v1 ); // invoke-virtual {p0, v1}, Lcom/openfeint/internal/ui/WebNav;->executeJavascript(Ljava/lang/String;)V
/* .line 336 */
} // :goto_0
/* .line 331 */
} // :cond_0
int v1 = 4; // const/4 v1, 0x4
/* if-ne p1, v1, :cond_1 */
/* iget v1, p0, Lcom/openfeint/internal/ui/WebNav;->pageStackCount:I */
/* if-le v1, v0, :cond_1 */
/* .line 332 */
final String v1 = "OF.goBack()"; // const-string v1, "OF.goBack()"
(( com.openfeint.internal.ui.WebNav ) p0 ).executeJavascript ( v1 ); // invoke-virtual {p0, v1}, Lcom/openfeint/internal/ui/WebNav;->executeJavascript(Ljava/lang/String;)V
/* .line 336 */
} // :cond_1
v0 = /* invoke-super {p0, p1, p2}, Lcom/openfeint/internal/ui/NestedWindow;->onKeyDown(ILandroid/view/KeyEvent;)Z */
} // .end method
protected void onRestoreInstanceState ( android.os.Bundle p0 ) {
/* .locals 0 */
/* .param p1, "inState" # Landroid/os/Bundle; */
/* .prologue */
/* .line 64 */
com.openfeint.internal.OpenFeintInternal .restoreInstanceState ( p1 );
/* .line 65 */
return;
} // .end method
public void onResume ( ) {
/* .locals 6 */
/* .prologue */
int v5 = 1; // const/4 v5, 0x1
/* .line 214 */
/* invoke-super {p0}, Lcom/openfeint/internal/ui/NestedWindow;->onResume()V */
/* .line 216 */
com.openfeint.internal.OpenFeintInternal .getInstance ( );
(( com.openfeint.internal.OpenFeintInternal ) v1 ).getCurrentUser ( ); // invoke-virtual {v1}, Lcom/openfeint/internal/OpenFeintInternal;->getCurrentUser()Lcom/openfeint/api/resource/CurrentUser;
/* .line 217 */
/* .local v0, "localUser":Lcom/openfeint/api/resource/User; */
if ( v0 != null) { // if-eqz v0, :cond_0
/* iget-boolean v1, p0, Lcom/openfeint/internal/ui/WebNav;->mIsFrameworkLoaded:Z */
if ( v1 != null) { // if-eqz v1, :cond_0
/* .line 218 */
final String v1 = "if (OF.user) { OF.user.name = %s; OF.user.id = \'%s\'; }"; // const-string v1, "if (OF.user) { OF.user.name = %s; OF.user.id = \'%s\'; }"
int v2 = 2; // const/4 v2, 0x2
/* new-array v2, v2, [Ljava/lang/Object; */
int v3 = 0; // const/4 v3, 0x0
v4 = this.name;
com.openfeint.internal.ui.WebNav .jsQuotedStringLiteral ( v4 );
/* aput-object v4, v2, v3 */
(( com.openfeint.api.resource.User ) v0 ).resourceID ( ); // invoke-virtual {v0}, Lcom/openfeint/api/resource/User;->resourceID()Ljava/lang/String;
/* aput-object v3, v2, v5 */
java.lang.String .format ( v1,v2 );
(( com.openfeint.internal.ui.WebNav ) p0 ).executeJavascript ( v1 ); // invoke-virtual {p0, v1}, Lcom/openfeint/internal/ui/WebNav;->executeJavascript(Ljava/lang/String;)V
/* .line 222 */
/* iget-boolean v1, p0, Lcom/openfeint/internal/ui/WebNav;->mShouldRefreshOnResume:Z */
if ( v1 != null) { // if-eqz v1, :cond_0
/* .line 223 */
final String v1 = "if (OF.page) OF.refresh();"; // const-string v1, "if (OF.page) OF.refresh();"
(( com.openfeint.internal.ui.WebNav ) p0 ).executeJavascript ( v1 ); // invoke-virtual {p0, v1}, Lcom/openfeint/internal/ui/WebNav;->executeJavascript(Ljava/lang/String;)V
/* .line 227 */
} // :cond_0
/* iput-boolean v5, p0, Lcom/openfeint/internal/ui/WebNav;->mShouldRefreshOnResume:Z */
/* .line 228 */
return;
} // .end method
protected void onSaveInstanceState ( android.os.Bundle p0 ) {
/* .locals 0 */
/* .param p1, "outState" # Landroid/os/Bundle; */
/* .prologue */
/* .line 57 */
com.openfeint.internal.OpenFeintInternal .saveInstanceState ( p1 );
/* .line 58 */
return;
} // .end method
public void onStop ( ) {
/* .locals 0 */
/* .prologue */
/* .line 232 */
/* invoke-super {p0}, Lcom/openfeint/internal/ui/NestedWindow;->onStop()V */
/* .line 233 */
/* invoke-direct {p0}, Lcom/openfeint/internal/ui/WebNav;->dismissDialog()V */
/* .line 234 */
return;
} // .end method
public void onWindowFocusChanged ( Boolean p0 ) {
/* .locals 2 */
/* .param p1, "hasFocus" # Z */
/* .prologue */
/* .line 982 */
/* invoke-super {p0, p1}, Lcom/openfeint/internal/ui/NestedWindow;->onWindowFocusChanged(Z)V */
/* .line 983 */
com.openfeint.internal.OpenFeintInternal .getInstance ( );
(( com.openfeint.internal.OpenFeintInternal ) v1 ).getDelegate ( ); // invoke-virtual {v1}, Lcom/openfeint/internal/OpenFeintInternal;->getDelegate()Lcom/openfeint/api/OpenFeintDelegate;
/* .line 984 */
/* .local v0, "d":Lcom/openfeint/api/OpenFeintDelegate; */
if ( v0 != null) { // if-eqz v0, :cond_0
/* .line 985 */
if ( p1 != null) { // if-eqz p1, :cond_1
/* .line 986 */
(( com.openfeint.api.OpenFeintDelegate ) v0 ).onDashboardAppear ( ); // invoke-virtual {v0}, Lcom/openfeint/api/OpenFeintDelegate;->onDashboardAppear()V
/* .line 991 */
} // :cond_0
} // :goto_0
return;
/* .line 988 */
} // :cond_1
(( com.openfeint.api.OpenFeintDelegate ) v0 ).onDashboardDisappear ( ); // invoke-virtual {v0}, Lcom/openfeint/api/OpenFeintDelegate;->onDashboardDisappear()V
} // .end method
protected java.lang.String rootPage ( ) {
/* .locals 1 */
/* .prologue */
/* .line 157 */
final String v0 = "index.html"; // const-string v0, "index.html"
} // .end method
protected void setFrameworkLoaded ( Boolean p0 ) {
/* .locals 0 */
/* .param p1, "value" # Z */
/* .prologue */
/* .line 82 */
/* iput-boolean p1, p0, Lcom/openfeint/internal/ui/WebNav;->mIsFrameworkLoaded:Z */
return;
} // .end method
