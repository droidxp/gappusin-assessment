public class com.adknowledge.superrewards.model.SRUserPoints {
	 /* .source "SRUserPoints.java" */
	 /* # instance fields */
	 private android.content.Context ctx;
	 private Integer newpoints;
	 private Integer totalpoints;
	 /* # direct methods */
	 public com.adknowledge.superrewards.model.SRUserPoints ( ) {
		 /* .locals 1 */
		 /* .param p1, "ctx" # Landroid/content/Context; */
		 /* .prologue */
		 int v0 = 0; // const/4 v0, 0x0
		 /* .line 20 */
		 /* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
		 /* .line 17 */
		 /* iput v0, p0, Lcom/adknowledge/superrewards/model/SRUserPoints;->newpoints:I */
		 /* .line 18 */
		 /* iput v0, p0, Lcom/adknowledge/superrewards/model/SRUserPoints;->totalpoints:I */
		 /* .line 21 */
		 this.ctx = p1;
		 /* .line 22 */
		 return;
	 } // .end method
	 /* # virtual methods */
	 public Integer getNewPoints ( ) {
		 /* .locals 1 */
		 /* .prologue */
		 /* .line 48 */
		 /* iget v0, p0, Lcom/adknowledge/superrewards/model/SRUserPoints;->newpoints:I */
	 } // .end method
	 public Integer getTotalPoints ( ) {
		 /* .locals 1 */
		 /* .prologue */
		 /* .line 52 */
		 /* iget v0, p0, Lcom/adknowledge/superrewards/model/SRUserPoints;->totalpoints:I */
	 } // .end method
	 public Boolean updatePoints ( java.lang.String p0, java.lang.String p1 ) {
		 /* .locals 9 */
		 /* .param p1, "hparam" # Ljava/lang/String; */
		 /* .param p2, "uid" # Ljava/lang/String; */
		 /* .prologue */
		 int v5 = 0; // const/4 v5, 0x0
		 /* .line 27 */
		 v6 = this.ctx;
		 com.adknowledge.superrewards.tracking.SRAppInstallTracker .getInstance ( v6,p1 );
		 /* .line 29 */
		 /* .local v4, "tracker":Lcom/adknowledge/superrewards/tracking/SRAppInstallTracker; */
		 com.adknowledge.superrewards.web.SRClient .getInstance ( );
		 (( com.adknowledge.superrewards.web.SRClient ) v6 ).createRequest ( ); // invoke-virtual {v6}, Lcom/adknowledge/superrewards/web/SRClient;->createRequest()Lcom/adknowledge/superrewards/web/SRRequest;
		 /* .line 30 */
		 /* .local v3, "request":Lcom/adknowledge/superrewards/web/SRRequest; */
		 v6 = com.adknowledge.superrewards.web.SRRequest$Command.METHOD;
		 (( com.adknowledge.superrewards.web.SRRequest ) v3 ).setCommand ( v6 ); // invoke-virtual {v3, v6}, Lcom/adknowledge/superrewards/web/SRRequest;->setCommand(Lcom/adknowledge/superrewards/web/SRRequest$Command;)V
		 /* .line 31 */
		 v6 = com.adknowledge.superrewards.web.SRRequest$Call.CHECK_POINTS;
		 (( com.adknowledge.superrewards.web.SRRequest ) v3 ).setCall ( v6 ); // invoke-virtual {v3, v6}, Lcom/adknowledge/superrewards/web/SRRequest;->setCall(Lcom/adknowledge/superrewards/web/SRRequest$Call;)V
		 /* .line 32 */
		 final String v6 = "uid"; // const-string v6, "uid"
		 (( com.adknowledge.superrewards.web.SRRequest ) v3 ).addInnerParam ( v6, p2 ); // invoke-virtual {v3, v6, p2}, Lcom/adknowledge/superrewards/web/SRRequest;->addInnerParam(Ljava/lang/String;Ljava/lang/String;)V
		 /* .line 33 */
		 v6 = this.ctx;
		 v6 = 		 com.adknowledge.superrewards.Utils .isOnline ( v6 );
		 if ( v6 != null) { // if-eqz v6, :cond_0
			 v6 = this.ctx;
			 v6 = 			 (( com.adknowledge.superrewards.web.SRRequest ) v3 ).execute ( v6, p1 ); // invoke-virtual {v3, v6, p1}, Lcom/adknowledge/superrewards/web/SRRequest;->execute(Landroid/content/Context;Ljava/lang/String;)Z
			 /* if-nez v6, :cond_1 */
			 /* .line 44 */
		 } // :cond_0
	 } // :goto_0
	 /* .line 35 */
} // :cond_1
try { // :try_start_0
	 /* new-instance v2, Lorg/json/JSONObject; */
	 (( com.adknowledge.superrewards.web.SRRequest ) v3 ).getResult ( ); // invoke-virtual {v3}, Lcom/adknowledge/superrewards/web/SRRequest;->getResult()Ljava/lang/String;
	 /* invoke-direct {v2, v6}, Lorg/json/JSONObject;-><init>(Ljava/lang/String;)V */
	 /* .line 37 */
	 /* .local v2, "json":Lorg/json/JSONObject; */
	 final String v6 = "data"; // const-string v6, "data"
	 (( org.json.JSONObject ) v2 ).getJSONObject ( v6 ); // invoke-virtual {v2, v6}, Lorg/json/JSONObject;->getJSONObject(Ljava/lang/String;)Lorg/json/JSONObject;
	 /* .line 38 */
	 /* .local v1, "innerjson":Lorg/json/JSONObject; */
	 final String v6 = "new"; // const-string v6, "new"
	 v6 = 	 (( org.json.JSONObject ) v1 ).getInt ( v6 ); // invoke-virtual {v1, v6}, Lorg/json/JSONObject;->getInt(Ljava/lang/String;)I
	 /* iput v6, p0, Lcom/adknowledge/superrewards/model/SRUserPoints;->newpoints:I */
	 /* .line 39 */
	 final String v6 = "total"; // const-string v6, "total"
	 v6 = 	 (( org.json.JSONObject ) v1 ).getInt ( v6 ); // invoke-virtual {v1, v6}, Lorg/json/JSONObject;->getInt(Ljava/lang/String;)I
	 /* iput v6, p0, Lcom/adknowledge/superrewards/model/SRUserPoints;->totalpoints:I */
	 /* :try_end_0 */
	 /* .catch Lorg/json/JSONException; {:try_start_0 ..:try_end_0} :catch_0 */
	 /* .line 40 */
	 int v5 = 1; // const/4 v5, 0x1
	 /* .line 41 */
} // .end local v1 # "innerjson":Lorg/json/JSONObject;
} // .end local v2 # "json":Lorg/json/JSONObject;
/* :catch_0 */
/* move-exception v0 */
/* .line 42 */
/* .local v0, "e":Lorg/json/JSONException; */
v6 = this.ctx;
final String v7 = "There was a communication problem.Please try again later."; // const-string v7, "There was a communication problem.Please try again later."
/* const/16 v8, 0x7d0 */
android.widget.Toast .makeText ( v6,v7,v8 );
(( android.widget.Toast ) v6 ).show ( ); // invoke-virtual {v6}, Landroid/widget/Toast;->show()V
} // .end method
