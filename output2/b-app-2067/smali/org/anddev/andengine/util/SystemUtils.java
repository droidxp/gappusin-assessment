public class org.anddev.andengine.util.SystemUtils {
	 /* # static fields */
	 private static final java.lang.String BOGOMIPS_PATTERN;
	 private static final java.lang.String MEMFREE_PATTERN;
	 private static final java.lang.String MEMTOTAL_PATTERN;
	 /* # direct methods */
	 public org.anddev.andengine.util.SystemUtils ( ) {
		 /* .locals 0 */
		 /* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
		 return;
	 } // .end method
	 public static Float getCPUBogoMips ( ) {
		 /* .locals 3 */
		 final String v0 = "/proc/cpuinfo"; // const-string v0, "/proc/cpuinfo"
		 final String v1 = "BogoMIPS[\\s]*:[\\s]*(\\d+\\.\\d+)[\\s]*\n"; // const-string v1, "BogoMIPS[\\s]*:[\\s]*(\\d+\\.\\d+)[\\s]*\n"
		 /* const/16 v2, 0x3e8 */
		 org.anddev.andengine.util.SystemUtils .matchSystemFile ( v0,v1,v2 );
			 v1 = 		 try { // :try_start_0
			 /* if-lez v1, :cond_0 */
			 int v1 = 1; // const/4 v1, 0x1
			 v0 = 			 java.lang.Float .parseFloat ( v0 );
		 } // :cond_0
		 /* new-instance v0, Lorg/anddev/andengine/util/SystemUtils$SystemUtilsException; */
		 /* invoke-direct {v0}, Lorg/anddev/andengine/util/SystemUtils$SystemUtilsException;-><init>()V */
		 /* throw v0 */
		 /* :try_end_0 */
		 /* .catch Ljava/lang/NumberFormatException; {:try_start_0 ..:try_end_0} :catch_0 */
		 /* :catch_0 */
		 /* move-exception v0 */
		 /* new-instance v1, Lorg/anddev/andengine/util/SystemUtils$SystemUtilsException; */
		 /* invoke-direct {v1, v0}, Lorg/anddev/andengine/util/SystemUtils$SystemUtilsException;-><init>(Ljava/lang/Throwable;)V */
		 /* throw v1 */
	 } // .end method
	 public static Integer getCPUFrequencyCurrent ( ) {
		 /* .locals 1 */
		 final String v0 = "/sys/devices/system/cpu/cpu0/cpufreq/scaling_cur_freq"; // const-string v0, "/sys/devices/system/cpu/cpu0/cpufreq/scaling_cur_freq"
		 v0 = 		 org.anddev.andengine.util.SystemUtils .readSystemFileAsInt ( v0 );
	 } // .end method
	 public static Integer getCPUFrequencyMax ( ) {
		 /* .locals 1 */
		 final String v0 = "/sys/devices/system/cpu/cpu0/cpufreq/cpuinfo_max_freq"; // const-string v0, "/sys/devices/system/cpu/cpu0/cpufreq/cpuinfo_max_freq"
		 v0 = 		 org.anddev.andengine.util.SystemUtils .readSystemFileAsInt ( v0 );
	 } // .end method
	 public static Integer getCPUFrequencyMaxScaling ( ) {
		 /* .locals 1 */
		 final String v0 = "/sys/devices/system/cpu/cpu0/cpufreq/scaling_max_freq"; // const-string v0, "/sys/devices/system/cpu/cpu0/cpufreq/scaling_max_freq"
		 v0 = 		 org.anddev.andengine.util.SystemUtils .readSystemFileAsInt ( v0 );
	 } // .end method
	 public static Integer getCPUFrequencyMin ( ) {
		 /* .locals 1 */
		 final String v0 = "/sys/devices/system/cpu/cpu0/cpufreq/cpuinfo_min_freq"; // const-string v0, "/sys/devices/system/cpu/cpu0/cpufreq/cpuinfo_min_freq"
		 v0 = 		 org.anddev.andengine.util.SystemUtils .readSystemFileAsInt ( v0 );
	 } // .end method
	 public static Integer getCPUFrequencyMinScaling ( ) {
		 /* .locals 1 */
		 final String v0 = "/sys/devices/system/cpu/cpu0/cpufreq/scaling_min_freq"; // const-string v0, "/sys/devices/system/cpu/cpu0/cpufreq/scaling_min_freq"
		 v0 = 		 org.anddev.andengine.util.SystemUtils .readSystemFileAsInt ( v0 );
	 } // .end method
	 public static Integer getMemoryFree ( ) {
		 /* .locals 3 */
		 final String v0 = "/proc/meminfo"; // const-string v0, "/proc/meminfo"
		 final String v1 = "MemFree[\\s]*:[\\s]*(\\d+)[\\s]*kB\n"; // const-string v1, "MemFree[\\s]*:[\\s]*(\\d+)[\\s]*kB\n"
		 /* const/16 v2, 0x3e8 */
		 org.anddev.andengine.util.SystemUtils .matchSystemFile ( v0,v1,v2 );
			 v1 = 		 try { // :try_start_0
			 /* if-lez v1, :cond_0 */
			 int v1 = 1; // const/4 v1, 0x1
			 v0 = 			 java.lang.Integer .parseInt ( v0 );
		 } // :cond_0
		 /* new-instance v0, Lorg/anddev/andengine/util/SystemUtils$SystemUtilsException; */
		 /* invoke-direct {v0}, Lorg/anddev/andengine/util/SystemUtils$SystemUtilsException;-><init>()V */
		 /* throw v0 */
		 /* :try_end_0 */
		 /* .catch Ljava/lang/NumberFormatException; {:try_start_0 ..:try_end_0} :catch_0 */
		 /* :catch_0 */
		 /* move-exception v0 */
		 /* new-instance v1, Lorg/anddev/andengine/util/SystemUtils$SystemUtilsException; */
		 /* invoke-direct {v1, v0}, Lorg/anddev/andengine/util/SystemUtils$SystemUtilsException;-><init>(Ljava/lang/Throwable;)V */
		 /* throw v1 */
	 } // .end method
	 public static Integer getMemoryTotal ( ) {
		 /* .locals 3 */
		 final String v0 = "/proc/meminfo"; // const-string v0, "/proc/meminfo"
		 final String v1 = "MemTotal[\\s]*:[\\s]*(\\d+)[\\s]*kB\n"; // const-string v1, "MemTotal[\\s]*:[\\s]*(\\d+)[\\s]*kB\n"
		 /* const/16 v2, 0x3e8 */
		 org.anddev.andengine.util.SystemUtils .matchSystemFile ( v0,v1,v2 );
			 v1 = 		 try { // :try_start_0
			 /* if-lez v1, :cond_0 */
			 int v1 = 1; // const/4 v1, 0x1
			 v0 = 			 java.lang.Integer .parseInt ( v0 );
		 } // :cond_0
		 /* new-instance v0, Lorg/anddev/andengine/util/SystemUtils$SystemUtilsException; */
		 /* invoke-direct {v0}, Lorg/anddev/andengine/util/SystemUtils$SystemUtilsException;-><init>()V */
		 /* throw v0 */
		 /* :try_end_0 */
		 /* .catch Ljava/lang/NumberFormatException; {:try_start_0 ..:try_end_0} :catch_0 */
		 /* :catch_0 */
		 /* move-exception v0 */
		 /* new-instance v1, Lorg/anddev/andengine/util/SystemUtils$SystemUtilsException; */
		 /* invoke-direct {v1, v0}, Lorg/anddev/andengine/util/SystemUtils$SystemUtilsException;-><init>(Ljava/lang/Throwable;)V */
		 /* throw v1 */
	 } // .end method
	 private static android.content.pm.PackageInfo getPackageInfo ( android.content.Context p0 ) {
		 /* .locals 3 */
		 try { // :try_start_0
			 (( android.content.Context ) p0 ).getPackageManager ( ); // invoke-virtual {p0}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;
			 (( android.content.Context ) p0 ).getPackageName ( ); // invoke-virtual {p0}, Landroid/content/Context;->getPackageName()Ljava/lang/String;
			 int v2 = 0; // const/4 v2, 0x0
			 (( android.content.pm.PackageManager ) v0 ).getPackageInfo ( v1, v2 ); // invoke-virtual {v0, v1, v2}, Landroid/content/pm/PackageManager;->getPackageInfo(Ljava/lang/String;I)Landroid/content/pm/PackageInfo;
			 /* :try_end_0 */
			 /* .catch Landroid/content/pm/PackageManager$NameNotFoundException; {:try_start_0 ..:try_end_0} :catch_0 */
		 } // :goto_0
		 /* :catch_0 */
		 /* move-exception v0 */
		 org.anddev.andengine.util.Debug .e ( v0 );
		 int v0 = 0; // const/4 v0, 0x0
	 } // .end method
	 public static Integer getPackageVersionCode ( android.content.Context p0 ) {
		 /* .locals 1 */
		 org.anddev.andengine.util.SystemUtils .getPackageInfo ( p0 );
		 /* iget v0, v0, Landroid/content/pm/PackageInfo;->versionCode:I */
	 } // .end method
	 public static java.lang.String getPackageVersionName ( android.content.Context p0 ) {
		 /* .locals 1 */
		 org.anddev.andengine.util.SystemUtils .getPackageInfo ( p0 );
		 v0 = this.versionName;
	 } // .end method
	 public static Boolean hasSystemFeature ( android.content.Context p0, java.lang.String p1 ) {
		 /* .locals 6 */
		 int v5 = 0; // const/4 v5, 0x0
		 try { // :try_start_0
			 /* const-class v0, Landroid/content/pm/PackageManager; */
			 final String v1 = "hasSystemFeature"; // const-string v1, "hasSystemFeature"
			 int v2 = 1; // const/4 v2, 0x1
			 /* new-array v2, v2, [Ljava/lang/Class; */
			 int v3 = 0; // const/4 v3, 0x0
			 /* const-class v4, Ljava/lang/String; */
			 /* aput-object v4, v2, v3 */
			 (( java.lang.Class ) v0 ).getMethod ( v1, v2 ); // invoke-virtual {v0, v1, v2}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;
			 /* if-nez v0, :cond_0 */
			 /* move v0, v5 */
		 } // :goto_0
	 } // :cond_0
	 (( android.content.Context ) p0 ).getPackageManager ( ); // invoke-virtual {p0}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;
	 int v2 = 1; // const/4 v2, 0x1
	 /* new-array v2, v2, [Ljava/lang/Object; */
	 int v3 = 0; // const/4 v3, 0x0
	 /* aput-object p1, v2, v3 */
	 (( java.lang.reflect.Method ) v0 ).invoke ( v1, v2 ); // invoke-virtual {v0, v1, v2}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
	 /* check-cast p0, Ljava/lang/Boolean; */
	 (( java.lang.Boolean ) p0 ).booleanValue ( ); // invoke-virtual {p0}, Ljava/lang/Boolean;->booleanValue()Z
	 /* :try_end_0 */
	 v0 = 	 /* .catch Ljava/lang/Throwable; {:try_start_0 ..:try_end_0} :catch_0 */
	 /* :catch_0 */
	 /* move-exception v0 */
	 /* move v0, v5 */
} // .end method
public static Boolean isAndroidVersionOrHigher ( Integer p0 ) {
	 /* .locals 1 */
	 v0 = android.os.Build$VERSION.SDK;
	 v0 = 	 java.lang.Integer .parseInt ( v0 );
	 /* if-lt v0, p0, :cond_0 */
	 int v0 = 1; // const/4 v0, 0x1
} // :goto_0
} // :cond_0
int v0 = 0; // const/4 v0, 0x0
} // .end method
private static java.util.regex.MatchResult matchSystemFile ( java.lang.String p0, java.lang.String p1, Integer p2 ) {
/* .locals 8 */
int v6 = 1; // const/4 v6, 0x1
int v5 = 0; // const/4 v5, 0x0
int v0 = 0; // const/4 v0, 0x0
try { // :try_start_0
/* new-instance v1, Ljava/lang/ProcessBuilder; */
int v2 = 2; // const/4 v2, 0x2
/* new-array v2, v2, [Ljava/lang/String; */
int v3 = 0; // const/4 v3, 0x0
final String v4 = "/system/bin/cat"; // const-string v4, "/system/bin/cat"
/* aput-object v4, v2, v3 */
int v3 = 1; // const/4 v3, 0x1
/* aput-object p0, v2, v3 */
/* invoke-direct {v1, v2}, Ljava/lang/ProcessBuilder;-><init>([Ljava/lang/String;)V */
(( java.lang.ProcessBuilder ) v1 ).start ( ); // invoke-virtual {v1}, Ljava/lang/ProcessBuilder;->start()Ljava/lang/Process;
(( java.lang.Process ) v1 ).getInputStream ( ); // invoke-virtual {v1}, Ljava/lang/Process;->getInputStream()Ljava/io/InputStream;
/* :try_end_0 */
/* .catch Ljava/io/IOException; {:try_start_0 ..:try_end_0} :catch_1 */
/* .catchall {:try_start_0 ..:try_end_0} :catchall_1 */
try { // :try_start_1
	 /* new-instance v1, Ljava/util/Scanner; */
	 /* invoke-direct {v1, v0}, Ljava/util/Scanner;-><init>(Ljava/io/InputStream;)V */
	 (( java.util.Scanner ) v1 ).findWithinHorizon ( p1, p2 ); // invoke-virtual {v1, p1, p2}, Ljava/util/Scanner;->findWithinHorizon(Ljava/lang/String;I)Ljava/lang/String;
	 if ( v2 != null) { // if-eqz v2, :cond_0
		 /* move v2, v6 */
	 } // :goto_0
	 if ( v2 != null) { // if-eqz v2, :cond_1
		 (( java.util.Scanner ) v1 ).match ( ); // invoke-virtual {v1}, Ljava/util/Scanner;->match()Ljava/util/regex/MatchResult;
		 /* :try_end_1 */
		 /* .catch Ljava/io/IOException; {:try_start_1 ..:try_end_1} :catch_0 */
		 /* .catchall {:try_start_1 ..:try_end_1} :catchall_2 */
		 org.anddev.andengine.util.StreamUtils .close ( v0 );
	 } // :cond_0
	 /* move v2, v5 */
} // :cond_1
try { // :try_start_2
	 /* new-instance v1, Lorg/anddev/andengine/util/SystemUtils$SystemUtilsException; */
	 /* invoke-direct {v1}, Lorg/anddev/andengine/util/SystemUtils$SystemUtilsException;-><init>()V */
	 /* throw v1 */
	 /* :try_end_2 */
	 /* .catch Ljava/io/IOException; {:try_start_2 ..:try_end_2} :catch_0 */
	 /* .catchall {:try_start_2 ..:try_end_2} :catchall_2 */
	 /* :catch_0 */
	 /* move-exception v1 */
	 /* move-object v7, v1 */
	 /* move-object v1, v0 */
	 /* move-object v0, v7 */
} // :goto_1
try { // :try_start_3
	 /* new-instance v2, Lorg/anddev/andengine/util/SystemUtils$SystemUtilsException; */
	 /* invoke-direct {v2, v0}, Lorg/anddev/andengine/util/SystemUtils$SystemUtilsException;-><init>(Ljava/lang/Throwable;)V */
	 /* throw v2 */
	 /* :try_end_3 */
	 /* .catchall {:try_start_3 ..:try_end_3} :catchall_0 */
	 /* :catchall_0 */
	 /* move-exception v0 */
} // :goto_2
org.anddev.andengine.util.StreamUtils .close ( v1 );
/* throw v0 */
/* :catchall_1 */
/* move-exception v1 */
/* move-object v7, v1 */
/* move-object v1, v0 */
/* move-object v0, v7 */
/* :catchall_2 */
/* move-exception v1 */
/* move-object v7, v1 */
/* move-object v1, v0 */
/* move-object v0, v7 */
/* :catch_1 */
/* move-exception v1 */
/* move-object v7, v1 */
/* move-object v1, v0 */
/* move-object v0, v7 */
} // .end method
private static Integer readSystemFileAsInt ( java.lang.String p0 ) {
/* .locals 6 */
int v0 = 0; // const/4 v0, 0x0
try { // :try_start_0
	 /* new-instance v1, Ljava/lang/ProcessBuilder; */
	 int v2 = 2; // const/4 v2, 0x2
	 /* new-array v2, v2, [Ljava/lang/String; */
	 int v3 = 0; // const/4 v3, 0x0
	 final String v4 = "/system/bin/cat"; // const-string v4, "/system/bin/cat"
	 /* aput-object v4, v2, v3 */
	 int v3 = 1; // const/4 v3, 0x1
	 /* aput-object p0, v2, v3 */
	 /* invoke-direct {v1, v2}, Ljava/lang/ProcessBuilder;-><init>([Ljava/lang/String;)V */
	 (( java.lang.ProcessBuilder ) v1 ).start ( ); // invoke-virtual {v1}, Ljava/lang/ProcessBuilder;->start()Ljava/lang/Process;
	 (( java.lang.Process ) v1 ).getInputStream ( ); // invoke-virtual {v1}, Ljava/lang/Process;->getInputStream()Ljava/io/InputStream;
	 /* :try_end_0 */
	 /* .catch Ljava/io/IOException; {:try_start_0 ..:try_end_0} :catch_0 */
	 /* .catch Ljava/lang/NumberFormatException; {:try_start_0 ..:try_end_0} :catch_1 */
	 /* .catchall {:try_start_0 ..:try_end_0} :catchall_1 */
	 try { // :try_start_1
		 org.anddev.andengine.util.StreamUtils .readFully ( v0 );
		 java.lang.Integer .parseInt ( v1 );
		 /* :try_end_1 */
		 /* .catch Ljava/io/IOException; {:try_start_1 ..:try_end_1} :catch_3 */
		 /* .catch Ljava/lang/NumberFormatException; {:try_start_1 ..:try_end_1} :catch_2 */
		 v1 = 		 /* .catchall {:try_start_1 ..:try_end_1} :catchall_2 */
		 org.anddev.andengine.util.StreamUtils .close ( v0 );
		 /* :catch_0 */
		 /* move-exception v1 */
		 /* move-object v5, v1 */
		 /* move-object v1, v0 */
		 /* move-object v0, v5 */
	 } // :goto_0
	 try { // :try_start_2
		 /* new-instance v2, Lorg/anddev/andengine/util/SystemUtils$SystemUtilsException; */
		 /* invoke-direct {v2, v0}, Lorg/anddev/andengine/util/SystemUtils$SystemUtilsException;-><init>(Ljava/lang/Throwable;)V */
		 /* throw v2 */
		 /* :try_end_2 */
		 /* .catchall {:try_start_2 ..:try_end_2} :catchall_0 */
		 /* :catchall_0 */
		 /* move-exception v0 */
	 } // :goto_1
	 org.anddev.andengine.util.StreamUtils .close ( v1 );
	 /* throw v0 */
	 /* :catch_1 */
	 /* move-exception v1 */
	 /* move-object v5, v1 */
	 /* move-object v1, v0 */
	 /* move-object v0, v5 */
} // :goto_2
try { // :try_start_3
	 /* new-instance v2, Lorg/anddev/andengine/util/SystemUtils$SystemUtilsException; */
	 /* invoke-direct {v2, v0}, Lorg/anddev/andengine/util/SystemUtils$SystemUtilsException;-><init>(Ljava/lang/Throwable;)V */
	 /* throw v2 */
	 /* :try_end_3 */
	 /* .catchall {:try_start_3 ..:try_end_3} :catchall_0 */
	 /* :catchall_1 */
	 /* move-exception v1 */
	 /* move-object v5, v1 */
	 /* move-object v1, v0 */
	 /* move-object v0, v5 */
	 /* :catchall_2 */
	 /* move-exception v1 */
	 /* move-object v5, v1 */
	 /* move-object v1, v0 */
	 /* move-object v0, v5 */
	 /* :catch_2 */
	 /* move-exception v1 */
	 /* move-object v5, v1 */
	 /* move-object v1, v0 */
	 /* move-object v0, v5 */
	 /* :catch_3 */
	 /* move-exception v1 */
	 /* move-object v5, v1 */
	 /* move-object v1, v0 */
	 /* move-object v0, v5 */
} // .end method
