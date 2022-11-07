public class inal {
	 /* .source "NativeBrowser.java" */
	 /* # annotations */
	 /* .annotation system Ldalvik/annotation/EnclosingClass; */
	 /* value = Lcom/openfeint/internal/ui/NativeBrowser; */
} // .end annotation
/* .annotation system Ldalvik/annotation/InnerClass; */
/* accessFlags = 0x11 */
/* name = "JSInterface" */
} // .end annotation
/* # instance fields */
final com.openfeint.internal.ui.NativeBrowser this$0; //synthetic
/* # direct methods */
public inal ( ) {
/* .locals 0 */
/* .prologue */
/* .line 21 */
this.this$0 = p1;
/* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
return;
} // .end method
/* # virtual methods */
public void returnValue ( java.lang.String p0 ) {
/* .locals 2 */
/* .param p1, "returnValue" # Ljava/lang/String; */
/* .prologue */
/* .line 23 */
v0 = this.this$0;
/* new-instance v1, Lcom/openfeint/internal/ui/NativeBrowser$JSInterface$1; */
/* invoke-direct {v1, p0, p1}, Lcom/openfeint/internal/ui/NativeBrowser$JSInterface$1;-><init>(Lcom/openfeint/internal/ui/NativeBrowser$JSInterface;Ljava/lang/String;)V */
(( com.openfeint.internal.ui.NativeBrowser ) v0 ).runOnUiThread ( v1 ); // invoke-virtual {v0, v1}, Lcom/openfeint/internal/ui/NativeBrowser;->runOnUiThread(Ljava/lang/Runnable;)V
/* .line 33 */
return;
} // .end method
