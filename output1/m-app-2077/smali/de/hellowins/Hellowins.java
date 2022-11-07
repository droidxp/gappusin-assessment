public class de.hellowins.Hellowins implements de.hellowins.ApiHttpRequestHandler implements de.hellowins.ApiWebSocketHandler implements de.hellowins.HellowinsInterface implements de.hellowins.HellowinsDialogHandler implements de.hellowins.handler.TimerUpdateHandler {
	 /* .source "Hellowins.java" */
	 /* # interfaces */
	 /* # static fields */
	 private static de.hellowins.Hellowins inst;
	 static java.text.SimpleDateFormat sDateFormat;
	 /* # instance fields */
	 org.json.JSONObject apiAccessObject;
	 protected de.hellowins.ApiWebSocket apiWebSocket;
	 private final android.os.Handler closeDialogHandler;
	 final java.lang.Runnable closeDialogRunnable;
	 protected android.content.Context context;
	 protected de.hellowins.HwDataStore dataStore;
	 de.hellowins.game.data.HellowinsResponseData handlerData;
	 protected Boolean initialized;
	 protected de.hellowins.LogData logData;
	 java.util.List playerData;
	 /* .annotation system Ldalvik/annotation/Signature; */
	 /* value = { */
	 /* "Ljava/util/List", */
	 /* "<", */
	 /* "Lde/hellowins/DataPlayer;", */
	 /* ">;" */
	 /* } */
} // .end annotation
} // .end field
de.hellowins.thread.TimerThread timerThread;
java.util.Map updateHandler;
/* .annotation system Ldalvik/annotation/Signature; */
/* value = { */
/* "Ljava/util/Map", */
/* "<", */
/* "Ljava/lang/String;", */
/* "Lde/hellowins/HellowinsUpdateHandler;", */
/* ">;" */
/* } */
} // .end annotation
} // .end field
final java.lang.Runnable updateRunnable;
private final android.os.Handler updateViewHandler;
/* # direct methods */
static de.hellowins.Hellowins ( ) {
/* .locals 2 */
/* .prologue */
/* .line 54 */
/* new-instance v0, Ljava/text/SimpleDateFormat; */
final String v1 = "yyyy-MM-dd\'T\'HH:mm:ss.SSS"; // const-string v1, "yyyy-MM-dd\'T\'HH:mm:ss.SSS"
/* invoke-direct {v0, v1}, Ljava/text/SimpleDateFormat;-><init>(Ljava/lang/String;)V */
return;
} // .end method
public de.hellowins.Hellowins ( ) {
/* .locals 1 */
/* .prologue */
/* .line 63 */
/* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
/* .line 43 */
int v0 = 0; // const/4 v0, 0x0
/* iput-boolean v0, p0, Lde/hellowins/Hellowins;->initialized:Z */
/* .line 60 */
/* new-instance v0, Ljava/util/HashMap; */
/* invoke-direct {v0}, Ljava/util/HashMap;-><init>()V */
this.updateHandler = v0;
/* .line 431 */
/* new-instance v0, Ljava/util/ArrayList; */
/* invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V */
this.playerData = v0;
/* .line 432 */
/* new-instance v0, Lde/hellowins/game/data/HellowinsResponseData; */
/* invoke-direct {v0}, Lde/hellowins/game/data/HellowinsResponseData;-><init>()V */
this.handlerData = v0;
/* .line 546 */
/* new-instance v0, Landroid/os/Handler; */
/* invoke-direct {v0}, Landroid/os/Handler;-><init>()V */
this.updateViewHandler = v0;
/* .line 552 */
/* new-instance v0, Lde/hellowins/Hellowins$1; */
/* invoke-direct {v0, p0}, Lde/hellowins/Hellowins$1;-><init>(Lde/hellowins/Hellowins;)V */
this.updateRunnable = v0;
/* .line 567 */
/* new-instance v0, Landroid/os/Handler; */
/* invoke-direct {v0}, Landroid/os/Handler;-><init>()V */
this.closeDialogHandler = v0;
/* .line 573 */
/* new-instance v0, Lde/hellowins/Hellowins$2; */
/* invoke-direct {v0, p0}, Lde/hellowins/Hellowins$2;-><init>(Lde/hellowins/Hellowins;)V */
this.closeDialogRunnable = v0;
/* .line 64 */
/* new-instance v0, Lde/hellowins/HwDataStore; */
/* invoke-direct {v0}, Lde/hellowins/HwDataStore;-><init>()V */
this.dataStore = v0;
/* .line 65 */
/* new-instance v0, Lde/hellowins/thread/TimerThread; */
/* invoke-direct {v0, p0}, Lde/hellowins/thread/TimerThread;-><init>(Lde/hellowins/handler/TimerUpdateHandler;)V */
this.timerThread = v0;
/* .line 66 */
return;
} // .end method
private void closeTimeHandler ( ) {
/* .locals 2 */
/* .prologue */
/* .line 570 */
v0 = this.closeDialogHandler;
v1 = this.closeDialogRunnable;
(( android.os.Handler ) v0 ).post ( v1 ); // invoke-virtual {v0, v1}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z
/* .line 571 */
return;
} // .end method
private void computeGameOver ( ) {
/* .locals 2 */
/* .prologue */
/* .line 525 */
v0 = this.logData;
final String v1 = "compute game over"; // const-string v1, "compute game over"
(( de.hellowins.LogData ) v0 ).addLog ( v1 ); // invoke-virtual {v0, v1}, Lde/hellowins/LogData;->addLog(Ljava/lang/String;)V
/* .line 526 */
v0 = this.timerThread;
(( de.hellowins.thread.TimerThread ) v0 ).stop ( ); // invoke-virtual {v0}, Lde/hellowins/thread/TimerThread;->stop()V
/* .line 527 */
v0 = this.handlerData;
int v1 = 0; // const/4 v1, 0x0
(( de.hellowins.game.data.HellowinsResponseData ) v0 ).setRunning ( v1 ); // invoke-virtual {v0, v1}, Lde/hellowins/game/data/HellowinsResponseData;->setRunning(Z)V
/* .line 528 */
/* invoke-direct {p0}, Lde/hellowins/Hellowins;->closeTimeHandler()V */
/* .line 529 */
return;
} // .end method
public static de.hellowins.HellowinsInterface getInstance ( ) {
/* .locals 1 */
/* .prologue */
/* .line 73 */
v0 = de.hellowins.Hellowins.inst;
/* if-nez v0, :cond_0 */
/* .line 74 */
/* new-instance v0, Lde/hellowins/Hellowins; */
/* invoke-direct {v0}, Lde/hellowins/Hellowins;-><init>()V */
/* .line 76 */
} // :cond_0
v0 = de.hellowins.Hellowins.inst;
} // .end method
private void updateTimeHandler ( ) {
/* .locals 2 */
/* .prologue */
/* .line 549 */
v0 = this.updateViewHandler;
v1 = this.updateRunnable;
(( android.os.Handler ) v0 ).post ( v1 ); // invoke-virtual {v0, v1}, Landroid/os/Handler;->post(Ljava/lang/Runnable;)Z
/* .line 550 */
return;
} // .end method
/* # virtual methods */
public void apiFinishGame ( android.content.Context p0, Integer p1 ) {
/* .locals 4 */
/* .param p1, "context" # Landroid/content/Context; */
/* .param p2, "points" # I */
/* .prologue */
/* .line 243 */
/* iget-boolean v1, p0, Lde/hellowins/Hellowins;->initialized:Z */
/* if-nez v1, :cond_1 */
/* .line 254 */
} // :cond_0
} // :goto_0
return;
/* .line 244 */
} // :cond_1
if ( p1 != null) { // if-eqz p1, :cond_0
/* .line 246 */
int v1 = 0; // const/4 v1, 0x0
/* iput-boolean v1, p0, Lde/hellowins/Hellowins;->initialized:Z */
/* .line 247 */
this.context = p1;
/* .line 249 */
/* new-instance v0, Lde/hellowins/ApiHttpRequest; */
v1 = this.dataStore;
(( de.hellowins.HwDataStore ) v1 ).getSessionCookie ( ); // invoke-virtual {v1}, Lde/hellowins/HwDataStore;->getSessionCookie()Ljava/lang/String;
v2 = this.dataStore;
(( de.hellowins.HwDataStore ) v2 ).getApiUri ( ); // invoke-virtual {v2}, Lde/hellowins/HwDataStore;->getApiUri()Ljava/lang/String;
v3 = this.logData;
/* invoke-direct {v0, v1, v2, v3}, Lde/hellowins/ApiHttpRequest;-><init>(Ljava/lang/String;Ljava/lang/String;Lde/hellowins/LogData;)V */
/* .line 250 */
/* .local v0, "req":Lde/hellowins/ApiHttpRequest; */
v1 = this.dataStore;
(( de.hellowins.HwDataStore ) v1 ).getChallengeId ( ); // invoke-virtual {v1}, Lde/hellowins/HwDataStore;->getChallengeId()Ljava/lang/String;
(( de.hellowins.ApiHttpRequest ) v0 ).doFinishGame ( v1, p0 ); // invoke-virtual {v0, v1, p0}, Lde/hellowins/ApiHttpRequest;->doFinishGame(Ljava/lang/String;Lde/hellowins/ApiHttpRequestHandler;)V
/* .line 253 */
(( de.hellowins.Hellowins ) p0 ).backToHelloinsApp ( ); // invoke-virtual {p0}, Lde/hellowins/Hellowins;->backToHelloinsApp()V
} // .end method
public void apiFinishGame ( android.content.Context p0, Long p1 ) {
/* .locals 4 */
/* .param p1, "context" # Landroid/content/Context; */
/* .param p2, "time" # J */
/* .prologue */
/* .line 262 */
/* iget-boolean v1, p0, Lde/hellowins/Hellowins;->initialized:Z */
/* if-nez v1, :cond_1 */
/* .line 274 */
} // :cond_0
} // :goto_0
return;
/* .line 263 */
} // :cond_1
if ( p1 != null) { // if-eqz p1, :cond_0
/* .line 265 */
int v1 = 0; // const/4 v1, 0x0
/* iput-boolean v1, p0, Lde/hellowins/Hellowins;->initialized:Z */
/* .line 266 */
this.context = p1;
/* .line 268 */
/* new-instance v0, Lde/hellowins/ApiHttpRequest; */
v1 = this.dataStore;
(( de.hellowins.HwDataStore ) v1 ).getSessionCookie ( ); // invoke-virtual {v1}, Lde/hellowins/HwDataStore;->getSessionCookie()Ljava/lang/String;
v2 = this.dataStore;
(( de.hellowins.HwDataStore ) v2 ).getApiUri ( ); // invoke-virtual {v2}, Lde/hellowins/HwDataStore;->getApiUri()Ljava/lang/String;
v3 = this.logData;
/* invoke-direct {v0, v1, v2, v3}, Lde/hellowins/ApiHttpRequest;-><init>(Ljava/lang/String;Ljava/lang/String;Lde/hellowins/LogData;)V */
/* .line 269 */
/* .local v0, "req":Lde/hellowins/ApiHttpRequest; */
v1 = this.dataStore;
(( de.hellowins.HwDataStore ) v1 ).getChallengeId ( ); // invoke-virtual {v1}, Lde/hellowins/HwDataStore;->getChallengeId()Ljava/lang/String;
(( de.hellowins.ApiHttpRequest ) v0 ).doFinishGame ( v1, p0 ); // invoke-virtual {v0, v1, p0}, Lde/hellowins/ApiHttpRequest;->doFinishGame(Ljava/lang/String;Lde/hellowins/ApiHttpRequestHandler;)V
/* .line 273 */
(( de.hellowins.Hellowins ) p0 ).backToHelloinsApp ( ); // invoke-virtual {p0}, Lde/hellowins/Hellowins;->backToHelloinsApp()V
} // .end method
public void apiStartGame ( ) {
/* .locals 4 */
/* .prologue */
/* .line 186 */
/* iget-boolean v1, p0, Lde/hellowins/Hellowins;->initialized:Z */
/* if-nez v1, :cond_0 */
/* .line 189 */
} // :goto_0
return;
/* .line 187 */
} // :cond_0
/* new-instance v0, Lde/hellowins/ApiHttpRequest; */
v1 = this.dataStore;
(( de.hellowins.HwDataStore ) v1 ).getSessionCookie ( ); // invoke-virtual {v1}, Lde/hellowins/HwDataStore;->getSessionCookie()Ljava/lang/String;
v2 = this.dataStore;
(( de.hellowins.HwDataStore ) v2 ).getApiUri ( ); // invoke-virtual {v2}, Lde/hellowins/HwDataStore;->getApiUri()Ljava/lang/String;
v3 = this.logData;
/* invoke-direct {v0, v1, v2, v3}, Lde/hellowins/ApiHttpRequest;-><init>(Ljava/lang/String;Ljava/lang/String;Lde/hellowins/LogData;)V */
/* .line 188 */
/* .local v0, "req":Lde/hellowins/ApiHttpRequest; */
v1 = this.dataStore;
(( de.hellowins.HwDataStore ) v1 ).getChallengeId ( ); // invoke-virtual {v1}, Lde/hellowins/HwDataStore;->getChallengeId()Ljava/lang/String;
(( de.hellowins.ApiHttpRequest ) v0 ).doStartGame ( v1, p0 ); // invoke-virtual {v0, v1, p0}, Lde/hellowins/ApiHttpRequest;->doStartGame(Ljava/lang/String;Lde/hellowins/ApiHttpRequestHandler;)V
} // .end method
public void apiUpdatePoints ( Integer p0 ) {
/* .locals 9 */
/* .param p1, "points" # I */
/* .prologue */
/* .line 195 */
/* iget-boolean v7, p0, Lde/hellowins/Hellowins;->initialized:Z */
/* if-nez v7, :cond_0 */
/* .line 223 */
} // :goto_0
return;
/* .line 202 */
} // :cond_0
try { // :try_start_0
/* new-instance v7, Ljava/lang/StringBuilder; */
final String v8 = "{\"challenge\":\""; // const-string v8, "{\"challenge\":\""
/* invoke-direct {v7, v8}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V */
v8 = this.dataStore;
(( de.hellowins.HwDataStore ) v8 ).getChallengeId ( ); // invoke-virtual {v8}, Lde/hellowins/HwDataStore;->getChallengeId()Ljava/lang/String;
(( java.lang.StringBuilder ) v7 ).append ( v8 ); // invoke-virtual {v7, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
final String v8 = "\", \"score\":"; // const-string v8, "\", \"score\":"
(( java.lang.StringBuilder ) v7 ).append ( v8 ); // invoke-virtual {v7, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v7 ).append ( p1 ); // invoke-virtual {v7, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;
final String v8 = "}"; // const-string v8, "}"
(( java.lang.StringBuilder ) v7 ).append ( v8 ); // invoke-virtual {v7, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v7 ).toString ( ); // invoke-virtual {v7}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
/* .line 203 */
/* .local v1, "dataString":Ljava/lang/String; */
v7 = this.dataStore;
(( de.hellowins.HwDataStore ) v7 ).getEncKey ( ); // invoke-virtual {v7}, Lde/hellowins/HwDataStore;->getEncKey()Ljava/lang/String;
/* .line 204 */
/* .local v5, "key":Ljava/lang/String; */
de.hellowins.UtilsCrypt .encrypt ( v1,v5 );
/* .line 207 */
/* .local v0, "data":[B */
org.apache.commons.codec.binary.Base64 .encodeBase64 ( v0 );
/* .line 208 */
/* .local v2, "db":[B */
(( de.hellowins.Hellowins ) p0 ).byteToString ( v2 ); // invoke-virtual {p0, v2}, Lde/hellowins/Hellowins;->byteToString([B)Ljava/lang/String;
/* .line 211 */
/* .local v3, "dt":Ljava/lang/String; */
/* new-instance v6, Lorg/json/JSONObject; */
/* invoke-direct {v6}, Lorg/json/JSONObject;-><init>()V */
/* .line 212 */
/* .local v6, "obj":Lorg/json/JSONObject; */
final String v7 = "action"; // const-string v7, "action"
final String v8 = "highscore"; // const-string v8, "highscore"
(( org.json.JSONObject ) v6 ).put ( v7, v8 ); // invoke-virtual {v6, v7, v8}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;
/* .line 213 */
final String v7 = "data"; // const-string v7, "data"
(( org.json.JSONObject ) v6 ).put ( v7, v3 ); // invoke-virtual {v6, v7, v3}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;
/* .line 215 */
v7 = this.apiWebSocket;
(( org.json.JSONObject ) v6 ).toString ( ); // invoke-virtual {v6}, Lorg/json/JSONObject;->toString()Ljava/lang/String;
(( de.hellowins.ApiWebSocket ) v7 ).sendPoints ( v8 ); // invoke-virtual {v7, v8}, Lde/hellowins/ApiWebSocket;->sendPoints(Ljava/lang/String;)V
/* .line 217 */
v7 = this.handlerData;
(( de.hellowins.game.data.HellowinsResponseData ) v7 ).setHighscore ( p1 ); // invoke-virtual {v7, p1}, Lde/hellowins/game/data/HellowinsResponseData;->setHighscore(I)V
/* :try_end_0 */
/* .catch Ljava/lang/Exception; {:try_start_0 ..:try_end_0} :catch_0 */
/* .line 218 */
} // .end local v0 # "data":[B
} // .end local v1 # "dataString":Ljava/lang/String;
} // .end local v2 # "db":[B
} // .end local v3 # "dt":Ljava/lang/String;
} // .end local v5 # "key":Ljava/lang/String;
} // .end local v6 # "obj":Lorg/json/JSONObject;
/* :catch_0 */
/* move-exception v4 */
/* .line 219 */
/* .local v4, "e":Ljava/lang/Exception; */
v7 = this.logData;
(( de.hellowins.LogData ) v7 ).logException ( v4 ); // invoke-virtual {v7, v4}, Lde/hellowins/LogData;->logException(Ljava/lang/Exception;)V
} // .end method
public void backToHelloinsApp ( ) {
/* .locals 7 */
/* .prologue */
/* .line 588 */
v4 = this.apiWebSocket;
(( de.hellowins.ApiWebSocket ) v4 ).close ( ); // invoke-virtual {v4}, Lde/hellowins/ApiWebSocket;->close()V
/* .line 590 */
/* new-instance v1, Landroid/os/Bundle; */
/* invoke-direct {v1}, Landroid/os/Bundle;-><init>()V */
/* .line 591 */
/* .local v1, "bundle":Landroid/os/Bundle; */
final String v4 = "hellowins_accesstoken"; // const-string v4, "hellowins_accesstoken"
v5 = this.apiAccessObject;
(( org.json.JSONObject ) v5 ).toString ( ); // invoke-virtual {v5}, Lorg/json/JSONObject;->toString()Ljava/lang/String;
(( android.os.Bundle ) v1 ).putString ( v4, v5 ); // invoke-virtual {v1, v4, v5}, Landroid/os/Bundle;->putString(Ljava/lang/String;Ljava/lang/String;)V
/* .line 593 */
/* new-instance v3, Landroid/content/Intent; */
/* invoke-direct {v3}, Landroid/content/Intent;-><init>()V */
/* .line 594 */
/* .local v3, "intent":Landroid/content/Intent; */
(( android.content.Intent ) v3 ).putExtras ( v1 ); // invoke-virtual {v3, v1}, Landroid/content/Intent;->putExtras(Landroid/os/Bundle;)Landroid/content/Intent;
/* .line 596 */
(( de.hellowins.Hellowins ) p0 ).checkInstalledApps ( ); // invoke-virtual {p0}, Lde/hellowins/Hellowins;->checkInstalledApps()Ljava/lang/String;
/* .line 597 */
/* .local v0, "app":Ljava/lang/String; */
/* if-nez v0, :cond_0 */
/* .line 605 */
} // :goto_0
return;
/* .line 600 */
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
/* .line 601 */
v4 = this.context;
(( android.content.Context ) v4 ).startActivity ( v3 ); // invoke-virtual {v4, v3}, Landroid/content/Context;->startActivity(Landroid/content/Intent;)V
/* :try_end_0 */
/* .catch Ljava/lang/Exception; {:try_start_0 ..:try_end_0} :catch_0 */
/* .line 602 */
/* :catch_0 */
/* move-exception v2 */
/* .line 603 */
/* .local v2, "e":Ljava/lang/Exception; */
v4 = this.logData;
final String v5 = "Hellowins App not found on System."; // const-string v5, "Hellowins App not found on System."
(( de.hellowins.LogData ) v4 ).addLog ( v5 ); // invoke-virtual {v4, v5}, Lde/hellowins/LogData;->addLog(Ljava/lang/String;)V
} // .end method
java.lang.String byteToString ( Object[] p0 ) {
/* .locals 4 */
/* .param p1, "_bytes" # [B */
/* .prologue */
/* .line 227 */
final String v0 = ""; // const-string v0, ""
/* .line 229 */
/* .local v0, "file_string":Ljava/lang/String; */
int v1 = 0; // const/4 v1, 0x0
/* .local v1, "i":I */
} // :goto_0
/* array-length v2, p1 */
/* if-lt v1, v2, :cond_0 */
/* .line 234 */
/* .line 231 */
} // :cond_0
/* new-instance v2, Ljava/lang/StringBuilder; */
java.lang.String .valueOf ( v0 );
/* invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V */
/* aget-byte v3, p1, v1 */
/* int-to-char v3, v3 */
(( java.lang.StringBuilder ) v2 ).append ( v3 ); // invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v2 ).toString ( ); // invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
/* .line 229 */
/* add-int/lit8 v1, v1, 0x1 */
} // .end method
protected java.lang.String checkInstalledApps ( ) {
/* .locals 6 */
/* .prologue */
/* .line 609 */
try { // :try_start_0
v3 = this.context;
(( android.content.Context ) v3 ).getPackageManager ( ); // invoke-virtual {v3}, Landroid/content/Context;->getPackageManager()Landroid/content/pm/PackageManager;
int v4 = 0; // const/4 v4, 0x0
(( android.content.pm.PackageManager ) v3 ).getInstalledPackages ( v4 ); // invoke-virtual {v3, v4}, Landroid/content/pm/PackageManager;->getInstalledPackages(I)Ljava/util/List;
/* .line 610 */
/* .local v2, "packages":Ljava/util/List;, "Ljava/util/List<Landroid/content/pm/PackageInfo;>;" */
v4 = } // :cond_0
/* if-nez v4, :cond_1 */
/* .line 617 */
v3 = this.logData;
final String v4 = "could not find AppLauncher or Hellowins"; // const-string v4, "could not find AppLauncher or Hellowins"
(( de.hellowins.LogData ) v3 ).addLog ( v4 ); // invoke-virtual {v3, v4}, Lde/hellowins/LogData;->addLog(Ljava/lang/String;)V
/* .line 621 */
} // .end local v2 # "packages":Ljava/util/List;, "Ljava/util/List<Landroid/content/pm/PackageInfo;>;"
} // :goto_0
int v3 = 0; // const/4 v3, 0x0
} // :goto_1
/* .line 610 */
/* .restart local v2 # "packages":Ljava/util/List;, "Ljava/util/List<Landroid/content/pm/PackageInfo;>;" */
} // :cond_1
/* check-cast v1, Landroid/content/pm/PackageInfo; */
/* .line 612 */
/* .local v1, "pack":Landroid/content/pm/PackageInfo; */
v4 = this.packageName;
final String v5 = "de.hellowins"; // const-string v5, "de.hellowins"
v4 = (( java.lang.String ) v4 ).equals ( v5 ); // invoke-virtual {v4, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
/* if-nez v4, :cond_2 */
v4 = this.packageName;
final String v5 = "de.hellowins.applauncher"; // const-string v5, "de.hellowins.applauncher"
v4 = (( java.lang.String ) v4 ).equals ( v5 ); // invoke-virtual {v4, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
if ( v4 != null) { // if-eqz v4, :cond_0
/* .line 613 */
} // :cond_2
v3 = this.packageName;
/* :try_end_0 */
/* .catch Ljava/lang/Exception; {:try_start_0 ..:try_end_0} :catch_0 */
/* .line 618 */
} // .end local v1 # "pack":Landroid/content/pm/PackageInfo;
} // .end local v2 # "packages":Ljava/util/List;, "Ljava/util/List<Landroid/content/pm/PackageInfo;>;"
/* :catch_0 */
/* move-exception v0 */
/* .line 619 */
/* .local v0, "e":Ljava/lang/Exception; */
v3 = this.logData;
(( de.hellowins.LogData ) v3 ).logException ( v0 ); // invoke-virtual {v3, v0}, Lde/hellowins/LogData;->logException(Ljava/lang/Exception;)V
} // .end method
public void clearLog ( ) {
/* .locals 1 */
/* .prologue */
/* .line 289 */
v0 = this.logData;
if ( v0 != null) { // if-eqz v0, :cond_0
/* .line 290 */
v0 = this.logData;
(( de.hellowins.LogData ) v0 ).clear ( ); // invoke-virtual {v0}, Lde/hellowins/LogData;->clear()V
/* .line 291 */
} // :cond_0
return;
} // .end method
protected void computeHighscore ( org.json.JSONObject p0 ) {
/* .locals 11 */
/* .param p1, "obj" # Lorg/json/JSONObject; */
/* .prologue */
/* .line 436 */
try { // :try_start_0
final String v8 = "playerId"; // const-string v8, "playerId"
(( org.json.JSONObject ) p1 ).getString ( v8 ); // invoke-virtual {p1, v8}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;
/* .line 437 */
/* .local v5, "player":Ljava/lang/String; */
final String v8 = "score"; // const-string v8, "score"
v7 = (( org.json.JSONObject ) p1 ).getInt ( v8 ); // invoke-virtual {p1, v8}, Lorg/json/JSONObject;->getInt(Ljava/lang/String;)I
/* .line 441 */
/* .local v7, "score":I */
int v2 = 0; // const/4 v2, 0x0
/* .line 442 */
/* .local v2, "found":Z */
int v3 = 0; // const/4 v3, 0x0
/* .local v3, "i":I */
} // :goto_0
v8 = v8 = this.playerData;
/* if-lt v3, v8, :cond_2 */
/* .line 451 */
} // :goto_1
/* if-nez v2, :cond_0 */
/* .line 452 */
/* new-instance v4, Lde/hellowins/DataPlayer; */
/* invoke-direct {v4}, Lde/hellowins/DataPlayer;-><init>()V */
/* .line 453 */
/* .local v4, "pd":Lde/hellowins/DataPlayer; */
this.playerId = v5;
/* .line 454 */
/* iput v7, v4, Lde/hellowins/DataPlayer;->score:I */
/* .line 455 */
v8 = this.playerData;
/* .line 458 */
} // .end local v4 # "pd":Lde/hellowins/DataPlayer;
} // :cond_0
v8 = this.playerData;
java.util.Collections .sort ( v8 );
/* .line 460 */
int v6 = 0; // const/4 v6, 0x0
/* .line 462 */
/* .local v6, "pos":I */
int v3 = 0; // const/4 v3, 0x0
} // :goto_2
v8 = v8 = this.playerData;
/* if-lt v3, v8, :cond_4 */
/* .line 469 */
} // :goto_3
/* add-int/lit8 v6, v6, 0x1 */
/* .line 471 */
v8 = this.handlerData;
(( de.hellowins.game.data.HellowinsResponseData ) v8 ).getUser ( ); // invoke-virtual {v8}, Lde/hellowins/game/data/HellowinsResponseData;->getUser()Lde/hellowins/game/data/HellowinsUserData;
/* new-instance v9, Ljava/lang/StringBuilder; */
java.lang.String .valueOf ( v6 );
/* invoke-direct {v9, v10}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V */
final String v10 = " / "; // const-string v10, " / "
(( java.lang.StringBuilder ) v9 ).append ( v10 ); // invoke-virtual {v9, v10}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
v10 = v10 = this.playerData;
(( java.lang.StringBuilder ) v9 ).append ( v10 ); // invoke-virtual {v9, v10}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v9 ).toString ( ); // invoke-virtual {v9}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
this.rank = v9;
/* .line 473 */
v8 = v8 = this.playerData;
/* if-lez v8, :cond_1 */
/* .line 474 */
v8 = this.playerData;
int v9 = 0; // const/4 v9, 0x0
/* check-cast v0, Lde/hellowins/DataPlayer; */
/* .line 475 */
/* .local v0, "d":Lde/hellowins/DataPlayer; */
v8 = this.dataStore;
/* iget v9, v0, Lde/hellowins/DataPlayer;->score:I */
(( de.hellowins.HwDataStore ) v8 ).setHighscore ( v9 ); // invoke-virtual {v8, v9}, Lde/hellowins/HwDataStore;->setHighscore(I)V
/* .line 478 */
} // .end local v0 # "d":Lde/hellowins/DataPlayer;
} // :cond_1
/* invoke-direct {p0}, Lde/hellowins/Hellowins;->updateTimeHandler()V */
/* .line 484 */
} // .end local v2 # "found":Z
} // .end local v3 # "i":I
} // .end local v5 # "player":Ljava/lang/String;
} // .end local v6 # "pos":I
} // .end local v7 # "score":I
} // :goto_4
return;
/* .line 443 */
/* .restart local v2 # "found":Z */
/* .restart local v3 # "i":I */
/* .restart local v5 # "player":Ljava/lang/String; */
/* .restart local v7 # "score":I */
} // :cond_2
v8 = this.playerData;
/* check-cast v0, Lde/hellowins/DataPlayer; */
/* .line 444 */
/* .restart local v0 # "d":Lde/hellowins/DataPlayer; */
v8 = this.playerId;
v8 = (( java.lang.String ) v8 ).equals ( v5 ); // invoke-virtual {v8, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
if ( v8 != null) { // if-eqz v8, :cond_3
/* .line 445 */
/* iput v7, v0, Lde/hellowins/DataPlayer;->score:I */
/* .line 446 */
int v2 = 1; // const/4 v2, 0x1
/* .line 447 */
/* .line 442 */
} // :cond_3
/* add-int/lit8 v3, v3, 0x1 */
/* .line 463 */
} // .end local v0 # "d":Lde/hellowins/DataPlayer;
/* .restart local v6 # "pos":I */
} // :cond_4
v8 = this.playerData;
/* check-cast v0, Lde/hellowins/DataPlayer; */
/* .line 464 */
/* .restart local v0 # "d":Lde/hellowins/DataPlayer; */
v8 = this.playerId;
v9 = this.dataStore;
(( de.hellowins.HwDataStore ) v9 ).getPlayerId ( ); // invoke-virtual {v9}, Lde/hellowins/HwDataStore;->getPlayerId()Ljava/lang/String;
(( java.lang.String ) v8 ).equals ( v9 ); // invoke-virtual {v8, v9}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
/* :try_end_0 */
v8 = /* .catch Lorg/json/JSONException; {:try_start_0 ..:try_end_0} :catch_0 */
if ( v8 != null) { // if-eqz v8, :cond_5
/* .line 465 */
/* move v6, v3 */
/* .line 466 */
/* .line 462 */
} // :cond_5
/* add-int/lit8 v3, v3, 0x1 */
/* .line 480 */
} // .end local v0 # "d":Lde/hellowins/DataPlayer;
} // .end local v2 # "found":Z
} // .end local v3 # "i":I
} // .end local v5 # "player":Ljava/lang/String;
} // .end local v6 # "pos":I
} // .end local v7 # "score":I
/* :catch_0 */
/* move-exception v1 */
/* .line 481 */
/* .local v1, "e":Lorg/json/JSONException; */
final String v8 = "HEllowins"; // const-string v8, "HEllowins"
(( org.json.JSONException ) v1 ).getMessage ( ); // invoke-virtual {v1}, Lorg/json/JSONException;->getMessage()Ljava/lang/String;
android.util.Log .d ( v8,v9 );
} // .end method
protected void computeStarted ( org.json.JSONObject p0 ) {
/* .locals 11 */
/* .param p1, "data" # Lorg/json/JSONObject; */
/* .prologue */
/* .line 492 */
try { // :try_start_0
final String v7 = "serverTime"; // const-string v7, "serverTime"
(( org.json.JSONObject ) p1 ).optString ( v7 ); // invoke-virtual {p1, v7}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;
/* .line 493 */
/* .local v5, "serverTime":Ljava/lang/String; */
v7 = (( java.lang.String ) v5 ).length ( ); // invoke-virtual {v5}, Ljava/lang/String;->length()I
/* if-nez v7, :cond_0 */
/* .line 494 */
final String v7 = "createdAt"; // const-string v7, "createdAt"
(( org.json.JSONObject ) p1 ).optString ( v7 ); // invoke-virtual {p1, v7}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;
/* .line 496 */
} // :cond_0
int v7 = 0; // const/4 v7, 0x0
final String v8 = "+"; // const-string v8, "+"
v8 = (( java.lang.String ) v5 ).indexOf ( v8 ); // invoke-virtual {v5, v8}, Ljava/lang/String;->indexOf(Ljava/lang/String;)I
(( java.lang.String ) v5 ).substring ( v7, v8 ); // invoke-virtual {v5, v7, v8}, Ljava/lang/String;->substring(II)Ljava/lang/String;
/* .line 498 */
final String v7 = ""; // const-string v7, ""
v7 = (( java.lang.String ) v5 ).equals ( v7 ); // invoke-virtual {v5, v7}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
if ( v7 != null) { // if-eqz v7, :cond_1
/* .line 520 */
} // .end local v5 # "serverTime":Ljava/lang/String;
} // :goto_0
return;
/* .line 500 */
/* .restart local v5 # "serverTime":Ljava/lang/String; */
} // :cond_1
final String v7 = "data"; // const-string v7, "data"
(( org.json.JSONObject ) p1 ).getJSONObject ( v7 ); // invoke-virtual {p1, v7}, Lorg/json/JSONObject;->getJSONObject(Ljava/lang/String;)Lorg/json/JSONObject;
/* .line 502 */
/* .local v2, "data1":Lorg/json/JSONObject; */
final String v7 = "timelimit"; // const-string v7, "timelimit"
(( org.json.JSONObject ) v2 ).getString ( v7 ); // invoke-virtual {v2, v7}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;
/* .line 503 */
/* .local v6, "stopAt":Ljava/lang/String; */
int v7 = 0; // const/4 v7, 0x0
final String v8 = "+"; // const-string v8, "+"
v8 = (( java.lang.String ) v6 ).indexOf ( v8 ); // invoke-virtual {v6, v8}, Ljava/lang/String;->indexOf(Ljava/lang/String;)I
(( java.lang.String ) v6 ).substring ( v7, v8 ); // invoke-virtual {v6, v7, v8}, Ljava/lang/String;->substring(II)Ljava/lang/String;
/* .line 505 */
v7 = de.hellowins.Hellowins.sDateFormat;
(( java.text.SimpleDateFormat ) v7 ).parse ( v5 ); // invoke-virtual {v7, v5}, Ljava/text/SimpleDateFormat;->parse(Ljava/lang/String;)Ljava/util/Date;
/* .line 507 */
/* .local v0, "d1":Ljava/util/Date; */
v7 = de.hellowins.Hellowins.sDateFormat;
(( java.text.SimpleDateFormat ) v7 ).parse ( v6 ); // invoke-virtual {v7, v6}, Ljava/text/SimpleDateFormat;->parse(Ljava/lang/String;)Ljava/util/Date;
/* .line 509 */
/* .local v1, "d2":Ljava/util/Date; */
(( java.util.Date ) v1 ).getTime ( ); // invoke-virtual {v1}, Ljava/util/Date;->getTime()J
/* move-result-wide v7 */
(( java.util.Date ) v0 ).getTime ( ); // invoke-virtual {v0}, Ljava/util/Date;->getTime()J
/* move-result-wide v9 */
/* sub-long/2addr v7, v9 */
java.lang.Long .valueOf ( v7,v8 );
/* .line 511 */
/* .local v3, "dif":Ljava/lang/Long; */
(( java.lang.Long ) v3 ).longValue ( ); // invoke-virtual {v3}, Ljava/lang/Long;->longValue()J
/* move-result-wide v7 */
/* const-wide/16 v9, 0x0 */
/* cmp-long v7, v7, v9 */
/* if-lez v7, :cond_2 */
/* .line 512 */
v7 = this.handlerData;
(( de.hellowins.game.data.HellowinsResponseData ) v7 ).getUser ( ); // invoke-virtual {v7}, Lde/hellowins/game/data/HellowinsResponseData;->getUser()Lde/hellowins/game/data/HellowinsUserData;
(( java.lang.Long ) v3 ).longValue ( ); // invoke-virtual {v3}, Ljava/lang/Long;->longValue()J
/* move-result-wide v8 */
(( de.hellowins.game.data.HellowinsUserData ) v7 ).setPlayTime ( v8, v9 ); // invoke-virtual {v7, v8, v9}, Lde/hellowins/game/data/HellowinsUserData;->setPlayTime(J)V
/* .line 515 */
} // :cond_2
/* invoke-direct {p0}, Lde/hellowins/Hellowins;->updateTimeHandler()V */
/* :try_end_0 */
/* .catch Ljava/lang/Exception; {:try_start_0 ..:try_end_0} :catch_0 */
/* .line 517 */
} // .end local v0 # "d1":Ljava/util/Date;
} // .end local v1 # "d2":Ljava/util/Date;
} // .end local v2 # "data1":Lorg/json/JSONObject;
} // .end local v3 # "dif":Ljava/lang/Long;
} // .end local v5 # "serverTime":Ljava/lang/String;
} // .end local v6 # "stopAt":Ljava/lang/String;
/* :catch_0 */
/* move-exception v4 */
/* .line 518 */
/* .local v4, "e":Ljava/lang/Exception; */
(( java.lang.Exception ) v4 ).printStackTrace ( ); // invoke-virtual {v4}, Ljava/lang/Exception;->printStackTrace()V
} // .end method
public void computeUrl ( java.lang.String p0 ) {
/* .locals 6 */
/* .param p1, "url" # Ljava/lang/String; */
/* .prologue */
/* .line 162 */
/* iget-boolean v3, p0, Lde/hellowins/Hellowins;->initialized:Z */
/* if-nez v3, :cond_1 */
/* .line 180 */
} // :cond_0
} // :goto_0
return;
/* .line 166 */
} // :cond_1
final String v3 = "http://hellowins_start"; // const-string v3, "http://hellowins_start"
v3 = (( java.lang.String ) p1 ).contains ( v3 ); // invoke-virtual {p1, v3}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z
if ( v3 != null) { // if-eqz v3, :cond_2
/* .line 167 */
/* new-instance v1, Lde/hellowins/ApiHttpRequest; */
v3 = this.dataStore;
(( de.hellowins.HwDataStore ) v3 ).getSessionCookie ( ); // invoke-virtual {v3}, Lde/hellowins/HwDataStore;->getSessionCookie()Ljava/lang/String;
v4 = this.dataStore;
(( de.hellowins.HwDataStore ) v4 ).getApiUri ( ); // invoke-virtual {v4}, Lde/hellowins/HwDataStore;->getApiUri()Ljava/lang/String;
v5 = this.logData;
/* invoke-direct {v1, v3, v4, v5}, Lde/hellowins/ApiHttpRequest;-><init>(Ljava/lang/String;Ljava/lang/String;Lde/hellowins/LogData;)V */
/* .line 168 */
/* .local v1, "req":Lde/hellowins/ApiHttpRequest; */
v3 = this.dataStore;
(( de.hellowins.HwDataStore ) v3 ).getChallengeId ( ); // invoke-virtual {v3}, Lde/hellowins/HwDataStore;->getChallengeId()Ljava/lang/String;
(( de.hellowins.ApiHttpRequest ) v1 ).doStartGame ( v3, p0 ); // invoke-virtual {v1, v3, p0}, Lde/hellowins/ApiHttpRequest;->doStartGame(Ljava/lang/String;Lde/hellowins/ApiHttpRequestHandler;)V
/* .line 169 */
} // .end local v1 # "req":Lde/hellowins/ApiHttpRequest;
} // :cond_2
final String v3 = "http://hellowins_score"; // const-string v3, "http://hellowins_score"
v3 = (( java.lang.String ) p1 ).contains ( v3 ); // invoke-virtual {p1, v3}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z
if ( v3 != null) { // if-eqz v3, :cond_3
/* .line 170 */
final String v3 = "/"; // const-string v3, "/"
final String v4 = ""; // const-string v4, ""
(( java.lang.String ) p1 ).replaceAll ( v3, v4 ); // invoke-virtual {p1, v3, v4}, Ljava/lang/String;->replaceAll(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
/* .line 171 */
final String v3 = ":"; // const-string v3, ":"
(( java.lang.String ) p1 ).split ( v3 ); // invoke-virtual {p1, v3}, Ljava/lang/String;->split(Ljava/lang/String;)[Ljava/lang/String;
/* .line 172 */
/* .local v2, "urlToken":[Ljava/lang/String; */
/* array-length v3, v2 */
int v4 = 1; // const/4 v4, 0x1
/* if-le v3, v4, :cond_0 */
/* .line 174 */
int v3 = 2; // const/4 v3, 0x2
/* aget-object v3, v2, v3 */
v0 = java.lang.Integer .parseInt ( v3 );
/* .line 175 */
/* .local v0, "pointToken":I */
(( de.hellowins.Hellowins ) p0 ).apiUpdatePoints ( v0 ); // invoke-virtual {p0, v0}, Lde/hellowins/Hellowins;->apiUpdatePoints(I)V
/* .line 177 */
} // .end local v0 # "pointToken":I
} // .end local v2 # "urlToken":[Ljava/lang/String;
} // :cond_3
final String v3 = "http://hellowins_finish"; // const-string v3, "http://hellowins_finish"
v3 = (( java.lang.String ) p1 ).contains ( v3 ); // invoke-virtual {p1, v3}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z
if ( v3 != null) { // if-eqz v3, :cond_0
/* .line 178 */
v3 = this.context;
int v4 = 0; // const/4 v4, 0x0
(( de.hellowins.Hellowins ) p0 ).apiFinishGame ( v3, v4 ); // invoke-virtual {p0, v3, v4}, Lde/hellowins/Hellowins;->apiFinishGame(Landroid/content/Context;I)V
} // .end method
protected void dispatchUserUpdate ( ) {
/* .locals 5 */
/* .prologue */
/* .line 536 */
v4 = this.updateHandler;
/* .line 537 */
/* .local v0, "hs":Ljava/util/Set;, "Ljava/util/Set<Ljava/lang/String;>;" */
/* .line 539 */
/* .local v1, "it":Ljava/util/Iterator;, "Ljava/util/Iterator<Ljava/lang/String;>;" */
v4 = } // :goto_0
/* if-nez v4, :cond_0 */
/* .line 544 */
return;
/* .line 540 */
} // :cond_0
/* check-cast v2, Ljava/lang/String; */
/* .line 541 */
/* .local v2, "key":Ljava/lang/String; */
v4 = this.updateHandler;
/* check-cast v3, Lde/hellowins/HellowinsUpdateHandler; */
/* .line 542 */
/* .local v3, "uh":Lde/hellowins/HellowinsUpdateHandler; */
v4 = this.handlerData;
} // .end method
public Integer getHighscore ( ) {
/* .locals 1 */
/* .prologue */
/* .line 667 */
v0 = this.dataStore;
v0 = (( de.hellowins.HwDataStore ) v0 ).getHighscore ( ); // invoke-virtual {v0}, Lde/hellowins/HwDataStore;->getHighscore()I
} // .end method
public Integer getLevel ( ) {
/* .locals 1 */
/* .prologue */
/* .line 300 */
v0 = this.dataStore;
v0 = (( de.hellowins.HwDataStore ) v0 ).getLevel ( ); // invoke-virtual {v0}, Lde/hellowins/HwDataStore;->getLevel()I
} // .end method
public java.lang.String getLog ( ) {
/* .locals 1 */
/* .prologue */
/* .line 280 */
v0 = this.logData;
/* if-nez v0, :cond_0 */
final String v0 = "null log"; // const-string v0, "null log"
/* .line 282 */
} // :goto_0
} // :cond_0
v0 = this.logData;
(( de.hellowins.LogData ) v0 ).getLog ( ); // invoke-virtual {v0}, Lde/hellowins/LogData;->getLog()Ljava/lang/String;
} // .end method
public java.lang.String getRanking ( ) {
/* .locals 1 */
/* .prologue */
/* .line 656 */
v0 = this.handlerData;
(( de.hellowins.game.data.HellowinsResponseData ) v0 ).getUser ( ); // invoke-virtual {v0}, Lde/hellowins/game/data/HellowinsResponseData;->getUser()Lde/hellowins/game/data/HellowinsUserData;
v0 = this.rank;
} // .end method
public Integer getRemainingPercent ( ) {
/* .locals 1 */
/* .prologue */
/* .line 677 */
v0 = this.handlerData;
v0 = (( de.hellowins.game.data.HellowinsResponseData ) v0 ).getRemainingPercent ( ); // invoke-virtual {v0}, Lde/hellowins/game/data/HellowinsResponseData;->getRemainingPercent()I
} // .end method
public java.lang.String getRemainingTime ( ) {
/* .locals 1 */
/* .prologue */
/* .line 651 */
v0 = this.handlerData;
(( de.hellowins.game.data.HellowinsResponseData ) v0 ).getUser ( ); // invoke-virtual {v0}, Lde/hellowins/game/data/HellowinsResponseData;->getUser()Lde/hellowins/game/data/HellowinsUserData;
v0 = this.time;
} // .end method
public java.lang.String getVersion ( ) {
/* .locals 1 */
/* .prologue */
/* .line 672 */
v0 = de.hellowins.HwConstants.apiVersion;
} // .end method
public Boolean init ( android.app.Activity p0 ) {
/* .locals 1 */
/* .param p1, "activity" # Landroid/app/Activity; */
/* .prologue */
/* .line 87 */
int v0 = 0; // const/4 v0, 0x0
v0 = (( de.hellowins.Hellowins ) p0 ).init ( p1, v0 ); // invoke-virtual {p0, p1, v0}, Lde/hellowins/Hellowins;->init(Landroid/app/Activity;Z)Z
} // .end method
public Boolean init ( android.app.Activity p0, Boolean p1 ) {
/* .locals 8 */
/* .param p1, "activity" # Landroid/app/Activity; */
/* .param p2, "log" # Z */
/* .prologue */
/* .line 102 */
/* new-instance v5, Lde/hellowins/LogData; */
/* invoke-direct {v5, p2}, Lde/hellowins/LogData;-><init>(Z)V */
this.logData = v5;
/* .line 103 */
v5 = this.logData;
final String v6 = "Hellowins INIT"; // const-string v6, "Hellowins INIT"
(( de.hellowins.LogData ) v5 ).addLog ( v6 ); // invoke-virtual {v5, v6}, Lde/hellowins/LogData;->addLog(Ljava/lang/String;)V
/* .line 104 */
this.context = p1;
/* .line 106 */
/* if-nez p1, :cond_0 */
/* .line 107 */
v5 = this.logData;
final String v6 = "Activity null"; // const-string v6, "Activity null"
(( de.hellowins.LogData ) v5 ).addLog ( v6 ); // invoke-virtual {v5, v6}, Lde/hellowins/LogData;->addLog(Ljava/lang/String;)V
/* .line 108 */
/* iget-boolean v5, p0, Lde/hellowins/Hellowins;->initialized:Z */
/* .line 156 */
} // :goto_0
/* .line 111 */
} // :cond_0
(( android.app.Activity ) p1 ).getIntent ( ); // invoke-virtual {p1}, Landroid/app/Activity;->getIntent()Landroid/content/Intent;
(( android.content.Intent ) v5 ).getExtras ( ); // invoke-virtual {v5}, Landroid/content/Intent;->getExtras()Landroid/os/Bundle;
/* .line 114 */
/* .local v1, "bundle":Landroid/os/Bundle; */
/* if-nez v1, :cond_1 */
/* .line 115 */
v5 = this.logData;
final String v6 = "Bundle null"; // const-string v6, "Bundle null"
(( de.hellowins.LogData ) v5 ).addLog ( v6 ); // invoke-virtual {v5, v6}, Lde/hellowins/LogData;->addLog(Ljava/lang/String;)V
/* .line 116 */
/* iget-boolean v5, p0, Lde/hellowins/Hellowins;->initialized:Z */
/* .line 119 */
} // :cond_1
final String v5 = "hellowins_accesstoken"; // const-string v5, "hellowins_accesstoken"
(( android.os.Bundle ) v1 ).getString ( v5 ); // invoke-virtual {v1, v5}, Landroid/os/Bundle;->getString(Ljava/lang/String;)Ljava/lang/String;
/* .line 121 */
/* .local v0, "apiAccessToken":Ljava/lang/String; */
final String v5 = "Game_Hellowins"; // const-string v5, "Game_Hellowins"
/* new-instance v6, Ljava/lang/StringBuilder; */
final String v7 = "init "; // const-string v7, "init "
/* invoke-direct {v6, v7}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V */
(( java.lang.StringBuilder ) v6 ).append ( v0 ); // invoke-virtual {v6, v0}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v6 ).toString ( ); // invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
android.util.Log .d ( v5,v6 );
/* .line 123 */
/* if-nez v0, :cond_2 */
/* .line 124 */
/* iget-boolean v5, p0, Lde/hellowins/Hellowins;->initialized:Z */
/* .line 128 */
} // :cond_2
try { // :try_start_0
v5 = this.logData;
final String v6 = "Init: parse data"; // const-string v6, "Init: parse data"
(( de.hellowins.LogData ) v5 ).addLog ( v6 ); // invoke-virtual {v5, v6}, Lde/hellowins/LogData;->addLog(Ljava/lang/String;)V
/* .line 129 */
/* new-instance v5, Lorg/json/JSONObject; */
/* invoke-direct {v5, v0}, Lorg/json/JSONObject;-><init>(Ljava/lang/String;)V */
this.apiAccessObject = v5;
/* .line 130 */
v5 = this.dataStore;
v6 = this.apiAccessObject;
final String v7 = "challengeId"; // const-string v7, "challengeId"
(( org.json.JSONObject ) v6 ).getString ( v7 ); // invoke-virtual {v6, v7}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;
(( de.hellowins.HwDataStore ) v5 ).setChallengeId ( v6 ); // invoke-virtual {v5, v6}, Lde/hellowins/HwDataStore;->setChallengeId(Ljava/lang/String;)V
/* .line 131 */
v5 = this.dataStore;
v6 = this.apiAccessObject;
final String v7 = "cookie"; // const-string v7, "cookie"
(( org.json.JSONObject ) v6 ).getString ( v7 ); // invoke-virtual {v6, v7}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;
(( de.hellowins.HwDataStore ) v5 ).setSessionCookie ( v6 ); // invoke-virtual {v5, v6}, Lde/hellowins/HwDataStore;->setSessionCookie(Ljava/lang/String;)V
/* .line 132 */
v5 = this.dataStore;
v6 = this.apiAccessObject;
final String v7 = "level"; // const-string v7, "level"
v6 = (( org.json.JSONObject ) v6 ).getInt ( v7 ); // invoke-virtual {v6, v7}, Lorg/json/JSONObject;->getInt(Ljava/lang/String;)I
(( de.hellowins.HwDataStore ) v5 ).setLevel ( v6 ); // invoke-virtual {v5, v6}, Lde/hellowins/HwDataStore;->setLevel(I)V
/* .line 134 */
v5 = this.dataStore;
v6 = this.apiAccessObject;
final String v7 = "key"; // const-string v7, "key"
(( org.json.JSONObject ) v6 ).getString ( v7 ); // invoke-virtual {v6, v7}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;
(( de.hellowins.HwDataStore ) v5 ).setEncKey ( v6 ); // invoke-virtual {v5, v6}, Lde/hellowins/HwDataStore;->setEncKey(Ljava/lang/String;)V
/* .line 136 */
v5 = this.apiAccessObject;
final String v6 = "host"; // const-string v6, "host"
(( org.json.JSONObject ) v5 ).getString ( v6 ); // invoke-virtual {v5, v6}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;
/* .line 138 */
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
/* .line 139 */
v5 = this.dataStore;
/* new-instance v6, Ljava/lang/StringBuilder; */
final String v7 = "ws://"; // const-string v7, "ws://"
/* invoke-direct {v6, v7}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V */
(( java.lang.StringBuilder ) v6 ).append ( v3 ); // invoke-virtual {v6, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
final String v7 = "/"; // const-string v7, "/"
(( java.lang.StringBuilder ) v6 ).append ( v7 ); // invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v6 ).toString ( ); // invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
(( de.hellowins.HwDataStore ) v5 ).setWsUri ( v6 ); // invoke-virtual {v5, v6}, Lde/hellowins/HwDataStore;->setWsUri(Ljava/lang/String;)V
/* .line 141 */
v5 = this.logData;
/* new-instance v6, Ljava/lang/StringBuilder; */
final String v7 = "ApiUri: "; // const-string v7, "ApiUri: "
/* invoke-direct {v6, v7}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V */
v7 = this.dataStore;
(( de.hellowins.HwDataStore ) v7 ).getApiUri ( ); // invoke-virtual {v7}, Lde/hellowins/HwDataStore;->getApiUri()Ljava/lang/String;
(( java.lang.StringBuilder ) v6 ).append ( v7 ); // invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v6 ).toString ( ); // invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
(( de.hellowins.LogData ) v5 ).addLog ( v6 ); // invoke-virtual {v5, v6}, Lde/hellowins/LogData;->addLog(Ljava/lang/String;)V
/* .line 142 */
v5 = this.logData;
/* new-instance v6, Ljava/lang/StringBuilder; */
final String v7 = "WsUri: "; // const-string v7, "WsUri: "
/* invoke-direct {v6, v7}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V */
v7 = this.dataStore;
(( de.hellowins.HwDataStore ) v7 ).getWsUri ( ); // invoke-virtual {v7}, Lde/hellowins/HwDataStore;->getWsUri()Ljava/lang/String;
(( java.lang.StringBuilder ) v6 ).append ( v7 ); // invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v6 ).toString ( ); // invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
(( de.hellowins.LogData ) v5 ).addLog ( v6 ); // invoke-virtual {v5, v6}, Lde/hellowins/LogData;->addLog(Ljava/lang/String;)V
/* .line 143 */
v5 = this.logData;
/* new-instance v6, Ljava/lang/StringBuilder; */
final String v7 = "ChallengeId: "; // const-string v7, "ChallengeId: "
/* invoke-direct {v6, v7}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V */
v7 = this.dataStore;
(( de.hellowins.HwDataStore ) v7 ).getChallengeId ( ); // invoke-virtual {v7}, Lde/hellowins/HwDataStore;->getChallengeId()Ljava/lang/String;
(( java.lang.StringBuilder ) v6 ).append ( v7 ); // invoke-virtual {v6, v7}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v6 ).toString ( ); // invoke-virtual {v6}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
(( de.hellowins.LogData ) v5 ).addLog ( v6 ); // invoke-virtual {v5, v6}, Lde/hellowins/LogData;->addLog(Ljava/lang/String;)V
/* .line 144 */
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
/* .catch Lorg/json/JSONException; {:try_start_0 ..:try_end_0} :catch_0 */
/* .line 151 */
int v5 = 1; // const/4 v5, 0x1
/* iput-boolean v5, p0, Lde/hellowins/Hellowins;->initialized:Z */
/* .line 153 */
/* new-instance v4, Lde/hellowins/ApiHttpRequest; */
v5 = this.dataStore;
(( de.hellowins.HwDataStore ) v5 ).getSessionCookie ( ); // invoke-virtual {v5}, Lde/hellowins/HwDataStore;->getSessionCookie()Ljava/lang/String;
v6 = this.dataStore;
(( de.hellowins.HwDataStore ) v6 ).getApiUri ( ); // invoke-virtual {v6}, Lde/hellowins/HwDataStore;->getApiUri()Ljava/lang/String;
v7 = this.logData;
/* invoke-direct {v4, v5, v6, v7}, Lde/hellowins/ApiHttpRequest;-><init>(Ljava/lang/String;Ljava/lang/String;Lde/hellowins/LogData;)V */
/* .line 154 */
/* .local v4, "req":Lde/hellowins/ApiHttpRequest; */
(( de.hellowins.ApiHttpRequest ) v4 ).doGetUser ( p0 ); // invoke-virtual {v4, p0}, Lde/hellowins/ApiHttpRequest;->doGetUser(Lde/hellowins/ApiHttpRequestHandler;)V
/* .line 156 */
/* iget-boolean v5, p0, Lde/hellowins/Hellowins;->initialized:Z */
/* goto/16 :goto_0 */
/* .line 146 */
} // .end local v3 # "host":Ljava/lang/String;
} // .end local v4 # "req":Lde/hellowins/ApiHttpRequest;
/* :catch_0 */
/* move-exception v2 */
/* .line 147 */
/* .local v2, "e":Lorg/json/JSONException; */
(( org.json.JSONException ) v2 ).printStackTrace ( ); // invoke-virtual {v2}, Lorg/json/JSONException;->printStackTrace()V
/* .line 148 */
/* iget-boolean v5, p0, Lde/hellowins/Hellowins;->initialized:Z */
/* goto/16 :goto_0 */
} // .end method
public Boolean isGameFinished ( ) {
/* .locals 1 */
/* .prologue */
/* .line 640 */
v0 = this.dataStore;
/* iget-boolean v0, v0, Lde/hellowins/HwDataStore;->gameFinished:Z */
} // .end method
public Boolean isGameRunning ( ) {
/* .locals 1 */
/* .prologue */
/* .line 635 */
v0 = this.handlerData;
v0 = (( de.hellowins.game.data.HellowinsResponseData ) v0 ).isGameRunning ( ); // invoke-virtual {v0}, Lde/hellowins/game/data/HellowinsResponseData;->isGameRunning()Z
} // .end method
public Boolean isInitialized ( ) {
/* .locals 1 */
/* .prologue */
/* .line 307 */
/* iget-boolean v0, p0, Lde/hellowins/Hellowins;->initialized:Z */
} // .end method
public void onClose ( ) {
/* .locals 0 */
/* .prologue */
/* .line 629 */
/* invoke-direct {p0}, Lde/hellowins/Hellowins;->computeGameOver()V */
/* .line 630 */
return;
} // .end method
public void onMessage ( de.roderick.weberknecht.WebSocketMessage p0 ) {
/* .locals 9 */
/* .param p1, "message" # Lde/roderick/weberknecht/WebSocketMessage; */
/* .prologue */
/* .line 388 */
/* if-nez p1, :cond_1 */
/* .line 429 */
} // :cond_0
} // :goto_0
return;
/* .line 394 */
} // :cond_1
(( de.roderick.weberknecht.WebSocketMessage ) p1 ).getText ( ); // invoke-virtual {p1}, Lde/roderick/weberknecht/WebSocketMessage;->getText()Ljava/lang/String;
/* .line 395 */
/* .local v6, "text":Ljava/lang/String; */
final String v7 = "challenge/spawned"; // const-string v7, "challenge/spawned"
v7 = (( java.lang.String ) v6 ).contains ( v7 ); // invoke-virtual {v6, v7}, Ljava/lang/String;->contains(Ljava/lang/CharSequence;)Z
/* if-nez v7, :cond_0 */
/* .line 397 */
v7 = this.logData;
(( de.hellowins.LogData ) v7 ).addLog ( v6 ); // invoke-virtual {v7, v6}, Lde/hellowins/LogData;->addLog(Ljava/lang/String;)V
/* .line 402 */
try { // :try_start_0
/* new-instance v5, Lorg/json/JSONObject; */
/* invoke-direct {v5, v6}, Lorg/json/JSONObject;-><init>(Ljava/lang/String;)V */
/* .line 404 */
/* .local v5, "obj":Lorg/json/JSONObject; */
final String v7 = "action"; // const-string v7, "action"
(( org.json.JSONObject ) v5 ).optString ( v7 ); // invoke-virtual {v5, v7}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;
/* .line 406 */
/* .local v1, "action":Ljava/lang/String; */
final String v7 = "action"; // const-string v7, "action"
(( org.json.JSONObject ) v5 ).optJSONObject ( v7 ); // invoke-virtual {v5, v7}, Lorg/json/JSONObject;->optJSONObject(Ljava/lang/String;)Lorg/json/JSONObject;
/* .line 407 */
/* .local v0, "aObject":Lorg/json/JSONObject; */
if ( v0 != null) { // if-eqz v0, :cond_2
/* .line 408 */
final String v7 = "name"; // const-string v7, "name"
(( org.json.JSONObject ) v0 ).getString ( v7 ); // invoke-virtual {v0, v7}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;
/* .line 412 */
} // :cond_2
final String v7 = "Hellowins SDK"; // const-string v7, "Hellowins SDK"
android.util.Log .d ( v7,v1 );
/* .line 414 */
final String v7 = "challenge/highscore"; // const-string v7, "challenge/highscore"
v7 = (( java.lang.String ) v1 ).equals ( v7 ); // invoke-virtual {v1, v7}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
if ( v7 != null) { // if-eqz v7, :cond_3
/* .line 415 */
final String v7 = "data"; // const-string v7, "data"
(( org.json.JSONObject ) v5 ).getJSONObject ( v7 ); // invoke-virtual {v5, v7}, Lorg/json/JSONObject;->getJSONObject(Ljava/lang/String;)Lorg/json/JSONObject;
/* .line 416 */
/* .local v4, "highscore":Lorg/json/JSONObject; */
(( de.hellowins.Hellowins ) p0 ).computeHighscore ( v4 ); // invoke-virtual {p0, v4}, Lde/hellowins/Hellowins;->computeHighscore(Lorg/json/JSONObject;)V
/* :try_end_0 */
/* .catch Lorg/json/JSONException; {:try_start_0 ..:try_end_0} :catch_0 */
/* .line 426 */
} // .end local v0 # "aObject":Lorg/json/JSONObject;
} // .end local v1 # "action":Ljava/lang/String;
} // .end local v4 # "highscore":Lorg/json/JSONObject;
} // .end local v5 # "obj":Lorg/json/JSONObject;
/* :catch_0 */
/* move-exception v3 */
/* .line 427 */
/* .local v3, "e":Lorg/json/JSONException; */
v7 = this.logData;
(( de.hellowins.LogData ) v7 ).logException ( v3 ); // invoke-virtual {v7, v3}, Lde/hellowins/LogData;->logException(Ljava/lang/Exception;)V
/* .line 417 */
} // .end local v3 # "e":Lorg/json/JSONException;
/* .restart local v0 # "aObject":Lorg/json/JSONObject; */
/* .restart local v1 # "action":Ljava/lang/String; */
/* .restart local v5 # "obj":Lorg/json/JSONObject; */
} // :cond_3
try { // :try_start_1
final String v7 = "game/started"; // const-string v7, "game/started"
v7 = (( java.lang.String ) v1 ).equals ( v7 ); // invoke-virtual {v1, v7}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
if ( v7 != null) { // if-eqz v7, :cond_4
/* .line 418 */
/* new-instance v2, Lorg/json/JSONObject; */
/* invoke-direct {v2, v6}, Lorg/json/JSONObject;-><init>(Ljava/lang/String;)V */
/* .line 419 */
/* .local v2, "data":Lorg/json/JSONObject; */
(( de.hellowins.Hellowins ) p0 ).computeStarted ( v2 ); // invoke-virtual {p0, v2}, Lde/hellowins/Hellowins;->computeStarted(Lorg/json/JSONObject;)V
/* .line 420 */
v7 = this.handlerData;
int v8 = 1; // const/4 v8, 0x1
(( de.hellowins.game.data.HellowinsResponseData ) v7 ).setRunning ( v8 ); // invoke-virtual {v7, v8}, Lde/hellowins/game/data/HellowinsResponseData;->setRunning(Z)V
/* .line 421 */
} // .end local v2 # "data":Lorg/json/JSONObject;
} // :cond_4
final String v7 = "game/over"; // const-string v7, "game/over"
v7 = (( java.lang.String ) v1 ).equals ( v7 ); // invoke-virtual {v1, v7}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
if ( v7 != null) { // if-eqz v7, :cond_5
/* .line 422 */
/* invoke-direct {p0}, Lde/hellowins/Hellowins;->computeGameOver()V */
/* .line 423 */
} // :cond_5
final String v7 = "authenticated"; // const-string v7, "authenticated"
v7 = (( java.lang.String ) v1 ).equals ( v7 ); // invoke-virtual {v1, v7}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
if ( v7 != null) { // if-eqz v7, :cond_0
/* .line 424 */
v7 = this.apiWebSocket;
(( de.hellowins.ApiWebSocket ) v7 ).sendListen ( ); // invoke-virtual {v7}, Lde/hellowins/ApiWebSocket;->sendListen()V
/* :try_end_1 */
/* .catch Lorg/json/JSONException; {:try_start_1 ..:try_end_1} :catch_0 */
} // .end method
public void registerUpdateHandler ( de.hellowins.HellowinsUpdateHandler p0 ) {
/* .locals 3 */
/* .param p1, "handler" # Lde/hellowins/HellowinsUpdateHandler; */
/* .prologue */
/* .line 312 */
/* new-instance v1, Ljava/lang/StringBuilder; */
/* invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V */
v2 = (( java.lang.Object ) p1 ).hashCode ( ); // invoke-virtual {p1}, Ljava/lang/Object;->hashCode()I
(( java.lang.StringBuilder ) v1 ).append ( v2 ); // invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v1 ).toString ( ); // invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
/* .line 313 */
/* .local v0, "hc":Ljava/lang/String; */
v1 = v1 = this.updateHandler;
/* if-nez v1, :cond_0 */
/* .line 314 */
v1 = this.updateHandler;
/* .line 316 */
} // :cond_0
return;
} // .end method
public void requestComplete ( java.lang.String p0 ) {
/* .locals 16 */
/* .param p1, "content" # Ljava/lang/String; */
/* .prologue */
/* .line 341 */
v1 = /* invoke-virtual/range {p1 ..p1}, Ljava/lang/String;->length()I */
/* const/16 v2, 0x64 */
/* if-le v1, v2, :cond_1 */
/* const/16 v11, 0x64 */
/* .line 342 */
/* .local v11, "len":I */
} // :goto_0
int v1 = 0; // const/4 v1, 0x0
/* move-object/from16 v0, p1 */
(( java.lang.String ) v0 ).substring ( v1, v11 ); // invoke-virtual {v0, v1, v11}, Ljava/lang/String;->substring(II)Ljava/lang/String;
/* .line 343 */
/* .local v15, "sData":Ljava/lang/String; */
/* move-object/from16 v0, p0 */
v1 = this.logData;
/* new-instance v2, Ljava/lang/StringBuilder; */
final String v3 = "SDK: Request Complete "; // const-string v3, "SDK: Request Complete "
/* invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V */
(( java.lang.StringBuilder ) v2 ).append ( v15 ); // invoke-virtual {v2, v15}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v2 ).toString ( ); // invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
(( de.hellowins.LogData ) v1 ).addLog ( v2 ); // invoke-virtual {v1, v2}, Lde/hellowins/LogData;->addLog(Ljava/lang/String;)V
/* .line 345 */
final String v1 = "SDK: request Complete "; // const-string v1, "SDK: request Complete "
android.util.Log .d ( v1,v15 );
/* .line 348 */
try { // :try_start_0
/* new-instance v12, Lorg/json/JSONObject; */
/* move-object/from16 v0, p1 */
/* invoke-direct {v12, v0}, Lorg/json/JSONObject;-><init>(Ljava/lang/String;)V */
/* .line 349 */
/* .local v12, "obj":Lorg/json/JSONObject; */
final String v1 = "data"; // const-string v1, "data"
v1 = (( org.json.JSONObject ) v12 ).has ( v1 ); // invoke-virtual {v12, v1}, Lorg/json/JSONObject;->has(Ljava/lang/String;)Z
if ( v1 != null) { // if-eqz v1, :cond_0
/* .line 350 */
final String v1 = "data"; // const-string v1, "data"
(( org.json.JSONObject ) v12 ).getJSONObject ( v1 ); // invoke-virtual {v12, v1}, Lorg/json/JSONObject;->getJSONObject(Ljava/lang/String;)Lorg/json/JSONObject;
/* :try_end_0 */
/* .catch Lorg/json/JSONException; {:try_start_0 ..:try_end_0} :catch_2 */
/* .line 353 */
/* .local v8, "data":Lorg/json/JSONObject; */
try { // :try_start_1
/* move-object/from16 v0, p0 */
v1 = this.dataStore;
final String v2 = "_id"; // const-string v2, "_id"
(( org.json.JSONObject ) v8 ).getString ( v2 ); // invoke-virtual {v8, v2}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;
(( de.hellowins.HwDataStore ) v1 ).setPlayerId ( v2 ); // invoke-virtual {v1, v2}, Lde/hellowins/HwDataStore;->setPlayerId(Ljava/lang/String;)V
/* .line 354 */
/* move-object/from16 v0, p0 */
v1 = this.logData;
final String v2 = "Try get Websocket"; // const-string v2, "Try get Websocket"
(( de.hellowins.LogData ) v1 ).addLog ( v2 ); // invoke-virtual {v1, v2}, Lde/hellowins/LogData;->addLog(Ljava/lang/String;)V
/* .line 355 */
/* new-instance v1, Lde/hellowins/ApiWebSocket; */
/* move-object/from16 v0, p0 */
v2 = this.dataStore;
(( de.hellowins.HwDataStore ) v2 ).getWsUri ( ); // invoke-virtual {v2}, Lde/hellowins/HwDataStore;->getWsUri()Ljava/lang/String;
/* .line 356 */
final String v3 = "email"; // const-string v3, "email"
(( org.json.JSONObject ) v8 ).getString ( v3 ); // invoke-virtual {v8, v3}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;
/* .line 357 */
final String v4 = "oneTimeKey"; // const-string v4, "oneTimeKey"
(( org.json.JSONObject ) v8 ).getString ( v4 ); // invoke-virtual {v8, v4}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;
/* .line 358 */
/* move-object/from16 v0, p0 */
v5 = this.dataStore;
(( de.hellowins.HwDataStore ) v5 ).getChallengeId ( ); // invoke-virtual {v5}, Lde/hellowins/HwDataStore;->getChallengeId()Ljava/lang/String;
/* .line 360 */
/* move-object/from16 v0, p0 */
v7 = this.logData;
/* move-object/from16 v6, p0 */
/* invoke-direct/range {v1 ..v7}, Lde/hellowins/ApiWebSocket;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lde/hellowins/ApiWebSocketHandler;Lde/hellowins/LogData;)V */
/* .line 355 */
/* move-object/from16 v0, p0 */
this.apiWebSocket = v1;
/* .line 362 */
/* move-object/from16 v0, p0 */
v1 = this.apiWebSocket;
int v2 = 0; // const/4 v2, 0x0
/* new-array v2, v2, [Ljava/lang/String; */
(( de.hellowins.ApiWebSocket ) v1 ).execute ( v2 ); // invoke-virtual {v1, v2}, Lde/hellowins/ApiWebSocket;->execute([Ljava/lang/Object;)Landroid/os/AsyncTask;
/* .line 363 */
/* move-object/from16 v0, p0 */
v1 = this.logData;
final String v2 = "Try get Websocket execute"; // const-string v2, "Try get Websocket execute"
(( de.hellowins.LogData ) v1 ).addLog ( v2 ); // invoke-virtual {v1, v2}, Lde/hellowins/LogData;->addLog(Ljava/lang/String;)V
/* .line 364 */
/* move-object/from16 v0, p0 */
v1 = this.timerThread;
(( de.hellowins.thread.TimerThread ) v1 ).start ( ); // invoke-virtual {v1}, Lde/hellowins/thread/TimerThread;->start()V
/* :try_end_1 */
/* .catch Lorg/json/JSONException; {:try_start_1 ..:try_end_1} :catch_0 */
/* .line 380 */
} // .end local v8 # "data":Lorg/json/JSONObject;
} // .end local v12 # "obj":Lorg/json/JSONObject;
} // :cond_0
} // :goto_1
return;
/* .line 341 */
} // .end local v11 # "len":I
} // .end local v15 # "sData":Ljava/lang/String;
} // :cond_1
v11 = /* invoke-virtual/range {p1 ..p1}, Ljava/lang/String;->length()I */
/* goto/16 :goto_0 */
/* .line 365 */
/* .restart local v8 # "data":Lorg/json/JSONObject; */
/* .restart local v11 # "len":I */
/* .restart local v12 # "obj":Lorg/json/JSONObject; */
/* .restart local v15 # "sData":Ljava/lang/String; */
/* :catch_0 */
/* move-exception v9 */
/* .line 367 */
/* .local v9, "e":Lorg/json/JSONException; */
try { // :try_start_2
/* new-instance v14, Ljava/io/StringWriter; */
/* invoke-direct {v14}, Ljava/io/StringWriter;-><init>()V */
/* .line 368 */
/* .local v14, "result":Ljava/io/Writer; */
/* new-instance v13, Ljava/io/PrintWriter; */
/* invoke-direct {v13, v14}, Ljava/io/PrintWriter;-><init>(Ljava/io/Writer;)V */
/* .line 369 */
/* .local v13, "printWriter":Ljava/io/PrintWriter; */
(( org.json.JSONException ) v9 ).printStackTrace ( v13 ); // invoke-virtual {v9, v13}, Lorg/json/JSONException;->printStackTrace(Ljava/io/PrintWriter;)V
/* .line 370 */
/* move-object/from16 v0, p0 */
v1 = this.logData;
/* new-instance v2, Ljava/lang/StringBuilder; */
final String v3 = "Error: "; // const-string v3, "Error: "
/* invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V */
(( java.lang.Object ) v14 ).toString ( ); // invoke-virtual {v14}, Ljava/lang/Object;->toString()Ljava/lang/String;
(( java.lang.StringBuilder ) v2 ).append ( v3 ); // invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v2 ).toString ( ); // invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
(( de.hellowins.LogData ) v1 ).addLog ( v2 ); // invoke-virtual {v1, v2}, Lde/hellowins/LogData;->addLog(Ljava/lang/String;)V
/* :try_end_2 */
/* .catch Ljava/lang/Exception; {:try_start_2 ..:try_end_2} :catch_1 */
/* .catch Lorg/json/JSONException; {:try_start_2 ..:try_end_2} :catch_2 */
/* .line 371 */
} // .end local v13 # "printWriter":Ljava/io/PrintWriter;
} // .end local v14 # "result":Ljava/io/Writer;
/* :catch_1 */
/* move-exception v10 */
/* .line 372 */
/* .local v10, "e1":Ljava/lang/Exception; */
try { // :try_start_3
/* move-object/from16 v0, p0 */
v1 = this.logData;
(( de.hellowins.LogData ) v1 ).logException ( v9 ); // invoke-virtual {v1, v9}, Lde/hellowins/LogData;->logException(Ljava/lang/Exception;)V
/* :try_end_3 */
/* .catch Lorg/json/JSONException; {:try_start_3 ..:try_end_3} :catch_2 */
/* .line 376 */
} // .end local v8 # "data":Lorg/json/JSONObject;
} // .end local v9 # "e":Lorg/json/JSONException;
} // .end local v10 # "e1":Ljava/lang/Exception;
} // .end local v12 # "obj":Lorg/json/JSONObject;
/* :catch_2 */
/* move-exception v9 */
/* .line 377 */
/* .restart local v9 # "e":Lorg/json/JSONException; */
/* move-object/from16 v0, p0 */
v1 = this.logData;
(( de.hellowins.LogData ) v1 ).logException ( v9 ); // invoke-virtual {v1, v9}, Lde/hellowins/LogData;->logException(Ljava/lang/Exception;)V
} // .end method
public void requestFailed ( java.lang.String p0 ) {
/* .locals 3 */
/* .param p1, "error" # Ljava/lang/String; */
/* .prologue */
/* .line 333 */
final String v0 = "SDK: request Failed "; // const-string v0, "SDK: request Failed "
android.util.Log .d ( v0,p1 );
/* .line 334 */
v0 = this.logData;
/* new-instance v1, Ljava/lang/StringBuilder; */
final String v2 = "SDK: request Failed "; // const-string v2, "SDK: request Failed "
/* invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V */
(( java.lang.StringBuilder ) v1 ).append ( p1 ); // invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v1 ).toString ( ); // invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
(( de.hellowins.LogData ) v0 ).addLog ( v1 ); // invoke-virtual {v0, v1}, Lde/hellowins/LogData;->addLog(Ljava/lang/String;)V
/* .line 336 */
return;
} // .end method
public void socketClosed ( ) {
/* .locals 2 */
/* .prologue */
/* .line 645 */
v0 = this.logData;
final String v1 = "socket closed"; // const-string v1, "socket closed"
(( de.hellowins.LogData ) v0 ).addLog ( v1 ); // invoke-virtual {v0, v1}, Lde/hellowins/LogData;->addLog(Ljava/lang/String;)V
/* .line 646 */
(( de.hellowins.Hellowins ) p0 ).backToHelloinsApp ( ); // invoke-virtual {p0}, Lde/hellowins/Hellowins;->backToHelloinsApp()V
/* .line 647 */
return;
} // .end method
public void unRegisterUpdateHandler ( de.hellowins.HellowinsUpdateHandler p0 ) {
/* .locals 3 */
/* .param p1, "handler" # Lde/hellowins/HellowinsUpdateHandler; */
/* .prologue */
/* .line 319 */
/* new-instance v1, Ljava/lang/StringBuilder; */
/* invoke-direct {v1}, Ljava/lang/StringBuilder;-><init>()V */
v2 = (( java.lang.Object ) p1 ).hashCode ( ); // invoke-virtual {p1}, Ljava/lang/Object;->hashCode()I
(( java.lang.StringBuilder ) v1 ).append ( v2 ); // invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v1 ).toString ( ); // invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
/* .line 320 */
/* .local v0, "hc":Ljava/lang/String; */
v1 = this.updateHandler;
/* .line 321 */
return;
} // .end method
public void updateTime ( ) {
/* .locals 3 */
/* .prologue */
/* .line 661 */
v0 = this.handlerData;
(( de.hellowins.game.data.HellowinsResponseData ) v0 ).getUser ( ); // invoke-virtual {v0}, Lde/hellowins/game/data/HellowinsResponseData;->getUser()Lde/hellowins/game/data/HellowinsUserData;
/* const-wide/16 v1, 0x1f4 */
(( de.hellowins.game.data.HellowinsUserData ) v0 ).calcPlayTime ( v1, v2 ); // invoke-virtual {v0, v1, v2}, Lde/hellowins/game/data/HellowinsUserData;->calcPlayTime(J)V
/* .line 662 */
/* invoke-direct {p0}, Lde/hellowins/Hellowins;->updateTimeHandler()V */
/* .line 663 */
return;
} // .end method
