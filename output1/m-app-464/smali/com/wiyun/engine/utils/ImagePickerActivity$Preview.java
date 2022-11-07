class com.wiyun.engine.utils.ImagePickerActivity$Preview extends android.view.SurfaceView implements android.view.SurfaceHolder$Callback {
	 /* # interfaces */
	 /* # instance fields */
	 android.hardware.Camera mCamera;
	 Integer mCameraId;
	 android.view.SurfaceHolder mHolder;
	 final com.wiyun.engine.utils.ImagePickerActivity this$0; //synthetic
	 /* # direct methods */
	 com.wiyun.engine.utils.ImagePickerActivity$Preview ( ) {
		 /* .locals 2 */
		 this.this$0 = p1;
		 /* invoke-direct {p0, p2}, Landroid/view/SurfaceView;-><init>(Landroid/content/Context;)V */
		 (( com.wiyun.engine.utils.ImagePickerActivity$Preview ) p0 ).getHolder ( ); // invoke-virtual {p0}, Lcom/wiyun/engine/utils/ImagePickerActivity$Preview;->getHolder()Landroid/view/SurfaceHolder;
		 this.mHolder = v0;
		 v0 = this.mHolder;
		 v0 = this.mHolder;
		 int v1 = 3; // const/4 v1, 0x3
		 return;
	 } // .end method
	 /* # virtual methods */
	 public void surfaceChanged ( android.view.SurfaceHolder p0, Integer p1, Integer p2, Integer p3 ) {
		 /* .locals 3 */
		 try { // :try_start_0
			 v0 = this.mCamera;
			 (( android.hardware.Camera ) v0 ).getParameters ( ); // invoke-virtual {v0}, Landroid/hardware/Camera;->getParameters()Landroid/hardware/Camera$Parameters;
			 (( android.hardware.Camera$Parameters ) v0 ).setPreviewSize ( p3, p4 ); // invoke-virtual {v0, p3, p4}, Landroid/hardware/Camera$Parameters;->setPreviewSize(II)V
			 v1 = this.mCamera;
			 (( android.hardware.Camera ) v1 ).setParameters ( v0 ); // invoke-virtual {v1, v0}, Landroid/hardware/Camera;->setParameters(Landroid/hardware/Camera$Parameters;)V
			 /* :try_end_0 */
			 /* .catch Ljava/lang/Exception; {:try_start_0 ..:try_end_0} :catch_0 */
		 } // :goto_0
		 v0 = this.this$0;
		 /* iget v1, p0, Lcom/wiyun/engine/utils/ImagePickerActivity$Preview;->mCameraId:I */
		 v2 = this.mCamera;
		 com.wiyun.engine.utils.ImagePickerActivity .access$7 ( v0,v1,v2 );
		 v0 = this.mCamera;
		 (( android.hardware.Camera ) v0 ).startPreview ( ); // invoke-virtual {v0}, Landroid/hardware/Camera;->startPreview()V
		 v0 = this.mCamera;
		 v1 = this.this$0;
		 com.wiyun.engine.utils.ImagePickerActivity .access$4 ( v1 );
		 (( android.hardware.Camera ) v0 ).autoFocus ( v1 ); // invoke-virtual {v0, v1}, Landroid/hardware/Camera;->autoFocus(Landroid/hardware/Camera$AutoFocusCallback;)V
		 return;
		 /* :catch_0 */
		 /* move-exception v0 */
	 } // .end method
	 public void surfaceCreated ( android.view.SurfaceHolder p0 ) {
		 /* .locals 13 */
		 int v12 = 0; // const/4 v12, 0x0
		 int v2 = 0; // const/4 v2, 0x0
		 v0 = this.this$0;
		 v0 = 		 com.wiyun.engine.utils.ImagePickerActivity .access$6 ( v0 );
		 if ( v0 != null) { // if-eqz v0, :cond_3
			 /* const/16 v1, 0x9 */
			 /* if-lt v0, v1, :cond_1 */
			 try { // :try_start_0
				 /* const-class v0, Landroid/hardware/Camera; */
				 final String v1 = "getNumberOfCameras"; // const-string v1, "getNumberOfCameras"
				 int v3 = 0; // const/4 v3, 0x0
				 /* new-array v3, v3, [Ljava/lang/Class; */
				 (( java.lang.Class ) v0 ).getMethod ( v1, v3 ); // invoke-virtual {v0, v1, v3}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;
				 /* const-class v1, Landroid/hardware/Camera; */
				 int v3 = 0; // const/4 v3, 0x0
				 /* new-array v3, v3, [Ljava/lang/Object; */
				 (( java.lang.reflect.Method ) v0 ).invoke ( v1, v3 ); // invoke-virtual {v0, v1, v3}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
				 /* check-cast v0, Ljava/lang/Integer; */
				 v3 = 				 (( java.lang.Integer ) v0 ).intValue ( ); // invoke-virtual {v0}, Ljava/lang/Integer;->intValue()I
				 int v1 = -1; // const/4 v1, -0x1
				 final String v0 = "android.hardware.Camera$CameraInfo"; // const-string v0, "android.hardware.Camera$CameraInfo"
				 java.lang.Class .forName ( v0 );
				 (( java.lang.Class ) v0 ).newInstance ( ); // invoke-virtual {v0}, Ljava/lang/Class;->newInstance()Ljava/lang/Object;
				 final String v5 = "facing"; // const-string v5, "facing"
				 (( java.lang.Class ) v0 ).getField ( v5 ); // invoke-virtual {v0, v5}, Ljava/lang/Class;->getField(Ljava/lang/String;)Ljava/lang/reflect/Field;
				 final String v6 = "CAMERA_FACING_FRONT"; // const-string v6, "CAMERA_FACING_FRONT"
				 (( java.lang.Class ) v0 ).getField ( v6 ); // invoke-virtual {v0, v6}, Ljava/lang/Class;->getField(Ljava/lang/String;)Ljava/lang/reflect/Field;
				 int v7 = 0; // const/4 v7, 0x0
				 v6 = 				 (( java.lang.reflect.Field ) v6 ).getInt ( v7 ); // invoke-virtual {v6, v7}, Ljava/lang/reflect/Field;->getInt(Ljava/lang/Object;)I
				 /* const-class v7, Landroid/hardware/Camera; */
				 final String v8 = "getCameraInfo"; // const-string v8, "getCameraInfo"
				 int v9 = 2; // const/4 v9, 0x2
				 /* new-array v9, v9, [Ljava/lang/Class; */
				 int v10 = 0; // const/4 v10, 0x0
				 v11 = java.lang.Integer.TYPE;
				 /* aput-object v11, v9, v10 */
				 int v10 = 1; // const/4 v10, 0x1
				 /* aput-object v0, v9, v10 */
				 (( java.lang.Class ) v7 ).getMethod ( v8, v9 ); // invoke-virtual {v7, v8, v9}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;
				 /* move v0, v2 */
			 } // :goto_0
			 /* if-lt v0, v3, :cond_2 */
			 /* move v0, v1 */
		 } // :cond_0
		 /* if-ltz v0, :cond_1 */
		 /* iput v0, p0, Lcom/wiyun/engine/utils/ImagePickerActivity$Preview;->mCameraId:I */
		 /* const-class v1, Landroid/hardware/Camera; */
		 final String v3 = "open"; // const-string v3, "open"
		 int v4 = 1; // const/4 v4, 0x1
		 /* new-array v4, v4, [Ljava/lang/Class; */
		 int v5 = 0; // const/4 v5, 0x0
		 v6 = java.lang.Integer.TYPE;
		 /* aput-object v6, v4, v5 */
		 (( java.lang.Class ) v1 ).getMethod ( v3, v4 ); // invoke-virtual {v1, v3, v4}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;
		 /* const-class v3, Landroid/hardware/Camera; */
		 int v4 = 1; // const/4 v4, 0x1
		 /* new-array v4, v4, [Ljava/lang/Object; */
		 int v5 = 0; // const/4 v5, 0x0
		 java.lang.Integer .valueOf ( v0 );
		 /* aput-object v0, v4, v5 */
		 (( java.lang.reflect.Method ) v1 ).invoke ( v3, v4 ); // invoke-virtual {v1, v3, v4}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
		 /* check-cast v0, Landroid/hardware/Camera; */
		 this.mCamera = v0;
		 /* :try_end_0 */
		 /* .catch Ljava/lang/Exception; {:try_start_0 ..:try_end_0} :catch_1 */
	 } // :cond_1
} // :goto_1
v0 = this.mCamera;
if ( v0 != null) { // if-eqz v0, :cond_4
	 try { // :try_start_1
		 v0 = this.mCamera;
		 (( android.hardware.Camera ) v0 ).setPreviewDisplay ( p1 ); // invoke-virtual {v0, p1}, Landroid/hardware/Camera;->setPreviewDisplay(Landroid/view/SurfaceHolder;)V
		 /* :try_end_1 */
		 /* .catch Ljava/io/IOException; {:try_start_1 ..:try_end_1} :catch_0 */
	 } // :goto_2
	 return;
} // :cond_2
try { // :try_start_2
	 /* const-class v8, Landroid/hardware/Camera; */
	 int v9 = 2; // const/4 v9, 0x2
	 /* new-array v9, v9, [Ljava/lang/Object; */
	 int v10 = 0; // const/4 v10, 0x0
	 java.lang.Integer .valueOf ( v0 );
	 /* aput-object v11, v9, v10 */
	 int v10 = 1; // const/4 v10, 0x1
	 /* aput-object v4, v9, v10 */
	 (( java.lang.reflect.Method ) v7 ).invoke ( v8, v9 ); // invoke-virtual {v7, v8, v9}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
	 (( java.lang.reflect.Field ) v5 ).getInt ( v4 ); // invoke-virtual {v5, v4}, Ljava/lang/reflect/Field;->getInt(Ljava/lang/Object;)I
	 /* :try_end_2 */
	 v8 = 	 /* .catch Ljava/lang/Exception; {:try_start_2 ..:try_end_2} :catch_1 */
	 /* if-eq v8, v6, :cond_0 */
	 /* add-int/lit8 v0, v0, 0x1 */
} // :cond_3
/* iput v2, p0, Lcom/wiyun/engine/utils/ImagePickerActivity$Preview;->mCameraId:I */
android.hardware.Camera .open ( );
this.mCamera = v0;
/* :catch_0 */
/* move-exception v0 */
v0 = this.mCamera;
(( android.hardware.Camera ) v0 ).release ( ); // invoke-virtual {v0}, Landroid/hardware/Camera;->release()V
this.mCamera = v12;
} // :cond_4
v0 = this.this$0;
final String v1 = "Can\'t open camera"; // const-string v1, "Can\'t open camera"
android.widget.Toast .makeText ( v0,v1,v2 );
(( android.widget.Toast ) v0 ).show ( ); // invoke-virtual {v0}, Landroid/widget/Toast;->show()V
v0 = this.this$0;
(( com.wiyun.engine.utils.ImagePickerActivity ) v0 ).finish ( ); // invoke-virtual {v0}, Lcom/wiyun/engine/utils/ImagePickerActivity;->finish()V
/* :catch_1 */
/* move-exception v0 */
} // .end method
public void surfaceDestroyed ( android.view.SurfaceHolder p0 ) {
/* .locals 1 */
v0 = this.mCamera;
(( android.hardware.Camera ) v0 ).cancelAutoFocus ( ); // invoke-virtual {v0}, Landroid/hardware/Camera;->cancelAutoFocus()V
v0 = this.mCamera;
(( android.hardware.Camera ) v0 ).stopPreview ( ); // invoke-virtual {v0}, Landroid/hardware/Camera;->stopPreview()V
v0 = this.mCamera;
(( android.hardware.Camera ) v0 ).release ( ); // invoke-virtual {v0}, Landroid/hardware/Camera;->release()V
int v0 = 0; // const/4 v0, 0x0
this.mCamera = v0;
return;
} // .end method
