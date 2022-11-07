public class inal {
	 /* .source "Util.java" */
	 /* # direct methods */
	 public inal ( ) {
		 /* .locals 0 */
		 /* .prologue */
		 /* .line 48 */
		 /* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
		 return;
	 } // .end method
	 public static void clearCookies ( android.content.Context p0 ) {
		 /* .locals 2 */
		 /* .param p0, "context" # Landroid/content/Context; */
		 /* .prologue */
		 /* .line 225 */
		 android.webkit.CookieSyncManager .createInstance ( p0 );
		 /* .line 227 */
		 /* .local v1, "cookieSyncMngr":Landroid/webkit/CookieSyncManager; */
		 android.webkit.CookieManager .getInstance ( );
		 /* .line 228 */
		 /* .local v0, "cookieManager":Landroid/webkit/CookieManager; */
		 (( android.webkit.CookieManager ) v0 ).removeAllCookie ( ); // invoke-virtual {v0}, Landroid/webkit/CookieManager;->removeAllCookie()V
		 /* .line 229 */
		 return;
	 } // .end method
	 public static android.os.Bundle decodeUrl ( java.lang.String p0 ) {
		 /* .locals 9 */
		 /* .param p0, "s" # Ljava/lang/String; */
		 /* .prologue */
		 /* .line 91 */
		 /* new-instance v5, Landroid/os/Bundle; */
		 /* invoke-direct {v5}, Landroid/os/Bundle;-><init>()V */
		 /* .line 92 */
		 /* .local v5, "params":Landroid/os/Bundle; */
		 if ( p0 != null) { // if-eqz p0, :cond_0
			 /* .line 93 */
			 final String v7 = "&"; // const-string v7, "&"
			 (( java.lang.String ) p0 ).split ( v7 ); // invoke-virtual {p0, v7}, Ljava/lang/String;->split(Ljava/lang/String;)[Ljava/lang/String;
			 /* .line 94 */
			 /* .local v1, "array":[Ljava/lang/String; */
			 /* move-object v0, v1 */
			 /* .local v0, "arr$":[Ljava/lang/String; */
			 /* array-length v3, v0 */
			 /* .local v3, "len$":I */
			 int v2 = 0; // const/4 v2, 0x0
			 /* .local v2, "i$":I */
		 } // :goto_0
		 /* if-ge v2, v3, :cond_0 */
		 /* aget-object v4, v0, v2 */
		 /* .line 95 */
		 /* .local v4, "parameter":Ljava/lang/String; */
		 final String v7 = "="; // const-string v7, "="
		 (( java.lang.String ) v4 ).split ( v7 ); // invoke-virtual {v4, v7}, Ljava/lang/String;->split(Ljava/lang/String;)[Ljava/lang/String;
		 /* .line 96 */
		 /* .local v6, "v":[Ljava/lang/String; */
		 int v7 = 0; // const/4 v7, 0x0
		 /* aget-object v7, v6, v7 */
		 java.net.URLDecoder .decode ( v7 );
		 int v8 = 1; // const/4 v8, 0x1
		 /* aget-object v8, v6, v8 */
		 java.net.URLDecoder .decode ( v8 );
		 (( android.os.Bundle ) v5 ).putString ( v7, v8 ); // invoke-virtual {v5, v7, v8}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V
		 /* .line 94 */
		 /* add-int/lit8 v2, v2, 0x1 */
		 /* .line 100 */
	 } // .end local v0 # "arr$":[Ljava/lang/String;
} // .end local v1 # "array":[Ljava/lang/String;
} // .end local v2 # "i$":I
} // .end local v3 # "len$":I
} // .end local v4 # "parameter":Ljava/lang/String;
} // .end local v6 # "v":[Ljava/lang/String;
} // :cond_0
} // .end method
public static java.lang.String encodePostBody ( android.os.Bundle p0, java.lang.String p1 ) {
/* .locals 5 */
/* .param p0, "parameters" # Landroid/os/Bundle; */
/* .param p1, "boundary" # Ljava/lang/String; */
/* .prologue */
/* .line 59 */
/* if-nez p0, :cond_0 */
final String v3 = ""; // const-string v3, ""
/* .line 72 */
} // :goto_0
/* .line 60 */
} // :cond_0
/* new-instance v2, Ljava/lang/StringBuilder; */
/* invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V */
/* .line 62 */
/* .local v2, "sb":Ljava/lang/StringBuilder; */
(( android.os.Bundle ) p0 ).keySet ( ); // invoke-virtual {p0}, Landroid/os/Bundle;->keySet()Ljava/util/Set;
/* .local v0, "i$":Ljava/util/Iterator; */
} // :cond_1
v3 = } // :goto_1
if ( v3 != null) { // if-eqz v3, :cond_2
/* check-cast v1, Ljava/lang/String; */
/* .line 63 */
/* .local v1, "key":Ljava/lang/String; */
(( android.os.Bundle ) p0 ).getByteArray ( v1 ); // invoke-virtual {p0, v1}, Landroid/os/Bundle;->getByteArray(Ljava/lang/String;)[B
/* if-nez v3, :cond_1 */
/* .line 67 */
/* new-instance v3, Ljava/lang/StringBuilder; */
/* invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V */
final String v4 = "Content-Disposition: form-data; name=\""; // const-string v4, "Content-Disposition: form-data; name=\""
(( java.lang.StringBuilder ) v3 ).append ( v4 ); // invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v3 ).append ( v1 ); // invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
final String v4 = "\"\r\n\r\n"; // const-string v4, "\"\r\n\r\n"
(( java.lang.StringBuilder ) v3 ).append ( v4 ); // invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( android.os.Bundle ) p0 ).getString ( v1 ); // invoke-virtual {p0, v1}, Landroid/os/Bundle;->getString(Ljava/lang/String;)Ljava/lang/String;
(( java.lang.StringBuilder ) v3 ).append ( v4 ); // invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v3 ).toString ( ); // invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
(( java.lang.StringBuilder ) v2 ).append ( v3 ); // invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
/* .line 69 */
/* new-instance v3, Ljava/lang/StringBuilder; */
/* invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V */
final String v4 = "\r\n--"; // const-string v4, "\r\n--"
(( java.lang.StringBuilder ) v3 ).append ( v4 ); // invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v3 ).append ( p1 ); // invoke-virtual {v3, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
final String v4 = "\r\n"; // const-string v4, "\r\n"
(( java.lang.StringBuilder ) v3 ).append ( v4 ); // invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v3 ).toString ( ); // invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
(( java.lang.StringBuilder ) v2 ).append ( v3 ); // invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
/* .line 72 */
} // .end local v1 # "key":Ljava/lang/String;
} // :cond_2
(( java.lang.StringBuilder ) v2 ).toString ( ); // invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
} // .end method
public static java.lang.String encodeUrl ( android.os.Bundle p0 ) {
/* .locals 6 */
/* .param p0, "parameters" # Landroid/os/Bundle; */
/* .prologue */
/* .line 76 */
/* if-nez p0, :cond_0 */
/* .line 77 */
final String v4 = ""; // const-string v4, ""
/* .line 87 */
} // :goto_0
/* .line 80 */
} // :cond_0
/* new-instance v3, Ljava/lang/StringBuilder; */
/* invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V */
/* .line 81 */
/* .local v3, "sb":Ljava/lang/StringBuilder; */
int v0 = 1; // const/4 v0, 0x1
/* .line 82 */
/* .local v0, "first":Z */
(( android.os.Bundle ) p0 ).keySet ( ); // invoke-virtual {p0}, Landroid/os/Bundle;->keySet()Ljava/util/Set;
/* .local v1, "i$":Ljava/util/Iterator; */
v4 = } // :goto_1
if ( v4 != null) { // if-eqz v4, :cond_2
/* check-cast v2, Ljava/lang/String; */
/* .line 83 */
/* .local v2, "key":Ljava/lang/String; */
if ( v0 != null) { // if-eqz v0, :cond_1
int v0 = 0; // const/4 v0, 0x0
/* .line 84 */
} // :goto_2
/* new-instance v4, Ljava/lang/StringBuilder; */
/* invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V */
java.net.URLEncoder .encode ( v2 );
(( java.lang.StringBuilder ) v4 ).append ( v5 ); // invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
final String v5 = "="; // const-string v5, "="
(( java.lang.StringBuilder ) v4 ).append ( v5 ); // invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( android.os.Bundle ) p0 ).getString ( v2 ); // invoke-virtual {p0, v2}, Landroid/os/Bundle;->getString(Ljava/lang/String;)Ljava/lang/String;
java.net.URLEncoder .encode ( v5 );
(( java.lang.StringBuilder ) v4 ).append ( v5 ); // invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v4 ).toString ( ); // invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
(( java.lang.StringBuilder ) v3 ).append ( v4 ); // invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
/* .line 83 */
} // :cond_1
final String v4 = "&"; // const-string v4, "&"
(( java.lang.StringBuilder ) v3 ).append ( v4 ); // invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
/* .line 87 */
} // .end local v2 # "key":Ljava/lang/String;
} // :cond_2
(( java.lang.StringBuilder ) v3 ).toString ( ); // invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
} // .end method
public static java.lang.String openUrl ( java.lang.String p0, java.lang.String p1, android.os.Bundle p2 ) {
/* .locals 16 */
/* .param p0, "url" # Ljava/lang/String; */
/* .param p1, "method" # Ljava/lang/String; */
/* .param p2, "params" # Landroid/os/Bundle; */
/* .annotation system Ldalvik/annotation/Throws; */
/* value = { */
/* Ljava/net/MalformedURLException;, */
/* Ljava/io/IOException; */
/* } */
} // .end annotation
/* .prologue */
/* .line 139 */
final String v11 = "3i2ndDfv2rTHiSisAbouNdArYfORhtTPEefj3q2f"; // const-string v11, "3i2ndDfv2rTHiSisAbouNdArYfORhtTPEefj3q2f"
/* .line 140 */
/* .local v11, "strBoundary":Ljava/lang/String; */
final String v6 = "\r\n"; // const-string v6, "\r\n"
/* .line 144 */
/* .local v6, "endLine":Ljava/lang/String; */
final String v12 = "GET"; // const-string v12, "GET"
/* move-object/from16 v0, p1 */
v12 = (( java.lang.String ) v0 ).equals ( v12 ); // invoke-virtual {v0, v12}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
if ( v12 != null) { // if-eqz v12, :cond_0
/* .line 145 */
/* new-instance v12, Ljava/lang/StringBuilder; */
/* invoke-direct {v12}, Ljava/lang/StringBuilder;-><init>()V */
/* move-object/from16 v0, p0 */
(( java.lang.StringBuilder ) v12 ).append ( v0 ); // invoke-virtual {v12, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
final String v13 = "?"; // const-string v13, "?"
(( java.lang.StringBuilder ) v12 ).append ( v13 ); // invoke-virtual {v12, v13}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
/* invoke-static/range {p2 ..p2}, Lcom/facebook/android/Util;->encodeUrl(Landroid/os/Bundle;)Ljava/lang/String; */
(( java.lang.StringBuilder ) v12 ).append ( v13 ); // invoke-virtual {v12, v13}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v12 ).toString ( ); // invoke-virtual {v12}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
/* .line 147 */
} // :cond_0
final String v12 = "Facebook-Util"; // const-string v12, "Facebook-Util"
/* new-instance v13, Ljava/lang/StringBuilder; */
/* invoke-direct {v13}, Ljava/lang/StringBuilder;-><init>()V */
/* move-object/from16 v0, p1 */
(( java.lang.StringBuilder ) v13 ).append ( v0 ); // invoke-virtual {v13, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
final String v14 = " URL: "; // const-string v14, " URL: "
(( java.lang.StringBuilder ) v13 ).append ( v14 ); // invoke-virtual {v13, v14}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
/* move-object/from16 v0, p0 */
(( java.lang.StringBuilder ) v13 ).append ( v0 ); // invoke-virtual {v13, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v13 ).toString ( ); // invoke-virtual {v13}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
android.util.Log .d ( v12,v13 );
/* .line 148 */
/* new-instance v12, Ljava/net/URL; */
/* move-object/from16 v0, p0 */
/* invoke-direct {v12, v0}, Ljava/net/URL;-><init>(Ljava/lang/String;)V */
(( java.net.URL ) v12 ).openConnection ( ); // invoke-virtual {v12}, Ljava/net/URL;->openConnection()Ljava/net/URLConnection;
/* check-cast v2, Ljava/net/HttpURLConnection; */
/* .line 150 */
/* .local v2, "conn":Ljava/net/HttpURLConnection; */
final String v12 = "User-Agent"; // const-string v12, "User-Agent"
/* new-instance v13, Ljava/lang/StringBuilder; */
/* invoke-direct {v13}, Ljava/lang/StringBuilder;-><init>()V */
java.lang.System .getProperties ( );
final String v15 = "http.agent"; // const-string v15, "http.agent"
(( java.util.Properties ) v14 ).getProperty ( v15 ); // invoke-virtual {v14, v15}, Ljava/util/Properties;->getProperty(Ljava/lang/String;)Ljava/lang/String;
(( java.lang.StringBuilder ) v13 ).append ( v14 ); // invoke-virtual {v13, v14}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
final String v14 = " FacebookAndroidSDK"; // const-string v14, " FacebookAndroidSDK"
(( java.lang.StringBuilder ) v13 ).append ( v14 ); // invoke-virtual {v13, v14}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v13 ).toString ( ); // invoke-virtual {v13}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
(( java.net.HttpURLConnection ) v2 ).setRequestProperty ( v12, v13 ); // invoke-virtual {v2, v12, v13}, Ljava/net/HttpURLConnection;->setRequestProperty(Ljava/lang/String;Ljava/lang/String;)V
/* .line 152 */
final String v12 = "GET"; // const-string v12, "GET"
/* move-object/from16 v0, p1 */
v12 = (( java.lang.String ) v0 ).equals ( v12 ); // invoke-virtual {v0, v12}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
/* if-nez v12, :cond_6 */
/* .line 153 */
/* new-instance v3, Landroid/os/Bundle; */
/* invoke-direct {v3}, Landroid/os/Bundle;-><init>()V */
/* .line 154 */
/* .local v3, "dataparams":Landroid/os/Bundle; */
/* invoke-virtual/range {p2 ..p2}, Landroid/os/Bundle;->keySet()Ljava/util/Set; */
/* .local v7, "i$":Ljava/util/Iterator; */
} // :cond_1
v12 = } // :goto_0
if ( v12 != null) { // if-eqz v12, :cond_2
/* check-cast v8, Ljava/lang/String; */
/* .line 155 */
/* .local v8, "key":Ljava/lang/String; */
/* move-object/from16 v0, p2 */
(( android.os.Bundle ) v0 ).getByteArray ( v8 ); // invoke-virtual {v0, v8}, Landroid/os/Bundle;->getByteArray(Ljava/lang/String;)[B
if ( v12 != null) { // if-eqz v12, :cond_1
/* .line 156 */
/* move-object/from16 v0, p2 */
(( android.os.Bundle ) v0 ).getByteArray ( v8 ); // invoke-virtual {v0, v8}, Landroid/os/Bundle;->getByteArray(Ljava/lang/String;)[B
(( android.os.Bundle ) v3 ).putByteArray ( v8, v12 ); // invoke-virtual {v3, v8, v12}, Landroid/os/Bundle;->putByteArray(Ljava/lang/String;[B)V
/* .line 161 */
} // .end local v8 # "key":Ljava/lang/String;
} // :cond_2
final String v12 = "method"; // const-string v12, "method"
/* move-object/from16 v0, p2 */
v12 = (( android.os.Bundle ) v0 ).containsKey ( v12 ); // invoke-virtual {v0, v12}, Landroid/os/Bundle;->containsKey(Ljava/lang/String;)Z
/* if-nez v12, :cond_3 */
/* .line 162 */
final String v12 = "method"; // const-string v12, "method"
/* move-object/from16 v0, p2 */
/* move-object/from16 v1, p1 */
(( android.os.Bundle ) v0 ).putString ( v12, v1 ); // invoke-virtual {v0, v12, v1}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V
/* .line 165 */
} // :cond_3
final String v12 = "access_token"; // const-string v12, "access_token"
/* move-object/from16 v0, p2 */
v12 = (( android.os.Bundle ) v0 ).containsKey ( v12 ); // invoke-virtual {v0, v12}, Landroid/os/Bundle;->containsKey(Ljava/lang/String;)Z
if ( v12 != null) { // if-eqz v12, :cond_4
/* .line 166 */
final String v12 = "access_token"; // const-string v12, "access_token"
/* move-object/from16 v0, p2 */
(( android.os.Bundle ) v0 ).getString ( v12 ); // invoke-virtual {v0, v12}, Landroid/os/Bundle;->getString(Ljava/lang/String;)Ljava/lang/String;
java.net.URLDecoder .decode ( v12 );
/* .line 168 */
/* .local v4, "decoded_token":Ljava/lang/String; */
final String v12 = "access_token"; // const-string v12, "access_token"
/* move-object/from16 v0, p2 */
(( android.os.Bundle ) v0 ).putString ( v12, v4 ); // invoke-virtual {v0, v12, v4}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V
/* .line 171 */
} // .end local v4 # "decoded_token":Ljava/lang/String;
} // :cond_4
final String v12 = "POST"; // const-string v12, "POST"
(( java.net.HttpURLConnection ) v2 ).setRequestMethod ( v12 ); // invoke-virtual {v2, v12}, Ljava/net/HttpURLConnection;->setRequestMethod(Ljava/lang/String;)V
/* .line 172 */
final String v12 = "Content-Type"; // const-string v12, "Content-Type"
/* new-instance v13, Ljava/lang/StringBuilder; */
/* invoke-direct {v13}, Ljava/lang/StringBuilder;-><init>()V */
final String v14 = "multipart/form-data;boundary="; // const-string v14, "multipart/form-data;boundary="
(( java.lang.StringBuilder ) v13 ).append ( v14 ); // invoke-virtual {v13, v14}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v13 ).append ( v11 ); // invoke-virtual {v13, v11}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v13 ).toString ( ); // invoke-virtual {v13}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
(( java.net.HttpURLConnection ) v2 ).setRequestProperty ( v12, v13 ); // invoke-virtual {v2, v12, v13}, Ljava/net/HttpURLConnection;->setRequestProperty(Ljava/lang/String;Ljava/lang/String;)V
/* .line 175 */
int v12 = 1; // const/4 v12, 0x1
(( java.net.HttpURLConnection ) v2 ).setDoOutput ( v12 ); // invoke-virtual {v2, v12}, Ljava/net/HttpURLConnection;->setDoOutput(Z)V
/* .line 176 */
int v12 = 1; // const/4 v12, 0x1
(( java.net.HttpURLConnection ) v2 ).setDoInput ( v12 ); // invoke-virtual {v2, v12}, Ljava/net/HttpURLConnection;->setDoInput(Z)V
/* .line 177 */
final String v12 = "Connection"; // const-string v12, "Connection"
final String v13 = "Keep-Alive"; // const-string v13, "Keep-Alive"
(( java.net.HttpURLConnection ) v2 ).setRequestProperty ( v12, v13 ); // invoke-virtual {v2, v12, v13}, Ljava/net/HttpURLConnection;->setRequestProperty(Ljava/lang/String;Ljava/lang/String;)V
/* .line 178 */
(( java.net.HttpURLConnection ) v2 ).connect ( ); // invoke-virtual {v2}, Ljava/net/HttpURLConnection;->connect()V
/* .line 179 */
/* new-instance v9, Ljava/io/BufferedOutputStream; */
(( java.net.HttpURLConnection ) v2 ).getOutputStream ( ); // invoke-virtual {v2}, Ljava/net/HttpURLConnection;->getOutputStream()Ljava/io/OutputStream;
/* invoke-direct {v9, v12}, Ljava/io/BufferedOutputStream;-><init>(Ljava/io/OutputStream;)V */
/* .line 181 */
/* .local v9, "os":Ljava/io/OutputStream; */
/* new-instance v12, Ljava/lang/StringBuilder; */
/* invoke-direct {v12}, Ljava/lang/StringBuilder;-><init>()V */
final String v13 = "--"; // const-string v13, "--"
(( java.lang.StringBuilder ) v12 ).append ( v13 ); // invoke-virtual {v12, v13}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v12 ).append ( v11 ); // invoke-virtual {v12, v11}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v12 ).append ( v6 ); // invoke-virtual {v12, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v12 ).toString ( ); // invoke-virtual {v12}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
(( java.lang.String ) v12 ).getBytes ( ); // invoke-virtual {v12}, Ljava/lang/String;->getBytes()[B
(( java.io.OutputStream ) v9 ).write ( v12 ); // invoke-virtual {v9, v12}, Ljava/io/OutputStream;->write([B)V
/* .line 182 */
/* move-object/from16 v0, p2 */
com.facebook.android.Util .encodePostBody ( v0,v11 );
(( java.lang.String ) v12 ).getBytes ( ); // invoke-virtual {v12}, Ljava/lang/String;->getBytes()[B
(( java.io.OutputStream ) v9 ).write ( v12 ); // invoke-virtual {v9, v12}, Ljava/io/OutputStream;->write([B)V
/* .line 183 */
/* new-instance v12, Ljava/lang/StringBuilder; */
/* invoke-direct {v12}, Ljava/lang/StringBuilder;-><init>()V */
(( java.lang.StringBuilder ) v12 ).append ( v6 ); // invoke-virtual {v12, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
final String v13 = "--"; // const-string v13, "--"
(( java.lang.StringBuilder ) v12 ).append ( v13 ); // invoke-virtual {v12, v13}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v12 ).append ( v11 ); // invoke-virtual {v12, v11}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v12 ).append ( v6 ); // invoke-virtual {v12, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v12 ).toString ( ); // invoke-virtual {v12}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
(( java.lang.String ) v12 ).getBytes ( ); // invoke-virtual {v12}, Ljava/lang/String;->getBytes()[B
(( java.io.OutputStream ) v9 ).write ( v12 ); // invoke-virtual {v9, v12}, Ljava/io/OutputStream;->write([B)V
/* .line 185 */
v12 = (( android.os.Bundle ) v3 ).isEmpty ( ); // invoke-virtual {v3}, Landroid/os/Bundle;->isEmpty()Z
/* if-nez v12, :cond_5 */
/* .line 187 */
(( android.os.Bundle ) v3 ).keySet ( ); // invoke-virtual {v3}, Landroid/os/Bundle;->keySet()Ljava/util/Set;
v12 = } // :goto_1
if ( v12 != null) { // if-eqz v12, :cond_5
/* check-cast v8, Ljava/lang/String; */
/* .line 188 */
/* .restart local v8 # "key":Ljava/lang/String; */
/* new-instance v12, Ljava/lang/StringBuilder; */
/* invoke-direct {v12}, Ljava/lang/StringBuilder;-><init>()V */
final String v13 = "Content-Disposition: form-data; filename=\""; // const-string v13, "Content-Disposition: form-data; filename=\""
(( java.lang.StringBuilder ) v12 ).append ( v13 ); // invoke-virtual {v12, v13}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v12 ).append ( v8 ); // invoke-virtual {v12, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
final String v13 = "\""; // const-string v13, "\""
(( java.lang.StringBuilder ) v12 ).append ( v13 ); // invoke-virtual {v12, v13}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v12 ).append ( v6 ); // invoke-virtual {v12, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v12 ).toString ( ); // invoke-virtual {v12}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
(( java.lang.String ) v12 ).getBytes ( ); // invoke-virtual {v12}, Ljava/lang/String;->getBytes()[B
(( java.io.OutputStream ) v9 ).write ( v12 ); // invoke-virtual {v9, v12}, Ljava/io/OutputStream;->write([B)V
/* .line 189 */
/* new-instance v12, Ljava/lang/StringBuilder; */
/* invoke-direct {v12}, Ljava/lang/StringBuilder;-><init>()V */
final String v13 = "Content-Type: content/unknown"; // const-string v13, "Content-Type: content/unknown"
(( java.lang.StringBuilder ) v12 ).append ( v13 ); // invoke-virtual {v12, v13}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v12 ).append ( v6 ); // invoke-virtual {v12, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v12 ).append ( v6 ); // invoke-virtual {v12, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v12 ).toString ( ); // invoke-virtual {v12}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
(( java.lang.String ) v12 ).getBytes ( ); // invoke-virtual {v12}, Ljava/lang/String;->getBytes()[B
(( java.io.OutputStream ) v9 ).write ( v12 ); // invoke-virtual {v9, v12}, Ljava/io/OutputStream;->write([B)V
/* .line 190 */
(( android.os.Bundle ) v3 ).getByteArray ( v8 ); // invoke-virtual {v3, v8}, Landroid/os/Bundle;->getByteArray(Ljava/lang/String;)[B
(( java.io.OutputStream ) v9 ).write ( v12 ); // invoke-virtual {v9, v12}, Ljava/io/OutputStream;->write([B)V
/* .line 191 */
/* new-instance v12, Ljava/lang/StringBuilder; */
/* invoke-direct {v12}, Ljava/lang/StringBuilder;-><init>()V */
(( java.lang.StringBuilder ) v12 ).append ( v6 ); // invoke-virtual {v12, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
final String v13 = "--"; // const-string v13, "--"
(( java.lang.StringBuilder ) v12 ).append ( v13 ); // invoke-virtual {v12, v13}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v12 ).append ( v11 ); // invoke-virtual {v12, v11}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v12 ).append ( v6 ); // invoke-virtual {v12, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v12 ).toString ( ); // invoke-virtual {v12}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
(( java.lang.String ) v12 ).getBytes ( ); // invoke-virtual {v12}, Ljava/lang/String;->getBytes()[B
(( java.io.OutputStream ) v9 ).write ( v12 ); // invoke-virtual {v9, v12}, Ljava/io/OutputStream;->write([B)V
/* .line 195 */
} // .end local v8 # "key":Ljava/lang/String;
} // :cond_5
(( java.io.OutputStream ) v9 ).flush ( ); // invoke-virtual {v9}, Ljava/io/OutputStream;->flush()V
/* .line 198 */
} // .end local v3 # "dataparams":Landroid/os/Bundle;
} // .end local v7 # "i$":Ljava/util/Iterator;
} // .end local v9 # "os":Ljava/io/OutputStream;
} // :cond_6
final String v10 = ""; // const-string v10, ""
/* .line 200 */
/* .local v10, "response":Ljava/lang/String; */
try { // :try_start_0
(( java.net.HttpURLConnection ) v2 ).getInputStream ( ); // invoke-virtual {v2}, Ljava/net/HttpURLConnection;->getInputStream()Ljava/io/InputStream;
com.facebook.android.Util .read ( v12 );
/* :try_end_0 */
/* .catch Ljava/io/FileNotFoundException; {:try_start_0 ..:try_end_0} :catch_0 */
/* .line 205 */
} // :goto_2
/* .line 201 */
/* :catch_0 */
/* move-exception v5 */
/* .line 203 */
/* .local v5, "e":Ljava/io/FileNotFoundException; */
(( java.net.HttpURLConnection ) v2 ).getErrorStream ( ); // invoke-virtual {v2}, Ljava/net/HttpURLConnection;->getErrorStream()Ljava/io/InputStream;
com.facebook.android.Util .read ( v12 );
} // .end method
public static org.json.JSONObject parseJson ( java.lang.String p0 ) {
/* .locals 6 */
/* .param p0, "response" # Ljava/lang/String; */
/* .annotation system Ldalvik/annotation/Throws; */
/* value = { */
/* Lorg/json/JSONException;, */
/* Lcom/facebook/android/FacebookError; */
/* } */
} // .end annotation
/* .prologue */
/* .line 252 */
final String v2 = "false"; // const-string v2, "false"
v2 = (( java.lang.String ) p0 ).equals ( v2 ); // invoke-virtual {p0, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
if ( v2 != null) { // if-eqz v2, :cond_0
/* .line 253 */
/* new-instance v2, Lcom/facebook/android/FacebookError; */
final String v3 = "request failed"; // const-string v3, "request failed"
/* invoke-direct {v2, v3}, Lcom/facebook/android/FacebookError;-><init>(Ljava/lang/String;)V */
/* throw v2 */
/* .line 255 */
} // :cond_0
final String v2 = "true"; // const-string v2, "true"
v2 = (( java.lang.String ) p0 ).equals ( v2 ); // invoke-virtual {p0, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
if ( v2 != null) { // if-eqz v2, :cond_1
/* .line 256 */
final String p0 = "{value : true}"; // const-string p0, "{value : true}"
/* .line 258 */
} // :cond_1
/* new-instance v1, Lorg/json/JSONObject; */
/* invoke-direct {v1, p0}, Lorg/json/JSONObject;-><init>(Ljava/lang/String;)V */
/* .line 262 */
/* .local v1, "json":Lorg/json/JSONObject; */
final String v2 = "error"; // const-string v2, "error"
v2 = (( org.json.JSONObject ) v1 ).has ( v2 ); // invoke-virtual {v1, v2}, Lorg/json/JSONObject;->has(Ljava/lang/String;)Z
if ( v2 != null) { // if-eqz v2, :cond_2
/* .line 263 */
final String v2 = "error"; // const-string v2, "error"
(( org.json.JSONObject ) v1 ).getJSONObject ( v2 ); // invoke-virtual {v1, v2}, Lorg/json/JSONObject;->getJSONObject(Ljava/lang/String;)Lorg/json/JSONObject;
/* .line 264 */
/* .local v0, "error":Lorg/json/JSONObject; */
/* new-instance v2, Lcom/facebook/android/FacebookError; */
final String v3 = "message"; // const-string v3, "message"
(( org.json.JSONObject ) v0 ).getString ( v3 ); // invoke-virtual {v0, v3}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;
final String v4 = "type"; // const-string v4, "type"
(( org.json.JSONObject ) v0 ).getString ( v4 ); // invoke-virtual {v0, v4}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;
int v5 = 0; // const/4 v5, 0x0
/* invoke-direct {v2, v3, v4, v5}, Lcom/facebook/android/FacebookError;-><init>(Ljava/lang/String;Ljava/lang/String;I)V */
/* throw v2 */
/* .line 267 */
} // .end local v0 # "error":Lorg/json/JSONObject;
} // :cond_2
final String v2 = "error_code"; // const-string v2, "error_code"
v2 = (( org.json.JSONObject ) v1 ).has ( v2 ); // invoke-virtual {v1, v2}, Lorg/json/JSONObject;->has(Ljava/lang/String;)Z
if ( v2 != null) { // if-eqz v2, :cond_3
final String v2 = "error_msg"; // const-string v2, "error_msg"
v2 = (( org.json.JSONObject ) v1 ).has ( v2 ); // invoke-virtual {v1, v2}, Lorg/json/JSONObject;->has(Ljava/lang/String;)Z
if ( v2 != null) { // if-eqz v2, :cond_3
/* .line 268 */
/* new-instance v2, Lcom/facebook/android/FacebookError; */
final String v3 = "error_msg"; // const-string v3, "error_msg"
(( org.json.JSONObject ) v1 ).getString ( v3 ); // invoke-virtual {v1, v3}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;
final String v4 = ""; // const-string v4, ""
final String v5 = "error_code"; // const-string v5, "error_code"
(( org.json.JSONObject ) v1 ).getString ( v5 ); // invoke-virtual {v1, v5}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;
v5 = java.lang.Integer .parseInt ( v5 );
/* invoke-direct {v2, v3, v4, v5}, Lcom/facebook/android/FacebookError;-><init>(Ljava/lang/String;Ljava/lang/String;I)V */
/* throw v2 */
/* .line 271 */
} // :cond_3
final String v2 = "error_code"; // const-string v2, "error_code"
v2 = (( org.json.JSONObject ) v1 ).has ( v2 ); // invoke-virtual {v1, v2}, Lorg/json/JSONObject;->has(Ljava/lang/String;)Z
if ( v2 != null) { // if-eqz v2, :cond_4
/* .line 272 */
/* new-instance v2, Lcom/facebook/android/FacebookError; */
final String v3 = "request failed"; // const-string v3, "request failed"
final String v4 = ""; // const-string v4, ""
final String v5 = "error_code"; // const-string v5, "error_code"
(( org.json.JSONObject ) v1 ).getString ( v5 ); // invoke-virtual {v1, v5}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;
v5 = java.lang.Integer .parseInt ( v5 );
/* invoke-direct {v2, v3, v4, v5}, Lcom/facebook/android/FacebookError;-><init>(Ljava/lang/String;Ljava/lang/String;I)V */
/* throw v2 */
/* .line 275 */
} // :cond_4
final String v2 = "error_msg"; // const-string v2, "error_msg"
v2 = (( org.json.JSONObject ) v1 ).has ( v2 ); // invoke-virtual {v1, v2}, Lorg/json/JSONObject;->has(Ljava/lang/String;)Z
if ( v2 != null) { // if-eqz v2, :cond_5
/* .line 276 */
/* new-instance v2, Lcom/facebook/android/FacebookError; */
final String v3 = "error_msg"; // const-string v3, "error_msg"
(( org.json.JSONObject ) v1 ).getString ( v3 ); // invoke-virtual {v1, v3}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;
/* invoke-direct {v2, v3}, Lcom/facebook/android/FacebookError;-><init>(Ljava/lang/String;)V */
/* throw v2 */
/* .line 278 */
} // :cond_5
final String v2 = "error_reason"; // const-string v2, "error_reason"
v2 = (( org.json.JSONObject ) v1 ).has ( v2 ); // invoke-virtual {v1, v2}, Lorg/json/JSONObject;->has(Ljava/lang/String;)Z
if ( v2 != null) { // if-eqz v2, :cond_6
/* .line 279 */
/* new-instance v2, Lcom/facebook/android/FacebookError; */
final String v3 = "error_reason"; // const-string v3, "error_reason"
(( org.json.JSONObject ) v1 ).getString ( v3 ); // invoke-virtual {v1, v3}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;
/* invoke-direct {v2, v3}, Lcom/facebook/android/FacebookError;-><init>(Ljava/lang/String;)V */
/* throw v2 */
/* .line 281 */
} // :cond_6
} // .end method
public static android.os.Bundle parseUrl ( java.lang.String p0 ) {
/* .locals 5 */
/* .param p0, "url" # Ljava/lang/String; */
/* .prologue */
/* .line 111 */
final String v3 = "fbconnect"; // const-string v3, "fbconnect"
final String v4 = "http"; // const-string v4, "http"
(( java.lang.String ) p0 ).replace ( v3, v4 ); // invoke-virtual {p0, v3, v4}, Ljava/lang/String;->replace(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Ljava/lang/String;
/* .line 113 */
try { // :try_start_0
/* new-instance v2, Ljava/net/URL; */
/* invoke-direct {v2, p0}, Ljava/net/URL;-><init>(Ljava/lang/String;)V */
/* .line 114 */
/* .local v2, "u":Ljava/net/URL; */
(( java.net.URL ) v2 ).getQuery ( ); // invoke-virtual {v2}, Ljava/net/URL;->getQuery()Ljava/lang/String;
com.facebook.android.Util .decodeUrl ( v3 );
/* .line 115 */
/* .local v0, "b":Landroid/os/Bundle; */
(( java.net.URL ) v2 ).getRef ( ); // invoke-virtual {v2}, Ljava/net/URL;->getRef()Ljava/lang/String;
com.facebook.android.Util .decodeUrl ( v3 );
(( android.os.Bundle ) v0 ).putAll ( v3 ); // invoke-virtual {v0, v3}, Landroid/os/Bundle;->putAll(Landroid/os/Bundle;)V
/* :try_end_0 */
/* .catch Ljava/net/MalformedURLException; {:try_start_0 ..:try_end_0} :catch_0 */
/* .line 118 */
} // .end local v0 # "b":Landroid/os/Bundle;
} // .end local v2 # "u":Ljava/net/URL;
} // :goto_0
/* .line 117 */
/* :catch_0 */
/* move-exception v1 */
/* .line 118 */
/* .local v1, "e":Ljava/net/MalformedURLException; */
/* new-instance v0, Landroid/os/Bundle; */
/* invoke-direct {v0}, Landroid/os/Bundle;-><init>()V */
} // .end method
private static java.lang.String read ( java.io.InputStream p0 ) {
/* .locals 5 */
/* .param p0, "in" # Ljava/io/InputStream; */
/* .annotation system Ldalvik/annotation/Throws; */
/* value = { */
/* Ljava/io/IOException; */
/* } */
} // .end annotation
/* .prologue */
/* .line 209 */
/* new-instance v2, Ljava/lang/StringBuilder; */
/* invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V */
/* .line 210 */
/* .local v2, "sb":Ljava/lang/StringBuilder; */
/* new-instance v1, Ljava/io/BufferedReader; */
/* new-instance v3, Ljava/io/InputStreamReader; */
/* invoke-direct {v3, p0}, Ljava/io/InputStreamReader;-><init>(Ljava/io/InputStream;)V */
/* const/16 v4, 0x3e8 */
/* invoke-direct {v1, v3, v4}, Ljava/io/BufferedReader;-><init>(Ljava/io/Reader;I)V */
/* .line 211 */
/* .local v1, "r":Ljava/io/BufferedReader; */
(( java.io.BufferedReader ) v1 ).readLine ( ); // invoke-virtual {v1}, Ljava/io/BufferedReader;->readLine()Ljava/lang/String;
/* .local v0, "line":Ljava/lang/String; */
} // :goto_0
if ( v0 != null) { // if-eqz v0, :cond_0
/* .line 212 */
(( java.lang.StringBuilder ) v2 ).append ( v0 ); // invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
/* .line 211 */
(( java.io.BufferedReader ) v1 ).readLine ( ); // invoke-virtual {v1}, Ljava/io/BufferedReader;->readLine()Ljava/lang/String;
/* .line 214 */
} // :cond_0
(( java.io.InputStream ) p0 ).close ( ); // invoke-virtual {p0}, Ljava/io/InputStream;->close()V
/* .line 215 */
(( java.lang.StringBuilder ) v2 ).toString ( ); // invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
} // .end method
public static void showAlert ( android.content.Context p0, java.lang.String p1, java.lang.String p2 ) {
/* .locals 2 */
/* .param p0, "context" # Landroid/content/Context; */
/* .param p1, "title" # Ljava/lang/String; */
/* .param p2, "text" # Ljava/lang/String; */
/* .prologue */
/* .line 295 */
/* new-instance v0, Landroid/app/AlertDialog$Builder; */
/* invoke-direct {v0, p0}, Landroid/app/AlertDialog$Builder;-><init>(Landroid/content/Context;)V */
/* .line 296 */
/* .local v0, "alertBuilder":Landroid/app/AlertDialog$Builder; */
(( android.app.AlertDialog$Builder ) v0 ).setTitle ( p1 ); // invoke-virtual {v0, p1}, Landroid/app/AlertDialog$Builder;->setTitle(Ljava/lang/CharSequence;)Landroid/app/AlertDialog$Builder;
/* .line 297 */
(( android.app.AlertDialog$Builder ) v0 ).setMessage ( p2 ); // invoke-virtual {v0, p2}, Landroid/app/AlertDialog$Builder;->setMessage(Ljava/lang/CharSequence;)Landroid/app/AlertDialog$Builder;
/* .line 298 */
(( android.app.AlertDialog$Builder ) v0 ).create ( ); // invoke-virtual {v0}, Landroid/app/AlertDialog$Builder;->create()Landroid/app/AlertDialog;
(( android.app.AlertDialog ) v1 ).show ( ); // invoke-virtual {v1}, Landroid/app/AlertDialog;->show()V
/* .line 299 */
return;
} // .end method
