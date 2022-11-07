public class com.jumptap.adtag.utils.JtAdManager {
	 /* .source "JtAdManager.java" */
	 /* # static fields */
	 private static final java.lang.String CHAR_SET;
	 private static final java.lang.String CONNECTION_TYPE_EDGE;
	 private static final java.lang.String CONNECTION_TYPE_WIFI;
	 private static final java.lang.String CONNECTION_TYPE__3G;
	 public static final java.lang.String JT_AD;
	 public static final java.lang.String JT_NAMRSPACE;
	 private static final Integer NETWORK_TYPE_CDMA;
	 private static final Integer NETWORK_TYPE_EVDO_0;
	 private static final Integer NETWORK_TYPE_EVDO_A;
	 private static final Integer NETWORK_TYPE_HSDPA;
	 private static final Integer NETWORK_TYPE_HSPA;
	 private static final Integer NETWORK_TYPE_HSUPA;
	 private static final Integer NETWORK_TYPE_IDEN;
	 private static final Integer NETWORK_TYPE_RRT;
	 private static final java.lang.String PREF_NAME;
	 private static final java.lang.String SHA1_ALGORITHM;
	 private static java.lang.String procVersionStr;
	 /* # instance fields */
	 private Boolean testMode;
	 /* # direct methods */
	 static com.jumptap.adtag.utils.JtAdManager ( ) {
		 /* .locals 1 */
		 /* .prologue */
		 /* .line 47 */
		 int v0 = 0; // const/4 v0, 0x0
		 return;
	 } // .end method
	 private com.jumptap.adtag.utils.JtAdManager ( ) {
		 /* .locals 1 */
		 /* .prologue */
		 /* .line 52 */
		 /* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
		 /* .line 46 */
		 int v0 = 0; // const/4 v0, 0x0
		 /* iput-boolean v0, p0, Lcom/jumptap/adtag/utils/JtAdManager;->testMode:Z */
		 /* .line 54 */
		 return;
	 } // .end method
	 public static java.lang.String SHA1 ( java.lang.String p0 ) {
		 /* .locals 7 */
		 /* .param p0, "text" # Ljava/lang/String; */
		 /* .prologue */
		 int v3 = 0; // const/4 v3, 0x0
		 /* .line 106 */
		 /* if-nez p0, :cond_0 */
		 /* .line 116 */
	 } // :goto_0
	 /* .line 108 */
} // :cond_0
try { // :try_start_0
	 final String v4 = "SHA-1"; // const-string v4, "SHA-1"
	 java.security.MessageDigest .getInstance ( v4 );
	 /* .line 109 */
	 /* .local v1, "md":Ljava/security/MessageDigest; */
	 /* const/16 v4, 0x28 */
	 /* new-array v2, v4, [B */
	 /* .line 110 */
	 /* .local v2, "sha1hash":[B */
	 final String v4 = "iso-8859-1"; // const-string v4, "iso-8859-1"
	 (( java.lang.String ) p0 ).getBytes ( v4 ); // invoke-virtual {p0, v4}, Ljava/lang/String;->getBytes(Ljava/lang/String;)[B
	 int v5 = 0; // const/4 v5, 0x0
	 v6 = 	 (( java.lang.String ) p0 ).length ( ); // invoke-virtual {p0}, Ljava/lang/String;->length()I
	 (( java.security.MessageDigest ) v1 ).update ( v4, v5, v6 ); // invoke-virtual {v1, v4, v5, v6}, Ljava/security/MessageDigest;->update([BII)V
	 /* .line 111 */
	 (( java.security.MessageDigest ) v1 ).digest ( ); // invoke-virtual {v1}, Ljava/security/MessageDigest;->digest()[B
	 /* .line 112 */
	 com.jumptap.adtag.utils.JtAdManager .convertToHex ( v2 );
	 /* :try_end_0 */
	 /* .catch Ljava/lang/Exception; {:try_start_0 ..:try_end_0} :catch_0 */
	 /* .line 114 */
} // .end local v1 # "md":Ljava/security/MessageDigest;
} // .end local v2 # "sha1hash":[B
/* :catch_0 */
/* move-exception v0 */
/* .line 115 */
/* .local v0, "e":Ljava/lang/Exception; */
final String v4 = "JtAd"; // const-string v4, "JtAd"
final String v5 = "Error generating generating SHA-1: "; // const-string v5, "Error generating generating SHA-1: "
android.util.Log .i ( v4,v5,v0 );
} // .end method
private static java.lang.String convertToHex ( Object[] p0 ) {
/* .locals 6 */
/* .param p0, "data" # [B */
/* .prologue */
/* .line 90 */
/* new-instance v0, Ljava/lang/StringBuffer; */
/* invoke-direct {v0}, Ljava/lang/StringBuffer;-><init>()V */
/* .line 91 */
/* .local v0, "buf":Ljava/lang/StringBuffer; */
int v2 = 0; // const/4 v2, 0x0
/* .local v2, "i":I */
} // :goto_0
/* array-length v5, p0 */
/* if-ge v2, v5, :cond_1 */
/* .line 92 */
/* aget-byte v5, p0, v2 */
/* ushr-int/lit8 v5, v5, 0x4 */
/* and-int/lit8 v1, v5, 0xf */
/* .line 93 */
/* .local v1, "halfbyte":I */
int v3 = 0; // const/4 v3, 0x0
/* .local v3, "two_halfs":I */
/* move v4, v3 */
/* .line 95 */
} // .end local v3 # "two_halfs":I
/* .local v4, "two_halfs":I */
} // :goto_1
/* if-ltz v1, :cond_0 */
/* const/16 v5, 0x9 */
/* if-gt v1, v5, :cond_0 */
/* .line 96 */
/* add-int/lit8 v5, v1, 0x30 */
/* int-to-char v5, v5 */
(( java.lang.StringBuffer ) v0 ).append ( v5 ); // invoke-virtual {v0, v5}, Ljava/lang/StringBuffer;->append(C)Ljava/lang/StringBuffer;
/* .line 99 */
} // :goto_2
/* aget-byte v5, p0, v2 */
/* and-int/lit8 v1, v5, 0xf */
/* .line 100 */
/* add-int/lit8 v3, v4, 0x1 */
} // .end local v4 # "two_halfs":I
/* .restart local v3 # "two_halfs":I */
int v5 = 1; // const/4 v5, 0x1
/* if-lt v4, v5, :cond_2 */
/* .line 91 */
/* add-int/lit8 v2, v2, 0x1 */
/* .line 98 */
} // .end local v3 # "two_halfs":I
/* .restart local v4 # "two_halfs":I */
} // :cond_0
/* add-int/lit8 v5, v1, -0xa */
/* add-int/lit8 v5, v5, 0x61 */
/* int-to-char v5, v5 */
(( java.lang.StringBuffer ) v0 ).append ( v5 ); // invoke-virtual {v0, v5}, Ljava/lang/StringBuffer;->append(C)Ljava/lang/StringBuffer;
/* .line 102 */
} // .end local v1 # "halfbyte":I
} // .end local v4 # "two_halfs":I
} // :cond_1
(( java.lang.StringBuffer ) v0 ).toString ( ); // invoke-virtual {v0}, Ljava/lang/StringBuffer;->toString()Ljava/lang/String;
/* .restart local v1 # "halfbyte":I */
/* .restart local v3 # "two_halfs":I */
} // :cond_2
/* move v4, v3 */
} // .end local v3 # "two_halfs":I
/* .restart local v4 # "two_halfs":I */
} // .end method
public static java.lang.String getAndroidModel ( ) {
/* .locals 1 */
/* .prologue */
/* .line 170 */
v0 = android.os.Build.DEVICE;
} // .end method
public static java.lang.String getBrand ( ) {
/* .locals 1 */
/* .prologue */
/* .line 174 */
v0 = android.os.Build.BRAND;
} // .end method
public static java.lang.String getConnectionType ( android.content.Context p0 ) {
/* .locals 8 */
/* .param p0, "context" # Landroid/content/Context; */
/* .prologue */
/* .line 373 */
final String v1 = ""; // const-string v1, ""
/* .line 374 */
/* .local v1, "connectionType":Ljava/lang/String; */
com.jumptap.adtag.utils.JtAdManager .getConnectivityManager ( p0 );
/* .line 375 */
/* .local v2, "connectivityManager":Landroid/net/ConnectivityManager; */
if ( v2 != null) { // if-eqz v2, :cond_0
/* .line 376 */
(( android.net.ConnectivityManager ) v2 ).getActiveNetworkInfo ( ); // invoke-virtual {v2}, Landroid/net/ConnectivityManager;->getActiveNetworkInfo()Landroid/net/NetworkInfo;
/* .line 377 */
/* .local v0, "activeNetworkInfo":Landroid/net/NetworkInfo; */
if ( v0 != null) { // if-eqz v0, :cond_0
/* .line 378 */
v4 = (( android.net.NetworkInfo ) v0 ).getType ( ); // invoke-virtual {v0}, Landroid/net/NetworkInfo;->getType()I
/* .line 379 */
/* .local v4, "netType":I */
v3 = (( android.net.NetworkInfo ) v0 ).getSubtype ( ); // invoke-virtual {v0}, Landroid/net/NetworkInfo;->getSubtype()I
/* .line 381 */
/* .local v3, "netSubtype":I */
int v5 = 1; // const/4 v5, 0x1
/* if-ne v4, v5, :cond_1 */
/* .line 382 */
final String v1 = "wifi"; // const-string v1, "wifi"
/* .line 390 */
} // .end local v0 # "activeNetworkInfo":Landroid/net/NetworkInfo;
} // .end local v3 # "netSubtype":I
} // .end local v4 # "netType":I
} // :cond_0
} // :goto_0
final String v5 = "JtAd"; // const-string v5, "JtAd"
/* new-instance v6, Ljava/lang/StringBuilder; */
/* invoke-direct {v6}, Ljava/lang/StringBuilder;-><init>()V */
final String v7 = "connectionType="; // const-string v7, "connectionType="
(( java.lang.StringBuilder ) v6 ).append ( v7 ); // invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v6 ).append ( v1 ); // invoke-virtual {v6, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v6 ).toString ( ); // invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
android.util.Log .i ( v5,v6 );
/* .line 392 */
/* .line 384 */
/* .restart local v0 # "activeNetworkInfo":Landroid/net/NetworkInfo; */
/* .restart local v3 # "netSubtype":I */
/* .restart local v4 # "netType":I */
} // :cond_1
/* if-nez v4, :cond_0 */
/* .line 386 */
com.jumptap.adtag.utils.JtAdManager .getConnectionTypeByNetSubtype ( v3 );
} // .end method
private static java.lang.String getConnectionTypeByNetSubtype ( Integer p0 ) {
/* .locals 2 */
/* .param p0, "netSubtype" # I */
/* .prologue */
/* .line 397 */
final String v0 = ""; // const-string v0, ""
/* .line 399 */
/* .local v0, "connectionType":Ljava/lang/String; */
int v1 = 3; // const/4 v1, 0x3
/* if-eq p0, v1, :cond_0 */
int v1 = 7; // const/4 v1, 0x7
/* if-eq p0, v1, :cond_0 */
/* const/16 v1, 0x8 */
/* if-eq p0, v1, :cond_0 */
/* const/16 v1, 0xa */
/* if-eq p0, v1, :cond_0 */
/* const/16 v1, 0x9 */
/* if-eq p0, v1, :cond_0 */
int v1 = 5; // const/4 v1, 0x5
/* if-eq p0, v1, :cond_0 */
int v1 = 6; // const/4 v1, 0x6
/* if-ne p0, v1, :cond_1 */
/* .line 403 */
} // :cond_0
final String v0 = "3g"; // const-string v0, "3g"
/* .line 405 */
} // :cond_1
int v1 = 1; // const/4 v1, 0x1
/* if-eq p0, v1, :cond_2 */
int v1 = 2; // const/4 v1, 0x2
/* if-eq p0, v1, :cond_2 */
int v1 = 4; // const/4 v1, 0x4
/* if-eq p0, v1, :cond_2 */
/* const/16 v1, 0xb */
/* if-ne p0, v1, :cond_3 */
/* .line 407 */
} // :cond_2
final String v0 = "edge"; // const-string v0, "edge"
/* .line 409 */
} // :cond_3
} // .end method
private static android.net.ConnectivityManager getConnectivityManager ( android.content.Context p0 ) {
/* .locals 7 */
/* .param p0, "context" # Landroid/content/Context; */
/* .prologue */
/* .line 292 */
int v2 = 0; // const/4 v2, 0x0
/* .line 293 */
/* .local v2, "mConnectivityMgr":Landroid/net/ConnectivityManager; */
final String v4 = "android.permission.ACCESS_NETWORK_STATE"; // const-string v4, "android.permission.ACCESS_NETWORK_STATE"
v1 = (( android.content.Context ) p0 ).checkCallingOrSelfPermission ( v4 ); // invoke-virtual {p0, v4}, Landroid/content/Context;->checkCallingOrSelfPermission(Ljava/lang/String;)I
/* .line 294 */
/* .local v1, "isNetworkStatePermissionGranted":I */
/* if-nez v1, :cond_0 */
/* .line 297 */
try { // :try_start_0
final String v4 = "connectivity"; // const-string v4, "connectivity"
(( android.content.Context ) p0 ).getSystemService ( v4 ); // invoke-virtual {p0, v4}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;
/* move-object v0, v4 */
/* check-cast v0, Landroid/net/ConnectivityManager; */
/* move-object v2, v0 */
/* :try_end_0 */
/* .catch Ljava/lang/SecurityException; {:try_start_0 ..:try_end_0} :catch_0 */
/* .line 309 */
} // :goto_0
/* .line 300 */
/* :catch_0 */
/* move-exception v3 */
/* .line 301 */
/* .local v3, "secExp":Ljava/lang/SecurityException; */
final String v4 = "JtAd"; // const-string v4, "JtAd"
/* new-instance v5, Ljava/lang/StringBuilder; */
/* invoke-direct {v5}, Ljava/lang/StringBuilder;-><init>()V */
final String v6 = "JtAdManager.getConnectivityManager: "; // const-string v6, "JtAdManager.getConnectivityManager: "
(( java.lang.StringBuilder ) v5 ).append ( v6 ); // invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.SecurityException ) v3 ).getMessage ( ); // invoke-virtual {v3}, Ljava/lang/SecurityException;->getMessage()Ljava/lang/String;
(( java.lang.StringBuilder ) v5 ).append ( v6 ); // invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v5 ).toString ( ); // invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
android.util.Log .e ( v4,v5 );
/* .line 305 */
} // .end local v3 # "secExp":Ljava/lang/SecurityException;
} // :cond_0
final String v4 = "JtAd"; // const-string v4, "JtAd"
final String v5 = "JtAdManager: Requires ACCESS_NETWORK_STATE permission"; // const-string v5, "JtAdManager: Requires ACCESS_NETWORK_STATE permission"
android.util.Log .e ( v4,v5 );
} // .end method
public static java.lang.String getHID ( android.content.Context p0 ) {
/* .locals 3 */
/* .param p0, "context" # Landroid/content/Context; */
/* .prologue */
/* .line 83 */
(( android.content.Context ) p0 ).getContentResolver ( ); // invoke-virtual {p0}, Landroid/content/Context;->getContentResolver()Landroid/content/ContentResolver;
final String v2 = "android_id"; // const-string v2, "android_id"
android.provider.Settings$Secure .getString ( v1,v2 );
/* .line 85 */
/* .local v0, "android_id":Ljava/lang/String; */
} // .end method
public static java.lang.String getHIDSHA1 ( android.content.Context p0 ) {
/* .locals 2 */
/* .param p0, "context" # Landroid/content/Context; */
/* .prologue */
/* .line 126 */
com.jumptap.adtag.utils.JtAdManager .getHID ( p0 );
/* .line 127 */
/* .local v0, "hid":Ljava/lang/String; */
com.jumptap.adtag.utils.JtAdManager .SHA1 ( v0 );
} // .end method
public static java.lang.String getIPAddress ( ) {
/* .locals 1 */
/* .prologue */
/* .line 70 */
int v0 = 0; // const/4 v0, 0x0
/* .line 71 */
/* .local v0, "localIpAddress":Ljava/lang/String; */
/* if-nez v0, :cond_0 */
/* .line 72 */
com.jumptap.adtag.utils.JtAdManager .getLocalIpAddress ( );
/* .line 74 */
} // :cond_0
} // .end method
public static java.lang.String getKernelVersion ( ) {
/* .locals 9 */
/* .prologue */
/* .line 243 */
v6 = com.jumptap.adtag.utils.JtAdManager.procVersionStr;
/* if-nez v6, :cond_2 */
/* .line 244 */
int v4 = 0; // const/4 v4, 0x0
/* .line 247 */
/* .local v4, "procFileData":Ljava/lang/String; */
try { // :try_start_0
/* new-instance v5, Ljava/io/BufferedReader; */
/* new-instance v6, Ljava/io/FileReader; */
final String v7 = "/proc/version"; // const-string v7, "/proc/version"
/* invoke-direct {v6, v7}, Ljava/io/FileReader;-><init>(Ljava/lang/String;)V */
/* const/16 v7, 0x100 */
/* invoke-direct {v5, v6, v7}, Ljava/io/BufferedReader;-><init>(Ljava/io/Reader;I)V */
/* :try_end_0 */
/* .catch Ljava/io/IOException; {:try_start_0 ..:try_end_0} :catch_0 */
/* .line 249 */
/* .local v5, "reader":Ljava/io/BufferedReader; */
try { // :try_start_1
(( java.io.BufferedReader ) v5 ).readLine ( ); // invoke-virtual {v5}, Ljava/io/BufferedReader;->readLine()Ljava/lang/String;
/* :try_end_1 */
/* .catchall {:try_start_1 ..:try_end_1} :catchall_0 */
/* .line 251 */
try { // :try_start_2
(( java.io.BufferedReader ) v5 ).close ( ); // invoke-virtual {v5}, Ljava/io/BufferedReader;->close()V
/* .line 254 */
final String v0 = "\\w+\\s+\\w+\\s+([^\\s]+)\\s+\\(([^\\s@]+(?:@[^\\s.]+)?)[^)]*\\)\\s+\\([^)]+\\)\\s+([^\\s]+)\\s+(?:PREEMPT\\s+)?(.+)"; // const-string v0, "\\w+\\s+\\w+\\s+([^\\s]+)\\s+\\(([^\\s@]+(?:@[^\\s.]+)?)[^)]*\\)\\s+\\([^)]+\\)\\s+([^\\s]+)\\s+(?:PREEMPT\\s+)?(.+)"
/* .line 264 */
/* .local v0, "PROC_VERSION_REGEX":Ljava/lang/String; */
final String v6 = "\\w+\\s+\\w+\\s+([^\\s]+)\\s+\\(([^\\s@]+(?:@[^\\s.]+)?)[^)]*\\)\\s+\\([^)]+\\)\\s+([^\\s]+)\\s+(?:PREEMPT\\s+)?(.+)"; // const-string v6, "\\w+\\s+\\w+\\s+([^\\s]+)\\s+\\(([^\\s@]+(?:@[^\\s.]+)?)[^)]*\\)\\s+\\([^)]+\\)\\s+([^\\s]+)\\s+(?:PREEMPT\\s+)?(.+)"
java.util.regex.Pattern .compile ( v6 );
/* .line 265 */
/* .local v3, "p":Ljava/util/regex/Pattern; */
(( java.util.regex.Pattern ) v3 ).matcher ( v4 ); // invoke-virtual {v3, v4}, Ljava/util/regex/Pattern;->matcher(Ljava/lang/CharSequence;)Ljava/util/regex/Matcher;
/* .line 267 */
/* .local v2, "m":Ljava/util/regex/Matcher; */
v6 = (( java.util.regex.Matcher ) v2 ).matches ( ); // invoke-virtual {v2}, Ljava/util/regex/Matcher;->matches()Z
/* if-nez v6, :cond_0 */
/* .line 268 */
final String v6 = "JtAd"; // const-string v6, "JtAd"
/* new-instance v7, Ljava/lang/StringBuilder; */
/* invoke-direct {v7}, Ljava/lang/StringBuilder;-><init>()V */
final String v8 = "Regex did not match on /proc/version: "; // const-string v8, "Regex did not match on /proc/version: "
(( java.lang.StringBuilder ) v7 ).append ( v8 ); // invoke-virtual {v7, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v7 ).append ( v4 ); // invoke-virtual {v7, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v7 ).toString ( ); // invoke-virtual {v7}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
android.util.Log .e ( v6,v7 );
/* .line 269 */
final String v6 = "Unavailable"; // const-string v6, "Unavailable"
/* .line 287 */
} // .end local v0 # "PROC_VERSION_REGEX":Ljava/lang/String;
} // .end local v2 # "m":Ljava/util/regex/Matcher;
} // .end local v3 # "p":Ljava/util/regex/Pattern;
} // .end local v5 # "reader":Ljava/io/BufferedReader;
/* .local v1, "e":Ljava/io/IOException; */
} // :goto_0
/* .line 251 */
} // .end local v1 # "e":Ljava/io/IOException;
/* .restart local v5 # "reader":Ljava/io/BufferedReader; */
/* :catchall_0 */
/* move-exception v6 */
(( java.io.BufferedReader ) v5 ).close ( ); // invoke-virtual {v5}, Ljava/io/BufferedReader;->close()V
/* throw v6 */
/* :try_end_2 */
/* .catch Ljava/io/IOException; {:try_start_2 ..:try_end_2} :catch_0 */
/* .line 278 */
} // .end local v5 # "reader":Ljava/io/BufferedReader;
/* :catch_0 */
/* move-exception v1 */
/* .line 279 */
/* .restart local v1 # "e":Ljava/io/IOException; */
final String v6 = "JtAd"; // const-string v6, "JtAd"
final String v7 = "IO Exception when getting kernel version for Device Info screen"; // const-string v7, "IO Exception when getting kernel version for Device Info screen"
android.util.Log .e ( v6,v7,v1 );
/* .line 283 */
final String v6 = "Unavailable"; // const-string v6, "Unavailable"
/* .line 270 */
} // .end local v1 # "e":Ljava/io/IOException;
/* .restart local v0 # "PROC_VERSION_REGEX":Ljava/lang/String; */
/* .restart local v2 # "m":Ljava/util/regex/Matcher; */
/* .restart local v3 # "p":Ljava/util/regex/Pattern; */
/* .restart local v5 # "reader":Ljava/io/BufferedReader; */
} // :cond_0
try { // :try_start_3
v6 = (( java.util.regex.Matcher ) v2 ).groupCount ( ); // invoke-virtual {v2}, Ljava/util/regex/Matcher;->groupCount()I
int v7 = 4; // const/4 v7, 0x4
/* if-ge v6, v7, :cond_1 */
/* .line 271 */
final String v6 = "JtAd"; // const-string v6, "JtAd"
/* new-instance v7, Ljava/lang/StringBuilder; */
/* invoke-direct {v7}, Ljava/lang/StringBuilder;-><init>()V */
final String v8 = "Regex match on /proc/version only returned "; // const-string v8, "Regex match on /proc/version only returned "
(( java.lang.StringBuilder ) v7 ).append ( v8 ); // invoke-virtual {v7, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
v8 = (( java.util.regex.Matcher ) v2 ).groupCount ( ); // invoke-virtual {v2}, Ljava/util/regex/Matcher;->groupCount()I
(( java.lang.StringBuilder ) v7 ).append ( v8 ); // invoke-virtual {v7, v8}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;
final String v8 = " groups"; // const-string v8, " groups"
(( java.lang.StringBuilder ) v7 ).append ( v8 ); // invoke-virtual {v7, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v7 ).toString ( ); // invoke-virtual {v7}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
android.util.Log .e ( v6,v7 );
/* .line 273 */
final String v6 = "Unavailable"; // const-string v6, "Unavailable"
/* .line 275 */
} // :cond_1
/* new-instance v6, Ljava/lang/StringBuilder; */
int v7 = 1; // const/4 v7, 0x1
(( java.util.regex.Matcher ) v2 ).group ( v7 ); // invoke-virtual {v2, v7}, Ljava/util/regex/Matcher;->group(I)Ljava/lang/String;
/* invoke-direct {v6, v7}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V */
(( java.lang.StringBuilder ) v6 ).toString ( ); // invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
/* .line 276 */
v6 = com.jumptap.adtag.utils.JtAdManager.procVersionStr;
/* :try_end_3 */
/* .catch Ljava/io/IOException; {:try_start_3 ..:try_end_3} :catch_0 */
/* .line 287 */
} // .end local v0 # "PROC_VERSION_REGEX":Ljava/lang/String;
} // .end local v2 # "m":Ljava/util/regex/Matcher;
} // .end local v3 # "p":Ljava/util/regex/Pattern;
} // .end local v4 # "procFileData":Ljava/lang/String;
} // .end local v5 # "reader":Ljava/io/BufferedReader;
} // :cond_2
v6 = com.jumptap.adtag.utils.JtAdManager.procVersionStr;
} // .end method
private static java.lang.String getLocalIpAddress ( ) {
/* .locals 8 */
/* .prologue */
/* .line 149 */
try { // :try_start_0
java.net.NetworkInterface .getNetworkInterfaces ( );
/* .local v0, "en":Ljava/util/Enumeration;, "Ljava/util/Enumeration<Ljava/net/NetworkInterface;>;" */
v5 = } // :cond_0
if ( v5 != null) { // if-eqz v5, :cond_2
/* .line 150 */
/* check-cast v4, Ljava/net/NetworkInterface; */
/* .line 151 */
/* .local v4, "intf":Ljava/net/NetworkInterface; */
(( java.net.NetworkInterface ) v4 ).getInetAddresses ( ); // invoke-virtual {v4}, Ljava/net/NetworkInterface;->getInetAddresses()Ljava/util/Enumeration;
/* .local v1, "enumIpAddr":Ljava/util/Enumeration;, "Ljava/util/Enumeration<Ljava/net/InetAddress;>;" */
v5 = } // :cond_1
if ( v5 != null) { // if-eqz v5, :cond_0
/* .line 152 */
/* check-cast v3, Ljava/net/InetAddress; */
/* .line 153 */
/* .local v3, "inetAddress":Ljava/net/InetAddress; */
v5 = (( java.net.InetAddress ) v3 ).isLoopbackAddress ( ); // invoke-virtual {v3}, Ljava/net/InetAddress;->isLoopbackAddress()Z
/* if-nez v5, :cond_1 */
/* .line 154 */
(( java.net.InetAddress ) v3 ).getHostAddress ( ); // invoke-virtual {v3}, Ljava/net/InetAddress;->getHostAddress()Ljava/lang/String;
(( java.lang.String ) v5 ).toString ( ); // invoke-virtual {v5}, Ljava/lang/String;->toString()Ljava/lang/String;
/* :try_end_0 */
/* .catch Ljava/net/SocketException; {:try_start_0 ..:try_end_0} :catch_0 */
/* .line 162 */
} // .end local v1 # "enumIpAddr":Ljava/util/Enumeration;, "Ljava/util/Enumeration<Ljava/net/InetAddress;>;"
} // .end local v3 # "inetAddress":Ljava/net/InetAddress;
} // .end local v4 # "intf":Ljava/net/NetworkInterface;
} // :goto_0
/* .line 158 */
/* :catch_0 */
/* move-exception v2 */
/* .line 160 */
/* .local v2, "ex":Ljava/net/SocketException; */
final String v5 = "JtAd"; // const-string v5, "JtAd"
/* new-instance v6, Ljava/lang/StringBuilder; */
/* invoke-direct {v6}, Ljava/lang/StringBuilder;-><init>()V */
final String v7 = "JtAdManager.getLocalIpAddress:"; // const-string v7, "JtAdManager.getLocalIpAddress:"
(( java.lang.StringBuilder ) v6 ).append ( v7 ); // invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.net.SocketException ) v2 ).toString ( ); // invoke-virtual {v2}, Ljava/net/SocketException;->toString()Ljava/lang/String;
(( java.lang.StringBuilder ) v6 ).append ( v7 ); // invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v6 ).toString ( ); // invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
android.util.Log .e ( v5,v6 );
/* .line 162 */
} // .end local v2 # "ex":Ljava/net/SocketException;
} // :cond_2
int v5 = 0; // const/4 v5, 0x0
} // .end method
public static java.lang.String getLocation ( android.content.Context p0 ) {
/* .locals 5 */
/* .param p0, "context" # Landroid/content/Context; */
/* .prologue */
/* .line 136 */
com.jumptap.adtag.utils.JtLocation .init ( p0 );
/* .line 137 */
int v1 = 0; // const/4 v1, 0x0
/* .line 138 */
/* .local v1, "retVal":Ljava/lang/String; */
com.jumptap.adtag.utils.JtLocation .getCurrentLocation ( );
/* .line 139 */
/* .local v0, "currentLocation":Landroid/location/Location; */
if ( v0 != null) { // if-eqz v0, :cond_0
/* .line 140 */
/* new-instance v2, Ljava/lang/StringBuilder; */
/* invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V */
(( android.location.Location ) v0 ).getLatitude ( ); // invoke-virtual {v0}, Landroid/location/Location;->getLatitude()D
/* move-result-wide v3 */
(( java.lang.StringBuilder ) v2 ).append ( v3, v4 ); // invoke-virtual {v2, v3, v4}, Ljava/lang/StringBuilder;->append(D)Ljava/lang/StringBuilder;
final String v3 = ","; // const-string v3, ","
(( java.lang.StringBuilder ) v2 ).append ( v3 ); // invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( android.location.Location ) v0 ).getLongitude ( ); // invoke-virtual {v0}, Landroid/location/Location;->getLongitude()D
/* move-result-wide v3 */
(( java.lang.StringBuilder ) v2 ).append ( v3, v4 ); // invoke-virtual {v2, v3, v4}, Ljava/lang/StringBuilder;->append(D)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v2 ).toString ( ); // invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
/* .line 144 */
} // :cond_0
} // .end method
public static java.lang.String getManufacturer ( ) {
/* .locals 1 */
/* .prologue */
/* .line 178 */
final String v0 = ""; // const-string v0, ""
} // .end method
public static java.lang.String getNetworkType ( android.content.Context p0 ) {
/* .locals 3 */
/* .param p0, "context" # Landroid/content/Context; */
/* .prologue */
/* .line 194 */
int v1 = -1; // const/4 v1, -0x1
/* .line 195 */
/* .local v1, "neworkTypeId":I */
final String v0 = ""; // const-string v0, ""
/* .line 197 */
/* .local v0, "neworkType":Ljava/lang/String; */
com.jumptap.adtag.utils.JtAdManager .getTelephonyManager ( p0 );
/* .line 198 */
/* .local v2, "telephonyManager":Landroid/telephony/TelephonyManager; */
if ( v2 != null) { // if-eqz v2, :cond_0
/* .line 199 */
v1 = (( android.telephony.TelephonyManager ) v2 ).getNetworkType ( ); // invoke-virtual {v2}, Landroid/telephony/TelephonyManager;->getNetworkType()I
/* .line 201 */
/* packed-switch v1, :pswitch_data_0 */
/* .line 213 */
final String v0 = ""; // const-string v0, ""
/* .line 217 */
} // :cond_0
} // :goto_0
/* .line 203 */
/* :pswitch_0 */
final String v0 = "GPRS"; // const-string v0, "GPRS"
/* .line 204 */
/* .line 206 */
/* :pswitch_1 */
final String v0 = "EDGE"; // const-string v0, "EDGE"
/* .line 207 */
/* .line 209 */
/* :pswitch_2 */
final String v0 = "UMTS"; // const-string v0, "UMTS"
/* .line 210 */
/* .line 201 */
/* :pswitch_data_0 */
/* .packed-switch 0x1 */
/* :pswitch_0 */
/* :pswitch_1 */
/* :pswitch_2 */
} // .end packed-switch
} // .end method
public static java.lang.String getOperatorName ( android.content.Context p0 ) {
/* .locals 2 */
/* .param p0, "context" # Landroid/content/Context; */
/* .prologue */
/* .line 183 */
com.jumptap.adtag.utils.JtAdManager .getTelephonyManager ( p0 );
/* .line 185 */
/* .local v1, "telephonyManager":Landroid/telephony/TelephonyManager; */
final String v0 = ""; // const-string v0, ""
/* .line 186 */
/* .local v0, "operatorName":Ljava/lang/String; */
if ( v1 != null) { // if-eqz v1, :cond_0
/* .line 187 */
(( android.telephony.TelephonyManager ) v1 ).getNetworkOperatorName ( ); // invoke-virtual {v1}, Landroid/telephony/TelephonyManager;->getNetworkOperatorName()Ljava/lang/String;
/* .line 190 */
} // :cond_0
} // .end method
public static java.lang.String getPhoneType ( android.content.Context p0 ) {
/* .locals 3 */
/* .param p0, "context" # Landroid/content/Context; */
/* .prologue */
/* .line 221 */
int v1 = -1; // const/4 v1, -0x1
/* .line 222 */
/* .local v1, "phoneTypeId":I */
final String v0 = ""; // const-string v0, ""
/* .line 224 */
/* .local v0, "phoneType":Ljava/lang/String; */
com.jumptap.adtag.utils.JtAdManager .getTelephonyManager ( p0 );
/* .line 225 */
/* .local v2, "telephonyManager":Landroid/telephony/TelephonyManager; */
if ( v2 != null) { // if-eqz v2, :cond_0
/* .line 226 */
v1 = (( android.telephony.TelephonyManager ) v2 ).getPhoneType ( ); // invoke-virtual {v2}, Landroid/telephony/TelephonyManager;->getPhoneType()I
/* .line 228 */
/* packed-switch v1, :pswitch_data_0 */
/* .line 234 */
final String v0 = ""; // const-string v0, ""
/* .line 238 */
} // :cond_0
} // :goto_0
/* .line 230 */
/* :pswitch_0 */
final String v0 = "GSM"; // const-string v0, "GSM"
/* .line 231 */
/* .line 228 */
/* :pswitch_data_0 */
/* .packed-switch 0x1 */
/* :pswitch_0 */
} // .end packed-switch
} // .end method
public static java.lang.String getPreferences ( android.content.Context p0, java.lang.String p1, java.lang.String p2 ) {
/* .locals 4 */
/* .param p0, "context" # Landroid/content/Context; */
/* .param p1, "prefName" # Ljava/lang/String; */
/* .param p2, "defaultValue" # Ljava/lang/String; */
/* .prologue */
/* .line 342 */
final String v2 = "jtPref"; // const-string v2, "jtPref"
int v3 = 0; // const/4 v3, 0x0
(( android.content.Context ) p0 ).getSharedPreferences ( v2, v3 ); // invoke-virtual {p0, v2, v3}, Landroid/content/Context;->getSharedPreferences(Ljava/lang/String;I)Landroid/content/SharedPreferences;
/* .line 343 */
/* .local v1, "settings":Landroid/content/SharedPreferences; */
/* .line 344 */
/* .local v0, "prefValue":Ljava/lang/String; */
} // .end method
public static java.lang.String getSDKVersion ( ) {
/* .locals 1 */
/* .prologue */
/* .line 166 */
v0 = android.os.Build$VERSION.RELEASE;
} // .end method
private static android.telephony.TelephonyManager getTelephonyManager ( android.content.Context p0 ) {
/* .locals 7 */
/* .param p0, "context" # Landroid/content/Context; */
/* .prologue */
/* .line 315 */
int v2 = 0; // const/4 v2, 0x0
/* .line 316 */
/* .local v2, "mTelephonyMgr":Landroid/telephony/TelephonyManager; */
final String v4 = "android.permission.READ_PHONE_STATE"; // const-string v4, "android.permission.READ_PHONE_STATE"
v1 = (( android.content.Context ) p0 ).checkCallingOrSelfPermission ( v4 ); // invoke-virtual {p0, v4}, Landroid/content/Context;->checkCallingOrSelfPermission(Ljava/lang/String;)I
/* .line 317 */
/* .local v1, "isPhoneStatePermissionGranted":I */
/* if-nez v1, :cond_0 */
/* .line 319 */
try { // :try_start_0
final String v4 = "phone"; // const-string v4, "phone"
(( android.content.Context ) p0 ).getSystemService ( v4 ); // invoke-virtual {p0, v4}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;
/* move-object v0, v4 */
/* check-cast v0, Landroid/telephony/TelephonyManager; */
/* move-object v2, v0 */
/* :try_end_0 */
/* .catch Ljava/lang/SecurityException; {:try_start_0 ..:try_end_0} :catch_0 */
/* .line 330 */
} // :goto_0
/* .line 322 */
/* :catch_0 */
/* move-exception v3 */
/* .line 323 */
/* .local v3, "secExp":Ljava/lang/SecurityException; */
final String v4 = "JtAd"; // const-string v4, "JtAd"
/* new-instance v5, Ljava/lang/StringBuilder; */
/* invoke-direct {v5}, Ljava/lang/StringBuilder;-><init>()V */
final String v6 = "JtAdManager.getTelephonyManager: "; // const-string v6, "JtAdManager.getTelephonyManager: "
(( java.lang.StringBuilder ) v5 ).append ( v6 ); // invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.SecurityException ) v3 ).getMessage ( ); // invoke-virtual {v3}, Ljava/lang/SecurityException;->getMessage()Ljava/lang/String;
(( java.lang.StringBuilder ) v5 ).append ( v6 ); // invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v5 ).toString ( ); // invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
android.util.Log .e ( v4,v5 );
/* .line 327 */
} // .end local v3 # "secExp":Ljava/lang/SecurityException;
} // :cond_0
final String v4 = "JtAd"; // const-string v4, "JtAd"
final String v5 = "JtAdManager: Requires READ_PHONE_STATE permission"; // const-string v5, "JtAdManager: Requires READ_PHONE_STATE permission"
android.util.Log .e ( v4,v5 );
} // .end method
public static void removePreferences ( android.content.Context p0, java.lang.String p1 ) {
/* .locals 4 */
/* .param p0, "context" # Landroid/content/Context; */
/* .param p1, "prefName" # Ljava/lang/String; */
/* .prologue */
/* .line 366 */
final String v2 = "jtPref"; // const-string v2, "jtPref"
int v3 = 0; // const/4 v3, 0x0
(( android.content.Context ) p0 ).getSharedPreferences ( v2, v3 ); // invoke-virtual {p0, v2, v3}, Landroid/content/Context;->getSharedPreferences(Ljava/lang/String;I)Landroid/content/SharedPreferences;
/* .line 367 */
/* .local v1, "settings":Landroid/content/SharedPreferences; */
/* .line 368 */
/* .local v0, "editor":Landroid/content/SharedPreferences$Editor; */
/* .line 369 */
/* .line 370 */
return;
} // .end method
public static void savePreferences ( android.content.Context p0, java.lang.String p1, java.lang.String p2 ) {
/* .locals 4 */
/* .param p0, "context" # Landroid/content/Context; */
/* .param p1, "prefName" # Ljava/lang/String; */
/* .param p2, "prefValue" # Ljava/lang/String; */
/* .prologue */
/* .line 354 */
final String v2 = "jtPref"; // const-string v2, "jtPref"
int v3 = 0; // const/4 v3, 0x0
(( android.content.Context ) p0 ).getSharedPreferences ( v2, v3 ); // invoke-virtual {p0, v2, v3}, Landroid/content/Context;->getSharedPreferences(Ljava/lang/String;I)Landroid/content/SharedPreferences;
/* .line 355 */
/* .local v1, "settings":Landroid/content/SharedPreferences; */
/* .line 356 */
/* .local v0, "editor":Landroid/content/SharedPreferences$Editor; */
/* .line 357 */
/* .line 358 */
return;
} // .end method
/* # virtual methods */
public Boolean isTestMode ( ) {
/* .locals 1 */
/* .prologue */
/* .line 57 */
/* iget-boolean v0, p0, Lcom/jumptap/adtag/utils/JtAdManager;->testMode:Z */
} // .end method
public void setTestMode ( Boolean p0 ) {
/* .locals 0 */
/* .param p1, "testMode" # Z */
/* .prologue */
/* .line 61 */
/* iput-boolean p1, p0, Lcom/jumptap/adtag/utils/JtAdManager;->testMode:Z */
/* .line 62 */
return;
} // .end method
