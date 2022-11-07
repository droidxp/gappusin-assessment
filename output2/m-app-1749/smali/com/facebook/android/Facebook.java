public class com.facebook.android.Facebook {
	 /* .source "Facebook.java" */
	 /* # annotations */
	 /* .annotation system Ldalvik/annotation/MemberClasses; */
	 /* value = { */
	 /* Lcom/facebook/android/Facebook$DialogListener; */
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
private Long mAccessExpires;
private java.lang.String mAccessToken;
private java.lang.String mAppId;
private android.app.Activity mAuthActivity;
private Integer mAuthActivityCode;
private com.facebook.android.Facebook$DialogListener mAuthDialogListener;
private java.lang.String mAuthPermissions;
/* # direct methods */
static com.facebook.android.Facebook ( ) {
	 /* .locals 1 */
	 /* .prologue */
	 /* .line 65 */
	 final String v0 = "https://m.facebook.com/dialog/"; // const-string v0, "https://m.facebook.com/dialog/"
	 /* .line 67 */
	 final String v0 = "https://graph.facebook.com/"; // const-string v0, "https://graph.facebook.com/"
	 /* .line 69 */
	 final String v0 = "https://api.facebook.com/restserver.php"; // const-string v0, "https://api.facebook.com/restserver.php"
	 return;
} // .end method
public com.facebook.android.Facebook ( ) {
	 /* .locals 2 */
	 /* .param p1, "appId" # Ljava/lang/String; */
	 /* .prologue */
	 /* .line 88 */
	 /* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
	 /* .line 72 */
	 int v0 = 0; // const/4 v0, 0x0
	 this.mAccessToken = v0;
	 /* .line 73 */
	 /* const-wide/16 v0, 0x0 */
	 /* iput-wide v0, p0, Lcom/facebook/android/Facebook;->mAccessExpires:J */
	 /* .line 89 */
	 /* if-nez p1, :cond_0 */
	 /* .line 90 */
	 /* new-instance v0, Ljava/lang/IllegalArgumentException; */
	 final String v1 = "You must specify your application ID when instantiating a Facebook object.See README for details."; // const-string v1, "You must specify your application ID when instantiating a Facebook object.See README for details."
	 /* invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V */
	 /* throw v0 */
	 /* .line 94 */
} // :cond_0
this.mAppId = p1;
/* .line 95 */
return;
} // .end method
static com.facebook.android.Facebook$DialogListener access$000 ( com.facebook.android.Facebook p0 ) { //synthethic
/* .locals 1 */
/* .param p0, "x0" # Lcom/facebook/android/Facebook; */
/* .prologue */
/* .line 48 */
v0 = this.mAuthDialogListener;
} // .end method
private void startDialogAuth ( android.app.Activity p0, java.lang.String[] p1 ) {
/* .locals 3 */
/* .param p1, "activity" # Landroid/app/Activity; */
/* .param p2, "permissions" # [Ljava/lang/String; */
/* .prologue */
/* .line 292 */
/* new-instance v0, Landroid/os/Bundle; */
/* invoke-direct {v0}, Landroid/os/Bundle;-><init>()V */
/* .line 293 */
/* .local v0, "params":Landroid/os/Bundle; */
/* array-length v1, p2 */
/* if-lez v1, :cond_0 */
/* .line 294 */
final String v1 = "scope"; // const-string v1, "scope"
final String v2 = ","; // const-string v2, ","
android.text.TextUtils .join ( v2,p2 );
(( android.os.Bundle ) v0 ).putString ( v1, v2 ); // invoke-virtual {v0, v1, v2}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V
/* .line 296 */
} // :cond_0
android.webkit.CookieSyncManager .createInstance ( p1 );
/* .line 297 */
final String v1 = "oauth"; // const-string v1, "oauth"
/* new-instance v2, Lcom/facebook/android/Facebook$1; */
/* invoke-direct {v2, p0}, Lcom/facebook/android/Facebook$1;-><init>(Lcom/facebook/android/Facebook;)V */
(( com.facebook.android.Facebook ) p0 ).dialog ( p1, v1, v0, v2 ); // invoke-virtual {p0, p1, v1, v0, v2}, Lcom/facebook/android/Facebook;->dialog(Landroid/content/Context;Ljava/lang/String;Landroid/os/Bundle;Lcom/facebook/android/Facebook$DialogListener;)V
/* .line 330 */
return;
} // .end method
private Boolean startSingleSignOn ( android.app.Activity p0, java.lang.String p1, java.lang.String[] p2, Integer p3 ) {
/* .locals 5 */
/* .param p1, "activity" # Landroid/app/Activity; */
/* .param p2, "applicationId" # Ljava/lang/String; */
/* .param p3, "permissions" # [Ljava/lang/String; */
/* .param p4, "activityCode" # I */
/* .prologue */
/* .line 215 */
int v0 = 1; // const/4 v0, 0x1
/* .line 216 */
/* .local v0, "didSucceed":Z */
/* new-instance v2, Landroid/content/Intent; */
/* invoke-direct {v2}, Landroid/content/Intent;-><init>()V */
/* .line 218 */
/* .local v2, "intent":Landroid/content/Intent; */
final String v3 = "com.facebook.katana"; // const-string v3, "com.facebook.katana"
final String v4 = "com.facebook.katana.ProxyAuth"; // const-string v4, "com.facebook.katana.ProxyAuth"
(( android.content.Intent ) v2 ).setClassName ( v3, v4 ); // invoke-virtual {v2, v3, v4}, Landroid/content/Intent;->setClassName(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;
/* .line 220 */
final String v3 = "client_id"; // const-string v3, "client_id"
(( android.content.Intent ) v2 ).putExtra ( v3, p2 ); // invoke-virtual {v2, v3, p2}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;
/* .line 221 */
/* array-length v3, p3 */
/* if-lez v3, :cond_0 */
/* .line 222 */
final String v3 = "scope"; // const-string v3, "scope"
final String v4 = ","; // const-string v4, ","
android.text.TextUtils .join ( v4,p3 );
(( android.content.Intent ) v2 ).putExtra ( v3, v4 ); // invoke-virtual {v2, v3, v4}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;
/* .line 228 */
} // :cond_0
v3 = /* invoke-direct {p0, p1, v2}, Lcom/facebook/android/Facebook;->validateAppSignatureForIntent(Landroid/app/Activity;Landroid/content/Intent;)Z */
/* if-nez v3, :cond_1 */
/* .line 229 */
int v3 = 0; // const/4 v3, 0x0
/* .line 241 */
} // :goto_0
/* .line 232 */
} // :cond_1
this.mAuthActivity = p1;
/* .line 233 */
this.mAuthPermissions = p3;
/* .line 234 */
/* iput p4, p0, Lcom/facebook/android/Facebook;->mAuthActivityCode:I */
/* .line 236 */
try { // :try_start_0
(( android.app.Activity ) p1 ).startActivityForResult ( v2, p4 ); // invoke-virtual {p1, v2, p4}, Landroid/app/Activity;->startActivityForResult(Landroid/content/Intent;I)V
/* :try_end_0 */
/* .catch Landroid/content/ActivityNotFoundException; {:try_start_0 ..:try_end_0} :catch_0 */
} // :goto_1
/* move v3, v0 */
/* .line 241 */
/* .line 237 */
/* :catch_0 */
/* move-exception v1 */
/* .line 238 */
/* .local v1, "e":Landroid/content/ActivityNotFoundException; */
int v0 = 0; // const/4 v0, 0x0
} // .end method
private Boolean validateAppSignatureForIntent ( android.app.Activity p0, android.content.Intent p1 ) {
/* .locals 11 */
/* .param p1, "activity" # Landroid/app/Activity; */
/* .param p2, "intent" # Landroid/content/Intent; */
/* .prologue */
int v8 = 0; // const/4 v8, 0x0
/* .line 256 */
(( android.app.Activity ) p1 ).getPackageManager ( ); // invoke-virtual {p1}, Landroid/app/Activity;->getPackageManager()Landroid/content/pm/PackageManager;
(( android.content.pm.PackageManager ) v9 ).resolveActivity ( p2, v8 ); // invoke-virtual {v9, p2, v8}, Landroid/content/pm/PackageManager;->resolveActivity(Landroid/content/Intent;I)Landroid/content/pm/ResolveInfo;
/* .line 258 */
/* .local v6, "resolveInfo":Landroid/content/pm/ResolveInfo; */
/* if-nez v6, :cond_1 */
/* .line 276 */
} // :cond_0
} // :goto_0
/* .line 262 */
} // :cond_1
v9 = this.activityInfo;
v5 = this.packageName;
/* .line 265 */
/* .local v5, "packageName":Ljava/lang/String; */
try { // :try_start_0
(( android.app.Activity ) p1 ).getPackageManager ( ); // invoke-virtual {p1}, Landroid/app/Activity;->getPackageManager()Landroid/content/pm/PackageManager;
/* const/16 v10, 0x40 */
(( android.content.pm.PackageManager ) v9 ).getPackageInfo ( v5, v10 ); // invoke-virtual {v9, v5, v10}, Landroid/content/pm/PackageManager;->getPackageInfo(Ljava/lang/String;I)Landroid/content/pm/PackageInfo;
/* :try_end_0 */
/* .catch Landroid/content/pm/PackageManager$NameNotFoundException; {:try_start_0 ..:try_end_0} :catch_0 */
/* .line 271 */
/* .local v4, "packageInfo":Landroid/content/pm/PackageInfo; */
v0 = this.signatures;
/* .local v0, "arr$":[Landroid/content/pm/Signature; */
/* array-length v3, v0 */
/* .local v3, "len$":I */
int v2 = 0; // const/4 v2, 0x0
/* .local v2, "i$":I */
} // :goto_1
/* if-ge v2, v3, :cond_0 */
/* aget-object v7, v0, v2 */
/* .line 272 */
/* .local v7, "signature":Landroid/content/pm/Signature; */
(( android.content.pm.Signature ) v7 ).toCharsString ( ); // invoke-virtual {v7}, Landroid/content/pm/Signature;->toCharsString()Ljava/lang/String;
final String v10 = "30820268308201d102044a9c4610300d06092a864886f70d0101040500307a310b3009060355040613025553310b3009060355040813024341311230100603550407130950616c6f20416c746f31183016060355040a130f46616365626f6f6b204d6f62696c653111300f060355040b130846616365626f6f6b311d301b0603550403131446616365626f6f6b20436f72706f726174696f6e3020170d3039303833313231353231365a180f32303530303932353231353231365a307a310b3009060355040613025553310b3009060355040813024341311230100603550407130950616c6f20416c746f31183016060355040a130f46616365626f6f6b204d6f62696c653111300f060355040b130846616365626f6f6b311d301b0603550403131446616365626f6f6b20436f72706f726174696f6e30819f300d06092a864886f70d010101050003818d0030818902818100c207d51df8eb8c97d93ba0c8c1002c928fab00dc1b42fca5e66e99cc3023ed2d214d822bc59e8e35ddcf5f44c7ae8ade50d7e0c434f500e6c131f4a2834f987fc46406115de2018ebbb0d5a3c261bd97581ccfef76afc7135a6d59e8855ecd7eacc8f8737e794c60a761c536b72b11fac8e603f5da1a2d54aa103b8a13c0dbc10203010001300d06092a864886f70d0101040500038181005ee9be8bcbb250648d3b741290a82a1c9dc2e76a0af2f2228f1d9f9c4007529c446a70175c5a900d5141812866db46be6559e2141616483998211f4a673149fb2232a10d247663b26a9031e15f84bc1c74d141ff98a02d76f85b2c8ab2571b6469b232d8e768a7f7ca04f7abe4a775615916c07940656b58717457b42bd928a2"; // const-string v10, "30820268308201d102044a9c4610300d06092a864886f70d0101040500307a310b3009060355040613025553310b3009060355040813024341311230100603550407130950616c6f20416c746f31183016060355040a130f46616365626f6f6b204d6f62696c653111300f060355040b130846616365626f6f6b311d301b0603550403131446616365626f6f6b20436f72706f726174696f6e3020170d3039303833313231353231365a180f32303530303932353231353231365a307a310b3009060355040613025553310b3009060355040813024341311230100603550407130950616c6f20416c746f31183016060355040a130f46616365626f6f6b204d6f62696c653111300f060355040b130846616365626f6f6b311d301b0603550403131446616365626f6f6b20436f72706f726174696f6e30819f300d06092a864886f70d010101050003818d0030818902818100c207d51df8eb8c97d93ba0c8c1002c928fab00dc1b42fca5e66e99cc3023ed2d214d822bc59e8e35ddcf5f44c7ae8ade50d7e0c434f500e6c131f4a2834f987fc46406115de2018ebbb0d5a3c261bd97581ccfef76afc7135a6d59e8855ecd7eacc8f8737e794c60a761c536b72b11fac8e603f5da1a2d54aa103b8a13c0dbc10203010001300d06092a864886f70d0101040500038181005ee9be8bcbb250648d3b741290a82a1c9dc2e76a0af2f2228f1d9f9c4007529c446a70175c5a900d5141812866db46be6559e2141616483998211f4a673149fb2232a10d247663b26a9031e15f84bc1c74d141ff98a02d76f85b2c8ab2571b6469b232d8e768a7f7ca04f7abe4a775615916c07940656b58717457b42bd928a2"
v9 = (( java.lang.String ) v9 ).equals ( v10 ); // invoke-virtual {v9, v10}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
if ( v9 != null) { // if-eqz v9, :cond_2
/* .line 273 */
int v8 = 1; // const/4 v8, 0x1
/* .line 267 */
} // .end local v0 # "arr$":[Landroid/content/pm/Signature;
} // .end local v2 # "i$":I
} // .end local v3 # "len$":I
} // .end local v4 # "packageInfo":Landroid/content/pm/PackageInfo;
} // .end local v7 # "signature":Landroid/content/pm/Signature;
/* :catch_0 */
/* move-exception v1 */
/* .line 268 */
/* .local v1, "e":Landroid/content/pm/PackageManager$NameNotFoundException; */
/* .line 271 */
} // .end local v1 # "e":Landroid/content/pm/PackageManager$NameNotFoundException;
/* .restart local v0 # "arr$":[Landroid/content/pm/Signature; */
/* .restart local v2 # "i$":I */
/* .restart local v3 # "len$":I */
/* .restart local v4 # "packageInfo":Landroid/content/pm/PackageInfo; */
/* .restart local v7 # "signature":Landroid/content/pm/Signature; */
} // :cond_2
/* add-int/lit8 v2, v2, 0x1 */
} // .end method
/* # virtual methods */
public void authorize ( android.app.Activity p0, com.facebook.android.Facebook$DialogListener p1 ) {
/* .locals 2 */
/* .param p1, "activity" # Landroid/app/Activity; */
/* .param p2, "listener" # Lcom/facebook/android/Facebook$DialogListener; */
/* .prologue */
/* .line 103 */
int v0 = 0; // const/4 v0, 0x0
/* new-array v0, v0, [Ljava/lang/String; */
/* const/16 v1, 0x7f99 */
(( com.facebook.android.Facebook ) p0 ).authorize ( p1, v0, v1, p2 ); // invoke-virtual {p0, p1, v0, v1, p2}, Lcom/facebook/android/Facebook;->authorize(Landroid/app/Activity;[Ljava/lang/String;ILcom/facebook/android/Facebook$DialogListener;)V
/* .line 105 */
return;
} // .end method
public void authorize ( android.app.Activity p0, java.lang.String[] p1, Integer p2, com.facebook.android.Facebook$DialogListener p3 ) {
/* .locals 2 */
/* .param p1, "activity" # Landroid/app/Activity; */
/* .param p2, "permissions" # [Ljava/lang/String; */
/* .param p3, "activityCode" # I */
/* .param p4, "listener" # Lcom/facebook/android/Facebook$DialogListener; */
/* .prologue */
/* .line 184 */
int v0 = 0; // const/4 v0, 0x0
/* .line 186 */
/* .local v0, "singleSignOnStarted":Z */
this.mAuthDialogListener = p4;
/* .line 189 */
/* if-ltz p3, :cond_0 */
/* .line 190 */
v1 = this.mAppId;
v0 = /* invoke-direct {p0, p1, v1, p2, p3}, Lcom/facebook/android/Facebook;->startSingleSignOn(Landroid/app/Activity;Ljava/lang/String;[Ljava/lang/String;I)Z */
/* .line 194 */
} // :cond_0
/* if-nez v0, :cond_1 */
/* .line 195 */
/* invoke-direct {p0, p1, p2}, Lcom/facebook/android/Facebook;->startDialogAuth(Landroid/app/Activity;[Ljava/lang/String;)V */
/* .line 197 */
} // :cond_1
return;
} // .end method
public void authorize ( android.app.Activity p0, java.lang.String[] p1, com.facebook.android.Facebook$DialogListener p2 ) {
/* .locals 1 */
/* .param p1, "activity" # Landroid/app/Activity; */
/* .param p2, "permissions" # [Ljava/lang/String; */
/* .param p3, "listener" # Lcom/facebook/android/Facebook$DialogListener; */
/* .prologue */
/* .line 114 */
/* const/16 v0, 0x7f99 */
(( com.facebook.android.Facebook ) p0 ).authorize ( p1, p2, v0, p3 ); // invoke-virtual {p0, p1, p2, v0, p3}, Lcom/facebook/android/Facebook;->authorize(Landroid/app/Activity;[Ljava/lang/String;ILcom/facebook/android/Facebook$DialogListener;)V
/* .line 115 */
return;
} // .end method
public void authorizeCallback ( Integer p0, Integer p1, android.content.Intent p2 ) {
/* .locals 7 */
/* .param p1, "requestCode" # I */
/* .param p2, "resultCode" # I */
/* .param p3, "data" # Landroid/content/Intent; */
/* .prologue */
int v6 = -1; // const/4 v6, -0x1
/* .line 346 */
/* iget v2, p0, Lcom/facebook/android/Facebook;->mAuthActivityCode:I */
/* if-ne p1, v2, :cond_2 */
/* .line 349 */
/* if-ne p2, v6, :cond_9 */
/* .line 352 */
final String v2 = "error"; // const-string v2, "error"
(( android.content.Intent ) p3 ).getStringExtra ( v2 ); // invoke-virtual {p3, v2}, Landroid/content/Intent;->getStringExtra(Ljava/lang/String;)Ljava/lang/String;
/* .line 353 */
/* .local v1, "error":Ljava/lang/String; */
/* if-nez v1, :cond_0 */
/* .line 354 */
final String v2 = "error_type"; // const-string v2, "error_type"
(( android.content.Intent ) p3 ).getStringExtra ( v2 ); // invoke-virtual {p3, v2}, Landroid/content/Intent;->getStringExtra(Ljava/lang/String;)Ljava/lang/String;
/* .line 358 */
} // :cond_0
if ( v1 != null) { // if-eqz v1, :cond_7
/* .line 359 */
final String v2 = "service_disabled"; // const-string v2, "service_disabled"
v2 = (( java.lang.String ) v1 ).equals ( v2 ); // invoke-virtual {v1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
/* if-nez v2, :cond_1 */
final String v2 = "AndroidAuthKillSwitchException"; // const-string v2, "AndroidAuthKillSwitchException"
v2 = (( java.lang.String ) v1 ).equals ( v2 ); // invoke-virtual {v1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
if ( v2 != null) { // if-eqz v2, :cond_3
/* .line 361 */
} // :cond_1
final String v2 = "Facebook-authorize"; // const-string v2, "Facebook-authorize"
final String v3 = "Hosted auth currently disabled.Retrying dialog auth..."; // const-string v3, "Hosted auth currently disabled.Retrying dialog auth..."
android.util.Log .d ( v2,v3 );
/* .line 363 */
v2 = this.mAuthActivity;
v3 = this.mAuthPermissions;
/* invoke-direct {p0, v2, v3}, Lcom/facebook/android/Facebook;->startDialogAuth(Landroid/app/Activity;[Ljava/lang/String;)V */
/* .line 414 */
} // .end local v1 # "error":Ljava/lang/String;
} // :cond_2
} // :goto_0
return;
/* .line 364 */
/* .restart local v1 # "error":Ljava/lang/String; */
} // :cond_3
final String v2 = "access_denied"; // const-string v2, "access_denied"
v2 = (( java.lang.String ) v1 ).equals ( v2 ); // invoke-virtual {v1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
/* if-nez v2, :cond_4 */
final String v2 = "OAuthAccessDeniedException"; // const-string v2, "OAuthAccessDeniedException"
v2 = (( java.lang.String ) v1 ).equals ( v2 ); // invoke-virtual {v1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
if ( v2 != null) { // if-eqz v2, :cond_5
/* .line 366 */
} // :cond_4
final String v2 = "Facebook-authorize"; // const-string v2, "Facebook-authorize"
final String v3 = "Login canceled by user."; // const-string v3, "Login canceled by user."
android.util.Log .d ( v2,v3 );
/* .line 367 */
v2 = this.mAuthDialogListener;
/* .line 369 */
} // :cond_5
final String v2 = "error_description"; // const-string v2, "error_description"
(( android.content.Intent ) p3 ).getStringExtra ( v2 ); // invoke-virtual {p3, v2}, Landroid/content/Intent;->getStringExtra(Ljava/lang/String;)Ljava/lang/String;
/* .line 370 */
/* .local v0, "description":Ljava/lang/String; */
if ( v0 != null) { // if-eqz v0, :cond_6
/* .line 371 */
/* new-instance v2, Ljava/lang/StringBuilder; */
/* invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V */
(( java.lang.StringBuilder ) v2 ).append ( v1 ); // invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
final String v3 = ":"; // const-string v3, ":"
(( java.lang.StringBuilder ) v2 ).append ( v3 ); // invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v2 ).append ( v0 ); // invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v2 ).toString ( ); // invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
/* .line 373 */
} // :cond_6
final String v2 = "Facebook-authorize"; // const-string v2, "Facebook-authorize"
/* new-instance v3, Ljava/lang/StringBuilder; */
/* invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V */
final String v4 = "Login failed: "; // const-string v4, "Login failed: "
(( java.lang.StringBuilder ) v3 ).append ( v4 ); // invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v3 ).append ( v1 ); // invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v3 ).toString ( ); // invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
android.util.Log .d ( v2,v3 );
/* .line 374 */
v2 = this.mAuthDialogListener;
/* new-instance v3, Lcom/facebook/android/FacebookError; */
/* invoke-direct {v3, v1}, Lcom/facebook/android/FacebookError;-><init>(Ljava/lang/String;)V */
/* .line 380 */
} // .end local v0 # "description":Ljava/lang/String;
} // :cond_7
final String v2 = "access_token"; // const-string v2, "access_token"
(( android.content.Intent ) p3 ).getStringExtra ( v2 ); // invoke-virtual {p3, v2}, Landroid/content/Intent;->getStringExtra(Ljava/lang/String;)Ljava/lang/String;
(( com.facebook.android.Facebook ) p0 ).setAccessToken ( v2 ); // invoke-virtual {p0, v2}, Lcom/facebook/android/Facebook;->setAccessToken(Ljava/lang/String;)V
/* .line 381 */
final String v2 = "expires_in"; // const-string v2, "expires_in"
(( android.content.Intent ) p3 ).getStringExtra ( v2 ); // invoke-virtual {p3, v2}, Landroid/content/Intent;->getStringExtra(Ljava/lang/String;)Ljava/lang/String;
(( com.facebook.android.Facebook ) p0 ).setAccessExpiresIn ( v2 ); // invoke-virtual {p0, v2}, Lcom/facebook/android/Facebook;->setAccessExpiresIn(Ljava/lang/String;)V
/* .line 382 */
v2 = (( com.facebook.android.Facebook ) p0 ).isSessionValid ( ); // invoke-virtual {p0}, Lcom/facebook/android/Facebook;->isSessionValid()Z
if ( v2 != null) { // if-eqz v2, :cond_8
/* .line 383 */
final String v2 = "Facebook-authorize"; // const-string v2, "Facebook-authorize"
/* new-instance v3, Ljava/lang/StringBuilder; */
/* invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V */
final String v4 = "Login Success! access_token="; // const-string v4, "Login Success! access_token="
(( java.lang.StringBuilder ) v3 ).append ( v4 ); // invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( com.facebook.android.Facebook ) p0 ).getAccessToken ( ); // invoke-virtual {p0}, Lcom/facebook/android/Facebook;->getAccessToken()Ljava/lang/String;
(( java.lang.StringBuilder ) v3 ).append ( v4 ); // invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
final String v4 = " expires="; // const-string v4, " expires="
(( java.lang.StringBuilder ) v3 ).append ( v4 ); // invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( com.facebook.android.Facebook ) p0 ).getAccessExpires ( ); // invoke-virtual {p0}, Lcom/facebook/android/Facebook;->getAccessExpires()J
/* move-result-wide v4 */
(( java.lang.StringBuilder ) v3 ).append ( v4, v5 ); // invoke-virtual {v3, v4, v5}, Ljava/lang/StringBuilder;->append(J)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v3 ).toString ( ); // invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
android.util.Log .d ( v2,v3 );
/* .line 387 */
v2 = this.mAuthDialogListener;
(( android.content.Intent ) p3 ).getExtras ( ); // invoke-virtual {p3}, Landroid/content/Intent;->getExtras()Landroid/os/Bundle;
/* goto/16 :goto_0 */
/* .line 389 */
} // :cond_8
v2 = this.mAuthDialogListener;
/* new-instance v3, Lcom/facebook/android/FacebookError; */
final String v4 = "Failed to receive access token."; // const-string v4, "Failed to receive access token."
/* invoke-direct {v3, v4}, Lcom/facebook/android/FacebookError;-><init>(Ljava/lang/String;)V */
/* goto/16 :goto_0 */
/* .line 395 */
} // .end local v1 # "error":Ljava/lang/String;
} // :cond_9
/* if-nez p2, :cond_2 */
/* .line 398 */
if ( p3 != null) { // if-eqz p3, :cond_a
/* .line 399 */
final String v2 = "Facebook-authorize"; // const-string v2, "Facebook-authorize"
/* new-instance v3, Ljava/lang/StringBuilder; */
/* invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V */
final String v4 = "Login failed: "; // const-string v4, "Login failed: "
(( java.lang.StringBuilder ) v3 ).append ( v4 ); // invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
final String v4 = "error"; // const-string v4, "error"
(( android.content.Intent ) p3 ).getStringExtra ( v4 ); // invoke-virtual {p3, v4}, Landroid/content/Intent;->getStringExtra(Ljava/lang/String;)Ljava/lang/String;
(( java.lang.StringBuilder ) v3 ).append ( v4 ); // invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v3 ).toString ( ); // invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
android.util.Log .d ( v2,v3 );
/* .line 401 */
v2 = this.mAuthDialogListener;
/* new-instance v3, Lcom/facebook/android/DialogError; */
final String v4 = "error"; // const-string v4, "error"
(( android.content.Intent ) p3 ).getStringExtra ( v4 ); // invoke-virtual {p3, v4}, Landroid/content/Intent;->getStringExtra(Ljava/lang/String;)Ljava/lang/String;
final String v5 = "error_code"; // const-string v5, "error_code"
v5 = (( android.content.Intent ) p3 ).getIntExtra ( v5, v6 ); // invoke-virtual {p3, v5, v6}, Landroid/content/Intent;->getIntExtra(Ljava/lang/String;I)I
final String v6 = "failing_url"; // const-string v6, "failing_url"
(( android.content.Intent ) p3 ).getStringExtra ( v6 ); // invoke-virtual {p3, v6}, Landroid/content/Intent;->getStringExtra(Ljava/lang/String;)Ljava/lang/String;
/* invoke-direct {v3, v4, v5, v6}, Lcom/facebook/android/DialogError;-><init>(Ljava/lang/String;ILjava/lang/String;)V */
/* goto/16 :goto_0 */
/* .line 409 */
} // :cond_a
final String v2 = "Facebook-authorize"; // const-string v2, "Facebook-authorize"
final String v3 = "Login canceled by user."; // const-string v3, "Login canceled by user."
android.util.Log .d ( v2,v3 );
/* .line 410 */
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
/* .line 606 */
/* new-instance v2, Ljava/lang/StringBuilder; */
/* invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V */
v3 = com.facebook.android.Facebook.DIALOG_BASE_URL;
(( java.lang.StringBuilder ) v2 ).append ( v3 ); // invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v2 ).append ( p2 ); // invoke-virtual {v2, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v2 ).toString ( ); // invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
/* .line 607 */
/* .local v0, "endpoint":Ljava/lang/String; */
final String v2 = "display"; // const-string v2, "display"
final String v3 = "touch"; // const-string v3, "touch"
(( android.os.Bundle ) p3 ).putString ( v2, v3 ); // invoke-virtual {p3, v2, v3}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V
/* .line 608 */
final String v2 = "redirect_uri"; // const-string v2, "redirect_uri"
final String v3 = "fbconnect://success"; // const-string v3, "fbconnect://success"
(( android.os.Bundle ) p3 ).putString ( v2, v3 ); // invoke-virtual {p3, v2, v3}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V
/* .line 610 */
final String v2 = "oauth"; // const-string v2, "oauth"
v2 = (( java.lang.String ) p2 ).equals ( v2 ); // invoke-virtual {p2, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
if ( v2 != null) { // if-eqz v2, :cond_1
/* .line 611 */
final String v2 = "type"; // const-string v2, "type"
final String v3 = "user_agent"; // const-string v3, "user_agent"
(( android.os.Bundle ) p3 ).putString ( v2, v3 ); // invoke-virtual {p3, v2, v3}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V
/* .line 612 */
final String v2 = "client_id"; // const-string v2, "client_id"
v3 = this.mAppId;
(( android.os.Bundle ) p3 ).putString ( v2, v3 ); // invoke-virtual {p3, v2, v3}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V
/* .line 617 */
} // :goto_0
v2 = (( com.facebook.android.Facebook ) p0 ).isSessionValid ( ); // invoke-virtual {p0}, Lcom/facebook/android/Facebook;->isSessionValid()Z
if ( v2 != null) { // if-eqz v2, :cond_0
/* .line 618 */
final String v2 = "access_token"; // const-string v2, "access_token"
(( com.facebook.android.Facebook ) p0 ).getAccessToken ( ); // invoke-virtual {p0}, Lcom/facebook/android/Facebook;->getAccessToken()Ljava/lang/String;
(( android.os.Bundle ) p3 ).putString ( v2, v3 ); // invoke-virtual {p3, v2, v3}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V
/* .line 620 */
} // :cond_0
/* new-instance v2, Ljava/lang/StringBuilder; */
/* invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V */
(( java.lang.StringBuilder ) v2 ).append ( v0 ); // invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
final String v3 = "?"; // const-string v3, "?"
(( java.lang.StringBuilder ) v2 ).append ( v3 ); // invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
com.facebook.android.Util .encodeUrl ( p3 );
(( java.lang.StringBuilder ) v2 ).append ( v3 ); // invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v2 ).toString ( ); // invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
/* .line 621 */
/* .local v1, "url":Ljava/lang/String; */
final String v2 = "android.permission.INTERNET"; // const-string v2, "android.permission.INTERNET"
v2 = (( android.content.Context ) p1 ).checkCallingOrSelfPermission ( v2 ); // invoke-virtual {p1, v2}, Landroid/content/Context;->checkCallingOrSelfPermission(Ljava/lang/String;)I
if ( v2 != null) { // if-eqz v2, :cond_2
/* .line 623 */
final String v2 = "Error"; // const-string v2, "Error"
final String v3 = "Application requires permission to access the Internet"; // const-string v3, "Application requires permission to access the Internet"
com.facebook.android.Util .showAlert ( p1,v2,v3 );
/* .line 628 */
} // :goto_1
return;
/* .line 614 */
} // .end local v1 # "url":Ljava/lang/String;
} // :cond_1
final String v2 = "app_id"; // const-string v2, "app_id"
v3 = this.mAppId;
(( android.os.Bundle ) p3 ).putString ( v2, v3 ); // invoke-virtual {p3, v2, v3}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V
/* .line 626 */
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
/* .line 583 */
/* new-instance v0, Landroid/os/Bundle; */
/* invoke-direct {v0}, Landroid/os/Bundle;-><init>()V */
(( com.facebook.android.Facebook ) p0 ).dialog ( p1, p2, v0, p3 ); // invoke-virtual {p0, p1, p2, v0, p3}, Lcom/facebook/android/Facebook;->dialog(Landroid/content/Context;Ljava/lang/String;Landroid/os/Bundle;Lcom/facebook/android/Facebook$DialogListener;)V
/* .line 584 */
return;
} // .end method
public Long getAccessExpires ( ) {
/* .locals 2 */
/* .prologue */
/* .line 656 */
/* iget-wide v0, p0, Lcom/facebook/android/Facebook;->mAccessExpires:J */
/* return-wide v0 */
} // .end method
public java.lang.String getAccessToken ( ) {
/* .locals 1 */
/* .prologue */
/* .line 646 */
v0 = this.mAccessToken;
} // .end method
public java.lang.String getAppId ( ) {
/* .locals 1 */
/* .prologue */
/* .line 695 */
v0 = this.mAppId;
} // .end method
public Boolean isSessionValid ( ) {
/* .locals 4 */
/* .prologue */
/* .line 634 */
(( com.facebook.android.Facebook ) p0 ).getAccessToken ( ); // invoke-virtual {p0}, Lcom/facebook/android/Facebook;->getAccessToken()Ljava/lang/String;
if ( v0 != null) { // if-eqz v0, :cond_1
(( com.facebook.android.Facebook ) p0 ).getAccessExpires ( ); // invoke-virtual {p0}, Lcom/facebook/android/Facebook;->getAccessExpires()J
/* move-result-wide v0 */
/* const-wide/16 v2, 0x0 */
/* cmp-long v0, v0, v2 */
if ( v0 != null) { // if-eqz v0, :cond_0
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
/* .line 435 */
com.facebook.android.Util .clearCookies ( p1 );
/* .line 436 */
/* new-instance v0, Landroid/os/Bundle; */
/* invoke-direct {v0}, Landroid/os/Bundle;-><init>()V */
/* .line 437 */
/* .local v0, "b":Landroid/os/Bundle; */
final String v2 = "method"; // const-string v2, "method"
final String v3 = "auth.expireSession"; // const-string v3, "auth.expireSession"
(( android.os.Bundle ) v0 ).putString ( v2, v3 ); // invoke-virtual {v0, v2, v3}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V
/* .line 438 */
(( com.facebook.android.Facebook ) p0 ).request ( v0 ); // invoke-virtual {p0, v0}, Lcom/facebook/android/Facebook;->request(Landroid/os/Bundle;)Ljava/lang/String;
/* .line 439 */
/* .local v1, "response":Ljava/lang/String; */
int v2 = 0; // const/4 v2, 0x0
(( com.facebook.android.Facebook ) p0 ).setAccessToken ( v2 ); // invoke-virtual {p0, v2}, Lcom/facebook/android/Facebook;->setAccessToken(Ljava/lang/String;)V
/* .line 440 */
/* const-wide/16 v2, 0x0 */
(( com.facebook.android.Facebook ) p0 ).setAccessExpires ( v2, v3 ); // invoke-virtual {p0, v2, v3}, Lcom/facebook/android/Facebook;->setAccessExpires(J)V
/* .line 441 */
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
/* .line 474 */
final String v0 = "method"; // const-string v0, "method"
v0 = (( android.os.Bundle ) p1 ).containsKey ( v0 ); // invoke-virtual {p1, v0}, Landroid/os/Bundle;->containsKey(Ljava/lang/String;)Z
/* if-nez v0, :cond_0 */
/* .line 475 */
/* new-instance v0, Ljava/lang/IllegalArgumentException; */
final String v1 = "API method must be specified.(parameters must contain key \"method\" and value).See http://developers.facebook.com/docs/reference/rest/"; // const-string v1, "API method must be specified.(parameters must contain key \"method\" and value).See http://developers.facebook.com/docs/reference/rest/"
/* invoke-direct {v0, v1}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V */
/* throw v0 */
/* .line 479 */
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
/* .line 500 */
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
/* .line 527 */
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
/* .line 557 */
final String v1 = "format"; // const-string v1, "format"
final String v2 = "json"; // const-string v2, "json"
(( android.os.Bundle ) p2 ).putString ( v1, v2 ); // invoke-virtual {p2, v1, v2}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V
/* .line 558 */
v1 = (( com.facebook.android.Facebook ) p0 ).isSessionValid ( ); // invoke-virtual {p0}, Lcom/facebook/android/Facebook;->isSessionValid()Z
if ( v1 != null) { // if-eqz v1, :cond_0
/* .line 559 */
final String v1 = "access_token"; // const-string v1, "access_token"
(( com.facebook.android.Facebook ) p0 ).getAccessToken ( ); // invoke-virtual {p0}, Lcom/facebook/android/Facebook;->getAccessToken()Ljava/lang/String;
(( android.os.Bundle ) p2 ).putString ( v1, v2 ); // invoke-virtual {p2, v1, v2}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V
/* .line 561 */
} // :cond_0
if ( p1 != null) { // if-eqz p1, :cond_1
/* new-instance v1, Ljava/lang/StringBuilder; */
/* invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V */
v2 = com.facebook.android.Facebook.GRAPH_BASE_URL;
(( java.lang.StringBuilder ) v1 ).append ( v2 ); // invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v1 ).append ( p1 ); // invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v1 ).toString ( ); // invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
/* .line 563 */
/* .local v0, "url":Ljava/lang/String; */
} // :goto_0
com.facebook.android.Util .openUrl ( v0,p3,p2 );
/* .line 561 */
} // .end local v0 # "url":Ljava/lang/String;
} // :cond_1
v0 = com.facebook.android.Facebook.RESTSERVER_URL;
} // .end method
public void setAccessExpires ( Long p0 ) {
/* .locals 0 */
/* .param p1, "time" # J */
/* .prologue */
/* .line 675 */
/* iput-wide p1, p0, Lcom/facebook/android/Facebook;->mAccessExpires:J */
/* .line 676 */
return;
} // .end method
public void setAccessExpiresIn ( java.lang.String p0 ) {
/* .locals 8 */
/* .param p1, "expiresIn" # Ljava/lang/String; */
/* .prologue */
/* .line 686 */
if ( p1 != null) { // if-eqz p1, :cond_0
/* .line 687 */
final String v2 = "0"; // const-string v2, "0"
v2 = (( java.lang.String ) p1 ).equals ( v2 ); // invoke-virtual {p1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
if ( v2 != null) { // if-eqz v2, :cond_1
/* const-wide/16 v0, 0x0 */
/* .line 690 */
/* .local v0, "expires":J */
} // :goto_0
(( com.facebook.android.Facebook ) p0 ).setAccessExpires ( v0, v1 ); // invoke-virtual {p0, v0, v1}, Lcom/facebook/android/Facebook;->setAccessExpires(J)V
/* .line 692 */
} // .end local v0 # "expires":J
} // :cond_0
return;
/* .line 687 */
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
/* .locals 0 */
/* .param p1, "token" # Ljava/lang/String; */
/* .prologue */
/* .line 665 */
this.mAccessToken = p1;
/* .line 666 */
return;
} // .end method
public void setAppId ( java.lang.String p0 ) {
/* .locals 0 */
/* .param p1, "appId" # Ljava/lang/String; */
/* .prologue */
/* .line 699 */
this.mAppId = p1;
/* .line 700 */
return;
} // .end method
