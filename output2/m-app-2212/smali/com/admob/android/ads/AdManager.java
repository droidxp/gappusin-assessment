public class com.admob.android.ads.AdManager {
	 /* .source "AdManager.java" */
	 /* # annotations */
	 /* .annotation system Ldalvik/annotation/MemberClasses; */
	 /* value = { */
	 /* Lcom/admob/android/ads/AdManager$Gender; */
	 /* } */
} // .end annotation
/* # static fields */
public static final java.lang.String LOG;
public static final java.lang.String SDK_VERSION;
public static final java.lang.String SDK_VERSION_DATE;
public static final java.lang.String TEST_EMULATOR;
private static java.lang.String a;
private static Integer b;
private static java.lang.String c;
private static java.lang.String d;
private static java.lang.String e;
private static java.lang.String f;
private static android.location.Location g;
private static Long h;
private static java.lang.String i;
private static java.util.GregorianCalendar j;
private static com.admob.android.ads.AdManager$Gender k;
/* # direct methods */
static com.admob.android.ads.AdManager ( ) {
	 /* .locals 2 */
	 /* .prologue */
	 /* .line 97 */
	 final String v0 = "url"; // const-string v0, "url"
	 /* .line 107 */
	 int v0 = 0; // const/4 v0, 0x0
	 /* .line 150 */
	 final String v0 = "AdMobSDK"; // const-string v0, "AdMobSDK"
	 final String v1 = "AdMob SDK version is 20100331-ANDROID-3312276cc1406347"; // const-string v1, "AdMob SDK version is 20100331-ANDROID-3312276cc1406347"
	 android.util.Log .i ( v0,v1 );
	 /* .line 151 */
	 return;
} // .end method
private com.admob.android.ads.AdManager ( ) {
	 /* .locals 0 */
	 /* .prologue */
	 /* .line 157 */
	 /* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
	 /* .line 159 */
	 return;
} // .end method
static Long a ( Long p0 ) { //synthethic
	 /* .locals 0 */
	 /* .prologue */
	 /* .line 22 */
	 /* sput-wide p0, Lcom/admob/android/ads/AdManager;->h:J */
	 /* return-wide p0 */
} // .end method
static android.location.Location a ( android.location.Location p0 ) { //synthethic
	 /* .locals 0 */
	 /* .prologue */
	 /* .line 22 */
} // .end method
static java.lang.String a ( ) {
	 /* .locals 4 */
	 /* .prologue */
	 /* .line 720 */
	 /* sget-wide v0, Lcom/admob/android/ads/AdManager;->h:J */
	 /* const-wide/16 v2, 0x3e8 */
	 /* div-long/2addr v0, v2 */
	 java.lang.String .valueOf ( v0,v1 );
} // .end method
static java.lang.String a ( android.content.Context p0 ) {
	 /* .locals 5 */
	 /* .prologue */
	 final String v4 = "AdMobSDK"; // const-string v4, "AdMobSDK"
	 /* .line 696 */
	 int v0 = 0; // const/4 v0, 0x0
	 /* .line 697 */
	 com.admob.android.ads.AdManager .getCoordinates ( p0 );
	 /* .line 699 */
	 if ( v1 != null) { // if-eqz v1, :cond_0
		 /* .line 701 */
		 /* new-instance v0, Ljava/lang/StringBuilder; */
		 /* invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V */
		 (( android.location.Location ) v1 ).getLatitude ( ); // invoke-virtual {v1}, Landroid/location/Location;->getLatitude()D
		 /* move-result-wide v2 */
		 (( java.lang.StringBuilder ) v0 ).append ( v2, v3 ); // invoke-virtual {v0, v2, v3}, Ljava/lang/StringBuilder;->append(D)Ljava/lang/StringBuilder;
		 final String v2 = ","; // const-string v2, ","
		 (( java.lang.StringBuilder ) v0 ).append ( v2 ); // invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
		 (( android.location.Location ) v1 ).getLongitude ( ); // invoke-virtual {v1}, Landroid/location/Location;->getLongitude()D
		 /* move-result-wide v1 */
		 (( java.lang.StringBuilder ) v0 ).append ( v1, v2 ); // invoke-virtual {v0, v1, v2}, Ljava/lang/StringBuilder;->append(D)Ljava/lang/StringBuilder;
		 (( java.lang.StringBuilder ) v0 ).toString ( ); // invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
		 /* .line 704 */
	 } // :cond_0
	 final String v1 = "AdMobSDK"; // const-string v1, "AdMobSDK"
	 int v1 = 3; // const/4 v1, 0x3
	 v1 = 	 android.util.Log .isLoggable ( v4,v1 );
	 if ( v1 != null) { // if-eqz v1, :cond_1
		 /* .line 706 */
		 final String v1 = "AdMobSDK"; // const-string v1, "AdMobSDK"
		 /* new-instance v1, Ljava/lang/StringBuilder; */
		 /* invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V */
		 final String v2 = "User coordinates are "; // const-string v2, "User coordinates are "
		 (( java.lang.StringBuilder ) v1 ).append ( v2 ); // invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
		 (( java.lang.StringBuilder ) v1 ).append ( v0 ); // invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
		 (( java.lang.StringBuilder ) v1 ).toString ( ); // invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
		 android.util.Log .d ( v4,v1 );
		 /* .line 709 */
	 } // :cond_1
} // .end method
private static java.lang.String a ( java.lang.String p0 ) {
	 /* .locals 7 */
	 /* .prologue */
	 int v6 = 0; // const/4 v6, 0x0
	 /* .line 512 */
	 int v0 = 0; // const/4 v0, 0x0
	 /* .line 514 */
	 if ( p0 != null) { // if-eqz p0, :cond_0
		 v1 = 		 (( java.lang.String ) p0 ).length ( ); // invoke-virtual {p0}, Ljava/lang/String;->length()I
		 /* if-lez v1, :cond_0 */
		 /* .line 518 */
		 try { // :try_start_0
			 final String v0 = "MD5"; // const-string v0, "MD5"
			 java.security.MessageDigest .getInstance ( v0 );
			 /* .line 519 */
			 (( java.lang.String ) p0 ).getBytes ( ); // invoke-virtual {p0}, Ljava/lang/String;->getBytes()[B
			 int v2 = 0; // const/4 v2, 0x0
			 v3 = 			 (( java.lang.String ) p0 ).length ( ); // invoke-virtual {p0}, Ljava/lang/String;->length()I
			 (( java.security.MessageDigest ) v0 ).update ( v1, v2, v3 ); // invoke-virtual {v0, v1, v2, v3}, Ljava/security/MessageDigest;->update([BII)V
			 /* .line 520 */
			 final String v1 = "%032X"; // const-string v1, "%032X"
			 int v2 = 1; // const/4 v2, 0x1
			 /* new-array v2, v2, [Ljava/lang/Object; */
			 int v3 = 0; // const/4 v3, 0x0
			 /* new-instance v4, Ljava/math/BigInteger; */
			 int v5 = 1; // const/4 v5, 0x1
			 (( java.security.MessageDigest ) v0 ).digest ( ); // invoke-virtual {v0}, Ljava/security/MessageDigest;->digest()[B
			 /* invoke-direct {v4, v5, v0}, Ljava/math/BigInteger;-><init>(I[B)V */
			 /* aput-object v4, v2, v3 */
			 java.lang.String .format ( v1,v2 );
			 /* :try_end_0 */
			 /* .catch Ljava/lang/Exception; {:try_start_0 ..:try_end_0} :catch_0 */
			 /* .line 531 */
		 } // :cond_0
	 } // :goto_0
	 /* .line 522 */
	 /* :catch_0 */
	 /* move-exception v0 */
	 /* .line 524 */
	 final String v1 = "AdMobSDK"; // const-string v1, "AdMobSDK"
	 /* new-instance v2, Ljava/lang/StringBuilder; */
	 /* invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V */
	 final String v3 = "Could not generate hash of "; // const-string v3, "Could not generate hash of "
	 (( java.lang.StringBuilder ) v2 ).append ( v3 ); // invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
	 (( java.lang.StringBuilder ) v2 ).append ( p0 ); // invoke-virtual {v2, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
	 (( java.lang.StringBuilder ) v2 ).toString ( ); // invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
	 android.util.Log .d ( v1,v2,v0 );
	 /* .line 527 */
	 /* const/16 v0, 0x20 */
	 (( java.lang.String ) p0 ).substring ( v6, v0 ); // invoke-virtual {p0, v6, v0}, Ljava/lang/String;->substring(II)Ljava/lang/String;
} // .end method
static java.lang.String b ( ) {
	 /* .locals 7 */
	 /* .prologue */
	 int v6 = 2; // const/4 v6, 0x2
	 int v5 = 1; // const/4 v5, 0x1
	 /* .line 787 */
	 int v0 = 0; // const/4 v0, 0x0
	 /* .line 788 */
	 com.admob.android.ads.AdManager .getBirthday ( );
	 /* .line 790 */
	 if ( v1 != null) { // if-eqz v1, :cond_0
		 /* .line 792 */
		 final String v0 = "%04d%02d%02d"; // const-string v0, "%04d%02d%02d"
		 int v2 = 3; // const/4 v2, 0x3
		 /* new-array v2, v2, [Ljava/lang/Object; */
		 int v3 = 0; // const/4 v3, 0x0
		 v4 = 		 (( java.util.GregorianCalendar ) v1 ).get ( v5 ); // invoke-virtual {v1, v5}, Ljava/util/GregorianCalendar;->get(I)I
		 java.lang.Integer .valueOf ( v4 );
		 /* aput-object v4, v2, v3 */
		 v3 = 		 (( java.util.GregorianCalendar ) v1 ).get ( v6 ); // invoke-virtual {v1, v6}, Ljava/util/GregorianCalendar;->get(I)I
		 /* add-int/lit8 v3, v3, 0x1 */
		 java.lang.Integer .valueOf ( v3 );
		 /* aput-object v3, v2, v5 */
		 int v3 = 5; // const/4 v3, 0x5
		 v1 = 		 (( java.util.GregorianCalendar ) v1 ).get ( v3 ); // invoke-virtual {v1, v3}, Ljava/util/GregorianCalendar;->get(I)I
		 java.lang.Integer .valueOf ( v1 );
		 /* aput-object v1, v2, v6 */
		 java.lang.String .format ( v0,v2 );
		 /* .line 798 */
	 } // :cond_0
} // .end method
private static void b ( android.content.Context p0 ) {
	 /* .locals 6 */
	 /* .prologue */
	 final String v0 = "AdMobSDK"; // const-string v0, "AdMobSDK"
	 /* .line 205 */
	 try { // :try_start_0
		 (( android.content.Context ) p0 ).getPackageManager ( ); // invoke-virtual {p0}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;
		 /* .line 207 */
		 (( android.content.Context ) p0 ).getPackageName ( ); // invoke-virtual {p0}, Landroid/content/Context;->getPackageName()Ljava/lang/String;
		 /* const/16 v2, 0x80 */
		 (( android.content.pm.PackageManager ) v0 ).getApplicationInfo ( v1, v2 ); // invoke-virtual {v0, v1, v2}, Landroid/content/pm/PackageManager;->getApplicationInfo(Ljava/lang/String;I)Landroid/content/pm/ApplicationInfo;
		 /* .line 208 */
		 if ( v1 != null) { // if-eqz v1, :cond_3
			 /* .line 212 */
			 v2 = this.metaData;
			 if ( v2 != null) { // if-eqz v2, :cond_2
				 /* .line 214 */
				 v2 = this.metaData;
				 final String v3 = "ADMOB_PUBLISHER_ID"; // const-string v3, "ADMOB_PUBLISHER_ID"
				 (( android.os.Bundle ) v2 ).getString ( v3 ); // invoke-virtual {v2, v3}, Landroid/os/Bundle;->getString(Ljava/lang/String;)Ljava/lang/String;
				 /* .line 216 */
				 final String v3 = "AdMobSDK"; // const-string v3, "AdMobSDK"
				 int v4 = 3; // const/4 v4, 0x3
				 v3 = 				 android.util.Log .isLoggable ( v3,v4 );
				 if ( v3 != null) { // if-eqz v3, :cond_0
					 /* .line 218 */
					 final String v3 = "AdMobSDK"; // const-string v3, "AdMobSDK"
					 /* new-instance v4, Ljava/lang/StringBuilder; */
					 /* invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V */
					 final String v5 = "Publisher ID read from AndroidManifest.xml is "; // const-string v5, "Publisher ID read from AndroidManifest.xml is "
					 (( java.lang.StringBuilder ) v4 ).append ( v5 ); // invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
					 (( java.lang.StringBuilder ) v4 ).append ( v2 ); // invoke-virtual {v4, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
					 (( java.lang.StringBuilder ) v4 ).toString ( ); // invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
					 android.util.Log .d ( v3,v4 );
					 /* .line 222 */
				 } // :cond_0
				 v3 = com.admob.android.ads.AdManager.c;
				 /* if-nez v3, :cond_2 */
				 if ( v2 != null) { // if-eqz v2, :cond_2
					 /* .line 224 */
					 final String v3 = "a1496ced2842262"; // const-string v3, "a1496ced2842262"
					 v3 = 					 (( java.lang.String ) v2 ).equals ( v3 ); // invoke-virtual {v2, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
					 if ( v3 != null) { // if-eqz v3, :cond_5
						 (( android.content.Context ) p0 ).getPackageName ( ); // invoke-virtual {p0}, Landroid/content/Context;->getPackageName()Ljava/lang/String;
						 final String v4 = "com.admob.android.ads"; // const-string v4, "com.admob.android.ads"
						 v3 = 						 (( java.lang.String ) v3 ).equals ( v4 ); // invoke-virtual {v3, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
						 /* if-nez v3, :cond_1 */
						 (( android.content.Context ) p0 ).getPackageName ( ); // invoke-virtual {p0}, Landroid/content/Context;->getPackageName()Ljava/lang/String;
						 final String v4 = "com.example.admob.lunarlander"; // const-string v4, "com.example.admob.lunarlander"
						 v3 = 						 (( java.lang.String ) v3 ).equals ( v4 ); // invoke-virtual {v3, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
						 if ( v3 != null) { // if-eqz v3, :cond_5
							 /* .line 229 */
						 } // :cond_1
						 final String v3 = "AdMobSDK"; // const-string v3, "AdMobSDK"
						 final String v4 = "This is a sample application so allowing sample publisher ID."; // const-string v4, "This is a sample application so allowing sample publisher ID."
						 android.util.Log .i ( v3,v4 );
						 /* .line 230 */
						 /* .line 240 */
					 } // :cond_2
				 } // :goto_0
				 v1 = this.packageName;
				 /* .line 241 */
				 final String v1 = "AdMobSDK"; // const-string v1, "AdMobSDK"
				 int v2 = 2; // const/4 v2, 0x2
				 v1 = 				 android.util.Log .isLoggable ( v1,v2 );
				 if ( v1 != null) { // if-eqz v1, :cond_3
					 /* .line 243 */
					 final String v1 = "AdMobSDK"; // const-string v1, "AdMobSDK"
					 /* new-instance v2, Ljava/lang/StringBuilder; */
					 /* invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V */
					 final String v3 = "Application\'s package name is "; // const-string v3, "Application\'s package name is "
					 (( java.lang.StringBuilder ) v2 ).append ( v3 ); // invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
					 v3 = com.admob.android.ads.AdManager.a;
					 (( java.lang.StringBuilder ) v2 ).append ( v3 ); // invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
					 (( java.lang.StringBuilder ) v2 ).toString ( ); // invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
					 android.util.Log .v ( v1,v2 );
					 /* .line 247 */
				 } // :cond_3
				 (( android.content.Context ) p0 ).getPackageName ( ); // invoke-virtual {p0}, Landroid/content/Context;->getPackageName()Ljava/lang/String;
				 int v2 = 0; // const/4 v2, 0x0
				 (( android.content.pm.PackageManager ) v0 ).getPackageInfo ( v1, v2 ); // invoke-virtual {v0, v1, v2}, Landroid/content/pm/PackageManager;->getPackageInfo(Ljava/lang/String;I)Landroid/content/pm/PackageInfo;
				 /* .line 248 */
				 if ( v0 != null) { // if-eqz v0, :cond_4
					 /* .line 252 */
					 /* iget v0, v0, Landroid/content/pm/PackageInfo;->versionCode:I */
					 /* .line 253 */
					 final String v0 = "AdMobSDK"; // const-string v0, "AdMobSDK"
					 int v1 = 2; // const/4 v1, 0x2
					 v0 = 					 android.util.Log .isLoggable ( v0,v1 );
					 if ( v0 != null) { // if-eqz v0, :cond_4
						 /* .line 255 */
						 final String v0 = "AdMobSDK"; // const-string v0, "AdMobSDK"
						 /* new-instance v1, Ljava/lang/StringBuilder; */
						 /* invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V */
						 final String v2 = "Application\'s version number is "; // const-string v2, "Application\'s version number is "
						 (( java.lang.StringBuilder ) v1 ).append ( v2 ); // invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
						 (( java.lang.StringBuilder ) v1 ).append ( v2 ); // invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;
						 (( java.lang.StringBuilder ) v1 ).toString ( ); // invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
						 android.util.Log .v ( v0,v1 );
						 /* .line 263 */
					 } // :cond_4
				 } // :goto_1
				 return;
				 /* .line 234 */
			 } // :cond_5
			 com.admob.android.ads.AdManager .setPublisherId ( v2 );
			 /* :try_end_0 */
			 /* .catch Ljava/lang/Exception; {:try_start_0 ..:try_end_0} :catch_0 */
			 /* .line 263 */
			 /* :catch_0 */
			 /* move-exception v0 */
		 } // .end method
		 static java.lang.String c ( ) {
			 /* .locals 2 */
			 /* .prologue */
			 /* .line 843 */
			 v0 = com.admob.android.ads.AdManager.k;
			 v1 = com.admob.android.ads.AdManager$Gender.MALE;
			 /* if-ne v0, v1, :cond_0 */
			 /* .line 845 */
			 final String v0 = "m"; // const-string v0, "m"
			 /* .line 853 */
		 } // :goto_0
		 /* .line 847 */
	 } // :cond_0
	 v0 = com.admob.android.ads.AdManager.k;
	 v1 = com.admob.android.ads.AdManager$Gender.FEMALE;
	 /* if-ne v0, v1, :cond_1 */
	 /* .line 849 */
	 final String v0 = "f"; // const-string v0, "f"
	 /* .line 853 */
} // :cond_1
int v0 = 0; // const/4 v0, 0x0
} // .end method
protected static void clientError ( java.lang.String p0 ) {
/* .locals 1 */
/* .prologue */
/* .line 171 */
final String v0 = "AdMobSDK"; // const-string v0, "AdMobSDK"
android.util.Log .e ( v0,p0 );
/* .line 174 */
/* new-instance v0, Ljava/lang/IllegalArgumentException; */
/* invoke-direct {v0, p0}, Ljava/lang/IllegalArgumentException;-><init>(Ljava/lang/String;)V */
/* throw v0 */
} // .end method
static android.location.Location d ( ) { //synthethic
/* .locals 1 */
/* .prologue */
/* .line 22 */
v0 = com.admob.android.ads.AdManager.g;
} // .end method
static Long e ( ) { //synthethic
/* .locals 2 */
/* .prologue */
/* .line 22 */
/* sget-wide v0, Lcom/admob/android/ads/AdManager;->h:J */
/* return-wide v0 */
} // .end method
protected static java.lang.String getApplicationPackageName ( android.content.Context p0 ) {
/* .locals 1 */
/* .prologue */
/* .line 275 */
v0 = com.admob.android.ads.AdManager.a;
/* if-nez v0, :cond_0 */
/* .line 277 */
com.admob.android.ads.AdManager .b ( p0 );
/* .line 280 */
} // :cond_0
v0 = com.admob.android.ads.AdManager.a;
} // .end method
protected static Integer getApplicationVersion ( android.content.Context p0 ) {
/* .locals 1 */
/* .prologue */
/* .line 293 */
v0 = com.admob.android.ads.AdManager.a;
/* if-nez v0, :cond_0 */
/* .line 295 */
com.admob.android.ads.AdManager .b ( p0 );
/* .line 298 */
} // :cond_0
} // .end method
public static java.util.GregorianCalendar getBirthday ( ) {
/* .locals 1 */
/* .prologue */
/* .line 776 */
v0 = com.admob.android.ads.AdManager.j;
} // .end method
public static android.location.Location getCoordinates ( android.content.Context p0 ) {
/* .locals 9 */
/* .prologue */
int v8 = 0; // const/4 v8, 0x0
int v7 = 0; // const/4 v7, 0x0
int v6 = 1; // const/4 v6, 0x1
final String v0 = "AdMobSDK"; // const-string v0, "AdMobSDK"
/* .line 555 */
if ( p0 != null) { // if-eqz p0, :cond_6
/* .line 558 */
v0 = com.admob.android.ads.AdManager.g;
if ( v0 != null) { // if-eqz v0, :cond_0
java.lang.System .currentTimeMillis ( );
/* move-result-wide v0 */
/* sget-wide v2, Lcom/admob/android/ads/AdManager;->h:J */
/* const-wide/32 v4, 0xdbba0 */
/* add-long/2addr v2, v4 */
/* cmp-long v0, v0, v2 */
/* if-lez v0, :cond_6 */
/* .line 561 */
} // :cond_0
/* monitor-enter p0 */
/* .line 565 */
try { // :try_start_0
v0 = com.admob.android.ads.AdManager.g;
if ( v0 != null) { // if-eqz v0, :cond_1
	 java.lang.System .currentTimeMillis ( );
	 /* move-result-wide v0 */
	 /* sget-wide v2, Lcom/admob/android/ads/AdManager;->h:J */
	 /* const-wide/32 v4, 0xdbba0 */
	 /* add-long/2addr v2, v4 */
	 /* cmp-long v0, v0, v2 */
	 /* if-lez v0, :cond_5 */
	 /* .line 568 */
} // :cond_1
java.lang.System .currentTimeMillis ( );
/* move-result-wide v0 */
/* sput-wide v0, Lcom/admob/android/ads/AdManager;->h:J */
/* .line 575 */
final String v0 = "android.permission.ACCESS_COARSE_LOCATION"; // const-string v0, "android.permission.ACCESS_COARSE_LOCATION"
v0 = (( android.content.Context ) p0 ).checkCallingOrSelfPermission ( v0 ); // invoke-virtual {p0, v0}, Landroid/content/Context;->checkCallingOrSelfPermission(Ljava/lang/String;)I
/* if-nez v0, :cond_c */
/* .line 577 */
final String v0 = "AdMobSDK"; // const-string v0, "AdMobSDK"
int v1 = 3; // const/4 v1, 0x3
v0 = android.util.Log .isLoggable ( v0,v1 );
if ( v0 != null) { // if-eqz v0, :cond_2
	 /* .line 579 */
	 final String v0 = "AdMobSDK"; // const-string v0, "AdMobSDK"
	 final String v1 = "Trying to get locations from the network."; // const-string v1, "Trying to get locations from the network."
	 android.util.Log .d ( v0,v1 );
	 /* .line 583 */
} // :cond_2
final String v0 = "location"; // const-string v0, "location"
(( android.content.Context ) p0 ).getSystemService ( v0 ); // invoke-virtual {p0, v0}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;
/* check-cast v0, Landroid/location/LocationManager; */
/* .line 585 */
if ( v0 != null) { // if-eqz v0, :cond_b
	 /* .line 587 */
	 /* new-instance v1, Landroid/location/Criteria; */
	 /* invoke-direct {v1}, Landroid/location/Criteria;-><init>()V */
	 /* .line 588 */
	 int v2 = 2; // const/4 v2, 0x2
	 (( android.location.Criteria ) v1 ).setAccuracy ( v2 ); // invoke-virtual {v1, v2}, Landroid/location/Criteria;->setAccuracy(I)V
	 /* .line 589 */
	 int v2 = 0; // const/4 v2, 0x0
	 (( android.location.Criteria ) v1 ).setCostAllowed ( v2 ); // invoke-virtual {v1, v2}, Landroid/location/Criteria;->setCostAllowed(Z)V
	 /* .line 590 */
	 int v2 = 1; // const/4 v2, 0x1
	 (( android.location.LocationManager ) v0 ).getBestProvider ( v1, v2 ); // invoke-virtual {v0, v1, v2}, Landroid/location/LocationManager;->getBestProvider(Landroid/location/Criteria;Z)Ljava/lang/String;
	 /* move v2, v6 */
	 /* .line 595 */
} // :goto_0
/* if-nez v1, :cond_4 */
/* .line 597 */
final String v3 = "android.permission.ACCESS_FINE_LOCATION"; // const-string v3, "android.permission.ACCESS_FINE_LOCATION"
v3 = (( android.content.Context ) p0 ).checkCallingOrSelfPermission ( v3 ); // invoke-virtual {p0, v3}, Landroid/content/Context;->checkCallingOrSelfPermission(Ljava/lang/String;)I
/* if-nez v3, :cond_4 */
/* .line 599 */
final String v0 = "AdMobSDK"; // const-string v0, "AdMobSDK"
int v2 = 3; // const/4 v2, 0x3
v0 = android.util.Log .isLoggable ( v0,v2 );
if ( v0 != null) { // if-eqz v0, :cond_3
	 /* .line 601 */
	 final String v0 = "AdMobSDK"; // const-string v0, "AdMobSDK"
	 final String v2 = "Trying to get locations from GPS."; // const-string v2, "Trying to get locations from GPS."
	 android.util.Log .d ( v0,v2 );
	 /* .line 605 */
} // :cond_3
final String v0 = "location"; // const-string v0, "location"
(( android.content.Context ) p0 ).getSystemService ( v0 ); // invoke-virtual {p0, v0}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;
/* check-cast v0, Landroid/location/LocationManager; */
/* .line 607 */
if ( v0 != null) { // if-eqz v0, :cond_a
	 /* .line 609 */
	 /* new-instance v1, Landroid/location/Criteria; */
	 /* invoke-direct {v1}, Landroid/location/Criteria;-><init>()V */
	 /* .line 610 */
	 int v2 = 1; // const/4 v2, 0x1
	 (( android.location.Criteria ) v1 ).setAccuracy ( v2 ); // invoke-virtual {v1, v2}, Landroid/location/Criteria;->setAccuracy(I)V
	 /* .line 611 */
	 int v2 = 0; // const/4 v2, 0x0
	 (( android.location.Criteria ) v1 ).setCostAllowed ( v2 ); // invoke-virtual {v1, v2}, Landroid/location/Criteria;->setCostAllowed(Z)V
	 /* .line 612 */
	 int v2 = 1; // const/4 v2, 0x1
	 (( android.location.LocationManager ) v0 ).getBestProvider ( v1, v2 ); // invoke-virtual {v0, v1, v2}, Landroid/location/LocationManager;->getBestProvider(Landroid/location/Criteria;Z)Ljava/lang/String;
	 /* move v2, v6 */
	 /* .line 618 */
} // :cond_4
} // :goto_1
/* if-nez v2, :cond_7 */
/* .line 620 */
final String v0 = "AdMobSDK"; // const-string v0, "AdMobSDK"
int v1 = 3; // const/4 v1, 0x3
v0 = android.util.Log .isLoggable ( v0,v1 );
if ( v0 != null) { // if-eqz v0, :cond_5
/* .line 622 */
final String v0 = "AdMobSDK"; // const-string v0, "AdMobSDK"
final String v1 = "Cannot access user\'s location.Permissions are not set."; // const-string v1, "Cannot access user\'s location.Permissions are not set."
android.util.Log .d ( v0,v1 );
/* .line 679 */
} // :cond_5
} // :goto_2
/* monitor-exit p0 */
/* :try_end_0 */
/* .catchall {:try_start_0 ..:try_end_0} :catchall_0 */
/* .line 683 */
} // :cond_6
v0 = com.admob.android.ads.AdManager.g;
/* .line 625 */
} // :cond_7
/* if-nez v1, :cond_8 */
/* .line 627 */
try { // :try_start_1
final String v0 = "AdMobSDK"; // const-string v0, "AdMobSDK"
int v1 = 3; // const/4 v1, 0x3
v0 = android.util.Log .isLoggable ( v0,v1 );
if ( v0 != null) { // if-eqz v0, :cond_5
/* .line 629 */
final String v0 = "AdMobSDK"; // const-string v0, "AdMobSDK"
final String v1 = "No location providers are available.Ads will not be geotargeted."; // const-string v1, "No location providers are available.Ads will not be geotargeted."
android.util.Log .d ( v0,v1 );
/* .line 679 */
/* :catchall_0 */
/* move-exception v0 */
/* monitor-exit p0 */
/* :try_end_1 */
/* .catchall {:try_start_1 ..:try_end_1} :catchall_0 */
/* throw v0 */
/* .line 634 */
} // :cond_8
try { // :try_start_2
final String v2 = "AdMobSDK"; // const-string v2, "AdMobSDK"
int v3 = 3; // const/4 v3, 0x3
v2 = android.util.Log .isLoggable ( v2,v3 );
if ( v2 != null) { // if-eqz v2, :cond_9
/* .line 636 */
final String v2 = "AdMobSDK"; // const-string v2, "AdMobSDK"
final String v3 = "Location provider setup successfully."; // const-string v3, "Location provider setup successfully."
android.util.Log .d ( v2,v3 );
/* .line 641 */
} // :cond_9
/* const-wide/16 v2, 0x0 */
int v4 = 0; // const/4 v4, 0x0
/* new-instance v5, Lcom/admob/android/ads/AdManager$1; */
/* invoke-direct {v5, v0}, Lcom/admob/android/ads/AdManager$1;-><init>(Landroid/location/LocationManager;)V */
(( android.content.Context ) p0 ).getMainLooper ( ); // invoke-virtual {p0}, Landroid/content/Context;->getMainLooper()Landroid/os/Looper;
/* invoke-virtual/range {v0 ..v6}, Landroid/location/LocationManager;->requestLocationUpdates(Ljava/lang/String;JFLandroid/location/LocationListener;Landroid/os/Looper;)V */
/* :try_end_2 */
/* .catchall {:try_start_2 ..:try_end_2} :catchall_0 */
} // :cond_a
/* move v2, v6 */
} // :cond_b
/* move-object v1, v8 */
/* move v2, v6 */
/* goto/16 :goto_0 */
} // :cond_c
/* move-object v1, v8 */
/* move-object v0, v8 */
/* move v2, v7 */
/* goto/16 :goto_0 */
} // .end method
static java.lang.String getEndpoint ( ) {
/* .locals 1 */
/* .prologue */
/* .line 883 */
com.admob.android.ads.u .a ( );
} // .end method
public static com.admob.android.ads.AdManager$Gender getGender ( ) {
/* .locals 1 */
/* .prologue */
/* .line 832 */
v0 = com.admob.android.ads.AdManager.k;
} // .end method
public static java.lang.String getOrientation ( android.content.Context p0 ) {
/* .locals 3 */
/* .prologue */
/* .line 740 */
final String v0 = "p"; // const-string v0, "p"
/* .line 742 */
final String v1 = "window"; // const-string v1, "window"
(( android.content.Context ) p0 ).getSystemService ( v1 ); // invoke-virtual {p0, v1}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;
/* check-cast p0, Landroid/view/WindowManager; */
/* .line 743 */
v1 = (( android.view.Display ) v1 ).getOrientation ( ); // invoke-virtual {v1}, Landroid/view/Display;->getOrientation()I
/* .line 744 */
int v2 = 1; // const/4 v2, 0x1
/* if-ne v1, v2, :cond_0 */
/* .line 746 */
final String v0 = "l"; // const-string v0, "l"
/* .line 748 */
} // :cond_0
} // .end method
public static java.lang.String getPostalCode ( ) {
/* .locals 1 */
/* .prologue */
/* .line 730 */
v0 = com.admob.android.ads.AdManager.i;
} // .end method
public static java.lang.String getPublisherId ( android.content.Context p0 ) {
/* .locals 2 */
/* .prologue */
final String v1 = "AdMobSDK"; // const-string v1, "AdMobSDK"
/* .line 309 */
v0 = com.admob.android.ads.AdManager.c;
/* if-nez v0, :cond_0 */
/* .line 311 */
com.admob.android.ads.AdManager .b ( p0 );
/* .line 315 */
} // :cond_0
v0 = com.admob.android.ads.AdManager.c;
/* if-nez v0, :cond_1 */
final String v0 = "AdMobSDK"; // const-string v0, "AdMobSDK"
int v0 = 6; // const/4 v0, 0x6
v0 = android.util.Log .isLoggable ( v1,v0 );
if ( v0 != null) { // if-eqz v0, :cond_1
/* .line 317 */
final String v0 = "AdMobSDK"; // const-string v0, "AdMobSDK"
final String v0 = "getPublisherId returning null publisher id.Please set the publisher id in AndroidManifest.xml or using AdManager.setPublisherId(String)"; // const-string v0, "getPublisherId returning null publisher id.Please set the publisher id in AndroidManifest.xml or using AdManager.setPublisherId(String)"
android.util.Log .e ( v1,v0 );
/* .line 321 */
} // :cond_1
v0 = com.admob.android.ads.AdManager.c;
} // .end method
protected static Integer getScreenWidth ( android.content.Context p0 ) {
/* .locals 2 */
/* .prologue */
/* .line 185 */
final String v0 = "window"; // const-string v0, "window"
(( android.content.Context ) p0 ).getSystemService ( v0 ); // invoke-virtual {p0, v0}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;
/* check-cast p0, Landroid/view/WindowManager; */
/* .line 186 */
int v1 = 0; // const/4 v1, 0x0
/* .line 187 */
if ( v0 != null) { // if-eqz v0, :cond_0
/* .line 189 */
v0 = (( android.view.Display ) v0 ).getWidth ( ); // invoke-virtual {v0}, Landroid/view/Display;->getWidth()I
/* .line 191 */
} // :goto_0
} // :cond_0
/* move v0, v1 */
} // .end method
public static java.lang.String getTestAction ( ) {
/* .locals 1 */
/* .prologue */
/* .line 360 */
v0 = com.admob.android.ads.AdManager.d;
} // .end method
static java.lang.String getTestDevices ( ) {
/* .locals 1 */
/* .prologue */
/* .line 406 */
v0 = com.admob.android.ads.AdManager.e;
} // .end method
public static java.lang.String getUserId ( android.content.Context p0 ) {
/* .locals 4 */
/* .prologue */
final String v3 = "emulator"; // const-string v3, "emulator"
final String v2 = "AdMobSDK"; // const-string v2, "AdMobSDK"
/* .line 467 */
v0 = com.admob.android.ads.AdManager.f;
/* if-nez v0, :cond_0 */
/* .line 469 */
(( android.content.Context ) p0 ).getContentResolver ( ); // invoke-virtual {p0}, Landroid/content/Context;->getContentResolver()Landroid/content/ContentResolver;
final String v1 = "android_id"; // const-string v1, "android_id"
android.provider.Settings$Secure .getString ( v0,v1 );
/* .line 471 */
/* if-nez v0, :cond_1 */
/* .line 474 */
final String v0 = "emulator"; // const-string v0, "emulator"
/* .line 477 */
final String v0 = "AdMobSDK"; // const-string v0, "AdMobSDK"
final String v0 = "To get test ads on the emulator use AdManager.setTestDevices( new String[] { Admanager.TEST_EMULATOR } )"; // const-string v0, "To get test ads on the emulator use AdManager.setTestDevices( new String[] { Admanager.TEST_EMULATOR } )"
android.util.Log .i ( v2,v0 );
/* .line 487 */
} // :goto_0
final String v0 = "AdMobSDK"; // const-string v0, "AdMobSDK"
int v0 = 3; // const/4 v0, 0x3
v0 = android.util.Log .isLoggable ( v2,v0 );
if ( v0 != null) { // if-eqz v0, :cond_0
/* .line 489 */
final String v0 = "AdMobSDK"; // const-string v0, "AdMobSDK"
/* new-instance v0, Ljava/lang/StringBuilder; */
/* invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V */
final String v1 = "The user ID is "; // const-string v1, "The user ID is "
(( java.lang.StringBuilder ) v0 ).append ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
v1 = com.admob.android.ads.AdManager.f;
(( java.lang.StringBuilder ) v0 ).append ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v0 ).toString ( ); // invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
android.util.Log .d ( v2,v0 );
/* .line 494 */
} // :cond_0
v0 = com.admob.android.ads.AdManager.f;
final String v1 = "emulator"; // const-string v1, "emulator"
/* if-ne v0, v3, :cond_2 */
/* .line 496 */
int v0 = 0; // const/4 v0, 0x0
/* .line 500 */
} // :goto_1
/* .line 482 */
} // :cond_1
com.admob.android.ads.AdManager .a ( v0 );
/* .line 484 */
final String v0 = "AdMobSDK"; // const-string v0, "AdMobSDK"
/* new-instance v0, Ljava/lang/StringBuilder; */
/* invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V */
final String v1 = "To get test ads on this device use AdManager.setTestDevices( new String[] { \""; // const-string v1, "To get test ads on this device use AdManager.setTestDevices( new String[] { \""
(( java.lang.StringBuilder ) v0 ).append ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
v1 = com.admob.android.ads.AdManager.f;
(( java.lang.StringBuilder ) v0 ).append ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
final String v1 = "\" } )"; // const-string v1, "\" } )"
(( java.lang.StringBuilder ) v0 ).append ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v0 ).toString ( ); // invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
android.util.Log .i ( v2,v0 );
/* .line 500 */
} // :cond_2
v0 = com.admob.android.ads.AdManager.f;
} // .end method
public static Boolean isTestDevice ( android.content.Context p0 ) {
/* .locals 3 */
/* .prologue */
int v2 = 0; // const/4 v2, 0x0
/* .line 419 */
/* .line 421 */
v0 = com.admob.android.ads.AdManager.e;
if ( v0 != null) { // if-eqz v0, :cond_2
/* .line 423 */
com.admob.android.ads.AdManager .getUserId ( p0 );
/* .line 425 */
/* if-nez v0, :cond_0 */
/* .line 428 */
final String v0 = "emulator"; // const-string v0, "emulator"
/* .line 431 */
} // :cond_0
v1 = com.admob.android.ads.AdManager.e;
v0 = java.util.Arrays .binarySearch ( v1,v0 );
/* if-ltz v0, :cond_1 */
int v0 = 1; // const/4 v0, 0x1
/* .line 434 */
} // :goto_0
} // :cond_1
/* move v0, v2 */
/* .line 431 */
} // :cond_2
/* move v0, v2 */
} // .end method
public static void setBirthday ( Integer p0, Integer p1, Integer p2 ) {
/* .locals 2 */
/* .prologue */
/* .line 820 */
/* new-instance v0, Ljava/util/GregorianCalendar; */
/* invoke-direct {v0}, Ljava/util/GregorianCalendar;-><init>()V */
/* .line 821 */
int v1 = 1; // const/4 v1, 0x1
/* sub-int v1, p1, v1 */
(( java.util.GregorianCalendar ) v0 ).set ( p0, v1, p2 ); // invoke-virtual {v0, p0, v1, p2}, Ljava/util/GregorianCalendar;->set(III)V
/* .line 822 */
com.admob.android.ads.AdManager .setBirthday ( v0 );
/* .line 823 */
return;
} // .end method
public static void setBirthday ( java.util.GregorianCalendar p0 ) {
/* .locals 0 */
/* .prologue */
/* .line 808 */
/* .line 809 */
return;
} // .end method
static void setEndpoint ( java.lang.String p0 ) {
/* .locals 0 */
/* .prologue */
/* .line 874 */
com.admob.android.ads.u .a ( p0 );
/* .line 875 */
return;
} // .end method
public static void setGender ( com.admob.android.ads.AdManager$Gender p0 ) {
/* .locals 0 */
/* .prologue */
/* .line 864 */
/* .line 865 */
return;
} // .end method
public static void setPostalCode ( java.lang.String p0 ) {
/* .locals 0 */
/* .prologue */
/* .line 765 */
/* .line 766 */
return;
} // .end method
public static void setPublisherId ( java.lang.String p0 ) {
/* .locals 3 */
/* .prologue */
/* .line 336 */
if ( p0 != null) { // if-eqz p0, :cond_0
v0 = (( java.lang.String ) p0 ).length ( ); // invoke-virtual {p0}, Ljava/lang/String;->length()I
/* const/16 v1, 0xf */
/* if-eq v0, v1, :cond_1 */
/* .line 338 */
} // :cond_0
/* new-instance v0, Ljava/lang/StringBuilder; */
/* invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V */
final String v1 = "SETUP ERROR: Incorrect AdMob publisher ID.Should 15 [a-f,0-9] characters: "; // const-string v1, "SETUP ERROR: Incorrect AdMob publisher ID.Should 15 [a-f,0-9] characters: "
(( java.lang.StringBuilder ) v0 ).append ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
v1 = com.admob.android.ads.AdManager.c;
(( java.lang.StringBuilder ) v0 ).append ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v0 ).toString ( ); // invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
com.admob.android.ads.AdManager .clientError ( v0 );
/* .line 341 */
} // :cond_1
final String v0 = "a1496ced2842262"; // const-string v0, "a1496ced2842262"
v0 = (( java.lang.String ) p0 ).equalsIgnoreCase ( v0 ); // invoke-virtual {p0, v0}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z
if ( v0 != null) { // if-eqz v0, :cond_2
/* .line 344 */
final String v0 = "SETUP ERROR: Cannot use the sample publisher ID (a1496ced2842262).Yours is available on www.admob.com."; // const-string v0, "SETUP ERROR: Cannot use the sample publisher ID (a1496ced2842262).Yours is available on www.admob.com."
com.admob.android.ads.AdManager .clientError ( v0 );
/* .line 347 */
} // :cond_2
final String v0 = "AdMobSDK"; // const-string v0, "AdMobSDK"
/* new-instance v1, Ljava/lang/StringBuilder; */
/* invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V */
final String v2 = "Publisher ID set to "; // const-string v2, "Publisher ID set to "
(( java.lang.StringBuilder ) v1 ).append ( v2 ); // invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v1 ).append ( p0 ); // invoke-virtual {v1, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v1 ).toString ( ); // invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
android.util.Log .i ( v0,v1 );
/* .line 349 */
/* .line 350 */
return;
} // .end method
public static void setTestAction ( java.lang.String p0 ) {
/* .locals 0 */
/* .prologue */
/* .line 455 */
/* .line 456 */
return;
} // .end method
public static void setTestDevices ( java.lang.String[] p0 ) {
/* .locals 1 */
/* .prologue */
/* .line 389 */
/* if-nez p0, :cond_0 */
/* .line 391 */
int v0 = 0; // const/4 v0, 0x0
/* .line 399 */
} // :goto_0
return;
/* .line 396 */
} // :cond_0
(( java.lang.String ) p0 ).clone ( ); // invoke-virtual {p0}, [Ljava/lang/String;->clone()Ljava/lang/Object;
/* check-cast p0, [Ljava/lang/String; */
/* .line 397 */
java.util.Arrays .sort ( p0 );
} // .end method
