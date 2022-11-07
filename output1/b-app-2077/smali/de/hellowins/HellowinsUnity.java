public class de.hellowins.HellowinsUnity {
	 /* .source "HellowinsUnity.java" */
	 /* # instance fields */
	 org.json.JSONObject apiAccessObject;
	 protected de.hellowins.HwDataStore dataStore;
	 protected Boolean debugMode;
	 protected de.hellowins.LogData logData;
	 protected de.hellowins.UnityServerResponseHandler serverFacade;
	 /* # direct methods */
	 public de.hellowins.HellowinsUnity ( ) {
		 /* .locals 1 */
		 /* .prologue */
		 /* .line 70 */
		 /* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
		 /* .line 53 */
		 int v0 = 0; // const/4 v0, 0x0
		 /* iput-boolean v0, p0, Lde/hellowins/HellowinsUnity;->debugMode:Z */
		 /* .line 71 */
		 /* new-instance v0, Lde/hellowins/HwDataStore; */
		 /* invoke-direct {v0}, Lde/hellowins/HwDataStore;-><init>()V */
		 this.dataStore = v0;
		 /* .line 72 */
		 /* new-instance v0, Lde/hellowins/LogData; */
		 /* invoke-direct {v0}, Lde/hellowins/LogData;-><init>()V */
		 this.logData = v0;
		 /* .line 73 */
		 return;
	 } // .end method
	 /* # virtual methods */
	 public void apiFinishGame ( android.content.Context p0, Integer p1 ) {
		 /* .locals 4 */
		 /* .param p1, "context" # Landroid/content/Context; */
		 /* .param p2, "points" # I */
		 /* .prologue */
		 /* .line 237 */
		 v1 = this.logData;
		 /* new-instance v2, Ljava/lang/StringBuilder; */
		 final String v3 = "Finish "; // const-string v3, "Finish "
		 /* invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V */
		 (( java.lang.StringBuilder ) v2 ).append ( p2 ); // invoke-virtual {v2, p2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;
		 (( java.lang.StringBuilder ) v2 ).toString ( ); // invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
		 (( de.hellowins.LogData ) v1 ).addLog ( v2 ); // invoke-virtual {v1, v2}, Lde/hellowins/LogData;->addLog(Ljava/lang/String;)V
		 /* .line 238 */
		 /* if-nez p1, :cond_1 */
		 /* .line 248 */
	 } // :cond_0
} // :goto_0
return;
/* .line 240 */
} // :cond_1
v1 = this.dataStore;
/* iget-boolean v1, v1, Lde/hellowins/HwDataStore;->initialized:Z */
if ( v1 != null) { // if-eqz v1, :cond_0
/* .line 241 */
v1 = this.dataStore;
int v2 = 0; // const/4 v2, 0x0
/* iput-boolean v2, v1, Lde/hellowins/HwDataStore;->initialized:Z */
/* .line 243 */
/* new-instance v0, Lde/hellowins/ApiHttpRequest; */
v1 = this.dataStore;
(( de.hellowins.HwDataStore ) v1 ).getSessionCookie ( ); // invoke-virtual {v1}, Lde/hellowins/HwDataStore;->getSessionCookie()Ljava/lang/String;
v2 = this.dataStore;
(( de.hellowins.HwDataStore ) v2 ).getApiUri ( ); // invoke-virtual {v2}, Lde/hellowins/HwDataStore;->getApiUri()Ljava/lang/String;
v3 = this.logData;
/* invoke-direct {v0, v1, v2, v3}, Lde/hellowins/ApiHttpRequest;-><init>(Ljava/lang/String;Ljava/lang/String;Lde/hellowins/LogData;)V */
/* .line 244 */
/* .local v0, "req":Lde/hellowins/ApiHttpRequest; */
v1 = this.dataStore;
(( de.hellowins.HwDataStore ) v1 ).getChallengeId ( ); // invoke-virtual {v1}, Lde/hellowins/HwDataStore;->getChallengeId()Ljava/lang/String;
v2 = this.serverFacade;
(( de.hellowins.ApiHttpRequest ) v0 ).doFinishGame ( v1, v2 ); // invoke-virtual {v0, v1, v2}, Lde/hellowins/ApiHttpRequest;->doFinishGame(Ljava/lang/String;Lde/hellowins/ApiHttpRequestHandler;)V
/* .line 247 */
(( de.hellowins.HellowinsUnity ) p0 ).backToHellowinsApp ( p1 ); // invoke-virtual {p0, p1}, Lde/hellowins/HellowinsUnity;->backToHellowinsApp(Landroid/content/Context;)V
} // .end method
public void apiStartGame ( ) {
/* .locals 4 */
/* .prologue */
/* .line 211 */
v1 = this.dataStore;
/* iget-boolean v1, v1, Lde/hellowins/HwDataStore;->initialized:Z */
/* if-nez v1, :cond_0 */
/* .line 214 */
} // :goto_0
return;
/* .line 212 */
} // :cond_0
/* new-instance v0, Lde/hellowins/ApiHttpRequest; */
v1 = this.dataStore;
(( de.hellowins.HwDataStore ) v1 ).getSessionCookie ( ); // invoke-virtual {v1}, Lde/hellowins/HwDataStore;->getSessionCookie()Ljava/lang/String;
v2 = this.dataStore;
(( de.hellowins.HwDataStore ) v2 ).getApiUri ( ); // invoke-virtual {v2}, Lde/hellowins/HwDataStore;->getApiUri()Ljava/lang/String;
v3 = this.logData;
/* invoke-direct {v0, v1, v2, v3}, Lde/hellowins/ApiHttpRequest;-><init>(Ljava/lang/String;Ljava/lang/String;Lde/hellowins/LogData;)V */
/* .line 213 */
/* .local v0, "req":Lde/hellowins/ApiHttpRequest; */
v1 = this.dataStore;
(( de.hellowins.HwDataStore ) v1 ).getChallengeId ( ); // invoke-virtual {v1}, Lde/hellowins/HwDataStore;->getChallengeId()Ljava/lang/String;
v2 = this.serverFacade;
(( de.hellowins.ApiHttpRequest ) v0 ).doStartGame ( v1, v2 ); // invoke-virtual {v0, v1, v2}, Lde/hellowins/ApiHttpRequest;->doStartGame(Ljava/lang/String;Lde/hellowins/ApiHttpRequestHandler;)V
} // .end method
void backToHellowinsApp ( android.content.Context p0 ) {
/* .locals 7 */
/* .param p1, "context" # Landroid/content/Context; */
/* .prologue */
/* .line 256 */
v4 = this.serverFacade;
v4 = this.apiWebSocket;
(( de.hellowins.UnityApiWebSocket ) v4 ).close ( ); // invoke-virtual {v4}, Lde/hellowins/UnityApiWebSocket;->close()V
/* .line 258 */
v4 = this.logData;
final String v5 = "backToHellowinsApp"; // const-string v5, "backToHellowinsApp"
(( de.hellowins.LogData ) v4 ).addLog ( v5 ); // invoke-virtual {v4, v5}, Lde/hellowins/LogData;->addLog(Ljava/lang/String;)V
/* .line 260 */
/* new-instance v1, Landroid/os/Bundle; */
/* invoke-direct {v1}, Landroid/os/Bundle;-><init>()V */
/* .line 261 */
/* .local v1, "bundle":Landroid/os/Bundle; */
final String v4 = "hellowins_accesstoken"; // const-string v4, "hellowins_accesstoken"
v5 = this.apiAccessObject;
(( org.json.JSONObject ) v5 ).toString ( ); // invoke-virtual {v5}, Lorg/json/JSONObject;->toString()Ljava/lang/String;
(( android.os.Bundle ) v1 ).putString ( v4, v5 ); // invoke-virtual {v1, v4, v5}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V
/* .line 263 */
/* new-instance v3, Landroid/content/Intent; */
/* invoke-direct {v3}, Landroid/content/Intent;-><init>()V */
/* .line 264 */
/* .local v3, "intent":Landroid/content/Intent; */
(( android.content.Intent ) v3 ).putExtras ( v1 ); // invoke-virtual {v3, v1}, Landroid/content/Intent;->putExtras(Landroid/os/Bundle;)Landroid/content/Intent;
/* .line 278 */
v4 = this.logData;
final String v5 = "checkInstalledApps"; // const-string v5, "checkInstalledApps"
(( de.hellowins.LogData ) v4 ).addLog ( v5 ); // invoke-virtual {v4, v5}, Lde/hellowins/LogData;->addLog(Ljava/lang/String;)V
/* .line 280 */
(( de.hellowins.HellowinsUnity ) p0 ).checkInstalledApps ( p1 ); // invoke-virtual {p0, p1}, Lde/hellowins/HellowinsUnity;->checkInstalledApps(Landroid/content/Context;)Ljava/lang/String;
/* .line 281 */
/* .local v0, "app":Ljava/lang/String; */
/* if-nez v0, :cond_0 */
/* .line 289 */
} // :goto_0
return;
/* .line 284 */
} // :cond_0
try { // :try_start_0
/* new-instance v4, Landroid/content/ComponentName; */
/* new-instance v5, Ljava/lang/StringBuilder; */
java.lang.String .valueOf ( v0 );
/* invoke-direct {v5, v6}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V */
final String v6 = ".MainActivity"; // const-string v6, ".MainActivity"
(( java.lang.StringBuilder ) v5 ).append ( v6 ); // invoke-virtual {v5, v6}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v5 ).toString ( ); // invoke-virtual {v5}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
/* invoke-direct {v4, v0, v5}, Landroid/content/ComponentName;-><init>(Ljava/lang/String;Ljava/lang/String;)V */
(( android.content.Intent ) v3 ).setComponent ( v4 ); // invoke-virtual {v3, v4}, Landroid/content/Intent;->setComponent(Landroid/content/ComponentName;)Landroid/content/Intent;
/* .line 285 */
(( android.content.Context ) p1 ).startActivity ( v3 ); // invoke-virtual {p1, v3}, Landroid/content/Context;->startActivity(Landroid/content/Intent;)V
/* :try_end_0 */
/* .catch Ljava/lang/Exception; {:try_start_0 ..:try_end_0} :catch_0 */
/* .line 286 */
/* :catch_0 */
/* move-exception v2 */
/* .line 287 */
/* .local v2, "e":Ljava/lang/Exception; */
v4 = this.logData;
final String v5 = "Hellowins App not found on System."; // const-string v5, "Hellowins App not found on System."
(( de.hellowins.LogData ) v4 ).addLog ( v5 ); // invoke-virtual {v4, v5}, Lde/hellowins/LogData;->addLog(Ljava/lang/String;)V
} // .end method
protected java.lang.String checkInstalledApps ( android.content.Context p0 ) {
/* .locals 6 */
/* .param p1, "context" # Landroid/content/Context; */
/* .prologue */
/* .line 292 */
v3 = this.logData;
final String v4 = "checkInstalledApps"; // const-string v4, "checkInstalledApps"
(( de.hellowins.LogData ) v3 ).addLog ( v4 ); // invoke-virtual {v3, v4}, Lde/hellowins/LogData;->addLog(Ljava/lang/String;)V
/* .line 294 */
try { // :try_start_0
(( android.content.Context ) p1 ).getPackageManager ( ); // invoke-virtual {p1}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;
int v4 = 0; // const/4 v4, 0x0
(( android.content.pm.PackageManager ) v3 ).getInstalledPackages ( v4 ); // invoke-virtual {v3, v4}, Landroid/content/pm/PackageManager;->getInstalledPackages(I)Ljava/util/List;
/* .line 295 */
/* .local v2, "packages":Ljava/util/List;, "Ljava/util/List<Landroid/content/pm/PackageInfo;>;" */
v4 = } // :cond_0
/* if-nez v4, :cond_1 */
/* .line 303 */
v3 = this.logData;
final String v4 = "could not find AppLauncher or Hellowins"; // const-string v4, "could not find AppLauncher or Hellowins"
(( de.hellowins.LogData ) v3 ).addLog ( v4 ); // invoke-virtual {v3, v4}, Lde/hellowins/LogData;->addLog(Ljava/lang/String;)V
/* .line 307 */
} // .end local v2 # "packages":Ljava/util/List;, "Ljava/util/List<Landroid/content/pm/PackageInfo;>;"
} // :goto_0
int v3 = 0; // const/4 v3, 0x0
} // :goto_1
/* .line 295 */
/* .restart local v2 # "packages":Ljava/util/List;, "Ljava/util/List<Landroid/content/pm/PackageInfo;>;" */
} // :cond_1
/* check-cast v1, Landroid/content/pm/PackageInfo; */
/* .line 297 */
/* .local v1, "pack":Landroid/content/pm/PackageInfo; */
v4 = this.packageName;
final String v5 = "de.hellowins"; // const-string v5, "de.hellowins"
v4 = (( java.lang.String ) v4 ).equals ( v5 ); // invoke-virtual {v4, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
/* if-nez v4, :cond_2 */
v4 = this.packageName;
final String v5 = "de.hellowins.applauncher"; // const-string v5, "de.hellowins.applauncher"
v4 = (( java.lang.String ) v4 ).equals ( v5 ); // invoke-virtual {v4, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
if ( v4 != null) { // if-eqz v4, :cond_0
/* .line 298 */
} // :cond_2
v3 = this.logData;
/* new-instance v4, Ljava/lang/StringBuilder; */
final String v5 = "found "; // const-string v5, "found "
/* invoke-direct {v4, v5}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V */
v5 = this.packageName;
(( java.lang.StringBuilder ) v4 ).append ( v5 ); // invoke-virtual {v4, v5}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v4 ).toString ( ); // invoke-virtual {v4}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
(( de.hellowins.LogData ) v3 ).addLog ( v4 ); // invoke-virtual {v3, v4}, Lde/hellowins/LogData;->addLog(Ljava/lang/String;)V
/* .line 299 */
v3 = this.packageName;
/* :try_end_0 */
/* .catch Ljava/lang/Exception; {:try_start_0 ..:try_end_0} :catch_0 */
/* .line 304 */
} // .end local v1 # "pack":Landroid/content/pm/PackageInfo;
} // .end local v2 # "packages":Ljava/util/List;, "Ljava/util/List<Landroid/content/pm/PackageInfo;>;"
/* :catch_0 */
/* move-exception v0 */
/* .line 305 */
/* .local v0, "e":Ljava/lang/Exception; */
v3 = this.logData;
(( de.hellowins.LogData ) v3 ).logException ( v0 ); // invoke-virtual {v3, v0}, Lde/hellowins/LogData;->logException(Ljava/lang/Exception;)V
} // .end method
public void clearLog ( ) {
/* .locals 1 */
/* .prologue */
/* .line 323 */
v0 = this.logData;
if ( v0 != null) { // if-eqz v0, :cond_0
/* .line 324 */
v0 = this.logData;
(( de.hellowins.LogData ) v0 ).clear ( ); // invoke-virtual {v0}, Lde/hellowins/LogData;->clear()V
/* .line 325 */
} // :cond_0
return;
} // .end method
public Integer getHighscore ( ) {
/* .locals 1 */
/* .prologue */
/* .line 355 */
v0 = this.serverFacade;
v0 = (( de.hellowins.UnityServerResponseHandler ) v0 ).getHighscore ( ); // invoke-virtual {v0}, Lde/hellowins/UnityServerResponseHandler;->getHighscore()I
} // .end method
public Integer getLevel ( ) {
/* .locals 1 */
/* .prologue */
/* .line 204 */
v0 = this.dataStore;
v0 = (( de.hellowins.HwDataStore ) v0 ).getLevel ( ); // invoke-virtual {v0}, Lde/hellowins/HwDataStore;->getLevel()I
} // .end method
public java.lang.String getLog ( ) {
/* .locals 1 */
/* .prologue */
/* .line 314 */
v0 = this.logData;
/* if-nez v0, :cond_0 */
final String v0 = "null log"; // const-string v0, "null log"
/* .line 316 */
} // :goto_0
} // :cond_0
v0 = this.logData;
(( de.hellowins.LogData ) v0 ).getLog ( ); // invoke-virtual {v0}, Lde/hellowins/LogData;->getLog()Ljava/lang/String;
} // .end method
public java.lang.String getRanking ( ) {
/* .locals 1 */
/* .prologue */
/* .line 351 */
v0 = this.serverFacade;
(( de.hellowins.UnityServerResponseHandler ) v0 ).getRanking ( ); // invoke-virtual {v0}, Lde/hellowins/UnityServerResponseHandler;->getRanking()Ljava/lang/String;
} // .end method
public Integer getRemainingPercent ( ) {
/* .locals 1 */
/* .prologue */
/* .line 342 */
v0 = this.serverFacade;
v0 = (( de.hellowins.UnityServerResponseHandler ) v0 ).getRemainingPercent ( ); // invoke-virtual {v0}, Lde/hellowins/UnityServerResponseHandler;->getRemainingPercent()I
} // .end method
public java.lang.String getRemainingTime ( ) {
/* .locals 1 */
/* .prologue */
/* .line 334 */
v0 = this.serverFacade;
(( de.hellowins.UnityServerResponseHandler ) v0 ).getRemainingTime ( ); // invoke-virtual {v0}, Lde/hellowins/UnityServerResponseHandler;->getRemainingTime()Ljava/lang/String;
} // .end method
public java.lang.String getVersion ( ) {
/* .locals 1 */
/* .prologue */
/* .line 180 */
v0 = de.hellowins.HwConstants.apiVersion;
} // .end method
public Boolean init ( android.app.Activity p0, Boolean p1 ) {
/* .locals 8 */
/* .param p1, "activity" # Landroid/app/Activity; */
/* .param p2, "debugMode" # Z */
/* .prologue */
/* .line 90 */
/* iput-boolean p2, p0, Lde/hellowins/HellowinsUnity;->debugMode:Z */
/* .line 91 */
v5 = this.logData;
(( de.hellowins.LogData ) v5 ).setDebugMode ( p2 ); // invoke-virtual {v5, p2}, Lde/hellowins/LogData;->setDebugMode(Z)V
/* .line 92 */
/* new-instance v5, Lde/hellowins/UnityServerResponseHandler; */
v6 = this.dataStore;
v7 = this.logData;
/* invoke-direct {v5, v6, v7}, Lde/hellowins/UnityServerResponseHandler;-><init>(Lde/hellowins/HwDataStore;Lde/hellowins/LogData;)V */
this.serverFacade = v5;
/* .line 94 */
v5 = this.logData;
final String v6 = "Try to init Unity Hellowins"; // const-string v6, "Try to init Unity Hellowins"
(( de.hellowins.LogData ) v5 ).addLog ( v6 ); // invoke-virtual {v5, v6}, Lde/hellowins/LogData;->addLog(Ljava/lang/String;)V
/* .line 96 */
/* if-nez p1, :cond_0 */
/* .line 97 */
v5 = this.logData;
final String v6 = "Activity null"; // const-string v6, "Activity null"
(( de.hellowins.LogData ) v5 ).addLog ( v6 ); // invoke-virtual {v5, v6}, Lde/hellowins/LogData;->addLog(Ljava/lang/String;)V
/* .line 98 */
int v5 = 0; // const/4 v5, 0x0
/* .line 165 */
} // :goto_0
/* .line 111 */
} // :cond_0
v5 = this.logData;
(( java.lang.Object ) p1 ).toString ( ); // invoke-virtual {p1}, Ljava/lang/Object;->toString()Ljava/lang/String;
(( de.hellowins.LogData ) v5 ).addLog ( v6 ); // invoke-virtual {v5, v6}, Lde/hellowins/LogData;->addLog(Ljava/lang/String;)V
/* .line 113 */
(( android.app.Activity ) p1 ).getIntent ( ); // invoke-virtual {p1}, Landroid/app/Activity;->getIntent()Landroid/content/Intent;
(( android.content.Intent ) v5 ).getExtras ( ); // invoke-virtual {v5}, Landroid/content/Intent;->getExtras()Landroid/os/Bundle;
/* .line 115 */
/* .local v1, "bundle":Landroid/os/Bundle; */
if ( v1 != null) { // if-eqz v1, :cond_2
/* .line 116 */
final String v5 = "hellowins_accesstoken"; // const-string v5, "hellowins_accesstoken"
(( android.os.Bundle ) v1 ).getString ( v5 ); // invoke-virtual {v1, v5}, Landroid/os/Bundle;->getString(Ljava/lang/String;)Ljava/lang/String;
/* .line 118 */
/* .local v0, "apiAccessToken":Ljava/lang/String; */
final String v5 = "Game_Hellowins"; // const-string v5, "Game_Hellowins"
/* new-instance v6, Ljava/lang/StringBuilder; */
final String v7 = "init "; // const-string v7, "init "
/* invoke-direct {v6, v7}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V */
(( java.lang.StringBuilder ) v6 ).append ( v0 ); // invoke-virtual {v6, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v6 ).toString ( ); // invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
android.util.Log .d ( v5,v6 );
/* .line 120 */
/* if-nez v0, :cond_1 */
/* .line 121 */
v5 = this.logData;
final String v6 = "apiAccessToken null"; // const-string v6, "apiAccessToken null"
(( de.hellowins.LogData ) v5 ).addLog ( v6 ); // invoke-virtual {v5, v6}, Lde/hellowins/LogData;->addLog(Ljava/lang/String;)V
/* .line 123 */
} // :cond_1
v5 = this.logData;
(( de.hellowins.LogData ) v5 ).addLog ( v0 ); // invoke-virtual {v5, v0}, Lde/hellowins/LogData;->addLog(Ljava/lang/String;)V
/* .line 127 */
try { // :try_start_0
/* new-instance v5, Lorg/json/JSONObject; */
/* invoke-direct {v5, v0}, Lorg/json/JSONObject;-><init>(Ljava/lang/String;)V */
this.apiAccessObject = v5;
/* .line 129 */
v5 = this.serverFacade;
v6 = this.apiAccessObject;
this.apiAccessObject = v6;
/* .line 131 */
v5 = this.dataStore;
v6 = this.apiAccessObject;
final String v7 = "challengeId"; // const-string v7, "challengeId"
(( org.json.JSONObject ) v6 ).getString ( v7 ); // invoke-virtual {v6, v7}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;
(( de.hellowins.HwDataStore ) v5 ).setChallengeId ( v6 ); // invoke-virtual {v5, v6}, Lde/hellowins/HwDataStore;->setChallengeId(Ljava/lang/String;)V
/* .line 132 */
v5 = this.dataStore;
v6 = this.apiAccessObject;
final String v7 = "cookie"; // const-string v7, "cookie"
(( org.json.JSONObject ) v6 ).getString ( v7 ); // invoke-virtual {v6, v7}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;
(( de.hellowins.HwDataStore ) v5 ).setSessionCookie ( v6 ); // invoke-virtual {v5, v6}, Lde/hellowins/HwDataStore;->setSessionCookie(Ljava/lang/String;)V
/* .line 133 */
v5 = this.dataStore;
v6 = this.apiAccessObject;
final String v7 = "level"; // const-string v7, "level"
v6 = (( org.json.JSONObject ) v6 ).getInt ( v7 ); // invoke-virtual {v6, v7}, Lorg/json/JSONObject;->getInt(Ljava/lang/String;)I
(( de.hellowins.HwDataStore ) v5 ).setLevel ( v6 ); // invoke-virtual {v5, v6}, Lde/hellowins/HwDataStore;->setLevel(I)V
/* .line 135 */
v5 = this.dataStore;
v6 = this.apiAccessObject;
final String v7 = "key"; // const-string v7, "key"
(( org.json.JSONObject ) v6 ).getString ( v7 ); // invoke-virtual {v6, v7}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;
(( de.hellowins.HwDataStore ) v5 ).setEncKey ( v6 ); // invoke-virtual {v5, v6}, Lde/hellowins/HwDataStore;->setEncKey(Ljava/lang/String;)V
/* .line 137 */
v5 = this.apiAccessObject;
final String v6 = "host"; // const-string v6, "host"
(( org.json.JSONObject ) v5 ).getString ( v6 ); // invoke-virtual {v5, v6}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;
/* .line 139 */
/* .local v3, "host":Ljava/lang/String; */
v5 = this.dataStore;
/* new-instance v6, Ljava/lang/StringBuilder; */
final String v7 = "http://"; // const-string v7, "http://"
/* invoke-direct {v6, v7}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V */
(( java.lang.StringBuilder ) v6 ).append ( v3 ); // invoke-virtual {v6, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
final String v7 = "/api/"; // const-string v7, "/api/"
(( java.lang.StringBuilder ) v6 ).append ( v7 ); // invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v6 ).toString ( ); // invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
(( de.hellowins.HwDataStore ) v5 ).setApiUri ( v6 ); // invoke-virtual {v5, v6}, Lde/hellowins/HwDataStore;->setApiUri(Ljava/lang/String;)V
/* .line 140 */
v5 = this.dataStore;
/* new-instance v6, Ljava/lang/StringBuilder; */
final String v7 = "ws://"; // const-string v7, "ws://"
/* invoke-direct {v6, v7}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V */
(( java.lang.StringBuilder ) v6 ).append ( v3 ); // invoke-virtual {v6, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
final String v7 = "/"; // const-string v7, "/"
(( java.lang.StringBuilder ) v6 ).append ( v7 ); // invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v6 ).toString ( ); // invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
(( de.hellowins.HwDataStore ) v5 ).setWsUri ( v6 ); // invoke-virtual {v5, v6}, Lde/hellowins/HwDataStore;->setWsUri(Ljava/lang/String;)V
/* .line 142 */
v5 = this.logData;
/* new-instance v6, Ljava/lang/StringBuilder; */
final String v7 = "ApiUri: "; // const-string v7, "ApiUri: "
/* invoke-direct {v6, v7}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V */
v7 = this.dataStore;
(( de.hellowins.HwDataStore ) v7 ).getApiUri ( ); // invoke-virtual {v7}, Lde/hellowins/HwDataStore;->getApiUri()Ljava/lang/String;
(( java.lang.StringBuilder ) v6 ).append ( v7 ); // invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v6 ).toString ( ); // invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
(( de.hellowins.LogData ) v5 ).addLog ( v6 ); // invoke-virtual {v5, v6}, Lde/hellowins/LogData;->addLog(Ljava/lang/String;)V
/* .line 143 */
v5 = this.logData;
/* new-instance v6, Ljava/lang/StringBuilder; */
final String v7 = "WsUri: "; // const-string v7, "WsUri: "
/* invoke-direct {v6, v7}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V */
v7 = this.dataStore;
(( de.hellowins.HwDataStore ) v7 ).getWsUri ( ); // invoke-virtual {v7}, Lde/hellowins/HwDataStore;->getWsUri()Ljava/lang/String;
(( java.lang.StringBuilder ) v6 ).append ( v7 ); // invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v6 ).toString ( ); // invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
(( de.hellowins.LogData ) v5 ).addLog ( v6 ); // invoke-virtual {v5, v6}, Lde/hellowins/LogData;->addLog(Ljava/lang/String;)V
/* .line 144 */
v5 = this.logData;
/* new-instance v6, Ljava/lang/StringBuilder; */
final String v7 = "ChallengeId: "; // const-string v7, "ChallengeId: "
/* invoke-direct {v6, v7}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V */
v7 = this.dataStore;
(( de.hellowins.HwDataStore ) v7 ).getChallengeId ( ); // invoke-virtual {v7}, Lde/hellowins/HwDataStore;->getChallengeId()Ljava/lang/String;
(( java.lang.StringBuilder ) v6 ).append ( v7 ); // invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v6 ).toString ( ); // invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
(( de.hellowins.LogData ) v5 ).addLog ( v6 ); // invoke-virtual {v5, v6}, Lde/hellowins/LogData;->addLog(Ljava/lang/String;)V
/* .line 145 */
v5 = this.logData;
/* new-instance v6, Ljava/lang/StringBuilder; */
final String v7 = "EncKey: "; // const-string v7, "EncKey: "
/* invoke-direct {v6, v7}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V */
v7 = this.dataStore;
(( de.hellowins.HwDataStore ) v7 ).getEncKey ( ); // invoke-virtual {v7}, Lde/hellowins/HwDataStore;->getEncKey()Ljava/lang/String;
(( java.lang.StringBuilder ) v6 ).append ( v7 ); // invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v6 ).toString ( ); // invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
(( de.hellowins.LogData ) v5 ).addLog ( v6 ); // invoke-virtual {v5, v6}, Lde/hellowins/LogData;->addLog(Ljava/lang/String;)V
/* :try_end_0 */
/* .catch Ljava/lang/Exception; {:try_start_0 ..:try_end_0} :catch_0 */
/* .line 153 */
} // .end local v3 # "host":Ljava/lang/String;
} // :goto_1
try { // :try_start_1
/* new-instance v4, Lde/hellowins/UnityApiHttpRequest; */
v5 = this.dataStore;
(( de.hellowins.HwDataStore ) v5 ).getSessionCookie ( ); // invoke-virtual {v5}, Lde/hellowins/HwDataStore;->getSessionCookie()Ljava/lang/String;
v6 = this.dataStore;
(( de.hellowins.HwDataStore ) v6 ).getApiUri ( ); // invoke-virtual {v6}, Lde/hellowins/HwDataStore;->getApiUri()Ljava/lang/String;
v7 = this.logData;
/* invoke-direct {v4, v5, v6, v7}, Lde/hellowins/UnityApiHttpRequest;-><init>(Ljava/lang/String;Ljava/lang/String;Lde/hellowins/LogData;)V */
/* .line 154 */
/* .local v4, "req":Lde/hellowins/UnityApiHttpRequest; */
v5 = this.serverFacade;
(( de.hellowins.UnityApiHttpRequest ) v4 ).doGetUser ( v5 ); // invoke-virtual {v4, v5}, Lde/hellowins/UnityApiHttpRequest;->doGetUser(Lde/hellowins/ApiHttpRequestHandler;)V
/* :try_end_1 */
/* .catch Ljava/lang/Exception; {:try_start_1 ..:try_end_1} :catch_1 */
/* .line 160 */
} // .end local v4 # "req":Lde/hellowins/UnityApiHttpRequest;
} // :goto_2
v5 = this.dataStore;
int v6 = 1; // const/4 v6, 0x1
/* iput-boolean v6, v5, Lde/hellowins/HwDataStore;->initialized:Z */
/* .line 165 */
} // .end local v0 # "apiAccessToken":Ljava/lang/String;
} // :goto_3
v5 = this.dataStore;
/* iget-boolean v5, v5, Lde/hellowins/HwDataStore;->initialized:Z */
/* goto/16 :goto_0 */
/* .line 147 */
/* .restart local v0 # "apiAccessToken":Ljava/lang/String; */
/* :catch_0 */
/* move-exception v2 */
/* .line 148 */
/* .local v2, "e":Ljava/lang/Exception; */
v5 = this.logData;
(( de.hellowins.LogData ) v5 ).logException ( v2 ); // invoke-virtual {v5, v2}, Lde/hellowins/LogData;->logException(Ljava/lang/Exception;)V
/* .line 156 */
} // .end local v2 # "e":Ljava/lang/Exception;
/* :catch_1 */
/* move-exception v2 */
/* .line 157 */
/* .restart local v2 # "e":Ljava/lang/Exception; */
v5 = this.logData;
(( de.hellowins.LogData ) v5 ).logException ( v2 ); // invoke-virtual {v5, v2}, Lde/hellowins/LogData;->logException(Ljava/lang/Exception;)V
/* .line 162 */
} // .end local v0 # "apiAccessToken":Ljava/lang/String;
} // .end local v2 # "e":Ljava/lang/Exception;
} // :cond_2
v5 = this.logData;
final String v6 = "bundle null"; // const-string v6, "bundle null"
(( de.hellowins.LogData ) v5 ).addLog ( v6 ); // invoke-virtual {v5, v6}, Lde/hellowins/LogData;->addLog(Ljava/lang/String;)V
} // .end method
public Boolean isGameFinished ( ) {
/* .locals 1 */
/* .prologue */
/* .line 197 */
v0 = this.dataStore;
/* iget-boolean v0, v0, Lde/hellowins/HwDataStore;->gameFinished:Z */
} // .end method
public Boolean isGameRunning ( ) {
/* .locals 1 */
/* .prologue */
/* .line 189 */
v0 = this.dataStore;
/* iget-boolean v0, v0, Lde/hellowins/HwDataStore;->gameRunning:Z */
} // .end method
public Boolean isInitialized ( ) {
/* .locals 1 */
/* .prologue */
/* .line 173 */
v0 = this.dataStore;
/* iget-boolean v0, v0, Lde/hellowins/HwDataStore;->initialized:Z */
} // .end method
public java.lang.String updatePoints ( Integer p0 ) {
/* .locals 1 */
/* .param p1, "points" # I */
/* .prologue */
/* .line 224 */
v0 = this.serverFacade;
(( de.hellowins.UnityServerResponseHandler ) v0 ).updatePoints ( p1 ); // invoke-virtual {v0, p1}, Lde/hellowins/UnityServerResponseHandler;->updatePoints(I)Ljava/lang/String;
} // .end method
