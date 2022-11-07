class com.umeng.analytics.h {
	 /* .source "UmengNetworkHelper.java" */
	 /* # static fields */
	 private static final java.lang.String a;
	 /* # direct methods */
	 static com.umeng.analytics.h ( ) {
		 /* .locals 1 */
		 /* .prologue */
		 /* .line 16 */
		 /* const-class v0, Lcom/umeng/analytics/h; */
		 (( java.lang.Class ) v0 ).getName ( ); // invoke-virtual {v0}, Ljava/lang/Class;->getName()Ljava/lang/String;
		 return;
	 } // .end method
	 com.umeng.analytics.h ( ) {
		 /* .locals 0 */
		 /* .prologue */
		 /* .line 15 */
		 /* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
		 return;
	 } // .end method
	 public static java.lang.String a ( android.content.Context p0 ) {
		 /* .locals 5 */
		 /* .prologue */
		 int v1 = 0; // const/4 v1, 0x0
		 /* .line 18 */
		 (( android.content.Context ) p0 ).getPackageManager ( ); // invoke-virtual {p0}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;
		 /* .line 19 */
		 final String v2 = "android.permission.ACCESS_NETWORK_STATE"; // const-string v2, "android.permission.ACCESS_NETWORK_STATE"
		 (( android.content.Context ) p0 ).getPackageName ( ); // invoke-virtual {p0}, Landroid/content/Context;->getPackageName()Ljava/lang/String;
		 v0 = 		 (( android.content.pm.PackageManager ) v0 ).checkPermission ( v2, v3 ); // invoke-virtual {v0, v2, v3}, Landroid/content/pm/PackageManager;->checkPermission(Ljava/lang/String;Ljava/lang/String;)I
		 if ( v0 != null) { // if-eqz v0, :cond_0
			 /* move-object v0, v1 */
			 /* .line 48 */
		 } // :goto_0
		 /* .line 25 */
	 } // :cond_0
	 try { // :try_start_0
		 final String v0 = "connectivity"; // const-string v0, "connectivity"
		 (( android.content.Context ) p0 ).getSystemService ( v0 ); // invoke-virtual {p0, v0}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;
		 /* .line 24 */
		 /* check-cast v0, Landroid/net/ConnectivityManager; */
		 /* .line 26 */
		 (( android.net.ConnectivityManager ) v0 ).getActiveNetworkInfo ( ); // invoke-virtual {v0}, Landroid/net/ConnectivityManager;->getActiveNetworkInfo()Landroid/net/NetworkInfo;
		 /* .line 27 */
		 /* if-nez v0, :cond_1 */
		 /* move-object v0, v1 */
		 /* .line 28 */
		 /* .line 30 */
	 } // :cond_1
	 v2 = 	 (( android.net.NetworkInfo ) v0 ).getType ( ); // invoke-virtual {v0}, Landroid/net/NetworkInfo;->getType()I
	 int v3 = 1; // const/4 v3, 0x1
	 /* if-ne v2, v3, :cond_2 */
	 /* move-object v0, v1 */
	 /* .line 31 */
	 /* .line 33 */
} // :cond_2
(( android.net.NetworkInfo ) v0 ).getExtraInfo ( ); // invoke-virtual {v0}, Landroid/net/NetworkInfo;->getExtraInfo()Ljava/lang/String;
/* .line 34 */
v2 = com.umeng.analytics.h.a;
/* new-instance v3, Ljava/lang/StringBuilder; */
final String v4 = "net type:"; // const-string v4, "net type:"
/* invoke-direct {v3, v4}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V */
(( java.lang.StringBuilder ) v3 ).append ( v0 ); // invoke-virtual {v3, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v3 ).toString ( ); // invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
com.umeng.common.Log .a ( v2,v3 );
/* .line 35 */
/* if-nez v0, :cond_3 */
/* move-object v0, v1 */
/* .line 36 */
/* .line 37 */
} // :cond_3
final String v2 = "cmwap"; // const-string v2, "cmwap"
v2 = (( java.lang.String ) v0 ).equals ( v2 ); // invoke-virtual {v0, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
/* if-nez v2, :cond_4 */
final String v2 = "3gwap"; // const-string v2, "3gwap"
v2 = (( java.lang.String ) v0 ).equals ( v2 ); // invoke-virtual {v0, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
/* if-nez v2, :cond_4 */
/* .line 38 */
final String v2 = "uniwap"; // const-string v2, "uniwap"
(( java.lang.String ) v0 ).equals ( v2 ); // invoke-virtual {v0, v2}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
/* :try_end_0 */
v0 = /* .catch Ljava/lang/Exception; {:try_start_0 ..:try_end_0} :catch_0 */
if ( v0 != null) { // if-eqz v0, :cond_5
/* .line 39 */
} // :cond_4
final String v0 = "10.0.0.172"; // const-string v0, "10.0.0.172"
/* .line 44 */
/* :catch_0 */
/* move-exception v0 */
/* .line 46 */
(( java.lang.Exception ) v0 ).printStackTrace ( ); // invoke-virtual {v0}, Ljava/lang/Exception;->printStackTrace()V
} // :cond_5
/* move-object v0, v1 */
/* .line 48 */
} // .end method
