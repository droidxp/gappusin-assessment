class com.ansca.corona.Controller$17 implements java.lang.Runnable {
	 /* .source "Controller.java" */
	 /* # interfaces */
	 /* # annotations */
	 /* .annotation system Ldalvik/annotation/EnclosingMethod; */
	 /* value = Lcom/ansca/corona/Controller;->facebookLogin(Ljava/lang/String;[Ljava/lang/String;)V */
} // .end annotation
/* .annotation system Ldalvik/annotation/InnerClass; */
/* accessFlags = 0x0 */
/* name = null */
} // .end annotation
/* # instance fields */
final com.ansca.corona.Controller this$0; //synthetic
final java.lang.String val$permissions; //synthetic
/* # direct methods */
 com.ansca.corona.Controller$17 ( ) {
/* .locals 0 */
/* .prologue */
/* .line 1108 */
this.this$0 = p1;
this.val$permissions = p2;
/* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
return;
} // .end method
/* # virtual methods */
public void run ( ) {
/* .locals 5 */
/* .prologue */
/* .line 1110 */
v0 = this.this$0;
com.ansca.corona.Controller .access$600 ( v0 );
v1 = this.this$0;
com.ansca.corona.Controller .access$300 ( v1 );
v2 = this.val$permissions;
int v3 = 5; // const/4 v3, 0x5
/* new-instance v4, Lcom/ansca/corona/Controller$17$1; */
/* invoke-direct {v4, p0}, Lcom/ansca/corona/Controller$17$1;-><init>(Lcom/ansca/corona/Controller$17;)V */
(( com.facebook.android.Facebook ) v0 ).authorize ( v1, v2, v3, v4 ); // invoke-virtual {v0, v1, v2, v3, v4}, Lcom/facebook/android/Facebook;->authorize(Landroid/app/Activity;[Ljava/lang/String;ILcom/facebook/android/Facebook$DialogListener;)V
/* .line 1160 */
return;
} // .end method
