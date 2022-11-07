public abstract class com.ansca.corona.purchasing.Store {
	 /* .source "Store.java" */
	 /* # instance fields */
	 private android.app.Activity fActivity;
	 private Boolean fIsEnabled;
	 /* # direct methods */
	 public com.ansca.corona.purchasing.Store ( ) {
		 /* .locals 1 */
		 /* .prologue */
		 /* .line 19 */
		 /* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
		 /* .line 21 */
		 int v0 = 0; // const/4 v0, 0x0
		 /* iput-boolean v0, p0, Lcom/ansca/corona/purchasing/Store;->fIsEnabled:Z */
		 /* .line 22 */
		 int v0 = 0; // const/4 v0, 0x0
		 this.fActivity = v0;
		 /* .line 23 */
		 return;
	 } // .end method
	 /* # virtual methods */
	 public abstract Boolean canMakePurchases ( ) {
	 } // .end method
	 public abstract void confirmTransaction ( java.lang.String p0 ) {
	 } // .end method
	 public void disable ( ) {
		 /* .locals 1 */
		 /* .prologue */
		 /* .line 67 */
		 /* iget-boolean v0, p0, Lcom/ansca/corona/purchasing/Store;->fIsEnabled:Z */
		 /* if-nez v0, :cond_0 */
		 /* .line 74 */
	 } // :goto_0
	 return;
	 /* .line 72 */
} // :cond_0
int v0 = 0; // const/4 v0, 0x0
/* iput-boolean v0, p0, Lcom/ansca/corona/purchasing/Store;->fIsEnabled:Z */
/* .line 73 */
(( com.ansca.corona.purchasing.Store ) p0 ).onDisabled ( ); // invoke-virtual {p0}, Lcom/ansca/corona/purchasing/Store;->onDisabled()V
} // .end method
public void enable ( ) {
/* .locals 1 */
/* .prologue */
/* .line 44 */
/* iget-boolean v0, p0, Lcom/ansca/corona/purchasing/Store;->fIsEnabled:Z */
if ( v0 != null) { // if-eqz v0, :cond_0
	 /* .line 56 */
} // :goto_0
return;
/* .line 49 */
} // :cond_0
v0 = this.fActivity;
/* if-nez v0, :cond_1 */
/* .line 50 */
/* new-instance v0, Ljava/lang/IllegalStateException; */
/* invoke-direct {v0}, Ljava/lang/IllegalStateException;-><init>()V */
/* throw v0 */
/* .line 54 */
} // :cond_1
int v0 = 1; // const/4 v0, 0x1
/* iput-boolean v0, p0, Lcom/ansca/corona/purchasing/Store;->fIsEnabled:Z */
/* .line 55 */
(( com.ansca.corona.purchasing.Store ) p0 ).onEnabled ( ); // invoke-virtual {p0}, Lcom/ansca/corona/purchasing/Store;->onEnabled()V
} // .end method
public android.app.Activity getActivity ( ) {
/* .locals 1 */
/* .prologue */
/* .line 38 */
v0 = this.fActivity;
} // .end method
public Boolean isDisabled ( ) {
/* .locals 1 */
/* .prologue */
/* .line 97 */
/* iget-boolean v0, p0, Lcom/ansca/corona/purchasing/Store;->fIsEnabled:Z */
/* if-nez v0, :cond_0 */
int v0 = 1; // const/4 v0, 0x1
} // :goto_0
} // :cond_0
int v0 = 0; // const/4 v0, 0x0
} // .end method
public Boolean isEnabled ( ) {
/* .locals 1 */
/* .prologue */
/* .line 88 */
/* iget-boolean v0, p0, Lcom/ansca/corona/purchasing/Store;->fIsEnabled:Z */
} // .end method
protected void onDisabled ( ) {
/* .locals 0 */
/* .prologue */
/* .line 81 */
return;
} // .end method
protected abstract void onEnabled ( ) {
} // .end method
public abstract void purchase ( java.lang.String p0 ) {
} // .end method
protected void raiseTransactionEventFor ( com.ansca.corona.purchasing.StoreTransactionResultSettings p0 ) {
/* .locals 3 */
/* .param p1, "result" # Lcom/ansca/corona/purchasing/StoreTransactionResultSettings; */
/* .prologue */
/* .line 127 */
/* if-nez p1, :cond_1 */
/* .line 146 */
} // :cond_0
} // :goto_0
return;
/* .line 132 */
} // :cond_1
com.ansca.corona.Controller .getEventManager ( );
/* .line 133 */
/* .local v0, "eventManager":Lcom/ansca/corona/events/EventManager; */
if ( v0 != null) { // if-eqz v0, :cond_0
/* .line 138 */
/* new-instance v1, Lcom/ansca/corona/events/RunnableEvent; */
/* new-instance v2, Lcom/ansca/corona/purchasing/Store$1; */
/* invoke-direct {v2, p0, p1}, Lcom/ansca/corona/purchasing/Store$1;-><init>(Lcom/ansca/corona/purchasing/Store;Lcom/ansca/corona/purchasing/StoreTransactionResultSettings;)V */
/* invoke-direct {v1, v2}, Lcom/ansca/corona/events/RunnableEvent;-><init>(Ljava/lang/Runnable;)V */
(( com.ansca.corona.events.EventManager ) v0 ).addEvent ( v1 ); // invoke-virtual {v0, v1}, Lcom/ansca/corona/events/EventManager;->addEvent(Lcom/ansca/corona/events/Event;)V
} // .end method
public abstract void restorePurchases ( ) {
} // .end method
public void setActivity ( android.app.Activity p0 ) {
/* .locals 0 */
/* .param p1, "activity" # Landroid/app/Activity; */
/* .prologue */
/* .line 30 */
this.fActivity = p1;
/* .line 31 */
return;
} // .end method
