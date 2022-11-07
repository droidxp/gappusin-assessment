class com.openfeint.internal.OpenFeintInternal$5 implements java.lang.Runnable {
	 /* .source "OpenFeintInternal.java" */
	 /* # interfaces */
	 /* # annotations */
	 /* .annotation system Ldalvik/annotation/EnclosingMethod; */
	 /* value = Lcom/openfeint/internal/OpenFeintInternal;->submitIntent(Landroid/content/Intent;Z)V */
} // .end annotation
/* .annotation system Ldalvik/annotation/InnerClass; */
/* accessFlags = 0x0 */
/* name = null */
} // .end annotation
/* # instance fields */
final com.openfeint.internal.OpenFeintInternal this$0; //synthetic
final android.content.Intent val$intent; //synthetic
/* # direct methods */
 com.openfeint.internal.OpenFeintInternal$5 ( ) {
/* .locals 0 */
/* .prologue */
/* .line 478 */
this.this$0 = p1;
this.val$intent = p2;
/* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
return;
} // .end method
/* # virtual methods */
public void run ( ) {
/* .locals 2 */
/* .prologue */
/* .line 480 */
v0 = this.val$intent;
/* const/high16 v1, 0x10000000 */
(( android.content.Intent ) v0 ).addFlags ( v1 ); // invoke-virtual {v0, v1}, Landroid/content/Intent;->addFlags(I)Landroid/content/Intent;
/* .line 481 */
v0 = this.this$0;
(( com.openfeint.internal.OpenFeintInternal ) v0 ).getContext ( ); // invoke-virtual {v0}, Lcom/openfeint/internal/OpenFeintInternal;->getContext()Landroid/content/Context;
v1 = this.val$intent;
(( android.content.Context ) v0 ).startActivity ( v1 ); // invoke-virtual {v0, v1}, Landroid/content/Context;->startActivity(Landroid/content/Intent;)V
/* .line 482 */
return;
} // .end method
