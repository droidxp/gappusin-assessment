public class com.ansca.corona.purchasing.StoreServices {
	 /* .source "StoreServices.java" */
	 /* # static fields */
	 public static final java.lang.String AMAZON_MARKETPLACE_APP_PACKAGE_NAME;
	 public static final java.lang.String GOOGLE_MARKETPLACE_APP_PACKAGE_NAME_1;
	 public static final java.lang.String GOOGLE_MARKETPLACE_APP_PACKAGE_NAME_2;
	 /* # direct methods */
	 private com.ansca.corona.purchasing.StoreServices ( ) {
		 /* .locals 0 */
		 /* .prologue */
		 /* .line 12 */
		 /* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
		 /* .line 13 */
		 return;
	 } // .end method
	 public static java.lang.String getAvailableStoreNames ( ) {
		 /* .locals 3 */
		 /* .prologue */
		 /* .line 85 */
		 int v0 = 0; // const/4 v0, 0x0
		 /* .line 87 */
		 /* .local v0, "availableStoreNames":[Ljava/lang/String; */
		 final String v1 = "google"; // const-string v1, "google"
		 v1 = 		 com.ansca.corona.purchasing.StoreServices .isStoreAvailable ( v1 );
		 if ( v1 != null) { // if-eqz v1, :cond_0
			 /* .line 88 */
			 int v1 = 1; // const/4 v1, 0x1
			 /* new-array v0, v1, [Ljava/lang/String; */
			 /* .line 89 */
			 int v1 = 0; // const/4 v1, 0x0
			 final String v2 = "google"; // const-string v2, "google"
			 /* aput-object v2, v0, v1 */
			 /* .line 91 */
		 } // :cond_0
	 } // .end method
	 public static java.lang.String getDefaultStoreName ( ) {
		 /* .locals 2 */
		 /* .prologue */
		 /* .line 41 */
		 final String v0 = "google"; // const-string v0, "google"
		 /* .line 42 */
		 /* .local v0, "storeName":Ljava/lang/String; */
		 v1 = 		 com.ansca.corona.purchasing.StoreServices .isStoreAvailable ( v0 );
		 if ( v1 != null) { // if-eqz v1, :cond_0
			 /* .line 47 */
		 } // .end local v0 # "storeName":Ljava/lang/String;
	 } // :goto_0
	 /* .restart local v0 # "storeName":Ljava/lang/String; */
} // :cond_0
final String v0 = "none"; // const-string v0, "none"
} // .end method
public static java.lang.String getStoreApplicationWasPurchasedFrom ( ) {
/* .locals 5 */
/* .prologue */
/* .line 101 */
final String v2 = "none"; // const-string v2, "none"
/* .line 104 */
/* .local v2, "storeName":Ljava/lang/String; */
try { // :try_start_0
	 com.ansca.corona.CoronaEnvironment .getApplicationContext ( );
	 /* .line 105 */
	 /* .local v0, "context":Landroid/content/Context; */
	 (( android.content.Context ) v0 ).getPackageManager ( ); // invoke-virtual {v0}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;
	 (( android.content.Context ) v0 ).getPackageName ( ); // invoke-virtual {v0}, Landroid/content/Context;->getPackageName()Ljava/lang/String;
	 (( android.content.pm.PackageManager ) v3 ).getInstallerPackageName ( v4 ); // invoke-virtual {v3, v4}, Landroid/content/pm/PackageManager;->getInstallerPackageName(Ljava/lang/String;)Ljava/lang/String;
	 /* .line 106 */
	 /* .local v1, "installerPackageName":Ljava/lang/String; */
	 com.ansca.corona.purchasing.StoreName .fromPackageName ( v1 );
	 /* :try_end_0 */
	 /* .catch Ljava/lang/Exception; {:try_start_0 ..:try_end_0} :catch_0 */
	 /* .line 110 */
} // .end local v0 # "context":Landroid/content/Context;
} // .end local v1 # "installerPackageName":Ljava/lang/String;
} // :goto_0
/* .line 108 */
/* :catch_0 */
/* move-exception v3 */
} // .end method
private static Boolean isPackageNameInstalled ( java.lang.String p0 ) {
/* .locals 4 */
/* .param p0, "packageName" # Ljava/lang/String; */
/* .prologue */
/* .line 120 */
if ( p0 != null) { // if-eqz p0, :cond_0
v2 = (( java.lang.String ) p0 ).length ( ); // invoke-virtual {p0}, Ljava/lang/String;->length()I
/* if-gtz v2, :cond_1 */
/* .line 121 */
} // :cond_0
int v1 = 0; // const/4 v1, 0x0
/* .line 134 */
} // :goto_0
/* .line 125 */
} // :cond_1
int v1 = 0; // const/4 v1, 0x0
/* .line 127 */
/* .local v1, "isInstalled":Z */
try { // :try_start_0
com.ansca.corona.CoronaEnvironment .getApplicationContext ( );
/* .line 128 */
/* .local v0, "context":Landroid/content/Context; */
(( android.content.Context ) v0 ).getPackageManager ( ); // invoke-virtual {v0}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;
int v3 = 1; // const/4 v3, 0x1
(( android.content.pm.PackageManager ) v2 ).getPackageInfo ( p0, v3 ); // invoke-virtual {v2, p0, v3}, Landroid/content/pm/PackageManager;->getPackageInfo(Ljava/lang/String;I)Landroid/content/pm/PackageInfo;
/* :try_end_0 */
/* .catch Ljava/lang/Exception; {:try_start_0 ..:try_end_0} :catch_0 */
/* .line 129 */
int v1 = 1; // const/4 v1, 0x1
/* .line 131 */
} // .end local v0 # "context":Landroid/content/Context;
/* :catch_0 */
/* move-exception v2 */
} // .end method
public static Boolean isStoreAvailable ( java.lang.String p0 ) {
/* .locals 2 */
/* .param p0, "storeName" # Ljava/lang/String; */
/* .prologue */
int v0 = 0; // const/4 v0, 0x0
/* .line 58 */
v1 = com.ansca.corona.purchasing.StoreName .isNotValid ( p0 );
if ( v1 != null) { // if-eqz v1, :cond_1
/* .line 76 */
} // :cond_0
} // :goto_0
/* .line 63 */
} // :cond_1
final String v1 = "google"; // const-string v1, "google"
v1 = (( java.lang.String ) p0 ).equals ( v1 ); // invoke-virtual {p0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
if ( v1 != null) { // if-eqz v1, :cond_3
/* .line 66 */
final String v1 = "com.android.vending"; // const-string v1, "com.android.vending"
v1 = com.ansca.corona.purchasing.StoreServices .isPackageNameInstalled ( v1 );
/* if-nez v1, :cond_2 */
final String v1 = "com.google.android.feedback"; // const-string v1, "com.google.android.feedback"
v1 = com.ansca.corona.purchasing.StoreServices .isPackageNameInstalled ( v1 );
if ( v1 != null) { // if-eqz v1, :cond_0
/* .line 68 */
} // :cond_2
int v0 = 1; // const/4 v0, 0x1
/* .line 71 */
} // :cond_3
final String v1 = "amazon"; // const-string v1, "amazon"
v1 = (( java.lang.String ) p0 ).equals ( v1 ); // invoke-virtual {p0, v1}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
if ( v1 != null) { // if-eqz v1, :cond_0
} // .end method
