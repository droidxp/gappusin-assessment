class com.ansca.corona.CameraActivity$2 implements android.view.View$OnClickListener {
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
 com.ansca.corona.CameraActivity$2 ( ) {
/* .locals 0 */
/* .prologue */
/* .line 136 */
this.this$0 = p1;
/* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
return;
} // .end method
/* # virtual methods */
public void onClick ( android.view.View p0 ) {
/* .locals 1 */
/* .param p1, "view" # Landroid/view/View; */
/* .prologue */
/* .line 138 */
v0 = this.this$0;
com.ansca.corona.CameraActivity .access$200 ( v0 );
(( com.ansca.corona.CameraView ) v0 ).takePicture ( ); // invoke-virtual {v0}, Lcom/ansca/corona/CameraView;->takePicture()V
/* .line 139 */
return;
} // .end method
