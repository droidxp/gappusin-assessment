public class de.nurogames.android.ticb.base.core.systemDiagnostic {
	 /* .source "systemDiagnostic.java" */
	 /* # direct methods */
	 public de.nurogames.android.ticb.base.core.systemDiagnostic ( ) {
		 /* .locals 0 */
		 /* .prologue */
		 /* .line 17 */
		 /* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
		 return;
	 } // .end method
	 public static Integer getNumCores ( ) {
		 /* .locals 4 */
		 /* .prologue */
		 /* .line 72 */
		 try { // :try_start_0
			 /* new-instance v0, Ljava/io/File; */
			 final String v3 = "/sys/devices/system/cpu/"; // const-string v3, "/sys/devices/system/cpu/"
			 /* invoke-direct {v0, v3}, Ljava/io/File;-><init>(Ljava/lang/String;)V */
			 /* .line 75 */
			 /* .local v0, "dir":Ljava/io/File; */
			 /* new-instance v3, Lde/nurogames/android/ticb/base/core/systemDiagnostic$1CpuFilter; */
			 /* invoke-direct {v3}, Lde/nurogames/android/ticb/base/core/systemDiagnostic$1CpuFilter;-><init>()V */
			 (( java.io.File ) v0 ).listFiles ( v3 ); // invoke-virtual {v0, v3}, Ljava/io/File;->listFiles(Ljava/io/FileFilter;)[Ljava/io/File;
			 /* .line 78 */
			 /* .local v2, "files":[Ljava/io/File; */
			 /* array-length v3, v2 */
			 /* :try_end_0 */
			 /* .catch Ljava/lang/Exception; {:try_start_0 ..:try_end_0} :catch_0 */
			 /* .line 81 */
		 } // .end local v2 # "files":[Ljava/io/File;
	 } // :goto_0
	 /* :catch_0 */
	 /* move-exception v1 */
	 /* .local v1, "e":Ljava/lang/Exception; */
	 int v3 = 1; // const/4 v3, 0x1
} // .end method
public static java.lang.String readCPUinfo ( ) {
	 /* .locals 11 */
	 /* .prologue */
	 int v8 = 1; // const/4 v8, 0x1
	 int v10 = 0; // const/4 v10, 0x0
	 /* .line 93 */
	 /* new-array v7, v8, [Ljava/lang/String; */
	 final String v8 = "no data"; // const-string v8, "no data"
	 /* aput-object v8, v7, v10 */
	 /* .line 94 */
	 /* .local v7, "results":[Ljava/lang/String; */
	 int v4 = 0; // const/4 v4, 0x0
	 /* .line 98 */
	 /* .local v4, "line":I */
	 int v8 = 2; // const/4 v8, 0x2
	 try { // :try_start_0
		 /* new-array v0, v8, [Ljava/lang/String; */
		 int v8 = 0; // const/4 v8, 0x0
		 final String v9 = "/system/bin/cat"; // const-string v9, "/system/bin/cat"
		 /* aput-object v9, v0, v8 */
		 int v8 = 1; // const/4 v8, 0x1
		 final String v9 = "/proc/cpuinfo"; // const-string v9, "/proc/cpuinfo"
		 /* aput-object v9, v0, v8 */
		 /* .line 99 */
		 /* .local v0, "args":[Ljava/lang/String; */
		 /* new-instance v1, Ljava/lang/ProcessBuilder; */
		 /* invoke-direct {v1, v0}, Ljava/lang/ProcessBuilder;-><init>([Ljava/lang/String;)V */
		 /* .line 101 */
		 /* .local v1, "cmd":Ljava/lang/ProcessBuilder; */
		 (( java.lang.ProcessBuilder ) v1 ).start ( ); // invoke-virtual {v1}, Ljava/lang/ProcessBuilder;->start()Ljava/lang/Process;
		 /* .line 102 */
		 /* .local v5, "process":Ljava/lang/Process; */
		 (( java.lang.Process ) v5 ).getInputStream ( ); // invoke-virtual {v5}, Ljava/lang/Process;->getInputStream()Ljava/io/InputStream;
		 /* .line 104 */
		 /* .local v3, "in":Ljava/io/InputStream; */
		 /* const/16 v8, 0x400 */
		 /* new-array v6, v8, [B */
		 /* .line 105 */
		 /* .local v6, "re":[B */
	 } // :goto_0
	 v8 = 	 (( java.io.InputStream ) v3 ).read ( v6 ); // invoke-virtual {v3, v6}, Ljava/io/InputStream;->read([B)I
	 int v9 = -1; // const/4 v9, -0x1
	 /* if-ne v8, v9, :cond_0 */
	 /* .line 111 */
	 (( java.io.InputStream ) v3 ).close ( ); // invoke-virtual {v3}, Ljava/io/InputStream;->close()V
	 /* :try_end_0 */
	 /* .catch Ljava/io/IOException; {:try_start_0 ..:try_end_0} :catch_0 */
	 /* .line 116 */
} // .end local v0 # "args":[Ljava/lang/String;
} // .end local v1 # "cmd":Ljava/lang/ProcessBuilder;
} // .end local v3 # "in":Ljava/io/InputStream;
} // .end local v5 # "process":Ljava/lang/Process;
} // .end local v6 # "re":[B
} // :goto_1
/* aget-object v8, v7, v10 */
/* .line 107 */
/* .restart local v0 # "args":[Ljava/lang/String; */
/* .restart local v1 # "cmd":Ljava/lang/ProcessBuilder; */
/* .restart local v3 # "in":Ljava/io/InputStream; */
/* .restart local v5 # "process":Ljava/lang/Process; */
/* .restart local v6 # "re":[B */
} // :cond_0
try { // :try_start_1
/* new-instance v8, Ljava/lang/String; */
/* invoke-direct {v8, v6}, Ljava/lang/String;-><init>([B)V */
/* aput-object v8, v7, v4 */
/* :try_end_1 */
/* .catch Ljava/io/IOException; {:try_start_1 ..:try_end_1} :catch_0 */
/* .line 108 */
/* add-int/lit8 v4, v4, 0x1 */
/* .line 114 */
} // .end local v0 # "args":[Ljava/lang/String;
} // .end local v1 # "cmd":Ljava/lang/ProcessBuilder;
} // .end local v3 # "in":Ljava/io/InputStream;
} // .end local v5 # "process":Ljava/lang/Process;
} // .end local v6 # "re":[B
/* :catch_0 */
/* move-exception v2 */
/* .local v2, "ex":Ljava/io/IOException; */
(( java.io.IOException ) v2 ).printStackTrace ( ); // invoke-virtual {v2}, Ljava/io/IOException;->printStackTrace()V
} // .end method
/* # virtual methods */
public Boolean detectInternet ( ) {
/* .locals 5 */
/* .prologue */
int v2 = 0; // const/4 v2, 0x0
/* .line 37 */
v1 = de.nurogames.android.ticb.base.tinysanta.cntx;
final String v3 = "connectivity"; // const-string v3, "connectivity"
(( android.content.Context ) v1 ).getSystemService ( v3 ); // invoke-virtual {v1, v3}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;
/* check-cast v1, Landroid/net/ConnectivityManager; */
(( android.net.ConnectivityManager ) v1 ).getActiveNetworkInfo ( ); // invoke-virtual {v1}, Landroid/net/ConnectivityManager;->getActiveNetworkInfo()Landroid/net/NetworkInfo;
/* .line 38 */
/* .local v0, "info":Landroid/net/NetworkInfo; */
if ( v0 != null) { // if-eqz v0, :cond_0
v1 = (( android.net.NetworkInfo ) v0 ).isConnected ( ); // invoke-virtual {v0}, Landroid/net/NetworkInfo;->isConnected()Z
/* if-nez v1, :cond_1 */
/* .line 39 */
} // :cond_0
v1 = de.nurogames.android.ticb.base.tinysanta.cntx;
v3 = de.nurogames.android.ticb.base.core.AppResources.TEXT_INETCONN_START;
int v4 = 2; // const/4 v4, 0x2
/* aget-object v3, v3, v4 */
android.widget.Toast .makeText ( v1,v3,v2 );
(( android.widget.Toast ) v1 ).show ( ); // invoke-virtual {v1}, Landroid/widget/Toast;->show()V
/* .line 41 */
} // :cond_1
/* if-nez v0, :cond_2 */
/* move v1, v2 */
/* .line 44 */
} // :goto_0
} // :cond_2
v1 = (( android.net.NetworkInfo ) v0 ).isConnected ( ); // invoke-virtual {v0}, Landroid/net/NetworkInfo;->isConnected()Z
} // .end method
public Boolean detectSDCard ( ) {
/* .locals 4 */
/* .prologue */
/* .line 25 */
/* new-instance v0, Ljava/io/File; */
android.os.Environment .getExternalStorageDirectory ( );
(( java.io.File ) v1 ).getPath ( ); // invoke-virtual {v1}, Ljava/io/File;->getPath()Ljava/lang/String;
final String v2 = "/dcim/"; // const-string v2, "/dcim/"
/* invoke-direct {v0, v1, v2}, Ljava/io/File;-><init>(Ljava/lang/String;Ljava/lang/String;)V */
/* .line 26 */
/* .local v0, "test_sd":Ljava/io/File; */
v1 = (( java.io.File ) v0 ).exists ( ); // invoke-virtual {v0}, Ljava/io/File;->exists()Z
/* if-nez v1, :cond_0 */
/* .line 27 */
v1 = de.nurogames.android.ticb.base.tinysanta.cntx;
v2 = de.nurogames.android.ticb.base.core.AppResources.TEXT_NOSDCARD_START;
int v3 = 0; // const/4 v3, 0x0
/* aget-object v2, v2, v3 */
int v3 = 1; // const/4 v3, 0x1
android.widget.Toast .makeText ( v1,v2,v3 );
(( android.widget.Toast ) v1 ).show ( ); // invoke-virtual {v1}, Landroid/widget/Toast;->show()V
/* .line 28 */
} // :cond_0
v1 = (( java.io.File ) v0 ).exists ( ); // invoke-virtual {v0}, Ljava/io/File;->exists()Z
} // .end method
