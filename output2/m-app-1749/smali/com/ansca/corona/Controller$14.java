class com.ansca.corona.Controller$14 implements java.lang.Runnable {
	 /* .source "Controller.java" */
	 /* # interfaces */
	 /* # annotations */
	 /* .annotation system Ldalvik/annotation/EnclosingMethod; */
	 /* value = Lcom/ansca/corona/Controller;->showImagePickerWindow(ILjava/lang/String;)V */
} // .end annotation
/* .annotation system Ldalvik/annotation/InnerClass; */
/* accessFlags = 0x0 */
/* name = null */
} // .end annotation
/* # instance fields */
final com.ansca.corona.Controller this$0; //synthetic
final java.lang.String val$destinationFilePath; //synthetic
final Integer val$imageSourceType; //synthetic
/* # direct methods */
 com.ansca.corona.Controller$14 ( ) {
/* .locals 0 */
/* .prologue */
/* .line 815 */
this.this$0 = p1;
/* iput p2, p0, Lcom/ansca/corona/Controller$14;->val$imageSourceType:I */
this.val$destinationFilePath = p3;
/* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
return;
} // .end method
/* # virtual methods */
public void run ( ) {
/* .locals 2 */
/* .prologue */
/* .line 817 */
/* monitor-enter p0 */
/* .line 819 */
try { // :try_start_0
	 v0 = 	 com.ansca.corona.Controller .isValid ( );
	 /* if-nez v0, :cond_0 */
	 /* .line 820 */
	 /* monitor-exit p0 */
	 /* .line 839 */
} // :goto_0
return;
/* .line 824 */
} // :cond_0
/* iget v0, p0, Lcom/ansca/corona/Controller$14;->val$imageSourceType:I */
/* packed-switch v0, :pswitch_data_0 */
/* .line 835 */
final String v0 = "Corona"; // const-string v0, "Corona"
final String v1 = "media.show() does not support the given image source."; // const-string v1, "media.show() does not support the given image source."
android.util.Log .v ( v0,v1 );
/* .line 836 */
/* monitor-exit p0 */
/* .line 838 */
/* :catchall_0 */
/* move-exception v0 */
/* monitor-exit p0 */
/* :try_end_0 */
/* .catchall {:try_start_0 ..:try_end_0} :catchall_0 */
/* throw v0 */
/* .line 827 */
/* :pswitch_0 */
try { // :try_start_1
com.ansca.corona.Controller .getActivity ( );
v1 = this.val$destinationFilePath;
(( com.ansca.corona.CoronaActivity ) v0 ).showSelectImageWindowUsing ( v1 ); // invoke-virtual {v0, v1}, Lcom/ansca/corona/CoronaActivity;->showSelectImageWindowUsing(Ljava/lang/String;)V
/* .line 838 */
} // :goto_1
/* monitor-exit p0 */
/* .line 831 */
/* :pswitch_1 */
com.ansca.corona.Controller .getActivity ( );
v1 = this.val$destinationFilePath;
(( com.ansca.corona.CoronaActivity ) v0 ).showCameraWindowUsing ( v1 ); // invoke-virtual {v0, v1}, Lcom/ansca/corona/CoronaActivity;->showCameraWindowUsing(Ljava/lang/String;)V
/* :try_end_1 */
/* .catchall {:try_start_1 ..:try_end_1} :catchall_0 */
/* .line 824 */
/* nop */
/* :pswitch_data_0 */
/* .packed-switch 0x0 */
/* :pswitch_0 */
/* :pswitch_1 */
/* :pswitch_0 */
} // .end packed-switch
} // .end method
