public class inal {
	 /* # static fields */
	 public static Boolean a;
	 private static java.util.List b;
	 private static Boolean c;
	 private static java.lang.String d;
	 private static java.lang.String e;
	 private static java.lang.String f;
	 private static java.lang.String g;
	 private static java.lang.String h;
	 private static i;
	 private static java.lang.String j;
	 private static java.lang.String k;
	 private static java.lang.String l;
	 private static Float m;
	 private static Integer n;
	 private static Integer o;
	 private static java.lang.String p;
	 private static java.lang.String q;
	 private static java.lang.String r;
	 private static Integer s;
	 private static com.doodlemobile.gamecenter.d.c t;
	 private static java.util.ArrayList u;
	 private static java.util.ArrayList v;
	 /* # direct methods */
	 static inal ( ) {
		 /* .locals 3 */
		 int v2 = 0; // const/4 v2, 0x0
		 int v1 = 0; // const/4 v1, 0x0
		 /* new-instance v0, Ljava/util/LinkedList; */
		 /* invoke-direct {v0}, Ljava/util/LinkedList;-><init>()V */
		 com.doodlemobile.gamecenter.d.d.c = (v2!= 0);
		 com.doodlemobile.gamecenter.d.d.a = (v2!= 0);
		 int v0 = 0; // const/4 v0, 0x0
		 final String v0 = "http://f.doodlemobile.com:8080/feature_server_v3/recommands"; // const-string v0, "http://f.doodlemobile.com:8080/feature_server_v3/recommands"
		 /* new-instance v0, Ljava/util/ArrayList; */
		 /* invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V */
		 /* new-instance v0, Ljava/util/ArrayList; */
		 /* invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V */
		 return;
	 } // .end method
	 public inal ( ) {
		 /* .locals 0 */
		 /* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
		 return;
	 } // .end method
	 public static com.doodlemobile.gamecenter.d.c a ( android.content.Context p0 ) {
		 /* .locals 4 */
		 int v3 = 0; // const/4 v3, 0x0
		 int v1 = 1; // const/4 v1, 0x1
		 v0 = com.doodlemobile.gamecenter.d.d.u;
		 v0 = 		 (( java.util.ArrayList ) v0 ).size ( ); // invoke-virtual {v0}, Ljava/util/ArrayList;->size()I
		 if ( v0 != null) { // if-eqz v0, :cond_1
			 com.doodlemobile.gamecenter.d.d .d ( );
			 v0 = com.doodlemobile.gamecenter.d.d.t;
			 /* if-nez v0, :cond_2 */
			 v0 = com.doodlemobile.gamecenter.d.d.t;
		 } // :goto_0
	 } // :cond_0
	 try { // :try_start_0
		 com.doodlemobile.gamecenter.d.d .d ( );
		 /* add-int/lit8 v0, v0, 0x1 */
	 } // :goto_1
	 v1 = com.doodlemobile.gamecenter.d.d.t;
	 v1 = this.e;
	 final String v2 = "="; // const-string v2, "="
	 (( java.lang.String ) v1 ).split ( v2 ); // invoke-virtual {v1, v2}, Ljava/lang/String;->split(Ljava/lang/String;)[Ljava/lang/String;
	 int v2 = 1; // const/4 v2, 0x1
	 /* aget-object v1, v1, v2 */
	 v1 = 	 com.doodlemobile.gamecenter.d.d .a ( p0,v1 );
	 /* if-nez v1, :cond_1 */
	 v1 = com.doodlemobile.gamecenter.d.d.u;
	 v1 = 	 (( java.util.ArrayList ) v1 ).size ( ); // invoke-virtual {v1}, Ljava/util/ArrayList;->size()I
	 /* if-ne v0, v1, :cond_0 */
	 int v0 = 0; // const/4 v0, 0x0
	 /* :try_end_0 */
	 /* .catch Ljava/lang/Exception; {:try_start_0 ..:try_end_0} :catch_0 */
} // :cond_1
v0 = com.doodlemobile.gamecenter.d.d.t;
/* :catch_0 */
/* move-exception v0 */
/* move-object v0, v3 */
} // :cond_2
/* move v0, v1 */
} // .end method
public static void a ( ) {
/* .locals 1 */
int v0 = 0; // const/4 v0, 0x0
return;
} // .end method
public static void a ( com.doodlemobile.gamecenter.FeatureView p0 ) {
/* .locals 3 */
try { // :try_start_0
v0 = com.doodlemobile.gamecenter.d.d.v;
v0 = (( java.util.ArrayList ) v0 ).size ( ); // invoke-virtual {v0}, Ljava/util/ArrayList;->size()I
int v1 = 0; // const/4 v1, 0x0
} // :goto_0
/* if-ge v1, v0, :cond_1 */
v2 = com.doodlemobile.gamecenter.d.d.v;
(( java.util.ArrayList ) v2 ).get ( v1 ); // invoke-virtual {v2, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;
/* if-ne v2, p0, :cond_0 */
} // :goto_1
return;
} // :cond_0
/* add-int/lit8 v1, v1, 0x1 */
} // :cond_1
v0 = com.doodlemobile.gamecenter.d.d.v;
(( java.util.ArrayList ) v0 ).add ( p0 ); // invoke-virtual {v0, p0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z
/* :try_end_0 */
/* .catch Ljava/lang/Exception; {:try_start_0 ..:try_end_0} :catch_0 */
/* :catch_0 */
/* move-exception v0 */
(( java.lang.Exception ) v0 ).printStackTrace ( ); // invoke-virtual {v0}, Ljava/lang/Exception;->printStackTrace()V
} // .end method
public static void a ( java.lang.String p0, android.content.Context p1 ) {
/* .locals 3 */
/* new-instance v0, Ljava/lang/String; */
(( java.lang.String ) p0 ).getBytes ( ); // invoke-virtual {p0}, Ljava/lang/String;->getBytes()[B
com.doodlemobile.gamecenter.e.a .a ( v1 );
/* invoke-direct {v0, v1}, Ljava/lang/String;-><init>([B)V */
v1 = com.doodlemobile.gamecenter.d.a .a ( );
if ( v1 != null) { // if-eqz v1, :cond_0
try { // :try_start_0
/* new-instance v1, Ljava/lang/StringBuilder; */
/* invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V */
final String v2 = "sdcard/.doodlemobile_featureviewnew/."; // const-string v2, "sdcard/.doodlemobile_featureviewnew/."
(( java.lang.StringBuilder ) v1 ).append ( v2 ); // invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v1 ).append ( v0 ); // invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v1 ).toString ( ); // invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
com.doodlemobile.gamecenter.d.a .b ( v1 );
/* :try_end_0 */
/* .catch Ljava/lang/Exception; {:try_start_0 ..:try_end_0} :catch_0 */
} // :cond_0
} // :goto_0
try { // :try_start_1
(( android.content.Context ) p1 ).deleteFile ( v0 ); // invoke-virtual {p1, v0}, Landroid/content/Context;->deleteFile(Ljava/lang/String;)Z
/* :try_end_1 */
/* .catch Ljava/lang/Exception; {:try_start_1 ..:try_end_1} :catch_1 */
} // :goto_1
return;
/* :catch_0 */
/* move-exception v1 */
(( java.lang.Exception ) v1 ).printStackTrace ( ); // invoke-virtual {v1}, Ljava/lang/Exception;->printStackTrace()V
/* :catch_1 */
/* move-exception v0 */
(( java.lang.Exception ) v0 ).printStackTrace ( ); // invoke-virtual {v0}, Ljava/lang/Exception;->printStackTrace()V
} // .end method
public static Boolean a ( android.content.Context p0, java.lang.String p1 ) {
/* .locals 2 */
try { // :try_start_0
(( android.content.Context ) p0 ).getPackageManager ( ); // invoke-virtual {p0}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;
/* const/16 v1, 0x2000 */
(( android.content.pm.PackageManager ) v0 ).getPackageInfo ( p1, v1 ); // invoke-virtual {v0, p1, v1}, Landroid/content/pm/PackageManager;->getPackageInfo(Ljava/lang/String;I)Landroid/content/pm/PackageInfo;
/* :try_end_0 */
/* .catch Landroid/content/pm/PackageManager$NameNotFoundException; {:try_start_0 ..:try_end_0} :catch_0 */
int v0 = 0; // const/4 v0, 0x0
} // :goto_0
/* :catch_0 */
/* move-exception v0 */
int v0 = 1; // const/4 v0, 0x1
} // .end method
public static java.util.ArrayList b ( ) {
/* .locals 1 */
v0 = com.doodlemobile.gamecenter.d.d.u;
} // .end method
public static Boolean b ( android.content.Context p0 ) {
/* .locals 11 */
int v9 = 1; // const/4 v9, 0x1
int v8 = 0; // const/4 v8, 0x0
final String v10 = "com.doodlemobile"; // const-string v10, "com.doodlemobile"
final String v0 = "="; // const-string v0, "="
final String v0 = ""; // const-string v0, ""
v0 = com.doodlemobile.gamecenter.d.d .c ( p0 );
if ( v0 != null) { // if-eqz v0, :cond_10
final String v0 = "window"; // const-string v0, "window"
(( android.content.Context ) p0 ).getSystemService ( v0 ); // invoke-virtual {p0, v0}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;
/* check-cast v0, Landroid/view/WindowManager; */
/* new-instance v1, Landroid/util/DisplayMetrics; */
/* invoke-direct {v1}, Landroid/util/DisplayMetrics;-><init>()V */
(( android.view.Display ) v0 ).getMetrics ( v1 ); // invoke-virtual {v0, v1}, Landroid/view/Display;->getMetrics(Landroid/util/DisplayMetrics;)V
/* iget v0, v1, Landroid/util/DisplayMetrics;->density:F */
/* iget v0, v1, Landroid/util/DisplayMetrics;->heightPixels:I */
/* iget v0, v1, Landroid/util/DisplayMetrics;->widthPixels:I */
v0 = android.os.Build$VERSION.SDK;
(( android.content.Context ) p0 ).getResources ( ); // invoke-virtual {p0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;
(( android.content.res.Resources ) v0 ).getConfiguration ( ); // invoke-virtual {v0}, Landroid/content/res/Resources;->getConfiguration()Landroid/content/res/Configuration;
try { // :try_start_0
(( java.lang.Object ) v0 ).getClass ( ); // invoke-virtual {v0}, Ljava/lang/Object;->getClass()Ljava/lang/Class;
final String v2 = "screenLayout"; // const-string v2, "screenLayout"
(( java.lang.Class ) v1 ).getField ( v2 ); // invoke-virtual {v1, v2}, Ljava/lang/Class;->getField(Ljava/lang/String;)Ljava/lang/reflect/Field;
v2 = (( java.lang.reflect.Field ) v2 ).getInt ( v0 ); // invoke-virtual {v2, v0}, Ljava/lang/reflect/Field;->getInt(Ljava/lang/Object;)I
final String v3 = "SCREENLAYOUT_SIZE_SMALL"; // const-string v3, "SCREENLAYOUT_SIZE_SMALL"
(( java.lang.Class ) v1 ).getField ( v3 ); // invoke-virtual {v1, v3}, Ljava/lang/Class;->getField(Ljava/lang/String;)Ljava/lang/reflect/Field;
v3 = (( java.lang.reflect.Field ) v3 ).getInt ( v0 ); // invoke-virtual {v3, v0}, Ljava/lang/reflect/Field;->getInt(Ljava/lang/Object;)I
final String v4 = "SCREENLAYOUT_SIZE_NORMAL"; // const-string v4, "SCREENLAYOUT_SIZE_NORMAL"
(( java.lang.Class ) v1 ).getField ( v4 ); // invoke-virtual {v1, v4}, Ljava/lang/Class;->getField(Ljava/lang/String;)Ljava/lang/reflect/Field;
v4 = (( java.lang.reflect.Field ) v4 ).getInt ( v0 ); // invoke-virtual {v4, v0}, Ljava/lang/reflect/Field;->getInt(Ljava/lang/Object;)I
final String v5 = "SCREENLAYOUT_SIZE_LARGE"; // const-string v5, "SCREENLAYOUT_SIZE_LARGE"
(( java.lang.Class ) v1 ).getField ( v5 ); // invoke-virtual {v1, v5}, Ljava/lang/Class;->getField(Ljava/lang/String;)Ljava/lang/reflect/Field;
v5 = (( java.lang.reflect.Field ) v5 ).getInt ( v0 ); // invoke-virtual {v5, v0}, Ljava/lang/reflect/Field;->getInt(Ljava/lang/Object;)I
/* new-instance v6, Ljava/lang/Integer; */
v7 = com.doodlemobile.gamecenter.d.d.l;
/* invoke-direct {v6, v7}, Ljava/lang/Integer;-><init>(Ljava/lang/String;)V */
v6 = (( java.lang.Integer ) v6 ).intValue ( ); // invoke-virtual {v6}, Ljava/lang/Integer;->intValue()I
/* const/16 v7, 0x9 */
/* if-lt v6, v7, :cond_0 */
final String v6 = "SCREENLAYOUT_SIZE_XLARGE"; // const-string v6, "SCREENLAYOUT_SIZE_XLARGE"
(( java.lang.Class ) v1 ).getField ( v6 ); // invoke-virtual {v1, v6}, Ljava/lang/Class;->getField(Ljava/lang/String;)Ljava/lang/reflect/Field;
v6 = (( java.lang.reflect.Field ) v6 ).getInt ( v0 ); // invoke-virtual {v6, v0}, Ljava/lang/reflect/Field;->getInt(Ljava/lang/Object;)I
/* and-int v7, v2, v6 */
/* if-ne v7, v6, :cond_0 */
final String v6 = "xlar"; // const-string v6, "xlar"
} // :cond_0
final String v6 = "SCREENLAYOUT_SIZE_UNDEFINED"; // const-string v6, "SCREENLAYOUT_SIZE_UNDEFINED"
(( java.lang.Class ) v1 ).getField ( v6 ); // invoke-virtual {v1, v6}, Ljava/lang/Class;->getField(Ljava/lang/String;)Ljava/lang/reflect/Field;
v0 = (( java.lang.reflect.Field ) v1 ).getInt ( v0 ); // invoke-virtual {v1, v0}, Ljava/lang/reflect/Field;->getInt(Ljava/lang/Object;)I
/* and-int v1, v2, v3 */
/* if-ne v1, v3, :cond_6 */
final String v0 = "small"; // const-string v0, "small"
/* :try_end_0 */
/* .catch Ljava/lang/Exception; {:try_start_0 ..:try_end_0} :catch_1 */
} // :cond_1
} // :goto_0
java.util.Locale .getDefault ( );
(( java.util.Locale ) v0 ).getCountry ( ); // invoke-virtual {v0}, Ljava/util/Locale;->getCountry()Ljava/lang/String;
java.util.Locale .getDefault ( );
(( java.util.Locale ) v0 ).getLanguage ( ); // invoke-virtual {v0}, Ljava/util/Locale;->getLanguage()Ljava/lang/String;
v0 = android.os.Build.MODEL;
(( android.content.Context ) p0 ).getPackageName ( ); // invoke-virtual {p0}, Landroid/content/Context;->getPackageName()Ljava/lang/String;
try { // :try_start_1
(( android.content.Context ) p0 ).getPackageManager ( ); // invoke-virtual {p0}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;
v1 = com.doodlemobile.gamecenter.d.d.g;
/* const/16 v2, 0x80 */
(( android.content.pm.PackageManager ) v0 ).getApplicationInfo ( v1, v2 ); // invoke-virtual {v0, v1, v2}, Landroid/content/pm/PackageManager;->getApplicationInfo(Ljava/lang/String;I)Landroid/content/pm/ApplicationInfo;
v0 = this.metaData;
final String v1 = "doodle_mobile_appid"; // const-string v1, "doodle_mobile_appid"
(( android.os.Bundle ) v0 ).getString ( v1 ); // invoke-virtual {v0, v1}, Landroid/os/Bundle;->getString(Ljava/lang/String;)Ljava/lang/String;
/* :try_end_1 */
/* .catch Landroid/content/pm/PackageManager$NameNotFoundException; {:try_start_1 ..:try_end_1} :catch_3 */
} // :goto_1
try { // :try_start_2
(( android.content.Context ) p0 ).getPackageManager ( ); // invoke-virtual {p0}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;
v1 = com.doodlemobile.gamecenter.d.d.g;
int v2 = 0; // const/4 v2, 0x0
(( android.content.pm.PackageManager ) v0 ).getPackageInfo ( v1, v2 ); // invoke-virtual {v0, v1, v2}, Landroid/content/pm/PackageManager;->getPackageInfo(Ljava/lang/String;I)Landroid/content/pm/PackageInfo;
v0 = this.sharedUserId;
/* :try_end_2 */
/* .catch Landroid/content/pm/PackageManager$NameNotFoundException; {:try_start_2 ..:try_end_2} :catch_2 */
} // :goto_2
v0 = com.doodlemobile.gamecenter.d.d.p;
/* if-nez v0, :cond_2 */
final String v0 = "com.doodlemobile"; // const-string v0, "com.doodlemobile"
} // :cond_2
try { // :try_start_3
(( android.content.Context ) p0 ).getPackageManager ( ); // invoke-virtual {p0}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;
int v1 = 0; // const/4 v1, 0x0
(( android.content.pm.PackageManager ) v0 ).getInstalledPackages ( v1 ); // invoke-virtual {v0, v1}, Landroid/content/pm/PackageManager;->getInstalledPackages(I)Ljava/util/List;
} // :cond_3
v0 = } // :goto_3
if ( v0 != null) { // if-eqz v0, :cond_5
/* check-cast v0, Landroid/content/pm/PackageInfo; */
v2 = com.doodlemobile.gamecenter.d.d.p;
if ( v2 != null) { // if-eqz v2, :cond_a
if ( v0 != null) { // if-eqz v0, :cond_a
v2 = this.sharedUserId;
if ( v2 != null) { // if-eqz v2, :cond_a
v2 = this.sharedUserId;
v3 = com.doodlemobile.gamecenter.d.d.p;
v2 = (( java.lang.String ) v2 ).equalsIgnoreCase ( v3 ); // invoke-virtual {v2, v3}, Ljava/lang/String;->equalsIgnoreCase(Ljava/lang/String;)Z
if ( v2 != null) { // if-eqz v2, :cond_a
v2 = com.doodlemobile.gamecenter.d.d.q;
/* if-nez v2, :cond_4 */
final String v2 = ""; // const-string v2, ""
} // :cond_4
/* new-instance v2, Ljava/lang/StringBuilder; */
/* invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V */
v3 = com.doodlemobile.gamecenter.d.d.q;
(( java.lang.StringBuilder ) v2 ).append ( v3 ); // invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
v0 = this.packageName;
(( java.lang.StringBuilder ) v2 ).append ( v0 ); // invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v0 ).toString ( ); // invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
/* new-instance v0, Ljava/lang/StringBuilder; */
/* invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V */
v2 = com.doodlemobile.gamecenter.d.d.q;
(( java.lang.StringBuilder ) v0 ).append ( v2 ); // invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
final String v2 = "="; // const-string v2, "="
(( java.lang.StringBuilder ) v0 ).append ( v2 ); // invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v0 ).toString ( ); // invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
/* :try_end_3 */
/* .catch Ljava/lang/Exception; {:try_start_3 ..:try_end_3} :catch_0 */
/* :catch_0 */
/* move-exception v0 */
int v1 = 0; // const/4 v1, 0x0
(( java.lang.Exception ) v0 ).printStackTrace ( ); // invoke-virtual {v0}, Ljava/lang/Exception;->printStackTrace()V
} // :cond_5
v0 = com.doodlemobile.gamecenter.d.d .e ( );
if ( v0 != null) { // if-eqz v0, :cond_f
v0 = com.doodlemobile.gamecenter.d.d.h;
v0 = com.doodlemobile.gamecenter.d.d .b ( v0,p0 );
if ( v0 != null) { // if-eqz v0, :cond_e
/* move v0, v9 */
} // :goto_4
} // :cond_6
/* and-int v1, v2, v4 */
/* if-ne v1, v4, :cond_7 */
try { // :try_start_4
final String v0 = "normal"; // const-string v0, "normal"
/* goto/16 :goto_0 */
/* :catch_1 */
/* move-exception v0 */
/* goto/16 :goto_0 */
} // :cond_7
/* and-int v1, v2, v5 */
/* if-ne v1, v5, :cond_8 */
final String v0 = "large"; // const-string v0, "large"
/* goto/16 :goto_0 */
} // :cond_8
/* and-int v1, v2, v0 */
/* if-ne v1, v0, :cond_9 */
v0 = com.doodlemobile.gamecenter.d.d.f;
final String v1 = "xlar"; // const-string v1, "xlar"
/* if-eq v0, v1, :cond_1 */
final String v0 = "un"; // const-string v0, "un"
/* goto/16 :goto_0 */
} // :cond_9
final String v0 = "no"; // const-string v0, "no"
/* :try_end_4 */
/* .catch Ljava/lang/Exception; {:try_start_4 ..:try_end_4} :catch_1 */
/* goto/16 :goto_0 */
/* :catch_2 */
/* move-exception v0 */
final String v1 = "com.doodlemobile"; // const-string v1, "com.doodlemobile"
(( android.content.pm.PackageManager$NameNotFoundException ) v0 ).printStackTrace ( ); // invoke-virtual {v0}, Landroid/content/pm/PackageManager$NameNotFoundException;->printStackTrace()V
/* goto/16 :goto_2 */
} // :cond_a
if ( v0 != null) { // if-eqz v0, :cond_3
try { // :try_start_5
v2 = this.packageName;
if ( v2 != null) { // if-eqz v2, :cond_3
v2 = this.packageName;
final String v3 = "com.tapglider"; // const-string v3, "com.tapglider"
v3 = (( java.lang.String ) v2 ).equals ( v3 ); // invoke-virtual {v2, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
/* if-nez v3, :cond_b */
final String v3 = "x.JewelsDeluxe"; // const-string v3, "x.JewelsDeluxe"
v3 = (( java.lang.String ) v2 ).equals ( v3 ); // invoke-virtual {v2, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
/* if-nez v3, :cond_b */
final String v3 = "com.threed.bowling"; // const-string v3, "com.threed.bowling"
v3 = (( java.lang.String ) v2 ).equals ( v3 ); // invoke-virtual {v2, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
/* if-nez v3, :cond_b */
final String v3 = "com.wordsmobile.RollerBall"; // const-string v3, "com.wordsmobile.RollerBall"
v3 = (( java.lang.String ) v2 ).equals ( v3 ); // invoke-virtual {v2, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
/* if-nez v3, :cond_b */
final String v3 = "com.a1.game.vszombies"; // const-string v3, "com.a1.game.vszombies"
v3 = (( java.lang.String ) v2 ).equals ( v3 ); // invoke-virtual {v2, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
/* if-nez v3, :cond_b */
final String v3 = "com.sniper.activity"; // const-string v3, "com.sniper.activity"
v3 = (( java.lang.String ) v2 ).equals ( v3 ); // invoke-virtual {v2, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
/* if-nez v3, :cond_b */
final String v3 = "com.shootbubble.bubbledexlue"; // const-string v3, "com.shootbubble.bubbledexlue"
v3 = (( java.lang.String ) v2 ).equals ( v3 ); // invoke-virtual {v2, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
/* if-nez v3, :cond_b */
final String v3 = "com.forthblue.pool"; // const-string v3, "com.forthblue.pool"
v3 = (( java.lang.String ) v2 ).equals ( v3 ); // invoke-virtual {v2, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
/* if-nez v3, :cond_b */
final String v3 = "com.candydroid.breakblock"; // const-string v3, "com.candydroid.breakblock"
v3 = (( java.lang.String ) v2 ).equals ( v3 ); // invoke-virtual {v2, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
/* if-nez v3, :cond_b */
final String v3 = "com.junerking.ninjia"; // const-string v3, "com.junerking.ninjia"
v2 = (( java.lang.String ) v2 ).equals ( v3 ); // invoke-virtual {v2, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
if ( v2 != null) { // if-eqz v2, :cond_d
} // :cond_b
/* move v2, v9 */
} // :goto_5
if ( v2 != null) { // if-eqz v2, :cond_3
v2 = com.doodlemobile.gamecenter.d.d.q;
/* if-nez v2, :cond_c */
final String v2 = ""; // const-string v2, ""
} // :cond_c
/* new-instance v2, Ljava/lang/StringBuilder; */
/* invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V */
v3 = com.doodlemobile.gamecenter.d.d.q;
(( java.lang.StringBuilder ) v2 ).append ( v3 ); // invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
v0 = this.packageName;
(( java.lang.StringBuilder ) v2 ).append ( v0 ); // invoke-virtual {v2, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v0 ).toString ( ); // invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
/* new-instance v0, Ljava/lang/StringBuilder; */
/* invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V */
v2 = com.doodlemobile.gamecenter.d.d.q;
(( java.lang.StringBuilder ) v0 ).append ( v2 ); // invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
final String v2 = "="; // const-string v2, "="
(( java.lang.StringBuilder ) v0 ).append ( v2 ); // invoke-virtual {v0, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v0 ).toString ( ); // invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
/* :try_end_5 */
/* .catch Ljava/lang/Exception; {:try_start_5 ..:try_end_5} :catch_0 */
/* goto/16 :goto_3 */
} // :cond_d
/* move v2, v8 */
} // :cond_e
/* move v0, v8 */
/* goto/16 :goto_4 */
} // :cond_f
/* move v0, v8 */
/* goto/16 :goto_4 */
} // :cond_10
/* move v0, v8 */
/* goto/16 :goto_4 */
/* :catch_3 */
/* move-exception v0 */
/* goto/16 :goto_1 */
} // .end method
private static Boolean b ( java.lang.String p0, android.content.Context p1 ) {
/* .locals 10 */
int v9 = 0; // const/4 v9, 0x0
/* if-nez p0, :cond_0 */
/* move v0, v9 */
} // :goto_0
} // :cond_0
try { // :try_start_0
a.a.a.d .a ( p0 );
/* check-cast p0, La/a/a/c; */
final String v0 = "data"; // const-string v0, "data"
(( a.a.a.c ) p0 ).get ( v0 ); // invoke-virtual {p0, v0}, La/a/a/c;->get(Ljava/lang/Object;)Ljava/lang/Object;
/* check-cast p0, Ljava/lang/String; */
a.a.a.d .a ( p0 );
/* check-cast p0, La/a/a/b; */
v0 = com.doodlemobile.gamecenter.d.d.u;
(( java.util.ArrayList ) v0 ).clear ( ); // invoke-virtual {v0}, Ljava/util/ArrayList;->clear()V
/* move v6, v9 */
} // :goto_1
v0 = (( a.a.a.b ) p0 ).size ( ); // invoke-virtual {p0}, La/a/a/b;->size()I
/* if-ge v6, v0, :cond_4 */
(( a.a.a.b ) p0 ).get ( v6 ); // invoke-virtual {p0, v6}, La/a/a/b;->get(I)Ljava/lang/Object;
/* check-cast v0, La/a/a/c; */
final String v1 = "gamename"; // const-string v1, "gamename"
(( a.a.a.c ) v0 ).get ( v1 ); // invoke-virtual {v0, v1}, La/a/a/c;->get(Ljava/lang/Object;)Ljava/lang/Object;
/* check-cast v2, Ljava/lang/String; */
final String v1 = "companyname"; // const-string v1, "companyname"
(( a.a.a.c ) v0 ).get ( v1 ); // invoke-virtual {v0, v1}, La/a/a/c;->get(Ljava/lang/Object;)Ljava/lang/Object;
/* check-cast v1, Ljava/lang/String; */
final String v3 = "marketuri"; // const-string v3, "marketuri"
(( a.a.a.c ) v0 ).get ( v3 ); // invoke-virtual {v0, v3}, La/a/a/c;->get(Ljava/lang/Object;)Ljava/lang/Object;
/* check-cast v3, Ljava/lang/String; */
final String v4 = "featureuri"; // const-string v4, "featureuri"
(( a.a.a.c ) v0 ).get ( v4 ); // invoke-virtual {v0, v4}, La/a/a/c;->get(Ljava/lang/Object;)Ljava/lang/Object;
/* check-cast v4, Ljava/lang/String; */
com.doodlemobile.gamecenter.d.d .c ( v4,p1 );
/* :try_end_0 */
v0 = /* .catch Ljava/lang/Exception; {:try_start_0 ..:try_end_0} :catch_1 */
if ( v0 != null) { // if-eqz v0, :cond_2
try { // :try_start_1
com.doodlemobile.gamecenter.f.a .a ( v4 );
/* :try_end_1 */
/* .catch Ljava/lang/Exception; {:try_start_1 ..:try_end_1} :catch_0 */
} // :goto_2
try { // :try_start_2
v0 = com.doodlemobile.gamecenter.d.d.i;
if ( v0 != null) { // if-eqz v0, :cond_2
v0 = com.doodlemobile.gamecenter.d.d.i;
/* array-length v0, v0 */
/* :try_end_2 */
/* .catch Ljava/lang/Exception; {:try_start_2 ..:try_end_2} :catch_1 */
if ( v0 != null) { // if-eqz v0, :cond_2
try { // :try_start_3
/* new-instance v0, Ljava/lang/String; */
(( java.lang.String ) v4 ).getBytes ( ); // invoke-virtual {v4}, Ljava/lang/String;->getBytes()[B
com.doodlemobile.gamecenter.e.a .a ( v5 );
/* invoke-direct {v0, v5}, Ljava/lang/String;-><init>([B)V */
v5 = com.doodlemobile.gamecenter.d.a .a ( );
if ( v5 != null) { // if-eqz v5, :cond_1
/* new-instance v5, Ljava/lang/StringBuilder; */
/* invoke-direct {v5}, Ljava/lang/StringBuilder;-><init>()V */
final String v7 = "sdcard/.doodlemobile_featureviewnew/."; // const-string v7, "sdcard/.doodlemobile_featureviewnew/."
(( java.lang.StringBuilder ) v5 ).append ( v7 ); // invoke-virtual {v5, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v5 ).append ( v0 ); // invoke-virtual {v5, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v5 ).toString ( ); // invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
v7 = com.doodlemobile.gamecenter.d.d.i;
v5 = com.doodlemobile.gamecenter.d.a .a ( v5,v7 );
/* if-nez v5, :cond_2 */
} // :cond_1
v5 = com.doodlemobile.gamecenter.d.d.i;
com.doodlemobile.gamecenter.e.d .a ( v0,v5,p1 );
/* :try_end_3 */
/* .catch Ljava/lang/Exception; {:try_start_3 ..:try_end_3} :catch_2 */
} // :cond_2
} // :goto_3
try { // :try_start_4
v0 = com.doodlemobile.gamecenter.d.d.i;
if ( v0 != null) { // if-eqz v0, :cond_3
/* new-instance v0, Lcom/doodlemobile/gamecenter/d/c; */
v5 = com.doodlemobile.gamecenter.d.d.i;
/* invoke-direct/range {v0 ..v5}, Lcom/doodlemobile/gamecenter/d/c;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;[B)V */
v1 = com.doodlemobile.gamecenter.d.d.u;
(( java.util.ArrayList ) v1 ).add ( v0 ); // invoke-virtual {v1, v0}, Ljava/util/ArrayList;->add(Ljava/lang/Object;)Z
} // :cond_3
/* add-int/lit8 v0, v6, 0x1 */
/* move v6, v0 */
/* goto/16 :goto_1 */
/* :catch_0 */
/* move-exception v0 */
final String v5 = "FeatureGamesFactory"; // const-string v5, "FeatureGamesFactory"
/* new-instance v7, Ljava/lang/StringBuilder; */
/* invoke-direct {v7}, Ljava/lang/StringBuilder;-><init>()V */
final String v8 = "IamgeNotExist error "; // const-string v8, "IamgeNotExist error "
(( java.lang.StringBuilder ) v7 ).append ( v8 ); // invoke-virtual {v7, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.Exception ) v0 ).getMessage ( ); // invoke-virtual {v0}, Ljava/lang/Exception;->getMessage()Ljava/lang/String;
(( java.lang.StringBuilder ) v7 ).append ( v0 ); // invoke-virtual {v7, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v0 ).toString ( ); // invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
android.util.Log .w ( v5,v0 );
int v0 = 0; // const/4 v0, 0x0
/* :catch_1 */
/* move-exception v0 */
/* move v0, v9 */
/* goto/16 :goto_0 */
/* :catch_2 */
/* move-exception v0 */
final String v0 = "xuming"; // const-string v0, "xuming"
final String v5 = " save image file fail !"; // const-string v5, " save image file fail !"
android.util.Log .w ( v0,v5 );
/* :try_end_4 */
/* .catch Ljava/lang/Exception; {:try_start_4 ..:try_end_4} :catch_1 */
} // :cond_4
int v0 = 1; // const/4 v0, 0x1
/* goto/16 :goto_0 */
} // .end method
static java.util.ArrayList c ( ) { //synthethic
/* .locals 1 */
v0 = com.doodlemobile.gamecenter.d.d.v;
} // .end method
public static Boolean c ( android.content.Context p0 ) {
/* .locals 5 */
int v4 = 0; // const/4 v4, 0x0
try { // :try_start_0
final String v0 = "connectivity"; // const-string v0, "connectivity"
(( android.content.Context ) p0 ).getSystemService ( v0 ); // invoke-virtual {p0, v0}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;
/* check-cast p0, Landroid/net/ConnectivityManager; */
if ( p0 != null) { // if-eqz p0, :cond_1
(( android.net.ConnectivityManager ) p0 ).getAllNetworkInfo ( ); // invoke-virtual {p0}, Landroid/net/ConnectivityManager;->getAllNetworkInfo()[Landroid/net/NetworkInfo;
if ( v0 != null) { // if-eqz v0, :cond_1
/* move v1, v4 */
} // :goto_0
/* array-length v2, v0 */
/* if-ge v1, v2, :cond_1 */
/* aget-object v2, v0, v1 */
(( android.net.NetworkInfo ) v2 ).getState ( ); // invoke-virtual {v2}, Landroid/net/NetworkInfo;->getState()Landroid/net/NetworkInfo$State;
v3 = android.net.NetworkInfo$State.CONNECTED;
/* :try_end_0 */
/* .catch Ljava/lang/Exception; {:try_start_0 ..:try_end_0} :catch_0 */
/* .catchall {:try_start_0 ..:try_end_0} :catchall_0 */
/* if-ne v2, v3, :cond_0 */
int v0 = 1; // const/4 v0, 0x1
} // :goto_1
} // :cond_0
/* add-int/lit8 v1, v1, 0x1 */
} // :cond_1
/* move v0, v4 */
/* :catch_0 */
/* move-exception v0 */
/* move v0, v4 */
/* :catchall_0 */
/* move-exception v0 */
/* throw v0 */
} // .end method
private static Boolean c ( java.lang.String p0, android.content.Context p1 ) {
/* .locals 6 */
int v5 = 1; // const/4 v5, 0x1
final String v0 = "sdcard/.doodlemobile_featureviewnew/."; // const-string v0, "sdcard/.doodlemobile_featureviewnew/."
final String v0 = "FeatureGamesFactory"; // const-string v0, "FeatureGamesFactory"
int v0 = 0; // const/4 v0, 0x0
try { // :try_start_0
/* new-instance v0, Ljava/lang/String; */
(( java.lang.String ) p0 ).getBytes ( ); // invoke-virtual {p0}, Ljava/lang/String;->getBytes()[B
com.doodlemobile.gamecenter.e.a .a ( v1 );
/* invoke-direct {v0, v1}, Ljava/lang/String;-><init>([B)V */
v1 = com.doodlemobile.gamecenter.d.a .a ( );
if ( v1 != null) { // if-eqz v1, :cond_0
/* new-instance v1, Ljava/lang/StringBuilder; */
/* invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V */
final String v2 = "sdcard/.doodlemobile_featureviewnew/."; // const-string v2, "sdcard/.doodlemobile_featureviewnew/."
(( java.lang.StringBuilder ) v1 ).append ( v2 ); // invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v1 ).append ( v0 ); // invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v1 ).toString ( ); // invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
com.doodlemobile.gamecenter.d.a .a ( v1 );
if ( v1 != null) { // if-eqz v1, :cond_0
v1 = com.doodlemobile.gamecenter.d.d.i;
/* array-length v1, v1 */
/* if-nez v1, :cond_0 */
final String v1 = "FeatureGamesFactory"; // const-string v1, "FeatureGamesFactory"
final String v2 = "mImage should delete"; // const-string v2, "mImage should delete"
android.util.Log .i ( v1,v2 );
/* :try_end_0 */
/* .catch Ljava/lang/Exception; {:try_start_0 ..:try_end_0} :catch_1 */
try { // :try_start_1
/* new-instance v1, Ljava/lang/StringBuilder; */
/* invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V */
final String v2 = "sdcard/.doodlemobile_featureviewnew/."; // const-string v2, "sdcard/.doodlemobile_featureviewnew/."
(( java.lang.StringBuilder ) v1 ).append ( v2 ); // invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v1 ).append ( v0 ); // invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v1 ).toString ( ); // invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
com.doodlemobile.gamecenter.d.a .b ( v1 );
final String v1 = "FeatureGamesFactory"; // const-string v1, "FeatureGamesFactory"
final String v2 = "delete successfully"; // const-string v2, "delete successfully"
android.util.Log .i ( v1,v2 );
/* :try_end_1 */
/* .catch Ljava/lang/Exception; {:try_start_1 ..:try_end_1} :catch_0 */
/* .catchall {:try_start_1 ..:try_end_1} :catchall_0 */
int v1 = 0; // const/4 v1, 0x0
try { // :try_start_2
} // :cond_0
} // :goto_0
v1 = com.doodlemobile.gamecenter.d.d.i;
/* if-nez v1, :cond_1 */
com.doodlemobile.gamecenter.e.d .a ( v0,p1 );
} // :cond_1
v0 = com.doodlemobile.gamecenter.d.d.i;
if ( v0 != null) { // if-eqz v0, :cond_2
v0 = com.doodlemobile.gamecenter.d.d.i;
/* array-length v0, v0 */
/* :try_end_2 */
/* .catch Ljava/lang/Exception; {:try_start_2 ..:try_end_2} :catch_1 */
/* if-lez v0, :cond_2 */
int v0 = 0; // const/4 v0, 0x0
} // :goto_1
/* :catch_0 */
/* move-exception v1 */
try { // :try_start_3
final String v2 = "FeatureGamesFactory"; // const-string v2, "FeatureGamesFactory"
/* new-instance v3, Ljava/lang/StringBuilder; */
/* invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V */
final String v4 = "delete not work"; // const-string v4, "delete not work"
(( java.lang.StringBuilder ) v3 ).append ( v4 ); // invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v3 ).append ( v1 ); // invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v1 ).toString ( ); // invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
android.util.Log .w ( v2,v1 );
/* :try_end_3 */
/* .catchall {:try_start_3 ..:try_end_3} :catchall_0 */
int v1 = 0; // const/4 v1, 0x0
try { // :try_start_4
/* :try_end_4 */
/* .catch Ljava/lang/Exception; {:try_start_4 ..:try_end_4} :catch_1 */
/* :catch_1 */
/* move-exception v0 */
final String v0 = "xuming"; // const-string v0, "xuming"
final String v1 = "3"; // const-string v1, "3"
android.util.Log .w ( v0,v1 );
/* move v0, v5 */
/* :catchall_0 */
/* move-exception v0 */
int v1 = 0; // const/4 v1, 0x0
try { // :try_start_5
/* throw v0 */
/* :try_end_5 */
/* .catch Ljava/lang/Exception; {:try_start_5 ..:try_end_5} :catch_1 */
} // :cond_2
/* move v0, v5 */
} // .end method
private static com.doodlemobile.gamecenter.d.c d ( ) {
/* .locals 2 */
/* add-int/lit8 v0, v0, 0x1 */
v0 = com.doodlemobile.gamecenter.d.d.u;
v0 = (( java.util.ArrayList ) v0 ).size ( ); // invoke-virtual {v0}, Ljava/util/ArrayList;->size()I
if ( v0 != null) { // if-eqz v0, :cond_1
v1 = com.doodlemobile.gamecenter.d.d.u;
v1 = (( java.util.ArrayList ) v1 ).size ( ); // invoke-virtual {v1}, Ljava/util/ArrayList;->size()I
/* if-lt v0, v1, :cond_0 */
int v0 = 0; // const/4 v0, 0x0
} // :cond_0
v0 = com.doodlemobile.gamecenter.d.d.u;
(( java.util.ArrayList ) v0 ).get ( v1 ); // invoke-virtual {v0, v1}, Ljava/util/ArrayList;->get(I)Ljava/lang/Object;
/* check-cast v0, Lcom/doodlemobile/gamecenter/d/c; */
} // :goto_0
} // :cond_1
int v0 = 0; // const/4 v0, 0x0
} // .end method
public static void d ( android.content.Context p0 ) {
/* .locals 3 */
int v1 = 1; // const/4 v1, 0x1
/* sget-boolean v0, Lcom/doodlemobile/gamecenter/d/d;->c:Z */
/* if-nez v0, :cond_0 */
com.doodlemobile.gamecenter.d.d.c = (v1!= 0);
try { // :try_start_0
/* new-instance v0, Lcom/doodlemobile/gamecenter/d/b; */
/* invoke-direct {v0}, Lcom/doodlemobile/gamecenter/d/b;-><init>()V */
int v1 = 1; // const/4 v1, 0x1
/* new-array v1, v1, [Landroid/content/Context; */
int v2 = 0; // const/4 v2, 0x0
/* aput-object p0, v1, v2 */
(( com.doodlemobile.gamecenter.d.b ) v0 ).execute ( v1 ); // invoke-virtual {v0, v1}, Lcom/doodlemobile/gamecenter/d/b;->execute([Ljava/lang/Object;)Landroid/os/AsyncTask;
/* :try_end_0 */
/* .catch Ljava/lang/Exception; {:try_start_0 ..:try_end_0} :catch_0 */
} // :goto_0
return;
/* :catch_0 */
/* move-exception v0 */
(( java.lang.Exception ) v0 ).printStackTrace ( ); // invoke-virtual {v0}, Ljava/lang/Exception;->printStackTrace()V
} // :cond_0
v0 = com.doodlemobile.gamecenter.d.d.u;
(( java.util.ArrayList ) v0 ).size ( ); // invoke-virtual {v0}, Ljava/util/ArrayList;->size()I
} // .end method
private static Boolean e ( ) {
/* .locals 9 */
int v6 = 0; // const/4 v6, 0x0
final String v8 = "ssc"; // const-string v8, "ssc"
final String v7 = ""; // const-string v7, ""
/* new-instance v0, Lorg/apache/http/client/methods/HttpPost; */
v1 = com.doodlemobile.gamecenter.d.d.r;
/* invoke-direct {v0, v1}, Lorg/apache/http/client/methods/HttpPost;-><init>(Ljava/lang/String;)V */
/* new-instance v1, Ljava/util/ArrayList; */
/* invoke-direct {v1}, Ljava/util/ArrayList;-><init>()V */
/* new-instance v2, Lorg/apache/http/message/BasicNameValuePair; */
final String v3 = "pn"; // const-string v3, "pn"
v4 = com.doodlemobile.gamecenter.d.d.g;
/* invoke-direct {v2, v3, v4}, Lorg/apache/http/message/BasicNameValuePair;-><init>(Ljava/lang/String;Ljava/lang/String;)V */
/* new-instance v2, Lorg/apache/http/message/BasicNameValuePair; */
final String v3 = "de"; // const-string v3, "de"
v4 = com.doodlemobile.gamecenter.d.d.e;
/* invoke-direct {v2, v3, v4}, Lorg/apache/http/message/BasicNameValuePair;-><init>(Ljava/lang/String;Ljava/lang/String;)V */
/* new-instance v2, Lorg/apache/http/message/BasicNameValuePair; */
final String v3 = "a"; // const-string v3, "a"
v4 = com.doodlemobile.gamecenter.d.d.d;
/* invoke-direct {v2, v3, v4}, Lorg/apache/http/message/BasicNameValuePair;-><init>(Ljava/lang/String;Ljava/lang/String;)V */
/* new-instance v2, Lorg/apache/http/message/BasicNameValuePair; */
final String v3 = "la"; // const-string v3, "la"
v4 = com.doodlemobile.gamecenter.d.d.j;
/* invoke-direct {v2, v3, v4}, Lorg/apache/http/message/BasicNameValuePair;-><init>(Ljava/lang/String;Ljava/lang/String;)V */
/* new-instance v2, Lorg/apache/http/message/BasicNameValuePair; */
final String v3 = "lo"; // const-string v3, "lo"
v4 = com.doodlemobile.gamecenter.d.d.k;
/* invoke-direct {v2, v3, v4}, Lorg/apache/http/message/BasicNameValuePair;-><init>(Ljava/lang/String;Ljava/lang/String;)V */
/* new-instance v2, Lorg/apache/http/message/BasicNameValuePair; */
final String v3 = "v"; // const-string v3, "v"
v4 = com.doodlemobile.gamecenter.d.d.l;
/* invoke-direct {v2, v3, v4}, Lorg/apache/http/message/BasicNameValuePair;-><init>(Ljava/lang/String;Ljava/lang/String;)V */
/* new-instance v2, Ljava/lang/Integer; */
v3 = com.doodlemobile.gamecenter.d.d.l;
/* invoke-direct {v2, v3}, Ljava/lang/Integer;-><init>(Ljava/lang/String;)V */
v2 = (( java.lang.Integer ) v2 ).intValue ( ); // invoke-virtual {v2}, Ljava/lang/Integer;->intValue()I
int v3 = 4; // const/4 v3, 0x4
/* if-ge v2, v3, :cond_0 */
/* new-instance v2, Lorg/apache/http/message/BasicNameValuePair; */
final String v3 = "h"; // const-string v3, "h"
/* new-instance v4, Ljava/lang/StringBuilder; */
/* invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V */
(( java.lang.StringBuilder ) v4 ).append ( v5 ); // invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;
final String v5 = ""; // const-string v5, ""
(( java.lang.StringBuilder ) v4 ).append ( v7 ); // invoke-virtual {v4, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v4 ).toString ( ); // invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
/* invoke-direct {v2, v3, v4}, Lorg/apache/http/message/BasicNameValuePair;-><init>(Ljava/lang/String;Ljava/lang/String;)V */
/* new-instance v2, Lorg/apache/http/message/BasicNameValuePair; */
final String v3 = "w"; // const-string v3, "w"
/* new-instance v4, Ljava/lang/StringBuilder; */
/* invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V */
(( java.lang.StringBuilder ) v4 ).append ( v5 ); // invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;
final String v5 = ""; // const-string v5, ""
(( java.lang.StringBuilder ) v4 ).append ( v7 ); // invoke-virtual {v4, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v4 ).toString ( ); // invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
/* invoke-direct {v2, v3, v4}, Lorg/apache/http/message/BasicNameValuePair;-><init>(Ljava/lang/String;Ljava/lang/String;)V */
/* new-instance v2, Lorg/apache/http/message/BasicNameValuePair; */
final String v3 = "dy"; // const-string v3, "dy"
/* new-instance v4, Ljava/lang/StringBuilder; */
/* invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V */
(( java.lang.StringBuilder ) v4 ).append ( v5 ); // invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(F)Ljava/lang/StringBuilder;
final String v5 = ""; // const-string v5, ""
(( java.lang.StringBuilder ) v4 ).append ( v7 ); // invoke-virtual {v4, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v4 ).toString ( ); // invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
/* invoke-direct {v2, v3, v4}, Lorg/apache/http/message/BasicNameValuePair;-><init>(Ljava/lang/String;Ljava/lang/String;)V */
} // :goto_0
v2 = com.doodlemobile.gamecenter.d.d.q;
if ( v2 != null) { // if-eqz v2, :cond_1
/* new-instance v2, Lorg/apache/http/message/BasicNameValuePair; */
final String v3 = "pi"; // const-string v3, "pi"
v4 = com.doodlemobile.gamecenter.d.d.q;
/* invoke-direct {v2, v3, v4}, Lorg/apache/http/message/BasicNameValuePair;-><init>(Ljava/lang/String;Ljava/lang/String;)V */
} // :goto_1
try { // :try_start_0
/* new-instance v2, Lorg/apache/http/client/entity/UrlEncodedFormEntity; */
final String v3 = "utf-8"; // const-string v3, "utf-8"
/* invoke-direct {v2, v1, v3}, Lorg/apache/http/client/entity/UrlEncodedFormEntity;-><init>(Ljava/util/List;Ljava/lang/String;)V */
(( org.apache.http.client.methods.HttpPost ) v0 ).setEntity ( v2 ); // invoke-virtual {v0, v2}, Lorg/apache/http/client/methods/HttpPost;->setEntity(Lorg/apache/http/HttpEntity;)V
/* new-instance v1, Lorg/apache/http/impl/client/DefaultHttpClient; */
v1 = /* invoke-direct {v1}, Lorg/apache/http/impl/client/DefaultHttpClient;-><init>()V */
/* const/16 v2, 0xc8 */
/* if-ne v1, v2, :cond_2 */
org.apache.http.util.EntityUtils .toString ( v0 );
/* :try_end_0 */
/* .catch Lorg/apache/http/client/ClientProtocolException; {:try_start_0 ..:try_end_0} :catch_0 */
/* .catch Ljava/io/IOException; {:try_start_0 ..:try_end_0} :catch_1 */
/* .catch Ljava/lang/Exception; {:try_start_0 ..:try_end_0} :catch_2 */
int v0 = 1; // const/4 v0, 0x1
} // :goto_2
} // :cond_0
/* new-instance v2, Lorg/apache/http/message/BasicNameValuePair; */
final String v3 = "s"; // const-string v3, "s"
v4 = com.doodlemobile.gamecenter.d.d.f;
/* invoke-direct {v2, v3, v4}, Lorg/apache/http/message/BasicNameValuePair;-><init>(Ljava/lang/String;Ljava/lang/String;)V */
} // :cond_1
final String v2 = "xuming"; // const-string v2, "xuming"
final String v3 = "no mPackageInstalledNames !"; // const-string v3, "no mPackageInstalledNames !"
android.util.Log .w ( v2,v3 );
} // :cond_2
/* move v0, v6 */
/* :catch_0 */
/* move-exception v0 */
final String v1 = "ssc"; // const-string v1, "ssc"
/* new-instance v1, Ljava/lang/StringBuilder; */
/* invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V */
final String v2 = "Client 137"; // const-string v2, "Client 137"
(( java.lang.StringBuilder ) v1 ).append ( v2 ); // invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( org.apache.http.client.ClientProtocolException ) v0 ).getMessage ( ); // invoke-virtual {v0}, Lorg/apache/http/client/ClientProtocolException;->getMessage()Ljava/lang/String;
(( java.lang.StringBuilder ) v1 ).append ( v0 ); // invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v0 ).toString ( ); // invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
android.util.Log .w ( v8,v0 );
/* move v0, v6 */
/* :catch_1 */
/* move-exception v0 */
(( java.io.IOException ) v0 ).printStackTrace ( ); // invoke-virtual {v0}, Ljava/io/IOException;->printStackTrace()V
final String v1 = "ssc"; // const-string v1, "ssc"
/* new-instance v1, Ljava/lang/StringBuilder; */
/* invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V */
final String v2 = "IO 137"; // const-string v2, "IO 137"
(( java.lang.StringBuilder ) v1 ).append ( v2 ); // invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.io.IOException ) v0 ).getMessage ( ); // invoke-virtual {v0}, Ljava/io/IOException;->getMessage()Ljava/lang/String;
(( java.lang.StringBuilder ) v1 ).append ( v0 ); // invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v0 ).toString ( ); // invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
android.util.Log .w ( v8,v0 );
/* move v0, v6 */
/* :catch_2 */
/* move-exception v0 */
final String v1 = "ssc"; // const-string v1, "ssc"
/* new-instance v1, Ljava/lang/StringBuilder; */
/* invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V */
final String v2 = "E 137"; // const-string v2, "E 137"
(( java.lang.StringBuilder ) v1 ).append ( v2 ); // invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.Exception ) v0 ).getMessage ( ); // invoke-virtual {v0}, Ljava/lang/Exception;->getMessage()Ljava/lang/String;
(( java.lang.StringBuilder ) v1 ).append ( v0 ); // invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v0 ).toString ( ); // invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
android.util.Log .w ( v8,v0 );
/* move v0, v6 */
} // .end method
