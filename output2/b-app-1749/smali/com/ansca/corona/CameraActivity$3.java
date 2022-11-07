class com.ansca.corona.CameraActivity$3 implements android.view.View$OnClickListener {
	 /* .source "CameraActivity.java" */
	 /* # interfaces */
	 /* # annotations */
	 /* .annotation system Ldalvik/annotation/EnclosingMethod; */
	 /* value = Lcom/ansca/corona/CameraActivity;->onCreate(Landroid/os/Bundle;)V */
} // .end annotation
/* .annotation system Ldalvik/annotation/InnerClass; */
/* accessFlags = 0x0 */
/* name = null */
} // .end annotation
/* # instance fields */
final com.ansca.corona.CameraActivity this$0; //synthetic
/* # direct methods */
 com.ansca.corona.CameraActivity$3 ( ) {
/* .locals 0 */
/* .prologue */
/* .line 153 */
this.this$0 = p1;
/* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
return;
} // .end method
/* # virtual methods */
public void onClick ( android.view.View p0 ) {
/* .locals 3 */
/* .param p1, "view" # Landroid/view/View; */
/* .prologue */
/* .line 156 */
v1 = this.this$0;
com.ansca.corona.CameraActivity .access$200 ( v1 );
v1 = (( com.ansca.corona.CameraView ) v1 ).getSelectedCameraIndex ( ); // invoke-virtual {v1}, Lcom/ansca/corona/CameraView;->getSelectedCameraIndex()I
/* add-int/lit8 v1, v1, 0x1 */
v2 = com.ansca.corona.CameraServices .getCameraCount ( );
/* rem-int v0, v1, v2 */
/* .line 157 */
/* .local v0, "cameraIndex":I */
v1 = this.this$0;
com.ansca.corona.CameraActivity .access$200 ( v1 );
(( com.ansca.corona.CameraView ) v1 ).selectCameraByIndex ( v0 ); // invoke-virtual {v1, v0}, Lcom/ansca/corona/CameraView;->selectCameraByIndex(I)V
/* .line 158 */
return;
} // .end method
