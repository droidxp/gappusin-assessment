public class com.adknowledge.superrewards.Utils {
	 /* .source "Utils.java" */
	 /* # static fields */
	 public static final java.lang.String HAS_RUN_KEY;
	 public static final java.lang.String SR_PREF_FILE;
	 public static final java.lang.String TIMESTAMP_KEY;
	 public static final java.lang.String XML_KEY;
	 /* # direct methods */
	 public com.adknowledge.superrewards.Utils ( ) {
		 /* .locals 0 */
		 /* .prologue */
		 /* .line 37 */
		 /* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
		 return;
	 } // .end method
	 public static Boolean checkCacheTimestamp ( android.content.Context p0 ) {
		 /* .locals 9 */
		 /* .param p0, "ctx" # Landroid/content/Context; */
		 /* .prologue */
		 int v5 = 0; // const/4 v5, 0x0
		 /* .line 172 */
		 final String v6 = "superrewards_prefs"; // const-string v6, "superrewards_prefs"
		 (( android.content.Context ) p0 ).getSharedPreferences ( v6, v5 ); // invoke-virtual {p0, v6, v5}, Landroid/content/Context;->getSharedPreferences(Ljava/lang/String;I)Landroid/content/SharedPreferences;
		 /* .line 173 */
		 /* .local v2, "preferences":Landroid/content/SharedPreferences; */
		 final String v6 = "superrewards_timestamp_xml"; // const-string v6, "superrewards_timestamp_xml"
		 /* const-wide/16 v7, 0x0 */
		 /* move-result-wide v3 */
		 /* .line 174 */
		 /* .local v3, "timestamp":J */
		 java.lang.System .currentTimeMillis ( );
		 /* move-result-wide v0 */
		 /* .line 175 */
		 /* .local v0, "current":J */
		 /* const-wide/32 v6, 0xdbba0 */
		 /* add-long/2addr v6, v3 */
		 /* cmp-long v6, v0, v6 */
		 /* if-lez v6, :cond_0 */
		 /* .line 176 */
	 } // :goto_0
} // :cond_0
int v5 = 1; // const/4 v5, 0x1
} // .end method
public static Boolean checkRunFlag ( android.content.Context p0 ) {
/* .locals 4 */
/* .param p0, "ctx" # Landroid/content/Context; */
/* .prologue */
int v2 = 0; // const/4 v2, 0x0
/* .line 236 */
final String v3 = "superrewards_prefs"; // const-string v3, "superrewards_prefs"
(( android.content.Context ) p0 ).getSharedPreferences ( v3, v2 ); // invoke-virtual {p0, v3, v2}, Landroid/content/Context;->getSharedPreferences(Ljava/lang/String;I)Landroid/content/SharedPreferences;
/* .line 237 */
/* .local v1, "preferences":Landroid/content/SharedPreferences; */
v0 = final String v3 = "superrewards_has_run"; // const-string v3, "superrewards_has_run"
/* .line 238 */
/* .local v0, "hasrun":Z */
/* if-nez v0, :cond_0 */
/* .line 239 */
} // :goto_0
} // :cond_0
int v2 = 1; // const/4 v2, 0x1
} // .end method
public static void clearCache ( android.content.Context p0 ) {
/* .locals 4 */
/* .param p0, "ctx" # Landroid/content/Context; */
/* .prologue */
/* .line 253 */
final String v2 = "superrewards_prefs"; // const-string v2, "superrewards_prefs"
int v3 = 0; // const/4 v3, 0x0
(( android.content.Context ) p0 ).getSharedPreferences ( v2, v3 ); // invoke-virtual {p0, v2, v3}, Landroid/content/Context;->getSharedPreferences(Ljava/lang/String;I)Landroid/content/SharedPreferences;
/* .line 254 */
/* .local v1, "preferences":Landroid/content/SharedPreferences; */
/* .line 255 */
/* .local v0, "editor":Landroid/content/SharedPreferences$Editor; */
/* .line 256 */
return;
} // .end method
public static java.lang.Object fetch ( java.lang.String p0 ) {
/* .locals 2 */
/* .param p0, "address" # Ljava/lang/String; */
/* .annotation system Ldalvik/annotation/Throws; */
/* value = { */
/* Ljava/net/MalformedURLException;, */
/* Ljava/io/IOException; */
/* } */
} // .end annotation
/* .prologue */
/* .line 159 */
/* new-instance v1, Ljava/net/URL; */
/* invoke-direct {v1, p0}, Ljava/net/URL;-><init>(Ljava/lang/String;)V */
/* .line 160 */
/* .local v1, "url":Ljava/net/URL; */
(( java.net.URL ) v1 ).getContent ( ); // invoke-virtual {v1}, Ljava/net/URL;->getContent()Ljava/lang/Object;
/* .line 161 */
/* .local v0, "content":Ljava/lang/Object; */
} // .end method
public static java.lang.String getAndroidID ( android.content.Context p0 ) {
/* .locals 2 */
/* .param p0, "context" # Landroid/content/Context; */
/* .prologue */
/* .line 122 */
(( android.content.Context ) p0 ).getContentResolver ( ); // invoke-virtual {p0}, Landroid/content/Context;->getContentResolver()Landroid/content/ContentResolver;
final String v1 = "android_id"; // const-string v1, "android_id"
android.provider.Settings$System .getString ( v0,v1 );
} // .end method
public static java.lang.String getCountryCode ( ) {
/* .locals 1 */
/* .prologue */
/* .line 68 */
java.util.Locale .getDefault ( );
(( java.util.Locale ) v0 ).getCountry ( ); // invoke-virtual {v0}, Ljava/util/Locale;->getCountry()Ljava/lang/String;
} // .end method
public static java.lang.String getDeviceUID ( android.content.Context p0 ) {
/* .locals 2 */
/* .param p0, "context" # Landroid/content/Context; */
/* .prologue */
/* .line 110 */
final String v1 = "phone"; // const-string v1, "phone"
(( android.content.Context ) p0 ).getSystemService ( v1 ); // invoke-virtual {p0, v1}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;
/* check-cast v0, Landroid/telephony/TelephonyManager; */
/* .line 111 */
/* .local v0, "tManager":Landroid/telephony/TelephonyManager; */
(( android.telephony.TelephonyManager ) v0 ).getDeviceId ( ); // invoke-virtual {v0}, Landroid/telephony/TelephonyManager;->getDeviceId()Ljava/lang/String;
} // .end method
public static android.graphics.drawable.Drawable getImage ( android.content.Context p0, java.lang.String p1 ) {
/* .locals 6 */
/* .param p0, "ctx" # Landroid/content/Context; */
/* .param p1, "url" # Ljava/lang/String; */
/* .prologue */
int v0 = 0; // const/4 v0, 0x0
/* .line 134 */
if ( p1 != null) { // if-eqz p1, :cond_0
/* .line 135 */
try { // :try_start_0
final String v3 = "SR"; // const-string v3, "SR"
/* new-instance v4, Ljava/lang/StringBuilder; */
/* invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V */
final String v5 = "Getting Image at "; // const-string v5, "Getting Image at "
(( java.lang.StringBuilder ) v4 ).append ( v5 ); // invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v4 ).append ( p1 ); // invoke-virtual {v4, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v4 ).toString ( ); // invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
android.util.Log .i ( v3,v4 );
/* .line 136 */
com.adknowledge.superrewards.Utils .fetch ( p1 );
/* check-cast v2, Ljava/io/InputStream; */
/* .line 137 */
/* .local v2, "is":Ljava/io/InputStream; */
final String v3 = "src"; // const-string v3, "src"
android.graphics.drawable.Drawable .createFromStream ( v2,v3 );
/* :try_end_0 */
/* .catch Ljava/net/MalformedURLException; {:try_start_0 ..:try_end_0} :catch_0 */
/* .catch Ljava/io/IOException; {:try_start_0 ..:try_end_0} :catch_1 */
/* .line 146 */
} // .end local v2 # "is":Ljava/io/InputStream;
} // :cond_0
} // :goto_0
/* .line 141 */
/* :catch_0 */
/* move-exception v1 */
/* .line 142 */
/* .local v1, "e":Ljava/net/MalformedURLException; */
(( java.net.MalformedURLException ) v1 ).printStackTrace ( ); // invoke-virtual {v1}, Ljava/net/MalformedURLException;->printStackTrace()V
/* .line 144 */
} // .end local v1 # "e":Ljava/net/MalformedURLException;
/* :catch_1 */
/* move-exception v1 */
/* .line 145 */
/* .local v1, "e":Ljava/io/IOException; */
(( java.io.IOException ) v1 ).printStackTrace ( ); // invoke-virtual {v1}, Ljava/io/IOException;->printStackTrace()V
} // .end method
public static java.lang.String getLocalIpAddress ( ) {
/* .locals 5 */
/* .prologue */
/* .line 53 */
try { // :try_start_0
java.net.NetworkInterface .getNetworkInterfaces ( );
/* .local v0, "en":Ljava/util/Enumeration;, "Ljava/util/Enumeration<Ljava/net/NetworkInterface;>;" */
v4 = } // :cond_0
if ( v4 != null) { // if-eqz v4, :cond_2
/* .line 54 */
/* check-cast v3, Ljava/net/NetworkInterface; */
/* .line 55 */
/* .local v3, "intf":Ljava/net/NetworkInterface; */
(( java.net.NetworkInterface ) v3 ).getInetAddresses ( ); // invoke-virtual {v3}, Ljava/net/NetworkInterface;->getInetAddresses()Ljava/util/Enumeration;
/* .local v1, "enumIpAddr":Ljava/util/Enumeration;, "Ljava/util/Enumeration<Ljava/net/InetAddress;>;" */
v4 = } // :cond_1
if ( v4 != null) { // if-eqz v4, :cond_0
/* .line 56 */
/* check-cast v2, Ljava/net/InetAddress; */
/* .line 57 */
/* .local v2, "inetAddress":Ljava/net/InetAddress; */
v4 = (( java.net.InetAddress ) v2 ).isLoopbackAddress ( ); // invoke-virtual {v2}, Ljava/net/InetAddress;->isLoopbackAddress()Z
/* if-nez v4, :cond_1 */
/* .line 58 */
(( java.net.InetAddress ) v2 ).getHostAddress ( ); // invoke-virtual {v2}, Ljava/net/InetAddress;->getHostAddress()Ljava/lang/String;
(( java.lang.String ) v4 ).toString ( ); // invoke-virtual {v4}, Ljava/lang/String;->toString()Ljava/lang/String;
/* :try_end_0 */
/* .catch Ljava/net/SocketException; {:try_start_0 ..:try_end_0} :catch_0 */
/* .line 64 */
} // .end local v1 # "enumIpAddr":Ljava/util/Enumeration;, "Ljava/util/Enumeration<Ljava/net/InetAddress;>;"
} // .end local v2 # "inetAddress":Ljava/net/InetAddress;
} // .end local v3 # "intf":Ljava/net/NetworkInterface;
} // :goto_0
/* .line 62 */
/* :catch_0 */
/* move-exception v4 */
/* .line 64 */
} // :cond_2
int v4 = 0; // const/4 v4, 0x0
} // .end method
public static java.lang.String getLocalIpAddressViaRequest ( java.lang.String p0 ) {
/* .locals 3 */
/* .param p0, "url" # Ljava/lang/String; */
/* .prologue */
/* .line 93 */
try { // :try_start_0
/* new-instance v1, Ljava/net/Socket; */
/* const/16 v2, 0x50 */
/* invoke-direct {v1, p0, v2}, Ljava/net/Socket;-><init>(Ljava/lang/String;I)V */
/* .line 94 */
/* .local v1, "socket":Ljava/net/Socket; */
(( java.net.Socket ) v1 ).getLocalAddress ( ); // invoke-virtual {v1}, Ljava/net/Socket;->getLocalAddress()Ljava/net/InetAddress;
(( java.net.InetAddress ) v2 ).toString ( ); // invoke-virtual {v2}, Ljava/net/InetAddress;->toString()Ljava/lang/String;
/* :try_end_0 */
/* .catch Ljava/lang/Exception; {:try_start_0 ..:try_end_0} :catch_0 */
/* .line 96 */
} // .end local v1 # "socket":Ljava/net/Socket;
} // :goto_0
/* .line 95 */
/* :catch_0 */
/* move-exception v0 */
/* .line 96 */
/* .local v0, "e":Ljava/lang/Exception; */
int v2 = 0; // const/4 v2, 0x0
} // .end method
public static java.lang.String getXMLFromPrefs ( android.content.Context p0 ) {
/* .locals 4 */
/* .param p0, "ctx" # Landroid/content/Context; */
/* .prologue */
/* .line 212 */
final String v2 = "SR"; // const-string v2, "SR"
final String v3 = "In GetXMLFromPrefs"; // const-string v3, "In GetXMLFromPrefs"
android.util.Log .i ( v2,v3 );
/* .line 213 */
final String v2 = "superrewards_prefs"; // const-string v2, "superrewards_prefs"
int v3 = 0; // const/4 v3, 0x0
(( android.content.Context ) p0 ).getSharedPreferences ( v2, v3 ); // invoke-virtual {p0, v2, v3}, Landroid/content/Context;->getSharedPreferences(Ljava/lang/String;I)Landroid/content/SharedPreferences;
/* .line 214 */
/* .local v0, "preferences":Landroid/content/SharedPreferences; */
final String v2 = "superrewards_xml"; // const-string v2, "superrewards_xml"
final String v3 = "none"; // const-string v3, "none"
/* .line 215 */
/* .local v1, "xml":Ljava/lang/String; */
} // .end method
public static java.lang.String inputStreamToString ( java.io.InputStream p0 ) {
/* .locals 4 */
/* .param p0, "is" # Ljava/io/InputStream; */
/* .annotation system Ldalvik/annotation/Throws; */
/* value = { */
/* Ljava/io/IOException; */
/* } */
} // .end annotation
/* .prologue */
/* .line 187 */
/* new-instance v1, Ljava/io/BufferedReader; */
/* new-instance v3, Ljava/io/InputStreamReader; */
/* invoke-direct {v3, p0}, Ljava/io/InputStreamReader;-><init>(Ljava/io/InputStream;)V */
/* invoke-direct {v1, v3}, Ljava/io/BufferedReader;-><init>(Ljava/io/Reader;)V */
/* .line 188 */
/* .local v1, "r":Ljava/io/BufferedReader; */
/* new-instance v2, Ljava/lang/StringBuilder; */
/* invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V */
/* .line 190 */
/* .local v2, "total":Ljava/lang/StringBuilder; */
} // :goto_0
(( java.io.BufferedReader ) v1 ).readLine ( ); // invoke-virtual {v1}, Ljava/io/BufferedReader;->readLine()Ljava/lang/String;
/* .local v0, "line":Ljava/lang/String; */
if ( v0 != null) { // if-eqz v0, :cond_0
/* .line 191 */
(( java.lang.StringBuilder ) v2 ).append ( v0 ); // invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
/* .line 193 */
} // :cond_0
(( java.lang.StringBuilder ) v2 ).toString ( ); // invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
} // .end method
public static Boolean isOnline ( android.content.Context p0 ) {
/* .locals 3 */
/* .param p0, "ctx" # Landroid/content/Context; */
/* .prologue */
/* .line 72 */
final String v1 = "connectivity"; // const-string v1, "connectivity"
(( android.content.Context ) p0 ).getSystemService ( v1 ); // invoke-virtual {p0, v1}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;
/* check-cast v0, Landroid/net/ConnectivityManager; */
/* .line 74 */
/* .local v0, "cm":Landroid/net/ConnectivityManager; */
(( android.net.ConnectivityManager ) v0 ).getActiveNetworkInfo ( ); // invoke-virtual {v0}, Landroid/net/ConnectivityManager;->getActiveNetworkInfo()Landroid/net/NetworkInfo;
if ( v1 != null) { // if-eqz v1, :cond_0
(( android.net.ConnectivityManager ) v0 ).getActiveNetworkInfo ( ); // invoke-virtual {v0}, Landroid/net/ConnectivityManager;->getActiveNetworkInfo()Landroid/net/NetworkInfo;
v1 = (( android.net.NetworkInfo ) v1 ).isAvailable ( ); // invoke-virtual {v1}, Landroid/net/NetworkInfo;->isAvailable()Z
if ( v1 != null) { // if-eqz v1, :cond_0
(( android.net.ConnectivityManager ) v0 ).getActiveNetworkInfo ( ); // invoke-virtual {v0}, Landroid/net/ConnectivityManager;->getActiveNetworkInfo()Landroid/net/NetworkInfo;
v1 = (( android.net.NetworkInfo ) v1 ).isConnected ( ); // invoke-virtual {v1}, Landroid/net/NetworkInfo;->isConnected()Z
if ( v1 != null) { // if-eqz v1, :cond_0
/* .line 77 */
int v1 = 1; // const/4 v1, 0x1
/* .line 80 */
} // :goto_0
/* .line 79 */
} // :cond_0
final String v1 = "SR"; // const-string v1, "SR"
final String v2 = "Internet Connection Not Present"; // const-string v2, "Internet Connection Not Present"
android.util.Log .v ( v1,v2 );
/* .line 80 */
int v1 = 0; // const/4 v1, 0x0
} // .end method
public static void setRunFlag ( android.content.Context p0 ) {
/* .locals 4 */
/* .param p0, "ctx" # Landroid/content/Context; */
/* .prologue */
/* .line 247 */
final String v2 = "superrewards_prefs"; // const-string v2, "superrewards_prefs"
int v3 = 0; // const/4 v3, 0x0
(( android.content.Context ) p0 ).getSharedPreferences ( v2, v3 ); // invoke-virtual {p0, v2, v3}, Landroid/content/Context;->getSharedPreferences(Ljava/lang/String;I)Landroid/content/SharedPreferences;
/* .line 248 */
/* .local v1, "preferences":Landroid/content/SharedPreferences; */
/* .line 249 */
/* .local v0, "editor":Landroid/content/SharedPreferences$Editor; */
final String v2 = "superrewards_has_run"; // const-string v2, "superrewards_has_run"
int v3 = 1; // const/4 v3, 0x1
/* .line 250 */
return;
} // .end method
public static void setXMLIntoPrefs ( android.content.Context p0, java.lang.String p1 ) {
/* .locals 6 */
/* .param p0, "ctx" # Landroid/content/Context; */
/* .param p1, "xml" # Ljava/lang/String; */
/* .annotation system Ldalvik/annotation/Throws; */
/* value = { */
/* Ljava/io/IOException; */
/* } */
} // .end annotation
/* .prologue */
/* .line 225 */
final String v2 = "superrewards_prefs"; // const-string v2, "superrewards_prefs"
int v3 = 0; // const/4 v3, 0x0
(( android.content.Context ) p0 ).getSharedPreferences ( v2, v3 ); // invoke-virtual {p0, v2, v3}, Landroid/content/Context;->getSharedPreferences(Ljava/lang/String;I)Landroid/content/SharedPreferences;
/* .line 226 */
/* .local v1, "preferences":Landroid/content/SharedPreferences; */
/* .line 227 */
/* .local v0, "editor":Landroid/content/SharedPreferences$Editor; */
final String v2 = "superrewards_xml"; // const-string v2, "superrewards_xml"
final String v3 = "superrewards_timestamp_xml"; // const-string v3, "superrewards_timestamp_xml"
java.lang.System .currentTimeMillis ( );
/* move-result-wide v4 */
/* .line 228 */
return;
} // .end method
public static java.io.ByteArrayInputStream stringToInputStream ( java.lang.String p0 ) {
/* .locals 2 */
/* .param p0, "str" # Ljava/lang/String; */
/* .prologue */
/* .line 202 */
/* new-instance v0, Ljava/io/ByteArrayInputStream; */
(( java.lang.String ) p0 ).getBytes ( ); // invoke-virtual {p0}, Ljava/lang/String;->getBytes()[B
/* invoke-direct {v0, v1}, Ljava/io/ByteArrayInputStream;-><init>([B)V */
/* .line 203 */
/* .local v0, "bs":Ljava/io/ByteArrayInputStream; */
} // .end method
