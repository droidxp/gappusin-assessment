class com.ansca.corona.Controller$20$1 implements com.facebook.android.Facebook$DialogListener {
	 /* .source "Controller.java" */
	 /* # interfaces */
	 /* # annotations */
	 /* .annotation system Ldalvik/annotation/EnclosingMethod; */
	 /* value = Lcom/ansca/corona/Controller$20;->run()V */
} // .end annotation
/* .annotation system Ldalvik/annotation/InnerClass; */
/* accessFlags = 0x0 */
/* name = null */
} // .end annotation
/* # instance fields */
final com.ansca.corona.Controller$20 this$1; //synthetic
/* # direct methods */
 com.ansca.corona.Controller$20$1 ( ) {
/* .locals 0 */
/* .prologue */
/* .line 1314 */
this.this$1 = p1;
/* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
return;
} // .end method
/* # virtual methods */
public void onCancel ( ) {
/* .locals 4 */
/* .prologue */
/* .line 1336 */
v0 = com.ansca.corona.Controller .isValid ( );
if ( v0 != null) { // if-eqz v0, :cond_0
	 /* .line 1337 */
	 com.ansca.corona.Controller .getEventManager ( );
	 final String v1 = "Dialog cancelled"; // const-string v1, "Dialog cancelled"
	 int v2 = 1; // const/4 v2, 0x1
	 int v3 = 0; // const/4 v3, 0x0
	 (( com.ansca.corona.events.EventManager ) v0 ).fbConnectRequestEvent ( v1, v2, v3 ); // invoke-virtual {v0, v1, v2, v3}, Lcom/ansca/corona/events/EventManager;->fbConnectRequestEvent(Ljava/lang/String;ZZ)V
	 /* .line 1339 */
} // :cond_0
return;
} // .end method
public void onComplete ( android.os.Bundle p0 ) {
/* .locals 4 */
/* .param p1, "values" # Landroid/os/Bundle; */
/* .prologue */
/* .line 1316 */
v0 = com.ansca.corona.Controller .isValid ( );
if ( v0 != null) { // if-eqz v0, :cond_0
	 /* .line 1317 */
	 if ( p1 != null) { // if-eqz p1, :cond_1
		 v0 = 		 (( android.os.Bundle ) p1 ).size ( ); // invoke-virtual {p1}, Landroid/os/Bundle;->size()I
		 /* if-lez v0, :cond_1 */
		 /* .line 1318 */
		 com.ansca.corona.Controller .getEventManager ( );
		 final String v1 = ""; // const-string v1, ""
		 int v2 = 0; // const/4 v2, 0x0
		 int v3 = 1; // const/4 v3, 0x1
		 (( com.ansca.corona.events.EventManager ) v0 ).fbConnectRequestEvent ( v1, v2, v3 ); // invoke-virtual {v0, v1, v2, v3}, Lcom/ansca/corona/events/EventManager;->fbConnectRequestEvent(Ljava/lang/String;ZZ)V
		 /* .line 1324 */
	 } // :cond_0
} // :goto_0
return;
/* .line 1321 */
} // :cond_1
(( com.ansca.corona.Controller$20$1 ) p0 ).onCancel ( ); // invoke-virtual {p0}, Lcom/ansca/corona/Controller$20$1;->onCancel()V
} // .end method
public void onError ( com.facebook.android.DialogError p0 ) {
/* .locals 4 */
/* .param p1, "e" # Lcom/facebook/android/DialogError; */
/* .prologue */
/* .line 1331 */
v0 = com.ansca.corona.Controller .isValid ( );
if ( v0 != null) { // if-eqz v0, :cond_0
/* .line 1332 */
com.ansca.corona.Controller .getEventManager ( );
(( com.facebook.android.DialogError ) p1 ).getLocalizedMessage ( ); // invoke-virtual {p1}, Lcom/facebook/android/DialogError;->getLocalizedMessage()Ljava/lang/String;
int v2 = 1; // const/4 v2, 0x1
int v3 = 0; // const/4 v3, 0x0
(( com.ansca.corona.events.EventManager ) v0 ).fbConnectRequestEvent ( v1, v2, v3 ); // invoke-virtual {v0, v1, v2, v3}, Lcom/ansca/corona/events/EventManager;->fbConnectRequestEvent(Ljava/lang/String;ZZ)V
/* .line 1334 */
} // :cond_0
return;
} // .end method
public void onFacebookError ( com.facebook.android.FacebookError p0 ) {
/* .locals 4 */
/* .param p1, "e" # Lcom/facebook/android/FacebookError; */
/* .prologue */
/* .line 1326 */
v0 = com.ansca.corona.Controller .isValid ( );
if ( v0 != null) { // if-eqz v0, :cond_0
/* .line 1327 */
com.ansca.corona.Controller .getEventManager ( );
(( com.facebook.android.FacebookError ) p1 ).getLocalizedMessage ( ); // invoke-virtual {p1}, Lcom/facebook/android/FacebookError;->getLocalizedMessage()Ljava/lang/String;
int v2 = 1; // const/4 v2, 0x1
int v3 = 0; // const/4 v3, 0x0
(( com.ansca.corona.events.EventManager ) v0 ).fbConnectRequestEvent ( v1, v2, v3 ); // invoke-virtual {v0, v1, v2, v3}, Lcom/ansca/corona/events/EventManager;->fbConnectRequestEvent(Ljava/lang/String;ZZ)V
/* .line 1329 */
} // :cond_0
return;
} // .end method
