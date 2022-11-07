public class com.umeng.common.b {
	 /* .source "DeviceConfig.java" */
	 /* # static fields */
	 protected static final java.lang.String a;
	 protected static final java.lang.String b;
	 public static final Integer c;
	 private static final java.lang.String d;
	 private static final java.lang.String e;
	 /* # direct methods */
	 static com.umeng.common.b ( ) {
		 /* .locals 1 */
		 /* .prologue */
		 /* .line 47 */
		 /* const-class v0, Lcom/umeng/common/b; */
		 (( java.lang.Class ) v0 ).getName ( ); // invoke-virtual {v0}, Ljava/lang/Class;->getName()Ljava/lang/String;
		 /* .line 51 */
		 return;
	 } // .end method
	 public com.umeng.common.b ( ) {
		 /* .locals 0 */
		 /* .prologue */
		 /* .line 46 */
		 /* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
		 return;
	 } // .end method
	 private static Integer a ( java.lang.Object p0, java.lang.String p1 ) {
		 /* .locals 2 */
		 /* .prologue */
		 /* .line 631 */
		 try { // :try_start_0
			 /* const-class v0, Landroid/util/DisplayMetrics; */
			 (( java.lang.Class ) v0 ).getDeclaredField ( p1 ); // invoke-virtual {v0, p1}, Ljava/lang/Class;->getDeclaredField(Ljava/lang/String;)Ljava/lang/reflect/Field;
			 /* .line 632 */
			 int v1 = 1; // const/4 v1, 0x1
			 (( java.lang.reflect.Field ) v0 ).setAccessible ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/reflect/Field;->setAccessible(Z)V
			 /* .line 633 */
			 (( java.lang.reflect.Field ) v0 ).getInt ( p0 ); // invoke-virtual {v0, p0}, Ljava/lang/reflect/Field;->getInt(Ljava/lang/Object;)I
			 /* :try_end_0 */
			 v0 = 			 /* .catch Ljava/lang/Exception; {:try_start_0 ..:try_end_0} :catch_0 */
			 /* .line 637 */
		 } // :goto_0
		 /* .line 634 */
		 /* :catch_0 */
		 /* move-exception v0 */
		 /* .line 635 */
		 (( java.lang.Exception ) v0 ).printStackTrace ( ); // invoke-virtual {v0}, Ljava/lang/Exception;->printStackTrace()V
		 /* .line 637 */
		 int v0 = -1; // const/4 v0, -0x1
	 } // .end method
	 public static Integer a ( java.util.Date p0, java.util.Date p1 ) {
		 /* .locals 5 */
		 /* .prologue */
		 /* .line 700 */
		 v0 = 		 (( java.util.Date ) p0 ).after ( p1 ); // invoke-virtual {p0, p1}, Ljava/util/Date;->after(Ljava/util/Date;)Z
		 if ( v0 != null) { // if-eqz v0, :cond_0
			 /* .line 705 */
		 } // :goto_0
		 (( java.util.Date ) p1 ).getTime ( ); // invoke-virtual {p1}, Ljava/util/Date;->getTime()J
		 /* move-result-wide v0 */
		 /* .line 706 */
		 (( java.util.Date ) p0 ).getTime ( ); // invoke-virtual {p0}, Ljava/util/Date;->getTime()J
		 /* move-result-wide v2 */
		 /* .line 707 */
		 /* sub-long v0, v2, v0 */
		 /* .line 708 */
		 /* const-wide/16 v2, 0x3e8 */
		 /* div-long/2addr v0, v2 */
		 /* long-to-int v0, v0 */
	 } // :cond_0
	 /* move-object v4, p1 */
	 /* move-object p1, p0 */
	 /* move-object p0, v4 */
} // .end method
public static java.lang.String a ( ) {
	 /* .locals 4 */
	 /* .prologue */
	 /* .line 210 */
	 int v1 = 0; // const/4 v1, 0x0
	 /* .line 216 */
	 try { // :try_start_0
		 /* new-instance v0, Ljava/io/FileReader; */
		 final String v2 = "/proc/cpuinfo"; // const-string v2, "/proc/cpuinfo"
		 /* invoke-direct {v0, v2}, Ljava/io/FileReader;-><init>(Ljava/lang/String;)V */
		 /* :try_end_0 */
		 /* .catch Ljava/io/FileNotFoundException; {:try_start_0 ..:try_end_0} :catch_1 */
		 /* .line 217 */
		 if ( v0 != null) { // if-eqz v0, :cond_1
			 /* .line 219 */
			 try { // :try_start_1
				 /* new-instance v2, Ljava/io/BufferedReader; */
				 /* const/16 v3, 0x400 */
				 /* invoke-direct {v2, v0, v3}, Ljava/io/BufferedReader;-><init>(Ljava/io/Reader;I)V */
				 /* .line 220 */
				 (( java.io.BufferedReader ) v2 ).readLine ( ); // invoke-virtual {v2}, Ljava/io/BufferedReader;->readLine()Ljava/lang/String;
				 /* .line 221 */
				 (( java.io.BufferedReader ) v2 ).close ( ); // invoke-virtual {v2}, Ljava/io/BufferedReader;->close()V
				 /* .line 222 */
				 (( java.io.FileReader ) v0 ).close ( ); // invoke-virtual {v0}, Ljava/io/FileReader;->close()V
				 /* :try_end_1 */
				 /* .catch Ljava/io/IOException; {:try_start_1 ..:try_end_1} :catch_0 */
				 /* .catch Ljava/io/FileNotFoundException; {:try_start_1 ..:try_end_1} :catch_1 */
				 /* move-object v0, v1 */
				 /* .line 232 */
			 } // :goto_0
			 if ( v0 != null) { // if-eqz v0, :cond_0
				 /* .line 233 */
				 /* const/16 v1, 0x3a */
				 v1 = 				 (( java.lang.String ) v0 ).indexOf ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/String;->indexOf(I)I
				 /* add-int/lit8 v1, v1, 0x1 */
				 /* .line 234 */
				 (( java.lang.String ) v0 ).substring ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/String;->substring(I)Ljava/lang/String;
				 /* .line 236 */
			 } // :cond_0
			 (( java.lang.String ) v0 ).trim ( ); // invoke-virtual {v0}, Ljava/lang/String;->trim()Ljava/lang/String;
			 /* .line 223 */
			 /* :catch_0 */
			 /* move-exception v0 */
			 /* .line 224 */
			 try { // :try_start_2
				 v2 = com.umeng.common.b.a;
				 /* .line 225 */
				 final String v3 = "Could not read from file /proc/cpuinfo"; // const-string v3, "Could not read from file /proc/cpuinfo"
				 /* .line 224 */
				 com.umeng.common.Log .b ( v2,v3,v0 );
				 /* :try_end_2 */
				 /* .catch Ljava/io/FileNotFoundException; {:try_start_2 ..:try_end_2} :catch_1 */
				 /* move-object v0, v1 */
				 /* .line 228 */
				 /* :catch_1 */
				 /* move-exception v0 */
				 /* .line 229 */
				 v2 = com.umeng.common.b.a;
				 final String v3 = "Could not open file /proc/cpuinfo"; // const-string v3, "Could not open file /proc/cpuinfo"
				 com.umeng.common.Log .b ( v2,v3,v0 );
				 /* move-object v0, v1 */
			 } // :cond_1
			 /* move-object v0, v1 */
		 } // .end method
		 public static java.lang.String a ( java.util.Date p0 ) {
			 /* .locals 2 */
			 /* .prologue */
			 /* .line 663 */
			 /* new-instance v0, Ljava/text/SimpleDateFormat; */
			 final String v1 = "yyyy-MM-dd HH:mm:ss"; // const-string v1, "yyyy-MM-dd HH:mm:ss"
			 /* invoke-direct {v0, v1}, Ljava/text/SimpleDateFormat;-><init>(Ljava/lang/String;)V */
			 /* .line 664 */
			 (( java.text.SimpleDateFormat ) v0 ).format ( p0 ); // invoke-virtual {v0, p0}, Ljava/text/SimpleDateFormat;->format(Ljava/util/Date;)Ljava/lang/String;
			 /* .line 665 */
		 } // .end method
		 public static java.util.Date a ( java.lang.String p0 ) {
			 /* .locals 2 */
			 /* .prologue */
			 /* .line 685 */
			 try { // :try_start_0
				 /* new-instance v0, Ljava/text/SimpleDateFormat; */
				 final String v1 = "yyyy-MM-dd HH:mm:ss"; // const-string v1, "yyyy-MM-dd HH:mm:ss"
				 /* invoke-direct {v0, v1}, Ljava/text/SimpleDateFormat;-><init>(Ljava/lang/String;)V */
				 /* .line 686 */
				 (( java.text.SimpleDateFormat ) v0 ).parse ( p0 ); // invoke-virtual {v0, p0}, Ljava/text/SimpleDateFormat;->parse(Ljava/lang/String;)Ljava/util/Date;
				 /* :try_end_0 */
				 /* .catch Ljava/lang/Exception; {:try_start_0 ..:try_end_0} :catch_0 */
				 /* .line 689 */
			 } // :goto_0
			 /* .line 688 */
			 /* :catch_0 */
			 /* move-exception v0 */
			 /* .line 689 */
			 int v0 = 0; // const/4 v0, 0x0
		 } // .end method
		 public static Boolean a ( android.content.Context p0 ) {
			 /* .locals 2 */
			 /* .prologue */
			 /* .line 81 */
			 (( android.content.Context ) p0 ).getResources ( ); // invoke-virtual {p0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;
			 (( android.content.res.Resources ) v0 ).getConfiguration ( ); // invoke-virtual {v0}, Landroid/content/res/Resources;->getConfiguration()Landroid/content/res/Configuration;
			 v0 = this.locale;
			 /* .line 82 */
			 (( java.util.Locale ) v0 ).toString ( ); // invoke-virtual {v0}, Ljava/util/Locale;->toString()Ljava/lang/String;
			 v1 = java.util.Locale.CHINA;
			 (( java.util.Locale ) v1 ).toString ( ); // invoke-virtual {v1}, Ljava/util/Locale;->toString()Ljava/lang/String;
			 v0 = 			 (( java.lang.String ) v0 ).equals ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
		 } // .end method
		 public static Boolean a ( android.content.Context p0, java.lang.String p1 ) {
			 /* .locals 2 */
			 /* .prologue */
			 /* .line 158 */
			 (( android.content.Context ) p0 ).getPackageManager ( ); // invoke-virtual {p0}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;
			 /* .line 159 */
			 (( android.content.Context ) p0 ).getPackageName ( ); // invoke-virtual {p0}, Landroid/content/Context;->getPackageName()Ljava/lang/String;
			 v0 = 			 (( android.content.pm.PackageManager ) v0 ).checkPermission ( p1, v1 ); // invoke-virtual {v0, p1, v1}, Landroid/content/pm/PackageManager;->checkPermission(Ljava/lang/String;Ljava/lang/String;)I
			 if ( v0 != null) { // if-eqz v0, :cond_0
				 /* .line 160 */
				 int v0 = 0; // const/4 v0, 0x0
				 /* .line 162 */
			 } // :goto_0
		 } // :cond_0
		 int v0 = 1; // const/4 v0, 0x1
	 } // .end method
	 public static Boolean a ( java.lang.String p0, android.content.Context p1 ) {
		 /* .locals 3 */
		 /* .prologue */
		 int v0 = 1; // const/4 v0, 0x1
		 /* .line 62 */
		 (( android.content.Context ) p1 ).getPackageManager ( ); // invoke-virtual {p1}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;
		 /* .line 65 */
		 int v2 = 1; // const/4 v2, 0x1
		 try { // :try_start_0
			 (( android.content.pm.PackageManager ) v1 ).getPackageInfo ( p0, v2 ); // invoke-virtual {v1, p0, v2}, Landroid/content/pm/PackageManager;->getPackageInfo(Ljava/lang/String;I)Landroid/content/pm/PackageInfo;
			 /* :try_end_0 */
			 /* .catch Landroid/content/pm/PackageManager$NameNotFoundException; {:try_start_0 ..:try_end_0} :catch_0 */
			 /* .line 70 */
		 } // :goto_0
		 /* .line 67 */
		 /* :catch_0 */
		 /* move-exception v0 */
		 /* .line 68 */
		 int v0 = 0; // const/4 v0, 0x0
	 } // .end method
	 public static java.lang.String a ( javax.microedition.khronos.opengles.GL10 p0 ) {
		 /* .locals 5 */
		 /* .prologue */
		 int v4 = 0; // const/4 v4, 0x0
		 /* .line 192 */
		 int v0 = 2; // const/4 v0, 0x2
		 try { // :try_start_0
			 /* new-array v0, v0, [Ljava/lang/String; */
			 /* .line 193 */
			 /* const/16 v1, 0x1f00 */
			 /* .line 194 */
			 /* const/16 v2, 0x1f01 */
			 /* .line 195 */
			 int v3 = 0; // const/4 v3, 0x0
			 /* aput-object v1, v0, v3 */
			 /* .line 196 */
			 int v1 = 1; // const/4 v1, 0x1
			 /* aput-object v2, v0, v1 */
			 /* :try_end_0 */
			 /* .catch Ljava/lang/Exception; {:try_start_0 ..:try_end_0} :catch_0 */
			 /* .line 200 */
		 } // :goto_0
		 /* .line 198 */
		 /* :catch_0 */
		 /* move-exception v0 */
		 /* .line 199 */
		 v1 = com.umeng.common.b.a;
		 final String v2 = "Could not read gpu infor:"; // const-string v2, "Could not read gpu infor:"
		 com.umeng.common.Log .b ( v1,v2,v0 );
		 /* .line 200 */
		 /* new-array v0, v4, [Ljava/lang/String; */
	 } // .end method
	 public static java.util.Set b ( android.content.Context p0 ) {
		 /* .locals 4 */
		 /* .annotation system Ldalvik/annotation/Signature; */
		 /* value = { */
		 /* "(", */
		 /* "Landroid/content/Context;", */
		 /* ")", */
		 /* "Ljava/util/Set", */
		 /* "<", */
		 /* "Ljava/lang/String;", */
		 /* ">;" */
		 /* } */
	 } // .end annotation
	 /* .prologue */
	 int v0 = 0; // const/4 v0, 0x0
	 /* .line 93 */
	 /* new-instance v2, Ljava/util/HashSet; */
	 /* invoke-direct {v2}, Ljava/util/HashSet;-><init>()V */
	 /* .line 94 */
	 (( android.content.Context ) p0 ).getPackageManager ( ); // invoke-virtual {p0}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;
	 /* .line 95 */
	 (( android.content.pm.PackageManager ) v1 ).getInstalledPackages ( v0 ); // invoke-virtual {v1, v0}, Landroid/content/pm/PackageManager;->getInstalledPackages(I)Ljava/util/List;
	 /* move v1, v0 */
	 /* .line 96 */
v0 = } // :goto_0
/* if-lt v1, v0, :cond_0 */
/* .line 100 */
/* .line 97 */
} // :cond_0
/* check-cast v0, Landroid/content/pm/PackageInfo; */
/* .line 98 */
v0 = this.packageName;
/* .line 96 */
/* add-int/lit8 v0, v1, 0x1 */
/* move v1, v0 */
} // .end method
public static Boolean b ( ) {
/* .locals 2 */
/* .prologue */
/* .line 458 */
android.os.Environment .getExternalStorageState ( );
/* .line 459 */
final String v1 = "mounted"; // const-string v1, "mounted"
/* .line 458 */
v0 = (( java.lang.String ) v0 ).equals ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
/* .line 459 */
if ( v0 != null) { // if-eqz v0, :cond_0
/* .line 460 */
int v0 = 1; // const/4 v0, 0x1
/* .line 462 */
} // :goto_0
} // :cond_0
int v0 = 0; // const/4 v0, 0x0
} // .end method
public static java.lang.String c ( ) {
/* .locals 3 */
/* .prologue */
/* .line 673 */
/* new-instance v0, Ljava/util/Date; */
/* invoke-direct {v0}, Ljava/util/Date;-><init>()V */
/* .line 674 */
/* new-instance v1, Ljava/text/SimpleDateFormat; */
final String v2 = "yyyy-MM-dd"; // const-string v2, "yyyy-MM-dd"
/* invoke-direct {v1, v2}, Ljava/text/SimpleDateFormat;-><init>(Ljava/lang/String;)V */
/* .line 675 */
(( java.text.SimpleDateFormat ) v1 ).format ( v0 ); // invoke-virtual {v1, v0}, Ljava/text/SimpleDateFormat;->format(Ljava/util/Date;)Ljava/lang/String;
/* .line 676 */
} // .end method
public static Boolean c ( android.content.Context p0 ) {
/* .locals 2 */
/* .prologue */
int v0 = 1; // const/4 v0, 0x1
/* .line 110 */
(( android.content.Context ) p0 ).getResources ( ); // invoke-virtual {p0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;
(( android.content.res.Resources ) v1 ).getConfiguration ( ); // invoke-virtual {v1}, Landroid/content/res/Resources;->getConfiguration()Landroid/content/res/Configuration;
/* iget v1, v1, Landroid/content/res/Configuration;->orientation:I */
/* if-ne v1, v0, :cond_0 */
/* .line 113 */
} // :goto_0
} // :cond_0
int v0 = 0; // const/4 v0, 0x0
} // .end method
public static java.lang.String d ( android.content.Context p0 ) {
/* .locals 3 */
/* .prologue */
/* .line 125 */
try { // :try_start_0
(( android.content.Context ) p0 ).getPackageManager ( ); // invoke-virtual {p0}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;
/* .line 126 */
(( android.content.Context ) p0 ).getPackageName ( ); // invoke-virtual {p0}, Landroid/content/Context;->getPackageName()Ljava/lang/String;
int v2 = 0; // const/4 v2, 0x0
/* .line 125 */
(( android.content.pm.PackageManager ) v0 ).getPackageInfo ( v1, v2 ); // invoke-virtual {v0, v1, v2}, Landroid/content/pm/PackageManager;->getPackageInfo(Ljava/lang/String;I)Landroid/content/pm/PackageInfo;
/* .line 127 */
/* iget v0, v0, Landroid/content/pm/PackageInfo;->versionCode:I */
/* .line 128 */
java.lang.String .valueOf ( v0 );
/* :try_end_0 */
/* .catch Landroid/content/pm/PackageManager$NameNotFoundException; {:try_start_0 ..:try_end_0} :catch_0 */
/* .line 130 */
} // :goto_0
/* .line 129 */
/* :catch_0 */
/* move-exception v0 */
/* .line 130 */
final String v0 = "Unknown"; // const-string v0, "Unknown"
} // .end method
public static java.lang.String e ( android.content.Context p0 ) {
/* .locals 3 */
/* .prologue */
/* .line 141 */
try { // :try_start_0
(( android.content.Context ) p0 ).getPackageManager ( ); // invoke-virtual {p0}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;
/* .line 142 */
(( android.content.Context ) p0 ).getPackageName ( ); // invoke-virtual {p0}, Landroid/content/Context;->getPackageName()Ljava/lang/String;
int v2 = 0; // const/4 v2, 0x0
/* .line 141 */
(( android.content.pm.PackageManager ) v0 ).getPackageInfo ( v1, v2 ); // invoke-virtual {v0, v1, v2}, Landroid/content/pm/PackageManager;->getPackageInfo(Ljava/lang/String;I)Landroid/content/pm/PackageInfo;
/* .line 143 */
v0 = this.versionName;
/* :try_end_0 */
/* .catch Landroid/content/pm/PackageManager$NameNotFoundException; {:try_start_0 ..:try_end_0} :catch_0 */
/* .line 145 */
} // :goto_0
/* .line 144 */
/* :catch_0 */
/* move-exception v0 */
/* .line 145 */
final String v0 = "Unknown"; // const-string v0, "Unknown"
} // .end method
public static java.lang.String f ( android.content.Context p0 ) {
/* .locals 3 */
/* .prologue */
/* .line 173 */
(( android.content.Context ) p0 ).getPackageManager ( ); // invoke-virtual {p0}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;
/* .line 176 */
try { // :try_start_0
(( android.content.Context ) p0 ).getPackageName ( ); // invoke-virtual {p0}, Landroid/content/Context;->getPackageName()Ljava/lang/String;
int v2 = 0; // const/4 v2, 0x0
(( android.content.pm.PackageManager ) v1 ).getApplicationInfo ( v0, v2 ); // invoke-virtual {v1, v0, v2}, Landroid/content/pm/PackageManager;->getApplicationInfo(Ljava/lang/String;I)Landroid/content/pm/ApplicationInfo;
/* :try_end_0 */
/* .catch Landroid/content/pm/PackageManager$NameNotFoundException; {:try_start_0 ..:try_end_0} :catch_0 */
/* .line 181 */
} // :goto_0
if ( v0 != null) { // if-eqz v0, :cond_0
(( android.content.pm.PackageManager ) v1 ).getApplicationLabel ( v0 ); // invoke-virtual {v1, v0}, Landroid/content/pm/PackageManager;->getApplicationLabel(Landroid/content/pm/ApplicationInfo;)Ljava/lang/CharSequence;
} // :goto_1
/* check-cast v0, Ljava/lang/String; */
/* .line 182 */
/* .line 178 */
/* :catch_0 */
/* move-exception v0 */
/* .line 179 */
int v0 = 0; // const/4 v0, 0x0
/* .line 181 */
} // :cond_0
final String v0 = ""; // const-string v0, ""
} // .end method
public static java.lang.String g ( android.content.Context p0 ) {
/* .locals 4 */
/* .prologue */
/* .line 246 */
/* .line 247 */
final String v0 = "phone"; // const-string v0, "phone"
(( android.content.Context ) p0 ).getSystemService ( v0 ); // invoke-virtual {p0, v0}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;
/* .line 246 */
/* check-cast v0, Landroid/telephony/TelephonyManager; */
/* .line 249 */
/* if-nez v0, :cond_0 */
/* .line 250 */
v1 = com.umeng.common.b.a;
final String v2 = "No IMEI."; // const-string v2, "No IMEI."
com.umeng.common.Log .e ( v1,v2 );
/* .line 253 */
} // :cond_0
final String v1 = ""; // const-string v1, ""
/* .line 255 */
try { // :try_start_0
final String v2 = "android.permission.READ_PHONE_STATE"; // const-string v2, "android.permission.READ_PHONE_STATE"
v2 = com.umeng.common.b .a ( p0,v2 );
if ( v2 != null) { // if-eqz v2, :cond_2
/* .line 256 */
(( android.telephony.TelephonyManager ) v0 ).getDeviceId ( ); // invoke-virtual {v0}, Landroid/telephony/TelephonyManager;->getDeviceId()Ljava/lang/String;
/* :try_end_0 */
/* .catch Ljava/lang/Exception; {:try_start_0 ..:try_end_0} :catch_0 */
/* .line 262 */
} // :goto_0
v1 = android.text.TextUtils .isEmpty ( v0 );
if ( v1 != null) { // if-eqz v1, :cond_1
/* .line 263 */
v0 = com.umeng.common.b.a;
final String v1 = "No IMEI."; // const-string v1, "No IMEI."
com.umeng.common.Log .e ( v0,v1 );
/* .line 264 */
com.umeng.common.b .r ( p0 );
/* .line 265 */
v1 = android.text.TextUtils .isEmpty ( v0 );
if ( v1 != null) { // if-eqz v1, :cond_1
/* .line 266 */
v0 = com.umeng.common.b.a;
final String v1 = "Failed to take mac as IMEI.Try to use Secure.ANDROID_ID instead."; // const-string v1, "Failed to take mac as IMEI.Try to use Secure.ANDROID_ID instead."
com.umeng.common.Log .e ( v0,v1 );
/* .line 267 */
(( android.content.Context ) p0 ).getContentResolver ( ); // invoke-virtual {p0}, Landroid/content/Context;->getContentResolver()Landroid/content/ContentResolver;
final String v1 = "android_id"; // const-string v1, "android_id"
android.provider.Settings$Secure .getString ( v0,v1 );
/* .line 268 */
v1 = com.umeng.common.b.a;
/* new-instance v2, Ljava/lang/StringBuilder; */
final String v3 = "getDeviceId: Secure.ANDROID_ID: "; // const-string v3, "getDeviceId: Secure.ANDROID_ID: "
/* invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V */
(( java.lang.StringBuilder ) v2 ).append ( v0 ); // invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v2 ).toString ( ); // invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
com.umeng.common.Log .a ( v1,v2 );
/* .line 272 */
} // :cond_1
/* .line 258 */
/* :catch_0 */
/* move-exception v0 */
/* .line 259 */
v2 = com.umeng.common.b.a;
final String v3 = "No IMEI."; // const-string v3, "No IMEI."
com.umeng.common.Log .e ( v2,v3,v0 );
} // :cond_2
/* move-object v0, v1 */
} // .end method
public static java.lang.String h ( android.content.Context p0 ) {
/* .locals 1 */
/* .prologue */
/* .line 281 */
com.umeng.common.b .g ( p0 );
com.umeng.common.util.h .b ( v0 );
} // .end method
public static java.lang.String i ( android.content.Context p0 ) {
/* .locals 1 */
/* .prologue */
/* .line 292 */
/* .line 293 */
try { // :try_start_0
final String v0 = "phone"; // const-string v0, "phone"
(( android.content.Context ) p0 ).getSystemService ( v0 ); // invoke-virtual {p0, v0}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;
/* .line 292 */
/* check-cast v0, Landroid/telephony/TelephonyManager; */
/* :try_end_0 */
/* .catch Ljava/lang/Exception; {:try_start_0 ..:try_end_0} :catch_0 */
/* .line 295 */
/* if-nez v0, :cond_0 */
/* .line 296 */
final String v0 = "Unknown"; // const-string v0, "Unknown"
/* .line 301 */
} // :goto_0
/* .line 298 */
} // :cond_0
try { // :try_start_1
(( android.telephony.TelephonyManager ) v0 ).getNetworkOperatorName ( ); // invoke-virtual {v0}, Landroid/telephony/TelephonyManager;->getNetworkOperatorName()Ljava/lang/String;
/* :try_end_1 */
/* .catch Ljava/lang/Exception; {:try_start_1 ..:try_end_1} :catch_0 */
/* .line 299 */
/* :catch_0 */
/* move-exception v0 */
/* .line 300 */
(( java.lang.Exception ) v0 ).printStackTrace ( ); // invoke-virtual {v0}, Ljava/lang/Exception;->printStackTrace()V
/* .line 301 */
final String v0 = "Unknown"; // const-string v0, "Unknown"
} // .end method
public static java.lang.String j ( android.content.Context p0 ) {
/* .locals 3 */
/* .prologue */
/* .line 313 */
try { // :try_start_0
/* new-instance v1, Landroid/util/DisplayMetrics; */
/* invoke-direct {v1}, Landroid/util/DisplayMetrics;-><init>()V */
/* .line 315 */
final String v0 = "window"; // const-string v0, "window"
(( android.content.Context ) p0 ).getSystemService ( v0 ); // invoke-virtual {p0, v0}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;
/* .line 314 */
/* check-cast v0, Landroid/view/WindowManager; */
/* .line 316 */
(( android.view.Display ) v0 ).getMetrics ( v1 ); // invoke-virtual {v0, v1}, Landroid/view/Display;->getMetrics(Landroid/util/DisplayMetrics;)V
/* .line 318 */
/* iget v0, v1, Landroid/util/DisplayMetrics;->widthPixels:I */
/* .line 319 */
/* iget v1, v1, Landroid/util/DisplayMetrics;->heightPixels:I */
/* .line 321 */
/* new-instance v2, Ljava/lang/StringBuilder; */
java.lang.String .valueOf ( v1 );
java.lang.String .valueOf ( v1 );
/* invoke-direct {v2, v1}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V */
final String v1 = "*"; // const-string v1, "*"
(( java.lang.StringBuilder ) v2 ).append ( v1 ); // invoke-virtual {v2, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
/* .line 322 */
java.lang.String .valueOf ( v0 );
(( java.lang.StringBuilder ) v1 ).append ( v0 ); // invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
/* .line 321 */
(( java.lang.StringBuilder ) v0 ).toString ( ); // invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
/* :try_end_0 */
/* .catch Ljava/lang/Exception; {:try_start_0 ..:try_end_0} :catch_0 */
/* .line 326 */
} // :goto_0
/* .line 324 */
/* :catch_0 */
/* move-exception v0 */
/* .line 325 */
(( java.lang.Exception ) v0 ).printStackTrace ( ); // invoke-virtual {v0}, Ljava/lang/Exception;->printStackTrace()V
/* .line 326 */
final String v0 = "Unknown"; // const-string v0, "Unknown"
} // .end method
public static java.lang.String k ( android.content.Context p0 ) {
/* .locals 4 */
/* .prologue */
int v3 = 1; // const/4 v3, 0x1
int v2 = 0; // const/4 v2, 0x0
/* .line 339 */
int v0 = 2; // const/4 v0, 0x2
/* new-array v1, v0, [Ljava/lang/String; */
final String v0 = "Unknown"; // const-string v0, "Unknown"
/* aput-object v0, v1, v2 */
final String v0 = "Unknown"; // const-string v0, "Unknown"
/* aput-object v0, v1, v3 */
/* .line 342 */
try { // :try_start_0
(( android.content.Context ) p0 ).getPackageManager ( ); // invoke-virtual {p0}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;
/* .line 343 */
final String v2 = "android.permission.ACCESS_NETWORK_STATE"; // const-string v2, "android.permission.ACCESS_NETWORK_STATE"
/* .line 344 */
(( android.content.Context ) p0 ).getPackageName ( ); // invoke-virtual {p0}, Landroid/content/Context;->getPackageName()Ljava/lang/String;
/* .line 343 */
v0 = (( android.content.pm.PackageManager ) v0 ).checkPermission ( v2, v3 ); // invoke-virtual {v0, v2, v3}, Landroid/content/pm/PackageManager;->checkPermission(Ljava/lang/String;Ljava/lang/String;)I
if ( v0 != null) { // if-eqz v0, :cond_0
/* .line 345 */
int v0 = 0; // const/4 v0, 0x0
final String v2 = "Unknown"; // const-string v2, "Unknown"
/* aput-object v2, v1, v0 */
/* move-object v0, v1 */
/* .line 373 */
} // :goto_0
/* .line 350 */
} // :cond_0
final String v0 = "connectivity"; // const-string v0, "connectivity"
(( android.content.Context ) p0 ).getSystemService ( v0 ); // invoke-virtual {p0, v0}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;
/* .line 349 */
/* check-cast v0, Landroid/net/ConnectivityManager; */
/* .line 351 */
/* if-nez v0, :cond_1 */
/* .line 352 */
int v0 = 0; // const/4 v0, 0x0
final String v2 = "Unknown"; // const-string v2, "Unknown"
/* aput-object v2, v1, v0 */
/* move-object v0, v1 */
/* .line 353 */
/* .line 356 */
} // :cond_1
int v2 = 1; // const/4 v2, 0x1
(( android.net.ConnectivityManager ) v0 ).getNetworkInfo ( v2 ); // invoke-virtual {v0, v2}, Landroid/net/ConnectivityManager;->getNetworkInfo(I)Landroid/net/NetworkInfo;
/* .line 357 */
(( android.net.NetworkInfo ) v2 ).getState ( ); // invoke-virtual {v2}, Landroid/net/NetworkInfo;->getState()Landroid/net/NetworkInfo$State;
v3 = android.net.NetworkInfo$State.CONNECTED;
/* if-ne v2, v3, :cond_2 */
/* .line 358 */
int v0 = 0; // const/4 v0, 0x0
final String v2 = "Wi-Fi"; // const-string v2, "Wi-Fi"
/* aput-object v2, v1, v0 */
/* move-object v0, v1 */
/* .line 359 */
/* .line 362 */
} // :cond_2
int v2 = 0; // const/4 v2, 0x0
(( android.net.ConnectivityManager ) v0 ).getNetworkInfo ( v2 ); // invoke-virtual {v0, v2}, Landroid/net/ConnectivityManager;->getNetworkInfo(I)Landroid/net/NetworkInfo;
/* .line 363 */
(( android.net.NetworkInfo ) v0 ).getState ( ); // invoke-virtual {v0}, Landroid/net/NetworkInfo;->getState()Landroid/net/NetworkInfo$State;
v3 = android.net.NetworkInfo$State.CONNECTED;
/* if-ne v2, v3, :cond_3 */
/* .line 364 */
int v2 = 0; // const/4 v2, 0x0
final String v3 = "2G/3G"; // const-string v3, "2G/3G"
/* aput-object v3, v1, v2 */
/* .line 365 */
int v2 = 1; // const/4 v2, 0x1
(( android.net.NetworkInfo ) v0 ).getSubtypeName ( ); // invoke-virtual {v0}, Landroid/net/NetworkInfo;->getSubtypeName()Ljava/lang/String;
/* aput-object v0, v1, v2 */
/* :try_end_0 */
/* .catch Ljava/lang/Exception; {:try_start_0 ..:try_end_0} :catch_0 */
/* move-object v0, v1 */
/* .line 366 */
/* .line 369 */
/* :catch_0 */
/* move-exception v0 */
/* .line 370 */
(( java.lang.Exception ) v0 ).printStackTrace ( ); // invoke-virtual {v0}, Ljava/lang/Exception;->printStackTrace()V
} // :cond_3
/* move-object v0, v1 */
/* .line 373 */
} // .end method
public static Boolean l ( android.content.Context p0 ) {
/* .locals 3 */
/* .prologue */
/* .line 377 */
final String v0 = "Wi-Fi"; // const-string v0, "Wi-Fi"
com.umeng.common.b .k ( p0 );
int v2 = 0; // const/4 v2, 0x0
/* aget-object v1, v1, v2 */
v0 = (( java.lang.String ) v0 ).equals ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
} // .end method
public static android.location.Location m ( android.content.Context p0 ) {
/* .locals 6 */
/* .prologue */
int v2 = 0; // const/4 v2, 0x0
/* .line 392 */
/* .line 395 */
try { // :try_start_0
final String v0 = "location"; // const-string v0, "location"
(( android.content.Context ) p0 ).getSystemService ( v0 ); // invoke-virtual {p0, v0}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;
/* .line 394 */
/* check-cast v0, Landroid/location/LocationManager; */
/* .line 397 */
final String v1 = "android.permission.ACCESS_FINE_LOCATION"; // const-string v1, "android.permission.ACCESS_FINE_LOCATION"
/* .line 396 */
v1 = com.umeng.common.b .a ( p0,v1 );
/* .line 397 */
if ( v1 != null) { // if-eqz v1, :cond_0
/* .line 399 */
final String v1 = "gps"; // const-string v1, "gps"
(( android.location.LocationManager ) v0 ).getLastKnownLocation ( v1 ); // invoke-virtual {v0, v1}, Landroid/location/LocationManager;->getLastKnownLocation(Ljava/lang/String;)Landroid/location/Location;
/* .line 400 */
if ( v1 != null) { // if-eqz v1, :cond_0
/* .line 401 */
v0 = com.umeng.common.b.a;
/* new-instance v3, Ljava/lang/StringBuilder; */
final String v4 = "get location from gps:"; // const-string v4, "get location from gps:"
/* invoke-direct {v3, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V */
/* .line 402 */
(( android.location.Location ) v1 ).getLatitude ( ); // invoke-virtual {v1}, Landroid/location/Location;->getLatitude()D
/* move-result-wide v4 */
(( java.lang.StringBuilder ) v3 ).append ( v4, v5 ); // invoke-virtual {v3, v4, v5}, Ljava/lang/StringBuilder;->append(D)Ljava/lang/StringBuilder;
final String v4 = ","; // const-string v4, ","
(( java.lang.StringBuilder ) v3 ).append ( v4 ); // invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
/* .line 403 */
(( android.location.Location ) v1 ).getLongitude ( ); // invoke-virtual {v1}, Landroid/location/Location;->getLongitude()D
/* move-result-wide v4 */
(( java.lang.StringBuilder ) v3 ).append ( v4, v5 ); // invoke-virtual {v3, v4, v5}, Ljava/lang/StringBuilder;->append(D)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v3 ).toString ( ); // invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
/* .line 401 */
com.umeng.common.Log .c ( v0,v3 );
/* move-object v0, v1 */
/* .line 425 */
} // :goto_0
/* .line 409 */
} // :cond_0
final String v1 = "android.permission.ACCESS_COARSE_LOCATION"; // const-string v1, "android.permission.ACCESS_COARSE_LOCATION"
/* .line 408 */
v1 = com.umeng.common.b .a ( p0,v1 );
/* .line 409 */
if ( v1 != null) { // if-eqz v1, :cond_1
/* .line 411 */
final String v1 = "network"; // const-string v1, "network"
(( android.location.LocationManager ) v0 ).getLastKnownLocation ( v1 ); // invoke-virtual {v0, v1}, Landroid/location/LocationManager;->getLastKnownLocation(Ljava/lang/String;)Landroid/location/Location;
/* .line 412 */
if ( v0 != null) { // if-eqz v0, :cond_1
/* .line 413 */
v1 = com.umeng.common.b.a;
/* new-instance v3, Ljava/lang/StringBuilder; */
final String v4 = "get location from network:"; // const-string v4, "get location from network:"
/* invoke-direct {v3, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V */
/* .line 414 */
(( android.location.Location ) v0 ).getLatitude ( ); // invoke-virtual {v0}, Landroid/location/Location;->getLatitude()D
/* move-result-wide v4 */
(( java.lang.StringBuilder ) v3 ).append ( v4, v5 ); // invoke-virtual {v3, v4, v5}, Ljava/lang/StringBuilder;->append(D)Ljava/lang/StringBuilder;
final String v4 = ","; // const-string v4, ","
(( java.lang.StringBuilder ) v3 ).append ( v4 ); // invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
/* .line 415 */
(( android.location.Location ) v0 ).getLongitude ( ); // invoke-virtual {v0}, Landroid/location/Location;->getLongitude()D
/* move-result-wide v4 */
(( java.lang.StringBuilder ) v3 ).append ( v4, v5 ); // invoke-virtual {v3, v4, v5}, Ljava/lang/StringBuilder;->append(D)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v3 ).toString ( ); // invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
/* .line 413 */
com.umeng.common.Log .c ( v1,v3 );
/* :try_end_0 */
/* .catch Ljava/lang/Exception; {:try_start_0 ..:try_end_0} :catch_0 */
/* .line 423 */
/* :catch_0 */
/* move-exception v0 */
/* .line 424 */
v1 = com.umeng.common.b.a;
(( java.lang.Exception ) v0 ).getMessage ( ); // invoke-virtual {v0}, Ljava/lang/Exception;->getMessage()Ljava/lang/String;
com.umeng.common.Log .b ( v1,v0 );
/* move-object v0, v2 */
/* .line 425 */
/* .line 420 */
} // :cond_1
try { // :try_start_1
v0 = com.umeng.common.b.a;
/* .line 421 */
final String v1 = "Could not get location from GPS or Cell-id, lack ACCESS_COARSE_LOCATION or ACCESS_COARSE_LOCATION permission?"; // const-string v1, "Could not get location from GPS or Cell-id, lack ACCESS_COARSE_LOCATION or ACCESS_COARSE_LOCATION permission?"
/* .line 420 */
com.umeng.common.Log .c ( v0,v1 );
/* :try_end_1 */
/* .catch Ljava/lang/Exception; {:try_start_1 ..:try_end_1} :catch_0 */
/* move-object v0, v2 */
/* .line 422 */
} // .end method
public static Boolean n ( android.content.Context p0 ) {
/* .locals 1 */
/* .prologue */
/* .line 440 */
/* .line 441 */
try { // :try_start_0
final String v0 = "connectivity"; // const-string v0, "connectivity"
(( android.content.Context ) p0 ).getSystemService ( v0 ); // invoke-virtual {p0, v0}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;
/* .line 440 */
/* check-cast v0, Landroid/net/ConnectivityManager; */
/* .line 442 */
(( android.net.ConnectivityManager ) v0 ).getActiveNetworkInfo ( ); // invoke-virtual {v0}, Landroid/net/ConnectivityManager;->getActiveNetworkInfo()Landroid/net/NetworkInfo;
/* .line 443 */
if ( v0 != null) { // if-eqz v0, :cond_0
/* .line 444 */
(( android.net.NetworkInfo ) v0 ).isConnectedOrConnecting ( ); // invoke-virtual {v0}, Landroid/net/NetworkInfo;->isConnectedOrConnecting()Z
/* :try_end_0 */
v0 = /* .catch Ljava/lang/Exception; {:try_start_0 ..:try_end_0} :catch_0 */
/* .line 448 */
} // :goto_0
/* .line 446 */
} // :cond_0
int v0 = 0; // const/4 v0, 0x0
/* .line 447 */
/* :catch_0 */
/* move-exception v0 */
/* .line 448 */
int v0 = 1; // const/4 v0, 0x1
} // .end method
public static Integer o ( android.content.Context p0 ) {
/* .locals 3 */
/* .prologue */
/* .line 475 */
try { // :try_start_0
com.umeng.common.b .y ( p0 );
/* .line 476 */
java.util.Calendar .getInstance ( v0 );
/* .line 477 */
if ( v0 != null) { // if-eqz v0, :cond_0
/* .line 478 */
(( java.util.Calendar ) v0 ).getTimeZone ( ); // invoke-virtual {v0}, Ljava/util/Calendar;->getTimeZone()Ljava/util/TimeZone;
v0 = (( java.util.TimeZone ) v0 ).getRawOffset ( ); // invoke-virtual {v0}, Ljava/util/TimeZone;->getRawOffset()I
/* const v1, 0x36ee80 */
/* div-int/2addr v0, v1 */
/* :try_end_0 */
/* .catch Ljava/lang/Exception; {:try_start_0 ..:try_end_0} :catch_0 */
/* .line 484 */
} // :goto_0
/* .line 480 */
/* :catch_0 */
/* move-exception v0 */
/* .line 481 */
v1 = com.umeng.common.b.a;
final String v2 = "error in getTimeZone"; // const-string v2, "error in getTimeZone"
com.umeng.common.Log .a ( v1,v2,v0 );
/* .line 484 */
} // :cond_0
/* const/16 v0, 0x8 */
} // .end method
public static java.lang.String p ( android.content.Context p0 ) {
/* .locals 4 */
/* .prologue */
/* .line 493 */
int v0 = 2; // const/4 v0, 0x2
/* new-array v0, v0, [Ljava/lang/String; */
/* .line 496 */
try { // :try_start_0
com.umeng.common.b .y ( p0 );
/* .line 498 */
if ( v1 != null) { // if-eqz v1, :cond_0
/* .line 499 */
int v2 = 0; // const/4 v2, 0x0
(( java.util.Locale ) v1 ).getCountry ( ); // invoke-virtual {v1}, Ljava/util/Locale;->getCountry()Ljava/lang/String;
/* aput-object v3, v0, v2 */
/* .line 500 */
int v2 = 1; // const/4 v2, 0x1
(( java.util.Locale ) v1 ).getLanguage ( ); // invoke-virtual {v1}, Ljava/util/Locale;->getLanguage()Ljava/lang/String;
/* aput-object v1, v0, v2 */
/* .line 503 */
} // :cond_0
int v1 = 0; // const/4 v1, 0x0
/* aget-object v1, v0, v1 */
v1 = android.text.TextUtils .isEmpty ( v1 );
if ( v1 != null) { // if-eqz v1, :cond_1
/* .line 504 */
int v1 = 0; // const/4 v1, 0x0
final String v2 = "Unknown"; // const-string v2, "Unknown"
/* aput-object v2, v0, v1 */
/* .line 505 */
} // :cond_1
int v1 = 1; // const/4 v1, 0x1
/* aget-object v1, v0, v1 */
v1 = android.text.TextUtils .isEmpty ( v1 );
if ( v1 != null) { // if-eqz v1, :cond_2
/* .line 506 */
int v1 = 1; // const/4 v1, 0x1
final String v2 = "Unknown"; // const-string v2, "Unknown"
/* aput-object v2, v0, v1 */
/* :try_end_0 */
/* .catch Ljava/lang/Exception; {:try_start_0 ..:try_end_0} :catch_0 */
/* .line 513 */
} // :cond_2
} // :goto_0
/* .line 509 */
/* :catch_0 */
/* move-exception v1 */
/* .line 510 */
v2 = com.umeng.common.b.a;
final String v3 = "error in getLocaleInfo"; // const-string v3, "error in getLocaleInfo"
com.umeng.common.Log .b ( v2,v3,v1 );
} // .end method
public static java.lang.String q ( android.content.Context p0 ) {
/* .locals 3 */
/* .prologue */
/* .line 547 */
/* .line 549 */
try { // :try_start_0
(( android.content.Context ) p0 ).getPackageManager ( ); // invoke-virtual {p0}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;
/* .line 551 */
(( android.content.Context ) p0 ).getPackageName ( ); // invoke-virtual {p0}, Landroid/content/Context;->getPackageName()Ljava/lang/String;
/* const/16 v2, 0x80 */
/* .line 550 */
(( android.content.pm.PackageManager ) v0 ).getApplicationInfo ( v1, v2 ); // invoke-virtual {v0, v1, v2}, Landroid/content/pm/PackageManager;->getApplicationInfo(Ljava/lang/String;I)Landroid/content/pm/ApplicationInfo;
/* .line 553 */
if ( v0 != null) { // if-eqz v0, :cond_1
/* .line 554 */
v0 = this.metaData;
final String v1 = "UMENG_APPKEY"; // const-string v1, "UMENG_APPKEY"
(( android.os.Bundle ) v0 ).getString ( v1 ); // invoke-virtual {v0, v1}, Landroid/os/Bundle;->getString(Ljava/lang/String;)Ljava/lang/String;
/* .line 555 */
if ( v0 != null) { // if-eqz v0, :cond_0
/* .line 557 */
(( java.lang.String ) v0 ).trim ( ); // invoke-virtual {v0}, Ljava/lang/String;->trim()Ljava/lang/String;
/* .line 569 */
} // :goto_0
/* .line 559 */
} // :cond_0
v0 = com.umeng.common.b.a;
/* .line 560 */
final String v1 = "Could not read UMENG_APPKEY meta-data from AndroidManifest.xml."; // const-string v1, "Could not read UMENG_APPKEY meta-data from AndroidManifest.xml."
/* .line 559 */
com.umeng.common.Log .b ( v0,v1 );
/* :try_end_0 */
/* .catch Ljava/lang/Exception; {:try_start_0 ..:try_end_0} :catch_0 */
/* .line 569 */
} // :cond_1
} // :goto_1
int v0 = 0; // const/4 v0, 0x0
/* .line 564 */
/* :catch_0 */
/* move-exception v0 */
/* .line 565 */
v1 = com.umeng.common.b.a;
/* .line 566 */
final String v2 = "Could not read UMENG_APPKEY meta-data from AndroidManifest.xml."; // const-string v2, "Could not read UMENG_APPKEY meta-data from AndroidManifest.xml."
/* .line 565 */
com.umeng.common.Log .b ( v1,v2,v0 );
} // .end method
public static java.lang.String r ( android.content.Context p0 ) {
/* .locals 4 */
/* .prologue */
/* .line 579 */
try { // :try_start_0
final String v0 = "wifi"; // const-string v0, "wifi"
(( android.content.Context ) p0 ).getSystemService ( v0 ); // invoke-virtual {p0, v0}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;
/* check-cast v0, Landroid/net/wifi/WifiManager; */
/* .line 580 */
final String v1 = "android.permission.ACCESS_WIFI_STATE"; // const-string v1, "android.permission.ACCESS_WIFI_STATE"
v1 = com.umeng.common.b .a ( p0,v1 );
if ( v1 != null) { // if-eqz v1, :cond_0
/* .line 581 */
(( android.net.wifi.WifiManager ) v0 ).getConnectionInfo ( ); // invoke-virtual {v0}, Landroid/net/wifi/WifiManager;->getConnectionInfo()Landroid/net/wifi/WifiInfo;
/* .line 582 */
(( android.net.wifi.WifiInfo ) v0 ).getMacAddress ( ); // invoke-virtual {v0}, Landroid/net/wifi/WifiInfo;->getMacAddress()Ljava/lang/String;
/* .line 589 */
} // :goto_0
/* .line 584 */
} // :cond_0
v0 = com.umeng.common.b.a;
final String v1 = "Could not get mac address.[no permission android.permission.ACCESS_WIFI_STATE"; // const-string v1, "Could not get mac address.[no permission android.permission.ACCESS_WIFI_STATE"
com.umeng.common.Log .e ( v0,v1 );
/* :try_end_0 */
/* .catch Ljava/lang/Exception; {:try_start_0 ..:try_end_0} :catch_0 */
/* .line 589 */
} // :goto_1
final String v0 = ""; // const-string v0, ""
/* .line 586 */
/* :catch_0 */
/* move-exception v0 */
/* .line 587 */
v1 = com.umeng.common.b.a;
/* new-instance v2, Ljava/lang/StringBuilder; */
final String v3 = "Could not get mac address."; // const-string v3, "Could not get mac address."
/* invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V */
(( java.lang.Exception ) v0 ).toString ( ); // invoke-virtual {v0}, Ljava/lang/Exception;->toString()Ljava/lang/String;
(( java.lang.StringBuilder ) v2 ).append ( v0 ); // invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v0 ).toString ( ); // invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
com.umeng.common.Log .e ( v1,v0 );
} // .end method
public static java.lang.String s ( android.content.Context p0 ) {
/* .locals 4 */
/* .prologue */
int v2 = -1; // const/4 v2, -0x1
/* .line 599 */
try { // :try_start_0
/* new-instance v3, Landroid/util/DisplayMetrics; */
/* invoke-direct {v3}, Landroid/util/DisplayMetrics;-><init>()V */
/* .line 601 */
final String v0 = "window"; // const-string v0, "window"
(( android.content.Context ) p0 ).getSystemService ( v0 ); // invoke-virtual {p0, v0}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;
/* .line 600 */
/* check-cast v0, Landroid/view/WindowManager; */
/* .line 602 */
(( android.view.Display ) v0 ).getMetrics ( v3 ); // invoke-virtual {v0, v3}, Landroid/view/Display;->getMetrics(Landroid/util/DisplayMetrics;)V
/* .line 606 */
(( android.content.Context ) p0 ).getApplicationInfo ( ); // invoke-virtual {p0}, Landroid/content/Context;->getApplicationInfo()Landroid/content/pm/ApplicationInfo;
/* iget v0, v0, Landroid/content/pm/ApplicationInfo;->flags:I */
/* and-int/lit16 v0, v0, 0x2000 */
/* if-nez v0, :cond_2 */
/* .line 607 */
final String v0 = "noncompatWidthPixels"; // const-string v0, "noncompatWidthPixels"
v1 = com.umeng.common.b .a ( v3,v0 );
/* .line 608 */
final String v0 = "noncompatHeightPixels"; // const-string v0, "noncompatHeightPixels"
v0 = com.umeng.common.b .a ( v3,v0 );
/* .line 611 */
} // :goto_0
/* if-eq v1, v2, :cond_0 */
/* if-ne v0, v2, :cond_1 */
/* .line 612 */
} // :cond_0
/* iget v1, v3, Landroid/util/DisplayMetrics;->widthPixels:I */
/* .line 613 */
/* iget v0, v3, Landroid/util/DisplayMetrics;->heightPixels:I */
/* .line 616 */
} // :cond_1
/* new-instance v2, Ljava/lang/StringBuffer; */
/* invoke-direct {v2}, Ljava/lang/StringBuffer;-><init>()V */
/* .line 617 */
(( java.lang.StringBuffer ) v2 ).append ( v1 ); // invoke-virtual {v2, v1}, Ljava/lang/StringBuffer;->append(I)Ljava/lang/StringBuffer;
/* .line 618 */
final String v1 = "*"; // const-string v1, "*"
(( java.lang.StringBuffer ) v2 ).append ( v1 ); // invoke-virtual {v2, v1}, Ljava/lang/StringBuffer;->append(Ljava/lang/String;)Ljava/lang/StringBuffer;
/* .line 619 */
(( java.lang.StringBuffer ) v2 ).append ( v0 ); // invoke-virtual {v2, v0}, Ljava/lang/StringBuffer;->append(I)Ljava/lang/StringBuffer;
/* .line 621 */
(( java.lang.StringBuffer ) v2 ).toString ( ); // invoke-virtual {v2}, Ljava/lang/StringBuffer;->toString()Ljava/lang/String;
/* :try_end_0 */
/* .catch Ljava/lang/Exception; {:try_start_0 ..:try_end_0} :catch_0 */
/* .line 625 */
} // :goto_1
/* .line 622 */
/* :catch_0 */
/* move-exception v0 */
/* .line 623 */
v1 = com.umeng.common.b.a;
final String v2 = "read resolution fail"; // const-string v2, "read resolution fail"
com.umeng.common.Log .b ( v1,v2,v0 );
/* .line 625 */
final String v0 = "Unknown"; // const-string v0, "Unknown"
} // :cond_2
/* move v0, v2 */
/* move v1, v2 */
} // .end method
public static java.lang.String t ( android.content.Context p0 ) {
/* .locals 3 */
/* .prologue */
/* .line 648 */
/* .line 649 */
try { // :try_start_0
final String v0 = "phone"; // const-string v0, "phone"
(( android.content.Context ) p0 ).getSystemService ( v0 ); // invoke-virtual {p0, v0}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;
/* .line 648 */
/* check-cast v0, Landroid/telephony/TelephonyManager; */
/* .line 650 */
(( android.telephony.TelephonyManager ) v0 ).getNetworkOperatorName ( ); // invoke-virtual {v0}, Landroid/telephony/TelephonyManager;->getNetworkOperatorName()Ljava/lang/String;
/* :try_end_0 */
/* .catch Ljava/lang/Exception; {:try_start_0 ..:try_end_0} :catch_0 */
/* .line 654 */
} // :goto_0
/* .line 651 */
/* :catch_0 */
/* move-exception v0 */
/* .line 652 */
v1 = com.umeng.common.b.a;
final String v2 = "read carrier fail"; // const-string v2, "read carrier fail"
com.umeng.common.Log .a ( v1,v2,v0 );
/* .line 654 */
final String v0 = "Unknown"; // const-string v0, "Unknown"
} // .end method
public static java.lang.String u ( android.content.Context p0 ) {
/* .locals 4 */
/* .prologue */
/* .line 717 */
final String v1 = "Unknown"; // const-string v1, "Unknown"
/* .line 719 */
try { // :try_start_0
(( android.content.Context ) p0 ).getPackageManager ( ); // invoke-virtual {p0}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;
/* .line 721 */
(( android.content.Context ) p0 ).getPackageName ( ); // invoke-virtual {p0}, Landroid/content/Context;->getPackageName()Ljava/lang/String;
/* const/16 v3, 0x80 */
/* .line 720 */
(( android.content.pm.PackageManager ) v0 ).getApplicationInfo ( v2, v3 ); // invoke-virtual {v0, v2, v3}, Landroid/content/pm/PackageManager;->getApplicationInfo(Ljava/lang/String;I)Landroid/content/pm/ApplicationInfo;
/* .line 723 */
if ( v0 != null) { // if-eqz v0, :cond_1
v2 = this.metaData;
if ( v2 != null) { // if-eqz v2, :cond_1
/* .line 724 */
v0 = this.metaData;
final String v2 = "UMENG_CHANNEL"; // const-string v2, "UMENG_CHANNEL"
(( android.os.Bundle ) v0 ).get ( v2 ); // invoke-virtual {v0, v2}, Landroid/os/Bundle;->get(Ljava/lang/String;)Ljava/lang/Object;
/* .line 725 */
if ( v0 != null) { // if-eqz v0, :cond_1
/* .line 726 */
(( java.lang.Object ) v0 ).toString ( ); // invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;
/* .line 727 */
if ( v0 != null) { // if-eqz v0, :cond_0
/* .line 740 */
} // :goto_0
/* .line 730 */
} // :cond_0
v0 = com.umeng.common.b.a;
/* .line 731 */
final String v2 = "Could not read UMENG_CHANNEL meta-data from AndroidManifest.xml."; // const-string v2, "Could not read UMENG_CHANNEL meta-data from AndroidManifest.xml."
/* .line 730 */
com.umeng.common.Log .a ( v0,v2 );
/* :try_end_0 */
/* .catch Ljava/lang/Exception; {:try_start_0 ..:try_end_0} :catch_0 */
/* move-object v0, v1 */
/* .line 735 */
/* :catch_0 */
/* move-exception v0 */
/* .line 736 */
v2 = com.umeng.common.b.a;
/* .line 737 */
final String v3 = "Could not read UMENG_CHANNEL meta-data from AndroidManifest.xml."; // const-string v3, "Could not read UMENG_CHANNEL meta-data from AndroidManifest.xml."
/* .line 736 */
com.umeng.common.Log .a ( v2,v3 );
/* .line 738 */
(( java.lang.Exception ) v0 ).printStackTrace ( ); // invoke-virtual {v0}, Ljava/lang/Exception;->printStackTrace()V
} // :cond_1
/* move-object v0, v1 */
} // .end method
public static java.lang.String v ( android.content.Context p0 ) {
/* .locals 1 */
/* .prologue */
/* .line 749 */
(( android.content.Context ) p0 ).getPackageName ( ); // invoke-virtual {p0}, Landroid/content/Context;->getPackageName()Ljava/lang/String;
} // .end method
public static java.lang.String w ( android.content.Context p0 ) {
/* .locals 2 */
/* .prologue */
/* .line 757 */
(( android.content.Context ) p0 ).getPackageManager ( ); // invoke-virtual {p0}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;
(( android.content.Context ) p0 ).getApplicationInfo ( ); // invoke-virtual {p0}, Landroid/content/Context;->getApplicationInfo()Landroid/content/pm/ApplicationInfo;
(( android.content.pm.PackageManager ) v0 ).getApplicationLabel ( v1 ); // invoke-virtual {v0, v1}, Landroid/content/pm/PackageManager;->getApplicationLabel(Landroid/content/pm/ApplicationInfo;)Ljava/lang/CharSequence;
} // .end method
public static Boolean x ( android.content.Context p0 ) {
/* .locals 2 */
/* .prologue */
int v0 = 0; // const/4 v0, 0x0
/* .line 767 */
try { // :try_start_0
(( android.content.Context ) p0 ).getApplicationInfo ( ); // invoke-virtual {p0}, Landroid/content/Context;->getApplicationInfo()Landroid/content/pm/ApplicationInfo;
/* iget v1, v1, Landroid/content/pm/ApplicationInfo;->flags:I */
/* :try_end_0 */
/* .catch Ljava/lang/Exception; {:try_start_0 ..:try_end_0} :catch_0 */
/* and-int/lit8 v1, v1, 0x2 */
if ( v1 != null) { // if-eqz v1, :cond_0
int v0 = 1; // const/4 v0, 0x1
/* .line 769 */
} // :cond_0
} // :goto_0
/* .line 768 */
/* :catch_0 */
/* move-exception v1 */
} // .end method
private static java.util.Locale y ( android.content.Context p0 ) {
/* .locals 3 */
/* .prologue */
/* .line 522 */
int v0 = 0; // const/4 v0, 0x0
/* .line 524 */
try { // :try_start_0
/* new-instance v1, Landroid/content/res/Configuration; */
/* invoke-direct {v1}, Landroid/content/res/Configuration;-><init>()V */
/* .line 525 */
(( android.content.Context ) p0 ).getContentResolver ( ); // invoke-virtual {p0}, Landroid/content/Context;->getContentResolver()Landroid/content/ContentResolver;
android.provider.Settings$System .getConfiguration ( v2,v1 );
/* .line 527 */
if ( v1 != null) { // if-eqz v1, :cond_0
/* .line 528 */
v0 = this.locale;
/* :try_end_0 */
/* .catch Ljava/lang/Exception; {:try_start_0 ..:try_end_0} :catch_0 */
/* .line 534 */
} // :cond_0
} // :goto_0
/* if-nez v0, :cond_1 */
/* .line 535 */
java.util.Locale .getDefault ( );
/* .line 538 */
} // :cond_1
/* .line 530 */
/* :catch_0 */
/* move-exception v1 */
/* .line 531 */
v1 = com.umeng.common.b.a;
final String v2 = "fail to read user config locale"; // const-string v2, "fail to read user config locale"
com.umeng.common.Log .b ( v1,v2 );
} // .end method
