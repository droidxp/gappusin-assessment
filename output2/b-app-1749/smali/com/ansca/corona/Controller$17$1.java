class com.ansca.corona.Controller$17$1 implements com.facebook.android.Facebook$DialogListener {
	 /* .source "Controller.java" */
	 /* # interfaces */
	 /* # annotations */
	 /* .annotation system Ldalvik/annotation/EnclosingMethod; */
	 /* value = Lcom/ansca/corona/Controller$17;->run()V */
} // .end annotation
/* .annotation system Ldalvik/annotation/InnerClass; */
/* accessFlags = 0x0 */
/* name = null */
} // .end annotation
/* # instance fields */
final com.ansca.corona.Controller$17 this$1; //synthetic
/* # direct methods */
 com.ansca.corona.Controller$17$1 ( ) {
/* .locals 0 */
/* .prologue */
/* .line 1111 */
this.this$1 = p1;
/* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
return;
} // .end method
private void storeLoginInfo ( ) {
/* .locals 4 */
/* .prologue */
/* .line 1149 */
v1 = this.this$1;
v1 = this.this$0;
com.ansca.corona.Controller .access$300 ( v1 );
if ( v1 != null) { // if-eqz v1, :cond_0
	 /* .line 1150 */
	 v1 = this.this$1;
	 v1 = this.this$0;
	 com.ansca.corona.Controller .access$300 ( v1 );
	 final String v2 = "facebook-session"; // const-string v2, "facebook-session"
	 int v3 = 0; // const/4 v3, 0x0
	 (( com.ansca.corona.CoronaActivity ) v1 ).getSharedPreferences ( v2, v3 ); // invoke-virtual {v1, v2, v3}, Lcom/ansca/corona/CoronaActivity;->getSharedPreferences(Ljava/lang/String;I)Landroid/content/SharedPreferences;
	 /* .line 1152 */
	 /* .local v0, "editor":Landroid/content/SharedPreferences$Editor; */
	 if ( v0 != null) { // if-eqz v0, :cond_0
		 /* .line 1153 */
		 final String v1 = "access_token"; // const-string v1, "access_token"
		 v2 = this.this$1;
		 v2 = this.this$0;
		 com.ansca.corona.Controller .access$600 ( v2 );
		 (( com.facebook.android.Facebook ) v2 ).getAccessToken ( ); // invoke-virtual {v2}, Lcom/facebook/android/Facebook;->getAccessToken()Ljava/lang/String;
		 /* .line 1154 */
		 final String v1 = "expires_in"; // const-string v1, "expires_in"
		 v2 = this.this$1;
		 v2 = this.this$0;
		 com.ansca.corona.Controller .access$600 ( v2 );
		 (( com.facebook.android.Facebook ) v2 ).getAccessExpires ( ); // invoke-virtual {v2}, Lcom/facebook/android/Facebook;->getAccessExpires()J
		 /* move-result-wide v2 */
		 /* .line 1155 */
		 /* .line 1158 */
	 } // .end local v0 # "editor":Landroid/content/SharedPreferences$Editor;
} // :cond_0
return;
} // .end method
/* # virtual methods */
public void onCancel ( ) {
/* .locals 2 */
/* .prologue */
/* .line 1141 */
v0 = com.ansca.corona.Controller .isValid ( );
if ( v0 != null) { // if-eqz v0, :cond_0
	 /* .line 1142 */
	 /* invoke-direct {p0}, Lcom/ansca/corona/Controller$17$1;->storeLoginInfo()V */
	 /* .line 1143 */
	 com.ansca.corona.Controller .getEventManager ( );
	 int v1 = 2; // const/4 v1, 0x2
	 (( com.ansca.corona.events.EventManager ) v0 ).fbConnectSessionEvent ( v1 ); // invoke-virtual {v0, v1}, Lcom/ansca/corona/events/EventManager;->fbConnectSessionEvent(I)V
	 /* .line 1145 */
} // :cond_0
return;
} // .end method
public void onComplete ( android.os.Bundle p0 ) {
/* .locals 5 */
/* .param p1, "values" # Landroid/os/Bundle; */
/* .prologue */
/* .line 1113 */
v0 = com.ansca.corona.Controller .isValid ( );
if ( v0 != null) { // if-eqz v0, :cond_0
	 /* .line 1114 */
	 v0 = this.this$1;
	 v0 = this.this$0;
	 com.ansca.corona.Controller .access$600 ( v0 );
	 v0 = 	 (( com.facebook.android.Facebook ) v0 ).isSessionValid ( ); // invoke-virtual {v0}, Lcom/facebook/android/Facebook;->isSessionValid()Z
	 if ( v0 != null) { // if-eqz v0, :cond_1
		 /* .line 1116 */
		 /* invoke-direct {p0}, Lcom/ansca/corona/Controller$17$1;->storeLoginInfo()V */
		 /* .line 1117 */
		 com.ansca.corona.Controller .getEventManager ( );
		 int v1 = 0; // const/4 v1, 0x0
		 v2 = this.this$1;
		 v2 = this.this$0;
		 com.ansca.corona.Controller .access$600 ( v2 );
		 (( com.facebook.android.Facebook ) v2 ).getAccessToken ( ); // invoke-virtual {v2}, Lcom/facebook/android/Facebook;->getAccessToken()Ljava/lang/String;
		 v3 = this.this$1;
		 v3 = this.this$0;
		 com.ansca.corona.Controller .access$600 ( v3 );
		 (( com.facebook.android.Facebook ) v3 ).getAccessExpires ( ); // invoke-virtual {v3}, Lcom/facebook/android/Facebook;->getAccessExpires()J
		 /* move-result-wide v3 */
		 (( com.ansca.corona.events.EventManager ) v0 ).fbConnectSessionEvent ( v1, v2, v3, v4 ); // invoke-virtual {v0, v1, v2, v3, v4}, Lcom/ansca/corona/events/EventManager;->fbConnectSessionEvent(ILjava/lang/String;J)V
		 /* .line 1127 */
	 } // :cond_0
} // :goto_0
return;
/* .line 1124 */
} // :cond_1
(( com.ansca.corona.Controller$17$1 ) p0 ).onCancel ( ); // invoke-virtual {p0}, Lcom/ansca/corona/Controller$17$1;->onCancel()V
} // .end method
public void onError ( com.facebook.android.DialogError p0 ) {
/* .locals 2 */
/* .param p1, "e" # Lcom/facebook/android/DialogError; */
/* .prologue */
/* .line 1135 */
v0 = com.ansca.corona.Controller .isValid ( );
if ( v0 != null) { // if-eqz v0, :cond_0
/* .line 1136 */
/* invoke-direct {p0}, Lcom/ansca/corona/Controller$17$1;->storeLoginInfo()V */
/* .line 1137 */
com.ansca.corona.Controller .getEventManager ( );
(( com.facebook.android.DialogError ) p1 ).getLocalizedMessage ( ); // invoke-virtual {p1}, Lcom/facebook/android/DialogError;->getLocalizedMessage()Ljava/lang/String;
(( com.ansca.corona.events.EventManager ) v0 ).fbConnectSessionEventError ( v1 ); // invoke-virtual {v0, v1}, Lcom/ansca/corona/events/EventManager;->fbConnectSessionEventError(Ljava/lang/String;)V
/* .line 1139 */
} // :cond_0
return;
} // .end method
public void onFacebookError ( com.facebook.android.FacebookError p0 ) {
/* .locals 2 */
/* .param p1, "e" # Lcom/facebook/android/FacebookError; */
/* .prologue */
/* .line 1129 */
v0 = com.ansca.corona.Controller .isValid ( );
if ( v0 != null) { // if-eqz v0, :cond_0
/* .line 1130 */
/* invoke-direct {p0}, Lcom/ansca/corona/Controller$17$1;->storeLoginInfo()V */
/* .line 1131 */
com.ansca.corona.Controller .getEventManager ( );
(( com.facebook.android.FacebookError ) p1 ).getLocalizedMessage ( ); // invoke-virtual {p1}, Lcom/facebook/android/FacebookError;->getLocalizedMessage()Ljava/lang/String;
(( com.ansca.corona.events.EventManager ) v0 ).fbConnectSessionEventError ( v1 ); // invoke-virtual {v0, v1}, Lcom/ansca/corona/events/EventManager;->fbConnectSessionEventError(Ljava/lang/String;)V
/* .line 1133 */
} // :cond_0
return;
} // .end method
