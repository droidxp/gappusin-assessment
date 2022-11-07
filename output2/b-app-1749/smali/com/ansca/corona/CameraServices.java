public class com.ansca.corona.CameraServices {
	 /* .source "CameraServices.java" */
	 /* # direct methods */
	 private com.ansca.corona.CameraServices ( ) {
		 /* .locals 0 */
		 /* .prologue */
		 /* .line 10 */
		 /* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
		 /* .line 11 */
		 return;
	 } // .end method
	 public static Integer getCameraCount ( ) {
		 /* .locals 6 */
		 /* .prologue */
		 /* .line 71 */
		 int v0 = 0; // const/4 v0, 0x0
		 /* .line 78 */
		 /* .local v0, "cameraCount":I */
		 try { // :try_start_0
			 v3 = 			 com.ansca.corona.CameraServices .hasCamera ( );
			 if ( v3 != null) { // if-eqz v3, :cond_0
				 /* .line 79 */
				 /* const-class v3, Landroid/hardware/Camera; */
				 final String v4 = "getNumberOfCameras"; // const-string v4, "getNumberOfCameras"
				 int v5 = 0; // const/4 v5, 0x0
				 /* new-array v5, v5, [Ljava/lang/Class; */
				 (( java.lang.Class ) v3 ).getMethod ( v4, v5 ); // invoke-virtual {v3, v4, v5}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;
				 /* .line 81 */
				 /* .local v1, "getNumberOfCamerasMethod":Ljava/lang/reflect/Method; */
				 int v3 = 0; // const/4 v3, 0x0
				 int v4 = 0; // const/4 v4, 0x0
				 /* new-array v4, v4, [Ljava/lang/Object; */
				 (( java.lang.reflect.Method ) v1 ).invoke ( v3, v4 ); // invoke-virtual {v1, v3, v4}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
				 /* check-cast v2, Ljava/lang/Integer; */
				 /* .line 82 */
				 /* .local v2, "result":Ljava/lang/Integer; */
				 (( java.lang.Integer ) v2 ).intValue ( ); // invoke-virtual {v2}, Ljava/lang/Integer;->intValue()I
				 /* :try_end_0 */
				 v0 = 				 /* .catch Ljava/lang/Exception; {:try_start_0 ..:try_end_0} :catch_0 */
				 /* .line 88 */
			 } // .end local v1 # "getNumberOfCamerasMethod":Ljava/lang/reflect/Method;
		 } // .end local v2 # "result":Ljava/lang/Integer;
	 } // :cond_0
} // :goto_0
/* .line 85 */
/* :catch_0 */
/* move-exception v3 */
} // .end method
public static Boolean hasCamera ( ) {
/* .locals 1 */
/* .prologue */
/* .line 35 */
v0 = com.ansca.corona.CameraServices .hasRearCamera ( );
/* if-nez v0, :cond_0 */
v0 = com.ansca.corona.CameraServices .hasFrontFacingCamera ( );
if ( v0 != null) { // if-eqz v0, :cond_1
} // :cond_0
int v0 = 1; // const/4 v0, 0x1
} // :goto_0
} // :cond_1
int v0 = 0; // const/4 v0, 0x0
} // .end method
public static Boolean hasFrontFacingCamera ( ) {
/* .locals 4 */
/* .prologue */
/* .line 56 */
int v1 = 0; // const/4 v1, 0x0
/* .line 57 */
/* .local v1, "hasCamera":Z */
com.ansca.corona.CoronaEnvironment .getApplicationContext ( );
/* .line 58 */
/* .local v0, "context":Landroid/content/Context; */
if ( v0 != null) { // if-eqz v0, :cond_0
/* .line 60 */
(( android.content.Context ) v0 ).getPackageManager ( ); // invoke-virtual {v0}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;
final String v3 = "android.hardware.camera.front"; // const-string v3, "android.hardware.camera.front"
v1 = (( android.content.pm.PackageManager ) v2 ).hasSystemFeature ( v3 ); // invoke-virtual {v2, v3}, Landroid/content/pm/PackageManager;->hasSystemFeature(Ljava/lang/String;)Z
/* .line 62 */
} // :cond_0
} // .end method
public static Boolean hasPermission ( ) {
/* .locals 4 */
/* .prologue */
/* .line 18 */
int v1 = 0; // const/4 v1, 0x0
/* .line 20 */
/* .local v1, "hasPermission":Z */
try { // :try_start_0
final String v2 = "android.permission.CAMERA"; // const-string v2, "android.permission.CAMERA"
/* .line 21 */
/* .local v2, "permissionName":Ljava/lang/String; */
com.ansca.corona.CoronaEnvironment .getApplicationContext ( );
/* .line 22 */
/* .local v0, "context":Landroid/content/Context; */
if ( v0 != null) { // if-eqz v0, :cond_0
/* .line 23 */
(( android.content.Context ) v0 ).checkCallingOrSelfPermission ( v2 ); // invoke-virtual {v0, v2}, Landroid/content/Context;->checkCallingOrSelfPermission(Ljava/lang/String;)I
/* :try_end_0 */
v3 = /* .catch Ljava/lang/Exception; {:try_start_0 ..:try_end_0} :catch_0 */
/* if-nez v3, :cond_1 */
int v1 = 1; // const/4 v1, 0x1
/* .line 27 */
} // .end local v0 # "context":Landroid/content/Context;
} // .end local v2 # "permissionName":Ljava/lang/String;
} // :cond_0
} // :goto_0
/* .line 23 */
/* .restart local v0 # "context":Landroid/content/Context; */
/* .restart local v2 # "permissionName":Ljava/lang/String; */
} // :cond_1
int v1 = 0; // const/4 v1, 0x0
/* .line 26 */
} // .end local v0 # "context":Landroid/content/Context;
} // .end local v2 # "permissionName":Ljava/lang/String;
/* :catch_0 */
/* move-exception v3 */
} // .end method
public static Boolean hasRearCamera ( ) {
/* .locals 4 */
/* .prologue */
/* .line 43 */
int v1 = 0; // const/4 v1, 0x0
/* .line 44 */
/* .local v1, "hasCamera":Z */
com.ansca.corona.CoronaEnvironment .getApplicationContext ( );
/* .line 45 */
/* .local v0, "context":Landroid/content/Context; */
if ( v0 != null) { // if-eqz v0, :cond_0
/* .line 46 */
(( android.content.Context ) v0 ).getPackageManager ( ); // invoke-virtual {v0}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;
final String v3 = "android.hardware.camera"; // const-string v3, "android.hardware.camera"
v1 = (( android.content.pm.PackageManager ) v2 ).hasSystemFeature ( v3 ); // invoke-virtual {v2, v3}, Landroid/content/pm/PackageManager;->hasSystemFeature(Ljava/lang/String;)Z
/* .line 48 */
} // :cond_0
} // .end method
