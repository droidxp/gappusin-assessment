public class com.facebook.android.Facebook {
	 /* .source "Facebook.java" */
	 /* # annotations */
	 /* .annotation system Ldalvik/annotation/MemberClasses; */
	 /* value = { */
	 /* Lcom/facebook/android/Facebook$DialogListener;, */
	 /* Lcom/facebook/android/Facebook$ServiceListener;, */
	 /* Lcom/facebook/android/Facebook$TokenRefreshServiceConnection; */
	 /* } */
} // .end annotation
/* # static fields */
public static final java.lang.String CANCEL_URI;
private static final Integer DEFAULT_AUTH_ACTIVITY_CODE;
protected static java.lang.String DIALOG_BASE_URL;
public static final java.lang.String EXPIRES;
public static final java.lang.String FB_APP_SIGNATURE;
public static final Integer FORCE_DIALOG_AUTH;
protected static java.lang.String GRAPH_BASE_URL;
private static final java.lang.String LOGIN;
public static final java.lang.String REDIRECT_URI;
protected static java.lang.String RESTSERVER_URL;
public static final java.lang.String SINGLE_SIGN_ON_DISABLED;
public static final java.lang.String TOKEN;
/* # instance fields */
private final Long REFRESH_TOKEN_BARRIER;
private Long mAccessExpires;
private java.lang.String mAccessToken;
private java.lang.String mAppId;
private android.app.Activity mAuthActivity;
private Integer mAuthActivityCode;
private com.facebook.android.Facebook$DialogListener mAuthDialogListener;
private java.lang.String mAuthPermissions;
private Long mLastAccessUpdate;
/* # direct methods */
static com.facebook.android.Facebook ( ) {
	 /* .locals 1 */
	 /* .prologue */
	 /* .line 72 */
	 final String v0 = "https://m.facebook.com/dialog/"; // const-string v0, "https://m.facebook.com/dialog/"
	 /* .line 71 */
	 /* .line 74 */
	 final String v0 = "https://graph.facebook.com/"; // const-string v0, "https://graph.facebook.com/"
	 /* .line 73 */
	 /* .line 76 */
	 final String v0 = "https://api.facebook.com/restserver.php"; // const-string v0, "https://api.facebook.com/restserver.php"
	 /* .line 75 */
	 /* .line 54 */
	 return;
} // .end method
public com.facebook.android.Facebook ( ) {
	 /* .locals 3 */
	 /* .param p1, "appId" # Ljava/lang/String; */
	 /* .prologue */
	 /* const-wide/16 v1, 0x0 */
	 /* .line 99 */
	 /* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
	 /* .line 78 */
	 int v0 = 0; // const/4 v0, 0x0
	 this.mAccessToken = v0;
	 /* .line 79 */
	 /* iput-wide v1, p0, Lcom/facebook/android/Facebook;->mLastAccessUpdate:J */
	 /* .line 80 */
	 /* iput-wide v1, p0, Lcom/facebook/android/Facebook;->mAccessExpires:J */
	 /* .line 90 */
	 /* const-wide/32 v0, 0x5265c00 */
	 /* iput-wide v0, p0, Lcom/facebook/android/Facebook;->REFRESH_TOKEN_BARRIER:J */
	 /* .line 100 */
	 /* if-nez p1, :cond_0 */
	 /* .line 101 */
	 /* new-instance v0, Ljava/lang/IllegalArgumentException; */
	 /* .line 102 */
	 final String v1 = "You must specify your application ID when instantiating a Facebook object.See README for details."; // const-string v1, "You must specify your application ID when instantiating a Facebook object.See README for details."
	 /* .line 101 */
	 /* invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V */
	 /* throw v0 */
	 /* .line 105 */
} // :cond_0
this.mAppId = p1;
/* .line 106 */
return;
} // .end method
static java.lang.String access$0 ( com.facebook.android.Facebook p0 ) { //synthethic
/* .locals 1 */
/* .prologue */
/* .line 78 */
v0 = this.mAccessToken;
} // .end method
static com.facebook.android.Facebook$DialogListener access$1 ( com.facebook.android.Facebook p0 ) { //synthethic
/* .locals 1 */
/* .prologue */
/* .line 86 */
v0 = this.mAuthDialogListener;
} // .end method
private void startDialogAuth ( android.app.Activity p0, java.lang.String[] p1 ) {
/* .locals 3 */
/* .param p1, "activity" # Landroid/app/Activity; */
/* .param p2, "permissions" # [Ljava/lang/String; */
/* .prologue */
/* .line 338 */
/* new-instance v0, Landroid/os/Bundle; */
/* invoke-direct {v0}, Landroid/os/Bundle;-><init>()V */
/* .line 339 */
/* .local v0, "params":Landroid/os/Bundle; */
/* array-length v1, p2 */
/* if-lez v1, :cond_0 */
/* .line 340 */
final String v1 = "scope"; // const-string v1, "scope"
final String v2 = ","; // const-string v2, ","
android.text.TextUtils .join ( v2,p2 );
(( android.os.Bundle ) v0 ).putString ( v1, v2 ); // invoke-virtual {v0, v1, v2}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V
/* .line 342 */
} // :cond_0
android.webkit.CookieSyncManager .createInstance ( p1 );
/* .line 343 */
final String v1 = "oauth"; // const-string v1, "oauth"
/* new-instance v2, Lcom/facebook/android/Facebook$1; */
/* invoke-direct {v2, p0}, Lcom/facebook/android/Facebook$1;-><init>(Lcom/facebook/android/Facebook;)V */
(( com.facebook.android.Facebook ) p0 ).dialog ( p1, v1, v0, v2 ); // invoke-virtual {p0, p1, v1, v0, v2}, Lcom/facebook/android/Facebook;->dialog(Landroid/content/Context;Ljava/lang/String;Landroid/os/Bundle;Lcom/facebook/android/Facebook$DialogListener;)V
/* .line 376 */
return;
} // .end method
private Boolean startSingleSignOn ( android.app.Activity p0, java.lang.String p1, java.lang.String[] p2, Integer p3 ) {
/* .locals 5 */
/* .param p1, "activity" # Landroid/app/Activity; */
/* .param p2, "applicationId" # Ljava/lang/String; */
/* .param p3, "permissions" # [Ljava/lang/String; */
/* .param p4, "activityCode" # I */
/* .prologue */
/* .line 226 */
int v0 = 1; // const/4 v0, 0x1
/* .line 227 */
/* .local v0, "didSucceed":Z */
/* new-instance v2, Landroid/content/Intent; */
/* invoke-direct {v2}, Landroid/content/Intent;-><init>()V */
/* .line 229 */
/* .local v2, "intent":Landroid/content/Intent; */
final String v3 = "com.facebook.katana"; // const-string v3, "com.facebook.katana"
/* .line 230 */
final String v4 = "com.facebook.katana.ProxyAuth"; // const-string v4, "com.facebook.katana.ProxyAuth"
/* .line 229 */
(( android.content.Intent ) v2 ).setClassName ( v3, v4 ); // invoke-virtual {v2, v3, v4}, Landroid/content/Intent;->setClassName(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;
/* .line 231 */
final String v3 = "client_id"; // const-string v3, "client_id"
(( android.content.Intent ) v2 ).putExtra ( v3, p2 ); // invoke-virtual {v2, v3, p2}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;
/* .line 232 */
/* array-length v3, p3 */
/* if-lez v3, :cond_0 */
/* .line 233 */
final String v3 = "scope"; // const-string v3, "scope"
final String v4 = ","; // const-string v4, ","
android.text.TextUtils .join ( v4,p3 );
(( android.content.Intent ) v2 ).putExtra ( v3, v4 ); // invoke-virtual {v2, v3, v4}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;
/* .line 239 */
} // :cond_0
v3 = /* invoke-direct {p0, p1, v2}, Lcom/facebook/android/Facebook;->validateActivityIntent(Landroid/content/Context;Landroid/content/Intent;)Z */
/* if-nez v3, :cond_1 */
/* .line 240 */
int v3 = 0; // const/4 v3, 0x0
/* .line 252 */
} // :goto_0
/* .line 243 */
} // :cond_1
this.mAuthActivity = p1;
/* .line 244 */
this.mAuthPermissions = p3;
/* .line 245 */
/* iput p4, p0, Lcom/facebook/android/Facebook;->mAuthActivityCode:I */
/* .line 247 */
try { // :try_start_0
(( android.app.Activity ) p1 ).startActivityForResult ( v2, p4 ); // invoke-virtual {p1, v2, p4}, Landroid/app/Activity;->startActivityForResult(Landroid/content/Intent;I)V
/* :try_end_0 */
/* .catch Landroid/content/ActivityNotFoundException; {:try_start_0 ..:try_end_0} :catch_0 */
} // :goto_1
/* move v3, v0 */
/* .line 252 */
/* .line 248 */
/* :catch_0 */
/* move-exception v1 */
/* .line 249 */
/* .local v1, "e":Landroid/content/ActivityNotFoundException; */
int v0 = 0; // const/4 v0, 0x0
} // .end method
private Boolean validateActivityIntent ( android.content.Context p0, android.content.Intent p1 ) {
/* .locals 3 */
/* .param p1, "context" # Landroid/content/Context; */
/* .param p2, "intent" # Landroid/content/Intent; */
/* .prologue */
int v1 = 0; // const/4 v1, 0x0
/* .line 266 */
(( android.content.Context ) p1 ).getPackageManager ( ); // invoke-virtual {p1}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;
(( android.content.pm.PackageManager ) v2 ).resolveActivity ( p2, v1 ); // invoke-virtual {v2, p2, v1}, Landroid/content/pm/PackageManager;->resolveActivity(Landroid/content/Intent;I)Landroid/content/pm/ResolveInfo;
/* .line 267 */
/* .local v0, "resolveInfo":Landroid/content/pm/ResolveInfo; */
/* if-nez v0, :cond_0 */
/* .line 271 */
} // :goto_0
/* .line 273 */
} // :cond_0
v1 = this.activityInfo;
v1 = this.packageName;
/* .line 271 */
v1 = /* invoke-direct {p0, p1, v1}, Lcom/facebook/android/Facebook;->validateAppSignatureForPackage(Landroid/content/Context;Ljava/lang/String;)Z */
} // .end method
private Boolean validateAppSignatureForPackage ( android.content.Context p0, java.lang.String p1 ) {
/* .locals 9 */
/* .param p1, "context" # Landroid/content/Context; */
/* .param p2, "packageName" # Ljava/lang/String; */
/* .prologue */
int v3 = 0; // const/4 v3, 0x0
/* .line 311 */
try { // :try_start_0
(( android.content.Context ) p1 ).getPackageManager ( ); // invoke-virtual {p1}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;
/* .line 312 */
/* const/16 v5, 0x40 */
/* .line 311 */
(( android.content.pm.PackageManager ) v4 ).getPackageInfo ( p2, v5 ); // invoke-virtual {v4, p2, v5}, Landroid/content/pm/PackageManager;->getPackageInfo(Ljava/lang/String;I)Landroid/content/pm/PackageInfo;
/* :try_end_0 */
/* .catch Landroid/content/pm/PackageManager$NameNotFoundException; {:try_start_0 ..:try_end_0} :catch_0 */
/* .line 317 */
/* .local v1, "packageInfo":Landroid/content/pm/PackageInfo; */
v5 = this.signatures;
/* array-length v6, v5 */
/* move v4, v3 */
} // :goto_0
/* if-lt v4, v6, :cond_0 */
/* .line 322 */
} // .end local v1 # "packageInfo":Landroid/content/pm/PackageInfo;
} // :goto_1
/* .line 313 */
/* :catch_0 */
/* move-exception v0 */
/* .line 314 */
/* .local v0, "e":Landroid/content/pm/PackageManager$NameNotFoundException; */
/* .line 317 */
} // .end local v0 # "e":Landroid/content/pm/PackageManager$NameNotFoundException;
/* .restart local v1 # "packageInfo":Landroid/content/pm/PackageInfo; */
} // :cond_0
/* aget-object v2, v5, v4 */
/* .line 318 */
/* .local v2, "signature":Landroid/content/pm/Signature; */
(( android.content.pm.Signature ) v2 ).toCharsString ( ); // invoke-virtual {v2}, Landroid/content/pm/Signature;->toCharsString()Ljava/lang/String;
final String v8 = "30820268308201d102044a9c4610300d06092a864886f70d0101040500307a310b3009060355040613025553310b3009060355040813024341311230100603550407130950616c6f20416c746f31183016060355040a130f46616365626f6f6b204d6f62696c653111300f060355040b130846616365626f6f6b311d301b0603550403131446616365626f6f6b20436f72706f726174696f6e3020170d3039303833313231353231365a180f32303530303932353231353231365a307a310b3009060355040613025553310b3009060355040813024341311230100603550407130950616c6f20416c746f31183016060355040a130f46616365626f6f6b204d6f62696c653111300f060355040b130846616365626f6f6b311d301b0603550403131446616365626f6f6b20436f72706f726174696f6e30819f300d06092a864886f70d010101050003818d0030818902818100c207d51df8eb8c97d93ba0c8c1002c928fab00dc1b42fca5e66e99cc3023ed2d214d822bc59e8e35ddcf5f44c7ae8ade50d7e0c434f500e6c131f4a2834f987fc46406115de2018ebbb0d5a3c261bd97581ccfef76afc7135a6d59e8855ecd7eacc8f8737e794c60a761c536b72b11fac8e603f5da1a2d54aa103b8a13c0dbc10203010001300d06092a864886f70d0101040500038181005ee9be8bcbb250648d3b741290a82a1c9dc2e76a0af2f2228f1d9f9c4007529c446a70175c5a900d5141812866db46be6559e2141616483998211f4a673149fb2232a10d247663b26a9031e15f84bc1c74d141ff98a02d76f85b2c8ab2571b6469b232d8e768a7f7ca04f7abe4a775615916c07940656b58717457b42bd928a2"; // const-string v8, "30820268308201d102044a9c4610300d06092a864886f70d0101040500307a310b3009060355040613025553310b3009060355040813024341311230100603550407130950616c6f20416c746f31183016060355040a130f46616365626f6f6b204d6f62696c653111300f060355040b130846616365626f6f6b311d301b0603550403131446616365626f6f6b20436f72706f726174696f6e3020170d3039303833313231353231365a180f32303530303932353231353231365a307a310b3009060355040613025553310b3009060355040813024341311230100603550407130950616c6f20416c746f31183016060355040a130f46616365626f6f6b204d6f62696c653111300f060355040b130846616365626f6f6b311d301b0603550403131446616365626f6f6b20436f72706f726174696f6e30819f300d06092a864886f70d010101050003818d0030818902818100c207d51df8eb8c97d93ba0c8c1002c928fab00dc1b42fca5e66e99cc3023ed2d214d822bc59e8e35ddcf5f44c7ae8ade50d7e0c434f500e6c131f4a2834f987fc46406115de2018ebbb0d5a3c261bd97581ccfef76afc7135a6d59e8855ecd7eacc8f8737e794c60a761c536b72b11fac8e603f5da1a2d54aa103b8a13c0dbc10203010001300d06092a864886f70d0101040500038181005ee9be8bcbb250648d3b741290a82a1c9dc2e76a0af2f2228f1d9f9c4007529c446a70175c5a900d5141812866db46be6559e2141616483998211f4a673149fb2232a10d247663b26a9031e15f84bc1c74d141ff98a02d76f85b2c8ab2571b6469b232d8e768a7f7ca04f7abe4a775615916c07940656b58717457b42bd928a2"
v7 = (( java.lang.String ) v7 ).equals ( v8 ); // invoke-virtual {v7, v8}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
if ( v7 != null) { // if-eqz v7, :cond_1
/* .line 319 */
int v3 = 1; // const/4 v3, 0x1
/* .line 317 */
} // :cond_1
/* add-int/lit8 v4, v4, 0x1 */
} // .end method
private Boolean validateServiceIntent ( android.content.Context p0, android.content.Intent p1 ) {
/* .locals 3 */
/* .param p1, "context" # Landroid/content/Context; */
/* .param p2, "intent" # Landroid/content/Intent; */
/* .prologue */
int v1 = 0; // const/4 v1, 0x0
/* .line 288 */
(( android.content.Context ) p1 ).getPackageManager ( ); // invoke-virtual {p1}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;
(( android.content.pm.PackageManager ) v2 ).resolveService ( p2, v1 ); // invoke-virtual {v2, p2, v1}, Landroid/content/pm/PackageManager;->resolveService(Landroid/content/Intent;I)Landroid/content/pm/ResolveInfo;
/* .line 289 */
/* .local v0, "resolveInfo":Landroid/content/pm/ResolveInfo; */
/* if-nez v0, :cond_0 */
/* .line 293 */
} // :goto_0
/* .line 295 */
} // :cond_0
v1 = this.serviceInfo;
v1 = this.packageName;
/* .line 293 */
v1 = /* invoke-direct {p0, p1, v1}, Lcom/facebook/android/Facebook;->validateAppSignatureForPackage(Landroid/content/Context;Ljava/lang/String;)Z */
} // .end method
/* # virtual methods */
public void authorize ( android.app.Activity p0, com.facebook.android.Facebook$DialogListener p1 ) {
/* .locals 2 */
/* .param p1, "activity" # Landroid/app/Activity; */
/* .param p2, "listener" # Lcom/facebook/android/Facebook$DialogListener; */
/* .prologue */
/* .line 114 */
int v0 = 0; // const/4 v0, 0x0
/* new-array v0, v0, [Ljava/lang/String; */
/* const/16 v1, 0x7f99 */
(( com.facebook.android.Facebook ) p0 ).authorize ( p1, v0, v1, p2 ); // invoke-virtual {p0, p1, v0, v1, p2}, Lcom/facebook/android/Facebook;->authorize(Landroid/app/Activity;[Ljava/lang/String;ILcom/facebook/android/Facebook$DialogListener;)V
/* .line 116 */
return;
} // .end method
public void authorize ( android.app.Activity p0, java.lang.String[] p1, Integer p2, com.facebook.android.Facebook$DialogListener p3 ) {
/* .locals 2 */
/* .param p1, "activity" # Landroid/app/Activity; */
/* .param p2, "permissions" # [Ljava/lang/String; */
/* .param p3, "activityCode" # I */
/* .param p4, "listener" # Lcom/facebook/android/Facebook$DialogListener; */
/* .prologue */
/* .line 195 */
int v0 = 0; // const/4 v0, 0x0
/* .line 197 */
/* .local v0, "singleSignOnStarted":Z */
this.mAuthDialogListener = p4;
/* .line 200 */
/* if-ltz p3, :cond_0 */
/* .line 201 */
v1 = this.mAppId;
v0 = /* invoke-direct {p0, p1, v1, p2, p3}, Lcom/facebook/android/Facebook;->startSingleSignOn(Landroid/app/Activity;Ljava/lang/String;[Ljava/lang/String;I)Z */
/* .line 205 */
} // :cond_0
/* if-nez v0, :cond_1 */
/* .line 206 */
/* invoke-direct {p0, p1, p2}, Lcom/facebook/android/Facebook;->startDialogAuth(Landroid/app/Activity;[Ljava/lang/String;)V */
/* .line 208 */
} // :cond_1
return;
} // .end method
public void authorize ( android.app.Activity p0, java.lang.String[] p1, com.facebook.android.Facebook$DialogListener p2 ) {
/* .locals 1 */
/* .param p1, "activity" # Landroid/app/Activity; */
/* .param p2, "permissions" # [Ljava/lang/String; */
/* .param p3, "listener" # Lcom/facebook/android/Facebook$DialogListener; */
/* .prologue */
/* .line 125 */
/* const/16 v0, 0x7f99 */
(( com.facebook.android.Facebook ) p0 ).authorize ( p1, p2, v0, p3 ); // invoke-virtual {p0, p1, p2, v0, p3}, Lcom/facebook/android/Facebook;->authorize(Landroid/app/Activity;[Ljava/lang/String;ILcom/facebook/android/Facebook$DialogListener;)V
/* .line 126 */
return;
} // .end method
public void authorizeCallback ( Integer p0, Integer p1, android.content.Intent p2 ) {
/* .locals 7 */
/* .param p1, "requestCode" # I */
/* .param p2, "resultCode" # I */
/* .param p3, "data" # Landroid/content/Intent; */
/* .prologue */
int v6 = -1; // const/4 v6, -0x1
/* .line 392 */
/* iget v2, p0, Lcom/facebook/android/Facebook;->mAuthActivityCode:I */
/* if-ne p1, v2, :cond_2 */
/* .line 395 */
/* if-ne p2, v6, :cond_9 */
/* .line 398 */
final String v2 = "error"; // const-string v2, "error"
(( android.content.Intent ) p3 ).getStringExtra ( v2 ); // invoke-virtual {p3, v2}, Landroid/content/Intent;->getStringExtra(Ljava/lang/String;)Ljava/lang/String;
/* .line 399 */
/* .local v1, "error":Ljava/lang/String; */
/* if-nez v1, :cond_0 */
/* .line 400 */
final String v2 = "error_type"; // const-string v2, "error_type"
(( android.content.Intent ) p3 ).getStringExtra ( v2 ); // invoke-virtual {p3, v2}, Landroid/content/Intent;->getStringExtra(Ljava/lang/String;)Ljava/lang/String;
/* .line 404 */
} // :cond_0
if ( v1 != null) { // if-eqz v1, :cond_7
/* .line 405 */
final String v2 = "service_disabled"; // const-string v2, "service_disabled"
v2 = (( java.lang.String ) v1 ).equals ( v2 ); // invoke-virtual {v1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
/* if-nez v2, :cond_1 */
/* .line 406 */
final String v2 = "AndroidAuthKillSwitchException"; // const-string v2, "AndroidAuthKillSwitchException"
v2 = (( java.lang.String ) v1 ).equals ( v2 ); // invoke-virtual {v1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
if ( v2 != null) { // if-eqz v2, :cond_3
/* .line 407 */
} // :cond_1
final String v2 = "Facebook-authorize"; // const-string v2, "Facebook-authorize"
final String v3 = "Hosted auth currently disabled.Retrying dialog auth..."; // const-string v3, "Hosted auth currently disabled.Retrying dialog auth..."
com.facebook.android.Util .logd ( v2,v3 );
/* .line 409 */
v2 = this.mAuthActivity;
v3 = this.mAuthPermissions;
/* invoke-direct {p0, v2, v3}, Lcom/facebook/android/Facebook;->startDialogAuth(Landroid/app/Activity;[Ljava/lang/String;)V */
/* .line 460 */
} // .end local v1 # "error":Ljava/lang/String;
} // :cond_2
} // :goto_0
return;
/* .line 410 */
/* .restart local v1 # "error":Ljava/lang/String; */
} // :cond_3
final String v2 = "access_denied"; // const-string v2, "access_denied"
v2 = (( java.lang.String ) v1 ).equals ( v2 ); // invoke-virtual {v1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
/* if-nez v2, :cond_4 */
/* .line 411 */
final String v2 = "OAuthAccessDeniedException"; // const-string v2, "OAuthAccessDeniedException"
v2 = (( java.lang.String ) v1 ).equals ( v2 ); // invoke-virtual {v1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
if ( v2 != null) { // if-eqz v2, :cond_5
/* .line 412 */
} // :cond_4
final String v2 = "Facebook-authorize"; // const-string v2, "Facebook-authorize"
final String v3 = "Login canceled by user."; // const-string v3, "Login canceled by user."
com.facebook.android.Util .logd ( v2,v3 );
/* .line 413 */
v2 = this.mAuthDialogListener;
/* .line 415 */
} // :cond_5
final String v2 = "error_description"; // const-string v2, "error_description"
(( android.content.Intent ) p3 ).getStringExtra ( v2 ); // invoke-virtual {p3, v2}, Landroid/content/Intent;->getStringExtra(Ljava/lang/String;)Ljava/lang/String;
/* .line 416 */
/* .local v0, "description":Ljava/lang/String; */
if ( v0 != null) { // if-eqz v0, :cond_6
/* .line 417 */
/* new-instance v2, Ljava/lang/StringBuilder; */
java.lang.String .valueOf ( v1 );
/* invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V */
final String v3 = ":"; // const-string v3, ":"
(( java.lang.StringBuilder ) v2 ).append ( v3 ); // invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v2 ).append ( v0 ); // invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v2 ).toString ( ); // invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
/* .line 419 */
} // :cond_6
final String v2 = "Facebook-authorize"; // const-string v2, "Facebook-authorize"
/* new-instance v3, Ljava/lang/StringBuilder; */
final String v4 = "Login failed: "; // const-string v4, "Login failed: "
/* invoke-direct {v3, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V */
(( java.lang.StringBuilder ) v3 ).append ( v1 ); // invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v3 ).toString ( ); // invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
com.facebook.android.Util .logd ( v2,v3 );
/* .line 420 */
v2 = this.mAuthDialogListener;
/* .line 421 */
/* new-instance v3, Lcom/facebook/android/FacebookError; */
/* invoke-direct {v3, v1}, Lcom/facebook/android/FacebookError;-><init>(Ljava/lang/String;)V */
/* .line 420 */
/* .line 426 */
} // .end local v0 # "description":Ljava/lang/String;
} // :cond_7
final String v2 = "access_token"; // const-string v2, "access_token"
(( android.content.Intent ) p3 ).getStringExtra ( v2 ); // invoke-virtual {p3, v2}, Landroid/content/Intent;->getStringExtra(Ljava/lang/String;)Ljava/lang/String;
(( com.facebook.android.Facebook ) p0 ).setAccessToken ( v2 ); // invoke-virtual {p0, v2}, Lcom/facebook/android/Facebook;->setAccessToken(Ljava/lang/String;)V
/* .line 427 */
final String v2 = "expires_in"; // const-string v2, "expires_in"
(( android.content.Intent ) p3 ).getStringExtra ( v2 ); // invoke-virtual {p3, v2}, Landroid/content/Intent;->getStringExtra(Ljava/lang/String;)Ljava/lang/String;
(( com.facebook.android.Facebook ) p0 ).setAccessExpiresIn ( v2 ); // invoke-virtual {p0, v2}, Lcom/facebook/android/Facebook;->setAccessExpiresIn(Ljava/lang/String;)V
/* .line 428 */
v2 = (( com.facebook.android.Facebook ) p0 ).isSessionValid ( ); // invoke-virtual {p0}, Lcom/facebook/android/Facebook;->isSessionValid()Z
if ( v2 != null) { // if-eqz v2, :cond_8
/* .line 429 */
final String v2 = "Facebook-authorize"; // const-string v2, "Facebook-authorize"
/* .line 430 */
/* new-instance v3, Ljava/lang/StringBuilder; */
final String v4 = "Login Success! access_token="; // const-string v4, "Login Success! access_token="
/* invoke-direct {v3, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V */
/* .line 431 */
(( com.facebook.android.Facebook ) p0 ).getAccessToken ( ); // invoke-virtual {p0}, Lcom/facebook/android/Facebook;->getAccessToken()Ljava/lang/String;
(( java.lang.StringBuilder ) v3 ).append ( v4 ); // invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
final String v4 = " expires="; // const-string v4, " expires="
(( java.lang.StringBuilder ) v3 ).append ( v4 ); // invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
/* .line 432 */
(( com.facebook.android.Facebook ) p0 ).getAccessExpires ( ); // invoke-virtual {p0}, Lcom/facebook/android/Facebook;->getAccessExpires()J
/* move-result-wide v4 */
(( java.lang.StringBuilder ) v3 ).append ( v4, v5 ); // invoke-virtual {v3, v4, v5}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;
/* .line 430 */
(( java.lang.StringBuilder ) v3 ).toString ( ); // invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
/* .line 429 */
com.facebook.android.Util .logd ( v2,v3 );
/* .line 433 */
v2 = this.mAuthDialogListener;
(( android.content.Intent ) p3 ).getExtras ( ); // invoke-virtual {p3}, Landroid/content/Intent;->getExtras()Landroid/os/Bundle;
/* goto/16 :goto_0 */
/* .line 435 */
} // :cond_8
v2 = this.mAuthDialogListener;
/* new-instance v3, Lcom/facebook/android/FacebookError; */
/* .line 436 */
final String v4 = "Failed to receive access token."; // const-string v4, "Failed to receive access token."
/* invoke-direct {v3, v4}, Lcom/facebook/android/FacebookError;-><init>(Ljava/lang/String;)V */
/* .line 435 */
/* goto/16 :goto_0 */
/* .line 441 */
} // .end local v1 # "error":Ljava/lang/String;
} // :cond_9
/* if-nez p2, :cond_2 */
/* .line 444 */
if ( p3 != null) { // if-eqz p3, :cond_a
/* .line 445 */
final String v2 = "Facebook-authorize"; // const-string v2, "Facebook-authorize"
/* .line 446 */
/* new-instance v3, Ljava/lang/StringBuilder; */
final String v4 = "Login failed: "; // const-string v4, "Login failed: "
/* invoke-direct {v3, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V */
final String v4 = "error"; // const-string v4, "error"
(( android.content.Intent ) p3 ).getStringExtra ( v4 ); // invoke-virtual {p3, v4}, Landroid/content/Intent;->getStringExtra(Ljava/lang/String;)Ljava/lang/String;
(( java.lang.StringBuilder ) v3 ).append ( v4 ); // invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v3 ).toString ( ); // invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
/* .line 445 */
com.facebook.android.Util .logd ( v2,v3 );
/* .line 447 */
v2 = this.mAuthDialogListener;
/* .line 448 */
/* new-instance v3, Lcom/facebook/android/DialogError; */
/* .line 449 */
final String v4 = "error"; // const-string v4, "error"
(( android.content.Intent ) p3 ).getStringExtra ( v4 ); // invoke-virtual {p3, v4}, Landroid/content/Intent;->getStringExtra(Ljava/lang/String;)Ljava/lang/String;
/* .line 450 */
final String v5 = "error_code"; // const-string v5, "error_code"
v5 = (( android.content.Intent ) p3 ).getIntExtra ( v5, v6 ); // invoke-virtual {p3, v5, v6}, Landroid/content/Intent;->getIntExtra(Ljava/lang/String;I)I
/* .line 451 */
final String v6 = "failing_url"; // const-string v6, "failing_url"
(( android.content.Intent ) p3 ).getStringExtra ( v6 ); // invoke-virtual {p3, v6}, Landroid/content/Intent;->getStringExtra(Ljava/lang/String;)Ljava/lang/String;
/* .line 448 */
/* invoke-direct {v3, v4, v5, v6}, Lcom/facebook/android/DialogError;-><init>(Ljava/lang/String;ILjava/lang/String;)V */
/* .line 447 */
/* goto/16 :goto_0 */
/* .line 455 */
} // :cond_a
final String v2 = "Facebook-authorize"; // const-string v2, "Facebook-authorize"
final String v3 = "Login canceled by user."; // const-string v3, "Login canceled by user."
com.facebook.android.Util .logd ( v2,v3 );
/* .line 456 */
v2 = this.mAuthDialogListener;
/* goto/16 :goto_0 */
} // .end method
public void dialog ( android.content.Context p0, java.lang.String p1, android.os.Bundle p2, com.facebook.android.Facebook$DialogListener p3 ) {
/* .locals 4 */
/* .param p1, "context" # Landroid/content/Context; */
/* .param p2, "action" # Ljava/lang/String; */
/* .param p3, "parameters" # Landroid/os/Bundle; */
/* .param p4, "listener" # Lcom/facebook/android/Facebook$DialogListener; */
/* .prologue */
/* .line 794 */
/* new-instance v2, Ljava/lang/StringBuilder; */
v3 = com.facebook.android.Facebook.DIALOG_BASE_URL;
java.lang.String .valueOf ( v3 );
/* invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V */
(( java.lang.StringBuilder ) v2 ).append ( p2 ); // invoke-virtual {v2, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v2 ).toString ( ); // invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
/* .line 795 */
/* .local v0, "endpoint":Ljava/lang/String; */
final String v2 = "display"; // const-string v2, "display"
final String v3 = "touch"; // const-string v3, "touch"
(( android.os.Bundle ) p3 ).putString ( v2, v3 ); // invoke-virtual {p3, v2, v3}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V
/* .line 796 */
final String v2 = "redirect_uri"; // const-string v2, "redirect_uri"
final String v3 = "fbconnect://success"; // const-string v3, "fbconnect://success"
(( android.os.Bundle ) p3 ).putString ( v2, v3 ); // invoke-virtual {p3, v2, v3}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V
/* .line 798 */
final String v2 = "oauth"; // const-string v2, "oauth"
v2 = (( java.lang.String ) p2 ).equals ( v2 ); // invoke-virtual {p2, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
if ( v2 != null) { // if-eqz v2, :cond_1
/* .line 799 */
final String v2 = "type"; // const-string v2, "type"
final String v3 = "user_agent"; // const-string v3, "user_agent"
(( android.os.Bundle ) p3 ).putString ( v2, v3 ); // invoke-virtual {p3, v2, v3}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V
/* .line 800 */
final String v2 = "client_id"; // const-string v2, "client_id"
v3 = this.mAppId;
(( android.os.Bundle ) p3 ).putString ( v2, v3 ); // invoke-virtual {p3, v2, v3}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V
/* .line 805 */
} // :goto_0
v2 = (( com.facebook.android.Facebook ) p0 ).isSessionValid ( ); // invoke-virtual {p0}, Lcom/facebook/android/Facebook;->isSessionValid()Z
if ( v2 != null) { // if-eqz v2, :cond_0
/* .line 806 */
final String v2 = "access_token"; // const-string v2, "access_token"
(( com.facebook.android.Facebook ) p0 ).getAccessToken ( ); // invoke-virtual {p0}, Lcom/facebook/android/Facebook;->getAccessToken()Ljava/lang/String;
(( android.os.Bundle ) p3 ).putString ( v2, v3 ); // invoke-virtual {p3, v2, v3}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V
/* .line 808 */
} // :cond_0
/* new-instance v2, Ljava/lang/StringBuilder; */
java.lang.String .valueOf ( v0 );
/* invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V */
final String v3 = "?"; // const-string v3, "?"
(( java.lang.StringBuilder ) v2 ).append ( v3 ); // invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
com.facebook.android.Util .encodeUrl ( p3 );
(( java.lang.StringBuilder ) v2 ).append ( v3 ); // invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v2 ).toString ( ); // invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
/* .line 809 */
/* .local v1, "url":Ljava/lang/String; */
final String v2 = "android.permission.INTERNET"; // const-string v2, "android.permission.INTERNET"
v2 = (( android.content.Context ) p1 ).checkCallingOrSelfPermission ( v2 ); // invoke-virtual {p1, v2}, Landroid/content/Context;->checkCallingOrSelfPermission(Ljava/lang/String;)I
if ( v2 != null) { // if-eqz v2, :cond_2
/* .line 811 */
final String v2 = "Error"; // const-string v2, "Error"
/* .line 812 */
final String v3 = "Application requires permission to access the Internet"; // const-string v3, "Application requires permission to access the Internet"
/* .line 811 */
com.facebook.android.Util .showAlert ( p1,v2,v3 );
/* .line 816 */
} // :goto_1
return;
/* .line 802 */
} // .end local v1 # "url":Ljava/lang/String;
} // :cond_1
final String v2 = "app_id"; // const-string v2, "app_id"
v3 = this.mAppId;
(( android.os.Bundle ) p3 ).putString ( v2, v3 ); // invoke-virtual {p3, v2, v3}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V
/* .line 814 */
/* .restart local v1 # "url":Ljava/lang/String; */
} // :cond_2
/* new-instance v2, Lcom/facebook/android/FbDialog; */
/* invoke-direct {v2, p1, v1, p4}, Lcom/facebook/android/FbDialog;-><init>(Landroid/content/Context;Ljava/lang/String;Lcom/facebook/android/Facebook$DialogListener;)V */
(( com.facebook.android.FbDialog ) v2 ).show ( ); // invoke-virtual {v2}, Lcom/facebook/android/FbDialog;->show()V
} // .end method
public void dialog ( android.content.Context p0, java.lang.String p1, com.facebook.android.Facebook$DialogListener p2 ) {
/* .locals 1 */
/* .param p1, "context" # Landroid/content/Context; */
/* .param p2, "action" # Ljava/lang/String; */
/* .param p3, "listener" # Lcom/facebook/android/Facebook$DialogListener; */
/* .prologue */
/* .line 771 */
/* new-instance v0, Landroid/os/Bundle; */
/* invoke-direct {v0}, Landroid/os/Bundle;-><init>()V */
(( com.facebook.android.Facebook ) p0 ).dialog ( p1, p2, v0, p3 ); // invoke-virtual {p0, p1, p2, v0, p3}, Lcom/facebook/android/Facebook;->dialog(Landroid/content/Context;Ljava/lang/String;Landroid/os/Bundle;Lcom/facebook/android/Facebook$DialogListener;)V
/* .line 772 */
return;
} // .end method
public Boolean extendAccessToken ( android.content.Context p0, com.facebook.android.Facebook$ServiceListener p1 ) {
/* .locals 3 */
/* .param p1, "context" # Landroid/content/Context; */
/* .param p2, "serviceListener" # Lcom/facebook/android/Facebook$ServiceListener; */
/* .prologue */
/* .line 482 */
/* new-instance v0, Landroid/content/Intent; */
/* invoke-direct {v0}, Landroid/content/Intent;-><init>()V */
/* .line 484 */
/* .local v0, "intent":Landroid/content/Intent; */
final String v1 = "com.facebook.katana"; // const-string v1, "com.facebook.katana"
/* .line 485 */
final String v2 = "com.facebook.katana.platform.TokenRefreshService"; // const-string v2, "com.facebook.katana.platform.TokenRefreshService"
/* .line 484 */
(( android.content.Intent ) v0 ).setClassName ( v1, v2 ); // invoke-virtual {v0, v1, v2}, Landroid/content/Intent;->setClassName(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;
/* .line 490 */
v1 = /* invoke-direct {p0, p1, v0}, Lcom/facebook/android/Facebook;->validateServiceIntent(Landroid/content/Context;Landroid/content/Intent;)Z */
/* if-nez v1, :cond_0 */
/* .line 491 */
int v1 = 0; // const/4 v1, 0x0
/* .line 494 */
} // :goto_0
/* .line 495 */
} // :cond_0
/* new-instance v1, Lcom/facebook/android/Facebook$TokenRefreshServiceConnection; */
/* invoke-direct {v1, p0, p1, p2}, Lcom/facebook/android/Facebook$TokenRefreshServiceConnection;-><init>(Lcom/facebook/android/Facebook;Landroid/content/Context;Lcom/facebook/android/Facebook$ServiceListener;)V */
/* .line 496 */
int v2 = 1; // const/4 v2, 0x1
/* .line 494 */
v1 = (( android.content.Context ) p1 ).bindService ( v0, v1, v2 ); // invoke-virtual {p1, v0, v1, v2}, Landroid/content/Context;->bindService(Landroid/content/Intent;Landroid/content/ServiceConnection;I)Z
} // .end method
public Boolean extendAccessTokenIfNeeded ( android.content.Context p0, com.facebook.android.Facebook$ServiceListener p1 ) {
/* .locals 1 */
/* .param p1, "context" # Landroid/content/Context; */
/* .param p2, "serviceListener" # Lcom/facebook/android/Facebook$ServiceListener; */
/* .prologue */
/* .line 506 */
v0 = (( com.facebook.android.Facebook ) p0 ).shouldExtendAccessToken ( ); // invoke-virtual {p0}, Lcom/facebook/android/Facebook;->shouldExtendAccessToken()Z
if ( v0 != null) { // if-eqz v0, :cond_0
/* .line 507 */
v0 = (( com.facebook.android.Facebook ) p0 ).extendAccessToken ( p1, p2 ); // invoke-virtual {p0, p1, p2}, Lcom/facebook/android/Facebook;->extendAccessToken(Landroid/content/Context;Lcom/facebook/android/Facebook$ServiceListener;)Z
/* .line 509 */
} // :goto_0
} // :cond_0
int v0 = 1; // const/4 v0, 0x1
} // .end method
public Long getAccessExpires ( ) {
/* .locals 2 */
/* .prologue */
/* .line 844 */
/* iget-wide v0, p0, Lcom/facebook/android/Facebook;->mAccessExpires:J */
/* return-wide v0 */
} // .end method
public java.lang.String getAccessToken ( ) {
/* .locals 1 */
/* .prologue */
/* .line 834 */
v0 = this.mAccessToken;
} // .end method
public java.lang.String getAppId ( ) {
/* .locals 1 */
/* .prologue */
/* .line 884 */
v0 = this.mAppId;
} // .end method
public Boolean isSessionValid ( ) {
/* .locals 4 */
/* .prologue */
/* .line 822 */
(( com.facebook.android.Facebook ) p0 ).getAccessToken ( ); // invoke-virtual {p0}, Lcom/facebook/android/Facebook;->getAccessToken()Ljava/lang/String;
if ( v0 != null) { // if-eqz v0, :cond_1
/* .line 823 */
(( com.facebook.android.Facebook ) p0 ).getAccessExpires ( ); // invoke-virtual {p0}, Lcom/facebook/android/Facebook;->getAccessExpires()J
/* move-result-wide v0 */
/* const-wide/16 v2, 0x0 */
/* cmp-long v0, v0, v2 */
if ( v0 != null) { // if-eqz v0, :cond_0
/* .line 824 */
java.lang.System .currentTimeMillis ( );
/* move-result-wide v0 */
(( com.facebook.android.Facebook ) p0 ).getAccessExpires ( ); // invoke-virtual {p0}, Lcom/facebook/android/Facebook;->getAccessExpires()J
/* move-result-wide v2 */
/* cmp-long v0, v0, v2 */
/* if-gez v0, :cond_1 */
} // :cond_0
int v0 = 1; // const/4 v0, 0x1
} // :goto_0
} // :cond_1
int v0 = 0; // const/4 v0, 0x0
/* .line 822 */
} // .end method
public java.lang.String logout ( android.content.Context p0 ) {
/* .locals 4 */
/* .param p1, "context" # Landroid/content/Context; */
/* .annotation system Ldalvik/annotation/Throws; */
/* value = { */
/* Ljava/net/MalformedURLException;, */
/* Ljava/io/IOException; */
/* } */
} // .end annotation
/* .prologue */
/* .line 623 */
com.facebook.android.Util .clearCookies ( p1 );
/* .line 624 */
/* new-instance v0, Landroid/os/Bundle; */
/* invoke-direct {v0}, Landroid/os/Bundle;-><init>()V */
/* .line 625 */
/* .local v0, "b":Landroid/os/Bundle; */
final String v2 = "method"; // const-string v2, "method"
final String v3 = "auth.expireSession"; // const-string v3, "auth.expireSession"
(( android.os.Bundle ) v0 ).putString ( v2, v3 ); // invoke-virtual {v0, v2, v3}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V
/* .line 626 */
(( com.facebook.android.Facebook ) p0 ).request ( v0 ); // invoke-virtual {p0, v0}, Lcom/facebook/android/Facebook;->request(Landroid/os/Bundle;)Ljava/lang/String;
/* .line 627 */
/* .local v1, "response":Ljava/lang/String; */
int v2 = 0; // const/4 v2, 0x0
(( com.facebook.android.Facebook ) p0 ).setAccessToken ( v2 ); // invoke-virtual {p0, v2}, Lcom/facebook/android/Facebook;->setAccessToken(Ljava/lang/String;)V
/* .line 628 */
/* const-wide/16 v2, 0x0 */
(( com.facebook.android.Facebook ) p0 ).setAccessExpires ( v2, v3 ); // invoke-virtual {p0, v2, v3}, Lcom/facebook/android/Facebook;->setAccessExpires(J)V
/* .line 629 */
} // .end method
public java.lang.String request ( android.os.Bundle p0 ) {
/* .locals 2 */
/* .param p1, "parameters" # Landroid/os/Bundle; */
/* .annotation system Ldalvik/annotation/Throws; */
/* value = { */
/* Ljava/net/MalformedURLException;, */
/* Ljava/io/IOException; */
/* } */
} // .end annotation
/* .prologue */
/* .line 662 */
final String v0 = "method"; // const-string v0, "method"
v0 = (( android.os.Bundle ) p1 ).containsKey ( v0 ); // invoke-virtual {p1, v0}, Landroid/os/Bundle;->containsKey(Ljava/lang/String;)Z
/* if-nez v0, :cond_0 */
/* .line 663 */
/* new-instance v0, Ljava/lang/IllegalArgumentException; */
final String v1 = "API method must be specified.(parameters must contain key \"method\" and value).See http://developers.facebook.com/docs/reference/rest/"; // const-string v1, "API method must be specified.(parameters must contain key \"method\" and value).See http://developers.facebook.com/docs/reference/rest/"
/* invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V */
/* throw v0 */
/* .line 667 */
} // :cond_0
int v0 = 0; // const/4 v0, 0x0
final String v1 = "GET"; // const-string v1, "GET"
(( com.facebook.android.Facebook ) p0 ).request ( v0, p1, v1 ); // invoke-virtual {p0, v0, p1, v1}, Lcom/facebook/android/Facebook;->request(Ljava/lang/String;Landroid/os/Bundle;Ljava/lang/String;)Ljava/lang/String;
} // .end method
public java.lang.String request ( java.lang.String p0 ) {
/* .locals 2 */
/* .param p1, "graphPath" # Ljava/lang/String; */
/* .annotation system Ldalvik/annotation/Throws; */
/* value = { */
/* Ljava/net/MalformedURLException;, */
/* Ljava/io/IOException; */
/* } */
} // .end annotation
/* .prologue */
/* .line 688 */
/* new-instance v0, Landroid/os/Bundle; */
/* invoke-direct {v0}, Landroid/os/Bundle;-><init>()V */
final String v1 = "GET"; // const-string v1, "GET"
(( com.facebook.android.Facebook ) p0 ).request ( p1, v0, v1 ); // invoke-virtual {p0, p1, v0, v1}, Lcom/facebook/android/Facebook;->request(Ljava/lang/String;Landroid/os/Bundle;Ljava/lang/String;)Ljava/lang/String;
} // .end method
public java.lang.String request ( java.lang.String p0, android.os.Bundle p1 ) {
/* .locals 1 */
/* .param p1, "graphPath" # Ljava/lang/String; */
/* .param p2, "parameters" # Landroid/os/Bundle; */
/* .annotation system Ldalvik/annotation/Throws; */
/* value = { */
/* Ljava/net/MalformedURLException;, */
/* Ljava/io/IOException; */
/* } */
} // .end annotation
/* .prologue */
/* .line 715 */
final String v0 = "GET"; // const-string v0, "GET"
(( com.facebook.android.Facebook ) p0 ).request ( p1, p2, v0 ); // invoke-virtual {p0, p1, p2, v0}, Lcom/facebook/android/Facebook;->request(Ljava/lang/String;Landroid/os/Bundle;Ljava/lang/String;)Ljava/lang/String;
} // .end method
public java.lang.String request ( java.lang.String p0, android.os.Bundle p1, java.lang.String p2 ) {
/* .locals 3 */
/* .param p1, "graphPath" # Ljava/lang/String; */
/* .param p2, "params" # Landroid/os/Bundle; */
/* .param p3, "httpMethod" # Ljava/lang/String; */
/* .annotation system Ldalvik/annotation/Throws; */
/* value = { */
/* Ljava/io/FileNotFoundException;, */
/* Ljava/net/MalformedURLException;, */
/* Ljava/io/IOException; */
/* } */
} // .end annotation
/* .prologue */
/* .line 745 */
final String v1 = "format"; // const-string v1, "format"
final String v2 = "json"; // const-string v2, "json"
(( android.os.Bundle ) p2 ).putString ( v1, v2 ); // invoke-virtual {p2, v1, v2}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V
/* .line 746 */
v1 = (( com.facebook.android.Facebook ) p0 ).isSessionValid ( ); // invoke-virtual {p0}, Lcom/facebook/android/Facebook;->isSessionValid()Z
if ( v1 != null) { // if-eqz v1, :cond_0
/* .line 747 */
final String v1 = "access_token"; // const-string v1, "access_token"
(( com.facebook.android.Facebook ) p0 ).getAccessToken ( ); // invoke-virtual {p0}, Lcom/facebook/android/Facebook;->getAccessToken()Ljava/lang/String;
(( android.os.Bundle ) p2 ).putString ( v1, v2 ); // invoke-virtual {p2, v1, v2}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V
/* .line 749 */
} // :cond_0
if ( p1 != null) { // if-eqz p1, :cond_1
/* new-instance v1, Ljava/lang/StringBuilder; */
v2 = com.facebook.android.Facebook.GRAPH_BASE_URL;
java.lang.String .valueOf ( v2 );
/* invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V */
(( java.lang.StringBuilder ) v1 ).append ( p1 ); // invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v1 ).toString ( ); // invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
/* .line 751 */
/* .local v0, "url":Ljava/lang/String; */
} // :goto_0
com.facebook.android.Util .openUrl ( v0,p3,p2 );
/* .line 750 */
} // .end local v0 # "url":Ljava/lang/String;
} // :cond_1
v0 = com.facebook.android.Facebook.RESTSERVER_URL;
} // .end method
public void setAccessExpires ( Long p0 ) {
/* .locals 0 */
/* .param p1, "time" # J */
/* .prologue */
/* .line 864 */
/* iput-wide p1, p0, Lcom/facebook/android/Facebook;->mAccessExpires:J */
/* .line 865 */
return;
} // .end method
public void setAccessExpiresIn ( java.lang.String p0 ) {
/* .locals 8 */
/* .param p1, "expiresIn" # Ljava/lang/String; */
/* .prologue */
/* .line 875 */
if ( p1 != null) { // if-eqz p1, :cond_0
/* .line 876 */
final String v2 = "0"; // const-string v2, "0"
v2 = (( java.lang.String ) p1 ).equals ( v2 ); // invoke-virtual {p1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
if ( v2 != null) { // if-eqz v2, :cond_1
/* .line 877 */
/* const-wide/16 v0, 0x0 */
/* .line 879 */
/* .local v0, "expires":J */
} // :goto_0
(( com.facebook.android.Facebook ) p0 ).setAccessExpires ( v0, v1 ); // invoke-virtual {p0, v0, v1}, Lcom/facebook/android/Facebook;->setAccessExpires(J)V
/* .line 881 */
} // .end local v0 # "expires":J
} // :cond_0
return;
/* .line 878 */
} // :cond_1
java.lang.System .currentTimeMillis ( );
/* move-result-wide v2 */
java.lang.Long .parseLong ( p1 );
/* move-result-wide v4 */
/* const-wide/16 v6, 0x3e8 */
/* mul-long/2addr v4, v6 */
/* add-long v0, v2, v4 */
} // .end method
public void setAccessToken ( java.lang.String p0 ) {
/* .locals 2 */
/* .param p1, "token" # Ljava/lang/String; */
/* .prologue */
/* .line 853 */
this.mAccessToken = p1;
/* .line 854 */
java.lang.System .currentTimeMillis ( );
/* move-result-wide v0 */
/* iput-wide v0, p0, Lcom/facebook/android/Facebook;->mLastAccessUpdate:J */
/* .line 855 */
return;
} // .end method
public void setAppId ( java.lang.String p0 ) {
/* .locals 0 */
/* .param p1, "appId" # Ljava/lang/String; */
/* .prologue */
/* .line 888 */
this.mAppId = p1;
/* .line 889 */
return;
} // .end method
public Boolean shouldExtendAccessToken ( ) {
/* .locals 4 */
/* .prologue */
/* .line 518 */
v0 = (( com.facebook.android.Facebook ) p0 ).isSessionValid ( ); // invoke-virtual {p0}, Lcom/facebook/android/Facebook;->isSessionValid()Z
if ( v0 != null) { // if-eqz v0, :cond_0
/* .line 519 */
java.lang.System .currentTimeMillis ( );
/* move-result-wide v0 */
/* iget-wide v2, p0, Lcom/facebook/android/Facebook;->mLastAccessUpdate:J */
/* sub-long/2addr v0, v2 */
/* const-wide/32 v2, 0x5265c00 */
/* cmp-long v0, v0, v2 */
/* if-ltz v0, :cond_0 */
int v0 = 1; // const/4 v0, 0x1
} // :goto_0
} // :cond_0
int v0 = 0; // const/4 v0, 0x0
/* .line 518 */
} // .end method
