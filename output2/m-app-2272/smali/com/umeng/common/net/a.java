public class com.umeng.common.net.a {
	 /* .source "DownloadAgent.java" */
	 /* # annotations */
	 /* .annotation system Ldalvik/annotation/MemberClasses; */
	 /* value = { */
	 /* Lcom/umeng/common/net/a$a;, */
	 /* Lcom/umeng/common/net/a$b; */
	 /* } */
} // .end annotation
/* # static fields */
private static final java.lang.String b;
/* # instance fields */
final android.os.Messenger a;
private android.content.Context c;
private com.umeng.common.net.l d;
private android.os.Messenger e;
private java.lang.String f;
private java.lang.String g;
private java.lang.String h;
private java.lang.String i;
private java.lang.String j;
private java.lang.String k;
private Boolean l;
private android.content.ServiceConnection m;
/* # direct methods */
static com.umeng.common.net.a ( ) {
	 /* .locals 1 */
	 /* .prologue */
	 /* .line 27 */
	 /* const-class v0, Lcom/umeng/common/net/a; */
	 (( java.lang.Class ) v0 ).getName ( ); // invoke-virtual {v0}, Ljava/lang/Class;->getName()Ljava/lang/String;
	 return;
} // .end method
public com.umeng.common.net.a ( ) {
	 /* .locals 2 */
	 /* .prologue */
	 /* .line 180 */
	 /* invoke-direct {p0}, Ljava/lang/Object;-><init>()V */
	 /* .line 44 */
	 int v0 = 0; // const/4 v0, 0x0
	 /* iput-boolean v0, p0, Lcom/umeng/common/net/a;->l:Z */
	 /* .line 71 */
	 /* new-instance v0, Landroid/os/Messenger; */
	 /* new-instance v1, Lcom/umeng/common/net/a$b; */
	 /* invoke-direct {v1, p0}, Lcom/umeng/common/net/a$b;-><init>(Lcom/umeng/common/net/a;)V */
	 /* invoke-direct {v0, v1}, Landroid/os/Messenger;-><init>(Landroid/os/Handler;)V */
	 this.a = v0;
	 /* .line 134 */
	 /* new-instance v0, Lcom/umeng/common/net/b; */
	 /* invoke-direct {v0, p0}, Lcom/umeng/common/net/b;-><init>(Lcom/umeng/common/net/a;)V */
	 this.m = v0;
	 /* .line 182 */
	 (( android.content.Context ) p1 ).getApplicationContext ( ); // invoke-virtual {p1}, Landroid/content/Context;->getApplicationContext()Landroid/content/Context;
	 this.c = v0;
	 /* .line 184 */
	 this.f = p2;
	 /* .line 185 */
	 this.g = p3;
	 /* .line 186 */
	 this.h = p4;
	 /* .line 187 */
	 this.d = p5;
	 /* .line 188 */
	 return;
} // .end method
static java.lang.String a ( Object p0 ) { //synthethic
	 /* .locals 1 */
	 /* .prologue */
	 /* .line 32 */
	 v0 = this.f;
} // .end method
static void a ( Object p0, android.os.Messenger p1 ) { //synthethic
	 /* .locals 0 */
	 /* .prologue */
	 /* .line 31 */
	 this.e = p1;
	 return;
} // .end method
static java.lang.String b ( ) { //synthethic
	 /* .locals 1 */
	 /* .prologue */
	 /* .line 27 */
	 v0 = com.umeng.common.net.a.b;
} // .end method
static java.lang.String b ( Object p0 ) { //synthethic
	 /* .locals 1 */
	 /* .prologue */
	 /* .line 33 */
	 v0 = this.g;
} // .end method
static java.lang.String c ( Object p0 ) { //synthethic
	 /* .locals 1 */
	 /* .prologue */
	 /* .line 34 */
	 v0 = this.h;
} // .end method
static java.lang.String d ( Object p0 ) { //synthethic
	 /* .locals 1 */
	 /* .prologue */
	 /* .line 35 */
	 v0 = this.i;
} // .end method
static java.lang.String e ( Object p0 ) { //synthethic
	 /* .locals 1 */
	 /* .prologue */
	 /* .line 36 */
	 v0 = this.j;
} // .end method
static java.lang.String f ( Object p0 ) { //synthethic
	 /* .locals 1 */
	 /* .prologue */
	 /* .line 42 */
	 v0 = this.k;
} // .end method
static Boolean g ( Object p0 ) { //synthethic
	 /* .locals 1 */
	 /* .prologue */
	 /* .line 44 */
	 /* iget-boolean v0, p0, Lcom/umeng/common/net/a;->l:Z */
} // .end method
static android.os.Messenger h ( Object p0 ) { //synthethic
	 /* .locals 1 */
	 /* .prologue */
	 /* .line 31 */
	 v0 = this.e;
} // .end method
static com.umeng.common.net.l i ( Object p0 ) { //synthethic
	 /* .locals 1 */
	 /* .prologue */
	 /* .line 29 */
	 v0 = this.d;
} // .end method
static android.content.Context j ( Object p0 ) { //synthethic
	 /* .locals 1 */
	 /* .prologue */
	 /* .line 28 */
	 v0 = this.c;
} // .end method
static android.content.ServiceConnection k ( Object p0 ) { //synthethic
	 /* .locals 1 */
	 /* .prologue */
	 /* .line 134 */
	 v0 = this.m;
} // .end method
/* # virtual methods */
public void a ( ) {
	 /* .locals 4 */
	 /* .prologue */
	 /* .line 191 */
	 /* new-instance v0, Landroid/content/Intent; */
	 v1 = this.c;
	 /* const-class v2, Lcom/umeng/common/net/DownloadingService; */
	 /* invoke-direct {v0, v1, v2}, Landroid/content/Intent;-><init>(Landroid/content/Context;Ljava/lang/Class;)V */
	 /* .line 192 */
	 v1 = this.c;
	 v2 = this.m;
	 int v3 = 1; // const/4 v3, 0x1
	 (( android.content.Context ) v1 ).bindService ( v0, v2, v3 ); // invoke-virtual {v1, v0, v2, v3}, Landroid/content/Context;->bindService(Landroid/content/Intent;Landroid/content/ServiceConnection;I)Z
	 /* .line 194 */
	 return;
} // .end method
public void a ( java.lang.String p0 ) {
	 /* .locals 0 */
	 /* .prologue */
	 /* .line 47 */
	 this.i = p1;
	 /* .line 48 */
	 return;
} // .end method
public void a ( Boolean p0 ) {
	 /* .locals 0 */
	 /* .prologue */
	 /* .line 68 */
	 /* iput-boolean p1, p0, Lcom/umeng/common/net/a;->l:Z */
	 /* .line 69 */
	 return;
} // .end method
public void a ( java.lang.String[] p0 ) {
	 /* .locals 0 */
	 /* .prologue */
	 /* .line 59 */
	 this.k = p1;
	 /* .line 60 */
	 return;
} // .end method
public void b ( java.lang.String p0 ) {
	 /* .locals 0 */
	 /* .prologue */
	 /* .line 51 */
	 this.j = p1;
	 /* .line 52 */
	 return;
} // .end method
