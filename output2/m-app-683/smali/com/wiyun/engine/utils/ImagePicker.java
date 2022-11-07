class com.wiyun.engine.utils.ImagePicker {
	 /* .source "ImagePicker.java" */
	 /* # static fields */
	 static Integer sCallback;
	 static Integer sData;
	 /* # direct methods */
	 com.wiyun.engine.utils.ImagePicker ( ) {
		 /* .locals 0 */
		 /* .prologue */
		 /* .line 25 */
		 /* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
		 return;
	 } // .end method
	 private static java.lang.String FEATURE_CAMERA ( ) {
		 /* .locals 4 */
		 /* .prologue */
		 /* .line 86 */
		 try { // :try_start_0
			 /* const-class v2, Landroid/content/pm/PackageManager; */
			 final String v3 = "FEATURE_CAMERA"; // const-string v3, "FEATURE_CAMERA"
			 (( java.lang.Class ) v2 ).getField ( v3 ); // invoke-virtual {v2, v3}, Ljava/lang/Class;->getField(Ljava/lang/String;)Ljava/lang/reflect/Field;
			 /* .line 87 */
			 /* .local v1, "f":Ljava/lang/reflect/Field; */
			 int v2 = 0; // const/4 v2, 0x0
			 (( java.lang.reflect.Field ) v1 ).get ( v2 ); // invoke-virtual {v1, v2}, Ljava/lang/reflect/Field;->get(Ljava/lang/Object;)Ljava/lang/Object;
			 /* check-cast v2, Ljava/lang/String; */
			 /* :try_end_0 */
			 /* .catch Ljava/lang/Exception; {:try_start_0 ..:try_end_0} :catch_0 */
			 /* .line 89 */
		 } // :goto_0
		 /* .line 88 */
		 /* :catch_0 */
		 /* move-exception v0 */
		 /* .line 89 */
		 /* .local v0, "e":Ljava/lang/Exception; */
		 final String v2 = ""; // const-string v2, ""
	 } // .end method
	 private static java.lang.String FEATURE_CAMERA_FRONT ( ) {
		 /* .locals 4 */
		 /* .prologue */
		 /* .line 95 */
		 try { // :try_start_0
			 /* const-class v2, Landroid/content/pm/PackageManager; */
			 final String v3 = "FEATURE_CAMERA_FRONT"; // const-string v3, "FEATURE_CAMERA_FRONT"
			 (( java.lang.Class ) v2 ).getField ( v3 ); // invoke-virtual {v2, v3}, Ljava/lang/Class;->getField(Ljava/lang/String;)Ljava/lang/reflect/Field;
			 /* .line 96 */
			 /* .local v1, "f":Ljava/lang/reflect/Field; */
			 int v2 = 0; // const/4 v2, 0x0
			 (( java.lang.reflect.Field ) v1 ).get ( v2 ); // invoke-virtual {v1, v2}, Ljava/lang/reflect/Field;->get(Ljava/lang/Object;)Ljava/lang/Object;
			 /* check-cast v2, Ljava/lang/String; */
			 /* :try_end_0 */
			 /* .catch Ljava/lang/Exception; {:try_start_0 ..:try_end_0} :catch_0 */
			 /* .line 98 */
		 } // :goto_0
		 /* .line 97 */
		 /* :catch_0 */
		 /* move-exception v0 */
		 /* .line 98 */
		 /* .local v0, "e":Ljava/lang/Exception; */
		 final String v2 = ""; // const-string v2, ""
	 } // .end method
	 public static Boolean hasCamera ( ) {
		 /* .locals 5 */
		 /* .prologue */
		 int v2 = 0; // const/4 v2, 0x0
		 /* .line 36 */
		 /* const/16 v4, 0x8 */
		 /* if-le v3, v4, :cond_1 */
		 /* .line 37 */
		 com.wiyun.engine.utils.ImagePicker .FEATURE_CAMERA ( );
		 v2 = 		 com.wiyun.engine.utils.ImagePicker .hasSystemFeature ( v2 );
		 /* .line 44 */
		 /* .local v0, "camera":Landroid/hardware/Camera; */
	 } // :cond_0
} // :goto_0
/* .line 39 */
} // .end local v0 # "camera":Landroid/hardware/Camera;
} // :cond_1
int v0 = 0; // const/4 v0, 0x0
/* .line 41 */
/* .restart local v0 # "camera":Landroid/hardware/Camera; */
try { // :try_start_0
android.hardware.Camera .open ( );
/* :try_end_0 */
/* .catch Ljava/lang/Exception; {:try_start_0 ..:try_end_0} :catch_0 */
/* .catchall {:try_start_0 ..:try_end_0} :catchall_0 */
/* .line 42 */
if ( v0 != null) { // if-eqz v0, :cond_2
int v2 = 1; // const/4 v2, 0x1
/* .line 48 */
} // :cond_2
if ( v0 != null) { // if-eqz v0, :cond_0
/* .line 49 */
try { // :try_start_1
	 (( android.hardware.Camera ) v0 ).release ( ); // invoke-virtual {v0}, Landroid/hardware/Camera;->release()V
	 /* :try_end_1 */
	 /* .catch Ljava/lang/Exception; {:try_start_1 ..:try_end_1} :catch_1 */
	 /* .line 50 */
	 int v0 = 0; // const/4 v0, 0x0
	 /* .line 43 */
	 /* :catch_0 */
	 /* move-exception v1 */
	 /* .line 48 */
	 /* .local v1, "e":Ljava/lang/Exception; */
	 if ( v0 != null) { // if-eqz v0, :cond_0
		 /* .line 49 */
		 try { // :try_start_2
			 (( android.hardware.Camera ) v0 ).release ( ); // invoke-virtual {v0}, Landroid/hardware/Camera;->release()V
			 /* :try_end_2 */
			 /* .catch Ljava/lang/Exception; {:try_start_2 ..:try_end_2} :catch_2 */
			 /* .line 50 */
			 int v0 = 0; // const/4 v0, 0x0
			 /* .line 45 */
		 } // .end local v1 # "e":Ljava/lang/Exception;
		 /* :catchall_0 */
		 /* move-exception v2 */
		 /* .line 48 */
		 if ( v0 != null) { // if-eqz v0, :cond_3
			 /* .line 49 */
			 try { // :try_start_3
				 (( android.hardware.Camera ) v0 ).release ( ); // invoke-virtual {v0}, Landroid/hardware/Camera;->release()V
				 /* :try_end_3 */
				 /* .catch Ljava/lang/Exception; {:try_start_3 ..:try_end_3} :catch_3 */
				 /* .line 50 */
				 int v0 = 0; // const/4 v0, 0x0
				 /* .line 54 */
			 } // :cond_3
		 } // :goto_1
		 /* throw v2 */
		 /* .line 52 */
		 /* :catch_1 */
		 /* move-exception v3 */
		 /* .restart local v1 # "e":Ljava/lang/Exception; */
		 /* :catch_2 */
		 /* move-exception v3 */
	 } // .end local v1 # "e":Ljava/lang/Exception;
	 /* :catch_3 */
	 /* move-exception v3 */
} // .end method
public static Boolean hasFrontCamera ( ) {
	 /* .locals 2 */
	 /* .prologue */
	 /* .line 64 */
	 /* const/16 v1, 0x8 */
	 /* if-le v0, v1, :cond_0 */
	 /* .line 65 */
	 com.wiyun.engine.utils.ImagePicker .FEATURE_CAMERA_FRONT ( );
	 v0 = 	 com.wiyun.engine.utils.ImagePicker .hasSystemFeature ( v0 );
	 /* .line 67 */
} // :goto_0
} // :cond_0
int v0 = 0; // const/4 v0, 0x0
} // .end method
private static Boolean hasSystemFeature ( java.lang.String p0 ) {
/* .locals 10 */
/* .param p0, "feature" # Ljava/lang/String; */
/* .prologue */
int v5 = 0; // const/4 v5, 0x0
/* .line 73 */
try { // :try_start_0
com.wiyun.engine.nodes.Director .getInstance ( );
(( com.wiyun.engine.nodes.Director ) v4 ).getContext ( ); // invoke-virtual {v4}, Lcom/wiyun/engine/nodes/Director;->getContext()Landroid/content/Context;
/* .line 74 */
/* .local v0, "context":Landroid/content/Context; */
/* if-nez v0, :cond_0 */
/* move v4, v5 */
/* .line 80 */
} // .end local v0 # "context":Landroid/content/Context;
} // :goto_0
/* .line 76 */
/* .restart local v0 # "context":Landroid/content/Context; */
} // :cond_0
(( android.content.Context ) v0 ).getPackageManager ( ); // invoke-virtual {v0}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;
/* .line 77 */
/* .local v3, "pm":Landroid/content/pm/PackageManager; */
/* const-class v4, Landroid/content/pm/PackageManager; */
final String v6 = "hasSystemFeature"; // const-string v6, "hasSystemFeature"
int v7 = 1; // const/4 v7, 0x1
/* new-array v7, v7, [Ljava/lang/Class; */
int v8 = 0; // const/4 v8, 0x0
/* const-class v9, Ljava/lang/String; */
/* aput-object v9, v7, v8 */
(( java.lang.Class ) v4 ).getMethod ( v6, v7 ); // invoke-virtual {v4, v6, v7}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;
/* .line 78 */
/* .local v2, "m":Ljava/lang/reflect/Method; */
int v4 = 1; // const/4 v4, 0x1
/* new-array v4, v4, [Ljava/lang/Object; */
int v6 = 0; // const/4 v6, 0x0
/* aput-object p0, v4, v6 */
(( java.lang.reflect.Method ) v2 ).invoke ( v3, v4 ); // invoke-virtual {v2, v3, v4}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
/* check-cast v4, Ljava/lang/Boolean; */
(( java.lang.Boolean ) v4 ).booleanValue ( ); // invoke-virtual {v4}, Ljava/lang/Boolean;->booleanValue()Z
/* :try_end_0 */
v4 = /* .catch Ljava/lang/Exception; {:try_start_0 ..:try_end_0} :catch_0 */
/* .line 79 */
} // .end local v0 # "context":Landroid/content/Context;
} // .end local v2 # "m":Ljava/lang/reflect/Method;
} // .end local v3 # "pm":Landroid/content/pm/PackageManager;
/* :catch_0 */
/* move-exception v1 */
/* .local v1, "e":Ljava/lang/Exception; */
/* move v4, v5 */
/* .line 80 */
} // .end method
static void pickFromAlbum ( Integer p0, Integer p1, Integer p2, Integer p3, Boolean p4 ) {
/* .locals 4 */
/* .param p0, "callback" # I */
/* .param p1, "data" # I */
/* .param p2, "w" # I */
/* .param p3, "h" # I */
/* .param p4, "keepRatio" # Z */
/* .prologue */
/* .line 150 */
com.wiyun.engine.nodes.Director .getInstance ( );
(( com.wiyun.engine.nodes.Director ) v2 ).getContext ( ); // invoke-virtual {v2}, Lcom/wiyun/engine/nodes/Director;->getContext()Landroid/content/Context;
/* .line 151 */
/* .local v0, "context":Landroid/content/Context; */
/* if-nez v0, :cond_0 */
/* .line 170 */
} // :goto_0
return;
/* .line 155 */
} // :cond_0
/* .line 156 */
/* .line 159 */
/* new-instance v1, Landroid/content/Intent; */
/* const-class v2, Lcom/wiyun/engine/utils/ImagePickerActivity; */
/* invoke-direct {v1, v0, v2}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V */
/* .line 160 */
/* .local v1, "intent":Landroid/content/Intent; */
final String v2 = "from_camera"; // const-string v2, "from_camera"
int v3 = 0; // const/4 v3, 0x0
(( android.content.Intent ) v1 ).putExtra ( v2, v3 ); // invoke-virtual {v1, v2, v3}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Z)Landroid/content/Intent;
/* .line 161 */
final String v2 = "exp_width"; // const-string v2, "exp_width"
(( android.content.Intent ) v1 ).putExtra ( v2, p2 ); // invoke-virtual {v1, v2, p2}, Landroid/content/Intent;->putExtra(Ljava/lang/String;I)Landroid/content/Intent;
/* .line 162 */
final String v2 = "exp_height"; // const-string v2, "exp_height"
(( android.content.Intent ) v1 ).putExtra ( v2, p3 ); // invoke-virtual {v1, v2, p3}, Landroid/content/Intent;->putExtra(Ljava/lang/String;I)Landroid/content/Intent;
/* .line 163 */
final String v2 = "keep_ratio"; // const-string v2, "keep_ratio"
(( android.content.Intent ) v1 ).putExtra ( v2, p4 ); // invoke-virtual {v1, v2, p4}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Z)Landroid/content/Intent;
/* .line 167 */
try { // :try_start_0
(( android.content.Context ) v0 ).startActivity ( v1 ); // invoke-virtual {v0, v1}, Landroid/content/Context;->startActivity(Landroid/content/Intent;)V
/* :try_end_0 */
/* .catch Ljava/lang/Exception; {:try_start_0 ..:try_end_0} :catch_0 */
/* .line 168 */
/* :catch_0 */
/* move-exception v2 */
} // .end method
static void pickFromCamera ( Integer p0, Integer p1, Integer p2, Integer p3, Boolean p4, Boolean p5 ) {
/* .locals 4 */
/* .param p0, "callback" # I */
/* .param p1, "data" # I */
/* .param p2, "w" # I */
/* .param p3, "h" # I */
/* .param p4, "keepRatio" # Z */
/* .param p5, "front" # Z */
/* .prologue */
/* .line 115 */
com.wiyun.engine.nodes.Director .getInstance ( );
(( com.wiyun.engine.nodes.Director ) v2 ).getContext ( ); // invoke-virtual {v2}, Lcom/wiyun/engine/nodes/Director;->getContext()Landroid/content/Context;
/* .line 116 */
/* .local v0, "context":Landroid/content/Context; */
/* if-nez v0, :cond_0 */
/* .line 136 */
} // :goto_0
return;
/* .line 120 */
} // :cond_0
/* .line 121 */
/* .line 124 */
/* new-instance v1, Landroid/content/Intent; */
/* const-class v2, Lcom/wiyun/engine/utils/ImagePickerActivity; */
/* invoke-direct {v1, v0, v2}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V */
/* .line 125 */
/* .local v1, "intent":Landroid/content/Intent; */
final String v2 = "from_camera"; // const-string v2, "from_camera"
int v3 = 1; // const/4 v3, 0x1
(( android.content.Intent ) v1 ).putExtra ( v2, v3 ); // invoke-virtual {v1, v2, v3}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Z)Landroid/content/Intent;
/* .line 126 */
final String v2 = "exp_width"; // const-string v2, "exp_width"
(( android.content.Intent ) v1 ).putExtra ( v2, p2 ); // invoke-virtual {v1, v2, p2}, Landroid/content/Intent;->putExtra(Ljava/lang/String;I)Landroid/content/Intent;
/* .line 127 */
final String v2 = "exp_height"; // const-string v2, "exp_height"
(( android.content.Intent ) v1 ).putExtra ( v2, p3 ); // invoke-virtual {v1, v2, p3}, Landroid/content/Intent;->putExtra(Ljava/lang/String;I)Landroid/content/Intent;
/* .line 128 */
final String v2 = "keep_ratio"; // const-string v2, "keep_ratio"
(( android.content.Intent ) v1 ).putExtra ( v2, p4 ); // invoke-virtual {v1, v2, p4}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Z)Landroid/content/Intent;
/* .line 129 */
final String v2 = "front"; // const-string v2, "front"
(( android.content.Intent ) v1 ).putExtra ( v2, p5 ); // invoke-virtual {v1, v2, p5}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Z)Landroid/content/Intent;
/* .line 133 */
try { // :try_start_0
(( android.content.Context ) v0 ).startActivity ( v1 ); // invoke-virtual {v0, v1}, Landroid/content/Context;->startActivity(Landroid/content/Intent;)V
/* :try_end_0 */
/* .catch Ljava/lang/Exception; {:try_start_0 ..:try_end_0} :catch_0 */
/* .line 134 */
/* :catch_0 */
/* move-exception v2 */
} // .end method
