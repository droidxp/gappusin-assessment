public class inal extends java.lang.Enum {
	 /* .source "Consts.java" */
	 /* # annotations */
	 /* .annotation system Ldalvik/annotation/EnclosingClass; */
	 /* value = Lcom/nobleempire/GunDisassembly2/Consts; */
} // .end annotation
/* .annotation system Ldalvik/annotation/InnerClass; */
/* accessFlags = 0x4019 */
/* name = "PurchaseState" */
} // .end annotation
/* .annotation system Ldalvik/annotation/Signature; */
/* value = { */
/* "Ljava/lang/Enum", */
/* "<", */
/* "Lcom/nobleempire/GunDisassembly2/Consts$PurchaseState;", */
/* ">;" */
/* } */
} // .end annotation
/* # static fields */
public static final com.nobleempire.GunDisassembly2.Consts$PurchaseState CANCELED;
private static final com.nobleempire.GunDisassembly2.Consts$PurchaseState ENUM$VALUES; //synthetic
public static final com.nobleempire.GunDisassembly2.Consts$PurchaseState PURCHASED;
public static final com.nobleempire.GunDisassembly2.Consts$PurchaseState REFUNDED;
/* # direct methods */
static inal ( ) {
/* .locals 5 */
/* .prologue */
int v4 = 2; // const/4 v4, 0x2
int v3 = 1; // const/4 v3, 0x1
int v2 = 0; // const/4 v2, 0x0
/* .line 23 */
/* new-instance v0, Lcom/nobleempire/GunDisassembly2/Consts$PurchaseState; */
final String v1 = "PURCHASED"; // const-string v1, "PURCHASED"
/* invoke-direct {v0, v1, v2}, Lcom/nobleempire/GunDisassembly2/Consts$PurchaseState;-><init>(Ljava/lang/String;I)V */
/* .line 24 */
/* .line 25 */
/* new-instance v0, Lcom/nobleempire/GunDisassembly2/Consts$PurchaseState; */
final String v1 = "CANCELED"; // const-string v1, "CANCELED"
/* invoke-direct {v0, v1, v3}, Lcom/nobleempire/GunDisassembly2/Consts$PurchaseState;-><init>(Ljava/lang/String;I)V */
/* .line 26 */
/* new-instance v0, Lcom/nobleempire/GunDisassembly2/Consts$PurchaseState; */
final String v1 = "REFUNDED"; // const-string v1, "REFUNDED"
/* invoke-direct {v0, v1, v4}, Lcom/nobleempire/GunDisassembly2/Consts$PurchaseState;-><init>(Ljava/lang/String;I)V */
/* .line 23 */
int v0 = 3; // const/4 v0, 0x3
/* new-array v0, v0, [Lcom/nobleempire/GunDisassembly2/Consts$PurchaseState; */
v1 = com.nobleempire.GunDisassembly2.Consts$PurchaseState.PURCHASED;
/* aput-object v1, v0, v2 */
v1 = com.nobleempire.GunDisassembly2.Consts$PurchaseState.CANCELED;
/* aput-object v1, v0, v3 */
v1 = com.nobleempire.GunDisassembly2.Consts$PurchaseState.REFUNDED;
/* aput-object v1, v0, v4 */
return;
} // .end method
private inal ( ) {
/* .locals 0 */
/* .prologue */
/* .line 23 */
/* invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V */
return;
} // .end method
public static com.nobleempire.GunDisassembly2.Consts$PurchaseState valueOf ( Integer p0 ) {
/* .locals 2 */
/* .param p0, "index" # I */
/* .prologue */
/* .line 29 */
com.nobleempire.GunDisassembly2.Consts$PurchaseState .values ( );
/* .line 30 */
/* .local v0, "values":[Lcom/nobleempire/GunDisassembly2/Consts$PurchaseState; */
/* if-ltz p0, :cond_0 */
/* array-length v1, v0 */
/* if-lt p0, v1, :cond_1 */
} // :cond_0
v1 = com.nobleempire.GunDisassembly2.Consts$PurchaseState.CANCELED;
/* .line 31 */
} // :goto_0
} // :cond_1
/* aget-object v1, v0, p0 */
} // .end method
public static com.nobleempire.GunDisassembly2.Consts$PurchaseState valueOf ( java.lang.String p0 ) {
/* .locals 1 */
/* .prologue */
/* .line 1 */
/* const-class v0, Lcom/nobleempire/GunDisassembly2/Consts$PurchaseState; */
java.lang.Enum .valueOf ( v0,p0 );
/* check-cast v0, Lcom/nobleempire/GunDisassembly2/Consts$PurchaseState; */
} // .end method
public static com.nobleempire.GunDisassembly2.Consts$PurchaseState values ( ) {
/* .locals 4 */
/* .prologue */
int v3 = 0; // const/4 v3, 0x0
/* .line 1 */
v0 = com.nobleempire.GunDisassembly2.Consts$PurchaseState.ENUM$VALUES;
/* array-length v1, v0 */
/* new-array v2, v1, [Lcom/nobleempire/GunDisassembly2/Consts$PurchaseState; */
java.lang.System .arraycopy ( v0,v3,v2,v3,v1 );
} // .end method
                                                                                                                                                                                                        ERVICE_UNAVAILABLE;
