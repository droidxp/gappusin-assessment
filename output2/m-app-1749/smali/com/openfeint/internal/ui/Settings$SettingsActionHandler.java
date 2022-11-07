class com.openfeint.internal.ui.Settings$SettingsActionHandler extends com.openfeint.internal.ui.WebNav$ActionHandler {
	 /* .source "Settings.java" */
	 /* # annotations */
	 /* .annotation system Ldalvik/annotation/EnclosingClass; */
	 /* value = Lcom/openfeint/internal/ui/Settings; */
} // .end annotation
/* .annotation system Ldalvik/annotation/InnerClass; */
/* accessFlags = 0x2 */
/* name = "SettingsActionHandler" */
} // .end annotation
/* # instance fields */
final com.openfeint.internal.ui.Settings this$0; //synthetic
/* # direct methods */
public com.openfeint.internal.ui.Settings$SettingsActionHandler ( ) {
/* .locals 0 */
/* .param p2, "webNav" # Lcom/openfeint/internal/ui/WebNav; */
/* .prologue */
/* .line 69 */
this.this$0 = p1;
/* .line 70 */
/* invoke-direct {p0, p1, p2}, Lcom/openfeint/internal/ui/WebNav$ActionHandler;-><init>(Lcom/openfeint/internal/ui/WebNav;Lcom/openfeint/internal/ui/WebNav;)V */
/* .line 71 */
return;
} // .end method
/* # virtual methods */
public void apiRequest ( java.util.Map p0 ) {
/* .locals 2 */
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
/* .line 82 */
/* .local p1, "options":Ljava/util/Map;, "Ljava/util/Map<Ljava/lang/String;Ljava/lang/String;>;" */
/* invoke-super {p0, p1}, Lcom/openfeint/internal/ui/WebNav$ActionHandler;->apiRequest(Ljava/util/Map;)V */
/* .line 83 */
com.openfeint.api.OpenFeint .getCurrentUser ( );
int v1 = 0; // const/4 v1, 0x0
(( com.openfeint.api.resource.CurrentUser ) v0 ).load ( v1 ); // invoke-virtual {v0, v1}, Lcom/openfeint/api/resource/CurrentUser;->load(Lcom/openfeint/api/resource/User$LoadCB;)V
/* .line 84 */
return;
} // .end method
public final void introFlow ( java.util.Map p0 ) {
/* .locals 4 */
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
/* .line 98 */
/* .local p1, "options":Ljava/util/Map;, "Ljava/util/Map<Ljava/lang/String;Ljava/lang/String;>;" */
v0 = this.this$0;
/* new-instance v1, Landroid/content/Intent; */
v2 = this.this$0;
/* const-class v3, Lcom/openfeint/internal/ui/IntroFlow; */
/* invoke-direct {v1, v2, v3}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V */
final String v2 = "content_name"; // const-string v2, "content_name"
final String v3 = "login?mode=switch"; // const-string v3, "login?mode=switch"
(( android.content.Intent ) v1 ).putExtra ( v2, v3 ); // invoke-virtual {v1, v2, v3}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;
(( com.openfeint.internal.ui.Settings ) v0 ).startActivity ( v1 ); // invoke-virtual {v0, v1}, Lcom/openfeint/internal/ui/Settings;->startActivity(Landroid/content/Intent;)V
/* .line 99 */
return;
} // .end method
public final void logout ( java.util.Map p0 ) {
/* .locals 2 */
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
/* .line 88 */
/* .local p1, "options":Ljava/util/Map;, "Ljava/util/Map<Ljava/lang/String;Ljava/lang/String;>;" */
com.openfeint.internal.OpenFeintInternal .getInstance ( );
/* new-instance v1, Lcom/openfeint/internal/ui/Settings$SettingsActionHandler$1; */
/* invoke-direct {v1, p0}, Lcom/openfeint/internal/ui/Settings$SettingsActionHandler$1;-><init>(Lcom/openfeint/internal/ui/Settings$SettingsActionHandler;)V */
(( com.openfeint.internal.OpenFeintInternal ) v0 ).logoutUser ( v1 ); // invoke-virtual {v0, v1}, Lcom/openfeint/internal/OpenFeintInternal;->logoutUser(Lcom/openfeint/internal/request/IRawRequestDelegate;)V
/* .line 94 */
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
/* .line 75 */
/* .local p1, "actionList":Ljava/util/List;, "Ljava/util/List<Ljava/lang/String;>;" */
/* invoke-super {p0, p1}, Lcom/openfeint/internal/ui/WebNav$ActionHandler;->populateActionList(Ljava/util/List;)V */
/* .line 76 */
final String v0 = "logout"; // const-string v0, "logout"
/* .line 77 */
final String v0 = "introFlow"; // const-string v0, "introFlow"
/* .line 78 */
return;
} // .end method
