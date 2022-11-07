public class com.openfeint.internal.OpenFeintInternal {
	 /* .source "OpenFeintInternal.java" */
	 /* # annotations */
	 /* .annotation system Ldalvik/annotation/MemberClasses; */
	 /* value = { */
	 /* Lcom/openfeint/internal/OpenFeintInternal$IUploadDelegate;, */
	 /* Lcom/openfeint/internal/OpenFeintInternal$LoginDelegate; */
	 /* } */
} // .end annotation
/* # static fields */
private static final Boolean DEVELOPMENT_LOGGING_ENABLED;
private static final java.lang.String TAG;
private static com.openfeint.internal.OpenFeintInternal sInstance;
/* # instance fields */
com.openfeint.internal.Analytics analytics;
Integer mAppVersion;
private Boolean mApproved;
private Boolean mBanned;
com.openfeint.internal.request.Client mClient;
private android.content.Context mContext;
private Boolean mCreatingDeviceSession;
private com.openfeint.api.resource.CurrentUser mCurrentUser;
private Boolean mCurrentlyLoggingIn;
private Boolean mDeclined;
com.openfeint.api.OpenFeintDelegate mDelegate;
private Boolean mDeserializedAlready;
private Boolean mDeviceSessionCreated;
java.util.Properties mInternalProperties;
private com.openfeint.internal.OpenFeintInternal$LoginDelegate mLoginDelegate;
android.os.Handler mMainThreadHandler;
private java.lang.Runnable mPostDeviceSessionRunnable;
private java.lang.Runnable mPostLoginRunnable;
private com.openfeint.internal.SyncedStore mPrefs;
private java.util.List mQueuedPostDeviceSessionRunnables;
/* .annotation system Ldalvik/annotation/Signature; */
/* value = { */
/* "Ljava/util/List", */
/* "<", */
/* "Ljava/lang/Runnable;", */
/* ">;" */
/* } */
} // .end annotation
} // .end field
private java.util.List mQueuedPostLoginRunnables;
/* .annotation system Ldalvik/annotation/Signature; */
/* value = { */
/* "Ljava/util/List", */
/* "<", */
/* "Ljava/lang/Runnable;", */
/* ">;" */
/* } */
} // .end annotation
} // .end field
java.lang.String mServerUrl;
com.openfeint.api.OpenFeintSettings mSettings;
java.lang.String mUDID;
/* # direct methods */
private com.openfeint.internal.OpenFeintInternal ( ) {
/* .locals 6 */
/* .param p1, "settings" # Lcom/openfeint/api/OpenFeintSettings; */
/* .param p2, "ctx" # Landroid/content/Context; */
/* .prologue */
/* .line 835 */
/* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
/* .line 104 */
int v2 = -1; // const/4 v2, -0x1
/* iput v2, p0, Lcom/openfeint/internal/OpenFeintInternal;->mAppVersion:I */
/* .line 837 */
/* .line 838 */
this.mContext = p2;
/* .line 840 */
this.mSettings = p1;
/* .line 842 */
(( com.openfeint.internal.OpenFeintInternal ) p0 ).getPrefs ( ); // invoke-virtual {p0}, Lcom/openfeint/internal/OpenFeintInternal;->getPrefs()Lcom/openfeint/internal/SyncedStore;
(( com.openfeint.internal.SyncedStore ) v2 ).read ( ); // invoke-virtual {v2}, Lcom/openfeint/internal/SyncedStore;->read()Lcom/openfeint/internal/SyncedStore$Reader;
/* .line 844 */
/* .local v1, "r":Lcom/openfeint/internal/SyncedStore$Reader; */
try { // :try_start_0
/* new-instance v2, Ljava/lang/StringBuilder; */
/* invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V */
(( com.openfeint.internal.OpenFeintInternal ) p0 ).getContext ( ); // invoke-virtual {p0}, Lcom/openfeint/internal/OpenFeintInternal;->getContext()Landroid/content/Context;
(( android.content.Context ) v3 ).getPackageName ( ); // invoke-virtual {v3}, Landroid/content/Context;->getPackageName()Ljava/lang/String;
(( java.lang.StringBuilder ) v2 ).append ( v3 ); // invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
final String v3 = ".of_declined"; // const-string v3, ".of_declined"
(( java.lang.StringBuilder ) v2 ).append ( v3 ); // invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v2 ).toString ( ); // invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
int v3 = 0; // const/4 v3, 0x0
(( com.openfeint.internal.SyncedStore$Reader ) v1 ).getString ( v2, v3 ); // invoke-virtual {v1, v2, v3}, Lcom/openfeint/internal/SyncedStore$Reader;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
if ( v2 != null) { // if-eqz v2, :cond_1
int v2 = 1; // const/4 v2, 0x1
} // :goto_0
/* iput-boolean v2, p0, Lcom/openfeint/internal/OpenFeintInternal;->mDeclined:Z */
/* :try_end_0 */
/* .catchall {:try_start_0 ..:try_end_0} :catchall_0 */
/* .line 846 */
(( com.openfeint.internal.SyncedStore$Reader ) v1 ).complete ( ); // invoke-virtual {v1}, Lcom/openfeint/internal/SyncedStore$Reader;->complete()V
/* .line 849 */
/* new-instance v2, Landroid/os/Handler; */
/* invoke-direct {v2}, Landroid/os/Handler;-><init>()V */
this.mMainThreadHandler = v2;
/* .line 850 */
/* new-instance v2, Ljava/util/Properties; */
/* invoke-direct {v2}, Ljava/util/Properties;-><init>()V */
this.mInternalProperties = v2;
/* .line 851 */
v2 = this.mInternalProperties;
final String v3 = "server-url"; // const-string v3, "server-url"
final String v4 = "https://api.openfeint.com"; // const-string v4, "https://api.openfeint.com"
(( java.util.Properties ) v2 ).put ( v3, v4 ); // invoke-virtual {v2, v3, v4}, Ljava/util/Properties;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
/* .line 853 */
v2 = this.mInternalProperties;
final String v3 = "of-version"; // const-string v3, "of-version"
final String v4 = "1.9.2"; // const-string v4, "1.9.2"
(( java.util.Properties ) v2 ).put ( v3, v4 ); // invoke-virtual {v2, v3, v4}, Ljava/util/Properties;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
/* .line 855 */
v2 = this.mInternalProperties;
final String v3 = "@xml/openfeint_internal_settings"; // const-string v3, "@xml/openfeint_internal_settings"
v3 = (( com.openfeint.internal.OpenFeintInternal ) p0 ).getResource ( v3 ); // invoke-virtual {p0, v3}, Lcom/openfeint/internal/OpenFeintInternal;->getResource(Ljava/lang/String;)I
/* invoke-direct {p0, v2, v3}, Lcom/openfeint/internal/OpenFeintInternal;->loadPropertiesFromXMLResource(Ljava/util/Properties;I)V */
/* .line 857 */
final String v2 = "OpenFeint"; // const-string v2, "OpenFeint"
/* new-instance v3, Ljava/lang/StringBuilder; */
/* invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V */
final String v4 = "Using OpenFeint version "; // const-string v4, "Using OpenFeint version "
(( java.lang.StringBuilder ) v3 ).append ( v4 ); // invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
v4 = this.mInternalProperties;
final String v5 = "of-version"; // const-string v5, "of-version"
(( java.util.Properties ) v4 ).get ( v5 ); // invoke-virtual {v4, v5}, Ljava/util/Properties;->get(Ljava/lang/Object;)Ljava/lang/Object;
(( java.lang.StringBuilder ) v3 ).append ( v4 ); // invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;
final String v4 = " ("; // const-string v4, " ("
(( java.lang.StringBuilder ) v3 ).append ( v4 ); // invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
v4 = this.mInternalProperties;
final String v5 = "server-url"; // const-string v5, "server-url"
(( java.util.Properties ) v4 ).get ( v5 ); // invoke-virtual {v4, v5}, Ljava/util/Properties;->get(Ljava/lang/Object;)Ljava/lang/Object;
(( java.lang.StringBuilder ) v3 ).append ( v4 ); // invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/Object;)Ljava/lang/StringBuilder;
final String v4 = ")"; // const-string v4, ")"
(( java.lang.StringBuilder ) v3 ).append ( v4 ); // invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v3 ).toString ( ); // invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
android.util.Log .i ( v2,v3 );
/* .line 859 */
/* new-instance v0, Ljava/util/Properties; */
/* invoke-direct {v0}, Ljava/util/Properties;-><init>()V */
/* .line 860 */
/* .local v0, "appProperties":Ljava/util/Properties; */
final String v2 = "@xml/openfeint_app_settings"; // const-string v2, "@xml/openfeint_app_settings"
v2 = (( com.openfeint.internal.OpenFeintInternal ) p0 ).getResource ( v2 ); // invoke-virtual {p0, v2}, Lcom/openfeint/internal/OpenFeintInternal;->getResource(Ljava/lang/String;)I
/* invoke-direct {p0, v0, v2}, Lcom/openfeint/internal/OpenFeintInternal;->loadPropertiesFromXMLResource(Ljava/util/Properties;I)V */
/* .line 861 */
v2 = this.mSettings;
(( com.openfeint.api.OpenFeintSettings ) v2 ).applyOverrides ( v0 ); // invoke-virtual {v2, v0}, Lcom/openfeint/api/OpenFeintSettings;->applyOverrides(Ljava/util/Properties;)V
/* .line 863 */
v2 = this.mSettings;
(( com.openfeint.api.OpenFeintSettings ) v2 ).verify ( ); // invoke-virtual {v2}, Lcom/openfeint/api/OpenFeintSettings;->verify()V
/* .line 865 */
v2 = com.openfeint.internal.Encryption .initialized ( );
/* if-nez v2, :cond_0 */
/* .line 866 */
v2 = this.mSettings;
v2 = this.secret;
com.openfeint.internal.Encryption .init ( v2 );
/* .line 869 */
} // :cond_0
/* new-instance v2, Lcom/openfeint/internal/request/Client; */
v3 = this.mSettings;
v3 = this.key;
v4 = this.mSettings;
v4 = this.secret;
(( com.openfeint.internal.OpenFeintInternal ) p0 ).getPrefs ( ); // invoke-virtual {p0}, Lcom/openfeint/internal/OpenFeintInternal;->getPrefs()Lcom/openfeint/internal/SyncedStore;
/* invoke-direct {v2, v3, v4, v5}, Lcom/openfeint/internal/request/Client;-><init>(Ljava/lang/String;Ljava/lang/String;Lcom/openfeint/internal/SyncedStore;)V */
this.mClient = v2;
/* .line 870 */
com.openfeint.internal.Util .moveWebCache ( p2 );
/* .line 872 */
com.openfeint.internal.ui.WebViewCache .initialize ( p2 );
/* .line 875 */
com.openfeint.internal.db.DB .createDB ( p2 );
/* .line 876 */
com.openfeint.internal.ui.WebViewCache .start ( );
/* .line 877 */
/* new-instance v2, Lcom/openfeint/internal/Analytics; */
/* invoke-direct {v2}, Lcom/openfeint/internal/Analytics;-><init>()V */
this.analytics = v2;
/* .line 878 */
return;
/* .line 844 */
} // .end local v0 # "appProperties":Ljava/util/Properties;
} // :cond_1
int v2 = 0; // const/4 v2, 0x0
/* goto/16 :goto_0 */
/* .line 846 */
/* :catchall_0 */
/* move-exception v2 */
(( com.openfeint.internal.SyncedStore$Reader ) v1 ).complete ( ); // invoke-virtual {v1}, Lcom/openfeint/internal/SyncedStore$Reader;->complete()V
/* throw v2 */
} // .end method
private final void _makeRequest ( com.openfeint.internal.request.BaseRequest p0 ) {
/* .locals 2 */
/* .param p1, "req" # Lcom/openfeint/internal/request/BaseRequest; */
/* .prologue */
/* .line 660 */
v0 = (( com.openfeint.internal.OpenFeintInternal ) p0 ).isUserLoggedIn ( ); // invoke-virtual {p0}, Lcom/openfeint/internal/OpenFeintInternal;->isUserLoggedIn()Z
/* if-nez v0, :cond_1 */
v0 = (( com.openfeint.internal.request.BaseRequest ) p1 ).wantsLogin ( ); // invoke-virtual {p1}, Lcom/openfeint/internal/request/BaseRequest;->wantsLogin()Z
if ( v0 != null) { // if-eqz v0, :cond_1
/* invoke-direct {p0}, Lcom/openfeint/internal/OpenFeintInternal;->lastLoggedInUser()Lcom/openfeint/api/resource/User; */
if ( v0 != null) { // if-eqz v0, :cond_1
v0 = (( com.openfeint.internal.OpenFeintInternal ) p0 ).isFeintServerReachable ( ); // invoke-virtual {p0}, Lcom/openfeint/internal/OpenFeintInternal;->isFeintServerReachable()Z
if ( v0 != null) { // if-eqz v0, :cond_1
/* .line 663 */
int v0 = 0; // const/4 v0, 0x0
(( com.openfeint.internal.OpenFeintInternal ) p0 ).login ( v0 ); // invoke-virtual {p0, v0}, Lcom/openfeint/internal/OpenFeintInternal;->login(Z)V
/* .line 664 */
v0 = this.mQueuedPostLoginRunnables;
/* if-nez v0, :cond_0 */
/* .line 665 */
/* new-instance v0, Ljava/util/ArrayList; */
/* invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V */
this.mQueuedPostLoginRunnables = v0;
/* .line 667 */
} // :cond_0
v0 = this.mQueuedPostLoginRunnables;
/* new-instance v1, Lcom/openfeint/internal/OpenFeintInternal$7; */
/* invoke-direct {v1, p0, p1}, Lcom/openfeint/internal/OpenFeintInternal$7;-><init>(Lcom/openfeint/internal/OpenFeintInternal;Lcom/openfeint/internal/request/BaseRequest;)V */
/* .line 687 */
} // :goto_0
return;
/* .line 672 */
} // :cond_1
/* iget-boolean v0, p0, Lcom/openfeint/internal/OpenFeintInternal;->mDeviceSessionCreated:Z */
/* if-nez v0, :cond_3 */
v0 = (( com.openfeint.internal.request.BaseRequest ) p1 ).needsDeviceSession ( ); // invoke-virtual {p1}, Lcom/openfeint/internal/request/BaseRequest;->needsDeviceSession()Z
if ( v0 != null) { // if-eqz v0, :cond_3
/* .line 674 */
(( com.openfeint.internal.OpenFeintInternal ) p0 ).createDeviceSession ( ); // invoke-virtual {p0}, Lcom/openfeint/internal/OpenFeintInternal;->createDeviceSession()V
/* .line 676 */
v0 = this.mQueuedPostDeviceSessionRunnables;
/* if-nez v0, :cond_2 */
/* .line 677 */
/* new-instance v0, Ljava/util/ArrayList; */
/* invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V */
this.mQueuedPostDeviceSessionRunnables = v0;
/* .line 679 */
} // :cond_2
v0 = this.mQueuedPostDeviceSessionRunnables;
/* new-instance v1, Lcom/openfeint/internal/OpenFeintInternal$8; */
/* invoke-direct {v1, p0, p1}, Lcom/openfeint/internal/OpenFeintInternal$8;-><init>(Lcom/openfeint/internal/OpenFeintInternal;Lcom/openfeint/internal/request/BaseRequest;)V */
/* .line 685 */
} // :cond_3
v0 = this.mClient;
(( com.openfeint.internal.request.Client ) v0 ).makeRequest ( p1 ); // invoke-virtual {v0, p1}, Lcom/openfeint/internal/request/Client;->makeRequest(Lcom/openfeint/internal/request/BaseRequest;)V
} // .end method
private void _restoreInstanceState ( android.os.Bundle p0 ) {
/* .locals 1 */
/* .param p1, "inState" # Landroid/os/Bundle; */
/* .prologue */
/* .line 131 */
/* iget-boolean v0, p0, Lcom/openfeint/internal/OpenFeintInternal;->mDeserializedAlready:Z */
/* if-nez v0, :cond_1 */
if ( p1 != null) { // if-eqz p1, :cond_1
/* .line 132 */
final String v0 = "mCurrentUser"; // const-string v0, "mCurrentUser"
(( android.os.Bundle ) p1 ).getString ( v0 ); // invoke-virtual {p1, v0}, Landroid/os/Bundle;->getString(Ljava/lang/String;)Ljava/lang/String;
com.openfeint.internal.OpenFeintInternal .userFromString ( v0 );
/* check-cast v0, Lcom/openfeint/api/resource/CurrentUser; */
this.mCurrentUser = v0;
/* .line 133 */
v0 = this.mClient;
if ( v0 != null) { // if-eqz v0, :cond_0
v0 = this.mClient;
(( com.openfeint.internal.request.Client ) v0 ).restoreInstanceState ( p1 ); // invoke-virtual {v0, p1}, Lcom/openfeint/internal/request/Client;->restoreInstanceState(Landroid/os/Bundle;)V
/* .line 134 */
} // :cond_0
final String v0 = "mCurrentlyLoggingIn"; // const-string v0, "mCurrentlyLoggingIn"
v0 = (( android.os.Bundle ) p1 ).getBoolean ( v0 ); // invoke-virtual {p1, v0}, Landroid/os/Bundle;->getBoolean(Ljava/lang/String;)Z
/* iput-boolean v0, p0, Lcom/openfeint/internal/OpenFeintInternal;->mCurrentlyLoggingIn:Z */
/* .line 135 */
final String v0 = "mCreatingDeviceSession"; // const-string v0, "mCreatingDeviceSession"
v0 = (( android.os.Bundle ) p1 ).getBoolean ( v0 ); // invoke-virtual {p1, v0}, Landroid/os/Bundle;->getBoolean(Ljava/lang/String;)Z
/* iput-boolean v0, p0, Lcom/openfeint/internal/OpenFeintInternal;->mCreatingDeviceSession:Z */
/* .line 136 */
final String v0 = "mDeviceSessionCreated"; // const-string v0, "mDeviceSessionCreated"
v0 = (( android.os.Bundle ) p1 ).getBoolean ( v0 ); // invoke-virtual {p1, v0}, Landroid/os/Bundle;->getBoolean(Ljava/lang/String;)Z
/* iput-boolean v0, p0, Lcom/openfeint/internal/OpenFeintInternal;->mDeviceSessionCreated:Z */
/* .line 137 */
final String v0 = "mBanned"; // const-string v0, "mBanned"
v0 = (( android.os.Bundle ) p1 ).getBoolean ( v0 ); // invoke-virtual {p1, v0}, Landroid/os/Bundle;->getBoolean(Ljava/lang/String;)Z
/* iput-boolean v0, p0, Lcom/openfeint/internal/OpenFeintInternal;->mBanned:Z */
/* .line 138 */
final String v0 = "mApproved"; // const-string v0, "mApproved"
v0 = (( android.os.Bundle ) p1 ).getBoolean ( v0 ); // invoke-virtual {p1, v0}, Landroid/os/Bundle;->getBoolean(Ljava/lang/String;)Z
/* iput-boolean v0, p0, Lcom/openfeint/internal/OpenFeintInternal;->mApproved:Z */
/* .line 139 */
final String v0 = "mDeclined"; // const-string v0, "mDeclined"
v0 = (( android.os.Bundle ) p1 ).getBoolean ( v0 ); // invoke-virtual {p1, v0}, Landroid/os/Bundle;->getBoolean(Ljava/lang/String;)Z
/* iput-boolean v0, p0, Lcom/openfeint/internal/OpenFeintInternal;->mDeclined:Z */
/* .line 140 */
int v0 = 1; // const/4 v0, 0x1
/* iput-boolean v0, p0, Lcom/openfeint/internal/OpenFeintInternal;->mDeserializedAlready:Z */
/* .line 142 */
} // :cond_1
return;
} // .end method
private void _saveInstanceState ( android.os.Bundle p0 ) {
/* .locals 2 */
/* .param p1, "outState" # Landroid/os/Bundle; */
/* .prologue */
/* .line 120 */
v0 = this.mCurrentUser;
if ( v0 != null) { // if-eqz v0, :cond_0
final String v0 = "mCurrentUser"; // const-string v0, "mCurrentUser"
v1 = this.mCurrentUser;
(( com.openfeint.api.resource.CurrentUser ) v1 ).generate ( ); // invoke-virtual {v1}, Lcom/openfeint/api/resource/CurrentUser;->generate()Ljava/lang/String;
(( android.os.Bundle ) p1 ).putString ( v0, v1 ); // invoke-virtual {p1, v0, v1}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V
/* .line 121 */
} // :cond_0
v0 = this.mClient;
if ( v0 != null) { // if-eqz v0, :cond_1
v0 = this.mClient;
(( com.openfeint.internal.request.Client ) v0 ).saveInstanceState ( p1 ); // invoke-virtual {v0, p1}, Lcom/openfeint/internal/request/Client;->saveInstanceState(Landroid/os/Bundle;)V
/* .line 122 */
} // :cond_1
final String v0 = "mCurrentlyLoggingIn"; // const-string v0, "mCurrentlyLoggingIn"
/* iget-boolean v1, p0, Lcom/openfeint/internal/OpenFeintInternal;->mCurrentlyLoggingIn:Z */
(( android.os.Bundle ) p1 ).putBoolean ( v0, v1 ); // invoke-virtual {p1, v0, v1}, Landroid/os/Bundle;->putBoolean(Ljava/lang/String;Z)V
/* .line 123 */
final String v0 = "mCreatingDeviceSession"; // const-string v0, "mCreatingDeviceSession"
/* iget-boolean v1, p0, Lcom/openfeint/internal/OpenFeintInternal;->mCreatingDeviceSession:Z */
(( android.os.Bundle ) p1 ).putBoolean ( v0, v1 ); // invoke-virtual {p1, v0, v1}, Landroid/os/Bundle;->putBoolean(Ljava/lang/String;Z)V
/* .line 124 */
final String v0 = "mDeviceSessionCreated"; // const-string v0, "mDeviceSessionCreated"
/* iget-boolean v1, p0, Lcom/openfeint/internal/OpenFeintInternal;->mDeviceSessionCreated:Z */
(( android.os.Bundle ) p1 ).putBoolean ( v0, v1 ); // invoke-virtual {p1, v0, v1}, Landroid/os/Bundle;->putBoolean(Ljava/lang/String;Z)V
/* .line 125 */
final String v0 = "mBanned"; // const-string v0, "mBanned"
/* iget-boolean v1, p0, Lcom/openfeint/internal/OpenFeintInternal;->mBanned:Z */
(( android.os.Bundle ) p1 ).putBoolean ( v0, v1 ); // invoke-virtual {p1, v0, v1}, Landroid/os/Bundle;->putBoolean(Ljava/lang/String;Z)V
/* .line 126 */
final String v0 = "mApproved"; // const-string v0, "mApproved"
/* iget-boolean v1, p0, Lcom/openfeint/internal/OpenFeintInternal;->mApproved:Z */
(( android.os.Bundle ) p1 ).putBoolean ( v0, v1 ); // invoke-virtual {p1, v0, v1}, Landroid/os/Bundle;->putBoolean(Ljava/lang/String;Z)V
/* .line 127 */
final String v0 = "mDeclined"; // const-string v0, "mDeclined"
/* iget-boolean v1, p0, Lcom/openfeint/internal/OpenFeintInternal;->mDeclined:Z */
(( android.os.Bundle ) p1 ).putBoolean ( v0, v1 ); // invoke-virtual {p1, v0, v1}, Landroid/os/Bundle;->putBoolean(Ljava/lang/String;Z)V
/* .line 128 */
return;
} // .end method
static void access$000 ( com.openfeint.internal.OpenFeintInternal p0, com.openfeint.api.resource.User p1 ) { //synthethic
/* .locals 0 */
/* .param p0, "x0" # Lcom/openfeint/internal/OpenFeintInternal; */
/* .param p1, "x1" # Lcom/openfeint/api/resource/User; */
/* .prologue */
/* .line 69 */
/* invoke-direct {p0, p1}, Lcom/openfeint/internal/OpenFeintInternal;->userLoggedIn(Lcom/openfeint/api/resource/User;)V */
return;
} // .end method
static Boolean access$1000 ( com.openfeint.internal.OpenFeintInternal p0 ) { //synthethic
/* .locals 1 */
/* .param p0, "x0" # Lcom/openfeint/internal/OpenFeintInternal; */
/* .prologue */
/* .line 69 */
/* iget-boolean v0, p0, Lcom/openfeint/internal/OpenFeintInternal;->mDeclined:Z */
} // .end method
static Boolean access$102 ( com.openfeint.internal.OpenFeintInternal p0, Boolean p1 ) { //synthethic
/* .locals 0 */
/* .param p0, "x0" # Lcom/openfeint/internal/OpenFeintInternal; */
/* .param p1, "x1" # Z */
/* .prologue */
/* .line 69 */
/* iput-boolean p1, p0, Lcom/openfeint/internal/OpenFeintInternal;->mCreatingDeviceSession:Z */
} // .end method
static Boolean access$1102 ( com.openfeint.internal.OpenFeintInternal p0, Boolean p1 ) { //synthethic
/* .locals 0 */
/* .param p0, "x0" # Lcom/openfeint/internal/OpenFeintInternal; */
/* .param p1, "x1" # Z */
/* .prologue */
/* .line 69 */
/* iput-boolean p1, p0, Lcom/openfeint/internal/OpenFeintInternal;->mDeserializedAlready:Z */
} // .end method
static com.openfeint.api.resource.User access$1200 ( com.openfeint.internal.OpenFeintInternal p0 ) { //synthethic
/* .locals 1 */
/* .param p0, "x0" # Lcom/openfeint/internal/OpenFeintInternal; */
/* .prologue */
/* .line 69 */
/* invoke-direct {p0}, Lcom/openfeint/internal/OpenFeintInternal;->lastLoggedInUser()Lcom/openfeint/api/resource/User; */
} // .end method
static Boolean access$1302 ( com.openfeint.internal.OpenFeintInternal p0, Boolean p1 ) { //synthethic
/* .locals 0 */
/* .param p0, "x0" # Lcom/openfeint/internal/OpenFeintInternal; */
/* .param p1, "x1" # Z */
/* .prologue */
/* .line 69 */
/* iput-boolean p1, p0, Lcom/openfeint/internal/OpenFeintInternal;->mBanned:Z */
} // .end method
static void access$1400 ( com.openfeint.internal.OpenFeintInternal p0 ) { //synthethic
/* .locals 0 */
/* .param p0, "x0" # Lcom/openfeint/internal/OpenFeintInternal; */
/* .prologue */
/* .line 69 */
/* invoke-direct {p0}, Lcom/openfeint/internal/OpenFeintInternal;->clearPrefs()V */
return;
} // .end method
static Boolean access$1500 ( com.openfeint.internal.OpenFeintInternal p0 ) { //synthethic
/* .locals 1 */
/* .param p0, "x0" # Lcom/openfeint/internal/OpenFeintInternal; */
/* .prologue */
/* .line 69 */
/* iget-boolean v0, p0, Lcom/openfeint/internal/OpenFeintInternal;->mApproved:Z */
} // .end method
static Boolean access$202 ( com.openfeint.internal.OpenFeintInternal p0, Boolean p1 ) { //synthethic
/* .locals 0 */
/* .param p0, "x0" # Lcom/openfeint/internal/OpenFeintInternal; */
/* .param p1, "x1" # Z */
/* .prologue */
/* .line 69 */
/* iput-boolean p1, p0, Lcom/openfeint/internal/OpenFeintInternal;->mDeviceSessionCreated:Z */
} // .end method
static java.lang.Runnable access$300 ( com.openfeint.internal.OpenFeintInternal p0 ) { //synthethic
/* .locals 1 */
/* .param p0, "x0" # Lcom/openfeint/internal/OpenFeintInternal; */
/* .prologue */
/* .line 69 */
v0 = this.mPostDeviceSessionRunnable;
} // .end method
static java.lang.Runnable access$302 ( com.openfeint.internal.OpenFeintInternal p0, java.lang.Runnable p1 ) { //synthethic
/* .locals 0 */
/* .param p0, "x0" # Lcom/openfeint/internal/OpenFeintInternal; */
/* .param p1, "x1" # Ljava/lang/Runnable; */
/* .prologue */
/* .line 69 */
this.mPostDeviceSessionRunnable = p1;
} // .end method
static java.lang.Runnable access$400 ( com.openfeint.internal.OpenFeintInternal p0 ) { //synthethic
/* .locals 1 */
/* .param p0, "x0" # Lcom/openfeint/internal/OpenFeintInternal; */
/* .prologue */
/* .line 69 */
v0 = this.mPostLoginRunnable;
} // .end method
static java.lang.Runnable access$402 ( com.openfeint.internal.OpenFeintInternal p0, java.lang.Runnable p1 ) { //synthethic
/* .locals 0 */
/* .param p0, "x0" # Lcom/openfeint/internal/OpenFeintInternal; */
/* .param p1, "x1" # Ljava/lang/Runnable; */
/* .prologue */
/* .line 69 */
this.mPostLoginRunnable = p1;
} // .end method
static void access$500 ( com.openfeint.internal.OpenFeintInternal p0, Integer p1, java.lang.Object p2 ) { //synthethic
/* .locals 0 */
/* .param p0, "x0" # Lcom/openfeint/internal/OpenFeintInternal; */
/* .param p1, "x1" # I */
/* .param p2, "x2" # Ljava/lang/Object; */
/* .prologue */
/* .line 69 */
/* invoke-direct {p0, p1, p2}, Lcom/openfeint/internal/OpenFeintInternal;->showOfflineNotification(ILjava/lang/Object;)V */
return;
} // .end method
static java.util.List access$600 ( com.openfeint.internal.OpenFeintInternal p0 ) { //synthethic
/* .locals 1 */
/* .param p0, "x0" # Lcom/openfeint/internal/OpenFeintInternal; */
/* .prologue */
/* .line 69 */
v0 = this.mQueuedPostDeviceSessionRunnables;
} // .end method
static java.util.List access$602 ( com.openfeint.internal.OpenFeintInternal p0, java.util.List p1 ) { //synthethic
/* .locals 0 */
/* .param p0, "x0" # Lcom/openfeint/internal/OpenFeintInternal; */
/* .param p1, "x1" # Ljava/util/List; */
/* .prologue */
/* .line 69 */
this.mQueuedPostDeviceSessionRunnables = p1;
} // .end method
static Boolean access$700 ( com.openfeint.internal.OpenFeintInternal p0 ) { //synthethic
/* .locals 1 */
/* .param p0, "x0" # Lcom/openfeint/internal/OpenFeintInternal; */
/* .prologue */
/* .line 69 */
/* iget-boolean v0, p0, Lcom/openfeint/internal/OpenFeintInternal;->mCurrentlyLoggingIn:Z */
} // .end method
static Boolean access$702 ( com.openfeint.internal.OpenFeintInternal p0, Boolean p1 ) { //synthethic
/* .locals 0 */
/* .param p0, "x0" # Lcom/openfeint/internal/OpenFeintInternal; */
/* .param p1, "x1" # Z */
/* .prologue */
/* .line 69 */
/* iput-boolean p1, p0, Lcom/openfeint/internal/OpenFeintInternal;->mCurrentlyLoggingIn:Z */
} // .end method
static java.util.List access$800 ( com.openfeint.internal.OpenFeintInternal p0 ) { //synthethic
/* .locals 1 */
/* .param p0, "x0" # Lcom/openfeint/internal/OpenFeintInternal; */
/* .prologue */
/* .line 69 */
v0 = this.mQueuedPostLoginRunnables;
} // .end method
static java.util.List access$802 ( com.openfeint.internal.OpenFeintInternal p0, java.util.List p1 ) { //synthethic
/* .locals 0 */
/* .param p0, "x0" # Lcom/openfeint/internal/OpenFeintInternal; */
/* .param p1, "x1" # Ljava/util/List; */
/* .prologue */
/* .line 69 */
this.mQueuedPostLoginRunnables = p1;
} // .end method
static void access$900 ( com.openfeint.internal.OpenFeintInternal p0, com.openfeint.internal.request.BaseRequest p1 ) { //synthethic
/* .locals 0 */
/* .param p0, "x0" # Lcom/openfeint/internal/OpenFeintInternal; */
/* .param p1, "x1" # Lcom/openfeint/internal/request/BaseRequest; */
/* .prologue */
/* .line 69 */
/* invoke-direct {p0, p1}, Lcom/openfeint/internal/OpenFeintInternal;->_makeRequest(Lcom/openfeint/internal/request/BaseRequest;)V */
return;
} // .end method
private static java.util.List cat ( java.lang.String p0 ) {
/* .locals 6 */
/* .param p0, "filename" # Ljava/lang/String; */
/* .annotation system Ldalvik/annotation/Signature; */
/* value = { */
/* "(", */
/* "Ljava/lang/String;", */
/* ")", */
/* "Ljava/util/List", */
/* "<", */
/* "Ljava/lang/String;", */
/* ">;" */
/* } */
} // .end annotation
/* .prologue */
/* .line 319 */
/* new-instance v3, Ljava/util/ArrayList; */
/* invoke-direct {v3}, Ljava/util/ArrayList;-><init>()V */
/* .line 321 */
/* .local v3, "rv":Ljava/util/List;, "Ljava/util/List<Ljava/lang/String;>;" */
try { // :try_start_0
/* new-instance v1, Ljava/io/FileInputStream; */
/* invoke-direct {v1, p0}, Ljava/io/FileInputStream;-><init>(Ljava/lang/String;)V */
/* .line 322 */
/* .local v1, "f":Ljava/io/FileInputStream; */
/* new-instance v0, Ljava/io/BufferedReader; */
/* new-instance v4, Ljava/io/InputStreamReader; */
/* invoke-direct {v4, v1}, Ljava/io/InputStreamReader;-><init>(Ljava/io/InputStream;)V */
/* const/16 v5, 0x2000 */
/* invoke-direct {v0, v4, v5}, Ljava/io/BufferedReader;-><init>(Ljava/io/Reader;I)V */
/* .line 323 */
/* .local v0, "br":Ljava/io/BufferedReader; */
int v2 = 0; // const/4 v2, 0x0
/* .line 324 */
/* .local v2, "line":Ljava/lang/String; */
} // :goto_0
(( java.io.BufferedReader ) v0 ).readLine ( ); // invoke-virtual {v0}, Ljava/io/BufferedReader;->readLine()Ljava/lang/String;
if ( v2 != null) { // if-eqz v2, :cond_0
/* .line 325 */
/* .line 328 */
} // .end local v0 # "br":Ljava/io/BufferedReader;
} // .end local v1 # "f":Ljava/io/FileInputStream;
} // .end local v2 # "line":Ljava/lang/String;
/* :catch_0 */
/* move-exception v4 */
/* .line 332 */
} // :goto_1
/* .line 327 */
/* .restart local v0 # "br":Ljava/io/BufferedReader; */
/* .restart local v1 # "f":Ljava/io/FileInputStream; */
/* .restart local v2 # "line":Ljava/lang/String; */
} // :cond_0
(( java.io.BufferedReader ) v0 ).close ( ); // invoke-virtual {v0}, Ljava/io/BufferedReader;->close()V
/* :try_end_0 */
/* .catch Ljava/lang/Exception; {:try_start_0 ..:try_end_0} :catch_0 */
} // .end method
private Boolean checkBan ( ) {
/* .locals 2 */
/* .prologue */
/* .line 954 */
/* iget-boolean v0, p0, Lcom/openfeint/internal/OpenFeintInternal;->mBanned:Z */
if ( v0 != null) { // if-eqz v0, :cond_0
/* .line 955 */
(( com.openfeint.internal.OpenFeintInternal ) p0 ).getContext ( ); // invoke-virtual {p0}, Lcom/openfeint/internal/OpenFeintInternal;->getContext()Landroid/content/Context;
(( android.content.Context ) v0 ).getText ( v1 ); // invoke-virtual {v0, v1}, Landroid/content/Context;->getText(I)Ljava/lang/CharSequence;
(( com.openfeint.internal.OpenFeintInternal ) p0 ).displayErrorDialog ( v0 ); // invoke-virtual {p0, v0}, Lcom/openfeint/internal/OpenFeintInternal;->displayErrorDialog(Ljava/lang/CharSequence;)V
/* .line 956 */
int v0 = 1; // const/4 v0, 0x1
/* .line 958 */
} // :goto_0
} // :cond_0
int v0 = 0; // const/4 v0, 0x0
} // .end method
private void clearPrefs ( ) {
/* .locals 2 */
/* .prologue */
/* .line 252 */
(( com.openfeint.internal.OpenFeintInternal ) p0 ).getPrefs ( ); // invoke-virtual {p0}, Lcom/openfeint/internal/OpenFeintInternal;->getPrefs()Lcom/openfeint/internal/SyncedStore;
(( com.openfeint.internal.SyncedStore ) v1 ).edit ( ); // invoke-virtual {v1}, Lcom/openfeint/internal/SyncedStore;->edit()Lcom/openfeint/internal/SyncedStore$Editor;
/* .line 254 */
/* .local v0, "e":Lcom/openfeint/internal/SyncedStore$Editor; */
try { // :try_start_0
final String v1 = "last_logged_in_server"; // const-string v1, "last_logged_in_server"
(( com.openfeint.internal.SyncedStore$Editor ) v0 ).remove ( v1 ); // invoke-virtual {v0, v1}, Lcom/openfeint/internal/SyncedStore$Editor;->remove(Ljava/lang/String;)V
/* .line 255 */
final String v1 = "last_logged_in_user_name"; // const-string v1, "last_logged_in_user_name"
(( com.openfeint.internal.SyncedStore$Editor ) v0 ).remove ( v1 ); // invoke-virtual {v0, v1}, Lcom/openfeint/internal/SyncedStore$Editor;->remove(Ljava/lang/String;)V
/* .line 257 */
/* invoke-direct {p0, v0}, Lcom/openfeint/internal/OpenFeintInternal;->clearUser(Lcom/openfeint/internal/SyncedStore$Editor;)V */
/* :try_end_0 */
/* .catchall {:try_start_0 ..:try_end_0} :catchall_0 */
/* .line 259 */
(( com.openfeint.internal.SyncedStore$Editor ) v0 ).commit ( ); // invoke-virtual {v0}, Lcom/openfeint/internal/SyncedStore$Editor;->commit()V
/* .line 261 */
return;
/* .line 259 */
/* :catchall_0 */
/* move-exception v1 */
(( com.openfeint.internal.SyncedStore$Editor ) v0 ).commit ( ); // invoke-virtual {v0}, Lcom/openfeint/internal/SyncedStore$Editor;->commit()V
/* throw v1 */
} // .end method
private void clearUser ( com.openfeint.internal.SyncedStore$Editor p0 ) {
/* .locals 1 */
/* .param p1, "e" # Lcom/openfeint/internal/SyncedStore$Editor; */
/* .prologue */
/* .line 168 */
final String v0 = "last_logged_in_user"; // const-string v0, "last_logged_in_user"
(( com.openfeint.internal.SyncedStore$Editor ) p1 ).remove ( v0 ); // invoke-virtual {p1, v0}, Lcom/openfeint/internal/SyncedStore$Editor;->remove(Ljava/lang/String;)V
/* .line 169 */
return;
} // .end method
private java.lang.String findUDID ( ) {
/* .locals 8 */
/* .prologue */
/* .line 616 */
(( com.openfeint.internal.OpenFeintInternal ) p0 ).getContext ( ); // invoke-virtual {p0}, Lcom/openfeint/internal/OpenFeintInternal;->getContext()Landroid/content/Context;
(( android.content.Context ) v4 ).getContentResolver ( ); // invoke-virtual {v4}, Landroid/content/Context;->getContentResolver()Landroid/content/ContentResolver;
final String v5 = "android_id"; // const-string v5, "android_id"
android.provider.Settings$Secure .getString ( v4,v5 );
/* .line 619 */
/* .local v0, "androidID":Ljava/lang/String; */
if ( v0 != null) { // if-eqz v0, :cond_0
final String v4 = "9774d56d682e549c"; // const-string v4, "9774d56d682e549c"
v4 = (( java.lang.String ) v0 ).equals ( v4 ); // invoke-virtual {v0, v4}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
/* if-nez v4, :cond_0 */
/* .line 620 */
/* new-instance v4, Ljava/lang/StringBuilder; */
/* invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V */
final String v5 = "android-id-"; // const-string v5, "android-id-"
(( java.lang.StringBuilder ) v4 ).append ( v5 ); // invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v4 ).append ( v0 ); // invoke-virtual {v4, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v4 ).toString ( ); // invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
/* .line 643 */
} // :goto_0
/* .line 623 */
} // :cond_0
(( com.openfeint.internal.OpenFeintInternal ) p0 ).getPrefs ( ); // invoke-virtual {p0}, Lcom/openfeint/internal/OpenFeintInternal;->getPrefs()Lcom/openfeint/internal/SyncedStore;
(( com.openfeint.internal.SyncedStore ) v4 ).read ( ); // invoke-virtual {v4}, Lcom/openfeint/internal/SyncedStore;->read()Lcom/openfeint/internal/SyncedStore$Reader;
/* .line 625 */
/* .local v2, "r":Lcom/openfeint/internal/SyncedStore$Reader; */
try { // :try_start_0
final String v4 = "udid"; // const-string v4, "udid"
int v5 = 0; // const/4 v5, 0x0
(( com.openfeint.internal.SyncedStore$Reader ) v2 ).getString ( v4, v5 ); // invoke-virtual {v2, v4, v5}, Lcom/openfeint/internal/SyncedStore$Reader;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
/* :try_end_0 */
/* .catchall {:try_start_0 ..:try_end_0} :catchall_0 */
/* .line 627 */
(( com.openfeint.internal.SyncedStore$Reader ) v2 ).complete ( ); // invoke-virtual {v2}, Lcom/openfeint/internal/SyncedStore$Reader;->complete()V
/* .line 630 */
/* if-nez v0, :cond_1 */
/* .line 631 */
/* const/16 v4, 0x10 */
/* new-array v3, v4, [B */
/* .line 632 */
/* .local v3, "randomBytes":[B */
/* new-instance v4, Ljava/util/Random; */
/* invoke-direct {v4}, Ljava/util/Random;-><init>()V */
(( java.util.Random ) v4 ).nextBytes ( v3 ); // invoke-virtual {v4, v3}, Ljava/util/Random;->nextBytes([B)V
/* .line 633 */
/* new-instance v4, Ljava/lang/StringBuilder; */
/* invoke-direct {v4}, Ljava/lang/StringBuilder;-><init>()V */
final String v5 = "android-emu-"; // const-string v5, "android-emu-"
(( java.lang.StringBuilder ) v4 ).append ( v5 ); // invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
/* new-instance v5, Ljava/lang/String; */
org.apache.commons.codec.binary.Hex .encodeHex ( v3 );
/* invoke-direct {v5, v6}, Ljava/lang/String;-><init>([C)V */
final String v6 = "\r\n"; // const-string v6, "\r\n"
final String v7 = ""; // const-string v7, ""
(( java.lang.String ) v5 ).replace ( v6, v7 ); // invoke-virtual {v5, v6, v7}, Ljava/lang/String;->replace(Ljava/lang/CharSequence;Ljava/lang/CharSequence;)Ljava/lang/String;
(( java.lang.StringBuilder ) v4 ).append ( v5 ); // invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v4 ).toString ( ); // invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
/* .line 635 */
(( com.openfeint.internal.OpenFeintInternal ) p0 ).getPrefs ( ); // invoke-virtual {p0}, Lcom/openfeint/internal/OpenFeintInternal;->getPrefs()Lcom/openfeint/internal/SyncedStore;
(( com.openfeint.internal.SyncedStore ) v4 ).edit ( ); // invoke-virtual {v4}, Lcom/openfeint/internal/SyncedStore;->edit()Lcom/openfeint/internal/SyncedStore$Editor;
/* .line 637 */
/* .local v1, "e":Lcom/openfeint/internal/SyncedStore$Editor; */
try { // :try_start_1
final String v4 = "udid"; // const-string v4, "udid"
(( com.openfeint.internal.SyncedStore$Editor ) v1 ).putString ( v4, v0 ); // invoke-virtual {v1, v4, v0}, Lcom/openfeint/internal/SyncedStore$Editor;->putString(Ljava/lang/String;Ljava/lang/String;)V
/* :try_end_1 */
/* .catchall {:try_start_1 ..:try_end_1} :catchall_1 */
/* .line 639 */
(( com.openfeint.internal.SyncedStore$Editor ) v1 ).commit ( ); // invoke-virtual {v1}, Lcom/openfeint/internal/SyncedStore$Editor;->commit()V
} // .end local v1 # "e":Lcom/openfeint/internal/SyncedStore$Editor;
} // .end local v3 # "randomBytes":[B
} // :cond_1
/* move-object v4, v0 */
/* .line 643 */
/* .line 627 */
/* :catchall_0 */
/* move-exception v4 */
(( com.openfeint.internal.SyncedStore$Reader ) v2 ).complete ( ); // invoke-virtual {v2}, Lcom/openfeint/internal/SyncedStore$Reader;->complete()V
/* throw v4 */
/* .line 639 */
/* .restart local v1 # "e":Lcom/openfeint/internal/SyncedStore$Editor; */
/* .restart local v3 # "randomBytes":[B */
/* :catchall_1 */
/* move-exception v4 */
(( com.openfeint.internal.SyncedStore$Editor ) v1 ).commit ( ); // invoke-virtual {v1}, Lcom/openfeint/internal/SyncedStore$Editor;->commit()V
/* throw v4 */
} // .end method
public static void genericRequest ( java.lang.String p0, java.lang.String p1, java.util.Map p2, java.util.Map p3, com.openfeint.internal.request.IRawRequestDelegate p4 ) {
/* .locals 6 */
/* .param p0, "path" # Ljava/lang/String; */
/* .param p1, "method" # Ljava/lang/String; */
/* .param p4, "delegate" # Lcom/openfeint/internal/request/IRawRequestDelegate; */
/* .annotation system Ldalvik/annotation/Signature; */
/* value = { */
/* "(", */
/* "Ljava/lang/String;", */
/* "Ljava/lang/String;", */
/* "Ljava/util/Map", */
/* "<", */
/* "Ljava/lang/String;", */
/* "Ljava/lang/Object;", */
/* ">;", */
/* "Ljava/util/Map", */
/* "<", */
/* "Ljava/lang/String;", */
/* "Ljava/lang/Object;", */
/* ">;", */
/* "Lcom/openfeint/internal/request/IRawRequestDelegate;", */
/* ")V" */
/* } */
} // .end annotation
/* .prologue */
/* .line 513 */
/* .local p2, "args":Ljava/util/Map;, "Ljava/util/Map<Ljava/lang/String;Ljava/lang/Object;>;" */
/* .local p3, "httpParams":Ljava/util/Map;, "Ljava/util/Map<Ljava/lang/String;Ljava/lang/Object;>;" */
/* new-instance v0, Lcom/openfeint/internal/request/GenericRequest; */
/* move-object v1, p0 */
/* move-object v2, p1 */
/* move-object v3, p2 */
/* move-object v4, p3 */
/* move-object v5, p4 */
/* invoke-direct/range {v0 ..v5}, Lcom/openfeint/internal/request/GenericRequest;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;Ljava/util/Map;Lcom/openfeint/internal/request/IRawRequestDelegate;)V */
com.openfeint.internal.OpenFeintInternal .makeRequest ( v0 );
/* .line 514 */
return;
} // .end method
public static com.openfeint.internal.OpenFeintInternal getInstance ( ) {
/* .locals 1 */
/* .prologue */
/* .line 153 */
v0 = com.openfeint.internal.OpenFeintInternal.sInstance;
} // .end method
public static java.lang.String getModelString ( ) {
/* .locals 2 */
/* .prologue */
/* .line 283 */
/* new-instance v0, Ljava/lang/StringBuilder; */
/* invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V */
final String v1 = "p("; // const-string v1, "p("
(( java.lang.StringBuilder ) v0 ).append ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
v1 = android.os.Build.PRODUCT;
(( java.lang.StringBuilder ) v0 ).append ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
final String v1 = ")/m("; // const-string v1, ")/m("
(( java.lang.StringBuilder ) v0 ).append ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
v1 = android.os.Build.MODEL;
(( java.lang.StringBuilder ) v0 ).append ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
final String v1 = ")"; // const-string v1, ")"
(( java.lang.StringBuilder ) v0 ).append ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v0 ).toString ( ); // invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
} // .end method
public static java.lang.String getOSVersionString ( ) {
/* .locals 2 */
/* .prologue */
/* .line 287 */
/* new-instance v0, Ljava/lang/StringBuilder; */
/* invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V */
final String v1 = "v"; // const-string v1, "v"
(( java.lang.StringBuilder ) v0 ).append ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
v1 = android.os.Build$VERSION.RELEASE;
(( java.lang.StringBuilder ) v0 ).append ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
final String v1 = " ("; // const-string v1, " ("
(( java.lang.StringBuilder ) v0 ).append ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
v1 = android.os.Build$VERSION.INCREMENTAL;
(( java.lang.StringBuilder ) v0 ).append ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
final String v1 = ")"; // const-string v1, ")"
(( java.lang.StringBuilder ) v0 ).append ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v0 ).toString ( ); // invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
} // .end method
public static java.lang.String getProcessorInfo ( ) {
/* .locals 8 */
/* .prologue */
/* .line 296 */
final String v0 = "unknown"; // const-string v0, "unknown"
/* .line 298 */
/* .local v0, "family":Ljava/lang/String; */
try { // :try_start_0
final String v3 = "/proc/cpuinfo"; // const-string v3, "/proc/cpuinfo"
com.openfeint.internal.OpenFeintInternal .cat ( v3 );
/* .local v1, "i$":Ljava/util/Iterator; */
v3 = } // :cond_0
if ( v3 != null) { // if-eqz v3, :cond_1
/* check-cast v2, Ljava/lang/String; */
/* .line 299 */
/* .local v2, "l":Ljava/lang/String; */
final String v3 = "Processor\t"; // const-string v3, "Processor\t"
v3 = (( java.lang.String ) v2 ).startsWith ( v3 ); // invoke-virtual {v2, v3}, Ljava/lang/String;->startsWith(Ljava/lang/String;)Z
if ( v3 != null) { // if-eqz v3, :cond_0
/* .line 300 */
final String v3 = ":"; // const-string v3, ":"
(( java.lang.String ) v2 ).split ( v3 ); // invoke-virtual {v2, v3}, Ljava/lang/String;->split(Ljava/lang/String;)[Ljava/lang/String;
int v4 = 1; // const/4 v4, 0x1
/* aget-object v3, v3, v4 */
(( java.lang.String ) v3 ).trim ( ); // invoke-virtual {v3}, Ljava/lang/String;->trim()Ljava/lang/String;
/* .line 305 */
} // .end local v2 # "l":Ljava/lang/String;
} // :cond_1
final String v3 = "family(%s) min(%s) max(%s)"; // const-string v3, "family(%s) min(%s) max(%s)"
int v4 = 3; // const/4 v4, 0x3
/* new-array v4, v4, [Ljava/lang/Object; */
int v5 = 0; // const/4 v5, 0x0
/* aput-object v0, v4, v5 */
int v5 = 1; // const/4 v5, 0x1
final String v6 = "/sys/devices/system/cpu/cpu0/cpufreq/cpuinfo_min_freq"; // const-string v6, "/sys/devices/system/cpu/cpu0/cpufreq/cpuinfo_min_freq"
com.openfeint.internal.OpenFeintInternal .cat ( v6 );
int v7 = 0; // const/4 v7, 0x0
/* aput-object v6, v4, v5 */
int v5 = 2; // const/4 v5, 0x2
final String v6 = "/sys/devices/system/cpu/cpu0/cpufreq/cpuinfo_max_freq"; // const-string v6, "/sys/devices/system/cpu/cpu0/cpufreq/cpuinfo_max_freq"
com.openfeint.internal.OpenFeintInternal .cat ( v6 );
int v7 = 0; // const/4 v7, 0x0
/* aput-object v6, v4, v5 */
java.lang.String .format ( v3,v4 );
/* :try_end_0 */
/* .catch Ljava/lang/Exception; {:try_start_0 ..:try_end_0} :catch_0 */
/* .line 314 */
} // .end local v1 # "i$":Ljava/util/Iterator;
} // :goto_0
/* .line 310 */
/* :catch_0 */
/* move-exception v3 */
/* .line 314 */
final String v3 = "family(unknown) min(unknown) max(unknown)"; // const-string v3, "family(unknown) min(unknown) max(unknown)"
} // .end method
public static java.lang.String getRString ( Integer p0 ) {
/* .locals 3 */
/* .param p0, "id" # I */
/* .prologue */
/* .line 740 */
com.openfeint.internal.OpenFeintInternal .getInstance ( );
/* .line 741 */
/* .local v1, "ofi":Lcom/openfeint/internal/OpenFeintInternal; */
(( com.openfeint.internal.OpenFeintInternal ) v1 ).getContext ( ); // invoke-virtual {v1}, Lcom/openfeint/internal/OpenFeintInternal;->getContext()Landroid/content/Context;
/* .line 742 */
/* .local v0, "ctx":Landroid/content/Context; */
(( android.content.Context ) v0 ).getResources ( ); // invoke-virtual {v0}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;
(( android.content.res.Resources ) v2 ).getString ( p0 ); // invoke-virtual {v2, p0}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;
} // .end method
public static java.lang.String getScreenInfo ( ) {
/* .locals 5 */
/* .prologue */
/* .line 291 */
com.openfeint.internal.Util .getDisplayMetrics ( );
/* .line 292 */
/* .local v0, "metrics":Landroid/util/DisplayMetrics; */
final String v1 = "%dx%d (%f dpi)"; // const-string v1, "%dx%d (%f dpi)"
int v2 = 3; // const/4 v2, 0x3
/* new-array v2, v2, [Ljava/lang/Object; */
int v3 = 0; // const/4 v3, 0x0
/* iget v4, v0, Landroid/util/DisplayMetrics;->widthPixels:I */
java.lang.Integer .valueOf ( v4 );
/* aput-object v4, v2, v3 */
int v3 = 1; // const/4 v3, 0x1
/* iget v4, v0, Landroid/util/DisplayMetrics;->heightPixels:I */
java.lang.Integer .valueOf ( v4 );
/* aput-object v4, v2, v3 */
int v3 = 2; // const/4 v3, 0x2
/* iget v4, v0, Landroid/util/DisplayMetrics;->density:F */
java.lang.Float .valueOf ( v4 );
/* aput-object v4, v2, v3 */
java.lang.String .format ( v1,v2 );
} // .end method
public static void initialize ( android.content.Context p0, com.openfeint.api.OpenFeintSettings p1, com.openfeint.api.OpenFeintDelegate p2 ) {
/* .locals 2 */
/* .param p0, "ctx" # Landroid/content/Context; */
/* .param p1, "settings" # Lcom/openfeint/api/OpenFeintSettings; */
/* .param p2, "delegate" # Lcom/openfeint/api/OpenFeintDelegate; */
/* .prologue */
/* .line 770 */
com.openfeint.internal.OpenFeintInternal .initializeWithoutLoggingIn ( p0,p1,p2 );
/* .line 771 */
com.openfeint.internal.OpenFeintInternal .getInstance ( );
/* .line 772 */
/* .local v0, "ofi":Lcom/openfeint/internal/OpenFeintInternal; */
if ( v0 != null) { // if-eqz v0, :cond_0
/* .line 773 */
int v1 = 0; // const/4 v1, 0x0
(( com.openfeint.internal.OpenFeintInternal ) v0 ).login ( v1 ); // invoke-virtual {v0, v1}, Lcom/openfeint/internal/OpenFeintInternal;->login(Z)V
/* .line 775 */
} // :cond_0
return;
} // .end method
public static void initializeWithoutLoggingIn ( android.content.Context p0, com.openfeint.api.OpenFeintSettings p1, com.openfeint.api.OpenFeintDelegate p2 ) {
/* .locals 2 */
/* .param p0, "ctx" # Landroid/content/Context; */
/* .param p1, "settings" # Lcom/openfeint/api/OpenFeintSettings; */
/* .param p2, "delegate" # Lcom/openfeint/api/OpenFeintDelegate; */
/* .prologue */
/* .line 748 */
com.openfeint.internal.OpenFeintInternal .validateManifest ( p0 );
/* .line 750 */
v1 = com.openfeint.internal.OpenFeintInternal.sInstance;
/* if-nez v1, :cond_0 */
/* .line 751 */
/* new-instance v1, Lcom/openfeint/internal/OpenFeintInternal; */
/* invoke-direct {v1, p1, p0}, Lcom/openfeint/internal/OpenFeintInternal;-><init>(Lcom/openfeint/api/OpenFeintSettings;Landroid/content/Context;)V */
/* .line 754 */
} // :cond_0
v1 = com.openfeint.internal.OpenFeintInternal.sInstance;
this.mDelegate = p2;
/* .line 756 */
v1 = com.openfeint.internal.OpenFeintInternal.sInstance;
/* iget-boolean v1, v1, Lcom/openfeint/internal/OpenFeintInternal;->mDeclined:Z */
/* if-nez v1, :cond_2 */
/* .line 757 */
v1 = com.openfeint.internal.OpenFeintInternal.sInstance;
(( com.openfeint.internal.OpenFeintInternal ) v1 ).getUserID ( ); // invoke-virtual {v1}, Lcom/openfeint/internal/OpenFeintInternal;->getUserID()Ljava/lang/String;
/* .line 758 */
/* .local v0, "userID":Ljava/lang/String; */
/* if-nez v0, :cond_1 */
/* .line 759 */
com.openfeint.internal.offline.OfflineSupport .setUserTemporary ( );
/* .line 763 */
} // :goto_0
v1 = com.openfeint.internal.OpenFeintInternal.sInstance;
(( com.openfeint.internal.OpenFeintInternal ) v1 ).createDeviceSession ( ); // invoke-virtual {v1}, Lcom/openfeint/internal/OpenFeintInternal;->createDeviceSession()V
/* .line 767 */
} // .end local v0 # "userID":Ljava/lang/String;
} // :goto_1
return;
/* .line 761 */
/* .restart local v0 # "userID":Ljava/lang/String; */
} // :cond_1
com.openfeint.internal.offline.OfflineSupport .setUserID ( v0 );
/* .line 765 */
} // .end local v0 # "userID":Ljava/lang/String;
} // :cond_2
com.openfeint.internal.offline.OfflineSupport .setUserDeclined ( );
} // .end method
private final com.openfeint.api.resource.User lastLoggedInUser ( ) {
/* .locals 6 */
/* .prologue */
/* .line 891 */
/* invoke-direct {p0}, Lcom/openfeint/internal/OpenFeintInternal;->loadUser()Lcom/openfeint/api/resource/User; */
/* .line 893 */
/* .local v3, "savedUser":Lcom/openfeint/api/resource/User; */
(( com.openfeint.internal.OpenFeintInternal ) p0 ).getPrefs ( ); // invoke-virtual {p0}, Lcom/openfeint/internal/OpenFeintInternal;->getPrefs()Lcom/openfeint/internal/SyncedStore;
(( com.openfeint.internal.SyncedStore ) v4 ).read ( ); // invoke-virtual {v4}, Lcom/openfeint/internal/SyncedStore;->read()Lcom/openfeint/internal/SyncedStore$Reader;
/* .line 896 */
/* .local v1, "r":Lcom/openfeint/internal/SyncedStore$Reader; */
try { // :try_start_0
/* new-instance v2, Ljava/net/URL; */
(( com.openfeint.internal.OpenFeintInternal ) p0 ).getServerUrl ( ); // invoke-virtual {p0}, Lcom/openfeint/internal/OpenFeintInternal;->getServerUrl()Ljava/lang/String;
/* invoke-direct {v2, v4}, Ljava/net/URL;-><init>(Ljava/lang/String;)V */
/* .line 897 */
/* .local v2, "saved":Ljava/net/URL; */
/* new-instance v0, Ljava/net/URL; */
final String v4 = "last_logged_in_server"; // const-string v4, "last_logged_in_server"
final String v5 = ""; // const-string v5, ""
(( com.openfeint.internal.SyncedStore$Reader ) v1 ).getString ( v4, v5 ); // invoke-virtual {v1, v4, v5}, Lcom/openfeint/internal/SyncedStore$Reader;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
/* invoke-direct {v0, v4}, Ljava/net/URL;-><init>(Ljava/lang/String;)V */
/* .line 898 */
/* .local v0, "loaded":Ljava/net/URL; */
if ( v3 != null) { // if-eqz v3, :cond_0
(( java.net.URL ) v2 ).equals ( v0 ); // invoke-virtual {v2, v0}, Ljava/net/URL;->equals(Ljava/lang/Object;)Z
/* :try_end_0 */
/* .catch Ljava/net/MalformedURLException; {:try_start_0 ..:try_end_0} :catch_0 */
v4 = /* .catchall {:try_start_0 ..:try_end_0} :catchall_0 */
if ( v4 != null) { // if-eqz v4, :cond_0
/* .line 902 */
(( com.openfeint.internal.SyncedStore$Reader ) v1 ).complete ( ); // invoke-virtual {v1}, Lcom/openfeint/internal/SyncedStore$Reader;->complete()V
/* .line 905 */
} // .end local v0 # "loaded":Ljava/net/URL;
} // .end local v2 # "saved":Ljava/net/URL;
} // .end local v3 # "savedUser":Lcom/openfeint/api/resource/User;
} // :goto_0
/* .line 902 */
/* .restart local v0 # "loaded":Ljava/net/URL; */
/* .restart local v2 # "saved":Ljava/net/URL; */
/* .restart local v3 # "savedUser":Lcom/openfeint/api/resource/User; */
} // :cond_0
(( com.openfeint.internal.SyncedStore$Reader ) v1 ).complete ( ); // invoke-virtual {v1}, Lcom/openfeint/internal/SyncedStore$Reader;->complete()V
/* .line 905 */
} // .end local v0 # "loaded":Ljava/net/URL;
} // .end local v2 # "saved":Ljava/net/URL;
} // :goto_1
int v3 = 0; // const/4 v3, 0x0
/* .line 900 */
/* :catch_0 */
/* move-exception v4 */
/* .line 902 */
(( com.openfeint.internal.SyncedStore$Reader ) v1 ).complete ( ); // invoke-virtual {v1}, Lcom/openfeint/internal/SyncedStore$Reader;->complete()V
/* :catchall_0 */
/* move-exception v4 */
(( com.openfeint.internal.SyncedStore$Reader ) v1 ).complete ( ); // invoke-virtual {v1}, Lcom/openfeint/internal/SyncedStore$Reader;->complete()V
/* throw v4 */
} // .end method
private void loadPropertiesFromXMLResource ( java.util.Properties p0, Integer p1 ) {
/* .locals 6 */
/* .param p1, "defaults" # Ljava/util/Properties; */
/* .param p2, "resourceID" # I */
/* .prologue */
/* .line 1026 */
int v3 = 0; // const/4 v3, 0x0
/* .line 1028 */
/* .local v3, "xml":Landroid/content/res/XmlResourceParser; */
try { // :try_start_0
(( com.openfeint.internal.OpenFeintInternal ) p0 ).getContext ( ); // invoke-virtual {p0}, Lcom/openfeint/internal/OpenFeintInternal;->getContext()Landroid/content/Context;
(( android.content.Context ) v4 ).getResources ( ); // invoke-virtual {v4}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;
(( android.content.res.Resources ) v4 ).getXml ( p2 ); // invoke-virtual {v4, p2}, Landroid/content/res/Resources;->getXml(I)Landroid/content/res/XmlResourceParser;
/* :try_end_0 */
/* .catch Ljava/lang/Exception; {:try_start_0 ..:try_end_0} :catch_1 */
/* .line 1031 */
} // :goto_0
if ( v3 != null) { // if-eqz v3, :cond_3
/* .line 1034 */
int v2 = 0; // const/4 v2, 0x0
/* .line 1035 */
/* .local v2, "k":Ljava/lang/String; */
v1 = try { // :try_start_1
/* .local v1, "eventType":I */
v4 = } // :goto_1
int v5 = 1; // const/4 v5, 0x1
/* if-eq v4, v5, :cond_2 */
/* .line 1036 */
int v4 = 2; // const/4 v4, 0x2
/* if-ne v1, v4, :cond_1 */
/* .line 1037 */
/* .line 1035 */
} // :cond_0
v1 = } // :goto_2
/* .line 1038 */
v4 = } // :cond_1
int v5 = 4; // const/4 v5, 0x4
/* if-ne v4, v5, :cond_0 */
/* .line 1039 */
(( java.util.Properties ) p1 ).setProperty ( v2, v4 ); // invoke-virtual {p1, v2, v4}, Ljava/util/Properties;->setProperty(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/Object;
/* :try_end_1 */
/* .catch Ljava/lang/Exception; {:try_start_1 ..:try_end_1} :catch_0 */
/* .line 1042 */
} // .end local v1 # "eventType":I
/* :catch_0 */
/* move-exception v0 */
/* .line 1043 */
/* .local v0, "e":Ljava/lang/Exception; */
/* new-instance v4, Ljava/lang/RuntimeException; */
/* invoke-direct {v4, v0}, Ljava/lang/RuntimeException;-><init>(Ljava/lang/Throwable;)V */
/* throw v4 */
/* .line 1046 */
} // .end local v0 # "e":Ljava/lang/Exception;
/* .restart local v1 # "eventType":I */
} // :cond_2
/* .line 1048 */
} // .end local v1 # "eventType":I
} // .end local v2 # "k":Ljava/lang/String;
} // :cond_3
return;
/* .line 1029 */
/* :catch_1 */
/* move-exception v4 */
} // .end method
private com.openfeint.api.resource.User loadUser ( ) {
/* .locals 4 */
/* .prologue */
/* .line 172 */
int v1 = 0; // const/4 v1, 0x0
/* .line 173 */
/* .local v1, "urep":Ljava/lang/String; */
(( com.openfeint.internal.OpenFeintInternal ) p0 ).getPrefs ( ); // invoke-virtual {p0}, Lcom/openfeint/internal/OpenFeintInternal;->getPrefs()Lcom/openfeint/internal/SyncedStore;
(( com.openfeint.internal.SyncedStore ) v2 ).read ( ); // invoke-virtual {v2}, Lcom/openfeint/internal/SyncedStore;->read()Lcom/openfeint/internal/SyncedStore$Reader;
/* .line 175 */
/* .local v0, "r":Lcom/openfeint/internal/SyncedStore$Reader; */
try { // :try_start_0
final String v2 = "last_logged_in_user"; // const-string v2, "last_logged_in_user"
int v3 = 0; // const/4 v3, 0x0
(( com.openfeint.internal.SyncedStore$Reader ) v0 ).getString ( v2, v3 ); // invoke-virtual {v0, v2, v3}, Lcom/openfeint/internal/SyncedStore$Reader;->getString(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
/* :try_end_0 */
/* .catchall {:try_start_0 ..:try_end_0} :catchall_0 */
/* .line 177 */
(( com.openfeint.internal.SyncedStore$Reader ) v0 ).complete ( ); // invoke-virtual {v0}, Lcom/openfeint/internal/SyncedStore$Reader;->complete()V
/* .line 179 */
com.openfeint.internal.OpenFeintInternal .userFromString ( v1 );
/* .line 177 */
/* :catchall_0 */
/* move-exception v2 */
(( com.openfeint.internal.SyncedStore$Reader ) v0 ).complete ( ); // invoke-virtual {v0}, Lcom/openfeint/internal/SyncedStore$Reader;->complete()V
/* throw v2 */
} // .end method
public static void log ( java.lang.String p0, java.lang.String p1 ) {
/* .locals 0 */
/* .param p0, "tag" # Ljava/lang/String; */
/* .param p1, "message" # Ljava/lang/String; */
/* .prologue */
/* .line 1063 */
return;
} // .end method
public static void makeRequest ( com.openfeint.internal.request.BaseRequest p0 ) {
/* .locals 4 */
/* .param p0, "req" # Lcom/openfeint/internal/request/BaseRequest; */
/* .prologue */
/* .line 648 */
com.openfeint.internal.OpenFeintInternal .getInstance ( );
/* .line 649 */
/* .local v1, "ofi":Lcom/openfeint/internal/OpenFeintInternal; */
/* if-nez v1, :cond_0 */
/* .line 650 */
/* new-instance v0, Lcom/openfeint/internal/resource/ServerException; */
/* invoke-direct {v0}, Lcom/openfeint/internal/resource/ServerException;-><init>()V */
/* .line 651 */
/* .local v0, "e":Lcom/openfeint/internal/resource/ServerException; */
final String v2 = "NoFeint"; // const-string v2, "NoFeint"
this.exceptionClass = v2;
/* .line 652 */
final String v2 = "OpenFeint has not been initialized."; // const-string v2, "OpenFeint has not been initialized."
this.message = v2;
/* .line 653 */
int v2 = 0; // const/4 v2, 0x0
(( com.openfeint.internal.resource.ServerException ) v0 ).generate ( ); // invoke-virtual {v0}, Lcom/openfeint/internal/resource/ServerException;->generate()Ljava/lang/String;
(( java.lang.String ) v3 ).getBytes ( ); // invoke-virtual {v3}, Ljava/lang/String;->getBytes()[B
(( com.openfeint.internal.request.BaseRequest ) p0 ).onResponse ( v2, v3 ); // invoke-virtual {p0, v2, v3}, Lcom/openfeint/internal/request/BaseRequest;->onResponse(I[B)V
/* .line 657 */
} // .end local v0 # "e":Lcom/openfeint/internal/resource/ServerException;
} // :goto_0
return;
/* .line 655 */
} // :cond_0
/* invoke-direct {v1, p0}, Lcom/openfeint/internal/OpenFeintInternal;->_makeRequest(Lcom/openfeint/internal/request/BaseRequest;)V */
} // .end method
public static void restoreInstanceState ( android.os.Bundle p0 ) {
/* .locals 1 */
/* .param p0, "inState" # Landroid/os/Bundle; */
/* .prologue */
/* .line 149 */
com.openfeint.internal.OpenFeintInternal .getInstance ( );
/* invoke-direct {v0, p0}, Lcom/openfeint/internal/OpenFeintInternal;->_restoreInstanceState(Landroid/os/Bundle;)V */
/* .line 150 */
return;
} // .end method
public static void saveInstanceState ( android.os.Bundle p0 ) {
/* .locals 1 */
/* .param p0, "outState" # Landroid/os/Bundle; */
/* .prologue */
/* .line 145 */
com.openfeint.internal.OpenFeintInternal .getInstance ( );
/* invoke-direct {v0, p0}, Lcom/openfeint/internal/OpenFeintInternal;->_saveInstanceState(Landroid/os/Bundle;)V */
/* .line 146 */
return;
} // .end method
private void saveUser ( com.openfeint.internal.SyncedStore$Editor p0, com.openfeint.api.resource.User p1 ) {
/* .locals 2 */
/* .param p1, "e" # Lcom/openfeint/internal/SyncedStore$Editor; */
/* .param p2, "u" # Lcom/openfeint/api/resource/User; */
/* .prologue */
/* .line 164 */
final String v0 = "last_logged_in_user"; // const-string v0, "last_logged_in_user"
(( com.openfeint.api.resource.User ) p2 ).generate ( ); // invoke-virtual {p2}, Lcom/openfeint/api/resource/User;->generate()Ljava/lang/String;
(( com.openfeint.internal.SyncedStore$Editor ) p1 ).putString ( v0, v1 ); // invoke-virtual {p1, v0, v1}, Lcom/openfeint/internal/SyncedStore$Editor;->putString(Ljava/lang/String;Ljava/lang/String;)V
/* .line 165 */
return;
} // .end method
private void saveUserApproval ( com.openfeint.internal.SyncedStore$Editor p0 ) {
/* .locals 2 */
/* .param p1, "e" # Lcom/openfeint/internal/SyncedStore$Editor; */
/* .prologue */
/* .line 532 */
/* new-instance v0, Ljava/lang/StringBuilder; */
/* invoke-direct {v0}, Ljava/lang/StringBuilder;-><init>()V */
(( com.openfeint.internal.OpenFeintInternal ) p0 ).getContext ( ); // invoke-virtual {p0}, Lcom/openfeint/internal/OpenFeintInternal;->getContext()Landroid/content/Context;
(( android.content.Context ) v1 ).getPackageName ( ); // invoke-virtual {v1}, Landroid/content/Context;->getPackageName()Ljava/lang/String;
(( java.lang.StringBuilder ) v0 ).append ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
final String v1 = ".of_declined"; // const-string v1, ".of_declined"
(( java.lang.StringBuilder ) v0 ).append ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v0 ).toString ( ); // invoke-virtual {v0}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
(( com.openfeint.internal.SyncedStore$Editor ) p1 ).remove ( v0 ); // invoke-virtual {p1, v0}, Lcom/openfeint/internal/SyncedStore$Editor;->remove(Ljava/lang/String;)V
/* .line 533 */
return;
} // .end method
private void showOfflineNotification ( Integer p0, java.lang.Object p1 ) {
/* .locals 5 */
/* .param p1, "httpCode" # I */
/* .param p2, "responseBody" # Ljava/lang/Object; */
/* .prologue */
/* .line 1005 */
(( com.openfeint.internal.OpenFeintInternal ) p0 ).getContext ( ); // invoke-virtual {p0}, Lcom/openfeint/internal/OpenFeintInternal;->getContext()Landroid/content/Context;
(( android.content.Context ) v2 ).getResources ( ); // invoke-virtual {v2}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;
/* .line 1006 */
/* .local v0, "r":Landroid/content/res/Resources; */
(( android.content.res.Resources ) v0 ).getString ( v2 ); // invoke-virtual {v0, v2}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;
/* .line 1008 */
/* .local v1, "serverMessage":Ljava/lang/String; */
if ( p1 != null) { // if-eqz p1, :cond_1
/* .line 1009 */
/* const/16 v2, 0x193 */
/* if-ne v2, p1, :cond_0 */
/* .line 1010 */
int v2 = 1; // const/4 v2, 0x1
/* iput-boolean v2, p0, Lcom/openfeint/internal/OpenFeintInternal;->mBanned:Z */
/* .line 1013 */
} // :cond_0
/* instance-of v2, p2, Lcom/openfeint/internal/resource/ServerException; */
if ( v2 != null) { // if-eqz v2, :cond_1
/* .line 1014 */
/* check-cast p2, Lcom/openfeint/internal/resource/ServerException; */
} // .end local p2 # "responseBody":Ljava/lang/Object;
v1 = this.message;
/* .line 1018 */
} // :cond_1
(( android.content.res.Resources ) v0 ).getString ( v2 ); // invoke-virtual {v0, v2}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;
v3 = com.openfeint.api.Notification$Category.Foreground;
v4 = com.openfeint.api.Notification$Type.NetworkOffline;
com.openfeint.internal.notifications.TwoLineNotification .show ( v2,v1,v3,v4 );
/* .line 1022 */
final String v2 = "Reachability"; // const-string v2, "Reachability"
/* new-instance v3, Ljava/lang/StringBuilder; */
/* invoke-direct {v3}, Ljava/lang/StringBuilder;-><init>()V */
final String v4 = "Unable to launch IntroFlow because: "; // const-string v4, "Unable to launch IntroFlow because: "
(( java.lang.StringBuilder ) v3 ).append ( v4 ); // invoke-virtual {v3, v4}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v3 ).append ( v1 ); // invoke-virtual {v3, v1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v3 ).toString ( ); // invoke-virtual {v3}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
com.openfeint.internal.OpenFeintInternal .log ( v2,v3 );
/* .line 1023 */
return;
} // .end method
private static com.openfeint.api.resource.User userFromString ( java.lang.String p0 ) {
/* .locals 7 */
/* .param p0, "urep" # Ljava/lang/String; */
/* .prologue */
int v4 = 0; // const/4 v4, 0x0
/* .line 183 */
/* if-nez p0, :cond_0 */
/* move-object v3, v4 */
/* .line 196 */
} // :goto_0
/* .line 186 */
} // :cond_0
try { // :try_start_0
/* new-instance v2, Lorg/codehaus/jackson/JsonFactory; */
/* invoke-direct {v2}, Lorg/codehaus/jackson/JsonFactory;-><init>()V */
/* .line 187 */
/* .local v2, "jsonFactory":Lorg/codehaus/jackson/JsonFactory; */
/* new-instance v5, Ljava/io/ByteArrayInputStream; */
(( java.lang.String ) p0 ).getBytes ( ); // invoke-virtual {p0}, Ljava/lang/String;->getBytes()[B
/* invoke-direct {v5, v6}, Ljava/io/ByteArrayInputStream;-><init>([B)V */
(( org.codehaus.jackson.JsonFactory ) v2 ).createJsonParser ( v5 ); // invoke-virtual {v2, v5}, Lorg/codehaus/jackson/JsonFactory;->createJsonParser(Ljava/io/InputStream;)Lorg/codehaus/jackson/JsonParser;
/* .line 188 */
/* .local v0, "jp":Lorg/codehaus/jackson/JsonParser; */
/* new-instance v1, Lcom/openfeint/internal/JsonResourceParser; */
/* invoke-direct {v1, v0}, Lcom/openfeint/internal/JsonResourceParser;-><init>(Lorg/codehaus/jackson/JsonParser;)V */
/* .line 189 */
/* .local v1, "jrp":Lcom/openfeint/internal/JsonResourceParser; */
(( com.openfeint.internal.JsonResourceParser ) v1 ).parse ( ); // invoke-virtual {v1}, Lcom/openfeint/internal/JsonResourceParser;->parse()Ljava/lang/Object;
/* .line 191 */
/* .local v3, "responseBody":Ljava/lang/Object; */
if ( v3 != null) { // if-eqz v3, :cond_1
/* instance-of v5, v3, Lcom/openfeint/api/resource/User; */
if ( v5 != null) { // if-eqz v5, :cond_1
/* .line 192 */
/* check-cast v3, Lcom/openfeint/api/resource/User; */
/* :try_end_0 */
/* .catch Ljava/io/IOException; {:try_start_0 ..:try_end_0} :catch_0 */
/* .line 194 */
} // .end local v0 # "jp":Lorg/codehaus/jackson/JsonParser;
} // .end local v1 # "jrp":Lcom/openfeint/internal/JsonResourceParser;
} // .end local v2 # "jsonFactory":Lorg/codehaus/jackson/JsonFactory;
} // .end local v3 # "responseBody":Ljava/lang/Object;
/* :catch_0 */
/* move-exception v5 */
} // :cond_1
/* move-object v3, v4 */
/* .line 196 */
} // .end method
private void userLoggedIn ( com.openfeint.api.resource.User p0 ) {
/* .locals 4 */
/* .param p1, "loggedInUser" # Lcom/openfeint/api/resource/User; */
/* .prologue */
/* .line 200 */
/* new-instance v2, Lcom/openfeint/api/resource/CurrentUser; */
/* invoke-direct {v2}, Lcom/openfeint/api/resource/CurrentUser;-><init>()V */
this.mCurrentUser = v2;
/* .line 201 */
v2 = this.mCurrentUser;
(( com.openfeint.api.resource.CurrentUser ) v2 ).shallowCopyAncestorType ( p1 ); // invoke-virtual {v2, p1}, Lcom/openfeint/api/resource/CurrentUser;->shallowCopyAncestorType(Lcom/openfeint/internal/resource/Resource;)V
/* .line 203 */
/* invoke-direct {p0}, Lcom/openfeint/internal/OpenFeintInternal;->lastLoggedInUser()Lcom/openfeint/api/resource/User; */
/* .line 204 */
/* .local v1, "lliu":Lcom/openfeint/api/resource/User; */
if ( v1 != null) { // if-eqz v1, :cond_0
(( com.openfeint.api.resource.User ) v1 ).resourceID ( ); // invoke-virtual {v1}, Lcom/openfeint/api/resource/User;->resourceID()Ljava/lang/String;
(( com.openfeint.api.resource.User ) p1 ).resourceID ( ); // invoke-virtual {p1}, Lcom/openfeint/api/resource/User;->resourceID()Ljava/lang/String;
v2 = (( java.lang.String ) v2 ).equals ( v3 ); // invoke-virtual {v2, v3}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
/* if-nez v2, :cond_1 */
/* .line 207 */
} // :cond_0
android.webkit.CookieManager .getInstance ( );
(( android.webkit.CookieManager ) v2 ).removeAllCookie ( ); // invoke-virtual {v2}, Landroid/webkit/CookieManager;->removeAllCookie()V
/* .line 210 */
} // :cond_1
(( com.openfeint.internal.OpenFeintInternal ) p0 ).getPrefs ( ); // invoke-virtual {p0}, Lcom/openfeint/internal/OpenFeintInternal;->getPrefs()Lcom/openfeint/internal/SyncedStore;
(( com.openfeint.internal.SyncedStore ) v2 ).edit ( ); // invoke-virtual {v2}, Lcom/openfeint/internal/SyncedStore;->edit()Lcom/openfeint/internal/SyncedStore$Editor;
/* .line 212 */
/* .local v0, "e":Lcom/openfeint/internal/SyncedStore$Editor; */
try { // :try_start_0
final String v2 = "last_logged_in_server"; // const-string v2, "last_logged_in_server"
(( com.openfeint.internal.OpenFeintInternal ) p0 ).getServerUrl ( ); // invoke-virtual {p0}, Lcom/openfeint/internal/OpenFeintInternal;->getServerUrl()Ljava/lang/String;
(( com.openfeint.internal.SyncedStore$Editor ) v0 ).putString ( v2, v3 ); // invoke-virtual {v0, v2, v3}, Lcom/openfeint/internal/SyncedStore$Editor;->putString(Ljava/lang/String;Ljava/lang/String;)V
/* .line 213 */
/* invoke-direct {p0, v0}, Lcom/openfeint/internal/OpenFeintInternal;->saveUserApproval(Lcom/openfeint/internal/SyncedStore$Editor;)V */
/* .line 215 */
/* invoke-direct {p0, v0, p1}, Lcom/openfeint/internal/OpenFeintInternal;->saveUser(Lcom/openfeint/internal/SyncedStore$Editor;Lcom/openfeint/api/resource/User;)V */
/* :try_end_0 */
/* .catchall {:try_start_0 ..:try_end_0} :catchall_0 */
/* .line 217 */
(( com.openfeint.internal.SyncedStore$Editor ) v0 ).commit ( ); // invoke-virtual {v0}, Lcom/openfeint/internal/SyncedStore$Editor;->commit()V
/* .line 220 */
v2 = this.mDelegate;
if ( v2 != null) { // if-eqz v2, :cond_2
/* .line 221 */
v2 = this.mDelegate;
v3 = this.mCurrentUser;
(( com.openfeint.api.OpenFeintDelegate ) v2 ).userLoggedIn ( v3 ); // invoke-virtual {v2, v3}, Lcom/openfeint/api/OpenFeintDelegate;->userLoggedIn(Lcom/openfeint/api/resource/CurrentUser;)V
/* .line 223 */
} // :cond_2
v2 = this.mLoginDelegate;
if ( v2 != null) { // if-eqz v2, :cond_3
/* .line 224 */
v2 = this.mLoginDelegate;
v3 = this.mCurrentUser;
/* .line 226 */
} // :cond_3
v2 = this.mPostLoginRunnable;
if ( v2 != null) { // if-eqz v2, :cond_4
/* .line 227 */
v2 = this.mMainThreadHandler;
v3 = this.mPostLoginRunnable;
(( android.os.Handler ) v2 ).post ( v3 ); // invoke-virtual {v2, v3}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z
/* .line 228 */
int v2 = 0; // const/4 v2, 0x0
this.mPostLoginRunnable = v2;
/* .line 230 */
} // :cond_4
(( com.openfeint.internal.OpenFeintInternal ) p0 ).getAnalytics ( ); // invoke-virtual {p0}, Lcom/openfeint/internal/OpenFeintInternal;->getAnalytics()Lcom/openfeint/internal/Analytics;
int v3 = 1; // const/4 v3, 0x1
(( com.openfeint.internal.Analytics ) v2 ).markSessionOpen ( v3 ); // invoke-virtual {v2, v3}, Lcom/openfeint/internal/Analytics;->markSessionOpen(Z)V
/* .line 232 */
(( com.openfeint.api.resource.User ) p1 ).resourceID ( ); // invoke-virtual {p1}, Lcom/openfeint/api/resource/User;->resourceID()Ljava/lang/String;
com.openfeint.internal.offline.OfflineSupport .setUserID ( v2 );
/* .line 233 */
return;
/* .line 217 */
/* :catchall_0 */
/* move-exception v2 */
(( com.openfeint.internal.SyncedStore$Editor ) v0 ).commit ( ); // invoke-virtual {v0}, Lcom/openfeint/internal/SyncedStore$Editor;->commit()V
/* throw v2 */
} // .end method
private void userLoggedOut ( ) {
/* .locals 2 */
/* .prologue */
/* .line 236 */
v0 = this.mCurrentUser;
/* .line 237 */
/* .local v0, "previousLocalUser":Lcom/openfeint/api/resource/User; */
int v1 = 0; // const/4 v1, 0x0
this.mCurrentUser = v1;
/* .line 239 */
int v1 = 0; // const/4 v1, 0x0
/* iput-boolean v1, p0, Lcom/openfeint/internal/OpenFeintInternal;->mDeviceSessionCreated:Z */
/* .line 241 */
/* invoke-direct {p0}, Lcom/openfeint/internal/OpenFeintInternal;->clearPrefs()V */
/* .line 243 */
v1 = this.mDelegate;
if ( v1 != null) { // if-eqz v1, :cond_0
/* .line 244 */
v1 = this.mDelegate;
(( com.openfeint.api.OpenFeintDelegate ) v1 ).userLoggedOut ( v0 ); // invoke-virtual {v1, v0}, Lcom/openfeint/api/OpenFeintDelegate;->userLoggedOut(Lcom/openfeint/api/resource/User;)V
/* .line 246 */
} // :cond_0
(( com.openfeint.internal.OpenFeintInternal ) p0 ).getAnalytics ( ); // invoke-virtual {p0}, Lcom/openfeint/internal/OpenFeintInternal;->getAnalytics()Lcom/openfeint/internal/Analytics;
(( com.openfeint.internal.Analytics ) v1 ).markSessionClose ( ); // invoke-virtual {v1}, Lcom/openfeint/internal/Analytics;->markSessionClose()V
/* .line 248 */
com.openfeint.internal.offline.OfflineSupport .setUserDeclined ( );
/* .line 249 */
return;
} // .end method
private static Boolean validateManifest ( android.content.Context p0 ) {
/* .locals 20 */
/* .param p0, "appContext" # Landroid/content/Context; */
/* .prologue */
/* .line 783 */
/* invoke-virtual/range {p0 ..p0}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager; */
/* .line 785 */
/* .local v13, "packageManager":Landroid/content/pm/PackageManager; */
try { // :try_start_0
/* invoke-virtual/range {p0 ..p0}, Landroid/content/Context;->getPackageName()Ljava/lang/String; */
/* const/16 v16, 0x1 */
/* move/from16 v0, v16 */
(( android.content.pm.PackageManager ) v13 ).getPackageInfo ( v15, v0 ); // invoke-virtual {v13, v15, v0}, Landroid/content/pm/PackageManager;->getPackageInfo(Ljava/lang/String;I)Landroid/content/pm/PackageInfo;
/* .line 787 */
/* .local v12, "packageInfo":Landroid/content/pm/PackageInfo; */
int v15 = 4; // const/4 v15, 0x4
/* new-array v10, v15, [Ljava/lang/String; */
int v15 = 0; // const/4 v15, 0x0
final String v16 = "com.openfeint.api.ui.Dashboard"; // const-string v16, "com.openfeint.api.ui.Dashboard"
/* aput-object v16, v10, v15 */
int v15 = 1; // const/4 v15, 0x1
final String v16 = "com.openfeint.internal.ui.IntroFlow"; // const-string v16, "com.openfeint.internal.ui.IntroFlow"
/* aput-object v16, v10, v15 */
int v15 = 2; // const/4 v15, 0x2
final String v16 = "com.openfeint.internal.ui.Settings"; // const-string v16, "com.openfeint.internal.ui.Settings"
/* aput-object v16, v10, v15 */
int v15 = 3; // const/4 v15, 0x3
final String v16 = "com.openfeint.internal.ui.NativeBrowser"; // const-string v16, "com.openfeint.internal.ui.NativeBrowser"
/* aput-object v16, v10, v15 */
/* .line 794 */
/* .local v10, "neededActivityInfo":[Ljava/lang/String; */
/* move-object v2, v10 */
/* .local v2, "arr$":[Ljava/lang/String; */
/* array-length v7, v2 */
/* .local v7, "len$":I */
int v5 = 0; // const/4 v5, 0x0
/* .local v5, "i$":I */
/* move v6, v5 */
} // .end local v2 # "arr$":[Ljava/lang/String;
} // .end local v5 # "i$":I
} // .end local v7 # "len$":I
/* .local v6, "i$":I */
} // :goto_0
/* if-ge v6, v7, :cond_4 */
/* aget-object v9, v2, v6 */
/* .line 795 */
/* .local v9, "n":Ljava/lang/String; */
int v14 = 0; // const/4 v14, 0x0
/* .line 796 */
/* .local v14, "victory":Z */
v3 = this.activities;
/* .local v3, "arr$":[Landroid/content/pm/ActivityInfo; */
/* array-length v8, v3 */
/* .local v8, "len$":I */
int v5 = 0; // const/4 v5, 0x0
} // .end local v6 # "i$":I
/* .restart local v5 # "i$":I */
} // :goto_1
/* if-ge v5, v8, :cond_1 */
/* aget-object v1, v3, v5 */
/* .line 797 */
/* .local v1, "ai":Landroid/content/pm/ActivityInfo; */
v15 = this.name;
v15 = (( java.lang.String ) v15 ).equals ( v9 ); // invoke-virtual {v15, v9}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
if ( v15 != null) { // if-eqz v15, :cond_2
/* .line 798 */
/* iget v15, v1, Landroid/content/pm/ActivityInfo;->configChanges:I */
/* and-int/lit16 v15, v15, 0x80 */
/* if-nez v15, :cond_0 */
/* .line 800 */
final String v15 = "OpenFeint"; // const-string v15, "OpenFeint"
final String v16 = "ActivityInfo for %s has the wrong configChanges.\nPlease consult README.txt for the correct configuration."; // const-string v16, "ActivityInfo for %s has the wrong configChanges.\nPlease consult README.txt for the correct configuration."
/* const/16 v17, 0x1 */
/* move/from16 v0, v17 */
/* new-array v0, v0, [Ljava/lang/Object; */
/* move-object/from16 v17, v0 */
/* const/16 v18, 0x0 */
/* aput-object v9, v17, v18 */
/* invoke-static/range {v16 ..v17}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String; */
/* invoke-static/range {v15 ..v16}, Landroid/util/Log;->v(Ljava/lang/String;Ljava/lang/String;)I */
/* .line 801 */
int v15 = 0; // const/4 v15, 0x0
/* .line 832 */
} // .end local v1 # "ai":Landroid/content/pm/ActivityInfo;
} // .end local v3 # "arr$":[Landroid/content/pm/ActivityInfo;
} // .end local v5 # "i$":I
} // .end local v8 # "len$":I
} // .end local v9 # "n":Ljava/lang/String;
} // .end local v10 # "neededActivityInfo":[Ljava/lang/String;
} // .end local v12 # "packageInfo":Landroid/content/pm/PackageInfo;
} // .end local v14 # "victory":Z
} // :goto_2
/* .line 804 */
/* .restart local v1 # "ai":Landroid/content/pm/ActivityInfo; */
/* .restart local v3 # "arr$":[Landroid/content/pm/ActivityInfo; */
/* .restart local v5 # "i$":I */
/* .restart local v8 # "len$":I */
/* .restart local v9 # "n":Ljava/lang/String; */
/* .restart local v10 # "neededActivityInfo":[Ljava/lang/String; */
/* .restart local v12 # "packageInfo":Landroid/content/pm/PackageInfo; */
/* .restart local v14 # "victory":Z */
} // :cond_0
int v14 = 1; // const/4 v14, 0x1
/* .line 808 */
} // .end local v1 # "ai":Landroid/content/pm/ActivityInfo;
} // :cond_1
/* if-nez v14, :cond_3 */
/* .line 809 */
final String v15 = "OpenFeint"; // const-string v15, "OpenFeint"
final String v16 = "Couldn\'t find ActivityInfo for %s.\nPlease consult README.txt for the correct configuration."; // const-string v16, "Couldn\'t find ActivityInfo for %s.\nPlease consult README.txt for the correct configuration."
/* const/16 v17, 0x1 */
/* move/from16 v0, v17 */
/* new-array v0, v0, [Ljava/lang/Object; */
/* move-object/from16 v17, v0 */
/* const/16 v18, 0x0 */
/* aput-object v9, v17, v18 */
/* invoke-static/range {v16 ..v17}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String; */
/* invoke-static/range {v15 ..v16}, Landroid/util/Log;->v(Ljava/lang/String;Ljava/lang/String;)I */
/* .line 810 */
int v15 = 0; // const/4 v15, 0x0
/* .line 796 */
/* .restart local v1 # "ai":Landroid/content/pm/ActivityInfo; */
} // :cond_2
/* add-int/lit8 v5, v5, 0x1 */
/* .line 794 */
} // .end local v1 # "ai":Landroid/content/pm/ActivityInfo;
} // :cond_3
/* add-int/lit8 v5, v6, 0x1 */
/* move v6, v5 */
} // .end local v5 # "i$":I
/* .restart local v6 # "i$":I */
/* .line 815 */
} // .end local v3 # "arr$":[Landroid/content/pm/ActivityInfo;
} // .end local v8 # "len$":I
} // .end local v9 # "n":Ljava/lang/String;
} // .end local v14 # "victory":Z
} // :cond_4
int v15 = 1; // const/4 v15, 0x1
/* new-array v11, v15, [Ljava/lang/String; */
int v15 = 0; // const/4 v15, 0x0
final String v16 = "android.permission.INTERNET"; // const-string v16, "android.permission.INTERNET"
/* aput-object v16, v11, v15 */
/* .line 819 */
/* .local v11, "neededPermissionInfo":[Ljava/lang/String; */
/* move-object v2, v11 */
/* .restart local v2 # "arr$":[Ljava/lang/String; */
/* array-length v7, v2 */
/* .restart local v7 # "len$":I */
int v5 = 0; // const/4 v5, 0x0
} // .end local v6 # "i$":I
/* .restart local v5 # "i$":I */
} // :goto_3
/* if-ge v5, v7, :cond_6 */
/* aget-object v9, v2, v5 */
/* .line 820 */
/* .restart local v9 # "n":Ljava/lang/String; */
/* move-object/from16 v0, p0 */
com.openfeint.internal.Util .noPermission ( v9,v0 );
/* :try_end_0 */
v15 = /* .catch Landroid/content/pm/PackageManager$NameNotFoundException; {:try_start_0 ..:try_end_0} :catch_0 */
if ( v15 != null) { // if-eqz v15, :cond_5
/* .line 823 */
int v15 = 0; // const/4 v15, 0x0
/* .line 819 */
} // :cond_5
/* add-int/lit8 v5, v5, 0x1 */
/* .line 827 */
} // .end local v2 # "arr$":[Ljava/lang/String;
} // .end local v5 # "i$":I
} // .end local v7 # "len$":I
} // .end local v9 # "n":Ljava/lang/String;
} // .end local v10 # "neededActivityInfo":[Ljava/lang/String;
} // .end local v11 # "neededPermissionInfo":[Ljava/lang/String;
} // .end local v12 # "packageInfo":Landroid/content/pm/PackageInfo;
/* :catch_0 */
/* move-exception v4 */
/* .line 828 */
/* .local v4, "e":Landroid/content/pm/PackageManager$NameNotFoundException; */
final String v15 = "OpenFeint"; // const-string v15, "OpenFeint"
final String v16 = "Couldn\'t find PackageInfo for %s.\nPlease initialize OF with an Activity that lives in your root package."; // const-string v16, "Couldn\'t find PackageInfo for %s.\nPlease initialize OF with an Activity that lives in your root package."
/* const/16 v17, 0x1 */
/* move/from16 v0, v17 */
/* new-array v0, v0, [Ljava/lang/Object; */
/* move-object/from16 v17, v0 */
/* const/16 v18, 0x0 */
/* invoke-virtual/range {p0 ..p0}, Landroid/content/Context;->getPackageName()Ljava/lang/String; */
/* aput-object v19, v17, v18 */
/* invoke-static/range {v16 ..v17}, Ljava/lang/String;->format(Ljava/lang/String;[Ljava/lang/Object;)Ljava/lang/String; */
/* invoke-static/range {v15 ..v16}, Landroid/util/Log;->v(Ljava/lang/String;Ljava/lang/String;)I */
/* .line 829 */
int v15 = 0; // const/4 v15, 0x0
/* .line 832 */
} // .end local v4 # "e":Landroid/content/pm/PackageManager$NameNotFoundException;
/* .restart local v2 # "arr$":[Ljava/lang/String; */
/* .restart local v5 # "i$":I */
/* .restart local v7 # "len$":I */
/* .restart local v10 # "neededActivityInfo":[Ljava/lang/String; */
/* .restart local v11 # "neededPermissionInfo":[Ljava/lang/String; */
/* .restart local v12 # "packageInfo":Landroid/content/pm/PackageInfo; */
} // :cond_6
int v15 = 1; // const/4 v15, 0x1
} // .end method
/* # virtual methods */
public void createDeviceSession ( ) {
/* .locals 5 */
/* .prologue */
/* .line 346 */
/* iget-boolean v3, p0, Lcom/openfeint/internal/OpenFeintInternal;->mCreatingDeviceSession:Z */
/* if-nez v3, :cond_0 */
/* iget-boolean v3, p0, Lcom/openfeint/internal/OpenFeintInternal;->mDeviceSessionCreated:Z */
if ( v3 != null) { // if-eqz v3, :cond_1
/* .line 391 */
} // :cond_0
} // :goto_0
return;
/* .line 348 */
} // :cond_1
/* new-instance v0, Ljava/util/HashMap; */
/* invoke-direct {v0}, Ljava/util/HashMap;-><init>()V */
/* .line 349 */
/* .local v0, "argMap":Ljava/util/HashMap;, "Ljava/util/HashMap<Ljava/lang/String;Ljava/lang/Object;>;" */
final String v3 = "platform"; // const-string v3, "platform"
final String v4 = "android"; // const-string v4, "android"
(( java.util.HashMap ) v0 ).put ( v3, v4 ); // invoke-virtual {v0, v3, v4}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
/* .line 350 */
final String v3 = "device"; // const-string v3, "device"
(( com.openfeint.internal.OpenFeintInternal ) p0 ).getDeviceParams ( ); // invoke-virtual {p0}, Lcom/openfeint/internal/OpenFeintInternal;->getDeviceParams()Ljava/util/Map;
(( java.util.HashMap ) v0 ).put ( v3, v4 ); // invoke-virtual {v0, v3, v4}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
/* .line 351 */
final String v3 = "of-version"; // const-string v3, "of-version"
(( com.openfeint.internal.OpenFeintInternal ) p0 ).getOFVersion ( ); // invoke-virtual {p0}, Lcom/openfeint/internal/OpenFeintInternal;->getOFVersion()Ljava/lang/String;
(( java.util.HashMap ) v0 ).put ( v3, v4 ); // invoke-virtual {v0, v3, v4}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
/* .line 352 */
final String v3 = "game_version"; // const-string v3, "game_version"
v4 = (( com.openfeint.internal.OpenFeintInternal ) p0 ).getAppVersion ( ); // invoke-virtual {p0}, Lcom/openfeint/internal/OpenFeintInternal;->getAppVersion()I
java.lang.Integer .toString ( v4 );
(( java.util.HashMap ) v0 ).put ( v3, v4 ); // invoke-virtual {v0, v3, v4}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
/* .line 353 */
final String v3 = "protocol_version"; // const-string v3, "protocol_version"
final String v4 = "1.0"; // const-string v4, "1.0"
(( java.util.HashMap ) v0 ).put ( v3, v4 ); // invoke-virtual {v0, v3, v4}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
/* .line 355 */
/* new-instance v1, Lcom/openfeint/internal/request/OrderedArgList; */
/* invoke-direct {v1, v0}, Lcom/openfeint/internal/request/OrderedArgList;-><init>(Ljava/util/Map;)V */
/* .line 357 */
/* .local v1, "args":Lcom/openfeint/internal/request/OrderedArgList; */
int v3 = 1; // const/4 v3, 0x1
/* iput-boolean v3, p0, Lcom/openfeint/internal/OpenFeintInternal;->mCreatingDeviceSession:Z */
/* .line 361 */
/* new-instance v2, Lcom/openfeint/internal/OpenFeintInternal$2; */
/* invoke-direct {v2, p0, v1}, Lcom/openfeint/internal/OpenFeintInternal$2;-><init>(Lcom/openfeint/internal/OpenFeintInternal;Lcom/openfeint/internal/request/OrderedArgList;)V */
/* .line 390 */
/* .local v2, "deviceSession":Lcom/openfeint/internal/request/RawRequest; */
/* invoke-direct {p0, v2}, Lcom/openfeint/internal/OpenFeintInternal;->_makeRequest(Lcom/openfeint/internal/request/BaseRequest;)V */
} // .end method
public void createUser ( java.lang.String p0, java.lang.String p1, java.lang.String p2, java.lang.String p3, com.openfeint.internal.request.IRawRequestDelegate p4 ) {
/* .locals 3 */
/* .param p1, "userName" # Ljava/lang/String; */
/* .param p2, "email" # Ljava/lang/String; */
/* .param p3, "password" # Ljava/lang/String; */
/* .param p4, "passwordConfirmation" # Ljava/lang/String; */
/* .param p5, "delegate" # Lcom/openfeint/internal/request/IRawRequestDelegate; */
/* .prologue */
/* .line 264 */
/* new-instance v0, Lcom/openfeint/internal/request/OrderedArgList; */
/* invoke-direct {v0}, Lcom/openfeint/internal/request/OrderedArgList;-><init>()V */
/* .line 265 */
/* .local v0, "bootstrapArgs":Lcom/openfeint/internal/request/OrderedArgList; */
final String v2 = "user[name]"; // const-string v2, "user[name]"
(( com.openfeint.internal.request.OrderedArgList ) v0 ).put ( v2, p1 ); // invoke-virtual {v0, v2, p1}, Lcom/openfeint/internal/request/OrderedArgList;->put(Ljava/lang/String;Ljava/lang/String;)V
/* .line 266 */
final String v2 = "user[http_basic_credential_attributes][email]"; // const-string v2, "user[http_basic_credential_attributes][email]"
(( com.openfeint.internal.request.OrderedArgList ) v0 ).put ( v2, p2 ); // invoke-virtual {v0, v2, p2}, Lcom/openfeint/internal/request/OrderedArgList;->put(Ljava/lang/String;Ljava/lang/String;)V
/* .line 267 */
final String v2 = "user[http_basic_credential_attributes][password]"; // const-string v2, "user[http_basic_credential_attributes][password]"
(( com.openfeint.internal.request.OrderedArgList ) v0 ).put ( v2, p3 ); // invoke-virtual {v0, v2, p3}, Lcom/openfeint/internal/request/OrderedArgList;->put(Ljava/lang/String;Ljava/lang/String;)V
/* .line 268 */
final String v2 = "user[http_basic_credential_attributes][password_confirmation]"; // const-string v2, "user[http_basic_credential_attributes][password_confirmation]"
(( com.openfeint.internal.request.OrderedArgList ) v0 ).put ( v2, p4 ); // invoke-virtual {v0, v2, p4}, Lcom/openfeint/internal/request/OrderedArgList;->put(Ljava/lang/String;Ljava/lang/String;)V
/* .line 270 */
/* new-instance v1, Lcom/openfeint/internal/OpenFeintInternal$1; */
/* invoke-direct {v1, p0, v0}, Lcom/openfeint/internal/OpenFeintInternal$1;-><init>(Lcom/openfeint/internal/OpenFeintInternal;Lcom/openfeint/internal/request/OrderedArgList;)V */
/* .line 278 */
/* .local v1, "userCreate":Lcom/openfeint/internal/request/RawRequest; */
(( com.openfeint.internal.request.RawRequest ) v1 ).setDelegate ( p5 ); // invoke-virtual {v1, p5}, Lcom/openfeint/internal/request/RawRequest;->setDelegate(Lcom/openfeint/internal/request/IRawRequestDelegate;)V
/* .line 279 */
/* invoke-direct {p0, v1}, Lcom/openfeint/internal/OpenFeintInternal;->_makeRequest(Lcom/openfeint/internal/request/BaseRequest;)V */
/* .line 280 */
return;
} // .end method
public Boolean currentlyLoggingIn ( ) {
/* .locals 1 */
/* .prologue */
/* .line 550 */
/* iget-boolean v0, p0, Lcom/openfeint/internal/OpenFeintInternal;->mCurrentlyLoggingIn:Z */
/* if-nez v0, :cond_0 */
/* iget-boolean v0, p0, Lcom/openfeint/internal/OpenFeintInternal;->mCreatingDeviceSession:Z */
if ( v0 != null) { // if-eqz v0, :cond_1
} // :cond_0
int v0 = 1; // const/4 v0, 0x1
} // :goto_0
} // :cond_1
int v0 = 0; // const/4 v0, 0x0
} // .end method
public void displayErrorDialog ( java.lang.CharSequence p0 ) {
/* .locals 3 */
/* .param p1, "errorMessage" # Ljava/lang/CharSequence; */
/* .prologue */
/* .line 601 */
(( java.lang.Object ) p1 ).toString ( ); // invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;
v1 = com.openfeint.api.Notification$Category.Foreground;
v2 = com.openfeint.api.Notification$Type.Error;
com.openfeint.internal.notifications.SimpleNotification .show ( v0,v1,v2 );
/* .line 612 */
return;
} // .end method
public com.openfeint.internal.Analytics getAnalytics ( ) {
/* .locals 1 */
/* .prologue */
/* .line 880 */
v0 = this.analytics;
} // .end method
public java.lang.String getAppID ( ) {
/* .locals 1 */
/* .prologue */
/* .line 583 */
v0 = this.mSettings;
v0 = this.id;
} // .end method
public java.lang.String getAppName ( ) {
/* .locals 1 */
/* .prologue */
/* .line 582 */
v0 = this.mSettings;
v0 = this.name;
} // .end method
public Integer getAppVersion ( ) {
/* .locals 7 */
/* .prologue */
int v6 = 0; // const/4 v6, 0x0
/* .line 586 */
/* iget v3, p0, Lcom/openfeint/internal/OpenFeintInternal;->mAppVersion:I */
int v4 = -1; // const/4 v4, -0x1
/* if-ne v3, v4, :cond_0 */
/* .line 587 */
(( com.openfeint.internal.OpenFeintInternal ) p0 ).getContext ( ); // invoke-virtual {p0}, Lcom/openfeint/internal/OpenFeintInternal;->getContext()Landroid/content/Context;
/* .line 589 */
/* .local v0, "c":Landroid/content/Context; */
try { // :try_start_0
(( android.content.Context ) v0 ).getPackageManager ( ); // invoke-virtual {v0}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;
(( android.content.Context ) v0 ).getPackageName ( ); // invoke-virtual {v0}, Landroid/content/Context;->getPackageName()Ljava/lang/String;
int v5 = 0; // const/4 v5, 0x0
(( android.content.pm.PackageManager ) v3 ).getPackageInfo ( v4, v5 ); // invoke-virtual {v3, v4, v5}, Landroid/content/pm/PackageManager;->getPackageInfo(Ljava/lang/String;I)Landroid/content/pm/PackageInfo;
/* .line 590 */
/* .local v2, "p":Landroid/content/pm/PackageInfo; */
/* iget v3, v2, Landroid/content/pm/PackageInfo;->versionCode:I */
/* iput v3, p0, Lcom/openfeint/internal/OpenFeintInternal;->mAppVersion:I */
/* :try_end_0 */
/* .catch Ljava/lang/Exception; {:try_start_0 ..:try_end_0} :catch_0 */
/* .line 595 */
} // .end local v0 # "c":Landroid/content/Context;
} // .end local v2 # "p":Landroid/content/pm/PackageInfo;
} // :cond_0
} // :goto_0
/* iget v3, p0, Lcom/openfeint/internal/OpenFeintInternal;->mAppVersion:I */
/* .line 591 */
/* .restart local v0 # "c":Landroid/content/Context; */
/* :catch_0 */
/* move-exception v1 */
/* .line 592 */
/* .local v1, "e":Ljava/lang/Exception; */
/* iput v6, p0, Lcom/openfeint/internal/OpenFeintInternal;->mAppVersion:I */
} // .end method
public org.apache.http.impl.client.AbstractHttpClient getClient ( ) {
/* .locals 1 */
/* .prologue */
/* .line 155 */
v0 = this.mClient;
} // .end method
public android.content.Context getContext ( ) {
/* .locals 1 */
/* .prologue */
/* .line 598 */
v0 = this.mContext;
} // .end method
public com.openfeint.api.resource.CurrentUser getCurrentUser ( ) {
/* .locals 1 */
/* .prologue */
/* .line 553 */
v0 = this.mCurrentUser;
} // .end method
public com.openfeint.api.OpenFeintDelegate getDelegate ( ) {
/* .locals 1 */
/* .prologue */
/* .line 154 */
v0 = this.mDelegate;
} // .end method
public java.util.Map getDeviceParams ( ) {
/* .locals 3 */
/* .annotation system Ldalvik/annotation/Signature; */
/* value = { */
/* "()", */
/* "Ljava/util/Map", */
/* "<", */
/* "Ljava/lang/String;", */
/* "Ljava/lang/Object;", */
/* ">;" */
/* } */
} // .end annotation
/* .prologue */
/* .line 336 */
/* new-instance v0, Ljava/util/HashMap; */
/* invoke-direct {v0}, Ljava/util/HashMap;-><init>()V */
/* .line 337 */
/* .local v0, "device":Ljava/util/HashMap;, "Ljava/util/HashMap<Ljava/lang/String;Ljava/lang/Object;>;" */
final String v1 = "identifier"; // const-string v1, "identifier"
(( com.openfeint.internal.OpenFeintInternal ) p0 ).getUDID ( ); // invoke-virtual {p0}, Lcom/openfeint/internal/OpenFeintInternal;->getUDID()Ljava/lang/String;
(( java.util.HashMap ) v0 ).put ( v1, v2 ); // invoke-virtual {v0, v1, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
/* .line 338 */
final String v1 = "hardware"; // const-string v1, "hardware"
com.openfeint.internal.OpenFeintInternal .getModelString ( );
(( java.util.HashMap ) v0 ).put ( v1, v2 ); // invoke-virtual {v0, v1, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
/* .line 339 */
final String v1 = "os"; // const-string v1, "os"
com.openfeint.internal.OpenFeintInternal .getOSVersionString ( );
(( java.util.HashMap ) v0 ).put ( v1, v2 ); // invoke-virtual {v0, v1, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
/* .line 340 */
final String v1 = "screen_resolution"; // const-string v1, "screen_resolution"
com.openfeint.internal.OpenFeintInternal .getScreenInfo ( );
(( java.util.HashMap ) v0 ).put ( v1, v2 ); // invoke-virtual {v0, v1, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
/* .line 341 */
final String v1 = "processor"; // const-string v1, "processor"
com.openfeint.internal.OpenFeintInternal .getProcessorInfo ( );
(( java.util.HashMap ) v0 ).put ( v1, v2 ); // invoke-virtual {v0, v1, v2}, Ljava/util/HashMap;->put(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;
/* .line 342 */
} // .end method
public java.util.Properties getInternalProperties ( ) {
/* .locals 1 */
/* .prologue */
/* .line 564 */
v0 = this.mInternalProperties;
} // .end method
public java.lang.String getOFVersion ( ) {
/* .locals 2 */
/* .prologue */
/* .line 580 */
(( com.openfeint.internal.OpenFeintInternal ) p0 ).getInternalProperties ( ); // invoke-virtual {p0}, Lcom/openfeint/internal/OpenFeintInternal;->getInternalProperties()Ljava/util/Properties;
final String v1 = "of-version"; // const-string v1, "of-version"
(( java.util.Properties ) v0 ).getProperty ( v1 ); // invoke-virtual {v0, v1}, Ljava/util/Properties;->getProperty(Ljava/lang/String;)Ljava/lang/String;
} // .end method
public com.openfeint.internal.SyncedStore getPrefs ( ) {
/* .locals 2 */
/* .prologue */
/* .line 157 */
v0 = this.mPrefs;
/* if-nez v0, :cond_0 */
/* .line 158 */
/* new-instance v0, Lcom/openfeint/internal/SyncedStore; */
(( com.openfeint.internal.OpenFeintInternal ) p0 ).getContext ( ); // invoke-virtual {p0}, Lcom/openfeint/internal/OpenFeintInternal;->getContext()Landroid/content/Context;
/* invoke-direct {v0, v1}, Lcom/openfeint/internal/SyncedStore;-><init>(Landroid/content/Context;)V */
this.mPrefs = v0;
/* .line 160 */
} // :cond_0
v0 = this.mPrefs;
} // .end method
public Integer getResource ( java.lang.String p0 ) {
/* .locals 3 */
/* .param p1, "resourceName" # Ljava/lang/String; */
/* .prologue */
/* .line 735 */
(( com.openfeint.internal.OpenFeintInternal ) p0 ).getContext ( ); // invoke-virtual {p0}, Lcom/openfeint/internal/OpenFeintInternal;->getContext()Landroid/content/Context;
(( android.content.Context ) v1 ).getPackageName ( ); // invoke-virtual {v1}, Landroid/content/Context;->getPackageName()Ljava/lang/String;
/* .line 736 */
/* .local v0, "packageName":Ljava/lang/String; */
(( com.openfeint.internal.OpenFeintInternal ) p0 ).getContext ( ); // invoke-virtual {p0}, Lcom/openfeint/internal/OpenFeintInternal;->getContext()Landroid/content/Context;
(( android.content.Context ) v1 ).getResources ( ); // invoke-virtual {v1}, Landroid/content/Context;->getResources()Landroid/content/res/Resources;
int v2 = 0; // const/4 v2, 0x0
v1 = (( android.content.res.Resources ) v1 ).getIdentifier ( p1, v2, v0 ); // invoke-virtual {v1, p1, v2, v0}, Landroid/content/res/Resources;->getIdentifier(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)I
} // .end method
public java.lang.String getServerUrl ( ) {
/* .locals 3 */
/* .prologue */
/* .line 567 */
v1 = this.mServerUrl;
/* if-nez v1, :cond_0 */
/* .line 569 */
(( com.openfeint.internal.OpenFeintInternal ) p0 ).getInternalProperties ( ); // invoke-virtual {p0}, Lcom/openfeint/internal/OpenFeintInternal;->getInternalProperties()Ljava/util/Properties;
final String v2 = "server-url"; // const-string v2, "server-url"
(( java.util.Properties ) v1 ).getProperty ( v2 ); // invoke-virtual {v1, v2}, Ljava/util/Properties;->getProperty(Ljava/lang/String;)Ljava/lang/String;
(( java.lang.String ) v1 ).toLowerCase ( ); // invoke-virtual {v1}, Ljava/lang/String;->toLowerCase()Ljava/lang/String;
(( java.lang.String ) v1 ).trim ( ); // invoke-virtual {v1}, Ljava/lang/String;->trim()Ljava/lang/String;
/* .line 570 */
/* .local v0, "raw":Ljava/lang/String; */
final String v1 = "/"; // const-string v1, "/"
v1 = (( java.lang.String ) v0 ).endsWith ( v1 ); // invoke-virtual {v0, v1}, Ljava/lang/String;->endsWith(Ljava/lang/String;)Z
if ( v1 != null) { // if-eqz v1, :cond_1
/* .line 571 */
int v1 = 0; // const/4 v1, 0x0
v2 = (( java.lang.String ) v0 ).length ( ); // invoke-virtual {v0}, Ljava/lang/String;->length()I
/* add-int/lit8 v2, v2, -0x1 */
(( java.lang.String ) v0 ).substring ( v1, v2 ); // invoke-virtual {v0, v1, v2}, Ljava/lang/String;->substring(II)Ljava/lang/String;
this.mServerUrl = v1;
/* .line 577 */
} // .end local v0 # "raw":Ljava/lang/String;
} // :cond_0
} // :goto_0
v1 = this.mServerUrl;
/* .line 573 */
/* .restart local v0 # "raw":Ljava/lang/String; */
} // :cond_1
this.mServerUrl = v0;
} // .end method
public java.util.Map getSettings ( ) {
/* .locals 1 */
/* .annotation system Ldalvik/annotation/Signature; */
/* value = { */
/* "()", */
/* "Ljava/util/Map", */
/* "<", */
/* "Ljava/lang/String;", */
/* "Ljava/lang/Object;", */
/* ">;" */
/* } */
} // .end annotation
/* .prologue */
/* .line 584 */
v0 = this.mSettings;
v0 = this.settings;
} // .end method
public java.lang.String getUDID ( ) {
/* .locals 1 */
/* .prologue */
/* .line 558 */
v0 = this.mUDID;
/* if-nez v0, :cond_0 */
/* .line 559 */
/* invoke-direct {p0}, Lcom/openfeint/internal/OpenFeintInternal;->findUDID()Ljava/lang/String; */
this.mUDID = v0;
/* .line 561 */
} // :cond_0
v0 = this.mUDID;
} // .end method
public java.lang.String getUserID ( ) {
/* .locals 2 */
/* .prologue */
/* .line 883 */
(( com.openfeint.internal.OpenFeintInternal ) p0 ).getCurrentUser ( ); // invoke-virtual {p0}, Lcom/openfeint/internal/OpenFeintInternal;->getCurrentUser()Lcom/openfeint/api/resource/CurrentUser;
/* .line 884 */
/* .local v0, "user":Lcom/openfeint/api/resource/User; */
if ( v0 != null) { // if-eqz v0, :cond_0
(( com.openfeint.api.resource.User ) v0 ).userID ( ); // invoke-virtual {v0}, Lcom/openfeint/api/resource/User;->userID()Ljava/lang/String;
/* .line 887 */
} // :goto_0
/* .line 885 */
} // :cond_0
/* invoke-direct {p0}, Lcom/openfeint/internal/OpenFeintInternal;->lastLoggedInUser()Lcom/openfeint/api/resource/User; */
/* .line 886 */
if ( v0 != null) { // if-eqz v0, :cond_1
(( com.openfeint.api.resource.User ) v0 ).userID ( ); // invoke-virtual {v0}, Lcom/openfeint/api/resource/User;->userID()Ljava/lang/String;
/* .line 887 */
} // :cond_1
int v1 = 0; // const/4 v1, 0x0
} // .end method
public Boolean isFeintServerReachable ( ) {
/* .locals 5 */
/* .prologue */
int v2 = 1; // const/4 v2, 0x1
/* .line 1051 */
final String v3 = "android.permission.ACCESS_NETWORK_STATE"; // const-string v3, "android.permission.ACCESS_NETWORK_STATE"
(( com.openfeint.internal.OpenFeintInternal ) p0 ).getContext ( ); // invoke-virtual {p0}, Lcom/openfeint/internal/OpenFeintInternal;->getContext()Landroid/content/Context;
v3 = com.openfeint.internal.Util .noPermission ( v3,v4 );
if ( v3 != null) { // if-eqz v3, :cond_1
/* .line 1056 */
} // :cond_0
} // :goto_0
/* .line 1054 */
} // :cond_1
(( com.openfeint.internal.OpenFeintInternal ) p0 ).getContext ( ); // invoke-virtual {p0}, Lcom/openfeint/internal/OpenFeintInternal;->getContext()Landroid/content/Context;
final String v4 = "connectivity"; // const-string v4, "connectivity"
(( android.content.Context ) v3 ).getSystemService ( v4 ); // invoke-virtual {v3, v4}, Landroid/content/Context;->getSystemService(Ljava/lang/String;)Ljava/lang/Object;
/* check-cast v1, Landroid/net/ConnectivityManager; */
/* .line 1055 */
/* .local v1, "conMan":Landroid/net/ConnectivityManager; */
(( android.net.ConnectivityManager ) v1 ).getActiveNetworkInfo ( ); // invoke-virtual {v1}, Landroid/net/ConnectivityManager;->getActiveNetworkInfo()Landroid/net/NetworkInfo;
/* .line 1056 */
/* .local v0, "activeNetwork":Landroid/net/NetworkInfo; */
if ( v0 != null) { // if-eqz v0, :cond_2
v3 = (( android.net.NetworkInfo ) v0 ).isConnected ( ); // invoke-virtual {v0}, Landroid/net/NetworkInfo;->isConnected()Z
/* if-nez v3, :cond_0 */
} // :cond_2
int v2 = 0; // const/4 v2, 0x0
} // .end method
public Boolean isUserLoggedIn ( ) {
/* .locals 1 */
/* .prologue */
/* .line 555 */
(( com.openfeint.internal.OpenFeintInternal ) p0 ).getCurrentUser ( ); // invoke-virtual {p0}, Lcom/openfeint/internal/OpenFeintInternal;->getCurrentUser()Lcom/openfeint/api/resource/CurrentUser;
if ( v0 != null) { // if-eqz v0, :cond_0
int v0 = 1; // const/4 v0, 0x1
} // :goto_0
} // :cond_0
int v0 = 0; // const/4 v0, 0x0
} // .end method
public void launchIntroFlow ( Boolean p0 ) {
/* .locals 4 */
/* .param p1, "spotlight" # Z */
/* .prologue */
/* .line 962 */
v2 = /* invoke-direct {p0}, Lcom/openfeint/internal/OpenFeintInternal;->checkBan()Z */
if ( v2 != null) { // if-eqz v2, :cond_1
/* .line 1001 */
} // :cond_0
} // :goto_0
return;
/* .line 964 */
} // :cond_1
v2 = (( com.openfeint.internal.OpenFeintInternal ) p0 ).isFeintServerReachable ( ); // invoke-virtual {p0}, Lcom/openfeint/internal/OpenFeintInternal;->isFeintServerReachable()Z
if ( v2 != null) { // if-eqz v2, :cond_6
/* .line 965 */
(( com.openfeint.internal.OpenFeintInternal ) p0 ).getDelegate ( ); // invoke-virtual {p0}, Lcom/openfeint/internal/OpenFeintInternal;->getDelegate()Lcom/openfeint/api/OpenFeintDelegate;
/* .line 966 */
/* .local v0, "d":Lcom/openfeint/api/OpenFeintDelegate; */
/* iget-boolean v2, p0, Lcom/openfeint/internal/OpenFeintInternal;->mApproved:Z */
/* if-nez v2, :cond_2 */
if ( v0 != null) { // if-eqz v0, :cond_2
(( com.openfeint.internal.OpenFeintInternal ) p0 ).getContext ( ); // invoke-virtual {p0}, Lcom/openfeint/internal/OpenFeintInternal;->getContext()Landroid/content/Context;
v2 = (( com.openfeint.api.OpenFeintDelegate ) v0 ).showCustomApprovalFlow ( v2 ); // invoke-virtual {v0, v2}, Lcom/openfeint/api/OpenFeintDelegate;->showCustomApprovalFlow(Landroid/content/Context;)Z
/* if-nez v2, :cond_0 */
/* .line 971 */
} // :cond_2
/* new-instance v1, Lcom/openfeint/internal/OpenFeintInternal$11; */
/* invoke-direct {v1, p0, p1}, Lcom/openfeint/internal/OpenFeintInternal$11;-><init>(Lcom/openfeint/internal/OpenFeintInternal;Z)V */
/* .line 986 */
/* .local v1, "r":Ljava/lang/Runnable; */
/* iget-boolean v2, p0, Lcom/openfeint/internal/OpenFeintInternal;->mCreatingDeviceSession:Z */
/* if-nez v2, :cond_3 */
/* iget-boolean v2, p0, Lcom/openfeint/internal/OpenFeintInternal;->mDeviceSessionCreated:Z */
/* if-nez v2, :cond_5 */
/* .line 987 */
} // :cond_3
/* iget-boolean v2, p0, Lcom/openfeint/internal/OpenFeintInternal;->mCreatingDeviceSession:Z */
/* if-nez v2, :cond_4 */
/* .line 988 */
(( com.openfeint.internal.OpenFeintInternal ) p0 ).createDeviceSession ( ); // invoke-virtual {p0}, Lcom/openfeint/internal/OpenFeintInternal;->createDeviceSession()V
/* .line 991 */
} // :cond_4
this.mPostDeviceSessionRunnable = v1;
/* .line 994 */
} // :cond_5
/* .line 999 */
} // .end local v0 # "d":Lcom/openfeint/api/OpenFeintDelegate;
} // .end local v1 # "r":Ljava/lang/Runnable;
} // :cond_6
int v2 = 0; // const/4 v2, 0x0
final String v3 = ""; // const-string v3, ""
/* invoke-direct {p0, v2, v3}, Lcom/openfeint/internal/OpenFeintInternal;->showOfflineNotification(ILjava/lang/Object;)V */
} // .end method
public void login ( Boolean p0 ) {
/* .locals 2 */
/* .param p1, "spotlight" # Z */
/* .prologue */
/* .line 912 */
/* new-instance v0, Lcom/openfeint/internal/OpenFeintInternal$10; */
/* invoke-direct {v0, p0, p1}, Lcom/openfeint/internal/OpenFeintInternal$10;-><init>(Lcom/openfeint/internal/OpenFeintInternal;Z)V */
/* .line 950 */
/* .local v0, "r":Ljava/lang/Runnable; */
v1 = this.mMainThreadHandler;
(( android.os.Handler ) v1 ).post ( v0 ); // invoke-virtual {v1, v0}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z
/* .line 951 */
return;
} // .end method
public void loginUser ( java.lang.String p0, java.lang.String p1, java.lang.String p2, com.openfeint.internal.request.IRawRequestDelegate p3 ) {
/* .locals 10 */
/* .param p1, "userName" # Ljava/lang/String; */
/* .param p2, "password" # Ljava/lang/String; */
/* .param p3, "userID" # Ljava/lang/String; */
/* .param p4, "delegate" # Lcom/openfeint/internal/request/IRawRequestDelegate; */
/* .prologue */
/* .line 398 */
v0 = /* invoke-direct {p0}, Lcom/openfeint/internal/OpenFeintInternal;->checkBan()Z */
if ( v0 != null) { // if-eqz v0, :cond_0
/* .line 468 */
} // :goto_0
return;
/* .line 400 */
} // :cond_0
/* iget-boolean v0, p0, Lcom/openfeint/internal/OpenFeintInternal;->mCreatingDeviceSession:Z */
/* if-nez v0, :cond_1 */
/* iget-boolean v0, p0, Lcom/openfeint/internal/OpenFeintInternal;->mDeviceSessionCreated:Z */
/* if-nez v0, :cond_3 */
/* .line 401 */
} // :cond_1
/* iget-boolean v0, p0, Lcom/openfeint/internal/OpenFeintInternal;->mCreatingDeviceSession:Z */
/* if-nez v0, :cond_2 */
/* .line 402 */
(( com.openfeint.internal.OpenFeintInternal ) p0 ).createDeviceSession ( ); // invoke-virtual {p0}, Lcom/openfeint/internal/OpenFeintInternal;->createDeviceSession()V
/* .line 406 */
} // :cond_2
final String v0 = "OpenFeint"; // const-string v0, "OpenFeint"
final String v1 = "No device session yet - queueing login."; // const-string v1, "No device session yet - queueing login."
com.openfeint.internal.OpenFeintInternal .log ( v0,v1 );
/* .line 408 */
/* new-instance v0, Lcom/openfeint/internal/OpenFeintInternal$3; */
/* move-object v1, p0 */
/* move-object v2, p1 */
/* move-object v3, p2 */
/* move-object v4, p3 */
/* move-object v5, p4 */
/* invoke-direct/range {v0 ..v5}, Lcom/openfeint/internal/OpenFeintInternal$3;-><init>(Lcom/openfeint/internal/OpenFeintInternal;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/openfeint/internal/request/IRawRequestDelegate;)V */
this.mPostDeviceSessionRunnable = v0;
/* .line 416 */
} // :cond_3
int v6 = 1; // const/4 v6, 0x1
/* .line 418 */
/* .local v6, "allowToast":Z */
/* new-instance v7, Lcom/openfeint/internal/request/OrderedArgList; */
/* invoke-direct {v7}, Lcom/openfeint/internal/request/OrderedArgList;-><init>()V */
/* .line 419 */
/* .local v7, "bootstrapArgs":Lcom/openfeint/internal/request/OrderedArgList; */
if ( p1 != null) { // if-eqz p1, :cond_4
if ( p2 != null) { // if-eqz p2, :cond_4
/* .line 420 */
final String v0 = "login"; // const-string v0, "login"
(( com.openfeint.internal.request.OrderedArgList ) v7 ).put ( v0, p1 ); // invoke-virtual {v7, v0, p1}, Lcom/openfeint/internal/request/OrderedArgList;->put(Ljava/lang/String;Ljava/lang/String;)V
/* .line 421 */
final String v0 = "password"; // const-string v0, "password"
(( com.openfeint.internal.request.OrderedArgList ) v7 ).put ( v0, p2 ); // invoke-virtual {v7, v0, p2}, Lcom/openfeint/internal/request/OrderedArgList;->put(Ljava/lang/String;Ljava/lang/String;)V
/* .line 422 */
int v6 = 0; // const/4 v6, 0x0
/* .line 427 */
} // :cond_4
if ( p3 != null) { // if-eqz p3, :cond_5
if ( p2 != null) { // if-eqz p2, :cond_5
/* .line 428 */
final String v0 = "user_id"; // const-string v0, "user_id"
(( com.openfeint.internal.request.OrderedArgList ) v7 ).put ( v0, p3 ); // invoke-virtual {v7, v0, p3}, Lcom/openfeint/internal/request/OrderedArgList;->put(Ljava/lang/String;Ljava/lang/String;)V
/* .line 429 */
final String v0 = "password"; // const-string v0, "password"
(( com.openfeint.internal.request.OrderedArgList ) v7 ).put ( v0, p2 ); // invoke-virtual {v7, v0, p2}, Lcom/openfeint/internal/request/OrderedArgList;->put(Ljava/lang/String;Ljava/lang/String;)V
/* .line 430 */
int v6 = 0; // const/4 v6, 0x0
/* .line 433 */
} // :cond_5
int v0 = 1; // const/4 v0, 0x1
/* iput-boolean v0, p0, Lcom/openfeint/internal/OpenFeintInternal;->mCurrentlyLoggingIn:Z */
/* .line 435 */
/* move v8, v6 */
/* .line 437 */
/* .local v8, "finalToast":Z */
/* new-instance v9, Lcom/openfeint/internal/OpenFeintInternal$4; */
/* invoke-direct {v9, p0, v7, v8}, Lcom/openfeint/internal/OpenFeintInternal$4;-><init>(Lcom/openfeint/internal/OpenFeintInternal;Lcom/openfeint/internal/request/OrderedArgList;Z)V */
/* .line 466 */
/* .local v9, "userLogin":Lcom/openfeint/internal/request/RawRequest; */
(( com.openfeint.internal.request.RawRequest ) v9 ).setDelegate ( p4 ); // invoke-virtual {v9, p4}, Lcom/openfeint/internal/request/RawRequest;->setDelegate(Lcom/openfeint/internal/request/IRawRequestDelegate;)V
/* .line 467 */
/* invoke-direct {p0, v9}, Lcom/openfeint/internal/OpenFeintInternal;->_makeRequest(Lcom/openfeint/internal/request/BaseRequest;)V */
} // .end method
public void logoutUser ( com.openfeint.internal.request.IRawRequestDelegate p0 ) {
/* .locals 4 */
/* .param p1, "delegate" # Lcom/openfeint/internal/request/IRawRequestDelegate; */
/* .prologue */
/* .line 497 */
/* new-instance v0, Lcom/openfeint/internal/request/OrderedArgList; */
/* invoke-direct {v0}, Lcom/openfeint/internal/request/OrderedArgList;-><init>()V */
/* .line 498 */
/* .local v0, "bootstrapArgs":Lcom/openfeint/internal/request/OrderedArgList; */
final String v2 = "platform"; // const-string v2, "platform"
final String v3 = "android"; // const-string v3, "android"
(( com.openfeint.internal.request.OrderedArgList ) v0 ).put ( v2, v3 ); // invoke-virtual {v0, v2, v3}, Lcom/openfeint/internal/request/OrderedArgList;->put(Ljava/lang/String;Ljava/lang/String;)V
/* .line 500 */
/* new-instance v1, Lcom/openfeint/internal/OpenFeintInternal$6; */
/* invoke-direct {v1, p0, v0}, Lcom/openfeint/internal/OpenFeintInternal$6;-><init>(Lcom/openfeint/internal/OpenFeintInternal;Lcom/openfeint/internal/request/OrderedArgList;)V */
/* .line 505 */
/* .local v1, "userLogout":Lcom/openfeint/internal/request/RawRequest; */
(( com.openfeint.internal.request.RawRequest ) v1 ).setDelegate ( p1 ); // invoke-virtual {v1, p1}, Lcom/openfeint/internal/request/RawRequest;->setDelegate(Lcom/openfeint/internal/request/IRawRequestDelegate;)V
/* .line 506 */
/* invoke-direct {p0, v1}, Lcom/openfeint/internal/OpenFeintInternal;->_makeRequest(Lcom/openfeint/internal/request/BaseRequest;)V */
/* .line 509 */
/* invoke-direct {p0}, Lcom/openfeint/internal/OpenFeintInternal;->userLoggedOut()V */
/* .line 510 */
return;
} // .end method
public final void runOnUiThread ( java.lang.Runnable p0 ) {
/* .locals 1 */
/* .param p1, "action" # Ljava/lang/Runnable; */
/* .prologue */
/* .line 394 */
v0 = this.mMainThreadHandler;
(( android.os.Handler ) v0 ).post ( p1 ); // invoke-virtual {v0, p1}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z
/* .line 395 */
return;
} // .end method
public void setDelegate ( com.openfeint.api.OpenFeintDelegate p0 ) {
/* .locals 0 */
/* .param p1, "delegate" # Lcom/openfeint/api/OpenFeintDelegate; */
/* .prologue */
/* .line 778 */
this.mDelegate = p1;
/* .line 779 */
return;
} // .end method
public void setLoginDelegate ( com.openfeint.internal.OpenFeintInternal$LoginDelegate p0 ) {
/* .locals 0 */
/* .param p1, "delegate" # Lcom/openfeint/internal/OpenFeintInternal$LoginDelegate; */
/* .prologue */
/* .line 112 */
this.mLoginDelegate = p1;
/* .line 113 */
return;
} // .end method
public void submitIntent ( android.content.Intent p0, Boolean p1 ) {
/* .locals 4 */
/* .param p1, "intent" # Landroid/content/Intent; */
/* .param p2, "spotlight" # Z */
/* .prologue */
/* .line 476 */
int v1 = 0; // const/4 v1, 0x0
/* iput-boolean v1, p0, Lcom/openfeint/internal/OpenFeintInternal;->mDeclined:Z */
/* .line 478 */
/* new-instance v0, Lcom/openfeint/internal/OpenFeintInternal$5; */
/* invoke-direct {v0, p0, p1}, Lcom/openfeint/internal/OpenFeintInternal$5;-><init>(Lcom/openfeint/internal/OpenFeintInternal;Landroid/content/Intent;)V */
/* .line 485 */
/* .local v0, "r":Ljava/lang/Runnable; */
v1 = (( com.openfeint.internal.OpenFeintInternal ) p0 ).isUserLoggedIn ( ); // invoke-virtual {p0}, Lcom/openfeint/internal/OpenFeintInternal;->isUserLoggedIn()Z
/* if-nez v1, :cond_1 */
/* .line 486 */
final String v1 = "OpenFeint"; // const-string v1, "OpenFeint"
/* new-instance v2, Ljava/lang/StringBuilder; */
/* invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V */
final String v3 = "Not logged in yet - queueing intent "; // const-string v3, "Not logged in yet - queueing intent "
(( java.lang.StringBuilder ) v2 ).append ( v3 ); // invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( android.content.Intent ) p1 ).toString ( ); // invoke-virtual {p1}, Landroid/content/Intent;->toString()Ljava/lang/String;
(( java.lang.StringBuilder ) v2 ).append ( v3 ); // invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
final String v3 = " for now."; // const-string v3, " for now."
(( java.lang.StringBuilder ) v2 ).append ( v3 ); // invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v2 ).toString ( ); // invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
com.openfeint.internal.OpenFeintInternal .log ( v1,v2 );
/* .line 487 */
this.mPostLoginRunnable = v0;
/* .line 488 */
v1 = (( com.openfeint.internal.OpenFeintInternal ) p0 ).currentlyLoggingIn ( ); // invoke-virtual {p0}, Lcom/openfeint/internal/OpenFeintInternal;->currentlyLoggingIn()Z
/* if-nez v1, :cond_0 */
/* .line 489 */
(( com.openfeint.internal.OpenFeintInternal ) p0 ).login ( p2 ); // invoke-virtual {p0, p2}, Lcom/openfeint/internal/OpenFeintInternal;->login(Z)V
/* .line 494 */
} // :cond_0
} // :goto_0
return;
/* .line 492 */
} // :cond_1
v1 = this.mMainThreadHandler;
(( android.os.Handler ) v1 ).post ( v0 ); // invoke-virtual {v1, v0}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z
} // .end method
public void uploadFile ( java.lang.String p0, com.openfeint.internal.request.multipart.PartSource p1, java.lang.String p2, com.openfeint.internal.OpenFeintInternal$IUploadDelegate p3 ) {
/* .locals 6 */
/* .param p1, "xpApiPath" # Ljava/lang/String; */
/* .param p2, "partSource" # Lcom/openfeint/internal/request/multipart/PartSource; */
/* .param p3, "contentType" # Ljava/lang/String; */
/* .param p4, "delegate" # Lcom/openfeint/internal/OpenFeintInternal$IUploadDelegate; */
/* .prologue */
/* .line 711 */
/* new-instance v0, Lcom/openfeint/internal/OpenFeintInternal$9; */
/* move-object v1, p0 */
/* move-object v2, p1 */
/* move-object v3, p2 */
/* move-object v4, p3 */
/* move-object v5, p4 */
/* invoke-direct/range {v0 ..v5}, Lcom/openfeint/internal/OpenFeintInternal$9;-><init>(Lcom/openfeint/internal/OpenFeintInternal;Ljava/lang/String;Lcom/openfeint/internal/request/multipart/PartSource;Ljava/lang/String;Lcom/openfeint/internal/OpenFeintInternal$IUploadDelegate;)V */
/* .line 731 */
/* .local v0, "xpRequest":Lcom/openfeint/internal/request/JSONRequest; */
/* invoke-direct {p0, v0}, Lcom/openfeint/internal/OpenFeintInternal;->_makeRequest(Lcom/openfeint/internal/request/BaseRequest;)V */
/* .line 732 */
return;
} // .end method
public void uploadFile ( java.lang.String p0, java.lang.String p1, java.lang.String p2, com.openfeint.internal.OpenFeintInternal$IUploadDelegate p3 ) {
/* .locals 5 */
/* .param p1, "xpApiPath" # Ljava/lang/String; */
/* .param p2, "filePath" # Ljava/lang/String; */
/* .param p3, "contentType" # Ljava/lang/String; */
/* .param p4, "delegate" # Lcom/openfeint/internal/OpenFeintInternal$IUploadDelegate; */
/* .prologue */
/* .line 695 */
/* move-object v1, p2 */
/* .line 696 */
/* .local v1, "fileName":Ljava/lang/String; */
try { // :try_start_0
final String v3 = "/"; // const-string v3, "/"
(( java.lang.String ) p2 ).split ( v3 ); // invoke-virtual {p2, v3}, Ljava/lang/String;->split(Ljava/lang/String;)[Ljava/lang/String;
/* .line 697 */
/* .local v2, "parts":[Ljava/lang/String; */
/* array-length v3, v2 */
/* if-lez v3, :cond_0 */
/* .line 698 */
/* array-length v3, v2 */
/* add-int/lit8 v3, v3, -0x1 */
/* aget-object v1, v2, v3 */
/* .line 700 */
} // :cond_0
/* new-instance v3, Lcom/openfeint/internal/request/multipart/FilePartSource; */
/* new-instance v4, Ljava/io/File; */
/* invoke-direct {v4, p2}, Ljava/io/File;-><init>(Ljava/lang/String;)V */
/* invoke-direct {v3, v1, v4}, Lcom/openfeint/internal/request/multipart/FilePartSource;-><init>(Ljava/lang/String;Ljava/io/File;)V */
(( com.openfeint.internal.OpenFeintInternal ) p0 ).uploadFile ( p1, v3, p3, p4 ); // invoke-virtual {p0, p1, v3, p3, p4}, Lcom/openfeint/internal/OpenFeintInternal;->uploadFile(Ljava/lang/String;Lcom/openfeint/internal/request/multipart/PartSource;Ljava/lang/String;Lcom/openfeint/internal/OpenFeintInternal$IUploadDelegate;)V
/* :try_end_0 */
/* .catch Ljava/io/FileNotFoundException; {:try_start_0 ..:try_end_0} :catch_0 */
/* .line 704 */
} // .end local v2 # "parts":[Ljava/lang/String;
} // :goto_0
return;
/* .line 701 */
/* :catch_0 */
/* move-exception v0 */
/* .line 702 */
/* .local v0, "e":Ljava/io/FileNotFoundException; */
final String v3 = ""; // const-string v3, ""
int v4 = 0; // const/4 v4, 0x0
} // .end method
public void uploadFile ( java.lang.String p0, java.lang.String p1, Object[] p2, java.lang.String p3, com.openfeint.internal.OpenFeintInternal$IUploadDelegate p4 ) {
/* .locals 1 */
/* .param p1, "xpApiPath" # Ljava/lang/String; */
/* .param p2, "fileName" # Ljava/lang/String; */
/* .param p3, "fileData" # [B */
/* .param p4, "contentType" # Ljava/lang/String; */
/* .param p5, "delegate" # Lcom/openfeint/internal/OpenFeintInternal$IUploadDelegate; */
/* .prologue */
/* .line 707 */
/* new-instance v0, Lcom/openfeint/internal/request/multipart/ByteArrayPartSource; */
/* invoke-direct {v0, p2, p3}, Lcom/openfeint/internal/request/multipart/ByteArrayPartSource;-><init>(Ljava/lang/String;[B)V */
(( com.openfeint.internal.OpenFeintInternal ) p0 ).uploadFile ( p1, v0, p4, p5 ); // invoke-virtual {p0, p1, v0, p4, p5}, Lcom/openfeint/internal/OpenFeintInternal;->uploadFile(Ljava/lang/String;Lcom/openfeint/internal/request/multipart/PartSource;Ljava/lang/String;Lcom/openfeint/internal/OpenFeintInternal$IUploadDelegate;)V
/* .line 708 */
return;
} // .end method
public void userApprovedFeint ( ) {
/* .locals 3 */
/* .prologue */
int v2 = 0; // const/4 v2, 0x0
/* .line 517 */
int v1 = 1; // const/4 v1, 0x1
/* iput-boolean v1, p0, Lcom/openfeint/internal/OpenFeintInternal;->mApproved:Z */
/* .line 518 */
/* iput-boolean v2, p0, Lcom/openfeint/internal/OpenFeintInternal;->mDeclined:Z */
/* .line 519 */
(( com.openfeint.internal.OpenFeintInternal ) p0 ).getPrefs ( ); // invoke-virtual {p0}, Lcom/openfeint/internal/OpenFeintInternal;->getPrefs()Lcom/openfeint/internal/SyncedStore;
(( com.openfeint.internal.SyncedStore ) v1 ).edit ( ); // invoke-virtual {v1}, Lcom/openfeint/internal/SyncedStore;->edit()Lcom/openfeint/internal/SyncedStore$Editor;
/* .line 522 */
/* .local v0, "e":Lcom/openfeint/internal/SyncedStore$Editor; */
try { // :try_start_0
/* invoke-direct {p0, v0}, Lcom/openfeint/internal/OpenFeintInternal;->saveUserApproval(Lcom/openfeint/internal/SyncedStore$Editor;)V */
/* :try_end_0 */
/* .catchall {:try_start_0 ..:try_end_0} :catchall_0 */
/* .line 524 */
(( com.openfeint.internal.SyncedStore$Editor ) v0 ).commit ( ); // invoke-virtual {v0}, Lcom/openfeint/internal/SyncedStore$Editor;->commit()V
/* .line 527 */
(( com.openfeint.internal.OpenFeintInternal ) p0 ).launchIntroFlow ( v2 ); // invoke-virtual {p0, v2}, Lcom/openfeint/internal/OpenFeintInternal;->launchIntroFlow(Z)V
/* .line 528 */
com.openfeint.internal.offline.OfflineSupport .setUserTemporary ( );
/* .line 529 */
return;
/* .line 524 */
/* :catchall_0 */
/* move-exception v1 */
(( com.openfeint.internal.SyncedStore$Editor ) v0 ).commit ( ); // invoke-virtual {v0}, Lcom/openfeint/internal/SyncedStore$Editor;->commit()V
/* throw v1 */
} // .end method
public void userDeclinedFeint ( ) {
/* .locals 3 */
/* .prologue */
/* .line 536 */
int v1 = 0; // const/4 v1, 0x0
/* iput-boolean v1, p0, Lcom/openfeint/internal/OpenFeintInternal;->mApproved:Z */
/* .line 537 */
int v1 = 1; // const/4 v1, 0x1
/* iput-boolean v1, p0, Lcom/openfeint/internal/OpenFeintInternal;->mDeclined:Z */
/* .line 539 */
(( com.openfeint.internal.OpenFeintInternal ) p0 ).getPrefs ( ); // invoke-virtual {p0}, Lcom/openfeint/internal/OpenFeintInternal;->getPrefs()Lcom/openfeint/internal/SyncedStore;
(( com.openfeint.internal.SyncedStore ) v1 ).edit ( ); // invoke-virtual {v1}, Lcom/openfeint/internal/SyncedStore;->edit()Lcom/openfeint/internal/SyncedStore$Editor;
/* .line 541 */
/* .local v0, "e":Lcom/openfeint/internal/SyncedStore$Editor; */
try { // :try_start_0
/* new-instance v1, Ljava/lang/StringBuilder; */
/* invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V */
(( com.openfeint.internal.OpenFeintInternal ) p0 ).getContext ( ); // invoke-virtual {p0}, Lcom/openfeint/internal/OpenFeintInternal;->getContext()Landroid/content/Context;
(( android.content.Context ) v2 ).getPackageName ( ); // invoke-virtual {v2}, Landroid/content/Context;->getPackageName()Ljava/lang/String;
(( java.lang.StringBuilder ) v1 ).append ( v2 ); // invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
final String v2 = ".of_declined"; // const-string v2, ".of_declined"
(( java.lang.StringBuilder ) v1 ).append ( v2 ); // invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v1 ).toString ( ); // invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
final String v2 = "sadly"; // const-string v2, "sadly"
(( com.openfeint.internal.SyncedStore$Editor ) v0 ).putString ( v1, v2 ); // invoke-virtual {v0, v1, v2}, Lcom/openfeint/internal/SyncedStore$Editor;->putString(Ljava/lang/String;Ljava/lang/String;)V
/* :try_end_0 */
/* .catchall {:try_start_0 ..:try_end_0} :catchall_0 */
/* .line 543 */
(( com.openfeint.internal.SyncedStore$Editor ) v0 ).commit ( ); // invoke-virtual {v0}, Lcom/openfeint/internal/SyncedStore$Editor;->commit()V
/* .line 546 */
com.openfeint.internal.offline.OfflineSupport .setUserDeclined ( );
/* .line 547 */
return;
/* .line 543 */
/* :catchall_0 */
/* move-exception v1 */
(( com.openfeint.internal.SyncedStore$Editor ) v0 ).commit ( ); // invoke-virtual {v0}, Lcom/openfeint/internal/SyncedStore$Editor;->commit()V
/* throw v1 */
} // .end method
