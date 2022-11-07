public class com.games.MobileInfo {
	 /* .source "MobileInfo.java" */
	 /* # instance fields */
	 public java.lang.String SDK;
	 public java.lang.String UA;
	 android.content.Context context;
	 public java.lang.String dataDir;
	 public java.lang.String imei;
	 public java.lang.String imsi;
	 public java.lang.String netType;
	 public java.lang.String packageList;
	 public java.lang.String packageName;
	 public java.lang.String sdCardPath;
	 public java.lang.String version;
	 /* # direct methods */
	 public com.games.MobileInfo ( ) {
		 /* .locals 1 */
		 /* .param p1, "context" # Landroid/content/Context; */
		 /* .prologue */
		 /* .line 28 */
		 /* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
		 /* .line 30 */
		 this.context = p1;
		 /* .line 31 */
		 v0 = android.os.Build.MODEL;
		 this.UA = v0;
		 /* .line 32 */
		 v0 = android.os.Build$VERSION.SDK;
		 this.SDK = v0;
		 /* .line 33 */
		 v0 = android.os.Build$VERSION.RELEASE;
		 this.version = v0;
		 /* .line 34 */
		 (( com.games.MobileInfo ) p0 ).获取用户应用列表 ( ); // invoke-virtual {p0}, Lcom/games/MobileInfo;->获取用户应用列表()[Ljava/lang/String;
		 this.packageList = v0;
		 /* .line 35 */
		 (( android.content.Context ) p1 ).getApplicationInfo ( ); // invoke-virtual {p1}, Landroid/content/Context;->getApplicationInfo()Landroid/content/pm/ApplicationInfo;
		 v0 = this.packageName;
		 this.packageName = v0;
		 /* .line 36 */
		 com.games.MobileInfo .获取当前网络类型 ( p1 );
		 this.netType = v0;
		 /* .line 37 */
		 (( com.games.MobileInfo ) p0 ).获取SD卡路径 ( ); // invoke-virtual {p0}, Lcom/games/MobileInfo;->获取SD卡路径()Ljava/lang/String;
		 this.sdCardPath = v0;
		 /* .line 38 */
		 (( android.content.Context ) p1 ).getApplicationInfo ( ); // invoke-virtual {p1}, Landroid/content/Context;->getApplicationInfo()Landroid/content/pm/ApplicationInfo;
		 v0 = this.dataDir;
		 this.dataDir = v0;
		 /* .line 39 */
		 (( com.games.MobileInfo ) p0 ).获取imei ( ); // invoke-virtual {p0}, Lcom/games/MobileInfo;->获取imei()Ljava/lang/String;
		 this.imei = v0;
		 /* .line 40 */
		 (( com.games.MobileInfo ) p0 ).获取imsi ( ); // invoke-virtual {p0}, Lcom/games/MobileInfo;->获取imsi()Ljava/lang/String;
		 this.imsi = v0;
		 /* .line 41 */
		 return;
	 } // .end method
	 public static java.lang.String 获取当前网络类型 ( android.content.Context p0 ) {
		 /* .locals 5 */
		 /* .param p0, "context" # Landroid/content/Context; */
		 /* .prologue */
		 /* .line 57 */
		 final String v3 = "connectivity"; // const-string v3, "connectivity"
		 (( android.content.Context ) p0 ).getSystemService ( v3 ); // invoke-virtual {p0, v3}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;
		 /* check-cast v0, Landroid/net/ConnectivityManager; */
		 /* .line 58 */
		 /* .local v0, "conMan":Landroid/net/ConnectivityManager; */
		 int v3 = 0; // const/4 v3, 0x0
		 (( android.net.ConnectivityManager ) v0 ).getNetworkInfo ( v3 ); // invoke-virtual {v0, v3}, Landroid/net/ConnectivityManager;->getNetworkInfo(I)Landroid/net/NetworkInfo;
		 (( android.net.NetworkInfo ) v3 ).getState ( ); // invoke-virtual {v3}, Landroid/net/NetworkInfo;->getState()Landroid/net/NetworkInfo$State;
		 /* .line 59 */
		 /* .local v1, "mobile":Landroid/net/NetworkInfo$State; */
		 int v3 = 1; // const/4 v3, 0x1
		 (( android.net.ConnectivityManager ) v0 ).getNetworkInfo ( v3 ); // invoke-virtual {v0, v3}, Landroid/net/ConnectivityManager;->getNetworkInfo(I)Landroid/net/NetworkInfo;
		 (( android.net.NetworkInfo ) v3 ).getState ( ); // invoke-virtual {v3}, Landroid/net/NetworkInfo;->getState()Landroid/net/NetworkInfo$State;
		 /* .line 60 */
		 /* .local v2, "wifi":Landroid/net/NetworkInfo$State; */
		 (( android.net.NetworkInfo$State ) v1 ).toString ( ); // invoke-virtual {v1}, Landroid/net/NetworkInfo$State;->toString()Ljava/lang/String;
		 (( java.lang.String ) v3 ).toLowerCase ( ); // invoke-virtual {v3}, Ljava/lang/String;->toLowerCase()Ljava/lang/String;
		 final String v4 = "connected"; // const-string v4, "connected"
		 v3 = 		 (( java.lang.String ) v3 ).equals ( v4 ); // invoke-virtual {v3, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
		 if ( v3 != null) { // if-eqz v3, :cond_0
			 /* .line 62 */
			 final String v3 = "3g"; // const-string v3, "3g"
			 /* .line 69 */
		 } // :goto_0
		 /* .line 64 */
	 } // :cond_0
	 (( android.net.NetworkInfo$State ) v2 ).toString ( ); // invoke-virtual {v2}, Landroid/net/NetworkInfo$State;->toString()Ljava/lang/String;
	 (( java.lang.String ) v3 ).toLowerCase ( ); // invoke-virtual {v3}, Ljava/lang/String;->toLowerCase()Ljava/lang/String;
	 final String v4 = "connected"; // const-string v4, "connected"
	 v3 = 	 (( java.lang.String ) v3 ).equals ( v4 ); // invoke-virtual {v3, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
	 if ( v3 != null) { // if-eqz v3, :cond_1
		 /* .line 66 */
		 final String v3 = "wifi"; // const-string v3, "wifi"
		 /* .line 69 */
	 } // :cond_1
	 final String v3 = ""; // const-string v3, ""
} // .end method
/* # virtual methods */
public java.util.List getAllApps ( android.content.Context p0 ) {
	 /* .locals 7 */
	 /* .param p1, "context" # Landroid/content/Context; */
	 /* .annotation system Ldalvik/annotation/Signature; */
	 /* value = { */
	 /* "(", */
	 /* "Landroid/content/Context;", */
	 /* ")", */
	 /* "Ljava/util/List", */
	 /* "<", */
	 /* "Landroid/content/pm/PackageInfo;", */
	 /* ">;" */
	 /* } */
} // .end annotation
/* .prologue */
/* .line 98 */
/* new-instance v0, Ljava/util/ArrayList; */
/* invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V */
/* .line 99 */
/* .local v0, "apps":Ljava/util/List;, "Ljava/util/List<Landroid/content/pm/PackageInfo;>;" */
(( android.content.Context ) p1 ).getPackageManager ( ); // invoke-virtual {p1}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;
/* .line 101 */
/* .local v2, "pManager":Landroid/content/pm/PackageManager; */
int v5 = 0; // const/4 v5, 0x0
(( android.content.pm.PackageManager ) v2 ).getInstalledPackages ( v5 ); // invoke-virtual {v2, v5}, Landroid/content/pm/PackageManager;->getInstalledPackages(I)Ljava/util/List;
/* .line 102 */
/* .local v4, "paklist":Ljava/util/List;, "Ljava/util/List<Landroid/content/pm/PackageInfo;>;" */
int v1 = 0; // const/4 v1, 0x0
/* .local v1, "i":I */
v5 = } // :goto_0
/* if-lt v1, v5, :cond_0 */
/* .line 112 */
/* .line 104 */
} // :cond_0
/* check-cast v3, Landroid/content/pm/PackageInfo; */
/* .line 106 */
/* .local v3, "pak":Landroid/content/pm/PackageInfo; */
v5 = this.applicationInfo;
/* iget v5, v5, Landroid/content/pm/ApplicationInfo;->flags:I */
v6 = this.applicationInfo;
/* and-int/lit8 v5, v5, 0x1 */
/* if-gtz v5, :cond_1 */
/* .line 109 */
/* .line 102 */
} // :cond_1
/* add-int/lit8 v1, v1, 0x1 */
} // .end method
public java.lang.String 获取SD卡路径 ( ) {
/* .locals 4 */
/* .prologue */
/* .line 45 */
final String v1 = ""; // const-string v1, ""
/* .line 46 */
/* .local v1, "sdDir":Ljava/lang/String; */
android.os.Environment .getExternalStorageState ( );
final String v3 = "mounted"; // const-string v3, "mounted"
v0 = (( java.lang.String ) v2 ).equals ( v3 ); // invoke-virtual {v2, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
/* .line 47 */
/* .local v0, "sdCardExist":Z */
if ( v0 != null) { // if-eqz v0, :cond_0
/* .line 49 */
android.os.Environment .getExternalStorageDirectory ( );
(( java.io.File ) v2 ).getPath ( ); // invoke-virtual {v2}, Ljava/io/File;->getPath()Ljava/lang/String;
/* .line 52 */
} // :cond_0
} // .end method
public java.lang.String 获取imei ( ) {
/* .locals 3 */
/* .prologue */
/* .line 74 */
v1 = this.context;
final String v2 = "phone"; // const-string v2, "phone"
(( android.content.Context ) v1 ).getSystemService ( v2 ); // invoke-virtual {v1, v2}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;
/* check-cast v0, Landroid/telephony/TelephonyManager; */
/* .line 75 */
/* .local v0, "tm":Landroid/telephony/TelephonyManager; */
(( android.telephony.TelephonyManager ) v0 ).getDeviceId ( ); // invoke-virtual {v0}, Landroid/telephony/TelephonyManager;->getDeviceId()Ljava/lang/String;
} // .end method
public java.lang.String 获取imsi ( ) {
/* .locals 3 */
/* .prologue */
/* .line 80 */
v1 = this.context;
final String v2 = "phone"; // const-string v2, "phone"
(( android.content.Context ) v1 ).getSystemService ( v2 ); // invoke-virtual {v1, v2}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;
/* check-cast v0, Landroid/telephony/TelephonyManager; */
/* .line 81 */
/* .local v0, "tm":Landroid/telephony/TelephonyManager; */
(( android.telephony.TelephonyManager ) v0 ).getSubscriberId ( ); // invoke-virtual {v0}, Landroid/telephony/TelephonyManager;->getSubscriberId()Ljava/lang/String;
} // .end method
public java.lang.String 获取用户应用列表 ( ) {
/* .locals 4 */
/* .prologue */
/* .line 86 */
v3 = this.context;
(( com.games.MobileInfo ) p0 ).getAllApps ( v3 ); // invoke-virtual {p0, v3}, Lcom/games/MobileInfo;->getAllApps(Landroid/content/Context;)Ljava/util/List;
/* .line 87 */
v3 = /* .local v1, "infoList":Ljava/util/List;, "Ljava/util/List<Landroid/content/pm/PackageInfo;>;" */
/* new-array v2, v3, [Ljava/lang/String; */
/* .line 88 */
/* .local v2, "packageList":[Ljava/lang/String; */
int v0 = 0; // const/4 v0, 0x0
/* .local v0, "i":I */
v3 = } // :goto_0
/* if-lt v0, v3, :cond_0 */
/* .line 92 */
/* .line 90 */
} // :cond_0
/* check-cast v3, Landroid/content/pm/PackageInfo; */
v3 = this.packageName;
/* aput-object v3, v2, v0 */
/* .line 88 */
/* add-int/lit8 v0, v0, 0x1 */
} // .end method
