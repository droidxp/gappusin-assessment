class com.wiyun.engine.utils.ImagePicker {
	 /* # static fields */
	 static Integer sCallback;
	 static Integer sData;
	 /* # direct methods */
	 com.wiyun.engine.utils.ImagePicker ( ) {
		 /* .locals 0 */
		 /* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
		 return;
	 } // .end method
	 private static java.lang.String FEATURE_CAMERA ( ) {
		 /* .locals 2 */
		 try { // :try_start_0
			 /* const-class v0, Landroid/content/pm/PackageManager; */
			 final String v1 = "FEATURE_CAMERA"; // const-string v1, "FEATURE_CAMERA"
			 (( java.lang.Class ) v0 ).getField ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/Class;->getField(Ljava/lang/String;)Ljava/lang/reflect/Field;
			 int v1 = 0; // const/4 v1, 0x0
			 (( java.lang.reflect.Field ) v0 ).get ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/reflect/Field;->get(Ljava/lang/Object;)Ljava/lang/Object;
			 /* check-cast v0, Ljava/lang/String; */
			 /* :try_end_0 */
			 /* .catch Ljava/lang/Exception; {:try_start_0 ..:try_end_0} :catch_0 */
		 } // :goto_0
		 /* :catch_0 */
		 /* move-exception v0 */
		 final String v0 = ""; // const-string v0, ""
	 } // .end method
	 private static java.lang.String FEATURE_CAMERA_FRONT ( ) {
		 /* .locals 2 */
		 try { // :try_start_0
			 /* const-class v0, Landroid/content/pm/PackageManager; */
			 final String v1 = "FEATURE_CAMERA_FRONT"; // const-string v1, "FEATURE_CAMERA_FRONT"
			 (( java.lang.Class ) v0 ).getField ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/Class;->getField(Ljava/lang/String;)Ljava/lang/reflect/Field;
			 int v1 = 0; // const/4 v1, 0x0
			 (( java.lang.reflect.Field ) v0 ).get ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/reflect/Field;->get(Ljava/lang/Object;)Ljava/lang/Object;
			 /* check-cast v0, Ljava/lang/String; */
			 /* :try_end_0 */
			 /* .catch Ljava/lang/Exception; {:try_start_0 ..:try_end_0} :catch_0 */
		 } // :goto_0
		 /* :catch_0 */
		 /* move-exception v0 */
		 final String v0 = ""; // const-string v0, ""
	 } // .end method
	 public static Boolean hasCamera ( ) {
		 /* .locals 3 */
		 int v0 = 0; // const/4 v0, 0x0
		 /* const/16 v2, 0x8 */
		 /* if-le v1, v2, :cond_1 */
		 com.wiyun.engine.utils.ImagePicker .FEATURE_CAMERA ( );
		 v0 = 		 com.wiyun.engine.utils.ImagePicker .hasSystemFeature ( v0 );
	 } // :cond_0
} // :goto_0
} // :cond_1
int v1 = 0; // const/4 v1, 0x0
try { // :try_start_0
android.hardware.Camera .open ( );
/* :try_end_0 */
/* .catch Ljava/lang/Exception; {:try_start_0 ..:try_end_0} :catch_1 */
/* .catchall {:try_start_0 ..:try_end_0} :catchall_0 */
if ( v1 != null) { // if-eqz v1, :cond_2
	 int v0 = 1; // const/4 v0, 0x1
} // :cond_2
if ( v1 != null) { // if-eqz v1, :cond_0
	 try { // :try_start_1
		 (( android.hardware.Camera ) v1 ).release ( ); // invoke-virtual {v1}, Landroid/hardware/Camera;->release()V
		 /* :try_end_1 */
		 /* .catch Ljava/lang/Exception; {:try_start_1 ..:try_end_1} :catch_0 */
		 /* :catch_0 */
		 /* move-exception v1 */
		 /* :catch_1 */
		 /* move-exception v2 */
		 if ( v1 != null) { // if-eqz v1, :cond_0
			 try { // :try_start_2
				 (( android.hardware.Camera ) v1 ).release ( ); // invoke-virtual {v1}, Landroid/hardware/Camera;->release()V
				 /* :try_end_2 */
				 /* .catch Ljava/lang/Exception; {:try_start_2 ..:try_end_2} :catch_2 */
				 /* :catch_2 */
				 /* move-exception v1 */
				 /* :catchall_0 */
				 /* move-exception v0 */
				 if ( v1 != null) { // if-eqz v1, :cond_3
					 try { // :try_start_3
						 (( android.hardware.Camera ) v1 ).release ( ); // invoke-virtual {v1}, Landroid/hardware/Camera;->release()V
						 /* :try_end_3 */
						 /* .catch Ljava/lang/Exception; {:try_start_3 ..:try_end_3} :catch_3 */
					 } // :cond_3
				 } // :goto_1
				 /* throw v0 */
				 /* :catch_3 */
				 /* move-exception v1 */
			 } // .end method
			 public static Boolean hasFrontCamera ( ) {
				 /* .locals 2 */
				 /* const/16 v1, 0x8 */
				 /* if-le v0, v1, :cond_0 */
				 com.wiyun.engine.utils.ImagePicker .FEATURE_CAMERA_FRONT ( );
				 v0 = 				 com.wiyun.engine.utils.ImagePicker .hasSystemFeature ( v0 );
			 } // :goto_0
		 } // :cond_0
		 int v0 = 0; // const/4 v0, 0x0
	 } // .end method
	 private static Boolean hasSystemFeature ( java.lang.String p0 ) {
		 /* .locals 7 */
		 int v1 = 0; // const/4 v1, 0x0
		 try { // :try_start_0
			 com.wiyun.engine.nodes.Director .getInstance ( );
			 (( com.wiyun.engine.nodes.Director ) v0 ).getContext ( ); // invoke-virtual {v0}, Lcom/wiyun/engine/nodes/Director;->getContext()Landroid/content/Context;
			 /* if-nez v0, :cond_0 */
			 /* move v0, v1 */
		 } // :goto_0
	 } // :cond_0
	 (( android.content.Context ) v0 ).getPackageManager ( ); // invoke-virtual {v0}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;
	 /* const-class v2, Landroid/content/pm/PackageManager; */
	 final String v3 = "hasSystemFeature"; // const-string v3, "hasSystemFeature"
	 int v4 = 1; // const/4 v4, 0x1
	 /* new-array v4, v4, [Ljava/lang/Class; */
	 int v5 = 0; // const/4 v5, 0x0
	 /* const-class v6, Ljava/lang/String; */
	 /* aput-object v6, v4, v5 */
	 (( java.lang.Class ) v2 ).getMethod ( v3, v4 ); // invoke-virtual {v2, v3, v4}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;
	 int v3 = 1; // const/4 v3, 0x1
	 /* new-array v3, v3, [Ljava/lang/Object; */
	 int v4 = 0; // const/4 v4, 0x0
	 /* aput-object p0, v3, v4 */
	 (( java.lang.reflect.Method ) v2 ).invoke ( v0, v3 ); // invoke-virtual {v2, v0, v3}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
	 /* check-cast v0, Ljava/lang/Boolean; */
	 (( java.lang.Boolean ) v0 ).booleanValue ( ); // invoke-virtual {v0}, Ljava/lang/Boolean;->booleanValue()Z
	 /* :try_end_0 */
	 v0 = 	 /* .catch Ljava/lang/Exception; {:try_start_0 ..:try_end_0} :catch_0 */
	 /* :catch_0 */
	 /* move-exception v0 */
	 /* move v0, v1 */
} // .end method
static void pickFromAlbum ( Integer p0, Integer p1, Integer p2, Integer p3, Boolean p4 ) {
	 /* .locals 4 */
	 com.wiyun.engine.nodes.Director .getInstance ( );
	 (( com.wiyun.engine.nodes.Director ) v0 ).getContext ( ); // invoke-virtual {v0}, Lcom/wiyun/engine/nodes/Director;->getContext()Landroid/content/Context;
	 /* if-nez v0, :cond_0 */
} // :goto_0
return;
} // :cond_0
/* new-instance v1, Landroid/content/Intent; */
/* const-class v2, Lcom/wiyun/engine/utils/ImagePickerActivity; */
/* invoke-direct {v1, v0, v2}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V */
final String v2 = "from_camera"; // const-string v2, "from_camera"
int v3 = 0; // const/4 v3, 0x0
(( android.content.Intent ) v1 ).putExtra ( v2, v3 ); // invoke-virtual {v1, v2, v3}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Z)Landroid/content/Intent;
final String v2 = "exp_width"; // const-string v2, "exp_width"
(( android.content.Intent ) v1 ).putExtra ( v2, p2 ); // invoke-virtual {v1, v2, p2}, Landroid/content/Intent;->putExtra(Ljava/lang/String;I)Landroid/content/Intent;
final String v2 = "exp_height"; // const-string v2, "exp_height"
(( android.content.Intent ) v1 ).putExtra ( v2, p3 ); // invoke-virtual {v1, v2, p3}, Landroid/content/Intent;->putExtra(Ljava/lang/String;I)Landroid/content/Intent;
final String v2 = "keep_ratio"; // const-string v2, "keep_ratio"
(( android.content.Intent ) v1 ).putExtra ( v2, p4 ); // invoke-virtual {v1, v2, p4}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Z)Landroid/content/Intent;
try { // :try_start_0
(( android.content.Context ) v0 ).startActivity ( v1 ); // invoke-virtual {v0, v1}, Landroid/content/Context;->startActivity(Landroid/content/Intent;)V
/* :try_end_0 */
/* .catch Ljava/lang/Exception; {:try_start_0 ..:try_end_0} :catch_0 */
/* :catch_0 */
/* move-exception v0 */
} // .end method
static void pickFromCamera ( Integer p0, Integer p1, Integer p2, Integer p3, Boolean p4, Boolean p5 ) {
/* .locals 4 */
com.wiyun.engine.nodes.Director .getInstance ( );
(( com.wiyun.engine.nodes.Director ) v0 ).getContext ( ); // invoke-virtual {v0}, Lcom/wiyun/engine/nodes/Director;->getContext()Landroid/content/Context;
/* if-nez v0, :cond_0 */
} // :goto_0
return;
} // :cond_0
/* new-instance v1, Landroid/content/Intent; */
/* const-class v2, Lcom/wiyun/engine/utils/ImagePickerActivity; */
/* invoke-direct {v1, v0, v2}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V */
final String v2 = "from_camera"; // const-string v2, "from_camera"
int v3 = 1; // const/4 v3, 0x1
(( android.content.Intent ) v1 ).putExtra ( v2, v3 ); // invoke-virtual {v1, v2, v3}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Z)Landroid/content/Intent;
final String v2 = "exp_width"; // const-string v2, "exp_width"
(( android.content.Intent ) v1 ).putExtra ( v2, p2 ); // invoke-virtual {v1, v2, p2}, Landroid/content/Intent;->putExtra(Ljava/lang/String;I)Landroid/content/Intent;
final String v2 = "exp_height"; // const-string v2, "exp_height"
(( android.content.Intent ) v1 ).putExtra ( v2, p3 ); // invoke-virtual {v1, v2, p3}, Landroid/content/Intent;->putExtra(Ljava/lang/String;I)Landroid/content/Intent;
final String v2 = "keep_ratio"; // const-string v2, "keep_ratio"
(( android.content.Intent ) v1 ).putExtra ( v2, p4 ); // invoke-virtual {v1, v2, p4}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Z)Landroid/content/Intent;
final String v2 = "front"; // const-string v2, "front"
(( android.content.Intent ) v1 ).putExtra ( v2, p5 ); // invoke-virtual {v1, v2, p5}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Z)Landroid/content/Intent;
try { // :try_start_0
(( android.content.Context ) v0 ).startActivity ( v1 ); // invoke-virtual {v0, v1}, Landroid/content/Context;->startActivity(Landroid/content/Intent;)V
/* :try_end_0 */
/* .catch Ljava/lang/Exception; {:try_start_0 ..:try_end_0} :catch_0 */
/* :catch_0 */
/* move-exception v0 */
} // .end method
