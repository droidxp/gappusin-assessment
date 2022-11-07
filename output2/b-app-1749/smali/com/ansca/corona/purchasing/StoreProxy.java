public class com.ansca.corona.purchasing.StoreProxy extends com.ansca.corona.purchasing.Store {
	 /* .source "StoreProxy.java" */
	 /* # static fields */
	 private static final java.lang.String STORE_NOT_SUPPORTED_WARNING_MESSAGE;
	 /* # instance fields */
	 private com.ansca.corona.purchasing.Store fStore;
	 /* # direct methods */
	 public com.ansca.corona.purchasing.StoreProxy ( ) {
		 /* .locals 1 */
		 /* .prologue */
		 /* .line 23 */
		 /* invoke-direct {p0}, Lcom/ansca/corona/purchasing/Store;-><init>()V */
		 /* .line 25 */
		 int v0 = 0; // const/4 v0, 0x0
		 this.fStore = v0;
		 /* .line 26 */
		 return;
	 } // .end method
	 private void setStoreTo ( com.ansca.corona.purchasing.Store p0 ) {
		 /* .locals 2 */
		 /* .param p1, "store" # Lcom/ansca/corona/purchasing/Store; */
		 /* .prologue */
		 /* .line 79 */
		 v0 = this.fStore;
		 /* if-ne p1, v0, :cond_1 */
		 /* .line 99 */
	 } // :cond_0
} // :goto_0
return;
/* .line 84 */
} // :cond_1
v0 = this.fStore;
if ( v0 != null) { // if-eqz v0, :cond_2
/* .line 85 */
v0 = this.fStore;
(( com.ansca.corona.purchasing.Store ) v0 ).disable ( ); // invoke-virtual {v0}, Lcom/ansca/corona/purchasing/Store;->disable()V
/* .line 89 */
} // :cond_2
this.fStore = p1;
/* .line 90 */
v0 = this.fStore;
if ( v0 != null) { // if-eqz v0, :cond_0
/* .line 91 */
v0 = this.fStore;
(( com.ansca.corona.purchasing.StoreProxy ) p0 ).getActivity ( ); // invoke-virtual {p0}, Lcom/ansca/corona/purchasing/StoreProxy;->getActivity()Landroid/app/Activity;
(( com.ansca.corona.purchasing.Store ) v0 ).setActivity ( v1 ); // invoke-virtual {v0, v1}, Lcom/ansca/corona/purchasing/Store;->setActivity(Landroid/app/Activity;)V
/* .line 92 */
v0 = (( com.ansca.corona.purchasing.StoreProxy ) p0 ).isEnabled ( ); // invoke-virtual {p0}, Lcom/ansca/corona/purchasing/StoreProxy;->isEnabled()Z
if ( v0 != null) { // if-eqz v0, :cond_3
	 /* .line 93 */
	 v0 = this.fStore;
	 (( com.ansca.corona.purchasing.Store ) v0 ).enable ( ); // invoke-virtual {v0}, Lcom/ansca/corona/purchasing/Store;->enable()V
	 /* .line 96 */
} // :cond_3
v0 = this.fStore;
(( com.ansca.corona.purchasing.Store ) v0 ).disable ( ); // invoke-virtual {v0}, Lcom/ansca/corona/purchasing/Store;->disable()V
} // .end method
/* # virtual methods */
public Boolean canMakePurchases ( ) {
/* .locals 1 */
/* .prologue */
/* .line 130 */
v0 = this.fStore;
/* if-nez v0, :cond_0 */
/* .line 131 */
int v0 = 0; // const/4 v0, 0x0
/* .line 133 */
} // :goto_0
} // :cond_0
v0 = this.fStore;
v0 = (( com.ansca.corona.purchasing.Store ) v0 ).canMakePurchases ( ); // invoke-virtual {v0}, Lcom/ansca/corona/purchasing/Store;->canMakePurchases()Z
} // .end method
public void confirmTransaction ( java.lang.String p0 ) {
/* .locals 2 */
/* .param p1, "transactionStringId" # Ljava/lang/String; */
/* .prologue */
/* .line 180 */
v1 = this.fStore;
/* if-nez v1, :cond_0 */
/* .line 181 */
/* new-instance v0, Lcom/ansca/corona/purchasing/StoreTransactionResultSettings; */
/* invoke-direct {v0}, Lcom/ansca/corona/purchasing/StoreTransactionResultSettings;-><init>()V */
/* .line 182 */
/* .local v0, "result":Lcom/ansca/corona/purchasing/StoreTransactionResultSettings; */
v1 = com.ansca.corona.purchasing.StoreTransactionState.FAILED;
(( com.ansca.corona.purchasing.StoreTransactionResultSettings ) v0 ).setState ( v1 ); // invoke-virtual {v0, v1}, Lcom/ansca/corona/purchasing/StoreTransactionResultSettings;->setState(Lcom/ansca/corona/purchasing/StoreTransactionState;)V
/* .line 183 */
v1 = com.ansca.corona.purchasing.StoreTransactionErrorType.CLIENT_INVALID;
(( com.ansca.corona.purchasing.StoreTransactionResultSettings ) v0 ).setErrorType ( v1 ); // invoke-virtual {v0, v1}, Lcom/ansca/corona/purchasing/StoreTransactionResultSettings;->setErrorType(Lcom/ansca/corona/purchasing/StoreTransactionErrorType;)V
/* .line 184 */
final String v1 = "This application does not support in-app purchases on this device."; // const-string v1, "This application does not support in-app purchases on this device."
(( com.ansca.corona.purchasing.StoreTransactionResultSettings ) v0 ).setErrorMessage ( v1 ); // invoke-virtual {v0, v1}, Lcom/ansca/corona/purchasing/StoreTransactionResultSettings;->setErrorMessage(Ljava/lang/String;)V
/* .line 185 */
(( com.ansca.corona.purchasing.StoreTransactionResultSettings ) v0 ).setTransactionStringId ( p1 ); // invoke-virtual {v0, p1}, Lcom/ansca/corona/purchasing/StoreTransactionResultSettings;->setTransactionStringId(Ljava/lang/String;)V
/* .line 186 */
(( com.ansca.corona.purchasing.StoreProxy ) p0 ).raiseTransactionEventFor ( v0 ); // invoke-virtual {p0, v0}, Lcom/ansca/corona/purchasing/StoreProxy;->raiseTransactionEventFor(Lcom/ansca/corona/purchasing/StoreTransactionResultSettings;)V
/* .line 187 */
(( com.ansca.corona.purchasing.StoreProxy ) p0 ).logStoreNotSupportedWarning ( ); // invoke-virtual {p0}, Lcom/ansca/corona/purchasing/StoreProxy;->logStoreNotSupportedWarning()V
/* .line 193 */
} // .end local v0 # "result":Lcom/ansca/corona/purchasing/StoreTransactionResultSettings;
} // :goto_0
return;
/* .line 192 */
} // :cond_0
v1 = this.fStore;
(( com.ansca.corona.purchasing.Store ) v1 ).confirmTransaction ( p1 ); // invoke-virtual {v1, p1}, Lcom/ansca/corona/purchasing/Store;->confirmTransaction(Ljava/lang/String;)V
} // .end method
public void disable ( ) {
/* .locals 1 */
/* .prologue */
/* .line 119 */
/* invoke-super {p0}, Lcom/ansca/corona/purchasing/Store;->disable()V */
/* .line 120 */
v0 = this.fStore;
if ( v0 != null) { // if-eqz v0, :cond_0
/* .line 121 */
v0 = this.fStore;
(( com.ansca.corona.purchasing.Store ) v0 ).disable ( ); // invoke-virtual {v0}, Lcom/ansca/corona/purchasing/Store;->disable()V
/* .line 123 */
} // :cond_0
return;
} // .end method
public void enable ( ) {
/* .locals 1 */
/* .prologue */
/* .line 103 */
/* invoke-super {p0}, Lcom/ansca/corona/purchasing/Store;->enable()V */
/* .line 104 */
v0 = this.fStore;
if ( v0 != null) { // if-eqz v0, :cond_0
/* .line 105 */
v0 = this.fStore;
(( com.ansca.corona.purchasing.Store ) v0 ).enable ( ); // invoke-virtual {v0}, Lcom/ansca/corona/purchasing/Store;->enable()V
/* .line 107 */
} // :cond_0
return;
} // .end method
public void logStoreNotSupportedWarning ( ) {
/* .locals 2 */
/* .prologue */
/* .line 200 */
final String v0 = "Corona"; // const-string v0, "Corona"
final String v1 = "This application does not support in-app purchases on this device."; // const-string v1, "This application does not support in-app purchases on this device."
android.util.Log .v ( v0,v1 );
/* .line 201 */
return;
} // .end method
protected void onEnabled ( ) {
/* .locals 0 */
/* .prologue */
/* .line 115 */
return;
} // .end method
public void purchase ( java.lang.String p0 ) {
/* .locals 2 */
/* .param p1, "productName" # Ljava/lang/String; */
/* .prologue */
/* .line 142 */
v1 = this.fStore;
/* if-nez v1, :cond_0 */
/* .line 143 */
/* new-instance v0, Lcom/ansca/corona/purchasing/StoreTransactionResultSettings; */
/* invoke-direct {v0}, Lcom/ansca/corona/purchasing/StoreTransactionResultSettings;-><init>()V */
/* .line 144 */
/* .local v0, "result":Lcom/ansca/corona/purchasing/StoreTransactionResultSettings; */
v1 = com.ansca.corona.purchasing.StoreTransactionState.FAILED;
(( com.ansca.corona.purchasing.StoreTransactionResultSettings ) v0 ).setState ( v1 ); // invoke-virtual {v0, v1}, Lcom/ansca/corona/purchasing/StoreTransactionResultSettings;->setState(Lcom/ansca/corona/purchasing/StoreTransactionState;)V
/* .line 145 */
v1 = com.ansca.corona.purchasing.StoreTransactionErrorType.CLIENT_INVALID;
(( com.ansca.corona.purchasing.StoreTransactionResultSettings ) v0 ).setErrorType ( v1 ); // invoke-virtual {v0, v1}, Lcom/ansca/corona/purchasing/StoreTransactionResultSettings;->setErrorType(Lcom/ansca/corona/purchasing/StoreTransactionErrorType;)V
/* .line 146 */
final String v1 = "This application does not support in-app purchases on this device."; // const-string v1, "This application does not support in-app purchases on this device."
(( com.ansca.corona.purchasing.StoreTransactionResultSettings ) v0 ).setErrorMessage ( v1 ); // invoke-virtual {v0, v1}, Lcom/ansca/corona/purchasing/StoreTransactionResultSettings;->setErrorMessage(Ljava/lang/String;)V
/* .line 147 */
(( com.ansca.corona.purchasing.StoreTransactionResultSettings ) v0 ).setProductName ( p1 ); // invoke-virtual {v0, p1}, Lcom/ansca/corona/purchasing/StoreTransactionResultSettings;->setProductName(Ljava/lang/String;)V
/* .line 148 */
(( com.ansca.corona.purchasing.StoreProxy ) p0 ).raiseTransactionEventFor ( v0 ); // invoke-virtual {p0, v0}, Lcom/ansca/corona/purchasing/StoreProxy;->raiseTransactionEventFor(Lcom/ansca/corona/purchasing/StoreTransactionResultSettings;)V
/* .line 149 */
(( com.ansca.corona.purchasing.StoreProxy ) p0 ).logStoreNotSupportedWarning ( ); // invoke-virtual {p0}, Lcom/ansca/corona/purchasing/StoreProxy;->logStoreNotSupportedWarning()V
/* .line 155 */
} // .end local v0 # "result":Lcom/ansca/corona/purchasing/StoreTransactionResultSettings;
} // :goto_0
return;
/* .line 154 */
} // :cond_0
v1 = this.fStore;
(( com.ansca.corona.purchasing.Store ) v1 ).purchase ( p1 ); // invoke-virtual {v1, p1}, Lcom/ansca/corona/purchasing/Store;->purchase(Ljava/lang/String;)V
} // .end method
public void restorePurchases ( ) {
/* .locals 2 */
/* .prologue */
/* .line 160 */
v1 = this.fStore;
/* if-nez v1, :cond_0 */
/* .line 161 */
/* new-instance v0, Lcom/ansca/corona/purchasing/StoreTransactionResultSettings; */
/* invoke-direct {v0}, Lcom/ansca/corona/purchasing/StoreTransactionResultSettings;-><init>()V */
/* .line 162 */
/* .local v0, "result":Lcom/ansca/corona/purchasing/StoreTransactionResultSettings; */
v1 = com.ansca.corona.purchasing.StoreTransactionState.FAILED;
(( com.ansca.corona.purchasing.StoreTransactionResultSettings ) v0 ).setState ( v1 ); // invoke-virtual {v0, v1}, Lcom/ansca/corona/purchasing/StoreTransactionResultSettings;->setState(Lcom/ansca/corona/purchasing/StoreTransactionState;)V
/* .line 163 */
v1 = com.ansca.corona.purchasing.StoreTransactionErrorType.CLIENT_INVALID;
(( com.ansca.corona.purchasing.StoreTransactionResultSettings ) v0 ).setErrorType ( v1 ); // invoke-virtual {v0, v1}, Lcom/ansca/corona/purchasing/StoreTransactionResultSettings;->setErrorType(Lcom/ansca/corona/purchasing/StoreTransactionErrorType;)V
/* .line 164 */
final String v1 = "This application does not support in-app purchases on this device."; // const-string v1, "This application does not support in-app purchases on this device."
(( com.ansca.corona.purchasing.StoreTransactionResultSettings ) v0 ).setErrorMessage ( v1 ); // invoke-virtual {v0, v1}, Lcom/ansca/corona/purchasing/StoreTransactionResultSettings;->setErrorMessage(Ljava/lang/String;)V
/* .line 165 */
(( com.ansca.corona.purchasing.StoreProxy ) p0 ).raiseTransactionEventFor ( v0 ); // invoke-virtual {p0, v0}, Lcom/ansca/corona/purchasing/StoreProxy;->raiseTransactionEventFor(Lcom/ansca/corona/purchasing/StoreTransactionResultSettings;)V
/* .line 166 */
(( com.ansca.corona.purchasing.StoreProxy ) p0 ).logStoreNotSupportedWarning ( ); // invoke-virtual {p0}, Lcom/ansca/corona/purchasing/StoreProxy;->logStoreNotSupportedWarning()V
/* .line 172 */
} // .end local v0 # "result":Lcom/ansca/corona/purchasing/StoreTransactionResultSettings;
} // :goto_0
return;
/* .line 171 */
} // :cond_0
v1 = this.fStore;
(( com.ansca.corona.purchasing.Store ) v1 ).restorePurchases ( ); // invoke-virtual {v1}, Lcom/ansca/corona/purchasing/Store;->restorePurchases()V
} // .end method
public void setActivity ( android.app.Activity p0 ) {
/* .locals 1 */
/* .param p1, "activity" # Landroid/app/Activity; */
/* .prologue */
/* .line 33 */
/* invoke-super {p0, p1}, Lcom/ansca/corona/purchasing/Store;->setActivity(Landroid/app/Activity;)V */
/* .line 34 */
v0 = this.fStore;
if ( v0 != null) { // if-eqz v0, :cond_0
/* .line 35 */
v0 = this.fStore;
(( com.ansca.corona.purchasing.Store ) v0 ).setActivity ( p1 ); // invoke-virtual {v0, p1}, Lcom/ansca/corona/purchasing/Store;->setActivity(Landroid/app/Activity;)V
/* .line 37 */
} // :cond_0
return;
} // .end method
public void useDefaultStore ( ) {
/* .locals 1 */
/* .prologue */
/* .line 69 */
com.ansca.corona.purchasing.StoreServices .getDefaultStoreName ( );
(( com.ansca.corona.purchasing.StoreProxy ) p0 ).useStore ( v0 ); // invoke-virtual {p0, v0}, Lcom/ansca/corona/purchasing/StoreProxy;->useStore(Ljava/lang/String;)V
/* .line 70 */
return;
} // .end method
public void useGoogleStore ( ) {
/* .locals 1 */
/* .prologue */
/* .line 59 */
/* new-instance v0, Lcom/ansca/corona/purchasing/GoogleStore; */
/* invoke-direct {v0}, Lcom/ansca/corona/purchasing/GoogleStore;-><init>()V */
/* invoke-direct {p0, v0}, Lcom/ansca/corona/purchasing/StoreProxy;->setStoreTo(Lcom/ansca/corona/purchasing/Store;)V */
/* .line 60 */
return;
} // .end method
public void useNoStore ( ) {
/* .locals 1 */
/* .prologue */
/* .line 64 */
int v0 = 0; // const/4 v0, 0x0
/* invoke-direct {p0, v0}, Lcom/ansca/corona/purchasing/StoreProxy;->setStoreTo(Lcom/ansca/corona/purchasing/Store;)V */
/* .line 65 */
return;
} // .end method
public void useStore ( java.lang.String p0 ) {
/* .locals 1 */
/* .param p1, "storeName" # Ljava/lang/String; */
/* .prologue */
/* .line 46 */
v0 = com.ansca.corona.purchasing.StoreName .isValid ( p1 );
if ( v0 != null) { // if-eqz v0, :cond_0
/* .line 47 */
final String v0 = "google"; // const-string v0, "google"
v0 = (( java.lang.String ) p1 ).equals ( v0 ); // invoke-virtual {p1, v0}, Ljava/lang/String;->equals(Ljava/lang/Object;)Z
if ( v0 != null) { // if-eqz v0, :cond_0
/* .line 48 */
(( com.ansca.corona.purchasing.StoreProxy ) p0 ).useGoogleStore ( ); // invoke-virtual {p0}, Lcom/ansca/corona/purchasing/StoreProxy;->useGoogleStore()V
/* .line 55 */
} // :goto_0
return;
/* .line 54 */
} // :cond_0
(( com.ansca.corona.purchasing.StoreProxy ) p0 ).useNoStore ( ); // invoke-virtual {p0}, Lcom/ansca/corona/purchasing/StoreProxy;->useNoStore()V
} // .end method
