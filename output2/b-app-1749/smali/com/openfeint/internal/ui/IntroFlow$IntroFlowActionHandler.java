class com.openfeint.internal.ui.IntroFlow$IntroFlowActionHandler extends com.openfeint.internal.ui.WebNav$ActionHandler {
	 /* .source "IntroFlow.java" */
	 /* # annotations */
	 /* .annotation system Ldalvik/annotation/EnclosingClass; */
	 /* value = Lcom/openfeint/internal/ui/IntroFlow; */
} // .end annotation
/* .annotation system Ldalvik/annotation/InnerClass; */
/* accessFlags = 0x2 */
/* name = "IntroFlowActionHandler" */
} // .end annotation
/* # instance fields */
final com.openfeint.internal.ui.IntroFlow this$0; //synthetic
/* # direct methods */
public com.openfeint.internal.ui.IntroFlow$IntroFlowActionHandler ( ) {
/* .locals 0 */
/* .param p2, "webNav" # Lcom/openfeint/internal/ui/WebNav; */
/* .prologue */
/* .line 42 */
this.this$0 = p1;
/* .line 43 */
/* invoke-direct {p0, p1, p2}, Lcom/openfeint/internal/ui/WebNav$ActionHandler;-><init>(Lcom/openfeint/internal/ui/WebNav;Lcom/openfeint/internal/ui/WebNav;)V */
/* .line 44 */
return;
} // .end method
/* # virtual methods */
public final void cacheImage ( java.util.Map p0 ) {
/* .locals 1 */
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
/* .line 93 */
/* .local p1, "options":Ljava/util/Map;, "Ljava/util/Map<Ljava/lang/String;Ljava/lang/String;>;" */
v0 = this.this$0;
com.openfeint.internal.ImagePicker .show ( v0 );
/* .line 94 */
return;
} // .end method
public final void clearImage ( java.util.Map p0 ) {
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
/* .line 107 */
/* .local p1, "options":Ljava/util/Map;, "Ljava/util/Map<Ljava/lang/String;Ljava/lang/String;>;" */
v0 = this.this$0;
int v1 = 0; // const/4 v1, 0x0
this.cachedImage = v1;
/* .line 108 */
return;
} // .end method
public final void createUser ( java.util.Map p0 ) {
/* .locals 6 */
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
/* .line 60 */
/* .local p1, "options":Ljava/util/Map;, "Ljava/util/Map<Ljava/lang/String;Ljava/lang/String;>;" */
com.openfeint.internal.OpenFeintInternal .getInstance ( );
final String v1 = "name"; // const-string v1, "name"
/* check-cast v1, Ljava/lang/String; */
final String v2 = "email"; // const-string v2, "email"
/* check-cast v2, Ljava/lang/String; */
final String v3 = "password"; // const-string v3, "password"
/* check-cast v3, Ljava/lang/String; */
final String v4 = "password_confirmation"; // const-string v4, "password_confirmation"
/* check-cast v4, Ljava/lang/String; */
/* new-instance v5, Lcom/openfeint/internal/ui/IntroFlow$IntroFlowActionHandler$1; */
/* invoke-direct {v5, p0, p1}, Lcom/openfeint/internal/ui/IntroFlow$IntroFlowActionHandler$1;-><init>(Lcom/openfeint/internal/ui/IntroFlow$IntroFlowActionHandler;Ljava/util/Map;)V */
/* invoke-virtual/range {v0 ..v5}, Lcom/openfeint/internal/OpenFeintInternal;->createUser(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/openfeint/internal/request/IRawRequestDelegate;)V */
/* .line 73 */
return;
} // .end method
public void decline ( java.util.Map p0 ) {
/* .locals 1 */
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
/* .line 112 */
/* .local p1, "options":Ljava/util/Map;, "Ljava/util/Map<Ljava/lang/String;Ljava/lang/String;>;" */
com.openfeint.api.OpenFeint .userDeclinedFeint ( );
/* .line 113 */
v0 = this.this$0;
(( com.openfeint.internal.ui.IntroFlow ) v0 ).finish ( ); // invoke-virtual {v0}, Lcom/openfeint/internal/ui/IntroFlow;->finish()V
/* .line 114 */
return;
} // .end method
public void getEmail ( java.util.Map p0 ) {
/* .locals 6 */
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
/* .line 118 */
/* .local p1, "options":Ljava/util/Map;, "Ljava/util/Map<Ljava/lang/String;Ljava/lang/String;>;" */
v1 = this.this$0;
com.openfeint.internal.Util5 .getAccountNameEclair ( v1 );
/* .line 119 */
/* .local v0, "account":Ljava/lang/String; */
if ( v0 != null) { // if-eqz v0, :cond_0
/* .line 120 */
v1 = this.this$0;
final String v2 = "%s(\'%s\');"; // const-string v2, "%s(\'%s\');"
int v3 = 2; // const/4 v3, 0x2
/* new-array v3, v3, [Ljava/lang/Object; */
int v4 = 0; // const/4 v4, 0x0
final String v5 = "callback"; // const-string v5, "callback"
/* aput-object v5, v3, v4 */
int v4 = 1; // const/4 v4, 0x1
/* aput-object v0, v3, v4 */
java.lang.String .format ( v2,v3 );
(( com.openfeint.internal.ui.IntroFlow ) v1 ).executeJavascript ( v2 ); // invoke-virtual {v1, v2}, Lcom/openfeint/internal/ui/IntroFlow;->executeJavascript(Ljava/lang/String;)V
/* .line 122 */
} // :cond_0
return;
} // .end method
public final void loginUser ( java.util.Map p0 ) {
/* .locals 5 */
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
/* .line 77 */
/* .local p1, "options":Ljava/util/Map;, "Ljava/util/Map<Ljava/lang/String;Ljava/lang/String;>;" */
com.openfeint.internal.OpenFeintInternal .getInstance ( );
final String v0 = "email"; // const-string v0, "email"
/* check-cast v0, Ljava/lang/String; */
final String v1 = "password"; // const-string v1, "password"
/* check-cast v1, Ljava/lang/String; */
final String v2 = "user_id"; // const-string v2, "user_id"
/* check-cast v2, Ljava/lang/String; */
/* new-instance v4, Lcom/openfeint/internal/ui/IntroFlow$IntroFlowActionHandler$2; */
/* invoke-direct {v4, p0, p1}, Lcom/openfeint/internal/ui/IntroFlow$IntroFlowActionHandler$2;-><init>(Lcom/openfeint/internal/ui/IntroFlow$IntroFlowActionHandler;Ljava/util/Map;)V */
(( com.openfeint.internal.OpenFeintInternal ) v3 ).loginUser ( v0, v1, v2, v4 ); // invoke-virtual {v3, v0, v1, v2, v4}, Lcom/openfeint/internal/OpenFeintInternal;->loginUser(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/openfeint/internal/request/IRawRequestDelegate;)V
/* .line 89 */
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
/* .line 48 */
/* .local p1, "actionList":Ljava/util/List;, "Ljava/util/List<Ljava/lang/String;>;" */
/* invoke-super {p0, p1}, Lcom/openfeint/internal/ui/WebNav$ActionHandler;->populateActionList(Ljava/util/List;)V */
/* .line 49 */
final String v0 = "createUser"; // const-string v0, "createUser"
/* .line 50 */
final String v0 = "loginUser"; // const-string v0, "loginUser"
/* .line 51 */
final String v0 = "cacheImage"; // const-string v0, "cacheImage"
/* .line 52 */
final String v0 = "uploadImage"; // const-string v0, "uploadImage"
/* .line 53 */
final String v0 = "clearImage"; // const-string v0, "clearImage"
/* .line 54 */
final String v0 = "decline"; // const-string v0, "decline"
/* .line 55 */
final String v0 = "getEmail"; // const-string v0, "getEmail"
/* .line 56 */
return;
} // .end method
public final void uploadImage ( java.util.Map p0 ) {
/* .locals 3 */
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
/* .line 99 */
/* .local p1, "options":Ljava/util/Map;, "Ljava/util/Map<Ljava/lang/String;Ljava/lang/String;>;" */
v1 = this.this$0;
v1 = this.cachedImage;
if ( v1 != null) { // if-eqz v1, :cond_0
/* .line 100 */
/* new-instance v1, Ljava/lang/StringBuilder; */
/* invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V */
final String v2 = "/xp/users/"; // const-string v2, "/xp/users/"
(( java.lang.StringBuilder ) v1 ).append ( v2 ); // invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
com.openfeint.internal.OpenFeintInternal .getInstance ( );
(( com.openfeint.internal.OpenFeintInternal ) v2 ).getCurrentUser ( ); // invoke-virtual {v2}, Lcom/openfeint/internal/OpenFeintInternal;->getCurrentUser()Lcom/openfeint/api/resource/CurrentUser;
(( com.openfeint.api.resource.CurrentUser ) v2 ).resourceID ( ); // invoke-virtual {v2}, Lcom/openfeint/api/resource/CurrentUser;->resourceID()Ljava/lang/String;
(( java.lang.StringBuilder ) v1 ).append ( v2 ); // invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
final String v2 = "/profile_picture"; // const-string v2, "/profile_picture"
(( java.lang.StringBuilder ) v1 ).append ( v2 ); // invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v1 ).toString ( ); // invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
/* .line 101 */
/* .local v0, "apiUrl":Ljava/lang/String; */
v1 = this.this$0;
v1 = this.cachedImage;
int v2 = 0; // const/4 v2, 0x0
com.openfeint.internal.ImagePicker .compressAndUpload ( v1,v0,v2 );
/* .line 103 */
} // .end local v0 # "apiUrl":Ljava/lang/String;
} // :cond_0
return;
} // .end method
