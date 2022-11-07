public class com.openfeint.api.ui.Dashboard extends com.openfeint.internal.ui.WebNav {
	 /* .source "Dashboard.java" */
	 /* # annotations */
	 /* .annotation system Ldalvik/annotation/MemberClasses; */
	 /* value = { */
	 /* Lcom/openfeint/api/ui/Dashboard$DashboardActionHandler; */
	 /* } */
} // .end annotation
/* # static fields */
private static java.util.List sOpenDashboards;
/* .annotation system Ldalvik/annotation/Signature; */
/* value = { */
/* "Ljava/util/List", */
/* "<", */
/* "Lcom/openfeint/api/ui/Dashboard;", */
/* ">;" */
/* } */
} // .end annotation
} // .end field
/* # instance fields */
Boolean mRootIsHome;
/* # direct methods */
static com.openfeint.api.ui.Dashboard ( ) {
/* .locals 1 */
/* .prologue */
/* .line 31 */
/* new-instance v0, Ljava/util/ArrayList; */
/* invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V */
return;
} // .end method
public com.openfeint.api.ui.Dashboard ( ) {
/* .locals 1 */
/* .prologue */
/* .line 28 */
/* invoke-direct {p0}, Lcom/openfeint/internal/ui/WebNav;-><init>()V */
/* .line 30 */
int v0 = 1; // const/4 v0, 0x1
/* iput-boolean v0, p0, Lcom/openfeint/api/ui/Dashboard;->mRootIsHome:Z */
/* .line 28 */
return;
} // .end method
public static void close ( ) {
/* .locals 3 */
/* .prologue */
/* .line 47 */
v2 = com.openfeint.api.ui.Dashboard.sOpenDashboards;
/* .local v1, "i$":Ljava/util/Iterator; */
v2 = } // :goto_0
if ( v2 != null) { // if-eqz v2, :cond_0
/* check-cast v0, Lcom/openfeint/api/ui/Dashboard; */
/* .line 48 */
/* .local v0, "d":Lcom/openfeint/api/ui/Dashboard; */
(( com.openfeint.api.ui.Dashboard ) v0 ).finish ( ); // invoke-virtual {v0}, Lcom/openfeint/api/ui/Dashboard;->finish()V
/* .line 50 */
} // .end local v0 # "d":Lcom/openfeint/api/ui/Dashboard;
} // :cond_0
return;
} // .end method
public static void open ( ) {
/* .locals 2 */
/* .prologue */
/* .line 37 */
int v0 = 0; // const/4 v0, 0x0
int v1 = 0; // const/4 v1, 0x0
com.openfeint.api.ui.Dashboard .open ( v0,v1 );
/* .line 38 */
return;
} // .end method
private static void open ( java.lang.String p0, Boolean p1 ) {
/* .locals 7 */
/* .param p0, "screenName" # Ljava/lang/String; */
/* .param p1, "spotlight" # Z */
/* .prologue */
/* .line 91 */
com.openfeint.api.OpenFeint .trySubmitOfflineData ( );
/* .line 93 */
com.openfeint.internal.OpenFeintInternal .getInstance ( );
/* .line 95 */
/* .local v1, "ofi":Lcom/openfeint/internal/OpenFeintInternal; */
v3 = (( com.openfeint.internal.OpenFeintInternal ) v1 ).isFeintServerReachable ( ); // invoke-virtual {v1}, Lcom/openfeint/internal/OpenFeintInternal;->isFeintServerReachable()Z
/* if-nez v3, :cond_0 */
/* .line 96 */
com.openfeint.internal.OpenFeintInternal .getInstance ( );
(( com.openfeint.internal.OpenFeintInternal ) v3 ).getContext ( ); // invoke-virtual {v3}, Lcom/openfeint/internal/OpenFeintInternal;->getContext()Landroid/content/Context;
(( android.content.Context ) v3 ).getResources ( ); // invoke-virtual {v3}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;
/* .line 97 */
/* .local v2, "r":Landroid/content/res/Resources; */
(( android.content.res.Resources ) v2 ).getString ( v3 ); // invoke-virtual {v2, v3}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;
(( android.content.res.Resources ) v2 ).getString ( v4 ); // invoke-virtual {v2, v4}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;
v5 = com.openfeint.api.Notification$Category.Foreground;
v6 = com.openfeint.api.Notification$Type.NetworkOffline;
com.openfeint.internal.notifications.TwoLineNotification .show ( v3,v4,v5,v6 );
/* .line 107 */
} // .end local v2 # "r":Landroid/content/res/Resources;
} // :goto_0
return;
/* .line 103 */
} // :cond_0
(( com.openfeint.internal.OpenFeintInternal ) v1 ).getAnalytics ( ); // invoke-virtual {v1}, Lcom/openfeint/internal/OpenFeintInternal;->getAnalytics()Lcom/openfeint/internal/Analytics;
(( com.openfeint.internal.Analytics ) v3 ).markDashboardOpen ( ); // invoke-virtual {v3}, Lcom/openfeint/internal/Analytics;->markDashboardOpen()V
/* .line 104 */
/* new-instance v0, Landroid/content/Intent; */
(( com.openfeint.internal.OpenFeintInternal ) v1 ).getContext ( ); // invoke-virtual {v1}, Lcom/openfeint/internal/OpenFeintInternal;->getContext()Landroid/content/Context;
/* const-class v4, Lcom/openfeint/api/ui/Dashboard; */
/* invoke-direct {v0, v3, v4}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V */
/* .line 105 */
/* .local v0, "intent":Landroid/content/Intent; */
if ( p0 != null) { // if-eqz p0, :cond_1
final String v3 = "screenName"; // const-string v3, "screenName"
(( android.content.Intent ) v0 ).putExtra ( v3, p0 ); // invoke-virtual {v0, v3, p0}, Landroid/content/Intent;->putExtra(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;
/* .line 106 */
} // :cond_1
(( com.openfeint.internal.OpenFeintInternal ) v1 ).submitIntent ( v0, p1 ); // invoke-virtual {v1, v0, p1}, Lcom/openfeint/internal/OpenFeintInternal;->submitIntent(Landroid/content/Intent;Z)V
} // .end method
public static void openAchievements ( ) {
/* .locals 2 */
/* .prologue */
/* .line 72 */
final String v0 = "achievements"; // const-string v0, "achievements"
int v1 = 0; // const/4 v1, 0x0
com.openfeint.api.ui.Dashboard .open ( v0,v1 );
/* .line 73 */
return;
} // .end method
public static void openFromSpotlight ( ) {
/* .locals 2 */
/* .prologue */
/* .line 41 */
final String v0 = "user.json?spotlight=true"; // const-string v0, "user.json?spotlight=true"
int v1 = 1; // const/4 v1, 0x1
com.openfeint.api.ui.Dashboard .open ( v0,v1 );
/* .line 42 */
return;
} // .end method
public static void openGameDetail ( java.lang.String p0 ) {
/* .locals 2 */
/* .param p0, "appId" # Ljava/lang/String; */
/* .prologue */
/* .line 81 */
/* new-instance v0, Ljava/lang/StringBuilder; */
/* invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V */
final String v1 = "game?game_id="; // const-string v1, "game?game_id="
(( java.lang.StringBuilder ) v0 ).append ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v0 ).append ( p0 ); // invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v0 ).toString ( ); // invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
int v1 = 0; // const/4 v1, 0x0
com.openfeint.api.ui.Dashboard .open ( v0,v1 );
/* .line 82 */
return;
} // .end method
public static void openLeaderboard ( java.lang.String p0 ) {
/* .locals 2 */
/* .param p0, "leaderboardId" # Ljava/lang/String; */
/* .prologue */
/* .line 65 */
/* new-instance v0, Ljava/lang/StringBuilder; */
/* invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V */
final String v1 = "leaderboard?leaderboard_id="; // const-string v1, "leaderboard?leaderboard_id="
(( java.lang.StringBuilder ) v0 ).append ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v0 ).append ( p0 ); // invoke-virtual {v0, p0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v0 ).toString ( ); // invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
int v1 = 0; // const/4 v1, 0x0
com.openfeint.api.ui.Dashboard .open ( v0,v1 );
/* .line 66 */
return;
} // .end method
public static void openLeaderboards ( ) {
/* .locals 2 */
/* .prologue */
/* .line 56 */
final String v0 = "leaderboards"; // const-string v0, "leaderboards"
int v1 = 0; // const/4 v1, 0x0
com.openfeint.api.ui.Dashboard .open ( v0,v1 );
/* .line 57 */
return;
} // .end method
/* # virtual methods */
protected com.openfeint.internal.ui.WebNav$ActionHandler createActionHandler ( com.openfeint.internal.ui.WebNav p0 ) {
/* .locals 1 */
/* .param p1, "webNav" # Lcom/openfeint/internal/ui/WebNav; */
/* .prologue */
/* .line 188 */
/* new-instance v0, Lcom/openfeint/api/ui/Dashboard$DashboardActionHandler; */
/* invoke-direct {v0, p0, p1}, Lcom/openfeint/api/ui/Dashboard$DashboardActionHandler;-><init>(Lcom/openfeint/api/ui/Dashboard;Lcom/openfeint/internal/ui/WebNav;)V */
} // .end method
protected java.lang.String initialContentPath ( ) {
/* .locals 3 */
/* .prologue */
/* .line 174 */
(( com.openfeint.api.ui.Dashboard ) p0 ).getIntent ( ); // invoke-virtual {p0}, Lcom/openfeint/api/ui/Dashboard;->getIntent()Landroid/content/Intent;
final String v2 = "screenName"; // const-string v2, "screenName"
(( android.content.Intent ) v1 ).getStringExtra ( v2 ); // invoke-virtual {v1, v2}, Landroid/content/Intent;->getStringExtra(Ljava/lang/String;)Ljava/lang/String;
/* .line 175 */
/* .local v0, "screenName":Ljava/lang/String; */
if ( v0 != null) { // if-eqz v0, :cond_0
/* .line 176 */
int v1 = 0; // const/4 v1, 0x0
/* iput-boolean v1, p0, Lcom/openfeint/api/ui/Dashboard;->mRootIsHome:Z */
/* .line 177 */
/* new-instance v1, Ljava/lang/StringBuilder; */
/* invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V */
final String v2 = "dashboard/"; // const-string v2, "dashboard/"
(( java.lang.StringBuilder ) v1 ).append ( v2 ); // invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v1 ).append ( v0 ); // invoke-virtual {v1, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v1 ).toString ( ); // invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
/* .line 179 */
} // :goto_0
} // :cond_0
final String v1 = "dashboard/user"; // const-string v1, "dashboard/user"
} // .end method
public Boolean onCreateOptionsMenu ( android.view.Menu p0 ) {
/* .locals 2 */
/* .param p1, "menu" # Landroid/view/Menu; */
/* .prologue */
/* .line 131 */
(( com.openfeint.api.ui.Dashboard ) p0 ).getMenuInflater ( ); // invoke-virtual {p0}, Lcom/openfeint/api/ui/Dashboard;->getMenuInflater()Landroid/view/MenuInflater;
(( android.view.MenuInflater ) v0 ).inflate ( v1, p1 ); // invoke-virtual {v0, v1, p1}, Landroid/view/MenuInflater;->inflate(ILandroid/view/Menu;)V
/* .line 132 */
int v0 = 1; // const/4 v0, 0x1
} // .end method
public void onDestroy ( ) {
/* .locals 1 */
/* .prologue */
/* .line 121 */
/* invoke-super {p0}, Lcom/openfeint/internal/ui/WebNav;->onDestroy()V */
/* .line 122 */
v0 = com.openfeint.api.ui.Dashboard.sOpenDashboards;
/* .line 123 */
com.openfeint.internal.OpenFeintInternal .getInstance ( );
(( com.openfeint.internal.OpenFeintInternal ) v0 ).getAnalytics ( ); // invoke-virtual {v0}, Lcom/openfeint/internal/OpenFeintInternal;->getAnalytics()Lcom/openfeint/internal/Analytics;
(( com.openfeint.internal.Analytics ) v0 ).markDashboardClose ( ); // invoke-virtual {v0}, Lcom/openfeint/internal/Analytics;->markDashboardClose()V
/* .line 124 */
return;
} // .end method
public Boolean onOptionsItemSelected ( android.view.MenuItem p0 ) {
/* .locals 5 */
/* .param p1, "item" # Landroid/view/MenuItem; */
/* .prologue */
int v1 = 1; // const/4 v1, 0x1
/* .line 151 */
int v0 = 0; // const/4 v0, 0x0
/* .line 153 */
v2 = /* .local v0, "menuButtonName":Ljava/lang/String; */
/* if-ne v2, v3, :cond_1 */
/* .line 154 */
final String v0 = "home"; // const-string v0, "home"
/* .line 155 */
/* iput-boolean v1, p0, Lcom/openfeint/api/ui/Dashboard;->mRootIsHome:Z */
/* .line 162 */
} // :cond_0
} // :goto_0
/* if-nez v0, :cond_3 */
v1 = /* invoke-super {p0, p1}, Lcom/openfeint/internal/ui/WebNav;->onOptionsItemSelected(Landroid/view/MenuItem;)Z */
/* .line 165 */
} // :goto_1
/* .line 156 */
v2 = } // :cond_1
/* if-ne v2, v3, :cond_2 */
/* .line 157 */
final String v0 = "settings"; // const-string v0, "settings"
/* .line 158 */
v2 = } // :cond_2
/* if-ne v2, v3, :cond_0 */
/* .line 159 */
final String v0 = "exit"; // const-string v0, "exit"
/* .line 164 */
} // :cond_3
final String v2 = "OF.menu(\'%s\')"; // const-string v2, "OF.menu(\'%s\')"
/* new-array v3, v1, [Ljava/lang/Object; */
int v4 = 0; // const/4 v4, 0x0
/* aput-object v0, v3, v4 */
java.lang.String .format ( v2,v3 );
(( com.openfeint.api.ui.Dashboard ) p0 ).executeJavascript ( v2 ); // invoke-virtual {p0, v2}, Lcom/openfeint/api/ui/Dashboard;->executeJavascript(Ljava/lang/String;)V
} // .end method
public Boolean onPrepareOptionsMenu ( android.view.Menu p0 ) {
/* .locals 3 */
/* .param p1, "menu" # Landroid/view/Menu; */
/* .prologue */
int v1 = 1; // const/4 v1, 0x1
/* .line 140 */
/* iget-boolean v0, p0, Lcom/openfeint/api/ui/Dashboard;->mRootIsHome:Z */
if ( v0 != null) { // if-eqz v0, :cond_0
/* iget v0, p0, Lcom/openfeint/api/ui/Dashboard;->pageStackCount:I */
/* if-le v0, v1, :cond_1 */
} // :cond_0
/* move v0, v1 */
} // :goto_0
/* .line 141 */
/* .line 140 */
} // :cond_1
int v0 = 0; // const/4 v0, 0x0
} // .end method
public void onResume ( ) {
/* .locals 1 */
/* .prologue */
/* .line 114 */
/* invoke-super {p0}, Lcom/openfeint/internal/ui/WebNav;->onResume()V */
/* .line 115 */
v0 = v0 = com.openfeint.api.ui.Dashboard.sOpenDashboards;
/* if-nez v0, :cond_0 */
v0 = com.openfeint.api.ui.Dashboard.sOpenDashboards;
/* .line 116 */
} // :cond_0
com.openfeint.internal.OpenFeintInternal .getInstance ( );
(( com.openfeint.internal.OpenFeintInternal ) v0 ).getCurrentUser ( ); // invoke-virtual {v0}, Lcom/openfeint/internal/OpenFeintInternal;->getCurrentUser()Lcom/openfeint/api/resource/CurrentUser;
/* if-nez v0, :cond_1 */
(( com.openfeint.api.ui.Dashboard ) p0 ).finish ( ); // invoke-virtual {p0}, Lcom/openfeint/api/ui/Dashboard;->finish()V
/* .line 117 */
} // :cond_1
return;
} // .end method
