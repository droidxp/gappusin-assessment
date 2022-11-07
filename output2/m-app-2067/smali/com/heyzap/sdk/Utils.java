class com.heyzap.sdk.Utils {
	 /* # static fields */
	 private static Float density;
	 /* # direct methods */
	 static com.heyzap.sdk.Utils ( ) {
		 /* .locals 1 */
		 /* const/high16 v0, -0x40800000 # -1.0f */
		 return;
	 } // .end method
	 com.heyzap.sdk.Utils ( ) {
		 /* .locals 0 */
		 /* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
		 return;
	 } // .end method
	 public static Boolean androidVersionSupported ( ) {
		 /* .locals 3 */
		 int v2 = 0; // const/4 v2, 0x0
		 try { // :try_start_0
			 v0 = android.os.Build$VERSION.SDK;
			 java.lang.Integer .parseInt ( v0 );
			 /* :try_end_0 */
			 v0 = 			 /* .catch Ljava/lang/Exception; {:try_start_0 ..:try_end_0} :catch_0 */
			 int v1 = 7; // const/4 v1, 0x7
			 /* if-ge v0, v1, :cond_0 */
			 /* move v0, v2 */
		 } // :goto_0
		 /* :catch_0 */
		 /* move-exception v0 */
		 /* move v0, v2 */
	 } // :cond_0
	 int v0 = 1; // const/4 v0, 0x1
} // .end method
public static java.lang.String capitalize ( java.lang.String p0 ) {
	 /* .locals 3 */
	 int v2 = 1; // const/4 v2, 0x1
	 /* new-instance v0, Ljava/lang/StringBuilder; */
	 /* invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V */
	 int v1 = 0; // const/4 v1, 0x0
	 (( java.lang.String ) p0 ).substring ( v1, v2 ); // invoke-virtual {p0, v1, v2}, Ljava/lang/String;->substring(II)Ljava/lang/String;
	 (( java.lang.String ) v1 ).toUpperCase ( ); // invoke-virtual {v1}, Ljava/lang/String;->toUpperCase()Ljava/lang/String;
	 (( java.lang.StringBuilder ) v0 ).append ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
	 (( java.lang.String ) p0 ).substring ( v2 ); // invoke-virtual {p0, v2}, Ljava/lang/String;->substring(I)Ljava/lang/String;
	 (( java.lang.StringBuilder ) v0 ).append ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
	 (( java.lang.StringBuilder ) v0 ).toString ( ); // invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
} // .end method
public static Integer daysBetween ( java.util.Date p0, java.util.Date p1 ) {
	 /* .locals 4 */
	 (( java.util.Date ) p0 ).getTime ( ); // invoke-virtual {p0}, Ljava/util/Date;->getTime()J
	 /* move-result-wide v0 */
	 (( java.util.Date ) p1 ).getTime ( ); // invoke-virtual {p1}, Ljava/util/Date;->getTime()J
	 /* move-result-wide v2 */
	 /* sub-long/2addr v0, v2 */
	 /* const-wide/32 v2, 0x5265c00 */
	 /* div-long/2addr v0, v2 */
	 /* long-to-int v0, v0 */
	 v0 = 	 java.lang.Math .abs ( v0 );
} // .end method
public static Integer dpToPx ( android.content.Context p0, Integer p1 ) {
	 /* .locals 2 */
	 int v1 = 0; // const/4 v1, 0x0
	 /* cmpl-float v0, v0, v1 */
	 /* if-lez v0, :cond_0 */
} // :goto_0
/* int-to-float v0, p1 */
/* mul-float/2addr v0, v1 */
/* const/high16 v1, 0x3f000000 # 0.5f */
/* add-float/2addr v0, v1 */
/* float-to-int v0, v0 */
} // :cond_0
(( android.content.Context ) p0 ).getResources ( ); // invoke-virtual {p0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;
(( android.content.res.Resources ) v0 ).getDisplayMetrics ( ); // invoke-virtual {v0}, Landroid/content/res/Resources;->getDisplayMetrics()Landroid/util/DisplayMetrics;
/* iget v0, v0, Landroid/util/DisplayMetrics;->density:F */
} // .end method
public static java.lang.String getAppLabel ( android.content.Context p0 ) {
/* .locals 5 */
int v4 = 0; // const/4 v4, 0x0
try { // :try_start_0
(( android.content.Context ) p0 ).getPackageManager ( ); // invoke-virtual {p0}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;
(( android.content.Context ) p0 ).getPackageManager ( ); // invoke-virtual {p0}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;
(( android.content.Context ) p0 ).getPackageName ( ); // invoke-virtual {p0}, Landroid/content/Context;->getPackageName()Ljava/lang/String;
int v3 = 0; // const/4 v3, 0x0
(( android.content.pm.PackageManager ) v1 ).getApplicationInfo ( v2, v3 ); // invoke-virtual {v1, v2, v3}, Landroid/content/pm/PackageManager;->getApplicationInfo(Ljava/lang/String;I)Landroid/content/pm/ApplicationInfo;
(( android.content.pm.PackageManager ) v0 ).getApplicationLabel ( v1 ); // invoke-virtual {v0, v1}, Landroid/content/pm/PackageManager;->getApplicationLabel(Landroid/content/pm/ApplicationInfo;)Ljava/lang/CharSequence;
/* :try_end_0 */
/* .catch Landroid/content/pm/PackageManager$NameNotFoundException; {:try_start_0 ..:try_end_0} :catch_0 */
} // :goto_0
/* if-nez v0, :cond_0 */
/* move-object v0, v4 */
} // :goto_1
/* :catch_0 */
/* move-exception v0 */
/* move-object v0, v4 */
} // :cond_0
(( java.lang.Object ) v0 ).toString ( ); // invoke-virtual {v0}, Ljava/lang/Object;->toString()Ljava/lang/String;
} // .end method
public static Boolean marketInstalled ( android.content.Context p0 ) {
/* .locals 4 */
int v3 = 0; // const/4 v3, 0x0
try { // :try_start_0
/* new-instance v0, Landroid/content/Intent; */
final String v1 = "android.intent.action.VIEW"; // const-string v1, "android.intent.action.VIEW"
final String v2 = "market://details?id=com.heyzap.android"; // const-string v2, "market://details?id=com.heyzap.android"
android.net.Uri .parse ( v2 );
/* invoke-direct {v0, v1, v2}, Landroid/content/Intent;-><init>(Ljava/lang/String;Landroid/net/Uri;)V */
(( android.content.Context ) p0 ).getPackageManager ( ); // invoke-virtual {p0}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;
/* const/high16 v2, 0x10000 */
(( android.content.pm.PackageManager ) v1 ).queryIntentActivities ( v0, v2 ); // invoke-virtual {v1, v0, v2}, Landroid/content/pm/PackageManager;->queryIntentActivities(Landroid/content/Intent;I)Ljava/util/List;
/* :try_end_0 */
v0 = /* .catch Ljava/lang/Exception; {:try_start_0 ..:try_end_0} :catch_0 */
if ( v0 != null) { // if-eqz v0, :cond_0
/* move v0, v3 */
} // :goto_0
/* :catch_0 */
/* move-exception v0 */
/* move v0, v3 */
} // :cond_0
int v0 = 1; // const/4 v0, 0x1
} // .end method
public static java.lang.String truncate ( java.lang.String p0, Integer p1 ) {
/* .locals 2 */
v0 = (( java.lang.String ) p0 ).length ( ); // invoke-virtual {p0}, Ljava/lang/String;->length()I
/* if-le v0, p1, :cond_0 */
/* new-instance v0, Ljava/lang/StringBuilder; */
/* invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V */
int v1 = 0; // const/4 v1, 0x0
(( java.lang.String ) p0 ).substring ( v1, p1 ); // invoke-virtual {p0, v1, p1}, Ljava/lang/String;->substring(II)Ljava/lang/String;
(( java.lang.StringBuilder ) v0 ).append ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
final String v1 = "..."; // const-string v1, "..."
(( java.lang.StringBuilder ) v0 ).append ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v0 ).toString ( ); // invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
} // :goto_0
} // :cond_0
/* move-object v0, p0 */
} // .end method
