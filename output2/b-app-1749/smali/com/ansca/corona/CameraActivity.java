public class com.ansca.corona.CameraActivity extends android.app.Activity {
	 /* .source "CameraActivity.java" */
	 /* # static fields */
	 private static Integer sNextImageFileNumber;
	 /* # instance fields */
	 private com.ansca.corona.CameraView fCameraView;
	 /* # direct methods */
	 static com.ansca.corona.CameraActivity ( ) {
		 /* .locals 1 */
		 /* .prologue */
		 /* .line 30 */
		 int v0 = 1; // const/4 v0, 0x1
		 return;
	 } // .end method
	 public com.ansca.corona.CameraActivity ( ) {
		 /* .locals 0 */
		 /* .prologue */
		 /* .line 25 */
		 /* invoke-direct {p0}, Landroid/app/Activity;-><init>()V */
		 return;
	 } // .end method
	 static Integer access$000 ( ) { //synthethic
		 /* .locals 1 */
		 /* .prologue */
		 /* .line 25 */
	 } // .end method
	 static Integer access$008 ( ) { //synthethic
		 /* .locals 2 */
		 /* .prologue */
		 /* .line 25 */
		 /* add-int/lit8 v1, v0, 0x1 */
	 } // .end method
	 static java.io.File access$100 ( android.content.Context p0, Integer p1 ) { //synthethic
		 /* .locals 1 */
		 /* .param p0, "x0" # Landroid/content/Context; */
		 /* .param p1, "x1" # I */
		 /* .prologue */
		 /* .line 25 */
		 com.ansca.corona.CameraActivity .createCameraShotFileObjectWith ( p0,p1 );
	 } // .end method
	 static com.ansca.corona.CameraView access$200 ( com.ansca.corona.CameraActivity p0 ) { //synthethic
		 /* .locals 1 */
		 /* .param p0, "x0" # Lcom/ansca/corona/CameraActivity; */
		 /* .prologue */
		 /* .line 25 */
		 v0 = this.fCameraView;
	 } // .end method
	 public static void clearCachedPhotos ( android.content.Context p0 ) {
		 /* .locals 4 */
		 /* .param p0, "context" # Landroid/content/Context; */
		 /* .prologue */
		 /* .line 188 */
		 int v2 = 1; // const/4 v2, 0x1
		 /* .local v2, "index":I */
	 } // :goto_0
	 /* if-ge v2, v3, :cond_1 */
	 /* .line 190 */
	 try { // :try_start_0
		 com.ansca.corona.CameraActivity .createCameraShotFileObjectWith ( p0,v2 );
		 /* .line 191 */
		 /* .local v1, "file":Ljava/io/File; */
		 if ( v1 != null) { // if-eqz v1, :cond_0
			 /* .line 192 */
			 (( java.io.File ) v1 ).delete ( ); // invoke-virtual {v1}, Ljava/io/File;->delete()Z
			 /* :try_end_0 */
			 /* .catch Ljava/lang/Exception; {:try_start_0 ..:try_end_0} :catch_0 */
			 /* .line 188 */
		 } // .end local v1 # "file":Ljava/io/File;
	 } // :cond_0
} // :goto_1
/* add-int/lit8 v2, v2, 0x1 */
/* .line 195 */
/* :catch_0 */
/* move-exception v0 */
/* .line 196 */
/* .local v0, "ex":Ljava/lang/Exception; */
(( java.lang.Exception ) v0 ).printStackTrace ( ); // invoke-virtual {v0}, Ljava/lang/Exception;->printStackTrace()V
/* .line 199 */
} // .end local v0 # "ex":Ljava/lang/Exception;
} // :cond_1
int v3 = 1; // const/4 v3, 0x1
/* .line 200 */
return;
} // .end method
private static java.io.File createCameraShotFileObjectWith ( android.content.Context p0, Integer p1 ) {
/* .locals 4 */
/* .param p0, "context" # Landroid/content/Context; */
/* .param p1, "number" # I */
/* .prologue */
/* .line 211 */
/* if-nez p0, :cond_0 */
/* .line 212 */
int v0 = 0; // const/4 v0, 0x0
/* .line 214 */
} // :goto_0
} // :cond_0
/* new-instance v0, Ljava/io/File; */
(( android.content.Context ) p0 ).getCacheDir ( ); // invoke-virtual {p0}, Landroid/content/Context;->getCacheDir()Ljava/io/File;
/* new-instance v2, Ljava/lang/StringBuilder; */
/* invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V */
final String v3 = "CameraShot"; // const-string v3, "CameraShot"
(( java.lang.StringBuilder ) v2 ).append ( v3 ); // invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
java.lang.Integer .toString ( p1 );
(( java.lang.StringBuilder ) v2 ).append ( v3 ); // invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
final String v3 = ".jpg"; // const-string v3, ".jpg"
(( java.lang.StringBuilder ) v2 ).append ( v3 ); // invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v2 ).toString ( ); // invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
/* invoke-direct {v0, v1, v2}, Ljava/io/File;-><init>(Ljava/io/File;Ljava/lang/String;)V */
} // .end method
/* # virtual methods */
protected void onCreate ( android.os.Bundle p0 ) {
/* .locals 10 */
/* .param p1, "savedInstanceState" # Landroid/os/Bundle; */
/* .prologue */
int v9 = 0; // const/4 v9, 0x0
int v8 = -2; // const/4 v8, -0x2
int v7 = 2; // const/4 v7, 0x2
/* .line 41 */
/* invoke-super {p0, p1}, Landroid/app/Activity;->onCreate(Landroid/os/Bundle;)V */
/* .line 46 */
/* new-instance v4, Landroid/widget/FrameLayout; */
/* invoke-direct {v4, p0}, Landroid/widget/FrameLayout;-><init>(Landroid/content/Context;)V */
/* .line 47 */
/* .local v4, "viewGroup":Landroid/widget/FrameLayout; */
(( com.ansca.corona.CameraActivity ) p0 ).setContentView ( v4 ); // invoke-virtual {p0, v4}, Lcom/ansca/corona/CameraActivity;->setContentView(Landroid/view/View;)V
/* .line 50 */
/* new-instance v5, Lcom/ansca/corona/CameraView; */
/* invoke-direct {v5, p0}, Lcom/ansca/corona/CameraView;-><init>(Landroid/content/Context;)V */
this.fCameraView = v5;
/* .line 51 */
v5 = this.fCameraView;
(( android.widget.FrameLayout ) v4 ).addView ( v5 ); // invoke-virtual {v4, v5}, Landroid/widget/FrameLayout;->addView(Landroid/view/View;)V
/* .line 55 */
v5 = this.fCameraView;
/* new-instance v6, Lcom/ansca/corona/CameraActivity$1; */
/* invoke-direct {v6, p0}, Lcom/ansca/corona/CameraActivity$1;-><init>(Lcom/ansca/corona/CameraActivity;)V */
(( com.ansca.corona.CameraView ) v5 ).setTakePictureListener ( v6 ); // invoke-virtual {v5, v6}, Lcom/ansca/corona/CameraView;->setTakePictureListener(Landroid/hardware/Camera$PictureCallback;)V
/* .line 116 */
/* new-instance v3, Landroid/widget/FrameLayout; */
/* invoke-direct {v3, p0}, Landroid/widget/FrameLayout;-><init>(Landroid/content/Context;)V */
/* .line 117 */
/* .local v3, "toolbarLayout":Landroid/widget/FrameLayout; */
/* const/16 v5, 0xc0 */
v5 = android.graphics.Color .argb ( v5,v9,v9,v9 );
(( android.widget.FrameLayout ) v3 ).setBackgroundColor ( v5 ); // invoke-virtual {v3, v5}, Landroid/widget/FrameLayout;->setBackgroundColor(I)V
/* .line 118 */
/* new-instance v1, Landroid/widget/FrameLayout$LayoutParams; */
int v5 = -1; // const/4 v5, -0x1
/* const/16 v6, 0x50 */
/* invoke-direct {v1, v5, v8, v6}, Landroid/widget/FrameLayout$LayoutParams;-><init>(III)V */
/* .line 122 */
/* .local v1, "layoutParams":Landroid/widget/FrameLayout$LayoutParams; */
(( android.widget.FrameLayout ) v4 ).addView ( v3, v1 ); // invoke-virtual {v4, v3, v1}, Landroid/widget/FrameLayout;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V
/* .line 125 */
/* new-instance v0, Landroid/widget/ImageButton; */
/* invoke-direct {v0, p0}, Landroid/widget/ImageButton;-><init>(Landroid/content/Context;)V */
/* .line 126 */
/* .local v0, "cameraButton":Landroid/widget/ImageButton; */
(( android.widget.ImageButton ) v0 ).setPadding ( v7, v7, v7, v7 ); // invoke-virtual {v0, v7, v7, v7, v7}, Landroid/widget/ImageButton;->setPadding(IIII)V
/* .line 127 */
(( android.widget.ImageButton ) v0 ).setBackgroundColor ( v9 ); // invoke-virtual {v0, v9}, Landroid/widget/ImageButton;->setBackgroundColor(I)V
/* .line 128 */
final String v5 = "ic_menu_camera"; // const-string v5, "ic_menu_camera"
v5 = com.ansca.corona.ResourceServices .getDrawableResourceId ( v5 );
(( android.widget.ImageButton ) v0 ).setImageResource ( v5 ); // invoke-virtual {v0, v5}, Landroid/widget/ImageButton;->setImageResource(I)V
/* .line 129 */
/* new-instance v1, Landroid/widget/FrameLayout$LayoutParams; */
} // .end local v1 # "layoutParams":Landroid/widget/FrameLayout$LayoutParams;
/* const/16 v5, 0x11 */
/* invoke-direct {v1, v8, v8, v5}, Landroid/widget/FrameLayout$LayoutParams;-><init>(III)V */
/* .line 133 */
/* .restart local v1 # "layoutParams":Landroid/widget/FrameLayout$LayoutParams; */
(( android.widget.FrameLayout ) v3 ).addView ( v0, v1 ); // invoke-virtual {v3, v0, v1}, Landroid/widget/FrameLayout;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V
/* .line 136 */
/* new-instance v5, Lcom/ansca/corona/CameraActivity$2; */
/* invoke-direct {v5, p0}, Lcom/ansca/corona/CameraActivity$2;-><init>(Lcom/ansca/corona/CameraActivity;)V */
(( android.widget.ImageButton ) v0 ).setOnClickListener ( v5 ); // invoke-virtual {v0, v5}, Landroid/widget/ImageButton;->setOnClickListener(Landroid/view/View$OnClickListener;)V
/* .line 143 */
v5 = com.ansca.corona.CameraServices .getCameraCount ( );
int v6 = 1; // const/4 v6, 0x1
/* if-le v5, v6, :cond_0 */
/* .line 144 */
/* new-instance v2, Landroid/widget/ImageButton; */
/* invoke-direct {v2, p0}, Landroid/widget/ImageButton;-><init>(Landroid/content/Context;)V */
/* .line 145 */
/* .local v2, "switchButton":Landroid/widget/ImageButton; */
(( android.widget.ImageButton ) v2 ).setPadding ( v7, v7, v7, v7 ); // invoke-virtual {v2, v7, v7, v7, v7}, Landroid/widget/ImageButton;->setPadding(IIII)V
/* .line 146 */
(( android.widget.ImageButton ) v2 ).setBackgroundColor ( v9 ); // invoke-virtual {v2, v9}, Landroid/widget/ImageButton;->setBackgroundColor(I)V
/* .line 147 */
final String v5 = "ic_menu_refresh"; // const-string v5, "ic_menu_refresh"
v5 = com.ansca.corona.ResourceServices .getDrawableResourceId ( v5 );
(( android.widget.ImageButton ) v2 ).setImageResource ( v5 ); // invoke-virtual {v2, v5}, Landroid/widget/ImageButton;->setImageResource(I)V
/* .line 148 */
/* new-instance v1, Landroid/widget/FrameLayout$LayoutParams; */
} // .end local v1 # "layoutParams":Landroid/widget/FrameLayout$LayoutParams;
/* const/16 v5, 0x15 */
/* invoke-direct {v1, v8, v8, v5}, Landroid/widget/FrameLayout$LayoutParams;-><init>(III)V */
/* .line 152 */
/* .restart local v1 # "layoutParams":Landroid/widget/FrameLayout$LayoutParams; */
(( android.widget.FrameLayout ) v3 ).addView ( v2, v1 ); // invoke-virtual {v3, v2, v1}, Landroid/widget/FrameLayout;->addView(Landroid/view/View;Landroid/view/ViewGroup$LayoutParams;)V
/* .line 153 */
/* new-instance v5, Lcom/ansca/corona/CameraActivity$3; */
/* invoke-direct {v5, p0}, Lcom/ansca/corona/CameraActivity$3;-><init>(Lcom/ansca/corona/CameraActivity;)V */
(( android.widget.ImageButton ) v2 ).setOnClickListener ( v5 ); // invoke-virtual {v2, v5}, Landroid/widget/ImageButton;->setOnClickListener(Landroid/view/View$OnClickListener;)V
/* .line 161 */
} // .end local v2 # "switchButton":Landroid/widget/ImageButton;
} // :cond_0
return;
} // .end method
public Boolean onKeyUp ( Integer p0, android.view.KeyEvent p1 ) {
/* .locals 1 */
/* .param p1, "keyCode" # I */
/* .param p2, "event" # Landroid/view/KeyEvent; */
/* .prologue */
/* .line 171 */
/* sparse-switch p1, :sswitch_data_0 */
/* .line 179 */
} // :goto_0
v0 = /* invoke-super {p0, p1, p2}, Landroid/app/Activity;->onKeyUp(ILandroid/view/KeyEvent;)Z */
/* .line 174 */
/* :sswitch_0 */
v0 = this.fCameraView;
(( com.ansca.corona.CameraView ) v0 ).takePicture ( ); // invoke-virtual {v0}, Lcom/ansca/corona/CameraView;->takePicture()V
/* .line 171 */
/* :sswitch_data_0 */
/* .sparse-switch */
/* 0x17 -> :sswitch_0 */
/* 0x1b -> :sswitch_0 */
} // .end sparse-switch
} // .end method
