class com.ansca.corona.Controller$13 implements java.lang.Runnable {
	 /* .source "Controller.java" */
	 /* # interfaces */
	 /* # annotations */
	 /* .annotation system Ldalvik/annotation/EnclosingMethod; */
	 /* value = Lcom/ansca/corona/Controller;->showNativeActivityIndicator()V */
} // .end annotation
/* .annotation system Ldalvik/annotation/InnerClass; */
/* accessFlags = 0x0 */
/* name = null */
} // .end annotation
/* # instance fields */
final com.ansca.corona.Controller this$0; //synthetic
/* # direct methods */
 com.ansca.corona.Controller$13 ( ) {
/* .locals 0 */
/* .prologue */
/* .line 740 */
this.this$0 = p1;
/* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
return;
} // .end method
/* # virtual methods */
public void run ( ) {
/* .locals 3 */
/* .prologue */
/* .line 742 */
/* monitor-enter p0 */
/* .line 744 */
try { // :try_start_0
	 v0 = 	 com.ansca.corona.Controller .isValid ( );
	 /* if-nez v0, :cond_0 */
	 /* .line 745 */
	 /* monitor-exit p0 */
	 /* .line 760 */
} // :goto_0
return;
/* .line 749 */
} // :cond_0
v0 = this.this$0;
com.ansca.corona.Controller .access$500 ( v0 );
/* if-nez v0, :cond_1 */
/* .line 750 */
v0 = this.this$0;
/* new-instance v1, Lcom/ansca/corona/ActivityIndicatorDialog; */
v2 = this.this$0;
com.ansca.corona.Controller .access$300 ( v2 );
/* invoke-direct {v1, v2}, Lcom/ansca/corona/ActivityIndicatorDialog;-><init>(Landroid/content/Context;)V */
com.ansca.corona.Controller .access$502 ( v0,v1 );
/* .line 751 */
v0 = this.this$0;
com.ansca.corona.Controller .access$500 ( v0 );
v1 = this.this$0;
com.ansca.corona.Controller .access$300 ( v1 );
(( com.ansca.corona.ActivityIndicatorDialog ) v0 ).setOwnerActivity ( v1 ); // invoke-virtual {v0, v1}, Lcom/ansca/corona/ActivityIndicatorDialog;->setOwnerActivity(Landroid/app/Activity;)V
/* .line 752 */
v0 = this.this$0;
com.ansca.corona.Controller .access$500 ( v0 );
int v1 = 0; // const/4 v1, 0x0
(( com.ansca.corona.ActivityIndicatorDialog ) v0 ).setCancelable ( v1 ); // invoke-virtual {v0, v1}, Lcom/ansca/corona/ActivityIndicatorDialog;->setCancelable(Z)V
/* .line 756 */
} // :cond_1
v0 = this.this$0;
com.ansca.corona.Controller .access$500 ( v0 );
v0 = (( com.ansca.corona.ActivityIndicatorDialog ) v0 ).isShowing ( ); // invoke-virtual {v0}, Lcom/ansca/corona/ActivityIndicatorDialog;->isShowing()Z
/* if-nez v0, :cond_2 */
/* .line 757 */
v0 = this.this$0;
com.ansca.corona.Controller .access$500 ( v0 );
(( com.ansca.corona.ActivityIndicatorDialog ) v0 ).show ( ); // invoke-virtual {v0}, Lcom/ansca/corona/ActivityIndicatorDialog;->show()V
/* .line 759 */
} // :cond_2
/* monitor-exit p0 */
/* :catchall_0 */
/* move-exception v0 */
/* monitor-exit p0 */
/* :try_end_0 */
/* .catchall {:try_start_0 ..:try_end_0} :catchall_0 */
/* throw v0 */
} // .end method
