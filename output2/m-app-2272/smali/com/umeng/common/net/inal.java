public class inal extends java.lang.Enum {
	 /* .source "ResUtil.java" */
	 /* # annotations */
	 /* .annotation system Ldalvik/annotation/EnclosingClass; */
	 /* value = Lcom/umeng/common/net/q; */
} // .end annotation
/* .annotation system Ldalvik/annotation/InnerClass; */
/* accessFlags = 0x4019 */
/* name = "b" */
} // .end annotation
/* .annotation system Ldalvik/annotation/Signature; */
/* value = { */
/* "Ljava/lang/Enum", */
/* "<", */
/* "Lcom/umeng/common/net/q$b;", */
/* ">;" */
/* } */
} // .end annotation
/* # static fields */
public static final com.umeng.common.net.q$b a;
public static final com.umeng.common.net.q$b b;
private static final com.umeng.common.net.q$b c; //synthetic
/* # direct methods */
static inal ( ) {
/* .locals 4 */
/* .prologue */
int v3 = 1; // const/4 v3, 0x1
int v2 = 0; // const/4 v2, 0x0
/* .line 602 */
/* new-instance v0, Lcom/umeng/common/net/q$b; */
final String v1 = "BIND_FORM_CACHE"; // const-string v1, "BIND_FORM_CACHE"
/* invoke-direct {v0, v1, v2}, Lcom/umeng/common/net/q$b;-><init>(Ljava/lang/String;I)V */
/* new-instance v0, Lcom/umeng/common/net/q$b; */
final String v1 = "BIND_FROM_NET"; // const-string v1, "BIND_FROM_NET"
/* invoke-direct {v0, v1, v3}, Lcom/umeng/common/net/q$b;-><init>(Ljava/lang/String;I)V */
/* .line 601 */
int v0 = 2; // const/4 v0, 0x2
/* new-array v0, v0, [Lcom/umeng/common/net/q$b; */
v1 = com.umeng.common.net.q$b.a;
/* aput-object v1, v0, v2 */
v1 = com.umeng.common.net.q$b.b;
/* aput-object v1, v0, v3 */
return;
} // .end method
private inal ( ) {
/* .locals 0 */
/* .prologue */
/* .line 601 */
/* invoke-direct {p0, p1, p2}, Ljava/lang/Enum;-><init>(Ljava/lang/String;I)V */
return;
} // .end method
public static com.umeng.common.net.q$b valueOf ( java.lang.String p0 ) {
/* .locals 1 */
/* .prologue */
/* .line 1 */
/* const-class v0, Lcom/umeng/common/net/q$b; */
java.lang.Enum .valueOf ( v0,p0 );
/* check-cast v0, Lcom/umeng/common/net/q$b; */
} // .end method
public static com.umeng.common.net.q$b values ( ) {
/* .locals 4 */
/* .prologue */
int v3 = 0; // const/4 v3, 0x0
/* .line 1 */
v0 = com.umeng.common.net.q$b.c;
/* array-length v1, v0 */
/* new-array v2, v1, [Lcom/umeng/common/net/q$b; */
java.lang.System .arraycopy ( v0,v3,v2,v3,v1 );
} // .end method
