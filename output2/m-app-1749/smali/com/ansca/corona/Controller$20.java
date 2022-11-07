class com.ansca.corona.Controller$20 implements java.lang.Runnable {
	 /* .source "Controller.java" */
	 /* # interfaces */
	 /* # annotations */
	 /* .annotation system Ldalvik/annotation/EnclosingMethod; */
	 /* value = Lcom/ansca/corona/Controller;->facebookDialog(Ljava/lang/String;Ljava/util/HashMap;)V */
} // .end annotation
/* .annotation system Ldalvik/annotation/InnerClass; */
/* accessFlags = 0x0 */
/* name = null */
} // .end annotation
/* # instance fields */
final com.ansca.corona.Controller this$0; //synthetic
final java.lang.String val$action; //synthetic
final java.util.HashMap val$params; //synthetic
/* # direct methods */
 com.ansca.corona.Controller$20 ( ) {
/* .locals 0 */
/* .prologue */
/* .line 1312 */
this.this$0 = p1;
this.val$action = p2;
this.val$params = p3;
/* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
return;
} // .end method
/* # virtual methods */
public void run ( ) {
/* .locals 5 */
/* .prologue */
/* .line 1314 */
v0 = this.this$0;
com.ansca.corona.Controller .access$600 ( v0 );
v1 = this.this$0;
com.ansca.corona.Controller .access$300 ( v1 );
v2 = this.val$action;
v3 = this.this$0;
v4 = this.val$params;
(( com.ansca.corona.Controller ) v3 ).createFacebookBundle ( v4 ); // invoke-virtual {v3, v4}, Lcom/ansca/corona/Controller;->createFacebookBundle(Ljava/util/HashMap;)Landroid/os/Bundle;
/* new-instance v4, Lcom/ansca/corona/Controller$20$1; */
/* invoke-direct {v4, p0}, Lcom/ansca/corona/Controller$20$1;-><init>(Lcom/ansca/corona/Controller$20;)V */
(( com.facebook.android.Facebook ) v0 ).dialog ( v1, v2, v3, v4 ); // invoke-virtual {v0, v1, v2, v3, v4}, Lcom/facebook/android/Facebook;->dialog(Landroid/content/Context;Ljava/lang/String;Landroid/os/Bundle;Lcom/facebook/android/Facebook$DialogListener;)V
/* .line 1341 */
return;
} // .end method
