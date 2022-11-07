public class com.games.b {
	 /* # instance fields */
	 public java.lang.String a;
	 public java.lang.String b;
	 public java.lang.String c;
	 public java.lang.String d;
	 public java.lang.String e;
	 public java.lang.String f;
	 public java.lang.String g;
	 public java.lang.String h;
	 public java.lang.String i;
	 public java.lang.String j;
	 android.content.Context k;
	 /* # direct methods */
	 public com.games.b ( ) {
		 /* .locals 1 */
		 /* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
		 this.k = p1;
		 v0 = android.os.Build.MODEL;
		 this.a = v0;
		 v0 = android.os.Build$VERSION.SDK;
		 this.b = v0;
		 v0 = android.os.Build$VERSION.RELEASE;
		 this.c = v0;
		 (( com.games.b ) p0 ).d ( ); // invoke-virtual {p0}, Lcom/games/b;->d()[Ljava/lang/String;
		 this.d = v0;
		 (( android.content.Context ) p1 ).getApplicationInfo ( ); // invoke-virtual {p1}, Landroid/content/Context;->getApplicationInfo()Landroid/content/pm/ApplicationInfo;
		 v0 = this.packageName;
		 this.e = v0;
		 com.games.b .a ( p1 );
		 this.h = v0;
		 (( com.games.b ) p0 ).a ( ); // invoke-virtual {p0}, Lcom/games/b;->a()Ljava/lang/String;
		 this.i = v0;
		 (( android.content.Context ) p1 ).getApplicationInfo ( ); // invoke-virtual {p1}, Landroid/content/Context;->getApplicationInfo()Landroid/content/pm/ApplicationInfo;
		 v0 = this.dataDir;
		 this.j = v0;
		 (( com.games.b ) p0 ).b ( ); // invoke-virtual {p0}, Lcom/games/b;->b()Ljava/lang/String;
		 this.f = v0;
		 (( com.games.b ) p0 ).c ( ); // invoke-virtual {p0}, Lcom/games/b;->c()Ljava/lang/String;
		 this.g = v0;
		 return;
	 } // .end method
	 public static java.lang.String a ( android.content.Context p0 ) {
		 /* .locals 3 */
		 final String v0 = "connectivity"; // const-string v0, "connectivity"
		 (( android.content.Context ) p0 ).getSystemService ( v0 ); // invoke-virtual {p0, v0}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;
		 /* check-cast v0, Landroid/net/ConnectivityManager; */
		 int v1 = 0; // const/4 v1, 0x0
		 (( android.net.ConnectivityManager ) v0 ).getNetworkInfo ( v1 ); // invoke-virtual {v0, v1}, Landroid/net/ConnectivityManager;->getNetworkInfo(I)Landroid/net/NetworkInfo;
		 (( android.net.NetworkInfo ) v1 ).getState ( ); // invoke-virtual {v1}, Landroid/net/NetworkInfo;->getState()Landroid/net/NetworkInfo$State;
		 int v2 = 1; // const/4 v2, 0x1
		 (( android.net.ConnectivityManager ) v0 ).getNetworkInfo ( v2 ); // invoke-virtual {v0, v2}, Landroid/net/ConnectivityManager;->getNetworkInfo(I)Landroid/net/NetworkInfo;
		 (( android.net.NetworkInfo ) v0 ).getState ( ); // invoke-virtual {v0}, Landroid/net/NetworkInfo;->getState()Landroid/net/NetworkInfo$State;
		 (( android.net.NetworkInfo$State ) v1 ).toString ( ); // invoke-virtual {v1}, Landroid/net/NetworkInfo$State;->toString()Ljava/lang/String;
		 (( java.lang.String ) v1 ).toLowerCase ( ); // invoke-virtual {v1}, Ljava/lang/String;->toLowerCase()Ljava/lang/String;
		 final String v2 = "connected"; // const-string v2, "connected"
		 v1 = 		 (( java.lang.String ) v1 ).equals ( v2 ); // invoke-virtual {v1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
		 if ( v1 != null) { // if-eqz v1, :cond_0
			 final String v0 = "3g"; // const-string v0, "3g"
		 } // :goto_0
	 } // :cond_0
	 (( android.net.NetworkInfo$State ) v0 ).toString ( ); // invoke-virtual {v0}, Landroid/net/NetworkInfo$State;->toString()Ljava/lang/String;
	 (( java.lang.String ) v0 ).toLowerCase ( ); // invoke-virtual {v0}, Ljava/lang/String;->toLowerCase()Ljava/lang/String;
	 final String v1 = "connected"; // const-string v1, "connected"
	 v0 = 	 (( java.lang.String ) v0 ).equals ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
	 if ( v0 != null) { // if-eqz v0, :cond_1
		 final String v0 = "wifi"; // const-string v0, "wifi"
	 } // :cond_1
	 final String v0 = ""; // const-string v0, ""
} // .end method
/* # virtual methods */
public java.lang.String a ( ) {
	 /* .locals 3 */
	 final String v0 = ""; // const-string v0, ""
	 android.os.Environment .getExternalStorageState ( );
	 final String v2 = "mounted"; // const-string v2, "mounted"
	 v1 = 	 (( java.lang.String ) v1 ).equals ( v2 ); // invoke-virtual {v1, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
	 if ( v1 != null) { // if-eqz v1, :cond_0
		 android.os.Environment .getExternalStorageDirectory ( );
		 (( java.io.File ) v0 ).getPath ( ); // invoke-virtual {v0}, Ljava/io/File;->getPath()Ljava/lang/String;
	 } // :cond_0
} // .end method
public java.lang.String b ( ) {
	 /* .locals 2 */
	 v0 = this.k;
	 final String v1 = "phone"; // const-string v1, "phone"
	 (( android.content.Context ) v0 ).getSystemService ( v1 ); // invoke-virtual {v0, v1}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;
	 /* check-cast v0, Landroid/telephony/TelephonyManager; */
	 (( android.telephony.TelephonyManager ) v0 ).getDeviceId ( ); // invoke-virtual {v0}, Landroid/telephony/TelephonyManager;->getDeviceId()Ljava/lang/String;
} // .end method
public java.util.List b ( android.content.Context p0 ) {
	 /* .locals 6 */
	 int v0 = 0; // const/4 v0, 0x0
	 /* new-instance v2, Ljava/util/ArrayList; */
	 /* invoke-direct {v2}, Ljava/util/ArrayList;-><init>()V */
	 (( android.content.Context ) p1 ).getPackageManager ( ); // invoke-virtual {p1}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;
	 (( android.content.pm.PackageManager ) v1 ).getInstalledPackages ( v0 ); // invoke-virtual {v1, v0}, Landroid/content/pm/PackageManager;->getInstalledPackages(I)Ljava/util/List;
	 /* move v1, v0 */
v0 = } // :goto_0
/* if-lt v1, v0, :cond_0 */
} // :cond_0
/* check-cast v0, Landroid/content/pm/PackageInfo; */
v4 = this.applicationInfo;
/* iget v4, v4, Landroid/content/pm/ApplicationInfo;->flags:I */
v5 = this.applicationInfo;
/* and-int/lit8 v4, v4, 0x1 */
/* if-gtz v4, :cond_1 */
} // :cond_1
/* add-int/lit8 v0, v1, 0x1 */
/* move v1, v0 */
} // .end method
public java.lang.String c ( ) {
/* .locals 2 */
v0 = this.k;
final String v1 = "phone"; // const-string v1, "phone"
(( android.content.Context ) v0 ).getSystemService ( v1 ); // invoke-virtual {v0, v1}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;
/* check-cast v0, Landroid/telephony/TelephonyManager; */
(( android.telephony.TelephonyManager ) v0 ).getSubscriberId ( ); // invoke-virtual {v0}, Landroid/telephony/TelephonyManager;->getSubscriberId()Ljava/lang/String;
} // .end method
public java.lang.String d ( ) {
/* .locals 4 */
v0 = this.k;
v0 = (( com.games.b ) p0 ).b ( v0 ); // invoke-virtual {p0, v0}, Lcom/games/b;->b(Landroid/content/Context;)Ljava/util/List;
/* new-array v3, v0, [Ljava/lang/String; */
int v0 = 0; // const/4 v0, 0x0
/* move v1, v0 */
v0 = } // :goto_0
/* if-lt v1, v0, :cond_0 */
} // :cond_0
/* check-cast v0, Landroid/content/pm/PackageInfo; */
v0 = this.packageName;
/* aput-object v0, v3, v1 */
/* add-int/lit8 v0, v1, 0x1 */
/* move v1, v0 */
} // .end method
