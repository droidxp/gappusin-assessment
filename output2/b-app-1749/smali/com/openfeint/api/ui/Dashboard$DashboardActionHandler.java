class com.openfeint.api.ui.Dashboard$DashboardActionHandler extends com.openfeint.internal.ui.WebNav$ActionHandler {
	 /* .source "Dashboard.java" */
	 /* # annotations */
	 /* .annotation system Ldalvik/annotation/EnclosingClass; */
	 /* value = Lcom/openfeint/api/ui/Dashboard; */
} // .end annotation
/* .annotation system Ldalvik/annotation/InnerClass; */
/* accessFlags = 0x2 */
/* name = "DashboardActionHandler" */
} // .end annotation
/* # instance fields */
final com.openfeint.api.ui.Dashboard this$0; //synthetic
/* # direct methods */
public com.openfeint.api.ui.Dashboard$DashboardActionHandler ( ) {
/* .locals 0 */
/* .param p2, "webNav" # Lcom/openfeint/internal/ui/WebNav; */
/* .prologue */
/* .line 192 */
this.this$0 = p1;
/* .line 193 */
/* invoke-direct {p0, p1, p2}, Lcom/openfeint/internal/ui/WebNav$ActionHandler;-><init>(Lcom/openfeint/internal/ui/WebNav;Lcom/openfeint/internal/ui/WebNav;)V */
/* .line 194 */
return;
} // .end method
/* # virtual methods */
public final void openSettings ( java.util.Map p0 ) {
/* .locals 0 */
/* .annotation system Ldalvik/annotation/Signature; */
/* value = { */
/* "(", */
/* "Ljava/util/Map", */
/* "<", */
/* "Ljava/lang/String;", */
/* "Ljava/lang/String;", */
/* ">;)V" */
/* } */
} // .end annotation
/* .prologue */
/* .line 204 */
/* .local p1, "options":Ljava/util/Map;, "Ljava/util/Map<Ljava/lang/String;Ljava/lang/String;>;" */
com.openfeint.internal.ui.Settings .open ( );
/* .line 205 */
return;
} // .end method
protected void populateActionList ( java.util.List p0 ) {
/* .locals 1 */
/* .annotation system Ldalvik/annotation/Signature; */
/* value = { */
/* "(", */
/* "Ljava/util/List", */
/* "<", */
/* "Ljava/lang/String;", */
/* ">;)V" */
/* } */
} // .end annotation
/* .prologue */
/* .line 198 */
/* .local p1, "actionList":Ljava/util/List;, "Ljava/util/List<Ljava/lang/String;>;" */
/* invoke-super {p0, p1}, Lcom/openfeint/internal/ui/WebNav$ActionHandler;->populateActionList(Ljava/util/List;)V */
/* .line 199 */
final String v0 = "openSettings"; // const-string v0, "openSettings"
/* .line 200 */
return;
} // .end method