/* aput-object v1, v0, v5 */
v1 = com.nobleempire.GunDisassembly2.Consts$ResponseCode.RESULT_BILLING_UNAVAILABLE;
/* aput-object v1, v0, v6 */
v1 = com.nobleempire.GunDisassembly2.Consts$ResponseCode.RESULT_ITEM_UNAVAILABLE;
/* aput-object v1, v0, v7 */
int v1 = 5; // const/4 v1, 0x5
v2 = com.nobleempire.GunDisassembly2.Consts$ResponseCode.RESULT_DEVELOPER_ERROR;
/* aput-object v2, v0, v1 */
int v1 = 6; // const/4 v1, 0x6
v2 = com.nobleempire.GunDisassembly2.Consts$ResponseCode.RESULT_ERROR;
/* aput-object v2, v0, v1 */
return;
} // .end method
private inal ( ) {
/* .locals 0 */
/* .prologue */
/* .line 7 */
/* invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V */
return;
} // .end method
public static com.nobleempire.GunDisassembly2.Consts$ResponseCode valueOf ( Integer p0 ) {
/* .locals 2 */
/* .param p0, "index" # I */
/* .prologue */
/* .line 17 */
com.nobleempire.GunDisassembly2.Consts$ResponseCode .values ( );
/* .line 18 */
/* .local v0, "values":[Lcom/nobleempire/GunDisassembly2/Consts$ResponseCode; */
/* if-ltz p0, :cond_0 */
/* array-length v1, v0 */
/* if-lt p0, v1, :cond_1 */
} // :cond_0
v1 = com.nobleempire.GunDisassembly2.Consts$ResponseCode.RESULT_ERROR;
/* .line 19 */
} // :goto_0
} // :cond_1
/* aget-object v1, v0, p0 */
} // .end method
public static com.nobleempire.GunDisassembly2.Consts$ResponseCode valueOf ( java.lang.String p0 ) {
/* .locals 1 */
/* .prologue */
/* .line 1 */
/* const-class v0, Lcom/nobleempire/GunDisassembly2/Consts$ResponseCode; */
java.lang.Enum .valueOf ( v0,p0 );
/* check-cast v0, Lcom/nobleempire/GunDisassembly2/Consts$ResponseCode; */
} // .end method
public static com.nobleempire.GunDisassembly2.Consts$ResponseCode values ( ) {
/* .locals 4 */
/* .prologue */
int v3 = 0; // const/4 v3, 0x0
/* .line 1 */
v0 = com.nobleempire.GunDisassembly2.Consts$ResponseCode.ENUM$VALUES;
/* array-length v1, v0 */
/* new-array v2, v1, [Lcom/nobleempire/GunDisassembly2/Consts$ResponseCode; */
java.lang.System .arraycopy ( v0,v3,v2,v3,v1 );
} // .end method
