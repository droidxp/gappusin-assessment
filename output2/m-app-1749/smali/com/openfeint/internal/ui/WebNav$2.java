class com.openfeint.internal.ui.WebNav$2 {
	 /* .source "WebNav.java" */
	 /* # annotations */
	 /* .annotation system Ldalvik/annotation/EnclosingMethod; */
	 /* value = Lcom/openfeint/internal/ui/WebNav;->onCreate(Landroid/os/Bundle;)V */
} // .end annotation
/* .annotation system Ldalvik/annotation/InnerClass; */
/* accessFlags = 0x0 */
/* name = null */
} // .end annotation
/* # instance fields */
final com.openfeint.internal.ui.WebNav this$0; //synthetic
/* # direct methods */
 com.openfeint.internal.ui.WebNav$2 ( ) {
/* .locals 0 */
/* .prologue */
/* .line 131 */
this.this$0 = p1;
/* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
return;
} // .end method
/* # virtual methods */
public void action ( java.lang.String p0 ) {
/* .locals 2 */
/* .param p1, "actionUri" # Ljava/lang/String; */
/* .prologue */
/* .line 134 */
v0 = this.this$0;
/* new-instance v1, Lcom/openfeint/internal/ui/WebNav$2$1; */
/* invoke-direct {v1, p0, p1}, Lcom/openfeint/internal/ui/WebNav$2$1;-><init>(Lcom/openfeint/internal/ui/WebNav$2;Ljava/lang/String;)V */
(( com.openfeint.internal.ui.WebNav ) v0 ).runOnUiThread ( v1 ); // invoke-virtual {v0, v1}, Lcom/openfeint/internal/ui/WebNav;->runOnUiThread(Ljava/lang/Runnable;)V
/* .line 140 */
return;
} // .end method
public void frameworkLoaded ( ) {
/* .locals 2 */
/* .prologue */
/* .line 144 */
v0 = this.this$0;
int v1 = 1; // const/4 v1, 0x1
(( com.openfeint.internal.ui.WebNav ) v0 ).setFrameworkLoaded ( v1 ); // invoke-virtual {v0, v1}, Lcom/openfeint/internal/ui/WebNav;->setFrameworkLoaded(Z)V
/* .line 145 */
return;
} // .end method
