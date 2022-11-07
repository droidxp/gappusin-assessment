public class inal extends java.lang.Enum {
	 /* .source "GoogleStoreResponseCode.java" */
	 /* # annotations */
	 /* .annotation system Ldalvik/annotation/Signature; */
	 /* value = { */
	 /* "Ljava/lang/Enum", */
	 /* "<", */
	 /* "Lcom/ansca/corona/purchasing/GoogleStoreResponseCode;", */
	 /* ">;" */
	 /* } */
} // .end annotation
/* # static fields */
private static final com.ansca.corona.purchasing.GoogleStoreResponseCode $VALUES; //synthetic
public static final com.ansca.corona.purchasing.GoogleStoreResponseCode BILLING_UNAVAILABLE;
public static final com.ansca.corona.purchasing.GoogleStoreResponseCode DEVELOPER_ERROR;
public static final com.ansca.corona.purchasing.GoogleStoreResponseCode ERROR;
public static final com.ansca.corona.purchasing.GoogleStoreResponseCode ITEM_UNAVAILABLE;
public static final com.ansca.corona.purchasing.GoogleStoreResponseCode OK;
public static final com.ansca.corona.purchasing.GoogleStoreResponseCode SERVICE_UNAVAILABLE;
public static final com.ansca.corona.purchasing.GoogleStoreResponseCode USER_CANCELED;
/* # direct methods */
static inal ( ) {
	 /* .locals 8 */
	 /* .prologue */
	 int v7 = 4; // const/4 v7, 0x4
	 int v6 = 3; // const/4 v6, 0x3
	 int v5 = 2; // const/4 v5, 0x2
	 int v4 = 1; // const/4 v4, 0x1
	 int v3 = 0; // const/4 v3, 0x0
	 /* .line 9 */
	 /* new-instance v0, Lcom/ansca/corona/purchasing/GoogleStoreResponseCode; */
	 final String v1 = "OK"; // const-string v1, "OK"
	 /* invoke-direct {v0, v1, v3}, Lcom/ansca/corona/purchasing/GoogleStoreResponseCode;-><init>(Ljava/lang/String;I)V */
	 /* .line 12 */
	 /* new-instance v0, Lcom/ansca/corona/purchasing/GoogleStoreResponseCode; */
	 final String v1 = "USER_CANCELED"; // const-string v1, "USER_CANCELED"
	 /* invoke-direct {v0, v1, v4}, Lcom/ansca/corona/purchasing/GoogleStoreResponseCode;-><init>(Ljava/lang/String;I)V */
	 /* .line 15 */
	 /* new-instance v0, Lcom/ansca/corona/purchasing/GoogleStoreResponseCode; */
	 final String v1 = "SERVICE_UNAVAILABLE"; // const-string v1, "SERVICE_UNAVAILABLE"
	 /* invoke-direct {v0, v1, v5}, Lcom/ansca/corona/purchasing/GoogleStoreResponseCode;-><init>(Ljava/lang/String;I)V */
	 /* .line 22 */
	 /* new-instance v0, Lcom/ansca/corona/purchasing/GoogleStoreResponseCode; */
	 final String v1 = "BILLING_UNAVAILABLE"; // const-string v1, "BILLING_UNAVAILABLE"
	 /* invoke-direct {v0, v1, v6}, Lcom/ansca/corona/purchasing/GoogleStoreResponseCode;-><init>(Ljava/lang/String;I)V */
	 /* .line 25 */
	 /* new-instance v0, Lcom/ansca/corona/purchasing/GoogleStoreResponseCode; */
	 final String v1 = "ITEM_UNAVAILABLE"; // const-string v1, "ITEM_UNAVAILABLE"
	 /* invoke-direct {v0, v1, v7}, Lcom/ansca/corona/purchasing/GoogleStoreResponseCode;-><init>(Ljava/lang/String;I)V */
	 /* .line 31 */
	 /* new-instance v0, Lcom/ansca/corona/purchasing/GoogleStoreResponseCode; */
	 final String v1 = "DEVELOPER_ERROR"; // const-string v1, "DEVELOPER_ERROR"
	 int v2 = 5; // const/4 v2, 0x5
	 /* invoke-direct {v0, v1, v2}, Lcom/ansca/corona/purchasing/GoogleStoreResponseCode;-><init>(Ljava/lang/String;I)V */
	 /* .line 37 */
	 /* new-instance v0, Lcom/ansca/corona/purchasing/GoogleStoreResponseCode; */
	 final String v1 = "ERROR"; // const-string v1, "ERROR"
	 int v2 = 6; // const/4 v2, 0x6
	 /* invoke-direct {v0, v1, v2}, Lcom/ansca/corona/purchasing/GoogleStoreResponseCode;-><init>(Ljava/lang/String;I)V */
	 /* .line 7 */
	 int v0 = 7; // const/4 v0, 0x7
	 /* new-array v0, v0, [Lcom/ansca/corona/purchasing/GoogleStoreResponseCode; */
	 v1 = com.ansca.corona.purchasing.GoogleStoreResponseCode.OK;
	 /* aput-object v1, v0, v3 */
	 v1 = com.ansca.corona.purchasing.GoogleStoreResponseCode.USER_CANCELED;
	 /* aput-object v1, v0, v4 */
	 v1 = com.ansca.corona.purchasing.GoogleStoreResponseCode.SERVICE_UNAVAILABLE;
	 /* aput-object v1, v0, v5 */
	 v1 = com.ansca.corona.purchasing.GoogleStoreResponseCode.BILLING_UNAVAILABLE;
	 /* aput-object v1, v0, v6 */
	 v1 = com.ansca.corona.purchasing.GoogleStoreResponseCode.ITEM_UNAVAILABLE;
	 /* aput-object v1, v0, v7 */
	 int v1 = 5; // const/4 v1, 0x5
	 v2 = com.ansca.corona.purchasing.GoogleStoreResponseCode.DEVELOPER_ERROR;
	 /* aput-object v2, v0, v1 */
	 int v1 = 6; // const/4 v1, 0x6
	 v2 = com.ansca.corona.purchasing.GoogleStoreResponseCode.ERROR;
	 /* aput-object v2, v0, v1 */
	 return;
} // .end method
private inal ( ) {
	 /* .locals 0 */
	 /* .annotation system Ldalvik/annotation/Signature; */
	 /* value = { */
	 /* "()V" */
	 /* } */
} // .end annotation
/* .prologue */
/* .line 7 */
/* invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V */
return;
} // .end method
public static com.ansca.corona.purchasing.GoogleStoreResponseCode fromOrdinal ( Integer p0 ) {
/* .locals 2 */
/* .param p0, "value" # I */
/* .prologue */
/* .line 91 */
com.ansca.corona.purchasing.GoogleStoreResponseCode .values ( );
/* .line 92 */
/* .local v0, "values":[Lcom/ansca/corona/purchasing/GoogleStoreResponseCode; */
/* if-ltz p0, :cond_0 */
/* array-length v1, v0 */
/* if-lt p0, v1, :cond_1 */
/* .line 93 */
} // :cond_0
v1 = com.ansca.corona.purchasing.GoogleStoreResponseCode.ERROR;
/* .line 95 */
} // :goto_0
} // :cond_1
/* aget-object v1, v0, p0 */
} // .end method
public static com.ansca.corona.purchasing.GoogleStoreResponseCode valueOf ( java.lang.String p0 ) {
/* .locals 1 */
/* .param p0, "name" # Ljava/lang/String; */
/* .prologue */
/* .line 7 */
/* const-class v0, Lcom/ansca/corona/purchasing/GoogleStoreResponseCode; */
java.lang.Enum .valueOf ( v0,p0 );
/* check-cast v0, Lcom/ansca/corona/purchasing/GoogleStoreResponseCode; */
} // .end method
public static com.ansca.corona.purchasing.GoogleStoreResponseCode values ( ) {
/* .locals 1 */
/* .prologue */
/* .line 7 */
v0 = com.ansca.corona.purchasing.GoogleStoreResponseCode.$VALUES;
(( com.ansca.corona.purchasing.GoogleStoreResponseCode ) v0 ).clone ( ); // invoke-virtual {v0}, [Lcom/ansca/corona/purchasing/GoogleStoreResponseCode;->clone()Ljava/lang/Object;
/* check-cast v0, [Lcom/ansca/corona/purchasing/GoogleStoreResponseCode; */
} // .end method
/* # virtual methods */
public Boolean isError ( ) {
/* .locals 1 */
/* .prologue */
/* .line 53 */
v0 = (( com.ansca.corona.purchasing.GoogleStoreResponseCode ) p0 ).isSuccess ( ); // invoke-virtual {p0}, Lcom/ansca/corona/purchasing/GoogleStoreResponseCode;->isSuccess()Z
/* if-nez v0, :cond_0 */
int v0 = 1; // const/4 v0, 0x1
} // :goto_0
} // :cond_0
int v0 = 0; // const/4 v0, 0x0
} // .end method
public Boolean isSuccess ( ) {
/* .locals 1 */
/* .prologue */
/* .line 45 */
v0 = com.ansca.corona.purchasing.GoogleStoreResponseCode.OK;
/* if-ne p0, v0, :cond_0 */
int v0 = 1; // const/4 v0, 0x1
} // :goto_0
} // :cond_0
int v0 = 0; // const/4 v0, 0x0
} // .end method
public com.ansca.corona.purchasing.StoreTransactionErrorType toTransactionErrorType ( ) {
/* .locals 2 */
/* .prologue */
/* .line 63 */
v1 = com.ansca.corona.purchasing.GoogleStoreResponseCode.OK;
/* if-ne p0, v1, :cond_0 */
/* .line 64 */
v0 = com.ansca.corona.purchasing.StoreTransactionErrorType.NONE;
/* .line 80 */
/* .local v0, "errorType":Lcom/ansca/corona/purchasing/StoreTransactionErrorType; */
} // :goto_0
/* .line 66 */
} // .end local v0 # "errorType":Lcom/ansca/corona/purchasing/StoreTransactionErrorType;
} // :cond_0
v1 = com.ansca.corona.purchasing.GoogleStoreResponseCode.USER_CANCELED;
/* if-ne p0, v1, :cond_1 */
/* .line 67 */
v0 = com.ansca.corona.purchasing.StoreTransactionErrorType.PAYMENT_CANCELED;
/* .restart local v0 # "errorType":Lcom/ansca/corona/purchasing/StoreTransactionErrorType; */
/* .line 69 */
} // .end local v0 # "errorType":Lcom/ansca/corona/purchasing/StoreTransactionErrorType;
} // :cond_1
v1 = com.ansca.corona.purchasing.GoogleStoreResponseCode.SERVICE_UNAVAILABLE;
/* if-eq p0, v1, :cond_2 */
v1 = com.ansca.corona.purchasing.GoogleStoreResponseCode.DEVELOPER_ERROR;
/* if-eq p0, v1, :cond_2 */
v1 = com.ansca.corona.purchasing.GoogleStoreResponseCode.ITEM_UNAVAILABLE;
/* if-ne p0, v1, :cond_3 */
/* .line 72 */
} // :cond_2
v0 = com.ansca.corona.purchasing.StoreTransactionErrorType.CLIENT_INVALID;
/* .restart local v0 # "errorType":Lcom/ansca/corona/purchasing/StoreTransactionErrorType; */
/* .line 74 */
} // .end local v0 # "errorType":Lcom/ansca/corona/purchasing/StoreTransactionErrorType;
} // :cond_3
v1 = com.ansca.corona.purchasing.GoogleStoreResponseCode.BILLING_UNAVAILABLE;
/* if-ne p0, v1, :cond_4 */
/* .line 75 */
v0 = com.ansca.corona.purchasing.StoreTransactionErrorType.PAYMENT_NOT_ALLOWED;
/* .restart local v0 # "errorType":Lcom/ansca/corona/purchasing/StoreTransactionErrorType; */
/* .line 78 */
} // .end local v0 # "errorType":Lcom/ansca/corona/purchasing/StoreTransactionErrorType;
} // :cond_4
v0 = com.ansca.corona.purchasing.StoreTransactionErrorType.UNKNOWN;
/* .restart local v0 # "errorType":Lcom/ansca/corona/purchasing/StoreTransactionErrorType; */
} // .end method
