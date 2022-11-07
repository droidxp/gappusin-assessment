public class com.ansca.corona.purchasing.StoreTransactionResultSettings {
	 /* .source "StoreTransactionResultSettings.java" */
	 /* # instance fields */
	 private java.lang.String fErrorMessage;
	 private com.ansca.corona.purchasing.StoreTransactionErrorType fErrorType;
	 private java.lang.String fOriginalReceipt;
	 private java.lang.String fOriginalTransactionStringId;
	 private java.util.Date fOriginalTransactionTime;
	 private java.lang.String fProductName;
	 private java.lang.String fReceipt;
	 private com.ansca.corona.purchasing.StoreTransactionState fState;
	 private java.lang.String fTransactionStringId;
	 private java.util.Date fTransactionTime;
	 /* # direct methods */
	 public com.ansca.corona.purchasing.StoreTransactionResultSettings ( ) {
		 /* .locals 2 */
		 /* .prologue */
		 int v1 = 0; // const/4 v1, 0x0
		 /* .line 38 */
		 /* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
		 /* .line 39 */
		 v0 = com.ansca.corona.purchasing.StoreTransactionState.UNDEFINED;
		 this.fState = v0;
		 /* .line 40 */
		 v0 = com.ansca.corona.purchasing.StoreTransactionErrorType.UNKNOWN;
		 this.fErrorType = v0;
		 /* .line 41 */
		 final String v0 = ""; // const-string v0, ""
		 this.fErrorMessage = v0;
		 /* .line 42 */
		 final String v0 = ""; // const-string v0, ""
		 this.fProductName = v0;
		 /* .line 43 */
		 final String v0 = ""; // const-string v0, ""
		 this.fReceipt = v0;
		 /* .line 44 */
		 final String v0 = ""; // const-string v0, ""
		 this.fTransactionStringId = v0;
		 /* .line 45 */
		 this.fTransactionTime = v1;
		 /* .line 46 */
		 final String v0 = ""; // const-string v0, ""
		 this.fOriginalReceipt = v0;
		 /* .line 47 */
		 final String v0 = ""; // const-string v0, ""
		 this.fOriginalTransactionStringId = v0;
		 /* .line 48 */
		 this.fOriginalTransactionTime = v1;
		 /* .line 49 */
		 return;
	 } // .end method
	 /* # virtual methods */
	 public java.lang.String getErrorMessage ( ) {
		 /* .locals 1 */
		 /* .prologue */
		 /* .line 98 */
		 v0 = this.fErrorMessage;
	 } // .end method
	 public com.ansca.corona.purchasing.StoreTransactionErrorType getErrorType ( ) {
		 /* .locals 1 */
		 /* .prologue */
		 /* .line 77 */
		 v0 = this.fErrorType;
	 } // .end method
	 public java.lang.String getOriginalReceipt ( ) {
		 /* .locals 1 */
		 /* .prologue */
		 /* .line 216 */
		 v0 = this.fOriginalReceipt;
	 } // .end method
	 public java.lang.String getOriginalTransactionStringId ( ) {
		 /* .locals 1 */
		 /* .prologue */
		 /* .line 239 */
		 v0 = this.fOriginalTransactionStringId;
	 } // .end method
	 public java.util.Date getOriginalTransactionTime ( ) {
		 /* .locals 3 */
		 /* .prologue */
		 /* .line 272 */
		 v0 = this.fOriginalTransactionTime;
		 /* if-nez v0, :cond_0 */
		 /* .line 273 */
		 int v0 = 0; // const/4 v0, 0x0
		 /* .line 275 */
	 } // :goto_0
} // :cond_0
/* new-instance v0, Ljava/util/Date; */
v1 = this.fOriginalTransactionTime;
(( java.util.Date ) v1 ).getTime ( ); // invoke-virtual {v1}, Ljava/util/Date;->getTime()J
/* move-result-wide v1 */
/* invoke-direct {v0, v1, v2}, Ljava/util/Date;-><init>(J)V */
} // .end method
public java.lang.String getProductName ( ) {
/* .locals 1 */
/* .prologue */
/* .line 119 */
v0 = this.fProductName;
} // .end method
public java.lang.String getReceipt ( ) {
/* .locals 1 */
/* .prologue */
/* .line 140 */
v0 = this.fReceipt;
} // .end method
public com.ansca.corona.purchasing.StoreTransactionState getState ( ) {
/* .locals 1 */
/* .prologue */
/* .line 56 */
v0 = this.fState;
} // .end method
public java.lang.String getTransactionStringId ( ) {
/* .locals 1 */
/* .prologue */
/* .line 162 */
v0 = this.fTransactionStringId;
} // .end method
public java.util.Date getTransactionTime ( ) {
/* .locals 3 */
/* .prologue */
/* .line 194 */
v0 = this.fTransactionTime;
/* if-nez v0, :cond_0 */
/* .line 195 */
int v0 = 0; // const/4 v0, 0x0
/* .line 197 */
} // :goto_0
} // :cond_0
/* new-instance v0, Ljava/util/Date; */
v1 = this.fTransactionTime;
(( java.util.Date ) v1 ).getTime ( ); // invoke-virtual {v1}, Ljava/util/Date;->getTime()J
/* move-result-wide v1 */
/* invoke-direct {v0, v1, v2}, Ljava/util/Date;-><init>(J)V */
} // .end method
public Boolean hasOriginalTransactionTime ( ) {
/* .locals 1 */
/* .prologue */
/* .line 262 */
v0 = this.fOriginalTransactionTime;
if ( v0 != null) { // if-eqz v0, :cond_0
int v0 = 1; // const/4 v0, 0x1
} // :goto_0
} // :cond_0
int v0 = 0; // const/4 v0, 0x0
} // .end method
public Boolean hasTransactionTime ( ) {
/* .locals 1 */
/* .prologue */
/* .line 184 */
v0 = this.fTransactionTime;
if ( v0 != null) { // if-eqz v0, :cond_0
int v0 = 1; // const/4 v0, 0x1
} // :goto_0
} // :cond_0
int v0 = 0; // const/4 v0, 0x0
} // .end method
public void setErrorMessage ( java.lang.String p0 ) {
/* .locals 0 */
/* .param p1, "value" # Ljava/lang/String; */
/* .prologue */
/* .line 107 */
/* if-nez p1, :cond_0 */
/* .line 108 */
final String p1 = ""; // const-string p1, ""
/* .line 110 */
} // :cond_0
this.fErrorMessage = p1;
/* .line 111 */
return;
} // .end method
public void setErrorType ( com.ansca.corona.purchasing.StoreTransactionErrorType p0 ) {
/* .locals 0 */
/* .param p1, "value" # Lcom/ansca/corona/purchasing/StoreTransactionErrorType; */
/* .prologue */
/* .line 86 */
/* if-nez p1, :cond_0 */
/* .line 87 */
p1 = com.ansca.corona.purchasing.StoreTransactionErrorType.UNKNOWN;
/* .line 89 */
} // :cond_0
this.fErrorType = p1;
/* .line 90 */
return;
} // .end method
public void setOriginalReceipt ( java.lang.String p0 ) {
/* .locals 0 */
/* .param p1, "value" # Ljava/lang/String; */
/* .prologue */
/* .line 226 */
/* if-nez p1, :cond_0 */
/* .line 227 */
final String p1 = ""; // const-string p1, ""
/* .line 229 */
} // :cond_0
this.fOriginalReceipt = p1;
/* .line 230 */
return;
} // .end method
public void setOriginalTransactionStringId ( java.lang.String p0 ) {
/* .locals 0 */
/* .param p1, "value" # Ljava/lang/String; */
/* .prologue */
/* .line 249 */
/* if-nez p1, :cond_0 */
/* .line 250 */
final String p1 = ""; // const-string p1, ""
/* .line 252 */
} // :cond_0
this.fOriginalTransactionStringId = p1;
/* .line 253 */
return;
} // .end method
public void setOriginalTransactionTime ( java.util.Date p0 ) {
/* .locals 0 */
/* .param p1, "value" # Ljava/util/Date; */
/* .prologue */
/* .line 285 */
this.fOriginalTransactionTime = p1;
/* .line 286 */
return;
} // .end method
public void setProductName ( java.lang.String p0 ) {
/* .locals 0 */
/* .param p1, "value" # Ljava/lang/String; */
/* .prologue */
/* .line 128 */
/* if-nez p1, :cond_0 */
/* .line 129 */
final String p1 = ""; // const-string p1, ""
/* .line 131 */
} // :cond_0
this.fProductName = p1;
/* .line 132 */
return;
} // .end method
public void setReceipt ( java.lang.String p0 ) {
/* .locals 0 */
/* .param p1, "value" # Ljava/lang/String; */
/* .prologue */
/* .line 149 */
/* if-nez p1, :cond_0 */
/* .line 150 */
final String p1 = ""; // const-string p1, ""
/* .line 152 */
} // :cond_0
this.fReceipt = p1;
/* .line 153 */
return;
} // .end method
public void setState ( com.ansca.corona.purchasing.StoreTransactionState p0 ) {
/* .locals 0 */
/* .param p1, "value" # Lcom/ansca/corona/purchasing/StoreTransactionState; */
/* .prologue */
/* .line 65 */
/* if-nez p1, :cond_0 */
/* .line 66 */
p1 = com.ansca.corona.purchasing.StoreTransactionState.UNDEFINED;
/* .line 68 */
} // :cond_0
this.fState = p1;
/* .line 69 */
return;
} // .end method
public void setTransactionStringId ( java.lang.String p0 ) {
/* .locals 0 */
/* .param p1, "value" # Ljava/lang/String; */
/* .prologue */
/* .line 172 */
/* if-nez p1, :cond_0 */
/* .line 173 */
final String p1 = ""; // const-string p1, ""
/* .line 175 */
} // :cond_0
this.fTransactionStringId = p1;
/* .line 176 */
return;
} // .end method
public void setTransactionTime ( java.util.Date p0 ) {
/* .locals 0 */
/* .param p1, "value" # Ljava/util/Date; */
/* .prologue */
/* .line 206 */
this.fTransactionTime = p1;
/* .line 207 */
return;
} // .end method
