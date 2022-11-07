class com.wiyun.engine.utils.ImagePickerActivity$Preview extends android.view.SurfaceView implements android.view.SurfaceHolder$Callback {
	 /* .source "ImagePickerActivity.java" */
	 /* # interfaces */
	 /* # annotations */
	 /* .annotation system Ldalvik/annotation/EnclosingClass; */
	 /* value = Lcom/wiyun/engine/utils/ImagePickerActivity; */
} // .end annotation
/* .annotation system Ldalvik/annotation/InnerClass; */
/* accessFlags = 0x0 */
/* name = "Preview" */
} // .end annotation
/* # instance fields */
android.hardware.Camera mCamera;
Integer mCameraId;
android.view.SurfaceHolder mHolder;
final com.wiyun.engine.utils.ImagePickerActivity this$0; //synthetic
/* # direct methods */
 com.wiyun.engine.utils.ImagePickerActivity$Preview ( ) {
/* .locals 2 */
/* .param p2, "context" # Landroid/content/Context; */
/* .prologue */
/* .line 476 */
this.this$0 = p1;
/* .line 477 */
/* invoke-direct {p0, p2}, Landroid/view/SurfaceView;-><init>(Landroid/content/Context;)V */
/* .line 481 */
(( com.wiyun.engine.utils.ImagePickerActivity$Preview ) p0 ).getHolder ( ); // invoke-virtual {p0}, Lcom/wiyun/engine/utils/ImagePickerActivity$Preview;->getHolder()Landroid/view/SurfaceHolder;
this.mHolder = v0;
/* .line 482 */
v0 = this.mHolder;
/* .line 483 */
v0 = this.mHolder;
int v1 = 3; // const/4 v1, 0x3
/* .line 484 */
return;
} // .end method
/* # virtual methods */
public void surfaceChanged ( android.view.SurfaceHolder p0, Integer p1, Integer p2, Integer p3 ) {
/* .locals 4 */
/* .param p1, "holder" # Landroid/view/SurfaceHolder; */
/* .param p2, "format" # I */
/* .param p3, "w" # I */
/* .param p4, "h" # I */
/* .prologue */
/* .line 555 */
try { // :try_start_0
	 v1 = this.mCamera;
	 (( android.hardware.Camera ) v1 ).getParameters ( ); // invoke-virtual {v1}, Landroid/hardware/Camera;->getParameters()Landroid/hardware/Camera$Parameters;
	 /* .line 556 */
	 /* .local v0, "parameters":Landroid/hardware/Camera$Parameters; */
	 (( android.hardware.Camera$Parameters ) v0 ).setPreviewSize ( p3, p4 ); // invoke-virtual {v0, p3, p4}, Landroid/hardware/Camera$Parameters;->setPreviewSize(II)V
	 /* .line 557 */
	 v1 = this.mCamera;
	 (( android.hardware.Camera ) v1 ).setParameters ( v0 ); // invoke-virtual {v1, v0}, Landroid/hardware/Camera;->setParameters(Landroid/hardware/Camera$Parameters;)V
	 /* :try_end_0 */
	 /* .catch Ljava/lang/Exception; {:try_start_0 ..:try_end_0} :catch_0 */
	 /* .line 565 */
} // .end local v0 # "parameters":Landroid/hardware/Camera$Parameters;
} // :goto_0
v1 = this.this$0;
/* iget v2, p0, Lcom/wiyun/engine/utils/ImagePickerActivity$Preview;->mCameraId:I */
v3 = this.mCamera;
com.wiyun.engine.utils.ImagePickerActivity .access$7 ( v1,v2,v3 );
/* .line 568 */
v1 = this.mCamera;
(( android.hardware.Camera ) v1 ).startPreview ( ); // invoke-virtual {v1}, Landroid/hardware/Camera;->startPreview()V
/* .line 569 */
v1 = this.mCamera;
v2 = this.this$0;
com.wiyun.engine.utils.ImagePickerActivity .access$4 ( v2 );
(( android.hardware.Camera ) v1 ).autoFocus ( v2 ); // invoke-virtual {v1, v2}, Landroid/hardware/Camera;->autoFocus(Landroid/hardware/Camera$AutoFocusCallback;)V
/* .line 570 */
return;
/* .line 558 */
/* :catch_0 */
/* move-exception v1 */
} // .end method
public void surfaceCreated ( android.view.SurfaceHolder p0 ) {
/* .locals 17 */
/* .param p1, "holder" # Landroid/view/SurfaceHolder; */
/* .prologue */
/* .line 489 */
/* move-object/from16 v0, p0 */
v12 = this.this$0;
v12 = com.wiyun.engine.utils.ImagePickerActivity .access$6 ( v12 );
if ( v12 != null) { // if-eqz v12, :cond_3
/* .line 490 */
/* const/16 v13, 0x9 */
/* if-lt v12, v13, :cond_0 */
/* .line 493 */
try { // :try_start_0
	 /* const-class v12, Landroid/hardware/Camera; */
	 final String v13 = "getNumberOfCameras"; // const-string v13, "getNumberOfCameras"
	 int v14 = 0; // const/4 v14, 0x0
	 /* new-array v14, v14, [Ljava/lang/Class; */
	 (( java.lang.Class ) v12 ).getMethod ( v13, v14 ); // invoke-virtual {v12, v13, v14}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;
	 /* .line 494 */
	 /* .local v11, "method":Ljava/lang/reflect/Method; */
	 /* const-class v12, Landroid/hardware/Camera; */
	 int v13 = 0; // const/4 v13, 0x0
	 /* new-array v13, v13, [Ljava/lang/Object; */
	 (( java.lang.reflect.Method ) v11 ).invoke ( v12, v13 ); // invoke-virtual {v11, v12, v13}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
	 /* check-cast v12, Ljava/lang/Integer; */
	 v5 = 	 (( java.lang.Integer ) v12 ).intValue ( ); // invoke-virtual {v12}, Ljava/lang/Integer;->intValue()I
	 /* .line 497 */
	 /* .local v5, "count":I */
	 int v9 = -1; // const/4 v9, -0x1
	 /* .line 498 */
	 /* .local v9, "frontId":I */
	 final String v12 = "android.hardware.Camera$CameraInfo"; // const-string v12, "android.hardware.Camera$CameraInfo"
	 java.lang.Class .forName ( v12 );
	 /* .line 499 */
	 /* .local v4, "cameraInfoClass":Ljava/lang/Class;, "Ljava/lang/Class<*>;" */
	 (( java.lang.Class ) v4 ).newInstance ( ); // invoke-virtual {v4}, Ljava/lang/Class;->newInstance()Ljava/lang/Object;
	 /* .line 500 */
	 /* .local v3, "cameraInfo":Ljava/lang/Object; */
	 final String v12 = "facing"; // const-string v12, "facing"
	 (( java.lang.Class ) v4 ).getField ( v12 ); // invoke-virtual {v4, v12}, Ljava/lang/Class;->getField(Ljava/lang/String;)Ljava/lang/reflect/Field;
	 /* .line 501 */
	 /* .local v8, "facingField":Ljava/lang/reflect/Field; */
	 final String v12 = "CAMERA_FACING_FRONT"; // const-string v12, "CAMERA_FACING_FRONT"
	 (( java.lang.Class ) v4 ).getField ( v12 ); // invoke-virtual {v4, v12}, Ljava/lang/Class;->getField(Ljava/lang/String;)Ljava/lang/reflect/Field;
	 /* .line 502 */
	 /* .local v2, "CAMERA_FACING_FRONT_field":Ljava/lang/reflect/Field; */
	 int v12 = 0; // const/4 v12, 0x0
	 v1 = 	 (( java.lang.reflect.Field ) v2 ).getInt ( v12 ); // invoke-virtual {v2, v12}, Ljava/lang/reflect/Field;->getInt(Ljava/lang/Object;)I
	 /* .line 503 */
	 /* .local v1, "CAMERA_FACING_FRONT":I */
	 /* const-class v12, Landroid/hardware/Camera; */
	 final String v13 = "getCameraInfo"; // const-string v13, "getCameraInfo"
	 int v14 = 2; // const/4 v14, 0x2
	 /* new-array v14, v14, [Ljava/lang/Class; */
	 int v15 = 0; // const/4 v15, 0x0
	 v16 = java.lang.Integer.TYPE;
	 /* aput-object v16, v14, v15 */
	 int v15 = 1; // const/4 v15, 0x1
	 /* aput-object v4, v14, v15 */
	 (( java.lang.Class ) v12 ).getMethod ( v13, v14 ); // invoke-virtual {v12, v13, v14}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;
	 /* .line 504 */
	 int v10 = 0; // const/4 v10, 0x0
	 /* .local v10, "i":I */
} // :goto_0
/* if-lt v10, v5, :cond_1 */
/* .line 514 */
} // :goto_1
/* if-ltz v9, :cond_0 */
/* .line 515 */
/* move-object/from16 v0, p0 */
/* iput v9, v0, Lcom/wiyun/engine/utils/ImagePickerActivity$Preview;->mCameraId:I */
/* .line 516 */
/* const-class v12, Landroid/hardware/Camera; */
final String v13 = "open"; // const-string v13, "open"
int v14 = 1; // const/4 v14, 0x1
/* new-array v14, v14, [Ljava/lang/Class; */
int v15 = 0; // const/4 v15, 0x0
v16 = java.lang.Integer.TYPE;
/* aput-object v16, v14, v15 */
(( java.lang.Class ) v12 ).getMethod ( v13, v14 ); // invoke-virtual {v12, v13, v14}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;
/* .line 517 */
/* const-class v12, Landroid/hardware/Camera; */
int v13 = 1; // const/4 v13, 0x1
/* new-array v13, v13, [Ljava/lang/Object; */
int v14 = 0; // const/4 v14, 0x0
java.lang.Integer .valueOf ( v9 );
/* aput-object v15, v13, v14 */
(( java.lang.reflect.Method ) v11 ).invoke ( v12, v13 ); // invoke-virtual {v11, v12, v13}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
/* check-cast v12, Landroid/hardware/Camera; */
/* move-object/from16 v0, p0 */
this.mCamera = v12;
/* :try_end_0 */
/* .catch Ljava/lang/Exception; {:try_start_0 ..:try_end_0} :catch_1 */
/* .line 528 */
} // .end local v1 # "CAMERA_FACING_FRONT":I
} // .end local v2 # "CAMERA_FACING_FRONT_field":Ljava/lang/reflect/Field;
} // .end local v3 # "cameraInfo":Ljava/lang/Object;
} // .end local v4 # "cameraInfoClass":Ljava/lang/Class;, "Ljava/lang/Class<*>;"
} // .end local v5 # "count":I
} // .end local v8 # "facingField":Ljava/lang/reflect/Field;
} // .end local v9 # "frontId":I
} // .end local v10 # "i":I
} // .end local v11 # "method":Ljava/lang/reflect/Method;
} // :cond_0
} // :goto_2
/* move-object/from16 v0, p0 */
v12 = this.mCamera;
if ( v12 != null) { // if-eqz v12, :cond_4
/* .line 530 */
try { // :try_start_1
/* move-object/from16 v0, p0 */
v12 = this.mCamera;
/* move-object/from16 v0, p1 */
(( android.hardware.Camera ) v12 ).setPreviewDisplay ( v0 ); // invoke-virtual {v12, v0}, Landroid/hardware/Camera;->setPreviewDisplay(Landroid/view/SurfaceHolder;)V
/* :try_end_1 */
/* .catch Ljava/io/IOException; {:try_start_1 ..:try_end_1} :catch_0 */
/* .line 539 */
} // :goto_3
return;
/* .line 505 */
/* .restart local v1 # "CAMERA_FACING_FRONT":I */
/* .restart local v2 # "CAMERA_FACING_FRONT_field":Ljava/lang/reflect/Field; */
/* .restart local v3 # "cameraInfo":Ljava/lang/Object; */
/* .restart local v4 # "cameraInfoClass":Ljava/lang/Class;, "Ljava/lang/Class<*>;" */
/* .restart local v5 # "count":I */
/* .restart local v8 # "facingField":Ljava/lang/reflect/Field; */
/* .restart local v9 # "frontId":I */
/* .restart local v10 # "i":I */
/* .restart local v11 # "method":Ljava/lang/reflect/Method; */
} // :cond_1
try { // :try_start_2
/* const-class v12, Landroid/hardware/Camera; */
int v13 = 2; // const/4 v13, 0x2
/* new-array v13, v13, [Ljava/lang/Object; */
int v14 = 0; // const/4 v14, 0x0
java.lang.Integer .valueOf ( v10 );
/* aput-object v15, v13, v14 */
int v14 = 1; // const/4 v14, 0x1
/* aput-object v3, v13, v14 */
(( java.lang.reflect.Method ) v11 ).invoke ( v12, v13 ); // invoke-virtual {v11, v12, v13}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
/* .line 506 */
(( java.lang.reflect.Field ) v8 ).getInt ( v3 ); // invoke-virtual {v8, v3}, Ljava/lang/reflect/Field;->getInt(Ljava/lang/Object;)I
/* :try_end_2 */
v7 = /* .catch Ljava/lang/Exception; {:try_start_2 ..:try_end_2} :catch_1 */
/* .line 507 */
/* .local v7, "facing":I */
/* if-ne v7, v1, :cond_2 */
/* .line 508 */
/* move v9, v10 */
/* .line 509 */
/* .line 504 */
} // :cond_2
/* add-int/lit8 v10, v10, 0x1 */
/* .line 523 */
} // .end local v1 # "CAMERA_FACING_FRONT":I
} // .end local v2 # "CAMERA_FACING_FRONT_field":Ljava/lang/reflect/Field;
} // .end local v3 # "cameraInfo":Ljava/lang/Object;
} // .end local v4 # "cameraInfoClass":Ljava/lang/Class;, "Ljava/lang/Class<*>;"
} // .end local v5 # "count":I
} // .end local v7 # "facing":I
} // .end local v8 # "facingField":Ljava/lang/reflect/Field;
} // .end local v9 # "frontId":I
} // .end local v10 # "i":I
} // .end local v11 # "method":Ljava/lang/reflect/Method;
} // :cond_3
int v12 = 0; // const/4 v12, 0x0
/* move-object/from16 v0, p0 */
/* iput v12, v0, Lcom/wiyun/engine/utils/ImagePickerActivity$Preview;->mCameraId:I */
/* .line 524 */
android.hardware.Camera .open ( );
/* move-object/from16 v0, p0 */
this.mCamera = v12;
/* .line 531 */
/* :catch_0 */
/* move-exception v6 */
/* .line 532 */
/* .local v6, "exception":Ljava/io/IOException; */
/* move-object/from16 v0, p0 */
v12 = this.mCamera;
(( android.hardware.Camera ) v12 ).release ( ); // invoke-virtual {v12}, Landroid/hardware/Camera;->release()V
/* .line 533 */
int v12 = 0; // const/4 v12, 0x0
/* move-object/from16 v0, p0 */
this.mCamera = v12;
/* .line 536 */
} // .end local v6 # "exception":Ljava/io/IOException;
} // :cond_4
/* move-object/from16 v0, p0 */
v12 = this.this$0;
final String v13 = "Can\'t open camera"; // const-string v13, "Can\'t open camera"
int v14 = 0; // const/4 v14, 0x0
android.widget.Toast .makeText ( v12,v13,v14 );
(( android.widget.Toast ) v12 ).show ( ); // invoke-virtual {v12}, Landroid/widget/Toast;->show()V
/* .line 537 */
/* move-object/from16 v0, p0 */
v12 = this.this$0;
(( com.wiyun.engine.utils.ImagePickerActivity ) v12 ).finish ( ); // invoke-virtual {v12}, Lcom/wiyun/engine/utils/ImagePickerActivity;->finish()V
/* .line 519 */
/* :catch_1 */
/* move-exception v12 */
} // .end method
public void surfaceDestroyed ( android.view.SurfaceHolder p0 ) {
/* .locals 1 */
/* .param p1, "holder" # Landroid/view/SurfaceHolder; */
/* .prologue */
/* .line 545 */
v0 = this.mCamera;
(( android.hardware.Camera ) v0 ).cancelAutoFocus ( ); // invoke-virtual {v0}, Landroid/hardware/Camera;->cancelAutoFocus()V
/* .line 546 */
v0 = this.mCamera;
(( android.hardware.Camera ) v0 ).stopPreview ( ); // invoke-virtual {v0}, Landroid/hardware/Camera;->stopPreview()V
/* .line 547 */
v0 = this.mCamera;
(( android.hardware.Camera ) v0 ).release ( ); // invoke-virtual {v0}, Landroid/hardware/Camera;->release()V
/* .line 548 */
int v0 = 0; // const/4 v0, 0x0
this.mCamera = v0;
/* .line 549 */
return;
} // .end method
