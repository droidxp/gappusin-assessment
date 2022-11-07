class de.hellowins.HwDataStore {
	 /* .source "HwDataStore.java" */
	 /* # instance fields */
	 protected java.lang.String _apiUri;
	 protected java.lang.String _challengeId;
	 protected _key;
	 protected Integer _level;
	 protected java.lang.String _myPlayerId;
	 protected Integer _pointType;
	 protected Integer _pointValue;
	 protected java.lang.String _sessionCookie;
	 protected java.lang.String _wsUri;
	 protected Integer currentHighscore;
	 protected java.lang.String encKey;
	 protected Boolean gameFinished;
	 protected Boolean gameRunning;
	 public Boolean initialized;
	 /* # direct methods */
	 de.hellowins.HwDataStore ( ) {
		 /* .locals 2 */
		 /* .prologue */
		 int v1 = 0; // const/4 v1, 0x0
		 /* .line 35 */
		 /* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
		 /* .line 9 */
		 final String v0 = ""; // const-string v0, ""
		 this._sessionCookie = v0;
		 /* .line 10 */
		 final String v0 = ""; // const-string v0, ""
		 this._challengeId = v0;
		 /* .line 11 */
		 int v0 = 1; // const/4 v0, 0x1
		 /* iput v0, p0, Lde/hellowins/HwDataStore;->_level:I */
		 /* .line 13 */
		 /* iput-boolean v1, p0, Lde/hellowins/HwDataStore;->initialized:Z */
		 /* .line 15 */
		 final String v0 = ""; // const-string v0, ""
		 this._myPlayerId = v0;
		 /* .line 17 */
		 /* iput v1, p0, Lde/hellowins/HwDataStore;->_pointType:I */
		 /* .line 18 */
		 /* iput v1, p0, Lde/hellowins/HwDataStore;->_pointValue:I */
		 /* .line 21 */
		 final String v0 = ""; // const-string v0, ""
		 this._apiUri = v0;
		 /* .line 22 */
		 final String v0 = ""; // const-string v0, ""
		 this._wsUri = v0;
		 /* .line 24 */
		 final String v0 = ""; // const-string v0, ""
		 this.encKey = v0;
		 /* .line 26 */
		 /* iput-boolean v1, p0, Lde/hellowins/HwDataStore;->gameRunning:Z */
		 /* .line 28 */
		 /* iput-boolean v1, p0, Lde/hellowins/HwDataStore;->gameFinished:Z */
		 /* .line 30 */
		 /* iput v1, p0, Lde/hellowins/HwDataStore;->currentHighscore:I */
		 /* .line 37 */
		 return;
	 } // .end method
	 /* # virtual methods */
	 java.lang.String getApiUri ( ) {
		 /* .locals 1 */
		 /* .prologue */
		 /* .line 71 */
		 v0 = this._apiUri;
	 } // .end method
	 java.lang.String getChallengeId ( ) {
		 /* .locals 1 */
		 /* .prologue */
		 /* .line 121 */
		 v0 = this._challengeId;
	 } // .end method
	 java.lang.String getEncKey ( ) {
		 /* .locals 1 */
		 /* .prologue */
		 /* .line 189 */
		 v0 = this.encKey;
	 } // .end method
	 Integer getHighscore ( ) {
		 /* .locals 1 */
		 /* .prologue */
		 /* .line 64 */
		 /* iget v0, p0, Lde/hellowins/HwDataStore;->currentHighscore:I */
	 } // .end method
	 java.lang.String getKey ( ) {
		 /* .locals 3 */
		 /* .prologue */
		 /* .line 43 */
		 /* new-instance v0, Ljava/lang/String; */
		 v1 = this._key;
		 int v2 = 0; // const/4 v2, 0x0
		 android.util.Base64 .decode ( v1,v2 );
		 /* invoke-direct {v0, v1}, Ljava/lang/String;-><init>([B)V */
	 } // .end method
	 Integer getLevel ( ) {
		 /* .locals 1 */
		 /* .prologue */
		 /* .line 137 */
		 /* iget v0, p0, Lde/hellowins/HwDataStore;->_level:I */
	 } // .end method
	 java.lang.String getPlayerId ( ) {
		 /* .locals 1 */
		 /* .prologue */
		 /* .line 153 */
		 v0 = this._myPlayerId;
	 } // .end method
	 Integer getPointValue ( ) {
		 /* .locals 1 */
		 /* .prologue */
		 /* .line 170 */
		 /* iget v0, p0, Lde/hellowins/HwDataStore;->_pointValue:I */
	 } // .end method
	 java.lang.String getSessionCookie ( ) {
		 /* .locals 1 */
		 /* .prologue */
		 /* .line 102 */
		 v0 = this._sessionCookie;
	 } // .end method
	 java.lang.String getWsUri ( ) {
		 /* .locals 1 */
		 /* .prologue */
		 /* .line 85 */
		 v0 = this._wsUri;
	 } // .end method
	 void setApiUri ( java.lang.String p0 ) {
		 /* .locals 0 */
		 /* .param p1, "uri" # Ljava/lang/String; */
		 /* .prologue */
		 /* .line 78 */
		 this._apiUri = p1;
		 /* .line 79 */
		 return;
	 } // .end method
	 void setChallengeId ( java.lang.String p0 ) {
		 /* .locals 0 */
		 /* .param p1, "data" # Ljava/lang/String; */
		 /* .prologue */
		 /* .line 128 */
		 this._challengeId = p1;
		 /* .line 129 */
		 return;
	 } // .end method
	 void setEncKey ( java.lang.String p0 ) {
		 /* .locals 0 */
		 /* .param p1, "newKey" # Ljava/lang/String; */
		 /* .prologue */
		 /* .line 185 */
		 this.encKey = p1;
		 /* .line 186 */
		 return;
	 } // .end method
	 void setHighscore ( Integer p0 ) {
		 /* .locals 0 */
		 /* .param p1, "highscore" # I */
		 /* .prologue */
		 /* .line 57 */
		 /* iput p1, p0, Lde/hellowins/HwDataStore;->currentHighscore:I */
		 /* .line 58 */
		 return;
	 } // .end method
	 void setKey ( java.lang.String p0 ) {
		 /* .locals 2 */
		 /* .param p1, "key" # Ljava/lang/String; */
		 /* .prologue */
		 /* .line 50 */
		 (( java.lang.String ) p1 ).getBytes ( ); // invoke-virtual {p1}, Ljava/lang/String;->getBytes()[B
		 int v1 = 0; // const/4 v1, 0x0
		 android.util.Base64 .encode ( v0,v1 );
		 this._key = v0;
		 /* .line 51 */
		 return;
	 } // .end method
	 void setLevel ( Integer p0 ) {
		 /* .locals 0 */
		 /* .param p1, "data" # I */
		 /* .prologue */
		 /* .line 144 */
		 /* iput p1, p0, Lde/hellowins/HwDataStore;->_level:I */
		 /* .line 145 */
		 return;
	 } // .end method
	 void setPlayerId ( java.lang.String p0 ) {
		 /* .locals 0 */
		 /* .param p1, "data" # Ljava/lang/String; */
		 /* .prologue */
		 /* .line 160 */
		 this._myPlayerId = p1;
		 /* .line 161 */
		 return;
	 } // .end method
	 void setPointValue ( Integer p0 ) {
		 /* .locals 0 */
		 /* .param p1, "type" # I */
		 /* .prologue */
		 /* .line 177 */
		 /* iput p1, p0, Lde/hellowins/HwDataStore;->_pointValue:I */
		 /* .line 178 */
		 return;
	 } // .end method
	 void setSessionCookie ( java.lang.String p0 ) {
		 /* .locals 0 */
		 /* .param p1, "data" # Ljava/lang/String; */
		 /* .prologue */
		 /* .line 109 */
		 this._sessionCookie = p1;
		 /* .line 110 */
		 return;
	 } // .end method
	 void setWsUri ( java.lang.String p0 ) {
		 /* .locals 0 */
		 /* .param p1, "uri" # Ljava/lang/String; */
		 /* .prologue */
		 /* .line 92 */
		 this._wsUri = p1;
		 /* .line 93 */
		 return;
	 } // .end method
