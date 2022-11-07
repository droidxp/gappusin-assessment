public class inal extends java.lang.Enum {
	 /* .source "SRRequest.java" */
	 /* # annotations */
	 /* .annotation system Ldalvik/annotation/EnclosingClass; */
	 /* value = Lcom/adknowledge/superrewards/web/SRRequest; */
} // .end annotation
/* .annotation system Ldalvik/annotation/InnerClass; */
/* accessFlags = 0x4019 */
/* name = "Call" */
} // .end annotation
/* .annotation system Ldalvik/annotation/Signature; */
/* value = { */
/* "Ljava/lang/Enum", */
/* "<", */
/* "Lcom/adknowledge/superrewards/web/SRRequest$Call;", */
/* ">;" */
/* } */
} // .end annotation
/* # static fields */
private static final com.adknowledge.superrewards.web.SRRequest$Call $VALUES; //synthetic
public static final com.adknowledge.superrewards.web.SRRequest$Call CHECK_POINTS;
public static final com.adknowledge.superrewards.web.SRRequest$Call CLICK;
public static final com.adknowledge.superrewards.web.SRRequest$Call GET_OFFERS;
public static final com.adknowledge.superrewards.web.SRRequest$Call GET_SUB;
public static final com.adknowledge.superrewards.web.SRRequest$Call INSTALL;
/* # direct methods */
static inal ( ) {
/* .locals 7 */
/* .prologue */
int v6 = 4; // const/4 v6, 0x4
int v5 = 3; // const/4 v5, 0x3
int v4 = 2; // const/4 v4, 0x2
int v3 = 1; // const/4 v3, 0x1
int v2 = 0; // const/4 v2, 0x0
/* .line 247 */
/* new-instance v0, Lcom/adknowledge/superrewards/web/SRRequest$Call; */
final String v1 = "GET_OFFERS"; // const-string v1, "GET_OFFERS"
/* invoke-direct {v0, v1, v2}, Lcom/adknowledge/superrewards/web/SRRequest$Call;-><init>(Ljava/lang/String;I)V */
/* new-instance v0, Lcom/adknowledge/superrewards/web/SRRequest$Call; */
final String v1 = "INSTALL"; // const-string v1, "INSTALL"
/* invoke-direct {v0, v1, v3}, Lcom/adknowledge/superrewards/web/SRRequest$Call;-><init>(Ljava/lang/String;I)V */
/* new-instance v0, Lcom/adknowledge/superrewards/web/SRRequest$Call; */
final String v1 = "CLICK"; // const-string v1, "CLICK"
/* invoke-direct {v0, v1, v4}, Lcom/adknowledge/superrewards/web/SRRequest$Call;-><init>(Ljava/lang/String;I)V */
/* new-instance v0, Lcom/adknowledge/superrewards/web/SRRequest$Call; */
final String v1 = "GET_SUB"; // const-string v1, "GET_SUB"
/* invoke-direct {v0, v1, v5}, Lcom/adknowledge/superrewards/web/SRRequest$Call;-><init>(Ljava/lang/String;I)V */
/* new-instance v0, Lcom/adknowledge/superrewards/web/SRRequest$Call; */
final String v1 = "CHECK_POINTS"; // const-string v1, "CHECK_POINTS"
/* invoke-direct {v0, v1, v6}, Lcom/adknowledge/superrewards/web/SRRequest$Call;-><init>(Ljava/lang/String;I)V */
/* .line 246 */
int v0 = 5; // const/4 v0, 0x5
/* new-array v0, v0, [Lcom/adknowledge/superrewards/web/SRRequest$Call; */
v1 = com.adknowledge.superrewards.web.SRRequest$Call.GET_OFFERS;
/* aput-object v1, v0, v2 */
v1 = com.adknowledge.superrewards.web.SRRequest$Call.INSTALL;
/* aput-object v1, v0, v3 */
v1 = com.adknowledge.superrewards.web.SRRequest$Call.CLICK;
/* aput-object v1, v0, v4 */
v1 = com.adknowledge.superrewards.web.SRRequest$Call.GET_SUB;
/* aput-object v1, v0, v5 */
v1 = com.adknowledge.superrewards.web.SRRequest$Call.CHECK_POINTS;
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
/* .line 246 */
/* invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V */
return;
} // .end method
public static com.adknowledge.superrewards.web.SRRequest$Call valueOf ( java.lang.String p0 ) {
/* .locals 1 */
/* .param p0, "name" # Ljava/lang/String; */
/* .prologue */
/* .line 246 */
/* const-class v0, Lcom/adknowledge/superrewards/web/SRRequest$Call; */
java.lang.Enum .valueOf ( v0,p0 );
/* check-cast v0, Lcom/adknowledge/superrewards/web/SRRequest$Call; */
} // .end method
public static com.adknowledge.superrewards.web.SRRequest$Call values ( ) {
/* .locals 1 */
/* .prologue */
/* .line 246 */
v0 = com.adknowledge.superrewards.web.SRRequest$Call.$VALUES;
(( com.adknowledge.superrewards.web.SRRequest$Call ) v0 ).clone ( ); // invoke-virtual {v0}, [Lcom/adknowledge/superrewards/web/SRRequest$Call;->clone()Ljava/lang/Object;
/* check-cast v0, [Lcom/adknowledge/superrewards/web/SRRequest$Call; */
} // .end method
