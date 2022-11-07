public class inal extends java.lang.Enum {
	 /* .source "SRRequest.java" */
	 /* # annotations */
	 /* .annotation system Ldalvik/annotation/EnclosingClass; */
	 /* value = Lcom/adknowledge/superrewards/web/SRRequest; */
} // .end annotation
/* .annotation system Ldalvik/annotation/InnerClass; */
/* accessFlags = 0x4019 */
/* name = "Command" */
} // .end annotation
/* .annotation system Ldalvik/annotation/Signature; */
/* value = { */
/* "Ljava/lang/Enum", */
/* "<", */
/* "Lcom/adknowledge/superrewards/web/SRRequest$Command;", */
/* ">;" */
/* } */
} // .end annotation
/* # static fields */
private static final com.adknowledge.superrewards.web.SRRequest$Command $VALUES; //synthetic
public static final com.adknowledge.superrewards.web.SRRequest$Command DEVICE;
public static final com.adknowledge.superrewards.web.SRRequest$Command GEO;
public static final com.adknowledge.superrewards.web.SRRequest$Command METHOD;
public static final com.adknowledge.superrewards.web.SRRequest$Command PARAMS;
public static final com.adknowledge.superrewards.web.SRRequest$Command RESPONSE;
/* # direct methods */
static inal ( ) {
/* .locals 7 */
/* .prologue */
int v6 = 4; // const/4 v6, 0x4
int v5 = 3; // const/4 v5, 0x3
int v4 = 2; // const/4 v4, 0x2
int v3 = 1; // const/4 v3, 0x1
int v2 = 0; // const/4 v2, 0x0
/* .line 243 */
/* new-instance v0, Lcom/adknowledge/superrewards/web/SRRequest$Command; */
final String v1 = "METHOD"; // const-string v1, "METHOD"
/* invoke-direct {v0, v1, v2}, Lcom/adknowledge/superrewards/web/SRRequest$Command;-><init>(Ljava/lang/String;I)V */
/* new-instance v0, Lcom/adknowledge/superrewards/web/SRRequest$Command; */
final String v1 = "PARAMS"; // const-string v1, "PARAMS"
/* invoke-direct {v0, v1, v3}, Lcom/adknowledge/superrewards/web/SRRequest$Command;-><init>(Ljava/lang/String;I)V */
/* new-instance v0, Lcom/adknowledge/superrewards/web/SRRequest$Command; */
final String v1 = "DEVICE"; // const-string v1, "DEVICE"
/* invoke-direct {v0, v1, v4}, Lcom/adknowledge/superrewards/web/SRRequest$Command;-><init>(Ljava/lang/String;I)V */
/* new-instance v0, Lcom/adknowledge/superrewards/web/SRRequest$Command; */
final String v1 = "RESPONSE"; // const-string v1, "RESPONSE"
/* invoke-direct {v0, v1, v5}, Lcom/adknowledge/superrewards/web/SRRequest$Command;-><init>(Ljava/lang/String;I)V */
/* new-instance v0, Lcom/adknowledge/superrewards/web/SRRequest$Command; */
final String v1 = "GEO"; // const-string v1, "GEO"
/* invoke-direct {v0, v1, v6}, Lcom/adknowledge/superrewards/web/SRRequest$Command;-><init>(Ljava/lang/String;I)V */
/* .line 242 */
int v0 = 5; // const/4 v0, 0x5
/* new-array v0, v0, [Lcom/adknowledge/superrewards/web/SRRequest$Command; */
v1 = com.adknowledge.superrewards.web.SRRequest$Command.METHOD;
/* aput-object v1, v0, v2 */
v1 = com.adknowledge.superrewards.web.SRRequest$Command.PARAMS;
/* aput-object v1, v0, v3 */
v1 = com.adknowledge.superrewards.web.SRRequest$Command.DEVICE;
/* aput-object v1, v0, v4 */
v1 = com.adknowledge.superrewards.web.SRRequest$Command.RESPONSE;
/* aput-object v1, v0, v5 */
v1 = com.adknowledge.superrewards.web.SRRequest$Command.GEO;
/* aput-object v1, v0, v6 */
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
/* .line 242 */
/* invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V */
return;
} // .end method
public static com.adknowledge.superrewards.web.SRRequest$Command valueOf ( java.lang.String p0 ) {
/* .locals 1 */
/* .param p0, "name" # Ljava/lang/String; */
/* .prologue */
/* .line 242 */
/* const-class v0, Lcom/adknowledge/superrewards/web/SRRequest$Command; */
java.lang.Enum .valueOf ( v0,p0 );
/* check-cast v0, Lcom/adknowledge/superrewards/web/SRRequest$Command; */
} // .end method
public static com.adknowledge.superrewards.web.SRRequest$Command values ( ) {
/* .locals 1 */
/* .prologue */
/* .line 242 */
v0 = com.adknowledge.superrewards.web.SRRequest$Command.$VALUES;
(( com.adknowledge.superrewards.web.SRRequest$Command ) v0 ).clone ( ); // invoke-virtual {v0}, [Lcom/adknowledge/superrewards/web/SRRequest$Command;->clone()Ljava/lang/Object;
/* check-cast v0, [Lcom/adknowledge/superrewards/web/SRRequest$Command; */
} // .end method
