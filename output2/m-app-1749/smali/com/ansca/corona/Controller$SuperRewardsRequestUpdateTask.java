class com.ansca.corona.Controller$SuperRewardsRequestUpdateTask extends android.os.AsyncTask {
	 /* .source "Controller.java" */
	 /* # annotations */
	 /* .annotation system Ldalvik/annotation/EnclosingClass; */
	 /* value = Lcom/ansca/corona/Controller; */
} // .end annotation
/* .annotation system Ldalvik/annotation/InnerClass; */
/* accessFlags = 0x2 */
/* name = "SuperRewardsRequestUpdateTask" */
} // .end annotation
/* .annotation system Ldalvik/annotation/Signature; */
/* value = { */
/* "Landroid/os/AsyncTask", */
/* "<", */
/* "Lcom/adknowledge/superrewards/model/SRUserPoints;", */
/* "Ljava/lang/Void;", */
/* "Lcom/adknowledge/superrewards/model/SRUserPoints;", */
/* ">;" */
/* } */
} // .end annotation
/* # instance fields */
private java.lang.String myAppId;
private java.lang.String myUid;
final com.ansca.corona.Controller this$0; //synthetic
/* # direct methods */
public com.ansca.corona.Controller$SuperRewardsRequestUpdateTask ( ) {
/* .locals 0 */
/* .param p2, "appId" # Ljava/lang/String; */
/* .param p3, "uid" # Ljava/lang/String; */
/* .prologue */
/* .line 1523 */
this.this$0 = p1;
/* invoke-direct {p0}, Landroid/os/AsyncTask;-><init>()V */
/* .line 1524 */
this.myAppId = p2;
/* .line 1525 */
this.myUid = p3;
/* .line 1526 */
return;
} // .end method
/* # virtual methods */
protected com.adknowledge.superrewards.model.SRUserPoints doInBackground ( com.adknowledge.superrewards.model.SRUserPoints...p0 ) {
/* .locals 4 */
/* .param p1, "user" # [Lcom/adknowledge/superrewards/model/SRUserPoints; */
/* .prologue */
int v3 = 0; // const/4 v3, 0x0
/* .line 1529 */
/* aget-object v0, p1, v3 */
v1 = this.myAppId;
v2 = this.myUid;
(( com.adknowledge.superrewards.model.SRUserPoints ) v0 ).updatePoints ( v1, v2 ); // invoke-virtual {v0, v1, v2}, Lcom/adknowledge/superrewards/model/SRUserPoints;->updatePoints(Ljava/lang/String;Ljava/lang/String;)Z
/* .line 1530 */
/* aget-object v0, p1, v3 */
} // .end method
protected java.lang.Object doInBackground ( java.lang.Object[] p0 ) { //bridge//synthethic
/* .locals 1 */
/* .param p1, "x0" # [Ljava/lang/Object; */
/* .prologue */
/* .line 1518 */
/* check-cast p1, [Lcom/adknowledge/superrewards/model/SRUserPoints; */
} // .end local p1 # "x0":[Ljava/lang/Object;
(( com.ansca.corona.Controller$SuperRewardsRequestUpdateTask ) p0 ).doInBackground ( p1 ); // invoke-virtual {p0, p1}, Lcom/ansca/corona/Controller$SuperRewardsRequestUpdateTask;->doInBackground([Lcom/adknowledge/superrewards/model/SRUserPoints;)Lcom/adknowledge/superrewards/model/SRUserPoints;
} // .end method
protected void onPostExecute ( com.adknowledge.superrewards.model.SRUserPoints p0 ) {
/* .locals 4 */
/* .param p1, "result" # Lcom/adknowledge/superrewards/model/SRUserPoints; */
/* .prologue */
/* .line 1534 */
v1 = (( com.adknowledge.superrewards.model.SRUserPoints ) p1 ).getNewPoints ( ); // invoke-virtual {p1}, Lcom/adknowledge/superrewards/model/SRUserPoints;->getNewPoints()I
/* .line 1535 */
/* .local v1, "newPoints":I */
v2 = (( com.adknowledge.superrewards.model.SRUserPoints ) p1 ).getTotalPoints ( ); // invoke-virtual {p1}, Lcom/adknowledge/superrewards/model/SRUserPoints;->getTotalPoints()I
/* .line 1536 */
/* .local v2, "totalPoints":I */
com.ansca.corona.Controller .getActivity ( );
/* .line 1537 */
/* .local v0, "activity":Lcom/ansca/corona/CoronaActivity; */
/* new-instance v3, Lcom/ansca/corona/Controller$SuperRewardsRequestUpdateTask$1; */
/* invoke-direct {v3, p0, v1, v2}, Lcom/ansca/corona/Controller$SuperRewardsRequestUpdateTask$1;-><init>(Lcom/ansca/corona/Controller$SuperRewardsRequestUpdateTask;II)V */
(( com.ansca.corona.CoronaActivity ) v0 ).runOnUiThread ( v3 ); // invoke-virtual {v0, v3}, Lcom/ansca/corona/CoronaActivity;->runOnUiThread(Ljava/lang/Runnable;)V
/* .line 1544 */
return;
} // .end method
protected void onPostExecute ( java.lang.Object p0 ) { //bridge//synthethic
/* .locals 0 */
/* .param p1, "x0" # Ljava/lang/Object; */
/* .prologue */
/* .line 1518 */
/* check-cast p1, Lcom/adknowledge/superrewards/model/SRUserPoints; */
} // .end local p1 # "x0":Ljava/lang/Object;
(( com.ansca.corona.Controller$SuperRewardsRequestUpdateTask ) p0 ).onPostExecute ( p1 ); // invoke-virtual {p0, p1}, Lcom/ansca/corona/Controller$SuperRewardsRequestUpdateTask;->onPostExecute(Lcom/adknowledge/superrewards/model/SRUserPoints;)V
return;
} // .end method
