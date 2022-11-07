class com.wiyun.engine.utils.ImagePickerActivity$3 implements android.hardware.Camera$PictureCallback {
	 /* # interfaces */
	 /* # instance fields */
	 final com.wiyun.engine.utils.ImagePickerActivity this$0; //synthetic
	 /* # direct methods */
	 com.wiyun.engine.utils.ImagePickerActivity$3 ( ) {
		 /* .locals 0 */
		 this.this$0 = p1;
		 /* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
		 return;
	 } // .end method
	 /* # virtual methods */
	 public void onPictureTaken ( Object[] p0, android.hardware.Camera p1 ) {
		 /* .locals 4 */
		 /* const/16 v3, 0x8 */
		 int v2 = 1; // const/4 v2, 0x1
		 int v1 = 0; // const/4 v1, 0x0
		 v0 = this.this$0;
		 com.wiyun.engine.utils.ImagePickerActivity .access$0 ( v0 );
		 (( android.widget.Button ) v0 ).setEnabled ( v2 ); // invoke-virtual {v0, v2}, Landroid/widget/Button;->setEnabled(Z)V
		 v0 = this.this$0;
		 com.wiyun.engine.utils.ImagePickerActivity .access$1 ( v0 );
		 (( android.widget.ImageButton ) v0 ).setEnabled ( v2 ); // invoke-virtual {v0, v2}, Landroid/widget/ImageButton;->setEnabled(Z)V
		 /* if-nez p1, :cond_0 */
		 v0 = this.this$0;
		 com.wiyun.engine.utils.ImagePickerActivity .access$2 ( v0 );
		 (( android.widget.Button ) v0 ).setVisibility ( v3 ); // invoke-virtual {v0, v3}, Landroid/widget/Button;->setVisibility(I)V
		 v0 = this.this$0;
		 com.wiyun.engine.utils.ImagePickerActivity .access$1 ( v0 );
		 (( android.widget.ImageButton ) v0 ).setVisibility ( v1 ); // invoke-virtual {v0, v1}, Landroid/widget/ImageButton;->setVisibility(I)V
		 v0 = this.this$0;
		 com.wiyun.engine.utils.ImagePickerActivity .access$3 ( v0 );
		 v0 = this.mCamera;
		 (( android.hardware.Camera ) v0 ).startPreview ( ); // invoke-virtual {v0}, Landroid/hardware/Camera;->startPreview()V
		 v0 = this.this$0;
		 com.wiyun.engine.utils.ImagePickerActivity .access$3 ( v0 );
		 v0 = this.mCamera;
		 v1 = this.this$0;
		 com.wiyun.engine.utils.ImagePickerActivity .access$4 ( v1 );
		 (( android.hardware.Camera ) v0 ).autoFocus ( v1 ); // invoke-virtual {v0, v1}, Landroid/hardware/Camera;->autoFocus(Landroid/hardware/Camera$AutoFocusCallback;)V
	 } // :goto_0
	 return;
} // :cond_0
v0 = this.this$0;
com.wiyun.engine.utils.ImagePickerActivity .access$5 ( v0,p1 );
v0 = this.this$0;
com.wiyun.engine.utils.ImagePickerActivity .access$1 ( v0 );
(( android.widget.ImageButton ) v0 ).setVisibility ( v3 ); // invoke-virtual {v0, v3}, Landroid/widget/ImageButton;->setVisibility(I)V
v0 = this.this$0;
com.wiyun.engine.utils.ImagePickerActivity .access$2 ( v0 );
(( android.widget.Button ) v0 ).setVisibility ( v1 ); // invoke-virtual {v0, v1}, Landroid/widget/Button;->setVisibility(I)V
} // .end method
