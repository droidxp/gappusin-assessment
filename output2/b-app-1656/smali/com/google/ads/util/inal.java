public class inal {
	 /* .source "SourceFile" */
	 /* # annotations */
	 /* .annotation system Ldalvik/annotation/MemberClasses; */
	 /* value = { */
	 /* Lcom/google/ads/util/AdUtil$UserActivityReceiver;, */
	 /* Lcom/google/ads/util/AdUtil$a; */
	 /* } */
} // .end annotation
/* # static fields */
public static final Integer a;
private static java.lang.Boolean b;
private static java.lang.String c;
private static java.lang.String d;
private static java.lang.String e;
private static android.media.AudioManager f;
private static Boolean g;
private static Boolean h;
private static java.lang.String i;
/* # direct methods */
static inal ( ) {
	 /* .locals 2 */
	 /* .prologue */
	 int v1 = 0; // const/4 v1, 0x0
	 /* .line 64 */
	 v0 = android.os.Build$VERSION.SDK;
	 v0 = 	 com.google.ads.util.AdUtil .a ( v0 );
	 /* .line 91 */
	 /* .line 94 */
	 /* .line 100 */
	 /* .line 106 */
	 int v0 = 1; // const/4 v0, 0x1
	 com.google.ads.util.AdUtil.g = (v0!= 0);
	 /* .line 724 */
	 int v0 = 0; // const/4 v0, 0x0
	 com.google.ads.util.AdUtil.h = (v0!= 0);
	 /* .line 764 */
	 return;
} // .end method
public static Integer a ( ) {
	 /* .locals 2 */
	 /* .prologue */
	 /* .line 221 */
	 /* const/16 v1, 0x9 */
	 /* if-lt v0, v1, :cond_0 */
	 /* .line 222 */
	 int v0 = 6; // const/4 v0, 0x6
	 /* .line 224 */
} // :goto_0
} // :cond_0
int v0 = 0; // const/4 v0, 0x0
} // .end method
public static Integer a ( android.content.Context p0, android.util.DisplayMetrics p1 ) {
/* .locals 2 */
/* .prologue */
/* .line 252 */
int v1 = 4; // const/4 v1, 0x4
/* if-lt v0, v1, :cond_0 */
/* .line 253 */
v0 = com.google.ads.util.e .a ( p0,p1 );
/* .line 255 */
} // :goto_0
} // :cond_0
/* iget v0, p1, Landroid/util/DisplayMetrics;->heightPixels:I */
} // .end method
public static Integer a ( java.lang.String p0 ) {
/* .locals 2 */
/* .prologue */
/* .line 174 */
try { // :try_start_0
java.lang.Integer .parseInt ( p0 );
/* :try_end_0 */
v0 = /* .catch Ljava/lang/NumberFormatException; {:try_start_0 ..:try_end_0} :catch_0 */
/* .line 181 */
} // :goto_0
/* .line 175 */
/* :catch_0 */
/* move-exception v0 */
/* .line 176 */
/* new-instance v0, Ljava/lang/StringBuilder; */
/* invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V */
final String v1 = "The Android SDK version couldn\'t be parsed to an int: "; // const-string v1, "The Android SDK version couldn\'t be parsed to an int: "
(( java.lang.StringBuilder ) v0 ).append ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
v1 = android.os.Build$VERSION.SDK;
(( java.lang.StringBuilder ) v0 ).append ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v0 ).toString ( ); // invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
com.google.ads.util.b .e ( v0 );
/* .line 178 */
final String v0 = "Defaulting to Android SDK version 3."; // const-string v0, "Defaulting to Android SDK version 3."
com.google.ads.util.b .e ( v0 );
/* .line 179 */
int v0 = 3; // const/4 v0, 0x3
} // .end method
public static android.util.DisplayMetrics a ( android.app.Activity p0 ) {
/* .locals 2 */
/* .prologue */
/* .line 628 */
(( android.app.Activity ) p0 ).getWindowManager ( ); // invoke-virtual {p0}, Landroid/app/Activity;->getWindowManager()Landroid/view/WindowManager;
/* if-nez v0, :cond_0 */
/* .line 629 */
int v0 = 0; // const/4 v0, 0x0
/* .line 634 */
} // :goto_0
/* .line 632 */
} // :cond_0
/* new-instance v0, Landroid/util/DisplayMetrics; */
/* invoke-direct {v0}, Landroid/util/DisplayMetrics;-><init>()V */
/* .line 633 */
(( android.app.Activity ) p0 ).getWindowManager ( ); // invoke-virtual {p0}, Landroid/app/Activity;->getWindowManager()Landroid/view/WindowManager;
(( android.view.Display ) v1 ).getMetrics ( v0 ); // invoke-virtual {v1, v0}, Landroid/view/Display;->getMetrics(Landroid/util/DisplayMetrics;)V
} // .end method
public static java.lang.String a ( android.content.Context p0 ) {
/* .locals 2 */
/* .prologue */
/* .line 192 */
v0 = com.google.ads.util.AdUtil.c;
/* if-nez v0, :cond_3 */
/* .line 193 */
(( android.content.Context ) p0 ).getContentResolver ( ); // invoke-virtual {p0}, Landroid/content/Context;->getContentResolver()Landroid/content/ContentResolver;
final String v1 = "android_id"; // const-string v1, "android_id"
android.provider.Settings$Secure .getString ( v0,v1 );
/* .line 197 */
if ( v0 != null) { // if-eqz v0, :cond_0
v1 = com.google.ads.util.AdUtil .c ( );
if ( v1 != null) { // if-eqz v1, :cond_1
/* .line 198 */
} // :cond_0
final String v0 = "emulator"; // const-string v0, "emulator"
com.google.ads.util.AdUtil .b ( v0 );
/* .line 203 */
} // :goto_0
/* if-nez v0, :cond_2 */
/* .line 204 */
int v0 = 0; // const/4 v0, 0x0
/* .line 210 */
} // :goto_1
/* .line 200 */
} // :cond_1
com.google.ads.util.AdUtil .b ( v0 );
/* .line 207 */
} // :cond_2
v1 = java.util.Locale.US;
(( java.lang.String ) v0 ).toUpperCase ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/String;->toUpperCase(Ljava/util/Locale;)Ljava/lang/String;
/* .line 210 */
} // :cond_3
v0 = com.google.ads.util.AdUtil.c;
} // .end method
public static java.lang.String a ( android.location.Location p0 ) {
/* .locals 3 */
/* .prologue */
/* .line 642 */
/* if-nez p0, :cond_0 */
/* .line 643 */
int v0 = 0; // const/4 v0, 0x0
/* .line 648 */
} // :goto_0
/* .line 646 */
} // :cond_0
com.google.ads.util.AdUtil .b ( p0 );
/* .line 647 */
com.google.ads.util.AdUtil .c ( v0 );
/* .line 648 */
/* new-instance v1, Ljava/lang/StringBuilder; */
/* invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V */
final String v2 = "e1+"; // const-string v2, "e1+"
(( java.lang.StringBuilder ) v1 ).append ( v2 ); // invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v1 ).append ( v0 ); // invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v0 ).toString ( ); // invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
} // .end method
public static java.lang.String a ( java.lang.Readable p0 ) {
/* .locals 4 */
/* .annotation system Ldalvik/annotation/Throws; */
/* value = { */
/* Ljava/io/IOException; */
/* } */
} // .end annotation
/* .prologue */
/* .line 158 */
/* new-instance v0, Ljava/lang/StringBuilder; */
/* invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V */
/* .line 159 */
/* const/16 v1, 0x800 */
java.nio.CharBuffer .allocate ( v1 );
/* .line 161 */
v2 = } // :goto_0
int v3 = -1; // const/4 v3, -0x1
/* if-eq v2, v3, :cond_0 */
/* .line 162 */
(( java.nio.CharBuffer ) v1 ).flip ( ); // invoke-virtual {v1}, Ljava/nio/CharBuffer;->flip()Ljava/nio/Buffer;
/* .line 163 */
int v3 = 0; // const/4 v3, 0x0
(( java.lang.StringBuilder ) v0 ).append ( v1, v3, v2 ); // invoke-virtual {v0, v1, v3, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/CharSequence;II)Ljava/lang/StringBuilder;
/* .line 165 */
} // :cond_0
(( java.lang.StringBuilder ) v0 ).toString ( ); // invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
} // .end method
public static java.lang.String a ( java.util.Map p0 ) {
/* .locals 3 */
/* .annotation system Ldalvik/annotation/Signature; */
/* value = { */
/* "(", */
/* "Ljava/util/Map", */
/* "<", */
/* "Ljava/lang/String;", */
/* "Ljava/lang/Object;", */
/* ">;)", */
/* "Ljava/lang/String;" */
/* } */
} // .end annotation
/* .prologue */
/* .line 840 */
/* .line 841 */
int v0 = 0; // const/4 v0, 0x0
/* .line 843 */
try { // :try_start_0
com.google.ads.util.AdUtil .b ( p0 );
/* .line 844 */
(( org.json.JSONObject ) v1 ).toString ( ); // invoke-virtual {v1}, Lorg/json/JSONObject;->toString()Ljava/lang/String;
/* :try_end_0 */
/* .catch Lorg/json/JSONException; {:try_start_0 ..:try_end_0} :catch_0 */
/* .line 849 */
} // :goto_0
/* .line 845 */
/* :catch_0 */
/* move-exception v1 */
/* .line 846 */
final String v2 = "JsonException in serialization: "; // const-string v2, "JsonException in serialization: "
com.google.ads.util.b .d ( v2,v1 );
} // .end method
public static org.json.JSONArray a ( java.util.Set p0 ) {
/* .locals 5 */
/* .annotation system Ldalvik/annotation/Signature; */
/* value = { */
/* "(", */
/* "Ljava/util/Set", */
/* "<", */
/* "Ljava/lang/Object;", */
/* ">;)", */
/* "Lorg/json/JSONArray;" */
/* } */
} // .end annotation
/* .annotation system Ldalvik/annotation/Throws; */
/* value = { */
/* Lorg/json/JSONException; */
/* } */
} // .end annotation
/* .prologue */
/* .line 892 */
/* new-instance v1, Lorg/json/JSONArray; */
/* invoke-direct {v1}, Lorg/json/JSONArray;-><init>()V */
/* .line 894 */
v0 = if ( p0 != null) { // if-eqz p0, :cond_0
if ( v0 != null) { // if-eqz v0, :cond_1
} // :cond_0
/* move-object v0, v1 */
/* .line 924 */
} // :goto_0
/* .line 898 */
} // :cond_1
v0 = } // :goto_1
if ( v0 != null) { // if-eqz v0, :cond_6
/* .line 899 */
/* instance-of v3, v0, Ljava/lang/String; */
/* if-nez v3, :cond_2 */
/* instance-of v3, v0, Ljava/lang/Integer; */
/* if-nez v3, :cond_2 */
/* instance-of v3, v0, Ljava/lang/Double; */
/* if-nez v3, :cond_2 */
/* instance-of v3, v0, Ljava/lang/Long; */
/* if-nez v3, :cond_2 */
/* instance-of v3, v0, Ljava/lang/Float; */
if ( v3 != null) { // if-eqz v3, :cond_3
/* .line 904 */
} // :cond_2
(( org.json.JSONArray ) v1 ).put ( v0 ); // invoke-virtual {v1, v0}, Lorg/json/JSONArray;->put(Ljava/lang/Object;)Lorg/json/JSONArray;
/* .line 905 */
} // :cond_3
/* instance-of v3, v0, Ljava/util/Map; */
if ( v3 != null) { // if-eqz v3, :cond_4
/* .line 907 */
try { // :try_start_0
/* check-cast v0, Ljava/util/Map; */
/* .line 908 */
com.google.ads.util.AdUtil .b ( v0 );
(( org.json.JSONArray ) v1 ).put ( v0 ); // invoke-virtual {v1, v0}, Lorg/json/JSONArray;->put(Ljava/lang/Object;)Lorg/json/JSONArray;
/* :try_end_0 */
/* .catch Ljava/lang/ClassCastException; {:try_start_0 ..:try_end_0} :catch_0 */
/* .line 909 */
/* :catch_0 */
/* move-exception v0 */
/* .line 910 */
final String v3 = "Unknown map type in json serialization: "; // const-string v3, "Unknown map type in json serialization: "
com.google.ads.util.b .d ( v3,v0 );
/* .line 912 */
} // :cond_4
/* instance-of v3, v0, Ljava/util/Set; */
if ( v3 != null) { // if-eqz v3, :cond_5
/* .line 914 */
try { // :try_start_1
/* check-cast v0, Ljava/util/Set; */
/* .line 915 */
com.google.ads.util.AdUtil .a ( v0 );
(( org.json.JSONArray ) v1 ).put ( v0 ); // invoke-virtual {v1, v0}, Lorg/json/JSONArray;->put(Ljava/lang/Object;)Lorg/json/JSONArray;
/* :try_end_1 */
/* .catch Ljava/lang/ClassCastException; {:try_start_1 ..:try_end_1} :catch_1 */
/* .line 916 */
/* :catch_1 */
/* move-exception v0 */
/* .line 917 */
final String v3 = "Unknown map type in json serialization: "; // const-string v3, "Unknown map type in json serialization: "
com.google.ads.util.b .d ( v3,v0 );
/* .line 920 */
} // :cond_5
/* new-instance v3, Ljava/lang/StringBuilder; */
/* invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V */
final String v4 = "Unknown value in json serialization: "; // const-string v4, "Unknown value in json serialization: "
(( java.lang.StringBuilder ) v3 ).append ( v4 ); // invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v3 ).append ( v0 ); // invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v0 ).toString ( ); // invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
com.google.ads.util.b .e ( v0 );
} // :cond_6
/* move-object v0, v1 */
/* .line 924 */
} // .end method
public static void a ( android.webkit.WebView p0 ) {
/* .locals 2 */
/* .prologue */
/* .line 825 */
(( android.webkit.WebView ) p0 ).getContext ( ); // invoke-virtual {p0}, Landroid/webkit/WebView;->getContext()Landroid/content/Context;
(( android.content.Context ) v0 ).getApplicationContext ( ); // invoke-virtual {v0}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;
com.google.ads.util.AdUtil .i ( v0 );
/* .line 827 */
(( android.webkit.WebView ) p0 ).getSettings ( ); // invoke-virtual {p0}, Landroid/webkit/WebView;->getSettings()Landroid/webkit/WebSettings;
(( android.webkit.WebSettings ) v1 ).setUserAgentString ( v0 ); // invoke-virtual {v1, v0}, Landroid/webkit/WebSettings;->setUserAgentString(Ljava/lang/String;)V
/* .line 828 */
return;
} // .end method
public static void a ( java.net.HttpURLConnection p0, android.content.Context p1 ) {
/* .locals 2 */
/* .prologue */
/* .line 836 */
final String v0 = "User-Agent"; // const-string v0, "User-Agent"
com.google.ads.util.AdUtil .i ( p1 );
(( java.net.HttpURLConnection ) p0 ).setRequestProperty ( v0, v1 ); // invoke-virtual {p0, v0, v1}, Ljava/net/HttpURLConnection;->setRequestProperty(Ljava/lang/String;Ljava/lang/String;)V
/* .line 837 */
return;
} // .end method
public static void a ( Boolean p0 ) {
/* .locals 0 */
/* .prologue */
/* .line 721 */
com.google.ads.util.AdUtil.g = (p0!= 0);
/* .line 722 */
return;
} // .end method
public static Boolean a ( Integer p0, Integer p1, java.lang.String p2 ) {
/* .locals 2 */
/* .prologue */
/* .line 310 */
/* and-int v0, p0, p1 */
/* if-nez v0, :cond_0 */
/* .line 311 */
/* new-instance v0, Ljava/lang/StringBuilder; */
/* invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V */
final String v1 = "The android:configChanges value of the com.google.ads.AdActivity must include "; // const-string v1, "The android:configChanges value of the com.google.ads.AdActivity must include "
(( java.lang.StringBuilder ) v0 ).append ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v0 ).append ( p2 ); // invoke-virtual {v0, p2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
final String v1 = "."; // const-string v1, "."
(( java.lang.StringBuilder ) v0 ).append ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v0 ).toString ( ); // invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
com.google.ads.util.b .b ( v0 );
/* .line 313 */
int v0 = 0; // const/4 v0, 0x0
/* .line 316 */
} // :goto_0
} // :cond_0
int v0 = 1; // const/4 v0, 0x1
} // .end method
public static Boolean a ( android.content.Intent p0, android.content.Context p1 ) {
/* .locals 2 */
/* .prologue */
/* .line 146 */
(( android.content.Context ) p1 ).getPackageManager ( ); // invoke-virtual {p1}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;
/* const/high16 v1, 0x10000 */
(( android.content.pm.PackageManager ) v0 ).resolveActivity ( p0, v1 ); // invoke-virtual {v0, p0, v1}, Landroid/content/pm/PackageManager;->resolveActivity(Landroid/content/Intent;I)Landroid/content/pm/ResolveInfo;
/* .line 148 */
if ( v0 != null) { // if-eqz v0, :cond_0
int v0 = 1; // const/4 v0, 0x1
} // :goto_0
} // :cond_0
int v0 = 0; // const/4 v0, 0x0
} // .end method
public static Boolean a ( android.net.Uri p0 ) {
/* .locals 3 */
/* .prologue */
int v0 = 0; // const/4 v0, 0x0
/* .line 429 */
/* if-nez p0, :cond_1 */
/* .line 433 */
} // :cond_0
} // :goto_0
/* .line 432 */
} // :cond_1
(( android.net.Uri ) p0 ).getScheme ( ); // invoke-virtual {p0}, Landroid/net/Uri;->getScheme()Ljava/lang/String;
/* .line 433 */
final String v2 = "http"; // const-string v2, "http"
v2 = (( java.lang.String ) v2 ).equalsIgnoreCase ( v1 ); // invoke-virtual {v2, v1}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z
/* if-nez v2, :cond_2 */
final String v2 = "https"; // const-string v2, "https"
v1 = (( java.lang.String ) v2 ).equalsIgnoreCase ( v1 ); // invoke-virtual {v2, v1}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z
if ( v1 != null) { // if-eqz v1, :cond_0
} // :cond_2
int v0 = 1; // const/4 v0, 0x1
} // .end method
static Boolean a ( Object p0 ) {
/* .locals 1 */
/* .prologue */
/* .line 415 */
/* if-nez p0, :cond_0 */
/* .line 416 */
p0 = com.google.ads.util.d.d;
/* .line 418 */
} // :cond_0
v0 = com.google.ads.util.d.e;
v0 = (( com.google.ads.util.d ) p0 ).equals ( v0 ); // invoke-virtual {p0, v0}, Lcom/google/ads/util/d;->equals(Ljava/lang/Object;)Z
} // .end method
public static Integer b ( ) {
/* .locals 2 */
/* .prologue */
/* .line 236 */
/* const/16 v1, 0x9 */
/* if-lt v0, v1, :cond_0 */
/* .line 237 */
int v0 = 7; // const/4 v0, 0x7
/* .line 239 */
} // :goto_0
} // :cond_0
int v0 = 1; // const/4 v0, 0x1
} // .end method
public static Integer b ( android.content.Context p0, android.util.DisplayMetrics p1 ) {
/* .locals 2 */
/* .prologue */
/* .line 268 */
int v1 = 4; // const/4 v1, 0x4
/* if-lt v0, v1, :cond_0 */
/* .line 269 */
v0 = com.google.ads.util.e .b ( p0,p1 );
/* .line 271 */
} // :goto_0
} // :cond_0
/* iget v0, p1, Landroid/util/DisplayMetrics;->widthPixels:I */
} // .end method
private static java.lang.String b ( android.location.Location p0 ) {
/* .locals 10 */
/* .prologue */
/* const-wide v8, 0x416312d000000000L # 1.0E7 */
/* .line 652 */
v0 = java.util.Locale.US;
final String v1 = "role: 6 producer: 24 historical_role: 1 historical_producer: 12 timestamp: %d latlng < latitude_e7: %d longitude_e7: %d> radius: %d"; // const-string v1, "role: 6 producer: 24 historical_role: 1 historical_producer: 12 timestamp: %d latlng < latitude_e7: %d longitude_e7: %d> radius: %d"
int v2 = 4; // const/4 v2, 0x4
/* new-array v2, v2, [Ljava/lang/Object; */
int v3 = 0; // const/4 v3, 0x0
(( android.location.Location ) p0 ).getTime ( ); // invoke-virtual {p0}, Landroid/location/Location;->getTime()J
/* move-result-wide v4 */
/* const-wide/16 v6, 0x3e8 */
/* mul-long/2addr v4, v6 */
java.lang.Long .valueOf ( v4,v5 );
/* aput-object v4, v2, v3 */
int v3 = 1; // const/4 v3, 0x1
(( android.location.Location ) p0 ).getLatitude ( ); // invoke-virtual {p0}, Landroid/location/Location;->getLatitude()D
/* move-result-wide v4 */
/* mul-double/2addr v4, v8 */
/* double-to-long v4, v4 */
java.lang.Long .valueOf ( v4,v5 );
/* aput-object v4, v2, v3 */
int v3 = 2; // const/4 v3, 0x2
(( android.location.Location ) p0 ).getLongitude ( ); // invoke-virtual {p0}, Landroid/location/Location;->getLongitude()D
/* move-result-wide v4 */
/* mul-double/2addr v4, v8 */
/* double-to-long v4, v4 */
java.lang.Long .valueOf ( v4,v5 );
/* aput-object v4, v2, v3 */
int v3 = 3; // const/4 v3, 0x3
v4 = (( android.location.Location ) p0 ).getAccuracy ( ); // invoke-virtual {p0}, Landroid/location/Location;->getAccuracy()F
/* const/high16 v5, 0x447a0000 # 1000.0f */
/* mul-float/2addr v4, v5 */
/* float-to-long v4, v4 */
java.lang.Long .valueOf ( v4,v5 );
/* aput-object v4, v2, v3 */
java.lang.String .format ( v0,v1,v2 );
} // .end method
public static java.lang.String b ( java.lang.String p0 ) {
/* .locals 8 */
/* .prologue */
int v7 = 0; // const/4 v7, 0x0
/* .line 445 */
int v0 = 0; // const/4 v0, 0x0
/* .line 447 */
if ( p0 != null) { // if-eqz p0, :cond_0
v1 = (( java.lang.String ) p0 ).length ( ); // invoke-virtual {p0}, Ljava/lang/String;->length()I
/* if-lez v1, :cond_0 */
/* .line 449 */
try { // :try_start_0
final String v0 = "MD5"; // const-string v0, "MD5"
java.security.MessageDigest .getInstance ( v0 );
/* .line 450 */
(( java.lang.String ) p0 ).getBytes ( ); // invoke-virtual {p0}, Ljava/lang/String;->getBytes()[B
int v2 = 0; // const/4 v2, 0x0
v3 = (( java.lang.String ) p0 ).length ( ); // invoke-virtual {p0}, Ljava/lang/String;->length()I
(( java.security.MessageDigest ) v0 ).update ( v1, v2, v3 ); // invoke-virtual {v0, v1, v2, v3}, Ljava/security/MessageDigest;->update([BII)V
/* .line 451 */
v1 = java.util.Locale.US;
final String v2 = "%032X"; // const-string v2, "%032X"
int v3 = 1; // const/4 v3, 0x1
/* new-array v3, v3, [Ljava/lang/Object; */
int v4 = 0; // const/4 v4, 0x0
/* new-instance v5, Ljava/math/BigInteger; */
int v6 = 1; // const/4 v6, 0x1
(( java.security.MessageDigest ) v0 ).digest ( ); // invoke-virtual {v0}, Ljava/security/MessageDigest;->digest()[B
/* invoke-direct {v5, v6, v0}, Ljava/math/BigInteger;-><init>(I[B)V */
/* aput-object v5, v3, v4 */
java.lang.String .format ( v1,v2,v3 );
/* :try_end_0 */
/* .catch Ljava/security/NoSuchAlgorithmException; {:try_start_0 ..:try_end_0} :catch_0 */
/* .line 457 */
} // :cond_0
} // :goto_0
/* .line 452 */
/* :catch_0 */
/* move-exception v0 */
/* .line 453 */
/* const/16 v0, 0x20 */
(( java.lang.String ) p0 ).substring ( v7, v0 ); // invoke-virtual {p0, v7, v0}, Ljava/lang/String;->substring(II)Ljava/lang/String;
} // .end method
public static java.util.HashMap b ( android.net.Uri p0 ) {
/* .locals 10 */
/* .annotation system Ldalvik/annotation/Signature; */
/* value = { */
/* "(", */
/* "Landroid/net/Uri;", */
/* ")", */
/* "Ljava/util/HashMap", */
/* "<", */
/* "Ljava/lang/String;", */
/* "Ljava/lang/String;", */
/* ">;" */
/* } */
} // .end annotation
/* .prologue */
int v0 = 0; // const/4 v0, 0x0
int v3 = 0; // const/4 v3, 0x0
/* .line 688 */
/* if-nez p0, :cond_0 */
/* .line 707 */
} // :goto_0
/* .line 692 */
} // :cond_0
/* new-instance v1, Ljava/util/HashMap; */
/* invoke-direct {v1}, Ljava/util/HashMap;-><init>()V */
/* .line 693 */
(( android.net.Uri ) p0 ).getEncodedQuery ( ); // invoke-virtual {p0}, Landroid/net/Uri;->getEncodedQuery()Ljava/lang/String;
/* .line 695 */
if ( v2 != null) { // if-eqz v2, :cond_2
/* .line 696 */
final String v4 = "&"; // const-string v4, "&"
(( java.lang.String ) v2 ).split ( v4 ); // invoke-virtual {v2, v4}, Ljava/lang/String;->split(Ljava/lang/String;)[Ljava/lang/String;
/* array-length v5, v4 */
/* move v2, v3 */
} // :goto_1
/* if-ge v2, v5, :cond_2 */
/* aget-object v6, v4, v2 */
/* .line 697 */
final String v7 = "="; // const-string v7, "="
v7 = (( java.lang.String ) v6 ).indexOf ( v7 ); // invoke-virtual {v6, v7}, Ljava/lang/String;->indexOf(Ljava/lang/String;)I
/* .line 698 */
/* if-gez v7, :cond_1 */
/* .line 699 */
android.net.Uri .decode ( v6 );
(( java.util.HashMap ) v1 ).put ( v6, v0 ); // invoke-virtual {v1, v6, v0}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
/* .line 696 */
} // :goto_2
/* add-int/lit8 v2, v2, 0x1 */
/* .line 701 */
} // :cond_1
(( java.lang.String ) v6 ).substring ( v3, v7 ); // invoke-virtual {v6, v3, v7}, Ljava/lang/String;->substring(II)Ljava/lang/String;
android.net.Uri .decode ( v8 );
/* .line 702 */
/* add-int/lit8 v7, v7, 0x1 */
v9 = (( java.lang.String ) v6 ).length ( ); // invoke-virtual {v6}, Ljava/lang/String;->length()I
(( java.lang.String ) v6 ).substring ( v7, v9 ); // invoke-virtual {v6, v7, v9}, Ljava/lang/String;->substring(II)Ljava/lang/String;
android.net.Uri .decode ( v6 );
(( java.util.HashMap ) v1 ).put ( v8, v6 ); // invoke-virtual {v1, v8, v6}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
} // :cond_2
/* move-object v0, v1 */
/* .line 707 */
} // .end method
public static org.json.JSONObject b ( java.util.Map p0 ) {
/* .locals 5 */
/* .annotation system Ldalvik/annotation/Signature; */
/* value = { */
/* "(", */
/* "Ljava/util/Map", */
/* "<", */
/* "Ljava/lang/String;", */
/* "Ljava/lang/Object;", */
/* ">;)", */
/* "Lorg/json/JSONObject;" */
/* } */
} // .end annotation
/* .annotation system Ldalvik/annotation/Throws; */
/* value = { */
/* Lorg/json/JSONException; */
/* } */
} // .end annotation
/* .prologue */
/* .line 854 */
/* new-instance v2, Lorg/json/JSONObject; */
/* invoke-direct {v2}, Lorg/json/JSONObject;-><init>()V */
/* .line 856 */
v0 = if ( p0 != null) { // if-eqz p0, :cond_0
if ( v0 != null) { // if-eqz v0, :cond_1
} // :cond_0
/* move-object v0, v2 */
/* .line 887 */
} // :goto_0
/* .line 860 */
} // :cond_1
v0 = } // :goto_1
if ( v0 != null) { // if-eqz v0, :cond_6
/* check-cast v0, Ljava/lang/String; */
/* .line 861 */
/* .line 862 */
/* instance-of v4, v1, Ljava/lang/String; */
/* if-nez v4, :cond_2 */
/* instance-of v4, v1, Ljava/lang/Integer; */
/* if-nez v4, :cond_2 */
/* instance-of v4, v1, Ljava/lang/Double; */
/* if-nez v4, :cond_2 */
/* instance-of v4, v1, Ljava/lang/Long; */
/* if-nez v4, :cond_2 */
/* instance-of v4, v1, Ljava/lang/Float; */
if ( v4 != null) { // if-eqz v4, :cond_3
/* .line 867 */
} // :cond_2
(( org.json.JSONObject ) v2 ).put ( v0, v1 ); // invoke-virtual {v2, v0, v1}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;
/* .line 868 */
} // :cond_3
/* instance-of v4, v1, Ljava/util/Map; */
if ( v4 != null) { // if-eqz v4, :cond_4
/* .line 870 */
try { // :try_start_0
/* check-cast v1, Ljava/util/Map; */
/* .line 871 */
com.google.ads.util.AdUtil .b ( v1 );
(( org.json.JSONObject ) v2 ).put ( v0, v1 ); // invoke-virtual {v2, v0, v1}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;
/* :try_end_0 */
/* .catch Ljava/lang/ClassCastException; {:try_start_0 ..:try_end_0} :catch_0 */
/* .line 872 */
/* :catch_0 */
/* move-exception v0 */
/* .line 873 */
final String v1 = "Unknown map type in json serialization: "; // const-string v1, "Unknown map type in json serialization: "
com.google.ads.util.b .d ( v1,v0 );
/* .line 875 */
} // :cond_4
/* instance-of v4, v1, Ljava/util/Set; */
if ( v4 != null) { // if-eqz v4, :cond_5
/* .line 877 */
try { // :try_start_1
/* check-cast v1, Ljava/util/Set; */
/* .line 878 */
com.google.ads.util.AdUtil .a ( v1 );
(( org.json.JSONObject ) v2 ).put ( v0, v1 ); // invoke-virtual {v2, v0, v1}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;
/* :try_end_1 */
/* .catch Ljava/lang/ClassCastException; {:try_start_1 ..:try_end_1} :catch_1 */
/* .line 879 */
/* :catch_1 */
/* move-exception v0 */
/* .line 880 */
final String v1 = "Unknown map type in json serialization: "; // const-string v1, "Unknown map type in json serialization: "
com.google.ads.util.b .d ( v1,v0 );
/* .line 883 */
} // :cond_5
/* new-instance v0, Ljava/lang/StringBuilder; */
/* invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V */
final String v4 = "Unknown value in json serialization: "; // const-string v4, "Unknown value in json serialization: "
(( java.lang.StringBuilder ) v0 ).append ( v4 ); // invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v0 ).append ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v0 ).toString ( ); // invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
com.google.ads.util.b .e ( v0 );
} // :cond_6
/* move-object v0, v2 */
/* .line 887 */
} // .end method
public static Boolean b ( android.content.Context p0 ) {
/* .locals 5 */
/* .prologue */
int v0 = 0; // const/4 v0, 0x0
int v4 = -1; // const/4 v4, -0x1
/* .line 284 */
(( android.content.Context ) p0 ).getPackageManager ( ); // invoke-virtual {p0}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;
/* .line 285 */
(( android.content.Context ) p0 ).getPackageName ( ); // invoke-virtual {p0}, Landroid/content/Context;->getPackageName()Ljava/lang/String;
/* .line 286 */
final String v3 = "android.permission.INTERNET"; // const-string v3, "android.permission.INTERNET"
v3 = (( android.content.pm.PackageManager ) v1 ).checkPermission ( v3, v2 ); // invoke-virtual {v1, v3, v2}, Landroid/content/pm/PackageManager;->checkPermission(Ljava/lang/String;Ljava/lang/String;)I
/* if-ne v3, v4, :cond_0 */
/* .line 288 */
final String v1 = "INTERNET permissions must be enabled in AndroidManifest.xml."; // const-string v1, "INTERNET permissions must be enabled in AndroidManifest.xml."
com.google.ads.util.b .b ( v1 );
/* .line 296 */
} // :goto_0
/* .line 290 */
} // :cond_0
final String v3 = "android.permission.ACCESS_NETWORK_STATE"; // const-string v3, "android.permission.ACCESS_NETWORK_STATE"
v1 = (( android.content.pm.PackageManager ) v1 ).checkPermission ( v3, v2 ); // invoke-virtual {v1, v3, v2}, Landroid/content/pm/PackageManager;->checkPermission(Ljava/lang/String;Ljava/lang/String;)I
/* if-ne v1, v4, :cond_1 */
/* .line 292 */
final String v1 = "ACCESS_NETWORK_STATE permissions must be enabled in AndroidManifest.xml."; // const-string v1, "ACCESS_NETWORK_STATE permissions must be enabled in AndroidManifest.xml."
com.google.ads.util.b .b ( v1 );
/* .line 296 */
} // :cond_1
int v0 = 1; // const/4 v0, 0x1
} // .end method
private static java.lang.String c ( java.lang.String p0 ) {
/* .locals 6 */
/* .prologue */
/* .line 661 */
try { // :try_start_0
final String v0 = "AES/CBC/PKCS5Padding"; // const-string v0, "AES/CBC/PKCS5Padding"
javax.crypto.Cipher .getInstance ( v0 );
/* .line 662 */
int v1 = 1; // const/4 v1, 0x1
/* new-instance v2, Ljavax/crypto/spec/SecretKeySpec; */
/* const/16 v3, 0x10 */
/* new-array v3, v3, [B */
/* fill-array-data v3, :array_0 */
final String v4 = "AES"; // const-string v4, "AES"
/* invoke-direct {v2, v3, v4}, Ljavax/crypto/spec/SecretKeySpec;-><init>([BLjava/lang/String;)V */
(( javax.crypto.Cipher ) v0 ).init ( v1, v2 ); // invoke-virtual {v0, v1, v2}, Ljavax/crypto/Cipher;->init(ILjava/security/Key;)V
/* .line 665 */
(( javax.crypto.Cipher ) v0 ).getIV ( ); // invoke-virtual {v0}, Ljavax/crypto/Cipher;->getIV()[B
/* .line 666 */
(( java.lang.String ) p0 ).getBytes ( ); // invoke-virtual {p0}, Ljava/lang/String;->getBytes()[B
(( javax.crypto.Cipher ) v0 ).doFinal ( v2 ); // invoke-virtual {v0, v2}, Ljavax/crypto/Cipher;->doFinal([B)[B
/* .line 667 */
/* array-length v2, v1 */
/* array-length v3, v0 */
/* add-int/2addr v2, v3 */
/* new-array v2, v2, [B */
/* .line 668 */
int v3 = 0; // const/4 v3, 0x0
int v4 = 0; // const/4 v4, 0x0
/* array-length v5, v1 */
java.lang.System .arraycopy ( v1,v3,v2,v4,v5 );
/* .line 669 */
int v3 = 0; // const/4 v3, 0x0
/* array-length v1, v1 */
/* array-length v4, v0 */
java.lang.System .arraycopy ( v0,v3,v2,v1,v4 );
/* .line 670 */
/* const/16 v0, 0xb */
com.google.ads.util.c .b ( v2,v0 );
/* :try_end_0 */
/* .catch Ljava/security/GeneralSecurityException; {:try_start_0 ..:try_end_0} :catch_0 */
/* .line 672 */
} // :goto_0
/* .line 671 */
/* :catch_0 */
/* move-exception v0 */
/* .line 672 */
int v0 = 0; // const/4 v0, 0x0
/* .line 662 */
/* nop */
/* :array_0 */
/* .array-data 1 */
/* 0xat */
/* 0x37t */
/* -0x70t */
/* -0x2ft */
/* -0x6t */
/* 0x7t */
/* 0xbt */
/* 0x4bt */
/* -0x7t */
/* -0x79t */
/* 0x79t */
/* 0x45t */
/* 0x50t */
/* -0x3dt */
/* 0xft */
/* 0x5t */
} // .end array-data
} // .end method
public static Boolean c ( ) {
/* .locals 1 */
/* .prologue */
/* .line 406 */
int v0 = 0; // const/4 v0, 0x0
v0 = com.google.ads.util.AdUtil .a ( v0 );
} // .end method
public static Boolean c ( android.content.Context p0 ) {
/* .locals 5 */
/* .prologue */
int v4 = 0; // const/4 v4, 0x0
/* .line 330 */
v0 = com.google.ads.util.AdUtil.b;
if ( v0 != null) { // if-eqz v0, :cond_0
/* .line 331 */
v0 = com.google.ads.util.AdUtil.b;
v0 = (( java.lang.Boolean ) v0 ).booleanValue ( ); // invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z
/* .line 397 */
} // :goto_0
/* .line 335 */
} // :cond_0
(( android.content.Context ) p0 ).getPackageManager ( ); // invoke-virtual {p0}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;
/* .line 336 */
/* new-instance v1, Landroid/content/Intent; */
/* const-class v2, Lcom/google/ads/AdActivity; */
/* invoke-direct {v1, p0, v2}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V */
/* .line 337 */
/* const/high16 v2, 0x10000 */
(( android.content.pm.PackageManager ) v0 ).resolveActivity ( v1, v2 ); // invoke-virtual {v0, v1, v2}, Landroid/content/pm/PackageManager;->resolveActivity(Landroid/content/Intent;I)Landroid/content/pm/ResolveInfo;
/* .line 341 */
int v1 = 1; // const/4 v1, 0x1
java.lang.Boolean .valueOf ( v1 );
/* .line 342 */
if ( v0 != null) { // if-eqz v0, :cond_1
v1 = this.activityInfo;
/* if-nez v1, :cond_3 */
/* .line 343 */
} // :cond_1
final String v0 = "Could not find com.google.ads.AdActivity, please make sure it is registered in AndroidManifest.xml."; // const-string v0, "Could not find com.google.ads.AdActivity, please make sure it is registered in AndroidManifest.xml."
com.google.ads.util.b .b ( v0 );
/* .line 345 */
java.lang.Boolean .valueOf ( v4 );
/* .line 397 */
} // :cond_2
} // :goto_1
v0 = com.google.ads.util.AdUtil.b;
v0 = (( java.lang.Boolean ) v0 ).booleanValue ( ); // invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z
/* .line 349 */
} // :cond_3
v1 = this.activityInfo;
/* iget v1, v1, Landroid/content/pm/ActivityInfo;->configChanges:I */
/* const/16 v2, 0x10 */
final String v3 = "keyboard"; // const-string v3, "keyboard"
v1 = com.google.ads.util.AdUtil .a ( v1,v2,v3 );
/* if-nez v1, :cond_4 */
/* .line 352 */
java.lang.Boolean .valueOf ( v4 );
/* .line 356 */
} // :cond_4
v1 = this.activityInfo;
/* iget v1, v1, Landroid/content/pm/ActivityInfo;->configChanges:I */
/* const/16 v2, 0x20 */
final String v3 = "keyboardHidden"; // const-string v3, "keyboardHidden"
v1 = com.google.ads.util.AdUtil .a ( v1,v2,v3 );
/* if-nez v1, :cond_5 */
/* .line 359 */
java.lang.Boolean .valueOf ( v4 );
/* .line 363 */
} // :cond_5
v1 = this.activityInfo;
/* iget v1, v1, Landroid/content/pm/ActivityInfo;->configChanges:I */
/* const/16 v2, 0x80 */
final String v3 = "orientation"; // const-string v3, "orientation"
v1 = com.google.ads.util.AdUtil .a ( v1,v2,v3 );
/* if-nez v1, :cond_6 */
/* .line 366 */
java.lang.Boolean .valueOf ( v4 );
/* .line 370 */
} // :cond_6
v1 = this.activityInfo;
/* iget v1, v1, Landroid/content/pm/ActivityInfo;->configChanges:I */
/* const/16 v2, 0x100 */
final String v3 = "screenLayout"; // const-string v3, "screenLayout"
v1 = com.google.ads.util.AdUtil .a ( v1,v2,v3 );
/* if-nez v1, :cond_7 */
/* .line 373 */
java.lang.Boolean .valueOf ( v4 );
/* .line 377 */
} // :cond_7
v1 = this.activityInfo;
/* iget v1, v1, Landroid/content/pm/ActivityInfo;->configChanges:I */
/* const/16 v2, 0x200 */
final String v3 = "uiMode"; // const-string v3, "uiMode"
v1 = com.google.ads.util.AdUtil .a ( v1,v2,v3 );
/* if-nez v1, :cond_8 */
/* .line 380 */
java.lang.Boolean .valueOf ( v4 );
/* .line 384 */
} // :cond_8
v1 = this.activityInfo;
/* iget v1, v1, Landroid/content/pm/ActivityInfo;->configChanges:I */
/* const/16 v2, 0x400 */
final String v3 = "screenSize"; // const-string v3, "screenSize"
v1 = com.google.ads.util.AdUtil .a ( v1,v2,v3 );
/* if-nez v1, :cond_9 */
/* .line 387 */
java.lang.Boolean .valueOf ( v4 );
/* .line 390 */
} // :cond_9
v0 = this.activityInfo;
/* iget v0, v0, Landroid/content/pm/ActivityInfo;->configChanges:I */
/* const/16 v1, 0x800 */
final String v2 = "smallestScreenSize"; // const-string v2, "smallestScreenSize"
v0 = com.google.ads.util.AdUtil .a ( v0,v1,v2 );
/* if-nez v0, :cond_2 */
/* .line 393 */
java.lang.Boolean .valueOf ( v4 );
/* goto/16 :goto_1 */
} // .end method
public static java.lang.String d ( android.content.Context p0 ) {
/* .locals 1 */
/* .prologue */
/* .line 471 */
final String v0 = "connectivity"; // const-string v0, "connectivity"
(( android.content.Context ) p0 ).getSystemService ( v0 ); // invoke-virtual {p0, v0}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;
/* check-cast v0, Landroid/net/ConnectivityManager; */
/* .line 473 */
(( android.net.ConnectivityManager ) v0 ).getActiveNetworkInfo ( ); // invoke-virtual {v0}, Landroid/net/ConnectivityManager;->getActiveNetworkInfo()Landroid/net/NetworkInfo;
/* .line 474 */
/* if-nez v0, :cond_0 */
/* .line 475 */
int v0 = 0; // const/4 v0, 0x0
/* .line 491 */
} // :goto_0
/* .line 479 */
} // :cond_0
v0 = (( android.net.NetworkInfo ) v0 ).getType ( ); // invoke-virtual {v0}, Landroid/net/NetworkInfo;->getType()I
/* packed-switch v0, :pswitch_data_0 */
/* .line 487 */
final String v0 = "unknown"; // const-string v0, "unknown"
/* .line 481 */
/* :pswitch_0 */
final String v0 = "ed"; // const-string v0, "ed"
/* .line 484 */
/* :pswitch_1 */
final String v0 = "wi"; // const-string v0, "wi"
/* .line 479 */
/* :pswitch_data_0 */
/* .packed-switch 0x0 */
/* :pswitch_0 */
/* :pswitch_1 */
} // .end packed-switch
} // .end method
public static Boolean d ( ) {
/* .locals 1 */
/* .prologue */
/* .line 714 */
/* sget-boolean v0, Lcom/google/ads/util/AdUtil;->g:Z */
} // .end method
public static java.lang.String e ( android.content.Context p0 ) {
/* .locals 6 */
/* .prologue */
/* const/high16 v5, 0x10000 */
/* .line 505 */
v0 = com.google.ads.util.AdUtil.d;
/* if-nez v0, :cond_8 */
/* .line 506 */
/* new-instance v0, Ljava/lang/StringBuilder; */
/* invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V */
/* .line 508 */
(( android.content.Context ) p0 ).getPackageManager ( ); // invoke-virtual {p0}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;
/* .line 510 */
/* new-instance v2, Landroid/content/Intent; */
final String v3 = "android.intent.action.VIEW"; // const-string v3, "android.intent.action.VIEW"
final String v4 = "geo:0,0?q=donuts"; // const-string v4, "geo:0,0?q=donuts"
android.net.Uri .parse ( v4 );
/* invoke-direct {v2, v3, v4}, Landroid/content/Intent;-><init>(Ljava/lang/String;Landroid/net/Uri;)V */
(( android.content.pm.PackageManager ) v1 ).queryIntentActivities ( v2, v5 ); // invoke-virtual {v1, v2, v5}, Landroid/content/pm/PackageManager;->queryIntentActivities(Landroid/content/Intent;I)Ljava/util/List;
/* .line 513 */
v2 = if ( v2 != null) { // if-eqz v2, :cond_0
/* if-nez v2, :cond_1 */
/* .line 514 */
} // :cond_0
final String v2 = "m"; // const-string v2, "m"
(( java.lang.StringBuilder ) v0 ).append ( v2 ); // invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
/* .line 517 */
} // :cond_1
/* new-instance v2, Landroid/content/Intent; */
final String v3 = "android.intent.action.VIEW"; // const-string v3, "android.intent.action.VIEW"
final String v4 = "market://search?q=pname:com.google"; // const-string v4, "market://search?q=pname:com.google"
android.net.Uri .parse ( v4 );
/* invoke-direct {v2, v3, v4}, Landroid/content/Intent;-><init>(Ljava/lang/String;Landroid/net/Uri;)V */
(( android.content.pm.PackageManager ) v1 ).queryIntentActivities ( v2, v5 ); // invoke-virtual {v1, v2, v5}, Landroid/content/pm/PackageManager;->queryIntentActivities(Landroid/content/Intent;I)Ljava/util/List;
/* .line 520 */
v2 = if ( v2 != null) { // if-eqz v2, :cond_2
/* if-nez v2, :cond_4 */
/* .line 521 */
} // :cond_2
v2 = (( java.lang.StringBuilder ) v0 ).length ( ); // invoke-virtual {v0}, Ljava/lang/StringBuilder;->length()I
/* if-lez v2, :cond_3 */
/* .line 522 */
final String v2 = ","; // const-string v2, ","
(( java.lang.StringBuilder ) v0 ).append ( v2 ); // invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
/* .line 524 */
} // :cond_3
final String v2 = "a"; // const-string v2, "a"
(( java.lang.StringBuilder ) v0 ).append ( v2 ); // invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
/* .line 527 */
} // :cond_4
/* new-instance v2, Landroid/content/Intent; */
final String v3 = "android.intent.action.VIEW"; // const-string v3, "android.intent.action.VIEW"
final String v4 = "tel://6509313940"; // const-string v4, "tel://6509313940"
android.net.Uri .parse ( v4 );
/* invoke-direct {v2, v3, v4}, Landroid/content/Intent;-><init>(Ljava/lang/String;Landroid/net/Uri;)V */
(( android.content.pm.PackageManager ) v1 ).queryIntentActivities ( v2, v5 ); // invoke-virtual {v1, v2, v5}, Landroid/content/pm/PackageManager;->queryIntentActivities(Landroid/content/Intent;I)Ljava/util/List;
/* .line 530 */
v1 = if ( v1 != null) { // if-eqz v1, :cond_5
/* if-nez v1, :cond_7 */
/* .line 531 */
} // :cond_5
v1 = (( java.lang.StringBuilder ) v0 ).length ( ); // invoke-virtual {v0}, Ljava/lang/StringBuilder;->length()I
/* if-lez v1, :cond_6 */
/* .line 532 */
final String v1 = ","; // const-string v1, ","
(( java.lang.StringBuilder ) v0 ).append ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
/* .line 534 */
} // :cond_6
final String v1 = "t"; // const-string v1, "t"
(( java.lang.StringBuilder ) v0 ).append ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
/* .line 537 */
} // :cond_7
(( java.lang.StringBuilder ) v0 ).toString ( ); // invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
/* .line 540 */
} // :cond_8
v0 = com.google.ads.util.AdUtil.d;
} // .end method
public static java.lang.String f ( android.content.Context p0 ) {
/* .locals 5 */
/* .prologue */
int v0 = 0; // const/4 v0, 0x0
/* .line 551 */
v1 = com.google.ads.util.AdUtil.e;
if ( v1 != null) { // if-eqz v1, :cond_1
/* .line 552 */
v0 = com.google.ads.util.AdUtil.e;
/* .line 581 */
} // :cond_0
} // :goto_0
/* .line 556 */
} // :cond_1
try { // :try_start_0
(( android.content.Context ) p0 ).getPackageManager ( ); // invoke-virtual {p0}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;
/* .line 557 */
/* new-instance v2, Landroid/content/Intent; */
final String v3 = "android.intent.action.VIEW"; // const-string v3, "android.intent.action.VIEW"
final String v4 = "market://details?id=com.google.ads"; // const-string v4, "market://details?id=com.google.ads"
android.net.Uri .parse ( v4 );
/* invoke-direct {v2, v3, v4}, Landroid/content/Intent;-><init>(Ljava/lang/String;Landroid/net/Uri;)V */
/* .line 560 */
/* const/high16 v3, 0x10000 */
(( android.content.pm.PackageManager ) v1 ).resolveActivity ( v2, v3 ); // invoke-virtual {v1, v2, v3}, Landroid/content/pm/PackageManager;->resolveActivity(Landroid/content/Intent;I)Landroid/content/pm/ResolveInfo;
/* .line 562 */
if ( v2 != null) { // if-eqz v2, :cond_0
/* .line 566 */
v2 = this.activityInfo;
/* .line 567 */
if ( v2 != null) { // if-eqz v2, :cond_0
/* .line 571 */
v3 = this.packageName;
int v4 = 0; // const/4 v4, 0x0
(( android.content.pm.PackageManager ) v1 ).getPackageInfo ( v3, v4 ); // invoke-virtual {v1, v3, v4}, Landroid/content/pm/PackageManager;->getPackageInfo(Ljava/lang/String;I)Landroid/content/pm/PackageInfo;
/* .line 572 */
if ( v1 != null) { // if-eqz v1, :cond_0
/* .line 577 */
/* new-instance v3, Ljava/lang/StringBuilder; */
/* invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V */
/* iget v1, v1, Landroid/content/pm/PackageInfo;->versionCode:I */
(( java.lang.StringBuilder ) v3 ).append ( v1 ); // invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;
final String v3 = "."; // const-string v3, "."
(( java.lang.StringBuilder ) v1 ).append ( v3 ); // invoke-virtual {v1, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
v2 = this.packageName;
(( java.lang.StringBuilder ) v1 ).append ( v2 ); // invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v1 ).toString ( ); // invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
/* .line 579 */
v0 = com.google.ads.util.AdUtil.e;
/* :try_end_0 */
/* .catch Landroid/content/pm/PackageManager$NameNotFoundException; {:try_start_0 ..:try_end_0} :catch_0 */
/* .line 580 */
/* :catch_0 */
/* move-exception v1 */
} // .end method
public static com.google.ads.util.AdUtil$a g ( android.content.Context p0 ) {
/* .locals 3 */
/* .prologue */
int v2 = 1; // const/4 v2, 0x1
/* .line 593 */
v0 = com.google.ads.util.AdUtil.f;
/* if-nez v0, :cond_0 */
/* .line 594 */
final String v0 = "audio"; // const-string v0, "audio"
(( android.content.Context ) p0 ).getSystemService ( v0 ); // invoke-virtual {p0, v0}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;
/* check-cast v0, Landroid/media/AudioManager; */
/* .line 598 */
} // :cond_0
v0 = com.google.ads.util.AdUtil$a.f;
/* .line 600 */
v0 = com.google.ads.util.AdUtil.f;
v0 = (( android.media.AudioManager ) v0 ).getMode ( ); // invoke-virtual {v0}, Landroid/media/AudioManager;->getMode()I
/* .line 601 */
v1 = com.google.ads.util.AdUtil .c ( );
if ( v1 != null) { // if-eqz v1, :cond_1
/* .line 602 */
v0 = com.google.ads.util.AdUtil$a.e;
/* .line 618 */
} // :goto_0
/* .line 603 */
} // :cond_1
v1 = com.google.ads.util.AdUtil.f;
v1 = (( android.media.AudioManager ) v1 ).isMusicActive ( ); // invoke-virtual {v1}, Landroid/media/AudioManager;->isMusicActive()Z
/* if-nez v1, :cond_2 */
v1 = com.google.ads.util.AdUtil.f;
v1 = (( android.media.AudioManager ) v1 ).isSpeakerphoneOn ( ); // invoke-virtual {v1}, Landroid/media/AudioManager;->isSpeakerphoneOn()Z
/* if-nez v1, :cond_2 */
int v1 = 2; // const/4 v1, 0x2
/* if-eq v0, v1, :cond_2 */
/* if-ne v0, v2, :cond_3 */
/* .line 607 */
} // :cond_2
v0 = com.google.ads.util.AdUtil$a.d;
/* .line 609 */
} // :cond_3
v0 = com.google.ads.util.AdUtil.f;
v0 = (( android.media.AudioManager ) v0 ).getRingerMode ( ); // invoke-virtual {v0}, Landroid/media/AudioManager;->getRingerMode()I
/* .line 611 */
if ( v0 != null) { // if-eqz v0, :cond_4
/* if-ne v0, v2, :cond_5 */
/* .line 613 */
} // :cond_4
v0 = com.google.ads.util.AdUtil$a.d;
/* .line 615 */
} // :cond_5
v0 = com.google.ads.util.AdUtil$a.b;
} // .end method
public static void h ( android.content.Context p0 ) {
/* .locals 2 */
/* .prologue */
/* .line 731 */
/* sget-boolean v0, Lcom/google/ads/util/AdUtil;->h:Z */
if ( v0 != null) { // if-eqz v0, :cond_0
/* .line 743 */
} // :goto_0
return;
/* .line 736 */
} // :cond_0
/* new-instance v0, Landroid/content/IntentFilter; */
/* invoke-direct {v0}, Landroid/content/IntentFilter;-><init>()V */
/* .line 737 */
final String v1 = "android.intent.action.USER_PRESENT"; // const-string v1, "android.intent.action.USER_PRESENT"
(( android.content.IntentFilter ) v0 ).addAction ( v1 ); // invoke-virtual {v0, v1}, Landroid/content/IntentFilter;->addAction(Ljava/lang/String;)V
/* .line 738 */
final String v1 = "android.intent.action.SCREEN_OFF"; // const-string v1, "android.intent.action.SCREEN_OFF"
(( android.content.IntentFilter ) v0 ).addAction ( v1 ); // invoke-virtual {v0, v1}, Landroid/content/IntentFilter;->addAction(Ljava/lang/String;)V
/* .line 740 */
/* new-instance v1, Lcom/google/ads/util/AdUtil$UserActivityReceiver; */
/* invoke-direct {v1}, Lcom/google/ads/util/AdUtil$UserActivityReceiver;-><init>()V */
(( android.content.Context ) p0 ).registerReceiver ( v1, v0 ); // invoke-virtual {p0, v1, v0}, Landroid/content/Context;->registerReceiver(Landroid/content/BroadcastReceiver;Landroid/content/IntentFilter;)Landroid/content/Intent;
/* .line 742 */
int v0 = 1; // const/4 v0, 0x1
com.google.ads.util.AdUtil.h = (v0!= 0);
} // .end method
public static java.lang.String i ( android.content.Context p0 ) {
/* .locals 6 */
/* .prologue */
/* .line 780 */
v0 = com.google.ads.util.AdUtil.i;
/* if-nez v0, :cond_4 */
/* .line 782 */
/* new-instance v0, Landroid/webkit/WebView; */
/* invoke-direct {v0, p0}, Landroid/webkit/WebView;-><init>(Landroid/content/Context;)V */
/* .line 783 */
(( android.webkit.WebView ) v0 ).getSettings ( ); // invoke-virtual {v0}, Landroid/webkit/WebView;->getSettings()Landroid/webkit/WebSettings;
(( android.webkit.WebSettings ) v0 ).getUserAgentString ( ); // invoke-virtual {v0}, Landroid/webkit/WebSettings;->getUserAgentString()Ljava/lang/String;
/* .line 785 */
if ( v0 != null) { // if-eqz v0, :cond_0
v1 = (( java.lang.String ) v0 ).length ( ); // invoke-virtual {v0}, Ljava/lang/String;->length()I
if ( v1 != null) { // if-eqz v1, :cond_0
final String v1 = "Java0"; // const-string v1, "Java0"
v1 = (( java.lang.String ) v0 ).equals ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
if ( v1 != null) { // if-eqz v1, :cond_3
/* .line 790 */
} // :cond_0
final String v0 = "os.name"; // const-string v0, "os.name"
final String v1 = "Linux"; // const-string v1, "Linux"
java.lang.System .getProperty ( v0,v1 );
/* .line 791 */
/* new-instance v0, Ljava/lang/StringBuilder; */
/* invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V */
final String v2 = "Android "; // const-string v2, "Android "
(( java.lang.StringBuilder ) v0 ).append ( v2 ); // invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
v2 = android.os.Build$VERSION.RELEASE;
(( java.lang.StringBuilder ) v0 ).append ( v2 ); // invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v0 ).toString ( ); // invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
/* .line 792 */
java.util.Locale .getDefault ( );
/* .line 793 */
(( java.util.Locale ) v3 ).getLanguage ( ); // invoke-virtual {v3}, Ljava/util/Locale;->getLanguage()Ljava/lang/String;
v4 = java.util.Locale.US;
(( java.lang.String ) v0 ).toLowerCase ( v4 ); // invoke-virtual {v0, v4}, Ljava/lang/String;->toLowerCase(Ljava/util/Locale;)Ljava/lang/String;
/* .line 794 */
v4 = (( java.lang.String ) v0 ).length ( ); // invoke-virtual {v0}, Ljava/lang/String;->length()I
/* if-nez v4, :cond_1 */
/* .line 796 */
final String v0 = "en"; // const-string v0, "en"
/* .line 798 */
} // :cond_1
(( java.util.Locale ) v3 ).getCountry ( ); // invoke-virtual {v3}, Ljava/util/Locale;->getCountry()Ljava/lang/String;
v4 = java.util.Locale.US;
(( java.lang.String ) v3 ).toLowerCase ( v4 ); // invoke-virtual {v3, v4}, Ljava/lang/String;->toLowerCase(Ljava/util/Locale;)Ljava/lang/String;
/* .line 800 */
v4 = (( java.lang.String ) v3 ).length ( ); // invoke-virtual {v3}, Ljava/lang/String;->length()I
/* if-lez v4, :cond_2 */
/* .line 801 */
/* new-instance v4, Ljava/lang/StringBuilder; */
/* invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V */
(( java.lang.StringBuilder ) v4 ).append ( v0 ); // invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
final String v4 = "-"; // const-string v4, "-"
(( java.lang.StringBuilder ) v0 ).append ( v4 ); // invoke-virtual {v0, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v0 ).append ( v3 ); // invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v0 ).toString ( ); // invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
/* .line 803 */
} // :cond_2
/* new-instance v3, Ljava/lang/StringBuilder; */
/* invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V */
v4 = android.os.Build.MODEL;
(( java.lang.StringBuilder ) v3 ).append ( v4 ); // invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
final String v4 = " Build/"; // const-string v4, " Build/"
(( java.lang.StringBuilder ) v3 ).append ( v4 ); // invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
v4 = android.os.Build.ID;
(( java.lang.StringBuilder ) v3 ).append ( v4 ); // invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v3 ).toString ( ); // invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
/* .line 805 */
/* new-instance v4, Ljava/lang/StringBuilder; */
/* invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V */
final String v5 = "Mozilla/5.0 ("; // const-string v5, "Mozilla/5.0 ("
(( java.lang.StringBuilder ) v4 ).append ( v5 ); // invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v4 ).append ( v1 ); // invoke-virtual {v4, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
final String v4 = "; U; "; // const-string v4, "; U; "
(( java.lang.StringBuilder ) v1 ).append ( v4 ); // invoke-virtual {v1, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v1 ).append ( v2 ); // invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
final String v2 = "; "; // const-string v2, "; "
(( java.lang.StringBuilder ) v1 ).append ( v2 ); // invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v1 ).append ( v0 ); // invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
final String v1 = "; "; // const-string v1, "; "
(( java.lang.StringBuilder ) v0 ).append ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v0 ).append ( v3 ); // invoke-virtual {v0, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
final String v1 = ") AppleWebKit/0.0 (KHTML, like "; // const-string v1, ") AppleWebKit/0.0 (KHTML, like "
(( java.lang.StringBuilder ) v0 ).append ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
final String v1 = "Gecko) Version/0.0 Mobile Safari/0.0"; // const-string v1, "Gecko) Version/0.0 Mobile Safari/0.0"
(( java.lang.StringBuilder ) v0 ).append ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v0 ).toString ( ); // invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
/* .line 813 */
} // :cond_3
/* new-instance v1, Ljava/lang/StringBuilder; */
/* invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V */
(( java.lang.StringBuilder ) v1 ).append ( v0 ); // invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
final String v1 = " (Mobile; "; // const-string v1, " (Mobile; "
(( java.lang.StringBuilder ) v0 ).append ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
final String v1 = "afma-sdk-a-v"; // const-string v1, "afma-sdk-a-v"
(( java.lang.StringBuilder ) v0 ).append ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
final String v1 = "6.0.1"; // const-string v1, "6.0.1"
(( java.lang.StringBuilder ) v0 ).append ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
final String v1 = ")"; // const-string v1, ")"
(( java.lang.StringBuilder ) v0 ).append ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v0 ).toString ( ); // invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
/* .line 817 */
} // :cond_4
v0 = com.google.ads.util.AdUtil.i;
} // .end method
