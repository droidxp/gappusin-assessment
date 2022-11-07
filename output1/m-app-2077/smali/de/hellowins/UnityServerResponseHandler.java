class de.hellowins.UnityServerResponseHandler implements de.hellowins.ApiHttpRequestHandler implements de.hellowins.ApiWebSocketHandler implements de.hellowins.handler.TimerUpdateHandler {
	 /* .source "UnityServerResponseHandler.java" */
	 /* # interfaces */
	 /* # static fields */
	 static java.text.SimpleDateFormat sDateFormat;
	 /* # instance fields */
	 public org.json.JSONObject apiAccessObject;
	 protected de.hellowins.UnityApiWebSocket apiWebSocket;
	 de.hellowins.HwDataStore dataStore;
	 de.hellowins.game.data.HellowinsResponseData handlerData;
	 de.hellowins.LogData logData;
	 protected Long mLastTime;
	 protected Long mTimeDif;
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
/* # direct methods */
static de.hellowins.UnityServerResponseHandler ( ) {
/* .locals 2 */
/* .prologue */
/* .line 41 */
/* new-instance v0, Ljava/text/SimpleDateFormat; */
final String v1 = "yyyy-MM-dd\'T\'HH:mm:ss.SSS"; // const-string v1, "yyyy-MM-dd\'T\'HH:mm:ss.SSS"
/* invoke-direct {v0, v1}, Ljava/text/SimpleDateFormat;-><init>(Ljava/lang/String;)V */
return;
} // .end method
 de.hellowins.UnityServerResponseHandler ( ) {
/* .locals 2 */
/* .param p1, "dataStore" # Lde/hellowins/HwDataStore; */
/* .param p2, "logData" # Lde/hellowins/LogData; */
/* .prologue */
/* .line 43 */
/* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
/* .line 34 */
/* const-wide/16 v0, 0x0 */
/* iput-wide v0, p0, Lde/hellowins/UnityServerResponseHandler;->mLastTime:J */
/* .line 35 */
/* const-wide/16 v0, 0x3e8 */
/* iput-wide v0, p0, Lde/hellowins/UnityServerResponseHandler;->mTimeDif:J */
/* .line 37 */
/* new-instance v0, Ljava/util/ArrayList; */
/* invoke-direct {v0}, Ljava/util/ArrayList;-><init>()V */
this.playerData = v0;
/* .line 39 */
/* new-instance v0, Lde/hellowins/game/data/HellowinsResponseData; */
/* invoke-direct {v0}, Lde/hellowins/game/data/HellowinsResponseData;-><init>()V */
this.handlerData = v0;
/* .line 44 */
this.dataStore = p1;
/* .line 45 */
this.logData = p2;
/* .line 47 */
return;
} // .end method
/* # virtual methods */
java.lang.String byteToString ( Object[] p0 ) {
/* .locals 4 */
/* .param p1, "_bytes" # [B */
/* .prologue */
/* .line 145 */
final String v0 = ""; // const-string v0, ""
/* .line 147 */
/* .local v0, "file_string":Ljava/lang/String; */
int v1 = 0; // const/4 v1, 0x0
/* .local v1, "i":I */
} // :goto_0
/* array-length v2, p1 */
/* if-lt v1, v2, :cond_0 */
/* .line 152 */
/* .line 149 */
} // :cond_0
/* new-instance v2, Ljava/lang/StringBuilder; */
java.lang.String .valueOf ( v0 );
/* invoke-direct {v2, v3}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V */
/* aget-byte v3, p1, v1 */
/* int-to-char v3, v3 */
(( java.lang.StringBuilder ) v2 ).append ( v3 ); // invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(C)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v2 ).toString ( ); // invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
/* .line 147 */
/* add-int/lit8 v1, v1, 0x1 */
} // .end method
protected void computeGameOver ( ) {
/* .locals 3 */
/* .prologue */
int v2 = 0; // const/4 v2, 0x0
/* .line 270 */
v0 = this.dataStore;
/* iput-boolean v2, v0, Lde/hellowins/HwDataStore;->gameRunning:Z */
/* .line 271 */
v0 = this.dataStore;
int v1 = 1; // const/4 v1, 0x1
/* iput-boolean v1, v0, Lde/hellowins/HwDataStore;->gameFinished:Z */
/* .line 272 */
v0 = this.handlerData;
(( de.hellowins.game.data.HellowinsResponseData ) v0 ).setRunning ( v2 ); // invoke-virtual {v0, v2}, Lde/hellowins/game/data/HellowinsResponseData;->setRunning(Z)V
/* .line 273 */
return;
} // .end method
protected void computeHighscore ( org.json.JSONObject p0 ) {
/* .locals 11 */
/* .param p1, "obj" # Lorg/json/JSONObject; */
/* .prologue */
/* .line 277 */
try { // :try_start_0
final String v8 = "playerId"; // const-string v8, "playerId"
(( org.json.JSONObject ) p1 ).getString ( v8 ); // invoke-virtual {p1, v8}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;
/* .line 278 */
/* .local v5, "player":Ljava/lang/String; */
final String v8 = "score"; // const-string v8, "score"
v7 = (( org.json.JSONObject ) p1 ).getInt ( v8 ); // invoke-virtual {p1, v8}, Lorg/json/JSONObject;->getInt(Ljava/lang/String;)I
/* .line 282 */
/* .local v7, "score":I */
int v2 = 0; // const/4 v2, 0x0
/* .line 283 */
/* .local v2, "found":Z */
int v3 = 0; // const/4 v3, 0x0
/* .local v3, "i":I */
} // :goto_0
v8 = v8 = this.playerData;
/* if-lt v3, v8, :cond_2 */
/* .line 292 */
} // :goto_1
/* if-nez v2, :cond_0 */
/* .line 293 */
/* new-instance v4, Lde/hellowins/DataPlayer; */
/* invoke-direct {v4}, Lde/hellowins/DataPlayer;-><init>()V */
/* .line 294 */
/* .local v4, "pd":Lde/hellowins/DataPlayer; */
this.playerId = v5;
/* .line 295 */
/* iput v7, v4, Lde/hellowins/DataPlayer;->score:I */
/* .line 296 */
v8 = this.playerData;
/* .line 299 */
} // .end local v4 # "pd":Lde/hellowins/DataPlayer;
} // :cond_0
v8 = this.playerData;
java.util.Collections .sort ( v8 );
/* .line 301 */
int v6 = 0; // const/4 v6, 0x0
/* .line 303 */
/* .local v6, "pos":I */
int v3 = 0; // const/4 v3, 0x0
} // :goto_2
v8 = v8 = this.playerData;
/* if-lt v3, v8, :cond_4 */
/* .line 310 */
} // :goto_3
/* add-int/lit8 v6, v6, 0x1 */
/* .line 312 */
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
/* .line 315 */
v8 = v8 = this.playerData;
/* if-lez v8, :cond_1 */
/* .line 316 */
v8 = this.playerData;
int v9 = 0; // const/4 v9, 0x0
/* check-cast v0, Lde/hellowins/DataPlayer; */
/* .line 317 */
/* .local v0, "d":Lde/hellowins/DataPlayer; */
v8 = this.handlerData;
/* iget v9, v0, Lde/hellowins/DataPlayer;->score:I */
(( de.hellowins.game.data.HellowinsResponseData ) v8 ).setHighscore ( v9 ); // invoke-virtual {v8, v9}, Lde/hellowins/game/data/HellowinsResponseData;->setHighscore(I)V
/* .line 324 */
} // .end local v0 # "d":Lde/hellowins/DataPlayer;
} // .end local v2 # "found":Z
} // .end local v3 # "i":I
} // .end local v5 # "player":Ljava/lang/String;
} // .end local v6 # "pos":I
} // .end local v7 # "score":I
} // :cond_1
} // :goto_4
return;
/* .line 284 */
/* .restart local v2 # "found":Z */
/* .restart local v3 # "i":I */
/* .restart local v5 # "player":Ljava/lang/String; */
/* .restart local v7 # "score":I */
} // :cond_2
v8 = this.playerData;
/* check-cast v0, Lde/hellowins/DataPlayer; */
/* .line 285 */
/* .restart local v0 # "d":Lde/hellowins/DataPlayer; */
v8 = this.playerId;
v8 = (( java.lang.String ) v8 ).equals ( v5 ); // invoke-virtual {v8, v5}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
if ( v8 != null) { // if-eqz v8, :cond_3
/* .line 286 */
/* iput v7, v0, Lde/hellowins/DataPlayer;->score:I */
/* .line 287 */
int v2 = 1; // const/4 v2, 0x1
/* .line 288 */
/* .line 283 */
} // :cond_3
/* add-int/lit8 v3, v3, 0x1 */
/* .line 304 */
} // .end local v0 # "d":Lde/hellowins/DataPlayer;
/* .restart local v6 # "pos":I */
} // :cond_4
v8 = this.playerData;
/* check-cast v0, Lde/hellowins/DataPlayer; */
/* .line 305 */
/* .restart local v0 # "d":Lde/hellowins/DataPlayer; */
v8 = this.playerId;
v9 = this.dataStore;
(( de.hellowins.HwDataStore ) v9 ).getPlayerId ( ); // invoke-virtual {v9}, Lde/hellowins/HwDataStore;->getPlayerId()Ljava/lang/String;
(( java.lang.String ) v8 ).equals ( v9 ); // invoke-virtual {v8, v9}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
/* :try_end_0 */
v8 = /* .catch Lorg/json/JSONException; {:try_start_0 ..:try_end_0} :catch_0 */
if ( v8 != null) { // if-eqz v8, :cond_5
/* .line 306 */
/* move v6, v3 */
/* .line 307 */
/* .line 303 */
} // :cond_5
/* add-int/lit8 v3, v3, 0x1 */
/* .line 321 */
} // .end local v0 # "d":Lde/hellowins/DataPlayer;
} // .end local v2 # "found":Z
} // .end local v3 # "i":I
} // .end local v5 # "player":Ljava/lang/String;
} // .end local v6 # "pos":I
} // .end local v7 # "score":I
/* :catch_0 */
/* move-exception v1 */
/* .line 322 */
/* .local v1, "e":Lorg/json/JSONException; */
(( org.json.JSONException ) v1 ).printStackTrace ( ); // invoke-virtual {v1}, Lorg/json/JSONException;->printStackTrace()V
} // .end method
protected void computeStarted ( org.json.JSONObject p0 ) {
/* .locals 11 */
/* .param p1, "data" # Lorg/json/JSONObject; */
/* .prologue */
/* .line 333 */
try { // :try_start_0
final String v7 = "serverTime"; // const-string v7, "serverTime"
(( org.json.JSONObject ) p1 ).optString ( v7 ); // invoke-virtual {p1, v7}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;
/* .line 334 */
/* .local v5, "serverTime":Ljava/lang/String; */
int v7 = 0; // const/4 v7, 0x0
final String v8 = "+"; // const-string v8, "+"
v8 = (( java.lang.String ) v5 ).indexOf ( v8 ); // invoke-virtual {v5, v8}, Ljava/lang/String;->indexOf(Ljava/lang/String;)I
(( java.lang.String ) v5 ).substring ( v7, v8 ); // invoke-virtual {v5, v7, v8}, Ljava/lang/String;->substring(II)Ljava/lang/String;
/* .line 336 */
final String v7 = ""; // const-string v7, ""
v7 = (( java.lang.String ) v5 ).equals ( v7 ); // invoke-virtual {v5, v7}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
if ( v7 != null) { // if-eqz v7, :cond_0
/* .line 359 */
} // .end local v5 # "serverTime":Ljava/lang/String;
} // :goto_0
return;
/* .line 338 */
/* .restart local v5 # "serverTime":Ljava/lang/String; */
} // :cond_0
final String v7 = "data"; // const-string v7, "data"
(( org.json.JSONObject ) p1 ).getJSONObject ( v7 ); // invoke-virtual {p1, v7}, Lorg/json/JSONObject;->getJSONObject(Ljava/lang/String;)Lorg/json/JSONObject;
/* .line 340 */
/* .local v2, "data1":Lorg/json/JSONObject; */
final String v7 = "timelimit"; // const-string v7, "timelimit"
(( org.json.JSONObject ) v2 ).getString ( v7 ); // invoke-virtual {v2, v7}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;
/* .line 341 */
/* .local v6, "stopAt":Ljava/lang/String; */
int v7 = 0; // const/4 v7, 0x0
final String v8 = "+"; // const-string v8, "+"
v8 = (( java.lang.String ) v6 ).indexOf ( v8 ); // invoke-virtual {v6, v8}, Ljava/lang/String;->indexOf(Ljava/lang/String;)I
(( java.lang.String ) v6 ).substring ( v7, v8 ); // invoke-virtual {v6, v7, v8}, Ljava/lang/String;->substring(II)Ljava/lang/String;
/* .line 343 */
v7 = de.hellowins.UnityServerResponseHandler.sDateFormat;
(( java.text.SimpleDateFormat ) v7 ).parse ( v5 ); // invoke-virtual {v7, v5}, Ljava/text/SimpleDateFormat;->parse(Ljava/lang/String;)Ljava/util/Date;
/* .line 345 */
/* .local v0, "d1":Ljava/util/Date; */
v7 = de.hellowins.UnityServerResponseHandler.sDateFormat;
(( java.text.SimpleDateFormat ) v7 ).parse ( v6 ); // invoke-virtual {v7, v6}, Ljava/text/SimpleDateFormat;->parse(Ljava/lang/String;)Ljava/util/Date;
/* .line 347 */
/* .local v1, "d2":Ljava/util/Date; */
(( java.util.Date ) v1 ).getTime ( ); // invoke-virtual {v1}, Ljava/util/Date;->getTime()J
/* move-result-wide v7 */
(( java.util.Date ) v0 ).getTime ( ); // invoke-virtual {v0}, Ljava/util/Date;->getTime()J
/* move-result-wide v9 */
/* sub-long/2addr v7, v9 */
java.lang.Long .valueOf ( v7,v8 );
/* .line 349 */
/* .local v3, "dif":Ljava/lang/Long; */
(( java.lang.Long ) v3 ).longValue ( ); // invoke-virtual {v3}, Ljava/lang/Long;->longValue()J
/* move-result-wide v7 */
/* const-wide/16 v9, 0x0 */
/* cmp-long v7, v7, v9 */
/* if-lez v7, :cond_1 */
/* .line 350 */
v7 = this.handlerData;
(( de.hellowins.game.data.HellowinsResponseData ) v7 ).getUser ( ); // invoke-virtual {v7}, Lde/hellowins/game/data/HellowinsResponseData;->getUser()Lde/hellowins/game/data/HellowinsUserData;
(( java.lang.Long ) v3 ).longValue ( ); // invoke-virtual {v3}, Ljava/lang/Long;->longValue()J
/* move-result-wide v8 */
(( de.hellowins.game.data.HellowinsUserData ) v7 ).setPlayTime ( v8, v9 ); // invoke-virtual {v7, v8, v9}, Lde/hellowins/game/data/HellowinsUserData;->setPlayTime(J)V
/* .line 353 */
} // :cond_1
v7 = this.dataStore;
int v8 = 1; // const/4 v8, 0x1
/* iput-boolean v8, v7, Lde/hellowins/HwDataStore;->gameRunning:Z */
/* :try_end_0 */
/* .catch Ljava/lang/Exception; {:try_start_0 ..:try_end_0} :catch_0 */
/* .line 356 */
} // .end local v0 # "d1":Ljava/util/Date;
} // .end local v1 # "d2":Ljava/util/Date;
} // .end local v2 # "data1":Lorg/json/JSONObject;
} // .end local v3 # "dif":Ljava/lang/Long;
} // .end local v5 # "serverTime":Ljava/lang/String;
} // .end local v6 # "stopAt":Ljava/lang/String;
/* :catch_0 */
/* move-exception v4 */
/* .line 357 */
/* .local v4, "e":Ljava/lang/Exception; */
(( java.lang.Exception ) v4 ).printStackTrace ( ); // invoke-virtual {v4}, Ljava/lang/Exception;->printStackTrace()V
} // .end method
public Integer getHighscore ( ) {
/* .locals 1 */
/* .prologue */
/* .line 134 */
v0 = this.handlerData;
v0 = (( de.hellowins.game.data.HellowinsResponseData ) v0 ).getHighscore ( ); // invoke-virtual {v0}, Lde/hellowins/game/data/HellowinsResponseData;->getHighscore()I
} // .end method
public java.lang.String getRanking ( ) {
/* .locals 1 */
/* .prologue */
/* .line 130 */
v0 = this.handlerData;
(( de.hellowins.game.data.HellowinsResponseData ) v0 ).getUser ( ); // invoke-virtual {v0}, Lde/hellowins/game/data/HellowinsResponseData;->getUser()Lde/hellowins/game/data/HellowinsUserData;
v0 = this.rank;
} // .end method
public Integer getRemainingPercent ( ) {
/* .locals 1 */
/* .prologue */
/* .line 121 */
v0 = this.handlerData;
v0 = (( de.hellowins.game.data.HellowinsResponseData ) v0 ).getRemainingPercent ( ); // invoke-virtual {v0}, Lde/hellowins/game/data/HellowinsResponseData;->getRemainingPercent()I
} // .end method
public java.lang.String getRemainingTime ( ) {
/* .locals 6 */
/* .prologue */
/* .line 104 */
v3 = this.dataStore;
/* iget-boolean v3, v3, Lde/hellowins/HwDataStore;->gameRunning:Z */
/* if-nez v3, :cond_0 */
final String v2 = "02:00"; // const-string v2, "02:00"
/* .line 114 */
} // :goto_0
/* .line 106 */
} // :cond_0
java.lang.System .currentTimeMillis ( );
/* move-result-wide v0 */
/* .line 108 */
/* .local v0, "now":J */
/* iget-wide v3, p0, Lde/hellowins/UnityServerResponseHandler;->mLastTime:J */
/* cmp-long v3, v3, v0 */
/* if-gez v3, :cond_1 */
/* .line 109 */
v3 = this.handlerData;
(( de.hellowins.game.data.HellowinsResponseData ) v3 ).getUser ( ); // invoke-virtual {v3}, Lde/hellowins/game/data/HellowinsResponseData;->getUser()Lde/hellowins/game/data/HellowinsUserData;
/* iget-wide v4, p0, Lde/hellowins/UnityServerResponseHandler;->mTimeDif:J */
(( de.hellowins.game.data.HellowinsUserData ) v3 ).calcPlayTime ( v4, v5 ); // invoke-virtual {v3, v4, v5}, Lde/hellowins/game/data/HellowinsUserData;->calcPlayTime(J)V
/* .line 110 */
/* iget-wide v3, p0, Lde/hellowins/UnityServerResponseHandler;->mTimeDif:J */
/* add-long/2addr v3, v0 */
/* iput-wide v3, p0, Lde/hellowins/UnityServerResponseHandler;->mLastTime:J */
/* .line 113 */
} // :cond_1
v3 = this.handlerData;
(( de.hellowins.game.data.HellowinsResponseData ) v3 ).getUser ( ); // invoke-virtual {v3}, Lde/hellowins/game/data/HellowinsResponseData;->getUser()Lde/hellowins/game/data/HellowinsUserData;
v2 = this.time;
/* .line 114 */
/* .local v2, "ret":Ljava/lang/String; */
} // .end method
public void onClose ( ) {
/* .locals 2 */
/* .prologue */
/* .line 365 */
v0 = this.dataStore;
int v1 = 0; // const/4 v1, 0x0
/* iput-boolean v1, v0, Lde/hellowins/HwDataStore;->initialized:Z */
/* .line 366 */
v0 = this.logData;
final String v1 = "Socket closed"; // const-string v1, "Socket closed"
(( de.hellowins.LogData ) v0 ).addLog ( v1 ); // invoke-virtual {v0, v1}, Lde/hellowins/LogData;->addLog(Ljava/lang/String;)V
/* .line 367 */
return;
} // .end method
public void onMessage ( de.roderick.weberknecht.WebSocketMessage p0 ) {
/* .locals 10 */
/* .param p1, "message" # Lde/roderick/weberknecht/WebSocketMessage; */
/* .prologue */
/* .line 228 */
/* if-nez p1, :cond_1 */
/* .line 229 */
v7 = this.logData;
final String v8 = "onMessage message = null"; // const-string v8, "onMessage message = null"
(( de.hellowins.LogData ) v7 ).addLog ( v8 ); // invoke-virtual {v7, v8}, Lde/hellowins/LogData;->addLog(Ljava/lang/String;)V
/* .line 264 */
} // :cond_0
} // :goto_0
return;
/* .line 233 */
} // :cond_1
v7 = this.logData;
/* new-instance v8, Ljava/lang/StringBuilder; */
final String v9 = "SDK onMessage: "; // const-string v9, "SDK onMessage: "
/* invoke-direct {v8, v9}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V */
(( de.roderick.weberknecht.WebSocketMessage ) p1 ).getText ( ); // invoke-virtual {p1}, Lde/roderick/weberknecht/WebSocketMessage;->getText()Ljava/lang/String;
(( java.lang.StringBuilder ) v8 ).append ( v9 ); // invoke-virtual {v8, v9}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v8 ).toString ( ); // invoke-virtual {v8}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
(( de.hellowins.LogData ) v7 ).addLog ( v8 ); // invoke-virtual {v7, v8}, Lde/hellowins/LogData;->addLog(Ljava/lang/String;)V
/* .line 235 */
(( de.roderick.weberknecht.WebSocketMessage ) p1 ).getText ( ); // invoke-virtual {p1}, Lde/roderick/weberknecht/WebSocketMessage;->getText()Ljava/lang/String;
/* .line 236 */
/* .local v6, "text":Ljava/lang/String; */
final String v7 = "Hellowins SDK"; // const-string v7, "Hellowins SDK"
android.util.Log .d ( v7,v6 );
/* .line 238 */
try { // :try_start_0
/* new-instance v5, Lorg/json/JSONObject; */
/* invoke-direct {v5, v6}, Lorg/json/JSONObject;-><init>(Ljava/lang/String;)V */
/* .line 239 */
/* .local v5, "obj":Lorg/json/JSONObject; */
final String v7 = "action"; // const-string v7, "action"
(( org.json.JSONObject ) v5 ).optString ( v7 ); // invoke-virtual {v5, v7}, Lorg/json/JSONObject;->optString(Ljava/lang/String;)Ljava/lang/String;
/* .line 241 */
/* .local v1, "action":Ljava/lang/String; */
final String v7 = "action"; // const-string v7, "action"
(( org.json.JSONObject ) v5 ).optJSONObject ( v7 ); // invoke-virtual {v5, v7}, Lorg/json/JSONObject;->optJSONObject(Ljava/lang/String;)Lorg/json/JSONObject;
/* .line 242 */
/* .local v0, "aObject":Lorg/json/JSONObject; */
if ( v0 != null) { // if-eqz v0, :cond_2
/* .line 243 */
final String v7 = "name"; // const-string v7, "name"
(( org.json.JSONObject ) v0 ).getString ( v7 ); // invoke-virtual {v0, v7}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;
/* .line 246 */
} // :cond_2
final String v7 = "challenge/highscore"; // const-string v7, "challenge/highscore"
v7 = (( java.lang.String ) v1 ).equals ( v7 ); // invoke-virtual {v1, v7}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
if ( v7 != null) { // if-eqz v7, :cond_3
/* .line 247 */
final String v7 = "data"; // const-string v7, "data"
(( org.json.JSONObject ) v5 ).getJSONObject ( v7 ); // invoke-virtual {v5, v7}, Lorg/json/JSONObject;->getJSONObject(Ljava/lang/String;)Lorg/json/JSONObject;
/* .line 248 */
/* .local v4, "highscore":Lorg/json/JSONObject; */
(( de.hellowins.UnityServerResponseHandler ) p0 ).computeHighscore ( v4 ); // invoke-virtual {p0, v4}, Lde/hellowins/UnityServerResponseHandler;->computeHighscore(Lorg/json/JSONObject;)V
/* :try_end_0 */
/* .catch Lorg/json/JSONException; {:try_start_0 ..:try_end_0} :catch_0 */
/* .line 261 */
} // .end local v0 # "aObject":Lorg/json/JSONObject;
} // .end local v1 # "action":Ljava/lang/String;
} // .end local v4 # "highscore":Lorg/json/JSONObject;
} // .end local v5 # "obj":Lorg/json/JSONObject;
/* :catch_0 */
/* move-exception v3 */
/* .line 262 */
/* .local v3, "e":Lorg/json/JSONException; */
v7 = this.logData;
(( de.hellowins.LogData ) v7 ).logException ( v3 ); // invoke-virtual {v7, v3}, Lde/hellowins/LogData;->logException(Ljava/lang/Exception;)V
/* .line 249 */
} // .end local v3 # "e":Lorg/json/JSONException;
/* .restart local v0 # "aObject":Lorg/json/JSONObject; */
/* .restart local v1 # "action":Ljava/lang/String; */
/* .restart local v5 # "obj":Lorg/json/JSONObject; */
} // :cond_3
try { // :try_start_1
final String v7 = "game/started"; // const-string v7, "game/started"
v7 = (( java.lang.String ) v1 ).equals ( v7 ); // invoke-virtual {v1, v7}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
if ( v7 != null) { // if-eqz v7, :cond_4
/* .line 250 */
v7 = this.apiWebSocket;
(( de.hellowins.UnityApiWebSocket ) v7 ).sendAccept ( v1 ); // invoke-virtual {v7, v1}, Lde/hellowins/UnityApiWebSocket;->sendAccept(Ljava/lang/String;)V
/* .line 251 */
/* new-instance v2, Lorg/json/JSONObject; */
/* invoke-direct {v2, v6}, Lorg/json/JSONObject;-><init>(Ljava/lang/String;)V */
/* .line 252 */
/* .local v2, "data":Lorg/json/JSONObject; */
(( de.hellowins.UnityServerResponseHandler ) p0 ).computeStarted ( v2 ); // invoke-virtual {p0, v2}, Lde/hellowins/UnityServerResponseHandler;->computeStarted(Lorg/json/JSONObject;)V
/* .line 253 */
} // .end local v2 # "data":Lorg/json/JSONObject;
} // :cond_4
final String v7 = "game/over"; // const-string v7, "game/over"
v7 = (( java.lang.String ) v1 ).equals ( v7 ); // invoke-virtual {v1, v7}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
if ( v7 != null) { // if-eqz v7, :cond_5
/* .line 254 */
v7 = this.apiWebSocket;
(( de.hellowins.UnityApiWebSocket ) v7 ).sendAccept ( v1 ); // invoke-virtual {v7, v1}, Lde/hellowins/UnityApiWebSocket;->sendAccept(Ljava/lang/String;)V
/* .line 255 */
v7 = this.logData;
final String v8 = "GameOver"; // const-string v8, "GameOver"
(( de.hellowins.LogData ) v7 ).addLog ( v8 ); // invoke-virtual {v7, v8}, Lde/hellowins/LogData;->addLog(Ljava/lang/String;)V
/* .line 256 */
(( de.hellowins.UnityServerResponseHandler ) p0 ).computeGameOver ( ); // invoke-virtual {p0}, Lde/hellowins/UnityServerResponseHandler;->computeGameOver()V
/* goto/16 :goto_0 */
/* .line 257 */
} // :cond_5
final String v7 = "authenticated"; // const-string v7, "authenticated"
v7 = (( java.lang.String ) v1 ).equals ( v7 ); // invoke-virtual {v1, v7}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
if ( v7 != null) { // if-eqz v7, :cond_0
/* .line 258 */
v7 = this.apiWebSocket;
(( de.hellowins.UnityApiWebSocket ) v7 ).sendListen ( ); // invoke-virtual {v7}, Lde/hellowins/UnityApiWebSocket;->sendListen()V
/* .line 259 */
v7 = this.dataStore;
int v8 = 1; // const/4 v8, 0x1
/* iput-boolean v8, v7, Lde/hellowins/HwDataStore;->gameRunning:Z */
/* :try_end_1 */
/* .catch Lorg/json/JSONException; {:try_start_1 ..:try_end_1} :catch_0 */
/* goto/16 :goto_0 */
} // .end method
public void requestComplete ( java.lang.String p0 ) {
/* .locals 11 */
/* .param p1, "content" # Ljava/lang/String; */
/* .prologue */
/* const/16 v9, 0x64 */
/* .line 166 */
v0 = (( java.lang.String ) p1 ).length ( ); // invoke-virtual {p1}, Ljava/lang/String;->length()I
/* if-le v0, v9, :cond_0 */
/* .line 167 */
/* .local v9, "len":I */
} // :goto_0
v0 = this.logData;
/* new-instance v1, Ljava/lang/StringBuilder; */
final String v2 = "Request Complete "; // const-string v2, "Request Complete "
/* invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V */
int v2 = 0; // const/4 v2, 0x0
(( java.lang.String ) p1 ).substring ( v2, v9 ); // invoke-virtual {p1, v2, v9}, Ljava/lang/String;->substring(II)Ljava/lang/String;
(( java.lang.StringBuilder ) v1 ).append ( v2 ); // invoke-virtual {v1, v2}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v1 ).toString ( ); // invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
(( de.hellowins.LogData ) v0 ).addLog ( v1 ); // invoke-virtual {v0, v1}, Lde/hellowins/LogData;->addLog(Ljava/lang/String;)V
/* .line 170 */
try { // :try_start_0
v0 = this.logData;
final String v1 = "Try JSON"; // const-string v1, "Try JSON"
(( de.hellowins.LogData ) v0 ).addLog ( v1 ); // invoke-virtual {v0, v1}, Lde/hellowins/LogData;->addLog(Ljava/lang/String;)V
/* .line 171 */
/* new-instance v10, Lorg/json/JSONObject; */
/* invoke-direct {v10, p1}, Lorg/json/JSONObject;-><init>(Ljava/lang/String;)V */
/* .line 173 */
/* .local v10, "obj":Lorg/json/JSONObject; */
final String v0 = "data"; // const-string v0, "data"
(( org.json.JSONObject ) v10 ).has ( v0 ); // invoke-virtual {v10, v0}, Lorg/json/JSONObject;->has(Ljava/lang/String;)Z
/* :try_end_0 */
v0 = /* .catch Ljava/lang/Exception; {:try_start_0 ..:try_end_0} :catch_1 */
/* if-nez v0, :cond_1 */
/* .line 196 */
} // .end local v10 # "obj":Lorg/json/JSONObject;
} // :goto_1
return;
/* .line 166 */
} // .end local v9 # "len":I
} // :cond_0
v9 = (( java.lang.String ) p1 ).length ( ); // invoke-virtual {p1}, Ljava/lang/String;->length()I
/* .line 175 */
/* .restart local v9 # "len":I */
/* .restart local v10 # "obj":Lorg/json/JSONObject; */
} // :cond_1
try { // :try_start_1
final String v0 = "data"; // const-string v0, "data"
(( org.json.JSONObject ) v10 ).getJSONObject ( v0 ); // invoke-virtual {v10, v0}, Lorg/json/JSONObject;->getJSONObject(Ljava/lang/String;)Lorg/json/JSONObject;
/* .line 176 */
/* .local v7, "data":Lorg/json/JSONObject; */
v0 = this.logData;
final String v1 = "Try get data"; // const-string v1, "Try get data"
(( de.hellowins.LogData ) v0 ).addLog ( v1 ); // invoke-virtual {v0, v1}, Lde/hellowins/LogData;->addLog(Ljava/lang/String;)V
/* :try_end_1 */
/* .catch Ljava/lang/Exception; {:try_start_1 ..:try_end_1} :catch_1 */
/* .line 178 */
try { // :try_start_2
v0 = this.dataStore;
final String v1 = "_id"; // const-string v1, "_id"
(( org.json.JSONObject ) v7 ).getString ( v1 ); // invoke-virtual {v7, v1}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;
(( de.hellowins.HwDataStore ) v0 ).setPlayerId ( v1 ); // invoke-virtual {v0, v1}, Lde/hellowins/HwDataStore;->setPlayerId(Ljava/lang/String;)V
/* .line 179 */
v0 = this.logData;
final String v1 = "Try WebSocket"; // const-string v1, "Try WebSocket"
(( de.hellowins.LogData ) v0 ).addLog ( v1 ); // invoke-virtual {v0, v1}, Lde/hellowins/LogData;->addLog(Ljava/lang/String;)V
/* .line 180 */
/* new-instance v0, Lde/hellowins/UnityApiWebSocket; */
v1 = this.dataStore;
(( de.hellowins.HwDataStore ) v1 ).getWsUri ( ); // invoke-virtual {v1}, Lde/hellowins/HwDataStore;->getWsUri()Ljava/lang/String;
/* .line 181 */
final String v2 = "email"; // const-string v2, "email"
(( org.json.JSONObject ) v7 ).getString ( v2 ); // invoke-virtual {v7, v2}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;
/* .line 182 */
final String v3 = "oneTimeKey"; // const-string v3, "oneTimeKey"
(( org.json.JSONObject ) v7 ).getString ( v3 ); // invoke-virtual {v7, v3}, Lorg/json/JSONObject;->getString(Ljava/lang/String;)Ljava/lang/String;
/* .line 183 */
v4 = this.dataStore;
(( de.hellowins.HwDataStore ) v4 ).getChallengeId ( ); // invoke-virtual {v4}, Lde/hellowins/HwDataStore;->getChallengeId()Ljava/lang/String;
/* .line 184 */
v6 = this.logData;
/* move-object v5, p0 */
/* invoke-direct/range {v0 ..v6}, Lde/hellowins/UnityApiWebSocket;-><init>(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lde/hellowins/ApiWebSocketHandler;Lde/hellowins/LogData;)V */
/* .line 180 */
this.apiWebSocket = v0;
/* .line 186 */
v0 = this.apiWebSocket;
(( de.hellowins.UnityApiWebSocket ) v0 ).connect ( ); // invoke-virtual {v0}, Lde/hellowins/UnityApiWebSocket;->connect()Ljava/lang/String;
/* .line 187 */
v0 = this.logData;
final String v1 = "Try WebSocket execute"; // const-string v1, "Try WebSocket execute"
(( de.hellowins.LogData ) v0 ).addLog ( v1 ); // invoke-virtual {v0, v1}, Lde/hellowins/LogData;->addLog(Ljava/lang/String;)V
/* :try_end_2 */
/* .catch Lorg/json/JSONException; {:try_start_2 ..:try_end_2} :catch_0 */
/* .catch Ljava/lang/Exception; {:try_start_2 ..:try_end_2} :catch_1 */
/* .line 190 */
/* :catch_0 */
/* move-exception v8 */
/* .line 191 */
/* .local v8, "e":Lorg/json/JSONException; */
try { // :try_start_3
v0 = this.logData;
(( de.hellowins.LogData ) v0 ).logException ( v8 ); // invoke-virtual {v0, v8}, Lde/hellowins/LogData;->logException(Ljava/lang/Exception;)V
/* :try_end_3 */
/* .catch Ljava/lang/Exception; {:try_start_3 ..:try_end_3} :catch_1 */
/* .line 193 */
} // .end local v7 # "data":Lorg/json/JSONObject;
} // .end local v8 # "e":Lorg/json/JSONException;
} // .end local v10 # "obj":Lorg/json/JSONObject;
/* :catch_1 */
/* move-exception v8 */
/* .line 194 */
/* .local v8, "e":Ljava/lang/Exception; */
v0 = this.logData;
(( de.hellowins.LogData ) v0 ).logException ( v8 ); // invoke-virtual {v0, v8}, Lde/hellowins/LogData;->logException(Ljava/lang/Exception;)V
} // .end method
public void requestFailed ( java.lang.String p0 ) {
/* .locals 3 */
/* .param p1, "error" # Ljava/lang/String; */
/* .prologue */
/* .line 159 */
v0 = this.logData;
/* new-instance v1, Ljava/lang/StringBuilder; */
final String v2 = "Failed request:"; // const-string v2, "Failed request:"
/* invoke-direct {v1, v2}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V */
(( java.lang.StringBuilder ) v1 ).append ( p1 ); // invoke-virtual {v1, p1}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v1 ).toString ( ); // invoke-virtual {v1}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
(( de.hellowins.LogData ) v0 ).addLog ( v1 ); // invoke-virtual {v0, v1}, Lde/hellowins/LogData;->addLog(Ljava/lang/String;)V
/* .line 160 */
return;
} // .end method
public void socketClosed ( ) {
/* .locals 2 */
/* .prologue */
/* .line 221 */
v0 = this.logData;
final String v1 = "socket closed"; // const-string v1, "socket closed"
(( de.hellowins.LogData ) v0 ).addLog ( v1 ); // invoke-virtual {v0, v1}, Lde/hellowins/LogData;->addLog(Ljava/lang/String;)V
/* .line 222 */
return;
} // .end method
public java.lang.String updatePoints ( Integer p0 ) {
/* .locals 10 */
/* .param p1, "points" # I */
/* .prologue */
/* .line 59 */
try { // :try_start_0
v7 = this.logData;
/* new-instance v8, Ljava/lang/StringBuilder; */
final String v9 = "update Points "; // const-string v9, "update Points "
/* invoke-direct {v8, v9}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V */
(( java.lang.StringBuilder ) v8 ).append ( p1 ); // invoke-virtual {v8, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v8 ).toString ( ); // invoke-virtual {v8}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
(( de.hellowins.LogData ) v7 ).addLog ( v8 ); // invoke-virtual {v7, v8}, Lde/hellowins/LogData;->addLog(Ljava/lang/String;)V
/* .line 62 */
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
/* .line 63 */
/* .local v1, "dataString":Ljava/lang/String; */
v7 = this.dataStore;
(( de.hellowins.HwDataStore ) v7 ).getEncKey ( ); // invoke-virtual {v7}, Lde/hellowins/HwDataStore;->getEncKey()Ljava/lang/String;
/* .line 64 */
/* .local v5, "key":Ljava/lang/String; */
de.hellowins.UtilsCrypt .encrypt ( v1,v5 );
/* .line 67 */
/* .local v0, "data":[B */
org.apache.commons.codec.binary.Base64 .encodeBase64 ( v0 );
/* .line 68 */
/* .local v2, "db":[B */
(( de.hellowins.UnityServerResponseHandler ) p0 ).byteToString ( v2 ); // invoke-virtual {p0, v2}, Lde/hellowins/UnityServerResponseHandler;->byteToString([B)Ljava/lang/String;
/* .line 71 */
/* .local v3, "dt":Ljava/lang/String; */
/* new-instance v6, Lorg/json/JSONObject; */
/* invoke-direct {v6}, Lorg/json/JSONObject;-><init>()V */
/* .line 72 */
/* .local v6, "obj":Lorg/json/JSONObject; */
final String v7 = "action"; // const-string v7, "action"
final String v8 = "highscore"; // const-string v8, "highscore"
(( org.json.JSONObject ) v6 ).put ( v7, v8 ); // invoke-virtual {v6, v7, v8}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;
/* .line 73 */
final String v7 = "data"; // const-string v7, "data"
(( org.json.JSONObject ) v6 ).put ( v7, v3 ); // invoke-virtual {v6, v7, v3}, Lorg/json/JSONObject;->put(Ljava/lang/String;Ljava/lang/Object;)Lorg/json/JSONObject;
/* .line 76 */
v7 = this.apiWebSocket;
/* if-nez v7, :cond_0 */
/* .line 77 */
v7 = this.logData;
final String v8 = "Websocket is null"; // const-string v8, "Websocket is null"
(( de.hellowins.LogData ) v7 ).addLog ( v8 ); // invoke-virtual {v7, v8}, Lde/hellowins/LogData;->addLog(Ljava/lang/String;)V
/* :try_end_0 */
/* .catch Ljava/lang/Exception; {:try_start_0 ..:try_end_0} :catch_1 */
/* .line 78 */
final String v7 = "Websocket is null"; // const-string v7, "Websocket is null"
/* .line 94 */
} // .end local v0 # "data":[B
} // .end local v1 # "dataString":Ljava/lang/String;
} // .end local v2 # "db":[B
} // .end local v3 # "dt":Ljava/lang/String;
} // .end local v5 # "key":Ljava/lang/String;
} // .end local v6 # "obj":Lorg/json/JSONObject;
} // :goto_0
/* .line 82 */
/* .restart local v0 # "data":[B */
/* .restart local v1 # "dataString":Ljava/lang/String; */
/* .restart local v2 # "db":[B */
/* .restart local v3 # "dt":Ljava/lang/String; */
/* .restart local v5 # "key":Ljava/lang/String; */
/* .restart local v6 # "obj":Lorg/json/JSONObject; */
} // :cond_0
try { // :try_start_1
v7 = this.logData;
/* new-instance v8, Ljava/lang/StringBuilder; */
final String v9 = "Connected: "; // const-string v9, "Connected: "
/* invoke-direct {v8, v9}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V */
v9 = this.apiWebSocket;
v9 = (( de.hellowins.UnityApiWebSocket ) v9 ).isConnected ( ); // invoke-virtual {v9}, Lde/hellowins/UnityApiWebSocket;->isConnected()Z
(( java.lang.StringBuilder ) v8 ).append ( v9 ); // invoke-virtual {v8, v9}, Ljava/lang/StringBuilder;->append(Z)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v8 ).toString ( ); // invoke-virtual {v8}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
(( de.hellowins.LogData ) v7 ).addLog ( v8 ); // invoke-virtual {v7, v8}, Lde/hellowins/LogData;->addLog(Ljava/lang/String;)V
/* .line 84 */
v7 = this.apiWebSocket;
(( org.json.JSONObject ) v6 ).toString ( ); // invoke-virtual {v6}, Lorg/json/JSONObject;->toString()Ljava/lang/String;
(( de.hellowins.UnityApiWebSocket ) v7 ).sendPoints ( v8 ); // invoke-virtual {v7, v8}, Lde/hellowins/UnityApiWebSocket;->sendPoints(Ljava/lang/String;)V
/* :try_end_1 */
/* .catch Ljava/lang/Exception; {:try_start_1 ..:try_end_1} :catch_0 */
/* .line 92 */
} // .end local v0 # "data":[B
} // .end local v1 # "dataString":Ljava/lang/String;
} // .end local v2 # "db":[B
} // .end local v3 # "dt":Ljava/lang/String;
} // .end local v5 # "key":Ljava/lang/String;
} // .end local v6 # "obj":Lorg/json/JSONObject;
} // :goto_1
v7 = this.handlerData;
(( de.hellowins.game.data.HellowinsResponseData ) v7 ).setHighscore ( p1 ); // invoke-virtual {v7, p1}, Lde/hellowins/game/data/HellowinsResponseData;->setHighscore(I)V
/* .line 94 */
/* new-instance v7, Ljava/lang/StringBuilder; */
final String v8 = "Getting Points "; // const-string v8, "Getting Points "
/* invoke-direct {v7, v8}, Ljava/lang/StringBuilder;-><init>(Ljava/lang/String;)V */
(( java.lang.StringBuilder ) v7 ).append ( p1 ); // invoke-virtual {v7, p1}, Ljava/lang/StringBuilder;->append(I)Ljava/lang/StringBuilder;
final String v8 = " \r\n"; // const-string v8, " \r\n"
(( java.lang.StringBuilder ) v7 ).append ( v8 ); // invoke-virtual {v7, v8}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v7 ).toString ( ); // invoke-virtual {v7}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
/* .line 85 */
/* .restart local v0 # "data":[B */
/* .restart local v1 # "dataString":Ljava/lang/String; */
/* .restart local v2 # "db":[B */
/* .restart local v3 # "dt":Ljava/lang/String; */
/* .restart local v5 # "key":Ljava/lang/String; */
/* .restart local v6 # "obj":Lorg/json/JSONObject; */
/* :catch_0 */
/* move-exception v4 */
/* .line 86 */
/* .local v4, "e":Ljava/lang/Exception; */
try { // :try_start_2
v7 = this.logData;
(( de.hellowins.LogData ) v7 ).logException ( v4 ); // invoke-virtual {v7, v4}, Lde/hellowins/LogData;->logException(Ljava/lang/Exception;)V
/* :try_end_2 */
/* .catch Ljava/lang/Exception; {:try_start_2 ..:try_end_2} :catch_1 */
/* .line 88 */
} // .end local v0 # "data":[B
} // .end local v1 # "dataString":Ljava/lang/String;
} // .end local v2 # "db":[B
} // .end local v3 # "dt":Ljava/lang/String;
} // .end local v4 # "e":Ljava/lang/Exception;
} // .end local v5 # "key":Ljava/lang/String;
} // .end local v6 # "obj":Lorg/json/JSONObject;
/* :catch_1 */
/* move-exception v4 */
/* .line 89 */
/* .restart local v4 # "e":Ljava/lang/Exception; */
v7 = this.logData;
(( de.hellowins.LogData ) v7 ).logException ( v4 ); // invoke-virtual {v7, v4}, Lde/hellowins/LogData;->logException(Ljava/lang/Exception;)V
} // .end method
public void updateTime ( ) {
/* .locals 3 */
/* .prologue */
/* .line 140 */
v0 = this.handlerData;
(( de.hellowins.game.data.HellowinsResponseData ) v0 ).getUser ( ); // invoke-virtual {v0}, Lde/hellowins/game/data/HellowinsResponseData;->getUser()Lde/hellowins/game/data/HellowinsUserData;
/* const-wide/16 v1, 0x1f4 */
(( de.hellowins.game.data.HellowinsUserData ) v0 ).calcPlayTime ( v1, v2 ); // invoke-virtual {v0, v1, v2}, Lde/hellowins/game/data/HellowinsUserData;->calcPlayTime(J)V
/* .line 141 */
return;
} // .end method
