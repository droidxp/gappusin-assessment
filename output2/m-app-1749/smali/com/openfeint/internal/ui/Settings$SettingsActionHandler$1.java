class com.openfeint.internal.ui.Settings$SettingsActionHandler$1 implements com.openfeint.internal.request.IRawRequestDelegate {
	 /* .source "Settings.java" */
	 /* # interfaces */
	 /* # annotations */
	 /* .annotation system Ldalvik/annotation/EnclosingMethod; */
	 /* value = Lcom/openfeint/internal/ui/Settings$SettingsActionHandler;->logout(Ljava/util/Map;)V */
} // .end annotation
/* .annotation system Ldalvik/annotation/InnerClass; */
/* accessFlags = 0x0 */
/* name = null */
} // .end annotation
/* # instance fields */
final com.openfeint.internal.ui.Settings$SettingsActionHandler this$1; //synthetic
/* # direct methods */
 com.openfeint.internal.ui.Settings$SettingsActionHandler$1 ( ) {
/* .locals 0 */
/* .prologue */
/* .line 88 */
this.this$1 = p1;
/* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
return;
} // .end method
/* # virtual methods */
public void onResponse ( Integer p0, java.lang.String p1 ) {
/* .locals 1 */
/* .param p1, "responseCode" # I */
/* .param p2, "responseBody" # Ljava/lang/String; */
/* .prologue */
/* .line 91 */
v0 = this.this$1;
v0 = this.this$0;
(( com.openfeint.internal.ui.Settings ) v0 ).finish ( ); // invoke-virtual {v0}, Lcom/openfeint/internal/ui/Settings;->finish()V
/* .line 92 */
return;
} // .end method
