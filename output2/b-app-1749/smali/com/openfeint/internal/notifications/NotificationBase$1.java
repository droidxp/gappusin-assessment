class com.openfeint.internal.notifications.NotificationBase$1 implements java.lang.Runnable {
	 /* .source "NotificationBase.java" */
	 /* # interfaces */
	 /* # annotations */
	 /* .annotation system Ldalvik/annotation/EnclosingMethod; */
	 /* value = Lcom/openfeint/internal/notifications/NotificationBase;->showToast()V */
} // .end annotation
/* .annotation system Ldalvik/annotation/InnerClass; */
/* accessFlags = 0x0 */
/* name = null */
} // .end annotation
/* # instance fields */
final com.openfeint.internal.notifications.NotificationBase this$0; //synthetic
/* # direct methods */
 com.openfeint.internal.notifications.NotificationBase$1 ( ) {
/* .locals 0 */
/* .prologue */
/* .line 58 */
this.this$0 = p1;
/* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
return;
} // .end method
/* # virtual methods */
public void run ( ) {
/* .locals 4 */
/* .prologue */
int v3 = 0; // const/4 v3, 0x0
/* .line 60 */
com.openfeint.internal.OpenFeintInternal .getInstance ( );
(( com.openfeint.internal.OpenFeintInternal ) v1 ).getContext ( ); // invoke-virtual {v1}, Lcom/openfeint/internal/OpenFeintInternal;->getContext()Landroid/content/Context;
/* .line 61 */
/* .local v0, "appContext":Landroid/content/Context; */
v1 = this.this$0;
/* new-instance v2, Landroid/widget/Toast; */
/* invoke-direct {v2, v0}, Landroid/widget/Toast;-><init>(Landroid/content/Context;)V */
this.toast = v2;
/* .line 62 */
v1 = this.this$0;
v1 = this.toast;
/* const/16 v2, 0x50 */
(( android.widget.Toast ) v1 ).setGravity ( v2, v3, v3 ); // invoke-virtual {v1, v2, v3, v3}, Landroid/widget/Toast;->setGravity(III)V
/* .line 63 */
v1 = this.this$0;
v1 = this.toast;
int v2 = 1; // const/4 v2, 0x1
(( android.widget.Toast ) v1 ).setDuration ( v2 ); // invoke-virtual {v1, v2}, Landroid/widget/Toast;->setDuration(I)V
/* .line 64 */
v1 = this.this$0;
v1 = this.toast;
v2 = this.this$0;
v2 = this.displayView;
(( android.widget.Toast ) v1 ).setView ( v2 ); // invoke-virtual {v1, v2}, Landroid/widget/Toast;->setView(Landroid/view/View;)V
/* .line 65 */
v1 = this.this$0;
v1 = this.toast;
(( android.widget.Toast ) v1 ).show ( ); // invoke-virtual {v1}, Landroid/widget/Toast;->show()V
/* .line 66 */
return;
} // .end method
