class com.ansca.corona.CameraView extends android.view.SurfaceView implements android.view.SurfaceHolder$Callback {
	 /* .source "CameraView.java" */
	 /* # interfaces */
	 /* # instance fields */
	 private android.hardware.Camera fCamera;
	 private Integer fCameraOrientationInDegrees;
	 private Integer fDeviceOrientationInDegrees;
	 private android.view.SurfaceHolder fHolder;
	 private Boolean fIsCameraOrientationKnown;
	 private Boolean fIsUsingFrontFacingCamera;
	 private android.view.OrientationEventListener fOrientationListener;
	 private android.hardware.Camera$PictureCallback fTakePictureListener;
	 private Integer fUsingCameraId;
	 /* # direct methods */
	 com.ansca.corona.CameraView ( ) {
		 /* .locals 3 */
		 /* .param p1, "context" # Landroid/content/Context; */
		 /* .prologue */
		 int v2 = 0; // const/4 v2, 0x0
		 int v1 = 0; // const/4 v1, 0x0
		 /* .line 41 */
		 /* invoke-direct {p0, p1}, Landroid/view/SurfaceView;-><init>(Landroid/content/Context;)V */
		 /* .line 26 */
		 this.fHolder = v2;
		 /* .line 27 */
		 this.fCamera = v2;
		 /* .line 28 */
		 this.fTakePictureListener = v2;
		 /* .line 30 */
		 /* iput v1, p0, Lcom/ansca/corona/CameraView;->fDeviceOrientationInDegrees:I */
		 /* .line 31 */
		 /* iput v1, p0, Lcom/ansca/corona/CameraView;->fUsingCameraId:I */
		 /* .line 32 */
		 /* iput-boolean v1, p0, Lcom/ansca/corona/CameraView;->fIsUsingFrontFacingCamera:Z */
		 /* .line 33 */
		 /* iput v1, p0, Lcom/ansca/corona/CameraView;->fCameraOrientationInDegrees:I */
		 /* .line 34 */
		 /* iput-boolean v1, p0, Lcom/ansca/corona/CameraView;->fIsCameraOrientationKnown:Z */
		 /* .line 45 */
		 (( com.ansca.corona.CameraView ) p0 ).getHolder ( ); // invoke-virtual {p0}, Lcom/ansca/corona/CameraView;->getHolder()Landroid/view/SurfaceHolder;
		 /* .line 46 */
		 /* .local v0, "holder":Landroid/view/SurfaceHolder; */
		 /* .line 47 */
		 int v1 = 3; // const/4 v1, 0x3
		 /* .line 52 */
		 /* new-instance v1, Lcom/ansca/corona/CameraView$1; */
		 /* invoke-direct {v1, p0, p1}, Lcom/ansca/corona/CameraView$1;-><init>(Lcom/ansca/corona/CameraView;Landroid/content/Context;)V */
		 this.fOrientationListener = v1;
		 /* .line 79 */
		 return;
	 } // .end method
	 static Integer access$002 ( com.ansca.corona.CameraView p0, Integer p1 ) { //synthethic
		 /* .locals 0 */
		 /* .param p0, "x0" # Lcom/ansca/corona/CameraView; */
		 /* .param p1, "x1" # I */
		 /* .prologue */
		 /* .line 25 */
		 /* iput p1, p0, Lcom/ansca/corona/CameraView;->fDeviceOrientationInDegrees:I */
	 } // .end method
	 private android.hardware.Camera$Size getOptimalPreviewSize ( java.util.List p0, Integer p1, Integer p2 ) {
		 /* .locals 17 */
		 /* .param p2, "w" # I */
		 /* .param p3, "h" # I */
		 /* .annotation system Ldalvik/annotation/Signature; */
		 /* value = { */
		 /* "(", */
		 /* "Ljava/util/List", */
		 /* "<", */
		 /* "Landroid/hardware/Camera$Size;", */
		 /* ">;II)", */
		 /* "Landroid/hardware/Camera$Size;" */
		 /* } */
	 } // .end annotation
	 /* .prologue */
	 /* .line 265 */
	 /* .local p1, "sizes":Ljava/util/List;, "Ljava/util/List<Landroid/hardware/Camera$Size;>;" */
	 /* const-wide v1, 0x3fa999999999999aL # 0.05 */
	 /* .line 266 */
	 /* .local v1, "ASPECT_TOLERANCE":D */
	 /* move/from16 v0, p2 */
	 /* int-to-double v13, v0 */
	 /* move/from16 v0, p3 */
	 /* int-to-double v15, v0 */
	 /* div-double v11, v13, v15 */
	 /* .line 267 */
	 /* .local v11, "targetRatio":D */
	 /* if-nez p1, :cond_1 */
	 int v6 = 0; // const/4 v6, 0x0
	 /* .line 293 */
} // :cond_0
/* .line 269 */
} // :cond_1
int v6 = 0; // const/4 v6, 0x0
/* .line 270 */
/* .local v6, "optimalSize":Landroid/hardware/Camera$Size; */
/* const-wide v4, 0x7fefffffffffffffL # Double.MAX_VALUE */
/* .line 271 */
/* .local v4, "minDiff":D */
/* move/from16 v10, p3 */
/* .line 274 */
/* .local v10, "targetHeight":I */
/* invoke-interface/range {p1 ..p1}, Ljava/util/List;->iterator()Ljava/util/Iterator; */
/* .local v3, "i$":Ljava/util/Iterator; */
} // :cond_2
v13 = } // :goto_0
if ( v13 != null) { // if-eqz v13, :cond_3
/* check-cast v9, Landroid/hardware/Camera$Size; */
/* .line 275 */
/* .local v9, "size":Landroid/hardware/Camera$Size; */
/* iget v13, v9, Landroid/hardware/Camera$Size;->width:I */
/* int-to-double v13, v13 */
/* iget v15, v9, Landroid/hardware/Camera$Size;->height:I */
/* int-to-double v15, v15 */
/* div-double v7, v13, v15 */
/* .line 276 */
/* .local v7, "ratio":D */
/* sub-double v13, v7, v11 */
java.lang.Math .abs ( v13,v14 );
/* move-result-wide v13 */
/* const-wide v15, 0x3fa999999999999aL # 0.05 */
/* cmpl-double v13, v13, v15 */
/* if-gtz v13, :cond_2 */
/* .line 277 */
/* iget v13, v9, Landroid/hardware/Camera$Size;->height:I */
/* sub-int/2addr v13, v10 */
v13 = java.lang.Math .abs ( v13 );
/* int-to-double v13, v13 */
/* cmpg-double v13, v13, v4 */
/* if-gez v13, :cond_2 */
/* .line 278 */
/* move-object v6, v9 */
/* .line 279 */
/* iget v13, v9, Landroid/hardware/Camera$Size;->height:I */
/* sub-int/2addr v13, v10 */
v13 = java.lang.Math .abs ( v13 );
/* int-to-double v4, v13 */
/* .line 284 */
} // .end local v7 # "ratio":D
} // .end local v9 # "size":Landroid/hardware/Camera$Size;
} // :cond_3
/* if-nez v6, :cond_0 */
/* .line 285 */
/* const-wide v4, 0x7fefffffffffffffL # Double.MAX_VALUE */
/* .line 286 */
/* invoke-interface/range {p1 ..p1}, Ljava/util/List;->iterator()Ljava/util/Iterator; */
} // :cond_4
v13 = } // :goto_1
if ( v13 != null) { // if-eqz v13, :cond_0
/* check-cast v9, Landroid/hardware/Camera$Size; */
/* .line 287 */
/* .restart local v9 # "size":Landroid/hardware/Camera$Size; */
/* iget v13, v9, Landroid/hardware/Camera$Size;->height:I */
/* sub-int/2addr v13, v10 */
v13 = java.lang.Math .abs ( v13 );
/* int-to-double v13, v13 */
/* cmpg-double v13, v13, v4 */
/* if-gez v13, :cond_4 */
/* .line 288 */
/* move-object v6, v9 */
/* .line 289 */
/* iget v13, v9, Landroid/hardware/Camera$Size;->height:I */
/* sub-int/2addr v13, v10 */
v13 = java.lang.Math .abs ( v13 );
/* int-to-double v4, v13 */
} // .end method
private void updateCameraInformation ( ) {
/* .locals 12 */
/* .prologue */
int v5 = 1; // const/4 v5, 0x1
int v6 = 0; // const/4 v6, 0x0
/* .line 381 */
/* iput-boolean v6, p0, Lcom/ansca/corona/CameraView;->fIsUsingFrontFacingCamera:Z */
/* .line 382 */
/* iput-boolean v6, p0, Lcom/ansca/corona/CameraView;->fIsCameraOrientationKnown:Z */
/* .line 383 */
/* iput v6, p0, Lcom/ansca/corona/CameraView;->fCameraOrientationInDegrees:I */
/* .line 387 */
try { // :try_start_0
final String v7 = "android.hardware.Camera$CameraInfo"; // const-string v7, "android.hardware.Camera$CameraInfo"
java.lang.Class .forName ( v7 );
/* .line 388 */
/* .local v1, "cameraInfoClassType":Ljava/lang/Class; */
(( java.lang.Class ) v1 ).newInstance ( ); // invoke-virtual {v1}, Ljava/lang/Class;->newInstance()Ljava/lang/Object;
/* .line 389 */
/* .local v0, "cameraInfo":Ljava/lang/Object; */
/* const-class v7, Landroid/hardware/Camera; */
final String v8 = "getCameraInfo"; // const-string v8, "getCameraInfo"
int v9 = 2; // const/4 v9, 0x2
/* new-array v9, v9, [Ljava/lang/Class; */
int v10 = 0; // const/4 v10, 0x0
v11 = java.lang.Integer.TYPE;
/* aput-object v11, v9, v10 */
int v10 = 1; // const/4 v10, 0x1
/* aput-object v1, v9, v10 */
(( java.lang.Class ) v7 ).getMethod ( v8, v9 ); // invoke-virtual {v7, v8, v9}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;
/* .line 391 */
/* .local v3, "getCameraInfoMethod":Ljava/lang/reflect/Method; */
int v7 = 0; // const/4 v7, 0x0
int v8 = 2; // const/4 v8, 0x2
/* new-array v8, v8, [Ljava/lang/Object; */
int v9 = 0; // const/4 v9, 0x0
/* iget v10, p0, Lcom/ansca/corona/CameraView;->fUsingCameraId:I */
java.lang.Integer .valueOf ( v10 );
/* aput-object v10, v8, v9 */
int v9 = 1; // const/4 v9, 0x1
/* aput-object v0, v8, v9 */
(( java.lang.reflect.Method ) v3 ).invoke ( v7, v8 ); // invoke-virtual {v3, v7, v8}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
/* .line 392 */
final String v7 = "facing"; // const-string v7, "facing"
(( java.lang.Class ) v1 ).getField ( v7 ); // invoke-virtual {v1, v7}, Ljava/lang/Class;->getField(Ljava/lang/String;)Ljava/lang/reflect/Field;
/* .line 393 */
/* .local v2, "facingField":Ljava/lang/reflect/Field; */
final String v7 = "orientation"; // const-string v7, "orientation"
(( java.lang.Class ) v1 ).getField ( v7 ); // invoke-virtual {v1, v7}, Ljava/lang/Class;->getField(Ljava/lang/String;)Ljava/lang/reflect/Field;
/* .line 394 */
/* .local v4, "orientationField":Ljava/lang/reflect/Field; */
v7 = (( java.lang.reflect.Field ) v2 ).getInt ( v0 ); // invoke-virtual {v2, v0}, Ljava/lang/reflect/Field;->getInt(Ljava/lang/Object;)I
/* if-ne v7, v5, :cond_0 */
} // :goto_0
/* iput-boolean v5, p0, Lcom/ansca/corona/CameraView;->fIsUsingFrontFacingCamera:Z */
/* .line 395 */
v5 = (( java.lang.reflect.Field ) v4 ).getInt ( v0 ); // invoke-virtual {v4, v0}, Ljava/lang/reflect/Field;->getInt(Ljava/lang/Object;)I
/* iput v5, p0, Lcom/ansca/corona/CameraView;->fCameraOrientationInDegrees:I */
/* .line 396 */
int v5 = 1; // const/4 v5, 0x1
/* iput-boolean v5, p0, Lcom/ansca/corona/CameraView;->fIsCameraOrientationKnown:Z */
/* :try_end_0 */
/* .catch Ljava/lang/Exception; {:try_start_0 ..:try_end_0} :catch_0 */
/* .line 399 */
} // .end local v0 # "cameraInfo":Ljava/lang/Object;
} // .end local v1 # "cameraInfoClassType":Ljava/lang/Class;
} // .end local v2 # "facingField":Ljava/lang/reflect/Field;
} // .end local v3 # "getCameraInfoMethod":Ljava/lang/reflect/Method;
} // .end local v4 # "orientationField":Ljava/lang/reflect/Field;
} // :goto_1
return;
/* .restart local v0 # "cameraInfo":Ljava/lang/Object; */
/* .restart local v1 # "cameraInfoClassType":Ljava/lang/Class; */
/* .restart local v2 # "facingField":Ljava/lang/reflect/Field; */
/* .restart local v3 # "getCameraInfoMethod":Ljava/lang/reflect/Method; */
/* .restart local v4 # "orientationField":Ljava/lang/reflect/Field; */
} // :cond_0
/* move v5, v6 */
/* .line 394 */
/* .line 398 */
} // .end local v0 # "cameraInfo":Ljava/lang/Object;
} // .end local v1 # "cameraInfoClassType":Ljava/lang/Class;
} // .end local v2 # "facingField":Ljava/lang/reflect/Field;
} // .end local v3 # "getCameraInfoMethod":Ljava/lang/reflect/Method;
} // .end local v4 # "orientationField":Ljava/lang/reflect/Field;
/* :catch_0 */
/* move-exception v5 */
} // .end method
private void updateCameraOrientation ( ) {
/* .locals 11 */
/* .prologue */
/* const/16 v9, 0x5a */
int v8 = 0; // const/4 v8, 0x0
/* .line 305 */
v7 = this.fCamera;
/* if-nez v7, :cond_0 */
/* .line 373 */
} // :goto_0
return;
/* .line 310 */
} // :cond_0
(( com.ansca.corona.CameraView ) p0 ).getContext ( ); // invoke-virtual {p0}, Lcom/ansca/corona/CameraView;->getContext()Landroid/content/Context;
final String v10 = "window"; // const-string v10, "window"
(( android.content.Context ) v7 ).getSystemService ( v10 ); // invoke-virtual {v7, v10}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;
/* check-cast v7, Landroid/view/WindowManager; */
/* .line 311 */
/* .local v1, "display":Landroid/view/Display; */
v7 = (( android.view.Display ) v1 ).getRotation ( ); // invoke-virtual {v1}, Landroid/view/Display;->getRotation()I
/* packed-switch v7, :pswitch_data_0 */
/* .line 322 */
int v2 = 0; // const/4 v2, 0x0
/* .line 325 */
/* .local v2, "displayAngle":I */
} // :goto_1
v7 = (( android.view.Display ) v1 ).getWidth ( ); // invoke-virtual {v1}, Landroid/view/Display;->getWidth()I
v10 = (( android.view.Display ) v1 ).getHeight ( ); // invoke-virtual {v1}, Landroid/view/Display;->getHeight()I
/* if-ge v7, v10, :cond_6 */
if ( v2 != null) { // if-eqz v2, :cond_1
/* const/16 v7, 0xb4 */
/* if-ne v2, v7, :cond_6 */
} // :cond_1
int v4 = 1; // const/4 v4, 0x1
/* .line 329 */
/* .local v4, "isNaturalOrientationPortrait":Z */
} // :goto_2
/* iget-boolean v7, p0, Lcom/ansca/corona/CameraView;->fIsCameraOrientationKnown:Z */
if ( v7 != null) { // if-eqz v7, :cond_7
/* .line 331 */
/* iget v5, p0, Lcom/ansca/corona/CameraView;->fCameraOrientationInDegrees:I */
/* .line 342 */
/* .local v5, "mountedCameraOrientation":I */
} // :goto_3
/* iget-boolean v7, p0, Lcom/ansca/corona/CameraView;->fIsUsingFrontFacingCamera:Z */
if ( v7 != null) { // if-eqz v7, :cond_9
/* .line 344 */
/* add-int v7, v5, v2 */
/* rem-int/lit16 v0, v7, 0x168 */
/* .line 345 */
/* .local v0, "cameraAngle":I */
/* rsub-int v7, v0, 0x168 */
/* rem-int/lit16 v0, v7, 0x168 */
/* .line 351 */
} // :goto_4
v7 = this.fCamera;
(( android.hardware.Camera ) v7 ).setDisplayOrientation ( v0 ); // invoke-virtual {v7, v0}, Landroid/hardware/Camera;->setDisplayOrientation(I)V
/* .line 355 */
v7 = this.fCamera;
(( android.hardware.Camera ) v7 ).getParameters ( ); // invoke-virtual {v7}, Landroid/hardware/Camera;->getParameters()Landroid/hardware/Camera$Parameters;
/* .line 356 */
/* .local v6, "parameters":Landroid/hardware/Camera$Parameters; */
/* iget v7, p0, Lcom/ansca/corona/CameraView;->fDeviceOrientationInDegrees:I */
/* sub-int v3, v5, v7 */
/* .line 357 */
/* .local v3, "imageRotation":I */
/* if-gez v3, :cond_2 */
/* .line 358 */
/* add-int/lit16 v3, v3, 0x168 */
/* .line 360 */
} // :cond_2
/* iget-boolean v7, p0, Lcom/ansca/corona/CameraView;->fIsUsingFrontFacingCamera:Z */
if ( v7 != null) { // if-eqz v7, :cond_5
/* .line 363 */
if ( v4 != null) { // if-eqz v4, :cond_3
/* rem-int/lit16 v7, v3, 0xb4 */
if ( v7 != null) { // if-eqz v7, :cond_4
} // :cond_3
/* if-nez v4, :cond_5 */
/* rem-int/lit16 v7, v3, 0xb4 */
/* if-ne v7, v9, :cond_5 */
/* .line 365 */
} // :cond_4
/* add-int/lit16 v7, v3, 0xb4 */
/* rem-int/lit16 v3, v7, 0x168 */
/* .line 368 */
} // :cond_5
(( android.hardware.Camera$Parameters ) v6 ).setRotation ( v3 ); // invoke-virtual {v6, v3}, Landroid/hardware/Camera$Parameters;->setRotation(I)V
/* .line 369 */
v7 = this.fCamera;
(( android.hardware.Camera ) v7 ).setParameters ( v6 ); // invoke-virtual {v7, v6}, Landroid/hardware/Camera;->setParameters(Landroid/hardware/Camera$Parameters;)V
/* .line 313 */
} // .end local v0 # "cameraAngle":I
} // .end local v2 # "displayAngle":I
} // .end local v3 # "imageRotation":I
} // .end local v4 # "isNaturalOrientationPortrait":Z
} // .end local v5 # "mountedCameraOrientation":I
} // .end local v6 # "parameters":Landroid/hardware/Camera$Parameters;
/* :pswitch_0 */
/* const/16 v2, 0xb4 */
/* .line 314 */
/* .restart local v2 # "displayAngle":I */
/* .line 316 */
} // .end local v2 # "displayAngle":I
/* :pswitch_1 */
/* const/16 v2, 0x10e */
/* .line 317 */
/* .restart local v2 # "displayAngle":I */
/* .line 319 */
} // .end local v2 # "displayAngle":I
/* :pswitch_2 */
/* const/16 v2, 0x5a */
/* .line 320 */
/* .restart local v2 # "displayAngle":I */
} // :cond_6
/* move v4, v8 */
/* .line 325 */
/* .line 337 */
/* .restart local v4 # "isNaturalOrientationPortrait":Z */
} // :cond_7
if ( v4 != null) { // if-eqz v4, :cond_8
/* move v5, v9 */
/* .restart local v5 # "mountedCameraOrientation":I */
} // :goto_5
} // .end local v5 # "mountedCameraOrientation":I
} // :cond_8
/* move v5, v8 */
/* .line 349 */
/* .restart local v5 # "mountedCameraOrientation":I */
} // :cond_9
/* add-int/lit16 v7, v5, 0x168 */
/* sub-int/2addr v7, v2 */
/* rem-int/lit16 v0, v7, 0x168 */
/* .restart local v0 # "cameraAngle":I */
/* .line 311 */
/* :pswitch_data_0 */
/* .packed-switch 0x1 */
/* :pswitch_2 */
/* :pswitch_0 */
/* :pswitch_1 */
} // .end packed-switch
} // .end method
/* # virtual methods */
protected void disableCamera ( ) {
/* .locals 3 */
/* .prologue */
int v2 = 0; // const/4 v2, 0x0
/* .line 184 */
v0 = (( com.ansca.corona.CameraView ) p0 ).isCameraDisabled ( ); // invoke-virtual {p0}, Lcom/ansca/corona/CameraView;->isCameraDisabled()Z
if ( v0 != null) { // if-eqz v0, :cond_1
/* .line 201 */
} // :cond_0
} // :goto_0
return;
/* .line 190 */
} // :cond_1
try { // :try_start_0
v0 = this.fCamera;
(( android.hardware.Camera ) v0 ).stopPreview ( ); // invoke-virtual {v0}, Landroid/hardware/Camera;->stopPreview()V
/* .line 191 */
v0 = this.fCamera;
int v1 = 0; // const/4 v1, 0x0
(( android.hardware.Camera ) v0 ).setPreviewDisplay ( v1 ); // invoke-virtual {v0, v1}, Landroid/hardware/Camera;->setPreviewDisplay(Landroid/view/SurfaceHolder;)V
/* :try_end_0 */
/* .catch Ljava/lang/Exception; {:try_start_0 ..:try_end_0} :catch_0 */
/* .line 194 */
} // :goto_1
v0 = this.fCamera;
(( android.hardware.Camera ) v0 ).release ( ); // invoke-virtual {v0}, Landroid/hardware/Camera;->release()V
/* .line 195 */
this.fCamera = v2;
/* .line 198 */
v0 = this.fOrientationListener;
v0 = (( android.view.OrientationEventListener ) v0 ).canDetectOrientation ( ); // invoke-virtual {v0}, Landroid/view/OrientationEventListener;->canDetectOrientation()Z
if ( v0 != null) { // if-eqz v0, :cond_0
/* .line 199 */
v0 = this.fOrientationListener;
(( android.view.OrientationEventListener ) v0 ).disable ( ); // invoke-virtual {v0}, Landroid/view/OrientationEventListener;->disable()V
/* .line 193 */
/* :catch_0 */
/* move-exception v0 */
} // .end method
protected void enableCamera ( ) {
/* .locals 8 */
/* .prologue */
int v7 = 0; // const/4 v7, 0x0
/* .line 141 */
v2 = (( com.ansca.corona.CameraView ) p0 ).isCameraEnabled ( ); // invoke-virtual {p0}, Lcom/ansca/corona/CameraView;->isCameraEnabled()Z
/* if-nez v2, :cond_0 */
v2 = this.fHolder;
if ( v2 != null) { // if-eqz v2, :cond_0
v2 = this.fHolder;
/* if-nez v2, :cond_1 */
/* .line 177 */
} // :cond_0
} // :goto_0
return;
/* .line 147 */
} // :cond_1
int v1 = 0; // const/4 v1, 0x0
/* .line 149 */
/* .local v1, "openMethod":Ljava/lang/reflect/Method; */
try { // :try_start_0
/* const-class v2, Landroid/hardware/Camera; */
final String v3 = "open"; // const-string v3, "open"
int v4 = 1; // const/4 v4, 0x1
/* new-array v4, v4, [Ljava/lang/Class; */
int v5 = 0; // const/4 v5, 0x0
v6 = java.lang.Integer.TYPE;
/* aput-object v6, v4, v5 */
(( java.lang.Class ) v2 ).getMethod ( v3, v4 ); // invoke-virtual {v2, v3, v4}, Ljava/lang/Class;->getMethod(Ljava/lang/String;[Ljava/lang/Class;)Ljava/lang/reflect/Method;
/* :try_end_0 */
/* .catch Ljava/lang/Exception; {:try_start_0 ..:try_end_0} :catch_1 */
/* .line 152 */
} // :goto_1
if ( v1 != null) { // if-eqz v1, :cond_2
/* .line 153 */
int v2 = 0; // const/4 v2, 0x0
int v3 = 1; // const/4 v3, 0x1
try { // :try_start_1
/* new-array v3, v3, [Ljava/lang/Object; */
int v4 = 0; // const/4 v4, 0x0
/* iget v5, p0, Lcom/ansca/corona/CameraView;->fUsingCameraId:I */
java.lang.Integer .valueOf ( v5 );
/* aput-object v5, v3, v4 */
(( java.lang.reflect.Method ) v1 ).invoke ( v2, v3 ); // invoke-virtual {v1, v2, v3}, Ljava/lang/reflect/Method;->invoke(Ljava/lang/Object;[Ljava/lang/Object;)Ljava/lang/Object;
/* check-cast v2, Landroid/hardware/Camera; */
/* check-cast v2, Landroid/hardware/Camera; */
this.fCamera = v2;
/* .line 158 */
} // :goto_2
/* invoke-direct {p0}, Lcom/ansca/corona/CameraView;->updateCameraInformation()V */
/* .line 159 */
/* invoke-direct {p0}, Lcom/ansca/corona/CameraView;->updateCameraOrientation()V */
/* .line 160 */
v2 = this.fCamera;
v3 = this.fHolder;
(( android.hardware.Camera ) v2 ).setPreviewDisplay ( v3 ); // invoke-virtual {v2, v3}, Landroid/hardware/Camera;->setPreviewDisplay(Landroid/view/SurfaceHolder;)V
/* .line 161 */
v2 = this.fCamera;
(( android.hardware.Camera ) v2 ).startPreview ( ); // invoke-virtual {v2}, Landroid/hardware/Camera;->startPreview()V
/* :try_end_1 */
/* .catch Ljava/lang/Exception; {:try_start_1 ..:try_end_1} :catch_0 */
/* .line 174 */
v2 = this.fOrientationListener;
v2 = (( android.view.OrientationEventListener ) v2 ).canDetectOrientation ( ); // invoke-virtual {v2}, Landroid/view/OrientationEventListener;->canDetectOrientation()Z
if ( v2 != null) { // if-eqz v2, :cond_0
/* .line 175 */
v2 = this.fOrientationListener;
(( android.view.OrientationEventListener ) v2 ).enable ( ); // invoke-virtual {v2}, Landroid/view/OrientationEventListener;->enable()V
/* .line 156 */
} // :cond_2
try { // :try_start_2
android.hardware.Camera .open ( );
this.fCamera = v2;
/* :try_end_2 */
/* .catch Ljava/lang/Exception; {:try_start_2 ..:try_end_2} :catch_0 */
/* .line 163 */
/* :catch_0 */
/* move-exception v0 */
/* .line 164 */
/* .local v0, "ex":Ljava/lang/Exception; */
v2 = this.fCamera;
if ( v2 != null) { // if-eqz v2, :cond_3
/* .line 165 */
v2 = this.fCamera;
(( android.hardware.Camera ) v2 ).release ( ); // invoke-virtual {v2}, Landroid/hardware/Camera;->release()V
/* .line 166 */
this.fCamera = v7;
/* .line 168 */
} // :cond_3
final String v2 = "Corona"; // const-string v2, "Corona"
final String v3 = "Failed to enable camera."; // const-string v3, "Failed to enable camera."
android.util.Log .v ( v2,v3 );
/* .line 151 */
} // .end local v0 # "ex":Ljava/lang/Exception;
/* :catch_1 */
/* move-exception v2 */
} // .end method
public Integer getSelectedCameraIndex ( ) {
/* .locals 1 */
/* .prologue */
/* .line 117 */
/* iget v0, p0, Lcom/ansca/corona/CameraView;->fUsingCameraId:I */
} // .end method
public Boolean isCameraDisabled ( ) {
/* .locals 1 */
/* .prologue */
/* .line 133 */
v0 = (( com.ansca.corona.CameraView ) p0 ).isCameraEnabled ( ); // invoke-virtual {p0}, Lcom/ansca/corona/CameraView;->isCameraEnabled()Z
/* if-nez v0, :cond_0 */
int v0 = 1; // const/4 v0, 0x1
} // :goto_0
} // :cond_0
int v0 = 0; // const/4 v0, 0x0
} // .end method
public Boolean isCameraEnabled ( ) {
/* .locals 1 */
/* .prologue */
/* .line 125 */
v0 = this.fCamera;
if ( v0 != null) { // if-eqz v0, :cond_0
int v0 = 1; // const/4 v0, 0x1
} // :goto_0
} // :cond_0
int v0 = 0; // const/4 v0, 0x0
} // .end method
public void selectCameraByIndex ( Integer p0 ) {
/* .locals 1 */
/* .param p1, "cameraIndex" # I */
/* .prologue */
/* .line 98 */
/* iget v0, p0, Lcom/ansca/corona/CameraView;->fUsingCameraId:I */
/* if-ne p1, v0, :cond_1 */
/* .line 110 */
} // :cond_0
} // :goto_0
return;
/* .line 103 */
} // :cond_1
/* iput p1, p0, Lcom/ansca/corona/CameraView;->fUsingCameraId:I */
/* .line 106 */
v0 = (( com.ansca.corona.CameraView ) p0 ).isCameraEnabled ( ); // invoke-virtual {p0}, Lcom/ansca/corona/CameraView;->isCameraEnabled()Z
if ( v0 != null) { // if-eqz v0, :cond_0
/* .line 107 */
(( com.ansca.corona.CameraView ) p0 ).disableCamera ( ); // invoke-virtual {p0}, Lcom/ansca/corona/CameraView;->disableCamera()V
/* .line 108 */
(( com.ansca.corona.CameraView ) p0 ).enableCamera ( ); // invoke-virtual {p0}, Lcom/ansca/corona/CameraView;->enableCamera()V
} // .end method
public void setTakePictureListener ( android.hardware.Camera$PictureCallback p0 ) {
/* .locals 0 */
/* .param p1, "listener" # Landroid/hardware/Camera$PictureCallback; */
/* .prologue */
/* .line 87 */
this.fTakePictureListener = p1;
/* .line 88 */
return;
} // .end method
public void surfaceChanged ( android.view.SurfaceHolder p0, Integer p1, Integer p2, Integer p3 ) {
/* .locals 1 */
/* .param p1, "holder" # Landroid/view/SurfaceHolder; */
/* .param p2, "format" # I */
/* .param p3, "w" # I */
/* .param p4, "h" # I */
/* .prologue */
/* .line 241 */
v0 = (( com.ansca.corona.CameraView ) p0 ).isCameraEnabled ( ); // invoke-virtual {p0}, Lcom/ansca/corona/CameraView;->isCameraEnabled()Z
if ( v0 != null) { // if-eqz v0, :cond_0
/* .line 242 */
v0 = this.fCamera;
(( android.hardware.Camera ) v0 ).stopPreview ( ); // invoke-virtual {v0}, Landroid/hardware/Camera;->stopPreview()V
/* .line 243 */
/* invoke-direct {p0}, Lcom/ansca/corona/CameraView;->updateCameraOrientation()V */
/* .line 244 */
v0 = this.fCamera;
(( android.hardware.Camera ) v0 ).startPreview ( ); // invoke-virtual {v0}, Landroid/hardware/Camera;->startPreview()V
/* .line 246 */
} // :cond_0
return;
} // .end method
public void surfaceCreated ( android.view.SurfaceHolder p0 ) {
/* .locals 0 */
/* .param p1, "holder" # Landroid/view/SurfaceHolder; */
/* .prologue */
/* .line 229 */
this.fHolder = p1;
/* .line 230 */
(( com.ansca.corona.CameraView ) p0 ).enableCamera ( ); // invoke-virtual {p0}, Lcom/ansca/corona/CameraView;->enableCamera()V
/* .line 231 */
return;
} // .end method
public void surfaceDestroyed ( android.view.SurfaceHolder p0 ) {
/* .locals 0 */
/* .param p1, "holder" # Landroid/view/SurfaceHolder; */
/* .prologue */
/* .line 254 */
(( com.ansca.corona.CameraView ) p0 ).disableCamera ( ); // invoke-virtual {p0}, Lcom/ansca/corona/CameraView;->disableCamera()V
/* .line 255 */
return;
} // .end method
public void takePicture ( ) {
/* .locals 3 */
/* .prologue */
int v2 = 0; // const/4 v2, 0x0
/* .line 209 */
v0 = (( com.ansca.corona.CameraView ) p0 ).isCameraDisabled ( ); // invoke-virtual {p0}, Lcom/ansca/corona/CameraView;->isCameraDisabled()Z
if ( v0 != null) { // if-eqz v0, :cond_0
/* .line 221 */
} // :goto_0
return;
/* .line 215 */
} // :cond_0
v0 = this.fCamera;
(( android.hardware.Camera ) v0 ).stopPreview ( ); // invoke-virtual {v0}, Landroid/hardware/Camera;->stopPreview()V
/* .line 216 */
/* invoke-direct {p0}, Lcom/ansca/corona/CameraView;->updateCameraOrientation()V */
/* .line 217 */
v0 = this.fCamera;
(( android.hardware.Camera ) v0 ).startPreview ( ); // invoke-virtual {v0}, Landroid/hardware/Camera;->startPreview()V
/* .line 220 */
v0 = this.fCamera;
v1 = this.fTakePictureListener;
(( android.hardware.Camera ) v0 ).takePicture ( v2, v2, v1 ); // invoke-virtual {v0, v2, v2, v1}, Landroid/hardware/Camera;->takePicture(Landroid/hardware/Camera$ShutterCallback;Landroid/hardware/Camera$PictureCallback;Landroid/hardware/Camera$PictureCallback;)V
} // .end method
