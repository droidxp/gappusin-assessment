public class inal extends java.lang.Enum {
	 /* .source "GoogleStoreConnectionState.java" */
	 /* # annotations */
	 /* .annotation system Ldalvik/annotation/Signature; */
	 /* value = { */
	 /* "Ljava/lang/Enum", */
	 /* "<", */
	 /* "Lcom/ansca/corona/purchasing/GoogleStoreConnectionState;", */
	 /* ">;" */
	 /* } */
} // .end annotation
/* # static fields */
private static final com.ansca.corona.purchasing.GoogleStoreConnectionState $VALUES; //synthetic
public static final com.ansca.corona.purchasing.GoogleStoreConnectionState CLOSED;
public static final com.ansca.corona.purchasing.GoogleStoreConnectionState CLOSING;
public static final com.ansca.corona.purchasing.GoogleStoreConnectionState OPEN;
public static final com.ansca.corona.purchasing.GoogleStoreConnectionState OPENING;
/* # direct methods */
static inal ( ) {
	 /* .locals 6 */
	 /* .prologue */
	 int v5 = 3; // const/4 v5, 0x3
	 int v4 = 2; // const/4 v4, 0x2
	 int v3 = 1; // const/4 v3, 0x1
	 int v2 = 0; // const/4 v2, 0x0
	 /* .line 7 */
	 /* new-instance v0, Lcom/ansca/corona/purchasing/GoogleStoreConnectionState; */
	 final String v1 = "OPENING"; // const-string v1, "OPENING"
	 /* invoke-direct {v0, v1, v2}, Lcom/ansca/corona/purchasing/GoogleStoreConnectionState;-><init>(Ljava/lang/String;I)V */
	 /* .line 10 */
	 /* new-instance v0, Lcom/ansca/corona/purchasing/GoogleStoreConnectionState; */
	 final String v1 = "OPEN"; // const-string v1, "OPEN"
	 /* invoke-direct {v0, v1, v3}, Lcom/ansca/corona/purchasing/GoogleStoreConnectionState;-><init>(Ljava/lang/String;I)V */
	 /* .line 13 */
	 /* new-instance v0, Lcom/ansca/corona/purchasing/GoogleStoreConnectionState; */
	 final String v1 = "CLOSING"; // const-string v1, "CLOSING"
	 /* invoke-direct {v0, v1, v4}, Lcom/ansca/corona/purchasing/GoogleStoreConnectionState;-><init>(Ljava/lang/String;I)V */
	 /* .line 16 */
	 /* new-instance v0, Lcom/ansca/corona/purchasing/GoogleStoreConnectionState; */
	 final String v1 = "CLOSED"; // const-string v1, "CLOSED"
	 /* invoke-direct {v0, v1, v5}, Lcom/ansca/corona/purchasing/GoogleStoreConnectionState;-><init>(Ljava/lang/String;I)V */
	 /* .line 5 */
	 int v0 = 4; // const/4 v0, 0x4
	 /* new-array v0, v0, [Lcom/ansca/corona/purchasing/GoogleStoreConnectionState; */
	 v1 = com.ansca.corona.purchasing.GoogleStoreConnectionState.OPENING;
	 /* aput-object v1, v0, v2 */
	 v1 = com.ansca.corona.purchasing.GoogleStoreConnectionState.OPEN;
	 /* aput-object v1, v0, v3 */
	 v1 = com.ansca.corona.purchasing.GoogleStoreConnectionState.CLOSING;
	 /* aput-object v1, v0, v4 */
	 v1 = com.ansca.corona.purchasing.GoogleStoreConnectionState.CLOSED;
	 /* aput-object v1, v0, v5 */
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
/* .line 5 */
/* invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V */
return;
} // .end method
public static com.ansca.corona.purchasing.GoogleStoreConnectionState valueOf ( java.lang.String p0 ) {
/* .locals 1 */
/* .param p0, "name" # Ljava/lang/String; */
/* .prologue */
/* .line 5 */
/* const-class v0, Lcom/ansca/corona/purchasing/GoogleStoreConnectionState; */
java.lang.Enum .valueOf ( v0,p0 );
/* check-cast v0, Lcom/ansca/corona/purchasing/GoogleStoreConnectionState; */
} // .end method
public static com.ansca.corona.purchasing.GoogleStoreConnectionState values ( ) {
/* .locals 1 */
/* .prologue */
/* .line 5 */
v0 = com.ansca.corona.purchasing.GoogleStoreConnectionState.$VALUES;
(( com.ansca.corona.purchasing.GoogleStoreConnectionState ) v0 ).clone ( ); // invoke-virtual {v0}, [Lcom/ansca/corona/purchasing/GoogleStoreConnectionState;->clone()Ljava/lang/Object;
/* check-cast v0, [Lcom/ansca/corona/purchasing/GoogleStoreConnectionState; */
} // .end method
stError; */
} // .end method
