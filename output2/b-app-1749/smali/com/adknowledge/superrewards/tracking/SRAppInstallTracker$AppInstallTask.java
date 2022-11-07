class com.adknowledge.superrewards.tracking.SRAppInstallTracker$AppInstallTask extends android.os.AsyncTask {
	 /* .source "SRAppInstallTracker.java" */
	 /* # annotations */
	 /* .annotation system Ldalvik/annotation/EnclosingClass; */
	 /* value = Lcom/adknowledge/superrewards/tracking/SRAppInstallTracker; */
} // .end annotation
/* .annotation system Ldalvik/annotation/InnerClass; */
/* accessFlags = 0x2 */
/* name = "AppInstallTask" */
} // .end annotation
/* .annotation system Ldalvik/annotation/Signature; */
/* value = { */
/* "Landroid/os/AsyncTask", */
/* "<", */
/* "Ljava/lang/Void;", */
/* "Ljava/lang/Void;", */
/* "Ljava/lang/String;", */
/* ">;" */
/* } */
} // .end annotation
/* # instance fields */
final com.adknowledge.superrewards.tracking.SRAppInstallTracker this$0; //synthetic
/* # direct methods */
private com.adknowledge.superrewards.tracking.SRAppInstallTracker$AppInstallTask ( ) {
/* .locals 0 */
/* .prologue */
/* .line 103 */
this.this$0 = p1;
/* invoke-direct {p0}, Landroid/os/AsyncTask;-><init>()V */
return;
} // .end method
 com.adknowledge.superrewards.tracking.SRAppInstallTracker$AppInstallTask ( ) { //synthethic
/* .locals 0 */
/* .param p1, "x0" # Lcom/adknowledge/superrewards/tracking/SRAppInstallTracker; */
/* .param p2, "x1" # Lcom/adknowledge/superrewards/tracking/SRAppInstallTracker$1; */
/* .prologue */
/* .line 103 */
/* invoke-direct {p0, p1}, Lcom/adknowledge/superrewards/tracking/SRAppInstallTracker$AppInstallTask;-><init>(Lcom/adknowledge/superrewards/tracking/SRAppInstallTracker;)V */
return;
} // .end method
/* # virtual methods */
protected java.lang.Object doInBackground ( java.lang.Object[] p0 ) { //bridge//synthethic
/* .locals 1 */
/* .param p1, "x0" # [Ljava/lang/Object; */
/* .prologue */
/* .line 103 */
/* check-cast p1, [Ljava/lang/Void; */
} // .end local p1 # "x0":[Ljava/lang/Object;
(( com.adknowledge.superrewards.tracking.SRAppInstallTracker$AppInstallTask ) p0 ).doInBackground ( p1 ); // invoke-virtual {p0, p1}, Lcom/adknowledge/superrewards/tracking/SRAppInstallTracker$AppInstallTask;->doInBackground([Ljava/lang/Void;)Ljava/lang/String;
} // .end method
protected java.lang.String doInBackground ( java.lang.Void...p0 ) {
/* .locals 4 */
/* .param p1, "params" # [Ljava/lang/Void; */
/* .prologue */
/* .line 107 */
com.adknowledge.superrewards.web.SRClient .getInstance ( );
(( com.adknowledge.superrewards.web.SRClient ) v1 ).createRequest ( ); // invoke-virtual {v1}, Lcom/adknowledge/superrewards/web/SRClient;->createRequest()Lcom/adknowledge/superrewards/web/SRRequest;
/* .line 108 */
/* .local v0, "request":Lcom/adknowledge/superrewards/web/SRRequest; */
v1 = com.adknowledge.superrewards.web.SRRequest$Command.METHOD;
(( com.adknowledge.superrewards.web.SRRequest ) v0 ).setCommand ( v1 ); // invoke-virtual {v0, v1}, Lcom/adknowledge/superrewards/web/SRRequest;->setCommand(Lcom/adknowledge/superrewards/web/SRRequest$Command;)V
/* .line 109 */
v1 = com.adknowledge.superrewards.web.SRRequest$Call.INSTALL;
(( com.adknowledge.superrewards.web.SRRequest ) v0 ).setCall ( v1 ); // invoke-virtual {v0, v1}, Lcom/adknowledge/superrewards/web/SRRequest;->setCall(Lcom/adknowledge/superrewards/web/SRRequest$Call;)V
/* .line 110 */
v1 = this.this$0;
v1 = this.ctx;
v1 = com.adknowledge.superrewards.Utils .isOnline ( v1 );
if ( v1 != null) { // if-eqz v1, :cond_0
v1 = this.this$0;
v1 = this.ctx;
v2 = this.this$0;
v2 = this.hparam;
v1 = (( com.adknowledge.superrewards.web.SRRequest ) v0 ).execute ( v1, v2 ); // invoke-virtual {v0, v1, v2}, Lcom/adknowledge/superrewards/web/SRRequest;->execute(Landroid/content/Context;Ljava/lang/String;)Z
/* if-nez v1, :cond_1 */
/* .line 111 */
} // :cond_0
int v1 = 0; // const/4 v1, 0x0
/* .line 114 */
} // :goto_0
/* .line 113 */
} // :cond_1
final String v1 = "SR"; // const-string v1, "SR"
/* new-instance v2, Ljava/lang/StringBuilder; */
/* invoke-direct {v2}, Ljava/lang/StringBuilder;-><init>()V */
final String v3 = "Result is "; // const-string v3, "Result is "
(( java.lang.StringBuilder ) v2 ).append ( v3 ); // invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( com.adknowledge.superrewards.web.SRRequest ) v0 ).getResult ( ); // invoke-virtual {v0}, Lcom/adknowledge/superrewards/web/SRRequest;->getResult()Ljava/lang/String;
(( java.lang.StringBuilder ) v2 ).append ( v3 ); // invoke-virtual {v2, v3}, Ljava/lang/StringBuilder;->append(Ljava/lang/String;)Ljava/lang/StringBuilder;
(( java.lang.StringBuilder ) v2 ).toString ( ); // invoke-virtual {v2}, Ljava/lang/StringBuilder;->toString()Ljava/lang/String;
android.util.Log .i ( v1,v2 );
/* .line 114 */
(( com.adknowledge.superrewards.web.SRRequest ) v0 ).getResult ( ); // invoke-virtual {v0}, Lcom/adknowledge/superrewards/web/SRRequest;->getResult()Ljava/lang/String;
} // .end method
protected void onPostExecute ( java.lang.Object p0 ) { //bridge//synthethic
/* .locals 0 */
/* .param p1, "x0" # Ljava/lang/Object; */
/* .prologue */
/* .line 103 */
/* check-cast p1, Ljava/lang/String; */
} // .end local p1 # "x0":Ljava/lang/Object;
(( com.adknowledge.superrewards.tracking.SRAppInstallTracker$AppInstallTask ) p0 ).onPostExecute ( p1 ); // invoke-virtual {p0, p1}, Lcom/adknowledge/superrewards/tracking/SRAppInstallTracker$AppInstallTask;->onPostExecute(Ljava/lang/String;)V
return;
} // .end method
protected void onPostExecute ( java.lang.String p0 ) {
/* .locals 2 */
/* .param p1, "result" # Ljava/lang/String; */
/* .prologue */
int v1 = 1; // const/4 v1, 0x1
/* .line 119 */
if ( p1 != null) { // if-eqz p1, :cond_0
v0 = this.this$0;
v0 = this.ctx;
com.adknowledge.superrewards.Utils .setRunFlag ( v0 );
/* .line 120 */
} // :cond_0
v0 = this.this$0;
v0 = (( com.adknowledge.superrewards.tracking.SRAppInstallTracker ) v0 ).getShowToast ( ); // invoke-virtual {v0}, Lcom/adknowledge/superrewards/tracking/SRAppInstallTracker;->getShowToast()Z
/* if-ne v0, v1, :cond_1 */
/* .line 121 */
v0 = this.this$0;
v0 = this.ctx;
android.widget.Toast .makeText ( v0,p1,v1 );
(( android.widget.Toast ) v0 ).show ( ); // invoke-virtual {v0}, Landroid/widget/Toast;->show()V
/* .line 123 */
} // :cond_1
return;
} // .end method
