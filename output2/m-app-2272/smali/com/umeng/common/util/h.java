public class com.umeng.common.util.h {
	 /* .source "Helper.java" */
	 /* # static fields */
	 public static final java.lang.String a;
	 private static final java.lang.String b;
	 /* # direct methods */
	 static com.umeng.common.util.h ( ) {
		 /* .locals 1 */
		 /* .prologue */
		 /* .line 32 */
		 final String v0 = "line.separator"; // const-string v0, "line.separator"
		 java.lang.System .getProperty ( v0 );
		 /* .line 31 */
		 /* .line 33 */
		 return;
	 } // .end method
	 public com.umeng.common.util.h ( ) {
		 /* .locals 0 */
		 /* .prologue */
		 /* .line 27 */
		 /* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
		 return;
	 } // .end method
	 public static java.lang.String a ( ) {
		 /* .locals 1 */
		 /* .prologue */
		 /* .line 245 */
		 /* new-instance v0, Ljava/util/Date; */
		 /* invoke-direct {v0}, Ljava/util/Date;-><init>()V */
		 /* .line 246 */
		 com.umeng.common.util.h .a ( v0 );
	 } // .end method
	 public static java.lang.String a ( android.content.Context p0, Long p1 ) {
		 /* .locals 6 */
		 /* .prologue */
		 /* .line 139 */
		 final String v0 = ""; // const-string v0, ""
		 /* .line 140 */
		 /* const-wide/16 v0, 0x3e8 */
		 /* cmp-long v0, p1, v0 */
		 /* if-gez v0, :cond_0 */
		 /* .line 141 */
		 /* new-instance v0, Ljava/lang/StringBuilder; */
		 /* long-to-int v1, p1 */
		 java.lang.String .valueOf ( v1 );
		 /* invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V */
		 final String v1 = "B"; // const-string v1, "B"
		 (( java.lang.StringBuilder ) v0 ).append ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
		 (( java.lang.StringBuilder ) v0 ).toString ( ); // invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
		 /* .line 151 */
	 } // :goto_0
	 /* .line 142 */
} // :cond_0
/* const-wide/32 v0, 0xf4240 */
/* cmp-long v0, p1, v0 */
/* if-gez v0, :cond_1 */
/* .line 143 */
/* new-instance v0, Ljava/lang/StringBuilder; */
/* long-to-float v1, p1 */
/* float-to-double v1, v1 */
/* const-wide v3, 0x408f400000000000L # 1000.0 */
/* div-double/2addr v1, v3 */
java.lang.Math .round ( v1,v2 );
/* move-result-wide v1 */
java.lang.String .valueOf ( v1,v2 );
/* invoke-direct {v0, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V */
final String v1 = "K"; // const-string v1, "K"
(( java.lang.StringBuilder ) v0 ).append ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v0 ).toString ( ); // invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
/* .line 144 */
} // :cond_1
/* const-wide/32 v0, 0x3b9aca00 */
/* cmp-long v0, p1, v0 */
/* if-gez v0, :cond_2 */
/* .line 145 */
/* new-instance v0, Ljava/text/DecimalFormat; */
final String v1 = "#0.0"; // const-string v1, "#0.0"
/* invoke-direct {v0, v1}, Ljava/text/DecimalFormat;-><init>(Ljava/lang/String;)V */
/* .line 146 */
/* new-instance v1, Ljava/lang/StringBuilder; */
/* long-to-float v2, p1 */
/* float-to-double v2, v2 */
/* const-wide v4, 0x412e848000000000L # 1000000.0 */
/* div-double/2addr v2, v4 */
(( java.text.DecimalFormat ) v0 ).format ( v2, v3 ); // invoke-virtual {v0, v2, v3}, Ljava/text/DecimalFormat;->format(D)Ljava/lang/String;
java.lang.String .valueOf ( v0 );
/* invoke-direct {v1, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V */
final String v0 = "M"; // const-string v0, "M"
(( java.lang.StringBuilder ) v1 ).append ( v0 ); // invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v0 ).toString ( ); // invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
/* .line 148 */
} // :cond_2
/* new-instance v0, Ljava/text/DecimalFormat; */
final String v1 = "#0.00"; // const-string v1, "#0.00"
/* invoke-direct {v0, v1}, Ljava/text/DecimalFormat;-><init>(Ljava/lang/String;)V */
/* .line 149 */
/* new-instance v1, Ljava/lang/StringBuilder; */
/* long-to-float v2, p1 */
/* float-to-double v2, v2 */
/* const-wide v4, 0x41cdcd6500000000L # 1.0E9 */
/* div-double/2addr v2, v4 */
(( java.text.DecimalFormat ) v0 ).format ( v2, v3 ); // invoke-virtual {v0, v2, v3}, Ljava/text/DecimalFormat;->format(D)Ljava/lang/String;
java.lang.String .valueOf ( v0 );
/* invoke-direct {v1, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V */
final String v0 = "G"; // const-string v0, "G"
(( java.lang.StringBuilder ) v1 ).append ( v0 ); // invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v0 ).toString ( ); // invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
} // .end method
public static java.lang.String a ( java.io.File p0 ) {
/* .locals 7 */
/* .prologue */
/* const/16 v0, 0x400 */
int v6 = 1; // const/4 v6, 0x1
int v5 = 0; // const/4 v5, 0x0
/* .line 98 */
/* .line 100 */
/* new-array v0, v0, [B */
/* .line 103 */
try { // :try_start_0
(( java.io.File ) p0 ).isFile ( ); // invoke-virtual {p0}, Ljava/io/File;->isFile()Z
/* :try_end_0 */
v1 = /* .catch Ljava/lang/Exception; {:try_start_0 ..:try_end_0} :catch_0 */
/* if-nez v1, :cond_0 */
/* .line 104 */
final String v0 = ""; // const-string v0, ""
/* .line 117 */
} // :goto_0
/* .line 106 */
} // :cond_0
try { // :try_start_1
final String v1 = "MD5"; // const-string v1, "MD5"
java.security.MessageDigest .getInstance ( v1 );
/* .line 107 */
/* new-instance v2, Ljava/io/FileInputStream; */
/* invoke-direct {v2, p0}, Ljava/io/FileInputStream;-><init>(Ljava/io/File;)V */
/* .line 108 */
} // :goto_1
int v3 = 0; // const/4 v3, 0x0
/* const/16 v4, 0x400 */
v3 = (( java.io.FileInputStream ) v2 ).read ( v0, v3, v4 ); // invoke-virtual {v2, v0, v3, v4}, Ljava/io/FileInputStream;->read([BII)I
int v4 = -1; // const/4 v4, -0x1
/* if-ne v3, v4, :cond_1 */
/* .line 111 */
(( java.io.FileInputStream ) v2 ).close ( ); // invoke-virtual {v2}, Ljava/io/FileInputStream;->close()V
/* :try_end_1 */
/* .catch Ljava/lang/Exception; {:try_start_1 ..:try_end_1} :catch_0 */
/* .line 116 */
/* new-instance v0, Ljava/math/BigInteger; */
(( java.security.MessageDigest ) v1 ).digest ( ); // invoke-virtual {v1}, Ljava/security/MessageDigest;->digest()[B
/* invoke-direct {v0, v6, v1}, Ljava/math/BigInteger;-><init>(I[B)V */
/* .line 117 */
final String v1 = "%1$032x"; // const-string v1, "%1$032x"
/* new-array v2, v6, [Ljava/lang/Object; */
/* aput-object v0, v2, v5 */
java.lang.String .format ( v1,v2 );
/* .line 109 */
} // :cond_1
int v4 = 0; // const/4 v4, 0x0
try { // :try_start_2
(( java.security.MessageDigest ) v1 ).update ( v0, v4, v3 ); // invoke-virtual {v1, v0, v4, v3}, Ljava/security/MessageDigest;->update([BII)V
/* :try_end_2 */
/* .catch Ljava/lang/Exception; {:try_start_2 ..:try_end_2} :catch_0 */
/* .line 112 */
/* :catch_0 */
/* move-exception v0 */
/* .line 113 */
(( java.lang.Exception ) v0 ).printStackTrace ( ); // invoke-virtual {v0}, Ljava/lang/Exception;->printStackTrace()V
/* .line 114 */
int v0 = 0; // const/4 v0, 0x0
} // .end method
public static java.lang.String a ( java.lang.String p0 ) {
/* .locals 7 */
/* .prologue */
int v0 = 0; // const/4 v0, 0x0
/* .line 42 */
/* if-nez p0, :cond_0 */
/* .line 43 */
int v0 = 0; // const/4 v0, 0x0
/* .line 58 */
} // :goto_0
/* .line 45 */
} // :cond_0
try { // :try_start_0
(( java.lang.String ) p0 ).getBytes ( ); // invoke-virtual {p0}, Ljava/lang/String;->getBytes()[B
/* .line 46 */
final String v2 = "MD5"; // const-string v2, "MD5"
java.security.MessageDigest .getInstance ( v2 );
/* .line 47 */
(( java.security.MessageDigest ) v2 ).reset ( ); // invoke-virtual {v2}, Ljava/security/MessageDigest;->reset()V
/* .line 48 */
(( java.security.MessageDigest ) v2 ).update ( v1 ); // invoke-virtual {v2, v1}, Ljava/security/MessageDigest;->update([B)V
/* .line 49 */
(( java.security.MessageDigest ) v2 ).digest ( ); // invoke-virtual {v2}, Ljava/security/MessageDigest;->digest()[B
/* .line 50 */
/* new-instance v2, Ljava/lang/StringBuffer; */
/* invoke-direct {v2}, Ljava/lang/StringBuffer;-><init>()V */
/* .line 51 */
} // :goto_1
/* array-length v3, v1 */
/* if-lt v0, v3, :cond_1 */
/* .line 55 */
(( java.lang.StringBuffer ) v2 ).toString ( ); // invoke-virtual {v2}, Ljava/lang/StringBuffer;->toString()Ljava/lang/String;
/* .line 52 */
} // :cond_1
final String v3 = "%02X"; // const-string v3, "%02X"
int v4 = 1; // const/4 v4, 0x1
/* new-array v4, v4, [Ljava/lang/Object; */
int v5 = 0; // const/4 v5, 0x0
/* aget-byte v6, v1, v0 */
java.lang.Byte .valueOf ( v6 );
/* aput-object v6, v4, v5 */
java.lang.String .format ( v3,v4 );
(( java.lang.StringBuffer ) v2 ).append ( v3 ); // invoke-virtual {v2, v3}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;
/* :try_end_0 */
/* .catch Ljava/lang/Exception; {:try_start_0 ..:try_end_0} :catch_0 */
/* .line 51 */
/* add-int/lit8 v0, v0, 0x1 */
/* .line 57 */
/* :catch_0 */
/* move-exception v0 */
/* .line 58 */
final String v0 = "[^[a-z][A-Z][0-9][.][_]]"; // const-string v0, "[^[a-z][A-Z][0-9][.][_]]"
final String v1 = ""; // const-string v1, ""
(( java.lang.String ) p0 ).replaceAll ( v0, v1 ); // invoke-virtual {p0, v0, v1}, Ljava/lang/String;->replaceAll(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
} // .end method
public static java.lang.String a ( java.util.Date p0 ) {
/* .locals 3 */
/* .prologue */
/* .line 255 */
/* if-nez p0, :cond_0 */
/* .line 256 */
final String v0 = ""; // const-string v0, ""
/* .line 258 */
} // :goto_0
/* .line 257 */
} // :cond_0
/* new-instance v0, Ljava/text/SimpleDateFormat; */
final String v1 = "yyyy-MM-dd HH:mm:ss"; // const-string v1, "yyyy-MM-dd HH:mm:ss"
v2 = java.util.Locale.US;
/* invoke-direct {v0, v1, v2}, Ljava/text/SimpleDateFormat;-><init>(Ljava/lang/String;Ljava/util/Locale;)V */
/* .line 258 */
(( java.text.DateFormat ) v0 ).format ( p0 ); // invoke-virtual {v0, p0}, Ljava/text/DateFormat;->format(Ljava/util/Date;)Ljava/lang/String;
} // .end method
public static void a ( android.content.Context p0, java.lang.String p1 ) {
/* .locals 1 */
/* .prologue */
/* .line 185 */
(( android.content.Context ) p0 ).getPackageManager ( ); // invoke-virtual {p0}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;
/* .line 186 */
(( android.content.pm.PackageManager ) v0 ).getLaunchIntentForPackage ( p1 ); // invoke-virtual {v0, p1}, Landroid/content/pm/PackageManager;->getLaunchIntentForPackage(Ljava/lang/String;)Landroid/content/Intent;
/* .line 187 */
(( android.content.Context ) p0 ).startActivity ( v0 ); // invoke-virtual {p0, v0}, Landroid/content/Context;->startActivity(Landroid/content/Intent;)V
/* .line 188 */
return;
} // .end method
public static java.lang.String b ( java.lang.String p0 ) {
/* .locals 4 */
/* .prologue */
/* .line 73 */
try { // :try_start_0
final String v0 = "MD5"; // const-string v0, "MD5"
java.security.MessageDigest .getInstance ( v0 );
/* .line 74 */
(( java.lang.String ) p0 ).getBytes ( ); // invoke-virtual {p0}, Ljava/lang/String;->getBytes()[B
(( java.security.MessageDigest ) v0 ).update ( v1 ); // invoke-virtual {v0, v1}, Ljava/security/MessageDigest;->update([B)V
/* .line 75 */
(( java.security.MessageDigest ) v0 ).digest ( ); // invoke-virtual {v0}, Ljava/security/MessageDigest;->digest()[B
/* .line 78 */
/* new-instance v2, Ljava/lang/StringBuffer; */
/* invoke-direct {v2}, Ljava/lang/StringBuffer;-><init>()V */
/* .line 79 */
int v0 = 0; // const/4 v0, 0x0
} // :goto_0
/* array-length v3, v1 */
/* if-lt v0, v3, :cond_0 */
/* .line 83 */
(( java.lang.StringBuffer ) v2 ).toString ( ); // invoke-virtual {v2}, Ljava/lang/StringBuffer;->toString()Ljava/lang/String;
/* .line 88 */
} // :goto_1
/* .line 80 */
} // :cond_0
/* aget-byte v3, v1, v0 */
/* and-int/lit16 v3, v3, 0xff */
/* .line 81 */
java.lang.Integer .toHexString ( v3 );
(( java.lang.StringBuffer ) v2 ).append ( v3 ); // invoke-virtual {v2, v3}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;
/* :try_end_0 */
/* .catch Ljava/security/NoSuchAlgorithmException; {:try_start_0 ..:try_end_0} :catch_0 */
/* .line 79 */
/* add-int/lit8 v0, v0, 0x1 */
/* .line 85 */
/* :catch_0 */
/* move-exception v0 */
/* .line 86 */
final String v1 = "helper"; // const-string v1, "helper"
final String v2 = "getMD5 error"; // const-string v2, "getMD5 error"
com.umeng.common.Log .a ( v1,v2,v0 );
/* .line 88 */
final String v0 = ""; // const-string v0, ""
} // .end method
public static Boolean b ( android.content.Context p0, java.lang.String p1 ) {
/* .locals 3 */
/* .prologue */
/* .line 200 */
try { // :try_start_0
/* new-instance v0, Landroid/content/Intent; */
final String v1 = "android.intent.action.VIEW"; // const-string v1, "android.intent.action.VIEW"
android.net.Uri .parse ( p1 );
/* invoke-direct {v0, v1, v2}, Landroid/content/Intent;-><init>(Ljava/lang/String;Landroid/net/Uri;)V */
/* .line 201 */
(( android.content.Context ) p0 ).startActivity ( v0 ); // invoke-virtual {p0, v0}, Landroid/content/Context;->startActivity(Landroid/content/Intent;)V
/* :try_end_0 */
/* .catch Ljava/lang/Exception; {:try_start_0 ..:try_end_0} :catch_0 */
/* .line 206 */
int v0 = 1; // const/4 v0, 0x1
} // :goto_0
/* .line 202 */
/* :catch_0 */
/* move-exception v0 */
/* .line 203 */
(( java.lang.Exception ) v0 ).printStackTrace ( ); // invoke-virtual {v0}, Ljava/lang/Exception;->printStackTrace()V
/* .line 204 */
int v0 = 0; // const/4 v0, 0x0
} // .end method
public static java.lang.String c ( java.lang.String p0 ) {
/* .locals 6 */
/* .prologue */
/* .line 155 */
final String v0 = ""; // const-string v0, ""
/* .line 158 */
try { // :try_start_0
java.lang.Long .valueOf ( p0 );
(( java.lang.Long ) v0 ).longValue ( ); // invoke-virtual {v0}, Ljava/lang/Long;->longValue()J
/* :try_end_0 */
/* .catch Ljava/lang/NumberFormatException; {:try_start_0 ..:try_end_0} :catch_0 */
/* move-result-wide v0 */
/* .line 162 */
/* const-wide/16 v2, 0x400 */
/* cmp-long v2, v0, v2 */
/* if-gez v2, :cond_0 */
/* .line 163 */
/* new-instance v2, Ljava/lang/StringBuilder; */
/* long-to-int v0, v0 */
java.lang.String .valueOf ( v0 );
/* invoke-direct {v2, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V */
final String v0 = "B"; // const-string v0, "B"
(( java.lang.StringBuilder ) v2 ).append ( v0 ); // invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v0 ).toString ( ); // invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
/* .line 174 */
} // :goto_0
/* .line 159 */
/* :catch_0 */
/* move-exception v0 */
/* move-object v0, p0 */
/* .line 160 */
/* .line 164 */
} // :cond_0
/* const-wide/32 v2, 0x100000 */
/* cmp-long v2, v0, v2 */
/* if-gez v2, :cond_1 */
/* .line 165 */
/* new-instance v2, Ljava/text/DecimalFormat; */
final String v3 = "#0.00"; // const-string v3, "#0.00"
/* invoke-direct {v2, v3}, Ljava/text/DecimalFormat;-><init>(Ljava/lang/String;)V */
/* .line 166 */
/* new-instance v3, Ljava/lang/StringBuilder; */
/* long-to-float v0, v0 */
/* float-to-double v0, v0 */
/* const-wide/high16 v4, 0x4090000000000000L # 1024.0 */
/* div-double/2addr v0, v4 */
(( java.text.DecimalFormat ) v2 ).format ( v0, v1 ); // invoke-virtual {v2, v0, v1}, Ljava/text/DecimalFormat;->format(D)Ljava/lang/String;
java.lang.String .valueOf ( v0 );
/* invoke-direct {v3, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V */
final String v0 = "K"; // const-string v0, "K"
(( java.lang.StringBuilder ) v3 ).append ( v0 ); // invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v0 ).toString ( ); // invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
/* .line 167 */
} // :cond_1
/* const-wide/32 v2, 0x40000000 */
/* cmp-long v2, v0, v2 */
/* if-gez v2, :cond_2 */
/* .line 168 */
/* new-instance v2, Ljava/text/DecimalFormat; */
final String v3 = "#0.00"; // const-string v3, "#0.00"
/* invoke-direct {v2, v3}, Ljava/text/DecimalFormat;-><init>(Ljava/lang/String;)V */
/* .line 169 */
/* new-instance v3, Ljava/lang/StringBuilder; */
/* long-to-float v0, v0 */
/* float-to-double v0, v0 */
/* const-wide/high16 v4, 0x4130000000000000L # 1048576.0 */
/* div-double/2addr v0, v4 */
(( java.text.DecimalFormat ) v2 ).format ( v0, v1 ); // invoke-virtual {v2, v0, v1}, Ljava/text/DecimalFormat;->format(D)Ljava/lang/String;
java.lang.String .valueOf ( v0 );
/* invoke-direct {v3, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V */
final String v0 = "M"; // const-string v0, "M"
(( java.lang.StringBuilder ) v3 ).append ( v0 ); // invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v0 ).toString ( ); // invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
/* .line 171 */
} // :cond_2
/* new-instance v2, Ljava/text/DecimalFormat; */
final String v3 = "#0.00"; // const-string v3, "#0.00"
/* invoke-direct {v2, v3}, Ljava/text/DecimalFormat;-><init>(Ljava/lang/String;)V */
/* .line 172 */
/* new-instance v3, Ljava/lang/StringBuilder; */
/* long-to-float v0, v0 */
/* float-to-double v0, v0 */
/* const-wide/high16 v4, 0x41d0000000000000L # 1.073741824E9 */
/* div-double/2addr v0, v4 */
(( java.text.DecimalFormat ) v2 ).format ( v0, v1 ); // invoke-virtual {v2, v0, v1}, Ljava/text/DecimalFormat;->format(D)Ljava/lang/String;
java.lang.String .valueOf ( v0 );
/* invoke-direct {v3, v0}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V */
final String v0 = "G"; // const-string v0, "G"
(( java.lang.StringBuilder ) v3 ).append ( v0 ); // invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v0 ).toString ( ); // invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
} // .end method
public static Boolean d ( java.lang.String p0 ) {
/* .locals 1 */
/* .prologue */
/* .line 217 */
if ( p0 != null) { // if-eqz p0, :cond_0
v0 = (( java.lang.String ) p0 ).length ( ); // invoke-virtual {p0}, Ljava/lang/String;->length()I
if ( v0 != null) { // if-eqz v0, :cond_0
int v0 = 0; // const/4 v0, 0x0
} // :goto_0
} // :cond_0
int v0 = 1; // const/4 v0, 0x1
} // .end method
public static Boolean e ( java.lang.String p0 ) {
/* .locals 3 */
/* .prologue */
int v0 = 0; // const/4 v0, 0x0
/* .line 230 */
v1 = com.umeng.common.util.h .d ( p0 );
if ( v1 != null) { // if-eqz v1, :cond_1
/* .line 234 */
} // :cond_0
} // :goto_0
/* .line 233 */
} // :cond_1
(( java.lang.String ) p0 ).trim ( ); // invoke-virtual {p0}, Ljava/lang/String;->trim()Ljava/lang/String;
(( java.lang.String ) v1 ).toLowerCase ( ); // invoke-virtual {v1}, Ljava/lang/String;->toLowerCase()Ljava/lang/String;
/* .line 234 */
final String v2 = "http://"; // const-string v2, "http://"
v2 = (( java.lang.String ) v1 ).startsWith ( v2 ); // invoke-virtual {v1, v2}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z
/* if-nez v2, :cond_2 */
/* .line 235 */
final String v2 = "https://"; // const-string v2, "https://"
v1 = (( java.lang.String ) v1 ).startsWith ( v2 ); // invoke-virtual {v1, v2}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z
if ( v1 != null) { // if-eqz v1, :cond_0
/* .line 234 */
} // :cond_2
int v0 = 1; // const/4 v0, 0x1
} // .end method
