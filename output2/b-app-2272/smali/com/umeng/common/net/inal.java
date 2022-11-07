public class inal extends java.lang.Enum {
	 /* .source "ReportResponse.java" */
	 /* # annotations */
	 /* .annotation system Ldalvik/annotation/EnclosingClass; */
	 /* value = Lcom/umeng/common/net/p; */
} // .end annotation
/* .annotation system Ldalvik/annotation/InnerClass; */
/* accessFlags = 0x4019 */
/* name = "a" */
} // .end annotation
/* .annotation system Ldalvik/annotation/Signature; */
/* value = { */
/* "Ljava/lang/Enum", */
/* "<", */
/* "Lcom/umeng/common/net/p$a;", */
/* ">;" */
/* } */
} // .end annotation
/* # static fields */
public static final com.umeng.common.net.p$a a;
public static final com.umeng.common.net.p$a b;
private static final com.umeng.common.net.p$a c; //synthetic
/* # direct methods */
static inal ( ) {
/* .locals 4 */
/* .prologue */
int v3 = 1; // const/4 v3, 0x1
int v2 = 0; // const/4 v2, 0x0
/* .line 15 */
/* new-instance v0, Lcom/umeng/common/net/p$a; */
final String v1 = "SUCCESS"; // const-string v1, "SUCCESS"
/* invoke-direct {v0, v1, v2}, Lcom/umeng/common/net/p$a;-><init>(Ljava/lang/String;I)V */
/* new-instance v0, Lcom/umeng/common/net/p$a; */
final String v1 = "FAIL"; // const-string v1, "FAIL"
/* invoke-direct {v0, v1, v3}, Lcom/umeng/common/net/p$a;-><init>(Ljava/lang/String;I)V */
/* .line 14 */
int v0 = 2; // const/4 v0, 0x2
/* new-array v0, v0, [Lcom/umeng/common/net/p$a; */
v1 = com.umeng.common.net.p$a.a;
/* aput-object v1, v0, v2 */
v1 = com.umeng.common.net.p$a.b;
/* aput-object v1, v0, v3 */
return;
} // .end method
private inal ( ) {
/* .locals 0 */
/* .prologue */
/* .line 14 */
/* invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V */
return;
} // .end method
public static com.umeng.common.net.p$a valueOf ( java.lang.String p0 ) {
/* .locals 1 */
/* .prologue */
/* .line 1 */
/* const-class v0, Lcom/umeng/common/net/p$a; */
java.lang.Enum .valueOf ( v0,p0 );
/* check-cast v0, Lcom/umeng/common/net/p$a; */
} // .end method
public static com.umeng.common.net.p$a values ( ) {
/* .locals 4 */
/* .prologue */
int v3 = 0; // const/4 v3, 0x0
/* .line 1 */
v0 = com.umeng.common.net.p$a.c;
/* array-length v1, v0 */
/* new-array v2, v1, [Lcom/umeng/common/net/p$a; */
java.lang.System .arraycopy ( v0,v3,v2,v3,v1 );
} // .end method
