class com.ansca.corona.Controller$9 implements java.lang.Runnable {
	 /* .source "Controller.java" */
	 /* # interfaces */
	 /* # annotations */
	 /* .annotation system Ldalvik/annotation/EnclosingMethod; */
	 /* value = Lcom/ansca/corona/Controller;->showNativeAlert(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/String;)V */
} // .end annotation
/* .annotation system Ldalvik/annotation/InnerClass; */
/* accessFlags = 0x0 */
/* name = null */
} // .end annotation
/* # instance fields */
final com.ansca.corona.Controller this$0; //synthetic
final android.app.AlertDialog$Builder val$builder; //synthetic
/* # direct methods */
 com.ansca.corona.Controller$9 ( ) {
/* .locals 0 */
/* .prologue */
/* .line 672 */
this.this$0 = p1;
this.val$builder = p2;
/* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
return;
} // .end method
/* # virtual methods */
public void run ( ) {
/* .locals 2 */
/* .prologue */
/* .line 674 */
/* monitor-enter p0 */
/* .line 675 */
try { // :try_start_0
	 v0 = this.this$0;
	 v1 = this.val$builder;
	 (( android.app.AlertDialog$Builder ) v1 ).create ( ); // invoke-virtual {v1}, Landroid/app/AlertDialog$Builder;->create()Landroid/app/AlertDialog;
	 com.ansca.corona.Controller .access$402 ( v0,v1 );
	 /* .line 676 */
	 v0 = this.this$0;
	 com.ansca.corona.Controller .access$400 ( v0 );
	 int v1 = 0; // const/4 v1, 0x0
	 (( android.app.AlertDialog ) v0 ).setCanceledOnTouchOutside ( v1 ); // invoke-virtual {v0, v1}, Landroid/app/AlertDialog;->setCanceledOnTouchOutside(Z)V
	 /* .line 677 */
	 v0 = this.this$0;
	 com.ansca.corona.Controller .access$400 ( v0 );
	 (( android.app.AlertDialog ) v0 ).show ( ); // invoke-virtual {v0}, Landroid/app/AlertDialog;->show()V
	 /* .line 678 */
	 /* monitor-exit p0 */
	 /* .line 679 */
	 return;
	 /* .line 678 */
	 /* :catchall_0 */
	 /* move-exception v0 */
	 /* monitor-exit p0 */
	 /* :try_end_0 */
	 /* .catchall {:try_start_0 ..:try_end_0} :catchall_0 */
	 /* throw v0 */
} // .end method
