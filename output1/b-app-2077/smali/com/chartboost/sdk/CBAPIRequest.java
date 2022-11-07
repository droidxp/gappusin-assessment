public class com.chartboost.sdk.CBAPIRequest {
	 /* .source "CBAPIRequest.java" */
	 /* # static fields */
	 public static final java.lang.String CB_PARAM_AD_ID;
	 private static final java.lang.String CB_PARAM_AUID;
	 public static final java.lang.String CB_PARAM_CACHE;
	 private static final java.lang.String CB_PARAM_COUNTRY;
	 private static final java.lang.String CB_PARAM_HEIGHT;
	 public static final java.lang.String CB_PARAM_IMEI;
	 private static final java.lang.String CB_PARAM_LANGUAGE;
	 private static final java.lang.String CB_PARAM_MODEL;
	 private static final java.lang.String CB_PARAM_OS;
	 private static final java.lang.String CB_PARAM_SCALE;
	 private static final java.lang.String CB_PARAM_SDK;
	 private static final java.lang.String CB_PARAM_UUID;
	 private static final java.lang.String CB_PARAM_VERSION;
	 private static final java.lang.String CB_PARAM_WIDTH;
	 /* # instance fields */
	 private java.lang.String action;
	 private java.util.Map body;
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
private android.content.Context context;
private java.lang.Object contextInfoObject;
private java.lang.String controller;
private java.util.List params;
/* .annotation system Ldalvik/annotation/Signature; */
/* value = { */
/* "Ljava/util/List", */
/* "<", */
/* "Ljava/lang/String;", */
/* ">;" */
/* } */
} // .end annotation
} // .end field
private java.util.Map query;
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
/* # direct methods */
public com.chartboost.sdk.CBAPIRequest ( ) {
/* .locals 0 */
/* .param p1, "context" # Landroid/content/Context; */
/* .param p2, "controller" # Ljava/lang/String; */
/* .param p3, "action" # Ljava/lang/String; */
/* .prologue */
/* .line 50 */
/* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
/* .line 51 */
this.context = p1;
/* .line 52 */
this.controller = p2;
/* .line 53 */
this.action = p3;
/* .line 54 */
return;
} // .end method
private java.lang.String serializeDictionaryToString ( java.util.Map p0 ) {
/* .locals 7 */
/* .annotation system Ldalvik/annotation/Signature; */
/* value = { */
/* "(", */
/* "Ljava/util/Map", */
/* "<", */
/* "Ljava/lang/String;", */
/* "Ljava/lang/String;", */
/* ">;)", */
/* "Ljava/lang/String;" */
/* } */
} // .end annotation
/* .prologue */
/* .line 263 */
/* .local p1, "dictionary":Ljava/util/Map;, "Ljava/util/Map<Ljava/lang/String;Ljava/lang/String;>;" */
final String v2 = ""; // const-string v2, ""
/* .line 264 */
/* .local v2, "string":Ljava/lang/String; */
/* new-instance v1, Ljava/util/TreeSet; */
/* invoke-direct {v1, v4}, Ljava/util/TreeSet;-><init>(Ljava/util/Collection;)V */
/* .line 266 */
/* .local v1, "keys":Ljava/util/TreeSet;, "Ljava/util/TreeSet<Ljava/lang/String;>;" */
(( java.util.TreeSet ) v1 ).iterator ( ); // invoke-virtual {v1}, Ljava/util/TreeSet;->iterator()Ljava/util/Iterator;
} // :cond_0
v5 = } // :goto_0
/* if-nez v5, :cond_1 */
/* .line 276 */
/* .line 266 */
} // :cond_1
/* check-cast v0, Ljava/lang/String; */
/* .line 269 */
/* .local v0, "key":Ljava/lang/String; */
final String v5 = "app"; // const-string v5, "app"
v5 = (( java.lang.String ) v0 ).equals ( v5 ); // invoke-virtual {v0, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
/* if-nez v5, :cond_0 */
final String v5 = "signature"; // const-string v5, "signature"
v5 = (( java.lang.String ) v0 ).equals ( v5 ); // invoke-virtual {v0, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
/* if-nez v5, :cond_0 */
/* .line 272 */
/* check-cast v3, Ljava/lang/String; */
/* .line 273 */
/* .local v3, "value":Ljava/lang/String; */
/* new-instance v5, Ljava/lang/StringBuilder; */
java.lang.String .valueOf ( v2 );
/* invoke-direct {v5, v6}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V */
(( java.lang.StringBuilder ) v5 ).append ( v0 ); // invoke-virtual {v5, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
final String v6 = ":"; // const-string v6, ":"
(( java.lang.StringBuilder ) v5 ).append ( v6 ); // invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v5 ).append ( v3 ); // invoke-virtual {v5, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
final String v6 = ";"; // const-string v6, ";"
(( java.lang.StringBuilder ) v5 ).append ( v6 ); // invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v5 ).toString ( ); // invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
} // .end method
/* # virtual methods */
public void appendBodyArgument ( java.lang.String p0, java.lang.String p1 ) {
/* .locals 1 */
/* .param p1, "key" # Ljava/lang/String; */
/* .param p2, "value" # Ljava/lang/String; */
/* .prologue */
/* .line 57 */
v0 = this.body;
/* if-nez v0, :cond_0 */
/* .line 58 */
/* new-instance v0, Ljava/util/HashMap; */
/* invoke-direct {v0}, Ljava/util/HashMap;-><init>()V */
this.body = v0;
/* .line 60 */
} // :cond_0
v0 = this.body;
/* .line 61 */
return;
} // .end method
public void appendDeviceInfoParams ( ) {
/* .locals 10 */
/* .annotation system Ldalvik/annotation/Throws; */
/* value = { */
/* Ljava/lang/Exception; */
/* } */
} // .end annotation
/* .prologue */
/* .line 72 */
v7 = this.context;
/* if-nez v7, :cond_0 */
/* .line 73 */
/* new-instance v7, Ljava/lang/Exception; */
/* invoke-direct {v7}, Ljava/lang/Exception;-><init>()V */
/* throw v7 */
/* .line 75 */
} // :cond_0
v7 = android.os.Build.PRODUCT;
final String v8 = "sdk"; // const-string v8, "sdk"
v7 = (( java.lang.String ) v7 ).equals ( v8 ); // invoke-virtual {v7, v8}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
if ( v7 != null) { // if-eqz v7, :cond_2
/* .line 77 */
final String v7 = "model"; // const-string v7, "model"
final String v8 = "Android Simulator"; // const-string v8, "Android Simulator"
(( com.chartboost.sdk.CBAPIRequest ) p0 ).appendBodyArgument ( v7, v8 ); // invoke-virtual {p0, v7, v8}, Lcom/chartboost/sdk/CBAPIRequest;->appendBodyArgument(Ljava/lang/String;Ljava/lang/String;)V
/* .line 78 */
final String v7 = "uuid"; // const-string v7, "uuid"
final String v8 = "ffff"; // const-string v8, "ffff"
(( com.chartboost.sdk.CBAPIRequest ) p0 ).appendBodyArgument ( v7, v8 ); // invoke-virtual {p0, v7, v8}, Lcom/chartboost/sdk/CBAPIRequest;->appendBodyArgument(Ljava/lang/String;Ljava/lang/String;)V
/* .line 79 */
final String v7 = "auid"; // const-string v7, "auid"
final String v8 = "ffff"; // const-string v8, "ffff"
(( com.chartboost.sdk.CBAPIRequest ) p0 ).appendBodyArgument ( v7, v8 ); // invoke-virtual {p0, v7, v8}, Lcom/chartboost/sdk/CBAPIRequest;->appendBodyArgument(Ljava/lang/String;Ljava/lang/String;)V
/* .line 86 */
} // :goto_0
final String v7 = "os"; // const-string v7, "os"
/* new-instance v8, Ljava/lang/StringBuilder; */
final String v9 = "Android "; // const-string v9, "Android "
/* invoke-direct {v8, v9}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V */
v9 = android.os.Build$VERSION.RELEASE;
(( java.lang.StringBuilder ) v8 ).append ( v9 ); // invoke-virtual {v8, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v8 ).toString ( ); // invoke-virtual {v8}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
(( com.chartboost.sdk.CBAPIRequest ) p0 ).appendBodyArgument ( v7, v8 ); // invoke-virtual {p0, v7, v8}, Lcom/chartboost/sdk/CBAPIRequest;->appendBodyArgument(Ljava/lang/String;Ljava/lang/String;)V
/* .line 87 */
final String v7 = "country"; // const-string v7, "country"
java.util.Locale .getDefault ( );
(( java.util.Locale ) v8 ).getCountry ( ); // invoke-virtual {v8}, Ljava/util/Locale;->getCountry()Ljava/lang/String;
(( com.chartboost.sdk.CBAPIRequest ) p0 ).appendBodyArgument ( v7, v8 ); // invoke-virtual {p0, v7, v8}, Lcom/chartboost/sdk/CBAPIRequest;->appendBodyArgument(Ljava/lang/String;Ljava/lang/String;)V
/* .line 88 */
final String v7 = "language"; // const-string v7, "language"
java.util.Locale .getDefault ( );
(( java.util.Locale ) v8 ).getDisplayLanguage ( ); // invoke-virtual {v8}, Ljava/util/Locale;->getDisplayLanguage()Ljava/lang/String;
(( com.chartboost.sdk.CBAPIRequest ) p0 ).appendBodyArgument ( v7, v8 ); // invoke-virtual {p0, v7, v8}, Lcom/chartboost/sdk/CBAPIRequest;->appendBodyArgument(Ljava/lang/String;Ljava/lang/String;)V
/* .line 89 */
final String v7 = "sdk"; // const-string v7, "sdk"
final String v8 = "2.0.1"; // const-string v8, "2.0.1"
(( com.chartboost.sdk.CBAPIRequest ) p0 ).appendBodyArgument ( v7, v8 ); // invoke-virtual {p0, v7, v8}, Lcom/chartboost/sdk/CBAPIRequest;->appendBodyArgument(Ljava/lang/String;Ljava/lang/String;)V
/* .line 91 */
v7 = this.context;
final String v8 = "window"; // const-string v8, "window"
(( android.content.Context ) v7 ).getSystemService ( v8 ); // invoke-virtual {v7, v8}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;
/* check-cast v7, Landroid/view/WindowManager; */
/* .line 93 */
/* .local v0, "display":Landroid/view/Display; */
int v3 = 0; // const/4 v3, 0x0
/* .line 94 */
/* .local v3, "statusBarOffset":I */
/* const/16 v8, 0x8 */
/* if-gt v7, v8, :cond_1 */
/* .line 96 */
/* new-instance v2, Landroid/graphics/Rect; */
/* invoke-direct {v2}, Landroid/graphics/Rect;-><init>()V */
/* .line 97 */
/* .local v2, "rectangle":Landroid/graphics/Rect; */
v7 = this.context;
/* check-cast v7, Landroid/app/Activity; */
(( android.app.Activity ) v7 ).getWindow ( ); // invoke-virtual {v7}, Landroid/app/Activity;->getWindow()Landroid/view/Window;
/* .line 98 */
/* .local v6, "window":Landroid/view/Window; */
(( android.view.Window ) v6 ).getDecorView ( ); // invoke-virtual {v6}, Landroid/view/Window;->getDecorView()Landroid/view/View;
(( android.view.View ) v7 ).getWindowVisibleDisplayFrame ( v2 ); // invoke-virtual {v7, v2}, Landroid/view/View;->getWindowVisibleDisplayFrame(Landroid/graphics/Rect;)V
/* .line 99 */
/* iget v3, v2, Landroid/graphics/Rect;->top:I */
/* .line 102 */
} // .end local v2 # "rectangle":Landroid/graphics/Rect;
} // .end local v6 # "window":Landroid/view/Window;
} // :cond_1
final String v7 = "w"; // const-string v7, "w"
/* new-instance v8, Ljava/lang/StringBuilder; */
/* invoke-direct {v8}, Ljava/lang/StringBuilder;-><init>()V */
v9 = (( android.view.Display ) v0 ).getWidth ( ); // invoke-virtual {v0}, Landroid/view/Display;->getWidth()I
(( java.lang.StringBuilder ) v8 ).append ( v9 ); // invoke-virtual {v8, v9}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v8 ).toString ( ); // invoke-virtual {v8}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
(( com.chartboost.sdk.CBAPIRequest ) p0 ).appendBodyArgument ( v7, v8 ); // invoke-virtual {p0, v7, v8}, Lcom/chartboost/sdk/CBAPIRequest;->appendBodyArgument(Ljava/lang/String;Ljava/lang/String;)V
/* .line 103 */
final String v7 = "h"; // const-string v7, "h"
/* new-instance v8, Ljava/lang/StringBuilder; */
/* invoke-direct {v8}, Ljava/lang/StringBuilder;-><init>()V */
v9 = (( android.view.Display ) v0 ).getHeight ( ); // invoke-virtual {v0}, Landroid/view/Display;->getHeight()I
/* sub-int/2addr v9, v3 */
(( java.lang.StringBuilder ) v8 ).append ( v9 ); // invoke-virtual {v8, v9}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v8 ).toString ( ); // invoke-virtual {v8}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
(( com.chartboost.sdk.CBAPIRequest ) p0 ).appendBodyArgument ( v7, v8 ); // invoke-virtual {p0, v7, v8}, Lcom/chartboost/sdk/CBAPIRequest;->appendBodyArgument(Ljava/lang/String;Ljava/lang/String;)V
/* .line 104 */
final String v7 = "scale"; // const-string v7, "scale"
/* new-instance v8, Ljava/lang/StringBuilder; */
/* invoke-direct {v8}, Ljava/lang/StringBuilder;-><init>()V */
v9 = this.context;
(( android.content.Context ) v9 ).getResources ( ); // invoke-virtual {v9}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;
(( android.content.res.Resources ) v9 ).getDisplayMetrics ( ); // invoke-virtual {v9}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;
/* iget v9, v9, Landroid/util/DisplayMetrics;->density:F */
(( java.lang.StringBuilder ) v8 ).append ( v9 ); // invoke-virtual {v8, v9}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v8 ).toString ( ); // invoke-virtual {v8}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
(( com.chartboost.sdk.CBAPIRequest ) p0 ).appendBodyArgument ( v7, v8 ); // invoke-virtual {p0, v7, v8}, Lcom/chartboost/sdk/CBAPIRequest;->appendBodyArgument(Ljava/lang/String;Ljava/lang/String;)V
/* .line 112 */
try { // :try_start_0
v7 = this.context;
final String v8 = "phone"; // const-string v8, "phone"
(( android.content.Context ) v7 ).getSystemService ( v8 ); // invoke-virtual {v7, v8}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;
/* check-cast v4, Landroid/telephony/TelephonyManager; */
/* .line 113 */
/* .local v4, "tm":Landroid/telephony/TelephonyManager; */
final String v8 = "imei"; // const-string v8, "imei"
(( android.telephony.TelephonyManager ) v4 ).getDeviceId ( ); // invoke-virtual {v4}, Landroid/telephony/TelephonyManager;->getDeviceId()Ljava/lang/String;
/* if-nez v7, :cond_3 */
final String v7 = ""; // const-string v7, ""
} // :goto_1
(( com.chartboost.sdk.CBAPIRequest ) p0 ).appendBodyArgument ( v8, v7 ); // invoke-virtual {p0, v8, v7}, Lcom/chartboost/sdk/CBAPIRequest;->appendBodyArgument(Ljava/lang/String;Ljava/lang/String;)V
/* :try_end_0 */
/* .catch Ljava/lang/Exception; {:try_start_0 ..:try_end_0} :catch_1 */
/* .line 121 */
} // .end local v4 # "tm":Landroid/telephony/TelephonyManager;
} // :goto_2
try { // :try_start_1
v7 = this.context;
(( android.content.Context ) v7 ).getPackageManager ( ); // invoke-virtual {v7}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;
v8 = this.context;
(( android.content.Context ) v8 ).getPackageName ( ); // invoke-virtual {v8}, Landroid/content/Context;->getPackageName()Ljava/lang/String;
/* const/16 v9, 0x80 */
(( android.content.pm.PackageManager ) v7 ).getPackageInfo ( v8, v9 ); // invoke-virtual {v7, v8, v9}, Landroid/content/pm/PackageManager;->getPackageInfo(Ljava/lang/String;I)Landroid/content/pm/PackageInfo;
/* .line 122 */
/* .local v1, "manager":Landroid/content/pm/PackageInfo; */
v5 = this.versionName;
/* .line 123 */
/* .local v5, "version":Ljava/lang/String; */
final String v7 = "bundle"; // const-string v7, "bundle"
(( com.chartboost.sdk.CBAPIRequest ) p0 ).appendBodyArgument ( v7, v5 ); // invoke-virtual {p0, v7, v5}, Lcom/chartboost/sdk/CBAPIRequest;->appendBodyArgument(Ljava/lang/String;Ljava/lang/String;)V
/* :try_end_1 */
/* .catch Ljava/lang/Exception; {:try_start_1 ..:try_end_1} :catch_0 */
/* .line 128 */
} // .end local v1 # "manager":Landroid/content/pm/PackageInfo;
} // .end local v5 # "version":Ljava/lang/String;
} // :goto_3
return;
/* .line 82 */
} // .end local v0 # "display":Landroid/view/Display;
} // .end local v3 # "statusBarOffset":I
} // :cond_2
final String v7 = "model"; // const-string v7, "model"
v8 = android.os.Build.MODEL;
(( com.chartboost.sdk.CBAPIRequest ) p0 ).appendBodyArgument ( v7, v8 ); // invoke-virtual {p0, v7, v8}, Lcom/chartboost/sdk/CBAPIRequest;->appendBodyArgument(Ljava/lang/String;Ljava/lang/String;)V
/* .line 83 */
final String v7 = "uuid"; // const-string v7, "uuid"
v8 = this.context;
(( android.content.Context ) v8 ).getContentResolver ( ); // invoke-virtual {v8}, Landroid/content/Context;->getContentResolver()Landroid/content/ContentResolver;
final String v9 = "android_id"; // const-string v9, "android_id"
android.provider.Settings$Secure .getString ( v8,v9 );
(( com.chartboost.sdk.CBAPIRequest ) p0 ).appendBodyArgument ( v7, v8 ); // invoke-virtual {p0, v7, v8}, Lcom/chartboost/sdk/CBAPIRequest;->appendBodyArgument(Ljava/lang/String;Ljava/lang/String;)V
/* .line 84 */
final String v7 = "auid"; // const-string v7, "auid"
v8 = this.context;
com.chartboost.sdk.CBUtility .getAUID ( v8 );
(( com.chartboost.sdk.CBAPIRequest ) p0 ).appendBodyArgument ( v7, v8 ); // invoke-virtual {p0, v7, v8}, Lcom/chartboost/sdk/CBAPIRequest;->appendBodyArgument(Ljava/lang/String;Ljava/lang/String;)V
/* goto/16 :goto_0 */
/* .line 113 */
/* .restart local v0 # "display":Landroid/view/Display; */
/* .restart local v3 # "statusBarOffset":I */
/* .restart local v4 # "tm":Landroid/telephony/TelephonyManager; */
} // :cond_3
try { // :try_start_2
(( android.telephony.TelephonyManager ) v4 ).getDeviceId ( ); // invoke-virtual {v4}, Landroid/telephony/TelephonyManager;->getDeviceId()Ljava/lang/String;
/* :try_end_2 */
/* .catch Ljava/lang/Exception; {:try_start_2 ..:try_end_2} :catch_1 */
/* .line 124 */
} // .end local v4 # "tm":Landroid/telephony/TelephonyManager;
/* :catch_0 */
/* move-exception v7 */
/* .line 114 */
/* :catch_1 */
/* move-exception v7 */
} // .end method
public void appendQueryArgument ( java.lang.String p0, java.lang.String p1 ) {
/* .locals 1 */
/* .param p1, "key" # Ljava/lang/String; */
/* .param p2, "value" # Ljava/lang/String; */
/* .prologue */
/* .line 64 */
v0 = this.query;
/* if-nez v0, :cond_0 */
/* .line 65 */
/* new-instance v0, Ljava/util/HashMap; */
/* invoke-direct {v0}, Ljava/util/HashMap;-><init>()V */
this.query = v0;
/* .line 67 */
} // :cond_0
v0 = this.query;
/* .line 68 */
return;
} // .end method
public java.lang.String getAction ( ) {
/* .locals 1 */
/* .prologue */
/* .line 190 */
v0 = this.action;
} // .end method
public java.util.Map getBody ( ) {
/* .locals 1 */
/* .annotation system Ldalvik/annotation/Signature; */
/* value = { */
/* "()", */
/* "Ljava/util/Map", */
/* "<", */
/* "Ljava/lang/String;", */
/* "Ljava/lang/String;", */
/* ">;" */
/* } */
} // .end annotation
/* .prologue */
/* .line 205 */
v0 = this.body;
} // .end method
public java.lang.Object getContextInfoObject ( ) {
/* .locals 1 */
/* .prologue */
/* .line 250 */
v0 = this.contextInfoObject;
} // .end method
public java.lang.String getController ( ) {
/* .locals 1 */
/* .prologue */
/* .line 175 */
v0 = this.controller;
} // .end method
public java.util.List getParams ( ) {
/* .locals 1 */
/* .annotation system Ldalvik/annotation/Signature; */
/* value = { */
/* "()", */
/* "Ljava/util/List", */
/* "<", */
/* "Ljava/lang/String;", */
/* ">;" */
/* } */
} // .end annotation
/* .prologue */
/* .line 235 */
v0 = this.params;
} // .end method
public java.util.Map getQuery ( ) {
/* .locals 1 */
/* .annotation system Ldalvik/annotation/Signature; */
/* value = { */
/* "()", */
/* "Ljava/util/Map", */
/* "<", */
/* "Ljava/lang/String;", */
/* "Ljava/lang/String;", */
/* ">;" */
/* } */
} // .end annotation
/* .prologue */
/* .line 220 */
v0 = this.query;
} // .end method
public void setAction ( java.lang.String p0 ) {
/* .locals 0 */
/* .param p1, "action" # Ljava/lang/String; */
/* .prologue */
/* .line 198 */
this.action = p1;
/* .line 199 */
return;
} // .end method
public void setBody ( java.util.Map p0 ) {
/* .locals 0 */
/* .annotation system Ldalvik/annotation/Signature; */
/* value = { */
/* "(", */
/* "Ljava/util/Map", */
/* "<", */
/* "Ljava/lang/String;", */
/* "Ljava/lang/String;", */
/* ">;)V" */
/* } */
} // .end annotation
/* .prologue */
/* .line 213 */
/* .local p1, "body":Ljava/util/Map;, "Ljava/util/Map<Ljava/lang/String;Ljava/lang/String;>;" */
this.body = p1;
/* .line 214 */
return;
} // .end method
public void setContextInfoObject ( java.lang.Object p0 ) {
/* .locals 0 */
/* .param p1, "contextInfoObject" # Ljava/lang/Object; */
/* .prologue */
/* .line 258 */
this.contextInfoObject = p1;
/* .line 259 */
return;
} // .end method
public void setController ( java.lang.String p0 ) {
/* .locals 0 */
/* .param p1, "controller" # Ljava/lang/String; */
/* .prologue */
/* .line 183 */
this.controller = p1;
/* .line 184 */
return;
} // .end method
public void setParams ( java.util.List p0 ) {
/* .locals 0 */
/* .annotation system Ldalvik/annotation/Signature; */
/* value = { */
/* "(", */
/* "Ljava/util/List", */
/* "<", */
/* "Ljava/lang/String;", */
/* ">;)V" */
/* } */
} // .end annotation
/* .prologue */
/* .line 243 */
/* .local p1, "params":Ljava/util/List;, "Ljava/util/List<Ljava/lang/String;>;" */
this.params = p1;
/* .line 244 */
return;
} // .end method
public void setQuery ( java.util.Map p0 ) {
/* .locals 0 */
/* .annotation system Ldalvik/annotation/Signature; */
/* value = { */
/* "(", */
/* "Ljava/util/Map", */
/* "<", */
/* "Ljava/lang/String;", */
/* "Ljava/lang/String;", */
/* ">;)V" */
/* } */
} // .end annotation
/* .prologue */
/* .line 228 */
/* .local p1, "query":Ljava/util/Map;, "Ljava/util/Map<Ljava/lang/String;Ljava/lang/String;>;" */
this.query = p1;
/* .line 229 */
return;
} // .end method
public void sign ( java.lang.String p0, java.lang.String p1 ) {
/* .locals 15 */
/* .param p1, "appId" # Ljava/lang/String; */
/* .param p2, "appSignature" # Ljava/lang/String; */
/* .annotation system Ldalvik/annotation/Throws; */
/* value = { */
/* Ljava/lang/Exception; */
/* } */
} // .end annotation
/* .prologue */
/* .line 133 */
/* new-instance v10, Ljava/lang/StringBuilder; */
final String v11 = "controller:"; // const-string v11, "controller:"
/* invoke-direct {v10, v11}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V */
v11 = this.controller;
(( java.lang.StringBuilder ) v10 ).append ( v11 ); // invoke-virtual {v10, v11}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
final String v11 = ";action:"; // const-string v11, ";action:"
(( java.lang.StringBuilder ) v10 ).append ( v11 ); // invoke-virtual {v10, v11}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
v11 = this.action;
(( java.lang.StringBuilder ) v10 ).append ( v11 ); // invoke-virtual {v10, v11}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
final String v11 = ";"; // const-string v11, ";"
(( java.lang.StringBuilder ) v10 ).append ( v11 ); // invoke-virtual {v10, v11}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v10 ).toString ( ); // invoke-virtual {v10}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
/* .line 136 */
/* .local v8, "string":Ljava/lang/String; */
v10 = this.query;
if ( v10 != null) { // if-eqz v10, :cond_0
/* .line 137 */
/* new-instance v10, Ljava/lang/StringBuilder; */
java.lang.String .valueOf ( v8 );
/* invoke-direct {v10, v11}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V */
v11 = this.query;
/* invoke-direct {p0, v11}, Lcom/chartboost/sdk/CBAPIRequest;->serializeDictionaryToString(Ljava/util/Map;)Ljava/lang/String; */
(( java.lang.StringBuilder ) v10 ).append ( v11 ); // invoke-virtual {v10, v11}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v10 ).toString ( ); // invoke-virtual {v10}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
/* .line 139 */
} // :cond_0
v10 = this.body;
if ( v10 != null) { // if-eqz v10, :cond_1
/* .line 140 */
/* new-instance v10, Ljava/lang/StringBuilder; */
java.lang.String .valueOf ( v8 );
/* invoke-direct {v10, v11}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V */
v11 = this.body;
/* invoke-direct {p0, v11}, Lcom/chartboost/sdk/CBAPIRequest;->serializeDictionaryToString(Ljava/util/Map;)Ljava/lang/String; */
(( java.lang.StringBuilder ) v10 ).append ( v11 ); // invoke-virtual {v10, v11}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v10 ).toString ( ); // invoke-virtual {v10}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
/* .line 144 */
} // :cond_1
v10 = this.params;
if ( v10 != null) { // if-eqz v10, :cond_2
/* .line 145 */
int v1 = 0; // const/4 v1, 0x0
/* .line 146 */
/* .local v1, "count":I */
v10 = this.params;
v11 = } // :goto_0
/* if-nez v11, :cond_3 */
/* .line 152 */
} // .end local v1 # "count":I
} // :cond_2
/* new-instance v10, Ljava/lang/StringBuilder; */
java.lang.String .valueOf ( v8 );
/* invoke-direct {v10, v11}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V */
final String v11 = "app:"; // const-string v11, "app:"
(( java.lang.StringBuilder ) v10 ).append ( v11 ); // invoke-virtual {v10, v11}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
/* move-object/from16 v0, p1 */
(( java.lang.StringBuilder ) v10 ).append ( v0 ); // invoke-virtual {v10, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
final String v11 = ";signature:"; // const-string v11, ";signature:"
(( java.lang.StringBuilder ) v10 ).append ( v11 ); // invoke-virtual {v10, v11}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
/* move-object/from16 v0, p2 */
(( java.lang.StringBuilder ) v10 ).append ( v0 ); // invoke-virtual {v10, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
final String v11 = ";"; // const-string v11, ";"
(( java.lang.StringBuilder ) v10 ).append ( v11 ); // invoke-virtual {v10, v11}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v10 ).toString ( ); // invoke-virtual {v10}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
/* .line 155 */
final String v10 = "STRING"; // const-string v10, "STRING"
android.util.Log .i ( v10,v8 );
/* .line 157 */
final String v10 = "ISO-8859-1"; // const-string v10, "ISO-8859-1"
(( java.lang.String ) v8 ).getBytes ( v10 ); // invoke-virtual {v8, v10}, Ljava/lang/String;->getBytes(Ljava/lang/String;)[B
/* .line 159 */
/* .local v9, "stringBinary":[B */
final String v10 = "MD5"; // const-string v10, "MD5"
java.security.MessageDigest .getInstance ( v10 );
/* .line 160 */
/* .local v6, "md":Ljava/security/MessageDigest; */
(( java.security.MessageDigest ) v6 ).digest ( v9 ); // invoke-virtual {v6, v9}, Ljava/security/MessageDigest;->digest([B)[B
/* .line 161 */
/* .local v4, "hashBinary":[B */
final String v3 = ""; // const-string v3, ""
/* .line 162 */
/* .local v3, "hash":Ljava/lang/String; */
int v5 = 0; // const/4 v5, 0x0
/* .local v5, "i":I */
} // :goto_1
/* array-length v10, v4 */
/* if-lt v5, v10, :cond_4 */
/* .line 167 */
final String v10 = "app"; // const-string v10, "app"
/* move-object/from16 v0, p1 */
(( com.chartboost.sdk.CBAPIRequest ) p0 ).appendBodyArgument ( v10, v0 ); // invoke-virtual {p0, v10, v0}, Lcom/chartboost/sdk/CBAPIRequest;->appendBodyArgument(Ljava/lang/String;Ljava/lang/String;)V
/* .line 168 */
final String v10 = "signature"; // const-string v10, "signature"
(( com.chartboost.sdk.CBAPIRequest ) p0 ).appendBodyArgument ( v10, v3 ); // invoke-virtual {p0, v10, v3}, Lcom/chartboost/sdk/CBAPIRequest;->appendBodyArgument(Ljava/lang/String;Ljava/lang/String;)V
/* .line 169 */
return;
/* .line 146 */
} // .end local v3 # "hash":Ljava/lang/String;
} // .end local v4 # "hashBinary":[B
} // .end local v5 # "i":I
} // .end local v6 # "md":Ljava/security/MessageDigest;
} // .end local v9 # "stringBinary":[B
/* .restart local v1 # "count":I */
} // :cond_3
/* check-cast v7, Ljava/lang/String; */
/* .line 147 */
/* .local v7, "param":Ljava/lang/String; */
/* new-instance v11, Ljava/lang/StringBuilder; */
java.lang.String .valueOf ( v8 );
/* invoke-direct {v11, v12}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V */
/* add-int/lit8 v2, v1, 0x1 */
} // .end local v1 # "count":I
/* .local v2, "count":I */
(( java.lang.StringBuilder ) v11 ).append ( v1 ); // invoke-virtual {v11, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;
final String v12 = ":"; // const-string v12, ":"
(( java.lang.StringBuilder ) v11 ).append ( v12 ); // invoke-virtual {v11, v12}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v11 ).append ( v7 ); // invoke-virtual {v11, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
final String v12 = ";"; // const-string v12, ";"
(( java.lang.StringBuilder ) v11 ).append ( v12 ); // invoke-virtual {v11, v12}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v11 ).toString ( ); // invoke-virtual {v11}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
/* move v1, v2 */
} // .end local v2 # "count":I
/* .restart local v1 # "count":I */
/* goto/16 :goto_0 */
/* .line 163 */
} // .end local v1 # "count":I
} // .end local v7 # "param":Ljava/lang/String;
/* .restart local v3 # "hash":Ljava/lang/String; */
/* .restart local v4 # "hashBinary":[B */
/* .restart local v5 # "i":I */
/* .restart local v6 # "md":Ljava/security/MessageDigest; */
/* .restart local v9 # "stringBinary":[B */
} // :cond_4
/* new-instance v10, Ljava/lang/StringBuilder; */
java.lang.String .valueOf ( v3 );
/* invoke-direct {v10, v11}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V */
final String v11 = "%02x"; // const-string v11, "%02x"
int v12 = 1; // const/4 v12, 0x1
/* new-array v12, v12, [Ljava/lang/Object; */
int v13 = 0; // const/4 v13, 0x0
/* aget-byte v14, v4, v5 */
/* and-int/lit16 v14, v14, 0xff */
java.lang.Integer .valueOf ( v14 );
/* aput-object v14, v12, v13 */
java.lang.String .format ( v11,v12 );
(( java.lang.StringBuilder ) v10 ).append ( v11 ); // invoke-virtual {v10, v11}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v10 ).toString ( ); // invoke-virtual {v10}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
/* .line 162 */
/* add-int/lit8 v5, v5, 0x1 */
} // .end method
